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

@CMetaData(size32=676, size64=768)
public class Curves extends CFacade {

	/**
	 * This is the sdna index of the struct Curves.
	 * <p>
	 * It is required when allocating a new block to store data for Curves.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 140;

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
	 * <li>Actual Size (32bit/64bit): 488/520</li>
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
	public static final long[] __DNA__FIELD__flag = new long[]{644, 720};

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
	public static final long[] __DNA__FIELD__attributes_active_index = new long[]{648, 724};

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
	public static final long[] __DNA__FIELD__mat = new long[]{652, 728};

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
	public static final long[] __DNA__FIELD__totcol = new long[]{656, 736};

	/**
	 * Field descriptor (offset) for struct member 'symmetry'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> User-defined symmetry flag (eCurvesSymmetryType ) that causes editing operations to maintain symmetrical geometry. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curves curves = ...;
	 * CPointer&lt;Object&gt; p = curves.__dna__addressof(Curves.__DNA__FIELD__symmetry);
	 * CPointer&lt;Byte&gt; p_symmetry = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'symmetry'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__symmetry = new long[]{658, 738};

	/**
	 * Field descriptor (offset) for struct member 'selection_domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #eAttrDomain. The active selection mode domain. At most one selection mode can be active at a time. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curves curves = ...;
	 * CPointer&lt;Object&gt; p = curves.__dna__addressof(Curves.__DNA__FIELD__selection_domain);
	 * CPointer&lt;Byte&gt; p_selection_domain = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'selection_domain'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__selection_domain = new long[]{659, 739};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curves curves = ...;
	 * CPointer&lt;Object&gt; p = curves.__dna__addressof(Curves.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{660, 740};

	/**
	 * Field descriptor (offset) for struct member 'surface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Mesh object that the curves can be attached to
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
	public static final long[] __DNA__FIELD__surface = new long[]{664, 744};

	/**
	 * Field descriptor (offset) for struct member 'surface_uv_map'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The name of the attribute on the surface mesh used to define the attachment of each curve
	 * <h4>Blender Source Code</h4>
	 * <p> The name of the attribute on the surface {@link Mesh}  used to give meaning to the UV attachment coordinates stored on each curve. Expected to be a 2D vector attribute on the face corner domain. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Curves curves = ...;
	 * CPointer&lt;Object&gt; p = curves.__dna__addressof(Curves.__DNA__FIELD__surface_uv_map);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_surface_uv_map = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'surface_uv_map'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__surface_uv_map = new long[]{668, 752};

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
	public static final long[] __DNA__FIELD__batch_cache = new long[]{672, 760};

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
			return __io__block.readInt(__io__address + 720);
		} else {
			return __io__block.readInt(__io__address + 644);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 720, flag);
		} else {
			__io__block.writeInt(__io__address + 644, flag);
		}
	}

	/**
	 * Get method for struct member 'attributes_active_index'.
	 * @see #__DNA__FIELD__attributes_active_index
	 */
	
