package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bMouseActuator'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=44, size64=44)
public class bMouseActuator extends CFacade {

	/**
	 * This is the sdna index of the struct bMouseActuator.
	 * <p>
	 * It is required when allocating a new block to store data for bMouseActuator.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 333;

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 0=Visibility, 1=Look </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMouseActuator bmouseactuator = ...;
	 * CPointer&lt;Object&gt; p = bmouseactuator.__dna__addressof(bMouseActuator.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMouseActuator bmouseactuator = ...;
	 * CPointer&lt;Object&gt; p = bmouseactuator.__dna__addressof(bMouseActuator.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'object_axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMouseActuator bmouseactuator = ...;
	 * CPointer&lt;Object&gt; p = bmouseactuator.__dna__addressof(bMouseActuator.__DNA__FIELD__object_axis);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_object_axis = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_axis'</li>
	 * <li>Signature: 'int[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_axis = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'threshold'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMouseActuator bmouseactuator = ...;
	 * CPointer&lt;Object&gt; p = bmouseactuator.__dna__addressof(bMouseActuator.__DNA__FIELD__threshold);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_threshold = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'threshold'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__threshold = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'sensitivity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMouseActuator bmouseactuator = ...;
	 * CPointer&lt;Object&gt; p = bmouseactuator.__dna__addressof(bMouseActuator.__DNA__FIELD__sensitivity);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_sensitivity = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sensitivity'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sensitivity = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'limit_x'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMouseActuator bmouseactuator = ...;
	 * CPointer&lt;Object&gt; p = bmouseactuator.__dna__addressof(bMouseActuator.__DNA__FIELD__limit_x);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_limit_x = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit_x'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit_x = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'limit_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMouseActuator bmouseactuator = ...;
	 * CPointer&lt;Object&gt; p = bmouseactuator.__dna__addressof(bMouseActuator.__DNA__FIELD__limit_y);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_limit_y = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit_y'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit_y = new long[]{36, 36};

	public bMouseActuator(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bMouseActuator(bMouseActuator that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 0=Visibility, 1=Look </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 0=Visibility, 1=Look </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, type);
		} else {
			__io__block.writeShort(__io__address + 0, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, flag);
		} else {
			__io__block.writeShort(__io__address + 2, flag);
		}
	}

	/**
	 * Get method for struct member 'object_axis'.
	 * @see #__DNA__FIELD__object_axis
	 */
	
	public CArrayFacade<Integer> getObject_axis() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'object_axis'.
	 * @see #__DNA__FIELD__object_axis
	 */
	
	public void setObject_axis(CArrayFacade<Integer> object_axis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(object_axis, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, object_axis)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, object_axis);
		} else {
			__io__generic__copy( getObject_axis(), object_axis);
		}
	}

	/**
	 * Get method for struct member 'threshold'.
	 * @see #__DNA__FIELD__threshold
	 */
	
	public CArrayFacade<Float> getThreshold() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'threshold'.
	 * @see #__DNA__FIELD__threshold
	 */
	
	public void setThreshold(CArrayFacade<Float> threshold) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(threshold, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, threshold)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, threshold);
		} else {
			__io__generic__copy( getThreshold(), threshold);
		}
	}

	/**
	 * Get method for struct member 'sensitivity'.
	 * @see #__DNA__FIELD__sensitivity
	 */
	
	public CArrayFacade<Float> getSensitivity() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sensitivity'.
	 * @see #__DNA__FIELD__sensitivity
	 */
	
	public void setSensitivity(CArrayFacade<Float> sensitivity) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(sensitivity, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sensitivity)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sensitivity);
		} else {
			__io__generic__copy( getSensitivity(), sensitivity);
		}
	}

	/**
	 * Get method for struct member 'limit_x'.
	 * @see #__DNA__FIELD__limit_x
	 */
	
	public CArrayFacade<Float> getLimit_x() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'limit_x'.
	 * @see #__DNA__FIELD__limit_x
	 */
	
	public void setLimit_x(CArrayFacade<Float> limit_x) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 28;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(limit_x, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, limit_x)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, limit_x);
		} else {
			__io__generic__copy( getLimit_x(), limit_x);
		}
	}

	/**
	 * Get method for struct member 'limit_y'.
	 * @see #__DNA__FIELD__limit_y
	 */
	
	public CArrayFacade<Float> getLimit_y() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'limit_y'.
	 * @see #__DNA__FIELD__limit_y
	 */
	
	public void setLimit_y(CArrayFacade<Float> limit_y) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 36;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(limit_y, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, limit_y)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, limit_y);
		} else {
			__io__generic__copy( getLimit_y(), limit_y);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bMouseActuator> __io__addressof() {
		return new CPointer<bMouseActuator>(__io__address, new Class[]{bMouseActuator.class}, __io__block, __io__blockTable);
	}

}
