package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bTheme'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> A theme.</p><p><h2>Note</h2><p> Currently only a single theme is ever used at once. Different theme presets are stored as external files now. </p> Currently only a single theme is ever used at once. Different theme presets are stored as external files now. 
 * 
 * </p>
 */

@CMetaData(size32=17416, size64=17424)
public class bTheme extends CFacade {

	/**
	 * This is the sdna index of the struct bTheme.
	 * <p>
	 * It is required when allocating a new block to store data for bTheme.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 744;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bTheme&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bTheme.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bTheme*'</li>
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
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bTheme&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bTheme.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bTheme*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[32]'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'tui'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tui);
	 * CPointer&lt;ThemeUI&gt; p_tui = p.cast(new Class[]{ThemeUI.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tui'</li>
	 * <li>Signature: 'ThemeUI'</li>
	 * <li>Actual Size (32bit/64bit): 1000/1000</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tui = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'tbuts'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tbuts);
	 * CPointer&lt;ThemeSpace&gt; p_tbuts = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tbuts'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tbuts = new long[]{1040, 1048};

	/**
	 * Field descriptor (offset) for struct member 'tv3d'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tv3d);
	 * CPointer&lt;ThemeSpace&gt; p_tv3d = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tv3d'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tv3d = new long[]{1928, 1936};

	/**
	 * Field descriptor (offset) for struct member 'tfile'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tfile);
	 * CPointer&lt;ThemeSpace&gt; p_tfile = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tfile'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tfile = new long[]{2816, 2824};

	/**
	 * Field descriptor (offset) for struct member 'tipo'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tipo);
	 * CPointer&lt;ThemeSpace&gt; p_tipo = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tipo'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tipo = new long[]{3704, 3712};

	/**
	 * Field descriptor (offset) for struct member 'tinfo'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tinfo);
	 * CPointer&lt;ThemeSpace&gt; p_tinfo = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tinfo'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tinfo = new long[]{4592, 4600};

	/**
	 * Field descriptor (offset) for struct member 'tact'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tact);
	 * CPointer&lt;ThemeSpace&gt; p_tact = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tact'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tact = new long[]{5480, 5488};

	/**
	 * Field descriptor (offset) for struct member 'tnla'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tnla);
	 * CPointer&lt;ThemeSpace&gt; p_tnla = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tnla'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tnla = new long[]{6368, 6376};

	/**
	 * Field descriptor (offset) for struct member 'tseq'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tseq);
	 * CPointer&lt;ThemeSpace&gt; p_tseq = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tseq'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tseq = new long[]{7256, 7264};

	/**
	 * Field descriptor (offset) for struct member 'tima'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tima);
	 * CPointer&lt;ThemeSpace&gt; p_tima = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tima'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tima = new long[]{8144, 8152};

	/**
	 * Field descriptor (offset) for struct member 'text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__text);
	 * CPointer&lt;ThemeSpace&gt; p_text = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text = new long[]{9032, 9040};

	/**
	 * Field descriptor (offset) for struct member 'toops'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__toops);
	 * CPointer&lt;ThemeSpace&gt; p_toops = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'toops'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__toops = new long[]{9920, 9928};

	/**
	 * Field descriptor (offset) for struct member 'tnode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tnode);
	 * CPointer&lt;ThemeSpace&gt; p_tnode = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tnode'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tnode = new long[]{10808, 10816};

	/**
	 * Field descriptor (offset) for struct member 'tuserpref'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tuserpref);
	 * CPointer&lt;ThemeSpace&gt; p_tuserpref = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tuserpref'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tuserpref = new long[]{11696, 11704};

	/**
	 * Field descriptor (offset) for struct member 'tconsole'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tconsole);
	 * CPointer&lt;ThemeSpace&gt; p_tconsole = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tconsole'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tconsole = new long[]{12584, 12592};

	/**
	 * Field descriptor (offset) for struct member 'tclip'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tclip);
	 * CPointer&lt;ThemeSpace&gt; p_tclip = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tclip'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tclip = new long[]{13472, 13480};

	/**
	 * Field descriptor (offset) for struct member 'ttopbar'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__ttopbar);
	 * CPointer&lt;ThemeSpace&gt; p_ttopbar = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ttopbar'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ttopbar = new long[]{14360, 14368};

	/**
	 * Field descriptor (offset) for struct member 'tstatusbar'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tstatusbar);
	 * CPointer&lt;ThemeSpace&gt; p_tstatusbar = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tstatusbar'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tstatusbar = new long[]{15248, 15256};

	/**
	 * Field descriptor (offset) for struct member 'space_spreadsheet'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__space_spreadsheet);
	 * CPointer&lt;ThemeSpace&gt; p_space_spreadsheet = p.cast(new Class[]{ThemeSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'space_spreadsheet'</li>
	 * <li>Signature: 'ThemeSpace'</li>
	 * <li>Actual Size (32bit/64bit): 888/888</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__space_spreadsheet = new long[]{16136, 16144};

	/**
	 * Field descriptor (offset) for struct member 'tarm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 20 sets of bone colors for this theme </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__tarm);
	 * CPointer&lt;CArrayFacade&lt;ThemeWireColor&gt;&gt; p_tarm = p.cast(new Class[]{CArrayFacade.class, ThemeWireColor.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tarm'</li>
	 * <li>Signature: 'ThemeWireColor[20]'</li>
	 * <li>Actual Size (32bit/64bit): 320/320</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tarm = new long[]{17024, 17032};

	/**
	 * Field descriptor (offset) for struct member 'collection_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link ThemeWireColor}  tobj[20];. </p><p> See COLLECTION_COLOR_TOT for the number of collection colors. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__collection_color);
	 * CPointer&lt;CArrayFacade&lt;ThemeCollectionColor&gt;&gt; p_collection_color = p.cast(new Class[]{CArrayFacade.class, ThemeCollectionColor.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'collection_color'</li>
	 * <li>Signature: 'ThemeCollectionColor[8]'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__collection_color = new long[]{17344, 17352};

	/**
	 * Field descriptor (offset) for struct member 'strip_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> See SEQUENCE_COLOR_TOT for the total number of strip colors. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__strip_color);
	 * CPointer&lt;CArrayFacade&lt;ThemeStripColor&gt;&gt; p_strip_color = p.cast(new Class[]{CArrayFacade.class, ThemeStripColor.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strip_color'</li>
	 * <li>Signature: 'ThemeStripColor[9]'</li>
	 * <li>Actual Size (32bit/64bit): 36/36</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strip_color = new long[]{17376, 17384};

	/**
	 * Field descriptor (offset) for struct member 'active_theme_area'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTheme btheme = ...;
	 * CPointer&lt;Object&gt; p = btheme.__dna__addressof(bTheme.__DNA__FIELD__active_theme_area);
	 * CPointer&lt;Integer&gt; p_active_theme_area = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_theme_area'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_theme_area = new long[]{17412, 17420};

	public bTheme(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bTheme(bTheme that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bTheme> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bTheme.class};
		return new CPointer<bTheme>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bTheme.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bTheme> next) throws IOException
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
	
	public CPointer<bTheme> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bTheme.class};
		return new CPointer<bTheme>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bTheme.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bTheme> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			32
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
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
	 * Get method for struct member 'tui'.
	 * @see #__DNA__FIELD__tui
	 */
	
