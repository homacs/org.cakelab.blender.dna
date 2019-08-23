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

@CMetaData(size32=1396, size64=1528)
public class Material extends CFacade {

	/**
	 * This is the sdna index of the struct Material.
	 * <p>
	 * It is required when allocating a new block to store data for Material.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 46;

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
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
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
	public static final long[] __DNA__FIELD__adt = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'material_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__material_type);
	 * CPointer&lt;Short&gt; p_material_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'material_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__material_type = new long[]{104, 128};

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
	public static final long[] __DNA__FIELD__flag = new long[]{106, 130};

	/**
	 * Field descriptor (offset) for struct member 'r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> note, keep this below synced with render_types.h </p>
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
	public static final long[] __DNA__FIELD__r = new long[]{108, 132};

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
	public static final long[] __DNA__FIELD__g = new long[]{112, 136};

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
	public static final long[] __DNA__FIELD__b = new long[]{116, 140};

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
	public static final long[] __DNA__FIELD__specr = new long[]{120, 144};

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
	public static final long[] __DNA__FIELD__specg = new long[]{124, 148};

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
	public static final long[] __DNA__FIELD__specb = new long[]{128, 152};

	/**
	 * Field descriptor (offset) for struct member 'mirr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__mirr);
	 * CPointer&lt;Float&gt; p_mirr = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mirr'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mirr = new long[]{132, 156};

	/**
	 * Field descriptor (offset) for struct member 'mirg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__mirg);
	 * CPointer&lt;Float&gt; p_mirg = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mirg'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mirg = new long[]{136, 160};

	/**
	 * Field descriptor (offset) for struct member 'mirb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__mirb);
	 * CPointer&lt;Float&gt; p_mirb = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mirb'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mirb = new long[]{140, 164};

	/**
	 * Field descriptor (offset) for struct member 'ambr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__ambr);
	 * CPointer&lt;Float&gt; p_ambr = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ambr'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ambr = new long[]{144, 168};

	/**
	 * Field descriptor (offset) for struct member 'ambb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__ambb);
	 * CPointer&lt;Float&gt; p_ambb = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ambb'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ambb = new long[]{148, 172};

	/**
	 * Field descriptor (offset) for struct member 'ambg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__ambg);
	 * CPointer&lt;Float&gt; p_ambg = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ambg'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ambg = new long[]{152, 176};

	/**
	 * Field descriptor (offset) for struct member 'amb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__amb);
	 * CPointer&lt;Float&gt; p_amb = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'amb'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__amb = new long[]{156, 180};

	/**
	 * Field descriptor (offset) for struct member 'emit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of light to emit
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__emit);
	 * CPointer&lt;Float&gt; p_emit = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'emit'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__emit = new long[]{160, 184};

	/**
	 * Field descriptor (offset) for struct member 'ang'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__ang);
	 * CPointer&lt;Float&gt; p_ang = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ang'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ang = new long[]{164, 188};

	/**
	 * Field descriptor (offset) for struct member 'spectra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__spectra);
	 * CPointer&lt;Float&gt; p_spectra = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spectra'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spectra = new long[]{168, 192};

	/**
	 * Field descriptor (offset) for struct member 'ray_mirror'.
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
	public static final long[] __DNA__FIELD__ray_mirror = new long[]{172, 196};

	/**
	 * Field descriptor (offset) for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Alpha transparency of the material
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
	public static final long[] __DNA__FIELD__alpha = new long[]{176, 200};

	/**
	 * Field descriptor (offset) for struct member 'ref'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__ref);
	 * CPointer&lt;Float&gt; p_ref = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ref'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ref = new long[]{180, 204};

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
	public static final long[] __DNA__FIELD__spec = new long[]{184, 208};

	/**
	 * Field descriptor (offset) for struct member 'zoffs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__zoffs);
	 * CPointer&lt;Float&gt; p_zoffs = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zoffs'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zoffs = new long[]{188, 212};

	/**
	 * Field descriptor (offset) for struct member 'add'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__add);
	 * CPointer&lt;Float&gt; p_add = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'add'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__add = new long[]{192, 216};

	/**
	 * Field descriptor (offset) for struct member 'translucency'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of diffuse shading on the back side
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__translucency);
	 * CPointer&lt;Float&gt; p_translucency = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'translucency'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__translucency = new long[]{196, 220};

	/**
	 * Field descriptor (offset) for struct member 'vol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> end synced with render_types.h </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__vol);
	 * CPointer&lt;VolumeSettings&gt; p_vol = p.cast(new Class[]{VolumeSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vol'</li>
	 * <li>Signature: 'VolumeSettings'</li>
	 * <li>Actual Size (32bit/64bit): 88/88</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vol = new long[]{200, 224};

	/**
	 * Field descriptor (offset) for struct member 'game'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__game);
	 * CPointer&lt;GameSettings&gt; p_game = p.cast(new Class[]{GameSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'game'</li>
	 * <li>Signature: 'GameSettings'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__game = new long[]{288, 312};

	/**
	 * Field descriptor (offset) for struct member 'fresnel_mir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__fresnel_mir);
	 * CPointer&lt;Float&gt; p_fresnel_mir = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fresnel_mir'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fresnel_mir = new long[]{304, 328};

	/**
	 * Field descriptor (offset) for struct member 'fresnel_mir_i'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__fresnel_mir_i);
	 * CPointer&lt;Float&gt; p_fresnel_mir_i = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fresnel_mir_i'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fresnel_mir_i = new long[]{308, 332};

	/**
	 * Field descriptor (offset) for struct member 'fresnel_tra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__fresnel_tra);
	 * CPointer&lt;Float&gt; p_fresnel_tra = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fresnel_tra'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fresnel_tra = new long[]{312, 336};

	/**
	 * Field descriptor (offset) for struct member 'fresnel_tra_i'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__fresnel_tra_i);
	 * CPointer&lt;Float&gt; p_fresnel_tra_i = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fresnel_tra_i'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fresnel_tra_i = new long[]{316, 340};

	/**
	 * Field descriptor (offset) for struct member 'filter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> filter added, for raytrace transparency and transmissivity </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__filter);
	 * CPointer&lt;Float&gt; p_filter = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter = new long[]{320, 344};

	/**
	 * Field descriptor (offset) for struct member 'tx_limit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__tx_limit);
	 * CPointer&lt;Float&gt; p_tx_limit = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tx_limit'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tx_limit = new long[]{324, 348};

	/**
	 * Field descriptor (offset) for struct member 'tx_falloff'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__tx_falloff);
	 * CPointer&lt;Float&gt; p_tx_falloff = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tx_falloff'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tx_falloff = new long[]{328, 352};

	/**
	 * Field descriptor (offset) for struct member 'ray_depth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__ray_depth);
	 * CPointer&lt;Short&gt; p_ray_depth = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ray_depth'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ray_depth = new long[]{332, 356};

	/**
	 * Field descriptor (offset) for struct member 'ray_depth_tra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__ray_depth_tra);
	 * CPointer&lt;Short&gt; p_ray_depth_tra = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ray_depth_tra'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ray_depth_tra = new long[]{334, 358};

	/**
	 * Field descriptor (offset) for struct member 'har'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__har);
	 * CPointer&lt;Short&gt; p_har = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'har'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__har = new long[]{336, 360};

	/**
	 * Field descriptor (offset) for struct member 'seed1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__seed1);
	 * CPointer&lt;Byte&gt; p_seed1 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seed1'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seed1 = new long[]{338, 362};

	/**
	 * Field descriptor (offset) for struct member 'seed2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__seed2);
	 * CPointer&lt;Byte&gt; p_seed2 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seed2'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seed2 = new long[]{339, 363};

	/**
	 * Field descriptor (offset) for struct member 'gloss_mir'.
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
	public static final long[] __DNA__FIELD__gloss_mir = new long[]{340, 364};

	/**
	 * Field descriptor (offset) for struct member 'gloss_tra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__gloss_tra);
	 * CPointer&lt;Float&gt; p_gloss_tra = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gloss_tra'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gloss_tra = new long[]{344, 368};

	/**
	 * Field descriptor (offset) for struct member 'samp_gloss_mir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__samp_gloss_mir);
	 * CPointer&lt;Short&gt; p_samp_gloss_mir = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'samp_gloss_mir'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__samp_gloss_mir = new long[]{348, 372};

	/**
	 * Field descriptor (offset) for struct member 'samp_gloss_tra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__samp_gloss_tra);
	 * CPointer&lt;Short&gt; p_samp_gloss_tra = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'samp_gloss_tra'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__samp_gloss_tra = new long[]{350, 374};

	/**
	 * Field descriptor (offset) for struct member 'adapt_thresh_mir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__adapt_thresh_mir);
	 * CPointer&lt;Float&gt; p_adapt_thresh_mir = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adapt_thresh_mir'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adapt_thresh_mir = new long[]{352, 376};

	/**
	 * Field descriptor (offset) for struct member 'adapt_thresh_tra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__adapt_thresh_tra);
	 * CPointer&lt;Float&gt; p_adapt_thresh_tra = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adapt_thresh_tra'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adapt_thresh_tra = new long[]{356, 380};

	/**
	 * Field descriptor (offset) for struct member 'aniso_gloss_mir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__aniso_gloss_mir);
	 * CPointer&lt;Float&gt; p_aniso_gloss_mir = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aniso_gloss_mir'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aniso_gloss_mir = new long[]{360, 384};

	/**
	 * Field descriptor (offset) for struct member 'dist_mir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__dist_mir);
	 * CPointer&lt;Float&gt; p_dist_mir = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dist_mir'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dist_mir = new long[]{364, 388};

	/**
	 * Field descriptor (offset) for struct member 'fadeto_mir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__fadeto_mir);
	 * CPointer&lt;Short&gt; p_fadeto_mir = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fadeto_mir'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fadeto_mir = new long[]{368, 392};

	/**
	 * Field descriptor (offset) for struct member 'shade_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> like Cubic interpolation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__shade_flag);
	 * CPointer&lt;Short&gt; p_shade_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shade_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shade_flag = new long[]{370, 394};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__mode);
	 * CPointer&lt;Integer&gt; p_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{372, 396};

	/**
	 * Field descriptor (offset) for struct member 'mode_l'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> mode_l is the or-ed result of all layer modes </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__mode_l);
	 * CPointer&lt;Integer&gt; p_mode_l = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode_l'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode_l = new long[]{376, 400};

	/**
	 * Field descriptor (offset) for struct member 'mode2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__mode2);
	 * CPointer&lt;Integer&gt; p_mode2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode2 = new long[]{380, 404};

	/**
	 * Field descriptor (offset) for struct member 'mode2_l'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> additional mode flags </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__mode2_l);
	 * CPointer&lt;Integer&gt; p_mode2_l = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode2_l'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode2_l = new long[]{384, 408};

	/**
	 * Field descriptor (offset) for struct member 'flarec'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__flarec);
	 * CPointer&lt;Short&gt; p_flarec = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flarec'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flarec = new long[]{388, 412};

	/**
	 * Field descriptor (offset) for struct member 'starc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__starc);
	 * CPointer&lt;Short&gt; p_starc = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'starc'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__starc = new long[]{390, 414};

	/**
	 * Field descriptor (offset) for struct member 'linec'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__linec);
	 * CPointer&lt;Short&gt; p_linec = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'linec'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__linec = new long[]{392, 416};

	/**
	 * Field descriptor (offset) for struct member 'ringc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__ringc);
	 * CPointer&lt;Short&gt; p_ringc = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ringc'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ringc = new long[]{394, 418};

	/**
	 * Field descriptor (offset) for struct member 'hasize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__hasize);
	 * CPointer&lt;Float&gt; p_hasize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hasize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hasize = new long[]{396, 420};

	/**
	 * Field descriptor (offset) for struct member 'flaresize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__flaresize);
	 * CPointer&lt;Float&gt; p_flaresize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flaresize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flaresize = new long[]{400, 424};

	/**
	 * Field descriptor (offset) for struct member 'subsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__subsize);
	 * CPointer&lt;Float&gt; p_subsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subsize = new long[]{404, 428};

	/**
	 * Field descriptor (offset) for struct member 'flareboost'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__flareboost);
	 * CPointer&lt;Float&gt; p_flareboost = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flareboost'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flareboost = new long[]{408, 432};

	/**
	 * Field descriptor (offset) for struct member 'strand_sta'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__strand_sta);
	 * CPointer&lt;Float&gt; p_strand_sta = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strand_sta'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strand_sta = new long[]{412, 436};

	/**
	 * Field descriptor (offset) for struct member 'strand_end'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__strand_end);
	 * CPointer&lt;Float&gt; p_strand_end = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strand_end'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strand_end = new long[]{416, 440};

	/**
	 * Field descriptor (offset) for struct member 'strand_ease'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__strand_ease);
	 * CPointer&lt;Float&gt; p_strand_ease = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strand_ease'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strand_ease = new long[]{420, 444};

	/**
	 * Field descriptor (offset) for struct member 'strand_surfnor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__strand_surfnor);
	 * CPointer&lt;Float&gt; p_strand_surfnor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strand_surfnor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strand_surfnor = new long[]{424, 448};

	/**
	 * Field descriptor (offset) for struct member 'strand_min'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__strand_min);
	 * CPointer&lt;Float&gt; p_strand_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strand_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strand_min = new long[]{428, 452};

	/**
	 * Field descriptor (offset) for struct member 'strand_widthfade'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__strand_widthfade);
	 * CPointer&lt;Float&gt; p_strand_widthfade = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strand_widthfade'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strand_widthfade = new long[]{432, 456};

	/**
	 * Field descriptor (offset) for struct member 'strand_uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__strand_uvname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_strand_uvname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strand_uvname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strand_uvname = new long[]{436, 460};

	/**
	 * Field descriptor (offset) for struct member 'sbias'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> shadow bias to prevent terminator prob </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__sbias);
	 * CPointer&lt;Float&gt; p_sbias = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbias'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbias = new long[]{500, 524};

	/**
	 * Field descriptor (offset) for struct member 'lbias'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor to multiply lampbias with (0.0 = no mult) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__lbias);
	 * CPointer&lt;Float&gt; p_lbias = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lbias'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lbias = new long[]{504, 528};

	/**
	 * Field descriptor (offset) for struct member 'shad_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in use for irregular shadowbuffer </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__shad_alpha);
	 * CPointer&lt;Float&gt; p_shad_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shad_alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shad_alpha = new long[]{508, 532};

	/**
	 * Field descriptor (offset) for struct member 'septex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__septex);
	 * CPointer&lt;Integer&gt; p_septex = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'septex'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__septex = new long[]{512, 536};

	/**
	 * Field descriptor (offset) for struct member 'rgbsel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for buttons and render </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__rgbsel);
	 * CPointer&lt;Byte&gt; p_rgbsel = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rgbsel'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rgbsel = new long[]{516, 540};

	/**
	 * Field descriptor (offset) for struct member 'texact'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__texact);
	 * CPointer&lt;Byte&gt; p_texact = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texact'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texact = new long[]{517, 541};

	/**
	 * Field descriptor (offset) for struct member 'pr_type'.
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
	public static final long[] __DNA__FIELD__pr_type = new long[]{518, 542};

	/**
	 * Field descriptor (offset) for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes to render the material
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
	public static final long[] __DNA__FIELD__use_nodes = new long[]{519, 543};

	/**
	 * Field descriptor (offset) for struct member 'pr_lamp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__pr_lamp);
	 * CPointer&lt;Short&gt; p_pr_lamp = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pr_lamp'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pr_lamp = new long[]{520, 544};

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
	public static final long[] __DNA__FIELD__pr_texture = new long[]{522, 546};

	/**
	 * Field descriptor (offset) for struct member 'ml_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ml_flag is for disable base material </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__ml_flag);
	 * CPointer&lt;Short&gt; p_ml_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ml_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ml_flag = new long[]{524, 548};

	/**
	 * Field descriptor (offset) for struct member 'mapflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> mapping </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__mapflag);
	 * CPointer&lt;Byte&gt; p_mapflag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mapflag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mapflag = new long[]{526, 550};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__pad);
	 * CPointer&lt;Byte&gt; p_pad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{527, 551};

	/**
	 * Field descriptor (offset) for struct member 'diff_shader'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> shaders </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__diff_shader);
	 * CPointer&lt;Short&gt; p_diff_shader = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'diff_shader'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__diff_shader = new long[]{528, 552};

	/**
	 * Field descriptor (offset) for struct member 'spec_shader'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__spec_shader);
	 * CPointer&lt;Short&gt; p_spec_shader = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spec_shader'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spec_shader = new long[]{530, 554};

	/**
	 * Field descriptor (offset) for struct member 'roughness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Oren-Nayar Roughness
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
	public static final long[] __DNA__FIELD__roughness = new long[]{532, 556};

	/**
	 * Field descriptor (offset) for struct member 'refrac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__refrac);
	 * CPointer&lt;Float&gt; p_refrac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'refrac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__refrac = new long[]{536, 560};

	/**
	 * Field descriptor (offset) for struct member 'param'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX param[4] needs review and improvement (shader system as whole anyway) This is nasty reused variable for different goals and not easy to RNAify nicely. -jesterKing size, smooth, size, smooth, for toonshader, 0 (fac) and 1 (fresnel) also for fresnel shader </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__param);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_param = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'param'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__param = new long[]{540, 564};

	/**
	 * Field descriptor (offset) for struct member 'rms'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__rms);
	 * CPointer&lt;Float&gt; p_rms = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rms'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rms = new long[]{556, 580};

	/**
	 * Field descriptor (offset) for struct member 'darkness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minnaert darkness
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__darkness);
	 * CPointer&lt;Float&gt; p_darkness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'darkness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__darkness = new long[]{560, 584};

	/**
	 * Field descriptor (offset) for struct member 'texco'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime - OR'd from 'mtex' </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__texco);
	 * CPointer&lt;Short&gt; p_texco = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texco'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texco = new long[]{564, 588};

	/**
	 * Field descriptor (offset) for struct member 'mapto'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__mapto);
	 * CPointer&lt;Short&gt; p_mapto = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mapto'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mapto = new long[]{566, 590};

	/**
	 * Field descriptor (offset) for struct member 'ramp_col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ramp colors </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__ramp_col);
	 * CPointer&lt;CPointer&lt;ColorBand&gt;&gt; p_ramp_col = p.cast(new Class[]{CPointer.class, ColorBand.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ramp_col'</li>
	 * <li>Signature: 'ColorBand*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ramp_col = new long[]{568, 592};

	/**
	 * Field descriptor (offset) for struct member 'ramp_spec'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__ramp_spec);
	 * CPointer&lt;CPointer&lt;ColorBand&gt;&gt; p_ramp_spec = p.cast(new Class[]{CPointer.class, ColorBand.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ramp_spec'</li>
	 * <li>Signature: 'ColorBand*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ramp_spec = new long[]{572, 600};

	/**
	 * Field descriptor (offset) for struct member 'rampin_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__rampin_col);
	 * CPointer&lt;Byte&gt; p_rampin_col = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rampin_col'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rampin_col = new long[]{576, 608};

	/**
	 * Field descriptor (offset) for struct member 'rampin_spec'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__rampin_spec);
	 * CPointer&lt;Byte&gt; p_rampin_spec = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rampin_spec'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rampin_spec = new long[]{577, 609};

	/**
	 * Field descriptor (offset) for struct member 'rampblend_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__rampblend_col);
	 * CPointer&lt;Byte&gt; p_rampblend_col = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rampblend_col'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rampblend_col = new long[]{578, 610};

	/**
	 * Field descriptor (offset) for struct member 'rampblend_spec'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__rampblend_spec);
	 * CPointer&lt;Byte&gt; p_rampblend_spec = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rampblend_spec'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rampblend_spec = new long[]{579, 611};

	/**
	 * Field descriptor (offset) for struct member 'ramp_show'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__ramp_show);
	 * CPointer&lt;Short&gt; p_ramp_show = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ramp_show'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ramp_show = new long[]{580, 612};

	/**
	 * Field descriptor (offset) for struct member 'pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__pad3);
	 * CPointer&lt;Short&gt; p_pad3 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad3'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad3 = new long[]{582, 614};

	/**
	 * Field descriptor (offset) for struct member 'rampfac_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__rampfac_col);
	 * CPointer&lt;Float&gt; p_rampfac_col = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rampfac_col'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rampfac_col = new long[]{584, 616};

	/**
	 * Field descriptor (offset) for struct member 'rampfac_spec'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__rampfac_spec);
	 * CPointer&lt;Float&gt; p_rampfac_spec = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rampfac_spec'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rampfac_spec = new long[]{588, 620};

	/**
	 * Field descriptor (offset) for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__mtex);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;MTex&gt;&gt;&gt; p_mtex = p.cast(new Class[]{CArrayFacade.class, CPointer.class, MTex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mtex'</li>
	 * <li>Signature: 'MTex*[18]'</li>
	 * <li>Actual Size (32bit/64bit): 72/144</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mtex = new long[]{592, 624};

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
	public static final long[] __DNA__FIELD__nodetree = new long[]{664, 768};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
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
	public static final long[] __DNA__FIELD__ipo = new long[]{668, 776};

	/**
	 * Field descriptor (offset) for struct member 'group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> light group </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__group);
	 * CPointer&lt;CPointer&lt;Group&gt;&gt; p_group = p.cast(new Class[]{CPointer.class, Group.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'group'</li>
	 * <li>Signature: 'Group*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__group = new long[]{672, 784};

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
	public static final long[] __DNA__FIELD__preview = new long[]{676, 792};

	/**
	 * Field descriptor (offset) for struct member 'friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dynamic properties </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__friction);
	 * CPointer&lt;Float&gt; p_friction = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'friction'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__friction = new long[]{680, 800};

	/**
	 * Field descriptor (offset) for struct member 'fh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__fh);
	 * CPointer&lt;Float&gt; p_fh = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fh'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fh = new long[]{684, 804};

	/**
	 * Field descriptor (offset) for struct member 'reflect'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__reflect);
	 * CPointer&lt;Float&gt; p_reflect = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reflect'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reflect = new long[]{688, 808};

	/**
	 * Field descriptor (offset) for struct member 'fhdist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__fhdist);
	 * CPointer&lt;Float&gt; p_fhdist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fhdist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fhdist = new long[]{692, 812};

	/**
	 * Field descriptor (offset) for struct member 'xyfrict'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__xyfrict);
	 * CPointer&lt;Float&gt; p_xyfrict = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xyfrict'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xyfrict = new long[]{696, 816};

	/**
	 * Field descriptor (offset) for struct member 'dynamode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__dynamode);
	 * CPointer&lt;Short&gt; p_dynamode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dynamode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dynamode = new long[]{700, 820};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__pad2);
	 * CPointer&lt;Short&gt; p_pad2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{702, 822};

	/**
	 * Field descriptor (offset) for struct member 'sss_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> subsurface scattering </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__sss_radius);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_sss_radius = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sss_radius'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sss_radius = new long[]{704, 824};

	/**
	 * Field descriptor (offset) for struct member 'sss_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__sss_col);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_sss_col = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sss_col'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sss_col = new long[]{716, 836};

	/**
	 * Field descriptor (offset) for struct member 'sss_error'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__sss_error);
	 * CPointer&lt;Float&gt; p_sss_error = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sss_error'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sss_error = new long[]{728, 848};

	/**
	 * Field descriptor (offset) for struct member 'sss_scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__sss_scale);
	 * CPointer&lt;Float&gt; p_sss_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sss_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sss_scale = new long[]{732, 852};

	/**
	 * Field descriptor (offset) for struct member 'sss_ior'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__sss_ior);
	 * CPointer&lt;Float&gt; p_sss_ior = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sss_ior'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sss_ior = new long[]{736, 856};

	/**
	 * Field descriptor (offset) for struct member 'sss_colfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__sss_colfac);
	 * CPointer&lt;Float&gt; p_sss_colfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sss_colfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sss_colfac = new long[]{740, 860};

	/**
	 * Field descriptor (offset) for struct member 'sss_texfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__sss_texfac);
	 * CPointer&lt;Float&gt; p_sss_texfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sss_texfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sss_texfac = new long[]{744, 864};

	/**
	 * Field descriptor (offset) for struct member 'sss_front'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__sss_front);
	 * CPointer&lt;Float&gt; p_sss_front = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sss_front'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sss_front = new long[]{748, 868};

	/**
	 * Field descriptor (offset) for struct member 'sss_back'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__sss_back);
	 * CPointer&lt;Float&gt; p_sss_back = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sss_back'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sss_back = new long[]{752, 872};

	/**
	 * Field descriptor (offset) for struct member 'sss_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__sss_flag);
	 * CPointer&lt;Short&gt; p_sss_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sss_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sss_flag = new long[]{756, 876};

	/**
	 * Field descriptor (offset) for struct member 'sss_preset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__sss_preset);
	 * CPointer&lt;Short&gt; p_sss_preset = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sss_preset'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sss_preset = new long[]{758, 878};

	/**
	 * Field descriptor (offset) for struct member 'mapto_textured'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> render-time cache to optimize texture lookups </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__mapto_textured);
	 * CPointer&lt;Integer&gt; p_mapto_textured = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mapto_textured'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mapto_textured = new long[]{760, 880};

	/**
	 * Field descriptor (offset) for struct member 'shadowonly_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> "shadowsonly" type </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__shadowonly_flag);
	 * CPointer&lt;Short&gt; p_shadowonly_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadowonly_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadowonly_flag = new long[]{764, 884};

	/**
	 * Field descriptor (offset) for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> custom index for render passes </p>
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
	public static final long[] __DNA__FIELD__index = new long[]{766, 886};

	/**
	 * Field descriptor (offset) for struct member 'line_col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Freestyle line settings </p>
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
	public static final long[] __DNA__FIELD__line_col = new long[]{768, 888};

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
	public static final long[] __DNA__FIELD__line_priority = new long[]{784, 904};

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
	public static final long[] __DNA__FIELD__vcol_alpha = new long[]{786, 906};

	/**
	 * Field descriptor (offset) for struct member 'paint_active_slot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index of active texture paint slot<h4>Blender Source Code:</h4>
	 * <p> texture painting </p>
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
	public static final long[] __DNA__FIELD__paint_active_slot = new long[]{788, 908};

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
	public static final long[] __DNA__FIELD__paint_clone_slot = new long[]{790, 910};

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
	public static final long[] __DNA__FIELD__tot_slots = new long[]{792, 912};

	/**
	 * Field descriptor (offset) for struct member 'pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__pad4);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_pad4 = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad4'</li>
	 * <li>Signature: 'short[3]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad4 = new long[]{794, 914};

	/**
	 * Field descriptor (offset) for struct member 'nmap_tangent_names'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multiple tangent (Normal Map node) [MAX_MTFACE+1][MAX_NAME]; +1 for empty name </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__nmap_tangent_names);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Byte&gt;&gt;&gt; p_nmap_tangent_names = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nmap_tangent_names'</li>
	 * <li>Signature: 'char[9][64]'</li>
	 * <li>Actual Size (32bit/64bit): 576/576</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nmap_tangent_names = new long[]{800, 920};

	/**
	 * Field descriptor (offset) for struct member 'nmap_tangent_names_count'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__nmap_tangent_names_count);
	 * CPointer&lt;Integer&gt; p_nmap_tangent_names_count = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nmap_tangent_names_count'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nmap_tangent_names_count = new long[]{1376, 1496};

	/**
	 * Field descriptor (offset) for struct member 'pad5'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Material material = ...;
	 * CPointer&lt;Object&gt; p = material.__dna__addressof(Material.__DNA__FIELD__pad5);
	 * CPointer&lt;Integer&gt; p_pad5 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad5'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad5 = new long[]{1380, 1500};

	/**
	 * Field descriptor (offset) for struct member 'texpaintslot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cached slot for painting. Make sure to recalculate before use with refresh_texpaint_image_cache </p>
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
	public static final long[] __DNA__FIELD__texpaintslot = new long[]{1384, 1504};

	/**
	 * Field descriptor (offset) for struct member 'gpumaterial'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime </p>
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
	public static final long[] __DNA__FIELD__gpumaterial = new long[]{1388, 1512};

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
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
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
	 * Get method for struct member 'material_type'.
	 * @see #__DNA__FIELD__material_type
	 */
	
