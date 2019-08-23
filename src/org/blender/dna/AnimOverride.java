package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'AnimOverride'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  Animation Data {@link AnimOverride}  -------------------------------<mdash/><mdash/>  Animation Override (aor)</p><p> This is used to as temporary storage of values which have been changed by the user, but not yet keyframed (thus, would get overwritten by the animation system before the user had a chance to see the changes that were made).</p><p> It is probably not needed for overriding keyframed values in most cases, as those will only get evaluated on frame-change now. That situation may change in future. </p>
 */

@CMetaData(size32=20, size64=32)
public class AnimOverride extends CFacade {

	/**
	 * This is the sdna index of the struct AnimOverride.
	 * <p>
	 * It is required when allocating a new block to store data for AnimOverride.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 532;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimOverride animoverride = ...;
	 * CPointer&lt;Object&gt; p = animoverride.__dna__addressof(AnimOverride.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;AnimOverride&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, AnimOverride.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'AnimOverride*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimOverride animoverride = ...;
	 * CPointer&lt;Object&gt; p = animoverride.__dna__addressof(AnimOverride.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;AnimOverride&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, AnimOverride.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'AnimOverride*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'rna_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA-path to use to resolve data-access. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimOverride animoverride = ...;
	 * CPointer&lt;Object&gt; p = animoverride.__dna__addressof(AnimOverride.__DNA__FIELD__rna_path);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_rna_path = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rna_path'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rna_path = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'array_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If applicable, the index of the RNA-array item to get. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimOverride animoverride = ...;
	 * CPointer&lt;Object&gt; p = animoverride.__dna__addressof(AnimOverride.__DNA__FIELD__array_index);
	 * CPointer&lt;Integer&gt; p_array_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'array_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__array_index = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Value to override setting with. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimOverride animoverride = ...;
	 * CPointer&lt;Object&gt; p = animoverride.__dna__addressof(AnimOverride.__DNA__FIELD__value);
	 * CPointer&lt;Float&gt; p_value = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value = new long[]{16, 28};

	public AnimOverride(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected AnimOverride(AnimOverride that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<AnimOverride> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimOverride.class};
		return new CPointer<AnimOverride>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimOverride.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<AnimOverride> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<AnimOverride> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimOverride.class};
		return new CPointer<AnimOverride>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimOverride.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<AnimOverride> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'rna_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA-path to use to resolve data-access. </p>
	 * @see #__DNA__FIELD__rna_path
	 */
	
	public CPointer<Byte> getRna_path() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rna_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA-path to use to resolve data-access. </p>
	 * @see #__DNA__FIELD__rna_path
	 */
	
	public void setRna_path(CPointer<Byte> rna_path) throws IOException
	{
		long __address = ((rna_path == null) ? 0 : rna_path.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'array_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If applicable, the index of the RNA-array item to get. </p>
	 * @see #__DNA__FIELD__array_index
	 */
	
	public int getArray_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'array_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> If applicable, the index of the RNA-array item to get. </p>
	 * @see #__DNA__FIELD__array_index
	 */
	
	public void setArray_index(int array_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, array_index);
		} else {
			__io__block.writeInt(__io__address + 12, array_index);
		}
	}

	/**
	 * Get method for struct member 'value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Value to override setting with. </p>
	 * @see #__DNA__FIELD__value
	 */
	
	public float getValue() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'value'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Value to override setting with. </p>
	 * @see #__DNA__FIELD__value
	 */
	
	public void setValue(float value) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, value);
		} else {
			__io__block.writeFloat(__io__address + 16, value);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<AnimOverride> __io__addressof() {
		return new CPointer<AnimOverride>(__io__address, new Class[]{AnimOverride.class}, __io__block, __io__blockTable);
	}

}
