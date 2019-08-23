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

@CMetaData(size32=352, size64=416)
public class Tex extends CFacade {

	/**
	 * This is the sdna index of the struct Tex.
	 * <p>
	 * It is required when allocating a new block to store data for Tex.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 39;

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
	public static final long[] __DNA__FIELD__adt = new long[]{100, 120};

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
	public static final long[] __DNA__FIELD__noisesize = new long[]{104, 128};

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
	public static final long[] __DNA__FIELD__turbul = new long[]{108, 132};

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
	public static final long[] __DNA__FIELD__bright = new long[]{112, 136};

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
	public static final long[] __DNA__FIELD__contrast = new long[]{116, 140};

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
	public static final long[] __DNA__FIELD__saturation = new long[]{120, 144};

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
	public static final long[] __DNA__FIELD__rfac = new long[]{124, 148};

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
	public static final long[] __DNA__FIELD__gfac = new long[]{128, 152};

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
	public static final long[] __DNA__FIELD__bfac = new long[]{132, 156};

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
	public static final long[] __DNA__FIELD__filtersize = new long[]{136, 160};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__pad2);
	 * CPointer&lt;Float&gt; p_pad2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{140, 164};

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
	public static final long[] __DNA__FIELD__mg_H = new long[]{144, 168};

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
	public static final long[] __DNA__FIELD__mg_lacunarity = new long[]{148, 172};

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
	public static final long[] __DNA__FIELD__mg_octaves = new long[]{152, 176};

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
	public static final long[] __DNA__FIELD__mg_offset = new long[]{156, 180};

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
	public static final long[] __DNA__FIELD__mg_gain = new long[]{160, 184};

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
	public static final long[] __DNA__FIELD__dist_amount = new long[]{164, 188};

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
	public static final long[] __DNA__FIELD__ns_outscale = new long[]{168, 192};

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
	public static final long[] __DNA__FIELD__vn_w1 = new long[]{172, 196};

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
	public static final long[] __DNA__FIELD__vn_w2 = new long[]{176, 200};

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
	public static final long[] __DNA__FIELD__vn_w3 = new long[]{180, 204};

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
	public static final long[] __DNA__FIELD__vn_w4 = new long[]{184, 208};

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
	public static final long[] __DNA__FIELD__vn_mexp = new long[]{188, 212};

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
	public static final long[] __DNA__FIELD__vn_distm = new long[]{192, 216};

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
	public static final long[] __DNA__FIELD__vn_coltype = new long[]{194, 218};

	/**
	 * Field descriptor (offset) for struct member 'noisedepth'.
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
	public static final long[] __DNA__FIELD__noisedepth = new long[]{196, 220};

	/**
	 * Field descriptor (offset) for struct member 'noisetype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> noisedepth MUST be <= 30 else we get floating point exceptions </p>
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
	public static final long[] __DNA__FIELD__noisetype = new long[]{198, 222};

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
	public static final long[] __DNA__FIELD__noisebasis = new long[]{200, 224};

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
	public static final long[] __DNA__FIELD__noisebasis2 = new long[]{202, 226};

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
	public static final long[] __DNA__FIELD__imaflag = new long[]{204, 228};

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
	public static final long[] __DNA__FIELD__flag = new long[]{206, 230};

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
	public static final long[] __DNA__FIELD__type = new long[]{208, 232};

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
	public static final long[] __DNA__FIELD__stype = new long[]{210, 234};

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
	public static final long[] __DNA__FIELD__cropxmin = new long[]{212, 236};

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
	public static final long[] __DNA__FIELD__cropymin = new long[]{216, 240};

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
	public static final long[] __DNA__FIELD__cropxmax = new long[]{220, 244};

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
	public static final long[] __DNA__FIELD__cropymax = new long[]{224, 248};

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
	public static final long[] __DNA__FIELD__texfilter = new long[]{228, 252};

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
	public static final long[] __DNA__FIELD__afmax = new long[]{232, 256};

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
	public static final long[] __DNA__FIELD__xrepeat = new long[]{236, 260};

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
	public static final long[] __DNA__FIELD__yrepeat = new long[]{238, 262};

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
	public static final long[] __DNA__FIELD__extend = new long[]{240, 264};

	/**
	 * Field descriptor (offset) for struct member 'fie_ima'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> variables disabled, moved to struct iuser </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__fie_ima);
	 * CPointer&lt;Short&gt; p_fie_ima = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fie_ima'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fie_ima = new long[]{242, 266};

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
	public static final long[] __DNA__FIELD__len = new long[]{244, 268};

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
	public static final long[] __DNA__FIELD__frames = new long[]{248, 272};

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
	public static final long[] __DNA__FIELD__offset = new long[]{252, 276};

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
	public static final long[] __DNA__FIELD__sfra = new long[]{256, 280};

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
	public static final long[] __DNA__FIELD__checkerdist = new long[]{260, 284};

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
	public static final long[] __DNA__FIELD__nabla = new long[]{264, 288};

	/**
	 * Field descriptor (offset) for struct member 'pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__pad1);
	 * CPointer&lt;Float&gt; p_pad1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad1 = new long[]{268, 292};

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
	public static final long[] __DNA__FIELD__iuser = new long[]{272, 296};

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
	public static final long[] __DNA__FIELD__nodetree = new long[]{308, 336};

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
	public static final long[] __DNA__FIELD__ipo = new long[]{312, 344};

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
	public static final long[] __DNA__FIELD__ima = new long[]{316, 352};

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
	public static final long[] __DNA__FIELD__coba = new long[]{320, 360};

	/**
	 * Field descriptor (offset) for struct member 'env'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__env);
	 * CPointer&lt;CPointer&lt;EnvMap&gt;&gt; p_env = p.cast(new Class[]{CPointer.class, EnvMap.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'env'</li>
	 * <li>Signature: 'EnvMap*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__env = new long[]{324, 368};

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
	public static final long[] __DNA__FIELD__preview = new long[]{328, 376};

	/**
	 * Field descriptor (offset) for struct member 'pd'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__pd);
	 * CPointer&lt;CPointer&lt;PointDensity&gt;&gt; p_pd = p.cast(new Class[]{CPointer.class, PointDensity.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pd'</li>
	 * <li>Signature: 'PointDensity*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pd = new long[]{332, 384};

	/**
	 * Field descriptor (offset) for struct member 'vd'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__vd);
	 * CPointer&lt;CPointer&lt;VoxelData&gt;&gt; p_vd = p.cast(new Class[]{CPointer.class, VoxelData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vd'</li>
	 * <li>Signature: 'VoxelData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vd = new long[]{336, 392};

	/**
	 * Field descriptor (offset) for struct member 'ot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__ot);
	 * CPointer&lt;CPointer&lt;OceanTex&gt;&gt; p_ot = p.cast(new Class[]{CPointer.class, OceanTex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ot'</li>
	 * <li>Signature: 'OceanTex*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ot = new long[]{340, 400};

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
	public static final long[] __DNA__FIELD__use_nodes = new long[]{344, 408};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Tex tex = ...;
	 * CPointer&lt;Object&gt; p = tex.__dna__addressof(Tex.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{345, 409};

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
	 * Get method for struct member 'noisesize'.
	 * @see #__DNA__FIELD__noisesize
	 */
	
