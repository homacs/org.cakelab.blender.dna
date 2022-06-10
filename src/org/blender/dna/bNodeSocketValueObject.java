package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bNodeSocketValueObject'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=8)
public class bNodeSocketValueObject extends CFacade {

	/**
	 * This is the sdna index of the struct bNodeSocketValueObject.
	 * <p>
	 * It is required when allocating a new block to store data for bNodeSocketValueObject.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 419;

	/**
	 * Field descriptor (offset) for struct member 'value'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocketValueObject bnodesocketvalueobject = ...;
	 * CPointer&lt;Object&gt; p = bnodesocketvalueobject.__dna__addressof(bNodeSocketValueObject.__DNA__FIELD__value);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_value = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value = new long[]{0, 0};

	public bNodeSocketValueObject(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bNodeSocketValueObject(bNodeSocketValueObject that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'value'.
	 * @see #__DNA__FIELD__value
	 */
	
	public CPointer<BlenderObject> getValue() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'value'.
	 * @see #__DNA__FIELD__value
	 */
	
	public void setValue(CPointer<BlenderObject> value) throws IOException
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
	public CPointer<bNodeSocketValueObject> __io__addressof() {
		return new CPointer<bNodeSocketValueObject>(__io__address, new Class[]{bNodeSocketValueObject.class}, __io__block, __io__blockTable);
	}

}
