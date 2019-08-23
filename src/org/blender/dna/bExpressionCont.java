package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bExpressionCont'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> ****************** CONTROLLERS ********************* </p>
 */

@CMetaData(size32=128, size64=128)
public class bExpressionCont extends CFacade {

	/**
	 * This is the sdna index of the struct bExpressionCont.
	 * <p>
	 * It is required when allocating a new block to store data for bExpressionCont.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 309;

	/**
	 * Field descriptor (offset) for struct member 'str'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bExpressionCont bexpressioncont = ...;
	 * CPointer&lt;Object&gt; p = bexpressioncont.__dna__addressof(bExpressionCont.__DNA__FIELD__str);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_str = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'str'</li>
	 * <li>Signature: 'char[128]'</li>
	 * <li>Actual Size (32bit/64bit): 128/128</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__str = new long[]{0, 0};

	public bExpressionCont(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bExpressionCont(bExpressionCont that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'str'.
	 * @see #__DNA__FIELD__str
	 */
	
	public CArrayFacade<Byte> getStr() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			128
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'str'.
	 * @see #__DNA__FIELD__str
	 */
	
	public void setStr(CArrayFacade<Byte> str) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(str, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, str)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, str);
		} else {
			__io__generic__copy( getStr(), str);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bExpressionCont> __io__addressof() {
		return new CPointer<bExpressionCont>(__io__address, new Class[]{bExpressionCont.class}, __io__block, __io__blockTable);
	}

}
