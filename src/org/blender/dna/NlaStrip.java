package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NlaStrip'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  'Action' Datatypes NOTE: Although these are part of the Animation System, they are not stored here... see {@link DNA_action_types.h}  instead************************************************ NLA - Non-Linear Animation NLA Strips -------------------------------<mdash/><mdash/>  NLA {@link Strip}  (strip)</p><p> A NLA {@link Strip}  is a container for the reuse of Action data, defining parameters to control the remapping of the Action data to some destination. </p>
 */

@CMetaData(size32=168, size64=216)
public class NlaStrip extends CFacade {

	/**
	 * This is the sdna index of the struct NlaStrip.
	 * <p>
	 * It is required when allocating a new block to store data for NlaStrip.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 528;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;NlaStrip&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, NlaStrip.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'NlaStrip*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;NlaStrip&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, NlaStrip.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'NlaStrip*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'strips'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    NLA Strips that this strip acts as a container for (if it is of type Meta)<h4>Blender Source Code:</h4>
	 * <p> 'Child' strips (used for 'meta' strips). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__strips);
	 * CPointer&lt;ListBase&gt; p_strips = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strips'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strips = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'act'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Action that is referenced by this strip (strip is 'user' of the action). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__act);
	 * CPointer&lt;CPointer&lt;bAction&gt;&gt; p_act = p.cast(new Class[]{CPointer.class, bAction.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act'</li>
	 * <li>Signature: 'bAction*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'fcurves'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    F-Curves for controlling the strip's influence and timing<h4>Blender Source Code:</h4>
	 * <p> TODO: move o.ut? </p><p> F-Curves for controlling this strip's influence and timing </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__fcurves);
	 * CPointer&lt;ListBase&gt; p_fcurves = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fcurves'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fcurves = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Modifiers affecting all the F-Curves in the referenced Action<h4>Blender Source Code:</h4>
	 * <p> F-Curve modifiers to be applied to the entire strip's referenced F-Curves. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__modifiers);
	 * CPointer&lt;ListBase&gt; p_modifiers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifiers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifiers = new long[]{28, 56};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-Visible Identifier for {@link Strip}  - MAX_ID_NAME-2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{36, 72};

	/**
	 * Field descriptor (offset) for struct member 'influence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount the strip contributes to the current result<h4>Blender Source Code:</h4>
	 * <p> Influence of strip. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__influence);
	 * CPointer&lt;Float&gt; p_influence = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'influence'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__influence = new long[]{100, 136};

	/**
	 * Field descriptor (offset) for struct member 'strip_time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frame of referenced Action to evaluate<h4>Blender Source Code:</h4>
	 * <p> Current 'time' within action being used (automatically evaluated, but can be overridden). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__strip_time);
	 * CPointer&lt;Float&gt; p_strip_time = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strip_time'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strip_time = new long[]{104, 140};

	/**
	 * Field descriptor (offset) for struct member 'start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Extents of the strip. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__start);
	 * CPointer&lt;Float&gt; p_start = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'start'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__start = new long[]{108, 144};

	/**
	 * Field descriptor (offset) for struct member 'end'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__end);
	 * CPointer&lt;Float&gt; p_end = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'end'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__end = new long[]{112, 148};

	/**
	 * Field descriptor (offset) for struct member 'actstart'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Range of the action to use. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__actstart);
	 * CPointer&lt;Float&gt; p_actstart = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actstart'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actstart = new long[]{116, 152};

	/**
	 * Field descriptor (offset) for struct member 'actend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__actend);
	 * CPointer&lt;Float&gt; p_actend = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actend'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actend = new long[]{120, 156};

	/**
	 * Field descriptor (offset) for struct member 'repeat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of times to repeat the action range<h4>Blender Source Code:</h4>
	 * <p> The number of times to repeat the action range (only when no F-Curves). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__repeat);
	 * CPointer&lt;Float&gt; p_repeat = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'repeat'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__repeat = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scaling factor for action<h4>Blender Source Code:</h4>
	 * <p> The amount the action range is scaled by (only when no F-Curves). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__scale);
	 * CPointer&lt;Float&gt; p_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale = new long[]{128, 164};

	/**
	 * Field descriptor (offset) for struct member 'blendin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Strip}  blending length (only used when there are no F-Curves). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__blendin);
	 * CPointer&lt;Float&gt; p_blendin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blendin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blendin = new long[]{132, 168};

	/**
	 * Field descriptor (offset) for struct member 'blendout'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__blendout);
	 * CPointer&lt;Float&gt; p_blendout = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blendout'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blendout = new long[]{136, 172};

	/**
	 * Field descriptor (offset) for struct member 'blendmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Strip}  blending mode (layer-based mixing). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__blendmode);
	 * CPointer&lt;Short&gt; p_blendmode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blendmode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blendmode = new long[]{140, 176};

	/**
	 * Field descriptor (offset) for struct member 'extendmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Strip}  extrapolation mode (time-based mixing). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__extendmode);
	 * CPointer&lt;Short&gt; p_extendmode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'extendmode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__extendmode = new long[]{142, 178};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{144, 180};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Type of NLA Strip<h4>Blender Source Code:</h4>
	 * <p> Type of NLA strip. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{146, 182};

	/**
	 * Field descriptor (offset) for struct member 'speaker_handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Handle for speaker objects. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__speaker_handle);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_speaker_handle = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'speaker_handle'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__speaker_handle = new long[]{148, 184};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{152, 192};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{156, 196};

	/**
	 * Field descriptor (offset) for struct member 'orig_strip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to an original NLA strip. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD__orig_strip);
	 * CPointer&lt;CPointer&lt;NlaStrip&gt;&gt; p_orig_strip = p.cast(new Class[]{CPointer.class, NlaStrip.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orig_strip'</li>
	 * <li>Signature: 'NlaStrip*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orig_strip = new long[]{160, 200};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NlaStrip nlastrip = ...;
	 * CPointer&lt;Object&gt; p = nlastrip.__dna__addressof(NlaStrip.__DNA__FIELD___pad3);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad3 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{164, 208};

	public NlaStrip(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NlaStrip(NlaStrip that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<NlaStrip> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{NlaStrip.class};
		return new CPointer<NlaStrip>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, NlaStrip.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<NlaStrip> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<NlaStrip> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{NlaStrip.class};
		return new CPointer<NlaStrip>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, NlaStrip.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<NlaStrip> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'strips'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    NLA Strips that this strip acts as a container for (if it is of type Meta)<h4>Blender Source Code:</h4>
	 * <p> 'Child' strips (used for 'meta' strips). </p>
	 * @see #__DNA__FIELD__strips
	 */
	
