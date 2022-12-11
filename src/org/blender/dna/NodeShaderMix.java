package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeShaderMix'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class NodeShaderMix extends CFacade {

	/**
	 * This is the sdna index of the struct NodeShaderMix.
	 * <p>
	 * It is required when allocating a new block to store data for NodeShaderMix.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 535;

	/**
	 * Field descriptor (offset) for struct member 'data_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eNodeSocketDatatype </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderMix nodeshadermix = ...;
	 * CPointer&lt;Object&gt; p = nodeshadermix.__dna__addressof(NodeShaderMix.__DNA__FIELD__data_type);
	 * CPointer&lt;Byte&gt; p_data_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_type'</li>
	 * <li>Signature: 'int8_t'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'factor_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> NodeShaderMixMode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderMix nodeshadermix = ...;
	 * CPointer&lt;Object&gt; p = nodeshadermix.__dna__addressof(NodeShaderMix.__DNA__FIELD__factor_mode);
	 * CPointer&lt;Byte&gt; p_factor_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'factor_mode'</li>
	 * <li>Signature: 'int8_t'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__factor_mode = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'clamp_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderMix nodeshadermix = ...;
	 * CPointer&lt;Object&gt; p = nodeshadermix.__dna__addressof(NodeShaderMix.__DNA__FIELD__clamp_factor);
	 * CPointer&lt;Byte&gt; p_clamp_factor = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clamp_factor'</li>
	 * <li>Signature: 'int8_t'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clamp_factor = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'clamp_result'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderMix nodeshadermix = ...;
	 * CPointer&lt;Object&gt; p = nodeshadermix.__dna__addressof(NodeShaderMix.__DNA__FIELD__clamp_result);
	 * CPointer&lt;Byte&gt; p_clamp_result = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clamp_result'</li>
	 * <li>Signature: 'int8_t'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clamp_result = new long[]{3, 3};

	/**
	 * Field descriptor (offset) for struct member 'blend_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderMix nodeshadermix = ...;
	 * CPointer&lt;Object&gt; p = nodeshadermix.__dna__addressof(NodeShaderMix.__DNA__FIELD__blend_type);
	 * CPointer&lt;Byte&gt; p_blend_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_type'</li>
	 * <li>Signature: 'int8_t'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_type = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderMix nodeshadermix = ...;
	 * CPointer&lt;Object&gt; p = nodeshadermix.__dna__addressof(NodeShaderMix.__DNA__FIELD___pad);
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

	public NodeShaderMix(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeShaderMix(NodeShaderMix that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'data_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eNodeSocketDatatype </p>
	 * @see #__DNA__FIELD__data_type
	 */
	
	public byte getData_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'data_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eNodeSocketDatatype </p>
	 * @see #__DNA__FIELD__data_type
	 */
	
	public void setData_type(byte data_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, data_type);
		} else {
			__io__block.writeByte(__io__address + 0, data_type);
		}
	}

	/**
	 * Get method for struct member 'factor_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> NodeShaderMixMode </p>
	 * @see #__DNA__FIELD__factor_mode
	 */
	
	public byte getFactor_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'factor_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> NodeShaderMixMode </p>
	 * @see #__DNA__FIELD__factor_mode
	 */
	
	public void setFactor_mode(byte factor_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, factor_mode);
		} else {
			__io__block.writeByte(__io__address + 1, factor_mode);
		}
	}

	/**
	 * Get method for struct member 'clamp_factor'.
	 * @see #__DNA__FIELD__clamp_factor
	 */
	
	public byte getClamp_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'clamp_factor'.
	 * @see #__DNA__FIELD__clamp_factor
	 */
	
	public void setClamp_factor(byte clamp_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, clamp_factor);
		} else {
			__io__block.writeByte(__io__address + 2, clamp_factor);
		}
	}

	/**
	 * Get method for struct member 'clamp_result'.
	 * @see #__DNA__FIELD__clamp_result
	 */
	
	public byte getClamp_result() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'clamp_result'.
	 * @see #__DNA__FIELD__clamp_result
	 */
	
	public void setClamp_result(byte clamp_result) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, clamp_result);
		} else {
			__io__block.writeByte(__io__address + 3, clamp_result);
		}
	}

	/**
	 * Get method for struct member 'blend_type'.
	 * @see #__DNA__FIELD__blend_type
	 */
	
	public byte getBlend_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 4);
		} else {
			return __io__block.readByte(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'blend_type'.
	 * @see #__DNA__FIELD__blend_type
	 */
	
	public void setBlend_type(byte blend_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 4, blend_type);
		} else {
			__io__block.writeByte(__io__address + 4, blend_type);
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
	public CPointer<NodeShaderMix> __io__addressof() {
		return new CPointer<NodeShaderMix>(__io__address, new Class[]{NodeShaderMix.class}, __io__block, __io__blockTable);
	}

}
