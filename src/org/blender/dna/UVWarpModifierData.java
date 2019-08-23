package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
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

@CMetaData(size32=380, size64=408)
public class UVWarpModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct UVWarpModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for UVWarpModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 144;

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
	 * <li>Actual Size (32bit/64bit): 100/120</li>
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
	public static final long[] __DNA__FIELD__axis_u = new long[]{100, 120};

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
	public static final long[] __DNA__FIELD__axis_v = new long[]{101, 121};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVWarpModifierData uvwarpmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvwarpmodifierdata.__dna__addressof(UVWarpModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{102, 122};

	/**
	 * Field descriptor (offset) for struct member 'center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__center = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'object_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__object_src = new long[]{116, 136};

	/**
	 * Field descriptor (offset) for struct member 'bone_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__bone_src = new long[]{120, 144};

	/**
	 * Field descriptor (offset) for struct member 'object_dst'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__object_dst = new long[]{184, 208};

	/**
	 * Field descriptor (offset) for struct member 'bone_dst'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__bone_dst = new long[]{188, 216};

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
	public static final long[] __DNA__FIELD__vgroup_name = new long[]{252, 280};

	/**
	 * Field descriptor (offset) for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__uvlayer_name = new long[]{316, 344};

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
			return __io__block.readByte(__io__address + 100);
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
			__io__block.writeByte(__io__address + 100, axis_u);
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
			return __io__block.readByte(__io__address + 101);
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
			__io__block.writeByte(__io__address + 101, axis_v);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 122, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 102, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 122;
		} else {
			__dna__offset = 102;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
		}
	}

	/**
	 * Get method for struct member 'center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
			return new CArrayFacade<Float>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for rotate/scale. </p>
	 * @see #__DNA__FIELD__center
	 */
	
	public void setCenter(CArrayFacade<Float> center) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
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
	 * Get method for struct member 'object_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Source. </p>
	 * @see #__DNA__FIELD__object_src
	 */
	
	public CPointer<BlenderObject> getObject_src() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 116);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Source. </p>
	 * @see #__DNA__FIELD__object_src
	 */
	
	public void setObject_src(CPointer<BlenderObject> object_src) throws IOException
	{
		long __address = ((object_src == null) ? 0 : object_src.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
		}
	}

	/**
	 * Get method for struct member 'bone_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
			return new CArrayFacade<Byte>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bone_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional name of bone target, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__bone_src
	 */
	
	public void setBone_src(CArrayFacade<Byte> bone_src) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 120;
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
	 * <h4>Blender Source Code:</h4>
	 * <p> Target. </p>
	 * @see #__DNA__FIELD__object_dst
	 */
	
	public CPointer<BlenderObject> getObject_dst() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object_dst'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Target. </p>
	 * @see #__DNA__FIELD__object_dst
	 */
	
	public void setObject_dst(CPointer<BlenderObject> object_dst) throws IOException
	{
		long __address = ((object_dst == null) ? 0 : object_dst.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 184, __address);
		}
	}

	/**
	 * Get method for struct member 'bone_dst'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
			return new CArrayFacade<Byte>(__io__address + 216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bone_dst'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional name of bone target, MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__bone_dst
	 */
	
	public void setBone_dst(CArrayFacade<Byte> bone_dst) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 216;
		} else {
			__dna__offset = 188;
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
			return new CArrayFacade<Byte>(__io__address + 280, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 252, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 280;
		} else {
			__dna__offset = 252;
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
	 * <h4>Blender Source Code:</h4>
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
			return new CArrayFacade<Byte>(__io__address + 344, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 316, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__uvlayer_name
	 */
	
	public void setUvlayer_name(CArrayFacade<Byte> uvlayer_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 344;
		} else {
			__dna__offset = 316;
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
