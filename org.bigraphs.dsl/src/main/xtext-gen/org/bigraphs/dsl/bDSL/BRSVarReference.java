/**
 * generated by Xtext 2.32.0
 */
package org.bigraphs.dsl.bDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BRS Var Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.dsl.bDSL.BRSVarReference#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.dsl.bDSL.BDSLPackage#getBRSVarReference()
 * @model
 * @generated
 */
public interface BRSVarReference extends BigraphBdslVarDeclOrReference, BDSLReferenceSymbol
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(BRSDefinition)
   * @see org.bigraphs.dsl.bDSL.BDSLPackage#getBRSVarReference_Value()
   * @model
   * @generated
   */
  BRSDefinition getValue();

  /**
   * Sets the value of the '{@link org.bigraphs.dsl.bDSL.BRSVarReference#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(BRSDefinition value);

} // BRSVarReference
