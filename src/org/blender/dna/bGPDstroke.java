package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPDstroke'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> Grease-Pencil Annotations - 'Stroke' -> A stroke represents a (simplified version) of the curve drawn by the user in one 'mouse-down'->'mouse-up' operation </p>
 */

@CMetaData(size32=424, size64=464)
public class bGPDstroke extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDstroke.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDstroke.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 536;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bGPDstroke&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bGPDstroke.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bGPDstroke*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bGPDstroke&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bGPDstroke.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bGPDstroke*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Array of data-points for stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__points);
	 * CPointer&lt;CPointer&lt;bGPDspoint&gt;&gt; p_points = p.cast(new Class[]{CPointer.class, bGPDspoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'points'</li>
	 * <li>Signature: 'bGPDspoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__points = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'triangles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Tessellated triangles for GP Fill. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__triangles);
	 * CPointer&lt;CPointer&lt;bGPDtriangle&gt;&gt; p_triangles = p.cast(new Class[]{CPointer.class, bGPDtriangle.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'triangles'</li>
	 * <li>Signature: 'bGPDtriangle*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__triangles = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'totpoints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of data-points in array. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__totpoints);
	 * CPointer&lt;Integer&gt; p_totpoints = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpoints'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpoints = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'tot_triangles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of triangles in array. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__tot_triangles);
	 * CPointer&lt;Integer&gt; p_tot_triangles = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_triangles'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_triangles = new long[]{20, 36};

	/**
	 * Field descriptor (offset) for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Thickness of stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__thickness);
	 * CPointer&lt;Short&gt; p_thickness = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Various settings about this stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{26, 42};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'short[2]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{28, 44};

	/**
	 * Field descriptor (offset) for struct member 'inittime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Init time of stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__inittime);
	 * CPointer&lt;Double&gt; p_inittime = p.cast(new Class[]{Double.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inittime'</li>
	 * <li>Signature: 'double'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inittime = new long[]{32, 48};

	/**
	 * Field descriptor (offset) for struct member 'colorname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Color name. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__colorname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_colorname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colorname'</li>
	 * <li>Signature: 'char[128]'</li>
	 * <li>Actual Size (32bit/64bit): 128/128</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colorname = new long[]{40, 56};

	/**
	 * Field descriptor (offset) for struct member 'mat_nr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Material}  index. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__mat_nr);
	 * CPointer&lt;Integer&gt; p_mat_nr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat_nr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat_nr = new long[]{168, 184};

	/**
	 * Field descriptor (offset) for struct member 'caps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Caps mode for each stroke extreme </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__caps);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_caps = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'caps'</li>
	 * <li>Signature: 'short[2]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__caps = new long[]{172, 188};

	/**
	 * Field descriptor (offset) for struct member 'gradient_f'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__gradient_f);
	 * CPointer&lt;Float&gt; p_gradient_f = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient_f'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient_f = new long[]{176, 192};

	/**
	 * Field descriptor (offset) for struct member 'gradient_s'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__gradient_s);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gradient_s = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient_s'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient_s = new long[]{180, 196};

	/**
	 * Field descriptor (offset) for struct member 'fill_opacity_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Factor of opacity for Fill color (used by opacity modifier). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__fill_opacity_fac);
	 * CPointer&lt;Float&gt; p_fill_opacity_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fill_opacity_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fill_opacity_fac = new long[]{188, 204};

	/**
	 * Field descriptor (offset) for struct member 'boundbox_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Min of the bound box used to speedup painting operators. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__boundbox_min);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_boundbox_min = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'boundbox_min'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__boundbox_min = new long[]{192, 208};

	/**
	 * Field descriptor (offset) for struct member 'boundbox_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Max of the bound box used to speedup painting operators. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__boundbox_max);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_boundbox_max = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'boundbox_max'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__boundbox_max = new long[]{204, 220};

	/**
	 * Field descriptor (offset) for struct member 'uv_rotation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> UV rotation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__uv_rotation);
	 * CPointer&lt;Float&gt; p_uv_rotation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_rotation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_rotation = new long[]{216, 232};

	/**
	 * Field descriptor (offset) for struct member 'uv_translation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> UV translation (X and Y axis) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__uv_translation);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_uv_translation = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_translation'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_translation = new long[]{220, 236};

	/**
	 * Field descriptor (offset) for struct member 'uv_scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__uv_scale);
	 * CPointer&lt;Float&gt; p_uv_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_scale = new long[]{228, 244};

	/**
	 * Field descriptor (offset) for struct member 'select_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stroke selection index. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__select_index);
	 * CPointer&lt;Integer&gt; p_select_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'select_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__select_index = new long[]{232, 248};

	/**
	 * Field descriptor (offset) for struct member '_pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD___pad4);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad4 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad4'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad4 = new long[]{236, 252};

	/**
	 * Field descriptor (offset) for struct member 'dvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Vertex weight data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__dvert);
	 * CPointer&lt;CPointer&lt;MDeformVert&gt;&gt; p_dvert = p.cast(new Class[]{CPointer.class, MDeformVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dvert'</li>
	 * <li>Signature: 'MDeformVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dvert = new long[]{240, 256};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD___pad3);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad3 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{244, 264};

	/**
	 * Field descriptor (offset) for struct member 'vert_color_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Vertex Color for Fill (one for all stroke, A=mix factor). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__vert_color_fill);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_vert_color_fill = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vert_color_fill'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vert_color_fill = new long[]{248, 272};

	/**
	 * Field descriptor (offset) for struct member 'editcurve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Curve}  used to edit the stroke using Bezier handlers. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__editcurve);
	 * CPointer&lt;CPointer&lt;bGPDcurve&gt;&gt; p_editcurve = p.cast(new Class[]{CPointer.class, bGPDcurve.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'editcurve'</li>
	 * <li>Signature: 'bGPDcurve*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__editcurve = new long[]{264, 288};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__runtime);
	 * CPointer&lt;bGPDstroke_Runtime&gt; p_runtime = p.cast(new Class[]{bGPDstroke_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'bGPDstroke_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 152/160</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{268, 296};

	/**
	 * Field descriptor (offset) for struct member '_pad5'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD___pad5);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad5 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad5'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad5 = new long[]{420, 456};

	public bGPDstroke(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPDstroke(bGPDstroke that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bGPDstroke> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDstroke.class};
		return new CPointer<bGPDstroke>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDstroke.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bGPDstroke> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<bGPDstroke> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDstroke.class};
		return new CPointer<bGPDstroke>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDstroke.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bGPDstroke> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Array of data-points for stroke. </p>
	 * @see #__DNA__FIELD__points
	 */
	
	public CPointer<bGPDspoint> getPoints() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDspoint.class};
		return new CPointer<bGPDspoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDspoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Array of data-points for stroke. </p>
	 * @see #__DNA__FIELD__points
	 */
	
	public void setPoints(CPointer<bGPDspoint> points) throws IOException
	{
		long __address = ((points == null) ? 0 : points.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'triangles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Tessellated triangles for GP Fill. </p>
	 * @see #__DNA__FIELD__triangles
	 */
	
	public CPointer<bGPDtriangle> getTriangles() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDtriangle.class};
		return new CPointer<bGPDtriangle>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDtriangle.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'triangles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Tessellated triangles for GP Fill. </p>
	 * @see #__DNA__FIELD__triangles
	 */
	
	public void setTriangles(CPointer<bGPDtriangle> triangles) throws IOException
	{
		long __address = ((triangles == null) ? 0 : triangles.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'totpoints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of data-points in array. </p>
	 * @see #__DNA__FIELD__totpoints
	 */
	
	public int getTotpoints() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'totpoints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of data-points in array. </p>
	 * @see #__DNA__FIELD__totpoints
	 */
	
	public void setTotpoints(int totpoints) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, totpoints);
		} else {
			__io__block.writeInt(__io__address + 16, totpoints);
		}
	}

	/**
	 * Get method for struct member 'tot_triangles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of triangles in array. </p>
	 * @see #__DNA__FIELD__tot_triangles
	 */
	
	public int getTot_triangles() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'tot_triangles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of triangles in array. </p>
	 * @see #__DNA__FIELD__tot_triangles
	 */
	
	public void setTot_triangles(int tot_triangles) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, tot_triangles);
		} else {
			__io__block.writeInt(__io__address + 20, tot_triangles);
		}
	}

	/**
	 * Get method for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Thickness of stroke. </p>
	 * @see #__DNA__FIELD__thickness
	 */
	
	public short getThickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 40);
		} else {
			return __io__block.readShort(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Thickness of stroke. </p>
	 * @see #__DNA__FIELD__thickness
	 */
	
	public void setThickness(short thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 40, thickness);
		} else {
			__io__block.writeShort(__io__address + 24, thickness);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Various settings about this stroke. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 42);
		} else {
			return __io__block.readShort(__io__address + 26);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Various settings about this stroke. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 42, flag);
		} else {
			__io__block.writeShort(__io__address + 26, flag);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Short> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Short> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 44;
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
	 * Get method for struct member 'inittime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Init time of stroke. </p>
	 * @see #__DNA__FIELD__inittime
	 */
	
	public double getInittime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readDouble(__io__address + 48);
		} else {
			return __io__block.readDouble(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'inittime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Init time of stroke. </p>
	 * @see #__DNA__FIELD__inittime
	 */
	
	public void setInittime(double inittime) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeDouble(__io__address + 48, inittime);
		} else {
			__io__block.writeDouble(__io__address + 32, inittime);
		}
	}

	/**
	 * Get method for struct member 'colorname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Color name. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__colorname
	 */
	
	public CArrayFacade<Byte> getColorname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			128
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'colorname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Color name. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__colorname
	 */
	
	public void setColorname(CArrayFacade<Byte> colorname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(colorname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, colorname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, colorname);
		} else {
			__io__generic__copy( getColorname(), colorname);
		}
	}

	/**
	 * Get method for struct member 'mat_nr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Material}  index. </p>
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public int getMat_nr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 184);
		} else {
			return __io__block.readInt(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'mat_nr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Material}  index. </p>
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public void setMat_nr(int mat_nr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 184, mat_nr);
		} else {
			__io__block.writeInt(__io__address + 168, mat_nr);
		}
	}

	/**
	 * Get method for struct member 'caps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Caps mode for each stroke extreme </p>
	 * @see #__DNA__FIELD__caps
	 */
	
	public CArrayFacade<Short> getCaps() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'caps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Caps mode for each stroke extreme </p>
	 * @see #__DNA__FIELD__caps
	 */
	
	public void setCaps(CArrayFacade<Short> caps) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 188;
		} else {
			__dna__offset = 172;
		}
		if (__io__equals(caps, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, caps)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, caps);
		} else {
			__io__generic__copy( getCaps(), caps);
		}
	}

	/**
	 * Get method for struct member 'gradient_f'.
	 * @see #__DNA__FIELD__gradient_f
	 */
	
	public float getGradient_f() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'gradient_f'.
	 * @see #__DNA__FIELD__gradient_f
	 */
	
	public void setGradient_f(float gradient_f) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, gradient_f);
		} else {
			__io__block.writeFloat(__io__address + 176, gradient_f);
		}
	}

	/**
	 * Get method for struct member 'gradient_s'.
	 * @see #__DNA__FIELD__gradient_s
	 */
	
	public CArrayFacade<Float> getGradient_s() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gradient_s'.
	 * @see #__DNA__FIELD__gradient_s
	 */
	
	public void setGradient_s(CArrayFacade<Float> gradient_s) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 196;
		} else {
			__dna__offset = 180;
		}
		if (__io__equals(gradient_s, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gradient_s)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gradient_s);
		} else {
			__io__generic__copy( getGradient_s(), gradient_s);
		}
	}

	/**
	 * Get method for struct member 'fill_opacity_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Factor of opacity for Fill color (used by opacity modifier). </p>
	 * @see #__DNA__FIELD__fill_opacity_fac
	 */
	
	public float getFill_opacity_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'fill_opacity_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Factor of opacity for Fill color (used by opacity modifier). </p>
	 * @see #__DNA__FIELD__fill_opacity_fac
	 */
	
	public void setFill_opacity_fac(float fill_opacity_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, fill_opacity_fac);
		} else {
			__io__block.writeFloat(__io__address + 188, fill_opacity_fac);
		}
	}

	/**
	 * Get method for struct member 'boundbox_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Min of the bound box used to speedup painting operators. </p>
	 * @see #__DNA__FIELD__boundbox_min
	 */
	
	public CArrayFacade<Float> getBoundbox_min() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 208, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'boundbox_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Min of the bound box used to speedup painting operators. </p>
	 * @see #__DNA__FIELD__boundbox_min
	 */
	
	public void setBoundbox_min(CArrayFacade<Float> boundbox_min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 192;
		}
		if (__io__equals(boundbox_min, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, boundbox_min)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, boundbox_min);
		} else {
			__io__generic__copy( getBoundbox_min(), boundbox_min);
		}
	}

	/**
	 * Get method for struct member 'boundbox_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Max of the bound box used to speedup painting operators. </p>
	 * @see #__DNA__FIELD__boundbox_max
	 */
	
	public CArrayFacade<Float> getBoundbox_max() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 220, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'boundbox_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Max of the bound box used to speedup painting operators. </p>
	 * @see #__DNA__FIELD__boundbox_max
	 */
	
	public void setBoundbox_max(CArrayFacade<Float> boundbox_max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 220;
		} else {
			__dna__offset = 204;
		}
		if (__io__equals(boundbox_max, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, boundbox_max)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, boundbox_max);
		} else {
			__io__generic__copy( getBoundbox_max(), boundbox_max);
		}
	}

	/**
	 * Get method for struct member 'uv_rotation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> UV rotation </p>
	 * @see #__DNA__FIELD__uv_rotation
	 */
	
	public float getUv_rotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 232);
		} else {
			return __io__block.readFloat(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'uv_rotation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> UV rotation </p>
	 * @see #__DNA__FIELD__uv_rotation
	 */
	
	public void setUv_rotation(float uv_rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 232, uv_rotation);
		} else {
			__io__block.writeFloat(__io__address + 216, uv_rotation);
		}
	}

	/**
	 * Get method for struct member 'uv_translation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> UV translation (X and Y axis) </p>
	 * @see #__DNA__FIELD__uv_translation
	 */
	
	public CArrayFacade<Float> getUv_translation() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 236, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 220, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uv_translation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> UV translation (X and Y axis) </p>
	 * @see #__DNA__FIELD__uv_translation
	 */
	
	public void setUv_translation(CArrayFacade<Float> uv_translation) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 236;
		} else {
			__dna__offset = 220;
		}
		if (__io__equals(uv_translation, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uv_translation)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uv_translation);
		} else {
			__io__generic__copy( getUv_translation(), uv_translation);
		}
	}

	/**
	 * Get method for struct member 'uv_scale'.
	 * @see #__DNA__FIELD__uv_scale
	 */
	
	public float getUv_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 244);
		} else {
			return __io__block.readFloat(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'uv_scale'.
	 * @see #__DNA__FIELD__uv_scale
	 */
	
	public void setUv_scale(float uv_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 244, uv_scale);
		} else {
			__io__block.writeFloat(__io__address + 228, uv_scale);
		}
	}

	/**
	 * Get method for struct member 'select_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stroke selection index. </p>
	 * @see #__DNA__FIELD__select_index
	 */
	
	public int getSelect_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 248);
		} else {
			return __io__block.readInt(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'select_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stroke selection index. </p>
	 * @see #__DNA__FIELD__select_index
	 */
	
	public void setSelect_index(int select_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 248, select_index);
		} else {
			__io__block.writeInt(__io__address + 232, select_index);
		}
	}

	/**
	 * Get method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public CArrayFacade<Byte> get_pad4() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 252, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 236, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public void set_pad4(CArrayFacade<Byte> _pad4) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 252;
		} else {
			__dna__offset = 236;
		}
		if (__io__equals(_pad4, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad4)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad4);
		} else {
			__io__generic__copy( get_pad4(), _pad4);
		}
	}

	/**
	 * Get method for struct member 'dvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Vertex weight data. </p>
	 * @see #__DNA__FIELD__dvert
	 */
	
	public CPointer<MDeformVert> getDvert() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MDeformVert.class};
		return new CPointer<MDeformVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MDeformVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Vertex weight data. </p>
	 * @see #__DNA__FIELD__dvert
	 */
	
	public void setDvert(CPointer<MDeformVert> dvert) throws IOException
	{
		long __address = ((dvert == null) ? 0 : dvert.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 256, __address);
		} else {
			__io__block.writeLong(__io__address + 240, __address);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CPointer<Object> get_pad3() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 264);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 244);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CPointer<Object> _pad3) throws IOException
	{
		long __address = ((_pad3 == null) ? 0 : _pad3.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 264, __address);
		} else {
			__io__block.writeLong(__io__address + 244, __address);
		}
	}

	/**
	 * Get method for struct member 'vert_color_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Vertex Color for Fill (one for all stroke, A=mix factor). </p>
	 * @see #__DNA__FIELD__vert_color_fill
	 */
	
	public CArrayFacade<Float> getVert_color_fill() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 272, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vert_color_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Vertex Color for Fill (one for all stroke, A=mix factor). </p>
	 * @see #__DNA__FIELD__vert_color_fill
	 */
	
	public void setVert_color_fill(CArrayFacade<Float> vert_color_fill) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 272;
		} else {
			__dna__offset = 248;
		}
		if (__io__equals(vert_color_fill, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vert_color_fill)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vert_color_fill);
		} else {
			__io__generic__copy( getVert_color_fill(), vert_color_fill);
		}
	}

	/**
	 * Get method for struct member 'editcurve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Curve}  used to edit the stroke using Bezier handlers. </p>
	 * @see #__DNA__FIELD__editcurve
	 */
	
	public CPointer<bGPDcurve> getEditcurve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 264);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDcurve.class};
		return new CPointer<bGPDcurve>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDcurve.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'editcurve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Curve}  used to edit the stroke using Bezier handlers. </p>
	 * @see #__DNA__FIELD__editcurve
	 */
	
	public void setEditcurve(CPointer<bGPDcurve> editcurve) throws IOException
	{
		long __address = ((editcurve == null) ? 0 : editcurve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 288, __address);
		} else {
			__io__block.writeLong(__io__address + 264, __address);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public bGPDstroke_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bGPDstroke_Runtime(__io__address + 296, __io__block, __io__blockTable);
		} else {
			return new bGPDstroke_Runtime(__io__address + 268, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(bGPDstroke_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 296;
		} else {
			__dna__offset = 268;
		}
		if (__io__equals(runtime, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, runtime)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, runtime);
		} else {
			__io__generic__copy( getRuntime(), runtime);
		}
	}

	/**
	 * Get method for struct member '_pad5'.
	 * @see #__DNA__FIELD___pad5
	 */
	
	public CPointer<Object> get_pad5() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 456);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 420);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad5'.
	 * @see #__DNA__FIELD___pad5
	 */
	
	public void set_pad5(CPointer<Object> _pad5) throws IOException
	{
		long __address = ((_pad5 == null) ? 0 : _pad5.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 456, __address);
		} else {
			__io__block.writeLong(__io__address + 420, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPDstroke> __io__addressof() {
		return new CPointer<bGPDstroke>(__io__address, new Class[]{bGPDstroke.class}, __io__block, __io__blockTable);
	}

}
