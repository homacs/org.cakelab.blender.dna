package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'TreeStore'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> used only to store data in in blend files </p>
 */

@CMetaData(size32=12, size64=16)
public class TreeStore extends CFacade {

	/**
	 * This is the sdna index of the struct TreeStore.
	 * <p>
	 * It is required when allocating a new block to store data for TreeStore.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 296;

	/**
	 * Field descriptor (offset) for struct member 'totelem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> was previously used for memory preallocation </p>
	 * @deprecated
	 *  Deprecatedwas previously used for memory preallocation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TreeStore treestore = ...;
	 * CPointer&lt;Object&gt; p = treestore.__dna__addressof(TreeStore.__DNA__FIELD__totelem);
	 * CPointer&lt;Integer&gt; p_totelem = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totelem'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totelem = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'usedelem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of elements in data array </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TreeStore treestore = ...;
	 * CPointer&lt;Object&gt; p = treestore.__dna__addressof(TreeStore.__DNA__FIELD__usedelem);
	 * CPointer&lt;Integer&gt; p_usedelem = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'usedelem'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__usedelem = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> elements to be packed from mempool in writefile.c or extracted to mempool in readfile.c </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TreeStore treestore = ...;
	 * CPointer&lt;Object&gt; p = treestore.__dna__addressof(TreeStore.__DNA__FIELD__data);
	 * CPointer&lt;CPointer&lt;TreeStoreElem&gt;&gt; p_data = p.cast(new Class[]{CPointer.class, TreeStoreElem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data'</li>
	 * <li>Signature: 'TreeStoreElem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data = new long[]{8, 8};

	public TreeStore(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected TreeStore(TreeStore that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'totelem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> was previously used for memory preallocation </p>
	 * @deprecated
	 *  Deprecatedwas previously used for memory preallocation </p>
	 * @see #__DNA__FIELD__totelem
	 */
	
	public int getTotelem() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'totelem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> was previously used for memory preallocation </p>
	 * @deprecated
	 *  Deprecatedwas previously used for memory preallocation </p>
	 * @see #__DNA__FIELD__totelem
	 */
	
	public void setTotelem(int totelem) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, totelem);
		} else {
			__io__block.writeInt(__io__address + 0, totelem);
		}
	}

	/**
	 * Get method for struct member 'usedelem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of elements in data array </p>
	 * @see #__DNA__FIELD__usedelem
	 */
	
	public int getUsedelem() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'usedelem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of elements in data array </p>
	 * @see #__DNA__FIELD__usedelem
	 */
	
	public void setUsedelem(int usedelem) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, usedelem);
		} else {
			__io__block.writeInt(__io__address + 4, usedelem);
		}
	}

	/**
	 * Get method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> elements to be packed from mempool in writefile.c or extracted to mempool in readfile.c </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public CPointer<TreeStoreElem> getData() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{TreeStoreElem.class};
		return new CPointer<TreeStoreElem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, TreeStoreElem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> elements to be packed from mempool in writefile.c or extracted to mempool in readfile.c </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public void setData(CPointer<TreeStoreElem> data) throws IOException
	{
		long __address = ((data == null) ? 0 : data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<TreeStore> __io__addressof() {
		return new CPointer<TreeStore>(__io__address, new Class[]{TreeStore.class}, __io__block, __io__blockTable);
	}

}
