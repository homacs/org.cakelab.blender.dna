package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieTrackingTrack'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=192, size64=208)
public class MovieTrackingTrack extends CFacade {

	/**
	 * This is the sdna index of the struct MovieTrackingTrack.
	 * <p>
	 * It is required when allocating a new block to store data for MovieTrackingTrack.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 546;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;MovieTrackingTrack&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, MovieTrackingTrack.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'MovieTrackingTrack*'</li>
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
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;MovieTrackingTrack&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, MovieTrackingTrack.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'MovieTrackingTrack*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique name of track<h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'pat_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** setings ** positions of left-bottom and right-top corners of pattern (in unified 0..1 units, relative to marker->pos) moved to marker's corners since planar tracking implementation
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__pat_min);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_pat_min = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pat_min'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pat_min = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'pat_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__pat_max);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_pat_max = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pat_max'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pat_max = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'search_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> positions of left-bottom and right-top corners of search area (in unified 0..1 units, relative to marker->pos moved to marker since affine tracking implementation
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__search_min);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_search_min = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'search_min'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__search_min = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'search_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__search_max);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_search_max = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'search_max'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__search_max = new long[]{96, 104};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset of track from the parenting point<h4>Blender Source Code:</h4>
	 * <p> offset to "parenting" point </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{104, 112};

	/**
	 * Field descriptor (offset) for struct member 'markersnr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** track ** count of markers in track </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__markersnr);
	 * CPointer&lt;Integer&gt; p_markersnr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'markersnr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__markersnr = new long[]{112, 120};

	/**
	 * Field descriptor (offset) for struct member 'last_marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> most recently used marker </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__last_marker);
	 * CPointer&lt;Integer&gt; p_last_marker = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_marker'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_marker = new long[]{116, 124};

	/**
	 * Field descriptor (offset) for struct member 'markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of markers in track<h4>Blender Source Code:</h4>
	 * <p> markers in track </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__markers);
	 * CPointer&lt;CPointer&lt;MovieTrackingMarker&gt;&gt; p_markers = p.cast(new Class[]{CPointer.class, MovieTrackingMarker.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'markers'</li>
	 * <li>Signature: 'MovieTrackingMarker*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__markers = new long[]{120, 128};

	/**
	 * Field descriptor (offset) for struct member 'bundle_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** reconstruction data ** reconstructed position </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__bundle_pos);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_bundle_pos = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bundle_pos'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bundle_pos = new long[]{124, 136};

	/**
	 * Field descriptor (offset) for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> average track reprojection error </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__error);
	 * CPointer&lt;Float&gt; p_error = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'error'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__error = new long[]{136, 148};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** UI editing ** </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{140, 152};

	/**
	 * Field descriptor (offset) for struct member 'pat_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__pat_flag);
	 * CPointer&lt;Integer&gt; p_pat_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pat_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pat_flag = new long[]{144, 156};

	/**
	 * Field descriptor (offset) for struct member 'search_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags (selection, ...) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__search_flag);
	 * CPointer&lt;Integer&gt; p_search_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'search_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__search_flag = new long[]{148, 160};

	/**
	 * Field descriptor (offset) for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color of the track in the Movie Clip Editor and the 3D viewport after a solve<h4>Blender Source Code:</h4>
	 * <p> custom color for track </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color = new long[]{152, 164};

	/**
	 * Field descriptor (offset) for struct member 'frames_limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Every tracking cycle, this number of frames are tracked<h4>Blender Source Code:</h4>
	 * <p> ** control how tracking happens number of frames to be tarcked during single tracking session (if TRACKING_FRAMES_LIMIT is set) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__frames_limit);
	 * CPointer&lt;Short&gt; p_frames_limit = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frames_limit'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frames_limit = new long[]{164, 176};

	/**
	 * Field descriptor (offset) for struct member 'margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance from image boundary at which marker stops tracking<h4>Blender Source Code:</h4>
	 * <p> margin from frame boundaries </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__margin);
	 * CPointer&lt;Short&gt; p_margin = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'margin'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__margin = new long[]{166, 178};

	/**
	 * Field descriptor (offset) for struct member 'pattern_match'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Track pattern from given frame when tracking marker to next frame<h4>Blender Source Code:</h4>
	 * <p> re-adjust every N frames </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__pattern_match);
	 * CPointer&lt;Short&gt; p_pattern_match = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pattern_match'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pattern_match = new long[]{168, 180};

	/**
	 * Field descriptor (offset) for struct member 'motion_model'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Default motion model to use for tracking<h4>Blender Source Code:</h4>
	 * <p> tracking parameters model of the motion for this track </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__motion_model);
	 * CPointer&lt;Short&gt; p_motion_model = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'motion_model'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__motion_model = new long[]{170, 182};

	/**
	 * Field descriptor (offset) for struct member 'algorithm_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags for the tracking algorithm (use brute, use esm, use pyramid, etc </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__algorithm_flag);
	 * CPointer&lt;Integer&gt; p_algorithm_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'algorithm_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__algorithm_flag = new long[]{172, 184};

	/**
	 * Field descriptor (offset) for struct member 'minimum_correlation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> minimal correlation which is still treated as successful tracking </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__minimum_correlation);
	 * CPointer&lt;Float&gt; p_minimum_correlation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minimum_correlation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minimum_correlation = new long[]{176, 188};

	/**
	 * Field descriptor (offset) for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> grease-pencil data </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__gpd);
	 * CPointer&lt;CPointer&lt;bGPdata&gt;&gt; p_gpd = p.cast(new Class[]{CPointer.class, bGPdata.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpd'</li>
	 * <li>Signature: 'bGPdata*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpd = new long[]{180, 192};

	/**
	 * Field descriptor (offset) for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Influence of this track on a final solution<h4>Blender Source Code:</h4>
	 * <p> Weight of this track.</p><p> Weight defines how much the track affects on the final reconstruction, usually gets animated in a way so when track has just appeared it's weight is zero and then it gets faded up.</p><p> Used to prevent jumps of the camera when tracks are appearing or disappearing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__weight);
	 * CPointer&lt;Float&gt; p_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__weight = new long[]{184, 200};

	/**
	 * Field descriptor (offset) for struct member 'weight_stab'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Influence of this track on 2D stabilization<h4>Blender Source Code:</h4>
	 * <p> track weight especially for 2D stabilization </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingTrack movietrackingtrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingtrack.__dna__addressof(MovieTrackingTrack.__DNA__FIELD__weight_stab);
	 * CPointer&lt;Float&gt; p_weight_stab = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'weight_stab'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__weight_stab = new long[]{188, 204};

	public MovieTrackingTrack(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieTrackingTrack(MovieTrackingTrack that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<MovieTrackingTrack> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingTrack.class};
		return new CPointer<MovieTrackingTrack>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingTrack.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<MovieTrackingTrack> next) throws IOException
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
	
	public CPointer<MovieTrackingTrack> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingTrack.class};
		return new CPointer<MovieTrackingTrack>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingTrack.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<MovieTrackingTrack> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique name of track<h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique name of track<h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
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
	 * Get method for struct member 'pat_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** setings ** positions of left-bottom and right-top corners of pattern (in unified 0..1 units, relative to marker->pos) moved to marker's corners since planar tracking implementation
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__pat_min
	 */
	
