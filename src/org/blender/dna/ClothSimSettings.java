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
 * <h4>Blender Source Code:</h4>
 * <p> This struct contains all the global data required to run a simulation. At the time of this writing, this structure contains data appropriate to run a simulation as described in Deformation Constraints in a Mass-Spring Model to Describe Rigid Cloth Behavior by Xavier Provot.</p><p> I've tried to keep similar, if not exact names for the variables as are presented in the paper. Where I've changed the concept slightly, as in stepsPerFrame compared to the time step in the paper, I've used variables with different names to minimize confusion. </p>
 */

@CMetaData(size32=184, size64=192)
public class ClothSimSettings extends CFacade {

	/**
	 * This is the sdna index of the struct ClothSimSettings.
	 * <p>
	 * It is required when allocating a new block to store data for ClothSimSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 483;

	/**
	 * Field descriptor (offset) for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> UNUSED atm </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> see SB </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mechanical damping of springs. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Viscous/fluid damping. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gravity/external force vector. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> This is the duration of our time step, computed. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The mass of the entire cloth. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Structural spring stiffness. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shear spring stiffness. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flexion spring stiffness. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max bending scaling value, min is "bending" </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max structural scaling value, min is "structural" </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max shear scaling value, UNUSED </p>
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
	 * Field descriptor (offset) for struct member 'max_sewing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max sewing force </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__max_sewing);
	 * CPointer&lt;Float&gt; p_max_sewing = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_sewing'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_sewing = new long[]{60, 64};

	/**
	 * Field descriptor (offset) for struct member 'avg_spring_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used for normalized springs </p>
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
	public static final long[] __DNA__FIELD__avg_spring_len = new long[]{64, 68};

	/**
	 * Field descriptor (offset) for struct member 'timescale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> parameter how fast cloth runs </p>
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
	public static final long[] __DNA__FIELD__timescale = new long[]{68, 72};

	/**
	 * Field descriptor (offset) for struct member 'time_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multiplies cloth speed </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__time_scale);
	 * CPointer&lt;Float&gt; p_time_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_scale = new long[]{72, 76};

	/**
	 * Field descriptor (offset) for struct member 'maxgoal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> see SB </p>
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
	public static final long[] __DNA__FIELD__maxgoal = new long[]{76, 80};

	/**
	 * Field descriptor (offset) for struct member 'eff_force_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Scaling of effector forces (see softbody_calc_forces). </p>
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
	public static final long[] __DNA__FIELD__eff_force_scale = new long[]{80, 84};

	/**
	 * Field descriptor (offset) for struct member 'eff_wind_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Scaling of effector wind (see softbody_calc_forces). </p>
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
	public static final long[] __DNA__FIELD__eff_wind_scale = new long[]{84, 88};

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
	public static final long[] __DNA__FIELD__sim_time_old = new long[]{88, 92};

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
	public static final long[] __DNA__FIELD__defgoal = new long[]{92, 96};

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
	public static final long[] __DNA__FIELD__goalspring = new long[]{96, 100};

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
	public static final long[] __DNA__FIELD__goalfrict = new long[]{100, 104};

	/**
	 * Field descriptor (offset) for struct member 'velocity_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> smoothing of velocities for hair </p>
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
	public static final long[] __DNA__FIELD__velocity_smooth = new long[]{104, 108};

	/**
	 * Field descriptor (offset) for struct member 'density_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> minimum density for hair </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__density_target);
	 * CPointer&lt;Float&gt; p_density_target = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'density_target'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__density_target = new long[]{108, 112};

	/**
	 * Field descriptor (offset) for struct member 'density_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> influence of hair density </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__density_strength);
	 * CPointer&lt;Float&gt; p_density_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'density_strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__density_strength = new long[]{112, 116};

	/**
	 * Field descriptor (offset) for struct member 'collider_friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> friction with colliders </p>
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
	public static final long[] __DNA__FIELD__collider_friction = new long[]{116, 120};

	/**
	 * Field descriptor (offset) for struct member 'vel_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> damp the velocity to speed up getting to the resting position </p>
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
	public static final long[] __DNA__FIELD__vel_damping = new long[]{120, 124};

	/**
	 * Field descriptor (offset) for struct member 'shrink_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> min amount to shrink cloth by 0.0f (no shrink) - 1.0f (shrink to nothing) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__shrink_min);
	 * CPointer&lt;Float&gt; p_shrink_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shrink_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shrink_min = new long[]{124, 128};

	/**
	 * Field descriptor (offset) for struct member 'shrink_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max amount to shrink cloth by 0.0f (no shrink) - 1.0f (shrink to nothing) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__shrink_max);
	 * CPointer&lt;Float&gt; p_shrink_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shrink_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shrink_max = new long[]{128, 132};

	/**
	 * Field descriptor (offset) for struct member 'bending_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX various hair stuff should really be separate, this struct is a horrible mess alreadydamping of bending springs </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__bending_damping);
	 * CPointer&lt;Float&gt; p_bending_damping = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bending_damping'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bending_damping = new long[]{132, 136};

	/**
	 * Field descriptor (offset) for struct member 'voxel_cell_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of voxel grid cells for continuum dynamics </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__voxel_cell_size);
	 * CPointer&lt;Float&gt; p_voxel_cell_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'voxel_cell_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__voxel_cell_size = new long[]{136, 140};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{140, 144};

	/**
	 * Field descriptor (offset) for struct member 'stepsPerFrame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of time steps per frame. </p>
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
	public static final long[] __DNA__FIELD__stepsPerFrame = new long[]{144, 148};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags, see CSIMSETT_FLAGS enum above. </p>
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
	public static final long[] __DNA__FIELD__flags = new long[]{148, 152};

	/**
	 * Field descriptor (offset) for struct member 'preroll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> How many frames of simulation to do before we start. </p>
	 * @deprecated
	 *  DeprecatedHow many frames of simulation to do before we start. </p>
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
	public static final long[] __DNA__FIELD__preroll = new long[]{152, 156};

	/**
	 * Field descriptor (offset) for struct member 'maxspringlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in percent!; if tearing enabled, a spring will get cut </p>
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
	public static final long[] __DNA__FIELD__maxspringlen = new long[]{156, 160};

	/**
	 * Field descriptor (offset) for struct member 'solver_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> which solver should be used? txold </p>
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
	public static final long[] __DNA__FIELD__solver_type = new long[]{160, 164};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_bend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex group for scaling bending stiffness </p>
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
	public static final long[] __DNA__FIELD__vgroup_bend = new long[]{162, 166};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> optional vertexgroup name for assigning weight. </p>
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
	public static final long[] __DNA__FIELD__vgroup_mass = new long[]{164, 168};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_struct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex group for scaling structural stiffness </p>
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
	public static final long[] __DNA__FIELD__vgroup_struct = new long[]{166, 170};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_shrink'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex group for shrinking cloth </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__vgroup_shrink);
	 * CPointer&lt;Short&gt; p_vgroup_shrink = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_shrink'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_shrink = new long[]{168, 172};

	/**
	 * Field descriptor (offset) for struct member 'shapekey_rest'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex group for scaling structural stiffness </p>
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
	public static final long[] __DNA__FIELD__shapekey_rest = new long[]{170, 174};

	/**
	 * Field descriptor (offset) for struct member 'presets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used for presets on GUI </p>
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
	public static final long[] __DNA__FIELD__presets = new long[]{172, 176};

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
	public static final long[] __DNA__FIELD__reset = new long[]{174, 178};

	/**
	 * Field descriptor (offset) for struct member 'pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad0'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad0 = new long[]{176, 180};

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
	public static final long[] __DNA__FIELD__effector_weights = new long[]{180, 184};

	public ClothSimSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ClothSimSettings(ClothSimSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> UNUSED atm </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> UNUSED atm </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> see SB </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> see SB </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mechanical damping of springs. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mechanical damping of springs. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Viscous/fluid damping. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Viscous/fluid damping. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gravity/external force vector. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gravity/external force vector. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> This is the duration of our time step, computed. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> This is the duration of our time step, computed. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The mass of the entire cloth. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The mass of the entire cloth. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Structural spring stiffness. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Structural spring stiffness. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shear spring stiffness. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shear spring stiffness. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flexion spring stiffness. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flexion spring stiffness. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max bending scaling value, min is "bending" </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max bending scaling value, min is "bending" </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max structural scaling value, min is "structural" </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max structural scaling value, min is "structural" </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max shear scaling value, UNUSED </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max shear scaling value, UNUSED </p>
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
	 * Get method for struct member 'max_sewing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max sewing force </p>
	 * @see #__DNA__FIELD__max_sewing
	 */
	
