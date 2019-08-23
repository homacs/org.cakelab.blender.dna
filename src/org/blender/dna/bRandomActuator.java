package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bRandomActuator'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> I added a few extra fields here, to facilitate conversions </p>
 */

@CMetaData(size32=88, size64=88)
public class bRandomActuator extends CFacade {

	/**
	 * This is the sdna index of the struct bRandomActuator.
	 * <p>
	 * It is required when allocating a new block to store data for bRandomActuator.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 328;

	/**
	 * Field descriptor (offset) for struct member 'seed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRandomActuator brandomactuator = ...;
	 * CPointer&lt;Object&gt; p = brandomactuator.__dna__addressof(bRandomActuator.__DNA__FIELD__seed);
	 * CPointer&lt;Integer&gt; p_seed = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seed'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seed = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'distribution'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRandomActuator brandomactuator = ...;
	 * CPointer&lt;Object&gt; p = brandomactuator.__dna__addressof(bRandomActuator.__DNA__FIELD__distribution);
	 * CPointer&lt;Integer&gt; p_distribution = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distribution'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distribution = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'int_arg_1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRandomActuator brandomactuator = ...;
	 * CPointer&lt;Object&gt; p = brandomactuator.__dna__addressof(bRandomActuator.__DNA__FIELD__int_arg_1);
	 * CPointer&lt;Integer&gt; p_int_arg_1 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'int_arg_1'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__int_arg_1 = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'int_arg_2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRandomActuator brandomactuator = ...;
	 * CPointer&lt;Object&gt; p = brandomactuator.__dna__addressof(bRandomActuator.__DNA__FIELD__int_arg_2);
	 * CPointer&lt;Integer&gt; p_int_arg_2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'int_arg_2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__int_arg_2 = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'float_arg_1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRandomActuator brandomactuator = ...;
	 * CPointer&lt;Object&gt; p = brandomactuator.__dna__addressof(bRandomActuator.__DNA__FIELD__float_arg_1);
	 * CPointer&lt;Float&gt; p_float_arg_1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'float_arg_1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__float_arg_1 = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'float_arg_2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRandomActuator brandomactuator = ...;
	 * CPointer&lt;Object&gt; p = brandomactuator.__dna__addressof(bRandomActuator.__DNA__FIELD__float_arg_2);
	 * CPointer&lt;Float&gt; p_float_arg_2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'float_arg_2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__float_arg_2 = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'propname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRandomActuator brandomactuator = ...;
	 * CPointer&lt;Object&gt; p = brandomactuator.__dna__addressof(bRandomActuator.__DNA__FIELD__propname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_propname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'propname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__propname = new long[]{24, 24};

	public bRandomActuator(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bRandomActuator(bRandomActuator that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'seed'.
	 * @see #__DNA__FIELD__seed
	 */
	
	public int getSeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'seed'.
	 * @see #__DNA__FIELD__seed
	 */
	
	public void setSeed(int seed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, seed);
		} else {
			__io__block.writeInt(__io__address + 0, seed);
		}
	}

	/**
	 * Get method for struct member 'distribution'.
	 * @see #__DNA__FIELD__distribution
	 */
	
	public int getDistribution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'distribution'.
	 * @see #__DNA__FIELD__distribution
	 */
	
	public void setDistribution(int distribution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, distribution);
		} else {
			__io__block.writeInt(__io__address + 4, distribution);
		}
	}

	/**
	 * Get method for struct member 'int_arg_1'.
	 * @see #__DNA__FIELD__int_arg_1
	 */
	
	public int getInt_arg_1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'int_arg_1'.
	 * @see #__DNA__FIELD__int_arg_1
	 */
	
	public void setInt_arg_1(int int_arg_1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, int_arg_1);
		} else {
			__io__block.writeInt(__io__address + 8, int_arg_1);
		}
	}

	/**
	 * Get method for struct member 'int_arg_2'.
	 * @see #__DNA__FIELD__int_arg_2
	 */
	
	public int getInt_arg_2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'int_arg_2'.
	 * @see #__DNA__FIELD__int_arg_2
	 */
	
	public void setInt_arg_2(int int_arg_2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, int_arg_2);
		} else {
			__io__block.writeInt(__io__address + 12, int_arg_2);
		}
	}

	/**
	 * Get method for struct member 'float_arg_1'.
	 * @see #__DNA__FIELD__float_arg_1
	 */
	
	public float getFloat_arg_1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'float_arg_1'.
	 * @see #__DNA__FIELD__float_arg_1
	 */
	
	public void setFloat_arg_1(float float_arg_1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, float_arg_1);
		} else {
			__io__block.writeFloat(__io__address + 16, float_arg_1);
		}
	}

	/**
	 * Get method for struct member 'float_arg_2'.
	 * @see #__DNA__FIELD__float_arg_2
	 */
	
	public float getFloat_arg_2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'float_arg_2'.
	 * @see #__DNA__FIELD__float_arg_2
	 */
	
	public void setFloat_arg_2(float float_arg_2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, float_arg_2);
		} else {
			__io__block.writeFloat(__io__address + 20, float_arg_2);
		}
	}

	/**
	 * Get method for struct member 'propname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__propname
	 */
	
	public CArrayFacade<Byte> getPropname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'propname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__propname
	 */
	
	public void setPropname(CArrayFacade<Byte> propname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(propname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, propname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, propname);
		} else {
			__io__generic__copy( getPropname(), propname);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bRandomActuator> __io__addressof() {
		return new CPointer<bRandomActuator>(__io__address, new Class[]{bRandomActuator.class}, __io__block, __io__blockTable);
	}

}
