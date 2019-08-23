package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bObjectActuator'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=108, size64=112)
public class bObjectActuator extends CFacade {

	/**
	 * This is the sdna index of the struct bObjectActuator.
	 * <p>
	 * It is required when allocating a new block to store data for bObjectActuator.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 319;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectActuator bobjectactuator = ...;
	 * CPointer&lt;Object&gt; p = bobjectactuator.__dna__addressof(bObjectActuator.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectActuator bobjectactuator = ...;
	 * CPointer&lt;Object&gt; p = bobjectactuator.__dna__addressof(bObjectActuator.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'otype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectActuator bobjectactuator = ...;
	 * CPointer&lt;Object&gt; p = bobjectactuator.__dna__addressof(bObjectActuator.__DNA__FIELD__otype);
	 * CPointer&lt;Short&gt; p_otype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'otype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__otype = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'damping'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectActuator bobjectactuator = ...;
	 * CPointer&lt;Object&gt; p = bobjectactuator.__dna__addressof(bObjectActuator.__DNA__FIELD__damping);
	 * CPointer&lt;Short&gt; p_damping = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'damping'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__damping = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'forceloc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectActuator bobjectactuator = ...;
	 * CPointer&lt;Object&gt; p = bobjectactuator.__dna__addressof(bObjectActuator.__DNA__FIELD__forceloc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_forceloc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'forceloc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__forceloc = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'forcerot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectActuator bobjectactuator = ...;
	 * CPointer&lt;Object&gt; p = bobjectactuator.__dna__addressof(bObjectActuator.__DNA__FIELD__forcerot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_forcerot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'forcerot'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__forcerot = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectActuator bobjectactuator = ...;
	 * CPointer&lt;Object&gt; p = bobjectactuator.__dna__addressof(bObjectActuator.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectActuator bobjectactuator = ...;
	 * CPointer&lt;Object&gt; p = bobjectactuator.__dna__addressof(bObjectActuator.__DNA__FIELD__pad1);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_pad1 = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad1'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad1 = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'dloc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectActuator bobjectactuator = ...;
	 * CPointer&lt;Object&gt; p = bobjectactuator.__dna__addressof(bObjectActuator.__DNA__FIELD__dloc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_dloc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dloc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dloc = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'drot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angle in radians </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectActuator bobjectactuator = ...;
	 * CPointer&lt;Object&gt; p = bobjectactuator.__dna__addressof(bObjectActuator.__DNA__FIELD__drot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_drot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drot'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drot = new long[]{68, 68};

	/**
	 * Field descriptor (offset) for struct member 'linearvelocity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectActuator bobjectactuator = ...;
	 * CPointer&lt;Object&gt; p = bobjectactuator.__dna__addressof(bObjectActuator.__DNA__FIELD__linearvelocity);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_linearvelocity = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'linearvelocity'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__linearvelocity = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'angularvelocity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectActuator bobjectactuator = ...;
	 * CPointer&lt;Object&gt; p = bobjectactuator.__dna__addressof(bObjectActuator.__DNA__FIELD__angularvelocity);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_angularvelocity = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angularvelocity'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angularvelocity = new long[]{92, 92};

	/**
	 * Field descriptor (offset) for struct member 'reference'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bObjectActuator bobjectactuator = ...;
	 * CPointer&lt;Object&gt; p = bobjectactuator.__dna__addressof(bObjectActuator.__DNA__FIELD__reference);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_reference = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reference'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reference = new long[]{104, 104};

	public bObjectActuator(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bObjectActuator(bObjectActuator that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, flag);
		} else {
			__io__block.writeShort(__io__address + 0, flag);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, type);
		} else {
			__io__block.writeShort(__io__address + 2, type);
		}
	}

	/**
	 * Get method for struct member 'otype'.
	 * @see #__DNA__FIELD__otype
	 */
	
	public short getOtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'otype'.
	 * @see #__DNA__FIELD__otype
	 */
	
