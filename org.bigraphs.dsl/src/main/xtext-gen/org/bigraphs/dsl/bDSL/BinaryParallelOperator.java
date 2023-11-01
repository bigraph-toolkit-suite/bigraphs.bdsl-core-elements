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
 * A representation of the literals of the enumeration '<em><b>Binary Parallel Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bigraphs.dsl.bDSL.BDSLPackage#getBinaryParallelOperator()
 * @model
 * @generated
 */
public enum BinaryParallelOperator implements Enumerator
{
  /**
   * The '<em><b>UNSET</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNSET_VALUE
   * @generated
   * @ordered
   */
  UNSET(0, "UNSET", "UNSET"),

  /**
   * The '<em><b>MERGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MERGE_VALUE
   * @generated
   * @ordered
   */
  MERGE(1, "MERGE", "|"),

  /**
   * The '<em><b>PARALLEL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PARALLEL_VALUE
   * @generated
   * @ordered
   */
  PARALLEL(2, "PARALLEL", "||");

  /**
   * The '<em><b>UNSET</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNSET
   * @model
   * @generated
   * @ordered
   */
  public static final int UNSET_VALUE = 0;

  /**
   * The '<em><b>MERGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MERGE
   * @model literal="|"
   * @generated
   * @ordered
   */
  public static final int MERGE_VALUE = 1;

  /**
   * The '<em><b>PARALLEL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PARALLEL
   * @model literal="||"
   * @generated
   * @ordered
   */
  public static final int PARALLEL_VALUE = 2;

  /**
   * An array of all the '<em><b>Binary Parallel Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BinaryParallelOperator[] VALUES_ARRAY =
    new BinaryParallelOperator[]
    {
      UNSET,
      MERGE,
      PARALLEL,
    };

  /**
   * A public read-only list of all the '<em><b>Binary Parallel Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BinaryParallelOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Binary Parallel Operator</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BinaryParallelOperator get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BinaryParallelOperator result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Binary Parallel Operator</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BinaryParallelOperator getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BinaryParallelOperator result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Binary Parallel Operator</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BinaryParallelOperator get(int value)
  {
    switch (value)
    {
      case UNSET_VALUE: return UNSET;
      case MERGE_VALUE: return MERGE;
      case PARALLEL_VALUE: return PARALLEL;
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
  private BinaryParallelOperator(int value, String name, String literal)
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
  
} //BinaryParallelOperator