package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Nurb'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><h2>Note</h2><p>{@link Nurb}  name is misleading, since it can be used for polygons too, also, it should be NURBS ({@link Nurb}  isn't the singular of Nurbs). </p>  name is misleading, since it can be used for polygons too, also, it should be NURBS (Nurb isn't the singular of Nurbs). 
 * </p>
 */

@CMetaData(size32=64, size64=88)
public class Nurb extends CFacade {

	/**
	 * This is the sdna index of the struct Nurb.
	 * <p>
	 * It is required when allocating a new block to store data for Nurb.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 56;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiple nurbs per curve object are allowed. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;Nurb&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, Nurb.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'Nurb*'</li>
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
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;Nurb&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, Nurb.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'Nurb*'</li>
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
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__type);
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
	 * Field descriptor (offset) for struct member 'mat_nr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index into material list. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__mat_nr);
	 * CPointer&lt;Short&gt; p_mat_nr = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat_nr'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat_nr = new long[]{10, 18};

	/**
	 * Field descriptor (offset) for struct member 'hide'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__hide);
	 * CPointer&lt;Short&gt; p_hide = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hide'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hide = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{14, 22};

	/**
	 * Field descriptor (offset) for struct member 'pntsu'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of points in the U or V directions. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__pntsu);
	 * CPointer&lt;Integer&gt; p_pntsu = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pntsu'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pntsu = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'pntsv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__pntsv);
	 * CPointer&lt;Integer&gt; p_pntsv = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pntsv'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pntsv = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'resolu'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tessellation resolution in the U or V directions. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__resolu);
	 * CPointer&lt;Short&gt; p_resolu = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'resolu'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__resolu = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'resolv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__resolv);
	 * CPointer&lt;Short&gt; p_resolv = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'resolv'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__resolv = new long[]{30, 38};

	/**
	 * Field descriptor (offset) for struct member 'orderu'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__orderu);
	 * CPointer&lt;Short&gt; p_orderu = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orderu'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orderu = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'orderv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__orderv);
	 * CPointer&lt;Short&gt; p_orderv = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orderv'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orderv = new long[]{34, 42};

	/**
	 * Field descriptor (offset) for struct member 'flagu'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__flagu);
	 * CPointer&lt;Short&gt; p_flagu = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flagu'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flagu = new long[]{36, 44};

	/**
	 * Field descriptor (offset) for struct member 'flagv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__flagv);
	 * CPointer&lt;Short&gt; p_flagv = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flagv'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flagv = new long[]{38, 46};

	/**
	 * Field descriptor (offset) for struct member 'knotsu'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__knotsu);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_knotsu = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'knotsu'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__knotsu = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'knotsv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__knotsv);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_knotsv = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'knotsv'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__knotsv = new long[]{44, 56};

	/**
	 * Field descriptor (offset) for struct member 'bp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__bp);
	 * CPointer&lt;CPointer&lt;BPoint&gt;&gt; p_bp = p.cast(new Class[]{CPointer.class, BPoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bp'</li>
	 * <li>Signature: 'BPoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bp = new long[]{48, 64};

	/**
	 * Field descriptor (offset) for struct member 'bezt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__bezt);
	 * CPointer&lt;CPointer&lt;BezTriple&gt;&gt; p_bezt = p.cast(new Class[]{CPointer.class, BezTriple.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bezt'</li>
	 * <li>Signature: 'BezTriple*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bezt = new long[]{52, 72};

	/**
	 * Field descriptor (offset) for struct member 'tilt_interp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> KEY_LINEAR, KEY_CARDINAL, KEY_BSPLINE. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__tilt_interp);
	 * CPointer&lt;Short&gt; p_tilt_interp = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tilt_interp'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tilt_interp = new long[]{56, 80};

	/**
	 * Field descriptor (offset) for struct member 'radius_interp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__radius_interp);
	 * CPointer&lt;Short&gt; p_radius_interp = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'radius_interp'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__radius_interp = new long[]{58, 82};

	/**
	 * Field descriptor (offset) for struct member 'charidx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> only used for dynamically generated Nurbs created from OB_FONT's </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Nurb nurb = ...;
	 * CPointer&lt;Object&gt; p = nurb.__dna__addressof(Nurb.__DNA__FIELD__charidx);
	 * CPointer&lt;Integer&gt; p_charidx = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'charidx'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__charidx = new long[]{60, 84};

	public Nurb(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Nurb(Nurb that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiple nurbs per curve object are allowed. </p>
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<Nurb> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Nurb.class};
		return new CPointer<Nurb>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Nurb.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiple nurbs per curve object are allowed. </p>
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<Nurb> next) throws IOException
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
	
	public CPointer<Nurb> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Nurb.class};
		return new CPointer<Nurb>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Nurb.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<Nurb> prev) throws IOException
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
	 * Get method for struct member 'mat_nr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index into material list. </p>
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public short getMat_nr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'mat_nr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Index into material list. </p>
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public void setMat_nr(short mat_nr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, mat_nr);
		} else {
			__io__block.writeShort(__io__address + 10, mat_nr);
		}
	}

	/**
	 * Get method for struct member 'hide'.
	 * @see #__DNA__FIELD__hide
	 */
	
	public short getHide() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'hide'.
	 * @see #__DNA__FIELD__hide
	 */
	
	public void setHide(short hide) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, hide);
		} else {
			__io__block.writeShort(__io__address + 12, hide);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 22);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 22, flag);
		} else {
			__io__block.writeShort(__io__address + 14, flag);
		}
	}

	/**
	 * Get method for struct member 'pntsu'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of points in the U or V directions. </p>
	 * @see #__DNA__FIELD__pntsu
	 */
	
	public int getPntsu() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'pntsu'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of points in the U or V directions. </p>
	 * @see #__DNA__FIELD__pntsu
	 */
	
	public void setPntsu(int pntsu) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, pntsu);
		} else {
			__io__block.writeInt(__io__address + 16, pntsu);
		}
	}

	/**
	 * Get method for struct member 'pntsv'.
	 * @see #__DNA__FIELD__pntsv
	 */
	
	public int getPntsv() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'pntsv'.
	 * @see #__DNA__FIELD__pntsv
	 */
	
	public void setPntsv(int pntsv) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, pntsv);
		} else {
			__io__block.writeInt(__io__address + 20, pntsv);
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
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 32;
		} else {
			__dna__offset = 24;
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
	 * Get method for struct member 'resolu'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tessellation resolution in the U or V directions. </p>
	 * @see #__DNA__FIELD__resolu
	 */
	
	public short getResolu() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 36);
		} else {
			return __io__block.readShort(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'resolu'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tessellation resolution in the U or V directions. </p>
	 * @see #__DNA__FIELD__resolu
	 */
	
	public void setResolu(short resolu) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 36, resolu);
		} else {
			__io__block.writeShort(__io__address + 28, resolu);
		}
	}

	/**
	 * Get method for struct member 'resolv'.
	 * @see #__DNA__FIELD__resolv
	 */
	
	public short getResolv() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 38);
		} else {
			return __io__block.readShort(__io__address + 30);
		}
	}

	/**
	 * Set method for struct member 'resolv'.
	 * @see #__DNA__FIELD__resolv
	 */
	
	public void setResolv(short resolv) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 38, resolv);
		} else {
			__io__block.writeShort(__io__address + 30, resolv);
		}
	}

	/**
	 * Get method for struct member 'orderu'.
	 * @see #__DNA__FIELD__orderu
	 */
	
	public short getOrderu() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 40);
		} else {
			return __io__block.readShort(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'orderu'.
	 * @see #__DNA__FIELD__orderu
	 */
	
	public void setOrderu(short orderu) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 40, orderu);
		} else {
			__io__block.writeShort(__io__address + 32, orderu);
		}
	}

	/**
	 * Get method for struct member 'orderv'.
	 * @see #__DNA__FIELD__orderv
	 */
	
	public short getOrderv() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 42);
		} else {
			return __io__block.readShort(__io__address + 34);
		}
	}

	/**
	 * Set method for struct member 'orderv'.
	 * @see #__DNA__FIELD__orderv
	 */
	
	public void setOrderv(short orderv) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 42, orderv);
		} else {
			__io__block.writeShort(__io__address + 34, orderv);
		}
	}

	/**
	 * Get method for struct member 'flagu'.
	 * @see #__DNA__FIELD__flagu
	 */
	
	public short getFlagu() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 44);
		} else {
			return __io__block.readShort(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'flagu'.
	 * @see #__DNA__FIELD__flagu
	 */
	
	public void setFlagu(short flagu) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 44, flagu);
		} else {
			__io__block.writeShort(__io__address + 36, flagu);
		}
	}

	/**
	 * Get method for struct member 'flagv'.
	 * @see #__DNA__FIELD__flagv
	 */
	
	public short getFlagv() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 46);
		} else {
			return __io__block.readShort(__io__address + 38);
		}
	}

	/**
	 * Set method for struct member 'flagv'.
	 * @see #__DNA__FIELD__flagv
	 */
	
	public void setFlagv(short flagv) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 46, flagv);
		} else {
			__io__block.writeShort(__io__address + 38, flagv);
		}
	}

	/**
	 * Get method for struct member 'knotsu'.
	 * @see #__DNA__FIELD__knotsu
	 */
	
	public CPointer<Float> getKnotsu() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'knotsu'.
	 * @see #__DNA__FIELD__knotsu
	 */
	
	public void setKnotsu(CPointer<Float> knotsu) throws IOException
	{
		long __address = ((knotsu == null) ? 0 : knotsu.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 40, __address);
		}
	}

	/**
	 * Get method for struct member 'knotsv'.
	 * @see #__DNA__FIELD__knotsv
	 */
	
	public CPointer<Float> getKnotsv() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 44);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'knotsv'.
	 * @see #__DNA__FIELD__knotsv
	 */
	
	public void setKnotsv(CPointer<Float> knotsv) throws IOException
	{
		long __address = ((knotsv == null) ? 0 : knotsv.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 56, __address);
		} else {
			__io__block.writeLong(__io__address + 44, __address);
		}
	}

	/**
	 * Get method for struct member 'bp'.
	 * @see #__DNA__FIELD__bp
	 */
	
	public CPointer<BPoint> getBp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BPoint.class};
		return new CPointer<BPoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BPoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bp'.
	 * @see #__DNA__FIELD__bp
	 */
	
	public void setBp(CPointer<BPoint> bp) throws IOException
	{
		long __address = ((bp == null) ? 0 : bp.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 48, __address);
		}
	}

	/**
	 * Get method for struct member 'bezt'.
	 * @see #__DNA__FIELD__bezt
	 */
	
	public CPointer<BezTriple> getBezt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 52);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BezTriple.class};
		return new CPointer<BezTriple>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BezTriple.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bezt'.
	 * @see #__DNA__FIELD__bezt
	 */
	
	public void setBezt(CPointer<BezTriple> bezt) throws IOException
	{
		long __address = ((bezt == null) ? 0 : bezt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 72, __address);
		} else {
			__io__block.writeLong(__io__address + 52, __address);
		}
	}

	/**
	 * Get method for struct member 'tilt_interp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> KEY_LINEAR, KEY_CARDINAL, KEY_BSPLINE. </p>
	 * @see #__DNA__FIELD__tilt_interp
	 */
	
	public short getTilt_interp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 80);
		} else {
			return __io__block.readShort(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'tilt_interp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> KEY_LINEAR, KEY_CARDINAL, KEY_BSPLINE. </p>
	 * @see #__DNA__FIELD__tilt_interp
	 */
	
	public void setTilt_interp(short tilt_interp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 80, tilt_interp);
		} else {
			__io__block.writeShort(__io__address + 56, tilt_interp);
		}
	}

	/**
	 * Get method for struct member 'radius_interp'.
	 * @see #__DNA__FIELD__radius_interp
	 */
	
	public short getRadius_interp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 82);
		} else {
			return __io__block.readShort(__io__address + 58);
		}
	}

	/**
	 * Set method for struct member 'radius_interp'.
	 * @see #__DNA__FIELD__radius_interp
	 */
	
	public void setRadius_interp(short radius_interp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 82, radius_interp);
		} else {
			__io__block.writeShort(__io__address + 58, radius_interp);
		}
	}

	/**
	 * Get method for struct member 'charidx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> only used for dynamically generated Nurbs created from OB_FONT's </p>
	 * @see #__DNA__FIELD__charidx
	 */
	
	public int getCharidx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'charidx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> only used for dynamically generated Nurbs created from OB_FONT's </p>
	 * @see #__DNA__FIELD__charidx
	 */
	
	public void setCharidx(int charidx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, charidx);
		} else {
			__io__block.writeInt(__io__address + 60, charidx);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Nurb> __io__addressof() {
		return new CPointer<Nurb>(__io__address, new Class[]{Nurb.class}, __io__block, __io__blockTable);
	}

}
