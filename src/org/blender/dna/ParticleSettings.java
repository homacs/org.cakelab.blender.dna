package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ParticleSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=700, size64=856)
public class ParticleSettings extends CFacade {

	/**
	 * This is the sdna index of the struct ParticleSettings.
	 * <p>
	 * It is required when allocating a new block to store data for ParticleSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 485;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__adt);
	 * CPointer&lt;CPointer&lt;AnimData&gt;&gt; p_adt = p.cast(new Class[]{CPointer.class, AnimData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adt'</li>
	 * <li>Signature: 'AnimData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adt = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'boids'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__boids);
	 * CPointer&lt;CPointer&lt;BoidSettings&gt;&gt; p_boids = p.cast(new Class[]{CPointer.class, BoidSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'boids'</li>
	 * <li>Signature: 'BoidSettings*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__boids = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'fluid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__fluid);
	 * CPointer&lt;CPointer&lt;SPHFluidSettings&gt;&gt; p_fluid = p.cast(new Class[]{CPointer.class, SPHFluidSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluid'</li>
	 * <li>Signature: 'SPHFluidSettings*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluid = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'effector_weights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__effector_weights);
	 * CPointer&lt;CPointer&lt;EffectorWeights&gt;&gt; p_effector_weights = p.cast(new Class[]{CPointer.class, EffectorWeights.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effector_weights'</li>
	 * <li>Signature: 'EffectorWeights*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effector_weights = new long[]{112, 144};

	/**
	 * Field descriptor (offset) for struct member 'collision_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit colliders to this Group
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__collision_group);
	 * CPointer&lt;CPointer&lt;Group&gt;&gt; p_collision_group = p.cast(new Class[]{CPointer.class, Group.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'collision_group'</li>
	 * <li>Signature: 'Group*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__collision_group = new long[]{116, 152};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{120, 160};

	/**
	 * Field descriptor (offset) for struct member 'rt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__rt);
	 * CPointer&lt;Integer&gt; p_rt = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rt'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rt = new long[]{124, 164};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle Type
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{128, 168};

	/**
	 * Field descriptor (offset) for struct member 'from'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__from);
	 * CPointer&lt;Short&gt; p_from = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'from'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__from = new long[]{130, 170};

	/**
	 * Field descriptor (offset) for struct member 'distr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__distr);
	 * CPointer&lt;Short&gt; p_distr = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distr'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distr = new long[]{132, 172};

	/**
	 * Field descriptor (offset) for struct member 'texact'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__texact);
	 * CPointer&lt;Short&gt; p_texact = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texact'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texact = new long[]{134, 174};

	/**
	 * Field descriptor (offset) for struct member 'phystype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> physics modes </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__phystype);
	 * CPointer&lt;Short&gt; p_phystype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'phystype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__phystype = new long[]{136, 176};

	/**
	 * Field descriptor (offset) for struct member 'rotmode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__rotmode);
	 * CPointer&lt;Short&gt; p_rotmode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotmode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotmode = new long[]{138, 178};

	/**
	 * Field descriptor (offset) for struct member 'avemode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__avemode);
	 * CPointer&lt;Short&gt; p_avemode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'avemode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__avemode = new long[]{140, 180};

	/**
	 * Field descriptor (offset) for struct member 'reactevent'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__reactevent);
	 * CPointer&lt;Short&gt; p_reactevent = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reactevent'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reactevent = new long[]{142, 182};

	/**
	 * Field descriptor (offset) for struct member 'draw'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__draw);
	 * CPointer&lt;Integer&gt; p_draw = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw = new long[]{144, 184};

	/**
	 * Field descriptor (offset) for struct member 'pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__pad1);
	 * CPointer&lt;Integer&gt; p_pad1 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad1'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad1 = new long[]{148, 188};

	/**
	 * Field descriptor (offset) for struct member 'draw_as'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__draw_as);
	 * CPointer&lt;Short&gt; p_draw_as = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_as'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_as = new long[]{152, 192};

	/**
	 * Field descriptor (offset) for struct member 'draw_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of particles on viewport in pixels (0=default)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__draw_size);
	 * CPointer&lt;Short&gt; p_draw_size = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_size'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_size = new long[]{154, 194};

	/**
	 * Field descriptor (offset) for struct member 'childtype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__childtype);
	 * CPointer&lt;Short&gt; p_childtype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'childtype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__childtype = new long[]{156, 196};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__pad2);
	 * CPointer&lt;Short&gt; p_pad2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{158, 198};

	/**
	 * Field descriptor (offset) for struct member 'ren_as'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__ren_as);
	 * CPointer&lt;Short&gt; p_ren_as = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ren_as'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ren_as = new long[]{160, 200};

	/**
	 * Field descriptor (offset) for struct member 'subframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Subframes to simulate for improved stability and finer granularity simulations (dt = timestep / (subframes + 1))
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__subframes);
	 * CPointer&lt;Short&gt; p_subframes = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subframes'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subframes = new long[]{162, 202};

	/**
	 * Field descriptor (offset) for struct member 'draw_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__draw_col);
	 * CPointer&lt;Short&gt; p_draw_col = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_col'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_col = new long[]{164, 204};

	/**
	 * Field descriptor (offset) for struct member 'draw_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How many steps paths are drawn with (power of 2)<h4>Blender Source Code:</h4>
	 * <p> number of path segments, power of 2 except </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__draw_step);
	 * CPointer&lt;Short&gt; p_draw_step = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_step'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_step = new long[]{166, 206};

	/**
	 * Field descriptor (offset) for struct member 'ren_step'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__ren_step);
	 * CPointer&lt;Short&gt; p_ren_step = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ren_step'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ren_step = new long[]{168, 208};

	/**
	 * Field descriptor (offset) for struct member 'hair_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of hair segments
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__hair_step);
	 * CPointer&lt;Short&gt; p_hair_step = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hair_step'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hair_step = new long[]{170, 210};

	/**
	 * Field descriptor (offset) for struct member 'keys_step'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__keys_step);
	 * CPointer&lt;Short&gt; p_keys_step = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keys_step'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keys_step = new long[]{172, 212};

	/**
	 * Field descriptor (offset) for struct member 'adapt_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> adaptive path rendering </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__adapt_angle);
	 * CPointer&lt;Short&gt; p_adapt_angle = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adapt_angle'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adapt_angle = new long[]{174, 214};

	/**
	 * Field descriptor (offset) for struct member 'adapt_pix'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__adapt_pix);
	 * CPointer&lt;Short&gt; p_adapt_pix = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adapt_pix'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adapt_pix = new long[]{176, 216};

	/**
	 * Field descriptor (offset) for struct member 'disp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__disp);
	 * CPointer&lt;Short&gt; p_disp = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'disp'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__disp = new long[]{178, 218};

	/**
	 * Field descriptor (offset) for struct member 'omat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__omat);
	 * CPointer&lt;Short&gt; p_omat = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'omat'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__omat = new long[]{180, 220};

	/**
	 * Field descriptor (offset) for struct member 'interpolation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__interpolation);
	 * CPointer&lt;Short&gt; p_interpolation = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interpolation'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interpolation = new long[]{182, 222};

	/**
	 * Field descriptor (offset) for struct member 'integrator'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Algorithm used to calculate physics, from the fastest to the most stable/accurate: Midpoint, Euler, Verlet, RK4 (Old)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__integrator);
	 * CPointer&lt;Short&gt; p_integrator = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'integrator'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__integrator = new long[]{184, 224};

	/**
	 * Field descriptor (offset) for struct member 'rotfrom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__rotfrom);
	 * CPointer&lt;Short&gt; p_rotfrom = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotfrom'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotfrom = new long[]{186, 226};

	/**
	 * Field descriptor (offset) for struct member 'kink'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of periodic offset on the path
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__kink);
	 * CPointer&lt;Short&gt; p_kink = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink = new long[]{188, 228};

	/**
	 * Field descriptor (offset) for struct member 'kink_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Which axis to use for offset
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__kink_axis);
	 * CPointer&lt;Short&gt; p_kink_axis = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink_axis'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink_axis = new long[]{190, 230};

	/**
	 * Field descriptor (offset) for struct member 'bb_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> billboards </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__bb_align);
	 * CPointer&lt;Short&gt; p_bb_align = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb_align'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb_align = new long[]{192, 232};

	/**
	 * Field descriptor (offset) for struct member 'bb_uv_split'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__bb_uv_split);
	 * CPointer&lt;Short&gt; p_bb_uv_split = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb_uv_split'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb_uv_split = new long[]{194, 234};

	/**
	 * Field descriptor (offset) for struct member 'bb_anim'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__bb_anim);
	 * CPointer&lt;Short&gt; p_bb_anim = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb_anim'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb_anim = new long[]{196, 236};

	/**
	 * Field descriptor (offset) for struct member 'bb_split_offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__bb_split_offset);
	 * CPointer&lt;Short&gt; p_bb_split_offset = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb_split_offset'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb_split_offset = new long[]{198, 238};

	/**
	 * Field descriptor (offset) for struct member 'bb_tilt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__bb_tilt);
	 * CPointer&lt;Float&gt; p_bb_tilt = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb_tilt'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb_tilt = new long[]{200, 240};

	/**
	 * Field descriptor (offset) for struct member 'bb_rand_tilt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__bb_rand_tilt);
	 * CPointer&lt;Float&gt; p_bb_rand_tilt = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb_rand_tilt'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb_rand_tilt = new long[]{204, 244};

	/**
	 * Field descriptor (offset) for struct member 'bb_offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__bb_offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_bb_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb_offset'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb_offset = new long[]{208, 248};

	/**
	 * Field descriptor (offset) for struct member 'bb_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__bb_size);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_bb_size = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb_size'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb_size = new long[]{216, 256};

	/**
	 * Field descriptor (offset) for struct member 'bb_vel_head'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__bb_vel_head);
	 * CPointer&lt;Float&gt; p_bb_vel_head = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb_vel_head'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb_vel_head = new long[]{224, 264};

	/**
	 * Field descriptor (offset) for struct member 'bb_vel_tail'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__bb_vel_tail);
	 * CPointer&lt;Float&gt; p_bb_vel_tail = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb_vel_tail'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb_vel_tail = new long[]{228, 268};

	/**
	 * Field descriptor (offset) for struct member 'color_vec_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> draw color </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__color_vec_max);
	 * CPointer&lt;Float&gt; p_color_vec_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_vec_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_vec_max = new long[]{232, 272};

	/**
	 * Field descriptor (offset) for struct member 'simplify_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> simplification </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__simplify_flag);
	 * CPointer&lt;Short&gt; p_simplify_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_flag = new long[]{236, 276};

	/**
	 * Field descriptor (offset) for struct member 'simplify_refsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Reference size in pixels, after which simplification begins
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__simplify_refsize);
	 * CPointer&lt;Short&gt; p_simplify_refsize = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_refsize'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_refsize = new long[]{238, 278};

	/**
	 * Field descriptor (offset) for struct member 'simplify_rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of simplification
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__simplify_rate);
	 * CPointer&lt;Float&gt; p_simplify_rate = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_rate'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_rate = new long[]{240, 280};

	/**
	 * Field descriptor (offset) for struct member 'simplify_transition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Transition period for fading out strands
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__simplify_transition);
	 * CPointer&lt;Float&gt; p_simplify_transition = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_transition'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_transition = new long[]{244, 284};

	/**
	 * Field descriptor (offset) for struct member 'simplify_viewport'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of Simplification
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__simplify_viewport);
	 * CPointer&lt;Float&gt; p_simplify_viewport = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simplify_viewport'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simplify_viewport = new long[]{248, 288};

	/**
	 * Field descriptor (offset) for struct member 'sta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> time and emission </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__sta);
	 * CPointer&lt;Float&gt; p_sta = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sta'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sta = new long[]{252, 292};

	/**
	 * Field descriptor (offset) for struct member 'end'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__end);
	 * CPointer&lt;Float&gt; p_end = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'end'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__end = new long[]{256, 296};

	/**
	 * Field descriptor (offset) for struct member 'lifetime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Life span of the particles
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__lifetime);
	 * CPointer&lt;Float&gt; p_lifetime = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lifetime'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lifetime = new long[]{260, 300};

	/**
	 * Field descriptor (offset) for struct member 'randlife'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__randlife);
	 * CPointer&lt;Float&gt; p_randlife = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'randlife'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__randlife = new long[]{264, 304};

	/**
	 * Field descriptor (offset) for struct member 'timetweak'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__timetweak);
	 * CPointer&lt;Float&gt; p_timetweak = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'timetweak'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__timetweak = new long[]{268, 308};

	/**
	 * Field descriptor (offset) for struct member 'courant_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The relative distance a particle can move before requiring more subframes (target Courant number); 0.01-0.3 is the recommended range
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__courant_target);
	 * CPointer&lt;Float&gt; p_courant_target = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'courant_target'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__courant_target = new long[]{272, 312};

	/**
	 * Field descriptor (offset) for struct member 'jitfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__jitfac);
	 * CPointer&lt;Float&gt; p_jitfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'jitfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__jitfac = new long[]{276, 316};

	/**
	 * Field descriptor (offset) for struct member 'eff_hair'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__eff_hair);
	 * CPointer&lt;Float&gt; p_eff_hair = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eff_hair'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eff_hair = new long[]{280, 320};

	/**
	 * Field descriptor (offset) for struct member 'grid_rand'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__grid_rand);
	 * CPointer&lt;Float&gt; p_grid_rand = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grid_rand'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grid_rand = new long[]{284, 324};

	/**
	 * Field descriptor (offset) for struct member 'ps_offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__ps_offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_ps_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ps_offset'</li>
	 * <li>Signature: 'float[1]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ps_offset = new long[]{288, 328};

	/**
	 * Field descriptor (offset) for struct member 'totpart'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__totpart);
	 * CPointer&lt;Integer&gt; p_totpart = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpart'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpart = new long[]{292, 332};

	/**
	 * Field descriptor (offset) for struct member 'userjit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Emission locations / face (0 = automatic)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__userjit);
	 * CPointer&lt;Integer&gt; p_userjit = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'userjit'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__userjit = new long[]{296, 336};

	/**
	 * Field descriptor (offset) for struct member 'grid_res'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__grid_res);
	 * CPointer&lt;Integer&gt; p_grid_res = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grid_res'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grid_res = new long[]{300, 340};

	/**
	 * Field descriptor (offset) for struct member 'effector_amount'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How many particles are effectors (0 is all particles)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__effector_amount);
	 * CPointer&lt;Integer&gt; p_effector_amount = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effector_amount'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effector_amount = new long[]{304, 344};

	/**
	 * Field descriptor (offset) for struct member 'time_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__time_flag);
	 * CPointer&lt;Short&gt; p_time_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_flag = new long[]{308, 348};

	/**
	 * Field descriptor (offset) for struct member 'time_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__time_pad);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_time_pad = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_pad'</li>
	 * <li>Signature: 'short[3]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_pad = new long[]{310, 350};

	/**
	 * Field descriptor (offset) for struct member 'normfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> initial velocity factors </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__normfac);
	 * CPointer&lt;Float&gt; p_normfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normfac = new long[]{316, 356};

	/**
	 * Field descriptor (offset) for struct member 'obfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__obfac);
	 * CPointer&lt;Float&gt; p_obfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'obfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__obfac = new long[]{320, 360};

	/**
	 * Field descriptor (offset) for struct member 'randfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__randfac);
	 * CPointer&lt;Float&gt; p_randfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'randfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__randfac = new long[]{324, 364};

	/**
	 * Field descriptor (offset) for struct member 'partfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__partfac);
	 * CPointer&lt;Float&gt; p_partfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'partfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__partfac = new long[]{328, 368};

	/**
	 * Field descriptor (offset) for struct member 'tanfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__tanfac);
	 * CPointer&lt;Float&gt; p_tanfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tanfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tanfac = new long[]{332, 372};

	/**
	 * Field descriptor (offset) for struct member 'tanphase'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__tanphase);
	 * CPointer&lt;Float&gt; p_tanphase = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tanphase'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tanphase = new long[]{336, 376};

	/**
	 * Field descriptor (offset) for struct member 'reactfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__reactfac);
	 * CPointer&lt;Float&gt; p_reactfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reactfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reactfac = new long[]{340, 380};

	/**
	 * Field descriptor (offset) for struct member 'ob_vel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__ob_vel);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_ob_vel = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob_vel'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob_vel = new long[]{344, 384};

	/**
	 * Field descriptor (offset) for struct member 'avefac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__avefac);
	 * CPointer&lt;Float&gt; p_avefac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'avefac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__avefac = new long[]{356, 396};

	/**
	 * Field descriptor (offset) for struct member 'phasefac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__phasefac);
	 * CPointer&lt;Float&gt; p_phasefac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'phasefac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__phasefac = new long[]{360, 400};

	/**
	 * Field descriptor (offset) for struct member 'randrotfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__randrotfac);
	 * CPointer&lt;Float&gt; p_randrotfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'randrotfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__randrotfac = new long[]{364, 404};

	/**
	 * Field descriptor (offset) for struct member 'randphasefac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__randphasefac);
	 * CPointer&lt;Float&gt; p_randphasefac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'randphasefac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__randphasefac = new long[]{368, 408};

	/**
	 * Field descriptor (offset) for struct member 'mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mass of the particles<h4>Blender Source Code:</h4>
	 * <p> physical properties </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__mass);
	 * CPointer&lt;Float&gt; p_mass = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mass'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mass = new long[]{372, 412};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__size);
	 * CPointer&lt;Float&gt; p_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{376, 416};

	/**
	 * Field descriptor (offset) for struct member 'randsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__randsize);
	 * CPointer&lt;Float&gt; p_randsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'randsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__randsize = new long[]{380, 420};

	/**
	 * Field descriptor (offset) for struct member 'acc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> global physical properties </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__acc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_acc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'acc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__acc = new long[]{384, 424};

	/**
	 * Field descriptor (offset) for struct member 'dragfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__dragfac);
	 * CPointer&lt;Float&gt; p_dragfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dragfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dragfac = new long[]{396, 436};

	/**
	 * Field descriptor (offset) for struct member 'brownfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__brownfac);
	 * CPointer&lt;Float&gt; p_brownfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brownfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brownfac = new long[]{400, 440};

	/**
	 * Field descriptor (offset) for struct member 'dampfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__dampfac);
	 * CPointer&lt;Float&gt; p_dampfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dampfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dampfac = new long[]{404, 444};

	/**
	 * Field descriptor (offset) for struct member 'randlength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> length </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__randlength);
	 * CPointer&lt;Float&gt; p_randlength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'randlength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__randlength = new long[]{408, 448};

	/**
	 * Field descriptor (offset) for struct member 'child_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> children </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__child_flag);
	 * CPointer&lt;Integer&gt; p_child_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'child_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__child_flag = new long[]{412, 452};

	/**
	 * Field descriptor (offset) for struct member 'pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__pad3);
	 * CPointer&lt;Integer&gt; p_pad3 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad3'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad3 = new long[]{416, 456};

	/**
	 * Field descriptor (offset) for struct member 'child_nbr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of children/parent
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__child_nbr);
	 * CPointer&lt;Integer&gt; p_child_nbr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'child_nbr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__child_nbr = new long[]{420, 460};

	/**
	 * Field descriptor (offset) for struct member 'ren_child_nbr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__ren_child_nbr);
	 * CPointer&lt;Integer&gt; p_ren_child_nbr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ren_child_nbr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ren_child_nbr = new long[]{424, 464};

	/**
	 * Field descriptor (offset) for struct member 'parents'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__parents);
	 * CPointer&lt;Float&gt; p_parents = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parents'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parents = new long[]{428, 468};

	/**
	 * Field descriptor (offset) for struct member 'childsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__childsize);
	 * CPointer&lt;Float&gt; p_childsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'childsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__childsize = new long[]{432, 472};

	/**
	 * Field descriptor (offset) for struct member 'childrandsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__childrandsize);
	 * CPointer&lt;Float&gt; p_childrandsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'childrandsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__childrandsize = new long[]{436, 476};

	/**
	 * Field descriptor (offset) for struct member 'childrad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__childrad);
	 * CPointer&lt;Float&gt; p_childrad = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'childrad'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__childrad = new long[]{440, 480};

	/**
	 * Field descriptor (offset) for struct member 'childflat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__childflat);
	 * CPointer&lt;Float&gt; p_childflat = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'childflat'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__childflat = new long[]{444, 484};

	/**
	 * Field descriptor (offset) for struct member 'clumpfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> clumping </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__clumpfac);
	 * CPointer&lt;Float&gt; p_clumpfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clumpfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clumpfac = new long[]{448, 488};

	/**
	 * Field descriptor (offset) for struct member 'clumppow'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__clumppow);
	 * CPointer&lt;Float&gt; p_clumppow = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clumppow'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clumppow = new long[]{452, 492};

	/**
	 * Field descriptor (offset) for struct member 'kink_amp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> kink </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__kink_amp);
	 * CPointer&lt;Float&gt; p_kink_amp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink_amp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink_amp = new long[]{456, 496};

	/**
	 * Field descriptor (offset) for struct member 'kink_freq'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__kink_freq);
	 * CPointer&lt;Float&gt; p_kink_freq = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink_freq'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink_freq = new long[]{460, 500};

	/**
	 * Field descriptor (offset) for struct member 'kink_shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust the offset to the beginning/end
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__kink_shape);
	 * CPointer&lt;Float&gt; p_kink_shape = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink_shape'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink_shape = new long[]{464, 504};

	/**
	 * Field descriptor (offset) for struct member 'kink_flat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How flat the hairs are
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__kink_flat);
	 * CPointer&lt;Float&gt; p_kink_flat = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink_flat'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink_flat = new long[]{468, 508};

	/**
	 * Field descriptor (offset) for struct member 'kink_amp_clump'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__kink_amp_clump);
	 * CPointer&lt;Float&gt; p_kink_amp_clump = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink_amp_clump'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink_amp_clump = new long[]{472, 512};

	/**
	 * Field descriptor (offset) for struct member 'kink_extra_steps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Extra steps for resolution of special kink features
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__kink_extra_steps);
	 * CPointer&lt;Integer&gt; p_kink_extra_steps = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink_extra_steps'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink_extra_steps = new long[]{476, 516};

	/**
	 * Field descriptor (offset) for struct member 'pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__pad4);
	 * CPointer&lt;Integer&gt; p_pad4 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad4'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad4 = new long[]{480, 520};

	/**
	 * Field descriptor (offset) for struct member 'kink_axis_random'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Random variation of the orientation
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__kink_axis_random);
	 * CPointer&lt;Float&gt; p_kink_axis_random = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink_axis_random'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink_axis_random = new long[]{484, 524};

	/**
	 * Field descriptor (offset) for struct member 'kink_amp_random'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__kink_amp_random);
	 * CPointer&lt;Float&gt; p_kink_amp_random = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink_amp_random'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink_amp_random = new long[]{488, 528};

	/**
	 * Field descriptor (offset) for struct member 'rough1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rough </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__rough1);
	 * CPointer&lt;Float&gt; p_rough1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rough1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rough1 = new long[]{492, 532};

	/**
	 * Field descriptor (offset) for struct member 'rough1_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__rough1_size);
	 * CPointer&lt;Float&gt; p_rough1_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rough1_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rough1_size = new long[]{496, 536};

	/**
	 * Field descriptor (offset) for struct member 'rough2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__rough2);
	 * CPointer&lt;Float&gt; p_rough2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rough2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rough2 = new long[]{500, 540};

	/**
	 * Field descriptor (offset) for struct member 'rough2_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__rough2_size);
	 * CPointer&lt;Float&gt; p_rough2_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rough2_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rough2_size = new long[]{504, 544};

	/**
	 * Field descriptor (offset) for struct member 'rough2_thres'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__rough2_thres);
	 * CPointer&lt;Float&gt; p_rough2_thres = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rough2_thres'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rough2_thres = new long[]{508, 548};

	/**
	 * Field descriptor (offset) for struct member 'rough_end'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__rough_end);
	 * CPointer&lt;Float&gt; p_rough_end = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rough_end'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rough_end = new long[]{512, 552};

	/**
	 * Field descriptor (offset) for struct member 'rough_end_shape'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__rough_end_shape);
	 * CPointer&lt;Float&gt; p_rough_end_shape = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rough_end_shape'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rough_end_shape = new long[]{516, 556};

	/**
	 * Field descriptor (offset) for struct member 'clength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> length </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__clength);
	 * CPointer&lt;Float&gt; p_clength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clength = new long[]{520, 560};

	/**
	 * Field descriptor (offset) for struct member 'clength_thres'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__clength_thres);
	 * CPointer&lt;Float&gt; p_clength_thres = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clength_thres'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clength_thres = new long[]{524, 564};

	/**
	 * Field descriptor (offset) for struct member 'parting_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> parting </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__parting_fac);
	 * CPointer&lt;Float&gt; p_parting_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parting_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parting_fac = new long[]{528, 568};

	/**
	 * Field descriptor (offset) for struct member 'parting_min'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__parting_min);
	 * CPointer&lt;Float&gt; p_parting_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parting_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parting_min = new long[]{532, 572};

	/**
	 * Field descriptor (offset) for struct member 'parting_max'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__parting_max);
	 * CPointer&lt;Float&gt; p_parting_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parting_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parting_max = new long[]{536, 576};

	/**
	 * Field descriptor (offset) for struct member 'branch_thres'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> branching </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__branch_thres);
	 * CPointer&lt;Float&gt; p_branch_thres = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'branch_thres'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__branch_thres = new long[]{540, 580};

	/**
	 * Field descriptor (offset) for struct member 'draw_line'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> drawing stuff </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__draw_line);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_draw_line = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_line'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_line = new long[]{544, 584};

	/**
	 * Field descriptor (offset) for struct member 'path_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Starting time of drawn path
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__path_start);
	 * CPointer&lt;Float&gt; p_path_start = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path_start'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path_start = new long[]{552, 592};

	/**
	 * Field descriptor (offset) for struct member 'path_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * End time of drawn path
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__path_end);
	 * CPointer&lt;Float&gt; p_path_end = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path_end'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path_end = new long[]{556, 596};

	/**
	 * Field descriptor (offset) for struct member 'trail_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of trail particles
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__trail_count);
	 * CPointer&lt;Integer&gt; p_trail_count = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'trail_count'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__trail_count = new long[]{560, 600};

	/**
	 * Field descriptor (offset) for struct member 'keyed_loops'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of times the keys are looped<h4>Blender Source Code:</h4>
	 * <p> keyed particles </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__keyed_loops);
	 * CPointer&lt;Integer&gt; p_keyed_loops = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyed_loops'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyed_loops = new long[]{564, 604};

	/**
	 * Field descriptor (offset) for struct member 'clumpcurve'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__clumpcurve);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_clumpcurve = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clumpcurve'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clumpcurve = new long[]{568, 608};

	/**
	 * Field descriptor (offset) for struct member 'roughcurve'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__roughcurve);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_roughcurve = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'roughcurve'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__roughcurve = new long[]{572, 616};

	/**
	 * Field descriptor (offset) for struct member 'clump_noise_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of clump noise
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__clump_noise_size);
	 * CPointer&lt;Float&gt; p_clump_noise_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clump_noise_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clump_noise_size = new long[]{576, 624};

	/**
	 * Field descriptor (offset) for struct member 'bending_random'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Random stiffness of hairs<h4>Blender Source Code:</h4>
	 * <p> hair dynamics </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__bending_random);
	 * CPointer&lt;Float&gt; p_bending_random = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bending_random'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bending_random = new long[]{580, 628};

	/**
	 * Field descriptor (offset) for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__mtex);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;MTex&gt;&gt;&gt; p_mtex = p.cast(new Class[]{CArrayFacade.class, CPointer.class, MTex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mtex'</li>
	 * <li>Signature: 'MTex*[18]'</li>
	 * <li>Actual Size (32bit/64bit): 72/144</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mtex = new long[]{584, 632};

	/**
	 * Field descriptor (offset) for struct member 'dup_group'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__dup_group);
	 * CPointer&lt;CPointer&lt;Group&gt;&gt; p_dup_group = p.cast(new Class[]{CPointer.class, Group.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dup_group'</li>
	 * <li>Signature: 'Group*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dup_group = new long[]{656, 776};

	/**
	 * Field descriptor (offset) for struct member 'dupliweights'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__dupliweights);
	 * CPointer&lt;ListBase&gt; p_dupliweights = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dupliweights'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dupliweights = new long[]{660, 784};

	/**
	 * Field descriptor (offset) for struct member 'eff_group'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__eff_group);
	 * CPointer&lt;CPointer&lt;Group&gt;&gt; p_eff_group = p.cast(new Class[]{CPointer.class, Group.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eff_group'</li>
	 * <li>Signature: 'Group*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eff_group = new long[]{668, 800};

	/**
	 * Field descriptor (offset) for struct member 'dup_ob'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__dup_ob);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_dup_ob = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dup_ob'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dup_ob = new long[]{672, 808};

	/**
	 * Field descriptor (offset) for struct member 'bb_ob'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__bb_ob);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_bb_ob = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb_ob'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb_ob = new long[]{676, 816};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{680, 824};

	/**
	 * Field descriptor (offset) for struct member 'pd'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__pd);
	 * CPointer&lt;CPointer&lt;PartDeflect&gt;&gt; p_pd = p.cast(new Class[]{CPointer.class, PartDeflect.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pd'</li>
	 * <li>Signature: 'PartDeflect*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pd = new long[]{684, 832};

	/**
	 * Field descriptor (offset) for struct member 'pd2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__pd2);
	 * CPointer&lt;CPointer&lt;PartDeflect&gt;&gt; p_pd2 = p.cast(new Class[]{CPointer.class, PartDeflect.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pd2'</li>
	 * <li>Signature: 'PartDeflect*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pd2 = new long[]{688, 840};

	/**
	 * Field descriptor (offset) for struct member 'use_modifier_stack'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Emit particles from mesh with modifiers applied (must use same subsurf level for viewport and render for correct results)<h4>Blender Source Code:</h4>
	 * <p> modified dm support </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__use_modifier_stack);
	 * CPointer&lt;Short&gt; p_use_modifier_stack = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_modifier_stack'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_modifier_stack = new long[]{692, 848};

	/**
	 * Field descriptor (offset) for struct member 'pad5'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSettings particlesettings = ...;
	 * CPointer&lt;Object&gt; p = particlesettings.__dna__addressof(ParticleSettings.__DNA__FIELD__pad5);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_pad5 = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad5'</li>
	 * <li>Signature: 'short[3]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad5 = new long[]{694, 850};

	public ParticleSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ParticleSettings(ParticleSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public ID getId() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(ID id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, id);
		} else {
			__io__generic__copy( getId(), id);
		}
	}

	/**
	 * Get method for struct member 'adt'.
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'boids'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__boids
	 */
	
