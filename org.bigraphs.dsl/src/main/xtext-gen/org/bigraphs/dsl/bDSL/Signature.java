/**
 * generated by Xtext 2.32.0
 */
package org.bigraphs.dsl.bDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.dsl.bDSL.Signature#getName <em>Name</em>}</li>
 *   <li>{@link org.bigraphs.dsl.bDSL.Signature#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.dsl.bDSL.BDSLPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.bigraphs.dsl.bDSL.BDSLPackage#getSignature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.bigraphs.dsl.bDSL.Signature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
   * The list contents are of type {@link org.bigraphs.dsl.bDSL.ControlVariable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controls</em>' containment reference list.
   * @see org.bigraphs.dsl.bDSL.BDSLPackage#getSignature_Controls()
   * @model containment="true"
   * @generated
   */
  EList<ControlVariable> getControls();

} // Signature
