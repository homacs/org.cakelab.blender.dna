package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MDeformWeight'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class MDeformWeight extends CFacade {

	/**
	 * This is the sdna index of the struct MDeformWeight.
	 * <p>
	 * It is required when allocating a new block to store data for MDeformWeight.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 61;

	/**
	 * Field descriptor (offset) for struct member 'def_nr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MDeformWeight mdeformweight = ...;
	 * CPointer&lt;Object&gt; p = mdeformweight.__dna__addressof(MDeformWeight.__DNA__FIELD__def_nr);
	 * CPointer&lt;Integer&gt; p_def_nr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'def_nr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__def_nr = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'weight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MDeformWeight mdeformweight = ...;
	 * CPointer&lt;Object&gt; p = mdeformweight.__dna__addressof(MDeformWeight.__DNA__FIELD__weight);
	 * CPointer&lt;Float&gt; p_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__weight = new long[]{4, 4};

	public MDeformWeight(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MDeformWeight(MDeformWeight that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'def_nr'.
	 * @see #__DNA__FIELD__def_nr
	 */
	
	public int getDef_nr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'def_nr'.
	 * @see #__DNA__FIELD__def_nr
	 */
	
	public void setDef_nr(int def_nr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, def_nr);
		} else {
			__io__block.writeInt(__io__address + 0, def_nr);
		}
	}

	/**
	 * Get method for struct member 'weight'.
	 * @see #__DNA__FIELD__weight
	 */
	
	public float getWeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'weight'.
	 * @see #__DNA__FIELD__weight
	 */
	
	public void setWeight(float weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, weight);
		} else {
			__io__block.writeFloat(__io__address + 4, weight);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MDeformWeight> __io__addressof() {
		return new CPointer<MDeformWeight>(__io__address, new Class[]{MDeformWeight.class}, __io__block, __io__blockTable);
	}

}
