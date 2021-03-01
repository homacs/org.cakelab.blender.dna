package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpaceText_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=68, size64=72)
public class SpaceText_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct SpaceText_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for SpaceText_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 234;

	/**
	 * Field descriptor (offset) for struct member 'lheight_px'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Actual line height, scaled by dpi. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText_Runtime spacetext_runtime = ...;
	 * CPointer&lt;Object&gt; p = spacetext_runtime.__dna__addressof(SpaceText_Runtime.__DNA__FIELD__lheight_px);
	 * CPointer&lt;Integer&gt; p_lheight_px = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lheight_px'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lheight_px = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'cwidth_px'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime computed, character width. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText_Runtime spacetext_runtime = ...;
	 * CPointer&lt;Object&gt; p = spacetext_runtime.__dna__addressof(SpaceText_Runtime.__DNA__FIELD__cwidth_px);
	 * CPointer&lt;Integer&gt; p_cwidth_px = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cwidth_px'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cwidth_px = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'scroll_region_handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The handle of the scroll-bar which can be clicked and dragged. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText_Runtime spacetext_runtime = ...;
	 * CPointer&lt;Object&gt; p = spacetext_runtime.__dna__addressof(SpaceText_Runtime.__DNA__FIELD__scroll_region_handle);
	 * CPointer&lt;rcti&gt; p_scroll_region_handle = p.cast(new Class[]{rcti.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scroll_region_handle'</li>
	 * <li>Signature: 'rcti'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scroll_region_handle = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'scroll_region_select'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The region for selected text to show in the scrolling area. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText_Runtime spacetext_runtime = ...;
	 * CPointer&lt;Object&gt; p = spacetext_runtime.__dna__addressof(SpaceText_Runtime.__DNA__FIELD__scroll_region_select);
	 * CPointer&lt;rcti&gt; p_scroll_region_select = p.cast(new Class[]{rcti.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scroll_region_select'</li>
	 * <li>Signature: 'rcti'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scroll_region_select = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'line_number_display_digits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of digits to show in the line numbers column (when enabled). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText_Runtime spacetext_runtime = ...;
	 * CPointer&lt;Object&gt; p = spacetext_runtime.__dna__addressof(SpaceText_Runtime.__DNA__FIELD__line_number_display_digits);
	 * CPointer&lt;Integer&gt; p_line_number_display_digits = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'line_number_display_digits'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__line_number_display_digits = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'viewlines'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of lines this window can display (even when they aren't used). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText_Runtime spacetext_runtime = ...;
	 * CPointer&lt;Object&gt; p = spacetext_runtime.__dna__addressof(SpaceText_Runtime.__DNA__FIELD__viewlines);
	 * CPointer&lt;Integer&gt; p_viewlines = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewlines'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewlines = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'scroll_px_per_line'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Use for drawing scroll-bar & calculating scroll operator motion scaling. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText_Runtime spacetext_runtime = ...;
	 * CPointer&lt;Object&gt; p = spacetext_runtime.__dna__addressof(SpaceText_Runtime.__DNA__FIELD__scroll_px_per_line);
	 * CPointer&lt;Float&gt; p_scroll_px_per_line = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scroll_px_per_line'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scroll_px_per_line = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'scroll_ofs_px'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Run-time for scroll increments smaller than a line (smooth scroll). Values must be between zero and the line, column width: (cwidth, TXT_LINE_HEIGHT(st)). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText_Runtime spacetext_runtime = ...;
	 * CPointer&lt;Object&gt; p = spacetext_runtime.__dna__addressof(SpaceText_Runtime.__DNA__FIELD__scroll_ofs_px);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_scroll_ofs_px = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scroll_ofs_px'</li>
	 * <li>Signature: 'int[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scroll_ofs_px = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText_Runtime spacetext_runtime = ...;
	 * CPointer&lt;Object&gt; p = spacetext_runtime.__dna__addressof(SpaceText_Runtime.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'drawcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cache for faster drawing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText_Runtime spacetext_runtime = ...;
	 * CPointer&lt;Object&gt; p = spacetext_runtime.__dna__addressof(SpaceText_Runtime.__DNA__FIELD__drawcache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_drawcache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawcache'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawcache = new long[]{64, 64};

	public SpaceText_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpaceText_Runtime(SpaceText_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'lheight_px'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Actual line height, scaled by dpi. </p>
	 * @see #__DNA__FIELD__lheight_px
	 */
	
	public int getLheight_px() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'lheight_px'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Actual line height, scaled by dpi. </p>
	 * @see #__DNA__FIELD__lheight_px
	 */
	
	public void setLheight_px(int lheight_px) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, lheight_px);
		} else {
			__io__block.writeInt(__io__address + 0, lheight_px);
		}
	}

	/**
	 * Get method for struct member 'cwidth_px'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime computed, character width. </p>
	 * @see #__DNA__FIELD__cwidth_px
	 */
	
	public int getCwidth_px() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'cwidth_px'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime computed, character width. </p>
	 * @see #__DNA__FIELD__cwidth_px
	 */
	
	public void setCwidth_px(int cwidth_px) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, cwidth_px);
		} else {
			__io__block.writeInt(__io__address + 4, cwidth_px);
		}
	}

	/**
	 * Get method for struct member 'scroll_region_handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The handle of the scroll-bar which can be clicked and dragged. </p>
	 * @see #__DNA__FIELD__scroll_region_handle
	 */
	
	public rcti getScroll_region_handle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rcti(__io__address + 8, __io__block, __io__blockTable);
		} else {
			return new rcti(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scroll_region_handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The handle of the scroll-bar which can be clicked and dragged. </p>
	 * @see #__DNA__FIELD__scroll_region_handle
	 */
	
	public void setScroll_region_handle(rcti scroll_region_handle) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(scroll_region_handle, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scroll_region_handle)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scroll_region_handle);
		} else {
			__io__generic__copy( getScroll_region_handle(), scroll_region_handle);
		}
	}

	/**
	 * Get method for struct member 'scroll_region_select'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The region for selected text to show in the scrolling area. </p>
	 * @see #__DNA__FIELD__scroll_region_select
	 */
	
	public rcti getScroll_region_select() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rcti(__io__address + 24, __io__block, __io__blockTable);
		} else {
			return new rcti(__io__address + 24, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scroll_region_select'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The region for selected text to show in the scrolling area. </p>
	 * @see #__DNA__FIELD__scroll_region_select
	 */
	
	public void setScroll_region_select(rcti scroll_region_select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(scroll_region_select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scroll_region_select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scroll_region_select);
		} else {
			__io__generic__copy( getScroll_region_select(), scroll_region_select);
		}
	}

	/**
	 * Get method for struct member 'line_number_display_digits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of digits to show in the line numbers column (when enabled). </p>
	 * @see #__DNA__FIELD__line_number_display_digits
	 */
	
	public int getLine_number_display_digits() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'line_number_display_digits'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of digits to show in the line numbers column (when enabled). </p>
	 * @see #__DNA__FIELD__line_number_display_digits
	 */
	
	public void setLine_number_display_digits(int line_number_display_digits) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, line_number_display_digits);
		} else {
			__io__block.writeInt(__io__address + 40, line_number_display_digits);
		}
	}

	/**
	 * Get method for struct member 'viewlines'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of lines this window can display (even when they aren't used). </p>
	 * @see #__DNA__FIELD__viewlines
	 */
	
	public int getViewlines() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'viewlines'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of lines this window can display (even when they aren't used). </p>
	 * @see #__DNA__FIELD__viewlines
	 */
	
	public void setViewlines(int viewlines) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, viewlines);
		} else {
			__io__block.writeInt(__io__address + 44, viewlines);
		}
	}

	/**
	 * Get method for struct member 'scroll_px_per_line'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Use for drawing scroll-bar & calculating scroll operator motion scaling. </p>
	 * @see #__DNA__FIELD__scroll_px_per_line
	 */
	
	public float getScroll_px_per_line() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'scroll_px_per_line'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Use for drawing scroll-bar & calculating scroll operator motion scaling. </p>
	 * @see #__DNA__FIELD__scroll_px_per_line
	 */
	
	public void setScroll_px_per_line(float scroll_px_per_line) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, scroll_px_per_line);
		} else {
			__io__block.writeFloat(__io__address + 48, scroll_px_per_line);
		}
	}

	/**
	 * Get method for struct member 'scroll_ofs_px'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Run-time for scroll increments smaller than a line (smooth scroll). Values must be between zero and the line, column width: (cwidth, TXT_LINE_HEIGHT(st)). </p>
	 * @see #__DNA__FIELD__scroll_ofs_px
	 */
	
	public CArrayFacade<Integer> getScroll_ofs_px() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 52, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 52, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scroll_ofs_px'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Run-time for scroll increments smaller than a line (smooth scroll). Values must be between zero and the line, column width: (cwidth, TXT_LINE_HEIGHT(st)). </p>
	 * @see #__DNA__FIELD__scroll_ofs_px
	 */
	
	public void setScroll_ofs_px(CArrayFacade<Integer> scroll_ofs_px) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 52;
		} else {
			__dna__offset = 52;
		}
		if (__io__equals(scroll_ofs_px, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scroll_ofs_px)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scroll_ofs_px);
		} else {
			__io__generic__copy( getScroll_ofs_px(), scroll_ofs_px);
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
			return new CArrayFacade<Byte>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 60;
		} else {
			__dna__offset = 60;
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
	 * Get method for struct member 'drawcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cache for faster drawing. </p>
	 * @see #__DNA__FIELD__drawcache
	 */
	
	public CPointer<Object> getDrawcache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'drawcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cache for faster drawing. </p>
	 * @see #__DNA__FIELD__drawcache
	 */
	
	public void setDrawcache(CPointer<Object> drawcache) throws IOException
	{
		long __address = ((drawcache == null) ? 0 : drawcache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 64, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpaceText_Runtime> __io__addressof() {
		return new CPointer<SpaceText_Runtime>(__io__address, new Class[]{SpaceText_Runtime.class}, __io__block, __io__blockTable);
	}

}
