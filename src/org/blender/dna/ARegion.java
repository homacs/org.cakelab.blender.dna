package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ARegion'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=320, size64=424)
public class ARegion extends CFacade {

	/**
	 * This is the sdna index of the struct ARegion.
	 * <p>
	 * It is required when allocating a new block to store data for ARegion.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 312;

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
	 * <h4>Blender Source Code</h4>
	 * <p> 2D-View scrolling/zoom info (most regions are 2d anyways). </p>
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
	 * <li>Actual Size (32bit/64bit): 144/152</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v2d = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'winrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Coordinates of region. </p>
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
	public static final long[] __DNA__FIELD__winrct = new long[]{152, 168};

	/**
	 * Field descriptor (offset) for struct member 'drawrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime for partial redraw, same or smaller than winrct. </p>
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
	public static final long[] __DNA__FIELD__drawrct = new long[]{168, 184};

	/**
	 * Field descriptor (offset) for struct member 'winx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Size. </p>
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
	public static final long[] __DNA__FIELD__winx = new long[]{184, 200};

	/**
	 * Field descriptor (offset) for struct member 'winy'.
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
	public static final long[] __DNA__FIELD__winy = new long[]{186, 202};

	/**
	 * Field descriptor (offset) for struct member 'visible'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Region is currently visible on screen. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__visible);
	 * CPointer&lt;Short&gt; p_visible = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'visible'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__visible = new long[]{188, 204};

	/**
	 * Field descriptor (offset) for struct member 'regiontype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Window, header, etc. identifier for drawing. </p>
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
	public static final long[] __DNA__FIELD__regiontype = new long[]{190, 206};

	/**
	 * Field descriptor (offset) for struct member 'alignment'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> How it should split. </p>
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
	public static final long[] __DNA__FIELD__alignment = new long[]{192, 208};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Hide, .... </p>
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
	public static final long[] __DNA__FIELD__flag = new long[]{194, 210};

	/**
	 * Field descriptor (offset) for struct member 'sizex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code> . However to get the current region size, you should usually use winx/winy from above, not this! </p>
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
	public static final long[] __DNA__FIELD__sizex = new long[]{196, 212};

	/**
	 * Field descriptor (offset) for struct member 'sizey'.
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
	public static final long[] __DNA__FIELD__sizey = new long[]{198, 214};

	/**
	 * Field descriptor (offset) for struct member 'do_draw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Private, cached notifier events. </p>
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
	public static final long[] __DNA__FIELD__do_draw = new long[]{200, 216};

	/**
	 * Field descriptor (offset) for struct member 'do_draw_paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Private, cached notifier events. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__do_draw_paintcursor);
	 * CPointer&lt;Short&gt; p_do_draw_paintcursor = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'do_draw_paintcursor'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__do_draw_paintcursor = new long[]{202, 218};

	/**
	 * Field descriptor (offset) for struct member 'overlap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Private, set for indicate drawing overlapped. </p>
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
	public static final long[] __DNA__FIELD__overlap = new long[]{204, 220};

	/**
	 * Field descriptor (offset) for struct member 'flagfullscreen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temporary copy of flag settings for clean fullscreen. </p>
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
	public static final long[] __DNA__FIELD__flagfullscreen = new long[]{206, 222};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Callbacks for this region type. </p>
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
	public static final long[] __DNA__FIELD__type = new long[]{208, 224};

	/**
	 * Field descriptor (offset) for struct member 'uiblocks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #uiBlock. </p>
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
	public static final long[] __DNA__FIELD__uiblocks = new long[]{212, 232};

	/**
	 * Field descriptor (offset) for struct member 'panels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Panel} . </p>
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
	public static final long[] __DNA__FIELD__panels = new long[]{220, 248};

	/**
	 * Field descriptor (offset) for struct member 'panels_category_active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stack of panel categories. </p>
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
	public static final long[] __DNA__FIELD__panels_category_active = new long[]{228, 264};

	/**
	 * Field descriptor (offset) for struct member 'ui_lists'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link uiList} . </p>
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
	public static final long[] __DNA__FIELD__ui_lists = new long[]{236, 280};

	/**
	 * Field descriptor (offset) for struct member 'ui_previews'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link uiPreview} . </p>
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
	public static final long[] __DNA__FIELD__ui_previews = new long[]{244, 296};

	/**
	 * Field descriptor (offset) for struct member 'handlers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #wmEventHandler. </p>
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
	public static final long[] __DNA__FIELD__handlers = new long[]{252, 312};

	/**
	 * Field descriptor (offset) for struct member 'panels_category'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Panel}  categories runtime. </p>
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
	public static final long[] __DNA__FIELD__panels_category = new long[]{260, 328};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_map'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Gizmo-map of this region. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__gizmo_map);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_gizmo_map = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_map'</li>
	 * <li>Signature: 'wmGizmoMap*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_map = new long[]{268, 344};

	/**
	 * Field descriptor (offset) for struct member 'regiontimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Blend in/out. </p>
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
	public static final long[] __DNA__FIELD__regiontimer = new long[]{272, 352};

	/**
	 * Field descriptor (offset) for struct member 'draw_buffer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__draw_buffer);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_draw_buffer = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_buffer'</li>
	 * <li>Signature: 'wmDrawBuffer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_buffer = new long[]{276, 360};

	/**
	 * Field descriptor (offset) for struct member 'headerstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use this string to draw info. </p>
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
	public static final long[] __DNA__FIELD__headerstr = new long[]{280, 368};

	/**
	 * Field descriptor (offset) for struct member 'regiondata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__regiondata = new long[]{284, 376};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ARegion aregion = ...;
	 * CPointer&lt;Object&gt; p = aregion.__dna__addressof(ARegion.__DNA__FIELD__runtime);
	 * CPointer&lt;ARegion_Runtime&gt; p_runtime = p.cast(new Class[]{ARegion_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'ARegion_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 32/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{288, 384};

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
	 * <h4>Blender Source Code</h4>
	 * <p> 2D-View scrolling/zoom info (most regions are 2d anyways). </p>
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
	 * <h4>Blender Source Code</h4>
	 * <p> 2D-View scrolling/zoom info (most regions are 2d anyways). </p>
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
	 * <h4>Blender Source Code</h4>
	 * <p> Coordinates of region. </p>
	 * @see #__DNA__FIELD__winrct
	 */
	
