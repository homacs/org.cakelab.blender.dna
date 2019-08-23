package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'PaintCurvePoint'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=76, size64=76)
public class PaintCurvePoint extends CFacade {

	/**
	 * This is the sdna index of the struct PaintCurvePoint.
	 * <p>
	 * It is required when allocating a new block to store data for PaintCurvePoint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 442;

	/**
	 * Field descriptor (offset) for struct member 'bez'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bezier handle. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PaintCurvePoint paintcurvepoint = ...;
	 * CPointer&lt;Object&gt; p = paintcurvepoint.__dna__addressof(PaintCurvePoint.__DNA__FIELD__bez);
	 * CPointer&lt;BezTriple&gt; p_bez = p.cast(new Class[]{BezTriple.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bez'</li>
	 * <li>Signature: 'BezTriple'</li>
	 * <li>Actual Size (32bit/64bit): 72/72</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bez = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'pressure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pressure on that point. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PaintCurvePoint paintcurvepoint = ...;
	 * CPointer&lt;Object&gt; p = paintcurvepoint.__dna__addressof(PaintCurvePoint.__DNA__FIELD__pressure);
	 * CPointer&lt;Float&gt; p_pressure = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pressure'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pressure = new long[]{72, 72};

	public PaintCurvePoint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected PaintCurvePoint(PaintCurvePoint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'bez'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bezier handle. </p>
	 * @see #__DNA__FIELD__bez
	 */
	
	public BezTriple getBez() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new BezTriple(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new BezTriple(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bez'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bezier handle. </p>
	 * @see #__DNA__FIELD__bez
	 */
	
	public void setBez(BezTriple bez) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(bez, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bez)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bez);
		} else {
			__io__generic__copy( getBez(), bez);
		}
	}

	/**
	 * Get method for struct member 'pressure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pressure on that point. </p>
	 * @see #__DNA__FIELD__pressure
	 */
	
	public float getPressure() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'pressure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pressure on that point. </p>
	 * @see #__DNA__FIELD__pressure
	 */
	
	public void setPressure(float pressure) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, pressure);
		} else {
			__io__block.writeFloat(__io__address + 72, pressure);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<PaintCurvePoint> __io__addressof() {
		return new CPointer<PaintCurvePoint>(__io__address, new Class[]{PaintCurvePoint.class}, __io__block, __io__blockTable);
	}

}
