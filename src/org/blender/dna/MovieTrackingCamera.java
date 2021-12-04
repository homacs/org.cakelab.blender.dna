package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieTrackingCamera'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=84, size64=88)
public class MovieTrackingCamera extends CFacade {

	/**
	 * This is the sdna index of the struct MovieTrackingCamera.
	 * <p>
	 * It is required when allocating a new block to store data for MovieTrackingCamera.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 682;

	/**
	 * Field descriptor (offset) for struct member 'intrinsics'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Intrinsics handle. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__intrinsics);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_intrinsics = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'intrinsics'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__intrinsics = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'distortion_model'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distortion model used for camera lenses
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__distortion_model);
	 * CPointer&lt;Short&gt; p_distortion_model = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distortion_model'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distortion_model = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{6, 10};

	/**
	 * Field descriptor (offset) for struct member 'sensor_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Width of CCD sensor in millimeters<h4>Blender Source Code:</h4>
	 * <p> Width of CCD sensor. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__sensor_width);
	 * CPointer&lt;Float&gt; p_sensor_width = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sensor_width'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sensor_width = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'pixel_aspect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pixel aspect ratio<h4>Blender Source Code:</h4>
	 * <p> Pixel aspect ratio. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__pixel_aspect);
	 * CPointer&lt;Float&gt; p_pixel_aspect = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pixel_aspect'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pixel_aspect = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'focal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Focal length. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__focal);
	 * CPointer&lt;Float&gt; p_focal = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'focal'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__focal = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member 'units'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Units used for camera focal length<h4>Blender Source Code:</h4>
	 * <p> Units of focal length user is working with. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__units);
	 * CPointer&lt;Short&gt; p_units = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'units'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__units = new long[]{20, 24};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{22, 26};

	/**
	 * Field descriptor (offset) for struct member 'principal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Optical center of lens<h4>Blender Source Code:</h4>
	 * <p> Principal point. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__principal);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_principal = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'principal'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__principal = new long[]{24, 28};

	/**
	 * Field descriptor (offset) for struct member 'k1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of third order polynomial radial distortion<h4>Blender Source Code:</h4>
	 * <p> Polynomial distortion Polynomial radial distortion. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__k1);
	 * CPointer&lt;Float&gt; p_k1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'k1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__k1 = new long[]{32, 36};

	/**
	 * Field descriptor (offset) for struct member 'k2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of third order polynomial radial distortion
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__k2);
	 * CPointer&lt;Float&gt; p_k2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'k2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__k2 = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'k3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Third coefficient of third order polynomial radial distortion
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__k3);
	 * CPointer&lt;Float&gt; p_k3 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'k3'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__k3 = new long[]{40, 44};

	/**
	 * Field descriptor (offset) for struct member 'division_k1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of second order division distortion<h4>Blender Source Code:</h4>
	 * <p> Division distortion model coefficients </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__division_k1);
	 * CPointer&lt;Float&gt; p_division_k1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'division_k1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__division_k1 = new long[]{44, 48};

	/**
	 * Field descriptor (offset) for struct member 'division_k2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of second order division distortion
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__division_k2);
	 * CPointer&lt;Float&gt; p_division_k2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'division_k2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__division_k2 = new long[]{48, 52};

	/**
	 * Field descriptor (offset) for struct member 'nuke_k1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of second order Nuke distortion<h4>Blender Source Code:</h4>
	 * <p> Nuke distortion model coefficients </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__nuke_k1);
	 * CPointer&lt;Float&gt; p_nuke_k1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nuke_k1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nuke_k1 = new long[]{52, 56};

	/**
	 * Field descriptor (offset) for struct member 'nuke_k2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of second order Nuke distortion
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__nuke_k2);
	 * CPointer&lt;Float&gt; p_nuke_k2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nuke_k2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nuke_k2 = new long[]{56, 60};

	/**
	 * Field descriptor (offset) for struct member 'brown_k1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of fourth order Brown-Conrady radial distortion<h4>Blender Source Code:</h4>
	 * <p> Brown-Conrady distortion model coefficients Brown-Conrady radial distortion. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__brown_k1);
	 * CPointer&lt;Float&gt; p_brown_k1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brown_k1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brown_k1 = new long[]{60, 64};

	/**
	 * Field descriptor (offset) for struct member 'brown_k2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of fourth order Brown-Conrady radial distortion
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__brown_k2);
	 * CPointer&lt;Float&gt; p_brown_k2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brown_k2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brown_k2 = new long[]{64, 68};

	/**
	 * Field descriptor (offset) for struct member 'brown_k3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Third coefficient of fourth order Brown-Conrady radial distortion
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__brown_k3);
	 * CPointer&lt;Float&gt; p_brown_k3 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brown_k3'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brown_k3 = new long[]{68, 72};

	/**
	 * Field descriptor (offset) for struct member 'brown_k4'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Fourth coefficient of fourth order Brown-Conrady radial distortion
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__brown_k4);
	 * CPointer&lt;Float&gt; p_brown_k4 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brown_k4'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brown_k4 = new long[]{72, 76};

	/**
	 * Field descriptor (offset) for struct member 'brown_p1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of second order Brown-Conrady tangential distortion<h4>Blender Source Code:</h4>
	 * <p> Brown-Conrady tangential distortion. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__brown_p1);
	 * CPointer&lt;Float&gt; p_brown_p1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brown_p1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brown_p1 = new long[]{76, 80};

	/**
	 * Field descriptor (offset) for struct member 'brown_p2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of second order Brown-Conrady tangential distortion
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingCamera movietrackingcamera = ...;
	 * CPointer&lt;Object&gt; p = movietrackingcamera.__dna__addressof(MovieTrackingCamera.__DNA__FIELD__brown_p2);
	 * CPointer&lt;Float&gt; p_brown_p2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brown_p2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brown_p2 = new long[]{80, 84};

	public MovieTrackingCamera(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieTrackingCamera(MovieTrackingCamera that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'intrinsics'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Intrinsics handle. </p>
	 * @see #__DNA__FIELD__intrinsics
	 */
	
