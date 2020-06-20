package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bScreen'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=200, size64=288)
public class bScreen extends CFacade {

	/**
	 * This is the sdna index of the struct bScreen.
	 * <p>
	 * It is required when allocating a new block to store data for bScreen.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 266;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 128/160</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'vertbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TODO Should become {@link ScrAreaMap}  now. ** NOTE: KEEP ORDER IN SYNC WITH ScrAreaMap! (see AREAMAP_FROM_SCREEN macro above) ** Screens have vertices/edges to define areas. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__vertbase);
	 * CPointer&lt;ListBase&gt; p_vertbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertbase = new long[]{128, 160};

	/**
	 * Field descriptor (offset) for struct member 'edgebase'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__edgebase);
	 * CPointer&lt;ListBase&gt; p_edgebase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edgebase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edgebase = new long[]{136, 176};

	/**
	 * Field descriptor (offset) for struct member 'areabase'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__areabase);
	 * CPointer&lt;ListBase&gt; p_areabase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'areabase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__areabase = new long[]{144, 192};

	/**
	 * Field descriptor (offset) for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Screen level regions (menus), runtime only. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__regionbase);
	 * CPointer&lt;ListBase&gt; p_regionbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'regionbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__regionbase = new long[]{152, 208};

	/**
	 * Field descriptor (offset) for struct member 'scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__scene);
	 * CPointer&lt;CPointer&lt;Scene&gt;&gt; p_scene = p.cast(new Class[]{CPointer.class, Scene.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scene'</li>
	 * <li>Signature: 'Scene*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scene = new long[]{160, 224};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{164, 232};

	/**
	 * Field descriptor (offset) for struct member 'winid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Winid from WM, starts with 1. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__winid);
	 * CPointer&lt;Short&gt; p_winid = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'winid'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__winid = new long[]{166, 234};

	/**
	 * Field descriptor (offset) for struct member 'redraws_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-setting for which editors get redrawn during anim playback. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__redraws_flag);
	 * CPointer&lt;Short&gt; p_redraws_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'redraws_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__redraws_flag = new long[]{168, 236};

	/**
	 * Field descriptor (offset) for struct member 'temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp screen in a temp window, don't save (like user prefs). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__temp);
	 * CPointer&lt;Byte&gt; p_temp = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'temp'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__temp = new long[]{170, 238};

	/**
	 * Field descriptor (offset) for struct member 'state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp screen for image render display or fileselect. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__state);
	 * CPointer&lt;Byte&gt; p_state = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'state'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__state = new long[]{171, 239};

	/**
	 * Field descriptor (offset) for struct member 'do_draw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for drawing edges. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__do_draw);
	 * CPointer&lt;Byte&gt; p_do_draw = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'do_draw'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__do_draw = new long[]{172, 240};

	/**
	 * Field descriptor (offset) for struct member 'do_refresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for scale screen, changed screen, etc. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__do_refresh);
	 * CPointer&lt;Byte&gt; p_do_refresh = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'do_refresh'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__do_refresh = new long[]{173, 241};

	/**
	 * Field descriptor (offset) for struct member 'do_draw_gesture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for gesture draw. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__do_draw_gesture);
	 * CPointer&lt;Byte&gt; p_do_draw_gesture = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'do_draw_gesture'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__do_draw_gesture = new long[]{174, 242};

	/**
	 * Field descriptor (offset) for struct member 'do_draw_paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for paint cursor draw. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__do_draw_paintcursor);
	 * CPointer&lt;Byte&gt; p_do_draw_paintcursor = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'do_draw_paintcursor'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__do_draw_paintcursor = new long[]{175, 243};

	/**
	 * Field descriptor (offset) for struct member 'do_draw_drag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for dragging draw. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__do_draw_drag);
	 * CPointer&lt;Byte&gt; p_do_draw_drag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'do_draw_drag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__do_draw_drag = new long[]{176, 244};

	/**
	 * Field descriptor (offset) for struct member 'skip_handling'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set to delay screen handling after switching back from maximized area. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__skip_handling);
	 * CPointer&lt;Byte&gt; p_skip_handling = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skip_handling'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skip_handling = new long[]{177, 245};

	/**
	 * Field descriptor (offset) for struct member 'scrubbing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set when scrubbing to avoid some costly updates. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__scrubbing);
	 * CPointer&lt;Byte&gt; p_scrubbing = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scrubbing'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scrubbing = new long[]{178, 246};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{179, 247};

	/**
	 * Field descriptor (offset) for struct member 'active_region'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active region that has mouse focus. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__active_region);
	 * CPointer&lt;CPointer&lt;ARegion&gt;&gt; p_active_region = p.cast(new Class[]{CPointer.class, ARegion.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_region'</li>
	 * <li>Signature: 'ARegion*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_region = new long[]{180, 248};

	/**
	 * Field descriptor (offset) for struct member 'animtimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If set, screen has timer handler added in window. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__animtimer);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_animtimer = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'animtimer'</li>
	 * <li>Signature: 'wmTimer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__animtimer = new long[]{184, 256};

	/**
	 * Field descriptor (offset) for struct member 'context'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Context callback. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__context);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_context = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'context'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__context = new long[]{188, 264};

	/**
	 * Field descriptor (offset) for struct member 'tool_tip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__tool_tip);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tool_tip = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tool_tip'</li>
	 * <li>Signature: 'wmTooltipState*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tool_tip = new long[]{192, 272};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__preview);
	 * CPointer&lt;CPointer&lt;PreviewImage&gt;&gt; p_preview = p.cast(new Class[]{CPointer.class, PreviewImage.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview'</li>
	 * <li>Signature: 'PreviewImage*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview = new long[]{196, 280};

	public bScreen(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bScreen(bScreen that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
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
	 * Get method for struct member 'vertbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TODO Should become {@link ScrAreaMap}  now. ** NOTE: KEEP ORDER IN SYNC WITH ScrAreaMap! (see AREAMAP_FROM_SCREEN macro above) ** Screens have vertices/edges to define areas. </p>
	 * @see #__DNA__FIELD__vertbase
	 */
	
