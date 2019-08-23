package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LineStyleGeometryModifier_2DOffset'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=104, size64=112)
public class LineStyleGeometryModifier_2DOffset extends CFacade {

	/**
	 * This is the sdna index of the struct LineStyleGeometryModifier_2DOffset.
	 * <p>
	 * It is required when allocating a new block to store data for LineStyleGeometryModifier_2DOffset.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 622;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_2DOffset linestylegeometrymodifier_2doffset = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_2doffset.__dna__addressof(LineStyleGeometryModifier_2DOffset.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement that is applied from the beginning of the stroke
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_2DOffset linestylegeometrymodifier_2doffset = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_2doffset.__dna__addressof(LineStyleGeometryModifier_2DOffset.__DNA__FIELD__start);
	 * CPointer&lt;Float&gt; p_start = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'start'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__start = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement that is applied from the end of the stroke
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_2DOffset linestylegeometrymodifier_2doffset = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_2doffset.__dna__addressof(LineStyleGeometryModifier_2DOffset.__DNA__FIELD__end);
	 * CPointer&lt;Float&gt; p_end = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'end'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__end = new long[]{92, 100};

	/**
	 * Field descriptor (offset) for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement that is applied to the X coordinates of stroke vertices
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_2DOffset linestylegeometrymodifier_2doffset = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_2doffset.__dna__addressof(LineStyleGeometryModifier_2DOffset.__DNA__FIELD__x);
	 * CPointer&lt;Float&gt; p_x = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'x'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__x = new long[]{96, 104};

	/**
	 * Field descriptor (offset) for struct member 'y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement that is applied to the Y coordinates of stroke vertices
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_2DOffset linestylegeometrymodifier_2doffset = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_2doffset.__dna__addressof(LineStyleGeometryModifier_2DOffset.__DNA__FIELD__y);
	 * CPointer&lt;Float&gt; p_y = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'y'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__y = new long[]{100, 108};

	public LineStyleGeometryModifier_2DOffset(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LineStyleGeometryModifier_2DOffset(LineStyleGeometryModifier_2DOffset that) {
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
	 * Get method for struct member 'start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement that is applied from the beginning of the stroke
	 * @see #__DNA__FIELD__start
	 */
	
	public float getStart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement that is applied from the beginning of the stroke
	 * @see #__DNA__FIELD__start
	 */
	
	public void setStart(float start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, start);
		} else {
			__io__block.writeFloat(__io__address + 88, start);
		}
	}

	/**
	 * Get method for struct member 'end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement that is applied from the end of the stroke
	 * @see #__DNA__FIELD__end
	 */
	
	public float getEnd() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement that is applied from the end of the stroke
	 * @see #__DNA__FIELD__end
	 */
	
	public void setEnd(float end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, end);
		} else {
			__io__block.writeFloat(__io__address + 92, end);
		}
	}

	/**
	 * Get method for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement that is applied to the X coordinates of stroke vertices
	 * @see #__DNA__FIELD__x
	 */
	
	public float getX() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement that is applied to the X coordinates of stroke vertices
	 * @see #__DNA__FIELD__x
	 */
	
	public void setX(float x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, x);
		} else {
			__io__block.writeFloat(__io__address + 96, x);
		}
	}

	/**
	 * Get method for struct member 'y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement that is applied to the Y coordinates of stroke vertices
	 * @see #__DNA__FIELD__y
	 */
	
	public float getY() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Displacement that is applied to the Y coordinates of stroke vertices
	 * @see #__DNA__FIELD__y
	 */
	
	public void setY(float y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, y);
		} else {
			__io__block.writeFloat(__io__address + 100, y);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LineStyleGeometryModifier_2DOffset> __io__addressof() {
		return new CPointer<LineStyleGeometryModifier_2DOffset>(__io__address, new Class[]{LineStyleGeometryModifier_2DOffset.class}, __io__block, __io__blockTable);
	}

}
