package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'PointCache'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1364, size64=1392)
public class PointCache extends CFacade {

	/**
	 * This is the sdna index of the struct PointCache.
	 * <p>
	 * It is required when allocating a new block to store data for PointCache.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 791;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;PointCache&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, PointCache.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'PointCache*'</li>
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
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;PointCache&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, PointCache.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'PointCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Generic flag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of frames between cached frames. This should probably be an upper bound for a per point adaptive step in the future, but for now it's the same for all points. Without adaptivity this can effect the perceived simulation quite a bit though. If for example particles are colliding with a horizontal plane (with high damping) they quickly come to a stop on the plane, however there are still forces acting on the particle (gravity and collisions), so the particle velocity isn't necessarily zero for the whole duration of the frame even if the particle seems stationary. If all simulation frames aren't cached (step > 1) these velocities are interpolated into movement for the non-cached frames. The result will look like the point is oscillating around the collision location. So for now cache step should be set to 1 for accurate reproduction of collisions. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__step);
	 * CPointer&lt;Integer&gt; p_step = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'step'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__step = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'simframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current frame of simulation (only if SIMULATION_VALID). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__simframe);
	 * CPointer&lt;Integer&gt; p_simframe = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simframe'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simframe = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'startframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Simulation}  start frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__startframe);
	 * CPointer&lt;Integer&gt; p_startframe = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'startframe'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__startframe = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'endframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Simulation}  end frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__endframe);
	 * CPointer&lt;Integer&gt; p_endframe = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'endframe'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__endframe = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'editframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Frame being edited (runtime only). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__editframe);
	 * CPointer&lt;Integer&gt; p_editframe = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'editframe'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__editframe = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'last_exact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last exact frame that's cached. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__last_exact);
	 * CPointer&lt;Integer&gt; p_last_exact = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_exact'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_exact = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'last_valid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for editing cache - what is the last baked frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__last_valid);
	 * CPointer&lt;Integer&gt; p_last_valid = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_valid'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_valid = new long[]{36, 44};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'totpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for external cache files Number of cached points. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__totpoint);
	 * CPointer&lt;Integer&gt; p_totpoint = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpoint'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpoint = new long[]{44, 52};

	/**
	 * Field descriptor (offset) for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index number of cache files<h4>Blender Source Code:</h4>
	 * <p> Modifier stack index. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__index);
	 * CPointer&lt;Integer&gt; p_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__index = new long[]{48, 56};

	/**
	 * Field descriptor (offset) for struct member 'compression'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Compression method to be used
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__compression);
	 * CPointer&lt;Short&gt; p_compression = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'compression'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__compression = new long[]{52, 60};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{54, 62};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Cache name
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{56, 64};

	/**
	 * Field descriptor (offset) for struct member 'prev_name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__prev_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_prev_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev_name = new long[]{120, 128};

	/**
	 * Field descriptor (offset) for struct member 'info'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Info on current cache status
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__info);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_info = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'info'</li>
	 * <li>Signature: 'char[128]'</li>
	 * <li>Actual Size (32bit/64bit): 128/128</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__info = new long[]{184, 192};

	/**
	 * Field descriptor (offset) for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> File path, 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__path);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_path = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path = new long[]{312, 320};

	/**
	 * Field descriptor (offset) for struct member 'cached_frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  with flags to indicate cached frames. Can be later used for other per frame flags too if needed. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__cached_frames);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_cached_frames = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cached_frames'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cached_frames = new long[]{1336, 1344};

	/**
	 * Field descriptor (offset) for struct member 'cached_frames_len'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__cached_frames_len);
	 * CPointer&lt;Integer&gt; p_cached_frames_len = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cached_frames_len'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cached_frames_len = new long[]{1340, 1352};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{1344, 1356};

	/**
	 * Field descriptor (offset) for struct member 'mem_cache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__mem_cache);
	 * CPointer&lt;ListBase&gt; p_mem_cache = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mem_cache'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mem_cache = new long[]{1348, 1360};

	/**
	 * Field descriptor (offset) for struct member 'edit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCache pointcache = ...;
	 * CPointer&lt;Object&gt; p = pointcache.__dna__addressof(PointCache.__DNA__FIELD__edit);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_edit = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edit'</li>
	 * <li>Signature: 'PTCacheEdit*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edit = new long[]{1356, 1376};

	public PointCache(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected PointCache(PointCache that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<PointCache> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PointCache.class};
		return new CPointer<PointCache>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PointCache.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<PointCache> next) throws IOException
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
	
	public CPointer<PointCache> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PointCache.class};
		return new CPointer<PointCache>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PointCache.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<PointCache> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Generic flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Generic flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, flag);
		} else {
			__io__block.writeInt(__io__address + 8, flag);
		}
	}

	/**
	 * Get method for struct member 'step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of frames between cached frames. This should probably be an upper bound for a per point adaptive step in the future, but for now it's the same for all points. Without adaptivity this can effect the perceived simulation quite a bit though. If for example particles are colliding with a horizontal plane (with high damping) they quickly come to a stop on the plane, however there are still forces acting on the particle (gravity and collisions), so the particle velocity isn't necessarily zero for the whole duration of the frame even if the particle seems stationary. If all simulation frames aren't cached (step > 1) these velocities are interpolated into movement for the non-cached frames. The result will look like the point is oscillating around the collision location. So for now cache step should be set to 1 for accurate reproduction of collisions. </p>
	 * @see #__DNA__FIELD__step
	 */
	
