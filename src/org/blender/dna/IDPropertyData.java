package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'IDPropertyData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=20, size64=32)
public class IDPropertyData extends CFacade {

	/**
	 * This is the sdna index of the struct IDPropertyData.
	 * <p>
	 * It is required when allocating a new block to store data for IDPropertyData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 8;

	/**
	 * Field descriptor (offset) for struct member 'pointer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyData idpropertydata = ...;
	 * CPointer&lt;Object&gt; p = idpropertydata.__dna__addressof(IDPropertyData.__DNA__FIELD__pointer);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_pointer = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pointer'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pointer = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'group'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyData idpropertydata = ...;
	 * CPointer&lt;Object&gt; p = idpropertydata.__dna__addressof(IDPropertyData.__DNA__FIELD__group);
	 * CPointer&lt;ListBase&gt; p_group = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'group'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__group = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'val'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyData idpropertydata = ...;
	 * CPointer&lt;Object&gt; p = idpropertydata.__dna__addressof(IDPropertyData.__DNA__FIELD__val);
	 * CPointer&lt;Integer&gt; p_val = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'val'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__val = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'val2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> note, we actually fit a double into these two ints </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyData idpropertydata = ...;
	 * CPointer&lt;Object&gt; p = idpropertydata.__dna__addressof(IDPropertyData.__DNA__FIELD__val2);
	 * CPointer&lt;Integer&gt; p_val2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'val2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__val2 = new long[]{16, 28};

	public IDPropertyData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected IDPropertyData(IDPropertyData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'pointer'.
	 * @see #__DNA__FIELD__pointer
	 */
	
	public CPointer<Object> getPointer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pointer'.
	 * @see #__DNA__FIELD__pointer
	 */
	
	public void setPointer(CPointer<Object> pointer) throws IOException
	{
		long __address = ((pointer == null) ? 0 : pointer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'group'.
	 * @see #__DNA__FIELD__group
	 */
	
	public ListBase getGroup() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 4, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'group'.
	 * @see #__DNA__FIELD__group
	 */
	
	public void setGroup(ListBase group) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(group, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, group)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, group);
		} else {
			__io__generic__copy( getGroup(), group);
		}
	}

	/**
	 * Get method for struct member 'val'.
	 * @see #__DNA__FIELD__val
	 */
	
	public int getVal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'val'.
	 * @see #__DNA__FIELD__val
	 */
	
	public void setVal(int val) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, val);
		} else {
			__io__block.writeInt(__io__address + 12, val);
		}
	}

	/**
	 * Get method for struct member 'val2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> note, we actually fit a double into these two ints </p>
	 * @see #__DNA__FIELD__val2
	 */
	
	public int getVal2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'val2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> note, we actually fit a double into these two ints </p>
	 * @see #__DNA__FIELD__val2
	 */
	
	public void setVal2(int val2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, val2);
		} else {
			__io__block.writeInt(__io__address + 16, val2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<IDPropertyData> __io__addressof() {
		return new CPointer<IDPropertyData>(__io__address, new Class[]{IDPropertyData.class}, __io__block, __io__blockTable);
	}

}
