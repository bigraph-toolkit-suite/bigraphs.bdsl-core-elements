package de.tudresden.inf.st.bigraphs.dsl.udf;

import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractNamedSignatureElement;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLDocument;

/**
 * @author Dominik Grzelak
 */
public interface ToNamedElementWithSigFunction extends BDSLUserDefinedFunction<BDSLDocument, AbstractNamedSignatureElement> {

    @Override
    AbstractNamedSignatureElement apply(BDSLDocument bdslDocument);
}
