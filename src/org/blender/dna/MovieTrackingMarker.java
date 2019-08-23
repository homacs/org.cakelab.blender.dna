package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieTrackingMarker'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=64, size64=64)
public class MovieTrackingMarker extends CFacade {

	/**
	 * This is the sdna index of the struct MovieTrackingMarker.
	 * <p>
	 * It is required when allocating a new block to store data for MovieTrackingMarker.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 549;

	/**
	 * Field descriptor (offset) for struct member 'pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 2d position of marker on frame (in unified 0..1 space) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingMarker movietrackingmarker = ...;
	 * CPointer&lt;Object&gt; p = movietrackingmarker.__dna__addressof(MovieTrackingMarker.__DNA__FIELD__pos);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_pos = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pos'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pos = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'pattern_corners'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Array of coordinates which represents pattern's corners in normalized coordinates relative to marker position<h4>Blender Source Code:</h4>
	 * <p> corners of pattern in the following order: <pre> Y
	 *  ^
	 *  | (3) --- (2)
	 *  |  |       |
	 *  |  |       |
	 *  |  |       |
	 *  | (0) --- (1)
	 *  +-------------> X
	 * </pre>  Y
	 *  ^
	 *  | (3) --- (2)
	 *  |  |       |
	 *  |  |       |
	 *  |  |       |
	 *  | (0) --- (1)
	 *  +-------------> X
	 * </p><p> the coordinates are stored relative to pos. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingMarker movietrackingmarker = ...;
	 * CPointer&lt;Object&gt; p = movietrackingmarker.__dna__addressof(MovieTrackingMarker.__DNA__FIELD__pattern_corners);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_pattern_corners = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pattern_corners'</li>
	 * <li>Signature: 'float[4][2]'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pattern_corners = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'search_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Left-bottom corner of search area in normalized coordinates relative to marker position<h4>Blender Source Code:</h4>
	 * <p> positions of left-bottom and right-top corners of search area (in unified 0..1 units, relative to marker->pos </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingMarker movietrackingmarker = ...;
	 * CPointer&lt;Object&gt; p = movietrackingmarker.__dna__addressof(MovieTrackingMarker.__DNA__FIELD__search_min);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_search_min = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'search_min'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__search_min = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'search_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Right-bottom corner of search area in normalized coordinates relative to marker position
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingMarker movietrackingmarker = ...;
	 * CPointer&lt;Object&gt; p = movietrackingmarker.__dna__addressof(MovieTrackingMarker.__DNA__FIELD__search_max);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_search_max = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'search_max'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__search_max = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frame marker is associated with </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingMarker movietrackingmarker = ...;
	 * CPointer&lt;Object&gt; p = movietrackingmarker.__dna__addressof(MovieTrackingMarker.__DNA__FIELD__framenr);
	 * CPointer&lt;Integer&gt; p_framenr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'framenr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__framenr = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Marker's flag (alive, ...) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingMarker movietrackingmarker = ...;
	 * CPointer&lt;Object&gt; p = movietrackingmarker.__dna__addressof(MovieTrackingMarker.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{60, 60};

	public MovieTrackingMarker(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieTrackingMarker(MovieTrackingMarker that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 2d position of marker on frame (in unified 0..1 space) </p>
	 * @see #__DNA__FIELD__pos
	 */
	
	public CArrayFacade<Float> getPos() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 2d position of marker on frame (in unified 0..1 space) </p>
	 * @see #__DNA__FIELD__pos
	 */
	
	public void setPos(CArrayFacade<Float> pos) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(pos, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pos)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pos);
		} else {
			__io__generic__copy( getPos(), pos);
		}
	}

	/**
	 * Get method for struct member 'pattern_corners'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Array of coordinates which represents pattern's corners in normalized coordinates relative to marker position<h4>Blender Source Code:</h4>
	 * <p> corners of pattern in the following order: <pre> Y
	 *  ^
	 *  | (3) --- (2)
	 *  |  |       |
	 *  |  |       |
	 *  |  |       |
	 *  | (0) --- (1)
	 *  +-------------> X
	 * </pre>  Y
	 *  ^
	 *  | (3) --- (2)
	 *  |  |       |
	 *  |  |       |
	 *  |  |       |
	 *  | (0) --- (1)
	 *  +-------------> X
	 * </p><p> the coordinates are stored relative to pos. </p>
	 * @see #__DNA__FIELD__pattern_corners
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getPattern_corners() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pattern_corners'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Array of coordinates which represents pattern's corners in normalized coordinates relative to marker position<h4>Blender Source Code:</h4>
	 * <p> corners of pattern in the following order: <pre> Y
	 *  ^
	 *  | (3) --- (2)
	 *  |  |       |
	 *  |  |       |
	 *  |  |       |
	 *  | (0) --- (1)
	 *  +-------------> X
	 * </pre>  Y
	 *  ^
	 *  | (3) --- (2)
	 *  |  |       |
	 *  |  |       |
	 *  |  |       |
	 *  | (0) --- (1)
	 *  +-------------> X
	 * </p><p> the coordinates are stored relative to pos. </p>
	 * @see #__DNA__FIELD__pattern_corners
	 */
	
	public void setPattern_corners(CArrayFacade<CArrayFacade<Float>> pattern_corners) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(pattern_corners, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pattern_corners)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pattern_corners);
		} else {
			__io__generic__copy( getPattern_corners(), pattern_corners);
		}
	}

	/**
	 * Get method for struct member 'search_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Left-bottom corner of search area in normalized coordinates relative to marker position<h4>Blender Source Code:</h4>
	 * <p> positions of left-bottom and right-top corners of search area (in unified 0..1 units, relative to marker->pos </p>
	 * @see #__DNA__FIELD__search_min
	 */
	
	public CArrayFacade<Float> getSearch_min() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'search_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Left-bottom corner of search area in normalized coordinates relative to marker position<h4>Blender Source Code:</h4>
	 * <p> positions of left-bottom and right-top corners of search area (in unified 0..1 units, relative to marker->pos </p>
	 * @see #__DNA__FIELD__search_min
	 */
	
	public void setSearch_min(CArrayFacade<Float> search_min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 40;
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
	 * <h4>Blender Python API:</h4>
	 * Right-bottom corner of search area in normalized coordinates relative to marker position
	 * @see #__DNA__FIELD__search_max
	 */
	
	public CArrayFacade<Float> getSearch_max() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'search_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Right-bottom corner of search area in normalized coordinates relative to marker position
	 * @see #__DNA__FIELD__search_max
	 */
	
	public void setSearch_max(CArrayFacade<Float> search_max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 48;
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
	 * Get method for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frame marker is associated with </p>
	 * @see #__DNA__FIELD__framenr
	 */
	
	public int getFramenr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 56);
		} else {
			return __io__block.readInt(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of frame marker is associated with </p>
	 * @see #__DNA__FIELD__framenr
	 */
	
	public void setFramenr(int framenr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 56, framenr);
		} else {
			__io__block.writeInt(__io__address + 56, framenr);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Marker's flag (alive, ...) </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 60);
		} else {
			return __io__block.readInt(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Marker's flag (alive, ...) </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 60, flag);
		} else {
			__io__block.writeInt(__io__address + 60, flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieTrackingMarker> __io__addressof() {
		return new CPointer<MovieTrackingMarker>(__io__address, new Class[]{MovieTrackingMarker.class}, __io__block, __io__blockTable);
	}

}
