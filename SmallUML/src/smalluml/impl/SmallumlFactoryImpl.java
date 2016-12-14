/**
 */
package smalluml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smalluml.Attribute;
import smalluml.Cardinality;
import smalluml.ConcreteType;
import smalluml.Enumeration;
import smalluml.EnumerationElement;
import smalluml.Method;
import smalluml.Relation;
import smalluml.SmallumlFactory;
import smalluml.SmallumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmallumlFactoryImpl extends EFactoryImpl implements SmallumlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmallumlFactory init() {
		try {
			SmallumlFactory theSmallumlFactory = (SmallumlFactory)EPackage.Registry.INSTANCE.getEFactory(SmallumlPackage.eNS_URI);
			if (theSmallumlFactory != null) {
				return theSmallumlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmallumlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallumlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SmallumlPackage.ENUMERATION: return createEnumeration();
			case SmallumlPackage.CLASS: return createClass();
			case SmallumlPackage.ATTRIBUTE: return createAttribute();
			case SmallumlPackage.METHOD: return createMethod();
			case SmallumlPackage.RELATION: return createRelation();
			case SmallumlPackage.CARDINALITY: return createCardinality();
			case SmallumlPackage.PACKAGE: return createPackage();
			case SmallumlPackage.ENUMERATION_ELEMENT: return createEnumerationElement();
			case SmallumlPackage.CONCRETE_TYPE: return createConcreteType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public smalluml.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinality() {
		CardinalityImpl cardinality = new CardinalityImpl();
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public smalluml.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationElement createEnumerationElement() {
		EnumerationElementImpl enumerationElement = new EnumerationElementImpl();
		return enumerationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteType createConcreteType() {
		ConcreteTypeImpl concreteType = new ConcreteTypeImpl();
		return concreteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallumlPackage getSmallumlPackage() {
		return (SmallumlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmallumlPackage getPackage() {
		return SmallumlPackage.eINSTANCE;
	}

} //SmallumlFactoryImpl
