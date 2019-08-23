package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'PointDensity'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=84, size64=104)
public class PointDensity extends CFacade {

	/**
	 * This is the sdna index of the struct PointDensity.
	 * <p>
	 * It is required when allocating a new block to store data for PointDensity.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 28;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'falloff_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__falloff_type);
	 * CPointer&lt;Short&gt; p_falloff_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff_type = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'falloff_softness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__falloff_softness);
	 * CPointer&lt;Float&gt; p_falloff_softness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff_softness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff_softness = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius from the shaded sample to look for points within
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__radius);
	 * CPointer&lt;Float&gt; p_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__radius = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'source'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__source);
	 * CPointer&lt;Short&gt; p_source = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'source'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__source = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'color_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Data to derive color results from
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__color_source);
	 * CPointer&lt;Short&gt; p_color_source = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_source'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_source = new long[]{14, 14};

	/**
	 * Field descriptor (offset) for struct member 'totpoints'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__totpoints);
	 * CPointer&lt;Integer&gt; p_totpoints = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpoints'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpoints = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'pdpad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__pdpad);
	 * CPointer&lt;Integer&gt; p_pdpad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdpad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdpad = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Object to take point data from
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'psys'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__psys);
	 * CPointer&lt;Integer&gt; p_psys = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'psys'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__psys = new long[]{28, 32};

	/**
	 * Field descriptor (offset) for struct member 'psys_cache_space'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__psys_cache_space);
	 * CPointer&lt;Short&gt; p_psys_cache_space = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'psys_cache_space'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__psys_cache_space = new long[]{32, 36};

	/**
	 * Field descriptor (offset) for struct member 'ob_cache_space'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__ob_cache_space);
	 * CPointer&lt;Short&gt; p_ob_cache_space = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob_cache_space'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob_cache_space = new long[]{34, 38};

	/**
	 * Field descriptor (offset) for struct member 'point_tree'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__point_tree);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_point_tree = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'point_tree'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__point_tree = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'point_data'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__point_data);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_point_data = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'point_data'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__point_data = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'noise_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__noise_size);
	 * CPointer&lt;Float&gt; p_noise_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noise_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noise_size = new long[]{44, 56};

	/**
	 * Field descriptor (offset) for struct member 'noise_depth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__noise_depth);
	 * CPointer&lt;Short&gt; p_noise_depth = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noise_depth'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noise_depth = new long[]{48, 60};

	/**
	 * Field descriptor (offset) for struct member 'noise_influence'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__noise_influence);
	 * CPointer&lt;Short&gt; p_noise_influence = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noise_influence'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noise_influence = new long[]{50, 62};

	/**
	 * Field descriptor (offset) for struct member 'noise_basis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Noise formula used for turbulence
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__noise_basis);
	 * CPointer&lt;Short&gt; p_noise_basis = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noise_basis'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noise_basis = new long[]{52, 64};

	/**
	 * Field descriptor (offset) for struct member 'pdpad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__pdpad3);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_pdpad3 = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdpad3'</li>
	 * <li>Signature: 'short[3]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdpad3 = new long[]{54, 66};

	/**
	 * Field descriptor (offset) for struct member 'noise_fac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__noise_fac);
	 * CPointer&lt;Float&gt; p_noise_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noise_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noise_fac = new long[]{60, 72};

	/**
	 * Field descriptor (offset) for struct member 'speed_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier to bring particle speed within an acceptable range
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__speed_scale);
	 * CPointer&lt;Float&gt; p_speed_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'speed_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__speed_scale = new long[]{64, 76};

	/**
	 * Field descriptor (offset) for struct member 'falloff_speed_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier to bring particle speed within an acceptable range
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__falloff_speed_scale);
	 * CPointer&lt;Float&gt; p_falloff_speed_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff_speed_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff_speed_scale = new long[]{68, 80};

	/**
	 * Field descriptor (offset) for struct member 'pdpad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__pdpad2);
	 * CPointer&lt;Float&gt; p_pdpad2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdpad2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdpad2 = new long[]{72, 84};

	/**
	 * Field descriptor (offset) for struct member 'coba'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__coba);
	 * CPointer&lt;CPointer&lt;ColorBand&gt;&gt; p_coba = p.cast(new Class[]{CPointer.class, ColorBand.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coba'</li>
	 * <li>Signature: 'ColorBand*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coba = new long[]{76, 88};

	/**
	 * Field descriptor (offset) for struct member 'falloff_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__falloff_curve);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_falloff_curve = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff_curve'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff_curve = new long[]{80, 96};

	public PointDensity(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected PointDensity(PointDensity that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, flag);
		} else {
			__io__block.writeShort(__io__address + 0, flag);
		}
	}

	/**
	 * Get method for struct member 'falloff_type'.
	 * @see #__DNA__FIELD__falloff_type
	 */
	
	public short getFalloff_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'falloff_type'.
	 * @see #__DNA__FIELD__falloff_type
	 */
	
