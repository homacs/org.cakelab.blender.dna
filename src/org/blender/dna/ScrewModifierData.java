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
 * Generated facet for DNA struct type 'ScrewModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=144, size64=168)
public class ScrewModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct ScrewModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for ScrewModifierData.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 139;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrewModifierData screwmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = screwmodifierdata.__dna__addressof(ScrewModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'ob_axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrewModifierData screwmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = screwmodifierdata.__dna__addressof(ScrewModifierData.__DNA__FIELD__ob_axis);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_ob_axis = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob_axis'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob_axis = new long[]{104, 120};

	/**
	 * Field descriptor (offset) for struct member 'steps'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrewModifierData screwmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = screwmodifierdata.__dna__addressof(ScrewModifierData.__DNA__FIELD__steps);
	 * CPointer&lt;Integer&gt; p_steps = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'steps'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__steps = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'render_steps'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrewModifierData screwmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = screwmodifierdata.__dna__addressof(ScrewModifierData.__DNA__FIELD__render_steps);
	 * CPointer&lt;Integer&gt; p_render_steps = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_steps'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_steps = new long[]{112, 132};

	/**
	 * Field descriptor (offset) for struct member 'iter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrewModifierData screwmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = screwmodifierdata.__dna__addressof(ScrewModifierData.__DNA__FIELD__iter);
	 * CPointer&lt;Integer&gt; p_iter = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iter'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iter = new long[]{116, 136};

	/**
	 * Field descriptor (offset) for struct member 'screw_ofs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrewModifierData screwmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = screwmodifierdata.__dna__addressof(ScrewModifierData.__DNA__FIELD__screw_ofs);
	 * CPointer&lt;Float&gt; p_screw_ofs = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'screw_ofs'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__screw_ofs = new long[]{120, 140};

	/**
	 * Field descriptor (offset) for struct member 'angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrewModifierData screwmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = screwmodifierdata.__dna__addressof(ScrewModifierData.__DNA__FIELD__angle);
	 * CPointer&lt;Float&gt; p_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angle = new long[]{124, 144};

	/**
	 * Field descriptor (offset) for struct member 'merge_dist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrewModifierData screwmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = screwmodifierdata.__dna__addressof(ScrewModifierData.__DNA__FIELD__merge_dist);
	 * CPointer&lt;Float&gt; p_merge_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'merge_dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__merge_dist = new long[]{128, 148};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrewModifierData screwmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = screwmodifierdata.__dna__addressof(ScrewModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{132, 152};

	/**
	 * Field descriptor (offset) for struct member 'axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrewModifierData screwmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = screwmodifierdata.__dna__addressof(ScrewModifierData.__DNA__FIELD__axis);
	 * CPointer&lt;Byte&gt; p_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axis = new long[]{134, 154};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrewModifierData screwmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = screwmodifierdata.__dna__addressof(ScrewModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[5]'</li>
	 * <li>Actual Size (32bit/64bit): 5/5</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{135, 155};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrewModifierData screwmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = screwmodifierdata.__dna__addressof(ScrewModifierData.__DNA__FIELD___pad1);
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

	public ScrewModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ScrewModifierData(ScrewModifierData that) {
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
	 * Get method for struct member 'ob_axis'.
	 * @see #__DNA__FIELD__ob_axis
	 */
	
	public CPointer<BlenderObject> getOb_axis() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ob_axis'.
	 * @see #__DNA__FIELD__ob_axis
	 */
	
	public void setOb_axis(CPointer<BlenderObject> ob_axis) throws IOException
	{
		long __address = ((ob_axis == null) ? 0 : ob_axis.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'steps'.
	 * @see #__DNA__FIELD__steps
	 */
	
	public int getSteps() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 128);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'steps'.
	 * @see #__DNA__FIELD__steps
	 */
	
	public void setSteps(int steps) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 128, steps);
		} else {
			__io__block.writeInt(__io__address + 108, steps);
		}
	}

	/**
	 * Get method for struct member 'render_steps'.
	 * @see #__DNA__FIELD__render_steps
	 */
	
	public int getRender_steps() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 132);
		} else {
			return __io__block.readInt(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'render_steps'.
	 * @see #__DNA__FIELD__render_steps
	 */
	
	public void setRender_steps(int render_steps) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 132, render_steps);
		} else {
			__io__block.writeInt(__io__address + 112, render_steps);
		}
	}

	/**
	 * Get method for struct member 'iter'.
	 * @see #__DNA__FIELD__iter
	 */
	
	public int getIter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'iter'.
	 * @see #__DNA__FIELD__iter
	 */
	
	public void setIter(int iter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, iter);
		} else {
			__io__block.writeInt(__io__address + 116, iter);
		}
	}

	/**
	 * Get method for struct member 'screw_ofs'.
	 * @see #__DNA__FIELD__screw_ofs
	 */
	
	public float getScrew_ofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'screw_ofs'.
	 * @see #__DNA__FIELD__screw_ofs
	 */
	
	public void setScrew_ofs(float screw_ofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, screw_ofs);
		} else {
			__io__block.writeFloat(__io__address + 120, screw_ofs);
		}
	}

	/**
	 * Get method for struct member 'angle'.
	 * @see #__DNA__FIELD__angle
	 */
	
	public float getAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'angle'.
	 * @see #__DNA__FIELD__angle
	 */
	
	public void setAngle(float angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, angle);
		} else {
			__io__block.writeFloat(__io__address + 124, angle);
		}
	}

	/**
	 * Get method for struct member 'merge_dist'.
	 * @see #__DNA__FIELD__merge_dist
	 */
	
	public float getMerge_dist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'merge_dist'.
	 * @see #__DNA__FIELD__merge_dist
	 */
	
	public void setMerge_dist(float merge_dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, merge_dist);
		} else {
			__io__block.writeFloat(__io__address + 128, merge_dist);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 152);
		} else {
			return __io__block.readShort(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 152, flag);
		} else {
			__io__block.writeShort(__io__address + 132, flag);
		}
	}

	/**
	 * Get method for struct member 'axis'.
	 * @see #__DNA__FIELD__axis
	 */
	
	public byte getAxis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 154);
		} else {
			return __io__block.readByte(__io__address + 134);
		}
	}

	/**
	 * Set method for struct member 'axis'.
	 * @see #__DNA__FIELD__axis
	 */
	
	public void setAxis(byte axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 154, axis);
		} else {
			__io__block.writeByte(__io__address + 134, axis);
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
			5
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 155, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 135, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 155;
		} else {
			__dna__offset = 135;
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
	public CPointer<ScrewModifierData> __io__addressof() {
		return new CPointer<ScrewModifierData>(__io__address, new Class[]{ScrewModifierData.class}, __io__block, __io__blockTable);
	}

}
