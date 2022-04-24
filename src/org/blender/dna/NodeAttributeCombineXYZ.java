package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeAttributeCombineXYZ'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=4)
public class NodeAttributeCombineXYZ extends CFacade {

	/**
	 * This is the sdna index of the struct NodeAttributeCombineXYZ.
	 * <p>
	 * It is required when allocating a new block to store data for NodeAttributeCombineXYZ.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 514;

	/**
	 * Field descriptor (offset) for struct member 'input_type_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeCombineXYZ nodeattributecombinexyz = ...;
	 * CPointer&lt;Object&gt; p = nodeattributecombinexyz.__dna__addressof(NodeAttributeCombineXYZ.__DNA__FIELD__input_type_x);
	 * CPointer&lt;Byte&gt; p_input_type_x = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_x'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_x = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'input_type_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeCombineXYZ nodeattributecombinexyz = ...;
	 * CPointer&lt;Object&gt; p = nodeattributecombinexyz.__dna__addressof(NodeAttributeCombineXYZ.__DNA__FIELD__input_type_y);
	 * CPointer&lt;Byte&gt; p_input_type_y = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_y'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_y = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'input_type_z'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeCombineXYZ nodeattributecombinexyz = ...;
	 * CPointer&lt;Object&gt; p = nodeattributecombinexyz.__dna__addressof(NodeAttributeCombineXYZ.__DNA__FIELD__input_type_z);
	 * CPointer&lt;Byte&gt; p_input_type_z = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_z'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_z = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeCombineXYZ nodeattributecombinexyz = ...;
	 * CPointer&lt;Object&gt; p = nodeattributecombinexyz.__dna__addressof(NodeAttributeCombineXYZ.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{3, 3};

	public NodeAttributeCombineXYZ(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeAttributeCombineXYZ(NodeAttributeCombineXYZ that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'input_type_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode. </p>
	 * @see #__DNA__FIELD__input_type_x
	 */
	
	public byte getInput_type_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'input_type_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode. </p>
	 * @see #__DNA__FIELD__input_type_x
	 */
	
	public void setInput_type_x(byte input_type_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, input_type_x);
		} else {
			__io__block.writeByte(__io__address + 0, input_type_x);
		}
	}

	/**
	 * Get method for struct member 'input_type_y'.
	 * @see #__DNA__FIELD__input_type_y
	 */
	
	public byte getInput_type_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'input_type_y'.
	 * @see #__DNA__FIELD__input_type_y
	 */
	
	public void setInput_type_y(byte input_type_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, input_type_y);
		} else {
			__io__block.writeByte(__io__address + 1, input_type_y);
		}
	}

	/**
	 * Get method for struct member 'input_type_z'.
	 * @see #__DNA__FIELD__input_type_z
	 */
	
	public byte getInput_type_z() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'input_type_z'.
	 * @see #__DNA__FIELD__input_type_z
	 */
	
	public void setInput_type_z(byte input_type_z) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, input_type_z);
		} else {
			__io__block.writeByte(__io__address + 2, input_type_z);
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
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 3, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 3, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 3;
		} else {
			__dna__offset = 3;
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
	public CPointer<NodeAttributeCombineXYZ> __io__addressof() {
		return new CPointer<NodeAttributeCombineXYZ>(__io__address, new Class[]{NodeAttributeCombineXYZ.class}, __io__block, __io__blockTable);
	}

}
