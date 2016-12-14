/*
 * generated by Xtext 2.10.0
 */
package org.alma.uml.smalluml.ui;

import com.google.inject.Injector;
import org.alma.uml.smalluml.ui.internal.SmallumlActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SmallUmlExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SmallumlActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SmallumlActivator.getInstance().getInjector(SmallumlActivator.ORG_ALMA_UML_SMALLUML_SMALLUML);
	}
	
}
