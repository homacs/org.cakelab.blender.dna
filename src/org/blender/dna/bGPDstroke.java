package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPDstroke'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=32, size64=48)
public class bGPDstroke extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDstroke.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDstroke.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 456;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bGPDstroke&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bGPDstroke.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bGPDstroke*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bGPDstroke&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bGPDstroke.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bGPDstroke*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'points'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__points);
	 * CPointer&lt;CPointer&lt;bGPDspoint&gt;&gt; p_points = p.cast(new Class[]{CPointer.class, bGPDspoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'points'</li>
	 * <li>Signature: 'bGPDspoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__points = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__pad);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_pad = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'totpoints'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__totpoints);
	 * CPointer&lt;Integer&gt; p_totpoints = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpoints'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpoints = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'thickness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__thickness);
	 * CPointer&lt;Short&gt; p_thickness = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness = new long[]{20, 36};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{22, 38};

	/**
	 * Field descriptor (offset) for struct member 'inittime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__inittime);
	 * CPointer&lt;Double&gt; p_inittime = p.cast(new Class[]{Double.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inittime'</li>
	 * <li>Signature: 'double'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inittime = new long[]{24, 40};

	public bGPDstroke(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPDstroke(bGPDstroke that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bGPDstroke> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDstroke.class};
		return new CPointer<bGPDstroke>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDstroke.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bGPDstroke> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<bGPDstroke> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDstroke.class};
		return new CPointer<bGPDstroke>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDstroke.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bGPDstroke> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'points'.
	 * @see #__DNA__FIELD__points
	 */
	
	public CPointer<bGPDspoint> getPoints() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDspoint.class};
		return new CPointer<bGPDspoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDspoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'points'.
	 * @see #__DNA__FIELD__points
	 */
	
	public void setPoints(CPointer<bGPDspoint> points) throws IOException
	{
		long __address = ((points == null) ? 0 : points.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CPointer<Object> getPad() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CPointer<Object> pad) throws IOException
	{
		long __address = ((pad == null) ? 0 : pad.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'totpoints'.
	 * @see #__DNA__FIELD__totpoints
	 */
	
	public int getTotpoints() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'totpoints'.
	 * @see #__DNA__FIELD__totpoints
	 */
	
	public void setTotpoints(int totpoints) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, totpoints);
		} else {
			__io__block.writeInt(__io__address + 16, totpoints);
		}
	}

	/**
	 * Get method for struct member 'thickness'.
	 * @see #__DNA__FIELD__thickness
	 */
	
	public short getThickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 36);
		} else {
			return __io__block.readShort(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'thickness'.
	 * @see #__DNA__FIELD__thickness
	 */
	
	public void setThickness(short thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 36, thickness);
		} else {
			__io__block.writeShort(__io__address + 20, thickness);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 38);
		} else {
			return __io__block.readShort(__io__address + 22);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 38, flag);
		} else {
			__io__block.writeShort(__io__address + 22, flag);
		}
	}

	/**
	 * Get method for struct member 'inittime'.
	 * @see #__DNA__FIELD__inittime
	 */
	
	public double getInittime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readDouble(__io__address + 40);
		} else {
			return __io__block.readDouble(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'inittime'.
	 * @see #__DNA__FIELD__inittime
	 */
	
	public void setInittime(double inittime) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeDouble(__io__address + 40, inittime);
		} else {
			__io__block.writeDouble(__io__address + 24, inittime);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPDstroke> __io__addressof() {
		return new CPointer<bGPDstroke>(__io__address, new Class[]{bGPDstroke.class}, __io__block, __io__blockTable);
	}

}
