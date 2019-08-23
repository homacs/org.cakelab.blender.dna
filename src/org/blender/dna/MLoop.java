package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MLoop'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Java .Blend:</h4>
 * A loop element defined by a vertex and an edge. A loop is a face of the 3D object in Blender. A full loop (face) is defined by a set of loop entries, where each entry references a vertex and the adjacent edge in clock order. Thus, for each loop entry the system knows which side is front facing<h4>Blender Source Code:</h4>
 * <p> the e here is because we want to move away from relying on edge hashes. </p>
 */

@CMetaData(size32=8, size64=8)
public class MLoop extends CFacade {

	/**
	 * This is the sdna index of the struct MLoop.
	 * <p>
	 * It is required when allocating a new block to store data for MLoop.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 72;

	/**
	 * Field descriptor (offset) for struct member 'v'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Associated vertex (index in vertex array).<h4>Blender Source Code:</h4>
	 * <p> Vertex index. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MLoop mloop = ...;
	 * CPointer&lt;Object&gt; p = mloop.__dna__addressof(MLoop.__DNA__FIELD__v);
	 * CPointer&lt;Integer&gt; p_v = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'e'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Associated edge (index in edge array).<h4>Blender Source Code:</h4>
	 * <p> Edge index. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MLoop mloop = ...;
	 * CPointer&lt;Object&gt; p = mloop.__dna__addressof(MLoop.__DNA__FIELD__e);
	 * CPointer&lt;Integer&gt; p_e = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'e'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__e = new long[]{4, 4};

	public MLoop(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MLoop(MLoop that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'v'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Associated vertex (index in vertex array).<h4>Blender Source Code:</h4>
	 * <p> Vertex index. </p>
	 * @see #__DNA__FIELD__v
	 */
	
	public int getV() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'v'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Associated vertex (index in vertex array).<h4>Blender Source Code:</h4>
	 * <p> Vertex index. </p>
	 * @see #__DNA__FIELD__v
	 */
	
	public void setV(int v) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, v);
		} else {
			__io__block.writeInt(__io__address + 0, v);
		}
	}

	/**
	 * Get method for struct member 'e'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Associated edge (index in edge array).<h4>Blender Source Code:</h4>
	 * <p> Edge index. </p>
	 * @see #__DNA__FIELD__e
	 */
	
	public int getE() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'e'.
	 * <h3>Field Documentation</h3>
	 * <h4>Java .Blend:</h4>
	 * Associated edge (index in edge array).<h4>Blender Source Code:</h4>
	 * <p> Edge index. </p>
	 * @see #__DNA__FIELD__e
	 */
	
	public void setE(int e) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, e);
		} else {
			__io__block.writeInt(__io__address + 4, e);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MLoop> __io__addressof() {
		return new CPointer<MLoop>(__io__address, new Class[]{MLoop.class}, __io__block, __io__blockTable);
	}

}
