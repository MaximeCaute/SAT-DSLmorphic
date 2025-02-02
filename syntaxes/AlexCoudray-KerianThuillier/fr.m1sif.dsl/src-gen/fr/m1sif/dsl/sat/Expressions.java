/**
 * generated by Xtext 2.19.0
 */
package fr.m1sif.dsl.sat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expressions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.m1sif.dsl.sat.Expressions#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see fr.m1sif.dsl.sat.SatPackage#getExpressions()
 * @model
 * @generated
 */
public interface Expressions extends EObject
{
  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link fr.m1sif.dsl.sat.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see fr.m1sif.dsl.sat.SatPackage#getExpressions_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExprs();

} // Expressions
