package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeDilateErode'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class NodeDilateErode extends CFacade {

	/**
	 * This is the sdna index of the struct NodeDilateErode.
	 * <p>
	 * It is required when allocating a new block to store data for NodeDilateErode.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 444;

	/**
	 * Field descriptor (offset) for struct member 'falloff'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDilateErode nodedilateerode = ...;
	 * CPointer&lt;Object&gt; p = nodedilateerode.__dna__addressof(NodeDilateErode.__DNA__FIELD__falloff);
	 * CPointer&lt;Byte&gt; p_falloff = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff = new long[]{0, 0};

	public NodeDilateErode(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeDilateErode(NodeDilateErode that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'falloff'.
	 * @see #__DNA__FIELD__falloff
	 */
	
	public byte getFalloff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'falloff'.
	 * @see #__DNA__FIELD__falloff
	 */
	
	public void setFalloff(byte falloff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, falloff);
		} else {
			__io__block.writeByte(__io__address + 0, falloff);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeDilateErode> __io__addressof() {
		return new CPointer<NodeDilateErode>(__io__address, new Class[]{NodeDilateErode.class}, __io__block, __io__blockTable);
	}

}