	public float getNoisesize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 128);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'noisesize'.
	 * @see #__DNA__FIELD__noisesize
	 */
	
	public void setNoisesize(float noisesize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 128, noisesize);
		} else {
			__io__block.writeFloat(__io__address + 104, noisesize);
		}
	}

	/**
	 * Get method for struct member 'turbul'.
	 * @see #__DNA__FIELD__turbul
	 */
	
	public float getTurbul() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 132);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'turbul'.
	 * @see #__DNA__FIELD__turbul
	 */
	
	public void setTurbul(float turbul) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 132, turbul);
		} else {
			__io__block.writeFloat(__io__address + 108, turbul);
		}
	}

	/**
	 * Get method for struct member 'bright'.
	 * @see #__DNA__FIELD__bright
	 */
	
	public float getBright() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 136);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'bright'.
	 * @see #__DNA__FIELD__bright
	 */
	
	public void setBright(float bright) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 136, bright);
		} else {
			__io__block.writeFloat(__io__address + 112, bright);
		}
	}

	/**
	 * Get method for struct member 'contrast'.
	 * @see #__DNA__FIELD__contrast
	 */
	
	public float getContrast() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'contrast'.
	 * @see #__DNA__FIELD__contrast
	 */
	
	public void setContrast(float contrast) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, contrast);
		} else {
			__io__block.writeFloat(__io__address + 116, contrast);
		}
	}

	/**
	 * Get method for struct member 'saturation'.
	 * @see #__DNA__FIELD__saturation
	 */
	
	public float getSaturation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'saturation'.
	 * @see #__DNA__FIELD__saturation
	 */
	
	public void setSaturation(float saturation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, saturation);
		} else {
			__io__block.writeFloat(__io__address + 120, saturation);
		}
	}

	/**
	 * Get method for struct member 'rfac'.
	 * @see #__DNA__FIELD__rfac
	 */
	
	public float getRfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'rfac'.
	 * @see #__DNA__FIELD__rfac
	 */
	
	public void setRfac(float rfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, rfac);
		} else {
			__io__block.writeFloat(__io__address + 124, rfac);
		}
	}

	/**
	 * Get method for struct member 'gfac'.
	 * @see #__DNA__FIELD__gfac
	 */
	
	public float getGfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'gfac'.
	 * @see #__DNA__FIELD__gfac
	 */
	
	public void setGfac(float gfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, gfac);
		} else {
			__io__block.writeFloat(__io__address + 128, gfac);
		}
	}

	/**
	 * Get method for struct member 'bfac'.
	 * @see #__DNA__FIELD__bfac
	 */
	
	public float getBfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'bfac'.
	 * @see #__DNA__FIELD__bfac
	 */
	
	public void setBfac(float bfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, bfac);
		} else {
			__io__block.writeFloat(__io__address + 132, bfac);
		}
	}

	/**
	 * Get method for struct member 'filtersize'.
	 * @see #__DNA__FIELD__filtersize
	 */
	
	public float getFiltersize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'filtersize'.
	 * @see #__DNA__FIELD__filtersize
	 */
	
	public void setFiltersize(float filtersize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, filtersize);
		} else {
			__io__block.writeFloat(__io__address + 136, filtersize);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public float getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(float pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, pad2);
		} else {
			__io__block.writeFloat(__io__address + 140, pad2);
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
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 144);
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
			__io__block.writeFloat(__io__address + 168, mg_H);
		} else {
			__io__block.writeFloat(__io__address + 144, mg_H);
		}
	}

	/**
	 * Get method for struct member 'mg_lacunarity'.
	 * @see #__DNA__FIELD__mg_lacunarity
	 */
	
	public float getMg_lacunarity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'mg_lacunarity'.
	 * @see #__DNA__FIELD__mg_lacunarity
	 */
	
	public void setMg_lacunarity(float mg_lacunarity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, mg_lacunarity);
		} else {
			__io__block.writeFloat(__io__address + 148, mg_lacunarity);
		}
	}

	/**
	 * Get method for struct member 'mg_octaves'.
	 * @see #__DNA__FIELD__mg_octaves
	 */
	
	public float getMg_octaves() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'mg_octaves'.
	 * @see #__DNA__FIELD__mg_octaves
	 */
	
	public void setMg_octaves(float mg_octaves) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, mg_octaves);
		} else {
			__io__block.writeFloat(__io__address + 152, mg_octaves);
		}
	}

	/**
	 * Get method for struct member 'mg_offset'.
	 * @see #__DNA__FIELD__mg_offset
	 */
	
	public float getMg_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'mg_offset'.
	 * @see #__DNA__FIELD__mg_offset
	 */
	
	public void setMg_offset(float mg_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, mg_offset);
		} else {
			__io__block.writeFloat(__io__address + 156, mg_offset);
		}
	}

	/**
	 * Get method for struct member 'mg_gain'.
	 * @see #__DNA__FIELD__mg_gain
	 */
	
	public float getMg_gain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'mg_gain'.
	 * @see #__DNA__FIELD__mg_gain
	 */
	
	public void setMg_gain(float mg_gain) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, mg_gain);
		} else {
			__io__block.writeFloat(__io__address + 160, mg_gain);
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
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 164);
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
			__io__block.writeFloat(__io__address + 188, dist_amount);
		} else {
			__io__block.writeFloat(__io__address + 164, dist_amount);
		}
	}

	/**
	 * Get method for struct member 'ns_outscale'.
	 * @see #__DNA__FIELD__ns_outscale
	 */
	
	public float getNs_outscale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'ns_outscale'.
	 * @see #__DNA__FIELD__ns_outscale
	 */
	
	public void setNs_outscale(float ns_outscale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, ns_outscale);
		} else {
			__io__block.writeFloat(__io__address + 168, ns_outscale);
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
			return __io__block.readFloat(__io__address + 196);
		} else {
			return __io__block.readFloat(__io__address + 172);
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
			__io__block.writeFloat(__io__address + 196, vn_w1);
		} else {
			__io__block.writeFloat(__io__address + 172, vn_w1);
		}
	}

	/**
	 * Get method for struct member 'vn_w2'.
	 * @see #__DNA__FIELD__vn_w2
	 */
	
	public float getVn_w2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'vn_w2'.
	 * @see #__DNA__FIELD__vn_w2
	 */
	
	public void setVn_w2(float vn_w2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, vn_w2);
		} else {
			__io__block.writeFloat(__io__address + 176, vn_w2);
		}
	}

	/**
	 * Get method for struct member 'vn_w3'.
	 * @see #__DNA__FIELD__vn_w3
	 */
	
	public float getVn_w3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'vn_w3'.
	 * @see #__DNA__FIELD__vn_w3
	 */
	
	public void setVn_w3(float vn_w3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, vn_w3);
		} else {
			__io__block.writeFloat(__io__address + 180, vn_w3);
		}
	}

	/**
	 * Get method for struct member 'vn_w4'.
	 * @see #__DNA__FIELD__vn_w4
	 */
	
	public float getVn_w4() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'vn_w4'.
	 * @see #__DNA__FIELD__vn_w4
	 */
	
	public void setVn_w4(float vn_w4) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, vn_w4);
		} else {
			__io__block.writeFloat(__io__address + 184, vn_w4);
		}
	}

	/**
	 * Get method for struct member 'vn_mexp'.
	 * @see #__DNA__FIELD__vn_mexp
	 */
	
	public float getVn_mexp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'vn_mexp'.
	 * @see #__DNA__FIELD__vn_mexp
	 */
	
	public void setVn_mexp(float vn_mexp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, vn_mexp);
		} else {
			__io__block.writeFloat(__io__address + 188, vn_mexp);
		}
	}

	/**
	 * Get method for struct member 'vn_distm'.
	 * @see #__DNA__FIELD__vn_distm
	 */
	
	public short getVn_distm() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 216);
		} else {
			return __io__block.readShort(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'vn_distm'.
	 * @see #__DNA__FIELD__vn_distm
	 */
	
	public void setVn_distm(short vn_distm) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 216, vn_distm);
		} else {
			__io__block.writeShort(__io__address + 192, vn_distm);
		}
	}

	/**
	 * Get method for struct member 'vn_coltype'.
	 * @see #__DNA__FIELD__vn_coltype
	 */
	
	public short getVn_coltype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 218);
		} else {
			return __io__block.readShort(__io__address + 194);
		}
	}

	/**
	 * Set method for struct member 'vn_coltype'.
	 * @see #__DNA__FIELD__vn_coltype
	 */
	
	public void setVn_coltype(short vn_coltype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 218, vn_coltype);
		} else {
			__io__block.writeShort(__io__address + 194, vn_coltype);
		}
	}

	/**
	 * Get method for struct member 'noisedepth'.
	 * @see #__DNA__FIELD__noisedepth
	 */
	
	public short getNoisedepth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 220);
		} else {
			return __io__block.readShort(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'noisedepth'.
	 * @see #__DNA__FIELD__noisedepth
	 */
	
	public void setNoisedepth(short noisedepth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 220, noisedepth);
		} else {
			__io__block.writeShort(__io__address + 196, noisedepth);
		}
	}

	/**
	 * Get method for struct member 'noisetype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> noisedepth MUST be <= 30 else we get floating point exceptions </p>
	 * @see #__DNA__FIELD__noisetype
	 */
	
	public short getNoisetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 222);
		} else {
			return __io__block.readShort(__io__address + 198);
		}
	}

	/**
	 * Set method for struct member 'noisetype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> noisedepth MUST be <= 30 else we get floating point exceptions </p>
	 * @see #__DNA__FIELD__noisetype
	 */
	
	public void setNoisetype(short noisetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 222, noisetype);
		} else {
			__io__block.writeShort(__io__address + 198, noisetype);
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
			return __io__block.readShort(__io__address + 224);
		} else {
			return __io__block.readShort(__io__address + 200);
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
			__io__block.writeShort(__io__address + 224, noisebasis);
		} else {
			__io__block.writeShort(__io__address + 200, noisebasis);
		}
	}

	/**
	 * Get method for struct member 'noisebasis2'.
	 * @see #__DNA__FIELD__noisebasis2
	 */
	
	public short getNoisebasis2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 226);
		} else {
			return __io__block.readShort(__io__address + 202);
		}
	}

	/**
	 * Set method for struct member 'noisebasis2'.
	 * @see #__DNA__FIELD__noisebasis2
	 */
	
	public void setNoisebasis2(short noisebasis2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 226, noisebasis2);
		} else {
			__io__block.writeShort(__io__address + 202, noisebasis2);
		}
	}

	/**
	 * Get method for struct member 'imaflag'.
	 * @see #__DNA__FIELD__imaflag
	 */
	
	public short getImaflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 228);
		} else {
			return __io__block.readShort(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'imaflag'.
	 * @see #__DNA__FIELD__imaflag
	 */
	
	public void setImaflag(short imaflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 228, imaflag);
		} else {
			__io__block.writeShort(__io__address + 204, imaflag);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 230);
		} else {
			return __io__block.readShort(__io__address + 206);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 230, flag);
		} else {
			__io__block.writeShort(__io__address + 206, flag);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 232);
		} else {
			return __io__block.readShort(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 232, type);
		} else {
			__io__block.writeShort(__io__address + 208, type);
		}
	}

	/**
	 * Get method for struct member 'stype'.
	 * @see #__DNA__FIELD__stype
	 */
	
	public short getStype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 234);
		} else {
			return __io__block.readShort(__io__address + 210);
		}
	}

	/**
	 * Set method for struct member 'stype'.
	 * @see #__DNA__FIELD__stype
	 */
	
	public void setStype(short stype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 234, stype);
		} else {
			__io__block.writeShort(__io__address + 210, stype);
		}
	}

	/**
	 * Get method for struct member 'cropxmin'.
	 * @see #__DNA__FIELD__cropxmin
	 */
	
	public float getCropxmin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 236);
		} else {
			return __io__block.readFloat(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'cropxmin'.
	 * @see #__DNA__FIELD__cropxmin
	 */
	
	public void setCropxmin(float cropxmin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 236, cropxmin);
		} else {
			__io__block.writeFloat(__io__address + 212, cropxmin);
		}
	}

	/**
	 * Get method for struct member 'cropymin'.
	 * @see #__DNA__FIELD__cropymin
	 */
	
	public float getCropymin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 240);
		} else {
			return __io__block.readFloat(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'cropymin'.
	 * @see #__DNA__FIELD__cropymin
	 */
	
	public void setCropymin(float cropymin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 240, cropymin);
		} else {
			__io__block.writeFloat(__io__address + 216, cropymin);
		}
	}

	/**
	 * Get method for struct member 'cropxmax'.
	 * @see #__DNA__FIELD__cropxmax
	 */
	
	public float getCropxmax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 244);
		} else {
			return __io__block.readFloat(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'cropxmax'.
	 * @see #__DNA__FIELD__cropxmax
	 */
	
	public void setCropxmax(float cropxmax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 244, cropxmax);
		} else {
			__io__block.writeFloat(__io__address + 220, cropxmax);
		}
	}

	/**
	 * Get method for struct member 'cropymax'.
	 * @see #__DNA__FIELD__cropymax
	 */
	
	public float getCropymax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 248);
		} else {
			return __io__block.readFloat(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'cropymax'.
	 * @see #__DNA__FIELD__cropymax
	 */
	
	public void setCropymax(float cropymax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 248, cropymax);
		} else {
			__io__block.writeFloat(__io__address + 224, cropymax);
		}
	}

	/**
	 * Get method for struct member 'texfilter'.
	 * @see #__DNA__FIELD__texfilter
	 */
	
	public int getTexfilter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 252);
		} else {
			return __io__block.readInt(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'texfilter'.
	 * @see #__DNA__FIELD__texfilter
	 */
	
	public void setTexfilter(int texfilter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 252, texfilter);
		} else {
			__io__block.writeInt(__io__address + 228, texfilter);
		}
	}

	/**
	 * Get method for struct member 'afmax'.
	 * @see #__DNA__FIELD__afmax
	 */
	
	public int getAfmax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 256);
		} else {
			return __io__block.readInt(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'afmax'.
	 * @see #__DNA__FIELD__afmax
	 */
	
	public void setAfmax(int afmax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 256, afmax);
		} else {
			__io__block.writeInt(__io__address + 232, afmax);
		}
	}

	/**
	 * Get method for struct member 'xrepeat'.
	 * @see #__DNA__FIELD__xrepeat
	 */
	
	public short getXrepeat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 260);
		} else {
			return __io__block.readShort(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'xrepeat'.
	 * @see #__DNA__FIELD__xrepeat
	 */
	
	public void setXrepeat(short xrepeat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 260, xrepeat);
		} else {
			__io__block.writeShort(__io__address + 236, xrepeat);
		}
	}

	/**
	 * Get method for struct member 'yrepeat'.
	 * @see #__DNA__FIELD__yrepeat
	 */
	
	public short getYrepeat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 262);
		} else {
			return __io__block.readShort(__io__address + 238);
		}
	}

	/**
	 * Set method for struct member 'yrepeat'.
	 * @see #__DNA__FIELD__yrepeat
	 */
	
	public void setYrepeat(short yrepeat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 262, yrepeat);
		} else {
			__io__block.writeShort(__io__address + 238, yrepeat);
		}
	}

	/**
	 * Get method for struct member 'extend'.
	 * @see #__DNA__FIELD__extend
	 */
	
	public short getExtend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 264);
		} else {
			return __io__block.readShort(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'extend'.
	 * @see #__DNA__FIELD__extend
	 */
	
	public void setExtend(short extend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 264, extend);
		} else {
			__io__block.writeShort(__io__address + 240, extend);
		}
	}

	/**
	 * Get method for struct member 'fie_ima'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> variables disabled, moved to struct iuser </p>
	 * @see #__DNA__FIELD__fie_ima
	 */
	
	public short getFie_ima() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 266);
		} else {
			return __io__block.readShort(__io__address + 242);
		}
	}

	/**
	 * Set method for struct member 'fie_ima'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> variables disabled, moved to struct iuser </p>
	 * @see #__DNA__FIELD__fie_ima
	 */
	
	public void setFie_ima(short fie_ima) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 266, fie_ima);
		} else {
			__io__block.writeShort(__io__address + 242, fie_ima);
		}
	}

	/**
	 * Get method for struct member 'len'.
	 * @see #__DNA__FIELD__len
	 */
	
	public int getLen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 268);
		} else {
			return __io__block.readInt(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'len'.
	 * @see #__DNA__FIELD__len
	 */
	
	public void setLen(int len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 268, len);
		} else {
			__io__block.writeInt(__io__address + 244, len);
		}
	}

	/**
	 * Get method for struct member 'frames'.
	 * @see #__DNA__FIELD__frames
	 */
	
	public int getFrames() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 272);
		} else {
			return __io__block.readInt(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'frames'.
	 * @see #__DNA__FIELD__frames
	 */
	
	public void setFrames(int frames) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 272, frames);
		} else {
			__io__block.writeInt(__io__address + 248, frames);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public int getOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 276);
		} else {
			return __io__block.readInt(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(int offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 276, offset);
		} else {
			__io__block.writeInt(__io__address + 252, offset);
		}
	}

	/**
	 * Get method for struct member 'sfra'.
	 * @see #__DNA__FIELD__sfra
	 */
	
	public int getSfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 280);
		} else {
			return __io__block.readInt(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'sfra'.
	 * @see #__DNA__FIELD__sfra
	 */
	
	public void setSfra(int sfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 280, sfra);
		} else {
			__io__block.writeInt(__io__address + 256, sfra);
		}
	}

	/**
	 * Get method for struct member 'checkerdist'.
	 * @see #__DNA__FIELD__checkerdist
	 */
	
	public float getCheckerdist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 284);
		} else {
			return __io__block.readFloat(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'checkerdist'.
	 * @see #__DNA__FIELD__checkerdist
	 */
	
	public void setCheckerdist(float checkerdist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 284, checkerdist);
		} else {
			__io__block.writeFloat(__io__address + 260, checkerdist);
		}
	}

	/**
	 * Get method for struct member 'nabla'.
	 * @see #__DNA__FIELD__nabla
	 */
	
	public float getNabla() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 288);
		} else {
			return __io__block.readFloat(__io__address + 264);
		}
	}

	/**
	 * Set method for struct member 'nabla'.
	 * @see #__DNA__FIELD__nabla
	 */
	
	public void setNabla(float nabla) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 288, nabla);
		} else {
			__io__block.writeFloat(__io__address + 264, nabla);
		}
	}

	/**
	 * Get method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public float getPad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 292);
		} else {
			return __io__block.readFloat(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public void setPad1(float pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 292, pad1);
		} else {
			__io__block.writeFloat(__io__address + 268, pad1);
		}
	}

	/**
	 * Get method for struct member 'iuser'.
	 * @see #__DNA__FIELD__iuser
	 */
	
	public ImageUser getIuser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImageUser(__io__address + 296, __io__block, __io__blockTable);
		} else {
			return new ImageUser(__io__address + 272, __io__block, __io__blockTable);
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
			__dna__offset = 296;
		} else {
			__dna__offset = 272;
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
			__dna__targetAddress = __io__block.readLong(__io__address + 336);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 308);
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
			__io__block.writeLong(__io__address + 336, __address);
		} else {
			__io__block.writeLong(__io__address + 308, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 344);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 312);
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
			__io__block.writeLong(__io__address + 344, __address);
		} else {
			__io__block.writeLong(__io__address + 312, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 352);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 316);
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
			__io__block.writeLong(__io__address + 352, __address);
		} else {
			__io__block.writeLong(__io__address + 316, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 360);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 320);
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
			__io__block.writeLong(__io__address + 360, __address);
		} else {
			__io__block.writeLong(__io__address + 320, __address);
		}
	}

	/**
	 * Get method for struct member 'env'.
	 * @see #__DNA__FIELD__env
	 */
	
	public CPointer<EnvMap> getEnv() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 368);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 324);
		}
		Class<?>[] __dna__targetTypes = new Class[]{EnvMap.class};
		return new CPointer<EnvMap>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, EnvMap.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'env'.
	 * @see #__DNA__FIELD__env
	 */
	
	public void setEnv(CPointer<EnvMap> env) throws IOException
	{
		long __address = ((env == null) ? 0 : env.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 368, __address);
		} else {
			__io__block.writeLong(__io__address + 324, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 328);
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
			__io__block.writeLong(__io__address + 376, __address);
		} else {
			__io__block.writeLong(__io__address + 328, __address);
		}
	}

	/**
	 * Get method for struct member 'pd'.
	 * @see #__DNA__FIELD__pd
	 */
	
	public CPointer<PointDensity> getPd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 384);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 332);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PointDensity.class};
		return new CPointer<PointDensity>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PointDensity.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pd'.
	 * @see #__DNA__FIELD__pd
	 */
	
	public void setPd(CPointer<PointDensity> pd) throws IOException
	{
		long __address = ((pd == null) ? 0 : pd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 384, __address);
		} else {
			__io__block.writeLong(__io__address + 332, __address);
		}
	}

	/**
	 * Get method for struct member 'vd'.
	 * @see #__DNA__FIELD__vd
	 */
	
	public CPointer<VoxelData> getVd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 392);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 336);
		}
		Class<?>[] __dna__targetTypes = new Class[]{VoxelData.class};
		return new CPointer<VoxelData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, VoxelData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'vd'.
	 * @see #__DNA__FIELD__vd
	 */
	
	public void setVd(CPointer<VoxelData> vd) throws IOException
	{
		long __address = ((vd == null) ? 0 : vd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 392, __address);
		} else {
			__io__block.writeLong(__io__address + 336, __address);
		}
	}

	/**
	 * Get method for struct member 'ot'.
	 * @see #__DNA__FIELD__ot
	 */
	
	public CPointer<OceanTex> getOt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 400);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 340);
		}
		Class<?>[] __dna__targetTypes = new Class[]{OceanTex.class};
		return new CPointer<OceanTex>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, OceanTex.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ot'.
	 * @see #__DNA__FIELD__ot
	 */
	
	public void setOt(CPointer<OceanTex> ot) throws IOException
	{
		long __address = ((ot == null) ? 0 : ot.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 400, __address);
		} else {
			__io__block.writeLong(__io__address + 340, __address);
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
			return __io__block.readByte(__io__address + 344);
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
			__io__block.writeByte(__io__address + 344, use_nodes);
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
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 409, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 345, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 409;
		} else {
			__dna__offset = 345;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Tex> __io__addressof() {
		return new CPointer<Tex>(__io__address, new Class[]{Tex.class}, __io__block, __io__blockTable);
	}

}
