package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CurveMap'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=60, size64=72)
public class CurveMap extends CFacade {

	/**
	 * This is the sdna index of the struct CurveMap.
	 * <p>
	 * It is required when allocating a new block to store data for CurveMap.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 430;

	/**
	 * Field descriptor (offset) for struct member 'totpoint'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMap curvemap = ...;
	 * CPointer&lt;Object&gt; p = curvemap.__dna__addressof(CurveMap.__DNA__FIELD__totpoint);
	 * CPointer&lt;Short&gt; p_totpoint = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpoint'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpoint = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMap curvemap = ...;
	 * CPointer&lt;Object&gt; p = curvemap.__dna__addressof(CurveMap.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'range'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Quick multiply value for reading table. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMap curvemap = ...;
	 * CPointer&lt;Object&gt; p = curvemap.__dna__addressof(CurveMap.__DNA__FIELD__range);
	 * CPointer&lt;Float&gt; p_range = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'range'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__range = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'mintable'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The x-axis range for the table. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMap curvemap = ...;
	 * CPointer&lt;Object&gt; p = curvemap.__dna__addressof(CurveMap.__DNA__FIELD__mintable);
	 * CPointer&lt;Float&gt; p_mintable = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mintable'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mintable = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'maxtable'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMap curvemap = ...;
	 * CPointer&lt;Object&gt; p = curvemap.__dna__addressof(CurveMap.__DNA__FIELD__maxtable);
	 * CPointer&lt;Float&gt; p_maxtable = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxtable'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxtable = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'ext_in'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For extrapolated curves, the direction vector. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMap curvemap = ...;
	 * CPointer&lt;Object&gt; p = curvemap.__dna__addressof(CurveMap.__DNA__FIELD__ext_in);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_ext_in = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ext_in'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ext_in = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'ext_out'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMap curvemap = ...;
	 * CPointer&lt;Object&gt; p = curvemap.__dna__addressof(CurveMap.__DNA__FIELD__ext_out);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_ext_out = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ext_out'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ext_out = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Actual curve. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMap curvemap = ...;
	 * CPointer&lt;Object&gt; p = curvemap.__dna__addressof(CurveMap.__DNA__FIELD__curve);
	 * CPointer&lt;CPointer&lt;CurveMapPoint&gt;&gt; p_curve = p.cast(new Class[]{CPointer.class, CurveMapPoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve'</li>
	 * <li>Signature: 'CurveMapPoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'table'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display and evaluate table. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMap curvemap = ...;
	 * CPointer&lt;Object&gt; p = curvemap.__dna__addressof(CurveMap.__DNA__FIELD__table);
	 * CPointer&lt;CPointer&lt;CurveMapPoint&gt;&gt; p_table = p.cast(new Class[]{CPointer.class, CurveMapPoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'table'</li>
	 * <li>Signature: 'CurveMapPoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__table = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'premultable'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For RGB curves, premulled table. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMap curvemap = ...;
	 * CPointer&lt;Object&gt; p = curvemap.__dna__addressof(CurveMap.__DNA__FIELD__premultable);
	 * CPointer&lt;CPointer&lt;CurveMapPoint&gt;&gt; p_premultable = p.cast(new Class[]{CPointer.class, CurveMapPoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'premultable'</li>
	 * <li>Signature: 'CurveMapPoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__premultable = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'premul_ext_in'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For RGB curves, premulled extrapolation vector. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMap curvemap = ...;
	 * CPointer&lt;Object&gt; p = curvemap.__dna__addressof(CurveMap.__DNA__FIELD__premul_ext_in);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_premul_ext_in = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'premul_ext_in'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__premul_ext_in = new long[]{44, 56};

	/**
	 * Field descriptor (offset) for struct member 'premul_ext_out'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMap curvemap = ...;
	 * CPointer&lt;Object&gt; p = curvemap.__dna__addressof(CurveMap.__DNA__FIELD__premul_ext_out);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_premul_ext_out = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'premul_ext_out'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__premul_ext_out = new long[]{52, 64};

	public CurveMap(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CurveMap(CurveMap that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'totpoint'.
	 * @see #__DNA__FIELD__totpoint
	 */
	
	public short getTotpoint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'totpoint'.
	 * @see #__DNA__FIELD__totpoint
	 */
	
