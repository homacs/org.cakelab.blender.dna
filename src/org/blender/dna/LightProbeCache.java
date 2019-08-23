package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LightProbeCache'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> -<mdash/><mdash/>  Eevee LightProbes -<mdash/><mdash/>  Needs to be there because written to file with the light-cache. IMPORTANT Padding in these structs is essential. It must match GLSL struct definition in lightprobe_lib.glsl. Must match CubeData. </p>
 */

@CMetaData(size32=160, size64=160)
public class LightProbeCache extends CFacade {

	/**
	 * This is the sdna index of the struct LightProbeCache.
	 * <p>
	 * It is required when allocating a new block to store data for LightProbeCache.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 641;

	/**
	 * Field descriptor (offset) for struct member 'position'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbeCache lightprobecache = ...;
	 * CPointer&lt;Object&gt; p = lightprobecache.__dna__addressof(LightProbeCache.__DNA__FIELD__position);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_position = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'position'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__position = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'parallax_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbeCache lightprobecache = ...;
	 * CPointer&lt;Object&gt; p = lightprobecache.__dna__addressof(LightProbeCache.__DNA__FIELD__parallax_type);
	 * CPointer&lt;Float&gt; p_parallax_type = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parallax_type'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parallax_type = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'attenuation_fac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbeCache lightprobecache = ...;
	 * CPointer&lt;Object&gt; p = lightprobecache.__dna__addressof(LightProbeCache.__DNA__FIELD__attenuation_fac);
	 * CPointer&lt;Float&gt; p_attenuation_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attenuation_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attenuation_fac = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'attenuation_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbeCache lightprobecache = ...;
	 * CPointer&lt;Object&gt; p = lightprobecache.__dna__addressof(LightProbeCache.__DNA__FIELD__attenuation_type);
	 * CPointer&lt;Float&gt; p_attenuation_type = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attenuation_type'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attenuation_type = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbeCache lightprobecache = ...;
	 * CPointer&lt;Object&gt; p = lightprobecache.__dna__addressof(LightProbeCache.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'attenuationmat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbeCache lightprobecache = ...;
	 * CPointer&lt;Object&gt; p = lightprobecache.__dna__addressof(LightProbeCache.__DNA__FIELD__attenuationmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_attenuationmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attenuationmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attenuationmat = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'parallaxmat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbeCache lightprobecache = ...;
	 * CPointer&lt;Object&gt; p = lightprobecache.__dna__addressof(LightProbeCache.__DNA__FIELD__parallaxmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_parallaxmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parallaxmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parallaxmat = new long[]{96, 96};

	public LightProbeCache(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LightProbeCache(LightProbeCache that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'position'.
	 * @see #__DNA__FIELD__position
	 */
	
	public CArrayFacade<Float> getPosition() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'position'.
	 * @see #__DNA__FIELD__position
	 */
	
	public void setPosition(CArrayFacade<Float> position) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(position, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, position)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, position);
		} else {
			__io__generic__copy( getPosition(), position);
		}
	}

	/**
	 * Get method for struct member 'parallax_type'.
	 * @see #__DNA__FIELD__parallax_type
	 */
	
	public float getParallax_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'parallax_type'.
	 * @see #__DNA__FIELD__parallax_type
	 */
	
	public void setParallax_type(float parallax_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, parallax_type);
		} else {
			__io__block.writeFloat(__io__address + 12, parallax_type);
		}
	}

	/**
	 * Get method for struct member 'attenuation_fac'.
	 * @see #__DNA__FIELD__attenuation_fac
	 */
	
	public float getAttenuation_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'attenuation_fac'.
	 * @see #__DNA__FIELD__attenuation_fac
	 */
	
	public void setAttenuation_fac(float attenuation_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, attenuation_fac);
		} else {
			__io__block.writeFloat(__io__address + 16, attenuation_fac);
		}
	}

	/**
	 * Get method for struct member 'attenuation_type'.
	 * @see #__DNA__FIELD__attenuation_type
	 */
	
	public float getAttenuation_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'attenuation_type'.
	 * @see #__DNA__FIELD__attenuation_type
	 */
	
	public void setAttenuation_type(float attenuation_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, attenuation_type);
		} else {
			__io__block.writeFloat(__io__address + 20, attenuation_type);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CArrayFacade<Float> get_pad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CArrayFacade<Float> _pad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(_pad3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad3);
		} else {
			__io__generic__copy( get_pad3(), _pad3);
		}
	}

	/**
	 * Get method for struct member 'attenuationmat'.
	 * @see #__DNA__FIELD__attenuationmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getAttenuationmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'attenuationmat'.
	 * @see #__DNA__FIELD__attenuationmat
	 */
	
	public void setAttenuationmat(CArrayFacade<CArrayFacade<Float>> attenuationmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(attenuationmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, attenuationmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, attenuationmat);
		} else {
			__io__generic__copy( getAttenuationmat(), attenuationmat);
		}
	}

	/**
	 * Get method for struct member 'parallaxmat'.
	 * @see #__DNA__FIELD__parallaxmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getParallaxmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parallaxmat'.
	 * @see #__DNA__FIELD__parallaxmat
	 */
	
	public void setParallaxmat(CArrayFacade<CArrayFacade<Float>> parallaxmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(parallaxmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, parallaxmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, parallaxmat);
		} else {
			__io__generic__copy( getParallaxmat(), parallaxmat);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LightProbeCache> __io__addressof() {
		return new CPointer<LightProbeCache>(__io__address, new Class[]{LightProbeCache.class}, __io__block, __io__blockTable);
	}

}
