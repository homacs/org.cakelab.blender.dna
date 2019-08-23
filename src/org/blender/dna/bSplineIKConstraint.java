package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bSplineIKConstraint'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=16, size64=24)
public class bSplineIKConstraint extends CFacade {

	/**
	 * This is the sdna index of the struct bSplineIKConstraint.
	 * <p>
	 * It is required when allocating a new block to store data for bSplineIKConstraint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 318;

	/**
	 * Field descriptor (offset) for struct member 'tar'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSplineIKConstraint bsplineikconstraint = ...;
	 * CPointer&lt;Object&gt; p = bsplineikconstraint.__dna__addressof(bSplineIKConstraint.__DNA__FIELD__tar);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_tar = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tar'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tar = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'points'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSplineIKConstraint bsplineikconstraint = ...;
	 * CPointer&lt;Object&gt; p = bsplineikconstraint.__dna__addressof(bSplineIKConstraint.__DNA__FIELD__points);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_points = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'points'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__points = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'numpoints'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSplineIKConstraint bsplineikconstraint = ...;
	 * CPointer&lt;Object&gt; p = bsplineikconstraint.__dna__addressof(bSplineIKConstraint.__DNA__FIELD__numpoints);
	 * CPointer&lt;Short&gt; p_numpoints = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'numpoints'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__numpoints = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'chainlen'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSplineIKConstraint bsplineikconstraint = ...;
	 * CPointer&lt;Object&gt; p = bsplineikconstraint.__dna__addressof(bSplineIKConstraint.__DNA__FIELD__chainlen);
	 * CPointer&lt;Short&gt; p_chainlen = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'chainlen'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__chainlen = new long[]{10, 18};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSplineIKConstraint bsplineikconstraint = ...;
	 * CPointer&lt;Object&gt; p = bsplineikconstraint.__dna__addressof(bSplineIKConstraint.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'xzScaleMode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSplineIKConstraint bsplineikconstraint = ...;
	 * CPointer&lt;Object&gt; p = bsplineikconstraint.__dna__addressof(bSplineIKConstraint.__DNA__FIELD__xzScaleMode);
	 * CPointer&lt;Short&gt; p_xzScaleMode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xzScaleMode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xzScaleMode = new long[]{14, 22};

	public bSplineIKConstraint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bSplineIKConstraint(bSplineIKConstraint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tar'.
	 * @see #__DNA__FIELD__tar
	 */
	
	public CPointer<BlenderObject> getTar() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tar'.
	 * @see #__DNA__FIELD__tar
	 */
	
	public void setTar(CPointer<BlenderObject> tar) throws IOException
	{
		long __address = ((tar == null) ? 0 : tar.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'points'.
	 * @see #__DNA__FIELD__points
	 */
	
	public CPointer<Float> getPoints() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'points'.
	 * @see #__DNA__FIELD__points
	 */
	
	public void setPoints(CPointer<Float> points) throws IOException
	{
		long __address = ((points == null) ? 0 : points.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'numpoints'.
	 * @see #__DNA__FIELD__numpoints
	 */
	
	public short getNumpoints() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'numpoints'.
	 * @see #__DNA__FIELD__numpoints
	 */
	
	public void setNumpoints(short numpoints) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, numpoints);
		} else {
			__io__block.writeShort(__io__address + 8, numpoints);
		}
	}

	/**
	 * Get method for struct member 'chainlen'.
	 * @see #__DNA__FIELD__chainlen
	 */
	
	public short getChainlen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'chainlen'.
	 * @see #__DNA__FIELD__chainlen
	 */
	
	public void setChainlen(short chainlen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, chainlen);
		} else {
			__io__block.writeShort(__io__address + 10, chainlen);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, flag);
		} else {
			__io__block.writeShort(__io__address + 12, flag);
		}
	}

	/**
	 * Get method for struct member 'xzScaleMode'.
	 * @see #__DNA__FIELD__xzScaleMode
	 */
	
	public short getXzScaleMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 22);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'xzScaleMode'.
	 * @see #__DNA__FIELD__xzScaleMode
	 */
	
	public void setXzScaleMode(short xzScaleMode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 22, xzScaleMode);
		} else {
			__io__block.writeShort(__io__address + 14, xzScaleMode);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bSplineIKConstraint> __io__addressof() {
		return new CPointer<bSplineIKConstraint>(__io__address, new Class[]{bSplineIKConstraint.class}, __io__block, __io__blockTable);
	}

}
