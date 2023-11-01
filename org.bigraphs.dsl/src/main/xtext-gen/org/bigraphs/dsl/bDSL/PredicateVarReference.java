/**
 * generated by Xtext 2.32.0
 */
package org.bigraphs.dsl.bDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Var Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.dsl.bDSL.PredicateVarReference#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.dsl.bDSL.BDSLPackage#getPredicateVarReference()
 * @model
 * @generated
 */
public interface PredicateVarReference extends BigraphPredDeclOrReference, BDSLReferenceSymbol
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(LocalPredicateDeclaration)
   * @see org.bigraphs.dsl.bDSL.BDSLPackage#getPredicateVarReference_Value()
   * @model
   * @generated
   */
  LocalPredicateDeclaration getValue();

  /**
   * Sets the value of the '{@link org.bigraphs.dsl.bDSL.PredicateVarReference#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(LocalPredicateDeclaration value);

} // PredicateVarReference
