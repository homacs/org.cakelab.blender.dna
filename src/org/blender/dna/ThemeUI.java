package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ThemeUI'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=912, size64=912)
public class ThemeUI extends CFacade {

	/**
	 * This is the sdna index of the struct ThemeUI.
	 * <p>
	 * It is required when allocating a new block to store data for ThemeUI.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 242;

	/**
	 * Field descriptor (offset) for struct member 'wcol_regular'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Interface Elements (buttons, menus, icons) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_regular);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_regular = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_regular'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_regular = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'wcol_tool'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_tool);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_tool = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_tool'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_tool = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'wcol_text'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_text);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_text = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_text'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_text = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'wcol_radio'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_radio);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_radio = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_radio'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_radio = new long[]{96, 96};

	/**
	 * Field descriptor (offset) for struct member 'wcol_option'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_option);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_option = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_option'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_option = new long[]{128, 128};

	/**
	 * Field descriptor (offset) for struct member 'wcol_toggle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_toggle);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_toggle = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_toggle'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_toggle = new long[]{160, 160};

	/**
	 * Field descriptor (offset) for struct member 'wcol_num'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_num);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_num = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_num'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_num = new long[]{192, 192};

	/**
	 * Field descriptor (offset) for struct member 'wcol_numslider'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_numslider);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_numslider = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_numslider'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_numslider = new long[]{224, 224};

	/**
	 * Field descriptor (offset) for struct member 'wcol_menu'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_menu);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_menu = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_menu'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_menu = new long[]{256, 256};

	/**
	 * Field descriptor (offset) for struct member 'wcol_pulldown'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_pulldown);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_pulldown = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_pulldown'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_pulldown = new long[]{288, 288};

	/**
	 * Field descriptor (offset) for struct member 'wcol_menu_back'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_menu_back);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_menu_back = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_menu_back'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_menu_back = new long[]{320, 320};

	/**
	 * Field descriptor (offset) for struct member 'wcol_menu_item'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_menu_item);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_menu_item = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_menu_item'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_menu_item = new long[]{352, 352};

	/**
	 * Field descriptor (offset) for struct member 'wcol_tooltip'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_tooltip);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_tooltip = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_tooltip'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_tooltip = new long[]{384, 384};

	/**
	 * Field descriptor (offset) for struct member 'wcol_box'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_box);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_box = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_box'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_box = new long[]{416, 416};

	/**
	 * Field descriptor (offset) for struct member 'wcol_scroll'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_scroll);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_scroll = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_scroll'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_scroll = new long[]{448, 448};

	/**
	 * Field descriptor (offset) for struct member 'wcol_progress'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_progress);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_progress = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_progress'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_progress = new long[]{480, 480};

	/**
	 * Field descriptor (offset) for struct member 'wcol_list_item'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_list_item);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_list_item = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_list_item'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_list_item = new long[]{512, 512};

	/**
	 * Field descriptor (offset) for struct member 'wcol_pie_menu'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_pie_menu);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_pie_menu = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_pie_menu'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_pie_menu = new long[]{544, 544};

	/**
	 * Field descriptor (offset) for struct member 'wcol_state'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_state);
	 * CPointer&lt;uiWidgetStateColors&gt; p_wcol_state = p.cast(new Class[]{uiWidgetStateColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_state'</li>
	 * <li>Signature: 'uiWidgetStateColors'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_state = new long[]{576, 576};

	/**
	 * Field descriptor (offset) for struct member 'panel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> depricated, but we keep it for do_versions (2.66.1) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__panel);
	 * CPointer&lt;uiPanelColors&gt; p_panel = p.cast(new Class[]{uiPanelColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'panel'</li>
	 * <li>Signature: 'uiPanelColors'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__panel = new long[]{608, 608};

	/**
	 * Field descriptor (offset) for struct member 'widget_emboss'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__widget_emboss);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_widget_emboss = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'widget_emboss'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__widget_emboss = new long[]{624, 624};

	/**
	 * Field descriptor (offset) for struct member 'menu_shadow_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> fac: 0 - 1 for blend factor, width in pixels </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__menu_shadow_fac);
	 * CPointer&lt;Float&gt; p_menu_shadow_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'menu_shadow_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__menu_shadow_fac = new long[]{628, 628};

	/**
	 * Field descriptor (offset) for struct member 'menu_shadow_width'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__menu_shadow_width);
	 * CPointer&lt;Short&gt; p_menu_shadow_width = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'menu_shadow_width'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__menu_shadow_width = new long[]{632, 632};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short[3]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{634, 634};

	/**
	 * Field descriptor (offset) for struct member 'iconfile'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__iconfile);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_iconfile = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iconfile'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iconfile = new long[]{640, 640};

	/**
	 * Field descriptor (offset) for struct member 'icon_alpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__icon_alpha);
	 * CPointer&lt;Float&gt; p_icon_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'icon_alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__icon_alpha = new long[]{896, 896};

	/**
	 * Field descriptor (offset) for struct member 'xaxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis Colors </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__xaxis);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_xaxis = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xaxis'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xaxis = new long[]{900, 900};

	/**
	 * Field descriptor (offset) for struct member 'yaxis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__yaxis);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_yaxis = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yaxis'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yaxis = new long[]{904, 904};

	/**
	 * Field descriptor (offset) for struct member 'zaxis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__zaxis);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_zaxis = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zaxis'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zaxis = new long[]{908, 908};

	public ThemeUI(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ThemeUI(ThemeUI that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'wcol_regular'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Interface Elements (buttons, menus, icons) </p>
	 * @see #__DNA__FIELD__wcol_regular
	 */
	
