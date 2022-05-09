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
 * Generated facet for DNA struct type 'wmWindow'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> IME is win32 and apple only! The saveable part, the rest of the data is local in GHOST. </p>
 */

@CMetaData(size32=216, size64=336)
public class wmWindow extends CFacade {

	/**
	 * This is the sdna index of the struct wmWindow.
	 * <p>
	 * It is required when allocating a new block to store data for wmWindow.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 641;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;wmWindow&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, wmWindow.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'wmWindow*'</li>
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
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;wmWindow&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, wmWindow.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'wmWindow*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'ghostwin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Don't want to include ghost.h stuff. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__ghostwin);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_ghostwin = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ghostwin'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ghostwin = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'gpuctx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Don't want to include gpu stuff. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__gpuctx);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_gpuctx = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpuctx'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpuctx = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Parent window. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__parent);
	 * CPointer&lt;CPointer&lt;wmWindow&gt;&gt; p_parent = p.cast(new Class[]{CPointer.class, wmWindow.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent'</li>
	 * <li>Signature: 'wmWindow*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active scene displayed in this window. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__scene);
	 * CPointer&lt;CPointer&lt;Scene&gt;&gt; p_scene = p.cast(new Class[]{CPointer.class, Scene.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scene'</li>
	 * <li>Signature: 'Scene*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scene = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'new_scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temporary when switching. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__new_scene);
	 * CPointer&lt;CPointer&lt;Scene&gt;&gt; p_new_scene = p.cast(new Class[]{CPointer.class, Scene.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'new_scene'</li>
	 * <li>Signature: 'Scene*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__new_scene = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member 'view_layer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active view layer displayed in this window. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__view_layer_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_view_layer_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_layer_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_layer_name = new long[]{28, 56};

	/**
	 * Field descriptor (offset) for struct member 'workspace_hook'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__workspace_hook);
	 * CPointer&lt;CPointer&lt;WorkSpaceInstanceHook&gt;&gt; p_workspace_hook = p.cast(new Class[]{CPointer.class, WorkSpaceInstanceHook.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'workspace_hook'</li>
	 * <li>Signature: 'WorkSpaceInstanceHook*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__workspace_hook = new long[]{92, 120};

	/**
	 * Field descriptor (offset) for struct member 'global_area_map'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__global_area_map);
	 * CPointer&lt;ScrAreaMap&gt; p_global_area_map = p.cast(new Class[]{ScrAreaMap.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'global_area_map'</li>
	 * <li>Signature: 'ScrAreaMap'</li>
	 * <li>Actual Size (32bit/64bit): 24/48</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__global_area_map = new long[]{96, 128};

	/**
	 * Field descriptor (offset) for struct member 'screen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__screen);
	 * CPointer&lt;CPointer&lt;bScreen&gt;&gt; p_screen = p.cast(new Class[]{CPointer.class, bScreen.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'screen'</li>
	 * <li>Signature: 'bScreen*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__screen = new long[]{120, 176};

	/**
	 * Field descriptor (offset) for struct member 'winid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Winid also in screens, is for retrieving this window after read. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__winid);
	 * CPointer&lt;Integer&gt; p_winid = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'winid'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__winid = new long[]{124, 184};

	/**
	 * Field descriptor (offset) for struct member 'posx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Window coords. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__posx);
	 * CPointer&lt;Short&gt; p_posx = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'posx'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__posx = new long[]{128, 188};

	/**
	 * Field descriptor (offset) for struct member 'posy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__posy);
	 * CPointer&lt;Short&gt; p_posy = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'posy'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__posy = new long[]{130, 190};

	/**
	 * Field descriptor (offset) for struct member 'sizex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__sizex);
	 * CPointer&lt;Short&gt; p_sizex = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sizex'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sizex = new long[]{132, 192};

	/**
	 * Field descriptor (offset) for struct member 'sizey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__sizey);
	 * CPointer&lt;Short&gt; p_sizey = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sizey'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sizey = new long[]{134, 194};

	/**
	 * Field descriptor (offset) for struct member 'windowstate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Borderless, full. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__windowstate);
	 * CPointer&lt;Byte&gt; p_windowstate = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'windowstate'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__windowstate = new long[]{136, 196};

	/**
	 * Field descriptor (offset) for struct member 'active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set to 1 if an active window, for quick rejects. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__active);
	 * CPointer&lt;Byte&gt; p_active = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active = new long[]{137, 197};

	/**
	 * Field descriptor (offset) for struct member 'cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Current mouse cursor type. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__cursor);
	 * CPointer&lt;Short&gt; p_cursor = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cursor'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cursor = new long[]{138, 198};

	/**
	 * Field descriptor (offset) for struct member 'lastcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Previous cursor when setting modal one. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__lastcursor);
	 * CPointer&lt;Short&gt; p_lastcursor = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastcursor'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastcursor = new long[]{140, 200};

	/**
	 * Field descriptor (offset) for struct member 'modalcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The current modal cursor. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__modalcursor);
	 * CPointer&lt;Short&gt; p_modalcursor = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modalcursor'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modalcursor = new long[]{142, 202};

	/**
	 * Field descriptor (offset) for struct member 'grabcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cursor grab mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__grabcursor);
	 * CPointer&lt;Short&gt; p_grabcursor = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grabcursor'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grabcursor = new long[]{144, 204};

	/**
	 * Field descriptor (offset) for struct member 'addmousemove'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Internal: tag this for extra mouse-move event, makes cursors/buttons active on UI switching. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__addmousemove);
	 * CPointer&lt;Byte&gt; p_addmousemove = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'addmousemove'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__addmousemove = new long[]{146, 206};

	/**
	 * Field descriptor (offset) for struct member 'tag_cursor_refresh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__tag_cursor_refresh);
	 * CPointer&lt;Byte&gt; p_tag_cursor_refresh = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tag_cursor_refresh'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tag_cursor_refresh = new long[]{147, 207};

	/**
	 * Field descriptor (offset) for struct member 'event_queue_check_click'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Track the state of the event queue, these store the state that needs to be kept between handling events in the queue. Enable when #KM_PRESS events are not handled (keyboard/mouse-buttons only). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__event_queue_check_click);
	 * CPointer&lt;Byte&gt; p_event_queue_check_click = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'event_queue_check_click'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__event_queue_check_click = new long[]{148, 208};

	/**
	 * Field descriptor (offset) for struct member 'event_queue_check_drag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Enable when #KM_PRESS events are not handled (keyboard/mouse-buttons only). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__event_queue_check_drag);
	 * CPointer&lt;Byte&gt; p_event_queue_check_drag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'event_queue_check_drag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__event_queue_check_drag = new long[]{149, 209};

	/**
	 * Field descriptor (offset) for struct member 'event_queue_check_drag_handled'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Enable when the drag was handled, to avoid mouse-motion continually triggering drag events which are not handled but add overhead to gizmo handling (for example), see T87511. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__event_queue_check_drag_handled);
	 * CPointer&lt;Byte&gt; p_event_queue_check_drag_handled = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'event_queue_check_drag_handled'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__event_queue_check_drag_handled = new long[]{150, 210};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{151, 211};

	/**
	 * Field descriptor (offset) for struct member 'pie_event_type_lock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Internal, lock pie creation from this event until released. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__pie_event_type_lock);
	 * CPointer&lt;Short&gt; p_pie_event_type_lock = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pie_event_type_lock'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pie_event_type_lock = new long[]{152, 212};

	/**
	 * Field descriptor (offset) for struct member 'pie_event_type_last'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Exception to the above rule for nested pies, store last pie event for operators that spawn a new pie right after destruction of last pie. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__pie_event_type_last);
	 * CPointer&lt;Short&gt; p_pie_event_type_last = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pie_event_type_last'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pie_event_type_last = new long[]{154, 214};

	/**
	 * Field descriptor (offset) for struct member 'eventstate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Storage for event system. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__eventstate);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_eventstate = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eventstate'</li>
	 * <li>Signature: 'wmEvent*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eventstate = new long[]{156, 216};

	/**
	 * Field descriptor (offset) for struct member 'tweak'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Internal for wm_operators.c. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__tweak);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tweak = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tweak'</li>
	 * <li>Signature: 'wmGesture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tweak = new long[]{160, 224};

	/**
	 * Field descriptor (offset) for struct member 'ime_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Input Method Editor data - complex character input (especially for Asian character input) Currently WIN32 and APPLE, runtime-only data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__ime_data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_ime_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ime_data'</li>
	 * <li>Signature: 'wmIMEData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ime_data = new long[]{164, 232};

	/**
	 * Field descriptor (offset) for struct member 'event_queue'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> All events #wmEvent (ghost level events were handled). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__event_queue);
	 * CPointer&lt;ListBase&gt; p_event_queue = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'event_queue'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__event_queue = new long[]{168, 240};

	/**
	 * Field descriptor (offset) for struct member 'handlers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Window+screen handlers, handled last. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__handlers);
	 * CPointer&lt;ListBase&gt; p_handlers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handlers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handlers = new long[]{176, 256};

	/**
	 * Field descriptor (offset) for struct member 'modalhandlers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Priority handlers, handled first. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__modalhandlers);
	 * CPointer&lt;ListBase&gt; p_modalhandlers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modalhandlers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modalhandlers = new long[]{184, 272};

	/**
	 * Field descriptor (offset) for struct member 'gesture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Gesture stuff. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__gesture);
	 * CPointer&lt;ListBase&gt; p_gesture = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gesture'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gesture = new long[]{192, 288};

	/**
	 * Field descriptor (offset) for struct member 'stereo3d_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Properties for stereoscopic displays. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__stereo3d_format);
	 * CPointer&lt;CPointer&lt;Stereo3dFormat&gt;&gt; p_stereo3d_format = p.cast(new Class[]{CPointer.class, Stereo3dFormat.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stereo3d_format'</li>
	 * <li>Signature: 'Stereo3dFormat*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stereo3d_format = new long[]{200, 304};

	/**
	 * Field descriptor (offset) for struct member 'drawcalls'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> custom drawing callbacks </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__drawcalls);
	 * CPointer&lt;ListBase&gt; p_drawcalls = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawcalls'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawcalls = new long[]{204, 312};

	/**
	 * Field descriptor (offset) for struct member 'cursor_keymap_status'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Private runtime info to show text in the status bar. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__cursor_keymap_status);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_cursor_keymap_status = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cursor_keymap_status'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cursor_keymap_status = new long[]{212, 328};

	public wmWindow(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected wmWindow(wmWindow that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<wmWindow> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmWindow.class};
		return new CPointer<wmWindow>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmWindow.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<wmWindow> next) throws IOException
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
	
	public CPointer<wmWindow> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmWindow.class};
		return new CPointer<wmWindow>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmWindow.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<wmWindow> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'ghostwin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Don't want to include ghost.h stuff. </p>
	 * @see #__DNA__FIELD__ghostwin
	 */
	
