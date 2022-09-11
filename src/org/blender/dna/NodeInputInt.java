package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeInputInt'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=4)
public class NodeInputInt extends CFacade {

	/**
	 * This is the sdna index of the struct NodeInputInt.
	 * <p>
	 * It is required when allocating a new block to store data for NodeInputInt.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 485;

	/**
	 * Field descriptor (offset) for struct member 'integer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeInputInt nodeinputint = ...;
	 * CPointer&lt;Object&gt; p = nodeinputint.__dna__addressof(NodeInputInt.__DNA__FIELD__integer);
	 * CPointer&lt;Integer&gt; p_integer = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'integer'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__integer = new long[]{0, 0};

	public NodeInputInt(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeInputInt(NodeInputInt that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'integer'.
	 * @see #__DNA__FIELD__integer
	 */
	
	public int getInteger() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'integer'.
	 * @see #__DNA__FIELD__integer
	 */
	
	public void setInteger(int integer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, integer);
		} else {
			__io__block.writeInt(__io__address + 0, integer);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeInputInt> __io__addressof() {
		return new CPointer<NodeInputInt>(__io__address, new Class[]{NodeInputInt.class}, __io__block, __io__blockTable);
	}

}
