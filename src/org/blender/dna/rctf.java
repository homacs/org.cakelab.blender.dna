package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'rctf'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> float rectangle. </p>
 */

@CMetaData(size32=16, size64=16)
public class rctf extends CFacade {

	/**
	 * This is the sdna index of the struct rctf.
	 * <p>
	 * It is required when allocating a new block to store data for rctf.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 7;

	/**
	 * Field descriptor (offset) for struct member 'xmin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * rctf rctf = ...;
	 * CPointer&lt;Object&gt; p = rctf.__dna__addressof(rctf.__DNA__FIELD__xmin);
	 * CPointer&lt;Float&gt; p_xmin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xmin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xmin = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'xmax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * rctf rctf = ...;
	 * CPointer&lt;Object&gt; p = rctf.__dna__addressof(rctf.__DNA__FIELD__xmax);
	 * CPointer&lt;Float&gt; p_xmax = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xmax'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xmax = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'ymin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * rctf rctf = ...;
	 * CPointer&lt;Object&gt; p = rctf.__dna__addressof(rctf.__DNA__FIELD__ymin);
	 * CPointer&lt;Float&gt; p_ymin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ymin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ymin = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'ymax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * rctf rctf = ...;
	 * CPointer&lt;Object&gt; p = rctf.__dna__addressof(rctf.__DNA__FIELD__ymax);
	 * CPointer&lt;Float&gt; p_ymax = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ymax'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ymax = new long[]{12, 12};

	public rctf(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected rctf(rctf that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'xmin'.
	 * @see #__DNA__FIELD__xmin
	 */
	
	public float getXmin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'xmin'.
	 * @see #__DNA__FIELD__xmin
	 */
	
	public void setXmin(float xmin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, xmin);
		} else {
			__io__block.writeFloat(__io__address + 0, xmin);
		}
	}

	/**
	 * Get method for struct member 'xmax'.
	 * @see #__DNA__FIELD__xmax
	 */
	
	public float getXmax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'xmax'.
	 * @see #__DNA__FIELD__xmax
	 */
	
	public void setXmax(float xmax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, xmax);
		} else {
			__io__block.writeFloat(__io__address + 4, xmax);
		}
	}

	/**
	 * Get method for struct member 'ymin'.
	 * @see #__DNA__FIELD__ymin
	 */
	
	public float getYmin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'ymin'.
	 * @see #__DNA__FIELD__ymin
	 */
	
	public void setYmin(float ymin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, ymin);
		} else {
			__io__block.writeFloat(__io__address + 8, ymin);
		}
	}

	/**
	 * Get method for struct member 'ymax'.
	 * @see #__DNA__FIELD__ymax
	 */
	
	public float getYmax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'ymax'.
	 * @see #__DNA__FIELD__ymax
	 */
	
	public void setYmax(float ymax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, ymax);
		} else {
			__io__block.writeFloat(__io__address + 12, ymax);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<rctf> __io__addressof() {
		return new CPointer<rctf>(__io__address, new Class[]{rctf.class}, __io__block, __io__blockTable);
	}

}
