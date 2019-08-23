package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'StripColorBalance'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=44, size64=44)
public class StripColorBalance extends CFacade {

	/**
	 * This is the sdna index of the struct StripColorBalance.
	 * <p>
	 * It is required when allocating a new block to store data for StripColorBalance.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 277;

	/**
	 * Field descriptor (offset) for struct member 'lift'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripColorBalance stripcolorbalance = ...;
	 * CPointer&lt;Object&gt; p = stripcolorbalance.__dna__addressof(StripColorBalance.__DNA__FIELD__lift);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_lift = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lift'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lift = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'gamma'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripColorBalance stripcolorbalance = ...;
	 * CPointer&lt;Object&gt; p = stripcolorbalance.__dna__addressof(StripColorBalance.__DNA__FIELD__gamma);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gamma = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gamma'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gamma = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'gain'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripColorBalance stripcolorbalance = ...;
	 * CPointer&lt;Object&gt; p = stripcolorbalance.__dna__addressof(StripColorBalance.__DNA__FIELD__gain);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gain = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gain'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gain = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripColorBalance stripcolorbalance = ...;
	 * CPointer&lt;Object&gt; p = stripcolorbalance.__dna__addressof(StripColorBalance.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripColorBalance stripcolorbalance = ...;
	 * CPointer&lt;Object&gt; p = stripcolorbalance.__dna__addressof(StripColorBalance.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{40, 40};

	public StripColorBalance(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected StripColorBalance(StripColorBalance that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'lift'.
	 * @see #__DNA__FIELD__lift
	 */
	
	public CArrayFacade<Float> getLift() throws IOException
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
	 * Set method for struct member 'lift'.
	 * @see #__DNA__FIELD__lift
	 */
	
	public void setLift(CArrayFacade<Float> lift) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(lift, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lift)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lift);
		} else {
			__io__generic__copy( getLift(), lift);
		}
	}

	/**
	 * Get method for struct member 'gamma'.
	 * @see #__DNA__FIELD__gamma
	 */
	
	public CArrayFacade<Float> getGamma() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gamma'.
	 * @see #__DNA__FIELD__gamma
	 */
	
	public void setGamma(CArrayFacade<Float> gamma) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(gamma, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gamma)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gamma);
		} else {
			__io__generic__copy( getGamma(), gamma);
		}
	}

	/**
	 * Get method for struct member 'gain'.
	 * @see #__DNA__FIELD__gain
	 */
	
	public CArrayFacade<Float> getGain() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gain'.
	 * @see #__DNA__FIELD__gain
	 */
	
	public void setGain(CArrayFacade<Float> gain) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(gain, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gain)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gain);
		} else {
			__io__generic__copy( getGain(), gain);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, flag);
		} else {
			__io__block.writeInt(__io__address + 36, flag);
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
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 40;
		} else {
			__dna__offset = 40;
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
	public CPointer<StripColorBalance> __io__addressof() {
		return new CPointer<StripColorBalance>(__io__address, new Class[]{StripColorBalance.class}, __io__block, __io__blockTable);
	}

}