	public CPointer<Object> getGhostwin() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ghostwin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Don't want to include ghost.h stuff. </p>
	 * @see #__DNA__FIELD__ghostwin
	 */
	
	public void setGhostwin(CPointer<Object> ghostwin) throws IOException
	{
		long __address = ((ghostwin == null) ? 0 : ghostwin.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'gpuctx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Don't want to include gpu stuff. </p>
	 * @see #__DNA__FIELD__gpuctx
	 */
	
	public CPointer<Object> getGpuctx() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpuctx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Don't want to include gpu stuff. </p>
	 * @see #__DNA__FIELD__gpuctx
	 */
	
	public void setGpuctx(CPointer<Object> gpuctx) throws IOException
	{
		long __address = ((gpuctx == null) ? 0 : gpuctx.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Parent window. </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public CPointer<wmWindow> getParent() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmWindow.class};
		return new CPointer<wmWindow>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmWindow.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Parent window. </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public void setParent(CPointer<wmWindow> parent) throws IOException
	{
		long __address = ((parent == null) ? 0 : parent.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active scene displayed in this window. </p>
	 * @see #__DNA__FIELD__scene
	 */
	
	public CPointer<Scene> getScene() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Scene.class};
		return new CPointer<Scene>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Scene.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active scene displayed in this window. </p>
	 * @see #__DNA__FIELD__scene
	 */
	
	public void setScene(CPointer<Scene> scene) throws IOException
	{
		long __address = ((scene == null) ? 0 : scene.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'new_scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temporary when switching. </p>
	 * @see #__DNA__FIELD__new_scene
	 */
	
	public CPointer<Scene> getNew_scene() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Scene.class};
		return new CPointer<Scene>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Scene.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'new_scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temporary when switching. </p>
	 * @see #__DNA__FIELD__new_scene
	 */
	
	public void setNew_scene(CPointer<Scene> new_scene) throws IOException
	{
		long __address = ((new_scene == null) ? 0 : new_scene.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'view_layer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active view layer displayed in this window. </p>
	 * @see #__DNA__FIELD__view_layer_name
	 */
	
	public CArrayFacade<Byte> getView_layer_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'view_layer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active view layer displayed in this window. </p>
	 * @see #__DNA__FIELD__view_layer_name
	 */
	
	public void setView_layer_name(CArrayFacade<Byte> view_layer_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(view_layer_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, view_layer_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, view_layer_name);
		} else {
			__io__generic__copy( getView_layer_name(), view_layer_name);
		}
	}

	/**
	 * Get method for struct member 'workspace_hook'.
	 * @see #__DNA__FIELD__workspace_hook
	 */
	
	public CPointer<WorkSpaceInstanceHook> getWorkspace_hook() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 92);
		}
		Class<?>[] __dna__targetTypes = new Class[]{WorkSpaceInstanceHook.class};
		return new CPointer<WorkSpaceInstanceHook>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, WorkSpaceInstanceHook.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'workspace_hook'.
	 * @see #__DNA__FIELD__workspace_hook
	 */
	
	public void setWorkspace_hook(CPointer<WorkSpaceInstanceHook> workspace_hook) throws IOException
	{
		long __address = ((workspace_hook == null) ? 0 : workspace_hook.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 92, __address);
		}
	}

	/**
	 * Get method for struct member 'global_area_map'.
	 * @see #__DNA__FIELD__global_area_map
	 */
	
	public ScrAreaMap getGlobal_area_map() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ScrAreaMap(__io__address + 128, __io__block, __io__blockTable);
		} else {
			return new ScrAreaMap(__io__address + 96, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'global_area_map'.
	 * @see #__DNA__FIELD__global_area_map
	 */
	
	public void setGlobal_area_map(ScrAreaMap global_area_map) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(global_area_map, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, global_area_map)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, global_area_map);
		} else {
			__io__generic__copy( getGlobal_area_map(), global_area_map);
		}
	}

	/**
	 * Get method for struct member 'screen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__screen
	 */
	
	public CPointer<bScreen> getScreen() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bScreen.class};
		return new CPointer<bScreen>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bScreen.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'screen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__screen
	 */
	
