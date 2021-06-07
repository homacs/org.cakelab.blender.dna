package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeHueSat'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> NOTE: Only for do-version code. </p>
 */

@CMetaData(size32=12, size64=12)
public class NodeHueSat extends CFacade {

	/**
	 * This is the sdna index of the struct NodeHueSat.
	 * <p>
	 * It is required when allocating a new block to store data for NodeHueSat.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 415;

	/**
	 * Field descriptor (offset) for struct member 'hue'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeHueSat nodehuesat = ...;
	 * CPointer&lt;Object&gt; p = nodehuesat.__dna__addressof(NodeHueSat.__DNA__FIELD__hue);
	 * CPointer&lt;Float&gt; p_hue = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hue'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hue = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'sat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeHueSat nodehuesat = ...;
	 * CPointer&lt;Object&gt; p = nodehuesat.__dna__addressof(NodeHueSat.__DNA__FIELD__sat);
	 * CPointer&lt;Float&gt; p_sat = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sat'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sat = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'val'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeHueSat nodehuesat = ...;
	 * CPointer&lt;Object&gt; p = nodehuesat.__dna__addressof(NodeHueSat.__DNA__FIELD__val);
	 * CPointer&lt;Float&gt; p_val = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'val'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__val = new long[]{8, 8};

	public NodeHueSat(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeHueSat(NodeHueSat that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'hue'.
	 * @see #__DNA__FIELD__hue
	 */
	
	public float getHue() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'hue'.
	 * @see #__DNA__FIELD__hue
	 */
	
	public void setHue(float hue) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, hue);
		} else {
			__io__block.writeFloat(__io__address + 0, hue);
		}
	}

	/**
	 * Get method for struct member 'sat'.
	 * @see #__DNA__FIELD__sat
	 */
	
	public float getSat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'sat'.
	 * @see #__DNA__FIELD__sat
	 */
	
	public void setSat(float sat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, sat);
		} else {
			__io__block.writeFloat(__io__address + 4, sat);
		}
	}

	/**
	 * Get method for struct member 'val'.
	 * @see #__DNA__FIELD__val
	 */
	
	public float getVal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'val'.
	 * @see #__DNA__FIELD__val
	 */
	
	public void setVal(float val) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, val);
		} else {
			__io__block.writeFloat(__io__address + 8, val);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeHueSat> __io__addressof() {
		return new CPointer<NodeHueSat>(__io__address, new Class[]{NodeHueSat.class}, __io__block, __io__blockTable);
	}

}
