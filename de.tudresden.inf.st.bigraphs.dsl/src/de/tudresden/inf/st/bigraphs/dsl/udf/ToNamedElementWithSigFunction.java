package de.tudresden.inf.st.bigraphs.dsl.udf;

import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractNamedSignatureElement;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.UDFArgumentTypes;

/**
 * @author Dominik Grzelak
 */
public interface ToNamedElementWithSigFunction extends BDSLUserDefinedFunction<AbstractNamedSignatureElement> {

    @Override
    AbstractNamedSignatureElement apply(UDFArgumentTypes bdslDocument);
}