	public ListBase getVertbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 160, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 128, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vertbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> TODO Should become {@link ScrAreaMap}  now. ** NOTE: KEEP ORDER IN SYNC WITH ScrAreaMap! (see AREAMAP_FROM_SCREEN macro above) ** Screens have vertices/edges to define areas. </p>
	 * @see #__DNA__FIELD__vertbase
	 */
	
	public void setVertbase(ListBase vertbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 128;
		}
		if (__io__equals(vertbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vertbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vertbase);
		} else {
			__io__generic__copy( getVertbase(), vertbase);
		}
	}

	/**
	 * Get method for struct member 'edgebase'.
	 * @see #__DNA__FIELD__edgebase
	 */
	
	public ListBase getEdgebase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 176, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 136, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'edgebase'.
	 * @see #__DNA__FIELD__edgebase
	 */
	
	public void setEdgebase(ListBase edgebase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 176;
		} else {
			__dna__offset = 136;
		}
		if (__io__equals(edgebase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, edgebase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, edgebase);
		} else {
			__io__generic__copy( getEdgebase(), edgebase);
		}
	}

	/**
	 * Get method for struct member 'areabase'.
	 * @see #__DNA__FIELD__areabase
	 */
	
	public ListBase getAreabase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 192, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 144, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'areabase'.
	 * @see #__DNA__FIELD__areabase
	 */
	
	public void setAreabase(ListBase areabase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 144;
		}
		if (__io__equals(areabase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, areabase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, areabase);
		} else {
			__io__generic__copy( getAreabase(), areabase);
		}
	}

	/**
	 * Get method for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Screen level regions (menus), runtime only. </p>
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public ListBase getRegionbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 208, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 152, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Screen level regions (menus), runtime only. </p>
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public void setRegionbase(ListBase regionbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 152;
		}
		if (__io__equals(regionbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, regionbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, regionbase);
		} else {
			__io__generic__copy( getRegionbase(), regionbase);
		}
	}

	/**
	 * Get method for struct member 'scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__scene
	 */
	
	public CPointer<Scene> getScene() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Scene.class};
		return new CPointer<Scene>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Scene.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__scene
	 */
	
	public void setScene(CPointer<Scene> scene) throws IOException
	{
		long __address = ((scene == null) ? 0 : scene.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 160, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 232);
		} else {
			return __io__block.readShort(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 232, flag);
		} else {
			__io__block.writeShort(__io__address + 164, flag);
		}
	}

	/**
	 * Get method for struct member 'winid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Winid from WM, starts with 1. </p>
	 * @see #__DNA__FIELD__winid
	 */
	
	public short getWinid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 234);
		} else {
			return __io__block.readShort(__io__address + 166);
		}
	}

	/**
	 * Set method for struct member 'winid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Winid from WM, starts with 1. </p>
	 * @see #__DNA__FIELD__winid
	 */
	
	public void setWinid(short winid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 234, winid);
		} else {
			__io__block.writeShort(__io__address + 166, winid);
		}
	}

	/**
	 * Get method for struct member 'redraws_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-setting for which editors get redrawn during anim playback. </p>
	 * @see #__DNA__FIELD__redraws_flag
	 */
	
	public short getRedraws_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 236);
		} else {
			return __io__block.readShort(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'redraws_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-setting for which editors get redrawn during anim playback. </p>
	 * @see #__DNA__FIELD__redraws_flag
	 */
	
	public void setRedraws_flag(short redraws_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 236, redraws_flag);
		} else {
			__io__block.writeShort(__io__address + 168, redraws_flag);
		}
	}

	/**
	 * Get method for struct member 'temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp screen in a temp window, don't save (like user prefs). </p>
	 * @see #__DNA__FIELD__temp
	 */
	
	public byte getTemp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 238);
		} else {
			return __io__block.readByte(__io__address + 170);
		}
	}

	/**
	 * Set method for struct member 'temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp screen in a temp window, don't save (like user prefs). </p>
	 * @see #__DNA__FIELD__temp
	 */
	
	public void setTemp(byte temp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 238, temp);
		} else {
			__io__block.writeByte(__io__address + 170, temp);
		}
	}

	/**
	 * Get method for struct member 'state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp screen for image render display or fileselect. </p>
	 * @see #__DNA__FIELD__state
	 */
	
	public byte getState() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 239);
		} else {
			return __io__block.readByte(__io__address + 171);
		}
	}

	/**
	 * Set method for struct member 'state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp screen for image render display or fileselect. </p>
	 * @see #__DNA__FIELD__state
	 */
	
	public void setState(byte state) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 239, state);
		} else {
			__io__block.writeByte(__io__address + 171, state);
		}
	}

	/**
	 * Get method for struct member 'do_draw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for drawing edges. </p>
	 * @see #__DNA__FIELD__do_draw
	 */
	
	public byte getDo_draw() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 240);
		} else {
			return __io__block.readByte(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'do_draw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for drawing edges. </p>
	 * @see #__DNA__FIELD__do_draw
	 */
	
	public void setDo_draw(byte do_draw) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 240, do_draw);
		} else {
			__io__block.writeByte(__io__address + 172, do_draw);
		}
	}

	/**
	 * Get method for struct member 'do_refresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for scale screen, changed screen, etc. </p>
	 * @see #__DNA__FIELD__do_refresh
	 */
	
	public byte getDo_refresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 241);
		} else {
			return __io__block.readByte(__io__address + 173);
		}
	}

	/**
	 * Set method for struct member 'do_refresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for scale screen, changed screen, etc. </p>
	 * @see #__DNA__FIELD__do_refresh
	 */
	
	public void setDo_refresh(byte do_refresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 241, do_refresh);
		} else {
			__io__block.writeByte(__io__address + 173, do_refresh);
		}
	}

	/**
	 * Get method for struct member 'do_draw_gesture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for gesture draw. </p>
	 * @see #__DNA__FIELD__do_draw_gesture
	 */
	
	public byte getDo_draw_gesture() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 242);
		} else {
			return __io__block.readByte(__io__address + 174);
		}
	}

	/**
	 * Set method for struct member 'do_draw_gesture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for gesture draw. </p>
	 * @see #__DNA__FIELD__do_draw_gesture
	 */
	
	public void setDo_draw_gesture(byte do_draw_gesture) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 242, do_draw_gesture);
		} else {
			__io__block.writeByte(__io__address + 174, do_draw_gesture);
		}
	}

	/**
	 * Get method for struct member 'do_draw_paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for paint cursor draw. </p>
	 * @see #__DNA__FIELD__do_draw_paintcursor
	 */
	
	public byte getDo_draw_paintcursor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 243);
		} else {
			return __io__block.readByte(__io__address + 175);
		}
	}

	/**
	 * Set method for struct member 'do_draw_paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for paint cursor draw. </p>
	 * @see #__DNA__FIELD__do_draw_paintcursor
	 */
	
	public void setDo_draw_paintcursor(byte do_draw_paintcursor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 243, do_draw_paintcursor);
		} else {
			__io__block.writeByte(__io__address + 175, do_draw_paintcursor);
		}
	}

	/**
	 * Get method for struct member 'do_draw_drag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for dragging draw. </p>
	 * @see #__DNA__FIELD__do_draw_drag
	 */
	
	public byte getDo_draw_drag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 244);
		} else {
			return __io__block.readByte(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'do_draw_drag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Notifier for dragging draw. </p>
	 * @see #__DNA__FIELD__do_draw_drag
	 */
	
	public void setDo_draw_drag(byte do_draw_drag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 244, do_draw_drag);
		} else {
			__io__block.writeByte(__io__address + 176, do_draw_drag);
		}
	}

	/**
	 * Get method for struct member 'skip_handling'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set to delay screen handling after switching back from maximized area. </p>
	 * @see #__DNA__FIELD__skip_handling
	 */
	
	public byte getSkip_handling() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 245);
		} else {
			return __io__block.readByte(__io__address + 177);
		}
	}

	/**
	 * Set method for struct member 'skip_handling'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set to delay screen handling after switching back from maximized area. </p>
	 * @see #__DNA__FIELD__skip_handling
	 */
	
	public void setSkip_handling(byte skip_handling) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 245, skip_handling);
		} else {
			__io__block.writeByte(__io__address + 177, skip_handling);
		}
	}

	/**
	 * Get method for struct member 'scrubbing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set when scrubbing to avoid some costly updates. </p>
	 * @see #__DNA__FIELD__scrubbing
	 */
	
	public byte getScrubbing() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 246);
		} else {
			return __io__block.readByte(__io__address + 178);
		}
	}

	/**
	 * Set method for struct member 'scrubbing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set when scrubbing to avoid some costly updates. </p>
	 * @see #__DNA__FIELD__scrubbing
	 */
	
	public void setScrubbing(byte scrubbing) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 246, scrubbing);
		} else {
			__io__block.writeByte(__io__address + 178, scrubbing);
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
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 247, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 179, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 247;
		} else {
			__dna__offset = 179;
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
	 * Get method for struct member 'active_region'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active region that has mouse focus. </p>
	 * @see #__DNA__FIELD__active_region
	 */
	
	public CPointer<ARegion> getActive_region() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 180);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ARegion.class};
		return new CPointer<ARegion>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ARegion.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'active_region'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active region that has mouse focus. </p>
	 * @see #__DNA__FIELD__active_region
	 */
	
	public void setActive_region(CPointer<ARegion> active_region) throws IOException
	{
		long __address = ((active_region == null) ? 0 : active_region.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 248, __address);
		} else {
			__io__block.writeLong(__io__address + 180, __address);
		}
	}

	/**
	 * Get method for struct member 'animtimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If set, screen has timer handler added in window. </p>
	 * @see #__DNA__FIELD__animtimer
	 */
	
	public CPointer<Object> getAnimtimer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'animtimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If set, screen has timer handler added in window. </p>
	 * @see #__DNA__FIELD__animtimer
	 */
	
	public void setAnimtimer(CPointer<Object> animtimer) throws IOException
	{
		long __address = ((animtimer == null) ? 0 : animtimer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 256, __address);
		} else {
			__io__block.writeLong(__io__address + 184, __address);
		}
	}

	/**
	 * Get method for struct member 'context'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Context callback. </p>
	 * @see #__DNA__FIELD__context
	 */
	
	public CPointer<Object> getContext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 264);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 188);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'context'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Context callback. </p>
	 * @see #__DNA__FIELD__context
	 */
	
	public void setContext(CPointer<Object> context) throws IOException
	{
		long __address = ((context == null) ? 0 : context.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 264, __address);
		} else {
			__io__block.writeLong(__io__address + 188, __address);
		}
	}

	/**
	 * Get method for struct member 'tool_tip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. </p>
	 * @see #__DNA__FIELD__tool_tip
	 */
	
	public CPointer<Object> getTool_tip() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tool_tip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. </p>
	 * @see #__DNA__FIELD__tool_tip
	 */
	
	public void setTool_tip(CPointer<Object> tool_tip) throws IOException
	{
		long __address = ((tool_tip == null) ? 0 : tool_tip.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 272, __address);
		} else {
			__io__block.writeLong(__io__address + 192, __address);
		}
	}

	/**
	 * Get method for struct member 'preview'.
	 * @see #__DNA__FIELD__preview
	 */
	
	public CPointer<PreviewImage> getPreview() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 196);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PreviewImage.class};
		return new CPointer<PreviewImage>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PreviewImage.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'preview'.
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(CPointer<PreviewImage> preview) throws IOException
	{
		long __address = ((preview == null) ? 0 : preview.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 280, __address);
		} else {
			__io__block.writeLong(__io__address + 196, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bScreen> __io__addressof() {
		return new CPointer<bScreen>(__io__address, new Class[]{bScreen.class}, __io__block, __io__blockTable);
	}

}
