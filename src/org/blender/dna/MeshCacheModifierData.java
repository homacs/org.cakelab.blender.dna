package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MeshCacheModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> cache modifier </p>
 */

@CMetaData(size32=1164, size64=1184)
public class MeshCacheModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct MeshCacheModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for MeshCacheModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 145;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> File format. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{101, 121};

	/**
	 * Field descriptor (offset) for struct member 'time_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__time_mode);
	 * CPointer&lt;Byte&gt; p_time_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_mode = new long[]{102, 122};

	/**
	 * Field descriptor (offset) for struct member 'play_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__play_mode);
	 * CPointer&lt;Byte&gt; p_play_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'play_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__play_mode = new long[]{103, 123};

	/**
	 * Field descriptor (offset) for struct member 'forward_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> axis conversion </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__forward_axis);
	 * CPointer&lt;Byte&gt; p_forward_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'forward_axis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__forward_axis = new long[]{104, 124};

	/**
	 * Field descriptor (offset) for struct member 'up_axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__up_axis);
	 * CPointer&lt;Byte&gt; p_up_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'up_axis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__up_axis = new long[]{105, 125};

	/**
	 * Field descriptor (offset) for struct member 'flip_axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__flip_axis);
	 * CPointer&lt;Byte&gt; p_flip_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flip_axis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flip_axis = new long[]{106, 126};

	/**
	 * Field descriptor (offset) for struct member 'interp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__interp);
	 * CPointer&lt;Byte&gt; p_interp = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interp'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interp = new long[]{107, 127};

	/**
	 * Field descriptor (offset) for struct member 'factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__factor);
	 * CPointer&lt;Float&gt; p_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__factor = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'deform_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__deform_mode);
	 * CPointer&lt;Byte&gt; p_deform_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'deform_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__deform_mode = new long[]{112, 132};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{113, 133};

	/**
	 * Field descriptor (offset) for struct member 'frame_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> play_mode == MOD_MESHCACHE_PLAY_CFEA </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__frame_start);
	 * CPointer&lt;Float&gt; p_frame_start = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frame_start'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frame_start = new long[]{120, 140};

	/**
	 * Field descriptor (offset) for struct member 'frame_scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__frame_scale);
	 * CPointer&lt;Float&gt; p_frame_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frame_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frame_scale = new long[]{124, 144};

	/**
	 * Field descriptor (offset) for struct member 'eval_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> play_mode == MOD_MESHCACHE_PLAY_EVAL we could use one float for all these but their purpose is very different </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__eval_frame);
	 * CPointer&lt;Float&gt; p_eval_frame = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eval_frame'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eval_frame = new long[]{128, 148};

	/**
	 * Field descriptor (offset) for struct member 'eval_time'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__eval_time);
	 * CPointer&lt;Float&gt; p_eval_time = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eval_time'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eval_time = new long[]{132, 152};

	/**
	 * Field descriptor (offset) for struct member 'eval_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__eval_factor);
	 * CPointer&lt;Float&gt; p_eval_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eval_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eval_factor = new long[]{136, 156};

	/**
	 * Field descriptor (offset) for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshCacheModifierData meshcachemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshcachemodifierdata.__dna__addressof(MeshCacheModifierData.__DNA__FIELD__filepath);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_filepath = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filepath'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filepath = new long[]{140, 160};

	public MeshCacheModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MeshCacheModifierData(MeshCacheModifierData that) {
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
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 120);
		} else {
			return __io__block.readByte(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 120, flag);
		} else {
			__io__block.writeByte(__io__address + 100, flag);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> File format. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 121);
		} else {
			return __io__block.readByte(__io__address + 101);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> File format. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 121, type);
		} else {
			__io__block.writeByte(__io__address + 101, type);
		}
	}

	/**
	 * Get method for struct member 'time_mode'.
	 * @see #__DNA__FIELD__time_mode
	 */
	
	public byte getTime_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 122);
		} else {
			return __io__block.readByte(__io__address + 102);
		}
	}

	/**
	 * Set method for struct member 'time_mode'.
	 * @see #__DNA__FIELD__time_mode
	 */
	
	public void setTime_mode(byte time_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 122, time_mode);
		} else {
			__io__block.writeByte(__io__address + 102, time_mode);
		}
	}

	/**
	 * Get method for struct member 'play_mode'.
	 * @see #__DNA__FIELD__play_mode
	 */
	
	public byte getPlay_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 123);
		} else {
			return __io__block.readByte(__io__address + 103);
		}
	}

	/**
	 * Set method for struct member 'play_mode'.
	 * @see #__DNA__FIELD__play_mode
	 */
	
	public void setPlay_mode(byte play_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 123, play_mode);
		} else {
			__io__block.writeByte(__io__address + 103, play_mode);
		}
	}

	/**
	 * Get method for struct member 'forward_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> axis conversion </p>
	 * @see #__DNA__FIELD__forward_axis
	 */
	
	public byte getForward_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 124);
		} else {
			return __io__block.readByte(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'forward_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> axis conversion </p>
	 * @see #__DNA__FIELD__forward_axis
	 */
	
	public void setForward_axis(byte forward_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 124, forward_axis);
		} else {
			__io__block.writeByte(__io__address + 104, forward_axis);
		}
	}

	/**
	 * Get method for struct member 'up_axis'.
	 * @see #__DNA__FIELD__up_axis
	 */
	
	public byte getUp_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 125);
		} else {
			return __io__block.readByte(__io__address + 105);
		}
	}

	/**
	 * Set method for struct member 'up_axis'.
	 * @see #__DNA__FIELD__up_axis
	 */
	
	public void setUp_axis(byte up_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 125, up_axis);
		} else {
			__io__block.writeByte(__io__address + 105, up_axis);
		}
	}

	/**
	 * Get method for struct member 'flip_axis'.
	 * @see #__DNA__FIELD__flip_axis
	 */
	
	public byte getFlip_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 126);
		} else {
			return __io__block.readByte(__io__address + 106);
		}
	}

	/**
	 * Set method for struct member 'flip_axis'.
	 * @see #__DNA__FIELD__flip_axis
	 */
	
	public void setFlip_axis(byte flip_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 126, flip_axis);
		} else {
			__io__block.writeByte(__io__address + 106, flip_axis);
		}
	}

	/**
	 * Get method for struct member 'interp'.
	 * @see #__DNA__FIELD__interp
	 */
	
	public byte getInterp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 127);
		} else {
			return __io__block.readByte(__io__address + 107);
		}
	}

	/**
	 * Set method for struct member 'interp'.
	 * @see #__DNA__FIELD__interp
	 */
	
	public void setInterp(byte interp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 127, interp);
		} else {
			__io__block.writeByte(__io__address + 107, interp);
		}
	}

	/**
	 * Get method for struct member 'factor'.
	 * @see #__DNA__FIELD__factor
	 */
	
	public float getFactor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 128);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'factor'.
	 * @see #__DNA__FIELD__factor
	 */
	
	public void setFactor(float factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 128, factor);
		} else {
			__io__block.writeFloat(__io__address + 108, factor);
		}
	}

	/**
	 * Get method for struct member 'deform_mode'.
	 * @see #__DNA__FIELD__deform_mode
	 */
	
	public byte getDeform_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 132);
		} else {
			return __io__block.readByte(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'deform_mode'.
	 * @see #__DNA__FIELD__deform_mode
	 */
	
	public void setDeform_mode(byte deform_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 132, deform_mode);
		} else {
			__io__block.writeByte(__io__address + 112, deform_mode);
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
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 133, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 113, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 113;
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
	 * Get method for struct member 'frame_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> play_mode == MOD_MESHCACHE_PLAY_CFEA </p>
	 * @see #__DNA__FIELD__frame_start
	 */
	
	public float getFrame_start() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'frame_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> play_mode == MOD_MESHCACHE_PLAY_CFEA </p>
	 * @see #__DNA__FIELD__frame_start
	 */
	
	public void setFrame_start(float frame_start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, frame_start);
		} else {
			__io__block.writeFloat(__io__address + 120, frame_start);
		}
	}

	/**
	 * Get method for struct member 'frame_scale'.
	 * @see #__DNA__FIELD__frame_scale
	 */
	
	public float getFrame_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'frame_scale'.
	 * @see #__DNA__FIELD__frame_scale
	 */
	
	public void setFrame_scale(float frame_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, frame_scale);
		} else {
			__io__block.writeFloat(__io__address + 124, frame_scale);
		}
	}

	/**
	 * Get method for struct member 'eval_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> play_mode == MOD_MESHCACHE_PLAY_EVAL we could use one float for all these but their purpose is very different </p>
	 * @see #__DNA__FIELD__eval_frame
	 */
	
	public float getEval_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'eval_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> play_mode == MOD_MESHCACHE_PLAY_EVAL we could use one float for all these but their purpose is very different </p>
	 * @see #__DNA__FIELD__eval_frame
	 */
	
	public void setEval_frame(float eval_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, eval_frame);
		} else {
			__io__block.writeFloat(__io__address + 128, eval_frame);
		}
	}

	/**
	 * Get method for struct member 'eval_time'.
	 * @see #__DNA__FIELD__eval_time
	 */
	
	public float getEval_time() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'eval_time'.
	 * @see #__DNA__FIELD__eval_time
	 */
	
	public void setEval_time(float eval_time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, eval_time);
		} else {
			__io__block.writeFloat(__io__address + 132, eval_time);
		}
	}

	/**
	 * Get method for struct member 'eval_factor'.
	 * @see #__DNA__FIELD__eval_factor
	 */
	
	public float getEval_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'eval_factor'.
	 * @see #__DNA__FIELD__eval_factor
	 */
	
	public void setEval_factor(float eval_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, eval_factor);
		} else {
			__io__block.writeFloat(__io__address + 136, eval_factor);
		}
	}

	/**
	 * Get method for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX. </p>
	 * @see #__DNA__FIELD__filepath
	 */
	
	public CArrayFacade<Byte> getFilepath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX. </p>
	 * @see #__DNA__FIELD__filepath
	 */
	
	public void setFilepath(CArrayFacade<Byte> filepath) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(filepath, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, filepath)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, filepath);
		} else {
			__io__generic__copy( getFilepath(), filepath);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MeshCacheModifierData> __io__addressof() {
		return new CPointer<MeshCacheModifierData>(__io__address, new Class[]{MeshCacheModifierData.class}, __io__block, __io__blockTable);
	}

}
