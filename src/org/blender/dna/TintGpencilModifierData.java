package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'TintGpencilModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=260, size64=272)
public class TintGpencilModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct TintGpencilModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for TintGpencilModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 488;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TintGpencilModifierData tintgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = tintgpencilmodifierdata.__dna__addressof(TintGpencilModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;GpencilModifierData&gt; p_modifier = p.cast(new Class[]{GpencilModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'GpencilModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 92/104</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Layer name. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TintGpencilModifierData tintgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = tintgpencilmodifierdata.__dna__addressof(TintGpencilModifierData.__DNA__FIELD__layername);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_layername = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layername'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layername = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member 'materialname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  name. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TintGpencilModifierData tintgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = tintgpencilmodifierdata.__dna__addressof(TintGpencilModifierData.__DNA__FIELD__materialname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_materialname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'materialname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__materialname = new long[]{156, 168};

	/**
	 * Field descriptor (offset) for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TintGpencilModifierData tintgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = tintgpencilmodifierdata.__dna__addressof(TintGpencilModifierData.__DNA__FIELD__pass_index);
	 * CPointer&lt;Integer&gt; p_pass_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass_index = new long[]{220, 232};

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
	 * TintGpencilModifierData tintgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = tintgpencilmodifierdata.__dna__addressof(TintGpencilModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{224, 236};

	/**
	 * Field descriptor (offset) for struct member 'rgb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tint color. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TintGpencilModifierData tintgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = tintgpencilmodifierdata.__dna__addressof(TintGpencilModifierData.__DNA__FIELD__rgb);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rgb = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rgb'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rgb = new long[]{228, 240};

	/**
	 * Field descriptor (offset) for struct member 'factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mix factor. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TintGpencilModifierData tintgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = tintgpencilmodifierdata.__dna__addressof(TintGpencilModifierData.__DNA__FIELD__factor);
	 * CPointer&lt;Float&gt; p_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__factor = new long[]{240, 252};

	/**
	 * Field descriptor (offset) for struct member 'modify_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Modify stroke, fill or both. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TintGpencilModifierData tintgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = tintgpencilmodifierdata.__dna__addressof(TintGpencilModifierData.__DNA__FIELD__modify_color);
	 * CPointer&lt;Byte&gt; p_modify_color = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modify_color'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modify_color = new long[]{244, 256};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TintGpencilModifierData tintgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = tintgpencilmodifierdata.__dna__addressof(TintGpencilModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{245, 257};

	/**
	 * Field descriptor (offset) for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TintGpencilModifierData tintgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = tintgpencilmodifierdata.__dna__addressof(TintGpencilModifierData.__DNA__FIELD__layer_pass);
	 * CPointer&lt;Integer&gt; p_layer_pass = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_pass'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_pass = new long[]{252, 264};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TintGpencilModifierData tintgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = tintgpencilmodifierdata.__dna__addressof(TintGpencilModifierData.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{256, 268};

	public TintGpencilModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected TintGpencilModifierData(TintGpencilModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public GpencilModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GpencilModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new GpencilModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(GpencilModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Layer name. </p>
	 * @see #__DNA__FIELD__layername
	 */
	
	public CArrayFacade<Byte> getLayername() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Layer name. </p>
	 * @see #__DNA__FIELD__layername
	 */
	
	public void setLayername(CArrayFacade<Byte> layername) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(layername, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layername)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layername);
		} else {
			__io__generic__copy( getLayername(), layername);
		}
	}

	/**
	 * Get method for struct member 'materialname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  name. </p>
	 * @see #__DNA__FIELD__materialname
	 */
	
	public CArrayFacade<Byte> getMaterialname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'materialname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  name. </p>
	 * @see #__DNA__FIELD__materialname
	 */
	
	public void setMaterialname(CArrayFacade<Byte> materialname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(materialname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, materialname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, materialname);
		} else {
			__io__generic__copy( getMaterialname(), materialname);
		}
	}

	/**
	 * Get method for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public int getPass_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 232);
		} else {
			return __io__block.readInt(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public void setPass_index(int pass_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 232, pass_index);
		} else {
			__io__block.writeInt(__io__address + 220, pass_index);
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
			return __io__block.readInt(__io__address + 236);
		} else {
			return __io__block.readInt(__io__address + 224);
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
			__io__block.writeInt(__io__address + 236, flag);
		} else {
			__io__block.writeInt(__io__address + 224, flag);
		}
	}

	/**
	 * Get method for struct member 'rgb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tint color. </p>
	 * @see #__DNA__FIELD__rgb
	 */
	
	public CArrayFacade<Float> getRgb() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 228, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rgb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tint color. </p>
	 * @see #__DNA__FIELD__rgb
	 */
	
	public void setRgb(CArrayFacade<Float> rgb) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 240;
		} else {
			__dna__offset = 228;
		}
		if (__io__equals(rgb, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rgb)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rgb);
		} else {
			__io__generic__copy( getRgb(), rgb);
		}
	}

	/**
	 * Get method for struct member 'factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mix factor. </p>
	 * @see #__DNA__FIELD__factor
	 */
	
	public float getFactor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 252);
		} else {
			return __io__block.readFloat(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mix factor. </p>
	 * @see #__DNA__FIELD__factor
	 */
	
	public void setFactor(float factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 252, factor);
		} else {
			__io__block.writeFloat(__io__address + 240, factor);
		}
	}

	/**
	 * Get method for struct member 'modify_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Modify stroke, fill or both. </p>
	 * @see #__DNA__FIELD__modify_color
	 */
	
	public byte getModify_color() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 256);
		} else {
			return __io__block.readByte(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'modify_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Modify stroke, fill or both. </p>
	 * @see #__DNA__FIELD__modify_color
	 */
	
	public void setModify_color(byte modify_color) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 256, modify_color);
		} else {
			__io__block.writeByte(__io__address + 244, modify_color);
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
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 257, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 245, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 257;
		} else {
			__dna__offset = 245;
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
	 * Get method for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__layer_pass
	 */
	
	public int getLayer_pass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 264);
		} else {
			return __io__block.readInt(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__layer_pass
	 */
	
	public void setLayer_pass(int layer_pass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 264, layer_pass);
		} else {
			__io__block.writeInt(__io__address + 252, layer_pass);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 268, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 256, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 268;
		} else {
			__dna__offset = 256;
		}
		if (__io__equals(_pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1);
		} else {
			__io__generic__copy( get_pad1(), _pad1);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<TintGpencilModifierData> __io__addressof() {
		return new CPointer<TintGpencilModifierData>(__io__address, new Class[]{TintGpencilModifierData.class}, __io__block, __io__blockTable);
	}

}
