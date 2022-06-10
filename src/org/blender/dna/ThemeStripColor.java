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
 * Generated facet for DNA struct type 'ThemeStripColor'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=4)
public class ThemeStripColor extends CFacade {

	/**
	 * This is the sdna index of the struct ThemeStripColor.
	 * <p>
	 * It is required when allocating a new block to store data for ThemeStripColor.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 282;

	/**
	 * Field descriptor (offset) for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Strip Color
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeStripColor themestripcolor = ...;
	 * CPointer&lt;Object&gt; p = themestripcolor.__dna__addressof(ThemeStripColor.__DNA__FIELD__color);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_color = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color = new long[]{0, 0};

	public ThemeStripColor(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ThemeStripColor(ThemeStripColor that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Strip Color
	 * @see #__DNA__FIELD__color
	 */
	
	public CArrayFacade<Byte> getColor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Strip Color
	 * @see #__DNA__FIELD__color
	 */
	
	public void setColor(CArrayFacade<Byte> color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, color);
		} else {
			__io__generic__copy( getColor(), color);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ThemeStripColor> __io__addressof() {
		return new CPointer<ThemeStripColor>(__io__address, new Class[]{ThemeStripColor.class}, __io__block, __io__blockTable);
	}

}