	public ListBase getStrips() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'strips'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    NLA Strips that this strip acts as a container for (if it is of type Meta)<h4>Blender Source Code:</h4>
	 * <p> 'Child' strips (used for 'meta' strips). </p>
	 * @see #__DNA__FIELD__strips
	 */
	
	public void setStrips(ListBase strips) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(strips, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, strips)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, strips);
		} else {
			__io__generic__copy( getStrips(), strips);
		}
	}

	/**
	 * Get method for struct member 'act'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Action that is referenced by this strip (strip is 'user' of the action). </p>
	 * @see #__DNA__FIELD__act
	 */
	
	public CPointer<bAction> getAct() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bAction.class};
		return new CPointer<bAction>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bAction.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Action that is referenced by this strip (strip is 'user' of the action). </p>
	 * @see #__DNA__FIELD__act
	 */
	
	public void setAct(CPointer<bAction> act) throws IOException
	{
		long __address = ((act == null) ? 0 : act.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'fcurves'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    F-Curves for controlling the strip's influence and timing<h4>Blender Source Code:</h4>
	 * <p> TODO: move o.ut? </p><p> F-Curves for controlling this strip's influence and timing </p>
	 * @see #__DNA__FIELD__fcurves
	 */
	
	public ListBase getFcurves() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 40, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 20, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fcurves'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    F-Curves for controlling the strip's influence and timing<h4>Blender Source Code:</h4>
	 * <p> TODO: move o.ut? </p><p> F-Curves for controlling this strip's influence and timing </p>
	 * @see #__DNA__FIELD__fcurves
	 */
	
	public void setFcurves(ListBase fcurves) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(fcurves, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fcurves)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fcurves);
		} else {
			__io__generic__copy( getFcurves(), fcurves);
		}
	}

	/**
	 * Get method for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Modifiers affecting all the F-Curves in the referenced Action<h4>Blender Source Code:</h4>
	 * <p> F-Curve modifiers to be applied to the entire strip's referenced F-Curves. </p>
	 * @see #__DNA__FIELD__modifiers
	 */
	
	public ListBase getModifiers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 56, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 28, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Modifiers affecting all the F-Curves in the referenced Action<h4>Blender Source Code:</h4>
	 * <p> F-Curve modifiers to be applied to the entire strip's referenced F-Curves. </p>
	 * @see #__DNA__FIELD__modifiers
	 */
	
	public void setModifiers(ListBase modifiers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(modifiers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifiers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifiers);
		} else {
			__io__generic__copy( getModifiers(), modifiers);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-Visible Identifier for {@link Strip}  - MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-Visible Identifier for {@link Strip}  - MAX_ID_NAME-2. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'influence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount the strip contributes to the current result<h4>Blender Source Code:</h4>
	 * <p> Influence of strip. </p>
	 * @see #__DNA__FIELD__influence
	 */
	
	public float getInfluence() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 136);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'influence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount the strip contributes to the current result<h4>Blender Source Code:</h4>
	 * <p> Influence of strip. </p>
	 * @see #__DNA__FIELD__influence
	 */
	
	public void setInfluence(float influence) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 136, influence);
		} else {
			__io__block.writeFloat(__io__address + 100, influence);
		}
	}

	/**
	 * Get method for struct member 'strip_time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frame of referenced Action to evaluate<h4>Blender Source Code:</h4>
	 * <p> Current 'time' within action being used (automatically evaluated, but can be overridden). </p>
	 * @see #__DNA__FIELD__strip_time
	 */
	
	public float getStrip_time() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'strip_time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frame of referenced Action to evaluate<h4>Blender Source Code:</h4>
	 * <p> Current 'time' within action being used (automatically evaluated, but can be overridden). </p>
	 * @see #__DNA__FIELD__strip_time
	 */
	
	public void setStrip_time(float strip_time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, strip_time);
		} else {
			__io__block.writeFloat(__io__address + 104, strip_time);
		}
	}

	/**
	 * Get method for struct member 'start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Extents of the strip. </p>
	 * @see #__DNA__FIELD__start
	 */
	
	public float getStart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Extents of the strip. </p>
	 * @see #__DNA__FIELD__start
	 */
	
	public void setStart(float start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, start);
		} else {
			__io__block.writeFloat(__io__address + 108, start);
		}
	}

	/**
	 * Get method for struct member 'end'.
	 * @see #__DNA__FIELD__end
	 */
	
	public float getEnd() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'end'.
	 * @see #__DNA__FIELD__end
	 */
	
	public void setEnd(float end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, end);
		} else {
			__io__block.writeFloat(__io__address + 112, end);
		}
	}

	/**
	 * Get method for struct member 'actstart'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Range of the action to use. </p>
	 * @see #__DNA__FIELD__actstart
	 */
	
	public float getActstart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'actstart'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Range of the action to use. </p>
	 * @see #__DNA__FIELD__actstart
	 */
	
	public void setActstart(float actstart) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, actstart);
		} else {
			__io__block.writeFloat(__io__address + 116, actstart);
		}
	}

	/**
	 * Get method for struct member 'actend'.
	 * @see #__DNA__FIELD__actend
	 */
	
	public float getActend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'actend'.
	 * @see #__DNA__FIELD__actend
	 */
	
	public void setActend(float actend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, actend);
		} else {
			__io__block.writeFloat(__io__address + 120, actend);
		}
	}

	/**
	 * Get method for struct member 'repeat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of times to repeat the action range<h4>Blender Source Code:</h4>
	 * <p> The number of times to repeat the action range (only when no F-Curves). </p>
	 * @see #__DNA__FIELD__repeat
	 */
	
	public float getRepeat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'repeat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of times to repeat the action range<h4>Blender Source Code:</h4>
	 * <p> The number of times to repeat the action range (only when no F-Curves). </p>
	 * @see #__DNA__FIELD__repeat
	 */
	
	public void setRepeat(float repeat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, repeat);
		} else {
			__io__block.writeFloat(__io__address + 124, repeat);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scaling factor for action<h4>Blender Source Code:</h4>
	 * <p> The amount the action range is scaled by (only when no F-Curves). </p>
	 * @see #__DNA__FIELD__scale
	 */
	
	public float getScale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scaling factor for action<h4>Blender Source Code:</h4>
	 * <p> The amount the action range is scaled by (only when no F-Curves). </p>
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(float scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, scale);
		} else {
			__io__block.writeFloat(__io__address + 128, scale);
		}
	}

	/**
	 * Get method for struct member 'blendin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Strip}  blending length (only used when there are no F-Curves). </p>
	 * @see #__DNA__FIELD__blendin
	 */
	
	public float getBlendin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'blendin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Strip}  blending length (only used when there are no F-Curves). </p>
	 * @see #__DNA__FIELD__blendin
	 */
	
	public void setBlendin(float blendin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, blendin);
		} else {
			__io__block.writeFloat(__io__address + 132, blendin);
		}
	}

	/**
	 * Get method for struct member 'blendout'.
	 * @see #__DNA__FIELD__blendout
	 */
	
	public float getBlendout() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'blendout'.
	 * @see #__DNA__FIELD__blendout
	 */
	
	public void setBlendout(float blendout) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, blendout);
		} else {
			__io__block.writeFloat(__io__address + 136, blendout);
		}
	}

	/**
	 * Get method for struct member 'blendmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Strip}  blending mode (layer-based mixing). </p>
	 * @see #__DNA__FIELD__blendmode
	 */
	
	public short getBlendmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 176);
		} else {
			return __io__block.readShort(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'blendmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Strip}  blending mode (layer-based mixing). </p>
	 * @see #__DNA__FIELD__blendmode
	 */
	
	public void setBlendmode(short blendmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 176, blendmode);
		} else {
			__io__block.writeShort(__io__address + 140, blendmode);
		}
	}

	/**
	 * Get method for struct member 'extendmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Strip}  extrapolation mode (time-based mixing). </p>
	 * @see #__DNA__FIELD__extendmode
	 */
	
	public short getExtendmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 178);
		} else {
			return __io__block.readShort(__io__address + 142);
		}
	}

	/**
	 * Set method for struct member 'extendmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Strip}  extrapolation mode (time-based mixing). </p>
	 * @see #__DNA__FIELD__extendmode
	 */
	
	public void setExtendmode(short extendmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 178, extendmode);
		} else {
			__io__block.writeShort(__io__address + 142, extendmode);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 180;
		} else {
			__dna__offset = 144;
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
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Type of NLA Strip<h4>Blender Source Code:</h4>
	 * <p> Type of NLA strip. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 182);
		} else {
			return __io__block.readShort(__io__address + 146);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Type of NLA Strip<h4>Blender Source Code:</h4>
	 * <p> Type of NLA strip. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 182, type);
		} else {
			__io__block.writeShort(__io__address + 146, type);
		}
	}

	/**
	 * Get method for struct member 'speaker_handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Handle for speaker objects. </p>
	 * @see #__DNA__FIELD__speaker_handle
	 */
	
	public CPointer<Object> getSpeaker_handle() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'speaker_handle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Handle for speaker objects. </p>
	 * @see #__DNA__FIELD__speaker_handle
	 */
	
	public void setSpeaker_handle(CPointer<Object> speaker_handle) throws IOException
	{
		long __address = ((speaker_handle == null) ? 0 : speaker_handle.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 148, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 192);
		} else {
			return __io__block.readInt(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 192, flag);
		} else {
			__io__block.writeInt(__io__address + 152, flag);
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
			return new CArrayFacade<Byte>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 156;
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
	 * Get method for struct member 'orig_strip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to an original NLA strip. </p>
	 * @see #__DNA__FIELD__orig_strip
	 */
	
	public CPointer<NlaStrip> getOrig_strip() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		}
		Class<?>[] __dna__targetTypes = new Class[]{NlaStrip.class};
		return new CPointer<NlaStrip>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, NlaStrip.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'orig_strip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to an original NLA strip. </p>
	 * @see #__DNA__FIELD__orig_strip
	 */
	
	public void setOrig_strip(CPointer<NlaStrip> orig_strip) throws IOException
	{
		long __address = ((orig_strip == null) ? 0 : orig_strip.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 160, __address);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CPointer<Object> get_pad3() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 164);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CPointer<Object> _pad3) throws IOException
	{
		long __address = ((_pad3 == null) ? 0 : _pad3.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 164, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NlaStrip> __io__addressof() {
		return new CPointer<NlaStrip>(__io__address, new Class[]{NlaStrip.class}, __io__block, __io__blockTable);
	}

}
