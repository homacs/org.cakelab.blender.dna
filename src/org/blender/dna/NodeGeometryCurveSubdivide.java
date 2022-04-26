package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryCurveSubdivide'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class NodeGeometryCurveSubdivide extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryCurveSubdivide.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryCurveSubdivide.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 533;

	/**
	 * Field descriptor (offset) for struct member 'cuts_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode (integer or attribute). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryCurveSubdivide nodegeometrycurvesubdivide = ...;
	 * CPointer&lt;Object&gt; p = nodegeometrycurvesubdivide.__dna__addressof(NodeGeometryCurveSubdivide.__DNA__FIELD__cuts_type);
	 * CPointer&lt;Byte&gt; p_cuts_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cuts_type'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cuts_type = new long[]{0, 0};

	public NodeGeometryCurveSubdivide(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryCurveSubdivide(NodeGeometryCurveSubdivide that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'cuts_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode (integer or attribute). </p>
	 * @see #__DNA__FIELD__cuts_type
	 */
	
	public byte getCuts_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'cuts_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode (integer or attribute). </p>
	 * @see #__DNA__FIELD__cuts_type
	 */
	
	public void setCuts_type(byte cuts_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, cuts_type);
		} else {
			__io__block.writeByte(__io__address + 0, cuts_type);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryCurveSubdivide> __io__addressof() {
		return new CPointer<NodeGeometryCurveSubdivide>(__io__address, new Class[]{NodeGeometryCurveSubdivide.class}, __io__block, __io__blockTable);
	}

}
