package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MaterialGPencilStyle'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=144, size64=152)
public class MaterialGPencilStyle extends CFacade {

	/**
	 * This is the sdna index of the struct MaterialGPencilStyle.
	 * <p>
	 * It is required when allocating a new block to store data for MaterialGPencilStyle.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 49;

	/**
	 * Field descriptor (offset) for struct member 'sima'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture image for strokes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__sima);
	 * CPointer&lt;CPointer&lt;Image&gt;&gt; p_sima = p.cast(new Class[]{CPointer.class, Image.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sima'</li>
	 * <li>Signature: 'Image*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sima = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'ima'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture image for filling. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__ima);
	 * CPointer&lt;CPointer&lt;Image&gt;&gt; p_ima = p.cast(new Class[]{CPointer.class, Image.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ima'</li>
	 * <li>Signature: 'Image*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ima = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'stroke_rgba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for paint and strokes (alpha included). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__stroke_rgba);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_stroke_rgba = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stroke_rgba'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stroke_rgba = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'fill_rgba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color that should be used for drawing "fills" for strokes (alpha included). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__fill_rgba);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_fill_rgba = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fill_rgba'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fill_rgba = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'mix_rgba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Secondary color used for gradients and other stuff. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__mix_rgba);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_mix_rgba = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mix_rgba'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mix_rgba = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{56, 64};

	/**
	 * Field descriptor (offset) for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__index);
	 * CPointer&lt;Short&gt; p_index = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'index'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__index = new long[]{58, 66};

	/**
	 * Field descriptor (offset) for struct member 'stroke_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select style used to draw strokes<h4>Blender Source Code:</h4>
	 * <p> Style for drawing strokes (used to select shader type). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__stroke_style);
	 * CPointer&lt;Short&gt; p_stroke_style = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stroke_style'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stroke_style = new long[]{60, 68};

	/**
	 * Field descriptor (offset) for struct member 'fill_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select style used to fill strokes<h4>Blender Source Code:</h4>
	 * <p> Style for filling areas (used to select shader type). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__fill_style);
	 * CPointer&lt;Short&gt; p_fill_style = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fill_style'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fill_style = new long[]{62, 70};

	/**
	 * Field descriptor (offset) for struct member 'mix_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mix Adjustment Factor<h4>Blender Source Code:</h4>
	 * <p> Factor used to define shader behavior (several uses). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__mix_factor);
	 * CPointer&lt;Float&gt; p_mix_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mix_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mix_factor = new long[]{64, 72};

	/**
	 * Field descriptor (offset) for struct member 'gradient_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Angle used for gradients orientation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__gradient_angle);
	 * CPointer&lt;Float&gt; p_gradient_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient_angle = new long[]{68, 76};

	/**
	 * Field descriptor (offset) for struct member 'gradient_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius for radial gradients. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__gradient_radius);
	 * CPointer&lt;Float&gt; p_gradient_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient_radius = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'pattern_gridsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Box Size<h4>Blender Source Code:</h4>
	 * <p> Cheesboard size. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__pattern_gridsize);
	 * CPointer&lt;Float&gt; p_pattern_gridsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pattern_gridsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pattern_gridsize = new long[]{76, 84};

	/**
	 * Field descriptor (offset) for struct member 'gradient_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Uv coordinates scale. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__gradient_scale);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gradient_scale = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient_scale'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient_scale = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'gradient_shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor to shift filling in 2d space. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__gradient_shift);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gradient_shift = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient_shift'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient_shift = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'texture_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Texture Orientation Angle<h4>Blender Source Code:</h4>
	 * <p> Angle used for texture orientation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__texture_angle);
	 * CPointer&lt;Float&gt; p_texture_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_angle = new long[]{96, 104};

	/**
	 * Field descriptor (offset) for struct member 'texture_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale Factor for Texture<h4>Blender Source Code:</h4>
	 * <p> Texture scale (separated of uv scale). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__texture_scale);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_texture_scale = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_scale'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_scale = new long[]{100, 108};

	/**
	 * Field descriptor (offset) for struct member 'texture_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Shift Texture in 2d Space<h4>Blender Source Code:</h4>
	 * <p> Factor to shift texture in 2d space. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__texture_offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_texture_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_offset'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_offset = new long[]{108, 116};

	/**
	 * Field descriptor (offset) for struct member 'texture_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Texture Opacity<h4>Blender Source Code:</h4>
	 * <p> Texture opacity. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__texture_opacity);
	 * CPointer&lt;Float&gt; p_texture_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_opacity = new long[]{116, 124};

	/**
	 * Field descriptor (offset) for struct member 'texture_pixsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pixel size for uv along the stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__texture_pixsize);
	 * CPointer&lt;Float&gt; p_texture_pixsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texture_pixsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texture_pixsize = new long[]{120, 128};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select draw mode for stroke<h4>Blender Source Code:</h4>
	 * <p> Drawing mode (line or dots). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__mode);
	 * CPointer&lt;Integer&gt; p_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{124, 132};

	/**
	 * Field descriptor (offset) for struct member 'gradient_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select type of gradient used to fill strokes<h4>Blender Source Code:</h4>
	 * <p> Type of gradient. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__gradient_type);
	 * CPointer&lt;Integer&gt; p_gradient_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient_type = new long[]{128, 136};

	/**
	 * Field descriptor (offset) for struct member 'mix_stroke_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mix Stroke Color<h4>Blender Source Code:</h4>
	 * <p> Factor used to mix texture and stroke color. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__mix_stroke_factor);
	 * CPointer&lt;Float&gt; p_mix_stroke_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mix_stroke_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mix_stroke_factor = new long[]{132, 140};

	/**
	 * Field descriptor (offset) for struct member 'alignment_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Defines how align Dots and Boxes with drawing path and object rotation<h4>Blender Source Code:</h4>
	 * <p> Mode used to align Dots and Boxes with stroke drawing path and object rotation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD__alignment_mode);
	 * CPointer&lt;Integer&gt; p_alignment_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alignment_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alignment_mode = new long[]{136, 144};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialGPencilStyle materialgpencilstyle = ...;
	 * CPointer&lt;Object&gt; p = materialgpencilstyle.__dna__addressof(MaterialGPencilStyle.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{140, 148};

	public MaterialGPencilStyle(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MaterialGPencilStyle(MaterialGPencilStyle that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'sima'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture image for strokes. </p>
	 * @see #__DNA__FIELD__sima
	 */
	
