package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ScrGlobalAreaData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=12)
public class ScrGlobalAreaData extends CFacade {

	/**
	 * This is the sdna index of the struct ScrGlobalAreaData.
	 * <p>
	 * It is required when allocating a new block to store data for ScrGlobalAreaData.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 308;

	/**
	 * Field descriptor (offset) for struct member 'cur_fixed_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Global areas have a non-dynamic size. That means, changing the window size doesn't affect their size at all. However, they can still be 'collapsed', by changing this value. Ignores DPI (ED_area_global_size_y and winx/winy don't) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrGlobalAreaData scrglobalareadata = ...;
	 * CPointer&lt;Object&gt; p = scrglobalareadata.__dna__addressof(ScrGlobalAreaData.__DNA__FIELD__cur_fixed_height);
	 * CPointer&lt;Short&gt; p_cur_fixed_height = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cur_fixed_height'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cur_fixed_height = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'size_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For global areas, this is the min and max size they can use depending on if they are 'collapsed' or not. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrGlobalAreaData scrglobalareadata = ...;
	 * CPointer&lt;Object&gt; p = scrglobalareadata.__dna__addressof(ScrGlobalAreaData.__DNA__FIELD__size_min);
	 * CPointer&lt;Short&gt; p_size_min = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size_min'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size_min = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'size_max'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrGlobalAreaData scrglobalareadata = ...;
	 * CPointer&lt;Object&gt; p = scrglobalareadata.__dna__addressof(ScrGlobalAreaData.__DNA__FIELD__size_max);
	 * CPointer&lt;Short&gt; p_size_max = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size_max'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size_max = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GlobalAreaAlign. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrGlobalAreaData scrglobalareadata = ...;
	 * CPointer&lt;Object&gt; p = scrglobalareadata.__dna__addressof(ScrGlobalAreaData.__DNA__FIELD__align);
	 * CPointer&lt;Short&gt; p_align = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'align'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__align = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GlobalAreaFlag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrGlobalAreaData scrglobalareadata = ...;
	 * CPointer&lt;Object&gt; p = scrglobalareadata.__dna__addressof(ScrGlobalAreaData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrGlobalAreaData scrglobalareadata = ...;
	 * CPointer&lt;Object&gt; p = scrglobalareadata.__dna__addressof(ScrGlobalAreaData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{10, 10};

	public ScrGlobalAreaData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ScrGlobalAreaData(ScrGlobalAreaData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'cur_fixed_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Global areas have a non-dynamic size. That means, changing the window size doesn't affect their size at all. However, they can still be 'collapsed', by changing this value. Ignores DPI (ED_area_global_size_y and winx/winy don't) </p>
	 * @see #__DNA__FIELD__cur_fixed_height
	 */
	
	public short getCur_fixed_height() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'cur_fixed_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Global areas have a non-dynamic size. That means, changing the window size doesn't affect their size at all. However, they can still be 'collapsed', by changing this value. Ignores DPI (ED_area_global_size_y and winx/winy don't) </p>
	 * @see #__DNA__FIELD__cur_fixed_height
	 */
	
	public void setCur_fixed_height(short cur_fixed_height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, cur_fixed_height);
		} else {
			__io__block.writeShort(__io__address + 0, cur_fixed_height);
		}
	}

	/**
	 * Get method for struct member 'size_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For global areas, this is the min and max size they can use depending on if they are 'collapsed' or not. </p>
	 * @see #__DNA__FIELD__size_min
	 */
	
	public short getSize_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'size_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For global areas, this is the min and max size they can use depending on if they are 'collapsed' or not. </p>
	 * @see #__DNA__FIELD__size_min
	 */
	
	public void setSize_min(short size_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, size_min);
		} else {
			__io__block.writeShort(__io__address + 2, size_min);
		}
	}

	/**
	 * Get method for struct member 'size_max'.
	 * @see #__DNA__FIELD__size_max
	 */
	
	public short getSize_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'size_max'.
	 * @see #__DNA__FIELD__size_max
	 */
	
	public void setSize_max(short size_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, size_max);
		} else {
			__io__block.writeShort(__io__address + 4, size_max);
		}
	}

	/**
	 * Get method for struct member 'align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GlobalAreaAlign. </p>
	 * @see #__DNA__FIELD__align
	 */
	
	public short getAlign() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GlobalAreaAlign. </p>
	 * @see #__DNA__FIELD__align
	 */
	
	public void setAlign(short align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, align);
		} else {
			__io__block.writeShort(__io__address + 6, align);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GlobalAreaFlag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> GlobalAreaFlag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, flag);
		} else {
			__io__block.writeShort(__io__address + 8, flag);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 10, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 10, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 10;
		} else {
			__dna__offset = 10;
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
	public CPointer<ScrGlobalAreaData> __io__addressof() {
		return new CPointer<ScrGlobalAreaData>(__io__address, new Class[]{ScrGlobalAreaData.class}, __io__block, __io__blockTable);
	}

}
