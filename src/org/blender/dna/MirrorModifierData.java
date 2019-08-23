package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
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

@CMetaData(size32=128, size64=152)
public class MirrorModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct MirrorModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for MirrorModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 103;

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
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
	public static final long[] __DNA__FIELD__axis = new long[]{100, 120};

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
	public static final long[] __DNA__FIELD__flag = new long[]{102, 122};

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
	public static final long[] __DNA__FIELD__tolerance = new long[]{104, 124};

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
	public static final long[] __DNA__FIELD__uv_offset = new long[]{108, 128};

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
	public static final long[] __DNA__FIELD__uv_offset_copy = new long[]{116, 136};

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
	public static final long[] __DNA__FIELD__mirror_ob = new long[]{124, 144};

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
	 * <h4>Blender Source Code:</h4>
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
			return __io__block.readShort(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
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
			__io__block.writeShort(__io__address + 100, axis);
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
			return __io__block.readShort(__io__address + 102);
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
			__io__block.writeShort(__io__address + 102, flag);
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
			return __io__block.readFloat(__io__address + 104);
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
			__io__block.writeFloat(__io__address + 104, tolerance);
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
			return new CArrayFacade<Float>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 128;
		} else {
			__dna__offset = 108;
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
			return new CArrayFacade<Float>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 136;
		} else {
			__dna__offset = 116;
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
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 124);
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
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 124, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MirrorModifierData> __io__addressof() {
		return new CPointer<MirrorModifierData>(__io__address, new Class[]{MirrorModifierData.class}, __io__block, __io__blockTable);
	}

}
