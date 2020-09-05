package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ParticleSimulationState'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=252, size64=280)
public class ParticleSimulationState extends CFacade {

	/**
	 * This is the sdna index of the struct ParticleSimulationState.
	 * <p>
	 * It is required when allocating a new block to store data for ParticleSimulationState.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 679;

	/**
	 * Field descriptor (offset) for struct member 'head'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSimulationState particlesimulationstate = ...;
	 * CPointer&lt;Object&gt; p = particlesimulationstate.__dna__addressof(ParticleSimulationState.__DNA__FIELD__head);
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
	 * Field descriptor (offset) for struct member 'tot_particles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Contains the state of the particles at time Simulation->current_frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSimulationState particlesimulationstate = ...;
	 * CPointer&lt;Object&gt; p = particlesimulationstate.__dna__addressof(ParticleSimulationState.__DNA__FIELD__tot_particles);
	 * CPointer&lt;Integer&gt; p_tot_particles = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_particles'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_particles = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'next_particle_id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSimulationState particlesimulationstate = ...;
	 * CPointer&lt;Object&gt; p = particlesimulationstate.__dna__addressof(ParticleSimulationState.__DNA__FIELD__next_particle_id);
	 * CPointer&lt;Integer&gt; p_next_particle_id = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next_particle_id'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next_particle_id = new long[]{20, 36};

	/**
	 * Field descriptor (offset) for struct member 'attributes'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSimulationState particlesimulationstate = ...;
	 * CPointer&lt;Object&gt; p = particlesimulationstate.__dna__addressof(ParticleSimulationState.__DNA__FIELD__attributes);
	 * CPointer&lt;CustomData&gt; p_attributes = p.cast(new Class[]{CustomData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attributes'</li>
	 * <li>Signature: 'CustomData'</li>
	 * <li>Actual Size (32bit/64bit): 228/240</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attributes = new long[]{24, 40};

	public ParticleSimulationState(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ParticleSimulationState(ParticleSimulationState that) {
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
	 * Get method for struct member 'tot_particles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Contains the state of the particles at time Simulation->current_frame. </p>
	 * @see #__DNA__FIELD__tot_particles
	 */
	
	public int getTot_particles() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'tot_particles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Contains the state of the particles at time Simulation->current_frame. </p>
	 * @see #__DNA__FIELD__tot_particles
	 */
	
	public void setTot_particles(int tot_particles) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, tot_particles);
		} else {
			__io__block.writeInt(__io__address + 16, tot_particles);
		}
	}

	/**
	 * Get method for struct member 'next_particle_id'.
	 * @see #__DNA__FIELD__next_particle_id
	 */
	
	public int getNext_particle_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'next_particle_id'.
	 * @see #__DNA__FIELD__next_particle_id
	 */
	
	public void setNext_particle_id(int next_particle_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, next_particle_id);
		} else {
			__io__block.writeInt(__io__address + 20, next_particle_id);
		}
	}

	/**
	 * Get method for struct member 'attributes'.
	 * @see #__DNA__FIELD__attributes
	 */
	
	public CustomData getAttributes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData(__io__address + 40, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 24, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'attributes'.
	 * @see #__DNA__FIELD__attributes
	 */
	
	public void setAttributes(CustomData attributes) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(attributes, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, attributes)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, attributes);
		} else {
			__io__generic__copy( getAttributes(), attributes);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ParticleSimulationState> __io__addressof() {
		return new CPointer<ParticleSimulationState>(__io__address, new Class[]{ParticleSimulationState.class}, __io__block, __io__blockTable);
	}

}
