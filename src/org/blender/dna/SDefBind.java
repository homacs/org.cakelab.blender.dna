package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SDefBind'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=24, size64=32)
public class SDefBind extends CFacade {

	/**
	 * This is the sdna index of the struct SDefBind.
	 * <p>
	 * It is required when allocating a new block to store data for SDefBind.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 151;

	/**
	 * Field descriptor (offset) for struct member 'vert_inds'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SDefBind sdefbind = ...;
	 * CPointer&lt;Object&gt; p = sdefbind.__dna__addressof(SDefBind.__DNA__FIELD__vert_inds);
	 * CPointer&lt;CPointer&lt;Integer&gt;&gt; p_vert_inds = p.cast(new Class[]{CPointer.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vert_inds'</li>
	 * <li>Signature: 'int*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vert_inds = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'numverts'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SDefBind sdefbind = ...;
	 * CPointer&lt;Object&gt; p = sdefbind.__dna__addressof(SDefBind.__DNA__FIELD__numverts);
	 * CPointer&lt;Integer&gt; p_numverts = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'numverts'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__numverts = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SDefBind sdefbind = ...;
	 * CPointer&lt;Object&gt; p = sdefbind.__dna__addressof(SDefBind.__DNA__FIELD__mode);
	 * CPointer&lt;Integer&gt; p_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'vert_weights'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SDefBind sdefbind = ...;
	 * CPointer&lt;Object&gt; p = sdefbind.__dna__addressof(SDefBind.__DNA__FIELD__vert_weights);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_vert_weights = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vert_weights'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vert_weights = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'normal_dist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SDefBind sdefbind = ...;
	 * CPointer&lt;Object&gt; p = sdefbind.__dna__addressof(SDefBind.__DNA__FIELD__normal_dist);
	 * CPointer&lt;Float&gt; p_normal_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'normal_dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__normal_dist = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'influence'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SDefBind sdefbind = ...;
	 * CPointer&lt;Object&gt; p = sdefbind.__dna__addressof(SDefBind.__DNA__FIELD__influence);
	 * CPointer&lt;Float&gt; p_influence = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'influence'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__influence = new long[]{20, 28};

	public SDefBind(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SDefBind(SDefBind that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'vert_inds'.
	 * @see #__DNA__FIELD__vert_inds
	 */
	
	public CPointer<Integer> getVert_inds() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		return new CPointer<Integer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'vert_inds'.
	 * @see #__DNA__FIELD__vert_inds
	 */
	
	public void setVert_inds(CPointer<Integer> vert_inds) throws IOException
	{
		long __address = ((vert_inds == null) ? 0 : vert_inds.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'numverts'.
	 * @see #__DNA__FIELD__numverts
	 */
	
	public int getNumverts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'numverts'.
	 * @see #__DNA__FIELD__numverts
	 */
	
	public void setNumverts(int numverts) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, numverts);
		} else {
			__io__block.writeInt(__io__address + 4, numverts);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public int getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(int mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, mode);
		} else {
			__io__block.writeInt(__io__address + 8, mode);
		}
	}

	/**
	 * Get method for struct member 'vert_weights'.
	 * @see #__DNA__FIELD__vert_weights
	 */
	
	public CPointer<Float> getVert_weights() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'vert_weights'.
	 * @see #__DNA__FIELD__vert_weights
	 */
	
	public void setVert_weights(CPointer<Float> vert_weights) throws IOException
	{
		long __address = ((vert_weights == null) ? 0 : vert_weights.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'normal_dist'.
	 * @see #__DNA__FIELD__normal_dist
	 */
	
	public float getNormal_dist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'normal_dist'.
	 * @see #__DNA__FIELD__normal_dist
	 */
	
	public void setNormal_dist(float normal_dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, normal_dist);
		} else {
			__io__block.writeFloat(__io__address + 16, normal_dist);
		}
	}

	/**
	 * Get method for struct member 'influence'.
	 * @see #__DNA__FIELD__influence
	 */
	
	public float getInfluence() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'influence'.
	 * @see #__DNA__FIELD__influence
	 */
	
	public void setInfluence(float influence) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, influence);
		} else {
			__io__block.writeFloat(__io__address + 20, influence);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SDefBind> __io__addressof() {
		return new CPointer<SDefBind>(__io__address, new Class[]{SDefBind.class}, __io__block, __io__blockTable);
	}

}
