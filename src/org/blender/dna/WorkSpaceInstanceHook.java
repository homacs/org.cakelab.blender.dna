package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'WorkSpaceInstanceHook'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Little wrapper to store data that is going to be per window, but coming from the workspace. It allows us to keep workspace and window data completely separate. </p>
 */

@CMetaData(size32=16, size64=32)
public class WorkSpaceInstanceHook extends CFacade {

	/**
	 * This is the sdna index of the struct WorkSpaceInstanceHook.
	 * <p>
	 * It is required when allocating a new block to store data for WorkSpaceInstanceHook.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 639;

	/**
	 * Field descriptor (offset) for struct member 'active'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpaceInstanceHook workspaceinstancehook = ...;
	 * CPointer&lt;Object&gt; p = workspaceinstancehook.__dna__addressof(WorkSpaceInstanceHook.__DNA__FIELD__active);
	 * CPointer&lt;CPointer&lt;WorkSpace&gt;&gt; p_active = p.cast(new Class[]{CPointer.class, WorkSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active'</li>
	 * <li>Signature: 'WorkSpace*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'act_layout'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpaceInstanceHook workspaceinstancehook = ...;
	 * CPointer&lt;Object&gt; p = workspaceinstancehook.__dna__addressof(WorkSpaceInstanceHook.__DNA__FIELD__act_layout);
	 * CPointer&lt;CPointer&lt;WorkSpaceLayout&gt;&gt; p_act_layout = p.cast(new Class[]{CPointer.class, WorkSpaceLayout.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_layout'</li>
	 * <li>Signature: 'WorkSpaceLayout*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_layout = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'temp_workspace_store'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Needed because we can't change workspaces/layouts in running handler loop, it would break context. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpaceInstanceHook workspaceinstancehook = ...;
	 * CPointer&lt;Object&gt; p = workspaceinstancehook.__dna__addressof(WorkSpaceInstanceHook.__DNA__FIELD__temp_workspace_store);
	 * CPointer&lt;CPointer&lt;WorkSpace&gt;&gt; p_temp_workspace_store = p.cast(new Class[]{CPointer.class, WorkSpace.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'temp_workspace_store'</li>
	 * <li>Signature: 'WorkSpace*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__temp_workspace_store = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'temp_layout_store'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpaceInstanceHook workspaceinstancehook = ...;
	 * CPointer&lt;Object&gt; p = workspaceinstancehook.__dna__addressof(WorkSpaceInstanceHook.__DNA__FIELD__temp_layout_store);
	 * CPointer&lt;CPointer&lt;WorkSpaceLayout&gt;&gt; p_temp_layout_store = p.cast(new Class[]{CPointer.class, WorkSpaceLayout.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'temp_layout_store'</li>
	 * <li>Signature: 'WorkSpaceLayout*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__temp_layout_store = new long[]{12, 24};

	public WorkSpaceInstanceHook(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected WorkSpaceInstanceHook(WorkSpaceInstanceHook that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'active'.
	 * @see #__DNA__FIELD__active
	 */
	
	public CPointer<WorkSpace> getActive() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{WorkSpace.class};
		return new CPointer<WorkSpace>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, WorkSpace.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'active'.
	 * @see #__DNA__FIELD__active
	 */
	
	public void setActive(CPointer<WorkSpace> active) throws IOException
	{
		long __address = ((active == null) ? 0 : active.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'act_layout'.
	 * @see #__DNA__FIELD__act_layout
	 */
	
	public CPointer<WorkSpaceLayout> getAct_layout() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{WorkSpaceLayout.class};
		return new CPointer<WorkSpaceLayout>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, WorkSpaceLayout.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act_layout'.
	 * @see #__DNA__FIELD__act_layout
	 */
	
	public void setAct_layout(CPointer<WorkSpaceLayout> act_layout) throws IOException
	{
		long __address = ((act_layout == null) ? 0 : act_layout.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'temp_workspace_store'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Needed because we can't change workspaces/layouts in running handler loop, it would break context. </p>
	 * @see #__DNA__FIELD__temp_workspace_store
	 */
	
	public CPointer<WorkSpace> getTemp_workspace_store() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{WorkSpace.class};
		return new CPointer<WorkSpace>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, WorkSpace.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'temp_workspace_store'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Needed because we can't change workspaces/layouts in running handler loop, it would break context. </p>
	 * @see #__DNA__FIELD__temp_workspace_store
	 */
	
	public void setTemp_workspace_store(CPointer<WorkSpace> temp_workspace_store) throws IOException
	{
		long __address = ((temp_workspace_store == null) ? 0 : temp_workspace_store.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'temp_layout_store'.
	 * @see #__DNA__FIELD__temp_layout_store
	 */
	
	public CPointer<WorkSpaceLayout> getTemp_layout_store() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{WorkSpaceLayout.class};
		return new CPointer<WorkSpaceLayout>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, WorkSpaceLayout.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'temp_layout_store'.
	 * @see #__DNA__FIELD__temp_layout_store
	 */
	
	public void setTemp_layout_store(CPointer<WorkSpaceLayout> temp_layout_store) throws IOException
	{
		long __address = ((temp_layout_store == null) ? 0 : temp_layout_store.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<WorkSpaceInstanceHook> __io__addressof() {
		return new CPointer<WorkSpaceInstanceHook>(__io__address, new Class[]{WorkSpaceInstanceHook.class}, __io__block, __io__blockTable);
	}

}