	public CPointer<Object> getIntrinsics() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'intrinsics'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Intrinsics handle. </p>
	 * @see #__DNA__FIELD__intrinsics
	 */
	
	public void setIntrinsics(CPointer<Object> intrinsics) throws IOException
	{
		long __address = ((intrinsics == null) ? 0 : intrinsics.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'distortion_model'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distortion model used for camera lenses
	 * @see #__DNA__FIELD__distortion_model
	 */
	
	public short getDistortion_model() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'distortion_model'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Distortion model used for camera lenses
	 * @see #__DNA__FIELD__distortion_model
	 */
	
	public void setDistortion_model(short distortion_model) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, distortion_model);
		} else {
			__io__block.writeShort(__io__address + 4, distortion_model);
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
			return new CArrayFacade<Byte>(__io__address + 10, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 6, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 6;
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
	 * Get method for struct member 'sensor_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Width of CCD sensor in millimeters<h4>Blender Source Code:</h4>
	 * <p> Width of CCD sensor. </p>
	 * @see #__DNA__FIELD__sensor_width
	 */
	
	public float getSensor_width() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'sensor_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Width of CCD sensor in millimeters<h4>Blender Source Code:</h4>
	 * <p> Width of CCD sensor. </p>
	 * @see #__DNA__FIELD__sensor_width
	 */
	
	public void setSensor_width(float sensor_width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, sensor_width);
		} else {
			__io__block.writeFloat(__io__address + 8, sensor_width);
		}
	}

	/**
	 * Get method for struct member 'pixel_aspect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pixel aspect ratio<h4>Blender Source Code:</h4>
	 * <p> Pixel aspect ratio. </p>
	 * @see #__DNA__FIELD__pixel_aspect
	 */
	
	public float getPixel_aspect() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'pixel_aspect'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Pixel aspect ratio<h4>Blender Source Code:</h4>
	 * <p> Pixel aspect ratio. </p>
	 * @see #__DNA__FIELD__pixel_aspect
	 */
	
