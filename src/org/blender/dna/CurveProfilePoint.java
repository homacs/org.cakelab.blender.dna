package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CurveProfilePoint'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Each control point that makes up the profile. <h2>Note</h2><p> The flags use the same enum as Bezier curves, but they aren't guaranteed to have identical functionality, and all types aren't implemented. </p> The flags use the same enum as Bezier curves, but they aren't guaranteed to have identical functionality, and all types aren't implemented. 
 * </p>
 */

@CMetaData(size32=12, size64=12)
public class CurveProfilePoint extends CFacade {

	/**
	 * This is the sdna index of the struct CurveProfilePoint.
	 * <p>
	 * It is required when allocating a new block to store data for CurveProfilePoint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 662;

	/**
	 * Field descriptor (offset) for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Location of the point, keep together. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfilePoint curveprofilepoint = ...;
	 * CPointer&lt;Object&gt; p = curveprofilepoint.__dna__addressof(CurveProfilePoint.__DNA__FIELD__x);
	 * CPointer&lt;Float&gt; p_x = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'x'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__x = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfilePoint curveprofilepoint = ...;
	 * CPointer&lt;Object&gt; p = curveprofilepoint.__dna__addressof(CurveProfilePoint.__DNA__FIELD__y);
	 * CPointer&lt;Float&gt; p_y = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'y'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__y = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag selection state and others. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfilePoint curveprofilepoint = ...;
	 * CPointer&lt;Object&gt; p = curveprofilepoint.__dna__addressof(CurveProfilePoint.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'h1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for both handle's type (eBezTriple_Handle). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfilePoint curveprofilepoint = ...;
	 * CPointer&lt;Object&gt; p = curveprofilepoint.__dna__addressof(CurveProfilePoint.__DNA__FIELD__h1);
	 * CPointer&lt;Byte&gt; p_h1 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'h1'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__h1 = new long[]{10, 10};

	/**
	 * Field descriptor (offset) for struct member 'h2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveProfilePoint curveprofilepoint = ...;
	 * CPointer&lt;Object&gt; p = curveprofilepoint.__dna__addressof(CurveProfilePoint.__DNA__FIELD__h2);
	 * CPointer&lt;Byte&gt; p_h2 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'h2'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__h2 = new long[]{11, 11};

	public CurveProfilePoint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CurveProfilePoint(CurveProfilePoint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Location of the point, keep together. </p>
	 * @see #__DNA__FIELD__x
	 */
	
	public float getX() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Location of the point, keep together. </p>
	 * @see #__DNA__FIELD__x
	 */
	
	public void setX(float x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, x);
		} else {
			__io__block.writeFloat(__io__address + 0, x);
		}
	}

	/**
	 * Get method for struct member 'y'.
	 * @see #__DNA__FIELD__y
	 */
	
	public float getY() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'y'.
	 * @see #__DNA__FIELD__y
	 */
	
	public void setY(float y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, y);
		} else {
			__io__block.writeFloat(__io__address + 4, y);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag selection state and others. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag selection state and others. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, flag);
		} else {
			__io__block.writeShort(__io__address + 8, flag);
		}
	}

	/**
	 * Get method for struct member 'h1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for both handle's type (eBezTriple_Handle). </p>
	 * @see #__DNA__FIELD__h1
	 */
	
	public byte getH1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 10);
		} else {
			return __io__block.readByte(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'h1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for both handle's type (eBezTriple_Handle). </p>
	 * @see #__DNA__FIELD__h1
	 */
	
	public void setH1(byte h1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 10, h1);
		} else {
			__io__block.writeByte(__io__address + 10, h1);
		}
	}

	/**
	 * Get method for struct member 'h2'.
	 * @see #__DNA__FIELD__h2
	 */
	
	public byte getH2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 11);
		} else {
			return __io__block.readByte(__io__address + 11);
		}
	}

	/**
	 * Set method for struct member 'h2'.
	 * @see #__DNA__FIELD__h2
	 */
	
	public void setH2(byte h2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 11, h2);
		} else {
			__io__block.writeByte(__io__address + 11, h2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CurveProfilePoint> __io__addressof() {
		return new CPointer<CurveProfilePoint>(__io__address, new Class[]{CurveProfilePoint.class}, __io__block, __io__blockTable);
	}

}
