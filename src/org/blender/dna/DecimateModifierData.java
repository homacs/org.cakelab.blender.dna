package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'DecimateModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=188, size64=208)
public class DecimateModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct DecimateModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for DecimateModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 109;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DecimateModifierData decimatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = decimatemodifierdata.__dna__addressof(DecimateModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'percent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_COLLAPSE). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DecimateModifierData decimatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = decimatemodifierdata.__dna__addressof(DecimateModifierData.__DNA__FIELD__percent);
	 * CPointer&lt;Float&gt; p_percent = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'percent'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__percent = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'iter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_UNSUBDIV). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DecimateModifierData decimatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = decimatemodifierdata.__dna__addressof(DecimateModifierData.__DNA__FIELD__iter);
	 * CPointer&lt;Short&gt; p_iter = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iter'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iter = new long[]{104, 124};

	/**
	 * Field descriptor (offset) for struct member 'delimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_DISSOLVE). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DecimateModifierData decimatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = decimatemodifierdata.__dna__addressof(DecimateModifierData.__DNA__FIELD__delimit);
	 * CPointer&lt;Byte&gt; p_delimit = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'delimit'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__delimit = new long[]{106, 126};

	/**
	 * Field descriptor (offset) for struct member 'symmetry_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_COLLAPSE). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DecimateModifierData decimatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = decimatemodifierdata.__dna__addressof(DecimateModifierData.__DNA__FIELD__symmetry_axis);
	 * CPointer&lt;Byte&gt; p_symmetry_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'symmetry_axis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__symmetry_axis = new long[]{107, 127};

	/**
	 * Field descriptor (offset) for struct member 'angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_DISSOLVE). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DecimateModifierData decimatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = decimatemodifierdata.__dna__addressof(DecimateModifierData.__DNA__FIELD__angle);
	 * CPointer&lt;Float&gt; p_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angle = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DecimateModifierData decimatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = decimatemodifierdata.__dna__addressof(DecimateModifierData.__DNA__FIELD__defgrp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_defgrp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defgrp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defgrp_name = new long[]{112, 132};

	/**
	 * Field descriptor (offset) for struct member 'defgrp_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DecimateModifierData decimatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = decimatemodifierdata.__dna__addressof(DecimateModifierData.__DNA__FIELD__defgrp_factor);
	 * CPointer&lt;Float&gt; p_defgrp_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defgrp_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defgrp_factor = new long[]{176, 196};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DecimateModifierData decimatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = decimatemodifierdata.__dna__addressof(DecimateModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{180, 200};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DecimateModifierData decimatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = decimatemodifierdata.__dna__addressof(DecimateModifierData.__DNA__FIELD__mode);
	 * CPointer&lt;Short&gt; p_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{182, 202};

	/**
	 * Field descriptor (offset) for struct member 'face_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime only </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DecimateModifierData decimatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = decimatemodifierdata.__dna__addressof(DecimateModifierData.__DNA__FIELD__face_count);
	 * CPointer&lt;Integer&gt; p_face_count = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'face_count'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__face_count = new long[]{184, 204};

	public DecimateModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected DecimateModifierData(DecimateModifierData that) {
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
	 * Get method for struct member 'percent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_COLLAPSE). </p>
	 * @see #__DNA__FIELD__percent
	 */
	
	public float getPercent() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'percent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_COLLAPSE). </p>
	 * @see #__DNA__FIELD__percent
	 */
	
	public void setPercent(float percent) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, percent);
		} else {
			__io__block.writeFloat(__io__address + 100, percent);
		}
	}

	/**
	 * Get method for struct member 'iter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_UNSUBDIV). </p>
	 * @see #__DNA__FIELD__iter
	 */
	
	public short getIter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 124);
		} else {
			return __io__block.readShort(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'iter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_UNSUBDIV). </p>
	 * @see #__DNA__FIELD__iter
	 */
	
	public void setIter(short iter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 124, iter);
		} else {
			__io__block.writeShort(__io__address + 104, iter);
		}
	}

	/**
	 * Get method for struct member 'delimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_DISSOLVE). </p>
	 * @see #__DNA__FIELD__delimit
	 */
	
	public byte getDelimit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 126);
		} else {
			return __io__block.readByte(__io__address + 106);
		}
	}

	/**
	 * Set method for struct member 'delimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_DISSOLVE). </p>
	 * @see #__DNA__FIELD__delimit
	 */
	
	public void setDelimit(byte delimit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 126, delimit);
		} else {
			__io__block.writeByte(__io__address + 106, delimit);
		}
	}

	/**
	 * Get method for struct member 'symmetry_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_COLLAPSE). </p>
	 * @see #__DNA__FIELD__symmetry_axis
	 */
	
	public byte getSymmetry_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 127);
		} else {
			return __io__block.readByte(__io__address + 107);
		}
	}

	/**
	 * Set method for struct member 'symmetry_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_COLLAPSE). </p>
	 * @see #__DNA__FIELD__symmetry_axis
	 */
	
	public void setSymmetry_axis(byte symmetry_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 127, symmetry_axis);
		} else {
			__io__block.writeByte(__io__address + 107, symmetry_axis);
		}
	}

	/**
	 * Get method for struct member 'angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_DISSOLVE). </p>
	 * @see #__DNA__FIELD__angle
	 */
	
	public float getAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 128);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (mode == MOD_DECIM_MODE_DISSOLVE). </p>
	 * @see #__DNA__FIELD__angle
	 */
	
	public void setAngle(float angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 128, angle);
		} else {
			__io__block.writeFloat(__io__address + 108, angle);
		}
	}

	/**
	 * Get method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public CArrayFacade<Byte> getDefgrp_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public void setDefgrp_name(CArrayFacade<Byte> defgrp_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 132;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(defgrp_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, defgrp_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, defgrp_name);
		} else {
			__io__generic__copy( getDefgrp_name(), defgrp_name);
		}
	}

	/**
	 * Get method for struct member 'defgrp_factor'.
	 * @see #__DNA__FIELD__defgrp_factor
	 */
	
	public float getDefgrp_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 196);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'defgrp_factor'.
	 * @see #__DNA__FIELD__defgrp_factor
	 */
	
	public void setDefgrp_factor(float defgrp_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 196, defgrp_factor);
		} else {
			__io__block.writeFloat(__io__address + 176, defgrp_factor);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 200);
		} else {
			return __io__block.readShort(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 200, flag);
		} else {
			__io__block.writeShort(__io__address + 180, flag);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public short getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 202);
		} else {
			return __io__block.readShort(__io__address + 182);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(short mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 202, mode);
		} else {
			__io__block.writeShort(__io__address + 182, mode);
		}
	}

	/**
	 * Get method for struct member 'face_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime only </p>
	 * @see #__DNA__FIELD__face_count
	 */
	
	public int getFace_count() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 204);
		} else {
			return __io__block.readInt(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'face_count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime only </p>
	 * @see #__DNA__FIELD__face_count
	 */
	
	public void setFace_count(int face_count) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 204, face_count);
		} else {
			__io__block.writeInt(__io__address + 184, face_count);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<DecimateModifierData> __io__addressof() {
		return new CPointer<DecimateModifierData>(__io__address, new Class[]{DecimateModifierData.class}, __io__block, __io__blockTable);
	}

}
