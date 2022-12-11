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
 * Generated facet for DNA struct type 'SpaceSpreadsheet'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=60, size64=104)
public class SpaceSpreadsheet extends CFacade {

	/**
	 * This is the sdna index of the struct SpaceSpreadsheet.
	 * <p>
	 * It is required when allocating a new block to store data for SpaceSpreadsheet.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 706;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;SpaceLink&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, SpaceLink.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'SpaceLink*'</li>
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
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;SpaceLink&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, SpaceLink.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'SpaceLink*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Storage of regions for inactive spaces. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD__regionbase);
	 * CPointer&lt;ListBase&gt; p_regionbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'regionbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__regionbase = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'spacetype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD__spacetype);
	 * CPointer&lt;Byte&gt; p_spacetype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacetype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacetype = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'link_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD__link_flag);
	 * CPointer&lt;Byte&gt; p_link_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'link_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__link_flag = new long[]{17, 33};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{18, 34};

	/**
	 * Field descriptor (offset) for struct member 'columns'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Persistent data associated with spreadsheet columns
	 * <h4>Blender Source Code</h4>
	 * <p> End '{@link SpaceLink} ' header. List of {@link SpreadsheetColumn} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD__columns);
	 * CPointer&lt;ListBase&gt; p_columns = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'columns'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__columns = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'row_filters'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Filters to remove rows from the displayed data
	 * <h4>Blender Source Code</h4>
	 * <p>{@link SpreadsheetRowFilter} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD__row_filters);
	 * CPointer&lt;ListBase&gt; p_row_filters = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'row_filters'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__row_filters = new long[]{32, 56};

	/**
	 * Field descriptor (offset) for struct member 'viewer_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Path to the data that is displayed in the spreadsheet
	 * <h4>Blender Source Code</h4>
	 * <p> Context that is currently displayed in the editor. This is usually a either a single object (in original/evaluated mode) or path to a viewer node. This is retrieved from the workspace but can be pinned so that it stays constant even when the active node changes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD__viewer_path);
	 * CPointer&lt;ViewerPath&gt; p_viewer_path = p.cast(new Class[]{ViewerPath.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewer_path'</li>
	 * <li>Signature: 'ViewerPath'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewer_path = new long[]{40, 72};

	/**
	 * Field descriptor (offset) for struct member 'filter_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eSpaceSpreadsheet_FilterFlag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD__filter_flag);
	 * CPointer&lt;Byte&gt; p_filter_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter_flag'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter_flag = new long[]{48, 88};

	/**
	 * Field descriptor (offset) for struct member 'geometry_component_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Part of the geometry to display data from
	 * <h4>Blender Source Code</h4>
	 * <p> #GeometryComponentType. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD__geometry_component_type);
	 * CPointer&lt;Byte&gt; p_geometry_component_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'geometry_component_type'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__geometry_component_type = new long[]{49, 89};

	/**
	 * Field descriptor (offset) for struct member 'attribute_domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Attribute domain to display
	 * <h4>Blender Source Code</h4>
	 * <p> #eAttrDomain. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD__attribute_domain);
	 * CPointer&lt;Byte&gt; p_attribute_domain = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attribute_domain'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attribute_domain = new long[]{50, 90};

	/**
	 * Field descriptor (offset) for struct member 'object_eval_state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eSpaceSpreadsheet_ObjectEvalState. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD__object_eval_state);
	 * CPointer&lt;Byte&gt; p_object_eval_state = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_eval_state'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_eval_state = new long[]{51, 91};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eSpaceSpreadsheet_Flag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{52, 92};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSpreadsheet spacespreadsheet = ...;
	 * CPointer&lt;Object&gt; p = spacespreadsheet.__dna__addressof(SpaceSpreadsheet.__DNA__FIELD__runtime);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_runtime = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'SpaceSpreadsheet_Runtime*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{56, 96};

	public SpaceSpreadsheet(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpaceSpreadsheet(SpaceSpreadsheet that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<SpaceLink> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpaceLink.class};
		return new CPointer<SpaceLink>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpaceLink.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<SpaceLink> next) throws IOException
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
	
	public CPointer<SpaceLink> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpaceLink.class};
		return new CPointer<SpaceLink>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpaceLink.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<SpaceLink> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Storage of regions for inactive spaces. </p>
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public ListBase getRegionbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Storage of regions for inactive spaces. </p>
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public void setRegionbase(ListBase regionbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
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
	 * Get method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public byte getSpacetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 32);
		} else {
			return __io__block.readByte(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public void setSpacetype(byte spacetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 32, spacetype);
		} else {
			__io__block.writeByte(__io__address + 16, spacetype);
		}
	}

	/**
	 * Get method for struct member 'link_flag'.
	 * @see #__DNA__FIELD__link_flag
	 */
	
