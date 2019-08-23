package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'IDOverrideLibraryPropertyOperation'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> add any future new id property types here. Static {@link ID}  override structs. </p>
 */

@CMetaData(size32=32, size64=48)
public class IDOverrideLibraryPropertyOperation extends CFacade {

	/**
	 * This is the sdna index of the struct IDOverrideLibraryPropertyOperation.
	 * <p>
	 * It is required when allocating a new block to store data for IDOverrideLibraryPropertyOperation.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 12;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibraryPropertyOperation idoverridelibrarypropertyoperation = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibrarypropertyoperation.__dna__addressof(IDOverrideLibraryPropertyOperation.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;IDOverrideLibraryPropertyOperation&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, IDOverrideLibraryPropertyOperation.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'IDOverrideLibraryPropertyOperation*'</li>
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
	 * IDOverrideLibraryPropertyOperation idoverridelibrarypropertyoperation = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibrarypropertyoperation.__dna__addressof(IDOverrideLibraryPropertyOperation.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;IDOverrideLibraryPropertyOperation&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, IDOverrideLibraryPropertyOperation.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'IDOverrideLibraryPropertyOperation*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'operation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    What override operation is performed<h4>Blender Source Code:</h4>
	 * <p> Type of override. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibraryPropertyOperation idoverridelibrarypropertyoperation = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibrarypropertyoperation.__dna__addressof(IDOverrideLibraryPropertyOperation.__DNA__FIELD__operation);
	 * CPointer&lt;Short&gt; p_operation = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'operation'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__operation = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Optional flags (NOT USED)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibraryPropertyOperation idoverridelibrarypropertyoperation = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibrarypropertyoperation.__dna__addressof(IDOverrideLibraryPropertyOperation.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{10, 18};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibraryPropertyOperation idoverridelibrarypropertyoperation = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibrarypropertyoperation.__dna__addressof(IDOverrideLibraryPropertyOperation.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'subitem_reference_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used to handle insertions into collection<h4>Blender Source Code:</h4>
	 * <p> Sub-item references, if needed (for arrays or collections only). We need both reference and local values to allow e.g. insertion into collections (constraints, modifiers...). In collection case, if names are defined, they are used in priority. Names are pointers (instead of char[64]) to save some space, NULL when unset. Indices are -1 when unset. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibraryPropertyOperation idoverridelibrarypropertyoperation = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibrarypropertyoperation.__dna__addressof(IDOverrideLibraryPropertyOperation.__DNA__FIELD__subitem_reference_name);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_subitem_reference_name = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subitem_reference_name'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subitem_reference_name = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'subitem_local_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used to handle insertions into collection
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibraryPropertyOperation idoverridelibrarypropertyoperation = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibrarypropertyoperation.__dna__addressof(IDOverrideLibraryPropertyOperation.__DNA__FIELD__subitem_local_name);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_subitem_local_name = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subitem_local_name'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subitem_local_name = new long[]{20, 32};

	/**
	 * Field descriptor (offset) for struct member 'subitem_reference_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used to handle insertions into collection
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibraryPropertyOperation idoverridelibrarypropertyoperation = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibrarypropertyoperation.__dna__addressof(IDOverrideLibraryPropertyOperation.__DNA__FIELD__subitem_reference_index);
	 * CPointer&lt;Integer&gt; p_subitem_reference_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subitem_reference_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subitem_reference_index = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'subitem_local_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used to handle insertions into collection
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDOverrideLibraryPropertyOperation idoverridelibrarypropertyoperation = ...;
	 * CPointer&lt;Object&gt; p = idoverridelibrarypropertyoperation.__dna__addressof(IDOverrideLibraryPropertyOperation.__DNA__FIELD__subitem_local_index);
	 * CPointer&lt;Integer&gt; p_subitem_local_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subitem_local_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subitem_local_index = new long[]{28, 44};

	public IDOverrideLibraryPropertyOperation(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected IDOverrideLibraryPropertyOperation(IDOverrideLibraryPropertyOperation that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<IDOverrideLibraryPropertyOperation> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDOverrideLibraryPropertyOperation.class};
		return new CPointer<IDOverrideLibraryPropertyOperation>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDOverrideLibraryPropertyOperation.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<IDOverrideLibraryPropertyOperation> next) throws IOException
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
	
	public CPointer<IDOverrideLibraryPropertyOperation> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDOverrideLibraryPropertyOperation.class};
		return new CPointer<IDOverrideLibraryPropertyOperation>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDOverrideLibraryPropertyOperation.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<IDOverrideLibraryPropertyOperation> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'operation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    What override operation is performed<h4>Blender Source Code:</h4>
	 * <p> Type of override. </p>
	 * @see #__DNA__FIELD__operation
	 */
	
