package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bUserMenuItem_Prop'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=408, size64=416)
public class bUserMenuItem_Prop extends CFacade {

	/**
	 * This is the sdna index of the struct bUserMenuItem_Prop.
	 * <p>
	 * It is required when allocating a new block to store data for bUserMenuItem_Prop.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 254;

	/**
	 * Field descriptor (offset) for struct member 'item'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUserMenuItem_Prop busermenuitem_prop = ...;
	 * CPointer&lt;Object&gt; p = busermenuitem_prop.__dna__addressof(bUserMenuItem_Prop.__DNA__FIELD__item);
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
	 * Field descriptor (offset) for struct member 'context_data_path'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUserMenuItem_Prop busermenuitem_prop = ...;
	 * CPointer&lt;Object&gt; p = busermenuitem_prop.__dna__addressof(bUserMenuItem_Prop.__DNA__FIELD__context_data_path);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_context_data_path = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'context_data_path'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__context_data_path = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'prop_id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUserMenuItem_Prop busermenuitem_prop = ...;
	 * CPointer&lt;Object&gt; p = busermenuitem_prop.__dna__addressof(bUserMenuItem_Prop.__DNA__FIELD__prop_id);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_prop_id = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prop_id'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prop_id = new long[]{336, 344};

	/**
	 * Field descriptor (offset) for struct member 'prop_index'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUserMenuItem_Prop busermenuitem_prop = ...;
	 * CPointer&lt;Object&gt; p = busermenuitem_prop.__dna__addressof(bUserMenuItem_Prop.__DNA__FIELD__prop_index);
	 * CPointer&lt;Integer&gt; p_prop_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prop_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prop_index = new long[]{400, 408};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bUserMenuItem_Prop busermenuitem_prop = ...;
	 * CPointer&lt;Object&gt; p = busermenuitem_prop.__dna__addressof(bUserMenuItem_Prop.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{404, 412};

	public bUserMenuItem_Prop(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bUserMenuItem_Prop(bUserMenuItem_Prop that) {
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
	 * Get method for struct member 'context_data_path'.
	 * @see #__DNA__FIELD__context_data_path
	 */
	
	public CArrayFacade<Byte> getContext_data_path() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'context_data_path'.
	 * @see #__DNA__FIELD__context_data_path
	 */
	
	public void setContext_data_path(CArrayFacade<Byte> context_data_path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(context_data_path, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, context_data_path)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, context_data_path);
		} else {
			__io__generic__copy( getContext_data_path(), context_data_path);
		}
	}

	/**
	 * Get method for struct member 'prop_id'.
	 * @see #__DNA__FIELD__prop_id
	 */
	
	public CArrayFacade<Byte> getProp_id() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 344, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 336, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'prop_id'.
	 * @see #__DNA__FIELD__prop_id
	 */
	
	public void setProp_id(CArrayFacade<Byte> prop_id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 344;
		} else {
			__dna__offset = 336;
		}
		if (__io__equals(prop_id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, prop_id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, prop_id);
		} else {
			__io__generic__copy( getProp_id(), prop_id);
		}
	}

	/**
	 * Get method for struct member 'prop_index'.
	 * @see #__DNA__FIELD__prop_index
	 */
	
	public int getProp_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 408);
		} else {
			return __io__block.readInt(__io__address + 400);
		}
	}

	/**
	 * Set method for struct member 'prop_index'.
	 * @see #__DNA__FIELD__prop_index
	 */
	
	public void setProp_index(int prop_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 408, prop_index);
		} else {
			__io__block.writeInt(__io__address + 400, prop_index);
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
			return new CArrayFacade<Byte>(__io__address + 412, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 404, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 412;
		} else {
			__dna__offset = 404;
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
	public CPointer<bUserMenuItem_Prop> __io__addressof() {
		return new CPointer<bUserMenuItem_Prop>(__io__address, new Class[]{bUserMenuItem_Prop.class}, __io__block, __io__blockTable);
	}

}
