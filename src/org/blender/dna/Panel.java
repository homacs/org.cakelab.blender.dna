package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Panel'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=248, size64=272)
public class Panel extends CFacade {

	/**
	 * This is the sdna index of the struct Panel.
	 * <p>
	 * It is required when allocating a new block to store data for Panel.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 258;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the part from uiBlock that needs saved in file </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;Panel&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, Panel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'Panel*'</li>
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
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;Panel&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, Panel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'Panel*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__type);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_type = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'PanelType*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'layout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Defines the structure of the panel in the UI<h4>Blender Source Code:</h4>
	 * <p> runtime for drawing </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__layout);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_layout = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layout'</li>
	 * <li>Signature: 'uiLayout*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layout = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'panelname'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__panelname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_panelname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'panelname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__panelname = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'tabname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> defined as UI_MAX_NAME_STR </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__tabname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_tabname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tabname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tabname = new long[]{80, 96};

	/**
	 * Field descriptor (offset) for struct member 'drawname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panelname is identifier for restoring location </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__drawname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_drawname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawname = new long[]{144, 160};

	/**
	 * Field descriptor (offset) for struct member 'ofsx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__ofsx);
	 * CPointer&lt;Integer&gt; p_ofsx = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ofsx'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ofsx = new long[]{208, 224};

	/**
	 * Field descriptor (offset) for struct member 'ofsy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__ofsy);
	 * CPointer&lt;Integer&gt; p_ofsy = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ofsy'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ofsy = new long[]{212, 228};

	/**
	 * Field descriptor (offset) for struct member 'sizex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__sizex);
	 * CPointer&lt;Integer&gt; p_sizex = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sizex'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sizex = new long[]{216, 232};

	/**
	 * Field descriptor (offset) for struct member 'sizey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__sizey);
	 * CPointer&lt;Integer&gt; p_sizey = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sizey'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sizey = new long[]{220, 236};

	/**
	 * Field descriptor (offset) for struct member 'labelofs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__labelofs);
	 * CPointer&lt;Short&gt; p_labelofs = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'labelofs'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__labelofs = new long[]{224, 240};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__pad);
	 * CPointer&lt;Short&gt; p_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{226, 242};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{228, 244};

	/**
	 * Field descriptor (offset) for struct member 'runtime_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__runtime_flag);
	 * CPointer&lt;Short&gt; p_runtime_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime_flag = new long[]{230, 246};

	/**
	 * Field descriptor (offset) for struct member 'control'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__control);
	 * CPointer&lt;Short&gt; p_control = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'control'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__control = new long[]{232, 248};

	/**
	 * Field descriptor (offset) for struct member 'snap'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__snap);
	 * CPointer&lt;Short&gt; p_snap = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap = new long[]{234, 250};

	/**
	 * Field descriptor (offset) for struct member 'sortorder'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panels are aligned according to increasing sortorder </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__sortorder);
	 * CPointer&lt;Integer&gt; p_sortorder = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sortorder'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sortorder = new long[]{236, 252};

	/**
	 * Field descriptor (offset) for struct member 'paneltab'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> this panel is tabbed in *paneltab </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__paneltab);
	 * CPointer&lt;CPointer&lt;Panel&gt;&gt; p_paneltab = p.cast(new Class[]{CPointer.class, Panel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paneltab'</li>
	 * <li>Signature: 'Panel*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paneltab = new long[]{240, 256};

	/**
	 * Field descriptor (offset) for struct member 'activedata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime for panel manipulation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__activedata);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_activedata = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'activedata'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__activedata = new long[]{244, 264};

	public Panel(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Panel(Panel that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the part from uiBlock that needs saved in file </p>
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<Panel> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Panel.class};
		return new CPointer<Panel>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Panel.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the part from uiBlock that needs saved in file </p>
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<Panel> next) throws IOException
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
	
	public CPointer<Panel> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Panel.class};
		return new CPointer<Panel>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Panel.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<Panel> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public CPointer<Object> getType() throws IOException
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
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(CPointer<Object> type) throws IOException
	{
		long __address = ((type == null) ? 0 : type.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'layout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Defines the structure of the panel in the UI<h4>Blender Source Code:</h4>
	 * <p> runtime for drawing </p>
	 * @see #__DNA__FIELD__layout
	 */
	
