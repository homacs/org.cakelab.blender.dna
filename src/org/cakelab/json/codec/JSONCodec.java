package org.cakelab.json.codec;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.Map.Entry;

import org.cakelab.json.JSONArray;
import org.cakelab.json.JSONCompoundType;
import org.cakelab.json.JSONException;
import org.cakelab.json.JSONObject;
import org.cakelab.json.JSONPrettyprint;

public class JSONCodec {
	// TODO: needs enum support
	
	private static JSONCodecConfiguration defaultConfig;
	private static JSONStringFormatter formatterFactory = new JSONPrettyprint();

	static {
		setDefaultConfiguration(new JSONCodecConfiguration());
	}
	
	
	private UnsafeAllocator allocator = UnsafeAllocator.create();
	private JSONCodecConfiguration cfg;
	
	/** This method allows to change the default behaviour of JSONCodecs.
	 * @param config The new default configuration to be used by all subsequently created JSONCodec instances.
	 */
	public static void setDefaultConfiguration(JSONCodecConfiguration config) {
		defaultConfig = config;
	}

	/** 
	 * Returns a string formatter with the default configuration used to encode 
	 * Java objects to JSON. The configuration of the default formatter is 
	 * influenced by the globally set default configuration.
	 * @return
	 */
	public static JSONStringFormatter getDefaultStringFormatter() {
		return formatterFactory.create(defaultConfig.format);
	}


	/**
	 * Constructor using the default configuration.
	 * @see {@link JSONCodecConfiguration}
	 * @see {@link #setDefaultConfiguration(JSONCodecConfiguration)}
	 */
	public JSONCodec() {
		this(defaultConfig);
	}

	/** Constructor using a specific configuration.
	 * @param config Configuration to be used by the codec.
	 */
	public JSONCodec(JSONCodecConfiguration config) {
		this.cfg = config;
	}
	
	/**
	 * @deprecated use {@link JSONCodec#JSONCodec(JSONCodecConfiguration)} instead.
	 */
	public JSONCodec(Charset charset, boolean ignoreNull, boolean ignoreMissingFields) {
		cfg = new JSONCodecConfiguration();
		cfg.charset = charset;
		cfg.ignoreNull = ignoreNull;
		cfg.ignoreMissingFields = ignoreMissingFields;
	}
	
	/**
	 * @deprecated use {@link JSONCodec#JSONCodec(JSONCodecConfiguration)} instead.
	 */
	public JSONCodec(boolean ignoreNull, boolean ignoreMissingFields) {
		this(Charset.defaultCharset(), ignoreNull, ignoreMissingFields);
	}
	
	/**
	 * @deprecated use {@link JSONCodec#JSONCodec(JSONCodecConfiguration)} instead.
	 */
	public JSONCodec(Charset charset, boolean ignoreNull) {
		this(charset, ignoreNull, false);
	}
	
	/**
	 * @deprecated use {@link JSONCodec#JSONCodec(JSONCodecConfiguration)} instead.
	 */
	public JSONCodec(boolean ignoreNull) {
		this(Charset.defaultCharset(), ignoreNull, false);
	}
	
	
	
	/** decodes the given json string into the given target object. 
	 * @throws JSONCodecException 
	 */
	public Object decodeObject(String jsonString, Object target) throws JSONCodecException {

		try {
			Parser parser = new Parser(jsonString);
			JSONObject json = parser.parse();
			
			return _decodeObject(json, target);
		} catch (JSONCodecException e) {
			throw e;
		} catch (Exception e) {
			throw new JSONCodecException(e);
		}
	}
	
