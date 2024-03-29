package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'PointCloud'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=424, size64=488)
public class PointCloud extends CFacade {

	/**
	 * This is the sdna index of the struct PointCloud.
	 * <p>
	 * It is required when allocating a new block to store data for PointCloud.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 567;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCloud pointcloud = ...;
	 * CPointer&lt;Object&gt; p = pointcloud.__dna__addressof(PointCloud.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 152/192</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> animation data (must be immediately after id) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCloud pointcloud = ...;
	 * CPointer&lt;Object&gt; p = pointcloud.__dna__addressof(PointCloud.__DNA__FIELD__adt);
	 * CPointer&lt;CPointer&lt;AnimData&gt;&gt; p_adt = p.cast(new Class[]{CPointer.class, AnimData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adt'</li>
	 * <li>Signature: 'AnimData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adt = new long[]{152, 192};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCloud pointcloud = ...;
	 * CPointer&lt;Object&gt; p = pointcloud.__dna__addressof(PointCloud.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{156, 200};

	/**
	 * Field descriptor (offset) for struct member 'totpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Geometry </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCloud pointcloud = ...;
	 * CPointer&lt;Object&gt; p = pointcloud.__dna__addressof(PointCloud.__DNA__FIELD__totpoint);
	 * CPointer&lt;Integer&gt; p_totpoint = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpoint'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpoint = new long[]{160, 204};

	/**
	 * Field descriptor (offset) for struct member 'pdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom Data </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCloud pointcloud = ...;
	 * CPointer&lt;Object&gt; p = pointcloud.__dna__addressof(PointCloud.__DNA__FIELD__pdata);
	 * CPointer&lt;CustomData&gt; p_pdata = p.cast(new Class[]{CustomData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdata'</li>
	 * <li>Signature: 'CustomData'</li>
	 * <li>Actual Size (32bit/64bit): 236/248</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdata = new long[]{164, 208};

	/**
	 * Field descriptor (offset) for struct member 'attributes_active_index'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCloud pointcloud = ...;
	 * CPointer&lt;Object&gt; p = pointcloud.__dna__addressof(PointCloud.__DNA__FIELD__attributes_active_index);
	 * CPointer&lt;Integer&gt; p_attributes_active_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attributes_active_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attributes_active_index = new long[]{400, 456};

	/**
	 * Field descriptor (offset) for struct member '_pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCloud pointcloud = ...;
	 * CPointer&lt;Object&gt; p = pointcloud.__dna__addressof(PointCloud.__DNA__FIELD___pad4);
	 * CPointer&lt;Integer&gt; p__pad4 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad4'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad4 = new long[]{404, 460};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Material}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCloud pointcloud = ...;
	 * CPointer&lt;Object&gt; p = pointcloud.__dna__addressof(PointCloud.__DNA__FIELD__mat);
	 * CPointer&lt;CPointer&lt;CPointer&lt;Material&gt;&gt;&gt; p_mat = p.cast(new Class[]{CPointer.class, CPointer.class, Material.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'Material**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{408, 464};

	/**
	 * Field descriptor (offset) for struct member 'totcol'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCloud pointcloud = ...;
	 * CPointer&lt;Object&gt; p = pointcloud.__dna__addressof(PointCloud.__DNA__FIELD__totcol);
	 * CPointer&lt;Short&gt; p_totcol = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totcol'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totcol = new long[]{412, 472};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCloud pointcloud = ...;
	 * CPointer&lt;Object&gt; p = pointcloud.__dna__addressof(PointCloud.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'short[3]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{414, 474};

	/**
	 * Field descriptor (offset) for struct member 'batch_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Draw Cache </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PointCloud pointcloud = ...;
	 * CPointer&lt;Object&gt; p = pointcloud.__dna__addressof(PointCloud.__DNA__FIELD__batch_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_batch_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'batch_cache'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__batch_cache = new long[]{420, 480};

	public PointCloud(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected PointCloud(PointCloud that) {
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
	 * Get method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> animation data (must be immediately after id) </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public CPointer<AnimData> getAdt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimData.class};
		return new CPointer<AnimData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'adt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> animation data (must be immediately after id) </p>
	 * @see #__DNA__FIELD__adt
	 */
	