	public CPointer<Object> getLayout() throws IOException
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
	 * Set method for struct member 'layout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Defines the structure of the panel in the UI<h4>Blender Source Code:</h4>
	 * <p> runtime for drawing </p>
	 * @see #__DNA__FIELD__layout
	 */
	
	public void setLayout(CPointer<Object> layout) throws IOException
	{
		long __address = ((layout == null) ? 0 : layout.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'panelname'.
	 * @see #__DNA__FIELD__panelname
	 */
	
	public CArrayFacade<Byte> getPanelname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'panelname'.
	 * @see #__DNA__FIELD__panelname
	 */
	
	public void setPanelname(CArrayFacade<Byte> panelname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(panelname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, panelname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, panelname);
		} else {
			__io__generic__copy( getPanelname(), panelname);
		}
	}

	/**
	 * Get method for struct member 'tabname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> defined as UI_MAX_NAME_STR </p>
	 * @see #__DNA__FIELD__tabname
	 */
	
	public CArrayFacade<Byte> getTabname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tabname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> defined as UI_MAX_NAME_STR </p>
	 * @see #__DNA__FIELD__tabname
	 */
	
	public void setTabname(CArrayFacade<Byte> tabname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(tabname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tabname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tabname);
		} else {
			__io__generic__copy( getTabname(), tabname);
		}
	}

	/**
	 * Get method for struct member 'drawname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panelname is identifier for restoring location </p>
	 * @see #__DNA__FIELD__drawname
	 */
	
	public CArrayFacade<Byte> getDrawname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drawname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panelname is identifier for restoring location </p>
	 * @see #__DNA__FIELD__drawname
	 */
	
