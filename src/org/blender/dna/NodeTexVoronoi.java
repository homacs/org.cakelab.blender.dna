package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeTexVoronoi'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=972, size64=976)
public class NodeTexVoronoi extends CFacade {

	/**
	 * This is the sdna index of the struct NodeTexVoronoi.
	 * <p>
	 * It is required when allocating a new block to store data for NodeTexVoronoi.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 413;

	/**
	 * Field descriptor (offset) for struct member 'base'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexVoronoi nodetexvoronoi = ...;
	 * CPointer&lt;Object&gt; p = nodetexvoronoi.__dna__addressof(NodeTexVoronoi.__DNA__FIELD__base);
	 * CPointer&lt;NodeTexBase&gt; p_base = p.cast(new Class[]{NodeTexBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base'</li>
	 * <li>Signature: 'NodeTexBase'</li>
	 * <li>Actual Size (32bit/64bit): 956/960</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'dimensions'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexVoronoi nodetexvoronoi = ...;
	 * CPointer&lt;Object&gt; p = nodetexvoronoi.__dna__addressof(NodeTexVoronoi.__DNA__FIELD__dimensions);
	 * CPointer&lt;Integer&gt; p_dimensions = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dimensions'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dimensions = new long[]{956, 960};

	/**
	 * Field descriptor (offset) for struct member 'feature'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexVoronoi nodetexvoronoi = ...;
	 * CPointer&lt;Object&gt; p = nodetexvoronoi.__dna__addressof(NodeTexVoronoi.__DNA__FIELD__feature);
	 * CPointer&lt;Integer&gt; p_feature = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'feature'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__feature = new long[]{960, 964};

	/**
	 * Field descriptor (offset) for struct member 'distance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexVoronoi nodetexvoronoi = ...;
	 * CPointer&lt;Object&gt; p = nodetexvoronoi.__dna__addressof(NodeTexVoronoi.__DNA__FIELD__distance);
	 * CPointer&lt;Integer&gt; p_distance = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distance'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distance = new long[]{964, 968};

	/**
	 * Field descriptor (offset) for struct member 'coloring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexVoronoi nodetexvoronoi = ...;
	 * CPointer&lt;Object&gt; p = nodetexvoronoi.__dna__addressof(NodeTexVoronoi.__DNA__FIELD__coloring);
	 * CPointer&lt;Integer&gt; p_coloring = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coloring'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coloring = new long[]{968, 972};

	public NodeTexVoronoi(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeTexVoronoi(NodeTexVoronoi that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public NodeTexBase getBase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new NodeTexBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new NodeTexBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public void setBase(NodeTexBase base) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(base, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, base)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, base);
		} else {
			__io__generic__copy( getBase(), base);
		}
	}

	/**
	 * Get method for struct member 'dimensions'.
	 * @see #__DNA__FIELD__dimensions
	 */
	
	public int getDimensions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 960);
		} else {
			return __io__block.readInt(__io__address + 956);
		}
	}

	/**
	 * Set method for struct member 'dimensions'.
	 * @see #__DNA__FIELD__dimensions
	 */
	
	public void setDimensions(int dimensions) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 960, dimensions);
		} else {
			__io__block.writeInt(__io__address + 956, dimensions);
		}
	}

	/**
	 * Get method for struct member 'feature'.
	 * @see #__DNA__FIELD__feature
	 */
	
	public int getFeature() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 964);
		} else {
			return __io__block.readInt(__io__address + 960);
		}
	}

	/**
	 * Set method for struct member 'feature'.
	 * @see #__DNA__FIELD__feature
	 */
	
	public void setFeature(int feature) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 964, feature);
		} else {
			__io__block.writeInt(__io__address + 960, feature);
		}
	}

	/**
	 * Get method for struct member 'distance'.
	 * @see #__DNA__FIELD__distance
	 */
	
	public int getDistance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 968);
		} else {
			return __io__block.readInt(__io__address + 964);
		}
	}

	/**
	 * Set method for struct member 'distance'.
	 * @see #__DNA__FIELD__distance
	 */
	
	public void setDistance(int distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 968, distance);
		} else {
			__io__block.writeInt(__io__address + 964, distance);
		}
	}

	/**
	 * Get method for struct member 'coloring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__coloring
	 */
	
	public int getColoring() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 972);
		} else {
			return __io__block.readInt(__io__address + 968);
		}
	}

	/**
	 * Set method for struct member 'coloring'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__coloring
	 */
	
	public void setColoring(int coloring) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 972, coloring);
		} else {
			__io__block.writeInt(__io__address + 968, coloring);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeTexVoronoi> __io__addressof() {
		return new CPointer<NodeTexVoronoi>(__io__address, new Class[]{NodeTexVoronoi.class}, __io__block, __io__blockTable);
	}

}
