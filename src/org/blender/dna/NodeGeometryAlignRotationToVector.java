package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryAlignRotationToVector'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=4)
public class NodeGeometryAlignRotationToVector extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryAlignRotationToVector.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryAlignRotationToVector.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 503;

	/**
	 * Field descriptor (offset) for struct member 'axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeAlignRotationToVectorAxis </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryAlignRotationToVector nodegeometryalignrotationtovector = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryalignrotationtovector.__dna__addressof(NodeGeometryAlignRotationToVector.__DNA__FIELD__axis);
	 * CPointer&lt;Byte&gt; p_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axis'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axis = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'pivot_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeAlignRotationToVectorPivotAxis </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryAlignRotationToVector nodegeometryalignrotationtovector = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryalignrotationtovector.__dna__addressof(NodeGeometryAlignRotationToVector.__DNA__FIELD__pivot_axis);
	 * CPointer&lt;Byte&gt; p_pivot_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pivot_axis'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pivot_axis = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'input_type_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryAlignRotationToVector nodegeometryalignrotationtovector = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryalignrotationtovector.__dna__addressof(NodeGeometryAlignRotationToVector.__DNA__FIELD__input_type_factor);
	 * CPointer&lt;Byte&gt; p_input_type_factor = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_factor'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_factor = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'input_type_vector'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryAlignRotationToVector nodegeometryalignrotationtovector = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryalignrotationtovector.__dna__addressof(NodeGeometryAlignRotationToVector.__DNA__FIELD__input_type_vector);
	 * CPointer&lt;Byte&gt; p_input_type_vector = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_vector'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_vector = new long[]{3, 3};

	public NodeGeometryAlignRotationToVector(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryAlignRotationToVector(NodeGeometryAlignRotationToVector that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeAlignRotationToVectorAxis </p>
	 * @see #__DNA__FIELD__axis
	 */
	
	public byte getAxis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeAlignRotationToVectorAxis </p>
	 * @see #__DNA__FIELD__axis
	 */
	
	public void setAxis(byte axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, axis);
		} else {
			__io__block.writeByte(__io__address + 0, axis);
		}
	}

	/**
	 * Get method for struct member 'pivot_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeAlignRotationToVectorPivotAxis </p>
	 * @see #__DNA__FIELD__pivot_axis
	 */
	
	public byte getPivot_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'pivot_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeAlignRotationToVectorPivotAxis </p>
	 * @see #__DNA__FIELD__pivot_axis
	 */
	
	public void setPivot_axis(byte pivot_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, pivot_axis);
		} else {
			__io__block.writeByte(__io__address + 1, pivot_axis);
		}
	}

	/**
	 * Get method for struct member 'input_type_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * @see #__DNA__FIELD__input_type_factor
	 */
	
	public byte getInput_type_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'input_type_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * @see #__DNA__FIELD__input_type_factor
	 */
	
	public void setInput_type_factor(byte input_type_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, input_type_factor);
		} else {
			__io__block.writeByte(__io__address + 2, input_type_factor);
		}
	}

	/**
	 * Get method for struct member 'input_type_vector'.
	 * @see #__DNA__FIELD__input_type_vector
	 */
	
	public byte getInput_type_vector() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'input_type_vector'.
	 * @see #__DNA__FIELD__input_type_vector
	 */
	
	public void setInput_type_vector(byte input_type_vector) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, input_type_vector);
		} else {
			__io__block.writeByte(__io__address + 3, input_type_vector);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryAlignRotationToVector> __io__addressof() {
		return new CPointer<NodeGeometryAlignRotationToVector>(__io__address, new Class[]{NodeGeometryAlignRotationToVector.class}, __io__block, __io__blockTable);
	}

}
