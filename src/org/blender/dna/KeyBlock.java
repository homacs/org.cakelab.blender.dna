package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'KeyBlock'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=172, size64=184)
public class KeyBlock extends CFacade {

	/**
	 * This is the sdna index of the struct KeyBlock.
	 * <p>
	 * It is required when allocating a new block to store data for KeyBlock.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 21;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;KeyBlock&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, KeyBlock.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'KeyBlock*'</li>
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
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;KeyBlock&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, KeyBlock.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'KeyBlock*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> point in time (Key->type == KEY_NORMAL) only, for historic reasons this is relative to (Key->ctime / 100), so this value increments by 0.1f per frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD__pos);
	 * CPointer&lt;Float&gt; p_pos = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pos'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pos = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> influence (typically [0 - 1] but can be more), (Key->type == KEY_RELATIVE) only. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD__curval);
	 * CPointer&lt;Float&gt; p_curval = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curval'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curval = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> interpolation type (Key->type == KEY_NORMAL) only. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{18, 26};

	/**
	 * Field descriptor (offset) for struct member 'relative'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> relative == 0 means first key is reference, otherwise the index of Key->blocks </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD__relative);
	 * CPointer&lt;Short&gt; p_relative = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'relative'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__relative = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{22, 30};

	/**
	 * Field descriptor (offset) for struct member 'totelem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number if items in the keyblock (compare with mesh/curve verts to check we match) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD__totelem);
	 * CPointer&lt;Integer&gt; p_totelem = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totelem'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totelem = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'uid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for meshes only, match the unique number with the customdata layer </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD__uid);
	 * CPointer&lt;Integer&gt; p_uid = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uid'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uid = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> array of shape key values, size is (Key->elemsize * KeyBlock->totelem) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD__data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME (unique name, user assigned) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{36, 48};

	/**
	 * Field descriptor (offset) for struct member 'vgroup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME (optional vertex group), array gets allocated into 'weights' when set </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD__vgroup);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vgroup = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup = new long[]{100, 112};

	/**
	 * Field descriptor (offset) for struct member 'slidermin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ranges, for RNA and UI only to clamp 'curval' </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD__slidermin);
	 * CPointer&lt;Float&gt; p_slidermin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slidermin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slidermin = new long[]{164, 176};

	/**
	 * Field descriptor (offset) for struct member 'slidermax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * KeyBlock keyblock = ...;
	 * CPointer&lt;Object&gt; p = keyblock.__dna__addressof(KeyBlock.__DNA__FIELD__slidermax);
	 * CPointer&lt;Float&gt; p_slidermax = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slidermax'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slidermax = new long[]{168, 180};

	public KeyBlock(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected KeyBlock(KeyBlock that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<KeyBlock> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{KeyBlock.class};
		return new CPointer<KeyBlock>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, KeyBlock.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<KeyBlock> next) throws IOException
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
	
	public CPointer<KeyBlock> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{KeyBlock.class};
		return new CPointer<KeyBlock>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, KeyBlock.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<KeyBlock> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> point in time (Key->type == KEY_NORMAL) only, for historic reasons this is relative to (Key->ctime / 100), so this value increments by 0.1f per frame. </p>
	 * @see #__DNA__FIELD__pos
	 */
	
	public float getPos() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> point in time (Key->type == KEY_NORMAL) only, for historic reasons this is relative to (Key->ctime / 100), so this value increments by 0.1f per frame. </p>
	 * @see #__DNA__FIELD__pos
	 */
	
