package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeInputBool'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class NodeInputBool extends CFacade {

	/**
	 * This is the sdna index of the struct NodeInputBool.
	 * <p>
	 * It is required when allocating a new block to store data for NodeInputBool.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 484;

	/**
	 * Field descriptor (offset) for struct member 'boolean'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeInputBool nodeinputbool = ...;
	 * CPointer&lt;Object&gt; p = nodeinputbool.__dna__addressof(NodeInputBool.__DNA__FIELD__boolean);
	 * CPointer&lt;Byte&gt; p_boolean = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'boolean'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__boolean = new long[]{0, 0};

	public NodeInputBool(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeInputBool(NodeInputBool that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'boolean'.
	 * @see #__DNA__FIELD__boolean
	 */
	
	public byte getBoolean() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'boolean'.
	 * @see #__DNA__FIELD__boolean
	 */
	
	public void setBoolean(byte _boolean) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, _boolean);
		} else {
			__io__block.writeByte(__io__address + 0, _boolean);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeInputBool> __io__addressof() {
		return new CPointer<NodeInputBool>(__io__address, new Class[]{NodeInputBool.class}, __io__block, __io__blockTable);
	}

}
