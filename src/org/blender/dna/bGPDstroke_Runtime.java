package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPDstroke_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  GP Strokes Runtime temp data for {@link bGPDstroke}  </p>
 */

@CMetaData(size32=164, size64=164)
public class bGPDstroke_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDstroke_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDstroke_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 466;

	/**
	 * Field descriptor (offset) for struct member 'tmp_stroke_rgba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime final colors (result of original colors and modifiers) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke_Runtime bgpdstroke_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke_runtime.__dna__addressof(bGPDstroke_Runtime.__DNA__FIELD__tmp_stroke_rgba);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_tmp_stroke_rgba = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tmp_stroke_rgba'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tmp_stroke_rgba = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'tmp_fill_rgba'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke_Runtime bgpdstroke_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke_runtime.__dna__addressof(bGPDstroke_Runtime.__DNA__FIELD__tmp_fill_rgba);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_tmp_fill_rgba = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tmp_fill_rgba'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tmp_fill_rgba = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'tmp_layerinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary layer name only used during copy/paste to put the stroke in the original layer </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke_Runtime bgpdstroke_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke_runtime.__dna__addressof(bGPDstroke_Runtime.__DNA__FIELD__tmp_layerinfo);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_tmp_layerinfo = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tmp_layerinfo'</li>
	 * <li>Signature: 'char[128]'</li>
	 * <li>Actual Size (32bit/64bit): 128/128</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tmp_layerinfo = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'multi_frame_falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime falloff factor (only for transform). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke_Runtime bgpdstroke_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke_runtime.__dna__addressof(bGPDstroke_Runtime.__DNA__FIELD__multi_frame_falloff);
	 * CPointer&lt;Float&gt; p_multi_frame_falloff = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'multi_frame_falloff'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__multi_frame_falloff = new long[]{160, 160};

	public bGPDstroke_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPDstroke_Runtime(bGPDstroke_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tmp_stroke_rgba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime final colors (result of original colors and modifiers) </p>
	 * @see #__DNA__FIELD__tmp_stroke_rgba
	 */
	
	public CArrayFacade<Float> getTmp_stroke_rgba() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tmp_stroke_rgba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime final colors (result of original colors and modifiers) </p>
	 * @see #__DNA__FIELD__tmp_stroke_rgba
	 */
	
	public void setTmp_stroke_rgba(CArrayFacade<Float> tmp_stroke_rgba) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(tmp_stroke_rgba, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tmp_stroke_rgba)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tmp_stroke_rgba);
		} else {
			__io__generic__copy( getTmp_stroke_rgba(), tmp_stroke_rgba);
		}
	}

	/**
	 * Get method for struct member 'tmp_fill_rgba'.
	 * @see #__DNA__FIELD__tmp_fill_rgba
	 */
	
	public CArrayFacade<Float> getTmp_fill_rgba() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tmp_fill_rgba'.
	 * @see #__DNA__FIELD__tmp_fill_rgba
	 */
	
	public void setTmp_fill_rgba(CArrayFacade<Float> tmp_fill_rgba) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(tmp_fill_rgba, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tmp_fill_rgba)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tmp_fill_rgba);
		} else {
			__io__generic__copy( getTmp_fill_rgba(), tmp_fill_rgba);
		}
	}

	/**
	 * Get method for struct member 'tmp_layerinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary layer name only used during copy/paste to put the stroke in the original layer </p>
	 * @see #__DNA__FIELD__tmp_layerinfo
	 */
	
	public CArrayFacade<Byte> getTmp_layerinfo() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			128
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tmp_layerinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary layer name only used during copy/paste to put the stroke in the original layer </p>
	 * @see #__DNA__FIELD__tmp_layerinfo
	 */
	
	public void setTmp_layerinfo(CArrayFacade<Byte> tmp_layerinfo) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(tmp_layerinfo, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tmp_layerinfo)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tmp_layerinfo);
		} else {
			__io__generic__copy( getTmp_layerinfo(), tmp_layerinfo);
		}
	}

	/**
	 * Get method for struct member 'multi_frame_falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime falloff factor (only for transform). </p>
	 * @see #__DNA__FIELD__multi_frame_falloff
	 */
	
	public float getMulti_frame_falloff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'multi_frame_falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime falloff factor (only for transform). </p>
	 * @see #__DNA__FIELD__multi_frame_falloff
	 */
	
	public void setMulti_frame_falloff(float multi_frame_falloff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, multi_frame_falloff);
		} else {
			__io__block.writeFloat(__io__address + 160, multi_frame_falloff);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPDstroke_Runtime> __io__addressof() {
		return new CPointer<bGPDstroke_Runtime>(__io__address, new Class[]{bGPDstroke_Runtime.class}, __io__block, __io__blockTable);
	}

}
