package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'uiList'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=180, size64=200)
public class uiList extends CFacade {

	/**
	 * This is the sdna index of the struct uiList.
	 * <p>
	 * It is required when allocating a new block to store data for uiList.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 260;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> some list UI data need to be saved in file </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;uiList&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, uiList.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'uiList*'</li>
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
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;uiList&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, uiList.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'uiList*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__type);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_type = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'uiListType*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'list_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> defined as UI_MAX_NAME_STR </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__list_id);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_list_id = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'list_id'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__list_id = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'layout_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How items are layedout in the list </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__layout_type);
	 * CPointer&lt;Integer&gt; p_layout_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layout_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layout_type = new long[]{76, 88};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{80, 92};

	/**
	 * Field descriptor (offset) for struct member 'list_scroll'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__list_scroll);
	 * CPointer&lt;Integer&gt; p_list_scroll = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'list_scroll'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__list_scroll = new long[]{84, 96};

	/**
	 * Field descriptor (offset) for struct member 'list_grip'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__list_grip);
	 * CPointer&lt;Integer&gt; p_list_grip = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'list_grip'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__list_grip = new long[]{88, 100};

	/**
	 * Field descriptor (offset) for struct member 'list_last_len'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__list_last_len);
	 * CPointer&lt;Integer&gt; p_list_last_len = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'list_last_len'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__list_last_len = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member 'list_last_activei'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__list_last_activei);
	 * CPointer&lt;Integer&gt; p_list_last_activei = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'list_last_activei'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__list_last_activei = new long[]{96, 108};

	/**
	 * Field descriptor (offset) for struct member 'filter_byname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Filtering data. defined as UI_MAX_NAME_STR </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__filter_byname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_filter_byname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter_byname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter_byname = new long[]{100, 112};

	/**
	 * Field descriptor (offset) for struct member 'filter_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__filter_flag);
	 * CPointer&lt;Integer&gt; p_filter_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter_flag = new long[]{164, 176};

	/**
	 * Field descriptor (offset) for struct member 'filter_sort_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__filter_sort_flag);
	 * CPointer&lt;Integer&gt; p_filter_sort_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter_sort_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter_sort_flag = new long[]{168, 180};

	/**
	 * Field descriptor (offset) for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom sub-classes properties. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__properties);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_properties = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'properties'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__properties = new long[]{172, 184};

	/**
	 * Field descriptor (offset) for struct member 'dyn_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dynamic data (runtime). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiList uilist = ...;
	 * CPointer&lt;Object&gt; p = uilist.__dna__addressof(uiList.__DNA__FIELD__dyn_data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_dyn_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dyn_data'</li>
	 * <li>Signature: 'uiListDyn*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dyn_data = new long[]{176, 192};

	public uiList(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected uiList(uiList that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> some list UI data need to be saved in file </p>
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<uiList> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{uiList.class};
		return new CPointer<uiList>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, uiList.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> some list UI data need to be saved in file </p>
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<uiList> next) throws IOException
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
	
	public CPointer<uiList> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{uiList.class};
		return new CPointer<uiList>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, uiList.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<uiList> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public CPointer<Object> getType() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(CPointer<Object> type) throws IOException
	{
		long __address = ((type == null) ? 0 : type.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'list_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> defined as UI_MAX_NAME_STR </p>
	 * @see #__DNA__FIELD__list_id
	 */
	
	public CArrayFacade<Byte> getList_id() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'list_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> defined as UI_MAX_NAME_STR </p>
	 * @see #__DNA__FIELD__list_id
	 */
	
