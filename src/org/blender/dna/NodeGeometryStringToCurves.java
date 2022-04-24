package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryStringToCurves'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=4)
public class NodeGeometryStringToCurves extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryStringToCurves.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryStringToCurves.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 544;

	/**
	 * Field descriptor (offset) for struct member 'overflow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeStringToCurvesOverflowMode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryStringToCurves nodegeometrystringtocurves = ...;
	 * CPointer&lt;Object&gt; p = nodegeometrystringtocurves.__dna__addressof(NodeGeometryStringToCurves.__DNA__FIELD__overflow);
	 * CPointer&lt;Byte&gt; p_overflow = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overflow'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overflow = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'align_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeStringToCurvesAlignXMode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryStringToCurves nodegeometrystringtocurves = ...;
	 * CPointer&lt;Object&gt; p = nodegeometrystringtocurves.__dna__addressof(NodeGeometryStringToCurves.__DNA__FIELD__align_x);
	 * CPointer&lt;Byte&gt; p_align_x = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'align_x'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__align_x = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'align_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeStringToCurvesAlignYMode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryStringToCurves nodegeometrystringtocurves = ...;
	 * CPointer&lt;Object&gt; p = nodegeometrystringtocurves.__dna__addressof(NodeGeometryStringToCurves.__DNA__FIELD__align_y);
	 * CPointer&lt;Byte&gt; p_align_y = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'align_y'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__align_y = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'pivot_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryStringToCurves nodegeometrystringtocurves = ...;
	 * CPointer&lt;Object&gt; p = nodegeometrystringtocurves.__dna__addressof(NodeGeometryStringToCurves.__DNA__FIELD__pivot_mode);
	 * CPointer&lt;Byte&gt; p_pivot_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pivot_mode'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pivot_mode = new long[]{3, 3};

	public NodeGeometryStringToCurves(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryStringToCurves(NodeGeometryStringToCurves that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'overflow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeStringToCurvesOverflowMode </p>
	 * @see #__DNA__FIELD__overflow
	 */
	
	public byte getOverflow() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'overflow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeStringToCurvesOverflowMode </p>
	 * @see #__DNA__FIELD__overflow
	 */
	
	public void setOverflow(byte overflow) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, overflow);
		} else {
			__io__block.writeByte(__io__address + 0, overflow);
		}
	}

	/**
	 * Get method for struct member 'align_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeStringToCurvesAlignXMode </p>
	 * @see #__DNA__FIELD__align_x
	 */
	
	public byte getAlign_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'align_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeStringToCurvesAlignXMode </p>
	 * @see #__DNA__FIELD__align_x
	 */
	
	public void setAlign_x(byte align_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, align_x);
		} else {
			__io__block.writeByte(__io__address + 1, align_x);
		}
	}

	/**
	 * Get method for struct member 'align_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeStringToCurvesAlignYMode </p>
	 * @see #__DNA__FIELD__align_y
	 */
	
	public byte getAlign_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'align_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeStringToCurvesAlignYMode </p>
	 * @see #__DNA__FIELD__align_y
	 */
	
	public void setAlign_y(byte align_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, align_y);
		} else {
			__io__block.writeByte(__io__address + 2, align_y);
		}
	}

	/**
	 * Get method for struct member 'pivot_mode'.
	 * @see #__DNA__FIELD__pivot_mode
	 */
	
	public byte getPivot_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'pivot_mode'.
	 * @see #__DNA__FIELD__pivot_mode
	 */
	
	public void setPivot_mode(byte pivot_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, pivot_mode);
		} else {
			__io__block.writeByte(__io__address + 3, pivot_mode);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryStringToCurves> __io__addressof() {
		return new CPointer<NodeGeometryStringToCurves>(__io__address, new Class[]{NodeGeometryStringToCurves.class}, __io__block, __io__blockTable);
	}

}
