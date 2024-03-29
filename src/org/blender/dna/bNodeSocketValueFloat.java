package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bNodeSocketValueFloat'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=16, size64=16)
public class bNodeSocketValueFloat extends CFacade {

	/**
	 * This is the sdna index of the struct bNodeSocketValueFloat.
	 * <p>
	 * It is required when allocating a new block to store data for bNodeSocketValueFloat.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 404;

	/**
	 * Field descriptor (offset) for struct member 'subtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> RNA subtype. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocketValueFloat bnodesocketvaluefloat = ...;
	 * CPointer&lt;Object&gt; p = bnodesocketvaluefloat.__dna__addressof(bNodeSocketValueFloat.__DNA__FIELD__subtype);
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
	 * bNodeSocketValueFloat bnodesocketvaluefloat = ...;
	 * CPointer&lt;Object&gt; p = bnodesocketvaluefloat.__dna__addressof(bNodeSocketValueFloat.__DNA__FIELD__value);
	 * CPointer&lt;Float&gt; p_value = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
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
	 * bNodeSocketValueFloat bnodesocketvaluefloat = ...;
	 * CPointer&lt;Object&gt; p = bnodesocketvaluefloat.__dna__addressof(bNodeSocketValueFloat.__DNA__FIELD__min);
	 * CPointer&lt;Float&gt; p_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'max'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNodeSocketValueFloat bnodesocketvaluefloat = ...;
	 * CPointer&lt;Object&gt; p = bnodesocketvaluefloat.__dna__addressof(bNodeSocketValueFloat.__DNA__FIELD__max);
	 * CPointer&lt;Float&gt; p_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max = new long[]{12, 12};

	public bNodeSocketValueFloat(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bNodeSocketValueFloat(bNodeSocketValueFloat that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'subtype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	
	public float getValue() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'value'.
	 * @see #__DNA__FIELD__value
	 */
	
	public void setValue(float value) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, value);
		} else {
			__io__block.writeFloat(__io__address + 4, value);
		}
	}

	/**
	 * Get method for struct member 'min'.
	 * @see #__DNA__FIELD__min
	 */
	
	public float getMin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'min'.
	 * @see #__DNA__FIELD__min
	 */
	
	public void setMin(float min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, min);
		} else {
			__io__block.writeFloat(__io__address + 8, min);
		}
	}

	/**
	 * Get method for struct member 'max'.
	 * @see #__DNA__FIELD__max
	 */
	
	public float getMax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'max'.
	 * @see #__DNA__FIELD__max
	 */
	
	public void setMax(float max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, max);
		} else {
			__io__block.writeFloat(__io__address + 12, max);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bNodeSocketValueFloat> __io__addressof() {
		return new CPointer<bNodeSocketValueFloat>(__io__address, new Class[]{bNodeSocketValueFloat.class}, __io__block, __io__blockTable);
	}

}
