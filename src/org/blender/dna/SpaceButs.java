package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpaceButs'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=216, size64=256)
public class SpaceButs extends CFacade {

	/**
	 * This is the sdna index of the struct SpaceButs.
	 * <p>
	 * It is required when allocating a new block to store data for SpaceButs.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 219;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__next);
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
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__prev);
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
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__regionbase);
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
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__spacetype);
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
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__link_flag);
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
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD___pad0);
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
	 * Field descriptor (offset) for struct member 'v2d'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__v2d);
	 * CPointer&lt;View2D&gt; p_v2d = p.cast(new Class[]{View2D.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v2d'</li>
	 * <li>Signature: 'View2D'</li>
	 * <li>Actual Size (32bit/64bit): 156/168</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v2d = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'space_subtype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__space_subtype);
	 * CPointer&lt;Short&gt; p_space_subtype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'space_subtype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__space_subtype = new long[]{180, 208};

	/**
	 * Field descriptor (offset) for struct member 'mainb'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__mainb);
	 * CPointer&lt;Short&gt; p_mainb = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mainb'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mainb = new long[]{182, 210};

	/**
	 * Field descriptor (offset) for struct member 'mainbo'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__mainbo);
	 * CPointer&lt;Short&gt; p_mainbo = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mainbo'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mainbo = new long[]{184, 212};

	/**
	 * Field descriptor (offset) for struct member 'mainbuser'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__mainbuser);
	 * CPointer&lt;Short&gt; p_mainbuser = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mainbuser'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mainbuser = new long[]{186, 214};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__preview);
	 * CPointer&lt;Short&gt; p_preview = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview = new long[]{188, 216};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[5]'</li>
	 * <li>Actual Size (32bit/64bit): 5/5</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{190, 218};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__flag);
	 * CPointer&lt;Byte&gt; p_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{195, 223};

	/**
	 * Field descriptor (offset) for struct member 'path'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__path);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_path = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'path'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__path = new long[]{196, 224};

	/**
	 * Field descriptor (offset) for struct member 'pathflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__pathflag);
	 * CPointer&lt;Integer&gt; p_pathflag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pathflag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pathflag = new long[]{200, 232};

	/**
	 * Field descriptor (offset) for struct member 'dataicon'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__dataicon);
	 * CPointer&lt;Integer&gt; p_dataicon = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dataicon'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dataicon = new long[]{204, 236};

	/**
	 * Field descriptor (offset) for struct member 'pinid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__pinid);
	 * CPointer&lt;CPointer&lt;ID&gt;&gt; p_pinid = p.cast(new Class[]{CPointer.class, ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pinid'</li>
	 * <li>Signature: 'ID*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pinid = new long[]{208, 240};

	/**
	 * Field descriptor (offset) for struct member 'texuser'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceButs spacebuts = ...;
	 * CPointer&lt;Object&gt; p = spacebuts.__dna__addressof(SpaceButs.__DNA__FIELD__texuser);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_texuser = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'texuser'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__texuser = new long[]{212, 248};

	public SpaceButs(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpaceButs(SpaceButs that) {
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
	 * Get method for struct member 'v2d'.
	 * @see #__DNA__FIELD__v2d
	 */
	
