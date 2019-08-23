package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MLoopTri_Store'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><h2>Warning</h2><p> Typical access is done via #BKE_mesh_runtime_looptri_ensure, #BKE_mesh_runtime_looptri_len. </p> Typical access is done via #BKE_mesh_runtime_looptri_ensure, #BKE_mesh_runtime_looptri_len. 
 * </p>
 */

@CMetaData(size32=16, size64=24)
public class MLoopTri_Store extends CFacade {

	/**
	 * This is the sdna index of the struct MLoopTri_Store.
	 * <p>
	 * It is required when allocating a new block to store data for MLoopTri_Store.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 61;

	/**
	 * Field descriptor (offset) for struct member 'array'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> WARNING! swapping between array (ready-to-be-used data) and array_wip (where data is actually computed) shall always be protected by same lock as one used for looptris computing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MLoopTri_Store mlooptri_store = ...;
	 * CPointer&lt;Object&gt; p = mlooptri_store.__dna__addressof(MLoopTri_Store.__DNA__FIELD__array);
	 * CPointer&lt;CPointer&lt;MLoopTri&gt;&gt; p_array = p.cast(new Class[]{CPointer.class, MLoopTri.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'array'</li>
	 * <li>Signature: 'MLoopTri*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__array = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'array_wip'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MLoopTri_Store mlooptri_store = ...;
	 * CPointer&lt;Object&gt; p = mlooptri_store.__dna__addressof(MLoopTri_Store.__DNA__FIELD__array_wip);
	 * CPointer&lt;CPointer&lt;MLoopTri&gt;&gt; p_array_wip = p.cast(new Class[]{CPointer.class, MLoopTri.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'array_wip'</li>
	 * <li>Signature: 'MLoopTri*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__array_wip = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'len'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MLoopTri_Store mlooptri_store = ...;
	 * CPointer&lt;Object&gt; p = mlooptri_store.__dna__addressof(MLoopTri_Store.__DNA__FIELD__len);
	 * CPointer&lt;Integer&gt; p_len = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'len'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__len = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'len_alloc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MLoopTri_Store mlooptri_store = ...;
	 * CPointer&lt;Object&gt; p = mlooptri_store.__dna__addressof(MLoopTri_Store.__DNA__FIELD__len_alloc);
	 * CPointer&lt;Integer&gt; p_len_alloc = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'len_alloc'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__len_alloc = new long[]{12, 20};

	public MLoopTri_Store(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MLoopTri_Store(MLoopTri_Store that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'array'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> WARNING! swapping between array (ready-to-be-used data) and array_wip (where data is actually computed) shall always be protected by same lock as one used for looptris computing. </p>
	 * @see #__DNA__FIELD__array
	 */
	
	public CPointer<MLoopTri> getArray() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MLoopTri.class};
		return new CPointer<MLoopTri>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MLoopTri.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'array'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> WARNING! swapping between array (ready-to-be-used data) and array_wip (where data is actually computed) shall always be protected by same lock as one used for looptris computing. </p>
	 * @see #__DNA__FIELD__array
	 */
	
	public void setArray(CPointer<MLoopTri> array) throws IOException
	{
		long __address = ((array == null) ? 0 : array.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'array_wip'.
	 * @see #__DNA__FIELD__array_wip
	 */
	
	public CPointer<MLoopTri> getArray_wip() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MLoopTri.class};
		return new CPointer<MLoopTri>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MLoopTri.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'array_wip'.
	 * @see #__DNA__FIELD__array_wip
	 */
	
	public void setArray_wip(CPointer<MLoopTri> array_wip) throws IOException
	{
		long __address = ((array_wip == null) ? 0 : array_wip.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'len'.
	 * @see #__DNA__FIELD__len
	 */
	
	public int getLen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'len'.
	 * @see #__DNA__FIELD__len
	 */
	
	public void setLen(int len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, len);
		} else {
			__io__block.writeInt(__io__address + 8, len);
		}
	}

	/**
	 * Get method for struct member 'len_alloc'.
	 * @see #__DNA__FIELD__len_alloc
	 */
	
	public int getLen_alloc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'len_alloc'.
	 * @see #__DNA__FIELD__len_alloc
	 */
	
	public void setLen_alloc(int len_alloc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, len_alloc);
		} else {
			__io__block.writeInt(__io__address + 12, len_alloc);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MLoopTri_Store> __io__addressof() {
		return new CPointer<MLoopTri_Store>(__io__address, new Class[]{MLoopTri_Store.class}, __io__block, __io__blockTable);
	}

}
