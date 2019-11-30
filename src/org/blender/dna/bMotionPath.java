package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bMotionPath'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> ........ Motion {@link Path}  data cache (mpath)<ul><li><p> for elements providing transforms (i.e. Objects or PoseChannels) </p></li></ul> 
 * for elements providing transforms (i.e. Objects or PoseChannels) 
 * </p>
 */

@CMetaData(size32=52, size64=72)
public class bMotionPath extends CFacade {

	/**
	 * This is the sdna index of the struct bMotionPath.
	 * <p>
	 * It is required when allocating a new block to store data for bMotionPath.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 313;

	/**
	 * Field descriptor (offset) for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Path}  samples. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMotionPath bmotionpath = ...;
	 * CPointer&lt;Object&gt; p = bmotionpath.__dna__addressof(bMotionPath.__DNA__FIELD__points);
	 * CPointer&lt;CPointer&lt;bMotionPathVert&gt;&gt; p_points = p.cast(new Class[]{CPointer.class, bMotionPathVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'points'</li>
	 * <li>Signature: 'bMotionPathVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__points = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of cached verts. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMotionPath bmotionpath = ...;
	 * CPointer&lt;Object&gt; p = bmotionpath.__dna__addressof(bMotionPath.__DNA__FIELD__length);
	 * CPointer&lt;Integer&gt; p_length = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'length'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__length = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'start_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For drawing paths, the start frame number. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMotionPath bmotionpath = ...;
	 * CPointer&lt;Object&gt; p = bmotionpath.__dna__addressof(bMotionPath.__DNA__FIELD__start_frame);
	 * CPointer&lt;Integer&gt; p_start_frame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'start_frame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__start_frame = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'end_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For drawing paths, the end frame number. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMotionPath bmotionpath = ...;
	 * CPointer&lt;Object&gt; p = bmotionpath.__dna__addressof(bMotionPath.__DNA__FIELD__end_frame);
	 * CPointer&lt;Integer&gt; p_end_frame = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'end_frame'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__end_frame = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional custom color. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMotionPath bmotionpath = ...;
	 * CPointer&lt;Object&gt; p = bmotionpath.__dna__addressof(bMotionPath.__DNA__FIELD__color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member 'line_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Line thickness. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMotionPath bmotionpath = ...;
	 * CPointer&lt;Object&gt; p = bmotionpath.__dna__addressof(bMotionPath.__DNA__FIELD__line_thickness);
	 * CPointer&lt;Integer&gt; p_line_thickness = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'line_thickness'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__line_thickness = new long[]{28, 32};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Baking settings - eMotionPath_Flag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMotionPath bmotionpath = ...;
	 * CPointer&lt;Object&gt; p = bmotionpath.__dna__addressof(bMotionPath.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{32, 36};

	/**
	 * Field descriptor (offset) for struct member 'points_vbo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for drawing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMotionPath bmotionpath = ...;
	 * CPointer&lt;Object&gt; p = bmotionpath.__dna__addressof(bMotionPath.__DNA__FIELD__points_vbo);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_points_vbo = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'points_vbo'</li>
	 * <li>Signature: 'GPUVertBuf*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__points_vbo = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'batch_line'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMotionPath bmotionpath = ...;
	 * CPointer&lt;Object&gt; p = bmotionpath.__dna__addressof(bMotionPath.__DNA__FIELD__batch_line);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_batch_line = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'batch_line'</li>
	 * <li>Signature: 'GPUBatch*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__batch_line = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'batch_points'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMotionPath bmotionpath = ...;
	 * CPointer&lt;Object&gt; p = bmotionpath.__dna__addressof(bMotionPath.__DNA__FIELD__batch_points);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_batch_points = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'batch_points'</li>
	 * <li>Signature: 'GPUBatch*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__batch_points = new long[]{44, 56};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bMotionPath bmotionpath = ...;
	 * CPointer&lt;Object&gt; p = bmotionpath.__dna__addressof(bMotionPath.__DNA__FIELD___pad);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{48, 64};

	public bMotionPath(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bMotionPath(bMotionPath that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Path}  samples. </p>
	 * @see #__DNA__FIELD__points
	 */
	
