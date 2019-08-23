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

@CMetaData(size32=172, size64=240)
public class bScreen extends CFacade {

	/**
	 * This is the sdna index of the struct bScreen.
	 * <p>
	 * It is required when allocating a new block to store data for bScreen.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 251;

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
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'vertbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> screens have vertices/edges to define areas </p>
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
	public static final long[] __DNA__FIELD__vertbase = new long[]{100, 120};

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
	public static final long[] __DNA__FIELD__edgebase = new long[]{108, 136};

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
	public static final long[] __DNA__FIELD__areabase = new long[]{116, 152};

	/**
	 * Field descriptor (offset) for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> screen level regions (menus), runtime only </p>
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
	public static final long[] __DNA__FIELD__regionbase = new long[]{124, 168};

	/**
	 * Field descriptor (offset) for struct member 'scene'.
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
	public static final long[] __DNA__FIELD__scene = new long[]{132, 184};

	/**
	 * Field descriptor (offset) for struct member 'newscene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary when switching </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__newscene);
	 * CPointer&lt;CPointer&lt;Scene&gt;&gt; p_newscene = p.cast(new Class[]{CPointer.class, Scene.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'newscene'</li>
	 * <li>Signature: 'Scene*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__newscene = new long[]{136, 192};

	/**
	 * Field descriptor (offset) for struct member 'winid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> winid from WM, starts with 1 </p>
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
	public static final long[] __DNA__FIELD__winid = new long[]{140, 200};

	/**
	 * Field descriptor (offset) for struct member 'redraws_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> user-setting for which editors get redrawn during anim playback (used to be time->redraws) </p>
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
	public static final long[] __DNA__FIELD__redraws_flag = new long[]{142, 202};

	/**
	 * Field descriptor (offset) for struct member 'temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temp screen in a temp window, don't save (like user prefs) </p>
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
	public static final long[] __DNA__FIELD__temp = new long[]{144, 204};

	/**
	 * Field descriptor (offset) for struct member 'state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temp screen for image render display or fileselect </p>
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
	public static final long[] __DNA__FIELD__state = new long[]{145, 205};

	/**
	 * Field descriptor (offset) for struct member 'do_draw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for drawing edges </p>
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
	public static final long[] __DNA__FIELD__do_draw = new long[]{146, 206};

	/**
	 * Field descriptor (offset) for struct member 'do_refresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for scale screen, changed screen, etc </p>
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
	public static final long[] __DNA__FIELD__do_refresh = new long[]{147, 207};

	/**
	 * Field descriptor (offset) for struct member 'do_draw_gesture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for gesture draw. </p>
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
	public static final long[] __DNA__FIELD__do_draw_gesture = new long[]{148, 208};

	/**
	 * Field descriptor (offset) for struct member 'do_draw_paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for paint cursor draw. </p>
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
	public static final long[] __DNA__FIELD__do_draw_paintcursor = new long[]{149, 209};

	/**
	 * Field descriptor (offset) for struct member 'do_draw_drag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for dragging draw. </p>
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
	public static final long[] __DNA__FIELD__do_draw_drag = new long[]{150, 210};

	/**
	 * Field descriptor (offset) for struct member 'swap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indicator to survive swap-exchange systems </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__swap);
	 * CPointer&lt;Byte&gt; p_swap = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'swap'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__swap = new long[]{151, 211};

	/**
	 * Field descriptor (offset) for struct member 'skip_handling'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> set to delay screen handling after switching back from maximized area </p>
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
	public static final long[] __DNA__FIELD__skip_handling = new long[]{152, 212};

	/**
	 * Field descriptor (offset) for struct member 'scrubbing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> set when scrubbing to avoid some costly updates </p>
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
	public static final long[] __DNA__FIELD__scrubbing = new long[]{153, 213};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{154, 214};

	/**
	 * Field descriptor (offset) for struct member 'mainwin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> screensize subwindow, for screenedges and global menus </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__mainwin);
	 * CPointer&lt;Short&gt; p_mainwin = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mainwin'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mainwin = new long[]{160, 220};

	/**
	 * Field descriptor (offset) for struct member 'subwinactive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active subwindow </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bScreen bscreen = ...;
	 * CPointer&lt;Object&gt; p = bscreen.__dna__addressof(bScreen.__DNA__FIELD__subwinactive);
	 * CPointer&lt;Short&gt; p_subwinactive = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subwinactive'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subwinactive = new long[]{162, 222};

	/**
	 * Field descriptor (offset) for struct member 'animtimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if set, screen has timer handler added in window </p>
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
	public static final long[] __DNA__FIELD__animtimer = new long[]{164, 224};

	/**
	 * Field descriptor (offset) for struct member 'context'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> context callback </p>
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
	public static final long[] __DNA__FIELD__context = new long[]{168, 232};

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
	 * <p> screens have vertices/edges to define areas </p>
	 * @see #__DNA__FIELD__vertbase
	 */
	
