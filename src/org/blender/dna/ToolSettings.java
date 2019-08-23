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

@CMetaData(size32=808, size64=896)
public class ToolSettings extends CFacade {

	/**
	 * This is the sdna index of the struct ToolSettings.
	 * <p>
	 * It is required when allocating a new block to store data for ToolSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 199;

	/**
	 * Field descriptor (offset) for struct member 'vpaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vertex paint </p>
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
	 * <p> weight paint </p>
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
	 * <p> uv smooth </p>
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
	public static final long[] __DNA__FIELD__vgroup_weight = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'doublimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> remove doubles limit </p>
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
	public static final long[] __DNA__FIELD__doublimit = new long[]{20, 36};

	/**
	 * Field descriptor (offset) for struct member 'normalsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of normals </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__normalsize);
	 * CPointer&lt;Float&gt; p_normalsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normalsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normalsize = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'automerge'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__automerge);
	 * CPointer&lt;Short&gt; p_automerge = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'automerge'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__automerge = new long[]{28, 44};

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
	public static final long[] __DNA__FIELD__selectmode = new long[]{30, 46};

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
	public static final long[] __DNA__FIELD__unwrapper = new long[]{32, 48};

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
	public static final long[] __DNA__FIELD__uvcalc_flag = new long[]{33, 49};

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
	public static final long[] __DNA__FIELD__uv_flag = new long[]{34, 50};

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
	public static final long[] __DNA__FIELD__uv_selectmode = new long[]{35, 51};

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
	public static final long[] __DNA__FIELD__uvcalc_margin = new long[]{36, 52};

	/**
	 * Field descriptor (offset) for struct member 'autoik_chainlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto-IK runtime only </p>
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
	public static final long[] __DNA__FIELD__autoik_chainlen = new long[]{40, 56};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil flags/options for how the tool works </p>
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
	public static final long[] __DNA__FIELD__gpencil_flags = new long[]{42, 58};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for main 3D view Grease Pencil, where data comes from </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gpencil_src);
	 * CPointer&lt;Byte&gt; p_gpencil_src = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_src'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_src = new long[]{43, 59};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> stroke placement settings: 3D View </p>
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
	public static final long[] __DNA__FIELD__gpencil_v3d_align = new long[]{44, 60};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_v2d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> : General 2D Editor </p>
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
	public static final long[] __DNA__FIELD__gpencil_v2d_align = new long[]{45, 61};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_seq_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> : Sequencer Preview </p>
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
	public static final long[] __DNA__FIELD__gpencil_seq_align = new long[]{46, 62};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_ima_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> : {@link Image}  Editor </p>
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
	public static final long[] __DNA__FIELD__gpencil_ima_align = new long[]{47, 63};

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
	 * CPointer&lt;GP_BrushEdit_Settings&gt; p_gp_sculpt = p.cast(new Class[]{GP_BrushEdit_Settings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_sculpt'</li>
	 * <li>Signature: 'GP_BrushEdit_Settings'</li>
	 * <li>Actual Size (32bit/64bit): 108/112</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_sculpt = new long[]{48, 64};

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
	public static final long[] __DNA__FIELD__gp_interpolate = new long[]{156, 176};

	/**
	 * Field descriptor (offset) for struct member 'gp_brushes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil Drawing Brushes ({@link bGPDbrush} ) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__gp_brushes);
	 * CPointer&lt;ListBase&gt; p_gp_brushes = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_brushes'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_brushes = new long[]{176, 200};

	/**
	 * Field descriptor (offset) for struct member 'imapaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Image}  {@link Paint}  (8 byttse aligned please!) </p>
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
	 * <li>Actual Size (32bit/64bit): 96/128</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__imapaint = new long[]{184, 216};

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
	public static final long[] __DNA__FIELD__particle = new long[]{280, 344};

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
	public static final long[] __DNA__FIELD__proportional_size = new long[]{440, 520};

	/**
	 * Field descriptor (offset) for struct member 'select_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Select {@link Group}  Threshold </p>
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
	public static final long[] __DNA__FIELD__select_thresh = new long[]{444, 524};

	/**
	 * Field descriptor (offset) for struct member 'autokey_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto-Keying Mode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__autokey_mode);
	 * CPointer&lt;Short&gt; p_autokey_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'autokey_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__autokey_mode = new long[]{448, 528};

	/**
	 * Field descriptor (offset) for struct member 'autokey_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> defines in {@link DNA_userdef_types.h}  </p>
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
	public static final long[] __DNA__FIELD__autokey_flag = new long[]{450, 530};

	/**
	 * Field descriptor (offset) for struct member 'keyframe_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of keyframes to create when inserting keyframes<h4>Blender Source Code:</h4>
	 * <p> keyframe type (see {@link DNA_curve_types.h} ) </p>
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
	public static final long[] __DNA__FIELD__keyframe_type = new long[]{452, 532};

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
	public static final long[] __DNA__FIELD__multires_subdiv_type = new long[]{453, 533};

	/**
	 * Field descriptor (offset) for struct member 'skgen_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Skeleton generation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_resolution);
	 * CPointer&lt;Short&gt; p_skgen_resolution = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_resolution'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_resolution = new long[]{454, 534};

	/**
	 * Field descriptor (offset) for struct member 'skgen_threshold_internal'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_threshold_internal);
	 * CPointer&lt;Float&gt; p_skgen_threshold_internal = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_threshold_internal'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_threshold_internal = new long[]{456, 536};

	/**
	 * Field descriptor (offset) for struct member 'skgen_threshold_external'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_threshold_external);
	 * CPointer&lt;Float&gt; p_skgen_threshold_external = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_threshold_external'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_threshold_external = new long[]{460, 540};

	/**
	 * Field descriptor (offset) for struct member 'skgen_length_ratio'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_length_ratio);
	 * CPointer&lt;Float&gt; p_skgen_length_ratio = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_length_ratio'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_length_ratio = new long[]{464, 544};

	/**
	 * Field descriptor (offset) for struct member 'skgen_length_limit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_length_limit);
	 * CPointer&lt;Float&gt; p_skgen_length_limit = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_length_limit'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_length_limit = new long[]{468, 548};

	/**
	 * Field descriptor (offset) for struct member 'skgen_angle_limit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_angle_limit);
	 * CPointer&lt;Float&gt; p_skgen_angle_limit = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_angle_limit'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_angle_limit = new long[]{472, 552};

	/**
	 * Field descriptor (offset) for struct member 'skgen_correlation_limit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_correlation_limit);
	 * CPointer&lt;Float&gt; p_skgen_correlation_limit = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_correlation_limit'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_correlation_limit = new long[]{476, 556};

	/**
	 * Field descriptor (offset) for struct member 'skgen_symmetry_limit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_symmetry_limit);
	 * CPointer&lt;Float&gt; p_skgen_symmetry_limit = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_symmetry_limit'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_symmetry_limit = new long[]{480, 560};

	/**
	 * Field descriptor (offset) for struct member 'skgen_retarget_angle_weight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_retarget_angle_weight);
	 * CPointer&lt;Float&gt; p_skgen_retarget_angle_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_retarget_angle_weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_retarget_angle_weight = new long[]{484, 564};

	/**
	 * Field descriptor (offset) for struct member 'skgen_retarget_length_weight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_retarget_length_weight);
	 * CPointer&lt;Float&gt; p_skgen_retarget_length_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_retarget_length_weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_retarget_length_weight = new long[]{488, 568};

	/**
	 * Field descriptor (offset) for struct member 'skgen_retarget_distance_weight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_retarget_distance_weight);
	 * CPointer&lt;Float&gt; p_skgen_retarget_distance_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_retarget_distance_weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_retarget_distance_weight = new long[]{492, 572};

	/**
	 * Field descriptor (offset) for struct member 'skgen_options'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_options);
	 * CPointer&lt;Short&gt; p_skgen_options = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_options'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_options = new long[]{496, 576};

	/**
	 * Field descriptor (offset) for struct member 'skgen_postpro'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_postpro);
	 * CPointer&lt;Byte&gt; p_skgen_postpro = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_postpro'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_postpro = new long[]{498, 578};

	/**
	 * Field descriptor (offset) for struct member 'skgen_postpro_passes'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_postpro_passes);
	 * CPointer&lt;Byte&gt; p_skgen_postpro_passes = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_postpro_passes'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_postpro_passes = new long[]{499, 579};

	/**
	 * Field descriptor (offset) for struct member 'skgen_subdivisions'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_subdivisions);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_skgen_subdivisions = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_subdivisions'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_subdivisions = new long[]{500, 580};

	/**
	 * Field descriptor (offset) for struct member 'skgen_multi_level'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_multi_level);
	 * CPointer&lt;Byte&gt; p_skgen_multi_level = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_multi_level'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_multi_level = new long[]{503, 583};

	/**
	 * Field descriptor (offset) for struct member 'skgen_template'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Skeleton Sketching </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_template);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_skgen_template = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_template'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_template = new long[]{504, 584};

	/**
	 * Field descriptor (offset) for struct member 'bone_sketching'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__bone_sketching);
	 * CPointer&lt;Byte&gt; p_bone_sketching = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bone_sketching'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bone_sketching = new long[]{508, 592};

	/**
	 * Field descriptor (offset) for struct member 'bone_sketching_convert'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__bone_sketching_convert);
	 * CPointer&lt;Byte&gt; p_bone_sketching_convert = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bone_sketching_convert'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bone_sketching_convert = new long[]{509, 593};

	/**
	 * Field descriptor (offset) for struct member 'skgen_subdivision_number'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_subdivision_number);
	 * CPointer&lt;Byte&gt; p_skgen_subdivision_number = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_subdivision_number'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_subdivision_number = new long[]{510, 594};

	/**
	 * Field descriptor (offset) for struct member 'skgen_retarget_options'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_retarget_options);
	 * CPointer&lt;Byte&gt; p_skgen_retarget_options = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_retarget_options'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_retarget_options = new long[]{511, 595};

	/**
	 * Field descriptor (offset) for struct member 'skgen_retarget_roll'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_retarget_roll);
	 * CPointer&lt;Byte&gt; p_skgen_retarget_roll = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_retarget_roll'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_retarget_roll = new long[]{512, 596};

	/**
	 * Field descriptor (offset) for struct member 'skgen_side_string'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_side_string);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_skgen_side_string = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_side_string'</li>
	 * <li>Signature: 'char[8]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_side_string = new long[]{513, 597};

	/**
	 * Field descriptor (offset) for struct member 'skgen_num_string'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__skgen_num_string);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_skgen_num_string = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skgen_num_string'</li>
	 * <li>Signature: 'char[8]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skgen_num_string = new long[]{521, 605};

	/**
	 * Field descriptor (offset) for struct member 'edge_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Alt+RMB option </p>
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
	public static final long[] __DNA__FIELD__edge_mode = new long[]{529, 613};

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
	public static final long[] __DNA__FIELD__edge_mode_live_unwrap = new long[]{530, 614};

	/**
	 * Field descriptor (offset) for struct member 'snap_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Transform </p>
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
	public static final long[] __DNA__FIELD__snap_mode = new long[]{531, 615};

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
	public static final long[] __DNA__FIELD__snap_node_mode = new long[]{532, 616};

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
	public static final long[] __DNA__FIELD__snap_uv_mode = new long[]{533, 617};

	/**
	 * Field descriptor (offset) for struct member 'snap_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__snap_flag);
	 * CPointer&lt;Short&gt; p_snap_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap_flag = new long[]{534, 618};

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
	 * CPointer&lt;Short&gt; p_snap_target = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'snap_target'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__snap_target = new long[]{536, 620};

	/**
	 * Field descriptor (offset) for struct member 'proportional'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__proportional);
	 * CPointer&lt;Short&gt; p_proportional = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proportional'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proportional = new long[]{538, 622};

	/**
	 * Field descriptor (offset) for struct member 'prop_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__prop_mode);
	 * CPointer&lt;Short&gt; p_prop_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prop_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prop_mode = new long[]{540, 624};

	/**
	 * Field descriptor (offset) for struct member 'proportional_objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> proportional edit, object mode </p>
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
	public static final long[] __DNA__FIELD__proportional_objects = new long[]{542, 626};

	/**
	 * Field descriptor (offset) for struct member 'proportional_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> proportional edit, mask editing </p>
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
	public static final long[] __DNA__FIELD__proportional_mask = new long[]{543, 627};

	/**
	 * Field descriptor (offset) for struct member 'proportional_action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> proportional edit, action editor </p>
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
	public static final long[] __DNA__FIELD__proportional_action = new long[]{544, 628};

	/**
	 * Field descriptor (offset) for struct member 'proportional_fcurve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> proportional edit, graph editor </p>
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
	public static final long[] __DNA__FIELD__proportional_fcurve = new long[]{545, 629};

	/**
	 * Field descriptor (offset) for struct member 'lock_markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Prevent marker editing<h4>Blender Source Code:</h4>
	 * <p> lock marker editing </p>
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
	public static final long[] __DNA__FIELD__lock_markers = new long[]{546, 630};

	/**
	 * Field descriptor (offset) for struct member 'pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__pad4);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad4 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad4'</li>
	 * <li>Signature: 'char[5]'</li>
	 * <li>Actual Size (32bit/64bit): 5/5</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad4 = new long[]{547, 631};

	/**
	 * Field descriptor (offset) for struct member 'auto_normalize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> auto normalizing mode in wpaint </p>
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
	public static final long[] __DNA__FIELD__auto_normalize = new long[]{552, 636};

	/**
	 * Field descriptor (offset) for struct member 'multipaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> paint multiple bones in wpaint </p>
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
	public static final long[] __DNA__FIELD__multipaint = new long[]{553, 637};

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
	public static final long[] __DNA__FIELD__weightuser = new long[]{554, 638};

	/**
	 * Field descriptor (offset) for struct member 'vgroupsubset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> subset selection filter in wpaint </p>
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
	public static final long[] __DNA__FIELD__vgroupsubset = new long[]{555, 639};

	/**
	 * Field descriptor (offset) for struct member 'use_uv_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Enable brush for UV sculpting<h4>Blender Source Code:</h4>
	 * <p> UV painting </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__use_uv_sculpt);
	 * CPointer&lt;Integer&gt; p_use_uv_sculpt = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_uv_sculpt'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_uv_sculpt = new long[]{556, 640};

	/**
	 * Field descriptor (offset) for struct member 'uv_sculpt_settings'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__uv_sculpt_settings);
	 * CPointer&lt;Integer&gt; p_uv_sculpt_settings = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_sculpt_settings'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_sculpt_settings = new long[]{560, 644};

	/**
	 * Field descriptor (offset) for struct member 'uv_sculpt_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select Tools for the UV sculpt brushes
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__uv_sculpt_tool);
	 * CPointer&lt;Integer&gt; p_uv_sculpt_tool = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_sculpt_tool'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_sculpt_tool = new long[]{564, 648};

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
	 * CPointer&lt;Integer&gt; p_uv_relax_method = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_relax_method'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_relax_method = new long[]{568, 652};

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
	public static final long[] __DNA__FIELD__sculpt_paint_settings = new long[]{572, 656};

	/**
	 * Field descriptor (offset) for struct member 'pad5'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ToolSettings toolsettings = ...;
	 * CPointer&lt;Object&gt; p = toolsettings.__dna__addressof(ToolSettings.__DNA__FIELD__pad5);
	 * CPointer&lt;Short&gt; p_pad5 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad5'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad5 = new long[]{574, 658};

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
	public static final long[] __DNA__FIELD__sculpt_paint_unified_size = new long[]{576, 660};

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
	public static final long[] __DNA__FIELD__sculpt_paint_unified_unprojected_radius = new long[]{580, 664};

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
	public static final long[] __DNA__FIELD__sculpt_paint_unified_alpha = new long[]{584, 668};

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
	public static final long[] __DNA__FIELD__unified_paint_settings = new long[]{588, 672};

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
	public static final long[] __DNA__FIELD__curve_paint_settings = new long[]{736, 824};

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
	public static final long[] __DNA__FIELD__statvis = new long[]{768, 856};

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
	 * <p> vertex paint </p>
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
	 * <p> vertex paint </p>
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
	 * <p> weight paint </p>
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
	 * <p> weight paint </p>
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
	 * <p> uv smooth </p>
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
	 * <p> uv smooth </p>
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
	 * Get method for struct member 'vgroup_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex group weight - used only for editmode, not weight paint </p>
	 * @see #__DNA__FIELD__vgroup_weight
	 */
	
