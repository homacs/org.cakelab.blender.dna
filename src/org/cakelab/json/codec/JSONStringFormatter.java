package org.cakelab.json.codec;

import java.util.Iterator;
import java.util.Set;

/**
 * An object implementing this interface is used during conversion of a JSONObject instance into a String.
 * The implementing string formatter can format the string output such as to add indenting.
 * 
 * @author homac
 *
 */
public interface JSONStringFormatter extends CharSequence {

	/** This is a factory method, called whenever a new formatter is requested. 
	 * This method is supposed to instantiate a new formatter with the 
	 * given configuration.
	 * @param format Configuration for the new formatter
	 * 
	 * @see org.cakelab.json.JSONCodec#getDefaultStringFormatter()
	 * @return new formatter with same configuration.
	 */
	JSONStringFormatter create(JSONStringFormatterConfiguration format);

	
	/** 
	 * Increment indent (e.g. start of a compound type).
	 */
	void indentInc();
	
	/** Decrement indent (e.g. at the end of a list of members of a compound type. */
	void indentDec();

	/** Marks the beginning of a new line. The formatter is 
	 * supposed to add the current indent.
	 */
	void appendIndent();

	/** Marks end of a line. The formatter can add a CRLF. */
	void appendNewLine();


	
	/**
	 * This method is called whenever a JSONObject is serialised. 
	 * It allows the formatter to sort the members.
	 * 
	 * @param entrySet
	 * @return Iterator on a possibly sorted list of the given entries.
	 */
	Iterator<java.util.Map.Entry<String, Object>> iterator(Set<java.util.Map.Entry<String, Object>> entrySet);
	
	/** Append a string to the underlying buffer without conversion. */
	StringBuffer append(String string);

	/** Append a character to the underlying buffer without conversion. */
	StringBuffer append(char c);

	/**
	 * This method simply calls the {@link Object#toString()} method and appends the
	 * result to the string buffer.
	 * @param o
	 * @return String buffer used by the formatter.
	 */
	StringBuffer append(Object o);

	/**
	 * This method is called whenever a string value is serialized. 
	 * This method has to take care of unicode encoding in case 
	 * {@link org.cakelab.json.codec.JSONCodecConfiguration#formatterUnicodeValues} is set.
	 * @param string
	 */
	void appendUnicodeString(String string);

}
