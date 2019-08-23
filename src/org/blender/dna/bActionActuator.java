package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bActionActuator'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=164, size64=168)
public class bActionActuator extends CFacade {

	/**
	 * This is the sdna index of the struct bActionActuator.
	 * <p>
	 * It is required when allocating a new block to store data for bActionActuator.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 317;

	/**
	 * Field descriptor (offset) for struct member 'act'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to action </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__act);
	 * CPointer&lt;CPointer&lt;bAction&gt;&gt; p_act = p.cast(new Class[]{CPointer.class, bAction.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act'</li>
	 * <li>Signature: 'bAction*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Playback type </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{6, 10};

	/**
	 * Field descriptor (offset) for struct member 'sta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not in use </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__sta);
	 * CPointer&lt;Float&gt; p_sta = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sta'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sta = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start & End frames </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__end);
	 * CPointer&lt;Float&gt; p_end = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'end'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__end = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For property-driven playback, MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member 'frameProp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set this property to the actions current frame, MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__frameProp);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_frameProp = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frameProp'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frameProp = new long[]{80, 84};

	/**
	 * Field descriptor (offset) for struct member 'blendin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames of blending </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__blendin);
	 * CPointer&lt;Short&gt; p_blendin = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blendin'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blendin = new long[]{144, 148};

	/**
	 * Field descriptor (offset) for struct member 'priority'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Execution priority </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__priority);
	 * CPointer&lt;Short&gt; p_priority = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'priority'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__priority = new long[]{146, 150};

	/**
	 * Field descriptor (offset) for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation layer </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__layer);
	 * CPointer&lt;Short&gt; p_layer = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer = new long[]{148, 152};

	/**
	 * Field descriptor (offset) for struct member 'end_reset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ending the actuator (negative pulse) wont reset the action to its starting frame </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__end_reset);
	 * CPointer&lt;Short&gt; p_end_reset = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'end_reset'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__end_reset = new long[]{150, 154};

	/**
	 * Field descriptor (offset) for struct member 'strideaxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Displacement axis </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__strideaxis);
	 * CPointer&lt;Short&gt; p_strideaxis = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strideaxis'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strideaxis = new long[]{152, 156};

	/**
	 * Field descriptor (offset) for struct member 'blend_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Layer blending mode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__blend_mode);
	 * CPointer&lt;Short&gt; p_blend_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_mode = new long[]{154, 158};

	/**
	 * Field descriptor (offset) for struct member 'stridelength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Displacement incurred by cycle </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__stridelength);
	 * CPointer&lt;Float&gt; p_stridelength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stridelength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stridelength = new long[]{156, 160};

	/**
	 * Field descriptor (offset) for struct member 'layer_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not in use </p><p> How much of the previous layer to use for blending. (<0 = disable, 0 = add mode) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionActuator bactionactuator = ...;
	 * CPointer&lt;Object&gt; p = bactionactuator.__dna__addressof(bActionActuator.__DNA__FIELD__layer_weight);
	 * CPointer&lt;Float&gt; p_layer_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_weight = new long[]{160, 164};

	public bActionActuator(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bActionActuator(bActionActuator that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'act'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to action </p>
	 * @see #__DNA__FIELD__act
	 */
	
