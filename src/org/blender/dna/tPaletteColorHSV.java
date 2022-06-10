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
 * Generated facet for DNA struct type 'tPaletteColorHSV'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> Struct to hold palette colors for sorting. </p>
 */

@CMetaData(size32=28, size64=28)
public class tPaletteColorHSV extends CFacade {

	/**
	 * This is the sdna index of the struct tPaletteColorHSV.
	 * <p>
	 * It is required when allocating a new block to store data for tPaletteColorHSV.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 551;

	/**
	 * Field descriptor (offset) for struct member 'rgb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * tPaletteColorHSV tpalettecolorhsv = ...;
	 * CPointer&lt;Object&gt; p = tpalettecolorhsv.__dna__addressof(tPaletteColorHSV.__DNA__FIELD__rgb);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rgb = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rgb'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rgb = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'value'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * tPaletteColorHSV tpalettecolorhsv = ...;
	 * CPointer&lt;Object&gt; p = tpalettecolorhsv.__dna__addressof(tPaletteColorHSV.__DNA__FIELD__value);
	 * CPointer&lt;Float&gt; p_value = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'h'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * tPaletteColorHSV tpalettecolorhsv = ...;
	 * CPointer&lt;Object&gt; p = tpalettecolorhsv.__dna__addressof(tPaletteColorHSV.__DNA__FIELD__h);
	 * CPointer&lt;Float&gt; p_h = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'h'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__h = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 's'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * tPaletteColorHSV tpalettecolorhsv = ...;
	 * CPointer&lt;Object&gt; p = tpalettecolorhsv.__dna__addressof(tPaletteColorHSV.__DNA__FIELD__s);
	 * CPointer&lt;Float&gt; p_s = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 's'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__s = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'v'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * tPaletteColorHSV tpalettecolorhsv = ...;
	 * CPointer&lt;Object&gt; p = tpalettecolorhsv.__dna__addressof(tPaletteColorHSV.__DNA__FIELD__v);
	 * CPointer&lt;Float&gt; p_v = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v = new long[]{24, 24};

	public tPaletteColorHSV(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected tPaletteColorHSV(tPaletteColorHSV that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'rgb'.
	 * @see #__DNA__FIELD__rgb
	 */
	
	public CArrayFacade<Float> getRgb() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rgb'.
	 * @see #__DNA__FIELD__rgb
	 */
	
	public void setRgb(CArrayFacade<Float> rgb) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(rgb, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rgb)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rgb);
		} else {
			__io__generic__copy( getRgb(), rgb);
		}
	}

	/**
	 * Get method for struct member 'value'.
	 * @see #__DNA__FIELD__value
	 */
	
	public float getValue() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'value'.
	 * @see #__DNA__FIELD__value
	 */
	
	public void setValue(float value) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, value);
		} else {
			__io__block.writeFloat(__io__address + 12, value);
		}
	}

	/**
	 * Get method for struct member 'h'.
	 * @see #__DNA__FIELD__h
	 */
	
	public float getH() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'h'.
	 * @see #__DNA__FIELD__h
	 */
	
	public void setH(float h) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, h);
		} else {
			__io__block.writeFloat(__io__address + 16, h);
		}
	}

	/**
	 * Get method for struct member 's'.
	 * @see #__DNA__FIELD__s
	 */
	
	public float getS() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 's'.
	 * @see #__DNA__FIELD__s
	 */
	
	public void setS(float s) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, s);
		} else {
			__io__block.writeFloat(__io__address + 20, s);
		}
	}

	/**
	 * Get method for struct member 'v'.
	 * @see #__DNA__FIELD__v
	 */
	
	public float getV() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'v'.
	 * @see #__DNA__FIELD__v
	 */
	
	public void setV(float v) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, v);
		} else {
			__io__block.writeFloat(__io__address + 24, v);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<tPaletteColorHSV> __io__addressof() {
		return new CPointer<tPaletteColorHSV>(__io__address, new Class[]{tPaletteColorHSV.class}, __io__block, __io__blockTable);
	}

}
