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
 * 
 */

@CMetaData(size32=732, size64=840)
public class ToolSettings extends CFacade {

	/**
	 * This is the sdna index of the struct ToolSettings.
	 * <p>
	 * It is required when allocating a new block to store data for ToolSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 203;

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
	 * Field descriptor (offset) for struct member 'gp_vertexpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gpencil vertex paint. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gp_vertexpaint);
	 * CPointer&lt;CPointer&lt;GpVertexPaint&gt;&gt; p_gp_vertexpaint = p.cast(new Class[]{CPointer.class, GpVertexPaint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_vertexpaint'</li>
	 * <li>Signature: 'GpVertexPaint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_vertexpaint = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'gp_sculptpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gpencil sculpt paint. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gp_sculptpaint);
	 * CPointer&lt;CPointer&lt;GpSculptPaint&gt;&gt; p_gp_sculptpaint = p.cast(new Class[]{CPointer.class, GpSculptPaint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_sculptpaint'</li>
	 * <li>Signature: 'GpSculptPaint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_sculptpaint = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member 'gp_weightpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gpencil weight paint. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gp_weightpaint);
	 * CPointer&lt;CPointer&lt;GpWeightPaint&gt;&gt; p_gp_weightpaint = p.cast(new Class[]{CPointer.class, GpWeightPaint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_weightpaint'</li>
	 * <li>Signature: 'GpWeightPaint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_weightpaint = new long[]{28, 56};

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
	public static final long[] __DNA__FIELD__vgroup_weight = new long[]{32, 64};

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
	public static final long[] __DNA__FIELD__doublimit = new long[]{36, 68};

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
	public static final long[] __DNA__FIELD__automerge = new long[]{40, 72};

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
	public static final long[] __DNA__FIELD__object_flag = new long[]{41, 73};

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
	public static final long[] __DNA__FIELD__selectmode = new long[]{42, 74};

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
	public static final long[] __DNA__FIELD__unwrapper = new long[]{44, 76};

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
	public static final long[] __DNA__FIELD__uvcalc_flag = new long[]{45, 77};

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
	public static final long[] __DNA__FIELD__uv_flag = new long[]{46, 78};

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
	public static final long[] __DNA__FIELD__uv_selectmode = new long[]{47, 79};

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
	public static final long[] __DNA__FIELD__uvcalc_margin = new long[]{48, 80};

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
	public static final long[] __DNA__FIELD__autoik_chainlen = new long[]{52, 84};

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
	public static final long[] __DNA__FIELD__gpencil_flags = new long[]{54, 86};

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
	public static final long[] __DNA__FIELD__gpencil_v3d_align = new long[]{55, 87};

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
	public static final long[] __DNA__FIELD__gpencil_v2d_align = new long[]{56, 88};

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
	public static final long[] __DNA__FIELD__gpencil_seq_align = new long[]{57, 89};

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
	public static final long[] __DNA__FIELD__gpencil_ima_align = new long[]{58, 90};

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
	public static final long[] __DNA__FIELD__annotate_v3d_align = new long[]{59, 91};

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
	public static final long[] __DNA__FIELD__annotate_thickness = new long[]{60, 92};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_selectmode_edit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke selection mode for Edit. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gpencil_selectmode_edit);
	 * CPointer&lt;Byte&gt; p_gpencil_selectmode_edit = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_selectmode_edit'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_selectmode_edit = new long[]{62, 94};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_selectmode_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke selection mode for {@link Sculpt} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gpencil_selectmode_sculpt);
	 * CPointer&lt;Byte&gt; p_gpencil_selectmode_sculpt = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_selectmode_sculpt'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_selectmode_sculpt = new long[]{63, 95};

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
	 * <li>Actual Size (32bit/64bit): 64/80</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_sculpt = new long[]{64, 96};

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
	public static final long[] __DNA__FIELD__gp_interpolate = new long[]{128, 176};

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
	 * <li>Actual Size (32bit/64bit): 120/152</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__imapaint = new long[]{148, 200};

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
	public static final long[] __DNA__FIELD__particle = new long[]{268, 352};

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
	public static final long[] __DNA__FIELD__proportional_size = new long[]{428, 528};

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
	public static final long[] __DNA__FIELD__select_thresh = new long[]{432, 532};

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
	public static final long[] __DNA__FIELD__autokey_flag = new long[]{436, 536};

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
	public static final long[] __DNA__FIELD__autokey_mode = new long[]{438, 538};

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
	public static final long[] __DNA__FIELD__keyframe_type = new long[]{439, 539};

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
	public static final long[] __DNA__FIELD__multires_subdiv_type = new long[]{440, 540};

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
	public static final long[] __DNA__FIELD__edge_mode = new long[]{441, 541};

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
	public static final long[] __DNA__FIELD__edge_mode_live_unwrap = new long[]{442, 542};

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
	public static final long[] __DNA__FIELD___pad1 = new long[]{443, 543};

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
	public static final long[] __DNA__FIELD__transform_pivot_point = new long[]{444, 544};

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
	public static final long[] __DNA__FIELD__transform_flag = new long[]{445, 545};

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
	public static final long[] __DNA__FIELD__snap_mode = new long[]{446, 546};

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
	public static final long[] __DNA__FIELD__snap_node_mode = new long[]{447, 547};

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
	public static final long[] __DNA__FIELD__snap_uv_mode = new long[]{448, 548};

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
	public static final long[] __DNA__FIELD__snap_flag = new long[]{449, 549};

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
	public static final long[] __DNA__FIELD__snap_target = new long[]{450, 550};

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
	public static final long[] __DNA__FIELD__snap_transform_mode_flag = new long[]{451, 551};

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
	public static final long[] __DNA__FIELD__proportional_edit = new long[]{452, 552};

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
	public static final long[] __DNA__FIELD__prop_mode = new long[]{453, 553};

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
	public static final long[] __DNA__FIELD__proportional_objects = new long[]{454, 554};

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
	public static final long[] __DNA__FIELD__proportional_mask = new long[]{455, 555};

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
	public static final long[] __DNA__FIELD__proportional_action = new long[]{456, 556};

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
	public static final long[] __DNA__FIELD__proportional_fcurve = new long[]{457, 557};

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
	public static final long[] __DNA__FIELD__lock_markers = new long[]{458, 558};

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
	public static final long[] __DNA__FIELD__auto_normalize = new long[]{459, 559};

	/**
	 * Field descriptor (offset) for struct member 'wpaint_lock_relative'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Present weights as if all locked vertex groups were deleted, and the remaining deform groups normalized. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__wpaint_lock_relative);
	 * CPointer&lt;Byte&gt; p_wpaint_lock_relative = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wpaint_lock_relative'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wpaint_lock_relative = new long[]{460, 560};

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
	public static final long[] __DNA__FIELD__multipaint = new long[]{461, 561};

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
	public static final long[] __DNA__FIELD__weightuser = new long[]{462, 562};

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
	public static final long[] __DNA__FIELD__vgroupsubset = new long[]{463, 563};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_selectmode_vertex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke selection mode for Vertex {@link Paint} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gpencil_selectmode_vertex);
	 * CPointer&lt;Byte&gt; p_gpencil_selectmode_vertex = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_selectmode_vertex'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_selectmode_vertex = new long[]{464, 564};

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
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{465, 565};

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
	public static final long[] __DNA__FIELD__uv_sculpt_settings = new long[]{466, 566};

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
	public static final long[] __DNA__FIELD__uv_relax_method = new long[]{467, 567};

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
	public static final long[] __DNA__FIELD__sculpt_paint_settings = new long[]{468, 568};

	/**
	 * Field descriptor (offset) for struct member 'workspace_tool_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Action when dragging in the viewport
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__workspace_tool_type);
	 * CPointer&lt;Byte&gt; p_workspace_tool_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'workspace_tool_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__workspace_tool_type = new long[]{470, 570};

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
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad5 = new long[]{471, 571};

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
	public static final long[] __DNA__FIELD__sculpt_paint_unified_size = new long[]{472, 572};

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
	public static final long[] __DNA__FIELD__sculpt_paint_unified_unprojected_radius = new long[]{476, 576};

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
	public static final long[] __DNA__FIELD__sculpt_paint_unified_alpha = new long[]{480, 580};

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
	 * <li>Actual Size (32bit/64bit): 156/160</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__unified_paint_settings = new long[]{484, 584};

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
	public static final long[] __DNA__FIELD__curve_paint_settings = new long[]{640, 744};

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
	public static final long[] __DNA__FIELD__statvis = new long[]{672, 776};

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
	public static final long[] __DNA__FIELD__normal_vector = new long[]{712, 816};

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
	public static final long[] __DNA__FIELD___pad6 = new long[]{724, 828};

	/**
	 * Field descriptor (offset) for struct member 'custom_bevel_profile_preset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used for defining a profile's path<h4>Blender Source Code:</h4>
	 * <p> Custom {@link Curve}  Profile for bevel tool: Temporary until there is a proper preset system that stores the profiles or maybe stores entire bevel configurations. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__custom_bevel_profile_preset);
	 * CPointer&lt;CPointer&lt;CurveProfile&gt;&gt; p_custom_bevel_profile_preset = p.cast(new Class[]{CPointer.class, CurveProfile.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'custom_bevel_profile_preset'</li>
	 * <li>Signature: 'CurveProfile*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__custom_bevel_profile_preset = new long[]{728, 832};

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
	 * Get method for struct member 'gp_vertexpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gpencil vertex paint. </p>
	 * @see #__DNA__FIELD__gp_vertexpaint
	 */
	
