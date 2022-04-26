package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MBoolProperty'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class MBoolProperty extends CFacade {

	/**
	 * This is the sdna index of the struct MBoolProperty.
	 * <p>
	 * It is required when allocating a new block to store data for MBoolProperty.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 82;

	/**
	 * Field descriptor (offset) for struct member 'b'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MBoolProperty mboolproperty = ...;
	 * CPointer&lt;Object&gt; p = mboolproperty.__dna__addressof(MBoolProperty.__DNA__FIELD__b);
	 * CPointer&lt;Byte&gt; p_b = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'b'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__b = new long[]{0, 0};

	public MBoolProperty(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MBoolProperty(MBoolProperty that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public byte getB() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public void setB(byte b) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, b);
		} else {
			__io__block.writeByte(__io__address + 0, b);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MBoolProperty> __io__addressof() {
		return new CPointer<MBoolProperty>(__io__address, new Class[]{MBoolProperty.class}, __io__block, __io__blockTable);
	}

}
