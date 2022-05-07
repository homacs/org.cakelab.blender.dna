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
 * Generated facet for DNA struct type 'UserDef'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=13208, size64=13280)
public class UserDef extends CFacade {

	/**
	 * This is the sdna index of the struct UserDef.
	 * <p>
	 * It is required when allocating a new block to store data for UserDef.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 293;

	/**
	 * Field descriptor (offset) for struct member 'versionfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link UserDef}  has separate do-version handling, and can be read from other files. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__versionfile);
	 * CPointer&lt;Integer&gt; p_versionfile = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'versionfile'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__versionfile = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'subversionfile'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__subversionfile);
	 * CPointer&lt;Integer&gt; p_subversionfile = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subversionfile'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subversionfile = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eUserPref_Flag . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'dupflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eDupli_ID_Flags . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__dupflag);
	 * CPointer&lt;Integer&gt; p_dupflag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dupflag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dupflag = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'pref_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> #eUserPref_PrefFlag preferences for the preferences. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__pref_flag);
	 * CPointer&lt;Byte&gt; p_pref_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pref_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pref_flag = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'savetime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__savetime);
	 * CPointer&lt;Byte&gt; p_savetime = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'savetime'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__savetime = new long[]{17, 17};

	/**
	 * Field descriptor (offset) for struct member 'mouse_emulate_3_button_modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__mouse_emulate_3_button_modifier);
	 * CPointer&lt;Byte&gt; p_mouse_emulate_3_button_modifier = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mouse_emulate_3_button_modifier'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mouse_emulate_3_button_modifier = new long[]{18, 18};

	/**
	 * Field descriptor (offset) for struct member '_pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD___pad4);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad4 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad4'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad4 = new long[]{19, 19};

	/**
	 * Field descriptor (offset) for struct member 'tempdir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAXDIR length. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__tempdir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_tempdir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tempdir'</li>
	 * <li>Signature: 'char[768]'</li>
	 * <li>Actual Size (32bit/64bit): 768/768</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tempdir = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'fontdir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__fontdir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_fontdir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fontdir'</li>
	 * <li>Signature: 'char[768]'</li>
	 * <li>Actual Size (32bit/64bit): 768/768</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fontdir = new long[]{788, 788};

	/**
	 * Field descriptor (offset) for struct member 'renderdir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX length. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__renderdir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_renderdir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'renderdir'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__renderdir = new long[]{1556, 1556};

	/**
	 * Field descriptor (offset) for struct member 'render_cachedir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> EXR cache path 768 = FILE_MAXDIR. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__render_cachedir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_render_cachedir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_cachedir'</li>
	 * <li>Signature: 'char[768]'</li>
	 * <li>Actual Size (32bit/64bit): 768/768</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_cachedir = new long[]{2580, 2580};

	/**
	 * Field descriptor (offset) for struct member 'textudir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__textudir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_textudir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'textudir'</li>
	 * <li>Signature: 'char[768]'</li>
	 * <li>Actual Size (32bit/64bit): 768/768</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__textudir = new long[]{3348, 3348};

	/**
	 * Field descriptor (offset) for struct member 'pythondir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional user location for scripts.</p><p><code></code> .</p><p><h2>Note</h2><p><code></code><code></code><code></code><em></em>  have been in gets complicated.</p><code></code>  is refreshed when loading preferences. This is done to support #PREFERENCES_OT_copy_prev which is available to the user when they launch with a new version of Blender. In this case setting the script path on top of factory settings will work without problems. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__pythondir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pythondir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pythondir'</li>
	 * <li>Signature: 'char[768]'</li>
	 * <li>Actual Size (32bit/64bit): 768/768</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pythondir = new long[]{4116, 4116};

	/**
	 * Field descriptor (offset) for struct member 'sounddir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__sounddir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_sounddir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sounddir'</li>
	 * <li>Signature: 'char[768]'</li>
	 * <li>Actual Size (32bit/64bit): 768/768</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sounddir = new long[]{4884, 4884};

	/**
	 * Field descriptor (offset) for struct member 'i18ndir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__i18ndir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_i18ndir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'i18ndir'</li>
	 * <li>Signature: 'char[768]'</li>
	 * <li>Actual Size (32bit/64bit): 768/768</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__i18ndir = new long[]{5652, 5652};

	/**
	 * Field descriptor (offset) for struct member 'image_editor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__image_editor);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_image_editor = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image_editor'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image_editor = new long[]{6420, 6420};

	/**
	 * Field descriptor (offset) for struct member 'anim_player'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__anim_player);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_anim_player = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anim_player'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anim_player = new long[]{7444, 7444};

	/**
	 * Field descriptor (offset) for struct member 'anim_player_preset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__anim_player_preset);
	 * CPointer&lt;Integer&gt; p_anim_player_preset = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anim_player_preset'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anim_player_preset = new long[]{8468, 8468};

	/**
	 * Field descriptor (offset) for struct member 'v2d_min_gridsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimum spacing between grid-lines in {@link View2D}  grids. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__v2d_min_gridsize);
	 * CPointer&lt;Short&gt; p_v2d_min_gridsize = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v2d_min_gridsize'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v2d_min_gridsize = new long[]{8472, 8472};

	/**
	 * Field descriptor (offset) for struct member 'timecode_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eTimecodeStyles , style of time-code display. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__timecode_style);
	 * CPointer&lt;Short&gt; p_timecode_style = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'timecode_style'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__timecode_style = new long[]{8474, 8474};

	/**
	 * Field descriptor (offset) for struct member 'versions'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__versions);
	 * CPointer&lt;Short&gt; p_versions = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'versions'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__versions = new long[]{8476, 8476};

	/**
	 * Field descriptor (offset) for struct member 'dbl_click_time'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__dbl_click_time);
	 * CPointer&lt;Short&gt; p_dbl_click_time = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dbl_click_time'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dbl_click_time = new long[]{8478, 8478};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{8480, 8480};

	/**
	 * Field descriptor (offset) for struct member 'mini_axis_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__mini_axis_type);
	 * CPointer&lt;Byte&gt; p_mini_axis_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mini_axis_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mini_axis_type = new long[]{8483, 8483};

	/**
	 * Field descriptor (offset) for struct member 'uiflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eUserpref_UI_Flag . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__uiflag);
	 * CPointer&lt;Integer&gt; p_uiflag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uiflag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uiflag = new long[]{8484, 8484};

	/**
	 * Field descriptor (offset) for struct member 'uiflag2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eUserpref_UI_Flag2 . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__uiflag2);
	 * CPointer&lt;Byte&gt; p_uiflag2 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uiflag2'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uiflag2 = new long[]{8488, 8488};

	/**
	 * Field descriptor (offset) for struct member 'gpu_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__gpu_flag);
	 * CPointer&lt;Byte&gt; p_gpu_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpu_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpu_flag = new long[]{8489, 8489};

	/**
	 * Field descriptor (offset) for struct member '_pad8'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD___pad8);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad8 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad8'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad8 = new long[]{8490, 8490};

	/**
	 * Field descriptor (offset) for struct member 'app_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Experimental flag for app-templates to make changes to behavior which are outside the scope of typical preferences. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__app_flag);
	 * CPointer&lt;Byte&gt; p_app_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'app_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__app_flag = new long[]{8496, 8496};

	/**
	 * Field descriptor (offset) for struct member 'viewzoom'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__viewzoom);
	 * CPointer&lt;Byte&gt; p_viewzoom = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewzoom'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewzoom = new long[]{8497, 8497};

	/**
	 * Field descriptor (offset) for struct member 'language'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__language);
	 * CPointer&lt;Short&gt; p_language = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'language'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__language = new long[]{8498, 8498};

	/**
	 * Field descriptor (offset) for struct member 'mixbufsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__mixbufsize);
	 * CPointer&lt;Integer&gt; p_mixbufsize = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mixbufsize'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mixbufsize = new long[]{8500, 8500};

	/**
	 * Field descriptor (offset) for struct member 'audiodevice'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__audiodevice);
	 * CPointer&lt;Integer&gt; p_audiodevice = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audiodevice'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audiodevice = new long[]{8504, 8504};

	/**
	 * Field descriptor (offset) for struct member 'audiorate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__audiorate);
	 * CPointer&lt;Integer&gt; p_audiorate = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audiorate'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audiorate = new long[]{8508, 8508};

	/**
	 * Field descriptor (offset) for struct member 'audioformat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__audioformat);
	 * CPointer&lt;Integer&gt; p_audioformat = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audioformat'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audioformat = new long[]{8512, 8512};

	/**
	 * Field descriptor (offset) for struct member 'audiochannels'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__audiochannels);
	 * CPointer&lt;Integer&gt; p_audiochannels = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audiochannels'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audiochannels = new long[]{8516, 8516};

	/**
	 * Field descriptor (offset) for struct member 'ui_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Setting for UI scale (fractional), before screen DPI has been applied. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__ui_scale);
	 * CPointer&lt;Float&gt; p_ui_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ui_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ui_scale = new long[]{8520, 8520};

	/**
	 * Field descriptor (offset) for struct member 'ui_line_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Setting for UI line width. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__ui_line_width);
	 * CPointer&lt;Integer&gt; p_ui_line_width = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ui_line_width'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ui_line_width = new long[]{8524, 8524};

	/**
	 * Field descriptor (offset) for struct member 'dpi'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__dpi);
	 * CPointer&lt;Integer&gt; p_dpi = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dpi'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dpi = new long[]{8528, 8528};

	/**
	 * Field descriptor (offset) for struct member 'dpi_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime, multiplier to scale UI elements based on DPI (fractional). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__dpi_fac);
	 * CPointer&lt;Float&gt; p_dpi_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dpi_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dpi_fac = new long[]{8532, 8532};

	/**
	 * Field descriptor (offset) for struct member 'inv_dpi_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__inv_dpi_fac);
	 * CPointer&lt;Float&gt; p_inv_dpi_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inv_dpi_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inv_dpi_fac = new long[]{8536, 8536};

	/**
	 * Field descriptor (offset) for struct member 'pixelsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime, calculated from line-width and point-size based on DPI (rounded to int). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__pixelsize);
	 * CPointer&lt;Float&gt; p_pixelsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pixelsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pixelsize = new long[]{8540, 8540};

	/**
	 * Field descriptor (offset) for struct member 'virtual_pixel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated, for forward compatibility. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__virtual_pixel);
	 * CPointer&lt;Integer&gt; p_virtual_pixel = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'virtual_pixel'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__virtual_pixel = new long[]{8544, 8544};

	/**
	 * Field descriptor (offset) for struct member 'scrollback'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Console scroll-back limit. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__scrollback);
	 * CPointer&lt;Integer&gt; p_scrollback = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scrollback'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scrollback = new long[]{8548, 8548};

	/**
	 * Field descriptor (offset) for struct member 'node_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Node insert offset (aka auto-offset) margin, but might be useful for later stuff as well. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__node_margin);
	 * CPointer&lt;Byte&gt; p_node_margin = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'node_margin'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__node_margin = new long[]{8552, 8552};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{8553, 8553};

	/**
	 * Field descriptor (offset) for struct member 'transopts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eUserpref_Translation_Flags . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__transopts);
	 * CPointer&lt;Short&gt; p_transopts = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transopts'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transopts = new long[]{8554, 8554};

	/**
	 * Field descriptor (offset) for struct member 'menuthreshold1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__menuthreshold1);
	 * CPointer&lt;Short&gt; p_menuthreshold1 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'menuthreshold1'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__menuthreshold1 = new long[]{8556, 8556};

	/**
	 * Field descriptor (offset) for struct member 'menuthreshold2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__menuthreshold2);
	 * CPointer&lt;Short&gt; p_menuthreshold2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'menuthreshold2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__menuthreshold2 = new long[]{8558, 8558};

	/**
	 * Field descriptor (offset) for struct member 'app_template'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Startup application template. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__app_template);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_app_template = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'app_template'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__app_template = new long[]{8560, 8560};

	/**
	 * Field descriptor (offset) for struct member 'themes'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__themes);
	 * CPointer&lt;ListBase&gt; p_themes = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'themes'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__themes = new long[]{8624, 8624};

	/**
	 * Field descriptor (offset) for struct member 'uifonts'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__uifonts);
	 * CPointer&lt;ListBase&gt; p_uifonts = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uifonts'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uifonts = new long[]{8632, 8640};

	/**
	 * Field descriptor (offset) for struct member 'uistyles'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__uistyles);
	 * CPointer&lt;ListBase&gt; p_uistyles = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uistyles'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uistyles = new long[]{8640, 8656};

	/**
	 * Field descriptor (offset) for struct member 'user_keymaps'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__user_keymaps);
	 * CPointer&lt;ListBase&gt; p_user_keymaps = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'user_keymaps'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__user_keymaps = new long[]{8648, 8672};

	/**
	 * Field descriptor (offset) for struct member 'user_keyconfig_prefs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link wmKeyConfigPref} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__user_keyconfig_prefs);
	 * CPointer&lt;ListBase&gt; p_user_keyconfig_prefs = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'user_keyconfig_prefs'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__user_keyconfig_prefs = new long[]{8656, 8688};

	/**
	 * Field descriptor (offset) for struct member 'addons'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__addons);
	 * CPointer&lt;ListBase&gt; p_addons = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'addons'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__addons = new long[]{8664, 8704};

	/**
	 * Field descriptor (offset) for struct member 'autoexec_paths'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__autoexec_paths);
	 * CPointer&lt;ListBase&gt; p_autoexec_paths = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'autoexec_paths'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__autoexec_paths = new long[]{8672, 8720};

	/**
	 * Field descriptor (offset) for struct member 'user_menus'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link bUserMenu} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__user_menus);
	 * CPointer&lt;ListBase&gt; p_user_menus = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'user_menus'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__user_menus = new long[]{8680, 8736};

	/**
	 * Field descriptor (offset) for struct member 'asset_libraries'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link bUserAssetLibrary}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__asset_libraries);
	 * CPointer&lt;ListBase&gt; p_asset_libraries = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'asset_libraries'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__asset_libraries = new long[]{8688, 8752};

	/**
	 * Field descriptor (offset) for struct member 'keyconfigstr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__keyconfigstr);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_keyconfigstr = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyconfigstr'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyconfigstr = new long[]{8696, 8768};

	/**
	 * Field descriptor (offset) for struct member 'undosteps'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__undosteps);
	 * CPointer&lt;Short&gt; p_undosteps = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'undosteps'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__undosteps = new long[]{8760, 8832};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{8762, 8834};

	/**
	 * Field descriptor (offset) for struct member 'undomemory'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__undomemory);
	 * CPointer&lt;Integer&gt; p_undomemory = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'undomemory'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__undomemory = new long[]{8764, 8836};

	/**
	 * Field descriptor (offset) for struct member 'gpu_viewport_quality'.
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
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__gpu_viewport_quality);
	 * CPointer&lt;Float&gt; p_gpu_viewport_quality = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpu_viewport_quality'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpu_viewport_quality = new long[]{8768, 8840};

	/**
	 * Field descriptor (offset) for struct member 'gp_manhattendist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__gp_manhattendist);
	 * CPointer&lt;Short&gt; p_gp_manhattendist = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_manhattendist'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_manhattendist = new long[]{8772, 8844};

	/**
	 * Field descriptor (offset) for struct member 'gp_euclideandist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__gp_euclideandist);
	 * CPointer&lt;Short&gt; p_gp_euclideandist = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_euclideandist'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_euclideandist = new long[]{8774, 8846};

	/**
	 * Field descriptor (offset) for struct member 'gp_eraser'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__gp_eraser);
	 * CPointer&lt;Short&gt; p_gp_eraser = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_eraser'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_eraser = new long[]{8776, 8848};

	/**
	 * Field descriptor (offset) for struct member 'gp_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eGP_UserdefSettings . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__gp_settings);
	 * CPointer&lt;Short&gt; p_gp_settings = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gp_settings'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gp_settings = new long[]{8778, 8850};

	/**
	 * Field descriptor (offset) for struct member '_pad13'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD___pad13);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad13 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad13'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad13 = new long[]{8780, 8852};

	/**
	 * Field descriptor (offset) for struct member 'light_param'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__light_param);
	 * CPointer&lt;CArrayFacade&lt;SolidLight&gt;&gt; p_light_param = p.cast(new Class[]{CArrayFacade.class, SolidLight.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'light_param'</li>
	 * <li>Signature: 'SolidLight[4]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__light_param = new long[]{8784, 8856};

	/**
	 * Field descriptor (offset) for struct member 'light_ambient'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__light_ambient);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_light_ambient = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'light_ambient'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__light_ambient = new long[]{9040, 9112};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__gizmo_flag);
	 * CPointer&lt;Byte&gt; p_gizmo_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_flag = new long[]{9052, 9124};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Generic gizmo size. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__gizmo_size);
	 * CPointer&lt;Byte&gt; p_gizmo_size = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_size'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_size = new long[]{9053, 9125};

	/**
	 * Field descriptor (offset) for struct member 'gizmo_size_navigate_v3d'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Navigate gizmo size. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__gizmo_size_navigate_v3d);
	 * CPointer&lt;Byte&gt; p_gizmo_size_navigate_v3d = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gizmo_size_navigate_v3d'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gizmo_size_navigate_v3d = new long[]{9054, 9126};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[5]'</li>
	 * <li>Actual Size (32bit/64bit): 5/5</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{9055, 9127};

	/**
	 * Field descriptor (offset) for struct member 'edit_studio_light'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__edit_studio_light);
	 * CPointer&lt;Short&gt; p_edit_studio_light = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edit_studio_light'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edit_studio_light = new long[]{9060, 9132};

	/**
	 * Field descriptor (offset) for struct member 'lookdev_sphere_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__lookdev_sphere_size);
	 * CPointer&lt;Short&gt; p_lookdev_sphere_size = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lookdev_sphere_size'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lookdev_sphere_size = new long[]{9062, 9134};

	/**
	 * Field descriptor (offset) for struct member 'vbotimeout'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__vbotimeout);
	 * CPointer&lt;Short&gt; p_vbotimeout = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vbotimeout'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vbotimeout = new long[]{9064, 9136};

	/**
	 * Field descriptor (offset) for struct member 'vbocollectrate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__vbocollectrate);
	 * CPointer&lt;Short&gt; p_vbocollectrate = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vbocollectrate'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vbocollectrate = new long[]{9066, 9138};

	/**
	 * Field descriptor (offset) for struct member 'textimeout'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__textimeout);
	 * CPointer&lt;Short&gt; p_textimeout = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'textimeout'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__textimeout = new long[]{9068, 9140};

	/**
	 * Field descriptor (offset) for struct member 'texcollectrate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__texcollectrate);
	 * CPointer&lt;Short&gt; p_texcollectrate = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texcollectrate'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texcollectrate = new long[]{9070, 9142};

	/**
	 * Field descriptor (offset) for struct member 'memcachelimit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__memcachelimit);
	 * CPointer&lt;Integer&gt; p_memcachelimit = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'memcachelimit'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__memcachelimit = new long[]{9072, 9144};

	/**
	 * Field descriptor (offset) for struct member 'prefetchframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__prefetchframes);
	 * CPointer&lt;Integer&gt; p_prefetchframes = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prefetchframes'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prefetchframes = new long[]{9076, 9148};

	/**
	 * Field descriptor (offset) for struct member 'pad_rot_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Control the rotation step of the view when PAD2, PAD4, PAD6&PAD8 is use. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__pad_rot_angle);
	 * CPointer&lt;Float&gt; p_pad_rot_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad_rot_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad_rot_angle = new long[]{9080, 9152};

	/**
	 * Field descriptor (offset) for struct member '_pad12'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD___pad12);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad12 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad12'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad12 = new long[]{9084, 9156};

	/**
	 * Field descriptor (offset) for struct member 'rvisize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rotating view icon size. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__rvisize);
	 * CPointer&lt;Short&gt; p_rvisize = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rvisize'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rvisize = new long[]{9088, 9160};

	/**
	 * Field descriptor (offset) for struct member 'rvibright'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rotating view icon brightness. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__rvibright);
	 * CPointer&lt;Short&gt; p_rvibright = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rvibright'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rvibright = new long[]{9090, 9162};

	/**
	 * Field descriptor (offset) for struct member 'recent_files'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Maximum number of recently used files to remember. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__recent_files);
	 * CPointer&lt;Short&gt; p_recent_files = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'recent_files'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__recent_files = new long[]{9092, 9164};

	/**
	 * Field descriptor (offset) for struct member 'smooth_viewtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Milliseconds to spend spinning the view. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__smooth_viewtx);
	 * CPointer&lt;Short&gt; p_smooth_viewtx = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smooth_viewtx'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smooth_viewtx = new long[]{9094, 9166};

	/**
	 * Field descriptor (offset) for struct member 'glreslimit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__glreslimit);
	 * CPointer&lt;Short&gt; p_glreslimit = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'glreslimit'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__glreslimit = new long[]{9096, 9168};

	/**
	 * Field descriptor (offset) for struct member 'color_picker_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eColorPicker_Types . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__color_picker_type);
	 * CPointer&lt;Short&gt; p_color_picker_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_picker_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_picker_type = new long[]{9098, 9170};

	/**
	 * Field descriptor (offset) for struct member 'auto_smoothing_new'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Curve}  smoothing type for newly added F-Curves. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__auto_smoothing_new);
	 * CPointer&lt;Byte&gt; p_auto_smoothing_new = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'auto_smoothing_new'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__auto_smoothing_new = new long[]{9100, 9172};

	/**
	 * Field descriptor (offset) for struct member 'ipo_new'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Interpolation mode for newly added F-Curves. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__ipo_new);
	 * CPointer&lt;Byte&gt; p_ipo_new = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo_new'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo_new = new long[]{9101, 9173};

	/**
	 * Field descriptor (offset) for struct member 'keyhandles_new'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Handle types for newly added keyframes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__keyhandles_new);
	 * CPointer&lt;Byte&gt; p_keyhandles_new = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyhandles_new'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyhandles_new = new long[]{9102, 9174};

	/**
	 * Field descriptor (offset) for struct member '_pad11'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD___pad11);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad11 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad11'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad11 = new long[]{9103, 9175};

	/**
	 * Field descriptor (offset) for struct member 'view_frame_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eZoomFrame_Mode . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__view_frame_type);
	 * CPointer&lt;Byte&gt; p_view_frame_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_frame_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_frame_type = new long[]{9107, 9179};

	/**
	 * Field descriptor (offset) for struct member 'view_frame_keyframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of keyframes to zoom around current frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__view_frame_keyframes);
	 * CPointer&lt;Integer&gt; p_view_frame_keyframes = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_frame_keyframes'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_frame_keyframes = new long[]{9108, 9180};

	/**
	 * Field descriptor (offset) for struct member 'view_frame_seconds'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Seconds to zoom around current frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__view_frame_seconds);
	 * CPointer&lt;Float&gt; p_view_frame_seconds = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_frame_seconds'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_frame_seconds = new long[]{9112, 9184};

	/**
	 * Field descriptor (offset) for struct member '_pad7'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD___pad7);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad7 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad7'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad7 = new long[]{9116, 9188};

	/**
	 * Field descriptor (offset) for struct member 'widget_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Private, defaults to 20 for 72 DPI setting. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__widget_unit);
	 * CPointer&lt;Short&gt; p_widget_unit = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'widget_unit'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__widget_unit = new long[]{9122, 9194};

	/**
	 * Field descriptor (offset) for struct member 'anisotropic_filter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__anisotropic_filter);
	 * CPointer&lt;Short&gt; p_anisotropic_filter = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anisotropic_filter'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anisotropic_filter = new long[]{9124, 9196};

	/**
	 * Field descriptor (offset) for struct member 'tablet_api'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tablet API to use (Windows only). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__tablet_api);
	 * CPointer&lt;Short&gt; p_tablet_api = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tablet_api'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tablet_api = new long[]{9126, 9198};

	/**
	 * Field descriptor (offset) for struct member 'pressure_threshold_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Raw tablet pressure that maps to 100%. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__pressure_threshold_max);
	 * CPointer&lt;Float&gt; p_pressure_threshold_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pressure_threshold_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pressure_threshold_max = new long[]{9128, 9200};

	/**
	 * Field descriptor (offset) for struct member 'pressure_softness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Curve}  non-linearity parameter. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__pressure_softness);
	 * CPointer&lt;Float&gt; p_pressure_softness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pressure_softness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pressure_softness = new long[]{9132, 9204};

	/**
	 * Field descriptor (offset) for struct member 'ndof_sensitivity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Overall sensitivity of 3D mouse. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__ndof_sensitivity);
	 * CPointer&lt;Float&gt; p_ndof_sensitivity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ndof_sensitivity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ndof_sensitivity = new long[]{9136, 9208};

	/**
	 * Field descriptor (offset) for struct member 'ndof_orbit_sensitivity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__ndof_orbit_sensitivity);
	 * CPointer&lt;Float&gt; p_ndof_orbit_sensitivity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ndof_orbit_sensitivity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ndof_orbit_sensitivity = new long[]{9140, 9212};

	/**
	 * Field descriptor (offset) for struct member 'ndof_deadzone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dead-zone of 3D mouse. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__ndof_deadzone);
	 * CPointer&lt;Float&gt; p_ndof_deadzone = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ndof_deadzone'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ndof_deadzone = new long[]{9144, 9216};

	/**
	 * Field descriptor (offset) for struct member 'ndof_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eNdof_Flag , flags for 3D mouse. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__ndof_flag);
	 * CPointer&lt;Integer&gt; p_ndof_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ndof_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ndof_flag = new long[]{9148, 9220};

	/**
	 * Field descriptor (offset) for struct member 'ogl_multisamples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eMultiSample_Type , amount of samples for OpenGL FSA, if zero no FSA. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__ogl_multisamples);
	 * CPointer&lt;Short&gt; p_ogl_multisamples = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ogl_multisamples'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ogl_multisamples = new long[]{9152, 9224};

	/**
	 * Field descriptor (offset) for struct member 'image_draw_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eImageDrawMethod, Method to be used to draw the images (AUTO, GLSL, Textures or DrawPixels) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__image_draw_method);
	 * CPointer&lt;Short&gt; p_image_draw_method = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image_draw_method'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image_draw_method = new long[]{9154, 9226};

	/**
	 * Field descriptor (offset) for struct member 'glalphaclip'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__glalphaclip);
	 * CPointer&lt;Float&gt; p_glalphaclip = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'glalphaclip'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__glalphaclip = new long[]{9156, 9228};

	/**
	 * Field descriptor (offset) for struct member 'autokey_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eAutokey_Mode , autokeying mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__autokey_mode);
	 * CPointer&lt;Short&gt; p_autokey_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'autokey_mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__autokey_mode = new long[]{9160, 9232};

	/**
	 * Field descriptor (offset) for struct member 'autokey_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for autokeying. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__autokey_flag);
	 * CPointer&lt;Short&gt; p_autokey_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'autokey_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__autokey_flag = new long[]{9162, 9234};

	/**
	 * Field descriptor (offset) for struct member 'animation_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for animation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__animation_flag);
	 * CPointer&lt;Short&gt; p_animation_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'animation_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__animation_flag = new long[]{9164, 9236};

	/**
	 * Field descriptor (offset) for struct member 'text_render'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Options for text rendering. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__text_render);
	 * CPointer&lt;Byte&gt; p_text_render = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text_render'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text_render = new long[]{9166, 9238};

	/**
	 * Field descriptor (offset) for struct member 'navigation_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__navigation_mode);
	 * CPointer&lt;Byte&gt; p_navigation_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'navigation_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__navigation_mode = new long[]{9167, 9239};

	/**
	 * Field descriptor (offset) for struct member 'view_rotate_sensitivity_turntable'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Turn-table rotation amount per-pixel in radians. Scaled with DPI. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__view_rotate_sensitivity_turntable);
	 * CPointer&lt;Float&gt; p_view_rotate_sensitivity_turntable = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_rotate_sensitivity_turntable'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_rotate_sensitivity_turntable = new long[]{9168, 9240};

	/**
	 * Field descriptor (offset) for struct member 'view_rotate_sensitivity_trackball'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Track-ball rotation scale. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__view_rotate_sensitivity_trackball);
	 * CPointer&lt;Float&gt; p_view_rotate_sensitivity_trackball = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_rotate_sensitivity_trackball'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_rotate_sensitivity_trackball = new long[]{9172, 9244};

	/**
	 * Field descriptor (offset) for struct member 'coba_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> From texture.h. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__coba_weight);
	 * CPointer&lt;ColorBand&gt; p_coba_weight = p.cast(new Class[]{ColorBand.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coba_weight'</li>
	 * <li>Signature: 'ColorBand'</li>
	 * <li>Actual Size (32bit/64bit): 776/776</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coba_weight = new long[]{9176, 9248};

	/**
	 * Field descriptor (offset) for struct member 'sculpt_paint_overlay_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__sculpt_paint_overlay_col);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_sculpt_paint_overlay_col = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sculpt_paint_overlay_col'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sculpt_paint_overlay_col = new long[]{9952, 10024};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_new_layer_col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default color for newly created Grease Pencil layers. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__gpencil_new_layer_col);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gpencil_new_layer_col = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_new_layer_col'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_new_layer_col = new long[]{9964, 10036};

	/**
	 * Field descriptor (offset) for struct member 'drag_threshold_mouse'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Drag pixels (scaled by DPI). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__drag_threshold_mouse);
	 * CPointer&lt;Byte&gt; p_drag_threshold_mouse = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drag_threshold_mouse'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drag_threshold_mouse = new long[]{9980, 10052};

	/**
	 * Field descriptor (offset) for struct member 'drag_threshold_tablet'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__drag_threshold_tablet);
	 * CPointer&lt;Byte&gt; p_drag_threshold_tablet = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drag_threshold_tablet'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drag_threshold_tablet = new long[]{9981, 10053};

	/**
	 * Field descriptor (offset) for struct member 'drag_threshold'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__drag_threshold);
	 * CPointer&lt;Byte&gt; p_drag_threshold = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drag_threshold'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drag_threshold = new long[]{9982, 10054};

	/**
	 * Field descriptor (offset) for struct member 'move_threshold'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__move_threshold);
	 * CPointer&lt;Byte&gt; p_move_threshold = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'move_threshold'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__move_threshold = new long[]{9983, 10055};

	/**
	 * Field descriptor (offset) for struct member 'font_path_ui'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__font_path_ui);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_font_path_ui = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'font_path_ui'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__font_path_ui = new long[]{9984, 10056};

	/**
	 * Field descriptor (offset) for struct member 'font_path_ui_mono'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__font_path_ui_mono);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_font_path_ui_mono = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'font_path_ui_mono'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__font_path_ui_mono = new long[]{11008, 11080};

	/**
	 * Field descriptor (offset) for struct member 'compute_device_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Legacy, for backwards compatibility only. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__compute_device_type);
	 * CPointer&lt;Integer&gt; p_compute_device_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'compute_device_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__compute_device_type = new long[]{12032, 12104};

	/**
	 * Field descriptor (offset) for struct member 'fcu_inactive_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Opacity of inactive F-Curves in F-Curve Editor. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__fcu_inactive_alpha);
	 * CPointer&lt;Float&gt; p_fcu_inactive_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fcu_inactive_alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fcu_inactive_alpha = new long[]{12036, 12108};

	/**
	 * Field descriptor (offset) for struct member 'pie_tap_timeout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If keeping a pie menu spawn button pressed after this time, it turns into a drag/release pie menu. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__pie_tap_timeout);
	 * CPointer&lt;Short&gt; p_pie_tap_timeout = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pie_tap_timeout'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pie_tap_timeout = new long[]{12040, 12112};

	/**
	 * Field descriptor (offset) for struct member 'pie_initial_timeout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Direction in the pie menu will always be calculated from the initial position within this time limit. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__pie_initial_timeout);
	 * CPointer&lt;Short&gt; p_pie_initial_timeout = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pie_initial_timeout'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pie_initial_timeout = new long[]{12042, 12114};

	/**
	 * Field descriptor (offset) for struct member 'pie_animation_timeout'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__pie_animation_timeout);
	 * CPointer&lt;Short&gt; p_pie_animation_timeout = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pie_animation_timeout'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pie_animation_timeout = new long[]{12044, 12116};

	/**
	 * Field descriptor (offset) for struct member 'pie_menu_confirm'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__pie_menu_confirm);
	 * CPointer&lt;Short&gt; p_pie_menu_confirm = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pie_menu_confirm'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pie_menu_confirm = new long[]{12046, 12118};

	/**
	 * Field descriptor (offset) for struct member 'pie_menu_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pie menu radius. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__pie_menu_radius);
	 * CPointer&lt;Short&gt; p_pie_menu_radius = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pie_menu_radius'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pie_menu_radius = new long[]{12048, 12120};

	/**
	 * Field descriptor (offset) for struct member 'pie_menu_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pie menu distance from center before a direction is set. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__pie_menu_threshold);
	 * CPointer&lt;Short&gt; p_pie_menu_threshold = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pie_menu_threshold'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pie_menu_threshold = new long[]{12050, 12122};

	/**
	 * Field descriptor (offset) for struct member 'opensubdiv_compute_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__opensubdiv_compute_type);
	 * CPointer&lt;Short&gt; p_opensubdiv_compute_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'opensubdiv_compute_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__opensubdiv_compute_type = new long[]{12052, 12124};

	/**
	 * Field descriptor (offset) for struct member '_pad6'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD___pad6);
	 * CPointer&lt;Short&gt; p__pad6 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad6'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad6 = new long[]{12054, 12126};

	/**
	 * Field descriptor (offset) for struct member 'factor_display_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__factor_display_type);
	 * CPointer&lt;Byte&gt; p_factor_display_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'factor_display_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__factor_display_type = new long[]{12056, 12128};

	/**
	 * Field descriptor (offset) for struct member 'viewport_aa'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__viewport_aa);
	 * CPointer&lt;Byte&gt; p_viewport_aa = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewport_aa'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewport_aa = new long[]{12057, 12129};

	/**
	 * Field descriptor (offset) for struct member 'render_display_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_RenderDisplayType </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__render_display_type);
	 * CPointer&lt;Byte&gt; p_render_display_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_display_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_display_type = new long[]{12058, 12130};

	/**
	 * Field descriptor (offset) for struct member 'filebrowser_display_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_TempSpaceDisplayType </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__filebrowser_display_type);
	 * CPointer&lt;Byte&gt; p_filebrowser_display_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filebrowser_display_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filebrowser_display_type = new long[]{12059, 12131};

	/**
	 * Field descriptor (offset) for struct member 'sequencer_disk_cache_dir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__sequencer_disk_cache_dir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_sequencer_disk_cache_dir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sequencer_disk_cache_dir'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sequencer_disk_cache_dir = new long[]{12060, 12132};

	/**
	 * Field descriptor (offset) for struct member 'sequencer_disk_cache_compression'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_DiskCacheCompression </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__sequencer_disk_cache_compression);
	 * CPointer&lt;Integer&gt; p_sequencer_disk_cache_compression = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sequencer_disk_cache_compression'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sequencer_disk_cache_compression = new long[]{13084, 13156};

	/**
	 * Field descriptor (offset) for struct member 'sequencer_disk_cache_size_limit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__sequencer_disk_cache_size_limit);
	 * CPointer&lt;Integer&gt; p_sequencer_disk_cache_size_limit = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sequencer_disk_cache_size_limit'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sequencer_disk_cache_size_limit = new long[]{13088, 13160};

	/**
	 * Field descriptor (offset) for struct member 'sequencer_disk_cache_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__sequencer_disk_cache_flag);
	 * CPointer&lt;Short&gt; p_sequencer_disk_cache_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sequencer_disk_cache_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sequencer_disk_cache_flag = new long[]{13092, 13164};

	/**
	 * Field descriptor (offset) for struct member 'sequencer_proxy_setup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_SeqProxySetup </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__sequencer_proxy_setup);
	 * CPointer&lt;Short&gt; p_sequencer_proxy_setup = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sequencer_proxy_setup'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sequencer_proxy_setup = new long[]{13094, 13166};

	/**
	 * Field descriptor (offset) for struct member 'collection_instance_empty_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__collection_instance_empty_size);
	 * CPointer&lt;Float&gt; p_collection_instance_empty_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'collection_instance_empty_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__collection_instance_empty_size = new long[]{13096, 13168};

	/**
	 * Field descriptor (offset) for struct member 'text_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__text_flag);
	 * CPointer&lt;Byte&gt; p_text_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'text_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__text_flag = new long[]{13100, 13172};

	/**
	 * Field descriptor (offset) for struct member '_pad10'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD___pad10);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad10 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad10'</li>
	 * <li>Signature: 'char[1]'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad10 = new long[]{13101, 13173};

	/**
	 * Field descriptor (offset) for struct member 'file_preview_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_File_Preview_Type </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__file_preview_type);
	 * CPointer&lt;Byte&gt; p_file_preview_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'file_preview_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__file_preview_type = new long[]{13102, 13174};

	/**
	 * Field descriptor (offset) for struct member 'statusbar_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_StatusBar_Flag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__statusbar_flag);
	 * CPointer&lt;Byte&gt; p_statusbar_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'statusbar_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__statusbar_flag = new long[]{13103, 13175};

	/**
	 * Field descriptor (offset) for struct member 'walk_navigation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__walk_navigation);
	 * CPointer&lt;WalkNavigation&gt; p_walk_navigation = p.cast(new Class[]{WalkNavigation.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'walk_navigation'</li>
	 * <li>Signature: 'WalkNavigation'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__walk_navigation = new long[]{13104, 13176};

	/**
	 * Field descriptor (offset) for struct member 'space_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The UI for the user preferences. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__space_data);
	 * CPointer&lt;UserDef_SpaceData&gt; p_space_data = p.cast(new Class[]{UserDef_SpaceData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'space_data'</li>
	 * <li>Signature: 'UserDef_SpaceData'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__space_data = new long[]{13136, 13208};

	/**
	 * Field descriptor (offset) for struct member 'file_space_data'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__file_space_data);
	 * CPointer&lt;UserDef_FileSpaceData&gt; p_file_space_data = p.cast(new Class[]{UserDef_FileSpaceData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'file_space_data'</li>
	 * <li>Signature: 'UserDef_FileSpaceData'</li>
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__file_space_data = new long[]{13144, 13216};

	/**
	 * Field descriptor (offset) for struct member 'experimental'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__experimental);
	 * CPointer&lt;UserDef_Experimental&gt; p_experimental = p.cast(new Class[]{UserDef_Experimental.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'experimental'</li>
	 * <li>Signature: 'UserDef_Experimental'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__experimental = new long[]{13184, 13256};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data (keep last). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UserDef userdef = ...;
	 * CPointer&lt;Object&gt; p = userdef.__dna__addressof(UserDef.__DNA__FIELD__runtime);
	 * CPointer&lt;UserDef_Runtime&gt; p_runtime = p.cast(new Class[]{UserDef_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'UserDef_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{13200, 13272};

	public UserDef(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected UserDef(UserDef that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'versionfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link UserDef}  has separate do-version handling, and can be read from other files. </p>
	 * @see #__DNA__FIELD__versionfile
	 */
	
