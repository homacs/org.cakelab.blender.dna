package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bConstraintActuator'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=128, size64=128)
public class bConstraintActuator extends CFacade {

	/**
	 * This is the sdna index of the struct bConstraintActuator.
	 * <p>
	 * It is required when allocating a new block to store data for bConstraintActuator.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 326;

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintActuator bconstraintactuator = ...;
	 * CPointer&lt;Object&gt; p = bconstraintactuator.__dna__addressof(bConstraintActuator.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintActuator bconstraintactuator = ...;
	 * CPointer&lt;Object&gt; p = bconstraintactuator.__dna__addressof(bConstraintActuator.__DNA__FIELD__mode);
	 * CPointer&lt;Short&gt; p_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintActuator bconstraintactuator = ...;
	 * CPointer&lt;Object&gt; p = bconstraintactuator.__dna__addressof(bConstraintActuator.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'damp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintActuator bconstraintactuator = ...;
	 * CPointer&lt;Object&gt; p = bconstraintactuator.__dna__addressof(bConstraintActuator.__DNA__FIELD__damp);
	 * CPointer&lt;Short&gt; p_damp = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'damp'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__damp = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'time'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintActuator bconstraintactuator = ...;
	 * CPointer&lt;Object&gt; p = bconstraintactuator.__dna__addressof(bConstraintActuator.__DNA__FIELD__time);
	 * CPointer&lt;Short&gt; p_time = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'rotdamp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintActuator bconstraintactuator = ...;
	 * CPointer&lt;Object&gt; p = bconstraintactuator.__dna__addressof(bConstraintActuator.__DNA__FIELD__rotdamp);
	 * CPointer&lt;Short&gt; p_rotdamp = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotdamp'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotdamp = new long[]{10, 10};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintActuator bconstraintactuator = ...;
	 * CPointer&lt;Object&gt; p = bconstraintactuator.__dna__addressof(bConstraintActuator.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'minloc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintActuator bconstraintactuator = ...;
	 * CPointer&lt;Object&gt; p = bconstraintactuator.__dna__addressof(bConstraintActuator.__DNA__FIELD__minloc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_minloc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minloc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minloc = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'maxloc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintActuator bconstraintactuator = ...;
	 * CPointer&lt;Object&gt; p = bconstraintactuator.__dna__addressof(bConstraintActuator.__DNA__FIELD__maxloc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_maxloc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxloc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxloc = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'minrot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintActuator bconstraintactuator = ...;
	 * CPointer&lt;Object&gt; p = bconstraintactuator.__dna__addressof(bConstraintActuator.__DNA__FIELD__minrot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_minrot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minrot'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minrot = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'maxrot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintActuator bconstraintactuator = ...;
	 * CPointer&lt;Object&gt; p = bconstraintactuator.__dna__addressof(bConstraintActuator.__DNA__FIELD__maxrot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_maxrot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxrot'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxrot = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'matprop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintActuator bconstraintactuator = ...;
	 * CPointer&lt;Object&gt; p = bconstraintactuator.__dna__addressof(bConstraintActuator.__DNA__FIELD__matprop);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_matprop = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'matprop'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__matprop = new long[]{64, 64};

	public bConstraintActuator(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bConstraintActuator(bConstraintActuator that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, type);
		} else {
			__io__block.writeShort(__io__address + 0, type);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public short getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(short mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, mode);
		} else {
			__io__block.writeShort(__io__address + 2, mode);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, flag);
		} else {
			__io__block.writeShort(__io__address + 4, flag);
		}
	}

	/**
	 * Get method for struct member 'damp'.
	 * @see #__DNA__FIELD__damp
	 */
	
	public short getDamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'damp'.
	 * @see #__DNA__FIELD__damp
	 */
	
	public void setDamp(short damp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, damp);
		} else {
			__io__block.writeShort(__io__address + 6, damp);
		}
	}

	/**
	 * Get method for struct member 'time'.
	 * @see #__DNA__FIELD__time
	 */
	
	public short getTime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'time'.
	 * @see #__DNA__FIELD__time
	 */
	
	public void setTime(short time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, time);
		} else {
			__io__block.writeShort(__io__address + 8, time);
		}
	}

	/**
	 * Get method for struct member 'rotdamp'.
	 * @see #__DNA__FIELD__rotdamp
	 */
	
	public short getRotdamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'rotdamp'.
	 * @see #__DNA__FIELD__rotdamp
	 */
	
	public void setRotdamp(short rotdamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10, rotdamp);
		} else {
			__io__block.writeShort(__io__address + 10, rotdamp);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, pad);
		} else {
			__io__block.writeInt(__io__address + 12, pad);
		}
	}

	/**
	 * Get method for struct member 'minloc'.
	 * @see #__DNA__FIELD__minloc
	 */
	
	public CArrayFacade<Float> getMinloc() throws IOException
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
	 * Set method for struct member 'minloc'.
	 * @see #__DNA__FIELD__minloc
	 */
	
	public void setMinloc(CArrayFacade<Float> minloc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(minloc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, minloc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, minloc);
		} else {
			__io__generic__copy( getMinloc(), minloc);
		}
	}

	/**
	 * Get method for struct member 'maxloc'.
	 * @see #__DNA__FIELD__maxloc
	 */
	
	public CArrayFacade<Float> getMaxloc() throws IOException
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
	 * Set method for struct member 'maxloc'.
	 * @see #__DNA__FIELD__maxloc
	 */
	
	public void setMaxloc(CArrayFacade<Float> maxloc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 28;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(maxloc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, maxloc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, maxloc);
		} else {
			__io__generic__copy( getMaxloc(), maxloc);
		}
	}

	/**
	 * Get method for struct member 'minrot'.
	 * @see #__DNA__FIELD__minrot
	 */
	
	public CArrayFacade<Float> getMinrot() throws IOException
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
	 * Set method for struct member 'minrot'.
	 * @see #__DNA__FIELD__minrot
	 */
	
	public void setMinrot(CArrayFacade<Float> minrot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(minrot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, minrot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, minrot);
		} else {
			__io__generic__copy( getMinrot(), minrot);
		}
	}

	/**
	 * Get method for struct member 'maxrot'.
	 * @see #__DNA__FIELD__maxrot
	 */
	
	public CArrayFacade<Float> getMaxrot() throws IOException
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
	 * Set method for struct member 'maxrot'.
	 * @see #__DNA__FIELD__maxrot
	 */
	
	public void setMaxrot(CArrayFacade<Float> maxrot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 52;
		} else {
			__dna__offset = 52;
		}
		if (__io__equals(maxrot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, maxrot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, maxrot);
		} else {
			__io__generic__copy( getMaxrot(), maxrot);
		}
	}

	/**
	 * Get method for struct member 'matprop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__matprop
	 */
	
	public CArrayFacade<Byte> getMatprop() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'matprop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__matprop
	 */
	
	public void setMatprop(CArrayFacade<Byte> matprop) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(matprop, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, matprop)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, matprop);
		} else {
			__io__generic__copy( getMatprop(), matprop);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bConstraintActuator> __io__addressof() {
		return new CPointer<bConstraintActuator>(__io__address, new Class[]{bConstraintActuator.class}, __io__block, __io__blockTable);
	}

}
