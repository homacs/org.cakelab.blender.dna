package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieReconstructedCamera'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=72, size64=72)
public class MovieReconstructedCamera extends CFacade {

	/**
	 * This is the sdna index of the struct MovieReconstructedCamera.
	 * <p>
	 * It is required when allocating a new block to store data for MovieReconstructedCamera.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 554;

	/**
	 * Field descriptor (offset) for struct member 'framenr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieReconstructedCamera moviereconstructedcamera = ...;
	 * CPointer&lt;Object&gt; p = moviereconstructedcamera.__dna__addressof(MovieReconstructedCamera.__DNA__FIELD__framenr);
	 * CPointer&lt;Integer&gt; p_framenr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'framenr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__framenr = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'error'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieReconstructedCamera moviereconstructedcamera = ...;
	 * CPointer&lt;Object&gt; p = moviereconstructedcamera.__dna__addressof(MovieReconstructedCamera.__DNA__FIELD__error);
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
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieReconstructedCamera moviereconstructedcamera = ...;
	 * CPointer&lt;Object&gt; p = moviereconstructedcamera.__dna__addressof(MovieReconstructedCamera.__DNA__FIELD__mat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_mat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{8, 8};

	public MovieReconstructedCamera(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieReconstructedCamera(MovieReconstructedCamera that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'framenr'.
	 * @see #__DNA__FIELD__framenr
	 */
	
	public int getFramenr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'framenr'.
	 * @see #__DNA__FIELD__framenr
	 */
	
	public void setFramenr(int framenr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, framenr);
		} else {
			__io__block.writeInt(__io__address + 0, framenr);
		}
	}

	/**
	 * Get method for struct member 'error'.
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
	 * Get method for struct member 'mat'.
	 * @see #__DNA__FIELD__mat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getMat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mat'.
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CArrayFacade<CArrayFacade<Float>> mat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(mat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mat);
		} else {
			__io__generic__copy( getMat(), mat);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieReconstructedCamera> __io__addressof() {
		return new CPointer<MovieReconstructedCamera>(__io__address, new Class[]{MovieReconstructedCamera.class}, __io__block, __io__blockTable);
	}

}
