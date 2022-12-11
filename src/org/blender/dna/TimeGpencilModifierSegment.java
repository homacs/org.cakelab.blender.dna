package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'TimeGpencilModifierSegment'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=84, size64=88)
public class TimeGpencilModifierSegment extends CFacade {

	/**
	 * This is the sdna index of the struct TimeGpencilModifierSegment.
	 * <p>
	 * It is required when allocating a new block to store data for TimeGpencilModifierSegment.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 163;

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Name of the dash segment
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TimeGpencilModifierSegment timegpencilmodifiersegment = ...;
	 * CPointer&lt;Object&gt; p = timegpencilmodifiersegment.__dna__addressof(TimeGpencilModifierSegment.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'gpmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For path reference. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TimeGpencilModifierSegment timegpencilmodifiersegment = ...;
	 * CPointer&lt;Object&gt; p = timegpencilmodifiersegment.__dna__addressof(TimeGpencilModifierSegment.__DNA__FIELD__gpmd);
	 * CPointer&lt;CPointer&lt;TimeGpencilModifierData&gt;&gt; p_gpmd = p.cast(new Class[]{CPointer.class, TimeGpencilModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpmd'</li>
	 * <li>Signature: 'TimeGpencilModifierData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpmd = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'seg_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * First frame of the segment
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TimeGpencilModifierSegment timegpencilmodifiersegment = ...;
	 * CPointer&lt;Object&gt; p = timegpencilmodifiersegment.__dna__addressof(TimeGpencilModifierSegment.__DNA__FIELD__seg_start);
	 * CPointer&lt;Integer&gt; p_seg_start = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seg_start'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seg_start = new long[]{68, 72};

	/**
	 * Field descriptor (offset) for struct member 'seg_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Last frame of the segment
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TimeGpencilModifierSegment timegpencilmodifiersegment = ...;
	 * CPointer&lt;Object&gt; p = timegpencilmodifiersegment.__dna__addressof(TimeGpencilModifierSegment.__DNA__FIELD__seg_end);
	 * CPointer&lt;Integer&gt; p_seg_end = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seg_end'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seg_end = new long[]{72, 76};

	/**
	 * Field descriptor (offset) for struct member 'seg_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TimeGpencilModifierSegment timegpencilmodifiersegment = ...;
	 * CPointer&lt;Object&gt; p = timegpencilmodifiersegment.__dna__addressof(TimeGpencilModifierSegment.__DNA__FIELD__seg_mode);
	 * CPointer&lt;Integer&gt; p_seg_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seg_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seg_mode = new long[]{76, 80};

	/**
	 * Field descriptor (offset) for struct member 'seg_repeat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of cycle repeats
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TimeGpencilModifierSegment timegpencilmodifiersegment = ...;
	 * CPointer&lt;Object&gt; p = timegpencilmodifiersegment.__dna__addressof(TimeGpencilModifierSegment.__DNA__FIELD__seg_repeat);
	 * CPointer&lt;Integer&gt; p_seg_repeat = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seg_repeat'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seg_repeat = new long[]{80, 84};

	public TimeGpencilModifierSegment(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected TimeGpencilModifierSegment(TimeGpencilModifierSegment that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Name of the dash segment
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Name of the dash segment
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'gpmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For path reference. </p>
	 * @see #__DNA__FIELD__gpmd
	 */
	
	public CPointer<TimeGpencilModifierData> getGpmd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		}
		Class<?>[] __dna__targetTypes = new Class[]{TimeGpencilModifierData.class};
		return new CPointer<TimeGpencilModifierData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, TimeGpencilModifierData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For path reference. </p>
	 * @see #__DNA__FIELD__gpmd
	 */
	
	public void setGpmd(CPointer<TimeGpencilModifierData> gpmd) throws IOException
	{
		long __address = ((gpmd == null) ? 0 : gpmd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 64, __address);
		}
	}

	/**
	 * Get method for struct member 'seg_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * First frame of the segment
	 * @see #__DNA__FIELD__seg_start
	 */
	
	public int getSeg_start() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 72);
		} else {
			return __io__block.readInt(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'seg_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * First frame of the segment
	 * @see #__DNA__FIELD__seg_start
	 */
	
	public void setSeg_start(int seg_start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 72, seg_start);
		} else {
			__io__block.writeInt(__io__address + 68, seg_start);
		}
	}

	/**
	 * Get method for struct member 'seg_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Last frame of the segment
	 * @see #__DNA__FIELD__seg_end
	 */
	
	public int getSeg_end() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 76);
		} else {
			return __io__block.readInt(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'seg_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Last frame of the segment
	 * @see #__DNA__FIELD__seg_end
	 */
	
	public void setSeg_end(int seg_end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 76, seg_end);
		} else {
			__io__block.writeInt(__io__address + 72, seg_end);
		}
	}

	/**
	 * Get method for struct member 'seg_mode'.
	 * @see #__DNA__FIELD__seg_mode
	 */
	
	public int getSeg_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 80);
		} else {
			return __io__block.readInt(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'seg_mode'.
	 * @see #__DNA__FIELD__seg_mode
	 */
	
	public void setSeg_mode(int seg_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 80, seg_mode);
		} else {
			__io__block.writeInt(__io__address + 76, seg_mode);
		}
	}

	/**
	 * Get method for struct member 'seg_repeat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of cycle repeats
	 * @see #__DNA__FIELD__seg_repeat
	 */
	
	public int getSeg_repeat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'seg_repeat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of cycle repeats
	 * @see #__DNA__FIELD__seg_repeat
	 */
	
	public void setSeg_repeat(int seg_repeat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, seg_repeat);
		} else {
			__io__block.writeInt(__io__address + 80, seg_repeat);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<TimeGpencilModifierSegment> __io__addressof() {
		return new CPointer<TimeGpencilModifierSegment>(__io__address, new Class[]{TimeGpencilModifierSegment.class}, __io__block, __io__blockTable);
	}

}
