package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'wmKeyMap'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> stored in WM, the actively used keymaps </p>
 */

@CMetaData(size32=172, size64=208)
public class wmKeyMap extends CFacade {

	/**
	 * This is the sdna index of the struct wmKeyMap.
	 * <p>
	 * It is required when allocating a new block to store data for wmKeyMap.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 509;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMap wmkeymap = ...;
	 * CPointer&lt;Object&gt; p = wmkeymap.__dna__addressof(wmKeyMap.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;wmKeyMap&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, wmKeyMap.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'wmKeyMap*'</li>
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
	 * wmKeyMap wmkeymap = ...;
	 * CPointer&lt;Object&gt; p = wmkeymap.__dna__addressof(wmKeyMap.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;wmKeyMap&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, wmKeyMap.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'wmKeyMap*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'items'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMap wmkeymap = ...;
	 * CPointer&lt;Object&gt; p = wmkeymap.__dna__addressof(wmKeyMap.__DNA__FIELD__items);
	 * CPointer&lt;ListBase&gt; p_items = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'items'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__items = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'diff_items'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMap wmkeymap = ...;
	 * CPointer&lt;Object&gt; p = wmkeymap.__dna__addressof(wmKeyMap.__DNA__FIELD__diff_items);
	 * CPointer&lt;ListBase&gt; p_diff_items = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'diff_items'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__diff_items = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Global editor keymaps, or for more per space/region. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMap wmkeymap = ...;
	 * CPointer&lt;Object&gt; p = wmkeymap.__dna__addressof(wmKeyMap.__DNA__FIELD__idname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_idname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'idname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__idname = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member 'spaceid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Same IDs as in {@link DNA_space_types.h} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMap wmkeymap = ...;
	 * CPointer&lt;Object&gt; p = wmkeymap.__dna__addressof(wmKeyMap.__DNA__FIELD__spaceid);
	 * CPointer&lt;Short&gt; p_spaceid = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spaceid'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spaceid = new long[]{88, 112};

	/**
	 * Field descriptor (offset) for struct member 'regionid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> See above. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMap wmkeymap = ...;
	 * CPointer&lt;Object&gt; p = wmkeymap.__dna__addressof(wmKeyMap.__DNA__FIELD__regionid);
	 * CPointer&lt;Short&gt; p_regionid = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'regionid'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__regionid = new long[]{90, 114};

	/**
	 * Field descriptor (offset) for struct member 'owner_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional, see: {@link wmOwnerID} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMap wmkeymap = ...;
	 * CPointer&lt;Object&gt; p = wmkeymap.__dna__addressof(wmKeyMap.__DNA__FIELD__owner_id);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_owner_id = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'owner_id'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__owner_id = new long[]{92, 116};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMap wmkeymap = ...;
	 * CPointer&lt;Object&gt; p = wmkeymap.__dna__addressof(wmKeyMap.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{156, 180};

	/**
	 * Field descriptor (offset) for struct member 'kmi_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last kmi id. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMap wmkeymap = ...;
	 * CPointer&lt;Object&gt; p = wmkeymap.__dna__addressof(wmKeyMap.__DNA__FIELD__kmi_id);
	 * CPointer&lt;Short&gt; p_kmi_id = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kmi_id'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kmi_id = new long[]{158, 182};

	/**
	 * Field descriptor (offset) for struct member 'modal_items'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For modal, #EnumPropertyItem for now. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmKeyMap wmkeymap = ...;
	 * CPointer&lt;Object&gt; p = wmkeymap.__dna__addressof(wmKeyMap.__DNA__FIELD__modal_items);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_modal_items = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modal_items'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modal_items = new long[]{168, 200};

	public wmKeyMap(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected wmKeyMap(wmKeyMap that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<wmKeyMap> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmKeyMap.class};
		return new CPointer<wmKeyMap>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmKeyMap.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<wmKeyMap> next) throws IOException
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
	
	public CPointer<wmKeyMap> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmKeyMap.class};
		return new CPointer<wmKeyMap>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmKeyMap.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<wmKeyMap> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'items'.
	 * @see #__DNA__FIELD__items
	 */
	
