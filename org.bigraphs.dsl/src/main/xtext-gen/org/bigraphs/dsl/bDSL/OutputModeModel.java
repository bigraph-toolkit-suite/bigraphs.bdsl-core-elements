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
 * A representation of the literals of the enumeration '<em><b>Output Mode Model</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bigraphs.dsl.bDSL.BDSLPackage#getOutputModeModel()
 * @model
 * @generated
 */
public enum OutputModeModel implements Enumerator
{
  /**
   * The '<em><b>INSTANCE MODEL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INSTANCE_MODEL_VALUE
   * @generated
   * @ordered
   */
  INSTANCE_MODEL(0, "INSTANCE_MODEL", "xmi"),

  /**
   * The '<em><b>META MODEL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #META_MODEL_VALUE
   * @generated
   * @ordered
   */
  META_MODEL(1, "META_MODEL", "ecore");

  /**
   * The '<em><b>INSTANCE MODEL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INSTANCE_MODEL
   * @model literal="xmi"
   * @generated
   * @ordered
   */
  public static final int INSTANCE_MODEL_VALUE = 0;

  /**
   * The '<em><b>META MODEL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #META_MODEL
   * @model literal="ecore"
   * @generated
   * @ordered
   */
  public static final int META_MODEL_VALUE = 1;

  /**
   * An array of all the '<em><b>Output Mode Model</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OutputModeModel[] VALUES_ARRAY =
    new OutputModeModel[]
    {
      INSTANCE_MODEL,
      META_MODEL,
    };

  /**
   * A public read-only list of all the '<em><b>Output Mode Model</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OutputModeModel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Output Mode Model</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static OutputModeModel get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OutputModeModel result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Output Mode Model</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static OutputModeModel getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OutputModeModel result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Output Mode Model</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static OutputModeModel get(int value)
  {
    switch (value)
    {
      case INSTANCE_MODEL_VALUE: return INSTANCE_MODEL;
      case META_MODEL_VALUE: return META_MODEL;
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
  private OutputModeModel(int value, String name, String literal)
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
  
} //OutputModeModel