	public void setPixel_aspect(float pixel_aspect) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, pixel_aspect);
		} else {
			__io__block.writeFloat(__io__address + 12, pixel_aspect);
		}
	}

	/**
	 * Get method for struct member 'focal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Focal length. </p>
	 * @see #__DNA__FIELD__focal
	 */
	
	public float getFocal() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'focal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Focal length. </p>
	 * @see #__DNA__FIELD__focal
	 */
	
	public void setFocal(float focal) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, focal);
		} else {
			__io__block.writeFloat(__io__address + 16, focal);
		}
	}

	/**
	 * Get method for struct member 'units'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Units used for camera focal length<h4>Blender Source Code:</h4>
	 * <p> Units of focal length user is working with. </p>
	 * @see #__DNA__FIELD__units
	 */
	
	public short getUnits() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'units'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Units used for camera focal length<h4>Blender Source Code:</h4>
	 * <p> Units of focal length user is working with. </p>
	 * @see #__DNA__FIELD__units
	 */
	
	public void setUnits(short units) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, units);
		} else {
			__io__block.writeShort(__io__address + 20, units);
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
			return new CArrayFacade<Byte>(__io__address + 26, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 22, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 26;
		} else {
			__dna__offset = 22;
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
	 * Get method for struct member 'principal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Optical center of lens<h4>Blender Source Code:</h4>
	 * <p> Principal point. </p>
	 * @see #__DNA__FIELD__principal
	 */
	
	public CArrayFacade<Float> getPrincipal() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'principal'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Optical center of lens<h4>Blender Source Code:</h4>
	 * <p> Principal point. </p>
	 * @see #__DNA__FIELD__principal
	 */
	
	public void setPrincipal(CArrayFacade<Float> principal) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 28;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(principal, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, principal)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, principal);
		} else {
			__io__generic__copy( getPrincipal(), principal);
		}
	}

	/**
	 * Get method for struct member 'k1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of third order polynomial radial distortion<h4>Blender Source Code:</h4>
	 * <p> Polynomial distortion Polynomial radial distortion. </p>
	 * @see #__DNA__FIELD__k1
	 */
	
	public float getK1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'k1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of third order polynomial radial distortion<h4>Blender Source Code:</h4>
	 * <p> Polynomial distortion Polynomial radial distortion. </p>
	 * @see #__DNA__FIELD__k1
	 */
	
	public void setK1(float k1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, k1);
		} else {
			__io__block.writeFloat(__io__address + 32, k1);
		}
	}

	/**
	 * Get method for struct member 'k2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of third order polynomial radial distortion
	 * @see #__DNA__FIELD__k2
	 */
	
	public float getK2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'k2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of third order polynomial radial distortion
	 * @see #__DNA__FIELD__k2
	 */
	
	public void setK2(float k2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, k2);
		} else {
			__io__block.writeFloat(__io__address + 36, k2);
		}
	}

	/**
	 * Get method for struct member 'k3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Third coefficient of third order polynomial radial distortion
	 * @see #__DNA__FIELD__k3
	 */
	
	public float getK3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'k3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Third coefficient of third order polynomial radial distortion
	 * @see #__DNA__FIELD__k3
	 */
	
	public void setK3(float k3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, k3);
		} else {
			__io__block.writeFloat(__io__address + 40, k3);
		}
	}

	/**
	 * Get method for struct member 'division_k1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of second order division distortion<h4>Blender Source Code:</h4>
	 * <p> Division distortion model coefficients </p>
	 * @see #__DNA__FIELD__division_k1
	 */
	
	public float getDivision_k1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'division_k1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of second order division distortion<h4>Blender Source Code:</h4>
	 * <p> Division distortion model coefficients </p>
	 * @see #__DNA__FIELD__division_k1
	 */
	
	public void setDivision_k1(float division_k1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, division_k1);
		} else {
			__io__block.writeFloat(__io__address + 44, division_k1);
		}
	}

	/**
	 * Get method for struct member 'division_k2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of second order division distortion
	 * @see #__DNA__FIELD__division_k2
	 */
	
	public float getDivision_k2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'division_k2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of second order division distortion
	 * @see #__DNA__FIELD__division_k2
	 */
	
	public void setDivision_k2(float division_k2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, division_k2);
		} else {
			__io__block.writeFloat(__io__address + 48, division_k2);
		}
	}

	/**
	 * Get method for struct member 'nuke_k1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of second order Nuke distortion<h4>Blender Source Code:</h4>
	 * <p> Nuke distortion model coefficients </p>
	 * @see #__DNA__FIELD__nuke_k1
	 */
	
	public float getNuke_k1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'nuke_k1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of second order Nuke distortion<h4>Blender Source Code:</h4>
	 * <p> Nuke distortion model coefficients </p>
	 * @see #__DNA__FIELD__nuke_k1
	 */
	
	public void setNuke_k1(float nuke_k1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, nuke_k1);
		} else {
			__io__block.writeFloat(__io__address + 52, nuke_k1);
		}
	}

	/**
	 * Get method for struct member 'nuke_k2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of second order Nuke distortion
	 * @see #__DNA__FIELD__nuke_k2
	 */
	
	public float getNuke_k2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'nuke_k2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of second order Nuke distortion
	 * @see #__DNA__FIELD__nuke_k2
	 */
	
	public void setNuke_k2(float nuke_k2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, nuke_k2);
		} else {
			__io__block.writeFloat(__io__address + 56, nuke_k2);
		}
	}

	/**
	 * Get method for struct member 'brown_k1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of fourth order Brown-Conrady radial distortion<h4>Blender Source Code:</h4>
	 * <p> Brown-Conrady distortion model coefficients Brown-Conrady radial distortion. </p>
	 * @see #__DNA__FIELD__brown_k1
	 */
	
	public float getBrown_k1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'brown_k1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of fourth order Brown-Conrady radial distortion<h4>Blender Source Code:</h4>
	 * <p> Brown-Conrady distortion model coefficients Brown-Conrady radial distortion. </p>
	 * @see #__DNA__FIELD__brown_k1
	 */
	
	public void setBrown_k1(float brown_k1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, brown_k1);
		} else {
			__io__block.writeFloat(__io__address + 60, brown_k1);
		}
	}

	/**
	 * Get method for struct member 'brown_k2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of fourth order Brown-Conrady radial distortion
	 * @see #__DNA__FIELD__brown_k2
	 */
	
	public float getBrown_k2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'brown_k2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of fourth order Brown-Conrady radial distortion
	 * @see #__DNA__FIELD__brown_k2
	 */
	
	public void setBrown_k2(float brown_k2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, brown_k2);
		} else {
			__io__block.writeFloat(__io__address + 64, brown_k2);
		}
	}

	/**
	 * Get method for struct member 'brown_k3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Third coefficient of fourth order Brown-Conrady radial distortion
	 * @see #__DNA__FIELD__brown_k3
	 */
	
	public float getBrown_k3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 72);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'brown_k3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Third coefficient of fourth order Brown-Conrady radial distortion
	 * @see #__DNA__FIELD__brown_k3
	 */
	
	public void setBrown_k3(float brown_k3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 72, brown_k3);
		} else {
			__io__block.writeFloat(__io__address + 68, brown_k3);
		}
	}

	/**
	 * Get method for struct member 'brown_k4'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Fourth coefficient of fourth order Brown-Conrady radial distortion
	 * @see #__DNA__FIELD__brown_k4
	 */
	
	public float getBrown_k4() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'brown_k4'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Fourth coefficient of fourth order Brown-Conrady radial distortion
	 * @see #__DNA__FIELD__brown_k4
	 */
	
	public void setBrown_k4(float brown_k4) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, brown_k4);
		} else {
			__io__block.writeFloat(__io__address + 72, brown_k4);
		}
	}

	/**
	 * Get method for struct member 'brown_p1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of second order Brown-Conrady tangential distortion<h4>Blender Source Code:</h4>
	 * <p> Brown-Conrady tangential distortion. </p>
	 * @see #__DNA__FIELD__brown_p1
	 */
	
	public float getBrown_p1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'brown_p1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * First coefficient of second order Brown-Conrady tangential distortion<h4>Blender Source Code:</h4>
	 * <p> Brown-Conrady tangential distortion. </p>
	 * @see #__DNA__FIELD__brown_p1
	 */
	
	public void setBrown_p1(float brown_p1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, brown_p1);
		} else {
			__io__block.writeFloat(__io__address + 76, brown_p1);
		}
	}

	/**
	 * Get method for struct member 'brown_p2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of second order Brown-Conrady tangential distortion
	 * @see #__DNA__FIELD__brown_p2
	 */
	
	public float getBrown_p2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'brown_p2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Second coefficient of second order Brown-Conrady tangential distortion
	 * @see #__DNA__FIELD__brown_p2
	 */
	
	public void setBrown_p2(float brown_p2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, brown_p2);
		} else {
			__io__block.writeFloat(__io__address + 80, brown_p2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieTrackingCamera> __io__addressof() {
		return new CPointer<MovieTrackingCamera>(__io__address, new Class[]{MovieTrackingCamera.class}, __io__block, __io__blockTable);
	}

}