	public int getStep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'step'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of frames between cached frames. This should probably be an upper bound for a per point adaptive step in the future, but for now it's the same for all points. Without adaptivity this can effect the perceived simulation quite a bit though. If for example particles are colliding with a horizontal plane (with high damping) they quickly come to a stop on the plane, however there are still forces acting on the particle (gravity and collisions), so the particle velocity isn't necessarily zero for the whole duration of the frame even if the particle seems stationary. If all simulation frames aren't cached (step > 1) these velocities are interpolated into movement for the non-cached frames. The result will look like the point is oscillating around the collision location. So for now cache step should be set to 1 for accurate reproduction of collisions. </p>
	 * @see #__DNA__FIELD__step
	 */
	
	public void setStep(int step) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, step);
		} else {
			__io__block.writeInt(__io__address + 12, step);
		}
	}

	/**
	 * Get method for struct member 'simframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current frame of simulation (only if SIMULATION_VALID). </p>
	 * @see #__DNA__FIELD__simframe
	 */
	
	public int getSimframe() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'simframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current frame of simulation (only if SIMULATION_VALID). </p>
	 * @see #__DNA__FIELD__simframe
	 */
	
	public void setSimframe(int simframe) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, simframe);
		} else {
			__io__block.writeInt(__io__address + 16, simframe);
		}
	}

	/**
	 * Get method for struct member 'startframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Simulation}  start frame. </p>
	 * @see #__DNA__FIELD__startframe
	 */
	
	public int getStartframe() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'startframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Simulation}  start frame. </p>
	 * @see #__DNA__FIELD__startframe
	 */
	
	public void setStartframe(int startframe) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, startframe);
		} else {
			__io__block.writeInt(__io__address + 20, startframe);
		}
	}

	/**
	 * Get method for struct member 'endframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Simulation}  end frame. </p>
	 * @see #__DNA__FIELD__endframe
	 */
	
	public int getEndframe() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'endframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Simulation}  end frame. </p>
	 * @see #__DNA__FIELD__endframe
	 */
	
	public void setEndframe(int endframe) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, endframe);
		} else {
			__io__block.writeInt(__io__address + 24, endframe);
		}
	}

	/**
	 * Get method for struct member 'editframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Frame being edited (runtime only). </p>
	 * @see #__DNA__FIELD__editframe
	 */
	
	public int getEditframe() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'editframe'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Frame being edited (runtime only). </p>
	 * @see #__DNA__FIELD__editframe
	 */
	
	public void setEditframe(int editframe) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, editframe);
		} else {
			__io__block.writeInt(__io__address + 28, editframe);
		}
	}

	/**
	 * Get method for struct member 'last_exact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last exact frame that's cached. </p>
	 * @see #__DNA__FIELD__last_exact
	 */
	
	public int getLast_exact() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'last_exact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last exact frame that's cached. </p>
	 * @see #__DNA__FIELD__last_exact
	 */
	
	public void setLast_exact(int last_exact) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, last_exact);
		} else {
			__io__block.writeInt(__io__address + 32, last_exact);
		}
	}

	/**
	 * Get method for struct member 'last_valid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for editing cache - what is the last baked frame. </p>
	 * @see #__DNA__FIELD__last_valid
	 */
	
	public int getLast_valid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'last_valid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for editing cache - what is the last baked frame. </p>
	 * @see #__DNA__FIELD__last_valid
	 */
	
	public void setLast_valid(int last_valid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, last_valid);
		} else {
			__io__block.writeInt(__io__address + 36, last_valid);
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
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 48;
		} else {
			__dna__offset = 40;
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
	 * Get method for struct member 'totpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for external cache files Number of cached points. </p>
	 * @see #__DNA__FIELD__totpoint
	 */
	
	public int getTotpoint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 52);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'totpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for external cache files Number of cached points. </p>
	 * @see #__DNA__FIELD__totpoint
	 */
	
	public void setTotpoint(int totpoint) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 52, totpoint);
		} else {
			__io__block.writeInt(__io__address + 44, totpoint);
		}
	}

	/**
	 * Get method for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index number of cache files<h4>Blender Source Code:</h4>
	 * <p> Modifier stack index. </p>
	 * @see #__DNA__FIELD__index
	 */
	
	public int getIndex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 56);
		} else {
			return __io__block.readInt(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index number of cache files<h4>Blender Source Code:</h4>
	 * <p> Modifier stack index. </p>
	 * @see #__DNA__FIELD__index
	 */
	
	public void setIndex(int index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 56, index);
		} else {
			__io__block.writeInt(__io__address + 48, index);
		}
	}

	/**
	 * Get method for struct member 'compression'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Compression method to be used
	 * @see #__DNA__FIELD__compression
	 */
	
	public short getCompression() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 60);
		} else {
			return __io__block.readShort(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'compression'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Compression method to be used
	 * @see #__DNA__FIELD__compression
	 */
	
	public void setCompression(short compression) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 60, compression);
		} else {
			__io__block.writeShort(__io__address + 52, compression);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 62, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 54, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 62;
		} else {
			__dna__offset = 54;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Cache name
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Cache name
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 56;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'prev_name'.
	 * @see #__DNA__FIELD__prev_name
	 */
	
	public CArrayFacade<Byte> getPrev_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'prev_name'.
	 * @see #__DNA__FIELD__prev_name
	 */
	
	public void setPrev_name(CArrayFacade<Byte> prev_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(prev_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, prev_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, prev_name);
		} else {
			__io__generic__copy( getPrev_name(), prev_name);
		}
	}

	/**
	 * Get method for struct member 'info'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Info on current cache status
	 * @see #__DNA__FIELD__info
	 */
	
	public CArrayFacade<Byte> getInfo() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			128
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'info'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Info on current cache status
	 * @see #__DNA__FIELD__info
	 */
	
	public void setInfo(CArrayFacade<Byte> info) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 184;
		}
		if (__io__equals(info, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, info)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, info);
		} else {
			__io__generic__copy( getInfo(), info);
		}
	}

	/**
	 * Get method for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> File path, 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__path
	 */
	
	public CArrayFacade<Byte> getPath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 320, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 312, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> File path, 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__path
	 */
	
	public void setPath(CArrayFacade<Byte> path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 320;
		} else {
			__dna__offset = 312;
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
	 * Get method for struct member 'cached_frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  with flags to indicate cached frames. Can be later used for other per frame flags too if needed. </p>
	 * @see #__DNA__FIELD__cached_frames
	 */
	
	public CPointer<Byte> getCached_frames() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1344);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1336);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cached_frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  with flags to indicate cached frames. Can be later used for other per frame flags too if needed. </p>
	 * @see #__DNA__FIELD__cached_frames
	 */
	
	public void setCached_frames(CPointer<Byte> cached_frames) throws IOException
	{
		long __address = ((cached_frames == null) ? 0 : cached_frames.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1344, __address);
		} else {
			__io__block.writeLong(__io__address + 1336, __address);
		}
	}

	/**
	 * Get method for struct member 'cached_frames_len'.
	 * @see #__DNA__FIELD__cached_frames_len
	 */
	
	public int getCached_frames_len() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1352);
		} else {
			return __io__block.readInt(__io__address + 1340);
		}
	}

	/**
	 * Set method for struct member 'cached_frames_len'.
	 * @see #__DNA__FIELD__cached_frames_len
	 */
	
	public void setCached_frames_len(int cached_frames_len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1352, cached_frames_len);
		} else {
			__io__block.writeInt(__io__address + 1340, cached_frames_len);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1356, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1344, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1356;
		} else {
			__dna__offset = 1344;
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
	 * Get method for struct member 'mem_cache'.
	 * @see #__DNA__FIELD__mem_cache
	 */
	
	public ListBase getMem_cache() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1360, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1348, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mem_cache'.
	 * @see #__DNA__FIELD__mem_cache
	 */
	
	public void setMem_cache(ListBase mem_cache) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1360;
		} else {
			__dna__offset = 1348;
		}
		if (__io__equals(mem_cache, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mem_cache)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mem_cache);
		} else {
			__io__generic__copy( getMem_cache(), mem_cache);
		}
	}

	/**
	 * Get method for struct member 'edit'.
	 * @see #__DNA__FIELD__edit
	 */
	
	public CPointer<Object> getEdit() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1356);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'edit'.
	 * @see #__DNA__FIELD__edit
	 */
	
	public void setEdit(CPointer<Object> edit) throws IOException
	{
		long __address = ((edit == null) ? 0 : edit.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1376, __address);
		} else {
			__io__block.writeLong(__io__address + 1356, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<PointCache> __io__addressof() {
		return new CPointer<PointCache>(__io__address, new Class[]{PointCache.class}, __io__block, __io__blockTable);
	}

}
