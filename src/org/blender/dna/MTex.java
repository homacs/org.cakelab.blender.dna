package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MTex'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=312, size64=320)
public class MTex extends CFacade {

	/**
	 * This is the sdna index of the struct MTex.
	 * <p>
	 * It is required when allocating a new block to store data for MTex.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 32;

	/**
	 * Field descriptor (offset) for struct member 'texco'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__texco);
	 * CPointer&lt;Short&gt; p_texco = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texco'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texco = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'mapto'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__mapto);
	 * CPointer&lt;Short&gt; p_mapto = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mapto'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mapto = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'maptoneg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__maptoneg);
	 * CPointer&lt;Short&gt; p_maptoneg = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maptoneg'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maptoneg = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'blendtype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__blendtype);
	 * CPointer&lt;Short&gt; p_blendtype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blendtype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blendtype = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'tex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__tex);
	 * CPointer&lt;CPointer&lt;Tex&gt;&gt; p_tex = p.cast(new Class[]{CPointer.class, Tex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex'</li>
	 * <li>Signature: 'Tex*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__uvname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_uvname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uvname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uvname = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'projx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__projx);
	 * CPointer&lt;Byte&gt; p_projx = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projx'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projx = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'projy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__projy);
	 * CPointer&lt;Byte&gt; p_projy = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projy'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projy = new long[]{81, 89};

	/**
	 * Field descriptor (offset) for struct member 'projz'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__projz);
	 * CPointer&lt;Byte&gt; p_projz = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projz'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projz = new long[]{82, 90};

	/**
	 * Field descriptor (offset) for struct member 'mapping'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__mapping);
	 * CPointer&lt;Byte&gt; p_mapping = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mapping'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mapping = new long[]{83, 91};

	/**
	 * Field descriptor (offset) for struct member 'brush_map_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__brush_map_mode);
	 * CPointer&lt;Byte&gt; p_brush_map_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brush_map_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brush_map_mode = new long[]{84, 92};

	/**
	 * Field descriptor (offset) for struct member 'brush_angle_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__brush_angle_mode);
	 * CPointer&lt;Byte&gt; p_brush_angle_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brush_angle_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brush_angle_mode = new long[]{85, 93};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{86, 94};

	/**
	 * Field descriptor (offset) for struct member 'ofs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__ofs);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_ofs = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ofs'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ofs = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__size);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_size = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{100, 108};

	/**
	 * Field descriptor (offset) for struct member 'rot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__rot);
	 * CPointer&lt;Float&gt; p_rot = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rot'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rot = new long[]{112, 120};

	/**
	 * Field descriptor (offset) for struct member 'random_angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__random_angle);
	 * CPointer&lt;Float&gt; p_random_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'random_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__random_angle = new long[]{116, 124};

	/**
	 * Field descriptor (offset) for struct member 'texflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__texflag);
	 * CPointer&lt;Short&gt; p_texflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texflag = new long[]{120, 128};

	/**
	 * Field descriptor (offset) for struct member 'colormodel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__colormodel);
	 * CPointer&lt;Short&gt; p_colormodel = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colormodel'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colormodel = new long[]{122, 130};

	/**
	 * Field descriptor (offset) for struct member 'pmapto'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__pmapto);
	 * CPointer&lt;Short&gt; p_pmapto = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pmapto'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pmapto = new long[]{124, 132};

	/**
	 * Field descriptor (offset) for struct member 'pmaptoneg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__pmaptoneg);
	 * CPointer&lt;Short&gt; p_pmaptoneg = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pmaptoneg'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pmaptoneg = new long[]{126, 134};

	/**
	 * Field descriptor (offset) for struct member 'normapspace'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__normapspace);
	 * CPointer&lt;Short&gt; p_normapspace = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normapspace'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normapspace = new long[]{128, 136};

	/**
	 * Field descriptor (offset) for struct member 'which_output'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__which_output);
	 * CPointer&lt;Short&gt; p_which_output = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'which_output'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__which_output = new long[]{130, 138};

	/**
	 * Field descriptor (offset) for struct member 'r'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__r);
	 * CPointer&lt;Float&gt; p_r = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'r'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__r = new long[]{132, 140};

	/**
	 * Field descriptor (offset) for struct member 'g'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__g);
	 * CPointer&lt;Float&gt; p_g = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'g'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__g = new long[]{136, 144};

	/**
	 * Field descriptor (offset) for struct member 'b'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__b);
	 * CPointer&lt;Float&gt; p_b = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'b'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__b = new long[]{140, 148};

	/**
	 * Field descriptor (offset) for struct member 'k'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__k);
	 * CPointer&lt;Float&gt; p_k = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'k'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__k = new long[]{144, 152};

	/**
	 * Field descriptor (offset) for struct member 'def_var'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__def_var);
	 * CPointer&lt;Float&gt; p_def_var = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'def_var'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__def_var = new long[]{148, 156};

	/**
	 * Field descriptor (offset) for struct member 'rt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__rt);
	 * CPointer&lt;Float&gt; p_rt = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rt'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rt = new long[]{152, 160};

	/**
	 * Field descriptor (offset) for struct member 'colfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> common </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__colfac);
	 * CPointer&lt;Float&gt; p_colfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colfac = new long[]{156, 164};

	/**
	 * Field descriptor (offset) for struct member 'varfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__varfac);
	 * CPointer&lt;Float&gt; p_varfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'varfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__varfac = new long[]{160, 168};

	/**
	 * Field descriptor (offset) for struct member 'norfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> material </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__norfac);
	 * CPointer&lt;Float&gt; p_norfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'norfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__norfac = new long[]{164, 172};

	/**
	 * Field descriptor (offset) for struct member 'dispfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__dispfac);
	 * CPointer&lt;Float&gt; p_dispfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dispfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dispfac = new long[]{168, 176};

	/**
	 * Field descriptor (offset) for struct member 'warpfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__warpfac);
	 * CPointer&lt;Float&gt; p_warpfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'warpfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__warpfac = new long[]{172, 180};

	/**
	 * Field descriptor (offset) for struct member 'colspecfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__colspecfac);
	 * CPointer&lt;Float&gt; p_colspecfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colspecfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colspecfac = new long[]{176, 184};

	/**
	 * Field descriptor (offset) for struct member 'mirrfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__mirrfac);
	 * CPointer&lt;Float&gt; p_mirrfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mirrfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mirrfac = new long[]{180, 188};

	/**
	 * Field descriptor (offset) for struct member 'alphafac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__alphafac);
	 * CPointer&lt;Float&gt; p_alphafac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alphafac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alphafac = new long[]{184, 192};

	/**
	 * Field descriptor (offset) for struct member 'difffac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__difffac);
	 * CPointer&lt;Float&gt; p_difffac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'difffac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__difffac = new long[]{188, 196};

	/**
	 * Field descriptor (offset) for struct member 'specfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__specfac);
	 * CPointer&lt;Float&gt; p_specfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'specfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__specfac = new long[]{192, 200};

	/**
	 * Field descriptor (offset) for struct member 'emitfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__emitfac);
	 * CPointer&lt;Float&gt; p_emitfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'emitfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__emitfac = new long[]{196, 204};

	/**
	 * Field descriptor (offset) for struct member 'hardfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__hardfac);
	 * CPointer&lt;Float&gt; p_hardfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hardfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hardfac = new long[]{200, 208};

	/**
	 * Field descriptor (offset) for struct member 'raymirrfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__raymirrfac);
	 * CPointer&lt;Float&gt; p_raymirrfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'raymirrfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__raymirrfac = new long[]{204, 212};

	/**
	 * Field descriptor (offset) for struct member 'translfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__translfac);
	 * CPointer&lt;Float&gt; p_translfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'translfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__translfac = new long[]{208, 216};

	/**
	 * Field descriptor (offset) for struct member 'ambfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__ambfac);
	 * CPointer&lt;Float&gt; p_ambfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ambfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ambfac = new long[]{212, 220};

	/**
	 * Field descriptor (offset) for struct member 'colemitfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__colemitfac);
	 * CPointer&lt;Float&gt; p_colemitfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colemitfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colemitfac = new long[]{216, 224};

	/**
	 * Field descriptor (offset) for struct member 'colreflfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__colreflfac);
	 * CPointer&lt;Float&gt; p_colreflfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colreflfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colreflfac = new long[]{220, 228};

	/**
	 * Field descriptor (offset) for struct member 'coltransfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__coltransfac);
	 * CPointer&lt;Float&gt; p_coltransfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coltransfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coltransfac = new long[]{224, 232};

	/**
	 * Field descriptor (offset) for struct member 'densfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__densfac);
	 * CPointer&lt;Float&gt; p_densfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'densfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__densfac = new long[]{228, 236};

	/**
	 * Field descriptor (offset) for struct member 'scatterfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__scatterfac);
	 * CPointer&lt;Float&gt; p_scatterfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scatterfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scatterfac = new long[]{232, 240};

	/**
	 * Field descriptor (offset) for struct member 'reflfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__reflfac);
	 * CPointer&lt;Float&gt; p_reflfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reflfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reflfac = new long[]{236, 244};

	/**
	 * Field descriptor (offset) for struct member 'timefac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> particles </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__timefac);
	 * CPointer&lt;Float&gt; p_timefac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'timefac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__timefac = new long[]{240, 248};

	/**
	 * Field descriptor (offset) for struct member 'lengthfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__lengthfac);
	 * CPointer&lt;Float&gt; p_lengthfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lengthfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lengthfac = new long[]{244, 252};

	/**
	 * Field descriptor (offset) for struct member 'clumpfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__clumpfac);
	 * CPointer&lt;Float&gt; p_clumpfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clumpfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clumpfac = new long[]{248, 256};

	/**
	 * Field descriptor (offset) for struct member 'dampfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__dampfac);
	 * CPointer&lt;Float&gt; p_dampfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dampfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dampfac = new long[]{252, 260};

	/**
	 * Field descriptor (offset) for struct member 'kinkfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__kinkfac);
	 * CPointer&lt;Float&gt; p_kinkfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kinkfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kinkfac = new long[]{256, 264};

	/**
	 * Field descriptor (offset) for struct member 'kinkampfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__kinkampfac);
	 * CPointer&lt;Float&gt; p_kinkampfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kinkampfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kinkampfac = new long[]{260, 268};

	/**
	 * Field descriptor (offset) for struct member 'roughfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__roughfac);
	 * CPointer&lt;Float&gt; p_roughfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'roughfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__roughfac = new long[]{264, 272};

	/**
	 * Field descriptor (offset) for struct member 'padensfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__padensfac);
	 * CPointer&lt;Float&gt; p_padensfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'padensfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__padensfac = new long[]{268, 276};

	/**
	 * Field descriptor (offset) for struct member 'gravityfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__gravityfac);
	 * CPointer&lt;Float&gt; p_gravityfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gravityfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gravityfac = new long[]{272, 280};

	/**
	 * Field descriptor (offset) for struct member 'lifefac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__lifefac);
	 * CPointer&lt;Float&gt; p_lifefac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lifefac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lifefac = new long[]{276, 284};

	/**
	 * Field descriptor (offset) for struct member 'sizefac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__sizefac);
	 * CPointer&lt;Float&gt; p_sizefac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sizefac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sizefac = new long[]{280, 288};

	/**
	 * Field descriptor (offset) for struct member 'ivelfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__ivelfac);
	 * CPointer&lt;Float&gt; p_ivelfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ivelfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ivelfac = new long[]{284, 292};

	/**
	 * Field descriptor (offset) for struct member 'fieldfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__fieldfac);
	 * CPointer&lt;Float&gt; p_fieldfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fieldfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fieldfac = new long[]{288, 296};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__pad2);
	 * CPointer&lt;Integer&gt; p_pad2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{292, 300};

	/**
	 * Field descriptor (offset) for struct member 'shadowfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> lamp </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__shadowfac);
	 * CPointer&lt;Float&gt; p_shadowfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadowfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadowfac = new long[]{296, 304};

	/**
	 * Field descriptor (offset) for struct member 'zenupfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> world </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__zenupfac);
	 * CPointer&lt;Float&gt; p_zenupfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zenupfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zenupfac = new long[]{300, 308};

	/**
	 * Field descriptor (offset) for struct member 'zendownfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__zendownfac);
	 * CPointer&lt;Float&gt; p_zendownfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zendownfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zendownfac = new long[]{304, 312};

	/**
	 * Field descriptor (offset) for struct member 'blendfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MTex mtex = ...;
	 * CPointer&lt;Object&gt; p = mtex.__dna__addressof(MTex.__DNA__FIELD__blendfac);
	 * CPointer&lt;Float&gt; p_blendfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blendfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blendfac = new long[]{308, 316};

	public MTex(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MTex(MTex that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'texco'.
	 * @see #__DNA__FIELD__texco
	 */
	
