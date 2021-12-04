package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPDlayer'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Grease-Pencil Annotations - 'Layer' </p>
 */

@CMetaData(size32=644, size64=680)
public class bGPDlayer extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDlayer.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDlayer.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 590;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bGPDlayer&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bGPDlayer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bGPDlayer*'</li>
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
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bGPDlayer&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bGPDlayer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bGPDlayer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of annotations to display for frames ({@link bGPDframe}  list). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__frames);
	 * CPointer&lt;ListBase&gt; p_frames = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frames'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frames = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'actframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active frame (should be the frame that is currently being displayed). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__actframe);
	 * CPointer&lt;CPointer&lt;bGPDframe&gt;&gt; p_actframe = p.cast(new Class[]{CPointer.class, bGPDframe.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actframe'</li>
	 * <li>Signature: 'bGPDframe*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actframe = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for layer. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'onion_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Per-layer onion-skinning flags (eGPDlayer_OnionFlag). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__onion_flag);
	 * CPointer&lt;Short&gt; p_onion_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'onion_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__onion_flag = new long[]{22, 42};

	/**
	 * Field descriptor (offset) for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for strokes in layers. Used for annotations, and for ruler (which uses GPencil internally). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color = new long[]{24, 44};

	/**
	 * Field descriptor (offset) for struct member 'fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Fill color for strokes in layers. Not used anymore (was only for). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__fill);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_fill = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fill'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fill = new long[]{40, 60};

	/**
	 * Field descriptor (offset) for struct member 'info'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name/reference info for this layer (i.e. "director's comments, 12/.3") needs to be kept unique, as it's used as the layer identifier </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__info);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_info = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'info'</li>
	 * <li>Signature: 'char[128]'</li>
	 * <li>Actual Size (32bit/64bit): 128/128</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__info = new long[]{56, 76};

	/**
	 * Field descriptor (offset) for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Thickness to apply to strokes (Annotations). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__thickness);
	 * CPointer&lt;Short&gt; p_thickness = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness = new long[]{184, 204};

	/**
	 * Field descriptor (offset) for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used to filter groups of layers in modifiers. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__pass_index);
	 * CPointer&lt;Short&gt; p_pass_index = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass_index'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass_index = new long[]{186, 206};

	/**
	 * Field descriptor (offset) for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Parent object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__parent);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_parent = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent = new long[]{188, 208};

	/**
	 * Field descriptor (offset) for struct member 'inverse'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inverse matrix (only used if parented). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__inverse);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_inverse = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inverse'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inverse = new long[]{192, 216};

	/**
	 * Field descriptor (offset) for struct member 'parsubstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> String describing subobject info, MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__parsubstr);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_parsubstr = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parsubstr'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parsubstr = new long[]{256, 280};

	/**
	 * Field descriptor (offset) for struct member 'partype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__partype);
	 * CPointer&lt;Short&gt; p_partype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'partype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__partype = new long[]{320, 344};

	/**
	 * Field descriptor (offset) for struct member 'line_change'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Thickness adjustment. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__line_change);
	 * CPointer&lt;Short&gt; p_line_change = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'line_change'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__line_change = new long[]{322, 346};

	/**
	 * Field descriptor (offset) for struct member 'tintcolor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color used to tint layer, alpha value is used as factor. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__tintcolor);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_tintcolor = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tintcolor'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tintcolor = new long[]{324, 348};

	/**
	 * Field descriptor (offset) for struct member 'opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Opacity of the layer. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__opacity);
	 * CPointer&lt;Float&gt; p_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__opacity = new long[]{340, 364};

	/**
	 * Field descriptor (offset) for struct member 'viewlayername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the layer used to filter render output. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__viewlayername);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_viewlayername = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewlayername'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewlayername = new long[]{344, 368};

	/**
	 * Field descriptor (offset) for struct member 'blend_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blend modes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__blend_mode);
	 * CPointer&lt;Integer&gt; p_blend_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_mode = new long[]{408, 432};

	/**
	 * Field descriptor (offset) for struct member 'vertex_paint_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex {@link Paint}  opacity by Layer. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__vertex_paint_opacity);
	 * CPointer&lt;Float&gt; p_vertex_paint_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_paint_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_paint_opacity = new long[]{412, 436};

	/**
	 * Field descriptor (offset) for struct member 'gstep'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> annotation onion skin Ghosts Before: max number of ghost frames to show between active frame and the one before it (0 = only the ghost itself). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__gstep);
	 * CPointer&lt;Short&gt; p_gstep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gstep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gstep = new long[]{416, 440};

	/**
	 * Field descriptor (offset) for struct member 'gstep_next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ghosts After: max number of ghost frames to show after active frame and the following it (0 = only the ghost itself). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__gstep_next);
	 * CPointer&lt;Short&gt; p_gstep_next = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gstep_next'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gstep_next = new long[]{418, 442};

	/**
	 * Field descriptor (offset) for struct member 'gcolor_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for ghosts before the active frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__gcolor_prev);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gcolor_prev = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gcolor_prev'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gcolor_prev = new long[]{420, 444};

	/**
	 * Field descriptor (offset) for struct member 'gcolor_next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for ghosts after the active frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__gcolor_next);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gcolor_next = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gcolor_next'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gcolor_next = new long[]{432, 456};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{444, 468};

	/**
	 * Field descriptor (offset) for struct member 'mask_layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mask}  list ({@link bGPDlayer_Mask} ). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__mask_layers);
	 * CPointer&lt;ListBase&gt; p_mask_layers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_layers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_layers = new long[]{448, 472};

	/**
	 * Field descriptor (offset) for struct member 'act_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current {@link Mask}  index (noted base 1). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__act_mask);
	 * CPointer&lt;Integer&gt; p_act_mask = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_mask'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_mask = new long[]{456, 488};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{460, 492};

	/**
	 * Field descriptor (offset) for struct member 'location'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Layer transforms. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__location);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_location = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'location'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__location = new long[]{464, 496};

	/**
	 * Field descriptor (offset) for struct member 'rotation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__rotation);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rotation = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotation'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotation = new long[]{476, 508};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__scale);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_scale = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale = new long[]{488, 520};

	/**
	 * Field descriptor (offset) for struct member 'layer_mat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__layer_mat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_layer_mat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_mat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_mat = new long[]{500, 532};

	/**
	 * Field descriptor (offset) for struct member 'layer_invmat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__layer_invmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_layer_invmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_invmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_invmat = new long[]{564, 596};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{628, 660};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__runtime);
	 * CPointer&lt;bGPDlayer_Runtime&gt; p_runtime = p.cast(new Class[]{bGPDlayer_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'bGPDlayer_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 12/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{632, 664};

	public bGPDlayer(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPDlayer(bGPDlayer that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bGPDlayer> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDlayer.class};
		return new CPointer<bGPDlayer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDlayer.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bGPDlayer> next) throws IOException
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
	
	public CPointer<bGPDlayer> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDlayer.class};
		return new CPointer<bGPDlayer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDlayer.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bGPDlayer> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of annotations to display for frames ({@link bGPDframe}  list). </p>
	 * @see #__DNA__FIELD__frames
	 */
	
	public ListBase getFrames() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of annotations to display for frames ({@link bGPDframe}  list). </p>
	 * @see #__DNA__FIELD__frames
	 */
	
	public void setFrames(ListBase frames) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(frames, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, frames)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, frames);
		} else {
			__io__generic__copy( getFrames(), frames);
		}
	}

	/**
	 * Get method for struct member 'actframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active frame (should be the frame that is currently being displayed). </p>
	 * @see #__DNA__FIELD__actframe
	 */
	
	public CPointer<bGPDframe> getActframe() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDframe.class};
		return new CPointer<bGPDframe>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDframe.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'actframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active frame (should be the frame that is currently being displayed). </p>
	 * @see #__DNA__FIELD__actframe
	 */
	
	public void setActframe(CPointer<bGPDframe> actframe) throws IOException
	{
		long __address = ((actframe == null) ? 0 : actframe.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for layer. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 40);
		} else {
			return __io__block.readShort(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for layer. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 40, flag);
		} else {
			__io__block.writeShort(__io__address + 20, flag);
		}
	}

	/**
	 * Get method for struct member 'onion_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Per-layer onion-skinning flags (eGPDlayer_OnionFlag). </p>
	 * @see #__DNA__FIELD__onion_flag
	 */
	
	public short getOnion_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 42);
		} else {
			return __io__block.readShort(__io__address + 22);
		}
	}

	/**
	 * Set method for struct member 'onion_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Per-layer onion-skinning flags (eGPDlayer_OnionFlag). </p>
	 * @see #__DNA__FIELD__onion_flag
	 */
	
	public void setOnion_flag(short onion_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 42, onion_flag);
		} else {
			__io__block.writeShort(__io__address + 22, onion_flag);
		}
	}

	/**
	 * Get method for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for strokes in layers. Used for annotations, and for ruler (which uses GPencil internally). </p>
	 * @see #__DNA__FIELD__color
	 */
	
	public CArrayFacade<Float> getColor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for strokes in layers. Used for annotations, and for ruler (which uses GPencil internally). </p>
	 * @see #__DNA__FIELD__color
	 */
	
	public void setColor(CArrayFacade<Float> color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 44;
		} else {
			__dna__offset = 24;
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
	 * Get method for struct member 'fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Fill color for strokes in layers. Not used anymore (was only for). </p>
	 * @see #__DNA__FIELD__fill
	 */
	
	public CArrayFacade<Float> getFill() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Fill color for strokes in layers. Not used anymore (was only for). </p>
	 * @see #__DNA__FIELD__fill
	 */
	
	public void setFill(CArrayFacade<Float> fill) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 60;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(fill, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fill)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fill);
		} else {
			__io__generic__copy( getFill(), fill);
		}
	}

	/**
	 * Get method for struct member 'info'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name/reference info for this layer (i.e. "director's comments, 12/.3") needs to be kept unique, as it's used as the layer identifier </p>
	 * @see #__DNA__FIELD__info
	 */
	
	public CArrayFacade<Byte> getInfo() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			128
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'info'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name/reference info for this layer (i.e. "director's comments, 12/.3") needs to be kept unique, as it's used as the layer identifier </p>
	 * @see #__DNA__FIELD__info
	 */
	
	public void setInfo(CArrayFacade<Byte> info) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 76;
		} else {
			__dna__offset = 56;
		}
		if (__io__equals(info, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, info)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, info);
		} else {
			__io__generic__copy( getInfo(), info);
		}
	}

	/**
	 * Get method for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Thickness to apply to strokes (Annotations). </p>
	 * @see #__DNA__FIELD__thickness
	 */
	
	public short getThickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 204);
		} else {
			return __io__block.readShort(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Thickness to apply to strokes (Annotations). </p>
	 * @see #__DNA__FIELD__thickness
	 */
	
	public void setThickness(short thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 204, thickness);
		} else {
			__io__block.writeShort(__io__address + 184, thickness);
		}
	}

	/**
	 * Get method for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used to filter groups of layers in modifiers. </p>
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public short getPass_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 206);
		} else {
			return __io__block.readShort(__io__address + 186);
		}
	}

	/**
	 * Set method for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used to filter groups of layers in modifiers. </p>
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public void setPass_index(short pass_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 206, pass_index);
		} else {
			__io__block.writeShort(__io__address + 186, pass_index);
		}
	}

	/**
	 * Get method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Parent object. </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public CPointer<BlenderObject> getParent() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 188);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Parent object. </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public void setParent(CPointer<BlenderObject> parent) throws IOException
	{
		long __address = ((parent == null) ? 0 : parent.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 188, __address);
		}
	}

	/**
	 * Get method for struct member 'inverse'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inverse matrix (only used if parented). </p>
	 * @see #__DNA__FIELD__inverse
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getInverse() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'inverse'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inverse matrix (only used if parented). </p>
	 * @see #__DNA__FIELD__inverse
	 */
	
	public void setInverse(CArrayFacade<CArrayFacade<Float>> inverse) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 216;
		} else {
			__dna__offset = 192;
		}
		if (__io__equals(inverse, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, inverse)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, inverse);
		} else {
			__io__generic__copy( getInverse(), inverse);
		}
	}

	/**
	 * Get method for struct member 'parsubstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> String describing subobject info, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__parsubstr
	 */
	
	public CArrayFacade<Byte> getParsubstr() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 280, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 256, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parsubstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> String describing subobject info, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__parsubstr
	 */
	
	public void setParsubstr(CArrayFacade<Byte> parsubstr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 280;
		} else {
			__dna__offset = 256;
		}
		if (__io__equals(parsubstr, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, parsubstr)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, parsubstr);
		} else {
			__io__generic__copy( getParsubstr(), parsubstr);
		}
	}

	/**
	 * Get method for struct member 'partype'.
	 * @see #__DNA__FIELD__partype
	 */
	
	public short getPartype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 344);
		} else {
			return __io__block.readShort(__io__address + 320);
		}
	}

	/**
	 * Set method for struct member 'partype'.
	 * @see #__DNA__FIELD__partype
	 */
	
	public void setPartype(short partype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 344, partype);
		} else {
			__io__block.writeShort(__io__address + 320, partype);
		}
	}

	/**
	 * Get method for struct member 'line_change'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Thickness adjustment. </p>
	 * @see #__DNA__FIELD__line_change
	 */
	
	public short getLine_change() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 346);
		} else {
			return __io__block.readShort(__io__address + 322);
		}
	}

	/**
	 * Set method for struct member 'line_change'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Thickness adjustment. </p>
	 * @see #__DNA__FIELD__line_change
	 */
	
	public void setLine_change(short line_change) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 346, line_change);
		} else {
			__io__block.writeShort(__io__address + 322, line_change);
		}
	}

	/**
	 * Get method for struct member 'tintcolor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color used to tint layer, alpha value is used as factor. </p>
	 * @see #__DNA__FIELD__tintcolor
	 */
	
	public CArrayFacade<Float> getTintcolor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 348, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 324, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tintcolor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color used to tint layer, alpha value is used as factor. </p>
	 * @see #__DNA__FIELD__tintcolor
	 */
	
	public void setTintcolor(CArrayFacade<Float> tintcolor) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 348;
		} else {
			__dna__offset = 324;
		}
		if (__io__equals(tintcolor, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tintcolor)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tintcolor);
		} else {
			__io__generic__copy( getTintcolor(), tintcolor);
		}
	}

	/**
	 * Get method for struct member 'opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Opacity of the layer. </p>
	 * @see #__DNA__FIELD__opacity
	 */
	
	public float getOpacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 364);
		} else {
			return __io__block.readFloat(__io__address + 340);
		}
	}

	/**
	 * Set method for struct member 'opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Opacity of the layer. </p>
	 * @see #__DNA__FIELD__opacity
	 */
	
	public void setOpacity(float opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 364, opacity);
		} else {
			__io__block.writeFloat(__io__address + 340, opacity);
		}
	}

	/**
	 * Get method for struct member 'viewlayername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the layer used to filter render output. </p>
	 * @see #__DNA__FIELD__viewlayername
	 */
	
	public CArrayFacade<Byte> getViewlayername() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 368, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 344, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'viewlayername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the layer used to filter render output. </p>
	 * @see #__DNA__FIELD__viewlayername
	 */
	
	public void setViewlayername(CArrayFacade<Byte> viewlayername) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 368;
		} else {
			__dna__offset = 344;
		}
		if (__io__equals(viewlayername, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, viewlayername)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, viewlayername);
		} else {
			__io__generic__copy( getViewlayername(), viewlayername);
		}
	}

	/**
	 * Get method for struct member 'blend_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blend modes. </p>
	 * @see #__DNA__FIELD__blend_mode
	 */
	
	public int getBlend_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 432);
		} else {
			return __io__block.readInt(__io__address + 408);
		}
	}

	/**
	 * Set method for struct member 'blend_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blend modes. </p>
	 * @see #__DNA__FIELD__blend_mode
	 */
	
	public void setBlend_mode(int blend_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 432, blend_mode);
		} else {
			__io__block.writeInt(__io__address + 408, blend_mode);
		}
	}

	/**
	 * Get method for struct member 'vertex_paint_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex {@link Paint}  opacity by Layer. </p>
	 * @see #__DNA__FIELD__vertex_paint_opacity
	 */
	
	public float getVertex_paint_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 436);
		} else {
			return __io__block.readFloat(__io__address + 412);
		}
	}

	/**
	 * Set method for struct member 'vertex_paint_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex {@link Paint}  opacity by Layer. </p>
	 * @see #__DNA__FIELD__vertex_paint_opacity
	 */
	
	public void setVertex_paint_opacity(float vertex_paint_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 436, vertex_paint_opacity);
		} else {
			__io__block.writeFloat(__io__address + 412, vertex_paint_opacity);
		}
	}

	/**
	 * Get method for struct member 'gstep'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> annotation onion skin Ghosts Before: max number of ghost frames to show between active frame and the one before it (0 = only the ghost itself). </p>
	 * @see #__DNA__FIELD__gstep
	 */
	
	public short getGstep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 440);
		} else {
			return __io__block.readShort(__io__address + 416);
		}
	}

	/**
	 * Set method for struct member 'gstep'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> annotation onion skin Ghosts Before: max number of ghost frames to show between active frame and the one before it (0 = only the ghost itself). </p>
	 * @see #__DNA__FIELD__gstep
	 */
	
	public void setGstep(short gstep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 440, gstep);
		} else {
			__io__block.writeShort(__io__address + 416, gstep);
		}
	}

	/**
	 * Get method for struct member 'gstep_next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ghosts After: max number of ghost frames to show after active frame and the following it (0 = only the ghost itself). </p>
	 * @see #__DNA__FIELD__gstep_next
	 */
	
	public short getGstep_next() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 442);
		} else {
			return __io__block.readShort(__io__address + 418);
		}
	}

	/**
	 * Set method for struct member 'gstep_next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ghosts After: max number of ghost frames to show after active frame and the following it (0 = only the ghost itself). </p>
	 * @see #__DNA__FIELD__gstep_next
	 */
	
	public void setGstep_next(short gstep_next) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 442, gstep_next);
		} else {
			__io__block.writeShort(__io__address + 418, gstep_next);
		}
	}

	/**
	 * Get method for struct member 'gcolor_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for ghosts before the active frame. </p>
	 * @see #__DNA__FIELD__gcolor_prev
	 */
	
	public CArrayFacade<Float> getGcolor_prev() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 444, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 420, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gcolor_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for ghosts before the active frame. </p>
	 * @see #__DNA__FIELD__gcolor_prev
	 */
	
	public void setGcolor_prev(CArrayFacade<Float> gcolor_prev) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 444;
		} else {
			__dna__offset = 420;
		}
		if (__io__equals(gcolor_prev, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gcolor_prev)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gcolor_prev);
		} else {
			__io__generic__copy( getGcolor_prev(), gcolor_prev);
		}
	}

	/**
	 * Get method for struct member 'gcolor_next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for ghosts after the active frame. </p>
	 * @see #__DNA__FIELD__gcolor_next
	 */
	
	public CArrayFacade<Float> getGcolor_next() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 456, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 432, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gcolor_next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for ghosts after the active frame. </p>
	 * @see #__DNA__FIELD__gcolor_next
	 */
	
	public void setGcolor_next(CArrayFacade<Float> gcolor_next) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 456;
		} else {
			__dna__offset = 432;
		}
		if (__io__equals(gcolor_next, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gcolor_next)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gcolor_next);
		} else {
			__io__generic__copy( getGcolor_next(), gcolor_next);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 468, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 444, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 468;
		} else {
			__dna__offset = 444;
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
	 * Get method for struct member 'mask_layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mask}  list ({@link bGPDlayer_Mask} ). </p>
	 * @see #__DNA__FIELD__mask_layers
	 */
	
	public ListBase getMask_layers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 472, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 448, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mask_layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mask}  list ({@link bGPDlayer_Mask} ). </p>
	 * @see #__DNA__FIELD__mask_layers
	 */
	
	public void setMask_layers(ListBase mask_layers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 472;
		} else {
			__dna__offset = 448;
		}
		if (__io__equals(mask_layers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mask_layers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mask_layers);
		} else {
			__io__generic__copy( getMask_layers(), mask_layers);
		}
	}

	/**
	 * Get method for struct member 'act_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current {@link Mask}  index (noted base 1). </p>
	 * @see #__DNA__FIELD__act_mask
	 */
	
	public int getAct_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 488);
		} else {
			return __io__block.readInt(__io__address + 456);
		}
	}

	/**
	 * Set method for struct member 'act_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current {@link Mask}  index (noted base 1). </p>
	 * @see #__DNA__FIELD__act_mask
	 */
	
	public void setAct_mask(int act_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 488, act_mask);
		} else {
			__io__block.writeInt(__io__address + 456, act_mask);
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
			return new CArrayFacade<Byte>(__io__address + 492, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 460, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 492;
		} else {
			__dna__offset = 460;
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
	 * Get method for struct member 'location'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Layer transforms. </p>
	 * @see #__DNA__FIELD__location
	 */
	
	public CArrayFacade<Float> getLocation() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 496, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 464, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'location'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Layer transforms. </p>
	 * @see #__DNA__FIELD__location
	 */
	
	public void setLocation(CArrayFacade<Float> location) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 496;
		} else {
			__dna__offset = 464;
		}
		if (__io__equals(location, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, location)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, location);
		} else {
			__io__generic__copy( getLocation(), location);
		}
	}

	/**
	 * Get method for struct member 'rotation'.
	 * @see #__DNA__FIELD__rotation
	 */
	
	public CArrayFacade<Float> getRotation() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 508, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 476, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rotation'.
	 * @see #__DNA__FIELD__rotation
	 */
	
	public void setRotation(CArrayFacade<Float> rotation) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 508;
		} else {
			__dna__offset = 476;
		}
		if (__io__equals(rotation, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rotation)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rotation);
		} else {
			__io__generic__copy( getRotation(), rotation);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public CArrayFacade<Float> getScale() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 520, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 488, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(CArrayFacade<Float> scale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 520;
		} else {
			__dna__offset = 488;
		}
		if (__io__equals(scale, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scale)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scale);
		} else {
			__io__generic__copy( getScale(), scale);
		}
	}

	/**
	 * Get method for struct member 'layer_mat'.
	 * @see #__DNA__FIELD__layer_mat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getLayer_mat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 532, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 500, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layer_mat'.
	 * @see #__DNA__FIELD__layer_mat
	 */
	
	public void setLayer_mat(CArrayFacade<CArrayFacade<Float>> layer_mat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 532;
		} else {
			__dna__offset = 500;
		}
		if (__io__equals(layer_mat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layer_mat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layer_mat);
		} else {
			__io__generic__copy( getLayer_mat(), layer_mat);
		}
	}

	/**
	 * Get method for struct member 'layer_invmat'.
	 * @see #__DNA__FIELD__layer_invmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getLayer_invmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 596, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 564, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layer_invmat'.
	 * @see #__DNA__FIELD__layer_invmat
	 */
	
	public void setLayer_invmat(CArrayFacade<CArrayFacade<Float>> layer_invmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 596;
		} else {
			__dna__offset = 564;
		}
		if (__io__equals(layer_invmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layer_invmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layer_invmat);
		} else {
			__io__generic__copy( getLayer_invmat(), layer_invmat);
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
			return new CArrayFacade<Byte>(__io__address + 660, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 628, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 660;
		} else {
			__dna__offset = 628;
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
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public bGPDlayer_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bGPDlayer_Runtime(__io__address + 664, __io__block, __io__blockTable);
		} else {
			return new bGPDlayer_Runtime(__io__address + 632, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(bGPDlayer_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 664;
		} else {
			__dna__offset = 632;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPDlayer> __io__addressof() {
		return new CPointer<bGPDlayer>(__io__address, new Class[]{bGPDlayer.class}, __io__block, __io__blockTable);
	}

}
