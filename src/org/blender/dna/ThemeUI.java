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

@CMetaData(size32=936, size64=936)
public class ThemeUI extends CFacade {

	/**
	 * This is the sdna index of the struct ThemeUI.
	 * <p>
	 * It is required when allocating a new block to store data for ThemeUI.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 244;

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_tool = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'wcol_toolbar_item'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_toolbar_item);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_toolbar_item = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_toolbar_item'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_toolbar_item = new long[]{80, 80};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_text = new long[]{120, 120};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_radio = new long[]{160, 160};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_option = new long[]{200, 200};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_toggle = new long[]{240, 240};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_num = new long[]{280, 280};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_numslider = new long[]{320, 320};

	/**
	 * Field descriptor (offset) for struct member 'wcol_tab'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__wcol_tab);
	 * CPointer&lt;uiWidgetColors&gt; p_wcol_tab = p.cast(new Class[]{uiWidgetColors.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wcol_tab'</li>
	 * <li>Signature: 'uiWidgetColors'</li>
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_tab = new long[]{360, 360};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_menu = new long[]{400, 400};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_pulldown = new long[]{440, 440};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_menu_back = new long[]{480, 480};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_menu_item = new long[]{520, 520};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_tooltip = new long[]{560, 560};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_box = new long[]{600, 600};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_scroll = new long[]{640, 640};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_progress = new long[]{680, 680};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_list_item = new long[]{720, 720};

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
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_pie_menu = new long[]{760, 760};

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
	 * <li>Actual Size (32bit/64bit): 48/48</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wcol_state = new long[]{800, 800};

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
	public static final long[] __DNA__FIELD__widget_emboss = new long[]{848, 848};

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
	public static final long[] __DNA__FIELD__menu_shadow_fac = new long[]{852, 852};

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
	public static final long[] __DNA__FIELD__menu_shadow_width = new long[]{856, 856};

	/**
	 * Field descriptor (offset) for struct member 'editor_outline'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__editor_outline);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_editor_outline = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'editor_outline'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__editor_outline = new long[]{858, 858};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{862, 862};

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
	public static final long[] __DNA__FIELD__icon_alpha = new long[]{864, 864};

	/**
	 * Field descriptor (offset) for struct member 'icon_saturation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__icon_saturation);
	 * CPointer&lt;Float&gt; p_icon_saturation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'icon_saturation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__icon_saturation = new long[]{868, 868};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{872, 872};

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
	public static final long[] __DNA__FIELD__xaxis = new long[]{876, 876};

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
	public static final long[] __DNA__FIELD__yaxis = new long[]{880, 880};

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
	public static final long[] __DNA__FIELD__zaxis = new long[]{884, 884};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_hi'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gizmo Colors. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__gizmo_hi);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_gizmo_hi = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_hi'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_hi = new long[]{888, 888};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_primary'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__gizmo_primary);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_gizmo_primary = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_primary'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_primary = new long[]{892, 892};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_secondary'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__gizmo_secondary);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_gizmo_secondary = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_secondary'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_secondary = new long[]{896, 896};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_a'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__gizmo_a);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_gizmo_a = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_a'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_a = new long[]{900, 900};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_b'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__gizmo_b);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_gizmo_b = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_b'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_b = new long[]{904, 904};

	/**
	 * Field descriptor (offset) for struct member 'icon_scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Icon Colors. {@link Scene}  items. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__icon_scene);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_icon_scene = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'icon_scene'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__icon_scene = new long[]{908, 908};

	/**
	 * Field descriptor (offset) for struct member 'icon_collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Collection}  items. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__icon_collection);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_icon_collection = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'icon_collection'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__icon_collection = new long[]{912, 912};

	/**
	 * Field descriptor (offset) for struct member 'icon_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  items. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__icon_object);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_icon_object = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'icon_object'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__icon_object = new long[]{916, 916};

	/**
	 * Field descriptor (offset) for struct member 'icon_object_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  data items. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__icon_object_data);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_icon_object_data = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'icon_object_data'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__icon_object_data = new long[]{920, 920};

	/**
	 * Field descriptor (offset) for struct member 'icon_modifier'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Modifier and constraint items. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__icon_modifier);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_icon_modifier = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'icon_modifier'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__icon_modifier = new long[]{924, 924};

	/**
	 * Field descriptor (offset) for struct member 'icon_shading'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shading related items. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__icon_shading);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_icon_shading = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'icon_shading'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__icon_shading = new long[]{928, 928};

	/**
	 * Field descriptor (offset) for struct member 'icon_border_intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Intensity of the border icons. >0 will render an border around themed icons. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ThemeUI themeui = ...;
	 * CPointer&lt;Object&gt; p = themeui.__dna__addressof(ThemeUI.__DNA__FIELD__icon_border_intensity);
	 * CPointer&lt;Float&gt; p_icon_border_intensity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'icon_border_intensity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__icon_border_intensity = new long[]{932, 932};

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
			return new uiWidgetColors(__io__address + 40, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 40, __io__block, __io__blockTable);
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
			__dna__offset = 40;
		} else {
			__dna__offset = 40;
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
	 * Get method for struct member 'wcol_toolbar_item'.
	 * @see #__DNA__FIELD__wcol_toolbar_item
	 */
	
