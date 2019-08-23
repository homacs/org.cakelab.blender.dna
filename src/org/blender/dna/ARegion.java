package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ARegion'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=292, size64=384)
public class ARegion extends CFacade {

	/**
	 * This is the sdna index of the struct ARegion.
	 * <p>
	 * It is required when allocating a new block to store data for ARegion.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 263;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;ARegion&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, ARegion.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'ARegion*'</li>
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
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;ARegion&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, ARegion.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'ARegion*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'v2d'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 2D-View scrolling/zoom info (most regions are 2d anyways) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__v2d);
	 * CPointer&lt;View2D&gt; p_v2d = p.cast(new Class[]{View2D.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v2d'</li>
	 * <li>Signature: 'View2D'</li>
	 * <li>Actual Size (32bit/64bit): 148/160</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v2d = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'winrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> coordinates of region </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__winrct);
	 * CPointer&lt;rcti&gt; p_winrct = p.cast(new Class[]{rcti.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'winrct'</li>
	 * <li>Signature: 'rcti'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__winrct = new long[]{156, 176};

	/**
	 * Field descriptor (offset) for struct member 'drawrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime for partial redraw, same or smaller than winrct </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__drawrct);
	 * CPointer&lt;rcti&gt; p_drawrct = p.cast(new Class[]{rcti.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawrct'</li>
	 * <li>Signature: 'rcti'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawrct = new long[]{172, 192};

	/**
	 * Field descriptor (offset) for struct member 'winx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__winx);
	 * CPointer&lt;Short&gt; p_winx = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'winx'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__winx = new long[]{188, 208};

	/**
	 * Field descriptor (offset) for struct member 'winy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__winy);
	 * CPointer&lt;Short&gt; p_winy = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'winy'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__winy = new long[]{190, 210};

	/**
	 * Field descriptor (offset) for struct member 'swinid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__swinid);
	 * CPointer&lt;Short&gt; p_swinid = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'swinid'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__swinid = new long[]{192, 212};

	/**
	 * Field descriptor (offset) for struct member 'regiontype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> window, header, etc. identifier for drawing </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__regiontype);
	 * CPointer&lt;Short&gt; p_regiontype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'regiontype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__regiontype = new long[]{194, 214};

	/**
	 * Field descriptor (offset) for struct member 'alignment'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> how it should split </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__alignment);
	 * CPointer&lt;Short&gt; p_alignment = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alignment'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alignment = new long[]{196, 216};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> hide, ... </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{198, 218};

	/**
	 * Field descriptor (offset) for struct member 'fsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current split size in float (unused) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__fsize);
	 * CPointer&lt;Float&gt; p_fsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fsize = new long[]{200, 220};

	/**
	 * Field descriptor (offset) for struct member 'sizex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__sizex);
	 * CPointer&lt;Short&gt; p_sizex = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sizex'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sizex = new long[]{204, 224};

	/**
	 * Field descriptor (offset) for struct member 'sizey'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current split size in pixels (if zero it uses regiontype) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__sizey);
	 * CPointer&lt;Short&gt; p_sizey = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sizey'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sizey = new long[]{206, 226};

	/**
	 * Field descriptor (offset) for struct member 'do_draw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, cached notifier events </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__do_draw);
	 * CPointer&lt;Short&gt; p_do_draw = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'do_draw'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__do_draw = new long[]{208, 228};

	/**
	 * Field descriptor (offset) for struct member 'do_draw_overlay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, cached notifier events </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__do_draw_overlay);
	 * CPointer&lt;Short&gt; p_do_draw_overlay = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'do_draw_overlay'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__do_draw_overlay = new long[]{210, 230};

	/**
	 * Field descriptor (offset) for struct member 'swap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, indicator to survive swap-exchange </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__swap);
	 * CPointer&lt;Short&gt; p_swap = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'swap'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__swap = new long[]{212, 232};

	/**
	 * Field descriptor (offset) for struct member 'overlap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, set for indicate drawing overlapped </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__overlap);
	 * CPointer&lt;Short&gt; p_overlap = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overlap'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overlap = new long[]{214, 234};

	/**
	 * Field descriptor (offset) for struct member 'flagfullscreen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary copy of flag settings for clean fullscreen </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__flagfullscreen);
	 * CPointer&lt;Short&gt; p_flagfullscreen = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flagfullscreen'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flagfullscreen = new long[]{216, 236};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__pad);
	 * CPointer&lt;Short&gt; p_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{218, 238};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> callbacks for this region type </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__type);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_type = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'ARegionType*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{220, 240};

	/**
	 * Field descriptor (offset) for struct member 'uiblocks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> uiBlock </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__uiblocks);
	 * CPointer&lt;ListBase&gt; p_uiblocks = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uiblocks'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uiblocks = new long[]{224, 248};

	/**
	 * Field descriptor (offset) for struct member 'panels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__panels);
	 * CPointer&lt;ListBase&gt; p_panels = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'panels'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__panels = new long[]{232, 264};

	/**
	 * Field descriptor (offset) for struct member 'panels_category_active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stack of panel categories </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__panels_category_active);
	 * CPointer&lt;ListBase&gt; p_panels_category_active = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'panels_category_active'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__panels_category_active = new long[]{240, 280};

	/**
	 * Field descriptor (offset) for struct member 'ui_lists'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link uiList}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__ui_lists);
	 * CPointer&lt;ListBase&gt; p_ui_lists = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ui_lists'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ui_lists = new long[]{248, 296};

	/**
	 * Field descriptor (offset) for struct member 'ui_previews'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link uiPreview}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__ui_previews);
	 * CPointer&lt;ListBase&gt; p_ui_previews = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ui_previews'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ui_previews = new long[]{256, 312};

	/**
	 * Field descriptor (offset) for struct member 'handlers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> wmEventHandler </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__handlers);
	 * CPointer&lt;ListBase&gt; p_handlers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handlers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handlers = new long[]{264, 328};

	/**
	 * Field descriptor (offset) for struct member 'panels_category'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  categories runtime </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__panels_category);
	 * CPointer&lt;ListBase&gt; p_panels_category = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'panels_category'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__panels_category = new long[]{272, 344};

	/**
	 * Field descriptor (offset) for struct member 'regiontimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> blend in/out </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__regiontimer);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_regiontimer = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'regiontimer'</li>
	 * <li>Signature: 'wmTimer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__regiontimer = new long[]{280, 360};

	/**
	 * Field descriptor (offset) for struct member 'headerstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> use this string to draw info </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__headerstr);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_headerstr = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'headerstr'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__headerstr = new long[]{284, 368};

	/**
	 * Field descriptor (offset) for struct member 'regiondata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX 2.50, need spacedata equivalent? </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__regiondata);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_regiondata = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'regiondata'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__regiondata = new long[]{288, 376};

	public ARegion(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ARegion(ARegion that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<ARegion> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ARegion.class};
		return new CPointer<ARegion>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ARegion.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<ARegion> next) throws IOException
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
	
	public CPointer<ARegion> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ARegion.class};
		return new CPointer<ARegion>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ARegion.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<ARegion> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'v2d'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 2D-View scrolling/zoom info (most regions are 2d anyways) </p>
	 * @see #__DNA__FIELD__v2d
	 */
	
