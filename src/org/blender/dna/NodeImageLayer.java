package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeImageLayer'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class NodeImageLayer extends CFacade {

	/**
	 * This is the sdna index of the struct NodeImageLayer.
	 * <p>
	 * It is required when allocating a new block to store data for NodeImageLayer.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 367;

	/**
	 * Field descriptor (offset) for struct member 'pass_index'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageLayer nodeimagelayer = ...;
	 * CPointer&lt;Object&gt; p = nodeimagelayer.__dna__addressof(NodeImageLayer.__DNA__FIELD__pass_index);
	 * CPointer&lt;Integer&gt; p_pass_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass_index = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'pass_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeImageLayer nodeimagelayer = ...;
	 * CPointer&lt;Object&gt; p = nodeimagelayer.__dna__addressof(NodeImageLayer.__DNA__FIELD__pass_flag);
	 * CPointer&lt;Integer&gt; p_pass_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass_flag = new long[]{4, 4};

	public NodeImageLayer(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeImageLayer(NodeImageLayer that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'pass_index'.
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public int getPass_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'pass_index'.
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public void setPass_index(int pass_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, pass_index);
		} else {
			__io__block.writeInt(__io__address + 0, pass_index);
		}
	}

	/**
	 * Get method for struct member 'pass_flag'.
	 * @see #__DNA__FIELD__pass_flag
	 */
	
	public int getPass_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'pass_flag'.
	 * @see #__DNA__FIELD__pass_flag
	 */
	
	public void setPass_flag(int pass_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, pass_flag);
		} else {
			__io__block.writeInt(__io__address + 4, pass_flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeImageLayer> __io__addressof() {
		return new CPointer<NodeImageLayer>(__io__address, new Class[]{NodeImageLayer.class}, __io__block, __io__blockTable);
	}

}
