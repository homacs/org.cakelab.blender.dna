package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'OceanModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1276, size64=1304)
public class OceanModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct OceanModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for OceanModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 133;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'ocean'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__ocean);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_ocean = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ocean'</li>
	 * <li>Signature: 'Ocean*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ocean = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'oceancache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__oceancache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_oceancache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'oceancache'</li>
	 * <li>Signature: 'OceanCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__oceancache = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'resolution'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__resolution);
	 * CPointer&lt;Integer&gt; p_resolution = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'resolution'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__resolution = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'spatial_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__spatial_size);
	 * CPointer&lt;Integer&gt; p_spatial_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spatial_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spatial_size = new long[]{112, 140};

	/**
	 * Field descriptor (offset) for struct member 'wind_velocity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__wind_velocity);
	 * CPointer&lt;Float&gt; p_wind_velocity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wind_velocity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wind_velocity = new long[]{116, 144};

	/**
	 * Field descriptor (offset) for struct member 'damp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__damp);
	 * CPointer&lt;Float&gt; p_damp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'damp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__damp = new long[]{120, 148};

	/**
	 * Field descriptor (offset) for struct member 'smallest_wave'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__smallest_wave);
	 * CPointer&lt;Float&gt; p_smallest_wave = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smallest_wave'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smallest_wave = new long[]{124, 152};

	/**
	 * Field descriptor (offset) for struct member 'depth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__depth);
	 * CPointer&lt;Float&gt; p_depth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'depth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__depth = new long[]{128, 156};

	/**
	 * Field descriptor (offset) for struct member 'wave_alignment'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__wave_alignment);
	 * CPointer&lt;Float&gt; p_wave_alignment = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wave_alignment'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wave_alignment = new long[]{132, 160};

	/**
	 * Field descriptor (offset) for struct member 'wave_direction'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__wave_direction);
	 * CPointer&lt;Float&gt; p_wave_direction = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wave_direction'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wave_direction = new long[]{136, 164};

	/**
	 * Field descriptor (offset) for struct member 'wave_scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__wave_scale);
	 * CPointer&lt;Float&gt; p_wave_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wave_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wave_scale = new long[]{140, 168};

	/**
	 * Field descriptor (offset) for struct member 'chop_amount'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__chop_amount);
	 * CPointer&lt;Float&gt; p_chop_amount = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'chop_amount'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__chop_amount = new long[]{144, 172};

	/**
	 * Field descriptor (offset) for struct member 'foam_coverage'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__foam_coverage);
	 * CPointer&lt;Float&gt; p_foam_coverage = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'foam_coverage'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__foam_coverage = new long[]{148, 176};

	/**
	 * Field descriptor (offset) for struct member 'time'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__time);
	 * CPointer&lt;Float&gt; p_time = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time = new long[]{152, 180};

	/**
	 * Field descriptor (offset) for struct member 'bakestart'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__bakestart);
	 * CPointer&lt;Integer&gt; p_bakestart = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bakestart'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bakestart = new long[]{156, 184};

	/**
	 * Field descriptor (offset) for struct member 'bakeend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__bakeend);
	 * CPointer&lt;Integer&gt; p_bakeend = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bakeend'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bakeend = new long[]{160, 188};

	/**
	 * Field descriptor (offset) for struct member 'cachepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__cachepath);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_cachepath = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cachepath'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cachepath = new long[]{164, 192};

	/**
	 * Field descriptor (offset) for struct member 'foamlayername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__foamlayername);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_foamlayername = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'foamlayername'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__foamlayername = new long[]{1188, 1216};

	/**
	 * Field descriptor (offset) for struct member 'cached'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__cached);
	 * CPointer&lt;Byte&gt; p_cached = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cached'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cached = new long[]{1252, 1280};

	/**
	 * Field descriptor (offset) for struct member 'geometry_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__geometry_mode);
	 * CPointer&lt;Byte&gt; p_geometry_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'geometry_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__geometry_mode = new long[]{1253, 1281};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{1254, 1282};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD___pad2);
	 * CPointer&lt;Byte&gt; p__pad2 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{1255, 1283};

	/**
	 * Field descriptor (offset) for struct member 'repeat_x'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__repeat_x);
	 * CPointer&lt;Short&gt; p_repeat_x = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'repeat_x'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__repeat_x = new long[]{1256, 1284};

	/**
	 * Field descriptor (offset) for struct member 'repeat_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__repeat_y);
	 * CPointer&lt;Short&gt; p_repeat_y = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'repeat_y'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__repeat_y = new long[]{1258, 1286};

	/**
	 * Field descriptor (offset) for struct member 'seed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__seed);
	 * CPointer&lt;Integer&gt; p_seed = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seed'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seed = new long[]{1260, 1288};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__size);
	 * CPointer&lt;Float&gt; p_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{1264, 1292};

	/**
	 * Field descriptor (offset) for struct member 'foam_fade'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__foam_fade);
	 * CPointer&lt;Float&gt; p_foam_fade = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'foam_fade'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__foam_fade = new long[]{1268, 1296};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{1272, 1300};

	public OceanModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected OceanModifierData(OceanModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public ModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(ModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'ocean'.
	 * @see #__DNA__FIELD__ocean
	 */
	
	public CPointer<Object> getOcean() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ocean'.
	 * @see #__DNA__FIELD__ocean
	 */
	
	public void setOcean(CPointer<Object> ocean) throws IOException
	{
		long __address = ((ocean == null) ? 0 : ocean.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'oceancache'.
	 * @see #__DNA__FIELD__oceancache
	 */
	
	public CPointer<Object> getOceancache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'oceancache'.
	 * @see #__DNA__FIELD__oceancache
	 */
	
	public void setOceancache(CPointer<Object> oceancache) throws IOException
	{
		long __address = ((oceancache == null) ? 0 : oceancache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'resolution'.
	 * @see #__DNA__FIELD__resolution
	 */
	
	public int getResolution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'resolution'.
	 * @see #__DNA__FIELD__resolution
	 */
	
	public void setResolution(int resolution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, resolution);
		} else {
			__io__block.writeInt(__io__address + 108, resolution);
		}
	}

	/**
	 * Get method for struct member 'spatial_size'.
	 * @see #__DNA__FIELD__spatial_size
	 */
	
	public int getSpatial_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 140);
		} else {
			return __io__block.readInt(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'spatial_size'.
	 * @see #__DNA__FIELD__spatial_size
	 */
	
	public void setSpatial_size(int spatial_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 140, spatial_size);
		} else {
			__io__block.writeInt(__io__address + 112, spatial_size);
		}
	}

	/**
	 * Get method for struct member 'wind_velocity'.
	 * @see #__DNA__FIELD__wind_velocity
	 */
	
	public float getWind_velocity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'wind_velocity'.
	 * @see #__DNA__FIELD__wind_velocity
	 */
	
	public void setWind_velocity(float wind_velocity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, wind_velocity);
		} else {
			__io__block.writeFloat(__io__address + 116, wind_velocity);
		}
	}

	/**
	 * Get method for struct member 'damp'.
	 * @see #__DNA__FIELD__damp
	 */
	
	public float getDamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'damp'.
	 * @see #__DNA__FIELD__damp
	 */
	
	public void setDamp(float damp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, damp);
		} else {
			__io__block.writeFloat(__io__address + 120, damp);
		}
	}

	/**
	 * Get method for struct member 'smallest_wave'.
	 * @see #__DNA__FIELD__smallest_wave
	 */
	
	public float getSmallest_wave() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'smallest_wave'.
	 * @see #__DNA__FIELD__smallest_wave
	 */
	
	public void setSmallest_wave(float smallest_wave) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, smallest_wave);
		} else {
			__io__block.writeFloat(__io__address + 124, smallest_wave);
		}
	}

	/**
	 * Get method for struct member 'depth'.
	 * @see #__DNA__FIELD__depth
	 */
	
	public float getDepth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'depth'.
	 * @see #__DNA__FIELD__depth
	 */
	
	public void setDepth(float depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, depth);
		} else {
			__io__block.writeFloat(__io__address + 128, depth);
		}
	}

	/**
	 * Get method for struct member 'wave_alignment'.
	 * @see #__DNA__FIELD__wave_alignment
	 */
	
	public float getWave_alignment() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'wave_alignment'.
	 * @see #__DNA__FIELD__wave_alignment
	 */
	
	public void setWave_alignment(float wave_alignment) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, wave_alignment);
		} else {
			__io__block.writeFloat(__io__address + 132, wave_alignment);
		}
	}

	/**
	 * Get method for struct member 'wave_direction'.
	 * @see #__DNA__FIELD__wave_direction
	 */
	
	public float getWave_direction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'wave_direction'.
	 * @see #__DNA__FIELD__wave_direction
	 */
	
	public void setWave_direction(float wave_direction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, wave_direction);
		} else {
			__io__block.writeFloat(__io__address + 136, wave_direction);
		}
	}

	/**
	 * Get method for struct member 'wave_scale'.
	 * @see #__DNA__FIELD__wave_scale
	 */
	
	public float getWave_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'wave_scale'.
	 * @see #__DNA__FIELD__wave_scale
	 */
	
	public void setWave_scale(float wave_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, wave_scale);
		} else {
			__io__block.writeFloat(__io__address + 140, wave_scale);
		}
	}

	/**
	 * Get method for struct member 'chop_amount'.
	 * @see #__DNA__FIELD__chop_amount
	 */
	
	public float getChop_amount() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'chop_amount'.
	 * @see #__DNA__FIELD__chop_amount
	 */
	
	public void setChop_amount(float chop_amount) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, chop_amount);
		} else {
			__io__block.writeFloat(__io__address + 144, chop_amount);
		}
	}

	/**
	 * Get method for struct member 'foam_coverage'.
	 * @see #__DNA__FIELD__foam_coverage
	 */
	
	public float getFoam_coverage() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'foam_coverage'.
	 * @see #__DNA__FIELD__foam_coverage
	 */
	
	public void setFoam_coverage(float foam_coverage) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, foam_coverage);
		} else {
			__io__block.writeFloat(__io__address + 148, foam_coverage);
		}
	}

	/**
	 * Get method for struct member 'time'.
	 * @see #__DNA__FIELD__time
	 */
	
	public float getTime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'time'.
	 * @see #__DNA__FIELD__time
	 */
	
	public void setTime(float time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, time);
		} else {
			__io__block.writeFloat(__io__address + 152, time);
		}
	}

	/**
	 * Get method for struct member 'bakestart'.
	 * @see #__DNA__FIELD__bakestart
	 */
	
	public int getBakestart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 184);
		} else {
			return __io__block.readInt(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'bakestart'.
	 * @see #__DNA__FIELD__bakestart
	 */
	
	public void setBakestart(int bakestart) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 184, bakestart);
		} else {
			__io__block.writeInt(__io__address + 156, bakestart);
		}
	}

	/**
	 * Get method for struct member 'bakeend'.
	 * @see #__DNA__FIELD__bakeend
	 */
	
	public int getBakeend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 188);
		} else {
			return __io__block.readInt(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'bakeend'.
	 * @see #__DNA__FIELD__bakeend
	 */
	
	public void setBakeend(int bakeend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 188, bakeend);
		} else {
			__io__block.writeInt(__io__address + 160, bakeend);
		}
	}

	/**
	 * Get method for struct member 'cachepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX. </p>
	 * @see #__DNA__FIELD__cachepath
	 */
	
	public CArrayFacade<Byte> getCachepath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 164, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cachepath'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX. </p>
	 * @see #__DNA__FIELD__cachepath
	 */
	
	public void setCachepath(CArrayFacade<Byte> cachepath) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 164;
		}
		if (__io__equals(cachepath, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cachepath)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cachepath);
		} else {
			__io__generic__copy( getCachepath(), cachepath);
		}
	}

	/**
	 * Get method for struct member 'foamlayername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__foamlayername
	 */
	
	public CArrayFacade<Byte> getFoamlayername() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'foamlayername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__foamlayername
	 */
	
	public void setFoamlayername(CArrayFacade<Byte> foamlayername) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1216;
		} else {
			__dna__offset = 1188;
		}
		if (__io__equals(foamlayername, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, foamlayername)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, foamlayername);
		} else {
			__io__generic__copy( getFoamlayername(), foamlayername);
		}
	}

	/**
	 * Get method for struct member 'cached'.
	 * @see #__DNA__FIELD__cached
	 */
	
	public byte getCached() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1280);
		} else {
			return __io__block.readByte(__io__address + 1252);
		}
	}

	/**
	 * Set method for struct member 'cached'.
	 * @see #__DNA__FIELD__cached
	 */
	
	public void setCached(byte cached) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1280, cached);
		} else {
			__io__block.writeByte(__io__address + 1252, cached);
		}
	}

	/**
	 * Get method for struct member 'geometry_mode'.
	 * @see #__DNA__FIELD__geometry_mode
	 */
	
	public byte getGeometry_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1281);
		} else {
			return __io__block.readByte(__io__address + 1253);
		}
	}

	/**
	 * Set method for struct member 'geometry_mode'.
	 * @see #__DNA__FIELD__geometry_mode
	 */
	
	public void setGeometry_mode(byte geometry_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1281, geometry_mode);
		} else {
			__io__block.writeByte(__io__address + 1253, geometry_mode);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1282);
		} else {
			return __io__block.readByte(__io__address + 1254);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1282, flag);
		} else {
			__io__block.writeByte(__io__address + 1254, flag);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public byte get_pad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1283);
		} else {
			return __io__block.readByte(__io__address + 1255);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(byte _pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1283, _pad2);
		} else {
			__io__block.writeByte(__io__address + 1255, _pad2);
		}
	}

	/**
	 * Get method for struct member 'repeat_x'.
	 * @see #__DNA__FIELD__repeat_x
	 */
	
	public short getRepeat_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1284);
		} else {
			return __io__block.readShort(__io__address + 1256);
		}
	}

	/**
	 * Set method for struct member 'repeat_x'.
	 * @see #__DNA__FIELD__repeat_x
	 */
	
	public void setRepeat_x(short repeat_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1284, repeat_x);
		} else {
			__io__block.writeShort(__io__address + 1256, repeat_x);
		}
	}

	/**
	 * Get method for struct member 'repeat_y'.
	 * @see #__DNA__FIELD__repeat_y
	 */
	
	public short getRepeat_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1286);
		} else {
			return __io__block.readShort(__io__address + 1258);
		}
	}

	/**
	 * Set method for struct member 'repeat_y'.
	 * @see #__DNA__FIELD__repeat_y
	 */
	
	public void setRepeat_y(short repeat_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1286, repeat_y);
		} else {
			__io__block.writeShort(__io__address + 1258, repeat_y);
		}
	}

	/**
	 * Get method for struct member 'seed'.
	 * @see #__DNA__FIELD__seed
	 */
	
	public int getSeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1288);
		} else {
			return __io__block.readInt(__io__address + 1260);
		}
	}

	/**
	 * Set method for struct member 'seed'.
	 * @see #__DNA__FIELD__seed
	 */
	
	public void setSeed(int seed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1288, seed);
		} else {
			__io__block.writeInt(__io__address + 1260, seed);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public float getSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1292);
		} else {
			return __io__block.readFloat(__io__address + 1264);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(float size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1292, size);
		} else {
			__io__block.writeFloat(__io__address + 1264, size);
		}
	}

	/**
	 * Get method for struct member 'foam_fade'.
	 * @see #__DNA__FIELD__foam_fade
	 */
	
	public float getFoam_fade() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1296);
		} else {
			return __io__block.readFloat(__io__address + 1268);
		}
	}

	/**
	 * Set method for struct member 'foam_fade'.
	 * @see #__DNA__FIELD__foam_fade
	 */
	
	public void setFoam_fade(float foam_fade) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1296, foam_fade);
		} else {
			__io__block.writeFloat(__io__address + 1268, foam_fade);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1300, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1272, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1300;
		} else {
			__dna__offset = 1272;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<OceanModifierData> __io__addressof() {
		return new CPointer<OceanModifierData>(__io__address, new Class[]{OceanModifierData.class}, __io__block, __io__blockTable);
	}

}
