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

@CMetaData(size32=148, size64=168)
public class PointDensity extends CFacade {

	/**
	 * This is the sdna index of the struct PointDensity.
	 * <p>
	 * It is required when allocating a new block to store data for PointDensity.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 43;

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
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{14, 14};

	/**
	 * Field descriptor (offset) for struct member 'color_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> psys_color_source </p>
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
	public static final long[] __DNA__FIELD__color_source = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'ob_color_source'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__ob_color_source);
	 * CPointer&lt;Short&gt; p_ob_color_source = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob_color_source'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob_color_source = new long[]{18, 18};

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
	public static final long[] __DNA__FIELD__totpoints = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for '{@link Object} ' or '{@link Particle}  system' type - source object </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  in ob.particlesystem, non-ID pointer not allowed </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache points in worldspace, object space, ... ? </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache points in worldspace, object space, ... ? </p>
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
	 * Field descriptor (offset) for struct member 'vertex_attribute_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex attribute layer for color source, MAX_CUSTOMDATA_LAYER_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD__vertex_attribute_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vertex_attribute_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_attribute_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_attribute_name = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'point_tree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The acceleration tree containing points. </p>
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
	public static final long[] __DNA__FIELD__point_tree = new long[]{100, 104};

	/**
	 * Field descriptor (offset) for struct member 'point_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dynamically allocated extra for extra information, like particle age. </p>
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
	public static final long[] __DNA__FIELD__point_data = new long[]{104, 112};

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
	public static final long[] __DNA__FIELD__noise_size = new long[]{108, 120};

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
	public static final long[] __DNA__FIELD__noise_depth = new long[]{112, 124};

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
	public static final long[] __DNA__FIELD__noise_influence = new long[]{114, 126};

	/**
	 * Field descriptor (offset) for struct member 'noise_basis'.
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
	public static final long[] __DNA__FIELD__noise_basis = new long[]{116, 128};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{118, 130};

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
	public static final long[] __DNA__FIELD__noise_fac = new long[]{124, 136};

	/**
	 * Field descriptor (offset) for struct member 'speed_scale'.
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
	public static final long[] __DNA__FIELD__speed_scale = new long[]{128, 140};

	/**
	 * Field descriptor (offset) for struct member 'falloff_speed_scale'.
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
	public static final long[] __DNA__FIELD__falloff_speed_scale = new long[]{132, 144};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointDensity pointdensity = ...;
	 * CPointer&lt;Object&gt; p = pointdensity.__dna__addressof(PointDensity.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{136, 148};

	/**
	 * Field descriptor (offset) for struct member 'coba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For time -> color </p>
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
	public static final long[] __DNA__FIELD__coba = new long[]{140, 152};

	/**
	 * Field descriptor (offset) for struct member 'falloff_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Falloff density curve. </p>
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
	public static final long[] __DNA__FIELD__falloff_curve = new long[]{144, 160};

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
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 14, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 14, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 14;
		} else {
			__dna__offset = 14;
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
	 * Get method for struct member 'color_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> psys_color_source </p>
	 * @see #__DNA__FIELD__color_source
	 */
	
	public short getColor_source() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'color_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> psys_color_source </p>
	 * @see #__DNA__FIELD__color_source
	 */
	
