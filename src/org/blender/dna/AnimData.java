package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'AnimData'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p>{@link AnimData}  -----------------------------------  Animation data for some {@link ID}  block (adt)</p><p> This block of data is used to provide all of the necessary animation data for a datablock. Currently, this data will not be reusable, as there shouldn't be any need to do so.</p><p> This information should be made available for most if not all ID-blocks, which should enable all of its settings to be animatable locally. Animation from 'higher-up' ID-AnimData blocks may override local settings.</p><p> This datablock should be placed immediately after the {@link ID}  block where it is used, so that the code which retrieves this data can do so in an easier manner. See blenkernel/intern/anim_sys.c for details. </p>
 */

@CMetaData(size32=60, size64=104)
public class AnimData extends CFacade {

	/**
	 * This is the sdna index of the struct AnimData.
	 * <p>
	 * It is required when allocating a new block to store data for AnimData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 533;

	/**
	 * Field descriptor (offset) for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Action for this data-block<h4>Blender Source Code:</h4>
	 * <p> active action - acts as the 'tweaking track' for the NLA </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD__action);
	 * CPointer&lt;CPointer&lt;bAction&gt;&gt; p_action = p.cast(new Class[]{CPointer.class, bAction.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'action'</li>
	 * <li>Signature: 'bAction*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__action = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'tmpact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temp-storage for the 'real' active action (i.e. the one used before the tweaking-action took over to be edited in the Animation Editors) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD__tmpact);
	 * CPointer&lt;CPointer&lt;bAction&gt;&gt; p_tmpact = p.cast(new Class[]{CPointer.class, bAction.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tmpact'</li>
	 * <li>Signature: 'bAction*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tmpact = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'nla_tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    NLA Tracks (i.e. Animation Layers)<h4>Blender Source Code:</h4>
	 * <p> nla-tracks </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD__nla_tracks);
	 * CPointer&lt;ListBase&gt; p_nla_tracks = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nla_tracks'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nla_tracks = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'act_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active NLA-track (only set/used during tweaking, so no need to worry about dangling pointers). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD__act_track);
	 * CPointer&lt;CPointer&lt;NlaTrack&gt;&gt; p_act_track = p.cast(new Class[]{CPointer.class, NlaTrack.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_track'</li>
	 * <li>Signature: 'NlaTrack*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_track = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'actstrip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active NLA-strip (only set/used during tweaking, so no need to worry about dangling pointers). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD__actstrip);
	 * CPointer&lt;CPointer&lt;NlaStrip&gt;&gt; p_actstrip = p.cast(new Class[]{CPointer.class, NlaStrip.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actstrip'</li>
	 * <li>Signature: 'NlaStrip*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actstrip = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'drivers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    The Drivers/Expressions for this data-block<h4>Blender Source Code:</h4>
	 * <p> 'drivers' for this ID-block's settings - FCurves, but are completely separate from those for animation dataStandard user-created Drivers/Expressions (used as part of a rig). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD__drivers);
	 * CPointer&lt;ListBase&gt; p_drivers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drivers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drivers = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member 'overrides'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp storage ({@link AnimOverride} ) of values for settings that are animated (but the value hasn't been keyframed). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD__overrides);
	 * CPointer&lt;ListBase&gt; p_overrides = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'overrides'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__overrides = new long[]{32, 64};

	/**
	 * Field descriptor (offset) for struct member 'driver_array'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data, for depsgraph evaluation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD__driver_array);
	 * CPointer&lt;CPointer&lt;CPointer&lt;FCurve&gt;&gt;&gt; p_driver_array = p.cast(new Class[]{CPointer.class, CPointer.class, FCurve.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'driver_array'</li>
	 * <li>Signature: 'FCurve**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__driver_array = new long[]{40, 80};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for animation evaluation User-defined settings. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{44, 88};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{48, 92};

	/**
	 * Field descriptor (offset) for struct member 'act_blendmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for active action evaluation (based on NLA strip settings) Accumulation mode for active action. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD__act_blendmode);
	 * CPointer&lt;Short&gt; p_act_blendmode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_blendmode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_blendmode = new long[]{52, 96};

	/**
	 * Field descriptor (offset) for struct member 'act_extendmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Extrapolation mode for active action. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD__act_extendmode);
	 * CPointer&lt;Short&gt; p_act_extendmode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_extendmode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_extendmode = new long[]{54, 98};

	/**
	 * Field descriptor (offset) for struct member 'act_influence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Influence for active action. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD__act_influence);
	 * CPointer&lt;Float&gt; p_act_influence = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_influence'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_influence = new long[]{56, 100};

	public AnimData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected AnimData(AnimData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Action for this data-block<h4>Blender Source Code:</h4>
	 * <p> active action - acts as the 'tweaking track' for the NLA </p>
	 * @see #__DNA__FIELD__action
	 */
	
