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
 * <p>{@link Text}  Editor </p>
 */

@CMetaData(size32=640, size64=664)
public class SpaceText extends CFacade {

	/**
	 * This is the sdna index of the struct SpaceText.
	 * <p>
	 * It is required when allocating a new block to store data for SpaceText.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 248;

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
	 * <p> Storage of regions for inactive spaces. </p>
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
	 * CPointer&lt;Byte&gt; p_spacetype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacetype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacetype = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'link_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__link_flag);
	 * CPointer&lt;Byte&gt; p_link_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'link_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__link_flag = new long[]{17, 33};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{18, 34};

	/**
	 * Field descriptor (offset) for struct member 'text'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. </p>
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
	public static final long[] __DNA__FIELD__text = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'top'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Determines at what line the top of the text is displayed. </p>
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
	public static final long[] __DNA__FIELD__top = new long[]{28, 48};

	/**
	 * Field descriptor (offset) for struct member 'left'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Determines the horizontal scroll (in columns). </p>
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
	public static final long[] __DNA__FIELD__left = new long[]{32, 52};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{36, 56};

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
	public static final long[] __DNA__FIELD__flags = new long[]{40, 60};

	/**
	 * Field descriptor (offset) for struct member 'lheight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User preference, is font_size! </p>
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
	public static final long[] __DNA__FIELD__lheight = new long[]{42, 62};

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
	public static final long[] __DNA__FIELD__tabnumber = new long[]{44, 64};

	/**
	 * Field descriptor (offset) for struct member 'wordwrap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Booleans </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__wordwrap);
	 * CPointer&lt;Byte&gt; p_wordwrap = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wordwrap'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wordwrap = new long[]{48, 68};

	/**
	 * Field descriptor (offset) for struct member 'doplugins'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__doplugins);
	 * CPointer&lt;Byte&gt; p_doplugins = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'doplugins'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__doplugins = new long[]{49, 69};

	/**
	 * Field descriptor (offset) for struct member 'showlinenrs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__showlinenrs);
	 * CPointer&lt;Byte&gt; p_showlinenrs = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'showlinenrs'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__showlinenrs = new long[]{50, 70};

	/**
	 * Field descriptor (offset) for struct member 'showsyntax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__showsyntax);
	 * CPointer&lt;Byte&gt; p_showsyntax = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'showsyntax'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__showsyntax = new long[]{51, 71};

	/**
	 * Field descriptor (offset) for struct member 'line_hlight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__line_hlight);
	 * CPointer&lt;Byte&gt; p_line_hlight = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'line_hlight'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__line_hlight = new long[]{52, 72};

	/**
	 * Field descriptor (offset) for struct member 'overwrite'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__overwrite);
	 * CPointer&lt;Byte&gt; p_overwrite = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overwrite'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overwrite = new long[]{53, 73};

	/**
	 * Field descriptor (offset) for struct member 'live_edit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Run python while editing, evil. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__live_edit);
	 * CPointer&lt;Byte&gt; p_live_edit = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'live_edit'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__live_edit = new long[]{54, 74};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{55, 75};

	/**
	 * Field descriptor (offset) for struct member 'findstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ST_MAX_FIND_STR. </p>
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
	public static final long[] __DNA__FIELD__findstr = new long[]{56, 76};

	/**
	 * Field descriptor (offset) for struct member 'replacestr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ST_MAX_FIND_STR. </p>
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
	public static final long[] __DNA__FIELD__replacestr = new long[]{312, 332};

	/**
	 * Field descriptor (offset) for struct member 'margin_column'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Column number to show right margin at. </p>
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
	public static final long[] __DNA__FIELD__margin_column = new long[]{568, 588};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{570, 590};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Keep last. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceText spacetext = ...;
	 * CPointer&lt;Object&gt; p = spacetext.__dna__addressof(SpaceText.__DNA__FIELD__runtime);
	 * CPointer&lt;SpaceText_Runtime&gt; p_runtime = p.cast(new Class[]{SpaceText_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'SpaceText_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 68/72</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{572, 592};

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
	 * <p> Storage of regions for inactive spaces. </p>
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
	 * <p> Storage of regions for inactive spaces. </p>
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
	
	public byte getSpacetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 32);
		} else {
			return __io__block.readByte(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public void setSpacetype(byte spacetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 32, spacetype);
		} else {
			__io__block.writeByte(__io__address + 16, spacetype);
		}
	}

	/**
	 * Get method for struct member 'link_flag'.
	 * @see #__DNA__FIELD__link_flag
	 */
	
