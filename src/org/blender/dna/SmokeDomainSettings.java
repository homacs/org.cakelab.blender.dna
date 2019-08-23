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

@CMetaData(size32=508, size64=584)
public class SmokeDomainSettings extends CFacade {

	/**
	 * This is the sdna index of the struct SmokeDomainSettings.
	 * <p>
	 * It is required when allocating a new block to store data for SmokeDomainSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 484;

	/**
	 * Field descriptor (offset) for struct member 'smd'.
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit fluid objects to this group
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeDomainSettings smokedomainsettings = ...;
	 * CPointer&lt;Object&gt; p = smokedomainsettings.__dna__addressof(SmokeDomainSettings.__DNA__FIELD__fluid_group);
	 * CPointer&lt;CPointer&lt;Group&gt;&gt; p_fluid_group = p.cast(new Class[]{CPointer.class, Group.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluid_group'</li>
	 * <li>Signature: 'Group*'</li>
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
	 * CPointer&lt;CPointer&lt;Group&gt;&gt; p_eff_group = p.cast(new Class[]{CPointer.class, Group.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eff_group'</li>
	 * <li>Signature: 'Group*'</li>
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
	 * CPointer&lt;CPointer&lt;Group&gt;&gt; p_coll_group = p.cast(new Class[]{CPointer.class, Group.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coll_group'</li>
	 * <li>Signature: 'Group*'</li>
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
	public static final long[] __DNA__FIELD__shadow = new long[]{44, 88};

	/**
	 * Field descriptor (offset) for struct member 'p0'.
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
	public static final long[] __DNA__FIELD__p0 = new long[]{48, 96};

	/**
	 * Field descriptor (offset) for struct member 'p1'.
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
	public static final long[] __DNA__FIELD__p1 = new long[]{60, 108};

	/**
	 * Field descriptor (offset) for struct member 'dp0'.
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
	public static final long[] __DNA__FIELD__dp0 = new long[]{72, 120};

	/**
	 * Field descriptor (offset) for struct member 'cell_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Cell Size
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
	public static final long[] __DNA__FIELD__cell_size = new long[]{84, 132};

	/**
	 * Field descriptor (offset) for struct member 'global_size'.
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
	public static final long[] __DNA__FIELD__global_size = new long[]{96, 144};

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
	public static final long[] __DNA__FIELD__prev_loc = new long[]{108, 156};

	/**
	 * Field descriptor (offset) for struct member 'shift'.
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
	public static final long[] __DNA__FIELD__shift = new long[]{120, 168};

	/**
	 * Field descriptor (offset) for struct member 'shift_f'.
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
	public static final long[] __DNA__FIELD__shift_f = new long[]{132, 180};

	/**
	 * Field descriptor (offset) for struct member 'obj_shift_f'.
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
	public static final long[] __DNA__FIELD__obj_shift_f = new long[]{144, 192};

	/**
	 * Field descriptor (offset) for struct member 'imat'.
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
	public static final long[] __DNA__FIELD__imat = new long[]{156, 204};

	/**
	 * Field descriptor (offset) for struct member 'obmat'.
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
	public static final long[] __DNA__FIELD__obmat = new long[]{220, 268};

	/**
	 * Field descriptor (offset) for struct member 'base_res'.
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
	public static final long[] __DNA__FIELD__base_res = new long[]{284, 332};

	/**
	 * Field descriptor (offset) for struct member 'res_min'.
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
	public static final long[] __DNA__FIELD__res_min = new long[]{296, 344};

	/**
	 * Field descriptor (offset) for struct member 'res_max'.
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
	public static final long[] __DNA__FIELD__res_max = new long[]{308, 356};

	/**
	 * Field descriptor (offset) for struct member 'res'.
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
	public static final long[] __DNA__FIELD__res = new long[]{320, 368};

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
	public static final long[] __DNA__FIELD__total_cells = new long[]{332, 380};

	/**
	 * Field descriptor (offset) for struct member 'dx'.
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
	public static final long[] __DNA__FIELD__dx = new long[]{336, 384};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
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
	public static final long[] __DNA__FIELD__scale = new long[]{340, 388};

	/**
	 * Field descriptor (offset) for struct member 'adapt_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Margin added around fluid to minimize boundary interference
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
	public static final long[] __DNA__FIELD__adapt_margin = new long[]{344, 392};

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
	public static final long[] __DNA__FIELD__adapt_res = new long[]{348, 396};

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
	public static final long[] __DNA__FIELD__adapt_threshold = new long[]{352, 400};

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
	public static final long[] __DNA__FIELD__alpha = new long[]{356, 404};

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
	public static final long[] __DNA__FIELD__beta = new long[]{360, 408};

	/**
	 * Field descriptor (offset) for struct member 'amplify'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Enhance the resolution of smoke by this factor using noise
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
	public static final long[] __DNA__FIELD__amplify = new long[]{364, 412};

	/**
	 * Field descriptor (offset) for struct member 'maxres'.
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
	public static final long[] __DNA__FIELD__maxres = new long[]{368, 416};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
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
	public static final long[] __DNA__FIELD__flags = new long[]{372, 420};

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
	public static final long[] __DNA__FIELD__viewsettings = new long[]{376, 424};

	/**
	 * Field descriptor (offset) for struct member 'noise'.
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
	public static final long[] __DNA__FIELD__noise = new long[]{380, 428};

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
	public static final long[] __DNA__FIELD__diss_percent = new long[]{382, 430};

	/**
	 * Field descriptor (offset) for struct member 'diss_speed'.
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
	public static final long[] __DNA__FIELD__diss_speed = new long[]{384, 432};

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
	public static final long[] __DNA__FIELD__strength = new long[]{388, 436};

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
	public static final long[] __DNA__FIELD__res_wt = new long[]{392, 440};

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
	public static final long[] __DNA__FIELD__dx_wt = new long[]{404, 452};

	/**
	 * Field descriptor (offset) for struct member 'cache_comp'.
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
	public static final long[] __DNA__FIELD__cache_comp = new long[]{408, 456};

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
	public static final long[] __DNA__FIELD__cache_high_comp = new long[]{412, 460};

	/**
	 * Field descriptor (offset) for struct member 'point_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
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
	public static final long[] __DNA__FIELD__point_cache = new long[]{416, 464};

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
	public static final long[] __DNA__FIELD__ptcaches = new long[]{424, 480};

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
	public static final long[] __DNA__FIELD__effector_weights = new long[]{440, 512};

	/**
	 * Field descriptor (offset) for struct member 'border_collisions'.
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
	public static final long[] __DNA__FIELD__border_collisions = new long[]{444, 520};

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
	public static final long[] __DNA__FIELD__time_scale = new long[]{448, 524};

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
	public static final long[] __DNA__FIELD__vorticity = new long[]{452, 528};

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
	public static final long[] __DNA__FIELD__active_fields = new long[]{456, 532};

	/**
	 * Field descriptor (offset) for struct member 'active_color'.
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
	public static final long[] __DNA__FIELD__active_color = new long[]{460, 536};

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
	public static final long[] __DNA__FIELD__highres_sampling = new long[]{472, 548};

	/**
	 * Field descriptor (offset) for struct member 'burning_rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of the burning reaction (use larger values for smaller flame)
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
	public static final long[] __DNA__FIELD__burning_rate = new long[]{476, 552};

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
	public static final long[] __DNA__FIELD__flame_smoke = new long[]{480, 556};

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
	public static final long[] __DNA__FIELD__flame_vorticity = new long[]{484, 560};

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
	public static final long[] __DNA__FIELD__flame_ignition = new long[]{488, 564};

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
	public static final long[] __DNA__FIELD__flame_max_temp = new long[]{492, 568};

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
	public static final long[] __DNA__FIELD__flame_smoke_color = new long[]{496, 572};

	public SmokeDomainSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SmokeDomainSettings(SmokeDomainSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'smd'.
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit fluid objects to this group
	 * @see #__DNA__FIELD__fluid_group
	 */
	