	public void setTotpoint(short totpoint) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, totpoint);
		} else {
			__io__block.writeShort(__io__address + 0, totpoint);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, flag);
		} else {
			__io__block.writeShort(__io__address + 2, flag);
		}
	}

	/**
	 * Get method for struct member 'range'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Quick multiply value for reading table. </p>
	 * @see #__DNA__FIELD__range
	 */
	
	public float getRange() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'range'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Quick multiply value for reading table. </p>
	 * @see #__DNA__FIELD__range
	 */
	
	public void setRange(float range) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, range);
		} else {
			__io__block.writeFloat(__io__address + 4, range);
		}
	}

	/**
	 * Get method for struct member 'mintable'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The x-axis range for the table. </p>
	 * @see #__DNA__FIELD__mintable
	 */
	
	public float getMintable() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'mintable'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The x-axis range for the table. </p>
	 * @see #__DNA__FIELD__mintable
	 */
	
	public void setMintable(float mintable) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, mintable);
		} else {
			__io__block.writeFloat(__io__address + 8, mintable);
		}
	}

	/**
	 * Get method for struct member 'maxtable'.
	 * @see #__DNA__FIELD__maxtable
	 */
	
	public float getMaxtable() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'maxtable'.
	 * @see #__DNA__FIELD__maxtable
	 */
	
	public void setMaxtable(float maxtable) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, maxtable);
		} else {
			__io__block.writeFloat(__io__address + 12, maxtable);
		}
	}

	/**
	 * Get method for struct member 'ext_in'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For extrapolated curves, the direction vector. </p>
	 * @see #__DNA__FIELD__ext_in
	 */
	
	public CArrayFacade<Float> getExt_in() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ext_in'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For extrapolated curves, the direction vector. </p>
	 * @see #__DNA__FIELD__ext_in
	 */
	
	public void setExt_in(CArrayFacade<Float> ext_in) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(ext_in, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ext_in)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ext_in);
		} else {
			__io__generic__copy( getExt_in(), ext_in);
		}
	}

	/**
	 * Get method for struct member 'ext_out'.
	 * @see #__DNA__FIELD__ext_out
	 */
	
	public CArrayFacade<Float> getExt_out() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ext_out'.
	 * @see #__DNA__FIELD__ext_out
	 */
	
	public void setExt_out(CArrayFacade<Float> ext_out) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(ext_out, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ext_out)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ext_out);
		} else {
			__io__generic__copy( getExt_out(), ext_out);
		}
	}

	/**
	 * Get method for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Actual curve. </p>
	 * @see #__DNA__FIELD__curve
	 */
	
	public CPointer<CurveMapPoint> getCurve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapPoint.class};
		return new CPointer<CurveMapPoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapPoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Actual curve. </p>
	 * @see #__DNA__FIELD__curve
	 */
	
	public void setCurve(CPointer<CurveMapPoint> curve) throws IOException
	{
		long __address = ((curve == null) ? 0 : curve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 32, __address);
		}
	}

	/**
	 * Get method for struct member 'table'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display and evaluate table. </p>
	 * @see #__DNA__FIELD__table
	 */
	
	public CPointer<CurveMapPoint> getTable() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 36);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapPoint.class};
		return new CPointer<CurveMapPoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapPoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'table'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Display and evaluate table. </p>
	 * @see #__DNA__FIELD__table
	 */
	
	public void setTable(CPointer<CurveMapPoint> table) throws IOException
	{
		long __address = ((table == null) ? 0 : table.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 36, __address);
		}
	}

	/**
	 * Get method for struct member 'premultable'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For RGB curves, premulled table. </p>
	 * @see #__DNA__FIELD__premultable
	 */
	
	public CPointer<CurveMapPoint> getPremultable() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapPoint.class};
		return new CPointer<CurveMapPoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapPoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'premultable'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For RGB curves, premulled table. </p>
	 * @see #__DNA__FIELD__premultable
	 */
	
	public void setPremultable(CPointer<CurveMapPoint> premultable) throws IOException
	{
		long __address = ((premultable == null) ? 0 : premultable.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 40, __address);
		}
	}

	/**
	 * Get method for struct member 'premul_ext_in'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For RGB curves, premulled extrapolation vector. </p>
	 * @see #__DNA__FIELD__premul_ext_in
	 */
	
	public CArrayFacade<Float> getPremul_ext_in() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'premul_ext_in'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For RGB curves, premulled extrapolation vector. </p>
	 * @see #__DNA__FIELD__premul_ext_in
	 */
	
	public void setPremul_ext_in(CArrayFacade<Float> premul_ext_in) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 44;
		}
		if (__io__equals(premul_ext_in, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, premul_ext_in)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, premul_ext_in);
		} else {
			__io__generic__copy( getPremul_ext_in(), premul_ext_in);
		}
	}

	/**
	 * Get method for struct member 'premul_ext_out'.
	 * @see #__DNA__FIELD__premul_ext_out
	 */
	
	public CArrayFacade<Float> getPremul_ext_out() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 52, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'premul_ext_out'.
	 * @see #__DNA__FIELD__premul_ext_out
	 */
	
	public void setPremul_ext_out(CArrayFacade<Float> premul_ext_out) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 52;
		}
		if (__io__equals(premul_ext_out, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, premul_ext_out)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, premul_ext_out);
		} else {
			__io__generic__copy( getPremul_ext_out(), premul_ext_out);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CurveMap> __io__addressof() {
		return new CPointer<CurveMap>(__io__address, new Class[]{CurveMap.class}, __io__block, __io__blockTable);
	}

}
