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
 * A representation of the literals of the enumeration '<em><b>Data Sink</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bigraphs.dsl.bDSL.BDSLPackage#getDataSink()
 * @model
 * @generated
 */
public enum DataSink implements Enumerator
{
  /**
   * The '<em><b>STDOUT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STDOUT_VALUE
   * @generated
   * @ordered
   */
  STDOUT(0, "STDOUT", "console"),

  /**
   * The '<em><b>LOCAL FILE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOCAL_FILE_VALUE
   * @generated
   * @ordered
   */
  LOCAL_FILE(1, "LOCAL_FILE", "file"),

  /**
   * The '<em><b>DB</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DB_VALUE
   * @generated
   * @ordered
   */
  DB(2, "DB", "cdo");

  /**
   * The '<em><b>STDOUT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STDOUT
   * @model literal="console"
   * @generated
   * @ordered
   */
  public static final int STDOUT_VALUE = 0;

  /**
   * The '<em><b>LOCAL FILE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOCAL_FILE
   * @model literal="file"
   * @generated
   * @ordered
   */
  public static final int LOCAL_FILE_VALUE = 1;

  /**
   * The '<em><b>DB</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DB
   * @model literal="cdo"
   * @generated
   * @ordered
   */
  public static final int DB_VALUE = 2;

  /**
   * An array of all the '<em><b>Data Sink</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DataSink[] VALUES_ARRAY =
    new DataSink[]
    {
      STDOUT,
      LOCAL_FILE,
      DB,
    };

  /**
   * A public read-only list of all the '<em><b>Data Sink</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DataSink> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Data Sink</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DataSink get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DataSink result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Data Sink</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DataSink getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DataSink result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Data Sink</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DataSink get(int value)
  {
    switch (value)
    {
      case STDOUT_VALUE: return STDOUT;
      case LOCAL_FILE_VALUE: return LOCAL_FILE;
      case DB_VALUE: return DB;
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
  private DataSink(int value, String name, String literal)
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
  
} //DataSink