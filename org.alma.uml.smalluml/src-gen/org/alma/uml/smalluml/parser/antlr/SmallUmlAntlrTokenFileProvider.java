/*
 * generated by Xtext 2.10.0
 */
package org.alma.uml.smalluml.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SmallUmlAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/alma/uml/smalluml/parser/antlr/internal/InternalSmallUml.tokens");
	}
}
