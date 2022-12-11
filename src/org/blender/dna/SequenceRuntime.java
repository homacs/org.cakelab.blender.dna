package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SequenceRuntime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class SequenceRuntime extends CFacade {

	/**
	 * This is the sdna index of the struct SequenceRuntime.
	 * <p>
	 * It is required when allocating a new block to store data for SequenceRuntime.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 636;

	/**
	 * Field descriptor (offset) for struct member 'session_uuid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequenceRuntime sequenceruntime = ...;
	 * CPointer&lt;Object&gt; p = sequenceruntime.__dna__addressof(SequenceRuntime.__DNA__FIELD__session_uuid);
	 * CPointer&lt;SessionUUID&gt; p_session_uuid = p.cast(new Class[]{SessionUUID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'session_uuid'</li>
	 * <li>Signature: 'SessionUUID'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__session_uuid = new long[]{0, 0};

	public SequenceRuntime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SequenceRuntime(SequenceRuntime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'session_uuid'.
	 * @see #__DNA__FIELD__session_uuid
	 */
	
	public SessionUUID getSession_uuid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new SessionUUID(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new SessionUUID(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'session_uuid'.
	 * @see #__DNA__FIELD__session_uuid
	 */
	
	public void setSession_uuid(SessionUUID session_uuid) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(session_uuid, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, session_uuid)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, session_uuid);
		} else {
			__io__generic__copy( getSession_uuid(), session_uuid);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SequenceRuntime> __io__addressof() {
		return new CPointer<SequenceRuntime>(__io__address, new Class[]{SequenceRuntime.class}, __io__block, __io__blockTable);
	}

}
