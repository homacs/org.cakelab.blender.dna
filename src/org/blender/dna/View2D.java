package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'View2D'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  View 2D data - stored per region </p>
 */

@CMetaData(size32=148, size64=160)
public class View2D extends CFacade {

	/**
	 * This is the sdna index of the struct View2D.
	 * <p>
	 * It is required when allocating a new block to store data for View2D.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 204;

	/**
	 * Field descriptor (offset) for struct member 'tot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__tot);
	 * CPointer&lt;rctf&gt; p_tot = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> tot - area that data can be drawn in; cur - region of tot that is visible in viewport </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__cur);
	 * CPointer&lt;rctf&gt; p_cur = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cur'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cur = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'vert'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__vert);
	 * CPointer&lt;rcti&gt; p_vert = p.cast(new Class[]{rcti.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vert'</li>
	 * <li>Signature: 'rcti'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vert = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'hor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vert - vertical scrollbar region; hor - horizontal scrollbar region </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__hor);
	 * CPointer&lt;rcti&gt; p_hor = p.cast(new Class[]{rcti.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hor'</li>
	 * <li>Signature: 'rcti'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hor = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> mask - region (in screenspace) within which 'cur' can be viewed </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__mask);
	 * CPointer&lt;rcti&gt; p_mask = p.cast(new Class[]{rcti.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask'</li>
	 * <li>Signature: 'rcti'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'min'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__min);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_min = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> min/max sizes of 'cur' rect (only when keepzoom not set) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__max);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_max = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max = new long[]{88, 88};

	/**
	 * Field descriptor (offset) for struct member 'minzoom'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__minzoom);
	 * CPointer&lt;Float&gt; p_minzoom = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minzoom'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minzoom = new long[]{96, 96};

	/**
	 * Field descriptor (offset) for struct member 'maxzoom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> allowable zoom factor range (only when (keepzoom & V2D_LIMITZOOM)) is set </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__maxzoom);
	 * CPointer&lt;Float&gt; p_maxzoom = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxzoom'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxzoom = new long[]{100, 100};

	/**
	 * Field descriptor (offset) for struct member 'scroll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scroll - scrollbars to display (bitflag) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__scroll);
	 * CPointer&lt;Short&gt; p_scroll = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scroll'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scroll = new long[]{104, 104};

	/**
	 * Field descriptor (offset) for struct member 'scroll_ui'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scroll_ui - temp settings used for UI drawing of scrollers </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__scroll_ui);
	 * CPointer&lt;Short&gt; p_scroll_ui = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scroll_ui'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scroll_ui = new long[]{106, 106};

	/**
	 * Field descriptor (offset) for struct member 'keeptot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keeptot - 'cur' rect cannot move outside the 'tot' rect? </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__keeptot);
	 * CPointer&lt;Short&gt; p_keeptot = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keeptot'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keeptot = new long[]{108, 108};

	/**
	 * Field descriptor (offset) for struct member 'keepzoom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keepzoom - axes that zooming cannot occur on, and also clamp within zoom-limits </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__keepzoom);
	 * CPointer&lt;Short&gt; p_keepzoom = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keepzoom'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keepzoom = new long[]{110, 110};

	/**
	 * Field descriptor (offset) for struct member 'keepofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keepofs - axes that translation is not allowed to occur on </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__keepofs);
	 * CPointer&lt;Short&gt; p_keepofs = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keepofs'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keepofs = new long[]{112, 112};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{114, 114};

	/**
	 * Field descriptor (offset) for struct member 'align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> alignment of content in totrect </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__align);
	 * CPointer&lt;Short&gt; p_align = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'align'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__align = new long[]{116, 116};

	/**
	 * Field descriptor (offset) for struct member 'winx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__winx);
	 * CPointer&lt;Short&gt; p_winx = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'winx'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__winx = new long[]{118, 118};

	/**
	 * Field descriptor (offset) for struct member 'winy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> storage of current winx/winy values, set in UI_view2d_size_update </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__winy);
	 * CPointer&lt;Short&gt; p_winy = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'winy'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__winy = new long[]{120, 120};

	/**
	 * Field descriptor (offset) for struct member 'oldwinx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__oldwinx);
	 * CPointer&lt;Short&gt; p_oldwinx = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'oldwinx'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__oldwinx = new long[]{122, 122};

	/**
	 * Field descriptor (offset) for struct member 'oldwiny'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> storage of previous winx/winy values encountered by UI_view2d_curRect_validate(), for keepaspect </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__oldwiny);
	 * CPointer&lt;Short&gt; p_oldwiny = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'oldwiny'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__oldwiny = new long[]{124, 124};

	/**
	 * Field descriptor (offset) for struct member 'around'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> pivot point for transforms (rotate and scale) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__around);
	 * CPointer&lt;Short&gt; p_around = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'around'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__around = new long[]{126, 126};

	/**
	 * Field descriptor (offset) for struct member 'tab_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> different offset per tab, for buttons </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__tab_offset);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_tab_offset = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tab_offset'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tab_offset = new long[]{128, 128};

	/**
	 * Field descriptor (offset) for struct member 'tab_num'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of tabs stored </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__tab_num);
	 * CPointer&lt;Integer&gt; p_tab_num = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tab_num'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tab_num = new long[]{132, 136};

	/**
	 * Field descriptor (offset) for struct member 'tab_cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current tab </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__tab_cur);
	 * CPointer&lt;Integer&gt; p_tab_cur = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tab_cur'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tab_cur = new long[]{136, 140};

	/**
	 * Field descriptor (offset) for struct member 'sms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animated smooth view </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__sms);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sms = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sms'</li>
	 * <li>Signature: 'SmoothView2DStore*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sms = new long[]{140, 144};

	/**
	 * Field descriptor (offset) for struct member 'smooth_timer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View2D view2d = ...;
	 * CPointer&lt;Object&gt; p = view2d.__dna__addressof(View2D.__DNA__FIELD__smooth_timer);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_smooth_timer = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smooth_timer'</li>
	 * <li>Signature: 'wmTimer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smooth_timer = new long[]{144, 152};

	public View2D(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected View2D(View2D that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tot'.
	 * @see #__DNA__FIELD__tot
	 */
	
