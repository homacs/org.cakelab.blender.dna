package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieTrackingReconstruction'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=20, size64=24)
public class MovieTrackingReconstruction extends CFacade {

	/**
	 * This is the sdna index of the struct MovieTrackingReconstruction.
	 * <p>
	 * It is required when allocating a new block to store data for MovieTrackingReconstruction.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 562;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingReconstruction movietrackingreconstruction = ...;
	 * CPointer&lt;Object&gt; p = movietrackingreconstruction.__dna__addressof(MovieTrackingReconstruction.__DNA__FIELD__flag);
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
	 * Field descriptor (offset) for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Average error of reconstruction. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingReconstruction movietrackingreconstruction = ...;
	 * CPointer&lt;Object&gt; p = movietrackingreconstruction.__dna__addressof(MovieTrackingReconstruction.__DNA__FIELD__error);
	 * CPointer&lt;Float&gt; p_error = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'error'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__error = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'last_camera'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Most recently used camera. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingReconstruction movietrackingreconstruction = ...;
	 * CPointer&lt;Object&gt; p = movietrackingreconstruction.__dna__addressof(MovieTrackingReconstruction.__DNA__FIELD__last_camera);
	 * CPointer&lt;Integer&gt; p_last_camera = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_camera'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_camera = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'camnr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of reconstructed cameras. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingReconstruction movietrackingreconstruction = ...;
	 * CPointer&lt;Object&gt; p = movietrackingreconstruction.__dna__addressof(MovieTrackingReconstruction.__DNA__FIELD__camnr);
	 * CPointer&lt;Integer&gt; p_camnr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'camnr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__camnr = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'cameras'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of solved cameras<h4>Blender Source Code:</h4>
	 * <p> Reconstructed cameras. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingReconstruction movietrackingreconstruction = ...;
	 * CPointer&lt;Object&gt; p = movietrackingreconstruction.__dna__addressof(MovieTrackingReconstruction.__DNA__FIELD__cameras);
	 * CPointer&lt;CPointer&lt;MovieReconstructedCamera&gt;&gt; p_cameras = p.cast(new Class[]{CPointer.class, MovieReconstructedCamera.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cameras'</li>
	 * <li>Signature: 'MovieReconstructedCamera*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cameras = new long[]{16, 16};

	public MovieTrackingReconstruction(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieTrackingReconstruction(MovieTrackingReconstruction that) {
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
	 * Get method for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Average error of reconstruction. </p>
	 * @see #__DNA__FIELD__error
	 */
	
	public float getError() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Average error of reconstruction. </p>
	 * @see #__DNA__FIELD__error
	 */
	
	public void setError(float error) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, error);
		} else {
			__io__block.writeFloat(__io__address + 4, error);
		}
	}

	/**
	 * Get method for struct member 'last_camera'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Most recently used camera. </p>
	 * @see #__DNA__FIELD__last_camera
	 */
	
	public int getLast_camera() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'last_camera'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Most recently used camera. </p>
	 * @see #__DNA__FIELD__last_camera
	 */
	
	public void setLast_camera(int last_camera) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, last_camera);
		} else {
			__io__block.writeInt(__io__address + 8, last_camera);
		}
	}

	/**
	 * Get method for struct member 'camnr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of reconstructed cameras. </p>
	 * @see #__DNA__FIELD__camnr
	 */
	
	public int getCamnr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'camnr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of reconstructed cameras. </p>
	 * @see #__DNA__FIELD__camnr
	 */
	
	public void setCamnr(int camnr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, camnr);
		} else {
			__io__block.writeInt(__io__address + 12, camnr);
		}
	}

	/**
	 * Get method for struct member 'cameras'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of solved cameras<h4>Blender Source Code:</h4>
	 * <p> Reconstructed cameras. </p>
	 * @see #__DNA__FIELD__cameras
	 */
	
	public CPointer<MovieReconstructedCamera> getCameras() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieReconstructedCamera.class};
		return new CPointer<MovieReconstructedCamera>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieReconstructedCamera.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cameras'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of solved cameras<h4>Blender Source Code:</h4>
	 * <p> Reconstructed cameras. </p>
	 * @see #__DNA__FIELD__cameras
	 */
	
	public void setCameras(CPointer<MovieReconstructedCamera> cameras) throws IOException
	{
		long __address = ((cameras == null) ? 0 : cameras.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieTrackingReconstruction> __io__addressof() {
		return new CPointer<MovieTrackingReconstruction>(__io__address, new Class[]{MovieTrackingReconstruction.class}, __io__block, __io__blockTable);
	}

}