	public short getMaterial_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 128);
		} else {
			return __io__block.readShort(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'material_type'.
	 * @see #__DNA__FIELD__material_type
	 */
	
	public void setMaterial_type(short material_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 128, material_type);
		} else {
			__io__block.writeShort(__io__address + 104, material_type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 130);
		} else {
			return __io__block.readShort(__io__address + 106);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 130, flag);
		} else {
			__io__block.writeShort(__io__address + 106, flag);
		}
	}

	/**
	 * Get method for struct member 'r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> note, keep this below synced with render_types.h </p>
	 * @see #__DNA__FIELD__r
	 */
	
	public float getR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 132);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> note, keep this below synced with render_types.h </p>
	 * @see #__DNA__FIELD__r
	 */
	
	public void setR(float r) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 132, r);
		} else {
			__io__block.writeFloat(__io__address + 108, r);
		}
	}

	/**
	 * Get method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public float getG() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 136);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public void setG(float g) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 136, g);
		} else {
			__io__block.writeFloat(__io__address + 112, g);
		}
	}

	/**
	 * Get method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public float getB() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public void setB(float b) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, b);
		} else {
			__io__block.writeFloat(__io__address + 116, b);
		}
	}

	/**
	 * Get method for struct member 'specr'.
	 * @see #__DNA__FIELD__specr
	 */
	
	public float getSpecr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'specr'.
	 * @see #__DNA__FIELD__specr
	 */
	
	public void setSpecr(float specr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, specr);
		} else {
			__io__block.writeFloat(__io__address + 120, specr);
		}
	}

	/**
	 * Get method for struct member 'specg'.
	 * @see #__DNA__FIELD__specg
	 */
	
	public float getSpecg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'specg'.
	 * @see #__DNA__FIELD__specg
	 */
	
	public void setSpecg(float specg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, specg);
		} else {
			__io__block.writeFloat(__io__address + 124, specg);
		}
	}

	/**
	 * Get method for struct member 'specb'.
	 * @see #__DNA__FIELD__specb
	 */
	
	public float getSpecb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'specb'.
	 * @see #__DNA__FIELD__specb
	 */
	
	public void setSpecb(float specb) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, specb);
		} else {
			__io__block.writeFloat(__io__address + 128, specb);
		}
	}

	/**
	 * Get method for struct member 'mirr'.
	 * @see #__DNA__FIELD__mirr
	 */
	
	public float getMirr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'mirr'.
	 * @see #__DNA__FIELD__mirr
	 */
	
	public void setMirr(float mirr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, mirr);
		} else {
			__io__block.writeFloat(__io__address + 132, mirr);
		}
	}

	/**
	 * Get method for struct member 'mirg'.
	 * @see #__DNA__FIELD__mirg
	 */
	
	public float getMirg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'mirg'.
	 * @see #__DNA__FIELD__mirg
	 */
	
	public void setMirg(float mirg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, mirg);
		} else {
			__io__block.writeFloat(__io__address + 136, mirg);
		}
	}

	/**
	 * Get method for struct member 'mirb'.
	 * @see #__DNA__FIELD__mirb
	 */
	
	public float getMirb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'mirb'.
	 * @see #__DNA__FIELD__mirb
	 */
	
	public void setMirb(float mirb) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, mirb);
		} else {
			__io__block.writeFloat(__io__address + 140, mirb);
		}
	}

	/**
	 * Get method for struct member 'ambr'.
	 * @see #__DNA__FIELD__ambr
	 */
	
	public float getAmbr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'ambr'.
	 * @see #__DNA__FIELD__ambr
	 */
	
	public void setAmbr(float ambr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, ambr);
		} else {
			__io__block.writeFloat(__io__address + 144, ambr);
		}
	}

	/**
	 * Get method for struct member 'ambb'.
	 * @see #__DNA__FIELD__ambb
	 */
	
	public float getAmbb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'ambb'.
	 * @see #__DNA__FIELD__ambb
	 */
	
	public void setAmbb(float ambb) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, ambb);
		} else {
			__io__block.writeFloat(__io__address + 148, ambb);
		}
	}

	/**
	 * Get method for struct member 'ambg'.
	 * @see #__DNA__FIELD__ambg
	 */
	
	public float getAmbg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'ambg'.
	 * @see #__DNA__FIELD__ambg
	 */
	
	public void setAmbg(float ambg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, ambg);
		} else {
			__io__block.writeFloat(__io__address + 152, ambg);
		}
	}

	/**
	 * Get method for struct member 'amb'.
	 * @see #__DNA__FIELD__amb
	 */
	
	public float getAmb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'amb'.
	 * @see #__DNA__FIELD__amb
	 */
	
	public void setAmb(float amb) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, amb);
		} else {
			__io__block.writeFloat(__io__address + 156, amb);
		}
	}

	/**
	 * Get method for struct member 'emit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of light to emit
	 * @see #__DNA__FIELD__emit
	 */
	
	public float getEmit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'emit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of light to emit
	 * @see #__DNA__FIELD__emit
	 */
	
	public void setEmit(float emit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, emit);
		} else {
			__io__block.writeFloat(__io__address + 160, emit);
		}
	}

	/**
	 * Get method for struct member 'ang'.
	 * @see #__DNA__FIELD__ang
	 */
	
	public float getAng() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'ang'.
	 * @see #__DNA__FIELD__ang
	 */
	
	public void setAng(float ang) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, ang);
		} else {
			__io__block.writeFloat(__io__address + 164, ang);
		}
	}

	/**
	 * Get method for struct member 'spectra'.
	 * @see #__DNA__FIELD__spectra
	 */
	
	public float getSpectra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'spectra'.
	 * @see #__DNA__FIELD__spectra
	 */
	
	public void setSpectra(float spectra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, spectra);
		} else {
			__io__block.writeFloat(__io__address + 168, spectra);
		}
	}

	/**
	 * Get method for struct member 'ray_mirror'.
	 * @see #__DNA__FIELD__ray_mirror
	 */
	
	public float getRay_mirror() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 196);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'ray_mirror'.
	 * @see #__DNA__FIELD__ray_mirror
	 */
	
	public void setRay_mirror(float ray_mirror) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 196, ray_mirror);
		} else {
			__io__block.writeFloat(__io__address + 172, ray_mirror);
		}
	}

	/**
	 * Get method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Alpha transparency of the material
	 * @see #__DNA__FIELD__alpha
	 */
	
	public float getAlpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Alpha transparency of the material
	 * @see #__DNA__FIELD__alpha
	 */
	
	public void setAlpha(float alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, alpha);
		} else {
			__io__block.writeFloat(__io__address + 176, alpha);
		}
	}

	/**
	 * Get method for struct member 'ref'.
	 * @see #__DNA__FIELD__ref
	 */
	
	public float getRef() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'ref'.
	 * @see #__DNA__FIELD__ref
	 */
	
	public void setRef(float ref) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, ref);
		} else {
			__io__block.writeFloat(__io__address + 180, ref);
		}
	}

	/**
	 * Get method for struct member 'spec'.
	 * @see #__DNA__FIELD__spec
	 */
	
	public float getSpec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'spec'.
	 * @see #__DNA__FIELD__spec
	 */
	
	public void setSpec(float spec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, spec);
		} else {
			__io__block.writeFloat(__io__address + 184, spec);
		}
	}

	/**
	 * Get method for struct member 'zoffs'.
	 * @see #__DNA__FIELD__zoffs
	 */
	
	public float getZoffs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'zoffs'.
	 * @see #__DNA__FIELD__zoffs
	 */
	
	public void setZoffs(float zoffs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, zoffs);
		} else {
			__io__block.writeFloat(__io__address + 188, zoffs);
		}
	}

	/**
	 * Get method for struct member 'add'.
	 * @see #__DNA__FIELD__add
	 */
	
	public float getAdd() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 216);
		} else {
			return __io__block.readFloat(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'add'.
	 * @see #__DNA__FIELD__add
	 */
	
	public void setAdd(float add) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 216, add);
		} else {
			__io__block.writeFloat(__io__address + 192, add);
		}
	}

	/**
	 * Get method for struct member 'translucency'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of diffuse shading on the back side
	 * @see #__DNA__FIELD__translucency
	 */
	
	public float getTranslucency() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 220);
		} else {
			return __io__block.readFloat(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'translucency'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of diffuse shading on the back side
	 * @see #__DNA__FIELD__translucency
	 */
	
	public void setTranslucency(float translucency) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 220, translucency);
		} else {
			__io__block.writeFloat(__io__address + 196, translucency);
		}
	}

	/**
	 * Get method for struct member 'vol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> end synced with render_types.h </p>
	 * @see #__DNA__FIELD__vol
	 */
	
	public VolumeSettings getVol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new VolumeSettings(__io__address + 224, __io__block, __io__blockTable);
		} else {
			return new VolumeSettings(__io__address + 200, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> end synced with render_types.h </p>
	 * @see #__DNA__FIELD__vol
	 */
	
	public void setVol(VolumeSettings vol) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 224;
		} else {
			__dna__offset = 200;
		}
		if (__io__equals(vol, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vol)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vol);
		} else {
			__io__generic__copy( getVol(), vol);
		}
	}

	/**
	 * Get method for struct member 'game'.
	 * @see #__DNA__FIELD__game
	 */
	
	public GameSettings getGame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GameSettings(__io__address + 312, __io__block, __io__blockTable);
		} else {
			return new GameSettings(__io__address + 288, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'game'.
	 * @see #__DNA__FIELD__game
	 */
	
	public void setGame(GameSettings game) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 312;
		} else {
			__dna__offset = 288;
		}
		if (__io__equals(game, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, game)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, game);
		} else {
			__io__generic__copy( getGame(), game);
		}
	}

	/**
	 * Get method for struct member 'fresnel_mir'.
	 * @see #__DNA__FIELD__fresnel_mir
	 */
	
	public float getFresnel_mir() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 328);
		} else {
			return __io__block.readFloat(__io__address + 304);
		}
	}

	/**
	 * Set method for struct member 'fresnel_mir'.
	 * @see #__DNA__FIELD__fresnel_mir
	 */
	
	public void setFresnel_mir(float fresnel_mir) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 328, fresnel_mir);
		} else {
			__io__block.writeFloat(__io__address + 304, fresnel_mir);
		}
	}

	/**
	 * Get method for struct member 'fresnel_mir_i'.
	 * @see #__DNA__FIELD__fresnel_mir_i
	 */
	
	public float getFresnel_mir_i() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 332);
		} else {
			return __io__block.readFloat(__io__address + 308);
		}
	}

	/**
	 * Set method for struct member 'fresnel_mir_i'.
	 * @see #__DNA__FIELD__fresnel_mir_i
	 */
	
	public void setFresnel_mir_i(float fresnel_mir_i) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 332, fresnel_mir_i);
		} else {
			__io__block.writeFloat(__io__address + 308, fresnel_mir_i);
		}
	}

	/**
	 * Get method for struct member 'fresnel_tra'.
	 * @see #__DNA__FIELD__fresnel_tra
	 */
	
	public float getFresnel_tra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 336);
		} else {
			return __io__block.readFloat(__io__address + 312);
		}
	}

	/**
	 * Set method for struct member 'fresnel_tra'.
	 * @see #__DNA__FIELD__fresnel_tra
	 */
	
	public void setFresnel_tra(float fresnel_tra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 336, fresnel_tra);
		} else {
			__io__block.writeFloat(__io__address + 312, fresnel_tra);
		}
	}

	/**
	 * Get method for struct member 'fresnel_tra_i'.
	 * @see #__DNA__FIELD__fresnel_tra_i
	 */
	
	public float getFresnel_tra_i() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 340);
		} else {
			return __io__block.readFloat(__io__address + 316);
		}
	}

	/**
	 * Set method for struct member 'fresnel_tra_i'.
	 * @see #__DNA__FIELD__fresnel_tra_i
	 */
	
	public void setFresnel_tra_i(float fresnel_tra_i) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 340, fresnel_tra_i);
		} else {
			__io__block.writeFloat(__io__address + 316, fresnel_tra_i);
		}
	}

	/**
	 * Get method for struct member 'filter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> filter added, for raytrace transparency and transmissivity </p>
	 * @see #__DNA__FIELD__filter
	 */
	
	public float getFilter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 344);
		} else {
			return __io__block.readFloat(__io__address + 320);
		}
	}

	/**
	 * Set method for struct member 'filter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> filter added, for raytrace transparency and transmissivity </p>
	 * @see #__DNA__FIELD__filter
	 */
	
	public void setFilter(float filter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 344, filter);
		} else {
			__io__block.writeFloat(__io__address + 320, filter);
		}
	}

	/**
	 * Get method for struct member 'tx_limit'.
	 * @see #__DNA__FIELD__tx_limit
	 */
	
	public float getTx_limit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 348);
		} else {
			return __io__block.readFloat(__io__address + 324);
		}
	}

	/**
	 * Set method for struct member 'tx_limit'.
	 * @see #__DNA__FIELD__tx_limit
	 */
	
	public void setTx_limit(float tx_limit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 348, tx_limit);
		} else {
			__io__block.writeFloat(__io__address + 324, tx_limit);
		}
	}

	/**
	 * Get method for struct member 'tx_falloff'.
	 * @see #__DNA__FIELD__tx_falloff
	 */
	
	public float getTx_falloff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 352);
		} else {
			return __io__block.readFloat(__io__address + 328);
		}
	}

	/**
	 * Set method for struct member 'tx_falloff'.
	 * @see #__DNA__FIELD__tx_falloff
	 */
	
	public void setTx_falloff(float tx_falloff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 352, tx_falloff);
		} else {
			__io__block.writeFloat(__io__address + 328, tx_falloff);
		}
	}

	/**
	 * Get method for struct member 'ray_depth'.
	 * @see #__DNA__FIELD__ray_depth
	 */
	
	public short getRay_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 356);
		} else {
			return __io__block.readShort(__io__address + 332);
		}
	}

	/**
	 * Set method for struct member 'ray_depth'.
	 * @see #__DNA__FIELD__ray_depth
	 */
	
	public void setRay_depth(short ray_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 356, ray_depth);
		} else {
			__io__block.writeShort(__io__address + 332, ray_depth);
		}
	}

	/**
	 * Get method for struct member 'ray_depth_tra'.
	 * @see #__DNA__FIELD__ray_depth_tra
	 */
	
	public short getRay_depth_tra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 358);
		} else {
			return __io__block.readShort(__io__address + 334);
		}
	}

	/**
	 * Set method for struct member 'ray_depth_tra'.
	 * @see #__DNA__FIELD__ray_depth_tra
	 */
	
	public void setRay_depth_tra(short ray_depth_tra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 358, ray_depth_tra);
		} else {
			__io__block.writeShort(__io__address + 334, ray_depth_tra);
		}
	}

	/**
	 * Get method for struct member 'har'.
	 * @see #__DNA__FIELD__har
	 */
	
	public short getHar() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 360);
		} else {
			return __io__block.readShort(__io__address + 336);
		}
	}

	/**
	 * Set method for struct member 'har'.
	 * @see #__DNA__FIELD__har
	 */
	
	public void setHar(short har) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 360, har);
		} else {
			__io__block.writeShort(__io__address + 336, har);
		}
	}

	/**
	 * Get method for struct member 'seed1'.
	 * @see #__DNA__FIELD__seed1
	 */
	
	public byte getSeed1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 362);
		} else {
			return __io__block.readByte(__io__address + 338);
		}
	}

	/**
	 * Set method for struct member 'seed1'.
	 * @see #__DNA__FIELD__seed1
	 */
	
	public void setSeed1(byte seed1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 362, seed1);
		} else {
			__io__block.writeByte(__io__address + 338, seed1);
		}
	}

	/**
	 * Get method for struct member 'seed2'.
	 * @see #__DNA__FIELD__seed2
	 */
	
	public byte getSeed2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 363);
		} else {
			return __io__block.readByte(__io__address + 339);
		}
	}

	/**
	 * Set method for struct member 'seed2'.
	 * @see #__DNA__FIELD__seed2
	 */
	
	public void setSeed2(byte seed2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 363, seed2);
		} else {
			__io__block.writeByte(__io__address + 339, seed2);
		}
	}

	/**
	 * Get method for struct member 'gloss_mir'.
	 * @see #__DNA__FIELD__gloss_mir
	 */
	
	public float getGloss_mir() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 364);
		} else {
			return __io__block.readFloat(__io__address + 340);
		}
	}

	/**
	 * Set method for struct member 'gloss_mir'.
	 * @see #__DNA__FIELD__gloss_mir
	 */
	
	public void setGloss_mir(float gloss_mir) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 364, gloss_mir);
		} else {
			__io__block.writeFloat(__io__address + 340, gloss_mir);
		}
	}

	/**
	 * Get method for struct member 'gloss_tra'.
	 * @see #__DNA__FIELD__gloss_tra
	 */
	
	public float getGloss_tra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 368);
		} else {
			return __io__block.readFloat(__io__address + 344);
		}
	}

	/**
	 * Set method for struct member 'gloss_tra'.
	 * @see #__DNA__FIELD__gloss_tra
	 */
	
	public void setGloss_tra(float gloss_tra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 368, gloss_tra);
		} else {
			__io__block.writeFloat(__io__address + 344, gloss_tra);
		}
	}

	/**
	 * Get method for struct member 'samp_gloss_mir'.
	 * @see #__DNA__FIELD__samp_gloss_mir
	 */
	
	public short getSamp_gloss_mir() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 372);
		} else {
			return __io__block.readShort(__io__address + 348);
		}
	}

	/**
	 * Set method for struct member 'samp_gloss_mir'.
	 * @see #__DNA__FIELD__samp_gloss_mir
	 */
	
	public void setSamp_gloss_mir(short samp_gloss_mir) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 372, samp_gloss_mir);
		} else {
			__io__block.writeShort(__io__address + 348, samp_gloss_mir);
		}
	}

	/**
	 * Get method for struct member 'samp_gloss_tra'.
	 * @see #__DNA__FIELD__samp_gloss_tra
	 */
	
	public short getSamp_gloss_tra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 374);
		} else {
			return __io__block.readShort(__io__address + 350);
		}
	}

	/**
	 * Set method for struct member 'samp_gloss_tra'.
	 * @see #__DNA__FIELD__samp_gloss_tra
	 */
	
	public void setSamp_gloss_tra(short samp_gloss_tra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 374, samp_gloss_tra);
		} else {
			__io__block.writeShort(__io__address + 350, samp_gloss_tra);
		}
	}

	/**
	 * Get method for struct member 'adapt_thresh_mir'.
	 * @see #__DNA__FIELD__adapt_thresh_mir
	 */
	
	public float getAdapt_thresh_mir() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 376);
		} else {
			return __io__block.readFloat(__io__address + 352);
		}
	}

	/**
	 * Set method for struct member 'adapt_thresh_mir'.
	 * @see #__DNA__FIELD__adapt_thresh_mir
	 */
	
	public void setAdapt_thresh_mir(float adapt_thresh_mir) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 376, adapt_thresh_mir);
		} else {
			__io__block.writeFloat(__io__address + 352, adapt_thresh_mir);
		}
	}

	/**
	 * Get method for struct member 'adapt_thresh_tra'.
	 * @see #__DNA__FIELD__adapt_thresh_tra
	 */
	
	public float getAdapt_thresh_tra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 380);
		} else {
			return __io__block.readFloat(__io__address + 356);
		}
	}

	/**
	 * Set method for struct member 'adapt_thresh_tra'.
	 * @see #__DNA__FIELD__adapt_thresh_tra
	 */
	
	public void setAdapt_thresh_tra(float adapt_thresh_tra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 380, adapt_thresh_tra);
		} else {
			__io__block.writeFloat(__io__address + 356, adapt_thresh_tra);
		}
	}

	/**
	 * Get method for struct member 'aniso_gloss_mir'.
	 * @see #__DNA__FIELD__aniso_gloss_mir
	 */
	
	public float getAniso_gloss_mir() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 384);
		} else {
			return __io__block.readFloat(__io__address + 360);
		}
	}

	/**
	 * Set method for struct member 'aniso_gloss_mir'.
	 * @see #__DNA__FIELD__aniso_gloss_mir
	 */
	
	public void setAniso_gloss_mir(float aniso_gloss_mir) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 384, aniso_gloss_mir);
		} else {
			__io__block.writeFloat(__io__address + 360, aniso_gloss_mir);
		}
	}

	/**
	 * Get method for struct member 'dist_mir'.
	 * @see #__DNA__FIELD__dist_mir
	 */
	
	public float getDist_mir() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 388);
		} else {
			return __io__block.readFloat(__io__address + 364);
		}
	}

	/**
	 * Set method for struct member 'dist_mir'.
	 * @see #__DNA__FIELD__dist_mir
	 */
	
	public void setDist_mir(float dist_mir) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 388, dist_mir);
		} else {
			__io__block.writeFloat(__io__address + 364, dist_mir);
		}
	}

	/**
	 * Get method for struct member 'fadeto_mir'.
	 * @see #__DNA__FIELD__fadeto_mir
	 */
	
	public short getFadeto_mir() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 392);
		} else {
			return __io__block.readShort(__io__address + 368);
		}
	}

	/**
	 * Set method for struct member 'fadeto_mir'.
	 * @see #__DNA__FIELD__fadeto_mir
	 */
	
	public void setFadeto_mir(short fadeto_mir) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 392, fadeto_mir);
		} else {
			__io__block.writeShort(__io__address + 368, fadeto_mir);
		}
	}

	/**
	 * Get method for struct member 'shade_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> like Cubic interpolation </p>
	 * @see #__DNA__FIELD__shade_flag
	 */
	
	public short getShade_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 394);
		} else {
			return __io__block.readShort(__io__address + 370);
		}
	}

	/**
	 * Set method for struct member 'shade_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> like Cubic interpolation </p>
	 * @see #__DNA__FIELD__shade_flag
	 */
	
	public void setShade_flag(short shade_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 394, shade_flag);
		} else {
			__io__block.writeShort(__io__address + 370, shade_flag);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 396);
		} else {
			return __io__block.readInt(__io__address + 372);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 396, mode);
		} else {
			__io__block.writeInt(__io__address + 372, mode);
		}
	}

	/**
	 * Get method for struct member 'mode_l'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> mode_l is the or-ed result of all layer modes </p>
	 * @see #__DNA__FIELD__mode_l
	 */
	
	public int getMode_l() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 400);
		} else {
			return __io__block.readInt(__io__address + 376);
		}
	}

	/**
	 * Set method for struct member 'mode_l'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> mode_l is the or-ed result of all layer modes </p>
	 * @see #__DNA__FIELD__mode_l
	 */
	
	public void setMode_l(int mode_l) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 400, mode_l);
		} else {
			__io__block.writeInt(__io__address + 376, mode_l);
		}
	}

	/**
	 * Get method for struct member 'mode2'.
	 * @see #__DNA__FIELD__mode2
	 */
	
	public int getMode2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 404);
		} else {
			return __io__block.readInt(__io__address + 380);
		}
	}

	/**
	 * Set method for struct member 'mode2'.
	 * @see #__DNA__FIELD__mode2
	 */
	
	public void setMode2(int mode2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 404, mode2);
		} else {
			__io__block.writeInt(__io__address + 380, mode2);
		}
	}

	/**
	 * Get method for struct member 'mode2_l'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> additional mode flags </p>
	 * @see #__DNA__FIELD__mode2_l
	 */
	
	public int getMode2_l() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 408);
		} else {
			return __io__block.readInt(__io__address + 384);
		}
	}

	/**
	 * Set method for struct member 'mode2_l'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> additional mode flags </p>
	 * @see #__DNA__FIELD__mode2_l
	 */
	
	public void setMode2_l(int mode2_l) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 408, mode2_l);
		} else {
			__io__block.writeInt(__io__address + 384, mode2_l);
		}
	}

	/**
	 * Get method for struct member 'flarec'.
	 * @see #__DNA__FIELD__flarec
	 */
	
	public short getFlarec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 412);
		} else {
			return __io__block.readShort(__io__address + 388);
		}
	}

	/**
	 * Set method for struct member 'flarec'.
	 * @see #__DNA__FIELD__flarec
	 */
	
	public void setFlarec(short flarec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 412, flarec);
		} else {
			__io__block.writeShort(__io__address + 388, flarec);
		}
	}

	/**
	 * Get method for struct member 'starc'.
	 * @see #__DNA__FIELD__starc
	 */
	
	public short getStarc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 414);
		} else {
			return __io__block.readShort(__io__address + 390);
		}
	}

	/**
	 * Set method for struct member 'starc'.
	 * @see #__DNA__FIELD__starc
	 */
	
	public void setStarc(short starc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 414, starc);
		} else {
			__io__block.writeShort(__io__address + 390, starc);
		}
	}

	/**
	 * Get method for struct member 'linec'.
	 * @see #__DNA__FIELD__linec
	 */
	
	public short getLinec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 416);
		} else {
			return __io__block.readShort(__io__address + 392);
		}
	}

	/**
	 * Set method for struct member 'linec'.
	 * @see #__DNA__FIELD__linec
	 */
	
	public void setLinec(short linec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 416, linec);
		} else {
			__io__block.writeShort(__io__address + 392, linec);
		}
	}

	/**
	 * Get method for struct member 'ringc'.
	 * @see #__DNA__FIELD__ringc
	 */
	
	public short getRingc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 418);
		} else {
			return __io__block.readShort(__io__address + 394);
		}
	}

	/**
	 * Set method for struct member 'ringc'.
	 * @see #__DNA__FIELD__ringc
	 */
	
	public void setRingc(short ringc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 418, ringc);
		} else {
			__io__block.writeShort(__io__address + 394, ringc);
		}
	}

	/**
	 * Get method for struct member 'hasize'.
	 * @see #__DNA__FIELD__hasize
	 */
	
	public float getHasize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 420);
		} else {
			return __io__block.readFloat(__io__address + 396);
		}
	}

	/**
	 * Set method for struct member 'hasize'.
	 * @see #__DNA__FIELD__hasize
	 */
	
	public void setHasize(float hasize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 420, hasize);
		} else {
			__io__block.writeFloat(__io__address + 396, hasize);
		}
	}

	/**
	 * Get method for struct member 'flaresize'.
	 * @see #__DNA__FIELD__flaresize
	 */
	
	public float getFlaresize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 424);
		} else {
			return __io__block.readFloat(__io__address + 400);
		}
	}

	/**
	 * Set method for struct member 'flaresize'.
	 * @see #__DNA__FIELD__flaresize
	 */
	
	public void setFlaresize(float flaresize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 424, flaresize);
		} else {
			__io__block.writeFloat(__io__address + 400, flaresize);
		}
	}

	/**
	 * Get method for struct member 'subsize'.
	 * @see #__DNA__FIELD__subsize
	 */
	
	public float getSubsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 428);
		} else {
			return __io__block.readFloat(__io__address + 404);
		}
	}

	/**
	 * Set method for struct member 'subsize'.
	 * @see #__DNA__FIELD__subsize
	 */
	
	public void setSubsize(float subsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 428, subsize);
		} else {
			__io__block.writeFloat(__io__address + 404, subsize);
		}
	}

	/**
	 * Get method for struct member 'flareboost'.
	 * @see #__DNA__FIELD__flareboost
	 */
	
	public float getFlareboost() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 432);
		} else {
			return __io__block.readFloat(__io__address + 408);
		}
	}

	/**
	 * Set method for struct member 'flareboost'.
	 * @see #__DNA__FIELD__flareboost
	 */
	
	public void setFlareboost(float flareboost) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 432, flareboost);
		} else {
			__io__block.writeFloat(__io__address + 408, flareboost);
		}
	}

	/**
	 * Get method for struct member 'strand_sta'.
	 * @see #__DNA__FIELD__strand_sta
	 */
	
	public float getStrand_sta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 436);
		} else {
			return __io__block.readFloat(__io__address + 412);
		}
	}

	/**
	 * Set method for struct member 'strand_sta'.
	 * @see #__DNA__FIELD__strand_sta
	 */
	
	public void setStrand_sta(float strand_sta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 436, strand_sta);
		} else {
			__io__block.writeFloat(__io__address + 412, strand_sta);
		}
	}

	/**
	 * Get method for struct member 'strand_end'.
	 * @see #__DNA__FIELD__strand_end
	 */
	
	public float getStrand_end() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 440);
		} else {
			return __io__block.readFloat(__io__address + 416);
		}
	}

	/**
	 * Set method for struct member 'strand_end'.
	 * @see #__DNA__FIELD__strand_end
	 */
	
	public void setStrand_end(float strand_end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 440, strand_end);
		} else {
			__io__block.writeFloat(__io__address + 416, strand_end);
		}
	}

	/**
	 * Get method for struct member 'strand_ease'.
	 * @see #__DNA__FIELD__strand_ease
	 */
	
	public float getStrand_ease() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 444);
		} else {
			return __io__block.readFloat(__io__address + 420);
		}
	}

	/**
	 * Set method for struct member 'strand_ease'.
	 * @see #__DNA__FIELD__strand_ease
	 */
	
	public void setStrand_ease(float strand_ease) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 444, strand_ease);
		} else {
			__io__block.writeFloat(__io__address + 420, strand_ease);
		}
	}

	/**
	 * Get method for struct member 'strand_surfnor'.
	 * @see #__DNA__FIELD__strand_surfnor
	 */
	
	public float getStrand_surfnor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 448);
		} else {
			return __io__block.readFloat(__io__address + 424);
		}
	}

	/**
	 * Set method for struct member 'strand_surfnor'.
	 * @see #__DNA__FIELD__strand_surfnor
	 */
	
	public void setStrand_surfnor(float strand_surfnor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 448, strand_surfnor);
		} else {
			__io__block.writeFloat(__io__address + 424, strand_surfnor);
		}
	}

	/**
	 * Get method for struct member 'strand_min'.
	 * @see #__DNA__FIELD__strand_min
	 */
	
	public float getStrand_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 452);
		} else {
			return __io__block.readFloat(__io__address + 428);
		}
	}

	/**
	 * Set method for struct member 'strand_min'.
	 * @see #__DNA__FIELD__strand_min
	 */
	
	public void setStrand_min(float strand_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 452, strand_min);
		} else {
			__io__block.writeFloat(__io__address + 428, strand_min);
		}
	}

	/**
	 * Get method for struct member 'strand_widthfade'.
	 * @see #__DNA__FIELD__strand_widthfade
	 */
	
	public float getStrand_widthfade() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 456);
		} else {
			return __io__block.readFloat(__io__address + 432);
		}
	}

	/**
	 * Set method for struct member 'strand_widthfade'.
	 * @see #__DNA__FIELD__strand_widthfade
	 */
	
	public void setStrand_widthfade(float strand_widthfade) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 456, strand_widthfade);
		} else {
			__io__block.writeFloat(__io__address + 432, strand_widthfade);
		}
	}

	/**
	 * Get method for struct member 'strand_uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME </p>
	 * @see #__DNA__FIELD__strand_uvname
	 */
	
	public CArrayFacade<Byte> getStrand_uvname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 460, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 436, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'strand_uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME </p>
	 * @see #__DNA__FIELD__strand_uvname
	 */
	
	public void setStrand_uvname(CArrayFacade<Byte> strand_uvname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 460;
		} else {
			__dna__offset = 436;
		}
		if (__io__equals(strand_uvname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, strand_uvname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, strand_uvname);
		} else {
			__io__generic__copy( getStrand_uvname(), strand_uvname);
		}
	}

	/**
	 * Get method for struct member 'sbias'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> shadow bias to prevent terminator prob </p>
	 * @see #__DNA__FIELD__sbias
	 */
	
	public float getSbias() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 524);
		} else {
			return __io__block.readFloat(__io__address + 500);
		}
	}

	/**
	 * Set method for struct member 'sbias'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> shadow bias to prevent terminator prob </p>
	 * @see #__DNA__FIELD__sbias
	 */
	
	public void setSbias(float sbias) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 524, sbias);
		} else {
			__io__block.writeFloat(__io__address + 500, sbias);
		}
	}

	/**
	 * Get method for struct member 'lbias'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor to multiply lampbias with (0.0 = no mult) </p>
	 * @see #__DNA__FIELD__lbias
	 */
	
	public float getLbias() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 528);
		} else {
			return __io__block.readFloat(__io__address + 504);
		}
	}

	/**
	 * Set method for struct member 'lbias'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor to multiply lampbias with (0.0 = no mult) </p>
	 * @see #__DNA__FIELD__lbias
	 */
	
	public void setLbias(float lbias) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 528, lbias);
		} else {
			__io__block.writeFloat(__io__address + 504, lbias);
		}
	}

	/**
	 * Get method for struct member 'shad_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in use for irregular shadowbuffer </p>
	 * @see #__DNA__FIELD__shad_alpha
	 */
	
	public float getShad_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 532);
		} else {
			return __io__block.readFloat(__io__address + 508);
		}
	}

	/**
	 * Set method for struct member 'shad_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in use for irregular shadowbuffer </p>
	 * @see #__DNA__FIELD__shad_alpha
	 */
	
	public void setShad_alpha(float shad_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 532, shad_alpha);
		} else {
			__io__block.writeFloat(__io__address + 508, shad_alpha);
		}
	}

	/**
	 * Get method for struct member 'septex'.
	 * @see #__DNA__FIELD__septex
	 */
	
	public int getSeptex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 536);
		} else {
			return __io__block.readInt(__io__address + 512);
		}
	}

	/**
	 * Set method for struct member 'septex'.
	 * @see #__DNA__FIELD__septex
	 */
	
	public void setSeptex(int septex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 536, septex);
		} else {
			__io__block.writeInt(__io__address + 512, septex);
		}
	}

	/**
	 * Get method for struct member 'rgbsel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for buttons and render </p>
	 * @see #__DNA__FIELD__rgbsel
	 */
	
	public byte getRgbsel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 540);
		} else {
			return __io__block.readByte(__io__address + 516);
		}
	}

	/**
	 * Set method for struct member 'rgbsel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for buttons and render </p>
	 * @see #__DNA__FIELD__rgbsel
	 */
	
	public void setRgbsel(byte rgbsel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 540, rgbsel);
		} else {
			__io__block.writeByte(__io__address + 516, rgbsel);
		}
	}

	/**
	 * Get method for struct member 'texact'.
	 * @see #__DNA__FIELD__texact
	 */
	
	public byte getTexact() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 541);
		} else {
			return __io__block.readByte(__io__address + 517);
		}
	}

	/**
	 * Set method for struct member 'texact'.
	 * @see #__DNA__FIELD__texact
	 */
	
	public void setTexact(byte texact) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 541, texact);
		} else {
			__io__block.writeByte(__io__address + 517, texact);
		}
	}

	/**
	 * Get method for struct member 'pr_type'.
	 * @see #__DNA__FIELD__pr_type
	 */
	
	public byte getPr_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 542);
		} else {
			return __io__block.readByte(__io__address + 518);
		}
	}

	/**
	 * Set method for struct member 'pr_type'.
	 * @see #__DNA__FIELD__pr_type
	 */
	
	public void setPr_type(byte pr_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 542, pr_type);
		} else {
			__io__block.writeByte(__io__address + 518, pr_type);
		}
	}

	/**
	 * Get method for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes to render the material
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public byte getUse_nodes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 543);
		} else {
			return __io__block.readByte(__io__address + 519);
		}
	}

	/**
	 * Set method for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes to render the material
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public void setUse_nodes(byte use_nodes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 543, use_nodes);
		} else {
			__io__block.writeByte(__io__address + 519, use_nodes);
		}
	}

	/**
	 * Get method for struct member 'pr_lamp'.
	 * @see #__DNA__FIELD__pr_lamp
	 */
	
	public short getPr_lamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 544);
		} else {
			return __io__block.readShort(__io__address + 520);
		}
	}

	/**
	 * Set method for struct member 'pr_lamp'.
	 * @see #__DNA__FIELD__pr_lamp
	 */
	
	public void setPr_lamp(short pr_lamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 544, pr_lamp);
		} else {
			__io__block.writeShort(__io__address + 520, pr_lamp);
		}
	}

	/**
	 * Get method for struct member 'pr_texture'.
	 * @see #__DNA__FIELD__pr_texture
	 */
	
	public short getPr_texture() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 546);
		} else {
			return __io__block.readShort(__io__address + 522);
		}
	}

	/**
	 * Set method for struct member 'pr_texture'.
	 * @see #__DNA__FIELD__pr_texture
	 */
	
	public void setPr_texture(short pr_texture) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 546, pr_texture);
		} else {
			__io__block.writeShort(__io__address + 522, pr_texture);
		}
	}

	/**
	 * Get method for struct member 'ml_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ml_flag is for disable base material </p>
	 * @see #__DNA__FIELD__ml_flag
	 */
	
	public short getMl_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 548);
		} else {
			return __io__block.readShort(__io__address + 524);
		}
	}

	/**
	 * Set method for struct member 'ml_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ml_flag is for disable base material </p>
	 * @see #__DNA__FIELD__ml_flag
	 */
	
	public void setMl_flag(short ml_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 548, ml_flag);
		} else {
			__io__block.writeShort(__io__address + 524, ml_flag);
		}
	}

	/**
	 * Get method for struct member 'mapflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> mapping </p>
	 * @see #__DNA__FIELD__mapflag
	 */
	
	public byte getMapflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 550);
		} else {
			return __io__block.readByte(__io__address + 526);
		}
	}

	/**
	 * Set method for struct member 'mapflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> mapping </p>
	 * @see #__DNA__FIELD__mapflag
	 */
	
	public void setMapflag(byte mapflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 550, mapflag);
		} else {
			__io__block.writeByte(__io__address + 526, mapflag);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public byte getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 551);
		} else {
			return __io__block.readByte(__io__address + 527);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(byte pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 551, pad);
		} else {
			__io__block.writeByte(__io__address + 527, pad);
		}
	}

	/**
	 * Get method for struct member 'diff_shader'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> shaders </p>
	 * @see #__DNA__FIELD__diff_shader
	 */
	
	public short getDiff_shader() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 552);
		} else {
			return __io__block.readShort(__io__address + 528);
		}
	}

	/**
	 * Set method for struct member 'diff_shader'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> shaders </p>
	 * @see #__DNA__FIELD__diff_shader
	 */
	
	public void setDiff_shader(short diff_shader) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 552, diff_shader);
		} else {
			__io__block.writeShort(__io__address + 528, diff_shader);
		}
	}

	/**
	 * Get method for struct member 'spec_shader'.
	 * @see #__DNA__FIELD__spec_shader
	 */
	
	public short getSpec_shader() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 554);
		} else {
			return __io__block.readShort(__io__address + 530);
		}
	}

	/**
	 * Set method for struct member 'spec_shader'.
	 * @see #__DNA__FIELD__spec_shader
	 */
	
	public void setSpec_shader(short spec_shader) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 554, spec_shader);
		} else {
			__io__block.writeShort(__io__address + 530, spec_shader);
		}
	}

	/**
	 * Get method for struct member 'roughness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Oren-Nayar Roughness
	 * @see #__DNA__FIELD__roughness
	 */
	
	public float getRoughness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 556);
		} else {
			return __io__block.readFloat(__io__address + 532);
		}
	}

	/**
	 * Set method for struct member 'roughness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Oren-Nayar Roughness
	 * @see #__DNA__FIELD__roughness
	 */
	
	public void setRoughness(float roughness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 556, roughness);
		} else {
			__io__block.writeFloat(__io__address + 532, roughness);
		}
	}

	/**
	 * Get method for struct member 'refrac'.
	 * @see #__DNA__FIELD__refrac
	 */
	
	public float getRefrac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 560);
		} else {
			return __io__block.readFloat(__io__address + 536);
		}
	}

	/**
	 * Set method for struct member 'refrac'.
	 * @see #__DNA__FIELD__refrac
	 */
	
	public void setRefrac(float refrac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 560, refrac);
		} else {
			__io__block.writeFloat(__io__address + 536, refrac);
		}
	}

	/**
	 * Get method for struct member 'param'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX param[4] needs review and improvement (shader system as whole anyway) This is nasty reused variable for different goals and not easy to RNAify nicely. -jesterKing size, smooth, size, smooth, for toonshader, 0 (fac) and 1 (fresnel) also for fresnel shader </p>
	 * @see #__DNA__FIELD__param
	 */
	
	public CArrayFacade<Float> getParam() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 564, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 540, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'param'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX param[4] needs review and improvement (shader system as whole anyway) This is nasty reused variable for different goals and not easy to RNAify nicely. -jesterKing size, smooth, size, smooth, for toonshader, 0 (fac) and 1 (fresnel) also for fresnel shader </p>
	 * @see #__DNA__FIELD__param
	 */
	
	public void setParam(CArrayFacade<Float> param) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 564;
		} else {
			__dna__offset = 540;
		}
		if (__io__equals(param, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, param)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, param);
		} else {
			__io__generic__copy( getParam(), param);
		}
	}

	/**
	 * Get method for struct member 'rms'.
	 * @see #__DNA__FIELD__rms
	 */
	
	public float getRms() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 580);
		} else {
			return __io__block.readFloat(__io__address + 556);
		}
	}

	/**
	 * Set method for struct member 'rms'.
	 * @see #__DNA__FIELD__rms
	 */
	
	public void setRms(float rms) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 580, rms);
		} else {
			__io__block.writeFloat(__io__address + 556, rms);
		}
	}

	/**
	 * Get method for struct member 'darkness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minnaert darkness
	 * @see #__DNA__FIELD__darkness
	 */
	
	public float getDarkness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 584);
		} else {
			return __io__block.readFloat(__io__address + 560);
		}
	}

	/**
	 * Set method for struct member 'darkness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minnaert darkness
	 * @see #__DNA__FIELD__darkness
	 */
	
	public void setDarkness(float darkness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 584, darkness);
		} else {
			__io__block.writeFloat(__io__address + 560, darkness);
		}
	}

	/**
	 * Get method for struct member 'texco'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime - OR'd from 'mtex' </p>
	 * @see #__DNA__FIELD__texco
	 */
	
	public short getTexco() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 588);
		} else {
			return __io__block.readShort(__io__address + 564);
		}
	}

	/**
	 * Set method for struct member 'texco'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime - OR'd from 'mtex' </p>
	 * @see #__DNA__FIELD__texco
	 */
	
	public void setTexco(short texco) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 588, texco);
		} else {
			__io__block.writeShort(__io__address + 564, texco);
		}
	}

	/**
	 * Get method for struct member 'mapto'.
	 * @see #__DNA__FIELD__mapto
	 */
	
	public short getMapto() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 590);
		} else {
			return __io__block.readShort(__io__address + 566);
		}
	}

	/**
	 * Set method for struct member 'mapto'.
	 * @see #__DNA__FIELD__mapto
	 */
	
	public void setMapto(short mapto) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 590, mapto);
		} else {
			__io__block.writeShort(__io__address + 566, mapto);
		}
	}

	/**
	 * Get method for struct member 'ramp_col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ramp colors </p>
	 * @see #__DNA__FIELD__ramp_col
	 */
	
	public CPointer<ColorBand> getRamp_col() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 592);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 568);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ColorBand.class};
		return new CPointer<ColorBand>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ColorBand.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ramp_col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ramp colors </p>
	 * @see #__DNA__FIELD__ramp_col
	 */
	
	public void setRamp_col(CPointer<ColorBand> ramp_col) throws IOException
	{
		long __address = ((ramp_col == null) ? 0 : ramp_col.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 592, __address);
		} else {
			__io__block.writeLong(__io__address + 568, __address);
		}
	}

	/**
	 * Get method for struct member 'ramp_spec'.
	 * @see #__DNA__FIELD__ramp_spec
	 */
	
	public CPointer<ColorBand> getRamp_spec() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 600);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 572);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ColorBand.class};
		return new CPointer<ColorBand>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ColorBand.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ramp_spec'.
	 * @see #__DNA__FIELD__ramp_spec
	 */
	
	public void setRamp_spec(CPointer<ColorBand> ramp_spec) throws IOException
	{
		long __address = ((ramp_spec == null) ? 0 : ramp_spec.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 600, __address);
		} else {
			__io__block.writeLong(__io__address + 572, __address);
		}
	}

	/**
	 * Get method for struct member 'rampin_col'.
	 * @see #__DNA__FIELD__rampin_col
	 */
	
	public byte getRampin_col() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 608);
		} else {
			return __io__block.readByte(__io__address + 576);
		}
	}

	/**
	 * Set method for struct member 'rampin_col'.
	 * @see #__DNA__FIELD__rampin_col
	 */
	
	public void setRampin_col(byte rampin_col) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 608, rampin_col);
		} else {
			__io__block.writeByte(__io__address + 576, rampin_col);
		}
	}

	/**
	 * Get method for struct member 'rampin_spec'.
	 * @see #__DNA__FIELD__rampin_spec
	 */
	
	public byte getRampin_spec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 609);
		} else {
			return __io__block.readByte(__io__address + 577);
		}
	}

	/**
	 * Set method for struct member 'rampin_spec'.
	 * @see #__DNA__FIELD__rampin_spec
	 */
	
	public void setRampin_spec(byte rampin_spec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 609, rampin_spec);
		} else {
			__io__block.writeByte(__io__address + 577, rampin_spec);
		}
	}

	/**
	 * Get method for struct member 'rampblend_col'.
	 * @see #__DNA__FIELD__rampblend_col
	 */
	
	public byte getRampblend_col() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 610);
		} else {
			return __io__block.readByte(__io__address + 578);
		}
	}

	/**
	 * Set method for struct member 'rampblend_col'.
	 * @see #__DNA__FIELD__rampblend_col
	 */
	
	public void setRampblend_col(byte rampblend_col) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 610, rampblend_col);
		} else {
			__io__block.writeByte(__io__address + 578, rampblend_col);
		}
	}

	/**
	 * Get method for struct member 'rampblend_spec'.
	 * @see #__DNA__FIELD__rampblend_spec
	 */
	
	public byte getRampblend_spec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 611);
		} else {
			return __io__block.readByte(__io__address + 579);
		}
	}

	/**
	 * Set method for struct member 'rampblend_spec'.
	 * @see #__DNA__FIELD__rampblend_spec
	 */
	
	public void setRampblend_spec(byte rampblend_spec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 611, rampblend_spec);
		} else {
			__io__block.writeByte(__io__address + 579, rampblend_spec);
		}
	}

	/**
	 * Get method for struct member 'ramp_show'.
	 * @see #__DNA__FIELD__ramp_show
	 */
	
	public short getRamp_show() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 612);
		} else {
			return __io__block.readShort(__io__address + 580);
		}
	}

	/**
	 * Set method for struct member 'ramp_show'.
	 * @see #__DNA__FIELD__ramp_show
	 */
	
	public void setRamp_show(short ramp_show) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 612, ramp_show);
		} else {
			__io__block.writeShort(__io__address + 580, ramp_show);
		}
	}

	/**
	 * Get method for struct member 'pad3'.
	 * @see #__DNA__FIELD__pad3
	 */
	
	public short getPad3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 614);
		} else {
			return __io__block.readShort(__io__address + 582);
		}
	}

	/**
	 * Set method for struct member 'pad3'.
	 * @see #__DNA__FIELD__pad3
	 */
	
	public void setPad3(short pad3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 614, pad3);
		} else {
			__io__block.writeShort(__io__address + 582, pad3);
		}
	}

	/**
	 * Get method for struct member 'rampfac_col'.
	 * @see #__DNA__FIELD__rampfac_col
	 */
	
	public float getRampfac_col() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 616);
		} else {
			return __io__block.readFloat(__io__address + 584);
		}
	}

	/**
	 * Set method for struct member 'rampfac_col'.
	 * @see #__DNA__FIELD__rampfac_col
	 */
	
	public void setRampfac_col(float rampfac_col) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 616, rampfac_col);
		} else {
			__io__block.writeFloat(__io__address + 584, rampfac_col);
		}
	}

	/**
	 * Get method for struct member 'rampfac_spec'.
	 * @see #__DNA__FIELD__rampfac_spec
	 */
	
	public float getRampfac_spec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 620);
		} else {
			return __io__block.readFloat(__io__address + 588);
		}
	}

	/**
	 * Set method for struct member 'rampfac_spec'.
	 * @see #__DNA__FIELD__rampfac_spec
	 */
	
	public void setRampfac_spec(float rampfac_spec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 620, rampfac_spec);
		} else {
			__io__block.writeFloat(__io__address + 588, rampfac_spec);
		}
	}

	/**
	 * Get method for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX </p>
	 * @see #__DNA__FIELD__mtex
	 */
	
	public CArrayFacade<CPointer<MTex>> getMtex() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, MTex.class};
		int[] __dna__dimensions = new int[]{
			18
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<MTex>>(__io__address + 624, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<MTex>>(__io__address + 592, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX </p>
	 * @see #__DNA__FIELD__mtex
	 */
	
	public void setMtex(CArrayFacade<CPointer<MTex>> mtex) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 624;
		} else {
			__dna__offset = 592;
		}
		if (__io__equals(mtex, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mtex)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mtex);
		} else {
			__io__generic__copy( getMtex(), mtex);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 768);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 664);
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
			__io__block.writeLong(__io__address + 768, __address);
		} else {
			__io__block.writeLong(__io__address + 664, __address);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 776);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 668);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 776, __address);
		} else {
			__io__block.writeLong(__io__address + 668, __address);
		}
	}

	/**
	 * Get method for struct member 'group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> light group </p>
	 * @see #__DNA__FIELD__group
	 */
	
	public CPointer<Group> getGroup() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 784);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 672);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Group.class};
		return new CPointer<Group>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Group.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> light group </p>
	 * @see #__DNA__FIELD__group
	 */
	
	public void setGroup(CPointer<Group> group) throws IOException
	{
		long __address = ((group == null) ? 0 : group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 784, __address);
		} else {
			__io__block.writeLong(__io__address + 672, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 792);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 676);
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
			__io__block.writeLong(__io__address + 792, __address);
		} else {
			__io__block.writeLong(__io__address + 676, __address);
		}
	}

	/**
	 * Get method for struct member 'friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dynamic properties </p>
	 * @see #__DNA__FIELD__friction
	 */
	
	public float getFriction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 800);
		} else {
			return __io__block.readFloat(__io__address + 680);
		}
	}

	/**
	 * Set method for struct member 'friction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dynamic properties </p>
	 * @see #__DNA__FIELD__friction
	 */
	
	public void setFriction(float friction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 800, friction);
		} else {
			__io__block.writeFloat(__io__address + 680, friction);
		}
	}

	/**
	 * Get method for struct member 'fh'.
	 * @see #__DNA__FIELD__fh
	 */
	
	public float getFh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 804);
		} else {
			return __io__block.readFloat(__io__address + 684);
		}
	}

	/**
	 * Set method for struct member 'fh'.
	 * @see #__DNA__FIELD__fh
	 */
	
	public void setFh(float fh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 804, fh);
		} else {
			__io__block.writeFloat(__io__address + 684, fh);
		}
	}

	/**
	 * Get method for struct member 'reflect'.
	 * @see #__DNA__FIELD__reflect
	 */
	
	public float getReflect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 808);
		} else {
			return __io__block.readFloat(__io__address + 688);
		}
	}

	/**
	 * Set method for struct member 'reflect'.
	 * @see #__DNA__FIELD__reflect
	 */
	
	public void setReflect(float reflect) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 808, reflect);
		} else {
			__io__block.writeFloat(__io__address + 688, reflect);
		}
	}

	/**
	 * Get method for struct member 'fhdist'.
	 * @see #__DNA__FIELD__fhdist
	 */
	
	public float getFhdist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 812);
		} else {
			return __io__block.readFloat(__io__address + 692);
		}
	}

	/**
	 * Set method for struct member 'fhdist'.
	 * @see #__DNA__FIELD__fhdist
	 */
	
	public void setFhdist(float fhdist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 812, fhdist);
		} else {
			__io__block.writeFloat(__io__address + 692, fhdist);
		}
	}

	/**
	 * Get method for struct member 'xyfrict'.
	 * @see #__DNA__FIELD__xyfrict
	 */
	
	public float getXyfrict() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 816);
		} else {
			return __io__block.readFloat(__io__address + 696);
		}
	}

	/**
	 * Set method for struct member 'xyfrict'.
	 * @see #__DNA__FIELD__xyfrict
	 */
	
	public void setXyfrict(float xyfrict) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 816, xyfrict);
		} else {
			__io__block.writeFloat(__io__address + 696, xyfrict);
		}
	}

	/**
	 * Get method for struct member 'dynamode'.
	 * @see #__DNA__FIELD__dynamode
	 */
	
	public short getDynamode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 820);
		} else {
			return __io__block.readShort(__io__address + 700);
		}
	}

	/**
	 * Set method for struct member 'dynamode'.
	 * @see #__DNA__FIELD__dynamode
	 */
	
	public void setDynamode(short dynamode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 820, dynamode);
		} else {
			__io__block.writeShort(__io__address + 700, dynamode);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public short getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 822);
		} else {
			return __io__block.readShort(__io__address + 702);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(short pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 822, pad2);
		} else {
			__io__block.writeShort(__io__address + 702, pad2);
		}
	}

	/**
	 * Get method for struct member 'sss_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> subsurface scattering </p>
	 * @see #__DNA__FIELD__sss_radius
	 */
	
	public CArrayFacade<Float> getSss_radius() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 824, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 704, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sss_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> subsurface scattering </p>
	 * @see #__DNA__FIELD__sss_radius
	 */
	
	public void setSss_radius(CArrayFacade<Float> sss_radius) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 824;
		} else {
			__dna__offset = 704;
		}
		if (__io__equals(sss_radius, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sss_radius)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sss_radius);
		} else {
			__io__generic__copy( getSss_radius(), sss_radius);
		}
	}

	/**
	 * Get method for struct member 'sss_col'.
	 * @see #__DNA__FIELD__sss_col
	 */
	
	public CArrayFacade<Float> getSss_col() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 836, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 716, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sss_col'.
	 * @see #__DNA__FIELD__sss_col
	 */
	
	public void setSss_col(CArrayFacade<Float> sss_col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 836;
		} else {
			__dna__offset = 716;
		}
		if (__io__equals(sss_col, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sss_col)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sss_col);
		} else {
			__io__generic__copy( getSss_col(), sss_col);
		}
	}

	/**
	 * Get method for struct member 'sss_error'.
	 * @see #__DNA__FIELD__sss_error
	 */
	
	public float getSss_error() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 848);
		} else {
			return __io__block.readFloat(__io__address + 728);
		}
	}

	/**
	 * Set method for struct member 'sss_error'.
	 * @see #__DNA__FIELD__sss_error
	 */
	
	public void setSss_error(float sss_error) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 848, sss_error);
		} else {
			__io__block.writeFloat(__io__address + 728, sss_error);
		}
	}

	/**
	 * Get method for struct member 'sss_scale'.
	 * @see #__DNA__FIELD__sss_scale
	 */
	
	public float getSss_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 852);
		} else {
			return __io__block.readFloat(__io__address + 732);
		}
	}

	/**
	 * Set method for struct member 'sss_scale'.
	 * @see #__DNA__FIELD__sss_scale
	 */
	
	public void setSss_scale(float sss_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 852, sss_scale);
		} else {
			__io__block.writeFloat(__io__address + 732, sss_scale);
		}
	}

	/**
	 * Get method for struct member 'sss_ior'.
	 * @see #__DNA__FIELD__sss_ior
	 */
	
	public float getSss_ior() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 856);
		} else {
			return __io__block.readFloat(__io__address + 736);
		}
	}

	/**
	 * Set method for struct member 'sss_ior'.
	 * @see #__DNA__FIELD__sss_ior
	 */
	
	public void setSss_ior(float sss_ior) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 856, sss_ior);
		} else {
			__io__block.writeFloat(__io__address + 736, sss_ior);
		}
	}

	/**
	 * Get method for struct member 'sss_colfac'.
	 * @see #__DNA__FIELD__sss_colfac
	 */
	
	public float getSss_colfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 860);
		} else {
			return __io__block.readFloat(__io__address + 740);
		}
	}

	/**
	 * Set method for struct member 'sss_colfac'.
	 * @see #__DNA__FIELD__sss_colfac
	 */
	
	public void setSss_colfac(float sss_colfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 860, sss_colfac);
		} else {
			__io__block.writeFloat(__io__address + 740, sss_colfac);
		}
	}

	/**
	 * Get method for struct member 'sss_texfac'.
	 * @see #__DNA__FIELD__sss_texfac
	 */
	
	public float getSss_texfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 864);
		} else {
			return __io__block.readFloat(__io__address + 744);
		}
	}

	/**
	 * Set method for struct member 'sss_texfac'.
	 * @see #__DNA__FIELD__sss_texfac
	 */
	
	public void setSss_texfac(float sss_texfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 864, sss_texfac);
		} else {
			__io__block.writeFloat(__io__address + 744, sss_texfac);
		}
	}

	/**
	 * Get method for struct member 'sss_front'.
	 * @see #__DNA__FIELD__sss_front
	 */
	
	public float getSss_front() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 868);
		} else {
			return __io__block.readFloat(__io__address + 748);
		}
	}

	/**
	 * Set method for struct member 'sss_front'.
	 * @see #__DNA__FIELD__sss_front
	 */
	
	public void setSss_front(float sss_front) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 868, sss_front);
		} else {
			__io__block.writeFloat(__io__address + 748, sss_front);
		}
	}

	/**
	 * Get method for struct member 'sss_back'.
	 * @see #__DNA__FIELD__sss_back
	 */
	
	public float getSss_back() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 872);
		} else {
			return __io__block.readFloat(__io__address + 752);
		}
	}

	/**
	 * Set method for struct member 'sss_back'.
	 * @see #__DNA__FIELD__sss_back
	 */
	
	public void setSss_back(float sss_back) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 872, sss_back);
		} else {
			__io__block.writeFloat(__io__address + 752, sss_back);
		}
	}

	/**
	 * Get method for struct member 'sss_flag'.
	 * @see #__DNA__FIELD__sss_flag
	 */
	
	public short getSss_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 876);
		} else {
			return __io__block.readShort(__io__address + 756);
		}
	}

	/**
	 * Set method for struct member 'sss_flag'.
	 * @see #__DNA__FIELD__sss_flag
	 */
	
	public void setSss_flag(short sss_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 876, sss_flag);
		} else {
			__io__block.writeShort(__io__address + 756, sss_flag);
		}
	}

	/**
	 * Get method for struct member 'sss_preset'.
	 * @see #__DNA__FIELD__sss_preset
	 */
	
	public short getSss_preset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 878);
		} else {
			return __io__block.readShort(__io__address + 758);
		}
	}

	/**
	 * Set method for struct member 'sss_preset'.
	 * @see #__DNA__FIELD__sss_preset
	 */
	
	public void setSss_preset(short sss_preset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 878, sss_preset);
		} else {
			__io__block.writeShort(__io__address + 758, sss_preset);
		}
	}

	/**
	 * Get method for struct member 'mapto_textured'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> render-time cache to optimize texture lookups </p>
	 * @see #__DNA__FIELD__mapto_textured
	 */
	
	public int getMapto_textured() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 880);
		} else {
			return __io__block.readInt(__io__address + 760);
		}
	}

	/**
	 * Set method for struct member 'mapto_textured'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> render-time cache to optimize texture lookups </p>
	 * @see #__DNA__FIELD__mapto_textured
	 */
	
	public void setMapto_textured(int mapto_textured) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 880, mapto_textured);
		} else {
			__io__block.writeInt(__io__address + 760, mapto_textured);
		}
	}

	/**
	 * Get method for struct member 'shadowonly_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> "shadowsonly" type </p>
	 * @see #__DNA__FIELD__shadowonly_flag
	 */
	
	public short getShadowonly_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 884);
		} else {
			return __io__block.readShort(__io__address + 764);
		}
	}

	/**
	 * Set method for struct member 'shadowonly_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> "shadowsonly" type </p>
	 * @see #__DNA__FIELD__shadowonly_flag
	 */
	
	public void setShadowonly_flag(short shadowonly_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 884, shadowonly_flag);
		} else {
			__io__block.writeShort(__io__address + 764, shadowonly_flag);
		}
	}

	/**
	 * Get method for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> custom index for render passes </p>
	 * @see #__DNA__FIELD__index
	 */
	
	public short getIndex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 886);
		} else {
			return __io__block.readShort(__io__address + 766);
		}
	}

	/**
	 * Set method for struct member 'index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> custom index for render passes </p>
	 * @see #__DNA__FIELD__index
	 */
	
	public void setIndex(short index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 886, index);
		} else {
			__io__block.writeShort(__io__address + 766, index);
		}
	}

	/**
	 * Get method for struct member 'line_col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Freestyle line settings </p>
	 * @see #__DNA__FIELD__line_col
	 */
	
	public CArrayFacade<Float> getLine_col() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 888, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 768, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'line_col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Freestyle line settings </p>
	 * @see #__DNA__FIELD__line_col
	 */
	
	public void setLine_col(CArrayFacade<Float> line_col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 888;
		} else {
			__dna__offset = 768;
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
			return __io__block.readShort(__io__address + 904);
		} else {
			return __io__block.readShort(__io__address + 784);
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
			__io__block.writeShort(__io__address + 904, line_priority);
		} else {
			__io__block.writeShort(__io__address + 784, line_priority);
		}
	}

	/**
	 * Get method for struct member 'vcol_alpha'.
	 * @see #__DNA__FIELD__vcol_alpha
	 */
	
	public short getVcol_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 906);
		} else {
			return __io__block.readShort(__io__address + 786);
		}
	}

	/**
	 * Set method for struct member 'vcol_alpha'.
	 * @see #__DNA__FIELD__vcol_alpha
	 */
	
	public void setVcol_alpha(short vcol_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 906, vcol_alpha);
		} else {
			__io__block.writeShort(__io__address + 786, vcol_alpha);
		}
	}

	/**
	 * Get method for struct member 'paint_active_slot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index of active texture paint slot<h4>Blender Source Code:</h4>
	 * <p> texture painting </p>
	 * @see #__DNA__FIELD__paint_active_slot
	 */
	
	public short getPaint_active_slot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 908);
		} else {
			return __io__block.readShort(__io__address + 788);
		}
	}

	/**
	 * Set method for struct member 'paint_active_slot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index of active texture paint slot<h4>Blender Source Code:</h4>
	 * <p> texture painting </p>
	 * @see #__DNA__FIELD__paint_active_slot
	 */
	
	public void setPaint_active_slot(short paint_active_slot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 908, paint_active_slot);
		} else {
			__io__block.writeShort(__io__address + 788, paint_active_slot);
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
			return __io__block.readShort(__io__address + 910);
		} else {
			return __io__block.readShort(__io__address + 790);
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
			__io__block.writeShort(__io__address + 910, paint_clone_slot);
		} else {
			__io__block.writeShort(__io__address + 790, paint_clone_slot);
		}
	}

	/**
	 * Get method for struct member 'tot_slots'.
	 * @see #__DNA__FIELD__tot_slots
	 */
	
	public short getTot_slots() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 912);
		} else {
			return __io__block.readShort(__io__address + 792);
		}
	}

	/**
	 * Set method for struct member 'tot_slots'.
	 * @see #__DNA__FIELD__tot_slots
	 */
	
	public void setTot_slots(short tot_slots) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 912, tot_slots);
		} else {
			__io__block.writeShort(__io__address + 792, tot_slots);
		}
	}

	/**
	 * Get method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public CArrayFacade<Short> getPad4() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 914, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 794, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public void setPad4(CArrayFacade<Short> pad4) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 914;
		} else {
			__dna__offset = 794;
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
	 * Get method for struct member 'nmap_tangent_names'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multiple tangent (Normal Map node) [MAX_MTFACE+1][MAX_NAME]; +1 for empty name </p>
	 * @see #__DNA__FIELD__nmap_tangent_names
	 */
	
	public CArrayFacade<CArrayFacade<Byte>> getNmap_tangent_names() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Byte.class};
		int[] __dna__dimensions = new int[]{
			9,
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Byte>>(__io__address + 920, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Byte>>(__io__address + 800, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nmap_tangent_names'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> multiple tangent (Normal Map node) [MAX_MTFACE+1][MAX_NAME]; +1 for empty name </p>
	 * @see #__DNA__FIELD__nmap_tangent_names
	 */
	
	public void setNmap_tangent_names(CArrayFacade<CArrayFacade<Byte>> nmap_tangent_names) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 920;
		} else {
			__dna__offset = 800;
		}
		if (__io__equals(nmap_tangent_names, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nmap_tangent_names)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nmap_tangent_names);
		} else {
			__io__generic__copy( getNmap_tangent_names(), nmap_tangent_names);
		}
	}

	/**
	 * Get method for struct member 'nmap_tangent_names_count'.
	 * @see #__DNA__FIELD__nmap_tangent_names_count
	 */
	
	public int getNmap_tangent_names_count() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1496);
		} else {
			return __io__block.readInt(__io__address + 1376);
		}
	}

	/**
	 * Set method for struct member 'nmap_tangent_names_count'.
	 * @see #__DNA__FIELD__nmap_tangent_names_count
	 */
	
	public void setNmap_tangent_names_count(int nmap_tangent_names_count) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1496, nmap_tangent_names_count);
		} else {
			__io__block.writeInt(__io__address + 1376, nmap_tangent_names_count);
		}
	}

	/**
	 * Get method for struct member 'pad5'.
	 * @see #__DNA__FIELD__pad5
	 */
	
	public int getPad5() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1500);
		} else {
			return __io__block.readInt(__io__address + 1380);
		}
	}

	/**
	 * Set method for struct member 'pad5'.
	 * @see #__DNA__FIELD__pad5
	 */
	
	public void setPad5(int pad5) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1500, pad5);
		} else {
			__io__block.writeInt(__io__address + 1380, pad5);
		}
	}

	/**
	 * Get method for struct member 'texpaintslot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cached slot for painting. Make sure to recalculate before use with refresh_texpaint_image_cache </p>
	 * @see #__DNA__FIELD__texpaintslot
	 */
	
	public CPointer<TexPaintSlot> getTexpaintslot() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1504);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1384);
		}
		Class<?>[] __dna__targetTypes = new Class[]{TexPaintSlot.class};
		return new CPointer<TexPaintSlot>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, TexPaintSlot.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'texpaintslot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cached slot for painting. Make sure to recalculate before use with refresh_texpaint_image_cache </p>
	 * @see #__DNA__FIELD__texpaintslot
	 */
	
	public void setTexpaintslot(CPointer<TexPaintSlot> texpaintslot) throws IOException
	{
		long __address = ((texpaintslot == null) ? 0 : texpaintslot.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1504, __address);
		} else {
			__io__block.writeLong(__io__address + 1384, __address);
		}
	}

	/**
	 * Get method for struct member 'gpumaterial'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime </p>
	 * @see #__DNA__FIELD__gpumaterial
	 */
	
	public ListBase getGpumaterial() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 1512, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 1388, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gpumaterial'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime </p>
	 * @see #__DNA__FIELD__gpumaterial
	 */
	
	public void setGpumaterial(ListBase gpumaterial) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1512;
		} else {
			__dna__offset = 1388;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Material> __io__addressof() {
		return new CPointer<Material>(__io__address, new Class[]{Material.class}, __io__block, __io__blockTable);
	}

}
