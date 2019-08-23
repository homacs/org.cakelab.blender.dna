package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bIKParam'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> header for all bPose->ikparam structures </p>
 */

@CMetaData(size32=4, size64=4)
public class bIKParam extends CFacade {

	/**
	 * This is the sdna index of the struct bIKParam.
	 * <p>
	 * It is required when allocating a new block to store data for bIKParam.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 349;

	/**
	 * Field descriptor (offset) for struct member 'iksolver'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bIKParam bikparam = ...;
	 * CPointer&lt;Object&gt; p = bikparam.__dna__addressof(bIKParam.__DNA__FIELD__iksolver);
	 * CPointer&lt;Integer&gt; p_iksolver = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iksolver'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iksolver = new long[]{0, 0};

	public bIKParam(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bIKParam(bIKParam that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'iksolver'.
	 * @see #__DNA__FIELD__iksolver
	 */
	
	public int getIksolver() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'iksolver'.
	 * @see #__DNA__FIELD__iksolver
	 */
	
	public void setIksolver(int iksolver) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, iksolver);
		} else {
			__io__block.writeInt(__io__address + 0, iksolver);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bIKParam> __io__addressof() {
		return new CPointer<bIKParam>(__io__address, new Class[]{bIKParam.class}, __io__block, __io__blockTable);
	}

}
