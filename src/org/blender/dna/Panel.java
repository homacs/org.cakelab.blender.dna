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
 * <h4>Blender Source Code:</h4>
 * <p> The part from uiBlock that needs saved in file. </p>
 */

@CMetaData(size32=196, size64=224)
public class Panel extends CFacade {

	/**
	 * This is the sdna index of the struct Panel.
	 * <p>
	 * It is required when allocating a new block to store data for Panel.
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
	 * <p> Runtime. </p>
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
	 * <p> Runtime for drawing. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Defined as UI_MAX_NAME_STR. </p>
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
	 * Field descriptor (offset) for struct member 'drawname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  name is identifier for restoring location. </p>
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
	public static final long[] __DNA__FIELD__drawname = new long[]{80, 96};

	/**
	 * Field descriptor (offset) for struct member 'ofsx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset within the region. </p>
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
	public static final long[] __DNA__FIELD__ofsx = new long[]{144, 160};

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
	public static final long[] __DNA__FIELD__ofsy = new long[]{148, 164};

	/**
	 * Field descriptor (offset) for struct member 'sizex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  size including children. </p>
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
	public static final long[] __DNA__FIELD__sizex = new long[]{152, 168};

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
	public static final long[] __DNA__FIELD__sizey = new long[]{156, 172};

	/**
	 * Field descriptor (offset) for struct member 'blocksizex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  size excluding children. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__blocksizex);
	 * CPointer&lt;Integer&gt; p_blocksizex = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blocksizex'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blocksizex = new long[]{160, 176};

	/**
	 * Field descriptor (offset) for struct member 'blocksizey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__blocksizey);
	 * CPointer&lt;Integer&gt; p_blocksizey = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blocksizey'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blocksizey = new long[]{164, 180};

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
	public static final long[] __DNA__FIELD__labelofs = new long[]{168, 184};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{170, 186};

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
	public static final long[] __DNA__FIELD__flag = new long[]{172, 188};

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
	public static final long[] __DNA__FIELD__runtime_flag = new long[]{174, 190};

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
	public static final long[] __DNA__FIELD__control = new long[]{176, 192};

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
	public static final long[] __DNA__FIELD__snap = new long[]{178, 194};

	/**
	 * Field descriptor (offset) for struct member 'sortorder'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> s are aligned according to increasing sort-order. </p>
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
	public static final long[] __DNA__FIELD__sortorder = new long[]{180, 196};

	/**
	 * Field descriptor (offset) for struct member 'activedata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime for panel manipulation. </p>
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
	public static final long[] __DNA__FIELD__activedata = new long[]{184, 200};

	/**
	 * Field descriptor (offset) for struct member 'children'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sub panels. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Panel panel = ...;
	 * CPointer&lt;Object&gt; p = panel.__dna__addressof(Panel.__DNA__FIELD__children);
	 * CPointer&lt;ListBase&gt; p_children = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'children'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__children = new long[]{188, 208};

	public Panel(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Panel(Panel that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
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
	 * <p> Runtime. </p>
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
	 * <p> Runtime. </p>
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
	 * <p> Runtime for drawing. </p>
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
	 * <p> Runtime for drawing. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Defined as UI_MAX_NAME_STR. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Defined as UI_MAX_NAME_STR. </p>
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
	 * Get method for struct member 'drawname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  name is identifier for restoring location. </p>
	 * @see #__DNA__FIELD__drawname
	 */
	
	public CArrayFacade<Byte> getDrawname() throws IOException
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
	 * Set method for struct member 'drawname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  name is identifier for restoring location. </p>
	 * @see #__DNA__FIELD__drawname
	 */
	
