package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MFloatProperty'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Custom Data Properties </p>
 */

@CMetaData(size32=4, size64=4)
public class MFloatProperty extends CFacade {

	/**
	 * This is the sdna index of the struct MFloatProperty.
	 * <p>
	 * It is required when allocating a new block to store data for MFloatProperty.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 78;

	/**
	 * Field descriptor (offset) for struct member 'f'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MFloatProperty mfloatproperty = ...;
	 * CPointer&lt;Object&gt; p = mfloatproperty.__dna__addressof(MFloatProperty.__DNA__FIELD__f);
	 * CPointer&lt;Float&gt; p_f = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f = new long[]{0, 0};

	public MFloatProperty(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MFloatProperty(MFloatProperty that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'f'.
	 * @see #__DNA__FIELD__f
	 */
	
	public float getF() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'f'.
	 * @see #__DNA__FIELD__f
	 */
	
	public void setF(float f) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, f);
		} else {
			__io__block.writeFloat(__io__address + 0, f);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MFloatProperty> __io__addressof() {
		return new CPointer<MFloatProperty>(__io__address, new Class[]{MFloatProperty.class}, __io__block, __io__blockTable);
	}

}
