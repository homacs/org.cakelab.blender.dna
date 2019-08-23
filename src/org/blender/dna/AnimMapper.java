package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'AnimMapper'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> FIXME: will this be too clumsy or slow? If we're using RNA paths anyway, we'll have to accept such consequences... </p><p> Retargetting Information for Actions</p><p> This should only be used if it is strictly necessary (i.e. user will need to explicitly add this when they find that some channels do not match, or motion is not going to right places). When executing an action, this will be checked to see if it provides any useful remaps for the given paths.</p><p> NOTE: we currently don't store this in the Action itself, as that causes too many problems. </p>
 */

@CMetaData(size32=20, size64=40)
public class AnimMapper extends CFacade {

	/**
	 * This is the sdna index of the struct AnimMapper.
	 * <p>
	 * It is required when allocating a new block to store data for AnimMapper.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 522;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimMapper animmapper = ...;
	 * CPointer&lt;Object&gt; p = animmapper.__dna__addressof(AnimMapper.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;AnimMapper&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, AnimMapper.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'AnimMapper*'</li>
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
	 * AnimMapper animmapper = ...;
	 * CPointer&lt;Object&gt; p = animmapper.__dna__addressof(AnimMapper.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;AnimMapper&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, AnimMapper.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'AnimMapper*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> target action </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimMapper animmapper = ...;
	 * CPointer&lt;Object&gt; p = animmapper.__dna__addressof(AnimMapper.__DNA__FIELD__target);
	 * CPointer&lt;CPointer&lt;bAction&gt;&gt; p_target = p.cast(new Class[]{CPointer.class, bAction.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'target'</li>
	 * <li>Signature: 'bAction*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__target = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'mappings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> remapping table (bAnimMapPair) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimMapper animmapper = ...;
	 * CPointer&lt;Object&gt; p = animmapper.__dna__addressof(AnimMapper.__DNA__FIELD__mappings);
	 * CPointer&lt;ListBase&gt; p_mappings = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mappings'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mappings = new long[]{12, 24};

	public AnimMapper(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected AnimMapper(AnimMapper that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<AnimMapper> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimMapper.class};
		return new CPointer<AnimMapper>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimMapper.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<AnimMapper> next) throws IOException
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
	
	public CPointer<AnimMapper> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{AnimMapper.class};
		return new CPointer<AnimMapper>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, AnimMapper.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<AnimMapper> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> target action </p>
	 * @see #__DNA__FIELD__target
	 */
	
	public CPointer<bAction> getTarget() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bAction.class};
		return new CPointer<bAction>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bAction.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> target action </p>
	 * @see #__DNA__FIELD__target
	 */
	
	public void setTarget(CPointer<bAction> target) throws IOException
	{
		long __address = ((target == null) ? 0 : target.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'mappings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> remapping table (bAnimMapPair) </p>
	 * @see #__DNA__FIELD__mappings
	 */
	
	public ListBase getMappings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 24, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 12, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mappings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> remapping table (bAnimMapPair) </p>
	 * @see #__DNA__FIELD__mappings
	 */
	
	public void setMappings(ListBase mappings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(mappings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mappings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mappings);
		} else {
			__io__generic__copy( getMappings(), mappings);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<AnimMapper> __io__addressof() {
		return new CPointer<AnimMapper>(__io__address, new Class[]{AnimMapper.class}, __io__block, __io__blockTable);
	}

}
