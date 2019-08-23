package org.cakelab.json;

import org.cakelab.json.codec.JSONStringFormatter;


/**
 * Common interface of JSONObject and JSONArray
 * 
 * @author homac
 *
 */
public interface JSONCompoundType {
	/**
	 * Convert to string using the default string formatter.
	 * @see JSONStringFormatter
	 * @return
	 */
	String toString();
	String toString(JSONStringFormatter formatter);
}
