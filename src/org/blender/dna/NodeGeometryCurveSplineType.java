package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryCurveSplineType'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class NodeGeometryCurveSplineType extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryCurveSplineType.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryCurveSplineType.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 523;

	/**
	 * Field descriptor (offset) for struct member 'spline_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeSplineType. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryCurveSplineType nodegeometrycurvesplinetype = ...;
	 * CPointer&lt;Object&gt; p = nodegeometrycurvesplinetype.__dna__addressof(NodeGeometryCurveSplineType.__DNA__FIELD__spline_type);
	 * CPointer&lt;Byte&gt; p_spline_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spline_type'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spline_type = new long[]{0, 0};

	public NodeGeometryCurveSplineType(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryCurveSplineType(NodeGeometryCurveSplineType that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'spline_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeSplineType. </p>
	 * @see #__DNA__FIELD__spline_type
	 */
	
	public byte getSpline_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'spline_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeSplineType. </p>
	 * @see #__DNA__FIELD__spline_type
	 */
	
	public void setSpline_type(byte spline_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, spline_type);
		} else {
			__io__block.writeByte(__io__address + 0, spline_type);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryCurveSplineType> __io__addressof() {
		return new CPointer<NodeGeometryCurveSplineType>(__io__address, new Class[]{NodeGeometryCurveSplineType.class}, __io__block, __io__blockTable);
	}

}
