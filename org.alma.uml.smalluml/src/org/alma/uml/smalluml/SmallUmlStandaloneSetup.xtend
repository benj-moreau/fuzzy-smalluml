/*
 * generated by Xtext 2.10.0
 */
package org.alma.uml.smalluml


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SmallUmlStandaloneSetup extends SmallUmlStandaloneSetupGenerated {

	def static void doSetup() {
		new SmallUmlStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
