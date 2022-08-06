package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryPointInstance'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=2, size64=2)
public class NodeGeometryPointInstance extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryPointInstance.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryPointInstance.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 482;

	/**
	 * Field descriptor (offset) for struct member 'instance_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodePointInstanceType. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryPointInstance nodegeometrypointinstance = ...;
	 * CPointer&lt;Object&gt; p = nodegeometrypointinstance.__dna__addressof(NodeGeometryPointInstance.__DNA__FIELD__instance_type);
	 * CPointer&lt;Byte&gt; p_instance_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'instance_type'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__instance_type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodePointInstanceFlag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryPointInstance nodegeometrypointinstance = ...;
	 * CPointer&lt;Object&gt; p = nodegeometrypointinstance.__dna__addressof(NodeGeometryPointInstance.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{1, 1};

	public NodeGeometryPointInstance(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryPointInstance(NodeGeometryPointInstance that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'instance_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodePointInstanceType. </p>
	 * @see #__DNA__FIELD__instance_type
	 */
	
	public byte getInstance_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'instance_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodePointInstanceType. </p>
	 * @see #__DNA__FIELD__instance_type
	 */
	
	public void setInstance_type(byte instance_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, instance_type);
		} else {
			__io__block.writeByte(__io__address + 0, instance_type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodePointInstanceFlag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GeometryNodePointInstanceFlag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, flag);
		} else {
			__io__block.writeByte(__io__address + 1, flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryPointInstance> __io__addressof() {
		return new CPointer<NodeGeometryPointInstance>(__io__address, new Class[]{NodeGeometryPointInstance.class}, __io__block, __io__blockTable);
	}

}
