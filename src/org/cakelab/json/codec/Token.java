package org.cakelab.json.codec;

public class Token {
	static final int TYPE_LEFTBRACE = '{';
	static final int TYPE_RIGHTBRACE = '}';
	static final int TYPE_COMMA = ',';
	static final int TYPE_COLON = ':';
	static final int TYPE_LEFTBRACKET = '[';
	static final int TYPE_RIGHTBRACKET = ']';
	static final int TYPE_DOUBLEQUOTES = '"';
	static final int TYPE_BACKSLASH = '\\';
	static final int TYPE_PLUS = '+';
	static final int TYPE_MINUS = '-';
	static final int TYPE_SLASH = '/';
	
	static final int TYPE_VALUE_TYPE_BASE = 1024;
	static final int TYPE_STRING = TYPE_VALUE_TYPE_BASE + 0;
	static final int TYPE_NUMBER = TYPE_VALUE_TYPE_BASE + 1;
	static final int TYPE_BOOLEAN = TYPE_VALUE_TYPE_BASE + 2;
	static final int TYPE_NULL = TYPE_VALUE_TYPE_BASE + 3;
	
	
	static final int TYPE_META_TYPE_BASE = 2048;
	
	static final int TYPE_NAME = TYPE_META_TYPE_BASE + 0;
	static final int TYPE_OBJECT = TYPE_META_TYPE_BASE + 4;
	static final int TYPE_ARRAY = TYPE_META_TYPE_BASE + 5;
	static final int TYPE_NAME_VALUE_PAIR = TYPE_META_TYPE_BASE + 6;
	
	
	
	
	
	static final int TYPE_UNKNOWN = Integer.MAX_VALUE;
	


	public static boolean isWhitespace(char c) {
		return (" \r\n\t\b\f".indexOf(c) >= 0);
	}


	public static boolean isDigit(char c) {
		return "0123456789".indexOf(c) >= 0;
	}
	
	public static boolean isHexDigit(char c) {
		return "0123456789abcdefABCDEF".indexOf(c) >= 0;
	}


	public static boolean isAlpha(char c) {
		c = Character.toLowerCase(c);
		return c >= 'a' && c <= 'z';
	}


	public static boolean isLegalNameElement(char c) {
		return c == '_';
	}


}
