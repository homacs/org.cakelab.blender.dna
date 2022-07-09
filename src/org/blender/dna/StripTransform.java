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
 * Generated facet for DNA struct type 'StripTransform'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=32, size64=32)
public class StripTransform extends CFacade {

	/**
	 * This is the sdna index of the struct StripTransform.
	 * <p>
	 * It is required when allocating a new block to store data for StripTransform.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 317;

	/**
	 * Field descriptor (offset) for struct member 'xofs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripTransform striptransform = ...;
	 * CPointer&lt;Object&gt; p = striptransform.__dna__addressof(StripTransform.__DNA__FIELD__xofs);
	 * CPointer&lt;Float&gt; p_xofs = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xofs'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xofs = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'yofs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripTransform striptransform = ...;
	 * CPointer&lt;Object&gt; p = striptransform.__dna__addressof(StripTransform.__DNA__FIELD__yofs);
	 * CPointer&lt;Float&gt; p_yofs = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yofs'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yofs = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'scale_x'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripTransform striptransform = ...;
	 * CPointer&lt;Object&gt; p = striptransform.__dna__addressof(StripTransform.__DNA__FIELD__scale_x);
	 * CPointer&lt;Float&gt; p_scale_x = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale_x'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale_x = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'scale_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripTransform striptransform = ...;
	 * CPointer&lt;Object&gt; p = striptransform.__dna__addressof(StripTransform.__DNA__FIELD__scale_y);
	 * CPointer&lt;Float&gt; p_scale_y = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale_y'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale_y = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'rotation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripTransform striptransform = ...;
	 * CPointer&lt;Object&gt; p = striptransform.__dna__addressof(StripTransform.__DNA__FIELD__rotation);
	 * CPointer&lt;Float&gt; p_rotation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotation = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'origin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 0-1 range, use SEQ_image_transform_origin_offset_pixelspace_get to convert to pixel space. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripTransform striptransform = ...;
	 * CPointer&lt;Object&gt; p = striptransform.__dna__addressof(StripTransform.__DNA__FIELD__origin);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_origin = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'origin'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__origin = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'filter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripTransform striptransform = ...;
	 * CPointer&lt;Object&gt; p = striptransform.__dna__addressof(StripTransform.__DNA__FIELD__filter);
	 * CPointer&lt;Integer&gt; p_filter = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter = new long[]{28, 28};

	public StripTransform(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected StripTransform(StripTransform that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'xofs'.
	 * @see #__DNA__FIELD__xofs
	 */
	
	public float getXofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'xofs'.
	 * @see #__DNA__FIELD__xofs
	 */
	
	public void setXofs(float xofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, xofs);
		} else {
			__io__block.writeFloat(__io__address + 0, xofs);
		}
	}

	/**
	 * Get method for struct member 'yofs'.
	 * @see #__DNA__FIELD__yofs
	 */
	
	public float getYofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'yofs'.
	 * @see #__DNA__FIELD__yofs
	 */
	
	public void setYofs(float yofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, yofs);
		} else {
			__io__block.writeFloat(__io__address + 4, yofs);
		}
	}

	/**
	 * Get method for struct member 'scale_x'.
	 * @see #__DNA__FIELD__scale_x
	 */
	
	public float getScale_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'scale_x'.
	 * @see #__DNA__FIELD__scale_x
	 */
	
	public void setScale_x(float scale_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, scale_x);
		} else {
			__io__block.writeFloat(__io__address + 8, scale_x);
		}
	}

	/**
	 * Get method for struct member 'scale_y'.
	 * @see #__DNA__FIELD__scale_y
	 */
	
	public float getScale_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'scale_y'.
	 * @see #__DNA__FIELD__scale_y
	 */
	
	public void setScale_y(float scale_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, scale_y);
		} else {
			__io__block.writeFloat(__io__address + 12, scale_y);
		}
	}

	/**
	 * Get method for struct member 'rotation'.
	 * @see #__DNA__FIELD__rotation
	 */
	
	public float getRotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'rotation'.
	 * @see #__DNA__FIELD__rotation
	 */
	
	public void setRotation(float rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, rotation);
		} else {
			__io__block.writeFloat(__io__address + 16, rotation);
		}
	}

	/**
	 * Get method for struct member 'origin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 0-1 range, use SEQ_image_transform_origin_offset_pixelspace_get to convert to pixel space. </p>
	 * @see #__DNA__FIELD__origin
	 */
	
	public CArrayFacade<Float> getOrigin() throws IOException
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
	 * Set method for struct member 'origin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 0-1 range, use SEQ_image_transform_origin_offset_pixelspace_get to convert to pixel space. </p>
	 * @see #__DNA__FIELD__origin
	 */
	
	public void setOrigin(CArrayFacade<Float> origin) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(origin, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, origin)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, origin);
		} else {
			__io__generic__copy( getOrigin(), origin);
		}
	}

	/**
	 * Get method for struct member 'filter'.
	 * @see #__DNA__FIELD__filter
	 */
	
	public int getFilter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'filter'.
	 * @see #__DNA__FIELD__filter
	 */
	
	public void setFilter(int filter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, filter);
		} else {
			__io__block.writeInt(__io__address + 28, filter);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<StripTransform> __io__addressof() {
		return new CPointer<StripTransform>(__io__address, new Class[]{StripTransform.class}, __io__block, __io__blockTable);
	}

}
