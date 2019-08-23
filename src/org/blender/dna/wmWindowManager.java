package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'wmWindowManager'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> reports need to be before {@link wmWindowManager}  windowmanager is saved, tag WMAN </p>
 */

@CMetaData(size32=232, size64=352)
public class wmWindowManager extends CFacade {

	/**
	 * This is the sdna index of the struct wmWindowManager.
	 * <p>
	 * It is required when allocating a new block to store data for wmWindowManager.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 499;

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
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'windrawable'.
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
	public static final long[] __DNA__FIELD__windrawable = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'winactive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> separate active from drawable </p>
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
	public static final long[] __DNA__FIELD__winactive = new long[]{104, 128};

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
	public static final long[] __DNA__FIELD__windows = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'initialized'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> set on file read </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__initialized);
	 * CPointer&lt;Integer&gt; p_initialized = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'initialized'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__initialized = new long[]{116, 152};

	/**
	 * Field descriptor (offset) for struct member 'file_saved'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indicator whether data was saved </p>
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
	public static final long[] __DNA__FIELD__file_saved = new long[]{120, 156};

	/**
	 * Field descriptor (offset) for struct member 'op_undo_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> operator stack depth to avoid nested undo pushes </p>
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
	public static final long[] __DNA__FIELD__op_undo_depth = new long[]{122, 158};

	/**
	 * Field descriptor (offset) for struct member 'operators'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> operator registry </p>
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
	public static final long[] __DNA__FIELD__operators = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'queue'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> refresh/redraw wmNotifier structs </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__queue);
	 * CPointer&lt;ListBase&gt; p_queue = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'queue'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__queue = new long[]{132, 176};

	/**
	 * Field descriptor (offset) for struct member 'reports'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> information and error reports </p>
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
	public static final long[] __DNA__FIELD__reports = new long[]{140, 192};

	/**
	 * Field descriptor (offset) for struct member 'jobs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> threaded jobs manager </p>
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
	public static final long[] __DNA__FIELD__jobs = new long[]{168, 232};

	/**
	 * Field descriptor (offset) for struct member 'paintcursors'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> extra overlay cursors to draw, like circles </p>
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
	public static final long[] __DNA__FIELD__paintcursors = new long[]{176, 248};

	/**
	 * Field descriptor (offset) for struct member 'drags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active dragged items </p>
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
	public static final long[] __DNA__FIELD__drags = new long[]{184, 264};

	/**
	 * Field descriptor (offset) for struct member 'keyconfigs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> known key configurations </p>
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
	public static final long[] __DNA__FIELD__keyconfigs = new long[]{192, 280};

	/**
	 * Field descriptor (offset) for struct member 'defaultconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> default configuration </p>
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
	public static final long[] __DNA__FIELD__defaultconf = new long[]{200, 296};

	/**
	 * Field descriptor (offset) for struct member 'addonconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> addon configuration </p>
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
	public static final long[] __DNA__FIELD__addonconf = new long[]{204, 304};

	/**
	 * Field descriptor (offset) for struct member 'userconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> user configuration </p>
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
	public static final long[] __DNA__FIELD__userconf = new long[]{208, 312};

	/**
	 * Field descriptor (offset) for struct member 'timers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active timers </p>
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
	public static final long[] __DNA__FIELD__timers = new long[]{212, 320};

	/**
	 * Field descriptor (offset) for struct member 'autosavetimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> timer for auto save </p>
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
	public static final long[] __DNA__FIELD__autosavetimer = new long[]{220, 336};

	/**
	 * Field descriptor (offset) for struct member 'is_interface_locked'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indicates whether interface is locked for user interaction </p>
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
	public static final long[] __DNA__FIELD__is_interface_locked = new long[]{224, 344};

	/**
	 * Field descriptor (offset) for struct member 'par'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindowManager wmwindowmanager = ...;
	 * CPointer&lt;Object&gt; p = wmwindowmanager.__dna__addressof(wmWindowManager.__DNA__FIELD__par);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_par = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'par'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__par = new long[]{225, 345};

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
	 * @see #__DNA__FIELD__windrawable
	 */
	
