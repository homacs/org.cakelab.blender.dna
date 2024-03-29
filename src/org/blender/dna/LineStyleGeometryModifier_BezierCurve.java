package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LineStyleGeometryModifier_BezierCurve'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=96, size64=104)
public class LineStyleGeometryModifier_BezierCurve extends CFacade {

	/**
	 * This is the sdna index of the struct LineStyleGeometryModifier_BezierCurve.
	 * <p>
	 * It is required when allocating a new block to store data for LineStyleGeometryModifier_BezierCurve.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 263;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_BezierCurve linestylegeometrymodifier_beziercurve = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_beziercurve.__dna__addressof(LineStyleGeometryModifier_BezierCurve.__DNA__FIELD__modifier);
	 * CPointer&lt;LineStyleModifier&gt; p_modifier = p.cast(new Class[]{LineStyleModifier.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'LineStyleModifier'</li>
	 * <li>Actual Size (32bit/64bit): 88/96</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Maximum distance allowed between the new Bezier curve and the original backbone geometry
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_BezierCurve linestylegeometrymodifier_beziercurve = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_beziercurve.__dna__addressof(LineStyleGeometryModifier_BezierCurve.__DNA__FIELD__error);
	 * CPointer&lt;Float&gt; p_error = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'error'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__error = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_BezierCurve linestylegeometrymodifier_beziercurve = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_beziercurve.__dna__addressof(LineStyleGeometryModifier_BezierCurve.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{92, 100};

	public LineStyleGeometryModifier_BezierCurve(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LineStyleGeometryModifier_BezierCurve(LineStyleGeometryModifier_BezierCurve that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public LineStyleModifier getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new LineStyleModifier(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new LineStyleModifier(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(LineStyleModifier modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Maximum distance allowed between the new Bezier curve and the original backbone geometry
	 * @see #__DNA__FIELD__error
	 */
	
	public float getError() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Maximum distance allowed between the new Bezier curve and the original backbone geometry
	 * @see #__DNA__FIELD__error
	 */
	
	public void setError(float error) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, error);
		} else {
			__io__block.writeFloat(__io__address + 88, error);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 100;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LineStyleGeometryModifier_BezierCurve> __io__addressof() {
		return new CPointer<LineStyleGeometryModifier_BezierCurve>(__io__address, new Class[]{LineStyleGeometryModifier_BezierCurve.class}, __io__block, __io__blockTable);
	}

}
