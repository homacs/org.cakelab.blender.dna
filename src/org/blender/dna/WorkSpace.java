package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'WorkSpace'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=172, size64=240)
public class WorkSpace extends CFacade {

	/**
	 * This is the sdna index of the struct WorkSpace.
	 * <p>
	 * It is required when allocating a new block to store data for WorkSpace.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 637;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpace workspace = ...;
	 * CPointer&lt;Object&gt; p = workspace.__dna__addressof(WorkSpace.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 120/152</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'layouts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link WorkSpaceLayout} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpace workspace = ...;
	 * CPointer&lt;Object&gt; p = workspace.__dna__addressof(WorkSpace.__DNA__FIELD__layouts);
	 * CPointer&lt;ListBase&gt; p_layouts = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layouts'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layouts = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'hook_layout_relations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Store for each hook (so for each window) which layout has been activated the last time this workspace was visible. {@link WorkSpaceDataRelation} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpace workspace = ...;
	 * CPointer&lt;Object&gt; p = workspace.__dna__addressof(WorkSpace.__DNA__FIELD__hook_layout_relations);
	 * CPointer&lt;ListBase&gt; p_hook_layout_relations = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hook_layout_relations'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hook_layout_relations = new long[]{128, 168};

	/**
	 * Field descriptor (offset) for struct member 'owner_ids'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Feature tagging (use for addons) {@link wmOwnerID} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpace workspace = ...;
	 * CPointer&lt;Object&gt; p = workspace.__dna__addressof(WorkSpace.__DNA__FIELD__owner_ids);
	 * CPointer&lt;ListBase&gt; p_owner_ids = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'owner_ids'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__owner_ids = new long[]{136, 184};

	/**
	 * Field descriptor (offset) for struct member 'tools'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> List of {@link bToolRef}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpace workspace = ...;
	 * CPointer&lt;Object&gt; p = workspace.__dna__addressof(WorkSpace.__DNA__FIELD__tools);
	 * CPointer&lt;ListBase&gt; p_tools = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tools'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tools = new long[]{144, 200};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpace workspace = ...;
	 * CPointer&lt;Object&gt; p = workspace.__dna__addressof(WorkSpace.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{152, 216};

	/**
	 * Field descriptor (offset) for struct member 'object_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Switch to this object mode when activating the workspace
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpace workspace = ...;
	 * CPointer&lt;Object&gt; p = workspace.__dna__addressof(WorkSpace.__DNA__FIELD__object_mode);
	 * CPointer&lt;Integer&gt; p_object_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_mode = new long[]{156, 220};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Enum eWorkSpaceFlags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpace workspace = ...;
	 * CPointer&lt;Object&gt; p = workspace.__dna__addressof(WorkSpace.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{160, 224};

	/**
	 * Field descriptor (offset) for struct member 'order'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number for workspace tab reordering in the UI. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpace workspace = ...;
	 * CPointer&lt;Object&gt; p = workspace.__dna__addressof(WorkSpace.__DNA__FIELD__order);
	 * CPointer&lt;Integer&gt; p_order = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'order'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__order = new long[]{164, 228};

	/**
	 * Field descriptor (offset) for struct member 'status_text'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Info text from modal operators (runtime). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WorkSpace workspace = ...;
	 * CPointer&lt;Object&gt; p = workspace.__dna__addressof(WorkSpace.__DNA__FIELD__status_text);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_status_text = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'status_text'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__status_text = new long[]{168, 232};

	public WorkSpace(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected WorkSpace(WorkSpace that) {
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
	 * Get method for struct member 'layouts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link WorkSpaceLayout} . </p>
	 * @see #__DNA__FIELD__layouts
	 */
	
