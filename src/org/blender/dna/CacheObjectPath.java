package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CacheObjectPath'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> UNUSED Representation of an object's path inside the archive. Note that this is not a file path. </p>
 */

@CMetaData(size32=4104, size64=4112)
public class CacheObjectPath extends CFacade {

	/**
	 * This is the sdna index of the struct CacheObjectPath.
	 * <p>
	 * It is required when allocating a new block to store data for CacheObjectPath.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 754;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheObjectPath cacheobjectpath = ...;
	 * CPointer&lt;Object&gt; p = cacheobjectpath.__dna__addressof(CacheObjectPath.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;CacheObjectPath&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, CacheObjectPath.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'CacheObjectPath*'</li>
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
	 * CacheObjectPath cacheobjectpath = ...;
	 * CPointer&lt;Object&gt; p = cacheobjectpath.__dna__addressof(CacheObjectPath.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;CacheObjectPath&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, CacheObjectPath.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'CacheObjectPath*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Object path
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheObjectPath cacheobjectpath = ...;
	 * CPointer&lt;Object&gt; p = cacheobjectpath.__dna__addressof(CacheObjectPath.__DNA__FIELD__path);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_path = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path'</li>
	 * <li>Signature: 'char[4096]'</li>
	 * <li>Actual Size (32bit/64bit): 4096/4096</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path = new long[]{8, 16};

	public CacheObjectPath(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CacheObjectPath(CacheObjectPath that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<CacheObjectPath> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CacheObjectPath.class};
		return new CPointer<CacheObjectPath>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CacheObjectPath.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<CacheObjectPath> next) throws IOException
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
	
	public CPointer<CacheObjectPath> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CacheObjectPath.class};
		return new CPointer<CacheObjectPath>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CacheObjectPath.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<CacheObjectPath> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Object path
	 * @see #__DNA__FIELD__path
	 */
	
	public CArrayFacade<Byte> getPath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4096
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Object path
	 * @see #__DNA__FIELD__path
	 */
	
	public void setPath(CArrayFacade<Byte> path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(path, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, path)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, path);
		} else {
			__io__generic__copy( getPath(), path);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CacheObjectPath> __io__addressof() {
		return new CPointer<CacheObjectPath>(__io__address, new Class[]{CacheObjectPath.class}, __io__block, __io__blockTable);
	}

}