	public void setOtype(short otype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, otype);
		} else {
			__io__block.writeShort(__io__address + 4, otype);
		}
	}

	/**
	 * Get method for struct member 'damping'.
	 * @see #__DNA__FIELD__damping
	 */
	
	public short getDamping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'damping'.
	 * @see #__DNA__FIELD__damping
	 */
	
	public void setDamping(short damping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, damping);
		} else {
			__io__block.writeShort(__io__address + 6, damping);
		}
	}

	/**
	 * Get method for struct member 'forceloc'.
	 * @see #__DNA__FIELD__forceloc
	 */
	
	public CArrayFacade<Float> getForceloc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'forceloc'.
	 * @see #__DNA__FIELD__forceloc
	 */
	
	public void setForceloc(CArrayFacade<Float> forceloc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(forceloc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, forceloc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, forceloc);
		} else {
			__io__generic__copy( getForceloc(), forceloc);
		}
	}

	/**
	 * Get method for struct member 'forcerot'.
	 * @see #__DNA__FIELD__forcerot
	 */
	
	public CArrayFacade<Float> getForcerot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'forcerot'.
	 * @see #__DNA__FIELD__forcerot
	 */
	
	public void setForcerot(CArrayFacade<Float> forcerot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(forcerot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, forcerot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, forcerot);
		} else {
			__io__generic__copy( getForcerot(), forcerot);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Float> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Float> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
		}
	}

	/**
	 * Get method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public CArrayFacade<Float> getPad1() throws IOException
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
	 * Set method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public void setPad1(CArrayFacade<Float> pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 44;
		} else {
			__dna__offset = 44;
		}
		if (__io__equals(pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad1);
		} else {
			__io__generic__copy( getPad1(), pad1);
		}
	}

	/**
	 * Get method for struct member 'dloc'.
	 * @see #__DNA__FIELD__dloc
	 */
	
	public CArrayFacade<Float> getDloc() throws IOException
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
	 * Set method for struct member 'dloc'.
	 * @see #__DNA__FIELD__dloc
	 */
	
	public void setDloc(CArrayFacade<Float> dloc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 56;
		}
		if (__io__equals(dloc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dloc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dloc);
		} else {
			__io__generic__copy( getDloc(), dloc);
		}
	}

	/**
	 * Get method for struct member 'drot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angle in radians </p>
	 * @see #__DNA__FIELD__drot
	 */
	
	public CArrayFacade<Float> getDrot() throws IOException
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
	 * Set method for struct member 'drot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angle in radians </p>
	 * @see #__DNA__FIELD__drot
	 */
	
	public void setDrot(CArrayFacade<Float> drot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 68;
		} else {
			__dna__offset = 68;
		}
		if (__io__equals(drot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drot);
		} else {
			__io__generic__copy( getDrot(), drot);
		}
	}

	/**
	 * Get method for struct member 'linearvelocity'.
	 * @see #__DNA__FIELD__linearvelocity
	 */
	
	public CArrayFacade<Float> getLinearvelocity() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'linearvelocity'.
	 * @see #__DNA__FIELD__linearvelocity
	 */
	
	public void setLinearvelocity(CArrayFacade<Float> linearvelocity) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(linearvelocity, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, linearvelocity)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, linearvelocity);
		} else {
			__io__generic__copy( getLinearvelocity(), linearvelocity);
		}
	}

	/**
	 * Get method for struct member 'angularvelocity'.
	 * @see #__DNA__FIELD__angularvelocity
	 */
	
	public CArrayFacade<Float> getAngularvelocity() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'angularvelocity'.
	 * @see #__DNA__FIELD__angularvelocity
	 */
	
	public void setAngularvelocity(CArrayFacade<Float> angularvelocity) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 92;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(angularvelocity, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, angularvelocity)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, angularvelocity);
		} else {
			__io__generic__copy( getAngularvelocity(), angularvelocity);
		}
	}

	/**
	 * Get method for struct member 'reference'.
	 * @see #__DNA__FIELD__reference
	 */
	
	public CPointer<BlenderObject> getReference() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'reference'.
	 * @see #__DNA__FIELD__reference
	 */
	
	public void setReference(CPointer<BlenderObject> reference) throws IOException
	{
		long __address = ((reference == null) ? 0 : reference.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bObjectActuator> __io__addressof() {
		return new CPointer<bObjectActuator>(__io__address, new Class[]{bObjectActuator.class}, __io__block, __io__blockTable);
	}

}
