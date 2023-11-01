package org.bigraphs.dsl.udf;

import java.util.function.Function;

import org.bigraphs.dsl.bDSL.UDFArgumentTypes;

/**
 * @author Dominik Grzelak
 */
public interface BDSLUserDefinedFunction<R> extends Function<UDFArgumentTypes, R> {

    @Override
    R apply(UDFArgumentTypes t);
}

