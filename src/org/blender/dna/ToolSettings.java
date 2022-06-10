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
 * Generated facet for DNA struct type 'ToolSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=772, size64=896)
public class ToolSettings extends CFacade {

	/**
	 * This is the sdna index of the struct ToolSettings.
	 * <p>
	 * It is required when allocating a new block to store data for ToolSettings.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 218;

	/**
	 * Field descriptor (offset) for struct member 'vpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Python API</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * Field descriptor (offset) for struct member 'curves_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Curves}  sculpt. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__curves_sculpt);
	 * CPointer&lt;CPointer&lt;CurvesSculpt&gt;&gt; p_curves_sculpt = p.cast(new Class[]{CPointer.class, CurvesSculpt.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curves_sculpt'</li>
	 * <li>Signature: 'CurvesSculpt*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curves_sculpt = new long[]{32, 64};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__vgroup_weight = new long[]{36, 72};

	/**
	 * Field descriptor (offset) for struct member 'doublimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__doublimit = new long[]{40, 76};

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
	public static final long[] __DNA__FIELD__automerge = new long[]{44, 80};

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
	public static final long[] __DNA__FIELD__object_flag = new long[]{45, 81};

	/**
	 * Field descriptor (offset) for struct member 'selectmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Selection Mode for {@link Mesh}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__selectmode);
	 * CPointer&lt;Byte&gt; p_selectmode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'selectmode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__selectmode = new long[]{46, 82};

	/**
	 * Field descriptor (offset) for struct member 'unwrapper'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__unwrapper = new long[]{47, 83};

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
	public static final long[] __DNA__FIELD__uvcalc_flag = new long[]{48, 84};

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
	public static final long[] __DNA__FIELD__uv_flag = new long[]{49, 85};

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
	public static final long[] __DNA__FIELD__uv_selectmode = new long[]{50, 86};

	/**
	 * Field descriptor (offset) for struct member 'uv_sticky'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__uv_sticky);
	 * CPointer&lt;Byte&gt; p_uv_sticky = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_sticky'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_sticky = new long[]{51, 87};

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
	public static final long[] __DNA__FIELD__uvcalc_margin = new long[]{52, 88};

	/**
	 * Field descriptor (offset) for struct member 'autoik_chainlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__autoik_chainlen = new long[]{56, 92};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__gpencil_flags = new long[]{58, 94};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__gpencil_v3d_align = new long[]{59, 95};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_v2d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__gpencil_v2d_align = new long[]{60, 96};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{61, 97};

	/**
	 * Field descriptor (offset) for struct member 'annotate_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__annotate_v3d_align = new long[]{63, 99};

	/**
	 * Field descriptor (offset) for struct member 'annotate_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__annotate_thickness = new long[]{64, 100};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_selectmode_edit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__gpencil_selectmode_edit = new long[]{66, 102};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_selectmode_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__gpencil_selectmode_sculpt = new long[]{67, 103};

	/**
	 * Field descriptor (offset) for struct member 'gp_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__gp_sculpt = new long[]{68, 104};

	/**
	 * Field descriptor (offset) for struct member 'gp_interpolate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_interpolate = new long[]{132, 184};

	/**
	 * Field descriptor (offset) for struct member 'imapaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__imapaint = new long[]{136, 192};

	/**
	 * Field descriptor (offset) for struct member 'paint_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for paint mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__paint_mode);
	 * CPointer&lt;PaintModeSettings&gt; p_paint_mode = p.cast(new Class[]{PaintModeSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint_mode'</li>
	 * <li>Signature: 'PaintModeSettings'</li>
	 * <li>Actual Size (32bit/64bit): 48/56</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint_mode = new long[]{256, 344};

	/**
	 * Field descriptor (offset) for struct member 'particle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>Particle  {@link Editing}  </p>
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
	public static final long[] __DNA__FIELD__particle = new long[]{304, 400};

	/**
	 * Field descriptor (offset) for struct member 'proportional_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Display size for proportional editing circle
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__proportional_size = new long[]{464, 576};

	/**
	 * Field descriptor (offset) for struct member 'select_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__select_thresh = new long[]{468, 580};

	/**
	 * Field descriptor (offset) for struct member 'autokey_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Auto-Keying Mode Defines in DNA_userdef_types.h . </p>
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
	public static final long[] __DNA__FIELD__autokey_flag = new long[]{472, 584};

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
	public static final long[] __DNA__FIELD__autokey_mode = new long[]{474, 586};

	/**
	 * Field descriptor (offset) for struct member 'keyframe_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Type of keyframes to create when inserting keyframes
	 * <h4>Blender Source Code</h4>
	 * <p> Keyframe type (see DNA_curve_types.h ). </p>
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
	public static final long[] __DNA__FIELD__keyframe_type = new long[]{475, 587};

	/**
	 * Field descriptor (offset) for struct member 'multires_subdiv_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Multires </p>
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
	public static final long[] __DNA__FIELD__multires_subdiv_type = new long[]{476, 588};

	/**
	 * Field descriptor (offset) for struct member 'edge_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__edge_mode = new long[]{477, 589};

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
	public static final long[] __DNA__FIELD__edge_mode_live_unwrap = new long[]{478, 590};

	/**
	 * Field descriptor (offset) for struct member 'transform_pivot_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Pivot center for rotation/scaling
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__transform_pivot_point = new long[]{479, 591};

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
	public static final long[] __DNA__FIELD__transform_flag = new long[]{480, 592};

	/**
	 * Field descriptor (offset) for struct member 'snap_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Snap elements (per spacetype). </p>
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
	public static final long[] __DNA__FIELD__snap_mode = new long[]{481, 593};

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
	public static final long[] __DNA__FIELD__snap_node_mode = new long[]{482, 594};

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
	public static final long[] __DNA__FIELD__snap_uv_mode = new long[]{483, 595};

	/**
	 * Field descriptor (offset) for struct member 'snap_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Generic flags (per spacetype). </p>
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
	public static final long[] __DNA__FIELD__snap_flag = new long[]{484, 596};

	/**
	 * Field descriptor (offset) for struct member 'snap_flag_node'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__snap_flag_node);
	 * CPointer&lt;Byte&gt; p_snap_flag_node = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap_flag_node'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap_flag_node = new long[]{485, 597};

	/**
	 * Field descriptor (offset) for struct member 'snap_flag_seq'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__snap_flag_seq);
	 * CPointer&lt;Byte&gt; p_snap_flag_seq = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap_flag_seq'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap_flag_seq = new long[]{486, 598};

	/**
	 * Field descriptor (offset) for struct member 'snap_uv_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__snap_uv_flag);
	 * CPointer&lt;Byte&gt; p_snap_uv_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap_uv_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap_uv_flag = new long[]{487, 599};

	/**
	 * Field descriptor (offset) for struct member 'snap_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Which part to snap onto the target
	 * <h4>Blender Source Code</h4>
	 * <p> Default snap source. </p>
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
	public static final long[] __DNA__FIELD__snap_target = new long[]{488, 600};

	/**
	 * Field descriptor (offset) for struct member 'snap_transform_mode_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Snap mask for transform modes. </p>
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
	public static final long[] __DNA__FIELD__snap_transform_mode_flag = new long[]{489, 601};

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
	public static final long[] __DNA__FIELD__proportional_edit = new long[]{490, 602};

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
	public static final long[] __DNA__FIELD__prop_mode = new long[]{491, 603};

	/**
	 * Field descriptor (offset) for struct member 'proportional_objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__proportional_objects = new long[]{492, 604};

	/**
	 * Field descriptor (offset) for struct member 'proportional_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__proportional_mask = new long[]{493, 605};

	/**
	 * Field descriptor (offset) for struct member 'proportional_action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__proportional_action = new long[]{494, 606};

	/**
	 * Field descriptor (offset) for struct member 'proportional_fcurve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__proportional_fcurve = new long[]{495, 607};

	/**
	 * Field descriptor (offset) for struct member 'lock_markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Prevent marker editing
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__lock_markers = new long[]{496, 608};

	/**
	 * Field descriptor (offset) for struct member 'auto_normalize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__auto_normalize = new long[]{497, 609};

	/**
	 * Field descriptor (offset) for struct member 'wpaint_lock_relative'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__wpaint_lock_relative = new long[]{498, 610};

	/**
	 * Field descriptor (offset) for struct member 'multipaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__multipaint = new long[]{499, 611};

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
	public static final long[] __DNA__FIELD__weightuser = new long[]{500, 612};

	/**
	 * Field descriptor (offset) for struct member 'vgroupsubset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__vgroupsubset = new long[]{501, 613};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_selectmode_vertex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__gpencil_selectmode_vertex = new long[]{502, 614};

	/**
	 * Field descriptor (offset) for struct member 'uv_sculpt_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> UV painting </p>
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
	public static final long[] __DNA__FIELD__uv_sculpt_settings = new long[]{503, 615};

	/**
	 * Field descriptor (offset) for struct member 'uv_relax_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
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
	public static final long[] __DNA__FIELD__uv_relax_method = new long[]{504, 616};

	/**
	 * Field descriptor (offset) for struct member 'workspace_tool_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
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
	public static final long[] __DNA__FIELD__workspace_tool_type = new long[]{505, 617};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__sculpt_paint_settings = new long[]{506, 618};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_paint_unified_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__sculpt_paint_unified_size = new long[]{508, 620};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_paint_unified_unprojected_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__sculpt_paint_unified_unprojected_radius = new long[]{512, 624};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_paint_unified_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__sculpt_paint_unified_alpha = new long[]{516, 628};

	/**
	 * Field descriptor (offset) for struct member 'unified_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__unified_paint_settings = new long[]{520, 632};

	/**
	 * Field descriptor (offset) for struct member 'curve_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
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
	public static final long[] __DNA__FIELD__curve_paint_settings = new long[]{676, 792};

	/**
	 * Field descriptor (offset) for struct member 'statvis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
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
	public static final long[] __DNA__FIELD__statvis = new long[]{708, 824};

	/**
	 * Field descriptor (offset) for struct member 'normal_vector'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Normal Vector used to copy, add or multiply
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__normal_vector = new long[]{748, 864};

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
	public static final long[] __DNA__FIELD___pad6 = new long[]{760, 876};

	/**
	 * Field descriptor (offset) for struct member 'custom_bevel_profile_preset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Used for defining a profile's path
	 * <h4>Blender Source Code</h4>
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
	public static final long[] __DNA__FIELD__custom_bevel_profile_preset = new long[]{764, 880};

	/**
	 * Field descriptor (offset) for struct member 'sequencer_tool_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__sequencer_tool_settings);
	 * CPointer&lt;CPointer&lt;SequencerToolSettings&gt;&gt; p_sequencer_tool_settings = p.cast(new Class[]{CPointer.class, SequencerToolSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sequencer_tool_settings'</li>
	 * <li>Signature: 'SequencerToolSettings*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sequencer_tool_settings = new long[]{768, 888};

	public ToolSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ToolSettings(ToolSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'vpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Python API</h4>
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
	 * <h4>Blender Python API</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * <h4>Blender Source Code</h4>
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
	 * Get method for struct member 'curves_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Curves}  sculpt. </p>
	 * @see #__DNA__FIELD__curves_sculpt
	 */
	
