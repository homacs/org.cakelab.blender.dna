package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieTrackingSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=72, size64=72)
public class MovieTrackingSettings extends CFacade {

	/**
	 * This is the sdna index of the struct MovieTrackingSettings.
	 * <p>
	 * It is required when allocating a new block to store data for MovieTrackingSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 560;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'default_motion_model'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Default motion model to use for tracking<h4>Blender Source Code:</h4>
	 * <p> ** default tracker settings Model of the motion for this track. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__default_motion_model);
	 * CPointer&lt;Short&gt; p_default_motion_model = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_motion_model'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_motion_model = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'default_algorithm_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for the tracking algorithm (use brute, use esm, use pyramid, etc. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__default_algorithm_flag);
	 * CPointer&lt;Short&gt; p_default_algorithm_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_algorithm_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_algorithm_flag = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'default_minimum_correlation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimal correlation which is still treated as successful tracking. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__default_minimum_correlation);
	 * CPointer&lt;Float&gt; p_default_minimum_correlation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_minimum_correlation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_minimum_correlation = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'default_pattern_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of pattern area for newly created tracks<h4>Blender Source Code:</h4>
	 * <p> Size of pattern area for new tracks. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__default_pattern_size);
	 * CPointer&lt;Short&gt; p_default_pattern_size = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_pattern_size'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_pattern_size = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'default_search_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of search area for newly created tracks<h4>Blender Source Code:</h4>
	 * <p> Size of search area for new tracks. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__default_search_size);
	 * CPointer&lt;Short&gt; p_default_search_size = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_search_size'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_search_size = new long[]{14, 14};

	/**
	 * Field descriptor (offset) for struct member 'default_frames_limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Every tracking cycle, this number of frames are tracked<h4>Blender Source Code:</h4>
	 * <p> Number of frames to be tarcked during single tracking session (if TRACKING_FRAMES_LIMIT is set). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__default_frames_limit);
	 * CPointer&lt;Short&gt; p_default_frames_limit = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_frames_limit'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_frames_limit = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'default_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Default distance from image boundary at which marker stops tracking<h4>Blender Source Code:</h4>
	 * <p> Margin from frame boundaries. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__default_margin);
	 * CPointer&lt;Short&gt; p_default_margin = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_margin'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_margin = new long[]{18, 18};

	/**
	 * Field descriptor (offset) for struct member 'default_pattern_match'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Track pattern from given frame when tracking marker to next frame<h4>Blender Source Code:</h4>
	 * <p> Re-adjust every N frames. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__default_pattern_match);
	 * CPointer&lt;Short&gt; p_default_pattern_match = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_pattern_match'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_pattern_match = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'default_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default flags like color channels used by default. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__default_flag);
	 * CPointer&lt;Short&gt; p_default_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_flag = new long[]{22, 22};

	/**
	 * Field descriptor (offset) for struct member 'default_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Influence of newly created track on a final solution<h4>Blender Source Code:</h4>
	 * <p> Default weight of the track. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__default_weight);
	 * CPointer&lt;Float&gt; p_default_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_weight = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'motion_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags describes motion type. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__motion_flag);
	 * CPointer&lt;Short&gt; p_motion_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'motion_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__motion_flag = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit speed of tracking to make visual feedback easier (this does not affect the tracking quality)<h4>Blender Source Code:</h4>
	 * <p> ** common tracker settings ** Speed of tracking. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__speed);
	 * CPointer&lt;Short&gt; p_speed = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'speed'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__speed = new long[]{30, 30};

	/**
	 * Field descriptor (offset) for struct member 'keyframe1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** reconstruction settings ** two keyframes for reconstruction initialization were moved to per-tracking object settings
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__keyframe1);
	 * CPointer&lt;Integer&gt; p_keyframe1 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyframe1'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyframe1 = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'keyframe2'.
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
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__keyframe2);
	 * CPointer&lt;Integer&gt; p_keyframe2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyframe2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyframe2 = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'reconstruction_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__reconstruction_flag);
	 * CPointer&lt;Integer&gt; p_reconstruction_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reconstruction_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reconstruction_flag = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'refine_camera_intrinsics'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> which camera intrinsics to refine. uses on the REFINE_* flags </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__refine_camera_intrinsics);
	 * CPointer&lt;Short&gt; p_refine_camera_intrinsics = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'refine_camera_intrinsics'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__refine_camera_intrinsics = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{46, 46};

	/**
	 * Field descriptor (offset) for struct member 'dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** tool settings ** set scale Distance between two bundles used for scene scaling. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__dist);
	 * CPointer&lt;Float&gt; p_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dist = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'clean_frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Effect on tracks which are tracked less than the specified amount of frames<h4>Blender Source Code:</h4>
	 * <p> cleanup </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__clean_frames);
	 * CPointer&lt;Integer&gt; p_clean_frames = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clean_frames'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clean_frames = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'clean_action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Cleanup action to execute
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__clean_action);
	 * CPointer&lt;Integer&gt; p_clean_action = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clean_action'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clean_action = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'clean_error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Effect on tracks which have a larger re-projection error
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__clean_error);
	 * CPointer&lt;Float&gt; p_clean_error = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clean_error'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clean_error = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'object_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance between two bundles used for object scaling<h4>Blender Source Code:</h4>
	 * <p> set object scale Distance between two bundles used for object scaling. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD__object_distance);
	 * CPointer&lt;Float&gt; p_object_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_distance = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingSettings movietrackingsettings = ...;
	 * CPointer&lt;Object&gt; p = movietrackingsettings.__dna__addressof(MovieTrackingSettings.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{68, 68};

	public MovieTrackingSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieTrackingSettings(MovieTrackingSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, flag);
		} else {
			__io__block.writeInt(__io__address + 0, flag);
		}
	}

	/**
	 * Get method for struct member 'default_motion_model'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Default motion model to use for tracking<h4>Blender Source Code:</h4>
	 * <p> ** default tracker settings Model of the motion for this track. </p>
	 * @see #__DNA__FIELD__default_motion_model
	 */
	
