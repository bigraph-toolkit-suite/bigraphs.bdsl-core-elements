/**
 * generated by Xtext 2.21.0
 */
package de.tudresden.inf.st.bigraphs.dsl.bDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlVariable#getType <em>Type</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlVariable#getName <em>Name</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlVariable#getArity <em>Arity</em>}</li>
 * </ul>
 *
 * @see de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLPackage#getControlVariable()
 * @model
 * @generated
 */
public interface ControlVariable extends ControlDef
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlType
   * @see #setType(ControlType)
   * @see de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLPackage#getControlVariable_Type()
   * @model
   * @generated
   */
  ControlType getType();

  /**
   * Sets the value of the '{@link de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlVariable#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlType
   * @see #getType()
   * @generated
   */
  void setType(ControlType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLPackage#getControlVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlVariable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arity</em>' containment reference.
   * @see #setArity(EInt)
   * @see de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLPackage#getControlVariable_Arity()
   * @model containment="true"
   * @generated
   */
  EInt getArity();

  /**
   * Sets the value of the '{@link de.tudresden.inf.st.bigraphs.dsl.bDSL.ControlVariable#getArity <em>Arity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arity</em>' containment reference.
   * @see #getArity()
   * @generated
   */
  void setArity(EInt value);

} // ControlVariable
