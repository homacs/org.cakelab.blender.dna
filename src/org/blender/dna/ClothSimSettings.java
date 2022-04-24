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

@CMetaData(size32=264, size64=272)
public class ClothSimSettings extends CFacade {

	/**
	 * This is the sdna index of the struct ClothSimSettings.
	 * <p>
	 * It is required when allocating a new block to store data for ClothSimSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 581;

	/**
	 * Field descriptor (offset) for struct member 'cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> UNUSED. </p>
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
	 * <p> See SB. </p>
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
	 * <p> Mechanical damping of springs. 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <p> Structural spring stiffness. 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <p> Max bending scaling value, min is "bending". </p>
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
	 * <p> Max structural scaling value, min is "structural". 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <p> Max shear scaling value. </p>
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
	 * <p> Max sewing force. </p>
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
	 * <p> Used for normalized springs. </p>
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
	 * <p> Parameter how fast cloth runs. </p>
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
	 * <p> Multiplies cloth speed. </p>
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
	 * <p> See SB. </p>
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
	 * <p> Scaling of effector forces (see #softbody_calc_forces). </p>
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
	 * <p> Scaling of effector wind (see #softbody_calc_forces). </p>
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
	 * <p> Smoothing of velocities for hair. </p>
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
	 * <p> Minimum density for hair. </p>
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
	 * <p> Influence of hair density. </p>
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
	 * <p> Friction with colliders. </p>
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
	 * <p> Damp the velocity to speed up getting to the resting position. 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <p> Min amount to shrink cloth by 0.0f (no shrink), 1.0f (shrink to nothing), -1.0f (double the edge length). </p>
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
	 * <p> Max amount to shrink cloth by 0.0f (no shrink), 1.0f (shrink to nothing), -1.0f (double the edge length). </p>
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
	 * Field descriptor (offset) for struct member 'uniform_pressure_force'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Air pressure The uniform pressure that is constantly applied to the mesh. Can be negative. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__uniform_pressure_force);
	 * CPointer&lt;Float&gt; p_uniform_pressure_force = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uniform_pressure_force'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uniform_pressure_force = new long[]{132, 136};

	/**
	 * Field descriptor (offset) for struct member 'target_volume'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User set volume. This is the volume the mesh wants to expand to (the equilibrium volume). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__target_volume);
	 * CPointer&lt;Float&gt; p_target_volume = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'target_volume'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__target_volume = new long[]{136, 140};

	/**
	 * Field descriptor (offset) for struct member 'pressure_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__pressure_factor);
	 * CPointer&lt;Float&gt; p_pressure_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pressure_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pressure_factor = new long[]{140, 144};

	/**
	 * Field descriptor (offset) for struct member 'fluid_density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Density of the fluid inside or outside the object for use in the hydro-static pressure gradient. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__fluid_density);
	 * CPointer&lt;Float&gt; p_fluid_density = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluid_density'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluid_density = new long[]{144, 148};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_pressure'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__vgroup_pressure);
	 * CPointer&lt;Short&gt; p_vgroup_pressure = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_pressure'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_pressure = new long[]{148, 152};

	/**
	 * Field descriptor (offset) for struct member '_pad7'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD___pad7);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad7 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad7'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad7 = new long[]{150, 154};

	/**
	 * Field descriptor (offset) for struct member 'bending_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX various hair stuff should really be separate, this struct is a horrible mess already Damping of bending springs. </p>
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
	public static final long[] __DNA__FIELD__bending_damping = new long[]{156, 160};

	/**
	 * Field descriptor (offset) for struct member 'voxel_cell_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of voxel grid cells for continuum dynamics. </p>
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
	public static final long[] __DNA__FIELD__voxel_cell_size = new long[]{160, 164};

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
	public static final long[] __DNA__FIELD__stepsPerFrame = new long[]{164, 168};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags, see CSIMSETT_FLAGS enum above. </p>
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
	public static final long[] __DNA__FIELD__flags = new long[]{168, 172};

	/**
	 * Field descriptor (offset) for struct member 'preroll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How many frames of simulation to do before we start. 
	 * @deprecated
	 *  Deprecated</p>
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
	public static final long[] __DNA__FIELD__preroll = new long[]{172, 176};

	/**
	 * Field descriptor (offset) for struct member 'maxspringlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In percent!; if tearing enabled, a spring will get cut. </p>
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
	public static final long[] __DNA__FIELD__maxspringlen = new long[]{176, 180};

	/**
	 * Field descriptor (offset) for struct member 'solver_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Which solver should be used? txold. </p>
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
	public static final long[] __DNA__FIELD__solver_type = new long[]{180, 184};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_bend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling bending stiffness. </p>
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
	public static final long[] __DNA__FIELD__vgroup_bend = new long[]{182, 186};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name for assigning weight. </p>
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
	public static final long[] __DNA__FIELD__vgroup_mass = new long[]{184, 188};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_struct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling structural stiffness. </p>
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
	public static final long[] __DNA__FIELD__vgroup_struct = new long[]{186, 190};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_shrink'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for shrinking cloth. </p>
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
	public static final long[] __DNA__FIELD__vgroup_shrink = new long[]{188, 192};

	/**
	 * Field descriptor (offset) for struct member 'shapekey_rest'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling structural stiffness. </p>
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
	public static final long[] __DNA__FIELD__shapekey_rest = new long[]{190, 194};

	/**
	 * Field descriptor (offset) for struct member 'presets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for presets on GUI. </p>
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
	public static final long[] __DNA__FIELD__presets = new long[]{192, 196};

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
	public static final long[] __DNA__FIELD__reset = new long[]{194, 198};

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
	public static final long[] __DNA__FIELD__effector_weights = new long[]{196, 200};

	/**
	 * Field descriptor (offset) for struct member 'bending_model'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__bending_model);
	 * CPointer&lt;Short&gt; p_bending_model = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bending_model'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bending_model = new long[]{200, 208};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_shear'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling structural stiffness. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__vgroup_shear);
	 * CPointer&lt;Short&gt; p_vgroup_shear = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_shear'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_shear = new long[]{202, 210};

	/**
	 * Field descriptor (offset) for struct member 'tension'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__tension);
	 * CPointer&lt;Float&gt; p_tension = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tension'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tension = new long[]{204, 212};

	/**
	 * Field descriptor (offset) for struct member 'compression'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__compression);
	 * CPointer&lt;Float&gt; p_compression = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'compression'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__compression = new long[]{208, 216};

	/**
	 * Field descriptor (offset) for struct member 'max_tension'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__max_tension);
	 * CPointer&lt;Float&gt; p_max_tension = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_tension'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_tension = new long[]{212, 220};

	/**
	 * Field descriptor (offset) for struct member 'max_compression'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__max_compression);
	 * CPointer&lt;Float&gt; p_max_compression = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_compression'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_compression = new long[]{216, 224};

	/**
	 * Field descriptor (offset) for struct member 'tension_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mechanical damping of tension springs. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__tension_damp);
	 * CPointer&lt;Float&gt; p_tension_damp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tension_damp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tension_damp = new long[]{220, 228};

	/**
	 * Field descriptor (offset) for struct member 'compression_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mechanical damping of compression springs. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__compression_damp);
	 * CPointer&lt;Float&gt; p_compression_damp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'compression_damp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__compression_damp = new long[]{224, 232};

	/**
	 * Field descriptor (offset) for struct member 'shear_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mechanical damping of shear springs. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__shear_damp);
	 * CPointer&lt;Float&gt; p_shear_damp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shear_damp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shear_damp = new long[]{228, 236};

	/**
	 * Field descriptor (offset) for struct member 'internal_spring_max_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The maximum length an internal spring can have during creation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__internal_spring_max_length);
	 * CPointer&lt;Float&gt; p_internal_spring_max_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'internal_spring_max_length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__internal_spring_max_length = new long[]{232, 240};

	/**
	 * Field descriptor (offset) for struct member 'internal_spring_max_diversion'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much the internal spring can diverge from the vertex normal during creation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__internal_spring_max_diversion);
	 * CPointer&lt;Float&gt; p_internal_spring_max_diversion = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'internal_spring_max_diversion'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__internal_spring_max_diversion = new long[]{236, 244};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_intern'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling structural stiffness. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__vgroup_intern);
	 * CPointer&lt;Short&gt; p_vgroup_intern = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_intern'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_intern = new long[]{240, 248};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{242, 250};

	/**
	 * Field descriptor (offset) for struct member 'internal_tension'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__internal_tension);
	 * CPointer&lt;Float&gt; p_internal_tension = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'internal_tension'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__internal_tension = new long[]{244, 252};

	/**
	 * Field descriptor (offset) for struct member 'internal_compression'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__internal_compression);
	 * CPointer&lt;Float&gt; p_internal_compression = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'internal_compression'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__internal_compression = new long[]{248, 256};

	/**
	 * Field descriptor (offset) for struct member 'max_internal_tension'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__max_internal_tension);
	 * CPointer&lt;Float&gt; p_max_internal_tension = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_internal_tension'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_internal_tension = new long[]{252, 260};

	/**
	 * Field descriptor (offset) for struct member 'max_internal_compression'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD__max_internal_compression);
	 * CPointer&lt;Float&gt; p_max_internal_compression = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_internal_compression'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_internal_compression = new long[]{256, 264};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothSimSettings clothsimsettings = ...;
	 * CPointer&lt;Object&gt; p = clothsimsettings.__dna__addressof(ClothSimSettings.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{260, 268};

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
	 * <p> UNUSED. </p>
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
	 * <p> UNUSED. </p>
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
	 * <p> See SB. </p>
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
	 * <p> See SB. </p>
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
	 * <p> Mechanical damping of springs. 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <p> Mechanical damping of springs. 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <p> Structural spring stiffness. 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <p> Structural spring stiffness. 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <p> Max bending scaling value, min is "bending". </p>
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
	 * <p> Max bending scaling value, min is "bending". </p>
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
	 * <p> Max structural scaling value, min is "structural". 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <p> Max structural scaling value, min is "structural". 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <p> Max shear scaling value. </p>
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
	 * <p> Max shear scaling value. </p>
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
	 * <p> Max sewing force. </p>
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
	 * <p> Max sewing force. </p>
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
	 * <p> Used for normalized springs. </p>
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
	 * <p> Used for normalized springs. </p>
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
	 * <p> Parameter how fast cloth runs. </p>
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
	 * <p> Parameter how fast cloth runs. </p>
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
	 * <p> Multiplies cloth speed. </p>
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
	 * <p> Multiplies cloth speed. </p>
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
	 * <p> See SB. </p>
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
	 * <p> See SB. </p>
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
	 * <p> Scaling of effector forces (see #softbody_calc_forces). </p>
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
	 * <p> Scaling of effector forces (see #softbody_calc_forces). </p>
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
	 * <p> Scaling of effector wind (see #softbody_calc_forces). </p>
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
	 * <p> Scaling of effector wind (see #softbody_calc_forces). </p>
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
	 * <p> Smoothing of velocities for hair. </p>
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
	 * <p> Smoothing of velocities for hair. </p>
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
	 * <p> Minimum density for hair. </p>
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
	 * <p> Minimum density for hair. </p>
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
	 * <p> Influence of hair density. </p>
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
	 * <p> Influence of hair density. </p>
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
	 * <p> Friction with colliders. </p>
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
	 * <p> Friction with colliders. </p>
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
	 * <p> Damp the velocity to speed up getting to the resting position. 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <p> Damp the velocity to speed up getting to the resting position. 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <p> Min amount to shrink cloth by 0.0f (no shrink), 1.0f (shrink to nothing), -1.0f (double the edge length). </p>
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
	 * <p> Min amount to shrink cloth by 0.0f (no shrink), 1.0f (shrink to nothing), -1.0f (double the edge length). </p>
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
	 * <p> Max amount to shrink cloth by 0.0f (no shrink), 1.0f (shrink to nothing), -1.0f (double the edge length). </p>
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
	 * <p> Max amount to shrink cloth by 0.0f (no shrink), 1.0f (shrink to nothing), -1.0f (double the edge length). </p>
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
	 * Get method for struct member 'uniform_pressure_force'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Air pressure The uniform pressure that is constantly applied to the mesh. Can be negative. </p>
	 * @see #__DNA__FIELD__uniform_pressure_force
	 */
	