	public void setColor_source(short color_source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, color_source);
		} else {
			__io__block.writeShort(__io__address + 16, color_source);
		}
	}

	/**
	 * Get method for struct member 'ob_color_source'.
	 * @see #__DNA__FIELD__ob_color_source
	 */
	
	public short getOb_color_source() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'ob_color_source'.
	 * @see #__DNA__FIELD__ob_color_source
	 */
	
	public void setOb_color_source(short ob_color_source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, ob_color_source);
		} else {
			__io__block.writeShort(__io__address + 18, ob_color_source);
		}
	}

	/**
	 * Get method for struct member 'totpoints'.
	 * @see #__DNA__FIELD__totpoints
	 */
	
	public int getTotpoints() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'totpoints'.
	 * @see #__DNA__FIELD__totpoints
	 */
	
	public void setTotpoints(int totpoints) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, totpoints);
		} else {
			__io__block.writeInt(__io__address + 20, totpoints);
		}
	}

	/**
	 * Get method for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for '{@link Object} ' or '{@link Particle}  system' type - source object </p>
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
	 * <h4>Blender Source Code:</h4>
	 * <p> for '{@link Object} ' or '{@link Particle}  system' type - source object </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  in ob.particlesystem, non-ID pointer not allowed </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  in ob.particlesystem, non-ID pointer not allowed </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache points in worldspace, object space, ... ? </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache points in worldspace, object space, ... ? </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache points in worldspace, object space, ... ? </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache points in worldspace, object space, ... ? </p>
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
	 * Get method for struct member 'vertex_attribute_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex attribute layer for color source, MAX_CUSTOMDATA_LAYER_NAME </p>
	 * @see #__DNA__FIELD__vertex_attribute_name
	 */
	
	public CArrayFacade<Byte> getVertex_attribute_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vertex_attribute_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex attribute layer for color source, MAX_CUSTOMDATA_LAYER_NAME </p>
	 * @see #__DNA__FIELD__vertex_attribute_name
	 */
	
	public void setVertex_attribute_name(CArrayFacade<Byte> vertex_attribute_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(vertex_attribute_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vertex_attribute_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vertex_attribute_name);
		} else {
			__io__generic__copy( getVertex_attribute_name(), vertex_attribute_name);
		}
	}

	/**
	 * Get method for struct member 'point_tree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The acceleration tree containing points. </p>
	 * @see #__DNA__FIELD__point_tree
	 */
	
	public CPointer<Object> getPoint_tree() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'point_tree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The acceleration tree containing points. </p>
	 * @see #__DNA__FIELD__point_tree
	 */
	
	public void setPoint_tree(CPointer<Object> point_tree) throws IOException
	{
		long __address = ((point_tree == null) ? 0 : point_tree.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'point_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dynamically allocated extra for extra information, like particle age. </p>
	 * @see #__DNA__FIELD__point_data
	 */
	
	public CPointer<Float> getPoint_data() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'point_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dynamically allocated extra for extra information, like particle age. </p>
	 * @see #__DNA__FIELD__point_data
	 */
	
	public void setPoint_data(CPointer<Float> point_data) throws IOException
	{
		long __address = ((point_data == null) ? 0 : point_data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'noise_size'.
	 * @see #__DNA__FIELD__noise_size
	 */
	
	public float getNoise_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'noise_size'.
	 * @see #__DNA__FIELD__noise_size
	 */
	
	public void setNoise_size(float noise_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, noise_size);
		} else {
			__io__block.writeFloat(__io__address + 108, noise_size);
		}
	}

	/**
	 * Get method for struct member 'noise_depth'.
	 * @see #__DNA__FIELD__noise_depth
	 */
	
	public short getNoise_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 124);
		} else {
			return __io__block.readShort(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'noise_depth'.
	 * @see #__DNA__FIELD__noise_depth
	 */
	
	public void setNoise_depth(short noise_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 124, noise_depth);
		} else {
			__io__block.writeShort(__io__address + 112, noise_depth);
		}
	}

	/**
	 * Get method for struct member 'noise_influence'.
	 * @see #__DNA__FIELD__noise_influence
	 */
	
	public short getNoise_influence() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 126);
		} else {
			return __io__block.readShort(__io__address + 114);
		}
	}

	/**
	 * Set method for struct member 'noise_influence'.
	 * @see #__DNA__FIELD__noise_influence
	 */
	
	public void setNoise_influence(short noise_influence) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 126, noise_influence);
		} else {
			__io__block.writeShort(__io__address + 114, noise_influence);
		}
	}

	/**
	 * Get method for struct member 'noise_basis'.
	 * @see #__DNA__FIELD__noise_basis
	 */
	
	public short getNoise_basis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 128);
		} else {
			return __io__block.readShort(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'noise_basis'.
	 * @see #__DNA__FIELD__noise_basis
	 */
	
	public void setNoise_basis(short noise_basis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 128, noise_basis);
		} else {
			__io__block.writeShort(__io__address + 116, noise_basis);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 130, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 118, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 130;
		} else {
			__dna__offset = 118;
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
	 * Get method for struct member 'noise_fac'.
	 * @see #__DNA__FIELD__noise_fac
	 */
	
	public float getNoise_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 136);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'noise_fac'.
	 * @see #__DNA__FIELD__noise_fac
	 */
	
	public void setNoise_fac(float noise_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 136, noise_fac);
		} else {
			__io__block.writeFloat(__io__address + 124, noise_fac);
		}
	}

	/**
	 * Get method for struct member 'speed_scale'.
	 * @see #__DNA__FIELD__speed_scale
	 */
	
	public float getSpeed_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'speed_scale'.
	 * @see #__DNA__FIELD__speed_scale
	 */
	
	public void setSpeed_scale(float speed_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, speed_scale);
		} else {
			__io__block.writeFloat(__io__address + 128, speed_scale);
		}
	}

	/**
	 * Get method for struct member 'falloff_speed_scale'.
	 * @see #__DNA__FIELD__falloff_speed_scale
	 */
	
	public float getFalloff_speed_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'falloff_speed_scale'.
	 * @see #__DNA__FIELD__falloff_speed_scale
	 */
	
	public void setFalloff_speed_scale(float falloff_speed_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, falloff_speed_scale);
		} else {
			__io__block.writeFloat(__io__address + 132, falloff_speed_scale);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 148;
		} else {
			__dna__offset = 136;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Get method for struct member 'coba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For time -> color </p>
	 * @see #__DNA__FIELD__coba
	 */
	
	public CPointer<ColorBand> getCoba() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ColorBand.class};
		return new CPointer<ColorBand>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ColorBand.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'coba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For time -> color </p>
	 * @see #__DNA__FIELD__coba
	 */
	
	public void setCoba(CPointer<ColorBand> coba) throws IOException
	{
		long __address = ((coba == null) ? 0 : coba.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Get method for struct member 'falloff_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Falloff density curve. </p>
	 * @see #__DNA__FIELD__falloff_curve
	 */
	
	public CPointer<CurveMapping> getFalloff_curve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'falloff_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Falloff density curve. </p>
	 * @see #__DNA__FIELD__falloff_curve
	 */
	
	public void setFalloff_curve(CPointer<CurveMapping> falloff_curve) throws IOException
	{
		long __address = ((falloff_curve == null) ? 0 : falloff_curve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 144, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<PointDensity> __io__addressof() {
		return new CPointer<PointDensity>(__io__address, new Class[]{PointDensity.class}, __io__block, __io__blockTable);
	}

}
