package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LineStyleThicknessModifier_Curvature_3D'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=116, size64=128)
public class LineStyleThicknessModifier_Curvature_3D extends CFacade {

	/**
	 * This is the sdna index of the struct LineStyleThicknessModifier_Curvature_3D.
	 * <p>
	 * It is required when allocating a new block to store data for LineStyleThicknessModifier_Curvature_3D.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 725;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_Curvature_3D linestylethicknessmodifier_curvature_3d = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_curvature_3d.__dna__addressof(LineStyleThicknessModifier_Curvature_3D.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the curve mapping
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_Curvature_3D linestylethicknessmodifier_curvature_3d = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_curvature_3d.__dna__addressof(LineStyleThicknessModifier_Curvature_3D.__DNA__FIELD__curve);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_curve = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_Curvature_3D linestylethicknessmodifier_curvature_3d = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_curvature_3d.__dna__addressof(LineStyleThicknessModifier_Curvature_3D.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_Curvature_3D linestylethicknessmodifier_curvature_3d = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_curvature_3d.__dna__addressof(LineStyleThicknessModifier_Curvature_3D.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{96, 108};

	/**
	 * Field descriptor (offset) for struct member 'min_curvature'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_Curvature_3D linestylethicknessmodifier_curvature_3d = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_curvature_3d.__dna__addressof(LineStyleThicknessModifier_Curvature_3D.__DNA__FIELD__min_curvature);
	 * CPointer&lt;Float&gt; p_min_curvature = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min_curvature'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min_curvature = new long[]{100, 112};

	/**
	 * Field descriptor (offset) for struct member 'max_curvature'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_Curvature_3D linestylethicknessmodifier_curvature_3d = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_curvature_3d.__dna__addressof(LineStyleThicknessModifier_Curvature_3D.__DNA__FIELD__max_curvature);
	 * CPointer&lt;Float&gt; p_max_curvature = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_curvature'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_curvature = new long[]{104, 116};

	/**
	 * Field descriptor (offset) for struct member 'min_thickness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_Curvature_3D linestylethicknessmodifier_curvature_3d = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_curvature_3d.__dna__addressof(LineStyleThicknessModifier_Curvature_3D.__DNA__FIELD__min_thickness);
	 * CPointer&lt;Float&gt; p_min_thickness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min_thickness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min_thickness = new long[]{108, 120};

	/**
	 * Field descriptor (offset) for struct member 'max_thickness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_Curvature_3D linestylethicknessmodifier_curvature_3d = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_curvature_3d.__dna__addressof(LineStyleThicknessModifier_Curvature_3D.__DNA__FIELD__max_thickness);
	 * CPointer&lt;Float&gt; p_max_thickness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_thickness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_thickness = new long[]{112, 124};

	public LineStyleThicknessModifier_Curvature_3D(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LineStyleThicknessModifier_Curvature_3D(LineStyleThicknessModifier_Curvature_3D that) {
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
	 * Get method for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the curve mapping
	 * @see #__DNA__FIELD__curve
	 */
	
	public CPointer<CurveMapping> getCurve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the curve mapping
	 * @see #__DNA__FIELD__curve
	 */
	
	public void setCurve(CPointer<CurveMapping> curve) throws IOException
	{
		long __address = ((curve == null) ? 0 : curve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 104);
		} else {
			return __io__block.readInt(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 104, flags);
		} else {
			__io__block.writeInt(__io__address + 92, flags);
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
			return new CArrayFacade<Byte>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 108;
		} else {
			__dna__offset = 96;
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
	 * Get method for struct member 'min_curvature'.
	 * @see #__DNA__FIELD__min_curvature
	 */
	
	public float getMin_curvature() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'min_curvature'.
	 * @see #__DNA__FIELD__min_curvature
	 */
	
	public void setMin_curvature(float min_curvature) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, min_curvature);
		} else {
			__io__block.writeFloat(__io__address + 100, min_curvature);
		}
	}

	/**
	 * Get method for struct member 'max_curvature'.
	 * @see #__DNA__FIELD__max_curvature
	 */
	
	public float getMax_curvature() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'max_curvature'.
	 * @see #__DNA__FIELD__max_curvature
	 */
	
	public void setMax_curvature(float max_curvature) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, max_curvature);
		} else {
			__io__block.writeFloat(__io__address + 104, max_curvature);
		}
	}

	/**
	 * Get method for struct member 'min_thickness'.
	 * @see #__DNA__FIELD__min_thickness
	 */
	
	public float getMin_thickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'min_thickness'.
	 * @see #__DNA__FIELD__min_thickness
	 */
	
	public void setMin_thickness(float min_thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, min_thickness);
		} else {
			__io__block.writeFloat(__io__address + 108, min_thickness);
		}
	}

	/**
	 * Get method for struct member 'max_thickness'.
	 * @see #__DNA__FIELD__max_thickness
	 */
	
	public float getMax_thickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'max_thickness'.
	 * @see #__DNA__FIELD__max_thickness
	 */
	
	public void setMax_thickness(float max_thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, max_thickness);
		} else {
			__io__block.writeFloat(__io__address + 112, max_thickness);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LineStyleThicknessModifier_Curvature_3D> __io__addressof() {
		return new CPointer<LineStyleThicknessModifier_Curvature_3D>(__io__address, new Class[]{LineStyleThicknessModifier_Curvature_3D.class}, __io__block, __io__blockTable);
	}

}
