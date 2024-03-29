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
 * Generated facet for DNA struct type 'LightProbe'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=232, size64=288)
public class LightProbe extends CFacade {

	/**
	 * This is the sdna index of the struct LightProbe.
	 * <p>
	 * It is required when allocating a new block to store data for LightProbe.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 232;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__id);
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
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__adt);
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
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Type of light probe
	 * <h4>Blender Source Code</h4>
	 * <p> For realtime probe objects. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{156, 200};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> General purpose flags for probes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{157, 201};

	/**
	 * Field descriptor (offset) for struct member 'attenuation_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Attenuation type. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__attenuation_type);
	 * CPointer&lt;Byte&gt; p_attenuation_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attenuation_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attenuation_type = new long[]{158, 202};

	/**
	 * Field descriptor (offset) for struct member 'parallax_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Type of parallax volume
	 * <h4>Blender Source Code</h4>
	 * <p> Parallax type. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__parallax_type);
	 * CPointer&lt;Byte&gt; p_parallax_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parallax_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parallax_type = new long[]{159, 203};

	/**
	 * Field descriptor (offset) for struct member 'distinf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Influence Radius. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__distinf);
	 * CPointer&lt;Float&gt; p_distinf = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distinf'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distinf = new long[]{160, 204};

	/**
	 * Field descriptor (offset) for struct member 'distpar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Parallax Radius. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__distpar);
	 * CPointer&lt;Float&gt; p_distpar = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distpar'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distpar = new long[]{164, 208};

	/**
	 * Field descriptor (offset) for struct member 'falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Control how fast the probe influence decreases
	 * <h4>Blender Source Code</h4>
	 * <p> Influence falloff. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__falloff);
	 * CPointer&lt;Float&gt; p_falloff = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff = new long[]{168, 212};

	/**
	 * Field descriptor (offset) for struct member 'clipsta'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__clipsta);
	 * CPointer&lt;Float&gt; p_clipsta = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clipsta'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clipsta = new long[]{172, 216};

	/**
	 * Field descriptor (offset) for struct member 'clipend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__clipend);
	 * CPointer&lt;Float&gt; p_clipend = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clipend'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clipend = new long[]{176, 220};

	/**
	 * Field descriptor (offset) for struct member 'vis_bias'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> VSM visibility biases. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__vis_bias);
	 * CPointer&lt;Float&gt; p_vis_bias = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vis_bias'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vis_bias = new long[]{180, 224};

	/**
	 * Field descriptor (offset) for struct member 'vis_bleedbias'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__vis_bleedbias);
	 * CPointer&lt;Float&gt; p_vis_bleedbias = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vis_bleedbias'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vis_bleedbias = new long[]{184, 228};

	/**
	 * Field descriptor (offset) for struct member 'vis_blur'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__vis_blur);
	 * CPointer&lt;Float&gt; p_vis_blur = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vis_blur'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vis_blur = new long[]{188, 232};

	/**
	 * Field descriptor (offset) for struct member 'intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Modify the intensity of the lighting captured by this probe
	 * <h4>Blender Source Code</h4>
	 * <p> Intensity multiplier. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__intensity);
	 * CPointer&lt;Float&gt; p_intensity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'intensity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__intensity = new long[]{192, 236};

	/**
	 * Field descriptor (offset) for struct member 'grid_resolution_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of sample along the x axis of the volume
	 * <h4>Blender Source Code</h4>
	 * <p> Irradiance grid resolution. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__grid_resolution_x);
	 * CPointer&lt;Integer&gt; p_grid_resolution_x = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grid_resolution_x'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grid_resolution_x = new long[]{196, 240};

	/**
	 * Field descriptor (offset) for struct member 'grid_resolution_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of sample along the y axis of the volume
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__grid_resolution_y);
	 * CPointer&lt;Integer&gt; p_grid_resolution_y = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grid_resolution_y'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grid_resolution_y = new long[]{200, 244};

	/**
	 * Field descriptor (offset) for struct member 'grid_resolution_z'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of sample along the z axis of the volume
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__grid_resolution_z);
	 * CPointer&lt;Integer&gt; p_grid_resolution_z = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grid_resolution_z'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grid_resolution_z = new long[]{204, 248};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{208, 252};

	/**
	 * Field descriptor (offset) for struct member 'parallax_ob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Object}  to use as a parallax origin. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__parallax_ob);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_parallax_ob = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parallax_ob'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parallax_ob = new long[]{212, 256};

	/**
	 * Field descriptor (offset) for struct member 'image'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Image}  to use on as lighting data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__image);
	 * CPointer&lt;CPointer&lt;Image&gt;&gt; p_image = p.cast(new Class[]{CPointer.class, Image.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image'</li>
	 * <li>Signature: 'Image*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image = new long[]{216, 264};

	/**
	 * Field descriptor (offset) for struct member 'visibility_grp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Object}  visibility group, inclusive or exclusive. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__visibility_grp);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_visibility_grp = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'visibility_grp'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__visibility_grp = new long[]{220, 272};

	/**
	 * Field descriptor (offset) for struct member 'distfalloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime display data </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__distfalloff);
	 * CPointer&lt;Float&gt; p_distfalloff = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distfalloff'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distfalloff = new long[]{224, 280};

	/**
	 * Field descriptor (offset) for struct member 'distgridinf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightProbe lightprobe = ...;
	 * CPointer&lt;Object&gt; p = lightprobe.__dna__addressof(LightProbe.__DNA__FIELD__distgridinf);
	 * CPointer&lt;Float&gt; p_distgridinf = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distgridinf'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distgridinf = new long[]{228, 284};

	public LightProbe(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LightProbe(LightProbe that) {
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
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Type of light probe
	 * <h4>Blender Source Code</h4>
	 * <p> For realtime probe objects. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 200);
		} else {
			return __io__block.readByte(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * (read-only)    Type of light probe
	 * <h4>Blender Source Code</h4>
	 * <p> For realtime probe objects. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 200, type);
		} else {
			__io__block.writeByte(__io__address + 156, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> General purpose flags for probes. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 201);
		} else {
			return __io__block.readByte(__io__address + 157);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> General purpose flags for probes. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 201, flag);
		} else {
			__io__block.writeByte(__io__address + 157, flag);
		}
	}

	/**
	 * Get method for struct member 'attenuation_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Attenuation type. </p>
	 * @see #__DNA__FIELD__attenuation_type
	 */
	
