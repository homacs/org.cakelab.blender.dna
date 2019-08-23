package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'wmKeyMapItem'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Partial copy of the event, for matching by event handler. </p>
 */

@CMetaData(size32=168, size64=184)
public class wmKeyMapItem extends CFacade {

	/**
	 * This is the sdna index of the struct wmKeyMapItem.
	 * <p>
	 * It is required when allocating a new block to store data for wmKeyMapItem.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 507;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;wmKeyMapItem&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, wmKeyMapItem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'wmKeyMapItem*'</li>
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
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;wmKeyMapItem&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, wmKeyMapItem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'wmKeyMapItem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> operator Used to retrieve operator type pointer. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__idname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_idname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'idname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__idname = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Operator properties, assigned to ptr->data and can be written to a file. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__properties);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_properties = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'properties'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__properties = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'propvalue_str'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> modal Runtime temporary storage for loading. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__propvalue_str);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_propvalue_str = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'propvalue_str'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__propvalue_str = new long[]{76, 88};

	/**
	 * Field descriptor (offset) for struct member 'propvalue'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If used, the item is from modal map. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__propvalue);
	 * CPointer&lt;Short&gt; p_propvalue = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'propvalue'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__propvalue = new long[]{140, 152};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> event Event code itself. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{142, 154};

	/**
	 * Field descriptor (offset) for struct member 'val'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> KM_ANY, KM_PRESS, KM_NOTHING etc. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__val);
	 * CPointer&lt;Short&gt; p_val = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'val'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__val = new long[]{144, 156};

	/**
	 * Field descriptor (offset) for struct member 'shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Oskey is apple or windowskey, value denotes order of pressed. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__shift);
	 * CPointer&lt;Short&gt; p_shift = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shift'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shift = new long[]{146, 158};

	/**
	 * Field descriptor (offset) for struct member 'ctrl'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__ctrl);
	 * CPointer&lt;Short&gt; p_ctrl = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ctrl'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ctrl = new long[]{148, 160};

	/**
	 * Field descriptor (offset) for struct member 'alt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__alt);
	 * CPointer&lt;Short&gt; p_alt = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alt'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alt = new long[]{150, 162};

	/**
	 * Field descriptor (offset) for struct member 'oskey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__oskey);
	 * CPointer&lt;Short&gt; p_oskey = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'oskey'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__oskey = new long[]{152, 164};

	/**
	 * Field descriptor (offset) for struct member 'keymodifier'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rawkey modifier. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__keymodifier);
	 * CPointer&lt;Short&gt; p_keymodifier = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keymodifier'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keymodifier = new long[]{154, 166};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flag: inactive, expanded </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{156, 168};

	/**
	 * Field descriptor (offset) for struct member 'maptype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime Keymap editor. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__maptype);
	 * CPointer&lt;Short&gt; p_maptype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maptype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maptype = new long[]{158, 170};

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unique identifier. Positive for kmi that override builtins, negative otherwise. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__id);
	 * CPointer&lt;Short&gt; p_id = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{160, 172};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{162, 174};

	/**
	 * Field descriptor (offset) for struct member 'ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rna pointer to access properties. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMapItem wmkeymapitem = ...;
	 * CPointer&lt;Object&gt; p = wmkeymapitem.__dna__addressof(wmKeyMapItem.__DNA__FIELD__ptr);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_ptr = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ptr'</li>
	 * <li>Signature: 'PointerRNA*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ptr = new long[]{164, 176};

	public wmKeyMapItem(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected wmKeyMapItem(wmKeyMapItem that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<wmKeyMapItem> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmKeyMapItem.class};
		return new CPointer<wmKeyMapItem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmKeyMapItem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<wmKeyMapItem> next) throws IOException
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
	
	public CPointer<wmKeyMapItem> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmKeyMapItem.class};
		return new CPointer<wmKeyMapItem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmKeyMapItem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<wmKeyMapItem> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> operator Used to retrieve operator type pointer. </p>
	 * @see #__DNA__FIELD__idname
	 */
	
	public CArrayFacade<Byte> getIdname() throws IOException
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
	 * Set method for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> operator Used to retrieve operator type pointer. </p>
	 * @see #__DNA__FIELD__idname
	 */
	
