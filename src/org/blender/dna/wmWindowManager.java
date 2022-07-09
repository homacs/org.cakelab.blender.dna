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
 * Generated facet for DNA struct type 'wmWindowManager'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> #endif </p><p> reports need to be before {@link wmWindowManager}  Window-manager is saved, tag WMAN. </p>
 */

@CMetaData(size32=1284, size64=1448)
public class wmWindowManager extends CFacade {

	/**
	 * This is the sdna index of the struct wmWindowManager.
	 * <p>
	 * It is required when allocating a new block to store data for wmWindowManager.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 630;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 152/192</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'windrawable'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Separate active from drawable. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__windrawable);
	 * CPointer&lt;CPointer&lt;wmWindow&gt;&gt; p_windrawable = p.cast(new Class[]{CPointer.class, wmWindow.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'windrawable'</li>
	 * <li>Signature: 'wmWindow*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__windrawable = new long[]{152, 192};

	/**
	 * Field descriptor (offset) for struct member 'winactive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><h2>Note</h2><p><code></code>  is usually preferred. Avoid relying on this where possible as this may become NULL during when handling events that close or replace windows (opening a file for e.g.). While this happens rarely in practice, it can cause difficult to reproduce bugs. </p> CTX_wm_window(C) is usually preferred. Avoid relying on this where possible as this may become NULL during when handling events that close or replace windows (opening a file for e.g.). While this happens rarely in practice, it can cause difficult to reproduce bugs. 
	 * 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__winactive);
	 * CPointer&lt;CPointer&lt;wmWindow&gt;&gt; p_winactive = p.cast(new Class[]{CPointer.class, wmWindow.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'winactive'</li>
	 * <li>Signature: 'wmWindow*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__winactive = new long[]{156, 200};

	/**
	 * Field descriptor (offset) for struct member 'windows'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__windows);
	 * CPointer&lt;ListBase&gt; p_windows = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'windows'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__windows = new long[]{160, 208};

	/**
	 * Field descriptor (offset) for struct member 'initialized'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set on file read. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__initialized);
	 * CPointer&lt;Short&gt; p_initialized = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'initialized'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__initialized = new long[]{168, 224};

	/**
	 * Field descriptor (offset) for struct member 'file_saved'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Indicator whether data was saved. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__file_saved);
	 * CPointer&lt;Short&gt; p_file_saved = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'file_saved'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__file_saved = new long[]{170, 226};

	/**
	 * Field descriptor (offset) for struct member 'op_undo_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Operator stack depth to avoid nested undo pushes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__op_undo_depth);
	 * CPointer&lt;Short&gt; p_op_undo_depth = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'op_undo_depth'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__op_undo_depth = new long[]{172, 228};

	/**
	 * Field descriptor (offset) for struct member 'outliner_sync_select_dirty'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set after selection to notify outliner to sync. Stores type of selection </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__outliner_sync_select_dirty);
	 * CPointer&lt;Short&gt; p_outliner_sync_select_dirty = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'outliner_sync_select_dirty'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__outliner_sync_select_dirty = new long[]{174, 230};

	/**
	 * Field descriptor (offset) for struct member 'operators'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Operator registry. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__operators);
	 * CPointer&lt;ListBase&gt; p_operators = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'operators'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__operators = new long[]{176, 232};

	/**
	 * Field descriptor (offset) for struct member 'notifier_queue'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Refresh/redraw #wmNotifier structs. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__notifier_queue);
	 * CPointer&lt;ListBase&gt; p_notifier_queue = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'notifier_queue'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__notifier_queue = new long[]{184, 248};

	/**
	 * Field descriptor (offset) for struct member 'reports'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Information and error reports. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__reports);
	 * CPointer&lt;ReportList&gt; p_reports = p.cast(new Class[]{ReportList.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reports'</li>
	 * <li>Signature: 'ReportList'</li>
	 * <li>Actual Size (32bit/64bit): 28/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reports = new long[]{192, 264};

	/**
	 * Field descriptor (offset) for struct member 'jobs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Threaded jobs manager. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__jobs);
	 * CPointer&lt;ListBase&gt; p_jobs = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'jobs'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__jobs = new long[]{220, 304};

	/**
	 * Field descriptor (offset) for struct member 'paintcursors'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Extra overlay cursors to draw, like circles. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__paintcursors);
	 * CPointer&lt;ListBase&gt; p_paintcursors = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paintcursors'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paintcursors = new long[]{228, 320};

	/**
	 * Field descriptor (offset) for struct member 'drags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active dragged items. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__drags);
	 * CPointer&lt;ListBase&gt; p_drags = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drags'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drags = new long[]{236, 336};

	/**
	 * Field descriptor (offset) for struct member 'keyconfigs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Known key configurations. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__keyconfigs);
	 * CPointer&lt;ListBase&gt; p_keyconfigs = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyconfigs'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyconfigs = new long[]{244, 352};

	/**
	 * Field descriptor (offset) for struct member 'defaultconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Default configuration. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__defaultconf);
	 * CPointer&lt;CPointer&lt;wmKeyConfig&gt;&gt; p_defaultconf = p.cast(new Class[]{CPointer.class, wmKeyConfig.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defaultconf'</li>
	 * <li>Signature: 'wmKeyConfig*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defaultconf = new long[]{252, 368};

	/**
	 * Field descriptor (offset) for struct member 'addonconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Addon configuration. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__addonconf);
	 * CPointer&lt;CPointer&lt;wmKeyConfig&gt;&gt; p_addonconf = p.cast(new Class[]{CPointer.class, wmKeyConfig.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'addonconf'</li>
	 * <li>Signature: 'wmKeyConfig*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__addonconf = new long[]{256, 376};

	/**
	 * Field descriptor (offset) for struct member 'userconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> User configuration. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__userconf);
	 * CPointer&lt;CPointer&lt;wmKeyConfig&gt;&gt; p_userconf = p.cast(new Class[]{CPointer.class, wmKeyConfig.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'userconf'</li>
	 * <li>Signature: 'wmKeyConfig*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__userconf = new long[]{260, 384};

	/**
	 * Field descriptor (offset) for struct member 'timers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active timers. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__timers);
	 * CPointer&lt;ListBase&gt; p_timers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'timers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__timers = new long[]{264, 392};

	/**
	 * Field descriptor (offset) for struct member 'autosavetimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Timer for auto save. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__autosavetimer);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_autosavetimer = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'autosavetimer'</li>
	 * <li>Signature: 'wmTimer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__autosavetimer = new long[]{272, 408};

	/**
	 * Field descriptor (offset) for struct member 'undo_stack'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> All undo history (runtime only). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__undo_stack);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_undo_stack = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'undo_stack'</li>
	 * <li>Signature: 'UndoStack*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__undo_stack = new long[]{276, 416};

	/**
	 * Field descriptor (offset) for struct member 'is_interface_locked'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Indicates whether interface is locked for user interaction. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__is_interface_locked);
	 * CPointer&lt;Byte&gt; p_is_interface_locked = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'is_interface_locked'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__is_interface_locked = new long[]{280, 424};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{281, 425};

	/**
	 * Field descriptor (offset) for struct member 'message_bus'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__message_bus);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_message_bus = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'message_bus'</li>
	 * <li>Signature: 'wmMsgBus*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__message_bus = new long[]{288, 432};

	/**
	 * Field descriptor (offset) for struct member 'xr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #ifdef WITH_XR_OPENXR </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__xr);
	 * CPointer&lt;wmXrData&gt; p_xr = p.cast(new Class[]{wmXrData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xr'</li>
	 * <li>Signature: 'wmXrData'</li>
	 * <li>Actual Size (32bit/64bit): 992/1008</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xr = new long[]{292, 440};

	public wmWindowManager(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected wmWindowManager(wmWindowManager that) {
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
	 * Get method for struct member 'windrawable'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Separate active from drawable. </p>
	 * @see #__DNA__FIELD__windrawable
	 */
	
