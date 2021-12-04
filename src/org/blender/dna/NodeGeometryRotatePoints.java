package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryRotatePoints'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class NodeGeometryRotatePoints extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryRotatePoints.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryRotatePoints.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 498;

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeRotatePointsType </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryRotatePoints nodegeometryrotatepoints = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryrotatepoints.__dna__addressof(NodeGeometryRotatePoints.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeRotatePointsSpace </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryRotatePoints nodegeometryrotatepoints = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryrotatepoints.__dna__addressof(NodeGeometryRotatePoints.__DNA__FIELD__space);
	 * CPointer&lt;Byte&gt; p_space = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'space'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__space = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'input_type_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryRotatePoints nodegeometryrotatepoints = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryrotatepoints.__dna__addressof(NodeGeometryRotatePoints.__DNA__FIELD__input_type_axis);
	 * CPointer&lt;Byte&gt; p_input_type_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_axis'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_axis = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'input_type_angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryRotatePoints nodegeometryrotatepoints = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryrotatepoints.__dna__addressof(NodeGeometryRotatePoints.__DNA__FIELD__input_type_angle);
	 * CPointer&lt;Byte&gt; p_input_type_angle = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_angle'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_angle = new long[]{3, 3};

	/**
	 * Field descriptor (offset) for struct member 'input_type_rotation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryRotatePoints nodegeometryrotatepoints = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryrotatepoints.__dna__addressof(NodeGeometryRotatePoints.__DNA__FIELD__input_type_rotation);
	 * CPointer&lt;Byte&gt; p_input_type_rotation = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_rotation'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_rotation = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryRotatePoints nodegeometryrotatepoints = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryrotatepoints.__dna__addressof(NodeGeometryRotatePoints.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{5, 5};

	public NodeGeometryRotatePoints(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryRotatePoints(NodeGeometryRotatePoints that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeRotatePointsType </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeRotatePointsType </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, type);
		} else {
			__io__block.writeByte(__io__address + 0, type);
		}
	}

	/**
	 * Get method for struct member 'space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeRotatePointsSpace </p>
	 * @see #__DNA__FIELD__space
	 */
	
	public byte getSpace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeRotatePointsSpace </p>
	 * @see #__DNA__FIELD__space
	 */
	
	public void setSpace(byte space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, space);
		} else {
			__io__block.writeByte(__io__address + 1, space);
		}
	}

	/**
	 * Get method for struct member 'input_type_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * @see #__DNA__FIELD__input_type_axis
	 */
	
	public byte getInput_type_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'input_type_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * @see #__DNA__FIELD__input_type_axis
	 */
	
	public void setInput_type_axis(byte input_type_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, input_type_axis);
		} else {
			__io__block.writeByte(__io__address + 2, input_type_axis);
		}
	}

	/**
	 * Get method for struct member 'input_type_angle'.
	 * @see #__DNA__FIELD__input_type_angle
	 */
	
	public byte getInput_type_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'input_type_angle'.
	 * @see #__DNA__FIELD__input_type_angle
	 */
	
	public void setInput_type_angle(byte input_type_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, input_type_angle);
		} else {
			__io__block.writeByte(__io__address + 3, input_type_angle);
		}
	}

	/**
	 * Get method for struct member 'input_type_rotation'.
	 * @see #__DNA__FIELD__input_type_rotation
	 */
	
	public byte getInput_type_rotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 4);
		} else {
			return __io__block.readByte(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'input_type_rotation'.
	 * @see #__DNA__FIELD__input_type_rotation
	 */
	
	public void setInput_type_rotation(byte input_type_rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 4, input_type_rotation);
		} else {
			__io__block.writeByte(__io__address + 4, input_type_rotation);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 5, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 5, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 5;
		} else {
			__dna__offset = 5;
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
	public CPointer<NodeGeometryRotatePoints> __io__addressof() {
		return new CPointer<NodeGeometryRotatePoints>(__io__address, new Class[]{NodeGeometryRotatePoints.class}, __io__block, __io__blockTable);
	}

}
