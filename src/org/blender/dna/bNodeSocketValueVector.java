package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bNodeSocketValueVector'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=24, size64=24)
public class bNodeSocketValueVector extends CFacade {

	/**
	 * This is the sdna index of the struct bNodeSocketValueVector.
	 * <p>
	 * It is required when allocating a new block to store data for bNodeSocketValueVector.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 409;

	/**
	 * Field descriptor (offset) for struct member 'subtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA subtype. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocketValueVector bnodesocketvaluevector = ...;
	 * CPointer&lt;Object&gt; p = bnodesocketvaluevector.__dna__addressof(bNodeSocketValueVector.__DNA__FIELD__subtype);
	 * CPointer&lt;Integer&gt; p_subtype = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subtype'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subtype = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'value'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocketValueVector bnodesocketvaluevector = ...;
	 * CPointer&lt;Object&gt; p = bnodesocketvaluevector.__dna__addressof(bNodeSocketValueVector.__DNA__FIELD__value);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_value = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'min'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocketValueVector bnodesocketvaluevector = ...;
	 * CPointer&lt;Object&gt; p = bnodesocketvaluevector.__dna__addressof(bNodeSocketValueVector.__DNA__FIELD__min);
	 * CPointer&lt;Float&gt; p_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'max'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocketValueVector bnodesocketvaluevector = ...;
	 * CPointer&lt;Object&gt; p = bnodesocketvaluevector.__dna__addressof(bNodeSocketValueVector.__DNA__FIELD__max);
	 * CPointer&lt;Float&gt; p_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max = new long[]{20, 20};

	public bNodeSocketValueVector(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bNodeSocketValueVector(bNodeSocketValueVector that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'subtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA subtype. </p>
	 * @see #__DNA__FIELD__subtype
	 */
	
	public int getSubtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'subtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA subtype. </p>
	 * @see #__DNA__FIELD__subtype
	 */
	
	public void setSubtype(int subtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, subtype);
		} else {
			__io__block.writeInt(__io__address + 0, subtype);
		}
	}

	/**
	 * Get method for struct member 'value'.
	 * @see #__DNA__FIELD__value
	 */
	
	public CArrayFacade<Float> getValue() throws IOException
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
	 * Set method for struct member 'value'.
	 * @see #__DNA__FIELD__value
	 */
	
	public void setValue(CArrayFacade<Float> value) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(value, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, value)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, value);
		} else {
			__io__generic__copy( getValue(), value);
		}
	}

	/**
	 * Get method for struct member 'min'.
	 * @see #__DNA__FIELD__min
	 */
	
	public float getMin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'min'.
	 * @see #__DNA__FIELD__min
	 */
	
	public void setMin(float min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, min);
		} else {
			__io__block.writeFloat(__io__address + 16, min);
		}
	}

	/**
	 * Get method for struct member 'max'.
	 * @see #__DNA__FIELD__max
	 */
	
	public float getMax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'max'.
	 * @see #__DNA__FIELD__max
	 */
	
	public void setMax(float max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, max);
		} else {
			__io__block.writeFloat(__io__address + 20, max);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bNodeSocketValueVector> __io__addressof() {
		return new CPointer<bNodeSocketValueVector>(__io__address, new Class[]{bNodeSocketValueVector.class}, __io__block, __io__blockTable);
	}

}