	public void setPos(float pos) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, pos);
		} else {
			__io__block.writeFloat(__io__address + 8, pos);
		}
	}

	/**
	 * Get method for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> influence (typically [0 - 1] but can be more), (Key->type == KEY_RELATIVE) only. </p>
	 * @see #__DNA__FIELD__curval
	 */
	
	public float getCurval() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> influence (typically [0 - 1] but can be more), (Key->type == KEY_RELATIVE) only. </p>
	 * @see #__DNA__FIELD__curval
	 */
	
	public void setCurval(float curval) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, curval);
		} else {
			__io__block.writeFloat(__io__address + 12, curval);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> interpolation type (Key->type == KEY_NORMAL) only. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> interpolation type (Key->type == KEY_NORMAL) only. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, type);
		} else {
			__io__block.writeShort(__io__address + 16, type);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 26, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 18, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 26;
		} else {
			__dna__offset = 18;
		}
		if (__io__equals(_pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1);
		} else {
			__io__generic__copy( get_pad1(), _pad1);
		}
	}

	/**
	 * Get method for struct member 'relative'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> relative == 0 means first key is reference, otherwise the index of Key->blocks </p>
	 * @see #__DNA__FIELD__relative
	 */
	
	public short getRelative() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 28);
		} else {
			return __io__block.readShort(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'relative'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> relative == 0 means first key is reference, otherwise the index of Key->blocks </p>
	 * @see #__DNA__FIELD__relative
	 */
	
	public void setRelative(short relative) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 28, relative);
		} else {
			__io__block.writeShort(__io__address + 20, relative);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 30);
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
			__io__block.writeShort(__io__address + 30, flag);
		} else {
			__io__block.writeShort(__io__address + 22, flag);
		}
	}

	/**
	 * Get method for struct member 'totelem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number if items in the keyblock (compare with mesh/curve verts to check we match) </p>
	 * @see #__DNA__FIELD__totelem
	 */
	
	public int getTotelem() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'totelem'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number if items in the keyblock (compare with mesh/curve verts to check we match) </p>
	 * @see #__DNA__FIELD__totelem
	 */
	
	public void setTotelem(int totelem) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, totelem);
		} else {
			__io__block.writeInt(__io__address + 24, totelem);
		}
	}

	/**
	 * Get method for struct member 'uid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for meshes only, match the unique number with the customdata layer </p>
	 * @see #__DNA__FIELD__uid
	 */
	
	public int getUid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'uid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for meshes only, match the unique number with the customdata layer </p>
	 * @see #__DNA__FIELD__uid
	 */
	
	public void setUid(int uid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, uid);
		} else {
			__io__block.writeInt(__io__address + 28, uid);
		}
	}

	/**
	 * Get method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> array of shape key values, size is (Key->elemsize * KeyBlock->totelem) </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public CPointer<Object> getData() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> array of shape key values, size is (Key->elemsize * KeyBlock->totelem) </p>
	 * @see #__DNA__FIELD__data
	 */
	
	public void setData(CPointer<Object> data) throws IOException
	{
		long __address = ((data == null) ? 0 : data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 32, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME (unique name, user assigned) </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_NAME (unique name, user assigned) </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 36;
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
	 * Get method for struct member 'vgroup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME (optional vertex group), array gets allocated into 'weights' when set </p>
	 * @see #__DNA__FIELD__vgroup
	 */
	
	public CArrayFacade<Byte> getVgroup() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vgroup'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_VGROUP_NAME (optional vertex group), array gets allocated into 'weights' when set </p>
	 * @see #__DNA__FIELD__vgroup
	 */
	
	public void setVgroup(CArrayFacade<Byte> vgroup) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 112;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(vgroup, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vgroup)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vgroup);
		} else {
			__io__generic__copy( getVgroup(), vgroup);
		}
	}

	/**
	 * Get method for struct member 'slidermin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ranges, for RNA and UI only to clamp 'curval' </p>
	 * @see #__DNA__FIELD__slidermin
	 */
	
	public float getSlidermin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'slidermin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ranges, for RNA and UI only to clamp 'curval' </p>
	 * @see #__DNA__FIELD__slidermin
	 */
	
	public void setSlidermin(float slidermin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, slidermin);
		} else {
			__io__block.writeFloat(__io__address + 164, slidermin);
		}
	}

	/**
	 * Get method for struct member 'slidermax'.
	 * @see #__DNA__FIELD__slidermax
	 */
	
	public float getSlidermax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'slidermax'.
	 * @see #__DNA__FIELD__slidermax
	 */
	
	public void setSlidermax(float slidermax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, slidermax);
		} else {
			__io__block.writeFloat(__io__address + 168, slidermax);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<KeyBlock> __io__addressof() {
		return new CPointer<KeyBlock>(__io__address, new Class[]{KeyBlock.class}, __io__block, __io__blockTable);
	}

}
