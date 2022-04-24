package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Volume'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1268, size64=1328)
public class Volume extends CFacade {

	/**
	 * This is the sdna index of the struct Volume.
	 * <p>
	 * It is required when allocating a new block to store data for Volume.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 796;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 136/176</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__adt);
	 * CPointer&lt;CPointer&lt;AnimData&gt;&gt; p_adt = p.cast(new Class[]{CPointer.class, AnimData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adt'</li>
	 * <li>Signature: 'AnimData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adt = new long[]{136, 176};

	/**
	 * Field descriptor (offset) for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Volume file used by this Volume data-block<h4>Blender Source Code:</h4>
	 * <p> File FILE_MAX </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__filepath);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_filepath = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filepath'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filepath = new long[]{140, 184};

	/**
	 * Field descriptor (offset) for struct member 'packedfile'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__packedfile);
	 * CPointer&lt;CPointer&lt;PackedFile&gt;&gt; p_packedfile = p.cast(new Class[]{CPointer.class, PackedFile.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'packedfile'</li>
	 * <li>Signature: 'PackedFile*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__packedfile = new long[]{1164, 1208};

	/**
	 * Field descriptor (offset) for struct member 'is_sequence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Whether the cache is separated in a series of files<h4>Blender Source Code:</h4>
	 * <p>{@link Sequence}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__is_sequence);
	 * CPointer&lt;Byte&gt; p_is_sequence = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'is_sequence'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__is_sequence = new long[]{1168, 1216};

	/**
	 * Field descriptor (offset) for struct member 'sequence_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Sequence playback mode
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__sequence_mode);
	 * CPointer&lt;Byte&gt; p_sequence_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sequence_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sequence_mode = new long[]{1169, 1217};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{1170, 1218};

	/**
	 * Field descriptor (offset) for struct member 'frame_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Global starting frame of the sequence, assuming first has a #1
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__frame_start);
	 * CPointer&lt;Integer&gt; p_frame_start = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frame_start'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frame_start = new long[]{1172, 1220};

	/**
	 * Field descriptor (offset) for struct member 'frame_duration'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of frames of the sequence to use
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__frame_duration);
	 * CPointer&lt;Integer&gt; p_frame_duration = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frame_duration'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frame_duration = new long[]{1176, 1224};

	/**
	 * Field descriptor (offset) for struct member 'frame_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset the number of the frame to use in the animation
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__frame_offset);
	 * CPointer&lt;Integer&gt; p_frame_offset = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frame_offset'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frame_offset = new long[]{1180, 1228};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{1184, 1232};

	/**
	 * Field descriptor (offset) for struct member 'active_grid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grids </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__active_grid);
	 * CPointer&lt;Integer&gt; p_active_grid = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_grid'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_grid = new long[]{1188, 1236};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__mat);
	 * CPointer&lt;CPointer&lt;CPointer&lt;Material&gt;&gt;&gt; p_mat = p.cast(new Class[]{CPointer.class, CPointer.class, Material.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'Material**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{1192, 1240};

	/**
	 * Field descriptor (offset) for struct member 'totcol'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__totcol);
	 * CPointer&lt;Short&gt; p_totcol = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totcol'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totcol = new long[]{1196, 1248};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'short[3]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{1198, 1250};

	/**
	 * Field descriptor (offset) for struct member 'render'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Volume render settings for 3D viewport<h4>Blender Source Code:</h4>
	 * <p> Render & Display Settings </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__render);
	 * CPointer&lt;VolumeRender&gt; p_render = p.cast(new Class[]{VolumeRender.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render'</li>
	 * <li>Signature: 'VolumeRender'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render = new long[]{1204, 1256};

	/**
	 * Field descriptor (offset) for struct member 'display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Volume display settings for 3D viewport
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__display);
	 * CPointer&lt;VolumeDisplay&gt; p_display = p.cast(new Class[]{VolumeDisplay.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'display'</li>
	 * <li>Signature: 'VolumeDisplay'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__display = new long[]{1220, 1272};

	/**
	 * Field descriptor (offset) for struct member 'batch_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Draw Cache </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__batch_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_batch_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'batch_cache'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__batch_cache = new long[]{1252, 1304};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime Data </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Volume volume = ...;
	 * CPointer&lt;Object&gt; p = volume.__dna__addressof(Volume.__DNA__FIELD__runtime);
	 * CPointer&lt;Volume_Runtime&gt; p_runtime = p.cast(new Class[]{Volume_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'Volume_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 12/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{1256, 1312};

	public Volume(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Volume(Volume that) {
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id) </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id) </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Get method for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Volume file used by this Volume data-block<h4>Blender Source Code:</h4>
	 * <p> File FILE_MAX </p>
	 * @see #__DNA__FIELD__filepath
	 */
	
