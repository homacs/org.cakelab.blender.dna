package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SceneEEVEE'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=252, size64=256)
public class SceneEEVEE extends CFacade {

	/**
	 * This is the sdna index of the struct SceneEEVEE.
	 * <p>
	 * It is required when allocating a new block to store data for SceneEEVEE.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 207;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'gi_diffuse_bounces'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of time the light is reinjected inside light grids, 0 disable indirect diffuse light
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__gi_diffuse_bounces);
	 * CPointer&lt;Integer&gt; p_gi_diffuse_bounces = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gi_diffuse_bounces'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gi_diffuse_bounces = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'gi_cubemap_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of every cubemaps
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__gi_cubemap_resolution);
	 * CPointer&lt;Integer&gt; p_gi_cubemap_resolution = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gi_cubemap_resolution'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gi_cubemap_resolution = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'gi_visibility_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of the shadow map applied to each irradiance sample
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__gi_visibility_resolution);
	 * CPointer&lt;Integer&gt; p_gi_visibility_resolution = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gi_visibility_resolution'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gi_visibility_resolution = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'gi_irradiance_smoothing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Smoother irradiance interpolation but introduce light bleeding
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__gi_irradiance_smoothing);
	 * CPointer&lt;Float&gt; p_gi_irradiance_smoothing = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gi_irradiance_smoothing'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gi_irradiance_smoothing = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'gi_glossy_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Clamp pixel intensity to reduce noise inside glossy reflections from reflection cubemaps (0 to disabled)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__gi_glossy_clamp);
	 * CPointer&lt;Float&gt; p_gi_glossy_clamp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gi_glossy_clamp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gi_glossy_clamp = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'gi_filter_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Take more samples during cubemap filtering to remove artifacts
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__gi_filter_quality);
	 * CPointer&lt;Float&gt; p_gi_filter_quality = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gi_filter_quality'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gi_filter_quality = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'gi_cubemap_draw_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__gi_cubemap_draw_size);
	 * CPointer&lt;Float&gt; p_gi_cubemap_draw_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gi_cubemap_draw_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gi_cubemap_draw_size = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'gi_irradiance_draw_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__gi_irradiance_draw_size);
	 * CPointer&lt;Float&gt; p_gi_irradiance_draw_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gi_irradiance_draw_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gi_irradiance_draw_size = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'taa_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples, unlimited if 0
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__taa_samples);
	 * CPointer&lt;Integer&gt; p_taa_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'taa_samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__taa_samples = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'taa_render_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples per pixels for rendering
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__taa_render_samples);
	 * CPointer&lt;Integer&gt; p_taa_render_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'taa_render_samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__taa_render_samples = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'sss_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to compute the scattering effect
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__sss_samples);
	 * CPointer&lt;Integer&gt; p_sss_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sss_samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sss_samples = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'sss_jitter_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotate samples that are below this threshold
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__sss_jitter_threshold);
	 * CPointer&lt;Float&gt; p_sss_jitter_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sss_jitter_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sss_jitter_threshold = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'ssr_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Precision of the screen space raytracing
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__ssr_quality);
	 * CPointer&lt;Float&gt; p_ssr_quality = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ssr_quality'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ssr_quality = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'ssr_max_roughness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Do not raytrace reflections for roughness above this value
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__ssr_max_roughness);
	 * CPointer&lt;Float&gt; p_ssr_max_roughness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ssr_max_roughness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ssr_max_roughness = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'ssr_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pixel thickness used to detect intersection
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__ssr_thickness);
	 * CPointer&lt;Float&gt; p_ssr_thickness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ssr_thickness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ssr_thickness = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'ssr_border_fade'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Screen percentage used to fade the SSR
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__ssr_border_fade);
	 * CPointer&lt;Float&gt; p_ssr_border_fade = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ssr_border_fade'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ssr_border_fade = new long[]{68, 68};

	/**
	 * Field descriptor (offset) for struct member 'ssr_firefly_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Clamp pixel intensity to remove noise (0 to disabled)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__ssr_firefly_fac);
	 * CPointer&lt;Float&gt; p_ssr_firefly_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ssr_firefly_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ssr_firefly_fac = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'volumetric_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Start distance of the volumetric effect
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__volumetric_start);
	 * CPointer&lt;Float&gt; p_volumetric_start = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volumetric_start'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volumetric_start = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'volumetric_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * End distance of the volumetric effect
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__volumetric_end);
	 * CPointer&lt;Float&gt; p_volumetric_end = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volumetric_end'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volumetric_end = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'volumetric_tile_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Control the quality of the volumetric effects (lower size increase vram usage and quality)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__volumetric_tile_size);
	 * CPointer&lt;Integer&gt; p_volumetric_tile_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volumetric_tile_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volumetric_tile_size = new long[]{84, 84};

	/**
	 * Field descriptor (offset) for struct member 'volumetric_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to compute volumetric effects
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__volumetric_samples);
	 * CPointer&lt;Integer&gt; p_volumetric_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volumetric_samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volumetric_samples = new long[]{88, 88};

	/**
	 * Field descriptor (offset) for struct member 'volumetric_sample_distribution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distribute more samples closer to the camera
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__volumetric_sample_distribution);
	 * CPointer&lt;Float&gt; p_volumetric_sample_distribution = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volumetric_sample_distribution'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volumetric_sample_distribution = new long[]{92, 92};

	/**
	 * Field descriptor (offset) for struct member 'volumetric_light_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum light contribution, reducing noise
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__volumetric_light_clamp);
	 * CPointer&lt;Float&gt; p_volumetric_light_clamp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volumetric_light_clamp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volumetric_light_clamp = new long[]{96, 96};

	/**
	 * Field descriptor (offset) for struct member 'volumetric_shadow_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to compute volumetric shadowing
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__volumetric_shadow_samples);
	 * CPointer&lt;Integer&gt; p_volumetric_shadow_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volumetric_shadow_samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volumetric_shadow_samples = new long[]{100, 100};

	/**
	 * Field descriptor (offset) for struct member 'gtao_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance of object that contribute to the ambient occlusion effect
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__gtao_distance);
	 * CPointer&lt;Float&gt; p_gtao_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gtao_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gtao_distance = new long[]{104, 104};

	/**
	 * Field descriptor (offset) for struct member 'gtao_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for ambient occlusion blending
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__gtao_factor);
	 * CPointer&lt;Float&gt; p_gtao_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gtao_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gtao_factor = new long[]{108, 108};

	/**
	 * Field descriptor (offset) for struct member 'gtao_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Precision of the horizon search
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__gtao_quality);
	 * CPointer&lt;Float&gt; p_gtao_quality = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gtao_quality'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gtao_quality = new long[]{112, 112};

	/**
	 * Field descriptor (offset) for struct member 'bokeh_max_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Max size of the bokeh shape for the depth of field (lower is faster)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__bokeh_max_size);
	 * CPointer&lt;Float&gt; p_bokeh_max_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bokeh_max_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bokeh_max_size = new long[]{116, 116};

	/**
	 * Field descriptor (offset) for struct member 'bokeh_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Brightness threshold for using sprite base depth of field
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__bokeh_threshold);
	 * CPointer&lt;Float&gt; p_bokeh_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bokeh_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bokeh_threshold = new long[]{120, 120};

	/**
	 * Field descriptor (offset) for struct member 'bloom_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color applied to the bloom effect
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__bloom_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_bloom_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bloom_color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bloom_color = new long[]{124, 124};

	/**
	 * Field descriptor (offset) for struct member 'bloom_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Filters out pixels under this level of brightness
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__bloom_threshold);
	 * CPointer&lt;Float&gt; p_bloom_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bloom_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bloom_threshold = new long[]{136, 136};

	/**
	 * Field descriptor (offset) for struct member 'bloom_knee'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Makes transition between under/over-threshold gradual
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__bloom_knee);
	 * CPointer&lt;Float&gt; p_bloom_knee = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bloom_knee'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bloom_knee = new long[]{140, 140};

	/**
	 * Field descriptor (offset) for struct member 'bloom_intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Blend factor
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__bloom_intensity);
	 * CPointer&lt;Float&gt; p_bloom_intensity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bloom_intensity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bloom_intensity = new long[]{144, 144};

	/**
	 * Field descriptor (offset) for struct member 'bloom_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Bloom spread distance
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__bloom_radius);
	 * CPointer&lt;Float&gt; p_bloom_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bloom_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bloom_radius = new long[]{148, 148};

	/**
	 * Field descriptor (offset) for struct member 'bloom_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum intensity a bloom pixel can have (0 to disabled)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__bloom_clamp);
	 * CPointer&lt;Float&gt; p_bloom_clamp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bloom_clamp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bloom_clamp = new long[]{152, 152};

	/**
	 * Field descriptor (offset) for struct member 'motion_blur_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to take with motion blur
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__motion_blur_samples);
	 * CPointer&lt;Integer&gt; p_motion_blur_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'motion_blur_samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__motion_blur_samples = new long[]{156, 156};

	/**
	 * Field descriptor (offset) for struct member 'motion_blur_shutter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Time taken in frames between shutter open and close
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__motion_blur_shutter);
	 * CPointer&lt;Float&gt; p_motion_blur_shutter = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'motion_blur_shutter'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__motion_blur_shutter = new long[]{160, 160};

	/**
	 * Field descriptor (offset) for struct member 'shadow_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Technique use to compute the shadows
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__shadow_method);
	 * CPointer&lt;Integer&gt; p_shadow_method = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadow_method'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadow_method = new long[]{164, 164};

	/**
	 * Field descriptor (offset) for struct member 'shadow_cube_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of point and area light shadow maps
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__shadow_cube_size);
	 * CPointer&lt;Integer&gt; p_shadow_cube_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadow_cube_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadow_cube_size = new long[]{168, 168};

	/**
	 * Field descriptor (offset) for struct member 'shadow_cascade_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of sun light shadow maps
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__shadow_cascade_size);
	 * CPointer&lt;Integer&gt; p_shadow_cascade_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadow_cascade_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadow_cascade_size = new long[]{172, 172};

	/**
	 * Field descriptor (offset) for struct member 'light_cache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__light_cache);
	 * CPointer&lt;CPointer&lt;LightCache&gt;&gt; p_light_cache = p.cast(new Class[]{CPointer.class, LightCache.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'light_cache'</li>
	 * <li>Signature: 'LightCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__light_cache = new long[]{176, 176};

	/**
	 * Field descriptor (offset) for struct member 'light_cache_info'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__light_cache_info);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_light_cache_info = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'light_cache_info'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__light_cache_info = new long[]{180, 184};

	/**
	 * Field descriptor (offset) for struct member 'overscan'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__overscan);
	 * CPointer&lt;Float&gt; p_overscan = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overscan'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overscan = new long[]{244, 248};

	/**
	 * Field descriptor (offset) for struct member 'light_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum light intensity for a light to contribute to the lighting
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneEEVEE sceneeevee = ...;
	 * CPointer&lt;Object&gt; p = sceneeevee.__dna__addressof(SceneEEVEE.__DNA__FIELD__light_threshold);
	 * CPointer&lt;Float&gt; p_light_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'light_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__light_threshold = new long[]{248, 252};

	public SceneEEVEE(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SceneEEVEE(SceneEEVEE that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, flag);
		} else {
			__io__block.writeInt(__io__address + 0, flag);
		}
	}

	/**
	 * Get method for struct member 'gi_diffuse_bounces'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of time the light is reinjected inside light grids, 0 disable indirect diffuse light
	 * @see #__DNA__FIELD__gi_diffuse_bounces
	 */
	
