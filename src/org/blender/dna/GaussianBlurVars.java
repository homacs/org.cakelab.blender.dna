package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'GaussianBlurVars'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class GaussianBlurVars extends CFacade {

	/**
	 * This is the sdna index of the struct GaussianBlurVars.
	 * <p>
	 * It is required when allocating a new block to store data for GaussianBlurVars.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 276;

	/**
	 * Field descriptor (offset) for struct member 'size_x'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GaussianBlurVars gaussianblurvars = ...;
	 * CPointer&lt;Object&gt; p = gaussianblurvars.__dna__addressof(GaussianBlurVars.__DNA__FIELD__size_x);
	 * CPointer&lt;Float&gt; p_size_x = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size_x'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size_x = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'size_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GaussianBlurVars gaussianblurvars = ...;
	 * CPointer&lt;Object&gt; p = gaussianblurvars.__dna__addressof(GaussianBlurVars.__DNA__FIELD__size_y);
	 * CPointer&lt;Float&gt; p_size_y = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size_y'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size_y = new long[]{4, 4};

	public GaussianBlurVars(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected GaussianBlurVars(GaussianBlurVars that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'size_x'.
	 * @see #__DNA__FIELD__size_x
	 */
	
	public float getSize_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'size_x'.
	 * @see #__DNA__FIELD__size_x
	 */
	
	public void setSize_x(float size_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, size_x);
		} else {
			__io__block.writeFloat(__io__address + 0, size_x);
		}
	}

	/**
	 * Get method for struct member 'size_y'.
	 * @see #__DNA__FIELD__size_y
	 */
	
	public float getSize_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'size_y'.
	 * @see #__DNA__FIELD__size_y
	 */
	
	public void setSize_y(float size_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, size_y);
		} else {
			__io__block.writeFloat(__io__address + 4, size_y);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<GaussianBlurVars> __io__addressof() {
		return new CPointer<GaussianBlurVars>(__io__address, new Class[]{GaussianBlurVars.class}, __io__block, __io__blockTable);
	}

}
