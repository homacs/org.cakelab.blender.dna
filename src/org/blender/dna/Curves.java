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
 * Generated facet for DNA struct type 'Curves'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=684, size64=784)
public class Curves extends CFacade {

	/**
	 * This is the sdna index of the struct Curves.
	 * <p>
	 * It is required when allocating a new block to store data for Curves.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 785;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curves curves = ...;
	 * CPointer&lt;Object&gt; p = curves.__dna__addressof(Curves.__DNA__FIELD__id);
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
	 * <p> Animation data (must be immediately after id). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curves curves = ...;
	 * CPointer&lt;Object&gt; p = curves.__dna__addressof(Curves.__DNA__FIELD__adt);
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
	 * Field descriptor (offset) for struct member 'geometry'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curves curves = ...;
	 * CPointer&lt;Object&gt; p = curves.__dna__addressof(Curves.__DNA__FIELD__geometry);
	 * CPointer&lt;CurvesGeometry&gt; p_geometry = p.cast(new Class[]{CurvesGeometry.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'geometry'</li>
	 * <li>Signature: 'CurvesGeometry'</li>
	 * <li>Actual Size (32bit/64bit): 500/544</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__geometry = new long[]{156, 200};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curves curves = ...;
	 * CPointer&lt;Object&gt; p = curves.__dna__addressof(Curves.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{656, 744};

	/**
	 * Field descriptor (offset) for struct member 'attributes_active_index'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curves curves = ...;
	 * CPointer&lt;Object&gt; p = curves.__dna__addressof(Curves.__DNA__FIELD__attributes_active_index);
	 * CPointer&lt;Integer&gt; p_attributes_active_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attributes_active_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attributes_active_index = new long[]{660, 748};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Materials. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curves curves = ...;
	 * CPointer&lt;Object&gt; p = curves.__dna__addressof(Curves.__DNA__FIELD__mat);
	 * CPointer&lt;CPointer&lt;CPointer&lt;Material&gt;&gt;&gt; p_mat = p.cast(new Class[]{CPointer.class, CPointer.class, Material.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'Material**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{664, 752};

	/**
	 * Field descriptor (offset) for struct member 'totcol'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curves curves = ...;
	 * CPointer&lt;Object&gt; p = curves.__dna__addressof(Curves.__DNA__FIELD__totcol);
	 * CPointer&lt;Short&gt; p_totcol = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totcol'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totcol = new long[]{668, 760};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curves curves = ...;
	 * CPointer&lt;Object&gt; p = curves.__dna__addressof(Curves.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'short[3]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{670, 762};

	/**
	 * Field descriptor (offset) for struct member 'surface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used as base mesh when curves represent e.g. hair or fur. This surface is used in edit modes. When set, the curves will have attributes that indicate a position on this surface. This is used for deforming the curves when the surface is deformed dynamically.</p><p> This is expected to be a mesh object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curves curves = ...;
	 * CPointer&lt;Object&gt; p = curves.__dna__addressof(Curves.__DNA__FIELD__surface);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_surface = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'surface'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__surface = new long[]{676, 768};

	/**
	 * Field descriptor (offset) for struct member 'batch_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Draw Cache. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curves curves = ...;
	 * CPointer&lt;Object&gt; p = curves.__dna__addressof(Curves.__DNA__FIELD__batch_cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_batch_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'batch_cache'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__batch_cache = new long[]{680, 776};

	public Curves(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Curves(Curves that) {
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
	 * <p> Animation data (must be immediately after id). </p>
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
	 * <p> Animation data (must be immediately after id). </p>
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
	 * Get method for struct member 'geometry'.
	 * @see #__DNA__FIELD__geometry
	 */
	
	public CurvesGeometry getGeometry() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CurvesGeometry(__io__address + 200, __io__block, __io__blockTable);
		} else {
			return new CurvesGeometry(__io__address + 156, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'geometry'.
	 * @see #__DNA__FIELD__geometry
	 */
	
	public void setGeometry(CurvesGeometry geometry) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(geometry, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, geometry)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, geometry);
		} else {
			__io__generic__copy( getGeometry(), geometry);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 744);
		} else {
			return __io__block.readInt(__io__address + 656);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 744, flag);
		} else {
			__io__block.writeInt(__io__address + 656, flag);
		}
	}

	/**
	 * Get method for struct member 'attributes_active_index'.
	 * @see #__DNA__FIELD__attributes_active_index
	 */
	
	public int getAttributes_active_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 748);
		} else {
			return __io__block.readInt(__io__address + 660);
		}
	}

	/**
	 * Set method for struct member 'attributes_active_index'.
	 * @see #__DNA__FIELD__attributes_active_index
	 */
	
	public void setAttributes_active_index(int attributes_active_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 748, attributes_active_index);
		} else {
			__io__block.writeInt(__io__address + 660, attributes_active_index);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Materials. </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public CPointer<CPointer<Material>> getMat() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 752);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 664);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Material.class};
		return new CPointer<CPointer<Material>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Materials. </p>
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CPointer<CPointer<Material>> mat) throws IOException
	{
		long __address = ((mat == null) ? 0 : mat.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 752, __address);
		} else {
			__io__block.writeLong(__io__address + 664, __address);
		}
	}

	/**
	 * Get method for struct member 'totcol'.
	 * @see #__DNA__FIELD__totcol
	 */
	
	public short getTotcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 760);
		} else {
			return __io__block.readShort(__io__address + 668);
		}
	}

	/**
	 * Set method for struct member 'totcol'.
	 * @see #__DNA__FIELD__totcol
	 */
	
	public void setTotcol(short totcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 760, totcol);
		} else {
			__io__block.writeShort(__io__address + 668, totcol);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Short> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 762, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 670, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Short> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 762;
		} else {
			__dna__offset = 670;
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
	 * Get method for struct member 'surface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used as base mesh when curves represent e.g. hair or fur. This surface is used in edit modes. When set, the curves will have attributes that indicate a position on this surface. This is used for deforming the curves when the surface is deformed dynamically.</p><p> This is expected to be a mesh object. </p>
	 * @see #__DNA__FIELD__surface
	 */
	
	public CPointer<BlenderObject> getSurface() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 768);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 676);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'surface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Used as base mesh when curves represent e.g. hair or fur. This surface is used in edit modes. When set, the curves will have attributes that indicate a position on this surface. This is used for deforming the curves when the surface is deformed dynamically.</p><p> This is expected to be a mesh object. </p>
	 * @see #__DNA__FIELD__surface
	 */
	
	public void setSurface(CPointer<BlenderObject> surface) throws IOException
	{
		long __address = ((surface == null) ? 0 : surface.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 768, __address);
		} else {
			__io__block.writeLong(__io__address + 676, __address);
		}
	}

	/**
	 * Get method for struct member 'batch_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Draw Cache. </p>
	 * @see #__DNA__FIELD__batch_cache
	 */
	
	public CPointer<Object> getBatch_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 776);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 680);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'batch_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Draw Cache. </p>
	 * @see #__DNA__FIELD__batch_cache
	 */
	
	public void setBatch_cache(CPointer<Object> batch_cache) throws IOException
	{
		long __address = ((batch_cache == null) ? 0 : batch_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 776, __address);
		} else {
			__io__block.writeLong(__io__address + 680, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Curves> __io__addressof() {
		return new CPointer<Curves>(__io__address, new Class[]{Curves.class}, __io__block, __io__blockTable);
	}

}
