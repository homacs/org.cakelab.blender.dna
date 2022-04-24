package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeAttributeVectorRotate'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class NodeAttributeVectorRotate extends CFacade {

	/**
	 * This is the sdna index of the struct NodeAttributeVectorRotate.
	 * <p>
	 * It is required when allocating a new block to store data for NodeAttributeVectorRotate.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 494;

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeVectorRotateMode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeVectorRotate nodeattributevectorrotate = ...;
	 * CPointer&lt;Object&gt; p = nodeattributevectorrotate.__dna__addressof(NodeAttributeVectorRotate.__DNA__FIELD__mode);
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

	/**
	 * Field descriptor (offset) for struct member 'input_type_vector'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeVectorRotate nodeattributevectorrotate = ...;
	 * CPointer&lt;Object&gt; p = nodeattributevectorrotate.__dna__addressof(NodeAttributeVectorRotate.__DNA__FIELD__input_type_vector);
	 * CPointer&lt;Byte&gt; p_input_type_vector = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_vector'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_vector = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'input_type_center'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeVectorRotate nodeattributevectorrotate = ...;
	 * CPointer&lt;Object&gt; p = nodeattributevectorrotate.__dna__addressof(NodeAttributeVectorRotate.__DNA__FIELD__input_type_center);
	 * CPointer&lt;Byte&gt; p_input_type_center = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_center'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_center = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'input_type_axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeVectorRotate nodeattributevectorrotate = ...;
	 * CPointer&lt;Object&gt; p = nodeattributevectorrotate.__dna__addressof(NodeAttributeVectorRotate.__DNA__FIELD__input_type_axis);
	 * CPointer&lt;Byte&gt; p_input_type_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_axis'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_axis = new long[]{3, 3};

	/**
	 * Field descriptor (offset) for struct member 'input_type_angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeVectorRotate nodeattributevectorrotate = ...;
	 * CPointer&lt;Object&gt; p = nodeattributevectorrotate.__dna__addressof(NodeAttributeVectorRotate.__DNA__FIELD__input_type_angle);
	 * CPointer&lt;Byte&gt; p_input_type_angle = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_angle'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_angle = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'input_type_rotation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeVectorRotate nodeattributevectorrotate = ...;
	 * CPointer&lt;Object&gt; p = nodeattributevectorrotate.__dna__addressof(NodeAttributeVectorRotate.__DNA__FIELD__input_type_rotation);
	 * CPointer&lt;Byte&gt; p_input_type_rotation = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_rotation'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_rotation = new long[]{5, 5};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeVectorRotate nodeattributevectorrotate = ...;
	 * CPointer&lt;Object&gt; p = nodeattributevectorrotate.__dna__addressof(NodeAttributeVectorRotate.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{6, 6};

	public NodeAttributeVectorRotate(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeAttributeVectorRotate(NodeAttributeVectorRotate that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeVectorRotateMode </p>
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
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeVectorRotateMode </p>
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
	 * Get method for struct member 'input_type_vector'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * @see #__DNA__FIELD__input_type_vector
	 */
	
	public byte getInput_type_vector() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'input_type_vector'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * @see #__DNA__FIELD__input_type_vector
	 */
	
	public void setInput_type_vector(byte input_type_vector) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, input_type_vector);
		} else {
			__io__block.writeByte(__io__address + 1, input_type_vector);
		}
	}

	/**
	 * Get method for struct member 'input_type_center'.
	 * @see #__DNA__FIELD__input_type_center
	 */
	
	public byte getInput_type_center() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'input_type_center'.
	 * @see #__DNA__FIELD__input_type_center
	 */
	
	public void setInput_type_center(byte input_type_center) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, input_type_center);
		} else {
			__io__block.writeByte(__io__address + 2, input_type_center);
		}
	}

	/**
	 * Get method for struct member 'input_type_axis'.
	 * @see #__DNA__FIELD__input_type_axis
	 */
	
	public byte getInput_type_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'input_type_axis'.
	 * @see #__DNA__FIELD__input_type_axis
	 */
	
	public void setInput_type_axis(byte input_type_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, input_type_axis);
		} else {
			__io__block.writeByte(__io__address + 3, input_type_axis);
		}
	}

	/**
	 * Get method for struct member 'input_type_angle'.
	 * @see #__DNA__FIELD__input_type_angle
	 */
	
	public byte getInput_type_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 4);
		} else {
			return __io__block.readByte(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'input_type_angle'.
	 * @see #__DNA__FIELD__input_type_angle
	 */
	
	public void setInput_type_angle(byte input_type_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 4, input_type_angle);
		} else {
			__io__block.writeByte(__io__address + 4, input_type_angle);
		}
	}

	/**
	 * Get method for struct member 'input_type_rotation'.
	 * @see #__DNA__FIELD__input_type_rotation
	 */
	
	public byte getInput_type_rotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 5);
		} else {
			return __io__block.readByte(__io__address + 5);
		}
	}

	/**
	 * Set method for struct member 'input_type_rotation'.
	 * @see #__DNA__FIELD__input_type_rotation
	 */
	
	public void setInput_type_rotation(byte input_type_rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 5, input_type_rotation);
		} else {
			__io__block.writeByte(__io__address + 5, input_type_rotation);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 6, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 6, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 6;
		} else {
			__dna__offset = 6;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeAttributeVectorRotate> __io__addressof() {
		return new CPointer<NodeAttributeVectorRotate>(__io__address, new Class[]{NodeAttributeVectorRotate.class}, __io__block, __io__blockTable);
	}

}
