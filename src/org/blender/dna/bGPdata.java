package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPdata'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Grease-Pencil Annotations - 'DataBlock' </p>
 */

@CMetaData(size32=348, size64=416)
public class bGPdata extends CFacade {

	/**
	 * This is the sdna index of the struct bGPdata.
	 * <p>
	 * It is required when allocating a new block to store data for bGPdata.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 474;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil data is a data-block. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 120/152</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation data - for animating draw settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__adt);
	 * CPointer&lt;CPointer&lt;AnimData&gt;&gt; p_adt = p.cast(new Class[]{CPointer.class, AnimData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adt'</li>
	 * <li>Signature: 'AnimData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adt = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease-Pencil data BGPDlayers. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__layers);
	 * CPointer&lt;ListBase&gt; p_layers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layers = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for this data-block. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{132, 176};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{136, 180};

	/**
	 * Field descriptor (offset) for struct member 'palettes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Palettes List of {@link bGPDpalette} 's - Deprecated (2.78 - 2.79 only). 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__palettes);
	 * CPointer&lt;ListBase&gt; p_palettes = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'palettes'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__palettes = new long[]{140, 184};

	/**
	 * Field descriptor (offset) for struct member 'pixfactor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 3D Viewport/Appearance Settings Factor to define pixel size conversion. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__pixfactor);
	 * CPointer&lt;Float&gt; p_pixfactor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pixfactor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pixfactor = new long[]{148, 200};

	/**
	 * Field descriptor (offset) for struct member 'line_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for edit line. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__line_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_line_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'line_color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__line_color = new long[]{152, 204};

	/**
	 * Field descriptor (offset) for struct member 'onion_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion skinning Onion alpha factor change. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__onion_factor);
	 * CPointer&lt;Float&gt; p_onion_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'onion_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__onion_factor = new long[]{168, 220};

	/**
	 * Field descriptor (offset) for struct member 'onion_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion skinning range (eGP_OnionModes). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__onion_mode);
	 * CPointer&lt;Integer&gt; p_onion_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'onion_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__onion_mode = new long[]{172, 224};

	/**
	 * Field descriptor (offset) for struct member 'onion_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion skinning flags (eGPD_OnionFlag). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__onion_flag);
	 * CPointer&lt;Integer&gt; p_onion_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'onion_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__onion_flag = new long[]{176, 228};

	/**
	 * Field descriptor (offset) for struct member 'gstep'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ghosts Before: max number of ghost frames to show between active frame and the one before it (0 = only the ghost itself). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__gstep);
	 * CPointer&lt;Short&gt; p_gstep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gstep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gstep = new long[]{180, 232};

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
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__gstep_next);
	 * CPointer&lt;Short&gt; p_gstep_next = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gstep_next'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gstep_next = new long[]{182, 234};

	/**
	 * Field descriptor (offset) for struct member 'gcolor_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional color for ghosts before the active frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__gcolor_prev);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gcolor_prev = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gcolor_prev'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gcolor_prev = new long[]{184, 236};

	/**
	 * Field descriptor (offset) for struct member 'gcolor_next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional color for ghosts after the active frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__gcolor_next);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gcolor_next = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gcolor_next'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gcolor_next = new long[]{196, 248};

	/**
	 * Field descriptor (offset) for struct member 'zdepth_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset for drawing over surfaces to keep strokes on top. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__zdepth_offset);
	 * CPointer&lt;Float&gt; p_zdepth_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zdepth_offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zdepth_offset = new long[]{208, 260};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Materials array. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__mat);
	 * CPointer&lt;CPointer&lt;CPointer&lt;Material&gt;&gt;&gt; p_mat = p.cast(new Class[]{CPointer.class, CPointer.class, Material.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'Material**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{212, 264};

	/**
	 * Field descriptor (offset) for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total materials. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__totcol);
	 * CPointer&lt;Short&gt; p_totcol = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totcol'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totcol = new long[]{216, 272};

	/**
	 * Field descriptor (offset) for struct member 'totlayer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> stats </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__totlayer);
	 * CPointer&lt;Short&gt; p_totlayer = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totlayer'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totlayer = new long[]{218, 274};

	/**
	 * Field descriptor (offset) for struct member 'totframe'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__totframe);
	 * CPointer&lt;Short&gt; p_totframe = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totframe'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totframe = new long[]{220, 276};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{222, 278};

	/**
	 * Field descriptor (offset) for struct member 'totstroke'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__totstroke);
	 * CPointer&lt;Integer&gt; p_totstroke = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totstroke'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totstroke = new long[]{228, 284};

	/**
	 * Field descriptor (offset) for struct member 'totpoint'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__totpoint);
	 * CPointer&lt;Integer&gt; p_totpoint = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpoint'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpoint = new long[]{232, 288};

	/**
	 * Field descriptor (offset) for struct member 'draw_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Draw mode for strokes (eGP_DrawMode). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__draw_mode);
	 * CPointer&lt;Short&gt; p_draw_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_mode = new long[]{236, 292};

	/**
	 * Field descriptor (offset) for struct member 'onion_keytype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Keyframe type for onion filter (eBezTriple_KeyframeType plus All option) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__onion_keytype);
	 * CPointer&lt;Short&gt; p_onion_keytype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'onion_keytype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__onion_keytype = new long[]{238, 294};

	/**
	 * Field descriptor (offset) for struct member 'grid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__grid);
	 * CPointer&lt;bGPgrid&gt; p_grid = p.cast(new Class[]{bGPgrid.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grid'</li>
	 * <li>Signature: 'bGPgrid'</li>
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grid = new long[]{240, 296};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata bgpdata = ...;
	 * CPointer&lt;Object&gt; p = bgpdata.__dna__addressof(bGPdata.__DNA__FIELD__runtime);
	 * CPointer&lt;bGPdata_Runtime&gt; p_runtime = p.cast(new Class[]{bGPdata_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'bGPdata_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 68/80</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{280, 336};

	public bGPdata(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPdata(bGPdata that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil data is a data-block. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil data is a data-block. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation data - for animating draw settings. </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation data - for animating draw settings. </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease-Pencil data BGPDlayers. </p>
	 * @see #__DNA__FIELD__layers
	 */
	
