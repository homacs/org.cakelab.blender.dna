package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ScrArea'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=96, size64=160)
public class ScrArea extends CFacade {

	/**
	 * This is the sdna index of the struct ScrArea.
	 * <p>
	 * It is required when allocating a new block to store data for ScrArea.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 262;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;ScrArea&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, ScrArea.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'ScrArea*'</li>
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
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;ScrArea&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, ScrArea.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'ScrArea*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'v1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__v1);
	 * CPointer&lt;CPointer&lt;ScrVert&gt;&gt; p_v1 = p.cast(new Class[]{CPointer.class, ScrVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v1'</li>
	 * <li>Signature: 'ScrVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v1 = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'v2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__v2);
	 * CPointer&lt;CPointer&lt;ScrVert&gt;&gt; p_v2 = p.cast(new Class[]{CPointer.class, ScrVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v2'</li>
	 * <li>Signature: 'ScrVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v2 = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'v3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__v3);
	 * CPointer&lt;CPointer&lt;ScrVert&gt;&gt; p_v3 = p.cast(new Class[]{CPointer.class, ScrVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v3'</li>
	 * <li>Signature: 'ScrVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v3 = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'v4'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ordered (bl, tl, tr, br) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__v4);
	 * CPointer&lt;CPointer&lt;ScrVert&gt;&gt; p_v4 = p.cast(new Class[]{CPointer.class, ScrVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v4'</li>
	 * <li>Signature: 'ScrVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v4 = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'full'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if area==full, this is the parent </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__full);
	 * CPointer&lt;CPointer&lt;bScreen&gt;&gt; p_full = p.cast(new Class[]{CPointer.class, bScreen.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'full'</li>
	 * <li>Signature: 'bScreen*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__full = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member 'totrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rect bound by v1 v2 v3 v4 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__totrct);
	 * CPointer&lt;rcti&gt; p_totrct = p.cast(new Class[]{rcti.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totrct'</li>
	 * <li>Signature: 'rcti'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totrct = new long[]{28, 56};

	/**
	 * Field descriptor (offset) for struct member 'spacetype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__spacetype);
	 * CPointer&lt;Byte&gt; p_spacetype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacetype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacetype = new long[]{44, 72};

	/**
	 * Field descriptor (offset) for struct member 'butspacetype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> SPACE_..., butspacetype is button arg </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__butspacetype);
	 * CPointer&lt;Byte&gt; p_butspacetype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'butspacetype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__butspacetype = new long[]{45, 73};

	/**
	 * Field descriptor (offset) for struct member 'winx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__winx);
	 * CPointer&lt;Short&gt; p_winx = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'winx'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__winx = new long[]{46, 74};

	/**
	 * Field descriptor (offset) for struct member 'winy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__winy);
	 * CPointer&lt;Short&gt; p_winy = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'winy'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__winy = new long[]{48, 76};

	/**
	 * Field descriptor (offset) for struct member 'headertype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> OLD! 0=no header, 1= down, 2= up </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__headertype);
	 * CPointer&lt;Short&gt; p_headertype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'headertype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__headertype = new long[]{50, 78};

	/**
	 * Field descriptor (offset) for struct member 'do_refresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, for spacetype refresh callback </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__do_refresh);
	 * CPointer&lt;Short&gt; p_do_refresh = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'do_refresh'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__do_refresh = new long[]{52, 80};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{54, 82};

	/**
	 * Field descriptor (offset) for struct member 'region_active_win'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> index of last used region of 'RGN_TYPE_WINDOW' runtime variable, updated by executing operators </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__region_active_win);
	 * CPointer&lt;Short&gt; p_region_active_win = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'region_active_win'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__region_active_win = new long[]{56, 84};

	/**
	 * Field descriptor (offset) for struct member 'temp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__temp);
	 * CPointer&lt;Byte&gt; p_temp = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'temp'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__temp = new long[]{58, 86};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__pad);
	 * CPointer&lt;Byte&gt; p_pad = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{59, 87};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> callbacks for this space type </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__type);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_type = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'SpaceType*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{60, 88};

	/**
	 * Field descriptor (offset) for struct member 'spacedata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> A list of space links (editors) that were open in this area before. When changing the editor type, we try to reuse old editor data from this list. The first item is the active/visible one.SpaceLink </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__spacedata);
	 * CPointer&lt;ListBase&gt; p_spacedata = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacedata'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacedata = new long[]{64, 96};

	/**
	 * Field descriptor (offset) for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NOTE: This region list is the one from the active/visible editor (first item in spacedata list). Use {@link SpaceLink.regionbase}  if it's inactive (but only then)!ARegion </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__regionbase);
	 * CPointer&lt;ListBase&gt; p_regionbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'regionbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__regionbase = new long[]{72, 112};

	/**
	 * Field descriptor (offset) for struct member 'handlers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> wmEventHandler </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__handlers);
	 * CPointer&lt;ListBase&gt; p_handlers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handlers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handlers = new long[]{80, 128};

	/**
	 * Field descriptor (offset) for struct member 'actionzones'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> AZone </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrArea scrarea = ...;
	 * CPointer&lt;Object&gt; p = scrarea.__dna__addressof(ScrArea.__DNA__FIELD__actionzones);
	 * CPointer&lt;ListBase&gt; p_actionzones = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'actionzones'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__actionzones = new long[]{88, 144};

	public ScrArea(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ScrArea(ScrArea that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<ScrArea> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ScrArea.class};
		return new CPointer<ScrArea>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ScrArea.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<ScrArea> next) throws IOException
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
	
	public CPointer<ScrArea> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ScrArea.class};
		return new CPointer<ScrArea>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ScrArea.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<ScrArea> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'v1'.
	 * @see #__DNA__FIELD__v1
	 */
	
