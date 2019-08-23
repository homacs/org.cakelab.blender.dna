package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ParticleSpring'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=16, size64=16)
public class ParticleSpring extends CFacade {

	/**
	 * This is the sdna index of the struct ParticleSpring.
	 * <p>
	 * It is required when allocating a new block to store data for ParticleSpring.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 475;

	/**
	 * Field descriptor (offset) for struct member 'rest_length'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSpring particlespring = ...;
	 * CPointer&lt;Object&gt; p = particlespring.__dna__addressof(ParticleSpring.__DNA__FIELD__rest_length);
	 * CPointer&lt;Float&gt; p_rest_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rest_length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rest_length = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'particle_index'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSpring particlespring = ...;
	 * CPointer&lt;Object&gt; p = particlespring.__dna__addressof(ParticleSpring.__DNA__FIELD__particle_index);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_particle_index = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_index'</li>
	 * <li>Signature: 'int[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_index = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'delete_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSpring particlespring = ...;
	 * CPointer&lt;Object&gt; p = particlespring.__dna__addressof(ParticleSpring.__DNA__FIELD__delete_flag);
	 * CPointer&lt;Integer&gt; p_delete_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'delete_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__delete_flag = new long[]{12, 12};

	public ParticleSpring(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ParticleSpring(ParticleSpring that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'rest_length'.
	 * @see #__DNA__FIELD__rest_length
	 */
	
	public float getRest_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'rest_length'.
	 * @see #__DNA__FIELD__rest_length
	 */
	
	public void setRest_length(float rest_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, rest_length);
		} else {
			__io__block.writeFloat(__io__address + 0, rest_length);
		}
	}

	/**
	 * Get method for struct member 'particle_index'.
	 * @see #__DNA__FIELD__particle_index
	 */
	
	public CArrayFacade<Integer> getParticle_index() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'particle_index'.
	 * @see #__DNA__FIELD__particle_index
	 */
	
	public void setParticle_index(CArrayFacade<Integer> particle_index) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(particle_index, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, particle_index)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, particle_index);
		} else {
			__io__generic__copy( getParticle_index(), particle_index);
		}
	}

	/**
	 * Get method for struct member 'delete_flag'.
	 * @see #__DNA__FIELD__delete_flag
	 */
	
	public int getDelete_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'delete_flag'.
	 * @see #__DNA__FIELD__delete_flag
	 */
	
	public void setDelete_flag(int delete_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, delete_flag);
		} else {
			__io__block.writeInt(__io__address + 12, delete_flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ParticleSpring> __io__addressof() {
		return new CPointer<ParticleSpring>(__io__address, new Class[]{ParticleSpring.class}, __io__block, __io__blockTable);
	}

}