	public CPointer<bAction> getAct() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bAction.class};
		return new CPointer<bAction>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bAction.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to action </p>
	 * @see #__DNA__FIELD__act
	 */
	
	public void setAct(CPointer<bAction> act) throws IOException
	{
		long __address = ((act == null) ? 0 : act.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
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
			__io__block.writeShort(__io__address + 8, type);
		} else {
			__io__block.writeShort(__io__address + 4, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Playback type </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Playback type </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10, flag);
		} else {
			__io__block.writeShort(__io__address + 6, flag);
		}
	}

	/**
	 * Get method for struct member 'sta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not in use </p>
	 * @see #__DNA__FIELD__sta
	 */
	
	public float getSta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'sta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not in use </p>
	 * @see #__DNA__FIELD__sta
	 */
	
	public void setSta(float sta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, sta);
		} else {
			__io__block.writeFloat(__io__address + 8, sta);
		}
	}

	/**
	 * Get method for struct member 'end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start & End frames </p>
	 * @see #__DNA__FIELD__end
	 */
	
	public float getEnd() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start & End frames </p>
	 * @see #__DNA__FIELD__end
	 */
	
	public void setEnd(float end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, end);
		} else {
			__io__block.writeFloat(__io__address + 12, end);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For property-driven playback, MAX_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For property-driven playback, MAX_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 16;
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
	 * Get method for struct member 'frameProp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set this property to the actions current frame, MAX_NAME </p>
	 * @see #__DNA__FIELD__frameProp
	 */
	
	public CArrayFacade<Byte> getFrameProp() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 84, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'frameProp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set this property to the actions current frame, MAX_NAME </p>
	 * @see #__DNA__FIELD__frameProp
	 */
	
	public void setFrameProp(CArrayFacade<Byte> frameProp) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 84;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(frameProp, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, frameProp)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, frameProp);
		} else {
			__io__generic__copy( getFrameProp(), frameProp);
		}
	}

	/**
	 * Get method for struct member 'blendin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames of blending </p>
	 * @see #__DNA__FIELD__blendin
	 */
	
	public short getBlendin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 148);
		} else {
			return __io__block.readShort(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'blendin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of frames of blending </p>
	 * @see #__DNA__FIELD__blendin
	 */
	
	public void setBlendin(short blendin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 148, blendin);
		} else {
			__io__block.writeShort(__io__address + 144, blendin);
		}
	}

	/**
	 * Get method for struct member 'priority'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Execution priority </p>
	 * @see #__DNA__FIELD__priority
	 */
	
	public short getPriority() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 150);
		} else {
			return __io__block.readShort(__io__address + 146);
		}
	}

	/**
	 * Set method for struct member 'priority'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Execution priority </p>
	 * @see #__DNA__FIELD__priority
	 */
	
	public void setPriority(short priority) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 150, priority);
		} else {
			__io__block.writeShort(__io__address + 146, priority);
		}
	}

	/**
	 * Get method for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation layer </p>
	 * @see #__DNA__FIELD__layer
	 */
	
	public short getLayer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 152);
		} else {
			return __io__block.readShort(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'layer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation layer </p>
	 * @see #__DNA__FIELD__layer
	 */
	
	public void setLayer(short layer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 152, layer);
		} else {
			__io__block.writeShort(__io__address + 148, layer);
		}
	}

	/**
	 * Get method for struct member 'end_reset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ending the actuator (negative pulse) wont reset the action to its starting frame </p>
	 * @see #__DNA__FIELD__end_reset
	 */
	
	public short getEnd_reset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 154);
		} else {
			return __io__block.readShort(__io__address + 150);
		}
	}

	/**
	 * Set method for struct member 'end_reset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Ending the actuator (negative pulse) wont reset the action to its starting frame </p>
	 * @see #__DNA__FIELD__end_reset
	 */
	
	public void setEnd_reset(short end_reset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 154, end_reset);
		} else {
			__io__block.writeShort(__io__address + 150, end_reset);
		}
	}

	/**
	 * Get method for struct member 'strideaxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Displacement axis </p>
	 * @see #__DNA__FIELD__strideaxis
	 */
	
	public short getStrideaxis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 156);
		} else {
			return __io__block.readShort(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'strideaxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Displacement axis </p>
	 * @see #__DNA__FIELD__strideaxis
	 */
	
	public void setStrideaxis(short strideaxis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 156, strideaxis);
		} else {
			__io__block.writeShort(__io__address + 152, strideaxis);
		}
	}

	/**
	 * Get method for struct member 'blend_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Layer blending mode </p>
	 * @see #__DNA__FIELD__blend_mode
	 */
	
	public short getBlend_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 158);
		} else {
			return __io__block.readShort(__io__address + 154);
		}
	}

	/**
	 * Set method for struct member 'blend_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Layer blending mode </p>
	 * @see #__DNA__FIELD__blend_mode
	 */
	
	public void setBlend_mode(short blend_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 158, blend_mode);
		} else {
			__io__block.writeShort(__io__address + 154, blend_mode);
		}
	}

	/**
	 * Get method for struct member 'stridelength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Displacement incurred by cycle </p>
	 * @see #__DNA__FIELD__stridelength
	 */
	
	public float getStridelength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'stridelength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Displacement incurred by cycle </p>
	 * @see #__DNA__FIELD__stridelength
	 */
	
	public void setStridelength(float stridelength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, stridelength);
		} else {
			__io__block.writeFloat(__io__address + 156, stridelength);
		}
	}

	/**
	 * Get method for struct member 'layer_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not in use </p><p> How much of the previous layer to use for blending. (<0 = disable, 0 = add mode) </p>
	 * @see #__DNA__FIELD__layer_weight
	 */
	
	public float getLayer_weight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'layer_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not in use </p><p> How much of the previous layer to use for blending. (<0 = disable, 0 = add mode) </p>
	 * @see #__DNA__FIELD__layer_weight
	 */
	
	public void setLayer_weight(float layer_weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, layer_weight);
		} else {
			__io__block.writeFloat(__io__address + 160, layer_weight);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bActionActuator> __io__addressof() {
		return new CPointer<bActionActuator>(__io__address, new Class[]{bActionActuator.class}, __io__block, __io__blockTable);
	}

}
