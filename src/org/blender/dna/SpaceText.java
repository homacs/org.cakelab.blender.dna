package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpaceText'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p>{@link Text}  Editor ============================================ {@link Text}  Editor </p>
 */

@CMetaData(size32=656, size64=680)
public class SpaceText extends CFacade {

	/**
	 * This is the sdna index of the struct SpaceText.
	 * <p>
	 * It is required when allocating a new block to store data for SpaceText.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 225;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;SpaceLink&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, SpaceLink.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'SpaceLink*'</li>
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
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;SpaceLink&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, SpaceLink.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'SpaceLink*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> storage of regions for inactive spaces </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__regionbase);
	 * CPointer&lt;ListBase&gt; p_regionbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'regionbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__regionbase = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'spacetype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__spacetype);
	 * CPointer&lt;Integer&gt; p_spacetype = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacetype'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacetype = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'blockscale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__blockscale);
	 * CPointer&lt;Float&gt; p_blockscale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blockscale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blockscale = new long[]{20, 36};

	/**
	 * Field descriptor (offset) for struct member 'blockhandler'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__blockhandler);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_blockhandler = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blockhandler'</li>
	 * <li>Signature: 'short[8]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blockhandler = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__text);
	 * CPointer&lt;CPointer&lt;Text&gt;&gt; p_text = p.cast(new Class[]{CPointer.class, Text.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text'</li>
	 * <li>Signature: 'Text*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text = new long[]{40, 56};

	/**
	 * Field descriptor (offset) for struct member 'top'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__top);
	 * CPointer&lt;Integer&gt; p_top = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'top'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__top = new long[]{44, 64};

	/**
	 * Field descriptor (offset) for struct member 'viewlines'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__viewlines);
	 * CPointer&lt;Integer&gt; p_viewlines = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewlines'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewlines = new long[]{48, 68};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__flags);
	 * CPointer&lt;Short&gt; p_flags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{52, 72};

	/**
	 * Field descriptor (offset) for struct member 'menunr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__menunr);
	 * CPointer&lt;Short&gt; p_menunr = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'menunr'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__menunr = new long[]{54, 74};

	/**
	 * Field descriptor (offset) for struct member 'lheight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> user preference, is font_size! </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__lheight);
	 * CPointer&lt;Short&gt; p_lheight = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lheight'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lheight = new long[]{56, 76};

	/**
	 * Field descriptor (offset) for struct member 'cwidth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__cwidth);
	 * CPointer&lt;Byte&gt; p_cwidth = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cwidth'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cwidth = new long[]{58, 78};

	/**
	 * Field descriptor (offset) for struct member 'linenrs_tot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime computed, character width and the number of chars to use when showing line numbers </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__linenrs_tot);
	 * CPointer&lt;Byte&gt; p_linenrs_tot = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'linenrs_tot'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__linenrs_tot = new long[]{59, 79};

	/**
	 * Field descriptor (offset) for struct member 'left'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__left);
	 * CPointer&lt;Integer&gt; p_left = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'left'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__left = new long[]{60, 80};

	/**
	 * Field descriptor (offset) for struct member 'showlinenrs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__showlinenrs);
	 * CPointer&lt;Integer&gt; p_showlinenrs = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'showlinenrs'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__showlinenrs = new long[]{64, 84};

	/**
	 * Field descriptor (offset) for struct member 'tabnumber'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__tabnumber);
	 * CPointer&lt;Integer&gt; p_tabnumber = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tabnumber'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tabnumber = new long[]{68, 88};

	/**
	 * Field descriptor (offset) for struct member 'showsyntax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__showsyntax);
	 * CPointer&lt;Short&gt; p_showsyntax = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'showsyntax'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__showsyntax = new long[]{72, 92};

	/**
	 * Field descriptor (offset) for struct member 'line_hlight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__line_hlight);
	 * CPointer&lt;Short&gt; p_line_hlight = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'line_hlight'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__line_hlight = new long[]{74, 94};

	/**
	 * Field descriptor (offset) for struct member 'overwrite'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__overwrite);
	 * CPointer&lt;Short&gt; p_overwrite = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overwrite'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overwrite = new long[]{76, 96};

	/**
	 * Field descriptor (offset) for struct member 'live_edit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> run python while editing, evil </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__live_edit);
	 * CPointer&lt;Short&gt; p_live_edit = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'live_edit'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__live_edit = new long[]{78, 98};

	/**
	 * Field descriptor (offset) for struct member 'pix_per_line'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__pix_per_line);
	 * CPointer&lt;Float&gt; p_pix_per_line = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pix_per_line'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pix_per_line = new long[]{80, 100};

	/**
	 * Field descriptor (offset) for struct member 'txtscroll'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__txtscroll);
	 * CPointer&lt;rcti&gt; p_txtscroll = p.cast(new Class[]{rcti.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'txtscroll'</li>
	 * <li>Signature: 'rcti'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__txtscroll = new long[]{84, 104};

	/**
	 * Field descriptor (offset) for struct member 'txtbar'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__txtbar);
	 * CPointer&lt;rcti&gt; p_txtbar = p.cast(new Class[]{rcti.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'txtbar'</li>
	 * <li>Signature: 'rcti'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__txtbar = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'wordwrap'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__wordwrap);
	 * CPointer&lt;Integer&gt; p_wordwrap = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wordwrap'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wordwrap = new long[]{116, 136};

	/**
	 * Field descriptor (offset) for struct member 'doplugins'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__doplugins);
	 * CPointer&lt;Integer&gt; p_doplugins = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'doplugins'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__doplugins = new long[]{120, 140};

	/**
	 * Field descriptor (offset) for struct member 'findstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ST_MAX_FIND_STR </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__findstr);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_findstr = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'findstr'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__findstr = new long[]{124, 144};

	/**
	 * Field descriptor (offset) for struct member 'replacestr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ST_MAX_FIND_STR </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__replacestr);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_replacestr = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'replacestr'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__replacestr = new long[]{380, 400};

	/**
	 * Field descriptor (offset) for struct member 'margin_column'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> column number to show right margin at </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__margin_column);
	 * CPointer&lt;Short&gt; p_margin_column = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'margin_column'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__margin_column = new long[]{636, 656};

	/**
	 * Field descriptor (offset) for struct member 'lheight_dpi'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> actual lineheight, dpi controlled </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__lheight_dpi);
	 * CPointer&lt;Short&gt; p_lheight_dpi = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lheight_dpi'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lheight_dpi = new long[]{638, 658};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{640, 660};

	/**
	 * Field descriptor (offset) for struct member 'drawcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache for faster drawing </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__drawcache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_drawcache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawcache'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawcache = new long[]{644, 664};

	/**
	 * Field descriptor (offset) for struct member 'scroll_accum'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime, for scroll increments smaller than a line </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__scroll_accum);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_scroll_accum = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scroll_accum'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scroll_accum = new long[]{648, 672};

	public SpaceText(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpaceText(SpaceText that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<SpaceLink> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpaceLink.class};
		return new CPointer<SpaceLink>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpaceLink.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<SpaceLink> next) throws IOException
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
	
	public CPointer<SpaceLink> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpaceLink.class};
		return new CPointer<SpaceLink>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpaceLink.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<SpaceLink> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> storage of regions for inactive spaces </p>
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public ListBase getRegionbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> storage of regions for inactive spaces </p>
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public void setRegionbase(ListBase regionbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(regionbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, regionbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, regionbase);
		} else {
			__io__generic__copy( getRegionbase(), regionbase);
		}
	}

	/**
	 * Get method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public int getSpacetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public void setSpacetype(int spacetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, spacetype);
		} else {
			__io__block.writeInt(__io__address + 16, spacetype);
		}
	}

	/**
	 * Get method for struct member 'blockscale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__blockscale
	 */
	
