package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ToolSettings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  Tool Settings </p>
 */

@CMetaData(size32=1200, size64=1296)
public class ToolSettings extends CFacade {

	/**
	 * This is the sdna index of the struct ToolSettings.
	 * <p>
	 * It is required when allocating a new block to store data for ToolSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 202;

	/**
	 * Field descriptor (offset) for struct member 'vpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex paint. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__vpaint);
	 * CPointer&lt;CPointer&lt;VPaint&gt;&gt; p_vpaint = p.cast(new Class[]{CPointer.class, VPaint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vpaint'</li>
	 * <li>Signature: 'VPaint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vpaint = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'wpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Weight paint. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__wpaint);
	 * CPointer&lt;CPointer&lt;VPaint&gt;&gt; p_wpaint = p.cast(new Class[]{CPointer.class, VPaint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wpaint'</li>
	 * <li>Signature: 'VPaint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wpaint = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__sculpt);
	 * CPointer&lt;CPointer&lt;Sculpt&gt;&gt; p_sculpt = p.cast(new Class[]{CPointer.class, Sculpt.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sculpt'</li>
	 * <li>Signature: 'Sculpt*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sculpt = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'uvsculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Uv smooth. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__uvsculpt);
	 * CPointer&lt;CPointer&lt;UvSculpt&gt;&gt; p_uvsculpt = p.cast(new Class[]{CPointer.class, UvSculpt.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uvsculpt'</li>
	 * <li>Signature: 'UvSculpt*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uvsculpt = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'gp_paint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gpencil paint. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gp_paint);
	 * CPointer&lt;CPointer&lt;GpPaint&gt;&gt; p_gp_paint = p.cast(new Class[]{CPointer.class, GpPaint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_paint'</li>
	 * <li>Signature: 'GpPaint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_paint = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group weight - used only for editmode, not weight paint </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__vgroup_weight);
	 * CPointer&lt;Float&gt; p_vgroup_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_weight = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'doublimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Remove doubles limit. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__doublimit);
	 * CPointer&lt;Float&gt; p_doublimit = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'doublimit'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__doublimit = new long[]{24, 44};

	/**
	 * Field descriptor (offset) for struct member 'automerge'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__automerge);
	 * CPointer&lt;Byte&gt; p_automerge = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'automerge'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__automerge = new long[]{28, 48};

	/**
	 * Field descriptor (offset) for struct member 'object_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__object_flag);
	 * CPointer&lt;Byte&gt; p_object_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_flag = new long[]{29, 49};

	/**
	 * Field descriptor (offset) for struct member 'selectmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Selection Mode for {@link Mesh}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__selectmode);
	 * CPointer&lt;Short&gt; p_selectmode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'selectmode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__selectmode = new long[]{30, 50};

	/**
	 * Field descriptor (offset) for struct member 'unwrapper'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> UV Calculation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__unwrapper);
	 * CPointer&lt;Byte&gt; p_unwrapper = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'unwrapper'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__unwrapper = new long[]{32, 52};

	/**
	 * Field descriptor (offset) for struct member 'uvcalc_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__uvcalc_flag);
	 * CPointer&lt;Byte&gt; p_uvcalc_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uvcalc_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uvcalc_flag = new long[]{33, 53};

	/**
	 * Field descriptor (offset) for struct member 'uv_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__uv_flag);
	 * CPointer&lt;Byte&gt; p_uv_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_flag = new long[]{34, 54};

	/**
	 * Field descriptor (offset) for struct member 'uv_selectmode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__uv_selectmode);
	 * CPointer&lt;Byte&gt; p_uv_selectmode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_selectmode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_selectmode = new long[]{35, 55};

	/**
	 * Field descriptor (offset) for struct member 'uvcalc_margin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__uvcalc_margin);
	 * CPointer&lt;Float&gt; p_uvcalc_margin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uvcalc_margin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uvcalc_margin = new long[]{36, 56};

	/**
	 * Field descriptor (offset) for struct member 'autoik_chainlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto-IK Runtime only. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__autoik_chainlen);
	 * CPointer&lt;Short&gt; p_autoik_chainlen = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'autoik_chainlen'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__autoik_chainlen = new long[]{40, 60};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil Flags/options for how the tool works. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gpencil_flags);
	 * CPointer&lt;Byte&gt; p_gpencil_flags = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_flags'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_flags = new long[]{42, 62};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke placement settings: 3D View. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gpencil_v3d_align);
	 * CPointer&lt;Byte&gt; p_gpencil_v3d_align = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_v3d_align'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_v3d_align = new long[]{43, 63};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_v2d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General 2D Editor. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gpencil_v2d_align);
	 * CPointer&lt;Byte&gt; p_gpencil_v2d_align = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_v2d_align'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_v2d_align = new long[]{44, 64};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_seq_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sequencer Preview. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gpencil_seq_align);
	 * CPointer&lt;Byte&gt; p_gpencil_seq_align = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_seq_align'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_seq_align = new long[]{45, 65};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_ima_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Image}  Editor. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gpencil_ima_align);
	 * CPointer&lt;Byte&gt; p_gpencil_ima_align = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_ima_align'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_ima_align = new long[]{46, 66};

	/**
	 * Field descriptor (offset) for struct member 'annotate_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Annotations Stroke placement settings - 3D View. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__annotate_v3d_align);
	 * CPointer&lt;Byte&gt; p_annotate_v3d_align = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'annotate_v3d_align'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__annotate_v3d_align = new long[]{47, 67};

	/**
	 * Field descriptor (offset) for struct member 'annotate_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default stroke thickness for annotation strokes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__annotate_thickness);
	 * CPointer&lt;Short&gt; p_annotate_thickness = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'annotate_thickness'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__annotate_thickness = new long[]{48, 68};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_selectmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke selection mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gpencil_selectmode);
	 * CPointer&lt;Short&gt; p_gpencil_selectmode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_selectmode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_selectmode = new long[]{50, 70};

	/**
	 * Field descriptor (offset) for struct member 'gp_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil {@link Sculpt}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gp_sculpt);
	 * CPointer&lt;GP_Sculpt_Settings&gt; p_gp_sculpt = p.cast(new Class[]{GP_Sculpt_Settings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_sculpt'</li>
	 * <li>Signature: 'GP_Sculpt_Settings'</li>
	 * <li>Actual Size (32bit/64bit): 552/568</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_sculpt = new long[]{52, 72};

	/**
	 * Field descriptor (offset) for struct member 'gp_interpolate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil Interpolation Tool(s) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gp_interpolate);
	 * CPointer&lt;GP_Interpolate_Settings&gt; p_gp_interpolate = p.cast(new Class[]{GP_Interpolate_Settings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_interpolate'</li>
	 * <li>Signature: 'GP_Interpolate_Settings'</li>
	 * <li>Actual Size (32bit/64bit): 20/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_interpolate = new long[]{604, 640};

	/**
	 * Field descriptor (offset) for struct member 'imapaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Image}  {@link Paint}  (8 bytes aligned please!) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__imapaint);
	 * CPointer&lt;ImagePaintSettings&gt; p_imapaint = p.cast(new Class[]{ImagePaintSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'imapaint'</li>
	 * <li>Signature: 'ImagePaintSettings'</li>
	 * <li>Actual Size (32bit/64bit): 124/160</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__imapaint = new long[]{624, 664};

	/**
	 * Field descriptor (offset) for struct member 'particle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Particle}  {@link Editing}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__particle);
	 * CPointer&lt;ParticleEditSettings&gt; p_particle = p.cast(new Class[]{ParticleEditSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle'</li>
	 * <li>Signature: 'ParticleEditSettings'</li>
	 * <li>Actual Size (32bit/64bit): 160/176</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle = new long[]{748, 824};

	/**
	 * Field descriptor (offset) for struct member 'proportional_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Display size for proportional editing circle<h4>Blender Source Code:</h4>
	 * <p> Transform Proportional Area of {@link Effect}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__proportional_size);
	 * CPointer&lt;Float&gt; p_proportional_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proportional_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proportional_size = new long[]{908, 1000};

	/**
	 * Field descriptor (offset) for struct member 'select_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Select Group Threshold </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__select_thresh);
	 * CPointer&lt;Float&gt; p_select_thresh = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'select_thresh'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__select_thresh = new long[]{912, 1004};

	/**
	 * Field descriptor (offset) for struct member 'autokey_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto-Keying Mode Defines in {@link DNA_userdef_types.h} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__autokey_flag);
	 * CPointer&lt;Short&gt; p_autokey_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'autokey_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__autokey_flag = new long[]{916, 1008};

	/**
	 * Field descriptor (offset) for struct member 'autokey_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__autokey_mode);
	 * CPointer&lt;Byte&gt; p_autokey_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'autokey_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__autokey_mode = new long[]{918, 1010};

	/**
	 * Field descriptor (offset) for struct member 'keyframe_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of keyframes to create when inserting keyframes<h4>Blender Source Code:</h4>
	 * <p> Keyframe type (see {@link DNA_curve_types.h} ). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__keyframe_type);
	 * CPointer&lt;Byte&gt; p_keyframe_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyframe_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyframe_type = new long[]{919, 1011};

	/**
	 * Field descriptor (offset) for struct member 'multires_subdiv_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Multires}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__multires_subdiv_type);
	 * CPointer&lt;Byte&gt; p_multires_subdiv_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'multires_subdiv_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__multires_subdiv_type = new long[]{920, 1012};

	/**
	 * Field descriptor (offset) for struct member 'edge_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Edge tagging, store operator settings (no UI access). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__edge_mode);
	 * CPointer&lt;Byte&gt; p_edge_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge_mode = new long[]{921, 1013};

	/**
	 * Field descriptor (offset) for struct member 'edge_mode_live_unwrap'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__edge_mode_live_unwrap);
	 * CPointer&lt;Byte&gt; p_edge_mode_live_unwrap = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge_mode_live_unwrap'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge_mode_live_unwrap = new long[]{922, 1014};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{923, 1015};

	/**
	 * Field descriptor (offset) for struct member 'transform_pivot_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pivot center for rotation/scaling<h4>Blender Source Code:</h4>
	 * <p> Transform </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__transform_pivot_point);
	 * CPointer&lt;Byte&gt; p_transform_pivot_point = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transform_pivot_point'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transform_pivot_point = new long[]{924, 1016};

	/**
	 * Field descriptor (offset) for struct member 'transform_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__transform_flag);
	 * CPointer&lt;Byte&gt; p_transform_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transform_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transform_flag = new long[]{925, 1017};

	/**
	 * Field descriptor (offset) for struct member 'snap_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__snap_mode);
	 * CPointer&lt;Byte&gt; p_snap_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap_mode = new long[]{926, 1018};

	/**
	 * Field descriptor (offset) for struct member 'snap_node_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__snap_node_mode);
	 * CPointer&lt;Byte&gt; p_snap_node_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap_node_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap_node_mode = new long[]{927, 1019};

	/**
	 * Field descriptor (offset) for struct member 'snap_uv_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__snap_uv_mode);
	 * CPointer&lt;Byte&gt; p_snap_uv_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap_uv_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap_uv_mode = new long[]{928, 1020};

	/**
	 * Field descriptor (offset) for struct member 'snap_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__snap_flag);
	 * CPointer&lt;Byte&gt; p_snap_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap_flag = new long[]{929, 1021};

	/**
	 * Field descriptor (offset) for struct member 'snap_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Which part to snap onto the target
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__snap_target);
	 * CPointer&lt;Byte&gt; p_snap_target = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap_target'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap_target = new long[]{930, 1022};

	/**
	 * Field descriptor (offset) for struct member 'snap_transform_mode_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__snap_transform_mode_flag);
	 * CPointer&lt;Byte&gt; p_snap_transform_mode_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap_transform_mode_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap_transform_mode_flag = new long[]{931, 1023};

	/**
	 * Field descriptor (offset) for struct member 'proportional_edit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__proportional_edit);
	 * CPointer&lt;Byte&gt; p_proportional_edit = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proportional_edit'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proportional_edit = new long[]{932, 1024};

	/**
	 * Field descriptor (offset) for struct member 'prop_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__prop_mode);
	 * CPointer&lt;Byte&gt; p_prop_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prop_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prop_mode = new long[]{933, 1025};

	/**
	 * Field descriptor (offset) for struct member 'proportional_objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proportional edit, object mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__proportional_objects);
	 * CPointer&lt;Byte&gt; p_proportional_objects = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proportional_objects'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proportional_objects = new long[]{934, 1026};

	/**
	 * Field descriptor (offset) for struct member 'proportional_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proportional edit, mask editing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__proportional_mask);
	 * CPointer&lt;Byte&gt; p_proportional_mask = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proportional_mask'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proportional_mask = new long[]{935, 1027};

	/**
	 * Field descriptor (offset) for struct member 'proportional_action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proportional edit, action editor. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__proportional_action);
	 * CPointer&lt;Byte&gt; p_proportional_action = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proportional_action'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proportional_action = new long[]{936, 1028};

	/**
	 * Field descriptor (offset) for struct member 'proportional_fcurve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proportional edit, graph editor. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__proportional_fcurve);
	 * CPointer&lt;Byte&gt; p_proportional_fcurve = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proportional_fcurve'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proportional_fcurve = new long[]{937, 1029};

	/**
	 * Field descriptor (offset) for struct member 'lock_markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Prevent marker editing<h4>Blender Source Code:</h4>
	 * <p> Lock marker editing. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__lock_markers);
	 * CPointer&lt;Byte&gt; p_lock_markers = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lock_markers'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lock_markers = new long[]{938, 1030};

	/**
	 * Field descriptor (offset) for struct member 'auto_normalize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto normalizing mode in wpaint. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__auto_normalize);
	 * CPointer&lt;Byte&gt; p_auto_normalize = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'auto_normalize'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__auto_normalize = new long[]{939, 1031};

	/**
	 * Field descriptor (offset) for struct member 'multipaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Paint}  multiple bones in wpaint. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__multipaint);
	 * CPointer&lt;Byte&gt; p_multipaint = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'multipaint'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__multipaint = new long[]{940, 1032};

	/**
	 * Field descriptor (offset) for struct member 'weightuser'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__weightuser);
	 * CPointer&lt;Byte&gt; p_weightuser = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'weightuser'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__weightuser = new long[]{941, 1033};

	/**
	 * Field descriptor (offset) for struct member 'vgroupsubset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Subset selection filter in wpaint. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__vgroupsubset);
	 * CPointer&lt;Byte&gt; p_vgroupsubset = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroupsubset'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroupsubset = new long[]{942, 1034};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> UV painting </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{943, 1035};

	/**
	 * Field descriptor (offset) for struct member 'uv_sculpt_settings'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__uv_sculpt_settings);
	 * CPointer&lt;Byte&gt; p_uv_sculpt_settings = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_sculpt_settings'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_sculpt_settings = new long[]{946, 1038};

	/**
	 * Field descriptor (offset) for struct member 'uv_relax_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Algorithm used for UV relaxation
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__uv_relax_method);
	 * CPointer&lt;Byte&gt; p_uv_relax_method = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_relax_method'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_relax_method = new long[]{947, 1039};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX: these sculpt_paint_* fields are deprecated, use the unified_paint_settings field instead! 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__sculpt_paint_settings);
	 * CPointer&lt;Short&gt; p_sculpt_paint_settings = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sculpt_paint_settings'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sculpt_paint_settings = new long[]{948, 1040};

	/**
	 * Field descriptor (offset) for struct member '_pad5'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD___pad5);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad5 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad5'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad5 = new long[]{950, 1042};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_paint_unified_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__sculpt_paint_unified_size);
	 * CPointer&lt;Integer&gt; p_sculpt_paint_unified_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sculpt_paint_unified_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sculpt_paint_unified_size = new long[]{952, 1044};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_paint_unified_unprojected_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__sculpt_paint_unified_unprojected_radius);
	 * CPointer&lt;Float&gt; p_sculpt_paint_unified_unprojected_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sculpt_paint_unified_unprojected_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sculpt_paint_unified_unprojected_radius = new long[]{956, 1048};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_paint_unified_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__sculpt_paint_unified_alpha);
	 * CPointer&lt;Float&gt; p_sculpt_paint_unified_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sculpt_paint_unified_alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sculpt_paint_unified_alpha = new long[]{960, 1052};

	/**
	 * Field descriptor (offset) for struct member 'unified_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Unified {@link Paint}  Settings </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__unified_paint_settings);
	 * CPointer&lt;UnifiedPaintSettings&gt; p_unified_paint_settings = p.cast(new Class[]{UnifiedPaintSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'unified_paint_settings'</li>
	 * <li>Signature: 'UnifiedPaintSettings'</li>
	 * <li>Actual Size (32bit/64bit): 148/152</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__unified_paint_settings = new long[]{964, 1056};

	/**
	 * Field descriptor (offset) for struct member 'curve_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__curve_paint_settings);
	 * CPointer&lt;CurvePaintSettings&gt; p_curve_paint_settings = p.cast(new Class[]{CurvePaintSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_paint_settings'</li>
	 * <li>Signature: 'CurvePaintSettings'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_paint_settings = new long[]{1112, 1208};

	/**
	 * Field descriptor (offset) for struct member 'statvis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__statvis);
	 * CPointer&lt;MeshStatVis&gt; p_statvis = p.cast(new Class[]{MeshStatVis.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'statvis'</li>
	 * <li>Signature: 'MeshStatVis'</li>
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__statvis = new long[]{1144, 1240};

	/**
	 * Field descriptor (offset) for struct member 'normal_vector'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Normal Vector used to copy, add or multiply<h4>Blender Source Code:</h4>
	 * <p> Normal {@link Editing}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__normal_vector);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_normal_vector = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normal_vector'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normal_vector = new long[]{1184, 1280};

	/**
	 * Field descriptor (offset) for struct member '_pad6'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD___pad6);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad6 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad6'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad6 = new long[]{1196, 1292};

	public ToolSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ToolSettings(ToolSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'vpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex paint. </p>
	 * @see #__DNA__FIELD__vpaint
	 */
	
