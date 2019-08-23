package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CustomDataLayer'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
 * Object describing referenced custom data<h4>Blender Source Code:</h4>
 * <p> descriptor and storage for a custom data layer </p>
 */

@CMetaData(size32=100, size64=104)
public class CustomDataLayer extends CFacade {

	/**
	 * This is the sdna index of the struct CustomDataLayer.
	 * <p>
	 * It is required when allocating a new block to store data for CustomDataLayer.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 473;

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	CD_AUTO_FROM_NAME   = -1,
	 * 
	 * 	CD_MVERT            = 0,
	 * 	CD_MSTICKY          = 1,  // DEPRECATED 
	 * 	CD_MDEFORMVERT      = 2,
	 * 	CD_MEDGE            = 3,
	 * 	CD_MFACE            = 4,
	 * 	CD_MTFACE           = 5,
	 * 	CD_MCOL             = 6,
	 * 	CD_ORIGINDEX        = 7,
	 * 	CD_NORMAL           = 8,
	 * //	CD_POLYINDEX        = 9, 
	 * 	CD_PROP_FLT         = 10,
	 * 	CD_PROP_INT         = 11,
	 * 	CD_PROP_STR         = 12,
	 * 	CD_ORIGSPACE        = 13,  // for modifier stack face location mapping 
	 * 	CD_ORCO             = 14,
	 * 	CD_MTEXPOLY         = 15,
	 * 	CD_MLOOPUV          = 16,
	 * 	CD_MLOOPCOL         = 17,
	 * 	CD_TANGENT          = 18,
	 * 	CD_MDISPS           = 19,
	 * 	CD_PREVIEW_MCOL     = 20,  // for displaying weightpaint colors
	 * //	CD_ID_MCOL          = 21, 
	 * 	CD_TEXTURE_MLOOPCOL = 22,
	 * 	CD_CLOTH_ORCO       = 23,
	 * 	CD_RECAST           = 24,
	 * 
	 * // BMESH ONLY START
	 * 	CD_MPOLY            = 25,
	 * 	CD_MLOOP            = 26,
	 * 	CD_SHAPE_KEYINDEX   = 27,
	 * 	CD_SHAPEKEY         = 28,
	 * 	CD_BWEIGHT          = 29,
	 * 	CD_CREASE           = 30,
	 * 	CD_ORIGSPACE_MLOOP  = 31,
	 * 	CD_PREVIEW_MLOOPCOL = 32,
	 * 	CD_BM_ELEM_PYPTR    = 33,
	 * // BMESH ONLY END 
	 * 
	 * 	CD_PAINT_MASK       = 34,
	 * 	CD_GRID_PAINT_MASK  = 35,
	 * 	CD_MVERT_SKIN       = 36,
	 * 	CD_FREESTYLE_EDGE   = 37,
	 * 	CD_FREESTYLE_FACE   = 38,
	 * 	CD_MLOOPTANGENT     = 39,
	 * 	CD_TESSLOOPNORMAL   = 40,
	 * 	CD_CUSTOMLOOPNORMAL = 41,
	 * 
	 * 	CD_NUMTYPES         = 42
	 * 				</pre>
	 * 				<h4>Blender Source Code:</h4>
	 * <p> type of data in layer </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomDataLayer customdatalayer = ...;
	 * CPointer&lt;Object&gt; p = customdatalayer.__dna__addressof(CustomDataLayer.__DNA__FIELD__type);
	 * CPointer&lt;Integer&gt; p_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in editmode, offset of layer in block </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomDataLayer customdatalayer = ...;
	 * CPointer&lt;Object&gt; p = customdatalayer.__dna__addressof(CustomDataLayer.__DNA__FIELD__offset);
	 * CPointer&lt;Integer&gt; p_offset = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	// Indicates layer should not be copied by CustomData_from_template or CustomData_copy_data 
	 * 	CD_FLAG_NOCOPY    = (1 << 0),
	 * 	// Indicates layer should not be freed (for layers backed by external data) 
	 * 	CD_FLAG_NOFREE    = (1 << 1),
	 * 	// Indicates the layer is only temporary, also implies no copy 
	 * 	CD_FLAG_TEMPORARY = ((1 << 2) | CD_FLAG_NOCOPY),
	 * 	// Indicates the layer is stored in an external file 
	 * 	CD_FLAG_EXTERNAL  = (1 << 3),
	 * 	// Indicates external data is read into memory 
	 * 	CD_FLAG_IN_MEMORY = (1 << 4),
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> general purpose flag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomDataLayer customdatalayer = ...;
	 * CPointer&lt;Object&gt; p = customdatalayer.__dna__addressof(CustomDataLayer.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of the active layer of this type </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomDataLayer customdatalayer = ...;
	 * CPointer&lt;Object&gt; p = customdatalayer.__dna__addressof(CustomDataLayer.__DNA__FIELD__active);
	 * CPointer&lt;Integer&gt; p_active = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'active_rnd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of the layer to render </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomDataLayer customdatalayer = ...;
	 * CPointer&lt;Object&gt; p = customdatalayer.__dna__addressof(CustomDataLayer.__DNA__FIELD__active_rnd);
	 * CPointer&lt;Integer&gt; p_active_rnd = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_rnd'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_rnd = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'active_clone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of the layer to render </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomDataLayer customdatalayer = ...;
	 * CPointer&lt;Object&gt; p = customdatalayer.__dna__addressof(CustomDataLayer.__DNA__FIELD__active_clone);
	 * CPointer&lt;Integer&gt; p_active_clone = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_clone'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_clone = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'active_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of the layer to render </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomDataLayer customdatalayer = ...;
	 * CPointer&lt;Object&gt; p = customdatalayer.__dna__addressof(CustomDataLayer.__DNA__FIELD__active_mask);
	 * CPointer&lt;Integer&gt; p_active_mask = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_mask'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_mask = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'uid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> shape keyblock unique id reference </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomDataLayer customdatalayer = ...;
	 * CPointer&lt;Object&gt; p = customdatalayer.__dna__addressof(CustomDataLayer.__DNA__FIELD__uid);
	 * CPointer&lt;Integer&gt; p_uid = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uid'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uid = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> layer name, MAX_CUSTOMDATA_LAYER_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomDataLayer customdatalayer = ...;
	 * CPointer&lt;Object&gt; p = customdatalayer.__dna__addressof(CustomDataLayer.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Pointer on the actual data referenced by this data layer.<h4>Blender Source Code:</h4>
	 * <p> layer data </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomDataLayer customdatalayer = ...;
	 * CPointer&lt;Object&gt; p = customdatalayer.__dna__addressof(CustomDataLayer.__DNA__FIELD__data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data = new long[]{96, 96};

	public CustomDataLayer(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CustomDataLayer(CustomDataLayer that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	CD_AUTO_FROM_NAME   = -1,
	 * 
	 * 	CD_MVERT            = 0,
	 * 	CD_MSTICKY          = 1,  // DEPRECATED 
	 * 	CD_MDEFORMVERT      = 2,
	 * 	CD_MEDGE            = 3,
	 * 	CD_MFACE            = 4,
	 * 	CD_MTFACE           = 5,
	 * 	CD_MCOL             = 6,
	 * 	CD_ORIGINDEX        = 7,
	 * 	CD_NORMAL           = 8,
	 * //	CD_POLYINDEX        = 9, 
	 * 	CD_PROP_FLT         = 10,
	 * 	CD_PROP_INT         = 11,
	 * 	CD_PROP_STR         = 12,
	 * 	CD_ORIGSPACE        = 13,  // for modifier stack face location mapping 
	 * 	CD_ORCO             = 14,
	 * 	CD_MTEXPOLY         = 15,
	 * 	CD_MLOOPUV          = 16,
	 * 	CD_MLOOPCOL         = 17,
	 * 	CD_TANGENT          = 18,
	 * 	CD_MDISPS           = 19,
	 * 	CD_PREVIEW_MCOL     = 20,  // for displaying weightpaint colors
	 * //	CD_ID_MCOL          = 21, 
	 * 	CD_TEXTURE_MLOOPCOL = 22,
	 * 	CD_CLOTH_ORCO       = 23,
	 * 	CD_RECAST           = 24,
	 * 
	 * // BMESH ONLY START
	 * 	CD_MPOLY            = 25,
	 * 	CD_MLOOP            = 26,
	 * 	CD_SHAPE_KEYINDEX   = 27,
	 * 	CD_SHAPEKEY         = 28,
	 * 	CD_BWEIGHT          = 29,
	 * 	CD_CREASE           = 30,
	 * 	CD_ORIGSPACE_MLOOP  = 31,
	 * 	CD_PREVIEW_MLOOPCOL = 32,
	 * 	CD_BM_ELEM_PYPTR    = 33,
	 * // BMESH ONLY END 
	 * 
	 * 	CD_PAINT_MASK       = 34,
	 * 	CD_GRID_PAINT_MASK  = 35,
	 * 	CD_MVERT_SKIN       = 36,
	 * 	CD_FREESTYLE_EDGE   = 37,
	 * 	CD_FREESTYLE_FACE   = 38,
	 * 	CD_MLOOPTANGENT     = 39,
	 * 	CD_TESSLOOPNORMAL   = 40,
	 * 	CD_CUSTOMLOOPNORMAL = 41,
	 * 
	 * 	CD_NUMTYPES         = 42
	 * 				</pre>
	 * 				<h4>Blender Source Code:</h4>
	 * <p> type of data in layer </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public int getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	CD_AUTO_FROM_NAME   = -1,
	 * 
	 * 	CD_MVERT            = 0,
	 * 	CD_MSTICKY          = 1,  // DEPRECATED 
	 * 	CD_MDEFORMVERT      = 2,
	 * 	CD_MEDGE            = 3,
	 * 	CD_MFACE            = 4,
	 * 	CD_MTFACE           = 5,
	 * 	CD_MCOL             = 6,
	 * 	CD_ORIGINDEX        = 7,
	 * 	CD_NORMAL           = 8,
	 * //	CD_POLYINDEX        = 9, 
	 * 	CD_PROP_FLT         = 10,
	 * 	CD_PROP_INT         = 11,
	 * 	CD_PROP_STR         = 12,
	 * 	CD_ORIGSPACE        = 13,  // for modifier stack face location mapping 
	 * 	CD_ORCO             = 14,
	 * 	CD_MTEXPOLY         = 15,
	 * 	CD_MLOOPUV          = 16,
	 * 	CD_MLOOPCOL         = 17,
	 * 	CD_TANGENT          = 18,
	 * 	CD_MDISPS           = 19,
	 * 	CD_PREVIEW_MCOL     = 20,  // for displaying weightpaint colors
	 * //	CD_ID_MCOL          = 21, 
	 * 	CD_TEXTURE_MLOOPCOL = 22,
	 * 	CD_CLOTH_ORCO       = 23,
	 * 	CD_RECAST           = 24,
	 * 
	 * // BMESH ONLY START
	 * 	CD_MPOLY            = 25,
	 * 	CD_MLOOP            = 26,
	 * 	CD_SHAPE_KEYINDEX   = 27,
	 * 	CD_SHAPEKEY         = 28,
	 * 	CD_BWEIGHT          = 29,
	 * 	CD_CREASE           = 30,
	 * 	CD_ORIGSPACE_MLOOP  = 31,
	 * 	CD_PREVIEW_MLOOPCOL = 32,
	 * 	CD_BM_ELEM_PYPTR    = 33,
	 * // BMESH ONLY END 
	 * 
	 * 	CD_PAINT_MASK       = 34,
	 * 	CD_GRID_PAINT_MASK  = 35,
	 * 	CD_MVERT_SKIN       = 36,
	 * 	CD_FREESTYLE_EDGE   = 37,
	 * 	CD_FREESTYLE_FACE   = 38,
	 * 	CD_MLOOPTANGENT     = 39,
	 * 	CD_TESSLOOPNORMAL   = 40,
	 * 	CD_CUSTOMLOOPNORMAL = 41,
	 * 
	 * 	CD_NUMTYPES         = 42
	 * 				</pre>
	 * 				<h4>Blender Source Code:</h4>
	 * <p> type of data in layer </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(int type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, type);
		} else {
			__io__block.writeInt(__io__address + 0, type);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in editmode, offset of layer in block </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public int getOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in editmode, offset of layer in block </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(int offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, offset);
		} else {
			__io__block.writeInt(__io__address + 4, offset);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	// Indicates layer should not be copied by CustomData_from_template or CustomData_copy_data 
	 * 	CD_FLAG_NOCOPY    = (1 << 0),
	 * 	// Indicates layer should not be freed (for layers backed by external data) 
	 * 	CD_FLAG_NOFREE    = (1 << 1),
	 * 	// Indicates the layer is only temporary, also implies no copy 
	 * 	CD_FLAG_TEMPORARY = ((1 << 2) | CD_FLAG_NOCOPY),
	 * 	// Indicates the layer is stored in an external file 
	 * 	CD_FLAG_EXTERNAL  = (1 << 3),
	 * 	// Indicates external data is read into memory 
	 * 	CD_FLAG_IN_MEMORY = (1 << 4),
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> general purpose flag </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * <h3>Values:</h3>
	 * 				<pre>
	 * 	// Indicates layer should not be copied by CustomData_from_template or CustomData_copy_data 
	 * 	CD_FLAG_NOCOPY    = (1 << 0),
	 * 	// Indicates layer should not be freed (for layers backed by external data) 
	 * 	CD_FLAG_NOFREE    = (1 << 1),
	 * 	// Indicates the layer is only temporary, also implies no copy 
	 * 	CD_FLAG_TEMPORARY = ((1 << 2) | CD_FLAG_NOCOPY),
	 * 	// Indicates the layer is stored in an external file 
	 * 	CD_FLAG_EXTERNAL  = (1 << 3),
	 * 	// Indicates external data is read into memory 
	 * 	CD_FLAG_IN_MEMORY = (1 << 4),
	 * 				</pre><h4>Blender Source Code:</h4>
	 * <p> general purpose flag </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, flag);
		} else {
			__io__block.writeInt(__io__address + 8, flag);
		}
	}

	/**
	 * Get method for struct member 'active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of the active layer of this type </p>
	 * @see #__DNA__FIELD__active
	 */
	
