package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'HairCurve'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class HairCurve extends CFacade {

	/**
	 * This is the sdna index of the struct HairCurve.
	 * <p>
	 * It is required when allocating a new block to store data for HairCurve.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 789;

	/**
	 * Field descriptor (offset) for struct member 'firstpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of first point of hair curve. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HairCurve haircurve = ...;
	 * CPointer&lt;Object&gt; p = haircurve.__dna__addressof(HairCurve.__DNA__FIELD__firstpoint);
	 * CPointer&lt;Integer&gt; p_firstpoint = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'firstpoint'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__firstpoint = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'numpoints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of points in hair curve, must be 2 or higher. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HairCurve haircurve = ...;
	 * CPointer&lt;Object&gt; p = haircurve.__dna__addressof(HairCurve.__DNA__FIELD__numpoints);
	 * CPointer&lt;Integer&gt; p_numpoints = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'numpoints'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__numpoints = new long[]{4, 4};

	public HairCurve(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected HairCurve(HairCurve that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'firstpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of first point of hair curve. </p>
	 * @see #__DNA__FIELD__firstpoint
	 */
	
	public int getFirstpoint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'firstpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of first point of hair curve. </p>
	 * @see #__DNA__FIELD__firstpoint
	 */
	
	public void setFirstpoint(int firstpoint) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, firstpoint);
		} else {
			__io__block.writeInt(__io__address + 0, firstpoint);
		}
	}

	/**
	 * Get method for struct member 'numpoints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of points in hair curve, must be 2 or higher. </p>
	 * @see #__DNA__FIELD__numpoints
	 */
	
	public int getNumpoints() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'numpoints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of points in hair curve, must be 2 or higher. </p>
	 * @see #__DNA__FIELD__numpoints
	 */
	
	public void setNumpoints(int numpoints) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, numpoints);
		} else {
			__io__block.writeInt(__io__address + 4, numpoints);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<HairCurve> __io__addressof() {
		return new CPointer<HairCurve>(__io__address, new Class[]{HairCurve.class}, __io__block, __io__blockTable);
	}

}
