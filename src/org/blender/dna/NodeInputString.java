package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeInputString'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=8)
public class NodeInputString extends CFacade {

	/**
	 * This is the sdna index of the struct NodeInputString.
	 * <p>
	 * It is required when allocating a new block to store data for NodeInputString.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 501;

	/**
	 * Field descriptor (offset) for struct member 'string'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeInputString nodeinputstring = ...;
	 * CPointer&lt;Object&gt; p = nodeinputstring.__dna__addressof(NodeInputString.__DNA__FIELD__string);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_string = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'string'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__string = new long[]{0, 0};

	public NodeInputString(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeInputString(NodeInputString that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'string'.
	 * @see #__DNA__FIELD__string
	 */
	
	public CPointer<Byte> getString() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'string'.
	 * @see #__DNA__FIELD__string
	 */
	
	public void setString(CPointer<Byte> string) throws IOException
	{
		long __address = ((string == null) ? 0 : string.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeInputString> __io__addressof() {
		return new CPointer<NodeInputString>(__io__address, new Class[]{NodeInputString.class}, __io__block, __io__blockTable);
	}

}
