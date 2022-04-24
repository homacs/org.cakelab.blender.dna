package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'VolumeRender'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=16, size64=16)
public class VolumeRender extends CFacade {

	/**
	 * This is the sdna index of the struct VolumeRender.
	 * <p>
	 * It is required when allocating a new block to store data for VolumeRender.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 795;

	/**
	 * Field descriptor (offset) for struct member 'precision'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeRender volumerender = ...;
	 * CPointer&lt;Object&gt; p = volumerender.__dna__addressof(VolumeRender.__DNA__FIELD__precision);
	 * CPointer&lt;Integer&gt; p_precision = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'precision'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__precision = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Specify volume density and step size in object or world space
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeRender volumerender = ...;
	 * CPointer&lt;Object&gt; p = volumerender.__dna__addressof(VolumeRender.__DNA__FIELD__space);
	 * CPointer&lt;Integer&gt; p_space = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'space'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__space = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'step_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance between volume samples. Lower values render more detail at the cost of performance. If set to zero, the step size is automatically determined based on voxel size
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeRender volumerender = ...;
	 * CPointer&lt;Object&gt; p = volumerender.__dna__addressof(VolumeRender.__DNA__FIELD__step_size);
	 * CPointer&lt;Float&gt; p_step_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'step_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__step_size = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'clipping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value under which voxels are considered empty space to optimize rendering
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * VolumeRender volumerender = ...;
	 * CPointer&lt;Object&gt; p = volumerender.__dna__addressof(VolumeRender.__DNA__FIELD__clipping);
	 * CPointer&lt;Float&gt; p_clipping = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clipping'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clipping = new long[]{12, 12};

	public VolumeRender(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected VolumeRender(VolumeRender that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'precision'.
	 * @see #__DNA__FIELD__precision
	 */
	
	public int getPrecision() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'precision'.
	 * @see #__DNA__FIELD__precision
	 */
	
	public void setPrecision(int precision) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, precision);
		} else {
			__io__block.writeInt(__io__address + 0, precision);
		}
	}

	/**
	 * Get method for struct member 'space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Specify volume density and step size in object or world space
	 * @see #__DNA__FIELD__space
	 */
	
	public int getSpace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Specify volume density and step size in object or world space
	 * @see #__DNA__FIELD__space
	 */
	
	public void setSpace(int space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, space);
		} else {
			__io__block.writeInt(__io__address + 4, space);
		}
	}

	/**
	 * Get method for struct member 'step_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance between volume samples. Lower values render more detail at the cost of performance. If set to zero, the step size is automatically determined based on voxel size
	 * @see #__DNA__FIELD__step_size
	 */
	
	public float getStep_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'step_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance between volume samples. Lower values render more detail at the cost of performance. If set to zero, the step size is automatically determined based on voxel size
	 * @see #__DNA__FIELD__step_size
	 */
	
	public void setStep_size(float step_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, step_size);
		} else {
			__io__block.writeFloat(__io__address + 8, step_size);
		}
	}

	/**
	 * Get method for struct member 'clipping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value under which voxels are considered empty space to optimize rendering
	 * @see #__DNA__FIELD__clipping
	 */
	
	public float getClipping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'clipping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value under which voxels are considered empty space to optimize rendering
	 * @see #__DNA__FIELD__clipping
	 */
	
	public void setClipping(float clipping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, clipping);
		} else {
			__io__block.writeFloat(__io__address + 12, clipping);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<VolumeRender> __io__addressof() {
		return new CPointer<VolumeRender>(__io__address, new Class[]{VolumeRender.class}, __io__block, __io__blockTable);
	}

}
