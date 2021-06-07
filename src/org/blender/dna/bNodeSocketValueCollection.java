package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bNodeSocketValueCollection'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=8)
public class bNodeSocketValueCollection extends CFacade {

	/**
	 * This is the sdna index of the struct bNodeSocketValueCollection.
	 * <p>
	 * It is required when allocating a new block to store data for bNodeSocketValueCollection.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 402;

	/**
	 * Field descriptor (offset) for struct member 'value'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocketValueCollection bnodesocketvaluecollection = ...;
	 * CPointer&lt;Object&gt; p = bnodesocketvaluecollection.__dna__addressof(bNodeSocketValueCollection.__DNA__FIELD__value);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_value = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value = new long[]{0, 0};

	public bNodeSocketValueCollection(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bNodeSocketValueCollection(bNodeSocketValueCollection that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'value'.
	 * @see #__DNA__FIELD__value
	 */
	
	public CPointer<Collection> getValue() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'value'.
	 * @see #__DNA__FIELD__value
	 */
	
	public void setValue(CPointer<Collection> value) throws IOException
	{
		long __address = ((value == null) ? 0 : value.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bNodeSocketValueCollection> __io__addressof() {
		return new CPointer<bNodeSocketValueCollection>(__io__address, new Class[]{bNodeSocketValueCollection.class}, __io__block, __io__blockTable);
	}

}