	public uiWidgetColors getWcol_regular() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_regular'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Interface Elements (buttons, menus, icons) </p>
	 * @see #__DNA__FIELD__wcol_regular
	 */
	
	public void setWcol_regular(uiWidgetColors wcol_regular) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(wcol_regular, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_regular)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_regular);
		} else {
			__io__generic__copy( getWcol_regular(), wcol_regular);
		}
	}

	/**
	 * Get method for struct member 'wcol_tool'.
	 * @see #__DNA__FIELD__wcol_tool
	 */
	
	public uiWidgetColors getWcol_tool() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 32, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 32, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_tool'.
	 * @see #__DNA__FIELD__wcol_tool
	 */
	
	public void setWcol_tool(uiWidgetColors wcol_tool) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(wcol_tool, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_tool)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_tool);
		} else {
			__io__generic__copy( getWcol_tool(), wcol_tool);
		}
	}

	/**
	 * Get method for struct member 'wcol_text'.
	 * @see #__DNA__FIELD__wcol_text
	 */
	
	public uiWidgetColors getWcol_text() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 64, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 64, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_text'.
	 * @see #__DNA__FIELD__wcol_text
	 */
	
	public void setWcol_text(uiWidgetColors wcol_text) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(wcol_text, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_text)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_text);
		} else {
			__io__generic__copy( getWcol_text(), wcol_text);
		}
	}

	/**
	 * Get method for struct member 'wcol_radio'.
	 * @see #__DNA__FIELD__wcol_radio
	 */
	
	public uiWidgetColors getWcol_radio() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 96, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 96, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_radio'.
	 * @see #__DNA__FIELD__wcol_radio
	 */
	
	public void setWcol_radio(uiWidgetColors wcol_radio) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(wcol_radio, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_radio)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_radio);
		} else {
			__io__generic__copy( getWcol_radio(), wcol_radio);
		}
	}

	/**
	 * Get method for struct member 'wcol_option'.
	 * @see #__DNA__FIELD__wcol_option
	 */
	
	public uiWidgetColors getWcol_option() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 128, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 128, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_option'.
	 * @see #__DNA__FIELD__wcol_option
	 */
	
	public void setWcol_option(uiWidgetColors wcol_option) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 128;
		}
		if (__io__equals(wcol_option, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_option)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_option);
		} else {
			__io__generic__copy( getWcol_option(), wcol_option);
		}
	}

	/**
	 * Get method for struct member 'wcol_toggle'.
	 * @see #__DNA__FIELD__wcol_toggle
	 */
	
	public uiWidgetColors getWcol_toggle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 160, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 160, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_toggle'.
	 * @see #__DNA__FIELD__wcol_toggle
	 */
	
	public void setWcol_toggle(uiWidgetColors wcol_toggle) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 160;
		}
		if (__io__equals(wcol_toggle, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_toggle)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_toggle);
		} else {
			__io__generic__copy( getWcol_toggle(), wcol_toggle);
		}
	}

	/**
	 * Get method for struct member 'wcol_num'.
	 * @see #__DNA__FIELD__wcol_num
	 */
	
	public uiWidgetColors getWcol_num() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 192, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 192, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_num'.
	 * @see #__DNA__FIELD__wcol_num
	 */
	
	public void setWcol_num(uiWidgetColors wcol_num) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 192;
		}
		if (__io__equals(wcol_num, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_num)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_num);
		} else {
			__io__generic__copy( getWcol_num(), wcol_num);
		}
	}

	/**
	 * Get method for struct member 'wcol_numslider'.
	 * @see #__DNA__FIELD__wcol_numslider
	 */
	
	public uiWidgetColors getWcol_numslider() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 224, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 224, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_numslider'.
	 * @see #__DNA__FIELD__wcol_numslider
	 */
	
	public void setWcol_numslider(uiWidgetColors wcol_numslider) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 224;
		} else {
			__dna__offset = 224;
		}
		if (__io__equals(wcol_numslider, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_numslider)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_numslider);
		} else {
			__io__generic__copy( getWcol_numslider(), wcol_numslider);
		}
	}

	/**
	 * Get method for struct member 'wcol_menu'.
	 * @see #__DNA__FIELD__wcol_menu
	 */
	
	public uiWidgetColors getWcol_menu() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 256, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 256, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_menu'.
	 * @see #__DNA__FIELD__wcol_menu
	 */
	
	public void setWcol_menu(uiWidgetColors wcol_menu) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 256;
		} else {
			__dna__offset = 256;
		}
		if (__io__equals(wcol_menu, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_menu)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_menu);
		} else {
			__io__generic__copy( getWcol_menu(), wcol_menu);
		}
	}

	/**
	 * Get method for struct member 'wcol_pulldown'.
	 * @see #__DNA__FIELD__wcol_pulldown
	 */
	
	public uiWidgetColors getWcol_pulldown() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 288, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 288, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_pulldown'.
	 * @see #__DNA__FIELD__wcol_pulldown
	 */
	
	public void setWcol_pulldown(uiWidgetColors wcol_pulldown) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 288;
		} else {
			__dna__offset = 288;
		}
		if (__io__equals(wcol_pulldown, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_pulldown)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_pulldown);
		} else {
			__io__generic__copy( getWcol_pulldown(), wcol_pulldown);
		}
	}

	/**
	 * Get method for struct member 'wcol_menu_back'.
	 * @see #__DNA__FIELD__wcol_menu_back
	 */
	
	public uiWidgetColors getWcol_menu_back() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 320, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 320, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_menu_back'.
	 * @see #__DNA__FIELD__wcol_menu_back
	 */
	
	public void setWcol_menu_back(uiWidgetColors wcol_menu_back) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 320;
		} else {
			__dna__offset = 320;
		}
		if (__io__equals(wcol_menu_back, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_menu_back)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_menu_back);
		} else {
			__io__generic__copy( getWcol_menu_back(), wcol_menu_back);
		}
	}

	/**
	 * Get method for struct member 'wcol_menu_item'.
	 * @see #__DNA__FIELD__wcol_menu_item
	 */
	
	public uiWidgetColors getWcol_menu_item() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 352, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 352, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_menu_item'.
	 * @see #__DNA__FIELD__wcol_menu_item
	 */
	
	public void setWcol_menu_item(uiWidgetColors wcol_menu_item) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 352;
		} else {
			__dna__offset = 352;
		}
		if (__io__equals(wcol_menu_item, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_menu_item)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_menu_item);
		} else {
			__io__generic__copy( getWcol_menu_item(), wcol_menu_item);
		}
	}

	/**
	 * Get method for struct member 'wcol_tooltip'.
	 * @see #__DNA__FIELD__wcol_tooltip
	 */
	
	public uiWidgetColors getWcol_tooltip() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 384, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 384, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_tooltip'.
	 * @see #__DNA__FIELD__wcol_tooltip
	 */
	
	public void setWcol_tooltip(uiWidgetColors wcol_tooltip) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 384;
		} else {
			__dna__offset = 384;
		}
		if (__io__equals(wcol_tooltip, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_tooltip)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_tooltip);
		} else {
			__io__generic__copy( getWcol_tooltip(), wcol_tooltip);
		}
	}

	/**
	 * Get method for struct member 'wcol_box'.
	 * @see #__DNA__FIELD__wcol_box
	 */
	
	public uiWidgetColors getWcol_box() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 416, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 416, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_box'.
	 * @see #__DNA__FIELD__wcol_box
	 */
	
	public void setWcol_box(uiWidgetColors wcol_box) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 416;
		} else {
			__dna__offset = 416;
		}
		if (__io__equals(wcol_box, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_box)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_box);
		} else {
			__io__generic__copy( getWcol_box(), wcol_box);
		}
	}

	/**
	 * Get method for struct member 'wcol_scroll'.
	 * @see #__DNA__FIELD__wcol_scroll
	 */
	
	public uiWidgetColors getWcol_scroll() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 448, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 448, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_scroll'.
	 * @see #__DNA__FIELD__wcol_scroll
	 */
	
	public void setWcol_scroll(uiWidgetColors wcol_scroll) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 448;
		} else {
			__dna__offset = 448;
		}
		if (__io__equals(wcol_scroll, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_scroll)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_scroll);
		} else {
			__io__generic__copy( getWcol_scroll(), wcol_scroll);
		}
	}

	/**
	 * Get method for struct member 'wcol_progress'.
	 * @see #__DNA__FIELD__wcol_progress
	 */
	
	public uiWidgetColors getWcol_progress() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 480, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 480, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_progress'.
	 * @see #__DNA__FIELD__wcol_progress
	 */
	
	public void setWcol_progress(uiWidgetColors wcol_progress) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 480;
		} else {
			__dna__offset = 480;
		}
		if (__io__equals(wcol_progress, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_progress)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_progress);
		} else {
			__io__generic__copy( getWcol_progress(), wcol_progress);
		}
	}

	/**
	 * Get method for struct member 'wcol_list_item'.
	 * @see #__DNA__FIELD__wcol_list_item
	 */
	
	public uiWidgetColors getWcol_list_item() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 512, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 512, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_list_item'.
	 * @see #__DNA__FIELD__wcol_list_item
	 */
	
	public void setWcol_list_item(uiWidgetColors wcol_list_item) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 512;
		} else {
			__dna__offset = 512;
		}
		if (__io__equals(wcol_list_item, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_list_item)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_list_item);
		} else {
			__io__generic__copy( getWcol_list_item(), wcol_list_item);
		}
	}

	/**
	 * Get method for struct member 'wcol_pie_menu'.
	 * @see #__DNA__FIELD__wcol_pie_menu
	 */
	
	public uiWidgetColors getWcol_pie_menu() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 544, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 544, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_pie_menu'.
	 * @see #__DNA__FIELD__wcol_pie_menu
	 */
	
	public void setWcol_pie_menu(uiWidgetColors wcol_pie_menu) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 544;
		} else {
			__dna__offset = 544;
		}
		if (__io__equals(wcol_pie_menu, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_pie_menu)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_pie_menu);
		} else {
			__io__generic__copy( getWcol_pie_menu(), wcol_pie_menu);
		}
	}

	/**
	 * Get method for struct member 'wcol_state'.
	 * @see #__DNA__FIELD__wcol_state
	 */
	
	public uiWidgetStateColors getWcol_state() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetStateColors(__io__address + 576, __io__block, __io__blockTable);
		} else {
			return new uiWidgetStateColors(__io__address + 576, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_state'.
	 * @see #__DNA__FIELD__wcol_state
	 */
	
	public void setWcol_state(uiWidgetStateColors wcol_state) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 576;
		} else {
			__dna__offset = 576;
		}
		if (__io__equals(wcol_state, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_state)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_state);
		} else {
			__io__generic__copy( getWcol_state(), wcol_state);
		}
	}

	/**
	 * Get method for struct member 'panel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> depricated, but we keep it for do_versions (2.66.1) </p>
	 * @see #__DNA__FIELD__panel
	 */
	
	public uiPanelColors getPanel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiPanelColors(__io__address + 608, __io__block, __io__blockTable);
		} else {
			return new uiPanelColors(__io__address + 608, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'panel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> depricated, but we keep it for do_versions (2.66.1) </p>
	 * @see #__DNA__FIELD__panel
	 */
	
	public void setPanel(uiPanelColors panel) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 608;
		} else {
			__dna__offset = 608;
		}
		if (__io__equals(panel, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, panel)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, panel);
		} else {
			__io__generic__copy( getPanel(), panel);
		}
	}

	/**
	 * Get method for struct member 'widget_emboss'.
	 * @see #__DNA__FIELD__widget_emboss
	 */
	
	public CArrayFacade<Byte> getWidget_emboss() throws IOException
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
	 * Set method for struct member 'widget_emboss'.
	 * @see #__DNA__FIELD__widget_emboss
	 */
	
	public void setWidget_emboss(CArrayFacade<Byte> widget_emboss) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 624;
		} else {
			__dna__offset = 624;
		}
		if (__io__equals(widget_emboss, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, widget_emboss)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, widget_emboss);
		} else {
			__io__generic__copy( getWidget_emboss(), widget_emboss);
		}
	}

	/**
	 * Get method for struct member 'menu_shadow_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> fac: 0 - 1 for blend factor, width in pixels </p>
	 * @see #__DNA__FIELD__menu_shadow_fac
	 */
	
	public float getMenu_shadow_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 628);
		} else {
			return __io__block.readFloat(__io__address + 628);
		}
	}

	/**
	 * Set method for struct member 'menu_shadow_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> fac: 0 - 1 for blend factor, width in pixels </p>
	 * @see #__DNA__FIELD__menu_shadow_fac
	 */
	
	public void setMenu_shadow_fac(float menu_shadow_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 628, menu_shadow_fac);
		} else {
			__io__block.writeFloat(__io__address + 628, menu_shadow_fac);
		}
	}

	/**
	 * Get method for struct member 'menu_shadow_width'.
	 * @see #__DNA__FIELD__menu_shadow_width
	 */
	
	public short getMenu_shadow_width() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 632);
		} else {
			return __io__block.readShort(__io__address + 632);
		}
	}

	/**
	 * Set method for struct member 'menu_shadow_width'.
	 * @see #__DNA__FIELD__menu_shadow_width
	 */
	
	public void setMenu_shadow_width(short menu_shadow_width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 632, menu_shadow_width);
		} else {
			__io__block.writeShort(__io__address + 632, menu_shadow_width);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Short> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 634, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 634, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Short> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 634;
		} else {
			__dna__offset = 634;
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
	 * Get method for struct member 'iconfile'.
	 * @see #__DNA__FIELD__iconfile
	 */
	
	public CArrayFacade<Byte> getIconfile() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 640, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 640, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'iconfile'.
	 * @see #__DNA__FIELD__iconfile
	 */
	
	public void setIconfile(CArrayFacade<Byte> iconfile) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 640;
		} else {
			__dna__offset = 640;
		}
		if (__io__equals(iconfile, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, iconfile)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, iconfile);
		} else {
			__io__generic__copy( getIconfile(), iconfile);
		}
	}

	/**
	 * Get method for struct member 'icon_alpha'.
	 * @see #__DNA__FIELD__icon_alpha
	 */
	
	public float getIcon_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 896);
		} else {
			return __io__block.readFloat(__io__address + 896);
		}
	}

	/**
	 * Set method for struct member 'icon_alpha'.
	 * @see #__DNA__FIELD__icon_alpha
	 */
	
	public void setIcon_alpha(float icon_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 896, icon_alpha);
		} else {
			__io__block.writeFloat(__io__address + 896, icon_alpha);
		}
	}

	/**
	 * Get method for struct member 'xaxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis Colors </p>
	 * @see #__DNA__FIELD__xaxis
	 */
	
	public CArrayFacade<Byte> getXaxis() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 900, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 900, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'xaxis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis Colors </p>
	 * @see #__DNA__FIELD__xaxis
	 */
	
	public void setXaxis(CArrayFacade<Byte> xaxis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 900;
		} else {
			__dna__offset = 900;
		}
		if (__io__equals(xaxis, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, xaxis)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, xaxis);
		} else {
			__io__generic__copy( getXaxis(), xaxis);
		}
	}

	/**
	 * Get method for struct member 'yaxis'.
	 * @see #__DNA__FIELD__yaxis
	 */
	
	public CArrayFacade<Byte> getYaxis() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 904, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 904, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'yaxis'.
	 * @see #__DNA__FIELD__yaxis
	 */
	
	public void setYaxis(CArrayFacade<Byte> yaxis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 904;
		} else {
			__dna__offset = 904;
		}
		if (__io__equals(yaxis, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, yaxis)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, yaxis);
		} else {
			__io__generic__copy( getYaxis(), yaxis);
		}
	}

	/**
	 * Get method for struct member 'zaxis'.
	 * @see #__DNA__FIELD__zaxis
	 */
	
	public CArrayFacade<Byte> getZaxis() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 908, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 908, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'zaxis'.
	 * @see #__DNA__FIELD__zaxis
	 */
	
	public void setZaxis(CArrayFacade<Byte> zaxis) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 908;
		} else {
			__dna__offset = 908;
		}
		if (__io__equals(zaxis, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, zaxis)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, zaxis);
		} else {
			__io__generic__copy( getZaxis(), zaxis);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ThemeUI> __io__addressof() {
		return new CPointer<ThemeUI>(__io__address, new Class[]{ThemeUI.class}, __io__block, __io__blockTable);
	}

}
