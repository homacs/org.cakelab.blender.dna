package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'TransformOrientationSlot'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  {@link Scene}  ID-Block </p>
 */

@CMetaData(size32=16, size64=16)
public class TransformOrientationSlot extends CFacade {

	/**
	 * This is the sdna index of the struct TransformOrientationSlot.
	 * <p>
	 * It is required when allocating a new block to store data for TransformOrientationSlot.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 208;

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Transformation orientation
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TransformOrientationSlot transformorientationslot = ...;
	 * CPointer&lt;Object&gt; p = transformorientationslot.__dna__addressof(TransformOrientationSlot.__DNA__FIELD__type);
	 * CPointer&lt;Integer&gt; p_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'index_custom'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TransformOrientationSlot transformorientationslot = ...;
	 * CPointer&lt;Object&gt; p = transformorientationslot.__dna__addressof(TransformOrientationSlot.__DNA__FIELD__index_custom);
	 * CPointer&lt;Integer&gt; p_index_custom = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'index_custom'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__index_custom = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TransformOrientationSlot transformorientationslot = ...;
	 * CPointer&lt;Object&gt; p = transformorientationslot.__dna__addressof(TransformOrientationSlot.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TransformOrientationSlot transformorientationslot = ...;
	 * CPointer&lt;Object&gt; p = transformorientationslot.__dna__addressof(TransformOrientationSlot.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{9, 9};

	public TransformOrientationSlot(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected TransformOrientationSlot(TransformOrientationSlot that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Transformation orientation
	 * @see #__DNA__FIELD__type
	 */
	
	public int getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Transformation orientation
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(int type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, type);
		} else {
			__io__block.writeInt(__io__address + 0, type);
		}
	}

	/**
	 * Get method for struct member 'index_custom'.
	 * @see #__DNA__FIELD__index_custom
	 */
	
	public int getIndex_custom() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'index_custom'.
	 * @see #__DNA__FIELD__index_custom
	 */
	
	public void setIndex_custom(int index_custom) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, index_custom);
		} else {
			__io__block.writeInt(__io__address + 4, index_custom);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 8);
		} else {
			return __io__block.readByte(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 8, flag);
		} else {
			__io__block.writeByte(__io__address + 8, flag);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 9, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 9, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 9;
		} else {
			__dna__offset = 9;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<TransformOrientationSlot> __io__addressof() {
		return new CPointer<TransformOrientationSlot>(__io__address, new Class[]{TransformOrientationSlot.class}, __io__block, __io__blockTable);
	}

}
