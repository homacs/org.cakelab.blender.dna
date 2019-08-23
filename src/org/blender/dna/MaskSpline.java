package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MaskSpline'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=204, size64=224)
public class MaskSpline extends CFacade {

	/**
	 * This is the sdna index of the struct MaskSpline.
	 * <p>
	 * It is required when allocating a new block to store data for MaskSpline.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 565;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSpline maskspline = ...;
	 * CPointer&lt;Object&gt; p = maskspline.__dna__addressof(MaskSpline.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;MaskSpline&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, MaskSpline.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'MaskSpline*'</li>
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
	 * MaskSpline maskspline = ...;
	 * CPointer&lt;Object&gt; p = maskspline.__dna__addressof(MaskSpline.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;MaskSpline&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, MaskSpline.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'MaskSpline*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> defferent spline flag (closed, ...) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSpline maskspline = ...;
	 * CPointer&lt;Object&gt; p = maskspline.__dna__addressof(MaskSpline.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'offset_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The method used for calculating the feather offset<h4>Blender Source Code:</h4>
	 * <p> feather offset method </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSpline maskspline = ...;
	 * CPointer&lt;Object&gt; p = maskspline.__dna__addressof(MaskSpline.__DNA__FIELD__offset_mode);
	 * CPointer&lt;Byte&gt; p_offset_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset_mode = new long[]{10, 18};

	/**
	 * Field descriptor (offset) for struct member 'weight_interp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> weight interpolation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSpline maskspline = ...;
	 * CPointer&lt;Object&gt; p = maskspline.__dna__addressof(MaskSpline.__DNA__FIELD__weight_interp);
	 * CPointer&lt;Byte&gt; p_weight_interp = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'weight_interp'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__weight_interp = new long[]{11, 19};

	/**
	 * Field descriptor (offset) for struct member 'tot_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number of points </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSpline maskspline = ...;
	 * CPointer&lt;Object&gt; p = maskspline.__dna__addressof(MaskSpline.__DNA__FIELD__tot_point);
	 * CPointer&lt;Integer&gt; p_tot_point = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_point'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_point = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of points<h4>Blender Source Code:</h4>
	 * <p> points which defines spline itself </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSpline maskspline = ...;
	 * CPointer&lt;Object&gt; p = maskspline.__dna__addressof(MaskSpline.__DNA__FIELD__points);
	 * CPointer&lt;CPointer&lt;MaskSplinePoint&gt;&gt; p_points = p.cast(new Class[]{CPointer.class, MaskSplinePoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'points'</li>
	 * <li>Signature: 'MaskSplinePoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__points = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> parenting information of the whole spline </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSpline maskspline = ...;
	 * CPointer&lt;Object&gt; p = maskspline.__dna__addressof(MaskSpline.__DNA__FIELD__parent);
	 * CPointer&lt;MaskParent&gt; p_parent = p.cast(new Class[]{MaskParent.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent'</li>
	 * <li>Signature: 'MaskParent'</li>
	 * <li>Actual Size (32bit/64bit): 180/184</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent = new long[]{20, 32};

	/**
	 * Field descriptor (offset) for struct member 'points_deform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> deformed copy of 'points' {@link BezTriple}  data - not saved </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSpline maskspline = ...;
	 * CPointer&lt;Object&gt; p = maskspline.__dna__addressof(MaskSpline.__DNA__FIELD__points_deform);
	 * CPointer&lt;CPointer&lt;MaskSplinePoint&gt;&gt; p_points_deform = p.cast(new Class[]{CPointer.class, MaskSplinePoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'points_deform'</li>
	 * <li>Signature: 'MaskSplinePoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__points_deform = new long[]{200, 216};

	public MaskSpline(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MaskSpline(MaskSpline that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<MaskSpline> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MaskSpline.class};
		return new CPointer<MaskSpline>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MaskSpline.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<MaskSpline> next) throws IOException
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
	
	public CPointer<MaskSpline> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MaskSpline.class};
		return new CPointer<MaskSpline>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MaskSpline.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<MaskSpline> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> defferent spline flag (closed, ...) </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> defferent spline flag (closed, ...) </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, flag);
		} else {
			__io__block.writeShort(__io__address + 8, flag);
		}
	}

	/**
	 * Get method for struct member 'offset_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The method used for calculating the feather offset<h4>Blender Source Code:</h4>
	 * <p> feather offset method </p>
	 * @see #__DNA__FIELD__offset_mode
	 */
	
