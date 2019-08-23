package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieTrackingStats'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=256, size64=256)
public class MovieTrackingStats extends CFacade {

	/**
	 * This is the sdna index of the struct MovieTrackingStats.
	 * <p>
	 * It is required when allocating a new block to store data for MovieTrackingStats.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 553;

	/**
	 * Field descriptor (offset) for struct member 'message'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStats movietrackingstats = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstats.__dna__addressof(MovieTrackingStats.__DNA__FIELD__message);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_message = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'message'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__message = new long[]{0, 0};

	public MovieTrackingStats(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieTrackingStats(MovieTrackingStats that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'message'.
	 * @see #__DNA__FIELD__message
	 */
	
	public CArrayFacade<Byte> getMessage() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'message'.
	 * @see #__DNA__FIELD__message
	 */
	
	public void setMessage(CArrayFacade<Byte> message) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(message, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, message)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, message);
		} else {
			__io__generic__copy( getMessage(), message);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieTrackingStats> __io__addressof() {
		return new CPointer<MovieTrackingStats>(__io__address, new Class[]{MovieTrackingStats.class}, __io__block, __io__blockTable);
	}

}
