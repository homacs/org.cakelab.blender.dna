package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CacheFile'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1160, size64=1200)
public class CacheFile extends CFacade {

	/**
	 * This is the sdna index of the struct CacheFile.
	 * <p>
	 * It is required when allocating a new block to store data for CacheFile.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 620;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__adt);
	 * CPointer&lt;CPointer&lt;AnimData&gt;&gt; p_adt = p.cast(new Class[]{CPointer.class, AnimData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adt'</li>
	 * <li>Signature: 'AnimData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adt = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'handle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__handle);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_handle = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle'</li>
	 * <li>Signature: 'AbcArchiveHandle*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'handle_mutex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__handle_mutex);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_handle_mutex = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_mutex'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_mutex = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'object_paths'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Paths of the objects inside the Alembic archive<h4>Blender Source Code:</h4>
	 * <p> Paths of the objects inside of the Alembic archive referenced by this {@link CacheFile} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__object_paths);
	 * CPointer&lt;ListBase&gt; p_object_paths = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_paths'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_paths = new long[]{112, 144};

	/**
	 * Field descriptor (offset) for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Path to external displacements file<h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__filepath);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_filepath = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filepath'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filepath = new long[]{120, 160};

	/**
	 * Field descriptor (offset) for struct member 'is_sequence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Whether the cache is separated in a series of files
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__is_sequence);
	 * CPointer&lt;Byte&gt; p_is_sequence = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'is_sequence'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__is_sequence = new long[]{1144, 1184};

	/**
	 * Field descriptor (offset) for struct member 'forward_axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__forward_axis);
	 * CPointer&lt;Byte&gt; p_forward_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'forward_axis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__forward_axis = new long[]{1145, 1185};

	/**
	 * Field descriptor (offset) for struct member 'up_axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__up_axis);
	 * CPointer&lt;Byte&gt; p_up_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'up_axis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__up_axis = new long[]{1146, 1186};

	/**
	 * Field descriptor (offset) for struct member 'override_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Whether to use a custom frame for looking up data in the cache file, instead of using the current scene frame
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__override_frame);
	 * CPointer&lt;Byte&gt; p_override_frame = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'override_frame'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__override_frame = new long[]{1147, 1187};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value by which to enlarge or shrink the object with respect to the world's origin (only applicable through a Transform Cache constraint)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__scale);
	 * CPointer&lt;Float&gt; p_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale = new long[]{1148, 1188};

	/**
	 * Field descriptor (offset) for struct member 'frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The time to use for looking up the data in the cache file, or to determine which file to use in a file sequence<h4>Blender Source Code:</h4>
	 * <p> The frame/time to lookup in the cache file. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__frame);
	 * CPointer&lt;Float&gt; p_frame = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frame'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frame = new long[]{1152, 1192};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation flag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{1156, 1196};

	/**
	 * Field descriptor (offset) for struct member 'draw_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__draw_flag);
	 * CPointer&lt;Short&gt; p_draw_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_flag = new long[]{1158, 1198};

	public CacheFile(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CacheFile(CacheFile that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public ID getId() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(ID id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, id);
		} else {
			__io__generic__copy( getId(), id);
		}
	}

	/**
	 * Get method for struct member 'adt'.
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'handle'.
	 * @see #__DNA__FIELD__handle
	 */
	
	public CPointer<Object> getHandle() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'handle'.
	 * @see #__DNA__FIELD__handle
	 */
	
