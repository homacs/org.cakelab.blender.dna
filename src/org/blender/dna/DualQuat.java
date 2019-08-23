package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'DualQuat'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> dual quaternion. </p>
 */

@CMetaData(size32=100, size64=100)
public class DualQuat extends CFacade {

	/**
	 * This is the sdna index of the struct DualQuat.
	 * <p>
	 * It is required when allocating a new block to store data for DualQuat.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 8;

	/**
	 * Field descriptor (offset) for struct member 'quat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DualQuat dualquat = ...;
	 * CPointer&lt;Object&gt; p = dualquat.__dna__addressof(DualQuat.__DNA__FIELD__quat);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_quat = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'quat'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__quat = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'trans'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DualQuat dualquat = ...;
	 * CPointer&lt;Object&gt; p = dualquat.__dna__addressof(DualQuat.__DNA__FIELD__trans);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_trans = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'trans'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__trans = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DualQuat dualquat = ...;
	 * CPointer&lt;Object&gt; p = dualquat.__dna__addressof(DualQuat.__DNA__FIELD__scale);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_scale = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'scale_weight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DualQuat dualquat = ...;
	 * CPointer&lt;Object&gt; p = dualquat.__dna__addressof(DualQuat.__DNA__FIELD__scale_weight);
	 * CPointer&lt;Float&gt; p_scale_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale_weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale_weight = new long[]{96, 96};

	public DualQuat(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected DualQuat(DualQuat that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'quat'.
	 * @see #__DNA__FIELD__quat
	 */
	
	public CArrayFacade<Float> getQuat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'quat'.
	 * @see #__DNA__FIELD__quat
	 */
	
	public void setQuat(CArrayFacade<Float> quat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(quat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, quat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, quat);
		} else {
			__io__generic__copy( getQuat(), quat);
		}
	}

	/**
	 * Get method for struct member 'trans'.
	 * @see #__DNA__FIELD__trans
	 */
	
	public CArrayFacade<Float> getTrans() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'trans'.
	 * @see #__DNA__FIELD__trans
	 */
	
	public void setTrans(CArrayFacade<Float> trans) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(trans, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, trans)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, trans);
		} else {
			__io__generic__copy( getTrans(), trans);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getScale() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(CArrayFacade<CArrayFacade<Float>> scale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(scale, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scale)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scale);
		} else {
			__io__generic__copy( getScale(), scale);
		}
	}

	/**
	 * Get method for struct member 'scale_weight'.
	 * @see #__DNA__FIELD__scale_weight
	 */
	
	public float getScale_weight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'scale_weight'.
	 * @see #__DNA__FIELD__scale_weight
	 */
	
	public void setScale_weight(float scale_weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, scale_weight);
		} else {
			__io__block.writeFloat(__io__address + 96, scale_weight);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<DualQuat> __io__addressof() {
		return new CPointer<DualQuat>(__io__address, new Class[]{DualQuat.class}, __io__block, __io__blockTable);
	}

}
