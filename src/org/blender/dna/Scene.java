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
 * Generated facet for DNA struct type 'Scene'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=6400, size64=6704)
public class Scene extends CFacade {

	/**
	 * This is the sdna index of the struct Scene.
	 * <p>
	 * It is required when allocating a new block to store data for Scene.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 613;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 152/192</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__adt);
	 * CPointer&lt;CPointer&lt;AnimData&gt;&gt; p_adt = p.cast(new Class[]{CPointer.class, AnimData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adt'</li>
	 * <li>Signature: 'AnimData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adt = new long[]{152, 192};

	/**
	 * Field descriptor (offset) for struct member 'drawdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> runtime (must be immediately after id for utilities to use it). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__drawdata);
	 * CPointer&lt;DrawDataList&gt; p_drawdata = p.cast(new Class[]{DrawDataList.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawdata'</li>
	 * <li>Signature: 'DrawDataList'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawdata = new long[]{156, 200};

	/**
	 * Field descriptor (offset) for struct member 'camera'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Active camera, used for rendering the scene
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__camera);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_camera = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'camera'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__camera = new long[]{164, 216};

	/**
	 * Field descriptor (offset) for struct member 'world'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * World used for rendering the scene
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__world);
	 * CPointer&lt;CPointer&lt;World&gt;&gt; p_world = p.cast(new Class[]{CPointer.class, World.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'world'</li>
	 * <li>Signature: 'World*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__world = new long[]{168, 224};

	/**
	 * Field descriptor (offset) for struct member 'set'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__set);
	 * CPointer&lt;CPointer&lt;Scene&gt;&gt; p_set = p.cast(new Class[]{CPointer.class, Scene.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'set'</li>
	 * <li>Signature: 'Scene*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__set = new long[]{172, 232};

	/**
	 * Field descriptor (offset) for struct member 'base'.
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
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__base);
	 * CPointer&lt;ListBase&gt; p_base = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base = new long[]{176, 240};

	/**
	 * Field descriptor (offset) for struct member 'basact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active base. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__basact);
	 * CPointer&lt;CPointer&lt;Base&gt;&gt; p_basact = p.cast(new Class[]{CPointer.class, Base.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'basact'</li>
	 * <li>Signature: 'Base*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__basact = new long[]{184, 256};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD___pad1);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad1 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{188, 264};

	/**
	 * Field descriptor (offset) for struct member 'cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> 3d cursor location. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__cursor);
	 * CPointer&lt;View3DCursor&gt; p_cursor = p.cast(new Class[]{View3DCursor.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cursor'</li>
	 * <li>Signature: 'View3DCursor'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cursor = new long[]{192, 272};

	/**
	 * Field descriptor (offset) for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Bitflags for layer visibility (deprecated). 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__lay);
	 * CPointer&lt;Integer&gt; p_lay = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lay'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lay = new long[]{256, 336};

	/**
	 * Field descriptor (offset) for struct member 'layact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active layer (deprecated) 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__layact);
	 * CPointer&lt;Integer&gt; p_layact = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layact'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layact = new long[]{260, 340};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{264, 344};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Various settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{268, 348};

	/**
	 * Field descriptor (offset) for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Enable the compositing node tree
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__use_nodes);
	 * CPointer&lt;Byte&gt; p_use_nodes = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_nodes'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_nodes = new long[]{270, 350};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{271, 351};

	/**
	 * Field descriptor (offset) for struct member 'nodetree'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__nodetree);
	 * CPointer&lt;CPointer&lt;bNodeTree&gt;&gt; p_nodetree = p.cast(new Class[]{CPointer.class, bNodeTree.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodetree'</li>
	 * <li>Signature: 'bNodeTree*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodetree = new long[]{272, 352};

	/**
	 * Field descriptor (offset) for struct member 'ed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Sequence}  editor data is allocated here. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__ed);
	 * CPointer&lt;CPointer&lt;Editing&gt;&gt; p_ed = p.cast(new Class[]{CPointer.class, Editing.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ed'</li>
	 * <li>Signature: 'Editing*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ed = new long[]{276, 360};

	/**
	 * Field descriptor (offset) for struct member 'toolsettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Default allocated now. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__toolsettings);
	 * CPointer&lt;CPointer&lt;ToolSettings&gt;&gt; p_toolsettings = p.cast(new Class[]{CPointer.class, ToolSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'toolsettings'</li>
	 * <li>Signature: 'ToolSettings*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__toolsettings = new long[]{280, 368};

	/**
	 * Field descriptor (offset) for struct member '_pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD___pad4);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad4 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad4'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad4 = new long[]{284, 376};

	/**
	 * Field descriptor (offset) for struct member 'safe_areas'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__safe_areas);
	 * CPointer&lt;DisplaySafeAreas&gt; p_safe_areas = p.cast(new Class[]{DisplaySafeAreas.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'safe_areas'</li>
	 * <li>Signature: 'DisplaySafeAreas'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__safe_areas = new long[]{288, 384};

	/**
	 * Field descriptor (offset) for struct member 'r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> migrate or replace? depends on some internal things... no, is on the right place (ton) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__r);
	 * CPointer&lt;RenderData&gt; p_r = p.cast(new Class[]{RenderData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'r'</li>
	 * <li>Signature: 'RenderData'</li>
	 * <li>Actual Size (32bit/64bit): 4220/4312</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__r = new long[]{320, 416};

	/**
	 * Field descriptor (offset) for struct member 'audio'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__audio);
	 * CPointer&lt;AudioData&gt; p_audio = p.cast(new Class[]{AudioData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audio'</li>
	 * <li>Signature: 'AudioData'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audio = new long[]{4540, 4728};

	/**
	 * Field descriptor (offset) for struct member 'markers'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__markers);
	 * CPointer&lt;ListBase&gt; p_markers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'markers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__markers = new long[]{4572, 4760};

	/**
	 * Field descriptor (offset) for struct member 'transform_spaces'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__transform_spaces);
	 * CPointer&lt;ListBase&gt; p_transform_spaces = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transform_spaces'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transform_spaces = new long[]{4580, 4776};

	/**
	 * Field descriptor (offset) for struct member 'orientation_slots'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> First is the [scene, translate, rotate, scale]. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__orientation_slots);
	 * CPointer&lt;CArrayFacade&lt;TransformOrientationSlot&gt;&gt; p_orientation_slots = p.cast(new Class[]{CArrayFacade.class, TransformOrientationSlot.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orientation_slots'</li>
	 * <li>Signature: 'TransformOrientationSlot[4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orientation_slots = new long[]{4588, 4792};

	/**
	 * Field descriptor (offset) for struct member 'sound_scene'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__sound_scene);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sound_scene = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sound_scene'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sound_scene = new long[]{4652, 4856};

	/**
	 * Field descriptor (offset) for struct member 'playback_handle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__playback_handle);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_playback_handle = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'playback_handle'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__playback_handle = new long[]{4656, 4864};

	/**
	 * Field descriptor (offset) for struct member 'sound_scrub_handle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__sound_scrub_handle);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sound_scrub_handle = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sound_scrub_handle'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sound_scrub_handle = new long[]{4660, 4872};

	/**
	 * Field descriptor (offset) for struct member 'speaker_handles'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__speaker_handles);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_speaker_handles = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'speaker_handles'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__speaker_handles = new long[]{4664, 4880};

	/**
	 * Field descriptor (offset) for struct member 'fps_info'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> (runtime) info/cache used for presenting playback framerate info to the user. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__fps_info);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_fps_info = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fps_info'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fps_info = new long[]{4668, 4888};

	/**
	 * Field descriptor (offset) for struct member 'depsgraph_hash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> None of the dependency graph vars is mean to be saved. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__depsgraph_hash);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_depsgraph_hash = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'depsgraph_hash'</li>
	 * <li>Signature: 'GHash*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__depsgraph_hash = new long[]{4672, 4896};

	/**
	 * Field descriptor (offset) for struct member '_pad7'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD___pad7);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad7 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad7'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad7 = new long[]{4676, 4904};

	/**
	 * Field descriptor (offset) for struct member 'active_keyingset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> User-Defined KeyingSets Index of the active {@link KeyingSet} . first {@link KeyingSet}  has index 1, 'none' active is 0, 'add new' is -1 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__active_keyingset);
	 * CPointer&lt;Integer&gt; p_active_keyingset = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_keyingset'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_keyingset = new long[]{4680, 4908};

	/**
	 * Field descriptor (offset) for struct member 'keyingsets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> s for this scene </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__keyingsets);
	 * CPointer&lt;ListBase&gt; p_keyingsets = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyingsets'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyingsets = new long[]{4684, 4912};

	/**
	 * Field descriptor (offset) for struct member 'unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Units </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__unit);
	 * CPointer&lt;UnitSettings&gt; p_unit = p.cast(new Class[]{UnitSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'unit'</li>
	 * <li>Signature: 'UnitSettings'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__unit = new long[]{4692, 4928};

	/**
	 * Field descriptor (offset) for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Grease Pencil - Annotations </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__gpd);
	 * CPointer&lt;CPointer&lt;bGPdata&gt;&gt; p_gpd = p.cast(new Class[]{CPointer.class, bGPdata.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpd'</li>
	 * <li>Signature: 'bGPdata*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpd = new long[]{4708, 4944};

	/**
	 * Field descriptor (offset) for struct member 'clip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Movie Tracking Active movie clip. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__clip);
	 * CPointer&lt;CPointer&lt;MovieClip&gt;&gt; p_clip = p.cast(new Class[]{CPointer.class, MovieClip.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clip'</li>
	 * <li>Signature: 'MovieClip*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clip = new long[]{4712, 4952};

	/**
	 * Field descriptor (offset) for struct member 'physics_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Physics simulation settings </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__physics_settings);
	 * CPointer&lt;PhysicsSettings&gt; p_physics_settings = p.cast(new Class[]{PhysicsSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'physics_settings'</li>
	 * <li>Signature: 'PhysicsSettings'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__physics_settings = new long[]{4716, 4960};

	/**
	 * Field descriptor (offset) for struct member '_pad8'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD___pad8);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad8 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad8'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad8 = new long[]{4740, 4984};

	/**
	 * Field descriptor (offset) for struct member 'customdata_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX. runtime flag for drawing, actually belongs in the window, only used by BKE_object_handle_update() </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__customdata_mask);
	 * CPointer&lt;CustomData_MeshMasks&gt; p_customdata_mask = p.cast(new Class[]{CustomData_MeshMasks.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'customdata_mask'</li>
	 * <li>Signature: 'CustomData_MeshMasks'</li>
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__customdata_mask = new long[]{4744, 4992};

	/**
	 * Field descriptor (offset) for struct member 'customdata_mask_modal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX. same as above but for temp operator use (gl renders) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__customdata_mask_modal);
	 * CPointer&lt;CustomData_MeshMasks&gt; p_customdata_mask_modal = p.cast(new Class[]{CustomData_MeshMasks.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'customdata_mask_modal'</li>
	 * <li>Signature: 'CustomData_MeshMasks'</li>
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__customdata_mask_modal = new long[]{4784, 5032};

	/**
	 * Field descriptor (offset) for struct member 'view_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Color management settings applied on image before saving
	 * <h4>Blender Source Code</h4>
	 * <p> Color Management </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__view_settings);
	 * CPointer&lt;ColorManagedViewSettings&gt; p_view_settings = p.cast(new Class[]{ColorManagedViewSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_settings'</li>
	 * <li>Signature: 'ColorManagedViewSettings'</li>
	 * <li>Actual Size (32bit/64bit): 152/160</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_settings = new long[]{4824, 5072};

	/**
	 * Field descriptor (offset) for struct member 'display_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Settings of device saved image would be displayed on
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__display_settings);
	 * CPointer&lt;ColorManagedDisplaySettings&gt; p_display_settings = p.cast(new Class[]{ColorManagedDisplaySettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'display_settings'</li>
	 * <li>Signature: 'ColorManagedDisplaySettings'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__display_settings = new long[]{4976, 5232};

	/**
	 * Field descriptor (offset) for struct member 'sequencer_colorspace_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Settings of color space sequencer is working in
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__sequencer_colorspace_settings);
	 * CPointer&lt;ColorManagedColorspaceSettings&gt; p_sequencer_colorspace_settings = p.cast(new Class[]{ColorManagedColorspaceSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sequencer_colorspace_settings'</li>
	 * <li>Signature: 'ColorManagedColorspaceSettings'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sequencer_colorspace_settings = new long[]{5040, 5296};

	/**
	 * Field descriptor (offset) for struct member 'rigidbody_world'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> RigidBody simulation world+settings </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__rigidbody_world);
	 * CPointer&lt;CPointer&lt;RigidBodyWorld&gt;&gt; p_rigidbody_world = p.cast(new Class[]{CPointer.class, RigidBodyWorld.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rigidbody_world'</li>
	 * <li>Signature: 'RigidBodyWorld*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rigidbody_world = new long[]{5104, 5360};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__preview);
	 * CPointer&lt;CPointer&lt;PreviewImage&gt;&gt; p_preview = p.cast(new Class[]{CPointer.class, PreviewImage.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview'</li>
	 * <li>Signature: 'PreviewImage*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview = new long[]{5108, 5368};

	/**
	 * Field descriptor (offset) for struct member 'view_layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__view_layers);
	 * CPointer&lt;ListBase&gt; p_view_layers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_layers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_layers = new long[]{5112, 5376};

	/**
	 * Field descriptor (offset) for struct member 'master_collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Not an actual datablock, but memory owned by scene. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__master_collection);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_master_collection = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'master_collection'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__master_collection = new long[]{5120, 5392};

	/**
	 * Field descriptor (offset) for struct member 'collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Scene root collection that owns all the objects and other collections instantiated in the scene
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__collection);
	 * CPointer&lt;CPointer&lt;SceneCollection&gt;&gt; p_collection = p.cast(new Class[]{CPointer.class, SceneCollection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'collection'</li>
	 * <li>Signature: 'SceneCollection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__collection = new long[]{5124, 5400};

	/**
	 * Field descriptor (offset) for struct member 'layer_properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Settings to be override by workspaces. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__layer_properties);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_layer_properties = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_properties'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_properties = new long[]{5128, 5408};

	/**
	 * Field descriptor (offset) for struct member '_pad9'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD___pad9);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad9 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad9'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad9 = new long[]{5132, 5416};

	/**
	 * Field descriptor (offset) for struct member 'display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Scene display settings for 3D viewport
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__display);
	 * CPointer&lt;SceneDisplay&gt; p_display = p.cast(new Class[]{SceneDisplay.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'display'</li>
	 * <li>Signature: 'SceneDisplay'</li>
	 * <li>Actual Size (32bit/64bit): 976/984</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__display = new long[]{5136, 5424};

	/**
	 * Field descriptor (offset) for struct member 'eevee'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Eevee settings for the scene
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__eevee);
	 * CPointer&lt;SceneEEVEE&gt; p_eevee = p.cast(new Class[]{SceneEEVEE.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eevee'</li>
	 * <li>Signature: 'SceneEEVEE'</li>
	 * <li>Actual Size (32bit/64bit): 280/288</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eevee = new long[]{6112, 6408};

	/**
	 * Field descriptor (offset) for struct member 'grease_pencil_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Grease Pencil settings for the scene
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__grease_pencil_settings);
	 * CPointer&lt;SceneGpencil&gt; p_grease_pencil_settings = p.cast(new Class[]{SceneGpencil.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grease_pencil_settings'</li>
	 * <li>Signature: 'SceneGpencil'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grease_pencil_settings = new long[]{6392, 6696};

	public Scene(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Scene(Scene that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public ID getId() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(ID id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, id);
		} else {
			__io__generic__copy( getId(), id);
		}
	}

	/**
	 * Get method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 152, __address);
		}
	}

	/**
	 * Get method for struct member 'drawdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> runtime (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__drawdata
	 */
	
