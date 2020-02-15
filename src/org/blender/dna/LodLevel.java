package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LodLevel'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=28, size64=40)
public class LodLevel extends CFacade {

	/**
	 * This is the sdna index of the struct LodLevel.
	 * <p>
	 * It is required when allocating a new block to store data for LodLevel.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 159;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LodLevel lodlevel = ...;
	 * CPointer&lt;Object&gt; p = lodlevel.__dna__addressof(LodLevel.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;LodLevel&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, LodLevel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'LodLevel*'</li>
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
	 * LodLevel lodlevel = ...;
	 * CPointer&lt;Object&gt; p = lodlevel.__dna__addressof(LodLevel.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;LodLevel&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, LodLevel.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'LodLevel*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'source'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LodLevel lodlevel = ...;
	 * CPointer&lt;Object&gt; p = lodlevel.__dna__addressof(LodLevel.__DNA__FIELD__source);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_source = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'source'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__source = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LodLevel lodlevel = ...;
	 * CPointer&lt;Object&gt; p = lodlevel.__dna__addressof(LodLevel.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'distance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LodLevel lodlevel = ...;
	 * CPointer&lt;Object&gt; p = lodlevel.__dna__addressof(LodLevel.__DNA__FIELD__distance);
	 * CPointer&lt;Float&gt; p_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distance = new long[]{16, 28};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LodLevel lodlevel = ...;
	 * CPointer&lt;Object&gt; p = lodlevel.__dna__addressof(LodLevel.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{20, 32};

	/**
	 * Field descriptor (offset) for struct member 'obhysteresis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LodLevel lodlevel = ...;
	 * CPointer&lt;Object&gt; p = lodlevel.__dna__addressof(LodLevel.__DNA__FIELD__obhysteresis);
	 * CPointer&lt;Integer&gt; p_obhysteresis = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'obhysteresis'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__obhysteresis = new long[]{24, 36};

	public LodLevel(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LodLevel(LodLevel that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<LodLevel> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{LodLevel.class};
		return new CPointer<LodLevel>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, LodLevel.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<LodLevel> next) throws IOException
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
	
	public CPointer<LodLevel> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{LodLevel.class};
		return new CPointer<LodLevel>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, LodLevel.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<LodLevel> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'source'.
	 * @see #__DNA__FIELD__source
	 */
	
	public CPointer<BlenderObject> getSource() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'source'.
	 * @see #__DNA__FIELD__source
	 */
	
	public void setSource(CPointer<BlenderObject> source) throws IOException
	{
		long __address = ((source == null) ? 0 : source.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, flags);
		} else {
			__io__block.writeInt(__io__address + 12, flags);
		}
	}

	/**
	 * Get method for struct member 'distance'.
	 * @see #__DNA__FIELD__distance
	 */
	
	public float getDistance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'distance'.
	 * @see #__DNA__FIELD__distance
	 */
	
	public void setDistance(float distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, distance);
		} else {
			__io__block.writeFloat(__io__address + 16, distance);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Get method for struct member 'obhysteresis'.
	 * @see #__DNA__FIELD__obhysteresis
	 */
	
	public int getObhysteresis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'obhysteresis'.
	 * @see #__DNA__FIELD__obhysteresis
	 */
	
	public void setObhysteresis(int obhysteresis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, obhysteresis);
		} else {
			__io__block.writeInt(__io__address + 24, obhysteresis);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LodLevel> __io__addressof() {
		return new CPointer<LodLevel>(__io__address, new Class[]{LodLevel.class}, __io__block, __io__blockTable);
	}

}