	/** decodes the given json string from input stream into the given target object. 
	 * @throws JSONCodecException 
	 */
	public Object decodeObject(InputStream inputStream, Object target) throws JSONCodecException {

		try {
			Parser parser = new Parser(inputStream, cfg.charset);
			JSONObject json = parser.parse();
			
			return _decodeObject(json, target);
		} catch (JSONCodecException e) {
			throw e;
		} catch (Exception e) {
			throw new JSONCodecException(e);
		}
	}

	
	/** decodes the given json string from input stream into an object of the given target type. 
	 * @throws JSONCodecException 
	 */
	public Object decodeObject(InputStream inputStream,
			Class<?> target)  throws JSONCodecException {
		try {
			Parser parser = new Parser(inputStream, cfg.charset);
			JSONObject json = parser.parse();
			
			return _decodeObject(json, target);
		} catch (JSONCodecException e) {
			throw e;
		} catch (Exception e) {
			throw new JSONCodecException(e);
		}
	}


	
	/** decodes the given json string into an object of the given target type. 
	 * @throws JSONCodecException 
	 */
	public Object decodeObject(String jsonString, Class<?> type) throws JSONCodecException {

		try {
			Parser parser = new Parser(jsonString, cfg.ignoreNull);
			JSONObject json = parser.parse();
			
			return _decodeObject(json, type);
		} catch (JSONCodecException e) {
			throw e;
		} catch (Exception e) {
			throw new JSONCodecException(e);
		}
	}
	
	
	public Object decodeObject(JSONObject json, Class<?> clazz) throws JSONCodecException {
		try {
			return _decodeObject(json, clazz);
		} catch (InstantiationException e) {
			throw new JSONCodecException(e);
		}
	}


	@SuppressWarnings("unchecked")
	public <T> T decodeObject(JSONObject json, T target) throws JSONCodecException {
		return (T) _decodeObject(json, target);
	}
	
	private Object _decodeObject(Object json, Object target) throws JSONCodecException {

		if (json instanceof JSONObject) {
			return json2object((JSONObject) json, target);
		} else if (json instanceof JSONArray) {
			return json2array((JSONArray) json, target);
		} else {
			return json2primitive(json.toString(), target.getClass());
		}
		
	}

	private Object _decodeObject(Object json, Class<?> type) throws JSONCodecException, InstantiationException {
		if (json == null) return null;
		if (json instanceof JSONObject) {
			if (cfg.considerClassAttribute) {
				String clazz = ((JSONObject) json).getString("class");
				if (clazz != null) {
					try {
						Class<?> derived = JSONCodec.class.getClassLoader().loadClass(clazz);
						if (!ReflectionHelper.isSubclassOf(derived, type)) throw new JSONCodecException("class " + clazz + " is not a subclass of " + type.getSimpleName());
						else type = derived;
					} catch (ClassNotFoundException e) {
						throw new JSONCodecException(e);
					}
				}
			}
			return json2object((JSONObject) json, allocator.newInstance(type));
		} else if (json instanceof JSONArray) {
			return json2array((JSONArray) json, Array.newInstance(type.getComponentType(), ((JSONArray) json).size()));
		} else {
			return json2primitive(json.toString(), type);
		}
		
	}


	private Object json2object(JSONObject json, Object target) throws JSONCodecException {
		Class<? extends Object> type = target.getClass();
		try {
			for (Entry<String, Object> e : json.entrySet()) {
				try {
					if (cfg.considerClassAttribute && e.getKey().equals("class")) continue;
					
					Field field = ReflectionHelper.getDeclaredField(type, e.getKey());
					if (isIgnoredField(field)) continue;
					boolean accessible = field.isAccessible();
					field.setAccessible(true);
					if (ReflectionHelper.isPrimitive(field.getType())) {
						field.set(target, json2primitive(e.getValue().toString(), field.getType()));
					} else {
						field.set(target, _decodeObject(e.getValue(), field.getType()));
					}
					field.setAccessible(accessible);
				} catch (NoSuchFieldException ex) {
					if (!cfg.ignoreMissingFields) throw new JSONCodecException(ex);
				}
			}
		} catch (IllegalArgumentException | IllegalAccessException | InstantiationException e) {
			throw new JSONCodecException(e);
		}
		
		return target;
	}

	private Object json2array(JSONArray json, Object target) throws JSONCodecException {
		try {
			for (int i = 0; i < json.size(); i++) {
				Object jsonValue = json.get(i);
				Object value;
					value = _decodeObject(jsonValue, target.getClass().getComponentType());
				Array.set(target, i, value);
			}
		} catch (InstantiationException e) {
			throw new JSONCodecException(e);
		}
		return target;
	}

