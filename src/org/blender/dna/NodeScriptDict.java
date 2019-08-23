package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeScriptDict'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=16)
public class NodeScriptDict extends CFacade {

	/**
	 * This is the sdna index of the struct NodeScriptDict.
	 * <p>
	 * It is required when allocating a new block to store data for NodeScriptDict.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 393;

	/**
	 * Field descriptor (offset) for struct member 'dict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For PyObject *dict. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeScriptDict nodescriptdict = ...;
	 * CPointer&lt;Object&gt; p = nodescriptdict.__dna__addressof(NodeScriptDict.__DNA__FIELD__dict);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_dict = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dict'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dict = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'node'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For BPy_Node *node. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeScriptDict nodescriptdict = ...;
	 * CPointer&lt;Object&gt; p = nodescriptdict.__dna__addressof(NodeScriptDict.__DNA__FIELD__node);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_node = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'node'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__node = new long[]{4, 8};

	public NodeScriptDict(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeScriptDict(NodeScriptDict that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'dict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For PyObject *dict. </p>
	 * @see #__DNA__FIELD__dict
	 */
	
	public CPointer<Object> getDict() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For PyObject *dict. </p>
	 * @see #__DNA__FIELD__dict
	 */
	
	public void setDict(CPointer<Object> dict) throws IOException
	{
		long __address = ((dict == null) ? 0 : dict.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'node'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For BPy_Node *node. </p>
	 * @see #__DNA__FIELD__node
	 */
	
	public CPointer<Object> getNode() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'node'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For BPy_Node *node. </p>
	 * @see #__DNA__FIELD__node
	 */
	
	public void setNode(CPointer<Object> node) throws IOException
	{
		long __address = ((node == null) ? 0 : node.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeScriptDict> __io__addressof() {
		return new CPointer<NodeScriptDict>(__io__address, new Class[]{NodeScriptDict.class}, __io__block, __io__blockTable);
	}

}
