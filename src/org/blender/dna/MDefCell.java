package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MDefCell'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class MDefCell extends CFacade {

	/**
	 * This is the sdna index of the struct MDefCell.
	 * <p>
	 * It is required when allocating a new block to store data for MDefCell.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 115;

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MDefCell mdefcell = ...;
	 * CPointer&lt;Object&gt; p = mdefcell.__dna__addressof(MDefCell.__DNA__FIELD__offset);
	 * CPointer&lt;Integer&gt; p_offset = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'totinfluence'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MDefCell mdefcell = ...;
	 * CPointer&lt;Object&gt; p = mdefcell.__dna__addressof(MDefCell.__DNA__FIELD__totinfluence);
	 * CPointer&lt;Integer&gt; p_totinfluence = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totinfluence'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totinfluence = new long[]{4, 4};

	public MDefCell(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MDefCell(MDefCell that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public int getOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(int offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, offset);
		} else {
			__io__block.writeInt(__io__address + 0, offset);
		}
	}

	/**
	 * Get method for struct member 'totinfluence'.
	 * @see #__DNA__FIELD__totinfluence
	 */
	
	public int getTotinfluence() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'totinfluence'.
	 * @see #__DNA__FIELD__totinfluence
	 */
	
	public void setTotinfluence(int totinfluence) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, totinfluence);
		} else {
			__io__block.writeInt(__io__address + 4, totinfluence);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MDefCell> __io__addressof() {
		return new CPointer<MDefCell>(__io__address, new Class[]{MDefCell.class}, __io__block, __io__blockTable);
	}

}
