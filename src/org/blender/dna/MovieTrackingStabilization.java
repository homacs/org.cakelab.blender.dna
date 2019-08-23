package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieTrackingStabilization'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=68, size64=72)
public class MovieTrackingStabilization extends CFacade {

	/**
	 * This is the sdna index of the struct MovieTrackingStabilization.
	 * <p>
	 * It is required when allocating a new block to store data for MovieTrackingStabilization.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 550;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'tot_track'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__tot_track);
	 * CPointer&lt;Integer&gt; p_tot_track = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_track'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_track = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'act_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number of translation tracks and index of active track in list </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__act_track);
	 * CPointer&lt;Integer&gt; p_act_track = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_track'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_track = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'tot_rot_track'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__tot_rot_track);
	 * CPointer&lt;Integer&gt; p_tot_rot_track = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_rot_track'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_rot_track = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'act_rot_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number of rotation tracks and index of active track in list </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__act_rot_track);
	 * CPointer&lt;Integer&gt; p_act_rot_track = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_rot_track'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_rot_track = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'maxscale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 2d stabilization max auto-scale factor </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__maxscale);
	 * CPointer&lt;Float&gt; p_maxscale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxscale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxscale = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'rot_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> use TRACK_USE_2D_STAB_ROT on individual tracks instead </p>
	 * @deprecated
	 *  Deprecateduse TRACK_USE_2D_STAB_ROT on individual tracks instead </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__rot_track);
	 * CPointer&lt;CPointer&lt;MovieTrackingTrack&gt;&gt; p_rot_track = p.cast(new Class[]{CPointer.class, MovieTrackingTrack.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rot_track'</li>
	 * <li>Signature: 'MovieTrackingTrack*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rot_track = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'anchor_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Reference point to anchor stabilization (other frames will be adjusted relative to this frame's position)<h4>Blender Source Code:</h4>
	 * <p> reference point to anchor stabilization offset </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__anchor_frame);
	 * CPointer&lt;Integer&gt; p_anchor_frame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anchor_frame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anchor_frame = new long[]{28, 32};

	/**
	 * Field descriptor (offset) for struct member 'target_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> expected target position of frame after raw stabilization, will be subtracted </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__target_pos);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_target_pos = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'target_pos'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__target_pos = new long[]{32, 36};

	/**
	 * Field descriptor (offset) for struct member 'target_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> expected target rotation of frame after raw stabilization, will be compensated </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__target_rot);
	 * CPointer&lt;Float&gt; p_target_rot = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'target_rot'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__target_rot = new long[]{40, 44};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> zoom factor known to be present on original footage. Also used for autoscale </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__scale);
	 * CPointer&lt;Float&gt; p_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale = new long[]{44, 48};

	/**
	 * Field descriptor (offset) for struct member 'locinf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__locinf);
	 * CPointer&lt;Float&gt; p_locinf = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'locinf'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__locinf = new long[]{48, 52};

	/**
	 * Field descriptor (offset) for struct member 'scaleinf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__scaleinf);
	 * CPointer&lt;Float&gt; p_scaleinf = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scaleinf'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scaleinf = new long[]{52, 56};

	/**
	 * Field descriptor (offset) for struct member 'rotinf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> influence on location, scale and rotation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__rotinf);
	 * CPointer&lt;Float&gt; p_rotinf = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotinf'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotinf = new long[]{56, 60};

	/**
	 * Field descriptor (offset) for struct member 'filter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> filter used for pixel interpolation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__filter);
	 * CPointer&lt;Integer&gt; p_filter = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter = new long[]{60, 64};

	/**
	 * Field descriptor (offset) for struct member 'ok'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> initialization and run-time data <p> Without effect now, we initialize on every frame. Formerly used for caching of init values </p>
	 * @deprecated
	 *  DeprecatedWithout effect now, we initialize on every frame. Formerly used for caching of init values </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingStabilization movietrackingstabilization = ...;
	 * CPointer&lt;Object&gt; p = movietrackingstabilization.__dna__addressof(MovieTrackingStabilization.__DNA__FIELD__ok);
	 * CPointer&lt;Integer&gt; p_ok = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ok'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ok = new long[]{64, 68};

	public MovieTrackingStabilization(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieTrackingStabilization(MovieTrackingStabilization that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, flag);
		} else {
			__io__block.writeInt(__io__address + 0, flag);
		}
	}

	/**
	 * Get method for struct member 'tot_track'.
	 * @see #__DNA__FIELD__tot_track
	 */
	
