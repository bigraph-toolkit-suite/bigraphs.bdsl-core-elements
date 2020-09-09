package de.tudresden.inf.st.bigraphs.dsl.udf;

import de.tudresden.inf.st.bigraphs.dsl.bDSL.UDFArgumentTypes;

public interface ToBooleanFunction extends BDSLUserDefinedFunction<Boolean> {

	@Override
	Boolean apply(UDFArgumentTypes bdslDocument);
}
