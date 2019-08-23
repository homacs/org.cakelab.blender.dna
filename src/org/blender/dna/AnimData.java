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
 * 
 */

@CMetaData(size32=56, size64=96)
public class AnimData extends CFacade {

	/**
	 * This is the sdna index of the struct AnimData.
	 * <p>
	 * It is required when allocating a new block to store data for AnimData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 473;

	/**
	 * Field descriptor (offset) for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Action for this datablock
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
	 * (read-only)    NLA Tracks (i.e. Animation Layers)
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
	 * Field descriptor (offset) for struct member 'actstrip'.
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
	 * (read-only)    The Drivers/Expressions for this datablock
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
	 * Field descriptor (offset) for struct member 'flag'.
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
	public static final long[] __DNA__FIELD__flag = new long[]{40, 80};

	/**
	 * Field descriptor (offset) for struct member 'recalc'.
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
	public static final long[] __DNA__FIELD__recalc = new long[]{44, 84};

	/**
	 * Field descriptor (offset) for struct member 'act_blendmode'.
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
	public static final long[] __DNA__FIELD__act_blendmode = new long[]{48, 88};

	/**
	 * Field descriptor (offset) for struct member 'act_extendmode'.
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
	public static final long[] __DNA__FIELD__act_extendmode = new long[]{50, 90};

	/**
	 * Field descriptor (offset) for struct member 'act_influence'.
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
	public static final long[] __DNA__FIELD__act_influence = new long[]{52, 92};

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
	 * Active Action for this datablock
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
	 * Active Action for this datablock
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
	 * (read-only)    NLA Tracks (i.e. Animation Layers)
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
	 * (read-only)    NLA Tracks (i.e. Animation Layers)
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
	 * Get method for struct member 'actstrip'.
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
	 * (read-only)    The Drivers/Expressions for this datablock
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
	 * (read-only)    The Drivers/Expressions for this datablock
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
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 80);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 80, flag);
		} else {
			__io__block.writeInt(__io__address + 40, flag);
		}
	}

	/**
	 * Get method for struct member 'recalc'.
	 * @see #__DNA__FIELD__recalc
	 */
	
	public int getRecalc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'recalc'.
	 * @see #__DNA__FIELD__recalc
	 */
	
	public void setRecalc(int recalc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, recalc);
		} else {
			__io__block.writeInt(__io__address + 44, recalc);
		}
	}

	/**
	 * Get method for struct member 'act_blendmode'.
	 * @see #__DNA__FIELD__act_blendmode
	 */
	
	public short getAct_blendmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 88);
		} else {
			return __io__block.readShort(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'act_blendmode'.
	 * @see #__DNA__FIELD__act_blendmode
	 */
	
	public void setAct_blendmode(short act_blendmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 88, act_blendmode);
		} else {
			__io__block.writeShort(__io__address + 48, act_blendmode);
		}
	}

	/**
	 * Get method for struct member 'act_extendmode'.
	 * @see #__DNA__FIELD__act_extendmode
	 */
	
	public short getAct_extendmode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 90);
		} else {
			return __io__block.readShort(__io__address + 50);
		}
	}

	/**
	 * Set method for struct member 'act_extendmode'.
	 * @see #__DNA__FIELD__act_extendmode
	 */
	
	public void setAct_extendmode(short act_extendmode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 90, act_extendmode);
		} else {
			__io__block.writeShort(__io__address + 50, act_extendmode);
		}
	}

	/**
	 * Get method for struct member 'act_influence'.
	 * @see #__DNA__FIELD__act_influence
	 */
	
	public float getAct_influence() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'act_influence'.
	 * @see #__DNA__FIELD__act_influence
	 */
	
	public void setAct_influence(float act_influence) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, act_influence);
		} else {
			__io__block.writeFloat(__io__address + 52, act_influence);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<AnimData> __io__addressof() {
		return new CPointer<AnimData>(__io__address, new Class[]{AnimData.class}, __io__block, __io__blockTable);
	}

}