	public void setScreen(CPointer<bScreen> screen) throws IOException
	{
		long __address = ((screen == null) ? 0 : screen.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'winid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Winid also in screens, is for retrieving this window after read. </p>
	 * @see #__DNA__FIELD__winid
	 */
	
	public int getWinid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 184);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'winid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Winid also in screens, is for retrieving this window after read. </p>
	 * @see #__DNA__FIELD__winid
	 */
	
	public void setWinid(int winid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 184, winid);
		} else {
			__io__block.writeInt(__io__address + 124, winid);
		}
	}

	/**
	 * Get method for struct member 'posx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Window coords. </p>
	 * @see #__DNA__FIELD__posx
	 */
	
	public short getPosx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 188);
		} else {
			return __io__block.readShort(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'posx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Window coords. </p>
	 * @see #__DNA__FIELD__posx
	 */
	
	public void setPosx(short posx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 188, posx);
		} else {
			__io__block.writeShort(__io__address + 128, posx);
		}
	}

	/**
	 * Get method for struct member 'posy'.
	 * @see #__DNA__FIELD__posy
	 */
	
	public short getPosy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 190);
		} else {
			return __io__block.readShort(__io__address + 130);
		}
	}

	/**
	 * Set method for struct member 'posy'.
	 * @see #__DNA__FIELD__posy
	 */
	
	public void setPosy(short posy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 190, posy);
		} else {
			__io__block.writeShort(__io__address + 130, posy);
		}
	}

	/**
	 * Get method for struct member 'sizex'.
	 * @see #__DNA__FIELD__sizex
	 */
	
	public short getSizex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 192);
		} else {
			return __io__block.readShort(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'sizex'.
	 * @see #__DNA__FIELD__sizex
	 */
	
	public void setSizex(short sizex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 192, sizex);
		} else {
			__io__block.writeShort(__io__address + 132, sizex);
		}
	}

	/**
	 * Get method for struct member 'sizey'.
	 * @see #__DNA__FIELD__sizey
	 */
	
	public short getSizey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 194);
		} else {
			return __io__block.readShort(__io__address + 134);
		}
	}

	/**
	 * Set method for struct member 'sizey'.
	 * @see #__DNA__FIELD__sizey
	 */
	
	public void setSizey(short sizey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 194, sizey);
		} else {
			__io__block.writeShort(__io__address + 134, sizey);
		}
	}

	/**
	 * Get method for struct member 'windowstate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Borderless, full. </p>
	 * @see #__DNA__FIELD__windowstate
	 */
	
	public byte getWindowstate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 196);
		} else {
			return __io__block.readByte(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'windowstate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Borderless, full. </p>
	 * @see #__DNA__FIELD__windowstate
	 */
	
	public void setWindowstate(byte windowstate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 196, windowstate);
		} else {
			__io__block.writeByte(__io__address + 136, windowstate);
		}
	}

	/**
	 * Get method for struct member 'active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set to 1 if an active window, for quick rejects. </p>
	 * @see #__DNA__FIELD__active
	 */
	
	public byte getActive() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 197);
		} else {
			return __io__block.readByte(__io__address + 137);
		}
	}

	/**
	 * Set method for struct member 'active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set to 1 if an active window, for quick rejects. </p>
	 * @see #__DNA__FIELD__active
	 */
	
	public void setActive(byte active) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 197, active);
		} else {
			__io__block.writeByte(__io__address + 137, active);
		}
	}

	/**
	 * Get method for struct member 'cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Current mouse cursor type. </p>
	 * @see #__DNA__FIELD__cursor
	 */
	
	public short getCursor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 198);
		} else {
			return __io__block.readShort(__io__address + 138);
		}
	}

	/**
	 * Set method for struct member 'cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Current mouse cursor type. </p>
	 * @see #__DNA__FIELD__cursor
	 */
	
	public void setCursor(short cursor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 198, cursor);
		} else {
			__io__block.writeShort(__io__address + 138, cursor);
		}
	}

	/**
	 * Get method for struct member 'lastcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Previous cursor when setting modal one. </p>
	 * @see #__DNA__FIELD__lastcursor
	 */
	
	public short getLastcursor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 200);
		} else {
			return __io__block.readShort(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'lastcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Previous cursor when setting modal one. </p>
	 * @see #__DNA__FIELD__lastcursor
	 */
	
	public void setLastcursor(short lastcursor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 200, lastcursor);
		} else {
			__io__block.writeShort(__io__address + 140, lastcursor);
		}
	}

	/**
	 * Get method for struct member 'modalcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The current modal cursor. </p>
	 * @see #__DNA__FIELD__modalcursor
	 */
	
	public short getModalcursor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 202);
		} else {
			return __io__block.readShort(__io__address + 142);
		}
	}

	/**
	 * Set method for struct member 'modalcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The current modal cursor. </p>
	 * @see #__DNA__FIELD__modalcursor
	 */
	
	public void setModalcursor(short modalcursor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 202, modalcursor);
		} else {
			__io__block.writeShort(__io__address + 142, modalcursor);
		}
	}

	/**
	 * Get method for struct member 'grabcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cursor grab mode. </p>
	 * @see #__DNA__FIELD__grabcursor
	 */
	
	public short getGrabcursor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 204);
		} else {
			return __io__block.readShort(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'grabcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cursor grab mode. </p>
	 * @see #__DNA__FIELD__grabcursor
	 */
	
	public void setGrabcursor(short grabcursor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 204, grabcursor);
		} else {
			__io__block.writeShort(__io__address + 144, grabcursor);
		}
	}

	/**
	 * Get method for struct member 'addmousemove'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Internal: tag this for extra mouse-move event, makes cursors/buttons active on UI switching. </p>
	 * @see #__DNA__FIELD__addmousemove
	 */
	
	public byte getAddmousemove() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 206);
		} else {
			return __io__block.readByte(__io__address + 146);
		}
	}

	/**
	 * Set method for struct member 'addmousemove'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Internal: tag this for extra mouse-move event, makes cursors/buttons active on UI switching. </p>
	 * @see #__DNA__FIELD__addmousemove
	 */
	
	public void setAddmousemove(byte addmousemove) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 206, addmousemove);
		} else {
			__io__block.writeByte(__io__address + 146, addmousemove);
		}
	}

	/**
	 * Get method for struct member 'tag_cursor_refresh'.
	 * @see #__DNA__FIELD__tag_cursor_refresh
	 */
	
	public byte getTag_cursor_refresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 207);
		} else {
			return __io__block.readByte(__io__address + 147);
		}
	}

	/**
	 * Set method for struct member 'tag_cursor_refresh'.
	 * @see #__DNA__FIELD__tag_cursor_refresh
	 */
	
	public void setTag_cursor_refresh(byte tag_cursor_refresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 207, tag_cursor_refresh);
		} else {
			__io__block.writeByte(__io__address + 147, tag_cursor_refresh);
		}
	}

	/**
	 * Get method for struct member 'event_queue_check_click'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Track the state of the event queue, these store the state that needs to be kept between handling events in the queue. Enable when #KM_PRESS events are not handled (keyboard/mouse-buttons only). </p>
	 * @see #__DNA__FIELD__event_queue_check_click
	 */
	
	public byte getEvent_queue_check_click() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 208);
		} else {
			return __io__block.readByte(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'event_queue_check_click'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Track the state of the event queue, these store the state that needs to be kept between handling events in the queue. Enable when #KM_PRESS events are not handled (keyboard/mouse-buttons only). </p>
	 * @see #__DNA__FIELD__event_queue_check_click
	 */
	
	public void setEvent_queue_check_click(byte event_queue_check_click) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 208, event_queue_check_click);
		} else {
			__io__block.writeByte(__io__address + 148, event_queue_check_click);
		}
	}

	/**
	 * Get method for struct member 'event_queue_check_drag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Enable when #KM_PRESS events are not handled (keyboard/mouse-buttons only). </p>
	 * @see #__DNA__FIELD__event_queue_check_drag
	 */
	
	public byte getEvent_queue_check_drag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 209);
		} else {
			return __io__block.readByte(__io__address + 149);
		}
	}

	/**
	 * Set method for struct member 'event_queue_check_drag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Enable when #KM_PRESS events are not handled (keyboard/mouse-buttons only). </p>
	 * @see #__DNA__FIELD__event_queue_check_drag
	 */
	
	public void setEvent_queue_check_drag(byte event_queue_check_drag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 209, event_queue_check_drag);
		} else {
			__io__block.writeByte(__io__address + 149, event_queue_check_drag);
		}
	}

	/**
	 * Get method for struct member 'event_queue_check_drag_handled'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Enable when the drag was handled, to avoid mouse-motion continually triggering drag events which are not handled but add overhead to gizmo handling (for example), see T87511. </p>
	 * @see #__DNA__FIELD__event_queue_check_drag_handled
	 */
	
	public byte getEvent_queue_check_drag_handled() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 210);
		} else {
			return __io__block.readByte(__io__address + 150);
		}
	}

	/**
	 * Set method for struct member 'event_queue_check_drag_handled'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Enable when the drag was handled, to avoid mouse-motion continually triggering drag events which are not handled but add overhead to gizmo handling (for example), see T87511. </p>
	 * @see #__DNA__FIELD__event_queue_check_drag_handled
	 */
	
	public void setEvent_queue_check_drag_handled(byte event_queue_check_drag_handled) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 210, event_queue_check_drag_handled);
		} else {
			__io__block.writeByte(__io__address + 150, event_queue_check_drag_handled);
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
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 211, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 151, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 211;
		} else {
			__dna__offset = 151;
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
	 * Get method for struct member 'pie_event_type_lock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Internal, lock pie creation from this event until released. </p>
	 * @see #__DNA__FIELD__pie_event_type_lock
	 */
	
	public short getPie_event_type_lock() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 212);
		} else {
			return __io__block.readShort(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'pie_event_type_lock'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Internal, lock pie creation from this event until released. </p>
	 * @see #__DNA__FIELD__pie_event_type_lock
	 */
	
	public void setPie_event_type_lock(short pie_event_type_lock) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 212, pie_event_type_lock);
		} else {
			__io__block.writeShort(__io__address + 152, pie_event_type_lock);
		}
	}

	/**
	 * Get method for struct member 'pie_event_type_last'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Exception to the above rule for nested pies, store last pie event for operators that spawn a new pie right after destruction of last pie. </p>
	 * @see #__DNA__FIELD__pie_event_type_last
	 */
	
	public short getPie_event_type_last() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 214);
		} else {
			return __io__block.readShort(__io__address + 154);
		}
	}

	/**
	 * Set method for struct member 'pie_event_type_last'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Exception to the above rule for nested pies, store last pie event for operators that spawn a new pie right after destruction of last pie. </p>
	 * @see #__DNA__FIELD__pie_event_type_last
	 */
	
	public void setPie_event_type_last(short pie_event_type_last) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 214, pie_event_type_last);
		} else {
			__io__block.writeShort(__io__address + 154, pie_event_type_last);
		}
	}

	/**
	 * Get method for struct member 'eventstate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Storage for event system. </p>
	 * @see #__DNA__FIELD__eventstate
	 */
	
	public CPointer<Object> getEventstate() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 156);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'eventstate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Storage for event system. </p>
	 * @see #__DNA__FIELD__eventstate
	 */
	
	public void setEventstate(CPointer<Object> eventstate) throws IOException
	{
		long __address = ((eventstate == null) ? 0 : eventstate.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 156, __address);
		}
	}

	/**
	 * Get method for struct member 'tweak'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Internal for wm_operators.c. </p>
	 * @see #__DNA__FIELD__tweak
	 */
	
	public CPointer<Object> getTweak() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tweak'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Internal for wm_operators.c. </p>
	 * @see #__DNA__FIELD__tweak
	 */
	
	public void setTweak(CPointer<Object> tweak) throws IOException
	{
		long __address = ((tweak == null) ? 0 : tweak.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 160, __address);
		}
	}

	/**
	 * Get method for struct member 'ime_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Input Method Editor data - complex character input (especially for Asian character input) Currently WIN32 and APPLE, runtime-only data. </p>
	 * @see #__DNA__FIELD__ime_data
	 */
	
	public CPointer<Object> getIme_data() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 164);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ime_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Input Method Editor data - complex character input (especially for Asian character input) Currently WIN32 and APPLE, runtime-only data. </p>
	 * @see #__DNA__FIELD__ime_data
	 */
	
	public void setIme_data(CPointer<Object> ime_data) throws IOException
	{
		long __address = ((ime_data == null) ? 0 : ime_data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 164, __address);
		}
	}

	/**
	 * Get method for struct member 'event_queue'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> All events #wmEvent (ghost level events were handled). </p>
	 * @see #__DNA__FIELD__event_queue
	 */
	
	public ListBase getEvent_queue() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 240, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 168, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'event_queue'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> All events #wmEvent (ghost level events were handled). </p>
	 * @see #__DNA__FIELD__event_queue
	 */
	
	public void setEvent_queue(ListBase event_queue) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 240;
		} else {
			__dna__offset = 168;
		}
		if (__io__equals(event_queue, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, event_queue)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, event_queue);
		} else {
			__io__generic__copy( getEvent_queue(), event_queue);
		}
	}

	/**
	 * Get method for struct member 'handlers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Window+screen handlers, handled last. </p>
	 * @see #__DNA__FIELD__handlers
	 */
	
	public ListBase getHandlers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 256, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 176, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handlers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Window+screen handlers, handled last. </p>
	 * @see #__DNA__FIELD__handlers
	 */
	
	public void setHandlers(ListBase handlers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 256;
		} else {
			__dna__offset = 176;
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
	 * Get method for struct member 'modalhandlers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Priority handlers, handled first. </p>
	 * @see #__DNA__FIELD__modalhandlers
	 */
	
	public ListBase getModalhandlers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 272, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 184, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modalhandlers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Priority handlers, handled first. </p>
	 * @see #__DNA__FIELD__modalhandlers
	 */
	
	public void setModalhandlers(ListBase modalhandlers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 272;
		} else {
			__dna__offset = 184;
		}
		if (__io__equals(modalhandlers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modalhandlers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modalhandlers);
		} else {
			__io__generic__copy( getModalhandlers(), modalhandlers);
		}
	}

	/**
	 * Get method for struct member 'gesture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Gesture stuff. </p>
	 * @see #__DNA__FIELD__gesture
	 */
	
	public ListBase getGesture() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 288, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 192, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gesture'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Gesture stuff. </p>
	 * @see #__DNA__FIELD__gesture
	 */
	
	public void setGesture(ListBase gesture) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 288;
		} else {
			__dna__offset = 192;
		}
		if (__io__equals(gesture, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gesture)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gesture);
		} else {
			__io__generic__copy( getGesture(), gesture);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Properties for stereoscopic displays. </p>
	 * @see #__DNA__FIELD__stereo3d_format
	 */
	
	public CPointer<Stereo3dFormat> getStereo3d_format() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 304);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Stereo3dFormat.class};
		return new CPointer<Stereo3dFormat>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Stereo3dFormat.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'stereo3d_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Properties for stereoscopic displays. </p>
	 * @see #__DNA__FIELD__stereo3d_format
	 */
	
	public void setStereo3d_format(CPointer<Stereo3dFormat> stereo3d_format) throws IOException
	{
		long __address = ((stereo3d_format == null) ? 0 : stereo3d_format.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 304, __address);
		} else {
			__io__block.writeLong(__io__address + 200, __address);
		}
	}

	/**
	 * Get method for struct member 'drawcalls'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> custom drawing callbacks </p>
	 * @see #__DNA__FIELD__drawcalls
	 */
	
	public ListBase getDrawcalls() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 312, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 204, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drawcalls'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> custom drawing callbacks </p>
	 * @see #__DNA__FIELD__drawcalls
	 */
	
	public void setDrawcalls(ListBase drawcalls) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 312;
		} else {
			__dna__offset = 204;
		}
		if (__io__equals(drawcalls, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drawcalls)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drawcalls);
		} else {
			__io__generic__copy( getDrawcalls(), drawcalls);
		}
	}

	/**
	 * Get method for struct member 'cursor_keymap_status'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Private runtime info to show text in the status bar. </p>
	 * @see #__DNA__FIELD__cursor_keymap_status
	 */
	
	public CPointer<Object> getCursor_keymap_status() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 328);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 212);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cursor_keymap_status'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Private runtime info to show text in the status bar. </p>
	 * @see #__DNA__FIELD__cursor_keymap_status
	 */
	
	public void setCursor_keymap_status(CPointer<Object> cursor_keymap_status) throws IOException
	{
		long __address = ((cursor_keymap_status == null) ? 0 : cursor_keymap_status.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 328, __address);
		} else {
			__io__block.writeLong(__io__address + 212, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<wmWindow> __io__addressof() {
		return new CPointer<wmWindow>(__io__address, new Class[]{wmWindow.class}, __io__block, __io__blockTable);
	}

}
