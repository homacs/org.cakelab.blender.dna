package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ColorMapping'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=816, size64=816)
public class ColorMapping extends CFacade {

	/**
	 * This is the sdna index of the struct ColorMapping.
	 * <p>
	 * It is required when allocating a new block to store data for ColorMapping.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 46;

	/**
	 * Field descriptor (offset) for struct member 'coba'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorMapping colormapping = ...;
	 * CPointer&lt;Object&gt; p = colormapping.__dna__addressof(ColorMapping.__DNA__FIELD__coba);
	 * CPointer&lt;ColorBand&gt; p_coba = p.cast(new Class[]{ColorBand.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coba'</li>
	 * <li>Signature: 'ColorBand'</li>
	 * <li>Actual Size (32bit/64bit): 776/776</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coba = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'bright'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorMapping colormapping = ...;
	 * CPointer&lt;Object&gt; p = colormapping.__dna__addressof(ColorMapping.__DNA__FIELD__bright);
	 * CPointer&lt;Float&gt; p_bright = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bright'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bright = new long[]{776, 776};

	/**
	 * Field descriptor (offset) for struct member 'contrast'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust the contrast of the texture
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorMapping colormapping = ...;
	 * CPointer&lt;Object&gt; p = colormapping.__dna__addressof(ColorMapping.__DNA__FIELD__contrast);
	 * CPointer&lt;Float&gt; p_contrast = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'contrast'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__contrast = new long[]{780, 780};

	/**
	 * Field descriptor (offset) for struct member 'saturation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust the saturation of colors in the texture
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorMapping colormapping = ...;
	 * CPointer&lt;Object&gt; p = colormapping.__dna__addressof(ColorMapping.__DNA__FIELD__saturation);
	 * CPointer&lt;Float&gt; p_saturation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'saturation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__saturation = new long[]{784, 784};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorMapping colormapping = ...;
	 * CPointer&lt;Object&gt; p = colormapping.__dna__addressof(ColorMapping.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{788, 788};

	/**
	 * Field descriptor (offset) for struct member 'blend_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Blend color to mix with texture output color
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorMapping colormapping = ...;
	 * CPointer&lt;Object&gt; p = colormapping.__dna__addressof(ColorMapping.__DNA__FIELD__blend_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_blend_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_color = new long[]{792, 792};

	/**
	 * Field descriptor (offset) for struct member 'blend_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorMapping colormapping = ...;
	 * CPointer&lt;Object&gt; p = colormapping.__dna__addressof(ColorMapping.__DNA__FIELD__blend_factor);
	 * CPointer&lt;Float&gt; p_blend_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_factor = new long[]{804, 804};

	/**
	 * Field descriptor (offset) for struct member 'blend_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mode used to mix with texture output color
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorMapping colormapping = ...;
	 * CPointer&lt;Object&gt; p = colormapping.__dna__addressof(ColorMapping.__DNA__FIELD__blend_type);
	 * CPointer&lt;Integer&gt; p_blend_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_type = new long[]{808, 808};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorMapping colormapping = ...;
	 * CPointer&lt;Object&gt; p = colormapping.__dna__addressof(ColorMapping.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{812, 812};

	public ColorMapping(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ColorMapping(ColorMapping that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'coba'.
	 * @see #__DNA__FIELD__coba
	 */
	
	public ColorBand getCoba() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorBand(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ColorBand(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'coba'.
	 * @see #__DNA__FIELD__coba
	 */
	
	public void setCoba(ColorBand coba) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(coba, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, coba)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, coba);
		} else {
			__io__generic__copy( getCoba(), coba);
		}
	}

	/**
	 * Get method for struct member 'bright'.
	 * @see #__DNA__FIELD__bright
	 */
	
	public float getBright() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 776);
		} else {
			return __io__block.readFloat(__io__address + 776);
		}
	}

	/**
	 * Set method for struct member 'bright'.
	 * @see #__DNA__FIELD__bright
	 */
	
	public void setBright(float bright) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 776, bright);
		} else {
			__io__block.writeFloat(__io__address + 776, bright);
		}
	}

	/**
	 * Get method for struct member 'contrast'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust the contrast of the texture
	 * @see #__DNA__FIELD__contrast
	 */
	
	public float getContrast() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 780);
		} else {
			return __io__block.readFloat(__io__address + 780);
		}
	}

	/**
	 * Set method for struct member 'contrast'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust the contrast of the texture
	 * @see #__DNA__FIELD__contrast
	 */
	
	public void setContrast(float contrast) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 780, contrast);
		} else {
			__io__block.writeFloat(__io__address + 780, contrast);
		}
	}

	/**
	 * Get method for struct member 'saturation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust the saturation of colors in the texture
	 * @see #__DNA__FIELD__saturation
	 */
	
	public float getSaturation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 784);
		} else {
			return __io__block.readFloat(__io__address + 784);
		}
	}

	/**
	 * Set method for struct member 'saturation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust the saturation of colors in the texture
	 * @see #__DNA__FIELD__saturation
	 */
	
	public void setSaturation(float saturation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 784, saturation);
		} else {
			__io__block.writeFloat(__io__address + 784, saturation);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 788);
		} else {
			return __io__block.readInt(__io__address + 788);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 788, flag);
		} else {
			__io__block.writeInt(__io__address + 788, flag);
		}
	}

	/**
	 * Get method for struct member 'blend_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Blend color to mix with texture output color
	 * @see #__DNA__FIELD__blend_color
	 */
	
	public CArrayFacade<Float> getBlend_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 792, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 792, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'blend_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Blend color to mix with texture output color
	 * @see #__DNA__FIELD__blend_color
	 */
	
	public void setBlend_color(CArrayFacade<Float> blend_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 792;
		} else {
			__dna__offset = 792;
		}
		if (__io__equals(blend_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, blend_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, blend_color);
		} else {
			__io__generic__copy( getBlend_color(), blend_color);
		}
	}

	/**
	 * Get method for struct member 'blend_factor'.
	 * @see #__DNA__FIELD__blend_factor
	 */
	
	public float getBlend_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 804);
		} else {
			return __io__block.readFloat(__io__address + 804);
		}
	}

	/**
	 * Set method for struct member 'blend_factor'.
	 * @see #__DNA__FIELD__blend_factor
	 */
	
	public void setBlend_factor(float blend_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 804, blend_factor);
		} else {
			__io__block.writeFloat(__io__address + 804, blend_factor);
		}
	}

	/**
	 * Get method for struct member 'blend_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mode used to mix with texture output color
	 * @see #__DNA__FIELD__blend_type
	 */
	
	public int getBlend_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 808);
		} else {
			return __io__block.readInt(__io__address + 808);
		}
	}

	/**
	 * Set method for struct member 'blend_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mode used to mix with texture output color
	 * @see #__DNA__FIELD__blend_type
	 */
	
	public void setBlend_type(int blend_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 808, blend_type);
		} else {
			__io__block.writeInt(__io__address + 808, blend_type);
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
			return new CArrayFacade<Byte>(__io__address + 812, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 812, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 812;
		} else {
			__dna__offset = 812;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ColorMapping> __io__addressof() {
		return new CPointer<ColorMapping>(__io__address, new Class[]{ColorMapping.class}, __io__block, __io__blockTable);
	}

}
