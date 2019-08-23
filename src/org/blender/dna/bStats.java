package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bStats'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  Assorted {@link Scene}  Data -------------------------------------<mdash/><mdash/>  Stats (show in Info header) </p>
 */

@CMetaData(size32=32, size64=32)
public class bStats extends CFacade {

	/**
	 * This is the sdna index of the struct bStats.
	 * <p>
	 * It is required when allocating a new block to store data for bStats.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 196;

	/**
	 * Field descriptor (offset) for struct member 'totobj'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scene totals for visible layers </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStats bstats = ...;
	 * CPointer&lt;Object&gt; p = bstats.__dna__addressof(bStats.__DNA__FIELD__totobj);
	 * CPointer&lt;Integer&gt; p_totobj = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totobj'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totobj = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'totlamp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStats bstats = ...;
	 * CPointer&lt;Object&gt; p = bstats.__dna__addressof(bStats.__DNA__FIELD__totlamp);
	 * CPointer&lt;Integer&gt; p_totlamp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totlamp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totlamp = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'totobjsel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStats bstats = ...;
	 * CPointer&lt;Object&gt; p = bstats.__dna__addressof(bStats.__DNA__FIELD__totobjsel);
	 * CPointer&lt;Integer&gt; p_totobjsel = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totobjsel'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totobjsel = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'totcurve'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStats bstats = ...;
	 * CPointer&lt;Object&gt; p = bstats.__dna__addressof(bStats.__DNA__FIELD__totcurve);
	 * CPointer&lt;Integer&gt; p_totcurve = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totcurve'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totcurve = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'totmesh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStats bstats = ...;
	 * CPointer&lt;Object&gt; p = bstats.__dna__addressof(bStats.__DNA__FIELD__totmesh);
	 * CPointer&lt;Integer&gt; p_totmesh = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totmesh'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totmesh = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'totarmature'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStats bstats = ...;
	 * CPointer&lt;Object&gt; p = bstats.__dna__addressof(bStats.__DNA__FIELD__totarmature);
	 * CPointer&lt;Integer&gt; p_totarmature = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totarmature'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totarmature = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'totvert'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStats bstats = ...;
	 * CPointer&lt;Object&gt; p = bstats.__dna__addressof(bStats.__DNA__FIELD__totvert);
	 * CPointer&lt;Integer&gt; p_totvert = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totvert'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totvert = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'totface'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bStats bstats = ...;
	 * CPointer&lt;Object&gt; p = bstats.__dna__addressof(bStats.__DNA__FIELD__totface);
	 * CPointer&lt;Integer&gt; p_totface = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totface'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totface = new long[]{28, 28};

	public bStats(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bStats(bStats that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'totobj'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scene totals for visible layers </p>
	 * @see #__DNA__FIELD__totobj
	 */
	
	public int getTotobj() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'totobj'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scene totals for visible layers </p>
	 * @see #__DNA__FIELD__totobj
	 */
	
	public void setTotobj(int totobj) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, totobj);
		} else {
			__io__block.writeInt(__io__address + 0, totobj);
		}
	}

	/**
	 * Get method for struct member 'totlamp'.
	 * @see #__DNA__FIELD__totlamp
	 */
	
	public int getTotlamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'totlamp'.
	 * @see #__DNA__FIELD__totlamp
	 */
	
	public void setTotlamp(int totlamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, totlamp);
		} else {
			__io__block.writeInt(__io__address + 4, totlamp);
		}
	}

	/**
	 * Get method for struct member 'totobjsel'.
	 * @see #__DNA__FIELD__totobjsel
	 */
	
	public int getTotobjsel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'totobjsel'.
	 * @see #__DNA__FIELD__totobjsel
	 */
	
	public void setTotobjsel(int totobjsel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, totobjsel);
		} else {
			__io__block.writeInt(__io__address + 8, totobjsel);
		}
	}

	/**
	 * Get method for struct member 'totcurve'.
	 * @see #__DNA__FIELD__totcurve
	 */
	
	public int getTotcurve() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'totcurve'.
	 * @see #__DNA__FIELD__totcurve
	 */
	
	public void setTotcurve(int totcurve) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, totcurve);
		} else {
			__io__block.writeInt(__io__address + 12, totcurve);
		}
	}

	/**
	 * Get method for struct member 'totmesh'.
	 * @see #__DNA__FIELD__totmesh
	 */
	
	public int getTotmesh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'totmesh'.
	 * @see #__DNA__FIELD__totmesh
	 */
	
	public void setTotmesh(int totmesh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, totmesh);
		} else {
			__io__block.writeInt(__io__address + 16, totmesh);
		}
	}

	/**
	 * Get method for struct member 'totarmature'.
	 * @see #__DNA__FIELD__totarmature
	 */
	
	public int getTotarmature() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'totarmature'.
	 * @see #__DNA__FIELD__totarmature
	 */
	
	public void setTotarmature(int totarmature) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, totarmature);
		} else {
			__io__block.writeInt(__io__address + 20, totarmature);
		}
	}

	/**
	 * Get method for struct member 'totvert'.
	 * @see #__DNA__FIELD__totvert
	 */
	
	public int getTotvert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'totvert'.
	 * @see #__DNA__FIELD__totvert
	 */
	
	public void setTotvert(int totvert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, totvert);
		} else {
			__io__block.writeInt(__io__address + 24, totvert);
		}
	}

	/**
	 * Get method for struct member 'totface'.
	 * @see #__DNA__FIELD__totface
	 */
	
	public int getTotface() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'totface'.
	 * @see #__DNA__FIELD__totface
	 */
	
	public void setTotface(int totface) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, totface);
		} else {
			__io__block.writeInt(__io__address + 28, totface);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bStats> __io__addressof() {
		return new CPointer<bStats>(__io__address, new Class[]{bStats.class}, __io__block, __io__blockTable);
	}

}
