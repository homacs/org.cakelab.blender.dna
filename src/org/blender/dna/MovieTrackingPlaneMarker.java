package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieTrackingPlaneMarker'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=40, size64=40)
public class MovieTrackingPlaneMarker extends CFacade {

	/**
	 * This is the sdna index of the struct MovieTrackingPlaneMarker.
	 * <p>
	 * It is required when allocating a new block to store data for MovieTrackingPlaneMarker.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 558;

	/**
	 * Field descriptor (offset) for struct member 'corners'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Array of coordinates which represents UI rectangle corners in frame normalized coordinates<h4>Blender Source Code:</h4>
	 * <p> Corners of the plane in the following order: <pre> Y
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
	 * </p><p> The coordinates are stored in frame normalized coordinates. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingPlaneMarker movietrackingplanemarker = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanemarker.__dna__addressof(MovieTrackingPlaneMarker.__DNA__FIELD__corners);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_corners = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'corners'</li>
	 * <li>Signature: 'float[4][2]'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__corners = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frame plane marker is associated with. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingPlaneMarker movietrackingplanemarker = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanemarker.__dna__addressof(MovieTrackingPlaneMarker.__DNA__FIELD__framenr);
	 * CPointer&lt;Integer&gt; p_framenr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'framenr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__framenr = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Marker's flag (alive, ...). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingPlaneMarker movietrackingplanemarker = ...;
	 * CPointer&lt;Object&gt; p = movietrackingplanemarker.__dna__addressof(MovieTrackingPlaneMarker.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{36, 36};

	public MovieTrackingPlaneMarker(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieTrackingPlaneMarker(MovieTrackingPlaneMarker that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'corners'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Array of coordinates which represents UI rectangle corners in frame normalized coordinates<h4>Blender Source Code:</h4>
	 * <p> Corners of the plane in the following order: <pre> Y
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
	 * </p><p> The coordinates are stored in frame normalized coordinates. </p>
	 * @see #__DNA__FIELD__corners
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getCorners() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'corners'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Array of coordinates which represents UI rectangle corners in frame normalized coordinates<h4>Blender Source Code:</h4>
	 * <p> Corners of the plane in the following order: <pre> Y
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
	 * </p><p> The coordinates are stored in frame normalized coordinates. </p>
	 * @see #__DNA__FIELD__corners
	 */
	
	public void setCorners(CArrayFacade<CArrayFacade<Float>> corners) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(corners, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, corners)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, corners);
		} else {
			__io__generic__copy( getCorners(), corners);
		}
	}

	/**
	 * Get method for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frame plane marker is associated with. </p>
	 * @see #__DNA__FIELD__framenr
	 */
	
	public int getFramenr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'framenr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frame plane marker is associated with. </p>
	 * @see #__DNA__FIELD__framenr
	 */
	
	public void setFramenr(int framenr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, framenr);
		} else {
			__io__block.writeInt(__io__address + 32, framenr);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Marker's flag (alive, ...). </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Marker's flag (alive, ...). </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, flag);
		} else {
			__io__block.writeInt(__io__address + 36, flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieTrackingPlaneMarker> __io__addressof() {
		return new CPointer<MovieTrackingPlaneMarker>(__io__address, new Class[]{MovieTrackingPlaneMarker.class}, __io__block, __io__blockTable);
	}

}
