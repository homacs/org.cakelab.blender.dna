package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'wmKeyMapDiffItem'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> used instead of {@link wmKeyMapItem}  for diff keymaps </p>
 */

@CMetaData(size32=16, size64=32)
public class wmKeyMapDiffItem extends CFacade {

	/**
	 * This is the sdna index of the struct wmKeyMapDiffItem.
	 * <p>
	 * It is required when allocating a new block to store data for wmKeyMapDiffItem.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 498;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapDiffItem wmkeymapdiffitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapdiffitem.__dna__addressof(wmKeyMapDiffItem.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;wmKeyMapDiffItem&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, wmKeyMapDiffItem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'wmKeyMapDiffItem*'</li>
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
	 * wmKeyMapDiffItem wmkeymapdiffitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapdiffitem.__dna__addressof(wmKeyMapDiffItem.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;wmKeyMapDiffItem&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, wmKeyMapDiffItem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'wmKeyMapDiffItem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'remove_item'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapDiffItem wmkeymapdiffitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapdiffitem.__dna__addressof(wmKeyMapDiffItem.__DNA__FIELD__remove_item);
	 * CPointer&lt;CPointer&lt;wmKeyMapItem&gt;&gt; p_remove_item = p.cast(new Class[]{CPointer.class, wmKeyMapItem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'remove_item'</li>
	 * <li>Signature: 'wmKeyMapItem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__remove_item = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'add_item'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapDiffItem wmkeymapdiffitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapdiffitem.__dna__addressof(wmKeyMapDiffItem.__DNA__FIELD__add_item);
	 * CPointer&lt;CPointer&lt;wmKeyMapItem&gt;&gt; p_add_item = p.cast(new Class[]{CPointer.class, wmKeyMapItem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'add_item'</li>
	 * <li>Signature: 'wmKeyMapItem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__add_item = new long[]{12, 24};

	public wmKeyMapDiffItem(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected wmKeyMapDiffItem(wmKeyMapDiffItem that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<wmKeyMapDiffItem> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmKeyMapDiffItem.class};
		return new CPointer<wmKeyMapDiffItem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmKeyMapDiffItem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<wmKeyMapDiffItem> next) throws IOException
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
	
	public CPointer<wmKeyMapDiffItem> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmKeyMapDiffItem.class};
		return new CPointer<wmKeyMapDiffItem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmKeyMapDiffItem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<wmKeyMapDiffItem> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'remove_item'.
	 * @see #__DNA__FIELD__remove_item
	 */
	
	public CPointer<wmKeyMapItem> getRemove_item() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmKeyMapItem.class};
		return new CPointer<wmKeyMapItem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmKeyMapItem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'remove_item'.
	 * @see #__DNA__FIELD__remove_item
	 */
	
	public void setRemove_item(CPointer<wmKeyMapItem> remove_item) throws IOException
	{
		long __address = ((remove_item == null) ? 0 : remove_item.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'add_item'.
	 * @see #__DNA__FIELD__add_item
	 */
	
	public CPointer<wmKeyMapItem> getAdd_item() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmKeyMapItem.class};
		return new CPointer<wmKeyMapItem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmKeyMapItem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'add_item'.
	 * @see #__DNA__FIELD__add_item
	 */
	
	public void setAdd_item(CPointer<wmKeyMapItem> add_item) throws IOException
	{
		long __address = ((add_item == null) ? 0 : add_item.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<wmKeyMapDiffItem> __io__addressof() {
		return new CPointer<wmKeyMapDiffItem>(__io__address, new Class[]{wmKeyMapDiffItem.class}, __io__block, __io__blockTable);
	}

}
