package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpaceConsole'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Console View </p>
 */

@CMetaData(size32=344, size64=376)
public class SpaceConsole extends CFacade {

	/**
	 * This is the sdna index of the struct SpaceConsole.
	 * <p>
	 * It is required when allocating a new block to store data for SpaceConsole.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 235;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceConsole spaceconsole = ...;
	 * CPointer&lt;Object&gt; p = spaceconsole.__dna__addressof(SpaceConsole.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;SpaceLink&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, SpaceLink.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'SpaceLink*'</li>
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
	 * SpaceConsole spaceconsole = ...;
	 * CPointer&lt;Object&gt; p = spaceconsole.__dna__addressof(SpaceConsole.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;SpaceLink&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, SpaceLink.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'SpaceLink*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Storage of regions for inactive spaces. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceConsole spaceconsole = ...;
	 * CPointer&lt;Object&gt; p = spaceconsole.__dna__addressof(SpaceConsole.__DNA__FIELD__regionbase);
	 * CPointer&lt;ListBase&gt; p_regionbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'regionbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__regionbase = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'spacetype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceConsole spaceconsole = ...;
	 * CPointer&lt;Object&gt; p = spaceconsole.__dna__addressof(SpaceConsole.__DNA__FIELD__spacetype);
	 * CPointer&lt;Byte&gt; p_spacetype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacetype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacetype = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'link_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceConsole spaceconsole = ...;
	 * CPointer&lt;Object&gt; p = spaceconsole.__dna__addressof(SpaceConsole.__DNA__FIELD__link_flag);
	 * CPointer&lt;Byte&gt; p_link_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'link_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__link_flag = new long[]{17, 33};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceConsole spaceconsole = ...;
	 * CPointer&lt;Object&gt; p = spaceconsole.__dna__addressof(SpaceConsole.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{18, 34};

	/**
	 * Field descriptor (offset) for struct member 'lheight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. space vars </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceConsole spaceconsole = ...;
	 * CPointer&lt;Object&gt; p = spaceconsole.__dna__addressof(SpaceConsole.__DNA__FIELD__lheight);
	 * CPointer&lt;Integer&gt; p_lheight = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lheight'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lheight = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceConsole spaceconsole = ...;
	 * CPointer&lt;Object&gt; p = spaceconsole.__dna__addressof(SpaceConsole.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{28, 44};

	/**
	 * Field descriptor (offset) for struct member 'scrollback'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Command output<h4>Blender Source Code:</h4>
	 * <p>{@link ConsoleLine} ; output. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceConsole spaceconsole = ...;
	 * CPointer&lt;Object&gt; p = spaceconsole.__dna__addressof(SpaceConsole.__DNA__FIELD__scrollback);
	 * CPointer&lt;ListBase&gt; p_scrollback = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scrollback'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scrollback = new long[]{32, 48};

	/**
	 * Field descriptor (offset) for struct member 'history'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Command history<h4>Blender Source Code:</h4>
	 * <p>{@link ConsoleLine} ; command history, current edited line is the first. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceConsole spaceconsole = ...;
	 * CPointer&lt;Object&gt; p = spaceconsole.__dna__addressof(SpaceConsole.__DNA__FIELD__history);
	 * CPointer&lt;ListBase&gt; p_history = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'history'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__history = new long[]{40, 64};

	/**
	 * Field descriptor (offset) for struct member 'prompt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Command line prompt
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceConsole spaceconsole = ...;
	 * CPointer&lt;Object&gt; p = spaceconsole.__dna__addressof(SpaceConsole.__DNA__FIELD__prompt);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_prompt = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prompt'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prompt = new long[]{48, 80};

	/**
	 * Field descriptor (offset) for struct member 'language'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Command line prompt language<h4>Blender Source Code:</h4>
	 * <p> Multiple consoles are possible, not just python. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceConsole spaceconsole = ...;
	 * CPointer&lt;Object&gt; p = spaceconsole.__dna__addressof(SpaceConsole.__DNA__FIELD__language);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_language = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'language'</li>
	 * <li>Signature: 'char[32]'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__language = new long[]{304, 336};

	/**
	 * Field descriptor (offset) for struct member 'sel_start'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceConsole spaceconsole = ...;
	 * CPointer&lt;Object&gt; p = spaceconsole.__dna__addressof(SpaceConsole.__DNA__FIELD__sel_start);
	 * CPointer&lt;Integer&gt; p_sel_start = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sel_start'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sel_start = new long[]{336, 368};

	/**
	 * Field descriptor (offset) for struct member 'sel_end'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceConsole spaceconsole = ...;
	 * CPointer&lt;Object&gt; p = spaceconsole.__dna__addressof(SpaceConsole.__DNA__FIELD__sel_end);
	 * CPointer&lt;Integer&gt; p_sel_end = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sel_end'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sel_end = new long[]{340, 372};

	public SpaceConsole(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpaceConsole(SpaceConsole that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<SpaceLink> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpaceLink.class};
		return new CPointer<SpaceLink>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpaceLink.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<SpaceLink> next) throws IOException
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
	
	public CPointer<SpaceLink> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpaceLink.class};
		return new CPointer<SpaceLink>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpaceLink.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<SpaceLink> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Storage of regions for inactive spaces. </p>
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public ListBase getRegionbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Storage of regions for inactive spaces. </p>
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public void setRegionbase(ListBase regionbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(regionbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, regionbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, regionbase);
		} else {
			__io__generic__copy( getRegionbase(), regionbase);
		}
	}

	/**
	 * Get method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public byte getSpacetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 32);
		} else {
			return __io__block.readByte(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public void setSpacetype(byte spacetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 32, spacetype);
		} else {
			__io__block.writeByte(__io__address + 16, spacetype);
		}
	}

	/**
	 * Get method for struct member 'link_flag'.
	 * @see #__DNA__FIELD__link_flag
	 */
	
