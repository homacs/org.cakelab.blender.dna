package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'HairMapping'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p>{@link Hair}  attachment to a mesh. TODO: attach to tessellated triangles or polygons? TODO: what type of interpolation to use for uv? </p>
 */

@CMetaData(size32=12, size64=12)
public class HairMapping extends CFacade {

	/**
	 * This is the sdna index of the struct HairMapping.
	 * <p>
	 * It is required when allocating a new block to store data for HairMapping.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 790;

	/**
	 * Field descriptor (offset) for struct member 'uv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HairMapping hairmapping = ...;
	 * CPointer&lt;Object&gt; p = hairmapping.__dna__addressof(HairMapping.__DNA__FIELD__uv);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_uv = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'poly'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * HairMapping hairmapping = ...;
	 * CPointer&lt;Object&gt; p = hairmapping.__dna__addressof(HairMapping.__DNA__FIELD__poly);
	 * CPointer&lt;Integer&gt; p_poly = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'poly'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__poly = new long[]{8, 8};

	public HairMapping(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected HairMapping(HairMapping that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'uv'.
	 * @see #__DNA__FIELD__uv
	 */
	
	public CArrayFacade<Float> getUv() throws IOException
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
	 * Set method for struct member 'uv'.
	 * @see #__DNA__FIELD__uv
	 */
	
	public void setUv(CArrayFacade<Float> uv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(uv, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uv)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uv);
		} else {
			__io__generic__copy( getUv(), uv);
		}
	}

	/**
	 * Get method for struct member 'poly'.
	 * @see #__DNA__FIELD__poly
	 */
	
	public int getPoly() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'poly'.
	 * @see #__DNA__FIELD__poly
	 */
	
	public void setPoly(int poly) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, poly);
		} else {
			__io__block.writeInt(__io__address + 8, poly);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<HairMapping> __io__addressof() {
		return new CPointer<HairMapping>(__io__address, new Class[]{HairMapping.class}, __io__block, __io__blockTable);
	}

}
