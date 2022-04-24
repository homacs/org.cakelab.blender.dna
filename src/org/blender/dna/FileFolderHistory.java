package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FileFolderHistory'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> A wrapper to store previous and next folder lists (#FolderList) for a specific browse mode ({@link eFileBrowse_Mode} ). </p>
 */

@CMetaData(size32=32, size64=56)
public class FileFolderHistory extends CFacade {

	/**
	 * This is the sdna index of the struct FileFolderHistory.
	 * <p>
	 * It is required when allocating a new block to store data for FileFolderHistory.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 243;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileFolderHistory filefolderhistory = ...;
	 * CPointer&lt;Object&gt; p = filefolderhistory.__dna__addressof(FileFolderHistory.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'FileFolderLists*'</li>
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
	 * FileFolderHistory filefolderhistory = ...;
	 * CPointer&lt;Object&gt; p = filefolderhistory.__dna__addressof(FileFolderHistory.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'FileFolderLists*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'browse_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The browse mode this prev/next folder-lists are created for. eFileBrowse_Mode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileFolderHistory filefolderhistory = ...;
	 * CPointer&lt;Object&gt; p = filefolderhistory.__dna__addressof(FileFolderHistory.__DNA__FIELD__browse_mode);
	 * CPointer&lt;Byte&gt; p_browse_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'browse_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__browse_mode = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileFolderHistory filefolderhistory = ...;
	 * CPointer&lt;Object&gt; p = filefolderhistory.__dna__addressof(FileFolderHistory.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{9, 17};

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
	 * FileFolderHistory filefolderhistory = ...;
	 * CPointer&lt;Object&gt; p = filefolderhistory.__dna__addressof(FileFolderHistory.__DNA__FIELD__folders_prev);
	 * CPointer&lt;ListBase&gt; p_folders_prev = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'folders_prev'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__folders_prev = new long[]{16, 24};

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
	 * FileFolderHistory filefolderhistory = ...;
	 * CPointer&lt;Object&gt; p = filefolderhistory.__dna__addressof(FileFolderHistory.__DNA__FIELD__folders_next);
	 * CPointer&lt;ListBase&gt; p_folders_next = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'folders_next'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__folders_next = new long[]{24, 40};

	public FileFolderHistory(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FileFolderHistory(FileFolderHistory that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<Object> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<Object> next) throws IOException
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
	
	public CPointer<Object> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<Object> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'browse_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The browse mode this prev/next folder-lists are created for. eFileBrowse_Mode </p>
	 * @see #__DNA__FIELD__browse_mode
	 */
	
	public byte getBrowse_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 16);
		} else {
			return __io__block.readByte(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'browse_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The browse mode this prev/next folder-lists are created for. eFileBrowse_Mode </p>
	 * @see #__DNA__FIELD__browse_mode
	 */
	
	public void setBrowse_mode(byte browse_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 16, browse_mode);
		} else {
			__io__block.writeByte(__io__address + 8, browse_mode);
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
			return new CArrayFacade<Byte>(__io__address + 17, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 9, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 17;
		} else {
			__dna__offset = 9;
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
	 * Get method for struct member 'folders_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the list of previous directories to show. </p>
	 * @see #__DNA__FIELD__folders_prev
	 */
	
	public ListBase getFolders_prev() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 24, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'folders_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the list of previous directories to show. </p>
	 * @see #__DNA__FIELD__folders_prev
	 */
	
	public void setFolders_prev(ListBase folders_prev) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(folders_prev, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, folders_prev)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, folders_prev);
		} else {
			__io__generic__copy( getFolders_prev(), folders_prev);
		}
	}

	/**
	 * Get method for struct member 'folders_next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the list of next directories (pushed from previous) to show. </p>
	 * @see #__DNA__FIELD__folders_next
	 */
	
	public ListBase getFolders_next() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 40, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 24, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'folders_next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Holds the list of next directories (pushed from previous) to show. </p>
	 * @see #__DNA__FIELD__folders_next
	 */
	
	public void setFolders_next(ListBase folders_next) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(folders_next, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, folders_next)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, folders_next);
		} else {
			__io__generic__copy( getFolders_next(), folders_next);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FileFolderHistory> __io__addressof() {
		return new CPointer<FileFolderHistory>(__io__address, new Class[]{FileFolderHistory.class}, __io__block, __io__blockTable);
	}

}