	public ListBase getLayouts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 152, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 120, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layouts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link WorkSpaceLayout} . </p>
	 * @see #__DNA__FIELD__layouts
	 */
	
	public void setLayouts(ListBase layouts) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(layouts, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layouts)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layouts);
		} else {
			__io__generic__copy( getLayouts(), layouts);
		}
	}

	/**
	 * Get method for struct member 'hook_layout_relations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Store for each hook (so for each window) which layout has been activated the last time this workspace was visible. {@link WorkSpaceDataRelation} . </p>
	 * @see #__DNA__FIELD__hook_layout_relations
	 */
	
	public ListBase getHook_layout_relations() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 168, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 128, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'hook_layout_relations'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Store for each hook (so for each window) which layout has been activated the last time this workspace was visible. {@link WorkSpaceDataRelation} . </p>
	 * @see #__DNA__FIELD__hook_layout_relations
	 */
	
	public void setHook_layout_relations(ListBase hook_layout_relations) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 128;
		}
		if (__io__equals(hook_layout_relations, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, hook_layout_relations)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, hook_layout_relations);
		} else {
			__io__generic__copy( getHook_layout_relations(), hook_layout_relations);
		}
	}

	/**
	 * Get method for struct member 'owner_ids'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Feature tagging (use for addons) {@link wmOwnerID} . </p>
	 * @see #__DNA__FIELD__owner_ids
	 */
	
	public ListBase getOwner_ids() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 184, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 136, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'owner_ids'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Feature tagging (use for addons) {@link wmOwnerID} . </p>
	 * @see #__DNA__FIELD__owner_ids
	 */
	
	public void setOwner_ids(ListBase owner_ids) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 136;
		}
		if (__io__equals(owner_ids, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, owner_ids)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, owner_ids);
		} else {
			__io__generic__copy( getOwner_ids(), owner_ids);
		}
	}

	/**
	 * Get method for struct member 'tools'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> List of {@link bToolRef}  </p>
	 * @see #__DNA__FIELD__tools
	 */
	
	public ListBase getTools() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 200, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 144, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tools'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> List of {@link bToolRef}  </p>
	 * @see #__DNA__FIELD__tools
	 */
	
	public void setTools(ListBase tools) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 144;
		}
		if (__io__equals(tools, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tools)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tools);
		} else {
			__io__generic__copy( getTools(), tools);
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
			return new CArrayFacade<Byte>(__io__address + 216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 216;
		} else {
			__dna__offset = 152;
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
	 * Get method for struct member 'object_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Switch to this object mode when activating the workspace
	 * @see #__DNA__FIELD__object_mode
	 */
	
	public int getObject_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 220);
		} else {
			return __io__block.readInt(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'object_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Switch to this object mode when activating the workspace
	 * @see #__DNA__FIELD__object_mode
	 */
	
	public void setObject_mode(int object_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 220, object_mode);
		} else {
			__io__block.writeInt(__io__address + 156, object_mode);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Enum eWorkSpaceFlags. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 224);
		} else {
			return __io__block.readInt(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Enum eWorkSpaceFlags. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 224, flags);
		} else {
			__io__block.writeInt(__io__address + 160, flags);
		}
	}

	/**
	 * Get method for struct member 'order'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number for workspace tab reordering in the UI. </p>
	 * @see #__DNA__FIELD__order
	 */
	
	public int getOrder() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 228);
		} else {
			return __io__block.readInt(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'order'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number for workspace tab reordering in the UI. </p>
	 * @see #__DNA__FIELD__order
	 */
	
	public void setOrder(int order) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 228, order);
		} else {
			__io__block.writeInt(__io__address + 164, order);
		}
	}

	/**
	 * Get method for struct member 'status_text'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Info text from modal operators (runtime). </p>
	 * @see #__DNA__FIELD__status_text
	 */
	
	public CPointer<Byte> getStatus_text() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'status_text'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Info text from modal operators (runtime). </p>
	 * @see #__DNA__FIELD__status_text
	 */
	
	public void setStatus_text(CPointer<Byte> status_text) throws IOException
	{
		long __address = ((status_text == null) ? 0 : status_text.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 168, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<WorkSpace> __io__addressof() {
		return new CPointer<WorkSpace>(__io__address, new Class[]{WorkSpace.class}, __io__block, __io__blockTable);
	}

}