	public CPointer<CurvesSculpt> getCurves_sculpt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurvesSculpt.class};
		return new CPointer<CurvesSculpt>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurvesSculpt.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curves_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Curves}  sculpt. </p>
	 * @see #__DNA__FIELD__curves_sculpt
	 */
	
	public void setCurves_sculpt(CPointer<CurvesSculpt> curves_sculpt) throws IOException
	{
		long __address = ((curves_sculpt == null) ? 0 : curves_sculpt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 32, __address);
		}
	}

	/**
	 * Get method for struct member 'vgroup_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Vertex group weight - used only for editmode, not weight paint </p>
	 * @see #__DNA__FIELD__vgroup_weight
	 */
	
	public float getVgroup_weight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'vgroup_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Vertex group weight - used only for editmode, not weight paint </p>
	 * @see #__DNA__FIELD__vgroup_weight
	 */
	
	public void setVgroup_weight(float vgroup_weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, vgroup_weight);
		} else {
			__io__block.writeFloat(__io__address + 36, vgroup_weight);
		}
	}

	/**
	 * Get method for struct member 'doublimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Remove doubles limit. </p>
	 * @see #__DNA__FIELD__doublimit
	 */
	
	public float getDoublimit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'doublimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Remove doubles limit. </p>
	 * @see #__DNA__FIELD__doublimit
	 */
	
	public void setDoublimit(float doublimit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, doublimit);
		} else {
			__io__block.writeFloat(__io__address + 40, doublimit);
		}
	}

	/**
	 * Get method for struct member 'automerge'.
	 * @see #__DNA__FIELD__automerge
	 */
	
	public byte getAutomerge() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 80);
		} else {
			return __io__block.readByte(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'automerge'.
	 * @see #__DNA__FIELD__automerge
	 */
	
	public void setAutomerge(byte automerge) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 80, automerge);
		} else {
			__io__block.writeByte(__io__address + 44, automerge);
		}
	}

	/**
	 * Get method for struct member 'object_flag'.
	 * @see #__DNA__FIELD__object_flag
	 */
	
	public byte getObject_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 81);
		} else {
			return __io__block.readByte(__io__address + 45);
		}
	}

	/**
	 * Set method for struct member 'object_flag'.
	 * @see #__DNA__FIELD__object_flag
	 */
	
	public void setObject_flag(byte object_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 81, object_flag);
		} else {
			__io__block.writeByte(__io__address + 45, object_flag);
		}
	}

	/**
	 * Get method for struct member 'selectmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Selection Mode for {@link Mesh}  </p>
	 * @see #__DNA__FIELD__selectmode
	 */
	
	public byte getSelectmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 82);
		} else {
			return __io__block.readByte(__io__address + 46);
		}
	}

	/**
	 * Set method for struct member 'selectmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Selection Mode for {@link Mesh}  </p>
	 * @see #__DNA__FIELD__selectmode
	 */
	
	public void setSelectmode(byte selectmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 82, selectmode);
		} else {
			__io__block.writeByte(__io__address + 46, selectmode);
		}
	}

	/**
	 * Get method for struct member 'unwrapper'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> UV Calculation </p>
	 * @see #__DNA__FIELD__unwrapper
	 */
	
	public byte getUnwrapper() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 83);
		} else {
			return __io__block.readByte(__io__address + 47);
		}
	}

	/**
	 * Set method for struct member 'unwrapper'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> UV Calculation </p>
	 * @see #__DNA__FIELD__unwrapper
	 */
	
	public void setUnwrapper(byte unwrapper) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 83, unwrapper);
		} else {
			__io__block.writeByte(__io__address + 47, unwrapper);
		}
	}

	/**
	 * Get method for struct member 'uvcalc_flag'.
	 * @see #__DNA__FIELD__uvcalc_flag
	 */
	
	public byte getUvcalc_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 84);
		} else {
			return __io__block.readByte(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'uvcalc_flag'.
	 * @see #__DNA__FIELD__uvcalc_flag
	 */
	
	public void setUvcalc_flag(byte uvcalc_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 84, uvcalc_flag);
		} else {
			__io__block.writeByte(__io__address + 48, uvcalc_flag);
		}
	}

	/**
	 * Get method for struct member 'uv_flag'.
	 * @see #__DNA__FIELD__uv_flag
	 */
	
	public byte getUv_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 85);
		} else {
			return __io__block.readByte(__io__address + 49);
		}
	}

	/**
	 * Set method for struct member 'uv_flag'.
	 * @see #__DNA__FIELD__uv_flag
	 */
	
	public void setUv_flag(byte uv_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 85, uv_flag);
		} else {
			__io__block.writeByte(__io__address + 49, uv_flag);
		}
	}

	/**
	 * Get method for struct member 'uv_selectmode'.
	 * @see #__DNA__FIELD__uv_selectmode
	 */
	
	public byte getUv_selectmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 86);
		} else {
			return __io__block.readByte(__io__address + 50);
		}
	}

	/**
	 * Set method for struct member 'uv_selectmode'.
	 * @see #__DNA__FIELD__uv_selectmode
	 */
	
	public void setUv_selectmode(byte uv_selectmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 86, uv_selectmode);
		} else {
			__io__block.writeByte(__io__address + 50, uv_selectmode);
		}
	}

	/**
	 * Get method for struct member 'uv_sticky'.
	 * @see #__DNA__FIELD__uv_sticky
	 */
	
	public byte getUv_sticky() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 87);
		} else {
			return __io__block.readByte(__io__address + 51);
		}
	}

	/**
	 * Set method for struct member 'uv_sticky'.
	 * @see #__DNA__FIELD__uv_sticky
	 */
	
	public void setUv_sticky(byte uv_sticky) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 87, uv_sticky);
		} else {
			__io__block.writeByte(__io__address + 51, uv_sticky);
		}
	}

	/**
	 * Get method for struct member 'uvcalc_margin'.
	 * @see #__DNA__FIELD__uvcalc_margin
	 */
	
	public float getUvcalc_margin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'uvcalc_margin'.
	 * @see #__DNA__FIELD__uvcalc_margin
	 */
	
	public void setUvcalc_margin(float uvcalc_margin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, uvcalc_margin);
		} else {
			__io__block.writeFloat(__io__address + 52, uvcalc_margin);
		}
	}

	/**
	 * Get method for struct member 'autoik_chainlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Auto-IK Runtime only. </p>
	 * @see #__DNA__FIELD__autoik_chainlen
	 */
	
	public short getAutoik_chainlen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 92);
		} else {
			return __io__block.readShort(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'autoik_chainlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Auto-IK Runtime only. </p>
	 * @see #__DNA__FIELD__autoik_chainlen
	 */
	
	public void setAutoik_chainlen(short autoik_chainlen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 92, autoik_chainlen);
		} else {
			__io__block.writeShort(__io__address + 56, autoik_chainlen);
		}
	}

	/**
	 * Get method for struct member 'gpencil_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Grease Pencil Flags/options for how the tool works. </p>
	 * @see #__DNA__FIELD__gpencil_flags
	 */
	
	public byte getGpencil_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 94);
		} else {
			return __io__block.readByte(__io__address + 58);
		}
	}

	/**
	 * Set method for struct member 'gpencil_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Grease Pencil Flags/options for how the tool works. </p>
	 * @see #__DNA__FIELD__gpencil_flags
	 */
	
	public void setGpencil_flags(byte gpencil_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 94, gpencil_flags);
		} else {
			__io__block.writeByte(__io__address + 58, gpencil_flags);
		}
	}

	/**
	 * Get method for struct member 'gpencil_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stroke placement settings: 3D View. </p>
	 * @see #__DNA__FIELD__gpencil_v3d_align
	 */
	
	public byte getGpencil_v3d_align() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 95);
		} else {
			return __io__block.readByte(__io__address + 59);
		}
	}

	/**
	 * Set method for struct member 'gpencil_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stroke placement settings: 3D View. </p>
	 * @see #__DNA__FIELD__gpencil_v3d_align
	 */
	
	public void setGpencil_v3d_align(byte gpencil_v3d_align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 95, gpencil_v3d_align);
		} else {
			__io__block.writeByte(__io__address + 59, gpencil_v3d_align);
		}
	}

	/**
	 * Get method for struct member 'gpencil_v2d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> General 2D Editor. </p>
	 * @see #__DNA__FIELD__gpencil_v2d_align
	 */
	
	public byte getGpencil_v2d_align() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 96);
		} else {
			return __io__block.readByte(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'gpencil_v2d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> General 2D Editor. </p>
	 * @see #__DNA__FIELD__gpencil_v2d_align
	 */
	
	public void setGpencil_v2d_align(byte gpencil_v2d_align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 96, gpencil_v2d_align);
		} else {
			__io__block.writeByte(__io__address + 60, gpencil_v2d_align);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 97, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 61, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 97;
		} else {
			__dna__offset = 61;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Get method for struct member 'annotate_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Annotations Stroke placement settings - 3D View. </p>
	 * @see #__DNA__FIELD__annotate_v3d_align
	 */
	
	public byte getAnnotate_v3d_align() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 99);
		} else {
			return __io__block.readByte(__io__address + 63);
		}
	}

	/**
	 * Set method for struct member 'annotate_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Annotations Stroke placement settings - 3D View. </p>
	 * @see #__DNA__FIELD__annotate_v3d_align
	 */
	
	public void setAnnotate_v3d_align(byte annotate_v3d_align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 99, annotate_v3d_align);
		} else {
			__io__block.writeByte(__io__address + 63, annotate_v3d_align);
		}
	}

	/**
	 * Get method for struct member 'annotate_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Default stroke thickness for annotation strokes. </p>
	 * @see #__DNA__FIELD__annotate_thickness
	 */
	
	public short getAnnotate_thickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 100);
		} else {
			return __io__block.readShort(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'annotate_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Default stroke thickness for annotation strokes. </p>
	 * @see #__DNA__FIELD__annotate_thickness
	 */
	
	public void setAnnotate_thickness(short annotate_thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 100, annotate_thickness);
		} else {
			__io__block.writeShort(__io__address + 64, annotate_thickness);
		}
	}

	/**
	 * Get method for struct member 'gpencil_selectmode_edit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stroke selection mode for Edit. </p>
	 * @see #__DNA__FIELD__gpencil_selectmode_edit
	 */
	
	public byte getGpencil_selectmode_edit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 102);
		} else {
			return __io__block.readByte(__io__address + 66);
		}
	}

	/**
	 * Set method for struct member 'gpencil_selectmode_edit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stroke selection mode for Edit. </p>
	 * @see #__DNA__FIELD__gpencil_selectmode_edit
	 */
	
	public void setGpencil_selectmode_edit(byte gpencil_selectmode_edit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 102, gpencil_selectmode_edit);
		} else {
			__io__block.writeByte(__io__address + 66, gpencil_selectmode_edit);
		}
	}

	/**
	 * Get method for struct member 'gpencil_selectmode_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stroke selection mode for {@link Sculpt} . </p>
	 * @see #__DNA__FIELD__gpencil_selectmode_sculpt
	 */
	
	public byte getGpencil_selectmode_sculpt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 103);
		} else {
			return __io__block.readByte(__io__address + 67);
		}
	}

	/**
	 * Set method for struct member 'gpencil_selectmode_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stroke selection mode for {@link Sculpt} . </p>
	 * @see #__DNA__FIELD__gpencil_selectmode_sculpt
	 */
	
	public void setGpencil_selectmode_sculpt(byte gpencil_selectmode_sculpt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 103, gpencil_selectmode_sculpt);
		} else {
			__io__block.writeByte(__io__address + 67, gpencil_selectmode_sculpt);
		}
	}

	/**
	 * Get method for struct member 'gp_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Grease Pencil {@link Sculpt}  </p>
	 * @see #__DNA__FIELD__gp_sculpt
	 */
	
	public GP_Sculpt_Settings getGp_sculpt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GP_Sculpt_Settings(__io__address + 104, __io__block, __io__blockTable);
		} else {
			return new GP_Sculpt_Settings(__io__address + 68, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gp_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Grease Pencil {@link Sculpt}  </p>
	 * @see #__DNA__FIELD__gp_sculpt
	 */
	
	public void setGp_sculpt(GP_Sculpt_Settings gp_sculpt) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 68;
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
	 * <h4>Blender Source Code</h4>
	 * <p> Grease Pencil Interpolation Tool(s) </p>
	 * @see #__DNA__FIELD__gp_interpolate
	 */
	
	public GP_Interpolate_Settings getGp_interpolate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GP_Interpolate_Settings(__io__address + 184, __io__block, __io__blockTable);
		} else {
			return new GP_Interpolate_Settings(__io__address + 132, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gp_interpolate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Grease Pencil Interpolation Tool(s) </p>
	 * @see #__DNA__FIELD__gp_interpolate
	 */
	
	public void setGp_interpolate(GP_Interpolate_Settings gp_interpolate) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 132;
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
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Image}  {@link Paint}  (8 bytes aligned please!) </p>
	 * @see #__DNA__FIELD__imapaint
	 */
	
	public ImagePaintSettings getImapaint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImagePaintSettings(__io__address + 192, __io__block, __io__blockTable);
		} else {
			return new ImagePaintSettings(__io__address + 136, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'imapaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Image}  {@link Paint}  (8 bytes aligned please!) </p>
	 * @see #__DNA__FIELD__imapaint
	 */
	
	public void setImapaint(ImagePaintSettings imapaint) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 136;
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
	 * Get method for struct member 'paint_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for paint mode. </p>
	 * @see #__DNA__FIELD__paint_mode
	 */
	
	public PaintModeSettings getPaint_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new PaintModeSettings(__io__address + 344, __io__block, __io__blockTable);
		} else {
			return new PaintModeSettings(__io__address + 256, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'paint_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> Settings for paint mode. </p>
	 * @see #__DNA__FIELD__paint_mode
	 */
	
	public void setPaint_mode(PaintModeSettings paint_mode) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 344;
		} else {
			__dna__offset = 256;
		}
		if (__io__equals(paint_mode, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, paint_mode)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, paint_mode);
		} else {
			__io__generic__copy( getPaint_mode(), paint_mode);
		}
	}

	/**
	 * Get method for struct member 'particle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>Particle  {@link Editing}  </p>
	 * @see #__DNA__FIELD__particle
	 */
	
	public ParticleEditSettings getParticle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ParticleEditSettings(__io__address + 400, __io__block, __io__blockTable);
		} else {
			return new ParticleEditSettings(__io__address + 304, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'particle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>Particle  {@link Editing}  </p>
	 * @see #__DNA__FIELD__particle
	 */
	
	public void setParticle(ParticleEditSettings particle) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 400;
		} else {
			__dna__offset = 304;
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
	 * <h4>Blender Python API</h4>
	 * Display size for proportional editing circle
	 * <h4>Blender Source Code</h4>
	 * <p> Transform Proportional Area of {@link Effect}  </p>
	 * @see #__DNA__FIELD__proportional_size
	 */
	
	public float getProportional_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 576);
		} else {
			return __io__block.readFloat(__io__address + 464);
		}
	}

	/**
	 * Set method for struct member 'proportional_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Display size for proportional editing circle
	 * <h4>Blender Source Code</h4>
	 * <p> Transform Proportional Area of {@link Effect}  </p>
	 * @see #__DNA__FIELD__proportional_size
	 */
	
	public void setProportional_size(float proportional_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 576, proportional_size);
		} else {
			__io__block.writeFloat(__io__address + 464, proportional_size);
		}
	}

	/**
	 * Get method for struct member 'select_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Select Group Threshold </p>
	 * @see #__DNA__FIELD__select_thresh
	 */
	
	public float getSelect_thresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 580);
		} else {
			return __io__block.readFloat(__io__address + 468);
		}
	}

	/**
	 * Set method for struct member 'select_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Select Group Threshold </p>
	 * @see #__DNA__FIELD__select_thresh
	 */
	
	public void setSelect_thresh(float select_thresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 580, select_thresh);
		} else {
			__io__block.writeFloat(__io__address + 468, select_thresh);
		}
	}

	/**
	 * Get method for struct member 'autokey_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Auto-Keying Mode Defines in DNA_userdef_types.h . </p>
	 * @see #__DNA__FIELD__autokey_flag
	 */
	
	public short getAutokey_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 584);
		} else {
			return __io__block.readShort(__io__address + 472);
		}
	}

	/**
	 * Set method for struct member 'autokey_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Auto-Keying Mode Defines in DNA_userdef_types.h . </p>
	 * @see #__DNA__FIELD__autokey_flag
	 */
	
	public void setAutokey_flag(short autokey_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 584, autokey_flag);
		} else {
			__io__block.writeShort(__io__address + 472, autokey_flag);
		}
	}

	/**
	 * Get method for struct member 'autokey_mode'.
	 * @see #__DNA__FIELD__autokey_mode
	 */
	
	public byte getAutokey_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 586);
		} else {
			return __io__block.readByte(__io__address + 474);
		}
	}

	/**
	 * Set method for struct member 'autokey_mode'.
	 * @see #__DNA__FIELD__autokey_mode
	 */
	
	public void setAutokey_mode(byte autokey_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 586, autokey_mode);
		} else {
			__io__block.writeByte(__io__address + 474, autokey_mode);
		}
	}

	/**
	 * Get method for struct member 'keyframe_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Type of keyframes to create when inserting keyframes
	 * <h4>Blender Source Code</h4>
	 * <p> Keyframe type (see DNA_curve_types.h ). </p>
	 * @see #__DNA__FIELD__keyframe_type
	 */
	
	public byte getKeyframe_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 587);
		} else {
			return __io__block.readByte(__io__address + 475);
		}
	}

	/**
	 * Set method for struct member 'keyframe_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Type of keyframes to create when inserting keyframes
	 * <h4>Blender Source Code</h4>
	 * <p> Keyframe type (see DNA_curve_types.h ). </p>
	 * @see #__DNA__FIELD__keyframe_type
	 */
	
	public void setKeyframe_type(byte keyframe_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 587, keyframe_type);
		} else {
			__io__block.writeByte(__io__address + 475, keyframe_type);
		}
	}

	/**
	 * Get method for struct member 'multires_subdiv_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Multires </p>
	 * @see #__DNA__FIELD__multires_subdiv_type
	 */
	
	public byte getMultires_subdiv_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 588);
		} else {
			return __io__block.readByte(__io__address + 476);
		}
	}

	/**
	 * Set method for struct member 'multires_subdiv_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Multires </p>
	 * @see #__DNA__FIELD__multires_subdiv_type
	 */
	
	public void setMultires_subdiv_type(byte multires_subdiv_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 588, multires_subdiv_type);
		} else {
			__io__block.writeByte(__io__address + 476, multires_subdiv_type);
		}
	}

	/**
	 * Get method for struct member 'edge_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Edge tagging, store operator settings (no UI access). </p>
	 * @see #__DNA__FIELD__edge_mode
	 */
	
	public byte getEdge_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 589);
		} else {
			return __io__block.readByte(__io__address + 477);
		}
	}

	/**
	 * Set method for struct member 'edge_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Edge tagging, store operator settings (no UI access). </p>
	 * @see #__DNA__FIELD__edge_mode
	 */
	
	public void setEdge_mode(byte edge_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 589, edge_mode);
		} else {
			__io__block.writeByte(__io__address + 477, edge_mode);
		}
	}

	/**
	 * Get method for struct member 'edge_mode_live_unwrap'.
	 * @see #__DNA__FIELD__edge_mode_live_unwrap
	 */
	
	public byte getEdge_mode_live_unwrap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 590);
		} else {
			return __io__block.readByte(__io__address + 478);
		}
	}

	/**
	 * Set method for struct member 'edge_mode_live_unwrap'.
	 * @see #__DNA__FIELD__edge_mode_live_unwrap
	 */
	
	public void setEdge_mode_live_unwrap(byte edge_mode_live_unwrap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 590, edge_mode_live_unwrap);
		} else {
			__io__block.writeByte(__io__address + 478, edge_mode_live_unwrap);
		}
	}

	/**
	 * Get method for struct member 'transform_pivot_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Pivot center for rotation/scaling
	 * <h4>Blender Source Code</h4>
	 * <p> Transform </p>
	 * @see #__DNA__FIELD__transform_pivot_point
	 */
	
	public byte getTransform_pivot_point() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 591);
		} else {
			return __io__block.readByte(__io__address + 479);
		}
	}

	/**
	 * Set method for struct member 'transform_pivot_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Pivot center for rotation/scaling
	 * <h4>Blender Source Code</h4>
	 * <p> Transform </p>
	 * @see #__DNA__FIELD__transform_pivot_point
	 */
	
	public void setTransform_pivot_point(byte transform_pivot_point) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 591, transform_pivot_point);
		} else {
			__io__block.writeByte(__io__address + 479, transform_pivot_point);
		}
	}

	/**
	 * Get method for struct member 'transform_flag'.
	 * @see #__DNA__FIELD__transform_flag
	 */
	
	public byte getTransform_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 592);
		} else {
			return __io__block.readByte(__io__address + 480);
		}
	}

	/**
	 * Set method for struct member 'transform_flag'.
	 * @see #__DNA__FIELD__transform_flag
	 */
	
	public void setTransform_flag(byte transform_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 592, transform_flag);
		} else {
			__io__block.writeByte(__io__address + 480, transform_flag);
		}
	}

	/**
	 * Get method for struct member 'snap_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Snap elements (per spacetype). </p>
	 * @see #__DNA__FIELD__snap_mode
	 */
	
	public byte getSnap_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 593);
		} else {
			return __io__block.readByte(__io__address + 481);
		}
	}

	/**
	 * Set method for struct member 'snap_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Snap elements (per spacetype). </p>
	 * @see #__DNA__FIELD__snap_mode
	 */
	
	public void setSnap_mode(byte snap_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 593, snap_mode);
		} else {
			__io__block.writeByte(__io__address + 481, snap_mode);
		}
	}

	/**
	 * Get method for struct member 'snap_node_mode'.
	 * @see #__DNA__FIELD__snap_node_mode
	 */
	
	public byte getSnap_node_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 594);
		} else {
			return __io__block.readByte(__io__address + 482);
		}
	}

	/**
	 * Set method for struct member 'snap_node_mode'.
	 * @see #__DNA__FIELD__snap_node_mode
	 */
	
	public void setSnap_node_mode(byte snap_node_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 594, snap_node_mode);
		} else {
			__io__block.writeByte(__io__address + 482, snap_node_mode);
		}
	}

	/**
	 * Get method for struct member 'snap_uv_mode'.
	 * @see #__DNA__FIELD__snap_uv_mode
	 */
	
	public byte getSnap_uv_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 595);
		} else {
			return __io__block.readByte(__io__address + 483);
		}
	}

	/**
	 * Set method for struct member 'snap_uv_mode'.
	 * @see #__DNA__FIELD__snap_uv_mode
	 */
	
	public void setSnap_uv_mode(byte snap_uv_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 595, snap_uv_mode);
		} else {
			__io__block.writeByte(__io__address + 483, snap_uv_mode);
		}
	}

	/**
	 * Get method for struct member 'snap_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Generic flags (per spacetype). </p>
	 * @see #__DNA__FIELD__snap_flag
	 */
	
	public byte getSnap_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 596);
		} else {
			return __io__block.readByte(__io__address + 484);
		}
	}

	/**
	 * Set method for struct member 'snap_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Generic flags (per spacetype). </p>
	 * @see #__DNA__FIELD__snap_flag
	 */
	
	public void setSnap_flag(byte snap_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 596, snap_flag);
		} else {
			__io__block.writeByte(__io__address + 484, snap_flag);
		}
	}

	/**
	 * Get method for struct member 'snap_flag_node'.
	 * @see #__DNA__FIELD__snap_flag_node
	 */
	
	public byte getSnap_flag_node() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 597);
		} else {
			return __io__block.readByte(__io__address + 485);
		}
	}

	/**
	 * Set method for struct member 'snap_flag_node'.
	 * @see #__DNA__FIELD__snap_flag_node
	 */
	
	public void setSnap_flag_node(byte snap_flag_node) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 597, snap_flag_node);
		} else {
			__io__block.writeByte(__io__address + 485, snap_flag_node);
		}
	}

	/**
	 * Get method for struct member 'snap_flag_seq'.
	 * @see #__DNA__FIELD__snap_flag_seq
	 */
	
	public byte getSnap_flag_seq() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 598);
		} else {
			return __io__block.readByte(__io__address + 486);
		}
	}

	/**
	 * Set method for struct member 'snap_flag_seq'.
	 * @see #__DNA__FIELD__snap_flag_seq
	 */
	
	public void setSnap_flag_seq(byte snap_flag_seq) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 598, snap_flag_seq);
		} else {
			__io__block.writeByte(__io__address + 486, snap_flag_seq);
		}
	}

	/**
	 * Get method for struct member 'snap_uv_flag'.
	 * @see #__DNA__FIELD__snap_uv_flag
	 */
	
	public byte getSnap_uv_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 599);
		} else {
			return __io__block.readByte(__io__address + 487);
		}
	}

	/**
	 * Set method for struct member 'snap_uv_flag'.
	 * @see #__DNA__FIELD__snap_uv_flag
	 */
	
	public void setSnap_uv_flag(byte snap_uv_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 599, snap_uv_flag);
		} else {
			__io__block.writeByte(__io__address + 487, snap_uv_flag);
		}
	}

	/**
	 * Get method for struct member 'snap_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Which part to snap onto the target
	 * <h4>Blender Source Code</h4>
	 * <p> Default snap source. </p>
	 * @see #__DNA__FIELD__snap_target
	 */
	
	public byte getSnap_target() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 600);
		} else {
			return __io__block.readByte(__io__address + 488);
		}
	}

	/**
	 * Set method for struct member 'snap_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Which part to snap onto the target
	 * <h4>Blender Source Code</h4>
	 * <p> Default snap source. </p>
	 * @see #__DNA__FIELD__snap_target
	 */
	
	public void setSnap_target(byte snap_target) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 600, snap_target);
		} else {
			__io__block.writeByte(__io__address + 488, snap_target);
		}
	}

	/**
	 * Get method for struct member 'snap_transform_mode_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Snap mask for transform modes. </p>
	 * @see #__DNA__FIELD__snap_transform_mode_flag
	 */
	
	public byte getSnap_transform_mode_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 601);
		} else {
			return __io__block.readByte(__io__address + 489);
		}
	}

	/**
	 * Set method for struct member 'snap_transform_mode_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Snap mask for transform modes. </p>
	 * @see #__DNA__FIELD__snap_transform_mode_flag
	 */
	
	public void setSnap_transform_mode_flag(byte snap_transform_mode_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 601, snap_transform_mode_flag);
		} else {
			__io__block.writeByte(__io__address + 489, snap_transform_mode_flag);
		}
	}

	/**
	 * Get method for struct member 'proportional_edit'.
	 * @see #__DNA__FIELD__proportional_edit
	 */
	
	public byte getProportional_edit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 602);
		} else {
			return __io__block.readByte(__io__address + 490);
		}
	}

	/**
	 * Set method for struct member 'proportional_edit'.
	 * @see #__DNA__FIELD__proportional_edit
	 */
	
	public void setProportional_edit(byte proportional_edit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 602, proportional_edit);
		} else {
			__io__block.writeByte(__io__address + 490, proportional_edit);
		}
	}

	/**
	 * Get method for struct member 'prop_mode'.
	 * @see #__DNA__FIELD__prop_mode
	 */
	
	public byte getProp_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 603);
		} else {
			return __io__block.readByte(__io__address + 491);
		}
	}

	/**
	 * Set method for struct member 'prop_mode'.
	 * @see #__DNA__FIELD__prop_mode
	 */
	
	public void setProp_mode(byte prop_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 603, prop_mode);
		} else {
			__io__block.writeByte(__io__address + 491, prop_mode);
		}
	}

	/**
	 * Get method for struct member 'proportional_objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Proportional edit, object mode. </p>
	 * @see #__DNA__FIELD__proportional_objects
	 */
	
	public byte getProportional_objects() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 604);
		} else {
			return __io__block.readByte(__io__address + 492);
		}
	}

	/**
	 * Set method for struct member 'proportional_objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Proportional edit, object mode. </p>
	 * @see #__DNA__FIELD__proportional_objects
	 */
	
	public void setProportional_objects(byte proportional_objects) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 604, proportional_objects);
		} else {
			__io__block.writeByte(__io__address + 492, proportional_objects);
		}
	}

	/**
	 * Get method for struct member 'proportional_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Proportional edit, mask editing. </p>
	 * @see #__DNA__FIELD__proportional_mask
	 */
	
	public byte getProportional_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 605);
		} else {
			return __io__block.readByte(__io__address + 493);
		}
	}

	/**
	 * Set method for struct member 'proportional_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Proportional edit, mask editing. </p>
	 * @see #__DNA__FIELD__proportional_mask
	 */
	
	public void setProportional_mask(byte proportional_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 605, proportional_mask);
		} else {
			__io__block.writeByte(__io__address + 493, proportional_mask);
		}
	}

	/**
	 * Get method for struct member 'proportional_action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Proportional edit, action editor. </p>
	 * @see #__DNA__FIELD__proportional_action
	 */
	
	public byte getProportional_action() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 606);
		} else {
			return __io__block.readByte(__io__address + 494);
		}
	}

	/**
	 * Set method for struct member 'proportional_action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Proportional edit, action editor. </p>
	 * @see #__DNA__FIELD__proportional_action
	 */
	
	public void setProportional_action(byte proportional_action) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 606, proportional_action);
		} else {
			__io__block.writeByte(__io__address + 494, proportional_action);
		}
	}

	/**
	 * Get method for struct member 'proportional_fcurve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Proportional edit, graph editor. </p>
	 * @see #__DNA__FIELD__proportional_fcurve
	 */
	
	public byte getProportional_fcurve() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 607);
		} else {
			return __io__block.readByte(__io__address + 495);
		}
	}

	/**
	 * Set method for struct member 'proportional_fcurve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Proportional edit, graph editor. </p>
	 * @see #__DNA__FIELD__proportional_fcurve
	 */
	
	public void setProportional_fcurve(byte proportional_fcurve) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 607, proportional_fcurve);
		} else {
			__io__block.writeByte(__io__address + 495, proportional_fcurve);
		}
	}

	/**
	 * Get method for struct member 'lock_markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Prevent marker editing
	 * <h4>Blender Source Code</h4>
	 * <p> Lock marker editing. </p>
	 * @see #__DNA__FIELD__lock_markers
	 */
	
	public byte getLock_markers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 608);
		} else {
			return __io__block.readByte(__io__address + 496);
		}
	}

	/**
	 * Set method for struct member 'lock_markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Prevent marker editing
	 * <h4>Blender Source Code</h4>
	 * <p> Lock marker editing. </p>
	 * @see #__DNA__FIELD__lock_markers
	 */
	
	public void setLock_markers(byte lock_markers) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 608, lock_markers);
		} else {
			__io__block.writeByte(__io__address + 496, lock_markers);
		}
	}

	/**
	 * Get method for struct member 'auto_normalize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Auto normalizing mode in wpaint. </p>
	 * @see #__DNA__FIELD__auto_normalize
	 */
	
	public byte getAuto_normalize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 609);
		} else {
			return __io__block.readByte(__io__address + 497);
		}
	}

	/**
	 * Set method for struct member 'auto_normalize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Auto normalizing mode in wpaint. </p>
	 * @see #__DNA__FIELD__auto_normalize
	 */
	
	public void setAuto_normalize(byte auto_normalize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 609, auto_normalize);
		} else {
			__io__block.writeByte(__io__address + 497, auto_normalize);
		}
	}

	/**
	 * Get method for struct member 'wpaint_lock_relative'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Present weights as if all locked vertex groups were deleted, and the remaining deform groups normalized. </p>
	 * @see #__DNA__FIELD__wpaint_lock_relative
	 */
	
	public byte getWpaint_lock_relative() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 610);
		} else {
			return __io__block.readByte(__io__address + 498);
		}
	}

	/**
	 * Set method for struct member 'wpaint_lock_relative'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Present weights as if all locked vertex groups were deleted, and the remaining deform groups normalized. </p>
	 * @see #__DNA__FIELD__wpaint_lock_relative
	 */
	
	public void setWpaint_lock_relative(byte wpaint_lock_relative) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 610, wpaint_lock_relative);
		} else {
			__io__block.writeByte(__io__address + 498, wpaint_lock_relative);
		}
	}

	/**
	 * Get method for struct member 'multipaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Paint}  multiple bones in wpaint. </p>
	 * @see #__DNA__FIELD__multipaint
	 */
	
	public byte getMultipaint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 611);
		} else {
			return __io__block.readByte(__io__address + 499);
		}
	}

	/**
	 * Set method for struct member 'multipaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Paint}  multiple bones in wpaint. </p>
	 * @see #__DNA__FIELD__multipaint
	 */
	
	public void setMultipaint(byte multipaint) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 611, multipaint);
		} else {
			__io__block.writeByte(__io__address + 499, multipaint);
		}
	}

	/**
	 * Get method for struct member 'weightuser'.
	 * @see #__DNA__FIELD__weightuser
	 */
	
	public byte getWeightuser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 612);
		} else {
			return __io__block.readByte(__io__address + 500);
		}
	}

	/**
	 * Set method for struct member 'weightuser'.
	 * @see #__DNA__FIELD__weightuser
	 */
	
	public void setWeightuser(byte weightuser) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 612, weightuser);
		} else {
			__io__block.writeByte(__io__address + 500, weightuser);
		}
	}

	/**
	 * Get method for struct member 'vgroupsubset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Subset selection filter in wpaint. </p>
	 * @see #__DNA__FIELD__vgroupsubset
	 */
	
	public byte getVgroupsubset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 613);
		} else {
			return __io__block.readByte(__io__address + 501);
		}
	}

	/**
	 * Set method for struct member 'vgroupsubset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Subset selection filter in wpaint. </p>
	 * @see #__DNA__FIELD__vgroupsubset
	 */
	
	public void setVgroupsubset(byte vgroupsubset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 613, vgroupsubset);
		} else {
			__io__block.writeByte(__io__address + 501, vgroupsubset);
		}
	}

	/**
	 * Get method for struct member 'gpencil_selectmode_vertex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stroke selection mode for Vertex {@link Paint} . </p>
	 * @see #__DNA__FIELD__gpencil_selectmode_vertex
	 */
	
	public byte getGpencil_selectmode_vertex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 614);
		} else {
			return __io__block.readByte(__io__address + 502);
		}
	}

	/**
	 * Set method for struct member 'gpencil_selectmode_vertex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Stroke selection mode for Vertex {@link Paint} . </p>
	 * @see #__DNA__FIELD__gpencil_selectmode_vertex
	 */
	
	public void setGpencil_selectmode_vertex(byte gpencil_selectmode_vertex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 614, gpencil_selectmode_vertex);
		} else {
			__io__block.writeByte(__io__address + 502, gpencil_selectmode_vertex);
		}
	}

	/**
	 * Get method for struct member 'uv_sculpt_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> UV painting </p>
	 * @see #__DNA__FIELD__uv_sculpt_settings
	 */
	
	public byte getUv_sculpt_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 615);
		} else {
			return __io__block.readByte(__io__address + 503);
		}
	}

	/**
	 * Set method for struct member 'uv_sculpt_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> UV painting </p>
	 * @see #__DNA__FIELD__uv_sculpt_settings
	 */
	
	public void setUv_sculpt_settings(byte uv_sculpt_settings) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 615, uv_sculpt_settings);
		} else {
			__io__block.writeByte(__io__address + 503, uv_sculpt_settings);
		}
	}

	/**
	 * Get method for struct member 'uv_relax_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Algorithm used for UV relaxation
	 * @see #__DNA__FIELD__uv_relax_method
	 */
	
	public byte getUv_relax_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 616);
		} else {
			return __io__block.readByte(__io__address + 504);
		}
	}

	/**
	 * Set method for struct member 'uv_relax_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Algorithm used for UV relaxation
	 * @see #__DNA__FIELD__uv_relax_method
	 */
	
	public void setUv_relax_method(byte uv_relax_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 616, uv_relax_method);
		} else {
			__io__block.writeByte(__io__address + 504, uv_relax_method);
		}
	}

	/**
	 * Get method for struct member 'workspace_tool_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Action when dragging in the viewport
	 * @see #__DNA__FIELD__workspace_tool_type
	 */
	
	public byte getWorkspace_tool_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 617);
		} else {
			return __io__block.readByte(__io__address + 505);
		}
	}

	/**
	 * Set method for struct member 'workspace_tool_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Action when dragging in the viewport
	 * @see #__DNA__FIELD__workspace_tool_type
	 */
	
	public void setWorkspace_tool_type(byte workspace_tool_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 617, workspace_tool_type);
		} else {
			__io__block.writeByte(__io__address + 505, workspace_tool_type);
		}
	}

	/**
	 * Get method for struct member 'sculpt_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX: these sculpt_paint_* fields are deprecated, use the unified_paint_settings field instead! 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_settings
	 */
	
	public short getSculpt_paint_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 618);
		} else {
			return __io__block.readShort(__io__address + 506);
		}
	}

	/**
	 * Set method for struct member 'sculpt_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX: these sculpt_paint_* fields are deprecated, use the unified_paint_settings field instead! 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_settings
	 */
	
	public void setSculpt_paint_settings(short sculpt_paint_settings) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 618, sculpt_paint_settings);
		} else {
			__io__block.writeShort(__io__address + 506, sculpt_paint_settings);
		}
	}

	/**
	 * Get method for struct member 'sculpt_paint_unified_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_unified_size
	 */
	
	public int getSculpt_paint_unified_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 620);
		} else {
			return __io__block.readInt(__io__address + 508);
		}
	}

	/**
	 * Set method for struct member 'sculpt_paint_unified_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_unified_size
	 */
	
	public void setSculpt_paint_unified_size(int sculpt_paint_unified_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 620, sculpt_paint_unified_size);
		} else {
			__io__block.writeInt(__io__address + 508, sculpt_paint_unified_size);
		}
	}

	/**
	 * Get method for struct member 'sculpt_paint_unified_unprojected_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_unified_unprojected_radius
	 */
	
	public float getSculpt_paint_unified_unprojected_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 624);
		} else {
			return __io__block.readFloat(__io__address + 512);
		}
	}

	/**
	 * Set method for struct member 'sculpt_paint_unified_unprojected_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_unified_unprojected_radius
	 */
	
	public void setSculpt_paint_unified_unprojected_radius(float sculpt_paint_unified_unprojected_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 624, sculpt_paint_unified_unprojected_radius);
		} else {
			__io__block.writeFloat(__io__address + 512, sculpt_paint_unified_unprojected_radius);
		}
	}

	/**
	 * Get method for struct member 'sculpt_paint_unified_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_unified_alpha
	 */
	
	public float getSculpt_paint_unified_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 628);
		} else {
			return __io__block.readFloat(__io__address + 516);
		}
	}

	/**
	 * Set method for struct member 'sculpt_paint_unified_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__sculpt_paint_unified_alpha
	 */
	
	public void setSculpt_paint_unified_alpha(float sculpt_paint_unified_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 628, sculpt_paint_unified_alpha);
		} else {
			__io__block.writeFloat(__io__address + 516, sculpt_paint_unified_alpha);
		}
	}

	/**
	 * Get method for struct member 'unified_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> Unified {@link Paint}  Settings </p>
	 * @see #__DNA__FIELD__unified_paint_settings
	 */
	
	public UnifiedPaintSettings getUnified_paint_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new UnifiedPaintSettings(__io__address + 632, __io__block, __io__blockTable);
		} else {
			return new UnifiedPaintSettings(__io__address + 520, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'unified_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> Unified {@link Paint}  Settings </p>
	 * @see #__DNA__FIELD__unified_paint_settings
	 */
	
	public void setUnified_paint_settings(UnifiedPaintSettings unified_paint_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 632;
		} else {
			__dna__offset = 520;
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
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__curve_paint_settings
	 */
	
	public CurvePaintSettings getCurve_paint_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CurvePaintSettings(__io__address + 792, __io__block, __io__blockTable);
		} else {
			return new CurvePaintSettings(__io__address + 676, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'curve_paint_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__curve_paint_settings
	 */
	
	public void setCurve_paint_settings(CurvePaintSettings curve_paint_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 792;
		} else {
			__dna__offset = 676;
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
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__statvis
	 */
	
	public MeshStatVis getStatvis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MeshStatVis(__io__address + 824, __io__block, __io__blockTable);
		} else {
			return new MeshStatVis(__io__address + 708, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'statvis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__statvis
	 */
	
	public void setStatvis(MeshStatVis statvis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 824;
		} else {
			__dna__offset = 708;
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
	 * <h4>Blender Python API</h4>
	 * Normal Vector used to copy, add or multiply
	 * <h4>Blender Source Code</h4>
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
			return new CArrayFacade<Float>(__io__address + 864, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 748, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'normal_vector'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Normal Vector used to copy, add or multiply
	 * <h4>Blender Source Code</h4>
	 * <p> Normal {@link Editing}  </p>
	 * @see #__DNA__FIELD__normal_vector
	 */
	
	public void setNormal_vector(CArrayFacade<Float> normal_vector) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 864;
		} else {
			__dna__offset = 748;
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
			return new CArrayFacade<Byte>(__io__address + 876, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 760, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 876;
		} else {
			__dna__offset = 760;
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
	 * <h4>Blender Python API</h4>
	 * (read-only)    Used for defining a profile's path
	 * <h4>Blender Source Code</h4>
	 * <p> Custom {@link Curve}  Profile for bevel tool: Temporary until there is a proper preset system that stores the profiles or maybe stores entire bevel configurations. </p>
	 * @see #__DNA__FIELD__custom_bevel_profile_preset
	 */
	
	public CPointer<CurveProfile> getCustom_bevel_profile_preset() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 880);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 764);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveProfile.class};
		return new CPointer<CurveProfile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveProfile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'custom_bevel_profile_preset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Used for defining a profile's path
	 * <h4>Blender Source Code</h4>
	 * <p> Custom {@link Curve}  Profile for bevel tool: Temporary until there is a proper preset system that stores the profiles or maybe stores entire bevel configurations. </p>
	 * @see #__DNA__FIELD__custom_bevel_profile_preset
	 */
	
	public void setCustom_bevel_profile_preset(CPointer<CurveProfile> custom_bevel_profile_preset) throws IOException
	{
		long __address = ((custom_bevel_profile_preset == null) ? 0 : custom_bevel_profile_preset.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 880, __address);
		} else {
			__io__block.writeLong(__io__address + 764, __address);
		}
	}

	/**
	 * Get method for struct member 'sequencer_tool_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__sequencer_tool_settings
	 */
	
	public CPointer<SequencerToolSettings> getSequencer_tool_settings() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 888);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 768);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SequencerToolSettings.class};
		return new CPointer<SequencerToolSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SequencerToolSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sequencer_tool_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__sequencer_tool_settings
	 */
	
	public void setSequencer_tool_settings(CPointer<SequencerToolSettings> sequencer_tool_settings) throws IOException
	{
		long __address = ((sequencer_tool_settings == null) ? 0 : sequencer_tool_settings.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 888, __address);
		} else {
			__io__block.writeLong(__io__address + 768, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ToolSettings> __io__addressof() {
		return new CPointer<ToolSettings>(__io__address, new Class[]{ToolSettings.class}, __io__block, __io__blockTable);
	}

}
