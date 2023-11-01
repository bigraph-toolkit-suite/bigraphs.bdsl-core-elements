package org.bigraphs.dsl.udf;

/**
 * @author Dominik Grzelak
 */
public interface ToVoidNoArgsFunction extends BDSLUserDefinedConsumer<Void> {

    @Override
    void accept(Void unused);
}

