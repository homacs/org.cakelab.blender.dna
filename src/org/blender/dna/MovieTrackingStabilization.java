package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieTrackingStabilization'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=44, size64=48)
public class MovieTrackingStabilization extends CFacade {

	/**
	 * This is the sdna index of the struct MovieTrackingStabilization.
	 * <p>
	 * It is required when allocating a new block to store data for MovieTrackingStabilization.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 499;

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
	 * Field descriptor (offset) for struct member 'maxscale'.
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
	public static final long[] __DNA__FIELD__maxscale = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'rot_track'.
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
	public static final long[] __DNA__FIELD__rot_track = new long[]{16, 16};

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
	public static final long[] __DNA__FIELD__locinf = new long[]{20, 24};

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
	public static final long[] __DNA__FIELD__scaleinf = new long[]{24, 28};

	/**
	 * Field descriptor (offset) for struct member 'rotinf'.
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
	public static final long[] __DNA__FIELD__rotinf = new long[]{28, 32};

	/**
	 * Field descriptor (offset) for struct member 'filter'.
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
	public static final long[] __DNA__FIELD__filter = new long[]{32, 36};

	/**
	 * Field descriptor (offset) for struct member 'ok'.
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
	public static final long[] __DNA__FIELD__ok = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
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
	public static final long[] __DNA__FIELD__scale = new long[]{40, 44};

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
	 * Get method for struct member 'maxscale'.
	 * @see #__DNA__FIELD__maxscale
	 */
	
	public float getMaxscale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'maxscale'.
	 * @see #__DNA__FIELD__maxscale
	 */
	
	public void setMaxscale(float maxscale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, maxscale);
		} else {
			__io__block.writeFloat(__io__address + 12, maxscale);
		}
	}

	/**
	 * Get method for struct member 'rot_track'.
	 * @see #__DNA__FIELD__rot_track
	 */
	
	public CPointer<MovieTrackingTrack> getRot_track() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingTrack.class};
		return new CPointer<MovieTrackingTrack>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingTrack.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rot_track'.
	 * @see #__DNA__FIELD__rot_track
	 */
	
	public void setRot_track(CPointer<MovieTrackingTrack> rot_track) throws IOException
	{
		long __address = ((rot_track == null) ? 0 : rot_track.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'locinf'.
	 * @see #__DNA__FIELD__locinf
	 */
	
	public float getLocinf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'locinf'.
	 * @see #__DNA__FIELD__locinf
	 */
	
	public void setLocinf(float locinf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, locinf);
		} else {
			__io__block.writeFloat(__io__address + 20, locinf);
		}
	}

	/**
	 * Get method for struct member 'scaleinf'.
	 * @see #__DNA__FIELD__scaleinf
	 */
	
	public float getScaleinf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'scaleinf'.
	 * @see #__DNA__FIELD__scaleinf
	 */
	
	public void setScaleinf(float scaleinf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, scaleinf);
		} else {
			__io__block.writeFloat(__io__address + 24, scaleinf);
		}
	}

	/**
	 * Get method for struct member 'rotinf'.
	 * @see #__DNA__FIELD__rotinf
	 */
	
	public float getRotinf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'rotinf'.
	 * @see #__DNA__FIELD__rotinf
	 */
	
	public void setRotinf(float rotinf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, rotinf);
		} else {
			__io__block.writeFloat(__io__address + 28, rotinf);
		}
	}

	/**
	 * Get method for struct member 'filter'.
	 * @see #__DNA__FIELD__filter
	 */
	
	public int getFilter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'filter'.
	 * @see #__DNA__FIELD__filter
	 */
	
	public void setFilter(int filter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, filter);
		} else {
			__io__block.writeInt(__io__address + 32, filter);
		}
	}

	/**
	 * Get method for struct member 'ok'.
	 * @see #__DNA__FIELD__ok
	 */
	
	public int getOk() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'ok'.
	 * @see #__DNA__FIELD__ok
	 */
	
	public void setOk(int ok) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, ok);
		} else {
			__io__block.writeInt(__io__address + 36, ok);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public float getScale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(float scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, scale);
		} else {
			__io__block.writeFloat(__io__address + 40, scale);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieTrackingStabilization> __io__addressof() {
		return new CPointer<MovieTrackingStabilization>(__io__address, new Class[]{MovieTrackingStabilization.class}, __io__block, __io__blockTable);
	}

}
