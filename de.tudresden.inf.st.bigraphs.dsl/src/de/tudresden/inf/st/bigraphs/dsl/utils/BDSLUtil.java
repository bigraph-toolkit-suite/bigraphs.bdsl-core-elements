package de.tudresden.inf.st.bigraphs.dsl.utils;

import java.util.Objects;

import com.google.common.base.Preconditions;

import de.tudresden.inf.st.bigraphs.dsl.bDSL.AbstractBigraphDeclaration;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.BigraphVarReference;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.DataSource;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LoadMethod;
import de.tudresden.inf.st.bigraphs.dsl.bDSL.LocalVarDecl;

/*
 * 
 * @author Dominik Grzelak
 */
public class BDSLUtil {

	@Deprecated
	public static LocalVarDecl getLocalVarDeclFromLoadMethod(LoadMethod loadMethod) {
		return null;
//		Preconditions.checkArgument(Objects.nonNull(loadMethod), "LoadMethod must not be null");
////		Preconditions.checkArgument(AbstractBigraphDeclaration.class.isAssignableFrom(loadMethod.getReference().getClass()));
//		LocalVarDecl tmp = null;
//		
//		if (loadMethod.getReference() instanceof BigraphVarReference) {
//			tmp = ((BigraphVarReference) loadMethod.getReference()).getValue();
//		} else if (loadMethod.getReference() instanceof LocalVarDecl) {
//			tmp = (LocalVarDecl) loadMethod.getReference();
//		}
//		return tmp;
	}
	
	public static class Strings {
	    public static String rawStringOf(String value) {
	    	if(Objects.isNull(value)) return null;
	        boolean firstPos = value.charAt(0) == '\"' || value.charAt(0) == '\'';
	        boolean lastPos = value.charAt(value.length() - 1) == '\"' || value.charAt(value.length() - 1) == '\'';
	        if (firstPos && lastPos) {
	            return value.substring(1, value.length() - 1);
	        }
	        return value;
	    }
	}

	public static class Resources {
		public static DataSource getDataSourceFromIdentifier(String resourcePath) {
			if (Objects.nonNull(resourcePath) && !resourcePath.isEmpty()) {
				if (resourcePath.startsWith("classpath:")) {
					return DataSource.CLASSPATH;
				}
				if (resourcePath.startsWith("cdo:")) {
					return DataSource.DB;
				}
				if (resourcePath.startsWith("file:")) {
					return DataSource.LOCAL_FILE;
				}
			}
			return DataSource.UNSPECIFIED;
		}
	}
}