	public void setDrawname(CArrayFacade<Byte> drawname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 80;
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset within the region. </p>
	 * @see #__DNA__FIELD__ofsx
	 */
	
	public int getOfsx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 160);
		} else {
			return __io__block.readInt(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'ofsx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset within the region. </p>
	 * @see #__DNA__FIELD__ofsx
	 */
	
	public void setOfsx(int ofsx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 160, ofsx);
		} else {
			__io__block.writeInt(__io__address + 144, ofsx);
		}
	}

	/**
	 * Get method for struct member 'ofsy'.
	 * @see #__DNA__FIELD__ofsy
	 */
	
	public int getOfsy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 164);
		} else {
			return __io__block.readInt(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'ofsy'.
	 * @see #__DNA__FIELD__ofsy
	 */
	
	public void setOfsy(int ofsy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 164, ofsy);
		} else {
			__io__block.writeInt(__io__address + 148, ofsy);
		}
	}

	/**
	 * Get method for struct member 'sizex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  size including children. </p>
	 * @see #__DNA__FIELD__sizex
	 */
	
	public int getSizex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 168);
		} else {
			return __io__block.readInt(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'sizex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  size including children. </p>
	 * @see #__DNA__FIELD__sizex
	 */
	
	public void setSizex(int sizex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 168, sizex);
		} else {
			__io__block.writeInt(__io__address + 152, sizex);
		}
	}

	/**
	 * Get method for struct member 'sizey'.
	 * @see #__DNA__FIELD__sizey
	 */
	
	public int getSizey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 172);
		} else {
			return __io__block.readInt(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'sizey'.
	 * @see #__DNA__FIELD__sizey
	 */
	
	public void setSizey(int sizey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 172, sizey);
		} else {
			__io__block.writeInt(__io__address + 156, sizey);
		}
	}

	/**
	 * Get method for struct member 'blocksizex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  size excluding children. </p>
	 * @see #__DNA__FIELD__blocksizex
	 */
	
	public int getBlocksizex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 176);
		} else {
			return __io__block.readInt(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'blocksizex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Panel}  size excluding children. </p>
	 * @see #__DNA__FIELD__blocksizex
	 */
	
	public void setBlocksizex(int blocksizex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 176, blocksizex);
		} else {
			__io__block.writeInt(__io__address + 160, blocksizex);
		}
	}

	/**
	 * Get method for struct member 'blocksizey'.
	 * @see #__DNA__FIELD__blocksizey
	 */
	
	public int getBlocksizey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 180);
		} else {
			return __io__block.readInt(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'blocksizey'.
	 * @see #__DNA__FIELD__blocksizey
	 */
	
	public void setBlocksizey(int blocksizey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 180, blocksizey);
		} else {
			__io__block.writeInt(__io__address + 164, blocksizey);
		}
	}

	/**
	 * Get method for struct member 'labelofs'.
	 * @see #__DNA__FIELD__labelofs
	 */
	
	public short getLabelofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 184);
		} else {
			return __io__block.readShort(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'labelofs'.
	 * @see #__DNA__FIELD__labelofs
	 */
	
	public void setLabelofs(short labelofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 184, labelofs);
		} else {
			__io__block.writeShort(__io__address + 168, labelofs);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 186, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 170, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 186;
		} else {
			__dna__offset = 170;
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
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 188);
		} else {
			return __io__block.readShort(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 188, flag);
		} else {
			__io__block.writeShort(__io__address + 172, flag);
		}
	}

	/**
	 * Get method for struct member 'runtime_flag'.
	 * @see #__DNA__FIELD__runtime_flag
	 */
	
	public short getRuntime_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 190);
		} else {
			return __io__block.readShort(__io__address + 174);
		}
	}

	/**
	 * Set method for struct member 'runtime_flag'.
	 * @see #__DNA__FIELD__runtime_flag
	 */
	
	public void setRuntime_flag(short runtime_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 190, runtime_flag);
		} else {
			__io__block.writeShort(__io__address + 174, runtime_flag);
		}
	}

	/**
	 * Get method for struct member 'control'.
	 * @see #__DNA__FIELD__control
	 */
	
	public short getControl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 192);
		} else {
			return __io__block.readShort(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'control'.
	 * @see #__DNA__FIELD__control
	 */
	
	public void setControl(short control) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 192, control);
		} else {
			__io__block.writeShort(__io__address + 176, control);
		}
	}

	/**
	 * Get method for struct member 'snap'.
	 * @see #__DNA__FIELD__snap
	 */
	
	public short getSnap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 194);
		} else {
			return __io__block.readShort(__io__address + 178);
		}
	}

	/**
	 * Set method for struct member 'snap'.
	 * @see #__DNA__FIELD__snap
	 */
	
	public void setSnap(short snap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 194, snap);
		} else {
			__io__block.writeShort(__io__address + 178, snap);
		}
	}

	/**
	 * Get method for struct member 'sortorder'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> s are aligned according to increasing sort-order. </p>
	 * @see #__DNA__FIELD__sortorder
	 */
	
	public int getSortorder() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 196);
		} else {
			return __io__block.readInt(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'sortorder'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> s are aligned according to increasing sort-order. </p>
	 * @see #__DNA__FIELD__sortorder
	 */
	
	public void setSortorder(int sortorder) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 196, sortorder);
		} else {
			__io__block.writeInt(__io__address + 180, sortorder);
		}
	}

	/**
	 * Get method for struct member 'activedata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime for panel manipulation. </p>
	 * @see #__DNA__FIELD__activedata
	 */
	
	public CPointer<Object> getActivedata() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'activedata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime for panel manipulation. </p>
	 * @see #__DNA__FIELD__activedata
	 */
	
	public void setActivedata(CPointer<Object> activedata) throws IOException
	{
		long __address = ((activedata == null) ? 0 : activedata.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 184, __address);
		}
	}

	/**
	 * Get method for struct member 'children'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sub panels. </p>
	 * @see #__DNA__FIELD__children
	 */
	
	public ListBase getChildren() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 208, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 188, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'children'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sub panels. </p>
	 * @see #__DNA__FIELD__children
	 */
	
	public void setChildren(ListBase children) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 188;
		}
		if (__io__equals(children, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, children)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, children);
		} else {
			__io__generic__copy( getChildren(), children);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Panel> __io__addressof() {
		return new CPointer<Panel>(__io__address, new Class[]{Panel.class}, __io__block, __io__blockTable);
	}

}
