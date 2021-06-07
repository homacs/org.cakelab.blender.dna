package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FileSelectAssetLibraryUID'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Information to identify a asset library. May be either one of the predefined types (current 'Main', builtin library, project library), or a custom type as defined in the Preferences.</p><p> If the type is set to {@link FILE_ASSET_LIBRARY_CUSTOM} , idname must have the name to identify the custom library. Otherwise idname is not used. </p>
 */

@CMetaData(size32=8, size64=8)
public class FileSelectAssetLibraryUID extends CFacade {

	/**
	 * This is the sdna index of the struct FileSelectAssetLibraryUID.
	 * <p>
	 * It is required when allocating a new block to store data for FileSelectAssetLibraryUID.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 230;

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eFileAssetLibrary_Type </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectAssetLibraryUID fileselectassetlibraryuid = ...;
	 * CPointer&lt;Object&gt; p = fileselectassetlibraryuid.__dna__addressof(FileSelectAssetLibraryUID.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectAssetLibraryUID fileselectassetlibraryuid = ...;
	 * CPointer&lt;Object&gt; p = fileselectassetlibraryuid.__dna__addressof(FileSelectAssetLibraryUID.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'custom_library_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If showing a custom asset library ({@link FILE_ASSET_LIBRARY_CUSTOM} ), this is the index of the {@link bUserAssetLibrary}  within {@link UserDef.asset_libraries} . Should be ignored otherwise (but better set to -1 then, for sanity and debugging). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileSelectAssetLibraryUID fileselectassetlibraryuid = ...;
	 * CPointer&lt;Object&gt; p = fileselectassetlibraryuid.__dna__addressof(FileSelectAssetLibraryUID.__DNA__FIELD__custom_library_index);
	 * CPointer&lt;Integer&gt; p_custom_library_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'custom_library_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__custom_library_index = new long[]{4, 4};

	public FileSelectAssetLibraryUID(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FileSelectAssetLibraryUID(FileSelectAssetLibraryUID that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eFileAssetLibrary_Type </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eFileAssetLibrary_Type </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, type);
		} else {
			__io__block.writeShort(__io__address + 0, type);
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
			return new CArrayFacade<Byte>(__io__address + 2, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 2;
		} else {
			__dna__offset = 2;
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
	 * Get method for struct member 'custom_library_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If showing a custom asset library ({@link FILE_ASSET_LIBRARY_CUSTOM} ), this is the index of the {@link bUserAssetLibrary}  within {@link UserDef.asset_libraries} . Should be ignored otherwise (but better set to -1 then, for sanity and debugging). </p>
	 * @see #__DNA__FIELD__custom_library_index
	 */
	
	public int getCustom_library_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'custom_library_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If showing a custom asset library ({@link FILE_ASSET_LIBRARY_CUSTOM} ), this is the index of the {@link bUserAssetLibrary}  within {@link UserDef.asset_libraries} . Should be ignored otherwise (but better set to -1 then, for sanity and debugging). </p>
	 * @see #__DNA__FIELD__custom_library_index
	 */
	
	public void setCustom_library_index(int custom_library_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, custom_library_index);
		} else {
			__io__block.writeInt(__io__address + 4, custom_library_index);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FileSelectAssetLibraryUID> __io__addressof() {
		return new CPointer<FileSelectAssetLibraryUID>(__io__address, new Class[]{FileSelectAssetLibraryUID.class}, __io__block, __io__blockTable);
	}

}