	public ThemeUI getTui() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeUI(__io__address + 48, __io__block, __io__blockTable);
		} else {
			return new ThemeUI(__io__address + 40, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tui'.
	 * @see #__DNA__FIELD__tui
	 */
	
	public void setTui(ThemeUI tui) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(tui, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tui)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tui);
		} else {
			__io__generic__copy( getTui(), tui);
		}
	}

	/**
	 * Get method for struct member 'tbuts'.
	 * @see #__DNA__FIELD__tbuts
	 */
	
	public ThemeSpace getTbuts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 1048, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 1040, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tbuts'.
	 * @see #__DNA__FIELD__tbuts
	 */
	
	public void setTbuts(ThemeSpace tbuts) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1048;
		} else {
			__dna__offset = 1040;
		}
		if (__io__equals(tbuts, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tbuts)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tbuts);
		} else {
			__io__generic__copy( getTbuts(), tbuts);
		}
	}

	/**
	 * Get method for struct member 'tv3d'.
	 * @see #__DNA__FIELD__tv3d
	 */
	
	public ThemeSpace getTv3d() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 1936, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 1928, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tv3d'.
	 * @see #__DNA__FIELD__tv3d
	 */
	
	public void setTv3d(ThemeSpace tv3d) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1936;
		} else {
			__dna__offset = 1928;
		}
		if (__io__equals(tv3d, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tv3d)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tv3d);
		} else {
			__io__generic__copy( getTv3d(), tv3d);
		}
	}

	/**
	 * Get method for struct member 'tfile'.
	 * @see #__DNA__FIELD__tfile
	 */
	
	public ThemeSpace getTfile() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 2824, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 2816, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tfile'.
	 * @see #__DNA__FIELD__tfile
	 */
	
	public void setTfile(ThemeSpace tfile) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2824;
		} else {
			__dna__offset = 2816;
		}
		if (__io__equals(tfile, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tfile)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tfile);
		} else {
			__io__generic__copy( getTfile(), tfile);
		}
	}

	/**
	 * Get method for struct member 'tipo'.
	 * @see #__DNA__FIELD__tipo
	 */
	
	public ThemeSpace getTipo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 3712, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 3704, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tipo'.
	 * @see #__DNA__FIELD__tipo
	 */
	
	public void setTipo(ThemeSpace tipo) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 3712;
		} else {
			__dna__offset = 3704;
		}
		if (__io__equals(tipo, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tipo)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tipo);
		} else {
			__io__generic__copy( getTipo(), tipo);
		}
	}

	/**
	 * Get method for struct member 'tinfo'.
	 * @see #__DNA__FIELD__tinfo
	 */
	
	public ThemeSpace getTinfo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 4600, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 4592, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tinfo'.
	 * @see #__DNA__FIELD__tinfo
	 */
	
	public void setTinfo(ThemeSpace tinfo) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4600;
		} else {
			__dna__offset = 4592;
		}
		if (__io__equals(tinfo, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tinfo)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tinfo);
		} else {
			__io__generic__copy( getTinfo(), tinfo);
		}
	}

	/**
	 * Get method for struct member 'tact'.
	 * @see #__DNA__FIELD__tact
	 */
	
	public ThemeSpace getTact() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 5488, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 5480, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tact'.
	 * @see #__DNA__FIELD__tact
	 */
	
	public void setTact(ThemeSpace tact) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 5488;
		} else {
			__dna__offset = 5480;
		}
		if (__io__equals(tact, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tact)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tact);
		} else {
			__io__generic__copy( getTact(), tact);
		}
	}

	/**
	 * Get method for struct member 'tnla'.
	 * @see #__DNA__FIELD__tnla
	 */
	
	public ThemeSpace getTnla() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 6376, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 6368, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tnla'.
	 * @see #__DNA__FIELD__tnla
	 */
	
	public void setTnla(ThemeSpace tnla) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 6376;
		} else {
			__dna__offset = 6368;
		}
		if (__io__equals(tnla, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tnla)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tnla);
		} else {
			__io__generic__copy( getTnla(), tnla);
		}
	}

	/**
	 * Get method for struct member 'tseq'.
	 * @see #__DNA__FIELD__tseq
	 */
	
	public ThemeSpace getTseq() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 7264, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 7256, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tseq'.
	 * @see #__DNA__FIELD__tseq
	 */
	
	public void setTseq(ThemeSpace tseq) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 7264;
		} else {
			__dna__offset = 7256;
		}
		if (__io__equals(tseq, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tseq)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tseq);
		} else {
			__io__generic__copy( getTseq(), tseq);
		}
	}

	/**
	 * Get method for struct member 'tima'.
	 * @see #__DNA__FIELD__tima
	 */
	
	public ThemeSpace getTima() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 8152, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 8144, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tima'.
	 * @see #__DNA__FIELD__tima
	 */
	
	public void setTima(ThemeSpace tima) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8152;
		} else {
			__dna__offset = 8144;
		}
		if (__io__equals(tima, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tima)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tima);
		} else {
			__io__generic__copy( getTima(), tima);
		}
	}

	/**
	 * Get method for struct member 'text'.
	 * @see #__DNA__FIELD__text
	 */
	
	public ThemeSpace getText() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 9040, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 9032, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'text'.
	 * @see #__DNA__FIELD__text
	 */
	
	public void setText(ThemeSpace text) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 9040;
		} else {
			__dna__offset = 9032;
		}
		if (__io__equals(text, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, text)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, text);
		} else {
			__io__generic__copy( getText(), text);
		}
	}

	/**
	 * Get method for struct member 'toops'.
	 * @see #__DNA__FIELD__toops
	 */
	
	public ThemeSpace getToops() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 9928, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 9920, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'toops'.
	 * @see #__DNA__FIELD__toops
	 */
	
	public void setToops(ThemeSpace toops) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 9928;
		} else {
			__dna__offset = 9920;
		}
		if (__io__equals(toops, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, toops)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, toops);
		} else {
			__io__generic__copy( getToops(), toops);
		}
	}

	/**
	 * Get method for struct member 'tnode'.
	 * @see #__DNA__FIELD__tnode
	 */
	
	public ThemeSpace getTnode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 10816, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 10808, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tnode'.
	 * @see #__DNA__FIELD__tnode
	 */
	
	public void setTnode(ThemeSpace tnode) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 10816;
		} else {
			__dna__offset = 10808;
		}
		if (__io__equals(tnode, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tnode)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tnode);
		} else {
			__io__generic__copy( getTnode(), tnode);
		}
	}

	/**
	 * Get method for struct member 'tuserpref'.
	 * @see #__DNA__FIELD__tuserpref
	 */
	
	public ThemeSpace getTuserpref() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 11704, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 11696, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tuserpref'.
	 * @see #__DNA__FIELD__tuserpref
	 */
	
	public void setTuserpref(ThemeSpace tuserpref) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 11704;
		} else {
			__dna__offset = 11696;
		}
		if (__io__equals(tuserpref, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tuserpref)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tuserpref);
		} else {
			__io__generic__copy( getTuserpref(), tuserpref);
		}
	}

	/**
	 * Get method for struct member 'tconsole'.
	 * @see #__DNA__FIELD__tconsole
	 */
	
	public ThemeSpace getTconsole() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 12592, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 12584, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tconsole'.
	 * @see #__DNA__FIELD__tconsole
	 */
	
	public void setTconsole(ThemeSpace tconsole) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12592;
		} else {
			__dna__offset = 12584;
		}
		if (__io__equals(tconsole, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tconsole)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tconsole);
		} else {
			__io__generic__copy( getTconsole(), tconsole);
		}
	}

	/**
	 * Get method for struct member 'tclip'.
	 * @see #__DNA__FIELD__tclip
	 */
	
	public ThemeSpace getTclip() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 13480, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 13472, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tclip'.
	 * @see #__DNA__FIELD__tclip
	 */
	
	public void setTclip(ThemeSpace tclip) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 13480;
		} else {
			__dna__offset = 13472;
		}
		if (__io__equals(tclip, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tclip)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tclip);
		} else {
			__io__generic__copy( getTclip(), tclip);
		}
	}

	/**
	 * Get method for struct member 'ttopbar'.
	 * @see #__DNA__FIELD__ttopbar
	 */
	
	public ThemeSpace getTtopbar() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 14368, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 14360, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ttopbar'.
	 * @see #__DNA__FIELD__ttopbar
	 */
	
	public void setTtopbar(ThemeSpace ttopbar) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 14368;
		} else {
			__dna__offset = 14360;
		}
		if (__io__equals(ttopbar, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ttopbar)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ttopbar);
		} else {
			__io__generic__copy( getTtopbar(), ttopbar);
		}
	}

	/**
	 * Get method for struct member 'tstatusbar'.
	 * @see #__DNA__FIELD__tstatusbar
	 */
	
	public ThemeSpace getTstatusbar() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 15256, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 15248, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tstatusbar'.
	 * @see #__DNA__FIELD__tstatusbar
	 */
	
	public void setTstatusbar(ThemeSpace tstatusbar) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 15256;
		} else {
			__dna__offset = 15248;
		}
		if (__io__equals(tstatusbar, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tstatusbar)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tstatusbar);
		} else {
			__io__generic__copy( getTstatusbar(), tstatusbar);
		}
	}

	/**
	 * Get method for struct member 'space_spreadsheet'.
	 * @see #__DNA__FIELD__space_spreadsheet
	 */
	
	public ThemeSpace getSpace_spreadsheet() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeSpace(__io__address + 16144, __io__block, __io__blockTable);
		} else {
			return new ThemeSpace(__io__address + 16136, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'space_spreadsheet'.
	 * @see #__DNA__FIELD__space_spreadsheet
	 */
	
	public void setSpace_spreadsheet(ThemeSpace space_spreadsheet) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16144;
		} else {
			__dna__offset = 16136;
		}
		if (__io__equals(space_spreadsheet, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, space_spreadsheet)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, space_spreadsheet);
		} else {
			__io__generic__copy( getSpace_spreadsheet(), space_spreadsheet);
		}
	}

	/**
	 * Get method for struct member 'tarm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 20 sets of bone colors for this theme </p>
	 * @see #__DNA__FIELD__tarm
	 */
	
	public CArrayFacade<ThemeWireColor> getTarm() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{ThemeWireColor.class};
		int[] __dna__dimensions = new int[]{
			20
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<ThemeWireColor>(__io__address + 17032, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<ThemeWireColor>(__io__address + 17024, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tarm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 20 sets of bone colors for this theme </p>
	 * @see #__DNA__FIELD__tarm
	 */
	
	public void setTarm(CArrayFacade<ThemeWireColor> tarm) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 17032;
		} else {
			__dna__offset = 17024;
		}
		if (__io__equals(tarm, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tarm)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tarm);
		} else {
			__io__generic__copy( getTarm(), tarm);
		}
	}

	/**
	 * Get method for struct member 'collection_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link ThemeWireColor}  tobj[20];. </p><p> See COLLECTION_COLOR_TOT for the number of collection colors. </p>
	 * @see #__DNA__FIELD__collection_color
	 */
	
	public CArrayFacade<ThemeCollectionColor> getCollection_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{ThemeCollectionColor.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<ThemeCollectionColor>(__io__address + 17352, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<ThemeCollectionColor>(__io__address + 17344, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'collection_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link ThemeWireColor}  tobj[20];. </p><p> See COLLECTION_COLOR_TOT for the number of collection colors. </p>
	 * @see #__DNA__FIELD__collection_color
	 */
	
	public void setCollection_color(CArrayFacade<ThemeCollectionColor> collection_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 17352;
		} else {
			__dna__offset = 17344;
		}
		if (__io__equals(collection_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, collection_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, collection_color);
		} else {
			__io__generic__copy( getCollection_color(), collection_color);
		}
	}

	/**
	 * Get method for struct member 'strip_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> See SEQUENCE_COLOR_TOT for the total number of strip colors. </p>
	 * @see #__DNA__FIELD__strip_color
	 */
	
	public CArrayFacade<ThemeStripColor> getStrip_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{ThemeStripColor.class};
		int[] __dna__dimensions = new int[]{
			9
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<ThemeStripColor>(__io__address + 17384, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<ThemeStripColor>(__io__address + 17376, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'strip_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> See SEQUENCE_COLOR_TOT for the total number of strip colors. </p>
	 * @see #__DNA__FIELD__strip_color
	 */
	
	public void setStrip_color(CArrayFacade<ThemeStripColor> strip_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 17384;
		} else {
			__dna__offset = 17376;
		}
		if (__io__equals(strip_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, strip_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, strip_color);
		} else {
			__io__generic__copy( getStrip_color(), strip_color);
		}
	}

	/**
	 * Get method for struct member 'active_theme_area'.
	 * @see #__DNA__FIELD__active_theme_area
	 */
	
	public int getActive_theme_area() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 17420);
		} else {
			return __io__block.readInt(__io__address + 17412);
		}
	}

	/**
	 * Set method for struct member 'active_theme_area'.
	 * @see #__DNA__FIELD__active_theme_area
	 */
	
	public void setActive_theme_area(int active_theme_area) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 17420, active_theme_area);
		} else {
			__io__block.writeInt(__io__address + 17412, active_theme_area);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bTheme> __io__addressof() {
		return new CPointer<bTheme>(__io__address, new Class[]{bTheme.class}, __io__block, __io__blockTable);
	}

}
