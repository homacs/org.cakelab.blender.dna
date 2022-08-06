package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FileAssetSelectParams'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> File selection parameters for asset browsing mode, with {@link FileSelectParams}  as base. </p>
 */

@CMetaData(size32=2088, size64=2088)
public class FileAssetSelectParams extends CFacade {

	/**
	 * This is the sdna index of the struct FileAssetSelectParams.
	 * <p>
	 * It is required when allocating a new block to store data for FileAssetSelectParams.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 232;

	/**
	 * Field descriptor (offset) for struct member 'base_params'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileAssetSelectParams fileassetselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileassetselectparams.__dna__addressof(FileAssetSelectParams.__DNA__FIELD__base_params);
	 * CPointer&lt;FileSelectParams&gt; p_base_params = p.cast(new Class[]{FileSelectParams.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base_params'</li>
	 * <li>Signature: 'FileSelectParams'</li>
	 * <li>Actual Size (32bit/64bit): 2080/2080</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base_params = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'asset_library'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileAssetSelectParams fileassetselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileassetselectparams.__dna__addressof(FileAssetSelectParams.__DNA__FIELD__asset_library);
	 * CPointer&lt;FileSelectAssetLibraryUID&gt; p_asset_library = p.cast(new Class[]{FileSelectAssetLibraryUID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'asset_library'</li>
	 * <li>Signature: 'FileSelectAssetLibraryUID'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__asset_library = new long[]{2080, 2080};

	public FileAssetSelectParams(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FileAssetSelectParams(FileAssetSelectParams that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'base_params'.
	 * @see #__DNA__FIELD__base_params
	 */
	
	public FileSelectParams getBase_params() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new FileSelectParams(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new FileSelectParams(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base_params'.
	 * @see #__DNA__FIELD__base_params
	 */
	
	public void setBase_params(FileSelectParams base_params) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(base_params, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, base_params)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, base_params);
		} else {
			__io__generic__copy( getBase_params(), base_params);
		}
	}

	/**
	 * Get method for struct member 'asset_library'.
	 * @see #__DNA__FIELD__asset_library
	 */
	
	public FileSelectAssetLibraryUID getAsset_library() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new FileSelectAssetLibraryUID(__io__address + 2080, __io__block, __io__blockTable);
		} else {
			return new FileSelectAssetLibraryUID(__io__address + 2080, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'asset_library'.
	 * @see #__DNA__FIELD__asset_library
	 */
	
	public void setAsset_library(FileSelectAssetLibraryUID asset_library) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2080;
		} else {
			__dna__offset = 2080;
		}
		if (__io__equals(asset_library, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, asset_library)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, asset_library);
		} else {
			__io__generic__copy( getAsset_library(), asset_library);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FileAssetSelectParams> __io__addressof() {
		return new CPointer<FileAssetSelectParams>(__io__address, new Class[]{FileAssetSelectParams.class}, __io__block, __io__blockTable);
	}

}
