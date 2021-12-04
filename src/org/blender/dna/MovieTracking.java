package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieTracking'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=312, size64=376)
public class MovieTracking extends CFacade {

	/**
	 * This is the sdna index of the struct MovieTracking.
	 * <p>
	 * It is required when allocating a new block to store data for MovieTracking.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 695;

	/**
	 * Field descriptor (offset) for struct member 'settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Different tracking-related settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTracking movietracking = ...;
	 * CPointer&lt;Object&gt; p = movietracking.__dna__addressof(MovieTracking.__DNA__FIELD__settings);
	 * CPointer&lt;MovieTrackingSettings&gt; p_settings = p.cast(new Class[]{MovieTrackingSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'settings'</li>
	 * <li>Signature: 'MovieTrackingSettings'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__settings = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'camera'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p>{@link Camera}  intrinsics. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTracking movietracking = ...;
	 * CPointer&lt;Object&gt; p = movietracking.__dna__addressof(MovieTracking.__DNA__FIELD__camera);
	 * CPointer&lt;MovieTrackingCamera&gt; p_camera = p.cast(new Class[]{MovieTrackingCamera.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'camera'</li>
	 * <li>Signature: 'MovieTrackingCamera'</li>
	 * <li>Actual Size (32bit/64bit): 84/88</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__camera = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of tracks in this tracking data object<h4>Blender Source Code:</h4>
	 * <p> List of tracks used for camera object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTracking movietracking = ...;
	 * CPointer&lt;Object&gt; p = movietracking.__dna__addressof(MovieTracking.__DNA__FIELD__tracks);
	 * CPointer&lt;ListBase&gt; p_tracks = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tracks'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tracks = new long[]{148, 152};

	/**
	 * Field descriptor (offset) for struct member 'plane_tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of plane tracks in this tracking data object<h4>Blender Source Code:</h4>
	 * <p> List of plane tracks used by camera object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTracking movietracking = ...;
	 * CPointer&lt;Object&gt; p = movietracking.__dna__addressof(MovieTracking.__DNA__FIELD__plane_tracks);
	 * CPointer&lt;ListBase&gt; p_plane_tracks = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'plane_tracks'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__plane_tracks = new long[]{156, 168};

	/**
	 * Field descriptor (offset) for struct member 'reconstruction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Reconstruction data for camera object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTracking movietracking = ...;
	 * CPointer&lt;Object&gt; p = movietracking.__dna__addressof(MovieTracking.__DNA__FIELD__reconstruction);
	 * CPointer&lt;MovieTrackingReconstruction&gt; p_reconstruction = p.cast(new Class[]{MovieTrackingReconstruction.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reconstruction'</li>
	 * <li>Signature: 'MovieTrackingReconstruction'</li>
	 * <li>Actual Size (32bit/64bit): 20/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reconstruction = new long[]{164, 184};

	/**
	 * Field descriptor (offset) for struct member 'stabilization'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Stabilization data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTracking movietracking = ...;
	 * CPointer&lt;Object&gt; p = movietracking.__dna__addressof(MovieTracking.__DNA__FIELD__stabilization);
	 * CPointer&lt;MovieTrackingStabilization&gt; p_stabilization = p.cast(new Class[]{MovieTrackingStabilization.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stabilization'</li>
	 * <li>Signature: 'MovieTrackingStabilization'</li>
	 * <li>Actual Size (32bit/64bit): 68/72</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stabilization = new long[]{184, 208};

	/**
	 * Field descriptor (offset) for struct member 'act_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active track. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTracking movietracking = ...;
	 * CPointer&lt;Object&gt; p = movietracking.__dna__addressof(MovieTracking.__DNA__FIELD__act_track);
	 * CPointer&lt;CPointer&lt;MovieTrackingTrack&gt;&gt; p_act_track = p.cast(new Class[]{CPointer.class, MovieTrackingTrack.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_track'</li>
	 * <li>Signature: 'MovieTrackingTrack*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_track = new long[]{252, 280};

	/**
	 * Field descriptor (offset) for struct member 'act_plane_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active plane track. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTracking movietracking = ...;
	 * CPointer&lt;Object&gt; p = movietracking.__dna__addressof(MovieTracking.__DNA__FIELD__act_plane_track);
	 * CPointer&lt;CPointer&lt;MovieTrackingPlaneTrack&gt;&gt; p_act_plane_track = p.cast(new Class[]{CPointer.class, MovieTrackingPlaneTrack.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_plane_track'</li>
	 * <li>Signature: 'MovieTrackingPlaneTrack*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_plane_track = new long[]{256, 288};

	/**
	 * Field descriptor (offset) for struct member 'objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of objects in this tracking data object
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTracking movietracking = ...;
	 * CPointer&lt;Object&gt; p = movietracking.__dna__addressof(MovieTracking.__DNA__FIELD__objects);
	 * CPointer&lt;ListBase&gt; p_objects = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'objects'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__objects = new long[]{260, 296};

	/**
	 * Field descriptor (offset) for struct member 'objectnr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of active object and total number of objects. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTracking movietracking = ...;
	 * CPointer&lt;Object&gt; p = movietracking.__dna__addressof(MovieTracking.__DNA__FIELD__objectnr);
	 * CPointer&lt;Integer&gt; p_objectnr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'objectnr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__objectnr = new long[]{268, 312};

	/**
	 * Field descriptor (offset) for struct member 'tot_object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTracking movietracking = ...;
	 * CPointer&lt;Object&gt; p = movietracking.__dna__addressof(MovieTracking.__DNA__FIELD__tot_object);
	 * CPointer&lt;Integer&gt; p_tot_object = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_object'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_object = new long[]{272, 316};

	/**
	 * Field descriptor (offset) for struct member 'stats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Statistics displaying in clip editor. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTracking movietracking = ...;
	 * CPointer&lt;Object&gt; p = movietracking.__dna__addressof(MovieTracking.__DNA__FIELD__stats);
	 * CPointer&lt;CPointer&lt;MovieTrackingStats&gt;&gt; p_stats = p.cast(new Class[]{CPointer.class, MovieTrackingStats.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stats'</li>
	 * <li>Signature: 'MovieTrackingStats*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stats = new long[]{276, 320};

	/**
	 * Field descriptor (offset) for struct member 'dopesheet'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Dopesheet data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTracking movietracking = ...;
	 * CPointer&lt;Object&gt; p = movietracking.__dna__addressof(MovieTracking.__DNA__FIELD__dopesheet);
	 * CPointer&lt;MovieTrackingDopesheet&gt; p_dopesheet = p.cast(new Class[]{MovieTrackingDopesheet.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dopesheet'</li>
	 * <li>Signature: 'MovieTrackingDopesheet'</li>
	 * <li>Actual Size (32bit/64bit): 32/48</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dopesheet = new long[]{280, 328};

	public MovieTracking(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieTracking(MovieTracking that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Different tracking-related settings. </p>
	 * @see #__DNA__FIELD__settings
	 */
	
