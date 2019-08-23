package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'AssetUUIDList'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=16)
public class AssetUUIDList extends CFacade {

	/**
	 * This is the sdna index of the struct AssetUUIDList.
	 * <p>
	 * It is required when allocating a new block to store data for AssetUUIDList.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 219;

	/**
	 * Field descriptor (offset) for struct member 'uuids'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetUUIDList assetuuidlist = ...;
	 * CPointer&lt;Object&gt; p = assetuuidlist.__dna__addressof(AssetUUIDList.__DNA__FIELD__uuids);
	 * CPointer&lt;CPointer&lt;AssetUUID&gt;&gt; p_uuids = p.cast(new Class[]{CPointer.class, AssetUUID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uuids'</li>
	 * <li>Signature: 'AssetUUID*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uuids = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'nbr_uuids'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetUUIDList assetuuidlist = ...;
	 * CPointer&lt;Object&gt; p = assetuuidlist.__dna__addressof(AssetUUIDList.__DNA__FIELD__nbr_uuids);
	 * CPointer&lt;Integer&gt; p_nbr_uuids = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nbr_uuids'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nbr_uuids = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AssetUUIDList assetuuidlist = ...;
	 * CPointer&lt;Object&gt; p = assetuuidlist.__dna__addressof(AssetUUIDList.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{8, 12};

	public AssetUUIDList(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected AssetUUIDList(AssetUUIDList that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'uuids'.
	 * @see #__DNA__FIELD__uuids
	 */
	
	public CPointer<AssetUUID> getUuids() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AssetUUID.class};
		return new CPointer<AssetUUID>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AssetUUID.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'uuids'.
	 * @see #__DNA__FIELD__uuids
	 */
	
	public void setUuids(CPointer<AssetUUID> uuids) throws IOException
	{
		long __address = ((uuids == null) ? 0 : uuids.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'nbr_uuids'.
	 * @see #__DNA__FIELD__nbr_uuids
	 */
	
	public int getNbr_uuids() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'nbr_uuids'.
	 * @see #__DNA__FIELD__nbr_uuids
	 */
	
	public void setNbr_uuids(int nbr_uuids) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, nbr_uuids);
		} else {
			__io__block.writeInt(__io__address + 4, nbr_uuids);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, pad);
		} else {
			__io__block.writeInt(__io__address + 8, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<AssetUUIDList> __io__addressof() {
		return new CPointer<AssetUUIDList>(__io__address, new Class[]{AssetUUIDList.class}, __io__block, __io__blockTable);
	}

}
