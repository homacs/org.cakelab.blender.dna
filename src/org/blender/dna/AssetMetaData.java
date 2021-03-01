package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'AssetMetaData'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> The meta-data of an asset. By creating and giving this for a data-block ({@link ID.asset_data} ), the data-block becomes an asset. </p><p><h2>Note</h2><p> This struct must be readable without having to read anything but blocks from the {@link ID}  it is attached to! That way, asset information of a file can be read, without reading anything more than that from the file. So pointers to other IDs or {@link ID}  data are strictly forbidden. </p> This struct must be readable without having to read anything but blocks from the ID it is attached to! That way, asset information of a file can be read, without reading anything more than that from the file. So pointers to other IDs or ID data are strictly forbidden. 
 * 
 * </p>
 */

@CMetaData(size32=24, size64=40)
public class AssetMetaData extends CFacade {

	/**
	 * This is the sdna index of the struct AssetMetaData.
	 * <p>
	 * It is required when allocating a new block to store data for AssetMetaData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 707;

	/**
	 * Field descriptor (offset) for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom asset meta-data. Cannot store pointers to IDs (#STRUCT_NO_DATABLOCK_IDPROPERTIES)! </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetMetaData assetmetadata = ...;
	 * CPointer&lt;Object&gt; p = assetmetadata.__dna__addressof(AssetMetaData.__DNA__FIELD__properties);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_properties = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'properties'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__properties = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'description'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * A description of the asset to be displayed for the user<h4>Blender Source Code:</h4>
	 * <p> Optional description of this asset for display in the UI. Dynamic length. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetMetaData assetmetadata = ...;
	 * CPointer&lt;Object&gt; p = assetmetadata.__dna__addressof(AssetMetaData.__DNA__FIELD__description);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_description = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'description'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__description = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Custom tags (name tokens) for the asset, used for filtering and general asset management<h4>Blender Source Code:</h4>
	 * <p> User defined tags for this asset. The asset manager uses these for filtering, but how they function exactly (e.g. how they are registered to provide a list of searchable available tags) is up to the asset-engine. {@link AssetTag}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetMetaData assetmetadata = ...;
	 * CPointer&lt;Object&gt; p = assetmetadata.__dna__addressof(AssetMetaData.__DNA__FIELD__tags);
	 * CPointer&lt;ListBase&gt; p_tags = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tags'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tags = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'active_tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index of the tag set for editing
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetMetaData assetmetadata = ...;
	 * CPointer&lt;Object&gt; p = assetmetadata.__dna__addressof(AssetMetaData.__DNA__FIELD__active_tag);
	 * CPointer&lt;Short&gt; p_active_tag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_tag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_tag = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'tot_tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Store the number of tags to avoid continuous counting. Could be turned into runtime data, we can always reliably reconstruct it from the list. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetMetaData assetmetadata = ...;
	 * CPointer&lt;Object&gt; p = assetmetadata.__dna__addressof(AssetMetaData.__DNA__FIELD__tot_tags);
	 * CPointer&lt;Short&gt; p_tot_tags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_tags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_tags = new long[]{18, 34};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetMetaData assetmetadata = ...;
	 * CPointer&lt;Object&gt; p = assetmetadata.__dna__addressof(AssetMetaData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{20, 36};

	public AssetMetaData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected AssetMetaData(AssetMetaData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom asset meta-data. Cannot store pointers to IDs (#STRUCT_NO_DATABLOCK_IDPROPERTIES)! </p>
	 * @see #__DNA__FIELD__properties
	 */
	
	public CPointer<IDProperty> getProperties() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom asset meta-data. Cannot store pointers to IDs (#STRUCT_NO_DATABLOCK_IDPROPERTIES)! </p>
	 * @see #__DNA__FIELD__properties
	 */
	
	public void setProperties(CPointer<IDProperty> properties) throws IOException
	{
		long __address = ((properties == null) ? 0 : properties.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'description'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * A description of the asset to be displayed for the user<h4>Blender Source Code:</h4>
	 * <p> Optional description of this asset for display in the UI. Dynamic length. </p>
	 * @see #__DNA__FIELD__description
	 */
	
	public CPointer<Byte> getDescription() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'description'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * A description of the asset to be displayed for the user<h4>Blender Source Code:</h4>
	 * <p> Optional description of this asset for display in the UI. Dynamic length. </p>
	 * @see #__DNA__FIELD__description
	 */
	
	public void setDescription(CPointer<Byte> description) throws IOException
	{
		long __address = ((description == null) ? 0 : description.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Custom tags (name tokens) for the asset, used for filtering and general asset management<h4>Blender Source Code:</h4>
	 * <p> User defined tags for this asset. The asset manager uses these for filtering, but how they function exactly (e.g. how they are registered to provide a list of searchable available tags) is up to the asset-engine. {@link AssetTag}  </p>
	 * @see #__DNA__FIELD__tags
	 */
	
	public ListBase getTags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Custom tags (name tokens) for the asset, used for filtering and general asset management<h4>Blender Source Code:</h4>
	 * <p> User defined tags for this asset. The asset manager uses these for filtering, but how they function exactly (e.g. how they are registered to provide a list of searchable available tags) is up to the asset-engine. {@link AssetTag}  </p>
	 * @see #__DNA__FIELD__tags
	 */
	
	public void setTags(ListBase tags) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(tags, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tags)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tags);
		} else {
			__io__generic__copy( getTags(), tags);
		}
	}

	/**
	 * Get method for struct member 'active_tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index of the tag set for editing
	 * @see #__DNA__FIELD__active_tag
	 */
	
	public short getActive_tag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 32);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'active_tag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index of the tag set for editing
	 * @see #__DNA__FIELD__active_tag
	 */
	
	public void setActive_tag(short active_tag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 32, active_tag);
		} else {
			__io__block.writeShort(__io__address + 16, active_tag);
		}
	}

	/**
	 * Get method for struct member 'tot_tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Store the number of tags to avoid continuous counting. Could be turned into runtime data, we can always reliably reconstruct it from the list. </p>
	 * @see #__DNA__FIELD__tot_tags
	 */
	
	public short getTot_tags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 34);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'tot_tags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Store the number of tags to avoid continuous counting. Could be turned into runtime data, we can always reliably reconstruct it from the list. </p>
	 * @see #__DNA__FIELD__tot_tags
	 */
	
	public void setTot_tags(short tot_tags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 34, tot_tags);
		} else {
			__io__block.writeShort(__io__address + 18, tot_tags);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 36;
		} else {
			__dna__offset = 20;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<AssetMetaData> __io__addressof() {
		return new CPointer<AssetMetaData>(__io__address, new Class[]{AssetMetaData.class}, __io__block, __io__blockTable);
	}

}
