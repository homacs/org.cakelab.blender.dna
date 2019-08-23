package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieTrackingPlaneTrack'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=108, size64=128)
public class MovieTrackingPlaneTrack extends CFacade {

	/**
	 * This is the sdna index of the struct MovieTrackingPlaneTrack.
	 * <p>
	 * It is required when allocating a new block to store data for MovieTrackingPlaneTrack.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 552;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingPlaneTrack movietrackingplanetrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanetrack.__dna__addressof(MovieTrackingPlaneTrack.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;MovieTrackingPlaneTrack&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, MovieTrackingPlaneTrack.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'MovieTrackingPlaneTrack*'</li>
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
	 * MovieTrackingPlaneTrack movietrackingplanetrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanetrack.__dna__addressof(MovieTrackingPlaneTrack.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;MovieTrackingPlaneTrack&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, MovieTrackingPlaneTrack.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'MovieTrackingPlaneTrack*'</li>
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
	 * MovieTrackingPlaneTrack movietrackingplanetrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanetrack.__dna__addressof(MovieTrackingPlaneTrack.__DNA__FIELD__name);
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
	 * Field descriptor (offset) for struct member 'point_tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of point tracks used to define this plane. Each element is a pointer to {@link MovieTrackingTrack} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingPlaneTrack movietrackingplanetrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanetrack.__dna__addressof(MovieTrackingPlaneTrack.__DNA__FIELD__point_tracks);
	 * CPointer&lt;CPointer&lt;CPointer&lt;MovieTrackingTrack&gt;&gt;&gt; p_point_tracks = p.cast(new Class[]{CPointer.class, CPointer.class, MovieTrackingTrack.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'point_tracks'</li>
	 * <li>Signature: 'MovieTrackingTrack**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__point_tracks = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'point_tracksnr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingPlaneTrack movietrackingplanetrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanetrack.__dna__addressof(MovieTrackingPlaneTrack.__DNA__FIELD__point_tracksnr);
	 * CPointer&lt;Integer&gt; p_point_tracksnr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'point_tracksnr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__point_tracksnr = new long[]{76, 88};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of tracks in point_tracks array. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingPlaneTrack movietrackingplanetrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanetrack.__dna__addressof(MovieTrackingPlaneTrack.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{80, 92};

	/**
	 * Field descriptor (offset) for struct member 'markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of markers in track<h4>Blender Source Code:</h4>
	 * <p> Markers in the plane track </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingPlaneTrack movietrackingplanetrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanetrack.__dna__addressof(MovieTrackingPlaneTrack.__DNA__FIELD__markers);
	 * CPointer&lt;CPointer&lt;MovieTrackingPlaneMarker&gt;&gt; p_markers = p.cast(new Class[]{CPointer.class, MovieTrackingPlaneMarker.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'markers'</li>
	 * <li>Signature: 'MovieTrackingPlaneMarker*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__markers = new long[]{84, 96};

	/**
	 * Field descriptor (offset) for struct member 'markersnr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Count of markers in track (size of markers array) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingPlaneTrack movietrackingplanetrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanetrack.__dna__addressof(MovieTrackingPlaneTrack.__DNA__FIELD__markersnr);
	 * CPointer&lt;Integer&gt; p_markersnr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'markersnr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__markersnr = new long[]{88, 104};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags (selection, ...) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingPlaneTrack movietrackingplanetrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanetrack.__dna__addressof(MovieTrackingPlaneTrack.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{92, 108};

	/**
	 * Field descriptor (offset) for struct member 'image'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Image displayed in the track during editing in clip editor<h4>Blender Source Code:</h4>
	 * <p>{@link Image}  displaying during editing </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingPlaneTrack movietrackingplanetrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanetrack.__dna__addressof(MovieTrackingPlaneTrack.__DNA__FIELD__image);
	 * CPointer&lt;CPointer&lt;Image&gt;&gt; p_image = p.cast(new Class[]{CPointer.class, Image.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image'</li>
	 * <li>Signature: 'Image*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'image_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the image<h4>Blender Source Code:</h4>
	 * <p> Opacity of the image </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingPlaneTrack movietrackingplanetrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanetrack.__dna__addressof(MovieTrackingPlaneTrack.__DNA__FIELD__image_opacity);
	 * CPointer&lt;Float&gt; p_image_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image_opacity = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'last_marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data Most recently used marker </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingPlaneTrack movietrackingplanetrack = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanetrack.__dna__addressof(MovieTrackingPlaneTrack.__DNA__FIELD__last_marker);
	 * CPointer&lt;Integer&gt; p_last_marker = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_marker'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_marker = new long[]{104, 124};

	public MovieTrackingPlaneTrack(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieTrackingPlaneTrack(MovieTrackingPlaneTrack that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<MovieTrackingPlaneTrack> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingPlaneTrack.class};
		return new CPointer<MovieTrackingPlaneTrack>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingPlaneTrack.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<MovieTrackingPlaneTrack> next) throws IOException
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
	
	public CPointer<MovieTrackingPlaneTrack> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingPlaneTrack.class};
		return new CPointer<MovieTrackingPlaneTrack>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingPlaneTrack.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<MovieTrackingPlaneTrack> prev) throws IOException
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
	 * Get method for struct member 'point_tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of point tracks used to define this plane. Each element is a pointer to {@link MovieTrackingTrack} . </p>
	 * @see #__DNA__FIELD__point_tracks
	 */
	
