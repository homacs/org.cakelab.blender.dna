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
 * Generated facet for DNA struct type 'AssetLibraryReference'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Information to identify a asset library. May be either one of the predefined types (current 'Main', builtin library, project library), or a custom type as defined in the Preferences.</p><p> If the type is set to ASSET_LIBRARY_CUSTOM<code></code>  must be set to identify the custom library. Otherwise it is not used. </p>
 */

@CMetaData(size32=8, size64=8)
public class AssetLibraryReference extends CFacade {

	/**
	 * This is the sdna index of the struct AssetLibraryReference.
	 * <p>
	 * It is required when allocating a new block to store data for AssetLibraryReference.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 804;

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eAssetLibraryType </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetLibraryReference assetlibraryreference = ...;
	 * CPointer&lt;Object&gt; p = assetlibraryreference.__dna__addressof(AssetLibraryReference.__DNA__FIELD__type);
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
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetLibraryReference assetlibraryreference = ...;
	 * CPointer&lt;Object&gt; p = assetlibraryreference.__dna__addressof(AssetLibraryReference.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'custom_library_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If showing a custom asset library (ASSET_LIBRARY_CUSTOM ), this is the index of the {@link bUserAssetLibrary}  within {@link UserDef#asset_libraries} . Should be ignored otherwise (but better set to -1 then, for sanity and debugging). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetLibraryReference assetlibraryreference = ...;
	 * CPointer&lt;Object&gt; p = assetlibraryreference.__dna__addressof(AssetLibraryReference.__DNA__FIELD__custom_library_index);
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

	public AssetLibraryReference(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected AssetLibraryReference(AssetLibraryReference that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eAssetLibraryType </p>
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
	 * <p> eAssetLibraryType </p>
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
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
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
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2;
		} else {
			__dna__offset = 2;
		}
		if (__io__equals(_pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1);
		} else {
			__io__generic__copy( get_pad1(), _pad1);
		}
	}

	/**
	 * Get method for struct member 'custom_library_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If showing a custom asset library (ASSET_LIBRARY_CUSTOM ), this is the index of the {@link bUserAssetLibrary}  within {@link UserDef#asset_libraries} . Should be ignored otherwise (but better set to -1 then, for sanity and debugging). </p>
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
	 * <p> If showing a custom asset library (ASSET_LIBRARY_CUSTOM ), this is the index of the {@link bUserAssetLibrary}  within {@link UserDef#asset_libraries} . Should be ignored otherwise (but better set to -1 then, for sanity and debugging). </p>
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
	public CPointer<AssetLibraryReference> __io__addressof() {
		return new CPointer<AssetLibraryReference>(__io__address, new Class[]{AssetLibraryReference.class}, __io__block, __io__blockTable);
	}

}