	public CArrayFacade<Float> getPat_min() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pat_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** setings ** positions of left-bottom and right-top corners of pattern (in unified 0..1 units, relative to marker->pos) moved to marker's corners since planar tracking implementation
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__pat_min
	 */
	
	public void setPat_min(CArrayFacade<Float> pat_min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(pat_min, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pat_min)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pat_min);
		} else {
			__io__generic__copy( getPat_min(), pat_min);
		}
	}

	/**
	 * Get method for struct member 'pat_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__pat_max
	 */
	
	public CArrayFacade<Float> getPat_max() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pat_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__pat_max
	 */
	
	public void setPat_max(CArrayFacade<Float> pat_max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(pat_max, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pat_max)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pat_max);
		} else {
			__io__generic__copy( getPat_max(), pat_max);
		}
	}

	/**
	 * Get method for struct member 'search_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> positions of left-bottom and right-top corners of search area (in unified 0..1 units, relative to marker->pos moved to marker since affine tracking implementation
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__search_min
	 */
	
	public CArrayFacade<Float> getSearch_min() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'search_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> positions of left-bottom and right-top corners of search area (in unified 0..1 units, relative to marker->pos moved to marker since affine tracking implementation
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__search_min
	 */
	
	public void setSearch_min(CArrayFacade<Float> search_min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 88;
		}
		if (__io__equals(search_min, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, search_min)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, search_min);
		} else {
			__io__generic__copy( getSearch_min(), search_min);
		}
	}

	/**
	 * Get method for struct member 'search_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__search_max
	 */
	
	public CArrayFacade<Float> getSearch_max() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'search_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__search_max
	 */
	
	public void setSearch_max(CArrayFacade<Float> search_max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(search_max, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, search_max)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, search_max);
		} else {
			__io__generic__copy( getSearch_max(), search_max);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset of track from the parenting point<h4>Blender Source Code:</h4>
	 * <p> offset to "parenting" point </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public CArrayFacade<Float> getOffset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Offset of track from the parenting point<h4>Blender Source Code:</h4>
	 * <p> offset to "parenting" point </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(CArrayFacade<Float> offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 112;
		} else {
			__dna__offset = 104;
		}
		if (__io__equals(offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, offset);
		} else {
			__io__generic__copy( getOffset(), offset);
		}
	}

	/**
	 * Get method for struct member 'markersnr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** track ** count of markers in track </p>
	 * @see #__DNA__FIELD__markersnr
	 */
	
	public int getMarkersnr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 120);
		} else {
			return __io__block.readInt(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'markersnr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** track ** count of markers in track </p>
	 * @see #__DNA__FIELD__markersnr
	 */
	
	public void setMarkersnr(int markersnr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 120, markersnr);
		} else {
			__io__block.writeInt(__io__address + 112, markersnr);
		}
	}

	/**
	 * Get method for struct member 'last_marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> most recently used marker </p>
	 * @see #__DNA__FIELD__last_marker
	 */
	
	public int getLast_marker() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 124);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'last_marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> most recently used marker </p>
	 * @see #__DNA__FIELD__last_marker
	 */
	
	public void setLast_marker(int last_marker) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 124, last_marker);
		} else {
			__io__block.writeInt(__io__address + 116, last_marker);
		}
	}

	/**
	 * Get method for struct member 'markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of markers in track<h4>Blender Source Code:</h4>
	 * <p> markers in track </p>
	 * @see #__DNA__FIELD__markers
	 */
	
	public CPointer<MovieTrackingMarker> getMarkers() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingMarker.class};
		return new CPointer<MovieTrackingMarker>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingMarker.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of markers in track<h4>Blender Source Code:</h4>
	 * <p> markers in track </p>
	 * @see #__DNA__FIELD__markers
	 */
	
	public void setMarkers(CPointer<MovieTrackingMarker> markers) throws IOException
	{
		long __address = ((markers == null) ? 0 : markers.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'bundle_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** reconstruction data ** reconstructed position </p>
	 * @see #__DNA__FIELD__bundle_pos
	 */
	
	public CArrayFacade<Float> getBundle_pos() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bundle_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** reconstruction data ** reconstructed position </p>
	 * @see #__DNA__FIELD__bundle_pos
	 */
	
	public void setBundle_pos(CArrayFacade<Float> bundle_pos) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 136;
		} else {
			__dna__offset = 124;
		}
		if (__io__equals(bundle_pos, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bundle_pos)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bundle_pos);
		} else {
			__io__generic__copy( getBundle_pos(), bundle_pos);
		}
	}

	/**
	 * Get method for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> average track reprojection error </p>
	 * @see #__DNA__FIELD__error
	 */
	
	public float getError() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> average track reprojection error </p>
	 * @see #__DNA__FIELD__error
	 */
	
	public void setError(float error) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, error);
		} else {
			__io__block.writeFloat(__io__address + 136, error);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** UI editing ** </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 152);
		} else {
			return __io__block.readInt(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** UI editing ** </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 152, flag);
		} else {
			__io__block.writeInt(__io__address + 140, flag);
		}
	}

	/**
	 * Get method for struct member 'pat_flag'.
	 * @see #__DNA__FIELD__pat_flag
	 */
	
	public int getPat_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 156);
		} else {
			return __io__block.readInt(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'pat_flag'.
	 * @see #__DNA__FIELD__pat_flag
	 */
	
	public void setPat_flag(int pat_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 156, pat_flag);
		} else {
			__io__block.writeInt(__io__address + 144, pat_flag);
		}
	}

	/**
	 * Get method for struct member 'search_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags (selection, ...) </p>
	 * @see #__DNA__FIELD__search_flag
	 */
	
	public int getSearch_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 160);
		} else {
			return __io__block.readInt(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'search_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags (selection, ...) </p>
	 * @see #__DNA__FIELD__search_flag
	 */
	
	public void setSearch_flag(int search_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 160, search_flag);
		} else {
			__io__block.writeInt(__io__address + 148, search_flag);
		}
	}

	/**
	 * Get method for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color of the track in the Movie Clip Editor and the 3D viewport after a solve<h4>Blender Source Code:</h4>
	 * <p> custom color for track </p>
	 * @see #__DNA__FIELD__color
	 */
	
	public CArrayFacade<Float> getColor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 164, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color of the track in the Movie Clip Editor and the 3D viewport after a solve<h4>Blender Source Code:</h4>
	 * <p> custom color for track </p>
	 * @see #__DNA__FIELD__color
	 */
	
	public void setColor(CArrayFacade<Float> color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 164;
		} else {
			__dna__offset = 152;
		}
		if (__io__equals(color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, color);
		} else {
			__io__generic__copy( getColor(), color);
		}
	}

	/**
	 * Get method for struct member 'frames_limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Every tracking cycle, this number of frames are tracked<h4>Blender Source Code:</h4>
	 * <p> ** control how tracking happens number of frames to be tarcked during single tracking session (if TRACKING_FRAMES_LIMIT is set) </p>
	 * @see #__DNA__FIELD__frames_limit
	 */
	
	public short getFrames_limit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 176);
		} else {
			return __io__block.readShort(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'frames_limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Every tracking cycle, this number of frames are tracked<h4>Blender Source Code:</h4>
	 * <p> ** control how tracking happens number of frames to be tarcked during single tracking session (if TRACKING_FRAMES_LIMIT is set) </p>
	 * @see #__DNA__FIELD__frames_limit
	 */
	
	public void setFrames_limit(short frames_limit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 176, frames_limit);
		} else {
			__io__block.writeShort(__io__address + 164, frames_limit);
		}
	}

	/**
	 * Get method for struct member 'margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance from image boundary at which marker stops tracking<h4>Blender Source Code:</h4>
	 * <p> margin from frame boundaries </p>
	 * @see #__DNA__FIELD__margin
	 */
	
	public short getMargin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 178);
		} else {
			return __io__block.readShort(__io__address + 166);
		}
	}

	/**
	 * Set method for struct member 'margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance from image boundary at which marker stops tracking<h4>Blender Source Code:</h4>
	 * <p> margin from frame boundaries </p>
	 * @see #__DNA__FIELD__margin
	 */
	
	public void setMargin(short margin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 178, margin);
		} else {
			__io__block.writeShort(__io__address + 166, margin);
		}
	}

	/**
	 * Get method for struct member 'pattern_match'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Track pattern from given frame when tracking marker to next frame<h4>Blender Source Code:</h4>
	 * <p> re-adjust every N frames </p>
	 * @see #__DNA__FIELD__pattern_match
	 */
	
	public short getPattern_match() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 180);
		} else {
			return __io__block.readShort(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'pattern_match'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Track pattern from given frame when tracking marker to next frame<h4>Blender Source Code:</h4>
	 * <p> re-adjust every N frames </p>
	 * @see #__DNA__FIELD__pattern_match
	 */
	
	public void setPattern_match(short pattern_match) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 180, pattern_match);
		} else {
			__io__block.writeShort(__io__address + 168, pattern_match);
		}
	}

	/**
	 * Get method for struct member 'motion_model'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Default motion model to use for tracking<h4>Blender Source Code:</h4>
	 * <p> tracking parameters model of the motion for this track </p>
	 * @see #__DNA__FIELD__motion_model
	 */
	
	public short getMotion_model() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 182);
		} else {
			return __io__block.readShort(__io__address + 170);
		}
	}

	/**
	 * Set method for struct member 'motion_model'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Default motion model to use for tracking<h4>Blender Source Code:</h4>
	 * <p> tracking parameters model of the motion for this track </p>
	 * @see #__DNA__FIELD__motion_model
	 */
	
	public void setMotion_model(short motion_model) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 182, motion_model);
		} else {
			__io__block.writeShort(__io__address + 170, motion_model);
		}
	}

	/**
	 * Get method for struct member 'algorithm_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags for the tracking algorithm (use brute, use esm, use pyramid, etc </p>
	 * @see #__DNA__FIELD__algorithm_flag
	 */
	
	public int getAlgorithm_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 184);
		} else {
			return __io__block.readInt(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'algorithm_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags for the tracking algorithm (use brute, use esm, use pyramid, etc </p>
	 * @see #__DNA__FIELD__algorithm_flag
	 */
	
	public void setAlgorithm_flag(int algorithm_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 184, algorithm_flag);
		} else {
			__io__block.writeInt(__io__address + 172, algorithm_flag);
		}
	}

	/**
	 * Get method for struct member 'minimum_correlation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> minimal correlation which is still treated as successful tracking </p>
	 * @see #__DNA__FIELD__minimum_correlation
	 */
	
	public float getMinimum_correlation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'minimum_correlation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> minimal correlation which is still treated as successful tracking </p>
	 * @see #__DNA__FIELD__minimum_correlation
	 */
	
	public void setMinimum_correlation(float minimum_correlation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, minimum_correlation);
		} else {
			__io__block.writeFloat(__io__address + 176, minimum_correlation);
		}
	}

	/**
	 * Get method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> grease-pencil data </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public CPointer<bGPdata> getGpd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 180);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPdata.class};
		return new CPointer<bGPdata>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPdata.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> grease-pencil data </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public void setGpd(CPointer<bGPdata> gpd) throws IOException
	{
		long __address = ((gpd == null) ? 0 : gpd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 180, __address);
		}
	}

	/**
	 * Get method for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Influence of this track on a final solution<h4>Blender Source Code:</h4>
	 * <p> Weight of this track.</p><p> Weight defines how much the track affects on the final reconstruction, usually gets animated in a way so when track has just appeared it's weight is zero and then it gets faded up.</p><p> Used to prevent jumps of the camera when tracks are appearing or disappearing. </p>
	 * @see #__DNA__FIELD__weight
	 */
	
	public float getWeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Influence of this track on a final solution<h4>Blender Source Code:</h4>
	 * <p> Weight of this track.</p><p> Weight defines how much the track affects on the final reconstruction, usually gets animated in a way so when track has just appeared it's weight is zero and then it gets faded up.</p><p> Used to prevent jumps of the camera when tracks are appearing or disappearing. </p>
	 * @see #__DNA__FIELD__weight
	 */
	
	public void setWeight(float weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, weight);
		} else {
			__io__block.writeFloat(__io__address + 184, weight);
		}
	}

	/**
	 * Get method for struct member 'weight_stab'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Influence of this track on 2D stabilization<h4>Blender Source Code:</h4>
	 * <p> track weight especially for 2D stabilization </p>
	 * @see #__DNA__FIELD__weight_stab
	 */
	
	public float getWeight_stab() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'weight_stab'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Influence of this track on 2D stabilization<h4>Blender Source Code:</h4>
	 * <p> track weight especially for 2D stabilization </p>
	 * @see #__DNA__FIELD__weight_stab
	 */
	
	public void setWeight_stab(float weight_stab) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, weight_stab);
		} else {
			__io__block.writeFloat(__io__address + 188, weight_stab);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieTrackingTrack> __io__addressof() {
		return new CPointer<MovieTrackingTrack>(__io__address, new Class[]{MovieTrackingTrack.class}, __io__block, __io__blockTable);
	}

}
