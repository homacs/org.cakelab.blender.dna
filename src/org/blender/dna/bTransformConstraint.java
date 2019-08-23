package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bTransformConstraint'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=124, size64=128)
public class bTransformConstraint extends CFacade {

	/**
	 * This is the sdna index of the struct bTransformConstraint.
	 * <p>
	 * It is required when allocating a new block to store data for bTransformConstraint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 334;

	/**
	 * Field descriptor (offset) for struct member 'tar'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__tar);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_tar = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tar'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tar = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'subtarget'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__subtarget);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_subtarget = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subtarget'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subtarget = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'from'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__from);
	 * CPointer&lt;Short&gt; p_from = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'from'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__from = new long[]{68, 72};

	/**
	 * Field descriptor (offset) for struct member 'to'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__to);
	 * CPointer&lt;Short&gt; p_to = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'to'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__to = new long[]{70, 74};

	/**
	 * Field descriptor (offset) for struct member 'map'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__map);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_map = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'map'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__map = new long[]{72, 76};

	/**
	 * Field descriptor (offset) for struct member 'expo'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__expo);
	 * CPointer&lt;Byte&gt; p_expo = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'expo'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__expo = new long[]{75, 79};

	/**
	 * Field descriptor (offset) for struct member 'from_min'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__from_min);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_from_min = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'from_min'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__from_min = new long[]{76, 80};

	/**
	 * Field descriptor (offset) for struct member 'from_max'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__from_max);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_from_max = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'from_max'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__from_max = new long[]{88, 92};

	/**
	 * Field descriptor (offset) for struct member 'to_min'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__to_min);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_to_min = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'to_min'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__to_min = new long[]{100, 104};

	/**
	 * Field descriptor (offset) for struct member 'to_max'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bTransformConstraint btransformconstraint = ...;
	 * CPointer&lt;Object&gt; p = btransformconstraint.__dna__addressof(bTransformConstraint.__DNA__FIELD__to_max);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_to_max = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'to_max'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__to_max = new long[]{112, 116};

	public bTransformConstraint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bTransformConstraint(bTransformConstraint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tar'.
	 * @see #__DNA__FIELD__tar
	 */
	
	public CPointer<BlenderObject> getTar() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tar'.
	 * @see #__DNA__FIELD__tar
	 */
	
	public void setTar(CPointer<BlenderObject> tar) throws IOException
	{
		long __address = ((tar == null) ? 0 : tar.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'subtarget'.
	 * @see #__DNA__FIELD__subtarget
	 */
	
	public CArrayFacade<Byte> getSubtarget() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'subtarget'.
	 * @see #__DNA__FIELD__subtarget
	 */
	
	public void setSubtarget(CArrayFacade<Byte> subtarget) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(subtarget, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, subtarget)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, subtarget);
		} else {
			__io__generic__copy( getSubtarget(), subtarget);
		}
	}

	/**
	 * Get method for struct member 'from'.
	 * @see #__DNA__FIELD__from
	 */
	
	public short getFrom() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 72);
		} else {
			return __io__block.readShort(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'from'.
	 * @see #__DNA__FIELD__from
	 */
	
	public void setFrom(short from) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 72, from);
		} else {
			__io__block.writeShort(__io__address + 68, from);
		}
	}

	/**
	 * Get method for struct member 'to'.
	 * @see #__DNA__FIELD__to
	 */
	
	public short getTo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 74);
		} else {
			return __io__block.readShort(__io__address + 70);
		}
	}

	/**
	 * Set method for struct member 'to'.
	 * @see #__DNA__FIELD__to
	 */
	
	public void setTo(short to) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 74, to);
		} else {
			__io__block.writeShort(__io__address + 70, to);
		}
	}

	/**
	 * Get method for struct member 'map'.
	 * @see #__DNA__FIELD__map
	 */
	
	public CArrayFacade<Byte> getMap() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'map'.
	 * @see #__DNA__FIELD__map
	 */
	
	public void setMap(CArrayFacade<Byte> map) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 76;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(map, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, map)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, map);
		} else {
			__io__generic__copy( getMap(), map);
		}
	}

	/**
	 * Get method for struct member 'expo'.
	 * @see #__DNA__FIELD__expo
	 */
	
	public byte getExpo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 79);
		} else {
			return __io__block.readByte(__io__address + 75);
		}
	}

	/**
	 * Set method for struct member 'expo'.
	 * @see #__DNA__FIELD__expo
	 */
	
	public void setExpo(byte expo) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 79, expo);
		} else {
			__io__block.writeByte(__io__address + 75, expo);
		}
	}

	/**
	 * Get method for struct member 'from_min'.
	 * @see #__DNA__FIELD__from_min
	 */
	
	public CArrayFacade<Float> getFrom_min() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'from_min'.
	 * @see #__DNA__FIELD__from_min
	 */
	
	public void setFrom_min(CArrayFacade<Float> from_min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 76;
		}
		if (__io__equals(from_min, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, from_min)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, from_min);
		} else {
			__io__generic__copy( getFrom_min(), from_min);
		}
	}

	/**
	 * Get method for struct member 'from_max'.
	 * @see #__DNA__FIELD__from_max
	 */
	
	public CArrayFacade<Float> getFrom_max() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'from_max'.
	 * @see #__DNA__FIELD__from_max
	 */
	
	public void setFrom_max(CArrayFacade<Float> from_max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 92;
		} else {
			__dna__offset = 88;
		}
		if (__io__equals(from_max, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, from_max)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, from_max);
		} else {
			__io__generic__copy( getFrom_max(), from_max);
		}
	}

	/**
	 * Get method for struct member 'to_min'.
	 * @see #__DNA__FIELD__to_min
	 */
	
	public CArrayFacade<Float> getTo_min() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'to_min'.
	 * @see #__DNA__FIELD__to_min
	 */
	
	public void setTo_min(CArrayFacade<Float> to_min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(to_min, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, to_min)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, to_min);
		} else {
			__io__generic__copy( getTo_min(), to_min);
		}
	}

	/**
	 * Get method for struct member 'to_max'.
	 * @see #__DNA__FIELD__to_max
	 */
	
	public CArrayFacade<Float> getTo_max() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'to_max'.
	 * @see #__DNA__FIELD__to_max
	 */
	
	public void setTo_max(CArrayFacade<Float> to_max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 116;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(to_max, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, to_max)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, to_max);
		} else {
			__io__generic__copy( getTo_max(), to_max);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bTransformConstraint> __io__addressof() {
		return new CPointer<bTransformConstraint>(__io__address, new Class[]{bTransformConstraint.class}, __io__block, __io__blockTable);
	}

}
