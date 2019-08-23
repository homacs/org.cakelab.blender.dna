package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MeshSeqCacheModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1136, size64=1160)
public class MeshSeqCacheModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct MeshSeqCacheModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for MeshSeqCacheModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 144;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshSeqCacheModifierData meshseqcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshseqcachemodifierdata.__dna__addressof(MeshSeqCacheModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 96/112</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'cache_file'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshSeqCacheModifierData meshseqcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshseqcachemodifierdata.__dna__addressof(MeshSeqCacheModifierData.__DNA__FIELD__cache_file);
	 * CPointer&lt;CPointer&lt;CacheFile&gt;&gt; p_cache_file = p.cast(new Class[]{CPointer.class, CacheFile.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_file'</li>
	 * <li>Signature: 'CacheFile*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_file = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'reader'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshSeqCacheModifierData meshseqcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshseqcachemodifierdata.__dna__addressof(MeshSeqCacheModifierData.__DNA__FIELD__reader);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_reader = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reader'</li>
	 * <li>Signature: 'CacheReader*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reader = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'object_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshSeqCacheModifierData meshseqcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshseqcachemodifierdata.__dna__addressof(MeshSeqCacheModifierData.__DNA__FIELD__object_path);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_object_path = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_path'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_path = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'read_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshSeqCacheModifierData meshseqcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshseqcachemodifierdata.__dna__addressof(MeshSeqCacheModifierData.__DNA__FIELD__read_flag);
	 * CPointer&lt;Byte&gt; p_read_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'read_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__read_flag = new long[]{1128, 1152};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshSeqCacheModifierData meshseqcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshseqcachemodifierdata.__dna__addressof(MeshSeqCacheModifierData.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{1129, 1153};

	public MeshSeqCacheModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MeshSeqCacheModifierData(MeshSeqCacheModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public ModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(ModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'cache_file'.
	 * @see #__DNA__FIELD__cache_file
	 */
	
	public CPointer<CacheFile> getCache_file() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
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
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 96, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
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
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'object_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX </p>
	 * @see #__DNA__FIELD__object_path
	 */
	
	public CArrayFacade<Byte> getObject_path() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'object_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX </p>
	 * @see #__DNA__FIELD__object_path
	 */
	
	public void setObject_path(CArrayFacade<Byte> object_path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 104;
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
	 * Get method for struct member 'read_flag'.
	 * @see #__DNA__FIELD__read_flag
	 */
	
	public byte getRead_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1152);
		} else {
			return __io__block.readByte(__io__address + 1128);
		}
	}

	/**
	 * Set method for struct member 'read_flag'.
	 * @see #__DNA__FIELD__read_flag
	 */
	
	public void setRead_flag(byte read_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1152, read_flag);
		} else {
			__io__block.writeByte(__io__address + 1128, read_flag);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Byte> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1153, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1129, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Byte> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1153;
		} else {
			__dna__offset = 1129;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MeshSeqCacheModifierData> __io__addressof() {
		return new CPointer<MeshSeqCacheModifierData>(__io__address, new Class[]{MeshSeqCacheModifierData.class}, __io__block, __io__blockTable);
	}

}
