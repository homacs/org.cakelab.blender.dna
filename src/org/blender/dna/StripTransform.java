package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'StripTransform'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class StripTransform extends CFacade {

	/**
	 * This is the sdna index of the struct StripTransform.
	 * <p>
	 * It is required when allocating a new block to store data for StripTransform.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 264;

	/**
	 * Field descriptor (offset) for struct member 'xofs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripTransform striptransform = ...;
	 * CPointer&lt;Object&gt; p = striptransform.__dna__addressof(StripTransform.__DNA__FIELD__xofs);
	 * CPointer&lt;Integer&gt; p_xofs = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xofs'</li>
	 * <li>Signature: 'int'</li>
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
	 * CPointer&lt;Integer&gt; p_yofs = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yofs'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yofs = new long[]{4, 4};

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
	
	public int getXofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'xofs'.
	 * @see #__DNA__FIELD__xofs
	 */
	
	public void setXofs(int xofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, xofs);
		} else {
			__io__block.writeInt(__io__address + 0, xofs);
		}
	}

	/**
	 * Get method for struct member 'yofs'.
	 * @see #__DNA__FIELD__yofs
	 */
	
	public int getYofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'yofs'.
	 * @see #__DNA__FIELD__yofs
	 */
	
	public void setYofs(int yofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, yofs);
		} else {
			__io__block.writeInt(__io__address + 4, yofs);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<StripTransform> __io__addressof() {
		return new CPointer<StripTransform>(__io__address, new Class[]{StripTransform.class}, __io__block, __io__blockTable);
	}

}
