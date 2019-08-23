package org.cakelab.json.codec;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class ReflectionHelper {

	private static HashMap<Class<?>, Vector<Field>> fieldLists = new HashMap<Class<?>, Vector<Field>> ();
	private static HashMap<Class<?>, HashMap<String, Field>> fieldMaps = new HashMap<Class<?>, HashMap<String, Field>> ();
	
	
	public static	List<Field> getDeclaredFields(Class<?> type) {
		Vector<Field> fields = fieldLists.get(type);
		if (fields == null) {
			fields = new Vector<Field>();
			if (!type.equals(Object.class)) {
				List<Field> superFields = getDeclaredFields(type.getSuperclass());
				fields.addAll(superFields);
			}
			for (Field f : type.getDeclaredFields()) {
				fields.add(f);
			}
			fieldLists.put(type, fields);
		}
		return fields;
	}

	public static HashMap<String, Field> getDeclaredFieldsMap(Class<?> type) {
		HashMap<String, Field> map = fieldMaps.get(type);
		if (map == null) {
			map = new HashMap<String, Field>();
			if (!type.equals(Object.class)) {
				HashMap<String, Field> superFields = getDeclaredFieldsMap(type.getSuperclass());
				map.putAll(superFields);
			}
			for (Field f : type.getDeclaredFields()) {
				map.put(f.getName(), f);
			}
			fieldMaps.put(type,  map);
		}
		return map;
	}


	public static
	boolean isPrimitive(Class<?> type) {
		return type.isPrimitive() || type.equals(String.class)
				 || type.equals(Long.class) || type.equals(Integer.class) || type.equals(Short.class)
				  || type.equals(Double.class) || type.equals(Float.class)
				   || type.equals(Byte.class) || type.equals(Character.class)
				    || type.equals(Boolean.class);
	}


	public static Field getDeclaredField(Class<? extends Object> class1,
			String name) throws NoSuchFieldException {
		Field f = null;
		try {
			f = class1.getDeclaredField(name);
		} catch (NoSuchFieldException e) {
			if (!class1.getSuperclass().equals(Object.class)) {
				return getDeclaredField(class1.getSuperclass(), name);
			} else {
				throw e;
			}
		}
		return f;
	}


	public static void checkParameter(Method method, int param, Field field, Class<?> paramType) throws JSONCodecException {
		Class<?>[] params = method.getParameterTypes();
		if (params.length < param+1) {
			throw new JSONCodecException(method.getDeclaringClass() + "." + method.getName() + "(): needs a " + param + ". parameter");
		} else if (!params[param].equals(paramType)) {
			throw new JSONCodecException(method.getDeclaringClass() + "." + method.getName() + "(): " + Integer.toString(param+1) + ". parameter must have type " + paramType.getSimpleName());
		}

	}


	public static Method findMethod(Class<?> target, String methodName, Class<?>[] params) throws JSONCodecException {
		Method method = null;
		try {
			/* try direct access to public methods with parameter types */
			return target.getMethod(methodName, params);
		} catch (Exception e) {
			/* search all methods manually */
			for (Method m : target.getDeclaredMethods()) {
				if (m.getName().equals(methodName)) {
					method = m;
					break;
				}
			}
		}
		if (method == null) {
			throw new JSONCodecException(target.getName() + '.' + methodName + "(): not found");
		}
		return method;
	}

	public static boolean isSubclassOf(Class<?> derived, Class<?> superclass) {
		if (derived.equals(superclass)) return true;
		
		if (derived.equals(Object.class)) return false;
		
		for (Class<?> interf : derived.getInterfaces()) {
			if (isSubclassOf(interf, superclass)) {
				return true;
			}
		}
		
		return isSubclassOf(derived.getSuperclass(), superclass);
	}



}
