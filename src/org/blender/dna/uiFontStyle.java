package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'uiFontStyle'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> this state defines appearance of text </p>
 */

@CMetaData(size32=32, size64=32)
public class uiFontStyle extends CFacade {

	/**
	 * This is the sdna index of the struct uiFontStyle.
	 * <p>
	 * It is required when allocating a new block to store data for uiFontStyle.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 236;

	/**
	 * Field descriptor (offset) for struct member 'uifont_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> saved in file, 0 is default </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFontStyle uifontstyle = ...;
	 * CPointer&lt;Object&gt; p = uifontstyle.__dna__addressof(uiFontStyle.__DNA__FIELD__uifont_id);
	 * CPointer&lt;Short&gt; p_uifont_id = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uifont_id'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uifont_id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> actual size depends on 'global' dpi </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFontStyle uifontstyle = ...;
	 * CPointer&lt;Object&gt; p = uifontstyle.__dna__addressof(uiFontStyle.__DNA__FIELD__points);
	 * CPointer&lt;Short&gt; p_points = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'points'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__points = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'kerning'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unfitted or default kerning value. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFontStyle uifontstyle = ...;
	 * CPointer&lt;Object&gt; p = uifontstyle.__dna__addressof(uiFontStyle.__DNA__FIELD__kerning);
	 * CPointer&lt;Short&gt; p_kerning = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kerning'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kerning = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'word_wrap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> enable word-wrap when drawing </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFontStyle uifontstyle = ...;
	 * CPointer&lt;Object&gt; p = uifontstyle.__dna__addressof(uiFontStyle.__DNA__FIELD__word_wrap);
	 * CPointer&lt;Byte&gt; p_word_wrap = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'word_wrap'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__word_wrap = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFontStyle uifontstyle = ...;
	 * CPointer&lt;Object&gt; p = uifontstyle.__dna__addressof(uiFontStyle.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[5]'</li>
	 * <li>Actual Size (32bit/64bit): 5/5</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{7, 7};

	/**
	 * Field descriptor (offset) for struct member 'italic'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFontStyle uifontstyle = ...;
	 * CPointer&lt;Object&gt; p = uifontstyle.__dna__addressof(uiFontStyle.__DNA__FIELD__italic);
	 * CPointer&lt;Short&gt; p_italic = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'italic'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__italic = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'bold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> style hint </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFontStyle uifontstyle = ...;
	 * CPointer&lt;Object&gt; p = uifontstyle.__dna__addressof(uiFontStyle.__DNA__FIELD__bold);
	 * CPointer&lt;Short&gt; p_bold = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bold'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bold = new long[]{14, 14};

	/**
	 * Field descriptor (offset) for struct member 'shadow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> value is amount of pixels blur </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFontStyle uifontstyle = ...;
	 * CPointer&lt;Object&gt; p = uifontstyle.__dna__addressof(uiFontStyle.__DNA__FIELD__shadow);
	 * CPointer&lt;Short&gt; p_shadow = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadow'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadow = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'shadx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFontStyle uifontstyle = ...;
	 * CPointer&lt;Object&gt; p = uifontstyle.__dna__addressof(uiFontStyle.__DNA__FIELD__shadx);
	 * CPointer&lt;Short&gt; p_shadx = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadx'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadx = new long[]{18, 18};

	/**
	 * Field descriptor (offset) for struct member 'shady'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> shadow offset in pixels </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFontStyle uifontstyle = ...;
	 * CPointer&lt;Object&gt; p = uifontstyle.__dna__addressof(uiFontStyle.__DNA__FIELD__shady);
	 * CPointer&lt;Short&gt; p_shady = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shady'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shady = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> text align hint </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFontStyle uifontstyle = ...;
	 * CPointer&lt;Object&gt; p = uifontstyle.__dna__addressof(uiFontStyle.__DNA__FIELD__align);
	 * CPointer&lt;Short&gt; p_align = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'align'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__align = new long[]{22, 22};

	/**
	 * Field descriptor (offset) for struct member 'shadowalpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total alpha </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFontStyle uifontstyle = ...;
	 * CPointer&lt;Object&gt; p = uifontstyle.__dna__addressof(uiFontStyle.__DNA__FIELD__shadowalpha);
	 * CPointer&lt;Float&gt; p_shadowalpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadowalpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadowalpha = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'shadowcolor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1 value, typically white or black anyway </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiFontStyle uifontstyle = ...;
	 * CPointer&lt;Object&gt; p = uifontstyle.__dna__addressof(uiFontStyle.__DNA__FIELD__shadowcolor);
	 * CPointer&lt;Float&gt; p_shadowcolor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadowcolor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadowcolor = new long[]{28, 28};

	public uiFontStyle(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected uiFontStyle(uiFontStyle that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'uifont_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> saved in file, 0 is default </p>
	 * @see #__DNA__FIELD__uifont_id
	 */
	
	public short getUifont_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'uifont_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> saved in file, 0 is default </p>
	 * @see #__DNA__FIELD__uifont_id
	 */
	
