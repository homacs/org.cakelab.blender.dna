package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FileDirEntryRevision'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Container for a revision, only relevant in asset context. </p>
 */

@CMetaData(size32=88, size64=104)
public class FileDirEntryRevision extends CFacade {

	/**
	 * This is the sdna index of the struct FileDirEntryRevision.
	 * <p>
	 * It is required when allocating a new block to store data for FileDirEntryRevision.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 220;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryRevision filedirentryrevision = ...;
	 * CPointer&lt;Object&gt; p = filedirentryrevision.__dna__addressof(FileDirEntryRevision.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;FileDirEntryRevision&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, FileDirEntryRevision.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'FileDirEntryRevision*'</li>
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
	 * FileDirEntryRevision filedirentryrevision = ...;
	 * CPointer&lt;Object&gt; p = filedirentryrevision.__dna__addressof(FileDirEntryRevision.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;FileDirEntryRevision&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, FileDirEntryRevision.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'FileDirEntryRevision*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'comment'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryRevision filedirentryrevision = ...;
	 * CPointer&lt;Object&gt; p = filedirentryrevision.__dna__addressof(FileDirEntryRevision.__DNA__FIELD__comment);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_comment = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'comment'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__comment = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryRevision filedirentryrevision = ...;
	 * CPointer&lt;Object&gt; p = filedirentryrevision.__dna__addressof(FileDirEntryRevision.__DNA__FIELD__pad);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_pad = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'uuid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryRevision filedirentryrevision = ...;
	 * CPointer&lt;Object&gt; p = filedirentryrevision.__dna__addressof(FileDirEntryRevision.__DNA__FIELD__uuid);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_uuid = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uuid'</li>
	 * <li>Signature: 'int[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uuid = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryRevision filedirentryrevision = ...;
	 * CPointer&lt;Object&gt; p = filedirentryrevision.__dna__addressof(FileDirEntryRevision.__DNA__FIELD__size);
	 * CPointer&lt;int64&gt; p_size = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'uint64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{32, 48};

	/**
	 * Field descriptor (offset) for struct member 'time'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryRevision filedirentryrevision = ...;
	 * CPointer&lt;Object&gt; p = filedirentryrevision.__dna__addressof(FileDirEntryRevision.__DNA__FIELD__time);
	 * CPointer&lt;int64&gt; p_time = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time'</li>
	 * <li>Signature: 'int64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time = new long[]{40, 56};

	/**
	 * Field descriptor (offset) for struct member 'size_str'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp caching of UI-generated strings... </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryRevision filedirentryrevision = ...;
	 * CPointer&lt;Object&gt; p = filedirentryrevision.__dna__addressof(FileDirEntryRevision.__DNA__FIELD__size_str);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_size_str = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size_str'</li>
	 * <li>Signature: 'char[16]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size_str = new long[]{48, 64};

	/**
	 * Field descriptor (offset) for struct member 'time_str'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryRevision filedirentryrevision = ...;
	 * CPointer&lt;Object&gt; p = filedirentryrevision.__dna__addressof(FileDirEntryRevision.__DNA__FIELD__time_str);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_time_str = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_str'</li>
	 * <li>Signature: 'char[8]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_str = new long[]{64, 80};

	/**
	 * Field descriptor (offset) for struct member 'date_str'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileDirEntryRevision filedirentryrevision = ...;
	 * CPointer&lt;Object&gt; p = filedirentryrevision.__dna__addressof(FileDirEntryRevision.__DNA__FIELD__date_str);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_date_str = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'date_str'</li>
	 * <li>Signature: 'char[16]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__date_str = new long[]{72, 88};

	public FileDirEntryRevision(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FileDirEntryRevision(FileDirEntryRevision that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<FileDirEntryRevision> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FileDirEntryRevision.class};
		return new CPointer<FileDirEntryRevision>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FileDirEntryRevision.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<FileDirEntryRevision> next) throws IOException
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
	
	public CPointer<FileDirEntryRevision> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FileDirEntryRevision.class};
		return new CPointer<FileDirEntryRevision>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FileDirEntryRevision.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<FileDirEntryRevision> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'comment'.
	 * @see #__DNA__FIELD__comment
	 */
	
	public CPointer<Byte> getComment() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'comment'.
	 * @see #__DNA__FIELD__comment
	 */
	
	public void setComment(CPointer<Byte> comment) throws IOException
	{
		long __address = ((comment == null) ? 0 : comment.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CPointer<Object> getPad() throws IOException
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
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CPointer<Object> pad) throws IOException
	{
		long __address = ((pad == null) ? 0 : pad.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'uuid'.
	 * @see #__DNA__FIELD__uuid
	 */
	
	public CArrayFacade<Integer> getUuid() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uuid'.
	 * @see #__DNA__FIELD__uuid
	 */
	
	public void setUuid(CArrayFacade<Integer> uuid) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(uuid, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uuid)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uuid);
		} else {
			__io__generic__copy( getUuid(), uuid);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public long getSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 48);
		} else {
			return __io__block.readInt64(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(long size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 48, size);
		} else {
			__io__block.writeInt64(__io__address + 32, size);
		}
	}

	/**
	 * Get method for struct member 'time'.
	 * @see #__DNA__FIELD__time
	 */
	
	public long getTime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 56);
		} else {
			return __io__block.readInt64(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'time'.
	 * @see #__DNA__FIELD__time
	 */
	
	public void setTime(long time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 56, time);
		} else {
			__io__block.writeInt64(__io__address + 40, time);
		}
	}

	/**
	 * Get method for struct member 'size_str'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp caching of UI-generated strings... </p>
	 * @see #__DNA__FIELD__size_str
	 */
	
	public CArrayFacade<Byte> getSize_str() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			16
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'size_str'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp caching of UI-generated strings... </p>
	 * @see #__DNA__FIELD__size_str
	 */
	
	public void setSize_str(CArrayFacade<Byte> size_str) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(size_str, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, size_str)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, size_str);
		} else {
			__io__generic__copy( getSize_str(), size_str);
		}
	}

	/**
	 * Get method for struct member 'time_str'.
	 * @see #__DNA__FIELD__time_str
	 */
	
	public CArrayFacade<Byte> getTime_str() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'time_str'.
	 * @see #__DNA__FIELD__time_str
	 */
	
	public void setTime_str(CArrayFacade<Byte> time_str) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(time_str, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, time_str)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, time_str);
		} else {
			__io__generic__copy( getTime_str(), time_str);
		}
	}

	/**
	 * Get method for struct member 'date_str'.
	 * @see #__DNA__FIELD__date_str
	 */
	
	public CArrayFacade<Byte> getDate_str() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			16
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'date_str'.
	 * @see #__DNA__FIELD__date_str
	 */
	
	public void setDate_str(CArrayFacade<Byte> date_str) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(date_str, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, date_str)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, date_str);
		} else {
			__io__generic__copy( getDate_str(), date_str);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FileDirEntryRevision> __io__addressof() {
		return new CPointer<FileDirEntryRevision>(__io__address, new Class[]{FileDirEntryRevision.class}, __io__block, __io__blockTable);
	}

}