	public CPointer<Image> getSima() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sima'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture image for strokes. </p>
	 * @see #__DNA__FIELD__sima
	 */
	
	public void setSima(CPointer<Image> sima) throws IOException
	{
		long __address = ((sima == null) ? 0 : sima.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'ima'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture image for filling. </p>
	 * @see #__DNA__FIELD__ima
	 */
	
	public CPointer<Image> getIma() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ima'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture image for filling. </p>
	 * @see #__DNA__FIELD__ima
	 */
	
	public void setIma(CPointer<Image> ima) throws IOException
	{
		long __address = ((ima == null) ? 0 : ima.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'stroke_rgba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for paint and strokes (alpha included). </p>
	 * @see #__DNA__FIELD__stroke_rgba
	 */
	
	public CArrayFacade<Float> getStroke_rgba() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'stroke_rgba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for paint and strokes (alpha included). </p>
	 * @see #__DNA__FIELD__stroke_rgba
	 */
	
	public void setStroke_rgba(CArrayFacade<Float> stroke_rgba) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(stroke_rgba, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, stroke_rgba)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, stroke_rgba);
		} else {
			__io__generic__copy( getStroke_rgba(), stroke_rgba);
		}
	}

	/**
	 * Get method for struct member 'fill_rgba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color that should be used for drawing "fills" for strokes (alpha included). </p>
	 * @see #__DNA__FIELD__fill_rgba
	 */
	
	public CArrayFacade<Float> getFill_rgba() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fill_rgba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color that should be used for drawing "fills" for strokes (alpha included). </p>
	 * @see #__DNA__FIELD__fill_rgba
	 */
	
	public void setFill_rgba(CArrayFacade<Float> fill_rgba) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(fill_rgba, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fill_rgba)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fill_rgba);
		} else {
			__io__generic__copy( getFill_rgba(), fill_rgba);
		}
	}

	/**
	 * Get method for struct member 'mix_rgba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Secondary color used for gradients and other stuff. </p>
	 * @see #__DNA__FIELD__mix_rgba
	 */
	
	public CArrayFacade<Float> getMix_rgba() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mix_rgba'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Secondary color used for gradients and other stuff. </p>
	 * @see #__DNA__FIELD__mix_rgba
	 */
	
	public void setMix_rgba(CArrayFacade<Float> mix_rgba) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(mix_rgba, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mix_rgba)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mix_rgba);
		} else {
			__io__generic__copy( getMix_rgba(), mix_rgba);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 64);
		} else {
			return __io__block.readShort(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 64, flag);
		} else {
			__io__block.writeShort(__io__address + 56, flag);
		}
	}

	/**
	 * Get method for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__index
	 */
	
	public short getIndex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 66);
		} else {
			return __io__block.readShort(__io__address + 58);
		}
	}

	/**
	 * Set method for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__index
	 */
	
	public void setIndex(short index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 66, index);
		} else {
			__io__block.writeShort(__io__address + 58, index);
		}
	}

	/**
	 * Get method for struct member 'stroke_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select style used to draw strokes<h4>Blender Source Code:</h4>
	 * <p> Style for drawing strokes (used to select shader type). </p>
	 * @see #__DNA__FIELD__stroke_style
	 */
	
	public short getStroke_style() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 68);
		} else {
			return __io__block.readShort(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'stroke_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select style used to draw strokes<h4>Blender Source Code:</h4>
	 * <p> Style for drawing strokes (used to select shader type). </p>
	 * @see #__DNA__FIELD__stroke_style
	 */
	
	public void setStroke_style(short stroke_style) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 68, stroke_style);
		} else {
			__io__block.writeShort(__io__address + 60, stroke_style);
		}
	}

	/**
	 * Get method for struct member 'fill_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select style used to fill strokes<h4>Blender Source Code:</h4>
	 * <p> Style for filling areas (used to select shader type). </p>
	 * @see #__DNA__FIELD__fill_style
	 */
	
	public short getFill_style() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 70);
		} else {
			return __io__block.readShort(__io__address + 62);
		}
	}

	/**
	 * Set method for struct member 'fill_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select style used to fill strokes<h4>Blender Source Code:</h4>
	 * <p> Style for filling areas (used to select shader type). </p>
	 * @see #__DNA__FIELD__fill_style
	 */
	
	public void setFill_style(short fill_style) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 70, fill_style);
		} else {
			__io__block.writeShort(__io__address + 62, fill_style);
		}
	}

	/**
	 * Get method for struct member 'mix_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mix Adjustment Factor<h4>Blender Source Code:</h4>
	 * <p> Factor used to define shader behavior (several uses). </p>
	 * @see #__DNA__FIELD__mix_factor
	 */
	
	public float getMix_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'mix_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mix Adjustment Factor<h4>Blender Source Code:</h4>
	 * <p> Factor used to define shader behavior (several uses). </p>
	 * @see #__DNA__FIELD__mix_factor
	 */
	
	public void setMix_factor(float mix_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, mix_factor);
		} else {
			__io__block.writeFloat(__io__address + 64, mix_factor);
		}
	}

	/**
	 * Get method for struct member 'gradient_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Angle used for gradients orientation. </p>
	 * @see #__DNA__FIELD__gradient_angle
	 */
	
	public float getGradient_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'gradient_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Angle used for gradients orientation. </p>
	 * @see #__DNA__FIELD__gradient_angle
	 */
	
	public void setGradient_angle(float gradient_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, gradient_angle);
		} else {
			__io__block.writeFloat(__io__address + 68, gradient_angle);
		}
	}

	/**
	 * Get method for struct member 'gradient_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius for radial gradients. </p>
	 * @see #__DNA__FIELD__gradient_radius
	 */
	
	public float getGradient_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'gradient_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius for radial gradients. </p>
	 * @see #__DNA__FIELD__gradient_radius
	 */
	
	public void setGradient_radius(float gradient_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, gradient_radius);
		} else {
			__io__block.writeFloat(__io__address + 72, gradient_radius);
		}
	}

	/**
	 * Get method for struct member 'pattern_gridsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Box Size<h4>Blender Source Code:</h4>
	 * <p> Cheesboard size. </p>
	 * @see #__DNA__FIELD__pattern_gridsize
	 */
	
	public float getPattern_gridsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'pattern_gridsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Box Size<h4>Blender Source Code:</h4>
	 * <p> Cheesboard size. </p>
	 * @see #__DNA__FIELD__pattern_gridsize
	 */
	
	public void setPattern_gridsize(float pattern_gridsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, pattern_gridsize);
		} else {
			__io__block.writeFloat(__io__address + 76, pattern_gridsize);
		}
	}

	/**
	 * Get method for struct member 'gradient_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Uv coordinates scale. </p>
	 * @see #__DNA__FIELD__gradient_scale
	 */
	
	public CArrayFacade<Float> getGradient_scale() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gradient_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Uv coordinates scale. </p>
	 * @see #__DNA__FIELD__gradient_scale
	 */
	
	public void setGradient_scale(CArrayFacade<Float> gradient_scale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(gradient_scale, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gradient_scale)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gradient_scale);
		} else {
			__io__generic__copy( getGradient_scale(), gradient_scale);
		}
	}

	/**
	 * Get method for struct member 'gradient_shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor to shift filling in 2d space. </p>
	 * @see #__DNA__FIELD__gradient_shift
	 */
	
	public CArrayFacade<Float> getGradient_shift() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gradient_shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factor to shift filling in 2d space. </p>
	 * @see #__DNA__FIELD__gradient_shift
	 */
	
	public void setGradient_shift(CArrayFacade<Float> gradient_shift) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 88;
		}
		if (__io__equals(gradient_shift, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gradient_shift)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gradient_shift);
		} else {
			__io__generic__copy( getGradient_shift(), gradient_shift);
		}
	}

	/**
	 * Get method for struct member 'texture_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Texture Orientation Angle<h4>Blender Source Code:</h4>
	 * <p> Angle used for texture orientation. </p>
	 * @see #__DNA__FIELD__texture_angle
	 */
	
	public float getTexture_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'texture_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Texture Orientation Angle<h4>Blender Source Code:</h4>
	 * <p> Angle used for texture orientation. </p>
	 * @see #__DNA__FIELD__texture_angle
	 */
	
	public void setTexture_angle(float texture_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, texture_angle);
		} else {
			__io__block.writeFloat(__io__address + 96, texture_angle);
		}
	}

	/**
	 * Get method for struct member 'texture_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale Factor for Texture<h4>Blender Source Code:</h4>
	 * <p> Texture scale (separated of uv scale). </p>
	 * @see #__DNA__FIELD__texture_scale
	 */
	
	public CArrayFacade<Float> getTexture_scale() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'texture_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale Factor for Texture<h4>Blender Source Code:</h4>
	 * <p> Texture scale (separated of uv scale). </p>
	 * @see #__DNA__FIELD__texture_scale
	 */
	
	public void setTexture_scale(CArrayFacade<Float> texture_scale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 108;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(texture_scale, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, texture_scale)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, texture_scale);
		} else {
			__io__generic__copy( getTexture_scale(), texture_scale);
		}
	}

	/**
	 * Get method for struct member 'texture_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Shift Texture in 2d Space<h4>Blender Source Code:</h4>
	 * <p> Factor to shift texture in 2d space. </p>
	 * @see #__DNA__FIELD__texture_offset
	 */
	
	public CArrayFacade<Float> getTexture_offset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'texture_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Shift Texture in 2d Space<h4>Blender Source Code:</h4>
	 * <p> Factor to shift texture in 2d space. </p>
	 * @see #__DNA__FIELD__texture_offset
	 */
	
	public void setTexture_offset(CArrayFacade<Float> texture_offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 116;
		} else {
			__dna__offset = 108;
		}
		if (__io__equals(texture_offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, texture_offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, texture_offset);
		} else {
			__io__generic__copy( getTexture_offset(), texture_offset);
		}
	}

	/**
	 * Get method for struct member 'texture_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Texture Opacity<h4>Blender Source Code:</h4>
	 * <p> Texture opacity. </p>
	 * @see #__DNA__FIELD__texture_opacity
	 */
	
	public float getTexture_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'texture_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Texture Opacity<h4>Blender Source Code:</h4>
	 * <p> Texture opacity. </p>
	 * @see #__DNA__FIELD__texture_opacity
	 */
	
	public void setTexture_opacity(float texture_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, texture_opacity);
		} else {
			__io__block.writeFloat(__io__address + 116, texture_opacity);
		}
	}

	/**
	 * Get method for struct member 'texture_pixsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pixel size for uv along the stroke. </p>
	 * @see #__DNA__FIELD__texture_pixsize
	 */
	
	public float getTexture_pixsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 128);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'texture_pixsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pixel size for uv along the stroke. </p>
	 * @see #__DNA__FIELD__texture_pixsize
	 */
	
	public void setTexture_pixsize(float texture_pixsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 128, texture_pixsize);
		} else {
			__io__block.writeFloat(__io__address + 120, texture_pixsize);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select draw mode for stroke<h4>Blender Source Code:</h4>
	 * <p> Drawing mode (line or dots). </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 132);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select draw mode for stroke<h4>Blender Source Code:</h4>
	 * <p> Drawing mode (line or dots). </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 132, mode);
		} else {
			__io__block.writeInt(__io__address + 124, mode);
		}
	}

	/**
	 * Get method for struct member 'gradient_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select type of gradient used to fill strokes<h4>Blender Source Code:</h4>
	 * <p> Type of gradient. </p>
	 * @see #__DNA__FIELD__gradient_type
	 */
	
	public int getGradient_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'gradient_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select type of gradient used to fill strokes<h4>Blender Source Code:</h4>
	 * <p> Type of gradient. </p>
	 * @see #__DNA__FIELD__gradient_type
	 */
	
	public void setGradient_type(int gradient_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, gradient_type);
		} else {
			__io__block.writeInt(__io__address + 128, gradient_type);
		}
	}

	/**
	 * Get method for struct member 'mix_stroke_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mix Stroke Color<h4>Blender Source Code:</h4>
	 * <p> Factor used to mix texture and stroke color. </p>
	 * @see #__DNA__FIELD__mix_stroke_factor
	 */
	
	public float getMix_stroke_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'mix_stroke_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Mix Stroke Color<h4>Blender Source Code:</h4>
	 * <p> Factor used to mix texture and stroke color. </p>
	 * @see #__DNA__FIELD__mix_stroke_factor
	 */
	
	public void setMix_stroke_factor(float mix_stroke_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, mix_stroke_factor);
		} else {
			__io__block.writeFloat(__io__address + 132, mix_stroke_factor);
		}
	}

	/**
	 * Get method for struct member 'alignment_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Defines how align Dots and Boxes with drawing path and object rotation<h4>Blender Source Code:</h4>
	 * <p> Mode used to align Dots and Boxes with stroke drawing path and object rotation </p>
	 * @see #__DNA__FIELD__alignment_mode
	 */
	
	public int getAlignment_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 144);
		} else {
			return __io__block.readInt(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'alignment_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Defines how align Dots and Boxes with drawing path and object rotation<h4>Blender Source Code:</h4>
	 * <p> Mode used to align Dots and Boxes with stroke drawing path and object rotation </p>
	 * @see #__DNA__FIELD__alignment_mode
	 */
	
	public void setAlignment_mode(int alignment_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 144, alignment_mode);
		} else {
			__io__block.writeInt(__io__address + 136, alignment_mode);
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
			return new CArrayFacade<Byte>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 148;
		} else {
			__dna__offset = 140;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MaterialGPencilStyle> __io__addressof() {
		return new CPointer<MaterialGPencilStyle>(__io__address, new Class[]{MaterialGPencilStyle.class}, __io__block, __io__blockTable);
	}

}
