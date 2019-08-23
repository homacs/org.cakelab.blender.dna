package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ChildParticle'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Child particles are created around or between parent particles </p>
 */

@CMetaData(size32=64, size64=64)
public class ChildParticle extends CFacade {

	/**
	 * This is the sdna index of the struct ChildParticle.
	 * <p>
	 * It is required when allocating a new block to store data for ChildParticle.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 476;

	/**
	 * Field descriptor (offset) for struct member 'num'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ChildParticle childparticle = ...;
	 * CPointer&lt;Object&gt; p = childparticle.__dna__addressof(ChildParticle.__DNA__FIELD__num);
	 * CPointer&lt;Integer&gt; p_num = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'num'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__num = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> num is face index on the final derived mesh </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ChildParticle childparticle = ...;
	 * CPointer&lt;Object&gt; p = childparticle.__dna__addressof(ChildParticle.__DNA__FIELD__parent);
	 * CPointer&lt;Integer&gt; p_parent = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'pa'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> nearest particles to the child, used for the interpolation </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ChildParticle childparticle = ...;
	 * CPointer&lt;Object&gt; p = childparticle.__dna__addressof(ChildParticle.__DNA__FIELD__pa);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_pa = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pa'</li>
	 * <li>Signature: 'int[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pa = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'w'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> interpolation weights for the above particles </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ChildParticle childparticle = ...;
	 * CPointer&lt;Object&gt; p = childparticle.__dna__addressof(ChildParticle.__DNA__FIELD__w);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_w = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'w'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__w = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'fuv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ChildParticle childparticle = ...;
	 * CPointer&lt;Object&gt; p = childparticle.__dna__addressof(ChildParticle.__DNA__FIELD__fuv);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_fuv = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fuv'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fuv = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'foffset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> face vertex weights and offset </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ChildParticle childparticle = ...;
	 * CPointer&lt;Object&gt; p = childparticle.__dna__addressof(ChildParticle.__DNA__FIELD__foffset);
	 * CPointer&lt;Float&gt; p_foffset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'foffset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__foffset = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'rt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ChildParticle childparticle = ...;
	 * CPointer&lt;Object&gt; p = childparticle.__dna__addressof(ChildParticle.__DNA__FIELD__rt);
	 * CPointer&lt;Float&gt; p_rt = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rt'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rt = new long[]{60, 60};

	public ChildParticle(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ChildParticle(ChildParticle that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'num'.
	 * @see #__DNA__FIELD__num
	 */
	
	public int getNum() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'num'.
	 * @see #__DNA__FIELD__num
	 */
	
	public void setNum(int num) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, num);
		} else {
			__io__block.writeInt(__io__address + 0, num);
		}
	}

	/**
	 * Get method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> num is face index on the final derived mesh </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public int getParent() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> num is face index on the final derived mesh </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public void setParent(int parent) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, parent);
		} else {
			__io__block.writeInt(__io__address + 4, parent);
		}
	}

	/**
	 * Get method for struct member 'pa'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> nearest particles to the child, used for the interpolation </p>
	 * @see #__DNA__FIELD__pa
	 */
	
	public CArrayFacade<Integer> getPa() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pa'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> nearest particles to the child, used for the interpolation </p>
	 * @see #__DNA__FIELD__pa
	 */
	
	public void setPa(CArrayFacade<Integer> pa) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(pa, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pa)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pa);
		} else {
			__io__generic__copy( getPa(), pa);
		}
	}

	/**
	 * Get method for struct member 'w'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> interpolation weights for the above particles </p>
	 * @see #__DNA__FIELD__w
	 */
	
	public CArrayFacade<Float> getW() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'w'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> interpolation weights for the above particles </p>
	 * @see #__DNA__FIELD__w
	 */
	
	public void setW(CArrayFacade<Float> w) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(w, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, w)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, w);
		} else {
			__io__generic__copy( getW(), w);
		}
	}

	/**
	 * Get method for struct member 'fuv'.
	 * @see #__DNA__FIELD__fuv
	 */
	
	public CArrayFacade<Float> getFuv() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fuv'.
	 * @see #__DNA__FIELD__fuv
	 */
	
	public void setFuv(CArrayFacade<Float> fuv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(fuv, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fuv)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fuv);
		} else {
			__io__generic__copy( getFuv(), fuv);
		}
	}

	/**
	 * Get method for struct member 'foffset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> face vertex weights and offset </p>
	 * @see #__DNA__FIELD__foffset
	 */
	
	public float getFoffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'foffset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> face vertex weights and offset </p>
	 * @see #__DNA__FIELD__foffset
	 */
	
	public void setFoffset(float foffset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, foffset);
		} else {
			__io__block.writeFloat(__io__address + 56, foffset);
		}
	}

	/**
	 * Get method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public float getRt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public void setRt(float rt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, rt);
		} else {
			__io__block.writeFloat(__io__address + 60, rt);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ChildParticle> __io__addressof() {
		return new CPointer<ChildParticle>(__io__address, new Class[]{ChildParticle.class}, __io__block, __io__blockTable);
	}

}
