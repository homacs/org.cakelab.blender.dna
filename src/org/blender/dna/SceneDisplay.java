package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SceneDisplay'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  {@link Scene}  Display - used for store scene specific display settings for the 3d view </p>
 */

@CMetaData(size32=896, size64=896)
public class SceneDisplay extends CFacade {

	/**
	 * This is the sdna index of the struct SceneDisplay.
	 * <p>
	 * It is required when allocating a new block to store data for SceneDisplay.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 206;

	/**
	 * Field descriptor (offset) for struct member 'light_direction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Direction of the light for shadows and highlights<h4>Blender Source Code:</h4>
	 * <p>{@link Light}  direction for shadows/highlight. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneDisplay scenedisplay = ...;
	 * CPointer&lt;Object&gt; p = scenedisplay.__dna__addressof(SceneDisplay.__DNA__FIELD__light_direction);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_light_direction = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'light_direction'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__light_direction = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'shadow_shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Shadow termination angle
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneDisplay scenedisplay = ...;
	 * CPointer&lt;Object&gt; p = scenedisplay.__dna__addressof(SceneDisplay.__DNA__FIELD__shadow_shift);
	 * CPointer&lt;Float&gt; p_shadow_shift = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadow_shift'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadow_shift = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'shadow_focus'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Shadow factor hardness
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneDisplay scenedisplay = ...;
	 * CPointer&lt;Object&gt; p = scenedisplay.__dna__addressof(SceneDisplay.__DNA__FIELD__shadow_focus);
	 * CPointer&lt;Float&gt; p_shadow_focus = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadow_focus'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadow_focus = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'matcap_ssao_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance of object that contribute to the Cavity/Edge effect<h4>Blender Source Code:</h4>
	 * <p> Settings for Cavity Shader. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneDisplay scenedisplay = ...;
	 * CPointer&lt;Object&gt; p = scenedisplay.__dna__addressof(SceneDisplay.__DNA__FIELD__matcap_ssao_distance);
	 * CPointer&lt;Float&gt; p_matcap_ssao_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'matcap_ssao_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__matcap_ssao_distance = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'matcap_ssao_attenuation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Attenuation constant
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneDisplay scenedisplay = ...;
	 * CPointer&lt;Object&gt; p = scenedisplay.__dna__addressof(SceneDisplay.__DNA__FIELD__matcap_ssao_attenuation);
	 * CPointer&lt;Float&gt; p_matcap_ssao_attenuation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'matcap_ssao_attenuation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__matcap_ssao_attenuation = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'matcap_ssao_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneDisplay scenedisplay = ...;
	 * CPointer&lt;Object&gt; p = scenedisplay.__dna__addressof(SceneDisplay.__DNA__FIELD__matcap_ssao_samples);
	 * CPointer&lt;Integer&gt; p_matcap_ssao_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'matcap_ssao_samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__matcap_ssao_samples = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'viewport_aa'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method of anti-aliasing when rendering 3d viewport<h4>Blender Source Code:</h4>
	 * <p> Method of AA for viewport rendering and image rendering </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneDisplay scenedisplay = ...;
	 * CPointer&lt;Object&gt; p = scenedisplay.__dna__addressof(SceneDisplay.__DNA__FIELD__viewport_aa);
	 * CPointer&lt;Byte&gt; p_viewport_aa = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewport_aa'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewport_aa = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'render_aa'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method of anti-aliasing when rendering final image
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneDisplay scenedisplay = ...;
	 * CPointer&lt;Object&gt; p = scenedisplay.__dna__addressof(SceneDisplay.__DNA__FIELD__render_aa);
	 * CPointer&lt;Byte&gt; p_render_aa = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_aa'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_aa = new long[]{33, 33};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneDisplay scenedisplay = ...;
	 * CPointer&lt;Object&gt; p = scenedisplay.__dna__addressof(SceneDisplay.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{34, 34};

	/**
	 * Field descriptor (offset) for struct member 'shading'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Shading settings for OpenGL render engine<h4>Blender Source Code:</h4>
	 * <p> OpenGL render engine settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneDisplay scenedisplay = ...;
	 * CPointer&lt;Object&gt; p = scenedisplay.__dna__addressof(SceneDisplay.__DNA__FIELD__shading);
	 * CPointer&lt;View3DShading&gt; p_shading = p.cast(new Class[]{View3DShading.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shading'</li>
	 * <li>Signature: 'View3DShading'</li>
	 * <li>Actual Size (32bit/64bit): 856/856</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shading = new long[]{40, 40};

	public SceneDisplay(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SceneDisplay(SceneDisplay that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'light_direction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Direction of the light for shadows and highlights<h4>Blender Source Code:</h4>
	 * <p>{@link Light}  direction for shadows/highlight. </p>
	 * @see #__DNA__FIELD__light_direction
	 */
	
	public CArrayFacade<Float> getLight_direction() throws IOException
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
	 * Set method for struct member 'light_direction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Direction of the light for shadows and highlights<h4>Blender Source Code:</h4>
	 * <p>{@link Light}  direction for shadows/highlight. </p>
	 * @see #__DNA__FIELD__light_direction
	 */
	
