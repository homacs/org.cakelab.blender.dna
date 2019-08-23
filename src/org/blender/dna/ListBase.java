package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ListBase'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
 * This is the entry point to work with linked lists. It is for 
 * 			example used in libraries {@link Library}, to provide a reference 
 * 			to the first and the last element of a linked list of library objects.<h4>Blender Source Code:</h4>
 * <p> never change the size of this! genfile.c detects pointerlen with it </p>
 */

@CMetaData(size32=8, size64=16)
public class ListBase extends CFacade {

	/**
	 * This is the sdna index of the struct ListBase.
	 * <p>
	 * It is required when allocating a new block to store data for ListBase.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 2;

	/**
	 * Field descriptor (offset) for struct member 'first'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * first element in the list
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ListBase listbase = ...;
	 * CPointer&lt;Object&gt; p = listbase.__dna__addressof(ListBase.__DNA__FIELD__first);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_first = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'first'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__first = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'last'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * last element in the list
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ListBase listbase = ...;
	 * CPointer&lt;Object&gt; p = listbase.__dna__addressof(ListBase.__DNA__FIELD__last);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_last = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last = new long[]{4, 8};

	public ListBase(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ListBase(ListBase that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'first'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * first element in the list
	 * @see #__DNA__FIELD__first
	 */
	
	public CPointer<Object> getFirst() throws IOException
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
	 * Set method for struct member 'first'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * first element in the list
	 * @see #__DNA__FIELD__first
	 */
	
	public void setFirst(CPointer<Object> first) throws IOException
	{
		long __address = ((first == null) ? 0 : first.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'last'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * last element in the list
	 * @see #__DNA__FIELD__last
	 */
	
	public CPointer<Object> getLast() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'last'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * last element in the list
	 * @see #__DNA__FIELD__last
	 */
	
	public void setLast(CPointer<Object> last) throws IOException
	{
		long __address = ((last == null) ? 0 : last.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ListBase> __io__addressof() {
		return new CPointer<ListBase>(__io__address, new Class[]{ListBase.class}, __io__block, __io__blockTable);
	}

}
