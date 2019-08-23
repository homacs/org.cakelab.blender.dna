package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bUserMenuItem_Menu'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=144, size64=152)
public class bUserMenuItem_Menu extends CFacade {

	/**
	 * This is the sdna index of the struct bUserMenuItem_Menu.
	 * <p>
	 * It is required when allocating a new block to store data for bUserMenuItem_Menu.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 253;

	/**
	 * Field descriptor (offset) for struct member 'item'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUserMenuItem_Menu busermenuitem_menu = ...;
	 * CPointer&lt;Object&gt; p = busermenuitem_menu.__dna__addressof(bUserMenuItem_Menu.__DNA__FIELD__item);
	 * CPointer&lt;bUserMenuItem&gt; p_item = p.cast(new Class[]{bUserMenuItem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'item'</li>
	 * <li>Signature: 'bUserMenuItem'</li>
	 * <li>Actual Size (32bit/64bit): 80/88</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__item = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'mt_idname'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUserMenuItem_Menu busermenuitem_menu = ...;
	 * CPointer&lt;Object&gt; p = busermenuitem_menu.__dna__addressof(bUserMenuItem_Menu.__DNA__FIELD__mt_idname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_mt_idname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mt_idname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mt_idname = new long[]{80, 88};

	public bUserMenuItem_Menu(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bUserMenuItem_Menu(bUserMenuItem_Menu that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'item'.
	 * @see #__DNA__FIELD__item
	 */
	
	public bUserMenuItem getItem() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bUserMenuItem(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new bUserMenuItem(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'item'.
	 * @see #__DNA__FIELD__item
	 */
	
	public void setItem(bUserMenuItem item) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
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
	 * Get method for struct member 'mt_idname'.
	 * @see #__DNA__FIELD__mt_idname
	 */
	
	public CArrayFacade<Byte> getMt_idname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mt_idname'.
	 * @see #__DNA__FIELD__mt_idname
	 */
	
	public void setMt_idname(CArrayFacade<Byte> mt_idname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(mt_idname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mt_idname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mt_idname);
		} else {
			__io__generic__copy( getMt_idname(), mt_idname);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bUserMenuItem_Menu> __io__addressof() {
		return new CPointer<bUserMenuItem_Menu>(__io__address, new Class[]{bUserMenuItem_Menu.class}, __io__block, __io__blockTable);
	}

}
