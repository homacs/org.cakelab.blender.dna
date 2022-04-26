package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPdata_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  GP Datablock Runtime temp data for {@link bGPdata}  </p>
 */

@CMetaData(size32=84, size64=112)
public class bGPdata_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct bGPdata_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for bGPdata_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 486;

	/**
	 * Field descriptor (offset) for struct member 'sbuffer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke buffer. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sbuffer);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sbuffer = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbuffer'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbuffer = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_stroke_batch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp batches cleared after drawing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sbuffer_stroke_batch);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sbuffer_stroke_batch = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbuffer_stroke_batch'</li>
	 * <li>Signature: 'GPUBatch*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbuffer_stroke_batch = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_fill_batch'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sbuffer_fill_batch);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sbuffer_fill_batch = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbuffer_fill_batch'</li>
	 * <li>Signature: 'GPUBatch*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbuffer_fill_batch = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_gps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp stroke used for drawing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sbuffer_gps);
	 * CPointer&lt;CPointer&lt;bGPDstroke&gt;&gt; p_sbuffer_gps = p.cast(new Class[]{CPointer.class, bGPDstroke.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbuffer_gps'</li>
	 * <li>Signature: 'bGPDstroke*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbuffer_gps = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'matid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  index of the stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__matid);
	 * CPointer&lt;Short&gt; p_matid = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'matid'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__matid = new long[]{18, 34};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_sflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke Buffer data (only used during paint-session)<ul><li><p> buffer must be initialized before use, but freed after whole paint operation is over Flags for stroke that cache represents. </p></li></ul> 
	 * buffer must be initialized before use, but freed after whole paint operation is over Flags for stroke that cache represents. 
	 * 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sbuffer_sflag);
	 * CPointer&lt;Short&gt; p_sbuffer_sflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbuffer_sflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbuffer_sflag = new long[]{20, 36};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{22, 38};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_used'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of elements currently used in cache. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sbuffer_used);
	 * CPointer&lt;Integer&gt; p_sbuffer_used = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbuffer_used'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbuffer_used = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of total elements available in cache. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sbuffer_size);
	 * CPointer&lt;Integer&gt; p_sbuffer_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbuffer_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbuffer_size = new long[]{28, 44};

	/**
	 * Field descriptor (offset) for struct member 'vert_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex Color applied to point (while drawing). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__vert_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_vert_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vert_color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vert_color = new long[]{32, 48};

	/**
	 * Field descriptor (offset) for struct member 'vert_color_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex Color applied to Fill (while drawing). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__vert_color_fill);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_vert_color_fill = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vert_color_fill'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vert_color_fill = new long[]{48, 64};

	/**
	 * Field descriptor (offset) for struct member 'tot_cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of control-points for stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__tot_cp_points);
	 * CPointer&lt;Integer&gt; p_tot_cp_points = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_cp_points'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_cp_points = new long[]{64, 80};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{68, 84};

	/**
	 * Field descriptor (offset) for struct member 'cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of control-points for stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__cp_points);
	 * CPointer&lt;CPointer&lt;bGPDcontrolpoint&gt;&gt; p_cp_points = p.cast(new Class[]{CPointer.class, bGPDcontrolpoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cp_points'</li>
	 * <li>Signature: 'bGPDcontrolpoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cp_points = new long[]{72, 88};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Brush}  pointer </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sbuffer_brush);
	 * CPointer&lt;CPointer&lt;Brush&gt;&gt; p_sbuffer_brush = p.cast(new Class[]{CPointer.class, Brush.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbuffer_brush'</li>
	 * <li>Signature: 'Brush*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbuffer_brush = new long[]{76, 96};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_cache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__gpencil_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_gpencil_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_cache'</li>
	 * <li>Signature: 'GpencilBatchCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_cache = new long[]{80, 104};

	public bGPdata_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPdata_Runtime(bGPdata_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'sbuffer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke buffer. </p>
	 * @see #__DNA__FIELD__sbuffer
	 */
	
	public CPointer<Object> getSbuffer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sbuffer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke buffer. </p>
	 * @see #__DNA__FIELD__sbuffer
	 */
	
	public void setSbuffer(CPointer<Object> sbuffer) throws IOException
	{
		long __address = ((sbuffer == null) ? 0 : sbuffer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_stroke_batch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp batches cleared after drawing. </p>
	 * @see #__DNA__FIELD__sbuffer_stroke_batch
	 */
	
	public CPointer<Object> getSbuffer_stroke_batch() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sbuffer_stroke_batch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp batches cleared after drawing. </p>
	 * @see #__DNA__FIELD__sbuffer_stroke_batch
	 */
	
	public void setSbuffer_stroke_batch(CPointer<Object> sbuffer_stroke_batch) throws IOException
	{
		long __address = ((sbuffer_stroke_batch == null) ? 0 : sbuffer_stroke_batch.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_fill_batch'.
	 * @see #__DNA__FIELD__sbuffer_fill_batch
	 */
	
	public CPointer<Object> getSbuffer_fill_batch() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sbuffer_fill_batch'.
	 * @see #__DNA__FIELD__sbuffer_fill_batch
	 */
	
	public void setSbuffer_fill_batch(CPointer<Object> sbuffer_fill_batch) throws IOException
	{
		long __address = ((sbuffer_fill_batch == null) ? 0 : sbuffer_fill_batch.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_gps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp stroke used for drawing. </p>
	 * @see #__DNA__FIELD__sbuffer_gps
	 */
	
	public CPointer<bGPDstroke> getSbuffer_gps() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDstroke.class};
		return new CPointer<bGPDstroke>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDstroke.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sbuffer_gps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp stroke used for drawing. </p>
	 * @see #__DNA__FIELD__sbuffer_gps
	 */
	
	public void setSbuffer_gps(CPointer<bGPDstroke> sbuffer_gps) throws IOException
	{
		long __address = ((sbuffer_gps == null) ? 0 : sbuffer_gps.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
		}
	}

	/**
	 * Get method for struct member 'matid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  index of the stroke. </p>
	 * @see #__DNA__FIELD__matid
	 */
	
	public short getMatid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 34);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'matid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  index of the stroke. </p>
	 * @see #__DNA__FIELD__matid
	 */
	
	public void setMatid(short matid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 34, matid);
		} else {
			__io__block.writeShort(__io__address + 18, matid);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_sflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke Buffer data (only used during paint-session)<ul><li><p> buffer must be initialized before use, but freed after whole paint operation is over Flags for stroke that cache represents. </p></li></ul> 
	 * buffer must be initialized before use, but freed after whole paint operation is over Flags for stroke that cache represents. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__sbuffer_sflag
	 */
	
	public short getSbuffer_sflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 36);
		} else {
			return __io__block.readShort(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'sbuffer_sflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke Buffer data (only used during paint-session)<ul><li><p> buffer must be initialized before use, but freed after whole paint operation is over Flags for stroke that cache represents. </p></li></ul> 
	 * buffer must be initialized before use, but freed after whole paint operation is over Flags for stroke that cache represents. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__sbuffer_sflag
	 */
	
	public void setSbuffer_sflag(short sbuffer_sflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 36, sbuffer_sflag);
		} else {
			__io__block.writeShort(__io__address + 20, sbuffer_sflag);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 38, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 22, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 38;
		} else {
			__dna__offset = 22;
		}
		if (__io__equals(_pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1);
		} else {
			__io__generic__copy( get_pad1(), _pad1);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_used'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of elements currently used in cache. </p>
	 * @see #__DNA__FIELD__sbuffer_used
	 */
	
	public int getSbuffer_used() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'sbuffer_used'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of elements currently used in cache. </p>
	 * @see #__DNA__FIELD__sbuffer_used
	 */
	
	public void setSbuffer_used(int sbuffer_used) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, sbuffer_used);
		} else {
			__io__block.writeInt(__io__address + 24, sbuffer_used);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of total elements available in cache. </p>
	 * @see #__DNA__FIELD__sbuffer_size
	 */
	
	public int getSbuffer_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'sbuffer_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of total elements available in cache. </p>
	 * @see #__DNA__FIELD__sbuffer_size
	 */
	
	public void setSbuffer_size(int sbuffer_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, sbuffer_size);
		} else {
			__io__block.writeInt(__io__address + 28, sbuffer_size);
		}
	}

	/**
	 * Get method for struct member 'vert_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex Color applied to point (while drawing). </p>
	 * @see #__DNA__FIELD__vert_color
	 */
	
	public CArrayFacade<Float> getVert_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vert_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex Color applied to point (while drawing). </p>
	 * @see #__DNA__FIELD__vert_color
	 */
	
	public void setVert_color(CArrayFacade<Float> vert_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(vert_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vert_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vert_color);
		} else {
			__io__generic__copy( getVert_color(), vert_color);
		}
	}

	/**
	 * Get method for struct member 'vert_color_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex Color applied to Fill (while drawing). </p>
	 * @see #__DNA__FIELD__vert_color_fill
	 */
	
	public CArrayFacade<Float> getVert_color_fill() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vert_color_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex Color applied to Fill (while drawing). </p>
	 * @see #__DNA__FIELD__vert_color_fill
	 */
	
	public void setVert_color_fill(CArrayFacade<Float> vert_color_fill) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(vert_color_fill, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vert_color_fill)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vert_color_fill);
		} else {
			__io__generic__copy( getVert_color_fill(), vert_color_fill);
		}
	}

	/**
	 * Get method for struct member 'tot_cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of control-points for stroke. </p>
	 * @see #__DNA__FIELD__tot_cp_points
	 */
	
	public int getTot_cp_points() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 80);
		} else {
			return __io__block.readInt(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'tot_cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of control-points for stroke. </p>
	 * @see #__DNA__FIELD__tot_cp_points
	 */
	
	public void setTot_cp_points(int tot_cp_points) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 80, tot_cp_points);
		} else {
			__io__block.writeInt(__io__address + 64, tot_cp_points);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 84, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 68, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 84;
		} else {
			__dna__offset = 68;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Get method for struct member 'cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of control-points for stroke. </p>
	 * @see #__DNA__FIELD__cp_points
	 */
	
	public CPointer<bGPDcontrolpoint> getCp_points() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDcontrolpoint.class};
		return new CPointer<bGPDcontrolpoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDcontrolpoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of control-points for stroke. </p>
	 * @see #__DNA__FIELD__cp_points
	 */
	
	public void setCp_points(CPointer<bGPDcontrolpoint> cp_points) throws IOException
	{
		long __address = ((cp_points == null) ? 0 : cp_points.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 72, __address);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Brush}  pointer </p>
	 * @see #__DNA__FIELD__sbuffer_brush
	 */
	
	public CPointer<Brush> getSbuffer_brush() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 76);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Brush.class};
		return new CPointer<Brush>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Brush.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sbuffer_brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Brush}  pointer </p>
	 * @see #__DNA__FIELD__sbuffer_brush
	 */
	
	public void setSbuffer_brush(CPointer<Brush> sbuffer_brush) throws IOException
	{
		long __address = ((sbuffer_brush == null) ? 0 : sbuffer_brush.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 76, __address);
		}
	}

	/**
	 * Get method for struct member 'gpencil_cache'.
	 * @see #__DNA__FIELD__gpencil_cache
	 */
	
	public CPointer<Object> getGpencil_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpencil_cache'.
	 * @see #__DNA__FIELD__gpencil_cache
	 */
	
	public void setGpencil_cache(CPointer<Object> gpencil_cache) throws IOException
	{
		long __address = ((gpencil_cache == null) ? 0 : gpencil_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 80, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPdata_Runtime> __io__addressof() {
		return new CPointer<bGPdata_Runtime>(__io__address, new Class[]{bGPdata_Runtime.class}, __io__block, __io__blockTable);
	}

}