	public int getActive() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'active'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of the active layer of this type </p>
	 * @see #__DNA__FIELD__active
	 */
	
	public void setActive(int active) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, active);
		} else {
			__io__block.writeInt(__io__address + 12, active);
		}
	}

	/**
	 * Get method for struct member 'active_rnd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of the layer to render </p>
	 * @see #__DNA__FIELD__active_rnd
	 */
	
	public int getActive_rnd() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'active_rnd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of the layer to render </p>
	 * @see #__DNA__FIELD__active_rnd
	 */
	
	public void setActive_rnd(int active_rnd) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, active_rnd);
		} else {
			__io__block.writeInt(__io__address + 16, active_rnd);
		}
	}

	/**
	 * Get method for struct member 'active_clone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of the layer to render </p>
	 * @see #__DNA__FIELD__active_clone
	 */
	
	public int getActive_clone() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'active_clone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of the layer to render </p>
	 * @see #__DNA__FIELD__active_clone
	 */
	
	public void setActive_clone(int active_clone) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, active_clone);
		} else {
			__io__block.writeInt(__io__address + 20, active_clone);
		}
	}

	/**
	 * Get method for struct member 'active_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of the layer to render </p>
	 * @see #__DNA__FIELD__active_mask
	 */
	
	public int getActive_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'active_mask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of the layer to render </p>
	 * @see #__DNA__FIELD__active_mask
	 */
	
	public void setActive_mask(int active_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, active_mask);
		} else {
			__io__block.writeInt(__io__address + 24, active_mask);
		}
	}

	/**
	 * Get method for struct member 'uid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> shape keyblock unique id reference </p>
	 * @see #__DNA__FIELD__uid
	 */
	
	public int getUid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'uid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> shape keyblock unique id reference </p>
	 * @see #__DNA__FIELD__uid
	 */
	
	public void setUid(int uid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, uid);
		} else {
			__io__block.writeInt(__io__address + 28, uid);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> layer name, MAX_CUSTOMDATA_LAYER_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> layer name, MAX_CUSTOMDATA_LAYER_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Pointer on the actual data referenced by this data layer.<h4>Blender Source Code:</h4>
	 * <p> layer data </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public CPointer<Object> getData() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Pointer on the actual data referenced by this data layer.<h4>Blender Source Code:</h4>
	 * <p> layer data </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public void setData(CPointer<Object> data) throws IOException
	{
		long __address = ((data == null) ? 0 : data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 96, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CustomDataLayer> __io__addressof() {
		return new CPointer<CustomDataLayer>(__io__address, new Class[]{CustomDataLayer.class}, __io__block, __io__blockTable);
	}

}
