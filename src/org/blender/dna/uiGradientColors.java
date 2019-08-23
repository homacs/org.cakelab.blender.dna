package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'uiGradientColors'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=16, size64=16)
public class uiGradientColors extends CFacade {

	/**
	 * This is the sdna index of the struct uiGradientColors.
	 * <p>
	 * It is required when allocating a new block to store data for uiGradientColors.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 245;

	/**
	 * Field descriptor (offset) for struct member 'gradient'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiGradientColors uigradientcolors = ...;
	 * CPointer&lt;Object&gt; p = uigradientcolors.__dna__addressof(uiGradientColors.__DNA__FIELD__gradient);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_gradient = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'high_gradient'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiGradientColors uigradientcolors = ...;
	 * CPointer&lt;Object&gt; p = uigradientcolors.__dna__addressof(uiGradientColors.__DNA__FIELD__high_gradient);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_high_gradient = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'high_gradient'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__high_gradient = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'show_grad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiGradientColors uigradientcolors = ...;
	 * CPointer&lt;Object&gt; p = uigradientcolors.__dna__addressof(uiGradientColors.__DNA__FIELD__show_grad);
	 * CPointer&lt;Integer&gt; p_show_grad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'show_grad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__show_grad = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * uiGradientColors uigradientcolors = ...;
	 * CPointer&lt;Object&gt; p = uigradientcolors.__dna__addressof(uiGradientColors.__DNA__FIELD__pad2);
	 * CPointer&lt;Integer&gt; p_pad2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{12, 12};

	public uiGradientColors(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected uiGradientColors(uiGradientColors that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'gradient'.
	 * @see #__DNA__FIELD__gradient
	 */
	
	public CArrayFacade<Byte> getGradient() throws IOException
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
	 * Set method for struct member 'gradient'.
	 * @see #__DNA__FIELD__gradient
	 */
	
	public void setGradient(CArrayFacade<Byte> gradient) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(gradient, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gradient)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gradient);
		} else {
			__io__generic__copy( getGradient(), gradient);
		}
	}

	/**
	 * Get method for struct member 'high_gradient'.
	 * @see #__DNA__FIELD__high_gradient
	 */
	
	public CArrayFacade<Byte> getHigh_gradient() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'high_gradient'.
	 * @see #__DNA__FIELD__high_gradient
	 */
	
	public void setHigh_gradient(CArrayFacade<Byte> high_gradient) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(high_gradient, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, high_gradient)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, high_gradient);
		} else {
			__io__generic__copy( getHigh_gradient(), high_gradient);
		}
	}

	/**
	 * Get method for struct member 'show_grad'.
	 * @see #__DNA__FIELD__show_grad
	 */
	
	public int getShow_grad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'show_grad'.
	 * @see #__DNA__FIELD__show_grad
	 */
	
	public void setShow_grad(int show_grad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, show_grad);
		} else {
			__io__block.writeInt(__io__address + 8, show_grad);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public int getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(int pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, pad2);
		} else {
			__io__block.writeInt(__io__address + 12, pad2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<uiGradientColors> __io__addressof() {
		return new CPointer<uiGradientColors>(__io__address, new Class[]{uiGradientColors.class}, __io__block, __io__blockTable);
	}

}
