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
 * Generated facet for DNA struct type 'bGPdata_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p><hr/> 
 *  GP Datablock Runtime temp data for {@link bGPdata}  </p>
 */

@CMetaData(size32=152, size64=192)
public class bGPdata_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct bGPdata_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for bGPdata_Runtime.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 203;

	/**
	 * Field descriptor (offset) for struct member 'sbuffer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	 * Field descriptor (offset) for struct member 'sbuffer_position_buf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temp batches cleared after drawing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sbuffer_position_buf);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sbuffer_position_buf = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbuffer_position_buf'</li>
	 * <li>Signature: 'GPUVertBuf*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbuffer_position_buf = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_color_buf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sbuffer_color_buf);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sbuffer_color_buf = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbuffer_color_buf'</li>
	 * <li>Signature: 'GPUVertBuf*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbuffer_color_buf = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_batch'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sbuffer_batch);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sbuffer_batch = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbuffer_batch'</li>
	 * <li>Signature: 'GPUBatch*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbuffer_batch = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_gps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__sbuffer_gps = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'playing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Animation playing flag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__playing);
	 * CPointer&lt;Short&gt; p_playing = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'playing'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__playing = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'matid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__matid = new long[]{22, 42};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_sflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__sbuffer_sflag = new long[]{24, 44};

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
	public static final long[] __DNA__FIELD___pad1 = new long[]{26, 46};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_used'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__sbuffer_used = new long[]{28, 48};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__sbuffer_size = new long[]{32, 52};

	/**
	 * Field descriptor (offset) for struct member 'vert_color_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__vert_color_fill = new long[]{36, 56};

	/**
	 * Field descriptor (offset) for struct member 'arrow_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Arrow points for stroke corners. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__arrow_start);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_arrow_start = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'arrow_start'</li>
	 * <li>Signature: 'float[8]'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__arrow_start = new long[]{52, 72};

	/**
	 * Field descriptor (offset) for struct member 'arrow_end'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__arrow_end);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_arrow_end = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'arrow_end'</li>
	 * <li>Signature: 'float[8]'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__arrow_end = new long[]{84, 104};

	/**
	 * Field descriptor (offset) for struct member 'arrow_start_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Arrow style for each corner </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__arrow_start_style);
	 * CPointer&lt;Integer&gt; p_arrow_start_style = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'arrow_start_style'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__arrow_start_style = new long[]{116, 136};

	/**
	 * Field descriptor (offset) for struct member 'arrow_end_style'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__arrow_end_style);
	 * CPointer&lt;Integer&gt; p_arrow_end_style = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'arrow_end_style'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__arrow_end_style = new long[]{120, 140};

	/**
	 * Field descriptor (offset) for struct member 'tot_cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__tot_cp_points = new long[]{124, 144};

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
	public static final long[] __DNA__FIELD___pad2 = new long[]{128, 148};

	/**
	 * Field descriptor (offset) for struct member 'cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__cp_points = new long[]{132, 152};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__sbuffer_brush = new long[]{136, 160};

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
	public static final long[] __DNA__FIELD__gpencil_cache = new long[]{140, 168};

	/**
	 * Field descriptor (offset) for struct member 'lineart_cache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__lineart_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_lineart_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lineart_cache'</li>
	 * <li>Signature: 'LineartCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lineart_cache = new long[]{144, 176};

	/**
	 * Field descriptor (offset) for struct member 'update_cache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__update_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_update_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'update_cache'</li>
	 * <li>Signature: 'GPencilUpdateCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__update_cache = new long[]{148, 184};

	public bGPdata_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPdata_Runtime(bGPdata_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'sbuffer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * Get method for struct member 'sbuffer_position_buf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temp batches cleared after drawing. </p>
	 * @see #__DNA__FIELD__sbuffer_position_buf
	 */
	
	public CPointer<Object> getSbuffer_position_buf() throws IOException
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
	 * Set method for struct member 'sbuffer_position_buf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temp batches cleared after drawing. </p>
	 * @see #__DNA__FIELD__sbuffer_position_buf
	 */
	
	public void setSbuffer_position_buf(CPointer<Object> sbuffer_position_buf) throws IOException
	{
		long __address = ((sbuffer_position_buf == null) ? 0 : sbuffer_position_buf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_color_buf'.
	 * @see #__DNA__FIELD__sbuffer_color_buf
	 */
	
	public CPointer<Object> getSbuffer_color_buf() throws IOException
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
	 * Set method for struct member 'sbuffer_color_buf'.
	 * @see #__DNA__FIELD__sbuffer_color_buf
	 */
	
	public void setSbuffer_color_buf(CPointer<Object> sbuffer_color_buf) throws IOException
	{
		long __address = ((sbuffer_color_buf == null) ? 0 : sbuffer_color_buf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_batch'.
	 * @see #__DNA__FIELD__sbuffer_batch
	 */
	
	public CPointer<Object> getSbuffer_batch() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sbuffer_batch'.
	 * @see #__DNA__FIELD__sbuffer_batch
	 */
	
	public void setSbuffer_batch(CPointer<Object> sbuffer_batch) throws IOException
	{
		long __address = ((sbuffer_batch == null) ? 0 : sbuffer_batch.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_gps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temp stroke used for drawing. </p>
	 * @see #__DNA__FIELD__sbuffer_gps
	 */
	
	public CPointer<bGPDstroke> getSbuffer_gps() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDstroke.class};
		return new CPointer<bGPDstroke>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDstroke.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sbuffer_gps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Temp stroke used for drawing. </p>
	 * @see #__DNA__FIELD__sbuffer_gps
	 */
	
	public void setSbuffer_gps(CPointer<bGPDstroke> sbuffer_gps) throws IOException
	{
		long __address = ((sbuffer_gps == null) ? 0 : sbuffer_gps.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'playing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Animation playing flag. </p>
	 * @see #__DNA__FIELD__playing
	 */
	
	public short getPlaying() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 40);
		} else {
			return __io__block.readShort(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'playing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Animation playing flag. </p>
	 * @see #__DNA__FIELD__playing
	 */
	
	public void setPlaying(short playing) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 40, playing);
		} else {
			__io__block.writeShort(__io__address + 20, playing);
		}
	}

	/**
	 * Get method for struct member 'matid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Material}  index of the stroke. </p>
	 * @see #__DNA__FIELD__matid
	 */
	
	public short getMatid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 42);
		} else {
			return __io__block.readShort(__io__address + 22);
		}
	}

	/**
	 * Set method for struct member 'matid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Material}  index of the stroke. </p>
	 * @see #__DNA__FIELD__matid
	 */
	
	public void setMatid(short matid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 42, matid);
		} else {
			__io__block.writeShort(__io__address + 22, matid);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_sflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stroke Buffer data (only used during paint-session)<ul><li><p> buffer must be initialized before use, but freed after whole paint operation is over Flags for stroke that cache represents. </p></li></ul> 
	 * buffer must be initialized before use, but freed after whole paint operation is over Flags for stroke that cache represents. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__sbuffer_sflag
	 */
	
	public short getSbuffer_sflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 44);
		} else {
			return __io__block.readShort(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'sbuffer_sflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stroke Buffer data (only used during paint-session)<ul><li><p> buffer must be initialized before use, but freed after whole paint operation is over Flags for stroke that cache represents. </p></li></ul> 
	 * buffer must be initialized before use, but freed after whole paint operation is over Flags for stroke that cache represents. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__sbuffer_sflag
	 */
	
	public void setSbuffer_sflag(short sbuffer_sflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 44, sbuffer_sflag);
		} else {
			__io__block.writeShort(__io__address + 24, sbuffer_sflag);
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
			return new CArrayFacade<Byte>(__io__address + 46, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 26, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 46;
		} else {
			__dna__offset = 26;
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
	 * <h4>Blender Source Code</h4>
	 * <p> Number of elements currently used in cache. </p>
	 * @see #__DNA__FIELD__sbuffer_used
	 */
	
	public int getSbuffer_used() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 48);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'sbuffer_used'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of elements currently used in cache. </p>
	 * @see #__DNA__FIELD__sbuffer_used
	 */
	
	public void setSbuffer_used(int sbuffer_used) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 48, sbuffer_used);
		} else {
			__io__block.writeInt(__io__address + 28, sbuffer_used);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of total elements available in cache. </p>
	 * @see #__DNA__FIELD__sbuffer_size
	 */
	
	public int getSbuffer_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 52);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'sbuffer_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of total elements available in cache. </p>
	 * @see #__DNA__FIELD__sbuffer_size
	 */
	
	public void setSbuffer_size(int sbuffer_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 52, sbuffer_size);
		} else {
			__io__block.writeInt(__io__address + 32, sbuffer_size);
		}
	}

	/**
	 * Get method for struct member 'vert_color_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
			return new CArrayFacade<Float>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vert_color_fill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Vertex Color applied to Fill (while drawing). </p>
	 * @see #__DNA__FIELD__vert_color_fill
	 */
	
	public void setVert_color_fill(CArrayFacade<Float> vert_color_fill) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 36;
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
	 * Get method for struct member 'arrow_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Arrow points for stroke corners. </p>
	 * @see #__DNA__FIELD__arrow_start
	 */
	
	public CArrayFacade<Float> getArrow_start() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 52, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'arrow_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Arrow points for stroke corners. </p>
	 * @see #__DNA__FIELD__arrow_start
	 */
	
	public void setArrow_start(CArrayFacade<Float> arrow_start) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 52;
		}
		if (__io__equals(arrow_start, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, arrow_start)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, arrow_start);
		} else {
			__io__generic__copy( getArrow_start(), arrow_start);
		}
	}

	/**
	 * Get method for struct member 'arrow_end'.
	 * @see #__DNA__FIELD__arrow_end
	 */
	
	public CArrayFacade<Float> getArrow_end() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 84, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'arrow_end'.
	 * @see #__DNA__FIELD__arrow_end
	 */
	
	public void setArrow_end(CArrayFacade<Float> arrow_end) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 84;
		}
		if (__io__equals(arrow_end, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, arrow_end)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, arrow_end);
		} else {
			__io__generic__copy( getArrow_end(), arrow_end);
		}
	}

	/**
	 * Get method for struct member 'arrow_start_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Arrow style for each corner </p>
	 * @see #__DNA__FIELD__arrow_start_style
	 */
	
	public int getArrow_start_style() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'arrow_start_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Arrow style for each corner </p>
	 * @see #__DNA__FIELD__arrow_start_style
	 */
	
	public void setArrow_start_style(int arrow_start_style) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, arrow_start_style);
		} else {
			__io__block.writeInt(__io__address + 116, arrow_start_style);
		}
	}

	/**
	 * Get method for struct member 'arrow_end_style'.
	 * @see #__DNA__FIELD__arrow_end_style
	 */
	
	public int getArrow_end_style() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 140);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'arrow_end_style'.
	 * @see #__DNA__FIELD__arrow_end_style
	 */
	
	public void setArrow_end_style(int arrow_end_style) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 140, arrow_end_style);
		} else {
			__io__block.writeInt(__io__address + 120, arrow_end_style);
		}
	}

	/**
	 * Get method for struct member 'tot_cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of control-points for stroke. </p>
	 * @see #__DNA__FIELD__tot_cp_points
	 */
	
	public int getTot_cp_points() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 144);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'tot_cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of control-points for stroke. </p>
	 * @see #__DNA__FIELD__tot_cp_points
	 */
	
	public void setTot_cp_points(int tot_cp_points) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 144, tot_cp_points);
		} else {
			__io__block.writeInt(__io__address + 124, tot_cp_points);
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
			return new CArrayFacade<Byte>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 148;
		} else {
			__dna__offset = 128;
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
	 * <h4>Blender Source Code</h4>
	 * <p> Array of control-points for stroke. </p>
	 * @see #__DNA__FIELD__cp_points
	 */
	
	public CPointer<bGPDcontrolpoint> getCp_points() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 132);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDcontrolpoint.class};
		return new CPointer<bGPDcontrolpoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDcontrolpoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Array of control-points for stroke. </p>
	 * @see #__DNA__FIELD__cp_points
	 */
	
	public void setCp_points(CPointer<bGPDcontrolpoint> cp_points) throws IOException
	{
		long __address = ((cp_points == null) ? 0 : cp_points.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 132, __address);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Brush}  pointer </p>
	 * @see #__DNA__FIELD__sbuffer_brush
	 */
	
	public CPointer<Brush> getSbuffer_brush() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Brush.class};
		return new CPointer<Brush>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Brush.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sbuffer_brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Brush}  pointer </p>
	 * @see #__DNA__FIELD__sbuffer_brush
	 */
	
	public void setSbuffer_brush(CPointer<Brush> sbuffer_brush) throws IOException
	{
		long __address = ((sbuffer_brush == null) ? 0 : sbuffer_brush.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
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
			__io__block.writeLong(__io__address + 168, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Get method for struct member 'lineart_cache'.
	 * @see #__DNA__FIELD__lineart_cache
	 */
	
	public CPointer<Object> getLineart_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'lineart_cache'.
	 * @see #__DNA__FIELD__lineart_cache
	 */
	
	public void setLineart_cache(CPointer<Object> lineart_cache) throws IOException
	{
		long __address = ((lineart_cache == null) ? 0 : lineart_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 144, __address);
		}
	}

	/**
	 * Get method for struct member 'update_cache'.
	 * @see #__DNA__FIELD__update_cache
	 */
	
	public CPointer<Object> getUpdate_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'update_cache'.
	 * @see #__DNA__FIELD__update_cache
	 */
	
	public void setUpdate_cache(CPointer<Object> update_cache) throws IOException
	{
		long __address = ((update_cache == null) ? 0 : update_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 148, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPdata_Runtime> __io__addressof() {
		return new CPointer<bGPdata_Runtime>(__io__address, new Class[]{bGPdata_Runtime.class}, __io__block, __io__blockTable);
	}

}
