package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
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

@CMetaData(size32=4872, size64=5072)
public class Scene extends CFacade {

	/**
	 * This is the sdna index of the struct Scene.
	 * <p>
	 * It is required when allocating a new block to store data for Scene.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 196;

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
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
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
	public static final long[] __DNA__FIELD__adt = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'camera'.
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
	public static final long[] __DNA__FIELD__camera = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'world'.
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
	public static final long[] __DNA__FIELD__world = new long[]{108, 136};

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
	public static final long[] __DNA__FIELD__set = new long[]{112, 144};

	/**
	 * Field descriptor (offset) for struct member 'base'.
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
	public static final long[] __DNA__FIELD__base = new long[]{116, 152};

	/**
	 * Field descriptor (offset) for struct member 'basact'.
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
	public static final long[] __DNA__FIELD__basact = new long[]{124, 168};

	/**
	 * Field descriptor (offset) for struct member 'obedit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__obedit);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_obedit = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'obedit'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__obedit = new long[]{128, 176};

	/**
	 * Field descriptor (offset) for struct member 'cursor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__cursor);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_cursor = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cursor'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cursor = new long[]{132, 184};

	/**
	 * Field descriptor (offset) for struct member 'twcent'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__twcent);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_twcent = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'twcent'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__twcent = new long[]{144, 196};

	/**
	 * Field descriptor (offset) for struct member 'twmin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__twmin);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_twmin = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'twmin'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__twmin = new long[]{156, 208};

	/**
	 * Field descriptor (offset) for struct member 'twmax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__twmax);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_twmax = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'twmax'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__twmax = new long[]{168, 220};

	/**
	 * Field descriptor (offset) for struct member 'lay'.
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
	public static final long[] __DNA__FIELD__lay = new long[]{180, 232};

	/**
	 * Field descriptor (offset) for struct member 'layact'.
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
	public static final long[] __DNA__FIELD__layact = new long[]{184, 236};

	/**
	 * Field descriptor (offset) for struct member 'lay_updated'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__lay_updated);
	 * CPointer&lt;Integer&gt; p_lay_updated = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lay_updated'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lay_updated = new long[]{188, 240};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
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
	public static final long[] __DNA__FIELD__flag = new long[]{192, 244};

	/**
	 * Field descriptor (offset) for struct member 'use_nodes'.
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
	public static final long[] __DNA__FIELD__use_nodes = new long[]{194, 246};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{195, 247};

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
	public static final long[] __DNA__FIELD__nodetree = new long[]{196, 248};

	/**
	 * Field descriptor (offset) for struct member 'ed'.
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
	public static final long[] __DNA__FIELD__ed = new long[]{200, 256};

	/**
	 * Field descriptor (offset) for struct member 'toolsettings'.
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
	public static final long[] __DNA__FIELD__toolsettings = new long[]{204, 264};

	/**
	 * Field descriptor (offset) for struct member 'stats'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__stats);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_stats = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stats'</li>
	 * <li>Signature: 'SceneStats*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stats = new long[]{208, 272};

	/**
	 * Field descriptor (offset) for struct member 'safe_areas'.
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
	public static final long[] __DNA__FIELD__safe_areas = new long[]{212, 280};

	/**
	 * Field descriptor (offset) for struct member 'r'.
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
	 * <li>Actual Size (32bit/64bit): 3984/4032</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__r = new long[]{244, 312};

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
	public static final long[] __DNA__FIELD__audio = new long[]{4228, 4344};

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
	public static final long[] __DNA__FIELD__markers = new long[]{4260, 4376};

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
	public static final long[] __DNA__FIELD__transform_spaces = new long[]{4268, 4392};

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
	public static final long[] __DNA__FIELD__sound_scene = new long[]{4276, 4408};

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
	public static final long[] __DNA__FIELD__playback_handle = new long[]{4280, 4416};

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
	public static final long[] __DNA__FIELD__sound_scrub_handle = new long[]{4284, 4424};

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
	public static final long[] __DNA__FIELD__speaker_handles = new long[]{4288, 4432};

	/**
	 * Field descriptor (offset) for struct member 'fps_info'.
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
	public static final long[] __DNA__FIELD__fps_info = new long[]{4292, 4440};

	/**
	 * Field descriptor (offset) for struct member 'depsgraph'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__depsgraph);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_depsgraph = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'depsgraph'</li>
	 * <li>Signature: 'Depsgraph*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__depsgraph = new long[]{4296, 4448};

	/**
	 * Field descriptor (offset) for struct member 'pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__pad1);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_pad1 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad1'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad1 = new long[]{4300, 4456};

	/**
	 * Field descriptor (offset) for struct member 'theDag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__theDag);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_theDag = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'theDag'</li>
	 * <li>Signature: 'DagForest*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__theDag = new long[]{4304, 4464};

	/**
	 * Field descriptor (offset) for struct member 'dagflags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__dagflags);
	 * CPointer&lt;Short&gt; p_dagflags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dagflags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dagflags = new long[]{4308, 4472};

	/**
	 * Field descriptor (offset) for struct member 'recalc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__recalc);
	 * CPointer&lt;Short&gt; p_recalc = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'recalc'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__recalc = new long[]{4310, 4474};

	/**
	 * Field descriptor (offset) for struct member 'active_keyingset'.
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
	public static final long[] __DNA__FIELD__active_keyingset = new long[]{4312, 4476};

	/**
	 * Field descriptor (offset) for struct member 'keyingsets'.
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
	public static final long[] __DNA__FIELD__keyingsets = new long[]{4316, 4480};

	/**
	 * Field descriptor (offset) for struct member 'framing'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__framing);
	 * CPointer&lt;GameFraming&gt; p_framing = p.cast(new Class[]{GameFraming.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'framing'</li>
	 * <li>Signature: 'GameFraming'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__framing = new long[]{4324, 4496};

	/**
	 * Field descriptor (offset) for struct member 'gm'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__gm);
	 * CPointer&lt;GameData&gt; p_gm = p.cast(new Class[]{GameData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gm'</li>
	 * <li>Signature: 'GameData'</li>
	 * <li>Actual Size (32bit/64bit): 188/192</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gm = new long[]{4340, 4512};

	/**
	 * Field descriptor (offset) for struct member 'unit'.
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
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__unit = new long[]{4528, 4704};

	/**
	 * Field descriptor (offset) for struct member 'gpd'.
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
	public static final long[] __DNA__FIELD__gpd = new long[]{4536, 4712};

	/**
	 * Field descriptor (offset) for struct member 'physics_settings'.
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
	public static final long[] __DNA__FIELD__physics_settings = new long[]{4540, 4720};

	/**
	 * Field descriptor (offset) for struct member 'clip'.
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
	public static final long[] __DNA__FIELD__clip = new long[]{4564, 4744};

	/**
	 * Field descriptor (offset) for struct member 'customdata_mask'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__customdata_mask);
	 * CPointer&lt;int64&gt; p_customdata_mask = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'customdata_mask'</li>
	 * <li>Signature: 'uint64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__customdata_mask = new long[]{4568, 4752};

	/**
	 * Field descriptor (offset) for struct member 'customdata_mask_modal'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Scene scene = ...;
	 * CPointer&lt;Object&gt; p = scene.__dna__addressof(Scene.__DNA__FIELD__customdata_mask_modal);
	 * CPointer&lt;int64&gt; p_customdata_mask_modal = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'customdata_mask_modal'</li>
	 * <li>Signature: 'uint64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__customdata_mask_modal = new long[]{4576, 4760};

	/**
	 * Field descriptor (offset) for struct member 'view_settings'.
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
	public static final long[] __DNA__FIELD__view_settings = new long[]{4584, 4768};

	/**
	 * Field descriptor (offset) for struct member 'display_settings'.
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
	public static final long[] __DNA__FIELD__display_settings = new long[]{4736, 4928};

	/**
	 * Field descriptor (offset) for struct member 'sequencer_colorspace_settings'.
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
	public static final long[] __DNA__FIELD__sequencer_colorspace_settings = new long[]{4800, 4992};

	/**
	 * Field descriptor (offset) for struct member 'rigidbody_world'.
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
	public static final long[] __DNA__FIELD__rigidbody_world = new long[]{4864, 5056};

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
	public static final long[] __DNA__FIELD__preview = new long[]{4868, 5064};

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
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'camera'.
	 * @see #__DNA__FIELD__camera
	 */
	
