package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Curve'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=392, size64=504)
public class Curve extends CFacade {

	/**
	 * This is the sdna index of the struct Curve.
	 * <p>
	 * It is required when allocating a new block to store data for Curve.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 47;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__id);
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
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__adt);
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
	 * Field descriptor (offset) for struct member 'bb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__bb);
	 * CPointer&lt;CPointer&lt;BoundBox&gt;&gt; p_bb = p.cast(new Class[]{CPointer.class, BoundBox.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb'</li>
	 * <li>Signature: 'BoundBox*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'nurb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__nurb);
	 * CPointer&lt;ListBase&gt; p_nurb = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nurb'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nurb = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'disp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__disp);
	 * CPointer&lt;ListBase&gt; p_disp = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'disp'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__disp = new long[]{116, 152};

	/**
	 * Field descriptor (offset) for struct member 'editnurb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__editnurb);
	 * CPointer&lt;CPointer&lt;EditNurb&gt;&gt; p_editnurb = p.cast(new Class[]{CPointer.class, EditNurb.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'editnurb'</li>
	 * <li>Signature: 'EditNurb*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__editnurb = new long[]{124, 168};

	/**
	 * Field descriptor (offset) for struct member 'bevobj'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__bevobj);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_bevobj = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bevobj'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bevobj = new long[]{128, 176};

	/**
	 * Field descriptor (offset) for struct member 'taperobj'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__taperobj);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_taperobj = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'taperobj'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__taperobj = new long[]{132, 184};

	/**
	 * Field descriptor (offset) for struct member 'textoncurve'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__textoncurve);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_textoncurve = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'textoncurve'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__textoncurve = new long[]{136, 192};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{140, 200};

	/**
	 * Field descriptor (offset) for struct member 'key'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__key);
	 * CPointer&lt;CPointer&lt;Key&gt;&gt; p_key = p.cast(new Class[]{CPointer.class, Key.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'key'</li>
	 * <li>Signature: 'Key*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__key = new long[]{144, 208};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__mat);
	 * CPointer&lt;CPointer&lt;CPointer&lt;Material&gt;&gt;&gt; p_mat = p.cast(new Class[]{CPointer.class, CPointer.class, Material.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'Material**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{148, 216};

	/**
	 * Field descriptor (offset) for struct member 'loc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__loc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_loc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loc = new long[]{152, 224};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__size);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_size = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{164, 236};

	/**
	 * Field descriptor (offset) for struct member 'rot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__rot);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_rot = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rot'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rot = new long[]{176, 248};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{188, 260};

	/**
	 * Field descriptor (offset) for struct member 'texflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__texflag);
	 * CPointer&lt;Short&gt; p_texflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texflag = new long[]{190, 262};

	/**
	 * Field descriptor (offset) for struct member 'drawflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__drawflag);
	 * CPointer&lt;Short&gt; p_drawflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawflag = new long[]{192, 264};

	/**
	 * Field descriptor (offset) for struct member 'twist_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The type of tilt calculation for 3D Curves
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__twist_mode);
	 * CPointer&lt;Short&gt; p_twist_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'twist_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__twist_mode = new long[]{194, 266};

	/**
	 * Field descriptor (offset) for struct member 'twist_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Smoothing iteration for tangents
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__twist_smooth);
	 * CPointer&lt;Float&gt; p_twist_smooth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'twist_smooth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__twist_smooth = new long[]{196, 268};

	/**
	 * Field descriptor (offset) for struct member 'smallcaps_scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__smallcaps_scale);
	 * CPointer&lt;Float&gt; p_smallcaps_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smallcaps_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smallcaps_scale = new long[]{200, 272};

	/**
	 * Field descriptor (offset) for struct member 'pathlen'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__pathlen);
	 * CPointer&lt;Integer&gt; p_pathlen = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pathlen'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pathlen = new long[]{204, 276};

	/**
	 * Field descriptor (offset) for struct member 'bevresol'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__bevresol);
	 * CPointer&lt;Short&gt; p_bevresol = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bevresol'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bevresol = new long[]{208, 280};

	/**
	 * Field descriptor (offset) for struct member 'totcol'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__totcol);
	 * CPointer&lt;Short&gt; p_totcol = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totcol'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totcol = new long[]{210, 282};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{212, 284};

	/**
	 * Field descriptor (offset) for struct member 'width'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__width);
	 * CPointer&lt;Float&gt; p_width = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'width'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__width = new long[]{216, 288};

	/**
	 * Field descriptor (offset) for struct member 'ext1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__ext1);
	 * CPointer&lt;Float&gt; p_ext1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ext1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ext1 = new long[]{220, 292};

	/**
	 * Field descriptor (offset) for struct member 'ext2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__ext2);
	 * CPointer&lt;Float&gt; p_ext2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ext2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ext2 = new long[]{224, 296};

	/**
	 * Field descriptor (offset) for struct member 'resolu'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__resolu);
	 * CPointer&lt;Short&gt; p_resolu = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'resolu'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__resolu = new long[]{228, 300};

	/**
	 * Field descriptor (offset) for struct member 'resolv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__resolv);
	 * CPointer&lt;Short&gt; p_resolv = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'resolv'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__resolv = new long[]{230, 302};

	/**
	 * Field descriptor (offset) for struct member 'resolu_ren'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__resolu_ren);
	 * CPointer&lt;Short&gt; p_resolu_ren = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'resolu_ren'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__resolu_ren = new long[]{232, 304};

	/**
	 * Field descriptor (offset) for struct member 'resolv_ren'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__resolv_ren);
	 * CPointer&lt;Short&gt; p_resolv_ren = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'resolv_ren'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__resolv_ren = new long[]{234, 306};

	/**
	 * Field descriptor (offset) for struct member 'actnu'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__actnu);
	 * CPointer&lt;Integer&gt; p_actnu = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actnu'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actnu = new long[]{236, 308};

	/**
	 * Field descriptor (offset) for struct member 'lastsel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__lastsel);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_lastsel = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastsel'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastsel = new long[]{240, 312};

	/**
	 * Field descriptor (offset) for struct member 'len'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__len);
	 * CPointer&lt;Short&gt; p_len = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'len'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__len = new long[]{244, 320};

	/**
	 * Field descriptor (offset) for struct member 'lines'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__lines);
	 * CPointer&lt;Short&gt; p_lines = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lines'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lines = new long[]{246, 322};

	/**
	 * Field descriptor (offset) for struct member 'pos'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__pos);
	 * CPointer&lt;Short&gt; p_pos = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pos'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pos = new long[]{248, 324};

	/**
	 * Field descriptor (offset) for struct member 'spacemode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__spacemode);
	 * CPointer&lt;Short&gt; p_spacemode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacemode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacemode = new long[]{250, 326};

	/**
	 * Field descriptor (offset) for struct member 'spacing'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__spacing);
	 * CPointer&lt;Float&gt; p_spacing = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacing'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacing = new long[]{252, 328};

	/**
	 * Field descriptor (offset) for struct member 'linedist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__linedist);
	 * CPointer&lt;Float&gt; p_linedist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'linedist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__linedist = new long[]{256, 332};

	/**
	 * Field descriptor (offset) for struct member 'shear'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__shear);
	 * CPointer&lt;Float&gt; p_shear = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shear'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shear = new long[]{260, 336};

	/**
	 * Field descriptor (offset) for struct member 'fsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__fsize);
	 * CPointer&lt;Float&gt; p_fsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fsize = new long[]{264, 340};

	/**
	 * Field descriptor (offset) for struct member 'wordspace'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__wordspace);
	 * CPointer&lt;Float&gt; p_wordspace = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wordspace'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wordspace = new long[]{268, 344};

	/**
	 * Field descriptor (offset) for struct member 'ulpos'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__ulpos);
	 * CPointer&lt;Float&gt; p_ulpos = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ulpos'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ulpos = new long[]{272, 348};

	/**
	 * Field descriptor (offset) for struct member 'ulheight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__ulheight);
	 * CPointer&lt;Float&gt; p_ulheight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ulheight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ulheight = new long[]{276, 352};

	/**
	 * Field descriptor (offset) for struct member 'xof'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__xof);
	 * CPointer&lt;Float&gt; p_xof = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xof'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xof = new long[]{280, 356};

	/**
	 * Field descriptor (offset) for struct member 'yof'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__yof);
	 * CPointer&lt;Float&gt; p_yof = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yof'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yof = new long[]{284, 360};

	/**
	 * Field descriptor (offset) for struct member 'linewidth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__linewidth);
	 * CPointer&lt;Float&gt; p_linewidth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'linewidth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__linewidth = new long[]{288, 364};

	/**
	 * Field descriptor (offset) for struct member 'str'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__str);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_str = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'str'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__str = new long[]{292, 368};

	/**
	 * Field descriptor (offset) for struct member 'selboxes'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__selboxes);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_selboxes = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'selboxes'</li>
	 * <li>Signature: 'SelBox*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__selboxes = new long[]{296, 376};

	/**
	 * Field descriptor (offset) for struct member 'editfont'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__editfont);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_editfont = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'editfont'</li>
	 * <li>Signature: 'EditFont*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__editfont = new long[]{300, 384};

	/**
	 * Field descriptor (offset) for struct member 'family'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__family);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_family = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'family'</li>
	 * <li>Signature: 'char[24]'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__family = new long[]{304, 392};

	/**
	 * Field descriptor (offset) for struct member 'vfont'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__vfont);
	 * CPointer&lt;CPointer&lt;VFont&gt;&gt; p_vfont = p.cast(new Class[]{CPointer.class, VFont.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vfont'</li>
	 * <li>Signature: 'VFont*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vfont = new long[]{328, 416};

	/**
	 * Field descriptor (offset) for struct member 'vfontb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__vfontb);
	 * CPointer&lt;CPointer&lt;VFont&gt;&gt; p_vfontb = p.cast(new Class[]{CPointer.class, VFont.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vfontb'</li>
	 * <li>Signature: 'VFont*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vfontb = new long[]{332, 424};

	/**
	 * Field descriptor (offset) for struct member 'vfonti'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__vfonti);
	 * CPointer&lt;CPointer&lt;VFont&gt;&gt; p_vfonti = p.cast(new Class[]{CPointer.class, VFont.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vfonti'</li>
	 * <li>Signature: 'VFont*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vfonti = new long[]{336, 432};

	/**
	 * Field descriptor (offset) for struct member 'vfontbi'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__vfontbi);
	 * CPointer&lt;CPointer&lt;VFont&gt;&gt; p_vfontbi = p.cast(new Class[]{CPointer.class, VFont.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vfontbi'</li>
	 * <li>Signature: 'VFont*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vfontbi = new long[]{340, 440};

	/**
	 * Field descriptor (offset) for struct member 'sepchar'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__sepchar);
	 * CPointer&lt;Integer&gt; p_sepchar = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sepchar'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sepchar = new long[]{344, 448};

	/**
	 * Field descriptor (offset) for struct member 'ctime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__ctime);
	 * CPointer&lt;Float&gt; p_ctime = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ctime'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ctime = new long[]{348, 452};

	/**
	 * Field descriptor (offset) for struct member 'totbox'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__totbox);
	 * CPointer&lt;Integer&gt; p_totbox = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totbox'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totbox = new long[]{352, 456};

	/**
	 * Field descriptor (offset) for struct member 'actbox'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__actbox);
	 * CPointer&lt;Integer&gt; p_actbox = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actbox'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actbox = new long[]{356, 460};

	/**
	 * Field descriptor (offset) for struct member 'tb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__tb);
	 * CPointer&lt;CPointer&lt;TextBox&gt;&gt; p_tb = p.cast(new Class[]{CPointer.class, TextBox.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tb'</li>
	 * <li>Signature: 'TextBox*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tb = new long[]{360, 464};

	/**
	 * Field descriptor (offset) for struct member 'selstart'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__selstart);
	 * CPointer&lt;Integer&gt; p_selstart = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'selstart'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__selstart = new long[]{364, 472};

	/**
	 * Field descriptor (offset) for struct member 'selend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__selend);
	 * CPointer&lt;Integer&gt; p_selend = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'selend'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__selend = new long[]{368, 476};

	/**
	 * Field descriptor (offset) for struct member 'strinfo'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__strinfo);
	 * CPointer&lt;CPointer&lt;CharInfo&gt;&gt; p_strinfo = p.cast(new Class[]{CPointer.class, CharInfo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strinfo'</li>
	 * <li>Signature: 'CharInfo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strinfo = new long[]{372, 480};

	/**
	 * Field descriptor (offset) for struct member 'curinfo'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__curinfo);
	 * CPointer&lt;CharInfo&gt; p_curinfo = p.cast(new Class[]{CharInfo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curinfo'</li>
	 * <li>Signature: 'CharInfo'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curinfo = new long[]{376, 488};

	/**
	 * Field descriptor (offset) for struct member 'bevfac1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__bevfac1);
	 * CPointer&lt;Float&gt; p_bevfac1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bevfac1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bevfac1 = new long[]{384, 496};

	/**
	 * Field descriptor (offset) for struct member 'bevfac2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curve curve = ...;
	 * CPointer&lt;Object&gt; p = curve.__dna__addressof(Curve.__DNA__FIELD__bevfac2);
	 * CPointer&lt;Float&gt; p_bevfac2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bevfac2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bevfac2 = new long[]{388, 500};

	public Curve(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Curve(Curve that) {
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
	 * Get method for struct member 'bb'.
	 * @see #__DNA__FIELD__bb
	 */
	
