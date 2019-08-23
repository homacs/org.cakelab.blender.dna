package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'GPUDOFSettings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> properties for dof effect </p>
 */

@CMetaData(size32=24, size64=24)
public class GPUDOFSettings extends CFacade {

	/**
	 * This is the sdna index of the struct GPUDOFSettings.
	 * <p>
	 * It is required when allocating a new block to store data for GPUDOFSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 21;

	/**
	 * Field descriptor (offset) for struct member 'focus_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Viewport depth of field focus distance<h4>Blender Source Code:</h4>
	 * <p> focal distance for depth of field </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GPUDOFSettings gpudofsettings = ...;
	 * CPointer&lt;Object&gt; p = gpudofsettings.__dna__addressof(GPUDOFSettings.__DNA__FIELD__focus_distance);
	 * CPointer&lt;Float&gt; p_focus_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'focus_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__focus_distance = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'fstop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * F-stop for dof effect
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GPUDOFSettings gpudofsettings = ...;
	 * CPointer&lt;Object&gt; p = gpudofsettings.__dna__addressof(GPUDOFSettings.__DNA__FIELD__fstop);
	 * CPointer&lt;Float&gt; p_fstop = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fstop'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fstop = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'focal_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Focal length for dof effect
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GPUDOFSettings gpudofsettings = ...;
	 * CPointer&lt;Object&gt; p = gpudofsettings.__dna__addressof(GPUDOFSettings.__DNA__FIELD__focal_length);
	 * CPointer&lt;Float&gt; p_focal_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'focal_length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__focal_length = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'sensor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of sensor
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GPUDOFSettings gpudofsettings = ...;
	 * CPointer&lt;Object&gt; p = gpudofsettings.__dna__addressof(GPUDOFSettings.__DNA__FIELD__sensor);
	 * CPointer&lt;Float&gt; p_sensor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sensor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sensor = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'num_blades'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GPUDOFSettings gpudofsettings = ...;
	 * CPointer&lt;Object&gt; p = gpudofsettings.__dna__addressof(GPUDOFSettings.__DNA__FIELD__num_blades);
	 * CPointer&lt;Integer&gt; p_num_blades = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'num_blades'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__num_blades = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'high_quality'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GPUDOFSettings gpudofsettings = ...;
	 * CPointer&lt;Object&gt; p = gpudofsettings.__dna__addressof(GPUDOFSettings.__DNA__FIELD__high_quality);
	 * CPointer&lt;Integer&gt; p_high_quality = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'high_quality'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__high_quality = new long[]{20, 20};

	public GPUDOFSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected GPUDOFSettings(GPUDOFSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'focus_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Viewport depth of field focus distance<h4>Blender Source Code:</h4>
	 * <p> focal distance for depth of field </p>
	 * @see #__DNA__FIELD__focus_distance
	 */
	
	public float getFocus_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'focus_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Viewport depth of field focus distance<h4>Blender Source Code:</h4>
	 * <p> focal distance for depth of field </p>
	 * @see #__DNA__FIELD__focus_distance
	 */
	
	public void setFocus_distance(float focus_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, focus_distance);
		} else {
			__io__block.writeFloat(__io__address + 0, focus_distance);
		}
	}

	/**
	 * Get method for struct member 'fstop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * F-stop for dof effect
	 * @see #__DNA__FIELD__fstop
	 */
	
	public float getFstop() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'fstop'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * F-stop for dof effect
	 * @see #__DNA__FIELD__fstop
	 */
	
	public void setFstop(float fstop) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, fstop);
		} else {
			__io__block.writeFloat(__io__address + 4, fstop);
		}
	}

	/**
	 * Get method for struct member 'focal_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Focal length for dof effect
	 * @see #__DNA__FIELD__focal_length
	 */
	
	public float getFocal_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'focal_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Focal length for dof effect
	 * @see #__DNA__FIELD__focal_length
	 */
	
	public void setFocal_length(float focal_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, focal_length);
		} else {
			__io__block.writeFloat(__io__address + 8, focal_length);
		}
	}

	/**
	 * Get method for struct member 'sensor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of sensor
	 * @see #__DNA__FIELD__sensor
	 */
	
	public float getSensor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'sensor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Size of sensor
	 * @see #__DNA__FIELD__sensor
	 */
	
	public void setSensor(float sensor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, sensor);
		} else {
			__io__block.writeFloat(__io__address + 12, sensor);
		}
	}

	/**
	 * Get method for struct member 'num_blades'.
	 * @see #__DNA__FIELD__num_blades
	 */
	
	public int getNum_blades() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'num_blades'.
	 * @see #__DNA__FIELD__num_blades
	 */
	
	public void setNum_blades(int num_blades) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, num_blades);
		} else {
			__io__block.writeInt(__io__address + 16, num_blades);
		}
	}

	/**
	 * Get method for struct member 'high_quality'.
	 * @see #__DNA__FIELD__high_quality
	 */
	
	public int getHigh_quality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'high_quality'.
	 * @see #__DNA__FIELD__high_quality
	 */
	
	public void setHigh_quality(int high_quality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, high_quality);
		} else {
			__io__block.writeInt(__io__address + 20, high_quality);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<GPUDOFSettings> __io__addressof() {
		return new CPointer<GPUDOFSettings>(__io__address, new Class[]{GPUDOFSettings.class}, __io__block, __io__blockTable);
	}

}
