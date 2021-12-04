package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryMeshCone'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class NodeGeometryMeshCone extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryMeshCone.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryMeshCone.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 515;

	/**
	 * Field descriptor (offset) for struct member 'fill_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeMeshCircleFillType. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryMeshCone nodegeometrymeshcone = ...;
	 * CPointer&lt;Object&gt; p = nodegeometrymeshcone.__dna__addressof(NodeGeometryMeshCone.__DNA__FIELD__fill_type);
	 * CPointer&lt;Byte&gt; p_fill_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fill_type'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fill_type = new long[]{0, 0};

	public NodeGeometryMeshCone(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryMeshCone(NodeGeometryMeshCone that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'fill_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeMeshCircleFillType. </p>
	 * @see #__DNA__FIELD__fill_type
	 */
	
	public byte getFill_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'fill_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeMeshCircleFillType. </p>
	 * @see #__DNA__FIELD__fill_type
	 */
	
	public void setFill_type(byte fill_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, fill_type);
		} else {
			__io__block.writeByte(__io__address + 0, fill_type);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryMeshCone> __io__addressof() {
		return new CPointer<NodeGeometryMeshCone>(__io__address, new Class[]{NodeGeometryMeshCone.class}, __io__block, __io__blockTable);
	}

}
