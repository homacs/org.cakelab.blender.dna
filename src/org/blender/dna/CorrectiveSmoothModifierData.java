package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CorrectiveSmoothModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=232, size64=264)
public class CorrectiveSmoothModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct CorrectiveSmoothModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for CorrectiveSmoothModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 146;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothModifierData correctivesmoothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothmodifierdata.__dna__addressof(CorrectiveSmoothModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 112/136</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'bind_coords_num'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NOTE: -1 is used to bind. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothModifierData correctivesmoothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothmodifierdata.__dna__addressof(CorrectiveSmoothModifierData.__DNA__FIELD__bind_coords_num);
	 * CPointer&lt;Integer&gt; p_bind_coords_num = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bind_coords_num'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bind_coords_num = new long[]{116, 144};

	/**
	 * Field descriptor (offset) for struct member 'lambda'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothModifierData correctivesmoothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothmodifierdata.__dna__addressof(CorrectiveSmoothModifierData.__DNA__FIELD__lambda);
	 * CPointer&lt;Float&gt; p_lambda = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lambda'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lambda = new long[]{120, 148};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothModifierData correctivesmoothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothmodifierdata.__dna__addressof(CorrectiveSmoothModifierData.__DNA__FIELD__scale);
	 * CPointer&lt;Float&gt; p_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale = new long[]{124, 152};

	/**
	 * Field descriptor (offset) for struct member 'repeat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothModifierData correctivesmoothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothmodifierdata.__dna__addressof(CorrectiveSmoothModifierData.__DNA__FIELD__repeat);
	 * CPointer&lt;Short&gt; p_repeat = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'repeat'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__repeat = new long[]{128, 156};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothModifierData correctivesmoothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothmodifierdata.__dna__addressof(CorrectiveSmoothModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{130, 158};

	/**
	 * Field descriptor (offset) for struct member 'smooth_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothModifierData correctivesmoothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothmodifierdata.__dna__addressof(CorrectiveSmoothModifierData.__DNA__FIELD__smooth_type);
	 * CPointer&lt;Byte&gt; p_smooth_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smooth_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smooth_type = new long[]{132, 160};

	/**
	 * Field descriptor (offset) for struct member 'rest_source'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothModifierData correctivesmoothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothmodifierdata.__dna__addressof(CorrectiveSmoothModifierData.__DNA__FIELD__rest_source);
	 * CPointer&lt;Byte&gt; p_rest_source = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rest_source'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rest_source = new long[]{133, 161};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothModifierData correctivesmoothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothmodifierdata.__dna__addressof(CorrectiveSmoothModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{134, 162};

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
	 * CorrectiveSmoothModifierData correctivesmoothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothmodifierdata.__dna__addressof(CorrectiveSmoothModifierData.__DNA__FIELD__defgrp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_defgrp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defgrp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defgrp_name = new long[]{140, 168};

	/**
	 * Field descriptor (offset) for struct member 'delta_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime-only cache </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothModifierData correctivesmoothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothmodifierdata.__dna__addressof(CorrectiveSmoothModifierData.__DNA__FIELD__delta_cache);
	 * CPointer&lt;CorrectiveSmoothDeltaCache&gt; p_delta_cache = p.cast(new Class[]{CorrectiveSmoothDeltaCache.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'delta_cache'</li>
	 * <li>Signature: 'CorrectiveSmoothDeltaCache'</li>
	 * <li>Actual Size (32bit/64bit): 28/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__delta_cache = new long[]{204, 232};

	public CorrectiveSmoothModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CorrectiveSmoothModifierData(CorrectiveSmoothModifierData that) {
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
	 * Get method for struct member 'bind_coords_num'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NOTE: -1 is used to bind. </p>
	 * @see #__DNA__FIELD__bind_coords_num
	 */
	
	public int getBind_coords_num() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 144);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'bind_coords_num'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NOTE: -1 is used to bind. </p>
	 * @see #__DNA__FIELD__bind_coords_num
	 */
	
	public void setBind_coords_num(int bind_coords_num) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 144, bind_coords_num);
		} else {
			__io__block.writeInt(__io__address + 116, bind_coords_num);
		}
	}

	/**
	 * Get method for struct member 'lambda'.
	 * @see #__DNA__FIELD__lambda
	 */
	
	public float getLambda() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'lambda'.
	 * @see #__DNA__FIELD__lambda
	 */
	
	public void setLambda(float lambda) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, lambda);
		} else {
			__io__block.writeFloat(__io__address + 120, lambda);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public float getScale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(float scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, scale);
		} else {
			__io__block.writeFloat(__io__address + 124, scale);
		}
	}

	/**
	 * Get method for struct member 'repeat'.
	 * @see #__DNA__FIELD__repeat
	 */
	
	public short getRepeat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 156);
		} else {
			return __io__block.readShort(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'repeat'.
	 * @see #__DNA__FIELD__repeat
	 */
	
	public void setRepeat(short repeat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 156, repeat);
		} else {
			__io__block.writeShort(__io__address + 128, repeat);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 158);
		} else {
			return __io__block.readShort(__io__address + 130);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 158, flag);
		} else {
			__io__block.writeShort(__io__address + 130, flag);
		}
	}

	/**
	 * Get method for struct member 'smooth_type'.
	 * @see #__DNA__FIELD__smooth_type
	 */
	
	public byte getSmooth_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 160);
		} else {
			return __io__block.readByte(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'smooth_type'.
	 * @see #__DNA__FIELD__smooth_type
	 */
	
	public void setSmooth_type(byte smooth_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 160, smooth_type);
		} else {
			__io__block.writeByte(__io__address + 132, smooth_type);
		}
	}

	/**
	 * Get method for struct member 'rest_source'.
	 * @see #__DNA__FIELD__rest_source
	 */
	
	public byte getRest_source() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 161);
		} else {
			return __io__block.readByte(__io__address + 133);
		}
	}

	/**
	 * Set method for struct member 'rest_source'.
	 * @see #__DNA__FIELD__rest_source
	 */
	
	public void setRest_source(byte rest_source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 161, rest_source);
		} else {
			__io__block.writeByte(__io__address + 133, rest_source);
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
			return new CArrayFacade<Byte>(__io__address + 162, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 134, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 162;
		} else {
			__dna__offset = 134;
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
			return new CArrayFacade<Byte>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 168;
		} else {
			__dna__offset = 140;
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
	 * Get method for struct member 'delta_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime-only cache </p>
	 * @see #__DNA__FIELD__delta_cache
	 */
	
	public CorrectiveSmoothDeltaCache getDelta_cache() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CorrectiveSmoothDeltaCache(__io__address + 232, __io__block, __io__blockTable);
		} else {
			return new CorrectiveSmoothDeltaCache(__io__address + 204, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'delta_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime-only cache </p>
	 * @see #__DNA__FIELD__delta_cache
	 */
	
	public void setDelta_cache(CorrectiveSmoothDeltaCache delta_cache) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 232;
		} else {
			__dna__offset = 204;
		}
		if (__io__equals(delta_cache, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, delta_cache)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, delta_cache);
		} else {
			__io__generic__copy( getDelta_cache(), delta_cache);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CorrectiveSmoothModifierData> __io__addressof() {
		return new CPointer<CorrectiveSmoothModifierData>(__io__address, new Class[]{CorrectiveSmoothModifierData.class}, __io__block, __io__blockTable);
	}

}