	public void setAdt(CPointer<AnimData> adt) throws IOException
	{
		long __address = ((adt == null) ? 0 : adt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 152, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 200);
		} else {
			return __io__block.readInt(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 200, flag);
		} else {
			__io__block.writeInt(__io__address + 156, flag);
		}
	}

	/**
	 * Get method for struct member 'totpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Geometry </p>
	 * @see #__DNA__FIELD__totpoint
	 */
	
	public int getTotpoint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 204);
		} else {
			return __io__block.readInt(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'totpoint'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Geometry </p>
	 * @see #__DNA__FIELD__totpoint
	 */
	
	public void setTotpoint(int totpoint) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 204, totpoint);
		} else {
			__io__block.writeInt(__io__address + 160, totpoint);
		}
	}

	/**
	 * Get method for struct member 'pdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom Data </p>
	 * @see #__DNA__FIELD__pdata
	 */
	
	public CustomData getPdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData(__io__address + 208, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 164, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Custom Data </p>
	 * @see #__DNA__FIELD__pdata
	 */
	
	public void setPdata(CustomData pdata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 164;
		}
		if (__io__equals(pdata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pdata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pdata);
		} else {
			__io__generic__copy( getPdata(), pdata);
		}
	}

	/**
	 * Get method for struct member 'attributes_active_index'.
	 * @see #__DNA__FIELD__attributes_active_index
	 */
	
	public int getAttributes_active_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 456);
		} else {
			return __io__block.readInt(__io__address + 400);
		}
	}

	/**
	 * Set method for struct member 'attributes_active_index'.
	 * @see #__DNA__FIELD__attributes_active_index
	 */
	
	public void setAttributes_active_index(int attributes_active_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 456, attributes_active_index);
		} else {
			__io__block.writeInt(__io__address + 400, attributes_active_index);
		}
	}

	/**
	 * Get method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public int get_pad4() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 460);
		} else {
			return __io__block.readInt(__io__address + 404);
		}
	}

	/**
	 * Set method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public void set_pad4(int _pad4) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 460, _pad4);
		} else {
			__io__block.writeInt(__io__address + 404, _pad4);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Material}  </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public CPointer<CPointer<Material>> getMat() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 464);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 408);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Material.class};
		return new CPointer<CPointer<Material>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link Material}  </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CPointer<CPointer<Material>> mat) throws IOException
	{
		long __address = ((mat == null) ? 0 : mat.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 464, __address);
		} else {
			__io__block.writeLong(__io__address + 408, __address);
		}
	}

	/**
	 * Get method for struct member 'totcol'.
	 * @see #__DNA__FIELD__totcol
	 */
	
	public short getTotcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 472);
		} else {
			return __io__block.readShort(__io__address + 412);
		}
	}

	/**
	 * Set method for struct member 'totcol'.
	 * @see #__DNA__FIELD__totcol
	 */
	
	public void setTotcol(short totcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 472, totcol);
		} else {
			__io__block.writeShort(__io__address + 412, totcol);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CArrayFacade<Short> get_pad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 474, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 414, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CArrayFacade<Short> _pad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 474;
		} else {
			__dna__offset = 414;
		}
		if (__io__equals(_pad3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad3);
		} else {
			__io__generic__copy( get_pad3(), _pad3);
		}
	}

	/**
	 * Get method for struct member 'batch_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Draw Cache </p>
	 * @see #__DNA__FIELD__batch_cache
	 */
	
	public CPointer<Object> getBatch_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 480);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 420);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'batch_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Draw Cache </p>
	 * @see #__DNA__FIELD__batch_cache
	 */
	
	public void setBatch_cache(CPointer<Object> batch_cache) throws IOException
	{
		long __address = ((batch_cache == null) ? 0 : batch_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 480, __address);
		} else {
			__io__block.writeLong(__io__address + 420, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<PointCloud> __io__addressof() {
		return new CPointer<PointCloud>(__io__address, new Class[]{PointCloud.class}, __io__block, __io__blockTable);
	}

}
