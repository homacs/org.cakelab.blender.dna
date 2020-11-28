package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpaceFile'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> File Browser </p>
 */

@CMetaData(size32=72, size64=120)
public class SpaceFile extends CFacade {

	/**
	 * This is the sdna index of the struct SpaceFile.
	 * <p>
	 * It is required when allocating a new block to store data for SpaceFile.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 232;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__next);
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
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__prev);
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
	 * <h4>Blender Source Code:</h4>
	 * <p> Storage of regions for inactive spaces. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__regionbase);
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
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__spacetype);
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
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__link_flag);
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
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD___pad0);
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
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'scroll_offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__scroll_offset);
	 * CPointer&lt;Integer&gt; p_scroll_offset = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scroll_offset'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scroll_offset = new long[]{28, 44};

	/**
	 * Field descriptor (offset) for struct member 'params'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Config and input for file select. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__params);
	 * CPointer&lt;CPointer&lt;FileSelectParams&gt;&gt; p_params = p.cast(new Class[]{CPointer.class, FileSelectParams.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'params'</li>
	 * <li>Signature: 'FileSelectParams*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__params = new long[]{32, 48};

	/**
	 * Field descriptor (offset) for struct member 'files'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the list of files to show. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__files);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_files = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'files'</li>
	 * <li>Signature: 'FileList*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__files = new long[]{36, 56};

	/**
	 * Field descriptor (offset) for struct member 'folders_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the list of previous directories to show. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__folders_prev);
	 * CPointer&lt;CPointer&lt;ListBase&gt;&gt; p_folders_prev = p.cast(new Class[]{CPointer.class, ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'folders_prev'</li>
	 * <li>Signature: 'ListBase*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__folders_prev = new long[]{40, 64};

	/**
	 * Field descriptor (offset) for struct member 'folders_next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the list of next directories (pushed from previous) to show. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__folders_next);
	 * CPointer&lt;CPointer&lt;ListBase&gt;&gt; p_folders_next = p.cast(new Class[]{CPointer.class, ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'folders_next'</li>
	 * <li>Signature: 'ListBase*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__folders_next = new long[]{44, 72};

	/**
	 * Field descriptor (offset) for struct member 'op'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> operator that is invoking fileselect op->exec() will be called on the 'Load' button. if operator provides op->cancel(), then this will be invoked on the cancel button. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__op);
	 * CPointer&lt;CPointer&lt;wmOperator&gt;&gt; p_op = p.cast(new Class[]{CPointer.class, wmOperator.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'op'</li>
	 * <li>Signature: 'wmOperator*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__op = new long[]{48, 80};

	/**
	 * Field descriptor (offset) for struct member 'smoothscroll_timer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__smoothscroll_timer);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_smoothscroll_timer = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smoothscroll_timer'</li>
	 * <li>Signature: 'wmTimer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smoothscroll_timer = new long[]{52, 88};

	/**
	 * Field descriptor (offset) for struct member 'previews_timer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__previews_timer);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_previews_timer = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'previews_timer'</li>
	 * <li>Signature: 'wmTimer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__previews_timer = new long[]{56, 96};

	/**
	 * Field descriptor (offset) for struct member 'layout'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__layout);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_layout = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layout'</li>
	 * <li>Signature: 'FileLayout*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layout = new long[]{60, 104};

	/**
	 * Field descriptor (offset) for struct member 'recentnr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__recentnr);
	 * CPointer&lt;Short&gt; p_recentnr = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'recentnr'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__recentnr = new long[]{64, 112};

	/**
	 * Field descriptor (offset) for struct member 'bookmarknr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__bookmarknr);
	 * CPointer&lt;Short&gt; p_bookmarknr = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bookmarknr'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bookmarknr = new long[]{66, 114};

	/**
	 * Field descriptor (offset) for struct member 'systemnr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__systemnr);
	 * CPointer&lt;Short&gt; p_systemnr = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'systemnr'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__systemnr = new long[]{68, 116};

	/**
	 * Field descriptor (offset) for struct member 'system_bookmarknr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceFile spacefile = ...;
	 * CPointer&lt;Object&gt; p = spacefile.__dna__addressof(SpaceFile.__DNA__FIELD__system_bookmarknr);
	 * CPointer&lt;Short&gt; p_system_bookmarknr = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'system_bookmarknr'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__system_bookmarknr = new long[]{70, 118};

	public SpaceFile(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpaceFile(SpaceFile that) {
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
	 * <h4>Blender Source Code:</h4>
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
	 * <h4>Blender Source Code:</h4>
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
	 * Get method for struct member '_pad1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. </p>
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. </p>
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(_pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1);
		} else {
			__io__generic__copy( get_pad1(), _pad1);
		}
	}

	/**
	 * Get method for struct member 'scroll_offset'.
	 * @see #__DNA__FIELD__scroll_offset
	 */
	
