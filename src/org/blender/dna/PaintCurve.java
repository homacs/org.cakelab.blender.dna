package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'PaintCurve'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=132, size64=168)
public class PaintCurve extends CFacade {

	/**
	 * This is the sdna index of the struct PaintCurve.
	 * <p>
	 * It is required when allocating a new block to store data for PaintCurve.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 443;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PaintCurve paintcurve = ...;
	 * CPointer&lt;Object&gt; p = paintcurve.__dna__addressof(PaintCurve.__DNA__FIELD__id);
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
	 * Field descriptor (offset) for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Points of curve. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PaintCurve paintcurve = ...;
	 * CPointer&lt;Object&gt; p = paintcurve.__dna__addressof(PaintCurve.__DNA__FIELD__points);
	 * CPointer&lt;CPointer&lt;PaintCurvePoint&gt;&gt; p_points = p.cast(new Class[]{CPointer.class, PaintCurvePoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'points'</li>
	 * <li>Signature: 'PaintCurvePoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__points = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'tot_points'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PaintCurve paintcurve = ...;
	 * CPointer&lt;Object&gt; p = paintcurve.__dna__addressof(PaintCurve.__DNA__FIELD__tot_points);
	 * CPointer&lt;Integer&gt; p_tot_points = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_points'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_points = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'add_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index where next point will be added. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * PaintCurve paintcurve = ...;
	 * CPointer&lt;Object&gt; p = paintcurve.__dna__addressof(PaintCurve.__DNA__FIELD__add_index);
	 * CPointer&lt;Integer&gt; p_add_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'add_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__add_index = new long[]{128, 164};

	public PaintCurve(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected PaintCurve(PaintCurve that) {
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
	 * Get method for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Points of curve. </p>
	 * @see #__DNA__FIELD__points
	 */
	
	public CPointer<PaintCurvePoint> getPoints() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PaintCurvePoint.class};
		return new CPointer<PaintCurvePoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PaintCurvePoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Points of curve. </p>
	 * @see #__DNA__FIELD__points
	 */
	
	public void setPoints(CPointer<PaintCurvePoint> points) throws IOException
	{
		long __address = ((points == null) ? 0 : points.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'tot_points'.
	 * @see #__DNA__FIELD__tot_points
	 */
	
	public int getTot_points() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 160);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'tot_points'.
	 * @see #__DNA__FIELD__tot_points
	 */
	
	public void setTot_points(int tot_points) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 160, tot_points);
		} else {
			__io__block.writeInt(__io__address + 124, tot_points);
		}
	}

	/**
	 * Get method for struct member 'add_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index where next point will be added. </p>
	 * @see #__DNA__FIELD__add_index
	 */
	
	public int getAdd_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 164);
		} else {
			return __io__block.readInt(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'add_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index where next point will be added. </p>
	 * @see #__DNA__FIELD__add_index
	 */
	
	public void setAdd_index(int add_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 164, add_index);
		} else {
			__io__block.writeInt(__io__address + 128, add_index);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<PaintCurve> __io__addressof() {
		return new CPointer<PaintCurve>(__io__address, new Class[]{PaintCurve.class}, __io__block, __io__blockTable);
	}

}
