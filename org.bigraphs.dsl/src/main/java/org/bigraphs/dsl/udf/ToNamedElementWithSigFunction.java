package org.bigraphs.dsl.udf;

import org.bigraphs.dsl.bDSL.AbstractNamedSignatureElement;
import org.bigraphs.dsl.bDSL.UDFArgumentTypes;

/**
 * @author Dominik Grzelak
 */
public interface ToNamedElementWithSigFunction extends BDSLUserDefinedFunction<AbstractNamedSignatureElement> {

    @Override
    AbstractNamedSignatureElement apply(UDFArgumentTypes bdslDocument);
}
