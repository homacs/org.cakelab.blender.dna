package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SmokeFlowSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=164, size64=184)
public class SmokeFlowSettings extends CFacade {

	/**
	 * This is the sdna index of the struct SmokeFlowSettings.
	 * <p>
	 * It is required when allocating a new block to store data for SmokeFlowSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 536;

	/**
	 * Field descriptor (offset) for struct member 'smd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for fast RNA access </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__smd);
	 * CPointer&lt;CPointer&lt;SmokeModifierData&gt;&gt; p_smd = p.cast(new Class[]{CPointer.class, SmokeModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smd'</li>
	 * <li>Signature: 'SmokeModifierData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smd = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'dm'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__dm);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_dm = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dm'</li>
	 * <li>Signature: 'DerivedMesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dm = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'psys'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__psys);
	 * CPointer&lt;CPointer&lt;ParticleSystem&gt;&gt; p_psys = p.cast(new Class[]{CPointer.class, ParticleSystem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'psys'</li>
	 * <li>Signature: 'ParticleSystem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__psys = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'noise_texture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Texture that controls emission strength
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__noise_texture);
	 * CPointer&lt;CPointer&lt;Tex&gt;&gt; p_noise_texture = p.cast(new Class[]{CPointer.class, Tex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noise_texture'</li>
	 * <li>Signature: 'Tex*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noise_texture = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'verts_old'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> initial velocity previous vertex positions in domain space </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__verts_old);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_verts_old = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'verts_old'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__verts_old = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'numverts'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__numverts);
	 * CPointer&lt;Integer&gt; p_numverts = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'numverts'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__numverts = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'vel_multi'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__vel_multi);
	 * CPointer&lt;Float&gt; p_vel_multi = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vel_multi'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vel_multi = new long[]{24, 44};

	/**
	 * Field descriptor (offset) for struct member 'vel_normal'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__vel_normal);
	 * CPointer&lt;Float&gt; p_vel_normal = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vel_normal'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vel_normal = new long[]{28, 48};

	/**
	 * Field descriptor (offset) for struct member 'vel_random'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__vel_random);
	 * CPointer&lt;Float&gt; p_vel_random = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vel_random'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vel_random = new long[]{32, 52};

	/**
	 * Field descriptor (offset) for struct member 'density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> emission </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__density);
	 * CPointer&lt;Float&gt; p_density = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'density'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__density = new long[]{36, 56};

	/**
	 * Field descriptor (offset) for struct member 'color'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color = new long[]{40, 60};

	/**
	 * Field descriptor (offset) for struct member 'fuel_amount'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__fuel_amount);
	 * CPointer&lt;Float&gt; p_fuel_amount = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fuel_amount'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fuel_amount = new long[]{52, 72};

	/**
	 * Field descriptor (offset) for struct member 'temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> delta temperature (temp - ambient temp) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__temp);
	 * CPointer&lt;Float&gt; p_temp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'temp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__temp = new long[]{56, 76};

	/**
	 * Field descriptor (offset) for struct member 'volume_density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for smoke emitted from inside the mesh volume<h4>Blender Source Code:</h4>
	 * <p> density emitted within mesh volume </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__volume_density);
	 * CPointer&lt;Float&gt; p_volume_density = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volume_density'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volume_density = new long[]{60, 80};

	/**
	 * Field descriptor (offset) for struct member 'surface_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance from mesh surface to emit smoke<h4>Blender Source Code:</h4>
	 * <p> maximum emission distance from mesh surface </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__surface_distance);
	 * CPointer&lt;Float&gt; p_surface_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'surface_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__surface_distance = new long[]{64, 84};

	/**
	 * Field descriptor (offset) for struct member 'particle_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle size in simulation cells
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__particle_size);
	 * CPointer&lt;Float&gt; p_particle_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_size = new long[]{68, 88};

	/**
	 * Field descriptor (offset) for struct member 'subframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of additional samples to take between frames to improve quality of fast moving flows
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__subframes);
	 * CPointer&lt;Integer&gt; p_subframes = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subframes'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subframes = new long[]{72, 92};

	/**
	 * Field descriptor (offset) for struct member 'texture_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of texture mapping<h4>Blender Source Code:</h4>
	 * <p> texture control </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__texture_size);
	 * CPointer&lt;Float&gt; p_texture_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_size = new long[]{76, 96};

	/**
	 * Field descriptor (offset) for struct member 'texture_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Z-offset of texture mapping
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__texture_offset);
	 * CPointer&lt;Float&gt; p_texture_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_offset = new long[]{80, 100};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{84, 104};

	/**
	 * Field descriptor (offset) for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__uvlayer_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_uvlayer_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uvlayer_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uvlayer_name = new long[]{88, 108};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_density'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__vgroup_density);
	 * CPointer&lt;Short&gt; p_vgroup_density = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_density'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_density = new long[]{152, 172};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> smoke, flames, both, outflow </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{154, 174};

	/**
	 * Field descriptor (offset) for struct member 'source'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__source);
	 * CPointer&lt;Short&gt; p_source = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'source'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__source = new long[]{156, 176};

	/**
	 * Field descriptor (offset) for struct member 'texture_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__texture_type);
	 * CPointer&lt;Short&gt; p_texture_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_type = new long[]{158, 178};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> absolute emission etc </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeFlowSettings smokeflowsettings = ...;
	 * CPointer&lt;Object&gt; p = smokeflowsettings.__dna__addressof(SmokeFlowSettings.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{160, 180};

	public SmokeFlowSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SmokeFlowSettings(SmokeFlowSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'smd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for fast RNA access </p>
	 * @see #__DNA__FIELD__smd
	 */
	
