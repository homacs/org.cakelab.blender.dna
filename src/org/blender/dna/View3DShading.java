package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'View3DShading'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> 3D Viewport Shading settings. </p>
 */

@CMetaData(size32=856, size64=856)
public class View3DShading extends CFacade {

	/**
	 * This is the sdna index of the struct View3DShading.
	 * <p>
	 * It is required when allocating a new block to store data for View3DShading.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 212;

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method to display/shade objects in the 3D View<h4>Blender Source Code:</h4>
	 * <p> Shading type (OB_SOLID, ..). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime, for toggle between rendered viewport. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__prev_type);
	 * CPointer&lt;Byte&gt; p_prev_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev_type = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'prev_type_wire'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__prev_type_wire);
	 * CPointer&lt;Byte&gt; p_prev_type_wire = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev_type_wire'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev_type_wire = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'color_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color Type
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__color_type);
	 * CPointer&lt;Byte&gt; p_color_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_type = new long[]{3, 3};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'light'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lighting Method for Solid/Texture Viewport Shading
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__light);
	 * CPointer&lt;Byte&gt; p_light = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'light'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__light = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'background_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Way to draw the background
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__background_type);
	 * CPointer&lt;Byte&gt; p_background_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'background_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__background_type = new long[]{7, 7};

	/**
	 * Field descriptor (offset) for struct member 'cavity_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Way to draw the cavity shading
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__cavity_type);
	 * CPointer&lt;Byte&gt; p_cavity_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cavity_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cavity_type = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'wire_color_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__wire_color_type);
	 * CPointer&lt;Byte&gt; p_wire_color_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wire_color_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wire_color_type = new long[]{9, 9};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{10, 10};

	/**
	 * Field descriptor (offset) for struct member 'studio_light'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Studio lighting setup<h4>Blender Source Code:</h4>
	 * <p> FILE_MAXFILE. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__studio_light);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_studio_light = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'studio_light'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__studio_light = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'lookdev_light'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAXFILE. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__lookdev_light);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_lookdev_light = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lookdev_light'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lookdev_light = new long[]{272, 272};

	/**
	 * Field descriptor (offset) for struct member 'matcap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAXFILE. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__matcap);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_matcap = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'matcap'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__matcap = new long[]{528, 528};

	/**
	 * Field descriptor (offset) for struct member 'shadow_intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Darkness of shadows
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__shadow_intensity);
	 * CPointer&lt;Float&gt; p_shadow_intensity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadow_intensity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadow_intensity = new long[]{784, 784};

	/**
	 * Field descriptor (offset) for struct member 'single_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color for single color mode
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__single_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_single_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'single_color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__single_color = new long[]{788, 788};

	/**
	 * Field descriptor (offset) for struct member 'studiolight_rot_z'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__studiolight_rot_z);
	 * CPointer&lt;Float&gt; p_studiolight_rot_z = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'studiolight_rot_z'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__studiolight_rot_z = new long[]{800, 800};

	/**
	 * Field descriptor (offset) for struct member 'studiolight_background'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__studiolight_background);
	 * CPointer&lt;Float&gt; p_studiolight_background = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'studiolight_background'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__studiolight_background = new long[]{804, 804};

	/**
	 * Field descriptor (offset) for struct member 'object_outline_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color for object outline
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__object_outline_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_object_outline_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_outline_color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_outline_color = new long[]{808, 808};

	/**
	 * Field descriptor (offset) for struct member 'xray_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of alpha to use
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__xray_alpha);
	 * CPointer&lt;Float&gt; p_xray_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xray_alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xray_alpha = new long[]{820, 820};

	/**
	 * Field descriptor (offset) for struct member 'xray_alpha_wire'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__xray_alpha_wire);
	 * CPointer&lt;Float&gt; p_xray_alpha_wire = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xray_alpha_wire'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xray_alpha_wire = new long[]{824, 824};

	/**
	 * Field descriptor (offset) for struct member 'cavity_valley_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for the cavity valleys
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__cavity_valley_factor);
	 * CPointer&lt;Float&gt; p_cavity_valley_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cavity_valley_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cavity_valley_factor = new long[]{828, 828};

	/**
	 * Field descriptor (offset) for struct member 'cavity_ridge_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for the cavity ridges
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__cavity_ridge_factor);
	 * CPointer&lt;Float&gt; p_cavity_ridge_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cavity_ridge_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cavity_ridge_factor = new long[]{832, 832};

	/**
	 * Field descriptor (offset) for struct member 'background_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color for custom background color
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__background_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_background_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'background_color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__background_color = new long[]{836, 836};

	/**
	 * Field descriptor (offset) for struct member 'curvature_ridge_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for the curvature ridges
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__curvature_ridge_factor);
	 * CPointer&lt;Float&gt; p_curvature_ridge_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curvature_ridge_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curvature_ridge_factor = new long[]{848, 848};

	/**
	 * Field descriptor (offset) for struct member 'curvature_valley_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for the curvature valleys
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * View3DShading view3dshading = ...;
	 * CPointer&lt;Object&gt; p = view3dshading.__dna__addressof(View3DShading.__DNA__FIELD__curvature_valley_factor);
	 * CPointer&lt;Float&gt; p_curvature_valley_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curvature_valley_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curvature_valley_factor = new long[]{852, 852};

	public View3DShading(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected View3DShading(View3DShading that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method to display/shade objects in the 3D View<h4>Blender Source Code:</h4>
	 * <p> Shading type (OB_SOLID, ..). </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method to display/shade objects in the 3D View<h4>Blender Source Code:</h4>
	 * <p> Shading type (OB_SOLID, ..). </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, type);
		} else {
			__io__block.writeByte(__io__address + 0, type);
		}
	}

	/**
	 * Get method for struct member 'prev_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime, for toggle between rendered viewport. </p>
	 * @see #__DNA__FIELD__prev_type
	 */
	