	public void setList_id(CArrayFacade<Byte> list_id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(list_id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, list_id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, list_id);
		} else {
			__io__generic__copy( getList_id(), list_id);
		}
	}

	/**
	 * Get method for struct member 'layout_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How items are layedout in the list </p>
	 * @see #__DNA__FIELD__layout_type
	 */
	
	public int getLayout_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 88);
		} else {
			return __io__block.readInt(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'layout_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How items are layedout in the list </p>
	 * @see #__DNA__FIELD__layout_type
	 */
	
	public void setLayout_type(int layout_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 88, layout_type);
		} else {
			__io__block.writeInt(__io__address + 76, layout_type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 92);
		} else {
			return __io__block.readInt(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 92, flag);
		} else {
			__io__block.writeInt(__io__address + 80, flag);
		}
	}

	/**
	 * Get method for struct member 'list_scroll'.
	 * @see #__DNA__FIELD__list_scroll
	 */
	
	public int getList_scroll() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 96);
		} else {
			return __io__block.readInt(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'list_scroll'.
	 * @see #__DNA__FIELD__list_scroll
	 */
	
	public void setList_scroll(int list_scroll) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 96, list_scroll);
		} else {
			__io__block.writeInt(__io__address + 84, list_scroll);
		}
	}

	/**
	 * Get method for struct member 'list_grip'.
	 * @see #__DNA__FIELD__list_grip
	 */
	
	public int getList_grip() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 100);
		} else {
			return __io__block.readInt(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'list_grip'.
	 * @see #__DNA__FIELD__list_grip
	 */
	
	public void setList_grip(int list_grip) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 100, list_grip);
		} else {
			__io__block.writeInt(__io__address + 88, list_grip);
		}
	}

	/**
	 * Get method for struct member 'list_last_len'.
	 * @see #__DNA__FIELD__list_last_len
	 */
	
	public int getList_last_len() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 104);
		} else {
			return __io__block.readInt(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'list_last_len'.
	 * @see #__DNA__FIELD__list_last_len
	 */
	
	public void setList_last_len(int list_last_len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 104, list_last_len);
		} else {
			__io__block.writeInt(__io__address + 92, list_last_len);
		}
	}

	/**
	 * Get method for struct member 'list_last_activei'.
	 * @see #__DNA__FIELD__list_last_activei
	 */
	
	public int getList_last_activei() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 108);
		} else {
			return __io__block.readInt(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'list_last_activei'.
	 * @see #__DNA__FIELD__list_last_activei
	 */
	
	public void setList_last_activei(int list_last_activei) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 108, list_last_activei);
		} else {
			__io__block.writeInt(__io__address + 96, list_last_activei);
		}
	}

	/**
	 * Get method for struct member 'filter_byname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Filtering data. defined as UI_MAX_NAME_STR </p>
	 * @see #__DNA__FIELD__filter_byname
	 */
	
	public CArrayFacade<Byte> getFilter_byname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filter_byname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Filtering data. defined as UI_MAX_NAME_STR </p>
	 * @see #__DNA__FIELD__filter_byname
	 */
	
	public void setFilter_byname(CArrayFacade<Byte> filter_byname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 112;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(filter_byname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, filter_byname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, filter_byname);
		} else {
			__io__generic__copy( getFilter_byname(), filter_byname);
		}
	}

	/**
	 * Get method for struct member 'filter_flag'.
	 * @see #__DNA__FIELD__filter_flag
	 */
	
	public int getFilter_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 176);
		} else {
			return __io__block.readInt(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'filter_flag'.
	 * @see #__DNA__FIELD__filter_flag
	 */
	
	public void setFilter_flag(int filter_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 176, filter_flag);
		} else {
			__io__block.writeInt(__io__address + 164, filter_flag);
		}
	}

	/**
	 * Get method for struct member 'filter_sort_flag'.
	 * @see #__DNA__FIELD__filter_sort_flag
	 */
	
	public int getFilter_sort_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 180);
		} else {
			return __io__block.readInt(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'filter_sort_flag'.
	 * @see #__DNA__FIELD__filter_sort_flag
	 */
	
	public void setFilter_sort_flag(int filter_sort_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 180, filter_sort_flag);
		} else {
			__io__block.writeInt(__io__address + 168, filter_sort_flag);
		}
	}

	/**
	 * Get method for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom sub-classes properties. </p>
	 * @see #__DNA__FIELD__properties
	 */
	
	public CPointer<IDProperty> getProperties() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom sub-classes properties. </p>
	 * @see #__DNA__FIELD__properties
	 */
	
	public void setProperties(CPointer<IDProperty> properties) throws IOException
	{
		long __address = ((properties == null) ? 0 : properties.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 172, __address);
		}
	}

	/**
	 * Get method for struct member 'dyn_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dynamic data (runtime). </p>
	 * @see #__DNA__FIELD__dyn_data
	 */
	
	public CPointer<Object> getDyn_data() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dyn_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dynamic data (runtime). </p>
	 * @see #__DNA__FIELD__dyn_data
	 */
	
	public void setDyn_data(CPointer<Object> dyn_data) throws IOException
	{
		long __address = ((dyn_data == null) ? 0 : dyn_data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 176, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<uiList> __io__addressof() {
		return new CPointer<uiList>(__io__address, new Class[]{uiList.class}, __io__block, __io__blockTable);
	}

}