	public byte getLink_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 33);
		} else {
			return __io__block.readByte(__io__address + 17);
		}
	}

	/**
	 * Set method for struct member 'link_flag'.
	 * @see #__DNA__FIELD__link_flag
	 */
	
	public void setLink_flag(byte link_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 33, link_flag);
		} else {
			__io__block.writeByte(__io__address + 17, link_flag);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 34, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 18, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 34;
		} else {
			__dna__offset = 18;
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
	 * Get method for struct member 'lheight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. space vars </p>
	 * @see #__DNA__FIELD__lheight
	 */
	
	public int getLheight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'lheight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. space vars </p>
	 * @see #__DNA__FIELD__lheight
	 */
	
	public void setLheight(int lheight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, lheight);
		} else {
			__io__block.writeInt(__io__address + 24, lheight);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 44;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
		}
	}

	/**
	 * Get method for struct member 'scrollback'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Command output<h4>Blender Source Code:</h4>
	 * <p>{@link ConsoleLine} ; output. </p>
	 * @see #__DNA__FIELD__scrollback
	 */
	
	public ListBase getScrollback() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 48, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 32, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scrollback'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Command output<h4>Blender Source Code:</h4>
	 * <p>{@link ConsoleLine} ; output. </p>
	 * @see #__DNA__FIELD__scrollback
	 */
	
	public void setScrollback(ListBase scrollback) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(scrollback, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scrollback)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scrollback);
		} else {
			__io__generic__copy( getScrollback(), scrollback);
		}
	}

	/**
	 * Get method for struct member 'history'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Command history<h4>Blender Source Code:</h4>
	 * <p>{@link ConsoleLine} ; command history, current edited line is the first. </p>
	 * @see #__DNA__FIELD__history
	 */
	
	public ListBase getHistory() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 64, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 40, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'history'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Command history<h4>Blender Source Code:</h4>
	 * <p>{@link ConsoleLine} ; command history, current edited line is the first. </p>
	 * @see #__DNA__FIELD__history
	 */
	
	public void setHistory(ListBase history) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(history, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, history)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, history);
		} else {
			__io__generic__copy( getHistory(), history);
		}
	}

	/**
	 * Get method for struct member 'prompt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Command line prompt
	 * @see #__DNA__FIELD__prompt
	 */
	
	public CArrayFacade<Byte> getPrompt() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'prompt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Command line prompt
	 * @see #__DNA__FIELD__prompt
	 */
	
	public void setPrompt(CArrayFacade<Byte> prompt) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(prompt, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, prompt)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, prompt);
		} else {
			__io__generic__copy( getPrompt(), prompt);
		}
	}

	/**
	 * Get method for struct member 'language'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Command line prompt language<h4>Blender Source Code:</h4>
	 * <p> Multiple consoles are possible, not just python. </p>
	 * @see #__DNA__FIELD__language
	 */
	
	public CArrayFacade<Byte> getLanguage() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			32
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 336, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 304, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'language'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Command line prompt language<h4>Blender Source Code:</h4>
	 * <p> Multiple consoles are possible, not just python. </p>
	 * @see #__DNA__FIELD__language
	 */
	
	public void setLanguage(CArrayFacade<Byte> language) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 336;
		} else {
			__dna__offset = 304;
		}
		if (__io__equals(language, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, language)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, language);
		} else {
			__io__generic__copy( getLanguage(), language);
		}
	}

	/**
	 * Get method for struct member 'sel_start'.
	 * @see #__DNA__FIELD__sel_start
	 */
	
	public int getSel_start() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 368);
		} else {
			return __io__block.readInt(__io__address + 336);
		}
	}

	/**
	 * Set method for struct member 'sel_start'.
	 * @see #__DNA__FIELD__sel_start
	 */
	
	public void setSel_start(int sel_start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 368, sel_start);
		} else {
			__io__block.writeInt(__io__address + 336, sel_start);
		}
	}

	/**
	 * Get method for struct member 'sel_end'.
	 * @see #__DNA__FIELD__sel_end
	 */
	
	public int getSel_end() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 372);
		} else {
			return __io__block.readInt(__io__address + 340);
		}
	}

	/**
	 * Set method for struct member 'sel_end'.
	 * @see #__DNA__FIELD__sel_end
	 */
	
	public void setSel_end(int sel_end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 372, sel_end);
		} else {
			__io__block.writeInt(__io__address + 340, sel_end);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpaceConsole> __io__addressof() {
		return new CPointer<SpaceConsole>(__io__address, new Class[]{SpaceConsole.class}, __io__block, __io__blockTable);
	}

}
