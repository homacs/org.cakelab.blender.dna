package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'World'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p>{@link World}  defines general modeling data such as a background fill, gravity, color model etc. It mixes game-data, rendering data and modeling data. </p>
 */

@CMetaData(size32=420, size64=544)
public class World extends CFacade {

	/**
	 * This is the sdna index of the struct World.
	 * <p>
	 * It is required when allocating a new block to store data for World.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 163;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__adt);
	 * CPointer&lt;CPointer&lt;AnimData&gt;&gt; p_adt = p.cast(new Class[]{CPointer.class, AnimData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adt'</li>
	 * <li>Signature: 'AnimData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adt = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'colormodel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__colormodel);
	 * CPointer&lt;Short&gt; p_colormodel = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colormodel'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colormodel = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'totex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__totex);
	 * CPointer&lt;Short&gt; p_totex = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totex'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totex = new long[]{106, 130};

	/**
	 * Field descriptor (offset) for struct member 'texact'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__texact);
	 * CPointer&lt;Short&gt; p_texact = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texact'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texact = new long[]{108, 132};

	/**
	 * Field descriptor (offset) for struct member 'mistype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__mistype);
	 * CPointer&lt;Short&gt; p_mistype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mistype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mistype = new long[]{110, 134};

	/**
	 * Field descriptor (offset) for struct member 'horr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__horr);
	 * CPointer&lt;Float&gt; p_horr = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'horr'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__horr = new long[]{112, 136};

	/**
	 * Field descriptor (offset) for struct member 'horg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__horg);
	 * CPointer&lt;Float&gt; p_horg = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'horg'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__horg = new long[]{116, 140};

	/**
	 * Field descriptor (offset) for struct member 'horb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__horb);
	 * CPointer&lt;Float&gt; p_horb = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'horb'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__horb = new long[]{120, 144};

	/**
	 * Field descriptor (offset) for struct member 'zenr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__zenr);
	 * CPointer&lt;Float&gt; p_zenr = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zenr'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zenr = new long[]{124, 148};

	/**
	 * Field descriptor (offset) for struct member 'zeng'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__zeng);
	 * CPointer&lt;Float&gt; p_zeng = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zeng'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zeng = new long[]{128, 152};

	/**
	 * Field descriptor (offset) for struct member 'zenb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__zenb);
	 * CPointer&lt;Float&gt; p_zenb = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zenb'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zenb = new long[]{132, 156};

	/**
	 * Field descriptor (offset) for struct member 'ambr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ambr);
	 * CPointer&lt;Float&gt; p_ambr = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ambr'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ambr = new long[]{136, 160};

	/**
	 * Field descriptor (offset) for struct member 'ambg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ambg);
	 * CPointer&lt;Float&gt; p_ambg = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ambg'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ambg = new long[]{140, 164};

	/**
	 * Field descriptor (offset) for struct member 'ambb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ambb);
	 * CPointer&lt;Float&gt; p_ambb = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ambb'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ambb = new long[]{144, 168};

	/**
	 * Field descriptor (offset) for struct member 'exposure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of exponential color correction for light<h4>Blender Source Code:</h4>
	 * <p> Exposure= mult factor. unused now, but maybe back later. Kept in to be upward compat. New is exp/range control. linfac & logfac are constants... don't belong in file, but allocating 8 bytes for temp mem isn't useful either. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__exposure);
	 * CPointer&lt;Float&gt; p_exposure = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'exposure'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__exposure = new long[]{148, 172};

	/**
	 * Field descriptor (offset) for struct member 'exp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__exp);
	 * CPointer&lt;Float&gt; p_exp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'exp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__exp = new long[]{152, 176};

	/**
	 * Field descriptor (offset) for struct member 'range'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__range);
	 * CPointer&lt;Float&gt; p_range = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'range'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__range = new long[]{156, 180};

	/**
	 * Field descriptor (offset) for struct member 'linfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__linfac);
	 * CPointer&lt;Float&gt; p_linfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'linfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__linfac = new long[]{160, 184};

	/**
	 * Field descriptor (offset) for struct member 'logfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__logfac);
	 * CPointer&lt;Float&gt; p_logfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'logfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__logfac = new long[]{164, 188};

	/**
	 * Field descriptor (offset) for struct member 'gravity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gravitation constant for the game world </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__gravity);
	 * CPointer&lt;Float&gt; p_gravity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gravity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gravity = new long[]{168, 192};

	/**
	 * Field descriptor (offset) for struct member 'activityBoxRadius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius of the activity bubble, in Manhattan length. Objects outside the box are activity-culled. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__activityBoxRadius);
	 * CPointer&lt;Float&gt; p_activityBoxRadius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'activityBoxRadius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__activityBoxRadius = new long[]{172, 196};

	/**
	 * Field descriptor (offset) for struct member 'skytype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__skytype);
	 * CPointer&lt;Short&gt; p_skytype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'skytype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__skytype = new long[]{176, 200};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Some world modes bit 0: Do mist bit 1: Do stars bit 2: (reserved) depth of field bit 3: (gameengine): Activity culling is enabled. bit 4: ambient occlusion bit 5: (gameengine) : enable Bullet DBVT tree for view frustum culling </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__mode);
	 * CPointer&lt;Short&gt; p_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{178, 202};

	/**
	 * Field descriptor (offset) for struct member 'occlusionRes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> resolution of occlusion Z buffer in pixel </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__occlusionRes);
	 * CPointer&lt;Short&gt; p_occlusionRes = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'occlusionRes'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__occlusionRes = new long[]{180, 204};

	/**
	 * Field descriptor (offset) for struct member 'physicsEngine'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX moved to scene->gamedata in 2.5. </p><p> here it's aligned </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__physicsEngine);
	 * CPointer&lt;Short&gt; p_physicsEngine = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'physicsEngine'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__physicsEngine = new long[]{182, 206};

	/**
	 * Field descriptor (offset) for struct member 'ticrate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX moved to scene->gamedata in 2.5. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ticrate);
	 * CPointer&lt;Short&gt; p_ticrate = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ticrate'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ticrate = new long[]{184, 208};

	/**
	 * Field descriptor (offset) for struct member 'maxlogicstep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__maxlogicstep);
	 * CPointer&lt;Short&gt; p_maxlogicstep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxlogicstep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxlogicstep = new long[]{186, 210};

	/**
	 * Field descriptor (offset) for struct member 'physubstep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__physubstep);
	 * CPointer&lt;Short&gt; p_physubstep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'physubstep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__physubstep = new long[]{188, 212};

	/**
	 * Field descriptor (offset) for struct member 'maxphystep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__maxphystep);
	 * CPointer&lt;Short&gt; p_maxphystep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxphystep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxphystep = new long[]{190, 214};

	/**
	 * Field descriptor (offset) for struct member 'misi'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__misi);
	 * CPointer&lt;Float&gt; p_misi = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'misi'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__misi = new long[]{192, 216};

	/**
	 * Field descriptor (offset) for struct member 'miststa'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__miststa);
	 * CPointer&lt;Float&gt; p_miststa = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'miststa'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__miststa = new long[]{196, 220};

	/**
	 * Field descriptor (offset) for struct member 'mistdist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__mistdist);
	 * CPointer&lt;Float&gt; p_mistdist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mistdist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mistdist = new long[]{200, 224};

	/**
	 * Field descriptor (offset) for struct member 'misthi'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__misthi);
	 * CPointer&lt;Float&gt; p_misthi = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'misthi'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__misthi = new long[]{204, 228};

	/**
	 * Field descriptor (offset) for struct member 'starr'.
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
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__starr);
	 * CPointer&lt;Float&gt; p_starr = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'starr'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__starr = new long[]{208, 232};

	/**
	 * Field descriptor (offset) for struct member 'starg'.
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
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__starg);
	 * CPointer&lt;Float&gt; p_starg = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'starg'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__starg = new long[]{212, 236};

	/**
	 * Field descriptor (offset) for struct member 'starb'.
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
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__starb);
	 * CPointer&lt;Float&gt; p_starb = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'starb'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__starb = new long[]{216, 240};

	/**
	 * Field descriptor (offset) for struct member 'stark'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> Deprecated </p>
	 * @deprecated
	 *  DeprecatedDeprecated </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__stark);
	 * CPointer&lt;Float&gt; p_stark = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stark'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stark = new long[]{220, 244};

	/**
	 * Field descriptor (offset) for struct member 'starsize'.
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
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__starsize);
	 * CPointer&lt;Float&gt; p_starsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'starsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__starsize = new long[]{224, 248};

	/**
	 * Field descriptor (offset) for struct member 'starmindist'.
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
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__starmindist);
	 * CPointer&lt;Float&gt; p_starmindist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'starmindist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__starmindist = new long[]{228, 252};

	/**
	 * Field descriptor (offset) for struct member 'stardist'.
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
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__stardist);
	 * CPointer&lt;Float&gt; p_stardist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stardist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stardist = new long[]{232, 256};

	/**
	 * Field descriptor (offset) for struct member 'starcolnoise'.
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
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__starcolnoise);
	 * CPointer&lt;Float&gt; p_starcolnoise = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'starcolnoise'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__starcolnoise = new long[]{236, 260};

	/**
	 * Field descriptor (offset) for struct member 'dofsta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unused now: DOF </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__dofsta);
	 * CPointer&lt;Short&gt; p_dofsta = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dofsta'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dofsta = new long[]{240, 264};

	/**
	 * Field descriptor (offset) for struct member 'dofend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__dofend);
	 * CPointer&lt;Short&gt; p_dofend = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dofend'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dofend = new long[]{242, 266};

	/**
	 * Field descriptor (offset) for struct member 'dofmin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__dofmin);
	 * CPointer&lt;Short&gt; p_dofmin = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dofmin'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dofmin = new long[]{244, 268};

	/**
	 * Field descriptor (offset) for struct member 'dofmax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__dofmax);
	 * CPointer&lt;Short&gt; p_dofmax = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dofmax'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dofmax = new long[]{246, 270};

	/**
	 * Field descriptor (offset) for struct member 'aodist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ambient occlusion </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__aodist);
	 * CPointer&lt;Float&gt; p_aodist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aodist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aodist = new long[]{248, 272};

	/**
	 * Field descriptor (offset) for struct member 'aodistfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__aodistfac);
	 * CPointer&lt;Float&gt; p_aodistfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aodistfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aodistfac = new long[]{252, 276};

	/**
	 * Field descriptor (offset) for struct member 'aoenergy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__aoenergy);
	 * CPointer&lt;Float&gt; p_aoenergy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aoenergy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aoenergy = new long[]{256, 280};

	/**
	 * Field descriptor (offset) for struct member 'aobias'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__aobias);
	 * CPointer&lt;Float&gt; p_aobias = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aobias'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aobias = new long[]{260, 284};

	/**
	 * Field descriptor (offset) for struct member 'aomode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__aomode);
	 * CPointer&lt;Short&gt; p_aomode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aomode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aomode = new long[]{264, 288};

	/**
	 * Field descriptor (offset) for struct member 'aosamp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__aosamp);
	 * CPointer&lt;Short&gt; p_aosamp = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aosamp'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aosamp = new long[]{266, 290};

	/**
	 * Field descriptor (offset) for struct member 'aomix'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__aomix);
	 * CPointer&lt;Short&gt; p_aomix = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aomix'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aomix = new long[]{268, 292};

	/**
	 * Field descriptor (offset) for struct member 'aocolor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__aocolor);
	 * CPointer&lt;Short&gt; p_aocolor = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aocolor'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aocolor = new long[]{270, 294};

	/**
	 * Field descriptor (offset) for struct member 'ao_adapt_thresh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ao_adapt_thresh);
	 * CPointer&lt;Float&gt; p_ao_adapt_thresh = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ao_adapt_thresh'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ao_adapt_thresh = new long[]{272, 296};

	/**
	 * Field descriptor (offset) for struct member 'ao_adapt_speed_fac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ao_adapt_speed_fac);
	 * CPointer&lt;Float&gt; p_ao_adapt_speed_fac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ao_adapt_speed_fac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ao_adapt_speed_fac = new long[]{276, 300};

	/**
	 * Field descriptor (offset) for struct member 'ao_approx_error'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ao_approx_error);
	 * CPointer&lt;Float&gt; p_ao_approx_error = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ao_approx_error'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ao_approx_error = new long[]{280, 304};

	/**
	 * Field descriptor (offset) for struct member 'ao_approx_correction'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ao_approx_correction);
	 * CPointer&lt;Float&gt; p_ao_approx_correction = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ao_approx_correction'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ao_approx_correction = new long[]{284, 308};

	/**
	 * Field descriptor (offset) for struct member 'ao_indirect_energy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ao_indirect_energy);
	 * CPointer&lt;Float&gt; p_ao_indirect_energy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ao_indirect_energy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ao_indirect_energy = new long[]{288, 312};

	/**
	 * Field descriptor (offset) for struct member 'ao_env_energy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ao_env_energy);
	 * CPointer&lt;Float&gt; p_ao_env_energy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ao_env_energy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ao_env_energy = new long[]{292, 316};

	/**
	 * Field descriptor (offset) for struct member 'ao_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ao_pad2);
	 * CPointer&lt;Float&gt; p_ao_pad2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ao_pad2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ao_pad2 = new long[]{296, 320};

	/**
	 * Field descriptor (offset) for struct member 'ao_indirect_bounces'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ao_indirect_bounces);
	 * CPointer&lt;Short&gt; p_ao_indirect_bounces = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ao_indirect_bounces'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ao_indirect_bounces = new long[]{300, 324};

	/**
	 * Field descriptor (offset) for struct member 'ao_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ao_pad);
	 * CPointer&lt;Short&gt; p_ao_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ao_pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ao_pad = new long[]{302, 326};

	/**
	 * Field descriptor (offset) for struct member 'ao_samp_method'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ao_samp_method);
	 * CPointer&lt;Short&gt; p_ao_samp_method = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ao_samp_method'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ao_samp_method = new long[]{304, 328};

	/**
	 * Field descriptor (offset) for struct member 'ao_gather_method'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ao_gather_method);
	 * CPointer&lt;Short&gt; p_ao_gather_method = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ao_gather_method'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ao_gather_method = new long[]{306, 330};

	/**
	 * Field descriptor (offset) for struct member 'ao_approx_passes'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ao_approx_passes);
	 * CPointer&lt;Short&gt; p_ao_approx_passes = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ao_approx_passes'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ao_approx_passes = new long[]{308, 332};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> assorted settings (in the middle of ambient occlusion settings for padding reasons) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{310, 334};

	/**
	 * Field descriptor (offset) for struct member 'aosphere'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ambient occlusion (contd...) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__aosphere);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_aosphere = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aosphere'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aosphere = new long[]{312, 336};

	/**
	 * Field descriptor (offset) for struct member 'aotables'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__aotables);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_aotables = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aotables'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aotables = new long[]{316, 344};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{320, 352};

	/**
	 * Field descriptor (offset) for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__mtex);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;MTex&gt;&gt;&gt; p_mtex = p.cast(new Class[]{CArrayFacade.class, CPointer.class, MTex.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mtex'</li>
	 * <li>Signature: 'MTex*[18]'</li>
	 * <li>Actual Size (32bit/64bit): 72/144</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mtex = new long[]{324, 360};

	/**
	 * Field descriptor (offset) for struct member 'pr_texture'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__pr_texture);
	 * CPointer&lt;Short&gt; p_pr_texture = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pr_texture'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pr_texture = new long[]{396, 504};

	/**
	 * Field descriptor (offset) for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes to render the world
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__use_nodes);
	 * CPointer&lt;Short&gt; p_use_nodes = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_nodes'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_nodes = new long[]{398, 506};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short[2]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{400, 508};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)<h4>Blender Source Code:</h4>
	 * <p> previews </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__preview);
	 * CPointer&lt;CPointer&lt;PreviewImage&gt;&gt; p_preview = p.cast(new Class[]{CPointer.class, PreviewImage.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview'</li>
	 * <li>Signature: 'PreviewImage*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview = new long[]{404, 512};

	/**
	 * Field descriptor (offset) for struct member 'nodetree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> nodes </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__nodetree);
	 * CPointer&lt;CPointer&lt;bNodeTree&gt;&gt; p_nodetree = p.cast(new Class[]{CPointer.class, bNodeTree.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nodetree'</li>
	 * <li>Signature: 'bNodeTree*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nodetree = new long[]{408, 520};

	/**
	 * Field descriptor (offset) for struct member 'gpumaterial'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * World world = ...;
	 * CPointer&lt;Object&gt; p = world.__dna__addressof(World.__DNA__FIELD__gpumaterial);
	 * CPointer&lt;ListBase&gt; p_gpumaterial = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpumaterial'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpumaterial = new long[]{412, 528};

	public World(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected World(World that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public ID getId() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(ID id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, id);
		} else {
			__io__generic__copy( getId(), id);
		}
	}

	/**
	 * Get method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> animation data (must be immediately after id for utilities to use it) </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'colormodel'.
	 * @see #__DNA__FIELD__colormodel
	 */
	
