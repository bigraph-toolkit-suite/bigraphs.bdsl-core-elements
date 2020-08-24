package de.tudresden.inf.st.bigraphs.dsl.udf;

import de.tudresden.inf.st.bigraphs.dsl.bDSL.BDSLDocument;

public interface ToBooleanFunction extends BDSLUserDefinedFunction<BDSLDocument, Boolean> {

	@Override
	Boolean apply(BDSLDocument bdslDocument);
}