	public void setLight_direction(CArrayFacade<Float> light_direction) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(light_direction, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, light_direction)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, light_direction);
		} else {
			__io__generic__copy( getLight_direction(), light_direction);
		}
	}

	/**
	 * Get method for struct member 'shadow_shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Shadow termination angle
	 * @see #__DNA__FIELD__shadow_shift
	 */
	
	public float getShadow_shift() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'shadow_shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Shadow termination angle
	 * @see #__DNA__FIELD__shadow_shift
	 */
	
	public void setShadow_shift(float shadow_shift) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, shadow_shift);
		} else {
			__io__block.writeFloat(__io__address + 12, shadow_shift);
		}
	}

	/**
	 * Get method for struct member 'shadow_focus'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Shadow factor hardness
	 * @see #__DNA__FIELD__shadow_focus
	 */
	
	public float getShadow_focus() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'shadow_focus'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Shadow factor hardness
	 * @see #__DNA__FIELD__shadow_focus
	 */
	
	public void setShadow_focus(float shadow_focus) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, shadow_focus);
		} else {
			__io__block.writeFloat(__io__address + 16, shadow_focus);
		}
	}

	/**
	 * Get method for struct member 'matcap_ssao_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance of object that contribute to the Cavity/Edge effect<h4>Blender Source Code:</h4>
	 * <p> Settings for Cavity Shader. </p>
	 * @see #__DNA__FIELD__matcap_ssao_distance
	 */
	
	public float getMatcap_ssao_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'matcap_ssao_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance of object that contribute to the Cavity/Edge effect<h4>Blender Source Code:</h4>
	 * <p> Settings for Cavity Shader. </p>
	 * @see #__DNA__FIELD__matcap_ssao_distance
	 */
	
	public void setMatcap_ssao_distance(float matcap_ssao_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, matcap_ssao_distance);
		} else {
			__io__block.writeFloat(__io__address + 20, matcap_ssao_distance);
		}
	}

	/**
	 * Get method for struct member 'matcap_ssao_attenuation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Attenuation constant
	 * @see #__DNA__FIELD__matcap_ssao_attenuation
	 */
	
	public float getMatcap_ssao_attenuation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'matcap_ssao_attenuation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Attenuation constant
	 * @see #__DNA__FIELD__matcap_ssao_attenuation
	 */
	
	public void setMatcap_ssao_attenuation(float matcap_ssao_attenuation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, matcap_ssao_attenuation);
		} else {
			__io__block.writeFloat(__io__address + 24, matcap_ssao_attenuation);
		}
	}

	/**
	 * Get method for struct member 'matcap_ssao_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples
	 * @see #__DNA__FIELD__matcap_ssao_samples
	 */
	
	public int getMatcap_ssao_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'matcap_ssao_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples
	 * @see #__DNA__FIELD__matcap_ssao_samples
	 */
	
	public void setMatcap_ssao_samples(int matcap_ssao_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, matcap_ssao_samples);
		} else {
			__io__block.writeInt(__io__address + 28, matcap_ssao_samples);
		}
	}

	/**
	 * Get method for struct member 'viewport_aa'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method of anti-aliasing when rendering 3d viewport<h4>Blender Source Code:</h4>
	 * <p> Method of AA for viewport rendering and image rendering </p>
	 * @see #__DNA__FIELD__viewport_aa
	 */
	
	public byte getViewport_aa() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 32);
		} else {
			return __io__block.readByte(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'viewport_aa'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method of anti-aliasing when rendering 3d viewport<h4>Blender Source Code:</h4>
	 * <p> Method of AA for viewport rendering and image rendering </p>
	 * @see #__DNA__FIELD__viewport_aa
	 */
	
	public void setViewport_aa(byte viewport_aa) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 32, viewport_aa);
		} else {
			__io__block.writeByte(__io__address + 32, viewport_aa);
		}
	}

	/**
	 * Get method for struct member 'render_aa'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method of anti-aliasing when rendering final image
	 * @see #__DNA__FIELD__render_aa
	 */
	
	public byte getRender_aa() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 33);
		} else {
			return __io__block.readByte(__io__address + 33);
		}
	}

	/**
	 * Set method for struct member 'render_aa'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method of anti-aliasing when rendering final image
	 * @see #__DNA__FIELD__render_aa
	 */
	
	public void setRender_aa(byte render_aa) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 33, render_aa);
		} else {
			__io__block.writeByte(__io__address + 33, render_aa);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 34, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 34, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 34;
		} else {
			__dna__offset = 34;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
		}
	}

	/**
	 * Get method for struct member 'shading'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Shading settings for OpenGL render engine<h4>Blender Source Code:</h4>
	 * <p> OpenGL render engine settings. </p>
	 * @see #__DNA__FIELD__shading
	 */
	
	public View3DShading getShading() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new View3DShading(__io__address + 40, __io__block, __io__blockTable);
		} else {
			return new View3DShading(__io__address + 40, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shading'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Shading settings for OpenGL render engine<h4>Blender Source Code:</h4>
	 * <p> OpenGL render engine settings. </p>
	 * @see #__DNA__FIELD__shading
	 */
	
	public void setShading(View3DShading shading) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(shading, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shading)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shading);
		} else {
			__io__generic__copy( getShading(), shading);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SceneDisplay> __io__addressof() {
		return new CPointer<SceneDisplay>(__io__address, new Class[]{SceneDisplay.class}, __io__block, __io__blockTable);
	}

}
