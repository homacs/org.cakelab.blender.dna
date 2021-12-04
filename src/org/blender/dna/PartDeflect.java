package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'PartDeflect'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=228, size64=240)
public class PartDeflect extends CFacade {

	/**
	 * This is the sdna index of the struct PartDeflect.
	 * <p>
	 * It is required when allocating a new block to store data for PartDeflect.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 172;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General settings flag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'deflect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deflection flag - does mesh deflect particles. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__deflect);
	 * CPointer&lt;Short&gt; p_deflect = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'deflect'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__deflect = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'forcefield'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Force field type, do the vertices attract / repel particles? </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__forcefield);
	 * CPointer&lt;Short&gt; p_forcefield = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'forcefield'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__forcefield = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Fall-off type. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__falloff);
	 * CPointer&lt;Short&gt; p_falloff = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falloff'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falloff = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Point, plane or surface. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__shape);
	 * CPointer&lt;Short&gt; p_shape = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shape'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shape = new long[]{10, 10};

	/**
	 * Field descriptor (offset) for struct member 'tex_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture effector. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__tex_mode);
	 * CPointer&lt;Short&gt; p_tex_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_mode = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'kink'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For curve guide. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__kink);
	 * CPointer&lt;Short&gt; p_kink = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink = new long[]{14, 14};

	/**
	 * Field descriptor (offset) for struct member 'kink_axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__kink_axis);
	 * CPointer&lt;Short&gt; p_kink_axis = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink_axis'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink_axis = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'zdir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__zdir);
	 * CPointer&lt;Short&gt; p_zdir = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zdir'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zdir = new long[]{18, 18};

	/**
	 * Field descriptor (offset) for struct member 'f_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Main effector values The strength of the force (+ or - ). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__f_strength);
	 * CPointer&lt;Float&gt; p_f_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f_strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f_strength = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'f_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Damping ratio of the harmonic effector. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__f_damp);
	 * CPointer&lt;Float&gt; p_f_damp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f_damp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f_damp = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'f_flow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much force is converted into "air flow", i.e. force used as the velocity of surrounding medium. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__f_flow);
	 * CPointer&lt;Float&gt; p_f_flow = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f_flow'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f_flow = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'f_wind_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much force is reduced when acting parallel to a surface, e.g. cloth. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__f_wind_factor);
	 * CPointer&lt;Float&gt; p_f_wind_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f_wind_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f_wind_factor = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'f_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Noise size for noise effector, restlength for harmonic effector. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__f_size);
	 * CPointer&lt;Float&gt; p_f_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f_size = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'f_power'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> fall-off The power law - real gravitation is 2 (square). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__f_power);
	 * CPointer&lt;Float&gt; p_f_power = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f_power'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f_power = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'maxdist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If indicated, use this maximum. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__maxdist);
	 * CPointer&lt;Float&gt; p_maxdist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxdist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxdist = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'mindist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If indicated, use this minimum. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__mindist);
	 * CPointer&lt;Float&gt; p_mindist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mindist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mindist = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'f_power_r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radial fall-off power. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__f_power_r);
	 * CPointer&lt;Float&gt; p_f_power_r = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f_power_r'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f_power_r = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'maxrad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radial versions of above. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__maxrad);
	 * CPointer&lt;Float&gt; p_maxrad = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxrad'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxrad = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'minrad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__minrad);
	 * CPointer&lt;Float&gt; p_minrad = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minrad'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minrad = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'pdef_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> particle collisions Damping factor for particle deflection. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__pdef_damp);
	 * CPointer&lt;Float&gt; p_pdef_damp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdef_damp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdef_damp = new long[]{68, 68};

	/**
	 * Field descriptor (offset) for struct member 'pdef_rdamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Random element of damping for deflection. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__pdef_rdamp);
	 * CPointer&lt;Float&gt; p_pdef_rdamp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdef_rdamp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdef_rdamp = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'pdef_perm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Chance of particle passing through mesh. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__pdef_perm);
	 * CPointer&lt;Float&gt; p_pdef_perm = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdef_perm'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdef_perm = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'pdef_frict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Friction factor for particle deflection. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__pdef_frict);
	 * CPointer&lt;Float&gt; p_pdef_frict = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdef_frict'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdef_frict = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'pdef_rfrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Random element of friction for deflection. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__pdef_rfrict);
	 * CPointer&lt;Float&gt; p_pdef_rfrict = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdef_rfrict'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdef_rfrict = new long[]{84, 84};

	/**
	 * Field descriptor (offset) for struct member 'pdef_stickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Surface particle stickiness. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__pdef_stickness);
	 * CPointer&lt;Float&gt; p_pdef_stickness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdef_stickness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdef_stickness = new long[]{88, 88};

	/**
	 * Field descriptor (offset) for struct member 'absorption'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for forces. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__absorption);
	 * CPointer&lt;Float&gt; p_absorption = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'absorption'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__absorption = new long[]{92, 92};

	/**
	 * Field descriptor (offset) for struct member 'pdef_sbdamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> softbody collisions Damping factor for softbody deflection. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__pdef_sbdamp);
	 * CPointer&lt;Float&gt; p_pdef_sbdamp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdef_sbdamp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdef_sbdamp = new long[]{96, 96};

	/**
	 * Field descriptor (offset) for struct member 'pdef_sbift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inner face thickness for softbody deflection. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__pdef_sbift);
	 * CPointer&lt;Float&gt; p_pdef_sbift = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdef_sbift'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdef_sbift = new long[]{100, 100};

	/**
	 * Field descriptor (offset) for struct member 'pdef_sboft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Outer face thickness for softbody deflection. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__pdef_sboft);
	 * CPointer&lt;Float&gt; p_pdef_sboft = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdef_sboft'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdef_sboft = new long[]{104, 104};

	/**
	 * Field descriptor (offset) for struct member 'clump_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> guide curve, same as for particle child effects </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__clump_fac);
	 * CPointer&lt;Float&gt; p_clump_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clump_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clump_fac = new long[]{108, 108};

	/**
	 * Field descriptor (offset) for struct member 'clump_pow'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__clump_pow);
	 * CPointer&lt;Float&gt; p_clump_pow = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clump_pow'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clump_pow = new long[]{112, 112};

	/**
	 * Field descriptor (offset) for struct member 'kink_freq'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__kink_freq);
	 * CPointer&lt;Float&gt; p_kink_freq = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink_freq'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink_freq = new long[]{116, 116};

	/**
	 * Field descriptor (offset) for struct member 'kink_shape'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__kink_shape);
	 * CPointer&lt;Float&gt; p_kink_shape = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink_shape'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink_shape = new long[]{120, 120};

	/**
	 * Field descriptor (offset) for struct member 'kink_amp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__kink_amp);
	 * CPointer&lt;Float&gt; p_kink_amp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kink_amp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kink_amp = new long[]{124, 124};

	/**
	 * Field descriptor (offset) for struct member 'free_end'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__free_end);
	 * CPointer&lt;Float&gt; p_free_end = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'free_end'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__free_end = new long[]{128, 128};

	/**
	 * Field descriptor (offset) for struct member 'tex_nabla'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture effector Used for calculating partial derivatives. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__tex_nabla);
	 * CPointer&lt;Float&gt; p_tex_nabla = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_nabla'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_nabla = new long[]{132, 132};

	/**
	 * Field descriptor (offset) for struct member 'tex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture of the texture effector. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__tex);
	 * CPointer&lt;CPointer&lt;Tex&gt;&gt; p_tex = p.cast(new Class[]{CPointer.class, Tex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex'</li>
	 * <li>Signature: 'Tex*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex = new long[]{136, 136};

	/**
	 * Field descriptor (offset) for struct member 'rng'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> effector noise Random noise generator for e.g. wind. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__rng);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_rng = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rng'</li>
	 * <li>Signature: 'RNG*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rng = new long[]{140, 144};

	/**
	 * Field descriptor (offset) for struct member 'f_noise'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Noise of force. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__f_noise);
	 * CPointer&lt;Float&gt; p_f_noise = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f_noise'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f_noise = new long[]{144, 152};

	/**
	 * Field descriptor (offset) for struct member 'seed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Noise random seed. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__seed);
	 * CPointer&lt;Integer&gt; p_seed = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seed'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seed = new long[]{148, 156};

	/**
	 * Field descriptor (offset) for struct member 'drawvec1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display Size Runtime only : start of the curve or draw scale. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__drawvec1);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_drawvec1 = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawvec1'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawvec1 = new long[]{152, 160};

	/**
	 * Field descriptor (offset) for struct member 'drawvec2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only : end of the curve. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__drawvec2);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_drawvec2 = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawvec2'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawvec2 = new long[]{168, 176};

	/**
	 * Field descriptor (offset) for struct member 'drawvec_falloff_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__drawvec_falloff_min);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_drawvec_falloff_min = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawvec_falloff_min'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawvec_falloff_min = new long[]{184, 192};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{196, 204};

	/**
	 * Field descriptor (offset) for struct member 'drawvec_falloff_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__drawvec_falloff_max);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_drawvec_falloff_max = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawvec_falloff_max'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawvec_falloff_max = new long[]{200, 208};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{212, 220};

	/**
	 * Field descriptor (offset) for struct member 'f_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Force source object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__f_source);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_f_source = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f_source'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f_source = new long[]{216, 224};

	/**
	 * Field descriptor (offset) for struct member 'pdef_cfrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Friction of cloth collisions. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD__pdef_cfrict);
	 * CPointer&lt;Float&gt; p_pdef_cfrict = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdef_cfrict'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdef_cfrict = new long[]{220, 232};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PartDeflect partdeflect = ...;
	 * CPointer&lt;Object&gt; p = partdeflect.__dna__addressof(PartDeflect.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{224, 236};

	public PartDeflect(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected PartDeflect(PartDeflect that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General settings flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> General settings flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, flag);
		} else {
			__io__block.writeInt(__io__address + 0, flag);
		}
	}

	/**
	 * Get method for struct member 'deflect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deflection flag - does mesh deflect particles. </p>
	 * @see #__DNA__FIELD__deflect
	 */
	
