package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'AnimData'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p>{@link AnimData}  -------------------------------<mdash/><mdash/>  Animation data for some {@link ID}  block (adt)</p><p> This block of data is used to provide all of the necessary animation data for a datablock. Currently, this data will not be reusable, as there shouldn't be any need to do so.</p><p> This information should be made available for most if not all ID-blocks, which should enable all of its settings to be animatable locally. Animation from 'higher-up' ID-AnimData blocks may override local settings.</p><p> This datablock should be placed immediately after the {@link ID}  block where it is used, so that the code which retrieves this data can do so in an easier manner. See blenkernel/intern/anim_sys.c for details. </p>
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
	public static final int __DNA__SDNA_INDEX = 524;

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
	 * Field descriptor (offset) for struct member 'remap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> remapping-info for active action - should only be used if needed (for 'foreign' actions that aren't working correctly) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD__remap);
	 * CPointer&lt;CPointer&lt;AnimMapper&gt;&gt; p_remap = p.cast(new Class[]{CPointer.class, AnimMapper.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'remap'</li>
	 * <li>Signature: 'AnimMapper*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__remap = new long[]{8, 16};

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
	public static final long[] __DNA__FIELD__nla_tracks = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'act_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active NLA-track (only set/used during tweaking, so no need to worry about dangling pointers) </p>
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
	public static final long[] __DNA__FIELD__act_track = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'actstrip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active NLA-strip (only set/used during tweaking, so no need to worry about dangling pointers) </p>
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
	public static final long[] __DNA__FIELD__actstrip = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member 'drivers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    The Drivers/Expressions for this data-block<h4>Blender Source Code:</h4>
	 * <p> 'drivers' for this ID-block's settings - FCurves, but are completely separate from those for animation datastandard user-created Drivers/Expressions (used as part of a rig) </p>
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
	public static final long[] __DNA__FIELD__drivers = new long[]{28, 56};

	/**
	 * Field descriptor (offset) for struct member 'overrides'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temp storage ({@link AnimOverride} ) of values for settings that are animated (but the value hasn't been keyframed) </p>
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
	public static final long[] __DNA__FIELD__overrides = new long[]{36, 72};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for animation evaluation user-defined settings </p>
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
	 * Field descriptor (offset) for struct member 'recalc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> depsgraph recalculation flags </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimData animdata = ...;
	 * CPointer&lt;Object&gt; p = animdata.__dna__addressof(AnimData.__DNA__FIELD__recalc);
	 * CPointer&lt;Integer&gt; p_recalc = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'recalc'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__recalc = new long[]{48, 92};

	/**
	 * Field descriptor (offset) for struct member 'act_blendmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for active action evaluation (based on NLA strip settings) accumulation mode for active action </p>
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
	 * <p> extrapolation mode for active action </p>
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
	 * <p> influence for active action </p>
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
	 * Get method for struct member 'remap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> remapping-info for active action - should only be used if needed (for 'foreign' actions that aren't working correctly) </p>
	 * @see #__DNA__FIELD__remap
	 */
	
	public CPointer<AnimMapper> getRemap() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimMapper.class};
		return new CPointer<AnimMapper>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimMapper.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'remap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> remapping-info for active action - should only be used if needed (for 'foreign' actions that aren't working correctly) </p>
	 * @see #__DNA__FIELD__remap
	 */
	
	public void setRemap(CPointer<AnimMapper> remap) throws IOException
	{
		long __address = ((remap == null) ? 0 : remap.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
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
			return new ListBase(__io__address + 24, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 12, __io__block, __io__blockTable);
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
			__dna__offset = 24;
		} else {
			__dna__offset = 12;
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
	 * <p> active NLA-track (only set/used during tweaking, so no need to worry about dangling pointers) </p>
	 * @see #__DNA__FIELD__act_track
	 */
	
	public CPointer<NlaTrack> getAct_track() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{NlaTrack.class};
		return new CPointer<NlaTrack>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, NlaTrack.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act_track'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active NLA-track (only set/used during tweaking, so no need to worry about dangling pointers) </p>
	 * @see #__DNA__FIELD__act_track
	 */
	
	public void setAct_track(CPointer<NlaTrack> act_track) throws IOException
	{
		long __address = ((act_track == null) ? 0 : act_track.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'actstrip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active NLA-strip (only set/used during tweaking, so no need to worry about dangling pointers) </p>
	 * @see #__DNA__FIELD__actstrip
	 */
	
	public CPointer<NlaStrip> getActstrip() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{NlaStrip.class};
		return new CPointer<NlaStrip>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, NlaStrip.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'actstrip'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> active NLA-strip (only set/used during tweaking, so no need to worry about dangling pointers) </p>
	 * @see #__DNA__FIELD__actstrip
	 */
	
	public void setActstrip(CPointer<NlaStrip> actstrip) throws IOException
	{
		long __address = ((actstrip == null) ? 0 : actstrip.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'drivers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    The Drivers/Expressions for this data-block<h4>Blender Source Code:</h4>
	 * <p> 'drivers' for this ID-block's settings - FCurves, but are completely separate from those for animation datastandard user-created Drivers/Expressions (used as part of a rig) </p>
	 * @see #__DNA__FIELD__drivers
	 */
	
	public ListBase getDrivers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 56, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 28, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drivers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    The Drivers/Expressions for this data-block<h4>Blender Source Code:</h4>
	 * <p> 'drivers' for this ID-block's settings - FCurves, but are completely separate from those for animation datastandard user-created Drivers/Expressions (used as part of a rig) </p>
	 * @see #__DNA__FIELD__drivers
	 */
	
	public void setDrivers(ListBase drivers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 28;
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
	 * <p> temp storage ({@link AnimOverride} ) of values for settings that are animated (but the value hasn't been keyframed) </p>
	 * @see #__DNA__FIELD__overrides
	 */
	
	public ListBase getOverrides() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 72, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 36, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'overrides'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temp storage ({@link AnimOverride} ) of values for settings that are animated (but the value hasn't been keyframed) </p>
	 * @see #__DNA__FIELD__overrides
	 */
	
	public void setOverrides(ListBase overrides) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 36;
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
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for animation evaluation user-defined settings </p>
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
	 * <p> settings for animation evaluation user-defined settings </p>
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
	 * Get method for struct member 'recalc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> depsgraph recalculation flags </p>
	 * @see #__DNA__FIELD__recalc
	 */
	
	public int getRecalc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 92);
		} else {
			return __io__block.readInt(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'recalc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> depsgraph recalculation flags </p>
	 * @see #__DNA__FIELD__recalc
	 */
	
	public void setRecalc(int recalc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 92, recalc);
		} else {
			__io__block.writeInt(__io__address + 48, recalc);
		}
	}

	/**
	 * Get method for struct member 'act_blendmode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for active action evaluation (based on NLA strip settings) accumulation mode for active action </p>
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
	 * <p> settings for active action evaluation (based on NLA strip settings) accumulation mode for active action </p>
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
	 * <p> extrapolation mode for active action </p>
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
	 * <p> extrapolation mode for active action </p>
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
	 * <p> influence for active action </p>
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
	 * <p> influence for active action </p>
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
