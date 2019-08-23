package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'uiWidgetColors'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=32, size64=32)
public class uiWidgetColors extends CFacade {

	/**
	 * This is the sdna index of the struct uiWidgetColors.
	 * <p>
	 * It is required when allocating a new block to store data for uiWidgetColors.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 242;

	/**
	 * Field descriptor (offset) for struct member 'outline'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetColors uiwidgetcolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetcolors.__dna__addressof(uiWidgetColors.__DNA__FIELD__outline);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_outline = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'outline'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__outline = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'inner'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetColors uiwidgetcolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetcolors.__dna__addressof(uiWidgetColors.__DNA__FIELD__inner);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_inner = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inner'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inner = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'inner_sel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetColors uiwidgetcolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetcolors.__dna__addressof(uiWidgetColors.__DNA__FIELD__inner_sel);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_inner_sel = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inner_sel'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inner_sel = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'item'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetColors uiwidgetcolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetcolors.__dna__addressof(uiWidgetColors.__DNA__FIELD__item);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_item = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'item'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__item = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetColors uiwidgetcolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetcolors.__dna__addressof(uiWidgetColors.__DNA__FIELD__text);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_text = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'text_sel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetColors uiwidgetcolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetcolors.__dna__addressof(uiWidgetColors.__DNA__FIELD__text_sel);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_text_sel = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text_sel'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text_sel = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'shaded'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetColors uiwidgetcolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetcolors.__dna__addressof(uiWidgetColors.__DNA__FIELD__shaded);
	 * CPointer&lt;Short&gt; p_shaded = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shaded'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shaded = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'shadetop'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetColors uiwidgetcolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetcolors.__dna__addressof(uiWidgetColors.__DNA__FIELD__shadetop);
	 * CPointer&lt;Short&gt; p_shadetop = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadetop'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadetop = new long[]{26, 26};

	/**
	 * Field descriptor (offset) for struct member 'shadedown'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetColors uiwidgetcolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetcolors.__dna__addressof(uiWidgetColors.__DNA__FIELD__shadedown);
	 * CPointer&lt;Short&gt; p_shadedown = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadedown'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadedown = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'alpha_check'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiWidgetColors uiwidgetcolors = ...;
	 * CPointer&lt;Object&gt; p = uiwidgetcolors.__dna__addressof(uiWidgetColors.__DNA__FIELD__alpha_check);
	 * CPointer&lt;Short&gt; p_alpha_check = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha_check'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha_check = new long[]{30, 30};

	public uiWidgetColors(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected uiWidgetColors(uiWidgetColors that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'outline'.
	 * @see #__DNA__FIELD__outline
	 */
	
	public CArrayFacade<Byte> getOutline() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'outline'.
	 * @see #__DNA__FIELD__outline
	 */
	
	public void setOutline(CArrayFacade<Byte> outline) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(outline, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, outline)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, outline);
		} else {
			__io__generic__copy( getOutline(), outline);
		}
	}

	/**
	 * Get method for struct member 'inner'.
	 * @see #__DNA__FIELD__inner
	 */
	
	public CArrayFacade<Byte> getInner() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'inner'.
	 * @see #__DNA__FIELD__inner
	 */
	
	public void setInner(CArrayFacade<Byte> inner) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(inner, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, inner)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, inner);
		} else {
			__io__generic__copy( getInner(), inner);
		}
	}

	/**
	 * Get method for struct member 'inner_sel'.
	 * @see #__DNA__FIELD__inner_sel
	 */
	
	public CArrayFacade<Byte> getInner_sel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'inner_sel'.
	 * @see #__DNA__FIELD__inner_sel
	 */
	
	public void setInner_sel(CArrayFacade<Byte> inner_sel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(inner_sel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, inner_sel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, inner_sel);
		} else {
			__io__generic__copy( getInner_sel(), inner_sel);
		}
	}

	/**
	 * Get method for struct member 'item'.
	 * @see #__DNA__FIELD__item
	 */
	
	public CArrayFacade<Byte> getItem() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'item'.
	 * @see #__DNA__FIELD__item
	 */
	
	public void setItem(CArrayFacade<Byte> item) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(item, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, item)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, item);
		} else {
			__io__generic__copy( getItem(), item);
		}
	}

	/**
	 * Get method for struct member 'text'.
	 * @see #__DNA__FIELD__text
	 */
	
	public CArrayFacade<Byte> getText() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
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
	 * Get method for struct member 'text_sel'.
	 * @see #__DNA__FIELD__text_sel
	 */
	
	public CArrayFacade<Byte> getText_sel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'text_sel'.
	 * @see #__DNA__FIELD__text_sel
	 */
	
	public void setText_sel(CArrayFacade<Byte> text_sel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(text_sel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, text_sel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, text_sel);
		} else {
			__io__generic__copy( getText_sel(), text_sel);
		}
	}

	/**
	 * Get method for struct member 'shaded'.
	 * @see #__DNA__FIELD__shaded
	 */
	
	public short getShaded() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'shaded'.
	 * @see #__DNA__FIELD__shaded
	 */
	
	public void setShaded(short shaded) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, shaded);
		} else {
			__io__block.writeShort(__io__address + 24, shaded);
		}
	}

	/**
	 * Get method for struct member 'shadetop'.
	 * @see #__DNA__FIELD__shadetop
	 */
	
	public short getShadetop() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 26);
		} else {
			return __io__block.readShort(__io__address + 26);
		}
	}

	/**
	 * Set method for struct member 'shadetop'.
	 * @see #__DNA__FIELD__shadetop
	 */
	
	public void setShadetop(short shadetop) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 26, shadetop);
		} else {
			__io__block.writeShort(__io__address + 26, shadetop);
		}
	}

	/**
	 * Get method for struct member 'shadedown'.
	 * @see #__DNA__FIELD__shadedown
	 */
	
	public short getShadedown() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 28);
		} else {
			return __io__block.readShort(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'shadedown'.
	 * @see #__DNA__FIELD__shadedown
	 */
	
	public void setShadedown(short shadedown) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 28, shadedown);
		} else {
			__io__block.writeShort(__io__address + 28, shadedown);
		}
	}

	/**
	 * Get method for struct member 'alpha_check'.
	 * @see #__DNA__FIELD__alpha_check
	 */
	
	public short getAlpha_check() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 30);
		} else {
			return __io__block.readShort(__io__address + 30);
		}
	}

	/**
	 * Set method for struct member 'alpha_check'.
	 * @see #__DNA__FIELD__alpha_check
	 */
	
	public void setAlpha_check(short alpha_check) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 30, alpha_check);
		} else {
			__io__block.writeShort(__io__address + 30, alpha_check);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<uiWidgetColors> __io__addressof() {
		return new CPointer<uiWidgetColors>(__io__address, new Class[]{uiWidgetColors.class}, __io__block, __io__blockTable);
	}

}
