package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ThemeSpace'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> try to put them all in one, if needed a special struct can be created as well for example later on, when we introduce wire colors for ob types or so... </p>
 */

@CMetaData(size32=760, size64=760)
public class ThemeSpace extends CFacade {

	/**
	 * This is the sdna index of the struct ThemeSpace.
	 * <p>
	 * It is required when allocating a new block to store data for ThemeSpace.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 247;

	/**
	 * Field descriptor (offset) for struct member 'back'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> main window colors </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__back);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_back = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'back'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__back = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panel title </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__title);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_title = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'title'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__title = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__text);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_text = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'text_hi'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__text_hi);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_text_hi = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text_hi'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text_hi = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'header'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> header colors region background </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__header);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_header = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'header'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__header = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'header_title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unused </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__header_title);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_header_title = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'header_title'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__header_title = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'header_text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__header_text);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_header_text = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'header_text'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__header_text = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'header_text_hi'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__header_text_hi);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_header_text_hi = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'header_text_hi'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__header_text_hi = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'tab_active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> region tabs </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__tab_active);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_tab_active = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tab_active'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tab_active = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'tab_inactive'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__tab_inactive);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_tab_inactive = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tab_inactive'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tab_inactive = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'tab_back'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__tab_back);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_tab_back = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tab_back'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tab_back = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'tab_outline'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__tab_outline);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_tab_outline = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tab_outline'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tab_outline = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'button'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> button/tool regions region background </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__button);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_button = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'button'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__button = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'button_title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panel title </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__button_title);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_button_title = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'button_title'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__button_title = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'button_text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__button_text);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_button_text = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'button_text'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__button_text = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'button_text_hi'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__button_text_hi);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_button_text_hi = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'button_text_hi'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__button_text_hi = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'list'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> listview regions region background </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__list);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_list = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'list'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__list = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'list_title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panel title </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__list_title);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_list_title = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'list_title'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__list_title = new long[]{68, 68};

	/**
	 * Field descriptor (offset) for struct member 'list_text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__list_text);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_list_text = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'list_text'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__list_text = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'list_text_hi'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__list_text_hi);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_list_text_hi = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'list_text_hi'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__list_text_hi = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'panelcolors'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> float panel char panel[4]; unused char panel_title[4]; unused char panel_text[4]; unused char panel_text_hi[4]; unused note, cannot use name 'panel' because of DNA mapping old files </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__panelcolors);
	 * CPointer&lt;uiPanelColors&gt; p_panelcolors = p.cast(new Class[]{uiPanelColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'panelcolors'</li>
	 * <li>Signature: 'uiPanelColors'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__panelcolors = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'gradients'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__gradients);
	 * CPointer&lt;uiGradientColors&gt; p_gradients = p.cast(new Class[]{uiGradientColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradients'</li>
	 * <li>Signature: 'uiGradientColors'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradients = new long[]{96, 96};

	/**
	 * Field descriptor (offset) for struct member 'shade1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__shade1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_shade1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shade1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shade1 = new long[]{112, 112};

	/**
	 * Field descriptor (offset) for struct member 'shade2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__shade2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_shade2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shade2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shade2 = new long[]{116, 116};

	/**
	 * Field descriptor (offset) for struct member 'hilite'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__hilite);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_hilite = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hilite'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hilite = new long[]{120, 120};

	/**
	 * Field descriptor (offset) for struct member 'grid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__grid);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_grid = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grid'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grid = new long[]{124, 124};

	/**
	 * Field descriptor (offset) for struct member 'view_overlay'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__view_overlay);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_view_overlay = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_overlay'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_overlay = new long[]{128, 128};

	/**
	 * Field descriptor (offset) for struct member 'wire'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__wire);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_wire = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wire'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wire = new long[]{132, 132};

	/**
	 * Field descriptor (offset) for struct member 'wire_edit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__wire_edit);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_wire_edit = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wire_edit'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wire_edit = new long[]{136, 136};

	/**
	 * Field descriptor (offset) for struct member 'select'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__select);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_select = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'select'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__select = new long[]{140, 140};

	/**
	 * Field descriptor (offset) for struct member 'lamp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__lamp);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_lamp = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lamp'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lamp = new long[]{144, 144};

	/**
	 * Field descriptor (offset) for struct member 'speaker'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__speaker);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_speaker = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'speaker'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__speaker = new long[]{148, 148};

	/**
	 * Field descriptor (offset) for struct member 'empty'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__empty);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_empty = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'empty'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__empty = new long[]{152, 152};

	/**
	 * Field descriptor (offset) for struct member 'camera'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__camera);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_camera = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'camera'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__camera = new long[]{156, 156};

	/**
	 * Field descriptor (offset) for struct member 'active'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__active);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_active = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active = new long[]{160, 160};

	/**
	 * Field descriptor (offset) for struct member 'group'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__group);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_group = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'group'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__group = new long[]{164, 164};

	/**
	 * Field descriptor (offset) for struct member 'group_active'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__group_active);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_group_active = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'group_active'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__group_active = new long[]{168, 168};

	/**
	 * Field descriptor (offset) for struct member 'transform'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__transform);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_transform = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transform'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transform = new long[]{172, 172};

	/**
	 * Field descriptor (offset) for struct member 'vertex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__vertex);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vertex = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex = new long[]{176, 176};

	/**
	 * Field descriptor (offset) for struct member 'vertex_select'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__vertex_select);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vertex_select = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_select'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_select = new long[]{180, 180};

	/**
	 * Field descriptor (offset) for struct member 'vertex_bevel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__vertex_bevel);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vertex_bevel = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_bevel'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_bevel = new long[]{184, 184};

	/**
	 * Field descriptor (offset) for struct member 'vertex_unreferenced'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__vertex_unreferenced);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vertex_unreferenced = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_unreferenced'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_unreferenced = new long[]{188, 188};

	/**
	 * Field descriptor (offset) for struct member 'edge'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__edge);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_edge = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge = new long[]{192, 192};

	/**
	 * Field descriptor (offset) for struct member 'edge_select'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__edge_select);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_edge_select = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge_select'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge_select = new long[]{196, 196};

	/**
	 * Field descriptor (offset) for struct member 'edge_seam'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__edge_seam);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_edge_seam = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge_seam'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge_seam = new long[]{200, 200};

	/**
	 * Field descriptor (offset) for struct member 'edge_sharp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__edge_sharp);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_edge_sharp = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge_sharp'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge_sharp = new long[]{204, 204};

	/**
	 * Field descriptor (offset) for struct member 'edge_facesel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__edge_facesel);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_edge_facesel = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge_facesel'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge_facesel = new long[]{208, 208};

	/**
	 * Field descriptor (offset) for struct member 'edge_crease'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__edge_crease);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_edge_crease = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge_crease'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge_crease = new long[]{212, 212};

	/**
	 * Field descriptor (offset) for struct member 'edge_bevel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__edge_bevel);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_edge_bevel = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge_bevel'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge_bevel = new long[]{216, 216};

	/**
	 * Field descriptor (offset) for struct member 'face'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__face);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_face = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'face'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__face = new long[]{220, 220};

	/**
	 * Field descriptor (offset) for struct member 'face_select'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> solid faces </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__face_select);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_face_select = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'face_select'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__face_select = new long[]{224, 224};

	/**
	 * Field descriptor (offset) for struct member 'face_dot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> selected color </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__face_dot);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_face_dot = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'face_dot'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__face_dot = new long[]{228, 228};

	/**
	 * Field descriptor (offset) for struct member 'extra_edge_len'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__extra_edge_len);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_extra_edge_len = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'extra_edge_len'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__extra_edge_len = new long[]{232, 232};

	/**
	 * Field descriptor (offset) for struct member 'extra_edge_angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__extra_edge_angle);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_extra_edge_angle = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'extra_edge_angle'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__extra_edge_angle = new long[]{236, 236};

	/**
	 * Field descriptor (offset) for struct member 'extra_face_angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__extra_face_angle);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_extra_face_angle = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'extra_face_angle'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__extra_face_angle = new long[]{240, 240};

	/**
	 * Field descriptor (offset) for struct member 'extra_face_area'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__extra_face_area);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_extra_face_area = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'extra_face_area'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__extra_face_area = new long[]{244, 244};

	/**
	 * Field descriptor (offset) for struct member 'normal'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__normal);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_normal = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normal'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normal = new long[]{248, 248};

	/**
	 * Field descriptor (offset) for struct member 'vertex_normal'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__vertex_normal);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vertex_normal = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_normal'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_normal = new long[]{252, 252};

	/**
	 * Field descriptor (offset) for struct member 'loop_normal'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__loop_normal);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_loop_normal = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loop_normal'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loop_normal = new long[]{256, 256};

	/**
	 * Field descriptor (offset) for struct member 'bone_solid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__bone_solid);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_bone_solid = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bone_solid'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bone_solid = new long[]{260, 260};

	/**
	 * Field descriptor (offset) for struct member 'bone_pose'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__bone_pose);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_bone_pose = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bone_pose'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bone_pose = new long[]{264, 264};

	/**
	 * Field descriptor (offset) for struct member 'bone_pose_active'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__bone_pose_active);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_bone_pose_active = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bone_pose_active'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bone_pose_active = new long[]{268, 268};

	/**
	 * Field descriptor (offset) for struct member 'strip'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__strip);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_strip = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strip'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strip = new long[]{272, 272};

	/**
	 * Field descriptor (offset) for struct member 'strip_select'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__strip_select);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_strip_select = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strip_select'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strip_select = new long[]{276, 276};

	/**
	 * Field descriptor (offset) for struct member 'cframe'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__cframe);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_cframe = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cframe'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cframe = new long[]{280, 280};

	/**
	 * Field descriptor (offset) for struct member 'time_keyframe'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__time_keyframe);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_time_keyframe = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_keyframe'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_keyframe = new long[]{284, 284};

	/**
	 * Field descriptor (offset) for struct member 'time_gp_keyframe'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__time_gp_keyframe);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_time_gp_keyframe = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_gp_keyframe'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_gp_keyframe = new long[]{288, 288};

	/**
	 * Field descriptor (offset) for struct member 'freestyle_edge_mark'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__freestyle_edge_mark);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_freestyle_edge_mark = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'freestyle_edge_mark'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__freestyle_edge_mark = new long[]{292, 292};

	/**
	 * Field descriptor (offset) for struct member 'freestyle_face_mark'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__freestyle_face_mark);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_freestyle_face_mark = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'freestyle_face_mark'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__freestyle_face_mark = new long[]{296, 296};

	/**
	 * Field descriptor (offset) for struct member 'nurb_uline'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nurb_uline);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nurb_uline = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nurb_uline'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nurb_uline = new long[]{300, 300};

	/**
	 * Field descriptor (offset) for struct member 'nurb_vline'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nurb_vline);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nurb_vline = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nurb_vline'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nurb_vline = new long[]{304, 304};

	/**
	 * Field descriptor (offset) for struct member 'act_spline'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__act_spline);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_act_spline = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_spline'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_spline = new long[]{308, 308};

	/**
	 * Field descriptor (offset) for struct member 'nurb_sel_uline'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nurb_sel_uline);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nurb_sel_uline = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nurb_sel_uline'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nurb_sel_uline = new long[]{312, 312};

	/**
	 * Field descriptor (offset) for struct member 'nurb_sel_vline'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nurb_sel_vline);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nurb_sel_vline = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nurb_sel_vline'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nurb_sel_vline = new long[]{316, 316};

	/**
	 * Field descriptor (offset) for struct member 'lastsel_point'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__lastsel_point);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_lastsel_point = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastsel_point'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastsel_point = new long[]{320, 320};

	/**
	 * Field descriptor (offset) for struct member 'handle_free'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__handle_free);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_handle_free = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_free'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_free = new long[]{324, 324};

	/**
	 * Field descriptor (offset) for struct member 'handle_auto'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__handle_auto);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_handle_auto = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_auto'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_auto = new long[]{328, 328};

	/**
	 * Field descriptor (offset) for struct member 'handle_vect'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__handle_vect);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_handle_vect = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_vect'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_vect = new long[]{332, 332};

	/**
	 * Field descriptor (offset) for struct member 'handle_align'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__handle_align);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_handle_align = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_align'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_align = new long[]{336, 336};

	/**
	 * Field descriptor (offset) for struct member 'handle_auto_clamped'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__handle_auto_clamped);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_handle_auto_clamped = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_auto_clamped'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_auto_clamped = new long[]{340, 340};

	/**
	 * Field descriptor (offset) for struct member 'handle_sel_free'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__handle_sel_free);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_handle_sel_free = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_sel_free'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_sel_free = new long[]{344, 344};

	/**
	 * Field descriptor (offset) for struct member 'handle_sel_auto'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__handle_sel_auto);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_handle_sel_auto = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_sel_auto'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_sel_auto = new long[]{348, 348};

	/**
	 * Field descriptor (offset) for struct member 'handle_sel_vect'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__handle_sel_vect);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_handle_sel_vect = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_sel_vect'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_sel_vect = new long[]{352, 352};

	/**
	 * Field descriptor (offset) for struct member 'handle_sel_align'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__handle_sel_align);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_handle_sel_align = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_sel_align'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_sel_align = new long[]{356, 356};

	/**
	 * Field descriptor (offset) for struct member 'handle_sel_auto_clamped'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__handle_sel_auto_clamped);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_handle_sel_auto_clamped = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_sel_auto_clamped'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_sel_auto_clamped = new long[]{360, 360};

	/**
	 * Field descriptor (offset) for struct member 'ds_channel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__ds_channel);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_ds_channel = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ds_channel'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ds_channel = new long[]{364, 364};

	/**
	 * Field descriptor (offset) for struct member 'ds_subchannel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dopesheet </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__ds_subchannel);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_ds_subchannel = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ds_subchannel'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ds_subchannel = new long[]{368, 368};

	/**
	 * Field descriptor (offset) for struct member 'keytype_keyframe'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__keytype_keyframe);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_keytype_keyframe = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keytype_keyframe'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keytype_keyframe = new long[]{372, 372};

	/**
	 * Field descriptor (offset) for struct member 'keytype_extreme'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__keytype_extreme);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_keytype_extreme = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keytype_extreme'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keytype_extreme = new long[]{376, 376};

	/**
	 * Field descriptor (offset) for struct member 'keytype_breakdown'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__keytype_breakdown);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_keytype_breakdown = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keytype_breakdown'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keytype_breakdown = new long[]{380, 380};

	/**
	 * Field descriptor (offset) for struct member 'keytype_jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keytypes </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__keytype_jitter);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_keytype_jitter = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keytype_jitter'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keytype_jitter = new long[]{384, 384};

	/**
	 * Field descriptor (offset) for struct member 'keytype_keyframe_select'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__keytype_keyframe_select);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_keytype_keyframe_select = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keytype_keyframe_select'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keytype_keyframe_select = new long[]{388, 388};

	/**
	 * Field descriptor (offset) for struct member 'keytype_extreme_select'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__keytype_extreme_select);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_keytype_extreme_select = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keytype_extreme_select'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keytype_extreme_select = new long[]{392, 392};

	/**
	 * Field descriptor (offset) for struct member 'keytype_breakdown_select'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__keytype_breakdown_select);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_keytype_breakdown_select = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keytype_breakdown_select'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keytype_breakdown_select = new long[]{396, 396};

	/**
	 * Field descriptor (offset) for struct member 'keytype_jitter_select'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keytypes </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__keytype_jitter_select);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_keytype_jitter_select = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keytype_jitter_select'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keytype_jitter_select = new long[]{400, 400};

	/**
	 * Field descriptor (offset) for struct member 'keyborder'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__keyborder);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_keyborder = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyborder'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyborder = new long[]{404, 404};

	/**
	 * Field descriptor (offset) for struct member 'keyborder_select'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__keyborder_select);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_keyborder_select = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyborder_select'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyborder_select = new long[]{408, 408};

	/**
	 * Field descriptor (offset) for struct member 'console_output'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__console_output);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_console_output = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'console_output'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__console_output = new long[]{412, 412};

	/**
	 * Field descriptor (offset) for struct member 'console_input'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__console_input);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_console_input = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'console_input'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__console_input = new long[]{416, 416};

	/**
	 * Field descriptor (offset) for struct member 'console_info'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__console_info);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_console_info = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'console_info'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__console_info = new long[]{420, 420};

	/**
	 * Field descriptor (offset) for struct member 'console_error'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__console_error);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_console_error = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'console_error'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__console_error = new long[]{424, 424};

	/**
	 * Field descriptor (offset) for struct member 'console_cursor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__console_cursor);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_console_cursor = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'console_cursor'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__console_cursor = new long[]{428, 428};

	/**
	 * Field descriptor (offset) for struct member 'console_select'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__console_select);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_console_select = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'console_select'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__console_select = new long[]{432, 432};

	/**
	 * Field descriptor (offset) for struct member 'vertex_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__vertex_size);
	 * CPointer&lt;Byte&gt; p_vertex_size = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertex_size'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertex_size = new long[]{436, 436};

	/**
	 * Field descriptor (offset) for struct member 'outline_width'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__outline_width);
	 * CPointer&lt;Byte&gt; p_outline_width = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'outline_width'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__outline_width = new long[]{437, 437};

	/**
	 * Field descriptor (offset) for struct member 'facedot_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__facedot_size);
	 * CPointer&lt;Byte&gt; p_facedot_size = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'facedot_size'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__facedot_size = new long[]{438, 438};

	/**
	 * Field descriptor (offset) for struct member 'noodle_curving'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__noodle_curving);
	 * CPointer&lt;Byte&gt; p_noodle_curving = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noodle_curving'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noodle_curving = new long[]{439, 439};

	/**
	 * Field descriptor (offset) for struct member 'syntaxl'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> syntax for textwindow and nodes </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__syntaxl);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_syntaxl = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'syntaxl'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__syntaxl = new long[]{440, 440};

	/**
	 * Field descriptor (offset) for struct member 'syntaxs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__syntaxs);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_syntaxs = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'syntaxs'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__syntaxs = new long[]{444, 444};

	/**
	 * Field descriptor (offset) for struct member 'syntaxb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__syntaxb);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_syntaxb = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'syntaxb'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__syntaxb = new long[]{448, 448};

	/**
	 * Field descriptor (offset) for struct member 'syntaxn'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__syntaxn);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_syntaxn = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'syntaxn'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__syntaxn = new long[]{452, 452};

	/**
	 * Field descriptor (offset) for struct member 'syntaxv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__syntaxv);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_syntaxv = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'syntaxv'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__syntaxv = new long[]{456, 456};

	/**
	 * Field descriptor (offset) for struct member 'syntaxc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__syntaxc);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_syntaxc = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'syntaxc'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__syntaxc = new long[]{460, 460};

	/**
	 * Field descriptor (offset) for struct member 'syntaxd'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__syntaxd);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_syntaxd = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'syntaxd'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__syntaxd = new long[]{464, 464};

	/**
	 * Field descriptor (offset) for struct member 'syntaxr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__syntaxr);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_syntaxr = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'syntaxr'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__syntaxr = new long[]{468, 468};

	/**
	 * Field descriptor (offset) for struct member 'nodeclass_output'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nodeclass_output);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nodeclass_output = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodeclass_output'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodeclass_output = new long[]{472, 472};

	/**
	 * Field descriptor (offset) for struct member 'nodeclass_filter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nodeclass_filter);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nodeclass_filter = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodeclass_filter'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodeclass_filter = new long[]{476, 476};

	/**
	 * Field descriptor (offset) for struct member 'nodeclass_vector'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nodeclass_vector);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nodeclass_vector = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodeclass_vector'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodeclass_vector = new long[]{480, 480};

	/**
	 * Field descriptor (offset) for struct member 'nodeclass_texture'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nodeclass_texture);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nodeclass_texture = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodeclass_texture'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodeclass_texture = new long[]{484, 484};

	/**
	 * Field descriptor (offset) for struct member 'nodeclass_shader'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nodeclass_shader);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nodeclass_shader = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodeclass_shader'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodeclass_shader = new long[]{488, 488};

	/**
	 * Field descriptor (offset) for struct member 'nodeclass_script'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nodeclass_script);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nodeclass_script = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodeclass_script'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodeclass_script = new long[]{492, 492};

	/**
	 * Field descriptor (offset) for struct member 'nodeclass_pattern'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nodeclass_pattern);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nodeclass_pattern = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodeclass_pattern'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodeclass_pattern = new long[]{496, 496};

	/**
	 * Field descriptor (offset) for struct member 'nodeclass_layout'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nodeclass_layout);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nodeclass_layout = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodeclass_layout'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodeclass_layout = new long[]{500, 500};

	/**
	 * Field descriptor (offset) for struct member 'movie'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__movie);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_movie = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'movie'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__movie = new long[]{504, 504};

	/**
	 * Field descriptor (offset) for struct member 'movieclip'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__movieclip);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_movieclip = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'movieclip'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__movieclip = new long[]{508, 508};

	/**
	 * Field descriptor (offset) for struct member 'mask'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__mask);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_mask = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask = new long[]{512, 512};

	/**
	 * Field descriptor (offset) for struct member 'image'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__image);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_image = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image = new long[]{516, 516};

	/**
	 * Field descriptor (offset) for struct member 'scene'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__scene);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_scene = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scene'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scene = new long[]{520, 520};

	/**
	 * Field descriptor (offset) for struct member 'audio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for sequence editor </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__audio);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_audio = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audio'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audio = new long[]{524, 524};

	/**
	 * Field descriptor (offset) for struct member 'effect'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__effect);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_effect = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effect'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effect = new long[]{528, 528};

	/**
	 * Field descriptor (offset) for struct member 'transition'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__transition);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_transition = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transition'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transition = new long[]{532, 532};

	/**
	 * Field descriptor (offset) for struct member 'meta'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__meta);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_meta = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'meta'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__meta = new long[]{536, 536};

	/**
	 * Field descriptor (offset) for struct member 'text_strip'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__text_strip);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_text_strip = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text_strip'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text_strip = new long[]{540, 540};

	/**
	 * Field descriptor (offset) for struct member 'keyframe_scale_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for dopesheet - scale factor for size of keyframes (i.e. height of channels) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__keyframe_scale_fac);
	 * CPointer&lt;Float&gt; p_keyframe_scale_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyframe_scale_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyframe_scale_fac = new long[]{544, 544};

	/**
	 * Field descriptor (offset) for struct member 'editmesh_active'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__editmesh_active);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_editmesh_active = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'editmesh_active'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__editmesh_active = new long[]{548, 548};

	/**
	 * Field descriptor (offset) for struct member 'handle_vertex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__handle_vertex);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_handle_vertex = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_vertex'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_vertex = new long[]{552, 552};

	/**
	 * Field descriptor (offset) for struct member 'handle_vertex_select'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__handle_vertex_select);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_handle_vertex_select = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_vertex_select'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_vertex_select = new long[]{556, 556};

	/**
	 * Field descriptor (offset) for struct member 'handle_vertex_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__handle_vertex_size);
	 * CPointer&lt;Byte&gt; p_handle_vertex_size = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handle_vertex_size'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handle_vertex_size = new long[]{560, 560};

	/**
	 * Field descriptor (offset) for struct member 'clipping_border_3d'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__clipping_border_3d);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_clipping_border_3d = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clipping_border_3d'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clipping_border_3d = new long[]{561, 561};

	/**
	 * Field descriptor (offset) for struct member 'marker_outline'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__marker_outline);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_marker_outline = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'marker_outline'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__marker_outline = new long[]{565, 565};

	/**
	 * Field descriptor (offset) for struct member 'marker'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__marker);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_marker = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'marker'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__marker = new long[]{569, 569};

	/**
	 * Field descriptor (offset) for struct member 'act_marker'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__act_marker);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_act_marker = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_marker'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_marker = new long[]{573, 573};

	/**
	 * Field descriptor (offset) for struct member 'sel_marker'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__sel_marker);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_sel_marker = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sel_marker'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sel_marker = new long[]{577, 577};

	/**
	 * Field descriptor (offset) for struct member 'dis_marker'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__dis_marker);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_dis_marker = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dis_marker'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dis_marker = new long[]{581, 581};

	/**
	 * Field descriptor (offset) for struct member 'lock_marker'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__lock_marker);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_lock_marker = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lock_marker'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lock_marker = new long[]{585, 585};

	/**
	 * Field descriptor (offset) for struct member 'bundle_solid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__bundle_solid);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_bundle_solid = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bundle_solid'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bundle_solid = new long[]{589, 589};

	/**
	 * Field descriptor (offset) for struct member 'path_before'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__path_before);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_path_before = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path_before'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path_before = new long[]{593, 593};

	/**
	 * Field descriptor (offset) for struct member 'path_after'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__path_after);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_path_after = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path_after'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path_after = new long[]{597, 597};

	/**
	 * Field descriptor (offset) for struct member 'camera_path'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__camera_path);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_camera_path = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'camera_path'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__camera_path = new long[]{601, 601};

	/**
	 * Field descriptor (offset) for struct member 'hpad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__hpad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_hpad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hpad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hpad = new long[]{605, 605};

	/**
	 * Field descriptor (offset) for struct member 'gp_vertex_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__gp_vertex_size);
	 * CPointer&lt;Byte&gt; p_gp_vertex_size = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_vertex_size'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_vertex_size = new long[]{607, 607};

	/**
	 * Field descriptor (offset) for struct member 'gp_vertex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__gp_vertex);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_gp_vertex = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_vertex'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_vertex = new long[]{608, 608};

	/**
	 * Field descriptor (offset) for struct member 'gp_vertex_select'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__gp_vertex_select);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_gp_vertex_select = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_vertex_select'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_vertex_select = new long[]{612, 612};

	/**
	 * Field descriptor (offset) for struct member 'preview_back'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__preview_back);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_preview_back = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview_back'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview_back = new long[]{616, 616};

	/**
	 * Field descriptor (offset) for struct member 'preview_stitch_face'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__preview_stitch_face);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_preview_stitch_face = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview_stitch_face'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview_stitch_face = new long[]{620, 620};

	/**
	 * Field descriptor (offset) for struct member 'preview_stitch_edge'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__preview_stitch_edge);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_preview_stitch_edge = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview_stitch_edge'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview_stitch_edge = new long[]{624, 624};

	/**
	 * Field descriptor (offset) for struct member 'preview_stitch_vert'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__preview_stitch_vert);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_preview_stitch_vert = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview_stitch_vert'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview_stitch_vert = new long[]{628, 628};

	/**
	 * Field descriptor (offset) for struct member 'preview_stitch_stitchable'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__preview_stitch_stitchable);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_preview_stitch_stitchable = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview_stitch_stitchable'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview_stitch_stitchable = new long[]{632, 632};

	/**
	 * Field descriptor (offset) for struct member 'preview_stitch_unstitchable'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__preview_stitch_unstitchable);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_preview_stitch_unstitchable = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview_stitch_unstitchable'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview_stitch_unstitchable = new long[]{636, 636};

	/**
	 * Field descriptor (offset) for struct member 'preview_stitch_active'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__preview_stitch_active);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_preview_stitch_active = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview_stitch_active'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview_stitch_active = new long[]{640, 640};

	/**
	 * Field descriptor (offset) for struct member 'uv_shadow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> two uses, for uvs with modifier applied on mesh and uvs during painting </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__uv_shadow);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_uv_shadow = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_shadow'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_shadow = new long[]{644, 644};

	/**
	 * Field descriptor (offset) for struct member 'uv_others'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> uvs of other objects </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__uv_others);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_uv_others = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_others'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_others = new long[]{648, 648};

	/**
	 * Field descriptor (offset) for struct member 'match'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> outliner - filter match </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__match);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_match = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'match'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__match = new long[]{652, 652};

	/**
	 * Field descriptor (offset) for struct member 'selected_highlight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> outliner - selected item </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__selected_highlight);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_selected_highlight = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'selected_highlight'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__selected_highlight = new long[]{656, 656};

	/**
	 * Field descriptor (offset) for struct member 'skin_root'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Skin modifier root color </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__skin_root);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_skin_root = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skin_root'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skin_root = new long[]{660, 660};

	/**
	 * Field descriptor (offset) for struct member 'anim_active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA Active Action + Summary Channel </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__anim_active);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_anim_active = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anim_active'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anim_active = new long[]{664, 664};

	/**
	 * Field descriptor (offset) for struct member 'anim_non_active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active Action = NULL </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__anim_non_active);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_anim_non_active = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anim_non_active'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anim_non_active = new long[]{668, 668};

	/**
	 * Field descriptor (offset) for struct member 'nla_tweaking'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA 'Tweaking' action/strip </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nla_tweaking);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nla_tweaking = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nla_tweaking'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nla_tweaking = new long[]{672, 672};

	/**
	 * Field descriptor (offset) for struct member 'nla_tweakdupli'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA - warning color for duplicate instances of tweaking strip </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nla_tweakdupli);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nla_tweakdupli = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nla_tweakdupli'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nla_tweakdupli = new long[]{676, 676};

	/**
	 * Field descriptor (offset) for struct member 'nla_transition'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nla_transition);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nla_transition = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nla_transition'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nla_transition = new long[]{680, 680};

	/**
	 * Field descriptor (offset) for struct member 'nla_transition_sel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA "Transition" strips </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nla_transition_sel);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nla_transition_sel = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nla_transition_sel'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nla_transition_sel = new long[]{684, 684};

	/**
	 * Field descriptor (offset) for struct member 'nla_meta'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nla_meta);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nla_meta = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nla_meta'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nla_meta = new long[]{688, 688};

	/**
	 * Field descriptor (offset) for struct member 'nla_meta_sel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA "Meta" strips </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nla_meta_sel);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nla_meta_sel = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nla_meta_sel'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nla_meta_sel = new long[]{692, 692};

	/**
	 * Field descriptor (offset) for struct member 'nla_sound'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nla_sound);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nla_sound = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nla_sound'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nla_sound = new long[]{696, 696};

	/**
	 * Field descriptor (offset) for struct member 'nla_sound_sel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA "Sound" strips </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__nla_sound_sel);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_nla_sound_sel = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nla_sound_sel'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nla_sound_sel = new long[]{700, 700};

	/**
	 * Field descriptor (offset) for struct member 'info_selected'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> info </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__info_selected);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_info_selected = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'info_selected'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__info_selected = new long[]{704, 704};

	/**
	 * Field descriptor (offset) for struct member 'info_selected_text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__info_selected_text);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_info_selected_text = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'info_selected_text'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__info_selected_text = new long[]{708, 708};

	/**
	 * Field descriptor (offset) for struct member 'info_error'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__info_error);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_info_error = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'info_error'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__info_error = new long[]{712, 712};

	/**
	 * Field descriptor (offset) for struct member 'info_error_text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__info_error_text);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_info_error_text = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'info_error_text'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__info_error_text = new long[]{716, 716};

	/**
	 * Field descriptor (offset) for struct member 'info_warning'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__info_warning);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_info_warning = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'info_warning'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__info_warning = new long[]{720, 720};

	/**
	 * Field descriptor (offset) for struct member 'info_warning_text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__info_warning_text);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_info_warning_text = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'info_warning_text'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__info_warning_text = new long[]{724, 724};

	/**
	 * Field descriptor (offset) for struct member 'info_info'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__info_info);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_info_info = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'info_info'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__info_info = new long[]{728, 728};

	/**
	 * Field descriptor (offset) for struct member 'info_info_text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__info_info_text);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_info_info_text = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'info_info_text'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__info_info_text = new long[]{732, 732};

	/**
	 * Field descriptor (offset) for struct member 'info_debug'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__info_debug);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_info_debug = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'info_debug'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__info_debug = new long[]{736, 736};

	/**
	 * Field descriptor (offset) for struct member 'info_debug_text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__info_debug_text);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_info_debug_text = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'info_debug_text'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__info_debug_text = new long[]{740, 740};

	/**
	 * Field descriptor (offset) for struct member 'paint_curve_pivot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__paint_curve_pivot);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_paint_curve_pivot = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint_curve_pivot'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint_curve_pivot = new long[]{744, 744};

	/**
	 * Field descriptor (offset) for struct member 'paint_curve_handle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__paint_curve_handle);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_paint_curve_handle = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint_curve_handle'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint_curve_handle = new long[]{748, 748};

	/**
	 * Field descriptor (offset) for struct member 'metadatabg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__metadatabg);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_metadatabg = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'metadatabg'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__metadatabg = new long[]{752, 752};

	/**
	 * Field descriptor (offset) for struct member 'metadatatext'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeSpace themespace = ...;
	 * CPointer&lt;Object&gt; p = themespace.__dna__addressof(ThemeSpace.__DNA__FIELD__metadatatext);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_metadatatext = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'metadatatext'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__metadatatext = new long[]{756, 756};

	public ThemeSpace(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ThemeSpace(ThemeSpace that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'back'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> main window colors </p>
	 * @see #__DNA__FIELD__back
	 */
	
