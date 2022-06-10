package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryInputNamedAttribute'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class NodeGeometryInputNamedAttribute extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryInputNamedAttribute.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryInputNamedAttribute.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 531;

	/**
	 * Field descriptor (offset) for struct member 'data_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> CustomDataType. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryInputNamedAttribute nodegeometryinputnamedattribute = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryinputnamedattribute.__dna__addressof(NodeGeometryInputNamedAttribute.__DNA__FIELD__data_type);
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

	public NodeGeometryInputNamedAttribute(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryInputNamedAttribute(NodeGeometryInputNamedAttribute that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'data_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> CustomDataType. </p>
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
	 * <p> CustomDataType. </p>
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryInputNamedAttribute> __io__addressof() {
		return new CPointer<NodeGeometryInputNamedAttribute>(__io__address, new Class[]{NodeGeometryInputNamedAttribute.class}, __io__block, __io__blockTable);
	}

}