	public byte getAttenuation_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 202);
		} else {
			return __io__block.readByte(__io__address + 158);
		}
	}

	/**
	 * Set method for struct member 'attenuation_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Attenuation type. </p>
	 * @see #__DNA__FIELD__attenuation_type
	 */
	
	public void setAttenuation_type(byte attenuation_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 202, attenuation_type);
		} else {
			__io__block.writeByte(__io__address + 158, attenuation_type);
		}
	}

	/**
	 * Get method for struct member 'parallax_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Type of parallax volume
	 * <h4>Blender Source Code</h4>
	 * <p> Parallax type. </p>
	 * @see #__DNA__FIELD__parallax_type
	 */
	
	public byte getParallax_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 203);
		} else {
			return __io__block.readByte(__io__address + 159);
		}
	}

	/**
	 * Set method for struct member 'parallax_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Type of parallax volume
	 * <h4>Blender Source Code</h4>
	 * <p> Parallax type. </p>
	 * @see #__DNA__FIELD__parallax_type
	 */
	
	public void setParallax_type(byte parallax_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 203, parallax_type);
		} else {
			__io__block.writeByte(__io__address + 159, parallax_type);
		}
	}

	/**
	 * Get method for struct member 'distinf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Influence Radius. </p>
	 * @see #__DNA__FIELD__distinf
	 */
	
	public float getDistinf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'distinf'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Influence Radius. </p>
	 * @see #__DNA__FIELD__distinf
	 */
	
	public void setDistinf(float distinf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, distinf);
		} else {
			__io__block.writeFloat(__io__address + 160, distinf);
		}
	}

	/**
	 * Get method for struct member 'distpar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Parallax Radius. </p>
	 * @see #__DNA__FIELD__distpar
	 */
	
	public float getDistpar() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'distpar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Parallax Radius. </p>
	 * @see #__DNA__FIELD__distpar
	 */
	
	public void setDistpar(float distpar) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, distpar);
		} else {
			__io__block.writeFloat(__io__address + 164, distpar);
		}
	}

	/**
	 * Get method for struct member 'falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Control how fast the probe influence decreases
	 * <h4>Blender Source Code</h4>
	 * <p> Influence falloff. </p>
	 * @see #__DNA__FIELD__falloff
	 */
	
	public float getFalloff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Control how fast the probe influence decreases
	 * <h4>Blender Source Code</h4>
	 * <p> Influence falloff. </p>
	 * @see #__DNA__FIELD__falloff
	 */
	
	public void setFalloff(float falloff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, falloff);
		} else {
			__io__block.writeFloat(__io__address + 168, falloff);
		}
	}

	/**
	 * Get method for struct member 'clipsta'.
	 * @see #__DNA__FIELD__clipsta
	 */
	
	public float getClipsta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 216);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'clipsta'.
	 * @see #__DNA__FIELD__clipsta
	 */
	
	public void setClipsta(float clipsta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 216, clipsta);
		} else {
			__io__block.writeFloat(__io__address + 172, clipsta);
		}
	}

	/**
	 * Get method for struct member 'clipend'.
	 * @see #__DNA__FIELD__clipend
	 */
	
	public float getClipend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 220);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'clipend'.
	 * @see #__DNA__FIELD__clipend
	 */
	
	public void setClipend(float clipend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 220, clipend);
		} else {
			__io__block.writeFloat(__io__address + 176, clipend);
		}
	}

	/**
	 * Get method for struct member 'vis_bias'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> VSM visibility biases. </p>
	 * @see #__DNA__FIELD__vis_bias
	 */
	
	public float getVis_bias() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 224);
		} else {
			return __io__block.readFloat(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'vis_bias'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> VSM visibility biases. </p>
	 * @see #__DNA__FIELD__vis_bias
	 */
	
	public void setVis_bias(float vis_bias) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 224, vis_bias);
		} else {
			__io__block.writeFloat(__io__address + 180, vis_bias);
		}
	}

	/**
	 * Get method for struct member 'vis_bleedbias'.
	 * @see #__DNA__FIELD__vis_bleedbias
	 */
	
	public float getVis_bleedbias() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 228);
		} else {
			return __io__block.readFloat(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'vis_bleedbias'.
	 * @see #__DNA__FIELD__vis_bleedbias
	 */
	
	public void setVis_bleedbias(float vis_bleedbias) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 228, vis_bleedbias);
		} else {
			__io__block.writeFloat(__io__address + 184, vis_bleedbias);
		}
	}

	/**
	 * Get method for struct member 'vis_blur'.
	 * @see #__DNA__FIELD__vis_blur
	 */
	
	public float getVis_blur() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 232);
		} else {
			return __io__block.readFloat(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'vis_blur'.
	 * @see #__DNA__FIELD__vis_blur
	 */
	
	public void setVis_blur(float vis_blur) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 232, vis_blur);
		} else {
			__io__block.writeFloat(__io__address + 188, vis_blur);
		}
	}

	/**
	 * Get method for struct member 'intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Modify the intensity of the lighting captured by this probe
	 * <h4>Blender Source Code</h4>
	 * <p> Intensity multiplier. </p>
	 * @see #__DNA__FIELD__intensity
	 */
	
	public float getIntensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 236);
		} else {
			return __io__block.readFloat(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Modify the intensity of the lighting captured by this probe
	 * <h4>Blender Source Code</h4>
	 * <p> Intensity multiplier. </p>
	 * @see #__DNA__FIELD__intensity
	 */
	
	public void setIntensity(float intensity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 236, intensity);
		} else {
			__io__block.writeFloat(__io__address + 192, intensity);
		}
	}

	/**
	 * Get method for struct member 'grid_resolution_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of sample along the x axis of the volume
	 * <h4>Blender Source Code</h4>
	 * <p> Irradiance grid resolution. </p>
	 * @see #__DNA__FIELD__grid_resolution_x
	 */
	
	public int getGrid_resolution_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 240);
		} else {
			return __io__block.readInt(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'grid_resolution_x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of sample along the x axis of the volume
	 * <h4>Blender Source Code</h4>
	 * <p> Irradiance grid resolution. </p>
	 * @see #__DNA__FIELD__grid_resolution_x
	 */
	
	public void setGrid_resolution_x(int grid_resolution_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 240, grid_resolution_x);
		} else {
			__io__block.writeInt(__io__address + 196, grid_resolution_x);
		}
	}

	/**
	 * Get method for struct member 'grid_resolution_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of sample along the y axis of the volume
	 * @see #__DNA__FIELD__grid_resolution_y
	 */
	
	public int getGrid_resolution_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 244);
		} else {
			return __io__block.readInt(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'grid_resolution_y'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of sample along the y axis of the volume
	 * @see #__DNA__FIELD__grid_resolution_y
	 */
	
	public void setGrid_resolution_y(int grid_resolution_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 244, grid_resolution_y);
		} else {
			__io__block.writeInt(__io__address + 200, grid_resolution_y);
		}
	}

	/**
	 * Get method for struct member 'grid_resolution_z'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of sample along the z axis of the volume
	 * @see #__DNA__FIELD__grid_resolution_z
	 */
	
	public int getGrid_resolution_z() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 248);
		} else {
			return __io__block.readInt(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'grid_resolution_z'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Number of sample along the z axis of the volume
	 * @see #__DNA__FIELD__grid_resolution_z
	 */
	
	public void setGrid_resolution_z(int grid_resolution_z) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 248, grid_resolution_z);
		} else {
			__io__block.writeInt(__io__address + 204, grid_resolution_z);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 252, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 208, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 252;
		} else {
			__dna__offset = 208;
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
	 * Get method for struct member 'parallax_ob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Object}  to use as a parallax origin. </p>
	 * @see #__DNA__FIELD__parallax_ob
	 */
	
	public CPointer<BlenderObject> getParallax_ob() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 212);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'parallax_ob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Object}  to use as a parallax origin. </p>
	 * @see #__DNA__FIELD__parallax_ob
	 */
	
	public void setParallax_ob(CPointer<BlenderObject> parallax_ob) throws IOException
	{
		long __address = ((parallax_ob == null) ? 0 : parallax_ob.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 256, __address);
		} else {
			__io__block.writeLong(__io__address + 212, __address);
		}
	}

	/**
	 * Get method for struct member 'image'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Image}  to use on as lighting data. </p>
	 * @see #__DNA__FIELD__image
	 */
	
	public CPointer<Image> getImage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 264);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'image'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Image}  to use on as lighting data. </p>
	 * @see #__DNA__FIELD__image
	 */
	
	public void setImage(CPointer<Image> image) throws IOException
	{
		long __address = ((image == null) ? 0 : image.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 264, __address);
		} else {
			__io__block.writeLong(__io__address + 216, __address);
		}
	}

	/**
	 * Get method for struct member 'visibility_grp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Object}  visibility group, inclusive or exclusive. </p>
	 * @see #__DNA__FIELD__visibility_grp
	 */
	
	public CPointer<Collection> getVisibility_grp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 220);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'visibility_grp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Object}  visibility group, inclusive or exclusive. </p>
	 * @see #__DNA__FIELD__visibility_grp
	 */
	
	public void setVisibility_grp(CPointer<Collection> visibility_grp) throws IOException
	{
		long __address = ((visibility_grp == null) ? 0 : visibility_grp.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 272, __address);
		} else {
			__io__block.writeLong(__io__address + 220, __address);
		}
	}

	/**
	 * Get method for struct member 'distfalloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime display data </p>
	 * @see #__DNA__FIELD__distfalloff
	 */
	
	public float getDistfalloff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 280);
		} else {
			return __io__block.readFloat(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'distfalloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime display data </p>
	 * @see #__DNA__FIELD__distfalloff
	 */
	
	public void setDistfalloff(float distfalloff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 280, distfalloff);
		} else {
			__io__block.writeFloat(__io__address + 224, distfalloff);
		}
	}

	/**
	 * Get method for struct member 'distgridinf'.
	 * @see #__DNA__FIELD__distgridinf
	 */
	
	public float getDistgridinf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 284);
		} else {
			return __io__block.readFloat(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'distgridinf'.
	 * @see #__DNA__FIELD__distgridinf
	 */
	
	public void setDistgridinf(float distgridinf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 284, distgridinf);
		} else {
			__io__block.writeFloat(__io__address + 228, distgridinf);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LightProbe> __io__addressof() {
		return new CPointer<LightProbe>(__io__address, new Class[]{LightProbe.class}, __io__block, __io__blockTable);
	}

}