	public CPointer<BlenderObject> getCamera() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'camera'.
	 * @see #__DNA__FIELD__camera
	 */
	
	public void setCamera(CPointer<BlenderObject> camera) throws IOException
	{
		long __address = ((camera == null) ? 0 : camera.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'world'.
	 * @see #__DNA__FIELD__world
	 */
	
	public CPointer<World> getWorld() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{World.class};
		return new CPointer<World>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, World.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'world'.
	 * @see #__DNA__FIELD__world
	 */
	
	public void setWorld(CPointer<World> world) throws IOException
	{
		long __address = ((world == null) ? 0 : world.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
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
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public ListBase getBase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 152, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 116, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public void setBase(ListBase base) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 116;
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
	 * @see #__DNA__FIELD__basact
	 */
	
	public CPointer<Base> getBasact() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 124);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Base.class};
		return new CPointer<Base>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Base.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'basact'.
	 * @see #__DNA__FIELD__basact
	 */
	
	public void setBasact(CPointer<Base> basact) throws IOException
	{
		long __address = ((basact == null) ? 0 : basact.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 168, __address);
		} else {
			__io__block.writeLong(__io__address + 124, __address);
		}
	}

	/**
	 * Get method for struct member 'obedit'.
	 * @see #__DNA__FIELD__obedit
	 */
	
	public CPointer<BlenderObject> getObedit() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'obedit'.
	 * @see #__DNA__FIELD__obedit
	 */
	
	public void setObedit(CPointer<BlenderObject> obedit) throws IOException
	{
		long __address = ((obedit == null) ? 0 : obedit.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 128, __address);
		}
	}

