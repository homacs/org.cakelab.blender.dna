package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeAttributeMath'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=4)
public class NodeAttributeMath extends CFacade {

	/**
	 * This is the sdna index of the struct NodeAttributeMath.
	 * <p>
	 * It is required when allocating a new block to store data for NodeAttributeMath.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 488;

	/**
	 * Field descriptor (offset) for struct member 'operation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NodeMathOperation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeMath nodeattributemath = ...;
	 * CPointer&lt;Object&gt; p = nodeattributemath.__dna__addressof(NodeAttributeMath.__DNA__FIELD__operation);
	 * CPointer&lt;Byte&gt; p_operation = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'operation'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__operation = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'input_type_a'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeMath nodeattributemath = ...;
	 * CPointer&lt;Object&gt; p = nodeattributemath.__dna__addressof(NodeAttributeMath.__DNA__FIELD__input_type_a);
	 * CPointer&lt;Byte&gt; p_input_type_a = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_a'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_a = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'input_type_b'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeMath nodeattributemath = ...;
	 * CPointer&lt;Object&gt; p = nodeattributemath.__dna__addressof(NodeAttributeMath.__DNA__FIELD__input_type_b);
	 * CPointer&lt;Byte&gt; p_input_type_b = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_b'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_b = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'input_type_c'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeAttributeMath nodeattributemath = ...;
	 * CPointer&lt;Object&gt; p = nodeattributemath.__dna__addressof(NodeAttributeMath.__DNA__FIELD__input_type_c);
	 * CPointer&lt;Byte&gt; p_input_type_c = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_c'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_c = new long[]{3, 3};

	public NodeAttributeMath(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeAttributeMath(NodeAttributeMath that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'operation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NodeMathOperation. </p>
	 * @see #__DNA__FIELD__operation
	 */
	
	public byte getOperation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'operation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NodeMathOperation. </p>
	 * @see #__DNA__FIELD__operation
	 */
	
	public void setOperation(byte operation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, operation);
		} else {
			__io__block.writeByte(__io__address + 0, operation);
		}
	}

	/**
	 * Get method for struct member 'input_type_a'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * @see #__DNA__FIELD__input_type_a
	 */
	
	public byte getInput_type_a() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'input_type_a'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeInputMode </p>
	 * @see #__DNA__FIELD__input_type_a
	 */
	
	public void setInput_type_a(byte input_type_a) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, input_type_a);
		} else {
			__io__block.writeByte(__io__address + 1, input_type_a);
		}
	}

	/**
	 * Get method for struct member 'input_type_b'.
	 * @see #__DNA__FIELD__input_type_b
	 */
	
	public byte getInput_type_b() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'input_type_b'.
	 * @see #__DNA__FIELD__input_type_b
	 */
	
	public void setInput_type_b(byte input_type_b) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, input_type_b);
		} else {
			__io__block.writeByte(__io__address + 2, input_type_b);
		}
	}

	/**
	 * Get method for struct member 'input_type_c'.
	 * @see #__DNA__FIELD__input_type_c
	 */
	
	public byte getInput_type_c() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'input_type_c'.
	 * @see #__DNA__FIELD__input_type_c
	 */
	
	public void setInput_type_c(byte input_type_c) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, input_type_c);
		} else {
			__io__block.writeByte(__io__address + 3, input_type_c);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeAttributeMath> __io__addressof() {
		return new CPointer<NodeAttributeMath>(__io__address, new Class[]{NodeAttributeMath.class}, __io__block, __io__blockTable);
	}

}
