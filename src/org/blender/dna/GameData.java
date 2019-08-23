package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'GameData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=188, size64=192)
public class GameData extends CFacade {

	/**
	 * This is the sdna index of the struct GameData.
	 * <p>
	 * It is required when allocating a new block to store data for GameData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 180;

	/**
	 * Field descriptor (offset) for struct member 'framing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> standalone player </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__framing);
	 * CPointer&lt;GameFraming&gt; p_framing = p.cast(new Class[]{GameFraming.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'framing'</li>
	 * <li>Signature: 'GameFraming'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__framing = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'playerflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__playerflag);
	 * CPointer&lt;Short&gt; p_playerflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'playerflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__playerflag = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'xplay'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__xplay);
	 * CPointer&lt;Short&gt; p_xplay = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xplay'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xplay = new long[]{18, 18};

	/**
	 * Field descriptor (offset) for struct member 'yplay'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__yplay);
	 * CPointer&lt;Short&gt; p_yplay = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yplay'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yplay = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'freqplay'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__freqplay);
	 * CPointer&lt;Short&gt; p_freqplay = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'freqplay'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__freqplay = new long[]{22, 22};

	/**
	 * Field descriptor (offset) for struct member 'depth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__depth);
	 * CPointer&lt;Short&gt; p_depth = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'depth'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__depth = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'attrib'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__attrib);
	 * CPointer&lt;Short&gt; p_attrib = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attrib'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attrib = new long[]{26, 26};

	/**
	 * Field descriptor (offset) for struct member 'rt1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__rt1);
	 * CPointer&lt;Short&gt; p_rt1 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rt1'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rt1 = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'rt2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__rt2);
	 * CPointer&lt;Short&gt; p_rt2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rt2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rt2 = new long[]{30, 30};

	/**
	 * Field descriptor (offset) for struct member 'aasamples'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__aasamples);
	 * CPointer&lt;Short&gt; p_aasamples = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aasamples'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aasamples = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__pad4);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_pad4 = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad4'</li>
	 * <li>Signature: 'short[3]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad4 = new long[]{34, 34};

	/**
	 * Field descriptor (offset) for struct member 'dome'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> stereo/dome mode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__dome);
	 * CPointer&lt;GameDome&gt; p_dome = p.cast(new Class[]{GameDome.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dome'</li>
	 * <li>Signature: 'GameDome'</li>
	 * <li>Actual Size (32bit/64bit): 20/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dome = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'stereoflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__stereoflag);
	 * CPointer&lt;Short&gt; p_stereoflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stereoflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stereoflag = new long[]{60, 64};

	/**
	 * Field descriptor (offset) for struct member 'stereomode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__stereomode);
	 * CPointer&lt;Short&gt; p_stereomode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stereomode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stereomode = new long[]{62, 66};

	/**
	 * Field descriptor (offset) for struct member 'eyeseparation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__eyeseparation);
	 * CPointer&lt;Float&gt; p_eyeseparation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eyeseparation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eyeseparation = new long[]{64, 68};

	/**
	 * Field descriptor (offset) for struct member 'recastData'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__recastData);
	 * CPointer&lt;RecastData&gt; p_recastData = p.cast(new Class[]{RecastData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'recastData'</li>
	 * <li>Signature: 'RecastData'</li>
	 * <li>Actual Size (32bit/64bit): 56/56</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__recastData = new long[]{68, 72};

	/**
	 * Field descriptor (offset) for struct member 'gravity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> physics (it was in world) Gravitation constant for the game world </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__gravity);
	 * CPointer&lt;Float&gt; p_gravity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gravity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gravity = new long[]{124, 128};

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
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__activityBoxRadius);
	 * CPointer&lt;Float&gt; p_activityBoxRadius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'activityBoxRadius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__activityBoxRadius = new long[]{128, 132};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bit 3: (gameengine): Activity culling is enabled. bit 5: (gameengine) : enable Bullet DBVT tree for view frustum culling </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{132, 136};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__mode);
	 * CPointer&lt;Short&gt; p_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{136, 140};

	/**
	 * Field descriptor (offset) for struct member 'matmode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__matmode);
	 * CPointer&lt;Short&gt; p_matmode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'matmode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__matmode = new long[]{138, 142};

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
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__occlusionRes);
	 * CPointer&lt;Short&gt; p_occlusionRes = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'occlusionRes'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__occlusionRes = new long[]{140, 144};

	/**
	 * Field descriptor (offset) for struct member 'physicsEngine'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__physicsEngine);
	 * CPointer&lt;Short&gt; p_physicsEngine = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'physicsEngine'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__physicsEngine = new long[]{142, 146};

	/**
	 * Field descriptor (offset) for struct member 'exitkey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__exitkey);
	 * CPointer&lt;Short&gt; p_exitkey = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'exitkey'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__exitkey = new long[]{144, 148};

	/**
	 * Field descriptor (offset) for struct member 'vsync'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Controls vsync: off, on, or adaptive (if supported) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__vsync);
	 * CPointer&lt;Short&gt; p_vsync = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vsync'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vsync = new long[]{146, 150};

	/**
	 * Field descriptor (offset) for struct member 'ticrate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__ticrate);
	 * CPointer&lt;Short&gt; p_ticrate = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ticrate'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ticrate = new long[]{148, 152};

	/**
	 * Field descriptor (offset) for struct member 'maxlogicstep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__maxlogicstep);
	 * CPointer&lt;Short&gt; p_maxlogicstep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxlogicstep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxlogicstep = new long[]{150, 154};

	/**
	 * Field descriptor (offset) for struct member 'physubstep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__physubstep);
	 * CPointer&lt;Short&gt; p_physubstep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'physubstep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__physubstep = new long[]{152, 156};

	/**
	 * Field descriptor (offset) for struct member 'maxphystep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__maxphystep);
	 * CPointer&lt;Short&gt; p_maxphystep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxphystep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxphystep = new long[]{154, 158};

	/**
	 * Field descriptor (offset) for struct member 'obstacleSimulation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__obstacleSimulation);
	 * CPointer&lt;Short&gt; p_obstacleSimulation = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'obstacleSimulation'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__obstacleSimulation = new long[]{156, 160};

	/**
	 * Field descriptor (offset) for struct member 'raster_storage'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__raster_storage);
	 * CPointer&lt;Short&gt; p_raster_storage = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'raster_storage'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__raster_storage = new long[]{158, 162};

	/**
	 * Field descriptor (offset) for struct member 'levelHeight'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__levelHeight);
	 * CPointer&lt;Float&gt; p_levelHeight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'levelHeight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__levelHeight = new long[]{160, 164};

	/**
	 * Field descriptor (offset) for struct member 'deactivationtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__deactivationtime);
	 * CPointer&lt;Float&gt; p_deactivationtime = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'deactivationtime'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__deactivationtime = new long[]{164, 168};

	/**
	 * Field descriptor (offset) for struct member 'lineardeactthreshold'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__lineardeactthreshold);
	 * CPointer&lt;Float&gt; p_lineardeactthreshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lineardeactthreshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lineardeactthreshold = new long[]{168, 172};

	/**
	 * Field descriptor (offset) for struct member 'angulardeactthreshold'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__angulardeactthreshold);
	 * CPointer&lt;Float&gt; p_angulardeactthreshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angulardeactthreshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angulardeactthreshold = new long[]{172, 176};

	/**
	 * Field descriptor (offset) for struct member 'lodflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Scene}  LoD </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__lodflag);
	 * CPointer&lt;Short&gt; p_lodflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lodflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lodflag = new long[]{176, 180};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__pad2);
	 * CPointer&lt;Short&gt; p_pad2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{178, 182};

	/**
	 * Field descriptor (offset) for struct member 'scehysteresis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__scehysteresis);
	 * CPointer&lt;Integer&gt; p_scehysteresis = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scehysteresis'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scehysteresis = new long[]{180, 184};

	/**
	 * Field descriptor (offset) for struct member 'pad5'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GameData gamedata = ...;
	 * CPointer&lt;Object&gt; p = gamedata.__dna__addressof(GameData.__DNA__FIELD__pad5);
	 * CPointer&lt;Integer&gt; p_pad5 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad5'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad5 = new long[]{184, 188};

	public GameData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected GameData(GameData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'framing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> standalone player </p>
	 * @see #__DNA__FIELD__framing
	 */
	
