package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bUserMenuItem_Op'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=156, size64=168)
public class bUserMenuItem_Op extends CFacade {

	/**
	 * This is the sdna index of the struct bUserMenuItem_Op.
	 * <p>
	 * It is required when allocating a new block to store data for bUserMenuItem_Op.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 252;

	/**
	 * Field descriptor (offset) for struct member 'item'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUserMenuItem_Op busermenuitem_op = ...;
	 * CPointer&lt;Object&gt; p = busermenuitem_op.__dna__addressof(bUserMenuItem_Op.__DNA__FIELD__item);
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
	 * Field descriptor (offset) for struct member 'op_idname'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUserMenuItem_Op busermenuitem_op = ...;
	 * CPointer&lt;Object&gt; p = busermenuitem_op.__dna__addressof(bUserMenuItem_Op.__DNA__FIELD__op_idname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_op_idname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'op_idname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__op_idname = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'prop'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUserMenuItem_Op busermenuitem_op = ...;
	 * CPointer&lt;Object&gt; p = busermenuitem_op.__dna__addressof(bUserMenuItem_Op.__DNA__FIELD__prop);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_prop = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prop'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prop = new long[]{144, 152};

	/**
	 * Field descriptor (offset) for struct member 'opcontext'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUserMenuItem_Op busermenuitem_op = ...;
	 * CPointer&lt;Object&gt; p = busermenuitem_op.__dna__addressof(bUserMenuItem_Op.__DNA__FIELD__opcontext);
	 * CPointer&lt;Byte&gt; p_opcontext = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'opcontext'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__opcontext = new long[]{148, 160};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUserMenuItem_Op busermenuitem_op = ...;
	 * CPointer&lt;Object&gt; p = busermenuitem_op.__dna__addressof(bUserMenuItem_Op.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{149, 161};

	public bUserMenuItem_Op(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bUserMenuItem_Op(bUserMenuItem_Op that) {
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
	 * Get method for struct member 'op_idname'.
	 * @see #__DNA__FIELD__op_idname
	 */
	
	public CArrayFacade<Byte> getOp_idname() throws IOException
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
	 * Set method for struct member 'op_idname'.
	 * @see #__DNA__FIELD__op_idname
	 */
	
	public void setOp_idname(CArrayFacade<Byte> op_idname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(op_idname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, op_idname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, op_idname);
		} else {
			__io__generic__copy( getOp_idname(), op_idname);
		}
	}

	/**
	 * Get method for struct member 'prop'.
	 * @see #__DNA__FIELD__prop
	 */
	
	public CPointer<IDProperty> getProp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prop'.
	 * @see #__DNA__FIELD__prop
	 */
	
	public void setProp(CPointer<IDProperty> prop) throws IOException
	{
		long __address = ((prop == null) ? 0 : prop.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 144, __address);
		}
	}

	/**
	 * Get method for struct member 'opcontext'.
	 * @see #__DNA__FIELD__opcontext
	 */
	
	public byte getOpcontext() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 160);
		} else {
			return __io__block.readByte(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'opcontext'.
	 * @see #__DNA__FIELD__opcontext
	 */
	
	public void setOpcontext(byte opcontext) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 160, opcontext);
		} else {
			__io__block.writeByte(__io__address + 148, opcontext);
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
			return new CArrayFacade<Byte>(__io__address + 161, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 149, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 161;
		} else {
			__dna__offset = 149;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bUserMenuItem_Op> __io__addressof() {
		return new CPointer<bUserMenuItem_Op>(__io__address, new Class[]{bUserMenuItem_Op.class}, __io__block, __io__blockTable);
	}

}
