package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'View3DCursor'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=64, size64=64)
public class View3DCursor extends CFacade {

	/**
	 * This is the sdna index of the struct View3DCursor.
	 * <p>
	 * It is required when allocating a new block to store data for View3DCursor.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 211;

	/**
	 * Field descriptor (offset) for struct member 'location'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DCursor view3dcursor = ...;
	 * CPointer&lt;Object&gt; p = view3dcursor.__dna__addressof(View3DCursor.__DNA__FIELD__location);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_location = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'location'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__location = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'rotation_quaternion'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation in quaternions (keep normalized)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DCursor view3dcursor = ...;
	 * CPointer&lt;Object&gt; p = view3dcursor.__dna__addressof(View3DCursor.__DNA__FIELD__rotation_quaternion);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rotation_quaternion = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotation_quaternion'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotation_quaternion = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'rotation_euler'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * 3D rotation
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DCursor view3dcursor = ...;
	 * CPointer&lt;Object&gt; p = view3dcursor.__dna__addressof(View3DCursor.__DNA__FIELD__rotation_euler);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rotation_euler = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotation_euler'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotation_euler = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'rotation_axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DCursor view3dcursor = ...;
	 * CPointer&lt;Object&gt; p = view3dcursor.__dna__addressof(View3DCursor.__DNA__FIELD__rotation_axis);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rotation_axis = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotation_axis'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotation_axis = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'rotation_angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DCursor view3dcursor = ...;
	 * CPointer&lt;Object&gt; p = view3dcursor.__dna__addressof(View3DCursor.__DNA__FIELD__rotation_angle);
	 * CPointer&lt;Float&gt; p_rotation_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotation_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotation_angle = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'rotation_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DCursor view3dcursor = ...;
	 * CPointer&lt;Object&gt; p = view3dcursor.__dna__addressof(View3DCursor.__DNA__FIELD__rotation_mode);
	 * CPointer&lt;Short&gt; p_rotation_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotation_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotation_mode = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DCursor view3dcursor = ...;
	 * CPointer&lt;Object&gt; p = view3dcursor.__dna__addressof(View3DCursor.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{58, 58};

	public View3DCursor(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected View3DCursor(View3DCursor that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'location'.
	 * @see #__DNA__FIELD__location
	 */
	
	public CArrayFacade<Float> getLocation() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'location'.
	 * @see #__DNA__FIELD__location
	 */
	
	public void setLocation(CArrayFacade<Float> location) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(location, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, location)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, location);
		} else {
			__io__generic__copy( getLocation(), location);
		}
	}

	/**
	 * Get method for struct member 'rotation_quaternion'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation in quaternions (keep normalized)
	 * @see #__DNA__FIELD__rotation_quaternion
	 */
	
	public CArrayFacade<Float> getRotation_quaternion() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rotation_quaternion'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation in quaternions (keep normalized)
	 * @see #__DNA__FIELD__rotation_quaternion
	 */
	
	public void setRotation_quaternion(CArrayFacade<Float> rotation_quaternion) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(rotation_quaternion, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rotation_quaternion)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rotation_quaternion);
		} else {
			__io__generic__copy( getRotation_quaternion(), rotation_quaternion);
		}
	}

	/**
	 * Get method for struct member 'rotation_euler'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * 3D rotation
	 * @see #__DNA__FIELD__rotation_euler
	 */
	
	public CArrayFacade<Float> getRotation_euler() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rotation_euler'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * 3D rotation
	 * @see #__DNA__FIELD__rotation_euler
	 */
	
	public void setRotation_euler(CArrayFacade<Float> rotation_euler) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 28;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(rotation_euler, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rotation_euler)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rotation_euler);
		} else {
			__io__generic__copy( getRotation_euler(), rotation_euler);
		}
	}

	/**
	 * Get method for struct member 'rotation_axis'.
	 * @see #__DNA__FIELD__rotation_axis
	 */
	
	public CArrayFacade<Float> getRotation_axis() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rotation_axis'.
	 * @see #__DNA__FIELD__rotation_axis
	 */
	
	public void setRotation_axis(CArrayFacade<Float> rotation_axis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(rotation_axis, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rotation_axis)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rotation_axis);
		} else {
			__io__generic__copy( getRotation_axis(), rotation_axis);
		}
	}

	/**
	 * Get method for struct member 'rotation_angle'.
	 * @see #__DNA__FIELD__rotation_angle
	 */
	
	public float getRotation_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'rotation_angle'.
	 * @see #__DNA__FIELD__rotation_angle
	 */
	
	public void setRotation_angle(float rotation_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, rotation_angle);
		} else {
			__io__block.writeFloat(__io__address + 52, rotation_angle);
		}
	}

	/**
	 * Get method for struct member 'rotation_mode'.
	 * @see #__DNA__FIELD__rotation_mode
	 */
	
	public short getRotation_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 56);
		} else {
			return __io__block.readShort(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'rotation_mode'.
	 * @see #__DNA__FIELD__rotation_mode
	 */
	
	public void setRotation_mode(short rotation_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 56, rotation_mode);
		} else {
			__io__block.writeShort(__io__address + 56, rotation_mode);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 58, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 58, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 58;
		} else {
			__dna__offset = 58;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<View3DCursor> __io__addressof() {
		return new CPointer<View3DCursor>(__io__address, new Class[]{View3DCursor.class}, __io__block, __io__blockTable);
	}

}