	public short getColormodel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 128);
		} else {
			return __io__block.readShort(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'colormodel'.
	 * @see #__DNA__FIELD__colormodel
	 */
	
	public void setColormodel(short colormodel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 128, colormodel);
		} else {
			__io__block.writeShort(__io__address + 104, colormodel);
		}
	}

	/**
	 * Get method for struct member 'totex'.
	 * @see #__DNA__FIELD__totex
	 */
	
	public short getTotex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 130);
		} else {
			return __io__block.readShort(__io__address + 106);
		}
	}

	/**
	 * Set method for struct member 'totex'.
	 * @see #__DNA__FIELD__totex
	 */
	
	public void setTotex(short totex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 130, totex);
		} else {
			__io__block.writeShort(__io__address + 106, totex);
		}
	}

	/**
	 * Get method for struct member 'texact'.
	 * @see #__DNA__FIELD__texact
	 */
	
	public short getTexact() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 132);
		} else {
			return __io__block.readShort(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'texact'.
	 * @see #__DNA__FIELD__texact
	 */
	
	public void setTexact(short texact) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 132, texact);
		} else {
			__io__block.writeShort(__io__address + 108, texact);
		}
	}

	/**
	 * Get method for struct member 'mistype'.
	 * @see #__DNA__FIELD__mistype
	 */
	
	public short getMistype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 134);
		} else {
			return __io__block.readShort(__io__address + 110);
		}
	}

	/**
	 * Set method for struct member 'mistype'.
	 * @see #__DNA__FIELD__mistype
	 */
	
	public void setMistype(short mistype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 134, mistype);
		} else {
			__io__block.writeShort(__io__address + 110, mistype);
		}
	}

	/**
	 * Get method for struct member 'horr'.
	 * @see #__DNA__FIELD__horr
	 */
	
	public float getHorr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 136);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'horr'.
	 * @see #__DNA__FIELD__horr
	 */
	
	public void setHorr(float horr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 136, horr);
		} else {
			__io__block.writeFloat(__io__address + 112, horr);
		}
	}

	/**
	 * Get method for struct member 'horg'.
	 * @see #__DNA__FIELD__horg
	 */
	
	public float getHorg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'horg'.
	 * @see #__DNA__FIELD__horg
	 */
	
	public void setHorg(float horg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, horg);
		} else {
			__io__block.writeFloat(__io__address + 116, horg);
		}
	}

	/**
	 * Get method for struct member 'horb'.
	 * @see #__DNA__FIELD__horb
	 */
	
	public float getHorb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'horb'.
	 * @see #__DNA__FIELD__horb
	 */
	
	public void setHorb(float horb) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, horb);
		} else {
			__io__block.writeFloat(__io__address + 120, horb);
		}
	}

	/**
	 * Get method for struct member 'zenr'.
	 * @see #__DNA__FIELD__zenr
	 */
	
	public float getZenr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'zenr'.
	 * @see #__DNA__FIELD__zenr
	 */
	
	public void setZenr(float zenr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, zenr);
		} else {
			__io__block.writeFloat(__io__address + 124, zenr);
		}
	}

	/**
	 * Get method for struct member 'zeng'.
	 * @see #__DNA__FIELD__zeng
	 */
	
	public float getZeng() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'zeng'.
	 * @see #__DNA__FIELD__zeng
	 */
	
	public void setZeng(float zeng) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 152, zeng);
		} else {
			__io__block.writeFloat(__io__address + 128, zeng);
		}
	}

	/**
	 * Get method for struct member 'zenb'.
	 * @see #__DNA__FIELD__zenb
	 */
	
	public float getZenb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 156);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'zenb'.
	 * @see #__DNA__FIELD__zenb
	 */
	
	public void setZenb(float zenb) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 156, zenb);
		} else {
			__io__block.writeFloat(__io__address + 132, zenb);
		}
	}

	/**
	 * Get method for struct member 'ambr'.
	 * @see #__DNA__FIELD__ambr
	 */
	
	public float getAmbr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 160);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'ambr'.
	 * @see #__DNA__FIELD__ambr
	 */
	
	public void setAmbr(float ambr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 160, ambr);
		} else {
			__io__block.writeFloat(__io__address + 136, ambr);
		}
	}

	/**
	 * Get method for struct member 'ambg'.
	 * @see #__DNA__FIELD__ambg
	 */
	
	public float getAmbg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'ambg'.
	 * @see #__DNA__FIELD__ambg
	 */
	
	public void setAmbg(float ambg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, ambg);
		} else {
			__io__block.writeFloat(__io__address + 140, ambg);
		}
	}

	/**
	 * Get method for struct member 'ambb'.
	 * @see #__DNA__FIELD__ambb
	 */
	
	public float getAmbb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'ambb'.
	 * @see #__DNA__FIELD__ambb
	 */
	
	public void setAmbb(float ambb) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, ambb);
		} else {
			__io__block.writeFloat(__io__address + 144, ambb);
		}
	}

	/**
	 * Get method for struct member 'exposure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of exponential color correction for light<h4>Blender Source Code:</h4>
	 * <p> Exposure= mult factor. unused now, but maybe back later. Kept in to be upward compat. New is exp/range control. linfac & logfac are constants... don't belong in file, but allocating 8 bytes for temp mem isn't useful either. </p>
	 * @see #__DNA__FIELD__exposure
	 */
	
	public float getExposure() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'exposure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of exponential color correction for light<h4>Blender Source Code:</h4>
	 * <p> Exposure= mult factor. unused now, but maybe back later. Kept in to be upward compat. New is exp/range control. linfac & logfac are constants... don't belong in file, but allocating 8 bytes for temp mem isn't useful either. </p>
	 * @see #__DNA__FIELD__exposure
	 */
	
	public void setExposure(float exposure) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, exposure);
		} else {
			__io__block.writeFloat(__io__address + 148, exposure);
		}
	}

	/**
	 * Get method for struct member 'exp'.
	 * @see #__DNA__FIELD__exp
	 */
	
	public float getExp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'exp'.
	 * @see #__DNA__FIELD__exp
	 */
	
	public void setExp(float exp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, exp);
		} else {
			__io__block.writeFloat(__io__address + 152, exp);
		}
	}

	/**
	 * Get method for struct member 'range'.
	 * @see #__DNA__FIELD__range
	 */
	
	public float getRange() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'range'.
	 * @see #__DNA__FIELD__range
	 */
	
	public void setRange(float range) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, range);
		} else {
			__io__block.writeFloat(__io__address + 156, range);
		}
	}

	/**
	 * Get method for struct member 'linfac'.
	 * @see #__DNA__FIELD__linfac
	 */
	
	public float getLinfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'linfac'.
	 * @see #__DNA__FIELD__linfac
	 */
	
	public void setLinfac(float linfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, linfac);
		} else {
			__io__block.writeFloat(__io__address + 160, linfac);
		}
	}

	/**
	 * Get method for struct member 'logfac'.
	 * @see #__DNA__FIELD__logfac
	 */
	
	public float getLogfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 188);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'logfac'.
	 * @see #__DNA__FIELD__logfac
	 */
	
	public void setLogfac(float logfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 188, logfac);
		} else {
			__io__block.writeFloat(__io__address + 164, logfac);
		}
	}

	/**
	 * Get method for struct member 'gravity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gravitation constant for the game world </p>
	 * @see #__DNA__FIELD__gravity
	 */
	
	public float getGravity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'gravity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gravitation constant for the game world </p>
	 * @see #__DNA__FIELD__gravity
	 */
	
	public void setGravity(float gravity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, gravity);
		} else {
			__io__block.writeFloat(__io__address + 168, gravity);
		}
	}

	/**
	 * Get method for struct member 'activityBoxRadius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius of the activity bubble, in Manhattan length. Objects outside the box are activity-culled. </p>
	 * @see #__DNA__FIELD__activityBoxRadius
	 */
	
	public float getActivityBoxRadius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 196);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'activityBoxRadius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius of the activity bubble, in Manhattan length. Objects outside the box are activity-culled. </p>
	 * @see #__DNA__FIELD__activityBoxRadius
	 */
	
	public void setActivityBoxRadius(float activityBoxRadius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 196, activityBoxRadius);
		} else {
			__io__block.writeFloat(__io__address + 172, activityBoxRadius);
		}
	}

	/**
	 * Get method for struct member 'skytype'.
	 * @see #__DNA__FIELD__skytype
	 */
	
	public short getSkytype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 200);
		} else {
			return __io__block.readShort(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'skytype'.
	 * @see #__DNA__FIELD__skytype
	 */
	
	public void setSkytype(short skytype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 200, skytype);
		} else {
			__io__block.writeShort(__io__address + 176, skytype);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Some world modes bit 0: Do mist bit 1: Do stars bit 2: (reserved) depth of field bit 3: (gameengine): Activity culling is enabled. bit 4: ambient occlusion bit 5: (gameengine) : enable Bullet DBVT tree for view frustum culling </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public short getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 202);
		} else {
			return __io__block.readShort(__io__address + 178);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Some world modes bit 0: Do mist bit 1: Do stars bit 2: (reserved) depth of field bit 3: (gameengine): Activity culling is enabled. bit 4: ambient occlusion bit 5: (gameengine) : enable Bullet DBVT tree for view frustum culling </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(short mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 202, mode);
		} else {
			__io__block.writeShort(__io__address + 178, mode);
		}
	}

	/**
	 * Get method for struct member 'occlusionRes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> resolution of occlusion Z buffer in pixel </p>
	 * @see #__DNA__FIELD__occlusionRes
	 */
	
	public short getOcclusionRes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 204);
		} else {
			return __io__block.readShort(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'occlusionRes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> resolution of occlusion Z buffer in pixel </p>
	 * @see #__DNA__FIELD__occlusionRes
	 */
	
	public void setOcclusionRes(short occlusionRes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 204, occlusionRes);
		} else {
			__io__block.writeShort(__io__address + 180, occlusionRes);
		}
	}

	/**
	 * Get method for struct member 'physicsEngine'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX moved to scene->gamedata in 2.5. </p><p> here it's aligned </p>
	 * @see #__DNA__FIELD__physicsEngine
	 */
	
	public short getPhysicsEngine() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 206);
		} else {
			return __io__block.readShort(__io__address + 182);
		}
	}

	/**
	 * Set method for struct member 'physicsEngine'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX moved to scene->gamedata in 2.5. </p><p> here it's aligned </p>
	 * @see #__DNA__FIELD__physicsEngine
	 */
	
	public void setPhysicsEngine(short physicsEngine) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 206, physicsEngine);
		} else {
			__io__block.writeShort(__io__address + 182, physicsEngine);
		}
	}

	/**
	 * Get method for struct member 'ticrate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX moved to scene->gamedata in 2.5. </p>
	 * @see #__DNA__FIELD__ticrate
	 */
	
	public short getTicrate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 208);
		} else {
			return __io__block.readShort(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'ticrate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> XXX moved to scene->gamedata in 2.5. </p>
	 * @see #__DNA__FIELD__ticrate
	 */
	
	public void setTicrate(short ticrate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 208, ticrate);
		} else {
			__io__block.writeShort(__io__address + 184, ticrate);
		}
	}

	/**
	 * Get method for struct member 'maxlogicstep'.
	 * @see #__DNA__FIELD__maxlogicstep
	 */
	
	public short getMaxlogicstep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 210);
		} else {
			return __io__block.readShort(__io__address + 186);
		}
	}

	/**
	 * Set method for struct member 'maxlogicstep'.
	 * @see #__DNA__FIELD__maxlogicstep
	 */
	
	public void setMaxlogicstep(short maxlogicstep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 210, maxlogicstep);
		} else {
			__io__block.writeShort(__io__address + 186, maxlogicstep);
		}
	}

	/**
	 * Get method for struct member 'physubstep'.
	 * @see #__DNA__FIELD__physubstep
	 */
	
	public short getPhysubstep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 212);
		} else {
			return __io__block.readShort(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'physubstep'.
	 * @see #__DNA__FIELD__physubstep
	 */
	
	public void setPhysubstep(short physubstep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 212, physubstep);
		} else {
			__io__block.writeShort(__io__address + 188, physubstep);
		}
	}

	/**
	 * Get method for struct member 'maxphystep'.
	 * @see #__DNA__FIELD__maxphystep
	 */
	
	public short getMaxphystep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 214);
		} else {
			return __io__block.readShort(__io__address + 190);
		}
	}

	/**
	 * Set method for struct member 'maxphystep'.
	 * @see #__DNA__FIELD__maxphystep
	 */
	
	public void setMaxphystep(short maxphystep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 214, maxphystep);
		} else {
			__io__block.writeShort(__io__address + 190, maxphystep);
		}
	}

	/**
	 * Get method for struct member 'misi'.
	 * @see #__DNA__FIELD__misi
	 */
	
	public float getMisi() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 216);
		} else {
			return __io__block.readFloat(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'misi'.
	 * @see #__DNA__FIELD__misi
	 */
	
	public void setMisi(float misi) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 216, misi);
		} else {
			__io__block.writeFloat(__io__address + 192, misi);
		}
	}

	/**
	 * Get method for struct member 'miststa'.
	 * @see #__DNA__FIELD__miststa
	 */
	
	public float getMiststa() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 220);
		} else {
			return __io__block.readFloat(__io__address + 196);
		}
	}

	/**
	 * Set method for struct member 'miststa'.
	 * @see #__DNA__FIELD__miststa
	 */
	
	public void setMiststa(float miststa) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 220, miststa);
		} else {
			__io__block.writeFloat(__io__address + 196, miststa);
		}
	}

	/**
	 * Get method for struct member 'mistdist'.
	 * @see #__DNA__FIELD__mistdist
	 */
	
	public float getMistdist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 224);
		} else {
			return __io__block.readFloat(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'mistdist'.
	 * @see #__DNA__FIELD__mistdist
	 */
	
	public void setMistdist(float mistdist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 224, mistdist);
		} else {
			__io__block.writeFloat(__io__address + 200, mistdist);
		}
	}

	/**
	 * Get method for struct member 'misthi'.
	 * @see #__DNA__FIELD__misthi
	 */
	
	public float getMisthi() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 228);
		} else {
			return __io__block.readFloat(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'misthi'.
	 * @see #__DNA__FIELD__misthi
	 */
	
	public void setMisthi(float misthi) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 228, misthi);
		} else {
			__io__block.writeFloat(__io__address + 204, misthi);
		}
	}

	/**
	 * Get method for struct member 'starr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__starr
	 */
	
	public float getStarr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 232);
		} else {
			return __io__block.readFloat(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'starr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__starr
	 */
	
	public void setStarr(float starr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 232, starr);
		} else {
			__io__block.writeFloat(__io__address + 208, starr);
		}
	}

	/**
	 * Get method for struct member 'starg'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__starg
	 */
	
	public float getStarg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 236);
		} else {
			return __io__block.readFloat(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'starg'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__starg
	 */
	
	public void setStarg(float starg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 236, starg);
		} else {
			__io__block.writeFloat(__io__address + 212, starg);
		}
	}

	/**
	 * Get method for struct member 'starb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__starb
	 */
	
	public float getStarb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 240);
		} else {
			return __io__block.readFloat(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'starb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__starb
	 */
	
	public void setStarb(float starb) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 240, starb);
		} else {
			__io__block.writeFloat(__io__address + 216, starb);
		}
	}

	/**
	 * Get method for struct member 'stark'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> Deprecated </p>
	 * @deprecated
	 *  DeprecatedDeprecated </p>
	 * @see #__DNA__FIELD__stark
	 */
	
	public float getStark() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 244);
		} else {
			return __io__block.readFloat(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'stark'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> Deprecated </p>
	 * @deprecated
	 *  DeprecatedDeprecated </p>
	 * @see #__DNA__FIELD__stark
	 */
	
	public void setStark(float stark) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 244, stark);
		} else {
			__io__block.writeFloat(__io__address + 220, stark);
		}
	}

	/**
	 * Get method for struct member 'starsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__starsize
	 */
	
	public float getStarsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 248);
		} else {
			return __io__block.readFloat(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'starsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__starsize
	 */
	
	public void setStarsize(float starsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 248, starsize);
		} else {
			__io__block.writeFloat(__io__address + 224, starsize);
		}
	}

	/**
	 * Get method for struct member 'starmindist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__starmindist
	 */
	
	public float getStarmindist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 252);
		} else {
			return __io__block.readFloat(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'starmindist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__starmindist
	 */
	
	public void setStarmindist(float starmindist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 252, starmindist);
		} else {
			__io__block.writeFloat(__io__address + 228, starmindist);
		}
	}

	/**
	 * Get method for struct member 'stardist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__stardist
	 */
	
	public float getStardist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 256);
		} else {
			return __io__block.readFloat(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'stardist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__stardist
	 */
	
	public void setStardist(float stardist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 256, stardist);
		} else {
			__io__block.writeFloat(__io__address + 232, stardist);
		}
	}

	/**
	 * Get method for struct member 'starcolnoise'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__starcolnoise
	 */
	
	public float getStarcolnoise() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 260);
		} else {
			return __io__block.readFloat(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'starcolnoise'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__starcolnoise
	 */
	
	public void setStarcolnoise(float starcolnoise) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 260, starcolnoise);
		} else {
			__io__block.writeFloat(__io__address + 236, starcolnoise);
		}
	}

	/**
	 * Get method for struct member 'dofsta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unused now: DOF </p>
	 * @see #__DNA__FIELD__dofsta
	 */
	
	public short getDofsta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 264);
		} else {
			return __io__block.readShort(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'dofsta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> unused now: DOF </p>
	 * @see #__DNA__FIELD__dofsta
	 */
	
	public void setDofsta(short dofsta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 264, dofsta);
		} else {
			__io__block.writeShort(__io__address + 240, dofsta);
		}
	}

	/**
	 * Get method for struct member 'dofend'.
	 * @see #__DNA__FIELD__dofend
	 */
	
	public short getDofend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 266);
		} else {
			return __io__block.readShort(__io__address + 242);
		}
	}

	/**
	 * Set method for struct member 'dofend'.
	 * @see #__DNA__FIELD__dofend
	 */
	
	public void setDofend(short dofend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 266, dofend);
		} else {
			__io__block.writeShort(__io__address + 242, dofend);
		}
	}

	/**
	 * Get method for struct member 'dofmin'.
	 * @see #__DNA__FIELD__dofmin
	 */
	
	public short getDofmin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 268);
		} else {
			return __io__block.readShort(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'dofmin'.
	 * @see #__DNA__FIELD__dofmin
	 */
	
	public void setDofmin(short dofmin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 268, dofmin);
		} else {
			__io__block.writeShort(__io__address + 244, dofmin);
		}
	}

	/**
	 * Get method for struct member 'dofmax'.
	 * @see #__DNA__FIELD__dofmax
	 */
	
	public short getDofmax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 270);
		} else {
			return __io__block.readShort(__io__address + 246);
		}
	}

	/**
	 * Set method for struct member 'dofmax'.
	 * @see #__DNA__FIELD__dofmax
	 */
	
	public void setDofmax(short dofmax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 270, dofmax);
		} else {
			__io__block.writeShort(__io__address + 246, dofmax);
		}
	}

	/**
	 * Get method for struct member 'aodist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ambient occlusion </p>
	 * @see #__DNA__FIELD__aodist
	 */
	
	public float getAodist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 272);
		} else {
			return __io__block.readFloat(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'aodist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ambient occlusion </p>
	 * @see #__DNA__FIELD__aodist
	 */
	
	public void setAodist(float aodist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 272, aodist);
		} else {
			__io__block.writeFloat(__io__address + 248, aodist);
		}
	}

	/**
	 * Get method for struct member 'aodistfac'.
	 * @see #__DNA__FIELD__aodistfac
	 */
	
	public float getAodistfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 276);
		} else {
			return __io__block.readFloat(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'aodistfac'.
	 * @see #__DNA__FIELD__aodistfac
	 */
	
	public void setAodistfac(float aodistfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 276, aodistfac);
		} else {
			__io__block.writeFloat(__io__address + 252, aodistfac);
		}
	}

	/**
	 * Get method for struct member 'aoenergy'.
	 * @see #__DNA__FIELD__aoenergy
	 */
	
	public float getAoenergy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 280);
		} else {
			return __io__block.readFloat(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'aoenergy'.
	 * @see #__DNA__FIELD__aoenergy
	 */
	
	public void setAoenergy(float aoenergy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 280, aoenergy);
		} else {
			__io__block.writeFloat(__io__address + 256, aoenergy);
		}
	}

	/**
	 * Get method for struct member 'aobias'.
	 * @see #__DNA__FIELD__aobias
	 */
	
	public float getAobias() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 284);
		} else {
			return __io__block.readFloat(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'aobias'.
	 * @see #__DNA__FIELD__aobias
	 */
	
	public void setAobias(float aobias) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 284, aobias);
		} else {
			__io__block.writeFloat(__io__address + 260, aobias);
		}
	}

	/**
	 * Get method for struct member 'aomode'.
	 * @see #__DNA__FIELD__aomode
	 */
	
	public short getAomode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 288);
		} else {
			return __io__block.readShort(__io__address + 264);
		}
	}

	/**
	 * Set method for struct member 'aomode'.
	 * @see #__DNA__FIELD__aomode
	 */
	
	public void setAomode(short aomode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 288, aomode);
		} else {
			__io__block.writeShort(__io__address + 264, aomode);
		}
	}

	/**
	 * Get method for struct member 'aosamp'.
	 * @see #__DNA__FIELD__aosamp
	 */
	
	public short getAosamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 290);
		} else {
			return __io__block.readShort(__io__address + 266);
		}
	}

	/**
	 * Set method for struct member 'aosamp'.
	 * @see #__DNA__FIELD__aosamp
	 */
	
	public void setAosamp(short aosamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 290, aosamp);
		} else {
			__io__block.writeShort(__io__address + 266, aosamp);
		}
	}

	/**
	 * Get method for struct member 'aomix'.
	 * @see #__DNA__FIELD__aomix
	 */
	
	public short getAomix() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 292);
		} else {
			return __io__block.readShort(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'aomix'.
	 * @see #__DNA__FIELD__aomix
	 */
	
	public void setAomix(short aomix) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 292, aomix);
		} else {
			__io__block.writeShort(__io__address + 268, aomix);
		}
	}

	/**
	 * Get method for struct member 'aocolor'.
	 * @see #__DNA__FIELD__aocolor
	 */
	
	public short getAocolor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 294);
		} else {
			return __io__block.readShort(__io__address + 270);
		}
	}

	/**
	 * Set method for struct member 'aocolor'.
	 * @see #__DNA__FIELD__aocolor
	 */
	
	public void setAocolor(short aocolor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 294, aocolor);
		} else {
			__io__block.writeShort(__io__address + 270, aocolor);
		}
	}

	/**
	 * Get method for struct member 'ao_adapt_thresh'.
	 * @see #__DNA__FIELD__ao_adapt_thresh
	 */
	
	public float getAo_adapt_thresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 296);
		} else {
			return __io__block.readFloat(__io__address + 272);
		}
	}

	/**
	 * Set method for struct member 'ao_adapt_thresh'.
	 * @see #__DNA__FIELD__ao_adapt_thresh
	 */
	
	public void setAo_adapt_thresh(float ao_adapt_thresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 296, ao_adapt_thresh);
		} else {
			__io__block.writeFloat(__io__address + 272, ao_adapt_thresh);
		}
	}

	/**
	 * Get method for struct member 'ao_adapt_speed_fac'.
	 * @see #__DNA__FIELD__ao_adapt_speed_fac
	 */
	
	public float getAo_adapt_speed_fac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 300);
		} else {
			return __io__block.readFloat(__io__address + 276);
		}
	}

	/**
	 * Set method for struct member 'ao_adapt_speed_fac'.
	 * @see #__DNA__FIELD__ao_adapt_speed_fac
	 */
	
	public void setAo_adapt_speed_fac(float ao_adapt_speed_fac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 300, ao_adapt_speed_fac);
		} else {
			__io__block.writeFloat(__io__address + 276, ao_adapt_speed_fac);
		}
	}

	/**
	 * Get method for struct member 'ao_approx_error'.
	 * @see #__DNA__FIELD__ao_approx_error
	 */
	
	public float getAo_approx_error() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 304);
		} else {
			return __io__block.readFloat(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'ao_approx_error'.
	 * @see #__DNA__FIELD__ao_approx_error
	 */
	
	public void setAo_approx_error(float ao_approx_error) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 304, ao_approx_error);
		} else {
			__io__block.writeFloat(__io__address + 280, ao_approx_error);
		}
	}

	/**
	 * Get method for struct member 'ao_approx_correction'.
	 * @see #__DNA__FIELD__ao_approx_correction
	 */
	
	public float getAo_approx_correction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 308);
		} else {
			return __io__block.readFloat(__io__address + 284);
		}
	}

	/**
	 * Set method for struct member 'ao_approx_correction'.
	 * @see #__DNA__FIELD__ao_approx_correction
	 */
	
	public void setAo_approx_correction(float ao_approx_correction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 308, ao_approx_correction);
		} else {
			__io__block.writeFloat(__io__address + 284, ao_approx_correction);
		}
	}

	/**
	 * Get method for struct member 'ao_indirect_energy'.
	 * @see #__DNA__FIELD__ao_indirect_energy
	 */
	
	public float getAo_indirect_energy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 312);
		} else {
			return __io__block.readFloat(__io__address + 288);
		}
	}

	/**
	 * Set method for struct member 'ao_indirect_energy'.
	 * @see #__DNA__FIELD__ao_indirect_energy
	 */
	
	public void setAo_indirect_energy(float ao_indirect_energy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 312, ao_indirect_energy);
		} else {
			__io__block.writeFloat(__io__address + 288, ao_indirect_energy);
		}
	}

	/**
	 * Get method for struct member 'ao_env_energy'.
	 * @see #__DNA__FIELD__ao_env_energy
	 */
	
	public float getAo_env_energy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 316);
		} else {
			return __io__block.readFloat(__io__address + 292);
		}
	}

	/**
	 * Set method for struct member 'ao_env_energy'.
	 * @see #__DNA__FIELD__ao_env_energy
	 */
	
	public void setAo_env_energy(float ao_env_energy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 316, ao_env_energy);
		} else {
			__io__block.writeFloat(__io__address + 292, ao_env_energy);
		}
	}

	/**
	 * Get method for struct member 'ao_pad2'.
	 * @see #__DNA__FIELD__ao_pad2
	 */
	
	public float getAo_pad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 320);
		} else {
			return __io__block.readFloat(__io__address + 296);
		}
	}

	/**
	 * Set method for struct member 'ao_pad2'.
	 * @see #__DNA__FIELD__ao_pad2
	 */
	
	public void setAo_pad2(float ao_pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 320, ao_pad2);
		} else {
			__io__block.writeFloat(__io__address + 296, ao_pad2);
		}
	}

	/**
	 * Get method for struct member 'ao_indirect_bounces'.
	 * @see #__DNA__FIELD__ao_indirect_bounces
	 */
	
	public short getAo_indirect_bounces() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 324);
		} else {
			return __io__block.readShort(__io__address + 300);
		}
	}

	/**
	 * Set method for struct member 'ao_indirect_bounces'.
	 * @see #__DNA__FIELD__ao_indirect_bounces
	 */
	
	public void setAo_indirect_bounces(short ao_indirect_bounces) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 324, ao_indirect_bounces);
		} else {
			__io__block.writeShort(__io__address + 300, ao_indirect_bounces);
		}
	}

	/**
	 * Get method for struct member 'ao_pad'.
	 * @see #__DNA__FIELD__ao_pad
	 */
	
	public short getAo_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 326);
		} else {
			return __io__block.readShort(__io__address + 302);
		}
	}

	/**
	 * Set method for struct member 'ao_pad'.
	 * @see #__DNA__FIELD__ao_pad
	 */
	
	public void setAo_pad(short ao_pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 326, ao_pad);
		} else {
			__io__block.writeShort(__io__address + 302, ao_pad);
		}
	}

	/**
	 * Get method for struct member 'ao_samp_method'.
	 * @see #__DNA__FIELD__ao_samp_method
	 */
	
	public short getAo_samp_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 328);
		} else {
			return __io__block.readShort(__io__address + 304);
		}
	}

	/**
	 * Set method for struct member 'ao_samp_method'.
	 * @see #__DNA__FIELD__ao_samp_method
	 */
	
	public void setAo_samp_method(short ao_samp_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 328, ao_samp_method);
		} else {
			__io__block.writeShort(__io__address + 304, ao_samp_method);
		}
	}

	/**
	 * Get method for struct member 'ao_gather_method'.
	 * @see #__DNA__FIELD__ao_gather_method
	 */
	
	public short getAo_gather_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 330);
		} else {
			return __io__block.readShort(__io__address + 306);
		}
	}

	/**
	 * Set method for struct member 'ao_gather_method'.
	 * @see #__DNA__FIELD__ao_gather_method
	 */
	
	public void setAo_gather_method(short ao_gather_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 330, ao_gather_method);
		} else {
			__io__block.writeShort(__io__address + 306, ao_gather_method);
		}
	}

	/**
	 * Get method for struct member 'ao_approx_passes'.
	 * @see #__DNA__FIELD__ao_approx_passes
	 */
	
	public short getAo_approx_passes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 332);
		} else {
			return __io__block.readShort(__io__address + 308);
		}
	}

	/**
	 * Set method for struct member 'ao_approx_passes'.
	 * @see #__DNA__FIELD__ao_approx_passes
	 */
	
	public void setAo_approx_passes(short ao_approx_passes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 332, ao_approx_passes);
		} else {
			__io__block.writeShort(__io__address + 308, ao_approx_passes);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> assorted settings (in the middle of ambient occlusion settings for padding reasons) </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 334);
		} else {
			return __io__block.readShort(__io__address + 310);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> assorted settings (in the middle of ambient occlusion settings for padding reasons) </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 334, flag);
		} else {
			__io__block.writeShort(__io__address + 310, flag);
		}
	}

	/**
	 * Get method for struct member 'aosphere'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ambient occlusion (contd...) </p>
	 * @see #__DNA__FIELD__aosphere
	 */
	
	public CPointer<Float> getAosphere() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 336);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 312);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'aosphere'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ambient occlusion (contd...) </p>
	 * @see #__DNA__FIELD__aosphere
	 */
	
	public void setAosphere(CPointer<Float> aosphere) throws IOException
	{
		long __address = ((aosphere == null) ? 0 : aosphere.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 336, __address);
		} else {
			__io__block.writeLong(__io__address + 312, __address);
		}
	}

	/**
	 * Get method for struct member 'aotables'.
	 * @see #__DNA__FIELD__aotables
	 */
	
	public CPointer<Float> getAotables() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 344);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 316);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'aotables'.
	 * @see #__DNA__FIELD__aotables
	 */
	
	public void setAotables(CPointer<Float> aotables) throws IOException
	{
		long __address = ((aotables == null) ? 0 : aotables.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 344, __address);
		} else {
			__io__block.writeLong(__io__address + 316, __address);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 352);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 320);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><p> old animation system, deprecated for 2.5 </p>
	 * @deprecated
	 *  Deprecatedold animation system, deprecated for 2.5 </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 352, __address);
		} else {
			__io__block.writeLong(__io__address + 320, __address);
		}
	}

	/**
	 * Get method for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX </p>
	 * @see #__DNA__FIELD__mtex
	 */
	
	public CArrayFacade<CPointer<MTex>> getMtex() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, MTex.class};
		int[] __dna__dimensions = new int[]{
			18
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<MTex>>(__io__address + 360, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<MTex>>(__io__address + 324, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mtex'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_MTEX </p>
	 * @see #__DNA__FIELD__mtex
	 */
	
	public void setMtex(CArrayFacade<CPointer<MTex>> mtex) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 360;
		} else {
			__dna__offset = 324;
		}
		if (__io__equals(mtex, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mtex)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mtex);
		} else {
			__io__generic__copy( getMtex(), mtex);
		}
	}

	/**
	 * Get method for struct member 'pr_texture'.
	 * @see #__DNA__FIELD__pr_texture
	 */
	
	public short getPr_texture() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 504);
		} else {
			return __io__block.readShort(__io__address + 396);
		}
	}

	/**
	 * Set method for struct member 'pr_texture'.
	 * @see #__DNA__FIELD__pr_texture
	 */
	
	public void setPr_texture(short pr_texture) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 504, pr_texture);
		} else {
			__io__block.writeShort(__io__address + 396, pr_texture);
		}
	}

	/**
	 * Get method for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes to render the world
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public short getUse_nodes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 506);
		} else {
			return __io__block.readShort(__io__address + 398);
		}
	}

	/**
	 * Set method for struct member 'use_nodes'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Use shader nodes to render the world
	 * @see #__DNA__FIELD__use_nodes
	 */
	
	public void setUse_nodes(short use_nodes) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 506, use_nodes);
		} else {
			__io__block.writeShort(__io__address + 398, use_nodes);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 508, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 400, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 508;
		} else {
			__dna__offset = 400;
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
	 * Get method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)<h4>Blender Source Code:</h4>
	 * <p> previews </p>
	 * @see #__DNA__FIELD__preview
	 */
	
	public CPointer<PreviewImage> getPreview() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 512);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 404);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PreviewImage.class};
		return new CPointer<PreviewImage>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PreviewImage.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'preview'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Preview image and icon of this data-block (None if not supported for this type of data)<h4>Blender Source Code:</h4>
	 * <p> previews </p>
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(CPointer<PreviewImage> preview) throws IOException
	{
		long __address = ((preview == null) ? 0 : preview.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 512, __address);
		} else {
			__io__block.writeLong(__io__address + 404, __address);
		}
	}

	/**
	 * Get method for struct member 'nodetree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> nodes </p>
	 * @see #__DNA__FIELD__nodetree
	 */
	
	public CPointer<bNodeTree> getNodetree() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 520);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 408);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNodeTree.class};
		return new CPointer<bNodeTree>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNodeTree.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'nodetree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> nodes </p>
	 * @see #__DNA__FIELD__nodetree
	 */
	
	public void setNodetree(CPointer<bNodeTree> nodetree) throws IOException
	{
		long __address = ((nodetree == null) ? 0 : nodetree.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 520, __address);
		} else {
			__io__block.writeLong(__io__address + 408, __address);
		}
	}

	/**
	 * Get method for struct member 'gpumaterial'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime </p>
	 * @see #__DNA__FIELD__gpumaterial
	 */
	
	public ListBase getGpumaterial() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 528, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 412, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gpumaterial'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> runtime </p>
	 * @see #__DNA__FIELD__gpumaterial
	 */
	
	public void setGpumaterial(ListBase gpumaterial) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 528;
		} else {
			__dna__offset = 412;
		}
		if (__io__equals(gpumaterial, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gpumaterial)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gpumaterial);
		} else {
			__io__generic__copy( getGpumaterial(), gpumaterial);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<World> __io__addressof() {
		return new CPointer<World>(__io__address, new Class[]{World.class}, __io__block, __io__blockTable);
	}

}
