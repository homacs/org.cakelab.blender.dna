package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SPHFluidSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=68, size64=68)
public class SPHFluidSettings extends CFacade {

	/**
	 * This is the sdna index of the struct SPHFluidSettings.
	 * <p>
	 * It is required when allocating a new block to store data for SPHFluidSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 456;

	/**
	 * Field descriptor (offset) for struct member 'radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Particle}  Fluid </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__radius);
	 * CPointer&lt;Float&gt; p_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__radius = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'spring_k'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__spring_k);
	 * CPointer&lt;Float&gt; p_spring_k = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spring_k'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spring_k = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'rest_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Spring rest length (factor of particle radius)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__rest_length);
	 * CPointer&lt;Float&gt; p_rest_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rest_length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rest_length = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'plasticity_constant'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__plasticity_constant);
	 * CPointer&lt;Float&gt; p_plasticity_constant = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'plasticity_constant'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__plasticity_constant = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'yield_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the spring has to be stretched/compressed in order to change it's rest length
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__yield_ratio);
	 * CPointer&lt;Float&gt; p_yield_ratio = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yield_ratio'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yield_ratio = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'plasticity_balance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__plasticity_balance);
	 * CPointer&lt;Float&gt; p_plasticity_balance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'plasticity_balance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__plasticity_balance = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'yield_balance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__yield_balance);
	 * CPointer&lt;Float&gt; p_yield_balance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yield_balance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yield_balance = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'viscosity_omega'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__viscosity_omega);
	 * CPointer&lt;Float&gt; p_viscosity_omega = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viscosity_omega'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viscosity_omega = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'viscosity_beta'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__viscosity_beta);
	 * CPointer&lt;Float&gt; p_viscosity_beta = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viscosity_beta'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viscosity_beta = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'stiffness_k'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__stiffness_k);
	 * CPointer&lt;Float&gt; p_stiffness_k = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stiffness_k'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stiffness_k = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'stiffness_knear'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__stiffness_knear);
	 * CPointer&lt;Float&gt; p_stiffness_knear = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stiffness_knear'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stiffness_knear = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'rest_density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Fluid rest density
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__rest_density);
	 * CPointer&lt;Float&gt; p_rest_density = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rest_density'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rest_density = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'buoyancy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Artificial buoyancy force in negative gravity direction based on pressure differences inside the fluid
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__buoyancy);
	 * CPointer&lt;Float&gt; p_buoyancy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'buoyancy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__buoyancy = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'spring_frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Create springs for this number of frames since particles birth (0 is always)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__spring_frames);
	 * CPointer&lt;Integer&gt; p_spring_frames = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spring_frames'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spring_frames = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'solver'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The code used to calculate internal forces on particles
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD__solver);
	 * CPointer&lt;Short&gt; p_solver = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'solver'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__solver = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SPHFluidSettings sphfluidsettings = ...;
	 * CPointer&lt;Object&gt; p = sphfluidsettings.__dna__addressof(SPHFluidSettings.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{62, 62};

	public SPHFluidSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SPHFluidSettings(SPHFluidSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Particle}  Fluid </p>
	 * @see #__DNA__FIELD__radius
	 */
	