	public void setDrawname(CArrayFacade<Byte> drawname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 144;
		}
		if (__io__equals(drawname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drawname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drawname);
		} else {
			__io__generic__copy( getDrawname(), drawname);
		}
	}

	/**
	 * Get method for struct member 'ofsx'.
	 * @see #__DNA__FIELD__ofsx
	 */
	
	public int getOfsx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 224);
		} else {
			return __io__block.readInt(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'ofsx'.
	 * @see #__DNA__FIELD__ofsx
	 */
	
	public void setOfsx(int ofsx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 224, ofsx);
		} else {
			__io__block.writeInt(__io__address + 208, ofsx);
		}
	}

	/**
	 * Get method for struct member 'ofsy'.
	 * @see #__DNA__FIELD__ofsy
	 */
	
	public int getOfsy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 228);
		} else {
			return __io__block.readInt(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'ofsy'.
	 * @see #__DNA__FIELD__ofsy
	 */
	
	public void setOfsy(int ofsy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 228, ofsy);
		} else {
			__io__block.writeInt(__io__address + 212, ofsy);
		}
	}

	/**
	 * Get method for struct member 'sizex'.
	 * @see #__DNA__FIELD__sizex
	 */
	
	public int getSizex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 232);
		} else {
			return __io__block.readInt(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'sizex'.
	 * @see #__DNA__FIELD__sizex
	 */
	
	public void setSizex(int sizex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 232, sizex);
		} else {
			__io__block.writeInt(__io__address + 216, sizex);
		}
	}

	/**
	 * Get method for struct member 'sizey'.
	 * @see #__DNA__FIELD__sizey
	 */
	
	public int getSizey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 236);
		} else {
			return __io__block.readInt(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'sizey'.
	 * @see #__DNA__FIELD__sizey
	 */
	
	public void setSizey(int sizey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 236, sizey);
		} else {
			__io__block.writeInt(__io__address + 220, sizey);
		}
	}

	/**
	 * Get method for struct member 'labelofs'.
	 * @see #__DNA__FIELD__labelofs
	 */
	
	public short getLabelofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 240);
		} else {
			return __io__block.readShort(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'labelofs'.
	 * @see #__DNA__FIELD__labelofs
	 */
	
	public void setLabelofs(short labelofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 240, labelofs);
		} else {
			__io__block.writeShort(__io__address + 224, labelofs);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public short getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 242);
		} else {
			return __io__block.readShort(__io__address + 226);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(short pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 242, pad);
		} else {
			__io__block.writeShort(__io__address + 226, pad);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 244);
		} else {
			return __io__block.readShort(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 244, flag);
		} else {
			__io__block.writeShort(__io__address + 228, flag);
		}
	}

	/**
	 * Get method for struct member 'runtime_flag'.
	 * @see #__DNA__FIELD__runtime_flag
	 */
	
	public short getRuntime_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 246);
		} else {
			return __io__block.readShort(__io__address + 230);
		}
	}

	/**
	 * Set method for struct member 'runtime_flag'.
	 * @see #__DNA__FIELD__runtime_flag
	 */
	
	public void setRuntime_flag(short runtime_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 246, runtime_flag);
		} else {
			__io__block.writeShort(__io__address + 230, runtime_flag);
		}
	}

	/**
	 * Get method for struct member 'control'.
	 * @see #__DNA__FIELD__control
	 */
	
	public short getControl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 248);
		} else {
			return __io__block.readShort(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'control'.
	 * @see #__DNA__FIELD__control
	 */
	
	public void setControl(short control) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 248, control);
		} else {
			__io__block.writeShort(__io__address + 232, control);
		}
	}

	/**
	 * Get method for struct member 'snap'.
	 * @see #__DNA__FIELD__snap
	 */
	
	public short getSnap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 250);
		} else {
			return __io__block.readShort(__io__address + 234);
		}
	}

	/**
	 * Set method for struct member 'snap'.
	 * @see #__DNA__FIELD__snap
	 */
	
	public void setSnap(short snap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 250, snap);
		} else {
			__io__block.writeShort(__io__address + 234, snap);
		}
	}

	/**
	 * Get method for struct member 'sortorder'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panels are aligned according to increasing sortorder </p>
	 * @see #__DNA__FIELD__sortorder
	 */
	
	public int getSortorder() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 252);
		} else {
			return __io__block.readInt(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'sortorder'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panels are aligned according to increasing sortorder </p>
	 * @see #__DNA__FIELD__sortorder
	 */
	
	public void setSortorder(int sortorder) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 252, sortorder);
		} else {
			__io__block.writeInt(__io__address + 236, sortorder);
		}
	}

	/**
	 * Get method for struct member 'paneltab'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> this panel is tabbed in *paneltab </p>
	 * @see #__DNA__FIELD__paneltab
	 */
	
	public CPointer<Panel> getPaneltab() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Panel.class};
		return new CPointer<Panel>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Panel.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'paneltab'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> this panel is tabbed in *paneltab </p>
	 * @see #__DNA__FIELD__paneltab
	 */
	
	public void setPaneltab(CPointer<Panel> paneltab) throws IOException
	{
		long __address = ((paneltab == null) ? 0 : paneltab.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 256, __address);
		} else {
			__io__block.writeLong(__io__address + 240, __address);
		}
	}

	/**
	 * Get method for struct member 'activedata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime for panel manipulation </p>
	 * @see #__DNA__FIELD__activedata
	 */
	
	public CPointer<Object> getActivedata() throws IOException
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
	 * Set method for struct member 'activedata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime for panel manipulation </p>
	 * @see #__DNA__FIELD__activedata
	 */
	
	public void setActivedata(CPointer<Object> activedata) throws IOException
	{
		long __address = ((activedata == null) ? 0 : activedata.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 264, __address);
		} else {
			__io__block.writeLong(__io__address + 244, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Panel> __io__addressof() {
		return new CPointer<Panel>(__io__address, new Class[]{Panel.class}, __io__block, __io__blockTable);
	}

}