	public CPointer<bMotionPathVert> getPoints() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bMotionPathVert.class};
		return new CPointer<bMotionPathVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bMotionPathVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Path}  samples. </p>
	 * @see #__DNA__FIELD__points
	 */
	
	public void setPoints(CPointer<bMotionPathVert> points) throws IOException
	{
		long __address = ((points == null) ? 0 : points.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of cached verts. </p>
	 * @see #__DNA__FIELD__length
	 */
	
	public int getLength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The number of cached verts. </p>
	 * @see #__DNA__FIELD__length
	 */
	
	public void setLength(int length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, length);
		} else {
			__io__block.writeInt(__io__address + 4, length);
		}
	}

	/**
	 * Get method for struct member 'start_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For drawing paths, the start frame number. </p>
	 * @see #__DNA__FIELD__start_frame
	 */
	
	public int getStart_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'start_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For drawing paths, the start frame number. </p>
	 * @see #__DNA__FIELD__start_frame
	 */
	
	public void setStart_frame(int start_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, start_frame);
		} else {
			__io__block.writeInt(__io__address + 8, start_frame);
		}
	}

	/**
	 * Get method for struct member 'end_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For drawing paths, the end frame number. </p>
	 * @see #__DNA__FIELD__end_frame
	 */
	
	public int getEnd_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'end_frame'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For drawing paths, the end frame number. </p>
	 * @see #__DNA__FIELD__end_frame
	 */
	
	public void setEnd_frame(int end_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, end_frame);
		} else {
			__io__block.writeInt(__io__address + 12, end_frame);
		}
	}

	/**
	 * Get method for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional custom color. </p>
	 * @see #__DNA__FIELD__color
	 */
	
	public CArrayFacade<Float> getColor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional custom color. </p>
	 * @see #__DNA__FIELD__color
	 */
	
	public void setColor(CArrayFacade<Float> color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, color);
		} else {
			__io__generic__copy( getColor(), color);
		}
	}

	/**
	 * Get method for struct member 'line_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Line thickness. </p>
	 * @see #__DNA__FIELD__line_thickness
	 */
	
	public int getLine_thickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'line_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Line thickness. </p>
	 * @see #__DNA__FIELD__line_thickness
	 */
	
	public void setLine_thickness(int line_thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, line_thickness);
		} else {
			__io__block.writeInt(__io__address + 28, line_thickness);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Baking settings - eMotionPath_Flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Baking settings - eMotionPath_Flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, flag);
		} else {
			__io__block.writeInt(__io__address + 32, flag);
		}
	}

	/**
	 * Get method for struct member 'points_vbo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for drawing. </p>
	 * @see #__DNA__FIELD__points_vbo
	 */
	
	public CPointer<Object> getPoints_vbo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 36);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'points_vbo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for drawing. </p>
	 * @see #__DNA__FIELD__points_vbo
	 */
	
	public void setPoints_vbo(CPointer<Object> points_vbo) throws IOException
	{
		long __address = ((points_vbo == null) ? 0 : points_vbo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 36, __address);
		}
	}

	/**
	 * Get method for struct member 'batch_line'.
	 * @see #__DNA__FIELD__batch_line
	 */
	
	public CPointer<Object> getBatch_line() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'batch_line'.
	 * @see #__DNA__FIELD__batch_line
	 */
	
	public void setBatch_line(CPointer<Object> batch_line) throws IOException
	{
		long __address = ((batch_line == null) ? 0 : batch_line.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 40, __address);
		}
	}

	/**
	 * Get method for struct member 'batch_points'.
	 * @see #__DNA__FIELD__batch_points
	 */
	
	public CPointer<Object> getBatch_points() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 44);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'batch_points'.
	 * @see #__DNA__FIELD__batch_points
	 */
	
	public void setBatch_points(CPointer<Object> batch_points) throws IOException
	{
		long __address = ((batch_points == null) ? 0 : batch_points.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 56, __address);
		} else {
			__io__block.writeLong(__io__address + 44, __address);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CPointer<Object> get_pad() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CPointer<Object> _pad) throws IOException
	{
		long __address = ((_pad == null) ? 0 : _pad.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 48, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bMotionPath> __io__addressof() {
		return new CPointer<bMotionPath>(__io__address, new Class[]{bMotionPath.class}, __io__block, __io__blockTable);
	}

}