	public byte getLink_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 33);
		} else {
			return __io__block.readByte(__io__address + 17);
		}
	}

	/**
	 * Set method for struct member 'link_flag'.
	 * @see #__DNA__FIELD__link_flag
	 */
	
	public void setLink_flag(byte link_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 33, link_flag);
		} else {
			__io__block.writeByte(__io__address + 17, link_flag);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 34, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 18, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 34;
		} else {
			__dna__offset = 18;
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
	 * Get method for struct member 'text'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. </p>
	 * @see #__DNA__FIELD__text
	 */
	
	public CPointer<Text> getText() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Text.class};
		return new CPointer<Text>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Text.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'text'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. </p>
	 * @see #__DNA__FIELD__text
	 */
	
	public void setText(CPointer<Text> text) throws IOException
	{
		long __address = ((text == null) ? 0 : text.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'top'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Determines at what line the top of the text is displayed. </p>
	 * @see #__DNA__FIELD__top
	 */
	
	public int getTop() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 48);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'top'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Determines at what line the top of the text is displayed. </p>
	 * @see #__DNA__FIELD__top
	 */
	
	public void setTop(int top) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 48, top);
		} else {
			__io__block.writeInt(__io__address + 28, top);
		}
	}

	/**
	 * Get method for struct member 'left'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Determines the horizontal scroll (in columns). </p>
	 * @see #__DNA__FIELD__left
	 */
	
	public int getLeft() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 52);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'left'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Determines the horizontal scroll (in columns). </p>
	 * @see #__DNA__FIELD__left
	 */
	
	public void setLeft(int left) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 52, left);
		} else {
			__io__block.writeInt(__io__address + 32, left);
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
			return new CArrayFacade<Byte>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 56;
		} else {
			__dna__offset = 36;
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
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public short getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 60);
		} else {
			return __io__block.readShort(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(short flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 60, flags);
		} else {
			__io__block.writeShort(__io__address + 40, flags);
		}
	}

	/**
	 * Get method for struct member 'lheight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User preference, is font_size! </p>
	 * @see #__DNA__FIELD__lheight
	 */
	
	public short getLheight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 62);
		} else {
			return __io__block.readShort(__io__address + 42);
		}
	}

	/**
	 * Set method for struct member 'lheight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User preference, is font_size! </p>
	 * @see #__DNA__FIELD__lheight
	 */
	
	public void setLheight(short lheight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 62, lheight);
		} else {
			__io__block.writeShort(__io__address + 42, lheight);
		}
	}

	/**
	 * Get method for struct member 'tabnumber'.
	 * @see #__DNA__FIELD__tabnumber
	 */
	
	public int getTabnumber() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 64);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'tabnumber'.
	 * @see #__DNA__FIELD__tabnumber
	 */
	
	public void setTabnumber(int tabnumber) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 64, tabnumber);
		} else {
			__io__block.writeInt(__io__address + 44, tabnumber);
		}
	}

	/**
	 * Get method for struct member 'wordwrap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Booleans </p>
	 * @see #__DNA__FIELD__wordwrap
	 */
	
	public byte getWordwrap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 68);
		} else {
			return __io__block.readByte(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'wordwrap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Booleans </p>
	 * @see #__DNA__FIELD__wordwrap
	 */
	
	public void setWordwrap(byte wordwrap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 68, wordwrap);
		} else {
			__io__block.writeByte(__io__address + 48, wordwrap);
		}
	}

	/**
	 * Get method for struct member 'doplugins'.
	 * @see #__DNA__FIELD__doplugins
	 */
	
	public byte getDoplugins() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 69);
		} else {
			return __io__block.readByte(__io__address + 49);
		}
	}

	/**
	 * Set method for struct member 'doplugins'.
	 * @see #__DNA__FIELD__doplugins
	 */
	
	public void setDoplugins(byte doplugins) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 69, doplugins);
		} else {
			__io__block.writeByte(__io__address + 49, doplugins);
		}
	}

	/**
	 * Get method for struct member 'showlinenrs'.
	 * @see #__DNA__FIELD__showlinenrs
	 */
	
	public byte getShowlinenrs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 70);
		} else {
			return __io__block.readByte(__io__address + 50);
		}
	}

	/**
	 * Set method for struct member 'showlinenrs'.
	 * @see #__DNA__FIELD__showlinenrs
	 */
	
	public void setShowlinenrs(byte showlinenrs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 70, showlinenrs);
		} else {
			__io__block.writeByte(__io__address + 50, showlinenrs);
		}
	}

	/**
	 * Get method for struct member 'showsyntax'.
	 * @see #__DNA__FIELD__showsyntax
	 */
	
	public byte getShowsyntax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 71);
		} else {
			return __io__block.readByte(__io__address + 51);
		}
	}

	/**
	 * Set method for struct member 'showsyntax'.
	 * @see #__DNA__FIELD__showsyntax
	 */
	
	public void setShowsyntax(byte showsyntax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 71, showsyntax);
		} else {
			__io__block.writeByte(__io__address + 51, showsyntax);
		}
	}

	/**
	 * Get method for struct member 'line_hlight'.
	 * @see #__DNA__FIELD__line_hlight
	 */
	
	public byte getLine_hlight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 72);
		} else {
			return __io__block.readByte(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'line_hlight'.
	 * @see #__DNA__FIELD__line_hlight
	 */
	
	public void setLine_hlight(byte line_hlight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 72, line_hlight);
		} else {
			__io__block.writeByte(__io__address + 52, line_hlight);
		}
	}

	/**
	 * Get method for struct member 'overwrite'.
	 * @see #__DNA__FIELD__overwrite
	 */
	
	public byte getOverwrite() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 73);
		} else {
			return __io__block.readByte(__io__address + 53);
		}
	}

	/**
	 * Set method for struct member 'overwrite'.
	 * @see #__DNA__FIELD__overwrite
	 */
	
	public void setOverwrite(byte overwrite) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 73, overwrite);
		} else {
			__io__block.writeByte(__io__address + 53, overwrite);
		}
	}

	/**
	 * Get method for struct member 'live_edit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Run python while editing, evil. </p>
	 * @see #__DNA__FIELD__live_edit
	 */
	
	public byte getLive_edit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 74);
		} else {
			return __io__block.readByte(__io__address + 54);
		}
	}

	/**
	 * Set method for struct member 'live_edit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Run python while editing, evil. </p>
	 * @see #__DNA__FIELD__live_edit
	 */
	
	public void setLive_edit(byte live_edit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 74, live_edit);
		} else {
			__io__block.writeByte(__io__address + 54, live_edit);
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
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 75, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 55, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 75;
		} else {
			__dna__offset = 55;
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
	 * Get method for struct member 'findstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ST_MAX_FIND_STR. </p>
	 * @see #__DNA__FIELD__findstr
	 */
	
	public CArrayFacade<Byte> getFindstr() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'findstr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ST_MAX_FIND_STR. </p>
	 * @see #__DNA__FIELD__findstr
	 */
	
	public void setFindstr(CArrayFacade<Byte> findstr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 76;
		} else {
			__dna__offset = 56;
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
	 * <p> ST_MAX_FIND_STR. </p>
	 * @see #__DNA__FIELD__replacestr
	 */
	
	public CArrayFacade<Byte> getReplacestr() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 332, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 312, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'replacestr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ST_MAX_FIND_STR. </p>
	 * @see #__DNA__FIELD__replacestr
	 */
	
	public void setReplacestr(CArrayFacade<Byte> replacestr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 332;
		} else {
			__dna__offset = 312;
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
	 * <p> Column number to show right margin at. </p>
	 * @see #__DNA__FIELD__margin_column
	 */
	
	public short getMargin_column() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 588);
		} else {
			return __io__block.readShort(__io__address + 568);
		}
	}

	/**
	 * Set method for struct member 'margin_column'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Column number to show right margin at. </p>
	 * @see #__DNA__FIELD__margin_column
	 */
	
	public void setMargin_column(short margin_column) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 588, margin_column);
		} else {
			__io__block.writeShort(__io__address + 568, margin_column);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CArrayFacade<Byte> get_pad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 590, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 570, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CArrayFacade<Byte> _pad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 590;
		} else {
			__dna__offset = 570;
		}
		if (__io__equals(_pad3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad3);
		} else {
			__io__generic__copy( get_pad3(), _pad3);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Keep last. </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public SpaceText_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new SpaceText_Runtime(__io__address + 592, __io__block, __io__blockTable);
		} else {
			return new SpaceText_Runtime(__io__address + 572, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Keep last. </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(SpaceText_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 592;
		} else {
			__dna__offset = 572;
		}
		if (__io__equals(runtime, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, runtime)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, runtime);
		} else {
			__io__generic__copy( getRuntime(), runtime);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpaceText> __io__addressof() {
		return new CPointer<SpaceText>(__io__address, new Class[]{SpaceText.class}, __io__block, __io__blockTable);
	}

}