	public CPointer<BoundBox> getBb() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BoundBox.class};
		return new CPointer<BoundBox>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BoundBox.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bb'.
	 * @see #__DNA__FIELD__bb
	 */
	
	public void setBb(CPointer<BoundBox> bb) throws IOException
	{
		long __address = ((bb == null) ? 0 : bb.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'nurb'.
	 * @see #__DNA__FIELD__nurb
	 */
	
	public ListBase getNurb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 136, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 108, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nurb'.
	 * @see #__DNA__FIELD__nurb
	 */
	
	public void setNurb(ListBase nurb) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 136;
		} else {
			__dna__offset = 108;
		}
		if (__io__equals(nurb, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nurb)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nurb);
		} else {
			__io__generic__copy( getNurb(), nurb);
		}
	}

	/**
	 * Get method for struct member 'disp'.
	 * @see #__DNA__FIELD__disp
	 */
	
	public ListBase getDisp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 152, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 116, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'disp'.
	 * @see #__DNA__FIELD__disp
	 */
	
	public void setDisp(ListBase disp) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 116;
		}
		if (__io__equals(disp, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, disp)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, disp);
		} else {
			__io__generic__copy( getDisp(), disp);
		}
	}

	/**
	 * Get method for struct member 'editnurb'.
	 * @see #__DNA__FIELD__editnurb
	 */
	
	public CPointer<EditNurb> getEditnurb() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 124);
		}
		Class<?>[] __dna__targetTypes = new Class[]{EditNurb.class};
		return new CPointer<EditNurb>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, EditNurb.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'editnurb'.
	 * @see #__DNA__FIELD__editnurb
	 */
	
	public void setEditnurb(CPointer<EditNurb> editnurb) throws IOException
	{
		long __address = ((editnurb == null) ? 0 : editnurb.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 168, __address);
		} else {
			__io__block.writeLong(__io__address + 124, __address);
		}
	}

	/**
	 * Get method for struct member 'bevobj'.
	 * @see #__DNA__FIELD__bevobj
	 */
	
	public CPointer<BlenderObject> getBevobj() throws IOException
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
	 * Set method for struct member 'bevobj'.
	 * @see #__DNA__FIELD__bevobj
	 */
	
	public void setBevobj(CPointer<BlenderObject> bevobj) throws IOException
	{
		long __address = ((bevobj == null) ? 0 : bevobj.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 128, __address);
		}
	}

	/**
	 * Get method for struct member 'taperobj'.
	 * @see #__DNA__FIELD__taperobj
	 */
	
	public CPointer<BlenderObject> getTaperobj() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 132);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'taperobj'.
	 * @see #__DNA__FIELD__taperobj
	 */
	
	public void setTaperobj(CPointer<BlenderObject> taperobj) throws IOException
	{
		long __address = ((taperobj == null) ? 0 : taperobj.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 132, __address);
		}
	}

	/**
	 * Get method for struct member 'textoncurve'.
	 * @see #__DNA__FIELD__textoncurve
	 */
	
	public CPointer<BlenderObject> getTextoncurve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'textoncurve'.
	 * @see #__DNA__FIELD__textoncurve
	 */
	
	public void setTextoncurve(CPointer<BlenderObject> textoncurve) throws IOException
	{
		long __address = ((textoncurve == null) ? 0 : textoncurve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Get method for struct member 'key'.
	 * @see #__DNA__FIELD__key
	 */
	
	public CPointer<Key> getKey() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Key.class};
		return new CPointer<Key>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Key.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'key'.
	 * @see #__DNA__FIELD__key
	 */
	
	public void setKey(CPointer<Key> key) throws IOException
	{
		long __address = ((key == null) ? 0 : key.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 144, __address);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * @see #__DNA__FIELD__mat
	 */
	
	public CPointer<CPointer<Material>> getMat() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Material.class};
		return new CPointer<CPointer<Material>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mat'.
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CPointer<CPointer<Material>> mat) throws IOException
	{
		long __address = ((mat == null) ? 0 : mat.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 148, __address);
		}
	}

	/**
	 * Get method for struct member 'loc'.
	 * @see #__DNA__FIELD__loc
	 */
	
	public CArrayFacade<Float> getLoc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 224, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'loc'.
	 * @see #__DNA__FIELD__loc
	 */
	
	public void setLoc(CArrayFacade<Float> loc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 224;
		} else {
			__dna__offset = 152;
		}
		if (__io__equals(loc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, loc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, loc);
		} else {
			__io__generic__copy( getLoc(), loc);
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
			return new CArrayFacade<Float>(__io__address + 236, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 164, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 236;
		} else {
			__dna__offset = 164;
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
	
	public CArrayFacade<Float> getRot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'rot'.
	 * @see #__DNA__FIELD__rot
	 */
	
	public void setRot(CArrayFacade<Float> rot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 176;
		}
		if (__io__equals(rot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, rot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, rot);
		} else {
			__io__generic__copy( getRot(), rot);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 260);
		} else {
			return __io__block.readShort(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 260, type);
		} else {
			__io__block.writeShort(__io__address + 188, type);
		}
	}

	/**
	 * Get method for struct member 'texflag'.
	 * @see #__DNA__FIELD__texflag
	 */
	
	public short getTexflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 262);
		} else {
			return __io__block.readShort(__io__address + 190);
		}
	}

	/**
	 * Set method for struct member 'texflag'.
	 * @see #__DNA__FIELD__texflag
	 */
	
	public void setTexflag(short texflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 262, texflag);
		} else {
			__io__block.writeShort(__io__address + 190, texflag);
		}
	}

	/**
	 * Get method for struct member 'drawflag'.
	 * @see #__DNA__FIELD__drawflag
	 */
	
	public short getDrawflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 264);
		} else {
			return __io__block.readShort(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'drawflag'.
	 * @see #__DNA__FIELD__drawflag
	 */
	
	public void setDrawflag(short drawflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 264, drawflag);
		} else {
			__io__block.writeShort(__io__address + 192, drawflag);
		}
	}

	/**
	 * Get method for struct member 'twist_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The type of tilt calculation for 3D Curves
	 * @see #__DNA__FIELD__twist_mode
	 */
	
	public short getTwist_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 266);
		} else {
			return __io__block.readShort(__io__address + 194);
		}
	}

	/**
	 * Set method for struct member 'twist_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The type of tilt calculation for 3D Curves
	 * @see #__DNA__FIELD__twist_mode
	 */
	
	public void setTwist_mode(short twist_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 266, twist_mode);
		} else {
			__io__block.writeShort(__io__address + 194, twist_mode);
		}
	}

	/**
	 * Get method for struct member 'twist_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Smoothing iteration for tangents
	 * @see #__DNA__FIELD__twist_smooth
	 */
	
	public float getTwist_smooth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 268);
		} else {
			return __io__block.readFloat(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'twist_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Smoothing iteration for tangents
	 * @see #__DNA__FIELD__twist_smooth
	 */
	
	public void setTwist_smooth(float twist_smooth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 268, twist_smooth);
		} else {
			__io__block.writeFloat(__io__address + 196, twist_smooth);
		}
	}

	/**
	 * Get method for struct member 'smallcaps_scale'.
	 * @see #__DNA__FIELD__smallcaps_scale
	 */
	
	public float getSmallcaps_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 272);
		} else {
			return __io__block.readFloat(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'smallcaps_scale'.
	 * @see #__DNA__FIELD__smallcaps_scale
	 */
	
	public void setSmallcaps_scale(float smallcaps_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 272, smallcaps_scale);
		} else {
			__io__block.writeFloat(__io__address + 200, smallcaps_scale);
		}
	}

	/**
	 * Get method for struct member 'pathlen'.
	 * @see #__DNA__FIELD__pathlen
	 */
	
	public int getPathlen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 276);
		} else {
			return __io__block.readInt(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'pathlen'.
	 * @see #__DNA__FIELD__pathlen
	 */
	
	public void setPathlen(int pathlen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 276, pathlen);
		} else {
			__io__block.writeInt(__io__address + 204, pathlen);
		}
	}

	/**
	 * Get method for struct member 'bevresol'.
	 * @see #__DNA__FIELD__bevresol
	 */
	
	public short getBevresol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 280);
		} else {
			return __io__block.readShort(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'bevresol'.
	 * @see #__DNA__FIELD__bevresol
	 */
	
	public void setBevresol(short bevresol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 280, bevresol);
		} else {
			__io__block.writeShort(__io__address + 208, bevresol);
		}
	}

	/**
	 * Get method for struct member 'totcol'.
	 * @see #__DNA__FIELD__totcol
	 */
	
	public short getTotcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 282);
		} else {
			return __io__block.readShort(__io__address + 210);
		}
	}

	/**
	 * Set method for struct member 'totcol'.
	 * @see #__DNA__FIELD__totcol
	 */
	
	public void setTotcol(short totcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 282, totcol);
		} else {
			__io__block.writeShort(__io__address + 210, totcol);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 284);
		} else {
			return __io__block.readInt(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 284, flag);
		} else {
			__io__block.writeInt(__io__address + 212, flag);
		}
	}

	/**
	 * Get method for struct member 'width'.
	 * @see #__DNA__FIELD__width
	 */
	
	public float getWidth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 288);
		} else {
			return __io__block.readFloat(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'width'.
	 * @see #__DNA__FIELD__width
	 */
	
	public void setWidth(float width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 288, width);
		} else {
			__io__block.writeFloat(__io__address + 216, width);
		}
	}

	/**
	 * Get method for struct member 'ext1'.
	 * @see #__DNA__FIELD__ext1
	 */
	
	public float getExt1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 292);
		} else {
			return __io__block.readFloat(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'ext1'.
	 * @see #__DNA__FIELD__ext1
	 */
	
	public void setExt1(float ext1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 292, ext1);
		} else {
			__io__block.writeFloat(__io__address + 220, ext1);
		}
	}

	/**
	 * Get method for struct member 'ext2'.
	 * @see #__DNA__FIELD__ext2
	 */
	
	public float getExt2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 296);
		} else {
			return __io__block.readFloat(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'ext2'.
	 * @see #__DNA__FIELD__ext2
	 */
	
	public void setExt2(float ext2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 296, ext2);
		} else {
			__io__block.writeFloat(__io__address + 224, ext2);
		}
	}

	/**
	 * Get method for struct member 'resolu'.
	 * @see #__DNA__FIELD__resolu
	 */
	
	public short getResolu() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 300);
		} else {
			return __io__block.readShort(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'resolu'.
	 * @see #__DNA__FIELD__resolu
	 */
	
	public void setResolu(short resolu) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 300, resolu);
		} else {
			__io__block.writeShort(__io__address + 228, resolu);
		}
	}

	/**
	 * Get method for struct member 'resolv'.
	 * @see #__DNA__FIELD__resolv
	 */
	
	public short getResolv() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 302);
		} else {
			return __io__block.readShort(__io__address + 230);
		}
	}

	/**
	 * Set method for struct member 'resolv'.
	 * @see #__DNA__FIELD__resolv
	 */
	
	public void setResolv(short resolv) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 302, resolv);
		} else {
			__io__block.writeShort(__io__address + 230, resolv);
		}
	}

	/**
	 * Get method for struct member 'resolu_ren'.
	 * @see #__DNA__FIELD__resolu_ren
	 */
	
	public short getResolu_ren() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 304);
		} else {
			return __io__block.readShort(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'resolu_ren'.
	 * @see #__DNA__FIELD__resolu_ren
	 */
	
	public void setResolu_ren(short resolu_ren) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 304, resolu_ren);
		} else {
			__io__block.writeShort(__io__address + 232, resolu_ren);
		}
	}

	/**
	 * Get method for struct member 'resolv_ren'.
	 * @see #__DNA__FIELD__resolv_ren
	 */
	
	public short getResolv_ren() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 306);
		} else {
			return __io__block.readShort(__io__address + 234);
		}
	}

	/**
	 * Set method for struct member 'resolv_ren'.
	 * @see #__DNA__FIELD__resolv_ren
	 */
	
	public void setResolv_ren(short resolv_ren) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 306, resolv_ren);
		} else {
			__io__block.writeShort(__io__address + 234, resolv_ren);
		}
	}

	/**
	 * Get method for struct member 'actnu'.
	 * @see #__DNA__FIELD__actnu
	 */
	
	public int getActnu() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 308);
		} else {
			return __io__block.readInt(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'actnu'.
	 * @see #__DNA__FIELD__actnu
	 */
	
	public void setActnu(int actnu) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 308, actnu);
		} else {
			__io__block.writeInt(__io__address + 236, actnu);
		}
	}

	/**
	 * Get method for struct member 'lastsel'.
	 * @see #__DNA__FIELD__lastsel
	 */
	
	public CPointer<Object> getLastsel() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 312);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'lastsel'.
	 * @see #__DNA__FIELD__lastsel
	 */
	
	public void setLastsel(CPointer<Object> lastsel) throws IOException
	{
		long __address = ((lastsel == null) ? 0 : lastsel.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 312, __address);
		} else {
			__io__block.writeLong(__io__address + 240, __address);
		}
	}

	/**
	 * Get method for struct member 'len'.
	 * @see #__DNA__FIELD__len
	 */
	
	public short getLen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 320);
		} else {
			return __io__block.readShort(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'len'.
	 * @see #__DNA__FIELD__len
	 */
	
	public void setLen(short len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 320, len);
		} else {
			__io__block.writeShort(__io__address + 244, len);
		}
	}

	/**
	 * Get method for struct member 'lines'.
	 * @see #__DNA__FIELD__lines
	 */
	
	public short getLines() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 322);
		} else {
			return __io__block.readShort(__io__address + 246);
		}
	}

	/**
	 * Set method for struct member 'lines'.
	 * @see #__DNA__FIELD__lines
	 */
	
	public void setLines(short lines) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 322, lines);
		} else {
			__io__block.writeShort(__io__address + 246, lines);
		}
	}

	/**
	 * Get method for struct member 'pos'.
	 * @see #__DNA__FIELD__pos
	 */
	
	public short getPos() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 324);
		} else {
			return __io__block.readShort(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'pos'.
	 * @see #__DNA__FIELD__pos
	 */
	
	public void setPos(short pos) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 324, pos);
		} else {
			__io__block.writeShort(__io__address + 248, pos);
		}
	}

	/**
	 * Get method for struct member 'spacemode'.
	 * @see #__DNA__FIELD__spacemode
	 */
	
	public short getSpacemode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 326);
		} else {
			return __io__block.readShort(__io__address + 250);
		}
	}

	/**
	 * Set method for struct member 'spacemode'.
	 * @see #__DNA__FIELD__spacemode
	 */
	
	public void setSpacemode(short spacemode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 326, spacemode);
		} else {
			__io__block.writeShort(__io__address + 250, spacemode);
		}
	}

	/**
	 * Get method for struct member 'spacing'.
	 * @see #__DNA__FIELD__spacing
	 */
	
	public float getSpacing() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 328);
		} else {
			return __io__block.readFloat(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'spacing'.
	 * @see #__DNA__FIELD__spacing
	 */
	
	public void setSpacing(float spacing) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 328, spacing);
		} else {
			__io__block.writeFloat(__io__address + 252, spacing);
		}
	}

	/**
	 * Get method for struct member 'linedist'.
	 * @see #__DNA__FIELD__linedist
	 */
	
	public float getLinedist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 332);
		} else {
			return __io__block.readFloat(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'linedist'.
	 * @see #__DNA__FIELD__linedist
	 */
	
	public void setLinedist(float linedist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 332, linedist);
		} else {
			__io__block.writeFloat(__io__address + 256, linedist);
		}
	}

	/**
	 * Get method for struct member 'shear'.
	 * @see #__DNA__FIELD__shear
	 */
	
	public float getShear() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 336);
		} else {
			return __io__block.readFloat(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'shear'.
	 * @see #__DNA__FIELD__shear
	 */
	
	public void setShear(float shear) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 336, shear);
		} else {
			__io__block.writeFloat(__io__address + 260, shear);
		}
	}

	/**
	 * Get method for struct member 'fsize'.
	 * @see #__DNA__FIELD__fsize
	 */
	
	public float getFsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 340);
		} else {
			return __io__block.readFloat(__io__address + 264);
		}
	}

	/**
	 * Set method for struct member 'fsize'.
	 * @see #__DNA__FIELD__fsize
	 */
	
	public void setFsize(float fsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 340, fsize);
		} else {
			__io__block.writeFloat(__io__address + 264, fsize);
		}
	}

	/**
	 * Get method for struct member 'wordspace'.
	 * @see #__DNA__FIELD__wordspace
	 */
	
	public float getWordspace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 344);
		} else {
			return __io__block.readFloat(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'wordspace'.
	 * @see #__DNA__FIELD__wordspace
	 */
	
	public void setWordspace(float wordspace) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 344, wordspace);
		} else {
			__io__block.writeFloat(__io__address + 268, wordspace);
		}
	}

	/**
	 * Get method for struct member 'ulpos'.
	 * @see #__DNA__FIELD__ulpos
	 */
	
	public float getUlpos() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 348);
		} else {
			return __io__block.readFloat(__io__address + 272);
		}
	}

	/**
	 * Set method for struct member 'ulpos'.
	 * @see #__DNA__FIELD__ulpos
	 */
	
	public void setUlpos(float ulpos) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 348, ulpos);
		} else {
			__io__block.writeFloat(__io__address + 272, ulpos);
		}
	}

	/**
	 * Get method for struct member 'ulheight'.
	 * @see #__DNA__FIELD__ulheight
	 */
	
	public float getUlheight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 352);
		} else {
			return __io__block.readFloat(__io__address + 276);
		}
	}

	/**
	 * Set method for struct member 'ulheight'.
	 * @see #__DNA__FIELD__ulheight
	 */
	
	public void setUlheight(float ulheight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 352, ulheight);
		} else {
			__io__block.writeFloat(__io__address + 276, ulheight);
		}
	}

	/**
	 * Get method for struct member 'xof'.
	 * @see #__DNA__FIELD__xof
	 */
	
	public float getXof() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 356);
		} else {
			return __io__block.readFloat(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'xof'.
	 * @see #__DNA__FIELD__xof
	 */
	
	public void setXof(float xof) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 356, xof);
		} else {
			__io__block.writeFloat(__io__address + 280, xof);
		}
	}

	/**
	 * Get method for struct member 'yof'.
	 * @see #__DNA__FIELD__yof
	 */
	
	public float getYof() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 360);
		} else {
			return __io__block.readFloat(__io__address + 284);
		}
	}

	/**
	 * Set method for struct member 'yof'.
	 * @see #__DNA__FIELD__yof
	 */
	
	public void setYof(float yof) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 360, yof);
		} else {
			__io__block.writeFloat(__io__address + 284, yof);
		}
	}

	/**
	 * Get method for struct member 'linewidth'.
	 * @see #__DNA__FIELD__linewidth
	 */
	
	public float getLinewidth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 364);
		} else {
			return __io__block.readFloat(__io__address + 288);
		}
	}

	/**
	 * Set method for struct member 'linewidth'.
	 * @see #__DNA__FIELD__linewidth
	 */
	
	public void setLinewidth(float linewidth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 364, linewidth);
		} else {
			__io__block.writeFloat(__io__address + 288, linewidth);
		}
	}

	/**
	 * Get method for struct member 'str'.
	 * @see #__DNA__FIELD__str
	 */
	
	public CPointer<Byte> getStr() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 368);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 292);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'str'.
	 * @see #__DNA__FIELD__str
	 */
	
	public void setStr(CPointer<Byte> str) throws IOException
	{
		long __address = ((str == null) ? 0 : str.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 368, __address);
		} else {
			__io__block.writeLong(__io__address + 292, __address);
		}
	}

	/**
	 * Get method for struct member 'selboxes'.
	 * @see #__DNA__FIELD__selboxes
	 */
	
	public CPointer<Object> getSelboxes() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 376);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 296);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'selboxes'.
	 * @see #__DNA__FIELD__selboxes
	 */
	
	public void setSelboxes(CPointer<Object> selboxes) throws IOException
	{
		long __address = ((selboxes == null) ? 0 : selboxes.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 376, __address);
		} else {
			__io__block.writeLong(__io__address + 296, __address);
		}
	}

	/**
	 * Get method for struct member 'editfont'.
	 * @see #__DNA__FIELD__editfont
	 */
	
	public CPointer<Object> getEditfont() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 384);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 300);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'editfont'.
	 * @see #__DNA__FIELD__editfont
	 */
	
	public void setEditfont(CPointer<Object> editfont) throws IOException
	{
		long __address = ((editfont == null) ? 0 : editfont.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 384, __address);
		} else {
			__io__block.writeLong(__io__address + 300, __address);
		}
	}

	/**
	 * Get method for struct member 'family'.
	 * @see #__DNA__FIELD__family
	 */
	
	public CArrayFacade<Byte> getFamily() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			24
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 392, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 304, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'family'.
	 * @see #__DNA__FIELD__family
	 */
	
	public void setFamily(CArrayFacade<Byte> family) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 392;
		} else {
			__dna__offset = 304;
		}
		if (__io__equals(family, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, family)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, family);
		} else {
			__io__generic__copy( getFamily(), family);
		}
	}

	/**
	 * Get method for struct member 'vfont'.
	 * @see #__DNA__FIELD__vfont
	 */
	
	public CPointer<VFont> getVfont() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 416);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 328);
		}
		Class<?>[] __dna__targetTypes = new Class[]{VFont.class};
		return new CPointer<VFont>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, VFont.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'vfont'.
	 * @see #__DNA__FIELD__vfont
	 */
	
	public void setVfont(CPointer<VFont> vfont) throws IOException
	{
		long __address = ((vfont == null) ? 0 : vfont.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 416, __address);
		} else {
			__io__block.writeLong(__io__address + 328, __address);
		}
	}

	/**
	 * Get method for struct member 'vfontb'.
	 * @see #__DNA__FIELD__vfontb
	 */
	
	public CPointer<VFont> getVfontb() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 424);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 332);
		}
		Class<?>[] __dna__targetTypes = new Class[]{VFont.class};
		return new CPointer<VFont>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, VFont.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'vfontb'.
	 * @see #__DNA__FIELD__vfontb
	 */
	
	public void setVfontb(CPointer<VFont> vfontb) throws IOException
	{
		long __address = ((vfontb == null) ? 0 : vfontb.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 424, __address);
		} else {
			__io__block.writeLong(__io__address + 332, __address);
		}
	}

	/**
	 * Get method for struct member 'vfonti'.
	 * @see #__DNA__FIELD__vfonti
	 */
	
	public CPointer<VFont> getVfonti() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 432);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 336);
		}
		Class<?>[] __dna__targetTypes = new Class[]{VFont.class};
		return new CPointer<VFont>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, VFont.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'vfonti'.
	 * @see #__DNA__FIELD__vfonti
	 */
	
	public void setVfonti(CPointer<VFont> vfonti) throws IOException
	{
		long __address = ((vfonti == null) ? 0 : vfonti.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 432, __address);
		} else {
			__io__block.writeLong(__io__address + 336, __address);
		}
	}

	/**
	 * Get method for struct member 'vfontbi'.
	 * @see #__DNA__FIELD__vfontbi
	 */
	
	public CPointer<VFont> getVfontbi() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 440);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 340);
		}
		Class<?>[] __dna__targetTypes = new Class[]{VFont.class};
		return new CPointer<VFont>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, VFont.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'vfontbi'.
	 * @see #__DNA__FIELD__vfontbi
	 */
	
	public void setVfontbi(CPointer<VFont> vfontbi) throws IOException
	{
		long __address = ((vfontbi == null) ? 0 : vfontbi.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 440, __address);
		} else {
			__io__block.writeLong(__io__address + 340, __address);
		}
	}

	/**
	 * Get method for struct member 'sepchar'.
	 * @see #__DNA__FIELD__sepchar
	 */
	
	public int getSepchar() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 448);
		} else {
			return __io__block.readInt(__io__address + 344);
		}
	}

	/**
	 * Set method for struct member 'sepchar'.
	 * @see #__DNA__FIELD__sepchar
	 */
	
	public void setSepchar(int sepchar) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 448, sepchar);
		} else {
			__io__block.writeInt(__io__address + 344, sepchar);
		}
	}

	/**
	 * Get method for struct member 'ctime'.
	 * @see #__DNA__FIELD__ctime
	 */
	
	public float getCtime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 452);
		} else {
			return __io__block.readFloat(__io__address + 348);
		}
	}

	/**
	 * Set method for struct member 'ctime'.
	 * @see #__DNA__FIELD__ctime
	 */
	
	public void setCtime(float ctime) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 452, ctime);
		} else {
			__io__block.writeFloat(__io__address + 348, ctime);
		}
	}

	/**
	 * Get method for struct member 'totbox'.
	 * @see #__DNA__FIELD__totbox
	 */
	
	public int getTotbox() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 456);
		} else {
			return __io__block.readInt(__io__address + 352);
		}
	}

	/**
	 * Set method for struct member 'totbox'.
	 * @see #__DNA__FIELD__totbox
	 */
	
	public void setTotbox(int totbox) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 456, totbox);
		} else {
			__io__block.writeInt(__io__address + 352, totbox);
		}
	}

	/**
	 * Get method for struct member 'actbox'.
	 * @see #__DNA__FIELD__actbox
	 */
	
	public int getActbox() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 460);
		} else {
			return __io__block.readInt(__io__address + 356);
		}
	}

	/**
	 * Set method for struct member 'actbox'.
	 * @see #__DNA__FIELD__actbox
	 */
	
	public void setActbox(int actbox) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 460, actbox);
		} else {
			__io__block.writeInt(__io__address + 356, actbox);
		}
	}

	/**
	 * Get method for struct member 'tb'.
	 * @see #__DNA__FIELD__tb
	 */
	
	public CPointer<TextBox> getTb() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 464);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 360);
		}
		Class<?>[] __dna__targetTypes = new Class[]{TextBox.class};
		return new CPointer<TextBox>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, TextBox.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tb'.
	 * @see #__DNA__FIELD__tb
	 */
	
	public void setTb(CPointer<TextBox> tb) throws IOException
	{
		long __address = ((tb == null) ? 0 : tb.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 464, __address);
		} else {
			__io__block.writeLong(__io__address + 360, __address);
		}
	}

	/**
	 * Get method for struct member 'selstart'.
	 * @see #__DNA__FIELD__selstart
	 */
	
	public int getSelstart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 472);
		} else {
			return __io__block.readInt(__io__address + 364);
		}
	}

	/**
	 * Set method for struct member 'selstart'.
	 * @see #__DNA__FIELD__selstart
	 */
	
	public void setSelstart(int selstart) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 472, selstart);
		} else {
			__io__block.writeInt(__io__address + 364, selstart);
		}
	}

	/**
	 * Get method for struct member 'selend'.
	 * @see #__DNA__FIELD__selend
	 */
	
	public int getSelend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 476);
		} else {
			return __io__block.readInt(__io__address + 368);
		}
	}

	/**
	 * Set method for struct member 'selend'.
	 * @see #__DNA__FIELD__selend
	 */
	
	public void setSelend(int selend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 476, selend);
		} else {
			__io__block.writeInt(__io__address + 368, selend);
		}
	}

	/**
	 * Get method for struct member 'strinfo'.
	 * @see #__DNA__FIELD__strinfo
	 */
	
	public CPointer<CharInfo> getStrinfo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 480);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 372);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CharInfo.class};
		return new CPointer<CharInfo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CharInfo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'strinfo'.
	 * @see #__DNA__FIELD__strinfo
	 */
	
	public void setStrinfo(CPointer<CharInfo> strinfo) throws IOException
	{
		long __address = ((strinfo == null) ? 0 : strinfo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 480, __address);
		} else {
			__io__block.writeLong(__io__address + 372, __address);
		}
	}

	/**
	 * Get method for struct member 'curinfo'.
	 * @see #__DNA__FIELD__curinfo
	 */
	
	public CharInfo getCurinfo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CharInfo(__io__address + 488, __io__block, __io__blockTable);
		} else {
			return new CharInfo(__io__address + 376, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'curinfo'.
	 * @see #__DNA__FIELD__curinfo
	 */
	
	public void setCurinfo(CharInfo curinfo) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 488;
		} else {
			__dna__offset = 376;
		}
		if (__io__equals(curinfo, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, curinfo)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, curinfo);
		} else {
			__io__generic__copy( getCurinfo(), curinfo);
		}
	}

	/**
	 * Get method for struct member 'bevfac1'.
	 * @see #__DNA__FIELD__bevfac1
	 */
	
	public float getBevfac1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 496);
		} else {
			return __io__block.readFloat(__io__address + 384);
		}
	}

	/**
	 * Set method for struct member 'bevfac1'.
	 * @see #__DNA__FIELD__bevfac1
	 */
	
	public void setBevfac1(float bevfac1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 496, bevfac1);
		} else {
			__io__block.writeFloat(__io__address + 384, bevfac1);
		}
	}

	/**
	 * Get method for struct member 'bevfac2'.
	 * @see #__DNA__FIELD__bevfac2
	 */
	
	public float getBevfac2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 500);
		} else {
			return __io__block.readFloat(__io__address + 388);
		}
	}

	/**
	 * Set method for struct member 'bevfac2'.
	 * @see #__DNA__FIELD__bevfac2
	 */
	
	public void setBevfac2(float bevfac2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 500, bevfac2);
		} else {
			__io__block.writeFloat(__io__address + 388, bevfac2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Curve> __io__addressof() {
		return new CPointer<Curve>(__io__address, new Class[]{Curve.class}, __io__block, __io__blockTable);
	}

}