	public rctf getTot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tot'.
	 * @see #__DNA__FIELD__tot
	 */
	
	public void setTot(rctf tot) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(tot, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tot)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tot);
		} else {
			__io__generic__copy( getTot(), tot);
		}
	}

	/**
	 * Get method for struct member 'cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> tot - area that data can be drawn in; cur - region of tot that is visible in viewport </p>
	 * @see #__DNA__FIELD__cur
	 */
	
	public rctf getCur() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 16, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> tot - area that data can be drawn in; cur - region of tot that is visible in viewport </p>
	 * @see #__DNA__FIELD__cur
	 */
	
	public void setCur(rctf cur) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(cur, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cur)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cur);
		} else {
			__io__generic__copy( getCur(), cur);
		}
	}

	/**
	 * Get method for struct member 'vert'.
	 * @see #__DNA__FIELD__vert
	 */
	
	public rcti getVert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rcti(__io__address + 32, __io__block, __io__blockTable);
		} else {
			return new rcti(__io__address + 32, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vert'.
	 * @see #__DNA__FIELD__vert
	 */
	
	public void setVert(rcti vert) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(vert, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vert)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vert);
		} else {
			__io__generic__copy( getVert(), vert);
		}
	}

	/**
	 * Get method for struct member 'hor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vert - vertical scrollbar region; hor - horizontal scrollbar region </p>
	 * @see #__DNA__FIELD__hor
	 */
	
	public rcti getHor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rcti(__io__address + 48, __io__block, __io__blockTable);
		} else {
			return new rcti(__io__address + 48, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'hor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> vert - vertical scrollbar region; hor - horizontal scrollbar region </p>
	 * @see #__DNA__FIELD__hor
	 */
	
	public void setHor(rcti hor) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(hor, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, hor)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, hor);
		} else {
			__io__generic__copy( getHor(), hor);
		}
	}

	/**
	 * Get method for struct member 'mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> mask - region (in screenspace) within which 'cur' can be viewed </p>
	 * @see #__DNA__FIELD__mask
	 */
	
	public rcti getMask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rcti(__io__address + 64, __io__block, __io__blockTable);
		} else {
			return new rcti(__io__address + 64, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> mask - region (in screenspace) within which 'cur' can be viewed </p>
	 * @see #__DNA__FIELD__mask
	 */
	
	public void setMask(rcti mask) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
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
	 * Get method for struct member 'min'.
	 * @see #__DNA__FIELD__min
	 */
	
	public CArrayFacade<Float> getMin() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'min'.
	 * @see #__DNA__FIELD__min
	 */
	
	public void setMin(CArrayFacade<Float> min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(min, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, min)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, min);
		} else {
			__io__generic__copy( getMin(), min);
		}
	}

	/**
	 * Get method for struct member 'max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> min/max sizes of 'cur' rect (only when keepzoom not set) </p>
	 * @see #__DNA__FIELD__max
	 */
	
	public CArrayFacade<Float> getMax() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> min/max sizes of 'cur' rect (only when keepzoom not set) </p>
	 * @see #__DNA__FIELD__max
	 */
	
	public void setMax(CArrayFacade<Float> max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 88;
		}
		if (__io__equals(max, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, max)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, max);
		} else {
			__io__generic__copy( getMax(), max);
		}
	}

	/**
	 * Get method for struct member 'minzoom'.
	 * @see #__DNA__FIELD__minzoom
	 */
	
	public float getMinzoom() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'minzoom'.
	 * @see #__DNA__FIELD__minzoom
	 */
	
	public void setMinzoom(float minzoom) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, minzoom);
		} else {
			__io__block.writeFloat(__io__address + 96, minzoom);
		}
	}

	/**
	 * Get method for struct member 'maxzoom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> allowable zoom factor range (only when (keepzoom & V2D_LIMITZOOM)) is set </p>
	 * @see #__DNA__FIELD__maxzoom
	 */
	
	public float getMaxzoom() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'maxzoom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> allowable zoom factor range (only when (keepzoom & V2D_LIMITZOOM)) is set </p>
	 * @see #__DNA__FIELD__maxzoom
	 */
	
	public void setMaxzoom(float maxzoom) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, maxzoom);
		} else {
			__io__block.writeFloat(__io__address + 100, maxzoom);
		}
	}

	/**
	 * Get method for struct member 'scroll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scroll - scrollbars to display (bitflag) </p>
	 * @see #__DNA__FIELD__scroll
	 */
	
	public short getScroll() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 104);
		} else {
			return __io__block.readShort(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'scroll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scroll - scrollbars to display (bitflag) </p>
	 * @see #__DNA__FIELD__scroll
	 */
	
	public void setScroll(short scroll) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 104, scroll);
		} else {
			__io__block.writeShort(__io__address + 104, scroll);
		}
	}

	/**
	 * Get method for struct member 'scroll_ui'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scroll_ui - temp settings used for UI drawing of scrollers </p>
	 * @see #__DNA__FIELD__scroll_ui
	 */
	
	public short getScroll_ui() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 106);
		} else {
			return __io__block.readShort(__io__address + 106);
		}
	}

	/**
	 * Set method for struct member 'scroll_ui'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scroll_ui - temp settings used for UI drawing of scrollers </p>
	 * @see #__DNA__FIELD__scroll_ui
	 */
	
	public void setScroll_ui(short scroll_ui) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 106, scroll_ui);
		} else {
			__io__block.writeShort(__io__address + 106, scroll_ui);
		}
	}

	/**
	 * Get method for struct member 'keeptot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keeptot - 'cur' rect cannot move outside the 'tot' rect? </p>
	 * @see #__DNA__FIELD__keeptot
	 */
	
	public short getKeeptot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 108);
		} else {
			return __io__block.readShort(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'keeptot'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keeptot - 'cur' rect cannot move outside the 'tot' rect? </p>
	 * @see #__DNA__FIELD__keeptot
	 */
	
	public void setKeeptot(short keeptot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 108, keeptot);
		} else {
			__io__block.writeShort(__io__address + 108, keeptot);
		}
	}

	/**
	 * Get method for struct member 'keepzoom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keepzoom - axes that zooming cannot occur on, and also clamp within zoom-limits </p>
	 * @see #__DNA__FIELD__keepzoom
	 */
	
	public short getKeepzoom() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 110);
		} else {
			return __io__block.readShort(__io__address + 110);
		}
	}

	/**
	 * Set method for struct member 'keepzoom'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keepzoom - axes that zooming cannot occur on, and also clamp within zoom-limits </p>
	 * @see #__DNA__FIELD__keepzoom
	 */
	
	public void setKeepzoom(short keepzoom) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 110, keepzoom);
		} else {
			__io__block.writeShort(__io__address + 110, keepzoom);
		}
	}

	/**
	 * Get method for struct member 'keepofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keepofs - axes that translation is not allowed to occur on </p>
	 * @see #__DNA__FIELD__keepofs
	 */
	
	public short getKeepofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 112);
		} else {
			return __io__block.readShort(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'keepofs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keepofs - axes that translation is not allowed to occur on </p>
	 * @see #__DNA__FIELD__keepofs
	 */
	
	public void setKeepofs(short keepofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 112, keepofs);
		} else {
			__io__block.writeShort(__io__address + 112, keepofs);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 114);
		} else {
			return __io__block.readShort(__io__address + 114);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 114, flag);
		} else {
			__io__block.writeShort(__io__address + 114, flag);
		}
	}

	/**
	 * Get method for struct member 'align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> alignment of content in totrect </p>
	 * @see #__DNA__FIELD__align
	 */
	
	public short getAlign() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 116);
		} else {
			return __io__block.readShort(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'align'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> alignment of content in totrect </p>
	 * @see #__DNA__FIELD__align
	 */
	
	public void setAlign(short align) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 116, align);
		} else {
			__io__block.writeShort(__io__address + 116, align);
		}
	}

	/**
	 * Get method for struct member 'winx'.
	 * @see #__DNA__FIELD__winx
	 */
	
	public short getWinx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 118);
		} else {
			return __io__block.readShort(__io__address + 118);
		}
	}

	/**
	 * Set method for struct member 'winx'.
	 * @see #__DNA__FIELD__winx
	 */
	
	public void setWinx(short winx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 118, winx);
		} else {
			__io__block.writeShort(__io__address + 118, winx);
		}
	}

	/**
	 * Get method for struct member 'winy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> storage of current winx/winy values, set in UI_view2d_size_update </p>
	 * @see #__DNA__FIELD__winy
	 */
	
	public short getWiny() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 120);
		} else {
			return __io__block.readShort(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'winy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> storage of current winx/winy values, set in UI_view2d_size_update </p>
	 * @see #__DNA__FIELD__winy
	 */
	
	public void setWiny(short winy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 120, winy);
		} else {
			__io__block.writeShort(__io__address + 120, winy);
		}
	}

	/**
	 * Get method for struct member 'oldwinx'.
	 * @see #__DNA__FIELD__oldwinx
	 */
	
	public short getOldwinx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 122);
		} else {
			return __io__block.readShort(__io__address + 122);
		}
	}

	/**
	 * Set method for struct member 'oldwinx'.
	 * @see #__DNA__FIELD__oldwinx
	 */
	
	public void setOldwinx(short oldwinx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 122, oldwinx);
		} else {
			__io__block.writeShort(__io__address + 122, oldwinx);
		}
	}

	/**
	 * Get method for struct member 'oldwiny'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> storage of previous winx/winy values encountered by UI_view2d_curRect_validate(), for keepaspect </p>
	 * @see #__DNA__FIELD__oldwiny
	 */
	
	public short getOldwiny() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 124);
		} else {
			return __io__block.readShort(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'oldwiny'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> storage of previous winx/winy values encountered by UI_view2d_curRect_validate(), for keepaspect </p>
	 * @see #__DNA__FIELD__oldwiny
	 */
	
	public void setOldwiny(short oldwiny) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 124, oldwiny);
		} else {
			__io__block.writeShort(__io__address + 124, oldwiny);
		}
	}

	/**
	 * Get method for struct member 'around'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> pivot point for transforms (rotate and scale) </p>
	 * @see #__DNA__FIELD__around
	 */
	
	public short getAround() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 126);
		} else {
			return __io__block.readShort(__io__address + 126);
		}
	}

	/**
	 * Set method for struct member 'around'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> pivot point for transforms (rotate and scale) </p>
	 * @see #__DNA__FIELD__around
	 */
	
	public void setAround(short around) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 126, around);
		} else {
			__io__block.writeShort(__io__address + 126, around);
		}
	}

	/**
	 * Get method for struct member 'tab_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> different offset per tab, for buttons </p>
	 * @see #__DNA__FIELD__tab_offset
	 */
	
	public CPointer<Float> getTab_offset() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tab_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> different offset per tab, for buttons </p>
	 * @see #__DNA__FIELD__tab_offset
	 */
	
	public void setTab_offset(CPointer<Float> tab_offset) throws IOException
	{
		long __address = ((tab_offset == null) ? 0 : tab_offset.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 128, __address);
		}
	}

	/**
	 * Get method for struct member 'tab_num'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of tabs stored </p>
	 * @see #__DNA__FIELD__tab_num
	 */
	
	public int getTab_num() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'tab_num'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of tabs stored </p>
	 * @see #__DNA__FIELD__tab_num
	 */
	
	public void setTab_num(int tab_num) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, tab_num);
		} else {
			__io__block.writeInt(__io__address + 132, tab_num);
		}
	}

	/**
	 * Get method for struct member 'tab_cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current tab </p>
	 * @see #__DNA__FIELD__tab_cur
	 */
	
	public int getTab_cur() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 140);
		} else {
			return __io__block.readInt(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'tab_cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current tab </p>
	 * @see #__DNA__FIELD__tab_cur
	 */
	
	public void setTab_cur(int tab_cur) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 140, tab_cur);
		} else {
			__io__block.writeInt(__io__address + 136, tab_cur);
		}
	}

	/**
	 * Get method for struct member 'sms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animated smooth view </p>
	 * @see #__DNA__FIELD__sms
	 */
	
	public CPointer<Object> getSms() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 140);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animated smooth view </p>
	 * @see #__DNA__FIELD__sms
	 */
	
	public void setSms(CPointer<Object> sms) throws IOException
	{
		long __address = ((sms == null) ? 0 : sms.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 140, __address);
		}
	}

	/**
	 * Get method for struct member 'smooth_timer'.
	 * @see #__DNA__FIELD__smooth_timer
	 */
	
	public CPointer<Object> getSmooth_timer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'smooth_timer'.
	 * @see #__DNA__FIELD__smooth_timer
	 */
	
	public void setSmooth_timer(CPointer<Object> smooth_timer) throws IOException
	{
		long __address = ((smooth_timer == null) ? 0 : smooth_timer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 144, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<View2D> __io__addressof() {
		return new CPointer<View2D>(__io__address, new Class[]{View2D.class}, __io__block, __io__blockTable);
	}

}
