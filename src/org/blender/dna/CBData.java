package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CBData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=24, size64=24)
public class CBData extends CFacade {

	/**
	 * This is the sdna index of the struct CBData.
	 * <p>
	 * It is required when allocating a new block to store data for CBData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 33;

	/**
	 * Field descriptor (offset) for struct member 'r'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CBData cbdata = ...;
	 * CPointer&lt;Object&gt; p = cbdata.__dna__addressof(CBData.__DNA__FIELD__r);
	 * CPointer&lt;Float&gt; p_r = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'r'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__r = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'g'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CBData cbdata = ...;
	 * CPointer&lt;Object&gt; p = cbdata.__dna__addressof(CBData.__DNA__FIELD__g);
	 * CPointer&lt;Float&gt; p_g = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'g'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__g = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'b'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CBData cbdata = ...;
	 * CPointer&lt;Object&gt; p = cbdata.__dna__addressof(CBData.__DNA__FIELD__b);
	 * CPointer&lt;Float&gt; p_b = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'b'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__b = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'a'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CBData cbdata = ...;
	 * CPointer&lt;Object&gt; p = cbdata.__dna__addressof(CBData.__DNA__FIELD__a);
	 * CPointer&lt;Float&gt; p_a = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'a'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__a = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'pos'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CBData cbdata = ...;
	 * CPointer&lt;Object&gt; p = cbdata.__dna__addressof(CBData.__DNA__FIELD__pos);
	 * CPointer&lt;Float&gt; p_pos = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pos'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pos = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'cur'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CBData cbdata = ...;
	 * CPointer&lt;Object&gt; p = cbdata.__dna__addressof(CBData.__DNA__FIELD__cur);
	 * CPointer&lt;Integer&gt; p_cur = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cur'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cur = new long[]{20, 20};

	public CBData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CBData(CBData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public float getR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public void setR(float r) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, r);
		} else {
			__io__block.writeFloat(__io__address + 0, r);
		}
	}

	/**
	 * Get method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public float getG() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public void setG(float g) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, g);
		} else {
			__io__block.writeFloat(__io__address + 4, g);
		}
	}

	/**
	 * Get method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public float getB() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public void setB(float b) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, b);
		} else {
			__io__block.writeFloat(__io__address + 8, b);
		}
	}

	/**
	 * Get method for struct member 'a'.
	 * @see #__DNA__FIELD__a
	 */
	
	public float getA() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'a'.
	 * @see #__DNA__FIELD__a
	 */
	
	public void setA(float a) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, a);
		} else {
			__io__block.writeFloat(__io__address + 12, a);
		}
	}

	/**
	 * Get method for struct member 'pos'.
	 * @see #__DNA__FIELD__pos
	 */
	
	public float getPos() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'pos'.
	 * @see #__DNA__FIELD__pos
	 */
	
	public void setPos(float pos) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, pos);
		} else {
			__io__block.writeFloat(__io__address + 16, pos);
		}
	}

	/**
	 * Get method for struct member 'cur'.
	 * @see #__DNA__FIELD__cur
	 */
	
	public int getCur() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'cur'.
	 * @see #__DNA__FIELD__cur
	 */
	
	public void setCur(int cur) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, cur);
		} else {
			__io__block.writeInt(__io__address + 20, cur);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CBData> __io__addressof() {
		return new CPointer<CBData>(__io__address, new Class[]{CBData.class}, __io__block, __io__blockTable);
	}

}
