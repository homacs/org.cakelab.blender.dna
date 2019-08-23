package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MSelect'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class MSelect extends CFacade {

	/**
	 * This is the sdna index of the struct MSelect.
	 * <p>
	 * It is required when allocating a new block to store data for MSelect.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 76;

	/**
	 * Field descriptor (offset) for struct member 'index'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MSelect mselect = ...;
	 * CPointer&lt;Object&gt; p = mselect.__dna__addressof(MSelect.__DNA__FIELD__index);
	 * CPointer&lt;Integer&gt; p_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__index = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ME_VSEL/ME_ESEL/ME_FSEL. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MSelect mselect = ...;
	 * CPointer&lt;Object&gt; p = mselect.__dna__addressof(MSelect.__DNA__FIELD__type);
	 * CPointer&lt;Integer&gt; p_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{4, 4};

	public MSelect(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MSelect(MSelect that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'index'.
	 * @see #__DNA__FIELD__index
	 */
	
	public int getIndex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'index'.
	 * @see #__DNA__FIELD__index
	 */
	
	public void setIndex(int index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, index);
		} else {
			__io__block.writeInt(__io__address + 0, index);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ME_VSEL/ME_ESEL/ME_FSEL. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public int getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ME_VSEL/ME_ESEL/ME_FSEL. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(int type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, type);
		} else {
			__io__block.writeInt(__io__address + 4, type);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MSelect> __io__addressof() {
		return new CPointer<MSelect>(__io__address, new Class[]{MSelect.class}, __io__block, __io__blockTable);
	}

}
