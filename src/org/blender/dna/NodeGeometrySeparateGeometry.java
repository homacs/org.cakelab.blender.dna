package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometrySeparateGeometry'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class NodeGeometrySeparateGeometry extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometrySeparateGeometry.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometrySeparateGeometry.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 540;

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
	 * NodeGeometrySeparateGeometry nodegeometryseparategeometry = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryseparategeometry.__dna__addressof(NodeGeometrySeparateGeometry.__DNA__FIELD__domain);
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

	public NodeGeometrySeparateGeometry(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometrySeparateGeometry(NodeGeometrySeparateGeometry that) {
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometrySeparateGeometry> __io__addressof() {
		return new CPointer<NodeGeometrySeparateGeometry>(__io__address, new Class[]{NodeGeometrySeparateGeometry.class}, __io__block, __io__blockTable);
	}

}
