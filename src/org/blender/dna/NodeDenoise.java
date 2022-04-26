package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeDenoise'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=2, size64=2)
public class NodeDenoise extends CFacade {

	/**
	 * This is the sdna index of the struct NodeDenoise.
	 * <p>
	 * It is required when allocating a new block to store data for NodeDenoise.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 483;

	/**
	 * Field descriptor (offset) for struct member 'hdr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDenoise nodedenoise = ...;
	 * CPointer&lt;Object&gt; p = nodedenoise.__dna__addressof(NodeDenoise.__DNA__FIELD__hdr);
	 * CPointer&lt;Byte&gt; p_hdr = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hdr'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hdr = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prefilter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeDenoise nodedenoise = ...;
	 * CPointer&lt;Object&gt; p = nodedenoise.__dna__addressof(NodeDenoise.__DNA__FIELD__prefilter);
	 * CPointer&lt;Byte&gt; p_prefilter = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prefilter'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prefilter = new long[]{1, 1};

	public NodeDenoise(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeDenoise(NodeDenoise that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'hdr'.
	 * @see #__DNA__FIELD__hdr
	 */
	
	public byte getHdr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'hdr'.
	 * @see #__DNA__FIELD__hdr
	 */
	
	public void setHdr(byte hdr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, hdr);
		} else {
			__io__block.writeByte(__io__address + 0, hdr);
		}
	}

	/**
	 * Get method for struct member 'prefilter'.
	 * @see #__DNA__FIELD__prefilter
	 */
	
	public byte getPrefilter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'prefilter'.
	 * @see #__DNA__FIELD__prefilter
	 */
	
	public void setPrefilter(byte prefilter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, prefilter);
		} else {
			__io__block.writeByte(__io__address + 1, prefilter);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeDenoise> __io__addressof() {
		return new CPointer<NodeDenoise>(__io__address, new Class[]{NodeDenoise.class}, __io__block, __io__blockTable);
	}

}
