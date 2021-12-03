package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodesModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=120, size64=152)
public class NodesModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct NodesModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for NodesModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 154;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodesModifierData nodesmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = nodesmodifierdata.__dna__addressof(NodesModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 112/136</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'node_group'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodesModifierData nodesmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = nodesmodifierdata.__dna__addressof(NodesModifierData.__DNA__FIELD__node_group);
	 * CPointer&lt;CPointer&lt;bNodeTree&gt;&gt; p_node_group = p.cast(new Class[]{CPointer.class, bNodeTree.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'node_group'</li>
	 * <li>Signature: 'bNodeTree*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__node_group = new long[]{112, 136};

	/**
	 * Field descriptor (offset) for struct member 'settings'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodesModifierData nodesmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = nodesmodifierdata.__dna__addressof(NodesModifierData.__DNA__FIELD__settings);
	 * CPointer&lt;NodesModifierSettings&gt; p_settings = p.cast(new Class[]{NodesModifierSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'settings'</li>
	 * <li>Signature: 'NodesModifierSettings'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__settings = new long[]{116, 144};

	public NodesModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodesModifierData(NodesModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public ModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(ModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'node_group'.
	 * @see #__DNA__FIELD__node_group
	 */
	
	public CPointer<bNodeTree> getNode_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bNodeTree.class};
		return new CPointer<bNodeTree>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bNodeTree.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'node_group'.
	 * @see #__DNA__FIELD__node_group
	 */
	
	public void setNode_group(CPointer<bNodeTree> node_group) throws IOException
	{
		long __address = ((node_group == null) ? 0 : node_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'settings'.
	 * @see #__DNA__FIELD__settings
	 */
	
	public NodesModifierSettings getSettings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new NodesModifierSettings(__io__address + 144, __io__block, __io__blockTable);
		} else {
			return new NodesModifierSettings(__io__address + 116, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'settings'.
	 * @see #__DNA__FIELD__settings
	 */
	
	public void setSettings(NodesModifierSettings settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 116;
		}
		if (__io__equals(settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, settings);
		} else {
			__io__generic__copy( getSettings(), settings);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodesModifierData> __io__addressof() {
		return new CPointer<NodesModifierData>(__io__address, new Class[]{NodesModifierData.class}, __io__block, __io__blockTable);
	}

}
