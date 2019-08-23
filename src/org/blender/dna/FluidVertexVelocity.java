package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FluidVertexVelocity'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=12)
public class FluidVertexVelocity extends CFacade {

	/**
	 * This is the sdna index of the struct FluidVertexVelocity.
	 * <p>
	 * It is required when allocating a new block to store data for FluidVertexVelocity.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 164;

	/**
	 * Field descriptor (offset) for struct member 'vel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidVertexVelocity fluidvertexvelocity = ...;
	 * CPointer&lt;Object&gt; p = fluidvertexvelocity.__dna__addressof(FluidVertexVelocity.__DNA__FIELD__vel);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_vel = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vel'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vel = new long[]{0, 0};

	public FluidVertexVelocity(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FluidVertexVelocity(FluidVertexVelocity that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'vel'.
	 * @see #__DNA__FIELD__vel
	 */
	
	public CArrayFacade<Float> getVel() throws IOException
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
	 * Set method for struct member 'vel'.
	 * @see #__DNA__FIELD__vel
	 */
	
	public void setVel(CArrayFacade<Float> vel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(vel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vel);
		} else {
			__io__generic__copy( getVel(), vel);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FluidVertexVelocity> __io__addressof() {
		return new CPointer<FluidVertexVelocity>(__io__address, new Class[]{FluidVertexVelocity.class}, __io__block, __io__blockTable);
	}

}
