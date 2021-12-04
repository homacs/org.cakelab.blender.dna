package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryCollectionInfo'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class NodeGeometryCollectionInfo extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryCollectionInfo.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryCollectionInfo.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 505;

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
	 * NodeGeometryCollectionInfo nodegeometrycollectioninfo = ...;
	 * CPointer&lt;Object&gt; p = nodegeometrycollectioninfo.__dna__addressof(NodeGeometryCollectionInfo.__DNA__FIELD__transform_space);
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

	public NodeGeometryCollectionInfo(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryCollectionInfo(NodeGeometryCollectionInfo that) {
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
	public CPointer<NodeGeometryCollectionInfo> __io__addressof() {
		return new CPointer<NodeGeometryCollectionInfo>(__io__address, new Class[]{NodeGeometryCollectionInfo.class}, __io__block, __io__blockTable);
	}

}
