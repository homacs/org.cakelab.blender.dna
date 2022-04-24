package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpreadsheetColumn'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=24, size64=40)
public class SpreadsheetColumn extends CFacade {

	/**
	 * This is the sdna index of the struct SpreadsheetColumn.
	 * <p>
	 * It is required when allocating a new block to store data for SpreadsheetColumn.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 261;

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
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Data used to identify the corresponding data from the data source<h4>Blender Source Code:</h4>
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

	/**
	 * Field descriptor (offset) for struct member 'data_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    The data type of the corresponding column visible in the spreadsheet<h4>Blender Source Code:</h4>
	 * <p> An indicator of the type of values in the column, set at runtime. #eSpreadsheetColumnValueType. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetColumn spreadsheetcolumn = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetcolumn.__dna__addressof(SpreadsheetColumn.__DNA__FIELD__data_type);
	 * CPointer&lt;Byte&gt; p_data_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_type'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_type = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetColumn spreadsheetcolumn = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetcolumn.__dna__addressof(SpreadsheetColumn.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{13, 25};

	/**
	 * Field descriptor (offset) for struct member 'display_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The final column name generated by the data source, also just cached at runtime when the data source columns are generated. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetColumn spreadsheetcolumn = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetcolumn.__dna__addressof(SpreadsheetColumn.__DNA__FIELD__display_name);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_display_name = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'display_name'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__display_name = new long[]{20, 32};

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
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Data used to identify the corresponding data from the data source<h4>Blender Source Code:</h4>
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
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Data used to identify the corresponding data from the data source<h4>Blender Source Code:</h4>
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
	 * Get method for struct member 'data_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    The data type of the corresponding column visible in the spreadsheet<h4>Blender Source Code:</h4>
	 * <p> An indicator of the type of values in the column, set at runtime. #eSpreadsheetColumnValueType. </p>
	 * @see #__DNA__FIELD__data_type
	 */
	
	public byte getData_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 24);
		} else {
			return __io__block.readByte(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'data_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    The data type of the corresponding column visible in the spreadsheet<h4>Blender Source Code:</h4>
	 * <p> An indicator of the type of values in the column, set at runtime. #eSpreadsheetColumnValueType. </p>
	 * @see #__DNA__FIELD__data_type
	 */
	
	public void setData_type(byte data_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 24, data_type);
		} else {
			__io__block.writeByte(__io__address + 12, data_type);
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
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 25, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 13, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 25;
		} else {
			__dna__offset = 13;
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
	 * Get method for struct member 'display_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The final column name generated by the data source, also just cached at runtime when the data source columns are generated. </p>
	 * @see #__DNA__FIELD__display_name
	 */
	
	public CPointer<Byte> getDisplay_name() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'display_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The final column name generated by the data source, also just cached at runtime when the data source columns are generated. </p>
	 * @see #__DNA__FIELD__display_name
	 */
	
	public void setDisplay_name(CPointer<Byte> display_name) throws IOException
	{
		long __address = ((display_name == null) ? 0 : display_name.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpreadsheetColumn> __io__addressof() {
		return new CPointer<SpreadsheetColumn>(__io__address, new Class[]{SpreadsheetColumn.class}, __io__block, __io__blockTable);
	}

}
