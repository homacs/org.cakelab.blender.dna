package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LineStyleThicknessModifier_Calligraphy'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Calligraphic thickness modifier </p>
 */

@CMetaData(size32=104, size64=112)
public class LineStyleThicknessModifier_Calligraphy extends CFacade {

	/**
	 * This is the sdna index of the struct LineStyleThicknessModifier_Calligraphy.
	 * <p>
	 * It is required when allocating a new block to store data for LineStyleThicknessModifier_Calligraphy.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 617;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_Calligraphy linestylethicknessmodifier_calligraphy = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_calligraphy.__dna__addressof(LineStyleThicknessModifier_Calligraphy.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'min_thickness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_Calligraphy linestylethicknessmodifier_calligraphy = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_calligraphy.__dna__addressof(LineStyleThicknessModifier_Calligraphy.__DNA__FIELD__min_thickness);
	 * CPointer&lt;Float&gt; p_min_thickness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min_thickness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min_thickness = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'max_thickness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_Calligraphy linestylethicknessmodifier_calligraphy = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_calligraphy.__dna__addressof(LineStyleThicknessModifier_Calligraphy.__DNA__FIELD__max_thickness);
	 * CPointer&lt;Float&gt; p_max_thickness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_thickness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_thickness = new long[]{92, 100};

	/**
	 * Field descriptor (offset) for struct member 'orientation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angle of the main direction<h4>Blender Source Code:</h4>
	 * <p> in radians! </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_Calligraphy linestylethicknessmodifier_calligraphy = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_calligraphy.__dna__addressof(LineStyleThicknessModifier_Calligraphy.__DNA__FIELD__orientation);
	 * CPointer&lt;Float&gt; p_orientation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orientation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orientation = new long[]{96, 104};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_Calligraphy linestylethicknessmodifier_calligraphy = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_calligraphy.__dna__addressof(LineStyleThicknessModifier_Calligraphy.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{100, 108};

	public LineStyleThicknessModifier_Calligraphy(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LineStyleThicknessModifier_Calligraphy(LineStyleThicknessModifier_Calligraphy that) {
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
	 * Get method for struct member 'min_thickness'.
	 * @see #__DNA__FIELD__min_thickness
	 */
	
	public float getMin_thickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'min_thickness'.
	 * @see #__DNA__FIELD__min_thickness
	 */
	
	public void setMin_thickness(float min_thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, min_thickness);
		} else {
			__io__block.writeFloat(__io__address + 88, min_thickness);
		}
	}

	/**
	 * Get method for struct member 'max_thickness'.
	 * @see #__DNA__FIELD__max_thickness
	 */
	
	public float getMax_thickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'max_thickness'.
	 * @see #__DNA__FIELD__max_thickness
	 */
	
	public void setMax_thickness(float max_thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, max_thickness);
		} else {
			__io__block.writeFloat(__io__address + 92, max_thickness);
		}
	}

	/**
	 * Get method for struct member 'orientation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angle of the main direction<h4>Blender Source Code:</h4>
	 * <p> in radians! </p>
	 * @see #__DNA__FIELD__orientation
	 */
	
	public float getOrientation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'orientation'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Angle of the main direction<h4>Blender Source Code:</h4>
	 * <p> in radians! </p>
	 * @see #__DNA__FIELD__orientation
	 */
	
	public void setOrientation(float orientation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, orientation);
		} else {
			__io__block.writeFloat(__io__address + 96, orientation);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 108);
		} else {
			return __io__block.readInt(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 108, pad);
		} else {
			__io__block.writeInt(__io__address + 100, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LineStyleThicknessModifier_Calligraphy> __io__addressof() {
		return new CPointer<LineStyleThicknessModifier_Calligraphy>(__io__address, new Class[]{LineStyleThicknessModifier_Calligraphy.class}, __io__block, __io__blockTable);
	}

}
