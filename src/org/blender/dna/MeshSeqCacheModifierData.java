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

@CMetaData(size32=2192, size64=2224)
public class MeshSeqCacheModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct MeshSeqCacheModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for MeshSeqCacheModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 146;

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
	 * <li>Actual Size (32bit/64bit): 108/128</li>
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
	public static final long[] __DNA__FIELD__cache_file = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'object_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
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
	public static final long[] __DNA__FIELD__object_path = new long[]{112, 136};

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
	public static final long[] __DNA__FIELD__read_flag = new long[]{1136, 1160};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshSeqCacheModifierData meshseqcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshseqcachemodifierdata.__dna__addressof(MeshSeqCacheModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1137, 1161};

	/**
	 * Field descriptor (offset) for struct member 'velocity_scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshSeqCacheModifierData meshseqcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshseqcachemodifierdata.__dna__addressof(MeshSeqCacheModifierData.__DNA__FIELD__velocity_scale);
	 * CPointer&lt;Float&gt; p_velocity_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'velocity_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__velocity_scale = new long[]{1140, 1164};

	/**
	 * Field descriptor (offset) for struct member 'reader'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. </p>
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
	public static final long[] __DNA__FIELD__reader = new long[]{1144, 1168};

	/**
	 * Field descriptor (offset) for struct member 'reader_object_path'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshSeqCacheModifierData meshseqcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshseqcachemodifierdata.__dna__addressof(MeshSeqCacheModifierData.__DNA__FIELD__reader_object_path);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_reader_object_path = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reader_object_path'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reader_object_path = new long[]{1148, 1176};

	/**
	 * Field descriptor (offset) for struct member 'vertex_velocities'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex velocities read from the cache. The velocities are not automatically read during modifier execution, and therefore have to manually be read when needed. This is only used through the RNA for now. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshSeqCacheModifierData meshseqcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshseqcachemodifierdata.__dna__addressof(MeshSeqCacheModifierData.__DNA__FIELD__vertex_velocities);
	 * CPointer&lt;CPointer&lt;MeshCacheVertexVelocity&gt;&gt; p_vertex_velocities = p.cast(new Class[]{CPointer.class, MeshCacheVertexVelocity.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_velocities'</li>
	 * <li>Signature: 'MeshCacheVertexVelocity*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_velocities = new long[]{2172, 2200};

	/**
	 * Field descriptor (offset) for struct member 'num_vertices'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of vertices of the Alembic mesh, set when the modifier is executed. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshSeqCacheModifierData meshseqcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshseqcachemodifierdata.__dna__addressof(MeshSeqCacheModifierData.__DNA__FIELD__num_vertices);
	 * CPointer&lt;Integer&gt; p_num_vertices = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'num_vertices'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__num_vertices = new long[]{2176, 2208};

	/**
	 * Field descriptor (offset) for struct member 'velocity_delta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Time (in frames or seconds) between two velocity samples. Automatically computed to scale the velocity vectors at render time for generating proper motion blur data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshSeqCacheModifierData meshseqcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshseqcachemodifierdata.__dna__addressof(MeshSeqCacheModifierData.__DNA__FIELD__velocity_delta);
	 * CPointer&lt;Float&gt; p_velocity_delta = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'velocity_delta'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__velocity_delta = new long[]{2180, 2212};

	/**
	 * Field descriptor (offset) for struct member 'last_lookup_time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Caches the scene time (in seconds) used to lookup data in the Alembic archive when the modifier was last executed. Used to access Alembic samples through the RNA. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshSeqCacheModifierData meshseqcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshseqcachemodifierdata.__dna__addressof(MeshSeqCacheModifierData.__DNA__FIELD__last_lookup_time);
	 * CPointer&lt;Float&gt; p_last_lookup_time = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_lookup_time'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_lookup_time = new long[]{2184, 2216};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshSeqCacheModifierData meshseqcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshseqcachemodifierdata.__dna__addressof(MeshSeqCacheModifierData.__DNA__FIELD___pad1);
	 * CPointer&lt;Integer&gt; p__pad1 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{2188, 2220};

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
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
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
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'object_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__object_path
	 */
	
	public CArrayFacade<Byte> getObject_path() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'object_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__object_path
	 */
	
	public void setObject_path(CArrayFacade<Byte> object_path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 136;
		} else {
			__dna__offset = 112;
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
			return __io__block.readByte(__io__address + 1160);
		} else {
			return __io__block.readByte(__io__address + 1136);
		}
	}

	/**
	 * Set method for struct member 'read_flag'.
	 * @see #__DNA__FIELD__read_flag
	 */
	
	public void setRead_flag(byte read_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1160, read_flag);
		} else {
			__io__block.writeByte(__io__address + 1136, read_flag);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1161, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1137, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1161;
		} else {
			__dna__offset = 1137;
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
	 * Get method for struct member 'velocity_scale'.
	 * @see #__DNA__FIELD__velocity_scale
	 */
	
	public float getVelocity_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1164);
		} else {
			return __io__block.readFloat(__io__address + 1140);
		}
	}

	/**
	 * Set method for struct member 'velocity_scale'.
	 * @see #__DNA__FIELD__velocity_scale
	 */
	
	public void setVelocity_scale(float velocity_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1164, velocity_scale);
		} else {
			__io__block.writeFloat(__io__address + 1140, velocity_scale);
		}
	}

	/**
	 * Get method for struct member 'reader'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. </p>
	 * @see #__DNA__FIELD__reader
	 */
	
	public CPointer<Object> getReader() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'reader'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. </p>
	 * @see #__DNA__FIELD__reader
	 */
	
	public void setReader(CPointer<Object> reader) throws IOException
	{
		long __address = ((reader == null) ? 0 : reader.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1168, __address);
		} else {
			__io__block.writeLong(__io__address + 1144, __address);
		}
	}

	/**
	 * Get method for struct member 'reader_object_path'.
	 * @see #__DNA__FIELD__reader_object_path
	 */
	
	public CArrayFacade<Byte> getReader_object_path() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'reader_object_path'.
	 * @see #__DNA__FIELD__reader_object_path
	 */
	
	public void setReader_object_path(CArrayFacade<Byte> reader_object_path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1176;
		} else {
			__dna__offset = 1148;
		}
		if (__io__equals(reader_object_path, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, reader_object_path)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, reader_object_path);
		} else {
			__io__generic__copy( getReader_object_path(), reader_object_path);
		}
	}

	/**
	 * Get method for struct member 'vertex_velocities'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex velocities read from the cache. The velocities are not automatically read during modifier execution, and therefore have to manually be read when needed. This is only used through the RNA for now. </p>
	 * @see #__DNA__FIELD__vertex_velocities
	 */
	
	public CPointer<MeshCacheVertexVelocity> getVertex_velocities() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 2200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 2172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MeshCacheVertexVelocity.class};
		return new CPointer<MeshCacheVertexVelocity>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MeshCacheVertexVelocity.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'vertex_velocities'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex velocities read from the cache. The velocities are not automatically read during modifier execution, and therefore have to manually be read when needed. This is only used through the RNA for now. </p>
	 * @see #__DNA__FIELD__vertex_velocities
	 */
	
	public void setVertex_velocities(CPointer<MeshCacheVertexVelocity> vertex_velocities) throws IOException
	{
		long __address = ((vertex_velocities == null) ? 0 : vertex_velocities.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 2200, __address);
		} else {
			__io__block.writeLong(__io__address + 2172, __address);
		}
	}

	/**
	 * Get method for struct member 'num_vertices'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of vertices of the Alembic mesh, set when the modifier is executed. </p>
	 * @see #__DNA__FIELD__num_vertices
	 */
	
	public int getNum_vertices() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2208);
		} else {
			return __io__block.readInt(__io__address + 2176);
		}
	}

	/**
	 * Set method for struct member 'num_vertices'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of vertices of the Alembic mesh, set when the modifier is executed. </p>
	 * @see #__DNA__FIELD__num_vertices
	 */
	
	public void setNum_vertices(int num_vertices) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2208, num_vertices);
		} else {
			__io__block.writeInt(__io__address + 2176, num_vertices);
		}
	}

	/**
	 * Get method for struct member 'velocity_delta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Time (in frames or seconds) between two velocity samples. Automatically computed to scale the velocity vectors at render time for generating proper motion blur data. </p>
	 * @see #__DNA__FIELD__velocity_delta
	 */
	
	public float getVelocity_delta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2212);
		} else {
			return __io__block.readFloat(__io__address + 2180);
		}
	}

	/**
	 * Set method for struct member 'velocity_delta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Time (in frames or seconds) between two velocity samples. Automatically computed to scale the velocity vectors at render time for generating proper motion blur data. </p>
	 * @see #__DNA__FIELD__velocity_delta
	 */
	
	public void setVelocity_delta(float velocity_delta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2212, velocity_delta);
		} else {
			__io__block.writeFloat(__io__address + 2180, velocity_delta);
		}
	}

	/**
	 * Get method for struct member 'last_lookup_time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Caches the scene time (in seconds) used to lookup data in the Alembic archive when the modifier was last executed. Used to access Alembic samples through the RNA. </p>
	 * @see #__DNA__FIELD__last_lookup_time
	 */
	
	public float getLast_lookup_time() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2216);
		} else {
			return __io__block.readFloat(__io__address + 2184);
		}
	}

	/**
	 * Set method for struct member 'last_lookup_time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Caches the scene time (in seconds) used to lookup data in the Alembic archive when the modifier was last executed. Used to access Alembic samples through the RNA. </p>
	 * @see #__DNA__FIELD__last_lookup_time
	 */
	
	public void setLast_lookup_time(float last_lookup_time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2216, last_lookup_time);
		} else {
			__io__block.writeFloat(__io__address + 2184, last_lookup_time);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public int get_pad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2220);
		} else {
			return __io__block.readInt(__io__address + 2188);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(int _pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2220, _pad1);
		} else {
			__io__block.writeInt(__io__address + 2188, _pad1);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MeshSeqCacheModifierData> __io__addressof() {
		return new CPointer<MeshSeqCacheModifierData>(__io__address, new Class[]{MeshSeqCacheModifierData.class}, __io__block, __io__blockTable);
	}

}
