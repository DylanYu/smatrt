/**
 * <copyright>
 * 
 * Copyright (c) 2007, 2008 IBM Corporation and others.
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
 * $Id: IteratorExpImpl.java,v 1.3 2008/03/28 20:33:40 cdamus Exp $
 */
package org.eclipse.ocl.ecore.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.ecore.EcorePackage;
import org.eclipse.ocl.ecore.IteratorExp;
import org.eclipse.ocl.expressions.operations.IteratorExpOperations;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterator Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IteratorExpImpl extends LoopExpImpl implements IteratorExp {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected IteratorExpImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return EcorePackage.Literals.ITERATOR_EXP;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean checkBooleanType(DiagnosticChain diagnostics, Map<Object, Object> context) {
        return IteratorExpOperations.checkBooleanType(this, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean checkCollectType(DiagnosticChain diagnostics, Map<Object, Object> context) {
        return IteratorExpOperations.checkCollectType(this, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean checkSelectRejectType(DiagnosticChain diagnostics, Map<Object, Object> context) {
        return IteratorExpOperations.checkSelectRejectType(this, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean checkBooleanBodyType(DiagnosticChain diagnostics, Map<Object, Object> context) {
        return IteratorExpOperations.checkBooleanBodyType(this, diagnostics, context);
    }

    /**
	 * @generated NOT
	 */
	@Override
    public <T, U extends Visitor<T, ?, ?, ?, ?, ?, ?, ?, ?, ?>> T accept(U v) {
		return v.visitIteratorExp((org.eclipse.ocl.expressions.IteratorExp)this);
	}

} //IteratorExpImpl
