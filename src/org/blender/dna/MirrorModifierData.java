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
 * Generated facet for DNA struct type 'MirrorModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=144, size64=168)
public class MirrorModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct MirrorModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for MirrorModifierData.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 109;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MirrorModifierData mirrormodifierdata = ...;
	 * CPointer&lt;Object&gt; p = mirrormodifierdata.__dna__addressof(MirrorModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Deprecated, use flag instead. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MirrorModifierData mirrormodifierdata = ...;
	 * CPointer&lt;Object&gt; p = mirrormodifierdata.__dna__addressof(MirrorModifierData.__DNA__FIELD__axis);
	 * CPointer&lt;Short&gt; p_axis = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axis'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axis = new long[]{104, 120};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MirrorModifierData mirrormodifierdata = ...;
	 * CPointer&lt;Object&gt; p = mirrormodifierdata.__dna__addressof(MirrorModifierData.__DNA__FIELD__flag);
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
	 * Field descriptor (offset) for struct member 'tolerance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MirrorModifierData mirrormodifierdata = ...;
	 * CPointer&lt;Object&gt; p = mirrormodifierdata.__dna__addressof(MirrorModifierData.__DNA__FIELD__tolerance);
	 * CPointer&lt;Float&gt; p_tolerance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tolerance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tolerance = new long[]{108, 124};

	/**
	 * Field descriptor (offset) for struct member 'bisect_threshold'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MirrorModifierData mirrormodifierdata = ...;
	 * CPointer&lt;Object&gt; p = mirrormodifierdata.__dna__addressof(MirrorModifierData.__DNA__FIELD__bisect_threshold);
	 * CPointer&lt;Float&gt; p_bisect_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bisect_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bisect_threshold = new long[]{112, 128};

	/**
	 * Field descriptor (offset) for struct member 'use_correct_order_on_merge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Mirror modifier used to merge the old vertex into its new copy, which would break code relying on access to the original geometry vertices. However, modifying this behavior to the correct one (i.e. merging the copy vertices into their original sources) has several potential effects on other modifiers and tools, so we need to keep that incorrect behavior for existing modifiers, and only use the new correct one for new modifiers. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MirrorModifierData mirrormodifierdata = ...;
	 * CPointer&lt;Object&gt; p = mirrormodifierdata.__dna__addressof(MirrorModifierData.__DNA__FIELD__use_correct_order_on_merge);
	 * CPointer&lt;Byte&gt; p_use_correct_order_on_merge = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_correct_order_on_merge'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_correct_order_on_merge = new long[]{116, 132};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MirrorModifierData mirrormodifierdata = ...;
	 * CPointer&lt;Object&gt; p = mirrormodifierdata.__dna__addressof(MirrorModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{117, 133};

	/**
	 * Field descriptor (offset) for struct member 'uv_offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MirrorModifierData mirrormodifierdata = ...;
	 * CPointer&lt;Object&gt; p = mirrormodifierdata.__dna__addressof(MirrorModifierData.__DNA__FIELD__uv_offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_uv_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_offset'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_offset = new long[]{120, 136};

	/**
	 * Field descriptor (offset) for struct member 'uv_offset_copy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MirrorModifierData mirrormodifierdata = ...;
	 * CPointer&lt;Object&gt; p = mirrormodifierdata.__dna__addressof(MirrorModifierData.__DNA__FIELD__uv_offset_copy);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_uv_offset_copy = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_offset_copy'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_offset_copy = new long[]{128, 144};

	/**
	 * Field descriptor (offset) for struct member 'mirror_ob'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MirrorModifierData mirrormodifierdata = ...;
	 * CPointer&lt;Object&gt; p = mirrormodifierdata.__dna__addressof(MirrorModifierData.__DNA__FIELD__mirror_ob);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_mirror_ob = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mirror_ob'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mirror_ob = new long[]{136, 152};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MirrorModifierData mirrormodifierdata = ...;
	 * CPointer&lt;Object&gt; p = mirrormodifierdata.__dna__addressof(MirrorModifierData.__DNA__FIELD___pad1);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad1 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{140, 160};

	public MirrorModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MirrorModifierData(MirrorModifierData that) {
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
	 * Get method for struct member 'axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Deprecated, use flag instead. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__axis
	 */
	
	public short getAxis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 120);
		} else {
			return __io__block.readShort(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Deprecated, use flag instead. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__axis
	 */
	
	public void setAxis(short axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 120, axis);
		} else {
			__io__block.writeShort(__io__address + 104, axis);
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
	 * Get method for struct member 'tolerance'.
	 * @see #__DNA__FIELD__tolerance
	 */
	
	public float getTolerance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'tolerance'.
	 * @see #__DNA__FIELD__tolerance
	 */
	
	public void setTolerance(float tolerance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, tolerance);
		} else {
			__io__block.writeFloat(__io__address + 108, tolerance);
		}
	}

	/**
	 * Get method for struct member 'bisect_threshold'.
	 * @see #__DNA__FIELD__bisect_threshold
	 */
	
	public float getBisect_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 128);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'bisect_threshold'.
	 * @see #__DNA__FIELD__bisect_threshold
	 */
	
	public void setBisect_threshold(float bisect_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 128, bisect_threshold);
		} else {
			__io__block.writeFloat(__io__address + 112, bisect_threshold);
		}
	}

	/**
	 * Get method for struct member 'use_correct_order_on_merge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Mirror modifier used to merge the old vertex into its new copy, which would break code relying on access to the original geometry vertices. However, modifying this behavior to the correct one (i.e. merging the copy vertices into their original sources) has several potential effects on other modifiers and tools, so we need to keep that incorrect behavior for existing modifiers, and only use the new correct one for new modifiers. </p>
	 * @see #__DNA__FIELD__use_correct_order_on_merge
	 */
	
	public byte getUse_correct_order_on_merge() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 132);
		} else {
			return __io__block.readByte(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'use_correct_order_on_merge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Mirror modifier used to merge the old vertex into its new copy, which would break code relying on access to the original geometry vertices. However, modifying this behavior to the correct one (i.e. merging the copy vertices into their original sources) has several potential effects on other modifiers and tools, so we need to keep that incorrect behavior for existing modifiers, and only use the new correct one for new modifiers. </p>
	 * @see #__DNA__FIELD__use_correct_order_on_merge
	 */
	
	public void setUse_correct_order_on_merge(byte use_correct_order_on_merge) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 132, use_correct_order_on_merge);
		} else {
			__io__block.writeByte(__io__address + 116, use_correct_order_on_merge);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 133, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 117, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 133;
		} else {
			__dna__offset = 117;
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
	 * Get method for struct member 'uv_offset'.
	 * @see #__DNA__FIELD__uv_offset
	 */
	
	public CArrayFacade<Float> getUv_offset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uv_offset'.
	 * @see #__DNA__FIELD__uv_offset
	 */
	
	public void setUv_offset(CArrayFacade<Float> uv_offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 136;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(uv_offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uv_offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uv_offset);
		} else {
			__io__generic__copy( getUv_offset(), uv_offset);
		}
	}

	/**
	 * Get method for struct member 'uv_offset_copy'.
	 * @see #__DNA__FIELD__uv_offset_copy
	 */
	
	public CArrayFacade<Float> getUv_offset_copy() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uv_offset_copy'.
	 * @see #__DNA__FIELD__uv_offset_copy
	 */
	
	public void setUv_offset_copy(CArrayFacade<Float> uv_offset_copy) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 128;
		}
		if (__io__equals(uv_offset_copy, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uv_offset_copy)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uv_offset_copy);
		} else {
			__io__generic__copy( getUv_offset_copy(), uv_offset_copy);
		}
	}

	/**
	 * Get method for struct member 'mirror_ob'.
	 * @see #__DNA__FIELD__mirror_ob
	 */
	
	public CPointer<BlenderObject> getMirror_ob() throws IOException
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
	 * Set method for struct member 'mirror_ob'.
	 * @see #__DNA__FIELD__mirror_ob
	 */
	
	public void setMirror_ob(CPointer<BlenderObject> mirror_ob) throws IOException
	{
		long __address = ((mirror_ob == null) ? 0 : mirror_ob.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CPointer<Object> get_pad1() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CPointer<Object> _pad1) throws IOException
	{
		long __address = ((_pad1 == null) ? 0 : _pad1.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MirrorModifierData> __io__addressof() {
		return new CPointer<MirrorModifierData>(__io__address, new Class[]{MirrorModifierData.class}, __io__block, __io__blockTable);
	}

}
