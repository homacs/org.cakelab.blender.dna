package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'uiStyle'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> this is fed to the layout engine and widget code </p>
 */

@CMetaData(size32=192, size64=200)
public class uiStyle extends CFacade {

	/**
	 * This is the sdna index of the struct uiStyle.
	 * <p>
	 * It is required when allocating a new block to store data for uiStyle.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 240;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;uiStyle&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, uiStyle.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'uiStyle*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;uiStyle&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, uiStyle.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'uiStyle*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_STYLE_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'paneltitle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__paneltitle);
	 * CPointer&lt;uiFontStyle&gt; p_paneltitle = p.cast(new Class[]{uiFontStyle.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paneltitle'</li>
	 * <li>Signature: 'uiFontStyle'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paneltitle = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'grouplabel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__grouplabel);
	 * CPointer&lt;uiFontStyle&gt; p_grouplabel = p.cast(new Class[]{uiFontStyle.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grouplabel'</li>
	 * <li>Signature: 'uiFontStyle'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grouplabel = new long[]{96, 104};

	/**
	 * Field descriptor (offset) for struct member 'widgetlabel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__widgetlabel);
	 * CPointer&lt;uiFontStyle&gt; p_widgetlabel = p.cast(new Class[]{uiFontStyle.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'widgetlabel'</li>
	 * <li>Signature: 'uiFontStyle'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__widgetlabel = new long[]{120, 128};

	/**
	 * Field descriptor (offset) for struct member 'widget'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__widget);
	 * CPointer&lt;uiFontStyle&gt; p_widget = p.cast(new Class[]{uiFontStyle.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'widget'</li>
	 * <li>Signature: 'uiFontStyle'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__widget = new long[]{144, 152};

	/**
	 * Field descriptor (offset) for struct member 'panelzoom'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__panelzoom);
	 * CPointer&lt;Float&gt; p_panelzoom = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'panelzoom'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__panelzoom = new long[]{168, 176};

	/**
	 * Field descriptor (offset) for struct member 'minlabelchars'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In characters. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__minlabelchars);
	 * CPointer&lt;Short&gt; p_minlabelchars = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minlabelchars'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minlabelchars = new long[]{172, 180};

	/**
	 * Field descriptor (offset) for struct member 'minwidgetchars'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In characters. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__minwidgetchars);
	 * CPointer&lt;Short&gt; p_minwidgetchars = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minwidgetchars'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minwidgetchars = new long[]{174, 182};

	/**
	 * Field descriptor (offset) for struct member 'columnspace'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__columnspace);
	 * CPointer&lt;Short&gt; p_columnspace = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'columnspace'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__columnspace = new long[]{176, 184};

	/**
	 * Field descriptor (offset) for struct member 'templatespace'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__templatespace);
	 * CPointer&lt;Short&gt; p_templatespace = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'templatespace'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__templatespace = new long[]{178, 186};

	/**
	 * Field descriptor (offset) for struct member 'boxspace'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__boxspace);
	 * CPointer&lt;Short&gt; p_boxspace = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'boxspace'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__boxspace = new long[]{180, 188};

	/**
	 * Field descriptor (offset) for struct member 'buttonspacex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__buttonspacex);
	 * CPointer&lt;Short&gt; p_buttonspacex = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'buttonspacex'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__buttonspacex = new long[]{182, 190};

	/**
	 * Field descriptor (offset) for struct member 'buttonspacey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__buttonspacey);
	 * CPointer&lt;Short&gt; p_buttonspacey = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'buttonspacey'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__buttonspacey = new long[]{184, 192};

	/**
	 * Field descriptor (offset) for struct member 'panelspace'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__panelspace);
	 * CPointer&lt;Short&gt; p_panelspace = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'panelspace'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__panelspace = new long[]{186, 194};

	/**
	 * Field descriptor (offset) for struct member 'panelouter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD__panelouter);
	 * CPointer&lt;Short&gt; p_panelouter = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'panelouter'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__panelouter = new long[]{188, 196};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiStyle uistyle = ...;
	 * CPointer&lt;Object&gt; p = uistyle.__dna__addressof(uiStyle.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{190, 198};

	public uiStyle(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected uiStyle(uiStyle that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<uiStyle> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{uiStyle.class};
		return new CPointer<uiStyle>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, uiStyle.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<uiStyle> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<uiStyle> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{uiStyle.class};
		return new CPointer<uiStyle>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, uiStyle.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<uiStyle> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_STYLE_NAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_STYLE_NAME. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'paneltitle'.
	 * @see #__DNA__FIELD__paneltitle
	 */
	
