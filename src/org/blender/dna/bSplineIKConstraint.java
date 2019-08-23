package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bSplineIKConstraint'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Spline IK Constraint Aligns 'n' bones to the curvature defined by the curve, with the chain ending on the bone that owns this constraint, and starting on the nth parent. </p>
 */

@CMetaData(size32=40, size64=48)
public class bSplineIKConstraint extends CFacade {

	/**
	 * This is the sdna index of the struct bSplineIKConstraint.
	 * <p>
	 * It is required when allocating a new block to store data for bSplineIKConstraint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 331;

	/**
	 * Field descriptor (offset) for struct member 'tar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> target(s) {@link Curve}  object (with follow path enabled) which drives the bone chain. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> binding details Array of numpoints items, denoting parametric positions along curve that joints should follow. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of points to bound in points array. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of bones ('n') that are in the chain. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings General settings for constraint. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Method used for determining the x & z scaling of the bones. </p>
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

	/**
	 * Field descriptor (offset) for struct member 'yScaleMode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Method used for determining the y scaling of the bones. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSplineIKConstraint bsplineikconstraint = ...;
	 * CPointer&lt;Object&gt; p = bsplineikconstraint.__dna__addressof(bSplineIKConstraint.__DNA__FIELD__yScaleMode);
	 * CPointer&lt;Short&gt; p_yScaleMode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yScaleMode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yScaleMode = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSplineIKConstraint bsplineikconstraint = ...;
	 * CPointer&lt;Object&gt; p = bsplineikconstraint.__dna__addressof(bSplineIKConstraint.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'short[3]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{18, 26};

	/**
	 * Field descriptor (offset) for struct member 'bulge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> volume preservation settings </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSplineIKConstraint bsplineikconstraint = ...;
	 * CPointer&lt;Object&gt; p = bsplineikconstraint.__dna__addressof(bSplineIKConstraint.__DNA__FIELD__bulge);
	 * CPointer&lt;Float&gt; p_bulge = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bulge'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bulge = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'bulge_min'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSplineIKConstraint bsplineikconstraint = ...;
	 * CPointer&lt;Object&gt; p = bsplineikconstraint.__dna__addressof(bSplineIKConstraint.__DNA__FIELD__bulge_min);
	 * CPointer&lt;Float&gt; p_bulge_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bulge_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bulge_min = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'bulge_max'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSplineIKConstraint bsplineikconstraint = ...;
	 * CPointer&lt;Object&gt; p = bsplineikconstraint.__dna__addressof(bSplineIKConstraint.__DNA__FIELD__bulge_max);
	 * CPointer&lt;Float&gt; p_bulge_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bulge_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bulge_max = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'bulge_smooth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bSplineIKConstraint bsplineikconstraint = ...;
	 * CPointer&lt;Object&gt; p = bsplineikconstraint.__dna__addressof(bSplineIKConstraint.__DNA__FIELD__bulge_smooth);
	 * CPointer&lt;Float&gt; p_bulge_smooth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bulge_smooth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bulge_smooth = new long[]{36, 44};

	public bSplineIKConstraint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bSplineIKConstraint(bSplineIKConstraint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> target(s) {@link Curve}  object (with follow path enabled) which drives the bone chain. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> target(s) {@link Curve}  object (with follow path enabled) which drives the bone chain. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> binding details Array of numpoints items, denoting parametric positions along curve that joints should follow. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> binding details Array of numpoints items, denoting parametric positions along curve that joints should follow. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of points to bound in points array. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of points to bound in points array. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of bones ('n') that are in the chain. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of bones ('n') that are in the chain. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings General settings for constraint. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings General settings for constraint. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Method used for determining the x & z scaling of the bones. </p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Method used for determining the x & z scaling of the bones. </p>
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
	 * Get method for struct member 'yScaleMode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Method used for determining the y scaling of the bones. </p>
	 * @see #__DNA__FIELD__yScaleMode
	 */
	
	public short getYScaleMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'yScaleMode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Method used for determining the y scaling of the bones. </p>
	 * @see #__DNA__FIELD__yScaleMode
	 */
	
	public void setYScaleMode(short yScaleMode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, yScaleMode);
		} else {
			__io__block.writeShort(__io__address + 16, yScaleMode);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Short> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 26, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 18, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Short> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 26;
		} else {
			__dna__offset = 18;
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
	 * Get method for struct member 'bulge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> volume preservation settings </p>
	 * @see #__DNA__FIELD__bulge
	 */
	
	public float getBulge() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'bulge'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> volume preservation settings </p>
	 * @see #__DNA__FIELD__bulge
	 */
	
	public void setBulge(float bulge) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, bulge);
		} else {
			__io__block.writeFloat(__io__address + 24, bulge);
		}
	}

	/**
	 * Get method for struct member 'bulge_min'.
	 * @see #__DNA__FIELD__bulge_min
	 */
	
	public float getBulge_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'bulge_min'.
	 * @see #__DNA__FIELD__bulge_min
	 */
	
	public void setBulge_min(float bulge_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, bulge_min);
		} else {
			__io__block.writeFloat(__io__address + 28, bulge_min);
		}
	}

	/**
	 * Get method for struct member 'bulge_max'.
	 * @see #__DNA__FIELD__bulge_max
	 */
	
	public float getBulge_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'bulge_max'.
	 * @see #__DNA__FIELD__bulge_max
	 */
	
	public void setBulge_max(float bulge_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, bulge_max);
		} else {
			__io__block.writeFloat(__io__address + 32, bulge_max);
		}
	}

	/**
	 * Get method for struct member 'bulge_smooth'.
	 * @see #__DNA__FIELD__bulge_smooth
	 */
	
	public float getBulge_smooth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'bulge_smooth'.
	 * @see #__DNA__FIELD__bulge_smooth
	 */
	
	public void setBulge_smooth(float bulge_smooth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, bulge_smooth);
		} else {
			__io__block.writeFloat(__io__address + 36, bulge_smooth);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bSplineIKConstraint> __io__addressof() {
		return new CPointer<bSplineIKConstraint>(__io__address, new Class[]{bSplineIKConstraint.class}, __io__block, __io__blockTable);
	}

}