	public int getGi_diffuse_bounces() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'gi_diffuse_bounces'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of time the light is reinjected inside light grids, 0 disable indirect diffuse light
	 * @see #__DNA__FIELD__gi_diffuse_bounces
	 */
	
	public void setGi_diffuse_bounces(int gi_diffuse_bounces) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, gi_diffuse_bounces);
		} else {
			__io__block.writeInt(__io__address + 4, gi_diffuse_bounces);
		}
	}

	/**
	 * Get method for struct member 'gi_cubemap_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of every cubemaps
	 * @see #__DNA__FIELD__gi_cubemap_resolution
	 */
	
	public int getGi_cubemap_resolution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'gi_cubemap_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of every cubemaps
	 * @see #__DNA__FIELD__gi_cubemap_resolution
	 */
	
	public void setGi_cubemap_resolution(int gi_cubemap_resolution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, gi_cubemap_resolution);
		} else {
			__io__block.writeInt(__io__address + 8, gi_cubemap_resolution);
		}
	}

	/**
	 * Get method for struct member 'gi_visibility_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of the shadow map applied to each irradiance sample
	 * @see #__DNA__FIELD__gi_visibility_resolution
	 */
	
	public int getGi_visibility_resolution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'gi_visibility_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of the shadow map applied to each irradiance sample
	 * @see #__DNA__FIELD__gi_visibility_resolution
	 */
	
	public void setGi_visibility_resolution(int gi_visibility_resolution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, gi_visibility_resolution);
		} else {
			__io__block.writeInt(__io__address + 12, gi_visibility_resolution);
		}
	}

	/**
	 * Get method for struct member 'gi_irradiance_smoothing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Smoother irradiance interpolation but introduce light bleeding
	 * @see #__DNA__FIELD__gi_irradiance_smoothing
	 */
	
	public float getGi_irradiance_smoothing() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'gi_irradiance_smoothing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Smoother irradiance interpolation but introduce light bleeding
	 * @see #__DNA__FIELD__gi_irradiance_smoothing
	 */
	
	public void setGi_irradiance_smoothing(float gi_irradiance_smoothing) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, gi_irradiance_smoothing);
		} else {
			__io__block.writeFloat(__io__address + 16, gi_irradiance_smoothing);
		}
	}

	/**
	 * Get method for struct member 'gi_glossy_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Clamp pixel intensity to reduce noise inside glossy reflections from reflection cubemaps (0 to disabled)
	 * @see #__DNA__FIELD__gi_glossy_clamp
	 */
	
	public float getGi_glossy_clamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'gi_glossy_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Clamp pixel intensity to reduce noise inside glossy reflections from reflection cubemaps (0 to disabled)
	 * @see #__DNA__FIELD__gi_glossy_clamp
	 */
	
	public void setGi_glossy_clamp(float gi_glossy_clamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, gi_glossy_clamp);
		} else {
			__io__block.writeFloat(__io__address + 20, gi_glossy_clamp);
		}
	}

	/**
	 * Get method for struct member 'gi_filter_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Take more samples during cubemap filtering to remove artifacts
	 * @see #__DNA__FIELD__gi_filter_quality
	 */
	
	public float getGi_filter_quality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'gi_filter_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Take more samples during cubemap filtering to remove artifacts
	 * @see #__DNA__FIELD__gi_filter_quality
	 */
	
	public void setGi_filter_quality(float gi_filter_quality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, gi_filter_quality);
		} else {
			__io__block.writeFloat(__io__address + 24, gi_filter_quality);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 28;
		} else {
			__dna__offset = 28;
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
	 * Get method for struct member 'gi_cubemap_draw_size'.
	 * @see #__DNA__FIELD__gi_cubemap_draw_size
	 */
	
	public float getGi_cubemap_draw_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'gi_cubemap_draw_size'.
	 * @see #__DNA__FIELD__gi_cubemap_draw_size
	 */
	
	public void setGi_cubemap_draw_size(float gi_cubemap_draw_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, gi_cubemap_draw_size);
		} else {
			__io__block.writeFloat(__io__address + 32, gi_cubemap_draw_size);
		}
	}

	/**
	 * Get method for struct member 'gi_irradiance_draw_size'.
	 * @see #__DNA__FIELD__gi_irradiance_draw_size
	 */
	
	public float getGi_irradiance_draw_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'gi_irradiance_draw_size'.
	 * @see #__DNA__FIELD__gi_irradiance_draw_size
	 */
	
	public void setGi_irradiance_draw_size(float gi_irradiance_draw_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, gi_irradiance_draw_size);
		} else {
			__io__block.writeFloat(__io__address + 36, gi_irradiance_draw_size);
		}
	}

	/**
	 * Get method for struct member 'taa_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples, unlimited if 0
	 * @see #__DNA__FIELD__taa_samples
	 */
	
	public int getTaa_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'taa_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples, unlimited if 0
	 * @see #__DNA__FIELD__taa_samples
	 */
	
	public void setTaa_samples(int taa_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, taa_samples);
		} else {
			__io__block.writeInt(__io__address + 40, taa_samples);
		}
	}

	/**
	 * Get method for struct member 'taa_render_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples per pixels for rendering
	 * @see #__DNA__FIELD__taa_render_samples
	 */
	
	public int getTaa_render_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'taa_render_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples per pixels for rendering
	 * @see #__DNA__FIELD__taa_render_samples
	 */
	
	public void setTaa_render_samples(int taa_render_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, taa_render_samples);
		} else {
			__io__block.writeInt(__io__address + 44, taa_render_samples);
		}
	}

	/**
	 * Get method for struct member 'sss_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to compute the scattering effect
	 * @see #__DNA__FIELD__sss_samples
	 */
	
	public int getSss_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 48);
		} else {
			return __io__block.readInt(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'sss_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to compute the scattering effect
	 * @see #__DNA__FIELD__sss_samples
	 */
	
	public void setSss_samples(int sss_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 48, sss_samples);
		} else {
			__io__block.writeInt(__io__address + 48, sss_samples);
		}
	}

	/**
	 * Get method for struct member 'sss_jitter_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotate samples that are below this threshold
	 * @see #__DNA__FIELD__sss_jitter_threshold
	 */
	
	public float getSss_jitter_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'sss_jitter_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotate samples that are below this threshold
	 * @see #__DNA__FIELD__sss_jitter_threshold
	 */
	
	public void setSss_jitter_threshold(float sss_jitter_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, sss_jitter_threshold);
		} else {
			__io__block.writeFloat(__io__address + 52, sss_jitter_threshold);
		}
	}

	/**
	 * Get method for struct member 'ssr_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Precision of the screen space raytracing
	 * @see #__DNA__FIELD__ssr_quality
	 */
	
	public float getSsr_quality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'ssr_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Precision of the screen space raytracing
	 * @see #__DNA__FIELD__ssr_quality
	 */
	
	public void setSsr_quality(float ssr_quality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, ssr_quality);
		} else {
			__io__block.writeFloat(__io__address + 56, ssr_quality);
		}
	}

	/**
	 * Get method for struct member 'ssr_max_roughness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Do not raytrace reflections for roughness above this value
	 * @see #__DNA__FIELD__ssr_max_roughness
	 */
	
	public float getSsr_max_roughness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'ssr_max_roughness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Do not raytrace reflections for roughness above this value
	 * @see #__DNA__FIELD__ssr_max_roughness
	 */
	
	public void setSsr_max_roughness(float ssr_max_roughness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, ssr_max_roughness);
		} else {
			__io__block.writeFloat(__io__address + 60, ssr_max_roughness);
		}
	}

	/**
	 * Get method for struct member 'ssr_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pixel thickness used to detect intersection
	 * @see #__DNA__FIELD__ssr_thickness
	 */
	
	public float getSsr_thickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'ssr_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pixel thickness used to detect intersection
	 * @see #__DNA__FIELD__ssr_thickness
	 */
	
	public void setSsr_thickness(float ssr_thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, ssr_thickness);
		} else {
			__io__block.writeFloat(__io__address + 64, ssr_thickness);
		}
	}

	/**
	 * Get method for struct member 'ssr_border_fade'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Screen percentage used to fade the SSR
	 * @see #__DNA__FIELD__ssr_border_fade
	 */
	
	public float getSsr_border_fade() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'ssr_border_fade'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Screen percentage used to fade the SSR
	 * @see #__DNA__FIELD__ssr_border_fade
	 */
	
	public void setSsr_border_fade(float ssr_border_fade) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, ssr_border_fade);
		} else {
			__io__block.writeFloat(__io__address + 68, ssr_border_fade);
		}
	}

	/**
	 * Get method for struct member 'ssr_firefly_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Clamp pixel intensity to remove noise (0 to disabled)
	 * @see #__DNA__FIELD__ssr_firefly_fac
	 */
	
	public float getSsr_firefly_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'ssr_firefly_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Clamp pixel intensity to remove noise (0 to disabled)
	 * @see #__DNA__FIELD__ssr_firefly_fac
	 */
	
	public void setSsr_firefly_fac(float ssr_firefly_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, ssr_firefly_fac);
		} else {
			__io__block.writeFloat(__io__address + 72, ssr_firefly_fac);
		}
	}

	/**
	 * Get method for struct member 'volumetric_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Start distance of the volumetric effect
	 * @see #__DNA__FIELD__volumetric_start
	 */
	
	public float getVolumetric_start() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'volumetric_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Start distance of the volumetric effect
	 * @see #__DNA__FIELD__volumetric_start
	 */
	
	public void setVolumetric_start(float volumetric_start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, volumetric_start);
		} else {
			__io__block.writeFloat(__io__address + 76, volumetric_start);
		}
	}

	/**
	 * Get method for struct member 'volumetric_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * End distance of the volumetric effect
	 * @see #__DNA__FIELD__volumetric_end
	 */
	
	public float getVolumetric_end() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'volumetric_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * End distance of the volumetric effect
	 * @see #__DNA__FIELD__volumetric_end
	 */
	
	public void setVolumetric_end(float volumetric_end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, volumetric_end);
		} else {
			__io__block.writeFloat(__io__address + 80, volumetric_end);
		}
	}

	/**
	 * Get method for struct member 'volumetric_tile_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Control the quality of the volumetric effects (lower size increase vram usage and quality)
	 * @see #__DNA__FIELD__volumetric_tile_size
	 */
	
	public int getVolumetric_tile_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'volumetric_tile_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Control the quality of the volumetric effects (lower size increase vram usage and quality)
	 * @see #__DNA__FIELD__volumetric_tile_size
	 */
	
	public void setVolumetric_tile_size(int volumetric_tile_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, volumetric_tile_size);
		} else {
			__io__block.writeInt(__io__address + 84, volumetric_tile_size);
		}
	}

	/**
	 * Get method for struct member 'volumetric_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to compute volumetric effects
	 * @see #__DNA__FIELD__volumetric_samples
	 */
	
	public int getVolumetric_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 88);
		} else {
			return __io__block.readInt(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'volumetric_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to compute volumetric effects
	 * @see #__DNA__FIELD__volumetric_samples
	 */
	
	public void setVolumetric_samples(int volumetric_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 88, volumetric_samples);
		} else {
			__io__block.writeInt(__io__address + 88, volumetric_samples);
		}
	}

	/**
	 * Get method for struct member 'volumetric_sample_distribution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distribute more samples closer to the camera
	 * @see #__DNA__FIELD__volumetric_sample_distribution
	 */
	
	public float getVolumetric_sample_distribution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'volumetric_sample_distribution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distribute more samples closer to the camera
	 * @see #__DNA__FIELD__volumetric_sample_distribution
	 */
	
	public void setVolumetric_sample_distribution(float volumetric_sample_distribution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, volumetric_sample_distribution);
		} else {
			__io__block.writeFloat(__io__address + 92, volumetric_sample_distribution);
		}
	}

	/**
	 * Get method for struct member 'volumetric_light_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum light contribution, reducing noise
	 * @see #__DNA__FIELD__volumetric_light_clamp
	 */
	
	public float getVolumetric_light_clamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'volumetric_light_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum light contribution, reducing noise
	 * @see #__DNA__FIELD__volumetric_light_clamp
	 */
	
	public void setVolumetric_light_clamp(float volumetric_light_clamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, volumetric_light_clamp);
		} else {
			__io__block.writeFloat(__io__address + 96, volumetric_light_clamp);
		}
	}

	/**
	 * Get method for struct member 'volumetric_shadow_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to compute volumetric shadowing
	 * @see #__DNA__FIELD__volumetric_shadow_samples
	 */
	
	public int getVolumetric_shadow_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 100);
		} else {
			return __io__block.readInt(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'volumetric_shadow_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to compute volumetric shadowing
	 * @see #__DNA__FIELD__volumetric_shadow_samples
	 */
	
	public void setVolumetric_shadow_samples(int volumetric_shadow_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 100, volumetric_shadow_samples);
		} else {
			__io__block.writeInt(__io__address + 100, volumetric_shadow_samples);
		}
	}

	/**
	 * Get method for struct member 'gtao_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance of object that contribute to the ambient occlusion effect
	 * @see #__DNA__FIELD__gtao_distance
	 */
	
	public float getGtao_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'gtao_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance of object that contribute to the ambient occlusion effect
	 * @see #__DNA__FIELD__gtao_distance
	 */
	
	public void setGtao_distance(float gtao_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, gtao_distance);
		} else {
			__io__block.writeFloat(__io__address + 104, gtao_distance);
		}
	}

	/**
	 * Get method for struct member 'gtao_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for ambient occlusion blending
	 * @see #__DNA__FIELD__gtao_factor
	 */
	
	public float getGtao_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'gtao_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for ambient occlusion blending
	 * @see #__DNA__FIELD__gtao_factor
	 */
	
	public void setGtao_factor(float gtao_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, gtao_factor);
		} else {
			__io__block.writeFloat(__io__address + 108, gtao_factor);
		}
	}

	/**
	 * Get method for struct member 'gtao_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Precision of the horizon search
	 * @see #__DNA__FIELD__gtao_quality
	 */
	
	public float getGtao_quality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'gtao_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Precision of the horizon search
	 * @see #__DNA__FIELD__gtao_quality
	 */
	
	public void setGtao_quality(float gtao_quality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, gtao_quality);
		} else {
			__io__block.writeFloat(__io__address + 112, gtao_quality);
		}
	}

	/**
	 * Get method for struct member 'bokeh_max_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Max size of the bokeh shape for the depth of field (lower is faster)
	 * @see #__DNA__FIELD__bokeh_max_size
	 */
	
	public float getBokeh_max_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'bokeh_max_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Max size of the bokeh shape for the depth of field (lower is faster)
	 * @see #__DNA__FIELD__bokeh_max_size
	 */
	
	public void setBokeh_max_size(float bokeh_max_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, bokeh_max_size);
		} else {
			__io__block.writeFloat(__io__address + 116, bokeh_max_size);
		}
	}

	/**
	 * Get method for struct member 'bokeh_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Brightness threshold for using sprite base depth of field
	 * @see #__DNA__FIELD__bokeh_threshold
	 */
	
	public float getBokeh_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'bokeh_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Brightness threshold for using sprite base depth of field
	 * @see #__DNA__FIELD__bokeh_threshold
	 */
	
	public void setBokeh_threshold(float bokeh_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, bokeh_threshold);
		} else {
			__io__block.writeFloat(__io__address + 120, bokeh_threshold);
		}
	}

	/**
	 * Get method for struct member 'bloom_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color applied to the bloom effect
	 * @see #__DNA__FIELD__bloom_color
	 */
	
	public CArrayFacade<Float> getBloom_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bloom_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color applied to the bloom effect
	 * @see #__DNA__FIELD__bloom_color
	 */
	
	public void setBloom_color(CArrayFacade<Float> bloom_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 124;
		} else {
			__dna__offset = 124;
		}
		if (__io__equals(bloom_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bloom_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bloom_color);
		} else {
			__io__generic__copy( getBloom_color(), bloom_color);
		}
	}

	/**
	 * Get method for struct member 'bloom_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Filters out pixels under this level of brightness
	 * @see #__DNA__FIELD__bloom_threshold
	 */
	
	public float getBloom_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 136);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'bloom_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Filters out pixels under this level of brightness
	 * @see #__DNA__FIELD__bloom_threshold
	 */
	
	public void setBloom_threshold(float bloom_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 136, bloom_threshold);
		} else {
			__io__block.writeFloat(__io__address + 136, bloom_threshold);
		}
	}

	/**
	 * Get method for struct member 'bloom_knee'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Makes transition between under/over-threshold gradual
	 * @see #__DNA__FIELD__bloom_knee
	 */
	
	public float getBloom_knee() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'bloom_knee'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Makes transition between under/over-threshold gradual
	 * @see #__DNA__FIELD__bloom_knee
	 */
	
	public void setBloom_knee(float bloom_knee) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, bloom_knee);
		} else {
			__io__block.writeFloat(__io__address + 140, bloom_knee);
		}
	}

	/**
	 * Get method for struct member 'bloom_intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Blend factor
	 * @see #__DNA__FIELD__bloom_intensity
	 */
	
	public float getBloom_intensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'bloom_intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Blend factor
	 * @see #__DNA__FIELD__bloom_intensity
	 */
	
	public void setBloom_intensity(float bloom_intensity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, bloom_intensity);
		} else {
			__io__block.writeFloat(__io__address + 144, bloom_intensity);
		}
	}

	/**
	 * Get method for struct member 'bloom_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Bloom spread distance
	 * @see #__DNA__FIELD__bloom_radius
	 */
	
	public float getBloom_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'bloom_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Bloom spread distance
	 * @see #__DNA__FIELD__bloom_radius
	 */
	
	public void setBloom_radius(float bloom_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, bloom_radius);
		} else {
			__io__block.writeFloat(__io__address + 148, bloom_radius);
		}
	}

	/**
	 * Get method for struct member 'bloom_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum intensity a bloom pixel can have (0 to disabled)
	 * @see #__DNA__FIELD__bloom_clamp
	 */
	
	public float getBloom_clamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'bloom_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum intensity a bloom pixel can have (0 to disabled)
	 * @see #__DNA__FIELD__bloom_clamp
	 */
	
	public void setBloom_clamp(float bloom_clamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, bloom_clamp);
		} else {
			__io__block.writeFloat(__io__address + 152, bloom_clamp);
		}
	}

	/**
	 * Get method for struct member 'motion_blur_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to take with motion blur
	 * @see #__DNA__FIELD__motion_blur_samples
	 */
	
	public int getMotion_blur_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 156);
		} else {
			return __io__block.readInt(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'motion_blur_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of samples to take with motion blur
	 * @see #__DNA__FIELD__motion_blur_samples
	 */
	
	public void setMotion_blur_samples(int motion_blur_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 156, motion_blur_samples);
		} else {
			__io__block.writeInt(__io__address + 156, motion_blur_samples);
		}
	}

	/**
	 * Get method for struct member 'motion_blur_shutter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Time taken in frames between shutter open and close
	 * @see #__DNA__FIELD__motion_blur_shutter
	 */
	
	public float getMotion_blur_shutter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'motion_blur_shutter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Time taken in frames between shutter open and close
	 * @see #__DNA__FIELD__motion_blur_shutter
	 */
	
	public void setMotion_blur_shutter(float motion_blur_shutter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, motion_blur_shutter);
		} else {
			__io__block.writeFloat(__io__address + 160, motion_blur_shutter);
		}
	}

	/**
	 * Get method for struct member 'shadow_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Technique use to compute the shadows
	 * @see #__DNA__FIELD__shadow_method
	 */
	
	public int getShadow_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 164);
		} else {
			return __io__block.readInt(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'shadow_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Technique use to compute the shadows
	 * @see #__DNA__FIELD__shadow_method
	 */
	
	public void setShadow_method(int shadow_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 164, shadow_method);
		} else {
			__io__block.writeInt(__io__address + 164, shadow_method);
		}
	}

	/**
	 * Get method for struct member 'shadow_cube_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of point and area light shadow maps
	 * @see #__DNA__FIELD__shadow_cube_size
	 */
	
	public int getShadow_cube_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 168);
		} else {
			return __io__block.readInt(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'shadow_cube_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of point and area light shadow maps
	 * @see #__DNA__FIELD__shadow_cube_size
	 */
	
	public void setShadow_cube_size(int shadow_cube_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 168, shadow_cube_size);
		} else {
			__io__block.writeInt(__io__address + 168, shadow_cube_size);
		}
	}

	/**
	 * Get method for struct member 'shadow_cascade_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of sun light shadow maps
	 * @see #__DNA__FIELD__shadow_cascade_size
	 */
	
	public int getShadow_cascade_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 172);
		} else {
			return __io__block.readInt(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'shadow_cascade_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of sun light shadow maps
	 * @see #__DNA__FIELD__shadow_cascade_size
	 */
	
	public void setShadow_cascade_size(int shadow_cascade_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 172, shadow_cascade_size);
		} else {
			__io__block.writeInt(__io__address + 172, shadow_cascade_size);
		}
	}

	/**
	 * Get method for struct member 'light_cache'.
	 * @see #__DNA__FIELD__light_cache
	 */
	
	public CPointer<LightCache> getLight_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		}
		Class<?>[] __dna__targetTypes = new Class[]{LightCache.class};
		return new CPointer<LightCache>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, LightCache.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'light_cache'.
	 * @see #__DNA__FIELD__light_cache
	 */
	
	public void setLight_cache(CPointer<LightCache> light_cache) throws IOException
	{
		long __address = ((light_cache == null) ? 0 : light_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 176, __address);
		}
	}

	/**
	 * Get method for struct member 'light_cache_info'.
	 * @see #__DNA__FIELD__light_cache_info
	 */
	
	public CArrayFacade<Byte> getLight_cache_info() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'light_cache_info'.
	 * @see #__DNA__FIELD__light_cache_info
	 */
	
	public void setLight_cache_info(CArrayFacade<Byte> light_cache_info) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 180;
		}
		if (__io__equals(light_cache_info, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, light_cache_info)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, light_cache_info);
		} else {
			__io__generic__copy( getLight_cache_info(), light_cache_info);
		}
	}

	/**
	 * Get method for struct member 'overscan'.
	 * @see #__DNA__FIELD__overscan
	 */
	
	public float getOverscan() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 248);
		} else {
			return __io__block.readFloat(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'overscan'.
	 * @see #__DNA__FIELD__overscan
	 */
	
	public void setOverscan(float overscan) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 248, overscan);
		} else {
			__io__block.writeFloat(__io__address + 244, overscan);
		}
	}

	/**
	 * Get method for struct member 'light_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum light intensity for a light to contribute to the lighting
	 * @see #__DNA__FIELD__light_threshold
	 */
	
	public float getLight_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 252);
		} else {
			return __io__block.readFloat(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'light_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum light intensity for a light to contribute to the lighting
	 * @see #__DNA__FIELD__light_threshold
	 */
	
	public void setLight_threshold(float light_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 252, light_threshold);
		} else {
			__io__block.writeFloat(__io__address + 248, light_threshold);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SceneEEVEE> __io__addressof() {
		return new CPointer<SceneEEVEE>(__io__address, new Class[]{SceneEEVEE.class}, __io__block, __io__blockTable);
	}

}