	public CPointer<bAction> getAction() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bAction.class};
		return new CPointer<bAction>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bAction.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Action for this data-block<h4>Blender Source Code:</h4>
	 * <p> active action - acts as the 'tweaking track' for the NLA </p>
	 * @see #__DNA__FIELD__action
	 */
	
	public void setAction(CPointer<bAction> action) throws IOException
	{
		long __address = ((action == null) ? 0 : action.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'tmpact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temp-storage for the 'real' active action (i.e. the one used before the tweaking-action took over to be edited in the Animation Editors) </p>
	 * @see #__DNA__FIELD__tmpact
	 */
	
	public CPointer<bAction> getTmpact() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bAction.class};
		return new CPointer<bAction>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bAction.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tmpact'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temp-storage for the 'real' active action (i.e. the one used before the tweaking-action took over to be edited in the Animation Editors) </p>
	 * @see #__DNA__FIELD__tmpact
	 */
	
	public void setTmpact(CPointer<bAction> tmpact) throws IOException
	{
		long __address = ((tmpact == null) ? 0 : tmpact.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'nla_tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    NLA Tracks (i.e. Animation Layers)<h4>Blender Source Code:</h4>
	 * <p> nla-tracks </p>
	 * @see #__DNA__FIELD__nla_tracks
	 */
	
	public ListBase getNla_tracks() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'nla_tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    NLA Tracks (i.e. Animation Layers)<h4>Blender Source Code:</h4>
	 * <p> nla-tracks </p>
	 * @see #__DNA__FIELD__nla_tracks
	 */
	
	public void setNla_tracks(ListBase nla_tracks) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(nla_tracks, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, nla_tracks)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, nla_tracks);
		} else {
			__io__generic__copy( getNla_tracks(), nla_tracks);
		}
	}

	/**
	 * Get method for struct member 'act_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active NLA-track (only set/used during tweaking, so no need to worry about dangling pointers). </p>
	 * @see #__DNA__FIELD__act_track
	 */
	
	public CPointer<NlaTrack> getAct_track() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{NlaTrack.class};
		return new CPointer<NlaTrack>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, NlaTrack.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active NLA-track (only set/used during tweaking, so no need to worry about dangling pointers). </p>
	 * @see #__DNA__FIELD__act_track
	 */
	
	public void setAct_track(CPointer<NlaTrack> act_track) throws IOException
	{
		long __address = ((act_track == null) ? 0 : act_track.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'actstrip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active NLA-strip (only set/used during tweaking, so no need to worry about dangling pointers). </p>
	 * @see #__DNA__FIELD__actstrip
	 */
	
	public CPointer<NlaStrip> getActstrip() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{NlaStrip.class};
		return new CPointer<NlaStrip>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, NlaStrip.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'actstrip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Active NLA-strip (only set/used during tweaking, so no need to worry about dangling pointers). </p>
	 * @see #__DNA__FIELD__actstrip
	 */
	
	public void setActstrip(CPointer<NlaStrip> actstrip) throws IOException
	{
		long __address = ((actstrip == null) ? 0 : actstrip.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'drivers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    The Drivers/Expressions for this data-block<h4>Blender Source Code:</h4>
	 * <p> 'drivers' for this ID-block's settings - FCurves, but are completely separate from those for animation dataStandard user-created Drivers/Expressions (used as part of a rig). </p>
	 * @see #__DNA__FIELD__drivers
	 */
	
	public ListBase getDrivers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 48, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 24, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drivers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    The Drivers/Expressions for this data-block<h4>Blender Source Code:</h4>
	 * <p> 'drivers' for this ID-block's settings - FCurves, but are completely separate from those for animation dataStandard user-created Drivers/Expressions (used as part of a rig). </p>
	 * @see #__DNA__FIELD__drivers
	 */
	
	public void setDrivers(ListBase drivers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(drivers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drivers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drivers);
		} else {
			__io__generic__copy( getDrivers(), drivers);
		}
	}

	/**
	 * Get method for struct member 'overrides'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp storage ({@link AnimOverride} ) of values for settings that are animated (but the value hasn't been keyframed). </p>
	 * @see #__DNA__FIELD__overrides
	 */
	
	public ListBase getOverrides() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 64, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 32, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'overrides'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp storage ({@link AnimOverride} ) of values for settings that are animated (but the value hasn't been keyframed). </p>
	 * @see #__DNA__FIELD__overrides
	 */
	
	public void setOverrides(ListBase overrides) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(overrides, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, overrides)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, overrides);
		} else {
			__io__generic__copy( getOverrides(), overrides);
		}
	}

	/**
	 * Get method for struct member 'driver_array'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data, for depsgraph evaluation. </p>
	 * @see #__DNA__FIELD__driver_array
	 */
	
	public CPointer<CPointer<FCurve>> getDriver_array() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, FCurve.class};
		return new CPointer<CPointer<FCurve>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'driver_array'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data, for depsgraph evaluation. </p>
	 * @see #__DNA__FIELD__driver_array
	 */
	
	public void setDriver_array(CPointer<CPointer<FCurve>> driver_array) throws IOException
	{
		long __address = ((driver_array == null) ? 0 : driver_array.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 40, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for animation evaluation User-defined settings. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 88);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for animation evaluation User-defined settings. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 88, flag);
		} else {
			__io__block.writeInt(__io__address + 44, flag);
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
			return new CArrayFacade<Byte>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 92;
		} else {
			__dna__offset = 48;
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
	 * Get method for struct member 'act_blendmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for active action evaluation (based on NLA strip settings) Accumulation mode for active action. </p>
	 * @see #__DNA__FIELD__act_blendmode
	 */
	
	public short getAct_blendmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 96);
		} else {
			return __io__block.readShort(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'act_blendmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for active action evaluation (based on NLA strip settings) Accumulation mode for active action. </p>
	 * @see #__DNA__FIELD__act_blendmode
	 */
	
	public void setAct_blendmode(short act_blendmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 96, act_blendmode);
		} else {
			__io__block.writeShort(__io__address + 52, act_blendmode);
		}
	}

	/**
	 * Get method for struct member 'act_extendmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Extrapolation mode for active action. </p>
	 * @see #__DNA__FIELD__act_extendmode
	 */
	
	public short getAct_extendmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 98);
		} else {
			return __io__block.readShort(__io__address + 54);
		}
	}

	/**
	 * Set method for struct member 'act_extendmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Extrapolation mode for active action. </p>
	 * @see #__DNA__FIELD__act_extendmode
	 */
	
	public void setAct_extendmode(short act_extendmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 98, act_extendmode);
		} else {
			__io__block.writeShort(__io__address + 54, act_extendmode);
		}
	}

	/**
	 * Get method for struct member 'act_influence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Influence for active action. </p>
	 * @see #__DNA__FIELD__act_influence
	 */
	
	public float getAct_influence() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'act_influence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Influence for active action. </p>
	 * @see #__DNA__FIELD__act_influence
	 */
	
	public void setAct_influence(float act_influence) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, act_influence);
		} else {
			__io__block.writeFloat(__io__address + 56, act_influence);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<AnimData> __io__addressof() {
		return new CPointer<AnimData>(__io__address, new Class[]{AnimData.class}, __io__block, __io__blockTable);
	}

}