	public CPointer<wmWindow> getWindrawable() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmWindow.class};
		return new CPointer<wmWindow>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmWindow.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'windrawable'.
	 * @see #__DNA__FIELD__windrawable
	 */
	
	public void setWindrawable(CPointer<wmWindow> windrawable) throws IOException
	{
		long __address = ((windrawable == null) ? 0 : windrawable.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'winactive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> separate active from drawable </p>
	 * @see #__DNA__FIELD__winactive
	 */
	
	public CPointer<wmWindow> getWinactive() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmWindow.class};
		return new CPointer<wmWindow>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmWindow.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'winactive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> separate active from drawable </p>
	 * @see #__DNA__FIELD__winactive
	 */
	
	public void setWinactive(CPointer<wmWindow> winactive) throws IOException
	{
		long __address = ((winactive == null) ? 0 : winactive.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'windows'.
	 * @see #__DNA__FIELD__windows
	 */
	
	public ListBase getWindows() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 136, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 108, __io__block, __io__blockTable);
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
			__dna__offset = 136;
		} else {
			__dna__offset = 108;
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
	 * <h4>Blender Source Code:</h4>
	 * <p> set on file read </p>
	 * @see #__DNA__FIELD__initialized
	 */
	
	public int getInitialized() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 152);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'initialized'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> set on file read </p>
	 * @see #__DNA__FIELD__initialized
	 */
	
	public void setInitialized(int initialized) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 152, initialized);
		} else {
			__io__block.writeInt(__io__address + 116, initialized);
		}
	}

	/**
	 * Get method for struct member 'file_saved'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indicator whether data was saved </p>
	 * @see #__DNA__FIELD__file_saved
	 */
	
	public short getFile_saved() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 156);
		} else {
			return __io__block.readShort(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'file_saved'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indicator whether data was saved </p>
	 * @see #__DNA__FIELD__file_saved
	 */
	
	public void setFile_saved(short file_saved) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 156, file_saved);
		} else {
			__io__block.writeShort(__io__address + 120, file_saved);
		}
	}

	/**
	 * Get method for struct member 'op_undo_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> operator stack depth to avoid nested undo pushes </p>
	 * @see #__DNA__FIELD__op_undo_depth
	 */
	
	public short getOp_undo_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 158);
		} else {
			return __io__block.readShort(__io__address + 122);
		}
	}

	/**
	 * Set method for struct member 'op_undo_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> operator stack depth to avoid nested undo pushes </p>
	 * @see #__DNA__FIELD__op_undo_depth
	 */
	
	public void setOp_undo_depth(short op_undo_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 158, op_undo_depth);
		} else {
			__io__block.writeShort(__io__address + 122, op_undo_depth);
		}
	}

	/**
	 * Get method for struct member 'operators'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> operator registry </p>
	 * @see #__DNA__FIELD__operators
	 */
	
	public ListBase getOperators() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 160, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 124, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'operators'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> operator registry </p>
	 * @see #__DNA__FIELD__operators
	 */
	
	public void setOperators(ListBase operators) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 124;
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
	 * Get method for struct member 'queue'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> refresh/redraw wmNotifier structs </p>
	 * @see #__DNA__FIELD__queue
	 */
	
	public ListBase getQueue() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 176, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 132, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'queue'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> refresh/redraw wmNotifier structs </p>
	 * @see #__DNA__FIELD__queue
	 */
	
	public void setQueue(ListBase queue) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 176;
		} else {
			__dna__offset = 132;
		}
		if (__io__equals(queue, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, queue)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, queue);
		} else {
			__io__generic__copy( getQueue(), queue);
		}
	}

	/**
	 * Get method for struct member 'reports'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> information and error reports </p>
	 * @see #__DNA__FIELD__reports
	 */
	
	public ReportList getReports() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ReportList(__io__address + 192, __io__block, __io__blockTable);
		} else {
			return new ReportList(__io__address + 140, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'reports'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> information and error reports </p>
	 * @see #__DNA__FIELD__reports
	 */
	
	public void setReports(ReportList reports) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 140;
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
	 * <h4>Blender Source Code:</h4>
	 * <p> threaded jobs manager </p>
	 * @see #__DNA__FIELD__jobs
	 */
	
	public ListBase getJobs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 232, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 168, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'jobs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> threaded jobs manager </p>
	 * @see #__DNA__FIELD__jobs
	 */
	
	public void setJobs(ListBase jobs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 232;
		} else {
			__dna__offset = 168;
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
	 * <h4>Blender Source Code:</h4>
	 * <p> extra overlay cursors to draw, like circles </p>
	 * @see #__DNA__FIELD__paintcursors
	 */
	
	public ListBase getPaintcursors() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 248, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 176, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'paintcursors'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> extra overlay cursors to draw, like circles </p>
	 * @see #__DNA__FIELD__paintcursors
	 */
	
	public void setPaintcursors(ListBase paintcursors) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 176;
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
	 * <h4>Blender Source Code:</h4>
	 * <p> active dragged items </p>
	 * @see #__DNA__FIELD__drags
	 */
	
	public ListBase getDrags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 264, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 184, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active dragged items </p>
	 * @see #__DNA__FIELD__drags
	 */
	
	public void setDrags(ListBase drags) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 264;
		} else {
			__dna__offset = 184;
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
	 * <h4>Blender Source Code:</h4>
	 * <p> known key configurations </p>
	 * @see #__DNA__FIELD__keyconfigs
	 */
	
	public ListBase getKeyconfigs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 280, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 192, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keyconfigs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> known key configurations </p>
	 * @see #__DNA__FIELD__keyconfigs
	 */
	
	public void setKeyconfigs(ListBase keyconfigs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 280;
		} else {
			__dna__offset = 192;
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
	 * <h4>Blender Source Code:</h4>
	 * <p> default configuration </p>
	 * @see #__DNA__FIELD__defaultconf
	 */
	
	public CPointer<wmKeyConfig> getDefaultconf() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 296);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmKeyConfig.class};
		return new CPointer<wmKeyConfig>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmKeyConfig.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'defaultconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> default configuration </p>
	 * @see #__DNA__FIELD__defaultconf
	 */
	
	public void setDefaultconf(CPointer<wmKeyConfig> defaultconf) throws IOException
	{
		long __address = ((defaultconf == null) ? 0 : defaultconf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 296, __address);
		} else {
			__io__block.writeLong(__io__address + 200, __address);
		}
	}

	/**
	 * Get method for struct member 'addonconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> addon configuration </p>
	 * @see #__DNA__FIELD__addonconf
	 */
	
	public CPointer<wmKeyConfig> getAddonconf() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 304);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 204);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmKeyConfig.class};
		return new CPointer<wmKeyConfig>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmKeyConfig.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'addonconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> addon configuration </p>
	 * @see #__DNA__FIELD__addonconf
	 */
	
	public void setAddonconf(CPointer<wmKeyConfig> addonconf) throws IOException
	{
		long __address = ((addonconf == null) ? 0 : addonconf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 304, __address);
		} else {
			__io__block.writeLong(__io__address + 204, __address);
		}
	}

	/**
	 * Get method for struct member 'userconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> user configuration </p>
	 * @see #__DNA__FIELD__userconf
	 */
	
	public CPointer<wmKeyConfig> getUserconf() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 312);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmKeyConfig.class};
		return new CPointer<wmKeyConfig>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmKeyConfig.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'userconf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> user configuration </p>
	 * @see #__DNA__FIELD__userconf
	 */
	
	public void setUserconf(CPointer<wmKeyConfig> userconf) throws IOException
	{
		long __address = ((userconf == null) ? 0 : userconf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 312, __address);
		} else {
			__io__block.writeLong(__io__address + 208, __address);
		}
	}

	/**
	 * Get method for struct member 'timers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active timers </p>
	 * @see #__DNA__FIELD__timers
	 */
	
	public ListBase getTimers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 320, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 212, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'timers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active timers </p>
	 * @see #__DNA__FIELD__timers
	 */
	
	public void setTimers(ListBase timers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 320;
		} else {
			__dna__offset = 212;
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
	 * <h4>Blender Source Code:</h4>
	 * <p> timer for auto save </p>
	 * @see #__DNA__FIELD__autosavetimer
	 */
	
	public CPointer<Object> getAutosavetimer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 336);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 220);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'autosavetimer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> timer for auto save </p>
	 * @see #__DNA__FIELD__autosavetimer
	 */
	
	public void setAutosavetimer(CPointer<Object> autosavetimer) throws IOException
	{
		long __address = ((autosavetimer == null) ? 0 : autosavetimer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 336, __address);
		} else {
			__io__block.writeLong(__io__address + 220, __address);
		}
	}

	/**
	 * Get method for struct member 'is_interface_locked'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indicates whether interface is locked for user interaction </p>
	 * @see #__DNA__FIELD__is_interface_locked
	 */
	
	public byte getIs_interface_locked() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 344);
		} else {
			return __io__block.readByte(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'is_interface_locked'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> indicates whether interface is locked for user interaction </p>
	 * @see #__DNA__FIELD__is_interface_locked
	 */
	
	public void setIs_interface_locked(byte is_interface_locked) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 344, is_interface_locked);
		} else {
			__io__block.writeByte(__io__address + 224, is_interface_locked);
		}
	}

	/**
	 * Get method for struct member 'par'.
	 * @see #__DNA__FIELD__par
	 */
	
	public CArrayFacade<Byte> getPar() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 345, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 225, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'par'.
	 * @see #__DNA__FIELD__par
	 */
	
	public void setPar(CArrayFacade<Byte> par) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 345;
		} else {
			__dna__offset = 225;
		}
		if (__io__equals(par, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, par)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, par);
		} else {
			__io__generic__copy( getPar(), par);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<wmWindowManager> __io__addressof() {
		return new CPointer<wmWindowManager>(__io__address, new Class[]{wmWindowManager.class}, __io__block, __io__blockTable);
	}

}
