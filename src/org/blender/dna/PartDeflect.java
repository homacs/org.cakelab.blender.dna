package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'PartDeflect'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=148, size64=160)
public class PartDeflect extends CFacade {

	/**
	 * This is the sdna index of the struct PartDeflect.
	 * <p>
	 * It is required when allocating a new block to store data for PartDeflect.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 153;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> general settings flag </p>
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
	 * <p> Deflection flag - does mesh deflect particles </p>
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
	 * <p> fall-off type </p>
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
	 * <p> point, plane or surface </p>
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
	 * <p> texture effector </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for curve guide </p>
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
	 * <p> Main effector values The strength of the force (+ or - ) </p>
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
	 * <p> How much force is converted into "air flow", i.e. </p>
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
	 * Field descriptor (offset) for struct member 'f_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> force used as the velocity of surrounding medium. Noise size for noise effector, restlength for harmonic effector </p>
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
	public static final long[] __DNA__FIELD__f_size = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'f_power'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> fall-off The power law - real gravitation is 2 (square) </p>
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
	public static final long[] __DNA__FIELD__f_power = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'maxdist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if indicated, use this maximum </p>
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
	public static final long[] __DNA__FIELD__maxdist = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'mindist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if indicated, use this minimum </p>
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
	public static final long[] __DNA__FIELD__mindist = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'f_power_r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> radial fall-off power </p>
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
	public static final long[] __DNA__FIELD__f_power_r = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'maxrad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> radial versions of above </p>
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
	public static final long[] __DNA__FIELD__maxrad = new long[]{52, 52};

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
	public static final long[] __DNA__FIELD__minrad = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'pdef_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> particle collisions Damping factor for particle deflection </p>
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
	public static final long[] __DNA__FIELD__pdef_damp = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'pdef_rdamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Random element of damping for deflection </p>
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
	public static final long[] __DNA__FIELD__pdef_rdamp = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'pdef_perm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Chance of particle passing through mesh </p>
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
	public static final long[] __DNA__FIELD__pdef_perm = new long[]{68, 68};

	/**
	 * Field descriptor (offset) for struct member 'pdef_frict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Friction factor for particle deflection </p>
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
	public static final long[] __DNA__FIELD__pdef_frict = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'pdef_rfrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Random element of friction for deflection </p>
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
	public static final long[] __DNA__FIELD__pdef_rfrict = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'pdef_stickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> surface particle stickiness </p>
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
	public static final long[] __DNA__FIELD__pdef_stickness = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'absorption'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used for forces </p>
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
	public static final long[] __DNA__FIELD__absorption = new long[]{84, 84};

	/**
	 * Field descriptor (offset) for struct member 'pdef_sbdamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> softbody collisions Damping factor for softbody deflection </p>
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
	public static final long[] __DNA__FIELD__pdef_sbdamp = new long[]{88, 88};

	/**
	 * Field descriptor (offset) for struct member 'pdef_sbift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> inner face thickness for softbody deflection </p>
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
	public static final long[] __DNA__FIELD__pdef_sbift = new long[]{92, 92};

	/**
	 * Field descriptor (offset) for struct member 'pdef_sboft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> outer face thickness for softbody deflection </p>
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
	public static final long[] __DNA__FIELD__pdef_sboft = new long[]{96, 96};

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
	public static final long[] __DNA__FIELD__clump_fac = new long[]{100, 100};

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
	public static final long[] __DNA__FIELD__clump_pow = new long[]{104, 104};

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
	public static final long[] __DNA__FIELD__kink_freq = new long[]{108, 108};

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
	public static final long[] __DNA__FIELD__kink_shape = new long[]{112, 112};

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
	public static final long[] __DNA__FIELD__kink_amp = new long[]{116, 116};

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
	public static final long[] __DNA__FIELD__free_end = new long[]{120, 120};

	/**
	 * Field descriptor (offset) for struct member 'tex_nabla'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture effector Used for calculating partial derivatives </p>
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
	public static final long[] __DNA__FIELD__tex_nabla = new long[]{124, 124};

	/**
	 * Field descriptor (offset) for struct member 'tex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture of the texture effector </p>
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
	public static final long[] __DNA__FIELD__tex = new long[]{128, 128};

	/**
	 * Field descriptor (offset) for struct member 'rng'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> effector noise random noise generator for e.g. wind </p>
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
	public static final long[] __DNA__FIELD__rng = new long[]{132, 136};

	/**
	 * Field descriptor (offset) for struct member 'f_noise'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> noise of force </p>
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
	public static final long[] __DNA__FIELD__f_noise = new long[]{136, 144};

	/**
	 * Field descriptor (offset) for struct member 'seed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> noise random seed </p>
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
	public static final long[] __DNA__FIELD__seed = new long[]{140, 148};

	/**
	 * Field descriptor (offset) for struct member 'f_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> force source object </p>
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
	public static final long[] __DNA__FIELD__f_source = new long[]{144, 152};

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
	 * <p> general settings flag </p>
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
	 * <p> general settings flag </p>
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
	 * <p> Deflection flag - does mesh deflect particles </p>
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
	 * <p> Deflection flag - does mesh deflect particles </p>
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
	 * <p> fall-off type </p>
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
	 * <p> fall-off type </p>
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
	 * <p> point, plane or surface </p>
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
	 * <p> point, plane or surface </p>
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
	 * <p> texture effector </p>
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
	 * <p> texture effector </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for curve guide </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for curve guide </p>
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
	 * <p> Main effector values The strength of the force (+ or - ) </p>
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
	 * <p> Main effector values The strength of the force (+ or - ) </p>
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
	 * <p> How much force is converted into "air flow", i.e. </p>
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
	 * <p> How much force is converted into "air flow", i.e. </p>
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
	 * Get method for struct member 'f_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> force used as the velocity of surrounding medium. Noise size for noise effector, restlength for harmonic effector </p>
	 * @see #__DNA__FIELD__f_size
	 */
	
