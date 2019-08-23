package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieClipScopes'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=120, size64=136)
public class MovieClipScopes extends CFacade {

	/**
	 * This is the sdna index of the struct MovieClipScopes.
	 * <p>
	 * It is required when allocating a new block to store data for MovieClipScopes.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 553;

	/**
	 * Field descriptor (offset) for struct member 'ok'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1 means scopes are ok and recalculation is unneeded. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__ok);
	 * CPointer&lt;Short&gt; p_ok = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ok'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ok = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'use_track_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Whether track's mask should be applied on preview. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__use_track_mask);
	 * CPointer&lt;Short&gt; p_use_track_mask = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_track_mask'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_track_mask = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'track_preview_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Height of track preview widget. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__track_preview_height);
	 * CPointer&lt;Integer&gt; p_track_preview_height = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'track_preview_height'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__track_preview_height = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'frame_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Width and height of frame for which scopes are calculated. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__frame_width);
	 * CPointer&lt;Integer&gt; p_frame_width = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frame_width'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frame_width = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'frame_height'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__frame_height);
	 * CPointer&lt;Integer&gt; p_frame_height = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frame_height'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frame_height = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'undist_marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Undistorted position of marker used for pattern sampling. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__undist_marker);
	 * CPointer&lt;MovieTrackingMarker&gt; p_undist_marker = p.cast(new Class[]{MovieTrackingMarker.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'undist_marker'</li>
	 * <li>Signature: 'MovieTrackingMarker'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__undist_marker = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'track_search'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Search area of a track. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__track_search);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_track_search = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'track_search'</li>
	 * <li>Signature: 'ImBuf*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__track_search = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'track_preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> #ImBuf displayed in track preview. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__track_preview);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_track_preview = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'track_preview'</li>
	 * <li>Signature: 'ImBuf*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__track_preview = new long[]{84, 88};

	/**
	 * Field descriptor (offset) for struct member 'track_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sub-pizel position of marker in track ImBuf. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__track_pos);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_track_pos = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'track_pos'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__track_pos = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'track_disabled'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active track is disabled, special notifier should be drawn. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__track_disabled);
	 * CPointer&lt;Short&gt; p_track_disabled = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'track_disabled'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__track_disabled = new long[]{96, 104};

	/**
	 * Field descriptor (offset) for struct member 'track_locked'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active track is locked, no transformation should be allowed. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__track_locked);
	 * CPointer&lt;Short&gt; p_track_locked = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'track_locked'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__track_locked = new long[]{98, 106};

	/**
	 * Field descriptor (offset) for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Frame number scopes are created for. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__framenr);
	 * CPointer&lt;Integer&gt; p_framenr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'framenr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__framenr = new long[]{100, 108};

	/**
	 * Field descriptor (offset) for struct member 'track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Track scopes are created for. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__track);
	 * CPointer&lt;CPointer&lt;MovieTrackingTrack&gt;&gt; p_track = p.cast(new Class[]{CPointer.class, MovieTrackingTrack.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'track'</li>
	 * <li>Signature: 'MovieTrackingTrack*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__track = new long[]{104, 112};

	/**
	 * Field descriptor (offset) for struct member 'marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Marker scopes are created for. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__marker);
	 * CPointer&lt;CPointer&lt;MovieTrackingMarker&gt;&gt; p_marker = p.cast(new Class[]{CPointer.class, MovieTrackingMarker.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'marker'</li>
	 * <li>Signature: 'MovieTrackingMarker*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__marker = new long[]{108, 120};

	/**
	 * Field descriptor (offset) for struct member 'slide_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Scale used for sliding from previewe area. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipScopes movieclipscopes = ...;
	 * CPointer&lt;Object&gt; p = movieclipscopes.__dna__addressof(MovieClipScopes.__DNA__FIELD__slide_scale);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_slide_scale = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slide_scale'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slide_scale = new long[]{112, 128};

	public MovieClipScopes(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieClipScopes(MovieClipScopes that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'ok'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1 means scopes are ok and recalculation is unneeded. </p>
	 * @see #__DNA__FIELD__ok
	 */
	
