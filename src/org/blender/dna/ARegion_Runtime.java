package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ARegion_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=28, size64=32)
public class ARegion_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct ARegion_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for ARegion_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 306;

	/**
	 * Field descriptor (offset) for struct member 'category'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  category to use between 'layout' and 'draw'. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion_Runtime aregion_runtime = ...;
	 * CPointer&lt;Object&gt; p = aregion_runtime.__dna__addressof(ARegion_Runtime.__DNA__FIELD__category);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_category = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'category'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__category = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'visible_rect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The visible part of the region, use with region overlap not to draw on top of the overlapping regions.</p><p> Lazy initialize, zero'd when unset, relative to {@link ARegion.winrct}  x/y min. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion_Runtime aregion_runtime = ...;
	 * CPointer&lt;Object&gt; p = aregion_runtime.__dna__addressof(ARegion_Runtime.__DNA__FIELD__visible_rect);
	 * CPointer&lt;rcti&gt; p_visible_rect = p.cast(new Class[]{rcti.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'visible_rect'</li>
	 * <li>Signature: 'rcti'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__visible_rect = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'offset_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The offset needed to not overlap with window scrollbars. Only used by HUD regions for now. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion_Runtime aregion_runtime = ...;
	 * CPointer&lt;Object&gt; p = aregion_runtime.__dna__addressof(ARegion_Runtime.__DNA__FIELD__offset_x);
	 * CPointer&lt;Integer&gt; p_offset_x = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset_x'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset_x = new long[]{20, 24};

	/**
	 * Field descriptor (offset) for struct member 'offset_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion_Runtime aregion_runtime = ...;
	 * CPointer&lt;Object&gt; p = aregion_runtime.__dna__addressof(ARegion_Runtime.__DNA__FIELD__offset_y);
	 * CPointer&lt;Integer&gt; p_offset_y = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset_y'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset_y = new long[]{24, 28};

	public ARegion_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ARegion_Runtime(ARegion_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'category'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  category to use between 'layout' and 'draw'. </p>
	 * @see #__DNA__FIELD__category
	 */
	
	public CPointer<Byte> getCategory() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'category'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  category to use between 'layout' and 'draw'. </p>
	 * @see #__DNA__FIELD__category
	 */
	
	public void setCategory(CPointer<Byte> category) throws IOException
	{
		long __address = ((category == null) ? 0 : category.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'visible_rect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The visible part of the region, use with region overlap not to draw on top of the overlapping regions.</p><p> Lazy initialize, zero'd when unset, relative to {@link ARegion.winrct}  x/y min. </p>
	 * @see #__DNA__FIELD__visible_rect
	 */
	
	public rcti getVisible_rect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rcti(__io__address + 8, __io__block, __io__blockTable);
		} else {
			return new rcti(__io__address + 4, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'visible_rect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The visible part of the region, use with region overlap not to draw on top of the overlapping regions.</p><p> Lazy initialize, zero'd when unset, relative to {@link ARegion.winrct}  x/y min. </p>
	 * @see #__DNA__FIELD__visible_rect
	 */
	
	public void setVisible_rect(rcti visible_rect) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(visible_rect, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, visible_rect)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, visible_rect);
		} else {
			__io__generic__copy( getVisible_rect(), visible_rect);
		}
	}

	/**
	 * Get method for struct member 'offset_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The offset needed to not overlap with window scrollbars. Only used by HUD regions for now. </p>
	 * @see #__DNA__FIELD__offset_x
	 */
	
	public int getOffset_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'offset_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The offset needed to not overlap with window scrollbars. Only used by HUD regions for now. </p>
	 * @see #__DNA__FIELD__offset_x
	 */
	
	public void setOffset_x(int offset_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, offset_x);
		} else {
			__io__block.writeInt(__io__address + 20, offset_x);
		}
	}

	/**
	 * Get method for struct member 'offset_y'.
	 * @see #__DNA__FIELD__offset_y
	 */
	
	public int getOffset_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'offset_y'.
	 * @see #__DNA__FIELD__offset_y
	 */
	
	public void setOffset_y(int offset_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, offset_y);
		} else {
			__io__block.writeInt(__io__address + 24, offset_y);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ARegion_Runtime> __io__addressof() {
		return new CPointer<ARegion_Runtime>(__io__address, new Class[]{ARegion_Runtime.class}, __io__block, __io__blockTable);
	}

}
