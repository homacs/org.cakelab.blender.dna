package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ClothSimSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=144, size64=152)
public class ClothSimSettings extends CFacade {

	/**
	 * This is the sdna index of the struct ClothSimSettings.
	 * <p>
	 * It is required when allocating a new block to store data for ClothSimSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 436;

	/**
	 * Field descriptor (offset) for struct member 'cache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache'</li>
	 * <li>Signature: 'LinkNode*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'mingoal'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__mingoal);
	 * CPointer&lt;Float&gt; p_mingoal = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mingoal'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mingoal = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'Cdis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__Cdis);
	 * CPointer&lt;Float&gt; p_Cdis = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'Cdis'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__Cdis = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'Cvi'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__Cvi);
	 * CPointer&lt;Float&gt; p_Cvi = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'Cvi'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__Cvi = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'gravity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__gravity);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gravity = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gravity'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gravity = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member 'dt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__dt);
	 * CPointer&lt;Float&gt; p_dt = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dt'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dt = new long[]{28, 32};

	/**
	 * Field descriptor (offset) for struct member 'mass'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__mass);
	 * CPointer&lt;Float&gt; p_mass = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mass'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mass = new long[]{32, 36};

	/**
	 * Field descriptor (offset) for struct member 'structural'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__structural);
	 * CPointer&lt;Float&gt; p_structural = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'structural'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__structural = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'shear'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__shear);
	 * CPointer&lt;Float&gt; p_shear = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shear'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shear = new long[]{40, 44};

	/**
	 * Field descriptor (offset) for struct member 'bending'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__bending);
	 * CPointer&lt;Float&gt; p_bending = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bending'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bending = new long[]{44, 48};

	/**
	 * Field descriptor (offset) for struct member 'max_bend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__max_bend);
	 * CPointer&lt;Float&gt; p_max_bend = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_bend'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_bend = new long[]{48, 52};

	/**
	 * Field descriptor (offset) for struct member 'max_struct'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__max_struct);
	 * CPointer&lt;Float&gt; p_max_struct = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_struct'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_struct = new long[]{52, 56};

	/**
	 * Field descriptor (offset) for struct member 'max_shear'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__max_shear);
	 * CPointer&lt;Float&gt; p_max_shear = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_shear'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_shear = new long[]{56, 60};

	/**
	 * Field descriptor (offset) for struct member 'avg_spring_len'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__avg_spring_len);
	 * CPointer&lt;Float&gt; p_avg_spring_len = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'avg_spring_len'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__avg_spring_len = new long[]{60, 64};

	/**
	 * Field descriptor (offset) for struct member 'timescale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__timescale);
	 * CPointer&lt;Float&gt; p_timescale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'timescale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__timescale = new long[]{64, 68};

	/**
	 * Field descriptor (offset) for struct member 'maxgoal'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__maxgoal);
	 * CPointer&lt;Float&gt; p_maxgoal = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxgoal'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxgoal = new long[]{68, 72};

	/**
	 * Field descriptor (offset) for struct member 'eff_force_scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__eff_force_scale);
	 * CPointer&lt;Float&gt; p_eff_force_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eff_force_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eff_force_scale = new long[]{72, 76};

	/**
	 * Field descriptor (offset) for struct member 'eff_wind_scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__eff_wind_scale);
	 * CPointer&lt;Float&gt; p_eff_wind_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eff_wind_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eff_wind_scale = new long[]{76, 80};

	/**
	 * Field descriptor (offset) for struct member 'sim_time_old'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__sim_time_old);
	 * CPointer&lt;Float&gt; p_sim_time_old = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sim_time_old'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sim_time_old = new long[]{80, 84};

	/**
	 * Field descriptor (offset) for struct member 'defgoal'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__defgoal);
	 * CPointer&lt;Float&gt; p_defgoal = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defgoal'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defgoal = new long[]{84, 88};

	/**
	 * Field descriptor (offset) for struct member 'goalspring'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__goalspring);
	 * CPointer&lt;Float&gt; p_goalspring = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'goalspring'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__goalspring = new long[]{88, 92};

	/**
	 * Field descriptor (offset) for struct member 'goalfrict'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__goalfrict);
	 * CPointer&lt;Float&gt; p_goalfrict = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'goalfrict'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__goalfrict = new long[]{92, 96};

	/**
	 * Field descriptor (offset) for struct member 'velocity_smooth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__velocity_smooth);
	 * CPointer&lt;Float&gt; p_velocity_smooth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'velocity_smooth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__velocity_smooth = new long[]{96, 100};

	/**
	 * Field descriptor (offset) for struct member 'collider_friction'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__collider_friction);
	 * CPointer&lt;Float&gt; p_collider_friction = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'collider_friction'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__collider_friction = new long[]{100, 104};

	/**
	 * Field descriptor (offset) for struct member 'vel_damping'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__vel_damping);
	 * CPointer&lt;Float&gt; p_vel_damping = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vel_damping'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vel_damping = new long[]{104, 108};

	/**
	 * Field descriptor (offset) for struct member 'stepsPerFrame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__stepsPerFrame);
	 * CPointer&lt;Integer&gt; p_stepsPerFrame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stepsPerFrame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stepsPerFrame = new long[]{108, 112};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{112, 116};

	/**
	 * Field descriptor (offset) for struct member 'preroll'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__preroll);
	 * CPointer&lt;Integer&gt; p_preroll = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preroll'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preroll = new long[]{116, 120};

	/**
	 * Field descriptor (offset) for struct member 'maxspringlen'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__maxspringlen);
	 * CPointer&lt;Integer&gt; p_maxspringlen = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxspringlen'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxspringlen = new long[]{120, 124};

	/**
	 * Field descriptor (offset) for struct member 'solver_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__solver_type);
	 * CPointer&lt;Short&gt; p_solver_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'solver_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__solver_type = new long[]{124, 128};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_bend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__vgroup_bend);
	 * CPointer&lt;Short&gt; p_vgroup_bend = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_bend'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_bend = new long[]{126, 130};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_mass'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__vgroup_mass);
	 * CPointer&lt;Short&gt; p_vgroup_mass = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_mass'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_mass = new long[]{128, 132};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_struct'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__vgroup_struct);
	 * CPointer&lt;Short&gt; p_vgroup_struct = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_struct'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_struct = new long[]{130, 134};

	/**
	 * Field descriptor (offset) for struct member 'shapekey_rest'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__shapekey_rest);
	 * CPointer&lt;Short&gt; p_shapekey_rest = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shapekey_rest'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shapekey_rest = new long[]{132, 136};

	/**
	 * Field descriptor (offset) for struct member 'presets'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__presets);
	 * CPointer&lt;Short&gt; p_presets = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'presets'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__presets = new long[]{134, 138};

	/**
	 * Field descriptor (offset) for struct member 'reset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__reset);
	 * CPointer&lt;Short&gt; p_reset = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reset'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reset = new long[]{136, 140};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__pad);
	 * CPointer&lt;Short&gt; p_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{138, 142};

	/**
	 * Field descriptor (offset) for struct member 'effector_weights'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__effector_weights);
	 * CPointer&lt;CPointer&lt;EffectorWeights&gt;&gt; p_effector_weights = p.cast(new Class[]{CPointer.class, EffectorWeights.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effector_weights'</li>
	 * <li>Signature: 'EffectorWeights*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effector_weights = new long[]{140, 144};

	public ClothSimSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ClothSimSettings(ClothSimSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'cache'.
	 * @see #__DNA__FIELD__cache
	 */
	
