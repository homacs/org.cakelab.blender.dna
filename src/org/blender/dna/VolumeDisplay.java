package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'VolumeDisplay'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=32, size64=32)
public class VolumeDisplay extends CFacade {

	/**
	 * This is the sdna index of the struct VolumeDisplay.
	 * <p>
	 * It is required when allocating a new block to store data for VolumeDisplay.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 788;

	/**
	 * Field descriptor (offset) for struct member 'density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Thickness of volume display in the viewport
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplay volumedisplay = ...;
	 * CPointer&lt;Object&gt; p = volumedisplay.__dna__addressof(VolumeDisplay.__DNA__FIELD__density);
	 * CPointer&lt;Float&gt; p_density = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'density'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__density = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'wireframe_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Type of wireframe display
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplay volumedisplay = ...;
	 * CPointer&lt;Object&gt; p = volumedisplay.__dna__addressof(VolumeDisplay.__DNA__FIELD__wireframe_type);
	 * CPointer&lt;Integer&gt; p_wireframe_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wireframe_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wireframe_type = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'wireframe_detail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Amount of detail for wireframe display
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplay volumedisplay = ...;
	 * CPointer&lt;Object&gt; p = volumedisplay.__dna__addressof(VolumeDisplay.__DNA__FIELD__wireframe_detail);
	 * CPointer&lt;Integer&gt; p_wireframe_detail = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wireframe_detail'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wireframe_detail = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'interpolation_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Interpolation method to use for volumes in solid mode
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplay volumedisplay = ...;
	 * CPointer&lt;Object&gt; p = volumedisplay.__dna__addressof(VolumeDisplay.__DNA__FIELD__interpolation_method);
	 * CPointer&lt;Integer&gt; p_interpolation_method = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interpolation_method'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interpolation_method = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'axis_slice_method'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplay volumedisplay = ...;
	 * CPointer&lt;Object&gt; p = volumedisplay.__dna__addressof(VolumeDisplay.__DNA__FIELD__axis_slice_method);
	 * CPointer&lt;Integer&gt; p_axis_slice_method = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axis_slice_method'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axis_slice_method = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'slice_axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplay volumedisplay = ...;
	 * CPointer&lt;Object&gt; p = volumedisplay.__dna__addressof(VolumeDisplay.__DNA__FIELD__slice_axis);
	 * CPointer&lt;Integer&gt; p_slice_axis = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slice_axis'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slice_axis = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'slice_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Position of the slice
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplay volumedisplay = ...;
	 * CPointer&lt;Object&gt; p = volumedisplay.__dna__addressof(VolumeDisplay.__DNA__FIELD__slice_depth);
	 * CPointer&lt;Float&gt; p_slice_depth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slice_depth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slice_depth = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeDisplay volumedisplay = ...;
	 * CPointer&lt;Object&gt; p = volumedisplay.__dna__addressof(VolumeDisplay.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'int[1]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{28, 28};

	public VolumeDisplay(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected VolumeDisplay(VolumeDisplay that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Thickness of volume display in the viewport
	 * @see #__DNA__FIELD__density
	 */
	
	public float getDensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Thickness of volume display in the viewport
	 * @see #__DNA__FIELD__density
	 */
	
	public void setDensity(float density) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, density);
		} else {
			__io__block.writeFloat(__io__address + 0, density);
		}
	}

	/**
	 * Get method for struct member 'wireframe_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Type of wireframe display
	 * @see #__DNA__FIELD__wireframe_type
	 */
	
	public int getWireframe_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'wireframe_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Type of wireframe display
	 * @see #__DNA__FIELD__wireframe_type
	 */
	
	public void setWireframe_type(int wireframe_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, wireframe_type);
		} else {
			__io__block.writeInt(__io__address + 4, wireframe_type);
		}
	}

	/**
	 * Get method for struct member 'wireframe_detail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Amount of detail for wireframe display
	 * @see #__DNA__FIELD__wireframe_detail
	 */
	
	public int getWireframe_detail() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'wireframe_detail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Amount of detail for wireframe display
	 * @see #__DNA__FIELD__wireframe_detail
	 */
	
	public void setWireframe_detail(int wireframe_detail) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, wireframe_detail);
		} else {
			__io__block.writeInt(__io__address + 8, wireframe_detail);
		}
	}

	/**
	 * Get method for struct member 'interpolation_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Interpolation method to use for volumes in solid mode
	 * @see #__DNA__FIELD__interpolation_method
	 */
	
	public int getInterpolation_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'interpolation_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Interpolation method to use for volumes in solid mode
	 * @see #__DNA__FIELD__interpolation_method
	 */
	
	public void setInterpolation_method(int interpolation_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, interpolation_method);
		} else {
			__io__block.writeInt(__io__address + 12, interpolation_method);
		}
	}

	/**
	 * Get method for struct member 'axis_slice_method'.
	 * @see #__DNA__FIELD__axis_slice_method
	 */
	
	public int getAxis_slice_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'axis_slice_method'.
	 * @see #__DNA__FIELD__axis_slice_method
	 */
	
	public void setAxis_slice_method(int axis_slice_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, axis_slice_method);
		} else {
			__io__block.writeInt(__io__address + 16, axis_slice_method);
		}
	}

	/**
	 * Get method for struct member 'slice_axis'.
	 * @see #__DNA__FIELD__slice_axis
	 */
	
	public int getSlice_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'slice_axis'.
	 * @see #__DNA__FIELD__slice_axis
	 */
	
	public void setSlice_axis(int slice_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, slice_axis);
		} else {
			__io__block.writeInt(__io__address + 20, slice_axis);
		}
	}

	/**
	 * Get method for struct member 'slice_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Position of the slice
	 * @see #__DNA__FIELD__slice_depth
	 */
	
	public float getSlice_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'slice_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Position of the slice
	 * @see #__DNA__FIELD__slice_depth
	 */
	
	public void setSlice_depth(float slice_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, slice_depth);
		} else {
			__io__block.writeFloat(__io__address + 24, slice_depth);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Integer> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Integer> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 28;
		} else {
			__dna__offset = 28;
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
	public CPointer<VolumeDisplay> __io__addressof() {
		return new CPointer<VolumeDisplay>(__io__address, new Class[]{VolumeDisplay.class}, __io__block, __io__blockTable);
	}

}
