package org.cakelab.json;

import java.util.HashMap;
import java.util.Iterator;

import org.cakelab.json.codec.JSONCodec;
import org.cakelab.json.codec.JSONStringFormatter;

public class JSONObject extends HashMap<String, Object> implements JSONCompoundType {
	private static final long serialVersionUID = 1L;


	public static void appendValue(JSONStringFormatter s, Object o) {
		if (o == null) {
			s.append("null");
		} else if (o instanceof String) {
			s.append('\"');
			
			s.appendUnicodeString((String)o);
			
			s.append('\"');
		} else if (o instanceof JSONArray) {
			((JSONArray)o).toString(s);
		} else if (o instanceof JSONObject) {
			((JSONObject)o).toString(s);
		} else {
			s.append(o);
		}
	}
	
	
	@Override
	public String toString() {
		return toString(JSONCodec.getDefaultStringFormatter());
	}
	
	
	public String toString(JSONStringFormatter s) {
		s.append("{");
		s.indentInc();
		s.appendNewLine();
		
		Iterator<java.util.Map.Entry<String, Object>> it = s.iterator(entrySet());
		
		if (it.hasNext()) {
			s.appendIndent();
			java.util.Map.Entry<String, Object> e = it.next();
			s.append('\"');
			s.append(e.getKey());
			s.append("\": ");
			appendValue(s, e.getValue());
			while (it.hasNext()) {
				e = it.next();
				s.append(", ");
				s.appendNewLine();
				s.appendIndent();
				s.append('\"');
				s.append(e.getKey());
				s.append("\": ");
				appendValue(s, e.getValue());
			}
			s.appendNewLine();
		}
		s.indentDec();
		s.appendIndent();
		s.append("}");
		return s.toString();
	}

	public double getDouble(String key) {
		Object o = get(key);
		return doublevalue(o);
	}

	public long getLong(String key) {
		Object o = get(key);
		return longvalue(o);
	}
	
	static double doublevalue(Object o) {
		if (o instanceof Long) {
			return (Long)o;
		} else {
			return (Double)o;
		}
	}

	static long longvalue(Object o) {
		if (o instanceof Long) {
			return (Long)o;
		} else {
			return ((Double)o).longValue();
		}

	}

	public String getString(String key) {
		return (String)get(key);
	}

}
