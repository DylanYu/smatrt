/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the "License").  You may not use this file except
 * in compliance with the License.
 *
 * You can obtain a copy of the license at
 * https://jaxp.dev.java.net/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * HEADER in each file and include the License file at
 * https://jaxp.dev.java.net/CDDLv1.0.html
 * If applicable add the following below this CDDL HEADER
 * with the fields enclosed by brackets "[]" replaced with
 * your own identifying information: Portions Copyright
 * [year] [name of copyright owner]
 */

/*
 * $Id: FactoryFinder.java,v 1.4 2006/07/13 18:42:21 spericas Exp $
 * @(#)FactoryFinder.java	1.11 06/07/13
 *
 * Copyright 2005 Sun Microsystems, Inc. All Rights Reserved.
 */

package javaxx.xml.datatype;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.Properties;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * <p>Implements pluggable Datatypes.</p>
 * 
 * <p>This class is duplicated for each JAXP subpackage so keep it in
 * sync.  It is package private for secure class loading.</p>
 *
 * @author Santiago.PericasGeertsen@sun.com
 */
class FactoryFinder {
    
    /**
     * Internal debug flag.
     */
    private static boolean debug = false;
    
    /**
     * Cache for properties in java.home/lib/jaxp.properties
     */
    static Properties cacheProps = new Properties();
    
    /**
     * Flag indicating if properties from java.home/lib/jaxp.properties 
     * have been cached.
     */
    static boolean firstTime = true;
    
    /**
     * Security support class use to check access control before
     * getting certain system resources.
     */
    static SecuritySupport ss = new SecuritySupport();

    // Define system property "jaxp.debug" to get output
    static {
        // Use try/catch block to support applets, which throws
        // SecurityException out of this code.
        try {
            String val = ss.getSystemProperty("jaxp.debug");
            // Allow simply setting the prop to turn on debug
            debug = val != null && !"false".equals(val);
        } 
        catch (SecurityException se) {
            debug = false;
        }
    }
    
    private static void dPrint(String msg) {
        if (debug) {
            System.err.println("JAXP: " + msg);
        }
    }
    
    /**
     * Attempt to load a class using the class loader supplied. If that fails
     * and fall back is enabled, the current (i.e. bootstrap) class loader is
     * tried. 
     * 
     * If the class loader supplied is <code>null</code>, first try using the
     * context class loader followed by the current (i.e. bootstrap) class
     * loader. 
     */
    static private Class getProviderClass(String className, ClassLoader cl,
            boolean doFallback) throws ClassNotFoundException 
    {
        try {
            if (cl == null) {
                cl = ss.getContextClassLoader();
                if (cl == null) {
                    throw new ClassNotFoundException();
                }
                else {
                    return cl.loadClass(className);
                }
            } 
            else {
                return cl.loadClass(className);
            }
        }
        catch (ClassNotFoundException e1) {
            if (doFallback) {
                // Use current class loader - should always be bootstrap CL
                return Class.forName(className, true, FactoryFinder.class.getClassLoader());
            } 
            else {
                throw e1;
            }
        }    
    }
    
    /**
     * Create an instance of a class. Delegates to method 
     * <code>getProviderClass()</code> in order to load the class.
     *
     * @param className Name of the concrete class corresponding to the
     * service provider
     *
     * @param cl ClassLoader to use to load the class, null means to use
     * the bootstrap ClassLoader
     *
     * @param doFallback True if the current ClassLoader should be tried as
     * a fallback if the class is not found using cl
     */    
    static Object newInstance(String className, ClassLoader cl, boolean doFallback)
        throws ConfigurationError
    {
        try {
            Class providerClass = getProviderClass(className, cl, doFallback);                        
            Object instance = providerClass.newInstance();
            dPrint("created new instance of " + providerClass +
                   " using ClassLoader: " + cl);
            return instance;
        } 
        catch (ClassNotFoundException x) {
            throw new ConfigurationError(
                "Provider " + className + " not found", x);
        } 
        catch (Exception x) {
            throw new ConfigurationError(
                "Provider " + className + " could not be instantiated: " + x,
                x);
        }
    }
    
