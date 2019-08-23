package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BuildGpencilModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=188, size64=200)
public class BuildGpencilModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct BuildGpencilModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for BuildGpencilModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 484;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildGpencilModifierData buildgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildgpencilmodifierdata.__dna__addressof(BuildGpencilModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;GpencilModifierData&gt; p_modifier = p.cast(new Class[]{GpencilModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'GpencilModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 92/104</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If set, restrict modifier to operating on this layer. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildGpencilModifierData buildgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildgpencilmodifierdata.__dna__addressof(BuildGpencilModifierData.__DNA__FIELD__layername);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_layername = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layername'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layername = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member 'pass_index'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildGpencilModifierData buildgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildgpencilmodifierdata.__dna__addressof(BuildGpencilModifierData.__DNA__FIELD__pass_index);
	 * CPointer&lt;Integer&gt; p_pass_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass_index = new long[]{156, 168};

	/**
	 * Field descriptor (offset) for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildGpencilModifierData buildgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildgpencilmodifierdata.__dna__addressof(BuildGpencilModifierData.__DNA__FIELD__layer_pass);
	 * CPointer&lt;Integer&gt; p_layer_pass = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_pass'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_pass = new long[]{160, 172};

	/**
	 * Field descriptor (offset) for struct member 'start_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If GP_BUILD_RESTRICT_TIME is set, the defines the frame range where GP frames are considered. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildGpencilModifierData buildgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildgpencilmodifierdata.__dna__addressof(BuildGpencilModifierData.__DNA__FIELD__start_frame);
	 * CPointer&lt;Float&gt; p_start_frame = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'start_frame'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__start_frame = new long[]{164, 176};

	/**
	 * Field descriptor (offset) for struct member 'end_frame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildGpencilModifierData buildgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildgpencilmodifierdata.__dna__addressof(BuildGpencilModifierData.__DNA__FIELD__end_frame);
	 * CPointer&lt;Float&gt; p_end_frame = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'end_frame'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__end_frame = new long[]{168, 180};

	/**
	 * Field descriptor (offset) for struct member 'start_delay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For each pair of gp keys, number of frames before strokes start appearing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildGpencilModifierData buildgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildgpencilmodifierdata.__dna__addressof(BuildGpencilModifierData.__DNA__FIELD__start_delay);
	 * CPointer&lt;Float&gt; p_start_delay = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'start_delay'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__start_delay = new long[]{172, 184};

	/**
	 * Field descriptor (offset) for struct member 'length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For each pair of gp keys, number of frames that build effect must be completed within. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildGpencilModifierData buildgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildgpencilmodifierdata.__dna__addressof(BuildGpencilModifierData.__DNA__FIELD__length);
	 * CPointer&lt;Float&gt; p_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__length = new long[]{176, 188};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eGpencilBuild_Flag) Options for controlling modifier behavior. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildGpencilModifierData buildgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildgpencilmodifierdata.__dna__addressof(BuildGpencilModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{180, 192};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eGpencilBuild_Mode) How are strokes ordered. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildGpencilModifierData buildgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildgpencilmodifierdata.__dna__addressof(BuildGpencilModifierData.__DNA__FIELD__mode);
	 * CPointer&lt;Short&gt; p_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{182, 194};

	/**
	 * Field descriptor (offset) for struct member 'transition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eGpencilBuild_Transition) In what order do stroke points appear/disappear. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildGpencilModifierData buildgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildgpencilmodifierdata.__dna__addressof(BuildGpencilModifierData.__DNA__FIELD__transition);
	 * CPointer&lt;Short&gt; p_transition = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transition'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transition = new long[]{184, 196};

	/**
	 * Field descriptor (offset) for struct member 'time_alignment'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eGpencilBuild_TimeAlignment) For the "Concurrent" mode, when should "shorter" strips start/end. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildGpencilModifierData buildgpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildgpencilmodifierdata.__dna__addressof(BuildGpencilModifierData.__DNA__FIELD__time_alignment);
	 * CPointer&lt;Short&gt; p_time_alignment = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_alignment'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_alignment = new long[]{186, 198};

	public BuildGpencilModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BuildGpencilModifierData(BuildGpencilModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public GpencilModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GpencilModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new GpencilModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(GpencilModifierData modifier) throws IOException
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
	 * Get method for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If set, restrict modifier to operating on this layer. </p>
	 * @see #__DNA__FIELD__layername
	 */
	
	public CArrayFacade<Byte> getLayername() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If set, restrict modifier to operating on this layer. </p>
	 * @see #__DNA__FIELD__layername
	 */
	
	public void setLayername(CArrayFacade<Byte> layername) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(layername, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layername)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layername);
		} else {
			__io__generic__copy( getLayername(), layername);
		}
	}

	/**
	 * Get method for struct member 'pass_index'.
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public int getPass_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 168);
		} else {
			return __io__block.readInt(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'pass_index'.
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public void setPass_index(int pass_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 168, pass_index);
		} else {
			__io__block.writeInt(__io__address + 156, pass_index);
		}
	}

	/**
	 * Get method for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__layer_pass
	 */
	
	public int getLayer_pass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 172);
		} else {
			return __io__block.readInt(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__layer_pass
	 */
	
	public void setLayer_pass(int layer_pass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 172, layer_pass);
		} else {
			__io__block.writeInt(__io__address + 160, layer_pass);
		}
	}

	/**
	 * Get method for struct member 'start_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If GP_BUILD_RESTRICT_TIME is set, the defines the frame range where GP frames are considered. </p>
	 * @see #__DNA__FIELD__start_frame
	 */
	
	public float getStart_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'start_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If GP_BUILD_RESTRICT_TIME is set, the defines the frame range where GP frames are considered. </p>
	 * @see #__DNA__FIELD__start_frame
	 */
	
	public void setStart_frame(float start_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, start_frame);
		} else {
			__io__block.writeFloat(__io__address + 164, start_frame);
		}
	}

	/**
	 * Get method for struct member 'end_frame'.
	 * @see #__DNA__FIELD__end_frame
	 */
	
	public float getEnd_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'end_frame'.
	 * @see #__DNA__FIELD__end_frame
	 */
	
	public void setEnd_frame(float end_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, end_frame);
		} else {
			__io__block.writeFloat(__io__address + 168, end_frame);
		}
	}

	/**
	 * Get method for struct member 'start_delay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For each pair of gp keys, number of frames before strokes start appearing. </p>
	 * @see #__DNA__FIELD__start_delay
	 */
	
	public float getStart_delay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'start_delay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For each pair of gp keys, number of frames before strokes start appearing. </p>
	 * @see #__DNA__FIELD__start_delay
	 */
	
	public void setStart_delay(float start_delay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, start_delay);
		} else {
			__io__block.writeFloat(__io__address + 172, start_delay);
		}
	}

	/**
	 * Get method for struct member 'length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For each pair of gp keys, number of frames that build effect must be completed within. </p>
	 * @see #__DNA__FIELD__length
	 */
	
	public float getLength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For each pair of gp keys, number of frames that build effect must be completed within. </p>
	 * @see #__DNA__FIELD__length
	 */
	
	public void setLength(float length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, length);
		} else {
			__io__block.writeFloat(__io__address + 176, length);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eGpencilBuild_Flag) Options for controlling modifier behavior. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 192);
		} else {
			return __io__block.readShort(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eGpencilBuild_Flag) Options for controlling modifier behavior. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 192, flag);
		} else {
			__io__block.writeShort(__io__address + 180, flag);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eGpencilBuild_Mode) How are strokes ordered. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public short getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 194);
		} else {
			return __io__block.readShort(__io__address + 182);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eGpencilBuild_Mode) How are strokes ordered. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(short mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 194, mode);
		} else {
			__io__block.writeShort(__io__address + 182, mode);
		}
	}

	/**
	 * Get method for struct member 'transition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eGpencilBuild_Transition) In what order do stroke points appear/disappear. </p>
	 * @see #__DNA__FIELD__transition
	 */
	
	public short getTransition() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 196);
		} else {
			return __io__block.readShort(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'transition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eGpencilBuild_Transition) In what order do stroke points appear/disappear. </p>
	 * @see #__DNA__FIELD__transition
	 */
	
	public void setTransition(short transition) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 196, transition);
		} else {
			__io__block.writeShort(__io__address + 184, transition);
		}
	}

	/**
	 * Get method for struct member 'time_alignment'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eGpencilBuild_TimeAlignment) For the "Concurrent" mode, when should "shorter" strips start/end. </p>
	 * @see #__DNA__FIELD__time_alignment
	 */
	
	public short getTime_alignment() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 198);
		} else {
			return __io__block.readShort(__io__address + 186);
		}
	}

	/**
	 * Set method for struct member 'time_alignment'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eGpencilBuild_TimeAlignment) For the "Concurrent" mode, when should "shorter" strips start/end. </p>
	 * @see #__DNA__FIELD__time_alignment
	 */
	
	public void setTime_alignment(short time_alignment) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 198, time_alignment);
		} else {
			__io__block.writeShort(__io__address + 186, time_alignment);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BuildGpencilModifierData> __io__addressof() {
		return new CPointer<BuildGpencilModifierData>(__io__address, new Class[]{BuildGpencilModifierData.class}, __io__block, __io__blockTable);
	}

}
