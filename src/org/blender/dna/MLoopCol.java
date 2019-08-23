package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MLoopCol'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><em></em>  be initialized to 255 Mostly its not used for transparency... (except for blender-internal rendering, see [#34096]).</p><p><h2>Note</h2><p><em></em>  swapped, as they are with {@link MCol}  </p> red and blue are not swapped, as they are with MCol 
 * </p>
 */

@CMetaData(size32=4, size64=4)
public class MLoopCol extends CFacade {

	/**
	 * This is the sdna index of the struct MLoopCol.
	 * <p>
	 * It is required when allocating a new block to store data for MLoopCol.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 69;

	/**
	 * Field descriptor (offset) for struct member 'r'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MLoopCol mloopcol = ...;
	 * CPointer&lt;Object&gt; p = mloopcol.__dna__addressof(MLoopCol.__DNA__FIELD__r);
	 * CPointer&lt;Byte&gt; p_r = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'r'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
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
	 * MLoopCol mloopcol = ...;
	 * CPointer&lt;Object&gt; p = mloopcol.__dna__addressof(MLoopCol.__DNA__FIELD__g);
	 * CPointer&lt;Byte&gt; p_g = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'g'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__g = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'b'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MLoopCol mloopcol = ...;
	 * CPointer&lt;Object&gt; p = mloopcol.__dna__addressof(MLoopCol.__DNA__FIELD__b);
	 * CPointer&lt;Byte&gt; p_b = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'b'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__b = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'a'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MLoopCol mloopcol = ...;
	 * CPointer&lt;Object&gt; p = mloopcol.__dna__addressof(MLoopCol.__DNA__FIELD__a);
	 * CPointer&lt;Byte&gt; p_a = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'a'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__a = new long[]{3, 3};

	public MLoopCol(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MLoopCol(MLoopCol that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public byte getR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public void setR(byte r) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, r);
		} else {
			__io__block.writeByte(__io__address + 0, r);
		}
	}

	/**
	 * Get method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public byte getG() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public void setG(byte g) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, g);
		} else {
			__io__block.writeByte(__io__address + 1, g);
		}
	}

	/**
	 * Get method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public byte getB() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public void setB(byte b) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, b);
		} else {
			__io__block.writeByte(__io__address + 2, b);
		}
	}

	/**
	 * Get method for struct member 'a'.
	 * @see #__DNA__FIELD__a
	 */
	
	public byte getA() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'a'.
	 * @see #__DNA__FIELD__a
	 */
	
	public void setA(byte a) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, a);
		} else {
			__io__block.writeByte(__io__address + 3, a);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MLoopCol> __io__addressof() {
		return new CPointer<MLoopCol>(__io__address, new Class[]{MLoopCol.class}, __io__block, __io__blockTable);
	}

}
