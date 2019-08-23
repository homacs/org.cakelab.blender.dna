package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BulletSoftBody'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=120, size64=120)
public class BulletSoftBody extends CFacade {

	/**
	 * This is the sdna index of the struct BulletSoftBody.
	 * <p>
	 * It is required when allocating a new block to store data for BulletSoftBody.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 162;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> various boolean options </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__flag);
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
	 * Field descriptor (offset) for struct member 'linStiff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> linear stiffness 0..1 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__linStiff);
	 * CPointer&lt;Float&gt; p_linStiff = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'linStiff'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__linStiff = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'angStiff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angular stiffness 0..1 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__angStiff);
	 * CPointer&lt;Float&gt; p_angStiff = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angStiff'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angStiff = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'volume'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> volume preservation 0..1 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__volume);
	 * CPointer&lt;Float&gt; p_volume = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volume'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volume = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'viterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Velocities solver iterations </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__viterations);
	 * CPointer&lt;Integer&gt; p_viterations = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viterations'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viterations = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'piterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Positions solver iterations </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__piterations);
	 * CPointer&lt;Integer&gt; p_piterations = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'piterations'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__piterations = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'diterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Drift solver iterations </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__diterations);
	 * CPointer&lt;Integer&gt; p_diterations = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'diterations'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__diterations = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'citerations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cluster solver iterations </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__citerations);
	 * CPointer&lt;Integer&gt; p_citerations = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'citerations'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__citerations = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'kSRHR_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs rigid hardness [0,1] (cluster only) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kSRHR_CL);
	 * CPointer&lt;Float&gt; p_kSRHR_CL = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kSRHR_CL'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kSRHR_CL = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'kSKHR_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs kinetic hardness [0,1] (cluster only) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kSKHR_CL);
	 * CPointer&lt;Float&gt; p_kSKHR_CL = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kSKHR_CL'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kSKHR_CL = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'kSSHR_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs soft hardness [0,1] (cluster only) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kSSHR_CL);
	 * CPointer&lt;Float&gt; p_kSSHR_CL = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kSSHR_CL'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kSSHR_CL = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'kSR_SPLT_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs rigid impulse split [0,1] (cluster only) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kSR_SPLT_CL);
	 * CPointer&lt;Float&gt; p_kSR_SPLT_CL = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kSR_SPLT_CL'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kSR_SPLT_CL = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'kSK_SPLT_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs rigid impulse split [0,1] (cluster only) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kSK_SPLT_CL);
	 * CPointer&lt;Float&gt; p_kSK_SPLT_CL = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kSK_SPLT_CL'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kSK_SPLT_CL = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'kSS_SPLT_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs rigid impulse split [0,1] (cluster only) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kSS_SPLT_CL);
	 * CPointer&lt;Float&gt; p_kSS_SPLT_CL = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kSS_SPLT_CL'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kSS_SPLT_CL = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'kVCF'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Velocities correction factor (Baumgarte) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kVCF);
	 * CPointer&lt;Float&gt; p_kVCF = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kVCF'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kVCF = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'kDP'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Damping coefficient [0,1] </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kDP);
	 * CPointer&lt;Float&gt; p_kDP = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kDP'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kDP = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'kDG'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Drag coefficient [0,+inf] </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kDG);
	 * CPointer&lt;Float&gt; p_kDG = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kDG'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kDG = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'kLF'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lift coefficient [0,+inf] </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kLF);
	 * CPointer&lt;Float&gt; p_kLF = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kLF'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kLF = new long[]{68, 68};

	/**
	 * Field descriptor (offset) for struct member 'kPR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pressure coefficient [-inf,+inf] </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kPR);
	 * CPointer&lt;Float&gt; p_kPR = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kPR'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kPR = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'kVC'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Volume conversation coefficient [0,+inf] </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kVC);
	 * CPointer&lt;Float&gt; p_kVC = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kVC'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kVC = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'kDF'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dynamic friction coefficient [0,1] </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kDF);
	 * CPointer&lt;Float&gt; p_kDF = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kDF'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kDF = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'kMT'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pose matching coefficient [0,1] </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kMT);
	 * CPointer&lt;Float&gt; p_kMT = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kMT'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kMT = new long[]{84, 84};

	/**
	 * Field descriptor (offset) for struct member 'kCHR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rigid contacts hardness [0,1] </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kCHR);
	 * CPointer&lt;Float&gt; p_kCHR = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kCHR'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kCHR = new long[]{88, 88};

	/**
	 * Field descriptor (offset) for struct member 'kKHR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Kinetic contacts hardness [0,1] </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kKHR);
	 * CPointer&lt;Float&gt; p_kKHR = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kKHR'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kKHR = new long[]{92, 92};

	/**
	 * Field descriptor (offset) for struct member 'kSHR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft contacts hardness [0,1] </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kSHR);
	 * CPointer&lt;Float&gt; p_kSHR = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kSHR'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kSHR = new long[]{96, 96};

	/**
	 * Field descriptor (offset) for struct member 'kAHR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Anchors hardness [0,1] </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__kAHR);
	 * CPointer&lt;Float&gt; p_kAHR = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'kAHR'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__kAHR = new long[]{100, 100};

	/**
	 * Field descriptor (offset) for struct member 'collisionflags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex/Face or Signed Distance Field(SDF) or Clusters, Soft versus Soft or Rigid </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__collisionflags);
	 * CPointer&lt;Integer&gt; p_collisionflags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'collisionflags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__collisionflags = new long[]{104, 104};

	/**
	 * Field descriptor (offset) for struct member 'numclusteriterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of iterations to refine collision clusters </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__numclusteriterations);
	 * CPointer&lt;Integer&gt; p_numclusteriterations = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'numclusteriterations'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__numclusteriterations = new long[]{108, 108};

	/**
	 * Field descriptor (offset) for struct member 'welding'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> welding limit to remove duplicate/nearby vertices, 0.0..0.01 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__welding);
	 * CPointer&lt;Float&gt; p_welding = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'welding'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__welding = new long[]{112, 112};

	/**
	 * Field descriptor (offset) for struct member 'margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> margin specific to softbody </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BulletSoftBody bulletsoftbody = ...;
	 * CPointer&lt;Object&gt; p = bulletsoftbody.__dna__addressof(BulletSoftBody.__DNA__FIELD__margin);
	 * CPointer&lt;Float&gt; p_margin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'margin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__margin = new long[]{116, 116};

	public BulletSoftBody(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BulletSoftBody(BulletSoftBody that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> various boolean options </p>
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
	 * <p> various boolean options </p>
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
	 * Get method for struct member 'linStiff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> linear stiffness 0..1 </p>
	 * @see #__DNA__FIELD__linStiff
	 */
	
