package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ID_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=16, size64=16)
public class ID_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct ID_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for ID_Runtime.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 21;

	/**
	 * Field descriptor (offset) for struct member 'remap'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ID_Runtime id_runtime = ...;
	 * CPointer&lt;Object&gt; p = id_runtime.__dna__addressof(ID_Runtime.__DNA__FIELD__remap);
	 * CPointer&lt;ID_Runtime_Remap&gt; p_remap = p.cast(new Class[]{ID_Runtime_Remap.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'remap'</li>
	 * <li>Signature: 'ID_Runtime_Remap'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__remap = new long[]{0, 0};

	public ID_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ID_Runtime(ID_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'remap'.
	 * @see #__DNA__FIELD__remap
	 */
	
	public ID_Runtime_Remap getRemap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ID_Runtime_Remap(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ID_Runtime_Remap(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'remap'.
	 * @see #__DNA__FIELD__remap
	 */
	
	public void setRemap(ID_Runtime_Remap remap) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(remap, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, remap)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, remap);
		} else {
			__io__generic__copy( getRemap(), remap);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ID_Runtime> __io__addressof() {
		return new CPointer<ID_Runtime>(__io__address, new Class[]{ID_Runtime.class}, __io__block, __io__blockTable);
	}

}
