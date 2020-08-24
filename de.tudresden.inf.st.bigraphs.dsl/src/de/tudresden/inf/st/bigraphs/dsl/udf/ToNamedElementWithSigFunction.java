package de.tudresden.inf.st.bigraphs.dsl.udf;

import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractElementsWithNameAndSig;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLDocument;

/**
 * @author Dominik Grzelak
 */
public interface ToNamedElementWithSigFunction extends BDSLUserDefinedFunction<BDSLDocument, AbstractElementsWithNameAndSig> {

    @Override
    AbstractElementsWithNameAndSig apply(BDSLDocument bdslDocument);
}
