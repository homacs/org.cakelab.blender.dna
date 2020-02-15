package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Material'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=256, size64=320)
public class Material extends CFacade {

	/**
	 * This is the sdna index of the struct Material.
	 * <p>
	 * It is required when allocating a new block to store data for Material.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 50;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 120/152</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__adt);
	 * CPointer&lt;CPointer&lt;AnimData&gt;&gt; p_adt = p.cast(new Class[]{CPointer.class, AnimData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adt'</li>
	 * <li>Signature: 'AnimData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adt = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{126, 162};

	/**
	 * Field descriptor (offset) for struct member 'r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Colors from Blender Internal that we are still using. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__r);
	 * CPointer&lt;Float&gt; p_r = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'r'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__r = new long[]{128, 164};

	/**
	 * Field descriptor (offset) for struct member 'g'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__g);
	 * CPointer&lt;Float&gt; p_g = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'g'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__g = new long[]{132, 168};

	/**
	 * Field descriptor (offset) for struct member 'b'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__b);
	 * CPointer&lt;Float&gt; p_b = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'b'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__b = new long[]{136, 172};

	/**
	 * Field descriptor (offset) for struct member 'a'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__a);
	 * CPointer&lt;Float&gt; p_a = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'a'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__a = new long[]{140, 176};

	/**
	 * Field descriptor (offset) for struct member 'specr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__specr);
	 * CPointer&lt;Float&gt; p_specr = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'specr'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__specr = new long[]{144, 180};

	/**
	 * Field descriptor (offset) for struct member 'specg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__specg);
	 * CPointer&lt;Float&gt; p_specg = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'specg'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__specg = new long[]{148, 184};

	/**
	 * Field descriptor (offset) for struct member 'specb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__specb);
	 * CPointer&lt;Float&gt; p_specb = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'specb'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__specb = new long[]{152, 188};

	/**
	 * Field descriptor (offset) for struct member 'alpha'.
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
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__alpha);
	 * CPointer&lt;Float&gt; p_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha = new long[]{156, 192};

	/**
	 * Field descriptor (offset) for struct member 'ray_mirror'.
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
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__ray_mirror);
	 * CPointer&lt;Float&gt; p_ray_mirror = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ray_mirror'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ray_mirror = new long[]{160, 196};

	/**
	 * Field descriptor (offset) for struct member 'spec'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__spec);
	 * CPointer&lt;Float&gt; p_spec = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spec'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spec = new long[]{164, 200};

	/**
	 * Field descriptor (offset) for struct member 'gloss_mir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Renamed and inversed to roughness. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__gloss_mir);
	 * CPointer&lt;Float&gt; p_gloss_mir = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gloss_mir'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gloss_mir = new long[]{168, 204};

	/**
	 * Field descriptor (offset) for struct member 'roughness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Roughness of the material
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__roughness);
	 * CPointer&lt;Float&gt; p_roughness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'roughness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__roughness = new long[]{172, 208};

	/**
	 * Field descriptor (offset) for struct member 'metallic'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of mirror reflection for raytrace
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__metallic);
	 * CPointer&lt;Float&gt; p_metallic = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'metallic'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__metallic = new long[]{176, 212};

	/**
	 * Field descriptor (offset) for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes to render the material<h4>Blender Source Code:</h4>
	 * <p> Nodes </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__use_nodes);
	 * CPointer&lt;Byte&gt; p_use_nodes = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_nodes'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_nodes = new long[]{180, 216};

	/**
	 * Field descriptor (offset) for struct member 'pr_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Preview render. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__pr_type);
	 * CPointer&lt;Byte&gt; p_pr_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pr_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pr_type = new long[]{181, 217};

	/**
	 * Field descriptor (offset) for struct member 'pr_texture'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__pr_texture);
	 * CPointer&lt;Short&gt; p_pr_texture = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pr_texture'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pr_texture = new long[]{182, 218};

	/**
	 * Field descriptor (offset) for struct member 'pr_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__pr_flag);
	 * CPointer&lt;Short&gt; p_pr_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pr_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pr_flag = new long[]{184, 220};

	/**
	 * Field descriptor (offset) for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index for render passes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__index);
	 * CPointer&lt;Short&gt; p_index = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'index'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__index = new long[]{186, 222};

	/**
	 * Field descriptor (offset) for struct member 'nodetree'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__nodetree);
	 * CPointer&lt;CPointer&lt;bNodeTree&gt;&gt; p_nodetree = p.cast(new Class[]{CPointer.class, bNodeTree.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodetree'</li>
	 * <li>Signature: 'bNodeTree*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodetree = new long[]{188, 224};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{192, 232};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__preview);
	 * CPointer&lt;CPointer&lt;PreviewImage&gt;&gt; p_preview = p.cast(new Class[]{CPointer.class, PreviewImage.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview'</li>
	 * <li>Signature: 'PreviewImage*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview = new long[]{196, 240};

	/**
	 * Field descriptor (offset) for struct member 'line_col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Freestyle line settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__line_col);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_line_col = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'line_col'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__line_col = new long[]{200, 248};

	/**
	 * Field descriptor (offset) for struct member 'line_priority'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The line color of a higher priority is used at material boundaries
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__line_priority);
	 * CPointer&lt;Short&gt; p_line_priority = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'line_priority'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__line_priority = new long[]{216, 264};

	/**
	 * Field descriptor (offset) for struct member 'vcol_alpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__vcol_alpha);
	 * CPointer&lt;Short&gt; p_vcol_alpha = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vcol_alpha'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vcol_alpha = new long[]{218, 266};

	/**
	 * Field descriptor (offset) for struct member 'paint_active_slot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index of active texture paint slot<h4>Blender Source Code:</h4>
	 * <p> Texture painting slots. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__paint_active_slot);
	 * CPointer&lt;Short&gt; p_paint_active_slot = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint_active_slot'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint_active_slot = new long[]{220, 268};

	/**
	 * Field descriptor (offset) for struct member 'paint_clone_slot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index of clone texture paint slot
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__paint_clone_slot);
	 * CPointer&lt;Short&gt; p_paint_clone_slot = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint_clone_slot'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint_clone_slot = new long[]{222, 270};

	/**
	 * Field descriptor (offset) for struct member 'tot_slots'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__tot_slots);
	 * CPointer&lt;Short&gt; p_tot_slots = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_slots'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_slots = new long[]{224, 272};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{226, 274};

	/**
	 * Field descriptor (offset) for struct member 'alpha_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * A pixel is rendered only if its alpha value is above this threshold<h4>Blender Source Code:</h4>
	 * <p> Transparency. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__alpha_threshold);
	 * CPointer&lt;Float&gt; p_alpha_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha_threshold = new long[]{228, 276};

	/**
	 * Field descriptor (offset) for struct member 'refract_depth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__refract_depth);
	 * CPointer&lt;Float&gt; p_refract_depth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'refract_depth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__refract_depth = new long[]{232, 280};

	/**
	 * Field descriptor (offset) for struct member 'blend_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Blend Mode for Transparent Faces
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__blend_method);
	 * CPointer&lt;Byte&gt; p_blend_method = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_method'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_method = new long[]{236, 284};

	/**
	 * Field descriptor (offset) for struct member 'blend_shadow'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__blend_shadow);
	 * CPointer&lt;Byte&gt; p_blend_shadow = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_shadow'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_shadow = new long[]{237, 285};

	/**
	 * Field descriptor (offset) for struct member 'blend_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__blend_flag);
	 * CPointer&lt;Byte&gt; p_blend_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_flag = new long[]{238, 286};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{239, 287};

	/**
	 * Field descriptor (offset) for struct member 'texpaintslot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cached slots for texture painting, must be refreshed in refresh_texpaint_image_cache before using. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__texpaintslot);
	 * CPointer&lt;CPointer&lt;TexPaintSlot&gt;&gt; p_texpaintslot = p.cast(new Class[]{CPointer.class, TexPaintSlot.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texpaintslot'</li>
	 * <li>Signature: 'TexPaintSlot*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texpaintslot = new long[]{240, 288};

	/**
	 * Field descriptor (offset) for struct member 'gpumaterial'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime cache for GLSL materials. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__gpumaterial);
	 * CPointer&lt;ListBase&gt; p_gpumaterial = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpumaterial'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpumaterial = new long[]{244, 296};

	/**
	 * Field descriptor (offset) for struct member 'gp_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease pencil color. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__gp_style);
	 * CPointer&lt;CPointer&lt;MaterialGPencilStyle&gt;&gt; p_gp_style = p.cast(new Class[]{CPointer.class, MaterialGPencilStyle.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_style'</li>
	 * <li>Signature: 'MaterialGPencilStyle*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_style = new long[]{252, 312};

	public Material(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Material(Material that) {
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
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Animation data (must be immediately after id for utilities to use it). </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 160);
		} else {
			return __io__block.readShort(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 160, flag);
		} else {
			__io__block.writeShort(__io__address + 124, flag);
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
			return new CArrayFacade<Byte>(__io__address + 162, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 126, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 162;
		} else {
			__dna__offset = 126;
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
	 * Get method for struct member 'r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Colors from Blender Internal that we are still using. </p>
	 * @see #__DNA__FIELD__r
	 */
	
