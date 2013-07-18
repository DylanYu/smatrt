/**
 * <copyright>
 * 
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: RealLiteralExpCS.java,v 1.1 2007/10/11 23:04:54 cdamus Exp $
 */
package org.eclipse.ocl.cst;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Literal Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.cst.RealLiteralExpCS#getRealSymbol <em>Real Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.cst.CSTPackage#getRealLiteralExpCS()
 * @model
 * @generated
 */
public interface RealLiteralExpCS extends PrimitiveLiteralExpCS {
	/**
     * Returns the value of the '<em><b>Real Symbol</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Real Symbol</em>' attribute.
     * @see #setRealSymbol(Double)
     * @see org.eclipse.ocl.cst.CSTPackage#getRealLiteralExpCS_RealSymbol()
     * @model
     * @generated
     */
	Double getRealSymbol();

	/**
     * Sets the value of the '{@link org.eclipse.ocl.cst.RealLiteralExpCS#getRealSymbol <em>Real Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Real Symbol</em>' attribute.
     * @see #getRealSymbol()
     * @generated
     */
	void setRealSymbol(Double value);

} // RealLiteralExpCS