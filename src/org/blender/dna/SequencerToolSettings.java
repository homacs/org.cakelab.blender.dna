package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SequencerToolSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=20, size64=20)
public class SequencerToolSettings extends CFacade {

	/**
	 * This is the sdna index of the struct SequencerToolSettings.
	 * <p>
	 * It is required when allocating a new block to store data for SequencerToolSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 212;

	/**
	 * Field descriptor (offset) for struct member 'fit_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale fit method<h4>Blender Source Code:</h4>
	 * <p> eSeqImageFitMethod </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerToolSettings sequencertoolsettings = ...;
	 * CPointer&lt;Object&gt; p = sequencertoolsettings.__dna__addressof(SequencerToolSettings.__DNA__FIELD__fit_method);
	 * CPointer&lt;Integer&gt; p_fit_method = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fit_method'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fit_method = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'snap_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerToolSettings sequencertoolsettings = ...;
	 * CPointer&lt;Object&gt; p = sequencertoolsettings.__dna__addressof(SequencerToolSettings.__DNA__FIELD__snap_mode);
	 * CPointer&lt;Short&gt; p_snap_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap_mode = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'snap_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerToolSettings sequencertoolsettings = ...;
	 * CPointer&lt;Object&gt; p = sequencertoolsettings.__dna__addressof(SequencerToolSettings.__DNA__FIELD__snap_flag);
	 * CPointer&lt;Short&gt; p_snap_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap_flag = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'overlap_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How to resolve overlap after transformation<h4>Blender Source Code:</h4>
	 * <p> eSeqOverlapMode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerToolSettings sequencertoolsettings = ...;
	 * CPointer&lt;Object&gt; p = sequencertoolsettings.__dna__addressof(SequencerToolSettings.__DNA__FIELD__overlap_mode);
	 * CPointer&lt;Integer&gt; p_overlap_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overlap_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overlap_mode = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'snap_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance for snapping in pixels<h4>Blender Source Code:</h4>
	 * <p> When there are many snap points, 0-1 range corresponds to resolution from bound-box to all possible snap points. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerToolSettings sequencertoolsettings = ...;
	 * CPointer&lt;Object&gt; p = sequencertoolsettings.__dna__addressof(SequencerToolSettings.__DNA__FIELD__snap_distance);
	 * CPointer&lt;Integer&gt; p_snap_distance = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap_distance'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap_distance = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'pivot_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation or scaling pivot point
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerToolSettings sequencertoolsettings = ...;
	 * CPointer&lt;Object&gt; p = sequencertoolsettings.__dna__addressof(SequencerToolSettings.__DNA__FIELD__pivot_point);
	 * CPointer&lt;Integer&gt; p_pivot_point = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pivot_point'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pivot_point = new long[]{16, 16};

	public SequencerToolSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SequencerToolSettings(SequencerToolSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'fit_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale fit method<h4>Blender Source Code:</h4>
	 * <p> eSeqImageFitMethod </p>
	 * @see #__DNA__FIELD__fit_method
	 */
	
	public int getFit_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'fit_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale fit method<h4>Blender Source Code:</h4>
	 * <p> eSeqImageFitMethod </p>
	 * @see #__DNA__FIELD__fit_method
	 */
	
	public void setFit_method(int fit_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, fit_method);
		} else {
			__io__block.writeInt(__io__address + 0, fit_method);
		}
	}

	/**
	 * Get method for struct member 'snap_mode'.
	 * @see #__DNA__FIELD__snap_mode
	 */
	
	public short getSnap_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'snap_mode'.
	 * @see #__DNA__FIELD__snap_mode
	 */
	
	public void setSnap_mode(short snap_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, snap_mode);
		} else {
			__io__block.writeShort(__io__address + 4, snap_mode);
		}
	}

	/**
	 * Get method for struct member 'snap_flag'.
	 * @see #__DNA__FIELD__snap_flag
	 */
	
	public short getSnap_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'snap_flag'.
	 * @see #__DNA__FIELD__snap_flag
	 */
	
	public void setSnap_flag(short snap_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, snap_flag);
		} else {
			__io__block.writeShort(__io__address + 6, snap_flag);
		}
	}

	/**
	 * Get method for struct member 'overlap_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How to resolve overlap after transformation<h4>Blender Source Code:</h4>
	 * <p> eSeqOverlapMode </p>
	 * @see #__DNA__FIELD__overlap_mode
	 */
	
	public int getOverlap_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'overlap_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How to resolve overlap after transformation<h4>Blender Source Code:</h4>
	 * <p> eSeqOverlapMode </p>
	 * @see #__DNA__FIELD__overlap_mode
	 */
	
	public void setOverlap_mode(int overlap_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, overlap_mode);
		} else {
			__io__block.writeInt(__io__address + 8, overlap_mode);
		}
	}

	/**
	 * Get method for struct member 'snap_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance for snapping in pixels<h4>Blender Source Code:</h4>
	 * <p> When there are many snap points, 0-1 range corresponds to resolution from bound-box to all possible snap points. </p>
	 * @see #__DNA__FIELD__snap_distance
	 */
	
	public int getSnap_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'snap_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance for snapping in pixels<h4>Blender Source Code:</h4>
	 * <p> When there are many snap points, 0-1 range corresponds to resolution from bound-box to all possible snap points. </p>
	 * @see #__DNA__FIELD__snap_distance
	 */
	
	public void setSnap_distance(int snap_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, snap_distance);
		} else {
			__io__block.writeInt(__io__address + 12, snap_distance);
		}
	}

	/**
	 * Get method for struct member 'pivot_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation or scaling pivot point
	 * @see #__DNA__FIELD__pivot_point
	 */
	
	public int getPivot_point() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'pivot_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Rotation or scaling pivot point
	 * @see #__DNA__FIELD__pivot_point
	 */
	
	public void setPivot_point(int pivot_point) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, pivot_point);
		} else {
			__io__block.writeInt(__io__address + 16, pivot_point);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SequencerToolSettings> __io__addressof() {
		return new CPointer<SequencerToolSettings>(__io__address, new Class[]{SequencerToolSettings.class}, __io__block, __io__blockTable);
	}

}
