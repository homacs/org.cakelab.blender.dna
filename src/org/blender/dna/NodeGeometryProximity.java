package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryProximity'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class NodeGeometryProximity extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryProximity.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryProximity.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 507;

	/**
	 * Field descriptor (offset) for struct member 'target_element'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeProximityTargetType. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryProximity nodegeometryproximity = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryproximity.__dna__addressof(NodeGeometryProximity.__DNA__FIELD__target_element);
	 * CPointer&lt;Byte&gt; p_target_element = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'target_element'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__target_element = new long[]{0, 0};

	public NodeGeometryProximity(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryProximity(NodeGeometryProximity that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'target_element'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeProximityTargetType. </p>
	 * @see #__DNA__FIELD__target_element
	 */
	
	public byte getTarget_element() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'target_element'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeProximityTargetType. </p>
	 * @see #__DNA__FIELD__target_element
	 */
	
	public void setTarget_element(byte target_element) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, target_element);
		} else {
			__io__block.writeByte(__io__address + 0, target_element);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryProximity> __io__addressof() {
		return new CPointer<NodeGeometryProximity>(__io__address, new Class[]{NodeGeometryProximity.class}, __io__block, __io__blockTable);
	}

}