	public MovieTrackingSettings getSettings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MovieTrackingSettings(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new MovieTrackingSettings(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Different tracking-related settings. </p>
	 * @see #__DNA__FIELD__settings
	 */
	
	public void setSettings(MovieTrackingSettings settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, settings);
		} else {
			__io__generic__copy( getSettings(), settings);
		}
	}

	/**
	 * Get method for struct member 'camera'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p>{@link Camera}  intrinsics. </p>
	 * @see #__DNA__FIELD__camera
	 */
	
	public MovieTrackingCamera getCamera() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MovieTrackingCamera(__io__address + 64, __io__block, __io__blockTable);
		} else {
			return new MovieTrackingCamera(__io__address + 64, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'camera'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p>{@link Camera}  intrinsics. </p>
	 * @see #__DNA__FIELD__camera
	 */
	
	public void setCamera(MovieTrackingCamera camera) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(camera, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, camera)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, camera);
		} else {
			__io__generic__copy( getCamera(), camera);
		}
	}

	/**
	 * Get method for struct member 'tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of tracks in this tracking data object<h4>Blender Source Code:</h4>
	 * <p> List of tracks used for camera object. </p>
	 * @see #__DNA__FIELD__tracks
	 */
	
	public ListBase getTracks() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 152, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 148, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of tracks in this tracking data object<h4>Blender Source Code:</h4>
	 * <p> List of tracks used for camera object. </p>
	 * @see #__DNA__FIELD__tracks
	 */
	
	public void setTracks(ListBase tracks) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 148;
		}
		if (__io__equals(tracks, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tracks)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tracks);
		} else {
			__io__generic__copy( getTracks(), tracks);
		}
	}

	/**
	 * Get method for struct member 'plane_tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of plane tracks in this tracking data object<h4>Blender Source Code:</h4>
	 * <p> List of plane tracks used by camera object. </p>
	 * @see #__DNA__FIELD__plane_tracks
	 */
	
	public ListBase getPlane_tracks() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 168, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 156, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'plane_tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of plane tracks in this tracking data object<h4>Blender Source Code:</h4>
	 * <p> List of plane tracks used by camera object. </p>
	 * @see #__DNA__FIELD__plane_tracks
	 */
	
	public void setPlane_tracks(ListBase plane_tracks) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(plane_tracks, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, plane_tracks)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, plane_tracks);
		} else {
			__io__generic__copy( getPlane_tracks(), plane_tracks);
		}
	}

	/**
	 * Get method for struct member 'reconstruction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Reconstruction data for camera object. </p>
	 * @see #__DNA__FIELD__reconstruction
	 */
	
	public MovieTrackingReconstruction getReconstruction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MovieTrackingReconstruction(__io__address + 184, __io__block, __io__blockTable);
		} else {
			return new MovieTrackingReconstruction(__io__address + 164, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'reconstruction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Reconstruction data for camera object. </p>
	 * @see #__DNA__FIELD__reconstruction
	 */
	
	public void setReconstruction(MovieTrackingReconstruction reconstruction) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 164;
		}
		if (__io__equals(reconstruction, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, reconstruction)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, reconstruction);
		} else {
			__io__generic__copy( getReconstruction(), reconstruction);
		}
	}

	/**
	 * Get method for struct member 'stabilization'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Stabilization data. </p>
	 * @see #__DNA__FIELD__stabilization
	 */
	
	public MovieTrackingStabilization getStabilization() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MovieTrackingStabilization(__io__address + 208, __io__block, __io__blockTable);
		} else {
			return new MovieTrackingStabilization(__io__address + 184, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'stabilization'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Stabilization data. </p>
	 * @see #__DNA__FIELD__stabilization
	 */
	
	public void setStabilization(MovieTrackingStabilization stabilization) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 184;
		}
		if (__io__equals(stabilization, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, stabilization)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, stabilization);
		} else {
			__io__generic__copy( getStabilization(), stabilization);
		}
	}

	/**
	 * Get method for struct member 'act_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active track. </p>
	 * @see #__DNA__FIELD__act_track
	 */
	
	public CPointer<MovieTrackingTrack> getAct_track() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 252);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingTrack.class};
		return new CPointer<MovieTrackingTrack>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingTrack.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active track. </p>
	 * @see #__DNA__FIELD__act_track
	 */
	
	public void setAct_track(CPointer<MovieTrackingTrack> act_track) throws IOException
	{
		long __address = ((act_track == null) ? 0 : act_track.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 280, __address);
		} else {
			__io__block.writeLong(__io__address + 252, __address);
		}
	}

	/**
	 * Get method for struct member 'act_plane_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active plane track. </p>
	 * @see #__DNA__FIELD__act_plane_track
	 */
	
	public CPointer<MovieTrackingPlaneTrack> getAct_plane_track() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingPlaneTrack.class};
		return new CPointer<MovieTrackingPlaneTrack>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingPlaneTrack.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act_plane_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active plane track. </p>
	 * @see #__DNA__FIELD__act_plane_track
	 */
	
	public void setAct_plane_track(CPointer<MovieTrackingPlaneTrack> act_plane_track) throws IOException
	{
		long __address = ((act_plane_track == null) ? 0 : act_plane_track.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 288, __address);
		} else {
			__io__block.writeLong(__io__address + 256, __address);
		}
	}

	/**
	 * Get method for struct member 'objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of objects in this tracking data object
	 * @see #__DNA__FIELD__objects
	 */
	
	public ListBase getObjects() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 296, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 260, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of objects in this tracking data object
	 * @see #__DNA__FIELD__objects
	 */
	
	public void setObjects(ListBase objects) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 296;
		} else {
			__dna__offset = 260;
		}
		if (__io__equals(objects, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, objects)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, objects);
		} else {
			__io__generic__copy( getObjects(), objects);
		}
	}

	/**
	 * Get method for struct member 'objectnr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of active object and total number of objects. </p>
	 * @see #__DNA__FIELD__objectnr
	 */
	
	public int getObjectnr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 312);
		} else {
			return __io__block.readInt(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'objectnr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of active object and total number of objects. </p>
	 * @see #__DNA__FIELD__objectnr
	 */
	
	public void setObjectnr(int objectnr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 312, objectnr);
		} else {
			__io__block.writeInt(__io__address + 268, objectnr);
		}
	}

	/**
	 * Get method for struct member 'tot_object'.
	 * @see #__DNA__FIELD__tot_object
	 */
	
	public int getTot_object() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 316);
		} else {
			return __io__block.readInt(__io__address + 272);
		}
	}

	/**
	 * Set method for struct member 'tot_object'.
	 * @see #__DNA__FIELD__tot_object
	 */
	
	public void setTot_object(int tot_object) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 316, tot_object);
		} else {
			__io__block.writeInt(__io__address + 272, tot_object);
		}
	}

	/**
	 * Get method for struct member 'stats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Statistics displaying in clip editor. </p>
	 * @see #__DNA__FIELD__stats
	 */
	
	public CPointer<MovieTrackingStats> getStats() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 320);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 276);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingStats.class};
		return new CPointer<MovieTrackingStats>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingStats.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'stats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Statistics displaying in clip editor. </p>
	 * @see #__DNA__FIELD__stats
	 */
	
	public void setStats(CPointer<MovieTrackingStats> stats) throws IOException
	{
		long __address = ((stats == null) ? 0 : stats.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 320, __address);
		} else {
			__io__block.writeLong(__io__address + 276, __address);
		}
	}

	/**
	 * Get method for struct member 'dopesheet'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Dopesheet data. </p>
	 * @see #__DNA__FIELD__dopesheet
	 */
	
	public MovieTrackingDopesheet getDopesheet() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MovieTrackingDopesheet(__io__address + 328, __io__block, __io__blockTable);
		} else {
			return new MovieTrackingDopesheet(__io__address + 280, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dopesheet'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Dopesheet data. </p>
	 * @see #__DNA__FIELD__dopesheet
	 */
	
	public void setDopesheet(MovieTrackingDopesheet dopesheet) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 328;
		} else {
			__dna__offset = 280;
		}
		if (__io__equals(dopesheet, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dopesheet)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dopesheet);
		} else {
			__io__generic__copy( getDopesheet(), dopesheet);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieTracking> __io__addressof() {
		return new CPointer<MovieTracking>(__io__address, new Class[]{MovieTracking.class}, __io__block, __io__blockTable);
	}

}
