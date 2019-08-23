package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CameraStereoSettings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  Stereo Settings </p>
 */

@CMetaData(size32=24, size64=24)
public class CameraStereoSettings extends CFacade {

	/**
	 * This is the sdna index of the struct CameraStereoSettings.
	 * <p>
	 * It is required when allocating a new block to store data for CameraStereoSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 24;

	/**
	 * Field descriptor (offset) for struct member 'interocular_distance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraStereoSettings camerastereosettings = ...;
	 * CPointer&lt;Object&gt; p = camerastereosettings.__dna__addressof(CameraStereoSettings.__DNA__FIELD__interocular_distance);
	 * CPointer&lt;Float&gt; p_interocular_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interocular_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interocular_distance = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'convergence_distance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraStereoSettings camerastereosettings = ...;
	 * CPointer&lt;Object&gt; p = camerastereosettings.__dna__addressof(CameraStereoSettings.__DNA__FIELD__convergence_distance);
	 * CPointer&lt;Float&gt; p_convergence_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'convergence_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__convergence_distance = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'convergence_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraStereoSettings camerastereosettings = ...;
	 * CPointer&lt;Object&gt; p = camerastereosettings.__dna__addressof(CameraStereoSettings.__DNA__FIELD__convergence_mode);
	 * CPointer&lt;Short&gt; p_convergence_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'convergence_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__convergence_mode = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'pivot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraStereoSettings camerastereosettings = ...;
	 * CPointer&lt;Object&gt; p = camerastereosettings.__dna__addressof(CameraStereoSettings.__DNA__FIELD__pivot);
	 * CPointer&lt;Short&gt; p_pivot = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pivot'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pivot = new long[]{10, 10};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraStereoSettings camerastereosettings = ...;
	 * CPointer&lt;Object&gt; p = camerastereosettings.__dna__addressof(CameraStereoSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraStereoSettings camerastereosettings = ...;
	 * CPointer&lt;Object&gt; p = camerastereosettings.__dna__addressof(CameraStereoSettings.__DNA__FIELD__pad);
	 * CPointer&lt;Short&gt; p_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{14, 14};

	/**
	 * Field descriptor (offset) for struct member 'pole_merge_angle_from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cut-off angle at which interocular distance start to fade down. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraStereoSettings camerastereosettings = ...;
	 * CPointer&lt;Object&gt; p = camerastereosettings.__dna__addressof(CameraStereoSettings.__DNA__FIELD__pole_merge_angle_from);
	 * CPointer&lt;Float&gt; p_pole_merge_angle_from = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pole_merge_angle_from'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pole_merge_angle_from = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'pole_merge_angle_to'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cut-off angle at which interocular distance stops to fade down. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CameraStereoSettings camerastereosettings = ...;
	 * CPointer&lt;Object&gt; p = camerastereosettings.__dna__addressof(CameraStereoSettings.__DNA__FIELD__pole_merge_angle_to);
	 * CPointer&lt;Float&gt; p_pole_merge_angle_to = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pole_merge_angle_to'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pole_merge_angle_to = new long[]{20, 20};

	public CameraStereoSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CameraStereoSettings(CameraStereoSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'interocular_distance'.
	 * @see #__DNA__FIELD__interocular_distance
	 */
	
	public float getInterocular_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'interocular_distance'.
	 * @see #__DNA__FIELD__interocular_distance
	 */
	
	public void setInterocular_distance(float interocular_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, interocular_distance);
		} else {
			__io__block.writeFloat(__io__address + 0, interocular_distance);
		}
	}

	/**
	 * Get method for struct member 'convergence_distance'.
	 * @see #__DNA__FIELD__convergence_distance
	 */
	
	public float getConvergence_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'convergence_distance'.
	 * @see #__DNA__FIELD__convergence_distance
	 */
	
	public void setConvergence_distance(float convergence_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, convergence_distance);
		} else {
			__io__block.writeFloat(__io__address + 4, convergence_distance);
		}
	}

	/**
	 * Get method for struct member 'convergence_mode'.
	 * @see #__DNA__FIELD__convergence_mode
	 */
	
	public short getConvergence_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'convergence_mode'.
	 * @see #__DNA__FIELD__convergence_mode
	 */
	
	public void setConvergence_mode(short convergence_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, convergence_mode);
		} else {
			__io__block.writeShort(__io__address + 8, convergence_mode);
		}
	}

	/**
	 * Get method for struct member 'pivot'.
	 * @see #__DNA__FIELD__pivot
	 */
	
	public short getPivot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'pivot'.
	 * @see #__DNA__FIELD__pivot
	 */
	
	public void setPivot(short pivot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10, pivot);
		} else {
			__io__block.writeShort(__io__address + 10, pivot);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12, flag);
		} else {
			__io__block.writeShort(__io__address + 12, flag);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public short getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 14);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(short pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 14, pad);
		} else {
			__io__block.writeShort(__io__address + 14, pad);
		}
	}

	/**
	 * Get method for struct member 'pole_merge_angle_from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cut-off angle at which interocular distance start to fade down. </p>
	 * @see #__DNA__FIELD__pole_merge_angle_from
	 */
	
	public float getPole_merge_angle_from() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'pole_merge_angle_from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cut-off angle at which interocular distance start to fade down. </p>
	 * @see #__DNA__FIELD__pole_merge_angle_from
	 */
	
	public void setPole_merge_angle_from(float pole_merge_angle_from) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, pole_merge_angle_from);
		} else {
			__io__block.writeFloat(__io__address + 16, pole_merge_angle_from);
		}
	}

	/**
	 * Get method for struct member 'pole_merge_angle_to'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cut-off angle at which interocular distance stops to fade down. </p>
	 * @see #__DNA__FIELD__pole_merge_angle_to
	 */
	
	public float getPole_merge_angle_to() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'pole_merge_angle_to'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cut-off angle at which interocular distance stops to fade down. </p>
	 * @see #__DNA__FIELD__pole_merge_angle_to
	 */
	
	public void setPole_merge_angle_to(float pole_merge_angle_to) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, pole_merge_angle_to);
		} else {
			__io__block.writeFloat(__io__address + 20, pole_merge_angle_to);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CameraStereoSettings> __io__addressof() {
		return new CPointer<CameraStereoSettings>(__io__address, new Class[]{CameraStereoSettings.class}, __io__block, __io__blockTable);
	}

}