	public int getTot_track() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'tot_track'.
	 * @see #__DNA__FIELD__tot_track
	 */
	
	public void setTot_track(int tot_track) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, tot_track);
		} else {
			__io__block.writeInt(__io__address + 4, tot_track);
		}
	}

	/**
	 * Get method for struct member 'act_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number of translation tracks and index of active track in list </p>
	 * @see #__DNA__FIELD__act_track
	 */
	
	public int getAct_track() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'act_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number of translation tracks and index of active track in list </p>
	 * @see #__DNA__FIELD__act_track
	 */
	
	public void setAct_track(int act_track) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, act_track);
		} else {
			__io__block.writeInt(__io__address + 8, act_track);
		}
	}

	/**
	 * Get method for struct member 'tot_rot_track'.
	 * @see #__DNA__FIELD__tot_rot_track
	 */
	
	public int getTot_rot_track() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'tot_rot_track'.
	 * @see #__DNA__FIELD__tot_rot_track
	 */
	
	public void setTot_rot_track(int tot_rot_track) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, tot_rot_track);
		} else {
			__io__block.writeInt(__io__address + 12, tot_rot_track);
		}
	}

	/**
	 * Get method for struct member 'act_rot_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number of rotation tracks and index of active track in list </p>
	 * @see #__DNA__FIELD__act_rot_track
	 */
	
	public int getAct_rot_track() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'act_rot_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number of rotation tracks and index of active track in list </p>
	 * @see #__DNA__FIELD__act_rot_track
	 */
	
	public void setAct_rot_track(int act_rot_track) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, act_rot_track);
		} else {
			__io__block.writeInt(__io__address + 16, act_rot_track);
		}
	}

	/**
	 * Get method for struct member 'maxscale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 2d stabilization max auto-scale factor </p>
	 * @see #__DNA__FIELD__maxscale
	 */
	
	public float getMaxscale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'maxscale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 2d stabilization max auto-scale factor </p>
	 * @see #__DNA__FIELD__maxscale
	 */
	
	public void setMaxscale(float maxscale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, maxscale);
		} else {
			__io__block.writeFloat(__io__address + 20, maxscale);
		}
	}

	/**
	 * Get method for struct member 'rot_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> use TRACK_USE_2D_STAB_ROT on individual tracks instead </p>
	 * @deprecated
	 *  Deprecateduse TRACK_USE_2D_STAB_ROT on individual tracks instead </p>
	 * @see #__DNA__FIELD__rot_track
	 */
	
	public CPointer<MovieTrackingTrack> getRot_track() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingTrack.class};
		return new CPointer<MovieTrackingTrack>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingTrack.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rot_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> use TRACK_USE_2D_STAB_ROT on individual tracks instead </p>
	 * @deprecated
	 *  Deprecateduse TRACK_USE_2D_STAB_ROT on individual tracks instead </p>
	 * @see #__DNA__FIELD__rot_track
	 */
	
	public void setRot_track(CPointer<MovieTrackingTrack> rot_track) throws IOException
	{
		long __address = ((rot_track == null) ? 0 : rot_track.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'anchor_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Reference point to anchor stabilization (other frames will be adjusted relative to this frame's position)<h4>Blender Source Code:</h4>
	 * <p> reference point to anchor stabilization offset </p>
	 * @see #__DNA__FIELD__anchor_frame
	 */
	
	public int getAnchor_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'anchor_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Reference point to anchor stabilization (other frames will be adjusted relative to this frame's position)<h4>Blender Source Code:</h4>
	 * <p> reference point to anchor stabilization offset </p>
	 * @see #__DNA__FIELD__anchor_frame
	 */
	
	public void setAnchor_frame(int anchor_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, anchor_frame);
		} else {
			__io__block.writeInt(__io__address + 28, anchor_frame);
		}
	}

	/**
	 * Get method for struct member 'target_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> expected target position of frame after raw stabilization, will be subtracted </p>
	 * @see #__DNA__FIELD__target_pos
	 */
	
	public CArrayFacade<Float> getTarget_pos() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'target_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> expected target position of frame after raw stabilization, will be subtracted </p>
	 * @see #__DNA__FIELD__target_pos
	 */
	
	public void setTarget_pos(CArrayFacade<Float> target_pos) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 36;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(target_pos, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, target_pos)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, target_pos);
		} else {
			__io__generic__copy( getTarget_pos(), target_pos);
		}
	}

	/**
	 * Get method for struct member 'target_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> expected target rotation of frame after raw stabilization, will be compensated </p>
	 * @see #__DNA__FIELD__target_rot
	 */
	
	public float getTarget_rot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'target_rot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> expected target rotation of frame after raw stabilization, will be compensated </p>
	 * @see #__DNA__FIELD__target_rot
	 */
	
	public void setTarget_rot(float target_rot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, target_rot);
		} else {
			__io__block.writeFloat(__io__address + 40, target_rot);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> zoom factor known to be present on original footage. Also used for autoscale </p>
	 * @see #__DNA__FIELD__scale
	 */
	
	public float getScale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> zoom factor known to be present on original footage. Also used for autoscale </p>
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(float scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, scale);
		} else {
			__io__block.writeFloat(__io__address + 44, scale);
		}
	}

	/**
	 * Get method for struct member 'locinf'.
	 * @see #__DNA__FIELD__locinf
	 */
	
	public float getLocinf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'locinf'.
	 * @see #__DNA__FIELD__locinf
	 */
	
	public void setLocinf(float locinf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, locinf);
		} else {
			__io__block.writeFloat(__io__address + 48, locinf);
		}
	}

	/**
	 * Get method for struct member 'scaleinf'.
	 * @see #__DNA__FIELD__scaleinf
	 */
	
	public float getScaleinf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'scaleinf'.
	 * @see #__DNA__FIELD__scaleinf
	 */
	
	public void setScaleinf(float scaleinf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, scaleinf);
		} else {
			__io__block.writeFloat(__io__address + 52, scaleinf);
		}
	}

	/**
	 * Get method for struct member 'rotinf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> influence on location, scale and rotation </p>
	 * @see #__DNA__FIELD__rotinf
	 */
	
	public float getRotinf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'rotinf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> influence on location, scale and rotation </p>
	 * @see #__DNA__FIELD__rotinf
	 */
	
	public void setRotinf(float rotinf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, rotinf);
		} else {
			__io__block.writeFloat(__io__address + 56, rotinf);
		}
	}

	/**
	 * Get method for struct member 'filter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> filter used for pixel interpolation </p>
	 * @see #__DNA__FIELD__filter
	 */
	
	public int getFilter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 64);
		} else {
			return __io__block.readInt(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'filter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> filter used for pixel interpolation </p>
	 * @see #__DNA__FIELD__filter
	 */
	
	public void setFilter(int filter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 64, filter);
		} else {
			__io__block.writeInt(__io__address + 60, filter);
		}
	}

	/**
	 * Get method for struct member 'ok'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> initialization and run-time data <p> Without effect now, we initialize on every frame. Formerly used for caching of init values </p>
	 * @deprecated
	 *  DeprecatedWithout effect now, we initialize on every frame. Formerly used for caching of init values </p>
	 * @see #__DNA__FIELD__ok
	 */
	
	public int getOk() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 68);
		} else {
			return __io__block.readInt(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'ok'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> initialization and run-time data <p> Without effect now, we initialize on every frame. Formerly used for caching of init values </p>
	 * @deprecated
	 *  DeprecatedWithout effect now, we initialize on every frame. Formerly used for caching of init values </p>
	 * @see #__DNA__FIELD__ok
	 */
	
	public void setOk(int ok) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 68, ok);
		} else {
			__io__block.writeInt(__io__address + 64, ok);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieTrackingStabilization> __io__addressof() {
		return new CPointer<MovieTrackingStabilization>(__io__address, new Class[]{MovieTrackingStabilization.class}, __io__block, __io__blockTable);
	}

}
