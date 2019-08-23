package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Object_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Not saved in file! </p>
 */

@CMetaData(size32=96, size64=128)
public class Object_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct Object_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for Object_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 160;

	/**
	 * Field descriptor (offset) for struct member 'last_data_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The custom data layer mask that was last used to calculate mesh_eval and mesh_deform_eval. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__last_data_mask);
	 * CPointer&lt;CustomData_MeshMasks&gt; p_last_data_mask = p.cast(new Class[]{CustomData_MeshMasks.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_data_mask'</li>
	 * <li>Signature: 'CustomData_MeshMasks'</li>
	 * <li>Actual Size (32bit/64bit): 40/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_data_mask = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'last_need_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Did last modifier stack generation need mapping support? </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__last_need_mapping);
	 * CPointer&lt;Byte&gt; p_last_need_mapping = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_need_mapping'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_need_mapping = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{41, 41};

	/**
	 * Field descriptor (offset) for struct member 'parent_display_origin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only used for drawing the parent/child help-line. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__parent_display_origin);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_parent_display_origin = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent_display_origin'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent_display_origin = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'select_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Selection id of this object; only available in the original object </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__select_id);
	 * CPointer&lt;Integer&gt; p_select_id = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'select_id'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__select_id = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'is_mesh_eval_owned'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Denotes whether the evaluated mesh is owned by this object or is referenced and owned by somebody else. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__is_mesh_eval_owned);
	 * CPointer&lt;Byte&gt; p_is_mesh_eval_owned = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'is_mesh_eval_owned'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__is_mesh_eval_owned = new long[]{63, 63};

	/**
	 * Field descriptor (offset) for struct member 'bb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis aligned boundbox (in localspace). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__bb);
	 * CPointer&lt;CPointer&lt;BoundBox&gt;&gt; p_bb = p.cast(new Class[]{CPointer.class, BoundBox.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb'</li>
	 * <li>Signature: 'BoundBox*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'mesh_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original mesh pointer, before object->data was changed to point to mesh_eval. Is assigned by dependency graph's copy-on-write evaluation. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__mesh_orig);
	 * CPointer&lt;CPointer&lt;Mesh&gt;&gt; p_mesh_orig = p.cast(new Class[]{CPointer.class, Mesh.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_orig'</li>
	 * <li>Signature: 'Mesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_orig = new long[]{68, 72};

	/**
	 * Field descriptor (offset) for struct member 'mesh_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  structure created during object evaluation. It has all modifiers applied. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__mesh_eval);
	 * CPointer&lt;CPointer&lt;Mesh&gt;&gt; p_mesh_eval = p.cast(new Class[]{CPointer.class, Mesh.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_eval'</li>
	 * <li>Signature: 'Mesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_eval = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'mesh_deform_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  structure created during object evaluation. It has deforemation only modifiers applied on it. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__mesh_deform_eval);
	 * CPointer&lt;CPointer&lt;Mesh&gt;&gt; p_mesh_deform_eval = p.cast(new Class[]{CPointer.class, Mesh.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_deform_eval'</li>
	 * <li>Signature: 'Mesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_deform_eval = new long[]{76, 88};

	/**
	 * Field descriptor (offset) for struct member 'object_as_temp_mesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__object_as_temp_mesh);
	 * CPointer&lt;CPointer&lt;Mesh&gt;&gt; p_object_as_temp_mesh = p.cast(new Class[]{CPointer.class, Mesh.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_as_temp_mesh'</li>
	 * <li>Signature: 'Mesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_as_temp_mesh = new long[]{80, 96};

	/**
	 * Field descriptor (offset) for struct member 'curve_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime evaluated curve-specific data, not stored in the file. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__curve_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_curve_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_cache'</li>
	 * <li>Signature: 'CurveCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_cache = new long[]{84, 104};

	/**
	 * Field descriptor (offset) for struct member 'gpencil_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime grease pencil drawing data </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD__gpencil_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_gpencil_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpencil_cache'</li>
	 * <li>Signature: 'GpencilBatchCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpencil_cache = new long[]{88, 112};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Padding is here for win32s unconventional struct alignment rules. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Object_Runtime object_runtime = ...;
	 * CPointer&lt;Object&gt; p = object_runtime.__dna__addressof(Object_Runtime.__DNA__FIELD___pad2);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad2 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{92, 120};

	public Object_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Object_Runtime(Object_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'last_data_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The custom data layer mask that was last used to calculate mesh_eval and mesh_deform_eval. </p>
	 * @see #__DNA__FIELD__last_data_mask
	 */
	
	public CustomData_MeshMasks getLast_data_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData_MeshMasks(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new CustomData_MeshMasks(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'last_data_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The custom data layer mask that was last used to calculate mesh_eval and mesh_deform_eval. </p>
	 * @see #__DNA__FIELD__last_data_mask
	 */
	
	public void setLast_data_mask(CustomData_MeshMasks last_data_mask) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(last_data_mask, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, last_data_mask)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, last_data_mask);
		} else {
			__io__generic__copy( getLast_data_mask(), last_data_mask);
		}
	}

	/**
	 * Get method for struct member 'last_need_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Did last modifier stack generation need mapping support? </p>
	 * @see #__DNA__FIELD__last_need_mapping
	 */
	
	public byte getLast_need_mapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 40);
		} else {
			return __io__block.readByte(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'last_need_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Did last modifier stack generation need mapping support? </p>
	 * @see #__DNA__FIELD__last_need_mapping
	 */
	
	public void setLast_need_mapping(byte last_need_mapping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 40, last_need_mapping);
		} else {
			__io__block.writeByte(__io__address + 40, last_need_mapping);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 41, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 41, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 41;
		} else {
			__dna__offset = 41;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Get method for struct member 'parent_display_origin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only used for drawing the parent/child help-line. </p>
	 * @see #__DNA__FIELD__parent_display_origin
	 */
	
	public CArrayFacade<Float> getParent_display_origin() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parent_display_origin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Only used for drawing the parent/child help-line. </p>
	 * @see #__DNA__FIELD__parent_display_origin
	 */
	
	public void setParent_display_origin(CArrayFacade<Float> parent_display_origin) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 44;
		} else {
			__dna__offset = 44;
		}
		if (__io__equals(parent_display_origin, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, parent_display_origin)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, parent_display_origin);
		} else {
			__io__generic__copy( getParent_display_origin(), parent_display_origin);
		}
	}

	/**
	 * Get method for struct member 'select_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Selection id of this object; only available in the original object </p>
	 * @see #__DNA__FIELD__select_id
	 */
	
	public int getSelect_id() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 56);
		} else {
			return __io__block.readInt(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'select_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Selection id of this object; only available in the original object </p>
	 * @see #__DNA__FIELD__select_id
	 */
	
	public void setSelect_id(int select_id) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 56, select_id);
		} else {
			__io__block.writeInt(__io__address + 56, select_id);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 60;
		} else {
			__dna__offset = 60;
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
	 * Get method for struct member 'is_mesh_eval_owned'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Denotes whether the evaluated mesh is owned by this object or is referenced and owned by somebody else. </p>
	 * @see #__DNA__FIELD__is_mesh_eval_owned
	 */
	
	public byte getIs_mesh_eval_owned() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 63);
		} else {
			return __io__block.readByte(__io__address + 63);
		}
	}

	/**
	 * Set method for struct member 'is_mesh_eval_owned'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Denotes whether the evaluated mesh is owned by this object or is referenced and owned by somebody else. </p>
	 * @see #__DNA__FIELD__is_mesh_eval_owned
	 */
	
	public void setIs_mesh_eval_owned(byte is_mesh_eval_owned) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 63, is_mesh_eval_owned);
		} else {
			__io__block.writeByte(__io__address + 63, is_mesh_eval_owned);
		}
	}

	/**
	 * Get method for struct member 'bb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis aligned boundbox (in localspace). </p>
	 * @see #__DNA__FIELD__bb
	 */
	
	public CPointer<BoundBox> getBb() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BoundBox.class};
		return new CPointer<BoundBox>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BoundBox.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bb'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Axis aligned boundbox (in localspace). </p>
	 * @see #__DNA__FIELD__bb
	 */
	
	public void setBb(CPointer<BoundBox> bb) throws IOException
	{
		long __address = ((bb == null) ? 0 : bb.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 64, __address);
		}
	}

	/**
	 * Get method for struct member 'mesh_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original mesh pointer, before object->data was changed to point to mesh_eval. Is assigned by dependency graph's copy-on-write evaluation. </p>
	 * @see #__DNA__FIELD__mesh_orig
	 */
	
	public CPointer<Mesh> getMesh_orig() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 68);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mesh_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original mesh pointer, before object->data was changed to point to mesh_eval. Is assigned by dependency graph's copy-on-write evaluation. </p>
	 * @see #__DNA__FIELD__mesh_orig
	 */
	
	public void setMesh_orig(CPointer<Mesh> mesh_orig) throws IOException
	{
		long __address = ((mesh_orig == null) ? 0 : mesh_orig.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 72, __address);
		} else {
			__io__block.writeLong(__io__address + 68, __address);
		}
	}

	/**
	 * Get method for struct member 'mesh_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  structure created during object evaluation. It has all modifiers applied. </p>
	 * @see #__DNA__FIELD__mesh_eval
	 */
	
	public CPointer<Mesh> getMesh_eval() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mesh_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  structure created during object evaluation. It has all modifiers applied. </p>
	 * @see #__DNA__FIELD__mesh_eval
	 */
	
	public void setMesh_eval(CPointer<Mesh> mesh_eval) throws IOException
	{
		long __address = ((mesh_eval == null) ? 0 : mesh_eval.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 72, __address);
		}
	}

	/**
	 * Get method for struct member 'mesh_deform_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  structure created during object evaluation. It has deforemation only modifiers applied on it. </p>
	 * @see #__DNA__FIELD__mesh_deform_eval
	 */
	
	public CPointer<Mesh> getMesh_deform_eval() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 76);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mesh_deform_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  structure created during object evaluation. It has deforemation only modifiers applied on it. </p>
	 * @see #__DNA__FIELD__mesh_deform_eval
	 */
	
	public void setMesh_deform_eval(CPointer<Mesh> mesh_deform_eval) throws IOException
	{
		long __address = ((mesh_deform_eval == null) ? 0 : mesh_deform_eval.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 76, __address);
		}
	}

	/**
	 * Get method for struct member 'object_as_temp_mesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * @see #__DNA__FIELD__object_as_temp_mesh
	 */
	
	public CPointer<Mesh> getObject_as_temp_mesh() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object_as_temp_mesh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code></code> . </p>
	 * @see #__DNA__FIELD__object_as_temp_mesh
	 */
	
	public void setObject_as_temp_mesh(CPointer<Mesh> object_as_temp_mesh) throws IOException
	{
		long __address = ((object_as_temp_mesh == null) ? 0 : object_as_temp_mesh.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 80, __address);
		}
	}

	/**
	 * Get method for struct member 'curve_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime evaluated curve-specific data, not stored in the file. </p>
	 * @see #__DNA__FIELD__curve_cache
	 */
	
	public CPointer<Object> getCurve_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 84);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curve_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime evaluated curve-specific data, not stored in the file. </p>
	 * @see #__DNA__FIELD__curve_cache
	 */
	
	public void setCurve_cache(CPointer<Object> curve_cache) throws IOException
	{
		long __address = ((curve_cache == null) ? 0 : curve_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 84, __address);
		}
	}

	/**
	 * Get method for struct member 'gpencil_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime grease pencil drawing data </p>
	 * @see #__DNA__FIELD__gpencil_cache
	 */
	
	public CPointer<Object> getGpencil_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpencil_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime grease pencil drawing data </p>
	 * @see #__DNA__FIELD__gpencil_cache
	 */
	
	public void setGpencil_cache(CPointer<Object> gpencil_cache) throws IOException
	{
		long __address = ((gpencil_cache == null) ? 0 : gpencil_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Padding is here for win32s unconventional struct alignment rules. </p>
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CPointer<Object> get_pad2() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 92);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Padding is here for win32s unconventional struct alignment rules. </p>
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CPointer<Object> _pad2) throws IOException
	{
		long __address = ((_pad2 == null) ? 0 : _pad2.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 92, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Object_Runtime> __io__addressof() {
		return new CPointer<Object_Runtime>(__io__address, new Class[]{Object_Runtime.class}, __io__block, __io__blockTable);
	}

}