	public GameFraming getFraming() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GameFraming(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new GameFraming(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'framing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> standalone player </p>
	 * @see #__DNA__FIELD__framing
	 */
	
	public void setFraming(GameFraming framing) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(framing, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, framing)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, framing);
		} else {
			__io__generic__copy( getFraming(), framing);
		}
	}

	/**
	 * Get method for struct member 'playerflag'.
	 * @see #__DNA__FIELD__playerflag
	 */
	
	public short getPlayerflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'playerflag'.
	 * @see #__DNA__FIELD__playerflag
	 */
	
	public void setPlayerflag(short playerflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, playerflag);
		} else {
			__io__block.writeShort(__io__address + 16, playerflag);
		}
	}

	/**
	 * Get method for struct member 'xplay'.
	 * @see #__DNA__FIELD__xplay
	 */
	
	public short getXplay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'xplay'.
	 * @see #__DNA__FIELD__xplay
	 */
	
	public void setXplay(short xplay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, xplay);
		} else {
			__io__block.writeShort(__io__address + 18, xplay);
		}
	}

	/**
	 * Get method for struct member 'yplay'.
	 * @see #__DNA__FIELD__yplay
	 */
	
	public short getYplay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'yplay'.
	 * @see #__DNA__FIELD__yplay
	 */
	
	public void setYplay(short yplay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, yplay);
		} else {
			__io__block.writeShort(__io__address + 20, yplay);
		}
	}

	/**
	 * Get method for struct member 'freqplay'.
	 * @see #__DNA__FIELD__freqplay
	 */
	
	public short getFreqplay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 22);
		} else {
			return __io__block.readShort(__io__address + 22);
		}
	}

	/**
	 * Set method for struct member 'freqplay'.
	 * @see #__DNA__FIELD__freqplay
	 */
	
	public void setFreqplay(short freqplay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 22, freqplay);
		} else {
			__io__block.writeShort(__io__address + 22, freqplay);
		}
	}

	/**
	 * Get method for struct member 'depth'.
	 * @see #__DNA__FIELD__depth
	 */
	
	public short getDepth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'depth'.
	 * @see #__DNA__FIELD__depth
	 */
	
	public void setDepth(short depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, depth);
		} else {
			__io__block.writeShort(__io__address + 24, depth);
		}
	}

	/**
	 * Get method for struct member 'attrib'.
	 * @see #__DNA__FIELD__attrib
	 */
	
	public short getAttrib() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 26);
		} else {
			return __io__block.readShort(__io__address + 26);
		}
	}

	/**
	 * Set method for struct member 'attrib'.
	 * @see #__DNA__FIELD__attrib
	 */
	
	public void setAttrib(short attrib) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 26, attrib);
		} else {
			__io__block.writeShort(__io__address + 26, attrib);
		}
	}

	/**
	 * Get method for struct member 'rt1'.
	 * @see #__DNA__FIELD__rt1
	 */
	
	public short getRt1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 28);
		} else {
			return __io__block.readShort(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'rt1'.
	 * @see #__DNA__FIELD__rt1
	 */
	
	public void setRt1(short rt1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 28, rt1);
		} else {
			__io__block.writeShort(__io__address + 28, rt1);
		}
	}

	/**
	 * Get method for struct member 'rt2'.
	 * @see #__DNA__FIELD__rt2
	 */
	
	public short getRt2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 30);
		} else {
			return __io__block.readShort(__io__address + 30);
		}
	}

	/**
	 * Set method for struct member 'rt2'.
	 * @see #__DNA__FIELD__rt2
	 */
	
	public void setRt2(short rt2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 30, rt2);
		} else {
			__io__block.writeShort(__io__address + 30, rt2);
		}
	}

	/**
	 * Get method for struct member 'aasamples'.
	 * @see #__DNA__FIELD__aasamples
	 */
	
	public short getAasamples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 32);
		} else {
			return __io__block.readShort(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'aasamples'.
	 * @see #__DNA__FIELD__aasamples
	 */
	
	public void setAasamples(short aasamples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 32, aasamples);
		} else {
			__io__block.writeShort(__io__address + 32, aasamples);
		}
	}

	/**
	 * Get method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public CArrayFacade<Short> getPad4() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 34, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 34, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad4'.
	 * @see #__DNA__FIELD__pad4
	 */
	
	public void setPad4(CArrayFacade<Short> pad4) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 34;
		} else {
			__dna__offset = 34;
		}
		if (__io__equals(pad4, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad4)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad4);
		} else {
			__io__generic__copy( getPad4(), pad4);
		}
	}

	/**
	 * Get method for struct member 'dome'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> stereo/dome mode </p>
	 * @see #__DNA__FIELD__dome
	 */
	
	public GameDome getDome() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GameDome(__io__address + 40, __io__block, __io__blockTable);
		} else {
			return new GameDome(__io__address + 40, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dome'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> stereo/dome mode </p>
	 * @see #__DNA__FIELD__dome
	 */
	
	public void setDome(GameDome dome) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(dome, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dome)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dome);
		} else {
			__io__generic__copy( getDome(), dome);
		}
	}

	/**
	 * Get method for struct member 'stereoflag'.
	 * @see #__DNA__FIELD__stereoflag
	 */
	
	public short getStereoflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 64);
		} else {
			return __io__block.readShort(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'stereoflag'.
	 * @see #__DNA__FIELD__stereoflag
	 */
	
	public void setStereoflag(short stereoflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 64, stereoflag);
		} else {
			__io__block.writeShort(__io__address + 60, stereoflag);
		}
	}

	/**
	 * Get method for struct member 'stereomode'.
	 * @see #__DNA__FIELD__stereomode
	 */
	
	public short getStereomode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 66);
		} else {
			return __io__block.readShort(__io__address + 62);
		}
	}

	/**
	 * Set method for struct member 'stereomode'.
	 * @see #__DNA__FIELD__stereomode
	 */
	
	public void setStereomode(short stereomode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 66, stereomode);
		} else {
			__io__block.writeShort(__io__address + 62, stereomode);
		}
	}

	/**
	 * Get method for struct member 'eyeseparation'.
	 * @see #__DNA__FIELD__eyeseparation
	 */
	
	public float getEyeseparation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'eyeseparation'.
	 * @see #__DNA__FIELD__eyeseparation
	 */
	
	public void setEyeseparation(float eyeseparation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, eyeseparation);
		} else {
			__io__block.writeFloat(__io__address + 64, eyeseparation);
		}
	}

	/**
	 * Get method for struct member 'recastData'.
	 * @see #__DNA__FIELD__recastData
	 */
	
	public RecastData getRecastData() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new RecastData(__io__address + 72, __io__block, __io__blockTable);
		} else {
			return new RecastData(__io__address + 68, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'recastData'.
	 * @see #__DNA__FIELD__recastData
	 */
	
	public void setRecastData(RecastData recastData) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 68;
		}
		if (__io__equals(recastData, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, recastData)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, recastData);
		} else {
			__io__generic__copy( getRecastData(), recastData);
		}
	}

	/**
	 * Get method for struct member 'gravity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> physics (it was in world) Gravitation constant for the game world </p>
	 * @see #__DNA__FIELD__gravity
	 */
	
	public float getGravity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 128);
		} else {
			return __io__block.readFloat(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'gravity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> physics (it was in world) Gravitation constant for the game world </p>
	 * @see #__DNA__FIELD__gravity
	 */
	
	public void setGravity(float gravity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 128, gravity);
		} else {
			__io__block.writeFloat(__io__address + 124, gravity);
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
			return __io__block.readFloat(__io__address + 132);
		} else {
			return __io__block.readFloat(__io__address + 128);
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
			__io__block.writeFloat(__io__address + 132, activityBoxRadius);
		} else {
			__io__block.writeFloat(__io__address + 128, activityBoxRadius);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bit 3: (gameengine): Activity culling is enabled. bit 5: (gameengine) : enable Bullet DBVT tree for view frustum culling </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bit 3: (gameengine): Activity culling is enabled. bit 5: (gameengine) : enable Bullet DBVT tree for view frustum culling </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, flag);
		} else {
			__io__block.writeInt(__io__address + 132, flag);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public short getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 140);
		} else {
			return __io__block.readShort(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(short mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 140, mode);
		} else {
			__io__block.writeShort(__io__address + 136, mode);
		}
	}

	/**
	 * Get method for struct member 'matmode'.
	 * @see #__DNA__FIELD__matmode
	 */
	
	public short getMatmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 142);
		} else {
			return __io__block.readShort(__io__address + 138);
		}
	}

	/**
	 * Set method for struct member 'matmode'.
	 * @see #__DNA__FIELD__matmode
	 */
	
	public void setMatmode(short matmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 142, matmode);
		} else {
			__io__block.writeShort(__io__address + 138, matmode);
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
			return __io__block.readShort(__io__address + 144);
		} else {
			return __io__block.readShort(__io__address + 140);
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
			__io__block.writeShort(__io__address + 144, occlusionRes);
		} else {
			__io__block.writeShort(__io__address + 140, occlusionRes);
		}
	}

	/**
	 * Get method for struct member 'physicsEngine'.
	 * @see #__DNA__FIELD__physicsEngine
	 */
	
	public short getPhysicsEngine() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 146);
		} else {
			return __io__block.readShort(__io__address + 142);
		}
	}

	/**
	 * Set method for struct member 'physicsEngine'.
	 * @see #__DNA__FIELD__physicsEngine
	 */
	
	public void setPhysicsEngine(short physicsEngine) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 146, physicsEngine);
		} else {
			__io__block.writeShort(__io__address + 142, physicsEngine);
		}
	}

	/**
	 * Get method for struct member 'exitkey'.
	 * @see #__DNA__FIELD__exitkey
	 */
	
	public short getExitkey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 148);
		} else {
			return __io__block.readShort(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'exitkey'.
	 * @see #__DNA__FIELD__exitkey
	 */
	
	public void setExitkey(short exitkey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 148, exitkey);
		} else {
			__io__block.writeShort(__io__address + 144, exitkey);
		}
	}

	/**
	 * Get method for struct member 'vsync'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Controls vsync: off, on, or adaptive (if supported) </p>
	 * @see #__DNA__FIELD__vsync
	 */
	
	public short getVsync() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 150);
		} else {
			return __io__block.readShort(__io__address + 146);
		}
	}

	/**
	 * Set method for struct member 'vsync'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Controls vsync: off, on, or adaptive (if supported) </p>
	 * @see #__DNA__FIELD__vsync
	 */
	
	public void setVsync(short vsync) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 150, vsync);
		} else {
			__io__block.writeShort(__io__address + 146, vsync);
		}
	}

	/**
	 * Get method for struct member 'ticrate'.
	 * @see #__DNA__FIELD__ticrate
	 */
	
	public short getTicrate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 152);
		} else {
			return __io__block.readShort(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'ticrate'.
	 * @see #__DNA__FIELD__ticrate
	 */
	
	public void setTicrate(short ticrate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 152, ticrate);
		} else {
			__io__block.writeShort(__io__address + 148, ticrate);
		}
	}

	/**
	 * Get method for struct member 'maxlogicstep'.
	 * @see #__DNA__FIELD__maxlogicstep
	 */
	
	public short getMaxlogicstep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 154);
		} else {
			return __io__block.readShort(__io__address + 150);
		}
	}

	/**
	 * Set method for struct member 'maxlogicstep'.
	 * @see #__DNA__FIELD__maxlogicstep
	 */
	
	public void setMaxlogicstep(short maxlogicstep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 154, maxlogicstep);
		} else {
			__io__block.writeShort(__io__address + 150, maxlogicstep);
		}
	}

	/**
	 * Get method for struct member 'physubstep'.
	 * @see #__DNA__FIELD__physubstep
	 */
	
	public short getPhysubstep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 156);
		} else {
			return __io__block.readShort(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'physubstep'.
	 * @see #__DNA__FIELD__physubstep
	 */
	
	public void setPhysubstep(short physubstep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 156, physubstep);
		} else {
			__io__block.writeShort(__io__address + 152, physubstep);
		}
	}

	/**
	 * Get method for struct member 'maxphystep'.
	 * @see #__DNA__FIELD__maxphystep
	 */
	
	public short getMaxphystep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 158);
		} else {
			return __io__block.readShort(__io__address + 154);
		}
	}

	/**
	 * Set method for struct member 'maxphystep'.
	 * @see #__DNA__FIELD__maxphystep
	 */
	
	public void setMaxphystep(short maxphystep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 158, maxphystep);
		} else {
			__io__block.writeShort(__io__address + 154, maxphystep);
		}
	}

	/**
	 * Get method for struct member 'obstacleSimulation'.
	 * @see #__DNA__FIELD__obstacleSimulation
	 */
	
	public short getObstacleSimulation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 160);
		} else {
			return __io__block.readShort(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'obstacleSimulation'.
	 * @see #__DNA__FIELD__obstacleSimulation
	 */
	
	public void setObstacleSimulation(short obstacleSimulation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 160, obstacleSimulation);
		} else {
			__io__block.writeShort(__io__address + 156, obstacleSimulation);
		}
	}

	/**
	 * Get method for struct member 'raster_storage'.
	 * @see #__DNA__FIELD__raster_storage
	 */
	
	public short getRaster_storage() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 162);
		} else {
			return __io__block.readShort(__io__address + 158);
		}
	}

	/**
	 * Set method for struct member 'raster_storage'.
	 * @see #__DNA__FIELD__raster_storage
	 */
	
	public void setRaster_storage(short raster_storage) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 162, raster_storage);
		} else {
			__io__block.writeShort(__io__address + 158, raster_storage);
		}
	}

	/**
	 * Get method for struct member 'levelHeight'.
	 * @see #__DNA__FIELD__levelHeight
	 */
	
	public float getLevelHeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 164);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'levelHeight'.
	 * @see #__DNA__FIELD__levelHeight
	 */
	
	public void setLevelHeight(float levelHeight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 164, levelHeight);
		} else {
			__io__block.writeFloat(__io__address + 160, levelHeight);
		}
	}

	/**
	 * Get method for struct member 'deactivationtime'.
	 * @see #__DNA__FIELD__deactivationtime
	 */
	
	public float getDeactivationtime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 168);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'deactivationtime'.
	 * @see #__DNA__FIELD__deactivationtime
	 */
	
	public void setDeactivationtime(float deactivationtime) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 168, deactivationtime);
		} else {
			__io__block.writeFloat(__io__address + 164, deactivationtime);
		}
	}

	/**
	 * Get method for struct member 'lineardeactthreshold'.
	 * @see #__DNA__FIELD__lineardeactthreshold
	 */
	
	public float getLineardeactthreshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 172);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'lineardeactthreshold'.
	 * @see #__DNA__FIELD__lineardeactthreshold
	 */
	
	public void setLineardeactthreshold(float lineardeactthreshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 172, lineardeactthreshold);
		} else {
			__io__block.writeFloat(__io__address + 168, lineardeactthreshold);
		}
	}

	/**
	 * Get method for struct member 'angulardeactthreshold'.
	 * @see #__DNA__FIELD__angulardeactthreshold
	 */
	
	public float getAngulardeactthreshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'angulardeactthreshold'.
	 * @see #__DNA__FIELD__angulardeactthreshold
	 */
	
	public void setAngulardeactthreshold(float angulardeactthreshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, angulardeactthreshold);
		} else {
			__io__block.writeFloat(__io__address + 172, angulardeactthreshold);
		}
	}

	/**
	 * Get method for struct member 'lodflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Scene}  LoD </p>
	 * @see #__DNA__FIELD__lodflag
	 */
	
	public short getLodflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 180);
		} else {
			return __io__block.readShort(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'lodflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Scene}  LoD </p>
	 * @see #__DNA__FIELD__lodflag
	 */
	
	public void setLodflag(short lodflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 180, lodflag);
		} else {
			__io__block.writeShort(__io__address + 176, lodflag);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public short getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 182);
		} else {
			return __io__block.readShort(__io__address + 178);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(short pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 182, pad2);
		} else {
			__io__block.writeShort(__io__address + 178, pad2);
		}
	}

	/**
	 * Get method for struct member 'scehysteresis'.
	 * @see #__DNA__FIELD__scehysteresis
	 */
	
	public int getScehysteresis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 184);
		} else {
			return __io__block.readInt(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'scehysteresis'.
	 * @see #__DNA__FIELD__scehysteresis
	 */
	
	public void setScehysteresis(int scehysteresis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 184, scehysteresis);
		} else {
			__io__block.writeInt(__io__address + 180, scehysteresis);
		}
	}

	/**
	 * Get method for struct member 'pad5'.
	 * @see #__DNA__FIELD__pad5
	 */
	
	public int getPad5() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 188);
		} else {
			return __io__block.readInt(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'pad5'.
	 * @see #__DNA__FIELD__pad5
	 */
	
	public void setPad5(int pad5) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 188, pad5);
		} else {
			__io__block.writeInt(__io__address + 184, pad5);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<GameData> __io__addressof() {
		return new CPointer<GameData>(__io__address, new Class[]{GameData.class}, __io__block, __io__blockTable);
	}

}
