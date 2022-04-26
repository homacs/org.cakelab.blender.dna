package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SessionUUID'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Is a structure because of the following considerations:</p><p><ul><li><p> It is not possible to use custom types in DNA members: makesdna does not recognize them.</p></li><li><p> It allows to add more bits, more than standard fixed-size types can store. For example, if we ever need to go 128 bits, it is as simple as adding extra 64bit field. </p></li></ul> 
 * It is not possible to use custom types in DNA members: makesdna does not recognize them.
 * It allows to add more bits, more than standard fixed-size types can store. For example, if we ever need to go 128 bits, it is as simple as adding extra 64bit field. 
 * 
 * </p>
 */

@CMetaData(size32=8, size64=8)
public class SessionUUID extends CFacade {

	/**
	 * This is the sdna index of the struct SessionUUID.
	 * <p>
	 * It is required when allocating a new block to store data for SessionUUID.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 339;

	/**
	 * Field descriptor (offset) for struct member 'uuid_'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Never access directly, as it might cause a headache when more bits are needed: if the field is used directly it will not be easy to find all places where partial access is used. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SessionUUID sessionuuid = ...;
	 * CPointer&lt;Object&gt; p = sessionuuid.__dna__addressof(SessionUUID.__DNA__FIELD__uuid_);
	 * CPointer&lt;int64&gt; p_uuid_ = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uuid_'</li>
	 * <li>Signature: 'uint64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uuid_ = new long[]{0, 0};

	public SessionUUID(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SessionUUID(SessionUUID that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'uuid_'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Never access directly, as it might cause a headache when more bits are needed: if the field is used directly it will not be easy to find all places where partial access is used. </p>
	 * @see #__DNA__FIELD__uuid_
	 */
	
	public long getUuid_() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 0);
		} else {
			return __io__block.readInt64(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'uuid_'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Never access directly, as it might cause a headache when more bits are needed: if the field is used directly it will not be easy to find all places where partial access is used. </p>
	 * @see #__DNA__FIELD__uuid_
	 */
	
	public void setUuid_(long uuid_) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 0, uuid_);
		} else {
			__io__block.writeInt64(__io__address + 0, uuid_);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SessionUUID> __io__addressof() {
		return new CPointer<SessionUUID>(__io__address, new Class[]{SessionUUID.class}, __io__block, __io__blockTable);
	}

}
