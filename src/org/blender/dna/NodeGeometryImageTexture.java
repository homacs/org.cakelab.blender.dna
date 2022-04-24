package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryImageTexture'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class NodeGeometryImageTexture extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryImageTexture.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryImageTexture.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 547;

	/**
	 * Field descriptor (offset) for struct member 'interpolation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryImageTexture nodegeometryimagetexture = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryimagetexture.__dna__addressof(NodeGeometryImageTexture.__DNA__FIELD__interpolation);
	 * CPointer&lt;Integer&gt; p_interpolation = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interpolation'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interpolation = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'extension'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryImageTexture nodegeometryimagetexture = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryimagetexture.__dna__addressof(NodeGeometryImageTexture.__DNA__FIELD__extension);
	 * CPointer&lt;Integer&gt; p_extension = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'extension'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__extension = new long[]{4, 4};

	public NodeGeometryImageTexture(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryImageTexture(NodeGeometryImageTexture that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'interpolation'.
	 * @see #__DNA__FIELD__interpolation
	 */
	
	public int getInterpolation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'interpolation'.
	 * @see #__DNA__FIELD__interpolation
	 */
	
	public void setInterpolation(int interpolation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, interpolation);
		} else {
			__io__block.writeInt(__io__address + 0, interpolation);
		}
	}

	/**
	 * Get method for struct member 'extension'.
	 * @see #__DNA__FIELD__extension
	 */
	
	public int getExtension() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'extension'.
	 * @see #__DNA__FIELD__extension
	 */
	
	public void setExtension(int extension) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, extension);
		} else {
			__io__block.writeInt(__io__address + 4, extension);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryImageTexture> __io__addressof() {
		return new CPointer<NodeGeometryImageTexture>(__io__address, new Class[]{NodeGeometryImageTexture.class}, __io__block, __io__blockTable);
	}

}