	public uiWidgetColors getWcol_toolbar_item() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 80, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 80, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_toolbar_item'.
	 * @see #__DNA__FIELD__wcol_toolbar_item
	 */
	
	public void setWcol_toolbar_item(uiWidgetColors wcol_toolbar_item) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(wcol_toolbar_item, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_toolbar_item)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_toolbar_item);
		} else {
			__io__generic__copy( getWcol_toolbar_item(), wcol_toolbar_item);
		}
	}

	/**
	 * Get method for struct member 'wcol_text'.
	 * @see #__DNA__FIELD__wcol_text
	 */
	
	public uiWidgetColors getWcol_text() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 120, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 120, __io__block, __io__blockTable);
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
			__dna__offset = 120;
		} else {
			__dna__offset = 120;
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
			return new uiWidgetColors(__io__address + 160, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 160, __io__block, __io__blockTable);
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
			__dna__offset = 160;
		} else {
			__dna__offset = 160;
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
			return new uiWidgetColors(__io__address + 200, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 200, __io__block, __io__blockTable);
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
			__dna__offset = 200;
		} else {
			__dna__offset = 200;
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
			return new uiWidgetColors(__io__address + 240, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 240, __io__block, __io__blockTable);
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
			__dna__offset = 240;
		} else {
			__dna__offset = 240;
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
			return new uiWidgetColors(__io__address + 280, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 280, __io__block, __io__blockTable);
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
			__dna__offset = 280;
		} else {
			__dna__offset = 280;
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
			return new uiWidgetColors(__io__address + 320, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 320, __io__block, __io__blockTable);
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
			__dna__offset = 320;
		} else {
			__dna__offset = 320;
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
	 * Get method for struct member 'wcol_tab'.
	 * @see #__DNA__FIELD__wcol_tab
	 */
	
	public uiWidgetColors getWcol_tab() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 360, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 360, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'wcol_tab'.
	 * @see #__DNA__FIELD__wcol_tab
	 */
	
	public void setWcol_tab(uiWidgetColors wcol_tab) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 360;
		} else {
			__dna__offset = 360;
		}
		if (__io__equals(wcol_tab, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, wcol_tab)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, wcol_tab);
		} else {
			__io__generic__copy( getWcol_tab(), wcol_tab);
		}
	}

	/**
	 * Get method for struct member 'wcol_menu'.
	 * @see #__DNA__FIELD__wcol_menu
	 */
	
	public uiWidgetColors getWcol_menu() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new uiWidgetColors(__io__address + 400, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 400, __io__block, __io__blockTable);
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
			__dna__offset = 400;
		} else {
			__dna__offset = 400;
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
			return new uiWidgetColors(__io__address + 440, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 440, __io__block, __io__blockTable);
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
			__dna__offset = 440;
		} else {
			__dna__offset = 440;
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
			return new uiWidgetColors(__io__address + 480, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 480, __io__block, __io__blockTable);
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
			__dna__offset = 480;
		} else {
			__dna__offset = 480;
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
			return new uiWidgetColors(__io__address + 520, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 520, __io__block, __io__blockTable);
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
			__dna__offset = 520;
		} else {
			__dna__offset = 520;
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
			return new uiWidgetColors(__io__address + 560, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 560, __io__block, __io__blockTable);
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
			__dna__offset = 560;
		} else {
			__dna__offset = 560;
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
			return new uiWidgetColors(__io__address + 600, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 600, __io__block, __io__blockTable);
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
			__dna__offset = 600;
		} else {
			__dna__offset = 600;
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
			return new uiWidgetColors(__io__address + 640, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 640, __io__block, __io__blockTable);
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
			__dna__offset = 640;
		} else {
			__dna__offset = 640;
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
			return new uiWidgetColors(__io__address + 680, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 680, __io__block, __io__blockTable);
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
			__dna__offset = 680;
		} else {
			__dna__offset = 680;
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
			return new uiWidgetColors(__io__address + 720, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 720, __io__block, __io__blockTable);
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
			__dna__offset = 720;
		} else {
			__dna__offset = 720;
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
			return new uiWidgetColors(__io__address + 760, __io__block, __io__blockTable);
		} else {
			return new uiWidgetColors(__io__address + 760, __io__block, __io__blockTable);
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
			__dna__offset = 760;
		} else {
			__dna__offset = 760;
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
			return new uiWidgetStateColors(__io__address + 800, __io__block, __io__blockTable);
		} else {
			return new uiWidgetStateColors(__io__address + 800, __io__block, __io__blockTable);
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
			__dna__offset = 800;
		} else {
			__dna__offset = 800;
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
			return new CArrayFacade<Byte>(__io__address + 848, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 848, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 848;
		} else {
			__dna__offset = 848;
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
			return __io__block.readFloat(__io__address + 852);
		} else {
			return __io__block.readFloat(__io__address + 852);
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
			__io__block.writeFloat(__io__address + 852, menu_shadow_fac);
		} else {
			__io__block.writeFloat(__io__address + 852, menu_shadow_fac);
		}
	}

	/**
	 * Get method for struct member 'menu_shadow_width'.
	 * @see #__DNA__FIELD__menu_shadow_width
	 */
	
	public short getMenu_shadow_width() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 856);
		} else {
			return __io__block.readShort(__io__address + 856);
		}
	}

	/**
	 * Set method for struct member 'menu_shadow_width'.
	 * @see #__DNA__FIELD__menu_shadow_width
	 */
	
	public void setMenu_shadow_width(short menu_shadow_width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 856, menu_shadow_width);
		} else {
			__io__block.writeShort(__io__address + 856, menu_shadow_width);
		}
	}

	/**
	 * Get method for struct member 'editor_outline'.
	 * @see #__DNA__FIELD__editor_outline
	 */
	
	public CArrayFacade<Byte> getEditor_outline() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 858, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 858, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'editor_outline'.
	 * @see #__DNA__FIELD__editor_outline
	 */
	
	public void setEditor_outline(CArrayFacade<Byte> editor_outline) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 858;
		} else {
			__dna__offset = 858;
		}
		if (__io__equals(editor_outline, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, editor_outline)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, editor_outline);
		} else {
			__io__generic__copy( getEditor_outline(), editor_outline);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 862, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 862, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 862;
		} else {
			__dna__offset = 862;
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
	 * Get method for struct member 'icon_alpha'.
	 * @see #__DNA__FIELD__icon_alpha
	 */
	
	public float getIcon_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 864);
		} else {
			return __io__block.readFloat(__io__address + 864);
		}
	}

	/**
	 * Set method for struct member 'icon_alpha'.
	 * @see #__DNA__FIELD__icon_alpha
	 */
	
	public void setIcon_alpha(float icon_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 864, icon_alpha);
		} else {
			__io__block.writeFloat(__io__address + 864, icon_alpha);
		}
	}

	/**
	 * Get method for struct member 'icon_saturation'.
	 * @see #__DNA__FIELD__icon_saturation
	 */
	
	public float getIcon_saturation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 868);
		} else {
			return __io__block.readFloat(__io__address + 868);
		}
	}

	/**
	 * Set method for struct member 'icon_saturation'.
	 * @see #__DNA__FIELD__icon_saturation
	 */
	
	public void setIcon_saturation(float icon_saturation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 868, icon_saturation);
		} else {
			__io__block.writeFloat(__io__address + 868, icon_saturation);
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
			return new CArrayFacade<Byte>(__io__address + 872, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 872, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 872;
		} else {
			__dna__offset = 872;
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
			return new CArrayFacade<Byte>(__io__address + 876, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 876, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 876;
		} else {
			__dna__offset = 876;
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
			return new CArrayFacade<Byte>(__io__address + 880, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 880, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 880;
		} else {
			__dna__offset = 880;
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
			return new CArrayFacade<Byte>(__io__address + 884, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 884, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 884;
		} else {
			__dna__offset = 884;
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
	 * Get method for struct member 'gizmo_hi'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gizmo Colors. </p>
	 * @see #__DNA__FIELD__gizmo_hi
	 */
	
	public CArrayFacade<Byte> getGizmo_hi() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 888, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 888, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gizmo_hi'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gizmo Colors. </p>
	 * @see #__DNA__FIELD__gizmo_hi
	 */
	
	public void setGizmo_hi(CArrayFacade<Byte> gizmo_hi) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 888;
		} else {
			__dna__offset = 888;
		}
		if (__io__equals(gizmo_hi, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gizmo_hi)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gizmo_hi);
		} else {
			__io__generic__copy( getGizmo_hi(), gizmo_hi);
		}
	}

	/**
	 * Get method for struct member 'gizmo_primary'.
	 * @see #__DNA__FIELD__gizmo_primary
	 */
	
	public CArrayFacade<Byte> getGizmo_primary() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 892, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 892, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gizmo_primary'.
	 * @see #__DNA__FIELD__gizmo_primary
	 */
	
	public void setGizmo_primary(CArrayFacade<Byte> gizmo_primary) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 892;
		} else {
			__dna__offset = 892;
		}
		if (__io__equals(gizmo_primary, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gizmo_primary)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gizmo_primary);
		} else {
			__io__generic__copy( getGizmo_primary(), gizmo_primary);
		}
	}

	/**
	 * Get method for struct member 'gizmo_secondary'.
	 * @see #__DNA__FIELD__gizmo_secondary
	 */
	
	public CArrayFacade<Byte> getGizmo_secondary() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 896, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 896, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gizmo_secondary'.
	 * @see #__DNA__FIELD__gizmo_secondary
	 */
	
	public void setGizmo_secondary(CArrayFacade<Byte> gizmo_secondary) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 896;
		} else {
			__dna__offset = 896;
		}
		if (__io__equals(gizmo_secondary, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gizmo_secondary)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gizmo_secondary);
		} else {
			__io__generic__copy( getGizmo_secondary(), gizmo_secondary);
		}
	}

	/**
	 * Get method for struct member 'gizmo_a'.
	 * @see #__DNA__FIELD__gizmo_a
	 */
	
	public CArrayFacade<Byte> getGizmo_a() throws IOException
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
	 * Set method for struct member 'gizmo_a'.
	 * @see #__DNA__FIELD__gizmo_a
	 */
	
	public void setGizmo_a(CArrayFacade<Byte> gizmo_a) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 900;
		} else {
			__dna__offset = 900;
		}
		if (__io__equals(gizmo_a, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gizmo_a)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gizmo_a);
		} else {
			__io__generic__copy( getGizmo_a(), gizmo_a);
		}
	}

	/**
	 * Get method for struct member 'gizmo_b'.
	 * @see #__DNA__FIELD__gizmo_b
	 */
	
	public CArrayFacade<Byte> getGizmo_b() throws IOException
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
	 * Set method for struct member 'gizmo_b'.
	 * @see #__DNA__FIELD__gizmo_b
	 */
	
	public void setGizmo_b(CArrayFacade<Byte> gizmo_b) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 904;
		} else {
			__dna__offset = 904;
		}
		if (__io__equals(gizmo_b, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gizmo_b)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gizmo_b);
		} else {
			__io__generic__copy( getGizmo_b(), gizmo_b);
		}
	}

	/**
	 * Get method for struct member 'icon_scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Icon Colors. {@link Scene}  items. </p>
	 * @see #__DNA__FIELD__icon_scene
	 */
	
	public CArrayFacade<Byte> getIcon_scene() throws IOException
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
	 * Set method for struct member 'icon_scene'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Icon Colors. {@link Scene}  items. </p>
	 * @see #__DNA__FIELD__icon_scene
	 */
	
	public void setIcon_scene(CArrayFacade<Byte> icon_scene) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 908;
		} else {
			__dna__offset = 908;
		}
		if (__io__equals(icon_scene, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, icon_scene)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, icon_scene);
		} else {
			__io__generic__copy( getIcon_scene(), icon_scene);
		}
	}

	/**
	 * Get method for struct member 'icon_collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Collection}  items. </p>
	 * @see #__DNA__FIELD__icon_collection
	 */
	
	public CArrayFacade<Byte> getIcon_collection() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 912, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 912, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'icon_collection'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Collection}  items. </p>
	 * @see #__DNA__FIELD__icon_collection
	 */
	
	public void setIcon_collection(CArrayFacade<Byte> icon_collection) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 912;
		} else {
			__dna__offset = 912;
		}
		if (__io__equals(icon_collection, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, icon_collection)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, icon_collection);
		} else {
			__io__generic__copy( getIcon_collection(), icon_collection);
		}
	}

	/**
	 * Get method for struct member 'icon_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  items. </p>
	 * @see #__DNA__FIELD__icon_object
	 */
	
	public CArrayFacade<Byte> getIcon_object() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 916, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 916, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'icon_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  items. </p>
	 * @see #__DNA__FIELD__icon_object
	 */
	
	public void setIcon_object(CArrayFacade<Byte> icon_object) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 916;
		} else {
			__dna__offset = 916;
		}
		if (__io__equals(icon_object, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, icon_object)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, icon_object);
		} else {
			__io__generic__copy( getIcon_object(), icon_object);
		}
	}

	/**
	 * Get method for struct member 'icon_object_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  data items. </p>
	 * @see #__DNA__FIELD__icon_object_data
	 */
	
	public CArrayFacade<Byte> getIcon_object_data() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 920, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 920, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'icon_object_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Object}  data items. </p>
	 * @see #__DNA__FIELD__icon_object_data
	 */
	
	public void setIcon_object_data(CArrayFacade<Byte> icon_object_data) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 920;
		} else {
			__dna__offset = 920;
		}
		if (__io__equals(icon_object_data, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, icon_object_data)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, icon_object_data);
		} else {
			__io__generic__copy( getIcon_object_data(), icon_object_data);
		}
	}

	/**
	 * Get method for struct member 'icon_modifier'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Modifier and constraint items. </p>
	 * @see #__DNA__FIELD__icon_modifier
	 */
	
	public CArrayFacade<Byte> getIcon_modifier() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 924, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 924, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'icon_modifier'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Modifier and constraint items. </p>
	 * @see #__DNA__FIELD__icon_modifier
	 */
	
	public void setIcon_modifier(CArrayFacade<Byte> icon_modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 924;
		} else {
			__dna__offset = 924;
		}
		if (__io__equals(icon_modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, icon_modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, icon_modifier);
		} else {
			__io__generic__copy( getIcon_modifier(), icon_modifier);
		}
	}

	/**
	 * Get method for struct member 'icon_shading'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shading related items. </p>
	 * @see #__DNA__FIELD__icon_shading
	 */
	
	public CArrayFacade<Byte> getIcon_shading() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 928, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 928, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'icon_shading'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Shading related items. </p>
	 * @see #__DNA__FIELD__icon_shading
	 */
	
	public void setIcon_shading(CArrayFacade<Byte> icon_shading) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 928;
		} else {
			__dna__offset = 928;
		}
		if (__io__equals(icon_shading, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, icon_shading)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, icon_shading);
		} else {
			__io__generic__copy( getIcon_shading(), icon_shading);
		}
	}

	/**
	 * Get method for struct member 'icon_border_intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Intensity of the border icons. >0 will render an border around themed icons. </p>
	 * @see #__DNA__FIELD__icon_border_intensity
	 */
	
	public float getIcon_border_intensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 932);
		} else {
			return __io__block.readFloat(__io__address + 932);
		}
	}

	/**
	 * Set method for struct member 'icon_border_intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Intensity of the border icons. >0 will render an border around themed icons. </p>
	 * @see #__DNA__FIELD__icon_border_intensity
	 */
	
	public void setIcon_border_intensity(float icon_border_intensity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 932, icon_border_intensity);
		} else {
			__io__block.writeFloat(__io__address + 932, icon_border_intensity);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ThemeUI> __io__addressof() {
		return new CPointer<ThemeUI>(__io__address, new Class[]{ThemeUI.class}, __io__block, __io__blockTable);
	}

}
