package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LineStyleColorModifier_DistanceFromCamera'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Distance from {@link Camera}  modifiers </p>
 */

@CMetaData(size32=100, size64=112)
public class LineStyleColorModifier_DistanceFromCamera extends CFacade {

	/**
	 * This is the sdna index of the struct LineStyleColorModifier_DistanceFromCamera.
	 * <p>
	 * It is required when allocating a new block to store data for LineStyleColorModifier_DistanceFromCamera.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 717;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleColorModifier_DistanceFromCamera linestylecolormodifier_distancefromcamera = ...;
	 * CPointer&lt;Object&gt; p = linestylecolormodifier_distancefromcamera.__dna__addressof(LineStyleColorModifier_DistanceFromCamera.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'color_ramp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Color ramp used to change line color
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleColorModifier_DistanceFromCamera linestylecolormodifier_distancefromcamera = ...;
	 * CPointer&lt;Object&gt; p = linestylecolormodifier_distancefromcamera.__dna__addressof(LineStyleColorModifier_DistanceFromCamera.__DNA__FIELD__color_ramp);
	 * CPointer&lt;CPointer&lt;ColorBand&gt;&gt; p_color_ramp = p.cast(new Class[]{CPointer.class, ColorBand.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_ramp'</li>
	 * <li>Signature: 'ColorBand*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_ramp = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'range_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower bound of the input range the mapping is applied
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleColorModifier_DistanceFromCamera linestylecolormodifier_distancefromcamera = ...;
	 * CPointer&lt;Object&gt; p = linestylecolormodifier_distancefromcamera.__dna__addressof(LineStyleColorModifier_DistanceFromCamera.__DNA__FIELD__range_min);
	 * CPointer&lt;Float&gt; p_range_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'range_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__range_min = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member 'range_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper bound of the input range the mapping is applied
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleColorModifier_DistanceFromCamera linestylecolormodifier_distancefromcamera = ...;
	 * CPointer&lt;Object&gt; p = linestylecolormodifier_distancefromcamera.__dna__addressof(LineStyleColorModifier_DistanceFromCamera.__DNA__FIELD__range_max);
	 * CPointer&lt;Float&gt; p_range_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'range_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__range_max = new long[]{96, 108};

	public LineStyleColorModifier_DistanceFromCamera(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LineStyleColorModifier_DistanceFromCamera(LineStyleColorModifier_DistanceFromCamera that) {
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
	 * Get method for struct member 'color_ramp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Color ramp used to change line color
	 * @see #__DNA__FIELD__color_ramp
	 */
	
	public CPointer<ColorBand> getColor_ramp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ColorBand.class};
		return new CPointer<ColorBand>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ColorBand.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'color_ramp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Color ramp used to change line color
	 * @see #__DNA__FIELD__color_ramp
	 */
	
	public void setColor_ramp(CPointer<ColorBand> color_ramp) throws IOException
	{
		long __address = ((color_ramp == null) ? 0 : color_ramp.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Get method for struct member 'range_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower bound of the input range the mapping is applied
	 * @see #__DNA__FIELD__range_min
	 */
	
	public float getRange_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'range_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower bound of the input range the mapping is applied
	 * @see #__DNA__FIELD__range_min
	 */
	
	public void setRange_min(float range_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, range_min);
		} else {
			__io__block.writeFloat(__io__address + 92, range_min);
		}
	}

	/**
	 * Get method for struct member 'range_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper bound of the input range the mapping is applied
	 * @see #__DNA__FIELD__range_max
	 */
	
	public float getRange_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'range_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper bound of the input range the mapping is applied
	 * @see #__DNA__FIELD__range_max
	 */
	
	public void setRange_max(float range_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, range_max);
		} else {
			__io__block.writeFloat(__io__address + 96, range_max);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LineStyleColorModifier_DistanceFromCamera> __io__addressof() {
		return new CPointer<LineStyleColorModifier_DistanceFromCamera>(__io__address, new Class[]{LineStyleColorModifier_DistanceFromCamera.class}, __io__block, __io__blockTable);
	}

}