	public CArrayFacade<Byte> getFilepath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Volume file used by this Volume data-block<h4>Blender Source Code:</h4>
	 * <p> File FILE_MAX </p>
	 * @see #__DNA__FIELD__filepath
	 */
	
	public void setFilepath(CArrayFacade<Byte> filepath) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 140;
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
	 * Get method for struct member 'packedfile'.
	 * @see #__DNA__FIELD__packedfile
	 */
	
	public CPointer<PackedFile> getPackedfile() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1164);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PackedFile.class};
		return new CPointer<PackedFile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PackedFile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'packedfile'.
	 * @see #__DNA__FIELD__packedfile
	 */
	
	public void setPackedfile(CPointer<PackedFile> packedfile) throws IOException
	{
		long __address = ((packedfile == null) ? 0 : packedfile.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1208, __address);
		} else {
			__io__block.writeLong(__io__address + 1164, __address);
		}
	}

	/**
	 * Get method for struct member 'is_sequence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Whether the cache is separated in a series of files<h4>Blender Source Code:</h4>
	 * <p>{@link Sequence}  </p>
	 * @see #__DNA__FIELD__is_sequence
	 */
	
	public byte getIs_sequence() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1216);
		} else {
			return __io__block.readByte(__io__address + 1168);
		}
	}

	/**
	 * Set method for struct member 'is_sequence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Whether the cache is separated in a series of files<h4>Blender Source Code:</h4>
	 * <p>{@link Sequence}  </p>
	 * @see #__DNA__FIELD__is_sequence
	 */
	
	public void setIs_sequence(byte is_sequence) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1216, is_sequence);
		} else {
			__io__block.writeByte(__io__address + 1168, is_sequence);
		}
	}

	/**
	 * Get method for struct member 'sequence_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Sequence playback mode
	 * @see #__DNA__FIELD__sequence_mode
	 */
	
	public byte getSequence_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1217);
		} else {
			return __io__block.readByte(__io__address + 1169);
		}
	}

	/**
	 * Set method for struct member 'sequence_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Sequence playback mode
	 * @see #__DNA__FIELD__sequence_mode
	 */
	
	public void setSequence_mode(byte sequence_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1217, sequence_mode);
		} else {
			__io__block.writeByte(__io__address + 1169, sequence_mode);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1218, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1170, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1218;
		} else {
			__dna__offset = 1170;
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
	 * Get method for struct member 'frame_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Global starting frame of the sequence, assuming first has a #1
	 * @see #__DNA__FIELD__frame_start
	 */
	
	public int getFrame_start() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1220);
		} else {
			return __io__block.readInt(__io__address + 1172);
		}
	}

	/**
	 * Set method for struct member 'frame_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Global starting frame of the sequence, assuming first has a #1
	 * @see #__DNA__FIELD__frame_start
	 */
	
	public void setFrame_start(int frame_start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1220, frame_start);
		} else {
			__io__block.writeInt(__io__address + 1172, frame_start);
		}
	}

	/**
	 * Get method for struct member 'frame_duration'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of frames of the sequence to use
	 * @see #__DNA__FIELD__frame_duration
	 */
	
	public int getFrame_duration() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1224);
		} else {
			return __io__block.readInt(__io__address + 1176);
		}
	}

	/**
	 * Set method for struct member 'frame_duration'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of frames of the sequence to use
	 * @see #__DNA__FIELD__frame_duration
	 */
	
	public void setFrame_duration(int frame_duration) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1224, frame_duration);
		} else {
			__io__block.writeInt(__io__address + 1176, frame_duration);
		}
	}

	/**
	 * Get method for struct member 'frame_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset the number of the frame to use in the animation
	 * @see #__DNA__FIELD__frame_offset
	 */
	
	public int getFrame_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1228);
		} else {
			return __io__block.readInt(__io__address + 1180);
		}
	}

	/**
	 * Set method for struct member 'frame_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset the number of the frame to use in the animation
	 * @see #__DNA__FIELD__frame_offset
	 */
	
	public void setFrame_offset(int frame_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1228, frame_offset);
		} else {
			__io__block.writeInt(__io__address + 1180, frame_offset);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1232);
		} else {
			return __io__block.readInt(__io__address + 1184);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1232, flag);
		} else {
			__io__block.writeInt(__io__address + 1184, flag);
		}
	}

	/**
	 * Get method for struct member 'active_grid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grids </p>
	 * @see #__DNA__FIELD__active_grid
	 */
	
	public int getActive_grid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1236);
		} else {
			return __io__block.readInt(__io__address + 1188);
		}
	}

	/**
	 * Set method for struct member 'active_grid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grids </p>
	 * @see #__DNA__FIELD__active_grid
	 */
	
	public void setActive_grid(int active_grid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1236, active_grid);
		} else {
			__io__block.writeInt(__io__address + 1188, active_grid);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public CPointer<CPointer<Material>> getMat() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1192);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Material.class};
		return new CPointer<CPointer<Material>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CPointer<CPointer<Material>> mat) throws IOException
	{
		long __address = ((mat == null) ? 0 : mat.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1240, __address);
		} else {
			__io__block.writeLong(__io__address + 1192, __address);
		}
	}

	/**
	 * Get method for struct member 'totcol'.
	 * @see #__DNA__FIELD__totcol
	 */
	
	public short getTotcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1248);
		} else {
			return __io__block.readShort(__io__address + 1196);
		}
	}

	/**
	 * Set method for struct member 'totcol'.
	 * @see #__DNA__FIELD__totcol
	 */
	
	public void setTotcol(short totcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1248, totcol);
		} else {
			__io__block.writeShort(__io__address + 1196, totcol);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Short> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 1250, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 1198, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Short> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1250;
		} else {
			__dna__offset = 1198;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Get method for struct member 'render'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Volume render settings for 3D viewport<h4>Blender Source Code:</h4>
	 * <p> Render & Display Settings </p>
	 * @see #__DNA__FIELD__render
	 */
	
	public VolumeRender getRender() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new VolumeRender(__io__address + 1256, __io__block, __io__blockTable);
		} else {
			return new VolumeRender(__io__address + 1204, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'render'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Volume render settings for 3D viewport<h4>Blender Source Code:</h4>
	 * <p> Render & Display Settings </p>
	 * @see #__DNA__FIELD__render
	 */
	
	public void setRender(VolumeRender render) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1256;
		} else {
			__dna__offset = 1204;
		}
		if (__io__equals(render, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, render)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, render);
		} else {
			__io__generic__copy( getRender(), render);
		}
	}

	/**
	 * Get method for struct member 'display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Volume display settings for 3D viewport
	 * @see #__DNA__FIELD__display
	 */
	
	public VolumeDisplay getDisplay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new VolumeDisplay(__io__address + 1272, __io__block, __io__blockTable);
		} else {
			return new VolumeDisplay(__io__address + 1220, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Volume display settings for 3D viewport
	 * @see #__DNA__FIELD__display
	 */
	
	public void setDisplay(VolumeDisplay display) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1272;
		} else {
			__dna__offset = 1220;
		}
		if (__io__equals(display, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, display)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, display);
		} else {
			__io__generic__copy( getDisplay(), display);
		}
	}

	/**
	 * Get method for struct member 'batch_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Draw Cache </p>
	 * @see #__DNA__FIELD__batch_cache
	 */
	
	public CPointer<Object> getBatch_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1304);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1252);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'batch_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Draw Cache </p>
	 * @see #__DNA__FIELD__batch_cache
	 */
	
	public void setBatch_cache(CPointer<Object> batch_cache) throws IOException
	{
		long __address = ((batch_cache == null) ? 0 : batch_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1304, __address);
		} else {
			__io__block.writeLong(__io__address + 1252, __address);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime Data </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public Volume_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new Volume_Runtime(__io__address + 1312, __io__block, __io__blockTable);
		} else {
			return new Volume_Runtime(__io__address + 1256, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime Data </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(Volume_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1312;
		} else {
			__dna__offset = 1256;
		}
		if (__io__equals(runtime, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, runtime)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, runtime);
		} else {
			__io__generic__copy( getRuntime(), runtime);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Volume> __io__addressof() {
		return new CPointer<Volume>(__io__address, new Class[]{Volume.class}, __io__block, __io__blockTable);
	}

}