	public void setFalloff_type(short falloff_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, falloff_type);
		} else {
			__io__block.writeShort(__io__address + 2, falloff_type);
		}
	}

	/**
	 * Get method for struct member 'falloff_softness'.
	 * @see #__DNA__FIELD__falloff_softness
	 */
	
	public float getFalloff_softness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'falloff_softness'.
	 * @see #__DNA__FIELD__falloff_softness
	 */
	
	public void setFalloff_softness(float falloff_softness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, falloff_softness);
		} else {
			__io__block.writeFloat(__io__address + 4, falloff_softness);
		}
	}

	/**
	 * Get method for struct member 'radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius from the shaded sample to look for points within
	 * @see #__DNA__FIELD__radius
	 */
	
	public float getRadius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius from the shaded sample to look for points within
	 * @see #__DNA__FIELD__radius
	 */
	
	public void setRadius(float radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, radius);
		} else {
			__io__block.writeFloat(__io__address + 8, radius);
		}
	}

	/**
	 * Get method for struct member 'source'.
	 * @see #__DNA__FIELD__source
	 */
	
	public short getSource() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'source'.
	 * @see #__DNA__FIELD__source
	 */
	
	public void setSource(short source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12, source);
		} else {
			__io__block.writeShort(__io__address + 12, source);
		}
	}

	/**
	 * Get method for struct member 'color_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Data to derive color results from
	 * @see #__DNA__FIELD__color_source
	 */
	
	public short getColor_source() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 14);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'color_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Data to derive color results from
	 * @see #__DNA__FIELD__color_source
	 */
	
	public void setColor_source(short color_source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 14, color_source);
		} else {
			__io__block.writeShort(__io__address + 14, color_source);
		}
	}

	/**
	 * Get method for struct member 'totpoints'.
	 * @see #__DNA__FIELD__totpoints
	 */
	
	public int getTotpoints() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'totpoints'.
	 * @see #__DNA__FIELD__totpoints
	 */
	
	public void setTotpoints(int totpoints) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, totpoints);
		} else {
			__io__block.writeInt(__io__address + 16, totpoints);
		}
	}

	/**
	 * Get method for struct member 'pdpad'.
	 * @see #__DNA__FIELD__pdpad
	 */
	
	public int getPdpad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'pdpad'.
	 * @see #__DNA__FIELD__pdpad
	 */
	
	public void setPdpad(int pdpad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, pdpad);
		} else {
			__io__block.writeInt(__io__address + 20, pdpad);
		}
	}

	/**
	 * Get method for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Object to take point data from
	 * @see #__DNA__FIELD__object
	 */
	
	public CPointer<BlenderObject> getObject() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Object to take point data from
	 * @see #__DNA__FIELD__object
	 */
	
	public void setObject(CPointer<BlenderObject> object) throws IOException
	{
		long __address = ((object == null) ? 0 : object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'psys'.
	 * @see #__DNA__FIELD__psys
	 */
	
	public int getPsys() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'psys'.
	 * @see #__DNA__FIELD__psys
	 */
	
	public void setPsys(int psys) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, psys);
		} else {
			__io__block.writeInt(__io__address + 28, psys);
		}
	}

	/**
	 * Get method for struct member 'psys_cache_space'.
	 * @see #__DNA__FIELD__psys_cache_space
	 */
	
	public short getPsys_cache_space() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 36);
		} else {
			return __io__block.readShort(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'psys_cache_space'.
	 * @see #__DNA__FIELD__psys_cache_space
	 */
	
	public void setPsys_cache_space(short psys_cache_space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 36, psys_cache_space);
		} else {
			__io__block.writeShort(__io__address + 32, psys_cache_space);
		}
	}

	/**
	 * Get method for struct member 'ob_cache_space'.
	 * @see #__DNA__FIELD__ob_cache_space
	 */
	
	public short getOb_cache_space() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 38);
		} else {
			return __io__block.readShort(__io__address + 34);
		}
	}

	/**
	 * Set method for struct member 'ob_cache_space'.
	 * @see #__DNA__FIELD__ob_cache_space
	 */
	
	public void setOb_cache_space(short ob_cache_space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 38, ob_cache_space);
		} else {
			__io__block.writeShort(__io__address + 34, ob_cache_space);
		}
	}

	/**
	 * Get method for struct member 'point_tree'.
	 * @see #__DNA__FIELD__point_tree
	 */
	
	public CPointer<Object> getPoint_tree() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 36);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'point_tree'.
	 * @see #__DNA__FIELD__point_tree
	 */
	
	public void setPoint_tree(CPointer<Object> point_tree) throws IOException
	{
		long __address = ((point_tree == null) ? 0 : point_tree.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 36, __address);
		}
	}

	/**
	 * Get method for struct member 'point_data'.
	 * @see #__DNA__FIELD__point_data
	 */
	
	public CPointer<Float> getPoint_data() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'point_data'.
	 * @see #__DNA__FIELD__point_data
	 */
	
	public void setPoint_data(CPointer<Float> point_data) throws IOException
	{
		long __address = ((point_data == null) ? 0 : point_data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 40, __address);
		}
	}

	/**
	 * Get method for struct member 'noise_size'.
	 * @see #__DNA__FIELD__noise_size
	 */
	
	public float getNoise_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'noise_size'.
	 * @see #__DNA__FIELD__noise_size
	 */
	
	public void setNoise_size(float noise_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, noise_size);
		} else {
			__io__block.writeFloat(__io__address + 44, noise_size);
		}
	}

	/**
	 * Get method for struct member 'noise_depth'.
	 * @see #__DNA__FIELD__noise_depth
	 */
	
	public short getNoise_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 60);
		} else {
			return __io__block.readShort(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'noise_depth'.
	 * @see #__DNA__FIELD__noise_depth
	 */
	
	public void setNoise_depth(short noise_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 60, noise_depth);
		} else {
			__io__block.writeShort(__io__address + 48, noise_depth);
		}
	}

	/**
	 * Get method for struct member 'noise_influence'.
	 * @see #__DNA__FIELD__noise_influence
	 */
	
	public short getNoise_influence() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 62);
		} else {
			return __io__block.readShort(__io__address + 50);
		}
	}

	/**
	 * Set method for struct member 'noise_influence'.
	 * @see #__DNA__FIELD__noise_influence
	 */
	
	public void setNoise_influence(short noise_influence) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 62, noise_influence);
		} else {
			__io__block.writeShort(__io__address + 50, noise_influence);
		}
	}

	/**
	 * Get method for struct member 'noise_basis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Noise formula used for turbulence
	 * @see #__DNA__FIELD__noise_basis
	 */
	
	public short getNoise_basis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 64);
		} else {
			return __io__block.readShort(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'noise_basis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Noise formula used for turbulence
	 * @see #__DNA__FIELD__noise_basis
	 */
	
	public void setNoise_basis(short noise_basis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 64, noise_basis);
		} else {
			__io__block.writeShort(__io__address + 52, noise_basis);
		}
	}

	/**
	 * Get method for struct member 'pdpad3'.
	 * @see #__DNA__FIELD__pdpad3
	 */
	
	public CArrayFacade<Short> getPdpad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 66, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 54, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pdpad3'.
	 * @see #__DNA__FIELD__pdpad3
	 */
	
	public void setPdpad3(CArrayFacade<Short> pdpad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 66;
		} else {
			__dna__offset = 54;
		}
		if (__io__equals(pdpad3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pdpad3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pdpad3);
		} else {
			__io__generic__copy( getPdpad3(), pdpad3);
		}
	}

	/**
	 * Get method for struct member 'noise_fac'.
	 * @see #__DNA__FIELD__noise_fac
	 */
	
	public float getNoise_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'noise_fac'.
	 * @see #__DNA__FIELD__noise_fac
	 */
	
	public void setNoise_fac(float noise_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, noise_fac);
		} else {
			__io__block.writeFloat(__io__address + 60, noise_fac);
		}
	}

	/**
	 * Get method for struct member 'speed_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier to bring particle speed within an acceptable range
	 * @see #__DNA__FIELD__speed_scale
	 */
	
	public float getSpeed_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'speed_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier to bring particle speed within an acceptable range
	 * @see #__DNA__FIELD__speed_scale
	 */
	
	public void setSpeed_scale(float speed_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, speed_scale);
		} else {
			__io__block.writeFloat(__io__address + 64, speed_scale);
		}
	}

	/**
	 * Get method for struct member 'falloff_speed_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier to bring particle speed within an acceptable range
	 * @see #__DNA__FIELD__falloff_speed_scale
	 */
	
	public float getFalloff_speed_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'falloff_speed_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier to bring particle speed within an acceptable range
	 * @see #__DNA__FIELD__falloff_speed_scale
	 */
	
	public void setFalloff_speed_scale(float falloff_speed_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, falloff_speed_scale);
		} else {
			__io__block.writeFloat(__io__address + 68, falloff_speed_scale);
		}
	}

	/**
	 * Get method for struct member 'pdpad2'.
	 * @see #__DNA__FIELD__pdpad2
	 */
	
	public float getPdpad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'pdpad2'.
	 * @see #__DNA__FIELD__pdpad2
	 */
	
	public void setPdpad2(float pdpad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, pdpad2);
		} else {
			__io__block.writeFloat(__io__address + 72, pdpad2);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 76);
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
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 76, __address);
		}
	}

	/**
	 * Get method for struct member 'falloff_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__falloff_curve
	 */
	
	public CPointer<CurveMapping> getFalloff_curve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'falloff_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__falloff_curve
	 */
	
	public void setFalloff_curve(CPointer<CurveMapping> falloff_curve) throws IOException
	{
		long __address = ((falloff_curve == null) ? 0 : falloff_curve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 80, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<PointDensity> __io__addressof() {
		return new CPointer<PointDensity>(__io__address, new Class[]{PointDensity.class}, __io__block, __io__blockTable);
	}

}
