package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'TriangulateModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Triangulate modifier </p>
 */

@CMetaData(size32=116, size64=136)
public class TriangulateModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct TriangulateModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for TriangulateModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 141;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TriangulateModifierData triangulatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = triangulatemodifierdata.__dna__addressof(TriangulateModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TriangulateModifierData triangulatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = triangulatemodifierdata.__dna__addressof(TriangulateModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'quad_method'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TriangulateModifierData triangulatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = triangulatemodifierdata.__dna__addressof(TriangulateModifierData.__DNA__FIELD__quad_method);
	 * CPointer&lt;Integer&gt; p_quad_method = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'quad_method'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__quad_method = new long[]{104, 124};

	/**
	 * Field descriptor (offset) for struct member 'ngon_method'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TriangulateModifierData triangulatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = triangulatemodifierdata.__dna__addressof(TriangulateModifierData.__DNA__FIELD__ngon_method);
	 * CPointer&lt;Integer&gt; p_ngon_method = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ngon_method'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ngon_method = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'min_vertices'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * TriangulateModifierData triangulatemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = triangulatemodifierdata.__dna__addressof(TriangulateModifierData.__DNA__FIELD__min_vertices);
	 * CPointer&lt;Integer&gt; p_min_vertices = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min_vertices'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min_vertices = new long[]{112, 132};

	public TriangulateModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected TriangulateModifierData(TriangulateModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public ModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(ModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 120);
		} else {
			return __io__block.readInt(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 120, flag);
		} else {
			__io__block.writeInt(__io__address + 100, flag);
		}
	}

	/**
	 * Get method for struct member 'quad_method'.
	 * @see #__DNA__FIELD__quad_method
	 */
	
	public int getQuad_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 124);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'quad_method'.
	 * @see #__DNA__FIELD__quad_method
	 */
	
	public void setQuad_method(int quad_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 124, quad_method);
		} else {
			__io__block.writeInt(__io__address + 104, quad_method);
		}
	}

	/**
	 * Get method for struct member 'ngon_method'.
	 * @see #__DNA__FIELD__ngon_method
	 */
	
	public int getNgon_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 128);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'ngon_method'.
	 * @see #__DNA__FIELD__ngon_method
	 */
	
	public void setNgon_method(int ngon_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 128, ngon_method);
		} else {
			__io__block.writeInt(__io__address + 108, ngon_method);
		}
	}

	/**
	 * Get method for struct member 'min_vertices'.
	 * @see #__DNA__FIELD__min_vertices
	 */
	
	public int getMin_vertices() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 132);
		} else {
			return __io__block.readInt(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'min_vertices'.
	 * @see #__DNA__FIELD__min_vertices
	 */
	
	public void setMin_vertices(int min_vertices) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 132, min_vertices);
		} else {
			__io__block.writeInt(__io__address + 112, min_vertices);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<TriangulateModifierData> __io__addressof() {
		return new CPointer<TriangulateModifierData>(__io__address, new Class[]{TriangulateModifierData.class}, __io__block, __io__blockTable);
	}

}