	public ListBase getLayers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 160, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 124, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease-Pencil data BGPDlayers. </p>
	 * @see #__DNA__FIELD__layers
	 */
	
	public void setLayers(ListBase layers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 124;
		}
		if (__io__equals(layers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layers);
		} else {
			__io__generic__copy( getLayers(), layers);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for this data-block. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 176);
		} else {
			return __io__block.readInt(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for this data-block. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 176, flag);
		} else {
			__io__block.writeInt(__io__address + 132, flag);
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
			return new CArrayFacade<Byte>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 180;
		} else {
			__dna__offset = 136;
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
	 * Get method for struct member 'palettes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Palettes List of {@link bGPDpalette} 's - Deprecated (2.78 - 2.79 only). 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__palettes
	 */
	
	public ListBase getPalettes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 184, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 140, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'palettes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Palettes List of {@link bGPDpalette} 's - Deprecated (2.78 - 2.79 only). 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__palettes
	 */
	
	public void setPalettes(ListBase palettes) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(palettes, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, palettes)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, palettes);
		} else {
			__io__generic__copy( getPalettes(), palettes);
		}
	}

	/**
	 * Get method for struct member 'pixfactor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 3D Viewport/Appearance Settings Factor to define pixel size conversion. </p>
	 * @see #__DNA__FIELD__pixfactor
	 */
	
	public float getPixfactor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'pixfactor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 3D Viewport/Appearance Settings Factor to define pixel size conversion. </p>
	 * @see #__DNA__FIELD__pixfactor
	 */
	
	public void setPixfactor(float pixfactor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, pixfactor);
		} else {
			__io__block.writeFloat(__io__address + 148, pixfactor);
		}
	}

	/**
	 * Get method for struct member 'line_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for edit line. </p>
	 * @see #__DNA__FIELD__line_color
	 */
	
	public CArrayFacade<Float> getLine_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'line_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color for edit line. </p>
	 * @see #__DNA__FIELD__line_color
	 */
	
	public void setLine_color(CArrayFacade<Float> line_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 204;
		} else {
			__dna__offset = 152;
		}
		if (__io__equals(line_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, line_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, line_color);
		} else {
			__io__generic__copy( getLine_color(), line_color);
		}
	}

	/**
	 * Get method for struct member 'onion_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion skinning Onion alpha factor change. </p>
	 * @see #__DNA__FIELD__onion_factor
	 */
	
	public float getOnion_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 220);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'onion_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion skinning Onion alpha factor change. </p>
	 * @see #__DNA__FIELD__onion_factor
	 */
	
	public void setOnion_factor(float onion_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 220, onion_factor);
		} else {
			__io__block.writeFloat(__io__address + 168, onion_factor);
		}
	}

	/**
	 * Get method for struct member 'onion_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion skinning range (eGP_OnionModes). </p>
	 * @see #__DNA__FIELD__onion_mode
	 */
	
	public int getOnion_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 224);
		} else {
			return __io__block.readInt(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'onion_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion skinning range (eGP_OnionModes). </p>
	 * @see #__DNA__FIELD__onion_mode
	 */
	
	public void setOnion_mode(int onion_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 224, onion_mode);
		} else {
			__io__block.writeInt(__io__address + 172, onion_mode);
		}
	}

	/**
	 * Get method for struct member 'onion_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion skinning flags (eGPD_OnionFlag). </p>
	 * @see #__DNA__FIELD__onion_flag
	 */
	
	public int getOnion_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 228);
		} else {
			return __io__block.readInt(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'onion_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Onion skinning flags (eGPD_OnionFlag). </p>
	 * @see #__DNA__FIELD__onion_flag
	 */
	
	public void setOnion_flag(int onion_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 228, onion_flag);
		} else {
			__io__block.writeInt(__io__address + 176, onion_flag);
		}
	}

	/**
	 * Get method for struct member 'gstep'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ghosts Before: max number of ghost frames to show between active frame and the one before it (0 = only the ghost itself). </p>
	 * @see #__DNA__FIELD__gstep
	 */
	
	public short getGstep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 232);
		} else {
			return __io__block.readShort(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'gstep'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ghosts Before: max number of ghost frames to show between active frame and the one before it (0 = only the ghost itself). </p>
	 * @see #__DNA__FIELD__gstep
	 */
	
	public void setGstep(short gstep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 232, gstep);
		} else {
			__io__block.writeShort(__io__address + 180, gstep);
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
			return __io__block.readShort(__io__address + 234);
		} else {
			return __io__block.readShort(__io__address + 182);
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
			__io__block.writeShort(__io__address + 234, gstep_next);
		} else {
			__io__block.writeShort(__io__address + 182, gstep_next);
		}
	}

	/**
	 * Get method for struct member 'gcolor_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional color for ghosts before the active frame. </p>
	 * @see #__DNA__FIELD__gcolor_prev
	 */
	
	public CArrayFacade<Float> getGcolor_prev() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 236, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gcolor_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional color for ghosts before the active frame. </p>
	 * @see #__DNA__FIELD__gcolor_prev
	 */
	
	public void setGcolor_prev(CArrayFacade<Float> gcolor_prev) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 236;
		} else {
			__dna__offset = 184;
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
	 * <p> Optional color for ghosts after the active frame. </p>
	 * @see #__DNA__FIELD__gcolor_next
	 */
	
	public CArrayFacade<Float> getGcolor_next() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gcolor_next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional color for ghosts after the active frame. </p>
	 * @see #__DNA__FIELD__gcolor_next
	 */
	
	public void setGcolor_next(CArrayFacade<Float> gcolor_next) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 196;
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
	 * Get method for struct member 'zdepth_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset for drawing over surfaces to keep strokes on top. </p>
	 * @see #__DNA__FIELD__zdepth_offset
	 */
	
	public float getZdepth_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 260);
		} else {
			return __io__block.readFloat(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'zdepth_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset for drawing over surfaces to keep strokes on top. </p>
	 * @see #__DNA__FIELD__zdepth_offset
	 */
	
	public void setZdepth_offset(float zdepth_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 260, zdepth_offset);
		} else {
			__io__block.writeFloat(__io__address + 208, zdepth_offset);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Materials array. </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public CPointer<CPointer<Material>> getMat() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 264);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 212);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Material.class};
		return new CPointer<CPointer<Material>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Materials array. </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CPointer<CPointer<Material>> mat) throws IOException
	{
		long __address = ((mat == null) ? 0 : mat.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 264, __address);
		} else {
			__io__block.writeLong(__io__address + 212, __address);
		}
	}

	/**
	 * Get method for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total materials. </p>
	 * @see #__DNA__FIELD__totcol
	 */
	
	public short getTotcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 272);
		} else {
			return __io__block.readShort(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'totcol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total materials. </p>
	 * @see #__DNA__FIELD__totcol
	 */
	
	public void setTotcol(short totcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 272, totcol);
		} else {
			__io__block.writeShort(__io__address + 216, totcol);
		}
	}

	/**
	 * Get method for struct member 'totlayer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> stats </p>
	 * @see #__DNA__FIELD__totlayer
	 */
	
	public short getTotlayer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 274);
		} else {
			return __io__block.readShort(__io__address + 218);
		}
	}

	/**
	 * Set method for struct member 'totlayer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> stats </p>
	 * @see #__DNA__FIELD__totlayer
	 */
	
	public void setTotlayer(short totlayer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 274, totlayer);
		} else {
			__io__block.writeShort(__io__address + 218, totlayer);
		}
	}

	/**
	 * Get method for struct member 'totframe'.
	 * @see #__DNA__FIELD__totframe
	 */
	
	public short getTotframe() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 276);
		} else {
			return __io__block.readShort(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'totframe'.
	 * @see #__DNA__FIELD__totframe
	 */
	
	public void setTotframe(short totframe) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 276, totframe);
		} else {
			__io__block.writeShort(__io__address + 220, totframe);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 278, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 222, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 278;
		} else {
			__dna__offset = 222;
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
	 * Get method for struct member 'totstroke'.
	 * @see #__DNA__FIELD__totstroke
	 */
	
	public int getTotstroke() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 284);
		} else {
			return __io__block.readInt(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'totstroke'.
	 * @see #__DNA__FIELD__totstroke
	 */
	
	public void setTotstroke(int totstroke) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 284, totstroke);
		} else {
			__io__block.writeInt(__io__address + 228, totstroke);
		}
	}

	/**
	 * Get method for struct member 'totpoint'.
	 * @see #__DNA__FIELD__totpoint
	 */
	
	public int getTotpoint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 288);
		} else {
			return __io__block.readInt(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'totpoint'.
	 * @see #__DNA__FIELD__totpoint
	 */
	
	public void setTotpoint(int totpoint) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 288, totpoint);
		} else {
			__io__block.writeInt(__io__address + 232, totpoint);
		}
	}

	/**
	 * Get method for struct member 'draw_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Draw mode for strokes (eGP_DrawMode). </p>
	 * @see #__DNA__FIELD__draw_mode
	 */
	
	public short getDraw_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 292);
		} else {
			return __io__block.readShort(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'draw_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Draw mode for strokes (eGP_DrawMode). </p>
	 * @see #__DNA__FIELD__draw_mode
	 */
	
	public void setDraw_mode(short draw_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 292, draw_mode);
		} else {
			__io__block.writeShort(__io__address + 236, draw_mode);
		}
	}

	/**
	 * Get method for struct member 'onion_keytype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Keyframe type for onion filter (eBezTriple_KeyframeType plus All option) </p>
	 * @see #__DNA__FIELD__onion_keytype
	 */
	
	public short getOnion_keytype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 294);
		} else {
			return __io__block.readShort(__io__address + 238);
		}
	}

	/**
	 * Set method for struct member 'onion_keytype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Keyframe type for onion filter (eBezTriple_KeyframeType plus All option) </p>
	 * @see #__DNA__FIELD__onion_keytype
	 */
	
	public void setOnion_keytype(short onion_keytype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 294, onion_keytype);
		} else {
			__io__block.writeShort(__io__address + 238, onion_keytype);
		}
	}

	/**
	 * Get method for struct member 'grid'.
	 * @see #__DNA__FIELD__grid
	 */
	
	public bGPgrid getGrid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bGPgrid(__io__address + 296, __io__block, __io__blockTable);
		} else {
			return new bGPgrid(__io__address + 240, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'grid'.
	 * @see #__DNA__FIELD__grid
	 */
	
	public void setGrid(bGPgrid grid) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 296;
		} else {
			__dna__offset = 240;
		}
		if (__io__equals(grid, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, grid)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, grid);
		} else {
			__io__generic__copy( getGrid(), grid);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public bGPdata_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bGPdata_Runtime(__io__address + 336, __io__block, __io__blockTable);
		} else {
			return new bGPdata_Runtime(__io__address + 280, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(bGPdata_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 336;
		} else {
			__dna__offset = 280;
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
	public CPointer<bGPdata> __io__addressof() {
		return new CPointer<bGPdata>(__io__address, new Class[]{bGPdata.class}, __io__block, __io__blockTable);
	}

}