	/**
	 * Get method for struct member 'cursor'.
	 * @see #__DNA__FIELD__cursor
	 */
	
	public CArrayFacade<Float> getCursor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cursor'.
	 * @see #__DNA__FIELD__cursor
	 */
	
	public void setCursor(CArrayFacade<Float> cursor) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 132;
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
	 * Get method for struct member 'twcent'.
	 * @see #__DNA__FIELD__twcent
	 */
	
	public CArrayFacade<Float> getTwcent() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'twcent'.
	 * @see #__DNA__FIELD__twcent
	 */
	
	public void setTwcent(CArrayFacade<Float> twcent) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 196;
		} else {
			__dna__offset = 144;
		}
		if (__io__equals(twcent, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, twcent)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, twcent);
		} else {
			__io__generic__copy( getTwcent(), twcent);
		}
	}

	/**
	 * Get method for struct member 'twmin'.
	 * @see #__DNA__FIELD__twmin
	 */
	
	public CArrayFacade<Float> getTwmin() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 208, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'twmin'.
	 * @see #__DNA__FIELD__twmin
	 */
	
	public void setTwmin(CArrayFacade<Float> twmin) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(twmin, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, twmin)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, twmin);
		} else {
			__io__generic__copy( getTwmin(), twmin);
		}
	}

	/**
	 * Get method for struct member 'twmax'.
	 * @see #__DNA__FIELD__twmax
	 */
	
	public CArrayFacade<Float> getTwmax() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 220, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'twmax'.
	 * @see #__DNA__FIELD__twmax
	 */
	
	public void setTwmax(CArrayFacade<Float> twmax) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 220;
		} else {
			__dna__offset = 168;
		}
		if (__io__equals(twmax, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, twmax)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, twmax);
		} else {
			__io__generic__copy( getTwmax(), twmax);
		}
	}

	/**
	 * Get method for struct member 'lay'.
	 * @see #__DNA__FIELD__lay
	 */
	
	public int getLay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 232);
		} else {
			return __io__block.readInt(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'lay'.
	 * @see #__DNA__FIELD__lay
	 */
	
	public void setLay(int lay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 232, lay);
		} else {
			__io__block.writeInt(__io__address + 180, lay);
		}
	}

	/**
	 * Get method for struct member 'layact'.
	 * @see #__DNA__FIELD__layact
	 */
	
	public int getLayact() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 236);
		} else {
			return __io__block.readInt(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'layact'.
	 * @see #__DNA__FIELD__layact
	 */
	
	public void setLayact(int layact) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 236, layact);
		} else {
			__io__block.writeInt(__io__address + 184, layact);
		}
	}

	/**
	 * Get method for struct member 'lay_updated'.
	 * @see #__DNA__FIELD__lay_updated
	 */
	
	public int getLay_updated() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 240);
		} else {
			return __io__block.readInt(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'lay_updated'.
	 * @see #__DNA__FIELD__lay_updated
	 */
	
	public void setLay_updated(int lay_updated) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 240, lay_updated);
		} else {
			__io__block.writeInt(__io__address + 188, lay_updated);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 244);
		} else {
			return __io__block.readShort(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 244, flag);
		} else {
			__io__block.writeShort(__io__address + 192, flag);
		}
	}

	/**
	 * Get method for struct member 'use_nodes'.
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public byte getUse_nodes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 246);
		} else {
			return __io__block.readByte(__io__address + 194);
		}
	}

	/**
	 * Set method for struct member 'use_nodes'.
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public void setUse_nodes(byte use_nodes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 246, use_nodes);
		} else {
			__io__block.writeByte(__io__address + 194, use_nodes);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Byte> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 247, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 195, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Byte> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 247;
		} else {
			__dna__offset = 195;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 196);
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
			__io__block.writeLong(__io__address + 248, __address);
		} else {
			__io__block.writeLong(__io__address + 196, __address);
		}
	}

	/**
	 * Get method for struct member 'ed'.
	 * @see #__DNA__FIELD__ed
	 */
	
	public CPointer<Editing> getEd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Editing.class};
		return new CPointer<Editing>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Editing.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ed'.
	 * @see #__DNA__FIELD__ed
	 */
	
	public void setEd(CPointer<Editing> ed) throws IOException
	{
		long __address = ((ed == null) ? 0 : ed.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 256, __address);
		} else {
			__io__block.writeLong(__io__address + 200, __address);
		}
	}

	/**
	 * Get method for struct member 'toolsettings'.
	 * @see #__DNA__FIELD__toolsettings
	 */
	
	public CPointer<ToolSettings> getToolsettings() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 264);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 204);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ToolSettings.class};
		return new CPointer<ToolSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ToolSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'toolsettings'.
	 * @see #__DNA__FIELD__toolsettings
	 */
	
	public void setToolsettings(CPointer<ToolSettings> toolsettings) throws IOException
	{
		long __address = ((toolsettings == null) ? 0 : toolsettings.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 264, __address);
		} else {
			__io__block.writeLong(__io__address + 204, __address);
		}
	}

	/**
	 * Get method for struct member 'stats'.
	 * @see #__DNA__FIELD__stats
	 */
	
	public CPointer<Object> getStats() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'stats'.
	 * @see #__DNA__FIELD__stats
	 */
	
	public void setStats(CPointer<Object> stats) throws IOException
	{
		long __address = ((stats == null) ? 0 : stats.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 272, __address);
		} else {
			__io__block.writeLong(__io__address + 208, __address);
		}
	}

	/**
	 * Get method for struct member 'safe_areas'.
	 * @see #__DNA__FIELD__safe_areas
	 */
	
	public DisplaySafeAreas getSafe_areas() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new DisplaySafeAreas(__io__address + 280, __io__block, __io__blockTable);
		} else {
			return new DisplaySafeAreas(__io__address + 212, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'safe_areas'.
	 * @see #__DNA__FIELD__safe_areas
	 */
	
	public void setSafe_areas(DisplaySafeAreas safe_areas) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 280;
		} else {
			__dna__offset = 212;
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
	 * @see #__DNA__FIELD__r
	 */
	
	public RenderData getR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new RenderData(__io__address + 312, __io__block, __io__blockTable);
		} else {
			return new RenderData(__io__address + 244, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public void setR(RenderData r) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 312;
		} else {
			__dna__offset = 244;
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
			return new AudioData(__io__address + 4344, __io__block, __io__blockTable);
		} else {
			return new AudioData(__io__address + 4228, __io__block, __io__blockTable);
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
			__dna__offset = 4344;
		} else {
			__dna__offset = 4228;
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
			return new ListBase(__io__address + 4376, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 4260, __io__block, __io__blockTable);
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
			__dna__offset = 4376;
		} else {
			__dna__offset = 4260;
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
			return new ListBase(__io__address + 4392, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 4268, __io__block, __io__blockTable);
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
			__dna__offset = 4392;
		} else {
			__dna__offset = 4268;
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
	 * Get method for struct member 'sound_scene'.
	 * @see #__DNA__FIELD__sound_scene
	 */
	
	public CPointer<Object> getSound_scene() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4408);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4276);
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
			__io__block.writeLong(__io__address + 4408, __address);
		} else {
			__io__block.writeLong(__io__address + 4276, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 4416);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4280);
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
			__io__block.writeLong(__io__address + 4416, __address);
		} else {
			__io__block.writeLong(__io__address + 4280, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 4424);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4284);
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
			__io__block.writeLong(__io__address + 4424, __address);
		} else {
			__io__block.writeLong(__io__address + 4284, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 4432);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4288);
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
			__io__block.writeLong(__io__address + 4432, __address);
		} else {
			__io__block.writeLong(__io__address + 4288, __address);
		}
	}

	/**
	 * Get method for struct member 'fps_info'.
	 * @see #__DNA__FIELD__fps_info
	 */
	
	public CPointer<Object> getFps_info() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4440);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4292);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fps_info'.
	 * @see #__DNA__FIELD__fps_info
	 */
	
	public void setFps_info(CPointer<Object> fps_info) throws IOException
	{
		long __address = ((fps_info == null) ? 0 : fps_info.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4440, __address);
		} else {
			__io__block.writeLong(__io__address + 4292, __address);
		}
	}

	/**
	 * Get method for struct member 'depsgraph'.
	 * @see #__DNA__FIELD__depsgraph
	 */
	
	public CPointer<Object> getDepsgraph() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4448);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4296);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'depsgraph'.
	 * @see #__DNA__FIELD__depsgraph
	 */
	
	public void setDepsgraph(CPointer<Object> depsgraph) throws IOException
	{
		long __address = ((depsgraph == null) ? 0 : depsgraph.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4448, __address);
		} else {
			__io__block.writeLong(__io__address + 4296, __address);
		}
	}

	/**
	 * Get method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public CPointer<Object> getPad1() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4456);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4300);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public void setPad1(CPointer<Object> pad1) throws IOException
	{
		long __address = ((pad1 == null) ? 0 : pad1.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4456, __address);
		} else {
			__io__block.writeLong(__io__address + 4300, __address);
		}
	}

	/**
	 * Get method for struct member 'theDag'.
	 * @see #__DNA__FIELD__theDag
	 */
	
	public CPointer<Object> getTheDag() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4464);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4304);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'theDag'.
	 * @see #__DNA__FIELD__theDag
	 */
	
	public void setTheDag(CPointer<Object> theDag) throws IOException
	{
		long __address = ((theDag == null) ? 0 : theDag.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4464, __address);
		} else {
			__io__block.writeLong(__io__address + 4304, __address);
		}
	}

	/**
	 * Get method for struct member 'dagflags'.
	 * @see #__DNA__FIELD__dagflags
	 */
	
	public short getDagflags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4472);
		} else {
			return __io__block.readShort(__io__address + 4308);
		}
	}

	/**
	 * Set method for struct member 'dagflags'.
	 * @see #__DNA__FIELD__dagflags
	 */
	
	public void setDagflags(short dagflags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4472, dagflags);
		} else {
			__io__block.writeShort(__io__address + 4308, dagflags);
		}
	}

	/**
	 * Get method for struct member 'recalc'.
	 * @see #__DNA__FIELD__recalc
	 */
	
	public short getRecalc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4474);
		} else {
			return __io__block.readShort(__io__address + 4310);
		}
	}

	/**
	 * Set method for struct member 'recalc'.
	 * @see #__DNA__FIELD__recalc
	 */
	
	public void setRecalc(short recalc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4474, recalc);
		} else {
			__io__block.writeShort(__io__address + 4310, recalc);
		}
	}

	/**
	 * Get method for struct member 'active_keyingset'.
	 * @see #__DNA__FIELD__active_keyingset
	 */
	
	public int getActive_keyingset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4476);
		} else {
			return __io__block.readInt(__io__address + 4312);
		}
	}

	/**
	 * Set method for struct member 'active_keyingset'.
	 * @see #__DNA__FIELD__active_keyingset
	 */
	
	public void setActive_keyingset(int active_keyingset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4476, active_keyingset);
		} else {
			__io__block.writeInt(__io__address + 4312, active_keyingset);
		}
	}

	/**
	 * Get method for struct member 'keyingsets'.
	 * @see #__DNA__FIELD__keyingsets
	 */
	
	public ListBase getKeyingsets() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 4480, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 4316, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keyingsets'.
	 * @see #__DNA__FIELD__keyingsets
	 */
	
	public void setKeyingsets(ListBase keyingsets) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4480;
		} else {
			__dna__offset = 4316;
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
	 * Get method for struct member 'framing'.
	 * @see #__DNA__FIELD__framing
	 */
	
	public GameFraming getFraming() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GameFraming(__io__address + 4496, __io__block, __io__blockTable);
		} else {
			return new GameFraming(__io__address + 4324, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'framing'.
	 * @see #__DNA__FIELD__framing
	 */
	
	public void setFraming(GameFraming framing) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4496;
		} else {
			__dna__offset = 4324;
		}
		if (__io__equals(framing, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, framing)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, framing);
		} else {
			__io__generic__copy( getFraming(), framing);
		}
	}

	/**
	 * Get method for struct member 'gm'.
	 * @see #__DNA__FIELD__gm
	 */
	
	public GameData getGm() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GameData(__io__address + 4512, __io__block, __io__blockTable);
		} else {
			return new GameData(__io__address + 4340, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gm'.
	 * @see #__DNA__FIELD__gm
	 */
	
	public void setGm(GameData gm) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4512;
		} else {
			__dna__offset = 4340;
		}
		if (__io__equals(gm, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gm)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gm);
		} else {
			__io__generic__copy( getGm(), gm);
		}
	}

	/**
	 * Get method for struct member 'unit'.
	 * @see #__DNA__FIELD__unit
	 */
	
	public UnitSettings getUnit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new UnitSettings(__io__address + 4704, __io__block, __io__blockTable);
		} else {
			return new UnitSettings(__io__address + 4528, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'unit'.
	 * @see #__DNA__FIELD__unit
	 */
	
	public void setUnit(UnitSettings unit) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4704;
		} else {
			__dna__offset = 4528;
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
	 * @see #__DNA__FIELD__gpd
	 */
	
	public CPointer<bGPdata> getGpd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4712);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4536);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPdata.class};
		return new CPointer<bGPdata>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPdata.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpd'.
	 * @see #__DNA__FIELD__gpd
	 */
	
	public void setGpd(CPointer<bGPdata> gpd) throws IOException
	{
		long __address = ((gpd == null) ? 0 : gpd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4712, __address);
		} else {
			__io__block.writeLong(__io__address + 4536, __address);
		}
	}

	/**
	 * Get method for struct member 'physics_settings'.
	 * @see #__DNA__FIELD__physics_settings
	 */
	
	public PhysicsSettings getPhysics_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new PhysicsSettings(__io__address + 4720, __io__block, __io__blockTable);
		} else {
			return new PhysicsSettings(__io__address + 4540, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'physics_settings'.
	 * @see #__DNA__FIELD__physics_settings
	 */
	
	public void setPhysics_settings(PhysicsSettings physics_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4720;
		} else {
			__dna__offset = 4540;
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
	 * Get method for struct member 'clip'.
	 * @see #__DNA__FIELD__clip
	 */
	
	public CPointer<MovieClip> getClip() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 4744);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4564);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieClip.class};
		return new CPointer<MovieClip>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieClip.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'clip'.
	 * @see #__DNA__FIELD__clip
	 */
	
	public void setClip(CPointer<MovieClip> clip) throws IOException
	{
		long __address = ((clip == null) ? 0 : clip.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 4744, __address);
		} else {
			__io__block.writeLong(__io__address + 4564, __address);
		}
	}

	/**
	 * Get method for struct member 'customdata_mask'.
	 * @see #__DNA__FIELD__customdata_mask
	 */
	
	public long getCustomdata_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 4752);
		} else {
			return __io__block.readInt64(__io__address + 4568);
		}
	}

	/**
	 * Set method for struct member 'customdata_mask'.
	 * @see #__DNA__FIELD__customdata_mask
	 */
	
	public void setCustomdata_mask(long customdata_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 4752, customdata_mask);
		} else {
			__io__block.writeInt64(__io__address + 4568, customdata_mask);
		}
	}

	/**
	 * Get method for struct member 'customdata_mask_modal'.
	 * @see #__DNA__FIELD__customdata_mask_modal
	 */
	
	public long getCustomdata_mask_modal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 4760);
		} else {
			return __io__block.readInt64(__io__address + 4576);
		}
	}

	/**
	 * Set method for struct member 'customdata_mask_modal'.
	 * @see #__DNA__FIELD__customdata_mask_modal
	 */
	
	public void setCustomdata_mask_modal(long customdata_mask_modal) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 4760, customdata_mask_modal);
		} else {
			__io__block.writeInt64(__io__address + 4576, customdata_mask_modal);
		}
	}

	/**
	 * Get method for struct member 'view_settings'.
	 * @see #__DNA__FIELD__view_settings
	 */
	
	public ColorManagedViewSettings getView_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorManagedViewSettings(__io__address + 4768, __io__block, __io__blockTable);
		} else {
			return new ColorManagedViewSettings(__io__address + 4584, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'view_settings'.
	 * @see #__DNA__FIELD__view_settings
	 */
	
	public void setView_settings(ColorManagedViewSettings view_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4768;
		} else {
			__dna__offset = 4584;
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
	 * @see #__DNA__FIELD__display_settings
	 */
	
	public ColorManagedDisplaySettings getDisplay_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorManagedDisplaySettings(__io__address + 4928, __io__block, __io__blockTable);
		} else {
			return new ColorManagedDisplaySettings(__io__address + 4736, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'display_settings'.
	 * @see #__DNA__FIELD__display_settings
	 */
	
	public void setDisplay_settings(ColorManagedDisplaySettings display_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4928;
		} else {
			__dna__offset = 4736;
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
	 * @see #__DNA__FIELD__sequencer_colorspace_settings
	 */
	
	public ColorManagedColorspaceSettings getSequencer_colorspace_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorManagedColorspaceSettings(__io__address + 4992, __io__block, __io__blockTable);
		} else {
			return new ColorManagedColorspaceSettings(__io__address + 4800, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sequencer_colorspace_settings'.
	 * @see #__DNA__FIELD__sequencer_colorspace_settings
	 */
	
	public void setSequencer_colorspace_settings(ColorManagedColorspaceSettings sequencer_colorspace_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4992;
		} else {
			__dna__offset = 4800;
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
	 * @see #__DNA__FIELD__rigidbody_world
	 */
	
	public CPointer<RigidBodyWorld> getRigidbody_world() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 5056);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4864);
		}
		Class<?>[] __dna__targetTypes = new Class[]{RigidBodyWorld.class};
		return new CPointer<RigidBodyWorld>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, RigidBodyWorld.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rigidbody_world'.
	 * @see #__DNA__FIELD__rigidbody_world
	 */
	
	public void setRigidbody_world(CPointer<RigidBodyWorld> rigidbody_world) throws IOException
	{
		long __address = ((rigidbody_world == null) ? 0 : rigidbody_world.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 5056, __address);
		} else {
			__io__block.writeLong(__io__address + 4864, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 5064);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4868);
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
			__io__block.writeLong(__io__address + 5064, __address);
		} else {
			__io__block.writeLong(__io__address + 4868, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Scene> __io__addressof() {
		return new CPointer<Scene>(__io__address, new Class[]{Scene.class}, __io__block, __io__blockTable);
	}

}
