package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeCryptomatte'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=36, size64=40)
public class NodeCryptomatte extends CFacade {

	/**
	 * This is the sdna index of the struct NodeCryptomatte.
	 * <p>
	 * It is required when allocating a new block to store data for NodeCryptomatte.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 428;

	/**
	 * Field descriptor (offset) for struct member 'add'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte nodecryptomatte = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte.__dna__addressof(NodeCryptomatte.__DNA__FIELD__add);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_add = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'add'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__add = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'remove'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte nodecryptomatte = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte.__dna__addressof(NodeCryptomatte.__DNA__FIELD__remove);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_remove = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'remove'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__remove = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'matte_id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte nodecryptomatte = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte.__dna__addressof(NodeCryptomatte.__DNA__FIELD__matte_id);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_matte_id = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'matte_id'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__matte_id = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'num_inputs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte nodecryptomatte = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte.__dna__addressof(NodeCryptomatte.__DNA__FIELD__num_inputs);
	 * CPointer&lt;Integer&gt; p_num_inputs = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'num_inputs'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__num_inputs = new long[]{28, 32};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte nodecryptomatte = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte.__dna__addressof(NodeCryptomatte.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{32, 36};

	public NodeCryptomatte(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeCryptomatte(NodeCryptomatte that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'add'.
	 * @see #__DNA__FIELD__add
	 */
	
	public CArrayFacade<Float> getAdd() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'add'.
	 * @see #__DNA__FIELD__add
	 */
	
	public void setAdd(CArrayFacade<Float> add) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(add, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, add)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, add);
		} else {
			__io__generic__copy( getAdd(), add);
		}
	}

	/**
	 * Get method for struct member 'remove'.
	 * @see #__DNA__FIELD__remove
	 */
	
	public CArrayFacade<Float> getRemove() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'remove'.
	 * @see #__DNA__FIELD__remove
	 */
	
	public void setRemove(CArrayFacade<Float> remove) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(remove, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, remove)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, remove);
		} else {
			__io__generic__copy( getRemove(), remove);
		}
	}

	/**
	 * Get method for struct member 'matte_id'.
	 * @see #__DNA__FIELD__matte_id
	 */
	
	public CPointer<Byte> getMatte_id() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'matte_id'.
	 * @see #__DNA__FIELD__matte_id
	 */
	
	public void setMatte_id(CPointer<Byte> matte_id) throws IOException
	{
		long __address = ((matte_id == null) ? 0 : matte_id.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'num_inputs'.
	 * @see #__DNA__FIELD__num_inputs
	 */
	
	public int getNum_inputs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'num_inputs'.
	 * @see #__DNA__FIELD__num_inputs
	 */
	
	public void setNum_inputs(int num_inputs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, num_inputs);
		} else {
			__io__block.writeInt(__io__address + 28, num_inputs);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 36;
		} else {
			__dna__offset = 32;
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
	public CPointer<NodeCryptomatte> __io__addressof() {
		return new CPointer<NodeCryptomatte>(__io__address, new Class[]{NodeCryptomatte.class}, __io__block, __io__blockTable);
	}

}
