package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeTranslateData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=2, size64=2)
public class NodeTranslateData extends CFacade {

	/**
	 * This is the sdna index of the struct NodeTranslateData.
	 * <p>
	 * It is required when allocating a new block to store data for NodeTranslateData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 467;

	/**
	 * Field descriptor (offset) for struct member 'wrap_axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTranslateData nodetranslatedata = ...;
	 * CPointer&lt;Object&gt; p = nodetranslatedata.__dna__addressof(NodeTranslateData.__DNA__FIELD__wrap_axis);
	 * CPointer&lt;Byte&gt; p_wrap_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wrap_axis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wrap_axis = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'relative'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTranslateData nodetranslatedata = ...;
	 * CPointer&lt;Object&gt; p = nodetranslatedata.__dna__addressof(NodeTranslateData.__DNA__FIELD__relative);
	 * CPointer&lt;Byte&gt; p_relative = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'relative'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__relative = new long[]{1, 1};

	public NodeTranslateData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeTranslateData(NodeTranslateData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'wrap_axis'.
	 * @see #__DNA__FIELD__wrap_axis
	 */
	
	public byte getWrap_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'wrap_axis'.
	 * @see #__DNA__FIELD__wrap_axis
	 */
	
	public void setWrap_axis(byte wrap_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, wrap_axis);
		} else {
			__io__block.writeByte(__io__address + 0, wrap_axis);
		}
	}

	/**
	 * Get method for struct member 'relative'.
	 * @see #__DNA__FIELD__relative
	 */
	
	public byte getRelative() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'relative'.
	 * @see #__DNA__FIELD__relative
	 */
	
	public void setRelative(byte relative) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, relative);
		} else {
			__io__block.writeByte(__io__address + 1, relative);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeTranslateData> __io__addressof() {
		return new CPointer<NodeTranslateData>(__io__address, new Class[]{NodeTranslateData.class}, __io__block, __io__blockTable);
	}

}
