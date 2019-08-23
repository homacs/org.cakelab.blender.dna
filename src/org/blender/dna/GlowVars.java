package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'GlowVars'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=24, size64=24)
public class GlowVars extends CFacade {

	/**
	 * This is the sdna index of the struct GlowVars.
	 * <p>
	 * It is required when allocating a new block to store data for GlowVars.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 276;

	/**
	 * Field descriptor (offset) for struct member 'fMini'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimum intensity to trigger a glow </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowVars glowvars = ...;
	 * CPointer&lt;Object&gt; p = glowvars.__dna__addressof(GlowVars.__DNA__FIELD__fMini);
	 * CPointer&lt;Float&gt; p_fMini = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fMini'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fMini = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'fClamp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowVars glowvars = ...;
	 * CPointer&lt;Object&gt; p = glowvars.__dna__addressof(GlowVars.__DNA__FIELD__fClamp);
	 * CPointer&lt;Float&gt; p_fClamp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fClamp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fClamp = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'fBoost'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount to multiply glow intensity </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowVars glowvars = ...;
	 * CPointer&lt;Object&gt; p = glowvars.__dna__addressof(GlowVars.__DNA__FIELD__fBoost);
	 * CPointer&lt;Float&gt; p_fBoost = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fBoost'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fBoost = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'dDist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius of glow blurring </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowVars glowvars = ...;
	 * CPointer&lt;Object&gt; p = glowvars.__dna__addressof(GlowVars.__DNA__FIELD__dDist);
	 * CPointer&lt;Float&gt; p_dDist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dDist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dDist = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'dQuality'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowVars glowvars = ...;
	 * CPointer&lt;Object&gt; p = glowvars.__dna__addressof(GlowVars.__DNA__FIELD__dQuality);
	 * CPointer&lt;Integer&gt; p_dQuality = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dQuality'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dQuality = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'bNoComp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> SHOW/HIDE glow buffer </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowVars glowvars = ...;
	 * CPointer&lt;Object&gt; p = glowvars.__dna__addressof(GlowVars.__DNA__FIELD__bNoComp);
	 * CPointer&lt;Integer&gt; p_bNoComp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bNoComp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bNoComp = new long[]{20, 20};

	public GlowVars(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected GlowVars(GlowVars that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'fMini'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimum intensity to trigger a glow </p>
	 * @see #__DNA__FIELD__fMini
	 */
	
	public float getFMini() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'fMini'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimum intensity to trigger a glow </p>
	 * @see #__DNA__FIELD__fMini
	 */
	
	public void setFMini(float fMini) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, fMini);
		} else {
			__io__block.writeFloat(__io__address + 0, fMini);
		}
	}

	/**
	 * Get method for struct member 'fClamp'.
	 * @see #__DNA__FIELD__fClamp
	 */
	
	public float getFClamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'fClamp'.
	 * @see #__DNA__FIELD__fClamp
	 */
	
	public void setFClamp(float fClamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, fClamp);
		} else {
			__io__block.writeFloat(__io__address + 4, fClamp);
		}
	}

	/**
	 * Get method for struct member 'fBoost'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount to multiply glow intensity </p>
	 * @see #__DNA__FIELD__fBoost
	 */
	
	public float getFBoost() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'fBoost'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Amount to multiply glow intensity </p>
	 * @see #__DNA__FIELD__fBoost
	 */
	
	public void setFBoost(float fBoost) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, fBoost);
		} else {
			__io__block.writeFloat(__io__address + 8, fBoost);
		}
	}

	/**
	 * Get method for struct member 'dDist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius of glow blurring </p>
	 * @see #__DNA__FIELD__dDist
	 */
	
	public float getDDist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'dDist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius of glow blurring </p>
	 * @see #__DNA__FIELD__dDist
	 */
	
	public void setDDist(float dDist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, dDist);
		} else {
			__io__block.writeFloat(__io__address + 12, dDist);
		}
	}

	/**
	 * Get method for struct member 'dQuality'.
	 * @see #__DNA__FIELD__dQuality
	 */
	
	public int getDQuality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'dQuality'.
	 * @see #__DNA__FIELD__dQuality
	 */
	
	public void setDQuality(int dQuality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, dQuality);
		} else {
			__io__block.writeInt(__io__address + 16, dQuality);
		}
	}

	/**
	 * Get method for struct member 'bNoComp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> SHOW/HIDE glow buffer </p>
	 * @see #__DNA__FIELD__bNoComp
	 */
	
	public int getBNoComp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'bNoComp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> SHOW/HIDE glow buffer </p>
	 * @see #__DNA__FIELD__bNoComp
	 */
	
	public void setBNoComp(int bNoComp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, bNoComp);
		} else {
			__io__block.writeInt(__io__address + 20, bNoComp);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<GlowVars> __io__addressof() {
		return new CPointer<GlowVars>(__io__address, new Class[]{GlowVars.class}, __io__block, __io__blockTable);
	}

}
