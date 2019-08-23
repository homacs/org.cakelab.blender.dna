package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bJoystickSensor'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=92, size64=92)
public class bJoystickSensor extends CFacade {

	/**
	 * This is the sdna index of the struct bJoystickSensor.
	 * <p>
	 * It is required when allocating a new block to store data for bJoystickSensor.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 312;

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bJoystickSensor bjoysticksensor = ...;
	 * CPointer&lt;Object&gt; p = bjoysticksensor.__dna__addressof(bJoystickSensor.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bJoystickSensor bjoysticksensor = ...;
	 * CPointer&lt;Object&gt; p = bjoysticksensor.__dna__addressof(bJoystickSensor.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'joyindex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bJoystickSensor bjoysticksensor = ...;
	 * CPointer&lt;Object&gt; p = bjoysticksensor.__dna__addressof(bJoystickSensor.__DNA__FIELD__joyindex);
	 * CPointer&lt;Byte&gt; p_joyindex = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'joyindex'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__joyindex = new long[]{65, 65};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bJoystickSensor bjoysticksensor = ...;
	 * CPointer&lt;Object&gt; p = bjoysticksensor.__dna__addressof(bJoystickSensor.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{66, 66};

	/**
	 * Field descriptor (offset) for struct member 'axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bJoystickSensor bjoysticksensor = ...;
	 * CPointer&lt;Object&gt; p = bjoysticksensor.__dna__addressof(bJoystickSensor.__DNA__FIELD__axis);
	 * CPointer&lt;Short&gt; p_axis = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axis'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axis = new long[]{68, 68};

	/**
	 * Field descriptor (offset) for struct member 'axis_single'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bJoystickSensor bjoysticksensor = ...;
	 * CPointer&lt;Object&gt; p = bjoysticksensor.__dna__addressof(bJoystickSensor.__DNA__FIELD__axis_single);
	 * CPointer&lt;Short&gt; p_axis_single = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axis_single'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axis_single = new long[]{70, 70};

	/**
	 * Field descriptor (offset) for struct member 'axisf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bJoystickSensor bjoysticksensor = ...;
	 * CPointer&lt;Object&gt; p = bjoysticksensor.__dna__addressof(bJoystickSensor.__DNA__FIELD__axisf);
	 * CPointer&lt;Integer&gt; p_axisf = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axisf'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axisf = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'button'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bJoystickSensor bjoysticksensor = ...;
	 * CPointer&lt;Object&gt; p = bjoysticksensor.__dna__addressof(bJoystickSensor.__DNA__FIELD__button);
	 * CPointer&lt;Integer&gt; p_button = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'button'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__button = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'hat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bJoystickSensor bjoysticksensor = ...;
	 * CPointer&lt;Object&gt; p = bjoysticksensor.__dna__addressof(bJoystickSensor.__DNA__FIELD__hat);
	 * CPointer&lt;Integer&gt; p_hat = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hat'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hat = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'hatf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bJoystickSensor bjoysticksensor = ...;
	 * CPointer&lt;Object&gt; p = bjoysticksensor.__dna__addressof(bJoystickSensor.__DNA__FIELD__hatf);
	 * CPointer&lt;Integer&gt; p_hatf = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hatf'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hatf = new long[]{84, 84};

	/**
	 * Field descriptor (offset) for struct member 'precision'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bJoystickSensor bjoysticksensor = ...;
	 * CPointer&lt;Object&gt; p = bjoysticksensor.__dna__addressof(bJoystickSensor.__DNA__FIELD__precision);
	 * CPointer&lt;Integer&gt; p_precision = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'precision'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__precision = new long[]{88, 88};

	public bJoystickSensor(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bJoystickSensor(bJoystickSensor that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
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
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 64);
		} else {
			return __io__block.readByte(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 64, type);
		} else {
			__io__block.writeByte(__io__address + 64, type);
		}
	}

	/**
	 * Get method for struct member 'joyindex'.
	 * @see #__DNA__FIELD__joyindex
	 */
	
	public byte getJoyindex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 65);
		} else {
			return __io__block.readByte(__io__address + 65);
		}
	}

	/**
	 * Set method for struct member 'joyindex'.
	 * @see #__DNA__FIELD__joyindex
	 */
	
	public void setJoyindex(byte joyindex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 65, joyindex);
		} else {
			__io__block.writeByte(__io__address + 65, joyindex);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 66);
		} else {
			return __io__block.readShort(__io__address + 66);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 66, flag);
		} else {
			__io__block.writeShort(__io__address + 66, flag);
		}
	}

	/**
	 * Get method for struct member 'axis'.
	 * @see #__DNA__FIELD__axis
	 */
	
	public short getAxis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 68);
		} else {
			return __io__block.readShort(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'axis'.
	 * @see #__DNA__FIELD__axis
	 */
	
	public void setAxis(short axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 68, axis);
		} else {
			__io__block.writeShort(__io__address + 68, axis);
		}
	}

	/**
	 * Get method for struct member 'axis_single'.
	 * @see #__DNA__FIELD__axis_single
	 */
	
	public short getAxis_single() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 70);
		} else {
			return __io__block.readShort(__io__address + 70);
		}
	}

	/**
	 * Set method for struct member 'axis_single'.
	 * @see #__DNA__FIELD__axis_single
	 */
	
	public void setAxis_single(short axis_single) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 70, axis_single);
		} else {
			__io__block.writeShort(__io__address + 70, axis_single);
		}
	}

	/**
	 * Get method for struct member 'axisf'.
	 * @see #__DNA__FIELD__axisf
	 */
	
	public int getAxisf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 72);
		} else {
			return __io__block.readInt(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'axisf'.
	 * @see #__DNA__FIELD__axisf
	 */
	
	public void setAxisf(int axisf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 72, axisf);
		} else {
			__io__block.writeInt(__io__address + 72, axisf);
		}
	}

	/**
	 * Get method for struct member 'button'.
	 * @see #__DNA__FIELD__button
	 */
	
	public int getButton() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 76);
		} else {
			return __io__block.readInt(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'button'.
	 * @see #__DNA__FIELD__button
	 */
	
	public void setButton(int button) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 76, button);
		} else {
			__io__block.writeInt(__io__address + 76, button);
		}
	}

	/**
	 * Get method for struct member 'hat'.
	 * @see #__DNA__FIELD__hat
	 */
	
	public int getHat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 80);
		} else {
			return __io__block.readInt(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'hat'.
	 * @see #__DNA__FIELD__hat
	 */
	
	public void setHat(int hat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 80, hat);
		} else {
			__io__block.writeInt(__io__address + 80, hat);
		}
	}

	/**
	 * Get method for struct member 'hatf'.
	 * @see #__DNA__FIELD__hatf
	 */
	
	public int getHatf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'hatf'.
	 * @see #__DNA__FIELD__hatf
	 */
	
	public void setHatf(int hatf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, hatf);
		} else {
			__io__block.writeInt(__io__address + 84, hatf);
		}
	}

	/**
	 * Get method for struct member 'precision'.
	 * @see #__DNA__FIELD__precision
	 */
	
	public int getPrecision() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 88);
		} else {
			return __io__block.readInt(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'precision'.
	 * @see #__DNA__FIELD__precision
	 */
	
	public void setPrecision(int precision) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 88, precision);
		} else {
			__io__block.writeInt(__io__address + 88, precision);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bJoystickSensor> __io__addressof() {
		return new CPointer<bJoystickSensor>(__io__address, new Class[]{bJoystickSensor.class}, __io__block, __io__blockTable);
	}

}