	public CPointer<GpVertexPaint> getGp_vertexpaint() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{GpVertexPaint.class};
		return new CPointer<GpVertexPaint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, GpVertexPaint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gp_vertexpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gpencil vertex paint. </p>
	 * @see #__DNA__FIELD__gp_vertexpaint
	 */
	
	public void setGp_vertexpaint(CPointer<GpVertexPaint> gp_vertexpaint) throws IOException
	{
		long __address = ((gp_vertexpaint == null) ? 0 : gp_vertexpaint.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'gp_sculptpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gpencil sculpt paint. </p>
	 * @see #__DNA__FIELD__gp_sculptpaint
	 */
	
	public CPointer<GpSculptPaint> getGp_sculptpaint() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{GpSculptPaint.class};
		return new CPointer<GpSculptPaint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, GpSculptPaint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gp_sculptpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gpencil sculpt paint. </p>
	 * @see #__DNA__FIELD__gp_sculptpaint
	 */
	
	public void setGp_sculptpaint(CPointer<GpSculptPaint> gp_sculptpaint) throws IOException
	{
		long __address = ((gp_sculptpaint == null) ? 0 : gp_sculptpaint.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'gp_weightpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gpencil weight paint. </p>
	 * @see #__DNA__FIELD__gp_weightpaint
	 */
	
	public CPointer<GpWeightPaint> getGp_weightpaint() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 28);
		}
		Class<?>[] __dna__targetTypes = new Class[]{GpWeightPaint.class};
		return new CPointer<GpWeightPaint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, GpWeightPaint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gp_weightpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gpencil weight paint. </p>
	 * @see #__DNA__FIELD__gp_weightpaint
	 */
	
	public void setGp_weightpaint(CPointer<GpWeightPaint> gp_weightpaint) throws IOException
	{
		long __address = ((gp_weightpaint == null) ? 0 : gp_weightpaint.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 56, __address);
		} else {
			__io__block.writeLong(__io__address + 28, __address);
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
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 32);
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
			__io__block.writeFloat(__io__address + 64, vgroup_weight);
		} else {
			__io__block.writeFloat(__io__address + 32, vgroup_weight);
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
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 36);
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
			__io__block.writeFloat(__io__address + 68, doublimit);
		} else {
			__io__block.writeFloat(__io__address + 36, doublimit);
		}
	}

	/**
	 * Get method for struct member 'automerge'.
	 * @see #__DNA__FIELD__automerge
	 */
	
	public byte getAutomerge() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 72);
		} else {
			return __io__block.readByte(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'automerge'.
	 * @see #__DNA__FIELD__automerge
	 */
	
	public void setAutomerge(byte automerge) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 72, automerge);
		} else {
			__io__block.writeByte(__io__address + 40, automerge);
		}
	}

	/**
	 * Get method for struct member 'object_flag'.
	 * @see #__DNA__FIELD__object_flag
	 */
	
	public byte getObject_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 73);
		} else {
			return __io__block.readByte(__io__address + 41);
		}
	}

	/**
	 * Set method for struct member 'object_flag'.
	 * @see #__DNA__FIELD__object_flag
	 */
	
	public void setObject_flag(byte object_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 73, object_flag);
		} else {
			__io__block.writeByte(__io__address + 41, object_flag);
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
			return __io__block.readShort(__io__address + 74);
		} else {
			return __io__block.readShort(__io__address + 42);
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
			__io__block.writeShort(__io__address + 74, selectmode);
		} else {
			__io__block.writeShort(__io__address + 42, selectmode);
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
			return __io__block.readByte(__io__address + 76);
		} else {
			return __io__block.readByte(__io__address + 44);
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
			__io__block.writeByte(__io__address + 76, unwrapper);
		} else {
			__io__block.writeByte(__io__address + 44, unwrapper);
		}
	}

	/**
	 * Get method for struct member 'uvcalc_flag'.
	 * @see #__DNA__FIELD__uvcalc_flag
	 */
	
	public byte getUvcalc_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 77);
		} else {
			return __io__block.readByte(__io__address + 45);
		}
	}

	/**
	 * Set method for struct member 'uvcalc_flag'.
	 * @see #__DNA__FIELD__uvcalc_flag
	 */
	
	public void setUvcalc_flag(byte uvcalc_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 77, uvcalc_flag);
		} else {
			__io__block.writeByte(__io__address + 45, uvcalc_flag);
		}
	}

	/**
	 * Get method for struct member 'uv_flag'.
	 * @see #__DNA__FIELD__uv_flag
	 */
	
	public byte getUv_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 78);
		} else {
			return __io__block.readByte(__io__address + 46);
		}
	}

	/**
	 * Set method for struct member 'uv_flag'.
	 * @see #__DNA__FIELD__uv_flag
	 */
	
	public void setUv_flag(byte uv_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 78, uv_flag);
		} else {
			__io__block.writeByte(__io__address + 46, uv_flag);
		}
	}

	/**
	 * Get method for struct member 'uv_selectmode'.
	 * @see #__DNA__FIELD__uv_selectmode
	 */
	
	public byte getUv_selectmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 79);
		} else {
			return __io__block.readByte(__io__address + 47);
		}
	}

	/**
	 * Set method for struct member 'uv_selectmode'.
	 * @see #__DNA__FIELD__uv_selectmode
	 */
	
	public void setUv_selectmode(byte uv_selectmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 79, uv_selectmode);
		} else {
			__io__block.writeByte(__io__address + 47, uv_selectmode);
		}
	}

	/**
	 * Get method for struct member 'uvcalc_margin'.
	 * @see #__DNA__FIELD__uvcalc_margin
	 */
	
	public float getUvcalc_margin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'uvcalc_margin'.
	 * @see #__DNA__FIELD__uvcalc_margin
	 */
	
	public void setUvcalc_margin(float uvcalc_margin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, uvcalc_margin);
		} else {
			__io__block.writeFloat(__io__address + 48, uvcalc_margin);
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
			return __io__block.readShort(__io__address + 84);
		} else {
			return __io__block.readShort(__io__address + 52);
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
			__io__block.writeShort(__io__address + 84, autoik_chainlen);
		} else {
			__io__block.writeShort(__io__address + 52, autoik_chainlen);
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
			return __io__block.readByte(__io__address + 86);
		} else {
			return __io__block.readByte(__io__address + 54);
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
			__io__block.writeByte(__io__address + 86, gpencil_flags);
		} else {
			__io__block.writeByte(__io__address + 54, gpencil_flags);
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
			return __io__block.readByte(__io__address + 87);
		} else {
			return __io__block.readByte(__io__address + 55);
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
			__io__block.writeByte(__io__address + 87, gpencil_v3d_align);
		} else {
			__io__block.writeByte(__io__address + 55, gpencil_v3d_align);
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
			return __io__block.readByte(__io__address + 88);
		} else {
			return __io__block.readByte(__io__address + 56);
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
			__io__block.writeByte(__io__address + 88, gpencil_v2d_align);
		} else {
			__io__block.writeByte(__io__address + 56, gpencil_v2d_align);
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
			return __io__block.readByte(__io__address + 89);
		} else {
			return __io__block.readByte(__io__address + 57);
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
			__io__block.writeByte(__io__address + 89, gpencil_seq_align);
		} else {
			__io__block.writeByte(__io__address + 57, gpencil_seq_align);
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
			return __io__block.readByte(__io__address + 90);
		} else {
			return __io__block.readByte(__io__address + 58);
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
			__io__block.writeByte(__io__address + 90, gpencil_ima_align);
		} else {
			__io__block.writeByte(__io__address + 58, gpencil_ima_align);
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
			return __io__block.readByte(__io__address + 91);
		} else {
			return __io__block.readByte(__io__address + 59);
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
			__io__block.writeByte(__io__address + 91, annotate_v3d_align);
		} else {
			__io__block.writeByte(__io__address + 59, annotate_v3d_align);
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
			return __io__block.readShort(__io__address + 92);
		} else {
			return __io__block.readShort(__io__address + 60);
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
			__io__block.writeShort(__io__address + 92, annotate_thickness);
		} else {
			__io__block.writeShort(__io__address + 60, annotate_thickness);
		}
	}

	/**
	 * Get method for struct member 'gpencil_selectmode_edit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke selection mode for Edit. </p>
	 * @see #__DNA__FIELD__gpencil_selectmode_edit
	 */
	
	public byte getGpencil_selectmode_edit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 94);
		} else {
			return __io__block.readByte(__io__address + 62);
		}
	}

	/**
	 * Set method for struct member 'gpencil_selectmode_edit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke selection mode for Edit. </p>
	 * @see #__DNA__FIELD__gpencil_selectmode_edit
	 */
	
	public void setGpencil_selectmode_edit(byte gpencil_selectmode_edit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 94, gpencil_selectmode_edit);
		} else {
			__io__block.writeByte(__io__address + 62, gpencil_selectmode_edit);
		}
	}

	/**
	 * Get method for struct member 'gpencil_selectmode_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke selection mode for {@link Sculpt} . </p>
	 * @see #__DNA__FIELD__gpencil_selectmode_sculpt
	 */
	
	public byte getGpencil_selectmode_sculpt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 95);
		} else {
			return __io__block.readByte(__io__address + 63);
		}
	}

	/**
	 * Set method for struct member 'gpencil_selectmode_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke selection mode for {@link Sculpt} . </p>
	 * @see #__DNA__FIELD__gpencil_selectmode_sculpt
	 */
	
	public void setGpencil_selectmode_sculpt(byte gpencil_selectmode_sculpt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 95, gpencil_selectmode_sculpt);
		} else {
			__io__block.writeByte(__io__address + 63, gpencil_selectmode_sculpt);
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
			return new GP_Sculpt_Settings(__io__address + 96, __io__block, __io__blockTable);
		} else {
			return new GP_Sculpt_Settings(__io__address + 64, __io__block, __io__blockTable);
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
			__dna__offset = 96;
		} else {
			__dna__offset = 64;
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
			return new GP_Interpolate_Settings(__io__address + 176, __io__block, __io__blockTable);
		} else {
			return new GP_Interpolate_Settings(__io__address + 128, __io__block, __io__blockTable);
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
			__dna__offset = 176;
		} else {
			__dna__offset = 128;
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
			return new ImagePaintSettings(__io__address + 200, __io__block, __io__blockTable);
		} else {
			return new ImagePaintSettings(__io__address + 148, __io__block, __io__blockTable);
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
			__dna__offset = 200;
		} else {
			__dna__offset = 148;
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
			return new ParticleEditSettings(__io__address + 352, __io__block, __io__blockTable);
		} else {
			return new ParticleEditSettings(__io__address + 268, __io__block, __io__blockTable);
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
			__dna__offset = 352;
		} else {
			__dna__offset = 268;
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
			return __io__block.readFloat(__io__address + 528);
		} else {
			return __io__block.readFloat(__io__address + 428);
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
			__io__block.writeFloat(__io__address + 528, proportional_size);
		} else {
			__io__block.writeFloat(__io__address + 428, proportional_size);
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
			return __io__block.readFloat(__io__address + 532);
		} else {
			return __io__block.readFloat(__io__address + 432);
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
			__io__block.writeFloat(__io__address + 532, select_thresh);
		} else {
			__io__block.writeFloat(__io__address + 432, select_thresh);
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
			return __io__block.readShort(__io__address + 536);
		} else {
			return __io__block.readShort(__io__address + 436);
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
			__io__block.writeShort(__io__address + 536, autokey_flag);
		} else {
			__io__block.writeShort(__io__address + 436, autokey_flag);
		}
	}

	/**
	 * Get method for struct member 'autokey_mode'.
	 * @see #__DNA__FIELD__autokey_mode
	 */
	
	public byte getAutokey_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 538);
		} else {
			return __io__block.readByte(__io__address + 438);
		}
	}

	/**
	 * Set method for struct member 'autokey_mode'.
	 * @see #__DNA__FIELD__autokey_mode
	 */
	
	public void setAutokey_mode(byte autokey_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 538, autokey_mode);
		} else {
			__io__block.writeByte(__io__address + 438, autokey_mode);
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
			return __io__block.readByte(__io__address + 539);
		} else {
			return __io__block.readByte(__io__address + 439);
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
			__io__block.writeByte(__io__address + 539, keyframe_type);
		} else {
			__io__block.writeByte(__io__address + 439, keyframe_type);
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
			return __io__block.readByte(__io__address + 540);
		} else {
			return __io__block.readByte(__io__address + 440);
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
			__io__block.writeByte(__io__address + 540, multires_subdiv_type);
		} else {
			__io__block.writeByte(__io__address + 440, multires_subdiv_type);
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
			return __io__block.readByte(__io__address + 541);
		} else {
			return __io__block.readByte(__io__address + 441);
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
			__io__block.writeByte(__io__address + 541, edge_mode);
		} else {
			__io__block.writeByte(__io__address + 441, edge_mode);
		}
	}

	/**
	 * Get method for struct member 'edge_mode_live_unwrap'.
	 * @see #__DNA__FIELD__edge_mode_live_unwrap
	 */
	
	public byte getEdge_mode_live_unwrap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 542);
		} else {
			return __io__block.readByte(__io__address + 442);
		}
	}

	/**
	 * Set method for struct member 'edge_mode_live_unwrap'.
	 * @see #__DNA__FIELD__edge_mode_live_unwrap
	 */
	
	public void setEdge_mode_live_unwrap(byte edge_mode_live_unwrap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 542, edge_mode_live_unwrap);
		} else {
			__io__block.writeByte(__io__address + 442, edge_mode_live_unwrap);
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
			return new CArrayFacade<Byte>(__io__address + 543, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 443, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 543;
		} else {
			__dna__offset = 443;
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
			return __io__block.readByte(__io__address + 544);
		} else {
			return __io__block.readByte(__io__address + 444);
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
			__io__block.writeByte(__io__address + 544, transform_pivot_point);
		} else {
			__io__block.writeByte(__io__address + 444, transform_pivot_point);
		}
	}

	/**
	 * Get method for struct member 'transform_flag'.
	 * @see #__DNA__FIELD__transform_flag
	 */
	
	public byte getTransform_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 545);
		} else {
			return __io__block.readByte(__io__address + 445);
		}
	}

	/**
	 * Set method for struct member 'transform_flag'.
	 * @see #__DNA__FIELD__transform_flag
	 */
	
	public void setTransform_flag(byte transform_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 545, transform_flag);
		} else {
			__io__block.writeByte(__io__address + 445, transform_flag);
		}
	}

	/**
	 * Get method for struct member 'snap_mode'.
	 * @see #__DNA__FIELD__snap_mode
	 */
	
	public byte getSnap_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 546);
		} else {
			return __io__block.readByte(__io__address + 446);
		}
	}

	/**
	 * Set method for struct member 'snap_mode'.
	 * @see #__DNA__FIELD__snap_mode
	 */
	
	public void setSnap_mode(byte snap_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 546, snap_mode);
		} else {
			__io__block.writeByte(__io__address + 446, snap_mode);
		}
	}

	/**
	 * Get method for struct member 'snap_node_mode'.
	 * @see #__DNA__FIELD__snap_node_mode
	 */
	
	public byte getSnap_node_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 547);
		} else {
			return __io__block.readByte(__io__address + 447);
		}
	}

	/**
	 * Set method for struct member 'snap_node_mode'.
	 * @see #__DNA__FIELD__snap_node_mode
	 */
	
	public void setSnap_node_mode(byte snap_node_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 547, snap_node_mode);
		} else {
			__io__block.writeByte(__io__address + 447, snap_node_mode);
		}
	}

	/**
	 * Get method for struct member 'snap_uv_mode'.
	 * @see #__DNA__FIELD__snap_uv_mode
	 */
	
	public byte getSnap_uv_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 548);
		} else {
			return __io__block.readByte(__io__address + 448);
		}
	}

	/**
	 * Set method for struct member 'snap_uv_mode'.
	 * @see #__DNA__FIELD__snap_uv_mode
	 */
	
	public void setSnap_uv_mode(byte snap_uv_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 548, snap_uv_mode);
		} else {
			__io__block.writeByte(__io__address + 448, snap_uv_mode);
		}
	}

	/**
	 * Get method for struct member 'snap_flag'.
	 * @see #__DNA__FIELD__snap_flag
	 */
	
	public byte getSnap_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 549);
		} else {
			return __io__block.readByte(__io__address + 449);
		}
	}

	/**
	 * Set method for struct member 'snap_flag'.
	 * @see #__DNA__FIELD__snap_flag
	 */
	
	public void setSnap_flag(byte snap_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 549, snap_flag);
		} else {
			__io__block.writeByte(__io__address + 449, snap_flag);
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
			return __io__block.readByte(__io__address + 550);
		} else {
			return __io__block.readByte(__io__address + 450);
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
			__io__block.writeByte(__io__address + 550, snap_target);
		} else {
			__io__block.writeByte(__io__address + 450, snap_target);
		}
	}

	/**
	 * Get method for struct member 'snap_transform_mode_flag'.
	 * @see #__DNA__FIELD__snap_transform_mode_flag
	 */
	
	public byte getSnap_transform_mode_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 551);
		} else {
			return __io__block.readByte(__io__address + 451);
		}
	}

	/**
	 * Set method for struct member 'snap_transform_mode_flag'.
	 * @see #__DNA__FIELD__snap_transform_mode_flag
	 */
	
	public void setSnap_transform_mode_flag(byte snap_transform_mode_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 551, snap_transform_mode_flag);
		} else {
			__io__block.writeByte(__io__address + 451, snap_transform_mode_flag);
		}
	}

	/**
	 * Get method for struct member 'proportional_edit'.
	 * @see #__DNA__FIELD__proportional_edit
	 */
	
	public byte getProportional_edit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 552);
		} else {
			return __io__block.readByte(__io__address + 452);
		}
	}

	/**
	 * Set method for struct member 'proportional_edit'.
	 * @see #__DNA__FIELD__proportional_edit
	 */
	
	public void setProportional_edit(byte proportional_edit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 552, proportional_edit);
		} else {
			__io__block.writeByte(__io__address + 452, proportional_edit);
		}
	}

	/**
	 * Get method for struct member 'prop_mode'.
	 * @see #__DNA__FIELD__prop_mode
	 */
	
	public byte getProp_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 553);
		} else {
			return __io__block.readByte(__io__address + 453);
		}
	}

	/**
	 * Set method for struct member 'prop_mode'.
	 * @see #__DNA__FIELD__prop_mode
	 */
	
	public void setProp_mode(byte prop_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 553, prop_mode);
		} else {
			__io__block.writeByte(__io__address + 453, prop_mode);
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
			return __io__block.readByte(__io__address + 554);
		} else {
			return __io__block.readByte(__io__address + 454);
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
			__io__block.writeByte(__io__address + 554, proportional_objects);
		} else {
			__io__block.writeByte(__io__address + 454, proportional_objects);
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
			return __io__block.readByte(__io__address + 555);
		} else {
			return __io__block.readByte(__io__address + 455);
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
			__io__block.writeByte(__io__address + 555, proportional_mask);
		} else {
			__io__block.writeByte(__io__address + 455, proportional_mask);
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
			return __io__block.readByte(__io__address + 556);
		} else {
			return __io__block.readByte(__io__address + 456);
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
			__io__block.writeByte(__io__address + 556, proportional_action);
		} else {
			__io__block.writeByte(__io__address + 456, proportional_action);
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
			return __io__block.readByte(__io__address + 557);
		} else {
			return __io__block.readByte(__io__address + 457);
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
			__io__block.writeByte(__io__address + 557, proportional_fcurve);
		} else {
			__io__block.writeByte(__io__address + 457, proportional_fcurve);
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
			return __io__block.readByte(__io__address + 558);
		} else {
			return __io__block.readByte(__io__address + 458);
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
			__io__block.writeByte(__io__address + 558, lock_markers);
		} else {
			__io__block.writeByte(__io__address + 458, lock_markers);
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
			return __io__block.readByte(__io__address + 559);
		} else {
			return __io__block.readByte(__io__address + 459);
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
			__io__block.writeByte(__io__address + 559, auto_normalize);
		} else {
			__io__block.writeByte(__io__address + 459, auto_normalize);
		}
	}

	/**
	 * Get method for struct member 'wpaint_lock_relative'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Present weights as if all locked vertex groups were deleted, and the remaining deform groups normalized. </p>
	 * @see #__DNA__FIELD__wpaint_lock_relative
	 */
	
	public byte getWpaint_lock_relative() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 560);
		} else {
			return __io__block.readByte(__io__address + 460);
		}
	}

	/**
	 * Set method for struct member 'wpaint_lock_relative'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Present weights as if all locked vertex groups were deleted, and the remaining deform groups normalized. </p>
	 * @see #__DNA__FIELD__wpaint_lock_relative
	 */
	
	public void setWpaint_lock_relative(byte wpaint_lock_relative) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 560, wpaint_lock_relative);
		} else {
			__io__block.writeByte(__io__address + 460, wpaint_lock_relative);
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
			return __io__block.readByte(__io__address + 561);
		} else {
			return __io__block.readByte(__io__address + 461);
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
			__io__block.writeByte(__io__address + 561, multipaint);
		} else {
			__io__block.writeByte(__io__address + 461, multipaint);
		}
	}

	/**
	 * Get method for struct member 'weightuser'.
	 * @see #__DNA__FIELD__weightuser
	 */
	
	public byte getWeightuser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 562);
		} else {
			return __io__block.readByte(__io__address + 462);
		}
	}

	/**
	 * Set method for struct member 'weightuser'.
	 * @see #__DNA__FIELD__weightuser
	 */
	
	public void setWeightuser(byte weightuser) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 562, weightuser);
		} else {
			__io__block.writeByte(__io__address + 462, weightuser);
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
			return __io__block.readByte(__io__address + 563);
		} else {
			return __io__block.readByte(__io__address + 463);
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
			__io__block.writeByte(__io__address + 563, vgroupsubset);
		} else {
			__io__block.writeByte(__io__address + 463, vgroupsubset);
		}
	}

	/**
	 * Get method for struct member 'gpencil_selectmode_vertex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke selection mode for Vertex {@link Paint} . </p>
	 * @see #__DNA__FIELD__gpencil_selectmode_vertex
	 */
	
	public byte getGpencil_selectmode_vertex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 564);
		} else {
			return __io__block.readByte(__io__address + 464);
		}
	}

	/**
	 * Set method for struct member 'gpencil_selectmode_vertex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke selection mode for Vertex {@link Paint} . </p>
	 * @see #__DNA__FIELD__gpencil_selectmode_vertex
	 */
	
	public void setGpencil_selectmode_vertex(byte gpencil_selectmode_vertex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 564, gpencil_selectmode_vertex);
		} else {
			__io__block.writeByte(__io__address + 464, gpencil_selectmode_vertex);
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
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 565, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 465, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 565;
		} else {
			__dna__offset = 465;
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
			return __io__block.readByte(__io__address + 566);
		} else {
			return __io__block.readByte(__io__address + 466);
		}
	}

	/**
	 * Set method for struct member 'uv_sculpt_settings'.
	 * @see #__DNA__FIELD__uv_sculpt_settings
	 */
	
	public void setUv_sculpt_settings(byte uv_sculpt_settings) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 566, uv_sculpt_settings);
		} else {
			__io__block.writeByte(__io__address + 466, uv_sculpt_settings);
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
			return __io__block.readByte(__io__address + 567);
		} else {
			return __io__block.readByte(__io__address + 467);
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
			__io__block.writeByte(__io__address + 567, uv_relax_method);
		} else {
			__io__block.writeByte(__io__address + 467, uv_relax_method);
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
			return __io__block.readShort(__io__address + 568);
		} else {
			return __io__block.readShort(__io__address + 468);
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
			__io__block.writeShort(__io__address + 568, sculpt_paint_settings);
		} else {
			__io__block.writeShort(__io__address + 468, sculpt_paint_settings);
		}
	}

	/**
	 * Get method for struct member 'workspace_tool_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Action when dragging in the viewport
	 * @see #__DNA__FIELD__workspace_tool_type
	 */
	
	public byte getWorkspace_tool_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 570);
		} else {
			return __io__block.readByte(__io__address + 470);
		}
	}

	/**
	 * Set method for struct member 'workspace_tool_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Action when dragging in the viewport
	 * @see #__DNA__FIELD__workspace_tool_type
	 */
	
	public void setWorkspace_tool_type(byte workspace_tool_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 570, workspace_tool_type);
		} else {
			__io__block.writeByte(__io__address + 470, workspace_tool_type);
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
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 571, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 471, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 571;
		} else {
			__dna__offset = 471;
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
			return __io__block.readInt(__io__address + 572);
		} else {
			return __io__block.readInt(__io__address + 472);
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
			__io__block.writeInt(__io__address + 572, sculpt_paint_unified_size);
		} else {
			__io__block.writeInt(__io__address + 472, sculpt_paint_unified_size);
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
			return __io__block.readFloat(__io__address + 576);
		} else {
			return __io__block.readFloat(__io__address + 476);
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
			__io__block.writeFloat(__io__address + 576, sculpt_paint_unified_unprojected_radius);
		} else {
			__io__block.writeFloat(__io__address + 476, sculpt_paint_unified_unprojected_radius);
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
			return __io__block.readFloat(__io__address + 580);
		} else {
			return __io__block.readFloat(__io__address + 480);
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
			__io__block.writeFloat(__io__address + 580, sculpt_paint_unified_alpha);
		} else {
			__io__block.writeFloat(__io__address + 480, sculpt_paint_unified_alpha);
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
			return new UnifiedPaintSettings(__io__address + 584, __io__block, __io__blockTable);
		} else {
			return new UnifiedPaintSettings(__io__address + 484, __io__block, __io__blockTable);
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
			__dna__offset = 584;
		} else {
			__dna__offset = 484;
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
			return new CurvePaintSettings(__io__address + 744, __io__block, __io__blockTable);
		} else {
			return new CurvePaintSettings(__io__address + 640, __io__block, __io__blockTable);
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
			__dna__offset = 744;
		} else {
			__dna__offset = 640;
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
			return new MeshStatVis(__io__address + 776, __io__block, __io__blockTable);
		} else {
			return new MeshStatVis(__io__address + 672, __io__block, __io__blockTable);
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
			__dna__offset = 776;
		} else {
			__dna__offset = 672;
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
			return new CArrayFacade<Float>(__io__address + 816, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 712, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 816;
		} else {
			__dna__offset = 712;
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
			return new CArrayFacade<Byte>(__io__address + 828, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 724, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 828;
		} else {
			__dna__offset = 724;
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
	 * Get method for struct member 'custom_bevel_profile_preset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used for defining a profile's path<h4>Blender Source Code:</h4>
	 * <p> Custom {@link Curve}  Profile for bevel tool: Temporary until there is a proper preset system that stores the profiles or maybe stores entire bevel configurations. </p>
	 * @see #__DNA__FIELD__custom_bevel_profile_preset
	 */
	
	public CPointer<CurveProfile> getCustom_bevel_profile_preset() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 832);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 728);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveProfile.class};
		return new CPointer<CurveProfile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveProfile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'custom_bevel_profile_preset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Used for defining a profile's path<h4>Blender Source Code:</h4>
	 * <p> Custom {@link Curve}  Profile for bevel tool: Temporary until there is a proper preset system that stores the profiles or maybe stores entire bevel configurations. </p>
	 * @see #__DNA__FIELD__custom_bevel_profile_preset
	 */
	
	public void setCustom_bevel_profile_preset(CPointer<CurveProfile> custom_bevel_profile_preset) throws IOException
	{
		long __address = ((custom_bevel_profile_preset == null) ? 0 : custom_bevel_profile_preset.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 832, __address);
		} else {
			__io__block.writeLong(__io__address + 728, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ToolSettings> __io__addressof() {
		return new CPointer<ToolSettings>(__io__address, new Class[]{ToolSettings.class}, __io__block, __io__blockTable);
	}

}
