package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bActionGroup'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  Action Groups --------------------------------<mdash/><mdash/>  Action-Channel Group (agrp)</p><p> These are stored as a list per-Action, and are only used to group that Action's channels in an Animation Editor.</p><p> Even though all FCurves live in a big list per Action, each group they are in also holds references to the achans within that list which belong to it. Care must be taken to ensure that action-groups never end up being the sole 'owner' of a channel.</p><p> This is also exploited for bone-groups. Bone-Groups are stored per {@link bPose} , and are used primarily to color bones in the 3d-view. There are other benefits too, but those are mostly related to Action-Groups.</p><p> Note that these two uses each have their own RNA 'ActionGroup' and 'BoneGroup'. </p>
 */

@CMetaData(size32=104, size64=120)
public class bActionGroup extends CFacade {

	/**
	 * This is the sdna index of the struct bActionGroup.
	 * <p>
	 * It is required when allocating a new block to store data for bActionGroup.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 320;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionGroup bactiongroup = ...;
	 * CPointer&lt;Object&gt; p = bactiongroup.__dna__addressof(bActionGroup.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bActionGroup&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bActionGroup.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bActionGroup*'</li>
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
	 * bActionGroup bactiongroup = ...;
	 * CPointer&lt;Object&gt; p = bactiongroup.__dna__addressof(bActionGroup.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bActionGroup&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bActionGroup.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bActionGroup*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'channels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Note: this must not be touched by standard listbase functions which would clear links to other channels. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionGroup bactiongroup = ...;
	 * CPointer&lt;Object&gt; p = bactiongroup.__dna__addressof(bActionGroup.__DNA__FIELD__channels);
	 * CPointer&lt;ListBase&gt; p_channels = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'channels'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__channels = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for this action-group. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionGroup bactiongroup = ...;
	 * CPointer&lt;Object&gt; p = bactiongroup.__dna__addressof(bActionGroup.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'customCol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of custom color set to use when used for bones (0=default - used for all old files, -1=custom set). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionGroup bactiongroup = ...;
	 * CPointer&lt;Object&gt; p = bactiongroup.__dna__addressof(bActionGroup.__DNA__FIELD__customCol);
	 * CPointer&lt;Integer&gt; p_customCol = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'customCol'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__customCol = new long[]{20, 36};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the group. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionGroup bactiongroup = ...;
	 * CPointer&lt;Object&gt; p = bactiongroup.__dna__addressof(bActionGroup.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'cs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color set to use when customCol == -1. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bActionGroup bactiongroup = ...;
	 * CPointer&lt;Object&gt; p = bactiongroup.__dna__addressof(bActionGroup.__DNA__FIELD__cs);
	 * CPointer&lt;ThemeWireColor&gt; p_cs = p.cast(new Class[]{ThemeWireColor.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cs'</li>
	 * <li>Signature: 'ThemeWireColor'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cs = new long[]{88, 104};

	public bActionGroup(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bActionGroup(bActionGroup that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bActionGroup> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bActionGroup.class};
		return new CPointer<bActionGroup>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bActionGroup.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bActionGroup> next) throws IOException
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
	
	public CPointer<bActionGroup> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bActionGroup.class};
		return new CPointer<bActionGroup>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bActionGroup.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bActionGroup> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'channels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Note: this must not be touched by standard listbase functions which would clear links to other channels. </p>
	 * @see #__DNA__FIELD__channels
	 */
	
	public ListBase getChannels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'channels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Note: this must not be touched by standard listbase functions which would clear links to other channels. </p>
	 * @see #__DNA__FIELD__channels
	 */
	
	public void setChannels(ListBase channels) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(channels, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, channels)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, channels);
		} else {
			__io__generic__copy( getChannels(), channels);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for this action-group. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for this action-group. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, flag);
		} else {
			__io__block.writeInt(__io__address + 16, flag);
		}
	}

	/**
	 * Get method for struct member 'customCol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of custom color set to use when used for bones (0=default - used for all old files, -1=custom set). </p>
	 * @see #__DNA__FIELD__customCol
	 */
	
	public int getCustomCol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'customCol'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index of custom color set to use when used for bones (0=default - used for all old files, -1=custom set). </p>
	 * @see #__DNA__FIELD__customCol
	 */
	
	public void setCustomCol(int customCol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, customCol);
		} else {
			__io__block.writeInt(__io__address + 20, customCol);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the group. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Name of the group. </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 24;
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
	 * Get method for struct member 'cs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color set to use when customCol == -1. </p>
	 * @see #__DNA__FIELD__cs
	 */
	
	public ThemeWireColor getCs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ThemeWireColor(__io__address + 104, __io__block, __io__blockTable);
		} else {
			return new ThemeWireColor(__io__address + 88, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cs'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color set to use when customCol == -1. </p>
	 * @see #__DNA__FIELD__cs
	 */
	
	public void setCs(ThemeWireColor cs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 88;
		}
		if (__io__equals(cs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cs);
		} else {
			__io__generic__copy( getCs(), cs);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bActionGroup> __io__addressof() {
		return new CPointer<bActionGroup>(__io__address, new Class[]{bActionGroup.class}, __io__block, __io__blockTable);
	}

}
