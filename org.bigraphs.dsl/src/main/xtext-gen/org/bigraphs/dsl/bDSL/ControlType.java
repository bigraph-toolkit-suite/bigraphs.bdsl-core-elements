/**
 * generated by Xtext 2.32.0
 */
package org.bigraphs.dsl.bDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bigraphs.dsl.bDSL.BDSLPackage#getControlType()
 * @model
 * @generated
 */
public enum ControlType implements Enumerator
{
  /**
   * The '<em><b>ACTIVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACTIVE_VALUE
   * @generated
   * @ordered
   */
  ACTIVE(0, "ACTIVE", "active"),

  /**
   * The '<em><b>ATOMIC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ATOMIC_VALUE
   * @generated
   * @ordered
   */
  ATOMIC(1, "ATOMIC", "atomic"),

  /**
   * The '<em><b>PASSIVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PASSIVE_VALUE
   * @generated
   * @ordered
   */
  PASSIVE(2, "PASSIVE", "passive");

  /**
   * The '<em><b>ACTIVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACTIVE
   * @model literal="active"
   * @generated
   * @ordered
   */
  public static final int ACTIVE_VALUE = 0;

  /**
   * The '<em><b>ATOMIC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ATOMIC
   * @model literal="atomic"
   * @generated
   * @ordered
   */
  public static final int ATOMIC_VALUE = 1;

  /**
   * The '<em><b>PASSIVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PASSIVE
   * @model literal="passive"
   * @generated
   * @ordered
   */
  public static final int PASSIVE_VALUE = 2;

  /**
   * An array of all the '<em><b>Control Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ControlType[] VALUES_ARRAY =
    new ControlType[]
    {
      ACTIVE,
      ATOMIC,
      PASSIVE,
    };

  /**
   * A public read-only list of all the '<em><b>Control Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ControlType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Control Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ControlType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ControlType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Control Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ControlType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ControlType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Control Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ControlType get(int value)
  {
    switch (value)
    {
      case ACTIVE_VALUE: return ACTIVE;
      case ATOMIC_VALUE: return ATOMIC;
      case PASSIVE_VALUE: return PASSIVE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ControlType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ControlType
