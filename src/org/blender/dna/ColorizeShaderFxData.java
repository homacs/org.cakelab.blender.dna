package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ColorizeShaderFxData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=168, size64=192)
public class ColorizeShaderFxData extends CFacade {

	/**
	 * This is the sdna index of the struct ColorizeShaderFxData.
	 * <p>
	 * It is required when allocating a new block to store data for ColorizeShaderFxData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 495;

	/**
	 * Field descriptor (offset) for struct member 'shaderfx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorizeShaderFxData colorizeshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = colorizeshaderfxdata.__dna__addressof(ColorizeShaderFxData.__DNA__FIELD__shaderfx);
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
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorizeShaderFxData colorizeshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = colorizeshaderfxdata.__dna__addressof(ColorizeShaderFxData.__DNA__FIELD__mode);
	 * CPointer&lt;Integer&gt; p_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member 'low_color'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorizeShaderFxData colorizeshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = colorizeshaderfxdata.__dna__addressof(ColorizeShaderFxData.__DNA__FIELD__low_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_low_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'low_color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__low_color = new long[]{96, 108};

	/**
	 * Field descriptor (offset) for struct member 'high_color'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorizeShaderFxData colorizeshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = colorizeshaderfxdata.__dna__addressof(ColorizeShaderFxData.__DNA__FIELD__high_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_high_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'high_color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__high_color = new long[]{112, 124};

	/**
	 * Field descriptor (offset) for struct member 'factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorizeShaderFxData colorizeshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = colorizeshaderfxdata.__dna__addressof(ColorizeShaderFxData.__DNA__FIELD__factor);
	 * CPointer&lt;Float&gt; p_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__factor = new long[]{128, 140};

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
	 * ColorizeShaderFxData colorizeshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = colorizeshaderfxdata.__dna__addressof(ColorizeShaderFxData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{132, 144};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorizeShaderFxData colorizeshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = colorizeshaderfxdata.__dna__addressof(ColorizeShaderFxData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{136, 148};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorizeShaderFxData colorizeshaderfxdata = ...;
	 * CPointer&lt;Object&gt; p = colorizeshaderfxdata.__dna__addressof(ColorizeShaderFxData.__DNA__FIELD__runtime);
	 * CPointer&lt;ShaderFxData_Runtime&gt; p_runtime = p.cast(new Class[]{ShaderFxData_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'ShaderFxData_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 28/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{140, 152};

	public ColorizeShaderFxData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ColorizeShaderFxData(ColorizeShaderFxData that) {
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
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 104);
		} else {
			return __io__block.readInt(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 104, mode);
		} else {
			__io__block.writeInt(__io__address + 92, mode);
		}
	}

	/**
	 * Get method for struct member 'low_color'.
	 * @see #__DNA__FIELD__low_color
	 */
	
	public CArrayFacade<Float> getLow_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'low_color'.
	 * @see #__DNA__FIELD__low_color
	 */
	
	public void setLow_color(CArrayFacade<Float> low_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 108;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(low_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, low_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, low_color);
		} else {
			__io__generic__copy( getLow_color(), low_color);
		}
	}

	/**
	 * Get method for struct member 'high_color'.
	 * @see #__DNA__FIELD__high_color
	 */
	
	public CArrayFacade<Float> getHigh_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'high_color'.
	 * @see #__DNA__FIELD__high_color
	 */
	
	public void setHigh_color(CArrayFacade<Float> high_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 124;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(high_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, high_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, high_color);
		} else {
			__io__generic__copy( getHigh_color(), high_color);
		}
	}

	/**
	 * Get method for struct member 'factor'.
	 * @see #__DNA__FIELD__factor
	 */
	
	public float getFactor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'factor'.
	 * @see #__DNA__FIELD__factor
	 */
	
	public void setFactor(float factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, factor);
		} else {
			__io__block.writeFloat(__io__address + 128, factor);
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
			return __io__block.readInt(__io__address + 144);
		} else {
			return __io__block.readInt(__io__address + 132);
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
			__io__block.writeInt(__io__address + 144, flag);
		} else {
			__io__block.writeInt(__io__address + 132, flag);
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
			return new CArrayFacade<Byte>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 148;
		} else {
			__dna__offset = 136;
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
			return new ShaderFxData_Runtime(__io__address + 152, __io__block, __io__blockTable);
		} else {
			return new ShaderFxData_Runtime(__io__address + 140, __io__block, __io__blockTable);
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
			__dna__offset = 152;
		} else {
			__dna__offset = 140;
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
	public CPointer<ColorizeShaderFxData> __io__addressof() {
		return new CPointer<ColorizeShaderFxData>(__io__address, new Class[]{ColorizeShaderFxData.class}, __io__block, __io__blockTable);
	}

}
