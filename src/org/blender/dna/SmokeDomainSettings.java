package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SmokeDomainSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=704, size64=808)
public class SmokeDomainSettings extends CFacade {

	/**
	 * This is the sdna index of the struct SmokeDomainSettings.
	 * <p>
	 * It is required when allocating a new block to store data for SmokeDomainSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 544;

	/**
	 * Field descriptor (offset) for struct member 'smd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For fast RNA access. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__smd);
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
	 * Field descriptor (offset) for struct member 'fluid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__fluid);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_fluid = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluid'</li>
	 * <li>Signature: 'FLUID_3D*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluid = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'fluid_mutex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__fluid_mutex);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_fluid_mutex = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluid_mutex'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluid_mutex = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'fluid_group'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__fluid_group);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_fluid_group = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluid_group'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluid_group = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'eff_group'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__eff_group);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_eff_group = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eff_group'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eff_group = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'coll_group'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__coll_group);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_coll_group = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coll_group'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coll_group = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'wt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__wt);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_wt = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wt'</li>
	 * <li>Signature: 'WTURBULENCE*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wt = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member 'tex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__tex);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex = new long[]{28, 56};

	/**
	 * Field descriptor (offset) for struct member 'tex_wt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__tex_wt);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_wt = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_wt'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_wt = new long[]{32, 64};

	/**
	 * Field descriptor (offset) for struct member 'tex_shadow'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__tex_shadow);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_shadow = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_shadow'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_shadow = new long[]{36, 72};

	/**
	 * Field descriptor (offset) for struct member 'tex_flame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__tex_flame);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_flame = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_flame'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_flame = new long[]{40, 80};

	/**
	 * Field descriptor (offset) for struct member 'tex_flame_coba'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__tex_flame_coba);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_flame_coba = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_flame_coba'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_flame_coba = new long[]{44, 88};

	/**
	 * Field descriptor (offset) for struct member 'tex_coba'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__tex_coba);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_coba = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_coba'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_coba = new long[]{48, 96};

	/**
	 * Field descriptor (offset) for struct member 'tex_field'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__tex_field);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_field = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_field'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_field = new long[]{52, 104};

	/**
	 * Field descriptor (offset) for struct member 'tex_velocity_x'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__tex_velocity_x);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_velocity_x = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_velocity_x'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_velocity_x = new long[]{56, 112};

	/**
	 * Field descriptor (offset) for struct member 'tex_velocity_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__tex_velocity_y);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_velocity_y = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_velocity_y'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_velocity_y = new long[]{60, 120};

	/**
	 * Field descriptor (offset) for struct member 'tex_velocity_z'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__tex_velocity_z);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_velocity_z = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_velocity_z'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_velocity_z = new long[]{64, 128};

	/**
	 * Field descriptor (offset) for struct member 'shadow'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__shadow);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_shadow = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadow'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadow = new long[]{68, 136};

	/**
	 * Field descriptor (offset) for struct member 'p0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> simulation data Start point of BB in local space (includes sub-cell shift for adaptive domain.) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__p0);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_p0 = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'p0'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__p0 = new long[]{72, 144};

	/**
	 * Field descriptor (offset) for struct member 'p1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End point of BB in local space. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__p1);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_p1 = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'p1'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__p1 = new long[]{84, 156};

	/**
	 * Field descriptor (offset) for struct member 'dp0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Difference from object center to grid start point. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__dp0);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_dp0 = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dp0'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dp0 = new long[]{96, 168};

	/**
	 * Field descriptor (offset) for struct member 'cell_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Cell Size<h4>Blender Source Code:</h4>
	 * <p> Size of simulation cell in local space. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__cell_size);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_cell_size = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cell_size'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cell_size = new long[]{108, 180};

	/**
	 * Field descriptor (offset) for struct member 'global_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Global size of domain axises. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__global_size);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_global_size = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'global_size'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__global_size = new long[]{120, 192};

	/**
	 * Field descriptor (offset) for struct member 'prev_loc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__prev_loc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_prev_loc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev_loc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev_loc = new long[]{132, 204};

	/**
	 * Field descriptor (offset) for struct member 'shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current domain shift in simulation cells. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__shift);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_shift = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shift'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shift = new long[]{144, 216};

	/**
	 * Field descriptor (offset) for struct member 'shift_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Exact domain shift. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__shift_f);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_shift_f = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shift_f'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shift_f = new long[]{156, 228};

	/**
	 * Field descriptor (offset) for struct member 'obj_shift_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much object has shifted since previous smoke frame (used to "lock" domain while drawing). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__obj_shift_f);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_obj_shift_f = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'obj_shift_f'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__obj_shift_f = new long[]{168, 240};

	/**
	 * Field descriptor (offset) for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain object imat. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__imat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_imat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'imat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__imat = new long[]{180, 252};

	/**
	 * Field descriptor (offset) for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain obmat. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__obmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_obmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'obmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__obmat = new long[]{244, 316};

	/**
	 * Field descriptor (offset) for struct member 'fluidmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Low res fluid matrix. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__fluidmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_fluidmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluidmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluidmat = new long[]{308, 380};

	/**
	 * Field descriptor (offset) for struct member 'fluidmat_wt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> High res fluid matrix. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__fluidmat_wt);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_fluidmat_wt = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluidmat_wt'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluidmat_wt = new long[]{372, 444};

	/**
	 * Field descriptor (offset) for struct member 'base_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Initial "non-adapted" resolution. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__base_res);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_base_res = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base_res'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base_res = new long[]{436, 508};

	/**
	 * Field descriptor (offset) for struct member 'res_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cell min. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__res_min);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_res_min = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'res_min'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__res_min = new long[]{448, 520};

	/**
	 * Field descriptor (offset) for struct member 'res_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cell max. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__res_max);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_res_max = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'res_max'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__res_max = new long[]{460, 532};

	/**
	 * Field descriptor (offset) for struct member 'res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Data resolution (res_max-res_min). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__res);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_res = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'res'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__res = new long[]{472, 544};

	/**
	 * Field descriptor (offset) for struct member 'total_cells'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__total_cells);
	 * CPointer&lt;Integer&gt; p_total_cells = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'total_cells'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__total_cells = new long[]{484, 556};

	/**
	 * Field descriptor (offset) for struct member 'dx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1.0f / res. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__dx);
	 * CPointer&lt;Float&gt; p_dx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dx = new long[]{488, 560};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Largest domain size. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__scale);
	 * CPointer&lt;Float&gt; p_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale = new long[]{492, 564};

	/**
	 * Field descriptor (offset) for struct member 'adapt_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Margin added around fluid to minimize boundary interference<h4>Blender Source Code:</h4>
	 * <p> user settings </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__adapt_margin);
	 * CPointer&lt;Integer&gt; p_adapt_margin = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adapt_margin'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adapt_margin = new long[]{496, 568};

	/**
	 * Field descriptor (offset) for struct member 'adapt_res'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__adapt_res);
	 * CPointer&lt;Integer&gt; p_adapt_res = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adapt_res'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adapt_res = new long[]{500, 572};

	/**
	 * Field descriptor (offset) for struct member 'adapt_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum amount of fluid cell can contain before it is considered empty
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__adapt_threshold);
	 * CPointer&lt;Float&gt; p_adapt_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adapt_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adapt_threshold = new long[]{504, 576};

	/**
	 * Field descriptor (offset) for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much density affects smoke motion (higher value results in faster rising smoke)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__alpha);
	 * CPointer&lt;Float&gt; p_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha = new long[]{508, 580};

	/**
	 * Field descriptor (offset) for struct member 'beta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much heat affects smoke motion (higher value results in faster rising smoke)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__beta);
	 * CPointer&lt;Float&gt; p_beta = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'beta'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__beta = new long[]{512, 584};

	/**
	 * Field descriptor (offset) for struct member 'amplify'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Enhance the resolution of smoke by this factor using noise<h4>Blender Source Code:</h4>
	 * <p> Wavelet amplification. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__amplify);
	 * CPointer&lt;Integer&gt; p_amplify = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'amplify'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__amplify = new long[]{516, 588};

	/**
	 * Field descriptor (offset) for struct member 'maxres'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Longest axis on the BB gets this resolution assigned. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__maxres);
	 * CPointer&lt;Integer&gt; p_maxres = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxres'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxres = new long[]{520, 592};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Show up-res or low res, etc. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{524, 596};

	/**
	 * Field descriptor (offset) for struct member 'viewsettings'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__viewsettings);
	 * CPointer&lt;Integer&gt; p_viewsettings = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewsettings'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewsettings = new long[]{528, 600};

	/**
	 * Field descriptor (offset) for struct member 'noise'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Noise type: wave, curl, anisotropic. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__noise);
	 * CPointer&lt;Short&gt; p_noise = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noise'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noise = new long[]{532, 604};

	/**
	 * Field descriptor (offset) for struct member 'diss_percent'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__diss_percent);
	 * CPointer&lt;Short&gt; p_diss_percent = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'diss_percent'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__diss_percent = new long[]{534, 606};

	/**
	 * Field descriptor (offset) for struct member 'diss_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In frames. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__diss_speed);
	 * CPointer&lt;Integer&gt; p_diss_speed = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'diss_speed'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__diss_speed = new long[]{536, 608};

	/**
	 * Field descriptor (offset) for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Strength of noise
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__strength);
	 * CPointer&lt;Float&gt; p_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strength = new long[]{540, 612};

	/**
	 * Field descriptor (offset) for struct member 'res_wt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__res_wt);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_res_wt = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'res_wt'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__res_wt = new long[]{544, 616};

	/**
	 * Field descriptor (offset) for struct member 'dx_wt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__dx_wt);
	 * CPointer&lt;Float&gt; p_dx_wt = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dx_wt'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dx_wt = new long[]{556, 628};

	/**
	 * Field descriptor (offset) for struct member 'cache_comp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> point cache options </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__cache_comp);
	 * CPointer&lt;Integer&gt; p_cache_comp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_comp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_comp = new long[]{560, 632};

	/**
	 * Field descriptor (offset) for struct member 'cache_high_comp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__cache_high_comp);
	 * CPointer&lt;Integer&gt; p_cache_high_comp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_high_comp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_high_comp = new long[]{564, 636};

	/**
	 * Field descriptor (offset) for struct member 'openvdb_comp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> OpenVDB cache options </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__openvdb_comp);
	 * CPointer&lt;Integer&gt; p_openvdb_comp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'openvdb_comp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__openvdb_comp = new long[]{568, 640};

	/**
	 * Field descriptor (offset) for struct member 'cache_file_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__cache_file_format);
	 * CPointer&lt;Byte&gt; p_cache_file_format = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_file_format'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_file_format = new long[]{572, 644};

	/**
	 * Field descriptor (offset) for struct member 'data_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Bit depth for writing all scalar (including vector) lower values reduce file size
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__data_depth);
	 * CPointer&lt;Byte&gt; p_data_depth = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_depth'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_depth = new long[]{573, 645};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{574, 646};

	/**
	 * Field descriptor (offset) for struct member 'point_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Smoke uses only one cache from now on (index [0]), but keeping the array for now for reading old files. Definition is in {@link DNA_object_force_types.h} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__point_cache);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;PointCache&gt;&gt;&gt; p_point_cache = p.cast(new Class[]{CArrayFacade.class, CPointer.class, PointCache.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'point_cache'</li>
	 * <li>Signature: 'PointCache*[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__point_cache = new long[]{576, 648};

	/**
	 * Field descriptor (offset) for struct member 'ptcaches'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__ptcaches);
	 * CPointer&lt;CArrayFacade&lt;ListBase&gt;&gt; p_ptcaches = p.cast(new Class[]{CArrayFacade.class, ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ptcaches'</li>
	 * <li>Signature: 'ListBase[2]'</li>
	 * <li>Actual Size (32bit/64bit): 16/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ptcaches = new long[]{584, 664};

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
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__effector_weights);
	 * CPointer&lt;CPointer&lt;EffectorWeights&gt;&gt; p_effector_weights = p.cast(new Class[]{CPointer.class, EffectorWeights.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effector_weights'</li>
	 * <li>Signature: 'EffectorWeights*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effector_weights = new long[]{600, 696};

	/**
	 * Field descriptor (offset) for struct member 'border_collisions'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How domain border collisions are handled. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__border_collisions);
	 * CPointer&lt;Integer&gt; p_border_collisions = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'border_collisions'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__border_collisions = new long[]{604, 704};

	/**
	 * Field descriptor (offset) for struct member 'time_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust simulation speed
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__time_scale);
	 * CPointer&lt;Float&gt; p_time_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_scale = new long[]{608, 708};

	/**
	 * Field descriptor (offset) for struct member 'vorticity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of turbulence/rotation in fluid
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__vorticity);
	 * CPointer&lt;Float&gt; p_vorticity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vorticity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vorticity = new long[]{612, 712};

	/**
	 * Field descriptor (offset) for struct member 'active_fields'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__active_fields);
	 * CPointer&lt;Integer&gt; p_active_fields = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_fields'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_fields = new long[]{616, 716};

	/**
	 * Field descriptor (offset) for struct member 'active_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Monitor color situation of simulation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__active_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_active_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_color = new long[]{620, 720};

	/**
	 * Field descriptor (offset) for struct member 'highres_sampling'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method for sampling the high resolution flow
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__highres_sampling);
	 * CPointer&lt;Integer&gt; p_highres_sampling = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'highres_sampling'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__highres_sampling = new long[]{632, 732};

	/**
	 * Field descriptor (offset) for struct member 'burning_rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of the burning reaction (use larger values for smaller flame)<h4>Blender Source Code:</h4>
	 * <p> flame parameters </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__burning_rate);
	 * CPointer&lt;Float&gt; p_burning_rate = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'burning_rate'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__burning_rate = new long[]{636, 736};

	/**
	 * Field descriptor (offset) for struct member 'flame_smoke'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of smoke created by burning fuel
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__flame_smoke);
	 * CPointer&lt;Float&gt; p_flame_smoke = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flame_smoke'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flame_smoke = new long[]{640, 740};

	/**
	 * Field descriptor (offset) for struct member 'flame_vorticity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Additional vorticity for the flames
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__flame_vorticity);
	 * CPointer&lt;Float&gt; p_flame_vorticity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flame_vorticity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flame_vorticity = new long[]{644, 744};

	/**
	 * Field descriptor (offset) for struct member 'flame_ignition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum temperature of flames
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__flame_ignition);
	 * CPointer&lt;Float&gt; p_flame_ignition = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flame_ignition'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flame_ignition = new long[]{648, 748};

	/**
	 * Field descriptor (offset) for struct member 'flame_max_temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum temperature of flames
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__flame_max_temp);
	 * CPointer&lt;Float&gt; p_flame_max_temp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flame_max_temp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flame_max_temp = new long[]{652, 752};

	/**
	 * Field descriptor (offset) for struct member 'flame_smoke_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color of smoke emitted from burning fuel
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__flame_smoke_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_flame_smoke_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flame_smoke_color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flame_smoke_color = new long[]{656, 756};

	/**
	 * Field descriptor (offset) for struct member 'slice_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How to slice the volume for viewport rendering<h4>Blender Source Code:</h4>
	 * <p> Display settings </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__slice_method);
	 * CPointer&lt;Byte&gt; p_slice_method = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slice_method'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slice_method = new long[]{668, 768};

	/**
	 * Field descriptor (offset) for struct member 'axis_slice_method'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__axis_slice_method);
	 * CPointer&lt;Byte&gt; p_axis_slice_method = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axis_slice_method'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axis_slice_method = new long[]{669, 769};

	/**
	 * Field descriptor (offset) for struct member 'slice_axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__slice_axis);
	 * CPointer&lt;Byte&gt; p_slice_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slice_axis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slice_axis = new long[]{670, 770};

	/**
	 * Field descriptor (offset) for struct member 'draw_velocity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__draw_velocity);
	 * CPointer&lt;Byte&gt; p_draw_velocity = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_velocity'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_velocity = new long[]{671, 771};

	/**
	 * Field descriptor (offset) for struct member 'slice_per_voxel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How many slices per voxel should be generated
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__slice_per_voxel);
	 * CPointer&lt;Float&gt; p_slice_per_voxel = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slice_per_voxel'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slice_per_voxel = new long[]{672, 772};

	/**
	 * Field descriptor (offset) for struct member 'slice_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Position of the slice
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__slice_depth);
	 * CPointer&lt;Float&gt; p_slice_depth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slice_depth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slice_depth = new long[]{676, 776};

	/**
	 * Field descriptor (offset) for struct member 'display_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Thickness of smoke drawing in the viewport
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__display_thickness);
	 * CPointer&lt;Float&gt; p_display_thickness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'display_thickness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__display_thickness = new long[]{680, 780};

	/**
	 * Field descriptor (offset) for struct member 'coba'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__coba);
	 * CPointer&lt;CPointer&lt;ColorBand&gt;&gt; p_coba = p.cast(new Class[]{CPointer.class, ColorBand.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coba'</li>
	 * <li>Signature: 'ColorBand*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coba = new long[]{684, 784};

	/**
	 * Field descriptor (offset) for struct member 'vector_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier for scaling the vectors
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__vector_scale);
	 * CPointer&lt;Float&gt; p_vector_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vector_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vector_scale = new long[]{688, 792};

	/**
	 * Field descriptor (offset) for struct member 'vector_draw_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__vector_draw_type);
	 * CPointer&lt;Byte&gt; p_vector_draw_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vector_draw_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vector_draw_type = new long[]{692, 796};

	/**
	 * Field descriptor (offset) for struct member 'use_coba'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__use_coba);
	 * CPointer&lt;Byte&gt; p_use_coba = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_coba'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_coba = new long[]{693, 797};

	/**
	 * Field descriptor (offset) for struct member 'coba_field'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Simulation field to color map<h4>Blender Source Code:</h4>
	 * <p> Simulation field used for the color mapping. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__coba_field);
	 * CPointer&lt;Byte&gt; p_coba_field = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coba_field'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coba_field = new long[]{694, 798};

	/**
	 * Field descriptor (offset) for struct member 'interp_method'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__interp_method);
	 * CPointer&lt;Byte&gt; p_interp_method = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interp_method'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interp_method = new long[]{695, 799};

	/**
	 * Field descriptor (offset) for struct member 'clipping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value under which voxels are considered empty space to optimize caching and rendering
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__clipping);
	 * CPointer&lt;Float&gt; p_clipping = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clipping'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clipping = new long[]{696, 800};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{700, 804};

	public SmokeDomainSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SmokeDomainSettings(SmokeDomainSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'smd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For fast RNA access. </p>
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
	 * <p> For fast RNA access. </p>
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
	 * Get method for struct member 'fluid'.
	 * @see #__DNA__FIELD__fluid
	 */
	