	public DrawDataList getDrawdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new DrawDataList(__io__address + 200, __io__block, __io__blockTable);
		} else {
			return new DrawDataList(__io__address + 156, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drawdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> runtime (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__drawdata
	 */
	
	public void setDrawdata(DrawDataList drawdata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(drawdata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drawdata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drawdata);
		} else {
			__io__generic__copy( getDrawdata(), drawdata);
		}
	}

	/**
	 * Get method for struct member 'camera'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Active camera, used for rendering the scene
	 * @see #__DNA__FIELD__camera
	 */
	
	public CPointer<BlenderObject> getCamera() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 164);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'camera'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Active camera, used for rendering the scene
	 * @see #__DNA__FIELD__camera
	 */
	
	public void setCamera(CPointer<BlenderObject> camera) throws IOException
	{
		long __address = ((camera == null) ? 0 : camera.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 164, __address);
		}
	}

	/**
	 * Get method for struct member 'world'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * World used for rendering the scene
	 * @see #__DNA__FIELD__world
	 */
	
	public CPointer<World> getWorld() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		}
		Class<?>[] __dna__targetTypes = new Class[]{World.class};
		return new CPointer<World>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, World.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'world'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * World used for rendering the scene
	 * @see #__DNA__FIELD__world
	 */
	
	public void setWorld(CPointer<World> world) throws IOException
	{
		long __address = ((world == null) ? 0 : world.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 168, __address);
		}
	}

	/**
	 * Get method for struct member 'set'.
	 * @see #__DNA__FIELD__set
	 */
	
	public CPointer<Scene> getSet() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Scene.class};
		return new CPointer<Scene>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Scene.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'set'.
	 * @see #__DNA__FIELD__set
	 */
	
	public void setSet(CPointer<Scene> set) throws IOException
	{
		long __address = ((set == null) ? 0 : set.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 172, __address);
		}
	}

	/**
	 * Get method for struct member 'base'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__base
	 */
	
	public ListBase getBase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 240, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 176, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__base
	 */
	
	public void setBase(ListBase base) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 240;
		} else {
			__dna__offset = 176;
		}
		if (__io__equals(base, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, base)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, base);
		} else {
			__io__generic__copy( getBase(), base);
		}
	}

	/**
	 * Get method for struct member 'basact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active base. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__basact
	 */
	
	public CPointer<Base> getBasact() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Base.class};
		return new CPointer<Base>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Base.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'basact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active base. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__basact
	 */
	
	public void setBasact(CPointer<Base> basact) throws IOException
	{
		long __address = ((basact == null) ? 0 : basact.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 256, __address);
		} else {
			__io__block.writeLong(__io__address + 184, __address);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CPointer<Object> get_pad1() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 264);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 188);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CPointer<Object> _pad1) throws IOException
	{
		long __address = ((_pad1 == null) ? 0 : _pad1.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 264, __address);
		} else {
			__io__block.writeLong(__io__address + 188, __address);
		}
	}

	/**
	 * Get method for struct member 'cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> 3d cursor location. </p>
	 * @see #__DNA__FIELD__cursor
	 */
	
	public View3DCursor getCursor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new View3DCursor(__io__address + 272, __io__block, __io__blockTable);
		} else {
			return new View3DCursor(__io__address + 192, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> 3d cursor location. </p>
	 * @see #__DNA__FIELD__cursor
	 */
	
	public void setCursor(View3DCursor cursor) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 272;
		} else {
			__dna__offset = 192;
		}
		if (__io__equals(cursor, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cursor)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cursor);
		} else {
			__io__generic__copy( getCursor(), cursor);
		}
	}

	/**
	 * Get method for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Bitflags for layer visibility (deprecated). 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__lay
	 */
	
	public int getLay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 336);
		} else {
			return __io__block.readInt(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Bitflags for layer visibility (deprecated). 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__lay
	 */
	
	public void setLay(int lay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 336, lay);
		} else {
			__io__block.writeInt(__io__address + 256, lay);
		}
	}

	/**
	 * Get method for struct member 'layact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active layer (deprecated) 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__layact
	 */
	
	public int getLayact() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 340);
		} else {
			return __io__block.readInt(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'layact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Active layer (deprecated) 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__layact
	 */
	
	public void setLayact(int layact) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 340, layact);
		} else {
			__io__block.writeInt(__io__address + 260, layact);
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
			return new CArrayFacade<Byte>(__io__address + 344, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 264, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 344;
		} else {
			__dna__offset = 264;
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
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Various settings. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 348);
		} else {
			return __io__block.readShort(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Various settings. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 348, flag);
		} else {
			__io__block.writeShort(__io__address + 268, flag);
		}
	}

	/**
	 * Get method for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Enable the compositing node tree
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public byte getUse_nodes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 350);
		} else {
			return __io__block.readByte(__io__address + 270);
		}
	}

	/**
	 * Set method for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Enable the compositing node tree
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public void setUse_nodes(byte use_nodes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 350, use_nodes);
		} else {
			__io__block.writeByte(__io__address + 270, use_nodes);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CArrayFacade<Byte> get_pad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 351, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 271, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CArrayFacade<Byte> _pad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 351;
		} else {
			__dna__offset = 271;
		}
		if (__io__equals(_pad3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad3);
		} else {
			__io__generic__copy( get_pad3(), _pad3);
		}
	}

	/**
	 * Get method for struct member 'nodetree'.
	 * @see #__DNA__FIELD__nodetree
	 */
	
	public CPointer<bNodeTree> getNodetree() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 352);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNodeTree.class};
		return new CPointer<bNodeTree>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNodeTree.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'nodetree'.
	 * @see #__DNA__FIELD__nodetree
	 */
	
	public void setNodetree(CPointer<bNodeTree> nodetree) throws IOException
	{
		long __address = ((nodetree == null) ? 0 : nodetree.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 352, __address);
		} else {
			__io__block.writeLong(__io__address + 272, __address);
		}
	}

	/**
	 * Get method for struct member 'ed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Sequence}  editor data is allocated here. </p>
	 * @see #__DNA__FIELD__ed
	 */
	
	public CPointer<Editing> getEd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 360);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 276);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Editing.class};
		return new CPointer<Editing>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Editing.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Sequence}  editor data is allocated here. </p>
	 * @see #__DNA__FIELD__ed
	 */
	
	public void setEd(CPointer<Editing> ed) throws IOException
	{
		long __address = ((ed == null) ? 0 : ed.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 360, __address);
		} else {
			__io__block.writeLong(__io__address + 276, __address);
		}
	}

	/**
	 * Get method for struct member 'toolsettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Default allocated now. </p>
	 * @see #__DNA__FIELD__toolsettings
	 */
	
	public CPointer<ToolSettings> getToolsettings() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 368);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ToolSettings.class};
		return new CPointer<ToolSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ToolSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'toolsettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Default allocated now. </p>
	 * @see #__DNA__FIELD__toolsettings
	 */
	
	public void setToolsettings(CPointer<ToolSettings> toolsettings) throws IOException
	{
		long __address = ((toolsettings == null) ? 0 : toolsettings.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 368, __address);
		} else {
			__io__block.writeLong(__io__address + 280, __address);
		}
	}

	/**
	 * Get method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public CPointer<Object> get_pad4() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 284);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public void set_pad4(CPointer<Object> _pad4) throws IOException
	{
		long __address = ((_pad4 == null) ? 0 : _pad4.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 376, __address);
		} else {
			__io__block.writeLong(__io__address + 284, __address);
		}
	}

	/**
	 * Get method for struct member 'safe_areas'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__safe_areas
	 */
	
	public DisplaySafeAreas getSafe_areas() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new DisplaySafeAreas(__io__address + 384, __io__block, __io__blockTable);
		} else {
			return new DisplaySafeAreas(__io__address + 288, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'safe_areas'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__safe_areas
	 */
	
	public void setSafe_areas(DisplaySafeAreas safe_areas) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 384;
		} else {
			__dna__offset = 288;
		}
		if (__io__equals(safe_areas, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, safe_areas)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, safe_areas);
		} else {
			__io__generic__copy( getSafe_areas(), safe_areas);
		}
	}

	/**
	 * Get method for struct member 'r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> migrate or replace? depends on some internal things... no, is on the right place (ton) </p>
	 * @see #__DNA__FIELD__r
	 */
	
	public RenderData getR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new RenderData(__io__address + 416, __io__block, __io__blockTable);
		} else {
			return new RenderData(__io__address + 320, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> migrate or replace? depends on some internal things... no, is on the right place (ton) </p>
	 * @see #__DNA__FIELD__r
	 */
	
	public void setR(RenderData r) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 416;
		} else {
			__dna__offset = 320;
		}
		if (__io__equals(r, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, r)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, r);
		} else {
			__io__generic__copy( getR(), r);
		}
	}

	/**
	 * Get method for struct member 'audio'.
	 * @see #__DNA__FIELD__audio
	 */
	
	public AudioData getAudio() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new AudioData(__io__address + 4728, __io__block, __io__blockTable);
		} else {
			return new AudioData(__io__address + 4540, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'audio'.
	 * @see #__DNA__FIELD__audio
	 */
	
	public void setAudio(AudioData audio) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4728;
		} else {
			__dna__offset = 4540;
		}
		if (__io__equals(audio, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, audio)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, audio);
		} else {
			__io__generic__copy( getAudio(), audio);
		}
	}

	/**
	 * Get method for struct member 'markers'.
	 * @see #__DNA__FIELD__markers
	 */
	
	public ListBase getMarkers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 4760, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 4572, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'markers'.
	 * @see #__DNA__FIELD__markers
	 */
	
	public void setMarkers(ListBase markers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4760;
		} else {
			__dna__offset = 4572;
		}
		if (__io__equals(markers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, markers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, markers);
		} else {
			__io__generic__copy( getMarkers(), markers);
		}
	}

	/**
	 * Get method for struct member 'transform_spaces'.
	 * @see #__DNA__FIELD__transform_spaces
	 */
	
	public ListBase getTransform_spaces() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 4776, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 4580, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'transform_spaces'.
	 * @see #__DNA__FIELD__transform_spaces
	 */
	
	public void setTransform_spaces(ListBase transform_spaces) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4776;
		} else {
			__dna__offset = 4580;
		}
		if (__io__equals(transform_spaces, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, transform_spaces)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, transform_spaces);
		} else {
			__io__generic__copy( getTransform_spaces(), transform_spaces);
		}
	}

	/**
	 * Get method for struct member 'orientation_slots'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> First is the [scene, translate, rotate, scale]. </p>
	 * @see #__DNA__FIELD__orientation_slots
	 */
	
	public CArrayFacade<TransformOrientationSlot> getOrientation_slots() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{TransformOrientationSlot.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<TransformOrientationSlot>(__io__address + 4792, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<TransformOrientationSlot>(__io__address + 4588, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'orientation_slots'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> First is the [scene, translate, rotate, scale]. </p>
	 * @see #__DNA__FIELD__orientation_slots
	 */
	
	public void setOrientation_slots(CArrayFacade<TransformOrientationSlot> orientation_slots) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4792;
		} else {
			__dna__offset = 4588;
		}
		if (__io__equals(orientation_slots, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, orientation_slots)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, orientation_slots);
		} else {
			__io__generic__copy( getOrientation_slots(), orientation_slots);
		}
	}

	/**
	 * Get method for struct member 'sound_scene'.
	 * @see #__DNA__FIELD__sound_scene
	 */
	
	public CPointer<Object> getSound_scene() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4856);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4652);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sound_scene'.
	 * @see #__DNA__FIELD__sound_scene
	 */
	
	public void setSound_scene(CPointer<Object> sound_scene) throws IOException
	{
		long __address = ((sound_scene == null) ? 0 : sound_scene.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4856, __address);
		} else {
			__io__block.writeLong(__io__address + 4652, __address);
		}
	}

	/**
	 * Get method for struct member 'playback_handle'.
	 * @see #__DNA__FIELD__playback_handle
	 */
	
	public CPointer<Object> getPlayback_handle() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4864);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4656);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'playback_handle'.
	 * @see #__DNA__FIELD__playback_handle
	 */
	
	public void setPlayback_handle(CPointer<Object> playback_handle) throws IOException
	{
		long __address = ((playback_handle == null) ? 0 : playback_handle.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4864, __address);
		} else {
			__io__block.writeLong(__io__address + 4656, __address);
		}
	}

	/**
	 * Get method for struct member 'sound_scrub_handle'.
	 * @see #__DNA__FIELD__sound_scrub_handle
	 */
	
	public CPointer<Object> getSound_scrub_handle() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4872);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4660);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sound_scrub_handle'.
	 * @see #__DNA__FIELD__sound_scrub_handle
	 */
	
	public void setSound_scrub_handle(CPointer<Object> sound_scrub_handle) throws IOException
	{
		long __address = ((sound_scrub_handle == null) ? 0 : sound_scrub_handle.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4872, __address);
		} else {
			__io__block.writeLong(__io__address + 4660, __address);
		}
	}

	/**
	 * Get method for struct member 'speaker_handles'.
	 * @see #__DNA__FIELD__speaker_handles
	 */
	
	public CPointer<Object> getSpeaker_handles() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4880);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4664);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'speaker_handles'.
	 * @see #__DNA__FIELD__speaker_handles
	 */
	
	public void setSpeaker_handles(CPointer<Object> speaker_handles) throws IOException
	{
		long __address = ((speaker_handles == null) ? 0 : speaker_handles.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4880, __address);
		} else {
			__io__block.writeLong(__io__address + 4664, __address);
		}
	}

	/**
	 * Get method for struct member 'fps_info'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> (runtime) info/cache used for presenting playback framerate info to the user. </p>
	 * @see #__DNA__FIELD__fps_info
	 */
	
	public CPointer<Object> getFps_info() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4888);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4668);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fps_info'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> (runtime) info/cache used for presenting playback framerate info to the user. </p>
	 * @see #__DNA__FIELD__fps_info
	 */
	
	public void setFps_info(CPointer<Object> fps_info) throws IOException
	{
		long __address = ((fps_info == null) ? 0 : fps_info.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4888, __address);
		} else {
			__io__block.writeLong(__io__address + 4668, __address);
		}
	}

	/**
	 * Get method for struct member 'depsgraph_hash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> None of the dependency graph vars is mean to be saved. </p>
	 * @see #__DNA__FIELD__depsgraph_hash
	 */
	
	public CPointer<Object> getDepsgraph_hash() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4896);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4672);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'depsgraph_hash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> None of the dependency graph vars is mean to be saved. </p>
	 * @see #__DNA__FIELD__depsgraph_hash
	 */
	
	public void setDepsgraph_hash(CPointer<Object> depsgraph_hash) throws IOException
	{
		long __address = ((depsgraph_hash == null) ? 0 : depsgraph_hash.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4896, __address);
		} else {
			__io__block.writeLong(__io__address + 4672, __address);
		}
	}

	/**
	 * Get method for struct member '_pad7'.
	 * @see #__DNA__FIELD___pad7
	 */
	
	public CArrayFacade<Byte> get_pad7() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 4904, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4676, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad7'.
	 * @see #__DNA__FIELD___pad7
	 */
	
	public void set_pad7(CArrayFacade<Byte> _pad7) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4904;
		} else {
			__dna__offset = 4676;
		}
		if (__io__equals(_pad7, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad7)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad7);
		} else {
			__io__generic__copy( get_pad7(), _pad7);
		}
	}

	/**
	 * Get method for struct member 'active_keyingset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> User-Defined KeyingSets Index of the active {@link KeyingSet} . first {@link KeyingSet}  has index 1, 'none' active is 0, 'add new' is -1 </p>
	 * @see #__DNA__FIELD__active_keyingset
	 */
	
	public int getActive_keyingset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4908);
		} else {
			return __io__block.readInt(__io__address + 4680);
		}
	}

	/**
	 * Set method for struct member 'active_keyingset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> User-Defined KeyingSets Index of the active {@link KeyingSet} . first {@link KeyingSet}  has index 1, 'none' active is 0, 'add new' is -1 </p>
	 * @see #__DNA__FIELD__active_keyingset
	 */
	
	public void setActive_keyingset(int active_keyingset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4908, active_keyingset);
		} else {
			__io__block.writeInt(__io__address + 4680, active_keyingset);
		}
	}

	/**
	 * Get method for struct member 'keyingsets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> s for this scene </p>
	 * @see #__DNA__FIELD__keyingsets
	 */
	
	public ListBase getKeyingsets() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 4912, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 4684, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keyingsets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> s for this scene </p>
	 * @see #__DNA__FIELD__keyingsets
	 */
	
	public void setKeyingsets(ListBase keyingsets) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4912;
		} else {
			__dna__offset = 4684;
		}
		if (__io__equals(keyingsets, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, keyingsets)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, keyingsets);
		} else {
			__io__generic__copy( getKeyingsets(), keyingsets);
		}
	}

	/**
	 * Get method for struct member 'unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Units </p>
	 * @see #__DNA__FIELD__unit
	 */
	
	public UnitSettings getUnit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new UnitSettings(__io__address + 4928, __io__block, __io__blockTable);
		} else {
			return new UnitSettings(__io__address + 4692, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Units </p>
	 * @see #__DNA__FIELD__unit
	 */
	
	public void setUnit(UnitSettings unit) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4928;
		} else {
			__dna__offset = 4692;
		}
		if (__io__equals(unit, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, unit)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, unit);
		} else {
			__io__generic__copy( getUnit(), unit);
		}
	}

	/**
	 * Get method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Grease Pencil - Annotations </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public CPointer<bGPdata> getGpd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4944);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4708);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPdata.class};
		return new CPointer<bGPdata>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPdata.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Grease Pencil - Annotations </p>
	 * @see #__DNA__FIELD__gpd
	 */
	
	public void setGpd(CPointer<bGPdata> gpd) throws IOException
	{
		long __address = ((gpd == null) ? 0 : gpd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4944, __address);
		} else {
			__io__block.writeLong(__io__address + 4708, __address);
		}
	}

	/**
	 * Get method for struct member 'clip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Movie Tracking Active movie clip. </p>
	 * @see #__DNA__FIELD__clip
	 */
	
	public CPointer<MovieClip> getClip() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4952);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4712);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieClip.class};
		return new CPointer<MovieClip>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieClip.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'clip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Movie Tracking Active movie clip. </p>
	 * @see #__DNA__FIELD__clip
	 */
	
	public void setClip(CPointer<MovieClip> clip) throws IOException
	{
		long __address = ((clip == null) ? 0 : clip.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4952, __address);
		} else {
			__io__block.writeLong(__io__address + 4712, __address);
		}
	}

	/**
	 * Get method for struct member 'physics_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Physics simulation settings </p>
	 * @see #__DNA__FIELD__physics_settings
	 */
	
	public PhysicsSettings getPhysics_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new PhysicsSettings(__io__address + 4960, __io__block, __io__blockTable);
		} else {
			return new PhysicsSettings(__io__address + 4716, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'physics_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Physics simulation settings </p>
	 * @see #__DNA__FIELD__physics_settings
	 */
	
	public void setPhysics_settings(PhysicsSettings physics_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4960;
		} else {
			__dna__offset = 4716;
		}
		if (__io__equals(physics_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, physics_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, physics_settings);
		} else {
			__io__generic__copy( getPhysics_settings(), physics_settings);
		}
	}

	/**
	 * Get method for struct member '_pad8'.
	 * @see #__DNA__FIELD___pad8
	 */
	
	public CPointer<Object> get_pad8() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4984);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4740);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad8'.
	 * @see #__DNA__FIELD___pad8
	 */
	
	public void set_pad8(CPointer<Object> _pad8) throws IOException
	{
		long __address = ((_pad8 == null) ? 0 : _pad8.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4984, __address);
		} else {
			__io__block.writeLong(__io__address + 4740, __address);
		}
	}

	/**
	 * Get method for struct member 'customdata_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX. runtime flag for drawing, actually belongs in the window, only used by BKE_object_handle_update() </p>
	 * @see #__DNA__FIELD__customdata_mask
	 */
	
	public CustomData_MeshMasks getCustomdata_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData_MeshMasks(__io__address + 4992, __io__block, __io__blockTable);
		} else {
			return new CustomData_MeshMasks(__io__address + 4744, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'customdata_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX. runtime flag for drawing, actually belongs in the window, only used by BKE_object_handle_update() </p>
	 * @see #__DNA__FIELD__customdata_mask
	 */
	
	public void setCustomdata_mask(CustomData_MeshMasks customdata_mask) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4992;
		} else {
			__dna__offset = 4744;
		}
		if (__io__equals(customdata_mask, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, customdata_mask)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, customdata_mask);
		} else {
			__io__generic__copy( getCustomdata_mask(), customdata_mask);
		}
	}

	/**
	 * Get method for struct member 'customdata_mask_modal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX. same as above but for temp operator use (gl renders) </p>
	 * @see #__DNA__FIELD__customdata_mask_modal
	 */
	
	public CustomData_MeshMasks getCustomdata_mask_modal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData_MeshMasks(__io__address + 5032, __io__block, __io__blockTable);
		} else {
			return new CustomData_MeshMasks(__io__address + 4784, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'customdata_mask_modal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> XXX. same as above but for temp operator use (gl renders) </p>
	 * @see #__DNA__FIELD__customdata_mask_modal
	 */
	
	public void setCustomdata_mask_modal(CustomData_MeshMasks customdata_mask_modal) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 5032;
		} else {
			__dna__offset = 4784;
		}
		if (__io__equals(customdata_mask_modal, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, customdata_mask_modal)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, customdata_mask_modal);
		} else {
			__io__generic__copy( getCustomdata_mask_modal(), customdata_mask_modal);
		}
	}

	/**
	 * Get method for struct member 'view_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Color management settings applied on image before saving
	 * <h4>Blender Source Code</h4>
	 * <p> Color Management </p>
	 * @see #__DNA__FIELD__view_settings
	 */
	
	public ColorManagedViewSettings getView_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorManagedViewSettings(__io__address + 5072, __io__block, __io__blockTable);
		} else {
			return new ColorManagedViewSettings(__io__address + 4824, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'view_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Color management settings applied on image before saving
	 * <h4>Blender Source Code</h4>
	 * <p> Color Management </p>
	 * @see #__DNA__FIELD__view_settings
	 */
	
	public void setView_settings(ColorManagedViewSettings view_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 5072;
		} else {
			__dna__offset = 4824;
		}
		if (__io__equals(view_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, view_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, view_settings);
		} else {
			__io__generic__copy( getView_settings(), view_settings);
		}
	}

	/**
	 * Get method for struct member 'display_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Settings of device saved image would be displayed on
	 * @see #__DNA__FIELD__display_settings
	 */
	
	public ColorManagedDisplaySettings getDisplay_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorManagedDisplaySettings(__io__address + 5232, __io__block, __io__blockTable);
		} else {
			return new ColorManagedDisplaySettings(__io__address + 4976, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'display_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Settings of device saved image would be displayed on
	 * @see #__DNA__FIELD__display_settings
	 */
	
	public void setDisplay_settings(ColorManagedDisplaySettings display_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 5232;
		} else {
			__dna__offset = 4976;
		}
		if (__io__equals(display_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, display_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, display_settings);
		} else {
			__io__generic__copy( getDisplay_settings(), display_settings);
		}
	}

	/**
	 * Get method for struct member 'sequencer_colorspace_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Settings of color space sequencer is working in
	 * @see #__DNA__FIELD__sequencer_colorspace_settings
	 */
	
	public ColorManagedColorspaceSettings getSequencer_colorspace_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorManagedColorspaceSettings(__io__address + 5296, __io__block, __io__blockTable);
		} else {
			return new ColorManagedColorspaceSettings(__io__address + 5040, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sequencer_colorspace_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Settings of color space sequencer is working in
	 * @see #__DNA__FIELD__sequencer_colorspace_settings
	 */
	
	public void setSequencer_colorspace_settings(ColorManagedColorspaceSettings sequencer_colorspace_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 5296;
		} else {
			__dna__offset = 5040;
		}
		if (__io__equals(sequencer_colorspace_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sequencer_colorspace_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sequencer_colorspace_settings);
		} else {
			__io__generic__copy( getSequencer_colorspace_settings(), sequencer_colorspace_settings);
		}
	}

	/**
	 * Get method for struct member 'rigidbody_world'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> RigidBody simulation world+settings </p>
	 * @see #__DNA__FIELD__rigidbody_world
	 */
	
	public CPointer<RigidBodyWorld> getRigidbody_world() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 5360);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 5104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{RigidBodyWorld.class};
		return new CPointer<RigidBodyWorld>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, RigidBodyWorld.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rigidbody_world'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * <h4>Blender Source Code</h4>
	 * <p> RigidBody simulation world+settings </p>
	 * @see #__DNA__FIELD__rigidbody_world
	 */
	
	public void setRigidbody_world(CPointer<RigidBodyWorld> rigidbody_world) throws IOException
	{
		long __address = ((rigidbody_world == null) ? 0 : rigidbody_world.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 5360, __address);
		} else {
			__io__block.writeLong(__io__address + 5104, __address);
		}
	}

	/**
	 * Get method for struct member 'preview'.
	 * @see #__DNA__FIELD__preview
	 */
	
	public CPointer<PreviewImage> getPreview() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 5368);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 5108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PreviewImage.class};
		return new CPointer<PreviewImage>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PreviewImage.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'preview'.
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(CPointer<PreviewImage> preview) throws IOException
	{
		long __address = ((preview == null) ? 0 : preview.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 5368, __address);
		} else {
			__io__block.writeLong(__io__address + 5108, __address);
		}
	}

	/**
	 * Get method for struct member 'view_layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__view_layers
	 */
	
	public ListBase getView_layers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 5376, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 5112, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'view_layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__view_layers
	 */
	
	public void setView_layers(ListBase view_layers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 5376;
		} else {
			__dna__offset = 5112;
		}
		if (__io__equals(view_layers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, view_layers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, view_layers);
		} else {
			__io__generic__copy( getView_layers(), view_layers);
		}
	}

	/**
	 * Get method for struct member 'master_collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Not an actual datablock, but memory owned by scene. </p>
	 * @see #__DNA__FIELD__master_collection
	 */
	
	public CPointer<Collection> getMaster_collection() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 5392);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 5120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'master_collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Not an actual datablock, but memory owned by scene. </p>
	 * @see #__DNA__FIELD__master_collection
	 */
	
	public void setMaster_collection(CPointer<Collection> master_collection) throws IOException
	{
		long __address = ((master_collection == null) ? 0 : master_collection.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 5392, __address);
		} else {
			__io__block.writeLong(__io__address + 5120, __address);
		}
	}

	/**
	 * Get method for struct member 'collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Scene root collection that owns all the objects and other collections instantiated in the scene
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__collection
	 */
	
	public CPointer<SceneCollection> getCollection() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 5400);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 5124);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SceneCollection.class};
		return new CPointer<SceneCollection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SceneCollection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Scene root collection that owns all the objects and other collections instantiated in the scene
	 * <h4>Blender Source Code</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__collection
	 */
	
	public void setCollection(CPointer<SceneCollection> collection) throws IOException
	{
		long __address = ((collection == null) ? 0 : collection.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 5400, __address);
		} else {
			__io__block.writeLong(__io__address + 5124, __address);
		}
	}

	/**
	 * Get method for struct member 'layer_properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Settings to be override by workspaces. </p>
	 * @see #__DNA__FIELD__layer_properties
	 */
	
	public CPointer<IDProperty> getLayer_properties() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 5408);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 5128);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'layer_properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Settings to be override by workspaces. </p>
	 * @see #__DNA__FIELD__layer_properties
	 */
	
	public void setLayer_properties(CPointer<IDProperty> layer_properties) throws IOException
	{
		long __address = ((layer_properties == null) ? 0 : layer_properties.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 5408, __address);
		} else {
			__io__block.writeLong(__io__address + 5128, __address);
		}
	}

	/**
	 * Get method for struct member '_pad9'.
	 * @see #__DNA__FIELD___pad9
	 */
	
	public CPointer<Object> get_pad9() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 5416);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 5132);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad9'.
	 * @see #__DNA__FIELD___pad9
	 */
	
	public void set_pad9(CPointer<Object> _pad9) throws IOException
	{
		long __address = ((_pad9 == null) ? 0 : _pad9.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 5416, __address);
		} else {
			__io__block.writeLong(__io__address + 5132, __address);
		}
	}

	/**
	 * Get method for struct member 'display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Scene display settings for 3D viewport
	 * @see #__DNA__FIELD__display
	 */
	
	public SceneDisplay getDisplay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new SceneDisplay(__io__address + 5424, __io__block, __io__blockTable);
		} else {
			return new SceneDisplay(__io__address + 5136, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Scene display settings for 3D viewport
	 * @see #__DNA__FIELD__display
	 */
	
	public void setDisplay(SceneDisplay display) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 5424;
		} else {
			__dna__offset = 5136;
		}
		if (__io__equals(display, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, display)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, display);
		} else {
			__io__generic__copy( getDisplay(), display);
		}
	}

	/**
	 * Get method for struct member 'eevee'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Eevee settings for the scene
	 * @see #__DNA__FIELD__eevee
	 */
	
	public SceneEEVEE getEevee() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new SceneEEVEE(__io__address + 6408, __io__block, __io__blockTable);
		} else {
			return new SceneEEVEE(__io__address + 6112, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'eevee'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Eevee settings for the scene
	 * @see #__DNA__FIELD__eevee
	 */
	
	public void setEevee(SceneEEVEE eevee) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 6408;
		} else {
			__dna__offset = 6112;
		}
		if (__io__equals(eevee, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, eevee)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, eevee);
		} else {
			__io__generic__copy( getEevee(), eevee);
		}
	}

	/**
	 * Get method for struct member 'grease_pencil_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Grease Pencil settings for the scene
	 * @see #__DNA__FIELD__grease_pencil_settings
	 */
	
	public SceneGpencil getGrease_pencil_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new SceneGpencil(__io__address + 6696, __io__block, __io__blockTable);
		} else {
			return new SceneGpencil(__io__address + 6392, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'grease_pencil_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Grease Pencil settings for the scene
	 * @see #__DNA__FIELD__grease_pencil_settings
	 */
	
	public void setGrease_pencil_settings(SceneGpencil grease_pencil_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 6696;
		} else {
			__dna__offset = 6392;
		}
		if (__io__equals(grease_pencil_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, grease_pencil_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, grease_pencil_settings);
		} else {
			__io__generic__copy( getGrease_pencil_settings(), grease_pencil_settings);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Scene> __io__addressof() {
		return new CPointer<Scene>(__io__address, new Class[]{Scene.class}, __io__block, __io__blockTable);
	}

}
