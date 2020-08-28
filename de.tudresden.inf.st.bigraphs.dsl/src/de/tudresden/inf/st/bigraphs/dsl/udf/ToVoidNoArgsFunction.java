package de.tudresden.inf.st.bigraphs.dsl.udf;

/**
 * @author Dominik Grzelak
 */
public interface ToVoidNoArgsFunction extends BDSLUserDefinedConsumer<Void> {
    
    @Override
    void accept(Void unused);
}

