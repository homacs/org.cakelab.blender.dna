package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CurvesGeometry'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> A reusable data structure for geometry consisting of many curves. All control point data is stored contiguously for better efficiency. Data for each curve is stored as a slice of the main {@link #getPoint_data()}  array.</p><p> The data structure is meant to be embedded in other data-blocks to allow reusing curve-processing algorithms for multiple Blender data-block types. </p>
 */

@CMetaData(size32=488, size64=520)
public class CurvesGeometry extends CFacade {

	/**
	 * This is the sdna index of the struct CurvesGeometry.
	 * <p>
	 * It is required when allocating a new block to store data for CurvesGeometry.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 139;

	/**
	 * Field descriptor (offset) for struct member 'curve_offsets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The start index of each curve in the point data. The size of each curve can be calculated by subtracting the offset from the next offset. That is valid even for the last curve because this array is allocated with a length one larger than the number of curves. This is allowed to be null when there are no curves.</p><p> Every curve offset must be at least one larger than the previous. In other words, every curve must have at least one point.</p><p><h2>Note</h2><p><em></em>  stored in {@link CustomData}  because its size is one larger than {@link #getCurve_data()} . </p> This is not stored in CustomData because its size is one larger than curve_data. 
	 * 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvesGeometry curvesgeometry = ...;
	 * CPointer&lt;Object&gt; p = curvesgeometry.__dna__addressof(CurvesGeometry.__DNA__FIELD__curve_offsets);
	 * CPointer&lt;CPointer&lt;Integer&gt;&gt; p_curve_offsets = p.cast(new Class[]{CPointer.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_offsets'</li>
	 * <li>Signature: 'int*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_offsets = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'point_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> All attributes stored on control points (#ATTR_DOMAIN_POINT). This might not contain a layer for positions if there are no points. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvesGeometry curvesgeometry = ...;
	 * CPointer&lt;Object&gt; p = curvesgeometry.__dna__addressof(CurvesGeometry.__DNA__FIELD__point_data);
	 * CPointer&lt;CustomData&gt; p_point_data = p.cast(new Class[]{CustomData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'point_data'</li>
	 * <li>Signature: 'CustomData'</li>
	 * <li>Actual Size (32bit/64bit): 236/248</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__point_data = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'curve_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> All attributes stored on curves (#ATTR_DOMAIN_CURVE). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvesGeometry curvesgeometry = ...;
	 * CPointer&lt;Object&gt; p = curvesgeometry.__dna__addressof(CurvesGeometry.__DNA__FIELD__curve_data);
	 * CPointer&lt;CustomData&gt; p_curve_data = p.cast(new Class[]{CustomData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_data'</li>
	 * <li>Signature: 'CustomData'</li>
	 * <li>Actual Size (32bit/64bit): 236/248</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_data = new long[]{240, 256};

	/**
	 * Field descriptor (offset) for struct member 'point_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvesGeometry curvesgeometry = ...;
	 * CPointer&lt;Object&gt; p = curvesgeometry.__dna__addressof(CurvesGeometry.__DNA__FIELD__point_size);
	 * CPointer&lt;Integer&gt; p_point_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'point_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__point_size = new long[]{476, 504};

	/**
	 * Field descriptor (offset) for struct member 'curve_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvesGeometry curvesgeometry = ...;
	 * CPointer&lt;Object&gt; p = curvesgeometry.__dna__addressof(CurvesGeometry.__DNA__FIELD__curve_size);
	 * CPointer&lt;Integer&gt; p_curve_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_size = new long[]{480, 508};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime data for curves, stored as a pointer to allow defining this as a C++ class. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurvesGeometry curvesgeometry = ...;
	 * CPointer&lt;Object&gt; p = curvesgeometry.__dna__addressof(CurvesGeometry.__DNA__FIELD__runtime);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_runtime = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'CurvesGeometryRuntimeHandle*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{484, 512};

	public CurvesGeometry(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CurvesGeometry(CurvesGeometry that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'curve_offsets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The start index of each curve in the point data. The size of each curve can be calculated by subtracting the offset from the next offset. That is valid even for the last curve because this array is allocated with a length one larger than the number of curves. This is allowed to be null when there are no curves.</p><p> Every curve offset must be at least one larger than the previous. In other words, every curve must have at least one point.</p><p><h2>Note</h2><p><em></em>  stored in {@link CustomData}  because its size is one larger than {@link #getCurve_data()} . </p> This is not stored in CustomData because its size is one larger than curve_data. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__curve_offsets
	 */
	
