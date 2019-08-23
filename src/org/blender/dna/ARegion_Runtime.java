package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ARegion_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=8)
public class ARegion_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct ARegion_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for ARegion_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 270;

	/**
	 * Field descriptor (offset) for struct member 'category'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  category to use between 'layout' and 'draw'. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion_Runtime aregion_runtime = ...;
	 * CPointer&lt;Object&gt; p = aregion_runtime.__dna__addressof(ARegion_Runtime.__DNA__FIELD__category);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_category = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'category'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__category = new long[]{0, 0};

	public ARegion_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ARegion_Runtime(ARegion_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'category'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  category to use between 'layout' and 'draw'. </p>
	 * @see #__DNA__FIELD__category
	 */
	
	public CPointer<Byte> getCategory() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'category'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  category to use between 'layout' and 'draw'. </p>
	 * @see #__DNA__FIELD__category
	 */
	
	public void setCategory(CPointer<Byte> category) throws IOException
	{
		long __address = ((category == null) ? 0 : category.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ARegion_Runtime> __io__addressof() {
		return new CPointer<ARegion_Runtime>(__io__address, new Class[]{ARegion_Runtime.class}, __io__block, __io__blockTable);
	}

}
