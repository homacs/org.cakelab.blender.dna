package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BoidSettings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> planned for near future typedef struct BoidSignal { struct BoidSignal *next, *prev; float loc[3]; float volume, falloff; int id; } BoidSignal; typedef struct BoidSignalDefine { struct BoidSignalDefine *next, *prev; int id, rt; char name[32]; } BoidSignalDefine; </p><p> typedef struct BoidSimulationData { {@link ListBase}  signal_defines;// list of defined signals  {@link ListBase}  signals[20]; // gathers signals from all channels  struct KDTree *signaltrees[20]; char channel_names[20][32]; int last_signal_id; // used for incrementing signal ids  int flag; // switches for drawing stuff  } BoidSimulationData; </p>
 */

@CMetaData(size32=96, size64=104)
public class BoidSettings extends CFacade {

	/**
	 * This is the sdna index of the struct BoidSettings.
	 * <p>
	 * It is required when allocating a new block to store data for BoidSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 534;

	/**
	 * Field descriptor (offset) for struct member 'options'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__options);
	 * CPointer&lt;Integer&gt; p_options = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'options'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__options = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'last_state_id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__last_state_id);
	 * CPointer&lt;Integer&gt; p_last_state_id = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_state_id'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_state_id = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'landing_smoothness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__landing_smoothness);
	 * CPointer&lt;Float&gt; p_landing_smoothness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'landing_smoothness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__landing_smoothness = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Boid height relative to particle size
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__height);
	 * CPointer&lt;Float&gt; p_height = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'height'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__height = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'banking'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__banking);
	 * CPointer&lt;Float&gt; p_banking = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'banking'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__banking = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'pitch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of rotation around side vector
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__pitch);
	 * CPointer&lt;Float&gt; p_pitch = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pitch'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pitch = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'health'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Initial boid health when born
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__health);
	 * CPointer&lt;Float&gt; p_health = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'health'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__health = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'aggression'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Boid will fight this times stronger enemy
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__aggression);
	 * CPointer&lt;Float&gt; p_aggression = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aggression'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aggression = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum caused damage on attack per second
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__strength);
	 * CPointer&lt;Float&gt; p_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strength = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'accuracy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Accuracy of attack
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__accuracy);
	 * CPointer&lt;Float&gt; p_accuracy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'accuracy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__accuracy = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'range'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance from which a boid can attack
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__range);
	 * CPointer&lt;Float&gt; p_range = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'range'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__range = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'air_min_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flying related </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__air_min_speed);
	 * CPointer&lt;Float&gt; p_air_min_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'air_min_speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__air_min_speed = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'air_max_speed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__air_max_speed);
	 * CPointer&lt;Float&gt; p_air_max_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'air_max_speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__air_max_speed = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'air_max_acc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__air_max_acc);
	 * CPointer&lt;Float&gt; p_air_max_acc = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'air_max_acc'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__air_max_acc = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'air_max_ave'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__air_max_ave);
	 * CPointer&lt;Float&gt; p_air_max_ave = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'air_max_ave'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__air_max_ave = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'air_personal_space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of boids personal space in air (% of particle size)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__air_personal_space);
	 * CPointer&lt;Float&gt; p_air_personal_space = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'air_personal_space'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__air_personal_space = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'land_jump_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum speed for jumping<h4>Blender Source Code:</h4>
	 * <p> walk/run related </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__land_jump_speed);
	 * CPointer&lt;Float&gt; p_land_jump_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'land_jump_speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__land_jump_speed = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'land_max_speed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__land_max_speed);
	 * CPointer&lt;Float&gt; p_land_max_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'land_max_speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__land_max_speed = new long[]{68, 68};

	/**
	 * Field descriptor (offset) for struct member 'land_max_acc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__land_max_acc);
	 * CPointer&lt;Float&gt; p_land_max_acc = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'land_max_acc'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__land_max_acc = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'land_max_ave'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__land_max_ave);
	 * CPointer&lt;Float&gt; p_land_max_ave = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'land_max_ave'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__land_max_ave = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'land_personal_space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of boids personal space on land (% of particle size)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__land_personal_space);
	 * CPointer&lt;Float&gt; p_land_personal_space = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'land_personal_space'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__land_personal_space = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'land_stick_force'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How strong a force must be to start effecting a boid on land
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__land_stick_force);
	 * CPointer&lt;Float&gt; p_land_stick_force = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'land_stick_force'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__land_stick_force = new long[]{84, 84};

	/**
	 * Field descriptor (offset) for struct member 'states'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BoidSettings boidsettings = ...;
	 * CPointer&lt;Object&gt; p = boidsettings.__dna__addressof(BoidSettings.__DNA__FIELD__states);
	 * CPointer&lt;ListBase&gt; p_states = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'states'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__states = new long[]{88, 88};

	public BoidSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BoidSettings(BoidSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'options'.
	 * @see #__DNA__FIELD__options
	 */
	
	public int getOptions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'options'.
	 * @see #__DNA__FIELD__options
	 */
	
	public void setOptions(int options) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, options);
		} else {
			__io__block.writeInt(__io__address + 0, options);
		}
	}

	/**
	 * Get method for struct member 'last_state_id'.
	 * @see #__DNA__FIELD__last_state_id
	 */
	
	public int getLast_state_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'last_state_id'.
	 * @see #__DNA__FIELD__last_state_id
	 */
	
	public void setLast_state_id(int last_state_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, last_state_id);
		} else {
			__io__block.writeInt(__io__address + 4, last_state_id);
		}
	}

	/**
	 * Get method for struct member 'landing_smoothness'.
	 * @see #__DNA__FIELD__landing_smoothness
	 */
	
	public float getLanding_smoothness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'landing_smoothness'.
	 * @see #__DNA__FIELD__landing_smoothness
	 */
	
	public void setLanding_smoothness(float landing_smoothness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, landing_smoothness);
		} else {
			__io__block.writeFloat(__io__address + 8, landing_smoothness);
		}
	}

	/**
	 * Get method for struct member 'height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Boid height relative to particle size
	 * @see #__DNA__FIELD__height
	 */
	
	public float getHeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Boid height relative to particle size
	 * @see #__DNA__FIELD__height
	 */
	
	public void setHeight(float height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, height);
		} else {
			__io__block.writeFloat(__io__address + 12, height);
		}
	}

	/**
	 * Get method for struct member 'banking'.
	 * @see #__DNA__FIELD__banking
	 */
	
	public float getBanking() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'banking'.
	 * @see #__DNA__FIELD__banking
	 */
	
	public void setBanking(float banking) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, banking);
		} else {
			__io__block.writeFloat(__io__address + 16, banking);
		}
	}

	/**
	 * Get method for struct member 'pitch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of rotation around side vector
	 * @see #__DNA__FIELD__pitch
	 */
	
	public float getPitch() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'pitch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of rotation around side vector
	 * @see #__DNA__FIELD__pitch
	 */
	
	public void setPitch(float pitch) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, pitch);
		} else {
			__io__block.writeFloat(__io__address + 20, pitch);
		}
	}

	/**
	 * Get method for struct member 'health'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Initial boid health when born
	 * @see #__DNA__FIELD__health
	 */
	
	public float getHealth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'health'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Initial boid health when born
	 * @see #__DNA__FIELD__health
	 */
	
	public void setHealth(float health) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, health);
		} else {
			__io__block.writeFloat(__io__address + 24, health);
		}
	}

	/**
	 * Get method for struct member 'aggression'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Boid will fight this times stronger enemy
	 * @see #__DNA__FIELD__aggression
	 */
	
	public float getAggression() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'aggression'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Boid will fight this times stronger enemy
	 * @see #__DNA__FIELD__aggression
	 */
	
	public void setAggression(float aggression) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, aggression);
		} else {
			__io__block.writeFloat(__io__address + 28, aggression);
		}
	}

	/**
	 * Get method for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum caused damage on attack per second
	 * @see #__DNA__FIELD__strength
	 */
	
	public float getStrength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum caused damage on attack per second
	 * @see #__DNA__FIELD__strength
	 */
	
	public void setStrength(float strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, strength);
		} else {
			__io__block.writeFloat(__io__address + 32, strength);
		}
	}

	/**
	 * Get method for struct member 'accuracy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Accuracy of attack
	 * @see #__DNA__FIELD__accuracy
	 */
	
	public float getAccuracy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'accuracy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Accuracy of attack
	 * @see #__DNA__FIELD__accuracy
	 */
	
	public void setAccuracy(float accuracy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, accuracy);
		} else {
			__io__block.writeFloat(__io__address + 36, accuracy);
		}
	}

	/**
	 * Get method for struct member 'range'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance from which a boid can attack
	 * @see #__DNA__FIELD__range
	 */
	
	public float getRange() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'range'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance from which a boid can attack
	 * @see #__DNA__FIELD__range
	 */
	
	public void setRange(float range) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, range);
		} else {
			__io__block.writeFloat(__io__address + 40, range);
		}
	}

	/**
	 * Get method for struct member 'air_min_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flying related </p>
	 * @see #__DNA__FIELD__air_min_speed
	 */
	
	public float getAir_min_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'air_min_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flying related </p>
	 * @see #__DNA__FIELD__air_min_speed
	 */
	
	public void setAir_min_speed(float air_min_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, air_min_speed);
		} else {
			__io__block.writeFloat(__io__address + 44, air_min_speed);
		}
	}

	/**
	 * Get method for struct member 'air_max_speed'.
	 * @see #__DNA__FIELD__air_max_speed
	 */
	
	public float getAir_max_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'air_max_speed'.
	 * @see #__DNA__FIELD__air_max_speed
	 */
	
	public void setAir_max_speed(float air_max_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, air_max_speed);
		} else {
			__io__block.writeFloat(__io__address + 48, air_max_speed);
		}
	}

	/**
	 * Get method for struct member 'air_max_acc'.
	 * @see #__DNA__FIELD__air_max_acc
	 */
	
	public float getAir_max_acc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'air_max_acc'.
	 * @see #__DNA__FIELD__air_max_acc
	 */
	
	public void setAir_max_acc(float air_max_acc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, air_max_acc);
		} else {
			__io__block.writeFloat(__io__address + 52, air_max_acc);
		}
	}

	/**
	 * Get method for struct member 'air_max_ave'.
	 * @see #__DNA__FIELD__air_max_ave
	 */
	
	public float getAir_max_ave() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'air_max_ave'.
	 * @see #__DNA__FIELD__air_max_ave
	 */
	
	public void setAir_max_ave(float air_max_ave) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, air_max_ave);
		} else {
			__io__block.writeFloat(__io__address + 56, air_max_ave);
		}
	}

	/**
	 * Get method for struct member 'air_personal_space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of boids personal space in air (% of particle size)
	 * @see #__DNA__FIELD__air_personal_space
	 */
	
	public float getAir_personal_space() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'air_personal_space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of boids personal space in air (% of particle size)
	 * @see #__DNA__FIELD__air_personal_space
	 */
	
	public void setAir_personal_space(float air_personal_space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, air_personal_space);
		} else {
			__io__block.writeFloat(__io__address + 60, air_personal_space);
		}
	}

	/**
	 * Get method for struct member 'land_jump_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum speed for jumping<h4>Blender Source Code:</h4>
	 * <p> walk/run related </p>
	 * @see #__DNA__FIELD__land_jump_speed
	 */
	
	public float getLand_jump_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'land_jump_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum speed for jumping<h4>Blender Source Code:</h4>
	 * <p> walk/run related </p>
	 * @see #__DNA__FIELD__land_jump_speed
	 */
	
	public void setLand_jump_speed(float land_jump_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, land_jump_speed);
		} else {
			__io__block.writeFloat(__io__address + 64, land_jump_speed);
		}
	}

	/**
	 * Get method for struct member 'land_max_speed'.
	 * @see #__DNA__FIELD__land_max_speed
	 */
	
	public float getLand_max_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'land_max_speed'.
	 * @see #__DNA__FIELD__land_max_speed
	 */
	
	public void setLand_max_speed(float land_max_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, land_max_speed);
		} else {
			__io__block.writeFloat(__io__address + 68, land_max_speed);
		}
	}

	/**
	 * Get method for struct member 'land_max_acc'.
	 * @see #__DNA__FIELD__land_max_acc
	 */
	
	public float getLand_max_acc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'land_max_acc'.
	 * @see #__DNA__FIELD__land_max_acc
	 */
	
	public void setLand_max_acc(float land_max_acc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, land_max_acc);
		} else {
			__io__block.writeFloat(__io__address + 72, land_max_acc);
		}
	}

	/**
	 * Get method for struct member 'land_max_ave'.
	 * @see #__DNA__FIELD__land_max_ave
	 */
	
	public float getLand_max_ave() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'land_max_ave'.
	 * @see #__DNA__FIELD__land_max_ave
	 */
	
	public void setLand_max_ave(float land_max_ave) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, land_max_ave);
		} else {
			__io__block.writeFloat(__io__address + 76, land_max_ave);
		}
	}

	/**
	 * Get method for struct member 'land_personal_space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of boids personal space on land (% of particle size)
	 * @see #__DNA__FIELD__land_personal_space
	 */
	
	public float getLand_personal_space() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'land_personal_space'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of boids personal space on land (% of particle size)
	 * @see #__DNA__FIELD__land_personal_space
	 */
	
	public void setLand_personal_space(float land_personal_space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, land_personal_space);
		} else {
			__io__block.writeFloat(__io__address + 80, land_personal_space);
		}
	}

	/**
	 * Get method for struct member 'land_stick_force'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How strong a force must be to start effecting a boid on land
	 * @see #__DNA__FIELD__land_stick_force
	 */
	
	public float getLand_stick_force() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'land_stick_force'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How strong a force must be to start effecting a boid on land
	 * @see #__DNA__FIELD__land_stick_force
	 */
	
	public void setLand_stick_force(float land_stick_force) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, land_stick_force);
		} else {
			__io__block.writeFloat(__io__address + 84, land_stick_force);
		}
	}

	/**
	 * Get method for struct member 'states'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__states
	 */
	
	public ListBase getStates() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 88, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 88, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'states'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__states
	 */
	
	public void setStates(ListBase states) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 88;
		}
		if (__io__equals(states, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, states)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, states);
		} else {
			__io__generic__copy( getStates(), states);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BoidSettings> __io__addressof() {
		return new CPointer<BoidSettings>(__io__address, new Class[]{BoidSettings.class}, __io__block, __io__blockTable);
	}

}
