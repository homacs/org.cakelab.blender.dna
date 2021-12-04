package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bRotLimitConstraint'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Limit Rotation Constraint </p>
 */

@CMetaData(size32=32, size64=32)
public class bRotLimitConstraint extends CFacade {

	/**
	 * This is the sdna index of the struct bRotLimitConstraint.
	 * <p>
	 * It is required when allocating a new block to store data for bRotLimitConstraint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 390;

	/**
	 * Field descriptor (offset) for struct member 'xmin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRotLimitConstraint brotlimitconstraint = ...;
	 * CPointer&lt;Object&gt; p = brotlimitconstraint.__dna__addressof(bRotLimitConstraint.__DNA__FIELD__xmin);
	 * CPointer&lt;Float&gt; p_xmin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xmin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xmin = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'xmax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRotLimitConstraint brotlimitconstraint = ...;
	 * CPointer&lt;Object&gt; p = brotlimitconstraint.__dna__addressof(bRotLimitConstraint.__DNA__FIELD__xmax);
	 * CPointer&lt;Float&gt; p_xmax = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xmax'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xmax = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'ymin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRotLimitConstraint brotlimitconstraint = ...;
	 * CPointer&lt;Object&gt; p = brotlimitconstraint.__dna__addressof(bRotLimitConstraint.__DNA__FIELD__ymin);
	 * CPointer&lt;Float&gt; p_ymin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ymin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ymin = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'ymax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRotLimitConstraint brotlimitconstraint = ...;
	 * CPointer&lt;Object&gt; p = brotlimitconstraint.__dna__addressof(bRotLimitConstraint.__DNA__FIELD__ymax);
	 * CPointer&lt;Float&gt; p_ymax = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ymax'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ymax = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'zmin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRotLimitConstraint brotlimitconstraint = ...;
	 * CPointer&lt;Object&gt; p = brotlimitconstraint.__dna__addressof(bRotLimitConstraint.__DNA__FIELD__zmin);
	 * CPointer&lt;Float&gt; p_zmin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zmin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zmin = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'zmax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRotLimitConstraint brotlimitconstraint = ...;
	 * CPointer&lt;Object&gt; p = brotlimitconstraint.__dna__addressof(bRotLimitConstraint.__DNA__FIELD__zmax);
	 * CPointer&lt;Float&gt; p_zmax = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zmax'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zmax = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRotLimitConstraint brotlimitconstraint = ...;
	 * CPointer&lt;Object&gt; p = brotlimitconstraint.__dna__addressof(bRotLimitConstraint.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'flag2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRotLimitConstraint brotlimitconstraint = ...;
	 * CPointer&lt;Object&gt; p = brotlimitconstraint.__dna__addressof(bRotLimitConstraint.__DNA__FIELD__flag2);
	 * CPointer&lt;Short&gt; p_flag2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag2 = new long[]{26, 26};

	/**
	 * Field descriptor (offset) for struct member 'euler_order'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRotLimitConstraint brotlimitconstraint = ...;
	 * CPointer&lt;Object&gt; p = brotlimitconstraint.__dna__addressof(bRotLimitConstraint.__DNA__FIELD__euler_order);
	 * CPointer&lt;Byte&gt; p_euler_order = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'euler_order'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__euler_order = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bRotLimitConstraint brotlimitconstraint = ...;
	 * CPointer&lt;Object&gt; p = brotlimitconstraint.__dna__addressof(bRotLimitConstraint.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{29, 29};

	public bRotLimitConstraint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bRotLimitConstraint(bRotLimitConstraint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'xmin'.
	 * @see #__DNA__FIELD__xmin
	 */
	
	public float getXmin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'xmin'.
	 * @see #__DNA__FIELD__xmin
	 */
	
	public void setXmin(float xmin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, xmin);
		} else {
			__io__block.writeFloat(__io__address + 0, xmin);
		}
	}

	/**
	 * Get method for struct member 'xmax'.
	 * @see #__DNA__FIELD__xmax
	 */
	
	public float getXmax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'xmax'.
	 * @see #__DNA__FIELD__xmax
	 */
	
	public void setXmax(float xmax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, xmax);
		} else {
			__io__block.writeFloat(__io__address + 4, xmax);
		}
	}

	/**
	 * Get method for struct member 'ymin'.
	 * @see #__DNA__FIELD__ymin
	 */
	
	public float getYmin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'ymin'.
	 * @see #__DNA__FIELD__ymin
	 */
	
	public void setYmin(float ymin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, ymin);
		} else {
			__io__block.writeFloat(__io__address + 8, ymin);
		}
	}

	/**
	 * Get method for struct member 'ymax'.
	 * @see #__DNA__FIELD__ymax
	 */
	
	public float getYmax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'ymax'.
	 * @see #__DNA__FIELD__ymax
	 */
	
	public void setYmax(float ymax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, ymax);
		} else {
			__io__block.writeFloat(__io__address + 12, ymax);
		}
	}

	/**
	 * Get method for struct member 'zmin'.
	 * @see #__DNA__FIELD__zmin
	 */
	
	public float getZmin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'zmin'.
	 * @see #__DNA__FIELD__zmin
	 */
	
	public void setZmin(float zmin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, zmin);
		} else {
			__io__block.writeFloat(__io__address + 16, zmin);
		}
	}

	/**
	 * Get method for struct member 'zmax'.
	 * @see #__DNA__FIELD__zmax
	 */
	
	public float getZmax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'zmax'.
	 * @see #__DNA__FIELD__zmax
	 */
	
	public void setZmax(float zmax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, zmax);
		} else {
			__io__block.writeFloat(__io__address + 20, zmax);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, flag);
		} else {
			__io__block.writeShort(__io__address + 24, flag);
		}
	}

	/**
	 * Get method for struct member 'flag2'.
	 * @see #__DNA__FIELD__flag2
	 */
	
	public short getFlag2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 26);
		} else {
			return __io__block.readShort(__io__address + 26);
		}
	}

	/**
	 * Set method for struct member 'flag2'.
	 * @see #__DNA__FIELD__flag2
	 */
	
	public void setFlag2(short flag2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 26, flag2);
		} else {
			__io__block.writeShort(__io__address + 26, flag2);
		}
	}

	/**
	 * Get method for struct member 'euler_order'.
	 * @see #__DNA__FIELD__euler_order
	 */
	
	public byte getEuler_order() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 28);
		} else {
			return __io__block.readByte(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'euler_order'.
	 * @see #__DNA__FIELD__euler_order
	 */
	
	public void setEuler_order(byte euler_order) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 28, euler_order);
		} else {
			__io__block.writeByte(__io__address + 28, euler_order);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 29, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 29, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 29;
		} else {
			__dna__offset = 29;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bRotLimitConstraint> __io__addressof() {
		return new CPointer<bRotLimitConstraint>(__io__address, new Class[]{bRotLimitConstraint.class}, __io__block, __io__blockTable);
	}

}