	public CPointer<Object> getFluid() throws IOException
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
	 * Set method for struct member 'fluid'.
	 * @see #__DNA__FIELD__fluid
	 */
	
	public void setFluid(CPointer<Object> fluid) throws IOException
	{
		long __address = ((fluid == null) ? 0 : fluid.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'fluid_mutex'.
	 * @see #__DNA__FIELD__fluid_mutex
	 */
	
	public CPointer<Object> getFluid_mutex() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fluid_mutex'.
	 * @see #__DNA__FIELD__fluid_mutex
	 */
	
	public void setFluid_mutex(CPointer<Object> fluid_mutex) throws IOException
	{
		long __address = ((fluid_mutex == null) ? 0 : fluid_mutex.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'fluid_group'.
	 * @see #__DNA__FIELD__fluid_group
	 */
	
	public CPointer<Collection> getFluid_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fluid_group'.
	 * @see #__DNA__FIELD__fluid_group
	 */
	
	public void setFluid_group(CPointer<Collection> fluid_group) throws IOException
	{
		long __address = ((fluid_group == null) ? 0 : fluid_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'eff_group'.
	 * @see #__DNA__FIELD__eff_group
	 */
	
	public CPointer<Collection> getEff_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'eff_group'.
	 * @see #__DNA__FIELD__eff_group
	 */
	
	public void setEff_group(CPointer<Collection> eff_group) throws IOException
	{
		long __address = ((eff_group == null) ? 0 : eff_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'coll_group'.
	 * @see #__DNA__FIELD__coll_group
	 */
	
	public CPointer<Collection> getColl_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'coll_group'.
	 * @see #__DNA__FIELD__coll_group
	 */
	
	public void setColl_group(CPointer<Collection> coll_group) throws IOException
	{
		long __address = ((coll_group == null) ? 0 : coll_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'wt'.
	 * @see #__DNA__FIELD__wt
	 */
	
	public CPointer<Object> getWt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'wt'.
	 * @see #__DNA__FIELD__wt
	 */
	
	public void setWt(CPointer<Object> wt) throws IOException
	{
		long __address = ((wt == null) ? 0 : wt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'tex'.
	 * @see #__DNA__FIELD__tex
	 */
	
	public CPointer<Object> getTex() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 28);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex'.
	 * @see #__DNA__FIELD__tex
	 */
	
	public void setTex(CPointer<Object> tex) throws IOException
	{
		long __address = ((tex == null) ? 0 : tex.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 56, __address);
		} else {
			__io__block.writeLong(__io__address + 28, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_wt'.
	 * @see #__DNA__FIELD__tex_wt
	 */
	
	public CPointer<Object> getTex_wt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_wt'.
	 * @see #__DNA__FIELD__tex_wt
	 */
	
	public void setTex_wt(CPointer<Object> tex_wt) throws IOException
	{
		long __address = ((tex_wt == null) ? 0 : tex_wt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 32, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_shadow'.
	 * @see #__DNA__FIELD__tex_shadow
	 */
	
	public CPointer<Object> getTex_shadow() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 36);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_shadow'.
	 * @see #__DNA__FIELD__tex_shadow
	 */
	
	public void setTex_shadow(CPointer<Object> tex_shadow) throws IOException
	{
		long __address = ((tex_shadow == null) ? 0 : tex_shadow.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 72, __address);
		} else {
			__io__block.writeLong(__io__address + 36, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_flame'.
	 * @see #__DNA__FIELD__tex_flame
	 */
	
	public CPointer<Object> getTex_flame() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_flame'.
	 * @see #__DNA__FIELD__tex_flame
	 */
	
	public void setTex_flame(CPointer<Object> tex_flame) throws IOException
	{
		long __address = ((tex_flame == null) ? 0 : tex_flame.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 40, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_flame_coba'.
	 * @see #__DNA__FIELD__tex_flame_coba
	 */
	
	public CPointer<Object> getTex_flame_coba() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 44);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_flame_coba'.
	 * @see #__DNA__FIELD__tex_flame_coba
	 */
	
	public void setTex_flame_coba(CPointer<Object> tex_flame_coba) throws IOException
	{
		long __address = ((tex_flame_coba == null) ? 0 : tex_flame_coba.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 44, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_coba'.
	 * @see #__DNA__FIELD__tex_coba
	 */
	
	public CPointer<Object> getTex_coba() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_coba'.
	 * @see #__DNA__FIELD__tex_coba
	 */
	
	public void setTex_coba(CPointer<Object> tex_coba) throws IOException
	{
		long __address = ((tex_coba == null) ? 0 : tex_coba.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 48, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_field'.
	 * @see #__DNA__FIELD__tex_field
	 */
	
	public CPointer<Object> getTex_field() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 52);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_field'.
	 * @see #__DNA__FIELD__tex_field
	 */
	
	public void setTex_field(CPointer<Object> tex_field) throws IOException
	{
		long __address = ((tex_field == null) ? 0 : tex_field.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 52, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_velocity_x'.
	 * @see #__DNA__FIELD__tex_velocity_x
	 */
	
	public CPointer<Object> getTex_velocity_x() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_velocity_x'.
	 * @see #__DNA__FIELD__tex_velocity_x
	 */
	
	public void setTex_velocity_x(CPointer<Object> tex_velocity_x) throws IOException
	{
		long __address = ((tex_velocity_x == null) ? 0 : tex_velocity_x.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 56, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_velocity_y'.
	 * @see #__DNA__FIELD__tex_velocity_y
	 */
	
	public CPointer<Object> getTex_velocity_y() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 60);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_velocity_y'.
	 * @see #__DNA__FIELD__tex_velocity_y
	 */
	
	public void setTex_velocity_y(CPointer<Object> tex_velocity_y) throws IOException
	{
		long __address = ((tex_velocity_y == null) ? 0 : tex_velocity_y.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 60, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_velocity_z'.
	 * @see #__DNA__FIELD__tex_velocity_z
	 */
	
	public CPointer<Object> getTex_velocity_z() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_velocity_z'.
	 * @see #__DNA__FIELD__tex_velocity_z
	 */
	
	public void setTex_velocity_z(CPointer<Object> tex_velocity_z) throws IOException
	{
		long __address = ((tex_velocity_z == null) ? 0 : tex_velocity_z.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 64, __address);
		}
	}

	/**
	 * Get method for struct member 'shadow'.
	 * @see #__DNA__FIELD__shadow
	 */
	
	public CPointer<Float> getShadow() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 68);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'shadow'.
	 * @see #__DNA__FIELD__shadow
	 */
	
	public void setShadow(CPointer<Float> shadow) throws IOException
	{
		long __address = ((shadow == null) ? 0 : shadow.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 68, __address);
		}
	}

	/**
	 * Get method for struct member 'p0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> simulation data Start point of BB in local space (includes sub-cell shift for adaptive domain.) </p>
	 * @see #__DNA__FIELD__p0
	 */
	
	public CArrayFacade<Float> getP0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'p0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> simulation data Start point of BB in local space (includes sub-cell shift for adaptive domain.) </p>
	 * @see #__DNA__FIELD__p0
	 */
	
	public void setP0(CArrayFacade<Float> p0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(p0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, p0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, p0);
		} else {
			__io__generic__copy( getP0(), p0);
		}
	}

	/**
	 * Get method for struct member 'p1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End point of BB in local space. </p>
	 * @see #__DNA__FIELD__p1
	 */
	
	public CArrayFacade<Float> getP1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 84, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'p1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End point of BB in local space. </p>
	 * @see #__DNA__FIELD__p1
	 */
	
	public void setP1(CArrayFacade<Float> p1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 156;
		} else {
			__dna__offset = 84;
		}
		if (__io__equals(p1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, p1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, p1);
		} else {
			__io__generic__copy( getP1(), p1);
		}
	}

	/**
	 * Get method for struct member 'dp0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Difference from object center to grid start point. </p>
	 * @see #__DNA__FIELD__dp0
	 */
	
	public CArrayFacade<Float> getDp0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dp0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Difference from object center to grid start point. </p>
	 * @see #__DNA__FIELD__dp0
	 */
	
	public void setDp0(CArrayFacade<Float> dp0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(dp0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dp0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dp0);
		} else {
			__io__generic__copy( getDp0(), dp0);
		}
	}

	/**
	 * Get method for struct member 'cell_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Cell Size<h4>Blender Source Code:</h4>
	 * <p> Size of simulation cell in local space. </p>
	 * @see #__DNA__FIELD__cell_size
	 */
	
	public CArrayFacade<Float> getCell_size() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cell_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Cell Size<h4>Blender Source Code:</h4>
	 * <p> Size of simulation cell in local space. </p>
	 * @see #__DNA__FIELD__cell_size
	 */
	
	public void setCell_size(CArrayFacade<Float> cell_size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 180;
		} else {
			__dna__offset = 108;
		}
		if (__io__equals(cell_size, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cell_size)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cell_size);
		} else {
			__io__generic__copy( getCell_size(), cell_size);
		}
	}

	/**
	 * Get method for struct member 'global_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Global size of domain axises. </p>
	 * @see #__DNA__FIELD__global_size
	 */
	
	public CArrayFacade<Float> getGlobal_size() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'global_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Global size of domain axises. </p>
	 * @see #__DNA__FIELD__global_size
	 */
	
	public void setGlobal_size(CArrayFacade<Float> global_size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(global_size, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, global_size)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, global_size);
		} else {
			__io__generic__copy( getGlobal_size(), global_size);
		}
	}

	/**
	 * Get method for struct member 'prev_loc'.
	 * @see #__DNA__FIELD__prev_loc
	 */
	
	public CArrayFacade<Float> getPrev_loc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'prev_loc'.
	 * @see #__DNA__FIELD__prev_loc
	 */
	
	public void setPrev_loc(CArrayFacade<Float> prev_loc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 204;
		} else {
			__dna__offset = 132;
		}
		if (__io__equals(prev_loc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, prev_loc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, prev_loc);
		} else {
			__io__generic__copy( getPrev_loc(), prev_loc);
		}
	}

	/**
	 * Get method for struct member 'shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current domain shift in simulation cells. </p>
	 * @see #__DNA__FIELD__shift
	 */
	
	public CArrayFacade<Integer> getShift() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current domain shift in simulation cells. </p>
	 * @see #__DNA__FIELD__shift
	 */
	
	public void setShift(CArrayFacade<Integer> shift) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 216;
		} else {
			__dna__offset = 144;
		}
		if (__io__equals(shift, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shift)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shift);
		} else {
			__io__generic__copy( getShift(), shift);
		}
	}

	/**
	 * Get method for struct member 'shift_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Exact domain shift. </p>
	 * @see #__DNA__FIELD__shift_f
	 */
	
	public CArrayFacade<Float> getShift_f() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 228, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shift_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Exact domain shift. </p>
	 * @see #__DNA__FIELD__shift_f
	 */
	
	public void setShift_f(CArrayFacade<Float> shift_f) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 228;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(shift_f, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shift_f)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shift_f);
		} else {
			__io__generic__copy( getShift_f(), shift_f);
		}
	}

	/**
	 * Get method for struct member 'obj_shift_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much object has shifted since previous smoke frame (used to "lock" domain while drawing). </p>
	 * @see #__DNA__FIELD__obj_shift_f
	 */
	
	public CArrayFacade<Float> getObj_shift_f() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'obj_shift_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much object has shifted since previous smoke frame (used to "lock" domain while drawing). </p>
	 * @see #__DNA__FIELD__obj_shift_f
	 */
	
	public void setObj_shift_f(CArrayFacade<Float> obj_shift_f) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 240;
		} else {
			__dna__offset = 168;
		}
		if (__io__equals(obj_shift_f, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, obj_shift_f)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, obj_shift_f);
		} else {
			__io__generic__copy( getObj_shift_f(), obj_shift_f);
		}
	}

	/**
	 * Get method for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain object imat. </p>
	 * @see #__DNA__FIELD__imat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getImat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 252, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain object imat. </p>
	 * @see #__DNA__FIELD__imat
	 */
	
	public void setImat(CArrayFacade<CArrayFacade<Float>> imat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 252;
		} else {
			__dna__offset = 180;
		}
		if (__io__equals(imat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, imat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, imat);
		} else {
			__io__generic__copy( getImat(), imat);
		}
	}

	/**
	 * Get method for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain obmat. </p>
	 * @see #__DNA__FIELD__obmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getObmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 316, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 244, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain obmat. </p>
	 * @see #__DNA__FIELD__obmat
	 */
	
	public void setObmat(CArrayFacade<CArrayFacade<Float>> obmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 316;
		} else {
			__dna__offset = 244;
		}
		if (__io__equals(obmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, obmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, obmat);
		} else {
			__io__generic__copy( getObmat(), obmat);
		}
	}

	/**
	 * Get method for struct member 'fluidmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Low res fluid matrix. </p>
	 * @see #__DNA__FIELD__fluidmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getFluidmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 380, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 308, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fluidmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Low res fluid matrix. </p>
	 * @see #__DNA__FIELD__fluidmat
	 */
	
	public void setFluidmat(CArrayFacade<CArrayFacade<Float>> fluidmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 380;
		} else {
			__dna__offset = 308;
		}
		if (__io__equals(fluidmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fluidmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fluidmat);
		} else {
			__io__generic__copy( getFluidmat(), fluidmat);
		}
	}

	/**
	 * Get method for struct member 'fluidmat_wt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> High res fluid matrix. </p>
	 * @see #__DNA__FIELD__fluidmat_wt
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getFluidmat_wt() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 444, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 372, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fluidmat_wt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> High res fluid matrix. </p>
	 * @see #__DNA__FIELD__fluidmat_wt
	 */
	
	public void setFluidmat_wt(CArrayFacade<CArrayFacade<Float>> fluidmat_wt) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 444;
		} else {
			__dna__offset = 372;
		}
		if (__io__equals(fluidmat_wt, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fluidmat_wt)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fluidmat_wt);
		} else {
			__io__generic__copy( getFluidmat_wt(), fluidmat_wt);
		}
	}

	/**
	 * Get method for struct member 'base_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Initial "non-adapted" resolution. </p>
	 * @see #__DNA__FIELD__base_res
	 */
	
	public CArrayFacade<Integer> getBase_res() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 508, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 436, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Initial "non-adapted" resolution. </p>
	 * @see #__DNA__FIELD__base_res
	 */
	
	public void setBase_res(CArrayFacade<Integer> base_res) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 508;
		} else {
			__dna__offset = 436;
		}
		if (__io__equals(base_res, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, base_res)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, base_res);
		} else {
			__io__generic__copy( getBase_res(), base_res);
		}
	}

	/**
	 * Get method for struct member 'res_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cell min. </p>
	 * @see #__DNA__FIELD__res_min
	 */
	
	public CArrayFacade<Integer> getRes_min() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 520, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 448, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'res_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cell min. </p>
	 * @see #__DNA__FIELD__res_min
	 */
	
	public void setRes_min(CArrayFacade<Integer> res_min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 520;
		} else {
			__dna__offset = 448;
		}
		if (__io__equals(res_min, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, res_min)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, res_min);
		} else {
			__io__generic__copy( getRes_min(), res_min);
		}
	}

	/**
	 * Get method for struct member 'res_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cell max. </p>
	 * @see #__DNA__FIELD__res_max
	 */
	
	public CArrayFacade<Integer> getRes_max() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 532, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 460, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'res_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cell max. </p>
	 * @see #__DNA__FIELD__res_max
	 */
	
	public void setRes_max(CArrayFacade<Integer> res_max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 532;
		} else {
			__dna__offset = 460;
		}
		if (__io__equals(res_max, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, res_max)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, res_max);
		} else {
			__io__generic__copy( getRes_max(), res_max);
		}
	}

	/**
	 * Get method for struct member 'res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Data resolution (res_max-res_min). </p>
	 * @see #__DNA__FIELD__res
	 */
	
	public CArrayFacade<Integer> getRes() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 544, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 472, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Data resolution (res_max-res_min). </p>
	 * @see #__DNA__FIELD__res
	 */
	
	public void setRes(CArrayFacade<Integer> res) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 544;
		} else {
			__dna__offset = 472;
		}
		if (__io__equals(res, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, res)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, res);
		} else {
			__io__generic__copy( getRes(), res);
		}
	}

	/**
	 * Get method for struct member 'total_cells'.
	 * @see #__DNA__FIELD__total_cells
	 */
	
	public int getTotal_cells() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 556);
		} else {
			return __io__block.readInt(__io__address + 484);
		}
	}

	/**
	 * Set method for struct member 'total_cells'.
	 * @see #__DNA__FIELD__total_cells
	 */
	
	public void setTotal_cells(int total_cells) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 556, total_cells);
		} else {
			__io__block.writeInt(__io__address + 484, total_cells);
		}
	}

	/**
	 * Get method for struct member 'dx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1.0f / res. </p>
	 * @see #__DNA__FIELD__dx
	 */
	
	public float getDx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 560);
		} else {
			return __io__block.readFloat(__io__address + 488);
		}
	}

	/**
	 * Set method for struct member 'dx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1.0f / res. </p>
	 * @see #__DNA__FIELD__dx
	 */
	
	public void setDx(float dx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 560, dx);
		} else {
			__io__block.writeFloat(__io__address + 488, dx);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Largest domain size. </p>
	 * @see #__DNA__FIELD__scale
	 */
	
	public float getScale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 564);
		} else {
			return __io__block.readFloat(__io__address + 492);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Largest domain size. </p>
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(float scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 564, scale);
		} else {
			__io__block.writeFloat(__io__address + 492, scale);
		}
	}

	/**
	 * Get method for struct member 'adapt_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Margin added around fluid to minimize boundary interference<h4>Blender Source Code:</h4>
	 * <p> user settings </p>
	 * @see #__DNA__FIELD__adapt_margin
	 */
	
	public int getAdapt_margin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 568);
		} else {
			return __io__block.readInt(__io__address + 496);
		}
	}

	/**
	 * Set method for struct member 'adapt_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Margin added around fluid to minimize boundary interference<h4>Blender Source Code:</h4>
	 * <p> user settings </p>
	 * @see #__DNA__FIELD__adapt_margin
	 */
	
	public void setAdapt_margin(int adapt_margin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 568, adapt_margin);
		} else {
			__io__block.writeInt(__io__address + 496, adapt_margin);
		}
	}

	/**
	 * Get method for struct member 'adapt_res'.
	 * @see #__DNA__FIELD__adapt_res
	 */
	
	public int getAdapt_res() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 572);
		} else {
			return __io__block.readInt(__io__address + 500);
		}
	}

	/**
	 * Set method for struct member 'adapt_res'.
	 * @see #__DNA__FIELD__adapt_res
	 */
	
	public void setAdapt_res(int adapt_res) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 572, adapt_res);
		} else {
			__io__block.writeInt(__io__address + 500, adapt_res);
		}
	}

	/**
	 * Get method for struct member 'adapt_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum amount of fluid cell can contain before it is considered empty
	 * @see #__DNA__FIELD__adapt_threshold
	 */
	
	public float getAdapt_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 576);
		} else {
			return __io__block.readFloat(__io__address + 504);
		}
	}

	/**
	 * Set method for struct member 'adapt_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum amount of fluid cell can contain before it is considered empty
	 * @see #__DNA__FIELD__adapt_threshold
	 */
	
	public void setAdapt_threshold(float adapt_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 576, adapt_threshold);
		} else {
			__io__block.writeFloat(__io__address + 504, adapt_threshold);
		}
	}

	/**
	 * Get method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much density affects smoke motion (higher value results in faster rising smoke)
	 * @see #__DNA__FIELD__alpha
	 */
	
	public float getAlpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 580);
		} else {
			return __io__block.readFloat(__io__address + 508);
		}
	}

	/**
	 * Set method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much density affects smoke motion (higher value results in faster rising smoke)
	 * @see #__DNA__FIELD__alpha
	 */
	
	public void setAlpha(float alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 580, alpha);
		} else {
			__io__block.writeFloat(__io__address + 508, alpha);
		}
	}

	/**
	 * Get method for struct member 'beta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much heat affects smoke motion (higher value results in faster rising smoke)
	 * @see #__DNA__FIELD__beta
	 */
	
	public float getBeta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 584);
		} else {
			return __io__block.readFloat(__io__address + 512);
		}
	}

	/**
	 * Set method for struct member 'beta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How much heat affects smoke motion (higher value results in faster rising smoke)
	 * @see #__DNA__FIELD__beta
	 */
	
	public void setBeta(float beta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 584, beta);
		} else {
			__io__block.writeFloat(__io__address + 512, beta);
		}
	}

	/**
	 * Get method for struct member 'amplify'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Enhance the resolution of smoke by this factor using noise<h4>Blender Source Code:</h4>
	 * <p> Wavelet amplification. </p>
	 * @see #__DNA__FIELD__amplify
	 */
	
	public int getAmplify() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 588);
		} else {
			return __io__block.readInt(__io__address + 516);
		}
	}

	/**
	 * Set method for struct member 'amplify'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Enhance the resolution of smoke by this factor using noise<h4>Blender Source Code:</h4>
	 * <p> Wavelet amplification. </p>
	 * @see #__DNA__FIELD__amplify
	 */
	
	public void setAmplify(int amplify) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 588, amplify);
		} else {
			__io__block.writeInt(__io__address + 516, amplify);
		}
	}

	/**
	 * Get method for struct member 'maxres'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Longest axis on the BB gets this resolution assigned. </p>
	 * @see #__DNA__FIELD__maxres
	 */
	
	public int getMaxres() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 592);
		} else {
			return __io__block.readInt(__io__address + 520);
		}
	}

	/**
	 * Set method for struct member 'maxres'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Longest axis on the BB gets this resolution assigned. </p>
	 * @see #__DNA__FIELD__maxres
	 */
	
	public void setMaxres(int maxres) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 592, maxres);
		} else {
			__io__block.writeInt(__io__address + 520, maxres);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Show up-res or low res, etc. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 596);
		} else {
			return __io__block.readInt(__io__address + 524);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Show up-res or low res, etc. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 596, flags);
		} else {
			__io__block.writeInt(__io__address + 524, flags);
		}
	}

	/**
	 * Get method for struct member 'viewsettings'.
	 * @see #__DNA__FIELD__viewsettings
	 */
	
	public int getViewsettings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 600);
		} else {
			return __io__block.readInt(__io__address + 528);
		}
	}

	/**
	 * Set method for struct member 'viewsettings'.
	 * @see #__DNA__FIELD__viewsettings
	 */
	
	public void setViewsettings(int viewsettings) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 600, viewsettings);
		} else {
			__io__block.writeInt(__io__address + 528, viewsettings);
		}
	}

	/**
	 * Get method for struct member 'noise'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Noise type: wave, curl, anisotropic. </p>
	 * @see #__DNA__FIELD__noise
	 */
	
	public short getNoise() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 604);
		} else {
			return __io__block.readShort(__io__address + 532);
		}
	}

	/**
	 * Set method for struct member 'noise'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Noise type: wave, curl, anisotropic. </p>
	 * @see #__DNA__FIELD__noise
	 */
	
	public void setNoise(short noise) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 604, noise);
		} else {
			__io__block.writeShort(__io__address + 532, noise);
		}
	}

	/**
	 * Get method for struct member 'diss_percent'.
	 * @see #__DNA__FIELD__diss_percent
	 */
	
	public short getDiss_percent() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 606);
		} else {
			return __io__block.readShort(__io__address + 534);
		}
	}

	/**
	 * Set method for struct member 'diss_percent'.
	 * @see #__DNA__FIELD__diss_percent
	 */
	
	public void setDiss_percent(short diss_percent) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 606, diss_percent);
		} else {
			__io__block.writeShort(__io__address + 534, diss_percent);
		}
	}

	/**
	 * Get method for struct member 'diss_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In frames. </p>
	 * @see #__DNA__FIELD__diss_speed
	 */
	
	public int getDiss_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 608);
		} else {
			return __io__block.readInt(__io__address + 536);
		}
	}

	/**
	 * Set method for struct member 'diss_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In frames. </p>
	 * @see #__DNA__FIELD__diss_speed
	 */
	
	public void setDiss_speed(int diss_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 608, diss_speed);
		} else {
			__io__block.writeInt(__io__address + 536, diss_speed);
		}
	}

	/**
	 * Get method for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Strength of noise
	 * @see #__DNA__FIELD__strength
	 */
	
	public float getStrength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 612);
		} else {
			return __io__block.readFloat(__io__address + 540);
		}
	}

	/**
	 * Set method for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Strength of noise
	 * @see #__DNA__FIELD__strength
	 */
	
	public void setStrength(float strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 612, strength);
		} else {
			__io__block.writeFloat(__io__address + 540, strength);
		}
	}

	/**
	 * Get method for struct member 'res_wt'.
	 * @see #__DNA__FIELD__res_wt
	 */
	
	public CArrayFacade<Integer> getRes_wt() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 616, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 544, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'res_wt'.
	 * @see #__DNA__FIELD__res_wt
	 */
	
	public void setRes_wt(CArrayFacade<Integer> res_wt) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 616;
		} else {
			__dna__offset = 544;
		}
		if (__io__equals(res_wt, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, res_wt)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, res_wt);
		} else {
			__io__generic__copy( getRes_wt(), res_wt);
		}
	}

	/**
	 * Get method for struct member 'dx_wt'.
	 * @see #__DNA__FIELD__dx_wt
	 */
	
	public float getDx_wt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 628);
		} else {
			return __io__block.readFloat(__io__address + 556);
		}
	}

	/**
	 * Set method for struct member 'dx_wt'.
	 * @see #__DNA__FIELD__dx_wt
	 */
	
	public void setDx_wt(float dx_wt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 628, dx_wt);
		} else {
			__io__block.writeFloat(__io__address + 556, dx_wt);
		}
	}

	/**
	 * Get method for struct member 'cache_comp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> point cache options </p>
	 * @see #__DNA__FIELD__cache_comp
	 */
	
	public int getCache_comp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 632);
		} else {
			return __io__block.readInt(__io__address + 560);
		}
	}

	/**
	 * Set method for struct member 'cache_comp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> point cache options </p>
	 * @see #__DNA__FIELD__cache_comp
	 */
	
	public void setCache_comp(int cache_comp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 632, cache_comp);
		} else {
			__io__block.writeInt(__io__address + 560, cache_comp);
		}
	}

	/**
	 * Get method for struct member 'cache_high_comp'.
	 * @see #__DNA__FIELD__cache_high_comp
	 */
	
	public int getCache_high_comp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 636);
		} else {
			return __io__block.readInt(__io__address + 564);
		}
	}

	/**
	 * Set method for struct member 'cache_high_comp'.
	 * @see #__DNA__FIELD__cache_high_comp
	 */
	
	public void setCache_high_comp(int cache_high_comp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 636, cache_high_comp);
		} else {
			__io__block.writeInt(__io__address + 564, cache_high_comp);
		}
	}

	/**
	 * Get method for struct member 'openvdb_comp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> OpenVDB cache options </p>
	 * @see #__DNA__FIELD__openvdb_comp
	 */
	
	public int getOpenvdb_comp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 640);
		} else {
			return __io__block.readInt(__io__address + 568);
		}
	}

	/**
	 * Set method for struct member 'openvdb_comp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> OpenVDB cache options </p>
	 * @see #__DNA__FIELD__openvdb_comp
	 */
	
	public void setOpenvdb_comp(int openvdb_comp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 640, openvdb_comp);
		} else {
			__io__block.writeInt(__io__address + 568, openvdb_comp);
		}
	}

	/**
	 * Get method for struct member 'cache_file_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching
	 * @see #__DNA__FIELD__cache_file_format
	 */
	
	public byte getCache_file_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 644);
		} else {
			return __io__block.readByte(__io__address + 572);
		}
	}

	/**
	 * Set method for struct member 'cache_file_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching
	 * @see #__DNA__FIELD__cache_file_format
	 */
	
	public void setCache_file_format(byte cache_file_format) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 644, cache_file_format);
		} else {
			__io__block.writeByte(__io__address + 572, cache_file_format);
		}
	}

	/**
	 * Get method for struct member 'data_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Bit depth for writing all scalar (including vector) lower values reduce file size
	 * @see #__DNA__FIELD__data_depth
	 */
	
	public byte getData_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 645);
		} else {
			return __io__block.readByte(__io__address + 573);
		}
	}

	/**
	 * Set method for struct member 'data_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Bit depth for writing all scalar (including vector) lower values reduce file size
	 * @see #__DNA__FIELD__data_depth
	 */
	
	public void setData_depth(byte data_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 645, data_depth);
		} else {
			__io__block.writeByte(__io__address + 573, data_depth);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 646, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 574, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 646;
		} else {
			__dna__offset = 574;
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
	 * Get method for struct member 'point_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Smoke uses only one cache from now on (index [0]), but keeping the array for now for reading old files. Definition is in {@link DNA_object_force_types.h} . </p>
	 * @see #__DNA__FIELD__point_cache
	 */
	
	public CArrayFacade<CPointer<PointCache>> getPoint_cache() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, PointCache.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<PointCache>>(__io__address + 648, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<PointCache>>(__io__address + 576, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'point_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Smoke uses only one cache from now on (index [0]), but keeping the array for now for reading old files. Definition is in {@link DNA_object_force_types.h} . </p>
	 * @see #__DNA__FIELD__point_cache
	 */
	
	public void setPoint_cache(CArrayFacade<CPointer<PointCache>> point_cache) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 648;
		} else {
			__dna__offset = 576;
		}
		if (__io__equals(point_cache, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, point_cache)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, point_cache);
		} else {
			__io__generic__copy( getPoint_cache(), point_cache);
		}
	}

	/**
	 * Get method for struct member 'ptcaches'.
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public CArrayFacade<ListBase> getPtcaches() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{ListBase.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<ListBase>(__io__address + 664, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<ListBase>(__io__address + 584, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ptcaches'.
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public void setPtcaches(CArrayFacade<ListBase> ptcaches) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 664;
		} else {
			__dna__offset = 584;
		}
		if (__io__equals(ptcaches, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ptcaches)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ptcaches);
		} else {
			__io__generic__copy( getPtcaches(), ptcaches);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 696);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 600);
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
			__io__block.writeLong(__io__address + 696, __address);
		} else {
			__io__block.writeLong(__io__address + 600, __address);
		}
	}

	/**
	 * Get method for struct member 'border_collisions'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How domain border collisions are handled. </p>
	 * @see #__DNA__FIELD__border_collisions
	 */
	
	public int getBorder_collisions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 704);
		} else {
			return __io__block.readInt(__io__address + 604);
		}
	}

	/**
	 * Set method for struct member 'border_collisions'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How domain border collisions are handled. </p>
	 * @see #__DNA__FIELD__border_collisions
	 */
	
	public void setBorder_collisions(int border_collisions) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 704, border_collisions);
		} else {
			__io__block.writeInt(__io__address + 604, border_collisions);
		}
	}

	/**
	 * Get method for struct member 'time_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust simulation speed
	 * @see #__DNA__FIELD__time_scale
	 */
	
	public float getTime_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 708);
		} else {
			return __io__block.readFloat(__io__address + 608);
		}
	}

	/**
	 * Set method for struct member 'time_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust simulation speed
	 * @see #__DNA__FIELD__time_scale
	 */
	
	public void setTime_scale(float time_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 708, time_scale);
		} else {
			__io__block.writeFloat(__io__address + 608, time_scale);
		}
	}

	/**
	 * Get method for struct member 'vorticity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of turbulence/rotation in fluid
	 * @see #__DNA__FIELD__vorticity
	 */
	
	public float getVorticity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 712);
		} else {
			return __io__block.readFloat(__io__address + 612);
		}
	}

	/**
	 * Set method for struct member 'vorticity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of turbulence/rotation in fluid
	 * @see #__DNA__FIELD__vorticity
	 */
	
	public void setVorticity(float vorticity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 712, vorticity);
		} else {
			__io__block.writeFloat(__io__address + 612, vorticity);
		}
	}

	/**
	 * Get method for struct member 'active_fields'.
	 * @see #__DNA__FIELD__active_fields
	 */
	
	public int getActive_fields() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 716);
		} else {
			return __io__block.readInt(__io__address + 616);
		}
	}

	/**
	 * Set method for struct member 'active_fields'.
	 * @see #__DNA__FIELD__active_fields
	 */
	
	public void setActive_fields(int active_fields) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 716, active_fields);
		} else {
			__io__block.writeInt(__io__address + 616, active_fields);
		}
	}

	/**
	 * Get method for struct member 'active_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Monitor color situation of simulation. </p>
	 * @see #__DNA__FIELD__active_color
	 */
	
	public CArrayFacade<Float> getActive_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 720, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 620, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'active_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Monitor color situation of simulation. </p>
	 * @see #__DNA__FIELD__active_color
	 */
	
	public void setActive_color(CArrayFacade<Float> active_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 720;
		} else {
			__dna__offset = 620;
		}
		if (__io__equals(active_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, active_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, active_color);
		} else {
			__io__generic__copy( getActive_color(), active_color);
		}
	}

	/**
	 * Get method for struct member 'highres_sampling'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method for sampling the high resolution flow
	 * @see #__DNA__FIELD__highres_sampling
	 */
	
	public int getHighres_sampling() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 732);
		} else {
			return __io__block.readInt(__io__address + 632);
		}
	}

	/**
	 * Set method for struct member 'highres_sampling'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method for sampling the high resolution flow
	 * @see #__DNA__FIELD__highres_sampling
	 */
	
	public void setHighres_sampling(int highres_sampling) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 732, highres_sampling);
		} else {
			__io__block.writeInt(__io__address + 632, highres_sampling);
		}
	}

	/**
	 * Get method for struct member 'burning_rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of the burning reaction (use larger values for smaller flame)<h4>Blender Source Code:</h4>
	 * <p> flame parameters </p>
	 * @see #__DNA__FIELD__burning_rate
	 */
	
	public float getBurning_rate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 736);
		} else {
			return __io__block.readFloat(__io__address + 636);
		}
	}

	/**
	 * Set method for struct member 'burning_rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of the burning reaction (use larger values for smaller flame)<h4>Blender Source Code:</h4>
	 * <p> flame parameters </p>
	 * @see #__DNA__FIELD__burning_rate
	 */
	
	public void setBurning_rate(float burning_rate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 736, burning_rate);
		} else {
			__io__block.writeFloat(__io__address + 636, burning_rate);
		}
	}

	/**
	 * Get method for struct member 'flame_smoke'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of smoke created by burning fuel
	 * @see #__DNA__FIELD__flame_smoke
	 */
	
	public float getFlame_smoke() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 740);
		} else {
			return __io__block.readFloat(__io__address + 640);
		}
	}

	/**
	 * Set method for struct member 'flame_smoke'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of smoke created by burning fuel
	 * @see #__DNA__FIELD__flame_smoke
	 */
	
	public void setFlame_smoke(float flame_smoke) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 740, flame_smoke);
		} else {
			__io__block.writeFloat(__io__address + 640, flame_smoke);
		}
	}

	/**
	 * Get method for struct member 'flame_vorticity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Additional vorticity for the flames
	 * @see #__DNA__FIELD__flame_vorticity
	 */
	
	public float getFlame_vorticity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 744);
		} else {
			return __io__block.readFloat(__io__address + 644);
		}
	}

	/**
	 * Set method for struct member 'flame_vorticity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Additional vorticity for the flames
	 * @see #__DNA__FIELD__flame_vorticity
	 */
	
	public void setFlame_vorticity(float flame_vorticity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 744, flame_vorticity);
		} else {
			__io__block.writeFloat(__io__address + 644, flame_vorticity);
		}
	}

	/**
	 * Get method for struct member 'flame_ignition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum temperature of flames
	 * @see #__DNA__FIELD__flame_ignition
	 */
	
	public float getFlame_ignition() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 748);
		} else {
			return __io__block.readFloat(__io__address + 648);
		}
	}

	/**
	 * Set method for struct member 'flame_ignition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum temperature of flames
	 * @see #__DNA__FIELD__flame_ignition
	 */
	
	public void setFlame_ignition(float flame_ignition) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 748, flame_ignition);
		} else {
			__io__block.writeFloat(__io__address + 648, flame_ignition);
		}
	}

	/**
	 * Get method for struct member 'flame_max_temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum temperature of flames
	 * @see #__DNA__FIELD__flame_max_temp
	 */
	
	public float getFlame_max_temp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 752);
		} else {
			return __io__block.readFloat(__io__address + 652);
		}
	}

	/**
	 * Set method for struct member 'flame_max_temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum temperature of flames
	 * @see #__DNA__FIELD__flame_max_temp
	 */
	
	public void setFlame_max_temp(float flame_max_temp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 752, flame_max_temp);
		} else {
			__io__block.writeFloat(__io__address + 652, flame_max_temp);
		}
	}

	/**
	 * Get method for struct member 'flame_smoke_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color of smoke emitted from burning fuel
	 * @see #__DNA__FIELD__flame_smoke_color
	 */
	
	public CArrayFacade<Float> getFlame_smoke_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 756, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 656, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'flame_smoke_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color of smoke emitted from burning fuel
	 * @see #__DNA__FIELD__flame_smoke_color
	 */
	
	public void setFlame_smoke_color(CArrayFacade<Float> flame_smoke_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 756;
		} else {
			__dna__offset = 656;
		}
		if (__io__equals(flame_smoke_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, flame_smoke_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, flame_smoke_color);
		} else {
			__io__generic__copy( getFlame_smoke_color(), flame_smoke_color);
		}
	}

	/**
	 * Get method for struct member 'slice_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How to slice the volume for viewport rendering<h4>Blender Source Code:</h4>
	 * <p> Display settings </p>
	 * @see #__DNA__FIELD__slice_method
	 */
	
	public byte getSlice_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 768);
		} else {
			return __io__block.readByte(__io__address + 668);
		}
	}

	/**
	 * Set method for struct member 'slice_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How to slice the volume for viewport rendering<h4>Blender Source Code:</h4>
	 * <p> Display settings </p>
	 * @see #__DNA__FIELD__slice_method
	 */
	
	public void setSlice_method(byte slice_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 768, slice_method);
		} else {
			__io__block.writeByte(__io__address + 668, slice_method);
		}
	}

	/**
	 * Get method for struct member 'axis_slice_method'.
	 * @see #__DNA__FIELD__axis_slice_method
	 */
	
	public byte getAxis_slice_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 769);
		} else {
			return __io__block.readByte(__io__address + 669);
		}
	}

	/**
	 * Set method for struct member 'axis_slice_method'.
	 * @see #__DNA__FIELD__axis_slice_method
	 */
	
	public void setAxis_slice_method(byte axis_slice_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 769, axis_slice_method);
		} else {
			__io__block.writeByte(__io__address + 669, axis_slice_method);
		}
	}

	/**
	 * Get method for struct member 'slice_axis'.
	 * @see #__DNA__FIELD__slice_axis
	 */
	
	public byte getSlice_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 770);
		} else {
			return __io__block.readByte(__io__address + 670);
		}
	}

	/**
	 * Set method for struct member 'slice_axis'.
	 * @see #__DNA__FIELD__slice_axis
	 */
	
	public void setSlice_axis(byte slice_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 770, slice_axis);
		} else {
			__io__block.writeByte(__io__address + 670, slice_axis);
		}
	}

	/**
	 * Get method for struct member 'draw_velocity'.
	 * @see #__DNA__FIELD__draw_velocity
	 */
	
	public byte getDraw_velocity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 771);
		} else {
			return __io__block.readByte(__io__address + 671);
		}
	}

	/**
	 * Set method for struct member 'draw_velocity'.
	 * @see #__DNA__FIELD__draw_velocity
	 */
	
	public void setDraw_velocity(byte draw_velocity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 771, draw_velocity);
		} else {
			__io__block.writeByte(__io__address + 671, draw_velocity);
		}
	}

	/**
	 * Get method for struct member 'slice_per_voxel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How many slices per voxel should be generated
	 * @see #__DNA__FIELD__slice_per_voxel
	 */
	
	public float getSlice_per_voxel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 772);
		} else {
			return __io__block.readFloat(__io__address + 672);
		}
	}

	/**
	 * Set method for struct member 'slice_per_voxel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How many slices per voxel should be generated
	 * @see #__DNA__FIELD__slice_per_voxel
	 */
	
	public void setSlice_per_voxel(float slice_per_voxel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 772, slice_per_voxel);
		} else {
			__io__block.writeFloat(__io__address + 672, slice_per_voxel);
		}
	}

	/**
	 * Get method for struct member 'slice_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Position of the slice
	 * @see #__DNA__FIELD__slice_depth
	 */
	
	public float getSlice_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 776);
		} else {
			return __io__block.readFloat(__io__address + 676);
		}
	}

	/**
	 * Set method for struct member 'slice_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Position of the slice
	 * @see #__DNA__FIELD__slice_depth
	 */
	
	public void setSlice_depth(float slice_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 776, slice_depth);
		} else {
			__io__block.writeFloat(__io__address + 676, slice_depth);
		}
	}

	/**
	 * Get method for struct member 'display_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Thickness of smoke drawing in the viewport
	 * @see #__DNA__FIELD__display_thickness
	 */
	
	public float getDisplay_thickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 780);
		} else {
			return __io__block.readFloat(__io__address + 680);
		}
	}

	/**
	 * Set method for struct member 'display_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Thickness of smoke drawing in the viewport
	 * @see #__DNA__FIELD__display_thickness
	 */
	
	public void setDisplay_thickness(float display_thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 780, display_thickness);
		} else {
			__io__block.writeFloat(__io__address + 680, display_thickness);
		}
	}

	/**
	 * Get method for struct member 'coba'.
	 * @see #__DNA__FIELD__coba
	 */
	
	public CPointer<ColorBand> getCoba() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 784);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 684);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ColorBand.class};
		return new CPointer<ColorBand>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ColorBand.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'coba'.
	 * @see #__DNA__FIELD__coba
	 */
	
	public void setCoba(CPointer<ColorBand> coba) throws IOException
	{
		long __address = ((coba == null) ? 0 : coba.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 784, __address);
		} else {
			__io__block.writeLong(__io__address + 684, __address);
		}
	}

	/**
	 * Get method for struct member 'vector_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier for scaling the vectors
	 * @see #__DNA__FIELD__vector_scale
	 */
	
	public float getVector_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 792);
		} else {
			return __io__block.readFloat(__io__address + 688);
		}
	}

	/**
	 * Set method for struct member 'vector_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier for scaling the vectors
	 * @see #__DNA__FIELD__vector_scale
	 */
	
	public void setVector_scale(float vector_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 792, vector_scale);
		} else {
			__io__block.writeFloat(__io__address + 688, vector_scale);
		}
	}

	/**
	 * Get method for struct member 'vector_draw_type'.
	 * @see #__DNA__FIELD__vector_draw_type
	 */
	
	public byte getVector_draw_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 796);
		} else {
			return __io__block.readByte(__io__address + 692);
		}
	}

	/**
	 * Set method for struct member 'vector_draw_type'.
	 * @see #__DNA__FIELD__vector_draw_type
	 */
	
	public void setVector_draw_type(byte vector_draw_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 796, vector_draw_type);
		} else {
			__io__block.writeByte(__io__address + 692, vector_draw_type);
		}
	}

	/**
	 * Get method for struct member 'use_coba'.
	 * @see #__DNA__FIELD__use_coba
	 */
	
	public byte getUse_coba() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 797);
		} else {
			return __io__block.readByte(__io__address + 693);
		}
	}

	/**
	 * Set method for struct member 'use_coba'.
	 * @see #__DNA__FIELD__use_coba
	 */
	
	public void setUse_coba(byte use_coba) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 797, use_coba);
		} else {
			__io__block.writeByte(__io__address + 693, use_coba);
		}
	}

	/**
	 * Get method for struct member 'coba_field'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Simulation field to color map<h4>Blender Source Code:</h4>
	 * <p> Simulation field used for the color mapping. </p>
	 * @see #__DNA__FIELD__coba_field
	 */
	
	public byte getCoba_field() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 798);
		} else {
			return __io__block.readByte(__io__address + 694);
		}
	}

	/**
	 * Set method for struct member 'coba_field'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Simulation field to color map<h4>Blender Source Code:</h4>
	 * <p> Simulation field used for the color mapping. </p>
	 * @see #__DNA__FIELD__coba_field
	 */
	
	public void setCoba_field(byte coba_field) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 798, coba_field);
		} else {
			__io__block.writeByte(__io__address + 694, coba_field);
		}
	}

	/**
	 * Get method for struct member 'interp_method'.
	 * @see #__DNA__FIELD__interp_method
	 */
	
	public byte getInterp_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 799);
		} else {
			return __io__block.readByte(__io__address + 695);
		}
	}

	/**
	 * Set method for struct member 'interp_method'.
	 * @see #__DNA__FIELD__interp_method
	 */
	
	public void setInterp_method(byte interp_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 799, interp_method);
		} else {
			__io__block.writeByte(__io__address + 695, interp_method);
		}
	}

	/**
	 * Get method for struct member 'clipping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value under which voxels are considered empty space to optimize caching and rendering
	 * @see #__DNA__FIELD__clipping
	 */
	
	public float getClipping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 800);
		} else {
			return __io__block.readFloat(__io__address + 696);
		}
	}

	/**
	 * Set method for struct member 'clipping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value under which voxels are considered empty space to optimize caching and rendering
	 * @see #__DNA__FIELD__clipping
	 */
	
	public void setClipping(float clipping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 800, clipping);
		} else {
			__io__block.writeFloat(__io__address + 696, clipping);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CArrayFacade<Byte> get_pad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 804, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 700, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CArrayFacade<Byte> _pad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 804;
		} else {
			__dna__offset = 700;
		}
		if (__io__equals(_pad3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad3);
		} else {
			__io__generic__copy( get_pad3(), _pad3);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SmokeDomainSettings> __io__addressof() {
		return new CPointer<SmokeDomainSettings>(__io__address, new Class[]{SmokeDomainSettings.class}, __io__block, __io__blockTable);
	}

}
