package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MStringProperty'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=256, size64=256)
public class MStringProperty extends CFacade {

	/**
	 * This is the sdna index of the struct MStringProperty.
	 * <p>
	 * It is required when allocating a new block to store data for MStringProperty.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 74;

	/**
	 * Field descriptor (offset) for struct member 's'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MStringProperty mstringproperty = ...;
	 * CPointer&lt;Object&gt; p = mstringproperty.__dna__addressof(MStringProperty.__DNA__FIELD__s);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_s = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 's'</li>
	 * <li>Signature: 'char[255]'</li>
	 * <li>Actual Size (32bit/64bit): 255/255</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__s = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 's_len'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MStringProperty mstringproperty = ...;
	 * CPointer&lt;Object&gt; p = mstringproperty.__dna__addressof(MStringProperty.__DNA__FIELD__s_len);
	 * CPointer&lt;Byte&gt; p_s_len = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 's_len'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__s_len = new long[]{255, 255};

	public MStringProperty(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MStringProperty(MStringProperty that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 's'.
	 * @see #__DNA__FIELD__s
	 */
	
	public CArrayFacade<Byte> getS() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			255
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 's'.
	 * @see #__DNA__FIELD__s
	 */
	
	public void setS(CArrayFacade<Byte> s) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(s, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, s)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, s);
		} else {
			__io__generic__copy( getS(), s);
		}
	}

	/**
	 * Get method for struct member 's_len'.
	 * @see #__DNA__FIELD__s_len
	 */
	
	public byte getS_len() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 255);
		} else {
			return __io__block.readByte(__io__address + 255);
		}
	}

	/**
	 * Set method for struct member 's_len'.
	 * @see #__DNA__FIELD__s_len
	 */
	
	public void setS_len(byte s_len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 255, s_len);
		} else {
			__io__block.writeByte(__io__address + 255, s_len);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MStringProperty> __io__addressof() {
		return new CPointer<MStringProperty>(__io__address, new Class[]{MStringProperty.class}, __io__block, __io__blockTable);
	}

}
