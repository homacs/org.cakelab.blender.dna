package org.cakelab.json.codec.test;

import org.cakelab.json.codec.JSONCodec;
import org.cakelab.json.codec.JSONCodecConfiguration;
import org.cakelab.json.codec.JSONCodecException;

public class Test {

	static class Primitives {
		int int_1;
		double double_2;
		String string_3;
		
		String string_null_4;
		
		public Primitives () {
			int_1 = 1;
			double_2 = 2.0;
			string_3 = "drei";
			string_null_4 = null;
		}
	}
	
	static class ObjectInObject {
		Primitives m_1;
		
		public ObjectInObject() {
			 m_1 = new Primitives();
		}
	}
	
	static class ArrayMembers {

		long[] int_array_1;
		double[] double_array_2;
		Primitives[] object_array_3;
		
		
		ArrayMembers() {
			int_array_1 = new long[]{1,2,3,4,5};
			double_array_2 = new double[]{1,2,3,4,5};
			
			object_array_3 = new Primitives[]{new Primitives(), new Primitives()};
		}
		
	}
	
	
	static JSONCodec codec = new JSONCodec(new JSONCodecConfiguration(true));
	
	
	public static void main (String[] args) {
		testPrimitives();
		testObjectInObject();
		testArrayMembers();
		testPolymorphism();
	}




	private static void testPolymorphism() {
		try {
			/* given an object with reference on A while reference is of type SuperClass */
			PolymorphismUser object = new PolymorphismUser();
			object.ref_on_A_or_B = new A();
	
			/* configure and instantiate a codec which supports the "class" attribute. */
			JSONCodecConfiguration cfg = new JSONCodecConfiguration();
			cfg.considerClassAttribute = true;
			JSONCodec codec = new JSONCodec(cfg);
	
			/* encode object into a json string */
			String json = codec.encodeObject(object);
	
			/* and decode it again using a codec with the same configuration */
			PolymorphismUser o2 = (PolymorphismUser) codec.decodeObject(json, PolymorphismUser.class);
	
			/* member o2.ref_on_A_or_B is of type A again. */
			if (!object.ref_on_A_or_B.getClass().equals(o2.ref_on_A_or_B.getClass())) {
				error("testPolymorphism");
			}
		} catch (JSONCodecException e) {
			e.printStackTrace();
		}
	}




	private static void testArrayMembers() {
		ArrayMembers o = new ArrayMembers();
		try {
			String json = codec.encodeObject(o);
			ArrayMembers target = (ArrayMembers) codec.decodeObject(json, o.getClass());
			validate(json, target);
		} catch (JSONCodecException e) {
			e.printStackTrace();
		}
	}




	private static void testObjectInObject() {
		ObjectInObject o = new ObjectInObject();
		try {
			String json = codec.encodeObject(o);
			ObjectInObject target = (ObjectInObject) codec.decodeObject(json, o.getClass());
			validate(json, target);
		} catch (JSONCodecException e) {
			e.printStackTrace();
		}
	}




	private static void testPrimitives() {
		Primitives o = new Primitives();
		try {
			String json = codec.encodeObject(o);
			Primitives target = (Primitives) codec.decodeObject(json, o.getClass());
			validate(json, target);
		} catch (JSONCodecException e) {
			e.printStackTrace();
		}
		
	}




	private static void validate(String json, Object target) {
		try {
			if (!json.equals(codec.encodeObject(target))) {
				error("failed");
			}
		} catch (JSONCodecException e) {
			error("failed");
			e.printStackTrace();
		}
	}




	private static void error(String msg) {
		System.err.println(msg);
	}
	
}