	public rcti getWinrct() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rcti(__io__address + 168, __io__block, __io__blockTable);
		} else {
			return new rcti(__io__address + 152, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'winrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Coordinates of region. </p>
	 * @see #__DNA__FIELD__winrct
	 */
	
	public void setWinrct(rcti winrct) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 152;
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
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime for partial redraw, same or smaller than winrct. </p>
	 * @see #__DNA__FIELD__drawrct
	 */
	
	public rcti getDrawrct() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rcti(__io__address + 184, __io__block, __io__blockTable);
		} else {
			return new rcti(__io__address + 168, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drawrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime for partial redraw, same or smaller than winrct. </p>
	 * @see #__DNA__FIELD__drawrct
	 */
	
	public void setDrawrct(rcti drawrct) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 168;
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Size. </p>
	 * @see #__DNA__FIELD__winx
	 */
	
	public short getWinx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 200);
		} else {
			return __io__block.readShort(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'winx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Size. </p>
	 * @see #__DNA__FIELD__winx
	 */
	
	public void setWinx(short winx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 200, winx);
		} else {
			__io__block.writeShort(__io__address + 184, winx);
		}
	}

	/**
	 * Get method for struct member 'winy'.
	 * @see #__DNA__FIELD__winy
	 */
	
	public short getWiny() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 202);
		} else {
			return __io__block.readShort(__io__address + 186);
		}
	}

	/**
	 * Set method for struct member 'winy'.
	 * @see #__DNA__FIELD__winy
	 */
	
	public void setWiny(short winy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 202, winy);
		} else {
			__io__block.writeShort(__io__address + 186, winy);
		}
	}

	/**
	 * Get method for struct member 'visible'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Region is currently visible on screen. </p>
	 * @see #__DNA__FIELD__visible
	 */
	
	public short getVisible() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 204);
		} else {
			return __io__block.readShort(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'visible'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Region is currently visible on screen. </p>
	 * @see #__DNA__FIELD__visible
	 */
	
	public void setVisible(short visible) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 204, visible);
		} else {
			__io__block.writeShort(__io__address + 188, visible);
		}
	}

	/**
	 * Get method for struct member 'regiontype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Window, header, etc. identifier for drawing. </p>
	 * @see #__DNA__FIELD__regiontype
	 */
	
	public short getRegiontype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 206);
		} else {
			return __io__block.readShort(__io__address + 190);
		}
	}

	/**
	 * Set method for struct member 'regiontype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Window, header, etc. identifier for drawing. </p>
	 * @see #__DNA__FIELD__regiontype
	 */
	
	public void setRegiontype(short regiontype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 206, regiontype);
		} else {
			__io__block.writeShort(__io__address + 190, regiontype);
		}
	}

	/**
	 * Get method for struct member 'alignment'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> How it should split. </p>
	 * @see #__DNA__FIELD__alignment
	 */
	
	public short getAlignment() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 208);
		} else {
			return __io__block.readShort(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'alignment'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> How it should split. </p>
	 * @see #__DNA__FIELD__alignment
	 */
	
	public void setAlignment(short alignment) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 208, alignment);
		} else {
			__io__block.writeShort(__io__address + 192, alignment);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Hide, .... </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 210);
		} else {
			return __io__block.readShort(__io__address + 194);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Hide, .... </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 210, flag);
		} else {
			__io__block.writeShort(__io__address + 194, flag);
		}
	}

	/**
	 * Get method for struct member 'sizex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code> . However to get the current region size, you should usually use winx/winy from above, not this! </p>
	 * @see #__DNA__FIELD__sizex
	 */
	
	public short getSizex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 212);
		} else {
			return __io__block.readShort(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'sizex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code> . However to get the current region size, you should usually use winx/winy from above, not this! </p>
	 * @see #__DNA__FIELD__sizex
	 */
	
	public void setSizex(short sizex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 212, sizex);
		} else {
			__io__block.writeShort(__io__address + 196, sizex);
		}
	}

	/**
	 * Get method for struct member 'sizey'.
	 * @see #__DNA__FIELD__sizey
	 */
	
	public short getSizey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 214);
		} else {
			return __io__block.readShort(__io__address + 198);
		}
	}

	/**
	 * Set method for struct member 'sizey'.
	 * @see #__DNA__FIELD__sizey
	 */
	
	public void setSizey(short sizey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 214, sizey);
		} else {
			__io__block.writeShort(__io__address + 198, sizey);
		}
	}

	/**
	 * Get method for struct member 'do_draw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Private, cached notifier events. </p>
	 * @see #__DNA__FIELD__do_draw
	 */
	
	public short getDo_draw() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 216);
		} else {
			return __io__block.readShort(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'do_draw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Private, cached notifier events. </p>
	 * @see #__DNA__FIELD__do_draw
	 */
	
	public void setDo_draw(short do_draw) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 216, do_draw);
		} else {
			__io__block.writeShort(__io__address + 200, do_draw);
		}
	}

	/**
	 * Get method for struct member 'do_draw_paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Private, cached notifier events. </p>
	 * @see #__DNA__FIELD__do_draw_paintcursor
	 */
	
	public short getDo_draw_paintcursor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 218);
		} else {
			return __io__block.readShort(__io__address + 202);
		}
	}

	/**
	 * Set method for struct member 'do_draw_paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Private, cached notifier events. </p>
	 * @see #__DNA__FIELD__do_draw_paintcursor
	 */
	
	public void setDo_draw_paintcursor(short do_draw_paintcursor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 218, do_draw_paintcursor);
		} else {
			__io__block.writeShort(__io__address + 202, do_draw_paintcursor);
		}
	}

	/**
	 * Get method for struct member 'overlap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Private, set for indicate drawing overlapped. </p>
	 * @see #__DNA__FIELD__overlap
	 */
	
	public short getOverlap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 220);
		} else {
			return __io__block.readShort(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'overlap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Private, set for indicate drawing overlapped. </p>
	 * @see #__DNA__FIELD__overlap
	 */
	
	public void setOverlap(short overlap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 220, overlap);
		} else {
			__io__block.writeShort(__io__address + 204, overlap);
		}
	}

	/**
	 * Get method for struct member 'flagfullscreen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temporary copy of flag settings for clean fullscreen. </p>
	 * @see #__DNA__FIELD__flagfullscreen
	 */
	
	public short getFlagfullscreen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 222);
		} else {
			return __io__block.readShort(__io__address + 206);
		}
	}

	/**
	 * Set method for struct member 'flagfullscreen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temporary copy of flag settings for clean fullscreen. </p>
	 * @see #__DNA__FIELD__flagfullscreen
	 */
	
	public void setFlagfullscreen(short flagfullscreen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 222, flagfullscreen);
		} else {
			__io__block.writeShort(__io__address + 206, flagfullscreen);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Callbacks for this region type. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public CPointer<Object> getType() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Callbacks for this region type. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(CPointer<Object> type) throws IOException
	{
		long __address = ((type == null) ? 0 : type.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 208, __address);
		}
	}

	/**
	 * Get method for struct member 'uiblocks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #uiBlock. </p>
	 * @see #__DNA__FIELD__uiblocks
	 */
	
	public ListBase getUiblocks() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 232, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 212, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uiblocks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #uiBlock. </p>
	 * @see #__DNA__FIELD__uiblocks
	 */
	
	public void setUiblocks(ListBase uiblocks) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 232;
		} else {
			__dna__offset = 212;
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
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Panel} . </p>
	 * @see #__DNA__FIELD__panels
	 */
	
	public ListBase getPanels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 248, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 220, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'panels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Panel} . </p>
	 * @see #__DNA__FIELD__panels
	 */
	
	public void setPanels(ListBase panels) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 220;
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
	 * <h4>Blender Source Code</h4>
	 * <p> Stack of panel categories. </p>
	 * @see #__DNA__FIELD__panels_category_active
	 */
	
	public ListBase getPanels_category_active() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 264, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 228, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'panels_category_active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stack of panel categories. </p>
	 * @see #__DNA__FIELD__panels_category_active
	 */
	
	public void setPanels_category_active(ListBase panels_category_active) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 264;
		} else {
			__dna__offset = 228;
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
	 * <h4>Blender Source Code</h4>
	 * <p>{@link uiList} . </p>
	 * @see #__DNA__FIELD__ui_lists
	 */
	
	public ListBase getUi_lists() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 280, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 236, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ui_lists'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link uiList} . </p>
	 * @see #__DNA__FIELD__ui_lists
	 */
	
	public void setUi_lists(ListBase ui_lists) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 280;
		} else {
			__dna__offset = 236;
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
	 * <h4>Blender Source Code</h4>
	 * <p>{@link uiPreview} . </p>
	 * @see #__DNA__FIELD__ui_previews
	 */
	
	public ListBase getUi_previews() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 296, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 244, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ui_previews'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link uiPreview} . </p>
	 * @see #__DNA__FIELD__ui_previews
	 */
	
	public void setUi_previews(ListBase ui_previews) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 296;
		} else {
			__dna__offset = 244;
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
	 * <h4>Blender Source Code</h4>
	 * <p> #wmEventHandler. </p>
	 * @see #__DNA__FIELD__handlers
	 */
	
	public ListBase getHandlers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 312, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 252, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handlers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #wmEventHandler. </p>
	 * @see #__DNA__FIELD__handlers
	 */
	
	public void setHandlers(ListBase handlers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 312;
		} else {
			__dna__offset = 252;
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
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Panel}  categories runtime. </p>
	 * @see #__DNA__FIELD__panels_category
	 */
	
	public ListBase getPanels_category() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 328, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 260, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'panels_category'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Panel}  categories runtime. </p>
	 * @see #__DNA__FIELD__panels_category
	 */
	
	public void setPanels_category(ListBase panels_category) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 328;
		} else {
			__dna__offset = 260;
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
	 * Get method for struct member 'gizmo_map'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Gizmo-map of this region. </p>
	 * @see #__DNA__FIELD__gizmo_map
	 */
	
	public CPointer<Object> getGizmo_map() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 344);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 268);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gizmo_map'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Gizmo-map of this region. </p>
	 * @see #__DNA__FIELD__gizmo_map
	 */
	
	public void setGizmo_map(CPointer<Object> gizmo_map) throws IOException
	{
		long __address = ((gizmo_map == null) ? 0 : gizmo_map.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 344, __address);
		} else {
			__io__block.writeLong(__io__address + 268, __address);
		}
	}

	/**
	 * Get method for struct member 'regiontimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Blend in/out. </p>
	 * @see #__DNA__FIELD__regiontimer
	 */
	
	public CPointer<Object> getRegiontimer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 352);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'regiontimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Blend in/out. </p>
	 * @see #__DNA__FIELD__regiontimer
	 */
	
	public void setRegiontimer(CPointer<Object> regiontimer) throws IOException
	{
		long __address = ((regiontimer == null) ? 0 : regiontimer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 352, __address);
		} else {
			__io__block.writeLong(__io__address + 272, __address);
		}
	}

	/**
	 * Get method for struct member 'draw_buffer'.
	 * @see #__DNA__FIELD__draw_buffer
	 */
	
	public CPointer<Object> getDraw_buffer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 360);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 276);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'draw_buffer'.
	 * @see #__DNA__FIELD__draw_buffer
	 */
	
	public void setDraw_buffer(CPointer<Object> draw_buffer) throws IOException
	{
		long __address = ((draw_buffer == null) ? 0 : draw_buffer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 360, __address);
		} else {
			__io__block.writeLong(__io__address + 276, __address);
		}
	}

	/**
	 * Get method for struct member 'headerstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use this string to draw info. </p>
	 * @see #__DNA__FIELD__headerstr
	 */
	
	public CPointer<Byte> getHeaderstr() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 368);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'headerstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Use this string to draw info. </p>
	 * @see #__DNA__FIELD__headerstr
	 */
	
	public void setHeaderstr(CPointer<Byte> headerstr) throws IOException
	{
		long __address = ((headerstr == null) ? 0 : headerstr.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 368, __address);
		} else {
			__io__block.writeLong(__io__address + 280, __address);
		}
	}

	/**
	 * Get method for struct member 'regiondata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX 2.50, need spacedata equivalent? </p>
	 * @see #__DNA__FIELD__regiondata
	 */
	
	public CPointer<Object> getRegiondata() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 284);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'regiondata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX 2.50, need spacedata equivalent? </p>
	 * @see #__DNA__FIELD__regiondata
	 */
	
	public void setRegiondata(CPointer<Object> regiondata) throws IOException
	{
		long __address = ((regiondata == null) ? 0 : regiondata.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 376, __address);
		} else {
			__io__block.writeLong(__io__address + 284, __address);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public ARegion_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ARegion_Runtime(__io__address + 384, __io__block, __io__blockTable);
		} else {
			return new ARegion_Runtime(__io__address + 288, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(ARegion_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 384;
		} else {
			__dna__offset = 288;
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
	public CPointer<ARegion> __io__addressof() {
		return new CPointer<ARegion>(__io__address, new Class[]{ARegion.class}, __io__block, __io__blockTable);
	}

}