	public float getR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Colors from Blender Internal that we are still using. </p>
	 * @see #__DNA__FIELD__r
	 */
	
	public void setR(float r) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, r);
		} else {
			__io__block.writeFloat(__io__address + 128, r);
		}
	}

	/**
	 * Get method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public float getG() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public void setG(float g) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, g);
		} else {
			__io__block.writeFloat(__io__address + 132, g);
		}
	}

	/**
	 * Get method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public float getB() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public void setB(float b) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, b);
		} else {
			__io__block.writeFloat(__io__address + 136, b);
		}
	}

	/**
	 * Get method for struct member 'a'.
	 * @see #__DNA__FIELD__a
	 */
	
	public float getA() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'a'.
	 * @see #__DNA__FIELD__a
	 */
	
	public void setA(float a) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, a);
		} else {
			__io__block.writeFloat(__io__address + 140, a);
		}
	}

	/**
	 * Get method for struct member 'specr'.
	 * @see #__DNA__FIELD__specr
	 */
	
	public float getSpecr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'specr'.
	 * @see #__DNA__FIELD__specr
	 */
	
	public void setSpecr(float specr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, specr);
		} else {
			__io__block.writeFloat(__io__address + 144, specr);
		}
	}

	/**
	 * Get method for struct member 'specg'.
	 * @see #__DNA__FIELD__specg
	 */
	
	public float getSpecg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'specg'.
	 * @see #__DNA__FIELD__specg
	 */
	
	public void setSpecg(float specg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, specg);
		} else {
			__io__block.writeFloat(__io__address + 148, specg);
		}
	}

	/**
	 * Get method for struct member 'specb'.
	 * @see #__DNA__FIELD__specb
	 */
	
	public float getSpecb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'specb'.
	 * @see #__DNA__FIELD__specb
	 */
	
	public void setSpecb(float specb) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, specb);
		} else {
			__io__block.writeFloat(__io__address + 152, specb);
		}
	}

	/**
	 * Get method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__alpha
	 */
	
	public float getAlpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__alpha
	 */
	
	public void setAlpha(float alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, alpha);
		} else {
			__io__block.writeFloat(__io__address + 156, alpha);
		}
	}

	/**
	 * Get method for struct member 'ray_mirror'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ray_mirror
	 */
	
	public float getRay_mirror() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 196);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'ray_mirror'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ray_mirror
	 */
	
	public void setRay_mirror(float ray_mirror) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 196, ray_mirror);
		} else {
			__io__block.writeFloat(__io__address + 160, ray_mirror);
		}
	}

	/**
	 * Get method for struct member 'spec'.
	 * @see #__DNA__FIELD__spec
	 */
	
	public float getSpec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'spec'.
	 * @see #__DNA__FIELD__spec
	 */
	
	public void setSpec(float spec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, spec);
		} else {
			__io__block.writeFloat(__io__address + 164, spec);
		}
	}

	/**
	 * Get method for struct member 'gloss_mir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Renamed and inversed to roughness. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__gloss_mir
	 */
	
	public float getGloss_mir() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'gloss_mir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Renamed and inversed to roughness. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__gloss_mir
	 */
	
	public void setGloss_mir(float gloss_mir) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, gloss_mir);
		} else {
			__io__block.writeFloat(__io__address + 168, gloss_mir);
		}
	}

	/**
	 * Get method for struct member 'roughness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Roughness of the material
	 * @see #__DNA__FIELD__roughness
	 */
	
	public float getRoughness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'roughness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Roughness of the material
	 * @see #__DNA__FIELD__roughness
	 */
	
	public void setRoughness(float roughness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, roughness);
		} else {
			__io__block.writeFloat(__io__address + 172, roughness);
		}
	}

	/**
	 * Get method for struct member 'metallic'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of mirror reflection for raytrace
	 * @see #__DNA__FIELD__metallic
	 */
	
	public float getMetallic() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'metallic'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of mirror reflection for raytrace
	 * @see #__DNA__FIELD__metallic
	 */
	
	public void setMetallic(float metallic) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, metallic);
		} else {
			__io__block.writeFloat(__io__address + 176, metallic);
		}
	}

	/**
	 * Get method for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes to render the material<h4>Blender Source Code:</h4>
	 * <p> Nodes </p>
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public byte getUse_nodes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 216);
		} else {
			return __io__block.readByte(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes to render the material<h4>Blender Source Code:</h4>
	 * <p> Nodes </p>
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public void setUse_nodes(byte use_nodes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 216, use_nodes);
		} else {
			__io__block.writeByte(__io__address + 180, use_nodes);
		}
	}

	/**
	 * Get method for struct member 'pr_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Preview render. </p>
	 * @see #__DNA__FIELD__pr_type
	 */
	
	public byte getPr_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 217);
		} else {
			return __io__block.readByte(__io__address + 181);
		}
	}

	/**
	 * Set method for struct member 'pr_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Preview render. </p>
	 * @see #__DNA__FIELD__pr_type
	 */
	
	public void setPr_type(byte pr_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 217, pr_type);
		} else {
			__io__block.writeByte(__io__address + 181, pr_type);
		}
	}

	/**
	 * Get method for struct member 'pr_texture'.
	 * @see #__DNA__FIELD__pr_texture
	 */
	
	public short getPr_texture() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 218);
		} else {
			return __io__block.readShort(__io__address + 182);
		}
	}

	/**
	 * Set method for struct member 'pr_texture'.
	 * @see #__DNA__FIELD__pr_texture
	 */
	
	public void setPr_texture(short pr_texture) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 218, pr_texture);
		} else {
			__io__block.writeShort(__io__address + 182, pr_texture);
		}
	}

	/**
	 * Get method for struct member 'pr_flag'.
	 * @see #__DNA__FIELD__pr_flag
	 */
	
	public short getPr_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 220);
		} else {
			return __io__block.readShort(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'pr_flag'.
	 * @see #__DNA__FIELD__pr_flag
	 */
	
	public void setPr_flag(short pr_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 220, pr_flag);
		} else {
			__io__block.writeShort(__io__address + 184, pr_flag);
		}
	}

	/**
	 * Get method for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index for render passes. </p>
	 * @see #__DNA__FIELD__index
	 */
	
	public short getIndex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 222);
		} else {
			return __io__block.readShort(__io__address + 186);
		}
	}

	/**
	 * Set method for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index for render passes. </p>
	 * @see #__DNA__FIELD__index
	 */
	
	public void setIndex(short index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 222, index);
		} else {
			__io__block.writeShort(__io__address + 186, index);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 188);
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
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 188, __address);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 192, __address);
		}
	}

	/**
	 * Get method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)
	 * @see #__DNA__FIELD__preview
	 */
	
	public CPointer<PreviewImage> getPreview() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 196);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PreviewImage.class};
		return new CPointer<PreviewImage>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PreviewImage.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(CPointer<PreviewImage> preview) throws IOException
	{
		long __address = ((preview == null) ? 0 : preview.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 240, __address);
		} else {
			__io__block.writeLong(__io__address + 196, __address);
		}
	}

	/**
	 * Get method for struct member 'line_col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Freestyle line settings. </p>
	 * @see #__DNA__FIELD__line_col
	 */
	
	public CArrayFacade<Float> getLine_col() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'line_col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Freestyle line settings. </p>
	 * @see #__DNA__FIELD__line_col
	 */
	
	public void setLine_col(CArrayFacade<Float> line_col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 200;
		}
		if (__io__equals(line_col, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, line_col)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, line_col);
		} else {
			__io__generic__copy( getLine_col(), line_col);
		}
	}

	/**
	 * Get method for struct member 'line_priority'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The line color of a higher priority is used at material boundaries
	 * @see #__DNA__FIELD__line_priority
	 */
	
	public short getLine_priority() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 264);
		} else {
			return __io__block.readShort(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'line_priority'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The line color of a higher priority is used at material boundaries
	 * @see #__DNA__FIELD__line_priority
	 */
	
	public void setLine_priority(short line_priority) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 264, line_priority);
		} else {
			__io__block.writeShort(__io__address + 216, line_priority);
		}
	}

	/**
	 * Get method for struct member 'vcol_alpha'.
	 * @see #__DNA__FIELD__vcol_alpha
	 */
	
	public short getVcol_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 266);
		} else {
			return __io__block.readShort(__io__address + 218);
		}
	}

	/**
	 * Set method for struct member 'vcol_alpha'.
	 * @see #__DNA__FIELD__vcol_alpha
	 */
	
	public void setVcol_alpha(short vcol_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 266, vcol_alpha);
		} else {
			__io__block.writeShort(__io__address + 218, vcol_alpha);
		}
	}

	/**
	 * Get method for struct member 'paint_active_slot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index of active texture paint slot<h4>Blender Source Code:</h4>
	 * <p> Texture painting slots. </p>
	 * @see #__DNA__FIELD__paint_active_slot
	 */
	
	public short getPaint_active_slot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 268);
		} else {
			return __io__block.readShort(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'paint_active_slot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index of active texture paint slot<h4>Blender Source Code:</h4>
	 * <p> Texture painting slots. </p>
	 * @see #__DNA__FIELD__paint_active_slot
	 */
	
	public void setPaint_active_slot(short paint_active_slot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 268, paint_active_slot);
		} else {
			__io__block.writeShort(__io__address + 220, paint_active_slot);
		}
	}

	/**
	 * Get method for struct member 'paint_clone_slot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index of clone texture paint slot
	 * @see #__DNA__FIELD__paint_clone_slot
	 */
	
	public short getPaint_clone_slot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 270);
		} else {
			return __io__block.readShort(__io__address + 222);
		}
	}

	/**
	 * Set method for struct member 'paint_clone_slot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index of clone texture paint slot
	 * @see #__DNA__FIELD__paint_clone_slot
	 */
	
	public void setPaint_clone_slot(short paint_clone_slot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 270, paint_clone_slot);
		} else {
			__io__block.writeShort(__io__address + 222, paint_clone_slot);
		}
	}

	/**
	 * Get method for struct member 'tot_slots'.
	 * @see #__DNA__FIELD__tot_slots
	 */
	
	public short getTot_slots() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 272);
		} else {
			return __io__block.readShort(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'tot_slots'.
	 * @see #__DNA__FIELD__tot_slots
	 */
	
	public void setTot_slots(short tot_slots) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 272, tot_slots);
		} else {
			__io__block.writeShort(__io__address + 224, tot_slots);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 274, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 226, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 274;
		} else {
			__dna__offset = 226;
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
	 * Get method for struct member 'alpha_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * A pixel is rendered only if its alpha value is above this threshold<h4>Blender Source Code:</h4>
	 * <p> Transparency. </p>
	 * @see #__DNA__FIELD__alpha_threshold
	 */
	
	public float getAlpha_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 276);
		} else {
			return __io__block.readFloat(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'alpha_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * A pixel is rendered only if its alpha value is above this threshold<h4>Blender Source Code:</h4>
	 * <p> Transparency. </p>
	 * @see #__DNA__FIELD__alpha_threshold
	 */
	
	public void setAlpha_threshold(float alpha_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 276, alpha_threshold);
		} else {
			__io__block.writeFloat(__io__address + 228, alpha_threshold);
		}
	}

	/**
	 * Get method for struct member 'refract_depth'.
	 * @see #__DNA__FIELD__refract_depth
	 */
	
	public float getRefract_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 280);
		} else {
			return __io__block.readFloat(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'refract_depth'.
	 * @see #__DNA__FIELD__refract_depth
	 */
	
	public void setRefract_depth(float refract_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 280, refract_depth);
		} else {
			__io__block.writeFloat(__io__address + 232, refract_depth);
		}
	}

	/**
	 * Get method for struct member 'blend_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Blend Mode for Transparent Faces
	 * @see #__DNA__FIELD__blend_method
	 */
	
	public byte getBlend_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 284);
		} else {
			return __io__block.readByte(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'blend_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Blend Mode for Transparent Faces
	 * @see #__DNA__FIELD__blend_method
	 */
	
	public void setBlend_method(byte blend_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 284, blend_method);
		} else {
			__io__block.writeByte(__io__address + 236, blend_method);
		}
	}

	/**
	 * Get method for struct member 'blend_shadow'.
	 * @see #__DNA__FIELD__blend_shadow
	 */
	
	public byte getBlend_shadow() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 285);
		} else {
			return __io__block.readByte(__io__address + 237);
		}
	}

	/**
	 * Set method for struct member 'blend_shadow'.
	 * @see #__DNA__FIELD__blend_shadow
	 */
	
	public void setBlend_shadow(byte blend_shadow) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 285, blend_shadow);
		} else {
			__io__block.writeByte(__io__address + 237, blend_shadow);
		}
	}

	/**
	 * Get method for struct member 'blend_flag'.
	 * @see #__DNA__FIELD__blend_flag
	 */
	
	public byte getBlend_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 286);
		} else {
			return __io__block.readByte(__io__address + 238);
		}
	}

	/**
	 * Set method for struct member 'blend_flag'.
	 * @see #__DNA__FIELD__blend_flag
	 */
	
	public void setBlend_flag(byte blend_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 286, blend_flag);
		} else {
			__io__block.writeByte(__io__address + 238, blend_flag);
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
			return new CArrayFacade<Byte>(__io__address + 287, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 239, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 287;
		} else {
			__dna__offset = 239;
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
	 * Get method for struct member 'texpaintslot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cached slots for texture painting, must be refreshed in refresh_texpaint_image_cache before using. </p>
	 * @see #__DNA__FIELD__texpaintslot
	 */
	
	public CPointer<TexPaintSlot> getTexpaintslot() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		}
		Class<?>[] __dna__targetTypes = new Class[]{TexPaintSlot.class};
		return new CPointer<TexPaintSlot>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, TexPaintSlot.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'texpaintslot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cached slots for texture painting, must be refreshed in refresh_texpaint_image_cache before using. </p>
	 * @see #__DNA__FIELD__texpaintslot
	 */
	
	public void setTexpaintslot(CPointer<TexPaintSlot> texpaintslot) throws IOException
	{
		long __address = ((texpaintslot == null) ? 0 : texpaintslot.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 288, __address);
		} else {
			__io__block.writeLong(__io__address + 240, __address);
		}
	}

	/**
	 * Get method for struct member 'gpumaterial'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime cache for GLSL materials. </p>
	 * @see #__DNA__FIELD__gpumaterial
	 */
	
	public ListBase getGpumaterial() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 296, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 244, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gpumaterial'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime cache for GLSL materials. </p>
	 * @see #__DNA__FIELD__gpumaterial
	 */
	
	public void setGpumaterial(ListBase gpumaterial) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 296;
		} else {
			__dna__offset = 244;
		}
		if (__io__equals(gpumaterial, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gpumaterial)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gpumaterial);
		} else {
			__io__generic__copy( getGpumaterial(), gpumaterial);
		}
	}

	/**
	 * Get method for struct member 'gp_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease pencil color. </p>
	 * @see #__DNA__FIELD__gp_style
	 */
	
	public CPointer<MaterialGPencilStyle> getGp_style() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 312);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 252);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MaterialGPencilStyle.class};
		return new CPointer<MaterialGPencilStyle>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MaterialGPencilStyle.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gp_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Grease pencil color. </p>
	 * @see #__DNA__FIELD__gp_style
	 */
	
	public void setGp_style(CPointer<MaterialGPencilStyle> gp_style) throws IOException
	{
		long __address = ((gp_style == null) ? 0 : gp_style.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 312, __address);
		} else {
			__io__block.writeLong(__io__address + 252, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Material> __io__addressof() {
		return new CPointer<Material>(__io__address, new Class[]{Material.class}, __io__block, __io__blockTable);
	}

}