	public CPointer<Group> getFluid_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Group.class};
		return new CPointer<Group>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Group.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fluid_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit fluid objects to this group
	 * @see #__DNA__FIELD__fluid_group
	 */
	
	public void setFluid_group(CPointer<Group> fluid_group) throws IOException
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
	
	public CPointer<Group> getEff_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
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
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'coll_group'.
	 * @see #__DNA__FIELD__coll_group
	 */
	
	public CPointer<Group> getColl_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Group.class};
		return new CPointer<Group>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Group.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'coll_group'.
	 * @see #__DNA__FIELD__coll_group
	 */
	
	public void setColl_group(CPointer<Group> coll_group) throws IOException
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
	 * Get method for struct member 'shadow'.
	 * @see #__DNA__FIELD__shadow
	 */
	
	public CPointer<Float> getShadow() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 44);
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
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 44, __address);
		}
	}

	/**
	 * Get method for struct member 'p0'.
	 * @see #__DNA__FIELD__p0
	 */
	
	public CArrayFacade<Float> getP0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'p0'.
	 * @see #__DNA__FIELD__p0
	 */
	
	public void setP0(CArrayFacade<Float> p0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 48;
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
	 * @see #__DNA__FIELD__p1
	 */
	
	public CArrayFacade<Float> getP1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'p1'.
	 * @see #__DNA__FIELD__p1
	 */
	
	public void setP1(CArrayFacade<Float> p1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 108;
		} else {
			__dna__offset = 60;
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
	 * @see #__DNA__FIELD__dp0
	 */
	
	public CArrayFacade<Float> getDp0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dp0'.
	 * @see #__DNA__FIELD__dp0
	 */
	
	public void setDp0(CArrayFacade<Float> dp0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 72;
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
	 * (read-only)    Cell Size
	 * @see #__DNA__FIELD__cell_size
	 */
	
	public CArrayFacade<Float> getCell_size() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 84, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cell_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Cell Size
	 * @see #__DNA__FIELD__cell_size
	 */
	
	public void setCell_size(CArrayFacade<Float> cell_size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 132;
		} else {
			__dna__offset = 84;
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
	 * @see #__DNA__FIELD__global_size
	 */
	
	public CArrayFacade<Float> getGlobal_size() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'global_size'.
	 * @see #__DNA__FIELD__global_size
	 */
	
	public void setGlobal_size(CArrayFacade<Float> global_size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 96;
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
			return new CArrayFacade<Float>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 156;
		} else {
			__dna__offset = 108;
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
	 * @see #__DNA__FIELD__shift
	 */
	
	public CArrayFacade<Integer> getShift() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shift'.
	 * @see #__DNA__FIELD__shift
	 */
	
	public void setShift(CArrayFacade<Integer> shift) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 120;
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
	 * @see #__DNA__FIELD__shift_f
	 */
	
	public CArrayFacade<Float> getShift_f() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shift_f'.
	 * @see #__DNA__FIELD__shift_f
	 */
	
	public void setShift_f(CArrayFacade<Float> shift_f) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 180;
		} else {
			__dna__offset = 132;
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
	 * @see #__DNA__FIELD__obj_shift_f
	 */
	
	public CArrayFacade<Float> getObj_shift_f() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'obj_shift_f'.
	 * @see #__DNA__FIELD__obj_shift_f
	 */
	
	public void setObj_shift_f(CArrayFacade<Float> obj_shift_f) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 144;
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
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'imat'.
	 * @see #__DNA__FIELD__imat
	 */
	
	public void setImat(CArrayFacade<CArrayFacade<Float>> imat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 204;
		} else {
			__dna__offset = 156;
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
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 268, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 220, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'obmat'.
	 * @see #__DNA__FIELD__obmat
	 */
	
	public void setObmat(CArrayFacade<CArrayFacade<Float>> obmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 268;
		} else {
			__dna__offset = 220;
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
	 * Get method for struct member 'base_res'.
	 * @see #__DNA__FIELD__base_res
	 */
	
	public CArrayFacade<Integer> getBase_res() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 332, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 284, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base_res'.
	 * @see #__DNA__FIELD__base_res
	 */
	
	public void setBase_res(CArrayFacade<Integer> base_res) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 332;
		} else {
			__dna__offset = 284;
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
	 * @see #__DNA__FIELD__res_min
	 */
	
	public CArrayFacade<Integer> getRes_min() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 344, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 296, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'res_min'.
	 * @see #__DNA__FIELD__res_min
	 */
	
	public void setRes_min(CArrayFacade<Integer> res_min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 344;
		} else {
			__dna__offset = 296;
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
	 * @see #__DNA__FIELD__res_max
	 */
	
	public CArrayFacade<Integer> getRes_max() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 356, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 308, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'res_max'.
	 * @see #__DNA__FIELD__res_max
	 */
	
	public void setRes_max(CArrayFacade<Integer> res_max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 356;
		} else {
			__dna__offset = 308;
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
	 * @see #__DNA__FIELD__res
	 */
	
	public CArrayFacade<Integer> getRes() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 368, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 320, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'res'.
	 * @see #__DNA__FIELD__res
	 */
	
	public void setRes(CArrayFacade<Integer> res) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 368;
		} else {
			__dna__offset = 320;
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
			return __io__block.readInt(__io__address + 380);
		} else {
			return __io__block.readInt(__io__address + 332);
		}
	}

	/**
	 * Set method for struct member 'total_cells'.
	 * @see #__DNA__FIELD__total_cells
	 */
	
	public void setTotal_cells(int total_cells) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 380, total_cells);
		} else {
			__io__block.writeInt(__io__address + 332, total_cells);
		}
	}

	/**
	 * Get method for struct member 'dx'.
	 * @see #__DNA__FIELD__dx
	 */
	
	public float getDx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 384);
		} else {
			return __io__block.readFloat(__io__address + 336);
		}
	}

	/**
	 * Set method for struct member 'dx'.
	 * @see #__DNA__FIELD__dx
	 */
	
	public void setDx(float dx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 384, dx);
		} else {
			__io__block.writeFloat(__io__address + 336, dx);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public float getScale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 388);
		} else {
			return __io__block.readFloat(__io__address + 340);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(float scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 388, scale);
		} else {
			__io__block.writeFloat(__io__address + 340, scale);
		}
	}

	/**
	 * Get method for struct member 'adapt_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Margin added around fluid to minimize boundary interference
	 * @see #__DNA__FIELD__adapt_margin
	 */
	
	public int getAdapt_margin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 392);
		} else {
			return __io__block.readInt(__io__address + 344);
		}
	}

	/**
	 * Set method for struct member 'adapt_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Margin added around fluid to minimize boundary interference
	 * @see #__DNA__FIELD__adapt_margin
	 */
	
	public void setAdapt_margin(int adapt_margin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 392, adapt_margin);
		} else {
			__io__block.writeInt(__io__address + 344, adapt_margin);
		}
	}

	/**
	 * Get method for struct member 'adapt_res'.
	 * @see #__DNA__FIELD__adapt_res
	 */
	
	public int getAdapt_res() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 396);
		} else {
			return __io__block.readInt(__io__address + 348);
		}
	}

	/**
	 * Set method for struct member 'adapt_res'.
	 * @see #__DNA__FIELD__adapt_res
	 */
	
	public void setAdapt_res(int adapt_res) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 396, adapt_res);
		} else {
			__io__block.writeInt(__io__address + 348, adapt_res);
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
			return __io__block.readFloat(__io__address + 400);
		} else {
			return __io__block.readFloat(__io__address + 352);
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
			__io__block.writeFloat(__io__address + 400, adapt_threshold);
		} else {
			__io__block.writeFloat(__io__address + 352, adapt_threshold);
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
			return __io__block.readFloat(__io__address + 404);
		} else {
			return __io__block.readFloat(__io__address + 356);
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
			__io__block.writeFloat(__io__address + 404, alpha);
		} else {
			__io__block.writeFloat(__io__address + 356, alpha);
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
			return __io__block.readFloat(__io__address + 408);
		} else {
			return __io__block.readFloat(__io__address + 360);
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
			__io__block.writeFloat(__io__address + 408, beta);
		} else {
			__io__block.writeFloat(__io__address + 360, beta);
		}
	}

	/**
	 * Get method for struct member 'amplify'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Enhance the resolution of smoke by this factor using noise
	 * @see #__DNA__FIELD__amplify
	 */
	
	public int getAmplify() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 412);
		} else {
			return __io__block.readInt(__io__address + 364);
		}
	}

	/**
	 * Set method for struct member 'amplify'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Enhance the resolution of smoke by this factor using noise
	 * @see #__DNA__FIELD__amplify
	 */
	
	public void setAmplify(int amplify) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 412, amplify);
		} else {
			__io__block.writeInt(__io__address + 364, amplify);
		}
	}

	/**
	 * Get method for struct member 'maxres'.
	 * @see #__DNA__FIELD__maxres
	 */
	
	public int getMaxres() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 416);
		} else {
			return __io__block.readInt(__io__address + 368);
		}
	}

	/**
	 * Set method for struct member 'maxres'.
	 * @see #__DNA__FIELD__maxres
	 */
	
	public void setMaxres(int maxres) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 416, maxres);
		} else {
			__io__block.writeInt(__io__address + 368, maxres);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 420);
		} else {
			return __io__block.readInt(__io__address + 372);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 420, flags);
		} else {
			__io__block.writeInt(__io__address + 372, flags);
		}
	}

	/**
	 * Get method for struct member 'viewsettings'.
	 * @see #__DNA__FIELD__viewsettings
	 */
	
	public int getViewsettings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 424);
		} else {
			return __io__block.readInt(__io__address + 376);
		}
	}

	/**
	 * Set method for struct member 'viewsettings'.
	 * @see #__DNA__FIELD__viewsettings
	 */
	
	public void setViewsettings(int viewsettings) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 424, viewsettings);
		} else {
			__io__block.writeInt(__io__address + 376, viewsettings);
		}
	}

	/**
	 * Get method for struct member 'noise'.
	 * @see #__DNA__FIELD__noise
	 */
	
	public short getNoise() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 428);
		} else {
			return __io__block.readShort(__io__address + 380);
		}
	}

	/**
	 * Set method for struct member 'noise'.
	 * @see #__DNA__FIELD__noise
	 */
	
	public void setNoise(short noise) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 428, noise);
		} else {
			__io__block.writeShort(__io__address + 380, noise);
		}
	}

	/**
	 * Get method for struct member 'diss_percent'.
	 * @see #__DNA__FIELD__diss_percent
	 */
	
	public short getDiss_percent() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 430);
		} else {
			return __io__block.readShort(__io__address + 382);
		}
	}

	/**
	 * Set method for struct member 'diss_percent'.
	 * @see #__DNA__FIELD__diss_percent
	 */
	
	public void setDiss_percent(short diss_percent) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 430, diss_percent);
		} else {
			__io__block.writeShort(__io__address + 382, diss_percent);
		}
	}

	/**
	 * Get method for struct member 'diss_speed'.
	 * @see #__DNA__FIELD__diss_speed
	 */
	
	public int getDiss_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 432);
		} else {
			return __io__block.readInt(__io__address + 384);
		}
	}

	/**
	 * Set method for struct member 'diss_speed'.
	 * @see #__DNA__FIELD__diss_speed
	 */
	
	public void setDiss_speed(int diss_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 432, diss_speed);
		} else {
			__io__block.writeInt(__io__address + 384, diss_speed);
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
			return __io__block.readFloat(__io__address + 436);
		} else {
			return __io__block.readFloat(__io__address + 388);
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
			__io__block.writeFloat(__io__address + 436, strength);
		} else {
			__io__block.writeFloat(__io__address + 388, strength);
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
			return new CArrayFacade<Integer>(__io__address + 440, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 392, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 440;
		} else {
			__dna__offset = 392;
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
			return __io__block.readFloat(__io__address + 452);
		} else {
			return __io__block.readFloat(__io__address + 404);
		}
	}

	/**
	 * Set method for struct member 'dx_wt'.
	 * @see #__DNA__FIELD__dx_wt
	 */
	
	public void setDx_wt(float dx_wt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 452, dx_wt);
		} else {
			__io__block.writeFloat(__io__address + 404, dx_wt);
		}
	}

	/**
	 * Get method for struct member 'cache_comp'.
	 * @see #__DNA__FIELD__cache_comp
	 */
	
	public int getCache_comp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 456);
		} else {
			return __io__block.readInt(__io__address + 408);
		}
	}

	/**
	 * Set method for struct member 'cache_comp'.
	 * @see #__DNA__FIELD__cache_comp
	 */
	
	public void setCache_comp(int cache_comp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 456, cache_comp);
		} else {
			__io__block.writeInt(__io__address + 408, cache_comp);
		}
	}

	/**
	 * Get method for struct member 'cache_high_comp'.
	 * @see #__DNA__FIELD__cache_high_comp
	 */
	
	public int getCache_high_comp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 460);
		} else {
			return __io__block.readInt(__io__address + 412);
		}
	}

	/**
	 * Set method for struct member 'cache_high_comp'.
	 * @see #__DNA__FIELD__cache_high_comp
	 */
	
	public void setCache_high_comp(int cache_high_comp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 460, cache_high_comp);
		} else {
			__io__block.writeInt(__io__address + 412, cache_high_comp);
		}
	}

	/**
	 * Get method for struct member 'point_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__point_cache
	 */
	
	public CArrayFacade<CPointer<PointCache>> getPoint_cache() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, PointCache.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<PointCache>>(__io__address + 464, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<PointCache>>(__io__address + 416, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'point_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__point_cache
	 */
	
	public void setPoint_cache(CArrayFacade<CPointer<PointCache>> point_cache) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 464;
		} else {
			__dna__offset = 416;
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
			return new CArrayFacade<ListBase>(__io__address + 480, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<ListBase>(__io__address + 424, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 480;
		} else {
			__dna__offset = 424;
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
			__dna__targetAddress = __io__block.readLong(__io__address + 512);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 440);
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
			__io__block.writeLong(__io__address + 512, __address);
		} else {
			__io__block.writeLong(__io__address + 440, __address);
		}
	}

	/**
	 * Get method for struct member 'border_collisions'.
	 * @see #__DNA__FIELD__border_collisions
	 */
	
	public int getBorder_collisions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 520);
		} else {
			return __io__block.readInt(__io__address + 444);
		}
	}

	/**
	 * Set method for struct member 'border_collisions'.
	 * @see #__DNA__FIELD__border_collisions
	 */
	
	public void setBorder_collisions(int border_collisions) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 520, border_collisions);
		} else {
			__io__block.writeInt(__io__address + 444, border_collisions);
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
			return __io__block.readFloat(__io__address + 524);
		} else {
			return __io__block.readFloat(__io__address + 448);
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
			__io__block.writeFloat(__io__address + 524, time_scale);
		} else {
			__io__block.writeFloat(__io__address + 448, time_scale);
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
			return __io__block.readFloat(__io__address + 528);
		} else {
			return __io__block.readFloat(__io__address + 452);
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
			__io__block.writeFloat(__io__address + 528, vorticity);
		} else {
			__io__block.writeFloat(__io__address + 452, vorticity);
		}
	}

	/**
	 * Get method for struct member 'active_fields'.
	 * @see #__DNA__FIELD__active_fields
	 */
	
	public int getActive_fields() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 532);
		} else {
			return __io__block.readInt(__io__address + 456);
		}
	}

	/**
	 * Set method for struct member 'active_fields'.
	 * @see #__DNA__FIELD__active_fields
	 */
	
	public void setActive_fields(int active_fields) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 532, active_fields);
		} else {
			__io__block.writeInt(__io__address + 456, active_fields);
		}
	}

	/**
	 * Get method for struct member 'active_color'.
	 * @see #__DNA__FIELD__active_color
	 */
	
	public CArrayFacade<Float> getActive_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 536, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 460, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'active_color'.
	 * @see #__DNA__FIELD__active_color
	 */
	
	public void setActive_color(CArrayFacade<Float> active_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 536;
		} else {
			__dna__offset = 460;
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
			return __io__block.readInt(__io__address + 548);
		} else {
			return __io__block.readInt(__io__address + 472);
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
			__io__block.writeInt(__io__address + 548, highres_sampling);
		} else {
			__io__block.writeInt(__io__address + 472, highres_sampling);
		}
	}

	/**
	 * Get method for struct member 'burning_rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of the burning reaction (use larger values for smaller flame)
	 * @see #__DNA__FIELD__burning_rate
	 */
	
	public float getBurning_rate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 552);
		} else {
			return __io__block.readFloat(__io__address + 476);
		}
	}

	/**
	 * Set method for struct member 'burning_rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of the burning reaction (use larger values for smaller flame)
	 * @see #__DNA__FIELD__burning_rate
	 */
	
	public void setBurning_rate(float burning_rate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 552, burning_rate);
		} else {
			__io__block.writeFloat(__io__address + 476, burning_rate);
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
			return __io__block.readFloat(__io__address + 556);
		} else {
			return __io__block.readFloat(__io__address + 480);
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
			__io__block.writeFloat(__io__address + 556, flame_smoke);
		} else {
			__io__block.writeFloat(__io__address + 480, flame_smoke);
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
			return __io__block.readFloat(__io__address + 560);
		} else {
			return __io__block.readFloat(__io__address + 484);
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
			__io__block.writeFloat(__io__address + 560, flame_vorticity);
		} else {
			__io__block.writeFloat(__io__address + 484, flame_vorticity);
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
			return __io__block.readFloat(__io__address + 564);
		} else {
			return __io__block.readFloat(__io__address + 488);
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
			__io__block.writeFloat(__io__address + 564, flame_ignition);
		} else {
			__io__block.writeFloat(__io__address + 488, flame_ignition);
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
			return __io__block.readFloat(__io__address + 568);
		} else {
			return __io__block.readFloat(__io__address + 492);
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
			__io__block.writeFloat(__io__address + 568, flame_max_temp);
		} else {
			__io__block.writeFloat(__io__address + 492, flame_max_temp);
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
			return new CArrayFacade<Float>(__io__address + 572, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 496, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 572;
		} else {
			__dna__offset = 496;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SmokeDomainSettings> __io__addressof() {
		return new CPointer<SmokeDomainSettings>(__io__address, new Class[]{SmokeDomainSettings.class}, __io__block, __io__blockTable);
	}

}
