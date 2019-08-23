package org.cakelab.jdoxml.impl;

public class StringDecode {

	public static int toInt(String value, int defaultValue) {
		if (value != null) {
			return Integer.decode(value);
		}
		return defaultValue;
	}

}
