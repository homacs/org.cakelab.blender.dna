package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieClip_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=16)
public class MovieClip_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct MovieClip_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for MovieClip_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 551;

	/**
	 * Field descriptor (offset) for struct member 'gputextures'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClip_Runtime movieclip_runtime = ...;
	 * CPointer&lt;Object&gt; p = movieclip_runtime.__dna__addressof(MovieClip_Runtime.__DNA__FIELD__gputextures);
	 * CPointer&lt;ListBase&gt; p_gputextures = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gputextures'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gputextures = new long[]{0, 0};

	public MovieClip_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieClip_Runtime(MovieClip_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'gputextures'.
	 * @see #__DNA__FIELD__gputextures
	 */
	
	public ListBase getGputextures() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gputextures'.
	 * @see #__DNA__FIELD__gputextures
	 */
	
	public void setGputextures(ListBase gputextures) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(gputextures, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gputextures)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gputextures);
		} else {
			__io__generic__copy( getGputextures(), gputextures);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieClip_Runtime> __io__addressof() {
		return new CPointer<MovieClip_Runtime>(__io__address, new Class[]{MovieClip_Runtime.class}, __io__block, __io__blockTable);
	}

}
