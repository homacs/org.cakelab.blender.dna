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
 * Generated facet for DNA struct type 'StripColorBalance'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=84, size64=84)
public class StripColorBalance extends CFacade {

	/**
	 * This is the sdna index of the struct StripColorBalance.
	 * <p>
	 * It is required when allocating a new block to store data for StripColorBalance.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 630;

	/**
	 * Field descriptor (offset) for struct member 'method'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripColorBalance stripcolorbalance = ...;
	 * CPointer&lt;Object&gt; p = stripcolorbalance.__dna__addressof(StripColorBalance.__DNA__FIELD__method);
	 * CPointer&lt;Integer&gt; p_method = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'method'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__method = new long[]{0, 0};

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
	public static final long[] __DNA__FIELD__lift = new long[]{4, 4};

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
	public static final long[] __DNA__FIELD__gamma = new long[]{16, 16};

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
	public static final long[] __DNA__FIELD__gain = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'slope'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripColorBalance stripcolorbalance = ...;
	 * CPointer&lt;Object&gt; p = stripcolorbalance.__dna__addressof(StripColorBalance.__DNA__FIELD__slope);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_slope = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slope'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slope = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripColorBalance stripcolorbalance = ...;
	 * CPointer&lt;Object&gt; p = stripcolorbalance.__dna__addressof(StripColorBalance.__DNA__FIELD__offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'power'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * StripColorBalance stripcolorbalance = ...;
	 * CPointer&lt;Object&gt; p = stripcolorbalance.__dna__addressof(StripColorBalance.__DNA__FIELD__power);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_power = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'power'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__power = new long[]{64, 64};

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
	public static final long[] __DNA__FIELD__flag = new long[]{76, 76};

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
	public static final long[] __DNA__FIELD___pad = new long[]{80, 80};

	public StripColorBalance(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected StripColorBalance(StripColorBalance that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'method'.
	 * @see #__DNA__FIELD__method
	 */
	
	public int getMethod() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'method'.
	 * @see #__DNA__FIELD__method
	 */
	
	public void setMethod(int method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, method);
		} else {
			__io__block.writeInt(__io__address + 0, method);
		}
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
			return new CArrayFacade<Float>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
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
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
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
			return new CArrayFacade<Float>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 28;
		} else {
			__dna__offset = 28;
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
	 * Get method for struct member 'slope'.
	 * @see #__DNA__FIELD__slope
	 */
	
	public CArrayFacade<Float> getSlope() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'slope'.
	 * @see #__DNA__FIELD__slope
	 */
	
	public void setSlope(CArrayFacade<Float> slope) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(slope, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, slope)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, slope);
		} else {
			__io__generic__copy( getSlope(), slope);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public CArrayFacade<Float> getOffset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 52, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 52, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(CArrayFacade<Float> offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 52;
		} else {
			__dna__offset = 52;
		}
		if (__io__equals(offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, offset);
		} else {
			__io__generic__copy( getOffset(), offset);
		}
	}

	/**
	 * Get method for struct member 'power'.
	 * @see #__DNA__FIELD__power
	 */
	
	public CArrayFacade<Float> getPower() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'power'.
	 * @see #__DNA__FIELD__power
	 */
	
	public void setPower(CArrayFacade<Float> power) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(power, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, power)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, power);
		} else {
			__io__generic__copy( getPower(), power);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 76);
		} else {
			return __io__block.readInt(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 76, flag);
		} else {
			__io__block.writeInt(__io__address + 76, flag);
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
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 80;
		} else {
			__dna__offset = 80;
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
