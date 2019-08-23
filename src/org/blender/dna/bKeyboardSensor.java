package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bKeyboardSensor'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=136, size64=136)
public class bKeyboardSensor extends CFacade {

	/**
	 * This is the sdna index of the struct bKeyboardSensor.
	 * <p>
	 * It is required when allocating a new block to store data for bKeyboardSensor.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 297;

	/**
	 * Field descriptor (offset) for struct member 'key'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKeyboardSensor bkeyboardsensor = ...;
	 * CPointer&lt;Object&gt; p = bkeyboardsensor.__dna__addressof(bKeyboardSensor.__DNA__FIELD__key);
	 * CPointer&lt;Short&gt; p_key = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'key'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__key = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'qual'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKeyboardSensor bkeyboardsensor = ...;
	 * CPointer&lt;Object&gt; p = bkeyboardsensor.__dna__addressof(bKeyboardSensor.__DNA__FIELD__qual);
	 * CPointer&lt;Short&gt; p_qual = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'qual'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__qual = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKeyboardSensor bkeyboardsensor = ...;
	 * CPointer&lt;Object&gt; p = bkeyboardsensor.__dna__addressof(bKeyboardSensor.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'qual2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKeyboardSensor bkeyboardsensor = ...;
	 * CPointer&lt;Object&gt; p = bkeyboardsensor.__dna__addressof(bKeyboardSensor.__DNA__FIELD__qual2);
	 * CPointer&lt;Short&gt; p_qual2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'qual2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__qual2 = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'targetName'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the target propertyMAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKeyboardSensor bkeyboardsensor = ...;
	 * CPointer&lt;Object&gt; p = bkeyboardsensor.__dna__addressof(bKeyboardSensor.__DNA__FIELD__targetName);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_targetName = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'targetName'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__targetName = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'toggleName'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the toggle propertyMAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bKeyboardSensor bkeyboardsensor = ...;
	 * CPointer&lt;Object&gt; p = bkeyboardsensor.__dna__addressof(bKeyboardSensor.__DNA__FIELD__toggleName);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_toggleName = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'toggleName'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__toggleName = new long[]{72, 72};

	public bKeyboardSensor(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bKeyboardSensor(bKeyboardSensor that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'key'.
	 * @see #__DNA__FIELD__key
	 */
	
	public short getKey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'key'.
	 * @see #__DNA__FIELD__key
	 */
	
	public void setKey(short key) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, key);
		} else {
			__io__block.writeShort(__io__address + 0, key);
		}
	}

	/**
	 * Get method for struct member 'qual'.
	 * @see #__DNA__FIELD__qual
	 */
	
	public short getQual() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'qual'.
	 * @see #__DNA__FIELD__qual
	 */
	
	public void setQual(short qual) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, qual);
		} else {
			__io__block.writeShort(__io__address + 2, qual);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, type);
		} else {
			__io__block.writeShort(__io__address + 4, type);
		}
	}

	/**
	 * Get method for struct member 'qual2'.
	 * @see #__DNA__FIELD__qual2
	 */
	
	public short getQual2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'qual2'.
	 * @see #__DNA__FIELD__qual2
	 */
	
	public void setQual2(short qual2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, qual2);
		} else {
			__io__block.writeShort(__io__address + 6, qual2);
		}
	}

	/**
	 * Get method for struct member 'targetName'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the target propertyMAX_NAME </p>
	 * @see #__DNA__FIELD__targetName
	 */
	
	public CArrayFacade<Byte> getTargetName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'targetName'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the target propertyMAX_NAME </p>
	 * @see #__DNA__FIELD__targetName
	 */
	
	public void setTargetName(CArrayFacade<Byte> targetName) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(targetName, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, targetName)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, targetName);
		} else {
			__io__generic__copy( getTargetName(), targetName);
		}
	}

	/**
	 * Get method for struct member 'toggleName'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the toggle propertyMAX_NAME </p>
	 * @see #__DNA__FIELD__toggleName
	 */
	
	public CArrayFacade<Byte> getToggleName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'toggleName'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the toggle propertyMAX_NAME </p>
	 * @see #__DNA__FIELD__toggleName
	 */
	
	public void setToggleName(CArrayFacade<Byte> toggleName) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(toggleName, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, toggleName)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, toggleName);
		} else {
			__io__generic__copy( getToggleName(), toggleName);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bKeyboardSensor> __io__addressof() {
		return new CPointer<bKeyboardSensor>(__io__address, new Class[]{bKeyboardSensor.class}, __io__block, __io__blockTable);
	}

}