	public byte getOffset_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 18);
		} else {
			return __io__block.readByte(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'offset_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The method used for calculating the feather offset<h4>Blender Source Code:</h4>
	 * <p> feather offset method </p>
	 * @see #__DNA__FIELD__offset_mode
	 */
	
	public void setOffset_mode(byte offset_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 18, offset_mode);
		} else {
			__io__block.writeByte(__io__address + 10, offset_mode);
		}
	}

	/**
	 * Get method for struct member 'weight_interp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> weight interpolation </p>
	 * @see #__DNA__FIELD__weight_interp
	 */
	
	public byte getWeight_interp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 19);
		} else {
			return __io__block.readByte(__io__address + 11);
		}
	}

	/**
	 * Set method for struct member 'weight_interp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> weight interpolation </p>
	 * @see #__DNA__FIELD__weight_interp
	 */
	
	public void setWeight_interp(byte weight_interp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 19, weight_interp);
		} else {
			__io__block.writeByte(__io__address + 11, weight_interp);
		}
	}

	/**
	 * Get method for struct member 'tot_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number of points </p>
	 * @see #__DNA__FIELD__tot_point
	 */
	
	public int getTot_point() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'tot_point'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number of points </p>
	 * @see #__DNA__FIELD__tot_point
	 */
	
	public void setTot_point(int tot_point) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, tot_point);
		} else {
			__io__block.writeInt(__io__address + 12, tot_point);
		}
	}

	/**
	 * Get method for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of points<h4>Blender Source Code:</h4>
	 * <p> points which defines spline itself </p>
	 * @see #__DNA__FIELD__points
	 */
	
	public CPointer<MaskSplinePoint> getPoints() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MaskSplinePoint.class};
		return new CPointer<MaskSplinePoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MaskSplinePoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of points<h4>Blender Source Code:</h4>
	 * <p> points which defines spline itself </p>
	 * @see #__DNA__FIELD__points
	 */
	
	public void setPoints(CPointer<MaskSplinePoint> points) throws IOException
	{
		long __address = ((points == null) ? 0 : points.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> parenting information of the whole spline </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public MaskParent getParent() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MaskParent(__io__address + 32, __io__block, __io__blockTable);
		} else {
			return new MaskParent(__io__address + 20, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> parenting information of the whole spline </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public void setParent(MaskParent parent) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(parent, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, parent)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, parent);
		} else {
			__io__generic__copy( getParent(), parent);
		}
	}

	/**
	 * Get method for struct member 'points_deform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> deformed copy of 'points' {@link BezTriple}  data - not saved </p>
	 * @see #__DNA__FIELD__points_deform
	 */
	
	public CPointer<MaskSplinePoint> getPoints_deform() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MaskSplinePoint.class};
		return new CPointer<MaskSplinePoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MaskSplinePoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'points_deform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> deformed copy of 'points' {@link BezTriple}  data - not saved </p>
	 * @see #__DNA__FIELD__points_deform
	 */
	
	public void setPoints_deform(CPointer<MaskSplinePoint> points_deform) throws IOException
	{
		long __address = ((points_deform == null) ? 0 : points_deform.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 200, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MaskSpline> __io__addressof() {
		return new CPointer<MaskSpline>(__io__address, new Class[]{MaskSpline.class}, __io__block, __io__blockTable);
	}

}