	public float getLinStiff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'linStiff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> linear stiffness 0..1 </p>
	 * @see #__DNA__FIELD__linStiff
	 */
	
	public void setLinStiff(float linStiff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, linStiff);
		} else {
			__io__block.writeFloat(__io__address + 4, linStiff);
		}
	}

	/**
	 * Get method for struct member 'angStiff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angular stiffness 0..1 </p>
	 * @see #__DNA__FIELD__angStiff
	 */
	
	public float getAngStiff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'angStiff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angular stiffness 0..1 </p>
	 * @see #__DNA__FIELD__angStiff
	 */
	
	public void setAngStiff(float angStiff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, angStiff);
		} else {
			__io__block.writeFloat(__io__address + 8, angStiff);
		}
	}

	/**
	 * Get method for struct member 'volume'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> volume preservation 0..1 </p>
	 * @see #__DNA__FIELD__volume
	 */
	
	public float getVolume() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'volume'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> volume preservation 0..1 </p>
	 * @see #__DNA__FIELD__volume
	 */
	
	public void setVolume(float volume) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, volume);
		} else {
			__io__block.writeFloat(__io__address + 12, volume);
		}
	}

	/**
	 * Get method for struct member 'viterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Velocities solver iterations </p>
	 * @see #__DNA__FIELD__viterations
	 */
	
	public int getViterations() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'viterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Velocities solver iterations </p>
	 * @see #__DNA__FIELD__viterations
	 */
	
	public void setViterations(int viterations) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, viterations);
		} else {
			__io__block.writeInt(__io__address + 16, viterations);
		}
	}

	/**
	 * Get method for struct member 'piterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Positions solver iterations </p>
	 * @see #__DNA__FIELD__piterations
	 */
	
	public int getPiterations() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'piterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Positions solver iterations </p>
	 * @see #__DNA__FIELD__piterations
	 */
	
	public void setPiterations(int piterations) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, piterations);
		} else {
			__io__block.writeInt(__io__address + 20, piterations);
		}
	}

	/**
	 * Get method for struct member 'diterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Drift solver iterations </p>
	 * @see #__DNA__FIELD__diterations
	 */
	
	public int getDiterations() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'diterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Drift solver iterations </p>
	 * @see #__DNA__FIELD__diterations
	 */
	
	public void setDiterations(int diterations) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, diterations);
		} else {
			__io__block.writeInt(__io__address + 24, diterations);
		}
	}

	/**
	 * Get method for struct member 'citerations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cluster solver iterations </p>
	 * @see #__DNA__FIELD__citerations
	 */
	
	public int getCiterations() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'citerations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cluster solver iterations </p>
	 * @see #__DNA__FIELD__citerations
	 */
	
	public void setCiterations(int citerations) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, citerations);
		} else {
			__io__block.writeInt(__io__address + 28, citerations);
		}
	}

	/**
	 * Get method for struct member 'kSRHR_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs rigid hardness [0,1] (cluster only) </p>
	 * @see #__DNA__FIELD__kSRHR_CL
	 */
	
	public float getKSRHR_CL() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'kSRHR_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs rigid hardness [0,1] (cluster only) </p>
	 * @see #__DNA__FIELD__kSRHR_CL
	 */
	
	public void setKSRHR_CL(float kSRHR_CL) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, kSRHR_CL);
		} else {
			__io__block.writeFloat(__io__address + 32, kSRHR_CL);
		}
	}

	/**
	 * Get method for struct member 'kSKHR_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs kinetic hardness [0,1] (cluster only) </p>
	 * @see #__DNA__FIELD__kSKHR_CL
	 */
	
	public float getKSKHR_CL() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'kSKHR_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs kinetic hardness [0,1] (cluster only) </p>
	 * @see #__DNA__FIELD__kSKHR_CL
	 */
	
	public void setKSKHR_CL(float kSKHR_CL) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, kSKHR_CL);
		} else {
			__io__block.writeFloat(__io__address + 36, kSKHR_CL);
		}
	}

	/**
	 * Get method for struct member 'kSSHR_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs soft hardness [0,1] (cluster only) </p>
	 * @see #__DNA__FIELD__kSSHR_CL
	 */
	
	public float getKSSHR_CL() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'kSSHR_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs soft hardness [0,1] (cluster only) </p>
	 * @see #__DNA__FIELD__kSSHR_CL
	 */
	
	public void setKSSHR_CL(float kSSHR_CL) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, kSSHR_CL);
		} else {
			__io__block.writeFloat(__io__address + 40, kSSHR_CL);
		}
	}

	/**
	 * Get method for struct member 'kSR_SPLT_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs rigid impulse split [0,1] (cluster only) </p>
	 * @see #__DNA__FIELD__kSR_SPLT_CL
	 */
	
	public float getKSR_SPLT_CL() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'kSR_SPLT_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs rigid impulse split [0,1] (cluster only) </p>
	 * @see #__DNA__FIELD__kSR_SPLT_CL
	 */
	
	public void setKSR_SPLT_CL(float kSR_SPLT_CL) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, kSR_SPLT_CL);
		} else {
			__io__block.writeFloat(__io__address + 44, kSR_SPLT_CL);
		}
	}

	/**
	 * Get method for struct member 'kSK_SPLT_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs rigid impulse split [0,1] (cluster only) </p>
	 * @see #__DNA__FIELD__kSK_SPLT_CL
	 */
	
	public float getKSK_SPLT_CL() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'kSK_SPLT_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs rigid impulse split [0,1] (cluster only) </p>
	 * @see #__DNA__FIELD__kSK_SPLT_CL
	 */
	
	public void setKSK_SPLT_CL(float kSK_SPLT_CL) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, kSK_SPLT_CL);
		} else {
			__io__block.writeFloat(__io__address + 48, kSK_SPLT_CL);
		}
	}

	/**
	 * Get method for struct member 'kSS_SPLT_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs rigid impulse split [0,1] (cluster only) </p>
	 * @see #__DNA__FIELD__kSS_SPLT_CL
	 */
	
	public float getKSS_SPLT_CL() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'kSS_SPLT_CL'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft vs rigid impulse split [0,1] (cluster only) </p>
	 * @see #__DNA__FIELD__kSS_SPLT_CL
	 */
	
	public void setKSS_SPLT_CL(float kSS_SPLT_CL) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, kSS_SPLT_CL);
		} else {
			__io__block.writeFloat(__io__address + 52, kSS_SPLT_CL);
		}
	}

	/**
	 * Get method for struct member 'kVCF'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Velocities correction factor (Baumgarte) </p>
	 * @see #__DNA__FIELD__kVCF
	 */
	
	public float getKVCF() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'kVCF'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Velocities correction factor (Baumgarte) </p>
	 * @see #__DNA__FIELD__kVCF
	 */
	
	public void setKVCF(float kVCF) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, kVCF);
		} else {
			__io__block.writeFloat(__io__address + 56, kVCF);
		}
	}

	/**
	 * Get method for struct member 'kDP'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Damping coefficient [0,1] </p>
	 * @see #__DNA__FIELD__kDP
	 */
	
	public float getKDP() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'kDP'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Damping coefficient [0,1] </p>
	 * @see #__DNA__FIELD__kDP
	 */
	
	public void setKDP(float kDP) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, kDP);
		} else {
			__io__block.writeFloat(__io__address + 60, kDP);
		}
	}

	/**
	 * Get method for struct member 'kDG'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Drag coefficient [0,+inf] </p>
	 * @see #__DNA__FIELD__kDG
	 */
	
	public float getKDG() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'kDG'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Drag coefficient [0,+inf] </p>
	 * @see #__DNA__FIELD__kDG
	 */
	
	public void setKDG(float kDG) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, kDG);
		} else {
			__io__block.writeFloat(__io__address + 64, kDG);
		}
	}

	/**
	 * Get method for struct member 'kLF'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lift coefficient [0,+inf] </p>
	 * @see #__DNA__FIELD__kLF
	 */
	
	public float getKLF() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'kLF'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Lift coefficient [0,+inf] </p>
	 * @see #__DNA__FIELD__kLF
	 */
	
	public void setKLF(float kLF) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, kLF);
		} else {
			__io__block.writeFloat(__io__address + 68, kLF);
		}
	}

	/**
	 * Get method for struct member 'kPR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pressure coefficient [-inf,+inf] </p>
	 * @see #__DNA__FIELD__kPR
	 */
	
	public float getKPR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'kPR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pressure coefficient [-inf,+inf] </p>
	 * @see #__DNA__FIELD__kPR
	 */
	
	public void setKPR(float kPR) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, kPR);
		} else {
			__io__block.writeFloat(__io__address + 72, kPR);
		}
	}

	/**
	 * Get method for struct member 'kVC'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Volume conversation coefficient [0,+inf] </p>
	 * @see #__DNA__FIELD__kVC
	 */
	
	public float getKVC() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'kVC'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Volume conversation coefficient [0,+inf] </p>
	 * @see #__DNA__FIELD__kVC
	 */
	
	public void setKVC(float kVC) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, kVC);
		} else {
			__io__block.writeFloat(__io__address + 76, kVC);
		}
	}

	/**
	 * Get method for struct member 'kDF'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dynamic friction coefficient [0,1] </p>
	 * @see #__DNA__FIELD__kDF
	 */
	
	public float getKDF() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'kDF'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dynamic friction coefficient [0,1] </p>
	 * @see #__DNA__FIELD__kDF
	 */
	
	public void setKDF(float kDF) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, kDF);
		} else {
			__io__block.writeFloat(__io__address + 80, kDF);
		}
	}

	/**
	 * Get method for struct member 'kMT'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pose matching coefficient [0,1] </p>
	 * @see #__DNA__FIELD__kMT
	 */
	
	public float getKMT() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'kMT'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pose matching coefficient [0,1] </p>
	 * @see #__DNA__FIELD__kMT
	 */
	
	public void setKMT(float kMT) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, kMT);
		} else {
			__io__block.writeFloat(__io__address + 84, kMT);
		}
	}

	/**
	 * Get method for struct member 'kCHR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rigid contacts hardness [0,1] </p>
	 * @see #__DNA__FIELD__kCHR
	 */
	
	public float getKCHR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'kCHR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rigid contacts hardness [0,1] </p>
	 * @see #__DNA__FIELD__kCHR
	 */
	
	public void setKCHR(float kCHR) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, kCHR);
		} else {
			__io__block.writeFloat(__io__address + 88, kCHR);
		}
	}

	/**
	 * Get method for struct member 'kKHR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Kinetic contacts hardness [0,1] </p>
	 * @see #__DNA__FIELD__kKHR
	 */
	
	public float getKKHR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'kKHR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Kinetic contacts hardness [0,1] </p>
	 * @see #__DNA__FIELD__kKHR
	 */
	
	public void setKKHR(float kKHR) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, kKHR);
		} else {
			__io__block.writeFloat(__io__address + 92, kKHR);
		}
	}

	/**
	 * Get method for struct member 'kSHR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft contacts hardness [0,1] </p>
	 * @see #__DNA__FIELD__kSHR
	 */
	
	public float getKSHR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'kSHR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Soft contacts hardness [0,1] </p>
	 * @see #__DNA__FIELD__kSHR
	 */
	
	public void setKSHR(float kSHR) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, kSHR);
		} else {
			__io__block.writeFloat(__io__address + 96, kSHR);
		}
	}

	/**
	 * Get method for struct member 'kAHR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Anchors hardness [0,1] </p>
	 * @see #__DNA__FIELD__kAHR
	 */
	
	public float getKAHR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'kAHR'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Anchors hardness [0,1] </p>
	 * @see #__DNA__FIELD__kAHR
	 */
	
	public void setKAHR(float kAHR) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, kAHR);
		} else {
			__io__block.writeFloat(__io__address + 100, kAHR);
		}
	}

	/**
	 * Get method for struct member 'collisionflags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex/Face or Signed Distance Field(SDF) or Clusters, Soft versus Soft or Rigid </p>
	 * @see #__DNA__FIELD__collisionflags
	 */
	
	public int getCollisionflags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 104);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'collisionflags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex/Face or Signed Distance Field(SDF) or Clusters, Soft versus Soft or Rigid </p>
	 * @see #__DNA__FIELD__collisionflags
	 */
	
	public void setCollisionflags(int collisionflags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 104, collisionflags);
		} else {
			__io__block.writeInt(__io__address + 104, collisionflags);
		}
	}

	/**
	 * Get method for struct member 'numclusteriterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of iterations to refine collision clusters </p>
	 * @see #__DNA__FIELD__numclusteriterations
	 */
	
	public int getNumclusteriterations() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 108);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'numclusteriterations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of iterations to refine collision clusters </p>
	 * @see #__DNA__FIELD__numclusteriterations
	 */
	
	public void setNumclusteriterations(int numclusteriterations) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 108, numclusteriterations);
		} else {
			__io__block.writeInt(__io__address + 108, numclusteriterations);
		}
	}

	/**
	 * Get method for struct member 'welding'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> welding limit to remove duplicate/nearby vertices, 0.0..0.01 </p>
	 * @see #__DNA__FIELD__welding
	 */
	
	public float getWelding() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'welding'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> welding limit to remove duplicate/nearby vertices, 0.0..0.01 </p>
	 * @see #__DNA__FIELD__welding
	 */
	
	public void setWelding(float welding) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, welding);
		} else {
			__io__block.writeFloat(__io__address + 112, welding);
		}
	}

	/**
	 * Get method for struct member 'margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> margin specific to softbody </p>
	 * @see #__DNA__FIELD__margin
	 */
	
	public float getMargin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> margin specific to softbody </p>
	 * @see #__DNA__FIELD__margin
	 */
	
	public void setMargin(float margin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, margin);
		} else {
			__io__block.writeFloat(__io__address + 116, margin);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BulletSoftBody> __io__addressof() {
		return new CPointer<BulletSoftBody>(__io__address, new Class[]{BulletSoftBody.class}, __io__block, __io__blockTable);
	}

}
