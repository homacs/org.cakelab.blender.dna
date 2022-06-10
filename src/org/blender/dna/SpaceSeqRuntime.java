package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpaceSeqRuntime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=28, size64=32)
public class SpaceSeqRuntime extends CFacade {

	/**
	 * This is the sdna index of the struct SpaceSeqRuntime.
	 * <p>
	 * It is required when allocating a new block to store data for SpaceSeqRuntime.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 243;

	/**
	 * Field descriptor (offset) for struct member 'last_thumbnail_area'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Required for Thumbnail job start condition. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSeqRuntime spaceseqruntime = ...;
	 * CPointer&lt;Object&gt; p = spaceseqruntime.__dna__addressof(SpaceSeqRuntime.__DNA__FIELD__last_thumbnail_area);
	 * CPointer&lt;rctf&gt; p_last_thumbnail_area = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_thumbnail_area'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_thumbnail_area = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'last_displayed_thumbnails'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stores lists of most recently displayed thumbnails. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSeqRuntime spaceseqruntime = ...;
	 * CPointer&lt;Object&gt; p = spaceseqruntime.__dna__addressof(SpaceSeqRuntime.__DNA__FIELD__last_displayed_thumbnails);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_last_displayed_thumbnails = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_displayed_thumbnails'</li>
	 * <li>Signature: 'GHash*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_displayed_thumbnails = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'rename_channel_index'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSeqRuntime spaceseqruntime = ...;
	 * CPointer&lt;Object&gt; p = spaceseqruntime.__dna__addressof(SpaceSeqRuntime.__DNA__FIELD__rename_channel_index);
	 * CPointer&lt;Integer&gt; p_rename_channel_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rename_channel_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rename_channel_index = new long[]{20, 24};

	/**
	 * Field descriptor (offset) for struct member 'timeline_clamp_custom_range'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceSeqRuntime spaceseqruntime = ...;
	 * CPointer&lt;Object&gt; p = spaceseqruntime.__dna__addressof(SpaceSeqRuntime.__DNA__FIELD__timeline_clamp_custom_range);
	 * CPointer&lt;Float&gt; p_timeline_clamp_custom_range = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'timeline_clamp_custom_range'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__timeline_clamp_custom_range = new long[]{24, 28};

	public SpaceSeqRuntime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpaceSeqRuntime(SpaceSeqRuntime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'last_thumbnail_area'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Required for Thumbnail job start condition. </p>
	 * @see #__DNA__FIELD__last_thumbnail_area
	 */
	
	public rctf getLast_thumbnail_area() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'last_thumbnail_area'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Required for Thumbnail job start condition. </p>
	 * @see #__DNA__FIELD__last_thumbnail_area
	 */
	
	public void setLast_thumbnail_area(rctf last_thumbnail_area) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(last_thumbnail_area, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, last_thumbnail_area)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, last_thumbnail_area);
		} else {
			__io__generic__copy( getLast_thumbnail_area(), last_thumbnail_area);
		}
	}

	/**
	 * Get method for struct member 'last_displayed_thumbnails'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stores lists of most recently displayed thumbnails. </p>
	 * @see #__DNA__FIELD__last_displayed_thumbnails
	 */
	
	public CPointer<Object> getLast_displayed_thumbnails() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'last_displayed_thumbnails'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stores lists of most recently displayed thumbnails. </p>
	 * @see #__DNA__FIELD__last_displayed_thumbnails
	 */
	
	public void setLast_displayed_thumbnails(CPointer<Object> last_displayed_thumbnails) throws IOException
	{
		long __address = ((last_displayed_thumbnails == null) ? 0 : last_displayed_thumbnails.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'rename_channel_index'.
	 * @see #__DNA__FIELD__rename_channel_index
	 */
	
	public int getRename_channel_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'rename_channel_index'.
	 * @see #__DNA__FIELD__rename_channel_index
	 */
	
	public void setRename_channel_index(int rename_channel_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, rename_channel_index);
		} else {
			__io__block.writeInt(__io__address + 20, rename_channel_index);
		}
	}

	/**
	 * Get method for struct member 'timeline_clamp_custom_range'.
	 * @see #__DNA__FIELD__timeline_clamp_custom_range
	 */
	
	public float getTimeline_clamp_custom_range() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'timeline_clamp_custom_range'.
	 * @see #__DNA__FIELD__timeline_clamp_custom_range
	 */
	
	public void setTimeline_clamp_custom_range(float timeline_clamp_custom_range) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, timeline_clamp_custom_range);
		} else {
			__io__block.writeFloat(__io__address + 24, timeline_clamp_custom_range);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpaceSeqRuntime> __io__addressof() {
		return new CPointer<SpaceSeqRuntime>(__io__address, new Class[]{SpaceSeqRuntime.class}, __io__block, __io__blockTable);
	}

}
