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

@CMetaData(size32=1368, size64=1400)
public class OceanModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct OceanModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for OceanModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 135;

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
	 * <li>Actual Size (32bit/64bit): 112/136</li>
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
	public static final long[] __DNA__FIELD__ocean = new long[]{112, 136};

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
	public static final long[] __DNA__FIELD__oceancache = new long[]{116, 144};

	/**
	 * Field descriptor (offset) for struct member 'resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Render resolution. </p>
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
	public static final long[] __DNA__FIELD__resolution = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'viewport_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Viewport resolution for the non-render case. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__viewport_resolution);
	 * CPointer&lt;Integer&gt; p_viewport_resolution = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewport_resolution'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewport_resolution = new long[]{124, 156};

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
	public static final long[] __DNA__FIELD__spatial_size = new long[]{128, 160};

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
	public static final long[] __DNA__FIELD__wind_velocity = new long[]{132, 164};

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
	public static final long[] __DNA__FIELD__damp = new long[]{136, 168};

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
	public static final long[] __DNA__FIELD__smallest_wave = new long[]{140, 172};

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
	public static final long[] __DNA__FIELD__depth = new long[]{144, 176};

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
	public static final long[] __DNA__FIELD__wave_alignment = new long[]{148, 180};

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
	public static final long[] __DNA__FIELD__wave_direction = new long[]{152, 184};

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
	public static final long[] __DNA__FIELD__wave_scale = new long[]{156, 188};

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
	public static final long[] __DNA__FIELD__chop_amount = new long[]{160, 192};

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
	public static final long[] __DNA__FIELD__foam_coverage = new long[]{164, 196};

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
	public static final long[] __DNA__FIELD__time = new long[]{168, 200};

	/**
	 * Field descriptor (offset) for struct member 'spectrum'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Spectrum being used. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__spectrum);
	 * CPointer&lt;Integer&gt; p_spectrum = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spectrum'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spectrum = new long[]{172, 204};

	/**
	 * Field descriptor (offset) for struct member 'fetch_jonswap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Common JONSWAP parameters. This is the distance from a lee shore, called the fetch, or the distance over which the wind blows with constant velocity. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__fetch_jonswap);
	 * CPointer&lt;Float&gt; p_fetch_jonswap = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fetch_jonswap'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fetch_jonswap = new long[]{176, 208};

	/**
	 * Field descriptor (offset) for struct member 'sharpen_peak_jonswap'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__sharpen_peak_jonswap);
	 * CPointer&lt;Float&gt; p_sharpen_peak_jonswap = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sharpen_peak_jonswap'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sharpen_peak_jonswap = new long[]{180, 212};

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
	public static final long[] __DNA__FIELD__bakestart = new long[]{184, 216};

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
	public static final long[] __DNA__FIELD__bakeend = new long[]{188, 220};

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
	public static final long[] __DNA__FIELD__cachepath = new long[]{192, 224};

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
	public static final long[] __DNA__FIELD__foamlayername = new long[]{1216, 1248};

	/**
	 * Field descriptor (offset) for struct member 'spraylayername'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanModifierData oceanmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = oceanmodifierdata.__dna__addressof(OceanModifierData.__DNA__FIELD__spraylayername);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_spraylayername = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spraylayername'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spraylayername = new long[]{1280, 1312};

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
	public static final long[] __DNA__FIELD__cached = new long[]{1344, 1376};

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
	public static final long[] __DNA__FIELD__geometry_mode = new long[]{1345, 1377};

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
	public static final long[] __DNA__FIELD__flag = new long[]{1346, 1378};

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
	public static final long[] __DNA__FIELD___pad2 = new long[]{1347, 1379};

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
	public static final long[] __DNA__FIELD__repeat_x = new long[]{1348, 1380};

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
	public static final long[] __DNA__FIELD__repeat_y = new long[]{1350, 1382};

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
	public static final long[] __DNA__FIELD__seed = new long[]{1352, 1384};

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
	public static final long[] __DNA__FIELD__size = new long[]{1356, 1388};

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
	public static final long[] __DNA__FIELD__foam_fade = new long[]{1360, 1392};

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
	public static final long[] __DNA__FIELD___pad = new long[]{1364, 1396};

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
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
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
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 116);
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
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
		}
	}

	/**
	 * Get method for struct member 'resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Render resolution. </p>
	 * @see #__DNA__FIELD__resolution
	 */
	
	public int getResolution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 152);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Render resolution. </p>
	 * @see #__DNA__FIELD__resolution
	 */
	
	public void setResolution(int resolution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 152, resolution);
		} else {
			__io__block.writeInt(__io__address + 120, resolution);
		}
	}

	/**
	 * Get method for struct member 'viewport_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Viewport resolution for the non-render case. </p>
	 * @see #__DNA__FIELD__viewport_resolution
	 */
	
	public int getViewport_resolution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 156);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'viewport_resolution'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Viewport resolution for the non-render case. </p>
	 * @see #__DNA__FIELD__viewport_resolution
	 */
	
	public void setViewport_resolution(int viewport_resolution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 156, viewport_resolution);
		} else {
			__io__block.writeInt(__io__address + 124, viewport_resolution);
		}
	}

	/**
	 * Get method for struct member 'spatial_size'.
	 * @see #__DNA__FIELD__spatial_size
	 */
	
	public int getSpatial_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 160);
		} else {
			return __io__block.readInt(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'spatial_size'.
	 * @see #__DNA__FIELD__spatial_size
	 */
	
	public void setSpatial_size(int spatial_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 160, spatial_size);
		} else {
			__io__block.writeInt(__io__address + 128, spatial_size);
		}
	}

	/**
	 * Get method for struct member 'wind_velocity'.
	 * @see #__DNA__FIELD__wind_velocity
	 */
	
	public float getWind_velocity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'wind_velocity'.
	 * @see #__DNA__FIELD__wind_velocity
	 */
	
	public void setWind_velocity(float wind_velocity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, wind_velocity);
		} else {
			__io__block.writeFloat(__io__address + 132, wind_velocity);
		}
	}

	/**
	 * Get method for struct member 'damp'.
	 * @see #__DNA__FIELD__damp
	 */
	
	public float getDamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'damp'.
	 * @see #__DNA__FIELD__damp
	 */
	
	public void setDamp(float damp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, damp);
		} else {
			__io__block.writeFloat(__io__address + 136, damp);
		}
	}

	/**
	 * Get method for struct member 'smallest_wave'.
	 * @see #__DNA__FIELD__smallest_wave
	 */
	
	public float getSmallest_wave() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'smallest_wave'.
	 * @see #__DNA__FIELD__smallest_wave
	 */
	
	public void setSmallest_wave(float smallest_wave) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, smallest_wave);
		} else {
			__io__block.writeFloat(__io__address + 140, smallest_wave);
		}
	}

	/**
	 * Get method for struct member 'depth'.
	 * @see #__DNA__FIELD__depth
	 */
	
	public float getDepth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'depth'.
	 * @see #__DNA__FIELD__depth
	 */
	
	public void setDepth(float depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, depth);
		} else {
			__io__block.writeFloat(__io__address + 144, depth);
		}
	}

	/**
	 * Get method for struct member 'wave_alignment'.
	 * @see #__DNA__FIELD__wave_alignment
	 */
	
	public float getWave_alignment() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'wave_alignment'.
	 * @see #__DNA__FIELD__wave_alignment
	 */
	
	public void setWave_alignment(float wave_alignment) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, wave_alignment);
		} else {
			__io__block.writeFloat(__io__address + 148, wave_alignment);
		}
	}

	/**
	 * Get method for struct member 'wave_direction'.
	 * @see #__DNA__FIELD__wave_direction
	 */
	
	public float getWave_direction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'wave_direction'.
	 * @see #__DNA__FIELD__wave_direction
	 */
	
	public void setWave_direction(float wave_direction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, wave_direction);
		} else {
			__io__block.writeFloat(__io__address + 152, wave_direction);
		}
	}

	/**
	 * Get method for struct member 'wave_scale'.
	 * @see #__DNA__FIELD__wave_scale
	 */
	
	public float getWave_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'wave_scale'.
	 * @see #__DNA__FIELD__wave_scale
	 */
	
	public void setWave_scale(float wave_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, wave_scale);
		} else {
			__io__block.writeFloat(__io__address + 156, wave_scale);
		}
	}

	/**
	 * Get method for struct member 'chop_amount'.
	 * @see #__DNA__FIELD__chop_amount
	 */
	
	public float getChop_amount() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'chop_amount'.
	 * @see #__DNA__FIELD__chop_amount
	 */
	
	public void setChop_amount(float chop_amount) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, chop_amount);
		} else {
			__io__block.writeFloat(__io__address + 160, chop_amount);
		}
	}

	/**
	 * Get method for struct member 'foam_coverage'.
	 * @see #__DNA__FIELD__foam_coverage
	 */
	
	public float getFoam_coverage() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 196);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'foam_coverage'.
	 * @see #__DNA__FIELD__foam_coverage
	 */
	
	public void setFoam_coverage(float foam_coverage) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 196, foam_coverage);
		} else {
			__io__block.writeFloat(__io__address + 164, foam_coverage);
		}
	}

	/**
	 * Get method for struct member 'time'.
	 * @see #__DNA__FIELD__time
	 */
	
	public float getTime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'time'.
	 * @see #__DNA__FIELD__time
	 */
	
	public void setTime(float time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, time);
		} else {
			__io__block.writeFloat(__io__address + 168, time);
		}
	}

	/**
	 * Get method for struct member 'spectrum'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Spectrum being used. </p>
	 * @see #__DNA__FIELD__spectrum
	 */
	
	public int getSpectrum() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 204);
		} else {
			return __io__block.readInt(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'spectrum'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Spectrum being used. </p>
	 * @see #__DNA__FIELD__spectrum
	 */
	
	public void setSpectrum(int spectrum) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 204, spectrum);
		} else {
			__io__block.writeInt(__io__address + 172, spectrum);
		}
	}

	/**
	 * Get method for struct member 'fetch_jonswap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Common JONSWAP parameters. This is the distance from a lee shore, called the fetch, or the distance over which the wind blows with constant velocity. </p>
	 * @see #__DNA__FIELD__fetch_jonswap
	 */
	
	public float getFetch_jonswap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'fetch_jonswap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Common JONSWAP parameters. This is the distance from a lee shore, called the fetch, or the distance over which the wind blows with constant velocity. </p>
	 * @see #__DNA__FIELD__fetch_jonswap
	 */
	
	public void setFetch_jonswap(float fetch_jonswap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, fetch_jonswap);
		} else {
			__io__block.writeFloat(__io__address + 176, fetch_jonswap);
		}
	}

	/**
	 * Get method for struct member 'sharpen_peak_jonswap'.
	 * @see #__DNA__FIELD__sharpen_peak_jonswap
	 */
	
	public float getSharpen_peak_jonswap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'sharpen_peak_jonswap'.
	 * @see #__DNA__FIELD__sharpen_peak_jonswap
	 */
	
	public void setSharpen_peak_jonswap(float sharpen_peak_jonswap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, sharpen_peak_jonswap);
		} else {
			__io__block.writeFloat(__io__address + 180, sharpen_peak_jonswap);
		}
	}

	/**
	 * Get method for struct member 'bakestart'.
	 * @see #__DNA__FIELD__bakestart
	 */
	
	public int getBakestart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 216);
		} else {
			return __io__block.readInt(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'bakestart'.
	 * @see #__DNA__FIELD__bakestart
	 */
	
	public void setBakestart(int bakestart) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 216, bakestart);
		} else {
			__io__block.writeInt(__io__address + 184, bakestart);
		}
	}

	/**
	 * Get method for struct member 'bakeend'.
	 * @see #__DNA__FIELD__bakeend
	 */
	
	public int getBakeend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 220);
		} else {
			return __io__block.readInt(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'bakeend'.
	 * @see #__DNA__FIELD__bakeend
	 */
	
	public void setBakeend(int bakeend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 220, bakeend);
		} else {
			__io__block.writeInt(__io__address + 188, bakeend);
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
			return new CArrayFacade<Byte>(__io__address + 224, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 224;
		} else {
			__dna__offset = 192;
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
			return new CArrayFacade<Byte>(__io__address + 1248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1248;
		} else {
			__dna__offset = 1216;
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
	 * Get method for struct member 'spraylayername'.
	 * @see #__DNA__FIELD__spraylayername
	 */
	
	public CArrayFacade<Byte> getSpraylayername() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1312, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1280, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'spraylayername'.
	 * @see #__DNA__FIELD__spraylayername
	 */
	
	public void setSpraylayername(CArrayFacade<Byte> spraylayername) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1312;
		} else {
			__dna__offset = 1280;
		}
		if (__io__equals(spraylayername, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, spraylayername)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, spraylayername);
		} else {
			__io__generic__copy( getSpraylayername(), spraylayername);
		}
	}

	/**
	 * Get method for struct member 'cached'.
	 * @see #__DNA__FIELD__cached
	 */
	
	public byte getCached() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1376);
		} else {
			return __io__block.readByte(__io__address + 1344);
		}
	}

	/**
	 * Set method for struct member 'cached'.
	 * @see #__DNA__FIELD__cached
	 */
	
	public void setCached(byte cached) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1376, cached);
		} else {
			__io__block.writeByte(__io__address + 1344, cached);
		}
	}

	/**
	 * Get method for struct member 'geometry_mode'.
	 * @see #__DNA__FIELD__geometry_mode
	 */
	
	public byte getGeometry_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1377);
		} else {
			return __io__block.readByte(__io__address + 1345);
		}
	}

	/**
	 * Set method for struct member 'geometry_mode'.
	 * @see #__DNA__FIELD__geometry_mode
	 */
	
	public void setGeometry_mode(byte geometry_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1377, geometry_mode);
		} else {
			__io__block.writeByte(__io__address + 1345, geometry_mode);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1378);
		} else {
			return __io__block.readByte(__io__address + 1346);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1378, flag);
		} else {
			__io__block.writeByte(__io__address + 1346, flag);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public byte get_pad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1379);
		} else {
			return __io__block.readByte(__io__address + 1347);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(byte _pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1379, _pad2);
		} else {
			__io__block.writeByte(__io__address + 1347, _pad2);
		}
	}

	/**
	 * Get method for struct member 'repeat_x'.
	 * @see #__DNA__FIELD__repeat_x
	 */
	
	public short getRepeat_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1380);
		} else {
			return __io__block.readShort(__io__address + 1348);
		}
	}

	/**
	 * Set method for struct member 'repeat_x'.
	 * @see #__DNA__FIELD__repeat_x
	 */
	
	public void setRepeat_x(short repeat_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1380, repeat_x);
		} else {
			__io__block.writeShort(__io__address + 1348, repeat_x);
		}
	}

	/**
	 * Get method for struct member 'repeat_y'.
	 * @see #__DNA__FIELD__repeat_y
	 */
	
	public short getRepeat_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1382);
		} else {
			return __io__block.readShort(__io__address + 1350);
		}
	}

	/**
	 * Set method for struct member 'repeat_y'.
	 * @see #__DNA__FIELD__repeat_y
	 */
	
	public void setRepeat_y(short repeat_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1382, repeat_y);
		} else {
			__io__block.writeShort(__io__address + 1350, repeat_y);
		}
	}

	/**
	 * Get method for struct member 'seed'.
	 * @see #__DNA__FIELD__seed
	 */
	
	public int getSeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1384);
		} else {
			return __io__block.readInt(__io__address + 1352);
		}
	}

	/**
	 * Set method for struct member 'seed'.
	 * @see #__DNA__FIELD__seed
	 */
	
	public void setSeed(int seed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1384, seed);
		} else {
			__io__block.writeInt(__io__address + 1352, seed);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public float getSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1388);
		} else {
			return __io__block.readFloat(__io__address + 1356);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(float size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1388, size);
		} else {
			__io__block.writeFloat(__io__address + 1356, size);
		}
	}

	/**
	 * Get method for struct member 'foam_fade'.
	 * @see #__DNA__FIELD__foam_fade
	 */
	
	public float getFoam_fade() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1392);
		} else {
			return __io__block.readFloat(__io__address + 1360);
		}
	}

	/**
	 * Set method for struct member 'foam_fade'.
	 * @see #__DNA__FIELD__foam_fade
	 */
	
	public void setFoam_fade(float foam_fade) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1392, foam_fade);
		} else {
			__io__block.writeFloat(__io__address + 1360, foam_fade);
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
			return new CArrayFacade<Byte>(__io__address + 1396, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1364, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 1396;
		} else {
			__dna__offset = 1364;
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