	public int getAttributes_active_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 724);
		} else {
			return __io__block.readInt(__io__address + 648);
		}
	}

	/**
	 * Set method for struct member 'attributes_active_index'.
	 * @see #__DNA__FIELD__attributes_active_index
	 */
	
	public void setAttributes_active_index(int attributes_active_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 724, attributes_active_index);
		} else {
			__io__block.writeInt(__io__address + 648, attributes_active_index);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 728);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 652);
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
			__io__block.writeLong(__io__address + 728, __address);
		} else {
			__io__block.writeLong(__io__address + 652, __address);
		}
	}

	/**
	 * Get method for struct member 'totcol'.
	 * @see #__DNA__FIELD__totcol
	 */
	
	public short getTotcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 736);
		} else {
			return __io__block.readShort(__io__address + 656);
		}
	}

	/**
	 * Set method for struct member 'totcol'.
	 * @see #__DNA__FIELD__totcol
	 */
	
	public void setTotcol(short totcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 736, totcol);
		} else {
			__io__block.writeShort(__io__address + 656, totcol);
		}
	}

	/**
	 * Get method for struct member 'symmetry'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> User-defined symmetry flag (eCurvesSymmetryType ) that causes editing operations to maintain symmetrical geometry. </p>
	 * @see #__DNA__FIELD__symmetry
	 */
	
	public byte getSymmetry() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 738);
		} else {
			return __io__block.readByte(__io__address + 658);
		}
	}

	/**
	 * Set method for struct member 'symmetry'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> User-defined symmetry flag (eCurvesSymmetryType ) that causes editing operations to maintain symmetrical geometry. </p>
	 * @see #__DNA__FIELD__symmetry
	 */
	
	public void setSymmetry(byte symmetry) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 738, symmetry);
		} else {
			__io__block.writeByte(__io__address + 658, symmetry);
		}
	}

	/**
	 * Get method for struct member 'selection_domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #eAttrDomain. The active selection mode domain. At most one selection mode can be active at a time. </p>
	 * @see #__DNA__FIELD__selection_domain
	 */
	
	public byte getSelection_domain() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 739);
		} else {
			return __io__block.readByte(__io__address + 659);
		}
	}

	/**
	 * Set method for struct member 'selection_domain'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> #eAttrDomain. The active selection mode domain. At most one selection mode can be active at a time. </p>
	 * @see #__DNA__FIELD__selection_domain
	 */
	
	public void setSelection_domain(byte selection_domain) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 739, selection_domain);
		} else {
			__io__block.writeByte(__io__address + 659, selection_domain);
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
			return new CArrayFacade<Byte>(__io__address + 740, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 660, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 740;
		} else {
			__dna__offset = 660;
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
	 * Get method for struct member 'surface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Mesh object that the curves can be attached to
	 * <h4>Blender Source Code</h4>
	 * <p> Used as base mesh when curves represent e.g. hair or fur. This surface is used in edit modes. When set, the curves will have attributes that indicate a position on this surface. This is used for deforming the curves when the surface is deformed dynamically.</p><p> This is expected to be a mesh object. </p>
	 * @see #__DNA__FIELD__surface
	 */
	
	public CPointer<BlenderObject> getSurface() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 744);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 664);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'surface'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Mesh object that the curves can be attached to
	 * <h4>Blender Source Code</h4>
	 * <p> Used as base mesh when curves represent e.g. hair or fur. This surface is used in edit modes. When set, the curves will have attributes that indicate a position on this surface. This is used for deforming the curves when the surface is deformed dynamically.</p><p> This is expected to be a mesh object. </p>
	 * @see #__DNA__FIELD__surface
	 */
	
	public void setSurface(CPointer<BlenderObject> surface) throws IOException
	{
		long __address = ((surface == null) ? 0 : surface.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 744, __address);
		} else {
			__io__block.writeLong(__io__address + 664, __address);
		}
	}

	/**
	 * Get method for struct member 'surface_uv_map'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The name of the attribute on the surface mesh used to define the attachment of each curve
	 * <h4>Blender Source Code</h4>
	 * <p> The name of the attribute on the surface {@link Mesh}  used to give meaning to the UV attachment coordinates stored on each curve. Expected to be a 2D vector attribute on the face corner domain. </p>
	 * @see #__DNA__FIELD__surface_uv_map
	 */
	
	public CPointer<Byte> getSurface_uv_map() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 752);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 668);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'surface_uv_map'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The name of the attribute on the surface mesh used to define the attachment of each curve
	 * <h4>Blender Source Code</h4>
	 * <p> The name of the attribute on the surface {@link Mesh}  used to give meaning to the UV attachment coordinates stored on each curve. Expected to be a 2D vector attribute on the face corner domain. </p>
	 * @see #__DNA__FIELD__surface_uv_map
	 */
	
	public void setSurface_uv_map(CPointer<Byte> surface_uv_map) throws IOException
	{
		long __address = ((surface_uv_map == null) ? 0 : surface_uv_map.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 752, __address);
		} else {
			__io__block.writeLong(__io__address + 668, __address);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 760);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 672);
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
			__io__block.writeLong(__io__address + 760, __address);
		} else {
			__io__block.writeLong(__io__address + 672, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Curves> __io__addressof() {
		return new CPointer<Curves>(__io__address, new Class[]{Curves.class}, __io__block, __io__blockTable);
	}

}
