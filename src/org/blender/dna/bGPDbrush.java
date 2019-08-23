package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPDbrush'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> GP brush (used for new strokes) </p>
 */

@CMetaData(size32=124, size64=144)
public class bGPDbrush extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDbrush.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDbrush.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 491;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bGPDbrush&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bGPDbrush.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bGPDbrush*'</li>
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
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bGPDbrush&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bGPDbrush.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bGPDbrush*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'info'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Brush}  name. Must be unique. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__info);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_info = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'info'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__info = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> thickness to apply to strokes </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__thickness);
	 * CPointer&lt;Short&gt; p_thickness = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{74, 82};

	/**
	 * Field descriptor (offset) for struct member 'draw_smoothfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of smoothing to apply to newly created strokes </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__draw_smoothfac);
	 * CPointer&lt;Float&gt; p_draw_smoothfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_smoothfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_smoothfac = new long[]{76, 84};

	/**
	 * Field descriptor (offset) for struct member 'draw_smoothlvl'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of times to apply smooth factor to new strokes </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__draw_smoothlvl);
	 * CPointer&lt;Short&gt; p_draw_smoothlvl = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_smoothlvl'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_smoothlvl = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'sublevel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of times to subdivide new strokes </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__sublevel);
	 * CPointer&lt;Short&gt; p_sublevel = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sublevel'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sublevel = new long[]{82, 90};

	/**
	 * Field descriptor (offset) for struct member 'draw_sensitivity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of sensivity to apply to newly created strokes </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__draw_sensitivity);
	 * CPointer&lt;Float&gt; p_draw_sensitivity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_sensitivity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_sensitivity = new long[]{84, 92};

	/**
	 * Field descriptor (offset) for struct member 'draw_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of alpha strength to apply to newly created strokes </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__draw_strength);
	 * CPointer&lt;Float&gt; p_draw_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_strength = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'draw_jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of jitter to apply to newly created strokes </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__draw_jitter);
	 * CPointer&lt;Float&gt; p_draw_jitter = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_jitter'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_jitter = new long[]{92, 100};

	/**
	 * Field descriptor (offset) for struct member 'draw_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angle when the brush has full thickness </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__draw_angle);
	 * CPointer&lt;Float&gt; p_draw_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_angle = new long[]{96, 104};

	/**
	 * Field descriptor (offset) for struct member 'draw_angle_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor to apply when angle change (only 90 degrees) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__draw_angle_factor);
	 * CPointer&lt;Float&gt; p_draw_angle_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_angle_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_angle_factor = new long[]{100, 108};

	/**
	 * Field descriptor (offset) for struct member 'draw_random_press'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor of randomness for sensitivity and strength </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__draw_random_press);
	 * CPointer&lt;Float&gt; p_draw_random_press = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_random_press'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_random_press = new long[]{104, 112};

	/**
	 * Field descriptor (offset) for struct member 'draw_random_sub'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor of randomness for subdivision </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__draw_random_sub);
	 * CPointer&lt;Float&gt; p_draw_random_sub = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_random_sub'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_random_sub = new long[]{108, 116};

	/**
	 * Field descriptor (offset) for struct member 'cur_sensitivity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__cur_sensitivity);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_cur_sensitivity = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cur_sensitivity'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cur_sensitivity = new long[]{112, 120};

	/**
	 * Field descriptor (offset) for struct member 'cur_strength'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__cur_strength);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_cur_strength = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cur_strength'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cur_strength = new long[]{116, 128};

	/**
	 * Field descriptor (offset) for struct member 'cur_jitter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDbrush bgpdbrush = ...;
	 * CPointer&lt;Object&gt; p = bgpdbrush.__dna__addressof(bGPDbrush.__DNA__FIELD__cur_jitter);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_cur_jitter = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cur_jitter'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cur_jitter = new long[]{120, 136};

	public bGPDbrush(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPDbrush(bGPDbrush that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bGPDbrush> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDbrush.class};
		return new CPointer<bGPDbrush>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDbrush.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bGPDbrush> next) throws IOException
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
	
	public CPointer<bGPDbrush> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDbrush.class};
		return new CPointer<bGPDbrush>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDbrush.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bGPDbrush> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'info'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Brush}  name. Must be unique. </p>
	 * @see #__DNA__FIELD__info
	 */
	
	public CArrayFacade<Byte> getInfo() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'info'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Brush}  name. Must be unique. </p>
	 * @see #__DNA__FIELD__info
	 */
	
	public void setInfo(CArrayFacade<Byte> info) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
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
	 * Get method for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> thickness to apply to strokes </p>
	 * @see #__DNA__FIELD__thickness
	 */
	
	public short getThickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 80);
		} else {
			return __io__block.readShort(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> thickness to apply to strokes </p>
	 * @see #__DNA__FIELD__thickness
	 */
	
	public void setThickness(short thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 80, thickness);
		} else {
			__io__block.writeShort(__io__address + 72, thickness);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 82);
		} else {
			return __io__block.readShort(__io__address + 74);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 82, flag);
		} else {
			__io__block.writeShort(__io__address + 74, flag);
		}
	}

	/**
	 * Get method for struct member 'draw_smoothfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of smoothing to apply to newly created strokes </p>
	 * @see #__DNA__FIELD__draw_smoothfac
	 */
	
	public float getDraw_smoothfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'draw_smoothfac'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of smoothing to apply to newly created strokes </p>
	 * @see #__DNA__FIELD__draw_smoothfac
	 */
	
	public void setDraw_smoothfac(float draw_smoothfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, draw_smoothfac);
		} else {
			__io__block.writeFloat(__io__address + 76, draw_smoothfac);
		}
	}

	/**
	 * Get method for struct member 'draw_smoothlvl'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of times to apply smooth factor to new strokes </p>
	 * @see #__DNA__FIELD__draw_smoothlvl
	 */
	
	public short getDraw_smoothlvl() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 88);
		} else {
			return __io__block.readShort(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'draw_smoothlvl'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of times to apply smooth factor to new strokes </p>
	 * @see #__DNA__FIELD__draw_smoothlvl
	 */
	
	public void setDraw_smoothlvl(short draw_smoothlvl) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 88, draw_smoothlvl);
		} else {
			__io__block.writeShort(__io__address + 80, draw_smoothlvl);
		}
	}

	/**
	 * Get method for struct member 'sublevel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of times to subdivide new strokes </p>
	 * @see #__DNA__FIELD__sublevel
	 */
	
	public short getSublevel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 90);
		} else {
			return __io__block.readShort(__io__address + 82);
		}
	}

	/**
	 * Set method for struct member 'sublevel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> number of times to subdivide new strokes </p>
	 * @see #__DNA__FIELD__sublevel
	 */
	
	public void setSublevel(short sublevel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 90, sublevel);
		} else {
			__io__block.writeShort(__io__address + 82, sublevel);
		}
	}

	/**
	 * Get method for struct member 'draw_sensitivity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of sensivity to apply to newly created strokes </p>
	 * @see #__DNA__FIELD__draw_sensitivity
	 */
	
	public float getDraw_sensitivity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'draw_sensitivity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of sensivity to apply to newly created strokes </p>
	 * @see #__DNA__FIELD__draw_sensitivity
	 */
	
	public void setDraw_sensitivity(float draw_sensitivity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, draw_sensitivity);
		} else {
			__io__block.writeFloat(__io__address + 84, draw_sensitivity);
		}
	}

	/**
	 * Get method for struct member 'draw_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of alpha strength to apply to newly created strokes </p>
	 * @see #__DNA__FIELD__draw_strength
	 */
	
	public float getDraw_strength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'draw_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of alpha strength to apply to newly created strokes </p>
	 * @see #__DNA__FIELD__draw_strength
	 */
	
	public void setDraw_strength(float draw_strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, draw_strength);
		} else {
			__io__block.writeFloat(__io__address + 88, draw_strength);
		}
	}

	/**
	 * Get method for struct member 'draw_jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of jitter to apply to newly created strokes </p>
	 * @see #__DNA__FIELD__draw_jitter
	 */
	
	public float getDraw_jitter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'draw_jitter'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of jitter to apply to newly created strokes </p>
	 * @see #__DNA__FIELD__draw_jitter
	 */
	
	public void setDraw_jitter(float draw_jitter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, draw_jitter);
		} else {
			__io__block.writeFloat(__io__address + 92, draw_jitter);
		}
	}

	/**
	 * Get method for struct member 'draw_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angle when the brush has full thickness </p>
	 * @see #__DNA__FIELD__draw_angle
	 */
	
	public float getDraw_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'draw_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> angle when the brush has full thickness </p>
	 * @see #__DNA__FIELD__draw_angle
	 */
	
	public void setDraw_angle(float draw_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, draw_angle);
		} else {
			__io__block.writeFloat(__io__address + 96, draw_angle);
		}
	}

	/**
	 * Get method for struct member 'draw_angle_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor to apply when angle change (only 90 degrees) </p>
	 * @see #__DNA__FIELD__draw_angle_factor
	 */
	
	public float getDraw_angle_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 108);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'draw_angle_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor to apply when angle change (only 90 degrees) </p>
	 * @see #__DNA__FIELD__draw_angle_factor
	 */
	
	public void setDraw_angle_factor(float draw_angle_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 108, draw_angle_factor);
		} else {
			__io__block.writeFloat(__io__address + 100, draw_angle_factor);
		}
	}

	/**
	 * Get method for struct member 'draw_random_press'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor of randomness for sensitivity and strength </p>
	 * @see #__DNA__FIELD__draw_random_press
	 */
	
	public float getDraw_random_press() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'draw_random_press'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor of randomness for sensitivity and strength </p>
	 * @see #__DNA__FIELD__draw_random_press
	 */
	
	public void setDraw_random_press(float draw_random_press) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, draw_random_press);
		} else {
			__io__block.writeFloat(__io__address + 104, draw_random_press);
		}
	}

	/**
	 * Get method for struct member 'draw_random_sub'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor of randomness for subdivision </p>
	 * @see #__DNA__FIELD__draw_random_sub
	 */
	
	public float getDraw_random_sub() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'draw_random_sub'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor of randomness for subdivision </p>
	 * @see #__DNA__FIELD__draw_random_sub
	 */
	
	public void setDraw_random_sub(float draw_random_sub) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, draw_random_sub);
		} else {
			__io__block.writeFloat(__io__address + 108, draw_random_sub);
		}
	}

	/**
	 * Get method for struct member 'cur_sensitivity'.
	 * @see #__DNA__FIELD__cur_sensitivity
	 */
	
	public CPointer<CurveMapping> getCur_sensitivity() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cur_sensitivity'.
	 * @see #__DNA__FIELD__cur_sensitivity
	 */
	
	public void setCur_sensitivity(CPointer<CurveMapping> cur_sensitivity) throws IOException
	{
		long __address = ((cur_sensitivity == null) ? 0 : cur_sensitivity.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'cur_strength'.
	 * @see #__DNA__FIELD__cur_strength
	 */
	
	public CPointer<CurveMapping> getCur_strength() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 116);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cur_strength'.
	 * @see #__DNA__FIELD__cur_strength
	 */
	
	public void setCur_strength(CPointer<CurveMapping> cur_strength) throws IOException
	{
		long __address = ((cur_strength == null) ? 0 : cur_strength.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
		}
	}

	/**
	 * Get method for struct member 'cur_jitter'.
	 * @see #__DNA__FIELD__cur_jitter
	 */
	
	public CPointer<CurveMapping> getCur_jitter() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cur_jitter'.
	 * @see #__DNA__FIELD__cur_jitter
	 */
	
	public void setCur_jitter(CPointer<CurveMapping> cur_jitter) throws IOException
	{
		long __address = ((cur_jitter == null) ? 0 : cur_jitter.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPDbrush> __io__addressof() {
		return new CPointer<bGPDbrush>(__io__address, new Class[]{bGPDbrush.class}, __io__block, __io__blockTable);
	}

}
