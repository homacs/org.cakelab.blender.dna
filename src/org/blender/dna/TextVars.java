package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'TextVars'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=572, size64=576)
public class TextVars extends CFacade {

	/**
	 * This is the sdna index of the struct TextVars.
	 * <p>
	 * It is required when allocating a new block to store data for TextVars.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 289;

	/**
	 * Field descriptor (offset) for struct member 'text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__text);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_text = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text'</li>
	 * <li>Signature: 'char[512]'</li>
	 * <li>Actual Size (32bit/64bit): 512/512</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'text_font'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__text_font);
	 * CPointer&lt;CPointer&lt;VFont&gt;&gt; p_text_font = p.cast(new Class[]{CPointer.class, VFont.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text_font'</li>
	 * <li>Signature: 'VFont*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text_font = new long[]{512, 512};

	/**
	 * Field descriptor (offset) for struct member 'text_blf_id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__text_blf_id);
	 * CPointer&lt;Integer&gt; p_text_blf_id = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text_blf_id'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text_blf_id = new long[]{516, 520};

	/**
	 * Field descriptor (offset) for struct member 'text_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__text_size);
	 * CPointer&lt;Integer&gt; p_text_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text_size = new long[]{520, 524};

	/**
	 * Field descriptor (offset) for struct member 'color'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color = new long[]{524, 528};

	/**
	 * Field descriptor (offset) for struct member 'shadow_color'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__shadow_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_shadow_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadow_color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadow_color = new long[]{540, 544};

	/**
	 * Field descriptor (offset) for struct member 'loc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__loc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_loc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loc'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loc = new long[]{556, 560};

	/**
	 * Field descriptor (offset) for struct member 'wrap_width'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__wrap_width);
	 * CPointer&lt;Float&gt; p_wrap_width = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wrap_width'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wrap_width = new long[]{564, 568};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{568, 572};

	/**
	 * Field descriptor (offset) for struct member 'align'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__align);
	 * CPointer&lt;Byte&gt; p_align = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'align'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__align = new long[]{569, 573};

	/**
	 * Field descriptor (offset) for struct member 'align_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD__align_y);
	 * CPointer&lt;Byte&gt; p_align_y = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'align_y'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__align_y = new long[]{570, 574};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TextVars textvars = ...;
	 * CPointer&lt;Object&gt; p = textvars.__dna__addressof(TextVars.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{571, 575};

	public TextVars(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected TextVars(TextVars that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'text'.
	 * @see #__DNA__FIELD__text
	 */
	
	public CArrayFacade<Byte> getText() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			512
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'text'.
	 * @see #__DNA__FIELD__text
	 */
	