	public float getRadius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Particle}  Fluid </p>
	 * @see #__DNA__FIELD__radius
	 */
	
	public void setRadius(float radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, radius);
		} else {
			__io__block.writeFloat(__io__address + 0, radius);
		}
	}

	/**
	 * Get method for struct member 'spring_k'.
	 * @see #__DNA__FIELD__spring_k
	 */
	
	public float getSpring_k() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'spring_k'.
	 * @see #__DNA__FIELD__spring_k
	 */
	
	public void setSpring_k(float spring_k) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, spring_k);
		} else {
			__io__block.writeFloat(__io__address + 4, spring_k);
		}
	}

	/**
	 * Get method for struct member 'rest_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Spring rest length (factor of particle radius)
	 * @see #__DNA__FIELD__rest_length
	 */
	
	public float getRest_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'rest_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Spring rest length (factor of particle radius)
	 * @see #__DNA__FIELD__rest_length
	 */
	
	public void setRest_length(float rest_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, rest_length);
		} else {
			__io__block.writeFloat(__io__address + 8, rest_length);
		}
	}

	/**
	 * Get method for struct member 'plasticity_constant'.
	 * @see #__DNA__FIELD__plasticity_constant
	 */
	
	public float getPlasticity_constant() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'plasticity_constant'.
	 * @see #__DNA__FIELD__plasticity_constant
	 */
	
	public void setPlasticity_constant(float plasticity_constant) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, plasticity_constant);
		} else {
			__io__block.writeFloat(__io__address + 12, plasticity_constant);
		}
	}

	/**
	 * Get method for struct member 'yield_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the spring has to be stretched/compressed in order to change it's rest length
	 * @see #__DNA__FIELD__yield_ratio
	 */
	
	public float getYield_ratio() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'yield_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much the spring has to be stretched/compressed in order to change it's rest length
	 * @see #__DNA__FIELD__yield_ratio
	 */
	
	public void setYield_ratio(float yield_ratio) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, yield_ratio);
		} else {
			__io__block.writeFloat(__io__address + 16, yield_ratio);
		}
	}

	/**
	 * Get method for struct member 'plasticity_balance'.
	 * @see #__DNA__FIELD__plasticity_balance
	 */
	
	public float getPlasticity_balance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'plasticity_balance'.
	 * @see #__DNA__FIELD__plasticity_balance
	 */
	
	public void setPlasticity_balance(float plasticity_balance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, plasticity_balance);
		} else {
			__io__block.writeFloat(__io__address + 20, plasticity_balance);
		}
	}

	/**
	 * Get method for struct member 'yield_balance'.
	 * @see #__DNA__FIELD__yield_balance
	 */
	
	public float getYield_balance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'yield_balance'.
	 * @see #__DNA__FIELD__yield_balance
	 */
	
	public void setYield_balance(float yield_balance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, yield_balance);
		} else {
			__io__block.writeFloat(__io__address + 24, yield_balance);
		}
	}

	/**
	 * Get method for struct member 'viscosity_omega'.
	 * @see #__DNA__FIELD__viscosity_omega
	 */
	
	public float getViscosity_omega() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'viscosity_omega'.
	 * @see #__DNA__FIELD__viscosity_omega
	 */
	
	public void setViscosity_omega(float viscosity_omega) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, viscosity_omega);
		} else {
			__io__block.writeFloat(__io__address + 28, viscosity_omega);
		}
	}

	/**
	 * Get method for struct member 'viscosity_beta'.
	 * @see #__DNA__FIELD__viscosity_beta
	 */
	
	public float getViscosity_beta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'viscosity_beta'.
	 * @see #__DNA__FIELD__viscosity_beta
	 */
	
	public void setViscosity_beta(float viscosity_beta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, viscosity_beta);
		} else {
			__io__block.writeFloat(__io__address + 32, viscosity_beta);
		}
	}

	/**
	 * Get method for struct member 'stiffness_k'.
	 * @see #__DNA__FIELD__stiffness_k
	 */
	
	public float getStiffness_k() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'stiffness_k'.
	 * @see #__DNA__FIELD__stiffness_k
	 */
	
	public void setStiffness_k(float stiffness_k) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, stiffness_k);
		} else {
			__io__block.writeFloat(__io__address + 36, stiffness_k);
		}
	}

	/**
	 * Get method for struct member 'stiffness_knear'.
	 * @see #__DNA__FIELD__stiffness_knear
	 */
	
	public float getStiffness_knear() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'stiffness_knear'.
	 * @see #__DNA__FIELD__stiffness_knear
	 */
	
	public void setStiffness_knear(float stiffness_knear) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, stiffness_knear);
		} else {
			__io__block.writeFloat(__io__address + 40, stiffness_knear);
		}
	}

	/**
	 * Get method for struct member 'rest_density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Fluid rest density
	 * @see #__DNA__FIELD__rest_density
	 */
	
	public float getRest_density() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'rest_density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Fluid rest density
	 * @see #__DNA__FIELD__rest_density
	 */
	
	public void setRest_density(float rest_density) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, rest_density);
		} else {
			__io__block.writeFloat(__io__address + 44, rest_density);
		}
	}

	/**
	 * Get method for struct member 'buoyancy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Artificial buoyancy force in negative gravity direction based on pressure differences inside the fluid
	 * @see #__DNA__FIELD__buoyancy
	 */
	
	public float getBuoyancy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'buoyancy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Artificial buoyancy force in negative gravity direction based on pressure differences inside the fluid
	 * @see #__DNA__FIELD__buoyancy
	 */
	
	public void setBuoyancy(float buoyancy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, buoyancy);
		} else {
			__io__block.writeFloat(__io__address + 48, buoyancy);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 52);
		} else {
			return __io__block.readInt(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 52, flag);
		} else {
			__io__block.writeInt(__io__address + 52, flag);
		}
	}

	/**
	 * Get method for struct member 'spring_frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Create springs for this number of frames since particles birth (0 is always)
	 * @see #__DNA__FIELD__spring_frames
	 */
	
	public int getSpring_frames() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 56);
		} else {
			return __io__block.readInt(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'spring_frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Create springs for this number of frames since particles birth (0 is always)
	 * @see #__DNA__FIELD__spring_frames
	 */
	
	public void setSpring_frames(int spring_frames) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 56, spring_frames);
		} else {
			__io__block.writeInt(__io__address + 56, spring_frames);
		}
	}

	/**
	 * Get method for struct member 'solver'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The code used to calculate internal forces on particles
	 * @see #__DNA__FIELD__solver
	 */
	
	public short getSolver() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 60);
		} else {
			return __io__block.readShort(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'solver'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The code used to calculate internal forces on particles
	 * @see #__DNA__FIELD__solver
	 */
	
	public void setSolver(short solver) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 60, solver);
		} else {
			__io__block.writeShort(__io__address + 60, solver);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 62, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 62, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 62;
		} else {
			__dna__offset = 62;
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
	public CPointer<SPHFluidSettings> __io__addressof() {
		return new CPointer<SPHFluidSettings>(__io__address, new Class[]{SPHFluidSettings.class}, __io__block, __io__blockTable);
	}

}