	public CPointer<Integer> getCurve_offsets() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		return new CPointer<Integer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curve_offsets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> The start index of each curve in the point data. The size of each curve can be calculated by subtracting the offset from the next offset. That is valid even for the last curve because this array is allocated with a length one larger than the number of curves. This is allowed to be null when there are no curves.</p><p> Every curve offset must be at least one larger than the previous. In other words, every curve must have at least one point.</p><p><h2>Note</h2><p><em></em>  stored in {@link CustomData}  because its size is one larger than {@link #getCurve_data()} . </p> This is not stored in CustomData because its size is one larger than curve_data. 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__curve_offsets
	 */
	
	public void setCurve_offsets(CPointer<Integer> curve_offsets) throws IOException
	{
		long __address = ((curve_offsets == null) ? 0 : curve_offsets.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'point_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> All attributes stored on control points (#ATTR_DOMAIN_POINT). This might not contain a layer for positions if there are no points. </p>
	 * @see #__DNA__FIELD__point_data
	 */
	
	public CustomData getPoint_data() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData(__io__address + 8, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 4, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'point_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> All attributes stored on control points (#ATTR_DOMAIN_POINT). This might not contain a layer for positions if there are no points. </p>
	 * @see #__DNA__FIELD__point_data
	 */
	
	public void setPoint_data(CustomData point_data) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(point_data, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, point_data)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, point_data);
		} else {
			__io__generic__copy( getPoint_data(), point_data);
		}
	}

	/**
	 * Get method for struct member 'curve_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> All attributes stored on curves (#ATTR_DOMAIN_CURVE). </p>
	 * @see #__DNA__FIELD__curve_data
	 */
	
	public CustomData getCurve_data() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new CustomData(__io__address + 256, __io__block, __io__blockTable);
		} else {
			return new CustomData(__io__address + 240, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'curve_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> All attributes stored on curves (#ATTR_DOMAIN_CURVE). </p>
	 * @see #__DNA__FIELD__curve_data
	 */
	
	public void setCurve_data(CustomData curve_data) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 256;
		} else {
			__dna__offset = 240;
		}
		if (__io__equals(curve_data, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, curve_data)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, curve_data);
		} else {
			__io__generic__copy( getCurve_data(), curve_data);
		}
	}

	/**
	 * Get method for struct member 'point_size'.
	 * @see #__DNA__FIELD__point_size
	 */
	
	public int getPoint_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 504);
		} else {
			return __io__block.readInt(__io__address + 476);
		}
	}

	/**
	 * Set method for struct member 'point_size'.
	 * @see #__DNA__FIELD__point_size
	 */
	
	public void setPoint_size(int point_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 504, point_size);
		} else {
			__io__block.writeInt(__io__address + 476, point_size);
		}
	}

	/**
	 * Get method for struct member 'curve_size'.
	 * @see #__DNA__FIELD__curve_size
	 */
	
	public int getCurve_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 508);
		} else {
			return __io__block.readInt(__io__address + 480);
		}
	}

	/**
	 * Set method for struct member 'curve_size'.
	 * @see #__DNA__FIELD__curve_size
	 */
	
	public void setCurve_size(int curve_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 508, curve_size);
		} else {
			__io__block.writeInt(__io__address + 480, curve_size);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime data for curves, stored as a pointer to allow defining this as a C++ class. </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public CPointer<Object> getRuntime() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 512);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 484);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Runtime data for curves, stored as a pointer to allow defining this as a C++ class. </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(CPointer<Object> runtime) throws IOException
	{
		long __address = ((runtime == null) ? 0 : runtime.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 512, __address);
		} else {
			__io__block.writeLong(__io__address + 484, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CurvesGeometry> __io__addressof() {
		return new CPointer<CurvesGeometry>(__io__address, new Class[]{CurvesGeometry.class}, __io__block, __io__blockTable);
	}

}