	public CPointer<BoidSettings> getBoids() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BoidSettings.class};
		return new CPointer<BoidSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BoidSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'boids'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__boids
	 */
	
	public void setBoids(CPointer<BoidSettings> boids) throws IOException
	{
		long __address = ((boids == null) ? 0 : boids.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'fluid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__fluid
	 */
	
	public CPointer<SPHFluidSettings> getFluid() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SPHFluidSettings.class};
		return new CPointer<SPHFluidSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SPHFluidSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fluid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__fluid
	 */
	
	public void setFluid(CPointer<SPHFluidSettings> fluid) throws IOException
	{
		long __address = ((fluid == null) ? 0 : fluid.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'effector_weights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__effector_weights
	 */
	
	public CPointer<EffectorWeights> getEffector_weights() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{EffectorWeights.class};
		return new CPointer<EffectorWeights>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, EffectorWeights.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'effector_weights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__effector_weights
	 */
	
	public void setEffector_weights(CPointer<EffectorWeights> effector_weights) throws IOException
	{
		long __address = ((effector_weights == null) ? 0 : effector_weights.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'collision_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit colliders to this Group
	 * @see #__DNA__FIELD__collision_group
	 */
	
	public CPointer<Group> getCollision_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 116);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Group.class};
		return new CPointer<Group>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Group.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'collision_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit colliders to this Group
	 * @see #__DNA__FIELD__collision_group
	 */
	
	public void setCollision_group(CPointer<Group> collision_group) throws IOException
	{
		long __address = ((collision_group == null) ? 0 : collision_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 160);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 160, flag);
		} else {
			__io__block.writeInt(__io__address + 120, flag);
		}
	}

	/**
	 * Get method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public int getRt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 164);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public void setRt(int rt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 164, rt);
		} else {
			__io__block.writeInt(__io__address + 124, rt);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle Type
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 168);
		} else {
			return __io__block.readShort(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle Type
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 168, type);
		} else {
			__io__block.writeShort(__io__address + 128, type);
		}
	}

	/**
	 * Get method for struct member 'from'.
	 * @see #__DNA__FIELD__from
	 */
	
	public short getFrom() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 170);
		} else {
			return __io__block.readShort(__io__address + 130);
		}
	}

	/**
	 * Set method for struct member 'from'.
	 * @see #__DNA__FIELD__from
	 */
	
	public void setFrom(short from) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 170, from);
		} else {
			__io__block.writeShort(__io__address + 130, from);
		}
	}

	/**
	 * Get method for struct member 'distr'.
	 * @see #__DNA__FIELD__distr
	 */
	
	public short getDistr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 172);
		} else {
			return __io__block.readShort(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'distr'.
	 * @see #__DNA__FIELD__distr
	 */
	
	public void setDistr(short distr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 172, distr);
		} else {
			__io__block.writeShort(__io__address + 132, distr);
		}
	}

	/**
	 * Get method for struct member 'texact'.
	 * @see #__DNA__FIELD__texact
	 */
	
	public short getTexact() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 174);
		} else {
			return __io__block.readShort(__io__address + 134);
		}
	}

	/**
	 * Set method for struct member 'texact'.
	 * @see #__DNA__FIELD__texact
	 */
	
	public void setTexact(short texact) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 174, texact);
		} else {
			__io__block.writeShort(__io__address + 134, texact);
		}
	}

	/**
	 * Get method for struct member 'phystype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> physics modes </p>
	 * @see #__DNA__FIELD__phystype
	 */
	
	public short getPhystype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 176);
		} else {
			return __io__block.readShort(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'phystype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> physics modes </p>
	 * @see #__DNA__FIELD__phystype
	 */
	
	public void setPhystype(short phystype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 176, phystype);
		} else {
			__io__block.writeShort(__io__address + 136, phystype);
		}
	}

	/**
	 * Get method for struct member 'rotmode'.
	 * @see #__DNA__FIELD__rotmode
	 */
	
	public short getRotmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 178);
		} else {
			return __io__block.readShort(__io__address + 138);
		}
	}

	/**
	 * Set method for struct member 'rotmode'.
	 * @see #__DNA__FIELD__rotmode
	 */
	
	public void setRotmode(short rotmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 178, rotmode);
		} else {
			__io__block.writeShort(__io__address + 138, rotmode);
		}
	}

	/**
	 * Get method for struct member 'avemode'.
	 * @see #__DNA__FIELD__avemode
	 */
	
	public short getAvemode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 180);
		} else {
			return __io__block.readShort(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'avemode'.
	 * @see #__DNA__FIELD__avemode
	 */
	
	public void setAvemode(short avemode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 180, avemode);
		} else {
			__io__block.writeShort(__io__address + 140, avemode);
		}
	}

	/**
	 * Get method for struct member 'reactevent'.
	 * @see #__DNA__FIELD__reactevent
	 */
	
	public short getReactevent() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 182);
		} else {
			return __io__block.readShort(__io__address + 142);
		}
	}

	/**
	 * Set method for struct member 'reactevent'.
	 * @see #__DNA__FIELD__reactevent
	 */
	
	public void setReactevent(short reactevent) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 182, reactevent);
		} else {
			__io__block.writeShort(__io__address + 142, reactevent);
		}
	}

	/**
	 * Get method for struct member 'draw'.
	 * @see #__DNA__FIELD__draw
	 */
	
	public int getDraw() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 184);
		} else {
			return __io__block.readInt(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'draw'.
	 * @see #__DNA__FIELD__draw
	 */
	
	public void setDraw(int draw) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 184, draw);
		} else {
			__io__block.writeInt(__io__address + 144, draw);
		}
	}

	/**
	 * Get method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public int getPad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 188);
		} else {
			return __io__block.readInt(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public void setPad1(int pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 188, pad1);
		} else {
			__io__block.writeInt(__io__address + 148, pad1);
		}
	}

	/**
	 * Get method for struct member 'draw_as'.
	 * @see #__DNA__FIELD__draw_as
	 */
	
	public short getDraw_as() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 192);
		} else {
			return __io__block.readShort(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'draw_as'.
	 * @see #__DNA__FIELD__draw_as
	 */
	
	public void setDraw_as(short draw_as) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 192, draw_as);
		} else {
			__io__block.writeShort(__io__address + 152, draw_as);
		}
	}

	/**
	 * Get method for struct member 'draw_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of particles on viewport in pixels (0=default)
	 * @see #__DNA__FIELD__draw_size
	 */
	
	public short getDraw_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 194);
		} else {
			return __io__block.readShort(__io__address + 154);
		}
	}

	/**
	 * Set method for struct member 'draw_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of particles on viewport in pixels (0=default)
	 * @see #__DNA__FIELD__draw_size
	 */
	
	public void setDraw_size(short draw_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 194, draw_size);
		} else {
			__io__block.writeShort(__io__address + 154, draw_size);
		}
	}

	/**
	 * Get method for struct member 'childtype'.
	 * @see #__DNA__FIELD__childtype
	 */
	
	public short getChildtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 196);
		} else {
			return __io__block.readShort(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'childtype'.
	 * @see #__DNA__FIELD__childtype
	 */
	
	public void setChildtype(short childtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 196, childtype);
		} else {
			__io__block.writeShort(__io__address + 156, childtype);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public short getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 198);
		} else {
			return __io__block.readShort(__io__address + 158);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(short pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 198, pad2);
		} else {
			__io__block.writeShort(__io__address + 158, pad2);
		}
	}

	/**
	 * Get method for struct member 'ren_as'.
	 * @see #__DNA__FIELD__ren_as
	 */
	
	public short getRen_as() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 200);
		} else {
			return __io__block.readShort(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'ren_as'.
	 * @see #__DNA__FIELD__ren_as
	 */
	
	public void setRen_as(short ren_as) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 200, ren_as);
		} else {
			__io__block.writeShort(__io__address + 160, ren_as);
		}
	}

	/**
	 * Get method for struct member 'subframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Subframes to simulate for improved stability and finer granularity simulations (dt = timestep / (subframes + 1))
	 * @see #__DNA__FIELD__subframes
	 */
	
	public short getSubframes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 202);
		} else {
			return __io__block.readShort(__io__address + 162);
		}
	}

	/**
	 * Set method for struct member 'subframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Subframes to simulate for improved stability and finer granularity simulations (dt = timestep / (subframes + 1))
	 * @see #__DNA__FIELD__subframes
	 */
	
	public void setSubframes(short subframes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 202, subframes);
		} else {
			__io__block.writeShort(__io__address + 162, subframes);
		}
	}

	/**
	 * Get method for struct member 'draw_col'.
	 * @see #__DNA__FIELD__draw_col
	 */
	
	public short getDraw_col() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 204);
		} else {
			return __io__block.readShort(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'draw_col'.
	 * @see #__DNA__FIELD__draw_col
	 */
	
	public void setDraw_col(short draw_col) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 204, draw_col);
		} else {
			__io__block.writeShort(__io__address + 164, draw_col);
		}
	}

	/**
	 * Get method for struct member 'draw_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How many steps paths are drawn with (power of 2)<h4>Blender Source Code:</h4>
	 * <p> number of path segments, power of 2 except </p>
	 * @see #__DNA__FIELD__draw_step
	 */
	
	public short getDraw_step() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 206);
		} else {
			return __io__block.readShort(__io__address + 166);
		}
	}

	/**
	 * Set method for struct member 'draw_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How many steps paths are drawn with (power of 2)<h4>Blender Source Code:</h4>
	 * <p> number of path segments, power of 2 except </p>
	 * @see #__DNA__FIELD__draw_step
	 */
	
	public void setDraw_step(short draw_step) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 206, draw_step);
		} else {
			__io__block.writeShort(__io__address + 166, draw_step);
		}
	}

	/**
	 * Get method for struct member 'ren_step'.
	 * @see #__DNA__FIELD__ren_step
	 */
	
	public short getRen_step() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 208);
		} else {
			return __io__block.readShort(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'ren_step'.
	 * @see #__DNA__FIELD__ren_step
	 */
	
	public void setRen_step(short ren_step) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 208, ren_step);
		} else {
			__io__block.writeShort(__io__address + 168, ren_step);
		}
	}

	/**
	 * Get method for struct member 'hair_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of hair segments
	 * @see #__DNA__FIELD__hair_step
	 */
	
	public short getHair_step() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 210);
		} else {
			return __io__block.readShort(__io__address + 170);
		}
	}

	/**
	 * Set method for struct member 'hair_step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of hair segments
	 * @see #__DNA__FIELD__hair_step
	 */
	
	public void setHair_step(short hair_step) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 210, hair_step);
		} else {
			__io__block.writeShort(__io__address + 170, hair_step);
		}
	}

	/**
	 * Get method for struct member 'keys_step'.
	 * @see #__DNA__FIELD__keys_step
	 */
	
	public short getKeys_step() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 212);
		} else {
			return __io__block.readShort(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'keys_step'.
	 * @see #__DNA__FIELD__keys_step
	 */
	
	public void setKeys_step(short keys_step) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 212, keys_step);
		} else {
			__io__block.writeShort(__io__address + 172, keys_step);
		}
	}

	/**
	 * Get method for struct member 'adapt_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> adaptive path rendering </p>
	 * @see #__DNA__FIELD__adapt_angle
	 */
	
	public short getAdapt_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 214);
		} else {
			return __io__block.readShort(__io__address + 174);
		}
	}

	/**
	 * Set method for struct member 'adapt_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> adaptive path rendering </p>
	 * @see #__DNA__FIELD__adapt_angle
	 */
	
	public void setAdapt_angle(short adapt_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 214, adapt_angle);
		} else {
			__io__block.writeShort(__io__address + 174, adapt_angle);
		}
	}

	/**
	 * Get method for struct member 'adapt_pix'.
	 * @see #__DNA__FIELD__adapt_pix
	 */
	
	public short getAdapt_pix() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 216);
		} else {
			return __io__block.readShort(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'adapt_pix'.
	 * @see #__DNA__FIELD__adapt_pix
	 */
	
	public void setAdapt_pix(short adapt_pix) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 216, adapt_pix);
		} else {
			__io__block.writeShort(__io__address + 176, adapt_pix);
		}
	}

	/**
	 * Get method for struct member 'disp'.
	 * @see #__DNA__FIELD__disp
	 */
	
	public short getDisp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 218);
		} else {
			return __io__block.readShort(__io__address + 178);
		}
	}

	/**
	 * Set method for struct member 'disp'.
	 * @see #__DNA__FIELD__disp
	 */
	
	public void setDisp(short disp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 218, disp);
		} else {
			__io__block.writeShort(__io__address + 178, disp);
		}
	}

	/**
	 * Get method for struct member 'omat'.
	 * @see #__DNA__FIELD__omat
	 */
	
	public short getOmat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 220);
		} else {
			return __io__block.readShort(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'omat'.
	 * @see #__DNA__FIELD__omat
	 */
	
	public void setOmat(short omat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 220, omat);
		} else {
			__io__block.writeShort(__io__address + 180, omat);
		}
	}

	/**
	 * Get method for struct member 'interpolation'.
	 * @see #__DNA__FIELD__interpolation
	 */
	
	public short getInterpolation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 222);
		} else {
			return __io__block.readShort(__io__address + 182);
		}
	}

	/**
	 * Set method for struct member 'interpolation'.
	 * @see #__DNA__FIELD__interpolation
	 */
	
	public void setInterpolation(short interpolation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 222, interpolation);
		} else {
			__io__block.writeShort(__io__address + 182, interpolation);
		}
	}

	/**
	 * Get method for struct member 'integrator'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Algorithm used to calculate physics, from the fastest to the most stable/accurate: Midpoint, Euler, Verlet, RK4 (Old)
	 * @see #__DNA__FIELD__integrator
	 */
	
	public short getIntegrator() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 224);
		} else {
			return __io__block.readShort(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'integrator'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Algorithm used to calculate physics, from the fastest to the most stable/accurate: Midpoint, Euler, Verlet, RK4 (Old)
	 * @see #__DNA__FIELD__integrator
	 */
	
	public void setIntegrator(short integrator) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 224, integrator);
		} else {
			__io__block.writeShort(__io__address + 184, integrator);
		}
	}

	/**
	 * Get method for struct member 'rotfrom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__rotfrom
	 */
	
	public short getRotfrom() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 226);
		} else {
			return __io__block.readShort(__io__address + 186);
		}
	}

	/**
	 * Set method for struct member 'rotfrom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__rotfrom
	 */
	
	public void setRotfrom(short rotfrom) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 226, rotfrom);
		} else {
			__io__block.writeShort(__io__address + 186, rotfrom);
		}
	}

	/**
	 * Get method for struct member 'kink'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of periodic offset on the path
	 * @see #__DNA__FIELD__kink
	 */
	
	public short getKink() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 228);
		} else {
			return __io__block.readShort(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'kink'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of periodic offset on the path
	 * @see #__DNA__FIELD__kink
	 */
	
	public void setKink(short kink) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 228, kink);
		} else {
			__io__block.writeShort(__io__address + 188, kink);
		}
	}

	/**
	 * Get method for struct member 'kink_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Which axis to use for offset
	 * @see #__DNA__FIELD__kink_axis
	 */
	
	public short getKink_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 230);
		} else {
			return __io__block.readShort(__io__address + 190);
		}
	}

	/**
	 * Set method for struct member 'kink_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Which axis to use for offset
	 * @see #__DNA__FIELD__kink_axis
	 */
	
	public void setKink_axis(short kink_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 230, kink_axis);
		} else {
			__io__block.writeShort(__io__address + 190, kink_axis);
		}
	}

	/**
	 * Get method for struct member 'bb_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> billboards </p>
	 * @see #__DNA__FIELD__bb_align
	 */
	
	public short getBb_align() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 232);
		} else {
			return __io__block.readShort(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'bb_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> billboards </p>
	 * @see #__DNA__FIELD__bb_align
	 */
	
	public void setBb_align(short bb_align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 232, bb_align);
		} else {
			__io__block.writeShort(__io__address + 192, bb_align);
		}
	}

	/**
	 * Get method for struct member 'bb_uv_split'.
	 * @see #__DNA__FIELD__bb_uv_split
	 */
	
	public short getBb_uv_split() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 234);
		} else {
			return __io__block.readShort(__io__address + 194);
		}
	}

	/**
	 * Set method for struct member 'bb_uv_split'.
	 * @see #__DNA__FIELD__bb_uv_split
	 */
	
	public void setBb_uv_split(short bb_uv_split) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 234, bb_uv_split);
		} else {
			__io__block.writeShort(__io__address + 194, bb_uv_split);
		}
	}

	/**
	 * Get method for struct member 'bb_anim'.
	 * @see #__DNA__FIELD__bb_anim
	 */
	
	public short getBb_anim() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 236);
		} else {
			return __io__block.readShort(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'bb_anim'.
	 * @see #__DNA__FIELD__bb_anim
	 */
	
	public void setBb_anim(short bb_anim) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 236, bb_anim);
		} else {
			__io__block.writeShort(__io__address + 196, bb_anim);
		}
	}

	/**
	 * Get method for struct member 'bb_split_offset'.
	 * @see #__DNA__FIELD__bb_split_offset
	 */
	
	public short getBb_split_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 238);
		} else {
			return __io__block.readShort(__io__address + 198);
		}
	}

	/**
	 * Set method for struct member 'bb_split_offset'.
	 * @see #__DNA__FIELD__bb_split_offset
	 */
	
	public void setBb_split_offset(short bb_split_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 238, bb_split_offset);
		} else {
			__io__block.writeShort(__io__address + 198, bb_split_offset);
		}
	}

	/**
	 * Get method for struct member 'bb_tilt'.
	 * @see #__DNA__FIELD__bb_tilt
	 */
	
	public float getBb_tilt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 240);
		} else {
			return __io__block.readFloat(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'bb_tilt'.
	 * @see #__DNA__FIELD__bb_tilt
	 */
	
	public void setBb_tilt(float bb_tilt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 240, bb_tilt);
		} else {
			__io__block.writeFloat(__io__address + 200, bb_tilt);
		}
	}

	/**
	 * Get method for struct member 'bb_rand_tilt'.
	 * @see #__DNA__FIELD__bb_rand_tilt
	 */
	
	public float getBb_rand_tilt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 244);
		} else {
			return __io__block.readFloat(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'bb_rand_tilt'.
	 * @see #__DNA__FIELD__bb_rand_tilt
	 */
	
	public void setBb_rand_tilt(float bb_rand_tilt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 244, bb_rand_tilt);
		} else {
			__io__block.writeFloat(__io__address + 204, bb_rand_tilt);
		}
	}

	/**
	 * Get method for struct member 'bb_offset'.
	 * @see #__DNA__FIELD__bb_offset
	 */
	
	public CArrayFacade<Float> getBb_offset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 208, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bb_offset'.
	 * @see #__DNA__FIELD__bb_offset
	 */
	
	public void setBb_offset(CArrayFacade<Float> bb_offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 208;
		}
		if (__io__equals(bb_offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bb_offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bb_offset);
		} else {
			__io__generic__copy( getBb_offset(), bb_offset);
		}
	}

	/**
	 * Get method for struct member 'bb_size'.
	 * @see #__DNA__FIELD__bb_size
	 */
	
	public CArrayFacade<Float> getBb_size() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 256, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bb_size'.
	 * @see #__DNA__FIELD__bb_size
	 */
	
	public void setBb_size(CArrayFacade<Float> bb_size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 256;
		} else {
			__dna__offset = 216;
		}
		if (__io__equals(bb_size, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bb_size)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bb_size);
		} else {
			__io__generic__copy( getBb_size(), bb_size);
		}
	}

	/**
	 * Get method for struct member 'bb_vel_head'.
	 * @see #__DNA__FIELD__bb_vel_head
	 */
	
	public float getBb_vel_head() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 264);
		} else {
			return __io__block.readFloat(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'bb_vel_head'.
	 * @see #__DNA__FIELD__bb_vel_head
	 */
	
	public void setBb_vel_head(float bb_vel_head) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 264, bb_vel_head);
		} else {
			__io__block.writeFloat(__io__address + 224, bb_vel_head);
		}
	}

	/**
	 * Get method for struct member 'bb_vel_tail'.
	 * @see #__DNA__FIELD__bb_vel_tail
	 */
	
	public float getBb_vel_tail() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 268);
		} else {
			return __io__block.readFloat(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'bb_vel_tail'.
	 * @see #__DNA__FIELD__bb_vel_tail
	 */
	
	public void setBb_vel_tail(float bb_vel_tail) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 268, bb_vel_tail);
		} else {
			__io__block.writeFloat(__io__address + 228, bb_vel_tail);
		}
	}

	/**
	 * Get method for struct member 'color_vec_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> draw color </p>
	 * @see #__DNA__FIELD__color_vec_max
	 */
	
	public float getColor_vec_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 272);
		} else {
			return __io__block.readFloat(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'color_vec_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> draw color </p>
	 * @see #__DNA__FIELD__color_vec_max
	 */
	
	public void setColor_vec_max(float color_vec_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 272, color_vec_max);
		} else {
			__io__block.writeFloat(__io__address + 232, color_vec_max);
		}
	}

	/**
	 * Get method for struct member 'simplify_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> simplification </p>
	 * @see #__DNA__FIELD__simplify_flag
	 */
	
	public short getSimplify_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 276);
		} else {
			return __io__block.readShort(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'simplify_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> simplification </p>
	 * @see #__DNA__FIELD__simplify_flag
	 */
	
	public void setSimplify_flag(short simplify_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 276, simplify_flag);
		} else {
			__io__block.writeShort(__io__address + 236, simplify_flag);
		}
	}

	/**
	 * Get method for struct member 'simplify_refsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Reference size in pixels, after which simplification begins
	 * @see #__DNA__FIELD__simplify_refsize
	 */
	
	public short getSimplify_refsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 278);
		} else {
			return __io__block.readShort(__io__address + 238);
		}
	}

	/**
	 * Set method for struct member 'simplify_refsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Reference size in pixels, after which simplification begins
	 * @see #__DNA__FIELD__simplify_refsize
	 */
	
	public void setSimplify_refsize(short simplify_refsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 278, simplify_refsize);
		} else {
			__io__block.writeShort(__io__address + 238, simplify_refsize);
		}
	}

	/**
	 * Get method for struct member 'simplify_rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of simplification
	 * @see #__DNA__FIELD__simplify_rate
	 */
	
	public float getSimplify_rate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 280);
		} else {
			return __io__block.readFloat(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'simplify_rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of simplification
	 * @see #__DNA__FIELD__simplify_rate
	 */
	
	public void setSimplify_rate(float simplify_rate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 280, simplify_rate);
		} else {
			__io__block.writeFloat(__io__address + 240, simplify_rate);
		}
	}

	/**
	 * Get method for struct member 'simplify_transition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Transition period for fading out strands
	 * @see #__DNA__FIELD__simplify_transition
	 */
	
	public float getSimplify_transition() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 284);
		} else {
			return __io__block.readFloat(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'simplify_transition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Transition period for fading out strands
	 * @see #__DNA__FIELD__simplify_transition
	 */
	
	public void setSimplify_transition(float simplify_transition) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 284, simplify_transition);
		} else {
			__io__block.writeFloat(__io__address + 244, simplify_transition);
		}
	}

	/**
	 * Get method for struct member 'simplify_viewport'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of Simplification
	 * @see #__DNA__FIELD__simplify_viewport
	 */
	
	public float getSimplify_viewport() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 288);
		} else {
			return __io__block.readFloat(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'simplify_viewport'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of Simplification
	 * @see #__DNA__FIELD__simplify_viewport
	 */
	
	public void setSimplify_viewport(float simplify_viewport) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 288, simplify_viewport);
		} else {
			__io__block.writeFloat(__io__address + 248, simplify_viewport);
		}
	}

	/**
	 * Get method for struct member 'sta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> time and emission </p>
	 * @see #__DNA__FIELD__sta
	 */
	
	public float getSta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 292);
		} else {
			return __io__block.readFloat(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'sta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> time and emission </p>
	 * @see #__DNA__FIELD__sta
	 */
	
	public void setSta(float sta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 292, sta);
		} else {
			__io__block.writeFloat(__io__address + 252, sta);
		}
	}

	/**
	 * Get method for struct member 'end'.
	 * @see #__DNA__FIELD__end
	 */
	
	public float getEnd() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 296);
		} else {
			return __io__block.readFloat(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'end'.
	 * @see #__DNA__FIELD__end
	 */
	
	public void setEnd(float end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 296, end);
		} else {
			__io__block.writeFloat(__io__address + 256, end);
		}
	}

	/**
	 * Get method for struct member 'lifetime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Life span of the particles
	 * @see #__DNA__FIELD__lifetime
	 */
	
	public float getLifetime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 300);
		} else {
			return __io__block.readFloat(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'lifetime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Life span of the particles
	 * @see #__DNA__FIELD__lifetime
	 */
	
	public void setLifetime(float lifetime) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 300, lifetime);
		} else {
			__io__block.writeFloat(__io__address + 260, lifetime);
		}
	}

	/**
	 * Get method for struct member 'randlife'.
	 * @see #__DNA__FIELD__randlife
	 */
	
	public float getRandlife() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 304);
		} else {
			return __io__block.readFloat(__io__address + 264);
		}
	}

	/**
	 * Set method for struct member 'randlife'.
	 * @see #__DNA__FIELD__randlife
	 */
	
	public void setRandlife(float randlife) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 304, randlife);
		} else {
			__io__block.writeFloat(__io__address + 264, randlife);
		}
	}

	/**
	 * Get method for struct member 'timetweak'.
	 * @see #__DNA__FIELD__timetweak
	 */
	
	public float getTimetweak() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 308);
		} else {
			return __io__block.readFloat(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'timetweak'.
	 * @see #__DNA__FIELD__timetweak
	 */
	
	public void setTimetweak(float timetweak) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 308, timetweak);
		} else {
			__io__block.writeFloat(__io__address + 268, timetweak);
		}
	}

	/**
	 * Get method for struct member 'courant_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The relative distance a particle can move before requiring more subframes (target Courant number); 0.01-0.3 is the recommended range
	 * @see #__DNA__FIELD__courant_target
	 */
	
	public float getCourant_target() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 312);
		} else {
			return __io__block.readFloat(__io__address + 272);
		}
	}

	/**
	 * Set method for struct member 'courant_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The relative distance a particle can move before requiring more subframes (target Courant number); 0.01-0.3 is the recommended range
	 * @see #__DNA__FIELD__courant_target
	 */
	
	public void setCourant_target(float courant_target) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 312, courant_target);
		} else {
			__io__block.writeFloat(__io__address + 272, courant_target);
		}
	}

	/**
	 * Get method for struct member 'jitfac'.
	 * @see #__DNA__FIELD__jitfac
	 */
	
	public float getJitfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 316);
		} else {
			return __io__block.readFloat(__io__address + 276);
		}
	}

	/**
	 * Set method for struct member 'jitfac'.
	 * @see #__DNA__FIELD__jitfac
	 */
	
	public void setJitfac(float jitfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 316, jitfac);
		} else {
			__io__block.writeFloat(__io__address + 276, jitfac);
		}
	}

	/**
	 * Get method for struct member 'eff_hair'.
	 * @see #__DNA__FIELD__eff_hair
	 */
	
	public float getEff_hair() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 320);
		} else {
			return __io__block.readFloat(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'eff_hair'.
	 * @see #__DNA__FIELD__eff_hair
	 */
	
	public void setEff_hair(float eff_hair) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 320, eff_hair);
		} else {
			__io__block.writeFloat(__io__address + 280, eff_hair);
		}
	}

	/**
	 * Get method for struct member 'grid_rand'.
	 * @see #__DNA__FIELD__grid_rand
	 */
	
	public float getGrid_rand() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 324);
		} else {
			return __io__block.readFloat(__io__address + 284);
		}
	}

	/**
	 * Set method for struct member 'grid_rand'.
	 * @see #__DNA__FIELD__grid_rand
	 */
	
	public void setGrid_rand(float grid_rand) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 324, grid_rand);
		} else {
			__io__block.writeFloat(__io__address + 284, grid_rand);
		}
	}

	/**
	 * Get method for struct member 'ps_offset'.
	 * @see #__DNA__FIELD__ps_offset
	 */
	
	public CArrayFacade<Float> getPs_offset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 328, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 288, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ps_offset'.
	 * @see #__DNA__FIELD__ps_offset
	 */
	
	public void setPs_offset(CArrayFacade<Float> ps_offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 328;
		} else {
			__dna__offset = 288;
		}
		if (__io__equals(ps_offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ps_offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ps_offset);
		} else {
			__io__generic__copy( getPs_offset(), ps_offset);
		}
	}

	/**
	 * Get method for struct member 'totpart'.
	 * @see #__DNA__FIELD__totpart
	 */
	
	public int getTotpart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 332);
		} else {
			return __io__block.readInt(__io__address + 292);
		}
	}

	/**
	 * Set method for struct member 'totpart'.
	 * @see #__DNA__FIELD__totpart
	 */
	
	public void setTotpart(int totpart) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 332, totpart);
		} else {
			__io__block.writeInt(__io__address + 292, totpart);
		}
	}

	/**
	 * Get method for struct member 'userjit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Emission locations / face (0 = automatic)
	 * @see #__DNA__FIELD__userjit
	 */
	
	public int getUserjit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 336);
		} else {
			return __io__block.readInt(__io__address + 296);
		}
	}

	/**
	 * Set method for struct member 'userjit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Emission locations / face (0 = automatic)
	 * @see #__DNA__FIELD__userjit
	 */
	
	public void setUserjit(int userjit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 336, userjit);
		} else {
			__io__block.writeInt(__io__address + 296, userjit);
		}
	}

	/**
	 * Get method for struct member 'grid_res'.
	 * @see #__DNA__FIELD__grid_res
	 */
	
	public int getGrid_res() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 340);
		} else {
			return __io__block.readInt(__io__address + 300);
		}
	}

	/**
	 * Set method for struct member 'grid_res'.
	 * @see #__DNA__FIELD__grid_res
	 */
	
	public void setGrid_res(int grid_res) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 340, grid_res);
		} else {
			__io__block.writeInt(__io__address + 300, grid_res);
		}
	}

	/**
	 * Get method for struct member 'effector_amount'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How many particles are effectors (0 is all particles)
	 * @see #__DNA__FIELD__effector_amount
	 */
	
	public int getEffector_amount() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 344);
		} else {
			return __io__block.readInt(__io__address + 304);
		}
	}

	/**
	 * Set method for struct member 'effector_amount'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How many particles are effectors (0 is all particles)
	 * @see #__DNA__FIELD__effector_amount
	 */
	
	public void setEffector_amount(int effector_amount) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 344, effector_amount);
		} else {
			__io__block.writeInt(__io__address + 304, effector_amount);
		}
	}

	/**
	 * Get method for struct member 'time_flag'.
	 * @see #__DNA__FIELD__time_flag
	 */
	
	public short getTime_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 348);
		} else {
			return __io__block.readShort(__io__address + 308);
		}
	}

	/**
	 * Set method for struct member 'time_flag'.
	 * @see #__DNA__FIELD__time_flag
	 */
	
	public void setTime_flag(short time_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 348, time_flag);
		} else {
			__io__block.writeShort(__io__address + 308, time_flag);
		}
	}

	/**
	 * Get method for struct member 'time_pad'.
	 * @see #__DNA__FIELD__time_pad
	 */
	
	public CArrayFacade<Short> getTime_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 350, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 310, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'time_pad'.
	 * @see #__DNA__FIELD__time_pad
	 */
	
	public void setTime_pad(CArrayFacade<Short> time_pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 350;
		} else {
			__dna__offset = 310;
		}
		if (__io__equals(time_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, time_pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, time_pad);
		} else {
			__io__generic__copy( getTime_pad(), time_pad);
		}
	}

	/**
	 * Get method for struct member 'normfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> initial velocity factors </p>
	 * @see #__DNA__FIELD__normfac
	 */
	
	public float getNormfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 356);
		} else {
			return __io__block.readFloat(__io__address + 316);
		}
	}

	/**
	 * Set method for struct member 'normfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> initial velocity factors </p>
	 * @see #__DNA__FIELD__normfac
	 */
	
	public void setNormfac(float normfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 356, normfac);
		} else {
			__io__block.writeFloat(__io__address + 316, normfac);
		}
	}

	/**
	 * Get method for struct member 'obfac'.
	 * @see #__DNA__FIELD__obfac
	 */
	
	public float getObfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 360);
		} else {
			return __io__block.readFloat(__io__address + 320);
		}
	}

	/**
	 * Set method for struct member 'obfac'.
	 * @see #__DNA__FIELD__obfac
	 */
	
	public void setObfac(float obfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 360, obfac);
		} else {
			__io__block.writeFloat(__io__address + 320, obfac);
		}
	}

	/**
	 * Get method for struct member 'randfac'.
	 * @see #__DNA__FIELD__randfac
	 */
	
	public float getRandfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 364);
		} else {
			return __io__block.readFloat(__io__address + 324);
		}
	}

	/**
	 * Set method for struct member 'randfac'.
	 * @see #__DNA__FIELD__randfac
	 */
	
	public void setRandfac(float randfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 364, randfac);
		} else {
			__io__block.writeFloat(__io__address + 324, randfac);
		}
	}

	/**
	 * Get method for struct member 'partfac'.
	 * @see #__DNA__FIELD__partfac
	 */
	
	public float getPartfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 368);
		} else {
			return __io__block.readFloat(__io__address + 328);
		}
	}

	/**
	 * Set method for struct member 'partfac'.
	 * @see #__DNA__FIELD__partfac
	 */
	
	public void setPartfac(float partfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 368, partfac);
		} else {
			__io__block.writeFloat(__io__address + 328, partfac);
		}
	}

	/**
	 * Get method for struct member 'tanfac'.
	 * @see #__DNA__FIELD__tanfac
	 */
	
	public float getTanfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 372);
		} else {
			return __io__block.readFloat(__io__address + 332);
		}
	}

	/**
	 * Set method for struct member 'tanfac'.
	 * @see #__DNA__FIELD__tanfac
	 */
	
	public void setTanfac(float tanfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 372, tanfac);
		} else {
			__io__block.writeFloat(__io__address + 332, tanfac);
		}
	}

	/**
	 * Get method for struct member 'tanphase'.
	 * @see #__DNA__FIELD__tanphase
	 */
	
	public float getTanphase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 376);
		} else {
			return __io__block.readFloat(__io__address + 336);
		}
	}

	/**
	 * Set method for struct member 'tanphase'.
	 * @see #__DNA__FIELD__tanphase
	 */
	
	public void setTanphase(float tanphase) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 376, tanphase);
		} else {
			__io__block.writeFloat(__io__address + 336, tanphase);
		}
	}

	/**
	 * Get method for struct member 'reactfac'.
	 * @see #__DNA__FIELD__reactfac
	 */
	
	public float getReactfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 380);
		} else {
			return __io__block.readFloat(__io__address + 340);
		}
	}

	/**
	 * Set method for struct member 'reactfac'.
	 * @see #__DNA__FIELD__reactfac
	 */
	
	public void setReactfac(float reactfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 380, reactfac);
		} else {
			__io__block.writeFloat(__io__address + 340, reactfac);
		}
	}

	/**
	 * Get method for struct member 'ob_vel'.
	 * @see #__DNA__FIELD__ob_vel
	 */
	
	public CArrayFacade<Float> getOb_vel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 384, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 344, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ob_vel'.
	 * @see #__DNA__FIELD__ob_vel
	 */
	
	public void setOb_vel(CArrayFacade<Float> ob_vel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 384;
		} else {
			__dna__offset = 344;
		}
		if (__io__equals(ob_vel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ob_vel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ob_vel);
		} else {
			__io__generic__copy( getOb_vel(), ob_vel);
		}
	}

	/**
	 * Get method for struct member 'avefac'.
	 * @see #__DNA__FIELD__avefac
	 */
	
	public float getAvefac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 396);
		} else {
			return __io__block.readFloat(__io__address + 356);
		}
	}

	/**
	 * Set method for struct member 'avefac'.
	 * @see #__DNA__FIELD__avefac
	 */
	
	public void setAvefac(float avefac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 396, avefac);
		} else {
			__io__block.writeFloat(__io__address + 356, avefac);
		}
	}

	/**
	 * Get method for struct member 'phasefac'.
	 * @see #__DNA__FIELD__phasefac
	 */
	
	public float getPhasefac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 400);
		} else {
			return __io__block.readFloat(__io__address + 360);
		}
	}

	/**
	 * Set method for struct member 'phasefac'.
	 * @see #__DNA__FIELD__phasefac
	 */
	
	public void setPhasefac(float phasefac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 400, phasefac);
		} else {
			__io__block.writeFloat(__io__address + 360, phasefac);
		}
	}

	/**
	 * Get method for struct member 'randrotfac'.
	 * @see #__DNA__FIELD__randrotfac
	 */
	
	public float getRandrotfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 404);
		} else {
			return __io__block.readFloat(__io__address + 364);
		}
	}

	/**
	 * Set method for struct member 'randrotfac'.
	 * @see #__DNA__FIELD__randrotfac
	 */
	
	public void setRandrotfac(float randrotfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 404, randrotfac);
		} else {
			__io__block.writeFloat(__io__address + 364, randrotfac);
		}
	}

	/**
	 * Get method for struct member 'randphasefac'.
	 * @see #__DNA__FIELD__randphasefac
	 */
	
	public float getRandphasefac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 408);
		} else {
			return __io__block.readFloat(__io__address + 368);
		}
	}

	/**
	 * Set method for struct member 'randphasefac'.
	 * @see #__DNA__FIELD__randphasefac
	 */
	
	public void setRandphasefac(float randphasefac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 408, randphasefac);
		} else {
			__io__block.writeFloat(__io__address + 368, randphasefac);
		}
	}

	/**
	 * Get method for struct member 'mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mass of the particles<h4>Blender Source Code:</h4>
	 * <p> physical properties </p>
	 * @see #__DNA__FIELD__mass
	 */
	
	public float getMass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 412);
		} else {
			return __io__block.readFloat(__io__address + 372);
		}
	}

	/**
	 * Set method for struct member 'mass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mass of the particles<h4>Blender Source Code:</h4>
	 * <p> physical properties </p>
	 * @see #__DNA__FIELD__mass
	 */
	
	public void setMass(float mass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 412, mass);
		} else {
			__io__block.writeFloat(__io__address + 372, mass);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public float getSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 416);
		} else {
			return __io__block.readFloat(__io__address + 376);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(float size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 416, size);
		} else {
			__io__block.writeFloat(__io__address + 376, size);
		}
	}

	/**
	 * Get method for struct member 'randsize'.
	 * @see #__DNA__FIELD__randsize
	 */
	
	public float getRandsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 420);
		} else {
			return __io__block.readFloat(__io__address + 380);
		}
	}

	/**
	 * Set method for struct member 'randsize'.
	 * @see #__DNA__FIELD__randsize
	 */
	
	public void setRandsize(float randsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 420, randsize);
		} else {
			__io__block.writeFloat(__io__address + 380, randsize);
		}
	}

	/**
	 * Get method for struct member 'acc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> global physical properties </p>
	 * @see #__DNA__FIELD__acc
	 */
	
	public CArrayFacade<Float> getAcc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 424, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 384, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'acc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> global physical properties </p>
	 * @see #__DNA__FIELD__acc
	 */
	
	public void setAcc(CArrayFacade<Float> acc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 424;
		} else {
			__dna__offset = 384;
		}
		if (__io__equals(acc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, acc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, acc);
		} else {
			__io__generic__copy( getAcc(), acc);
		}
	}

	/**
	 * Get method for struct member 'dragfac'.
	 * @see #__DNA__FIELD__dragfac
	 */
	
	public float getDragfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 436);
		} else {
			return __io__block.readFloat(__io__address + 396);
		}
	}

	/**
	 * Set method for struct member 'dragfac'.
	 * @see #__DNA__FIELD__dragfac
	 */
	
	public void setDragfac(float dragfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 436, dragfac);
		} else {
			__io__block.writeFloat(__io__address + 396, dragfac);
		}
	}

	/**
	 * Get method for struct member 'brownfac'.
	 * @see #__DNA__FIELD__brownfac
	 */
	
	public float getBrownfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 440);
		} else {
			return __io__block.readFloat(__io__address + 400);
		}
	}

	/**
	 * Set method for struct member 'brownfac'.
	 * @see #__DNA__FIELD__brownfac
	 */
	
	public void setBrownfac(float brownfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 440, brownfac);
		} else {
			__io__block.writeFloat(__io__address + 400, brownfac);
		}
	}

	/**
	 * Get method for struct member 'dampfac'.
	 * @see #__DNA__FIELD__dampfac
	 */
	
	public float getDampfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 444);
		} else {
			return __io__block.readFloat(__io__address + 404);
		}
	}

	/**
	 * Set method for struct member 'dampfac'.
	 * @see #__DNA__FIELD__dampfac
	 */
	
	public void setDampfac(float dampfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 444, dampfac);
		} else {
			__io__block.writeFloat(__io__address + 404, dampfac);
		}
	}

	/**
	 * Get method for struct member 'randlength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> length </p>
	 * @see #__DNA__FIELD__randlength
	 */
	
	public float getRandlength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 448);
		} else {
			return __io__block.readFloat(__io__address + 408);
		}
	}

	/**
	 * Set method for struct member 'randlength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> length </p>
	 * @see #__DNA__FIELD__randlength
	 */
	
	public void setRandlength(float randlength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 448, randlength);
		} else {
			__io__block.writeFloat(__io__address + 408, randlength);
		}
	}

	/**
	 * Get method for struct member 'child_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> children </p>
	 * @see #__DNA__FIELD__child_flag
	 */
	
	public int getChild_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 452);
		} else {
			return __io__block.readInt(__io__address + 412);
		}
	}

	/**
	 * Set method for struct member 'child_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> children </p>
	 * @see #__DNA__FIELD__child_flag
	 */
	
	public void setChild_flag(int child_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 452, child_flag);
		} else {
			__io__block.writeInt(__io__address + 412, child_flag);
		}
	}

	/**
	 * Get method for struct member 'pad3'.
	 * @see #__DNA__FIELD__pad3
	 */
	
	public int getPad3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 456);
		} else {
			return __io__block.readInt(__io__address + 416);
		}
	}

	/**
	 * Set method for struct member 'pad3'.
	 * @see #__DNA__FIELD__pad3
	 */
	
	public void setPad3(int pad3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 456, pad3);
		} else {
			__io__block.writeInt(__io__address + 416, pad3);
		}
	}

	/**
	 * Get method for struct member 'child_nbr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of children/parent
	 * @see #__DNA__FIELD__child_nbr
	 */
	
	public int getChild_nbr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 460);
		} else {
			return __io__block.readInt(__io__address + 420);
		}
	}

	/**
	 * Set method for struct member 'child_nbr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of children/parent
	 * @see #__DNA__FIELD__child_nbr
	 */
	
	public void setChild_nbr(int child_nbr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 460, child_nbr);
		} else {
			__io__block.writeInt(__io__address + 420, child_nbr);
		}
	}

	/**
	 * Get method for struct member 'ren_child_nbr'.
	 * @see #__DNA__FIELD__ren_child_nbr
	 */
	
	public int getRen_child_nbr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 464);
		} else {
			return __io__block.readInt(__io__address + 424);
		}
	}

	/**
	 * Set method for struct member 'ren_child_nbr'.
	 * @see #__DNA__FIELD__ren_child_nbr
	 */
	
	public void setRen_child_nbr(int ren_child_nbr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 464, ren_child_nbr);
		} else {
			__io__block.writeInt(__io__address + 424, ren_child_nbr);
		}
	}

	/**
	 * Get method for struct member 'parents'.
	 * @see #__DNA__FIELD__parents
	 */
	
	public float getParents() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 468);
		} else {
			return __io__block.readFloat(__io__address + 428);
		}
	}

	/**
	 * Set method for struct member 'parents'.
	 * @see #__DNA__FIELD__parents
	 */
	
	public void setParents(float parents) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 468, parents);
		} else {
			__io__block.writeFloat(__io__address + 428, parents);
		}
	}

	/**
	 * Get method for struct member 'childsize'.
	 * @see #__DNA__FIELD__childsize
	 */
	
	public float getChildsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 472);
		} else {
			return __io__block.readFloat(__io__address + 432);
		}
	}

	/**
	 * Set method for struct member 'childsize'.
	 * @see #__DNA__FIELD__childsize
	 */
	
	public void setChildsize(float childsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 472, childsize);
		} else {
			__io__block.writeFloat(__io__address + 432, childsize);
		}
	}

	/**
	 * Get method for struct member 'childrandsize'.
	 * @see #__DNA__FIELD__childrandsize
	 */
	
	public float getChildrandsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 476);
		} else {
			return __io__block.readFloat(__io__address + 436);
		}
	}

	/**
	 * Set method for struct member 'childrandsize'.
	 * @see #__DNA__FIELD__childrandsize
	 */
	
	public void setChildrandsize(float childrandsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 476, childrandsize);
		} else {
			__io__block.writeFloat(__io__address + 436, childrandsize);
		}
	}

	/**
	 * Get method for struct member 'childrad'.
	 * @see #__DNA__FIELD__childrad
	 */
	
	public float getChildrad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 480);
		} else {
			return __io__block.readFloat(__io__address + 440);
		}
	}

	/**
	 * Set method for struct member 'childrad'.
	 * @see #__DNA__FIELD__childrad
	 */
	
	public void setChildrad(float childrad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 480, childrad);
		} else {
			__io__block.writeFloat(__io__address + 440, childrad);
		}
	}

	/**
	 * Get method for struct member 'childflat'.
	 * @see #__DNA__FIELD__childflat
	 */
	
	public float getChildflat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 484);
		} else {
			return __io__block.readFloat(__io__address + 444);
		}
	}

	/**
	 * Set method for struct member 'childflat'.
	 * @see #__DNA__FIELD__childflat
	 */
	
	public void setChildflat(float childflat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 484, childflat);
		} else {
			__io__block.writeFloat(__io__address + 444, childflat);
		}
	}

	/**
	 * Get method for struct member 'clumpfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> clumping </p>
	 * @see #__DNA__FIELD__clumpfac
	 */
	
	public float getClumpfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 488);
		} else {
			return __io__block.readFloat(__io__address + 448);
		}
	}

	/**
	 * Set method for struct member 'clumpfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> clumping </p>
	 * @see #__DNA__FIELD__clumpfac
	 */
	
	public void setClumpfac(float clumpfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 488, clumpfac);
		} else {
			__io__block.writeFloat(__io__address + 448, clumpfac);
		}
	}

	/**
	 * Get method for struct member 'clumppow'.
	 * @see #__DNA__FIELD__clumppow
	 */
	
	public float getClumppow() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 492);
		} else {
			return __io__block.readFloat(__io__address + 452);
		}
	}

	/**
	 * Set method for struct member 'clumppow'.
	 * @see #__DNA__FIELD__clumppow
	 */
	
	public void setClumppow(float clumppow) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 492, clumppow);
		} else {
			__io__block.writeFloat(__io__address + 452, clumppow);
		}
	}

	/**
	 * Get method for struct member 'kink_amp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> kink </p>
	 * @see #__DNA__FIELD__kink_amp
	 */
	
	public float getKink_amp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 496);
		} else {
			return __io__block.readFloat(__io__address + 456);
		}
	}

	/**
	 * Set method for struct member 'kink_amp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> kink </p>
	 * @see #__DNA__FIELD__kink_amp
	 */
	
	public void setKink_amp(float kink_amp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 496, kink_amp);
		} else {
			__io__block.writeFloat(__io__address + 456, kink_amp);
		}
	}

	/**
	 * Get method for struct member 'kink_freq'.
	 * @see #__DNA__FIELD__kink_freq
	 */
	
	public float getKink_freq() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 500);
		} else {
			return __io__block.readFloat(__io__address + 460);
		}
	}

	/**
	 * Set method for struct member 'kink_freq'.
	 * @see #__DNA__FIELD__kink_freq
	 */
	
	public void setKink_freq(float kink_freq) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 500, kink_freq);
		} else {
			__io__block.writeFloat(__io__address + 460, kink_freq);
		}
	}

	/**
	 * Get method for struct member 'kink_shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust the offset to the beginning/end
	 * @see #__DNA__FIELD__kink_shape
	 */
	
	public float getKink_shape() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 504);
		} else {
			return __io__block.readFloat(__io__address + 464);
		}
	}

	/**
	 * Set method for struct member 'kink_shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust the offset to the beginning/end
	 * @see #__DNA__FIELD__kink_shape
	 */
	
	public void setKink_shape(float kink_shape) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 504, kink_shape);
		} else {
			__io__block.writeFloat(__io__address + 464, kink_shape);
		}
	}

	/**
	 * Get method for struct member 'kink_flat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How flat the hairs are
	 * @see #__DNA__FIELD__kink_flat
	 */
	
	public float getKink_flat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 508);
		} else {
			return __io__block.readFloat(__io__address + 468);
		}
	}

	/**
	 * Set method for struct member 'kink_flat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How flat the hairs are
	 * @see #__DNA__FIELD__kink_flat
	 */
	
	public void setKink_flat(float kink_flat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 508, kink_flat);
		} else {
			__io__block.writeFloat(__io__address + 468, kink_flat);
		}
	}

	/**
	 * Get method for struct member 'kink_amp_clump'.
	 * @see #__DNA__FIELD__kink_amp_clump
	 */
	
	public float getKink_amp_clump() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 512);
		} else {
			return __io__block.readFloat(__io__address + 472);
		}
	}

	/**
	 * Set method for struct member 'kink_amp_clump'.
	 * @see #__DNA__FIELD__kink_amp_clump
	 */
	
	public void setKink_amp_clump(float kink_amp_clump) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 512, kink_amp_clump);
		} else {
			__io__block.writeFloat(__io__address + 472, kink_amp_clump);
		}
	}

	/**
	 * Get method for struct member 'kink_extra_steps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Extra steps for resolution of special kink features
	 * @see #__DNA__FIELD__kink_extra_steps
	 */
	
	public int getKink_extra_steps() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 516);
		} else {
			return __io__block.readInt(__io__address + 476);
		}
	}

	/**
	 * Set method for struct member 'kink_extra_steps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Extra steps for resolution of special kink features
	 * @see #__DNA__FIELD__kink_extra_steps
	 */
	
	public void setKink_extra_steps(int kink_extra_steps) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 516, kink_extra_steps);
		} else {
			__io__block.writeInt(__io__address + 476, kink_extra_steps);
		}
	}

	/**
	 * Get method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public int getPad4() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 520);
		} else {
			return __io__block.readInt(__io__address + 480);
		}
	}

	/**
	 * Set method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public void setPad4(int pad4) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 520, pad4);
		} else {
			__io__block.writeInt(__io__address + 480, pad4);
		}
	}

	/**
	 * Get method for struct member 'kink_axis_random'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Random variation of the orientation
	 * @see #__DNA__FIELD__kink_axis_random
	 */
	
	public float getKink_axis_random() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 524);
		} else {
			return __io__block.readFloat(__io__address + 484);
		}
	}

	/**
	 * Set method for struct member 'kink_axis_random'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Random variation of the orientation
	 * @see #__DNA__FIELD__kink_axis_random
	 */
	
	public void setKink_axis_random(float kink_axis_random) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 524, kink_axis_random);
		} else {
			__io__block.writeFloat(__io__address + 484, kink_axis_random);
		}
	}

	/**
	 * Get method for struct member 'kink_amp_random'.
	 * @see #__DNA__FIELD__kink_amp_random
	 */
	
	public float getKink_amp_random() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 528);
		} else {
			return __io__block.readFloat(__io__address + 488);
		}
	}

	/**
	 * Set method for struct member 'kink_amp_random'.
	 * @see #__DNA__FIELD__kink_amp_random
	 */
	
	public void setKink_amp_random(float kink_amp_random) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 528, kink_amp_random);
		} else {
			__io__block.writeFloat(__io__address + 488, kink_amp_random);
		}
	}

	/**
	 * Get method for struct member 'rough1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rough </p>
	 * @see #__DNA__FIELD__rough1
	 */
	
	public float getRough1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 532);
		} else {
			return __io__block.readFloat(__io__address + 492);
		}
	}

	/**
	 * Set method for struct member 'rough1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rough </p>
	 * @see #__DNA__FIELD__rough1
	 */
	
	public void setRough1(float rough1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 532, rough1);
		} else {
			__io__block.writeFloat(__io__address + 492, rough1);
		}
	}

	/**
	 * Get method for struct member 'rough1_size'.
	 * @see #__DNA__FIELD__rough1_size
	 */
	
	public float getRough1_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 536);
		} else {
			return __io__block.readFloat(__io__address + 496);
		}
	}

	/**
	 * Set method for struct member 'rough1_size'.
	 * @see #__DNA__FIELD__rough1_size
	 */
	
	public void setRough1_size(float rough1_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 536, rough1_size);
		} else {
			__io__block.writeFloat(__io__address + 496, rough1_size);
		}
	}

	/**
	 * Get method for struct member 'rough2'.
	 * @see #__DNA__FIELD__rough2
	 */
	
	public float getRough2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 540);
		} else {
			return __io__block.readFloat(__io__address + 500);
		}
	}

	/**
	 * Set method for struct member 'rough2'.
	 * @see #__DNA__FIELD__rough2
	 */
	
	public void setRough2(float rough2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 540, rough2);
		} else {
			__io__block.writeFloat(__io__address + 500, rough2);
		}
	}

	/**
	 * Get method for struct member 'rough2_size'.
	 * @see #__DNA__FIELD__rough2_size
	 */
	
	public float getRough2_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 544);
		} else {
			return __io__block.readFloat(__io__address + 504);
		}
	}

	/**
	 * Set method for struct member 'rough2_size'.
	 * @see #__DNA__FIELD__rough2_size
	 */
	
	public void setRough2_size(float rough2_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 544, rough2_size);
		} else {
			__io__block.writeFloat(__io__address + 504, rough2_size);
		}
	}

	/**
	 * Get method for struct member 'rough2_thres'.
	 * @see #__DNA__FIELD__rough2_thres
	 */
	
	public float getRough2_thres() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 548);
		} else {
			return __io__block.readFloat(__io__address + 508);
		}
	}

	/**
	 * Set method for struct member 'rough2_thres'.
	 * @see #__DNA__FIELD__rough2_thres
	 */
	
	public void setRough2_thres(float rough2_thres) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 548, rough2_thres);
		} else {
			__io__block.writeFloat(__io__address + 508, rough2_thres);
		}
	}

	/**
	 * Get method for struct member 'rough_end'.
	 * @see #__DNA__FIELD__rough_end
	 */
	
	public float getRough_end() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 552);
		} else {
			return __io__block.readFloat(__io__address + 512);
		}
	}

	/**
	 * Set method for struct member 'rough_end'.
	 * @see #__DNA__FIELD__rough_end
	 */
	
	public void setRough_end(float rough_end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 552, rough_end);
		} else {
			__io__block.writeFloat(__io__address + 512, rough_end);
		}
	}

	/**
	 * Get method for struct member 'rough_end_shape'.
	 * @see #__DNA__FIELD__rough_end_shape
	 */
	
	public float getRough_end_shape() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 556);
		} else {
			return __io__block.readFloat(__io__address + 516);
		}
	}

	/**
	 * Set method for struct member 'rough_end_shape'.
	 * @see #__DNA__FIELD__rough_end_shape
	 */
	
	public void setRough_end_shape(float rough_end_shape) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 556, rough_end_shape);
		} else {
			__io__block.writeFloat(__io__address + 516, rough_end_shape);
		}
	}

	/**
	 * Get method for struct member 'clength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> length </p>
	 * @see #__DNA__FIELD__clength
	 */
	
	public float getClength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 560);
		} else {
			return __io__block.readFloat(__io__address + 520);
		}
	}

	/**
	 * Set method for struct member 'clength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> length </p>
	 * @see #__DNA__FIELD__clength
	 */
	
	public void setClength(float clength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 560, clength);
		} else {
			__io__block.writeFloat(__io__address + 520, clength);
		}
	}

	/**
	 * Get method for struct member 'clength_thres'.
	 * @see #__DNA__FIELD__clength_thres
	 */
	
	public float getClength_thres() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 564);
		} else {
			return __io__block.readFloat(__io__address + 524);
		}
	}

	/**
	 * Set method for struct member 'clength_thres'.
	 * @see #__DNA__FIELD__clength_thres
	 */
	
	public void setClength_thres(float clength_thres) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 564, clength_thres);
		} else {
			__io__block.writeFloat(__io__address + 524, clength_thres);
		}
	}

	/**
	 * Get method for struct member 'parting_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> parting </p>
	 * @see #__DNA__FIELD__parting_fac
	 */
	
	public float getParting_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 568);
		} else {
			return __io__block.readFloat(__io__address + 528);
		}
	}

	/**
	 * Set method for struct member 'parting_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> parting </p>
	 * @see #__DNA__FIELD__parting_fac
	 */
	
	public void setParting_fac(float parting_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 568, parting_fac);
		} else {
			__io__block.writeFloat(__io__address + 528, parting_fac);
		}
	}

	/**
	 * Get method for struct member 'parting_min'.
	 * @see #__DNA__FIELD__parting_min
	 */
	
	public float getParting_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 572);
		} else {
			return __io__block.readFloat(__io__address + 532);
		}
	}

	/**
	 * Set method for struct member 'parting_min'.
	 * @see #__DNA__FIELD__parting_min
	 */
	
	public void setParting_min(float parting_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 572, parting_min);
		} else {
			__io__block.writeFloat(__io__address + 532, parting_min);
		}
	}

	/**
	 * Get method for struct member 'parting_max'.
	 * @see #__DNA__FIELD__parting_max
	 */
	
	public float getParting_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 576);
		} else {
			return __io__block.readFloat(__io__address + 536);
		}
	}

	/**
	 * Set method for struct member 'parting_max'.
	 * @see #__DNA__FIELD__parting_max
	 */
	
	public void setParting_max(float parting_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 576, parting_max);
		} else {
			__io__block.writeFloat(__io__address + 536, parting_max);
		}
	}

	/**
	 * Get method for struct member 'branch_thres'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> branching </p>
	 * @see #__DNA__FIELD__branch_thres
	 */
	
	public float getBranch_thres() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 580);
		} else {
			return __io__block.readFloat(__io__address + 540);
		}
	}

	/**
	 * Set method for struct member 'branch_thres'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> branching </p>
	 * @see #__DNA__FIELD__branch_thres
	 */
	
	public void setBranch_thres(float branch_thres) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 580, branch_thres);
		} else {
			__io__block.writeFloat(__io__address + 540, branch_thres);
		}
	}

	/**
	 * Get method for struct member 'draw_line'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> drawing stuff </p>
	 * @see #__DNA__FIELD__draw_line
	 */
	
	public CArrayFacade<Float> getDraw_line() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 584, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 544, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'draw_line'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> drawing stuff </p>
	 * @see #__DNA__FIELD__draw_line
	 */
	
	public void setDraw_line(CArrayFacade<Float> draw_line) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 584;
		} else {
			__dna__offset = 544;
		}
		if (__io__equals(draw_line, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, draw_line)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, draw_line);
		} else {
			__io__generic__copy( getDraw_line(), draw_line);
		}
	}

	/**
	 * Get method for struct member 'path_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Starting time of drawn path
	 * @see #__DNA__FIELD__path_start
	 */
	
	public float getPath_start() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 592);
		} else {
			return __io__block.readFloat(__io__address + 552);
		}
	}

	/**
	 * Set method for struct member 'path_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Starting time of drawn path
	 * @see #__DNA__FIELD__path_start
	 */
	
	public void setPath_start(float path_start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 592, path_start);
		} else {
			__io__block.writeFloat(__io__address + 552, path_start);
		}
	}

	/**
	 * Get method for struct member 'path_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * End time of drawn path
	 * @see #__DNA__FIELD__path_end
	 */
	
	public float getPath_end() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 596);
		} else {
			return __io__block.readFloat(__io__address + 556);
		}
	}

	/**
	 * Set method for struct member 'path_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * End time of drawn path
	 * @see #__DNA__FIELD__path_end
	 */
	
	public void setPath_end(float path_end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 596, path_end);
		} else {
			__io__block.writeFloat(__io__address + 556, path_end);
		}
	}

	/**
	 * Get method for struct member 'trail_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of trail particles
	 * @see #__DNA__FIELD__trail_count
	 */
	
	public int getTrail_count() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 600);
		} else {
			return __io__block.readInt(__io__address + 560);
		}
	}

	/**
	 * Set method for struct member 'trail_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of trail particles
	 * @see #__DNA__FIELD__trail_count
	 */
	
	public void setTrail_count(int trail_count) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 600, trail_count);
		} else {
			__io__block.writeInt(__io__address + 560, trail_count);
		}
	}

	/**
	 * Get method for struct member 'keyed_loops'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of times the keys are looped<h4>Blender Source Code:</h4>
	 * <p> keyed particles </p>
	 * @see #__DNA__FIELD__keyed_loops
	 */
	
	public int getKeyed_loops() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 604);
		} else {
			return __io__block.readInt(__io__address + 564);
		}
	}

	/**
	 * Set method for struct member 'keyed_loops'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of times the keys are looped<h4>Blender Source Code:</h4>
	 * <p> keyed particles </p>
	 * @see #__DNA__FIELD__keyed_loops
	 */
	
	public void setKeyed_loops(int keyed_loops) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 604, keyed_loops);
		} else {
			__io__block.writeInt(__io__address + 564, keyed_loops);
		}
	}

	/**
	 * Get method for struct member 'clumpcurve'.
	 * @see #__DNA__FIELD__clumpcurve
	 */
	
	public CPointer<CurveMapping> getClumpcurve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 608);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 568);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'clumpcurve'.
	 * @see #__DNA__FIELD__clumpcurve
	 */
	
	public void setClumpcurve(CPointer<CurveMapping> clumpcurve) throws IOException
	{
		long __address = ((clumpcurve == null) ? 0 : clumpcurve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 608, __address);
		} else {
			__io__block.writeLong(__io__address + 568, __address);
		}
	}

	/**
	 * Get method for struct member 'roughcurve'.
	 * @see #__DNA__FIELD__roughcurve
	 */
	
	public CPointer<CurveMapping> getRoughcurve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 616);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 572);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'roughcurve'.
	 * @see #__DNA__FIELD__roughcurve
	 */
	
	public void setRoughcurve(CPointer<CurveMapping> roughcurve) throws IOException
	{
		long __address = ((roughcurve == null) ? 0 : roughcurve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 616, __address);
		} else {
			__io__block.writeLong(__io__address + 572, __address);
		}
	}

	/**
	 * Get method for struct member 'clump_noise_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of clump noise
	 * @see #__DNA__FIELD__clump_noise_size
	 */
	
	public float getClump_noise_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 624);
		} else {
			return __io__block.readFloat(__io__address + 576);
		}
	}

	/**
	 * Set method for struct member 'clump_noise_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of clump noise
	 * @see #__DNA__FIELD__clump_noise_size
	 */
	
	public void setClump_noise_size(float clump_noise_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 624, clump_noise_size);
		} else {
			__io__block.writeFloat(__io__address + 576, clump_noise_size);
		}
	}

	/**
	 * Get method for struct member 'bending_random'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Random stiffness of hairs<h4>Blender Source Code:</h4>
	 * <p> hair dynamics </p>
	 * @see #__DNA__FIELD__bending_random
	 */
	
	public float getBending_random() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 628);
		} else {
			return __io__block.readFloat(__io__address + 580);
		}
	}

	/**
	 * Set method for struct member 'bending_random'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Random stiffness of hairs<h4>Blender Source Code:</h4>
	 * <p> hair dynamics </p>
	 * @see #__DNA__FIELD__bending_random
	 */
	
	public void setBending_random(float bending_random) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 628, bending_random);
		} else {
			__io__block.writeFloat(__io__address + 580, bending_random);
		}
	}

	/**
	 * Get method for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX </p>
	 * @see #__DNA__FIELD__mtex
	 */
	
	public CArrayFacade<CPointer<MTex>> getMtex() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, MTex.class};
		int[] __dna__dimensions = new int[]{
			18
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<MTex>>(__io__address + 632, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<MTex>>(__io__address + 584, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX </p>
	 * @see #__DNA__FIELD__mtex
	 */
	
	public void setMtex(CArrayFacade<CPointer<MTex>> mtex) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 632;
		} else {
			__dna__offset = 584;
		}
		if (__io__equals(mtex, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mtex)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mtex);
		} else {
			__io__generic__copy( getMtex(), mtex);
		}
	}

	/**
	 * Get method for struct member 'dup_group'.
	 * @see #__DNA__FIELD__dup_group
	 */
	
	public CPointer<Group> getDup_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 776);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 656);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Group.class};
		return new CPointer<Group>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Group.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dup_group'.
	 * @see #__DNA__FIELD__dup_group
	 */
	
	public void setDup_group(CPointer<Group> dup_group) throws IOException
	{
		long __address = ((dup_group == null) ? 0 : dup_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 776, __address);
		} else {
			__io__block.writeLong(__io__address + 656, __address);
		}
	}

	/**
	 * Get method for struct member 'dupliweights'.
	 * @see #__DNA__FIELD__dupliweights
	 */
	
	public ListBase getDupliweights() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 784, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 660, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dupliweights'.
	 * @see #__DNA__FIELD__dupliweights
	 */
	
	public void setDupliweights(ListBase dupliweights) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 784;
		} else {
			__dna__offset = 660;
		}
		if (__io__equals(dupliweights, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dupliweights)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dupliweights);
		} else {
			__io__generic__copy( getDupliweights(), dupliweights);
		}
	}

	/**
	 * Get method for struct member 'eff_group'.
	 * @see #__DNA__FIELD__eff_group
	 */
	
	public CPointer<Group> getEff_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 800);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 668);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Group.class};
		return new CPointer<Group>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Group.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'eff_group'.
	 * @see #__DNA__FIELD__eff_group
	 */
	
	public void setEff_group(CPointer<Group> eff_group) throws IOException
	{
		long __address = ((eff_group == null) ? 0 : eff_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 800, __address);
		} else {
			__io__block.writeLong(__io__address + 668, __address);
		}
	}

	/**
	 * Get method for struct member 'dup_ob'.
	 * @see #__DNA__FIELD__dup_ob
	 */
	
	public CPointer<BlenderObject> getDup_ob() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 808);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 672);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dup_ob'.
	 * @see #__DNA__FIELD__dup_ob
	 */
	
	public void setDup_ob(CPointer<BlenderObject> dup_ob) throws IOException
	{
		long __address = ((dup_ob == null) ? 0 : dup_ob.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 808, __address);
		} else {
			__io__block.writeLong(__io__address + 672, __address);
		}
	}

	/**
	 * Get method for struct member 'bb_ob'.
	 * @see #__DNA__FIELD__bb_ob
	 */
	
	public CPointer<BlenderObject> getBb_ob() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 816);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 676);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bb_ob'.
	 * @see #__DNA__FIELD__bb_ob
	 */
	
	public void setBb_ob(CPointer<BlenderObject> bb_ob) throws IOException
	{
		long __address = ((bb_ob == null) ? 0 : bb_ob.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 816, __address);
		} else {
			__io__block.writeLong(__io__address + 676, __address);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 824);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 680);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 824, __address);
		} else {
			__io__block.writeLong(__io__address + 680, __address);
		}
	}

	/**
	 * Get method for struct member 'pd'.
	 * @see #__DNA__FIELD__pd
	 */
	
	public CPointer<PartDeflect> getPd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 832);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 684);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PartDeflect.class};
		return new CPointer<PartDeflect>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PartDeflect.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pd'.
	 * @see #__DNA__FIELD__pd
	 */
	
	public void setPd(CPointer<PartDeflect> pd) throws IOException
	{
		long __address = ((pd == null) ? 0 : pd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 832, __address);
		} else {
			__io__block.writeLong(__io__address + 684, __address);
		}
	}

	/**
	 * Get method for struct member 'pd2'.
	 * @see #__DNA__FIELD__pd2
	 */
	
	public CPointer<PartDeflect> getPd2() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 840);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 688);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PartDeflect.class};
		return new CPointer<PartDeflect>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PartDeflect.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pd2'.
	 * @see #__DNA__FIELD__pd2
	 */
	
	public void setPd2(CPointer<PartDeflect> pd2) throws IOException
	{
		long __address = ((pd2 == null) ? 0 : pd2.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 840, __address);
		} else {
			__io__block.writeLong(__io__address + 688, __address);
		}
	}

	/**
	 * Get method for struct member 'use_modifier_stack'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Emit particles from mesh with modifiers applied (must use same subsurf level for viewport and render for correct results)<h4>Blender Source Code:</h4>
	 * <p> modified dm support </p>
	 * @see #__DNA__FIELD__use_modifier_stack
	 */
	
	public short getUse_modifier_stack() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 848);
		} else {
			return __io__block.readShort(__io__address + 692);
		}
	}

	/**
	 * Set method for struct member 'use_modifier_stack'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Emit particles from mesh with modifiers applied (must use same subsurf level for viewport and render for correct results)<h4>Blender Source Code:</h4>
	 * <p> modified dm support </p>
	 * @see #__DNA__FIELD__use_modifier_stack
	 */
	
	public void setUse_modifier_stack(short use_modifier_stack) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 848, use_modifier_stack);
		} else {
			__io__block.writeShort(__io__address + 692, use_modifier_stack);
		}
	}

	/**
	 * Get method for struct member 'pad5'.
	 * @see #__DNA__FIELD__pad5
	 */
	
	public CArrayFacade<Short> getPad5() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 850, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 694, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad5'.
	 * @see #__DNA__FIELD__pad5
	 */
	
	public void setPad5(CArrayFacade<Short> pad5) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 850;
		} else {
			__dna__offset = 694;
		}
		if (__io__equals(pad5, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad5)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad5);
		} else {
			__io__generic__copy( getPad5(), pad5);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ParticleSettings> __io__addressof() {
		return new CPointer<ParticleSettings>(__io__address, new Class[]{ParticleSettings.class}, __io__block, __io__blockTable);
	}

}
