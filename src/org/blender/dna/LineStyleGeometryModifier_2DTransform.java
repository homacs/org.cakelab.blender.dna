package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LineStyleGeometryModifier_2DTransform'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=120, size64=128)
public class LineStyleGeometryModifier_2DTransform extends CFacade {

	/**
	 * This is the sdna index of the struct LineStyleGeometryModifier_2DTransform.
	 * <p>
	 * It is required when allocating a new block to store data for LineStyleGeometryModifier_2DTransform.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 623;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_2DTransform linestylegeometrymodifier_2dtransform = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_2dtransform.__dna__addressof(LineStyleGeometryModifier_2DTransform.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'pivot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pivot of scaling and rotation operations
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_2DTransform linestylegeometrymodifier_2dtransform = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_2dtransform.__dna__addressof(LineStyleGeometryModifier_2DTransform.__DNA__FIELD__pivot);
	 * CPointer&lt;Integer&gt; p_pivot = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pivot'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pivot = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'scale_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scaling factor that is applied along the X axis
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_2DTransform linestylegeometrymodifier_2dtransform = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_2dtransform.__dna__addressof(LineStyleGeometryModifier_2DTransform.__DNA__FIELD__scale_x);
	 * CPointer&lt;Float&gt; p_scale_x = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale_x'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale_x = new long[]{92, 100};

	/**
	 * Field descriptor (offset) for struct member 'scale_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scaling factor that is applied along the Y axis
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_2DTransform linestylegeometrymodifier_2dtransform = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_2dtransform.__dna__addressof(LineStyleGeometryModifier_2DTransform.__DNA__FIELD__scale_y);
	 * CPointer&lt;Float&gt; p_scale_y = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale_y'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale_y = new long[]{96, 104};

	/**
	 * Field descriptor (offset) for struct member 'angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation angle<h4>Blender Source Code:</h4>
	 * <p> In radians!. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_2DTransform linestylegeometrymodifier_2dtransform = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_2dtransform.__dna__addressof(LineStyleGeometryModifier_2DTransform.__DNA__FIELD__angle);
	 * CPointer&lt;Float&gt; p_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angle = new long[]{100, 108};

	/**
	 * Field descriptor (offset) for struct member 'pivot_u'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pivot in terms of the stroke point parameter u (0 <= u <= 1)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_2DTransform linestylegeometrymodifier_2dtransform = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_2dtransform.__dna__addressof(LineStyleGeometryModifier_2DTransform.__DNA__FIELD__pivot_u);
	 * CPointer&lt;Float&gt; p_pivot_u = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pivot_u'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pivot_u = new long[]{104, 112};

	/**
	 * Field descriptor (offset) for struct member 'pivot_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * 2D X coordinate of the absolute pivot
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_2DTransform linestylegeometrymodifier_2dtransform = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_2dtransform.__dna__addressof(LineStyleGeometryModifier_2DTransform.__DNA__FIELD__pivot_x);
	 * CPointer&lt;Float&gt; p_pivot_x = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pivot_x'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pivot_x = new long[]{108, 116};

	/**
	 * Field descriptor (offset) for struct member 'pivot_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * 2D Y coordinate of the absolute pivot
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_2DTransform linestylegeometrymodifier_2dtransform = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_2dtransform.__dna__addressof(LineStyleGeometryModifier_2DTransform.__DNA__FIELD__pivot_y);
	 * CPointer&lt;Float&gt; p_pivot_y = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pivot_y'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pivot_y = new long[]{112, 120};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_2DTransform linestylegeometrymodifier_2dtransform = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_2dtransform.__dna__addressof(LineStyleGeometryModifier_2DTransform.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{116, 124};

	public LineStyleGeometryModifier_2DTransform(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LineStyleGeometryModifier_2DTransform(LineStyleGeometryModifier_2DTransform that) {
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
	 * Get method for struct member 'pivot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pivot of scaling and rotation operations
	 * @see #__DNA__FIELD__pivot
	 */
	
	public int getPivot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 96);
		} else {
			return __io__block.readInt(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'pivot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pivot of scaling and rotation operations
	 * @see #__DNA__FIELD__pivot
	 */
	
	public void setPivot(int pivot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 96, pivot);
		} else {
			__io__block.writeInt(__io__address + 88, pivot);
		}
	}

	/**
	 * Get method for struct member 'scale_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scaling factor that is applied along the X axis
	 * @see #__DNA__FIELD__scale_x
	 */
	
	public float getScale_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'scale_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scaling factor that is applied along the X axis
	 * @see #__DNA__FIELD__scale_x
	 */
	
	public void setScale_x(float scale_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, scale_x);
		} else {
			__io__block.writeFloat(__io__address + 92, scale_x);
		}
	}

	/**
	 * Get method for struct member 'scale_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scaling factor that is applied along the Y axis
	 * @see #__DNA__FIELD__scale_y
	 */
	
	public float getScale_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'scale_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scaling factor that is applied along the Y axis
	 * @see #__DNA__FIELD__scale_y
	 */
	
	public void setScale_y(float scale_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, scale_y);
		} else {
			__io__block.writeFloat(__io__address + 96, scale_y);
		}
	}

	/**
	 * Get method for struct member 'angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation angle<h4>Blender Source Code:</h4>
	 * <p> In radians!. </p>
	 * @see #__DNA__FIELD__angle
	 */
	
	public float getAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation angle<h4>Blender Source Code:</h4>
	 * <p> In radians!. </p>
	 * @see #__DNA__FIELD__angle
	 */
	
	public void setAngle(float angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, angle);
		} else {
			__io__block.writeFloat(__io__address + 100, angle);
		}
	}

	/**
	 * Get method for struct member 'pivot_u'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pivot in terms of the stroke point parameter u (0 <= u <= 1)
	 * @see #__DNA__FIELD__pivot_u
	 */
	
	public float getPivot_u() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'pivot_u'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pivot in terms of the stroke point parameter u (0 <= u <= 1)
	 * @see #__DNA__FIELD__pivot_u
	 */
	
	public void setPivot_u(float pivot_u) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, pivot_u);
		} else {
			__io__block.writeFloat(__io__address + 104, pivot_u);
		}
	}

	/**
	 * Get method for struct member 'pivot_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * 2D X coordinate of the absolute pivot
	 * @see #__DNA__FIELD__pivot_x
	 */
	
	public float getPivot_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'pivot_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * 2D X coordinate of the absolute pivot
	 * @see #__DNA__FIELD__pivot_x
	 */
	
	public void setPivot_x(float pivot_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, pivot_x);
		} else {
			__io__block.writeFloat(__io__address + 108, pivot_x);
		}
	}

	/**
	 * Get method for struct member 'pivot_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * 2D Y coordinate of the absolute pivot
	 * @see #__DNA__FIELD__pivot_y
	 */
	
	public float getPivot_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'pivot_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * 2D Y coordinate of the absolute pivot
	 * @see #__DNA__FIELD__pivot_y
	 */
	
	public void setPivot_y(float pivot_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, pivot_y);
		} else {
			__io__block.writeFloat(__io__address + 112, pivot_y);
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
			return new CArrayFacade<Byte>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 124;
		} else {
			__dna__offset = 116;
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
	public CPointer<LineStyleGeometryModifier_2DTransform> __io__addressof() {
		return new CPointer<LineStyleGeometryModifier_2DTransform>(__io__address, new Class[]{LineStyleGeometryModifier_2DTransform.class}, __io__block, __io__blockTable);
	}

}
