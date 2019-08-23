package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPDlayer'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=212, size64=232)
public class bGPDlayer extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDlayer.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDlayer.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 481;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bGPDlayer&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bGPDlayer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bGPDlayer*'</li>
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
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bGPDlayer&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bGPDlayer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bGPDlayer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'frames'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__frames);
	 * CPointer&lt;ListBase&gt; p_frames = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frames'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frames = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'actframe'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__actframe);
	 * CPointer&lt;CPointer&lt;bGPDframe&gt;&gt; p_actframe = p.cast(new Class[]{CPointer.class, bGPDframe.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actframe'</li>
	 * <li>Signature: 'bGPDframe*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actframe = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'thickness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__thickness);
	 * CPointer&lt;Short&gt; p_thickness = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness = new long[]{22, 42};

	/**
	 * Field descriptor (offset) for struct member 'gstep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__gstep);
	 * CPointer&lt;Short&gt; p_gstep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gstep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gstep = new long[]{24, 44};

	/**
	 * Field descriptor (offset) for struct member 'gstep_next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__gstep_next);
	 * CPointer&lt;Short&gt; p_gstep_next = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gstep_next'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gstep_next = new long[]{26, 46};

	/**
	 * Field descriptor (offset) for struct member 'gcolor_prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__gcolor_prev);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gcolor_prev = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gcolor_prev'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gcolor_prev = new long[]{28, 48};

	/**
	 * Field descriptor (offset) for struct member 'gcolor_next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__gcolor_next);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gcolor_next = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gcolor_next'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gcolor_next = new long[]{40, 60};

	/**
	 * Field descriptor (offset) for struct member 'color'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color = new long[]{52, 72};

	/**
	 * Field descriptor (offset) for struct member 'fill'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__fill);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_fill = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fill'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fill = new long[]{68, 88};

	/**
	 * Field descriptor (offset) for struct member 'info'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDlayer bgpdlayer = ...;
	 * CPointer&lt;Object&gt; p = bgpdlayer.__dna__addressof(bGPDlayer.__DNA__FIELD__info);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_info = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'info'</li>
	 * <li>Signature: 'char[128]'</li>
	 * <li>Actual Size (32bit/64bit): 128/128</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__info = new long[]{84, 104};

	public bGPDlayer(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPDlayer(bGPDlayer that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bGPDlayer> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDlayer.class};
		return new CPointer<bGPDlayer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDlayer.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bGPDlayer> next) throws IOException
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
	
	public CPointer<bGPDlayer> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDlayer.class};
		return new CPointer<bGPDlayer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDlayer.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bGPDlayer> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'frames'.
	 * @see #__DNA__FIELD__frames
	 */
	
	public ListBase getFrames() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'frames'.
	 * @see #__DNA__FIELD__frames
	 */
	
	public void setFrames(ListBase frames) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(frames, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, frames)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, frames);
		} else {
			__io__generic__copy( getFrames(), frames);
		}
	}

	/**
	 * Get method for struct member 'actframe'.
	 * @see #__DNA__FIELD__actframe
	 */
	
	public CPointer<bGPDframe> getActframe() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDframe.class};
		return new CPointer<bGPDframe>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDframe.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'actframe'.
	 * @see #__DNA__FIELD__actframe
	 */
	
	public void setActframe(CPointer<bGPDframe> actframe) throws IOException
	{
		long __address = ((actframe == null) ? 0 : actframe.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 40);
		} else {
			return __io__block.readShort(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 40, flag);
		} else {
			__io__block.writeShort(__io__address + 20, flag);
		}
	}

	/**
	 * Get method for struct member 'thickness'.
	 * @see #__DNA__FIELD__thickness
	 */
	
	public short getThickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 42);
		} else {
			return __io__block.readShort(__io__address + 22);
		}
	}

	/**
	 * Set method for struct member 'thickness'.
	 * @see #__DNA__FIELD__thickness
	 */
	
	public void setThickness(short thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 42, thickness);
		} else {
			__io__block.writeShort(__io__address + 22, thickness);
		}
	}

	/**
	 * Get method for struct member 'gstep'.
	 * @see #__DNA__FIELD__gstep
	 */
	
	public short getGstep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 44);
		} else {
			return __io__block.readShort(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'gstep'.
	 * @see #__DNA__FIELD__gstep
	 */
	
	public void setGstep(short gstep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 44, gstep);
		} else {
			__io__block.writeShort(__io__address + 24, gstep);
		}
	}

	/**
	 * Get method for struct member 'gstep_next'.
	 * @see #__DNA__FIELD__gstep_next
	 */
	
	public short getGstep_next() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 46);
		} else {
			return __io__block.readShort(__io__address + 26);
		}
	}

	/**
	 * Set method for struct member 'gstep_next'.
	 * @see #__DNA__FIELD__gstep_next
	 */
	
	public void setGstep_next(short gstep_next) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 46, gstep_next);
		} else {
			__io__block.writeShort(__io__address + 26, gstep_next);
		}
	}

	/**
	 * Get method for struct member 'gcolor_prev'.
	 * @see #__DNA__FIELD__gcolor_prev
	 */
	
	public CArrayFacade<Float> getGcolor_prev() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gcolor_prev'.
	 * @see #__DNA__FIELD__gcolor_prev
	 */
	
	public void setGcolor_prev(CArrayFacade<Float> gcolor_prev) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(gcolor_prev, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gcolor_prev)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gcolor_prev);
		} else {
			__io__generic__copy( getGcolor_prev(), gcolor_prev);
		}
	}

	/**
	 * Get method for struct member 'gcolor_next'.
	 * @see #__DNA__FIELD__gcolor_next
	 */
	
	public CArrayFacade<Float> getGcolor_next() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gcolor_next'.
	 * @see #__DNA__FIELD__gcolor_next
	 */
	
	public void setGcolor_next(CArrayFacade<Float> gcolor_next) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 60;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(gcolor_next, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gcolor_next)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gcolor_next);
		} else {
			__io__generic__copy( getGcolor_next(), gcolor_next);
		}
	}

	/**
	 * Get method for struct member 'color'.
	 * @see #__DNA__FIELD__color
	 */
	
	public CArrayFacade<Float> getColor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 52, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'color'.
	 * @see #__DNA__FIELD__color
	 */
	
	public void setColor(CArrayFacade<Float> color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 52;
		}
		if (__io__equals(color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, color);
		} else {
			__io__generic__copy( getColor(), color);
		}
	}

	/**
	 * Get method for struct member 'fill'.
	 * @see #__DNA__FIELD__fill
	 */
	
	public CArrayFacade<Float> getFill() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 68, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fill'.
	 * @see #__DNA__FIELD__fill
	 */
	
	public void setFill(CArrayFacade<Float> fill) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 68;
		}
		if (__io__equals(fill, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fill)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fill);
		} else {
			__io__generic__copy( getFill(), fill);
		}
	}

	/**
	 * Get method for struct member 'info'.
	 * @see #__DNA__FIELD__info
	 */
	
	public CArrayFacade<Byte> getInfo() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			128
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 84, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'info'.
	 * @see #__DNA__FIELD__info
	 */
	
	public void setInfo(CArrayFacade<Byte> info) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 84;
		}
		if (__io__equals(info, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, info)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, info);
		} else {
			__io__generic__copy( getInfo(), info);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPDlayer> __io__addressof() {
		return new CPointer<bGPDlayer>(__io__address, new Class[]{bGPDlayer.class}, __io__block, __io__blockTable);
	}

}
