package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'DashGpencilModifierSegment'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=92, size64=96)
public class DashGpencilModifierSegment extends CFacade {

	/**
	 * This is the sdna index of the struct DashGpencilModifierSegment.
	 * <p>
	 * It is required when allocating a new block to store data for DashGpencilModifierSegment.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 602;

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Name of the dash segment
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DashGpencilModifierSegment dashgpencilmodifiersegment = ...;
	 * CPointer&lt;Object&gt; p = dashgpencilmodifiersegment.__dna__addressof(DashGpencilModifierSegment.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'dmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For path reference. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DashGpencilModifierSegment dashgpencilmodifiersegment = ...;
	 * CPointer&lt;Object&gt; p = dashgpencilmodifiersegment.__dna__addressof(DashGpencilModifierSegment.__DNA__FIELD__dmd);
	 * CPointer&lt;CPointer&lt;DashGpencilModifierData&gt;&gt; p_dmd = p.cast(new Class[]{CPointer.class, DashGpencilModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dmd'</li>
	 * <li>Signature: 'DashGpencilModifierData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dmd = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'dash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The number of consecutive points from the original stroke to include in this segment
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DashGpencilModifierSegment dashgpencilmodifiersegment = ...;
	 * CPointer&lt;Object&gt; p = dashgpencilmodifiersegment.__dna__addressof(DashGpencilModifierSegment.__DNA__FIELD__dash);
	 * CPointer&lt;Integer&gt; p_dash = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dash'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dash = new long[]{68, 72};

	/**
	 * Field descriptor (offset) for struct member 'gap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The number of points skipped after this segment
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DashGpencilModifierSegment dashgpencilmodifiersegment = ...;
	 * CPointer&lt;Object&gt; p = dashgpencilmodifiersegment.__dna__addressof(DashGpencilModifierSegment.__DNA__FIELD__gap);
	 * CPointer&lt;Integer&gt; p_gap = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gap'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gap = new long[]{72, 76};

	/**
	 * Field descriptor (offset) for struct member 'radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The factor to apply to the original point's radius for the new points
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DashGpencilModifierSegment dashgpencilmodifiersegment = ...;
	 * CPointer&lt;Object&gt; p = dashgpencilmodifiersegment.__dna__addressof(DashGpencilModifierSegment.__DNA__FIELD__radius);
	 * CPointer&lt;Float&gt; p_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__radius = new long[]{76, 80};

	/**
	 * Field descriptor (offset) for struct member 'opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The factor to apply to the original point's opacity for the new points
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DashGpencilModifierSegment dashgpencilmodifiersegment = ...;
	 * CPointer&lt;Object&gt; p = dashgpencilmodifiersegment.__dna__addressof(DashGpencilModifierSegment.__DNA__FIELD__opacity);
	 * CPointer&lt;Float&gt; p_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__opacity = new long[]{80, 84};

	/**
	 * Field descriptor (offset) for struct member 'mat_nr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DashGpencilModifierSegment dashgpencilmodifiersegment = ...;
	 * CPointer&lt;Object&gt; p = dashgpencilmodifiersegment.__dna__addressof(DashGpencilModifierSegment.__DNA__FIELD__mat_nr);
	 * CPointer&lt;Integer&gt; p_mat_nr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat_nr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat_nr = new long[]{84, 88};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DashGpencilModifierSegment dashgpencilmodifiersegment = ...;
	 * CPointer&lt;Object&gt; p = dashgpencilmodifiersegment.__dna__addressof(DashGpencilModifierSegment.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{88, 92};

	public DashGpencilModifierSegment(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected DashGpencilModifierSegment(DashGpencilModifierSegment that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Name of the dash segment
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * Name of the dash segment
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'dmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For path reference. </p>
	 * @see #__DNA__FIELD__dmd
	 */
	
	public CPointer<DashGpencilModifierData> getDmd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		}
		Class<?>[] __dna__targetTypes = new Class[]{DashGpencilModifierData.class};
		return new CPointer<DashGpencilModifierData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, DashGpencilModifierData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> For path reference. </p>
	 * @see #__DNA__FIELD__dmd
	 */
	
	public void setDmd(CPointer<DashGpencilModifierData> dmd) throws IOException
	{
		long __address = ((dmd == null) ? 0 : dmd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 64, __address);
		}
	}

	/**
	 * Get method for struct member 'dash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The number of consecutive points from the original stroke to include in this segment
	 * @see #__DNA__FIELD__dash
	 */
	
	public int getDash() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 72);
		} else {
			return __io__block.readInt(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'dash'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The number of consecutive points from the original stroke to include in this segment
	 * @see #__DNA__FIELD__dash
	 */
	
	public void setDash(int dash) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 72, dash);
		} else {
			__io__block.writeInt(__io__address + 68, dash);
		}
	}

	/**
	 * Get method for struct member 'gap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The number of points skipped after this segment
	 * @see #__DNA__FIELD__gap
	 */
	
	public int getGap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 76);
		} else {
			return __io__block.readInt(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'gap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The number of points skipped after this segment
	 * @see #__DNA__FIELD__gap
	 */
	
	public void setGap(int gap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 76, gap);
		} else {
			__io__block.writeInt(__io__address + 72, gap);
		}
	}

	/**
	 * Get method for struct member 'radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The factor to apply to the original point's radius for the new points
	 * @see #__DNA__FIELD__radius
	 */
	
	public float getRadius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The factor to apply to the original point's radius for the new points
	 * @see #__DNA__FIELD__radius
	 */
	
	public void setRadius(float radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, radius);
		} else {
			__io__block.writeFloat(__io__address + 76, radius);
		}
	}

	/**
	 * Get method for struct member 'opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The factor to apply to the original point's opacity for the new points
	 * @see #__DNA__FIELD__opacity
	 */
	
	public float getOpacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'opacity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API</h4>
	 * The factor to apply to the original point's opacity for the new points
	 * @see #__DNA__FIELD__opacity
	 */
	
	public void setOpacity(float opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, opacity);
		} else {
			__io__block.writeFloat(__io__address + 80, opacity);
		}
	}

	/**
	 * Get method for struct member 'mat_nr'.
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public int getMat_nr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 88);
		} else {
			return __io__block.readInt(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'mat_nr'.
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public void setMat_nr(int mat_nr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 88, mat_nr);
		} else {
			__io__block.writeInt(__io__address + 84, mat_nr);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 92);
		} else {
			return __io__block.readInt(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 92, flag);
		} else {
			__io__block.writeInt(__io__address + 88, flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<DashGpencilModifierSegment> __io__addressof() {
		return new CPointer<DashGpencilModifierSegment>(__io__address, new Class[]{DashGpencilModifierSegment.class}, __io__block, __io__blockTable);
	}

}
