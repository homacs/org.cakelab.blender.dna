package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'OceanTex'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=76, size64=80)
public class OceanTex extends CFacade {

	/**
	 * This is the sdna index of the struct OceanTex.
	 * <p>
	 * It is required when allocating a new block to store data for OceanTex.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 38;

	/**
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanTex oceantex = ...;
	 * CPointer&lt;Object&gt; p = oceantex.__dna__addressof(OceanTex.__DNA__FIELD__object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'oceanmod'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanTex oceantex = ...;
	 * CPointer&lt;Object&gt; p = oceantex.__dna__addressof(OceanTex.__DNA__FIELD__oceanmod);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_oceanmod = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'oceanmod'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__oceanmod = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'output'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanTex oceantex = ...;
	 * CPointer&lt;Object&gt; p = oceantex.__dna__addressof(OceanTex.__DNA__FIELD__output);
	 * CPointer&lt;Integer&gt; p_output = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'output'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__output = new long[]{68, 72};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * OceanTex oceantex = ...;
	 * CPointer&lt;Object&gt; p = oceantex.__dna__addressof(OceanTex.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{72, 76};

	public OceanTex(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected OceanTex(OceanTex that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'object'.
	 * @see #__DNA__FIELD__object
	 */
	
	public CPointer<BlenderObject> getObject() throws IOException
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
	 * Set method for struct member 'object'.
	 * @see #__DNA__FIELD__object
	 */
	
	public void setObject(CPointer<BlenderObject> object) throws IOException
	{
		long __address = ((object == null) ? 0 : object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'oceanmod'.
	 * @see #__DNA__FIELD__oceanmod
	 */
	
	public CArrayFacade<Byte> getOceanmod() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'oceanmod'.
	 * @see #__DNA__FIELD__oceanmod
	 */
	
	public void setOceanmod(CArrayFacade<Byte> oceanmod) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(oceanmod, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, oceanmod)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, oceanmod);
		} else {
			__io__generic__copy( getOceanmod(), oceanmod);
		}
	}

	/**
	 * Get method for struct member 'output'.
	 * @see #__DNA__FIELD__output
	 */
	
	public int getOutput() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 72);
		} else {
			return __io__block.readInt(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'output'.
	 * @see #__DNA__FIELD__output
	 */
	
	public void setOutput(int output) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 72, output);
		} else {
			__io__block.writeInt(__io__address + 68, output);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 76);
		} else {
			return __io__block.readInt(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 76, pad);
		} else {
			__io__block.writeInt(__io__address + 72, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<OceanTex> __io__addressof() {
		return new CPointer<OceanTex>(__io__address, new Class[]{OceanTex.class}, __io__block, __io__blockTable);
	}

}