	public CPointer<SmokeModifierData> getSmd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SmokeModifierData.class};
		return new CPointer<SmokeModifierData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SmokeModifierData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'smd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for fast RNA access </p>
	 * @see #__DNA__FIELD__smd
	 */
	
	public void setSmd(CPointer<SmokeModifierData> smd) throws IOException
	{
		long __address = ((smd == null) ? 0 : smd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'dm'.
	 * @see #__DNA__FIELD__dm
	 */
	
	public CPointer<Object> getDm() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dm'.
	 * @see #__DNA__FIELD__dm
	 */
	
	public void setDm(CPointer<Object> dm) throws IOException
	{
		long __address = ((dm == null) ? 0 : dm.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'psys'.
	 * @see #__DNA__FIELD__psys
	 */
	
	public CPointer<ParticleSystem> getPsys() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ParticleSystem.class};
		return new CPointer<ParticleSystem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ParticleSystem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'psys'.
	 * @see #__DNA__FIELD__psys
	 */
	
	public void setPsys(CPointer<ParticleSystem> psys) throws IOException
	{
		long __address = ((psys == null) ? 0 : psys.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'noise_texture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Texture that controls emission strength
	 * @see #__DNA__FIELD__noise_texture
	 */
	
	public CPointer<Tex> getNoise_texture() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Tex.class};
		return new CPointer<Tex>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Tex.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'noise_texture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Texture that controls emission strength
	 * @see #__DNA__FIELD__noise_texture
	 */
	
	public void setNoise_texture(CPointer<Tex> noise_texture) throws IOException
	{
		long __address = ((noise_texture == null) ? 0 : noise_texture.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'verts_old'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> initial velocity previous vertex positions in domain space </p>
	 * @see #__DNA__FIELD__verts_old
	 */
	
	public CPointer<Float> getVerts_old() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'verts_old'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> initial velocity previous vertex positions in domain space </p>
	 * @see #__DNA__FIELD__verts_old
	 */
	
	public void setVerts_old(CPointer<Float> verts_old) throws IOException
	{
		long __address = ((verts_old == null) ? 0 : verts_old.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'numverts'.
	 * @see #__DNA__FIELD__numverts
	 */
	
	public int getNumverts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'numverts'.
	 * @see #__DNA__FIELD__numverts
	 */
	
	public void setNumverts(int numverts) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, numverts);
		} else {
			__io__block.writeInt(__io__address + 20, numverts);
		}
	}

	/**
	 * Get method for struct member 'vel_multi'.
	 * @see #__DNA__FIELD__vel_multi
	 */
	
	public float getVel_multi() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'vel_multi'.
	 * @see #__DNA__FIELD__vel_multi
	 */
	
	public void setVel_multi(float vel_multi) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, vel_multi);
		} else {
			__io__block.writeFloat(__io__address + 24, vel_multi);
		}
	}

	/**
	 * Get method for struct member 'vel_normal'.
	 * @see #__DNA__FIELD__vel_normal
	 */
	
	public float getVel_normal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'vel_normal'.
	 * @see #__DNA__FIELD__vel_normal
	 */
	
	public void setVel_normal(float vel_normal) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, vel_normal);
		} else {
			__io__block.writeFloat(__io__address + 28, vel_normal);
		}
	}

	/**
	 * Get method for struct member 'vel_random'.
	 * @see #__DNA__FIELD__vel_random
	 */
	
	public float getVel_random() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'vel_random'.
	 * @see #__DNA__FIELD__vel_random
	 */
	
	public void setVel_random(float vel_random) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, vel_random);
		} else {
			__io__block.writeFloat(__io__address + 32, vel_random);
		}
	}

	/**
	 * Get method for struct member 'density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> emission </p>
	 * @see #__DNA__FIELD__density
	 */
	
	public float getDensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> emission </p>
	 * @see #__DNA__FIELD__density
	 */
	
	public void setDensity(float density) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, density);
		} else {
			__io__block.writeFloat(__io__address + 36, density);
		}
	}

	/**
	 * Get method for struct member 'color'.
	 * @see #__DNA__FIELD__color
	 */
	
	public CArrayFacade<Float> getColor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'color'.
	 * @see #__DNA__FIELD__color
	 */
	
	public void setColor(CArrayFacade<Float> color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 60;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, color);
		} else {
			__io__generic__copy( getColor(), color);
		}
	}

	/**
	 * Get method for struct member 'fuel_amount'.
	 * @see #__DNA__FIELD__fuel_amount
	 */
	
	public float getFuel_amount() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'fuel_amount'.
	 * @see #__DNA__FIELD__fuel_amount
	 */
	
	public void setFuel_amount(float fuel_amount) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, fuel_amount);
		} else {
			__io__block.writeFloat(__io__address + 52, fuel_amount);
		}
	}

	/**
	 * Get method for struct member 'temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> delta temperature (temp - ambient temp) </p>
	 * @see #__DNA__FIELD__temp
	 */
	
	public float getTemp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> delta temperature (temp - ambient temp) </p>
	 * @see #__DNA__FIELD__temp
	 */
	
	public void setTemp(float temp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, temp);
		} else {
			__io__block.writeFloat(__io__address + 56, temp);
		}
	}

	/**
	 * Get method for struct member 'volume_density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for smoke emitted from inside the mesh volume<h4>Blender Source Code:</h4>
	 * <p> density emitted within mesh volume </p>
	 * @see #__DNA__FIELD__volume_density
	 */
	
	public float getVolume_density() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'volume_density'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for smoke emitted from inside the mesh volume<h4>Blender Source Code:</h4>
	 * <p> density emitted within mesh volume </p>
	 * @see #__DNA__FIELD__volume_density
	 */
	
	public void setVolume_density(float volume_density) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, volume_density);
		} else {
			__io__block.writeFloat(__io__address + 60, volume_density);
		}
	}

	/**
	 * Get method for struct member 'surface_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance from mesh surface to emit smoke<h4>Blender Source Code:</h4>
	 * <p> maximum emission distance from mesh surface </p>
	 * @see #__DNA__FIELD__surface_distance
	 */
	
	public float getSurface_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'surface_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance from mesh surface to emit smoke<h4>Blender Source Code:</h4>
	 * <p> maximum emission distance from mesh surface </p>
	 * @see #__DNA__FIELD__surface_distance
	 */
	
	public void setSurface_distance(float surface_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, surface_distance);
		} else {
			__io__block.writeFloat(__io__address + 64, surface_distance);
		}
	}

	/**
	 * Get method for struct member 'particle_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle size in simulation cells
	 * @see #__DNA__FIELD__particle_size
	 */
	
	public float getParticle_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'particle_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle size in simulation cells
	 * @see #__DNA__FIELD__particle_size
	 */
	
	public void setParticle_size(float particle_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, particle_size);
		} else {
			__io__block.writeFloat(__io__address + 68, particle_size);
		}
	}

	/**
	 * Get method for struct member 'subframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of additional samples to take between frames to improve quality of fast moving flows
	 * @see #__DNA__FIELD__subframes
	 */
	
	public int getSubframes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 92);
		} else {
			return __io__block.readInt(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'subframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of additional samples to take between frames to improve quality of fast moving flows
	 * @see #__DNA__FIELD__subframes
	 */
	
	public void setSubframes(int subframes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 92, subframes);
		} else {
			__io__block.writeInt(__io__address + 72, subframes);
		}
	}

	/**
	 * Get method for struct member 'texture_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of texture mapping<h4>Blender Source Code:</h4>
	 * <p> texture control </p>
	 * @see #__DNA__FIELD__texture_size
	 */
	
	public float getTexture_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'texture_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of texture mapping<h4>Blender Source Code:</h4>
	 * <p> texture control </p>
	 * @see #__DNA__FIELD__texture_size
	 */
	
	public void setTexture_size(float texture_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, texture_size);
		} else {
			__io__block.writeFloat(__io__address + 76, texture_size);
		}
	}

	/**
	 * Get method for struct member 'texture_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Z-offset of texture mapping
	 * @see #__DNA__FIELD__texture_offset
	 */
	
	public float getTexture_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'texture_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Z-offset of texture mapping
	 * @see #__DNA__FIELD__texture_offset
	 */
	
	public void setTexture_offset(float texture_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, texture_offset);
		} else {
			__io__block.writeFloat(__io__address + 80, texture_offset);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 104);
		} else {
			return __io__block.readInt(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 104, pad);
		} else {
			__io__block.writeInt(__io__address + 84, pad);
		}
	}

	/**
	 * Get method for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME </p>
	 * @see #__DNA__FIELD__uvlayer_name
	 */
	
	public CArrayFacade<Byte> getUvlayer_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME </p>
	 * @see #__DNA__FIELD__uvlayer_name
	 */
	
	public void setUvlayer_name(CArrayFacade<Byte> uvlayer_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 108;
		} else {
			__dna__offset = 88;
		}
		if (__io__equals(uvlayer_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uvlayer_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uvlayer_name);
		} else {
			__io__generic__copy( getUvlayer_name(), uvlayer_name);
		}
	}

	/**
	 * Get method for struct member 'vgroup_density'.
	 * @see #__DNA__FIELD__vgroup_density
	 */
	
	public short getVgroup_density() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 172);
		} else {
			return __io__block.readShort(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'vgroup_density'.
	 * @see #__DNA__FIELD__vgroup_density
	 */
	
	public void setVgroup_density(short vgroup_density) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 172, vgroup_density);
		} else {
			__io__block.writeShort(__io__address + 152, vgroup_density);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> smoke, flames, both, outflow </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 174);
		} else {
			return __io__block.readShort(__io__address + 154);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> smoke, flames, both, outflow </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 174, type);
		} else {
			__io__block.writeShort(__io__address + 154, type);
		}
	}

	/**
	 * Get method for struct member 'source'.
	 * @see #__DNA__FIELD__source
	 */
	
	public short getSource() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 176);
		} else {
			return __io__block.readShort(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'source'.
	 * @see #__DNA__FIELD__source
	 */
	
	public void setSource(short source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 176, source);
		} else {
			__io__block.writeShort(__io__address + 156, source);
		}
	}

	/**
	 * Get method for struct member 'texture_type'.
	 * @see #__DNA__FIELD__texture_type
	 */
	
	public short getTexture_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 178);
		} else {
			return __io__block.readShort(__io__address + 158);
		}
	}

	/**
	 * Set method for struct member 'texture_type'.
	 * @see #__DNA__FIELD__texture_type
	 */
	
	public void setTexture_type(short texture_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 178, texture_type);
		} else {
			__io__block.writeShort(__io__address + 158, texture_type);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> absolute emission etc </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 180);
		} else {
			return __io__block.readInt(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> absolute emission etc </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 180, flags);
		} else {
			__io__block.writeInt(__io__address + 160, flags);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SmokeFlowSettings> __io__addressof() {
		return new CPointer<SmokeFlowSettings>(__io__address, new Class[]{SmokeFlowSettings.class}, __io__block, __io__blockTable);
	}

}
