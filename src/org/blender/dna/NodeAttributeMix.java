package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeAttributeMix'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=4)
public class NodeAttributeMix extends CFacade {

	/**
	 * This is the sdna index of the struct NodeAttributeMix.
	 * <p>
	 * It is required when allocating a new block to store data for NodeAttributeMix.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 456;

	/**
	 * Field descriptor (offset) for struct member 'blend_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> e.g. MA_RAMP_BLEND. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeMix nodeattributemix = ...;
	 * CPointer&lt;Object&gt; p = nodeattributemix.__dna__addressof(NodeAttributeMix.__DNA__FIELD__blend_type);
	 * CPointer&lt;Byte&gt; p_blend_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_type'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'input_type_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeMix nodeattributemix = ...;
	 * CPointer&lt;Object&gt; p = nodeattributemix.__dna__addressof(NodeAttributeMix.__DNA__FIELD__input_type_factor);
	 * CPointer&lt;Byte&gt; p_input_type_factor = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_factor'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_factor = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'input_type_a'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeMix nodeattributemix = ...;
	 * CPointer&lt;Object&gt; p = nodeattributemix.__dna__addressof(NodeAttributeMix.__DNA__FIELD__input_type_a);
	 * CPointer&lt;Byte&gt; p_input_type_a = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_a'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_a = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'input_type_b'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeMix nodeattributemix = ...;
	 * CPointer&lt;Object&gt; p = nodeattributemix.__dna__addressof(NodeAttributeMix.__DNA__FIELD__input_type_b);
	 * CPointer&lt;Byte&gt; p_input_type_b = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_b'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_b = new long[]{3, 3};

	public NodeAttributeMix(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeAttributeMix(NodeAttributeMix that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'blend_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> e.g. MA_RAMP_BLEND. </p>
	 * @see #__DNA__FIELD__blend_type
	 */
	
	public byte getBlend_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'blend_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> e.g. MA_RAMP_BLEND. </p>
	 * @see #__DNA__FIELD__blend_type
	 */
	
	public void setBlend_type(byte blend_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, blend_type);
		} else {
			__io__block.writeByte(__io__address + 0, blend_type);
		}
	}

	/**
	 * Get method for struct member 'input_type_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * @see #__DNA__FIELD__input_type_factor
	 */
	
	public byte getInput_type_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'input_type_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * @see #__DNA__FIELD__input_type_factor
	 */
	
	public void setInput_type_factor(byte input_type_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, input_type_factor);
		} else {
			__io__block.writeByte(__io__address + 1, input_type_factor);
		}
	}

	/**
	 * Get method for struct member 'input_type_a'.
	 * @see #__DNA__FIELD__input_type_a
	 */
	
	public byte getInput_type_a() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'input_type_a'.
	 * @see #__DNA__FIELD__input_type_a
	 */
	
	public void setInput_type_a(byte input_type_a) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, input_type_a);
		} else {
			__io__block.writeByte(__io__address + 2, input_type_a);
		}
	}

	/**
	 * Get method for struct member 'input_type_b'.
	 * @see #__DNA__FIELD__input_type_b
	 */
	
	public byte getInput_type_b() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'input_type_b'.
	 * @see #__DNA__FIELD__input_type_b
	 */
	
	public void setInput_type_b(byte input_type_b) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, input_type_b);
		} else {
			__io__block.writeByte(__io__address + 3, input_type_b);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeAttributeMix> __io__addressof() {
		return new CPointer<NodeAttributeMix>(__io__address, new Class[]{NodeAttributeMix.class}, __io__block, __io__blockTable);
	}

}