	public CPointer<CPointer<MovieTrackingTrack>> getPoint_tracks() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, MovieTrackingTrack.class};
		return new CPointer<CPointer<MovieTrackingTrack>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'point_tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of point tracks used to define this plane. Each element is a pointer to {@link MovieTrackingTrack} . </p>
	 * @see #__DNA__FIELD__point_tracks
	 */
	
	public void setPoint_tracks(CPointer<CPointer<MovieTrackingTrack>> point_tracks) throws IOException
	{
		long __address = ((point_tracks == null) ? 0 : point_tracks.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 72, __address);
		}
	}

	/**
	 * Get method for struct member 'point_tracksnr'.
	 * @see #__DNA__FIELD__point_tracksnr
	 */
	
	public int getPoint_tracksnr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 88);
		} else {
			return __io__block.readInt(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'point_tracksnr'.
	 * @see #__DNA__FIELD__point_tracksnr
	 */
	
	public void setPoint_tracksnr(int point_tracksnr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 88, point_tracksnr);
		} else {
			__io__block.writeInt(__io__address + 76, point_tracksnr);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of tracks in point_tracks array. </p>
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 92);
		} else {
			return __io__block.readInt(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of tracks in point_tracks array. </p>
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 92, pad);
		} else {
			__io__block.writeInt(__io__address + 80, pad);
		}
	}

	/**
	 * Get method for struct member 'markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of markers in track<h4>Blender Source Code:</h4>
	 * <p> Markers in the plane track </p>
	 * @see #__DNA__FIELD__markers
	 */
	
	public CPointer<MovieTrackingPlaneMarker> getMarkers() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 84);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingPlaneMarker.class};
		return new CPointer<MovieTrackingPlaneMarker>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingPlaneMarker.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of markers in track<h4>Blender Source Code:</h4>
	 * <p> Markers in the plane track </p>
	 * @see #__DNA__FIELD__markers
	 */
	
	public void setMarkers(CPointer<MovieTrackingPlaneMarker> markers) throws IOException
	{
		long __address = ((markers == null) ? 0 : markers.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 84, __address);
		}
	}

	/**
	 * Get method for struct member 'markersnr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Count of markers in track (size of markers array) </p>
	 * @see #__DNA__FIELD__markersnr
	 */
	
	public int getMarkersnr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 104);
		} else {
			return __io__block.readInt(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'markersnr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Count of markers in track (size of markers array) </p>
	 * @see #__DNA__FIELD__markersnr
	 */
	
	public void setMarkersnr(int markersnr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 104, markersnr);
		} else {
			__io__block.writeInt(__io__address + 88, markersnr);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags (selection, ...) </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 108);
		} else {
			return __io__block.readInt(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags (selection, ...) </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 108, flag);
		} else {
			__io__block.writeInt(__io__address + 92, flag);
		}
	}

	/**
	 * Get method for struct member 'image'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Image displayed in the track during editing in clip editor<h4>Blender Source Code:</h4>
	 * <p>{@link Image}  displaying during editing </p>
	 * @see #__DNA__FIELD__image
	 */
	
	public CPointer<Image> getImage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'image'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Image displayed in the track during editing in clip editor<h4>Blender Source Code:</h4>
	 * <p>{@link Image}  displaying during editing </p>
	 * @see #__DNA__FIELD__image
	 */
	
	public void setImage(CPointer<Image> image) throws IOException
	{
		long __address = ((image == null) ? 0 : image.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 96, __address);
		}
	}

	/**
	 * Get method for struct member 'image_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the image<h4>Blender Source Code:</h4>
	 * <p> Opacity of the image </p>
	 * @see #__DNA__FIELD__image_opacity
	 */
	
	public float getImage_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'image_opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Opacity of the image<h4>Blender Source Code:</h4>
	 * <p> Opacity of the image </p>
	 * @see #__DNA__FIELD__image_opacity
	 */
	
	public void setImage_opacity(float image_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, image_opacity);
		} else {
			__io__block.writeFloat(__io__address + 100, image_opacity);
		}
	}

	/**
	 * Get method for struct member 'last_marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data Most recently used marker </p>
	 * @see #__DNA__FIELD__last_marker
	 */
	
	public int getLast_marker() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 124);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'last_marker'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data Most recently used marker </p>
	 * @see #__DNA__FIELD__last_marker
	 */
	
	public void setLast_marker(int last_marker) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 124, last_marker);
		} else {
			__io__block.writeInt(__io__address + 104, last_marker);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieTrackingPlaneTrack> __io__addressof() {
		return new CPointer<MovieTrackingPlaneTrack>(__io__address, new Class[]{MovieTrackingPlaneTrack.class}, __io__block, __io__blockTable);
	}

}
