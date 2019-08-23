package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'vec2s'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> types vector of two shorts. </p>
 */

@CMetaData(size32=4, size64=4)
public class vec2s extends CFacade {

	/**
	 * This is the sdna index of the struct vec2s.
	 * <p>
	 * It is required when allocating a new block to store data for vec2s.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 3;

	/**
	 * Field descriptor (offset) for struct member 'x'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * vec2s vec2s = ...;
	 * CPointer&lt;Object&gt; p = vec2s.__dna__addressof(vec2s.__DNA__FIELD__x);
	 * CPointer&lt;Short&gt; p_x = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'x'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__x = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * vec2s vec2s = ...;
	 * CPointer&lt;Object&gt; p = vec2s.__dna__addressof(vec2s.__DNA__FIELD__y);
	 * CPointer&lt;Short&gt; p_y = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'y'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__y = new long[]{2, 2};

	public vec2s(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected vec2s(vec2s that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'x'.
	 * @see #__DNA__FIELD__x
	 */
	
	public short getX() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'x'.
	 * @see #__DNA__FIELD__x
	 */
	
	public void setX(short x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, x);
		} else {
			__io__block.writeShort(__io__address + 0, x);
		}
	}

	/**
	 * Get method for struct member 'y'.
	 * @see #__DNA__FIELD__y
	 */
	
	public short getY() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'y'.
	 * @see #__DNA__FIELD__y
	 */
	
	public void setY(short y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, y);
		} else {
			__io__block.writeShort(__io__address + 2, y);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<vec2s> __io__addressof() {
		return new CPointer<vec2s>(__io__address, new Class[]{vec2s.class}, __io__block, __io__blockTable);
	}

}
