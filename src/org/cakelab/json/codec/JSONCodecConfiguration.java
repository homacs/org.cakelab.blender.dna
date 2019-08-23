package org.cakelab.json.codec;

import java.nio.charset.Charset;

/**
 * Configuration of the JSON codec (see {@link JSONCodec}).
 * @author homac
 *
 */
public class JSONCodecConfiguration {
	/** character encoding of the json string.
	 * <p><b>Default:</b> <em>Charset.defaultCharset()</em></p>*/
	public Charset charset					         = Charset.defaultCharset();
	
	/** removes all members with null values in a given object during conversion into a string.
	 * <p><b>Default:</b> <em>false</em></p>*/
	public boolean ignoreNull 				         = false;
	
	/** ignores fields that exist in the json string but not in the corresponding java class.
	 * <p><b>Default:</b> <em>false</em></p>*/
	public boolean ignoreMissingFields		         = false;
	
	/** considers the special member "class" as type of the compound type which contains it.
	 * <p><b>Default:</b> <em>false</em></p>*/
	public boolean considerClassAttribute	         = false;

	
	public JSONStringFormatterConfiguration format   = new JSONStringFormatterConfiguration();
	
	public JSONCodecConfiguration(Charset charset, boolean ignoreNull, boolean ignoreMissingFields, boolean considerClassAttribute) {
		this.charset = charset;
		this.ignoreNull = ignoreNull;
		this.ignoreMissingFields = ignoreMissingFields;
		this.considerClassAttribute = considerClassAttribute;
	}
	
	public JSONCodecConfiguration(Charset charset, boolean ignoreNull, boolean ignoreMissingFields) {
		this(charset, ignoreNull, ignoreMissingFields, false);
	}
	
	public JSONCodecConfiguration(Charset charset, boolean ignoreNull) {
		this(charset, ignoreNull, false, false);
	}
	
	public JSONCodecConfiguration(Charset charset) {
		this(charset, false, false, false);
	}
	
	public JSONCodecConfiguration(boolean ignoreNull, boolean ignoreMissingFields, boolean considerClassAttribute) {
		this(Charset.defaultCharset(), ignoreNull, ignoreMissingFields, considerClassAttribute);
	}
	
	public JSONCodecConfiguration(boolean ignoreNull, boolean ignoreMissingFields) {
		this(Charset.defaultCharset(), ignoreNull, ignoreMissingFields, false);
	}
	
	public JSONCodecConfiguration(boolean ignoreNull) {
		this(Charset.defaultCharset(), ignoreNull, false, false);
	}
	
	public JSONCodecConfiguration() {
		this(Charset.defaultCharset(), false, false, false);
	}
	
	
}
