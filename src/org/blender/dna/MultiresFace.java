package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MultiresFace'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=24, size64=24)
public class MultiresFace extends CFacade {

	/**
	 * This is the sdna index of the struct MultiresFace.
	 * <p>
	 * It is required when allocating a new block to store data for MultiresFace.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 80;

	/**
	 * Field descriptor (offset) for struct member 'v'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresFace multiresface = ...;
	 * CPointer&lt;Object&gt; p = multiresface.__dna__addressof(MultiresFace.__DNA__FIELD__v);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_v = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v'</li>
	 * <li>Signature: 'int[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'mid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresFace multiresface = ...;
	 * CPointer&lt;Object&gt; p = multiresface.__dna__addressof(MultiresFace.__DNA__FIELD__mid);
	 * CPointer&lt;Integer&gt; p_mid = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mid'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mid = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresFace multiresface = ...;
	 * CPointer&lt;Object&gt; p = multiresface.__dna__addressof(MultiresFace.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'mat_nr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresFace multiresface = ...;
	 * CPointer&lt;Object&gt; p = multiresface.__dna__addressof(MultiresFace.__DNA__FIELD__mat_nr);
	 * CPointer&lt;Byte&gt; p_mat_nr = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat_nr'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat_nr = new long[]{21, 21};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiresFace multiresface = ...;
	 * CPointer&lt;Object&gt; p = multiresface.__dna__addressof(MultiresFace.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{22, 22};

	public MultiresFace(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MultiresFace(MultiresFace that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'v'.
	 * @see #__DNA__FIELD__v
	 */
	
	public CArrayFacade<Integer> getV() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'v'.
	 * @see #__DNA__FIELD__v
	 */
	
	public void setV(CArrayFacade<Integer> v) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(v, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, v)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, v);
		} else {
			__io__generic__copy( getV(), v);
		}
	}

	/**
	 * Get method for struct member 'mid'.
	 * @see #__DNA__FIELD__mid
	 */
	
	public int getMid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'mid'.
	 * @see #__DNA__FIELD__mid
	 */
	
	public void setMid(int mid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, mid);
		} else {
			__io__block.writeInt(__io__address + 16, mid);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 20);
		} else {
			return __io__block.readByte(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 20, flag);
		} else {
			__io__block.writeByte(__io__address + 20, flag);
		}
	}

	/**
	 * Get method for struct member 'mat_nr'.
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public byte getMat_nr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 21);
		} else {
			return __io__block.readByte(__io__address + 21);
		}
	}

	/**
	 * Set method for struct member 'mat_nr'.
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public void setMat_nr(byte mat_nr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 21, mat_nr);
		} else {
			__io__block.writeByte(__io__address + 21, mat_nr);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Byte> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 22, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 22, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Byte> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 22;
		} else {
			__dna__offset = 22;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MultiresFace> __io__addressof() {
		return new CPointer<MultiresFace>(__io__address, new Class[]{MultiresFace.class}, __io__block, __io__blockTable);
	}

}