	public void setUifont_id(short uifont_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, uifont_id);
		} else {
			__io__block.writeShort(__io__address + 0, uifont_id);
		}
	}

	/**
	 * Get method for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> actual size depends on 'global' dpi </p>
	 * @see #__DNA__FIELD__points
	 */
	
	public short getPoints() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> actual size depends on 'global' dpi </p>
	 * @see #__DNA__FIELD__points
	 */
	
	public void setPoints(short points) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, points);
		} else {
			__io__block.writeShort(__io__address + 2, points);
		}
	}

	/**
	 * Get method for struct member 'kerning'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unfitted or default kerning value. </p>
	 * @see #__DNA__FIELD__kerning
	 */
	
	public short getKerning() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'kerning'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unfitted or default kerning value. </p>
	 * @see #__DNA__FIELD__kerning
	 */
	
	public void setKerning(short kerning) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, kerning);
		} else {
			__io__block.writeShort(__io__address + 4, kerning);
		}
	}

	/**
	 * Get method for struct member 'word_wrap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> enable word-wrap when drawing </p>
	 * @see #__DNA__FIELD__word_wrap
	 */
	
	public byte getWord_wrap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 6);
		} else {
			return __io__block.readByte(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'word_wrap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> enable word-wrap when drawing </p>
	 * @see #__DNA__FIELD__word_wrap
	 */
	
	public void setWord_wrap(byte word_wrap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 6, word_wrap);
		} else {
			__io__block.writeByte(__io__address + 6, word_wrap);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Byte> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			5
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 7, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 7, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Byte> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 7;
		} else {
			__dna__offset = 7;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
		}
	}

	/**
	 * Get method for struct member 'italic'.
	 * @see #__DNA__FIELD__italic
	 */
	
	public short getItalic() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'italic'.
	 * @see #__DNA__FIELD__italic
	 */
	
	public void setItalic(short italic) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12, italic);
		} else {
			__io__block.writeShort(__io__address + 12, italic);
		}
	}

	/**
	 * Get method for struct member 'bold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> style hint </p>
	 * @see #__DNA__FIELD__bold
	 */
	
	public short getBold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 14);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'bold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> style hint </p>
	 * @see #__DNA__FIELD__bold
	 */
	
	public void setBold(short bold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 14, bold);
		} else {
			__io__block.writeShort(__io__address + 14, bold);
		}
	}

	/**
	 * Get method for struct member 'shadow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> value is amount of pixels blur </p>
	 * @see #__DNA__FIELD__shadow
	 */
	
	public short getShadow() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'shadow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> value is amount of pixels blur </p>
	 * @see #__DNA__FIELD__shadow
	 */
	
	public void setShadow(short shadow) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, shadow);
		} else {
			__io__block.writeShort(__io__address + 16, shadow);
		}
	}

	/**
	 * Get method for struct member 'shadx'.
	 * @see #__DNA__FIELD__shadx
	 */
	
	public short getShadx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'shadx'.
	 * @see #__DNA__FIELD__shadx
	 */
	
	public void setShadx(short shadx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, shadx);
		} else {
			__io__block.writeShort(__io__address + 18, shadx);
		}
	}

	/**
	 * Get method for struct member 'shady'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> shadow offset in pixels </p>
	 * @see #__DNA__FIELD__shady
	 */
	
	public short getShady() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'shady'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> shadow offset in pixels </p>
	 * @see #__DNA__FIELD__shady
	 */
	
	public void setShady(short shady) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, shady);
		} else {
			__io__block.writeShort(__io__address + 20, shady);
		}
	}

	/**
	 * Get method for struct member 'align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> text align hint </p>
	 * @see #__DNA__FIELD__align
	 */
	
	public short getAlign() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 22);
		} else {
			return __io__block.readShort(__io__address + 22);
		}
	}

	/**
	 * Set method for struct member 'align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> text align hint </p>
	 * @see #__DNA__FIELD__align
	 */
	
	public void setAlign(short align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 22, align);
		} else {
			__io__block.writeShort(__io__address + 22, align);
		}
	}

	/**
	 * Get method for struct member 'shadowalpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total alpha </p>
	 * @see #__DNA__FIELD__shadowalpha
	 */
	
	public float getShadowalpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'shadowalpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total alpha </p>
	 * @see #__DNA__FIELD__shadowalpha
	 */
	
	public void setShadowalpha(float shadowalpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, shadowalpha);
		} else {
			__io__block.writeFloat(__io__address + 24, shadowalpha);
		}
	}

	/**
	 * Get method for struct member 'shadowcolor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1 value, typically white or black anyway </p>
	 * @see #__DNA__FIELD__shadowcolor
	 */
	
	public float getShadowcolor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'shadowcolor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1 value, typically white or black anyway </p>
	 * @see #__DNA__FIELD__shadowcolor
	 */
	
	public void setShadowcolor(float shadowcolor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, shadowcolor);
		} else {
			__io__block.writeFloat(__io__address + 28, shadowcolor);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<uiFontStyle> __io__addressof() {
		return new CPointer<uiFontStyle>(__io__address, new Class[]{uiFontStyle.class}, __io__block, __io__blockTable);
	}

}