	public CPointer<ScrVert> getV1() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ScrVert.class};
		return new CPointer<ScrVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ScrVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'v1'.
	 * @see #__DNA__FIELD__v1
	 */
	
	public void setV1(CPointer<ScrVert> v1) throws IOException
	{
		long __address = ((v1 == null) ? 0 : v1.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'v2'.
	 * @see #__DNA__FIELD__v2
	 */
	
	public CPointer<ScrVert> getV2() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ScrVert.class};
		return new CPointer<ScrVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ScrVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'v2'.
	 * @see #__DNA__FIELD__v2
	 */
	
	public void setV2(CPointer<ScrVert> v2) throws IOException
	{
		long __address = ((v2 == null) ? 0 : v2.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'v3'.
	 * @see #__DNA__FIELD__v3
	 */
	
	public CPointer<ScrVert> getV3() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ScrVert.class};
		return new CPointer<ScrVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ScrVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'v3'.
	 * @see #__DNA__FIELD__v3
	 */
	
	public void setV3(CPointer<ScrVert> v3) throws IOException
	{
		long __address = ((v3 == null) ? 0 : v3.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'v4'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ordered (bl, tl, tr, br) </p>
	 * @see #__DNA__FIELD__v4
	 */
	
	public CPointer<ScrVert> getV4() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ScrVert.class};
		return new CPointer<ScrVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ScrVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'v4'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ordered (bl, tl, tr, br) </p>
	 * @see #__DNA__FIELD__v4
	 */
	
	public void setV4(CPointer<ScrVert> v4) throws IOException
	{
		long __address = ((v4 == null) ? 0 : v4.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'full'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if area==full, this is the parent </p>
	 * @see #__DNA__FIELD__full
	 */
	
	public CPointer<bScreen> getFull() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bScreen.class};
		return new CPointer<bScreen>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bScreen.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'full'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> if area==full, this is the parent </p>
	 * @see #__DNA__FIELD__full
	 */
	
	public void setFull(CPointer<bScreen> full) throws IOException
	{
		long __address = ((full == null) ? 0 : full.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'totrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rect bound by v1 v2 v3 v4 </p>
	 * @see #__DNA__FIELD__totrct
	 */
	
	public rcti getTotrct() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rcti(__io__address + 56, __io__block, __io__blockTable);
		} else {
			return new rcti(__io__address + 28, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'totrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> rect bound by v1 v2 v3 v4 </p>
	 * @see #__DNA__FIELD__totrct
	 */
	
	public void setTotrct(rcti totrct) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(totrct, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, totrct)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, totrct);
		} else {
			__io__generic__copy( getTotrct(), totrct);
		}
	}

	/**
	 * Get method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public byte getSpacetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 72);
		} else {
			return __io__block.readByte(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public void setSpacetype(byte spacetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 72, spacetype);
		} else {
			__io__block.writeByte(__io__address + 44, spacetype);
		}
	}

	/**
	 * Get method for struct member 'butspacetype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> SPACE_..., butspacetype is button arg </p>
	 * @see #__DNA__FIELD__butspacetype
	 */
	
	public byte getButspacetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 73);
		} else {
			return __io__block.readByte(__io__address + 45);
		}
	}

	/**
	 * Set method for struct member 'butspacetype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> SPACE_..., butspacetype is button arg </p>
	 * @see #__DNA__FIELD__butspacetype
	 */
	
	public void setButspacetype(byte butspacetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 73, butspacetype);
		} else {
			__io__block.writeByte(__io__address + 45, butspacetype);
		}
	}

	/**
	 * Get method for struct member 'winx'.
	 * @see #__DNA__FIELD__winx
	 */
	
	public short getWinx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 74);
		} else {
			return __io__block.readShort(__io__address + 46);
		}
	}

	/**
	 * Set method for struct member 'winx'.
	 * @see #__DNA__FIELD__winx
	 */
	
	public void setWinx(short winx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 74, winx);
		} else {
			__io__block.writeShort(__io__address + 46, winx);
		}
	}

	/**
	 * Get method for struct member 'winy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size </p>
	 * @see #__DNA__FIELD__winy
	 */
	
	public short getWiny() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 76);
		} else {
			return __io__block.readShort(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'winy'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size </p>
	 * @see #__DNA__FIELD__winy
	 */
	
	public void setWiny(short winy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 76, winy);
		} else {
			__io__block.writeShort(__io__address + 48, winy);
		}
	}

	/**
	 * Get method for struct member 'headertype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> OLD! 0=no header, 1= down, 2= up </p>
	 * @see #__DNA__FIELD__headertype
	 */
	
	public short getHeadertype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 78);
		} else {
			return __io__block.readShort(__io__address + 50);
		}
	}

	/**
	 * Set method for struct member 'headertype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> OLD! 0=no header, 1= down, 2= up </p>
	 * @see #__DNA__FIELD__headertype
	 */
	
	public void setHeadertype(short headertype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 78, headertype);
		} else {
			__io__block.writeShort(__io__address + 50, headertype);
		}
	}

	/**
	 * Get method for struct member 'do_refresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, for spacetype refresh callback </p>
	 * @see #__DNA__FIELD__do_refresh
	 */
	
	public short getDo_refresh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 80);
		} else {
			return __io__block.readShort(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'do_refresh'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> private, for spacetype refresh callback </p>
	 * @see #__DNA__FIELD__do_refresh
	 */
	
	public void setDo_refresh(short do_refresh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 80, do_refresh);
		} else {
			__io__block.writeShort(__io__address + 52, do_refresh);
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
			return __io__block.readShort(__io__address + 54);
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
			__io__block.writeShort(__io__address + 54, flag);
		}
	}

	/**
	 * Get method for struct member 'region_active_win'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> index of last used region of 'RGN_TYPE_WINDOW' runtime variable, updated by executing operators </p>
	 * @see #__DNA__FIELD__region_active_win
	 */
	
	public short getRegion_active_win() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 84);
		} else {
			return __io__block.readShort(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'region_active_win'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> index of last used region of 'RGN_TYPE_WINDOW' runtime variable, updated by executing operators </p>
	 * @see #__DNA__FIELD__region_active_win
	 */
	
	public void setRegion_active_win(short region_active_win) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 84, region_active_win);
		} else {
			__io__block.writeShort(__io__address + 56, region_active_win);
		}
	}

	/**
	 * Get method for struct member 'temp'.
	 * @see #__DNA__FIELD__temp
	 */
	
	public byte getTemp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 86);
		} else {
			return __io__block.readByte(__io__address + 58);
		}
	}

	/**
	 * Set method for struct member 'temp'.
	 * @see #__DNA__FIELD__temp
	 */
	
	public void setTemp(byte temp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 86, temp);
		} else {
			__io__block.writeByte(__io__address + 58, temp);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public byte getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 87);
		} else {
			return __io__block.readByte(__io__address + 59);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(byte pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 87, pad);
		} else {
			__io__block.writeByte(__io__address + 59, pad);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> callbacks for this space type </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public CPointer<Object> getType() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 60);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> callbacks for this space type </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(CPointer<Object> type) throws IOException
	{
		long __address = ((type == null) ? 0 : type.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 60, __address);
		}
	}

	/**
	 * Get method for struct member 'spacedata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> A list of space links (editors) that were open in this area before. When changing the editor type, we try to reuse old editor data from this list. The first item is the active/visible one.SpaceLink </p>
	 * @see #__DNA__FIELD__spacedata
	 */
	
	public ListBase getSpacedata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 96, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 64, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'spacedata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> A list of space links (editors) that were open in this area before. When changing the editor type, we try to reuse old editor data from this list. The first item is the active/visible one.SpaceLink </p>
	 * @see #__DNA__FIELD__spacedata
	 */
	
	public void setSpacedata(ListBase spacedata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(spacedata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, spacedata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, spacedata);
		} else {
			__io__generic__copy( getSpacedata(), spacedata);
		}
	}

	/**
	 * Get method for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NOTE: This region list is the one from the active/visible editor (first item in spacedata list). Use {@link SpaceLink.regionbase}  if it's inactive (but only then)!ARegion </p>
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public ListBase getRegionbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 112, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 72, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'regionbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> NOTE: This region list is the one from the active/visible editor (first item in spacedata list). Use {@link SpaceLink.regionbase}  if it's inactive (but only then)!ARegion </p>
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public void setRegionbase(ListBase regionbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 112;
		} else {
			__dna__offset = 72;
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
	 * Get method for struct member 'handlers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> wmEventHandler </p>
	 * @see #__DNA__FIELD__handlers
	 */
	
	public ListBase getHandlers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 128, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 80, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handlers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> wmEventHandler </p>
	 * @see #__DNA__FIELD__handlers
	 */
	
	public void setHandlers(ListBase handlers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(handlers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handlers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handlers);
		} else {
			__io__generic__copy( getHandlers(), handlers);
		}
	}

	/**
	 * Get method for struct member 'actionzones'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> AZone </p>
	 * @see #__DNA__FIELD__actionzones
	 */
	
	public ListBase getActionzones() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 144, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 88, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'actionzones'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> AZone </p>
	 * @see #__DNA__FIELD__actionzones
	 */
	
	public void setActionzones(ListBase actionzones) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 88;
		}
		if (__io__equals(actionzones, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, actionzones)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, actionzones);
		} else {
			__io__generic__copy( getActionzones(), actionzones);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ScrArea> __io__addressof() {
		return new CPointer<ScrArea>(__io__address, new Class[]{ScrArea.class}, __io__block, __io__blockTable);
	}

}