	public CPointer<VPaint> getVpaint() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{VPaint.class};
		return new CPointer<VPaint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, VPaint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'vpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex paint. </p>
	 * @see #__DNA__FIELD__vpaint
	 */
	
	public void setVpaint(CPointer<VPaint> vpaint) throws IOException
	{
		long __address = ((vpaint == null) ? 0 : vpaint.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'wpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Weight paint. </p>
	 * @see #__DNA__FIELD__wpaint
	 */
	
	public CPointer<VPaint> getWpaint() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{VPaint.class};
		return new CPointer<VPaint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, VPaint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'wpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Weight paint. </p>
	 * @see #__DNA__FIELD__wpaint
	 */
	
	public void setWpaint(CPointer<VPaint> wpaint) throws IOException
	{
		long __address = ((wpaint == null) ? 0 : wpaint.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__sculpt
	 */
	
	public CPointer<Sculpt> getSculpt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Sculpt.class};
		return new CPointer<Sculpt>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Sculpt.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__sculpt
	 */
	
	public void setSculpt(CPointer<Sculpt> sculpt) throws IOException
	{
		long __address = ((sculpt == null) ? 0 : sculpt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'uvsculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Uv smooth. </p>
	 * @see #__DNA__FIELD__uvsculpt
	 */
	
	public CPointer<UvSculpt> getUvsculpt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{UvSculpt.class};
		return new CPointer<UvSculpt>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, UvSculpt.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'uvsculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Uv smooth. </p>
	 * @see #__DNA__FIELD__uvsculpt
	 */
	
	public void setUvsculpt(CPointer<UvSculpt> uvsculpt) throws IOException
	{
		long __address = ((uvsculpt == null) ? 0 : uvsculpt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'gp_paint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gpencil paint. </p>
	 * @see #__DNA__FIELD__gp_paint
	 */
	
	public CPointer<GpPaint> getGp_paint() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{GpPaint.class};
		return new CPointer<GpPaint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, GpPaint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gp_paint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gpencil paint. </p>
	 * @see #__DNA__FIELD__gp_paint
	 */
	
	public void setGp_paint(CPointer<GpPaint> gp_paint) throws IOException
	{
		long __address = ((gp_paint == null) ? 0 : gp_paint.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'vgroup_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group weight - used only for editmode, not weight paint </p>
	 * @see #__DNA__FIELD__vgroup_weight
	 */
	
	public float getVgroup_weight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'vgroup_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group weight - used only for editmode, not weight paint </p>
	 * @see #__DNA__FIELD__vgroup_weight
	 */
	
	public void setVgroup_weight(float vgroup_weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, vgroup_weight);
		} else {
			__io__block.writeFloat(__io__address + 20, vgroup_weight);
		}
	}

	/**
	 * Get method for struct member 'doublimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Remove doubles limit. </p>
	 * @see #__DNA__FIELD__doublimit
	 */
	
	public float getDoublimit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'doublimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Remove doubles limit. </p>
	 * @see #__DNA__FIELD__doublimit
	 */
	
	public void setDoublimit(float doublimit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, doublimit);
		} else {
			__io__block.writeFloat(__io__address + 24, doublimit);
		}
	}

	/**
	 * Get method for struct member 'automerge'.
	 * @see #__DNA__FIELD__automerge
	 */
	
	public byte getAutomerge() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 48);
		} else {
			return __io__block.readByte(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'automerge'.
	 * @see #__DNA__FIELD__automerge
	 */
	
	public void setAutomerge(byte automerge) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 48, automerge);
		} else {
			__io__block.writeByte(__io__address + 28, automerge);
		}
	}

	/**
	 * Get method for struct member 'object_flag'.
	 * @see #__DNA__FIELD__object_flag
	 */
	
	public byte getObject_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 49);
		} else {
			return __io__block.readByte(__io__address + 29);
		}
	}

	/**
	 * Set method for struct member 'object_flag'.
	 * @see #__DNA__FIELD__object_flag
	 */
	
	public void setObject_flag(byte object_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 49, object_flag);
		} else {
			__io__block.writeByte(__io__address + 29, object_flag);
		}
	}

	/**
	 * Get method for struct member 'selectmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Selection Mode for {@link Mesh}  </p>
	 * @see #__DNA__FIELD__selectmode
	 */
	
	public short getSelectmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 50);
		} else {
			return __io__block.readShort(__io__address + 30);
		}
	}

	/**
	 * Set method for struct member 'selectmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Selection Mode for {@link Mesh}  </p>
	 * @see #__DNA__FIELD__selectmode
	 */
	
	public void setSelectmode(short selectmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 50, selectmode);
		} else {
			__io__block.writeShort(__io__address + 30, selectmode);
		}
	}

	/**
	 * Get method for struct member 'unwrapper'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> UV Calculation </p>
	 * @see #__DNA__FIELD__unwrapper
	 */
	
	public byte getUnwrapper() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 52);
		} else {
			return __io__block.readByte(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'unwrapper'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> UV Calculation </p>
	 * @see #__DNA__FIELD__unwrapper
	 */
	
	public void setUnwrapper(byte unwrapper) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 52, unwrapper);
		} else {
			__io__block.writeByte(__io__address + 32, unwrapper);
		}
	}

	/**
	 * Get method for struct member 'uvcalc_flag'.
	 * @see #__DNA__FIELD__uvcalc_flag
	 */
	
	public byte getUvcalc_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 53);
		} else {
			return __io__block.readByte(__io__address + 33);
		}
	}

	/**
	 * Set method for struct member 'uvcalc_flag'.
	 * @see #__DNA__FIELD__uvcalc_flag
	 */
	
	public void setUvcalc_flag(byte uvcalc_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 53, uvcalc_flag);
		} else {
			__io__block.writeByte(__io__address + 33, uvcalc_flag);
		}
	}

	/**
	 * Get method for struct member 'uv_flag'.
	 * @see #__DNA__FIELD__uv_flag
	 */
	
	public byte getUv_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 54);
		} else {
			return __io__block.readByte(__io__address + 34);
		}
	}

	/**
	 * Set method for struct member 'uv_flag'.
	 * @see #__DNA__FIELD__uv_flag
	 */
	
	public void setUv_flag(byte uv_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 54, uv_flag);
		} else {
			__io__block.writeByte(__io__address + 34, uv_flag);
		}
	}

	/**
	 * Get method for struct member 'uv_selectmode'.
	 * @see #__DNA__FIELD__uv_selectmode
	 */
	
	public byte getUv_selectmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 55);
		} else {
			return __io__block.readByte(__io__address + 35);
		}
	}

	/**
	 * Set method for struct member 'uv_selectmode'.
	 * @see #__DNA__FIELD__uv_selectmode
	 */
	
	public void setUv_selectmode(byte uv_selectmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 55, uv_selectmode);
		} else {
			__io__block.writeByte(__io__address + 35, uv_selectmode);
		}
	}

	/**
	 * Get method for struct member 'uvcalc_margin'.
	 * @see #__DNA__FIELD__uvcalc_margin
	 */
	
	public float getUvcalc_margin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'uvcalc_margin'.
	 * @see #__DNA__FIELD__uvcalc_margin
	 */
	
	public void setUvcalc_margin(float uvcalc_margin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, uvcalc_margin);
		} else {
			__io__block.writeFloat(__io__address + 36, uvcalc_margin);
		}
	}

	/**
	 * Get method for struct member 'autoik_chainlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto-IK Runtime only. </p>
	 * @see #__DNA__FIELD__autoik_chainlen
	 */
	
	public short getAutoik_chainlen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 60);
		} else {
			return __io__block.readShort(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'autoik_chainlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto-IK Runtime only. </p>
	 * @see #__DNA__FIELD__autoik_chainlen
	 */
	
	public void setAutoik_chainlen(short autoik_chainlen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 60, autoik_chainlen);
		} else {
			__io__block.writeShort(__io__address + 40, autoik_chainlen);
		}
	}

	/**
	 * Get method for struct member 'gpencil_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil Flags/options for how the tool works. </p>
	 * @see #__DNA__FIELD__gpencil_flags
	 */
	
	public byte getGpencil_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 62);
		} else {
			return __io__block.readByte(__io__address + 42);
		}
	}

	/**
	 * Set method for struct member 'gpencil_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil Flags/options for how the tool works. </p>
	 * @see #__DNA__FIELD__gpencil_flags
	 */
	
	public void setGpencil_flags(byte gpencil_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 62, gpencil_flags);
		} else {
			__io__block.writeByte(__io__address + 42, gpencil_flags);
		}
	}

	/**
	 * Get method for struct member 'gpencil_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke placement settings: 3D View. </p>
	 * @see #__DNA__FIELD__gpencil_v3d_align
	 */
	
	public byte getGpencil_v3d_align() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 63);
		} else {
			return __io__block.readByte(__io__address + 43);
		}
	}

	/**
	 * Set method for struct member 'gpencil_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke placement settings: 3D View. </p>
	 * @see #__DNA__FIELD__gpencil_v3d_align
	 */
	
	public void setGpencil_v3d_align(byte gpencil_v3d_align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 63, gpencil_v3d_align);
		} else {
			__io__block.writeByte(__io__address + 43, gpencil_v3d_align);
		}
	}

	/**
	 * Get method for struct member 'gpencil_v2d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General 2D Editor. </p>
	 * @see #__DNA__FIELD__gpencil_v2d_align
	 */
	
	public byte getGpencil_v2d_align() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 64);
		} else {
			return __io__block.readByte(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'gpencil_v2d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General 2D Editor. </p>
	 * @see #__DNA__FIELD__gpencil_v2d_align
	 */
	
	public void setGpencil_v2d_align(byte gpencil_v2d_align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 64, gpencil_v2d_align);
		} else {
			__io__block.writeByte(__io__address + 44, gpencil_v2d_align);
		}
	}

	/**
	 * Get method for struct member 'gpencil_seq_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sequencer Preview. </p>
	 * @see #__DNA__FIELD__gpencil_seq_align
	 */
	
	public byte getGpencil_seq_align() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 65);
		} else {
			return __io__block.readByte(__io__address + 45);
		}
	}

	/**
	 * Set method for struct member 'gpencil_seq_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Sequencer Preview. </p>
	 * @see #__DNA__FIELD__gpencil_seq_align
	 */
	
	public void setGpencil_seq_align(byte gpencil_seq_align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 65, gpencil_seq_align);
		} else {
			__io__block.writeByte(__io__address + 45, gpencil_seq_align);
		}
	}

	/**
	 * Get method for struct member 'gpencil_ima_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Image}  Editor. </p>
	 * @see #__DNA__FIELD__gpencil_ima_align
	 */
	
	public byte getGpencil_ima_align() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 66);
		} else {
			return __io__block.readByte(__io__address + 46);
		}
	}

	/**
	 * Set method for struct member 'gpencil_ima_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Image}  Editor. </p>
	 * @see #__DNA__FIELD__gpencil_ima_align
	 */
	
	public void setGpencil_ima_align(byte gpencil_ima_align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 66, gpencil_ima_align);
		} else {
			__io__block.writeByte(__io__address + 46, gpencil_ima_align);
		}
	}

	/**
	 * Get method for struct member 'annotate_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Annotations Stroke placement settings - 3D View. </p>
	 * @see #__DNA__FIELD__annotate_v3d_align
	 */
	
	public byte getAnnotate_v3d_align() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 67);
		} else {
			return __io__block.readByte(__io__address + 47);
		}
	}

	/**
	 * Set method for struct member 'annotate_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Annotations Stroke placement settings - 3D View. </p>
	 * @see #__DNA__FIELD__annotate_v3d_align
	 */
	
	public void setAnnotate_v3d_align(byte annotate_v3d_align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 67, annotate_v3d_align);
		} else {
			__io__block.writeByte(__io__address + 47, annotate_v3d_align);
		}
	}

	/**
	 * Get method for struct member 'annotate_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default stroke thickness for annotation strokes. </p>
	 * @see #__DNA__FIELD__annotate_thickness
	 */
	
	public short getAnnotate_thickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 68);
		} else {
			return __io__block.readShort(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'annotate_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default stroke thickness for annotation strokes. </p>
	 * @see #__DNA__FIELD__annotate_thickness
	 */
	
	public void setAnnotate_thickness(short annotate_thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 68, annotate_thickness);
		} else {
			__io__block.writeShort(__io__address + 48, annotate_thickness);
		}
	}

	/**
	 * Get method for struct member 'gpencil_selectmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke selection mode. </p>
	 * @see #__DNA__FIELD__gpencil_selectmode
	 */
	
	public short getGpencil_selectmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 70);
		} else {
			return __io__block.readShort(__io__address + 50);
		}
	}

	/**
	 * Set method for struct member 'gpencil_selectmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke selection mode. </p>
	 * @see #__DNA__FIELD__gpencil_selectmode
	 */
	
	public void setGpencil_selectmode(short gpencil_selectmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 70, gpencil_selectmode);
		} else {
			__io__block.writeShort(__io__address + 50, gpencil_selectmode);
		}
	}

	/**
	 * Get method for struct member 'gp_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil {@link Sculpt}  </p>
	 * @see #__DNA__FIELD__gp_sculpt
	 */
	
	public GP_Sculpt_Settings getGp_sculpt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GP_Sculpt_Settings(__io__address + 72, __io__block, __io__blockTable);
		} else {
			return new GP_Sculpt_Settings(__io__address + 52, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gp_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil {@link Sculpt}  </p>
	 * @see #__DNA__FIELD__gp_sculpt
	 */
	
	public void setGp_sculpt(GP_Sculpt_Settings gp_sculpt) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 52;
		}
		if (__io__equals(gp_sculpt, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gp_sculpt)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gp_sculpt);
		} else {
			__io__generic__copy( getGp_sculpt(), gp_sculpt);
		}
	}

	/**
	 * Get method for struct member 'gp_interpolate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil Interpolation Tool(s) </p>
	 * @see #__DNA__FIELD__gp_interpolate
	 */
	
	public GP_Interpolate_Settings getGp_interpolate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GP_Interpolate_Settings(__io__address + 640, __io__block, __io__blockTable);
		} else {
			return new GP_Interpolate_Settings(__io__address + 604, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gp_interpolate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil Interpolation Tool(s) </p>
	 * @see #__DNA__FIELD__gp_interpolate
	 */
	
	public void setGp_interpolate(GP_Interpolate_Settings gp_interpolate) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 640;
		} else {
			__dna__offset = 604;
		}
		if (__io__equals(gp_interpolate, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gp_interpolate)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gp_interpolate);
		} else {
			__io__generic__copy( getGp_interpolate(), gp_interpolate);
		}
	}

	/**
	 * Get method for struct member 'imapaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Image}  {@link Paint}  (8 bytes aligned please!) </p>
	 * @see #__DNA__FIELD__imapaint
	 */
	
	public ImagePaintSettings getImapaint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImagePaintSettings(__io__address + 664, __io__block, __io__blockTable);
		} else {
			return new ImagePaintSettings(__io__address + 624, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'imapaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Image}  {@link Paint}  (8 bytes aligned please!) </p>
	 * @see #__DNA__FIELD__imapaint
	 */
	
	public void setImapaint(ImagePaintSettings imapaint) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 664;
		} else {
			__dna__offset = 624;
		}
		if (__io__equals(imapaint, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, imapaint)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, imapaint);
		} else {
			__io__generic__copy( getImapaint(), imapaint);
		}
	}

	/**
	 * Get method for struct member 'particle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Particle}  {@link Editing}  </p>
	 * @see #__DNA__FIELD__particle
	 */
	
	public ParticleEditSettings getParticle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ParticleEditSettings(__io__address + 824, __io__block, __io__blockTable);
		} else {
			return new ParticleEditSettings(__io__address + 748, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'particle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Particle}  {@link Editing}  </p>
	 * @see #__DNA__FIELD__particle
	 */
	
	public void setParticle(ParticleEditSettings particle) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 824;
		} else {
			__dna__offset = 748;
		}
		if (__io__equals(particle, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, particle)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, particle);
		} else {
			__io__generic__copy( getParticle(), particle);
		}
	}

	/**
	 * Get method for struct member 'proportional_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Display size for proportional editing circle<h4>Blender Source Code:</h4>
	 * <p> Transform Proportional Area of {@link Effect}  </p>
	 * @see #__DNA__FIELD__proportional_size
	 */
	
	public float getProportional_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1000);
		} else {
			return __io__block.readFloat(__io__address + 908);
		}
	}

	/**
	 * Set method for struct member 'proportional_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Display size for proportional editing circle<h4>Blender Source Code:</h4>
	 * <p> Transform Proportional Area of {@link Effect}  </p>
	 * @see #__DNA__FIELD__proportional_size
	 */
	
	public void setProportional_size(float proportional_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1000, proportional_size);
		} else {
			__io__block.writeFloat(__io__address + 908, proportional_size);
		}
	}

	/**
	 * Get method for struct member 'select_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Select Group Threshold </p>
	 * @see #__DNA__FIELD__select_thresh
	 */
	
	public float getSelect_thresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1004);
		} else {
			return __io__block.readFloat(__io__address + 912);
		}
	}

	/**
	 * Set method for struct member 'select_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Select Group Threshold </p>
	 * @see #__DNA__FIELD__select_thresh
	 */
	
	public void setSelect_thresh(float select_thresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1004, select_thresh);
		} else {
			__io__block.writeFloat(__io__address + 912, select_thresh);
		}
	}

	/**
	 * Get method for struct member 'autokey_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto-Keying Mode Defines in {@link DNA_userdef_types.h} . </p>
	 * @see #__DNA__FIELD__autokey_flag
	 */
	
	public short getAutokey_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1008);
		} else {
			return __io__block.readShort(__io__address + 916);
		}
	}

	/**
	 * Set method for struct member 'autokey_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto-Keying Mode Defines in {@link DNA_userdef_types.h} . </p>
	 * @see #__DNA__FIELD__autokey_flag
	 */
	
	public void setAutokey_flag(short autokey_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1008, autokey_flag);
		} else {
			__io__block.writeShort(__io__address + 916, autokey_flag);
		}
	}

	/**
	 * Get method for struct member 'autokey_mode'.
	 * @see #__DNA__FIELD__autokey_mode
	 */
	
	public byte getAutokey_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1010);
		} else {
			return __io__block.readByte(__io__address + 918);
		}
	}

	/**
	 * Set method for struct member 'autokey_mode'.
	 * @see #__DNA__FIELD__autokey_mode
	 */
	
	public void setAutokey_mode(byte autokey_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1010, autokey_mode);
		} else {
			__io__block.writeByte(__io__address + 918, autokey_mode);
		}
	}

	/**
	 * Get method for struct member 'keyframe_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of keyframes to create when inserting keyframes<h4>Blender Source Code:</h4>
	 * <p> Keyframe type (see {@link DNA_curve_types.h} ). </p>
	 * @see #__DNA__FIELD__keyframe_type
	 */
	
	public byte getKeyframe_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1011);
		} else {
			return __io__block.readByte(__io__address + 919);
		}
	}

	/**
	 * Set method for struct member 'keyframe_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of keyframes to create when inserting keyframes<h4>Blender Source Code:</h4>
	 * <p> Keyframe type (see {@link DNA_curve_types.h} ). </p>
	 * @see #__DNA__FIELD__keyframe_type
	 */
	
	public void setKeyframe_type(byte keyframe_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1011, keyframe_type);
		} else {
			__io__block.writeByte(__io__address + 919, keyframe_type);
		}
	}

	/**
	 * Get method for struct member 'multires_subdiv_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Multires}  </p>
	 * @see #__DNA__FIELD__multires_subdiv_type
	 */
	
	public byte getMultires_subdiv_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1012);
		} else {
			return __io__block.readByte(__io__address + 920);
		}
	}

	/**
	 * Set method for struct member 'multires_subdiv_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Multires}  </p>
	 * @see #__DNA__FIELD__multires_subdiv_type
	 */
	
	public void setMultires_subdiv_type(byte multires_subdiv_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1012, multires_subdiv_type);
		} else {
			__io__block.writeByte(__io__address + 920, multires_subdiv_type);
		}
	}

	/**
	 * Get method for struct member 'edge_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Edge tagging, store operator settings (no UI access). </p>
	 * @see #__DNA__FIELD__edge_mode
	 */
	
	public byte getEdge_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1013);
		} else {
			return __io__block.readByte(__io__address + 921);
		}
	}

	/**
	 * Set method for struct member 'edge_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Edge tagging, store operator settings (no UI access). </p>
	 * @see #__DNA__FIELD__edge_mode
	 */
	
	public void setEdge_mode(byte edge_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1013, edge_mode);
		} else {
			__io__block.writeByte(__io__address + 921, edge_mode);
		}
	}

	/**
	 * Get method for struct member 'edge_mode_live_unwrap'.
	 * @see #__DNA__FIELD__edge_mode_live_unwrap
	 */
	
	public byte getEdge_mode_live_unwrap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1014);
		} else {
			return __io__block.readByte(__io__address + 922);
		}
	}

	/**
	 * Set method for struct member 'edge_mode_live_unwrap'.
	 * @see #__DNA__FIELD__edge_mode_live_unwrap
	 */
	
	public void setEdge_mode_live_unwrap(byte edge_mode_live_unwrap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1014, edge_mode_live_unwrap);
		} else {
			__io__block.writeByte(__io__address + 922, edge_mode_live_unwrap);
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
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1015, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 923, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1015;
		} else {
			__dna__offset = 923;
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
	 * Get method for struct member 'transform_pivot_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pivot center for rotation/scaling<h4>Blender Source Code:</h4>
	 * <p> Transform </p>
	 * @see #__DNA__FIELD__transform_pivot_point
	 */
	
	public byte getTransform_pivot_point() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1016);
		} else {
			return __io__block.readByte(__io__address + 924);
		}
	}

	/**
	 * Set method for struct member 'transform_pivot_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pivot center for rotation/scaling<h4>Blender Source Code:</h4>
	 * <p> Transform </p>
	 * @see #__DNA__FIELD__transform_pivot_point
	 */
	
	public void setTransform_pivot_point(byte transform_pivot_point) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1016, transform_pivot_point);
		} else {
			__io__block.writeByte(__io__address + 924, transform_pivot_point);
		}
	}

	/**
	 * Get method for struct member 'transform_flag'.
	 * @see #__DNA__FIELD__transform_flag
	 */
	
	public byte getTransform_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1017);
		} else {
			return __io__block.readByte(__io__address + 925);
		}
	}

	/**
	 * Set method for struct member 'transform_flag'.
	 * @see #__DNA__FIELD__transform_flag
	 */
	
	public void setTransform_flag(byte transform_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1017, transform_flag);
		} else {
			__io__block.writeByte(__io__address + 925, transform_flag);
		}
	}

	/**
	 * Get method for struct member 'snap_mode'.
	 * @see #__DNA__FIELD__snap_mode
	 */
	
	public byte getSnap_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1018);
		} else {
			return __io__block.readByte(__io__address + 926);
		}
	}

	/**
	 * Set method for struct member 'snap_mode'.
	 * @see #__DNA__FIELD__snap_mode
	 */
	
	public void setSnap_mode(byte snap_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1018, snap_mode);
		} else {
			__io__block.writeByte(__io__address + 926, snap_mode);
		}
	}

	/**
	 * Get method for struct member 'snap_node_mode'.
	 * @see #__DNA__FIELD__snap_node_mode
	 */
	
	public byte getSnap_node_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1019);
		} else {
			return __io__block.readByte(__io__address + 927);
		}
	}

	/**
	 * Set method for struct member 'snap_node_mode'.
	 * @see #__DNA__FIELD__snap_node_mode
	 */
	
	public void setSnap_node_mode(byte snap_node_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1019, snap_node_mode);
		} else {
			__io__block.writeByte(__io__address + 927, snap_node_mode);
		}
	}

	/**
	 * Get method for struct member 'snap_uv_mode'.
	 * @see #__DNA__FIELD__snap_uv_mode
	 */
	
	public byte getSnap_uv_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1020);
		} else {
			return __io__block.readByte(__io__address + 928);
		}
	}

	/**
	 * Set method for struct member 'snap_uv_mode'.
	 * @see #__DNA__FIELD__snap_uv_mode
	 */
	
	public void setSnap_uv_mode(byte snap_uv_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1020, snap_uv_mode);
		} else {
			__io__block.writeByte(__io__address + 928, snap_uv_mode);
		}
	}

	/**
	 * Get method for struct member 'snap_flag'.
	 * @see #__DNA__FIELD__snap_flag
	 */
	
	public byte getSnap_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1021);
		} else {
			return __io__block.readByte(__io__address + 929);
		}
	}

	/**
	 * Set method for struct member 'snap_flag'.
	 * @see #__DNA__FIELD__snap_flag
	 */
	
	public void setSnap_flag(byte snap_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1021, snap_flag);
		} else {
			__io__block.writeByte(__io__address + 929, snap_flag);
		}
	}

	/**
	 * Get method for struct member 'snap_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Which part to snap onto the target
	 * @see #__DNA__FIELD__snap_target
	 */
	
	public byte getSnap_target() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1022);
		} else {
			return __io__block.readByte(__io__address + 930);
		}
	}

	/**
	 * Set method for struct member 'snap_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Which part to snap onto the target
	 * @see #__DNA__FIELD__snap_target
	 */
	
	public void setSnap_target(byte snap_target) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1022, snap_target);
		} else {
			__io__block.writeByte(__io__address + 930, snap_target);
		}
	}

	/**
	 * Get method for struct member 'snap_transform_mode_flag'.
	 * @see #__DNA__FIELD__snap_transform_mode_flag
	 */
	
	public byte getSnap_transform_mode_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1023);
		} else {
			return __io__block.readByte(__io__address + 931);
		}
	}

	/**
	 * Set method for struct member 'snap_transform_mode_flag'.
	 * @see #__DNA__FIELD__snap_transform_mode_flag
	 */
	
	public void setSnap_transform_mode_flag(byte snap_transform_mode_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1023, snap_transform_mode_flag);
		} else {
			__io__block.writeByte(__io__address + 931, snap_transform_mode_flag);
		}
	}

	/**
	 * Get method for struct member 'proportional_edit'.
	 * @see #__DNA__FIELD__proportional_edit
	 */
	
	public byte getProportional_edit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1024);
		} else {
			return __io__block.readByte(__io__address + 932);
		}
	}

	/**
	 * Set method for struct member 'proportional_edit'.
	 * @see #__DNA__FIELD__proportional_edit
	 */
	
	public void setProportional_edit(byte proportional_edit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1024, proportional_edit);
		} else {
			__io__block.writeByte(__io__address + 932, proportional_edit);
		}
	}

	/**
	 * Get method for struct member 'prop_mode'.
	 * @see #__DNA__FIELD__prop_mode
	 */
	
	public byte getProp_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1025);
		} else {
			return __io__block.readByte(__io__address + 933);
		}
	}

	/**
	 * Set method for struct member 'prop_mode'.
	 * @see #__DNA__FIELD__prop_mode
	 */
	
	public void setProp_mode(byte prop_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1025, prop_mode);
		} else {
			__io__block.writeByte(__io__address + 933, prop_mode);
		}
	}

	/**
	 * Get method for struct member 'proportional_objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proportional edit, object mode. </p>
	 * @see #__DNA__FIELD__proportional_objects
	 */
	
	public byte getProportional_objects() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1026);
		} else {
			return __io__block.readByte(__io__address + 934);
		}
	}

	/**
	 * Set method for struct member 'proportional_objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proportional edit, object mode. </p>
	 * @see #__DNA__FIELD__proportional_objects
	 */
	
	public void setProportional_objects(byte proportional_objects) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1026, proportional_objects);
		} else {
			__io__block.writeByte(__io__address + 934, proportional_objects);
		}
	}

	/**
	 * Get method for struct member 'proportional_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proportional edit, mask editing. </p>
	 * @see #__DNA__FIELD__proportional_mask
	 */
	
	public byte getProportional_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1027);
		} else {
			return __io__block.readByte(__io__address + 935);
		}
	}

	/**
	 * Set method for struct member 'proportional_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proportional edit, mask editing. </p>
	 * @see #__DNA__FIELD__proportional_mask
	 */
	
	public void setProportional_mask(byte proportional_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1027, proportional_mask);
		} else {
			__io__block.writeByte(__io__address + 935, proportional_mask);
		}
	}

	/**
	 * Get method for struct member 'proportional_action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proportional edit, action editor. </p>
	 * @see #__DNA__FIELD__proportional_action
	 */
	
	public byte getProportional_action() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1028);
		} else {
			return __io__block.readByte(__io__address + 936);
		}
	}

	/**
	 * Set method for struct member 'proportional_action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proportional edit, action editor. </p>
	 * @see #__DNA__FIELD__proportional_action
	 */
	
	public void setProportional_action(byte proportional_action) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1028, proportional_action);
		} else {
			__io__block.writeByte(__io__address + 936, proportional_action);
		}
	}

	/**
	 * Get method for struct member 'proportional_fcurve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proportional edit, graph editor. </p>
	 * @see #__DNA__FIELD__proportional_fcurve
	 */
	
	public byte getProportional_fcurve() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1029);
		} else {
			return __io__block.readByte(__io__address + 937);
		}
	}

	/**
	 * Set method for struct member 'proportional_fcurve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Proportional edit, graph editor. </p>
	 * @see #__DNA__FIELD__proportional_fcurve
	 */
	
	public void setProportional_fcurve(byte proportional_fcurve) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1029, proportional_fcurve);
		} else {
			__io__block.writeByte(__io__address + 937, proportional_fcurve);
		}
	}

	/**
	 * Get method for struct member 'lock_markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Prevent marker editing<h4>Blender Source Code:</h4>
	 * <p> Lock marker editing. </p>
	 * @see #__DNA__FIELD__lock_markers
	 */
	
	public byte getLock_markers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1030);
		} else {
			return __io__block.readByte(__io__address + 938);
		}
	}

	/**
	 * Set method for struct member 'lock_markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Prevent marker editing<h4>Blender Source Code:</h4>
	 * <p> Lock marker editing. </p>
	 * @see #__DNA__FIELD__lock_markers
	 */
	
	public void setLock_markers(byte lock_markers) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1030, lock_markers);
		} else {
			__io__block.writeByte(__io__address + 938, lock_markers);
		}
	}

	/**
	 * Get method for struct member 'auto_normalize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto normalizing mode in wpaint. </p>
	 * @see #__DNA__FIELD__auto_normalize
	 */
	
	public byte getAuto_normalize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1031);
		} else {
			return __io__block.readByte(__io__address + 939);
		}
	}

	/**
	 * Set method for struct member 'auto_normalize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto normalizing mode in wpaint. </p>
	 * @see #__DNA__FIELD__auto_normalize
	 */
	
	public void setAuto_normalize(byte auto_normalize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1031, auto_normalize);
		} else {
			__io__block.writeByte(__io__address + 939, auto_normalize);
		}
	}

	/**
	 * Get method for struct member 'multipaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Paint}  multiple bones in wpaint. </p>
	 * @see #__DNA__FIELD__multipaint
	 */
	
	public byte getMultipaint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1032);
		} else {
			return __io__block.readByte(__io__address + 940);
		}
	}

	/**
	 * Set method for struct member 'multipaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Paint}  multiple bones in wpaint. </p>
	 * @see #__DNA__FIELD__multipaint
	 */
	
	public void setMultipaint(byte multipaint) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1032, multipaint);
		} else {
			__io__block.writeByte(__io__address + 940, multipaint);
		}
	}

	/**
	 * Get method for struct member 'weightuser'.
	 * @see #__DNA__FIELD__weightuser
	 */
	
	public byte getWeightuser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1033);
		} else {
			return __io__block.readByte(__io__address + 941);
		}
	}

	/**
	 * Set method for struct member 'weightuser'.
	 * @see #__DNA__FIELD__weightuser
	 */
	
	public void setWeightuser(byte weightuser) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1033, weightuser);
		} else {
			__io__block.writeByte(__io__address + 941, weightuser);
		}
	}

	/**
	 * Get method for struct member 'vgroupsubset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Subset selection filter in wpaint. </p>
	 * @see #__DNA__FIELD__vgroupsubset
	 */
	
	public byte getVgroupsubset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1034);
		} else {
			return __io__block.readByte(__io__address + 942);
		}
	}

	/**
	 * Set method for struct member 'vgroupsubset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Subset selection filter in wpaint. </p>
	 * @see #__DNA__FIELD__vgroupsubset
	 */
	
	public void setVgroupsubset(byte vgroupsubset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1034, vgroupsubset);
		} else {
			__io__block.writeByte(__io__address + 942, vgroupsubset);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> UV painting </p>
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1035, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 943, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> UV painting </p>
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1035;
		} else {
			__dna__offset = 943;
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
	 * Get method for struct member 'uv_sculpt_settings'.
	 * @see #__DNA__FIELD__uv_sculpt_settings
	 */
	
	public byte getUv_sculpt_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1038);
		} else {
			return __io__block.readByte(__io__address + 946);
		}
	}

	/**
	 * Set method for struct member 'uv_sculpt_settings'.
	 * @see #__DNA__FIELD__uv_sculpt_settings
	 */
	
	public void setUv_sculpt_settings(byte uv_sculpt_settings) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1038, uv_sculpt_settings);
		} else {
			__io__block.writeByte(__io__address + 946, uv_sculpt_settings);
		}
	}

	/**
	 * Get method for struct member 'uv_relax_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Algorithm used for UV relaxation
	 * @see #__DNA__FIELD__uv_relax_method
	 */
	
	public byte getUv_relax_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1039);
		} else {
			return __io__block.readByte(__io__address + 947);
		}
	}

	/**
	 * Set method for struct member 'uv_relax_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Algorithm used for UV relaxation
	 * @see #__DNA__FIELD__uv_relax_method
	 */
	
	public void setUv_relax_method(byte uv_relax_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1039, uv_relax_method);
		} else {
			__io__block.writeByte(__io__address + 947, uv_relax_method);
		}
	}

	/**
	 * Get method for struct member 'sculpt_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX: these sculpt_paint_* fields are deprecated, use the unified_paint_settings field instead! 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_settings
	 */
	
	public short getSculpt_paint_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1040);
		} else {
			return __io__block.readShort(__io__address + 948);
		}
	}

	/**
	 * Set method for struct member 'sculpt_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX: these sculpt_paint_* fields are deprecated, use the unified_paint_settings field instead! 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_settings
	 */
	
	public void setSculpt_paint_settings(short sculpt_paint_settings) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1040, sculpt_paint_settings);
		} else {
			__io__block.writeShort(__io__address + 948, sculpt_paint_settings);
		}
	}

	/**
	 * Get method for struct member '_pad5'.
	 * @see #__DNA__FIELD___pad5
	 */
	
	public CArrayFacade<Byte> get_pad5() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1042, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 950, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad5'.
	 * @see #__DNA__FIELD___pad5
	 */
	
	public void set_pad5(CArrayFacade<Byte> _pad5) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1042;
		} else {
			__dna__offset = 950;
		}
		if (__io__equals(_pad5, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad5)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad5);
		} else {
			__io__generic__copy( get_pad5(), _pad5);
		}
	}

	/**
	 * Get method for struct member 'sculpt_paint_unified_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_unified_size
	 */
	
	public int getSculpt_paint_unified_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1044);
		} else {
			return __io__block.readInt(__io__address + 952);
		}
	}

	/**
	 * Set method for struct member 'sculpt_paint_unified_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_unified_size
	 */
	
	public void setSculpt_paint_unified_size(int sculpt_paint_unified_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1044, sculpt_paint_unified_size);
		} else {
			__io__block.writeInt(__io__address + 952, sculpt_paint_unified_size);
		}
	}

	/**
	 * Get method for struct member 'sculpt_paint_unified_unprojected_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_unified_unprojected_radius
	 */
	
	public float getSculpt_paint_unified_unprojected_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1048);
		} else {
			return __io__block.readFloat(__io__address + 956);
		}
	}

	/**
	 * Set method for struct member 'sculpt_paint_unified_unprojected_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_unified_unprojected_radius
	 */
	
	public void setSculpt_paint_unified_unprojected_radius(float sculpt_paint_unified_unprojected_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1048, sculpt_paint_unified_unprojected_radius);
		} else {
			__io__block.writeFloat(__io__address + 956, sculpt_paint_unified_unprojected_radius);
		}
	}

	/**
	 * Get method for struct member 'sculpt_paint_unified_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_unified_alpha
	 */
	
	public float getSculpt_paint_unified_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1052);
		} else {
			return __io__block.readFloat(__io__address + 960);
		}
	}

	/**
	 * Set method for struct member 'sculpt_paint_unified_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_unified_alpha
	 */
	
	public void setSculpt_paint_unified_alpha(float sculpt_paint_unified_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1052, sculpt_paint_unified_alpha);
		} else {
			__io__block.writeFloat(__io__address + 960, sculpt_paint_unified_alpha);
		}
	}

	/**
	 * Get method for struct member 'unified_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Unified {@link Paint}  Settings </p>
	 * @see #__DNA__FIELD__unified_paint_settings
	 */
	
	public UnifiedPaintSettings getUnified_paint_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new UnifiedPaintSettings(__io__address + 1056, __io__block, __io__blockTable);
		} else {
			return new UnifiedPaintSettings(__io__address + 964, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'unified_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Unified {@link Paint}  Settings </p>
	 * @see #__DNA__FIELD__unified_paint_settings
	 */
	
	public void setUnified_paint_settings(UnifiedPaintSettings unified_paint_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1056;
		} else {
			__dna__offset = 964;
		}
		if (__io__equals(unified_paint_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, unified_paint_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, unified_paint_settings);
		} else {
			__io__generic__copy( getUnified_paint_settings(), unified_paint_settings);
		}
	}

	/**
	 * Get method for struct member 'curve_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__curve_paint_settings
	 */
	
	public CurvePaintSettings getCurve_paint_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CurvePaintSettings(__io__address + 1208, __io__block, __io__blockTable);
		} else {
			return new CurvePaintSettings(__io__address + 1112, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'curve_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__curve_paint_settings
	 */
	
	public void setCurve_paint_settings(CurvePaintSettings curve_paint_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1208;
		} else {
			__dna__offset = 1112;
		}
		if (__io__equals(curve_paint_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, curve_paint_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, curve_paint_settings);
		} else {
			__io__generic__copy( getCurve_paint_settings(), curve_paint_settings);
		}
	}

	/**
	 * Get method for struct member 'statvis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__statvis
	 */
	
	public MeshStatVis getStatvis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MeshStatVis(__io__address + 1240, __io__block, __io__blockTable);
		} else {
			return new MeshStatVis(__io__address + 1144, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'statvis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__statvis
	 */
	
	public void setStatvis(MeshStatVis statvis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1240;
		} else {
			__dna__offset = 1144;
		}
		if (__io__equals(statvis, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, statvis)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, statvis);
		} else {
			__io__generic__copy( getStatvis(), statvis);
		}
	}

	/**
	 * Get method for struct member 'normal_vector'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Normal Vector used to copy, add or multiply<h4>Blender Source Code:</h4>
	 * <p> Normal {@link Editing}  </p>
	 * @see #__DNA__FIELD__normal_vector
	 */
	
	public CArrayFacade<Float> getNormal_vector() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1280, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'normal_vector'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Normal Vector used to copy, add or multiply<h4>Blender Source Code:</h4>
	 * <p> Normal {@link Editing}  </p>
	 * @see #__DNA__FIELD__normal_vector
	 */
	
	public void setNormal_vector(CArrayFacade<Float> normal_vector) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1280;
		} else {
			__dna__offset = 1184;
		}
		if (__io__equals(normal_vector, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, normal_vector)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, normal_vector);
		} else {
			__io__generic__copy( getNormal_vector(), normal_vector);
		}
	}

	/**
	 * Get method for struct member '_pad6'.
	 * @see #__DNA__FIELD___pad6
	 */
	
	public CArrayFacade<Byte> get_pad6() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1292, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad6'.
	 * @see #__DNA__FIELD___pad6
	 */
	
	public void set_pad6(CArrayFacade<Byte> _pad6) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1292;
		} else {
			__dna__offset = 1196;
		}
		if (__io__equals(_pad6, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad6)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad6);
		} else {
			__io__generic__copy( get_pad6(), _pad6);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ToolSettings> __io__addressof() {
		return new CPointer<ToolSettings>(__io__address, new Class[]{ToolSettings.class}, __io__block, __io__blockTable);
	}

}
