package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'AssetUUID'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Used to communicate with asset engines outside of 'import' context. </p>
 */

@CMetaData(size32=48, size64=48)
public class AssetUUID extends CFacade {

	/**
	 * This is the sdna index of the struct AssetUUID.
	 * <p>
	 * It is required when allocating a new block to store data for AssetUUID.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 222;

	/**
	 * Field descriptor (offset) for struct member 'uuid_asset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetUUID assetuuid = ...;
	 * CPointer&lt;Object&gt; p = assetuuid.__dna__addressof(AssetUUID.__DNA__FIELD__uuid_asset);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_uuid_asset = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uuid_asset'</li>
	 * <li>Signature: 'int[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uuid_asset = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'uuid_variant'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetUUID assetuuid = ...;
	 * CPointer&lt;Object&gt; p = assetuuid.__dna__addressof(AssetUUID.__DNA__FIELD__uuid_variant);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_uuid_variant = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uuid_variant'</li>
	 * <li>Signature: 'int[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uuid_variant = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'uuid_revision'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetUUID assetuuid = ...;
	 * CPointer&lt;Object&gt; p = assetuuid.__dna__addressof(AssetUUID.__DNA__FIELD__uuid_revision);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_uuid_revision = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uuid_revision'</li>
	 * <li>Signature: 'int[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uuid_revision = new long[]{32, 32};

	public AssetUUID(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected AssetUUID(AssetUUID that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'uuid_asset'.
	 * @see #__DNA__FIELD__uuid_asset
	 */
	
	public CArrayFacade<Integer> getUuid_asset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uuid_asset'.
	 * @see #__DNA__FIELD__uuid_asset
	 */
	
	public void setUuid_asset(CArrayFacade<Integer> uuid_asset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(uuid_asset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uuid_asset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uuid_asset);
		} else {
			__io__generic__copy( getUuid_asset(), uuid_asset);
		}
	}

	/**
	 * Get method for struct member 'uuid_variant'.
	 * @see #__DNA__FIELD__uuid_variant
	 */
	
	public CArrayFacade<Integer> getUuid_variant() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uuid_variant'.
	 * @see #__DNA__FIELD__uuid_variant
	 */
	
	public void setUuid_variant(CArrayFacade<Integer> uuid_variant) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(uuid_variant, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uuid_variant)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uuid_variant);
		} else {
			__io__generic__copy( getUuid_variant(), uuid_variant);
		}
	}

	/**
	 * Get method for struct member 'uuid_revision'.
	 * @see #__DNA__FIELD__uuid_revision
	 */
	
	public CArrayFacade<Integer> getUuid_revision() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uuid_revision'.
	 * @see #__DNA__FIELD__uuid_revision
	 */
	
	public void setUuid_revision(CArrayFacade<Integer> uuid_revision) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(uuid_revision, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uuid_revision)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uuid_revision);
		} else {
			__io__generic__copy( getUuid_revision(), uuid_revision);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<AssetUUID> __io__addressof() {
		return new CPointer<AssetUUID>(__io__address, new Class[]{AssetUUID.class}, __io__block, __io__blockTable);
	}

}