	public float getMax_sewing() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'max_sewing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max sewing force </p>
	 * @see #__DNA__FIELD__max_sewing
	 */
	
	public void setMax_sewing(float max_sewing) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, max_sewing);
		} else {
			__io__block.writeFloat(__io__address + 60, max_sewing);
		}
	}

	/**
	 * Get method for struct member 'avg_spring_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used for normalized springs </p>
	 * @see #__DNA__FIELD__avg_spring_len
	 */
	
	public float getAvg_spring_len() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'avg_spring_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used for normalized springs </p>
	 * @see #__DNA__FIELD__avg_spring_len
	 */
	
	public void setAvg_spring_len(float avg_spring_len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, avg_spring_len);
		} else {
			__io__block.writeFloat(__io__address + 64, avg_spring_len);
		}
	}

	/**
	 * Get method for struct member 'timescale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> parameter how fast cloth runs </p>
	 * @see #__DNA__FIELD__timescale
	 */
	
	public float getTimescale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'timescale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> parameter how fast cloth runs </p>
	 * @see #__DNA__FIELD__timescale
	 */
	
	public void setTimescale(float timescale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, timescale);
		} else {
			__io__block.writeFloat(__io__address + 68, timescale);
		}
	}

	/**
	 * Get method for struct member 'time_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multiplies cloth speed </p>
	 * @see #__DNA__FIELD__time_scale
	 */
	
	public float getTime_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'time_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multiplies cloth speed </p>
	 * @see #__DNA__FIELD__time_scale
	 */
	
	public void setTime_scale(float time_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, time_scale);
		} else {
			__io__block.writeFloat(__io__address + 72, time_scale);
		}
	}

	/**
	 * Get method for struct member 'maxgoal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> see SB </p>
	 * @see #__DNA__FIELD__maxgoal
	 */
	
	public float getMaxgoal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'maxgoal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> see SB </p>
	 * @see #__DNA__FIELD__maxgoal
	 */
	
	public void setMaxgoal(float maxgoal) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, maxgoal);
		} else {
			__io__block.writeFloat(__io__address + 76, maxgoal);
		}
	}

	/**
	 * Get method for struct member 'eff_force_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Scaling of effector forces (see softbody_calc_forces). </p>
	 * @see #__DNA__FIELD__eff_force_scale
	 */
	
	public float getEff_force_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'eff_force_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Scaling of effector forces (see softbody_calc_forces). </p>
	 * @see #__DNA__FIELD__eff_force_scale
	 */
	
	public void setEff_force_scale(float eff_force_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, eff_force_scale);
		} else {
			__io__block.writeFloat(__io__address + 80, eff_force_scale);
		}
	}

	/**
	 * Get method for struct member 'eff_wind_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Scaling of effector wind (see softbody_calc_forces). </p>
	 * @see #__DNA__FIELD__eff_wind_scale
	 */
	
	public float getEff_wind_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'eff_wind_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Scaling of effector wind (see softbody_calc_forces). </p>
	 * @see #__DNA__FIELD__eff_wind_scale
	 */
	
	public void setEff_wind_scale(float eff_wind_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, eff_wind_scale);
		} else {
			__io__block.writeFloat(__io__address + 84, eff_wind_scale);
		}
	}

	/**
	 * Get method for struct member 'sim_time_old'.
	 * @see #__DNA__FIELD__sim_time_old
	 */
	
	public float getSim_time_old() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'sim_time_old'.
	 * @see #__DNA__FIELD__sim_time_old
	 */
	
	public void setSim_time_old(float sim_time_old) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, sim_time_old);
		} else {
			__io__block.writeFloat(__io__address + 88, sim_time_old);
		}
	}

	/**
	 * Get method for struct member 'defgoal'.
	 * @see #__DNA__FIELD__defgoal
	 */
	
	public float getDefgoal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'defgoal'.
	 * @see #__DNA__FIELD__defgoal
	 */
	
	public void setDefgoal(float defgoal) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, defgoal);
		} else {
			__io__block.writeFloat(__io__address + 92, defgoal);
		}
	}

	/**
	 * Get method for struct member 'goalspring'.
	 * @see #__DNA__FIELD__goalspring
	 */
	
	public float getGoalspring() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'goalspring'.
	 * @see #__DNA__FIELD__goalspring
	 */
	
	public void setGoalspring(float goalspring) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, goalspring);
		} else {
			__io__block.writeFloat(__io__address + 96, goalspring);
		}
	}

	/**
	 * Get method for struct member 'goalfrict'.
	 * @see #__DNA__FIELD__goalfrict
	 */
	
	public float getGoalfrict() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'goalfrict'.
	 * @see #__DNA__FIELD__goalfrict
	 */
	
	public void setGoalfrict(float goalfrict) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, goalfrict);
		} else {
			__io__block.writeFloat(__io__address + 100, goalfrict);
		}
	}

	/**
	 * Get method for struct member 'velocity_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> smoothing of velocities for hair </p>
	 * @see #__DNA__FIELD__velocity_smooth
	 */
	
	public float getVelocity_smooth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'velocity_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> smoothing of velocities for hair </p>
	 * @see #__DNA__FIELD__velocity_smooth
	 */
	
	public void setVelocity_smooth(float velocity_smooth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, velocity_smooth);
		} else {
			__io__block.writeFloat(__io__address + 104, velocity_smooth);
		}
	}

	/**
	 * Get method for struct member 'density_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> minimum density for hair </p>
	 * @see #__DNA__FIELD__density_target
	 */
	
	public float getDensity_target() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'density_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> minimum density for hair </p>
	 * @see #__DNA__FIELD__density_target
	 */
	
	public void setDensity_target(float density_target) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, density_target);
		} else {
			__io__block.writeFloat(__io__address + 108, density_target);
		}
	}

	/**
	 * Get method for struct member 'density_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> influence of hair density </p>
	 * @see #__DNA__FIELD__density_strength
	 */
	
	public float getDensity_strength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'density_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> influence of hair density </p>
	 * @see #__DNA__FIELD__density_strength
	 */
	
	public void setDensity_strength(float density_strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, density_strength);
		} else {
			__io__block.writeFloat(__io__address + 112, density_strength);
		}
	}

	/**
	 * Get method for struct member 'collider_friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> friction with colliders </p>
	 * @see #__DNA__FIELD__collider_friction
	 */
	
	public float getCollider_friction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'collider_friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> friction with colliders </p>
	 * @see #__DNA__FIELD__collider_friction
	 */
	
	public void setCollider_friction(float collider_friction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, collider_friction);
		} else {
			__io__block.writeFloat(__io__address + 116, collider_friction);
		}
	}

	/**
	 * Get method for struct member 'vel_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> damp the velocity to speed up getting to the resting position </p>
	 * @see #__DNA__FIELD__vel_damping
	 */
	
	public float getVel_damping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'vel_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> damp the velocity to speed up getting to the resting position </p>
	 * @see #__DNA__FIELD__vel_damping
	 */
	
	public void setVel_damping(float vel_damping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, vel_damping);
		} else {
			__io__block.writeFloat(__io__address + 120, vel_damping);
		}
	}

	/**
	 * Get method for struct member 'shrink_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> min amount to shrink cloth by 0.0f (no shrink) - 1.0f (shrink to nothing) </p>
	 * @see #__DNA__FIELD__shrink_min
	 */
	
	public float getShrink_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 128);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'shrink_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> min amount to shrink cloth by 0.0f (no shrink) - 1.0f (shrink to nothing) </p>
	 * @see #__DNA__FIELD__shrink_min
	 */
	
	public void setShrink_min(float shrink_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 128, shrink_min);
		} else {
			__io__block.writeFloat(__io__address + 124, shrink_min);
		}
	}

	/**
	 * Get method for struct member 'shrink_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max amount to shrink cloth by 0.0f (no shrink) - 1.0f (shrink to nothing) </p>
	 * @see #__DNA__FIELD__shrink_max
	 */
	
	public float getShrink_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 132);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'shrink_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max amount to shrink cloth by 0.0f (no shrink) - 1.0f (shrink to nothing) </p>
	 * @see #__DNA__FIELD__shrink_max
	 */
	
	public void setShrink_max(float shrink_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 132, shrink_max);
		} else {
			__io__block.writeFloat(__io__address + 128, shrink_max);
		}
	}

	/**
	 * Get method for struct member 'bending_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX various hair stuff should really be separate, this struct is a horrible mess alreadydamping of bending springs </p>
	 * @see #__DNA__FIELD__bending_damping
	 */
	
	public float getBending_damping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 136);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'bending_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX various hair stuff should really be separate, this struct is a horrible mess alreadydamping of bending springs </p>
	 * @see #__DNA__FIELD__bending_damping
	 */
	
	public void setBending_damping(float bending_damping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 136, bending_damping);
		} else {
			__io__block.writeFloat(__io__address + 132, bending_damping);
		}
	}

	/**
	 * Get method for struct member 'voxel_cell_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of voxel grid cells for continuum dynamics </p>
	 * @see #__DNA__FIELD__voxel_cell_size
	 */
	
	public float getVoxel_cell_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'voxel_cell_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of voxel grid cells for continuum dynamics </p>
	 * @see #__DNA__FIELD__voxel_cell_size
	 */
	
	public void setVoxel_cell_size(float voxel_cell_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, voxel_cell_size);
		} else {
			__io__block.writeFloat(__io__address + 136, voxel_cell_size);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 144);
		} else {
			return __io__block.readInt(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 144, pad);
		} else {
			__io__block.writeInt(__io__address + 140, pad);
		}
	}

	/**
	 * Get method for struct member 'stepsPerFrame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of time steps per frame. </p>
	 * @see #__DNA__FIELD__stepsPerFrame
	 */
	
	public int getStepsPerFrame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 148);
		} else {
			return __io__block.readInt(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'stepsPerFrame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of time steps per frame. </p>
	 * @see #__DNA__FIELD__stepsPerFrame
	 */
	
	public void setStepsPerFrame(int stepsPerFrame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 148, stepsPerFrame);
		} else {
			__io__block.writeInt(__io__address + 144, stepsPerFrame);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags, see CSIMSETT_FLAGS enum above. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 152);
		} else {
			return __io__block.readInt(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags, see CSIMSETT_FLAGS enum above. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 152, flags);
		} else {
			__io__block.writeInt(__io__address + 148, flags);
		}
	}

	/**
	 * Get method for struct member 'preroll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> How many frames of simulation to do before we start. </p>
	 * @deprecated
	 *  DeprecatedHow many frames of simulation to do before we start. </p>
	 * @see #__DNA__FIELD__preroll
	 */
	
	public int getPreroll() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 156);
		} else {
			return __io__block.readInt(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'preroll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> How many frames of simulation to do before we start. </p>
	 * @deprecated
	 *  DeprecatedHow many frames of simulation to do before we start. </p>
	 * @see #__DNA__FIELD__preroll
	 */
	
	public void setPreroll(int preroll) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 156, preroll);
		} else {
			__io__block.writeInt(__io__address + 152, preroll);
		}
	}

	/**
	 * Get method for struct member 'maxspringlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in percent!; if tearing enabled, a spring will get cut </p>
	 * @see #__DNA__FIELD__maxspringlen
	 */
	
	public int getMaxspringlen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 160);
		} else {
			return __io__block.readInt(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'maxspringlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in percent!; if tearing enabled, a spring will get cut </p>
	 * @see #__DNA__FIELD__maxspringlen
	 */
	
	public void setMaxspringlen(int maxspringlen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 160, maxspringlen);
		} else {
			__io__block.writeInt(__io__address + 156, maxspringlen);
		}
	}

	/**
	 * Get method for struct member 'solver_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> which solver should be used? txold </p>
	 * @see #__DNA__FIELD__solver_type
	 */
	
	public short getSolver_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 164);
		} else {
			return __io__block.readShort(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'solver_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> which solver should be used? txold </p>
	 * @see #__DNA__FIELD__solver_type
	 */
	
	public void setSolver_type(short solver_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 164, solver_type);
		} else {
			__io__block.writeShort(__io__address + 160, solver_type);
		}
	}

	/**
	 * Get method for struct member 'vgroup_bend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex group for scaling bending stiffness </p>
	 * @see #__DNA__FIELD__vgroup_bend
	 */
	
	public short getVgroup_bend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 166);
		} else {
			return __io__block.readShort(__io__address + 162);
		}
	}

	/**
	 * Set method for struct member 'vgroup_bend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex group for scaling bending stiffness </p>
	 * @see #__DNA__FIELD__vgroup_bend
	 */
	
	public void setVgroup_bend(short vgroup_bend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 166, vgroup_bend);
		} else {
			__io__block.writeShort(__io__address + 162, vgroup_bend);
		}
	}

	/**
	 * Get method for struct member 'vgroup_mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> optional vertexgroup name for assigning weight. </p>
	 * @see #__DNA__FIELD__vgroup_mass
	 */
	
	public short getVgroup_mass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 168);
		} else {
			return __io__block.readShort(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'vgroup_mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> optional vertexgroup name for assigning weight. </p>
	 * @see #__DNA__FIELD__vgroup_mass
	 */
	
	public void setVgroup_mass(short vgroup_mass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 168, vgroup_mass);
		} else {
			__io__block.writeShort(__io__address + 164, vgroup_mass);
		}
	}

	/**
	 * Get method for struct member 'vgroup_struct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex group for scaling structural stiffness </p>
	 * @see #__DNA__FIELD__vgroup_struct
	 */
	
	public short getVgroup_struct() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 170);
		} else {
			return __io__block.readShort(__io__address + 166);
		}
	}

	/**
	 * Set method for struct member 'vgroup_struct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex group for scaling structural stiffness </p>
	 * @see #__DNA__FIELD__vgroup_struct
	 */
	
	public void setVgroup_struct(short vgroup_struct) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 170, vgroup_struct);
		} else {
			__io__block.writeShort(__io__address + 166, vgroup_struct);
		}
	}

	/**
	 * Get method for struct member 'vgroup_shrink'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex group for shrinking cloth </p>
	 * @see #__DNA__FIELD__vgroup_shrink
	 */
	
	public short getVgroup_shrink() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 172);
		} else {
			return __io__block.readShort(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'vgroup_shrink'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex group for shrinking cloth </p>
	 * @see #__DNA__FIELD__vgroup_shrink
	 */
	
	public void setVgroup_shrink(short vgroup_shrink) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 172, vgroup_shrink);
		} else {
			__io__block.writeShort(__io__address + 168, vgroup_shrink);
		}
	}

	/**
	 * Get method for struct member 'shapekey_rest'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex group for scaling structural stiffness </p>
	 * @see #__DNA__FIELD__shapekey_rest
	 */
	
	public short getShapekey_rest() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 174);
		} else {
			return __io__block.readShort(__io__address + 170);
		}
	}

	/**
	 * Set method for struct member 'shapekey_rest'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex group for scaling structural stiffness </p>
	 * @see #__DNA__FIELD__shapekey_rest
	 */
	
	public void setShapekey_rest(short shapekey_rest) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 174, shapekey_rest);
		} else {
			__io__block.writeShort(__io__address + 170, shapekey_rest);
		}
	}

	/**
	 * Get method for struct member 'presets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used for presets on GUI </p>
	 * @see #__DNA__FIELD__presets
	 */
	
	public short getPresets() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 176);
		} else {
			return __io__block.readShort(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'presets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used for presets on GUI </p>
	 * @see #__DNA__FIELD__presets
	 */
	
	public void setPresets(short presets) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 176, presets);
		} else {
			__io__block.writeShort(__io__address + 172, presets);
		}
	}

	/**
	 * Get method for struct member 'reset'.
	 * @see #__DNA__FIELD__reset
	 */
	
	public short getReset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 178);
		} else {
			return __io__block.readShort(__io__address + 174);
		}
	}

	/**
	 * Set method for struct member 'reset'.
	 * @see #__DNA__FIELD__reset
	 */
	
	public void setReset(short reset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 178, reset);
		} else {
			__io__block.writeShort(__io__address + 174, reset);
		}
	}

	/**
	 * Get method for struct member 'pad0'.
	 * @see #__DNA__FIELD__pad0
	 */
	
	public CArrayFacade<Byte> getPad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad0'.
	 * @see #__DNA__FIELD__pad0
	 */
	
	public void setPad0(CArrayFacade<Byte> pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 180;
		} else {
			__dna__offset = 176;
		}
		if (__io__equals(pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad0);
		} else {
			__io__generic__copy( getPad0(), pad0);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 180);
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
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 180, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ClothSimSettings> __io__addressof() {
		return new CPointer<ClothSimSettings>(__io__address, new Class[]{ClothSimSettings.class}, __io__block, __io__blockTable);
	}

}
