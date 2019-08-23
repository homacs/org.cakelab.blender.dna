package org.cakelab.json.codec;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * This class provides a method to instantiate objects of given classes without 
 * calling a constructor for the object.
 * 
 * @author homac
 *
 */
public abstract class UnsafeAllocator {
	
	/**
	 * This method instantiates an object of given classes without 
	 * calling a constructor for the object.
	 * @param clazz
	 * @return The new instance.
	 * @throws InstantiationException Thrown on any problem during instantiation.
	 */
	public abstract <T> T newInstance(Class<T> clazz) throws InstantiationException;
	
	public static UnsafeAllocator create() {
		// try JVM
		// public class Unsafe {
		//   public Object allocateInstance(Class<?> type);
		// }
		try {
			Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
			Field f = unsafeClass.getDeclaredField("theUnsafe");
			f.setAccessible(true);
			final Object unsafe = f.get(null);
			final Method allocateInstance = unsafeClass.getMethod(
					"allocateInstance", Class.class);
			return new UnsafeAllocator() {
				@Override
				@SuppressWarnings("unchecked")
				public <T> T newInstance(Class<T> c) throws InstantiationException{
					T o = null;
					try {
						o = (T) allocateInstance.invoke(unsafe, c);
					} catch (Exception e) {
						throw new InstantiationException(e.toString());
					}
					return o;
				}
			};
		} catch (Exception ignored) {
		}

		// try dalvikvm, pre-gingerbread
		// public class ObjectInputStream {
		// private static native Object newInstance(
		// Class<?> instantiationClass, Class<?> constructorClass);
		// }
		try {
			final Method newInstance = ObjectInputStream.class
					.getDeclaredMethod("newInstance", Class.class, Class.class);
			newInstance.setAccessible(true);
			return new UnsafeAllocator() {
				@Override
				@SuppressWarnings("unchecked")
				public <T> T newInstance(Class<T> c) throws InstantiationException {
					T o = null;
					try {
						o = (T) newInstance.invoke(null, c, Object.class);
					} catch (Exception e) {
						throw new InstantiationException(e.toString());
					}
					return o;
				}
			};
		} catch (Exception ignored) {
		}

		// try dalvikvm, post-gingerbread
		// public class ObjectStreamClass {
		// private static native int getConstructorId(Class<?> c);
		// private static native Object newInstance(Class<?> instantiationClass,
		// int methodId);
		// }
		try {
			Method getConstructorId = ObjectStreamClass.class
					.getDeclaredMethod("getConstructorId", Class.class);
			getConstructorId.setAccessible(true);
			final int constructorId = (Integer) getConstructorId.invoke(null,
					Object.class);
			final Method newInstance = ObjectStreamClass.class
					.getDeclaredMethod("newInstance", Class.class, int.class);
			newInstance.setAccessible(true);
			return new UnsafeAllocator() {
				@Override
				@SuppressWarnings("unchecked")
				public <T> T newInstance(Class<T> c) throws InstantiationException {
					try {
						return (T) newInstance.invoke(null, c, constructorId);
					} catch (Exception e) {
						throw new InstantiationException(e.toString());
					}
				}
			};
		} catch (Exception ignored) {
		}

		// give up
		return new UnsafeAllocator() {
			@Override
			public <T> T newInstance(Class<T> c) {
				throw new UnsupportedOperationException("Cannot allocate " + c);
			}
		};
	}
}
