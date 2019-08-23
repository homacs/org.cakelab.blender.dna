package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MaskSplinePoint'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=264, size64=272)
public class MaskSplinePoint extends CFacade {

	/**
	 * This is the sdna index of the struct MaskSplinePoint.
	 * <p>
	 * It is required when allocating a new block to store data for MaskSplinePoint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 568;

	/**
	 * Field descriptor (offset) for struct member 'bezt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> actual point coordinates and it's handles </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSplinePoint masksplinepoint = ...;
	 * CPointer&lt;Object&gt; p = masksplinepoint.__dna__addressof(MaskSplinePoint.__DNA__FIELD__bezt);
	 * CPointer&lt;BezTriple&gt; p_bezt = p.cast(new Class[]{BezTriple.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bezt'</li>
	 * <li>Signature: 'BezTriple'</li>
	 * <li>Actual Size (32bit/64bit): 72/72</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bezt = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSplinePoint masksplinepoint = ...;
	 * CPointer&lt;Object&gt; p = masksplinepoint.__dna__addressof(MaskSplinePoint.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'tot_uw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of uv feather values </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSplinePoint masksplinepoint = ...;
	 * CPointer&lt;Object&gt; p = masksplinepoint.__dna__addressof(MaskSplinePoint.__DNA__FIELD__tot_uw);
	 * CPointer&lt;Integer&gt; p_tot_uw = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_uw'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_uw = new long[]{76, 76};

	/**
	 * Field descriptor (offset) for struct member 'uw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> feather UV values </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSplinePoint masksplinepoint = ...;
	 * CPointer&lt;Object&gt; p = masksplinepoint.__dna__addressof(MaskSplinePoint.__DNA__FIELD__uw);
	 * CPointer&lt;CPointer&lt;MaskSplinePointUW&gt;&gt; p_uw = p.cast(new Class[]{CPointer.class, MaskSplinePointUW.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uw'</li>
	 * <li>Signature: 'MaskSplinePointUW*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uw = new long[]{80, 80};

	/**
	 * Field descriptor (offset) for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> parenting information of particular spline point </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskSplinePoint masksplinepoint = ...;
	 * CPointer&lt;Object&gt; p = masksplinepoint.__dna__addressof(MaskSplinePoint.__DNA__FIELD__parent);
	 * CPointer&lt;MaskParent&gt; p_parent = p.cast(new Class[]{MaskParent.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent'</li>
	 * <li>Signature: 'MaskParent'</li>
	 * <li>Actual Size (32bit/64bit): 180/184</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent = new long[]{84, 88};

	public MaskSplinePoint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MaskSplinePoint(MaskSplinePoint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'bezt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> actual point coordinates and it's handles </p>
	 * @see #__DNA__FIELD__bezt
	 */
	
	public BezTriple getBezt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new BezTriple(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new BezTriple(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bezt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> actual point coordinates and it's handles </p>
	 * @see #__DNA__FIELD__bezt
	 */
	
	public void setBezt(BezTriple bezt) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(bezt, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bezt)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bezt);
		} else {
			__io__generic__copy( getBezt(), bezt);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 72);
		} else {
			return __io__block.readInt(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 72, pad);
		} else {
			__io__block.writeInt(__io__address + 72, pad);
		}
	}

	/**
	 * Get method for struct member 'tot_uw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of uv feather values </p>
	 * @see #__DNA__FIELD__tot_uw
	 */
	
	public int getTot_uw() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 76);
		} else {
			return __io__block.readInt(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'tot_uw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of uv feather values </p>
	 * @see #__DNA__FIELD__tot_uw
	 */
	
	public void setTot_uw(int tot_uw) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 76, tot_uw);
		} else {
			__io__block.writeInt(__io__address + 76, tot_uw);
		}
	}

	/**
	 * Get method for struct member 'uw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> feather UV values </p>
	 * @see #__DNA__FIELD__uw
	 */
	
	public CPointer<MaskSplinePointUW> getUw() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MaskSplinePointUW.class};
		return new CPointer<MaskSplinePointUW>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MaskSplinePointUW.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'uw'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> feather UV values </p>
	 * @see #__DNA__FIELD__uw
	 */
	
	public void setUw(CPointer<MaskSplinePointUW> uw) throws IOException
	{
		long __address = ((uw == null) ? 0 : uw.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 80, __address);
		}
	}

	/**
	 * Get method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> parenting information of particular spline point </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public MaskParent getParent() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MaskParent(__io__address + 88, __io__block, __io__blockTable);
		} else {
			return new MaskParent(__io__address + 84, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> parenting information of particular spline point </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public void setParent(MaskParent parent) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 84;
		}
		if (__io__equals(parent, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, parent)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, parent);
		} else {
			__io__generic__copy( getParent(), parent);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MaskSplinePoint> __io__addressof() {
		return new CPointer<MaskSplinePoint>(__io__address, new Class[]{MaskSplinePoint.class}, __io__block, __io__blockTable);
	}

}
