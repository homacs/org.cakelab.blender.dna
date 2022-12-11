package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'UVWarpModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=400, size64=424)
public class UVWarpModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct UVWarpModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for UVWarpModifierData.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 372;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 104/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'axis_u'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD__axis_u);
	 * CPointer&lt;Byte&gt; p_axis_u = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axis_u'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axis_u = new long[]{104, 120};

	/**
	 * Field descriptor (offset) for struct member 'axis_v'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD__axis_v);
	 * CPointer&lt;Byte&gt; p_axis_v = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axis_v'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axis_v = new long[]{105, 121};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{106, 122};

	/**
	 * Field descriptor (offset) for struct member 'center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used for rotate/scale. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD__center);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_center = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'center'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__center = new long[]{108, 124};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD__offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{116, 132};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD__scale);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_scale = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale = new long[]{124, 140};

	/**
	 * Field descriptor (offset) for struct member 'rotation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD__rotation);
	 * CPointer&lt;Float&gt; p_rotation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotation = new long[]{132, 148};

	/**
	 * Field descriptor (offset) for struct member 'object_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Source. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD__object_src);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object_src = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_src'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_src = new long[]{136, 152};

	/**
	 * Field descriptor (offset) for struct member 'bone_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional name of bone target, MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD__bone_src);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_bone_src = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bone_src'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bone_src = new long[]{140, 160};

	/**
	 * Field descriptor (offset) for struct member 'object_dst'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Target. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD__object_dst);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object_dst = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_dst'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_dst = new long[]{204, 224};

	/**
	 * Field descriptor (offset) for struct member 'bone_dst'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional name of bone target, MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD__bone_dst);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_bone_dst = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bone_dst'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bone_dst = new long[]{208, 232};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional vertex-group name, #MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD__vgroup_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vgroup_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_name = new long[]{272, 296};

	/**
	 * Field descriptor (offset) for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD__uvlayer_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_uvlayer_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uvlayer_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uvlayer_name = new long[]{336, 360};

	public UVWarpModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected UVWarpModifierData(UVWarpModifierData that) {
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
	 * Get method for struct member 'axis_u'.
	 * @see #__DNA__FIELD__axis_u
	 */
	
	public byte getAxis_u() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 120);
		} else {
			return __io__block.readByte(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'axis_u'.
	 * @see #__DNA__FIELD__axis_u
	 */
	
	public void setAxis_u(byte axis_u) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 120, axis_u);
		} else {
			__io__block.writeByte(__io__address + 104, axis_u);
		}
	}

	/**
	 * Get method for struct member 'axis_v'.
	 * @see #__DNA__FIELD__axis_v
	 */
	
	public byte getAxis_v() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 121);
		} else {
			return __io__block.readByte(__io__address + 105);
		}
	}

	/**
	 * Set method for struct member 'axis_v'.
	 * @see #__DNA__FIELD__axis_v
	 */
	
	public void setAxis_v(byte axis_v) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 121, axis_v);
		} else {
			__io__block.writeByte(__io__address + 105, axis_v);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 122);
		} else {
			return __io__block.readShort(__io__address + 106);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 122, flag);
		} else {
			__io__block.writeShort(__io__address + 106, flag);
		}
	}

	/**
	 * Get method for struct member 'center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used for rotate/scale. </p>
	 * @see #__DNA__FIELD__center
	 */
	
	public CArrayFacade<Float> getCenter() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used for rotate/scale. </p>
	 * @see #__DNA__FIELD__center
	 */
	
	public void setCenter(CArrayFacade<Float> center) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 124;
		} else {
			__dna__offset = 108;
		}
		if (__io__equals(center, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, center)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, center);
		} else {
			__io__generic__copy( getCenter(), center);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public CArrayFacade<Float> getOffset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(CArrayFacade<Float> offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 132;
		} else {
			__dna__offset = 116;
		}
		if (__io__equals(offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, offset);
		} else {
			__io__generic__copy( getOffset(), offset);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public CArrayFacade<Float> getScale() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(CArrayFacade<Float> scale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 140;
		} else {
			__dna__offset = 124;
		}
		if (__io__equals(scale, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scale)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scale);
		} else {
			__io__generic__copy( getScale(), scale);
		}
	}

	/**
	 * Get method for struct member 'rotation'.
	 * @see #__DNA__FIELD__rotation
	 */
	
	public float getRotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'rotation'.
	 * @see #__DNA__FIELD__rotation
	 */
	
	public void setRotation(float rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, rotation);
		} else {
			__io__block.writeFloat(__io__address + 132, rotation);
		}
	}

	/**
	 * Get method for struct member 'object_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Source. </p>
	 * @see #__DNA__FIELD__object_src
	 */
	
	public CPointer<BlenderObject> getObject_src() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Source. </p>
	 * @see #__DNA__FIELD__object_src
	 */
	
	public void setObject_src(CPointer<BlenderObject> object_src) throws IOException
	{
		long __address = ((object_src == null) ? 0 : object_src.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Get method for struct member 'bone_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional name of bone target, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__bone_src
	 */
	
	public CArrayFacade<Byte> getBone_src() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bone_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional name of bone target, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__bone_src
	 */
	
	public void setBone_src(CArrayFacade<Byte> bone_src) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(bone_src, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bone_src)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bone_src);
		} else {
			__io__generic__copy( getBone_src(), bone_src);
		}
	}

	/**
	 * Get method for struct member 'object_dst'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Target. </p>
	 * @see #__DNA__FIELD__object_dst
	 */
	
	public CPointer<BlenderObject> getObject_dst() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 204);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object_dst'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Target. </p>
	 * @see #__DNA__FIELD__object_dst
	 */
	
	public void setObject_dst(CPointer<BlenderObject> object_dst) throws IOException
	{
		long __address = ((object_dst == null) ? 0 : object_dst.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 204, __address);
		}
	}

	/**
	 * Get method for struct member 'bone_dst'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional name of bone target, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__bone_dst
	 */
	
	public CArrayFacade<Byte> getBone_dst() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 208, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bone_dst'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional name of bone target, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__bone_dst
	 */
	
	public void setBone_dst(CArrayFacade<Byte> bone_dst) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 232;
		} else {
			__dna__offset = 208;
		}
		if (__io__equals(bone_dst, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bone_dst)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bone_dst);
		} else {
			__io__generic__copy( getBone_dst(), bone_dst);
		}
	}

	/**
	 * Get method for struct member 'vgroup_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional vertex-group name, #MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__vgroup_name
	 */
	
	public CArrayFacade<Byte> getVgroup_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 296, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 272, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vgroup_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Optional vertex-group name, #MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__vgroup_name
	 */
	
	public void setVgroup_name(CArrayFacade<Byte> vgroup_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 296;
		} else {
			__dna__offset = 272;
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
	 * Get method for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__uvlayer_name
	 */
	
	public CArrayFacade<Byte> getUvlayer_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 360, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 336, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__uvlayer_name
	 */
	
	public void setUvlayer_name(CArrayFacade<Byte> uvlayer_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 360;
		} else {
			__dna__offset = 336;
		}
		if (__io__equals(uvlayer_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uvlayer_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uvlayer_name);
		} else {
			__io__generic__copy( getUvlayer_name(), uvlayer_name);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<UVWarpModifierData> __io__addressof() {
		return new CPointer<UVWarpModifierData>(__io__address, new Class[]{UVWarpModifierData.class}, __io__block, __io__blockTable);
	}

}