	public void setHandle(CPointer<Object> handle) throws IOException
	{
		long __address = ((handle == null) ? 0 : handle.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'handle_mutex'.
	 * @see #__DNA__FIELD__handle_mutex
	 */
	
	public CPointer<Object> getHandle_mutex() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'handle_mutex'.
	 * @see #__DNA__FIELD__handle_mutex
	 */
	
	public void setHandle_mutex(CPointer<Object> handle_mutex) throws IOException
	{
		long __address = ((handle_mutex == null) ? 0 : handle_mutex.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'object_paths'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Paths of the objects inside the Alembic archive<h4>Blender Source Code:</h4>
	 * <p> Paths of the objects inside of the Alembic archive referenced by this {@link CacheFile} . </p>
	 * @see #__DNA__FIELD__object_paths
	 */
	
	public ListBase getObject_paths() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 144, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 112, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'object_paths'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Paths of the objects inside the Alembic archive<h4>Blender Source Code:</h4>
	 * <p> Paths of the objects inside of the Alembic archive referenced by this {@link CacheFile} . </p>
	 * @see #__DNA__FIELD__object_paths
	 */
	
	public void setObject_paths(ListBase object_paths) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(object_paths, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, object_paths)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, object_paths);
		} else {
			__io__generic__copy( getObject_paths(), object_paths);
		}
	}

	/**
	 * Get method for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Path to external displacements file<h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX </p>
	 * @see #__DNA__FIELD__filepath
	 */
	
	public CArrayFacade<Byte> getFilepath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Path to external displacements file<h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX </p>
	 * @see #__DNA__FIELD__filepath
	 */
	
	public void setFilepath(CArrayFacade<Byte> filepath) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(filepath, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, filepath)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, filepath);
		} else {
			__io__generic__copy( getFilepath(), filepath);
		}
	}

	/**
	 * Get method for struct member 'is_sequence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Whether the cache is separated in a series of files
	 * @see #__DNA__FIELD__is_sequence
	 */
	
	public byte getIs_sequence() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1184);
		} else {
			return __io__block.readByte(__io__address + 1144);
		}
	}

	/**
	 * Set method for struct member 'is_sequence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Whether the cache is separated in a series of files
	 * @see #__DNA__FIELD__is_sequence
	 */
	
	public void setIs_sequence(byte is_sequence) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1184, is_sequence);
		} else {
			__io__block.writeByte(__io__address + 1144, is_sequence);
		}
	}

	/**
	 * Get method for struct member 'forward_axis'.
	 * @see #__DNA__FIELD__forward_axis
	 */
	
	public byte getForward_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1185);
		} else {
			return __io__block.readByte(__io__address + 1145);
		}
	}

	/**
	 * Set method for struct member 'forward_axis'.
	 * @see #__DNA__FIELD__forward_axis
	 */
	
	public void setForward_axis(byte forward_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1185, forward_axis);
		} else {
			__io__block.writeByte(__io__address + 1145, forward_axis);
		}
	}

	/**
	 * Get method for struct member 'up_axis'.
	 * @see #__DNA__FIELD__up_axis
	 */
	
	public byte getUp_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1186);
		} else {
			return __io__block.readByte(__io__address + 1146);
		}
	}

	/**
	 * Set method for struct member 'up_axis'.
	 * @see #__DNA__FIELD__up_axis
	 */
	
	public void setUp_axis(byte up_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1186, up_axis);
		} else {
			__io__block.writeByte(__io__address + 1146, up_axis);
		}
	}

	/**
	 * Get method for struct member 'override_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Whether to use a custom frame for looking up data in the cache file, instead of using the current scene frame
	 * @see #__DNA__FIELD__override_frame
	 */
	
	public byte getOverride_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1187);
		} else {
			return __io__block.readByte(__io__address + 1147);
		}
	}

	/**
	 * Set method for struct member 'override_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Whether to use a custom frame for looking up data in the cache file, instead of using the current scene frame
	 * @see #__DNA__FIELD__override_frame
	 */
	
	public void setOverride_frame(byte override_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1187, override_frame);
		} else {
			__io__block.writeByte(__io__address + 1147, override_frame);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value by which to enlarge or shrink the object with respect to the world's origin (only applicable through a Transform Cache constraint)
	 * @see #__DNA__FIELD__scale
	 */
	
	public float getScale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1188);
		} else {
			return __io__block.readFloat(__io__address + 1148);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value by which to enlarge or shrink the object with respect to the world's origin (only applicable through a Transform Cache constraint)
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(float scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1188, scale);
		} else {
			__io__block.writeFloat(__io__address + 1148, scale);
		}
	}

	/**
	 * Get method for struct member 'frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The time to use for looking up the data in the cache file, or to determine which file to use in a file sequence<h4>Blender Source Code:</h4>
	 * <p> The frame/time to lookup in the cache file. </p>
	 * @see #__DNA__FIELD__frame
	 */
	
	public float getFrame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1192);
		} else {
			return __io__block.readFloat(__io__address + 1152);
		}
	}

	/**
	 * Set method for struct member 'frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The time to use for looking up the data in the cache file, or to determine which file to use in a file sequence<h4>Blender Source Code:</h4>
	 * <p> The frame/time to lookup in the cache file. </p>
	 * @see #__DNA__FIELD__frame
	 */
	
	public void setFrame(float frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1192, frame);
		} else {
			__io__block.writeFloat(__io__address + 1152, frame);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1196);
		} else {
			return __io__block.readShort(__io__address + 1156);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1196, flag);
		} else {
			__io__block.writeShort(__io__address + 1156, flag);
		}
	}

	/**
	 * Get method for struct member 'draw_flag'.
	 * @see #__DNA__FIELD__draw_flag
	 */
	
	public short getDraw_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1198);
		} else {
			return __io__block.readShort(__io__address + 1158);
		}
	}

	/**
	 * Set method for struct member 'draw_flag'.
	 * @see #__DNA__FIELD__draw_flag
	 */
	
	public void setDraw_flag(short draw_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1198, draw_flag);
		} else {
			__io__block.writeShort(__io__address + 1158, draw_flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CacheFile> __io__addressof() {
		return new CPointer<CacheFile>(__io__address, new Class[]{CacheFile.class}, __io__block, __io__blockTable);
	}

}
