package de.tudresden.inf.st.bigraphs.dsl.udf;

import java.util.function.Function;

/**
 * @author Dominik Grzelak
 */
public interface BDSLUserDefinedFunction<T, R> extends Function<T, R> {

    @Override
    R apply(T t);
}

