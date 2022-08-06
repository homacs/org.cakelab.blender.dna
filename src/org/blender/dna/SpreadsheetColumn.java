package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpreadsheetColumn'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=24)
public class SpreadsheetColumn extends CFacade {

	/**
	 * This is the sdna index of the struct SpreadsheetColumn.
	 * <p>
	 * It is required when allocating a new block to store data for SpreadsheetColumn.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 250;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetColumn spreadsheetcolumn = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetcolumn.__dna__addressof(SpreadsheetColumn.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;SpreadsheetColumn&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, SpreadsheetColumn.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'SpreadsheetColumn*'</li>
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
	 * SpreadsheetColumn spreadsheetcolumn = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetcolumn.__dna__addressof(SpreadsheetColumn.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;SpreadsheetColumn&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, SpreadsheetColumn.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'SpreadsheetColumn*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Identifies the data in the column. This is a pointer instead of a struct to make it easier if we want to "subclass" {@link SpreadsheetColumnID}  in the future for different kinds of ids. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetColumn spreadsheetcolumn = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetcolumn.__dna__addressof(SpreadsheetColumn.__DNA__FIELD__id);
	 * CPointer&lt;CPointer&lt;SpreadsheetColumnID&gt;&gt; p_id = p.cast(new Class[]{CPointer.class, SpreadsheetColumnID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'SpreadsheetColumnID*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{8, 16};

	public SpreadsheetColumn(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpreadsheetColumn(SpreadsheetColumn that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<SpreadsheetColumn> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpreadsheetColumn.class};
		return new CPointer<SpreadsheetColumn>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpreadsheetColumn.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<SpreadsheetColumn> next) throws IOException
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
	
	public CPointer<SpreadsheetColumn> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpreadsheetColumn.class};
		return new CPointer<SpreadsheetColumn>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpreadsheetColumn.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<SpreadsheetColumn> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Identifies the data in the column. This is a pointer instead of a struct to make it easier if we want to "subclass" {@link SpreadsheetColumnID}  in the future for different kinds of ids. </p>
	 * @see #__DNA__FIELD__id
	 */
	
	public CPointer<SpreadsheetColumnID> getId() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpreadsheetColumnID.class};
		return new CPointer<SpreadsheetColumnID>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpreadsheetColumnID.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Identifies the data in the column. This is a pointer instead of a struct to make it easier if we want to "subclass" {@link SpreadsheetColumnID}  in the future for different kinds of ids. </p>
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(CPointer<SpreadsheetColumnID> id) throws IOException
	{
		long __address = ((id == null) ? 0 : id.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpreadsheetColumn> __io__addressof() {
		return new CPointer<SpreadsheetColumn>(__io__address, new Class[]{SpreadsheetColumn.class}, __io__block, __io__blockTable);
	}

}