	public short getOk() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'ok'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1 means scopes are ok and recalculation is unneeded. </p>
	 * @see #__DNA__FIELD__ok
	 */
	
	public void setOk(short ok) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, ok);
		} else {
			__io__block.writeShort(__io__address + 0, ok);
		}
	}

	/**
	 * Get method for struct member 'use_track_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Whether track's mask should be applied on preview. </p>
	 * @see #__DNA__FIELD__use_track_mask
	 */
	
	public short getUse_track_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'use_track_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Whether track's mask should be applied on preview. </p>
	 * @see #__DNA__FIELD__use_track_mask
	 */
	
	public void setUse_track_mask(short use_track_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, use_track_mask);
		} else {
			__io__block.writeShort(__io__address + 2, use_track_mask);
		}
	}

	/**
	 * Get method for struct member 'track_preview_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Height of track preview widget. </p>
	 * @see #__DNA__FIELD__track_preview_height
	 */
	
	public int getTrack_preview_height() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'track_preview_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Height of track preview widget. </p>
	 * @see #__DNA__FIELD__track_preview_height
	 */
	
	public void setTrack_preview_height(int track_preview_height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, track_preview_height);
		} else {
			__io__block.writeInt(__io__address + 4, track_preview_height);
		}
	}

	/**
	 * Get method for struct member 'frame_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Width and height of frame for which scopes are calculated. </p>
	 * @see #__DNA__FIELD__frame_width
	 */
	
	public int getFrame_width() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'frame_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Width and height of frame for which scopes are calculated. </p>
	 * @see #__DNA__FIELD__frame_width
	 */
	
	public void setFrame_width(int frame_width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, frame_width);
		} else {
			__io__block.writeInt(__io__address + 8, frame_width);
		}
	}

	/**
	 * Get method for struct member 'frame_height'.
	 * @see #__DNA__FIELD__frame_height
	 */
	
	public int getFrame_height() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'frame_height'.
	 * @see #__DNA__FIELD__frame_height
	 */
	
	public void setFrame_height(int frame_height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, frame_height);
		} else {
			__io__block.writeInt(__io__address + 12, frame_height);
		}
	}

	/**
	 * Get method for struct member 'undist_marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Undistorted position of marker used for pattern sampling. </p>
	 * @see #__DNA__FIELD__undist_marker
	 */
	
	public MovieTrackingMarker getUndist_marker() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MovieTrackingMarker(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new MovieTrackingMarker(__io__address + 16, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'undist_marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Undistorted position of marker used for pattern sampling. </p>
	 * @see #__DNA__FIELD__undist_marker
	 */
	
	public void setUndist_marker(MovieTrackingMarker undist_marker) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(undist_marker, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, undist_marker)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, undist_marker);
		} else {
			__io__generic__copy( getUndist_marker(), undist_marker);
		}
	}

	/**
	 * Get method for struct member 'track_search'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Search area of a track. </p>
	 * @see #__DNA__FIELD__track_search
	 */
	
	public CPointer<Object> getTrack_search() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'track_search'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Search area of a track. </p>
	 * @see #__DNA__FIELD__track_search
	 */
	
	public void setTrack_search(CPointer<Object> track_search) throws IOException
	{
		long __address = ((track_search == null) ? 0 : track_search.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 80, __address);
		}
	}

	/**
	 * Get method for struct member 'track_preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> #ImBuf displayed in track preview. </p>
	 * @see #__DNA__FIELD__track_preview
	 */
	
	public CPointer<Object> getTrack_preview() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 84);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'track_preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> #ImBuf displayed in track preview. </p>
	 * @see #__DNA__FIELD__track_preview
	 */
	
	public void setTrack_preview(CPointer<Object> track_preview) throws IOException
	{
		long __address = ((track_preview == null) ? 0 : track_preview.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 84, __address);
		}
	}

	/**
	 * Get method for struct member 'track_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sub-pizel position of marker in track ImBuf. </p>
	 * @see #__DNA__FIELD__track_pos
	 */
	
	public CArrayFacade<Float> getTrack_pos() throws IOException
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
	 * Set method for struct member 'track_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sub-pizel position of marker in track ImBuf. </p>
	 * @see #__DNA__FIELD__track_pos
	 */
	
	public void setTrack_pos(CArrayFacade<Float> track_pos) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 88;
		}
		if (__io__equals(track_pos, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, track_pos)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, track_pos);
		} else {
			__io__generic__copy( getTrack_pos(), track_pos);
		}
	}

	/**
	 * Get method for struct member 'track_disabled'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active track is disabled, special notifier should be drawn. </p>
	 * @see #__DNA__FIELD__track_disabled
	 */
	
	public short getTrack_disabled() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 104);
		} else {
			return __io__block.readShort(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'track_disabled'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active track is disabled, special notifier should be drawn. </p>
	 * @see #__DNA__FIELD__track_disabled
	 */
	
	public void setTrack_disabled(short track_disabled) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 104, track_disabled);
		} else {
			__io__block.writeShort(__io__address + 96, track_disabled);
		}
	}

	/**
	 * Get method for struct member 'track_locked'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active track is locked, no transformation should be allowed. </p>
	 * @see #__DNA__FIELD__track_locked
	 */
	
	public short getTrack_locked() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 106);
		} else {
			return __io__block.readShort(__io__address + 98);
		}
	}

	/**
	 * Set method for struct member 'track_locked'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active track is locked, no transformation should be allowed. </p>
	 * @see #__DNA__FIELD__track_locked
	 */
	
	public void setTrack_locked(short track_locked) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 106, track_locked);
		} else {
			__io__block.writeShort(__io__address + 98, track_locked);
		}
	}

	/**
	 * Get method for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Frame number scopes are created for. </p>
	 * @see #__DNA__FIELD__framenr
	 */
	
	public int getFramenr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 108);
		} else {
			return __io__block.readInt(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Frame number scopes are created for. </p>
	 * @see #__DNA__FIELD__framenr
	 */
	
	public void setFramenr(int framenr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 108, framenr);
		} else {
			__io__block.writeInt(__io__address + 100, framenr);
		}
	}

	/**
	 * Get method for struct member 'track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Track scopes are created for. </p>
	 * @see #__DNA__FIELD__track
	 */
	
	public CPointer<MovieTrackingTrack> getTrack() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingTrack.class};
		return new CPointer<MovieTrackingTrack>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingTrack.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Track scopes are created for. </p>
	 * @see #__DNA__FIELD__track
	 */
	
	public void setTrack(CPointer<MovieTrackingTrack> track) throws IOException
	{
		long __address = ((track == null) ? 0 : track.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Marker scopes are created for. </p>
	 * @see #__DNA__FIELD__marker
	 */
	
	public CPointer<MovieTrackingMarker> getMarker() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingMarker.class};
		return new CPointer<MovieTrackingMarker>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingMarker.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Marker scopes are created for. </p>
	 * @see #__DNA__FIELD__marker
	 */
	
	public void setMarker(CPointer<MovieTrackingMarker> marker) throws IOException
	{
		long __address = ((marker == null) ? 0 : marker.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'slide_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Scale used for sliding from previewe area. </p>
	 * @see #__DNA__FIELD__slide_scale
	 */
	
	public CArrayFacade<Float> getSlide_scale() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'slide_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Scale used for sliding from previewe area. </p>
	 * @see #__DNA__FIELD__slide_scale
	 */
	
	public void setSlide_scale(CArrayFacade<Float> slide_scale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(slide_scale, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, slide_scale)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, slide_scale);
		} else {
			__io__generic__copy( getSlide_scale(), slide_scale);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieClipScopes> __io__addressof() {
		return new CPointer<MovieClipScopes>(__io__address, new Class[]{MovieClipScopes.class}, __io__block, __io__blockTable);
	}

}
