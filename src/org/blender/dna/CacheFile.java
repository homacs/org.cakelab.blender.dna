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

@CMetaData(size32=2308, size64=2368)
public class CacheFile extends CFacade {

	/**
	 * This is the sdna index of the struct CacheFile.
	 * <p>
	 * It is required when allocating a new block to store data for CacheFile.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 755;

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
	 * <li>Actual Size (32bit/64bit): 136/176</li>
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
	public static final long[] __DNA__FIELD__adt = new long[]{136, 176};

	/**
	 * Field descriptor (offset) for struct member 'object_paths'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Paths of the objects inside the Alembic archive<h4>Blender Source Code:</h4>
	 * <p> Paths of the objects inside of the archive referenced by this {@link CacheFile} . </p>
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
	public static final long[] __DNA__FIELD__object_paths = new long[]{140, 184};

	/**
	 * Field descriptor (offset) for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Path to external displacements file<h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
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
	public static final long[] __DNA__FIELD__filepath = new long[]{148, 200};

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
	public static final long[] __DNA__FIELD__is_sequence = new long[]{1172, 1224};

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
	public static final long[] __DNA__FIELD__forward_axis = new long[]{1173, 1225};

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
	public static final long[] __DNA__FIELD__up_axis = new long[]{1174, 1226};

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
	public static final long[] __DNA__FIELD__override_frame = new long[]{1175, 1227};

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
	public static final long[] __DNA__FIELD__scale = new long[]{1176, 1228};

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
	public static final long[] __DNA__FIELD__frame = new long[]{1180, 1232};

	/**
	 * Field descriptor (offset) for struct member 'frame_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Subtracted from the current frame to use for looking up the data in the cache file, or to determine which file to use in a file sequence<h4>Blender Source Code:</h4>
	 * <p> The frame offset to subtract. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__frame_offset);
	 * CPointer&lt;Float&gt; p_frame_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frame_offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frame_offset = new long[]{1184, 1236};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1188, 1240};

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
	public static final long[] __DNA__FIELD__flag = new long[]{1192, 1244};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eCacheFileType enum. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{1194, 1246};

	/**
	 * Field descriptor (offset) for struct member 'use_render_procedural'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Display boxes in the viewport as placeholders for the objects, Cycles will use a procedural to load the objects during viewport rendering in experimental mode, other render engines will also receive a placeholder and should take care of loading the Alembic data themselves if possible<h4>Blender Source Code:</h4>
	 * <p> Do not load data from the cache file and display objects in the scene as boxes, Cycles will load objects directly from the {@link CacheFile} . Other render engines which can load Alembic data directly can take care of rendering it themselves. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__use_render_procedural);
	 * CPointer&lt;Byte&gt; p_use_render_procedural = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_render_procedural'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_render_procedural = new long[]{1195, 1247};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{1196, 1248};

	/**
	 * Field descriptor (offset) for struct member 'use_prefetch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * When enabled, the Cycles Procedural will preload animation data for faster updates<h4>Blender Source Code:</h4>
	 * <p> Enable data prefetching when using the Cycles Procedural. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__use_prefetch);
	 * CPointer&lt;Byte&gt; p_use_prefetch = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_prefetch'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_prefetch = new long[]{1199, 1251};

	/**
	 * Field descriptor (offset) for struct member 'prefetch_cache_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Memory usage limit in megabytes for the Cycles Procedural cache, if the data does not fit within the limit, rendering is aborted<h4>Blender Source Code:</h4>
	 * <p> Size in megabytes for the prefetch cache used by the Cycles Procedural. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__prefetch_cache_size);
	 * CPointer&lt;Integer&gt; p_prefetch_cache_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prefetch_cache_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prefetch_cache_size = new long[]{1200, 1252};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{1204, 1256};

	/**
	 * Field descriptor (offset) for struct member 'velocity_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Define how the velocity vectors are interpreted with regard to time, 'frame' means the delta time is 1 frame, 'second' means the delta time is 1 / FPS
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__velocity_unit);
	 * CPointer&lt;Byte&gt; p_velocity_unit = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'velocity_unit'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__velocity_unit = new long[]{1211, 1263};

	/**
	 * Field descriptor (offset) for struct member 'velocity_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Name of the Alembic attribute used for generating motion blur data<h4>Blender Source Code:</h4>
	 * <p> Name of the velocity property in the archive. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__velocity_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_velocity_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'velocity_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__velocity_name = new long[]{1212, 1264};

	/**
	 * Field descriptor (offset) for struct member 'handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime </p>
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
	 * <li>Signature: 'CacheArchiveHandle*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle = new long[]{1276, 1328};

	/**
	 * Field descriptor (offset) for struct member 'handle_filepath'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__handle_filepath);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_handle_filepath = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_filepath'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_filepath = new long[]{1280, 1336};

	/**
	 * Field descriptor (offset) for struct member 'handle_readers'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CacheFile cachefile = ...;
	 * CPointer&lt;Object&gt; p = cachefile.__dna__addressof(CacheFile.__DNA__FIELD__handle_readers);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_handle_readers = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_readers'</li>
	 * <li>Signature: 'GSet*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_readers = new long[]{2304, 2360};

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
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
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
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Get method for struct member 'object_paths'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Paths of the objects inside the Alembic archive<h4>Blender Source Code:</h4>
	 * <p> Paths of the objects inside of the archive referenced by this {@link CacheFile} . </p>
	 * @see #__DNA__FIELD__object_paths
	 */
	
