package org.cakelab.json;

import java.util.ArrayList;

import org.cakelab.json.codec.JSONCodec;
import org.cakelab.json.codec.JSONStringFormatter;


public class JSONArray extends ArrayList<Object>{

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return toString(JSONCodec.getDefaultStringFormatter());
	}
	
	public String toString(JSONStringFormatter s) {
			
		s.append("[");
		if (!isEmpty()) {
			s.appendNewLine();
			s.indentInc();
			int i = 0;
			s.appendIndent();
			JSONObject.appendValue(s, get(i));
			for (i = 1; i < size(); i++) {
				s.append(", ");
				s.appendNewLine();
				s.appendIndent();
				JSONObject.appendValue(s, get(i));
			}
			s.appendNewLine();
			s.indentDec();
			s.appendIndent();
		}
		s.append("]");
		return s.toString();
	}

	public double getDouble(int index) {
		return JSONObject.doublevalue(get(index));
	}

	public long getLong(int index) {
		return JSONObject.longvalue(get(index));
	}

	
}