	public short getOperation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'operation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    What override operation is performed<h4>Blender Source Code:</h4>
	 * <p> Type of override. </p>
	 * @see #__DNA__FIELD__operation
	 */
	
	public void setOperation(short operation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, operation);
		} else {
			__io__block.writeShort(__io__address + 8, operation);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Optional flags (NOT USED)
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Optional flags (NOT USED)
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, flag);
		} else {
			__io__block.writeShort(__io__address + 10, flag);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 20;
		} else {
			__dna__offset = 12;
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
	 * Get method for struct member 'subitem_reference_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used to handle insertions into collection<h4>Blender Source Code:</h4>
	 * <p> Sub-item references, if needed (for arrays or collections only). We need both reference and local values to allow e.g. insertion into collections (constraints, modifiers...). In collection case, if names are defined, they are used in priority. Names are pointers (instead of char[64]) to save some space, NULL when unset. Indices are -1 when unset. </p>
	 * @see #__DNA__FIELD__subitem_reference_name
	 */
	
	public CPointer<Byte> getSubitem_reference_name() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'subitem_reference_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used to handle insertions into collection<h4>Blender Source Code:</h4>
	 * <p> Sub-item references, if needed (for arrays or collections only). We need both reference and local values to allow e.g. insertion into collections (constraints, modifiers...). In collection case, if names are defined, they are used in priority. Names are pointers (instead of char[64]) to save some space, NULL when unset. Indices are -1 when unset. </p>
	 * @see #__DNA__FIELD__subitem_reference_name
	 */
	
	public void setSubitem_reference_name(CPointer<Byte> subitem_reference_name) throws IOException
	{
		long __address = ((subitem_reference_name == null) ? 0 : subitem_reference_name.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'subitem_local_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used to handle insertions into collection
	 * @see #__DNA__FIELD__subitem_local_name
	 */
	
	public CPointer<Byte> getSubitem_local_name() throws IOException
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
	 * Set method for struct member 'subitem_local_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used to handle insertions into collection
	 * @see #__DNA__FIELD__subitem_local_name
	 */
	
	public void setSubitem_local_name(CPointer<Byte> subitem_local_name) throws IOException
	{
		long __address = ((subitem_local_name == null) ? 0 : subitem_local_name.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'subitem_reference_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used to handle insertions into collection
	 * @see #__DNA__FIELD__subitem_reference_index
	 */
	
	public int getSubitem_reference_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'subitem_reference_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used to handle insertions into collection
	 * @see #__DNA__FIELD__subitem_reference_index
	 */
	
	public void setSubitem_reference_index(int subitem_reference_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, subitem_reference_index);
		} else {
			__io__block.writeInt(__io__address + 24, subitem_reference_index);
		}
	}

	/**
	 * Get method for struct member 'subitem_local_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used to handle insertions into collection
	 * @see #__DNA__FIELD__subitem_local_index
	 */
	
	public int getSubitem_local_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'subitem_local_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used to handle insertions into collection
	 * @see #__DNA__FIELD__subitem_local_index
	 */
	
	public void setSubitem_local_index(int subitem_local_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, subitem_local_index);
		} else {
			__io__block.writeInt(__io__address + 28, subitem_local_index);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<IDOverrideLibraryPropertyOperation> __io__addressof() {
		return new CPointer<IDOverrideLibraryPropertyOperation>(__io__address, new Class[]{IDOverrideLibraryPropertyOperation.class}, __io__block, __io__blockTable);
	}

}