	public ListBase getItems() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'items'.
	 * @see #__DNA__FIELD__items
	 */
	
	public void setItems(ListBase items) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(items, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, items)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, items);
		} else {
			__io__generic__copy( getItems(), items);
		}
	}

	/**
	 * Get method for struct member 'diff_items'.
	 * @see #__DNA__FIELD__diff_items
	 */
	
	public ListBase getDiff_items() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 32, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'diff_items'.
	 * @see #__DNA__FIELD__diff_items
	 */
	
	public void setDiff_items(ListBase diff_items) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(diff_items, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, diff_items)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, diff_items);
		} else {
			__io__generic__copy( getDiff_items(), diff_items);
		}
	}

	/**
	 * Get method for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Global editor keymaps, or for more per space/region. </p>
	 * @see #__DNA__FIELD__idname
	 */
	
	public CArrayFacade<Byte> getIdname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'idname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Global editor keymaps, or for more per space/region. </p>
	 * @see #__DNA__FIELD__idname
	 */
	
	public void setIdname(CArrayFacade<Byte> idname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 24;
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
	 * Get method for struct member 'spaceid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Same IDs as in {@link DNA_space_types.h} . </p>
	 * @see #__DNA__FIELD__spaceid
	 */
	
	public short getSpaceid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 112);
		} else {
			return __io__block.readShort(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'spaceid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Same IDs as in {@link DNA_space_types.h} . </p>
	 * @see #__DNA__FIELD__spaceid
	 */
	
	public void setSpaceid(short spaceid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 112, spaceid);
		} else {
			__io__block.writeShort(__io__address + 88, spaceid);
		}
	}

	/**
	 * Get method for struct member 'regionid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> See above. </p>
	 * @see #__DNA__FIELD__regionid
	 */
	
	public short getRegionid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 114);
		} else {
			return __io__block.readShort(__io__address + 90);
		}
	}

	/**
	 * Set method for struct member 'regionid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> See above. </p>
	 * @see #__DNA__FIELD__regionid
	 */
	
	public void setRegionid(short regionid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 114, regionid);
		} else {
			__io__block.writeShort(__io__address + 90, regionid);
		}
	}

	/**
	 * Get method for struct member 'owner_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional, see: {@link wmOwnerID} . </p>
	 * @see #__DNA__FIELD__owner_id
	 */
	
	public CArrayFacade<Byte> getOwner_id() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'owner_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional, see: {@link wmOwnerID} . </p>
	 * @see #__DNA__FIELD__owner_id
	 */
	
	public void setOwner_id(CArrayFacade<Byte> owner_id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 116;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(owner_id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, owner_id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, owner_id);
		} else {
			__io__generic__copy( getOwner_id(), owner_id);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 180);
		} else {
			return __io__block.readShort(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 180, flag);
		} else {
			__io__block.writeShort(__io__address + 156, flag);
		}
	}

	/**
	 * Get method for struct member 'kmi_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last kmi id. </p>
	 * @see #__DNA__FIELD__kmi_id
	 */
	
	public short getKmi_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 182);
		} else {
			return __io__block.readShort(__io__address + 158);
		}
	}

	/**
	 * Set method for struct member 'kmi_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last kmi id. </p>
	 * @see #__DNA__FIELD__kmi_id
	 */
	
	public void setKmi_id(short kmi_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 182, kmi_id);
		} else {
			__io__block.writeShort(__io__address + 158, kmi_id);
		}
	}

	/**
	 * Get method for struct member 'modal_items'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For modal, #EnumPropertyItem for now. </p>
	 * @see #__DNA__FIELD__modal_items
	 */
	
	public CPointer<Object> getModal_items() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'modal_items'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For modal, #EnumPropertyItem for now. </p>
	 * @see #__DNA__FIELD__modal_items
	 */
	
	public void setModal_items(CPointer<Object> modal_items) throws IOException
	{
		long __address = ((modal_items == null) ? 0 : modal_items.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 168, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<wmKeyMap> __io__addressof() {
		return new CPointer<wmKeyMap>(__io__address, new Class[]{wmKeyMap.class}, __io__block, __io__blockTable);
	}

}
