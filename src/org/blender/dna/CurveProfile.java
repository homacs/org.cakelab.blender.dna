package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CurveProfile'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> Defines a profile. </p>
 */

@CMetaData(size32=60, size64=72)
public class CurveProfile extends CFacade {

	/**
	 * This is the sdna index of the struct CurveProfile.
	 * <p>
	 * It is required when allocating a new block to store data for CurveProfile.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 777;

	/**
	 * Field descriptor (offset) for struct member 'path_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of user-added points that define the profile. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfile curveprofile = ...;
	 * CPointer&lt;Object&gt; p = curveprofile.__dna__addressof(CurveProfile.__DNA__FIELD__path_len);
	 * CPointer&lt;Short&gt; p_path_len = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path_len'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path_len = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'segments_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of sampled points. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfile curveprofile = ...;
	 * CPointer&lt;Object&gt; p = curveprofile.__dna__addressof(CurveProfile.__DNA__FIELD__segments_len);
	 * CPointer&lt;Short&gt; p_segments_len = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'segments_len'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__segments_len = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'preset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Preset to use when reset. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfile curveprofile = ...;
	 * CPointer&lt;Object&gt; p = curveprofile.__dna__addressof(CurveProfile.__DNA__FIELD__preset);
	 * CPointer&lt;Integer&gt; p_preset = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preset'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preset = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Sequence}  of points defining the shape of the curve. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfile curveprofile = ...;
	 * CPointer&lt;Object&gt; p = curveprofile.__dna__addressof(CurveProfile.__DNA__FIELD__path);
	 * CPointer&lt;CPointer&lt;CurveProfilePoint&gt;&gt; p_path = p.cast(new Class[]{CPointer.class, CurveProfilePoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path'</li>
	 * <li>Signature: 'CurveProfilePoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'table'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Display and evaluation table at higher resolution for curves. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfile curveprofile = ...;
	 * CPointer&lt;Object&gt; p = curveprofile.__dna__addressof(CurveProfile.__DNA__FIELD__table);
	 * CPointer&lt;CPointer&lt;CurveProfilePoint&gt;&gt; p_table = p.cast(new Class[]{CPointer.class, CurveProfilePoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'table'</li>
	 * <li>Signature: 'CurveProfilePoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__table = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Segments sampled from control points
	 * <h4>Blender Source Code</h4>
	 * <p> The positions of the sampled points. Used to display a preview of where they will be. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfile curveprofile = ...;
	 * CPointer&lt;Object&gt; p = curveprofile.__dna__addressof(CurveProfile.__DNA__FIELD__segments);
	 * CPointer&lt;CPointer&lt;CurveProfilePoint&gt;&gt; p_segments = p.cast(new Class[]{CPointer.class, CurveProfilePoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'segments'</li>
	 * <li>Signature: 'CurveProfilePoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__segments = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flag for mode states, sampling options, etc... </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfile curveprofile = ...;
	 * CPointer&lt;Object&gt; p = curveprofile.__dna__addressof(CurveProfile.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{20, 32};

	/**
	 * Field descriptor (offset) for struct member 'changed_timestamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used for keeping track how many times the widget is changed. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfile curveprofile = ...;
	 * CPointer&lt;Object&gt; p = curveprofile.__dna__addressof(CurveProfile.__DNA__FIELD__changed_timestamp);
	 * CPointer&lt;Integer&gt; p_changed_timestamp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'changed_timestamp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__changed_timestamp = new long[]{24, 36};

	/**
	 * Field descriptor (offset) for struct member 'view_rect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Widget's current view, and clipping rect (is default rect too). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfile curveprofile = ...;
	 * CPointer&lt;Object&gt; p = curveprofile.__dna__addressof(CurveProfile.__DNA__FIELD__view_rect);
	 * CPointer&lt;rctf&gt; p_view_rect = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_rect'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_rect = new long[]{28, 40};

	/**
	 * Field descriptor (offset) for struct member 'clip_rect'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfile curveprofile = ...;
	 * CPointer&lt;Object&gt; p = curveprofile.__dna__addressof(CurveProfile.__DNA__FIELD__clip_rect);
	 * CPointer&lt;rctf&gt; p_clip_rect = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clip_rect'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clip_rect = new long[]{44, 56};

	public CurveProfile(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CurveProfile(CurveProfile that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'path_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of user-added points that define the profile. </p>
	 * @see #__DNA__FIELD__path_len
	 */
	
	public short getPath_len() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'path_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of user-added points that define the profile. </p>
	 * @see #__DNA__FIELD__path_len
	 */
	