	public View2D getV2d() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new View2D(__io__address + 40, __io__block, __io__blockTable);
		} else {
			return new View2D(__io__address + 24, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'v2d'.
	 * @see #__DNA__FIELD__v2d
	 */
	
	public void setV2d(View2D v2d) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(v2d, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, v2d)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, v2d);
		} else {
			__io__generic__copy( getV2d(), v2d);
		}
	}

	/**
	 * Get method for struct member 'space_subtype'.
	 * @see #__DNA__FIELD__space_subtype
	 */
	
	public short getSpace_subtype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 208);
		} else {
			return __io__block.readShort(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'space_subtype'.
	 * @see #__DNA__FIELD__space_subtype
	 */
	
	public void setSpace_subtype(short space_subtype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 208, space_subtype);
		} else {
			__io__block.writeShort(__io__address + 180, space_subtype);
		}
	}

	/**
	 * Get method for struct member 'mainb'.
	 * @see #__DNA__FIELD__mainb
	 */
	
	public short getMainb() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 210);
		} else {
			return __io__block.readShort(__io__address + 182);
		}
	}

	/**
	 * Set method for struct member 'mainb'.
	 * @see #__DNA__FIELD__mainb
	 */
	
	public void setMainb(short mainb) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 210, mainb);
		} else {
			__io__block.writeShort(__io__address + 182, mainb);
		}
	}

	/**
	 * Get method for struct member 'mainbo'.
	 * @see #__DNA__FIELD__mainbo
	 */
	
	public short getMainbo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 212);
		} else {
			return __io__block.readShort(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'mainbo'.
	 * @see #__DNA__FIELD__mainbo
	 */
	
	public void setMainbo(short mainbo) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 212, mainbo);
		} else {
			__io__block.writeShort(__io__address + 184, mainbo);
		}
	}

	/**
	 * Get method for struct member 'mainbuser'.
	 * @see #__DNA__FIELD__mainbuser
	 */
	
	public short getMainbuser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 214);
		} else {
			return __io__block.readShort(__io__address + 186);
		}
	}

	/**
	 * Set method for struct member 'mainbuser'.
	 * @see #__DNA__FIELD__mainbuser
	 */
	
	public void setMainbuser(short mainbuser) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 214, mainbuser);
		} else {
			__io__block.writeShort(__io__address + 186, mainbuser);
		}
	}

	/**
	 * Get method for struct member 'preview'.
	 * @see #__DNA__FIELD__preview
	 */
	
	public short getPreview() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 216);
		} else {
			return __io__block.readShort(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'preview'.
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(short preview) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 216, preview);
		} else {
			__io__block.writeShort(__io__address + 188, preview);
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
			5
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 218, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 190, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 218;
		} else {
			__dna__offset = 190;
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
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public byte getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 223);
		} else {
			return __io__block.readByte(__io__address + 195);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(byte flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 223, flag);
		} else {
			__io__block.writeByte(__io__address + 195, flag);
		}
	}

	/**
	 * Get method for struct member 'path'.
	 * @see #__DNA__FIELD__path
	 */
	
	public CPointer<Object> getPath() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 196);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'path'.
	 * @see #__DNA__FIELD__path
	 */
	
	public void setPath(CPointer<Object> path) throws IOException
	{
		long __address = ((path == null) ? 0 : path.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 196, __address);
		}
	}

	/**
	 * Get method for struct member 'pathflag'.
	 * @see #__DNA__FIELD__pathflag
	 */
	
	public int getPathflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 232);
		} else {
			return __io__block.readInt(__io__address + 200);
		}
	}

	/**
	 * Set method for struct member 'pathflag'.
	 * @see #__DNA__FIELD__pathflag
	 */
	
	public void setPathflag(int pathflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 232, pathflag);
		} else {
			__io__block.writeInt(__io__address + 200, pathflag);
		}
	}

	/**
	 * Get method for struct member 'dataicon'.
	 * @see #__DNA__FIELD__dataicon
	 */
	
	public int getDataicon() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 236);
		} else {
			return __io__block.readInt(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'dataicon'.
	 * @see #__DNA__FIELD__dataicon
	 */
	
	public void setDataicon(int dataicon) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 236, dataicon);
		} else {
			__io__block.writeInt(__io__address + 204, dataicon);
		}
	}

	/**
	 * Get method for struct member 'pinid'.
	 * @see #__DNA__FIELD__pinid
	 */
	
	public CPointer<ID> getPinid() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ID.class};
		return new CPointer<ID>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ID.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pinid'.
	 * @see #__DNA__FIELD__pinid
	 */
	
	public void setPinid(CPointer<ID> pinid) throws IOException
	{
		long __address = ((pinid == null) ? 0 : pinid.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 240, __address);
		} else {
			__io__block.writeLong(__io__address + 208, __address);
		}
	}

	/**
	 * Get method for struct member 'texuser'.
	 * @see #__DNA__FIELD__texuser
	 */
	
	public CPointer<Object> getTexuser() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 212);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'texuser'.
	 * @see #__DNA__FIELD__texuser
	 */
	
	public void setTexuser(CPointer<Object> texuser) throws IOException
	{
		long __address = ((texuser == null) ? 0 : texuser.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 248, __address);
		} else {
			__io__block.writeLong(__io__address + 212, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpaceButs> __io__addressof() {
		return new CPointer<SpaceButs>(__io__address, new Class[]{SpaceButs.class}, __io__block, __io__blockTable);
	}

}
