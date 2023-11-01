package org.bigraphs.dsl.udf;

import org.bigraphs.dsl.bDSL.UDFArgumentTypes;

public interface ToBooleanFunction extends BDSLUserDefinedFunction<Boolean> {

	@Override
	Boolean apply(UDFArgumentTypes bdslDocument);
}
