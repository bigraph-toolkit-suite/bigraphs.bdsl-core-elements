/**
 * generated by Xtext 2.32.0
 */
package org.bigraphs.dsl.bDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.dsl.bDSL.LocalVarDecl#getSiteArgs <em>Site Args</em>}</li>
 *   <li>{@link org.bigraphs.dsl.bDSL.LocalVarDecl#getControlType <em>Control Type</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.dsl.bDSL.BDSLPackage#getLocalVarDecl()
 * @model
 * @generated
 */
public interface LocalVarDecl extends AbstractNamedSignatureElement, BDSLBigraphDefinition, AbstractBigraphDeclaration, BigraphVarDeclOrReference
{
  /**
   * Returns the value of the '<em><b>Site Args</b></em>' containment reference list.
   * The list contents are of type {@link org.bigraphs.dsl.bDSL.SiteVars}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Site Args</em>' containment reference list.
   * @see org.bigraphs.dsl.bDSL.BDSLPackage#getLocalVarDecl_SiteArgs()
   * @model containment="true"
   * @generated
   */
  EList<SiteVars> getSiteArgs();

  /**
   * Returns the value of the '<em><b>Control Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Type</em>' reference.
   * @see #setControlType(ControlVariable)
   * @see org.bigraphs.dsl.bDSL.BDSLPackage#getLocalVarDecl_ControlType()
   * @model
   * @generated
   */
  ControlVariable getControlType();

  /**
   * Sets the value of the '{@link org.bigraphs.dsl.bDSL.LocalVarDecl#getControlType <em>Control Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control Type</em>' reference.
   * @see #getControlType()
   * @generated
   */
  void setControlType(ControlVariable value);

} // LocalVarDecl