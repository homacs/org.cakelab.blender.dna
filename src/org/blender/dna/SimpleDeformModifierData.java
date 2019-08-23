package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SimpleDeformModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=184, size64=208)
public class SimpleDeformModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct SimpleDeformModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for SimpleDeformModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 129;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimpleDeformModifierData simpledeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simpledeformmodifierdata.__dna__addressof(SimpleDeformModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'origin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  to control the origin of modifier space coordinates. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimpleDeformModifierData simpledeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simpledeformmodifierdata.__dna__addressof(SimpleDeformModifierData.__DNA__FIELD__origin);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_origin = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'origin'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__origin = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimpleDeformModifierData simpledeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simpledeformmodifierdata.__dna__addressof(SimpleDeformModifierData.__DNA__FIELD__vgroup_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vgroup_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_name = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factors to control simple deforms. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimpleDeformModifierData simpledeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simpledeformmodifierdata.__dna__addressof(SimpleDeformModifierData.__DNA__FIELD__factor);
	 * CPointer&lt;Float&gt; p_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__factor = new long[]{168, 192};

	/**
	 * Field descriptor (offset) for struct member 'limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lower and upper limit. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimpleDeformModifierData simpledeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simpledeformmodifierdata.__dna__addressof(SimpleDeformModifierData.__DNA__FIELD__limit);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_limit = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'limit'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__limit = new long[]{172, 196};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deform function. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimpleDeformModifierData simpledeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simpledeformmodifierdata.__dna__addressof(SimpleDeformModifierData.__DNA__FIELD__mode);
	 * CPointer&lt;Byte&gt; p_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{180, 204};

	/**
	 * Field descriptor (offset) for struct member 'axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lock axis (for taper and stretch). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimpleDeformModifierData simpledeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simpledeformmodifierdata.__dna__addressof(SimpleDeformModifierData.__DNA__FIELD__axis);
	 * CPointer&lt;Byte&gt; p_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axis = new long[]{181, 205};

	/**
	 * Field descriptor (offset) for struct member 'deform_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis to perform the deform on (default is X, but can be overridden by origin. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimpleDeformModifierData simpledeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simpledeformmodifierdata.__dna__addressof(SimpleDeformModifierData.__DNA__FIELD__deform_axis);
	 * CPointer&lt;Byte&gt; p_deform_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'deform_axis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__deform_axis = new long[]{182, 206};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SimpleDeformModifierData simpledeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = simpledeformmodifierdata.__dna__addressof(SimpleDeformModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{183, 207};

	public SimpleDeformModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SimpleDeformModifierData(SimpleDeformModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public ModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(ModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'origin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  to control the origin of modifier space coordinates. </p>
	 * @see #__DNA__FIELD__origin
	 */
	
	public CPointer<BlenderObject> getOrigin() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'origin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  to control the origin of modifier space coordinates. </p>
	 * @see #__DNA__FIELD__origin
	 */
	
	public void setOrigin(CPointer<BlenderObject> origin) throws IOException
	{
		long __address = ((origin == null) ? 0 : origin.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'vgroup_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__vgroup_name
	 */
	
	public CArrayFacade<Byte> getVgroup_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vgroup_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__vgroup_name
	 */
	
	public void setVgroup_name(CArrayFacade<Byte> vgroup_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 104;
		}
		if (__io__equals(vgroup_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vgroup_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vgroup_name);
		} else {
			__io__generic__copy( getVgroup_name(), vgroup_name);
		}
	}

	/**
	 * Get method for struct member 'factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factors to control simple deforms. </p>
	 * @see #__DNA__FIELD__factor
	 */
	
	public float getFactor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Factors to control simple deforms. </p>
	 * @see #__DNA__FIELD__factor
	 */
	
	public void setFactor(float factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, factor);
		} else {
			__io__block.writeFloat(__io__address + 168, factor);
		}
	}

	/**
	 * Get method for struct member 'limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lower and upper limit. </p>
	 * @see #__DNA__FIELD__limit
	 */
	
	public CArrayFacade<Float> getLimit() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'limit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lower and upper limit. </p>
	 * @see #__DNA__FIELD__limit
	 */
	
	public void setLimit(CArrayFacade<Float> limit) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 196;
		} else {
			__dna__offset = 172;
		}
		if (__io__equals(limit, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, limit)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, limit);
		} else {
			__io__generic__copy( getLimit(), limit);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deform function. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public byte getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 204);
		} else {
			return __io__block.readByte(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deform function. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(byte mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 204, mode);
		} else {
			__io__block.writeByte(__io__address + 180, mode);
		}
	}

	/**
	 * Get method for struct member 'axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lock axis (for taper and stretch). </p>
	 * @see #__DNA__FIELD__axis
	 */
	
	public byte getAxis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 205);
		} else {
			return __io__block.readByte(__io__address + 181);
		}
	}

	/**
	 * Set method for struct member 'axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lock axis (for taper and stretch). </p>
	 * @see #__DNA__FIELD__axis
	 */
	
	public void setAxis(byte axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 205, axis);
		} else {
			__io__block.writeByte(__io__address + 181, axis);
		}
	}

	/**
	 * Get method for struct member 'deform_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis to perform the deform on (default is X, but can be overridden by origin. </p>
	 * @see #__DNA__FIELD__deform_axis
	 */
	
	public byte getDeform_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 206);
		} else {
			return __io__block.readByte(__io__address + 182);
		}
	}

	/**
	 * Set method for struct member 'deform_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis to perform the deform on (default is X, but can be overridden by origin. </p>
	 * @see #__DNA__FIELD__deform_axis
	 */
	
	public void setDeform_axis(byte deform_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 206, deform_axis);
		} else {
			__io__block.writeByte(__io__address + 182, deform_axis);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 207);
		} else {
			return __io__block.readByte(__io__address + 183);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 207, flag);
		} else {
			__io__block.writeByte(__io__address + 183, flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SimpleDeformModifierData> __io__addressof() {
		return new CPointer<SimpleDeformModifierData>(__io__address, new Class[]{SimpleDeformModifierData.class}, __io__block, __io__blockTable);
	}

}