	public ListBase getObject_paths() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 184, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 140, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'object_paths'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Paths of the objects inside the Alembic archive<h4>Blender Source Code:</h4>
	 * <p> Paths of the objects inside of the archive referenced by this {@link CacheFile} . </p>
	 * @see #__DNA__FIELD__object_paths
	 */
	
	public void setObject_paths(ListBase object_paths) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 140;
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
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__filepath
	 */
	
	public CArrayFacade<Byte> getFilepath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Path to external displacements file<h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__filepath
	 */
	
	public void setFilepath(CArrayFacade<Byte> filepath) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 148;
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
			return __io__block.readByte(__io__address + 1224);
		} else {
			return __io__block.readByte(__io__address + 1172);
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
			__io__block.writeByte(__io__address + 1224, is_sequence);
		} else {
			__io__block.writeByte(__io__address + 1172, is_sequence);
		}
	}

	/**
	 * Get method for struct member 'forward_axis'.
	 * @see #__DNA__FIELD__forward_axis
	 */
	
	public byte getForward_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1225);
		} else {
			return __io__block.readByte(__io__address + 1173);
		}
	}

	/**
	 * Set method for struct member 'forward_axis'.
	 * @see #__DNA__FIELD__forward_axis
	 */
	
	public void setForward_axis(byte forward_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1225, forward_axis);
		} else {
			__io__block.writeByte(__io__address + 1173, forward_axis);
		}
	}

	/**
	 * Get method for struct member 'up_axis'.
	 * @see #__DNA__FIELD__up_axis
	 */
	
	public byte getUp_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1226);
		} else {
			return __io__block.readByte(__io__address + 1174);
		}
	}

	/**
	 * Set method for struct member 'up_axis'.
	 * @see #__DNA__FIELD__up_axis
	 */
	
	public void setUp_axis(byte up_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1226, up_axis);
		} else {
			__io__block.writeByte(__io__address + 1174, up_axis);
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
			return __io__block.readByte(__io__address + 1227);
		} else {
			return __io__block.readByte(__io__address + 1175);
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
			__io__block.writeByte(__io__address + 1227, override_frame);
		} else {
			__io__block.writeByte(__io__address + 1175, override_frame);
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
			return __io__block.readFloat(__io__address + 1228);
		} else {
			return __io__block.readFloat(__io__address + 1176);
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
			__io__block.writeFloat(__io__address + 1228, scale);
		} else {
			__io__block.writeFloat(__io__address + 1176, scale);
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
			return __io__block.readFloat(__io__address + 1232);
		} else {
			return __io__block.readFloat(__io__address + 1180);
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
			__io__block.writeFloat(__io__address + 1232, frame);
		} else {
			__io__block.writeFloat(__io__address + 1180, frame);
		}
	}

	/**
	 * Get method for struct member 'frame_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Subtracted from the current frame to use for looking up the data in the cache file, or to determine which file to use in a file sequence<h4>Blender Source Code:</h4>
	 * <p> The frame offset to subtract. </p>
	 * @see #__DNA__FIELD__frame_offset
	 */
	
	public float getFrame_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1236);
		} else {
			return __io__block.readFloat(__io__address + 1184);
		}
	}

	/**
	 * Set method for struct member 'frame_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Subtracted from the current frame to use for looking up the data in the cache file, or to determine which file to use in a file sequence<h4>Blender Source Code:</h4>
	 * <p> The frame offset to subtract. </p>
	 * @see #__DNA__FIELD__frame_offset
	 */
	
	public void setFrame_offset(float frame_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1236, frame_offset);
		} else {
			__io__block.writeFloat(__io__address + 1184, frame_offset);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1240;
		} else {
			__dna__offset = 1188;
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
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1244);
		} else {
			return __io__block.readShort(__io__address + 1192);
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
			__io__block.writeShort(__io__address + 1244, flag);
		} else {
			__io__block.writeShort(__io__address + 1192, flag);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eCacheFileType enum. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1246);
		} else {
			return __io__block.readByte(__io__address + 1194);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eCacheFileType enum. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1246, type);
		} else {
			__io__block.writeByte(__io__address + 1194, type);
		}
	}

	/**
	 * Get method for struct member 'use_render_procedural'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Display boxes in the viewport as placeholders for the objects, Cycles will use a procedural to load the objects during viewport rendering in experimental mode, other render engines will also receive a placeholder and should take care of loading the Alembic data themselves if possible<h4>Blender Source Code:</h4>
	 * <p> Do not load data from the cache file and display objects in the scene as boxes, Cycles will load objects directly from the {@link CacheFile} . Other render engines which can load Alembic data directly can take care of rendering it themselves. </p>
	 * @see #__DNA__FIELD__use_render_procedural
	 */
	
	public byte getUse_render_procedural() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1247);
		} else {
			return __io__block.readByte(__io__address + 1195);
		}
	}

	/**
	 * Set method for struct member 'use_render_procedural'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Display boxes in the viewport as placeholders for the objects, Cycles will use a procedural to load the objects during viewport rendering in experimental mode, other render engines will also receive a placeholder and should take care of loading the Alembic data themselves if possible<h4>Blender Source Code:</h4>
	 * <p> Do not load data from the cache file and display objects in the scene as boxes, Cycles will load objects directly from the {@link CacheFile} . Other render engines which can load Alembic data directly can take care of rendering it themselves. </p>
	 * @see #__DNA__FIELD__use_render_procedural
	 */
	
	public void setUse_render_procedural(byte use_render_procedural) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1247, use_render_procedural);
		} else {
			__io__block.writeByte(__io__address + 1195, use_render_procedural);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1248;
		} else {
			__dna__offset = 1196;
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
	 * Get method for struct member 'use_prefetch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * When enabled, the Cycles Procedural will preload animation data for faster updates<h4>Blender Source Code:</h4>
	 * <p> Enable data prefetching when using the Cycles Procedural. </p>
	 * @see #__DNA__FIELD__use_prefetch
	 */
	
	public byte getUse_prefetch() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1251);
		} else {
			return __io__block.readByte(__io__address + 1199);
		}
	}

	/**
	 * Set method for struct member 'use_prefetch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * When enabled, the Cycles Procedural will preload animation data for faster updates<h4>Blender Source Code:</h4>
	 * <p> Enable data prefetching when using the Cycles Procedural. </p>
	 * @see #__DNA__FIELD__use_prefetch
	 */
	
	public void setUse_prefetch(byte use_prefetch) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1251, use_prefetch);
		} else {
			__io__block.writeByte(__io__address + 1199, use_prefetch);
		}
	}

	/**
	 * Get method for struct member 'prefetch_cache_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Memory usage limit in megabytes for the Cycles Procedural cache, if the data does not fit within the limit, rendering is aborted<h4>Blender Source Code:</h4>
	 * <p> Size in megabytes for the prefetch cache used by the Cycles Procedural. </p>
	 * @see #__DNA__FIELD__prefetch_cache_size
	 */
	
	public int getPrefetch_cache_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1252);
		} else {
			return __io__block.readInt(__io__address + 1200);
		}
	}

	/**
	 * Set method for struct member 'prefetch_cache_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Memory usage limit in megabytes for the Cycles Procedural cache, if the data does not fit within the limit, rendering is aborted<h4>Blender Source Code:</h4>
	 * <p> Size in megabytes for the prefetch cache used by the Cycles Procedural. </p>
	 * @see #__DNA__FIELD__prefetch_cache_size
	 */
	
	public void setPrefetch_cache_size(int prefetch_cache_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1252, prefetch_cache_size);
		} else {
			__io__block.writeInt(__io__address + 1200, prefetch_cache_size);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1256, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1256;
		} else {
			__dna__offset = 1204;
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
	 * Get method for struct member 'velocity_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Define how the velocity vectors are interpreted with regard to time, 'frame' means the delta time is 1 frame, 'second' means the delta time is 1 / FPS
	 * @see #__DNA__FIELD__velocity_unit
	 */
	
	public byte getVelocity_unit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1263);
		} else {
			return __io__block.readByte(__io__address + 1211);
		}
	}

	/**
	 * Set method for struct member 'velocity_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Define how the velocity vectors are interpreted with regard to time, 'frame' means the delta time is 1 frame, 'second' means the delta time is 1 / FPS
	 * @see #__DNA__FIELD__velocity_unit
	 */
	
	public void setVelocity_unit(byte velocity_unit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1263, velocity_unit);
		} else {
			__io__block.writeByte(__io__address + 1211, velocity_unit);
		}
	}

	/**
	 * Get method for struct member 'velocity_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Name of the Alembic attribute used for generating motion blur data<h4>Blender Source Code:</h4>
	 * <p> Name of the velocity property in the archive. </p>
	 * @see #__DNA__FIELD__velocity_name
	 */
	
	public CArrayFacade<Byte> getVelocity_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1264, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1212, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'velocity_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Name of the Alembic attribute used for generating motion blur data<h4>Blender Source Code:</h4>
	 * <p> Name of the velocity property in the archive. </p>
	 * @see #__DNA__FIELD__velocity_name
	 */
	
	public void setVelocity_name(CArrayFacade<Byte> velocity_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1264;
		} else {
			__dna__offset = 1212;
		}
		if (__io__equals(velocity_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, velocity_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, velocity_name);
		} else {
			__io__generic__copy( getVelocity_name(), velocity_name);
		}
	}

	/**
	 * Get method for struct member 'handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime </p>
	 * @see #__DNA__FIELD__handle
	 */
	
	public CPointer<Object> getHandle() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1328);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1276);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime </p>
	 * @see #__DNA__FIELD__handle
	 */
	
	public void setHandle(CPointer<Object> handle) throws IOException
	{
		long __address = ((handle == null) ? 0 : handle.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1328, __address);
		} else {
			__io__block.writeLong(__io__address + 1276, __address);
		}
	}

	/**
	 * Get method for struct member 'handle_filepath'.
	 * @see #__DNA__FIELD__handle_filepath
	 */
	
	public CArrayFacade<Byte> getHandle_filepath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1336, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1280, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handle_filepath'.
	 * @see #__DNA__FIELD__handle_filepath
	 */
	
	public void setHandle_filepath(CArrayFacade<Byte> handle_filepath) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1336;
		} else {
			__dna__offset = 1280;
		}
		if (__io__equals(handle_filepath, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handle_filepath)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handle_filepath);
		} else {
			__io__generic__copy( getHandle_filepath(), handle_filepath);
		}
	}

	/**
	 * Get method for struct member 'handle_readers'.
	 * @see #__DNA__FIELD__handle_readers
	 */
	
	public CPointer<Object> getHandle_readers() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 2360);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 2304);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'handle_readers'.
	 * @see #__DNA__FIELD__handle_readers
	 */
	
	public void setHandle_readers(CPointer<Object> handle_readers) throws IOException
	{
		long __address = ((handle_readers == null) ? 0 : handle_readers.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 2360, __address);
		} else {
			__io__block.writeLong(__io__address + 2304, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CacheFile> __io__addressof() {
		return new CPointer<CacheFile>(__io__address, new Class[]{CacheFile.class}, __io__block, __io__blockTable);
	}

}
