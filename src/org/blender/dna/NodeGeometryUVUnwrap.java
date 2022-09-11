package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryUVUnwrap'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class NodeGeometryUVUnwrap extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryUVUnwrap.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryUVUnwrap.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 530;

	/**
	 * Field descriptor (offset) for struct member 'method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeUVUnwrapMethod. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryUVUnwrap nodegeometryuvunwrap = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryuvunwrap.__dna__addressof(NodeGeometryUVUnwrap.__DNA__FIELD__method);
	 * CPointer&lt;Byte&gt; p_method = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'method'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__method = new long[]{0, 0};

	public NodeGeometryUVUnwrap(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryUVUnwrap(NodeGeometryUVUnwrap that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeUVUnwrapMethod. </p>
	 * @see #__DNA__FIELD__method
	 */
	
	public byte getMethod() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeUVUnwrapMethod. </p>
	 * @see #__DNA__FIELD__method
	 */
	
	public void setMethod(byte method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, method);
		} else {
			__io__block.writeByte(__io__address + 0, method);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryUVUnwrap> __io__addressof() {
		return new CPointer<NodeGeometryUVUnwrap>(__io__address, new Class[]{NodeGeometryUVUnwrap.class}, __io__block, __io__blockTable);
	}

}
