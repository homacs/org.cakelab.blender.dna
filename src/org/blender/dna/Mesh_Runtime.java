package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Mesh_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> not saved in file! </p>
 */

@CMetaData(size32=96, size64=136)
public class Mesh_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct Mesh_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for Mesh_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 62;

	/**
	 * Field descriptor (offset) for struct member 'mesh_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Evaluated mesh for objects which do not have effective modifiers. This mesh is sued as a result of modifier stack evaluation. Since modifier stack evaluation is threaded on object level we need some synchronization. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__mesh_eval);
	 * CPointer&lt;CPointer&lt;Mesh&gt;&gt; p_mesh_eval = p.cast(new Class[]{CPointer.class, Mesh.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_eval'</li>
	 * <li>Signature: 'Mesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_eval = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'eval_mutex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__eval_mutex);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_eval_mutex = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eval_mutex'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eval_mutex = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'edit_data'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__edit_data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_edit_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edit_data'</li>
	 * <li>Signature: 'EditMeshData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edit_data = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'batch_cache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__batch_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_batch_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'batch_cache'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__batch_cache = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'subdiv_ccg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__subdiv_ccg);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_subdiv_ccg = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subdiv_ccg'</li>
	 * <li>Signature: 'SubdivCCG*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subdiv_ccg = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD___pad1);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad1 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'subdiv_ccg_tot_level'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__subdiv_ccg_tot_level);
	 * CPointer&lt;Integer&gt; p_subdiv_ccg_tot_level = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subdiv_ccg_tot_level'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subdiv_ccg_tot_level = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{28, 52};

	/**
	 * Field descriptor (offset) for struct member 'cd_dirty_vert'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__cd_dirty_vert);
	 * CPointer&lt;int64&gt; p_cd_dirty_vert = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cd_dirty_vert'</li>
	 * <li>Signature: 'int64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cd_dirty_vert = new long[]{32, 56};

	/**
	 * Field descriptor (offset) for struct member 'cd_dirty_edge'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__cd_dirty_edge);
	 * CPointer&lt;int64&gt; p_cd_dirty_edge = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cd_dirty_edge'</li>
	 * <li>Signature: 'int64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cd_dirty_edge = new long[]{40, 64};

	/**
	 * Field descriptor (offset) for struct member 'cd_dirty_loop'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__cd_dirty_loop);
	 * CPointer&lt;int64&gt; p_cd_dirty_loop = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cd_dirty_loop'</li>
	 * <li>Signature: 'int64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cd_dirty_loop = new long[]{48, 72};

	/**
	 * Field descriptor (offset) for struct member 'cd_dirty_poly'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__cd_dirty_poly);
	 * CPointer&lt;int64&gt; p_cd_dirty_poly = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cd_dirty_poly'</li>
	 * <li>Signature: 'int64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cd_dirty_poly = new long[]{56, 80};

	/**
	 * Field descriptor (offset) for struct member 'looptris'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__looptris);
	 * CPointer&lt;MLoopTri_Store&gt; p_looptris = p.cast(new Class[]{MLoopTri_Store.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'looptris'</li>
	 * <li>Signature: 'MLoopTri_Store'</li>
	 * <li>Actual Size (32bit/64bit): 16/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__looptris = new long[]{64, 88};

	/**
	 * Field descriptor (offset) for struct member 'bvh_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 'BVHCache', for 'BKE_bvhutil.c' </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__bvh_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_bvh_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bvh_cache'</li>
	 * <li>Signature: 'LinkNode*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bvh_cache = new long[]{80, 112};

	/**
	 * Field descriptor (offset) for struct member 'shrinkwrap_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Non-manifold boundary data for Shrinkwrap Target Project. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__shrinkwrap_data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_shrinkwrap_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shrinkwrap_data'</li>
	 * <li>Signature: 'ShrinkwrapBoundaryData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shrinkwrap_data = new long[]{84, 120};

	/**
	 * Field descriptor (offset) for struct member 'deformed_only'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set by modifier stack if only deformed from original. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__deformed_only);
	 * CPointer&lt;Byte&gt; p_deformed_only = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'deformed_only'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__deformed_only = new long[]{88, 128};

	/**
	 * Field descriptor (offset) for struct member 'is_original'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Copied from edit-mesh (hint, draw with editmesh data). In the future we may leave the mesh-data empty since its not needed if we can use edit-mesh data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD__is_original);
	 * CPointer&lt;Byte&gt; p_is_original = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'is_original'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__is_original = new long[]{89, 129};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Mesh_Runtime mesh_runtime = ...;
	 * CPointer&lt;Object&gt; p = mesh_runtime.__dna__addressof(Mesh_Runtime.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{90, 130};

	public Mesh_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Mesh_Runtime(Mesh_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'mesh_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Evaluated mesh for objects which do not have effective modifiers. This mesh is sued as a result of modifier stack evaluation. Since modifier stack evaluation is threaded on object level we need some synchronization. </p>
	 * @see #__DNA__FIELD__mesh_eval
	 */
	
	public CPointer<Mesh> getMesh_eval() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mesh_eval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Evaluated mesh for objects which do not have effective modifiers. This mesh is sued as a result of modifier stack evaluation. Since modifier stack evaluation is threaded on object level we need some synchronization. </p>
	 * @see #__DNA__FIELD__mesh_eval
	 */
	
	public void setMesh_eval(CPointer<Mesh> mesh_eval) throws IOException
	{
		long __address = ((mesh_eval == null) ? 0 : mesh_eval.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'eval_mutex'.
	 * @see #__DNA__FIELD__eval_mutex
	 */
	
	public CPointer<Object> getEval_mutex() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'eval_mutex'.
	 * @see #__DNA__FIELD__eval_mutex
	 */
	
	public void setEval_mutex(CPointer<Object> eval_mutex) throws IOException
	{
		long __address = ((eval_mutex == null) ? 0 : eval_mutex.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'edit_data'.
	 * @see #__DNA__FIELD__edit_data
	 */
	
	public CPointer<Object> getEdit_data() throws IOException
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
	 * Set method for struct member 'edit_data'.
	 * @see #__DNA__FIELD__edit_data
	 */
	
	public void setEdit_data(CPointer<Object> edit_data) throws IOException
	{
		long __address = ((edit_data == null) ? 0 : edit_data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'batch_cache'.
	 * @see #__DNA__FIELD__batch_cache
	 */
	
	public CPointer<Object> getBatch_cache() throws IOException
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
	 * Set method for struct member 'batch_cache'.
	 * @see #__DNA__FIELD__batch_cache
	 */
	
	public void setBatch_cache(CPointer<Object> batch_cache) throws IOException
	{
		long __address = ((batch_cache == null) ? 0 : batch_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'subdiv_ccg'.
	 * @see #__DNA__FIELD__subdiv_ccg
	 */
	
	public CPointer<Object> getSubdiv_ccg() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'subdiv_ccg'.
	 * @see #__DNA__FIELD__subdiv_ccg
	 */
	
	public void setSubdiv_ccg(CPointer<Object> subdiv_ccg) throws IOException
	{
		long __address = ((subdiv_ccg == null) ? 0 : subdiv_ccg.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CPointer<Object> get_pad1() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CPointer<Object> _pad1) throws IOException
	{
		long __address = ((_pad1 == null) ? 0 : _pad1.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'subdiv_ccg_tot_level'.
	 * @see #__DNA__FIELD__subdiv_ccg_tot_level
	 */
	
	public int getSubdiv_ccg_tot_level() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 48);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'subdiv_ccg_tot_level'.
	 * @see #__DNA__FIELD__subdiv_ccg_tot_level
	 */
	
	public void setSubdiv_ccg_tot_level(int subdiv_ccg_tot_level) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 48, subdiv_ccg_tot_level);
		} else {
			__io__block.writeInt(__io__address + 24, subdiv_ccg_tot_level);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 52, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 52;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Get method for struct member 'cd_dirty_vert'.
	 * @see #__DNA__FIELD__cd_dirty_vert
	 */
	
	public long getCd_dirty_vert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 56);
		} else {
			return __io__block.readInt64(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'cd_dirty_vert'.
	 * @see #__DNA__FIELD__cd_dirty_vert
	 */
	
	public void setCd_dirty_vert(long cd_dirty_vert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 56, cd_dirty_vert);
		} else {
			__io__block.writeInt64(__io__address + 32, cd_dirty_vert);
		}
	}

	/**
	 * Get method for struct member 'cd_dirty_edge'.
	 * @see #__DNA__FIELD__cd_dirty_edge
	 */
	
	public long getCd_dirty_edge() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 64);
		} else {
			return __io__block.readInt64(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'cd_dirty_edge'.
	 * @see #__DNA__FIELD__cd_dirty_edge
	 */
	
	public void setCd_dirty_edge(long cd_dirty_edge) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 64, cd_dirty_edge);
		} else {
			__io__block.writeInt64(__io__address + 40, cd_dirty_edge);
		}
	}

	/**
	 * Get method for struct member 'cd_dirty_loop'.
	 * @see #__DNA__FIELD__cd_dirty_loop
	 */
	
	public long getCd_dirty_loop() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 72);
		} else {
			return __io__block.readInt64(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'cd_dirty_loop'.
	 * @see #__DNA__FIELD__cd_dirty_loop
	 */
	
	public void setCd_dirty_loop(long cd_dirty_loop) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 72, cd_dirty_loop);
		} else {
			__io__block.writeInt64(__io__address + 48, cd_dirty_loop);
		}
	}

	/**
	 * Get method for struct member 'cd_dirty_poly'.
	 * @see #__DNA__FIELD__cd_dirty_poly
	 */
	
	public long getCd_dirty_poly() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 80);
		} else {
			return __io__block.readInt64(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'cd_dirty_poly'.
	 * @see #__DNA__FIELD__cd_dirty_poly
	 */
	
	public void setCd_dirty_poly(long cd_dirty_poly) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 80, cd_dirty_poly);
		} else {
			__io__block.writeInt64(__io__address + 56, cd_dirty_poly);
		}
	}

	/**
	 * Get method for struct member 'looptris'.
	 * @see #__DNA__FIELD__looptris
	 */
	
	public MLoopTri_Store getLooptris() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MLoopTri_Store(__io__address + 88, __io__block, __io__blockTable);
		} else {
			return new MLoopTri_Store(__io__address + 64, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'looptris'.
	 * @see #__DNA__FIELD__looptris
	 */
	
	public void setLooptris(MLoopTri_Store looptris) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(looptris, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, looptris)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, looptris);
		} else {
			__io__generic__copy( getLooptris(), looptris);
		}
	}

	/**
	 * Get method for struct member 'bvh_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 'BVHCache', for 'BKE_bvhutil.c' </p>
	 * @see #__DNA__FIELD__bvh_cache
	 */
	
	public CPointer<Object> getBvh_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bvh_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 'BVHCache', for 'BKE_bvhutil.c' </p>
	 * @see #__DNA__FIELD__bvh_cache
	 */
	
	public void setBvh_cache(CPointer<Object> bvh_cache) throws IOException
	{
		long __address = ((bvh_cache == null) ? 0 : bvh_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 80, __address);
		}
	}

	/**
	 * Get method for struct member 'shrinkwrap_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Non-manifold boundary data for Shrinkwrap Target Project. </p>
	 * @see #__DNA__FIELD__shrinkwrap_data
	 */
	
	public CPointer<Object> getShrinkwrap_data() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 84);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'shrinkwrap_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Non-manifold boundary data for Shrinkwrap Target Project. </p>
	 * @see #__DNA__FIELD__shrinkwrap_data
	 */
	
	public void setShrinkwrap_data(CPointer<Object> shrinkwrap_data) throws IOException
	{
		long __address = ((shrinkwrap_data == null) ? 0 : shrinkwrap_data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 84, __address);
		}
	}

	/**
	 * Get method for struct member 'deformed_only'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set by modifier stack if only deformed from original. </p>
	 * @see #__DNA__FIELD__deformed_only
	 */
	
	public byte getDeformed_only() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 128);
		} else {
			return __io__block.readByte(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'deformed_only'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Set by modifier stack if only deformed from original. </p>
	 * @see #__DNA__FIELD__deformed_only
	 */
	
	public void setDeformed_only(byte deformed_only) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 128, deformed_only);
		} else {
			__io__block.writeByte(__io__address + 88, deformed_only);
		}
	}

	/**
	 * Get method for struct member 'is_original'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Copied from edit-mesh (hint, draw with editmesh data). In the future we may leave the mesh-data empty since its not needed if we can use edit-mesh data. </p>
	 * @see #__DNA__FIELD__is_original
	 */
	
	public byte getIs_original() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 129);
		} else {
			return __io__block.readByte(__io__address + 89);
		}
	}

	/**
	 * Set method for struct member 'is_original'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Copied from edit-mesh (hint, draw with editmesh data). In the future we may leave the mesh-data empty since its not needed if we can use edit-mesh data. </p>
	 * @see #__DNA__FIELD__is_original
	 */
	
	public void setIs_original(byte is_original) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 129, is_original);
		} else {
			__io__block.writeByte(__io__address + 89, is_original);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 130, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 90, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 130;
		} else {
			__dna__offset = 90;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Mesh_Runtime> __io__addressof() {
		return new CPointer<Mesh_Runtime>(__io__address, new Class[]{Mesh_Runtime.class}, __io__block, __io__blockTable);
	}

}