	public CArrayFacade<Byte> getBack() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'back'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> main window colors </p>
	 * @see #__DNA__FIELD__back
	 */
	
	public void setBack(CArrayFacade<Byte> back) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(back, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, back)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, back);
		} else {
			__io__generic__copy( getBack(), back);
		}
	}

	/**
	 * Get method for struct member 'title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panel title </p>
	 * @see #__DNA__FIELD__title
	 */
	
	public CArrayFacade<Byte> getTitle() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panel title </p>
	 * @see #__DNA__FIELD__title
	 */
	
	public void setTitle(CArrayFacade<Byte> title) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(title, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, title)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, title);
		} else {
			__io__generic__copy( getTitle(), title);
		}
	}

	/**
	 * Get method for struct member 'text'.
	 * @see #__DNA__FIELD__text
	 */
	
	public CArrayFacade<Byte> getText() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'text'.
	 * @see #__DNA__FIELD__text
	 */
	
	public void setText(CArrayFacade<Byte> text) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
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
	 * Get method for struct member 'text_hi'.
	 * @see #__DNA__FIELD__text_hi
	 */
	
	public CArrayFacade<Byte> getText_hi() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'text_hi'.
	 * @see #__DNA__FIELD__text_hi
	 */
	
	public void setText_hi(CArrayFacade<Byte> text_hi) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(text_hi, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, text_hi)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, text_hi);
		} else {
			__io__generic__copy( getText_hi(), text_hi);
		}
	}

	/**
	 * Get method for struct member 'header'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> header colors region background </p>
	 * @see #__DNA__FIELD__header
	 */
	
	public CArrayFacade<Byte> getHeader() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'header'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> header colors region background </p>
	 * @see #__DNA__FIELD__header
	 */
	
	public void setHeader(CArrayFacade<Byte> header) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(header, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, header)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, header);
		} else {
			__io__generic__copy( getHeader(), header);
		}
	}

	/**
	 * Get method for struct member 'header_title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unused </p>
	 * @see #__DNA__FIELD__header_title
	 */
	
	public CArrayFacade<Byte> getHeader_title() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'header_title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unused </p>
	 * @see #__DNA__FIELD__header_title
	 */
	
	public void setHeader_title(CArrayFacade<Byte> header_title) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(header_title, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, header_title)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, header_title);
		} else {
			__io__generic__copy( getHeader_title(), header_title);
		}
	}

	/**
	 * Get method for struct member 'header_text'.
	 * @see #__DNA__FIELD__header_text
	 */
	
	public CArrayFacade<Byte> getHeader_text() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'header_text'.
	 * @see #__DNA__FIELD__header_text
	 */
	
	public void setHeader_text(CArrayFacade<Byte> header_text) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(header_text, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, header_text)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, header_text);
		} else {
			__io__generic__copy( getHeader_text(), header_text);
		}
	}

	/**
	 * Get method for struct member 'header_text_hi'.
	 * @see #__DNA__FIELD__header_text_hi
	 */
	
	public CArrayFacade<Byte> getHeader_text_hi() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'header_text_hi'.
	 * @see #__DNA__FIELD__header_text_hi
	 */
	
	public void setHeader_text_hi(CArrayFacade<Byte> header_text_hi) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 28;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(header_text_hi, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, header_text_hi)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, header_text_hi);
		} else {
			__io__generic__copy( getHeader_text_hi(), header_text_hi);
		}
	}

	/**
	 * Get method for struct member 'tab_active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> region tabs </p>
	 * @see #__DNA__FIELD__tab_active
	 */
	
	public CArrayFacade<Byte> getTab_active() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tab_active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> region tabs </p>
	 * @see #__DNA__FIELD__tab_active
	 */
	
	public void setTab_active(CArrayFacade<Byte> tab_active) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(tab_active, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tab_active)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tab_active);
		} else {
			__io__generic__copy( getTab_active(), tab_active);
		}
	}

	/**
	 * Get method for struct member 'tab_inactive'.
	 * @see #__DNA__FIELD__tab_inactive
	 */
	
	public CArrayFacade<Byte> getTab_inactive() throws IOException
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
	 * Set method for struct member 'tab_inactive'.
	 * @see #__DNA__FIELD__tab_inactive
	 */
	
	public void setTab_inactive(CArrayFacade<Byte> tab_inactive) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 36;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(tab_inactive, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tab_inactive)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tab_inactive);
		} else {
			__io__generic__copy( getTab_inactive(), tab_inactive);
		}
	}

	/**
	 * Get method for struct member 'tab_back'.
	 * @see #__DNA__FIELD__tab_back
	 */
	
	public CArrayFacade<Byte> getTab_back() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tab_back'.
	 * @see #__DNA__FIELD__tab_back
	 */
	
	public void setTab_back(CArrayFacade<Byte> tab_back) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(tab_back, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tab_back)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tab_back);
		} else {
			__io__generic__copy( getTab_back(), tab_back);
		}
	}

	/**
	 * Get method for struct member 'tab_outline'.
	 * @see #__DNA__FIELD__tab_outline
	 */
	
	public CArrayFacade<Byte> getTab_outline() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tab_outline'.
	 * @see #__DNA__FIELD__tab_outline
	 */
	
	public void setTab_outline(CArrayFacade<Byte> tab_outline) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 44;
		} else {
			__dna__offset = 44;
		}
		if (__io__equals(tab_outline, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tab_outline)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tab_outline);
		} else {
			__io__generic__copy( getTab_outline(), tab_outline);
		}
	}

	/**
	 * Get method for struct member 'button'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> button/tool regions region background </p>
	 * @see #__DNA__FIELD__button
	 */
	
	public CArrayFacade<Byte> getButton() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'button'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> button/tool regions region background </p>
	 * @see #__DNA__FIELD__button
	 */
	
	public void setButton(CArrayFacade<Byte> button) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(button, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, button)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, button);
		} else {
			__io__generic__copy( getButton(), button);
		}
	}

	/**
	 * Get method for struct member 'button_title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panel title </p>
	 * @see #__DNA__FIELD__button_title
	 */
	
	public CArrayFacade<Byte> getButton_title() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 52, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 52, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'button_title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panel title </p>
	 * @see #__DNA__FIELD__button_title
	 */
	
	public void setButton_title(CArrayFacade<Byte> button_title) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 52;
		} else {
			__dna__offset = 52;
		}
		if (__io__equals(button_title, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, button_title)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, button_title);
		} else {
			__io__generic__copy( getButton_title(), button_title);
		}
	}

	/**
	 * Get method for struct member 'button_text'.
	 * @see #__DNA__FIELD__button_text
	 */
	
	public CArrayFacade<Byte> getButton_text() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'button_text'.
	 * @see #__DNA__FIELD__button_text
	 */
	
	public void setButton_text(CArrayFacade<Byte> button_text) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 56;
		}
		if (__io__equals(button_text, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, button_text)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, button_text);
		} else {
			__io__generic__copy( getButton_text(), button_text);
		}
	}

	/**
	 * Get method for struct member 'button_text_hi'.
	 * @see #__DNA__FIELD__button_text_hi
	 */
	
	public CArrayFacade<Byte> getButton_text_hi() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'button_text_hi'.
	 * @see #__DNA__FIELD__button_text_hi
	 */
	
	public void setButton_text_hi(CArrayFacade<Byte> button_text_hi) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 60;
		} else {
			__dna__offset = 60;
		}
		if (__io__equals(button_text_hi, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, button_text_hi)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, button_text_hi);
		} else {
			__io__generic__copy( getButton_text_hi(), button_text_hi);
		}
	}

	/**
	 * Get method for struct member 'list'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> listview regions region background </p>
	 * @see #__DNA__FIELD__list
	 */
	
	public CArrayFacade<Byte> getList() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'list'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> listview regions region background </p>
	 * @see #__DNA__FIELD__list
	 */
	
	public void setList(CArrayFacade<Byte> list) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(list, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, list)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, list);
		} else {
			__io__generic__copy( getList(), list);
		}
	}

	/**
	 * Get method for struct member 'list_title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panel title </p>
	 * @see #__DNA__FIELD__list_title
	 */
	
	public CArrayFacade<Byte> getList_title() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 68, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 68, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'list_title'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> panel title </p>
	 * @see #__DNA__FIELD__list_title
	 */
	
	public void setList_title(CArrayFacade<Byte> list_title) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 68;
		} else {
			__dna__offset = 68;
		}
		if (__io__equals(list_title, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, list_title)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, list_title);
		} else {
			__io__generic__copy( getList_title(), list_title);
		}
	}

	/**
	 * Get method for struct member 'list_text'.
	 * @see #__DNA__FIELD__list_text
	 */
	
	public CArrayFacade<Byte> getList_text() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'list_text'.
	 * @see #__DNA__FIELD__list_text
	 */
	
	public void setList_text(CArrayFacade<Byte> list_text) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(list_text, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, list_text)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, list_text);
		} else {
			__io__generic__copy( getList_text(), list_text);
		}
	}

	/**
	 * Get method for struct member 'list_text_hi'.
	 * @see #__DNA__FIELD__list_text_hi
	 */
	
	public CArrayFacade<Byte> getList_text_hi() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'list_text_hi'.
	 * @see #__DNA__FIELD__list_text_hi
	 */
	
	public void setList_text_hi(CArrayFacade<Byte> list_text_hi) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 76;
		} else {
			__dna__offset = 76;
		}
		if (__io__equals(list_text_hi, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, list_text_hi)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, list_text_hi);
		} else {
			__io__generic__copy( getList_text_hi(), list_text_hi);
		}
	}

	/**
	 * Get method for struct member 'panelcolors'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> float panel char panel[4]; unused char panel_title[4]; unused char panel_text[4]; unused char panel_text_hi[4]; unused note, cannot use name 'panel' because of DNA mapping old files </p>
	 * @see #__DNA__FIELD__panelcolors
	 */
	
	public uiPanelColors getPanelcolors() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiPanelColors(__io__address + 80, __io__block, __io__blockTable);
		} else {
			return new uiPanelColors(__io__address + 80, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'panelcolors'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> float panel char panel[4]; unused char panel_title[4]; unused char panel_text[4]; unused char panel_text_hi[4]; unused note, cannot use name 'panel' because of DNA mapping old files </p>
	 * @see #__DNA__FIELD__panelcolors
	 */
	
	public void setPanelcolors(uiPanelColors panelcolors) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(panelcolors, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, panelcolors)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, panelcolors);
		} else {
			__io__generic__copy( getPanelcolors(), panelcolors);
		}
	}

	/**
	 * Get method for struct member 'gradients'.
	 * @see #__DNA__FIELD__gradients
	 */
	
	public uiGradientColors getGradients() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiGradientColors(__io__address + 96, __io__block, __io__blockTable);
		} else {
			return new uiGradientColors(__io__address + 96, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gradients'.
	 * @see #__DNA__FIELD__gradients
	 */
	
	public void setGradients(uiGradientColors gradients) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(gradients, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gradients)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gradients);
		} else {
			__io__generic__copy( getGradients(), gradients);
		}
	}

	/**
	 * Get method for struct member 'shade1'.
	 * @see #__DNA__FIELD__shade1
	 */
	
	public CArrayFacade<Byte> getShade1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shade1'.
	 * @see #__DNA__FIELD__shade1
	 */
	
	public void setShade1(CArrayFacade<Byte> shade1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 112;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(shade1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shade1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shade1);
		} else {
			__io__generic__copy( getShade1(), shade1);
		}
	}

	/**
	 * Get method for struct member 'shade2'.
	 * @see #__DNA__FIELD__shade2
	 */
	
	public CArrayFacade<Byte> getShade2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shade2'.
	 * @see #__DNA__FIELD__shade2
	 */
	
	public void setShade2(CArrayFacade<Byte> shade2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 116;
		} else {
			__dna__offset = 116;
		}
		if (__io__equals(shade2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shade2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shade2);
		} else {
			__io__generic__copy( getShade2(), shade2);
		}
	}

	/**
	 * Get method for struct member 'hilite'.
	 * @see #__DNA__FIELD__hilite
	 */
	
	public CArrayFacade<Byte> getHilite() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'hilite'.
	 * @see #__DNA__FIELD__hilite
	 */
	
	public void setHilite(CArrayFacade<Byte> hilite) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(hilite, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, hilite)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, hilite);
		} else {
			__io__generic__copy( getHilite(), hilite);
		}
	}

	/**
	 * Get method for struct member 'grid'.
	 * @see #__DNA__FIELD__grid
	 */
	
	public CArrayFacade<Byte> getGrid() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'grid'.
	 * @see #__DNA__FIELD__grid
	 */
	
	public void setGrid(CArrayFacade<Byte> grid) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 124;
		} else {
			__dna__offset = 124;
		}
		if (__io__equals(grid, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, grid)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, grid);
		} else {
			__io__generic__copy( getGrid(), grid);
		}
	}

	/**
	 * Get method for struct member 'view_overlay'.
	 * @see #__DNA__FIELD__view_overlay
	 */
	
	public CArrayFacade<Byte> getView_overlay() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'view_overlay'.
	 * @see #__DNA__FIELD__view_overlay
	 */
	
	public void setView_overlay(CArrayFacade<Byte> view_overlay) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 128;
		}
		if (__io__equals(view_overlay, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, view_overlay)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, view_overlay);
		} else {
			__io__generic__copy( getView_overlay(), view_overlay);
		}
	}

	/**
	 * Get method for struct member 'wire'.
	 * @see #__DNA__FIELD__wire
	 */
	
	public CArrayFacade<Byte> getWire() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wire'.
	 * @see #__DNA__FIELD__wire
	 */
	
	public void setWire(CArrayFacade<Byte> wire) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 132;
		} else {
			__dna__offset = 132;
		}
		if (__io__equals(wire, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wire)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wire);
		} else {
			__io__generic__copy( getWire(), wire);
		}
	}

	/**
	 * Get method for struct member 'wire_edit'.
	 * @see #__DNA__FIELD__wire_edit
	 */
	
	public CArrayFacade<Byte> getWire_edit() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wire_edit'.
	 * @see #__DNA__FIELD__wire_edit
	 */
	
	public void setWire_edit(CArrayFacade<Byte> wire_edit) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 136;
		} else {
			__dna__offset = 136;
		}
		if (__io__equals(wire_edit, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wire_edit)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wire_edit);
		} else {
			__io__generic__copy( getWire_edit(), wire_edit);
		}
	}

	/**
	 * Get method for struct member 'select'.
	 * @see #__DNA__FIELD__select
	 */
	
	public CArrayFacade<Byte> getSelect() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'select'.
	 * @see #__DNA__FIELD__select
	 */
	
	public void setSelect(CArrayFacade<Byte> select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 140;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, select);
		} else {
			__io__generic__copy( getSelect(), select);
		}
	}

	/**
	 * Get method for struct member 'lamp'.
	 * @see #__DNA__FIELD__lamp
	 */
	
	public CArrayFacade<Byte> getLamp() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lamp'.
	 * @see #__DNA__FIELD__lamp
	 */
	
	public void setLamp(CArrayFacade<Byte> lamp) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 144;
		}
		if (__io__equals(lamp, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lamp)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lamp);
		} else {
			__io__generic__copy( getLamp(), lamp);
		}
	}

	/**
	 * Get method for struct member 'speaker'.
	 * @see #__DNA__FIELD__speaker
	 */
	
	public CArrayFacade<Byte> getSpeaker() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'speaker'.
	 * @see #__DNA__FIELD__speaker
	 */
	
	public void setSpeaker(CArrayFacade<Byte> speaker) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 148;
		} else {
			__dna__offset = 148;
		}
		if (__io__equals(speaker, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, speaker)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, speaker);
		} else {
			__io__generic__copy( getSpeaker(), speaker);
		}
	}

	/**
	 * Get method for struct member 'empty'.
	 * @see #__DNA__FIELD__empty
	 */
	
	public CArrayFacade<Byte> getEmpty() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'empty'.
	 * @see #__DNA__FIELD__empty
	 */
	
	public void setEmpty(CArrayFacade<Byte> empty) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 152;
		}
		if (__io__equals(empty, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, empty)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, empty);
		} else {
			__io__generic__copy( getEmpty(), empty);
		}
	}

	/**
	 * Get method for struct member 'camera'.
	 * @see #__DNA__FIELD__camera
	 */
	
	public CArrayFacade<Byte> getCamera() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'camera'.
	 * @see #__DNA__FIELD__camera
	 */
	
	public void setCamera(CArrayFacade<Byte> camera) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 156;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(camera, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, camera)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, camera);
		} else {
			__io__generic__copy( getCamera(), camera);
		}
	}

	/**
	 * Get method for struct member 'active'.
	 * @see #__DNA__FIELD__active
	 */
	
	public CArrayFacade<Byte> getActive() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'active'.
	 * @see #__DNA__FIELD__active
	 */
	
	public void setActive(CArrayFacade<Byte> active) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 160;
		}
		if (__io__equals(active, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, active)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, active);
		} else {
			__io__generic__copy( getActive(), active);
		}
	}

	/**
	 * Get method for struct member 'group'.
	 * @see #__DNA__FIELD__group
	 */
	
	public CArrayFacade<Byte> getGroup() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 164, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 164, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'group'.
	 * @see #__DNA__FIELD__group
	 */
	
	public void setGroup(CArrayFacade<Byte> group) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 164;
		} else {
			__dna__offset = 164;
		}
		if (__io__equals(group, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, group)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, group);
		} else {
			__io__generic__copy( getGroup(), group);
		}
	}

	/**
	 * Get method for struct member 'group_active'.
	 * @see #__DNA__FIELD__group_active
	 */
	
	public CArrayFacade<Byte> getGroup_active() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'group_active'.
	 * @see #__DNA__FIELD__group_active
	 */
	
	public void setGroup_active(CArrayFacade<Byte> group_active) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 168;
		}
		if (__io__equals(group_active, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, group_active)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, group_active);
		} else {
			__io__generic__copy( getGroup_active(), group_active);
		}
	}

	/**
	 * Get method for struct member 'transform'.
	 * @see #__DNA__FIELD__transform
	 */
	
	public CArrayFacade<Byte> getTransform() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'transform'.
	 * @see #__DNA__FIELD__transform
	 */
	
	public void setTransform(CArrayFacade<Byte> transform) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 172;
		} else {
			__dna__offset = 172;
		}
		if (__io__equals(transform, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, transform)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, transform);
		} else {
			__io__generic__copy( getTransform(), transform);
		}
	}

	/**
	 * Get method for struct member 'vertex'.
	 * @see #__DNA__FIELD__vertex
	 */
	
	public CArrayFacade<Byte> getVertex() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vertex'.
	 * @see #__DNA__FIELD__vertex
	 */
	
	public void setVertex(CArrayFacade<Byte> vertex) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 176;
		} else {
			__dna__offset = 176;
		}
		if (__io__equals(vertex, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vertex)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vertex);
		} else {
			__io__generic__copy( getVertex(), vertex);
		}
	}

	/**
	 * Get method for struct member 'vertex_select'.
	 * @see #__DNA__FIELD__vertex_select
	 */
	
	public CArrayFacade<Byte> getVertex_select() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vertex_select'.
	 * @see #__DNA__FIELD__vertex_select
	 */
	
	public void setVertex_select(CArrayFacade<Byte> vertex_select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 180;
		} else {
			__dna__offset = 180;
		}
		if (__io__equals(vertex_select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vertex_select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vertex_select);
		} else {
			__io__generic__copy( getVertex_select(), vertex_select);
		}
	}

	/**
	 * Get method for struct member 'vertex_bevel'.
	 * @see #__DNA__FIELD__vertex_bevel
	 */
	
	public CArrayFacade<Byte> getVertex_bevel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vertex_bevel'.
	 * @see #__DNA__FIELD__vertex_bevel
	 */
	
	public void setVertex_bevel(CArrayFacade<Byte> vertex_bevel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 184;
		}
		if (__io__equals(vertex_bevel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vertex_bevel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vertex_bevel);
		} else {
			__io__generic__copy( getVertex_bevel(), vertex_bevel);
		}
	}

	/**
	 * Get method for struct member 'vertex_unreferenced'.
	 * @see #__DNA__FIELD__vertex_unreferenced
	 */
	
	public CArrayFacade<Byte> getVertex_unreferenced() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vertex_unreferenced'.
	 * @see #__DNA__FIELD__vertex_unreferenced
	 */
	
	public void setVertex_unreferenced(CArrayFacade<Byte> vertex_unreferenced) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 188;
		} else {
			__dna__offset = 188;
		}
		if (__io__equals(vertex_unreferenced, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vertex_unreferenced)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vertex_unreferenced);
		} else {
			__io__generic__copy( getVertex_unreferenced(), vertex_unreferenced);
		}
	}

	/**
	 * Get method for struct member 'edge'.
	 * @see #__DNA__FIELD__edge
	 */
	
	public CArrayFacade<Byte> getEdge() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'edge'.
	 * @see #__DNA__FIELD__edge
	 */
	
	public void setEdge(CArrayFacade<Byte> edge) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 192;
		}
		if (__io__equals(edge, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, edge)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, edge);
		} else {
			__io__generic__copy( getEdge(), edge);
		}
	}

	/**
	 * Get method for struct member 'edge_select'.
	 * @see #__DNA__FIELD__edge_select
	 */
	
	public CArrayFacade<Byte> getEdge_select() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'edge_select'.
	 * @see #__DNA__FIELD__edge_select
	 */
	
	public void setEdge_select(CArrayFacade<Byte> edge_select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 196;
		} else {
			__dna__offset = 196;
		}
		if (__io__equals(edge_select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, edge_select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, edge_select);
		} else {
			__io__generic__copy( getEdge_select(), edge_select);
		}
	}

	/**
	 * Get method for struct member 'edge_seam'.
	 * @see #__DNA__FIELD__edge_seam
	 */
	
	public CArrayFacade<Byte> getEdge_seam() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'edge_seam'.
	 * @see #__DNA__FIELD__edge_seam
	 */
	
	public void setEdge_seam(CArrayFacade<Byte> edge_seam) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 200;
		}
		if (__io__equals(edge_seam, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, edge_seam)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, edge_seam);
		} else {
			__io__generic__copy( getEdge_seam(), edge_seam);
		}
	}

	/**
	 * Get method for struct member 'edge_sharp'.
	 * @see #__DNA__FIELD__edge_sharp
	 */
	
	public CArrayFacade<Byte> getEdge_sharp() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'edge_sharp'.
	 * @see #__DNA__FIELD__edge_sharp
	 */
	
	public void setEdge_sharp(CArrayFacade<Byte> edge_sharp) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 204;
		} else {
			__dna__offset = 204;
		}
		if (__io__equals(edge_sharp, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, edge_sharp)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, edge_sharp);
		} else {
			__io__generic__copy( getEdge_sharp(), edge_sharp);
		}
	}

	/**
	 * Get method for struct member 'edge_facesel'.
	 * @see #__DNA__FIELD__edge_facesel
	 */
	
	public CArrayFacade<Byte> getEdge_facesel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 208, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 208, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'edge_facesel'.
	 * @see #__DNA__FIELD__edge_facesel
	 */
	
	public void setEdge_facesel(CArrayFacade<Byte> edge_facesel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 208;
		}
		if (__io__equals(edge_facesel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, edge_facesel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, edge_facesel);
		} else {
			__io__generic__copy( getEdge_facesel(), edge_facesel);
		}
	}

	/**
	 * Get method for struct member 'edge_crease'.
	 * @see #__DNA__FIELD__edge_crease
	 */
	
	public CArrayFacade<Byte> getEdge_crease() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 212, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 212, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'edge_crease'.
	 * @see #__DNA__FIELD__edge_crease
	 */
	
	public void setEdge_crease(CArrayFacade<Byte> edge_crease) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 212;
		} else {
			__dna__offset = 212;
		}
		if (__io__equals(edge_crease, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, edge_crease)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, edge_crease);
		} else {
			__io__generic__copy( getEdge_crease(), edge_crease);
		}
	}

	/**
	 * Get method for struct member 'edge_bevel'.
	 * @see #__DNA__FIELD__edge_bevel
	 */
	
	public CArrayFacade<Byte> getEdge_bevel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'edge_bevel'.
	 * @see #__DNA__FIELD__edge_bevel
	 */
	
	public void setEdge_bevel(CArrayFacade<Byte> edge_bevel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 216;
		} else {
			__dna__offset = 216;
		}
		if (__io__equals(edge_bevel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, edge_bevel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, edge_bevel);
		} else {
			__io__generic__copy( getEdge_bevel(), edge_bevel);
		}
	}

	/**
	 * Get method for struct member 'face'.
	 * @see #__DNA__FIELD__face
	 */
	
	public CArrayFacade<Byte> getFace() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 220, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 220, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'face'.
	 * @see #__DNA__FIELD__face
	 */
	
	public void setFace(CArrayFacade<Byte> face) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 220;
		} else {
			__dna__offset = 220;
		}
		if (__io__equals(face, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, face)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, face);
		} else {
			__io__generic__copy( getFace(), face);
		}
	}

	/**
	 * Get method for struct member 'face_select'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> solid faces </p>
	 * @see #__DNA__FIELD__face_select
	 */
	
	public CArrayFacade<Byte> getFace_select() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 224, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 224, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'face_select'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> solid faces </p>
	 * @see #__DNA__FIELD__face_select
	 */
	
	public void setFace_select(CArrayFacade<Byte> face_select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 224;
		} else {
			__dna__offset = 224;
		}
		if (__io__equals(face_select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, face_select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, face_select);
		} else {
			__io__generic__copy( getFace_select(), face_select);
		}
	}

	/**
	 * Get method for struct member 'face_dot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> selected color </p>
	 * @see #__DNA__FIELD__face_dot
	 */
	
	public CArrayFacade<Byte> getFace_dot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 228, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 228, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'face_dot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> selected color </p>
	 * @see #__DNA__FIELD__face_dot
	 */
	
	public void setFace_dot(CArrayFacade<Byte> face_dot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 228;
		} else {
			__dna__offset = 228;
		}
		if (__io__equals(face_dot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, face_dot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, face_dot);
		} else {
			__io__generic__copy( getFace_dot(), face_dot);
		}
	}

	/**
	 * Get method for struct member 'extra_edge_len'.
	 * @see #__DNA__FIELD__extra_edge_len
	 */
	
	public CArrayFacade<Byte> getExtra_edge_len() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'extra_edge_len'.
	 * @see #__DNA__FIELD__extra_edge_len
	 */
	
	public void setExtra_edge_len(CArrayFacade<Byte> extra_edge_len) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 232;
		} else {
			__dna__offset = 232;
		}
		if (__io__equals(extra_edge_len, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, extra_edge_len)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, extra_edge_len);
		} else {
			__io__generic__copy( getExtra_edge_len(), extra_edge_len);
		}
	}

	/**
	 * Get method for struct member 'extra_edge_angle'.
	 * @see #__DNA__FIELD__extra_edge_angle
	 */
	
	public CArrayFacade<Byte> getExtra_edge_angle() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 236, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 236, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'extra_edge_angle'.
	 * @see #__DNA__FIELD__extra_edge_angle
	 */
	
	public void setExtra_edge_angle(CArrayFacade<Byte> extra_edge_angle) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 236;
		} else {
			__dna__offset = 236;
		}
		if (__io__equals(extra_edge_angle, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, extra_edge_angle)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, extra_edge_angle);
		} else {
			__io__generic__copy( getExtra_edge_angle(), extra_edge_angle);
		}
	}

	/**
	 * Get method for struct member 'extra_face_angle'.
	 * @see #__DNA__FIELD__extra_face_angle
	 */
	
	public CArrayFacade<Byte> getExtra_face_angle() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'extra_face_angle'.
	 * @see #__DNA__FIELD__extra_face_angle
	 */
	
	public void setExtra_face_angle(CArrayFacade<Byte> extra_face_angle) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 240;
		} else {
			__dna__offset = 240;
		}
		if (__io__equals(extra_face_angle, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, extra_face_angle)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, extra_face_angle);
		} else {
			__io__generic__copy( getExtra_face_angle(), extra_face_angle);
		}
	}

	/**
	 * Get method for struct member 'extra_face_area'.
	 * @see #__DNA__FIELD__extra_face_area
	 */
	
	public CArrayFacade<Byte> getExtra_face_area() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 244, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 244, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'extra_face_area'.
	 * @see #__DNA__FIELD__extra_face_area
	 */
	
	public void setExtra_face_area(CArrayFacade<Byte> extra_face_area) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 244;
		} else {
			__dna__offset = 244;
		}
		if (__io__equals(extra_face_area, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, extra_face_area)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, extra_face_area);
		} else {
			__io__generic__copy( getExtra_face_area(), extra_face_area);
		}
	}

	/**
	 * Get method for struct member 'normal'.
	 * @see #__DNA__FIELD__normal
	 */
	
	public CArrayFacade<Byte> getNormal() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 248, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'normal'.
	 * @see #__DNA__FIELD__normal
	 */
	
	public void setNormal(CArrayFacade<Byte> normal) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 248;
		} else {
			__dna__offset = 248;
		}
		if (__io__equals(normal, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, normal)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, normal);
		} else {
			__io__generic__copy( getNormal(), normal);
		}
	}

	/**
	 * Get method for struct member 'vertex_normal'.
	 * @see #__DNA__FIELD__vertex_normal
	 */
	
	public CArrayFacade<Byte> getVertex_normal() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 252, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 252, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vertex_normal'.
	 * @see #__DNA__FIELD__vertex_normal
	 */
	
	public void setVertex_normal(CArrayFacade<Byte> vertex_normal) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 252;
		} else {
			__dna__offset = 252;
		}
		if (__io__equals(vertex_normal, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vertex_normal)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vertex_normal);
		} else {
			__io__generic__copy( getVertex_normal(), vertex_normal);
		}
	}

	/**
	 * Get method for struct member 'loop_normal'.
	 * @see #__DNA__FIELD__loop_normal
	 */
	
	public CArrayFacade<Byte> getLoop_normal() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 256, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 256, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'loop_normal'.
	 * @see #__DNA__FIELD__loop_normal
	 */
	
	public void setLoop_normal(CArrayFacade<Byte> loop_normal) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 256;
		} else {
			__dna__offset = 256;
		}
		if (__io__equals(loop_normal, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, loop_normal)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, loop_normal);
		} else {
			__io__generic__copy( getLoop_normal(), loop_normal);
		}
	}

	/**
	 * Get method for struct member 'bone_solid'.
	 * @see #__DNA__FIELD__bone_solid
	 */
	
	public CArrayFacade<Byte> getBone_solid() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 260, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 260, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bone_solid'.
	 * @see #__DNA__FIELD__bone_solid
	 */
	
	public void setBone_solid(CArrayFacade<Byte> bone_solid) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 260;
		} else {
			__dna__offset = 260;
		}
		if (__io__equals(bone_solid, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bone_solid)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bone_solid);
		} else {
			__io__generic__copy( getBone_solid(), bone_solid);
		}
	}

	/**
	 * Get method for struct member 'bone_pose'.
	 * @see #__DNA__FIELD__bone_pose
	 */
	
	public CArrayFacade<Byte> getBone_pose() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 264, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 264, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bone_pose'.
	 * @see #__DNA__FIELD__bone_pose
	 */
	
	public void setBone_pose(CArrayFacade<Byte> bone_pose) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 264;
		} else {
			__dna__offset = 264;
		}
		if (__io__equals(bone_pose, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bone_pose)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bone_pose);
		} else {
			__io__generic__copy( getBone_pose(), bone_pose);
		}
	}

	/**
	 * Get method for struct member 'bone_pose_active'.
	 * @see #__DNA__FIELD__bone_pose_active
	 */
	
	public CArrayFacade<Byte> getBone_pose_active() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 268, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 268, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bone_pose_active'.
	 * @see #__DNA__FIELD__bone_pose_active
	 */
	
	public void setBone_pose_active(CArrayFacade<Byte> bone_pose_active) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 268;
		} else {
			__dna__offset = 268;
		}
		if (__io__equals(bone_pose_active, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bone_pose_active)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bone_pose_active);
		} else {
			__io__generic__copy( getBone_pose_active(), bone_pose_active);
		}
	}

	/**
	 * Get method for struct member 'strip'.
	 * @see #__DNA__FIELD__strip
	 */
	
	public CArrayFacade<Byte> getStrip() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 272, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 272, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'strip'.
	 * @see #__DNA__FIELD__strip
	 */
	
	public void setStrip(CArrayFacade<Byte> strip) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 272;
		} else {
			__dna__offset = 272;
		}
		if (__io__equals(strip, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, strip)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, strip);
		} else {
			__io__generic__copy( getStrip(), strip);
		}
	}

	/**
	 * Get method for struct member 'strip_select'.
	 * @see #__DNA__FIELD__strip_select
	 */
	
	public CArrayFacade<Byte> getStrip_select() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 276, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 276, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'strip_select'.
	 * @see #__DNA__FIELD__strip_select
	 */
	
	public void setStrip_select(CArrayFacade<Byte> strip_select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 276;
		} else {
			__dna__offset = 276;
		}
		if (__io__equals(strip_select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, strip_select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, strip_select);
		} else {
			__io__generic__copy( getStrip_select(), strip_select);
		}
	}

	/**
	 * Get method for struct member 'cframe'.
	 * @see #__DNA__FIELD__cframe
	 */
	
	public CArrayFacade<Byte> getCframe() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 280, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 280, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cframe'.
	 * @see #__DNA__FIELD__cframe
	 */
	
	public void setCframe(CArrayFacade<Byte> cframe) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 280;
		} else {
			__dna__offset = 280;
		}
		if (__io__equals(cframe, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cframe)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cframe);
		} else {
			__io__generic__copy( getCframe(), cframe);
		}
	}

	/**
	 * Get method for struct member 'time_keyframe'.
	 * @see #__DNA__FIELD__time_keyframe
	 */
	
	public CArrayFacade<Byte> getTime_keyframe() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 284, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 284, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'time_keyframe'.
	 * @see #__DNA__FIELD__time_keyframe
	 */
	
	public void setTime_keyframe(CArrayFacade<Byte> time_keyframe) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 284;
		} else {
			__dna__offset = 284;
		}
		if (__io__equals(time_keyframe, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, time_keyframe)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, time_keyframe);
		} else {
			__io__generic__copy( getTime_keyframe(), time_keyframe);
		}
	}

	/**
	 * Get method for struct member 'time_gp_keyframe'.
	 * @see #__DNA__FIELD__time_gp_keyframe
	 */
	
	public CArrayFacade<Byte> getTime_gp_keyframe() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 288, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 288, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'time_gp_keyframe'.
	 * @see #__DNA__FIELD__time_gp_keyframe
	 */
	
	public void setTime_gp_keyframe(CArrayFacade<Byte> time_gp_keyframe) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 288;
		} else {
			__dna__offset = 288;
		}
		if (__io__equals(time_gp_keyframe, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, time_gp_keyframe)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, time_gp_keyframe);
		} else {
			__io__generic__copy( getTime_gp_keyframe(), time_gp_keyframe);
		}
	}

	/**
	 * Get method for struct member 'freestyle_edge_mark'.
	 * @see #__DNA__FIELD__freestyle_edge_mark
	 */
	
	public CArrayFacade<Byte> getFreestyle_edge_mark() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 292, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 292, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'freestyle_edge_mark'.
	 * @see #__DNA__FIELD__freestyle_edge_mark
	 */
	
	public void setFreestyle_edge_mark(CArrayFacade<Byte> freestyle_edge_mark) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 292;
		} else {
			__dna__offset = 292;
		}
		if (__io__equals(freestyle_edge_mark, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, freestyle_edge_mark)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, freestyle_edge_mark);
		} else {
			__io__generic__copy( getFreestyle_edge_mark(), freestyle_edge_mark);
		}
	}

	/**
	 * Get method for struct member 'freestyle_face_mark'.
	 * @see #__DNA__FIELD__freestyle_face_mark
	 */
	
	public CArrayFacade<Byte> getFreestyle_face_mark() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 296, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 296, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'freestyle_face_mark'.
	 * @see #__DNA__FIELD__freestyle_face_mark
	 */
	
	public void setFreestyle_face_mark(CArrayFacade<Byte> freestyle_face_mark) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 296;
		} else {
			__dna__offset = 296;
		}
		if (__io__equals(freestyle_face_mark, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, freestyle_face_mark)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, freestyle_face_mark);
		} else {
			__io__generic__copy( getFreestyle_face_mark(), freestyle_face_mark);
		}
	}

	/**
	 * Get method for struct member 'nurb_uline'.
	 * @see #__DNA__FIELD__nurb_uline
	 */
	
	public CArrayFacade<Byte> getNurb_uline() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 300, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 300, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nurb_uline'.
	 * @see #__DNA__FIELD__nurb_uline
	 */
	
	public void setNurb_uline(CArrayFacade<Byte> nurb_uline) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 300;
		} else {
			__dna__offset = 300;
		}
		if (__io__equals(nurb_uline, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nurb_uline)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nurb_uline);
		} else {
			__io__generic__copy( getNurb_uline(), nurb_uline);
		}
	}

	/**
	 * Get method for struct member 'nurb_vline'.
	 * @see #__DNA__FIELD__nurb_vline
	 */
	
	public CArrayFacade<Byte> getNurb_vline() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 304, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 304, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nurb_vline'.
	 * @see #__DNA__FIELD__nurb_vline
	 */
	
	public void setNurb_vline(CArrayFacade<Byte> nurb_vline) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 304;
		} else {
			__dna__offset = 304;
		}
		if (__io__equals(nurb_vline, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nurb_vline)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nurb_vline);
		} else {
			__io__generic__copy( getNurb_vline(), nurb_vline);
		}
	}

	/**
	 * Get method for struct member 'act_spline'.
	 * @see #__DNA__FIELD__act_spline
	 */
	
	public CArrayFacade<Byte> getAct_spline() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 308, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 308, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'act_spline'.
	 * @see #__DNA__FIELD__act_spline
	 */
	
	public void setAct_spline(CArrayFacade<Byte> act_spline) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 308;
		} else {
			__dna__offset = 308;
		}
		if (__io__equals(act_spline, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, act_spline)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, act_spline);
		} else {
			__io__generic__copy( getAct_spline(), act_spline);
		}
	}

	/**
	 * Get method for struct member 'nurb_sel_uline'.
	 * @see #__DNA__FIELD__nurb_sel_uline
	 */
	
	public CArrayFacade<Byte> getNurb_sel_uline() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 312, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 312, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nurb_sel_uline'.
	 * @see #__DNA__FIELD__nurb_sel_uline
	 */
	
	public void setNurb_sel_uline(CArrayFacade<Byte> nurb_sel_uline) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 312;
		} else {
			__dna__offset = 312;
		}
		if (__io__equals(nurb_sel_uline, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nurb_sel_uline)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nurb_sel_uline);
		} else {
			__io__generic__copy( getNurb_sel_uline(), nurb_sel_uline);
		}
	}

	/**
	 * Get method for struct member 'nurb_sel_vline'.
	 * @see #__DNA__FIELD__nurb_sel_vline
	 */
	
	public CArrayFacade<Byte> getNurb_sel_vline() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 316, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 316, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nurb_sel_vline'.
	 * @see #__DNA__FIELD__nurb_sel_vline
	 */
	
	public void setNurb_sel_vline(CArrayFacade<Byte> nurb_sel_vline) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 316;
		} else {
			__dna__offset = 316;
		}
		if (__io__equals(nurb_sel_vline, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nurb_sel_vline)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nurb_sel_vline);
		} else {
			__io__generic__copy( getNurb_sel_vline(), nurb_sel_vline);
		}
	}

	/**
	 * Get method for struct member 'lastsel_point'.
	 * @see #__DNA__FIELD__lastsel_point
	 */
	
	public CArrayFacade<Byte> getLastsel_point() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 320, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 320, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lastsel_point'.
	 * @see #__DNA__FIELD__lastsel_point
	 */
	
	public void setLastsel_point(CArrayFacade<Byte> lastsel_point) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 320;
		} else {
			__dna__offset = 320;
		}
		if (__io__equals(lastsel_point, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lastsel_point)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lastsel_point);
		} else {
			__io__generic__copy( getLastsel_point(), lastsel_point);
		}
	}

	/**
	 * Get method for struct member 'handle_free'.
	 * @see #__DNA__FIELD__handle_free
	 */
	
	public CArrayFacade<Byte> getHandle_free() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 324, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 324, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handle_free'.
	 * @see #__DNA__FIELD__handle_free
	 */
	
	public void setHandle_free(CArrayFacade<Byte> handle_free) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 324;
		} else {
			__dna__offset = 324;
		}
		if (__io__equals(handle_free, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handle_free)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handle_free);
		} else {
			__io__generic__copy( getHandle_free(), handle_free);
		}
	}

	/**
	 * Get method for struct member 'handle_auto'.
	 * @see #__DNA__FIELD__handle_auto
	 */
	
	public CArrayFacade<Byte> getHandle_auto() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 328, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 328, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handle_auto'.
	 * @see #__DNA__FIELD__handle_auto
	 */
	
	public void setHandle_auto(CArrayFacade<Byte> handle_auto) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 328;
		} else {
			__dna__offset = 328;
		}
		if (__io__equals(handle_auto, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handle_auto)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handle_auto);
		} else {
			__io__generic__copy( getHandle_auto(), handle_auto);
		}
	}

	/**
	 * Get method for struct member 'handle_vect'.
	 * @see #__DNA__FIELD__handle_vect
	 */
	
	public CArrayFacade<Byte> getHandle_vect() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 332, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 332, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handle_vect'.
	 * @see #__DNA__FIELD__handle_vect
	 */
	
	public void setHandle_vect(CArrayFacade<Byte> handle_vect) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 332;
		} else {
			__dna__offset = 332;
		}
		if (__io__equals(handle_vect, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handle_vect)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handle_vect);
		} else {
			__io__generic__copy( getHandle_vect(), handle_vect);
		}
	}

	/**
	 * Get method for struct member 'handle_align'.
	 * @see #__DNA__FIELD__handle_align
	 */
	
	public CArrayFacade<Byte> getHandle_align() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 336, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 336, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handle_align'.
	 * @see #__DNA__FIELD__handle_align
	 */
	
	public void setHandle_align(CArrayFacade<Byte> handle_align) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 336;
		} else {
			__dna__offset = 336;
		}
		if (__io__equals(handle_align, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handle_align)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handle_align);
		} else {
			__io__generic__copy( getHandle_align(), handle_align);
		}
	}

	/**
	 * Get method for struct member 'handle_auto_clamped'.
	 * @see #__DNA__FIELD__handle_auto_clamped
	 */
	
	public CArrayFacade<Byte> getHandle_auto_clamped() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 340, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 340, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handle_auto_clamped'.
	 * @see #__DNA__FIELD__handle_auto_clamped
	 */
	
	public void setHandle_auto_clamped(CArrayFacade<Byte> handle_auto_clamped) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 340;
		} else {
			__dna__offset = 340;
		}
		if (__io__equals(handle_auto_clamped, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handle_auto_clamped)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handle_auto_clamped);
		} else {
			__io__generic__copy( getHandle_auto_clamped(), handle_auto_clamped);
		}
	}

	/**
	 * Get method for struct member 'handle_sel_free'.
	 * @see #__DNA__FIELD__handle_sel_free
	 */
	
	public CArrayFacade<Byte> getHandle_sel_free() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 344, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 344, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handle_sel_free'.
	 * @see #__DNA__FIELD__handle_sel_free
	 */
	
	public void setHandle_sel_free(CArrayFacade<Byte> handle_sel_free) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 344;
		} else {
			__dna__offset = 344;
		}
		if (__io__equals(handle_sel_free, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handle_sel_free)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handle_sel_free);
		} else {
			__io__generic__copy( getHandle_sel_free(), handle_sel_free);
		}
	}

	/**
	 * Get method for struct member 'handle_sel_auto'.
	 * @see #__DNA__FIELD__handle_sel_auto
	 */
	
	public CArrayFacade<Byte> getHandle_sel_auto() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 348, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 348, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handle_sel_auto'.
	 * @see #__DNA__FIELD__handle_sel_auto
	 */
	
	public void setHandle_sel_auto(CArrayFacade<Byte> handle_sel_auto) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 348;
		} else {
			__dna__offset = 348;
		}
		if (__io__equals(handle_sel_auto, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handle_sel_auto)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handle_sel_auto);
		} else {
			__io__generic__copy( getHandle_sel_auto(), handle_sel_auto);
		}
	}

	/**
	 * Get method for struct member 'handle_sel_vect'.
	 * @see #__DNA__FIELD__handle_sel_vect
	 */
	
	public CArrayFacade<Byte> getHandle_sel_vect() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 352, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 352, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handle_sel_vect'.
	 * @see #__DNA__FIELD__handle_sel_vect
	 */
	
	public void setHandle_sel_vect(CArrayFacade<Byte> handle_sel_vect) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 352;
		} else {
			__dna__offset = 352;
		}
		if (__io__equals(handle_sel_vect, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handle_sel_vect)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handle_sel_vect);
		} else {
			__io__generic__copy( getHandle_sel_vect(), handle_sel_vect);
		}
	}

	/**
	 * Get method for struct member 'handle_sel_align'.
	 * @see #__DNA__FIELD__handle_sel_align
	 */
	
	public CArrayFacade<Byte> getHandle_sel_align() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 356, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 356, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handle_sel_align'.
	 * @see #__DNA__FIELD__handle_sel_align
	 */
	
	public void setHandle_sel_align(CArrayFacade<Byte> handle_sel_align) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 356;
		} else {
			__dna__offset = 356;
		}
		if (__io__equals(handle_sel_align, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handle_sel_align)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handle_sel_align);
		} else {
			__io__generic__copy( getHandle_sel_align(), handle_sel_align);
		}
	}

	/**
	 * Get method for struct member 'handle_sel_auto_clamped'.
	 * @see #__DNA__FIELD__handle_sel_auto_clamped
	 */
	
	public CArrayFacade<Byte> getHandle_sel_auto_clamped() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 360, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 360, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handle_sel_auto_clamped'.
	 * @see #__DNA__FIELD__handle_sel_auto_clamped
	 */
	
	public void setHandle_sel_auto_clamped(CArrayFacade<Byte> handle_sel_auto_clamped) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 360;
		} else {
			__dna__offset = 360;
		}
		if (__io__equals(handle_sel_auto_clamped, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handle_sel_auto_clamped)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handle_sel_auto_clamped);
		} else {
			__io__generic__copy( getHandle_sel_auto_clamped(), handle_sel_auto_clamped);
		}
	}

	/**
	 * Get method for struct member 'ds_channel'.
	 * @see #__DNA__FIELD__ds_channel
	 */
	
	public CArrayFacade<Byte> getDs_channel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 364, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 364, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ds_channel'.
	 * @see #__DNA__FIELD__ds_channel
	 */
	
	public void setDs_channel(CArrayFacade<Byte> ds_channel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 364;
		} else {
			__dna__offset = 364;
		}
		if (__io__equals(ds_channel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ds_channel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ds_channel);
		} else {
			__io__generic__copy( getDs_channel(), ds_channel);
		}
	}

	/**
	 * Get method for struct member 'ds_subchannel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dopesheet </p>
	 * @see #__DNA__FIELD__ds_subchannel
	 */
	
	public CArrayFacade<Byte> getDs_subchannel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 368, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 368, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ds_subchannel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dopesheet </p>
	 * @see #__DNA__FIELD__ds_subchannel
	 */
	
	public void setDs_subchannel(CArrayFacade<Byte> ds_subchannel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 368;
		} else {
			__dna__offset = 368;
		}
		if (__io__equals(ds_subchannel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ds_subchannel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ds_subchannel);
		} else {
			__io__generic__copy( getDs_subchannel(), ds_subchannel);
		}
	}

	/**
	 * Get method for struct member 'keytype_keyframe'.
	 * @see #__DNA__FIELD__keytype_keyframe
	 */
	
	public CArrayFacade<Byte> getKeytype_keyframe() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 372, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 372, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keytype_keyframe'.
	 * @see #__DNA__FIELD__keytype_keyframe
	 */
	
	public void setKeytype_keyframe(CArrayFacade<Byte> keytype_keyframe) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 372;
		} else {
			__dna__offset = 372;
		}
		if (__io__equals(keytype_keyframe, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, keytype_keyframe)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, keytype_keyframe);
		} else {
			__io__generic__copy( getKeytype_keyframe(), keytype_keyframe);
		}
	}

	/**
	 * Get method for struct member 'keytype_extreme'.
	 * @see #__DNA__FIELD__keytype_extreme
	 */
	
	public CArrayFacade<Byte> getKeytype_extreme() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 376, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 376, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keytype_extreme'.
	 * @see #__DNA__FIELD__keytype_extreme
	 */
	
	public void setKeytype_extreme(CArrayFacade<Byte> keytype_extreme) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 376;
		} else {
			__dna__offset = 376;
		}
		if (__io__equals(keytype_extreme, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, keytype_extreme)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, keytype_extreme);
		} else {
			__io__generic__copy( getKeytype_extreme(), keytype_extreme);
		}
	}

	/**
	 * Get method for struct member 'keytype_breakdown'.
	 * @see #__DNA__FIELD__keytype_breakdown
	 */
	
	public CArrayFacade<Byte> getKeytype_breakdown() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 380, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 380, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keytype_breakdown'.
	 * @see #__DNA__FIELD__keytype_breakdown
	 */
	
	public void setKeytype_breakdown(CArrayFacade<Byte> keytype_breakdown) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 380;
		} else {
			__dna__offset = 380;
		}
		if (__io__equals(keytype_breakdown, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, keytype_breakdown)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, keytype_breakdown);
		} else {
			__io__generic__copy( getKeytype_breakdown(), keytype_breakdown);
		}
	}

	/**
	 * Get method for struct member 'keytype_jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keytypes </p>
	 * @see #__DNA__FIELD__keytype_jitter
	 */
	
	public CArrayFacade<Byte> getKeytype_jitter() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 384, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 384, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keytype_jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keytypes </p>
	 * @see #__DNA__FIELD__keytype_jitter
	 */
	
	public void setKeytype_jitter(CArrayFacade<Byte> keytype_jitter) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 384;
		} else {
			__dna__offset = 384;
		}
		if (__io__equals(keytype_jitter, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, keytype_jitter)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, keytype_jitter);
		} else {
			__io__generic__copy( getKeytype_jitter(), keytype_jitter);
		}
	}

	/**
	 * Get method for struct member 'keytype_keyframe_select'.
	 * @see #__DNA__FIELD__keytype_keyframe_select
	 */
	
	public CArrayFacade<Byte> getKeytype_keyframe_select() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 388, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 388, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keytype_keyframe_select'.
	 * @see #__DNA__FIELD__keytype_keyframe_select
	 */
	
	public void setKeytype_keyframe_select(CArrayFacade<Byte> keytype_keyframe_select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 388;
		} else {
			__dna__offset = 388;
		}
		if (__io__equals(keytype_keyframe_select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, keytype_keyframe_select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, keytype_keyframe_select);
		} else {
			__io__generic__copy( getKeytype_keyframe_select(), keytype_keyframe_select);
		}
	}

	/**
	 * Get method for struct member 'keytype_extreme_select'.
	 * @see #__DNA__FIELD__keytype_extreme_select
	 */
	
	public CArrayFacade<Byte> getKeytype_extreme_select() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 392, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 392, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keytype_extreme_select'.
	 * @see #__DNA__FIELD__keytype_extreme_select
	 */
	
	public void setKeytype_extreme_select(CArrayFacade<Byte> keytype_extreme_select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 392;
		} else {
			__dna__offset = 392;
		}
		if (__io__equals(keytype_extreme_select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, keytype_extreme_select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, keytype_extreme_select);
		} else {
			__io__generic__copy( getKeytype_extreme_select(), keytype_extreme_select);
		}
	}

	/**
	 * Get method for struct member 'keytype_breakdown_select'.
	 * @see #__DNA__FIELD__keytype_breakdown_select
	 */
	
	public CArrayFacade<Byte> getKeytype_breakdown_select() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 396, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 396, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keytype_breakdown_select'.
	 * @see #__DNA__FIELD__keytype_breakdown_select
	 */
	
	public void setKeytype_breakdown_select(CArrayFacade<Byte> keytype_breakdown_select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 396;
		} else {
			__dna__offset = 396;
		}
		if (__io__equals(keytype_breakdown_select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, keytype_breakdown_select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, keytype_breakdown_select);
		} else {
			__io__generic__copy( getKeytype_breakdown_select(), keytype_breakdown_select);
		}
	}

	/**
	 * Get method for struct member 'keytype_jitter_select'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keytypes </p>
	 * @see #__DNA__FIELD__keytype_jitter_select
	 */
	
	public CArrayFacade<Byte> getKeytype_jitter_select() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 400, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 400, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keytype_jitter_select'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keytypes </p>
	 * @see #__DNA__FIELD__keytype_jitter_select
	 */
	
	public void setKeytype_jitter_select(CArrayFacade<Byte> keytype_jitter_select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 400;
		} else {
			__dna__offset = 400;
		}
		if (__io__equals(keytype_jitter_select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, keytype_jitter_select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, keytype_jitter_select);
		} else {
			__io__generic__copy( getKeytype_jitter_select(), keytype_jitter_select);
		}
	}

	/**
	 * Get method for struct member 'keyborder'.
	 * @see #__DNA__FIELD__keyborder
	 */
	
	public CArrayFacade<Byte> getKeyborder() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 404, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 404, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keyborder'.
	 * @see #__DNA__FIELD__keyborder
	 */
	
	public void setKeyborder(CArrayFacade<Byte> keyborder) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 404;
		} else {
			__dna__offset = 404;
		}
		if (__io__equals(keyborder, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, keyborder)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, keyborder);
		} else {
			__io__generic__copy( getKeyborder(), keyborder);
		}
	}

	/**
	 * Get method for struct member 'keyborder_select'.
	 * @see #__DNA__FIELD__keyborder_select
	 */
	
	public CArrayFacade<Byte> getKeyborder_select() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 408, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 408, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keyborder_select'.
	 * @see #__DNA__FIELD__keyborder_select
	 */
	
	public void setKeyborder_select(CArrayFacade<Byte> keyborder_select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 408;
		} else {
			__dna__offset = 408;
		}
		if (__io__equals(keyborder_select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, keyborder_select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, keyborder_select);
		} else {
			__io__generic__copy( getKeyborder_select(), keyborder_select);
		}
	}

	/**
	 * Get method for struct member 'console_output'.
	 * @see #__DNA__FIELD__console_output
	 */
	
	public CArrayFacade<Byte> getConsole_output() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 412, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 412, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'console_output'.
	 * @see #__DNA__FIELD__console_output
	 */
	
	public void setConsole_output(CArrayFacade<Byte> console_output) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 412;
		} else {
			__dna__offset = 412;
		}
		if (__io__equals(console_output, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, console_output)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, console_output);
		} else {
			__io__generic__copy( getConsole_output(), console_output);
		}
	}

	/**
	 * Get method for struct member 'console_input'.
	 * @see #__DNA__FIELD__console_input
	 */
	
	public CArrayFacade<Byte> getConsole_input() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 416, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 416, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'console_input'.
	 * @see #__DNA__FIELD__console_input
	 */
	
	public void setConsole_input(CArrayFacade<Byte> console_input) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 416;
		} else {
			__dna__offset = 416;
		}
		if (__io__equals(console_input, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, console_input)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, console_input);
		} else {
			__io__generic__copy( getConsole_input(), console_input);
		}
	}

	/**
	 * Get method for struct member 'console_info'.
	 * @see #__DNA__FIELD__console_info
	 */
	
	public CArrayFacade<Byte> getConsole_info() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 420, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 420, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'console_info'.
	 * @see #__DNA__FIELD__console_info
	 */
	
	public void setConsole_info(CArrayFacade<Byte> console_info) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 420;
		} else {
			__dna__offset = 420;
		}
		if (__io__equals(console_info, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, console_info)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, console_info);
		} else {
			__io__generic__copy( getConsole_info(), console_info);
		}
	}

	/**
	 * Get method for struct member 'console_error'.
	 * @see #__DNA__FIELD__console_error
	 */
	
	public CArrayFacade<Byte> getConsole_error() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 424, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 424, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'console_error'.
	 * @see #__DNA__FIELD__console_error
	 */
	
	public void setConsole_error(CArrayFacade<Byte> console_error) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 424;
		} else {
			__dna__offset = 424;
		}
		if (__io__equals(console_error, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, console_error)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, console_error);
		} else {
			__io__generic__copy( getConsole_error(), console_error);
		}
	}

	/**
	 * Get method for struct member 'console_cursor'.
	 * @see #__DNA__FIELD__console_cursor
	 */
	
	public CArrayFacade<Byte> getConsole_cursor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 428, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 428, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'console_cursor'.
	 * @see #__DNA__FIELD__console_cursor
	 */
	
	public void setConsole_cursor(CArrayFacade<Byte> console_cursor) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 428;
		} else {
			__dna__offset = 428;
		}
		if (__io__equals(console_cursor, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, console_cursor)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, console_cursor);
		} else {
			__io__generic__copy( getConsole_cursor(), console_cursor);
		}
	}

	/**
	 * Get method for struct member 'console_select'.
	 * @see #__DNA__FIELD__console_select
	 */
	
	public CArrayFacade<Byte> getConsole_select() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 432, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 432, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'console_select'.
	 * @see #__DNA__FIELD__console_select
	 */
	
	public void setConsole_select(CArrayFacade<Byte> console_select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 432;
		} else {
			__dna__offset = 432;
		}
		if (__io__equals(console_select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, console_select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, console_select);
		} else {
			__io__generic__copy( getConsole_select(), console_select);
		}
	}

	/**
	 * Get method for struct member 'vertex_size'.
	 * @see #__DNA__FIELD__vertex_size
	 */
	
	public byte getVertex_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 436);
		} else {
			return __io__block.readByte(__io__address + 436);
		}
	}

	/**
	 * Set method for struct member 'vertex_size'.
	 * @see #__DNA__FIELD__vertex_size
	 */
	
	public void setVertex_size(byte vertex_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 436, vertex_size);
		} else {
			__io__block.writeByte(__io__address + 436, vertex_size);
		}
	}

	/**
	 * Get method for struct member 'outline_width'.
	 * @see #__DNA__FIELD__outline_width
	 */
	
	public byte getOutline_width() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 437);
		} else {
			return __io__block.readByte(__io__address + 437);
		}
	}

	/**
	 * Set method for struct member 'outline_width'.
	 * @see #__DNA__FIELD__outline_width
	 */
	
	public void setOutline_width(byte outline_width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 437, outline_width);
		} else {
			__io__block.writeByte(__io__address + 437, outline_width);
		}
	}

	/**
	 * Get method for struct member 'facedot_size'.
	 * @see #__DNA__FIELD__facedot_size
	 */
	
	public byte getFacedot_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 438);
		} else {
			return __io__block.readByte(__io__address + 438);
		}
	}

	/**
	 * Set method for struct member 'facedot_size'.
	 * @see #__DNA__FIELD__facedot_size
	 */
	
	public void setFacedot_size(byte facedot_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 438, facedot_size);
		} else {
			__io__block.writeByte(__io__address + 438, facedot_size);
		}
	}

	/**
	 * Get method for struct member 'noodle_curving'.
	 * @see #__DNA__FIELD__noodle_curving
	 */
	
	public byte getNoodle_curving() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 439);
		} else {
			return __io__block.readByte(__io__address + 439);
		}
	}

	/**
	 * Set method for struct member 'noodle_curving'.
	 * @see #__DNA__FIELD__noodle_curving
	 */
	
	public void setNoodle_curving(byte noodle_curving) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 439, noodle_curving);
		} else {
			__io__block.writeByte(__io__address + 439, noodle_curving);
		}
	}

	/**
	 * Get method for struct member 'syntaxl'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> syntax for textwindow and nodes </p>
	 * @see #__DNA__FIELD__syntaxl
	 */
	
	public CArrayFacade<Byte> getSyntaxl() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 440, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 440, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'syntaxl'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> syntax for textwindow and nodes </p>
	 * @see #__DNA__FIELD__syntaxl
	 */
	
	public void setSyntaxl(CArrayFacade<Byte> syntaxl) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 440;
		} else {
			__dna__offset = 440;
		}
		if (__io__equals(syntaxl, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, syntaxl)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, syntaxl);
		} else {
			__io__generic__copy( getSyntaxl(), syntaxl);
		}
	}

	/**
	 * Get method for struct member 'syntaxs'.
	 * @see #__DNA__FIELD__syntaxs
	 */
	
	public CArrayFacade<Byte> getSyntaxs() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 444, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 444, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'syntaxs'.
	 * @see #__DNA__FIELD__syntaxs
	 */
	
	public void setSyntaxs(CArrayFacade<Byte> syntaxs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 444;
		} else {
			__dna__offset = 444;
		}
		if (__io__equals(syntaxs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, syntaxs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, syntaxs);
		} else {
			__io__generic__copy( getSyntaxs(), syntaxs);
		}
	}

	/**
	 * Get method for struct member 'syntaxb'.
	 * @see #__DNA__FIELD__syntaxb
	 */
	
	public CArrayFacade<Byte> getSyntaxb() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 448, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 448, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'syntaxb'.
	 * @see #__DNA__FIELD__syntaxb
	 */
	
	public void setSyntaxb(CArrayFacade<Byte> syntaxb) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 448;
		} else {
			__dna__offset = 448;
		}
		if (__io__equals(syntaxb, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, syntaxb)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, syntaxb);
		} else {
			__io__generic__copy( getSyntaxb(), syntaxb);
		}
	}

	/**
	 * Get method for struct member 'syntaxn'.
	 * @see #__DNA__FIELD__syntaxn
	 */
	
	public CArrayFacade<Byte> getSyntaxn() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 452, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 452, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'syntaxn'.
	 * @see #__DNA__FIELD__syntaxn
	 */
	
	public void setSyntaxn(CArrayFacade<Byte> syntaxn) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 452;
		} else {
			__dna__offset = 452;
		}
		if (__io__equals(syntaxn, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, syntaxn)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, syntaxn);
		} else {
			__io__generic__copy( getSyntaxn(), syntaxn);
		}
	}

	/**
	 * Get method for struct member 'syntaxv'.
	 * @see #__DNA__FIELD__syntaxv
	 */
	
	public CArrayFacade<Byte> getSyntaxv() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 456, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 456, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'syntaxv'.
	 * @see #__DNA__FIELD__syntaxv
	 */
	
	public void setSyntaxv(CArrayFacade<Byte> syntaxv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 456;
		} else {
			__dna__offset = 456;
		}
		if (__io__equals(syntaxv, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, syntaxv)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, syntaxv);
		} else {
			__io__generic__copy( getSyntaxv(), syntaxv);
		}
	}

	/**
	 * Get method for struct member 'syntaxc'.
	 * @see #__DNA__FIELD__syntaxc
	 */
	
	public CArrayFacade<Byte> getSyntaxc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 460, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 460, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'syntaxc'.
	 * @see #__DNA__FIELD__syntaxc
	 */
	
	public void setSyntaxc(CArrayFacade<Byte> syntaxc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 460;
		} else {
			__dna__offset = 460;
		}
		if (__io__equals(syntaxc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, syntaxc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, syntaxc);
		} else {
			__io__generic__copy( getSyntaxc(), syntaxc);
		}
	}

	/**
	 * Get method for struct member 'syntaxd'.
	 * @see #__DNA__FIELD__syntaxd
	 */
	
	public CArrayFacade<Byte> getSyntaxd() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 464, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 464, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'syntaxd'.
	 * @see #__DNA__FIELD__syntaxd
	 */
	
	public void setSyntaxd(CArrayFacade<Byte> syntaxd) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 464;
		} else {
			__dna__offset = 464;
		}
		if (__io__equals(syntaxd, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, syntaxd)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, syntaxd);
		} else {
			__io__generic__copy( getSyntaxd(), syntaxd);
		}
	}

	/**
	 * Get method for struct member 'syntaxr'.
	 * @see #__DNA__FIELD__syntaxr
	 */
	
	public CArrayFacade<Byte> getSyntaxr() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 468, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 468, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'syntaxr'.
	 * @see #__DNA__FIELD__syntaxr
	 */
	
	public void setSyntaxr(CArrayFacade<Byte> syntaxr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 468;
		} else {
			__dna__offset = 468;
		}
		if (__io__equals(syntaxr, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, syntaxr)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, syntaxr);
		} else {
			__io__generic__copy( getSyntaxr(), syntaxr);
		}
	}

	/**
	 * Get method for struct member 'nodeclass_output'.
	 * @see #__DNA__FIELD__nodeclass_output
	 */
	
	public CArrayFacade<Byte> getNodeclass_output() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 472, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 472, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nodeclass_output'.
	 * @see #__DNA__FIELD__nodeclass_output
	 */
	
	public void setNodeclass_output(CArrayFacade<Byte> nodeclass_output) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 472;
		} else {
			__dna__offset = 472;
		}
		if (__io__equals(nodeclass_output, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nodeclass_output)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nodeclass_output);
		} else {
			__io__generic__copy( getNodeclass_output(), nodeclass_output);
		}
	}

	/**
	 * Get method for struct member 'nodeclass_filter'.
	 * @see #__DNA__FIELD__nodeclass_filter
	 */
	
	public CArrayFacade<Byte> getNodeclass_filter() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 476, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 476, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nodeclass_filter'.
	 * @see #__DNA__FIELD__nodeclass_filter
	 */
	
	public void setNodeclass_filter(CArrayFacade<Byte> nodeclass_filter) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 476;
		} else {
			__dna__offset = 476;
		}
		if (__io__equals(nodeclass_filter, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nodeclass_filter)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nodeclass_filter);
		} else {
			__io__generic__copy( getNodeclass_filter(), nodeclass_filter);
		}
	}

	/**
	 * Get method for struct member 'nodeclass_vector'.
	 * @see #__DNA__FIELD__nodeclass_vector
	 */
	
	public CArrayFacade<Byte> getNodeclass_vector() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 480, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 480, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nodeclass_vector'.
	 * @see #__DNA__FIELD__nodeclass_vector
	 */
	
	public void setNodeclass_vector(CArrayFacade<Byte> nodeclass_vector) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 480;
		} else {
			__dna__offset = 480;
		}
		if (__io__equals(nodeclass_vector, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nodeclass_vector)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nodeclass_vector);
		} else {
			__io__generic__copy( getNodeclass_vector(), nodeclass_vector);
		}
	}

	/**
	 * Get method for struct member 'nodeclass_texture'.
	 * @see #__DNA__FIELD__nodeclass_texture
	 */
	
	public CArrayFacade<Byte> getNodeclass_texture() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 484, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 484, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nodeclass_texture'.
	 * @see #__DNA__FIELD__nodeclass_texture
	 */
	
	public void setNodeclass_texture(CArrayFacade<Byte> nodeclass_texture) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 484;
		} else {
			__dna__offset = 484;
		}
		if (__io__equals(nodeclass_texture, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nodeclass_texture)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nodeclass_texture);
		} else {
			__io__generic__copy( getNodeclass_texture(), nodeclass_texture);
		}
	}

	/**
	 * Get method for struct member 'nodeclass_shader'.
	 * @see #__DNA__FIELD__nodeclass_shader
	 */
	
	public CArrayFacade<Byte> getNodeclass_shader() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 488, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 488, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nodeclass_shader'.
	 * @see #__DNA__FIELD__nodeclass_shader
	 */
	
	public void setNodeclass_shader(CArrayFacade<Byte> nodeclass_shader) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 488;
		} else {
			__dna__offset = 488;
		}
		if (__io__equals(nodeclass_shader, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nodeclass_shader)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nodeclass_shader);
		} else {
			__io__generic__copy( getNodeclass_shader(), nodeclass_shader);
		}
	}

	/**
	 * Get method for struct member 'nodeclass_script'.
	 * @see #__DNA__FIELD__nodeclass_script
	 */
	
	public CArrayFacade<Byte> getNodeclass_script() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 492, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 492, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nodeclass_script'.
	 * @see #__DNA__FIELD__nodeclass_script
	 */
	
	public void setNodeclass_script(CArrayFacade<Byte> nodeclass_script) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 492;
		} else {
			__dna__offset = 492;
		}
		if (__io__equals(nodeclass_script, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nodeclass_script)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nodeclass_script);
		} else {
			__io__generic__copy( getNodeclass_script(), nodeclass_script);
		}
	}

	/**
	 * Get method for struct member 'nodeclass_pattern'.
	 * @see #__DNA__FIELD__nodeclass_pattern
	 */
	
	public CArrayFacade<Byte> getNodeclass_pattern() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 496, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 496, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nodeclass_pattern'.
	 * @see #__DNA__FIELD__nodeclass_pattern
	 */
	
	public void setNodeclass_pattern(CArrayFacade<Byte> nodeclass_pattern) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 496;
		} else {
			__dna__offset = 496;
		}
		if (__io__equals(nodeclass_pattern, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nodeclass_pattern)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nodeclass_pattern);
		} else {
			__io__generic__copy( getNodeclass_pattern(), nodeclass_pattern);
		}
	}

	/**
	 * Get method for struct member 'nodeclass_layout'.
	 * @see #__DNA__FIELD__nodeclass_layout
	 */
	
	public CArrayFacade<Byte> getNodeclass_layout() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 500, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 500, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nodeclass_layout'.
	 * @see #__DNA__FIELD__nodeclass_layout
	 */
	
	public void setNodeclass_layout(CArrayFacade<Byte> nodeclass_layout) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 500;
		} else {
			__dna__offset = 500;
		}
		if (__io__equals(nodeclass_layout, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nodeclass_layout)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nodeclass_layout);
		} else {
			__io__generic__copy( getNodeclass_layout(), nodeclass_layout);
		}
	}

	/**
	 * Get method for struct member 'movie'.
	 * @see #__DNA__FIELD__movie
	 */
	
	public CArrayFacade<Byte> getMovie() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 504, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 504, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'movie'.
	 * @see #__DNA__FIELD__movie
	 */
	
	public void setMovie(CArrayFacade<Byte> movie) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 504;
		} else {
			__dna__offset = 504;
		}
		if (__io__equals(movie, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, movie)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, movie);
		} else {
			__io__generic__copy( getMovie(), movie);
		}
	}

	/**
	 * Get method for struct member 'movieclip'.
	 * @see #__DNA__FIELD__movieclip
	 */
	
	public CArrayFacade<Byte> getMovieclip() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 508, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 508, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'movieclip'.
	 * @see #__DNA__FIELD__movieclip
	 */
	
	public void setMovieclip(CArrayFacade<Byte> movieclip) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 508;
		} else {
			__dna__offset = 508;
		}
		if (__io__equals(movieclip, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, movieclip)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, movieclip);
		} else {
			__io__generic__copy( getMovieclip(), movieclip);
		}
	}

	/**
	 * Get method for struct member 'mask'.
	 * @see #__DNA__FIELD__mask
	 */
	
	public CArrayFacade<Byte> getMask() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 512, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 512, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mask'.
	 * @see #__DNA__FIELD__mask
	 */
	
	public void setMask(CArrayFacade<Byte> mask) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 512;
		} else {
			__dna__offset = 512;
		}
		if (__io__equals(mask, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mask)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mask);
		} else {
			__io__generic__copy( getMask(), mask);
		}
	}

	/**
	 * Get method for struct member 'image'.
	 * @see #__DNA__FIELD__image
	 */
	
	public CArrayFacade<Byte> getImage() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 516, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 516, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'image'.
	 * @see #__DNA__FIELD__image
	 */
	
	public void setImage(CArrayFacade<Byte> image) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 516;
		} else {
			__dna__offset = 516;
		}
		if (__io__equals(image, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, image)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, image);
		} else {
			__io__generic__copy( getImage(), image);
		}
	}

	/**
	 * Get method for struct member 'scene'.
	 * @see #__DNA__FIELD__scene
	 */
	
	public CArrayFacade<Byte> getScene() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 520, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 520, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scene'.
	 * @see #__DNA__FIELD__scene
	 */
	
	public void setScene(CArrayFacade<Byte> scene) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 520;
		} else {
			__dna__offset = 520;
		}
		if (__io__equals(scene, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scene)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scene);
		} else {
			__io__generic__copy( getScene(), scene);
		}
	}

	/**
	 * Get method for struct member 'audio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for sequence editor </p>
	 * @see #__DNA__FIELD__audio
	 */
	
	public CArrayFacade<Byte> getAudio() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 524, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 524, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'audio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for sequence editor </p>
	 * @see #__DNA__FIELD__audio
	 */
	
	public void setAudio(CArrayFacade<Byte> audio) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 524;
		} else {
			__dna__offset = 524;
		}
		if (__io__equals(audio, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, audio)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, audio);
		} else {
			__io__generic__copy( getAudio(), audio);
		}
	}

	/**
	 * Get method for struct member 'effect'.
	 * @see #__DNA__FIELD__effect
	 */
	
	public CArrayFacade<Byte> getEffect() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 528, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 528, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'effect'.
	 * @see #__DNA__FIELD__effect
	 */
	
	public void setEffect(CArrayFacade<Byte> effect) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 528;
		} else {
			__dna__offset = 528;
		}
		if (__io__equals(effect, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, effect)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, effect);
		} else {
			__io__generic__copy( getEffect(), effect);
		}
	}

	/**
	 * Get method for struct member 'transition'.
	 * @see #__DNA__FIELD__transition
	 */
	
	public CArrayFacade<Byte> getTransition() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 532, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 532, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'transition'.
	 * @see #__DNA__FIELD__transition
	 */
	
	public void setTransition(CArrayFacade<Byte> transition) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 532;
		} else {
			__dna__offset = 532;
		}
		if (__io__equals(transition, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, transition)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, transition);
		} else {
			__io__generic__copy( getTransition(), transition);
		}
	}

	/**
	 * Get method for struct member 'meta'.
	 * @see #__DNA__FIELD__meta
	 */
	
	public CArrayFacade<Byte> getMeta() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 536, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 536, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'meta'.
	 * @see #__DNA__FIELD__meta
	 */
	
	public void setMeta(CArrayFacade<Byte> meta) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 536;
		} else {
			__dna__offset = 536;
		}
		if (__io__equals(meta, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, meta)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, meta);
		} else {
			__io__generic__copy( getMeta(), meta);
		}
	}

	/**
	 * Get method for struct member 'text_strip'.
	 * @see #__DNA__FIELD__text_strip
	 */
	
	public CArrayFacade<Byte> getText_strip() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 540, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 540, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'text_strip'.
	 * @see #__DNA__FIELD__text_strip
	 */
	
	public void setText_strip(CArrayFacade<Byte> text_strip) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 540;
		} else {
			__dna__offset = 540;
		}
		if (__io__equals(text_strip, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, text_strip)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, text_strip);
		} else {
			__io__generic__copy( getText_strip(), text_strip);
		}
	}

	/**
	 * Get method for struct member 'keyframe_scale_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for dopesheet - scale factor for size of keyframes (i.e. height of channels) </p>
	 * @see #__DNA__FIELD__keyframe_scale_fac
	 */
	
	public float getKeyframe_scale_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 544);
		} else {
			return __io__block.readFloat(__io__address + 544);
		}
	}

	/**
	 * Set method for struct member 'keyframe_scale_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for dopesheet - scale factor for size of keyframes (i.e. height of channels) </p>
	 * @see #__DNA__FIELD__keyframe_scale_fac
	 */
	
	public void setKeyframe_scale_fac(float keyframe_scale_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 544, keyframe_scale_fac);
		} else {
			__io__block.writeFloat(__io__address + 544, keyframe_scale_fac);
		}
	}

	/**
	 * Get method for struct member 'editmesh_active'.
	 * @see #__DNA__FIELD__editmesh_active
	 */
	
	public CArrayFacade<Byte> getEditmesh_active() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 548, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 548, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'editmesh_active'.
	 * @see #__DNA__FIELD__editmesh_active
	 */
	
	public void setEditmesh_active(CArrayFacade<Byte> editmesh_active) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 548;
		} else {
			__dna__offset = 548;
		}
		if (__io__equals(editmesh_active, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, editmesh_active)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, editmesh_active);
		} else {
			__io__generic__copy( getEditmesh_active(), editmesh_active);
		}
	}

	/**
	 * Get method for struct member 'handle_vertex'.
	 * @see #__DNA__FIELD__handle_vertex
	 */
	
	public CArrayFacade<Byte> getHandle_vertex() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 552, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 552, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handle_vertex'.
	 * @see #__DNA__FIELD__handle_vertex
	 */
	
	public void setHandle_vertex(CArrayFacade<Byte> handle_vertex) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 552;
		} else {
			__dna__offset = 552;
		}
		if (__io__equals(handle_vertex, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handle_vertex)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handle_vertex);
		} else {
			__io__generic__copy( getHandle_vertex(), handle_vertex);
		}
	}

	/**
	 * Get method for struct member 'handle_vertex_select'.
	 * @see #__DNA__FIELD__handle_vertex_select
	 */
	
	public CArrayFacade<Byte> getHandle_vertex_select() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 556, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 556, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handle_vertex_select'.
	 * @see #__DNA__FIELD__handle_vertex_select
	 */
	
	public void setHandle_vertex_select(CArrayFacade<Byte> handle_vertex_select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 556;
		} else {
			__dna__offset = 556;
		}
		if (__io__equals(handle_vertex_select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handle_vertex_select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handle_vertex_select);
		} else {
			__io__generic__copy( getHandle_vertex_select(), handle_vertex_select);
		}
	}

	/**
	 * Get method for struct member 'handle_vertex_size'.
	 * @see #__DNA__FIELD__handle_vertex_size
	 */
	
	public byte getHandle_vertex_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 560);
		} else {
			return __io__block.readByte(__io__address + 560);
		}
	}

	/**
	 * Set method for struct member 'handle_vertex_size'.
	 * @see #__DNA__FIELD__handle_vertex_size
	 */
	
	public void setHandle_vertex_size(byte handle_vertex_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 560, handle_vertex_size);
		} else {
			__io__block.writeByte(__io__address + 560, handle_vertex_size);
		}
	}

	/**
	 * Get method for struct member 'clipping_border_3d'.
	 * @see #__DNA__FIELD__clipping_border_3d
	 */
	
	public CArrayFacade<Byte> getClipping_border_3d() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 561, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 561, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'clipping_border_3d'.
	 * @see #__DNA__FIELD__clipping_border_3d
	 */
	
	public void setClipping_border_3d(CArrayFacade<Byte> clipping_border_3d) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 561;
		} else {
			__dna__offset = 561;
		}
		if (__io__equals(clipping_border_3d, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, clipping_border_3d)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, clipping_border_3d);
		} else {
			__io__generic__copy( getClipping_border_3d(), clipping_border_3d);
		}
	}

	/**
	 * Get method for struct member 'marker_outline'.
	 * @see #__DNA__FIELD__marker_outline
	 */
	
	public CArrayFacade<Byte> getMarker_outline() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 565, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 565, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'marker_outline'.
	 * @see #__DNA__FIELD__marker_outline
	 */
	
	public void setMarker_outline(CArrayFacade<Byte> marker_outline) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 565;
		} else {
			__dna__offset = 565;
		}
		if (__io__equals(marker_outline, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, marker_outline)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, marker_outline);
		} else {
			__io__generic__copy( getMarker_outline(), marker_outline);
		}
	}

	/**
	 * Get method for struct member 'marker'.
	 * @see #__DNA__FIELD__marker
	 */
	
	public CArrayFacade<Byte> getMarker() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 569, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 569, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'marker'.
	 * @see #__DNA__FIELD__marker
	 */
	
	public void setMarker(CArrayFacade<Byte> marker) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 569;
		} else {
			__dna__offset = 569;
		}
		if (__io__equals(marker, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, marker)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, marker);
		} else {
			__io__generic__copy( getMarker(), marker);
		}
	}

	/**
	 * Get method for struct member 'act_marker'.
	 * @see #__DNA__FIELD__act_marker
	 */
	
	public CArrayFacade<Byte> getAct_marker() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 573, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 573, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'act_marker'.
	 * @see #__DNA__FIELD__act_marker
	 */
	
	public void setAct_marker(CArrayFacade<Byte> act_marker) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 573;
		} else {
			__dna__offset = 573;
		}
		if (__io__equals(act_marker, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, act_marker)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, act_marker);
		} else {
			__io__generic__copy( getAct_marker(), act_marker);
		}
	}

	/**
	 * Get method for struct member 'sel_marker'.
	 * @see #__DNA__FIELD__sel_marker
	 */
	
	public CArrayFacade<Byte> getSel_marker() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 577, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 577, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sel_marker'.
	 * @see #__DNA__FIELD__sel_marker
	 */
	
	public void setSel_marker(CArrayFacade<Byte> sel_marker) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 577;
		} else {
			__dna__offset = 577;
		}
		if (__io__equals(sel_marker, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sel_marker)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sel_marker);
		} else {
			__io__generic__copy( getSel_marker(), sel_marker);
		}
	}

	/**
	 * Get method for struct member 'dis_marker'.
	 * @see #__DNA__FIELD__dis_marker
	 */
	
	public CArrayFacade<Byte> getDis_marker() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 581, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 581, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dis_marker'.
	 * @see #__DNA__FIELD__dis_marker
	 */
	
	public void setDis_marker(CArrayFacade<Byte> dis_marker) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 581;
		} else {
			__dna__offset = 581;
		}
		if (__io__equals(dis_marker, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dis_marker)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dis_marker);
		} else {
			__io__generic__copy( getDis_marker(), dis_marker);
		}
	}

	/**
	 * Get method for struct member 'lock_marker'.
	 * @see #__DNA__FIELD__lock_marker
	 */
	
	public CArrayFacade<Byte> getLock_marker() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 585, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 585, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lock_marker'.
	 * @see #__DNA__FIELD__lock_marker
	 */
	
	public void setLock_marker(CArrayFacade<Byte> lock_marker) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 585;
		} else {
			__dna__offset = 585;
		}
		if (__io__equals(lock_marker, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lock_marker)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lock_marker);
		} else {
			__io__generic__copy( getLock_marker(), lock_marker);
		}
	}

	/**
	 * Get method for struct member 'bundle_solid'.
	 * @see #__DNA__FIELD__bundle_solid
	 */
	
	public CArrayFacade<Byte> getBundle_solid() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 589, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 589, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bundle_solid'.
	 * @see #__DNA__FIELD__bundle_solid
	 */
	
	public void setBundle_solid(CArrayFacade<Byte> bundle_solid) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 589;
		} else {
			__dna__offset = 589;
		}
		if (__io__equals(bundle_solid, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bundle_solid)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bundle_solid);
		} else {
			__io__generic__copy( getBundle_solid(), bundle_solid);
		}
	}

	/**
	 * Get method for struct member 'path_before'.
	 * @see #__DNA__FIELD__path_before
	 */
	
	public CArrayFacade<Byte> getPath_before() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 593, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 593, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'path_before'.
	 * @see #__DNA__FIELD__path_before
	 */
	
	public void setPath_before(CArrayFacade<Byte> path_before) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 593;
		} else {
			__dna__offset = 593;
		}
		if (__io__equals(path_before, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, path_before)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, path_before);
		} else {
			__io__generic__copy( getPath_before(), path_before);
		}
	}

	/**
	 * Get method for struct member 'path_after'.
	 * @see #__DNA__FIELD__path_after
	 */
	
	public CArrayFacade<Byte> getPath_after() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 597, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 597, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'path_after'.
	 * @see #__DNA__FIELD__path_after
	 */
	
	public void setPath_after(CArrayFacade<Byte> path_after) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 597;
		} else {
			__dna__offset = 597;
		}
		if (__io__equals(path_after, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, path_after)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, path_after);
		} else {
			__io__generic__copy( getPath_after(), path_after);
		}
	}

	/**
	 * Get method for struct member 'camera_path'.
	 * @see #__DNA__FIELD__camera_path
	 */
	
	public CArrayFacade<Byte> getCamera_path() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 601, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 601, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'camera_path'.
	 * @see #__DNA__FIELD__camera_path
	 */
	
	public void setCamera_path(CArrayFacade<Byte> camera_path) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 601;
		} else {
			__dna__offset = 601;
		}
		if (__io__equals(camera_path, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, camera_path)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, camera_path);
		} else {
			__io__generic__copy( getCamera_path(), camera_path);
		}
	}

	/**
	 * Get method for struct member 'hpad'.
	 * @see #__DNA__FIELD__hpad
	 */
	
	public CArrayFacade<Byte> getHpad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 605, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 605, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'hpad'.
	 * @see #__DNA__FIELD__hpad
	 */
	
	public void setHpad(CArrayFacade<Byte> hpad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 605;
		} else {
			__dna__offset = 605;
		}
		if (__io__equals(hpad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, hpad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, hpad);
		} else {
			__io__generic__copy( getHpad(), hpad);
		}
	}

	/**
	 * Get method for struct member 'gp_vertex_size'.
	 * @see #__DNA__FIELD__gp_vertex_size
	 */
	
	public byte getGp_vertex_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 607);
		} else {
			return __io__block.readByte(__io__address + 607);
		}
	}

	/**
	 * Set method for struct member 'gp_vertex_size'.
	 * @see #__DNA__FIELD__gp_vertex_size
	 */
	
	public void setGp_vertex_size(byte gp_vertex_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 607, gp_vertex_size);
		} else {
			__io__block.writeByte(__io__address + 607, gp_vertex_size);
		}
	}

	/**
	 * Get method for struct member 'gp_vertex'.
	 * @see #__DNA__FIELD__gp_vertex
	 */
	
	public CArrayFacade<Byte> getGp_vertex() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 608, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 608, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gp_vertex'.
	 * @see #__DNA__FIELD__gp_vertex
	 */
	
	public void setGp_vertex(CArrayFacade<Byte> gp_vertex) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 608;
		} else {
			__dna__offset = 608;
		}
		if (__io__equals(gp_vertex, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gp_vertex)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gp_vertex);
		} else {
			__io__generic__copy( getGp_vertex(), gp_vertex);
		}
	}

	/**
	 * Get method for struct member 'gp_vertex_select'.
	 * @see #__DNA__FIELD__gp_vertex_select
	 */
	
	public CArrayFacade<Byte> getGp_vertex_select() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 612, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 612, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gp_vertex_select'.
	 * @see #__DNA__FIELD__gp_vertex_select
	 */
	
	public void setGp_vertex_select(CArrayFacade<Byte> gp_vertex_select) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 612;
		} else {
			__dna__offset = 612;
		}
		if (__io__equals(gp_vertex_select, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gp_vertex_select)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gp_vertex_select);
		} else {
			__io__generic__copy( getGp_vertex_select(), gp_vertex_select);
		}
	}

	/**
	 * Get method for struct member 'preview_back'.
	 * @see #__DNA__FIELD__preview_back
	 */
	
	public CArrayFacade<Byte> getPreview_back() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 616, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 616, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'preview_back'.
	 * @see #__DNA__FIELD__preview_back
	 */
	
	public void setPreview_back(CArrayFacade<Byte> preview_back) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 616;
		} else {
			__dna__offset = 616;
		}
		if (__io__equals(preview_back, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, preview_back)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, preview_back);
		} else {
			__io__generic__copy( getPreview_back(), preview_back);
		}
	}

	/**
	 * Get method for struct member 'preview_stitch_face'.
	 * @see #__DNA__FIELD__preview_stitch_face
	 */
	
	public CArrayFacade<Byte> getPreview_stitch_face() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 620, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 620, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'preview_stitch_face'.
	 * @see #__DNA__FIELD__preview_stitch_face
	 */
	
	public void setPreview_stitch_face(CArrayFacade<Byte> preview_stitch_face) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 620;
		} else {
			__dna__offset = 620;
		}
		if (__io__equals(preview_stitch_face, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, preview_stitch_face)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, preview_stitch_face);
		} else {
			__io__generic__copy( getPreview_stitch_face(), preview_stitch_face);
		}
	}

	/**
	 * Get method for struct member 'preview_stitch_edge'.
	 * @see #__DNA__FIELD__preview_stitch_edge
	 */
	
	public CArrayFacade<Byte> getPreview_stitch_edge() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 624, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 624, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'preview_stitch_edge'.
	 * @see #__DNA__FIELD__preview_stitch_edge
	 */
	
	public void setPreview_stitch_edge(CArrayFacade<Byte> preview_stitch_edge) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 624;
		} else {
			__dna__offset = 624;
		}
		if (__io__equals(preview_stitch_edge, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, preview_stitch_edge)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, preview_stitch_edge);
		} else {
			__io__generic__copy( getPreview_stitch_edge(), preview_stitch_edge);
		}
	}

	/**
	 * Get method for struct member 'preview_stitch_vert'.
	 * @see #__DNA__FIELD__preview_stitch_vert
	 */
	
	public CArrayFacade<Byte> getPreview_stitch_vert() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 628, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 628, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'preview_stitch_vert'.
	 * @see #__DNA__FIELD__preview_stitch_vert
	 */
	
	public void setPreview_stitch_vert(CArrayFacade<Byte> preview_stitch_vert) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 628;
		} else {
			__dna__offset = 628;
		}
		if (__io__equals(preview_stitch_vert, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, preview_stitch_vert)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, preview_stitch_vert);
		} else {
			__io__generic__copy( getPreview_stitch_vert(), preview_stitch_vert);
		}
	}

	/**
	 * Get method for struct member 'preview_stitch_stitchable'.
	 * @see #__DNA__FIELD__preview_stitch_stitchable
	 */
	
	public CArrayFacade<Byte> getPreview_stitch_stitchable() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 632, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 632, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'preview_stitch_stitchable'.
	 * @see #__DNA__FIELD__preview_stitch_stitchable
	 */
	
	public void setPreview_stitch_stitchable(CArrayFacade<Byte> preview_stitch_stitchable) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 632;
		} else {
			__dna__offset = 632;
		}
		if (__io__equals(preview_stitch_stitchable, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, preview_stitch_stitchable)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, preview_stitch_stitchable);
		} else {
			__io__generic__copy( getPreview_stitch_stitchable(), preview_stitch_stitchable);
		}
	}

	/**
	 * Get method for struct member 'preview_stitch_unstitchable'.
	 * @see #__DNA__FIELD__preview_stitch_unstitchable
	 */
	
	public CArrayFacade<Byte> getPreview_stitch_unstitchable() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 636, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 636, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'preview_stitch_unstitchable'.
	 * @see #__DNA__FIELD__preview_stitch_unstitchable
	 */
	
	public void setPreview_stitch_unstitchable(CArrayFacade<Byte> preview_stitch_unstitchable) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 636;
		} else {
			__dna__offset = 636;
		}
		if (__io__equals(preview_stitch_unstitchable, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, preview_stitch_unstitchable)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, preview_stitch_unstitchable);
		} else {
			__io__generic__copy( getPreview_stitch_unstitchable(), preview_stitch_unstitchable);
		}
	}

	/**
	 * Get method for struct member 'preview_stitch_active'.
	 * @see #__DNA__FIELD__preview_stitch_active
	 */
	
	public CArrayFacade<Byte> getPreview_stitch_active() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 640, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 640, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'preview_stitch_active'.
	 * @see #__DNA__FIELD__preview_stitch_active
	 */
	
	public void setPreview_stitch_active(CArrayFacade<Byte> preview_stitch_active) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 640;
		} else {
			__dna__offset = 640;
		}
		if (__io__equals(preview_stitch_active, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, preview_stitch_active)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, preview_stitch_active);
		} else {
			__io__generic__copy( getPreview_stitch_active(), preview_stitch_active);
		}
	}

	/**
	 * Get method for struct member 'uv_shadow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> two uses, for uvs with modifier applied on mesh and uvs during painting </p>
	 * @see #__DNA__FIELD__uv_shadow
	 */
	
	public CArrayFacade<Byte> getUv_shadow() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 644, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 644, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uv_shadow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> two uses, for uvs with modifier applied on mesh and uvs during painting </p>
	 * @see #__DNA__FIELD__uv_shadow
	 */
	
	public void setUv_shadow(CArrayFacade<Byte> uv_shadow) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 644;
		} else {
			__dna__offset = 644;
		}
		if (__io__equals(uv_shadow, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uv_shadow)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uv_shadow);
		} else {
			__io__generic__copy( getUv_shadow(), uv_shadow);
		}
	}

	/**
	 * Get method for struct member 'uv_others'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> uvs of other objects </p>
	 * @see #__DNA__FIELD__uv_others
	 */
	
	public CArrayFacade<Byte> getUv_others() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 648, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 648, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uv_others'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> uvs of other objects </p>
	 * @see #__DNA__FIELD__uv_others
	 */
	
	public void setUv_others(CArrayFacade<Byte> uv_others) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 648;
		} else {
			__dna__offset = 648;
		}
		if (__io__equals(uv_others, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uv_others)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uv_others);
		} else {
			__io__generic__copy( getUv_others(), uv_others);
		}
	}

	/**
	 * Get method for struct member 'match'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> outliner - filter match </p>
	 * @see #__DNA__FIELD__match
	 */
	
	public CArrayFacade<Byte> getMatch() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 652, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 652, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'match'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> outliner - filter match </p>
	 * @see #__DNA__FIELD__match
	 */
	
	public void setMatch(CArrayFacade<Byte> match) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 652;
		} else {
			__dna__offset = 652;
		}
		if (__io__equals(match, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, match)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, match);
		} else {
			__io__generic__copy( getMatch(), match);
		}
	}

	/**
	 * Get method for struct member 'selected_highlight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> outliner - selected item </p>
	 * @see #__DNA__FIELD__selected_highlight
	 */
	
	public CArrayFacade<Byte> getSelected_highlight() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 656, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 656, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'selected_highlight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> outliner - selected item </p>
	 * @see #__DNA__FIELD__selected_highlight
	 */
	
	public void setSelected_highlight(CArrayFacade<Byte> selected_highlight) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 656;
		} else {
			__dna__offset = 656;
		}
		if (__io__equals(selected_highlight, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, selected_highlight)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, selected_highlight);
		} else {
			__io__generic__copy( getSelected_highlight(), selected_highlight);
		}
	}

	/**
	 * Get method for struct member 'skin_root'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Skin modifier root color </p>
	 * @see #__DNA__FIELD__skin_root
	 */
	
	public CArrayFacade<Byte> getSkin_root() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 660, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 660, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'skin_root'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Skin modifier root color </p>
	 * @see #__DNA__FIELD__skin_root
	 */
	
	public void setSkin_root(CArrayFacade<Byte> skin_root) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 660;
		} else {
			__dna__offset = 660;
		}
		if (__io__equals(skin_root, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, skin_root)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, skin_root);
		} else {
			__io__generic__copy( getSkin_root(), skin_root);
		}
	}

	/**
	 * Get method for struct member 'anim_active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA Active Action + Summary Channel </p>
	 * @see #__DNA__FIELD__anim_active
	 */
	
	public CArrayFacade<Byte> getAnim_active() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 664, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 664, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'anim_active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA Active Action + Summary Channel </p>
	 * @see #__DNA__FIELD__anim_active
	 */
	
	public void setAnim_active(CArrayFacade<Byte> anim_active) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 664;
		} else {
			__dna__offset = 664;
		}
		if (__io__equals(anim_active, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, anim_active)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, anim_active);
		} else {
			__io__generic__copy( getAnim_active(), anim_active);
		}
	}

	/**
	 * Get method for struct member 'anim_non_active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active Action = NULL </p>
	 * @see #__DNA__FIELD__anim_non_active
	 */
	
	public CArrayFacade<Byte> getAnim_non_active() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 668, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 668, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'anim_non_active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active Action = NULL </p>
	 * @see #__DNA__FIELD__anim_non_active
	 */
	
	public void setAnim_non_active(CArrayFacade<Byte> anim_non_active) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 668;
		} else {
			__dna__offset = 668;
		}
		if (__io__equals(anim_non_active, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, anim_non_active)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, anim_non_active);
		} else {
			__io__generic__copy( getAnim_non_active(), anim_non_active);
		}
	}

	/**
	 * Get method for struct member 'nla_tweaking'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA 'Tweaking' action/strip </p>
	 * @see #__DNA__FIELD__nla_tweaking
	 */
	
	public CArrayFacade<Byte> getNla_tweaking() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 672, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 672, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nla_tweaking'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA 'Tweaking' action/strip </p>
	 * @see #__DNA__FIELD__nla_tweaking
	 */
	
	public void setNla_tweaking(CArrayFacade<Byte> nla_tweaking) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 672;
		} else {
			__dna__offset = 672;
		}
		if (__io__equals(nla_tweaking, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nla_tweaking)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nla_tweaking);
		} else {
			__io__generic__copy( getNla_tweaking(), nla_tweaking);
		}
	}

	/**
	 * Get method for struct member 'nla_tweakdupli'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA - warning color for duplicate instances of tweaking strip </p>
	 * @see #__DNA__FIELD__nla_tweakdupli
	 */
	
	public CArrayFacade<Byte> getNla_tweakdupli() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 676, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 676, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nla_tweakdupli'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA - warning color for duplicate instances of tweaking strip </p>
	 * @see #__DNA__FIELD__nla_tweakdupli
	 */
	
	public void setNla_tweakdupli(CArrayFacade<Byte> nla_tweakdupli) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 676;
		} else {
			__dna__offset = 676;
		}
		if (__io__equals(nla_tweakdupli, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nla_tweakdupli)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nla_tweakdupli);
		} else {
			__io__generic__copy( getNla_tweakdupli(), nla_tweakdupli);
		}
	}

	/**
	 * Get method for struct member 'nla_transition'.
	 * @see #__DNA__FIELD__nla_transition
	 */
	
	public CArrayFacade<Byte> getNla_transition() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 680, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 680, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nla_transition'.
	 * @see #__DNA__FIELD__nla_transition
	 */
	
	public void setNla_transition(CArrayFacade<Byte> nla_transition) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 680;
		} else {
			__dna__offset = 680;
		}
		if (__io__equals(nla_transition, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nla_transition)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nla_transition);
		} else {
			__io__generic__copy( getNla_transition(), nla_transition);
		}
	}

	/**
	 * Get method for struct member 'nla_transition_sel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA "Transition" strips </p>
	 * @see #__DNA__FIELD__nla_transition_sel
	 */
	
	public CArrayFacade<Byte> getNla_transition_sel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 684, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 684, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nla_transition_sel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA "Transition" strips </p>
	 * @see #__DNA__FIELD__nla_transition_sel
	 */
	
	public void setNla_transition_sel(CArrayFacade<Byte> nla_transition_sel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 684;
		} else {
			__dna__offset = 684;
		}
		if (__io__equals(nla_transition_sel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nla_transition_sel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nla_transition_sel);
		} else {
			__io__generic__copy( getNla_transition_sel(), nla_transition_sel);
		}
	}

	/**
	 * Get method for struct member 'nla_meta'.
	 * @see #__DNA__FIELD__nla_meta
	 */
	
	public CArrayFacade<Byte> getNla_meta() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 688, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 688, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nla_meta'.
	 * @see #__DNA__FIELD__nla_meta
	 */
	
	public void setNla_meta(CArrayFacade<Byte> nla_meta) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 688;
		} else {
			__dna__offset = 688;
		}
		if (__io__equals(nla_meta, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nla_meta)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nla_meta);
		} else {
			__io__generic__copy( getNla_meta(), nla_meta);
		}
	}

	/**
	 * Get method for struct member 'nla_meta_sel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA "Meta" strips </p>
	 * @see #__DNA__FIELD__nla_meta_sel
	 */
	
	public CArrayFacade<Byte> getNla_meta_sel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 692, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 692, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nla_meta_sel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA "Meta" strips </p>
	 * @see #__DNA__FIELD__nla_meta_sel
	 */
	
	public void setNla_meta_sel(CArrayFacade<Byte> nla_meta_sel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 692;
		} else {
			__dna__offset = 692;
		}
		if (__io__equals(nla_meta_sel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nla_meta_sel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nla_meta_sel);
		} else {
			__io__generic__copy( getNla_meta_sel(), nla_meta_sel);
		}
	}

	/**
	 * Get method for struct member 'nla_sound'.
	 * @see #__DNA__FIELD__nla_sound
	 */
	
	public CArrayFacade<Byte> getNla_sound() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 696, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 696, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nla_sound'.
	 * @see #__DNA__FIELD__nla_sound
	 */
	
	public void setNla_sound(CArrayFacade<Byte> nla_sound) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 696;
		} else {
			__dna__offset = 696;
		}
		if (__io__equals(nla_sound, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nla_sound)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nla_sound);
		} else {
			__io__generic__copy( getNla_sound(), nla_sound);
		}
	}

	/**
	 * Get method for struct member 'nla_sound_sel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA "Sound" strips </p>
	 * @see #__DNA__FIELD__nla_sound_sel
	 */
	
	public CArrayFacade<Byte> getNla_sound_sel() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 700, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 700, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nla_sound_sel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NLA "Sound" strips </p>
	 * @see #__DNA__FIELD__nla_sound_sel
	 */
	
	public void setNla_sound_sel(CArrayFacade<Byte> nla_sound_sel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 700;
		} else {
			__dna__offset = 700;
		}
		if (__io__equals(nla_sound_sel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nla_sound_sel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nla_sound_sel);
		} else {
			__io__generic__copy( getNla_sound_sel(), nla_sound_sel);
		}
	}

	/**
	 * Get method for struct member 'info_selected'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> info </p>
	 * @see #__DNA__FIELD__info_selected
	 */
	
	public CArrayFacade<Byte> getInfo_selected() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 704, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 704, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'info_selected'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> info </p>
	 * @see #__DNA__FIELD__info_selected
	 */
	
	public void setInfo_selected(CArrayFacade<Byte> info_selected) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 704;
		} else {
			__dna__offset = 704;
		}
		if (__io__equals(info_selected, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, info_selected)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, info_selected);
		} else {
			__io__generic__copy( getInfo_selected(), info_selected);
		}
	}

	/**
	 * Get method for struct member 'info_selected_text'.
	 * @see #__DNA__FIELD__info_selected_text
	 */
	
	public CArrayFacade<Byte> getInfo_selected_text() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 708, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 708, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'info_selected_text'.
	 * @see #__DNA__FIELD__info_selected_text
	 */
	
	public void setInfo_selected_text(CArrayFacade<Byte> info_selected_text) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 708;
		} else {
			__dna__offset = 708;
		}
		if (__io__equals(info_selected_text, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, info_selected_text)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, info_selected_text);
		} else {
			__io__generic__copy( getInfo_selected_text(), info_selected_text);
		}
	}

	/**
	 * Get method for struct member 'info_error'.
	 * @see #__DNA__FIELD__info_error
	 */
	
	public CArrayFacade<Byte> getInfo_error() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 712, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 712, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'info_error'.
	 * @see #__DNA__FIELD__info_error
	 */
	
	public void setInfo_error(CArrayFacade<Byte> info_error) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 712;
		} else {
			__dna__offset = 712;
		}
		if (__io__equals(info_error, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, info_error)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, info_error);
		} else {
			__io__generic__copy( getInfo_error(), info_error);
		}
	}

	/**
	 * Get method for struct member 'info_error_text'.
	 * @see #__DNA__FIELD__info_error_text
	 */
	
	public CArrayFacade<Byte> getInfo_error_text() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 716, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 716, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'info_error_text'.
	 * @see #__DNA__FIELD__info_error_text
	 */
	
	public void setInfo_error_text(CArrayFacade<Byte> info_error_text) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 716;
		} else {
			__dna__offset = 716;
		}
		if (__io__equals(info_error_text, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, info_error_text)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, info_error_text);
		} else {
			__io__generic__copy( getInfo_error_text(), info_error_text);
		}
	}

	/**
	 * Get method for struct member 'info_warning'.
	 * @see #__DNA__FIELD__info_warning
	 */
	
	public CArrayFacade<Byte> getInfo_warning() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 720, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 720, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'info_warning'.
	 * @see #__DNA__FIELD__info_warning
	 */
	
	public void setInfo_warning(CArrayFacade<Byte> info_warning) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 720;
		} else {
			__dna__offset = 720;
		}
		if (__io__equals(info_warning, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, info_warning)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, info_warning);
		} else {
			__io__generic__copy( getInfo_warning(), info_warning);
		}
	}

	/**
	 * Get method for struct member 'info_warning_text'.
	 * @see #__DNA__FIELD__info_warning_text
	 */
	
	public CArrayFacade<Byte> getInfo_warning_text() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 724, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 724, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'info_warning_text'.
	 * @see #__DNA__FIELD__info_warning_text
	 */
	
	public void setInfo_warning_text(CArrayFacade<Byte> info_warning_text) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 724;
		} else {
			__dna__offset = 724;
		}
		if (__io__equals(info_warning_text, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, info_warning_text)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, info_warning_text);
		} else {
			__io__generic__copy( getInfo_warning_text(), info_warning_text);
		}
	}

	/**
	 * Get method for struct member 'info_info'.
	 * @see #__DNA__FIELD__info_info
	 */
	
	public CArrayFacade<Byte> getInfo_info() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 728, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 728, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'info_info'.
	 * @see #__DNA__FIELD__info_info
	 */
	
	public void setInfo_info(CArrayFacade<Byte> info_info) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 728;
		} else {
			__dna__offset = 728;
		}
		if (__io__equals(info_info, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, info_info)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, info_info);
		} else {
			__io__generic__copy( getInfo_info(), info_info);
		}
	}

	/**
	 * Get method for struct member 'info_info_text'.
	 * @see #__DNA__FIELD__info_info_text
	 */
	
	public CArrayFacade<Byte> getInfo_info_text() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 732, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 732, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'info_info_text'.
	 * @see #__DNA__FIELD__info_info_text
	 */
	
	public void setInfo_info_text(CArrayFacade<Byte> info_info_text) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 732;
		} else {
			__dna__offset = 732;
		}
		if (__io__equals(info_info_text, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, info_info_text)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, info_info_text);
		} else {
			__io__generic__copy( getInfo_info_text(), info_info_text);
		}
	}

	/**
	 * Get method for struct member 'info_debug'.
	 * @see #__DNA__FIELD__info_debug
	 */
	
	public CArrayFacade<Byte> getInfo_debug() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 736, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 736, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'info_debug'.
	 * @see #__DNA__FIELD__info_debug
	 */
	
	public void setInfo_debug(CArrayFacade<Byte> info_debug) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 736;
		} else {
			__dna__offset = 736;
		}
		if (__io__equals(info_debug, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, info_debug)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, info_debug);
		} else {
			__io__generic__copy( getInfo_debug(), info_debug);
		}
	}

	/**
	 * Get method for struct member 'info_debug_text'.
	 * @see #__DNA__FIELD__info_debug_text
	 */
	
	public CArrayFacade<Byte> getInfo_debug_text() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 740, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 740, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'info_debug_text'.
	 * @see #__DNA__FIELD__info_debug_text
	 */
	
	public void setInfo_debug_text(CArrayFacade<Byte> info_debug_text) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 740;
		} else {
			__dna__offset = 740;
		}
		if (__io__equals(info_debug_text, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, info_debug_text)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, info_debug_text);
		} else {
			__io__generic__copy( getInfo_debug_text(), info_debug_text);
		}
	}

	/**
	 * Get method for struct member 'paint_curve_pivot'.
	 * @see #__DNA__FIELD__paint_curve_pivot
	 */
	
	public CArrayFacade<Byte> getPaint_curve_pivot() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 744, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 744, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'paint_curve_pivot'.
	 * @see #__DNA__FIELD__paint_curve_pivot
	 */
	
	public void setPaint_curve_pivot(CArrayFacade<Byte> paint_curve_pivot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 744;
		} else {
			__dna__offset = 744;
		}
		if (__io__equals(paint_curve_pivot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, paint_curve_pivot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, paint_curve_pivot);
		} else {
			__io__generic__copy( getPaint_curve_pivot(), paint_curve_pivot);
		}
	}

	/**
	 * Get method for struct member 'paint_curve_handle'.
	 * @see #__DNA__FIELD__paint_curve_handle
	 */
	
	public CArrayFacade<Byte> getPaint_curve_handle() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 748, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 748, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'paint_curve_handle'.
	 * @see #__DNA__FIELD__paint_curve_handle
	 */
	
	public void setPaint_curve_handle(CArrayFacade<Byte> paint_curve_handle) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 748;
		} else {
			__dna__offset = 748;
		}
		if (__io__equals(paint_curve_handle, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, paint_curve_handle)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, paint_curve_handle);
		} else {
			__io__generic__copy( getPaint_curve_handle(), paint_curve_handle);
		}
	}

	/**
	 * Get method for struct member 'metadatabg'.
	 * @see #__DNA__FIELD__metadatabg
	 */
	
	public CArrayFacade<Byte> getMetadatabg() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 752, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 752, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'metadatabg'.
	 * @see #__DNA__FIELD__metadatabg
	 */
	
	public void setMetadatabg(CArrayFacade<Byte> metadatabg) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 752;
		} else {
			__dna__offset = 752;
		}
		if (__io__equals(metadatabg, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, metadatabg)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, metadatabg);
		} else {
			__io__generic__copy( getMetadatabg(), metadatabg);
		}
	}

	/**
	 * Get method for struct member 'metadatatext'.
	 * @see #__DNA__FIELD__metadatatext
	 */
	
	public CArrayFacade<Byte> getMetadatatext() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 756, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 756, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'metadatatext'.
	 * @see #__DNA__FIELD__metadatatext
	 */
	
	public void setMetadatatext(CArrayFacade<Byte> metadatatext) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 756;
		} else {
			__dna__offset = 756;
		}
		if (__io__equals(metadatatext, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, metadatatext)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, metadatatext);
		} else {
			__io__generic__copy( getMetadatatext(), metadatatext);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ThemeSpace> __io__addressof() {
		return new CPointer<ThemeSpace>(__io__address, new Class[]{ThemeSpace.class}, __io__block, __io__blockTable);
	}

}
