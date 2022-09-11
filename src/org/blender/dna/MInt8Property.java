package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MInt8Property'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class MInt8Property extends CFacade {

	/**
	 * This is the sdna index of the struct MInt8Property.
	 * <p>
	 * It is required when allocating a new block to store data for MInt8Property.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 304;

	/**
	 * Field descriptor (offset) for struct member 'i'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MInt8Property mint8property = ...;
	 * CPointer&lt;Object&gt; p = mint8property.__dna__addressof(MInt8Property.__DNA__FIELD__i);
	 * CPointer&lt;Byte&gt; p_i = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'i'</li>
	 * <li>Signature: 'int8_t'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__i = new long[]{0, 0};

	public MInt8Property(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MInt8Property(MInt8Property that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'i'.
	 * @see #__DNA__FIELD__i
	 */
	
	public byte getI() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'i'.
	 * @see #__DNA__FIELD__i
	 */
	
	public void setI(byte i) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, i);
		} else {
			__io__block.writeByte(__io__address + 0, i);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MInt8Property> __io__addressof() {
		return new CPointer<MInt8Property>(__io__address, new Class[]{MInt8Property.class}, __io__block, __io__blockTable);
	}

}