	public short getDeflect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'deflect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deflection flag - does mesh deflect particles. </p>
	 * @see #__DNA__FIELD__deflect
	 */
	
	public void setDeflect(short deflect) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, deflect);
		} else {
			__io__block.writeShort(__io__address + 4, deflect);
		}
	}

	/**
	 * Get method for struct member 'forcefield'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Force field type, do the vertices attract / repel particles? </p>
	 * @see #__DNA__FIELD__forcefield
	 */
	
	public short getForcefield() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'forcefield'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Force field type, do the vertices attract / repel particles? </p>
	 * @see #__DNA__FIELD__forcefield
	 */
	
	public void setForcefield(short forcefield) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, forcefield);
		} else {
			__io__block.writeShort(__io__address + 6, forcefield);
		}
	}

	/**
	 * Get method for struct member 'falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Fall-off type. </p>
	 * @see #__DNA__FIELD__falloff
	 */
	
	public short getFalloff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Fall-off type. </p>
	 * @see #__DNA__FIELD__falloff
	 */
	
	public void setFalloff(short falloff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, falloff);
		} else {
			__io__block.writeShort(__io__address + 8, falloff);
		}
	}

	/**
	 * Get method for struct member 'shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Point, plane or surface. </p>
	 * @see #__DNA__FIELD__shape
	 */
	
	public short getShape() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'shape'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Point, plane or surface. </p>
	 * @see #__DNA__FIELD__shape
	 */
	
	public void setShape(short shape) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10, shape);
		} else {
			__io__block.writeShort(__io__address + 10, shape);
		}
	}

	/**
	 * Get method for struct member 'tex_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture effector. </p>
	 * @see #__DNA__FIELD__tex_mode
	 */
	
	public short getTex_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'tex_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture effector. </p>
	 * @see #__DNA__FIELD__tex_mode
	 */
	
	public void setTex_mode(short tex_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12, tex_mode);
		} else {
			__io__block.writeShort(__io__address + 12, tex_mode);
		}
	}

	/**
	 * Get method for struct member 'kink'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For curve guide. </p>
	 * @see #__DNA__FIELD__kink
	 */
	
	public short getKink() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 14);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'kink'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For curve guide. </p>
	 * @see #__DNA__FIELD__kink
	 */
	
	public void setKink(short kink) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 14, kink);
		} else {
			__io__block.writeShort(__io__address + 14, kink);
		}
	}

	/**
	 * Get method for struct member 'kink_axis'.
	 * @see #__DNA__FIELD__kink_axis
	 */
	
	public short getKink_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'kink_axis'.
	 * @see #__DNA__FIELD__kink_axis
	 */
	
	public void setKink_axis(short kink_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, kink_axis);
		} else {
			__io__block.writeShort(__io__address + 16, kink_axis);
		}
	}

	/**
	 * Get method for struct member 'zdir'.
	 * @see #__DNA__FIELD__zdir
	 */
	
	public short getZdir() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'zdir'.
	 * @see #__DNA__FIELD__zdir
	 */
	
	public void setZdir(short zdir) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, zdir);
		} else {
			__io__block.writeShort(__io__address + 18, zdir);
		}
	}

	/**
	 * Get method for struct member 'f_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Main effector values The strength of the force (+ or - ). </p>
	 * @see #__DNA__FIELD__f_strength
	 */
	
	public float getF_strength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'f_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Main effector values The strength of the force (+ or - ). </p>
	 * @see #__DNA__FIELD__f_strength
	 */
	
	public void setF_strength(float f_strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, f_strength);
		} else {
			__io__block.writeFloat(__io__address + 20, f_strength);
		}
	}

	/**
	 * Get method for struct member 'f_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Damping ratio of the harmonic effector. </p>
	 * @see #__DNA__FIELD__f_damp
	 */
	
	public float getF_damp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'f_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Damping ratio of the harmonic effector. </p>
	 * @see #__DNA__FIELD__f_damp
	 */
	
	public void setF_damp(float f_damp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, f_damp);
		} else {
			__io__block.writeFloat(__io__address + 24, f_damp);
		}
	}

	/**
	 * Get method for struct member 'f_flow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much force is converted into "air flow", i.e. force used as the velocity of surrounding medium. </p>
	 * @see #__DNA__FIELD__f_flow
	 */
	
	public float getF_flow() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'f_flow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much force is converted into "air flow", i.e. force used as the velocity of surrounding medium. </p>
	 * @see #__DNA__FIELD__f_flow
	 */
	
	public void setF_flow(float f_flow) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, f_flow);
		} else {
			__io__block.writeFloat(__io__address + 28, f_flow);
		}
	}

	/**
	 * Get method for struct member 'f_wind_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much force is reduced when acting parallel to a surface, e.g. cloth. </p>
	 * @see #__DNA__FIELD__f_wind_factor
	 */
	
	public float getF_wind_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'f_wind_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much force is reduced when acting parallel to a surface, e.g. cloth. </p>
	 * @see #__DNA__FIELD__f_wind_factor
	 */
	
	public void setF_wind_factor(float f_wind_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, f_wind_factor);
		} else {
			__io__block.writeFloat(__io__address + 32, f_wind_factor);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 36;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Get method for struct member 'f_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Noise size for noise effector, restlength for harmonic effector. </p>
	 * @see #__DNA__FIELD__f_size
	 */
	
	public float getF_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'f_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Noise size for noise effector, restlength for harmonic effector. </p>
	 * @see #__DNA__FIELD__f_size
	 */
	
	public void setF_size(float f_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, f_size);
		} else {
			__io__block.writeFloat(__io__address + 40, f_size);
		}
	}

	/**
	 * Get method for struct member 'f_power'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> fall-off The power law - real gravitation is 2 (square). </p>
	 * @see #__DNA__FIELD__f_power
	 */
	
	public float getF_power() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'f_power'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> fall-off The power law - real gravitation is 2 (square). </p>
	 * @see #__DNA__FIELD__f_power
	 */
	
	public void setF_power(float f_power) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, f_power);
		} else {
			__io__block.writeFloat(__io__address + 44, f_power);
		}
	}

	/**
	 * Get method for struct member 'maxdist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If indicated, use this maximum. </p>
	 * @see #__DNA__FIELD__maxdist
	 */
	
	public float getMaxdist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'maxdist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If indicated, use this maximum. </p>
	 * @see #__DNA__FIELD__maxdist
	 */
	
	public void setMaxdist(float maxdist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, maxdist);
		} else {
			__io__block.writeFloat(__io__address + 48, maxdist);
		}
	}

	/**
	 * Get method for struct member 'mindist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If indicated, use this minimum. </p>
	 * @see #__DNA__FIELD__mindist
	 */
	
	public float getMindist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'mindist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If indicated, use this minimum. </p>
	 * @see #__DNA__FIELD__mindist
	 */
	
	public void setMindist(float mindist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, mindist);
		} else {
			__io__block.writeFloat(__io__address + 52, mindist);
		}
	}

	/**
	 * Get method for struct member 'f_power_r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radial fall-off power. </p>
	 * @see #__DNA__FIELD__f_power_r
	 */
	
	public float getF_power_r() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'f_power_r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radial fall-off power. </p>
	 * @see #__DNA__FIELD__f_power_r
	 */
	
	public void setF_power_r(float f_power_r) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, f_power_r);
		} else {
			__io__block.writeFloat(__io__address + 56, f_power_r);
		}
	}

	/**
	 * Get method for struct member 'maxrad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radial versions of above. </p>
	 * @see #__DNA__FIELD__maxrad
	 */
	
	public float getMaxrad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'maxrad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radial versions of above. </p>
	 * @see #__DNA__FIELD__maxrad
	 */
	
	public void setMaxrad(float maxrad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, maxrad);
		} else {
			__io__block.writeFloat(__io__address + 60, maxrad);
		}
	}

	/**
	 * Get method for struct member 'minrad'.
	 * @see #__DNA__FIELD__minrad
	 */
	
	public float getMinrad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'minrad'.
	 * @see #__DNA__FIELD__minrad
	 */
	
	public void setMinrad(float minrad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, minrad);
		} else {
			__io__block.writeFloat(__io__address + 64, minrad);
		}
	}

	/**
	 * Get method for struct member 'pdef_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> particle collisions Damping factor for particle deflection. </p>
	 * @see #__DNA__FIELD__pdef_damp
	 */
	
	public float getPdef_damp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'pdef_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> particle collisions Damping factor for particle deflection. </p>
	 * @see #__DNA__FIELD__pdef_damp
	 */
	
	public void setPdef_damp(float pdef_damp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, pdef_damp);
		} else {
			__io__block.writeFloat(__io__address + 68, pdef_damp);
		}
	}

	/**
	 * Get method for struct member 'pdef_rdamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Random element of damping for deflection. </p>
	 * @see #__DNA__FIELD__pdef_rdamp
	 */
	
	public float getPdef_rdamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'pdef_rdamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Random element of damping for deflection. </p>
	 * @see #__DNA__FIELD__pdef_rdamp
	 */
	
	public void setPdef_rdamp(float pdef_rdamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, pdef_rdamp);
		} else {
			__io__block.writeFloat(__io__address + 72, pdef_rdamp);
		}
	}

	/**
	 * Get method for struct member 'pdef_perm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Chance of particle passing through mesh. </p>
	 * @see #__DNA__FIELD__pdef_perm
	 */
	
	public float getPdef_perm() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'pdef_perm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Chance of particle passing through mesh. </p>
	 * @see #__DNA__FIELD__pdef_perm
	 */
	
	public void setPdef_perm(float pdef_perm) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, pdef_perm);
		} else {
			__io__block.writeFloat(__io__address + 76, pdef_perm);
		}
	}

	/**
	 * Get method for struct member 'pdef_frict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Friction factor for particle deflection. </p>
	 * @see #__DNA__FIELD__pdef_frict
	 */
	
	public float getPdef_frict() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'pdef_frict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Friction factor for particle deflection. </p>
	 * @see #__DNA__FIELD__pdef_frict
	 */
	
	public void setPdef_frict(float pdef_frict) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, pdef_frict);
		} else {
			__io__block.writeFloat(__io__address + 80, pdef_frict);
		}
	}

	/**
	 * Get method for struct member 'pdef_rfrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Random element of friction for deflection. </p>
	 * @see #__DNA__FIELD__pdef_rfrict
	 */
	
	public float getPdef_rfrict() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'pdef_rfrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Random element of friction for deflection. </p>
	 * @see #__DNA__FIELD__pdef_rfrict
	 */
	
	public void setPdef_rfrict(float pdef_rfrict) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, pdef_rfrict);
		} else {
			__io__block.writeFloat(__io__address + 84, pdef_rfrict);
		}
	}

	/**
	 * Get method for struct member 'pdef_stickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Surface particle stickiness. </p>
	 * @see #__DNA__FIELD__pdef_stickness
	 */
	
	public float getPdef_stickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'pdef_stickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Surface particle stickiness. </p>
	 * @see #__DNA__FIELD__pdef_stickness
	 */
	
	public void setPdef_stickness(float pdef_stickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, pdef_stickness);
		} else {
			__io__block.writeFloat(__io__address + 88, pdef_stickness);
		}
	}

	/**
	 * Get method for struct member 'absorption'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for forces. </p>
	 * @see #__DNA__FIELD__absorption
	 */
	
	public float getAbsorption() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'absorption'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Used for forces. </p>
	 * @see #__DNA__FIELD__absorption
	 */
	
	public void setAbsorption(float absorption) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, absorption);
		} else {
			__io__block.writeFloat(__io__address + 92, absorption);
		}
	}

	/**
	 * Get method for struct member 'pdef_sbdamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> softbody collisions Damping factor for softbody deflection. </p>
	 * @see #__DNA__FIELD__pdef_sbdamp
	 */
	
	public float getPdef_sbdamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'pdef_sbdamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> softbody collisions Damping factor for softbody deflection. </p>
	 * @see #__DNA__FIELD__pdef_sbdamp
	 */
	
	public void setPdef_sbdamp(float pdef_sbdamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, pdef_sbdamp);
		} else {
			__io__block.writeFloat(__io__address + 96, pdef_sbdamp);
		}
	}

	/**
	 * Get method for struct member 'pdef_sbift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inner face thickness for softbody deflection. </p>
	 * @see #__DNA__FIELD__pdef_sbift
	 */
	
	public float getPdef_sbift() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'pdef_sbift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inner face thickness for softbody deflection. </p>
	 * @see #__DNA__FIELD__pdef_sbift
	 */
	
	public void setPdef_sbift(float pdef_sbift) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, pdef_sbift);
		} else {
			__io__block.writeFloat(__io__address + 100, pdef_sbift);
		}
	}

	/**
	 * Get method for struct member 'pdef_sboft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Outer face thickness for softbody deflection. </p>
	 * @see #__DNA__FIELD__pdef_sboft
	 */
	
	public float getPdef_sboft() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'pdef_sboft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Outer face thickness for softbody deflection. </p>
	 * @see #__DNA__FIELD__pdef_sboft
	 */
	
	public void setPdef_sboft(float pdef_sboft) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, pdef_sboft);
		} else {
			__io__block.writeFloat(__io__address + 104, pdef_sboft);
		}
	}

	/**
	 * Get method for struct member 'clump_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> guide curve, same as for particle child effects </p>
	 * @see #__DNA__FIELD__clump_fac
	 */
	
	public float getClump_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'clump_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> guide curve, same as for particle child effects </p>
	 * @see #__DNA__FIELD__clump_fac
	 */
	
	public void setClump_fac(float clump_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, clump_fac);
		} else {
			__io__block.writeFloat(__io__address + 108, clump_fac);
		}
	}

	/**
	 * Get method for struct member 'clump_pow'.
	 * @see #__DNA__FIELD__clump_pow
	 */
	
	public float getClump_pow() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'clump_pow'.
	 * @see #__DNA__FIELD__clump_pow
	 */
	
	public void setClump_pow(float clump_pow) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, clump_pow);
		} else {
			__io__block.writeFloat(__io__address + 112, clump_pow);
		}
	}

	/**
	 * Get method for struct member 'kink_freq'.
	 * @see #__DNA__FIELD__kink_freq
	 */
	
	public float getKink_freq() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'kink_freq'.
	 * @see #__DNA__FIELD__kink_freq
	 */
	
	public void setKink_freq(float kink_freq) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, kink_freq);
		} else {
			__io__block.writeFloat(__io__address + 116, kink_freq);
		}
	}

	/**
	 * Get method for struct member 'kink_shape'.
	 * @see #__DNA__FIELD__kink_shape
	 */
	
	public float getKink_shape() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'kink_shape'.
	 * @see #__DNA__FIELD__kink_shape
	 */
	
	public void setKink_shape(float kink_shape) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, kink_shape);
		} else {
			__io__block.writeFloat(__io__address + 120, kink_shape);
		}
	}

	/**
	 * Get method for struct member 'kink_amp'.
	 * @see #__DNA__FIELD__kink_amp
	 */
	
	public float getKink_amp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'kink_amp'.
	 * @see #__DNA__FIELD__kink_amp
	 */
	
	public void setKink_amp(float kink_amp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, kink_amp);
		} else {
			__io__block.writeFloat(__io__address + 124, kink_amp);
		}
	}

	/**
	 * Get method for struct member 'free_end'.
	 * @see #__DNA__FIELD__free_end
	 */
	
	public float getFree_end() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 128);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'free_end'.
	 * @see #__DNA__FIELD__free_end
	 */
	
	public void setFree_end(float free_end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 128, free_end);
		} else {
			__io__block.writeFloat(__io__address + 128, free_end);
		}
	}

	/**
	 * Get method for struct member 'tex_nabla'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture effector Used for calculating partial derivatives. </p>
	 * @see #__DNA__FIELD__tex_nabla
	 */
	
	public float getTex_nabla() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 132);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'tex_nabla'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture effector Used for calculating partial derivatives. </p>
	 * @see #__DNA__FIELD__tex_nabla
	 */
	
	public void setTex_nabla(float tex_nabla) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 132, tex_nabla);
		} else {
			__io__block.writeFloat(__io__address + 132, tex_nabla);
		}
	}

	/**
	 * Get method for struct member 'tex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture of the texture effector. </p>
	 * @see #__DNA__FIELD__tex
	 */
	
	public CPointer<Tex> getTex() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Tex.class};
		return new CPointer<Tex>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Tex.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture of the texture effector. </p>
	 * @see #__DNA__FIELD__tex
	 */
	
	public void setTex(CPointer<Tex> tex) throws IOException
	{
		long __address = ((tex == null) ? 0 : tex.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Get method for struct member 'rng'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> effector noise Random noise generator for e.g. wind. </p>
	 * @see #__DNA__FIELD__rng
	 */
	
	public CPointer<Object> getRng() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rng'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> effector noise Random noise generator for e.g. wind. </p>
	 * @see #__DNA__FIELD__rng
	 */
	
	public void setRng(CPointer<Object> rng) throws IOException
	{
		long __address = ((rng == null) ? 0 : rng.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Get method for struct member 'f_noise'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Noise of force. </p>
	 * @see #__DNA__FIELD__f_noise
	 */
	
	public float getF_noise() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'f_noise'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Noise of force. </p>
	 * @see #__DNA__FIELD__f_noise
	 */
	
	public void setF_noise(float f_noise) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, f_noise);
		} else {
			__io__block.writeFloat(__io__address + 144, f_noise);
		}
	}

	/**
	 * Get method for struct member 'seed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Noise random seed. </p>
	 * @see #__DNA__FIELD__seed
	 */
	
	public int getSeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 156);
		} else {
			return __io__block.readInt(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'seed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Noise random seed. </p>
	 * @see #__DNA__FIELD__seed
	 */
	
	public void setSeed(int seed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 156, seed);
		} else {
			__io__block.writeInt(__io__address + 148, seed);
		}
	}

	/**
	 * Get method for struct member 'drawvec1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display Size Runtime only : start of the curve or draw scale. </p>
	 * @see #__DNA__FIELD__drawvec1
	 */
	
	public CArrayFacade<Float> getDrawvec1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drawvec1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display Size Runtime only : start of the curve or draw scale. </p>
	 * @see #__DNA__FIELD__drawvec1
	 */
	
	public void setDrawvec1(CArrayFacade<Float> drawvec1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 152;
		}
		if (__io__equals(drawvec1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drawvec1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drawvec1);
		} else {
			__io__generic__copy( getDrawvec1(), drawvec1);
		}
	}

	/**
	 * Get method for struct member 'drawvec2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only : end of the curve. </p>
	 * @see #__DNA__FIELD__drawvec2
	 */
	
	public CArrayFacade<Float> getDrawvec2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drawvec2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only : end of the curve. </p>
	 * @see #__DNA__FIELD__drawvec2
	 */
	
	public void setDrawvec2(CArrayFacade<Float> drawvec2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 176;
		} else {
			__dna__offset = 168;
		}
		if (__io__equals(drawvec2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drawvec2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drawvec2);
		} else {
			__io__generic__copy( getDrawvec2(), drawvec2);
		}
	}

	/**
	 * Get method for struct member 'drawvec_falloff_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only. </p>
	 * @see #__DNA__FIELD__drawvec_falloff_min
	 */
	
	public CArrayFacade<Float> getDrawvec_falloff_min() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drawvec_falloff_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only. </p>
	 * @see #__DNA__FIELD__drawvec_falloff_min
	 */
	
	public void setDrawvec_falloff_min(CArrayFacade<Float> drawvec_falloff_min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 184;
		}
		if (__io__equals(drawvec_falloff_min, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drawvec_falloff_min)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drawvec_falloff_min);
		} else {
			__io__generic__copy( getDrawvec_falloff_min(), drawvec_falloff_min);
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
			return new CArrayFacade<Byte>(__io__address + 204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 204;
		} else {
			__dna__offset = 196;
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
	 * Get method for struct member 'drawvec_falloff_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only. </p>
	 * @see #__DNA__FIELD__drawvec_falloff_max
	 */
	
	public CArrayFacade<Float> getDrawvec_falloff_max() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 208, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drawvec_falloff_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime only. </p>
	 * @see #__DNA__FIELD__drawvec_falloff_max
	 */
	
	public void setDrawvec_falloff_max(CArrayFacade<Float> drawvec_falloff_max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 200;
		}
		if (__io__equals(drawvec_falloff_max, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drawvec_falloff_max)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drawvec_falloff_max);
		} else {
			__io__generic__copy( getDrawvec_falloff_max(), drawvec_falloff_max);
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
			return new CArrayFacade<Byte>(__io__address + 220, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 212, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 220;
		} else {
			__dna__offset = 212;
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
	 * Get method for struct member 'f_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Force source object. </p>
	 * @see #__DNA__FIELD__f_source
	 */
	
	public CPointer<BlenderObject> getF_source() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'f_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Force source object. </p>
	 * @see #__DNA__FIELD__f_source
	 */
	
	public void setF_source(CPointer<BlenderObject> f_source) throws IOException
	{
		long __address = ((f_source == null) ? 0 : f_source.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 216, __address);
		}
	}

	/**
	 * Get method for struct member 'pdef_cfrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Friction of cloth collisions. </p>
	 * @see #__DNA__FIELD__pdef_cfrict
	 */
	
	public float getPdef_cfrict() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 232);
		} else {
			return __io__block.readFloat(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'pdef_cfrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Friction of cloth collisions. </p>
	 * @see #__DNA__FIELD__pdef_cfrict
	 */
	
	public void setPdef_cfrict(float pdef_cfrict) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 232, pdef_cfrict);
		} else {
			__io__block.writeFloat(__io__address + 220, pdef_cfrict);
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
			return new CArrayFacade<Byte>(__io__address + 236, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 224, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 236;
		} else {
			__dna__offset = 224;
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
	public CPointer<PartDeflect> __io__addressof() {
		return new CPointer<PartDeflect>(__io__address, new Class[]{PartDeflect.class}, __io__block, __io__blockTable);
	}

}
