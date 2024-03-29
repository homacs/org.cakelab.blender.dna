package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MIntProperty'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=4)
public class MIntProperty extends CFacade {

	/**
	 * This is the sdna index of the struct MIntProperty.
	 * <p>
	 * It is required when allocating a new block to store data for MIntProperty.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 301;

	/**
	 * Field descriptor (offset) for struct member 'i'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MIntProperty mintproperty = ...;
	 * CPointer&lt;Object&gt; p = mintproperty.__dna__addressof(MIntProperty.__DNA__FIELD__i);
	 * CPointer&lt;Integer&gt; p_i = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'i'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__i = new long[]{0, 0};

	public MIntProperty(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MIntProperty(MIntProperty that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'i'.
	 * @see #__DNA__FIELD__i
	 */
	
	public int getI() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'i'.
	 * @see #__DNA__FIELD__i
	 */
	
	public void setI(int i) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, i);
		} else {
			__io__block.writeInt(__io__address + 0, i);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MIntProperty> __io__addressof() {
		return new CPointer<MIntProperty>(__io__address, new Class[]{MIntProperty.class}, __io__block, __io__blockTable);
	}

}
