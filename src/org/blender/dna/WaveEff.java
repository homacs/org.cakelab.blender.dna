package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'WaveEff'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=56, size64=64)
public class WaveEff extends CFacade {

	/**
	 * This is the sdna index of the struct WaveEff.
	 * <p>
	 * It is required when allocating a new block to store data for WaveEff.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 303;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;WaveEff&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, WaveEff.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'WaveEff*'</li>
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
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;WaveEff&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, WaveEff.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'WaveEff*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{10, 18};

	/**
	 * Field descriptor (offset) for struct member 'buttype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__buttype);
	 * CPointer&lt;Short&gt; p_buttype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'buttype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__buttype = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'stype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__stype);
	 * CPointer&lt;Short&gt; p_stype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stype = new long[]{14, 22};

	/**
	 * Field descriptor (offset) for struct member 'startx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__startx);
	 * CPointer&lt;Float&gt; p_startx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'startx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__startx = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'starty'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__starty);
	 * CPointer&lt;Float&gt; p_starty = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'starty'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__starty = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'height'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__height);
	 * CPointer&lt;Float&gt; p_height = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'height'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__height = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'width'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__width);
	 * CPointer&lt;Float&gt; p_width = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'width'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__width = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'narrow'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__narrow);
	 * CPointer&lt;Float&gt; p_narrow = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'narrow'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__narrow = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'speed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__speed);
	 * CPointer&lt;Float&gt; p_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__speed = new long[]{36, 44};

	/**
	 * Field descriptor (offset) for struct member 'minfac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__minfac);
	 * CPointer&lt;Float&gt; p_minfac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minfac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minfac = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'damp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__damp);
	 * CPointer&lt;Float&gt; p_damp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'damp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__damp = new long[]{44, 52};

	/**
	 * Field descriptor (offset) for struct member 'timeoffs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__timeoffs);
	 * CPointer&lt;Float&gt; p_timeoffs = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'timeoffs'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__timeoffs = new long[]{48, 56};

	/**
	 * Field descriptor (offset) for struct member 'lifetime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WaveEff waveeff = ...;
	 * CPointer&lt;Object&gt; p = waveeff.__dna__addressof(WaveEff.__DNA__FIELD__lifetime);
	 * CPointer&lt;Float&gt; p_lifetime = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lifetime'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lifetime = new long[]{52, 60};

	public WaveEff(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected WaveEff(WaveEff that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<WaveEff> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{WaveEff.class};
		return new CPointer<WaveEff>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, WaveEff.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<WaveEff> next) throws IOException
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
	
	public CPointer<WaveEff> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{WaveEff.class};
		return new CPointer<WaveEff>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, WaveEff.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<WaveEff> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, type);
		} else {
			__io__block.writeShort(__io__address + 8, type);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, flag);
		} else {
			__io__block.writeShort(__io__address + 10, flag);
		}
	}

	/**
	 * Get method for struct member 'buttype'.
	 * @see #__DNA__FIELD__buttype
	 */
	
	public short getButtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'buttype'.
	 * @see #__DNA__FIELD__buttype
	 */
	
	public void setButtype(short buttype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, buttype);
		} else {
			__io__block.writeShort(__io__address + 12, buttype);
		}
	}

	/**
	 * Get method for struct member 'stype'.
	 * @see #__DNA__FIELD__stype
	 */
	
	public short getStype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 22);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'stype'.
	 * @see #__DNA__FIELD__stype
	 */
	
	public void setStype(short stype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 22, stype);
		} else {
			__io__block.writeShort(__io__address + 14, stype);
		}
	}

	/**
	 * Get method for struct member 'startx'.
	 * @see #__DNA__FIELD__startx
	 */
	
	public float getStartx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'startx'.
	 * @see #__DNA__FIELD__startx
	 */
	
	public void setStartx(float startx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, startx);
		} else {
			__io__block.writeFloat(__io__address + 16, startx);
		}
	}

	/**
	 * Get method for struct member 'starty'.
	 * @see #__DNA__FIELD__starty
	 */
	
	public float getStarty() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'starty'.
	 * @see #__DNA__FIELD__starty
	 */
	
	public void setStarty(float starty) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, starty);
		} else {
			__io__block.writeFloat(__io__address + 20, starty);
		}
	}

	/**
	 * Get method for struct member 'height'.
	 * @see #__DNA__FIELD__height
	 */
	
	public float getHeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'height'.
	 * @see #__DNA__FIELD__height
	 */
	
	public void setHeight(float height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, height);
		} else {
			__io__block.writeFloat(__io__address + 24, height);
		}
	}

	/**
	 * Get method for struct member 'width'.
	 * @see #__DNA__FIELD__width
	 */
	
	public float getWidth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'width'.
	 * @see #__DNA__FIELD__width
	 */
	
	public void setWidth(float width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, width);
		} else {
			__io__block.writeFloat(__io__address + 28, width);
		}
	}

	/**
	 * Get method for struct member 'narrow'.
	 * @see #__DNA__FIELD__narrow
	 */
	
	public float getNarrow() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'narrow'.
	 * @see #__DNA__FIELD__narrow
	 */
	
	public void setNarrow(float narrow) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, narrow);
		} else {
			__io__block.writeFloat(__io__address + 32, narrow);
		}
	}

	/**
	 * Get method for struct member 'speed'.
	 * @see #__DNA__FIELD__speed
	 */
	
	public float getSpeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'speed'.
	 * @see #__DNA__FIELD__speed
	 */
	
	public void setSpeed(float speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, speed);
		} else {
			__io__block.writeFloat(__io__address + 36, speed);
		}
	}

	/**
	 * Get method for struct member 'minfac'.
	 * @see #__DNA__FIELD__minfac
	 */
	
	public float getMinfac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'minfac'.
	 * @see #__DNA__FIELD__minfac
	 */
	
	public void setMinfac(float minfac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, minfac);
		} else {
			__io__block.writeFloat(__io__address + 40, minfac);
		}
	}

	/**
	 * Get method for struct member 'damp'.
	 * @see #__DNA__FIELD__damp
	 */
	
	public float getDamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'damp'.
	 * @see #__DNA__FIELD__damp
	 */
	
	public void setDamp(float damp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, damp);
		} else {
			__io__block.writeFloat(__io__address + 44, damp);
		}
	}

	/**
	 * Get method for struct member 'timeoffs'.
	 * @see #__DNA__FIELD__timeoffs
	 */
	
	public float getTimeoffs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'timeoffs'.
	 * @see #__DNA__FIELD__timeoffs
	 */
	
	public void setTimeoffs(float timeoffs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, timeoffs);
		} else {
			__io__block.writeFloat(__io__address + 48, timeoffs);
		}
	}

	/**
	 * Get method for struct member 'lifetime'.
	 * @see #__DNA__FIELD__lifetime
	 */
	
	public float getLifetime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 60);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'lifetime'.
	 * @see #__DNA__FIELD__lifetime
	 */
	
	public void setLifetime(float lifetime) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 60, lifetime);
		} else {
			__io__block.writeFloat(__io__address + 52, lifetime);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<WaveEff> __io__addressof() {
		return new CPointer<WaveEff>(__io__address, new Class[]{WaveEff.class}, __io__block, __io__blockTable);
	}

}