	public short getDefault_motion_model() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'default_motion_model'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Default motion model to use for tracking<h4>Blender Source Code:</h4>
	 * <p> ** default tracker settings Model of the motion for this track. </p>
	 * @see #__DNA__FIELD__default_motion_model
	 */
	
	public void setDefault_motion_model(short default_motion_model) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, default_motion_model);
		} else {
			__io__block.writeShort(__io__address + 4, default_motion_model);
		}
	}

	/**
	 * Get method for struct member 'default_algorithm_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for the tracking algorithm (use brute, use esm, use pyramid, etc. </p>
	 * @see #__DNA__FIELD__default_algorithm_flag
	 */
	
	public short getDefault_algorithm_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'default_algorithm_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for the tracking algorithm (use brute, use esm, use pyramid, etc. </p>
	 * @see #__DNA__FIELD__default_algorithm_flag
	 */
	
	public void setDefault_algorithm_flag(short default_algorithm_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, default_algorithm_flag);
		} else {
			__io__block.writeShort(__io__address + 6, default_algorithm_flag);
		}
	}

	/**
	 * Get method for struct member 'default_minimum_correlation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimal correlation which is still treated as successful tracking. </p>
	 * @see #__DNA__FIELD__default_minimum_correlation
	 */
	
	public float getDefault_minimum_correlation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'default_minimum_correlation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimal correlation which is still treated as successful tracking. </p>
	 * @see #__DNA__FIELD__default_minimum_correlation
	 */
	
	public void setDefault_minimum_correlation(float default_minimum_correlation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, default_minimum_correlation);
		} else {
			__io__block.writeFloat(__io__address + 8, default_minimum_correlation);
		}
	}

	/**
	 * Get method for struct member 'default_pattern_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of pattern area for newly created tracks<h4>Blender Source Code:</h4>
	 * <p> Size of pattern area for new tracks. </p>
	 * @see #__DNA__FIELD__default_pattern_size
	 */
	
	public short getDefault_pattern_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'default_pattern_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of pattern area for newly created tracks<h4>Blender Source Code:</h4>
	 * <p> Size of pattern area for new tracks. </p>
	 * @see #__DNA__FIELD__default_pattern_size
	 */
	
	public void setDefault_pattern_size(short default_pattern_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12, default_pattern_size);
		} else {
			__io__block.writeShort(__io__address + 12, default_pattern_size);
		}
	}

	/**
	 * Get method for struct member 'default_search_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of search area for newly created tracks<h4>Blender Source Code:</h4>
	 * <p> Size of search area for new tracks. </p>
	 * @see #__DNA__FIELD__default_search_size
	 */
	
	public short getDefault_search_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 14);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'default_search_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of search area for newly created tracks<h4>Blender Source Code:</h4>
	 * <p> Size of search area for new tracks. </p>
	 * @see #__DNA__FIELD__default_search_size
	 */
	
	public void setDefault_search_size(short default_search_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 14, default_search_size);
		} else {
			__io__block.writeShort(__io__address + 14, default_search_size);
		}
	}

	/**
	 * Get method for struct member 'default_frames_limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Every tracking cycle, this number of frames are tracked<h4>Blender Source Code:</h4>
	 * <p> Number of frames to be tarcked during single tracking session (if TRACKING_FRAMES_LIMIT is set). </p>
	 * @see #__DNA__FIELD__default_frames_limit
	 */
	
	public short getDefault_frames_limit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'default_frames_limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Every tracking cycle, this number of frames are tracked<h4>Blender Source Code:</h4>
	 * <p> Number of frames to be tarcked during single tracking session (if TRACKING_FRAMES_LIMIT is set). </p>
	 * @see #__DNA__FIELD__default_frames_limit
	 */
	
	public void setDefault_frames_limit(short default_frames_limit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, default_frames_limit);
		} else {
			__io__block.writeShort(__io__address + 16, default_frames_limit);
		}
	}

	/**
	 * Get method for struct member 'default_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Default distance from image boundary at which marker stops tracking<h4>Blender Source Code:</h4>
	 * <p> Margin from frame boundaries. </p>
	 * @see #__DNA__FIELD__default_margin
	 */
	
	public short getDefault_margin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'default_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Default distance from image boundary at which marker stops tracking<h4>Blender Source Code:</h4>
	 * <p> Margin from frame boundaries. </p>
	 * @see #__DNA__FIELD__default_margin
	 */
	
	public void setDefault_margin(short default_margin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, default_margin);
		} else {
			__io__block.writeShort(__io__address + 18, default_margin);
		}
	}

	/**
	 * Get method for struct member 'default_pattern_match'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Track pattern from given frame when tracking marker to next frame<h4>Blender Source Code:</h4>
	 * <p> Re-adjust every N frames. </p>
	 * @see #__DNA__FIELD__default_pattern_match
	 */
	
	public short getDefault_pattern_match() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'default_pattern_match'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Track pattern from given frame when tracking marker to next frame<h4>Blender Source Code:</h4>
	 * <p> Re-adjust every N frames. </p>
	 * @see #__DNA__FIELD__default_pattern_match
	 */
	
	public void setDefault_pattern_match(short default_pattern_match) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, default_pattern_match);
		} else {
			__io__block.writeShort(__io__address + 20, default_pattern_match);
		}
	}

	/**
	 * Get method for struct member 'default_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default flags like color channels used by default. </p>
	 * @see #__DNA__FIELD__default_flag
	 */
	
	public short getDefault_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 22);
		} else {
			return __io__block.readShort(__io__address + 22);
		}
	}

	/**
	 * Set method for struct member 'default_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default flags like color channels used by default. </p>
	 * @see #__DNA__FIELD__default_flag
	 */
	
	public void setDefault_flag(short default_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 22, default_flag);
		} else {
			__io__block.writeShort(__io__address + 22, default_flag);
		}
	}

	/**
	 * Get method for struct member 'default_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Influence of newly created track on a final solution<h4>Blender Source Code:</h4>
	 * <p> Default weight of the track. </p>
	 * @see #__DNA__FIELD__default_weight
	 */
	
	public float getDefault_weight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'default_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Influence of newly created track on a final solution<h4>Blender Source Code:</h4>
	 * <p> Default weight of the track. </p>
	 * @see #__DNA__FIELD__default_weight
	 */
	
	public void setDefault_weight(float default_weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, default_weight);
		} else {
			__io__block.writeFloat(__io__address + 24, default_weight);
		}
	}

	/**
	 * Get method for struct member 'motion_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags describes motion type. </p>
	 * @see #__DNA__FIELD__motion_flag
	 */
	
	public short getMotion_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 28);
		} else {
			return __io__block.readShort(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'motion_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags describes motion type. </p>
	 * @see #__DNA__FIELD__motion_flag
	 */
	
	public void setMotion_flag(short motion_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 28, motion_flag);
		} else {
			__io__block.writeShort(__io__address + 28, motion_flag);
		}
	}

	/**
	 * Get method for struct member 'speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit speed of tracking to make visual feedback easier (this does not affect the tracking quality)<h4>Blender Source Code:</h4>
	 * <p> ** common tracker settings ** Speed of tracking. </p>
	 * @see #__DNA__FIELD__speed
	 */
	
	public short getSpeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 30);
		} else {
			return __io__block.readShort(__io__address + 30);
		}
	}

	/**
	 * Set method for struct member 'speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit speed of tracking to make visual feedback easier (this does not affect the tracking quality)<h4>Blender Source Code:</h4>
	 * <p> ** common tracker settings ** Speed of tracking. </p>
	 * @see #__DNA__FIELD__speed
	 */
	
	public void setSpeed(short speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 30, speed);
		} else {
			__io__block.writeShort(__io__address + 30, speed);
		}
	}

	/**
	 * Get method for struct member 'keyframe1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** reconstruction settings ** two keyframes for reconstruction initialization were moved to per-tracking object settings
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__keyframe1
	 */
	
	public int getKeyframe1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'keyframe1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** reconstruction settings ** two keyframes for reconstruction initialization were moved to per-tracking object settings
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__keyframe1
	 */
	
	public void setKeyframe1(int keyframe1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, keyframe1);
		} else {
			__io__block.writeInt(__io__address + 32, keyframe1);
		}
	}

	/**
	 * Get method for struct member 'keyframe2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__keyframe2
	 */
	
	public int getKeyframe2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'keyframe2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__keyframe2
	 */
	
	public void setKeyframe2(int keyframe2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, keyframe2);
		} else {
			__io__block.writeInt(__io__address + 36, keyframe2);
		}
	}

	/**
	 * Get method for struct member 'reconstruction_flag'.
	 * @see #__DNA__FIELD__reconstruction_flag
	 */
	
	public int getReconstruction_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'reconstruction_flag'.
	 * @see #__DNA__FIELD__reconstruction_flag
	 */
	
	public void setReconstruction_flag(int reconstruction_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, reconstruction_flag);
		} else {
			__io__block.writeInt(__io__address + 40, reconstruction_flag);
		}
	}

	/**
	 * Get method for struct member 'refine_camera_intrinsics'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> which camera intrinsics to refine. uses on the REFINE_* flags </p>
	 * @see #__DNA__FIELD__refine_camera_intrinsics
	 */
	
	public short getRefine_camera_intrinsics() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 44);
		} else {
			return __io__block.readShort(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'refine_camera_intrinsics'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> which camera intrinsics to refine. uses on the REFINE_* flags </p>
	 * @see #__DNA__FIELD__refine_camera_intrinsics
	 */
	
	public void setRefine_camera_intrinsics(short refine_camera_intrinsics) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 44, refine_camera_intrinsics);
		} else {
			__io__block.writeShort(__io__address + 44, refine_camera_intrinsics);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 46, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 46, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 46;
		} else {
			__dna__offset = 46;
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
	 * Get method for struct member 'dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** tool settings ** set scale Distance between two bundles used for scene scaling. </p>
	 * @see #__DNA__FIELD__dist
	 */
	
	public float getDist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** tool settings ** set scale Distance between two bundles used for scene scaling. </p>
	 * @see #__DNA__FIELD__dist
	 */
	
	public void setDist(float dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, dist);
		} else {
			__io__block.writeFloat(__io__address + 48, dist);
		}
	}

	/**
	 * Get method for struct member 'clean_frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Effect on tracks which are tracked less than the specified amount of frames<h4>Blender Source Code:</h4>
	 * <p> cleanup </p>
	 * @see #__DNA__FIELD__clean_frames
	 */
	
	public int getClean_frames() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 52);
		} else {
			return __io__block.readInt(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'clean_frames'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Effect on tracks which are tracked less than the specified amount of frames<h4>Blender Source Code:</h4>
	 * <p> cleanup </p>
	 * @see #__DNA__FIELD__clean_frames
	 */
	
	public void setClean_frames(int clean_frames) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 52, clean_frames);
		} else {
			__io__block.writeInt(__io__address + 52, clean_frames);
		}
	}

	/**
	 * Get method for struct member 'clean_action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Cleanup action to execute
	 * @see #__DNA__FIELD__clean_action
	 */
	
	public int getClean_action() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 56);
		} else {
			return __io__block.readInt(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'clean_action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Cleanup action to execute
	 * @see #__DNA__FIELD__clean_action
	 */
	
	public void setClean_action(int clean_action) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 56, clean_action);
		} else {
			__io__block.writeInt(__io__address + 56, clean_action);
		}
	}

	/**
	 * Get method for struct member 'clean_error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Effect on tracks which have a larger re-projection error
	 * @see #__DNA__FIELD__clean_error
	 */
	
	public float getClean_error() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'clean_error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Effect on tracks which have a larger re-projection error
	 * @see #__DNA__FIELD__clean_error
	 */
	
	public void setClean_error(float clean_error) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, clean_error);
		} else {
			__io__block.writeFloat(__io__address + 60, clean_error);
		}
	}

	/**
	 * Get method for struct member 'object_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance between two bundles used for object scaling<h4>Blender Source Code:</h4>
	 * <p> set object scale Distance between two bundles used for object scaling. </p>
	 * @see #__DNA__FIELD__object_distance
	 */
	
	public float getObject_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'object_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distance between two bundles used for object scaling<h4>Blender Source Code:</h4>
	 * <p> set object scale Distance between two bundles used for object scaling. </p>
	 * @see #__DNA__FIELD__object_distance
	 */
	
	public void setObject_distance(float object_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, object_distance);
		} else {
			__io__block.writeFloat(__io__address + 64, object_distance);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CArrayFacade<Byte> get_pad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 68, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 68, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CArrayFacade<Byte> _pad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 68;
		} else {
			__dna__offset = 68;
		}
		if (__io__equals(_pad3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad3);
		} else {
			__io__generic__copy( get_pad3(), _pad3);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieTrackingSettings> __io__addressof() {
		return new CPointer<MovieTrackingSettings>(__io__address, new Class[]{MovieTrackingSettings.class}, __io__block, __io__blockTable);
	}

}