	public float getUniform_pressure_force() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 136);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'uniform_pressure_force'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Air pressure The uniform pressure that is constantly applied to the mesh. Can be negative. </p>
	 * @see #__DNA__FIELD__uniform_pressure_force
	 */
	
	public void setUniform_pressure_force(float uniform_pressure_force) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 136, uniform_pressure_force);
		} else {
			__io__block.writeFloat(__io__address + 132, uniform_pressure_force);
		}
	}

	/**
	 * Get method for struct member 'target_volume'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User set volume. This is the volume the mesh wants to expand to (the equilibrium volume). </p>
	 * @see #__DNA__FIELD__target_volume
	 */
	
	public float getTarget_volume() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'target_volume'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User set volume. This is the volume the mesh wants to expand to (the equilibrium volume). </p>
	 * @see #__DNA__FIELD__target_volume
	 */
	
	public void setTarget_volume(float target_volume) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, target_volume);
		} else {
			__io__block.writeFloat(__io__address + 136, target_volume);
		}
	}

	/**
	 * Get method for struct member 'pressure_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  </p>
	 * @see #__DNA__FIELD__pressure_factor
	 */
	
	public float getPressure_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'pressure_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  </p>
	 * @see #__DNA__FIELD__pressure_factor
	 */
	
	public void setPressure_factor(float pressure_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, pressure_factor);
		} else {
			__io__block.writeFloat(__io__address + 140, pressure_factor);
		}
	}

	/**
	 * Get method for struct member 'fluid_density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Density of the fluid inside or outside the object for use in the hydro-static pressure gradient. </p>
	 * @see #__DNA__FIELD__fluid_density
	 */
	
	public float getFluid_density() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'fluid_density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Density of the fluid inside or outside the object for use in the hydro-static pressure gradient. </p>
	 * @see #__DNA__FIELD__fluid_density
	 */
	
	public void setFluid_density(float fluid_density) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, fluid_density);
		} else {
			__io__block.writeFloat(__io__address + 144, fluid_density);
		}
	}

	/**
	 * Get method for struct member 'vgroup_pressure'.
	 * @see #__DNA__FIELD__vgroup_pressure
	 */
	
	public short getVgroup_pressure() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 152);
		} else {
			return __io__block.readShort(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'vgroup_pressure'.
	 * @see #__DNA__FIELD__vgroup_pressure
	 */
	
	public void setVgroup_pressure(short vgroup_pressure) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 152, vgroup_pressure);
		} else {
			__io__block.writeShort(__io__address + 148, vgroup_pressure);
		}
	}

	/**
	 * Get method for struct member '_pad7'.
	 * @see #__DNA__FIELD___pad7
	 */
	
	public CArrayFacade<Byte> get_pad7() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 154, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 150, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad7'.
	 * @see #__DNA__FIELD___pad7
	 */
	
	public void set_pad7(CArrayFacade<Byte> _pad7) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 154;
		} else {
			__dna__offset = 150;
		}
		if (__io__equals(_pad7, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad7)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad7);
		} else {
			__io__generic__copy( get_pad7(), _pad7);
		}
	}

	/**
	 * Get method for struct member 'bending_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX various hair stuff should really be separate, this struct is a horrible mess already Damping of bending springs. </p>
	 * @see #__DNA__FIELD__bending_damping
	 */
	
	public float getBending_damping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'bending_damping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX various hair stuff should really be separate, this struct is a horrible mess already Damping of bending springs. </p>
	 * @see #__DNA__FIELD__bending_damping
	 */
	
	public void setBending_damping(float bending_damping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, bending_damping);
		} else {
			__io__block.writeFloat(__io__address + 156, bending_damping);
		}
	}

	/**
	 * Get method for struct member 'voxel_cell_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of voxel grid cells for continuum dynamics. </p>
	 * @see #__DNA__FIELD__voxel_cell_size
	 */
	
	public float getVoxel_cell_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'voxel_cell_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of voxel grid cells for continuum dynamics. </p>
	 * @see #__DNA__FIELD__voxel_cell_size
	 */
	
	public void setVoxel_cell_size(float voxel_cell_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, voxel_cell_size);
		} else {
			__io__block.writeFloat(__io__address + 160, voxel_cell_size);
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
			return __io__block.readInt(__io__address + 168);
		} else {
			return __io__block.readInt(__io__address + 164);
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
			__io__block.writeInt(__io__address + 168, stepsPerFrame);
		} else {
			__io__block.writeInt(__io__address + 164, stepsPerFrame);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags, see CSIMSETT_FLAGS enum above. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 172);
		} else {
			return __io__block.readInt(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags, see CSIMSETT_FLAGS enum above. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 172, flags);
		} else {
			__io__block.writeInt(__io__address + 168, flags);
		}
	}

	/**
	 * Get method for struct member 'preroll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How many frames of simulation to do before we start. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__preroll
	 */
	
	public int getPreroll() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 176);
		} else {
			return __io__block.readInt(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'preroll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How many frames of simulation to do before we start. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__preroll
	 */
	
	public void setPreroll(int preroll) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 176, preroll);
		} else {
			__io__block.writeInt(__io__address + 172, preroll);
		}
	}

	/**
	 * Get method for struct member 'maxspringlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In percent!; if tearing enabled, a spring will get cut. </p>
	 * @see #__DNA__FIELD__maxspringlen
	 */
	
	public int getMaxspringlen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 180);
		} else {
			return __io__block.readInt(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'maxspringlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In percent!; if tearing enabled, a spring will get cut. </p>
	 * @see #__DNA__FIELD__maxspringlen
	 */
	
	public void setMaxspringlen(int maxspringlen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 180, maxspringlen);
		} else {
			__io__block.writeInt(__io__address + 176, maxspringlen);
		}
	}

	/**
	 * Get method for struct member 'solver_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Which solver should be used? txold. </p>
	 * @see #__DNA__FIELD__solver_type
	 */
	
	public short getSolver_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 184);
		} else {
			return __io__block.readShort(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'solver_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Which solver should be used? txold. </p>
	 * @see #__DNA__FIELD__solver_type
	 */
	
	public void setSolver_type(short solver_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 184, solver_type);
		} else {
			__io__block.writeShort(__io__address + 180, solver_type);
		}
	}

	/**
	 * Get method for struct member 'vgroup_bend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling bending stiffness. </p>
	 * @see #__DNA__FIELD__vgroup_bend
	 */
	
	public short getVgroup_bend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 186);
		} else {
			return __io__block.readShort(__io__address + 182);
		}
	}

	/**
	 * Set method for struct member 'vgroup_bend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling bending stiffness. </p>
	 * @see #__DNA__FIELD__vgroup_bend
	 */
	
	public void setVgroup_bend(short vgroup_bend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 186, vgroup_bend);
		} else {
			__io__block.writeShort(__io__address + 182, vgroup_bend);
		}
	}

	/**
	 * Get method for struct member 'vgroup_mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name for assigning weight. </p>
	 * @see #__DNA__FIELD__vgroup_mass
	 */
	
	public short getVgroup_mass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 188);
		} else {
			return __io__block.readShort(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'vgroup_mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name for assigning weight. </p>
	 * @see #__DNA__FIELD__vgroup_mass
	 */
	
	public void setVgroup_mass(short vgroup_mass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 188, vgroup_mass);
		} else {
			__io__block.writeShort(__io__address + 184, vgroup_mass);
		}
	}

	/**
	 * Get method for struct member 'vgroup_struct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling structural stiffness. </p>
	 * @see #__DNA__FIELD__vgroup_struct
	 */
	
	public short getVgroup_struct() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 190);
		} else {
			return __io__block.readShort(__io__address + 186);
		}
	}

	/**
	 * Set method for struct member 'vgroup_struct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling structural stiffness. </p>
	 * @see #__DNA__FIELD__vgroup_struct
	 */
	
	public void setVgroup_struct(short vgroup_struct) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 190, vgroup_struct);
		} else {
			__io__block.writeShort(__io__address + 186, vgroup_struct);
		}
	}

	/**
	 * Get method for struct member 'vgroup_shrink'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for shrinking cloth. </p>
	 * @see #__DNA__FIELD__vgroup_shrink
	 */
	
	public short getVgroup_shrink() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 192);
		} else {
			return __io__block.readShort(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'vgroup_shrink'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for shrinking cloth. </p>
	 * @see #__DNA__FIELD__vgroup_shrink
	 */
	
	public void setVgroup_shrink(short vgroup_shrink) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 192, vgroup_shrink);
		} else {
			__io__block.writeShort(__io__address + 188, vgroup_shrink);
		}
	}

	/**
	 * Get method for struct member 'shapekey_rest'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling structural stiffness. </p>
	 * @see #__DNA__FIELD__shapekey_rest
	 */
	
	public short getShapekey_rest() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 194);
		} else {
			return __io__block.readShort(__io__address + 190);
		}
	}

	/**
	 * Set method for struct member 'shapekey_rest'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling structural stiffness. </p>
	 * @see #__DNA__FIELD__shapekey_rest
	 */
	
	public void setShapekey_rest(short shapekey_rest) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 194, shapekey_rest);
		} else {
			__io__block.writeShort(__io__address + 190, shapekey_rest);
		}
	}

	/**
	 * Get method for struct member 'presets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for presets on GUI. </p>
	 * @see #__DNA__FIELD__presets
	 */
	
	public short getPresets() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 196);
		} else {
			return __io__block.readShort(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'presets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for presets on GUI. </p>
	 * @see #__DNA__FIELD__presets
	 */
	
	public void setPresets(short presets) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 196, presets);
		} else {
			__io__block.writeShort(__io__address + 192, presets);
		}
	}

	/**
	 * Get method for struct member 'reset'.
	 * @see #__DNA__FIELD__reset
	 */
	
	public short getReset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 198);
		} else {
			return __io__block.readShort(__io__address + 194);
		}
	}

	/**
	 * Set method for struct member 'reset'.
	 * @see #__DNA__FIELD__reset
	 */
	
	public void setReset(short reset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 198, reset);
		} else {
			__io__block.writeShort(__io__address + 194, reset);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 196);
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
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 196, __address);
		}
	}

	/**
	 * Get method for struct member 'bending_model'.
	 * @see #__DNA__FIELD__bending_model
	 */
	
	public short getBending_model() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 208);
		} else {
			return __io__block.readShort(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'bending_model'.
	 * @see #__DNA__FIELD__bending_model
	 */
	
	public void setBending_model(short bending_model) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 208, bending_model);
		} else {
			__io__block.writeShort(__io__address + 200, bending_model);
		}
	}

	/**
	 * Get method for struct member 'vgroup_shear'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling structural stiffness. </p>
	 * @see #__DNA__FIELD__vgroup_shear
	 */
	
	public short getVgroup_shear() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 210);
		} else {
			return __io__block.readShort(__io__address + 202);
		}
	}

	/**
	 * Set method for struct member 'vgroup_shear'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling structural stiffness. </p>
	 * @see #__DNA__FIELD__vgroup_shear
	 */
	
	public void setVgroup_shear(short vgroup_shear) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 210, vgroup_shear);
		} else {
			__io__block.writeShort(__io__address + 202, vgroup_shear);
		}
	}

	/**
	 * Get method for struct member 'tension'.
	 * @see #__DNA__FIELD__tension
	 */
	
	public float getTension() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'tension'.
	 * @see #__DNA__FIELD__tension
	 */
	
	public void setTension(float tension) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, tension);
		} else {
			__io__block.writeFloat(__io__address + 204, tension);
		}
	}

	/**
	 * Get method for struct member 'compression'.
	 * @see #__DNA__FIELD__compression
	 */
	
	public float getCompression() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 216);
		} else {
			return __io__block.readFloat(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'compression'.
	 * @see #__DNA__FIELD__compression
	 */
	
	public void setCompression(float compression) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 216, compression);
		} else {
			__io__block.writeFloat(__io__address + 208, compression);
		}
	}

	/**
	 * Get method for struct member 'max_tension'.
	 * @see #__DNA__FIELD__max_tension
	 */
	
	public float getMax_tension() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 220);
		} else {
			return __io__block.readFloat(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'max_tension'.
	 * @see #__DNA__FIELD__max_tension
	 */
	
	public void setMax_tension(float max_tension) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 220, max_tension);
		} else {
			__io__block.writeFloat(__io__address + 212, max_tension);
		}
	}

	/**
	 * Get method for struct member 'max_compression'.
	 * @see #__DNA__FIELD__max_compression
	 */
	
	public float getMax_compression() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 224);
		} else {
			return __io__block.readFloat(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'max_compression'.
	 * @see #__DNA__FIELD__max_compression
	 */
	
	public void setMax_compression(float max_compression) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 224, max_compression);
		} else {
			__io__block.writeFloat(__io__address + 216, max_compression);
		}
	}

	/**
	 * Get method for struct member 'tension_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mechanical damping of tension springs. </p>
	 * @see #__DNA__FIELD__tension_damp
	 */
	
	public float getTension_damp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 228);
		} else {
			return __io__block.readFloat(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'tension_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mechanical damping of tension springs. </p>
	 * @see #__DNA__FIELD__tension_damp
	 */
	
	public void setTension_damp(float tension_damp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 228, tension_damp);
		} else {
			__io__block.writeFloat(__io__address + 220, tension_damp);
		}
	}

	/**
	 * Get method for struct member 'compression_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mechanical damping of compression springs. </p>
	 * @see #__DNA__FIELD__compression_damp
	 */
	
	public float getCompression_damp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 232);
		} else {
			return __io__block.readFloat(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'compression_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mechanical damping of compression springs. </p>
	 * @see #__DNA__FIELD__compression_damp
	 */
	
	public void setCompression_damp(float compression_damp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 232, compression_damp);
		} else {
			__io__block.writeFloat(__io__address + 224, compression_damp);
		}
	}

	/**
	 * Get method for struct member 'shear_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mechanical damping of shear springs. </p>
	 * @see #__DNA__FIELD__shear_damp
	 */
	
	public float getShear_damp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 236);
		} else {
			return __io__block.readFloat(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'shear_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Mechanical damping of shear springs. </p>
	 * @see #__DNA__FIELD__shear_damp
	 */
	
	public void setShear_damp(float shear_damp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 236, shear_damp);
		} else {
			__io__block.writeFloat(__io__address + 228, shear_damp);
		}
	}

	/**
	 * Get method for struct member 'internal_spring_max_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The maximum length an internal spring can have during creation. </p>
	 * @see #__DNA__FIELD__internal_spring_max_length
	 */
	
	public float getInternal_spring_max_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 240);
		} else {
			return __io__block.readFloat(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'internal_spring_max_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The maximum length an internal spring can have during creation. </p>
	 * @see #__DNA__FIELD__internal_spring_max_length
	 */
	
	public void setInternal_spring_max_length(float internal_spring_max_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 240, internal_spring_max_length);
		} else {
			__io__block.writeFloat(__io__address + 232, internal_spring_max_length);
		}
	}

	/**
	 * Get method for struct member 'internal_spring_max_diversion'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much the internal spring can diverge from the vertex normal during creation. </p>
	 * @see #__DNA__FIELD__internal_spring_max_diversion
	 */
	
	public float getInternal_spring_max_diversion() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 244);
		} else {
			return __io__block.readFloat(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'internal_spring_max_diversion'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much the internal spring can diverge from the vertex normal during creation. </p>
	 * @see #__DNA__FIELD__internal_spring_max_diversion
	 */
	
	public void setInternal_spring_max_diversion(float internal_spring_max_diversion) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 244, internal_spring_max_diversion);
		} else {
			__io__block.writeFloat(__io__address + 236, internal_spring_max_diversion);
		}
	}

	/**
	 * Get method for struct member 'vgroup_intern'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling structural stiffness. </p>
	 * @see #__DNA__FIELD__vgroup_intern
	 */
	
	public short getVgroup_intern() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 248);
		} else {
			return __io__block.readShort(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'vgroup_intern'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group for scaling structural stiffness. </p>
	 * @see #__DNA__FIELD__vgroup_intern
	 */
	
	public void setVgroup_intern(short vgroup_intern) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 248, vgroup_intern);
		} else {
			__io__block.writeShort(__io__address + 240, vgroup_intern);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 250, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 242, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 250;
		} else {
			__dna__offset = 242;
		}
		if (__io__equals(_pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1);
		} else {
			__io__generic__copy( get_pad1(), _pad1);
		}
	}

	/**
	 * Get method for struct member 'internal_tension'.
	 * @see #__DNA__FIELD__internal_tension
	 */
	
	public float getInternal_tension() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 252);
		} else {
			return __io__block.readFloat(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'internal_tension'.
	 * @see #__DNA__FIELD__internal_tension
	 */
	
	public void setInternal_tension(float internal_tension) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 252, internal_tension);
		} else {
			__io__block.writeFloat(__io__address + 244, internal_tension);
		}
	}

	/**
	 * Get method for struct member 'internal_compression'.
	 * @see #__DNA__FIELD__internal_compression
	 */
	
	public float getInternal_compression() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 256);
		} else {
			return __io__block.readFloat(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'internal_compression'.
	 * @see #__DNA__FIELD__internal_compression
	 */
	
	public void setInternal_compression(float internal_compression) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 256, internal_compression);
		} else {
			__io__block.writeFloat(__io__address + 248, internal_compression);
		}
	}

	/**
	 * Get method for struct member 'max_internal_tension'.
	 * @see #__DNA__FIELD__max_internal_tension
	 */
	
	public float getMax_internal_tension() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 260);
		} else {
			return __io__block.readFloat(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'max_internal_tension'.
	 * @see #__DNA__FIELD__max_internal_tension
	 */
	
	public void setMax_internal_tension(float max_internal_tension) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 260, max_internal_tension);
		} else {
			__io__block.writeFloat(__io__address + 252, max_internal_tension);
		}
	}

	/**
	 * Get method for struct member 'max_internal_compression'.
	 * @see #__DNA__FIELD__max_internal_compression
	 */
	
	public float getMax_internal_compression() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 264);
		} else {
			return __io__block.readFloat(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'max_internal_compression'.
	 * @see #__DNA__FIELD__max_internal_compression
	 */
	
	public void setMax_internal_compression(float max_internal_compression) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 264, max_internal_compression);
		} else {
			__io__block.writeFloat(__io__address + 256, max_internal_compression);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 268, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 260, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 268;
		} else {
			__dna__offset = 260;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ClothSimSettings> __io__addressof() {
		return new CPointer<ClothSimSettings>(__io__address, new Class[]{ClothSimSettings.class}, __io__block, __io__blockTable);
	}

}
