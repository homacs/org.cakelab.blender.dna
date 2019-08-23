package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'DriverVar'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Driver Variable (dvar)</p><p> A 'variable' for use as an input for the driver evaluation. Defines a way of accessing some channel to use, that can be referred to in the expression as a variable, thus simplifying expressions and also Depsgraph building. </p>
 */

@CMetaData(size32=720, size64=792)
public class DriverVar extends CFacade {

	/**
	 * This is the sdna index of the struct DriverVar.
	 * <p>
	 * It is required when allocating a new block to store data for DriverVar.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 524;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DriverVar drivervar = ...;
	 * CPointer&lt;Object&gt; p = drivervar.__dna__addressof(DriverVar.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;DriverVar&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, DriverVar.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'DriverVar*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DriverVar drivervar = ...;
	 * CPointer&lt;Object&gt; p = drivervar.__dna__addressof(DriverVar.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;DriverVar&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, DriverVar.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'DriverVar*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the variable to use in py-expression (must be valid python identifier) - MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DriverVar drivervar = ...;
	 * CPointer&lt;Object&gt; p = drivervar.__dna__addressof(DriverVar.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'targets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_DRIVER_TARGETS, target slots. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DriverVar drivervar = ...;
	 * CPointer&lt;Object&gt; p = drivervar.__dna__addressof(DriverVar.__DNA__FIELD__targets);
	 * CPointer&lt;CArrayFacade&lt;DriverTarget&gt;&gt; p_targets = p.cast(new Class[]{CArrayFacade.class, DriverTarget.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'targets'</li>
	 * <li>Signature: 'DriverTarget[8]'</li>
	 * <li>Actual Size (32bit/64bit): 640/704</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__targets = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'num_targets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of targets actually used by this variable. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DriverVar drivervar = ...;
	 * CPointer&lt;Object&gt; p = drivervar.__dna__addressof(DriverVar.__DNA__FIELD__num_targets);
	 * CPointer&lt;Byte&gt; p_num_targets = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'num_targets'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__num_targets = new long[]{712, 784};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Type of driver variable (eDriverVar_Types). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DriverVar drivervar = ...;
	 * CPointer&lt;Object&gt; p = drivervar.__dna__addressof(DriverVar.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{713, 785};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Validation tags, etc. (eDriverVar_Flags). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DriverVar drivervar = ...;
	 * CPointer&lt;Object&gt; p = drivervar.__dna__addressof(DriverVar.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{714, 786};

	/**
	 * Field descriptor (offset) for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Result of previous evaluation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DriverVar drivervar = ...;
	 * CPointer&lt;Object&gt; p = drivervar.__dna__addressof(DriverVar.__DNA__FIELD__curval);
	 * CPointer&lt;Float&gt; p_curval = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curval'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curval = new long[]{716, 788};

	public DriverVar(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected DriverVar(DriverVar that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<DriverVar> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{DriverVar.class};
		return new CPointer<DriverVar>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, DriverVar.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<DriverVar> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<DriverVar> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{DriverVar.class};
		return new CPointer<DriverVar>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, DriverVar.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<DriverVar> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the variable to use in py-expression (must be valid python identifier) - MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the variable to use in py-expression (must be valid python identifier) - MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'targets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_DRIVER_TARGETS, target slots. </p>
	 * @see #__DNA__FIELD__targets
	 */
	
	public CArrayFacade<DriverTarget> getTargets() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{DriverTarget.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<DriverTarget>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<DriverTarget>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'targets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_DRIVER_TARGETS, target slots. </p>
	 * @see #__DNA__FIELD__targets
	 */
	
	public void setTargets(CArrayFacade<DriverTarget> targets) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(targets, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, targets)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, targets);
		} else {
			__io__generic__copy( getTargets(), targets);
		}
	}

	/**
	 * Get method for struct member 'num_targets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of targets actually used by this variable. </p>
	 * @see #__DNA__FIELD__num_targets
	 */
	
	public byte getNum_targets() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 784);
		} else {
			return __io__block.readByte(__io__address + 712);
		}
	}

	/**
	 * Set method for struct member 'num_targets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of targets actually used by this variable. </p>
	 * @see #__DNA__FIELD__num_targets
	 */
	
	public void setNum_targets(byte num_targets) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 784, num_targets);
		} else {
			__io__block.writeByte(__io__address + 712, num_targets);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Type of driver variable (eDriverVar_Types). </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 785);
		} else {
			return __io__block.readByte(__io__address + 713);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Type of driver variable (eDriverVar_Types). </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 785, type);
		} else {
			__io__block.writeByte(__io__address + 713, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Validation tags, etc. (eDriverVar_Flags). </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 786);
		} else {
			return __io__block.readShort(__io__address + 714);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Validation tags, etc. (eDriverVar_Flags). </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 786, flag);
		} else {
			__io__block.writeShort(__io__address + 714, flag);
		}
	}

	/**
	 * Get method for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Result of previous evaluation. </p>
	 * @see #__DNA__FIELD__curval
	 */
	
	public float getCurval() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 788);
		} else {
			return __io__block.readFloat(__io__address + 716);
		}
	}

	/**
	 * Set method for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Result of previous evaluation. </p>
	 * @see #__DNA__FIELD__curval
	 */
	
	public void setCurval(float curval) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 788, curval);
		} else {
			__io__block.writeFloat(__io__address + 716, curval);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<DriverVar> __io__addressof() {
		return new CPointer<DriverVar>(__io__address, new Class[]{DriverVar.class}, __io__block, __io__blockTable);
	}

}
