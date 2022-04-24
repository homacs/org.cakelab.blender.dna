package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpreadsheetRowFilter'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=132, size64=144)
public class SpreadsheetRowFilter extends CFacade {

	/**
	 * This is the sdna index of the struct SpreadsheetRowFilter.
	 * <p>
	 * It is required when allocating a new block to store data for SpreadsheetRowFilter.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 267;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetRowFilter spreadsheetrowfilter = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetrowfilter.__dna__addressof(SpreadsheetRowFilter.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;SpreadsheetRowFilter&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, SpreadsheetRowFilter.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'SpreadsheetRowFilter*'</li>
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
	 * SpreadsheetRowFilter spreadsheetrowfilter = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetrowfilter.__dna__addressof(SpreadsheetRowFilter.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;SpreadsheetRowFilter&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, SpreadsheetRowFilter.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'SpreadsheetRowFilter*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'column_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetRowFilter spreadsheetrowfilter = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetrowfilter.__dna__addressof(SpreadsheetRowFilter.__DNA__FIELD__column_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_column_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'column_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__column_name = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'operation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eSpreadsheetFilterOperation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetRowFilter spreadsheetrowfilter = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetrowfilter.__dna__addressof(SpreadsheetRowFilter.__DNA__FIELD__operation);
	 * CPointer&lt;Byte&gt; p_operation = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'operation'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__operation = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eSpaceSpreadsheet_RowFilterFlag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetRowFilter spreadsheetrowfilter = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetrowfilter.__dna__addressof(SpreadsheetRowFilter.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{73, 81};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetRowFilter spreadsheetrowfilter = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetrowfilter.__dna__addressof(SpreadsheetRowFilter.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{74, 82};

	/**
	 * Field descriptor (offset) for struct member 'value_int'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetRowFilter spreadsheetrowfilter = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetrowfilter.__dna__addressof(SpreadsheetRowFilter.__DNA__FIELD__value_int);
	 * CPointer&lt;Integer&gt; p_value_int = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value_int'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value_int = new long[]{76, 84};

	/**
	 * Field descriptor (offset) for struct member 'value_string'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetRowFilter spreadsheetrowfilter = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetrowfilter.__dna__addressof(SpreadsheetRowFilter.__DNA__FIELD__value_string);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_value_string = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value_string'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value_string = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'value_float'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetRowFilter spreadsheetrowfilter = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetrowfilter.__dna__addressof(SpreadsheetRowFilter.__DNA__FIELD__value_float);
	 * CPointer&lt;Float&gt; p_value_float = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value_float'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value_float = new long[]{84, 96};

	/**
	 * Field descriptor (offset) for struct member 'threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How close float values need to be to be equal
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetRowFilter spreadsheetrowfilter = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetrowfilter.__dna__addressof(SpreadsheetRowFilter.__DNA__FIELD__threshold);
	 * CPointer&lt;Float&gt; p_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__threshold = new long[]{88, 100};

	/**
	 * Field descriptor (offset) for struct member 'value_float2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetRowFilter spreadsheetrowfilter = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetrowfilter.__dna__addressof(SpreadsheetRowFilter.__DNA__FIELD__value_float2);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_value_float2 = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value_float2'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value_float2 = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member 'value_float3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetRowFilter spreadsheetrowfilter = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetrowfilter.__dna__addressof(SpreadsheetRowFilter.__DNA__FIELD__value_float3);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_value_float3 = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value_float3'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value_float3 = new long[]{100, 112};

	/**
	 * Field descriptor (offset) for struct member 'value_color'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetRowFilter spreadsheetrowfilter = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetrowfilter.__dna__addressof(SpreadsheetRowFilter.__DNA__FIELD__value_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_value_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value_color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value_color = new long[]{112, 124};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpreadsheetRowFilter spreadsheetrowfilter = ...;
	 * CPointer&lt;Object&gt; p = spreadsheetrowfilter.__dna__addressof(SpreadsheetRowFilter.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{128, 140};

	public SpreadsheetRowFilter(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpreadsheetRowFilter(SpreadsheetRowFilter that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<SpreadsheetRowFilter> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpreadsheetRowFilter.class};
		return new CPointer<SpreadsheetRowFilter>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpreadsheetRowFilter.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<SpreadsheetRowFilter> next) throws IOException
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
	
	public CPointer<SpreadsheetRowFilter> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpreadsheetRowFilter.class};
		return new CPointer<SpreadsheetRowFilter>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpreadsheetRowFilter.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<SpreadsheetRowFilter> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'column_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME. </p>
	 * @see #__DNA__FIELD__column_name
	 */
	