	public int getScroll_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'scroll_offset'.
	 * @see #__DNA__FIELD__scroll_offset
	 */
	
	public void setScroll_offset(int scroll_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, scroll_offset);
		} else {
			__io__block.writeInt(__io__address + 28, scroll_offset);
		}
	}

	/**
	 * Get method for struct member 'params'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Config and input for file select. </p>
	 * @see #__DNA__FIELD__params
	 */
	
	public CPointer<FileSelectParams> getParams() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FileSelectParams.class};
		return new CPointer<FileSelectParams>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FileSelectParams.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'params'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Config and input for file select. </p>
	 * @see #__DNA__FIELD__params
	 */
	
	public void setParams(CPointer<FileSelectParams> params) throws IOException
	{
		long __address = ((params == null) ? 0 : params.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 32, __address);
		}
	}

	/**
	 * Get method for struct member 'files'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the list of files to show. </p>
	 * @see #__DNA__FIELD__files
	 */
	
	public CPointer<Object> getFiles() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 36);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'files'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the list of files to show. </p>
	 * @see #__DNA__FIELD__files
	 */
	
	public void setFiles(CPointer<Object> files) throws IOException
	{
		long __address = ((files == null) ? 0 : files.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 56, __address);
		} else {
			__io__block.writeLong(__io__address + 36, __address);
		}
	}

	/**
	 * Get method for struct member 'folders_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the list of previous directories to show. </p>
	 * @see #__DNA__FIELD__folders_prev
	 */
	
	public CPointer<ListBase> getFolders_prev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ListBase.class};
		return new CPointer<ListBase>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ListBase.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'folders_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the list of previous directories to show. </p>
	 * @see #__DNA__FIELD__folders_prev
	 */
	
	public void setFolders_prev(CPointer<ListBase> folders_prev) throws IOException
	{
		long __address = ((folders_prev == null) ? 0 : folders_prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 40, __address);
		}
	}

	/**
	 * Get method for struct member 'folders_next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the list of next directories (pushed from previous) to show. </p>
	 * @see #__DNA__FIELD__folders_next
	 */
	
	public CPointer<ListBase> getFolders_next() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 44);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ListBase.class};
		return new CPointer<ListBase>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ListBase.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'folders_next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the list of next directories (pushed from previous) to show. </p>
	 * @see #__DNA__FIELD__folders_next
	 */
	
	public void setFolders_next(CPointer<ListBase> folders_next) throws IOException
	{
		long __address = ((folders_next == null) ? 0 : folders_next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 72, __address);
		} else {
			__io__block.writeLong(__io__address + 44, __address);
		}
	}

	/**
	 * Get method for struct member 'op'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> operator that is invoking fileselect op->exec() will be called on the 'Load' button. if operator provides op->cancel(), then this will be invoked on the cancel button. </p>
	 * @see #__DNA__FIELD__op
	 */
	
	public CPointer<wmOperator> getOp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmOperator.class};
		return new CPointer<wmOperator>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmOperator.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'op'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> operator that is invoking fileselect op->exec() will be called on the 'Load' button. if operator provides op->cancel(), then this will be invoked on the cancel button. </p>
	 * @see #__DNA__FIELD__op
	 */
	
	public void setOp(CPointer<wmOperator> op) throws IOException
	{
		long __address = ((op == null) ? 0 : op.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 48, __address);
		}
	}

	/**
	 * Get method for struct member 'smoothscroll_timer'.
	 * @see #__DNA__FIELD__smoothscroll_timer
	 */
	
	public CPointer<Object> getSmoothscroll_timer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 52);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'smoothscroll_timer'.
	 * @see #__DNA__FIELD__smoothscroll_timer
	 */
	
	public void setSmoothscroll_timer(CPointer<Object> smoothscroll_timer) throws IOException
	{
		long __address = ((smoothscroll_timer == null) ? 0 : smoothscroll_timer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 52, __address);
		}
	}

	/**
	 * Get method for struct member 'previews_timer'.
	 * @see #__DNA__FIELD__previews_timer
	 */
	
	public CPointer<Object> getPreviews_timer() throws IOException
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
	 * Set method for struct member 'previews_timer'.
	 * @see #__DNA__FIELD__previews_timer
	 */
	
	public void setPreviews_timer(CPointer<Object> previews_timer) throws IOException
	{
		long __address = ((previews_timer == null) ? 0 : previews_timer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 56, __address);
		}
	}

	/**
	 * Get method for struct member 'layout'.
	 * @see #__DNA__FIELD__layout
	 */
	
	public CPointer<Object> getLayout() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 60);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'layout'.
	 * @see #__DNA__FIELD__layout
	 */
	
	public void setLayout(CPointer<Object> layout) throws IOException
	{
		long __address = ((layout == null) ? 0 : layout.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 60, __address);
		}
	}

	/**
	 * Get method for struct member 'recentnr'.
	 * @see #__DNA__FIELD__recentnr
	 */
	
	public short getRecentnr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 112);
		} else {
			return __io__block.readShort(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'recentnr'.
	 * @see #__DNA__FIELD__recentnr
	 */
	
	public void setRecentnr(short recentnr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 112, recentnr);
		} else {
			__io__block.writeShort(__io__address + 64, recentnr);
		}
	}

	/**
	 * Get method for struct member 'bookmarknr'.
	 * @see #__DNA__FIELD__bookmarknr
	 */
	
	public short getBookmarknr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 114);
		} else {
			return __io__block.readShort(__io__address + 66);
		}
	}

	/**
	 * Set method for struct member 'bookmarknr'.
	 * @see #__DNA__FIELD__bookmarknr
	 */
	
	public void setBookmarknr(short bookmarknr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 114, bookmarknr);
		} else {
			__io__block.writeShort(__io__address + 66, bookmarknr);
		}
	}

	/**
	 * Get method for struct member 'systemnr'.
	 * @see #__DNA__FIELD__systemnr
	 */
	
	public short getSystemnr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 116);
		} else {
			return __io__block.readShort(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'systemnr'.
	 * @see #__DNA__FIELD__systemnr
	 */
	
	public void setSystemnr(short systemnr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 116, systemnr);
		} else {
			__io__block.writeShort(__io__address + 68, systemnr);
		}
	}

	/**
	 * Get method for struct member 'system_bookmarknr'.
	 * @see #__DNA__FIELD__system_bookmarknr
	 */
	
	public short getSystem_bookmarknr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 118);
		} else {
			return __io__block.readShort(__io__address + 70);
		}
	}

	/**
	 * Set method for struct member 'system_bookmarknr'.
	 * @see #__DNA__FIELD__system_bookmarknr
	 */
	
	public void setSystem_bookmarknr(short system_bookmarknr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 118, system_bookmarknr);
		} else {
			__io__block.writeShort(__io__address + 70, system_bookmarknr);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpaceFile> __io__addressof() {
		return new CPointer<SpaceFile>(__io__address, new Class[]{SpaceFile.class}, __io__block, __io__blockTable);
	}

}