	public ListBase getVertbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 120, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 100, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vertbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> screens have vertices/edges to define areas </p>
	 * @see #__DNA__FIELD__vertbase
	 */
	
	public void setVertbase(ListBase vertbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 100;
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
			return new ListBase(__io__address + 136, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 108, __io__block, __io__blockTable);
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
			__dna__offset = 136;
		} else {
			__dna__offset = 108;
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
			return new ListBase(__io__address + 152, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 116, __io__block, __io__blockTable);
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
			__dna__offset = 152;
		} else {
			__dna__offset = 116;
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
	 * <p> screen level regions (menus), runtime only </p>
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public ListBase getRegionbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 168, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 124, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> screen level regions (menus), runtime only </p>
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public void setRegionbase(ListBase regionbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 124;
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
	 * @see #__DNA__FIELD__scene
	 */
	
	public CPointer<Scene> getScene() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 132);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Scene.class};
		return new CPointer<Scene>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Scene.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'scene'.
	 * @see #__DNA__FIELD__scene
	 */
	
	public void setScene(CPointer<Scene> scene) throws IOException
	{
		long __address = ((scene == null) ? 0 : scene.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 132, __address);
		}
	}

	/**
	 * Get method for struct member 'newscene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary when switching </p>
	 * @see #__DNA__FIELD__newscene
	 */
	
	public CPointer<Scene> getNewscene() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Scene.class};
		return new CPointer<Scene>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Scene.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'newscene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary when switching </p>
	 * @see #__DNA__FIELD__newscene
	 */
	
	public void setNewscene(CPointer<Scene> newscene) throws IOException
	{
		long __address = ((newscene == null) ? 0 : newscene.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Get method for struct member 'winid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> winid from WM, starts with 1 </p>
	 * @see #__DNA__FIELD__winid
	 */
	
	public short getWinid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 200);
		} else {
			return __io__block.readShort(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'winid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> winid from WM, starts with 1 </p>
	 * @see #__DNA__FIELD__winid
	 */
	
	public void setWinid(short winid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 200, winid);
		} else {
			__io__block.writeShort(__io__address + 140, winid);
		}
	}

	/**
	 * Get method for struct member 'redraws_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> user-setting for which editors get redrawn during anim playback (used to be time->redraws) </p>
	 * @see #__DNA__FIELD__redraws_flag
	 */
	
	public short getRedraws_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 202);
		} else {
			return __io__block.readShort(__io__address + 142);
		}
	}

	/**
	 * Set method for struct member 'redraws_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> user-setting for which editors get redrawn during anim playback (used to be time->redraws) </p>
	 * @see #__DNA__FIELD__redraws_flag
	 */
	
	public void setRedraws_flag(short redraws_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 202, redraws_flag);
		} else {
			__io__block.writeShort(__io__address + 142, redraws_flag);
		}
	}

	/**
	 * Get method for struct member 'temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temp screen in a temp window, don't save (like user prefs) </p>
	 * @see #__DNA__FIELD__temp
	 */
	
	public byte getTemp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 204);
		} else {
			return __io__block.readByte(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temp screen in a temp window, don't save (like user prefs) </p>
	 * @see #__DNA__FIELD__temp
	 */
	
	public void setTemp(byte temp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 204, temp);
		} else {
			__io__block.writeByte(__io__address + 144, temp);
		}
	}

	/**
	 * Get method for struct member 'state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temp screen for image render display or fileselect </p>
	 * @see #__DNA__FIELD__state
	 */
	
	public byte getState() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 205);
		} else {
			return __io__block.readByte(__io__address + 145);
		}
	}

	/**
	 * Set method for struct member 'state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temp screen for image render display or fileselect </p>
	 * @see #__DNA__FIELD__state
	 */
	
	public void setState(byte state) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 205, state);
		} else {
			__io__block.writeByte(__io__address + 145, state);
		}
	}

	/**
	 * Get method for struct member 'do_draw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for drawing edges </p>
	 * @see #__DNA__FIELD__do_draw
	 */
	
	public byte getDo_draw() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 206);
		} else {
			return __io__block.readByte(__io__address + 146);
		}
	}

	/**
	 * Set method for struct member 'do_draw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for drawing edges </p>
	 * @see #__DNA__FIELD__do_draw
	 */
	
	public void setDo_draw(byte do_draw) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 206, do_draw);
		} else {
			__io__block.writeByte(__io__address + 146, do_draw);
		}
	}

	/**
	 * Get method for struct member 'do_refresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for scale screen, changed screen, etc </p>
	 * @see #__DNA__FIELD__do_refresh
	 */
	
	public byte getDo_refresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 207);
		} else {
			return __io__block.readByte(__io__address + 147);
		}
	}

	/**
	 * Set method for struct member 'do_refresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for scale screen, changed screen, etc </p>
	 * @see #__DNA__FIELD__do_refresh
	 */
	
	public void setDo_refresh(byte do_refresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 207, do_refresh);
		} else {
			__io__block.writeByte(__io__address + 147, do_refresh);
		}
	}

	/**
	 * Get method for struct member 'do_draw_gesture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for gesture draw. </p>
	 * @see #__DNA__FIELD__do_draw_gesture
	 */
	
	public byte getDo_draw_gesture() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 208);
		} else {
			return __io__block.readByte(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'do_draw_gesture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for gesture draw. </p>
	 * @see #__DNA__FIELD__do_draw_gesture
	 */
	
	public void setDo_draw_gesture(byte do_draw_gesture) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 208, do_draw_gesture);
		} else {
			__io__block.writeByte(__io__address + 148, do_draw_gesture);
		}
	}

	/**
	 * Get method for struct member 'do_draw_paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for paint cursor draw. </p>
	 * @see #__DNA__FIELD__do_draw_paintcursor
	 */
	
	public byte getDo_draw_paintcursor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 209);
		} else {
			return __io__block.readByte(__io__address + 149);
		}
	}

	/**
	 * Set method for struct member 'do_draw_paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for paint cursor draw. </p>
	 * @see #__DNA__FIELD__do_draw_paintcursor
	 */
	
	public void setDo_draw_paintcursor(byte do_draw_paintcursor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 209, do_draw_paintcursor);
		} else {
			__io__block.writeByte(__io__address + 149, do_draw_paintcursor);
		}
	}

	/**
	 * Get method for struct member 'do_draw_drag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for dragging draw. </p>
	 * @see #__DNA__FIELD__do_draw_drag
	 */
	
	public byte getDo_draw_drag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 210);
		} else {
			return __io__block.readByte(__io__address + 150);
		}
	}

	/**
	 * Set method for struct member 'do_draw_drag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> notifier for dragging draw. </p>
	 * @see #__DNA__FIELD__do_draw_drag
	 */
	
	public void setDo_draw_drag(byte do_draw_drag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 210, do_draw_drag);
		} else {
			__io__block.writeByte(__io__address + 150, do_draw_drag);
		}
	}

	/**
	 * Get method for struct member 'swap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indicator to survive swap-exchange systems </p>
	 * @see #__DNA__FIELD__swap
	 */
	
	public byte getSwap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 211);
		} else {
			return __io__block.readByte(__io__address + 151);
		}
	}

	/**
	 * Set method for struct member 'swap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indicator to survive swap-exchange systems </p>
	 * @see #__DNA__FIELD__swap
	 */
	
	public void setSwap(byte swap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 211, swap);
		} else {
			__io__block.writeByte(__io__address + 151, swap);
		}
	}

	/**
	 * Get method for struct member 'skip_handling'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> set to delay screen handling after switching back from maximized area </p>
	 * @see #__DNA__FIELD__skip_handling
	 */
	
	public byte getSkip_handling() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 212);
		} else {
			return __io__block.readByte(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'skip_handling'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> set to delay screen handling after switching back from maximized area </p>
	 * @see #__DNA__FIELD__skip_handling
	 */
	
	public void setSkip_handling(byte skip_handling) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 212, skip_handling);
		} else {
			__io__block.writeByte(__io__address + 152, skip_handling);
		}
	}

	/**
	 * Get method for struct member 'scrubbing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> set when scrubbing to avoid some costly updates </p>
	 * @see #__DNA__FIELD__scrubbing
	 */
	
	public byte getScrubbing() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 213);
		} else {
			return __io__block.readByte(__io__address + 153);
		}
	}

	/**
	 * Set method for struct member 'scrubbing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> set when scrubbing to avoid some costly updates </p>
	 * @see #__DNA__FIELD__scrubbing
	 */
	
	public void setScrubbing(byte scrubbing) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 213, scrubbing);
		} else {
			__io__block.writeByte(__io__address + 153, scrubbing);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Byte> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 214, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 154, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Byte> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 214;
		} else {
			__dna__offset = 154;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
		}
	}

	/**
	 * Get method for struct member 'mainwin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> screensize subwindow, for screenedges and global menus </p>
	 * @see #__DNA__FIELD__mainwin
	 */
	
	public short getMainwin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 220);
		} else {
			return __io__block.readShort(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'mainwin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> screensize subwindow, for screenedges and global menus </p>
	 * @see #__DNA__FIELD__mainwin
	 */
	
	public void setMainwin(short mainwin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 220, mainwin);
		} else {
			__io__block.writeShort(__io__address + 160, mainwin);
		}
	}

	/**
	 * Get method for struct member 'subwinactive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active subwindow </p>
	 * @see #__DNA__FIELD__subwinactive
	 */
	
	public short getSubwinactive() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 222);
		} else {
			return __io__block.readShort(__io__address + 162);
		}
	}

	/**
	 * Set method for struct member 'subwinactive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active subwindow </p>
	 * @see #__DNA__FIELD__subwinactive
	 */
	
	public void setSubwinactive(short subwinactive) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 222, subwinactive);
		} else {
			__io__block.writeShort(__io__address + 162, subwinactive);
		}
	}

	/**
	 * Get method for struct member 'animtimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if set, screen has timer handler added in window </p>
	 * @see #__DNA__FIELD__animtimer
	 */
	
	public CPointer<Object> getAnimtimer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 164);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'animtimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if set, screen has timer handler added in window </p>
	 * @see #__DNA__FIELD__animtimer
	 */
	
	public void setAnimtimer(CPointer<Object> animtimer) throws IOException
	{
		long __address = ((animtimer == null) ? 0 : animtimer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 164, __address);
		}
	}

	/**
	 * Get method for struct member 'context'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> context callback </p>
	 * @see #__DNA__FIELD__context
	 */
	
	public CPointer<Object> getContext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'context'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> context callback </p>
	 * @see #__DNA__FIELD__context
	 */
	
	public void setContext(CPointer<Object> context) throws IOException
	{
		long __address = ((context == null) ? 0 : context.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 168, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bScreen> __io__addressof() {
		return new CPointer<bScreen>(__io__address, new Class[]{bScreen.class}, __io__block, __io__blockTable);
	}

}
