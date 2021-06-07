package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryObjectInfo'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class NodeGeometryObjectInfo extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryObjectInfo.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryObjectInfo.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 481;

	/**
	 * Field descriptor (offset) for struct member 'transform_space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeTransformSpace. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryObjectInfo nodegeometryobjectinfo = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryobjectinfo.__dna__addressof(NodeGeometryObjectInfo.__DNA__FIELD__transform_space);
	 * CPointer&lt;Byte&gt; p_transform_space = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transform_space'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transform_space = new long[]{0, 0};

	public NodeGeometryObjectInfo(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryObjectInfo(NodeGeometryObjectInfo that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'transform_space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeTransformSpace. </p>
	 * @see #__DNA__FIELD__transform_space
	 */
	
	public byte getTransform_space() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'transform_space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeTransformSpace. </p>
	 * @see #__DNA__FIELD__transform_space
	 */
	
	public void setTransform_space(byte transform_space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, transform_space);
		} else {
			__io__block.writeByte(__io__address + 0, transform_space);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryObjectInfo> __io__addressof() {
		return new CPointer<NodeGeometryObjectInfo>(__io__address, new Class[]{NodeGeometryObjectInfo.class}, __io__block, __io__blockTable);
	}

}
