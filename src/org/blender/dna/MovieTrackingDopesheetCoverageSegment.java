package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieTrackingDopesheetCoverageSegment'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=24, size64=32)
public class MovieTrackingDopesheetCoverageSegment extends CFacade {

	/**
	 * This is the sdna index of the struct MovieTrackingDopesheetCoverageSegment.
	 * <p>
	 * It is required when allocating a new block to store data for MovieTrackingDopesheetCoverageSegment.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 559;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingDopesheetCoverageSegment movietrackingdopesheetcoveragesegment = ...;
	 * CPointer&lt;Object&gt; p = movietrackingdopesheetcoveragesegment.__dna__addressof(MovieTrackingDopesheetCoverageSegment.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;MovieTrackingDopesheetCoverageSegment&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, MovieTrackingDopesheetCoverageSegment.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'MovieTrackingDopesheetCoverageSegment*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingDopesheetCoverageSegment movietrackingdopesheetcoveragesegment = ...;
	 * CPointer&lt;Object&gt; p = movietrackingdopesheetcoveragesegment.__dna__addressof(MovieTrackingDopesheetCoverageSegment.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;MovieTrackingDopesheetCoverageSegment&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, MovieTrackingDopesheetCoverageSegment.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'MovieTrackingDopesheetCoverageSegment*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'coverage'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingDopesheetCoverageSegment movietrackingdopesheetcoveragesegment = ...;
	 * CPointer&lt;Object&gt; p = movietrackingdopesheetcoveragesegment.__dna__addressof(MovieTrackingDopesheetCoverageSegment.__DNA__FIELD__coverage);
	 * CPointer&lt;Integer&gt; p_coverage = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coverage'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coverage = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'start_frame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingDopesheetCoverageSegment movietrackingdopesheetcoveragesegment = ...;
	 * CPointer&lt;Object&gt; p = movietrackingdopesheetcoveragesegment.__dna__addressof(MovieTrackingDopesheetCoverageSegment.__DNA__FIELD__start_frame);
	 * CPointer&lt;Integer&gt; p_start_frame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'start_frame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__start_frame = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'end_frame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingDopesheetCoverageSegment movietrackingdopesheetcoveragesegment = ...;
	 * CPointer&lt;Object&gt; p = movietrackingdopesheetcoveragesegment.__dna__addressof(MovieTrackingDopesheetCoverageSegment.__DNA__FIELD__end_frame);
	 * CPointer&lt;Integer&gt; p_end_frame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'end_frame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__end_frame = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingDopesheetCoverageSegment movietrackingdopesheetcoveragesegment = ...;
	 * CPointer&lt;Object&gt; p = movietrackingdopesheetcoveragesegment.__dna__addressof(MovieTrackingDopesheetCoverageSegment.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{20, 28};

	public MovieTrackingDopesheetCoverageSegment(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieTrackingDopesheetCoverageSegment(MovieTrackingDopesheetCoverageSegment that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<MovieTrackingDopesheetCoverageSegment> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingDopesheetCoverageSegment.class};
		return new CPointer<MovieTrackingDopesheetCoverageSegment>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingDopesheetCoverageSegment.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<MovieTrackingDopesheetCoverageSegment> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<MovieTrackingDopesheetCoverageSegment> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingDopesheetCoverageSegment.class};
		return new CPointer<MovieTrackingDopesheetCoverageSegment>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingDopesheetCoverageSegment.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<MovieTrackingDopesheetCoverageSegment> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'coverage'.
	 * @see #__DNA__FIELD__coverage
	 */
	
	public int getCoverage() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'coverage'.
	 * @see #__DNA__FIELD__coverage
	 */
	
	public void setCoverage(int coverage) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, coverage);
		} else {
			__io__block.writeInt(__io__address + 8, coverage);
		}
	}

	/**
	 * Get method for struct member 'start_frame'.
	 * @see #__DNA__FIELD__start_frame
	 */
	
	public int getStart_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'start_frame'.
	 * @see #__DNA__FIELD__start_frame
	 */
	
	public void setStart_frame(int start_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, start_frame);
		} else {
			__io__block.writeInt(__io__address + 12, start_frame);
		}
	}

	/**
	 * Get method for struct member 'end_frame'.
	 * @see #__DNA__FIELD__end_frame
	 */
	
	public int getEnd_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'end_frame'.
	 * @see #__DNA__FIELD__end_frame
	 */
	
	public void setEnd_frame(int end_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, end_frame);
		} else {
			__io__block.writeInt(__io__address + 16, end_frame);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, pad);
		} else {
			__io__block.writeInt(__io__address + 20, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieTrackingDopesheetCoverageSegment> __io__addressof() {
		return new CPointer<MovieTrackingDopesheetCoverageSegment>(__io__address, new Class[]{MovieTrackingDopesheetCoverageSegment.class}, __io__block, __io__blockTable);
	}

}