    /**
     * Finds the implementation Class object in the specified order.  Main
     * entry point.
     * @return Class object of factory, never null
     *
     * @param factoryId             Name of the factory to find, same as
     *                              a property name
     * @param fallbackClassName     Implementation class name, if nothing else
     *                              is found.  Use null to mean no fallback.
     *
     * Package private so this code can be shared.
     */
    static Object find(String factoryId, String fallbackClassName)
        throws ConfigurationError
    {        
        dPrint("find factoryId =" + factoryId);
        
        // Use the system property first
        try {
            String systemProp = ss.getSystemProperty(factoryId);
            if (systemProp != null) {                
                dPrint("found system property, value=" + systemProp);
                return newInstance(systemProp, null, true);
            }
        } 
        catch (SecurityException se) {
            if (debug) se.printStackTrace();
        }

        // try to read from $java.home/lib/jaxp.properties
        try {
            String factoryClassName = null;
            if (firstTime) {
                synchronized (cacheProps) {
                    if (firstTime) {
                        String configFile = ss.getSystemProperty("java.home") + File.separator +
                            "lib" + File.separator + "jaxp.properties";
                        File f = new File(configFile);
                        firstTime = false;
                        if (ss.doesFileExist(f)) {
                            dPrint("Read properties file "+f);
                            cacheProps.load(ss.getFileInputStream(f));
                        }
                    }
                }
            }
            factoryClassName = cacheProps.getProperty(factoryId);            

            if (factoryClassName != null) {
                dPrint("found in $java.home/jaxp.properties, value=" + factoryClassName);
                return newInstance(factoryClassName, null, true);
            }
        } 
        catch (Exception ex) {
            if (debug) ex.printStackTrace();
        }

        // Try Jar Service Provider Mechanism
        Object provider = findJarServiceProvider(factoryId);
        if (provider != null) {
            return provider;
        }
        if (fallbackClassName == null) {
            throw new ConfigurationError(
                "Provider for " + factoryId + " cannot be found", null);
        }

        dPrint("loaded from fallback value: " + fallbackClassName);
        return newInstance(fallbackClassName, null, true);
    }
    
    /*
     * Try to find provider using Jar Service Provider Mechanism
     *
     * @return instance of provider class if found or null
     */
    private static Object findJarServiceProvider(String factoryId)
        throws ConfigurationError 
    {
        String serviceId = "META-INF/services/" + factoryId;
        InputStream is = null;
        
        // First try the Context ClassLoader
        ClassLoader cl = ss.getContextClassLoader();
        if (cl != null) {
            is = ss.getResourceAsStream(cl, serviceId);
            
            // If no provider found then try the current ClassLoader
            if (is == null) {
                cl = FactoryFinder.class.getClassLoader();                
                is = ss.getResourceAsStream(cl, serviceId);
            }
        } else {
            // No Context ClassLoader, try the current ClassLoader
            cl = FactoryFinder.class.getClassLoader();
            is = ss.getResourceAsStream(cl, serviceId);
        }
        
        if (is == null) {
            // No provider found
            return null;
        }
        
        dPrint("found jar resource=" + serviceId + " using ClassLoader: " + cl);
        
        BufferedReader rd;
        try {
            rd = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        } 
        catch (java.io.UnsupportedEncodingException e) {
            rd = new BufferedReader(new InputStreamReader(is));
        }
        
        String factoryClassName = null;
        try {
            // XXX Does not handle all possible input as specified by the
            // Jar Service Provider specification
            factoryClassName = rd.readLine();
            rd.close();
        } catch (IOException x) {
            // No provider found
            return null;
        }
        
        if (factoryClassName != null && !"".equals(factoryClassName)) {
            dPrint("found in resource, value=" + factoryClassName);
            
            // Note: here we do not want to fall back to the current
            // ClassLoader because we want to avoid the case where the
            // resource file was found using one ClassLoader and the
            // provider class was instantiated using a different one.
            return newInstance(factoryClassName, cl, false);
        }
        
        // No provider found
        return null;
    }
    
    static class ConfigurationError extends Error {
        private Exception exception;
        
        /**
         * Construct a new instance with the specified detail string and
         * exception.
         */
        ConfigurationError(String msg, Exception x) {
            super(msg);
            this.exception = x;
        }
        
        Exception getException() {
            return exception;
        }
    }
    
}
