package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Tex'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=356, size64=416)
public class Tex extends CFacade {

	/**
	 * This is the sdna index of the struct Tex.
	 * <p>
	 * It is required when allocating a new block to store data for Tex.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 44;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__id);
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
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__adt);
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
	 * Field descriptor (offset) for struct member 'noisesize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__noisesize);
	 * CPointer&lt;Float&gt; p_noisesize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noisesize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noisesize = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'turbul'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__turbul);
	 * CPointer&lt;Float&gt; p_turbul = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'turbul'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__turbul = new long[]{128, 164};

	/**
	 * Field descriptor (offset) for struct member 'bright'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__bright);
	 * CPointer&lt;Float&gt; p_bright = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bright'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bright = new long[]{132, 168};

	/**
	 * Field descriptor (offset) for struct member 'contrast'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__contrast);
	 * CPointer&lt;Float&gt; p_contrast = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'contrast'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__contrast = new long[]{136, 172};

	/**
	 * Field descriptor (offset) for struct member 'saturation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__saturation);
	 * CPointer&lt;Float&gt; p_saturation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'saturation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__saturation = new long[]{140, 176};

	/**
	 * Field descriptor (offset) for struct member 'rfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__rfac);
	 * CPointer&lt;Float&gt; p_rfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rfac = new long[]{144, 180};

	/**
	 * Field descriptor (offset) for struct member 'gfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__gfac);
	 * CPointer&lt;Float&gt; p_gfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gfac = new long[]{148, 184};

	/**
	 * Field descriptor (offset) for struct member 'bfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__bfac);
	 * CPointer&lt;Float&gt; p_bfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bfac = new long[]{152, 188};

	/**
	 * Field descriptor (offset) for struct member 'filtersize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__filtersize);
	 * CPointer&lt;Float&gt; p_filtersize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filtersize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filtersize = new long[]{156, 192};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{160, 196};

	/**
	 * Field descriptor (offset) for struct member 'mg_H'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> newnoise: musgrave parameters </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__mg_H);
	 * CPointer&lt;Float&gt; p_mg_H = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mg_H'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mg_H = new long[]{164, 200};

	/**
	 * Field descriptor (offset) for struct member 'mg_lacunarity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__mg_lacunarity);
	 * CPointer&lt;Float&gt; p_mg_lacunarity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mg_lacunarity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mg_lacunarity = new long[]{168, 204};

	/**
	 * Field descriptor (offset) for struct member 'mg_octaves'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__mg_octaves);
	 * CPointer&lt;Float&gt; p_mg_octaves = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mg_octaves'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mg_octaves = new long[]{172, 208};

	/**
	 * Field descriptor (offset) for struct member 'mg_offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__mg_offset);
	 * CPointer&lt;Float&gt; p_mg_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mg_offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mg_offset = new long[]{176, 212};

	/**
	 * Field descriptor (offset) for struct member 'mg_gain'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__mg_gain);
	 * CPointer&lt;Float&gt; p_mg_gain = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mg_gain'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mg_gain = new long[]{180, 216};

	/**
	 * Field descriptor (offset) for struct member 'dist_amount'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> newnoise: distorted noise amount, musgrave & voronoi output scale </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__dist_amount);
	 * CPointer&lt;Float&gt; p_dist_amount = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dist_amount'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dist_amount = new long[]{184, 220};

	/**
	 * Field descriptor (offset) for struct member 'ns_outscale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__ns_outscale);
	 * CPointer&lt;Float&gt; p_ns_outscale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ns_outscale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ns_outscale = new long[]{188, 224};

	/**
	 * Field descriptor (offset) for struct member 'vn_w1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> newnoise: voronoi nearest neighbor weights, minkovsky exponent, distance metric & color type </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__vn_w1);
	 * CPointer&lt;Float&gt; p_vn_w1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vn_w1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vn_w1 = new long[]{192, 228};

	/**
	 * Field descriptor (offset) for struct member 'vn_w2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__vn_w2);
	 * CPointer&lt;Float&gt; p_vn_w2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vn_w2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vn_w2 = new long[]{196, 232};

	/**
	 * Field descriptor (offset) for struct member 'vn_w3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__vn_w3);
	 * CPointer&lt;Float&gt; p_vn_w3 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vn_w3'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vn_w3 = new long[]{200, 236};

	/**
	 * Field descriptor (offset) for struct member 'vn_w4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__vn_w4);
	 * CPointer&lt;Float&gt; p_vn_w4 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vn_w4'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vn_w4 = new long[]{204, 240};

	/**
	 * Field descriptor (offset) for struct member 'vn_mexp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__vn_mexp);
	 * CPointer&lt;Float&gt; p_vn_mexp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vn_mexp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vn_mexp = new long[]{208, 244};

	/**
	 * Field descriptor (offset) for struct member 'vn_distm'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__vn_distm);
	 * CPointer&lt;Short&gt; p_vn_distm = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vn_distm'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vn_distm = new long[]{212, 248};

	/**
	 * Field descriptor (offset) for struct member 'vn_coltype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__vn_coltype);
	 * CPointer&lt;Short&gt; p_vn_coltype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vn_coltype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vn_coltype = new long[]{214, 250};

	/**
	 * Field descriptor (offset) for struct member 'noisedepth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> noisedepth MUST be <= 30 else we get floating point exceptions </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__noisedepth);
	 * CPointer&lt;Short&gt; p_noisedepth = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noisedepth'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noisedepth = new long[]{216, 252};

	/**
	 * Field descriptor (offset) for struct member 'noisetype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__noisetype);
	 * CPointer&lt;Short&gt; p_noisetype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noisetype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noisetype = new long[]{218, 254};

	/**
	 * Field descriptor (offset) for struct member 'noisebasis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> newnoise: noisebasis type for clouds/marble/etc, noisebasis2 only used for distorted noise </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__noisebasis);
	 * CPointer&lt;Short&gt; p_noisebasis = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noisebasis'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noisebasis = new long[]{220, 256};

	/**
	 * Field descriptor (offset) for struct member 'noisebasis2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__noisebasis2);
	 * CPointer&lt;Short&gt; p_noisebasis2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noisebasis2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noisebasis2 = new long[]{222, 258};

	/**
	 * Field descriptor (offset) for struct member 'imaflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__imaflag);
	 * CPointer&lt;Short&gt; p_imaflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'imaflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__imaflag = new long[]{224, 260};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{226, 262};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{228, 264};

	/**
	 * Field descriptor (offset) for struct member 'stype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__stype);
	 * CPointer&lt;Short&gt; p_stype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stype = new long[]{230, 266};

	/**
	 * Field descriptor (offset) for struct member 'cropxmin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__cropxmin);
	 * CPointer&lt;Float&gt; p_cropxmin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cropxmin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cropxmin = new long[]{232, 268};

	/**
	 * Field descriptor (offset) for struct member 'cropymin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__cropymin);
	 * CPointer&lt;Float&gt; p_cropymin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cropymin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cropymin = new long[]{236, 272};

	/**
	 * Field descriptor (offset) for struct member 'cropxmax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__cropxmax);
	 * CPointer&lt;Float&gt; p_cropxmax = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cropxmax'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cropxmax = new long[]{240, 276};

	/**
	 * Field descriptor (offset) for struct member 'cropymax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__cropymax);
	 * CPointer&lt;Float&gt; p_cropymax = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cropymax'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cropymax = new long[]{244, 280};

	/**
	 * Field descriptor (offset) for struct member 'texfilter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__texfilter);
	 * CPointer&lt;Integer&gt; p_texfilter = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texfilter'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texfilter = new long[]{248, 284};

	/**
	 * Field descriptor (offset) for struct member 'afmax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__afmax);
	 * CPointer&lt;Integer&gt; p_afmax = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'afmax'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__afmax = new long[]{252, 288};

	/**
	 * Field descriptor (offset) for struct member 'xrepeat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__xrepeat);
	 * CPointer&lt;Short&gt; p_xrepeat = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xrepeat'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xrepeat = new long[]{256, 292};

	/**
	 * Field descriptor (offset) for struct member 'yrepeat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__yrepeat);
	 * CPointer&lt;Short&gt; p_yrepeat = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yrepeat'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yrepeat = new long[]{258, 294};

	/**
	 * Field descriptor (offset) for struct member 'extend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__extend);
	 * CPointer&lt;Short&gt; p_extend = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'extend'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__extend = new long[]{260, 296};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> variables disabled, moved to struct iuser </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD___pad0);
	 * CPointer&lt;Short&gt; p__pad0 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{262, 298};

	/**
	 * Field descriptor (offset) for struct member 'len'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__len);
	 * CPointer&lt;Integer&gt; p_len = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'len'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__len = new long[]{264, 300};

	/**
	 * Field descriptor (offset) for struct member 'frames'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__frames);
	 * CPointer&lt;Integer&gt; p_frames = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frames'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frames = new long[]{268, 304};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__offset);
	 * CPointer&lt;Integer&gt; p_offset = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{272, 308};

	/**
	 * Field descriptor (offset) for struct member 'sfra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__sfra);
	 * CPointer&lt;Integer&gt; p_sfra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sfra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sfra = new long[]{276, 312};

	/**
	 * Field descriptor (offset) for struct member 'checkerdist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__checkerdist);
	 * CPointer&lt;Float&gt; p_checkerdist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'checkerdist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__checkerdist = new long[]{280, 316};

	/**
	 * Field descriptor (offset) for struct member 'nabla'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__nabla);
	 * CPointer&lt;Float&gt; p_nabla = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nabla'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nabla = new long[]{284, 320};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{288, 324};

	/**
	 * Field descriptor (offset) for struct member 'iuser'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__iuser);
	 * CPointer&lt;ImageUser&gt; p_iuser = p.cast(new Class[]{ImageUser.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iuser'</li>
	 * <li>Signature: 'ImageUser'</li>
	 * <li>Actual Size (32bit/64bit): 36/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iuser = new long[]{292, 328};

	/**
	 * Field descriptor (offset) for struct member 'nodetree'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__nodetree);
	 * CPointer&lt;CPointer&lt;bNodeTree&gt;&gt; p_nodetree = p.cast(new Class[]{CPointer.class, bNodeTree.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodetree'</li>
	 * <li>Signature: 'bNodeTree*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodetree = new long[]{328, 368};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> old animation system, deprecated for 2.5 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{332, 376};

	/**
	 * Field descriptor (offset) for struct member 'ima'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__ima);
	 * CPointer&lt;CPointer&lt;Image&gt;&gt; p_ima = p.cast(new Class[]{CPointer.class, Image.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ima'</li>
	 * <li>Signature: 'Image*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ima = new long[]{336, 384};

	/**
	 * Field descriptor (offset) for struct member 'coba'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__coba);
	 * CPointer&lt;CPointer&lt;ColorBand&gt;&gt; p_coba = p.cast(new Class[]{CPointer.class, ColorBand.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coba'</li>
	 * <li>Signature: 'ColorBand*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coba = new long[]{340, 392};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__preview);
	 * CPointer&lt;CPointer&lt;PreviewImage&gt;&gt; p_preview = p.cast(new Class[]{CPointer.class, PreviewImage.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview'</li>
	 * <li>Signature: 'PreviewImage*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview = new long[]{344, 400};

	/**
	 * Field descriptor (offset) for struct member 'use_nodes'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__use_nodes);
	 * CPointer&lt;Byte&gt; p_use_nodes = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_nodes'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_nodes = new long[]{348, 408};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{349, 409};

	public Tex(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Tex(Tex that) {
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
	 * Get method for struct member 'noisesize'.
	 * @see #__DNA__FIELD__noisesize
	 */
	