	public float getBlockscale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'blockscale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__blockscale
	 */
	
	public void setBlockscale(float blockscale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, blockscale);
		} else {
			__io__block.writeFloat(__io__address + 20, blockscale);
		}
	}

	/**
	 * Get method for struct member 'blockhandler'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__blockhandler
	 */
	
	public CArrayFacade<Short> getBlockhandler() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'blockhandler'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__blockhandler
	 */
	
	public void setBlockhandler(CArrayFacade<Short> blockhandler) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(blockhandler, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, blockhandler)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, blockhandler);
		} else {
			__io__generic__copy( getBlockhandler(), blockhandler);
		}
	}

	/**
	 * Get method for struct member 'text'.
	 * @see #__DNA__FIELD__text
	 */
	
	public CPointer<Text> getText() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Text.class};
		return new CPointer<Text>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Text.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'text'.
	 * @see #__DNA__FIELD__text
	 */
	
	public void setText(CPointer<Text> text) throws IOException
	{
		long __address = ((text == null) ? 0 : text.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 56, __address);
		} else {
			__io__block.writeLong(__io__address + 40, __address);
		}
	}

	/**
	 * Get method for struct member 'top'.
	 * @see #__DNA__FIELD__top
	 */
	
	public int getTop() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 64);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'top'.
	 * @see #__DNA__FIELD__top
	 */
	
	public void setTop(int top) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 64, top);
		} else {
			__io__block.writeInt(__io__address + 44, top);
		}
	}

	/**
	 * Get method for struct member 'viewlines'.
	 * @see #__DNA__FIELD__viewlines
	 */
	
	public int getViewlines() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 68);
		} else {
			return __io__block.readInt(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'viewlines'.
	 * @see #__DNA__FIELD__viewlines
	 */
	
	public void setViewlines(int viewlines) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 68, viewlines);
		} else {
			__io__block.writeInt(__io__address + 48, viewlines);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public short getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 72);
		} else {
			return __io__block.readShort(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(short flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 72, flags);
		} else {
			__io__block.writeShort(__io__address + 52, flags);
		}
	}

	/**
	 * Get method for struct member 'menunr'.
	 * @see #__DNA__FIELD__menunr
	 */
	
	public short getMenunr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 74);
		} else {
			return __io__block.readShort(__io__address + 54);
		}
	}

	/**
	 * Set method for struct member 'menunr'.
	 * @see #__DNA__FIELD__menunr
	 */
	
	public void setMenunr(short menunr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 74, menunr);
		} else {
			__io__block.writeShort(__io__address + 54, menunr);
		}
	}

	/**
	 * Get method for struct member 'lheight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> user preference, is font_size! </p>
	 * @see #__DNA__FIELD__lheight
	 */
	
	public short getLheight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 76);
		} else {
			return __io__block.readShort(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'lheight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> user preference, is font_size! </p>
	 * @see #__DNA__FIELD__lheight
	 */
	
	public void setLheight(short lheight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 76, lheight);
		} else {
			__io__block.writeShort(__io__address + 56, lheight);
		}
	}

	/**
	 * Get method for struct member 'cwidth'.
	 * @see #__DNA__FIELD__cwidth
	 */
	
	public byte getCwidth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 78);
		} else {
			return __io__block.readByte(__io__address + 58);
		}
	}

	/**
	 * Set method for struct member 'cwidth'.
	 * @see #__DNA__FIELD__cwidth
	 */
	
	public void setCwidth(byte cwidth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 78, cwidth);
		} else {
			__io__block.writeByte(__io__address + 58, cwidth);
		}
	}

	/**
	 * Get method for struct member 'linenrs_tot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime computed, character width and the number of chars to use when showing line numbers </p>
	 * @see #__DNA__FIELD__linenrs_tot
	 */
	
	public byte getLinenrs_tot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 79);
		} else {
			return __io__block.readByte(__io__address + 59);
		}
	}

	/**
	 * Set method for struct member 'linenrs_tot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime computed, character width and the number of chars to use when showing line numbers </p>
	 * @see #__DNA__FIELD__linenrs_tot
	 */
	
	public void setLinenrs_tot(byte linenrs_tot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 79, linenrs_tot);
		} else {
			__io__block.writeByte(__io__address + 59, linenrs_tot);
		}
	}

	/**
	 * Get method for struct member 'left'.
	 * @see #__DNA__FIELD__left
	 */
	
	public int getLeft() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 80);
		} else {
			return __io__block.readInt(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'left'.
	 * @see #__DNA__FIELD__left
	 */
	
	public void setLeft(int left) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 80, left);
		} else {
			__io__block.writeInt(__io__address + 60, left);
		}
	}

	/**
	 * Get method for struct member 'showlinenrs'.
	 * @see #__DNA__FIELD__showlinenrs
	 */
	
	public int getShowlinenrs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'showlinenrs'.
	 * @see #__DNA__FIELD__showlinenrs
	 */
	
	public void setShowlinenrs(int showlinenrs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, showlinenrs);
		} else {
			__io__block.writeInt(__io__address + 64, showlinenrs);
		}
	}

	/**
	 * Get method for struct member 'tabnumber'.
	 * @see #__DNA__FIELD__tabnumber
	 */
	
	public int getTabnumber() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 88);
		} else {
			return __io__block.readInt(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'tabnumber'.
	 * @see #__DNA__FIELD__tabnumber
	 */
	
	public void setTabnumber(int tabnumber) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 88, tabnumber);
		} else {
			__io__block.writeInt(__io__address + 68, tabnumber);
		}
	}

	/**
	 * Get method for struct member 'showsyntax'.
	 * @see #__DNA__FIELD__showsyntax
	 */
	
	public short getShowsyntax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 92);
		} else {
			return __io__block.readShort(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'showsyntax'.
	 * @see #__DNA__FIELD__showsyntax
	 */
	
	public void setShowsyntax(short showsyntax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 92, showsyntax);
		} else {
			__io__block.writeShort(__io__address + 72, showsyntax);
		}
	}

	/**
	 * Get method for struct member 'line_hlight'.
	 * @see #__DNA__FIELD__line_hlight
	 */
	
	public short getLine_hlight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 94);
		} else {
			return __io__block.readShort(__io__address + 74);
		}
	}

	/**
	 * Set method for struct member 'line_hlight'.
	 * @see #__DNA__FIELD__line_hlight
	 */
	
	public void setLine_hlight(short line_hlight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 94, line_hlight);
		} else {
			__io__block.writeShort(__io__address + 74, line_hlight);
		}
	}

	/**
	 * Get method for struct member 'overwrite'.
	 * @see #__DNA__FIELD__overwrite
	 */
	
	public short getOverwrite() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 96);
		} else {
			return __io__block.readShort(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'overwrite'.
	 * @see #__DNA__FIELD__overwrite
	 */
	
	public void setOverwrite(short overwrite) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 96, overwrite);
		} else {
			__io__block.writeShort(__io__address + 76, overwrite);
		}
	}

	/**
	 * Get method for struct member 'live_edit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> run python while editing, evil </p>
	 * @see #__DNA__FIELD__live_edit
	 */
	
	public short getLive_edit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 98);
		} else {
			return __io__block.readShort(__io__address + 78);
		}
	}

	/**
	 * Set method for struct member 'live_edit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> run python while editing, evil </p>
	 * @see #__DNA__FIELD__live_edit
	 */
	
	public void setLive_edit(short live_edit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 98, live_edit);
		} else {
			__io__block.writeShort(__io__address + 78, live_edit);
		}
	}

	/**
	 * Get method for struct member 'pix_per_line'.
	 * @see #__DNA__FIELD__pix_per_line
	 */
	
	public float getPix_per_line() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'pix_per_line'.
	 * @see #__DNA__FIELD__pix_per_line
	 */
	
	public void setPix_per_line(float pix_per_line) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, pix_per_line);
		} else {
			__io__block.writeFloat(__io__address + 80, pix_per_line);
		}
	}

	/**
	 * Get method for struct member 'txtscroll'.
	 * @see #__DNA__FIELD__txtscroll
	 */
	
	public rcti getTxtscroll() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rcti(__io__address + 104, __io__block, __io__blockTable);
		} else {
			return new rcti(__io__address + 84, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'txtscroll'.
	 * @see #__DNA__FIELD__txtscroll
	 */
	
	public void setTxtscroll(rcti txtscroll) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 84;
		}
		if (__io__equals(txtscroll, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, txtscroll)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, txtscroll);
		} else {
			__io__generic__copy( getTxtscroll(), txtscroll);
		}
	}

	/**
	 * Get method for struct member 'txtbar'.
	 * @see #__DNA__FIELD__txtbar
	 */
	
	public rcti getTxtbar() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rcti(__io__address + 120, __io__block, __io__blockTable);
		} else {
			return new rcti(__io__address + 100, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'txtbar'.
	 * @see #__DNA__FIELD__txtbar
	 */
	
	public void setTxtbar(rcti txtbar) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(txtbar, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, txtbar)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, txtbar);
		} else {
			__io__generic__copy( getTxtbar(), txtbar);
		}
	}

	/**
	 * Get method for struct member 'wordwrap'.
	 * @see #__DNA__FIELD__wordwrap
	 */
	
	public int getWordwrap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'wordwrap'.
	 * @see #__DNA__FIELD__wordwrap
	 */
	
	public void setWordwrap(int wordwrap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, wordwrap);
		} else {
			__io__block.writeInt(__io__address + 116, wordwrap);
		}
	}

	/**
	 * Get method for struct member 'doplugins'.
	 * @see #__DNA__FIELD__doplugins
	 */
	
	public int getDoplugins() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 140);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'doplugins'.
	 * @see #__DNA__FIELD__doplugins
	 */
	
	public void setDoplugins(int doplugins) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 140, doplugins);
		} else {
			__io__block.writeInt(__io__address + 120, doplugins);
		}
	}

	/**
	 * Get method for struct member 'findstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ST_MAX_FIND_STR </p>
	 * @see #__DNA__FIELD__findstr
	 */
	
	public CArrayFacade<Byte> getFindstr() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'findstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ST_MAX_FIND_STR </p>
	 * @see #__DNA__FIELD__findstr
	 */
	
	public void setFindstr(CArrayFacade<Byte> findstr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 124;
		}
		if (__io__equals(findstr, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, findstr)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, findstr);
		} else {
			__io__generic__copy( getFindstr(), findstr);
		}
	}

	/**
	 * Get method for struct member 'replacestr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ST_MAX_FIND_STR </p>
	 * @see #__DNA__FIELD__replacestr
	 */
	
	public CArrayFacade<Byte> getReplacestr() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 400, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 380, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'replacestr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ST_MAX_FIND_STR </p>
	 * @see #__DNA__FIELD__replacestr
	 */
	
	public void setReplacestr(CArrayFacade<Byte> replacestr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 400;
		} else {
			__dna__offset = 380;
		}
		if (__io__equals(replacestr, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, replacestr)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, replacestr);
		} else {
			__io__generic__copy( getReplacestr(), replacestr);
		}
	}

	/**
	 * Get method for struct member 'margin_column'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> column number to show right margin at </p>
	 * @see #__DNA__FIELD__margin_column
	 */
	
	public short getMargin_column() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 656);
		} else {
			return __io__block.readShort(__io__address + 636);
		}
	}

	/**
	 * Set method for struct member 'margin_column'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> column number to show right margin at </p>
	 * @see #__DNA__FIELD__margin_column
	 */
	
	public void setMargin_column(short margin_column) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 656, margin_column);
		} else {
			__io__block.writeShort(__io__address + 636, margin_column);
		}
	}

	/**
	 * Get method for struct member 'lheight_dpi'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> actual lineheight, dpi controlled </p>
	 * @see #__DNA__FIELD__lheight_dpi
	 */
	
	public short getLheight_dpi() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 658);
		} else {
			return __io__block.readShort(__io__address + 638);
		}
	}

	/**
	 * Set method for struct member 'lheight_dpi'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> actual lineheight, dpi controlled </p>
	 * @see #__DNA__FIELD__lheight_dpi
	 */
	
	public void setLheight_dpi(short lheight_dpi) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 658, lheight_dpi);
		} else {
			__io__block.writeShort(__io__address + 638, lheight_dpi);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 660, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 640, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 660;
		} else {
			__dna__offset = 640;
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
	 * Get method for struct member 'drawcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache for faster drawing </p>
	 * @see #__DNA__FIELD__drawcache
	 */
	
	public CPointer<Object> getDrawcache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 664);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 644);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'drawcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cache for faster drawing </p>
	 * @see #__DNA__FIELD__drawcache
	 */
	
	public void setDrawcache(CPointer<Object> drawcache) throws IOException
	{
		long __address = ((drawcache == null) ? 0 : drawcache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 664, __address);
		} else {
			__io__block.writeLong(__io__address + 644, __address);
		}
	}

	/**
	 * Get method for struct member 'scroll_accum'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime, for scroll increments smaller than a line </p>
	 * @see #__DNA__FIELD__scroll_accum
	 */
	
	public CArrayFacade<Float> getScroll_accum() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 672, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 648, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scroll_accum'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime, for scroll increments smaller than a line </p>
	 * @see #__DNA__FIELD__scroll_accum
	 */
	
	public void setScroll_accum(CArrayFacade<Float> scroll_accum) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 672;
		} else {
			__dna__offset = 648;
		}
		if (__io__equals(scroll_accum, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scroll_accum)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scroll_accum);
		} else {
			__io__generic__copy( getScroll_accum(), scroll_accum);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpaceText> __io__addressof() {
		return new CPointer<SpaceText>(__io__address, new Class[]{SpaceText.class}, __io__block, __io__blockTable);
	}

}