	public uiFontStyle getPaneltitle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiFontStyle(__io__address + 80, __io__block, __io__blockTable);
		} else {
			return new uiFontStyle(__io__address + 72, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'paneltitle'.
	 * @see #__DNA__FIELD__paneltitle
	 */
	
	public void setPaneltitle(uiFontStyle paneltitle) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(paneltitle, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, paneltitle)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, paneltitle);
		} else {
			__io__generic__copy( getPaneltitle(), paneltitle);
		}
	}

	/**
	 * Get method for struct member 'grouplabel'.
	 * @see #__DNA__FIELD__grouplabel
	 */
	
	public uiFontStyle getGrouplabel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiFontStyle(__io__address + 104, __io__block, __io__blockTable);
		} else {
			return new uiFontStyle(__io__address + 96, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'grouplabel'.
	 * @see #__DNA__FIELD__grouplabel
	 */
	
	public void setGrouplabel(uiFontStyle grouplabel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(grouplabel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, grouplabel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, grouplabel);
		} else {
			__io__generic__copy( getGrouplabel(), grouplabel);
		}
	}

	/**
	 * Get method for struct member 'widgetlabel'.
	 * @see #__DNA__FIELD__widgetlabel
	 */
	
	public uiFontStyle getWidgetlabel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiFontStyle(__io__address + 128, __io__block, __io__blockTable);
		} else {
			return new uiFontStyle(__io__address + 120, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'widgetlabel'.
	 * @see #__DNA__FIELD__widgetlabel
	 */
	
	public void setWidgetlabel(uiFontStyle widgetlabel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(widgetlabel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, widgetlabel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, widgetlabel);
		} else {
			__io__generic__copy( getWidgetlabel(), widgetlabel);
		}
	}

	/**
	 * Get method for struct member 'widget'.
	 * @see #__DNA__FIELD__widget
	 */
	
	public uiFontStyle getWidget() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiFontStyle(__io__address + 152, __io__block, __io__blockTable);
		} else {
			return new uiFontStyle(__io__address + 144, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'widget'.
	 * @see #__DNA__FIELD__widget
	 */
	
	public void setWidget(uiFontStyle widget) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 144;
		}
		if (__io__equals(widget, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, widget)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, widget);
		} else {
			__io__generic__copy( getWidget(), widget);
		}
	}

	/**
	 * Get method for struct member 'panelzoom'.
	 * @see #__DNA__FIELD__panelzoom
	 */
	
	public float getPanelzoom() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'panelzoom'.
	 * @see #__DNA__FIELD__panelzoom
	 */
	
	public void setPanelzoom(float panelzoom) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, panelzoom);
		} else {
			__io__block.writeFloat(__io__address + 168, panelzoom);
		}
	}

	/**
	 * Get method for struct member 'minlabelchars'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In characters. </p>
	 * @see #__DNA__FIELD__minlabelchars
	 */
	
	public short getMinlabelchars() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 180);
		} else {
			return __io__block.readShort(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'minlabelchars'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In characters. </p>
	 * @see #__DNA__FIELD__minlabelchars
	 */
	
	public void setMinlabelchars(short minlabelchars) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 180, minlabelchars);
		} else {
			__io__block.writeShort(__io__address + 172, minlabelchars);
		}
	}

	/**
	 * Get method for struct member 'minwidgetchars'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In characters. </p>
	 * @see #__DNA__FIELD__minwidgetchars
	 */
	
	public short getMinwidgetchars() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 182);
		} else {
			return __io__block.readShort(__io__address + 174);
		}
	}

	/**
	 * Set method for struct member 'minwidgetchars'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In characters. </p>
	 * @see #__DNA__FIELD__minwidgetchars
	 */
	
	public void setMinwidgetchars(short minwidgetchars) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 182, minwidgetchars);
		} else {
			__io__block.writeShort(__io__address + 174, minwidgetchars);
		}
	}

	/**
	 * Get method for struct member 'columnspace'.
	 * @see #__DNA__FIELD__columnspace
	 */
	
	public short getColumnspace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 184);
		} else {
			return __io__block.readShort(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'columnspace'.
	 * @see #__DNA__FIELD__columnspace
	 */
	
	public void setColumnspace(short columnspace) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 184, columnspace);
		} else {
			__io__block.writeShort(__io__address + 176, columnspace);
		}
	}

	/**
	 * Get method for struct member 'templatespace'.
	 * @see #__DNA__FIELD__templatespace
	 */
	
	public short getTemplatespace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 186);
		} else {
			return __io__block.readShort(__io__address + 178);
		}
	}

	/**
	 * Set method for struct member 'templatespace'.
	 * @see #__DNA__FIELD__templatespace
	 */
	
	public void setTemplatespace(short templatespace) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 186, templatespace);
		} else {
			__io__block.writeShort(__io__address + 178, templatespace);
		}
	}

	/**
	 * Get method for struct member 'boxspace'.
	 * @see #__DNA__FIELD__boxspace
	 */
	
	public short getBoxspace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 188);
		} else {
			return __io__block.readShort(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'boxspace'.
	 * @see #__DNA__FIELD__boxspace
	 */
	
	public void setBoxspace(short boxspace) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 188, boxspace);
		} else {
			__io__block.writeShort(__io__address + 180, boxspace);
		}
	}

	/**
	 * Get method for struct member 'buttonspacex'.
	 * @see #__DNA__FIELD__buttonspacex
	 */
	
	public short getButtonspacex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 190);
		} else {
			return __io__block.readShort(__io__address + 182);
		}
	}

	/**
	 * Set method for struct member 'buttonspacex'.
	 * @see #__DNA__FIELD__buttonspacex
	 */
	
	public void setButtonspacex(short buttonspacex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 190, buttonspacex);
		} else {
			__io__block.writeShort(__io__address + 182, buttonspacex);
		}
	}

	/**
	 * Get method for struct member 'buttonspacey'.
	 * @see #__DNA__FIELD__buttonspacey
	 */
	
	public short getButtonspacey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 192);
		} else {
			return __io__block.readShort(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'buttonspacey'.
	 * @see #__DNA__FIELD__buttonspacey
	 */
	
	public void setButtonspacey(short buttonspacey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 192, buttonspacey);
		} else {
			__io__block.writeShort(__io__address + 184, buttonspacey);
		}
	}

	/**
	 * Get method for struct member 'panelspace'.
	 * @see #__DNA__FIELD__panelspace
	 */
	
	public short getPanelspace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 194);
		} else {
			return __io__block.readShort(__io__address + 186);
		}
	}

	/**
	 * Set method for struct member 'panelspace'.
	 * @see #__DNA__FIELD__panelspace
	 */
	
	public void setPanelspace(short panelspace) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 194, panelspace);
		} else {
			__io__block.writeShort(__io__address + 186, panelspace);
		}
	}

	/**
	 * Get method for struct member 'panelouter'.
	 * @see #__DNA__FIELD__panelouter
	 */
	
	public short getPanelouter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 196);
		} else {
			return __io__block.readShort(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'panelouter'.
	 * @see #__DNA__FIELD__panelouter
	 */
	
	public void setPanelouter(short panelouter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 196, panelouter);
		} else {
			__io__block.writeShort(__io__address + 188, panelouter);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 198, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 190, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 198;
		} else {
			__dna__offset = 190;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<uiStyle> __io__addressof() {
		return new CPointer<uiStyle>(__io__address, new Class[]{uiStyle.class}, __io__block, __io__blockTable);
	}

}