	public short getTexco() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'texco'.
	 * @see #__DNA__FIELD__texco
	 */
	
	public void setTexco(short texco) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, texco);
		} else {
			__io__block.writeShort(__io__address + 0, texco);
		}
	}

	/**
	 * Get method for struct member 'mapto'.
	 * @see #__DNA__FIELD__mapto
	 */
	
	public short getMapto() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'mapto'.
	 * @see #__DNA__FIELD__mapto
	 */
	
	public void setMapto(short mapto) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, mapto);
		} else {
			__io__block.writeShort(__io__address + 2, mapto);
		}
	}

	/**
	 * Get method for struct member 'maptoneg'.
	 * @see #__DNA__FIELD__maptoneg
	 */
	
	public short getMaptoneg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'maptoneg'.
	 * @see #__DNA__FIELD__maptoneg
	 */
	
	public void setMaptoneg(short maptoneg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, maptoneg);
		} else {
			__io__block.writeShort(__io__address + 4, maptoneg);
		}
	}

	/**
	 * Get method for struct member 'blendtype'.
	 * @see #__DNA__FIELD__blendtype
	 */
	
	public short getBlendtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'blendtype'.
	 * @see #__DNA__FIELD__blendtype
	 */
	
	public void setBlendtype(short blendtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, blendtype);
		} else {
			__io__block.writeShort(__io__address + 6, blendtype);
		}
	}

	/**
	 * Get method for struct member 'object'.
	 * @see #__DNA__FIELD__object
	 */
	
	public CPointer<BlenderObject> getObject() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object'.
	 * @see #__DNA__FIELD__object
	 */
	
	public void setObject(CPointer<BlenderObject> object) throws IOException
	{
		long __address = ((object == null) ? 0 : object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'tex'.
	 * @see #__DNA__FIELD__tex
	 */
	
	public CPointer<Tex> getTex() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Tex.class};
		return new CPointer<Tex>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Tex.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex'.
	 * @see #__DNA__FIELD__tex
	 */
	
	public void setTex(CPointer<Tex> tex) throws IOException
	{
		long __address = ((tex == null) ? 0 : tex.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME </p>
	 * @see #__DNA__FIELD__uvname
	 */
	
	public CArrayFacade<Byte> getUvname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uvname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME </p>
	 * @see #__DNA__FIELD__uvname
	 */
	
	public void setUvname(CArrayFacade<Byte> uvname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(uvname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uvname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uvname);
		} else {
			__io__generic__copy( getUvname(), uvname);
		}
	}

	/**
	 * Get method for struct member 'projx'.
	 * @see #__DNA__FIELD__projx
	 */
	
	public byte getProjx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 88);
		} else {
			return __io__block.readByte(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'projx'.
	 * @see #__DNA__FIELD__projx
	 */
	
	public void setProjx(byte projx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 88, projx);
		} else {
			__io__block.writeByte(__io__address + 80, projx);
		}
	}

	/**
	 * Get method for struct member 'projy'.
	 * @see #__DNA__FIELD__projy
	 */
	
	public byte getProjy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 89);
		} else {
			return __io__block.readByte(__io__address + 81);
		}
	}

	/**
	 * Set method for struct member 'projy'.
	 * @see #__DNA__FIELD__projy
	 */
	
	public void setProjy(byte projy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 89, projy);
		} else {
			__io__block.writeByte(__io__address + 81, projy);
		}
	}

	/**
	 * Get method for struct member 'projz'.
	 * @see #__DNA__FIELD__projz
	 */
	
	public byte getProjz() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 90);
		} else {
			return __io__block.readByte(__io__address + 82);
		}
	}

	/**
	 * Set method for struct member 'projz'.
	 * @see #__DNA__FIELD__projz
	 */
	
	public void setProjz(byte projz) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 90, projz);
		} else {
			__io__block.writeByte(__io__address + 82, projz);
		}
	}

	/**
	 * Get method for struct member 'mapping'.
	 * @see #__DNA__FIELD__mapping
	 */
	
	public byte getMapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 91);
		} else {
			return __io__block.readByte(__io__address + 83);
		}
	}

	/**
	 * Set method for struct member 'mapping'.
	 * @see #__DNA__FIELD__mapping
	 */
	
	public void setMapping(byte mapping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 91, mapping);
		} else {
			__io__block.writeByte(__io__address + 83, mapping);
		}
	}

	/**
	 * Get method for struct member 'brush_map_mode'.
	 * @see #__DNA__FIELD__brush_map_mode
	 */
	
	public byte getBrush_map_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 92);
		} else {
			return __io__block.readByte(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'brush_map_mode'.
	 * @see #__DNA__FIELD__brush_map_mode
	 */
	
	public void setBrush_map_mode(byte brush_map_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 92, brush_map_mode);
		} else {
			__io__block.writeByte(__io__address + 84, brush_map_mode);
		}
	}

	/**
	 * Get method for struct member 'brush_angle_mode'.
	 * @see #__DNA__FIELD__brush_angle_mode
	 */
	
	public byte getBrush_angle_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 93);
		} else {
			return __io__block.readByte(__io__address + 85);
		}
	}

	/**
	 * Set method for struct member 'brush_angle_mode'.
	 * @see #__DNA__FIELD__brush_angle_mode
	 */
	
	public void setBrush_angle_mode(byte brush_angle_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 93, brush_angle_mode);
		} else {
			__io__block.writeByte(__io__address + 85, brush_angle_mode);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 94, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 86, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 94;
		} else {
			__dna__offset = 86;
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
	 * Get method for struct member 'ofs'.
	 * @see #__DNA__FIELD__ofs
	 */
	
	public CArrayFacade<Float> getOfs() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ofs'.
	 * @see #__DNA__FIELD__ofs
	 */
	
	public void setOfs(CArrayFacade<Float> ofs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 88;
		}
		if (__io__equals(ofs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ofs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ofs);
		} else {
			__io__generic__copy( getOfs(), ofs);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public CArrayFacade<Float> getSize() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 108, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(CArrayFacade<Float> size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 108;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(size, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, size)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, size);
		} else {
			__io__generic__copy( getSize(), size);
		}
	}

	/**
	 * Get method for struct member 'rot'.
	 * @see #__DNA__FIELD__rot
	 */
	
	public float getRot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'rot'.
	 * @see #__DNA__FIELD__rot
	 */
	
	public void setRot(float rot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, rot);
		} else {
			__io__block.writeFloat(__io__address + 112, rot);
		}
	}

	/**
	 * Get method for struct member 'random_angle'.
	 * @see #__DNA__FIELD__random_angle
	 */
	
	public float getRandom_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'random_angle'.
	 * @see #__DNA__FIELD__random_angle
	 */
	
	public void setRandom_angle(float random_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, random_angle);
		} else {
			__io__block.writeFloat(__io__address + 116, random_angle);
		}
	}

	/**
	 * Get method for struct member 'texflag'.
	 * @see #__DNA__FIELD__texflag
	 */
	
	public short getTexflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 128);
		} else {
			return __io__block.readShort(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'texflag'.
	 * @see #__DNA__FIELD__texflag
	 */
	
	public void setTexflag(short texflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 128, texflag);
		} else {
			__io__block.writeShort(__io__address + 120, texflag);
		}
	}

	/**
	 * Get method for struct member 'colormodel'.
	 * @see #__DNA__FIELD__colormodel
	 */
	
	public short getColormodel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 130);
		} else {
			return __io__block.readShort(__io__address + 122);
		}
	}

	/**
	 * Set method for struct member 'colormodel'.
	 * @see #__DNA__FIELD__colormodel
	 */
	
	public void setColormodel(short colormodel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 130, colormodel);
		} else {
			__io__block.writeShort(__io__address + 122, colormodel);
		}
	}

	/**
	 * Get method for struct member 'pmapto'.
	 * @see #__DNA__FIELD__pmapto
	 */
	
	public short getPmapto() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 132);
		} else {
			return __io__block.readShort(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'pmapto'.
	 * @see #__DNA__FIELD__pmapto
	 */
	
	public void setPmapto(short pmapto) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 132, pmapto);
		} else {
			__io__block.writeShort(__io__address + 124, pmapto);
		}
	}

	/**
	 * Get method for struct member 'pmaptoneg'.
	 * @see #__DNA__FIELD__pmaptoneg
	 */
	
	public short getPmaptoneg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 134);
		} else {
			return __io__block.readShort(__io__address + 126);
		}
	}

	/**
	 * Set method for struct member 'pmaptoneg'.
	 * @see #__DNA__FIELD__pmaptoneg
	 */
	
	public void setPmaptoneg(short pmaptoneg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 134, pmaptoneg);
		} else {
			__io__block.writeShort(__io__address + 126, pmaptoneg);
		}
	}

	/**
	 * Get method for struct member 'normapspace'.
	 * @see #__DNA__FIELD__normapspace
	 */
	
	public short getNormapspace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 136);
		} else {
			return __io__block.readShort(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'normapspace'.
	 * @see #__DNA__FIELD__normapspace
	 */
	
	public void setNormapspace(short normapspace) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 136, normapspace);
		} else {
			__io__block.writeShort(__io__address + 128, normapspace);
		}
	}

	/**
	 * Get method for struct member 'which_output'.
	 * @see #__DNA__FIELD__which_output
	 */
	
	public short getWhich_output() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 138);
		} else {
			return __io__block.readShort(__io__address + 130);
		}
	}

	/**
	 * Set method for struct member 'which_output'.
	 * @see #__DNA__FIELD__which_output
	 */
	
	public void setWhich_output(short which_output) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 138, which_output);
		} else {
			__io__block.writeShort(__io__address + 130, which_output);
		}
	}

	/**
	 * Get method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public float getR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public void setR(float r) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, r);
		} else {
			__io__block.writeFloat(__io__address + 132, r);
		}
	}

	/**
	 * Get method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public float getG() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public void setG(float g) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, g);
		} else {
			__io__block.writeFloat(__io__address + 136, g);
		}
	}

	/**
	 * Get method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public float getB() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public void setB(float b) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, b);
		} else {
			__io__block.writeFloat(__io__address + 140, b);
		}
	}

	/**
	 * Get method for struct member 'k'.
	 * @see #__DNA__FIELD__k
	 */
	
	public float getK() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'k'.
	 * @see #__DNA__FIELD__k
	 */
	
	public void setK(float k) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, k);
		} else {
			__io__block.writeFloat(__io__address + 144, k);
		}
	}

	/**
	 * Get method for struct member 'def_var'.
	 * @see #__DNA__FIELD__def_var
	 */
	
	public float getDef_var() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'def_var'.
	 * @see #__DNA__FIELD__def_var
	 */
	
	public void setDef_var(float def_var) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, def_var);
		} else {
			__io__block.writeFloat(__io__address + 148, def_var);
		}
	}

	/**
	 * Get method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public float getRt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public void setRt(float rt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, rt);
		} else {
			__io__block.writeFloat(__io__address + 152, rt);
		}
	}

	/**
	 * Get method for struct member 'colfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> common </p>
	 * @see #__DNA__FIELD__colfac
	 */
	
	public float getColfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'colfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> common </p>
	 * @see #__DNA__FIELD__colfac
	 */
	
	public void setColfac(float colfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, colfac);
		} else {
			__io__block.writeFloat(__io__address + 156, colfac);
		}
	}

	/**
	 * Get method for struct member 'varfac'.
	 * @see #__DNA__FIELD__varfac
	 */
	
	public float getVarfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'varfac'.
	 * @see #__DNA__FIELD__varfac
	 */
	
	public void setVarfac(float varfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, varfac);
		} else {
			__io__block.writeFloat(__io__address + 160, varfac);
		}
	}

	/**
	 * Get method for struct member 'norfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> material </p>
	 * @see #__DNA__FIELD__norfac
	 */
	
	public float getNorfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'norfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> material </p>
	 * @see #__DNA__FIELD__norfac
	 */
	
	public void setNorfac(float norfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, norfac);
		} else {
			__io__block.writeFloat(__io__address + 164, norfac);
		}
	}

	/**
	 * Get method for struct member 'dispfac'.
	 * @see #__DNA__FIELD__dispfac
	 */
	
	public float getDispfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'dispfac'.
	 * @see #__DNA__FIELD__dispfac
	 */
	
	public void setDispfac(float dispfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, dispfac);
		} else {
			__io__block.writeFloat(__io__address + 168, dispfac);
		}
	}

	/**
	 * Get method for struct member 'warpfac'.
	 * @see #__DNA__FIELD__warpfac
	 */
	
	public float getWarpfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'warpfac'.
	 * @see #__DNA__FIELD__warpfac
	 */
	
	public void setWarpfac(float warpfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, warpfac);
		} else {
			__io__block.writeFloat(__io__address + 172, warpfac);
		}
	}

	/**
	 * Get method for struct member 'colspecfac'.
	 * @see #__DNA__FIELD__colspecfac
	 */
	
	public float getColspecfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'colspecfac'.
	 * @see #__DNA__FIELD__colspecfac
	 */
	
	public void setColspecfac(float colspecfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, colspecfac);
		} else {
			__io__block.writeFloat(__io__address + 176, colspecfac);
		}
	}

	/**
	 * Get method for struct member 'mirrfac'.
	 * @see #__DNA__FIELD__mirrfac
	 */
	
	public float getMirrfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'mirrfac'.
	 * @see #__DNA__FIELD__mirrfac
	 */
	
	public void setMirrfac(float mirrfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, mirrfac);
		} else {
			__io__block.writeFloat(__io__address + 180, mirrfac);
		}
	}

	/**
	 * Get method for struct member 'alphafac'.
	 * @see #__DNA__FIELD__alphafac
	 */
	
	public float getAlphafac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'alphafac'.
	 * @see #__DNA__FIELD__alphafac
	 */
	
	public void setAlphafac(float alphafac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, alphafac);
		} else {
			__io__block.writeFloat(__io__address + 184, alphafac);
		}
	}

	/**
	 * Get method for struct member 'difffac'.
	 * @see #__DNA__FIELD__difffac
	 */
	
	public float getDifffac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 196);
		} else {
			return __io__block.readFloat(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'difffac'.
	 * @see #__DNA__FIELD__difffac
	 */
	
	public void setDifffac(float difffac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 196, difffac);
		} else {
			__io__block.writeFloat(__io__address + 188, difffac);
		}
	}

	/**
	 * Get method for struct member 'specfac'.
	 * @see #__DNA__FIELD__specfac
	 */
	
	public float getSpecfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'specfac'.
	 * @see #__DNA__FIELD__specfac
	 */
	
	public void setSpecfac(float specfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, specfac);
		} else {
			__io__block.writeFloat(__io__address + 192, specfac);
		}
	}

	/**
	 * Get method for struct member 'emitfac'.
	 * @see #__DNA__FIELD__emitfac
	 */
	
	public float getEmitfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 204);
		} else {
			return __io__block.readFloat(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'emitfac'.
	 * @see #__DNA__FIELD__emitfac
	 */
	
	public void setEmitfac(float emitfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 204, emitfac);
		} else {
			__io__block.writeFloat(__io__address + 196, emitfac);
		}
	}

	/**
	 * Get method for struct member 'hardfac'.
	 * @see #__DNA__FIELD__hardfac
	 */
	
	public float getHardfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'hardfac'.
	 * @see #__DNA__FIELD__hardfac
	 */
	
	public void setHardfac(float hardfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, hardfac);
		} else {
			__io__block.writeFloat(__io__address + 200, hardfac);
		}
	}

	/**
	 * Get method for struct member 'raymirrfac'.
	 * @see #__DNA__FIELD__raymirrfac
	 */
	
	public float getRaymirrfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'raymirrfac'.
	 * @see #__DNA__FIELD__raymirrfac
	 */
	
	public void setRaymirrfac(float raymirrfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, raymirrfac);
		} else {
			__io__block.writeFloat(__io__address + 204, raymirrfac);
		}
	}

	/**
	 * Get method for struct member 'translfac'.
	 * @see #__DNA__FIELD__translfac
	 */
	
	public float getTranslfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 216);
		} else {
			return __io__block.readFloat(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'translfac'.
	 * @see #__DNA__FIELD__translfac
	 */
	
	public void setTranslfac(float translfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 216, translfac);
		} else {
			__io__block.writeFloat(__io__address + 208, translfac);
		}
	}

	/**
	 * Get method for struct member 'ambfac'.
	 * @see #__DNA__FIELD__ambfac
	 */
	
	public float getAmbfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 220);
		} else {
			return __io__block.readFloat(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'ambfac'.
	 * @see #__DNA__FIELD__ambfac
	 */
	
	public void setAmbfac(float ambfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 220, ambfac);
		} else {
			__io__block.writeFloat(__io__address + 212, ambfac);
		}
	}

	/**
	 * Get method for struct member 'colemitfac'.
	 * @see #__DNA__FIELD__colemitfac
	 */
	
	public float getColemitfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 224);
		} else {
			return __io__block.readFloat(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'colemitfac'.
	 * @see #__DNA__FIELD__colemitfac
	 */
	
	public void setColemitfac(float colemitfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 224, colemitfac);
		} else {
			__io__block.writeFloat(__io__address + 216, colemitfac);
		}
	}

	/**
	 * Get method for struct member 'colreflfac'.
	 * @see #__DNA__FIELD__colreflfac
	 */
	
	public float getColreflfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 228);
		} else {
			return __io__block.readFloat(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'colreflfac'.
	 * @see #__DNA__FIELD__colreflfac
	 */
	
	public void setColreflfac(float colreflfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 228, colreflfac);
		} else {
			__io__block.writeFloat(__io__address + 220, colreflfac);
		}
	}

	/**
	 * Get method for struct member 'coltransfac'.
	 * @see #__DNA__FIELD__coltransfac
	 */
	
	public float getColtransfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 232);
		} else {
			return __io__block.readFloat(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'coltransfac'.
	 * @see #__DNA__FIELD__coltransfac
	 */
	
	public void setColtransfac(float coltransfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 232, coltransfac);
		} else {
			__io__block.writeFloat(__io__address + 224, coltransfac);
		}
	}

	/**
	 * Get method for struct member 'densfac'.
	 * @see #__DNA__FIELD__densfac
	 */
	
	public float getDensfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 236);
		} else {
			return __io__block.readFloat(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'densfac'.
	 * @see #__DNA__FIELD__densfac
	 */
	
	public void setDensfac(float densfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 236, densfac);
		} else {
			__io__block.writeFloat(__io__address + 228, densfac);
		}
	}

	/**
	 * Get method for struct member 'scatterfac'.
	 * @see #__DNA__FIELD__scatterfac
	 */
	
	public float getScatterfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 240);
		} else {
			return __io__block.readFloat(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'scatterfac'.
	 * @see #__DNA__FIELD__scatterfac
	 */
	
	public void setScatterfac(float scatterfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 240, scatterfac);
		} else {
			__io__block.writeFloat(__io__address + 232, scatterfac);
		}
	}

	/**
	 * Get method for struct member 'reflfac'.
	 * @see #__DNA__FIELD__reflfac
	 */
	
	public float getReflfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 244);
		} else {
			return __io__block.readFloat(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'reflfac'.
	 * @see #__DNA__FIELD__reflfac
	 */
	
	public void setReflfac(float reflfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 244, reflfac);
		} else {
			__io__block.writeFloat(__io__address + 236, reflfac);
		}
	}

	/**
	 * Get method for struct member 'timefac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> particles </p>
	 * @see #__DNA__FIELD__timefac
	 */
	
	public float getTimefac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 248);
		} else {
			return __io__block.readFloat(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'timefac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> particles </p>
	 * @see #__DNA__FIELD__timefac
	 */
	
	public void setTimefac(float timefac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 248, timefac);
		} else {
			__io__block.writeFloat(__io__address + 240, timefac);
		}
	}

	/**
	 * Get method for struct member 'lengthfac'.
	 * @see #__DNA__FIELD__lengthfac
	 */
	
	public float getLengthfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 252);
		} else {
			return __io__block.readFloat(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'lengthfac'.
	 * @see #__DNA__FIELD__lengthfac
	 */
	
	public void setLengthfac(float lengthfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 252, lengthfac);
		} else {
			__io__block.writeFloat(__io__address + 244, lengthfac);
		}
	}

	/**
	 * Get method for struct member 'clumpfac'.
	 * @see #__DNA__FIELD__clumpfac
	 */
	
	public float getClumpfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 256);
		} else {
			return __io__block.readFloat(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'clumpfac'.
	 * @see #__DNA__FIELD__clumpfac
	 */
	
	public void setClumpfac(float clumpfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 256, clumpfac);
		} else {
			__io__block.writeFloat(__io__address + 248, clumpfac);
		}
	}

	/**
	 * Get method for struct member 'dampfac'.
	 * @see #__DNA__FIELD__dampfac
	 */
	
	public float getDampfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 260);
		} else {
			return __io__block.readFloat(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'dampfac'.
	 * @see #__DNA__FIELD__dampfac
	 */
	
	public void setDampfac(float dampfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 260, dampfac);
		} else {
			__io__block.writeFloat(__io__address + 252, dampfac);
		}
	}

	/**
	 * Get method for struct member 'kinkfac'.
	 * @see #__DNA__FIELD__kinkfac
	 */
	
	public float getKinkfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 264);
		} else {
			return __io__block.readFloat(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'kinkfac'.
	 * @see #__DNA__FIELD__kinkfac
	 */
	
	public void setKinkfac(float kinkfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 264, kinkfac);
		} else {
			__io__block.writeFloat(__io__address + 256, kinkfac);
		}
	}

	/**
	 * Get method for struct member 'kinkampfac'.
	 * @see #__DNA__FIELD__kinkampfac
	 */
	
	public float getKinkampfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 268);
		} else {
			return __io__block.readFloat(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'kinkampfac'.
	 * @see #__DNA__FIELD__kinkampfac
	 */
	
	public void setKinkampfac(float kinkampfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 268, kinkampfac);
		} else {
			__io__block.writeFloat(__io__address + 260, kinkampfac);
		}
	}

	/**
	 * Get method for struct member 'roughfac'.
	 * @see #__DNA__FIELD__roughfac
	 */
	
	public float getRoughfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 272);
		} else {
			return __io__block.readFloat(__io__address + 264);
		}
	}

	/**
	 * Set method for struct member 'roughfac'.
	 * @see #__DNA__FIELD__roughfac
	 */
	
	public void setRoughfac(float roughfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 272, roughfac);
		} else {
			__io__block.writeFloat(__io__address + 264, roughfac);
		}
	}

	/**
	 * Get method for struct member 'padensfac'.
	 * @see #__DNA__FIELD__padensfac
	 */
	
	public float getPadensfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 276);
		} else {
			return __io__block.readFloat(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'padensfac'.
	 * @see #__DNA__FIELD__padensfac
	 */
	
	public void setPadensfac(float padensfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 276, padensfac);
		} else {
			__io__block.writeFloat(__io__address + 268, padensfac);
		}
	}

	/**
	 * Get method for struct member 'gravityfac'.
	 * @see #__DNA__FIELD__gravityfac
	 */
	
	public float getGravityfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 280);
		} else {
			return __io__block.readFloat(__io__address + 272);
		}
	}

	/**
	 * Set method for struct member 'gravityfac'.
	 * @see #__DNA__FIELD__gravityfac
	 */
	
	public void setGravityfac(float gravityfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 280, gravityfac);
		} else {
			__io__block.writeFloat(__io__address + 272, gravityfac);
		}
	}

	/**
	 * Get method for struct member 'lifefac'.
	 * @see #__DNA__FIELD__lifefac
	 */
	
	public float getLifefac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 284);
		} else {
			return __io__block.readFloat(__io__address + 276);
		}
	}

	/**
	 * Set method for struct member 'lifefac'.
	 * @see #__DNA__FIELD__lifefac
	 */
	
	public void setLifefac(float lifefac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 284, lifefac);
		} else {
			__io__block.writeFloat(__io__address + 276, lifefac);
		}
	}

	/**
	 * Get method for struct member 'sizefac'.
	 * @see #__DNA__FIELD__sizefac
	 */
	
	public float getSizefac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 288);
		} else {
			return __io__block.readFloat(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'sizefac'.
	 * @see #__DNA__FIELD__sizefac
	 */
	
	public void setSizefac(float sizefac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 288, sizefac);
		} else {
			__io__block.writeFloat(__io__address + 280, sizefac);
		}
	}

	/**
	 * Get method for struct member 'ivelfac'.
	 * @see #__DNA__FIELD__ivelfac
	 */
	
	public float getIvelfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 292);
		} else {
			return __io__block.readFloat(__io__address + 284);
		}
	}

	/**
	 * Set method for struct member 'ivelfac'.
	 * @see #__DNA__FIELD__ivelfac
	 */
	
	public void setIvelfac(float ivelfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 292, ivelfac);
		} else {
			__io__block.writeFloat(__io__address + 284, ivelfac);
		}
	}

	/**
	 * Get method for struct member 'fieldfac'.
	 * @see #__DNA__FIELD__fieldfac
	 */
	
	public float getFieldfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 296);
		} else {
			return __io__block.readFloat(__io__address + 288);
		}
	}

	/**
	 * Set method for struct member 'fieldfac'.
	 * @see #__DNA__FIELD__fieldfac
	 */
	
	public void setFieldfac(float fieldfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 296, fieldfac);
		} else {
			__io__block.writeFloat(__io__address + 288, fieldfac);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public int getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 300);
		} else {
			return __io__block.readInt(__io__address + 292);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(int pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 300, pad2);
		} else {
			__io__block.writeInt(__io__address + 292, pad2);
		}
	}

	/**
	 * Get method for struct member 'shadowfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> lamp </p>
	 * @see #__DNA__FIELD__shadowfac
	 */
	
	public float getShadowfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 304);
		} else {
			return __io__block.readFloat(__io__address + 296);
		}
	}

	/**
	 * Set method for struct member 'shadowfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> lamp </p>
	 * @see #__DNA__FIELD__shadowfac
	 */
	
	public void setShadowfac(float shadowfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 304, shadowfac);
		} else {
			__io__block.writeFloat(__io__address + 296, shadowfac);
		}
	}

	/**
	 * Get method for struct member 'zenupfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> world </p>
	 * @see #__DNA__FIELD__zenupfac
	 */
	
	public float getZenupfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 308);
		} else {
			return __io__block.readFloat(__io__address + 300);
		}
	}

	/**
	 * Set method for struct member 'zenupfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> world </p>
	 * @see #__DNA__FIELD__zenupfac
	 */
	
	public void setZenupfac(float zenupfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 308, zenupfac);
		} else {
			__io__block.writeFloat(__io__address + 300, zenupfac);
		}
	}

	/**
	 * Get method for struct member 'zendownfac'.
	 * @see #__DNA__FIELD__zendownfac
	 */
	
	public float getZendownfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 312);
		} else {
			return __io__block.readFloat(__io__address + 304);
		}
	}

	/**
	 * Set method for struct member 'zendownfac'.
	 * @see #__DNA__FIELD__zendownfac
	 */
	
	public void setZendownfac(float zendownfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 312, zendownfac);
		} else {
			__io__block.writeFloat(__io__address + 304, zendownfac);
		}
	}

	/**
	 * Get method for struct member 'blendfac'.
	 * @see #__DNA__FIELD__blendfac
	 */
	
	public float getBlendfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 316);
		} else {
			return __io__block.readFloat(__io__address + 308);
		}
	}

	/**
	 * Set method for struct member 'blendfac'.
	 * @see #__DNA__FIELD__blendfac
	 */
	
	public void setBlendfac(float blendfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 316, blendfac);
		} else {
			__io__block.writeFloat(__io__address + 308, blendfac);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MTex> __io__addressof() {
		return new CPointer<MTex>(__io__address, new Class[]{MTex.class}, __io__block, __io__blockTable);
	}

}
