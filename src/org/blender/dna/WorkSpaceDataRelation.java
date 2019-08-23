package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'WorkSpaceDataRelation'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Generic (and simple/primitive) struct for storing a history of assignments/relations of workspace data to non-workspace data in a listbase inside the workspace.</p><p> Using this we can restore the old state of a workspace if the user switches back to it.</p><p> 
 * </p><p><em></em> . More concretely:<ul><li><p> There are two windows, win1 and win2.</p></li><li><p> Both show workspace ws1, but both also had workspace ws2 activated at some point before.</p></li><li><p> Last time ws2 was active in win1, screen-layout sl1 was activated.</p></li><li><p> Last time ws2 was active in win2, screen-layout sl2 was activated.</p></li><li><p> When changing from ws1 to ws2 in win1, screen-layout sl1 should be activated again.</p></li><li><p> When changing from ws1 to ws2 in win2, screen-layout sl2 should be activated again. So that means we have to store the active screen-layout in a per workspace, per window relation. This struct is used to store an active screen-layout for each window within the workspace. To find the screen-layout to activate for this window-workspace combination, simply lookup the {@link WorkSpaceDataRelation}  with the workspace-hook of the window set as parent. </p></li></ul> 
 * There are two windows, win1 and win2.Both show workspace ws1, but both also had workspace ws2 activated at some point before.Last time ws2 was active in win1, screen-layout sl1 was activated.Last time ws2 was active in win2, screen-layout sl2 was activated.When changing from ws1 to ws2 in win1, screen-layout sl1 should be activated again.When changing from ws1 to ws2 in win2, screen-layout sl2 should be activated again. So that means we have to store the active screen-layout in a per workspace, per window relation. This struct is used to store an active screen-layout for each window within the workspace. To find the screen-layout to activate for this window-workspace combination, simply lookup the WorkSpaceDataRelation with the workspace-hook of the window set as parent. 
 * </p>
 */

@CMetaData(size32=16, size64=32)
public class WorkSpaceDataRelation extends CFacade {

	/**
	 * This is the sdna index of the struct WorkSpaceDataRelation.
	 * <p>
	 * It is required when allocating a new block to store data for WorkSpaceDataRelation.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 638;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpaceDataRelation workspacedatarelation = ...;
	 * CPointer&lt;Object&gt; p = workspacedatarelation.__dna__addressof(WorkSpaceDataRelation.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;WorkSpaceDataRelation&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, WorkSpaceDataRelation.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'WorkSpaceDataRelation*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpaceDataRelation workspacedatarelation = ...;
	 * CPointer&lt;Object&gt; p = workspacedatarelation.__dna__addressof(WorkSpaceDataRelation.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;WorkSpaceDataRelation&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, WorkSpaceDataRelation.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'WorkSpaceDataRelation*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The data used to identify the relation (e.g. to find screen-layout (= value) from/for a hook). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpaceDataRelation workspacedatarelation = ...;
	 * CPointer&lt;Object&gt; p = workspacedatarelation.__dna__addressof(WorkSpaceDataRelation.__DNA__FIELD__parent);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_parent = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The value for this parent-data/workspace relation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpaceDataRelation workspacedatarelation = ...;
	 * CPointer&lt;Object&gt; p = workspacedatarelation.__dna__addressof(WorkSpaceDataRelation.__DNA__FIELD__value);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_value = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value = new long[]{12, 24};

	public WorkSpaceDataRelation(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected WorkSpaceDataRelation(WorkSpaceDataRelation that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<WorkSpaceDataRelation> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{WorkSpaceDataRelation.class};
		return new CPointer<WorkSpaceDataRelation>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, WorkSpaceDataRelation.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<WorkSpaceDataRelation> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<WorkSpaceDataRelation> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{WorkSpaceDataRelation.class};
		return new CPointer<WorkSpaceDataRelation>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, WorkSpaceDataRelation.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<WorkSpaceDataRelation> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The data used to identify the relation (e.g. to find screen-layout (= value) from/for a hook). </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public CPointer<Object> getParent() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The data used to identify the relation (e.g. to find screen-layout (= value) from/for a hook). </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public void setParent(CPointer<Object> parent) throws IOException
	{
		long __address = ((parent == null) ? 0 : parent.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The value for this parent-data/workspace relation. </p>
	 * @see #__DNA__FIELD__value
	 */
	
	public CPointer<Object> getValue() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The value for this parent-data/workspace relation. </p>
	 * @see #__DNA__FIELD__value
	 */
	
	public void setValue(CPointer<Object> value) throws IOException
	{
		long __address = ((value == null) ? 0 : value.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<WorkSpaceDataRelation> __io__addressof() {
		return new CPointer<WorkSpaceDataRelation>(__io__address, new Class[]{WorkSpaceDataRelation.class}, __io__block, __io__blockTable);
	}

}
