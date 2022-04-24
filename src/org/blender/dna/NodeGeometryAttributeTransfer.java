package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryAttributeTransfer'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=2, size64=2)
public class NodeGeometryAttributeTransfer extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryAttributeTransfer.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryAttributeTransfer.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 538;

	/**
	 * Field descriptor (offset) for struct member 'domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> AttributeDomain. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryAttributeTransfer nodegeometryattributetransfer = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryattributetransfer.__dna__addressof(NodeGeometryAttributeTransfer.__DNA__FIELD__domain);
	 * CPointer&lt;Byte&gt; p_domain = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'domain'</li>
	 * <li>Signature: 'int8_t'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__domain = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeTransferMapMode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryAttributeTransfer nodegeometryattributetransfer = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryattributetransfer.__dna__addressof(NodeGeometryAttributeTransfer.__DNA__FIELD__mapping);
	 * CPointer&lt;Byte&gt; p_mapping = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mapping'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mapping = new long[]{1, 1};

	public NodeGeometryAttributeTransfer(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryAttributeTransfer(NodeGeometryAttributeTransfer that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> AttributeDomain. </p>
	 * @see #__DNA__FIELD__domain
	 */
	
	public byte getDomain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> AttributeDomain. </p>
	 * @see #__DNA__FIELD__domain
	 */
	
	public void setDomain(byte domain) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, domain);
		} else {
			__io__block.writeByte(__io__address + 0, domain);
		}
	}

	/**
	 * Get method for struct member 'mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeTransferMapMode. </p>
	 * @see #__DNA__FIELD__mapping
	 */
	
	public byte getMapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GeometryNodeAttributeTransferMapMode. </p>
	 * @see #__DNA__FIELD__mapping
	 */
	
	public void setMapping(byte mapping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, mapping);
		} else {
			__io__block.writeByte(__io__address + 1, mapping);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryAttributeTransfer> __io__addressof() {
		return new CPointer<NodeGeometryAttributeTransfer>(__io__address, new Class[]{NodeGeometryAttributeTransfer.class}, __io__block, __io__blockTable);
	}

}