	public void setIdname(CArrayFacade<Byte> idname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(idname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, idname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, idname);
		} else {
			__io__generic__copy( getIdname(), idname);
		}
	}

	/**
	 * Get method for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Operator properties, assigned to ptr->data and can be written to a file. </p>
	 * @see #__DNA__FIELD__properties
	 */
	
	public CPointer<IDProperty> getProperties() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Operator properties, assigned to ptr->data and can be written to a file. </p>
	 * @see #__DNA__FIELD__properties
	 */
	
	public void setProperties(CPointer<IDProperty> properties) throws IOException
	{
		long __address = ((properties == null) ? 0 : properties.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 72, __address);
		}
	}

	/**
	 * Get method for struct member 'propvalue_str'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> modal Runtime temporary storage for loading. </p>
	 * @see #__DNA__FIELD__propvalue_str
	 */
	
	public CArrayFacade<Byte> getPropvalue_str() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'propvalue_str'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> modal Runtime temporary storage for loading. </p>
	 * @see #__DNA__FIELD__propvalue_str
	 */
	
	public void setPropvalue_str(CArrayFacade<Byte> propvalue_str) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 76;
		}
		if (__io__equals(propvalue_str, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, propvalue_str)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, propvalue_str);
		} else {
			__io__generic__copy( getPropvalue_str(), propvalue_str);
		}
	}

	/**
	 * Get method for struct member 'propvalue'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If used, the item is from modal map. </p>
	 * @see #__DNA__FIELD__propvalue
	 */
	
	public short getPropvalue() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 152);
		} else {
			return __io__block.readShort(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'propvalue'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If used, the item is from modal map. </p>
	 * @see #__DNA__FIELD__propvalue
	 */
	
	public void setPropvalue(short propvalue) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 152, propvalue);
		} else {
			__io__block.writeShort(__io__address + 140, propvalue);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> event Event code itself. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 154);
		} else {
			return __io__block.readShort(__io__address + 142);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> event Event code itself. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 154, type);
		} else {
			__io__block.writeShort(__io__address + 142, type);
		}
	}

	/**
	 * Get method for struct member 'val'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> KM_ANY, KM_PRESS, KM_NOTHING etc. </p>
	 * @see #__DNA__FIELD__val
	 */
	
	public short getVal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 156);
		} else {
			return __io__block.readShort(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'val'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> KM_ANY, KM_PRESS, KM_NOTHING etc. </p>
	 * @see #__DNA__FIELD__val
	 */
	
	public void setVal(short val) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 156, val);
		} else {
			__io__block.writeShort(__io__address + 144, val);
		}
	}

	/**
	 * Get method for struct member 'shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Oskey is apple or windowskey, value denotes order of pressed. </p>
	 * @see #__DNA__FIELD__shift
	 */
	
	public short getShift() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 158);
		} else {
			return __io__block.readShort(__io__address + 146);
		}
	}

	/**
	 * Set method for struct member 'shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Oskey is apple or windowskey, value denotes order of pressed. </p>
	 * @see #__DNA__FIELD__shift
	 */
	
	public void setShift(short shift) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 158, shift);
		} else {
			__io__block.writeShort(__io__address + 146, shift);
		}
	}

	/**
	 * Get method for struct member 'ctrl'.
	 * @see #__DNA__FIELD__ctrl
	 */
	
	public short getCtrl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 160);
		} else {
			return __io__block.readShort(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'ctrl'.
	 * @see #__DNA__FIELD__ctrl
	 */
	
	public void setCtrl(short ctrl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 160, ctrl);
		} else {
			__io__block.writeShort(__io__address + 148, ctrl);
		}
	}

	/**
	 * Get method for struct member 'alt'.
	 * @see #__DNA__FIELD__alt
	 */
	
	public short getAlt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 162);
		} else {
			return __io__block.readShort(__io__address + 150);
		}
	}

	/**
	 * Set method for struct member 'alt'.
	 * @see #__DNA__FIELD__alt
	 */
	
	public void setAlt(short alt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 162, alt);
		} else {
			__io__block.writeShort(__io__address + 150, alt);
		}
	}

	/**
	 * Get method for struct member 'oskey'.
	 * @see #__DNA__FIELD__oskey
	 */
	
	public short getOskey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 164);
		} else {
			return __io__block.readShort(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'oskey'.
	 * @see #__DNA__FIELD__oskey
	 */
	
	public void setOskey(short oskey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 164, oskey);
		} else {
			__io__block.writeShort(__io__address + 152, oskey);
		}
	}

	/**
	 * Get method for struct member 'keymodifier'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rawkey modifier. </p>
	 * @see #__DNA__FIELD__keymodifier
	 */
	
	public short getKeymodifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 166);
		} else {
			return __io__block.readShort(__io__address + 154);
		}
	}

	/**
	 * Set method for struct member 'keymodifier'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rawkey modifier. </p>
	 * @see #__DNA__FIELD__keymodifier
	 */
	
	public void setKeymodifier(short keymodifier) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 166, keymodifier);
		} else {
			__io__block.writeShort(__io__address + 154, keymodifier);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flag: inactive, expanded </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 168);
		} else {
			return __io__block.readShort(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flag: inactive, expanded </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 168, flag);
		} else {
			__io__block.writeShort(__io__address + 156, flag);
		}
	}

	/**
	 * Get method for struct member 'maptype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime Keymap editor. </p>
	 * @see #__DNA__FIELD__maptype
	 */
	
	public short getMaptype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 170);
		} else {
			return __io__block.readShort(__io__address + 158);
		}
	}

	/**
	 * Set method for struct member 'maptype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime Keymap editor. </p>
	 * @see #__DNA__FIELD__maptype
	 */
	
	public void setMaptype(short maptype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 170, maptype);
		} else {
			__io__block.writeShort(__io__address + 158, maptype);
		}
	}

	/**
	 * Get method for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unique identifier. Positive for kmi that override builtins, negative otherwise. </p>
	 * @see #__DNA__FIELD__id
	 */
	
	public short getId() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 172);
		} else {
			return __io__block.readShort(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unique identifier. Positive for kmi that override builtins, negative otherwise. </p>
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(short id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 172, id);
		} else {
			__io__block.writeShort(__io__address + 160, id);
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
			return new CArrayFacade<Byte>(__io__address + 174, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 162, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 174;
		} else {
			__dna__offset = 162;
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
	 * Get method for struct member 'ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rna pointer to access properties. </p>
	 * @see #__DNA__FIELD__ptr
	 */
	
	public CPointer<Object> getPtr() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 164);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rna pointer to access properties. </p>
	 * @see #__DNA__FIELD__ptr
	 */
	
	public void setPtr(CPointer<Object> ptr) throws IOException
	{
		long __address = ((ptr == null) ? 0 : ptr.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 164, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<wmKeyMapItem> __io__addressof() {
		return new CPointer<wmKeyMapItem>(__io__address, new Class[]{wmKeyMapItem.class}, __io__block, __io__blockTable);
	}

}