	public CPointer<wmWindow> getWindrawable() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmWindow.class};
		return new CPointer<wmWindow>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmWindow.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'windrawable'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Separate active from drawable. </p>
	 * @see #__DNA__FIELD__windrawable
	 */
	
	public void setWindrawable(CPointer<wmWindow> windrawable) throws IOException
	{
		long __address = ((windrawable == null) ? 0 : windrawable.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 152, __address);
		}
	}

	/**
	 * Get method for struct member 'winactive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><h2>Note</h2><p><code></code>  is usually preferred. Avoid relying on this where possible as this may become NULL during when handling events that close or replace windows (opening a file for e.g.). While this happens rarely in practice, it can cause difficult to reproduce bugs. </p> CTX_wm_window(C) is usually preferred. Avoid relying on this where possible as this may become NULL during when handling events that close or replace windows (opening a file for e.g.). While this happens rarely in practice, it can cause difficult to reproduce bugs. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__winactive
	 */
	
	public CPointer<wmWindow> getWinactive() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 156);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmWindow.class};
		return new CPointer<wmWindow>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmWindow.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'winactive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><h2>Note</h2><p><code></code>  is usually preferred. Avoid relying on this where possible as this may become NULL during when handling events that close or replace windows (opening a file for e.g.). While this happens rarely in practice, it can cause difficult to reproduce bugs. </p> CTX_wm_window(C) is usually preferred. Avoid relying on this where possible as this may become NULL during when handling events that close or replace windows (opening a file for e.g.). While this happens rarely in practice, it can cause difficult to reproduce bugs. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__winactive
	 */
	
	public void setWinactive(CPointer<wmWindow> winactive) throws IOException
	{
		long __address = ((winactive == null) ? 0 : winactive.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 156, __address);
		}
	}

	/**
	 * Get method for struct member 'windows'.
	 * @see #__DNA__FIELD__windows
	 */
	
	public ListBase getWindows() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 208, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 160, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'windows'.
	 * @see #__DNA__FIELD__windows
	 */
	
	public void setWindows(ListBase windows) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 160;
		}
		if (__io__equals(windows, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, windows)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, windows);
		} else {
			__io__generic__copy( getWindows(), windows);
		}
	}

	/**
	 * Get method for struct member 'initialized'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set on file read. </p>
	 * @see #__DNA__FIELD__initialized
	 */
	
	public short getInitialized() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 224);
		} else {
			return __io__block.readShort(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'initialized'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set on file read. </p>
	 * @see #__DNA__FIELD__initialized
	 */
	
	public void setInitialized(short initialized) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 224, initialized);
		} else {
			__io__block.writeShort(__io__address + 168, initialized);
		}
	}

	/**
	 * Get method for struct member 'file_saved'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Indicator whether data was saved. </p>
	 * @see #__DNA__FIELD__file_saved
	 */
	
	public short getFile_saved() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 226);
		} else {
			return __io__block.readShort(__io__address + 170);
		}
	}

	/**
	 * Set method for struct member 'file_saved'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Indicator whether data was saved. </p>
	 * @see #__DNA__FIELD__file_saved
	 */
	
	public void setFile_saved(short file_saved) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 226, file_saved);
		} else {
			__io__block.writeShort(__io__address + 170, file_saved);
		}
	}

	/**
	 * Get method for struct member 'op_undo_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Operator stack depth to avoid nested undo pushes. </p>
	 * @see #__DNA__FIELD__op_undo_depth
	 */
	
	public short getOp_undo_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 228);
		} else {
			return __io__block.readShort(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'op_undo_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Operator stack depth to avoid nested undo pushes. </p>
	 * @see #__DNA__FIELD__op_undo_depth
	 */
	
	public void setOp_undo_depth(short op_undo_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 228, op_undo_depth);
		} else {
			__io__block.writeShort(__io__address + 172, op_undo_depth);
		}
	}

	/**
	 * Get method for struct member 'outliner_sync_select_dirty'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set after selection to notify outliner to sync. Stores type of selection </p>
	 * @see #__DNA__FIELD__outliner_sync_select_dirty
	 */
	
	public short getOutliner_sync_select_dirty() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 230);
		} else {
			return __io__block.readShort(__io__address + 174);
		}
	}

	/**
	 * Set method for struct member 'outliner_sync_select_dirty'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Set after selection to notify outliner to sync. Stores type of selection </p>
	 * @see #__DNA__FIELD__outliner_sync_select_dirty
	 */
	
	public void setOutliner_sync_select_dirty(short outliner_sync_select_dirty) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 230, outliner_sync_select_dirty);
		} else {
			__io__block.writeShort(__io__address + 174, outliner_sync_select_dirty);
		}
	}

	/**
	 * Get method for struct member 'operators'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Operator registry. </p>
	 * @see #__DNA__FIELD__operators
	 */
	
	public ListBase getOperators() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 232, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 176, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'operators'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Operator registry. </p>
	 * @see #__DNA__FIELD__operators
	 */
	
	public void setOperators(ListBase operators) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 232;
		} else {
			__dna__offset = 176;
		}
		if (__io__equals(operators, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, operators)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, operators);
		} else {
			__io__generic__copy( getOperators(), operators);
		}
	}

	/**
	 * Get method for struct member 'notifier_queue'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Refresh/redraw #wmNotifier structs. </p>
	 * @see #__DNA__FIELD__notifier_queue
	 */
	
	public ListBase getNotifier_queue() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 248, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 184, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'notifier_queue'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Refresh/redraw #wmNotifier structs. </p>
	 * @see #__DNA__FIELD__notifier_queue
	 */
	
	public void setNotifier_queue(ListBase notifier_queue) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 184;
		}
		if (__io__equals(notifier_queue, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, notifier_queue)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, notifier_queue);
		} else {
			__io__generic__copy( getNotifier_queue(), notifier_queue);
		}
	}

	/**
	 * Get method for struct member 'reports'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Information and error reports. </p>
	 * @see #__DNA__FIELD__reports
	 */
	
	public ReportList getReports() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ReportList(__io__address + 264, __io__block, __io__blockTable);
		} else {
			return new ReportList(__io__address + 192, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'reports'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Information and error reports. </p>
	 * @see #__DNA__FIELD__reports
	 */
	
	public void setReports(ReportList reports) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 264;
		} else {
			__dna__offset = 192;
		}
		if (__io__equals(reports, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, reports)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, reports);
		} else {
			__io__generic__copy( getReports(), reports);
		}
	}

	/**
	 * Get method for struct member 'jobs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Threaded jobs manager. </p>
	 * @see #__DNA__FIELD__jobs
	 */
	
	public ListBase getJobs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 304, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 220, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'jobs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Threaded jobs manager. </p>
	 * @see #__DNA__FIELD__jobs
	 */
	
	public void setJobs(ListBase jobs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 304;
		} else {
			__dna__offset = 220;
		}
		if (__io__equals(jobs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, jobs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, jobs);
		} else {
			__io__generic__copy( getJobs(), jobs);
		}
	}

	/**
	 * Get method for struct member 'paintcursors'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Extra overlay cursors to draw, like circles. </p>
	 * @see #__DNA__FIELD__paintcursors
	 */
	
	public ListBase getPaintcursors() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 320, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 228, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'paintcursors'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Extra overlay cursors to draw, like circles. </p>
	 * @see #__DNA__FIELD__paintcursors
	 */
	
	public void setPaintcursors(ListBase paintcursors) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 320;
		} else {
			__dna__offset = 228;
		}
		if (__io__equals(paintcursors, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, paintcursors)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, paintcursors);
		} else {
			__io__generic__copy( getPaintcursors(), paintcursors);
		}
	}

	/**
	 * Get method for struct member 'drags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active dragged items. </p>
	 * @see #__DNA__FIELD__drags
	 */
	
	public ListBase getDrags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 336, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 236, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active dragged items. </p>
	 * @see #__DNA__FIELD__drags
	 */
	
	public void setDrags(ListBase drags) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 336;
		} else {
			__dna__offset = 236;
		}
		if (__io__equals(drags, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drags)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drags);
		} else {
			__io__generic__copy( getDrags(), drags);
		}
	}

	/**
	 * Get method for struct member 'keyconfigs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Known key configurations. </p>
	 * @see #__DNA__FIELD__keyconfigs
	 */
	
	public ListBase getKeyconfigs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 352, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 244, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keyconfigs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Known key configurations. </p>
	 * @see #__DNA__FIELD__keyconfigs
	 */
	
	public void setKeyconfigs(ListBase keyconfigs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 352;
		} else {
			__dna__offset = 244;
		}
		if (__io__equals(keyconfigs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, keyconfigs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, keyconfigs);
		} else {
			__io__generic__copy( getKeyconfigs(), keyconfigs);
		}
	}

	/**
	 * Get method for struct member 'defaultconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Default configuration. </p>
	 * @see #__DNA__FIELD__defaultconf
	 */
	
	public CPointer<wmKeyConfig> getDefaultconf() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 368);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 252);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmKeyConfig.class};
		return new CPointer<wmKeyConfig>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmKeyConfig.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'defaultconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Default configuration. </p>
	 * @see #__DNA__FIELD__defaultconf
	 */
	
	public void setDefaultconf(CPointer<wmKeyConfig> defaultconf) throws IOException
	{
		long __address = ((defaultconf == null) ? 0 : defaultconf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 368, __address);
		} else {
			__io__block.writeLong(__io__address + 252, __address);
		}
	}

	/**
	 * Get method for struct member 'addonconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Addon configuration. </p>
	 * @see #__DNA__FIELD__addonconf
	 */
	
	public CPointer<wmKeyConfig> getAddonconf() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmKeyConfig.class};
		return new CPointer<wmKeyConfig>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmKeyConfig.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'addonconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Addon configuration. </p>
	 * @see #__DNA__FIELD__addonconf
	 */
	
	public void setAddonconf(CPointer<wmKeyConfig> addonconf) throws IOException
	{
		long __address = ((addonconf == null) ? 0 : addonconf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 376, __address);
		} else {
			__io__block.writeLong(__io__address + 256, __address);
		}
	}

	/**
	 * Get method for struct member 'userconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> User configuration. </p>
	 * @see #__DNA__FIELD__userconf
	 */
	
	public CPointer<wmKeyConfig> getUserconf() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 384);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 260);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmKeyConfig.class};
		return new CPointer<wmKeyConfig>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmKeyConfig.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'userconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> User configuration. </p>
	 * @see #__DNA__FIELD__userconf
	 */
	
	public void setUserconf(CPointer<wmKeyConfig> userconf) throws IOException
	{
		long __address = ((userconf == null) ? 0 : userconf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 384, __address);
		} else {
			__io__block.writeLong(__io__address + 260, __address);
		}
	}

	/**
	 * Get method for struct member 'timers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active timers. </p>
	 * @see #__DNA__FIELD__timers
	 */
	
	public ListBase getTimers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 392, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 264, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'timers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active timers. </p>
	 * @see #__DNA__FIELD__timers
	 */
	
	public void setTimers(ListBase timers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 392;
		} else {
			__dna__offset = 264;
		}
		if (__io__equals(timers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, timers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, timers);
		} else {
			__io__generic__copy( getTimers(), timers);
		}
	}

	/**
	 * Get method for struct member 'autosavetimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Timer for auto save. </p>
	 * @see #__DNA__FIELD__autosavetimer
	 */
	
	public CPointer<Object> getAutosavetimer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 408);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'autosavetimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Timer for auto save. </p>
	 * @see #__DNA__FIELD__autosavetimer
	 */
	
	public void setAutosavetimer(CPointer<Object> autosavetimer) throws IOException
	{
		long __address = ((autosavetimer == null) ? 0 : autosavetimer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 408, __address);
		} else {
			__io__block.writeLong(__io__address + 272, __address);
		}
	}

	/**
	 * Get method for struct member 'undo_stack'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> All undo history (runtime only). </p>
	 * @see #__DNA__FIELD__undo_stack
	 */
	
	public CPointer<Object> getUndo_stack() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 416);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 276);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'undo_stack'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> All undo history (runtime only). </p>
	 * @see #__DNA__FIELD__undo_stack
	 */
	
	public void setUndo_stack(CPointer<Object> undo_stack) throws IOException
	{
		long __address = ((undo_stack == null) ? 0 : undo_stack.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 416, __address);
		} else {
			__io__block.writeLong(__io__address + 276, __address);
		}
	}

	/**
	 * Get method for struct member 'is_interface_locked'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Indicates whether interface is locked for user interaction. </p>
	 * @see #__DNA__FIELD__is_interface_locked
	 */
	
	public byte getIs_interface_locked() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 424);
		} else {
			return __io__block.readByte(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'is_interface_locked'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Indicates whether interface is locked for user interaction. </p>
	 * @see #__DNA__FIELD__is_interface_locked
	 */
	
	public void setIs_interface_locked(byte is_interface_locked) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 424, is_interface_locked);
		} else {
			__io__block.writeByte(__io__address + 280, is_interface_locked);
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
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 425, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 281, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 425;
		} else {
			__dna__offset = 281;
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
	 * Get method for struct member 'message_bus'.
	 * @see #__DNA__FIELD__message_bus
	 */
	
	public CPointer<Object> getMessage_bus() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 432);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'message_bus'.
	 * @see #__DNA__FIELD__message_bus
	 */
	
	public void setMessage_bus(CPointer<Object> message_bus) throws IOException
	{
		long __address = ((message_bus == null) ? 0 : message_bus.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 432, __address);
		} else {
			__io__block.writeLong(__io__address + 288, __address);
		}
	}

	/**
	 * Get method for struct member 'xr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #ifdef WITH_XR_OPENXR </p>
	 * @see #__DNA__FIELD__xr
	 */
	
	public wmXrData getXr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new wmXrData(__io__address + 440, __io__block, __io__blockTable);
		} else {
			return new wmXrData(__io__address + 292, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'xr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #ifdef WITH_XR_OPENXR </p>
	 * @see #__DNA__FIELD__xr
	 */
	
	public void setXr(wmXrData xr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 440;
		} else {
			__dna__offset = 292;
		}
		if (__io__equals(xr, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, xr)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, xr);
		} else {
			__io__generic__copy( getXr(), xr);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<wmWindowManager> __io__addressof() {
		return new CPointer<wmWindowManager>(__io__address, new Class[]{wmWindowManager.class}, __io__block, __io__blockTable);
	}

}
