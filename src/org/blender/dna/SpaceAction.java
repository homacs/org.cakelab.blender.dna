package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpaceAction'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Action Editor Space. This is defined here instead of in {@link DNA_space_types.h}  </p>
 */

@CMetaData(size32=304, size64=352)
public class SpaceAction extends CFacade {

	/**
	 * This is the sdna index of the struct SpaceAction.
	 * <p>
	 * It is required when allocating a new block to store data for SpaceAction.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 324;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__next);
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
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__prev);
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
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__regionbase);
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
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__spacetype);
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
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__link_flag);
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
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD___pad0);
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. Copied to region. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__v2d);
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
	 * Field descriptor (offset) for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The currently active action. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__action);
	 * CPointer&lt;CPointer&lt;bAction&gt;&gt; p_action = p.cast(new Class[]{CPointer.class, bAction.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'action'</li>
	 * <li>Signature: 'bAction*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__action = new long[]{180, 208};

	/**
	 * Field descriptor (offset) for struct member 'ads'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The currently active context (when not showing action). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__ads);
	 * CPointer&lt;bDopeSheet&gt; p_ads = p.cast(new Class[]{bDopeSheet.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ads'</li>
	 * <li>Signature: 'bDopeSheet'</li>
	 * <li>Actual Size (32bit/64bit): 96/112</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ads = new long[]{184, 216};

	/**
	 * Field descriptor (offset) for struct member 'timeslide'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For Time-Slide transform mode drawing - current frame?. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__timeslide);
	 * CPointer&lt;Float&gt; p_timeslide = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'timeslide'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__timeslide = new long[]{280, 328};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{284, 332};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Editing}  context </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__mode);
	 * CPointer&lt;Byte&gt; p_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{286, 334};

	/**
	 * Field descriptor (offset) for struct member 'mode_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Storage for sub-space types. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__mode_prev);
	 * CPointer&lt;Byte&gt; p_mode_prev = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode_prev'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode_prev = new long[]{287, 335};

	/**
	 * Field descriptor (offset) for struct member 'autosnap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Automatic keyframe snapping mode . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__autosnap);
	 * CPointer&lt;Byte&gt; p_autosnap = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'autosnap'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__autosnap = new long[]{288, 336};

	/**
	 * Field descriptor (offset) for struct member 'cache_display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eTimeline_Cache_Flag). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__cache_display);
	 * CPointer&lt;Byte&gt; p_cache_display = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_display'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_display = new long[]{289, 337};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{290, 338};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceAction spaceaction = ...;
	 * CPointer&lt;Object&gt; p = spaceaction.__dna__addressof(SpaceAction.__DNA__FIELD__runtime);
	 * CPointer&lt;SpaceAction_Runtime&gt; p_runtime = p.cast(new Class[]{SpaceAction_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'SpaceAction_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{296, 344};

	public SpaceAction(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpaceAction(SpaceAction that) {
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
	 * Get method for struct member 'v2d'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. Copied to region. 
	 * @deprecated
	 *  Deprecated</p>
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End '{@link SpaceLink} ' header. Copied to region. 
	 * @deprecated
	 *  Deprecated</p>
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
	 * Get method for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The currently active action. </p>
	 * @see #__DNA__FIELD__action
	 */
	
	public CPointer<bAction> getAction() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 180);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bAction.class};
		return new CPointer<bAction>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bAction.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'action'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The currently active action. </p>
	 * @see #__DNA__FIELD__action
	 */
	
	public void setAction(CPointer<bAction> action) throws IOException
	{
		long __address = ((action == null) ? 0 : action.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 180, __address);
		}
	}

	/**
	 * Get method for struct member 'ads'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The currently active context (when not showing action). </p>
	 * @see #__DNA__FIELD__ads
	 */
	
	public bDopeSheet getAds() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bDopeSheet(__io__address + 216, __io__block, __io__blockTable);
		} else {
			return new bDopeSheet(__io__address + 184, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ads'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> The currently active context (when not showing action). </p>
	 * @see #__DNA__FIELD__ads
	 */
	
	public void setAds(bDopeSheet ads) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 216;
		} else {
			__dna__offset = 184;
		}
		if (__io__equals(ads, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ads)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ads);
		} else {
			__io__generic__copy( getAds(), ads);
		}
	}

	/**
	 * Get method for struct member 'timeslide'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For Time-Slide transform mode drawing - current frame?. </p>
	 * @see #__DNA__FIELD__timeslide
	 */
	
	public float getTimeslide() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 328);
		} else {
			return __io__block.readFloat(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'timeslide'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For Time-Slide transform mode drawing - current frame?. </p>
	 * @see #__DNA__FIELD__timeslide
	 */
	
	public void setTimeslide(float timeslide) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 328, timeslide);
		} else {
			__io__block.writeFloat(__io__address + 280, timeslide);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 332);
		} else {
			return __io__block.readShort(__io__address + 284);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 332, flag);
		} else {
			__io__block.writeShort(__io__address + 284, flag);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Editing}  context </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public byte getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 334);
		} else {
			return __io__block.readByte(__io__address + 286);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Editing}  context </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(byte mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 334, mode);
		} else {
			__io__block.writeByte(__io__address + 286, mode);
		}
	}

	/**
	 * Get method for struct member 'mode_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Storage for sub-space types. </p>
	 * @see #__DNA__FIELD__mode_prev
	 */
	
	public byte getMode_prev() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 335);
		} else {
			return __io__block.readByte(__io__address + 287);
		}
	}

	/**
	 * Set method for struct member 'mode_prev'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Storage for sub-space types. </p>
	 * @see #__DNA__FIELD__mode_prev
	 */
	
	public void setMode_prev(byte mode_prev) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 335, mode_prev);
		} else {
			__io__block.writeByte(__io__address + 287, mode_prev);
		}
	}

	/**
	 * Get method for struct member 'autosnap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Automatic keyframe snapping mode . </p>
	 * @see #__DNA__FIELD__autosnap
	 */
	
	public byte getAutosnap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 336);
		} else {
			return __io__block.readByte(__io__address + 288);
		}
	}

	/**
	 * Set method for struct member 'autosnap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Automatic keyframe snapping mode . </p>
	 * @see #__DNA__FIELD__autosnap
	 */
	
	public void setAutosnap(byte autosnap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 336, autosnap);
		} else {
			__io__block.writeByte(__io__address + 288, autosnap);
		}
	}

	/**
	 * Get method for struct member 'cache_display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eTimeline_Cache_Flag). </p>
	 * @see #__DNA__FIELD__cache_display
	 */
	
	public byte getCache_display() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 337);
		} else {
			return __io__block.readByte(__io__address + 289);
		}
	}

	/**
	 * Set method for struct member 'cache_display'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (eTimeline_Cache_Flag). </p>
	 * @see #__DNA__FIELD__cache_display
	 */
	
	public void setCache_display(byte cache_display) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 337, cache_display);
		} else {
			__io__block.writeByte(__io__address + 289, cache_display);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 338, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 290, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 338;
		} else {
			__dna__offset = 290;
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
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public SpaceAction_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new SpaceAction_Runtime(__io__address + 344, __io__block, __io__blockTable);
		} else {
			return new SpaceAction_Runtime(__io__address + 296, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(SpaceAction_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 344;
		} else {
			__dna__offset = 296;
		}
		if (__io__equals(runtime, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, runtime)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, runtime);
		} else {
			__io__generic__copy( getRuntime(), runtime);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpaceAction> __io__addressof() {
		return new CPointer<SpaceAction>(__io__address, new Class[]{SpaceAction.class}, __io__block, __io__blockTable);
	}

}
