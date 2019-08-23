package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeColorBalance'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=80, size64=80)
public class NodeColorBalance extends CFacade {

	/**
	 * This is the sdna index of the struct NodeColorBalance.
	 * <p>
	 * It is required when allocating a new block to store data for NodeColorBalance.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 429;

	/**
	 * Field descriptor (offset) for struct member 'slope'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ASC CDL parameters </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__slope);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_slope = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slope'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slope = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'power'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__power);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_power = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'power'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__power = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'offset_basis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__offset_basis);
	 * CPointer&lt;Float&gt; p_offset_basis = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset_basis'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset_basis = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD___pad);
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

	/**
	 * Field descriptor (offset) for struct member 'lift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> LGG parameters </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__lift);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_lift = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lift'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lift = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'gamma'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__gamma);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gamma = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gamma'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gamma = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'gain'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__gain);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gain = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gain'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gain = new long[]{68, 68};

	public NodeColorBalance(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeColorBalance(NodeColorBalance that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'slope'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ASC CDL parameters </p>
	 * @see #__DNA__FIELD__slope
	 */
	
	public CArrayFacade<Float> getSlope() throws IOException
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
	 * Set method for struct member 'slope'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ASC CDL parameters </p>
	 * @see #__DNA__FIELD__slope
	 */
	
	public void setSlope(CArrayFacade<Float> slope) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
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
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 12;
		} else {
			__dna__offset = 12;
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
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
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
	 * Get method for struct member 'offset_basis'.
	 * @see #__DNA__FIELD__offset_basis
	 */
	
	public float getOffset_basis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'offset_basis'.
	 * @see #__DNA__FIELD__offset_basis
	 */
	
	public void setOffset_basis(float offset_basis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, offset_basis);
		} else {
			__io__block.writeFloat(__io__address + 36, offset_basis);
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
	 * Get method for struct member 'lift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> LGG parameters </p>
	 * @see #__DNA__FIELD__lift
	 */
	
	public CArrayFacade<Float> getLift() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> LGG parameters </p>
	 * @see #__DNA__FIELD__lift
	 */
	
	public void setLift(CArrayFacade<Float> lift) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 44;
		} else {
			__dna__offset = 44;
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
			return new CArrayFacade<Float>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 56;
		} else {
			__dna__offset = 56;
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
			return new CArrayFacade<Float>(__io__address + 68, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 68, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 68;
		} else {
			__dna__offset = 68;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeColorBalance> __io__addressof() {
		return new CPointer<NodeColorBalance>(__io__address, new Class[]{NodeColorBalance.class}, __io__block, __io__blockTable);
	}

}
