package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ColorMixVars'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class ColorMixVars extends CFacade {

	/**
	 * This is the sdna index of the struct ColorMixVars.
	 * <p>
	 * It is required when allocating a new block to store data for ColorMixVars.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 290;

	/**
	 * Field descriptor (offset) for struct member 'blend_effect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Value from SEQ_TYPE_XXX enumeration. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorMixVars colormixvars = ...;
	 * CPointer&lt;Object&gt; p = colormixvars.__dna__addressof(ColorMixVars.__DNA__FIELD__blend_effect);
	 * CPointer&lt;Integer&gt; p_blend_effect = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_effect'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_effect = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blend factor [0.0f, 1.0f]. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorMixVars colormixvars = ...;
	 * CPointer&lt;Object&gt; p = colormixvars.__dna__addressof(ColorMixVars.__DNA__FIELD__factor);
	 * CPointer&lt;Float&gt; p_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__factor = new long[]{4, 4};

	public ColorMixVars(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ColorMixVars(ColorMixVars that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'blend_effect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Value from SEQ_TYPE_XXX enumeration. </p>
	 * @see #__DNA__FIELD__blend_effect
	 */
	
	public int getBlend_effect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'blend_effect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Value from SEQ_TYPE_XXX enumeration. </p>
	 * @see #__DNA__FIELD__blend_effect
	 */
	
	public void setBlend_effect(int blend_effect) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, blend_effect);
		} else {
			__io__block.writeInt(__io__address + 0, blend_effect);
		}
	}

	/**
	 * Get method for struct member 'factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blend factor [0.0f, 1.0f]. </p>
	 * @see #__DNA__FIELD__factor
	 */
	
	public float getFactor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blend factor [0.0f, 1.0f]. </p>
	 * @see #__DNA__FIELD__factor
	 */
	
	public void setFactor(float factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, factor);
		} else {
			__io__block.writeFloat(__io__address + 4, factor);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ColorMixVars> __io__addressof() {
		return new CPointer<ColorMixVars>(__io__address, new Class[]{ColorMixVars.class}, __io__block, __io__blockTable);
	}

}