	public CArrayFacade<Byte> getColumn_name() throws IOException
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
	 * Set method for struct member 'column_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME. </p>
	 * @see #__DNA__FIELD__column_name
	 */
	
	public void setColumn_name(CArrayFacade<Byte> column_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(column_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, column_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, column_name);
		} else {
			__io__generic__copy( getColumn_name(), column_name);
		}
	}

	/**
	 * Get method for struct member 'operation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eSpreadsheetFilterOperation. </p>
	 * @see #__DNA__FIELD__operation
	 */
	
	public byte getOperation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 80);
		} else {
			return __io__block.readByte(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'operation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eSpreadsheetFilterOperation. </p>
	 * @see #__DNA__FIELD__operation
	 */
	
	public void setOperation(byte operation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 80, operation);
		} else {
			__io__block.writeByte(__io__address + 72, operation);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eSpaceSpreadsheet_RowFilterFlag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 81);
		} else {
			return __io__block.readByte(__io__address + 73);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eSpaceSpreadsheet_RowFilterFlag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 81, flag);
		} else {
			__io__block.writeByte(__io__address + 73, flag);
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
			return new CArrayFacade<Byte>(__io__address + 82, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 74, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 82;
		} else {
			__dna__offset = 74;
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
	 * Get method for struct member 'value_int'.
	 * @see #__DNA__FIELD__value_int
	 */
	
	public int getValue_int() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'value_int'.
	 * @see #__DNA__FIELD__value_int
	 */
	
	public void setValue_int(int value_int) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, value_int);
		} else {
			__io__block.writeInt(__io__address + 76, value_int);
		}
	}

	/**
	 * Get method for struct member 'value_string'.
	 * @see #__DNA__FIELD__value_string
	 */
	
	public CPointer<Byte> getValue_string() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'value_string'.
	 * @see #__DNA__FIELD__value_string
	 */
	
	public void setValue_string(CPointer<Byte> value_string) throws IOException
	{
		long __address = ((value_string == null) ? 0 : value_string.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 80, __address);
		}
	}

	/**
	 * Get method for struct member 'value_float'.
	 * @see #__DNA__FIELD__value_float
	 */
	
	public float getValue_float() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'value_float'.
	 * @see #__DNA__FIELD__value_float
	 */
	
	public void setValue_float(float value_float) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, value_float);
		} else {
			__io__block.writeFloat(__io__address + 84, value_float);
		}
	}

	/**
	 * Get method for struct member 'threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How close float values need to be to be equal
	 * @see #__DNA__FIELD__threshold
	 */
	
	public float getThreshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How close float values need to be to be equal
	 * @see #__DNA__FIELD__threshold
	 */
	
	public void setThreshold(float threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, threshold);
		} else {
			__io__block.writeFloat(__io__address + 88, threshold);
		}
	}

	/**
	 * Get method for struct member 'value_float2'.
	 * @see #__DNA__FIELD__value_float2
	 */
	
	public CArrayFacade<Float> getValue_float2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'value_float2'.
	 * @see #__DNA__FIELD__value_float2
	 */
	
	public void setValue_float2(CArrayFacade<Float> value_float2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(value_float2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, value_float2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, value_float2);
		} else {
			__io__generic__copy( getValue_float2(), value_float2);
		}
	}

	/**
	 * Get method for struct member 'value_float3'.
	 * @see #__DNA__FIELD__value_float3
	 */
	
	public CArrayFacade<Float> getValue_float3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'value_float3'.
	 * @see #__DNA__FIELD__value_float3
	 */
	
	public void setValue_float3(CArrayFacade<Float> value_float3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 112;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(value_float3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, value_float3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, value_float3);
		} else {
			__io__generic__copy( getValue_float3(), value_float3);
		}
	}

	/**
	 * Get method for struct member 'value_color'.
	 * @see #__DNA__FIELD__value_color
	 */
	
	public CArrayFacade<Float> getValue_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'value_color'.
	 * @see #__DNA__FIELD__value_color
	 */
	
	public void setValue_color(CArrayFacade<Float> value_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 124;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(value_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, value_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, value_color);
		} else {
			__io__generic__copy( getValue_color(), value_color);
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
			return new CArrayFacade<Byte>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 140;
		} else {
			__dna__offset = 128;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpreadsheetRowFilter> __io__addressof() {
		return new CPointer<SpreadsheetRowFilter>(__io__address, new Class[]{SpreadsheetRowFilter.class}, __io__block, __io__blockTable);
	}

}