	public View2D getV2d() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new View2D(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new View2D(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'v2d'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 2D-View scrolling/zoom info (most regions are 2d anyways) </p>
	 * @see #__DNA__FIELD__v2d
	 */
	
	public void setV2d(View2D v2d) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(v2d, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, v2d)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, v2d);
		} else {
			__io__generic__copy( getV2d(), v2d);
		}
	}

	/**
	 * Get method for struct member 'winrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> coordinates of region </p>
	 * @see #__DNA__FIELD__winrct
	 */
	
	public rcti getWinrct() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rcti(__io__address + 176, __io__block, __io__blockTable);
		} else {
			return new rcti(__io__address + 156, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'winrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> coordinates of region </p>
	 * @see #__DNA__FIELD__winrct
	 */
	
	public void setWinrct(rcti winrct) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 176;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(winrct, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, winrct)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, winrct);
		} else {
			__io__generic__copy( getWinrct(), winrct);
		}
	}

	/**
	 * Get method for struct member 'drawrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime for partial redraw, same or smaller than winrct </p>
	 * @see #__DNA__FIELD__drawrct
	 */
	
	public rcti getDrawrct() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rcti(__io__address + 192, __io__block, __io__blockTable);
		} else {
			return new rcti(__io__address + 172, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drawrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime for partial redraw, same or smaller than winrct </p>
	 * @see #__DNA__FIELD__drawrct
	 */
	
	public void setDrawrct(rcti drawrct) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 172;
		}
		if (__io__equals(drawrct, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drawrct)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drawrct);
		} else {
			__io__generic__copy( getDrawrct(), drawrct);
		}
	}

	/**
	 * Get method for struct member 'winx'.
	 * @see #__DNA__FIELD__winx
	 */
	
	public short getWinx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 208);
		} else {
			return __io__block.readShort(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'winx'.
	 * @see #__DNA__FIELD__winx
	 */
	
	public void setWinx(short winx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 208, winx);
		} else {
			__io__block.writeShort(__io__address + 188, winx);
		}
	}

	/**
	 * Get method for struct member 'winy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size </p>
	 * @see #__DNA__FIELD__winy
	 */
	
	public short getWiny() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 210);
		} else {
			return __io__block.readShort(__io__address + 190);
		}
	}

	/**
	 * Set method for struct member 'winy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size </p>
	 * @see #__DNA__FIELD__winy
	 */
	
	public void setWiny(short winy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 210, winy);
		} else {
			__io__block.writeShort(__io__address + 190, winy);
		}
	}

	/**
	 * Get method for struct member 'swinid'.
	 * @see #__DNA__FIELD__swinid
	 */
	
	public short getSwinid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 212);
		} else {
			return __io__block.readShort(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'swinid'.
	 * @see #__DNA__FIELD__swinid
	 */
	
	public void setSwinid(short swinid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 212, swinid);
		} else {
			__io__block.writeShort(__io__address + 192, swinid);
		}
	}

	/**
	 * Get method for struct member 'regiontype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> window, header, etc. identifier for drawing </p>
	 * @see #__DNA__FIELD__regiontype
	 */
	
	public short getRegiontype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 214);
		} else {
			return __io__block.readShort(__io__address + 194);
		}
	}

	/**
	 * Set method for struct member 'regiontype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> window, header, etc. identifier for drawing </p>
	 * @see #__DNA__FIELD__regiontype
	 */
	
	public void setRegiontype(short regiontype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 214, regiontype);
		} else {
			__io__block.writeShort(__io__address + 194, regiontype);
		}
	}

	/**
	 * Get method for struct member 'alignment'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> how it should split </p>
	 * @see #__DNA__FIELD__alignment
	 */
	
	public short getAlignment() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 216);
		} else {
			return __io__block.readShort(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'alignment'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> how it should split </p>
	 * @see #__DNA__FIELD__alignment
	 */
	
	public void setAlignment(short alignment) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 216, alignment);
		} else {
			__io__block.writeShort(__io__address + 196, alignment);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> hide, ... </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 218);
		} else {
			return __io__block.readShort(__io__address + 198);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> hide, ... </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 218, flag);
		} else {
			__io__block.writeShort(__io__address + 198, flag);
		}
	}

	/**
	 * Get method for struct member 'fsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current split size in float (unused) </p>
	 * @see #__DNA__FIELD__fsize
	 */
	
	public float getFsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 220);
		} else {
			return __io__block.readFloat(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'fsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current split size in float (unused) </p>
	 * @see #__DNA__FIELD__fsize
	 */
	
	public void setFsize(float fsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 220, fsize);
		} else {
			__io__block.writeFloat(__io__address + 200, fsize);
		}
	}

	/**
	 * Get method for struct member 'sizex'.
	 * @see #__DNA__FIELD__sizex
	 */
	
	public short getSizex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 224);
		} else {
			return __io__block.readShort(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'sizex'.
	 * @see #__DNA__FIELD__sizex
	 */
	
	public void setSizex(short sizex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 224, sizex);
		} else {
			__io__block.writeShort(__io__address + 204, sizex);
		}
	}

	/**
	 * Get method for struct member 'sizey'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current split size in pixels (if zero it uses regiontype) </p>
	 * @see #__DNA__FIELD__sizey
	 */
	
	public short getSizey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 226);
		} else {
			return __io__block.readShort(__io__address + 206);
		}
	}

	/**
	 * Set method for struct member 'sizey'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current split size in pixels (if zero it uses regiontype) </p>
	 * @see #__DNA__FIELD__sizey
	 */
	
	public void setSizey(short sizey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 226, sizey);
		} else {
			__io__block.writeShort(__io__address + 206, sizey);
		}
	}

	/**
	 * Get method for struct member 'do_draw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, cached notifier events </p>
	 * @see #__DNA__FIELD__do_draw
	 */
	
	public short getDo_draw() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 228);
		} else {
			return __io__block.readShort(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'do_draw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, cached notifier events </p>
	 * @see #__DNA__FIELD__do_draw
	 */
	
	public void setDo_draw(short do_draw) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 228, do_draw);
		} else {
			__io__block.writeShort(__io__address + 208, do_draw);
		}
	}

	/**
	 * Get method for struct member 'do_draw_overlay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, cached notifier events </p>
	 * @see #__DNA__FIELD__do_draw_overlay
	 */
	
	public short getDo_draw_overlay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 230);
		} else {
			return __io__block.readShort(__io__address + 210);
		}
	}

	/**
	 * Set method for struct member 'do_draw_overlay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, cached notifier events </p>
	 * @see #__DNA__FIELD__do_draw_overlay
	 */
	
	public void setDo_draw_overlay(short do_draw_overlay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 230, do_draw_overlay);
		} else {
			__io__block.writeShort(__io__address + 210, do_draw_overlay);
		}
	}

	/**
	 * Get method for struct member 'swap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, indicator to survive swap-exchange </p>
	 * @see #__DNA__FIELD__swap
	 */
	
	public short getSwap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 232);
		} else {
			return __io__block.readShort(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'swap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, indicator to survive swap-exchange </p>
	 * @see #__DNA__FIELD__swap
	 */
	
	public void setSwap(short swap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 232, swap);
		} else {
			__io__block.writeShort(__io__address + 212, swap);
		}
	}

	/**
	 * Get method for struct member 'overlap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, set for indicate drawing overlapped </p>
	 * @see #__DNA__FIELD__overlap
	 */
	
	public short getOverlap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 234);
		} else {
			return __io__block.readShort(__io__address + 214);
		}
	}

	/**
	 * Set method for struct member 'overlap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, set for indicate drawing overlapped </p>
	 * @see #__DNA__FIELD__overlap
	 */
	
	public void setOverlap(short overlap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 234, overlap);
		} else {
			__io__block.writeShort(__io__address + 214, overlap);
		}
	}

	/**
	 * Get method for struct member 'flagfullscreen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary copy of flag settings for clean fullscreen </p>
	 * @see #__DNA__FIELD__flagfullscreen
	 */
	
	public short getFlagfullscreen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 236);
		} else {
			return __io__block.readShort(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'flagfullscreen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary copy of flag settings for clean fullscreen </p>
	 * @see #__DNA__FIELD__flagfullscreen
	 */
	
	public void setFlagfullscreen(short flagfullscreen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 236, flagfullscreen);
		} else {
			__io__block.writeShort(__io__address + 216, flagfullscreen);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public short getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 238);
		} else {
			return __io__block.readShort(__io__address + 218);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(short pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 238, pad);
		} else {
			__io__block.writeShort(__io__address + 218, pad);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> callbacks for this region type </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public CPointer<Object> getType() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 220);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> callbacks for this region type </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(CPointer<Object> type) throws IOException
	{
		long __address = ((type == null) ? 0 : type.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 240, __address);
		} else {
			__io__block.writeLong(__io__address + 220, __address);
		}
	}

	/**
	 * Get method for struct member 'uiblocks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> uiBlock </p>
	 * @see #__DNA__FIELD__uiblocks
	 */
	
	public ListBase getUiblocks() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 248, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 224, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uiblocks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> uiBlock </p>
	 * @see #__DNA__FIELD__uiblocks
	 */
	
	public void setUiblocks(ListBase uiblocks) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 224;
		}
		if (__io__equals(uiblocks, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uiblocks)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uiblocks);
		} else {
			__io__generic__copy( getUiblocks(), uiblocks);
		}
	}

	/**
	 * Get method for struct member 'panels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  </p>
	 * @see #__DNA__FIELD__panels
	 */
	
	public ListBase getPanels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 264, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 232, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'panels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  </p>
	 * @see #__DNA__FIELD__panels
	 */
	
	public void setPanels(ListBase panels) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 264;
		} else {
			__dna__offset = 232;
		}
		if (__io__equals(panels, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, panels)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, panels);
		} else {
			__io__generic__copy( getPanels(), panels);
		}
	}

	/**
	 * Get method for struct member 'panels_category_active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stack of panel categories </p>
	 * @see #__DNA__FIELD__panels_category_active
	 */
	
	public ListBase getPanels_category_active() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 280, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 240, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'panels_category_active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stack of panel categories </p>
	 * @see #__DNA__FIELD__panels_category_active
	 */
	
	public void setPanels_category_active(ListBase panels_category_active) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 280;
		} else {
			__dna__offset = 240;
		}
		if (__io__equals(panels_category_active, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, panels_category_active)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, panels_category_active);
		} else {
			__io__generic__copy( getPanels_category_active(), panels_category_active);
		}
	}

	/**
	 * Get method for struct member 'ui_lists'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link uiList}  </p>
	 * @see #__DNA__FIELD__ui_lists
	 */
	
	public ListBase getUi_lists() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 296, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 248, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ui_lists'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link uiList}  </p>
	 * @see #__DNA__FIELD__ui_lists
	 */
	
	public void setUi_lists(ListBase ui_lists) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 296;
		} else {
			__dna__offset = 248;
		}
		if (__io__equals(ui_lists, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ui_lists)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ui_lists);
		} else {
			__io__generic__copy( getUi_lists(), ui_lists);
		}
	}

	/**
	 * Get method for struct member 'ui_previews'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link uiPreview}  </p>
	 * @see #__DNA__FIELD__ui_previews
	 */
	
	public ListBase getUi_previews() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 312, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 256, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ui_previews'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link uiPreview}  </p>
	 * @see #__DNA__FIELD__ui_previews
	 */
	
	public void setUi_previews(ListBase ui_previews) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 312;
		} else {
			__dna__offset = 256;
		}
		if (__io__equals(ui_previews, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ui_previews)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ui_previews);
		} else {
			__io__generic__copy( getUi_previews(), ui_previews);
		}
	}

	/**
	 * Get method for struct member 'handlers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> wmEventHandler </p>
	 * @see #__DNA__FIELD__handlers
	 */
	
	public ListBase getHandlers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 328, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 264, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handlers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> wmEventHandler </p>
	 * @see #__DNA__FIELD__handlers
	 */
	
	public void setHandlers(ListBase handlers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 328;
		} else {
			__dna__offset = 264;
		}
		if (__io__equals(handlers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handlers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handlers);
		} else {
			__io__generic__copy( getHandlers(), handlers);
		}
	}

	/**
	 * Get method for struct member 'panels_category'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  categories runtime </p>
	 * @see #__DNA__FIELD__panels_category
	 */
	
	public ListBase getPanels_category() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 344, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 272, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'panels_category'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  categories runtime </p>
	 * @see #__DNA__FIELD__panels_category
	 */
	
	public void setPanels_category(ListBase panels_category) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 344;
		} else {
			__dna__offset = 272;
		}
		if (__io__equals(panels_category, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, panels_category)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, panels_category);
		} else {
			__io__generic__copy( getPanels_category(), panels_category);
		}
	}

	/**
	 * Get method for struct member 'regiontimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> blend in/out </p>
	 * @see #__DNA__FIELD__regiontimer
	 */
	
	public CPointer<Object> getRegiontimer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 360);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'regiontimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> blend in/out </p>
	 * @see #__DNA__FIELD__regiontimer
	 */
	
	public void setRegiontimer(CPointer<Object> regiontimer) throws IOException
	{
		long __address = ((regiontimer == null) ? 0 : regiontimer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 360, __address);
		} else {
			__io__block.writeLong(__io__address + 280, __address);
		}
	}

	/**
	 * Get method for struct member 'headerstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> use this string to draw info </p>
	 * @see #__DNA__FIELD__headerstr
	 */
	
	public CPointer<Byte> getHeaderstr() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 368);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 284);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'headerstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> use this string to draw info </p>
	 * @see #__DNA__FIELD__headerstr
	 */
	
	public void setHeaderstr(CPointer<Byte> headerstr) throws IOException
	{
		long __address = ((headerstr == null) ? 0 : headerstr.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 368, __address);
		} else {
			__io__block.writeLong(__io__address + 284, __address);
		}
	}

	/**
	 * Get method for struct member 'regiondata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX 2.50, need spacedata equivalent? </p>
	 * @see #__DNA__FIELD__regiondata
	 */
	
	public CPointer<Object> getRegiondata() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'regiondata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX 2.50, need spacedata equivalent? </p>
	 * @see #__DNA__FIELD__regiondata
	 */
	
	public void setRegiondata(CPointer<Object> regiondata) throws IOException
	{
		long __address = ((regiondata == null) ? 0 : regiondata.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 376, __address);
		} else {
			__io__block.writeLong(__io__address + 288, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ARegion> __io__addressof() {
		return new CPointer<ARegion>(__io__address, new Class[]{ARegion.class}, __io__block, __io__blockTable);
	}

}