	public float getNoisesize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'noisesize'.
	 * @see #__DNA__FIELD__noisesize
	 */
	
	public void setNoisesize(float noisesize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, noisesize);
		} else {
			__io__block.writeFloat(__io__address + 124, noisesize);
		}
	}

	/**
	 * Get method for struct member 'turbul'.
	 * @see #__DNA__FIELD__turbul
	 */
	
	public float getTurbul() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'turbul'.
	 * @see #__DNA__FIELD__turbul
	 */
	
	public void setTurbul(float turbul) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, turbul);
		} else {
			__io__block.writeFloat(__io__address + 128, turbul);
		}
	}

	/**
	 * Get method for struct member 'bright'.
	 * @see #__DNA__FIELD__bright
	 */
	
	public float getBright() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'bright'.
	 * @see #__DNA__FIELD__bright
	 */
	
	public void setBright(float bright) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, bright);
		} else {
			__io__block.writeFloat(__io__address + 132, bright);
		}
	}

	/**
	 * Get method for struct member 'contrast'.
	 * @see #__DNA__FIELD__contrast
	 */
	
	public float getContrast() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'contrast'.
	 * @see #__DNA__FIELD__contrast
	 */
	
	public void setContrast(float contrast) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, contrast);
		} else {
			__io__block.writeFloat(__io__address + 136, contrast);
		}
	}

	/**
	 * Get method for struct member 'saturation'.
	 * @see #__DNA__FIELD__saturation
	 */
	
	public float getSaturation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'saturation'.
	 * @see #__DNA__FIELD__saturation
	 */
	
	public void setSaturation(float saturation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, saturation);
		} else {
			__io__block.writeFloat(__io__address + 140, saturation);
		}
	}

	/**
	 * Get method for struct member 'rfac'.
	 * @see #__DNA__FIELD__rfac
	 */
	
	public float getRfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'rfac'.
	 * @see #__DNA__FIELD__rfac
	 */
	
	public void setRfac(float rfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, rfac);
		} else {
			__io__block.writeFloat(__io__address + 144, rfac);
		}
	}

	/**
	 * Get method for struct member 'gfac'.
	 * @see #__DNA__FIELD__gfac
	 */
	
	public float getGfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'gfac'.
	 * @see #__DNA__FIELD__gfac
	 */
	
	public void setGfac(float gfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, gfac);
		} else {
			__io__block.writeFloat(__io__address + 148, gfac);
		}
	}

	/**
	 * Get method for struct member 'bfac'.
	 * @see #__DNA__FIELD__bfac
	 */
	
	public float getBfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'bfac'.
	 * @see #__DNA__FIELD__bfac
	 */
	
	public void setBfac(float bfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, bfac);
		} else {
			__io__block.writeFloat(__io__address + 152, bfac);
		}
	}

	/**
	 * Get method for struct member 'filtersize'.
	 * @see #__DNA__FIELD__filtersize
	 */
	
	public float getFiltersize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'filtersize'.
	 * @see #__DNA__FIELD__filtersize
	 */
	
	public void setFiltersize(float filtersize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, filtersize);
		} else {
			__io__block.writeFloat(__io__address + 156, filtersize);
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
			return new CArrayFacade<Byte>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 196;
		} else {
			__dna__offset = 160;
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
	 * Get method for struct member 'mg_H'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> newnoise: musgrave parameters </p>
	 * @see #__DNA__FIELD__mg_H
	 */
	
	public float getMg_H() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'mg_H'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> newnoise: musgrave parameters </p>
	 * @see #__DNA__FIELD__mg_H
	 */
	
	public void setMg_H(float mg_H) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, mg_H);
		} else {
			__io__block.writeFloat(__io__address + 164, mg_H);
		}
	}

	/**
	 * Get method for struct member 'mg_lacunarity'.
	 * @see #__DNA__FIELD__mg_lacunarity
	 */
	
	public float getMg_lacunarity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'mg_lacunarity'.
	 * @see #__DNA__FIELD__mg_lacunarity
	 */
	
	public void setMg_lacunarity(float mg_lacunarity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, mg_lacunarity);
		} else {
			__io__block.writeFloat(__io__address + 168, mg_lacunarity);
		}
	}

	/**
	 * Get method for struct member 'mg_octaves'.
	 * @see #__DNA__FIELD__mg_octaves
	 */
	
	public float getMg_octaves() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'mg_octaves'.
	 * @see #__DNA__FIELD__mg_octaves
	 */
	
	public void setMg_octaves(float mg_octaves) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, mg_octaves);
		} else {
			__io__block.writeFloat(__io__address + 172, mg_octaves);
		}
	}

	/**
	 * Get method for struct member 'mg_offset'.
	 * @see #__DNA__FIELD__mg_offset
	 */
	
	public float getMg_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'mg_offset'.
	 * @see #__DNA__FIELD__mg_offset
	 */
	
	public void setMg_offset(float mg_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, mg_offset);
		} else {
			__io__block.writeFloat(__io__address + 176, mg_offset);
		}
	}

	/**
	 * Get method for struct member 'mg_gain'.
	 * @see #__DNA__FIELD__mg_gain
	 */
	
	public float getMg_gain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 216);
		} else {
			return __io__block.readFloat(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'mg_gain'.
	 * @see #__DNA__FIELD__mg_gain
	 */
	
	public void setMg_gain(float mg_gain) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 216, mg_gain);
		} else {
			__io__block.writeFloat(__io__address + 180, mg_gain);
		}
	}

	/**
	 * Get method for struct member 'dist_amount'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> newnoise: distorted noise amount, musgrave & voronoi output scale </p>
	 * @see #__DNA__FIELD__dist_amount
	 */
	
	public float getDist_amount() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 220);
		} else {
			return __io__block.readFloat(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'dist_amount'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> newnoise: distorted noise amount, musgrave & voronoi output scale </p>
	 * @see #__DNA__FIELD__dist_amount
	 */
	
	public void setDist_amount(float dist_amount) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 220, dist_amount);
		} else {
			__io__block.writeFloat(__io__address + 184, dist_amount);
		}
	}

	/**
	 * Get method for struct member 'ns_outscale'.
	 * @see #__DNA__FIELD__ns_outscale
	 */
	
	public float getNs_outscale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 224);
		} else {
			return __io__block.readFloat(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'ns_outscale'.
	 * @see #__DNA__FIELD__ns_outscale
	 */
	
	public void setNs_outscale(float ns_outscale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 224, ns_outscale);
		} else {
			__io__block.writeFloat(__io__address + 188, ns_outscale);
		}
	}

	/**
	 * Get method for struct member 'vn_w1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> newnoise: voronoi nearest neighbor weights, minkovsky exponent, distance metric & color type </p>
	 * @see #__DNA__FIELD__vn_w1
	 */
	
	public float getVn_w1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 228);
		} else {
			return __io__block.readFloat(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'vn_w1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> newnoise: voronoi nearest neighbor weights, minkovsky exponent, distance metric & color type </p>
	 * @see #__DNA__FIELD__vn_w1
	 */
	
	public void setVn_w1(float vn_w1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 228, vn_w1);
		} else {
			__io__block.writeFloat(__io__address + 192, vn_w1);
		}
	}

	/**
	 * Get method for struct member 'vn_w2'.
	 * @see #__DNA__FIELD__vn_w2
	 */
	
	public float getVn_w2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 232);
		} else {
			return __io__block.readFloat(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'vn_w2'.
	 * @see #__DNA__FIELD__vn_w2
	 */
	
	public void setVn_w2(float vn_w2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 232, vn_w2);
		} else {
			__io__block.writeFloat(__io__address + 196, vn_w2);
		}
	}

	/**
	 * Get method for struct member 'vn_w3'.
	 * @see #__DNA__FIELD__vn_w3
	 */
	
	public float getVn_w3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 236);
		} else {
			return __io__block.readFloat(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'vn_w3'.
	 * @see #__DNA__FIELD__vn_w3
	 */
	
	public void setVn_w3(float vn_w3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 236, vn_w3);
		} else {
			__io__block.writeFloat(__io__address + 200, vn_w3);
		}
	}

	/**
	 * Get method for struct member 'vn_w4'.
	 * @see #__DNA__FIELD__vn_w4
	 */
	
	public float getVn_w4() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 240);
		} else {
			return __io__block.readFloat(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'vn_w4'.
	 * @see #__DNA__FIELD__vn_w4
	 */
	
	public void setVn_w4(float vn_w4) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 240, vn_w4);
		} else {
			__io__block.writeFloat(__io__address + 204, vn_w4);
		}
	}

	/**
	 * Get method for struct member 'vn_mexp'.
	 * @see #__DNA__FIELD__vn_mexp
	 */
	
	public float getVn_mexp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 244);
		} else {
			return __io__block.readFloat(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'vn_mexp'.
	 * @see #__DNA__FIELD__vn_mexp
	 */
	
	public void setVn_mexp(float vn_mexp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 244, vn_mexp);
		} else {
			__io__block.writeFloat(__io__address + 208, vn_mexp);
		}
	}

	/**
	 * Get method for struct member 'vn_distm'.
	 * @see #__DNA__FIELD__vn_distm
	 */
	
	public short getVn_distm() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 248);
		} else {
			return __io__block.readShort(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'vn_distm'.
	 * @see #__DNA__FIELD__vn_distm
	 */
	
	public void setVn_distm(short vn_distm) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 248, vn_distm);
		} else {
			__io__block.writeShort(__io__address + 212, vn_distm);
		}
	}

	/**
	 * Get method for struct member 'vn_coltype'.
	 * @see #__DNA__FIELD__vn_coltype
	 */
	
	public short getVn_coltype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 250);
		} else {
			return __io__block.readShort(__io__address + 214);
		}
	}

	/**
	 * Set method for struct member 'vn_coltype'.
	 * @see #__DNA__FIELD__vn_coltype
	 */
	
	public void setVn_coltype(short vn_coltype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 250, vn_coltype);
		} else {
			__io__block.writeShort(__io__address + 214, vn_coltype);
		}
	}

	/**
	 * Get method for struct member 'noisedepth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> noisedepth MUST be <= 30 else we get floating point exceptions </p>
	 * @see #__DNA__FIELD__noisedepth
	 */
	
	public short getNoisedepth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 252);
		} else {
			return __io__block.readShort(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'noisedepth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> noisedepth MUST be <= 30 else we get floating point exceptions </p>
	 * @see #__DNA__FIELD__noisedepth
	 */
	
	public void setNoisedepth(short noisedepth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 252, noisedepth);
		} else {
			__io__block.writeShort(__io__address + 216, noisedepth);
		}
	}

	/**
	 * Get method for struct member 'noisetype'.
	 * @see #__DNA__FIELD__noisetype
	 */
	
	public short getNoisetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 254);
		} else {
			return __io__block.readShort(__io__address + 218);
		}
	}

	/**
	 * Set method for struct member 'noisetype'.
	 * @see #__DNA__FIELD__noisetype
	 */
	
	public void setNoisetype(short noisetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 254, noisetype);
		} else {
			__io__block.writeShort(__io__address + 218, noisetype);
		}
	}

	/**
	 * Get method for struct member 'noisebasis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> newnoise: noisebasis type for clouds/marble/etc, noisebasis2 only used for distorted noise </p>
	 * @see #__DNA__FIELD__noisebasis
	 */
	
	public short getNoisebasis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 256);
		} else {
			return __io__block.readShort(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'noisebasis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> newnoise: noisebasis type for clouds/marble/etc, noisebasis2 only used for distorted noise </p>
	 * @see #__DNA__FIELD__noisebasis
	 */
	
	public void setNoisebasis(short noisebasis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 256, noisebasis);
		} else {
			__io__block.writeShort(__io__address + 220, noisebasis);
		}
	}

	/**
	 * Get method for struct member 'noisebasis2'.
	 * @see #__DNA__FIELD__noisebasis2
	 */
	
	public short getNoisebasis2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 258);
		} else {
			return __io__block.readShort(__io__address + 222);
		}
	}

	/**
	 * Set method for struct member 'noisebasis2'.
	 * @see #__DNA__FIELD__noisebasis2
	 */
	
	public void setNoisebasis2(short noisebasis2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 258, noisebasis2);
		} else {
			__io__block.writeShort(__io__address + 222, noisebasis2);
		}
	}

	/**
	 * Get method for struct member 'imaflag'.
	 * @see #__DNA__FIELD__imaflag
	 */
	
	public short getImaflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 260);
		} else {
			return __io__block.readShort(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'imaflag'.
	 * @see #__DNA__FIELD__imaflag
	 */
	
	public void setImaflag(short imaflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 260, imaflag);
		} else {
			__io__block.writeShort(__io__address + 224, imaflag);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 262);
		} else {
			return __io__block.readShort(__io__address + 226);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 262, flag);
		} else {
			__io__block.writeShort(__io__address + 226, flag);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 264);
		} else {
			return __io__block.readShort(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 264, type);
		} else {
			__io__block.writeShort(__io__address + 228, type);
		}
	}

	/**
	 * Get method for struct member 'stype'.
	 * @see #__DNA__FIELD__stype
	 */
	
	public short getStype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 266);
		} else {
			return __io__block.readShort(__io__address + 230);
		}
	}

	/**
	 * Set method for struct member 'stype'.
	 * @see #__DNA__FIELD__stype
	 */
	
	public void setStype(short stype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 266, stype);
		} else {
			__io__block.writeShort(__io__address + 230, stype);
		}
	}

	/**
	 * Get method for struct member 'cropxmin'.
	 * @see #__DNA__FIELD__cropxmin
	 */
	
	public float getCropxmin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 268);
		} else {
			return __io__block.readFloat(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'cropxmin'.
	 * @see #__DNA__FIELD__cropxmin
	 */
	
	public void setCropxmin(float cropxmin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 268, cropxmin);
		} else {
			__io__block.writeFloat(__io__address + 232, cropxmin);
		}
	}

	/**
	 * Get method for struct member 'cropymin'.
	 * @see #__DNA__FIELD__cropymin
	 */
	
	public float getCropymin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 272);
		} else {
			return __io__block.readFloat(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'cropymin'.
	 * @see #__DNA__FIELD__cropymin
	 */
	
	public void setCropymin(float cropymin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 272, cropymin);
		} else {
			__io__block.writeFloat(__io__address + 236, cropymin);
		}
	}

	/**
	 * Get method for struct member 'cropxmax'.
	 * @see #__DNA__FIELD__cropxmax
	 */
	
	public float getCropxmax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 276);
		} else {
			return __io__block.readFloat(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'cropxmax'.
	 * @see #__DNA__FIELD__cropxmax
	 */
	
	public void setCropxmax(float cropxmax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 276, cropxmax);
		} else {
			__io__block.writeFloat(__io__address + 240, cropxmax);
		}
	}

	/**
	 * Get method for struct member 'cropymax'.
	 * @see #__DNA__FIELD__cropymax
	 */
	
	public float getCropymax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 280);
		} else {
			return __io__block.readFloat(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'cropymax'.
	 * @see #__DNA__FIELD__cropymax
	 */
	
	public void setCropymax(float cropymax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 280, cropymax);
		} else {
			__io__block.writeFloat(__io__address + 244, cropymax);
		}
	}

	/**
	 * Get method for struct member 'texfilter'.
	 * @see #__DNA__FIELD__texfilter
	 */
	
	public int getTexfilter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 284);
		} else {
			return __io__block.readInt(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'texfilter'.
	 * @see #__DNA__FIELD__texfilter
	 */
	
	public void setTexfilter(int texfilter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 284, texfilter);
		} else {
			__io__block.writeInt(__io__address + 248, texfilter);
		}
	}

	/**
	 * Get method for struct member 'afmax'.
	 * @see #__DNA__FIELD__afmax
	 */
	
	public int getAfmax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 288);
		} else {
			return __io__block.readInt(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'afmax'.
	 * @see #__DNA__FIELD__afmax
	 */
	
	public void setAfmax(int afmax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 288, afmax);
		} else {
			__io__block.writeInt(__io__address + 252, afmax);
		}
	}

	/**
	 * Get method for struct member 'xrepeat'.
	 * @see #__DNA__FIELD__xrepeat
	 */
	
	public short getXrepeat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 292);
		} else {
			return __io__block.readShort(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'xrepeat'.
	 * @see #__DNA__FIELD__xrepeat
	 */
	
	public void setXrepeat(short xrepeat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 292, xrepeat);
		} else {
			__io__block.writeShort(__io__address + 256, xrepeat);
		}
	}

	/**
	 * Get method for struct member 'yrepeat'.
	 * @see #__DNA__FIELD__yrepeat
	 */
	
	public short getYrepeat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 294);
		} else {
			return __io__block.readShort(__io__address + 258);
		}
	}

	/**
	 * Set method for struct member 'yrepeat'.
	 * @see #__DNA__FIELD__yrepeat
	 */
	
	public void setYrepeat(short yrepeat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 294, yrepeat);
		} else {
			__io__block.writeShort(__io__address + 258, yrepeat);
		}
	}

	/**
	 * Get method for struct member 'extend'.
	 * @see #__DNA__FIELD__extend
	 */
	
	public short getExtend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 296);
		} else {
			return __io__block.readShort(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'extend'.
	 * @see #__DNA__FIELD__extend
	 */
	
	public void setExtend(short extend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 296, extend);
		} else {
			__io__block.writeShort(__io__address + 260, extend);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> variables disabled, moved to struct iuser </p>
	 * @see #__DNA__FIELD___pad0
	 */
	
	public short get_pad0() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 298);
		} else {
			return __io__block.readShort(__io__address + 262);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> variables disabled, moved to struct iuser </p>
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(short _pad0) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 298, _pad0);
		} else {
			__io__block.writeShort(__io__address + 262, _pad0);
		}
	}

	/**
	 * Get method for struct member 'len'.
	 * @see #__DNA__FIELD__len
	 */
	
	public int getLen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 300);
		} else {
			return __io__block.readInt(__io__address + 264);
		}
	}

	/**
	 * Set method for struct member 'len'.
	 * @see #__DNA__FIELD__len
	 */
	
	public void setLen(int len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 300, len);
		} else {
			__io__block.writeInt(__io__address + 264, len);
		}
	}

	/**
	 * Get method for struct member 'frames'.
	 * @see #__DNA__FIELD__frames
	 */
	
	public int getFrames() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 304);
		} else {
			return __io__block.readInt(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'frames'.
	 * @see #__DNA__FIELD__frames
	 */
	
	public void setFrames(int frames) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 304, frames);
		} else {
			__io__block.writeInt(__io__address + 268, frames);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public int getOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 308);
		} else {
			return __io__block.readInt(__io__address + 272);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(int offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 308, offset);
		} else {
			__io__block.writeInt(__io__address + 272, offset);
		}
	}

	/**
	 * Get method for struct member 'sfra'.
	 * @see #__DNA__FIELD__sfra
	 */
	
	public int getSfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 312);
		} else {
			return __io__block.readInt(__io__address + 276);
		}
	}

	/**
	 * Set method for struct member 'sfra'.
	 * @see #__DNA__FIELD__sfra
	 */
	
	public void setSfra(int sfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 312, sfra);
		} else {
			__io__block.writeInt(__io__address + 276, sfra);
		}
	}

	/**
	 * Get method for struct member 'checkerdist'.
	 * @see #__DNA__FIELD__checkerdist
	 */
	
	public float getCheckerdist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 316);
		} else {
			return __io__block.readFloat(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'checkerdist'.
	 * @see #__DNA__FIELD__checkerdist
	 */
	
	public void setCheckerdist(float checkerdist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 316, checkerdist);
		} else {
			__io__block.writeFloat(__io__address + 280, checkerdist);
		}
	}

	/**
	 * Get method for struct member 'nabla'.
	 * @see #__DNA__FIELD__nabla
	 */
	
	public float getNabla() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 320);
		} else {
			return __io__block.readFloat(__io__address + 284);
		}
	}

	/**
	 * Set method for struct member 'nabla'.
	 * @see #__DNA__FIELD__nabla
	 */
	
	public void setNabla(float nabla) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 320, nabla);
		} else {
			__io__block.writeFloat(__io__address + 284, nabla);
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
			return new CArrayFacade<Byte>(__io__address + 324, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 288, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 324;
		} else {
			__dna__offset = 288;
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
	 * Get method for struct member 'iuser'.
	 * @see #__DNA__FIELD__iuser
	 */
	
	public ImageUser getIuser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImageUser(__io__address + 328, __io__block, __io__blockTable);
		} else {
			return new ImageUser(__io__address + 292, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'iuser'.
	 * @see #__DNA__FIELD__iuser
	 */
	
	public void setIuser(ImageUser iuser) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 328;
		} else {
			__dna__offset = 292;
		}
		if (__io__equals(iuser, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, iuser)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, iuser);
		} else {
			__io__generic__copy( getIuser(), iuser);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 368);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 328);
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
			__io__block.writeLong(__io__address + 368, __address);
		} else {
			__io__block.writeLong(__io__address + 328, __address);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> old animation system, deprecated for 2.5 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 332);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> old animation system, deprecated for 2.5 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 376, __address);
		} else {
			__io__block.writeLong(__io__address + 332, __address);
		}
	}

	/**
	 * Get method for struct member 'ima'.
	 * @see #__DNA__FIELD__ima
	 */
	
	public CPointer<Image> getIma() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 384);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 336);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ima'.
	 * @see #__DNA__FIELD__ima
	 */
	
	public void setIma(CPointer<Image> ima) throws IOException
	{
		long __address = ((ima == null) ? 0 : ima.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 384, __address);
		} else {
			__io__block.writeLong(__io__address + 336, __address);
		}
	}

	/**
	 * Get method for struct member 'coba'.
	 * @see #__DNA__FIELD__coba
	 */
	
	public CPointer<ColorBand> getCoba() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 392);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 340);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ColorBand.class};
		return new CPointer<ColorBand>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ColorBand.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'coba'.
	 * @see #__DNA__FIELD__coba
	 */
	
	public void setCoba(CPointer<ColorBand> coba) throws IOException
	{
		long __address = ((coba == null) ? 0 : coba.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 392, __address);
		} else {
			__io__block.writeLong(__io__address + 340, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 400);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 344);
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
			__io__block.writeLong(__io__address + 400, __address);
		} else {
			__io__block.writeLong(__io__address + 344, __address);
		}
	}

	/**
	 * Get method for struct member 'use_nodes'.
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public byte getUse_nodes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 408);
		} else {
			return __io__block.readByte(__io__address + 348);
		}
	}

	/**
	 * Set method for struct member 'use_nodes'.
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public void setUse_nodes(byte use_nodes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 408, use_nodes);
		} else {
			__io__block.writeByte(__io__address + 348, use_nodes);
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
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 409, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 349, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 409;
		} else {
			__dna__offset = 349;
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
	public CPointer<Tex> __io__addressof() {
		return new CPointer<Tex>(__io__address, new Class[]{Tex.class}, __io__block, __io__blockTable);
	}

}