	public byte getPrev_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'prev_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime, for toggle between rendered viewport. </p>
	 * @see #__DNA__FIELD__prev_type
	 */
	
	public void setPrev_type(byte prev_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, prev_type);
		} else {
			__io__block.writeByte(__io__address + 1, prev_type);
		}
	}

	/**
	 * Get method for struct member 'prev_type_wire'.
	 * @see #__DNA__FIELD__prev_type_wire
	 */
	
	public byte getPrev_type_wire() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'prev_type_wire'.
	 * @see #__DNA__FIELD__prev_type_wire
	 */
	
	public void setPrev_type_wire(byte prev_type_wire) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, prev_type_wire);
		} else {
			__io__block.writeByte(__io__address + 2, prev_type_wire);
		}
	}

	/**
	 * Get method for struct member 'color_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color Type
	 * @see #__DNA__FIELD__color_type
	 */
	
	public byte getColor_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'color_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color Type
	 * @see #__DNA__FIELD__color_type
	 */
	
	public void setColor_type(byte color_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, color_type);
		} else {
			__io__block.writeByte(__io__address + 3, color_type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, flag);
		} else {
			__io__block.writeShort(__io__address + 4, flag);
		}
	}

	/**
	 * Get method for struct member 'light'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lighting Method for Solid/Texture Viewport Shading
	 * @see #__DNA__FIELD__light
	 */
	
	public byte getLight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 6);
		} else {
			return __io__block.readByte(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'light'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lighting Method for Solid/Texture Viewport Shading
	 * @see #__DNA__FIELD__light
	 */
	
	public void setLight(byte light) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 6, light);
		} else {
			__io__block.writeByte(__io__address + 6, light);
		}
	}

	/**
	 * Get method for struct member 'background_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Way to draw the background
	 * @see #__DNA__FIELD__background_type
	 */
	
	public byte getBackground_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 7);
		} else {
			return __io__block.readByte(__io__address + 7);
		}
	}

	/**
	 * Set method for struct member 'background_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Way to draw the background
	 * @see #__DNA__FIELD__background_type
	 */
	
	public void setBackground_type(byte background_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 7, background_type);
		} else {
			__io__block.writeByte(__io__address + 7, background_type);
		}
	}

	/**
	 * Get method for struct member 'cavity_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Way to draw the cavity shading
	 * @see #__DNA__FIELD__cavity_type
	 */
	
	public byte getCavity_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8);
		} else {
			return __io__block.readByte(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'cavity_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Way to draw the cavity shading
	 * @see #__DNA__FIELD__cavity_type
	 */
	
	public void setCavity_type(byte cavity_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8, cavity_type);
		} else {
			__io__block.writeByte(__io__address + 8, cavity_type);
		}
	}

	/**
	 * Get method for struct member 'wire_color_type'.
	 * @see #__DNA__FIELD__wire_color_type
	 */
	
	public byte getWire_color_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 9);
		} else {
			return __io__block.readByte(__io__address + 9);
		}
	}

	/**
	 * Set method for struct member 'wire_color_type'.
	 * @see #__DNA__FIELD__wire_color_type
	 */
	
	public void setWire_color_type(byte wire_color_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 9, wire_color_type);
		} else {
			__io__block.writeByte(__io__address + 9, wire_color_type);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 10, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 10, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 10;
		} else {
			__dna__offset = 10;
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
	 * Get method for struct member 'studio_light'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Studio lighting setup<h4>Blender Source Code:</h4>
	 * <p> FILE_MAXFILE. </p>
	 * @see #__DNA__FIELD__studio_light
	 */
	
	public CArrayFacade<Byte> getStudio_light() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'studio_light'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Studio lighting setup<h4>Blender Source Code:</h4>
	 * <p> FILE_MAXFILE. </p>
	 * @see #__DNA__FIELD__studio_light
	 */
	
	public void setStudio_light(CArrayFacade<Byte> studio_light) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(studio_light, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, studio_light)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, studio_light);
		} else {
			__io__generic__copy( getStudio_light(), studio_light);
		}
	}

	/**
	 * Get method for struct member 'lookdev_light'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAXFILE. </p>
	 * @see #__DNA__FIELD__lookdev_light
	 */
	
	public CArrayFacade<Byte> getLookdev_light() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 272, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 272, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lookdev_light'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAXFILE. </p>
	 * @see #__DNA__FIELD__lookdev_light
	 */
	
	public void setLookdev_light(CArrayFacade<Byte> lookdev_light) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 272;
		} else {
			__dna__offset = 272;
		}
		if (__io__equals(lookdev_light, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lookdev_light)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lookdev_light);
		} else {
			__io__generic__copy( getLookdev_light(), lookdev_light);
		}
	}

	/**
	 * Get method for struct member 'matcap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAXFILE. </p>
	 * @see #__DNA__FIELD__matcap
	 */
	
	public CArrayFacade<Byte> getMatcap() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 528, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 528, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'matcap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> FILE_MAXFILE. </p>
	 * @see #__DNA__FIELD__matcap
	 */
	
	public void setMatcap(CArrayFacade<Byte> matcap) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 528;
		} else {
			__dna__offset = 528;
		}
		if (__io__equals(matcap, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, matcap)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, matcap);
		} else {
			__io__generic__copy( getMatcap(), matcap);
		}
	}

	/**
	 * Get method for struct member 'shadow_intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Darkness of shadows
	 * @see #__DNA__FIELD__shadow_intensity
	 */
	
	public float getShadow_intensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 784);
		} else {
			return __io__block.readFloat(__io__address + 784);
		}
	}

	/**
	 * Set method for struct member 'shadow_intensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Darkness of shadows
	 * @see #__DNA__FIELD__shadow_intensity
	 */
	
	public void setShadow_intensity(float shadow_intensity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 784, shadow_intensity);
		} else {
			__io__block.writeFloat(__io__address + 784, shadow_intensity);
		}
	}

	/**
	 * Get method for struct member 'single_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color for single color mode
	 * @see #__DNA__FIELD__single_color
	 */
	
	public CArrayFacade<Float> getSingle_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 788, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 788, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'single_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color for single color mode
	 * @see #__DNA__FIELD__single_color
	 */
	
	public void setSingle_color(CArrayFacade<Float> single_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 788;
		} else {
			__dna__offset = 788;
		}
		if (__io__equals(single_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, single_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, single_color);
		} else {
			__io__generic__copy( getSingle_color(), single_color);
		}
	}

	/**
	 * Get method for struct member 'studiolight_rot_z'.
	 * @see #__DNA__FIELD__studiolight_rot_z
	 */
	
	public float getStudiolight_rot_z() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 800);
		} else {
			return __io__block.readFloat(__io__address + 800);
		}
	}

	/**
	 * Set method for struct member 'studiolight_rot_z'.
	 * @see #__DNA__FIELD__studiolight_rot_z
	 */
	
	public void setStudiolight_rot_z(float studiolight_rot_z) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 800, studiolight_rot_z);
		} else {
			__io__block.writeFloat(__io__address + 800, studiolight_rot_z);
		}
	}

	/**
	 * Get method for struct member 'studiolight_background'.
	 * @see #__DNA__FIELD__studiolight_background
	 */
	
	public float getStudiolight_background() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 804);
		} else {
			return __io__block.readFloat(__io__address + 804);
		}
	}

	/**
	 * Set method for struct member 'studiolight_background'.
	 * @see #__DNA__FIELD__studiolight_background
	 */
	
	public void setStudiolight_background(float studiolight_background) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 804, studiolight_background);
		} else {
			__io__block.writeFloat(__io__address + 804, studiolight_background);
		}
	}

	/**
	 * Get method for struct member 'object_outline_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color for object outline
	 * @see #__DNA__FIELD__object_outline_color
	 */
	
	public CArrayFacade<Float> getObject_outline_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 808, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 808, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'object_outline_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color for object outline
	 * @see #__DNA__FIELD__object_outline_color
	 */
	
	public void setObject_outline_color(CArrayFacade<Float> object_outline_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 808;
		} else {
			__dna__offset = 808;
		}
		if (__io__equals(object_outline_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, object_outline_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, object_outline_color);
		} else {
			__io__generic__copy( getObject_outline_color(), object_outline_color);
		}
	}

	/**
	 * Get method for struct member 'xray_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of alpha to use
	 * @see #__DNA__FIELD__xray_alpha
	 */
	
	public float getXray_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 820);
		} else {
			return __io__block.readFloat(__io__address + 820);
		}
	}

	/**
	 * Set method for struct member 'xray_alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of alpha to use
	 * @see #__DNA__FIELD__xray_alpha
	 */
	
	public void setXray_alpha(float xray_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 820, xray_alpha);
		} else {
			__io__block.writeFloat(__io__address + 820, xray_alpha);
		}
	}

	/**
	 * Get method for struct member 'xray_alpha_wire'.
	 * @see #__DNA__FIELD__xray_alpha_wire
	 */
	
	public float getXray_alpha_wire() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 824);
		} else {
			return __io__block.readFloat(__io__address + 824);
		}
	}

	/**
	 * Set method for struct member 'xray_alpha_wire'.
	 * @see #__DNA__FIELD__xray_alpha_wire
	 */
	
	public void setXray_alpha_wire(float xray_alpha_wire) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 824, xray_alpha_wire);
		} else {
			__io__block.writeFloat(__io__address + 824, xray_alpha_wire);
		}
	}

	/**
	 * Get method for struct member 'cavity_valley_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for the cavity valleys
	 * @see #__DNA__FIELD__cavity_valley_factor
	 */
	
	public float getCavity_valley_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 828);
		} else {
			return __io__block.readFloat(__io__address + 828);
		}
	}

	/**
	 * Set method for struct member 'cavity_valley_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for the cavity valleys
	 * @see #__DNA__FIELD__cavity_valley_factor
	 */
	
	public void setCavity_valley_factor(float cavity_valley_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 828, cavity_valley_factor);
		} else {
			__io__block.writeFloat(__io__address + 828, cavity_valley_factor);
		}
	}

	/**
	 * Get method for struct member 'cavity_ridge_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for the cavity ridges
	 * @see #__DNA__FIELD__cavity_ridge_factor
	 */
	
	public float getCavity_ridge_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 832);
		} else {
			return __io__block.readFloat(__io__address + 832);
		}
	}

	/**
	 * Set method for struct member 'cavity_ridge_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for the cavity ridges
	 * @see #__DNA__FIELD__cavity_ridge_factor
	 */
	
	public void setCavity_ridge_factor(float cavity_ridge_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 832, cavity_ridge_factor);
		} else {
			__io__block.writeFloat(__io__address + 832, cavity_ridge_factor);
		}
	}

	/**
	 * Get method for struct member 'background_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color for custom background color
	 * @see #__DNA__FIELD__background_color
	 */
	
	public CArrayFacade<Float> getBackground_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 836, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 836, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'background_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color for custom background color
	 * @see #__DNA__FIELD__background_color
	 */
	
	public void setBackground_color(CArrayFacade<Float> background_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 836;
		} else {
			__dna__offset = 836;
		}
		if (__io__equals(background_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, background_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, background_color);
		} else {
			__io__generic__copy( getBackground_color(), background_color);
		}
	}

	/**
	 * Get method for struct member 'curvature_ridge_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for the curvature ridges
	 * @see #__DNA__FIELD__curvature_ridge_factor
	 */
	
	public float getCurvature_ridge_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 848);
		} else {
			return __io__block.readFloat(__io__address + 848);
		}
	}

	/**
	 * Set method for struct member 'curvature_ridge_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for the curvature ridges
	 * @see #__DNA__FIELD__curvature_ridge_factor
	 */
	
	public void setCurvature_ridge_factor(float curvature_ridge_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 848, curvature_ridge_factor);
		} else {
			__io__block.writeFloat(__io__address + 848, curvature_ridge_factor);
		}
	}

	/**
	 * Get method for struct member 'curvature_valley_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for the curvature valleys
	 * @see #__DNA__FIELD__curvature_valley_factor
	 */
	
	public float getCurvature_valley_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 852);
		} else {
			return __io__block.readFloat(__io__address + 852);
		}
	}

	/**
	 * Set method for struct member 'curvature_valley_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Factor for the curvature valleys
	 * @see #__DNA__FIELD__curvature_valley_factor
	 */
	
	public void setCurvature_valley_factor(float curvature_valley_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 852, curvature_valley_factor);
		} else {
			__io__block.writeFloat(__io__address + 852, curvature_valley_factor);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<View3DShading> __io__addressof() {
		return new CPointer<View3DShading>(__io__address, new Class[]{View3DShading.class}, __io__block, __io__blockTable);
	}

}
