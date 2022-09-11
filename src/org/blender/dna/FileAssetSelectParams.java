package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
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

@CMetaData(size32=2120, size64=2128)
public class FileAssetSelectParams extends CFacade {

	/**
	 * This is the sdna index of the struct FileAssetSelectParams.
	 * <p>
	 * It is required when allocating a new block to store data for FileAssetSelectParams.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 683;

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
	 * <li>Actual Size (32bit/64bit): 2080/2088</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base_params = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'asset_library_ref'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileAssetSelectParams fileassetselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileassetselectparams.__dna__addressof(FileAssetSelectParams.__DNA__FIELD__asset_library_ref);
	 * CPointer&lt;AssetLibraryReference&gt; p_asset_library_ref = p.cast(new Class[]{AssetLibraryReference.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'asset_library_ref'</li>
	 * <li>Signature: 'AssetLibraryReference'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__asset_library_ref = new long[]{2080, 2088};

	/**
	 * Field descriptor (offset) for struct member 'asset_catalog_visibility'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eFileSel_Params_AssetCatalogVisibility </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileAssetSelectParams fileassetselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileassetselectparams.__dna__addressof(FileAssetSelectParams.__DNA__FIELD__asset_catalog_visibility);
	 * CPointer&lt;Short&gt; p_asset_catalog_visibility = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'asset_catalog_visibility'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__asset_catalog_visibility = new long[]{2088, 2096};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileAssetSelectParams fileassetselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileassetselectparams.__dna__addressof(FileAssetSelectParams.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{2090, 2098};

	/**
	 * Field descriptor (offset) for struct member 'catalog_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    The UUID of the catalog shown in the browser
	 * <h4>Blender Source Code</h4>
	 * <p> If {@link #getAsset_catalog_visibility()}  is #FILE_SHOW_ASSETS_FROM_CATALOG, this sets the {@link ID}  of the catalog to show. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileAssetSelectParams fileassetselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileassetselectparams.__dna__addressof(FileAssetSelectParams.__DNA__FIELD__catalog_id);
	 * CPointer&lt;bUUID&gt; p_catalog_id = p.cast(new Class[]{bUUID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'catalog_id'</li>
	 * <li>Signature: 'bUUID'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__catalog_id = new long[]{2096, 2104};

	/**
	 * Field descriptor (offset) for struct member 'import_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Determine how the asset will be imported
	 * <h4>Blender Source Code</h4>
	 * <p> eFileAssetImportType </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileAssetSelectParams fileassetselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileassetselectparams.__dna__addressof(FileAssetSelectParams.__DNA__FIELD__import_type);
	 * CPointer&lt;Short&gt; p_import_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'import_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__import_type = new long[]{2112, 2120};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileAssetSelectParams fileassetselectparams = ...;
	 * CPointer&lt;Object&gt; p = fileassetselectparams.__dna__addressof(FileAssetSelectParams.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{2114, 2122};

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
	 * Get method for struct member 'asset_library_ref'.
	 * @see #__DNA__FIELD__asset_library_ref
	 */
	
	public AssetLibraryReference getAsset_library_ref() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new AssetLibraryReference(__io__address + 2088, __io__block, __io__blockTable);
		} else {
			return new AssetLibraryReference(__io__address + 2080, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'asset_library_ref'.
	 * @see #__DNA__FIELD__asset_library_ref
	 */
	
	public void setAsset_library_ref(AssetLibraryReference asset_library_ref) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2088;
		} else {
			__dna__offset = 2080;
		}
		if (__io__equals(asset_library_ref, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, asset_library_ref)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, asset_library_ref);
		} else {
			__io__generic__copy( getAsset_library_ref(), asset_library_ref);
		}
	}

	/**
	 * Get method for struct member 'asset_catalog_visibility'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eFileSel_Params_AssetCatalogVisibility </p>
	 * @see #__DNA__FIELD__asset_catalog_visibility
	 */
	
	public short getAsset_catalog_visibility() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2096);
		} else {
			return __io__block.readShort(__io__address + 2088);
		}
	}

	/**
	 * Set method for struct member 'asset_catalog_visibility'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eFileSel_Params_AssetCatalogVisibility </p>
	 * @see #__DNA__FIELD__asset_catalog_visibility
	 */
	
	public void setAsset_catalog_visibility(short asset_catalog_visibility) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2096, asset_catalog_visibility);
		} else {
			__io__block.writeShort(__io__address + 2088, asset_catalog_visibility);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2098, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2090, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2098;
		} else {
			__dna__offset = 2090;
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
	 * Get method for struct member 'catalog_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    The UUID of the catalog shown in the browser
	 * <h4>Blender Source Code</h4>
	 * <p> If {@link #getAsset_catalog_visibility()}  is #FILE_SHOW_ASSETS_FROM_CATALOG, this sets the {@link ID}  of the catalog to show. </p>
	 * @see #__DNA__FIELD__catalog_id
	 */
	
	public bUUID getCatalog_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bUUID(__io__address + 2104, __io__block, __io__blockTable);
		} else {
			return new bUUID(__io__address + 2096, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'catalog_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    The UUID of the catalog shown in the browser
	 * <h4>Blender Source Code</h4>
	 * <p> If {@link #getAsset_catalog_visibility()}  is #FILE_SHOW_ASSETS_FROM_CATALOG, this sets the {@link ID}  of the catalog to show. </p>
	 * @see #__DNA__FIELD__catalog_id
	 */
	
	public void setCatalog_id(bUUID catalog_id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2104;
		} else {
			__dna__offset = 2096;
		}
		if (__io__equals(catalog_id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, catalog_id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, catalog_id);
		} else {
			__io__generic__copy( getCatalog_id(), catalog_id);
		}
	}

	/**
	 * Get method for struct member 'import_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Determine how the asset will be imported
	 * <h4>Blender Source Code</h4>
	 * <p> eFileAssetImportType </p>
	 * @see #__DNA__FIELD__import_type
	 */
	
	public short getImport_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2120);
		} else {
			return __io__block.readShort(__io__address + 2112);
		}
	}

	/**
	 * Set method for struct member 'import_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Determine how the asset will be imported
	 * <h4>Blender Source Code</h4>
	 * <p> eFileAssetImportType </p>
	 * @see #__DNA__FIELD__import_type
	 */
	
	public void setImport_type(short import_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2120, import_type);
		} else {
			__io__block.writeShort(__io__address + 2112, import_type);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2122, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2114, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2122;
		} else {
			__dna__offset = 2114;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FileAssetSelectParams> __io__addressof() {
		return new CPointer<FileAssetSelectParams>(__io__address, new Class[]{FileAssetSelectParams.class}, __io__block, __io__blockTable);
	}

}
