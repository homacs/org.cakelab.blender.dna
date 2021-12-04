package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeCryptomatte_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=32, size64=40)
public class NodeCryptomatte_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct NodeCryptomatte_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for NodeCryptomatte_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 479;

	/**
	 * Field descriptor (offset) for struct member 'layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code> Contains {@link CryptomatteLayer}</code> . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte_Runtime nodecryptomatte_runtime = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte_runtime.__dna__addressof(NodeCryptomatte_Runtime.__DNA__FIELD__layers);
	 * CPointer&lt;ListBase&gt; p_layers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layers = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'add'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp storage for the cryptomatte picker. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte_Runtime nodecryptomatte_runtime = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte_runtime.__dna__addressof(NodeCryptomatte_Runtime.__DNA__FIELD__add);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_add = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'add'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__add = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'remove'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte_Runtime nodecryptomatte_runtime = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte_runtime.__dna__addressof(NodeCryptomatte_Runtime.__DNA__FIELD__remove);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_remove = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'remove'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__remove = new long[]{20, 28};

	public NodeCryptomatte_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeCryptomatte_Runtime(NodeCryptomatte_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code> Contains {@link CryptomatteLayer}</code> . </p>
	 * @see #__DNA__FIELD__layers
	 */
	
	public ListBase getLayers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><code> Contains {@link CryptomatteLayer}</code> . </p>
	 * @see #__DNA__FIELD__layers
	 */
	
	public void setLayers(ListBase layers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(layers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layers);
		} else {
			__io__generic__copy( getLayers(), layers);
		}
	}

	/**
	 * Get method for struct member 'add'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp storage for the cryptomatte picker. </p>
	 * @see #__DNA__FIELD__add
	 */
	
	public CArrayFacade<Float> getAdd() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'add'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Temp storage for the cryptomatte picker. </p>
	 * @see #__DNA__FIELD__add
	 */
	
	public void setAdd(CArrayFacade<Float> add) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
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
			return new CArrayFacade<Float>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 28;
		} else {
			__dna__offset = 20;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeCryptomatte_Runtime> __io__addressof() {
		return new CPointer<NodeCryptomatte_Runtime>(__io__address, new Class[]{NodeCryptomatte_Runtime.class}, __io__block, __io__blockTable);
	}

}
