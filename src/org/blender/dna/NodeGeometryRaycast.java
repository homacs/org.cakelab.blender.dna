package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryRaycast'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=4)
public class NodeGeometryRaycast extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryRaycast.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryRaycast.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 525;

	/**
	 * Field descriptor (offset) for struct member 'mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeRaycastMapMode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryRaycast nodegeometryraycast = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryraycast.__dna__addressof(NodeGeometryRaycast.__DNA__FIELD__mapping);
	 * CPointer&lt;Byte&gt; p_mapping = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mapping'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mapping = new long[]{0, 0};

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
	 * NodeGeometryRaycast nodegeometryraycast = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryraycast.__dna__addressof(NodeGeometryRaycast.__DNA__FIELD__data_type);
	 * CPointer&lt;Byte&gt; p_data_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_type'</li>
	 * <li>Signature: 'int8_t'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_type = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'input_type_ray_direction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Deprecated input types in new Ray-cast node. Can be removed when legacy nodes are no longer supported. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryRaycast nodegeometryraycast = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryraycast.__dna__addressof(NodeGeometryRaycast.__DNA__FIELD__input_type_ray_direction);
	 * CPointer&lt;Byte&gt; p_input_type_ray_direction = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_ray_direction'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_ray_direction = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'input_type_ray_length'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryRaycast nodegeometryraycast = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryraycast.__dna__addressof(NodeGeometryRaycast.__DNA__FIELD__input_type_ray_length);
	 * CPointer&lt;Byte&gt; p_input_type_ray_length = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'input_type_ray_length'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__input_type_ray_length = new long[]{3, 3};

	public NodeGeometryRaycast(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryRaycast(NodeGeometryRaycast that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeRaycastMapMode. </p>
	 * @see #__DNA__FIELD__mapping
	 */
	
	public byte getMapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodeRaycastMapMode. </p>
	 * @see #__DNA__FIELD__mapping
	 */
	
	public void setMapping(byte mapping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, mapping);
		} else {
			__io__block.writeByte(__io__address + 0, mapping);
		}
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
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
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
			__io__block.writeByte(__io__address + 1, data_type);
		} else {
			__io__block.writeByte(__io__address + 1, data_type);
		}
	}

	/**
	 * Get method for struct member 'input_type_ray_direction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Deprecated input types in new Ray-cast node. Can be removed when legacy nodes are no longer supported. </p>
	 * @see #__DNA__FIELD__input_type_ray_direction
	 */
	
	public byte getInput_type_ray_direction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'input_type_ray_direction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Deprecated input types in new Ray-cast node. Can be removed when legacy nodes are no longer supported. </p>
	 * @see #__DNA__FIELD__input_type_ray_direction
	 */
	
	public void setInput_type_ray_direction(byte input_type_ray_direction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, input_type_ray_direction);
		} else {
			__io__block.writeByte(__io__address + 2, input_type_ray_direction);
		}
	}

	/**
	 * Get method for struct member 'input_type_ray_length'.
	 * @see #__DNA__FIELD__input_type_ray_length
	 */
	
	public byte getInput_type_ray_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'input_type_ray_length'.
	 * @see #__DNA__FIELD__input_type_ray_length
	 */
	
	public void setInput_type_ray_length(byte input_type_ray_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, input_type_ray_length);
		} else {
			__io__block.writeByte(__io__address + 3, input_type_ray_length);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryRaycast> __io__addressof() {
		return new CPointer<NodeGeometryRaycast>(__io__address, new Class[]{NodeGeometryRaycast.class}, __io__block, __io__blockTable);
	}

}
