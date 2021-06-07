package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'GlowShaderFxData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=184, size64=208)
public class GlowShaderFxData extends CFacade {

	/**
	 * This is the sdna index of the struct GlowShaderFxData.
	 * <p>
	 * It is required when allocating a new block to store data for GlowShaderFxData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 570;

	/**
	 * Field descriptor (offset) for struct member 'shaderfx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowShaderFxData glowshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = glowshaderfxdata.__dna__addressof(GlowShaderFxData.__DNA__FIELD__shaderfx);
	 * CPointer&lt;ShaderFxData&gt; p_shaderfx = p.cast(new Class[]{ShaderFxData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shaderfx'</li>
	 * <li>Signature: 'ShaderFxData'</li>
	 * <li>Actual Size (32bit/64bit): 92/104</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shaderfx = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'glow_color'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowShaderFxData glowshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = glowshaderfxdata.__dna__addressof(GlowShaderFxData.__DNA__FIELD__glow_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_glow_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'glow_color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__glow_color = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member 'select_color'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowShaderFxData glowshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = glowshaderfxdata.__dna__addressof(GlowShaderFxData.__DNA__FIELD__select_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_select_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'select_color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__select_color = new long[]{108, 120};

	/**
	 * Field descriptor (offset) for struct member 'threshold'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowShaderFxData glowshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = glowshaderfxdata.__dna__addressof(GlowShaderFxData.__DNA__FIELD__threshold);
	 * CPointer&lt;Float&gt; p_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__threshold = new long[]{120, 132};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowShaderFxData glowshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = glowshaderfxdata.__dna__addressof(GlowShaderFxData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{124, 136};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowShaderFxData glowshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = glowshaderfxdata.__dna__addressof(GlowShaderFxData.__DNA__FIELD__mode);
	 * CPointer&lt;Integer&gt; p_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{128, 140};

	/**
	 * Field descriptor (offset) for struct member 'blur'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowShaderFxData glowshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = glowshaderfxdata.__dna__addressof(GlowShaderFxData.__DNA__FIELD__blur);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_blur = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blur'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blur = new long[]{132, 144};

	/**
	 * Field descriptor (offset) for struct member 'samples'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowShaderFxData glowshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = glowshaderfxdata.__dna__addressof(GlowShaderFxData.__DNA__FIELD__samples);
	 * CPointer&lt;Integer&gt; p_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__samples = new long[]{140, 152};

	/**
	 * Field descriptor (offset) for struct member 'rotation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rotation of effect. <br/> 
	 *  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowShaderFxData glowshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = glowshaderfxdata.__dna__addressof(GlowShaderFxData.__DNA__FIELD__rotation);
	 * CPointer&lt;Float&gt; p_rotation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotation = new long[]{144, 156};

	/**
	 * Field descriptor (offset) for struct member 'blend_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blend modes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowShaderFxData glowshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = glowshaderfxdata.__dna__addressof(GlowShaderFxData.__DNA__FIELD__blend_mode);
	 * CPointer&lt;Integer&gt; p_blend_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_mode = new long[]{148, 160};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowShaderFxData glowshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = glowshaderfxdata.__dna__addressof(GlowShaderFxData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{152, 164};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GlowShaderFxData glowshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = glowshaderfxdata.__dna__addressof(GlowShaderFxData.__DNA__FIELD__runtime);
	 * CPointer&lt;ShaderFxData_Runtime&gt; p_runtime = p.cast(new Class[]{ShaderFxData_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'ShaderFxData_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 28/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{156, 168};

	public GlowShaderFxData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected GlowShaderFxData(GlowShaderFxData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'shaderfx'.
	 * @see #__DNA__FIELD__shaderfx
	 */
	
	public ShaderFxData getShaderfx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ShaderFxData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ShaderFxData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shaderfx'.
	 * @see #__DNA__FIELD__shaderfx
	 */
	