	public float getF_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'f_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> force used as the velocity of surrounding medium. Noise size for noise effector, restlength for harmonic effector </p>
	 * @see #__DNA__FIELD__f_size
	 */
	
	public void setF_size(float f_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, f_size);
		} else {
			__io__block.writeFloat(__io__address + 32, f_size);
		}
	}

	/**
	 * Get method for struct member 'f_power'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> fall-off The power law - real gravitation is 2 (square) </p>
	 * @see #__DNA__FIELD__f_power
	 */
	
	public float getF_power() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'f_power'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> fall-off The power law - real gravitation is 2 (square) </p>
	 * @see #__DNA__FIELD__f_power
	 */
	
	public void setF_power(float f_power) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, f_power);
		} else {
			__io__block.writeFloat(__io__address + 36, f_power);
		}
	}

	/**
	 * Get method for struct member 'maxdist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if indicated, use this maximum </p>
	 * @see #__DNA__FIELD__maxdist
	 */
	
	public float getMaxdist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'maxdist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if indicated, use this maximum </p>
	 * @see #__DNA__FIELD__maxdist
	 */
	
	public void setMaxdist(float maxdist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, maxdist);
		} else {
			__io__block.writeFloat(__io__address + 40, maxdist);
		}
	}

	/**
	 * Get method for struct member 'mindist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if indicated, use this minimum </p>
	 * @see #__DNA__FIELD__mindist
	 */
	
	public float getMindist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'mindist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if indicated, use this minimum </p>
	 * @see #__DNA__FIELD__mindist
	 */
	
	public void setMindist(float mindist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, mindist);
		} else {
			__io__block.writeFloat(__io__address + 44, mindist);
		}
	}

	/**
	 * Get method for struct member 'f_power_r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> radial fall-off power </p>
	 * @see #__DNA__FIELD__f_power_r
	 */
	
	public float getF_power_r() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'f_power_r'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> radial fall-off power </p>
	 * @see #__DNA__FIELD__f_power_r
	 */
	
	public void setF_power_r(float f_power_r) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, f_power_r);
		} else {
			__io__block.writeFloat(__io__address + 48, f_power_r);
		}
	}

	/**
	 * Get method for struct member 'maxrad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> radial versions of above </p>
	 * @see #__DNA__FIELD__maxrad
	 */
	
	public float getMaxrad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'maxrad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> radial versions of above </p>
	 * @see #__DNA__FIELD__maxrad
	 */
	
	public void setMaxrad(float maxrad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, maxrad);
		} else {
			__io__block.writeFloat(__io__address + 52, maxrad);
		}
	}

	/**
	 * Get method for struct member 'minrad'.
	 * @see #__DNA__FIELD__minrad
	 */
	
	public float getMinrad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'minrad'.
	 * @see #__DNA__FIELD__minrad
	 */
	
	public void setMinrad(float minrad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, minrad);
		} else {
			__io__block.writeFloat(__io__address + 56, minrad);
		}
	}

	/**
	 * Get method for struct member 'pdef_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> particle collisions Damping factor for particle deflection </p>
	 * @see #__DNA__FIELD__pdef_damp
	 */
	
	public float getPdef_damp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'pdef_damp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> particle collisions Damping factor for particle deflection </p>
	 * @see #__DNA__FIELD__pdef_damp
	 */
	
	public void setPdef_damp(float pdef_damp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, pdef_damp);
		} else {
			__io__block.writeFloat(__io__address + 60, pdef_damp);
		}
	}

	/**
	 * Get method for struct member 'pdef_rdamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Random element of damping for deflection </p>
	 * @see #__DNA__FIELD__pdef_rdamp
	 */
	
	public float getPdef_rdamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'pdef_rdamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Random element of damping for deflection </p>
	 * @see #__DNA__FIELD__pdef_rdamp
	 */
	
	public void setPdef_rdamp(float pdef_rdamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, pdef_rdamp);
		} else {
			__io__block.writeFloat(__io__address + 64, pdef_rdamp);
		}
	}

	/**
	 * Get method for struct member 'pdef_perm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Chance of particle passing through mesh </p>
	 * @see #__DNA__FIELD__pdef_perm
	 */
	
	public float getPdef_perm() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'pdef_perm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Chance of particle passing through mesh </p>
	 * @see #__DNA__FIELD__pdef_perm
	 */
	
	public void setPdef_perm(float pdef_perm) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, pdef_perm);
		} else {
			__io__block.writeFloat(__io__address + 68, pdef_perm);
		}
	}

	/**
	 * Get method for struct member 'pdef_frict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Friction factor for particle deflection </p>
	 * @see #__DNA__FIELD__pdef_frict
	 */
	
	public float getPdef_frict() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'pdef_frict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Friction factor for particle deflection </p>
	 * @see #__DNA__FIELD__pdef_frict
	 */
	
	public void setPdef_frict(float pdef_frict) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, pdef_frict);
		} else {
			__io__block.writeFloat(__io__address + 72, pdef_frict);
		}
	}

	/**
	 * Get method for struct member 'pdef_rfrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Random element of friction for deflection </p>
	 * @see #__DNA__FIELD__pdef_rfrict
	 */
	
	public float getPdef_rfrict() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'pdef_rfrict'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Random element of friction for deflection </p>
	 * @see #__DNA__FIELD__pdef_rfrict
	 */
	
	public void setPdef_rfrict(float pdef_rfrict) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, pdef_rfrict);
		} else {
			__io__block.writeFloat(__io__address + 76, pdef_rfrict);
		}
	}

	/**
	 * Get method for struct member 'pdef_stickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> surface particle stickiness </p>
	 * @see #__DNA__FIELD__pdef_stickness
	 */
	
	public float getPdef_stickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'pdef_stickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> surface particle stickiness </p>
	 * @see #__DNA__FIELD__pdef_stickness
	 */
	
	public void setPdef_stickness(float pdef_stickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, pdef_stickness);
		} else {
			__io__block.writeFloat(__io__address + 80, pdef_stickness);
		}
	}

	/**
	 * Get method for struct member 'absorption'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used for forces </p>
	 * @see #__DNA__FIELD__absorption
	 */
	
	public float getAbsorption() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'absorption'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> used for forces </p>
	 * @see #__DNA__FIELD__absorption
	 */
	
	public void setAbsorption(float absorption) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, absorption);
		} else {
			__io__block.writeFloat(__io__address + 84, absorption);
		}
	}

	/**
	 * Get method for struct member 'pdef_sbdamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> softbody collisions Damping factor for softbody deflection </p>
	 * @see #__DNA__FIELD__pdef_sbdamp
	 */
	
	public float getPdef_sbdamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'pdef_sbdamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> softbody collisions Damping factor for softbody deflection </p>
	 * @see #__DNA__FIELD__pdef_sbdamp
	 */
	
	public void setPdef_sbdamp(float pdef_sbdamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, pdef_sbdamp);
		} else {
			__io__block.writeFloat(__io__address + 88, pdef_sbdamp);
		}
	}

	/**
	 * Get method for struct member 'pdef_sbift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> inner face thickness for softbody deflection </p>
	 * @see #__DNA__FIELD__pdef_sbift
	 */
	
	public float getPdef_sbift() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'pdef_sbift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> inner face thickness for softbody deflection </p>
	 * @see #__DNA__FIELD__pdef_sbift
	 */
	
	public void setPdef_sbift(float pdef_sbift) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, pdef_sbift);
		} else {
			__io__block.writeFloat(__io__address + 92, pdef_sbift);
		}
	}

	/**
	 * Get method for struct member 'pdef_sboft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> outer face thickness for softbody deflection </p>
	 * @see #__DNA__FIELD__pdef_sboft
	 */
	
	public float getPdef_sboft() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'pdef_sboft'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> outer face thickness for softbody deflection </p>
	 * @see #__DNA__FIELD__pdef_sboft
	 */
	
	public void setPdef_sboft(float pdef_sboft) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, pdef_sboft);
		} else {
			__io__block.writeFloat(__io__address + 96, pdef_sboft);
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
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 100);
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
			__io__block.writeFloat(__io__address + 100, clump_fac);
		} else {
			__io__block.writeFloat(__io__address + 100, clump_fac);
		}
	}

	/**
	 * Get method for struct member 'clump_pow'.
	 * @see #__DNA__FIELD__clump_pow
	 */
	
	public float getClump_pow() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'clump_pow'.
	 * @see #__DNA__FIELD__clump_pow
	 */
	
	public void setClump_pow(float clump_pow) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, clump_pow);
		} else {
			__io__block.writeFloat(__io__address + 104, clump_pow);
		}
	}

	/**
	 * Get method for struct member 'kink_freq'.
	 * @see #__DNA__FIELD__kink_freq
	 */
	
	public float getKink_freq() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'kink_freq'.
	 * @see #__DNA__FIELD__kink_freq
	 */
	
	public void setKink_freq(float kink_freq) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, kink_freq);
		} else {
			__io__block.writeFloat(__io__address + 108, kink_freq);
		}
	}

	/**
	 * Get method for struct member 'kink_shape'.
	 * @see #__DNA__FIELD__kink_shape
	 */
	
	public float getKink_shape() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'kink_shape'.
	 * @see #__DNA__FIELD__kink_shape
	 */
	
	public void setKink_shape(float kink_shape) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, kink_shape);
		} else {
			__io__block.writeFloat(__io__address + 112, kink_shape);
		}
	}

	/**
	 * Get method for struct member 'kink_amp'.
	 * @see #__DNA__FIELD__kink_amp
	 */
	
	public float getKink_amp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'kink_amp'.
	 * @see #__DNA__FIELD__kink_amp
	 */
	
	public void setKink_amp(float kink_amp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, kink_amp);
		} else {
			__io__block.writeFloat(__io__address + 116, kink_amp);
		}
	}

	/**
	 * Get method for struct member 'free_end'.
	 * @see #__DNA__FIELD__free_end
	 */
	
	public float getFree_end() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'free_end'.
	 * @see #__DNA__FIELD__free_end
	 */
	
	public void setFree_end(float free_end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, free_end);
		} else {
			__io__block.writeFloat(__io__address + 120, free_end);
		}
	}

	/**
	 * Get method for struct member 'tex_nabla'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture effector Used for calculating partial derivatives </p>
	 * @see #__DNA__FIELD__tex_nabla
	 */
	
	public float getTex_nabla() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'tex_nabla'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> texture effector Used for calculating partial derivatives </p>
	 * @see #__DNA__FIELD__tex_nabla
	 */
	
	public void setTex_nabla(float tex_nabla) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, tex_nabla);
		} else {
			__io__block.writeFloat(__io__address + 124, tex_nabla);
		}
	}

	/**
	 * Get method for struct member 'tex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture of the texture effector </p>
	 * @see #__DNA__FIELD__tex
	 */
	
	public CPointer<Tex> getTex() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Tex.class};
		return new CPointer<Tex>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Tex.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Texture of the texture effector </p>
	 * @see #__DNA__FIELD__tex
	 */
	
	public void setTex(CPointer<Tex> tex) throws IOException
	{
		long __address = ((tex == null) ? 0 : tex.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 128, __address);
		}
	}

	/**
	 * Get method for struct member 'rng'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> effector noise random noise generator for e.g. wind </p>
	 * @see #__DNA__FIELD__rng
	 */
	
	public CPointer<Object> getRng() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 132);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rng'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> effector noise random noise generator for e.g. wind </p>
	 * @see #__DNA__FIELD__rng
	 */
	
	public void setRng(CPointer<Object> rng) throws IOException
	{
		long __address = ((rng == null) ? 0 : rng.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 132, __address);
		}
	}

	/**
	 * Get method for struct member 'f_noise'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> noise of force </p>
	 * @see #__DNA__FIELD__f_noise
	 */
	
	public float getF_noise() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'f_noise'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> noise of force </p>
	 * @see #__DNA__FIELD__f_noise
	 */
	
	public void setF_noise(float f_noise) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, f_noise);
		} else {
			__io__block.writeFloat(__io__address + 136, f_noise);
		}
	}

	/**
	 * Get method for struct member 'seed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> noise random seed </p>
	 * @see #__DNA__FIELD__seed
	 */
	
	public int getSeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 148);
		} else {
			return __io__block.readInt(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'seed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> noise random seed </p>
	 * @see #__DNA__FIELD__seed
	 */
	
	public void setSeed(int seed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 148, seed);
		} else {
			__io__block.writeInt(__io__address + 140, seed);
		}
	}

	/**
	 * Get method for struct member 'f_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> force source object </p>
	 * @see #__DNA__FIELD__f_source
	 */
	
	public CPointer<BlenderObject> getF_source() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'f_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> force source object </p>
	 * @see #__DNA__FIELD__f_source
	 */
	
	public void setF_source(CPointer<BlenderObject> f_source) throws IOException
	{
		long __address = ((f_source == null) ? 0 : f_source.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 144, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<PartDeflect> __io__addressof() {
		return new CPointer<PartDeflect>(__io__address, new Class[]{PartDeflect.class}, __io__block, __io__blockTable);
	}

}
