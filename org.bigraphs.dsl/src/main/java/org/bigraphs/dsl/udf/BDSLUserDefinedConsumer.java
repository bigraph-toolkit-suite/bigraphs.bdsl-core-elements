package org.bigraphs.dsl.udf;

import java.util.function.Consumer;

/**
 * @author Dominik Grzelak
 */
public interface BDSLUserDefinedConsumer<T> extends Consumer<T> {
    @Override
    void accept(T t);
}
