package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bTransformCacheConstraint'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Transform matrix cache constraint </p>
 */

@CMetaData(size32=1032, size64=1040)
public class bTransformCacheConstraint extends CFacade {

	/**
	 * This is the sdna index of the struct bTransformCacheConstraint.
	 * <p>
	 * It is required when allocating a new block to store data for bTransformCacheConstraint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 387;

	/**
	 * Field descriptor (offset) for struct member 'cache_file'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformCacheConstraint btransformcacheconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformcacheconstraint.__dna__addressof(bTransformCacheConstraint.__DNA__FIELD__cache_file);
	 * CPointer&lt;CPointer&lt;CacheFile&gt;&gt; p_cache_file = p.cast(new Class[]{CPointer.class, CacheFile.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_file'</li>
	 * <li>Signature: 'CacheFile*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_file = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'reader'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformCacheConstraint btransformcacheconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformcacheconstraint.__dna__addressof(bTransformCacheConstraint.__DNA__FIELD__reader);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_reader = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reader'</li>
	 * <li>Signature: 'CacheReader*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reader = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'object_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformCacheConstraint btransformcacheconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformcacheconstraint.__dna__addressof(bTransformCacheConstraint.__DNA__FIELD__object_path);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_object_path = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_path'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_path = new long[]{8, 16};

	public bTransformCacheConstraint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bTransformCacheConstraint(bTransformCacheConstraint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'cache_file'.
	 * @see #__DNA__FIELD__cache_file
	 */
	
	public CPointer<CacheFile> getCache_file() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CacheFile.class};
		return new CPointer<CacheFile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CacheFile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cache_file'.
	 * @see #__DNA__FIELD__cache_file
	 */
	
	public void setCache_file(CPointer<CacheFile> cache_file) throws IOException
	{
		long __address = ((cache_file == null) ? 0 : cache_file.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'reader'.
	 * @see #__DNA__FIELD__reader
	 */
	
	public CPointer<Object> getReader() throws IOException
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
	 * Set method for struct member 'reader'.
	 * @see #__DNA__FIELD__reader
	 */
	
	public void setReader(CPointer<Object> reader) throws IOException
	{
		long __address = ((reader == null) ? 0 : reader.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'object_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX </p>
	 * @see #__DNA__FIELD__object_path
	 */
	
	public CArrayFacade<Byte> getObject_path() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'object_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX </p>
	 * @see #__DNA__FIELD__object_path
	 */
	
	public void setObject_path(CArrayFacade<Byte> object_path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(object_path, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, object_path)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, object_path);
		} else {
			__io__generic__copy( getObject_path(), object_path);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bTransformCacheConstraint> __io__addressof() {
		return new CPointer<bTransformCacheConstraint>(__io__address, new Class[]{bTransformCacheConstraint.class}, __io__block, __io__blockTable);
	}

}
