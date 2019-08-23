package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieTrackingDopesheet'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=32, size64=48)
public class MovieTrackingDopesheet extends CFacade {

	/**
	 * This is the sdna index of the struct MovieTrackingDopesheet.
	 * <p>
	 * It is required when allocating a new block to store data for MovieTrackingDopesheet.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 556;

	/**
	 * Field descriptor (offset) for struct member 'ok'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flag if dopesheet information is still relevant </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingDopesheet movietrackingdopesheet = ...;
	 * CPointer&lt;Object&gt; p = movietrackingdopesheet.__dna__addressof(MovieTrackingDopesheet.__DNA__FIELD__ok);
	 * CPointer&lt;Integer&gt; p_ok = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ok'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ok = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'sort_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method to be used to sort channels in dopesheet view<h4>Blender Source Code:</h4>
	 * <p> method to be used to sort tracks </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingDopesheet movietrackingdopesheet = ...;
	 * CPointer&lt;Object&gt; p = movietrackingdopesheet.__dna__addressof(MovieTrackingDopesheet.__DNA__FIELD__sort_method);
	 * CPointer&lt;Short&gt; p_sort_method = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sort_method'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sort_method = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dopesheet building flag such as inverted order of sort </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingDopesheet movietrackingdopesheet = ...;
	 * CPointer&lt;Object&gt; p = movietrackingdopesheet.__dna__addressof(MovieTrackingDopesheet.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'coverage_segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** runtime stuff ** summary </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingDopesheet movietrackingdopesheet = ...;
	 * CPointer&lt;Object&gt; p = movietrackingdopesheet.__dna__addressof(MovieTrackingDopesheet.__DNA__FIELD__coverage_segments);
	 * CPointer&lt;ListBase&gt; p_coverage_segments = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coverage_segments'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coverage_segments = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'channels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> detailed </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingDopesheet movietrackingdopesheet = ...;
	 * CPointer&lt;Object&gt; p = movietrackingdopesheet.__dna__addressof(MovieTrackingDopesheet.__DNA__FIELD__channels);
	 * CPointer&lt;ListBase&gt; p_channels = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'channels'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__channels = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'tot_channel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingDopesheet movietrackingdopesheet = ...;
	 * CPointer&lt;Object&gt; p = movietrackingdopesheet.__dna__addressof(MovieTrackingDopesheet.__DNA__FIELD__tot_channel);
	 * CPointer&lt;Integer&gt; p_tot_channel = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_channel'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_channel = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingDopesheet movietrackingdopesheet = ...;
	 * CPointer&lt;Object&gt; p = movietrackingdopesheet.__dna__addressof(MovieTrackingDopesheet.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{28, 44};

	public MovieTrackingDopesheet(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieTrackingDopesheet(MovieTrackingDopesheet that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'ok'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flag if dopesheet information is still relevant </p>
	 * @see #__DNA__FIELD__ok
	 */
	
	public int getOk() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'ok'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flag if dopesheet information is still relevant </p>
	 * @see #__DNA__FIELD__ok
	 */
	
	public void setOk(int ok) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, ok);
		} else {
			__io__block.writeInt(__io__address + 0, ok);
		}
	}

	/**
	 * Get method for struct member 'sort_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method to be used to sort channels in dopesheet view<h4>Blender Source Code:</h4>
	 * <p> method to be used to sort tracks </p>
	 * @see #__DNA__FIELD__sort_method
	 */
	
	public short getSort_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'sort_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method to be used to sort channels in dopesheet view<h4>Blender Source Code:</h4>
	 * <p> method to be used to sort tracks </p>
	 * @see #__DNA__FIELD__sort_method
	 */
	
	public void setSort_method(short sort_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, sort_method);
		} else {
			__io__block.writeShort(__io__address + 4, sort_method);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dopesheet building flag such as inverted order of sort </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dopesheet building flag such as inverted order of sort </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, flag);
		} else {
			__io__block.writeShort(__io__address + 6, flag);
		}
	}

	/**
	 * Get method for struct member 'coverage_segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** runtime stuff ** summary </p>
	 * @see #__DNA__FIELD__coverage_segments
	 */
	
	public ListBase getCoverage_segments() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'coverage_segments'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** runtime stuff ** summary </p>
	 * @see #__DNA__FIELD__coverage_segments
	 */
	
	public void setCoverage_segments(ListBase coverage_segments) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(coverage_segments, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, coverage_segments)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, coverage_segments);
		} else {
			__io__generic__copy( getCoverage_segments(), coverage_segments);
		}
	}

	/**
	 * Get method for struct member 'channels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> detailed </p>
	 * @see #__DNA__FIELD__channels
	 */
	
	public ListBase getChannels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 24, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'channels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> detailed </p>
	 * @see #__DNA__FIELD__channels
	 */
	
	public void setChannels(ListBase channels) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(channels, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, channels)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, channels);
		} else {
			__io__generic__copy( getChannels(), channels);
		}
	}

	/**
	 * Get method for struct member 'tot_channel'.
	 * @see #__DNA__FIELD__tot_channel
	 */
	
	public int getTot_channel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'tot_channel'.
	 * @see #__DNA__FIELD__tot_channel
	 */
	
	public void setTot_channel(int tot_channel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, tot_channel);
		} else {
			__io__block.writeInt(__io__address + 24, tot_channel);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, pad);
		} else {
			__io__block.writeInt(__io__address + 28, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieTrackingDopesheet> __io__addressof() {
		return new CPointer<MovieTrackingDopesheet>(__io__address, new Class[]{MovieTrackingDopesheet.class}, __io__block, __io__blockTable);
	}

}
