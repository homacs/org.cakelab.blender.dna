package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ParticleMeshEmitterSimulationState'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=24, size64=40)
public class ParticleMeshEmitterSimulationState extends CFacade {

	/**
	 * This is the sdna index of the struct ParticleMeshEmitterSimulationState.
	 * <p>
	 * It is required when allocating a new block to store data for ParticleMeshEmitterSimulationState.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 680;

	/**
	 * Field descriptor (offset) for struct member 'head'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleMeshEmitterSimulationState particlemeshemittersimulationstate = ...;
	 * CPointer&lt;Object&gt; p = particlemeshemittersimulationstate.__dna__addressof(ParticleMeshEmitterSimulationState.__DNA__FIELD__head);
	 * CPointer&lt;SimulationState&gt; p_head = p.cast(new Class[]{SimulationState.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'head'</li>
	 * <li>Signature: 'SimulationState'</li>
	 * <li>Actual Size (32bit/64bit): 16/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__head = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'last_birth_time'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleMeshEmitterSimulationState particlemeshemittersimulationstate = ...;
	 * CPointer&lt;Object&gt; p = particlemeshemittersimulationstate.__dna__addressof(ParticleMeshEmitterSimulationState.__DNA__FIELD__last_birth_time);
	 * CPointer&lt;Float&gt; p_last_birth_time = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_birth_time'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_birth_time = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleMeshEmitterSimulationState particlemeshemittersimulationstate = ...;
	 * CPointer&lt;Object&gt; p = particlemeshemittersimulationstate.__dna__addressof(ParticleMeshEmitterSimulationState.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{20, 36};

	public ParticleMeshEmitterSimulationState(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ParticleMeshEmitterSimulationState(ParticleMeshEmitterSimulationState that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'head'.
	 * @see #__DNA__FIELD__head
	 */
	
	public SimulationState getHead() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new SimulationState(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new SimulationState(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'head'.
	 * @see #__DNA__FIELD__head
	 */
	
	public void setHead(SimulationState head) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(head, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, head)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, head);
		} else {
			__io__generic__copy( getHead(), head);
		}
	}

	/**
	 * Get method for struct member 'last_birth_time'.
	 * @see #__DNA__FIELD__last_birth_time
	 */
	
	public float getLast_birth_time() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'last_birth_time'.
	 * @see #__DNA__FIELD__last_birth_time
	 */
	
	public void setLast_birth_time(float last_birth_time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, last_birth_time);
		} else {
			__io__block.writeFloat(__io__address + 16, last_birth_time);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 36;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ParticleMeshEmitterSimulationState> __io__addressof() {
		return new CPointer<ParticleMeshEmitterSimulationState>(__io__address, new Class[]{ParticleMeshEmitterSimulationState.class}, __io__block, __io__blockTable);
	}

}