	public CPointer<Object> getCache() throws IOException
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
	 * Set method for struct member 'cache'.
	 * @see #__DNA__FIELD__cache
	 */
	
	public void setCache(CPointer<Object> cache) throws IOException
	{
		long __address = ((cache == null) ? 0 : cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'mingoal'.
	 * @see #__DNA__FIELD__mingoal
	 */
	
	public float getMingoal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'mingoal'.
	 * @see #__DNA__FIELD__mingoal
	 */
	
	public void setMingoal(float mingoal) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, mingoal);
		} else {
			__io__block.writeFloat(__io__address + 4, mingoal);
		}
	}

	/**
	 * Get method for struct member 'Cdis'.
	 * @see #__DNA__FIELD__Cdis
	 */
	
	public float getCdis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'Cdis'.
	 * @see #__DNA__FIELD__Cdis
	 */
	
	public void setCdis(float Cdis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, Cdis);
		} else {
			__io__block.writeFloat(__io__address + 8, Cdis);
		}
	}

	/**
	 * Get method for struct member 'Cvi'.
	 * @see #__DNA__FIELD__Cvi
	 */
	
	public float getCvi() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'Cvi'.
	 * @see #__DNA__FIELD__Cvi
	 */
	
	public void setCvi(float Cvi) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, Cvi);
		} else {
			__io__block.writeFloat(__io__address + 12, Cvi);
		}
	}

	/**
	 * Get method for struct member 'gravity'.
	 * @see #__DNA__FIELD__gravity
	 */
	
	public CArrayFacade<Float> getGravity() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gravity'.
	 * @see #__DNA__FIELD__gravity
	 */
	
	public void setGravity(CArrayFacade<Float> gravity) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(gravity, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gravity)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gravity);
		} else {
			__io__generic__copy( getGravity(), gravity);
		}
	}

	/**
	 * Get method for struct member 'dt'.
	 * @see #__DNA__FIELD__dt
	 */
	
	public float getDt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'dt'.
	 * @see #__DNA__FIELD__dt
	 */
	
	public void setDt(float dt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, dt);
		} else {
			__io__block.writeFloat(__io__address + 28, dt);
		}
	}

	/**
	 * Get method for struct member 'mass'.
	 * @see #__DNA__FIELD__mass
	 */
	
	public float getMass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'mass'.
	 * @see #__DNA__FIELD__mass
	 */
	
	public void setMass(float mass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, mass);
		} else {
			__io__block.writeFloat(__io__address + 32, mass);
		}
	}

	/**
	 * Get method for struct member 'structural'.
	 * @see #__DNA__FIELD__structural
	 */
	
	public float getStructural() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'structural'.
	 * @see #__DNA__FIELD__structural
	 */
	
	public void setStructural(float structural) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, structural);
		} else {
			__io__block.writeFloat(__io__address + 36, structural);
		}
	}

	/**
	 * Get method for struct member 'shear'.
	 * @see #__DNA__FIELD__shear
	 */
	
	public float getShear() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'shear'.
	 * @see #__DNA__FIELD__shear
	 */
	
	public void setShear(float shear) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, shear);
		} else {
			__io__block.writeFloat(__io__address + 40, shear);
		}
	}

	/**
	 * Get method for struct member 'bending'.
	 * @see #__DNA__FIELD__bending
	 */
	
	public float getBending() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'bending'.
	 * @see #__DNA__FIELD__bending
	 */
	
	public void setBending(float bending) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, bending);
		} else {
			__io__block.writeFloat(__io__address + 44, bending);
		}
	}

	/**
	 * Get method for struct member 'max_bend'.
	 * @see #__DNA__FIELD__max_bend
	 */
	
	public float getMax_bend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'max_bend'.
	 * @see #__DNA__FIELD__max_bend
	 */
	
	public void setMax_bend(float max_bend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, max_bend);
		} else {
			__io__block.writeFloat(__io__address + 48, max_bend);
		}
	}

	/**
	 * Get method for struct member 'max_struct'.
	 * @see #__DNA__FIELD__max_struct
	 */
	
	public float getMax_struct() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'max_struct'.
	 * @see #__DNA__FIELD__max_struct
	 */
	
	public void setMax_struct(float max_struct) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, max_struct);
		} else {
			__io__block.writeFloat(__io__address + 52, max_struct);
		}
	}

	/**
	 * Get method for struct member 'max_shear'.
	 * @see #__DNA__FIELD__max_shear
	 */
	
	public float getMax_shear() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'max_shear'.
	 * @see #__DNA__FIELD__max_shear
	 */
	
	public void setMax_shear(float max_shear) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, max_shear);
		} else {
			__io__block.writeFloat(__io__address + 56, max_shear);
		}
	}

	/**
	 * Get method for struct member 'avg_spring_len'.
	 * @see #__DNA__FIELD__avg_spring_len
	 */
	
	public float getAvg_spring_len() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'avg_spring_len'.
	 * @see #__DNA__FIELD__avg_spring_len
	 */
	
	public void setAvg_spring_len(float avg_spring_len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, avg_spring_len);
		} else {
			__io__block.writeFloat(__io__address + 60, avg_spring_len);
		}
	}

	/**
	 * Get method for struct member 'timescale'.
	 * @see #__DNA__FIELD__timescale
	 */
	
	public float getTimescale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'timescale'.
	 * @see #__DNA__FIELD__timescale
	 */
	
	public void setTimescale(float timescale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, timescale);
		} else {
			__io__block.writeFloat(__io__address + 64, timescale);
		}
	}

	/**
	 * Get method for struct member 'maxgoal'.
	 * @see #__DNA__FIELD__maxgoal
	 */
	
	public float getMaxgoal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'maxgoal'.
	 * @see #__DNA__FIELD__maxgoal
	 */
	
	public void setMaxgoal(float maxgoal) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, maxgoal);
		} else {
			__io__block.writeFloat(__io__address + 68, maxgoal);
		}
	}

	/**
	 * Get method for struct member 'eff_force_scale'.
	 * @see #__DNA__FIELD__eff_force_scale
	 */
	
	public float getEff_force_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'eff_force_scale'.
	 * @see #__DNA__FIELD__eff_force_scale
	 */
	
	public void setEff_force_scale(float eff_force_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, eff_force_scale);
		} else {
			__io__block.writeFloat(__io__address + 72, eff_force_scale);
		}
	}

	/**
	 * Get method for struct member 'eff_wind_scale'.
	 * @see #__DNA__FIELD__eff_wind_scale
	 */
	
	public float getEff_wind_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'eff_wind_scale'.
	 * @see #__DNA__FIELD__eff_wind_scale
	 */
	
	public void setEff_wind_scale(float eff_wind_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, eff_wind_scale);
		} else {
			__io__block.writeFloat(__io__address + 76, eff_wind_scale);
		}
	}

	/**
	 * Get method for struct member 'sim_time_old'.
	 * @see #__DNA__FIELD__sim_time_old
	 */
	
	public float getSim_time_old() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'sim_time_old'.
	 * @see #__DNA__FIELD__sim_time_old
	 */
	
	public void setSim_time_old(float sim_time_old) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, sim_time_old);
		} else {
			__io__block.writeFloat(__io__address + 80, sim_time_old);
		}
	}

	/**
	 * Get method for struct member 'defgoal'.
	 * @see #__DNA__FIELD__defgoal
	 */
	
	public float getDefgoal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'defgoal'.
	 * @see #__DNA__FIELD__defgoal
	 */
	
	public void setDefgoal(float defgoal) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, defgoal);
		} else {
			__io__block.writeFloat(__io__address + 84, defgoal);
		}
	}

	/**
	 * Get method for struct member 'goalspring'.
	 * @see #__DNA__FIELD__goalspring
	 */
	
	public float getGoalspring() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'goalspring'.
	 * @see #__DNA__FIELD__goalspring
	 */
	
	public void setGoalspring(float goalspring) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, goalspring);
		} else {
			__io__block.writeFloat(__io__address + 88, goalspring);
		}
	}

	/**
	 * Get method for struct member 'goalfrict'.
	 * @see #__DNA__FIELD__goalfrict
	 */
	
	public float getGoalfrict() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'goalfrict'.
	 * @see #__DNA__FIELD__goalfrict
	 */
	
	public void setGoalfrict(float goalfrict) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, goalfrict);
		} else {
			__io__block.writeFloat(__io__address + 92, goalfrict);
		}
	}

	/**
	 * Get method for struct member 'velocity_smooth'.
	 * @see #__DNA__FIELD__velocity_smooth
	 */
	
	public float getVelocity_smooth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'velocity_smooth'.
	 * @see #__DNA__FIELD__velocity_smooth
	 */
	
	public void setVelocity_smooth(float velocity_smooth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, velocity_smooth);
		} else {
			__io__block.writeFloat(__io__address + 96, velocity_smooth);
		}
	}

	/**
	 * Get method for struct member 'collider_friction'.
	 * @see #__DNA__FIELD__collider_friction
	 */
	
	public float getCollider_friction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'collider_friction'.
	 * @see #__DNA__FIELD__collider_friction
	 */
	
	public void setCollider_friction(float collider_friction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, collider_friction);
		} else {
			__io__block.writeFloat(__io__address + 100, collider_friction);
		}
	}

	/**
	 * Get method for struct member 'vel_damping'.
	 * @see #__DNA__FIELD__vel_damping
	 */
	
	public float getVel_damping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'vel_damping'.
	 * @see #__DNA__FIELD__vel_damping
	 */
	
	public void setVel_damping(float vel_damping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, vel_damping);
		} else {
			__io__block.writeFloat(__io__address + 104, vel_damping);
		}
	}

	/**
	 * Get method for struct member 'stepsPerFrame'.
	 * @see #__DNA__FIELD__stepsPerFrame
	 */
	
	public int getStepsPerFrame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 112);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'stepsPerFrame'.
	 * @see #__DNA__FIELD__stepsPerFrame
	 */
	
	public void setStepsPerFrame(int stepsPerFrame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 112, stepsPerFrame);
		} else {
			__io__block.writeInt(__io__address + 108, stepsPerFrame);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 116);
		} else {
			return __io__block.readInt(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 116, flags);
		} else {
			__io__block.writeInt(__io__address + 112, flags);
		}
	}

	/**
	 * Get method for struct member 'preroll'.
	 * @see #__DNA__FIELD__preroll
	 */
	
	public int getPreroll() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 120);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'preroll'.
	 * @see #__DNA__FIELD__preroll
	 */
	
	public void setPreroll(int preroll) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 120, preroll);
		} else {
			__io__block.writeInt(__io__address + 116, preroll);
		}
	}

	/**
	 * Get method for struct member 'maxspringlen'.
	 * @see #__DNA__FIELD__maxspringlen
	 */
	
	public int getMaxspringlen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 124);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'maxspringlen'.
	 * @see #__DNA__FIELD__maxspringlen
	 */
	
	public void setMaxspringlen(int maxspringlen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 124, maxspringlen);
		} else {
			__io__block.writeInt(__io__address + 120, maxspringlen);
		}
	}

	/**
	 * Get method for struct member 'solver_type'.
	 * @see #__DNA__FIELD__solver_type
	 */
	
	public short getSolver_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 128);
		} else {
			return __io__block.readShort(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'solver_type'.
	 * @see #__DNA__FIELD__solver_type
	 */
	
	public void setSolver_type(short solver_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 128, solver_type);
		} else {
			__io__block.writeShort(__io__address + 124, solver_type);
		}
	}

	/**
	 * Get method for struct member 'vgroup_bend'.
	 * @see #__DNA__FIELD__vgroup_bend
	 */
	
	public short getVgroup_bend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 130);
		} else {
			return __io__block.readShort(__io__address + 126);
		}
	}

	/**
	 * Set method for struct member 'vgroup_bend'.
	 * @see #__DNA__FIELD__vgroup_bend
	 */
	
	public void setVgroup_bend(short vgroup_bend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 130, vgroup_bend);
		} else {
			__io__block.writeShort(__io__address + 126, vgroup_bend);
		}
	}

	/**
	 * Get method for struct member 'vgroup_mass'.
	 * @see #__DNA__FIELD__vgroup_mass
	 */
	
	public short getVgroup_mass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 132);
		} else {
			return __io__block.readShort(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'vgroup_mass'.
	 * @see #__DNA__FIELD__vgroup_mass
	 */
	
	public void setVgroup_mass(short vgroup_mass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 132, vgroup_mass);
		} else {
			__io__block.writeShort(__io__address + 128, vgroup_mass);
		}
	}

	/**
	 * Get method for struct member 'vgroup_struct'.
	 * @see #__DNA__FIELD__vgroup_struct
	 */
	
	public short getVgroup_struct() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 134);
		} else {
			return __io__block.readShort(__io__address + 130);
		}
	}

	/**
	 * Set method for struct member 'vgroup_struct'.
	 * @see #__DNA__FIELD__vgroup_struct
	 */
	
	public void setVgroup_struct(short vgroup_struct) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 134, vgroup_struct);
		} else {
			__io__block.writeShort(__io__address + 130, vgroup_struct);
		}
	}

	/**
	 * Get method for struct member 'shapekey_rest'.
	 * @see #__DNA__FIELD__shapekey_rest
	 */
	
	public short getShapekey_rest() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 136);
		} else {
			return __io__block.readShort(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'shapekey_rest'.
	 * @see #__DNA__FIELD__shapekey_rest
	 */
	
	public void setShapekey_rest(short shapekey_rest) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 136, shapekey_rest);
		} else {
			__io__block.writeShort(__io__address + 132, shapekey_rest);
		}
	}

	/**
	 * Get method for struct member 'presets'.
	 * @see #__DNA__FIELD__presets
	 */
	
	public short getPresets() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 138);
		} else {
			return __io__block.readShort(__io__address + 134);
		}
	}

	/**
	 * Set method for struct member 'presets'.
	 * @see #__DNA__FIELD__presets
	 */
	
	public void setPresets(short presets) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 138, presets);
		} else {
			__io__block.writeShort(__io__address + 134, presets);
		}
	}

	/**
	 * Get method for struct member 'reset'.
	 * @see #__DNA__FIELD__reset
	 */
	
	public short getReset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 140);
		} else {
			return __io__block.readShort(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'reset'.
	 * @see #__DNA__FIELD__reset
	 */
	
	public void setReset(short reset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 140, reset);
		} else {
			__io__block.writeShort(__io__address + 136, reset);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public short getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 142);
		} else {
			return __io__block.readShort(__io__address + 138);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(short pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 142, pad);
		} else {
			__io__block.writeShort(__io__address + 138, pad);
		}
	}

	/**
	 * Get method for struct member 'effector_weights'.
	 * @see #__DNA__FIELD__effector_weights
	 */
	
	public CPointer<EffectorWeights> getEffector_weights() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{EffectorWeights.class};
		return new CPointer<EffectorWeights>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, EffectorWeights.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'effector_weights'.
	 * @see #__DNA__FIELD__effector_weights
	 */
	
	public void setEffector_weights(CPointer<EffectorWeights> effector_weights) throws IOException
	{
		long __address = ((effector_weights == null) ? 0 : effector_weights.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ClothSimSettings> __io__addressof() {
		return new CPointer<ClothSimSettings>(__io__address, new Class[]{ClothSimSettings.class}, __io__block, __io__blockTable);
	}

}