	private Object json2primitive(String body, Class<?> type) {
		if (type.equals(String.class)) {
			return body;
		} else if (type.equals(Character.class)) {
			body = body.trim(); 
			return (body.length() > 0) ? body.charAt(0) : null;
		} else if (type.equals(Long.class) || type.equals(long.class)) {
			return Long.decode(body);
		} else if (type.equals(Integer.class) || type.equals(int.class)) {
			return Integer.decode(body);
		} else if (type.equals(Double.class) || type.equals(double.class)) {
			return Double.parseDouble(body);
		} else if (type.equals(Float.class) || type.equals(float.class)) {
			return Float.parseFloat(body);
		} else if (type.equals(Short.class) || type.equals(short.class)) {
			return Short.parseShort(body);
		} else if (type.equals(Byte.class) || type.equals(byte.class)) {
			return Byte.parseByte(body);
		} else if (type.equals(Boolean.class) || type.equals(boolean.class)) {
			return Boolean.parseBoolean(body);
		}
		return null;
		
		
	}


	public String encodeObject(Object o) throws JSONCodecException {
		Object json;
		
		if (o == null) {
			throw new JSONCodecException("Cannot encode a toplevel null object");
		}
		
		try {
			if (o instanceof JSONCompoundType) {
				json = o;
			} else {
				json = encodeObjectJSON(o, null);
			}
			if (json instanceof JSONCompoundType) {
				return ((JSONCompoundType)json).toString(getFormatter());
			} else {
				return json.toString();
			}
		} catch (Exception e) {
			throw new JSONCodecException(e);
		}
	}

	private JSONStringFormatter getFormatter() {
		return formatterFactory.create(cfg.format);
	}

	public void encodeObject(Object o, OutputStream out) throws JSONCodecException {
		
		if (o == null) {
			throw new JSONCodecException("Cannot encode a toplevel null object");
		}
		
		try {
			String str = encodeObject(o);
			byte[] bytes = str.getBytes();
			out.write(bytes);
		} catch (Exception e) {
			throw new JSONCodecException(e);
		}
	}

	/** returns a JSONObject or JSONArray depending on the given 
	 * object o to be encoded.
	 * @param o Object to be encoded.
	 * @param referenceType Class of the object or some subclass, in case you want just a particular subset of the members */
	public Object encodeObjectJSON(Object o, Class<?> referenceType) throws JSONCodecException {
		try {
			// TODO: needs refactoring: see decodeObject(JSONObject) and decodeObject(String)
		
			if (ReflectionHelper.isPrimitive(o.getClass())) {
				return primitive2json(o);
			} else if (o.getClass().isArray()) {
				return array2json(o);
			} else {
				return object2json(o, referenceType);
			}
		} catch (JSONCodecException e) {
			throw e;
		} catch (Exception e) {
			throw new JSONCodecException(e);
		}
	}

	/** Encodes the given object into a JSONObject or JSONArray, depending on the given 
	 * object.
	 * @param o
	 * @return
	 * @throws JSONCodecException 
	 */
	public Object encodeObjectJSON(Object o) throws JSONCodecException {
		return encodeObjectJSON(o, o.getClass());
	}

	
	private Object primitive2json(Object o) {
		return o;
	}

	private JSONObject object2json(Object o, Class<?> referenceType) throws JSONCodecException, IllegalArgumentException, IllegalAccessException {
		JSONObject json = new JSONObject();
		Class<?> type = o.getClass();
		for (Field field : ReflectionHelper.getDeclaredFields(type)) {
			
			// ignore transient fields
			if (isIgnoredField(field)) continue;
			boolean accessible = field.isAccessible();
			field.setAccessible(true);
			Object value = field.get(o);
			if (value == null) {
				if (!cfg.ignoreNull) json.put(field.getName(), null);
			} else {
				json.put(field.getName(), encodeObjectJSON(value, field.getType()));
			}
			field.setAccessible(accessible);
		}
		if (referenceType != null && referenceType != type) {
			json.put("class", type.getName());
		}
		return json;
	}

	private JSONArray array2json(Object o) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, IOException, JSONException, JSONCodecException {
		JSONArray json = new JSONArray();
		for (int i = 0; i < Array.getLength(o); i++) {
			Object value = Array.get(o, i);
			if (value == null) {
				if (!cfg.ignoreNull) json.add(null);
			} else {
				json.add(encodeObjectJSON(value, o.getClass().getComponentType()));
			}
		}
		return json;
	}
	
	private boolean isIgnoredField(Field field) {
		int mod = field.getModifiers();

		return Modifier.isTransient(mod) || Modifier.isStatic(mod) || Modifier.isNative(mod);
	}

}
