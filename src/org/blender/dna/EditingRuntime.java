package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'EditingRuntime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=8)
public class EditingRuntime extends CFacade {

	/**
	 * This is the sdna index of the struct EditingRuntime.
	 * <p>
	 * It is required when allocating a new block to store data for EditingRuntime.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 325;

	/**
	 * Field descriptor (offset) for struct member 'sequence_lookup'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * EditingRuntime editingruntime = ...;
	 * CPointer&lt;Object&gt; p = editingruntime.__dna__addressof(EditingRuntime.__DNA__FIELD__sequence_lookup);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sequence_lookup = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sequence_lookup'</li>
	 * <li>Signature: 'SequenceLookup*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sequence_lookup = new long[]{0, 0};

	public EditingRuntime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected EditingRuntime(EditingRuntime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'sequence_lookup'.
	 * @see #__DNA__FIELD__sequence_lookup
	 */
	
	public CPointer<Object> getSequence_lookup() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sequence_lookup'.
	 * @see #__DNA__FIELD__sequence_lookup
	 */
	
	public void setSequence_lookup(CPointer<Object> sequence_lookup) throws IOException
	{
		long __address = ((sequence_lookup == null) ? 0 : sequence_lookup.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<EditingRuntime> __io__addressof() {
		return new CPointer<EditingRuntime>(__io__address, new Class[]{EditingRuntime.class}, __io__block, __io__blockTable);
	}

}