	public int getVersionfile() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'versionfile'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link UserDef}  has separate do-version handling, and can be read from other files. </p>
	 * @see #__DNA__FIELD__versionfile
	 */
	
	public void setVersionfile(int versionfile) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, versionfile);
		} else {
			__io__block.writeInt(__io__address + 0, versionfile);
		}
	}

	/**
	 * Get method for struct member 'subversionfile'.
	 * @see #__DNA__FIELD__subversionfile
	 */
	
	public int getSubversionfile() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'subversionfile'.
	 * @see #__DNA__FIELD__subversionfile
	 */
	
	public void setSubversionfile(int subversionfile) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, subversionfile);
		} else {
			__io__block.writeInt(__io__address + 4, subversionfile);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eUserPref_Flag . </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eUserPref_Flag . </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, flag);
		} else {
			__io__block.writeInt(__io__address + 8, flag);
		}
	}

	/**
	 * Get method for struct member 'dupflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eDupli_ID_Flags . </p>
	 * @see #__DNA__FIELD__dupflag
	 */
	
	public int getDupflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'dupflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eDupli_ID_Flags . </p>
	 * @see #__DNA__FIELD__dupflag
	 */
	
	public void setDupflag(int dupflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, dupflag);
		} else {
			__io__block.writeInt(__io__address + 12, dupflag);
		}
	}

	/**
	 * Get method for struct member 'pref_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> #eUserPref_PrefFlag preferences for the preferences. </p>
	 * @see #__DNA__FIELD__pref_flag
	 */
	
	public byte getPref_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 16);
		} else {
			return __io__block.readByte(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'pref_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> #eUserPref_PrefFlag preferences for the preferences. </p>
	 * @see #__DNA__FIELD__pref_flag
	 */
	
	public void setPref_flag(byte pref_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 16, pref_flag);
		} else {
			__io__block.writeByte(__io__address + 16, pref_flag);
		}
	}

	/**
	 * Get method for struct member 'savetime'.
	 * @see #__DNA__FIELD__savetime
	 */
	
	public byte getSavetime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 17);
		} else {
			return __io__block.readByte(__io__address + 17);
		}
	}

	/**
	 * Set method for struct member 'savetime'.
	 * @see #__DNA__FIELD__savetime
	 */
	
	public void setSavetime(byte savetime) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 17, savetime);
		} else {
			__io__block.writeByte(__io__address + 17, savetime);
		}
	}

	/**
	 * Get method for struct member 'mouse_emulate_3_button_modifier'.
	 * @see #__DNA__FIELD__mouse_emulate_3_button_modifier
	 */
	
	public byte getMouse_emulate_3_button_modifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 18);
		} else {
			return __io__block.readByte(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'mouse_emulate_3_button_modifier'.
	 * @see #__DNA__FIELD__mouse_emulate_3_button_modifier
	 */
	
	public void setMouse_emulate_3_button_modifier(byte mouse_emulate_3_button_modifier) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 18, mouse_emulate_3_button_modifier);
		} else {
			__io__block.writeByte(__io__address + 18, mouse_emulate_3_button_modifier);
		}
	}

	/**
	 * Get method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public CArrayFacade<Byte> get_pad4() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 19, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 19, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public void set_pad4(CArrayFacade<Byte> _pad4) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 19;
		} else {
			__dna__offset = 19;
		}
		if (__io__equals(_pad4, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad4)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad4);
		} else {
			__io__generic__copy( get_pad4(), _pad4);
		}
	}

	/**
	 * Get method for struct member 'tempdir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAXDIR length. </p>
	 * @see #__DNA__FIELD__tempdir
	 */
	
	public CArrayFacade<Byte> getTempdir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			768
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tempdir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAXDIR length. </p>
	 * @see #__DNA__FIELD__tempdir
	 */
	
	public void setTempdir(CArrayFacade<Byte> tempdir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(tempdir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tempdir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tempdir);
		} else {
			__io__generic__copy( getTempdir(), tempdir);
		}
	}

	/**
	 * Get method for struct member 'fontdir'.
	 * @see #__DNA__FIELD__fontdir
	 */
	
	public CArrayFacade<Byte> getFontdir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			768
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 788, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 788, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fontdir'.
	 * @see #__DNA__FIELD__fontdir
	 */
	
	public void setFontdir(CArrayFacade<Byte> fontdir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 788;
		} else {
			__dna__offset = 788;
		}
		if (__io__equals(fontdir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fontdir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fontdir);
		} else {
			__io__generic__copy( getFontdir(), fontdir);
		}
	}

	/**
	 * Get method for struct member 'renderdir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX length. </p>
	 * @see #__DNA__FIELD__renderdir
	 */
	
	public CArrayFacade<Byte> getRenderdir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1556, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1556, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'renderdir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAX length. </p>
	 * @see #__DNA__FIELD__renderdir
	 */
	
	public void setRenderdir(CArrayFacade<Byte> renderdir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1556;
		} else {
			__dna__offset = 1556;
		}
		if (__io__equals(renderdir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, renderdir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, renderdir);
		} else {
			__io__generic__copy( getRenderdir(), renderdir);
		}
	}

	/**
	 * Get method for struct member 'render_cachedir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> EXR cache path 768 = FILE_MAXDIR. </p>
	 * @see #__DNA__FIELD__render_cachedir
	 */
	
	public CArrayFacade<Byte> getRender_cachedir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			768
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2580, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2580, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'render_cachedir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> EXR cache path 768 = FILE_MAXDIR. </p>
	 * @see #__DNA__FIELD__render_cachedir
	 */
	
	public void setRender_cachedir(CArrayFacade<Byte> render_cachedir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2580;
		} else {
			__dna__offset = 2580;
		}
		if (__io__equals(render_cachedir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, render_cachedir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, render_cachedir);
		} else {
			__io__generic__copy( getRender_cachedir(), render_cachedir);
		}
	}

	/**
	 * Get method for struct member 'textudir'.
	 * @see #__DNA__FIELD__textudir
	 */
	
	public CArrayFacade<Byte> getTextudir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			768
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 3348, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 3348, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'textudir'.
	 * @see #__DNA__FIELD__textudir
	 */
	
	public void setTextudir(CArrayFacade<Byte> textudir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 3348;
		} else {
			__dna__offset = 3348;
		}
		if (__io__equals(textudir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, textudir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, textudir);
		} else {
			__io__generic__copy( getTextudir(), textudir);
		}
	}

	/**
	 * Get method for struct member 'pythondir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional user location for scripts.</p><p><code></code> .</p><p><h2>Note</h2><p><code></code><code></code><code></code><em></em>  have been in gets complicated.</p><code></code>  is refreshed when loading preferences. This is done to support #PREFERENCES_OT_copy_prev which is available to the user when they launch with a new version of Blender. In this case setting the script path on top of factory settings will work without problems. </p>
	 * @see #__DNA__FIELD__pythondir
	 */
	
	public CArrayFacade<Byte> getPythondir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			768
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 4116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pythondir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional user location for scripts.</p><p><code></code> .</p><p><h2>Note</h2><p><code></code><code></code><code></code><em></em>  have been in gets complicated.</p><code></code>  is refreshed when loading preferences. This is done to support #PREFERENCES_OT_copy_prev which is available to the user when they launch with a new version of Blender. In this case setting the script path on top of factory settings will work without problems. </p>
	 * @see #__DNA__FIELD__pythondir
	 */
	
	public void setPythondir(CArrayFacade<Byte> pythondir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4116;
		} else {
			__dna__offset = 4116;
		}
		if (__io__equals(pythondir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pythondir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pythondir);
		} else {
			__io__generic__copy( getPythondir(), pythondir);
		}
	}

	/**
	 * Get method for struct member 'sounddir'.
	 * @see #__DNA__FIELD__sounddir
	 */
	
	public CArrayFacade<Byte> getSounddir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			768
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 4884, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4884, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sounddir'.
	 * @see #__DNA__FIELD__sounddir
	 */
	
	public void setSounddir(CArrayFacade<Byte> sounddir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4884;
		} else {
			__dna__offset = 4884;
		}
		if (__io__equals(sounddir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sounddir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sounddir);
		} else {
			__io__generic__copy( getSounddir(), sounddir);
		}
	}

	/**
	 * Get method for struct member 'i18ndir'.
	 * @see #__DNA__FIELD__i18ndir
	 */
	
	public CArrayFacade<Byte> getI18ndir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			768
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 5652, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 5652, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'i18ndir'.
	 * @see #__DNA__FIELD__i18ndir
	 */
	
	public void setI18ndir(CArrayFacade<Byte> i18ndir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 5652;
		} else {
			__dna__offset = 5652;
		}
		if (__io__equals(i18ndir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, i18ndir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, i18ndir);
		} else {
			__io__generic__copy( getI18ndir(), i18ndir);
		}
	}

	/**
	 * Get method for struct member 'image_editor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__image_editor
	 */
	
	public CArrayFacade<Byte> getImage_editor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 6420, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 6420, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'image_editor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__image_editor
	 */
	
	public void setImage_editor(CArrayFacade<Byte> image_editor) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 6420;
		} else {
			__dna__offset = 6420;
		}
		if (__io__equals(image_editor, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, image_editor)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, image_editor);
		} else {
			__io__generic__copy( getImage_editor(), image_editor);
		}
	}

	/**
	 * Get method for struct member 'anim_player'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__anim_player
	 */
	
	public CArrayFacade<Byte> getAnim_player() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 7444, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 7444, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'anim_player'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__anim_player
	 */
	
	public void setAnim_player(CArrayFacade<Byte> anim_player) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 7444;
		} else {
			__dna__offset = 7444;
		}
		if (__io__equals(anim_player, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, anim_player)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, anim_player);
		} else {
			__io__generic__copy( getAnim_player(), anim_player);
		}
	}

	/**
	 * Get method for struct member 'anim_player_preset'.
	 * @see #__DNA__FIELD__anim_player_preset
	 */
	
	public int getAnim_player_preset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8468);
		} else {
			return __io__block.readInt(__io__address + 8468);
		}
	}

	/**
	 * Set method for struct member 'anim_player_preset'.
	 * @see #__DNA__FIELD__anim_player_preset
	 */
	
	public void setAnim_player_preset(int anim_player_preset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8468, anim_player_preset);
		} else {
			__io__block.writeInt(__io__address + 8468, anim_player_preset);
		}
	}

	/**
	 * Get method for struct member 'v2d_min_gridsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimum spacing between grid-lines in {@link View2D}  grids. </p>
	 * @see #__DNA__FIELD__v2d_min_gridsize
	 */
	
	public short getV2d_min_gridsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8472);
		} else {
			return __io__block.readShort(__io__address + 8472);
		}
	}

	/**
	 * Set method for struct member 'v2d_min_gridsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimum spacing between grid-lines in {@link View2D}  grids. </p>
	 * @see #__DNA__FIELD__v2d_min_gridsize
	 */
	
	public void setV2d_min_gridsize(short v2d_min_gridsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8472, v2d_min_gridsize);
		} else {
			__io__block.writeShort(__io__address + 8472, v2d_min_gridsize);
		}
	}

	/**
	 * Get method for struct member 'timecode_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eTimecodeStyles , style of time-code display. </p>
	 * @see #__DNA__FIELD__timecode_style
	 */
	
	public short getTimecode_style() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8474);
		} else {
			return __io__block.readShort(__io__address + 8474);
		}
	}

	/**
	 * Set method for struct member 'timecode_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eTimecodeStyles , style of time-code display. </p>
	 * @see #__DNA__FIELD__timecode_style
	 */
	
	public void setTimecode_style(short timecode_style) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8474, timecode_style);
		} else {
			__io__block.writeShort(__io__address + 8474, timecode_style);
		}
	}

	/**
	 * Get method for struct member 'versions'.
	 * @see #__DNA__FIELD__versions
	 */
	
	public short getVersions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8476);
		} else {
			return __io__block.readShort(__io__address + 8476);
		}
	}

	/**
	 * Set method for struct member 'versions'.
	 * @see #__DNA__FIELD__versions
	 */
	
	public void setVersions(short versions) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8476, versions);
		} else {
			__io__block.writeShort(__io__address + 8476, versions);
		}
	}

	/**
	 * Get method for struct member 'dbl_click_time'.
	 * @see #__DNA__FIELD__dbl_click_time
	 */
	
	public short getDbl_click_time() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8478);
		} else {
			return __io__block.readShort(__io__address + 8478);
		}
	}

	/**
	 * Set method for struct member 'dbl_click_time'.
	 * @see #__DNA__FIELD__dbl_click_time
	 */
	
	public void setDbl_click_time(short dbl_click_time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8478, dbl_click_time);
		} else {
			__io__block.writeShort(__io__address + 8478, dbl_click_time);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8480, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8480, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 8480;
		} else {
			__dna__offset = 8480;
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
	 * Get method for struct member 'mini_axis_type'.
	 * @see #__DNA__FIELD__mini_axis_type
	 */
	
	public byte getMini_axis_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8483);
		} else {
			return __io__block.readByte(__io__address + 8483);
		}
	}

	/**
	 * Set method for struct member 'mini_axis_type'.
	 * @see #__DNA__FIELD__mini_axis_type
	 */
	
	public void setMini_axis_type(byte mini_axis_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8483, mini_axis_type);
		} else {
			__io__block.writeByte(__io__address + 8483, mini_axis_type);
		}
	}

	/**
	 * Get method for struct member 'uiflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eUserpref_UI_Flag . </p>
	 * @see #__DNA__FIELD__uiflag
	 */
	
	public int getUiflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8484);
		} else {
			return __io__block.readInt(__io__address + 8484);
		}
	}

	/**
	 * Set method for struct member 'uiflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eUserpref_UI_Flag . </p>
	 * @see #__DNA__FIELD__uiflag
	 */
	
	public void setUiflag(int uiflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8484, uiflag);
		} else {
			__io__block.writeInt(__io__address + 8484, uiflag);
		}
	}

	/**
	 * Get method for struct member 'uiflag2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eUserpref_UI_Flag2 . </p>
	 * @see #__DNA__FIELD__uiflag2
	 */
	
	public byte getUiflag2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8488);
		} else {
			return __io__block.readByte(__io__address + 8488);
		}
	}

	/**
	 * Set method for struct member 'uiflag2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eUserpref_UI_Flag2 . </p>
	 * @see #__DNA__FIELD__uiflag2
	 */
	
	public void setUiflag2(byte uiflag2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8488, uiflag2);
		} else {
			__io__block.writeByte(__io__address + 8488, uiflag2);
		}
	}

	/**
	 * Get method for struct member 'gpu_flag'.
	 * @see #__DNA__FIELD__gpu_flag
	 */
	
	public byte getGpu_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8489);
		} else {
			return __io__block.readByte(__io__address + 8489);
		}
	}

	/**
	 * Set method for struct member 'gpu_flag'.
	 * @see #__DNA__FIELD__gpu_flag
	 */
	
	public void setGpu_flag(byte gpu_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8489, gpu_flag);
		} else {
			__io__block.writeByte(__io__address + 8489, gpu_flag);
		}
	}

	/**
	 * Get method for struct member '_pad8'.
	 * @see #__DNA__FIELD___pad8
	 */
	
	public CArrayFacade<Byte> get_pad8() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8490, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8490, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad8'.
	 * @see #__DNA__FIELD___pad8
	 */
	
	public void set_pad8(CArrayFacade<Byte> _pad8) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8490;
		} else {
			__dna__offset = 8490;
		}
		if (__io__equals(_pad8, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad8)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad8);
		} else {
			__io__generic__copy( get_pad8(), _pad8);
		}
	}

	/**
	 * Get method for struct member 'app_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Experimental flag for app-templates to make changes to behavior which are outside the scope of typical preferences. </p>
	 * @see #__DNA__FIELD__app_flag
	 */
	
	public byte getApp_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8496);
		} else {
			return __io__block.readByte(__io__address + 8496);
		}
	}

	/**
	 * Set method for struct member 'app_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Experimental flag for app-templates to make changes to behavior which are outside the scope of typical preferences. </p>
	 * @see #__DNA__FIELD__app_flag
	 */
	
	public void setApp_flag(byte app_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8496, app_flag);
		} else {
			__io__block.writeByte(__io__address + 8496, app_flag);
		}
	}

	/**
	 * Get method for struct member 'viewzoom'.
	 * @see #__DNA__FIELD__viewzoom
	 */
	
	public byte getViewzoom() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8497);
		} else {
			return __io__block.readByte(__io__address + 8497);
		}
	}

	/**
	 * Set method for struct member 'viewzoom'.
	 * @see #__DNA__FIELD__viewzoom
	 */
	
	public void setViewzoom(byte viewzoom) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8497, viewzoom);
		} else {
			__io__block.writeByte(__io__address + 8497, viewzoom);
		}
	}

	/**
	 * Get method for struct member 'language'.
	 * @see #__DNA__FIELD__language
	 */
	
	public short getLanguage() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8498);
		} else {
			return __io__block.readShort(__io__address + 8498);
		}
	}

	/**
	 * Set method for struct member 'language'.
	 * @see #__DNA__FIELD__language
	 */
	
	public void setLanguage(short language) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8498, language);
		} else {
			__io__block.writeShort(__io__address + 8498, language);
		}
	}

	/**
	 * Get method for struct member 'mixbufsize'.
	 * @see #__DNA__FIELD__mixbufsize
	 */
	
	public int getMixbufsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8500);
		} else {
			return __io__block.readInt(__io__address + 8500);
		}
	}

	/**
	 * Set method for struct member 'mixbufsize'.
	 * @see #__DNA__FIELD__mixbufsize
	 */
	
	public void setMixbufsize(int mixbufsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8500, mixbufsize);
		} else {
			__io__block.writeInt(__io__address + 8500, mixbufsize);
		}
	}

	/**
	 * Get method for struct member 'audiodevice'.
	 * @see #__DNA__FIELD__audiodevice
	 */
	
	public int getAudiodevice() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8504);
		} else {
			return __io__block.readInt(__io__address + 8504);
		}
	}

	/**
	 * Set method for struct member 'audiodevice'.
	 * @see #__DNA__FIELD__audiodevice
	 */
	
	public void setAudiodevice(int audiodevice) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8504, audiodevice);
		} else {
			__io__block.writeInt(__io__address + 8504, audiodevice);
		}
	}

	/**
	 * Get method for struct member 'audiorate'.
	 * @see #__DNA__FIELD__audiorate
	 */
	
	public int getAudiorate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8508);
		} else {
			return __io__block.readInt(__io__address + 8508);
		}
	}

	/**
	 * Set method for struct member 'audiorate'.
	 * @see #__DNA__FIELD__audiorate
	 */
	
	public void setAudiorate(int audiorate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8508, audiorate);
		} else {
			__io__block.writeInt(__io__address + 8508, audiorate);
		}
	}

	/**
	 * Get method for struct member 'audioformat'.
	 * @see #__DNA__FIELD__audioformat
	 */
	
	public int getAudioformat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8512);
		} else {
			return __io__block.readInt(__io__address + 8512);
		}
	}

	/**
	 * Set method for struct member 'audioformat'.
	 * @see #__DNA__FIELD__audioformat
	 */
	
	public void setAudioformat(int audioformat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8512, audioformat);
		} else {
			__io__block.writeInt(__io__address + 8512, audioformat);
		}
	}

	/**
	 * Get method for struct member 'audiochannels'.
	 * @see #__DNA__FIELD__audiochannels
	 */
	
	public int getAudiochannels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8516);
		} else {
			return __io__block.readInt(__io__address + 8516);
		}
	}

	/**
	 * Set method for struct member 'audiochannels'.
	 * @see #__DNA__FIELD__audiochannels
	 */
	
	public void setAudiochannels(int audiochannels) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8516, audiochannels);
		} else {
			__io__block.writeInt(__io__address + 8516, audiochannels);
		}
	}

	/**
	 * Get method for struct member 'ui_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Setting for UI scale (fractional), before screen DPI has been applied. </p>
	 * @see #__DNA__FIELD__ui_scale
	 */
	
	public float getUi_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8520);
		} else {
			return __io__block.readFloat(__io__address + 8520);
		}
	}

	/**
	 * Set method for struct member 'ui_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Setting for UI scale (fractional), before screen DPI has been applied. </p>
	 * @see #__DNA__FIELD__ui_scale
	 */
	
	public void setUi_scale(float ui_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8520, ui_scale);
		} else {
			__io__block.writeFloat(__io__address + 8520, ui_scale);
		}
	}

	/**
	 * Get method for struct member 'ui_line_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Setting for UI line width. </p>
	 * @see #__DNA__FIELD__ui_line_width
	 */
	
	public int getUi_line_width() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8524);
		} else {
			return __io__block.readInt(__io__address + 8524);
		}
	}

	/**
	 * Set method for struct member 'ui_line_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Setting for UI line width. </p>
	 * @see #__DNA__FIELD__ui_line_width
	 */
	
	public void setUi_line_width(int ui_line_width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8524, ui_line_width);
		} else {
			__io__block.writeInt(__io__address + 8524, ui_line_width);
		}
	}

	/**
	 * Get method for struct member 'dpi'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * @see #__DNA__FIELD__dpi
	 */
	
	public int getDpi() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8528);
		} else {
			return __io__block.readInt(__io__address + 8528);
		}
	}

	/**
	 * Set method for struct member 'dpi'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * @see #__DNA__FIELD__dpi
	 */
	
	public void setDpi(int dpi) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8528, dpi);
		} else {
			__io__block.writeInt(__io__address + 8528, dpi);
		}
	}

	/**
	 * Get method for struct member 'dpi_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime, multiplier to scale UI elements based on DPI (fractional). </p>
	 * @see #__DNA__FIELD__dpi_fac
	 */
	
	public float getDpi_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8532);
		} else {
			return __io__block.readFloat(__io__address + 8532);
		}
	}

	/**
	 * Set method for struct member 'dpi_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime, multiplier to scale UI elements based on DPI (fractional). </p>
	 * @see #__DNA__FIELD__dpi_fac
	 */
	
	public void setDpi_fac(float dpi_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8532, dpi_fac);
		} else {
			__io__block.writeFloat(__io__address + 8532, dpi_fac);
		}
	}

	/**
	 * Get method for struct member 'inv_dpi_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  </p>
	 * @see #__DNA__FIELD__inv_dpi_fac
	 */
	
	public float getInv_dpi_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8536);
		} else {
			return __io__block.readFloat(__io__address + 8536);
		}
	}

	/**
	 * Set method for struct member 'inv_dpi_fac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code>  </p>
	 * @see #__DNA__FIELD__inv_dpi_fac
	 */
	
	public void setInv_dpi_fac(float inv_dpi_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8536, inv_dpi_fac);
		} else {
			__io__block.writeFloat(__io__address + 8536, inv_dpi_fac);
		}
	}

	/**
	 * Get method for struct member 'pixelsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime, calculated from line-width and point-size based on DPI (rounded to int). </p>
	 * @see #__DNA__FIELD__pixelsize
	 */
	
	public float getPixelsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8540);
		} else {
			return __io__block.readFloat(__io__address + 8540);
		}
	}

	/**
	 * Set method for struct member 'pixelsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime, calculated from line-width and point-size based on DPI (rounded to int). </p>
	 * @see #__DNA__FIELD__pixelsize
	 */
	
	public void setPixelsize(float pixelsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8540, pixelsize);
		} else {
			__io__block.writeFloat(__io__address + 8540, pixelsize);
		}
	}

	/**
	 * Get method for struct member 'virtual_pixel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated, for forward compatibility. </p>
	 * @see #__DNA__FIELD__virtual_pixel
	 */
	
	public int getVirtual_pixel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8544);
		} else {
			return __io__block.readInt(__io__address + 8544);
		}
	}

	/**
	 * Set method for struct member 'virtual_pixel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated, for forward compatibility. </p>
	 * @see #__DNA__FIELD__virtual_pixel
	 */
	
	public void setVirtual_pixel(int virtual_pixel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8544, virtual_pixel);
		} else {
			__io__block.writeInt(__io__address + 8544, virtual_pixel);
		}
	}

	/**
	 * Get method for struct member 'scrollback'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Console scroll-back limit. </p>
	 * @see #__DNA__FIELD__scrollback
	 */
	
	public int getScrollback() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8548);
		} else {
			return __io__block.readInt(__io__address + 8548);
		}
	}

	/**
	 * Set method for struct member 'scrollback'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Console scroll-back limit. </p>
	 * @see #__DNA__FIELD__scrollback
	 */
	
	public void setScrollback(int scrollback) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8548, scrollback);
		} else {
			__io__block.writeInt(__io__address + 8548, scrollback);
		}
	}

	/**
	 * Get method for struct member 'node_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Node insert offset (aka auto-offset) margin, but might be useful for later stuff as well. </p>
	 * @see #__DNA__FIELD__node_margin
	 */
	
	public byte getNode_margin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8552);
		} else {
			return __io__block.readByte(__io__address + 8552);
		}
	}

	/**
	 * Set method for struct member 'node_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Node insert offset (aka auto-offset) margin, but might be useful for later stuff as well. </p>
	 * @see #__DNA__FIELD__node_margin
	 */
	
	public void setNode_margin(byte node_margin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8552, node_margin);
		} else {
			__io__block.writeByte(__io__address + 8552, node_margin);
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
			return new CArrayFacade<Byte>(__io__address + 8553, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8553, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 8553;
		} else {
			__dna__offset = 8553;
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
	 * Get method for struct member 'transopts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eUserpref_Translation_Flags . </p>
	 * @see #__DNA__FIELD__transopts
	 */
	
	public short getTransopts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8554);
		} else {
			return __io__block.readShort(__io__address + 8554);
		}
	}

	/**
	 * Set method for struct member 'transopts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eUserpref_Translation_Flags . </p>
	 * @see #__DNA__FIELD__transopts
	 */
	
	public void setTransopts(short transopts) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8554, transopts);
		} else {
			__io__block.writeShort(__io__address + 8554, transopts);
		}
	}

	/**
	 * Get method for struct member 'menuthreshold1'.
	 * @see #__DNA__FIELD__menuthreshold1
	 */
	
	public short getMenuthreshold1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8556);
		} else {
			return __io__block.readShort(__io__address + 8556);
		}
	}

	/**
	 * Set method for struct member 'menuthreshold1'.
	 * @see #__DNA__FIELD__menuthreshold1
	 */
	
	public void setMenuthreshold1(short menuthreshold1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8556, menuthreshold1);
		} else {
			__io__block.writeShort(__io__address + 8556, menuthreshold1);
		}
	}

	/**
	 * Get method for struct member 'menuthreshold2'.
	 * @see #__DNA__FIELD__menuthreshold2
	 */
	
	public short getMenuthreshold2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8558);
		} else {
			return __io__block.readShort(__io__address + 8558);
		}
	}

	/**
	 * Set method for struct member 'menuthreshold2'.
	 * @see #__DNA__FIELD__menuthreshold2
	 */
	
	public void setMenuthreshold2(short menuthreshold2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8558, menuthreshold2);
		} else {
			__io__block.writeShort(__io__address + 8558, menuthreshold2);
		}
	}

	/**
	 * Get method for struct member 'app_template'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Startup application template. </p>
	 * @see #__DNA__FIELD__app_template
	 */
	
	public CArrayFacade<Byte> getApp_template() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8560, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8560, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'app_template'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Startup application template. </p>
	 * @see #__DNA__FIELD__app_template
	 */
	
	public void setApp_template(CArrayFacade<Byte> app_template) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8560;
		} else {
			__dna__offset = 8560;
		}
		if (__io__equals(app_template, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, app_template)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, app_template);
		} else {
			__io__generic__copy( getApp_template(), app_template);
		}
	}

	/**
	 * Get method for struct member 'themes'.
	 * @see #__DNA__FIELD__themes
	 */
	
	public ListBase getThemes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8624, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8624, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'themes'.
	 * @see #__DNA__FIELD__themes
	 */
	
	public void setThemes(ListBase themes) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8624;
		} else {
			__dna__offset = 8624;
		}
		if (__io__equals(themes, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, themes)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, themes);
		} else {
			__io__generic__copy( getThemes(), themes);
		}
	}

	/**
	 * Get method for struct member 'uifonts'.
	 * @see #__DNA__FIELD__uifonts
	 */
	
	public ListBase getUifonts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8640, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8632, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uifonts'.
	 * @see #__DNA__FIELD__uifonts
	 */
	
	public void setUifonts(ListBase uifonts) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8640;
		} else {
			__dna__offset = 8632;
		}
		if (__io__equals(uifonts, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uifonts)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uifonts);
		} else {
			__io__generic__copy( getUifonts(), uifonts);
		}
	}

	/**
	 * Get method for struct member 'uistyles'.
	 * @see #__DNA__FIELD__uistyles
	 */
	
	public ListBase getUistyles() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8656, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8640, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uistyles'.
	 * @see #__DNA__FIELD__uistyles
	 */
	
	public void setUistyles(ListBase uistyles) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8656;
		} else {
			__dna__offset = 8640;
		}
		if (__io__equals(uistyles, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uistyles)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uistyles);
		} else {
			__io__generic__copy( getUistyles(), uistyles);
		}
	}

	/**
	 * Get method for struct member 'user_keymaps'.
	 * @see #__DNA__FIELD__user_keymaps
	 */
	
	public ListBase getUser_keymaps() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8672, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8648, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'user_keymaps'.
	 * @see #__DNA__FIELD__user_keymaps
	 */
	
	public void setUser_keymaps(ListBase user_keymaps) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8672;
		} else {
			__dna__offset = 8648;
		}
		if (__io__equals(user_keymaps, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, user_keymaps)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, user_keymaps);
		} else {
			__io__generic__copy( getUser_keymaps(), user_keymaps);
		}
	}

	/**
	 * Get method for struct member 'user_keyconfig_prefs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link wmKeyConfigPref} . </p>
	 * @see #__DNA__FIELD__user_keyconfig_prefs
	 */
	
	public ListBase getUser_keyconfig_prefs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8688, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8656, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'user_keyconfig_prefs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link wmKeyConfigPref} . </p>
	 * @see #__DNA__FIELD__user_keyconfig_prefs
	 */
	
	public void setUser_keyconfig_prefs(ListBase user_keyconfig_prefs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8688;
		} else {
			__dna__offset = 8656;
		}
		if (__io__equals(user_keyconfig_prefs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, user_keyconfig_prefs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, user_keyconfig_prefs);
		} else {
			__io__generic__copy( getUser_keyconfig_prefs(), user_keyconfig_prefs);
		}
	}

	/**
	 * Get method for struct member 'addons'.
	 * @see #__DNA__FIELD__addons
	 */
	
	public ListBase getAddons() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8704, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8664, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'addons'.
	 * @see #__DNA__FIELD__addons
	 */
	
	public void setAddons(ListBase addons) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8704;
		} else {
			__dna__offset = 8664;
		}
		if (__io__equals(addons, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, addons)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, addons);
		} else {
			__io__generic__copy( getAddons(), addons);
		}
	}

	/**
	 * Get method for struct member 'autoexec_paths'.
	 * @see #__DNA__FIELD__autoexec_paths
	 */
	
	public ListBase getAutoexec_paths() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8720, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8672, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'autoexec_paths'.
	 * @see #__DNA__FIELD__autoexec_paths
	 */
	
	public void setAutoexec_paths(ListBase autoexec_paths) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8720;
		} else {
			__dna__offset = 8672;
		}
		if (__io__equals(autoexec_paths, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, autoexec_paths)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, autoexec_paths);
		} else {
			__io__generic__copy( getAutoexec_paths(), autoexec_paths);
		}
	}

	/**
	 * Get method for struct member 'user_menus'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link bUserMenu} . </p>
	 * @see #__DNA__FIELD__user_menus
	 */
	
	public ListBase getUser_menus() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8736, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8680, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'user_menus'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link bUserMenu} . </p>
	 * @see #__DNA__FIELD__user_menus
	 */
	
	public void setUser_menus(ListBase user_menus) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8736;
		} else {
			__dna__offset = 8680;
		}
		if (__io__equals(user_menus, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, user_menus)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, user_menus);
		} else {
			__io__generic__copy( getUser_menus(), user_menus);
		}
	}

	/**
	 * Get method for struct member 'asset_libraries'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link bUserAssetLibrary}  </p>
	 * @see #__DNA__FIELD__asset_libraries
	 */
	
	public ListBase getAsset_libraries() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8752, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8688, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'asset_libraries'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link bUserAssetLibrary}  </p>
	 * @see #__DNA__FIELD__asset_libraries
	 */
	
	public void setAsset_libraries(ListBase asset_libraries) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8752;
		} else {
			__dna__offset = 8688;
		}
		if (__io__equals(asset_libraries, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, asset_libraries)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, asset_libraries);
		} else {
			__io__generic__copy( getAsset_libraries(), asset_libraries);
		}
	}

	/**
	 * Get method for struct member 'keyconfigstr'.
	 * @see #__DNA__FIELD__keyconfigstr
	 */
	
	public CArrayFacade<Byte> getKeyconfigstr() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8768, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8696, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'keyconfigstr'.
	 * @see #__DNA__FIELD__keyconfigstr
	 */
	
	public void setKeyconfigstr(CArrayFacade<Byte> keyconfigstr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8768;
		} else {
			__dna__offset = 8696;
		}
		if (__io__equals(keyconfigstr, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, keyconfigstr)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, keyconfigstr);
		} else {
			__io__generic__copy( getKeyconfigstr(), keyconfigstr);
		}
	}

	/**
	 * Get method for struct member 'undosteps'.
	 * @see #__DNA__FIELD__undosteps
	 */
	
	public short getUndosteps() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8832);
		} else {
			return __io__block.readShort(__io__address + 8760);
		}
	}

	/**
	 * Set method for struct member 'undosteps'.
	 * @see #__DNA__FIELD__undosteps
	 */
	
	public void setUndosteps(short undosteps) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8832, undosteps);
		} else {
			__io__block.writeShort(__io__address + 8760, undosteps);
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
			return new CArrayFacade<Byte>(__io__address + 8834, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8762, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 8834;
		} else {
			__dna__offset = 8762;
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
	 * Get method for struct member 'undomemory'.
	 * @see #__DNA__FIELD__undomemory
	 */
	
	public int getUndomemory() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8836);
		} else {
			return __io__block.readInt(__io__address + 8764);
		}
	}

	/**
	 * Set method for struct member 'undomemory'.
	 * @see #__DNA__FIELD__undomemory
	 */
	
	public void setUndomemory(int undomemory) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8836, undomemory);
		} else {
			__io__block.writeInt(__io__address + 8764, undomemory);
		}
	}

	/**
	 * Get method for struct member 'gpu_viewport_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__gpu_viewport_quality
	 */
	
	public float getGpu_viewport_quality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8840);
		} else {
			return __io__block.readFloat(__io__address + 8768);
		}
	}

	/**
	 * Set method for struct member 'gpu_viewport_quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__gpu_viewport_quality
	 */
	
	public void setGpu_viewport_quality(float gpu_viewport_quality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8840, gpu_viewport_quality);
		} else {
			__io__block.writeFloat(__io__address + 8768, gpu_viewport_quality);
		}
	}

	/**
	 * Get method for struct member 'gp_manhattendist'.
	 * @see #__DNA__FIELD__gp_manhattendist
	 */
	
	public short getGp_manhattendist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8844);
		} else {
			return __io__block.readShort(__io__address + 8772);
		}
	}

	/**
	 * Set method for struct member 'gp_manhattendist'.
	 * @see #__DNA__FIELD__gp_manhattendist
	 */
	
	public void setGp_manhattendist(short gp_manhattendist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8844, gp_manhattendist);
		} else {
			__io__block.writeShort(__io__address + 8772, gp_manhattendist);
		}
	}

	/**
	 * Get method for struct member 'gp_euclideandist'.
	 * @see #__DNA__FIELD__gp_euclideandist
	 */
	
	public short getGp_euclideandist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8846);
		} else {
			return __io__block.readShort(__io__address + 8774);
		}
	}

	/**
	 * Set method for struct member 'gp_euclideandist'.
	 * @see #__DNA__FIELD__gp_euclideandist
	 */
	
	public void setGp_euclideandist(short gp_euclideandist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8846, gp_euclideandist);
		} else {
			__io__block.writeShort(__io__address + 8774, gp_euclideandist);
		}
	}

	/**
	 * Get method for struct member 'gp_eraser'.
	 * @see #__DNA__FIELD__gp_eraser
	 */
	
	public short getGp_eraser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8848);
		} else {
			return __io__block.readShort(__io__address + 8776);
		}
	}

	/**
	 * Set method for struct member 'gp_eraser'.
	 * @see #__DNA__FIELD__gp_eraser
	 */
	
	public void setGp_eraser(short gp_eraser) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8848, gp_eraser);
		} else {
			__io__block.writeShort(__io__address + 8776, gp_eraser);
		}
	}

	/**
	 * Get method for struct member 'gp_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eGP_UserdefSettings . </p>
	 * @see #__DNA__FIELD__gp_settings
	 */
	
	public short getGp_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8850);
		} else {
			return __io__block.readShort(__io__address + 8778);
		}
	}

	/**
	 * Set method for struct member 'gp_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eGP_UserdefSettings . </p>
	 * @see #__DNA__FIELD__gp_settings
	 */
	
	public void setGp_settings(short gp_settings) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8850, gp_settings);
		} else {
			__io__block.writeShort(__io__address + 8778, gp_settings);
		}
	}

	/**
	 * Get method for struct member '_pad13'.
	 * @see #__DNA__FIELD___pad13
	 */
	
	public CArrayFacade<Byte> get_pad13() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8852, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8780, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad13'.
	 * @see #__DNA__FIELD___pad13
	 */
	
	public void set_pad13(CArrayFacade<Byte> _pad13) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8852;
		} else {
			__dna__offset = 8780;
		}
		if (__io__equals(_pad13, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad13)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad13);
		} else {
			__io__generic__copy( get_pad13(), _pad13);
		}
	}

	/**
	 * Get method for struct member 'light_param'.
	 * @see #__DNA__FIELD__light_param
	 */
	
	public CArrayFacade<SolidLight> getLight_param() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{SolidLight.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<SolidLight>(__io__address + 8856, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<SolidLight>(__io__address + 8784, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'light_param'.
	 * @see #__DNA__FIELD__light_param
	 */
	
	public void setLight_param(CArrayFacade<SolidLight> light_param) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8856;
		} else {
			__dna__offset = 8784;
		}
		if (__io__equals(light_param, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, light_param)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, light_param);
		} else {
			__io__generic__copy( getLight_param(), light_param);
		}
	}

	/**
	 * Get method for struct member 'light_ambient'.
	 * @see #__DNA__FIELD__light_ambient
	 */
	
	public CArrayFacade<Float> getLight_ambient() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 9112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 9040, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'light_ambient'.
	 * @see #__DNA__FIELD__light_ambient
	 */
	
	public void setLight_ambient(CArrayFacade<Float> light_ambient) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 9112;
		} else {
			__dna__offset = 9040;
		}
		if (__io__equals(light_ambient, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, light_ambient)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, light_ambient);
		} else {
			__io__generic__copy( getLight_ambient(), light_ambient);
		}
	}

	/**
	 * Get method for struct member 'gizmo_flag'.
	 * @see #__DNA__FIELD__gizmo_flag
	 */
	
	public byte getGizmo_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9124);
		} else {
			return __io__block.readByte(__io__address + 9052);
		}
	}

	/**
	 * Set method for struct member 'gizmo_flag'.
	 * @see #__DNA__FIELD__gizmo_flag
	 */
	
	public void setGizmo_flag(byte gizmo_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9124, gizmo_flag);
		} else {
			__io__block.writeByte(__io__address + 9052, gizmo_flag);
		}
	}

	/**
	 * Get method for struct member 'gizmo_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Generic gizmo size. </p>
	 * @see #__DNA__FIELD__gizmo_size
	 */
	
	public byte getGizmo_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9125);
		} else {
			return __io__block.readByte(__io__address + 9053);
		}
	}

	/**
	 * Set method for struct member 'gizmo_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Generic gizmo size. </p>
	 * @see #__DNA__FIELD__gizmo_size
	 */
	
	public void setGizmo_size(byte gizmo_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9125, gizmo_size);
		} else {
			__io__block.writeByte(__io__address + 9053, gizmo_size);
		}
	}

	/**
	 * Get method for struct member 'gizmo_size_navigate_v3d'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Navigate gizmo size. </p>
	 * @see #__DNA__FIELD__gizmo_size_navigate_v3d
	 */
	
	public byte getGizmo_size_navigate_v3d() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9126);
		} else {
			return __io__block.readByte(__io__address + 9054);
		}
	}

	/**
	 * Set method for struct member 'gizmo_size_navigate_v3d'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Navigate gizmo size. </p>
	 * @see #__DNA__FIELD__gizmo_size_navigate_v3d
	 */
	
	public void setGizmo_size_navigate_v3d(byte gizmo_size_navigate_v3d) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9126, gizmo_size_navigate_v3d);
		} else {
			__io__block.writeByte(__io__address + 9054, gizmo_size_navigate_v3d);
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
			5
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 9127, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 9055, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 9127;
		} else {
			__dna__offset = 9055;
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
	 * Get method for struct member 'edit_studio_light'.
	 * @see #__DNA__FIELD__edit_studio_light
	 */
	
	public short getEdit_studio_light() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9132);
		} else {
			return __io__block.readShort(__io__address + 9060);
		}
	}

	/**
	 * Set method for struct member 'edit_studio_light'.
	 * @see #__DNA__FIELD__edit_studio_light
	 */
	
	public void setEdit_studio_light(short edit_studio_light) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9132, edit_studio_light);
		} else {
			__io__block.writeShort(__io__address + 9060, edit_studio_light);
		}
	}

	/**
	 * Get method for struct member 'lookdev_sphere_size'.
	 * @see #__DNA__FIELD__lookdev_sphere_size
	 */
	
	public short getLookdev_sphere_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9134);
		} else {
			return __io__block.readShort(__io__address + 9062);
		}
	}

	/**
	 * Set method for struct member 'lookdev_sphere_size'.
	 * @see #__DNA__FIELD__lookdev_sphere_size
	 */
	
	public void setLookdev_sphere_size(short lookdev_sphere_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9134, lookdev_sphere_size);
		} else {
			__io__block.writeShort(__io__address + 9062, lookdev_sphere_size);
		}
	}

	/**
	 * Get method for struct member 'vbotimeout'.
	 * @see #__DNA__FIELD__vbotimeout
	 */
	
	public short getVbotimeout() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9136);
		} else {
			return __io__block.readShort(__io__address + 9064);
		}
	}

	/**
	 * Set method for struct member 'vbotimeout'.
	 * @see #__DNA__FIELD__vbotimeout
	 */
	
	public void setVbotimeout(short vbotimeout) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9136, vbotimeout);
		} else {
			__io__block.writeShort(__io__address + 9064, vbotimeout);
		}
	}

	/**
	 * Get method for struct member 'vbocollectrate'.
	 * @see #__DNA__FIELD__vbocollectrate
	 */
	
	public short getVbocollectrate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9138);
		} else {
			return __io__block.readShort(__io__address + 9066);
		}
	}

	/**
	 * Set method for struct member 'vbocollectrate'.
	 * @see #__DNA__FIELD__vbocollectrate
	 */
	
	public void setVbocollectrate(short vbocollectrate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9138, vbocollectrate);
		} else {
			__io__block.writeShort(__io__address + 9066, vbocollectrate);
		}
	}

	/**
	 * Get method for struct member 'textimeout'.
	 * @see #__DNA__FIELD__textimeout
	 */
	
	public short getTextimeout() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9140);
		} else {
			return __io__block.readShort(__io__address + 9068);
		}
	}

	/**
	 * Set method for struct member 'textimeout'.
	 * @see #__DNA__FIELD__textimeout
	 */
	
	public void setTextimeout(short textimeout) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9140, textimeout);
		} else {
			__io__block.writeShort(__io__address + 9068, textimeout);
		}
	}

	/**
	 * Get method for struct member 'texcollectrate'.
	 * @see #__DNA__FIELD__texcollectrate
	 */
	
	public short getTexcollectrate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9142);
		} else {
			return __io__block.readShort(__io__address + 9070);
		}
	}

	/**
	 * Set method for struct member 'texcollectrate'.
	 * @see #__DNA__FIELD__texcollectrate
	 */
	
	public void setTexcollectrate(short texcollectrate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9142, texcollectrate);
		} else {
			__io__block.writeShort(__io__address + 9070, texcollectrate);
		}
	}

	/**
	 * Get method for struct member 'memcachelimit'.
	 * @see #__DNA__FIELD__memcachelimit
	 */
	
	public int getMemcachelimit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 9144);
		} else {
			return __io__block.readInt(__io__address + 9072);
		}
	}

	/**
	 * Set method for struct member 'memcachelimit'.
	 * @see #__DNA__FIELD__memcachelimit
	 */
	
	public void setMemcachelimit(int memcachelimit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 9144, memcachelimit);
		} else {
			__io__block.writeInt(__io__address + 9072, memcachelimit);
		}
	}

	/**
	 * Get method for struct member 'prefetchframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD__prefetchframes
	 */
	
	public int getPrefetchframes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 9148);
		} else {
			return __io__block.readInt(__io__address + 9076);
		}
	}

	/**
	 * Set method for struct member 'prefetchframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD__prefetchframes
	 */
	
	public void setPrefetchframes(int prefetchframes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 9148, prefetchframes);
		} else {
			__io__block.writeInt(__io__address + 9076, prefetchframes);
		}
	}

	/**
	 * Get method for struct member 'pad_rot_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Control the rotation step of the view when PAD2, PAD4, PAD6&PAD8 is use. </p>
	 * @see #__DNA__FIELD__pad_rot_angle
	 */
	
	public float getPad_rot_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 9152);
		} else {
			return __io__block.readFloat(__io__address + 9080);
		}
	}

	/**
	 * Set method for struct member 'pad_rot_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Control the rotation step of the view when PAD2, PAD4, PAD6&PAD8 is use. </p>
	 * @see #__DNA__FIELD__pad_rot_angle
	 */
	
	public void setPad_rot_angle(float pad_rot_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 9152, pad_rot_angle);
		} else {
			__io__block.writeFloat(__io__address + 9080, pad_rot_angle);
		}
	}

	/**
	 * Get method for struct member '_pad12'.
	 * @see #__DNA__FIELD___pad12
	 */
	
	public CArrayFacade<Byte> get_pad12() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 9156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 9084, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad12'.
	 * @see #__DNA__FIELD___pad12
	 */
	
	public void set_pad12(CArrayFacade<Byte> _pad12) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 9156;
		} else {
			__dna__offset = 9084;
		}
		if (__io__equals(_pad12, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad12)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad12);
		} else {
			__io__generic__copy( get_pad12(), _pad12);
		}
	}

	/**
	 * Get method for struct member 'rvisize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rotating view icon size. </p>
	 * @see #__DNA__FIELD__rvisize
	 */
	
	public short getRvisize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9160);
		} else {
			return __io__block.readShort(__io__address + 9088);
		}
	}

	/**
	 * Set method for struct member 'rvisize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rotating view icon size. </p>
	 * @see #__DNA__FIELD__rvisize
	 */
	
	public void setRvisize(short rvisize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9160, rvisize);
		} else {
			__io__block.writeShort(__io__address + 9088, rvisize);
		}
	}

	/**
	 * Get method for struct member 'rvibright'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rotating view icon brightness. </p>
	 * @see #__DNA__FIELD__rvibright
	 */
	
	public short getRvibright() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9162);
		} else {
			return __io__block.readShort(__io__address + 9090);
		}
	}

	/**
	 * Set method for struct member 'rvibright'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rotating view icon brightness. </p>
	 * @see #__DNA__FIELD__rvibright
	 */
	
	public void setRvibright(short rvibright) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9162, rvibright);
		} else {
			__io__block.writeShort(__io__address + 9090, rvibright);
		}
	}

	/**
	 * Get method for struct member 'recent_files'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Maximum number of recently used files to remember. </p>
	 * @see #__DNA__FIELD__recent_files
	 */
	
	public short getRecent_files() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9164);
		} else {
			return __io__block.readShort(__io__address + 9092);
		}
	}

	/**
	 * Set method for struct member 'recent_files'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Maximum number of recently used files to remember. </p>
	 * @see #__DNA__FIELD__recent_files
	 */
	
	public void setRecent_files(short recent_files) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9164, recent_files);
		} else {
			__io__block.writeShort(__io__address + 9092, recent_files);
		}
	}

	/**
	 * Get method for struct member 'smooth_viewtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Milliseconds to spend spinning the view. </p>
	 * @see #__DNA__FIELD__smooth_viewtx
	 */
	
	public short getSmooth_viewtx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9166);
		} else {
			return __io__block.readShort(__io__address + 9094);
		}
	}

	/**
	 * Set method for struct member 'smooth_viewtx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Milliseconds to spend spinning the view. </p>
	 * @see #__DNA__FIELD__smooth_viewtx
	 */
	
	public void setSmooth_viewtx(short smooth_viewtx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9166, smooth_viewtx);
		} else {
			__io__block.writeShort(__io__address + 9094, smooth_viewtx);
		}
	}

	/**
	 * Get method for struct member 'glreslimit'.
	 * @see #__DNA__FIELD__glreslimit
	 */
	
	public short getGlreslimit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9168);
		} else {
			return __io__block.readShort(__io__address + 9096);
		}
	}

	/**
	 * Set method for struct member 'glreslimit'.
	 * @see #__DNA__FIELD__glreslimit
	 */
	
	public void setGlreslimit(short glreslimit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9168, glreslimit);
		} else {
			__io__block.writeShort(__io__address + 9096, glreslimit);
		}
	}

	/**
	 * Get method for struct member 'color_picker_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eColorPicker_Types . </p>
	 * @see #__DNA__FIELD__color_picker_type
	 */
	
	public short getColor_picker_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9170);
		} else {
			return __io__block.readShort(__io__address + 9098);
		}
	}

	/**
	 * Set method for struct member 'color_picker_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eColorPicker_Types . </p>
	 * @see #__DNA__FIELD__color_picker_type
	 */
	
	public void setColor_picker_type(short color_picker_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9170, color_picker_type);
		} else {
			__io__block.writeShort(__io__address + 9098, color_picker_type);
		}
	}

	/**
	 * Get method for struct member 'auto_smoothing_new'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Curve}  smoothing type for newly added F-Curves. </p>
	 * @see #__DNA__FIELD__auto_smoothing_new
	 */
	
	public byte getAuto_smoothing_new() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9172);
		} else {
			return __io__block.readByte(__io__address + 9100);
		}
	}

	/**
	 * Set method for struct member 'auto_smoothing_new'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Curve}  smoothing type for newly added F-Curves. </p>
	 * @see #__DNA__FIELD__auto_smoothing_new
	 */
	
	public void setAuto_smoothing_new(byte auto_smoothing_new) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9172, auto_smoothing_new);
		} else {
			__io__block.writeByte(__io__address + 9100, auto_smoothing_new);
		}
	}

	/**
	 * Get method for struct member 'ipo_new'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Interpolation mode for newly added F-Curves. </p>
	 * @see #__DNA__FIELD__ipo_new
	 */
	
	public byte getIpo_new() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9173);
		} else {
			return __io__block.readByte(__io__address + 9101);
		}
	}

	/**
	 * Set method for struct member 'ipo_new'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Interpolation mode for newly added F-Curves. </p>
	 * @see #__DNA__FIELD__ipo_new
	 */
	
	public void setIpo_new(byte ipo_new) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9173, ipo_new);
		} else {
			__io__block.writeByte(__io__address + 9101, ipo_new);
		}
	}

	/**
	 * Get method for struct member 'keyhandles_new'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Handle types for newly added keyframes. </p>
	 * @see #__DNA__FIELD__keyhandles_new
	 */
	
	public byte getKeyhandles_new() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9174);
		} else {
			return __io__block.readByte(__io__address + 9102);
		}
	}

	/**
	 * Set method for struct member 'keyhandles_new'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Handle types for newly added keyframes. </p>
	 * @see #__DNA__FIELD__keyhandles_new
	 */
	
	public void setKeyhandles_new(byte keyhandles_new) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9174, keyhandles_new);
		} else {
			__io__block.writeByte(__io__address + 9102, keyhandles_new);
		}
	}

	/**
	 * Get method for struct member '_pad11'.
	 * @see #__DNA__FIELD___pad11
	 */
	
	public CArrayFacade<Byte> get_pad11() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 9175, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 9103, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad11'.
	 * @see #__DNA__FIELD___pad11
	 */
	
	public void set_pad11(CArrayFacade<Byte> _pad11) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 9175;
		} else {
			__dna__offset = 9103;
		}
		if (__io__equals(_pad11, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad11)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad11);
		} else {
			__io__generic__copy( get_pad11(), _pad11);
		}
	}

	/**
	 * Get method for struct member 'view_frame_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eZoomFrame_Mode . </p>
	 * @see #__DNA__FIELD__view_frame_type
	 */
	
	public byte getView_frame_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9179);
		} else {
			return __io__block.readByte(__io__address + 9107);
		}
	}

	/**
	 * Set method for struct member 'view_frame_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eZoomFrame_Mode . </p>
	 * @see #__DNA__FIELD__view_frame_type
	 */
	
	public void setView_frame_type(byte view_frame_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9179, view_frame_type);
		} else {
			__io__block.writeByte(__io__address + 9107, view_frame_type);
		}
	}

	/**
	 * Get method for struct member 'view_frame_keyframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of keyframes to zoom around current frame. </p>
	 * @see #__DNA__FIELD__view_frame_keyframes
	 */
	
	public int getView_frame_keyframes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 9180);
		} else {
			return __io__block.readInt(__io__address + 9108);
		}
	}

	/**
	 * Set method for struct member 'view_frame_keyframes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of keyframes to zoom around current frame. </p>
	 * @see #__DNA__FIELD__view_frame_keyframes
	 */
	
	public void setView_frame_keyframes(int view_frame_keyframes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 9180, view_frame_keyframes);
		} else {
			__io__block.writeInt(__io__address + 9108, view_frame_keyframes);
		}
	}

	/**
	 * Get method for struct member 'view_frame_seconds'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Seconds to zoom around current frame. </p>
	 * @see #__DNA__FIELD__view_frame_seconds
	 */
	
	public float getView_frame_seconds() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 9184);
		} else {
			return __io__block.readFloat(__io__address + 9112);
		}
	}

	/**
	 * Set method for struct member 'view_frame_seconds'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Seconds to zoom around current frame. </p>
	 * @see #__DNA__FIELD__view_frame_seconds
	 */
	
	public void setView_frame_seconds(float view_frame_seconds) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 9184, view_frame_seconds);
		} else {
			__io__block.writeFloat(__io__address + 9112, view_frame_seconds);
		}
	}

	/**
	 * Get method for struct member '_pad7'.
	 * @see #__DNA__FIELD___pad7
	 */
	
	public CArrayFacade<Byte> get_pad7() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 9188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 9116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad7'.
	 * @see #__DNA__FIELD___pad7
	 */
	
	public void set_pad7(CArrayFacade<Byte> _pad7) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 9188;
		} else {
			__dna__offset = 9116;
		}
		if (__io__equals(_pad7, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad7)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad7);
		} else {
			__io__generic__copy( get_pad7(), _pad7);
		}
	}

	/**
	 * Get method for struct member 'widget_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Private, defaults to 20 for 72 DPI setting. </p>
	 * @see #__DNA__FIELD__widget_unit
	 */
	
	public short getWidget_unit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9194);
		} else {
			return __io__block.readShort(__io__address + 9122);
		}
	}

	/**
	 * Set method for struct member 'widget_unit'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Private, defaults to 20 for 72 DPI setting. </p>
	 * @see #__DNA__FIELD__widget_unit
	 */
	
	public void setWidget_unit(short widget_unit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9194, widget_unit);
		} else {
			__io__block.writeShort(__io__address + 9122, widget_unit);
		}
	}

	/**
	 * Get method for struct member 'anisotropic_filter'.
	 * @see #__DNA__FIELD__anisotropic_filter
	 */
	
	public short getAnisotropic_filter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9196);
		} else {
			return __io__block.readShort(__io__address + 9124);
		}
	}

	/**
	 * Set method for struct member 'anisotropic_filter'.
	 * @see #__DNA__FIELD__anisotropic_filter
	 */
	
	public void setAnisotropic_filter(short anisotropic_filter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9196, anisotropic_filter);
		} else {
			__io__block.writeShort(__io__address + 9124, anisotropic_filter);
		}
	}

	/**
	 * Get method for struct member 'tablet_api'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tablet API to use (Windows only). </p>
	 * @see #__DNA__FIELD__tablet_api
	 */
	
	public short getTablet_api() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9198);
		} else {
			return __io__block.readShort(__io__address + 9126);
		}
	}

	/**
	 * Set method for struct member 'tablet_api'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tablet API to use (Windows only). </p>
	 * @see #__DNA__FIELD__tablet_api
	 */
	
	public void setTablet_api(short tablet_api) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9198, tablet_api);
		} else {
			__io__block.writeShort(__io__address + 9126, tablet_api);
		}
	}

	/**
	 * Get method for struct member 'pressure_threshold_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Raw tablet pressure that maps to 100%. </p>
	 * @see #__DNA__FIELD__pressure_threshold_max
	 */
	
	public float getPressure_threshold_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 9200);
		} else {
			return __io__block.readFloat(__io__address + 9128);
		}
	}

	/**
	 * Set method for struct member 'pressure_threshold_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Raw tablet pressure that maps to 100%. </p>
	 * @see #__DNA__FIELD__pressure_threshold_max
	 */
	
	public void setPressure_threshold_max(float pressure_threshold_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 9200, pressure_threshold_max);
		} else {
			__io__block.writeFloat(__io__address + 9128, pressure_threshold_max);
		}
	}

	/**
	 * Get method for struct member 'pressure_softness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Curve}  non-linearity parameter. </p>
	 * @see #__DNA__FIELD__pressure_softness
	 */
	
	public float getPressure_softness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 9204);
		} else {
			return __io__block.readFloat(__io__address + 9132);
		}
	}

	/**
	 * Set method for struct member 'pressure_softness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Curve}  non-linearity parameter. </p>
	 * @see #__DNA__FIELD__pressure_softness
	 */
	
	public void setPressure_softness(float pressure_softness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 9204, pressure_softness);
		} else {
			__io__block.writeFloat(__io__address + 9132, pressure_softness);
		}
	}

	/**
	 * Get method for struct member 'ndof_sensitivity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Overall sensitivity of 3D mouse. </p>
	 * @see #__DNA__FIELD__ndof_sensitivity
	 */
	
	public float getNdof_sensitivity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 9208);
		} else {
			return __io__block.readFloat(__io__address + 9136);
		}
	}

	/**
	 * Set method for struct member 'ndof_sensitivity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Overall sensitivity of 3D mouse. </p>
	 * @see #__DNA__FIELD__ndof_sensitivity
	 */
	
	public void setNdof_sensitivity(float ndof_sensitivity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 9208, ndof_sensitivity);
		} else {
			__io__block.writeFloat(__io__address + 9136, ndof_sensitivity);
		}
	}

	/**
	 * Get method for struct member 'ndof_orbit_sensitivity'.
	 * @see #__DNA__FIELD__ndof_orbit_sensitivity
	 */
	
	public float getNdof_orbit_sensitivity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 9212);
		} else {
			return __io__block.readFloat(__io__address + 9140);
		}
	}

	/**
	 * Set method for struct member 'ndof_orbit_sensitivity'.
	 * @see #__DNA__FIELD__ndof_orbit_sensitivity
	 */
	
	public void setNdof_orbit_sensitivity(float ndof_orbit_sensitivity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 9212, ndof_orbit_sensitivity);
		} else {
			__io__block.writeFloat(__io__address + 9140, ndof_orbit_sensitivity);
		}
	}

	/**
	 * Get method for struct member 'ndof_deadzone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dead-zone of 3D mouse. </p>
	 * @see #__DNA__FIELD__ndof_deadzone
	 */
	
	public float getNdof_deadzone() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 9216);
		} else {
			return __io__block.readFloat(__io__address + 9144);
		}
	}

	/**
	 * Set method for struct member 'ndof_deadzone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dead-zone of 3D mouse. </p>
	 * @see #__DNA__FIELD__ndof_deadzone
	 */
	
	public void setNdof_deadzone(float ndof_deadzone) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 9216, ndof_deadzone);
		} else {
			__io__block.writeFloat(__io__address + 9144, ndof_deadzone);
		}
	}

	/**
	 * Get method for struct member 'ndof_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eNdof_Flag , flags for 3D mouse. </p>
	 * @see #__DNA__FIELD__ndof_flag
	 */
	
	public int getNdof_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 9220);
		} else {
			return __io__block.readInt(__io__address + 9148);
		}
	}

	/**
	 * Set method for struct member 'ndof_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eNdof_Flag , flags for 3D mouse. </p>
	 * @see #__DNA__FIELD__ndof_flag
	 */
	
	public void setNdof_flag(int ndof_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 9220, ndof_flag);
		} else {
			__io__block.writeInt(__io__address + 9148, ndof_flag);
		}
	}

	/**
	 * Get method for struct member 'ogl_multisamples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eMultiSample_Type , amount of samples for OpenGL FSA, if zero no FSA. </p>
	 * @see #__DNA__FIELD__ogl_multisamples
	 */
	
	public short getOgl_multisamples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9224);
		} else {
			return __io__block.readShort(__io__address + 9152);
		}
	}

	/**
	 * Set method for struct member 'ogl_multisamples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eMultiSample_Type , amount of samples for OpenGL FSA, if zero no FSA. </p>
	 * @see #__DNA__FIELD__ogl_multisamples
	 */
	
	public void setOgl_multisamples(short ogl_multisamples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9224, ogl_multisamples);
		} else {
			__io__block.writeShort(__io__address + 9152, ogl_multisamples);
		}
	}

	/**
	 * Get method for struct member 'image_draw_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eImageDrawMethod, Method to be used to draw the images (AUTO, GLSL, Textures or DrawPixels) </p>
	 * @see #__DNA__FIELD__image_draw_method
	 */
	
	public short getImage_draw_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9226);
		} else {
			return __io__block.readShort(__io__address + 9154);
		}
	}

	/**
	 * Set method for struct member 'image_draw_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eImageDrawMethod, Method to be used to draw the images (AUTO, GLSL, Textures or DrawPixels) </p>
	 * @see #__DNA__FIELD__image_draw_method
	 */
	
	public void setImage_draw_method(short image_draw_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9226, image_draw_method);
		} else {
			__io__block.writeShort(__io__address + 9154, image_draw_method);
		}
	}

	/**
	 * Get method for struct member 'glalphaclip'.
	 * @see #__DNA__FIELD__glalphaclip
	 */
	
	public float getGlalphaclip() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 9228);
		} else {
			return __io__block.readFloat(__io__address + 9156);
		}
	}

	/**
	 * Set method for struct member 'glalphaclip'.
	 * @see #__DNA__FIELD__glalphaclip
	 */
	
	public void setGlalphaclip(float glalphaclip) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 9228, glalphaclip);
		} else {
			__io__block.writeFloat(__io__address + 9156, glalphaclip);
		}
	}

	/**
	 * Get method for struct member 'autokey_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eAutokey_Mode , autokeying mode. </p>
	 * @see #__DNA__FIELD__autokey_mode
	 */
	
	public short getAutokey_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9232);
		} else {
			return __io__block.readShort(__io__address + 9160);
		}
	}

	/**
	 * Set method for struct member 'autokey_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>eAutokey_Mode , autokeying mode. </p>
	 * @see #__DNA__FIELD__autokey_mode
	 */
	
	public void setAutokey_mode(short autokey_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9232, autokey_mode);
		} else {
			__io__block.writeShort(__io__address + 9160, autokey_mode);
		}
	}

	/**
	 * Get method for struct member 'autokey_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for autokeying. </p>
	 * @see #__DNA__FIELD__autokey_flag
	 */
	
	public short getAutokey_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9234);
		} else {
			return __io__block.readShort(__io__address + 9162);
		}
	}

	/**
	 * Set method for struct member 'autokey_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for autokeying. </p>
	 * @see #__DNA__FIELD__autokey_flag
	 */
	
	public void setAutokey_flag(short autokey_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9234, autokey_flag);
		} else {
			__io__block.writeShort(__io__address + 9162, autokey_flag);
		}
	}

	/**
	 * Get method for struct member 'animation_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for animation. </p>
	 * @see #__DNA__FIELD__animation_flag
	 */
	
	public short getAnimation_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 9236);
		} else {
			return __io__block.readShort(__io__address + 9164);
		}
	}

	/**
	 * Set method for struct member 'animation_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for animation. </p>
	 * @see #__DNA__FIELD__animation_flag
	 */
	
	public void setAnimation_flag(short animation_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 9236, animation_flag);
		} else {
			__io__block.writeShort(__io__address + 9164, animation_flag);
		}
	}

	/**
	 * Get method for struct member 'text_render'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Options for text rendering. </p>
	 * @see #__DNA__FIELD__text_render
	 */
	
	public byte getText_render() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9238);
		} else {
			return __io__block.readByte(__io__address + 9166);
		}
	}

	/**
	 * Set method for struct member 'text_render'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Options for text rendering. </p>
	 * @see #__DNA__FIELD__text_render
	 */
	
	public void setText_render(byte text_render) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9238, text_render);
		} else {
			__io__block.writeByte(__io__address + 9166, text_render);
		}
	}

	/**
	 * Get method for struct member 'navigation_mode'.
	 * @see #__DNA__FIELD__navigation_mode
	 */
	
	public byte getNavigation_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9239);
		} else {
			return __io__block.readByte(__io__address + 9167);
		}
	}

	/**
	 * Set method for struct member 'navigation_mode'.
	 * @see #__DNA__FIELD__navigation_mode
	 */
	
	public void setNavigation_mode(byte navigation_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9239, navigation_mode);
		} else {
			__io__block.writeByte(__io__address + 9167, navigation_mode);
		}
	}

	/**
	 * Get method for struct member 'view_rotate_sensitivity_turntable'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Turn-table rotation amount per-pixel in radians. Scaled with DPI. </p>
	 * @see #__DNA__FIELD__view_rotate_sensitivity_turntable
	 */
	
	public float getView_rotate_sensitivity_turntable() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 9240);
		} else {
			return __io__block.readFloat(__io__address + 9168);
		}
	}

	/**
	 * Set method for struct member 'view_rotate_sensitivity_turntable'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Turn-table rotation amount per-pixel in radians. Scaled with DPI. </p>
	 * @see #__DNA__FIELD__view_rotate_sensitivity_turntable
	 */
	
	public void setView_rotate_sensitivity_turntable(float view_rotate_sensitivity_turntable) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 9240, view_rotate_sensitivity_turntable);
		} else {
			__io__block.writeFloat(__io__address + 9168, view_rotate_sensitivity_turntable);
		}
	}

	/**
	 * Get method for struct member 'view_rotate_sensitivity_trackball'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Track-ball rotation scale. </p>
	 * @see #__DNA__FIELD__view_rotate_sensitivity_trackball
	 */
	
	public float getView_rotate_sensitivity_trackball() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 9244);
		} else {
			return __io__block.readFloat(__io__address + 9172);
		}
	}

	/**
	 * Set method for struct member 'view_rotate_sensitivity_trackball'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Track-ball rotation scale. </p>
	 * @see #__DNA__FIELD__view_rotate_sensitivity_trackball
	 */
	
	public void setView_rotate_sensitivity_trackball(float view_rotate_sensitivity_trackball) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 9244, view_rotate_sensitivity_trackball);
		} else {
			__io__block.writeFloat(__io__address + 9172, view_rotate_sensitivity_trackball);
		}
	}

	/**
	 * Get method for struct member 'coba_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> From texture.h. </p>
	 * @see #__DNA__FIELD__coba_weight
	 */
	
	public ColorBand getCoba_weight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorBand(__io__address + 9248, __io__block, __io__blockTable);
		} else {
			return new ColorBand(__io__address + 9176, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'coba_weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> From texture.h. </p>
	 * @see #__DNA__FIELD__coba_weight
	 */
	
	public void setCoba_weight(ColorBand coba_weight) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 9248;
		} else {
			__dna__offset = 9176;
		}
		if (__io__equals(coba_weight, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, coba_weight)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, coba_weight);
		} else {
			__io__generic__copy( getCoba_weight(), coba_weight);
		}
	}

	/**
	 * Get method for struct member 'sculpt_paint_overlay_col'.
	 * @see #__DNA__FIELD__sculpt_paint_overlay_col
	 */
	
	public CArrayFacade<Float> getSculpt_paint_overlay_col() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 10024, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 9952, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sculpt_paint_overlay_col'.
	 * @see #__DNA__FIELD__sculpt_paint_overlay_col
	 */
	
	public void setSculpt_paint_overlay_col(CArrayFacade<Float> sculpt_paint_overlay_col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 10024;
		} else {
			__dna__offset = 9952;
		}
		if (__io__equals(sculpt_paint_overlay_col, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sculpt_paint_overlay_col)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sculpt_paint_overlay_col);
		} else {
			__io__generic__copy( getSculpt_paint_overlay_col(), sculpt_paint_overlay_col);
		}
	}

	/**
	 * Get method for struct member 'gpencil_new_layer_col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default color for newly created Grease Pencil layers. </p>
	 * @see #__DNA__FIELD__gpencil_new_layer_col
	 */
	
	public CArrayFacade<Float> getGpencil_new_layer_col() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 10036, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 9964, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gpencil_new_layer_col'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default color for newly created Grease Pencil layers. </p>
	 * @see #__DNA__FIELD__gpencil_new_layer_col
	 */
	
	public void setGpencil_new_layer_col(CArrayFacade<Float> gpencil_new_layer_col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 10036;
		} else {
			__dna__offset = 9964;
		}
		if (__io__equals(gpencil_new_layer_col, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gpencil_new_layer_col)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gpencil_new_layer_col);
		} else {
			__io__generic__copy( getGpencil_new_layer_col(), gpencil_new_layer_col);
		}
	}

	/**
	 * Get method for struct member 'drag_threshold_mouse'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Drag pixels (scaled by DPI). </p>
	 * @see #__DNA__FIELD__drag_threshold_mouse
	 */
	
	public byte getDrag_threshold_mouse() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 10052);
		} else {
			return __io__block.readByte(__io__address + 9980);
		}
	}

	/**
	 * Set method for struct member 'drag_threshold_mouse'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Drag pixels (scaled by DPI). </p>
	 * @see #__DNA__FIELD__drag_threshold_mouse
	 */
	
	public void setDrag_threshold_mouse(byte drag_threshold_mouse) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 10052, drag_threshold_mouse);
		} else {
			__io__block.writeByte(__io__address + 9980, drag_threshold_mouse);
		}
	}

	/**
	 * Get method for struct member 'drag_threshold_tablet'.
	 * @see #__DNA__FIELD__drag_threshold_tablet
	 */
	
	public byte getDrag_threshold_tablet() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 10053);
		} else {
			return __io__block.readByte(__io__address + 9981);
		}
	}

	/**
	 * Set method for struct member 'drag_threshold_tablet'.
	 * @see #__DNA__FIELD__drag_threshold_tablet
	 */
	
	public void setDrag_threshold_tablet(byte drag_threshold_tablet) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 10053, drag_threshold_tablet);
		} else {
			__io__block.writeByte(__io__address + 9981, drag_threshold_tablet);
		}
	}

	/**
	 * Get method for struct member 'drag_threshold'.
	 * @see #__DNA__FIELD__drag_threshold
	 */
	
	public byte getDrag_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 10054);
		} else {
			return __io__block.readByte(__io__address + 9982);
		}
	}

	/**
	 * Set method for struct member 'drag_threshold'.
	 * @see #__DNA__FIELD__drag_threshold
	 */
	
	public void setDrag_threshold(byte drag_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 10054, drag_threshold);
		} else {
			__io__block.writeByte(__io__address + 9982, drag_threshold);
		}
	}

	/**
	 * Get method for struct member 'move_threshold'.
	 * @see #__DNA__FIELD__move_threshold
	 */
	
	public byte getMove_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 10055);
		} else {
			return __io__block.readByte(__io__address + 9983);
		}
	}

	/**
	 * Set method for struct member 'move_threshold'.
	 * @see #__DNA__FIELD__move_threshold
	 */
	
	public void setMove_threshold(byte move_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 10055, move_threshold);
		} else {
			__io__block.writeByte(__io__address + 9983, move_threshold);
		}
	}

	/**
	 * Get method for struct member 'font_path_ui'.
	 * @see #__DNA__FIELD__font_path_ui
	 */
	
	public CArrayFacade<Byte> getFont_path_ui() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 10056, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 9984, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'font_path_ui'.
	 * @see #__DNA__FIELD__font_path_ui
	 */
	
	public void setFont_path_ui(CArrayFacade<Byte> font_path_ui) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 10056;
		} else {
			__dna__offset = 9984;
		}
		if (__io__equals(font_path_ui, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, font_path_ui)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, font_path_ui);
		} else {
			__io__generic__copy( getFont_path_ui(), font_path_ui);
		}
	}

	/**
	 * Get method for struct member 'font_path_ui_mono'.
	 * @see #__DNA__FIELD__font_path_ui_mono
	 */
	
	public CArrayFacade<Byte> getFont_path_ui_mono() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 11080, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 11008, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'font_path_ui_mono'.
	 * @see #__DNA__FIELD__font_path_ui_mono
	 */
	
	public void setFont_path_ui_mono(CArrayFacade<Byte> font_path_ui_mono) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 11080;
		} else {
			__dna__offset = 11008;
		}
		if (__io__equals(font_path_ui_mono, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, font_path_ui_mono)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, font_path_ui_mono);
		} else {
			__io__generic__copy( getFont_path_ui_mono(), font_path_ui_mono);
		}
	}

	/**
	 * Get method for struct member 'compute_device_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Legacy, for backwards compatibility only. </p>
	 * @see #__DNA__FIELD__compute_device_type
	 */
	
	public int getCompute_device_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12104);
		} else {
			return __io__block.readInt(__io__address + 12032);
		}
	}

	/**
	 * Set method for struct member 'compute_device_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Legacy, for backwards compatibility only. </p>
	 * @see #__DNA__FIELD__compute_device_type
	 */
	
	public void setCompute_device_type(int compute_device_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12104, compute_device_type);
		} else {
			__io__block.writeInt(__io__address + 12032, compute_device_type);
		}
	}

	/**
	 * Get method for struct member 'fcu_inactive_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Opacity of inactive F-Curves in F-Curve Editor. </p>
	 * @see #__DNA__FIELD__fcu_inactive_alpha
	 */
	
	public float getFcu_inactive_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12108);
		} else {
			return __io__block.readFloat(__io__address + 12036);
		}
	}

	/**
	 * Set method for struct member 'fcu_inactive_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Opacity of inactive F-Curves in F-Curve Editor. </p>
	 * @see #__DNA__FIELD__fcu_inactive_alpha
	 */
	
	public void setFcu_inactive_alpha(float fcu_inactive_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12108, fcu_inactive_alpha);
		} else {
			__io__block.writeFloat(__io__address + 12036, fcu_inactive_alpha);
		}
	}

	/**
	 * Get method for struct member 'pie_tap_timeout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If keeping a pie menu spawn button pressed after this time, it turns into a drag/release pie menu. </p>
	 * @see #__DNA__FIELD__pie_tap_timeout
	 */
	
	public short getPie_tap_timeout() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12112);
		} else {
			return __io__block.readShort(__io__address + 12040);
		}
	}

	/**
	 * Set method for struct member 'pie_tap_timeout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If keeping a pie menu spawn button pressed after this time, it turns into a drag/release pie menu. </p>
	 * @see #__DNA__FIELD__pie_tap_timeout
	 */
	
	public void setPie_tap_timeout(short pie_tap_timeout) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12112, pie_tap_timeout);
		} else {
			__io__block.writeShort(__io__address + 12040, pie_tap_timeout);
		}
	}

	/**
	 * Get method for struct member 'pie_initial_timeout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Direction in the pie menu will always be calculated from the initial position within this time limit. </p>
	 * @see #__DNA__FIELD__pie_initial_timeout
	 */
	
	public short getPie_initial_timeout() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12114);
		} else {
			return __io__block.readShort(__io__address + 12042);
		}
	}

	/**
	 * Set method for struct member 'pie_initial_timeout'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Direction in the pie menu will always be calculated from the initial position within this time limit. </p>
	 * @see #__DNA__FIELD__pie_initial_timeout
	 */
	
	public void setPie_initial_timeout(short pie_initial_timeout) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12114, pie_initial_timeout);
		} else {
			__io__block.writeShort(__io__address + 12042, pie_initial_timeout);
		}
	}

	/**
	 * Get method for struct member 'pie_animation_timeout'.
	 * @see #__DNA__FIELD__pie_animation_timeout
	 */
	
	public short getPie_animation_timeout() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12116);
		} else {
			return __io__block.readShort(__io__address + 12044);
		}
	}

	/**
	 * Set method for struct member 'pie_animation_timeout'.
	 * @see #__DNA__FIELD__pie_animation_timeout
	 */
	
	public void setPie_animation_timeout(short pie_animation_timeout) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12116, pie_animation_timeout);
		} else {
			__io__block.writeShort(__io__address + 12044, pie_animation_timeout);
		}
	}

	/**
	 * Get method for struct member 'pie_menu_confirm'.
	 * @see #__DNA__FIELD__pie_menu_confirm
	 */
	
	public short getPie_menu_confirm() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12118);
		} else {
			return __io__block.readShort(__io__address + 12046);
		}
	}

	/**
	 * Set method for struct member 'pie_menu_confirm'.
	 * @see #__DNA__FIELD__pie_menu_confirm
	 */
	
	public void setPie_menu_confirm(short pie_menu_confirm) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12118, pie_menu_confirm);
		} else {
			__io__block.writeShort(__io__address + 12046, pie_menu_confirm);
		}
	}

	/**
	 * Get method for struct member 'pie_menu_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pie menu radius. </p>
	 * @see #__DNA__FIELD__pie_menu_radius
	 */
	
	public short getPie_menu_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12120);
		} else {
			return __io__block.readShort(__io__address + 12048);
		}
	}

	/**
	 * Set method for struct member 'pie_menu_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pie menu radius. </p>
	 * @see #__DNA__FIELD__pie_menu_radius
	 */
	
	public void setPie_menu_radius(short pie_menu_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12120, pie_menu_radius);
		} else {
			__io__block.writeShort(__io__address + 12048, pie_menu_radius);
		}
	}

	/**
	 * Get method for struct member 'pie_menu_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pie menu distance from center before a direction is set. </p>
	 * @see #__DNA__FIELD__pie_menu_threshold
	 */
	
	public short getPie_menu_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12122);
		} else {
			return __io__block.readShort(__io__address + 12050);
		}
	}

	/**
	 * Set method for struct member 'pie_menu_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pie menu distance from center before a direction is set. </p>
	 * @see #__DNA__FIELD__pie_menu_threshold
	 */
	
	public void setPie_menu_threshold(short pie_menu_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12122, pie_menu_threshold);
		} else {
			__io__block.writeShort(__io__address + 12050, pie_menu_threshold);
		}
	}

	/**
	 * Get method for struct member 'opensubdiv_compute_type'.
	 * @see #__DNA__FIELD__opensubdiv_compute_type
	 */
	
	public short getOpensubdiv_compute_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12124);
		} else {
			return __io__block.readShort(__io__address + 12052);
		}
	}

	/**
	 * Set method for struct member 'opensubdiv_compute_type'.
	 * @see #__DNA__FIELD__opensubdiv_compute_type
	 */
	
	public void setOpensubdiv_compute_type(short opensubdiv_compute_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12124, opensubdiv_compute_type);
		} else {
			__io__block.writeShort(__io__address + 12052, opensubdiv_compute_type);
		}
	}

	/**
	 * Get method for struct member '_pad6'.
	 * @see #__DNA__FIELD___pad6
	 */
	
	public short get_pad6() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12126);
		} else {
			return __io__block.readShort(__io__address + 12054);
		}
	}

	/**
	 * Set method for struct member '_pad6'.
	 * @see #__DNA__FIELD___pad6
	 */
	
	public void set_pad6(short _pad6) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12126, _pad6);
		} else {
			__io__block.writeShort(__io__address + 12054, _pad6);
		}
	}

	/**
	 * Get method for struct member 'factor_display_type'.
	 * @see #__DNA__FIELD__factor_display_type
	 */
	
	public byte getFactor_display_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 12128);
		} else {
			return __io__block.readByte(__io__address + 12056);
		}
	}

	/**
	 * Set method for struct member 'factor_display_type'.
	 * @see #__DNA__FIELD__factor_display_type
	 */
	
	public void setFactor_display_type(byte factor_display_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 12128, factor_display_type);
		} else {
			__io__block.writeByte(__io__address + 12056, factor_display_type);
		}
	}

	/**
	 * Get method for struct member 'viewport_aa'.
	 * @see #__DNA__FIELD__viewport_aa
	 */
	
	public byte getViewport_aa() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 12129);
		} else {
			return __io__block.readByte(__io__address + 12057);
		}
	}

	/**
	 * Set method for struct member 'viewport_aa'.
	 * @see #__DNA__FIELD__viewport_aa
	 */
	
	public void setViewport_aa(byte viewport_aa) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 12129, viewport_aa);
		} else {
			__io__block.writeByte(__io__address + 12057, viewport_aa);
		}
	}

	/**
	 * Get method for struct member 'render_display_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_RenderDisplayType </p>
	 * @see #__DNA__FIELD__render_display_type
	 */
	
	public byte getRender_display_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 12130);
		} else {
			return __io__block.readByte(__io__address + 12058);
		}
	}

	/**
	 * Set method for struct member 'render_display_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_RenderDisplayType </p>
	 * @see #__DNA__FIELD__render_display_type
	 */
	
	public void setRender_display_type(byte render_display_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 12130, render_display_type);
		} else {
			__io__block.writeByte(__io__address + 12058, render_display_type);
		}
	}

	/**
	 * Get method for struct member 'filebrowser_display_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_TempSpaceDisplayType </p>
	 * @see #__DNA__FIELD__filebrowser_display_type
	 */
	
	public byte getFilebrowser_display_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 12131);
		} else {
			return __io__block.readByte(__io__address + 12059);
		}
	}

	/**
	 * Set method for struct member 'filebrowser_display_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_TempSpaceDisplayType </p>
	 * @see #__DNA__FIELD__filebrowser_display_type
	 */
	
	public void setFilebrowser_display_type(byte filebrowser_display_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 12131, filebrowser_display_type);
		} else {
			__io__block.writeByte(__io__address + 12059, filebrowser_display_type);
		}
	}

	/**
	 * Get method for struct member 'sequencer_disk_cache_dir'.
	 * @see #__DNA__FIELD__sequencer_disk_cache_dir
	 */
	
	public CArrayFacade<Byte> getSequencer_disk_cache_dir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 12132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 12060, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sequencer_disk_cache_dir'.
	 * @see #__DNA__FIELD__sequencer_disk_cache_dir
	 */
	
	public void setSequencer_disk_cache_dir(CArrayFacade<Byte> sequencer_disk_cache_dir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12132;
		} else {
			__dna__offset = 12060;
		}
		if (__io__equals(sequencer_disk_cache_dir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sequencer_disk_cache_dir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sequencer_disk_cache_dir);
		} else {
			__io__generic__copy( getSequencer_disk_cache_dir(), sequencer_disk_cache_dir);
		}
	}

	/**
	 * Get method for struct member 'sequencer_disk_cache_compression'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_DiskCacheCompression </p>
	 * @see #__DNA__FIELD__sequencer_disk_cache_compression
	 */
	
	public int getSequencer_disk_cache_compression() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 13156);
		} else {
			return __io__block.readInt(__io__address + 13084);
		}
	}

	/**
	 * Set method for struct member 'sequencer_disk_cache_compression'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_DiskCacheCompression </p>
	 * @see #__DNA__FIELD__sequencer_disk_cache_compression
	 */
	
	public void setSequencer_disk_cache_compression(int sequencer_disk_cache_compression) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 13156, sequencer_disk_cache_compression);
		} else {
			__io__block.writeInt(__io__address + 13084, sequencer_disk_cache_compression);
		}
	}

	/**
	 * Get method for struct member 'sequencer_disk_cache_size_limit'.
	 * @see #__DNA__FIELD__sequencer_disk_cache_size_limit
	 */
	
	public int getSequencer_disk_cache_size_limit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 13160);
		} else {
			return __io__block.readInt(__io__address + 13088);
		}
	}

	/**
	 * Set method for struct member 'sequencer_disk_cache_size_limit'.
	 * @see #__DNA__FIELD__sequencer_disk_cache_size_limit
	 */
	
	public void setSequencer_disk_cache_size_limit(int sequencer_disk_cache_size_limit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 13160, sequencer_disk_cache_size_limit);
		} else {
			__io__block.writeInt(__io__address + 13088, sequencer_disk_cache_size_limit);
		}
	}

	/**
	 * Get method for struct member 'sequencer_disk_cache_flag'.
	 * @see #__DNA__FIELD__sequencer_disk_cache_flag
	 */
	
	public short getSequencer_disk_cache_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 13164);
		} else {
			return __io__block.readShort(__io__address + 13092);
		}
	}

	/**
	 * Set method for struct member 'sequencer_disk_cache_flag'.
	 * @see #__DNA__FIELD__sequencer_disk_cache_flag
	 */
	
	public void setSequencer_disk_cache_flag(short sequencer_disk_cache_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 13164, sequencer_disk_cache_flag);
		} else {
			__io__block.writeShort(__io__address + 13092, sequencer_disk_cache_flag);
		}
	}

	/**
	 * Get method for struct member 'sequencer_proxy_setup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_SeqProxySetup </p>
	 * @see #__DNA__FIELD__sequencer_proxy_setup
	 */
	
	public short getSequencer_proxy_setup() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 13166);
		} else {
			return __io__block.readShort(__io__address + 13094);
		}
	}

	/**
	 * Set method for struct member 'sequencer_proxy_setup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_SeqProxySetup </p>
	 * @see #__DNA__FIELD__sequencer_proxy_setup
	 */
	
	public void setSequencer_proxy_setup(short sequencer_proxy_setup) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 13166, sequencer_proxy_setup);
		} else {
			__io__block.writeShort(__io__address + 13094, sequencer_proxy_setup);
		}
	}

	/**
	 * Get method for struct member 'collection_instance_empty_size'.
	 * @see #__DNA__FIELD__collection_instance_empty_size
	 */
	
	public float getCollection_instance_empty_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 13168);
		} else {
			return __io__block.readFloat(__io__address + 13096);
		}
	}

	/**
	 * Set method for struct member 'collection_instance_empty_size'.
	 * @see #__DNA__FIELD__collection_instance_empty_size
	 */
	
	public void setCollection_instance_empty_size(float collection_instance_empty_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 13168, collection_instance_empty_size);
		} else {
			__io__block.writeFloat(__io__address + 13096, collection_instance_empty_size);
		}
	}

	/**
	 * Get method for struct member 'text_flag'.
	 * @see #__DNA__FIELD__text_flag
	 */
	
	public byte getText_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 13172);
		} else {
			return __io__block.readByte(__io__address + 13100);
		}
	}

	/**
	 * Set method for struct member 'text_flag'.
	 * @see #__DNA__FIELD__text_flag
	 */
	
	public void setText_flag(byte text_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 13172, text_flag);
		} else {
			__io__block.writeByte(__io__address + 13100, text_flag);
		}
	}

	/**
	 * Get method for struct member '_pad10'.
	 * @see #__DNA__FIELD___pad10
	 */
	
	public CArrayFacade<Byte> get_pad10() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 13173, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 13101, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad10'.
	 * @see #__DNA__FIELD___pad10
	 */
	
	public void set_pad10(CArrayFacade<Byte> _pad10) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 13173;
		} else {
			__dna__offset = 13101;
		}
		if (__io__equals(_pad10, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad10)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad10);
		} else {
			__io__generic__copy( get_pad10(), _pad10);
		}
	}

	/**
	 * Get method for struct member 'file_preview_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_File_Preview_Type </p>
	 * @see #__DNA__FIELD__file_preview_type
	 */
	
	public byte getFile_preview_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 13174);
		} else {
			return __io__block.readByte(__io__address + 13102);
		}
	}

	/**
	 * Set method for struct member 'file_preview_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_File_Preview_Type </p>
	 * @see #__DNA__FIELD__file_preview_type
	 */
	
	public void setFile_preview_type(byte file_preview_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 13174, file_preview_type);
		} else {
			__io__block.writeByte(__io__address + 13102, file_preview_type);
		}
	}

	/**
	 * Get method for struct member 'statusbar_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_StatusBar_Flag </p>
	 * @see #__DNA__FIELD__statusbar_flag
	 */
	
	public byte getStatusbar_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 13175);
		} else {
			return __io__block.readByte(__io__address + 13103);
		}
	}

	/**
	 * Set method for struct member 'statusbar_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eUserpref_StatusBar_Flag </p>
	 * @see #__DNA__FIELD__statusbar_flag
	 */
	
	public void setStatusbar_flag(byte statusbar_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 13175, statusbar_flag);
		} else {
			__io__block.writeByte(__io__address + 13103, statusbar_flag);
		}
	}

	/**
	 * Get method for struct member 'walk_navigation'.
	 * @see #__DNA__FIELD__walk_navigation
	 */
	
	public WalkNavigation getWalk_navigation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new WalkNavigation(__io__address + 13176, __io__block, __io__blockTable);
		} else {
			return new WalkNavigation(__io__address + 13104, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'walk_navigation'.
	 * @see #__DNA__FIELD__walk_navigation
	 */
	
	public void setWalk_navigation(WalkNavigation walk_navigation) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 13176;
		} else {
			__dna__offset = 13104;
		}
		if (__io__equals(walk_navigation, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, walk_navigation)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, walk_navigation);
		} else {
			__io__generic__copy( getWalk_navigation(), walk_navigation);
		}
	}

	/**
	 * Get method for struct member 'space_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The UI for the user preferences. </p>
	 * @see #__DNA__FIELD__space_data
	 */
	
	public UserDef_SpaceData getSpace_data() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new UserDef_SpaceData(__io__address + 13208, __io__block, __io__blockTable);
		} else {
			return new UserDef_SpaceData(__io__address + 13136, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'space_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The UI for the user preferences. </p>
	 * @see #__DNA__FIELD__space_data
	 */
	
	public void setSpace_data(UserDef_SpaceData space_data) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 13208;
		} else {
			__dna__offset = 13136;
		}
		if (__io__equals(space_data, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, space_data)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, space_data);
		} else {
			__io__generic__copy( getSpace_data(), space_data);
		}
	}

	/**
	 * Get method for struct member 'file_space_data'.
	 * @see #__DNA__FIELD__file_space_data
	 */
	
	public UserDef_FileSpaceData getFile_space_data() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new UserDef_FileSpaceData(__io__address + 13216, __io__block, __io__blockTable);
		} else {
			return new UserDef_FileSpaceData(__io__address + 13144, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'file_space_data'.
	 * @see #__DNA__FIELD__file_space_data
	 */
	
	public void setFile_space_data(UserDef_FileSpaceData file_space_data) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 13216;
		} else {
			__dna__offset = 13144;
		}
		if (__io__equals(file_space_data, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, file_space_data)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, file_space_data);
		} else {
			__io__generic__copy( getFile_space_data(), file_space_data);
		}
	}

	/**
	 * Get method for struct member 'experimental'.
	 * @see #__DNA__FIELD__experimental
	 */
	
	public UserDef_Experimental getExperimental() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new UserDef_Experimental(__io__address + 13256, __io__block, __io__blockTable);
		} else {
			return new UserDef_Experimental(__io__address + 13184, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'experimental'.
	 * @see #__DNA__FIELD__experimental
	 */
	
	public void setExperimental(UserDef_Experimental experimental) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 13256;
		} else {
			__dna__offset = 13184;
		}
		if (__io__equals(experimental, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, experimental)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, experimental);
		} else {
			__io__generic__copy( getExperimental(), experimental);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data (keep last). </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public UserDef_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new UserDef_Runtime(__io__address + 13272, __io__block, __io__blockTable);
		} else {
			return new UserDef_Runtime(__io__address + 13200, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data (keep last). </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(UserDef_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 13272;
		} else {
			__dna__offset = 13200;
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
	public CPointer<UserDef> __io__addressof() {
		return new CPointer<UserDef>(__io__address, new Class[]{UserDef.class}, __io__block, __io__blockTable);
	}

}