	public byte getLink_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 33);
		} else {
			return __io__block.readByte(__io__address + 17);
		}
	}

	/**
	 * Set method for struct member 'link_flag'.
	 * @see #__DNA__FIELD__link_flag
	 */
	
	public void setLink_flag(byte link_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 33, link_flag);
		} else {
			__io__block.writeByte(__io__address + 17, link_flag);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 34, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 18, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 34;
		} else {
			__dna__offset = 18;
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
	 * Get method for struct member 'columns'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Persistent data associated with spreadsheet columns
	 * <h4>Blender Source Code</h4>
	 * <p> End '{@link SpaceLink} ' header. List of {@link SpreadsheetColumn} . </p>
	 * @see #__DNA__FIELD__columns
	 */
	
	public ListBase getColumns() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 40, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 24, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'columns'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Persistent data associated with spreadsheet columns
	 * <h4>Blender Source Code</h4>
	 * <p> End '{@link SpaceLink} ' header. List of {@link SpreadsheetColumn} . </p>
	 * @see #__DNA__FIELD__columns
	 */
	
	public void setColumns(ListBase columns) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(columns, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, columns)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, columns);
		} else {
			__io__generic__copy( getColumns(), columns);
		}
	}

	/**
	 * Get method for struct member 'row_filters'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Filters to remove rows from the displayed data
	 * <h4>Blender Source Code</h4>
	 * <p>{@link SpreadsheetRowFilter} . </p>
	 * @see #__DNA__FIELD__row_filters
	 */
	
	public ListBase getRow_filters() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 56, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 32, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'row_filters'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Filters to remove rows from the displayed data
	 * <h4>Blender Source Code</h4>
	 * <p>{@link SpreadsheetRowFilter} . </p>
	 * @see #__DNA__FIELD__row_filters
	 */
	
	public void setRow_filters(ListBase row_filters) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(row_filters, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, row_filters)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, row_filters);
		} else {
			__io__generic__copy( getRow_filters(), row_filters);
		}
	}

	/**
	 * Get method for struct member 'viewer_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Path to the data that is displayed in the spreadsheet
	 * <h4>Blender Source Code</h4>
	 * <p> Context that is currently displayed in the editor. This is usually a either a single object (in original/evaluated mode) or path to a viewer node. This is retrieved from the workspace but can be pinned so that it stays constant even when the active node changes. </p>
	 * @see #__DNA__FIELD__viewer_path
	 */
	
	public ViewerPath getViewer_path() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ViewerPath(__io__address + 72, __io__block, __io__blockTable);
		} else {
			return new ViewerPath(__io__address + 40, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'viewer_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Path to the data that is displayed in the spreadsheet
	 * <h4>Blender Source Code</h4>
	 * <p> Context that is currently displayed in the editor. This is usually a either a single object (in original/evaluated mode) or path to a viewer node. This is retrieved from the workspace but can be pinned so that it stays constant even when the active node changes. </p>
	 * @see #__DNA__FIELD__viewer_path
	 */
	
	public void setViewer_path(ViewerPath viewer_path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(viewer_path, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, viewer_path)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, viewer_path);
		} else {
			__io__generic__copy( getViewer_path(), viewer_path);
		}
	}

	/**
	 * Get method for struct member 'filter_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eSpaceSpreadsheet_FilterFlag. </p>
	 * @see #__DNA__FIELD__filter_flag
	 */
	
	public byte getFilter_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 88);
		} else {
			return __io__block.readByte(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'filter_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eSpaceSpreadsheet_FilterFlag. </p>
	 * @see #__DNA__FIELD__filter_flag
	 */
	
	public void setFilter_flag(byte filter_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 88, filter_flag);
		} else {
			__io__block.writeByte(__io__address + 48, filter_flag);
		}
	}

	/**
	 * Get method for struct member 'geometry_component_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Part of the geometry to display data from
	 * <h4>Blender Source Code</h4>
	 * <p> #GeometryComponentType. </p>
	 * @see #__DNA__FIELD__geometry_component_type
	 */
	
	public byte getGeometry_component_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 89);
		} else {
			return __io__block.readByte(__io__address + 49);
		}
	}

	/**
	 * Set method for struct member 'geometry_component_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Part of the geometry to display data from
	 * <h4>Blender Source Code</h4>
	 * <p> #GeometryComponentType. </p>
	 * @see #__DNA__FIELD__geometry_component_type
	 */
	
	public void setGeometry_component_type(byte geometry_component_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 89, geometry_component_type);
		} else {
			__io__block.writeByte(__io__address + 49, geometry_component_type);
		}
	}

	/**
	 * Get method for struct member 'attribute_domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Attribute domain to display
	 * <h4>Blender Source Code</h4>
	 * <p> #eAttrDomain. </p>
	 * @see #__DNA__FIELD__attribute_domain
	 */
	
	public byte getAttribute_domain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 90);
		} else {
			return __io__block.readByte(__io__address + 50);
		}
	}

	/**
	 * Set method for struct member 'attribute_domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Attribute domain to display
	 * <h4>Blender Source Code</h4>
	 * <p> #eAttrDomain. </p>
	 * @see #__DNA__FIELD__attribute_domain
	 */
	
	public void setAttribute_domain(byte attribute_domain) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 90, attribute_domain);
		} else {
			__io__block.writeByte(__io__address + 50, attribute_domain);
		}
	}

	/**
	 * Get method for struct member 'object_eval_state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eSpaceSpreadsheet_ObjectEvalState. </p>
	 * @see #__DNA__FIELD__object_eval_state
	 */
	
	public byte getObject_eval_state() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 91);
		} else {
			return __io__block.readByte(__io__address + 51);
		}
	}

	/**
	 * Set method for struct member 'object_eval_state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eSpaceSpreadsheet_ObjectEvalState. </p>
	 * @see #__DNA__FIELD__object_eval_state
	 */
	
	public void setObject_eval_state(byte object_eval_state) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 91, object_eval_state);
		} else {
			__io__block.writeByte(__io__address + 51, object_eval_state);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eSpaceSpreadsheet_Flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 92);
		} else {
			return __io__block.readInt(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> eSpaceSpreadsheet_Flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 92, flag);
		} else {
			__io__block.writeInt(__io__address + 52, flag);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public CPointer<Object> getRuntime() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(CPointer<Object> runtime) throws IOException
	{
		long __address = ((runtime == null) ? 0 : runtime.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 56, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpaceSpreadsheet> __io__addressof() {
		return new CPointer<SpaceSpreadsheet>(__io__address, new Class[]{SpaceSpreadsheet.class}, __io__block, __io__blockTable);
	}

}