	public void setShaderfx(ShaderFxData shaderfx) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(shaderfx, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shaderfx)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shaderfx);
		} else {
			__io__generic__copy( getShaderfx(), shaderfx);
		}
	}

	/**
	 * Get method for struct member 'glow_color'.
	 * @see #__DNA__FIELD__glow_color
	 */
	
	public CArrayFacade<Float> getGlow_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'glow_color'.
	 * @see #__DNA__FIELD__glow_color
	 */
	
	public void setGlow_color(CArrayFacade<Float> glow_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(glow_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, glow_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, glow_color);
		} else {
			__io__generic__copy( getGlow_color(), glow_color);
		}
	}

	/**
	 * Get method for struct member 'select_color'.
	 * @see #__DNA__FIELD__select_color
	 */
	
	public CArrayFacade<Float> getSelect_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'select_color'.
	 * @see #__DNA__FIELD__select_color
	 */
	
	public void setSelect_color(CArrayFacade<Float> select_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 108;
		}
		if (__io__equals(select_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, select_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, select_color);
		} else {
			__io__generic__copy( getSelect_color(), select_color);
		}
	}

	/**
	 * Get method for struct member 'threshold'.
	 * @see #__DNA__FIELD__threshold
	 */
	
	public float getThreshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 132);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'threshold'.
	 * @see #__DNA__FIELD__threshold
	 */
	
	public void setThreshold(float threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 132, threshold);
		} else {
			__io__block.writeFloat(__io__address + 120, threshold);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, flag);
		} else {
			__io__block.writeInt(__io__address + 124, flag);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 140);
		} else {
			return __io__block.readInt(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 140, mode);
		} else {
			__io__block.writeInt(__io__address + 128, mode);
		}
	}

	/**
	 * Get method for struct member 'blur'.
	 * @see #__DNA__FIELD__blur
	 */
	
	public CArrayFacade<Float> getBlur() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'blur'.
	 * @see #__DNA__FIELD__blur
	 */
	
	public void setBlur(CArrayFacade<Float> blur) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 132;
		}
		if (__io__equals(blur, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, blur)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, blur);
		} else {
			__io__generic__copy( getBlur(), blur);
		}
	}

	/**
	 * Get method for struct member 'samples'.
	 * @see #__DNA__FIELD__samples
	 */
	
	public int getSamples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 152);
		} else {
			return __io__block.readInt(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'samples'.
	 * @see #__DNA__FIELD__samples
	 */
	
	public void setSamples(int samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 152, samples);
		} else {
			__io__block.writeInt(__io__address + 140, samples);
		}
	}

	/**
	 * Get method for struct member 'rotation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rotation of effect. <br/> 
	 *  </p>
	 * @see #__DNA__FIELD__rotation
	 */
	
	public float getRotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'rotation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rotation of effect. <br/> 
	 *  </p>
	 * @see #__DNA__FIELD__rotation
	 */
	
	public void setRotation(float rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, rotation);
		} else {
			__io__block.writeFloat(__io__address + 144, rotation);
		}
	}

	/**
	 * Get method for struct member 'blend_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blend modes. </p>
	 * @see #__DNA__FIELD__blend_mode
	 */
	
	public int getBlend_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 160);
		} else {
			return __io__block.readInt(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'blend_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blend modes. </p>
	 * @see #__DNA__FIELD__blend_mode
	 */
	
	public void setBlend_mode(int blend_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 160, blend_mode);
		} else {
			__io__block.writeInt(__io__address + 148, blend_mode);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 164, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 164;
		} else {
			__dna__offset = 152;
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
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public ShaderFxData_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ShaderFxData_Runtime(__io__address + 168, __io__block, __io__blockTable);
		} else {
			return new ShaderFxData_Runtime(__io__address + 156, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(ShaderFxData_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(runtime, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, runtime)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, runtime);
		} else {
			__io__generic__copy( getRuntime(), runtime);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<GlowShaderFxData> __io__addressof() {
		return new CPointer<GlowShaderFxData>(__io__address, new Class[]{GlowShaderFxData.class}, __io__block, __io__blockTable);
	}

}
