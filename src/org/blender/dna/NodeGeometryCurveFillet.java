package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryCurveFillet'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class NodeGeometryCurveFillet extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryCurveFillet.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryCurveFillet.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 521;

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeCurveFilletMode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryCurveFillet nodegeometrycurvefillet = ...;
	 * CPointer&lt;Object&gt; p = nodegeometrycurvefillet.__dna__addressof(NodeGeometryCurveFillet.__DNA__FIELD__mode);
	 * CPointer&lt;Byte&gt; p_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{0, 0};

	public NodeGeometryCurveFillet(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryCurveFillet(NodeGeometryCurveFillet that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeCurveFilletMode. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public byte getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeCurveFilletMode. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(byte mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, mode);
		} else {
			__io__block.writeByte(__io__address + 0, mode);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryCurveFillet> __io__addressof() {
		return new CPointer<NodeGeometryCurveFillet>(__io__address, new Class[]{NodeGeometryCurveFillet.class}, __io__block, __io__blockTable);
	}

}
