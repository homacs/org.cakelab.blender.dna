package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeSunBeams'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=12, size64=12)
public class NodeSunBeams extends CFacade {

	/**
	 * This is the sdna index of the struct NodeSunBeams.
	 * <p>
	 * It is required when allocating a new block to store data for NodeSunBeams.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 427;

	/**
	 * Field descriptor (offset) for struct member 'source'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeSunBeams nodesunbeams = ...;
	 * CPointer&lt;Object&gt; p = nodesunbeams.__dna__addressof(NodeSunBeams.__DNA__FIELD__source);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_source = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'source'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__source = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'ray_length'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeSunBeams nodesunbeams = ...;
	 * CPointer&lt;Object&gt; p = nodesunbeams.__dna__addressof(NodeSunBeams.__DNA__FIELD__ray_length);
	 * CPointer&lt;Float&gt; p_ray_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ray_length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ray_length = new long[]{8, 8};

	public NodeSunBeams(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeSunBeams(NodeSunBeams that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'source'.
	 * @see #__DNA__FIELD__source
	 */
	
	public CArrayFacade<Float> getSource() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'source'.
	 * @see #__DNA__FIELD__source
	 */
	
	public void setSource(CArrayFacade<Float> source) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(source, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, source)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, source);
		} else {
			__io__generic__copy( getSource(), source);
		}
	}

	/**
	 * Get method for struct member 'ray_length'.
	 * @see #__DNA__FIELD__ray_length
	 */
	
	public float getRay_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'ray_length'.
	 * @see #__DNA__FIELD__ray_length
	 */
	
	public void setRay_length(float ray_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, ray_length);
		} else {
			__io__block.writeFloat(__io__address + 8, ray_length);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeSunBeams> __io__addressof() {
		return new CPointer<NodeSunBeams>(__io__address, new Class[]{NodeSunBeams.class}, __io__block, __io__blockTable);
	}

}