	public void setText(CArrayFacade<Byte> text) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(text, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, text)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, text);
		} else {
			__io__generic__copy( getText(), text);
		}
	}

	/**
	 * Get method for struct member 'text_font'.
	 * @see #__DNA__FIELD__text_font
	 */
	
	public CPointer<VFont> getText_font() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 512);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 512);
		}
		Class<?>[] __dna__targetTypes = new Class[]{VFont.class};
		return new CPointer<VFont>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, VFont.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'text_font'.
	 * @see #__DNA__FIELD__text_font
	 */
	
	public void setText_font(CPointer<VFont> text_font) throws IOException
	{
		long __address = ((text_font == null) ? 0 : text_font.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 512, __address);
		} else {
			__io__block.writeLong(__io__address + 512, __address);
		}
	}

	/**
	 * Get method for struct member 'text_blf_id'.
	 * @see #__DNA__FIELD__text_blf_id
	 */
	
	public int getText_blf_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 520);
		} else {
			return __io__block.readInt(__io__address + 516);
		}
	}

	/**
	 * Set method for struct member 'text_blf_id'.
	 * @see #__DNA__FIELD__text_blf_id
	 */
	
	public void setText_blf_id(int text_blf_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 520, text_blf_id);
		} else {
			__io__block.writeInt(__io__address + 516, text_blf_id);
		}
	}

	/**
	 * Get method for struct member 'text_size'.
	 * @see #__DNA__FIELD__text_size
	 */
	
	public int getText_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 524);
		} else {
			return __io__block.readInt(__io__address + 520);
		}
	}

	/**
	 * Set method for struct member 'text_size'.
	 * @see #__DNA__FIELD__text_size
	 */
	
	public void setText_size(int text_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 524, text_size);
		} else {
			__io__block.writeInt(__io__address + 520, text_size);
		}
	}

	/**
	 * Get method for struct member 'color'.
	 * @see #__DNA__FIELD__color
	 */
	
	public CArrayFacade<Float> getColor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 528, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 524, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'color'.
	 * @see #__DNA__FIELD__color
	 */
	
	public void setColor(CArrayFacade<Float> color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 528;
		} else {
			__dna__offset = 524;
		}
		if (__io__equals(color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, color);
		} else {
			__io__generic__copy( getColor(), color);
		}
	}

	/**
	 * Get method for struct member 'shadow_color'.
	 * @see #__DNA__FIELD__shadow_color
	 */
	
	public CArrayFacade<Float> getShadow_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 544, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 540, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shadow_color'.
	 * @see #__DNA__FIELD__shadow_color
	 */
	
	public void setShadow_color(CArrayFacade<Float> shadow_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 544;
		} else {
			__dna__offset = 540;
		}
		if (__io__equals(shadow_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shadow_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shadow_color);
		} else {
			__io__generic__copy( getShadow_color(), shadow_color);
		}
	}

	/**
	 * Get method for struct member 'loc'.
	 * @see #__DNA__FIELD__loc
	 */
	
	public CArrayFacade<Float> getLoc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 560, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 556, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'loc'.
	 * @see #__DNA__FIELD__loc
	 */
	
	public void setLoc(CArrayFacade<Float> loc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 560;
		} else {
			__dna__offset = 556;
		}
		if (__io__equals(loc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, loc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, loc);
		} else {
			__io__generic__copy( getLoc(), loc);
		}
	}

	/**
	 * Get method for struct member 'wrap_width'.
	 * @see #__DNA__FIELD__wrap_width
	 */
	
	public float getWrap_width() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 568);
		} else {
			return __io__block.readFloat(__io__address + 564);
		}
	}

	/**
	 * Set method for struct member 'wrap_width'.
	 * @see #__DNA__FIELD__wrap_width
	 */
	
	public void setWrap_width(float wrap_width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 568, wrap_width);
		} else {
			__io__block.writeFloat(__io__address + 564, wrap_width);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 572);
		} else {
			return __io__block.readByte(__io__address + 568);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 572, flag);
		} else {
			__io__block.writeByte(__io__address + 568, flag);
		}
	}

	/**
	 * Get method for struct member 'align'.
	 * @see #__DNA__FIELD__align
	 */
	
	public byte getAlign() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 573);
		} else {
			return __io__block.readByte(__io__address + 569);
		}
	}

	/**
	 * Set method for struct member 'align'.
	 * @see #__DNA__FIELD__align
	 */
	
	public void setAlign(byte align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 573, align);
		} else {
			__io__block.writeByte(__io__address + 569, align);
		}
	}

	/**
	 * Get method for struct member 'align_y'.
	 * @see #__DNA__FIELD__align_y
	 */
	
	public byte getAlign_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 574);
		} else {
			return __io__block.readByte(__io__address + 570);
		}
	}

	/**
	 * Set method for struct member 'align_y'.
	 * @see #__DNA__FIELD__align_y
	 */
	
	public void setAlign_y(byte align_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 574, align_y);
		} else {
			__io__block.writeByte(__io__address + 570, align_y);
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
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 575, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 571, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 575;
		} else {
			__dna__offset = 571;
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
	public CPointer<TextVars> __io__addressof() {
		return new CPointer<TextVars>(__io__address, new Class[]{TextVars.class}, __io__block, __io__blockTable);
	}

}