	public void setPath_len(short path_len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, path_len);
		} else {
			__io__block.writeShort(__io__address + 0, path_len);
		}
	}

	/**
	 * Get method for struct member 'segments_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of sampled points. </p>
	 * @see #__DNA__FIELD__segments_len
	 */
	
	public short getSegments_len() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'segments_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of sampled points. </p>
	 * @see #__DNA__FIELD__segments_len
	 */
	
	public void setSegments_len(short segments_len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, segments_len);
		} else {
			__io__block.writeShort(__io__address + 2, segments_len);
		}
	}

	/**
	 * Get method for struct member 'preset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Preset to use when reset. </p>
	 * @see #__DNA__FIELD__preset
	 */
	
	public int getPreset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'preset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Preset to use when reset. </p>
	 * @see #__DNA__FIELD__preset
	 */
	
	public void setPreset(int preset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, preset);
		} else {
			__io__block.writeInt(__io__address + 4, preset);
		}
	}

	/**
	 * Get method for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Sequence}  of points defining the shape of the curve. </p>
	 * @see #__DNA__FIELD__path
	 */
	
	public CPointer<CurveProfilePoint> getPath() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveProfilePoint.class};
		return new CPointer<CurveProfilePoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveProfilePoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Sequence}  of points defining the shape of the curve. </p>
	 * @see #__DNA__FIELD__path
	 */
	
	public void setPath(CPointer<CurveProfilePoint> path) throws IOException
	{
		long __address = ((path == null) ? 0 : path.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'table'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Display and evaluation table at higher resolution for curves. </p>
	 * @see #__DNA__FIELD__table
	 */
	
	public CPointer<CurveProfilePoint> getTable() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveProfilePoint.class};
		return new CPointer<CurveProfilePoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveProfilePoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'table'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Display and evaluation table at higher resolution for curves. </p>
	 * @see #__DNA__FIELD__table
	 */
	
	public void setTable(CPointer<CurveProfilePoint> table) throws IOException
	{
		long __address = ((table == null) ? 0 : table.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Segments sampled from control points
	 * <h4>Blender Source Code</h4>
	 * <p> The positions of the sampled points. Used to display a preview of where they will be. </p>
	 * @see #__DNA__FIELD__segments
	 */
	
	public CPointer<CurveProfilePoint> getSegments() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveProfilePoint.class};
		return new CPointer<CurveProfilePoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveProfilePoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Segments sampled from control points
	 * <h4>Blender Source Code</h4>
	 * <p> The positions of the sampled points. Used to display a preview of where they will be. </p>
	 * @see #__DNA__FIELD__segments
	 */
	
	public void setSegments(CPointer<CurveProfilePoint> segments) throws IOException
	{
		long __address = ((segments == null) ? 0 : segments.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flag for mode states, sampling options, etc... </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Flag for mode states, sampling options, etc... </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, flag);
		} else {
			__io__block.writeInt(__io__address + 20, flag);
		}
	}

	/**
	 * Get method for struct member 'changed_timestamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used for keeping track how many times the widget is changed. </p>
	 * @see #__DNA__FIELD__changed_timestamp
	 */
	
	public int getChanged_timestamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'changed_timestamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used for keeping track how many times the widget is changed. </p>
	 * @see #__DNA__FIELD__changed_timestamp
	 */
	
	public void setChanged_timestamp(int changed_timestamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, changed_timestamp);
		} else {
			__io__block.writeInt(__io__address + 24, changed_timestamp);
		}
	}

	/**
	 * Get method for struct member 'view_rect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Widget's current view, and clipping rect (is default rect too). </p>
	 * @see #__DNA__FIELD__view_rect
	 */
	
	public rctf getView_rect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 40, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 28, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'view_rect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Widget's current view, and clipping rect (is default rect too). </p>
	 * @see #__DNA__FIELD__view_rect
	 */
	
	public void setView_rect(rctf view_rect) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(view_rect, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, view_rect)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, view_rect);
		} else {
			__io__generic__copy( getView_rect(), view_rect);
		}
	}

	/**
	 * Get method for struct member 'clip_rect'.
	 * @see #__DNA__FIELD__clip_rect
	 */
	
	public rctf getClip_rect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 56, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 44, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'clip_rect'.
	 * @see #__DNA__FIELD__clip_rect
	 */
	
	public void setClip_rect(rctf clip_rect) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 44;
		}
		if (__io__equals(clip_rect, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, clip_rect)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, clip_rect);
		} else {
			__io__generic__copy( getClip_rect(), clip_rect);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CurveProfile> __io__addressof() {
		return new CPointer<CurveProfile>(__io__address, new Class[]{CurveProfile.class}, __io__block, __io__blockTable);
	}

}
