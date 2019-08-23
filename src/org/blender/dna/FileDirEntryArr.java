package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FileDirEntryArr'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Array of direntries. This struct is used in various, different contexts. In Filebrowser UI, it stores the total number of available entries, the number of visible (filtered) entries, and a subset of those in 'entries' {@link ListBase} , from idx_start (included) to idx_end (excluded). In AssetEngine context (i.e. outside of 'browsing' context), entries contain all needed data, there is no filtering, so nbr_entries_filtered, entry_idx_start and entry_idx_end should all be set to -1. </p>
 */

@CMetaData(size32=1048, size64=1056)
public class FileDirEntryArr extends CFacade {

	/**
	 * This is the sdna index of the struct FileDirEntryArr.
	 * <p>
	 * It is required when allocating a new block to store data for FileDirEntryArr.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 227;

	/**
	 * Field descriptor (offset) for struct member 'entries'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryArr filedirentryarr = ...;
	 * CPointer&lt;Object&gt; p = filedirentryarr.__dna__addressof(FileDirEntryArr.__DNA__FIELD__entries);
	 * CPointer&lt;ListBase&gt; p_entries = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'entries'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__entries = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'nbr_entries'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryArr filedirentryarr = ...;
	 * CPointer&lt;Object&gt; p = filedirentryarr.__dna__addressof(FileDirEntryArr.__DNA__FIELD__nbr_entries);
	 * CPointer&lt;Integer&gt; p_nbr_entries = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nbr_entries'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nbr_entries = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'nbr_entries_filtered'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryArr filedirentryarr = ...;
	 * CPointer&lt;Object&gt; p = filedirentryarr.__dna__addressof(FileDirEntryArr.__DNA__FIELD__nbr_entries_filtered);
	 * CPointer&lt;Integer&gt; p_nbr_entries_filtered = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nbr_entries_filtered'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nbr_entries_filtered = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'entry_idx_start'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryArr filedirentryarr = ...;
	 * CPointer&lt;Object&gt; p = filedirentryarr.__dna__addressof(FileDirEntryArr.__DNA__FIELD__entry_idx_start);
	 * CPointer&lt;Integer&gt; p_entry_idx_start = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'entry_idx_start'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__entry_idx_start = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'entry_idx_end'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryArr filedirentryarr = ...;
	 * CPointer&lt;Object&gt; p = filedirentryarr.__dna__addressof(FileDirEntryArr.__DNA__FIELD__entry_idx_end);
	 * CPointer&lt;Integer&gt; p_entry_idx_end = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'entry_idx_end'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__entry_idx_end = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'root'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryArr filedirentryarr = ...;
	 * CPointer&lt;Object&gt; p = filedirentryarr.__dna__addressof(FileDirEntryArr.__DNA__FIELD__root);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_root = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'root'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__root = new long[]{24, 32};

	public FileDirEntryArr(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FileDirEntryArr(FileDirEntryArr that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'entries'.
	 * @see #__DNA__FIELD__entries
	 */
	
	public ListBase getEntries() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'entries'.
	 * @see #__DNA__FIELD__entries
	 */
	
	public void setEntries(ListBase entries) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(entries, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, entries)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, entries);
		} else {
			__io__generic__copy( getEntries(), entries);
		}
	}

	/**
	 * Get method for struct member 'nbr_entries'.
	 * @see #__DNA__FIELD__nbr_entries
	 */
	
	public int getNbr_entries() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'nbr_entries'.
	 * @see #__DNA__FIELD__nbr_entries
	 */
	
	public void setNbr_entries(int nbr_entries) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, nbr_entries);
		} else {
			__io__block.writeInt(__io__address + 8, nbr_entries);
		}
	}

	/**
	 * Get method for struct member 'nbr_entries_filtered'.
	 * @see #__DNA__FIELD__nbr_entries_filtered
	 */
	
	public int getNbr_entries_filtered() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'nbr_entries_filtered'.
	 * @see #__DNA__FIELD__nbr_entries_filtered
	 */
	
	public void setNbr_entries_filtered(int nbr_entries_filtered) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, nbr_entries_filtered);
		} else {
			__io__block.writeInt(__io__address + 12, nbr_entries_filtered);
		}
	}

	/**
	 * Get method for struct member 'entry_idx_start'.
	 * @see #__DNA__FIELD__entry_idx_start
	 */
	
	public int getEntry_idx_start() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'entry_idx_start'.
	 * @see #__DNA__FIELD__entry_idx_start
	 */
	
	public void setEntry_idx_start(int entry_idx_start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, entry_idx_start);
		} else {
			__io__block.writeInt(__io__address + 16, entry_idx_start);
		}
	}

	/**
	 * Get method for struct member 'entry_idx_end'.
	 * @see #__DNA__FIELD__entry_idx_end
	 */
	
	public int getEntry_idx_end() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'entry_idx_end'.
	 * @see #__DNA__FIELD__entry_idx_end
	 */
	
	public void setEntry_idx_end(int entry_idx_end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, entry_idx_end);
		} else {
			__io__block.writeInt(__io__address + 20, entry_idx_end);
		}
	}

	/**
	 * Get method for struct member 'root'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX </p>
	 * @see #__DNA__FIELD__root
	 */
	
	public CArrayFacade<Byte> getRoot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'root'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX </p>
	 * @see #__DNA__FIELD__root
	 */
	
	public void setRoot(CArrayFacade<Byte> root) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(root, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, root)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, root);
		} else {
			__io__generic__copy( getRoot(), root);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FileDirEntryArr> __io__addressof() {
		return new CPointer<FileDirEntryArr>(__io__address, new Class[]{FileDirEntryArr.class}, __io__block, __io__blockTable);
	}

}
