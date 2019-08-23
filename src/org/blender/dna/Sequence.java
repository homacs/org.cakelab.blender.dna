package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Sequence'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> The sequence structure is the basic struct used by any strip. each of the strips uses a different sequence structure.</p><p><h2>Warning</h2><p> The first part identical to {@link ID}  (for use in ipo's) the comment above is historic, probably we can drop the {@link ID}  compatibility, but take care making this change.</p> The first part identical to ID (for use in ipo's) the comment above is historic, probably we can drop the ID compatibility, but take care making this change.
 * <h2>Warning</h2><p> This is really a '{@link Strip} ' in the UI!, name is highly confusing. </p> This is really a 'Strip' in the UI!, name is highly confusing. 
 * </p>
 */

@CMetaData(size32=304, size64=408)
public class Sequence extends CFacade {

	/**
	 * This is the sdna index of the struct Sequence.
	 * <p>
	 * It is required when allocating a new block to store data for Sequence.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 280;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;Sequence&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, Sequence.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'Sequence*'</li>
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
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;Sequence&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, Sequence.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'Sequence*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'tmp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tmp var for copying, and tagging for linked selection. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__tmp);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tmp = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tmp'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tmp = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'lib'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Needed (to be like ipo), else it will raise libdata warnings, this should never be used. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__lib);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_lib = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lib'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lib = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> SEQ_NAME_MAXSTR - name, set by default and needs to be unique, for RNA paths. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags bitmap (see below) and the type of sequence. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{80, 96};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__type);
	 * CPointer&lt;Integer&gt; p_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{84, 100};

	/**
	 * Field descriptor (offset) for struct member 'len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The length of the contents of this strip - before handles are applied. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__len);
	 * CPointer&lt;Integer&gt; p_len = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'len'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__len = new long[]{88, 104};

	/**
	 * Field descriptor (offset) for struct member 'start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start frame of contents of strip in absolute frame coordinates. For metastrips start of first strip startdisp. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__start);
	 * CPointer&lt;Integer&gt; p_start = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'start'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__start = new long[]{92, 108};

	/**
	 * Field descriptor (offset) for struct member 'startofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Frames after the first frame where display starts, frames before the last frame where display ends. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__startofs);
	 * CPointer&lt;Integer&gt; p_startofs = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'startofs'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__startofs = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'endofs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__endofs);
	 * CPointer&lt;Integer&gt; p_endofs = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'endofs'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__endofs = new long[]{100, 116};

	/**
	 * Field descriptor (offset) for struct member 'startstill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Frames that use the first frame before data begins, frames that use the last frame after data ends. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__startstill);
	 * CPointer&lt;Integer&gt; p_startstill = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'startstill'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__startstill = new long[]{104, 120};

	/**
	 * Field descriptor (offset) for struct member 'endstill'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__endstill);
	 * CPointer&lt;Integer&gt; p_endstill = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'endstill'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__endstill = new long[]{108, 124};

	/**
	 * Field descriptor (offset) for struct member 'machine'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Machine: the strip channel, depth the depth in the sequence when dealing with metastrips. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__machine);
	 * CPointer&lt;Integer&gt; p_machine = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'machine'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__machine = new long[]{112, 128};

	/**
	 * Field descriptor (offset) for struct member 'depth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__depth);
	 * CPointer&lt;Integer&gt; p_depth = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'depth'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__depth = new long[]{116, 132};

	/**
	 * Field descriptor (offset) for struct member 'startdisp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Starting and ending points of the strip in the sequence. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__startdisp);
	 * CPointer&lt;Integer&gt; p_startdisp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'startdisp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__startdisp = new long[]{120, 136};

	/**
	 * Field descriptor (offset) for struct member 'enddisp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__enddisp);
	 * CPointer&lt;Integer&gt; p_enddisp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'enddisp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__enddisp = new long[]{124, 140};

	/**
	 * Field descriptor (offset) for struct member 'sat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__sat);
	 * CPointer&lt;Float&gt; p_sat = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sat'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sat = new long[]{128, 144};

	/**
	 * Field descriptor (offset) for struct member 'mul'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__mul);
	 * CPointer&lt;Float&gt; p_mul = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mul'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mul = new long[]{132, 148};

	/**
	 * Field descriptor (offset) for struct member 'handsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__handsize);
	 * CPointer&lt;Float&gt; p_handsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handsize = new long[]{136, 152};

	/**
	 * Field descriptor (offset) for struct member 'anim_preseek'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__anim_preseek);
	 * CPointer&lt;Short&gt; p_anim_preseek = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anim_preseek'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anim_preseek = new long[]{140, 156};

	/**
	 * Field descriptor (offset) for struct member 'streamindex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Streamindex for movie or sound files with several streams. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__streamindex);
	 * CPointer&lt;Short&gt; p_streamindex = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'streamindex'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__streamindex = new long[]{142, 158};

	/**
	 * Field descriptor (offset) for struct member 'multicam_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For multicam source selection. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__multicam_source);
	 * CPointer&lt;Integer&gt; p_multicam_source = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'multicam_source'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__multicam_source = new long[]{144, 160};

	/**
	 * Field descriptor (offset) for struct member 'clip_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MOVIECLIP render flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__clip_flag);
	 * CPointer&lt;Integer&gt; p_clip_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clip_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clip_flag = new long[]{148, 164};

	/**
	 * Field descriptor (offset) for struct member 'strip'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__strip);
	 * CPointer&lt;CPointer&lt;Strip&gt;&gt; p_strip = p.cast(new Class[]{CPointer.class, Strip.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strip'</li>
	 * <li>Signature: 'Strip*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strip = new long[]{152, 168};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{156, 176};

	/**
	 * Field descriptor (offset) for struct member 'scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> these {@link ID}  vars should never be NULL but can be when linked libs fail to load, so check on access </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__scene);
	 * CPointer&lt;CPointer&lt;Scene&gt;&gt; p_scene = p.cast(new Class[]{CPointer.class, Scene.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scene'</li>
	 * <li>Signature: 'Scene*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scene = new long[]{160, 184};

	/**
	 * Field descriptor (offset) for struct member 'scene_camera'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Override scene camera. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__scene_camera);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_scene_camera = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scene_camera'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scene_camera = new long[]{164, 192};

	/**
	 * Field descriptor (offset) for struct member 'clip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For MOVIECLIP strips. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__clip);
	 * CPointer&lt;CPointer&lt;MovieClip&gt;&gt; p_clip = p.cast(new Class[]{CPointer.class, MovieClip.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clip'</li>
	 * <li>Signature: 'MovieClip*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clip = new long[]{168, 200};

	/**
	 * Field descriptor (offset) for struct member 'mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For MASK strips. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__mask);
	 * CPointer&lt;CPointer&lt;Mask&gt;&gt; p_mask = p.cast(new Class[]{CPointer.class, Mask.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask'</li>
	 * <li>Signature: 'Mask*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask = new long[]{172, 208};

	/**
	 * Field descriptor (offset) for struct member 'anims'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For MOVIE strips. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__anims);
	 * CPointer&lt;ListBase&gt; p_anims = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anims'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anims = new long[]{176, 216};

	/**
	 * Field descriptor (offset) for struct member 'effect_fader'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Custom fade value
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__effect_fader);
	 * CPointer&lt;Float&gt; p_effect_fader = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effect_fader'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effect_fader = new long[]{184, 232};

	/**
	 * Field descriptor (offset) for struct member 'speed_fader'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__speed_fader);
	 * CPointer&lt;Float&gt; p_speed_fader = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'speed_fader'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__speed_fader = new long[]{188, 236};

	/**
	 * Field descriptor (offset) for struct member 'seq1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> pointers for effects: </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__seq1);
	 * CPointer&lt;CPointer&lt;Sequence&gt;&gt; p_seq1 = p.cast(new Class[]{CPointer.class, Sequence.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seq1'</li>
	 * <li>Signature: 'Sequence*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seq1 = new long[]{192, 240};

	/**
	 * Field descriptor (offset) for struct member 'seq2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__seq2);
	 * CPointer&lt;CPointer&lt;Sequence&gt;&gt; p_seq2 = p.cast(new Class[]{CPointer.class, Sequence.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seq2'</li>
	 * <li>Signature: 'Sequence*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seq2 = new long[]{196, 248};

	/**
	 * Field descriptor (offset) for struct member 'seq3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__seq3);
	 * CPointer&lt;CPointer&lt;Sequence&gt;&gt; p_seq3 = p.cast(new Class[]{CPointer.class, Sequence.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seq3'</li>
	 * <li>Signature: 'Sequence*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seq3 = new long[]{200, 256};

	/**
	 * Field descriptor (offset) for struct member 'seqbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of strips for metastrips. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__seqbase);
	 * CPointer&lt;ListBase&gt; p_seqbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seqbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seqbase = new long[]{204, 264};

	/**
	 * Field descriptor (offset) for struct member 'sound'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The linked "bSound" object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__sound);
	 * CPointer&lt;CPointer&lt;bSound&gt;&gt; p_sound = p.cast(new Class[]{CPointer.class, bSound.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sound'</li>
	 * <li>Signature: 'bSound*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sound = new long[]{212, 280};

	/**
	 * Field descriptor (offset) for struct member 'scene_sound'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__scene_sound);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_scene_sound = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scene_sound'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scene_sound = new long[]{216, 288};

	/**
	 * Field descriptor (offset) for struct member 'volume'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__volume);
	 * CPointer&lt;Float&gt; p_volume = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volume'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volume = new long[]{220, 296};

	/**
	 * Field descriptor (offset) for struct member 'pitch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pitch (-0.1..10), pan -2..2. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__pitch);
	 * CPointer&lt;Float&gt; p_pitch = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pitch'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pitch = new long[]{224, 300};

	/**
	 * Field descriptor (offset) for struct member 'pan'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__pan);
	 * CPointer&lt;Float&gt; p_pan = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pan'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pan = new long[]{228, 304};

	/**
	 * Field descriptor (offset) for struct member 'strobe'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__strobe);
	 * CPointer&lt;Float&gt; p_strobe = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strobe'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strobe = new long[]{232, 308};

	/**
	 * Field descriptor (offset) for struct member 'effectdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Struct pointer for effect settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__effectdata);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_effectdata = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effectdata'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effectdata = new long[]{236, 312};

	/**
	 * Field descriptor (offset) for struct member 'anim_startofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only use part of animation file. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__anim_startofs);
	 * CPointer&lt;Integer&gt; p_anim_startofs = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anim_startofs'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anim_startofs = new long[]{240, 320};

	/**
	 * Field descriptor (offset) for struct member 'anim_endofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Is subtle different to startofs / endofs. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__anim_endofs);
	 * CPointer&lt;Integer&gt; p_anim_endofs = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anim_endofs'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anim_endofs = new long[]{244, 324};

	/**
	 * Field descriptor (offset) for struct member 'blend_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__blend_mode);
	 * CPointer&lt;Integer&gt; p_blend_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_mode = new long[]{248, 328};

	/**
	 * Field descriptor (offset) for struct member 'blend_opacity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__blend_opacity);
	 * CPointer&lt;Float&gt; p_blend_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blend_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blend_opacity = new long[]{252, 332};

	/**
	 * Field descriptor (offset) for struct member 'sfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> is sfra needed anymore? - it looks like its only used in one place Starting frame according to the timeline of the scene. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__sfra);
	 * CPointer&lt;Integer&gt; p_sfra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sfra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sfra = new long[]{256, 336};

	/**
	 * Field descriptor (offset) for struct member 'alpha_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__alpha_mode);
	 * CPointer&lt;Byte&gt; p_alpha_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha_mode = new long[]{260, 340};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{261, 341};

	/**
	 * Field descriptor (offset) for struct member 'views_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiview </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__views_format);
	 * CPointer&lt;Byte&gt; p_views_format = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'views_format'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__views_format = new long[]{263, 343};

	/**
	 * Field descriptor (offset) for struct member 'stereo3d_format'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__stereo3d_format);
	 * CPointer&lt;CPointer&lt;Stereo3dFormat&gt;&gt; p_stereo3d_format = p.cast(new Class[]{CPointer.class, Stereo3dFormat.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stereo3d_format'</li>
	 * <li>Signature: 'Stereo3dFormat*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stereo3d_format = new long[]{264, 344};

	/**
	 * Field descriptor (offset) for struct member 'prop'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__prop);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_prop = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prop'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prop = new long[]{268, 352};

	/**
	 * Field descriptor (offset) for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Modifiers affecting this strip<h4>Blender Source Code:</h4>
	 * <p> modifiers </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__modifiers);
	 * CPointer&lt;ListBase&gt; p_modifiers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifiers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifiers = new long[]{272, 360};

	/**
	 * Field descriptor (offset) for struct member 'cache_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__cache_flag);
	 * CPointer&lt;Integer&gt; p_cache_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_flag = new long[]{280, 376};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{284, 380};

	/**
	 * Field descriptor (offset) for struct member 'orig_sequence'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD__orig_sequence);
	 * CPointer&lt;CPointer&lt;Sequence&gt;&gt; p_orig_sequence = p.cast(new Class[]{CPointer.class, Sequence.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orig_sequence'</li>
	 * <li>Signature: 'Sequence*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orig_sequence = new long[]{296, 392};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sequence sequence = ...;
	 * CPointer&lt;Object&gt; p = sequence.__dna__addressof(Sequence.__DNA__FIELD___pad3);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad3 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{300, 400};

	public Sequence(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Sequence(Sequence that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<Sequence> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Sequence.class};
		return new CPointer<Sequence>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Sequence.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<Sequence> next) throws IOException
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
	
	public CPointer<Sequence> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Sequence.class};
		return new CPointer<Sequence>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Sequence.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<Sequence> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'tmp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tmp var for copying, and tagging for linked selection. </p>
	 * @see #__DNA__FIELD__tmp
	 */
	
	public CPointer<Object> getTmp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tmp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tmp var for copying, and tagging for linked selection. </p>
	 * @see #__DNA__FIELD__tmp
	 */
	
	public void setTmp(CPointer<Object> tmp) throws IOException
	{
		long __address = ((tmp == null) ? 0 : tmp.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'lib'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Needed (to be like ipo), else it will raise libdata warnings, this should never be used. </p>
	 * @see #__DNA__FIELD__lib
	 */
	
	public CPointer<Object> getLib() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'lib'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Needed (to be like ipo), else it will raise libdata warnings, this should never be used. </p>
	 * @see #__DNA__FIELD__lib
	 */
	
	public void setLib(CPointer<Object> lib) throws IOException
	{
		long __address = ((lib == null) ? 0 : lib.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> SEQ_NAME_MAXSTR - name, set by default and needs to be unique, for RNA paths. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> SEQ_NAME_MAXSTR - name, set by default and needs to be unique, for RNA paths. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
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
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags bitmap (see below) and the type of sequence. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 96);
		} else {
			return __io__block.readInt(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags bitmap (see below) and the type of sequence. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 96, flag);
		} else {
			__io__block.writeInt(__io__address + 80, flag);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__type
	 */
	
	public int getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 100);
		} else {
			return __io__block.readInt(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(int type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 100, type);
		} else {
			__io__block.writeInt(__io__address + 84, type);
		}
	}

	/**
	 * Get method for struct member 'len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The length of the contents of this strip - before handles are applied. </p>
	 * @see #__DNA__FIELD__len
	 */
	
	public int getLen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 104);
		} else {
			return __io__block.readInt(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The length of the contents of this strip - before handles are applied. </p>
	 * @see #__DNA__FIELD__len
	 */
	
	public void setLen(int len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 104, len);
		} else {
			__io__block.writeInt(__io__address + 88, len);
		}
	}

	/**
	 * Get method for struct member 'start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start frame of contents of strip in absolute frame coordinates. For metastrips start of first strip startdisp. </p>
	 * @see #__DNA__FIELD__start
	 */
	
	public int getStart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 108);
		} else {
			return __io__block.readInt(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Start frame of contents of strip in absolute frame coordinates. For metastrips start of first strip startdisp. </p>
	 * @see #__DNA__FIELD__start
	 */
	
	public void setStart(int start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 108, start);
		} else {
			__io__block.writeInt(__io__address + 92, start);
		}
	}

	/**
	 * Get method for struct member 'startofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Frames after the first frame where display starts, frames before the last frame where display ends. </p>
	 * @see #__DNA__FIELD__startofs
	 */
	
	public int getStartofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 112);
		} else {
			return __io__block.readInt(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'startofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Frames after the first frame where display starts, frames before the last frame where display ends. </p>
	 * @see #__DNA__FIELD__startofs
	 */
	
	public void setStartofs(int startofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 112, startofs);
		} else {
			__io__block.writeInt(__io__address + 96, startofs);
		}
	}

	/**
	 * Get method for struct member 'endofs'.
	 * @see #__DNA__FIELD__endofs
	 */
	
	public int getEndofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 116);
		} else {
			return __io__block.readInt(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'endofs'.
	 * @see #__DNA__FIELD__endofs
	 */
	
	public void setEndofs(int endofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 116, endofs);
		} else {
			__io__block.writeInt(__io__address + 100, endofs);
		}
	}

	/**
	 * Get method for struct member 'startstill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Frames that use the first frame before data begins, frames that use the last frame after data ends. </p>
	 * @see #__DNA__FIELD__startstill
	 */
	
	public int getStartstill() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 120);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'startstill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Frames that use the first frame before data begins, frames that use the last frame after data ends. </p>
	 * @see #__DNA__FIELD__startstill
	 */
	
	public void setStartstill(int startstill) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 120, startstill);
		} else {
			__io__block.writeInt(__io__address + 104, startstill);
		}
	}

	/**
	 * Get method for struct member 'endstill'.
	 * @see #__DNA__FIELD__endstill
	 */
	
	public int getEndstill() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 124);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'endstill'.
	 * @see #__DNA__FIELD__endstill
	 */
	
	public void setEndstill(int endstill) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 124, endstill);
		} else {
			__io__block.writeInt(__io__address + 108, endstill);
		}
	}

	/**
	 * Get method for struct member 'machine'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Machine: the strip channel, depth the depth in the sequence when dealing with metastrips. </p>
	 * @see #__DNA__FIELD__machine
	 */
	
	public int getMachine() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 128);
		} else {
			return __io__block.readInt(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'machine'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Machine: the strip channel, depth the depth in the sequence when dealing with metastrips. </p>
	 * @see #__DNA__FIELD__machine
	 */
	
	public void setMachine(int machine) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 128, machine);
		} else {
			__io__block.writeInt(__io__address + 112, machine);
		}
	}

	/**
	 * Get method for struct member 'depth'.
	 * @see #__DNA__FIELD__depth
	 */
	
	public int getDepth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 132);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'depth'.
	 * @see #__DNA__FIELD__depth
	 */
	
	public void setDepth(int depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 132, depth);
		} else {
			__io__block.writeInt(__io__address + 116, depth);
		}
	}

	/**
	 * Get method for struct member 'startdisp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Starting and ending points of the strip in the sequence. </p>
	 * @see #__DNA__FIELD__startdisp
	 */
	
	public int getStartdisp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'startdisp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Starting and ending points of the strip in the sequence. </p>
	 * @see #__DNA__FIELD__startdisp
	 */
	
	public void setStartdisp(int startdisp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, startdisp);
		} else {
			__io__block.writeInt(__io__address + 120, startdisp);
		}
	}

	/**
	 * Get method for struct member 'enddisp'.
	 * @see #__DNA__FIELD__enddisp
	 */
	
	public int getEnddisp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 140);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'enddisp'.
	 * @see #__DNA__FIELD__enddisp
	 */
	
	public void setEnddisp(int enddisp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 140, enddisp);
		} else {
			__io__block.writeInt(__io__address + 124, enddisp);
		}
	}

	/**
	 * Get method for struct member 'sat'.
	 * @see #__DNA__FIELD__sat
	 */
	
	public float getSat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'sat'.
	 * @see #__DNA__FIELD__sat
	 */
	
	public void setSat(float sat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, sat);
		} else {
			__io__block.writeFloat(__io__address + 128, sat);
		}
	}

	/**
	 * Get method for struct member 'mul'.
	 * @see #__DNA__FIELD__mul
	 */
	
	public float getMul() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'mul'.
	 * @see #__DNA__FIELD__mul
	 */
	
	public void setMul(float mul) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, mul);
		} else {
			__io__block.writeFloat(__io__address + 132, mul);
		}
	}

	/**
	 * Get method for struct member 'handsize'.
	 * @see #__DNA__FIELD__handsize
	 */
	
	public float getHandsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'handsize'.
	 * @see #__DNA__FIELD__handsize
	 */
	
	public void setHandsize(float handsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, handsize);
		} else {
			__io__block.writeFloat(__io__address + 136, handsize);
		}
	}

	/**
	 * Get method for struct member 'anim_preseek'.
	 * @see #__DNA__FIELD__anim_preseek
	 */
	
	public short getAnim_preseek() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 156);
		} else {
			return __io__block.readShort(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'anim_preseek'.
	 * @see #__DNA__FIELD__anim_preseek
	 */
	
	public void setAnim_preseek(short anim_preseek) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 156, anim_preseek);
		} else {
			__io__block.writeShort(__io__address + 140, anim_preseek);
		}
	}

	/**
	 * Get method for struct member 'streamindex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Streamindex for movie or sound files with several streams. </p>
	 * @see #__DNA__FIELD__streamindex
	 */
	
	public short getStreamindex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 158);
		} else {
			return __io__block.readShort(__io__address + 142);
		}
	}

	/**
	 * Set method for struct member 'streamindex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Streamindex for movie or sound files with several streams. </p>
	 * @see #__DNA__FIELD__streamindex
	 */
	
	public void setStreamindex(short streamindex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 158, streamindex);
		} else {
			__io__block.writeShort(__io__address + 142, streamindex);
		}
	}

	/**
	 * Get method for struct member 'multicam_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For multicam source selection. </p>
	 * @see #__DNA__FIELD__multicam_source
	 */
	
	public int getMulticam_source() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 160);
		} else {
			return __io__block.readInt(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'multicam_source'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For multicam source selection. </p>
	 * @see #__DNA__FIELD__multicam_source
	 */
	
	public void setMulticam_source(int multicam_source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 160, multicam_source);
		} else {
			__io__block.writeInt(__io__address + 144, multicam_source);
		}
	}

	/**
	 * Get method for struct member 'clip_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MOVIECLIP render flags. </p>
	 * @see #__DNA__FIELD__clip_flag
	 */
	
	public int getClip_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 164);
		} else {
			return __io__block.readInt(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'clip_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MOVIECLIP render flags. </p>
	 * @see #__DNA__FIELD__clip_flag
	 */
	
	public void setClip_flag(int clip_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 164, clip_flag);
		} else {
			__io__block.writeInt(__io__address + 148, clip_flag);
		}
	}

	/**
	 * Get method for struct member 'strip'.
	 * @see #__DNA__FIELD__strip
	 */
	
	public CPointer<Strip> getStrip() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Strip.class};
		return new CPointer<Strip>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Strip.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'strip'.
	 * @see #__DNA__FIELD__strip
	 */
	
	public void setStrip(CPointer<Strip> strip) throws IOException
	{
		long __address = ((strip == null) ? 0 : strip.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 168, __address);
		} else {
			__io__block.writeLong(__io__address + 152, __address);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 156);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old animation system, deprecated for 2.5. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 156, __address);
		}
	}

	/**
	 * Get method for struct member 'scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> these {@link ID}  vars should never be NULL but can be when linked libs fail to load, so check on access </p>
	 * @see #__DNA__FIELD__scene
	 */
	
	public CPointer<Scene> getScene() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Scene.class};
		return new CPointer<Scene>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Scene.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> these {@link ID}  vars should never be NULL but can be when linked libs fail to load, so check on access </p>
	 * @see #__DNA__FIELD__scene
	 */
	
	public void setScene(CPointer<Scene> scene) throws IOException
	{
		long __address = ((scene == null) ? 0 : scene.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 160, __address);
		}
	}

	/**
	 * Get method for struct member 'scene_camera'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Override scene camera. </p>
	 * @see #__DNA__FIELD__scene_camera
	 */
	
	public CPointer<BlenderObject> getScene_camera() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 164);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'scene_camera'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Override scene camera. </p>
	 * @see #__DNA__FIELD__scene_camera
	 */
	
	public void setScene_camera(CPointer<BlenderObject> scene_camera) throws IOException
	{
		long __address = ((scene_camera == null) ? 0 : scene_camera.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 164, __address);
		}
	}

	/**
	 * Get method for struct member 'clip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For MOVIECLIP strips. </p>
	 * @see #__DNA__FIELD__clip
	 */
	
	public CPointer<MovieClip> getClip() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieClip.class};
		return new CPointer<MovieClip>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieClip.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'clip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For MOVIECLIP strips. </p>
	 * @see #__DNA__FIELD__clip
	 */
	
	public void setClip(CPointer<MovieClip> clip) throws IOException
	{
		long __address = ((clip == null) ? 0 : clip.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 168, __address);
		}
	}

	/**
	 * Get method for struct member 'mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For MASK strips. </p>
	 * @see #__DNA__FIELD__mask
	 */
	
	public CPointer<Mask> getMask() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mask.class};
		return new CPointer<Mask>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mask.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For MASK strips. </p>
	 * @see #__DNA__FIELD__mask
	 */
	
	public void setMask(CPointer<Mask> mask) throws IOException
	{
		long __address = ((mask == null) ? 0 : mask.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 172, __address);
		}
	}

	/**
	 * Get method for struct member 'anims'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For MOVIE strips. </p>
	 * @see #__DNA__FIELD__anims
	 */
	
	public ListBase getAnims() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 216, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 176, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'anims'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For MOVIE strips. </p>
	 * @see #__DNA__FIELD__anims
	 */
	
	public void setAnims(ListBase anims) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 216;
		} else {
			__dna__offset = 176;
		}
		if (__io__equals(anims, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, anims)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, anims);
		} else {
			__io__generic__copy( getAnims(), anims);
		}
	}

	/**
	 * Get method for struct member 'effect_fader'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Custom fade value
	 * @see #__DNA__FIELD__effect_fader
	 */
	
	public float getEffect_fader() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 232);
		} else {
			return __io__block.readFloat(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'effect_fader'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Custom fade value
	 * @see #__DNA__FIELD__effect_fader
	 */
	
	public void setEffect_fader(float effect_fader) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 232, effect_fader);
		} else {
			__io__block.writeFloat(__io__address + 184, effect_fader);
		}
	}

	/**
	 * Get method for struct member 'speed_fader'.
	 * @see #__DNA__FIELD__speed_fader
	 */
	
	public float getSpeed_fader() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 236);
		} else {
			return __io__block.readFloat(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'speed_fader'.
	 * @see #__DNA__FIELD__speed_fader
	 */
	
	public void setSpeed_fader(float speed_fader) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 236, speed_fader);
		} else {
			__io__block.writeFloat(__io__address + 188, speed_fader);
		}
	}

	/**
	 * Get method for struct member 'seq1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> pointers for effects: </p>
	 * @see #__DNA__FIELD__seq1
	 */
	
	public CPointer<Sequence> getSeq1() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Sequence.class};
		return new CPointer<Sequence>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Sequence.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'seq1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> pointers for effects: </p>
	 * @see #__DNA__FIELD__seq1
	 */
	
	public void setSeq1(CPointer<Sequence> seq1) throws IOException
	{
		long __address = ((seq1 == null) ? 0 : seq1.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 240, __address);
		} else {
			__io__block.writeLong(__io__address + 192, __address);
		}
	}

	/**
	 * Get method for struct member 'seq2'.
	 * @see #__DNA__FIELD__seq2
	 */
	
	public CPointer<Sequence> getSeq2() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 196);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Sequence.class};
		return new CPointer<Sequence>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Sequence.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'seq2'.
	 * @see #__DNA__FIELD__seq2
	 */
	
	public void setSeq2(CPointer<Sequence> seq2) throws IOException
	{
		long __address = ((seq2 == null) ? 0 : seq2.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 248, __address);
		} else {
			__io__block.writeLong(__io__address + 196, __address);
		}
	}

	/**
	 * Get method for struct member 'seq3'.
	 * @see #__DNA__FIELD__seq3
	 */
	
	public CPointer<Sequence> getSeq3() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Sequence.class};
		return new CPointer<Sequence>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Sequence.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'seq3'.
	 * @see #__DNA__FIELD__seq3
	 */
	
	public void setSeq3(CPointer<Sequence> seq3) throws IOException
	{
		long __address = ((seq3 == null) ? 0 : seq3.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 256, __address);
		} else {
			__io__block.writeLong(__io__address + 200, __address);
		}
	}

	/**
	 * Get method for struct member 'seqbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of strips for metastrips. </p>
	 * @see #__DNA__FIELD__seqbase
	 */
	
	public ListBase getSeqbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 264, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 204, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'seqbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> List of strips for metastrips. </p>
	 * @see #__DNA__FIELD__seqbase
	 */
	
	public void setSeqbase(ListBase seqbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 264;
		} else {
			__dna__offset = 204;
		}
		if (__io__equals(seqbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, seqbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, seqbase);
		} else {
			__io__generic__copy( getSeqbase(), seqbase);
		}
	}

	/**
	 * Get method for struct member 'sound'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The linked "bSound" object. </p>
	 * @see #__DNA__FIELD__sound
	 */
	
	public CPointer<bSound> getSound() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 212);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bSound.class};
		return new CPointer<bSound>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bSound.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sound'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The linked "bSound" object. </p>
	 * @see #__DNA__FIELD__sound
	 */
	
	public void setSound(CPointer<bSound> sound) throws IOException
	{
		long __address = ((sound == null) ? 0 : sound.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 280, __address);
		} else {
			__io__block.writeLong(__io__address + 212, __address);
		}
	}

	/**
	 * Get method for struct member 'scene_sound'.
	 * @see #__DNA__FIELD__scene_sound
	 */
	
	public CPointer<Object> getScene_sound() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'scene_sound'.
	 * @see #__DNA__FIELD__scene_sound
	 */
	
	public void setScene_sound(CPointer<Object> scene_sound) throws IOException
	{
		long __address = ((scene_sound == null) ? 0 : scene_sound.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 288, __address);
		} else {
			__io__block.writeLong(__io__address + 216, __address);
		}
	}

	/**
	 * Get method for struct member 'volume'.
	 * @see #__DNA__FIELD__volume
	 */
	
	public float getVolume() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 296);
		} else {
			return __io__block.readFloat(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'volume'.
	 * @see #__DNA__FIELD__volume
	 */
	
	public void setVolume(float volume) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 296, volume);
		} else {
			__io__block.writeFloat(__io__address + 220, volume);
		}
	}

	/**
	 * Get method for struct member 'pitch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pitch (-0.1..10), pan -2..2. </p>
	 * @see #__DNA__FIELD__pitch
	 */
	
	public float getPitch() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 300);
		} else {
			return __io__block.readFloat(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'pitch'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pitch (-0.1..10), pan -2..2. </p>
	 * @see #__DNA__FIELD__pitch
	 */
	
	public void setPitch(float pitch) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 300, pitch);
		} else {
			__io__block.writeFloat(__io__address + 224, pitch);
		}
	}

	/**
	 * Get method for struct member 'pan'.
	 * @see #__DNA__FIELD__pan
	 */
	
	public float getPan() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 304);
		} else {
			return __io__block.readFloat(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'pan'.
	 * @see #__DNA__FIELD__pan
	 */
	
	public void setPan(float pan) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 304, pan);
		} else {
			__io__block.writeFloat(__io__address + 228, pan);
		}
	}

	/**
	 * Get method for struct member 'strobe'.
	 * @see #__DNA__FIELD__strobe
	 */
	
	public float getStrobe() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 308);
		} else {
			return __io__block.readFloat(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'strobe'.
	 * @see #__DNA__FIELD__strobe
	 */
	
	public void setStrobe(float strobe) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 308, strobe);
		} else {
			__io__block.writeFloat(__io__address + 232, strobe);
		}
	}

	/**
	 * Get method for struct member 'effectdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Struct pointer for effect settings. </p>
	 * @see #__DNA__FIELD__effectdata
	 */
	
	public CPointer<Object> getEffectdata() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 312);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 236);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'effectdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Struct pointer for effect settings. </p>
	 * @see #__DNA__FIELD__effectdata
	 */
	
	public void setEffectdata(CPointer<Object> effectdata) throws IOException
	{
		long __address = ((effectdata == null) ? 0 : effectdata.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 312, __address);
		} else {
			__io__block.writeLong(__io__address + 236, __address);
		}
	}

	/**
	 * Get method for struct member 'anim_startofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only use part of animation file. </p>
	 * @see #__DNA__FIELD__anim_startofs
	 */
	
	public int getAnim_startofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 320);
		} else {
			return __io__block.readInt(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'anim_startofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only use part of animation file. </p>
	 * @see #__DNA__FIELD__anim_startofs
	 */
	
	public void setAnim_startofs(int anim_startofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 320, anim_startofs);
		} else {
			__io__block.writeInt(__io__address + 240, anim_startofs);
		}
	}

	/**
	 * Get method for struct member 'anim_endofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Is subtle different to startofs / endofs. </p>
	 * @see #__DNA__FIELD__anim_endofs
	 */
	
	public int getAnim_endofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 324);
		} else {
			return __io__block.readInt(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'anim_endofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Is subtle different to startofs / endofs. </p>
	 * @see #__DNA__FIELD__anim_endofs
	 */
	
	public void setAnim_endofs(int anim_endofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 324, anim_endofs);
		} else {
			__io__block.writeInt(__io__address + 244, anim_endofs);
		}
	}

	/**
	 * Get method for struct member 'blend_mode'.
	 * @see #__DNA__FIELD__blend_mode
	 */
	
	public int getBlend_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 328);
		} else {
			return __io__block.readInt(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'blend_mode'.
	 * @see #__DNA__FIELD__blend_mode
	 */
	
	public void setBlend_mode(int blend_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 328, blend_mode);
		} else {
			__io__block.writeInt(__io__address + 248, blend_mode);
		}
	}

	/**
	 * Get method for struct member 'blend_opacity'.
	 * @see #__DNA__FIELD__blend_opacity
	 */
	
	public float getBlend_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 332);
		} else {
			return __io__block.readFloat(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'blend_opacity'.
	 * @see #__DNA__FIELD__blend_opacity
	 */
	
	public void setBlend_opacity(float blend_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 332, blend_opacity);
		} else {
			__io__block.writeFloat(__io__address + 252, blend_opacity);
		}
	}

	/**
	 * Get method for struct member 'sfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> is sfra needed anymore? - it looks like its only used in one place Starting frame according to the timeline of the scene. </p>
	 * @see #__DNA__FIELD__sfra
	 */
	
	public int getSfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 336);
		} else {
			return __io__block.readInt(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'sfra'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> is sfra needed anymore? - it looks like its only used in one place Starting frame according to the timeline of the scene. </p>
	 * @see #__DNA__FIELD__sfra
	 */
	
	public void setSfra(int sfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 336, sfra);
		} else {
			__io__block.writeInt(__io__address + 256, sfra);
		}
	}

	/**
	 * Get method for struct member 'alpha_mode'.
	 * @see #__DNA__FIELD__alpha_mode
	 */
	
	public byte getAlpha_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 340);
		} else {
			return __io__block.readByte(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'alpha_mode'.
	 * @see #__DNA__FIELD__alpha_mode
	 */
	
	public void setAlpha_mode(byte alpha_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 340, alpha_mode);
		} else {
			__io__block.writeByte(__io__address + 260, alpha_mode);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 341, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 261, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 341;
		} else {
			__dna__offset = 261;
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
	 * Get method for struct member 'views_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiview </p>
	 * @see #__DNA__FIELD__views_format
	 */
	
	public byte getViews_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 343);
		} else {
			return __io__block.readByte(__io__address + 263);
		}
	}

	/**
	 * Set method for struct member 'views_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiview </p>
	 * @see #__DNA__FIELD__views_format
	 */
	
	public void setViews_format(byte views_format) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 343, views_format);
		} else {
			__io__block.writeByte(__io__address + 263, views_format);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_format'.
	 * @see #__DNA__FIELD__stereo3d_format
	 */
	
	public CPointer<Stereo3dFormat> getStereo3d_format() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 344);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 264);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Stereo3dFormat.class};
		return new CPointer<Stereo3dFormat>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Stereo3dFormat.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'stereo3d_format'.
	 * @see #__DNA__FIELD__stereo3d_format
	 */
	
	public void setStereo3d_format(CPointer<Stereo3dFormat> stereo3d_format) throws IOException
	{
		long __address = ((stereo3d_format == null) ? 0 : stereo3d_format.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 344, __address);
		} else {
			__io__block.writeLong(__io__address + 264, __address);
		}
	}

	/**
	 * Get method for struct member 'prop'.
	 * @see #__DNA__FIELD__prop
	 */
	
	public CPointer<IDProperty> getProp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 352);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 268);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prop'.
	 * @see #__DNA__FIELD__prop
	 */
	
	public void setProp(CPointer<IDProperty> prop) throws IOException
	{
		long __address = ((prop == null) ? 0 : prop.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 352, __address);
		} else {
			__io__block.writeLong(__io__address + 268, __address);
		}
	}

	/**
	 * Get method for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Modifiers affecting this strip<h4>Blender Source Code:</h4>
	 * <p> modifiers </p>
	 * @see #__DNA__FIELD__modifiers
	 */
	
	public ListBase getModifiers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 360, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 272, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Modifiers affecting this strip<h4>Blender Source Code:</h4>
	 * <p> modifiers </p>
	 * @see #__DNA__FIELD__modifiers
	 */
	
	public void setModifiers(ListBase modifiers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 360;
		} else {
			__dna__offset = 272;
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
	 * Get method for struct member 'cache_flag'.
	 * @see #__DNA__FIELD__cache_flag
	 */
	
	public int getCache_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 376);
		} else {
			return __io__block.readInt(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'cache_flag'.
	 * @see #__DNA__FIELD__cache_flag
	 */
	
	public void setCache_flag(int cache_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 376, cache_flag);
		} else {
			__io__block.writeInt(__io__address + 280, cache_flag);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Integer> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 380, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 284, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Integer> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 380;
		} else {
			__dna__offset = 284;
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
	 * Get method for struct member 'orig_sequence'.
	 * @see #__DNA__FIELD__orig_sequence
	 */
	
	public CPointer<Sequence> getOrig_sequence() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 392);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 296);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Sequence.class};
		return new CPointer<Sequence>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Sequence.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'orig_sequence'.
	 * @see #__DNA__FIELD__orig_sequence
	 */
	
	public void setOrig_sequence(CPointer<Sequence> orig_sequence) throws IOException
	{
		long __address = ((orig_sequence == null) ? 0 : orig_sequence.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 392, __address);
		} else {
			__io__block.writeLong(__io__address + 296, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 400);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 300);
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
			__io__block.writeLong(__io__address + 400, __address);
		} else {
			__io__block.writeLong(__io__address + 300, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Sequence> __io__addressof() {
		return new CPointer<Sequence>(__io__address, new Class[]{Sequence.class}, __io__block, __io__blockTable);
	}

}