	public float getVgroup_weight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 16);
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
			__io__block.writeFloat(__io__address + 32, vgroup_weight);
		} else {
			__io__block.writeFloat(__io__address + 16, vgroup_weight);
		}
	}

	/**
	 * Get method for struct member 'doublimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> remove doubles limit </p>
	 * @see #__DNA__FIELD__doublimit
	 */
	
	public float getDoublimit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'doublimit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> remove doubles limit </p>
	 * @see #__DNA__FIELD__doublimit
	 */
	
	public void setDoublimit(float doublimit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, doublimit);
		} else {
			__io__block.writeFloat(__io__address + 20, doublimit);
		}
	}

	/**
	 * Get method for struct member 'normalsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of normals </p>
	 * @see #__DNA__FIELD__normalsize
	 */
	
	public float getNormalsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'normalsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of normals </p>
	 * @see #__DNA__FIELD__normalsize
	 */
	
	public void setNormalsize(float normalsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, normalsize);
		} else {
			__io__block.writeFloat(__io__address + 24, normalsize);
		}
	}

	/**
	 * Get method for struct member 'automerge'.
	 * @see #__DNA__FIELD__automerge
	 */
	
	public short getAutomerge() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 44);
		} else {
			return __io__block.readShort(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'automerge'.
	 * @see #__DNA__FIELD__automerge
	 */
	
	public void setAutomerge(short automerge) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 44, automerge);
		} else {
			__io__block.writeShort(__io__address + 28, automerge);
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
			return __io__block.readShort(__io__address + 46);
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
			__io__block.writeShort(__io__address + 46, selectmode);
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
			return __io__block.readByte(__io__address + 48);
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
			__io__block.writeByte(__io__address + 48, unwrapper);
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
			return __io__block.readByte(__io__address + 49);
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
			__io__block.writeByte(__io__address + 49, uvcalc_flag);
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
			return __io__block.readByte(__io__address + 50);
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
			__io__block.writeByte(__io__address + 50, uv_flag);
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
			return __io__block.readByte(__io__address + 51);
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
			__io__block.writeByte(__io__address + 51, uv_selectmode);
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
			return __io__block.readFloat(__io__address + 52);
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
			__io__block.writeFloat(__io__address + 52, uvcalc_margin);
		} else {
			__io__block.writeFloat(__io__address + 36, uvcalc_margin);
		}
	}

	/**
	 * Get method for struct member 'autoik_chainlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto-IK runtime only </p>
	 * @see #__DNA__FIELD__autoik_chainlen
	 */
	
	public short getAutoik_chainlen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 56);
		} else {
			return __io__block.readShort(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'autoik_chainlen'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto-IK runtime only </p>
	 * @see #__DNA__FIELD__autoik_chainlen
	 */
	
	public void setAutoik_chainlen(short autoik_chainlen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 56, autoik_chainlen);
		} else {
			__io__block.writeShort(__io__address + 40, autoik_chainlen);
		}
	}

	/**
	 * Get method for struct member 'gpencil_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil flags/options for how the tool works </p>
	 * @see #__DNA__FIELD__gpencil_flags
	 */
	
	public byte getGpencil_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 58);
		} else {
			return __io__block.readByte(__io__address + 42);
		}
	}

	/**
	 * Set method for struct member 'gpencil_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil flags/options for how the tool works </p>
	 * @see #__DNA__FIELD__gpencil_flags
	 */
	
	public void setGpencil_flags(byte gpencil_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 58, gpencil_flags);
		} else {
			__io__block.writeByte(__io__address + 42, gpencil_flags);
		}
	}

	/**
	 * Get method for struct member 'gpencil_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for main 3D view Grease Pencil, where data comes from </p>
	 * @see #__DNA__FIELD__gpencil_src
	 */
	
	public byte getGpencil_src() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 59);
		} else {
			return __io__block.readByte(__io__address + 43);
		}
	}

	/**
	 * Set method for struct member 'gpencil_src'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for main 3D view Grease Pencil, where data comes from </p>
	 * @see #__DNA__FIELD__gpencil_src
	 */
	
	public void setGpencil_src(byte gpencil_src) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 59, gpencil_src);
		} else {
			__io__block.writeByte(__io__address + 43, gpencil_src);
		}
	}

	/**
	 * Get method for struct member 'gpencil_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> stroke placement settings: 3D View </p>
	 * @see #__DNA__FIELD__gpencil_v3d_align
	 */
	
	public byte getGpencil_v3d_align() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 60);
		} else {
			return __io__block.readByte(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'gpencil_v3d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> stroke placement settings: 3D View </p>
	 * @see #__DNA__FIELD__gpencil_v3d_align
	 */
	
	public void setGpencil_v3d_align(byte gpencil_v3d_align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 60, gpencil_v3d_align);
		} else {
			__io__block.writeByte(__io__address + 44, gpencil_v3d_align);
		}
	}

	/**
	 * Get method for struct member 'gpencil_v2d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> : General 2D Editor </p>
	 * @see #__DNA__FIELD__gpencil_v2d_align
	 */
	
	public byte getGpencil_v2d_align() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 61);
		} else {
			return __io__block.readByte(__io__address + 45);
		}
	}

	/**
	 * Set method for struct member 'gpencil_v2d_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> : General 2D Editor </p>
	 * @see #__DNA__FIELD__gpencil_v2d_align
	 */
	
	public void setGpencil_v2d_align(byte gpencil_v2d_align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 61, gpencil_v2d_align);
		} else {
			__io__block.writeByte(__io__address + 45, gpencil_v2d_align);
		}
	}

	/**
	 * Get method for struct member 'gpencil_seq_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> : Sequencer Preview </p>
	 * @see #__DNA__FIELD__gpencil_seq_align
	 */
	
	public byte getGpencil_seq_align() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 62);
		} else {
			return __io__block.readByte(__io__address + 46);
		}
	}

	/**
	 * Set method for struct member 'gpencil_seq_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> : Sequencer Preview </p>
	 * @see #__DNA__FIELD__gpencil_seq_align
	 */
	
	public void setGpencil_seq_align(byte gpencil_seq_align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 62, gpencil_seq_align);
		} else {
			__io__block.writeByte(__io__address + 46, gpencil_seq_align);
		}
	}

	/**
	 * Get method for struct member 'gpencil_ima_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> : {@link Image}  Editor </p>
	 * @see #__DNA__FIELD__gpencil_ima_align
	 */
	
	public byte getGpencil_ima_align() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 63);
		} else {
			return __io__block.readByte(__io__address + 47);
		}
	}

	/**
	 * Set method for struct member 'gpencil_ima_align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> : {@link Image}  Editor </p>
	 * @see #__DNA__FIELD__gpencil_ima_align
	 */
	
	public void setGpencil_ima_align(byte gpencil_ima_align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 63, gpencil_ima_align);
		} else {
			__io__block.writeByte(__io__address + 47, gpencil_ima_align);
		}
	}

	/**
	 * Get method for struct member 'gp_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil {@link Sculpt}  </p>
	 * @see #__DNA__FIELD__gp_sculpt
	 */
	
	public GP_BrushEdit_Settings getGp_sculpt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GP_BrushEdit_Settings(__io__address + 64, __io__block, __io__blockTable);
		} else {
			return new GP_BrushEdit_Settings(__io__address + 48, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gp_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil {@link Sculpt}  </p>
	 * @see #__DNA__FIELD__gp_sculpt
	 */
	
	public void setGp_sculpt(GP_BrushEdit_Settings gp_sculpt) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 48;
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
			return new GP_Interpolate_Settings(__io__address + 156, __io__block, __io__blockTable);
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
			__dna__offset = 156;
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
	 * Get method for struct member 'gp_brushes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil Drawing Brushes ({@link bGPDbrush} ) </p>
	 * @see #__DNA__FIELD__gp_brushes
	 */
	
	public ListBase getGp_brushes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 200, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 176, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gp_brushes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease Pencil Drawing Brushes ({@link bGPDbrush} ) </p>
	 * @see #__DNA__FIELD__gp_brushes
	 */
	
	public void setGp_brushes(ListBase gp_brushes) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 176;
		}
		if (__io__equals(gp_brushes, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gp_brushes)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gp_brushes);
		} else {
			__io__generic__copy( getGp_brushes(), gp_brushes);
		}
	}

	/**
	 * Get method for struct member 'imapaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Image}  {@link Paint}  (8 byttse aligned please!) </p>
	 * @see #__DNA__FIELD__imapaint
	 */
	
	public ImagePaintSettings getImapaint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImagePaintSettings(__io__address + 216, __io__block, __io__blockTable);
		} else {
			return new ImagePaintSettings(__io__address + 184, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'imapaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Image}  {@link Paint}  (8 byttse aligned please!) </p>
	 * @see #__DNA__FIELD__imapaint
	 */
	
	public void setImapaint(ImagePaintSettings imapaint) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 216;
		} else {
			__dna__offset = 184;
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
			return new ParticleEditSettings(__io__address + 344, __io__block, __io__blockTable);
		} else {
			return new ParticleEditSettings(__io__address + 280, __io__block, __io__blockTable);
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
			__dna__offset = 344;
		} else {
			__dna__offset = 280;
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
			return __io__block.readFloat(__io__address + 520);
		} else {
			return __io__block.readFloat(__io__address + 440);
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
			__io__block.writeFloat(__io__address + 520, proportional_size);
		} else {
			__io__block.writeFloat(__io__address + 440, proportional_size);
		}
	}

	/**
	 * Get method for struct member 'select_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Select {@link Group}  Threshold </p>
	 * @see #__DNA__FIELD__select_thresh
	 */
	
	public float getSelect_thresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 524);
		} else {
			return __io__block.readFloat(__io__address + 444);
		}
	}

	/**
	 * Set method for struct member 'select_thresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Select {@link Group}  Threshold </p>
	 * @see #__DNA__FIELD__select_thresh
	 */
	
	public void setSelect_thresh(float select_thresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 524, select_thresh);
		} else {
			__io__block.writeFloat(__io__address + 444, select_thresh);
		}
	}

	/**
	 * Get method for struct member 'autokey_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto-Keying Mode </p>
	 * @see #__DNA__FIELD__autokey_mode
	 */
	
	public short getAutokey_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 528);
		} else {
			return __io__block.readShort(__io__address + 448);
		}
	}

	/**
	 * Set method for struct member 'autokey_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Auto-Keying Mode </p>
	 * @see #__DNA__FIELD__autokey_mode
	 */
	
	public void setAutokey_mode(short autokey_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 528, autokey_mode);
		} else {
			__io__block.writeShort(__io__address + 448, autokey_mode);
		}
	}

	/**
	 * Get method for struct member 'autokey_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> defines in {@link DNA_userdef_types.h}  </p>
	 * @see #__DNA__FIELD__autokey_flag
	 */
	
	public short getAutokey_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 530);
		} else {
			return __io__block.readShort(__io__address + 450);
		}
	}

	/**
	 * Set method for struct member 'autokey_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> defines in {@link DNA_userdef_types.h}  </p>
	 * @see #__DNA__FIELD__autokey_flag
	 */
	
	public void setAutokey_flag(short autokey_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 530, autokey_flag);
		} else {
			__io__block.writeShort(__io__address + 450, autokey_flag);
		}
	}

	/**
	 * Get method for struct member 'keyframe_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of keyframes to create when inserting keyframes<h4>Blender Source Code:</h4>
	 * <p> keyframe type (see {@link DNA_curve_types.h} ) </p>
	 * @see #__DNA__FIELD__keyframe_type
	 */
	
	public byte getKeyframe_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 532);
		} else {
			return __io__block.readByte(__io__address + 452);
		}
	}

	/**
	 * Set method for struct member 'keyframe_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of keyframes to create when inserting keyframes<h4>Blender Source Code:</h4>
	 * <p> keyframe type (see {@link DNA_curve_types.h} ) </p>
	 * @see #__DNA__FIELD__keyframe_type
	 */
	
	public void setKeyframe_type(byte keyframe_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 532, keyframe_type);
		} else {
			__io__block.writeByte(__io__address + 452, keyframe_type);
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
			return __io__block.readByte(__io__address + 533);
		} else {
			return __io__block.readByte(__io__address + 453);
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
			__io__block.writeByte(__io__address + 533, multires_subdiv_type);
		} else {
			__io__block.writeByte(__io__address + 453, multires_subdiv_type);
		}
	}

	/**
	 * Get method for struct member 'skgen_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Skeleton generation </p>
	 * @see #__DNA__FIELD__skgen_resolution
	 */
	
	public short getSkgen_resolution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 534);
		} else {
			return __io__block.readShort(__io__address + 454);
		}
	}

	/**
	 * Set method for struct member 'skgen_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Skeleton generation </p>
	 * @see #__DNA__FIELD__skgen_resolution
	 */
	
	public void setSkgen_resolution(short skgen_resolution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 534, skgen_resolution);
		} else {
			__io__block.writeShort(__io__address + 454, skgen_resolution);
		}
	}

	/**
	 * Get method for struct member 'skgen_threshold_internal'.
	 * @see #__DNA__FIELD__skgen_threshold_internal
	 */
	
	public float getSkgen_threshold_internal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 536);
		} else {
			return __io__block.readFloat(__io__address + 456);
		}
	}

	/**
	 * Set method for struct member 'skgen_threshold_internal'.
	 * @see #__DNA__FIELD__skgen_threshold_internal
	 */
	
	public void setSkgen_threshold_internal(float skgen_threshold_internal) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 536, skgen_threshold_internal);
		} else {
			__io__block.writeFloat(__io__address + 456, skgen_threshold_internal);
		}
	}

	/**
	 * Get method for struct member 'skgen_threshold_external'.
	 * @see #__DNA__FIELD__skgen_threshold_external
	 */
	
	public float getSkgen_threshold_external() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 540);
		} else {
			return __io__block.readFloat(__io__address + 460);
		}
	}

	/**
	 * Set method for struct member 'skgen_threshold_external'.
	 * @see #__DNA__FIELD__skgen_threshold_external
	 */
	
	public void setSkgen_threshold_external(float skgen_threshold_external) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 540, skgen_threshold_external);
		} else {
			__io__block.writeFloat(__io__address + 460, skgen_threshold_external);
		}
	}

	/**
	 * Get method for struct member 'skgen_length_ratio'.
	 * @see #__DNA__FIELD__skgen_length_ratio
	 */
	
	public float getSkgen_length_ratio() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 544);
		} else {
			return __io__block.readFloat(__io__address + 464);
		}
	}

	/**
	 * Set method for struct member 'skgen_length_ratio'.
	 * @see #__DNA__FIELD__skgen_length_ratio
	 */
	
	public void setSkgen_length_ratio(float skgen_length_ratio) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 544, skgen_length_ratio);
		} else {
			__io__block.writeFloat(__io__address + 464, skgen_length_ratio);
		}
	}

	/**
	 * Get method for struct member 'skgen_length_limit'.
	 * @see #__DNA__FIELD__skgen_length_limit
	 */
	
	public float getSkgen_length_limit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 548);
		} else {
			return __io__block.readFloat(__io__address + 468);
		}
	}

	/**
	 * Set method for struct member 'skgen_length_limit'.
	 * @see #__DNA__FIELD__skgen_length_limit
	 */
	
	public void setSkgen_length_limit(float skgen_length_limit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 548, skgen_length_limit);
		} else {
			__io__block.writeFloat(__io__address + 468, skgen_length_limit);
		}
	}

	/**
	 * Get method for struct member 'skgen_angle_limit'.
	 * @see #__DNA__FIELD__skgen_angle_limit
	 */
	
	public float getSkgen_angle_limit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 552);
		} else {
			return __io__block.readFloat(__io__address + 472);
		}
	}

	/**
	 * Set method for struct member 'skgen_angle_limit'.
	 * @see #__DNA__FIELD__skgen_angle_limit
	 */
	
	public void setSkgen_angle_limit(float skgen_angle_limit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 552, skgen_angle_limit);
		} else {
			__io__block.writeFloat(__io__address + 472, skgen_angle_limit);
		}
	}

	/**
	 * Get method for struct member 'skgen_correlation_limit'.
	 * @see #__DNA__FIELD__skgen_correlation_limit
	 */
	
	public float getSkgen_correlation_limit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 556);
		} else {
			return __io__block.readFloat(__io__address + 476);
		}
	}

	/**
	 * Set method for struct member 'skgen_correlation_limit'.
	 * @see #__DNA__FIELD__skgen_correlation_limit
	 */
	
	public void setSkgen_correlation_limit(float skgen_correlation_limit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 556, skgen_correlation_limit);
		} else {
			__io__block.writeFloat(__io__address + 476, skgen_correlation_limit);
		}
	}

	/**
	 * Get method for struct member 'skgen_symmetry_limit'.
	 * @see #__DNA__FIELD__skgen_symmetry_limit
	 */
	
	public float getSkgen_symmetry_limit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 560);
		} else {
			return __io__block.readFloat(__io__address + 480);
		}
	}

	/**
	 * Set method for struct member 'skgen_symmetry_limit'.
	 * @see #__DNA__FIELD__skgen_symmetry_limit
	 */
	
	public void setSkgen_symmetry_limit(float skgen_symmetry_limit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 560, skgen_symmetry_limit);
		} else {
			__io__block.writeFloat(__io__address + 480, skgen_symmetry_limit);
		}
	}

	/**
	 * Get method for struct member 'skgen_retarget_angle_weight'.
	 * @see #__DNA__FIELD__skgen_retarget_angle_weight
	 */
	
	public float getSkgen_retarget_angle_weight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 564);
		} else {
			return __io__block.readFloat(__io__address + 484);
		}
	}

	/**
	 * Set method for struct member 'skgen_retarget_angle_weight'.
	 * @see #__DNA__FIELD__skgen_retarget_angle_weight
	 */
	
	public void setSkgen_retarget_angle_weight(float skgen_retarget_angle_weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 564, skgen_retarget_angle_weight);
		} else {
			__io__block.writeFloat(__io__address + 484, skgen_retarget_angle_weight);
		}
	}

	/**
	 * Get method for struct member 'skgen_retarget_length_weight'.
	 * @see #__DNA__FIELD__skgen_retarget_length_weight
	 */
	
	public float getSkgen_retarget_length_weight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 568);
		} else {
			return __io__block.readFloat(__io__address + 488);
		}
	}

	/**
	 * Set method for struct member 'skgen_retarget_length_weight'.
	 * @see #__DNA__FIELD__skgen_retarget_length_weight
	 */
	
	public void setSkgen_retarget_length_weight(float skgen_retarget_length_weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 568, skgen_retarget_length_weight);
		} else {
			__io__block.writeFloat(__io__address + 488, skgen_retarget_length_weight);
		}
	}

	/**
	 * Get method for struct member 'skgen_retarget_distance_weight'.
	 * @see #__DNA__FIELD__skgen_retarget_distance_weight
	 */
	
	public float getSkgen_retarget_distance_weight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 572);
		} else {
			return __io__block.readFloat(__io__address + 492);
		}
	}

	/**
	 * Set method for struct member 'skgen_retarget_distance_weight'.
	 * @see #__DNA__FIELD__skgen_retarget_distance_weight
	 */
	
	public void setSkgen_retarget_distance_weight(float skgen_retarget_distance_weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 572, skgen_retarget_distance_weight);
		} else {
			__io__block.writeFloat(__io__address + 492, skgen_retarget_distance_weight);
		}
	}

	/**
	 * Get method for struct member 'skgen_options'.
	 * @see #__DNA__FIELD__skgen_options
	 */
	
	public short getSkgen_options() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 576);
		} else {
			return __io__block.readShort(__io__address + 496);
		}
	}

	/**
	 * Set method for struct member 'skgen_options'.
	 * @see #__DNA__FIELD__skgen_options
	 */
	
	public void setSkgen_options(short skgen_options) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 576, skgen_options);
		} else {
			__io__block.writeShort(__io__address + 496, skgen_options);
		}
	}

	/**
	 * Get method for struct member 'skgen_postpro'.
	 * @see #__DNA__FIELD__skgen_postpro
	 */
	
	public byte getSkgen_postpro() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 578);
		} else {
			return __io__block.readByte(__io__address + 498);
		}
	}

	/**
	 * Set method for struct member 'skgen_postpro'.
	 * @see #__DNA__FIELD__skgen_postpro
	 */
	
	public void setSkgen_postpro(byte skgen_postpro) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 578, skgen_postpro);
		} else {
			__io__block.writeByte(__io__address + 498, skgen_postpro);
		}
	}

	/**
	 * Get method for struct member 'skgen_postpro_passes'.
	 * @see #__DNA__FIELD__skgen_postpro_passes
	 */
	
	public byte getSkgen_postpro_passes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 579);
		} else {
			return __io__block.readByte(__io__address + 499);
		}
	}

	/**
	 * Set method for struct member 'skgen_postpro_passes'.
	 * @see #__DNA__FIELD__skgen_postpro_passes
	 */
	
	public void setSkgen_postpro_passes(byte skgen_postpro_passes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 579, skgen_postpro_passes);
		} else {
			__io__block.writeByte(__io__address + 499, skgen_postpro_passes);
		}
	}

	/**
	 * Get method for struct member 'skgen_subdivisions'.
	 * @see #__DNA__FIELD__skgen_subdivisions
	 */
	
	public CArrayFacade<Byte> getSkgen_subdivisions() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 580, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 500, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'skgen_subdivisions'.
	 * @see #__DNA__FIELD__skgen_subdivisions
	 */
	
	public void setSkgen_subdivisions(CArrayFacade<Byte> skgen_subdivisions) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 580;
		} else {
			__dna__offset = 500;
		}
		if (__io__equals(skgen_subdivisions, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, skgen_subdivisions)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, skgen_subdivisions);
		} else {
			__io__generic__copy( getSkgen_subdivisions(), skgen_subdivisions);
		}
	}

	/**
	 * Get method for struct member 'skgen_multi_level'.
	 * @see #__DNA__FIELD__skgen_multi_level
	 */
	
	public byte getSkgen_multi_level() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 583);
		} else {
			return __io__block.readByte(__io__address + 503);
		}
	}

	/**
	 * Set method for struct member 'skgen_multi_level'.
	 * @see #__DNA__FIELD__skgen_multi_level
	 */
	
	public void setSkgen_multi_level(byte skgen_multi_level) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 583, skgen_multi_level);
		} else {
			__io__block.writeByte(__io__address + 503, skgen_multi_level);
		}
	}

	/**
	 * Get method for struct member 'skgen_template'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Skeleton Sketching </p>
	 * @see #__DNA__FIELD__skgen_template
	 */
	
	public CPointer<BlenderObject> getSkgen_template() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 584);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 504);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'skgen_template'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Skeleton Sketching </p>
	 * @see #__DNA__FIELD__skgen_template
	 */
	
	public void setSkgen_template(CPointer<BlenderObject> skgen_template) throws IOException
	{
		long __address = ((skgen_template == null) ? 0 : skgen_template.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 584, __address);
		} else {
			__io__block.writeLong(__io__address + 504, __address);
		}
	}

	/**
	 * Get method for struct member 'bone_sketching'.
	 * @see #__DNA__FIELD__bone_sketching
	 */
	
	public byte getBone_sketching() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 592);
		} else {
			return __io__block.readByte(__io__address + 508);
		}
	}

	/**
	 * Set method for struct member 'bone_sketching'.
	 * @see #__DNA__FIELD__bone_sketching
	 */
	
	public void setBone_sketching(byte bone_sketching) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 592, bone_sketching);
		} else {
			__io__block.writeByte(__io__address + 508, bone_sketching);
		}
	}

	/**
	 * Get method for struct member 'bone_sketching_convert'.
	 * @see #__DNA__FIELD__bone_sketching_convert
	 */
	
	public byte getBone_sketching_convert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 593);
		} else {
			return __io__block.readByte(__io__address + 509);
		}
	}

	/**
	 * Set method for struct member 'bone_sketching_convert'.
	 * @see #__DNA__FIELD__bone_sketching_convert
	 */
	
	public void setBone_sketching_convert(byte bone_sketching_convert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 593, bone_sketching_convert);
		} else {
			__io__block.writeByte(__io__address + 509, bone_sketching_convert);
		}
	}

	/**
	 * Get method for struct member 'skgen_subdivision_number'.
	 * @see #__DNA__FIELD__skgen_subdivision_number
	 */
	
	public byte getSkgen_subdivision_number() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 594);
		} else {
			return __io__block.readByte(__io__address + 510);
		}
	}

	/**
	 * Set method for struct member 'skgen_subdivision_number'.
	 * @see #__DNA__FIELD__skgen_subdivision_number
	 */
	
	public void setSkgen_subdivision_number(byte skgen_subdivision_number) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 594, skgen_subdivision_number);
		} else {
			__io__block.writeByte(__io__address + 510, skgen_subdivision_number);
		}
	}

	/**
	 * Get method for struct member 'skgen_retarget_options'.
	 * @see #__DNA__FIELD__skgen_retarget_options
	 */
	
	public byte getSkgen_retarget_options() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 595);
		} else {
			return __io__block.readByte(__io__address + 511);
		}
	}

	/**
	 * Set method for struct member 'skgen_retarget_options'.
	 * @see #__DNA__FIELD__skgen_retarget_options
	 */
	
	public void setSkgen_retarget_options(byte skgen_retarget_options) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 595, skgen_retarget_options);
		} else {
			__io__block.writeByte(__io__address + 511, skgen_retarget_options);
		}
	}

	/**
	 * Get method for struct member 'skgen_retarget_roll'.
	 * @see #__DNA__FIELD__skgen_retarget_roll
	 */
	
	public byte getSkgen_retarget_roll() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 596);
		} else {
			return __io__block.readByte(__io__address + 512);
		}
	}

	/**
	 * Set method for struct member 'skgen_retarget_roll'.
	 * @see #__DNA__FIELD__skgen_retarget_roll
	 */
	
	public void setSkgen_retarget_roll(byte skgen_retarget_roll) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 596, skgen_retarget_roll);
		} else {
			__io__block.writeByte(__io__address + 512, skgen_retarget_roll);
		}
	}

	/**
	 * Get method for struct member 'skgen_side_string'.
	 * @see #__DNA__FIELD__skgen_side_string
	 */
	
	public CArrayFacade<Byte> getSkgen_side_string() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 597, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 513, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'skgen_side_string'.
	 * @see #__DNA__FIELD__skgen_side_string
	 */
	
	public void setSkgen_side_string(CArrayFacade<Byte> skgen_side_string) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 597;
		} else {
			__dna__offset = 513;
		}
		if (__io__equals(skgen_side_string, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, skgen_side_string)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, skgen_side_string);
		} else {
			__io__generic__copy( getSkgen_side_string(), skgen_side_string);
		}
	}

	/**
	 * Get method for struct member 'skgen_num_string'.
	 * @see #__DNA__FIELD__skgen_num_string
	 */
	
	public CArrayFacade<Byte> getSkgen_num_string() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 605, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 521, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'skgen_num_string'.
	 * @see #__DNA__FIELD__skgen_num_string
	 */
	
	public void setSkgen_num_string(CArrayFacade<Byte> skgen_num_string) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 605;
		} else {
			__dna__offset = 521;
		}
		if (__io__equals(skgen_num_string, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, skgen_num_string)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, skgen_num_string);
		} else {
			__io__generic__copy( getSkgen_num_string(), skgen_num_string);
		}
	}

	/**
	 * Get method for struct member 'edge_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Alt+RMB option </p>
	 * @see #__DNA__FIELD__edge_mode
	 */
	
	public byte getEdge_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 613);
		} else {
			return __io__block.readByte(__io__address + 529);
		}
	}

	/**
	 * Set method for struct member 'edge_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Alt+RMB option </p>
	 * @see #__DNA__FIELD__edge_mode
	 */
	
	public void setEdge_mode(byte edge_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 613, edge_mode);
		} else {
			__io__block.writeByte(__io__address + 529, edge_mode);
		}
	}

	/**
	 * Get method for struct member 'edge_mode_live_unwrap'.
	 * @see #__DNA__FIELD__edge_mode_live_unwrap
	 */
	
	public byte getEdge_mode_live_unwrap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 614);
		} else {
			return __io__block.readByte(__io__address + 530);
		}
	}

	/**
	 * Set method for struct member 'edge_mode_live_unwrap'.
	 * @see #__DNA__FIELD__edge_mode_live_unwrap
	 */
	
	public void setEdge_mode_live_unwrap(byte edge_mode_live_unwrap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 614, edge_mode_live_unwrap);
		} else {
			__io__block.writeByte(__io__address + 530, edge_mode_live_unwrap);
		}
	}

	/**
	 * Get method for struct member 'snap_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Transform </p>
	 * @see #__DNA__FIELD__snap_mode
	 */
	
	public byte getSnap_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 615);
		} else {
			return __io__block.readByte(__io__address + 531);
		}
	}

	/**
	 * Set method for struct member 'snap_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Transform </p>
	 * @see #__DNA__FIELD__snap_mode
	 */
	
	public void setSnap_mode(byte snap_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 615, snap_mode);
		} else {
			__io__block.writeByte(__io__address + 531, snap_mode);
		}
	}

	/**
	 * Get method for struct member 'snap_node_mode'.
	 * @see #__DNA__FIELD__snap_node_mode
	 */
	
	public byte getSnap_node_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 616);
		} else {
			return __io__block.readByte(__io__address + 532);
		}
	}

	/**
	 * Set method for struct member 'snap_node_mode'.
	 * @see #__DNA__FIELD__snap_node_mode
	 */
	
	public void setSnap_node_mode(byte snap_node_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 616, snap_node_mode);
		} else {
			__io__block.writeByte(__io__address + 532, snap_node_mode);
		}
	}

	/**
	 * Get method for struct member 'snap_uv_mode'.
	 * @see #__DNA__FIELD__snap_uv_mode
	 */
	
	public byte getSnap_uv_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 617);
		} else {
			return __io__block.readByte(__io__address + 533);
		}
	}

	/**
	 * Set method for struct member 'snap_uv_mode'.
	 * @see #__DNA__FIELD__snap_uv_mode
	 */
	
	public void setSnap_uv_mode(byte snap_uv_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 617, snap_uv_mode);
		} else {
			__io__block.writeByte(__io__address + 533, snap_uv_mode);
		}
	}

	/**
	 * Get method for struct member 'snap_flag'.
	 * @see #__DNA__FIELD__snap_flag
	 */
	
	public short getSnap_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 618);
		} else {
			return __io__block.readShort(__io__address + 534);
		}
	}

	/**
	 * Set method for struct member 'snap_flag'.
	 * @see #__DNA__FIELD__snap_flag
	 */
	
	public void setSnap_flag(short snap_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 618, snap_flag);
		} else {
			__io__block.writeShort(__io__address + 534, snap_flag);
		}
	}

	/**
	 * Get method for struct member 'snap_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Which part to snap onto the target
	 * @see #__DNA__FIELD__snap_target
	 */
	
	public short getSnap_target() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 620);
		} else {
			return __io__block.readShort(__io__address + 536);
		}
	}

	/**
	 * Set method for struct member 'snap_target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Which part to snap onto the target
	 * @see #__DNA__FIELD__snap_target
	 */
	
	public void setSnap_target(short snap_target) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 620, snap_target);
		} else {
			__io__block.writeShort(__io__address + 536, snap_target);
		}
	}

	/**
	 * Get method for struct member 'proportional'.
	 * @see #__DNA__FIELD__proportional
	 */
	
	public short getProportional() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 622);
		} else {
			return __io__block.readShort(__io__address + 538);
		}
	}

	/**
	 * Set method for struct member 'proportional'.
	 * @see #__DNA__FIELD__proportional
	 */
	
	public void setProportional(short proportional) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 622, proportional);
		} else {
			__io__block.writeShort(__io__address + 538, proportional);
		}
	}

	/**
	 * Get method for struct member 'prop_mode'.
	 * @see #__DNA__FIELD__prop_mode
	 */
	
	public short getProp_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 624);
		} else {
			return __io__block.readShort(__io__address + 540);
		}
	}

	/**
	 * Set method for struct member 'prop_mode'.
	 * @see #__DNA__FIELD__prop_mode
	 */
	
	public void setProp_mode(short prop_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 624, prop_mode);
		} else {
			__io__block.writeShort(__io__address + 540, prop_mode);
		}
	}

	/**
	 * Get method for struct member 'proportional_objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> proportional edit, object mode </p>
	 * @see #__DNA__FIELD__proportional_objects
	 */
	
	public byte getProportional_objects() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 626);
		} else {
			return __io__block.readByte(__io__address + 542);
		}
	}

	/**
	 * Set method for struct member 'proportional_objects'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> proportional edit, object mode </p>
	 * @see #__DNA__FIELD__proportional_objects
	 */
	
	public void setProportional_objects(byte proportional_objects) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 626, proportional_objects);
		} else {
			__io__block.writeByte(__io__address + 542, proportional_objects);
		}
	}

	/**
	 * Get method for struct member 'proportional_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> proportional edit, mask editing </p>
	 * @see #__DNA__FIELD__proportional_mask
	 */
	
	public byte getProportional_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 627);
		} else {
			return __io__block.readByte(__io__address + 543);
		}
	}

	/**
	 * Set method for struct member 'proportional_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> proportional edit, mask editing </p>
	 * @see #__DNA__FIELD__proportional_mask
	 */
	
	public void setProportional_mask(byte proportional_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 627, proportional_mask);
		} else {
			__io__block.writeByte(__io__address + 543, proportional_mask);
		}
	}

	/**
	 * Get method for struct member 'proportional_action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> proportional edit, action editor </p>
	 * @see #__DNA__FIELD__proportional_action
	 */
	
	public byte getProportional_action() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 628);
		} else {
			return __io__block.readByte(__io__address + 544);
		}
	}

	/**
	 * Set method for struct member 'proportional_action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> proportional edit, action editor </p>
	 * @see #__DNA__FIELD__proportional_action
	 */
	
	public void setProportional_action(byte proportional_action) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 628, proportional_action);
		} else {
			__io__block.writeByte(__io__address + 544, proportional_action);
		}
	}

	/**
	 * Get method for struct member 'proportional_fcurve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> proportional edit, graph editor </p>
	 * @see #__DNA__FIELD__proportional_fcurve
	 */
	
	public byte getProportional_fcurve() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 629);
		} else {
			return __io__block.readByte(__io__address + 545);
		}
	}

	/**
	 * Set method for struct member 'proportional_fcurve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> proportional edit, graph editor </p>
	 * @see #__DNA__FIELD__proportional_fcurve
	 */
	
	public void setProportional_fcurve(byte proportional_fcurve) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 629, proportional_fcurve);
		} else {
			__io__block.writeByte(__io__address + 545, proportional_fcurve);
		}
	}

	/**
	 * Get method for struct member 'lock_markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Prevent marker editing<h4>Blender Source Code:</h4>
	 * <p> lock marker editing </p>
	 * @see #__DNA__FIELD__lock_markers
	 */
	
	public byte getLock_markers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 630);
		} else {
			return __io__block.readByte(__io__address + 546);
		}
	}

	/**
	 * Set method for struct member 'lock_markers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Prevent marker editing<h4>Blender Source Code:</h4>
	 * <p> lock marker editing </p>
	 * @see #__DNA__FIELD__lock_markers
	 */
	
	public void setLock_markers(byte lock_markers) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 630, lock_markers);
		} else {
			__io__block.writeByte(__io__address + 546, lock_markers);
		}
	}

	/**
	 * Get method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public CArrayFacade<Byte> getPad4() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			5
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 631, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 547, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public void setPad4(CArrayFacade<Byte> pad4) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 631;
		} else {
			__dna__offset = 547;
		}
		if (__io__equals(pad4, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad4)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad4);
		} else {
			__io__generic__copy( getPad4(), pad4);
		}
	}

	/**
	 * Get method for struct member 'auto_normalize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> auto normalizing mode in wpaint </p>
	 * @see #__DNA__FIELD__auto_normalize
	 */
	
	public byte getAuto_normalize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 636);
		} else {
			return __io__block.readByte(__io__address + 552);
		}
	}

	/**
	 * Set method for struct member 'auto_normalize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> auto normalizing mode in wpaint </p>
	 * @see #__DNA__FIELD__auto_normalize
	 */
	
	public void setAuto_normalize(byte auto_normalize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 636, auto_normalize);
		} else {
			__io__block.writeByte(__io__address + 552, auto_normalize);
		}
	}

	/**
	 * Get method for struct member 'multipaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> paint multiple bones in wpaint </p>
	 * @see #__DNA__FIELD__multipaint
	 */
	
	public byte getMultipaint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 637);
		} else {
			return __io__block.readByte(__io__address + 553);
		}
	}

	/**
	 * Set method for struct member 'multipaint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> paint multiple bones in wpaint </p>
	 * @see #__DNA__FIELD__multipaint
	 */
	
	public void setMultipaint(byte multipaint) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 637, multipaint);
		} else {
			__io__block.writeByte(__io__address + 553, multipaint);
		}
	}

	/**
	 * Get method for struct member 'weightuser'.
	 * @see #__DNA__FIELD__weightuser
	 */
	
	public byte getWeightuser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 638);
		} else {
			return __io__block.readByte(__io__address + 554);
		}
	}

	/**
	 * Set method for struct member 'weightuser'.
	 * @see #__DNA__FIELD__weightuser
	 */
	
	public void setWeightuser(byte weightuser) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 638, weightuser);
		} else {
			__io__block.writeByte(__io__address + 554, weightuser);
		}
	}

	/**
	 * Get method for struct member 'vgroupsubset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> subset selection filter in wpaint </p>
	 * @see #__DNA__FIELD__vgroupsubset
	 */
	
	public byte getVgroupsubset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 639);
		} else {
			return __io__block.readByte(__io__address + 555);
		}
	}

	/**
	 * Set method for struct member 'vgroupsubset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> subset selection filter in wpaint </p>
	 * @see #__DNA__FIELD__vgroupsubset
	 */
	
	public void setVgroupsubset(byte vgroupsubset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 639, vgroupsubset);
		} else {
			__io__block.writeByte(__io__address + 555, vgroupsubset);
		}
	}

	/**
	 * Get method for struct member 'use_uv_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Enable brush for UV sculpting<h4>Blender Source Code:</h4>
	 * <p> UV painting </p>
	 * @see #__DNA__FIELD__use_uv_sculpt
	 */
	
	public int getUse_uv_sculpt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 640);
		} else {
			return __io__block.readInt(__io__address + 556);
		}
	}

	/**
	 * Set method for struct member 'use_uv_sculpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Enable brush for UV sculpting<h4>Blender Source Code:</h4>
	 * <p> UV painting </p>
	 * @see #__DNA__FIELD__use_uv_sculpt
	 */
	
	public void setUse_uv_sculpt(int use_uv_sculpt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 640, use_uv_sculpt);
		} else {
			__io__block.writeInt(__io__address + 556, use_uv_sculpt);
		}
	}

	/**
	 * Get method for struct member 'uv_sculpt_settings'.
	 * @see #__DNA__FIELD__uv_sculpt_settings
	 */
	
	public int getUv_sculpt_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 644);
		} else {
			return __io__block.readInt(__io__address + 560);
		}
	}

	/**
	 * Set method for struct member 'uv_sculpt_settings'.
	 * @see #__DNA__FIELD__uv_sculpt_settings
	 */
	
	public void setUv_sculpt_settings(int uv_sculpt_settings) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 644, uv_sculpt_settings);
		} else {
			__io__block.writeInt(__io__address + 560, uv_sculpt_settings);
		}
	}

	/**
	 * Get method for struct member 'uv_sculpt_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select Tools for the UV sculpt brushes
	 * @see #__DNA__FIELD__uv_sculpt_tool
	 */
	
	public int getUv_sculpt_tool() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 648);
		} else {
			return __io__block.readInt(__io__address + 564);
		}
	}

	/**
	 * Set method for struct member 'uv_sculpt_tool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select Tools for the UV sculpt brushes
	 * @see #__DNA__FIELD__uv_sculpt_tool
	 */
	
	public void setUv_sculpt_tool(int uv_sculpt_tool) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 648, uv_sculpt_tool);
		} else {
			__io__block.writeInt(__io__address + 564, uv_sculpt_tool);
		}
	}

	/**
	 * Get method for struct member 'uv_relax_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Algorithm used for UV relaxation
	 * @see #__DNA__FIELD__uv_relax_method
	 */
	
	public int getUv_relax_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 652);
		} else {
			return __io__block.readInt(__io__address + 568);
		}
	}

	/**
	 * Set method for struct member 'uv_relax_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Algorithm used for UV relaxation
	 * @see #__DNA__FIELD__uv_relax_method
	 */
	
	public void setUv_relax_method(int uv_relax_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 652, uv_relax_method);
		} else {
			__io__block.writeInt(__io__address + 568, uv_relax_method);
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
			return __io__block.readShort(__io__address + 656);
		} else {
			return __io__block.readShort(__io__address + 572);
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
			__io__block.writeShort(__io__address + 656, sculpt_paint_settings);
		} else {
			__io__block.writeShort(__io__address + 572, sculpt_paint_settings);
		}
	}

	/**
	 * Get method for struct member 'pad5'.
	 * @see #__DNA__FIELD__pad5
	 */
	
	public short getPad5() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 658);
		} else {
			return __io__block.readShort(__io__address + 574);
		}
	}

	/**
	 * Set method for struct member 'pad5'.
	 * @see #__DNA__FIELD__pad5
	 */
	
	public void setPad5(short pad5) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 658, pad5);
		} else {
			__io__block.writeShort(__io__address + 574, pad5);
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
			return __io__block.readInt(__io__address + 660);
		} else {
			return __io__block.readInt(__io__address + 576);
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
			__io__block.writeInt(__io__address + 660, sculpt_paint_unified_size);
		} else {
			__io__block.writeInt(__io__address + 576, sculpt_paint_unified_size);
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
			return __io__block.readFloat(__io__address + 664);
		} else {
			return __io__block.readFloat(__io__address + 580);
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
			__io__block.writeFloat(__io__address + 664, sculpt_paint_unified_unprojected_radius);
		} else {
			__io__block.writeFloat(__io__address + 580, sculpt_paint_unified_unprojected_radius);
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
			return __io__block.readFloat(__io__address + 668);
		} else {
			return __io__block.readFloat(__io__address + 584);
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
			__io__block.writeFloat(__io__address + 668, sculpt_paint_unified_alpha);
		} else {
			__io__block.writeFloat(__io__address + 584, sculpt_paint_unified_alpha);
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
			return new UnifiedPaintSettings(__io__address + 672, __io__block, __io__blockTable);
		} else {
			return new UnifiedPaintSettings(__io__address + 588, __io__block, __io__blockTable);
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
			__dna__offset = 672;
		} else {
			__dna__offset = 588;
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
			return new CurvePaintSettings(__io__address + 824, __io__block, __io__blockTable);
		} else {
			return new CurvePaintSettings(__io__address + 736, __io__block, __io__blockTable);
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
			__dna__offset = 824;
		} else {
			__dna__offset = 736;
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
			return new MeshStatVis(__io__address + 856, __io__block, __io__blockTable);
		} else {
			return new MeshStatVis(__io__address + 768, __io__block, __io__blockTable);
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
			__dna__offset = 856;
		} else {
			__dna__offset = 768;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ToolSettings> __io__addressof() {
		return new CPointer<ToolSettings>(__io__address, new Class[]{ToolSettings.class}, __io__block, __io__blockTable);
	}

}
