package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'IpoCurve'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><mdash/>  IPO {@link Curve}  <mdash/>  IPO {@link Curve}  </p>
 */

@CMetaData(size32=92, size64=112)
public class IpoCurve extends CFacade {

	/**
	 * This is the sdna index of the struct IpoCurve.
	 * <p>
	 * It is required when allocating a new block to store data for IpoCurve.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 19;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;IpoCurve&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, IpoCurve.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'IpoCurve*'</li>
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
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;IpoCurve&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, IpoCurve.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'IpoCurve*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'bp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of BPoints (sizeof(BPoint) * totvert) - i.e. baked/imported data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__bp);
	 * CPointer&lt;CPointer&lt;BPoint&gt;&gt; p_bp = p.cast(new Class[]{CPointer.class, BPoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bp'</li>
	 * <li>Signature: 'BPoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bp = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'bezt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of BezTriples (sizeof(BezTriple) * totvert) - i.e. user-editable keyframes . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__bezt);
	 * CPointer&lt;CPointer&lt;BezTriple&gt;&gt; p_bezt = p.cast(new Class[]{CPointer.class, BezTriple.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bezt'</li>
	 * <li>Signature: 'BezTriple*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bezt = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'maxrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bounding boxes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__maxrct);
	 * CPointer&lt;rctf&gt; p_maxrct = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxrct'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxrct = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'totrct'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__totrct);
	 * CPointer&lt;rctf&gt; p_totrct = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totrct'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totrct = new long[]{32, 48};

	/**
	 * Field descriptor (offset) for struct member 'blocktype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blocktype= ipo-blocktype; adrcode= type of ipo-curve; vartype= 'format' of data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__blocktype);
	 * CPointer&lt;Short&gt; p_blocktype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blocktype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blocktype = new long[]{48, 64};

	/**
	 * Field descriptor (offset) for struct member 'adrcode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__adrcode);
	 * CPointer&lt;Short&gt; p_adrcode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adrcode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adrcode = new long[]{50, 66};

	/**
	 * Field descriptor (offset) for struct member 'vartype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__vartype);
	 * CPointer&lt;Short&gt; p_vartype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vartype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vartype = new long[]{52, 68};

	/**
	 * Field descriptor (offset) for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total number of BezTriples (i.e. keyframes) on curve. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__totvert);
	 * CPointer&lt;Short&gt; p_totvert = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totvert'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totvert = new long[]{54, 70};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Interpolation and extrapolation modes . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__ipo);
	 * CPointer&lt;Short&gt; p_ipo = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{56, 72};

	/**
	 * Field descriptor (offset) for struct member 'extrap'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__extrap);
	 * CPointer&lt;Short&gt; p_extrap = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'extrap'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__extrap = new long[]{58, 74};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag= settings; rt= ???. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{60, 76};

	/**
	 * Field descriptor (offset) for struct member 'rt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__rt);
	 * CPointer&lt;Short&gt; p_rt = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rt'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rt = new long[]{62, 78};

	/**
	 * Field descriptor (offset) for struct member 'ymin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimum/maximum y-extents for curve. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__ymin);
	 * CPointer&lt;Float&gt; p_ymin = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ymin'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ymin = new long[]{64, 80};

	/**
	 * Field descriptor (offset) for struct member 'ymax'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__ymax);
	 * CPointer&lt;Float&gt; p_ymax = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ymax'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ymax = new long[]{68, 84};

	/**
	 * Field descriptor (offset) for struct member 'bitmask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ???. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__bitmask);
	 * CPointer&lt;Integer&gt; p_bitmask = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bitmask'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bitmask = new long[]{72, 88};

	/**
	 * Field descriptor (offset) for struct member 'slide_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimum/maximum values for sliders (in action editor). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__slide_min);
	 * CPointer&lt;Float&gt; p_slide_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slide_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slide_min = new long[]{76, 92};

	/**
	 * Field descriptor (offset) for struct member 'slide_max'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__slide_max);
	 * CPointer&lt;Float&gt; p_slide_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slide_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slide_max = new long[]{80, 96};

	/**
	 * Field descriptor (offset) for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Value of ipo-curve for current frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__curval);
	 * CPointer&lt;Float&gt; p_curval = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curval'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curval = new long[]{84, 100};

	/**
	 * Field descriptor (offset) for struct member 'driver'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to ipo-driver for this curve. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IpoCurve ipocurve = ...;
	 * CPointer&lt;Object&gt; p = ipocurve.__dna__addressof(IpoCurve.__DNA__FIELD__driver);
	 * CPointer&lt;CPointer&lt;IpoDriver&gt;&gt; p_driver = p.cast(new Class[]{CPointer.class, IpoDriver.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'driver'</li>
	 * <li>Signature: 'IpoDriver*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__driver = new long[]{88, 104};

	public IpoCurve(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected IpoCurve(IpoCurve that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<IpoCurve> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IpoCurve.class};
		return new CPointer<IpoCurve>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IpoCurve.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<IpoCurve> next) throws IOException
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
	
	public CPointer<IpoCurve> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IpoCurve.class};
		return new CPointer<IpoCurve>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IpoCurve.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<IpoCurve> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'bp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of BPoints (sizeof(BPoint) * totvert) - i.e. baked/imported data. </p>
	 * @see #__DNA__FIELD__bp
	 */
	
	public CPointer<BPoint> getBp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BPoint.class};
		return new CPointer<BPoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BPoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of BPoints (sizeof(BPoint) * totvert) - i.e. baked/imported data. </p>
	 * @see #__DNA__FIELD__bp
	 */
	
	public void setBp(CPointer<BPoint> bp) throws IOException
	{
		long __address = ((bp == null) ? 0 : bp.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'bezt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of BezTriples (sizeof(BezTriple) * totvert) - i.e. user-editable keyframes . </p>
	 * @see #__DNA__FIELD__bezt
	 */
	
	public CPointer<BezTriple> getBezt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BezTriple.class};
		return new CPointer<BezTriple>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BezTriple.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bezt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of BezTriples (sizeof(BezTriple) * totvert) - i.e. user-editable keyframes . </p>
	 * @see #__DNA__FIELD__bezt
	 */
	
	public void setBezt(CPointer<BezTriple> bezt) throws IOException
	{
		long __address = ((bezt == null) ? 0 : bezt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'maxrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bounding boxes. </p>
	 * @see #__DNA__FIELD__maxrct
	 */
	
	public rctf getMaxrct() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 32, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 16, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'maxrct'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bounding boxes. </p>
	 * @see #__DNA__FIELD__maxrct
	 */
	
	public void setMaxrct(rctf maxrct) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(maxrct, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, maxrct)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, maxrct);
		} else {
			__io__generic__copy( getMaxrct(), maxrct);
		}
	}

	/**
	 * Get method for struct member 'totrct'.
	 * @see #__DNA__FIELD__totrct
	 */
	
	public rctf getTotrct() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 48, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 32, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'totrct'.
	 * @see #__DNA__FIELD__totrct
	 */
	
	public void setTotrct(rctf totrct) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 32;
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
	 * Get method for struct member 'blocktype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blocktype= ipo-blocktype; adrcode= type of ipo-curve; vartype= 'format' of data. </p>
	 * @see #__DNA__FIELD__blocktype
	 */
	
	public short getBlocktype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 64);
		} else {
			return __io__block.readShort(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'blocktype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blocktype= ipo-blocktype; adrcode= type of ipo-curve; vartype= 'format' of data. </p>
	 * @see #__DNA__FIELD__blocktype
	 */
	
	public void setBlocktype(short blocktype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 64, blocktype);
		} else {
			__io__block.writeShort(__io__address + 48, blocktype);
		}
	}

	/**
	 * Get method for struct member 'adrcode'.
	 * @see #__DNA__FIELD__adrcode
	 */
	
	public short getAdrcode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 66);
		} else {
			return __io__block.readShort(__io__address + 50);
		}
	}

	/**
	 * Set method for struct member 'adrcode'.
	 * @see #__DNA__FIELD__adrcode
	 */
	
	public void setAdrcode(short adrcode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 66, adrcode);
		} else {
			__io__block.writeShort(__io__address + 50, adrcode);
		}
	}

	/**
	 * Get method for struct member 'vartype'.
	 * @see #__DNA__FIELD__vartype
	 */
	
	public short getVartype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 68);
		} else {
			return __io__block.readShort(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'vartype'.
	 * @see #__DNA__FIELD__vartype
	 */
	
	public void setVartype(short vartype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 68, vartype);
		} else {
			__io__block.writeShort(__io__address + 52, vartype);
		}
	}

	/**
	 * Get method for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total number of BezTriples (i.e. keyframes) on curve. </p>
	 * @see #__DNA__FIELD__totvert
	 */
	
	public short getTotvert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 70);
		} else {
			return __io__block.readShort(__io__address + 54);
		}
	}

	/**
	 * Set method for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total number of BezTriples (i.e. keyframes) on curve. </p>
	 * @see #__DNA__FIELD__totvert
	 */
	
	public void setTotvert(short totvert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 70, totvert);
		} else {
			__io__block.writeShort(__io__address + 54, totvert);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Interpolation and extrapolation modes . </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public short getIpo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 72);
		} else {
			return __io__block.readShort(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'ipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Interpolation and extrapolation modes . </p>
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(short ipo) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 72, ipo);
		} else {
			__io__block.writeShort(__io__address + 56, ipo);
		}
	}

	/**
	 * Get method for struct member 'extrap'.
	 * @see #__DNA__FIELD__extrap
	 */
	
	public short getExtrap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 74);
		} else {
			return __io__block.readShort(__io__address + 58);
		}
	}

	/**
	 * Set method for struct member 'extrap'.
	 * @see #__DNA__FIELD__extrap
	 */
	
	public void setExtrap(short extrap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 74, extrap);
		} else {
			__io__block.writeShort(__io__address + 58, extrap);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag= settings; rt= ???. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 76);
		} else {
			return __io__block.readShort(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flag= settings; rt= ???. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 76, flag);
		} else {
			__io__block.writeShort(__io__address + 60, flag);
		}
	}

	/**
	 * Get method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public short getRt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 78);
		} else {
			return __io__block.readShort(__io__address + 62);
		}
	}

	/**
	 * Set method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public void setRt(short rt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 78, rt);
		} else {
			__io__block.writeShort(__io__address + 62, rt);
		}
	}

	/**
	 * Get method for struct member 'ymin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimum/maximum y-extents for curve. </p>
	 * @see #__DNA__FIELD__ymin
	 */
	
	public float getYmin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'ymin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimum/maximum y-extents for curve. </p>
	 * @see #__DNA__FIELD__ymin
	 */
	
	public void setYmin(float ymin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, ymin);
		} else {
			__io__block.writeFloat(__io__address + 64, ymin);
		}
	}

	/**
	 * Get method for struct member 'ymax'.
	 * @see #__DNA__FIELD__ymax
	 */
	
	public float getYmax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'ymax'.
	 * @see #__DNA__FIELD__ymax
	 */
	
	public void setYmax(float ymax) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, ymax);
		} else {
			__io__block.writeFloat(__io__address + 68, ymax);
		}
	}

	/**
	 * Get method for struct member 'bitmask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ???. </p>
	 * @see #__DNA__FIELD__bitmask
	 */
	
	public int getBitmask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 88);
		} else {
			return __io__block.readInt(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'bitmask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ???. </p>
	 * @see #__DNA__FIELD__bitmask
	 */
	
	public void setBitmask(int bitmask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 88, bitmask);
		} else {
			__io__block.writeInt(__io__address + 72, bitmask);
		}
	}

	/**
	 * Get method for struct member 'slide_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimum/maximum values for sliders (in action editor). </p>
	 * @see #__DNA__FIELD__slide_min
	 */
	
	public float getSlide_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'slide_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Minimum/maximum values for sliders (in action editor). </p>
	 * @see #__DNA__FIELD__slide_min
	 */
	
	public void setSlide_min(float slide_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, slide_min);
		} else {
			__io__block.writeFloat(__io__address + 76, slide_min);
		}
	}

	/**
	 * Get method for struct member 'slide_max'.
	 * @see #__DNA__FIELD__slide_max
	 */
	
	public float getSlide_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'slide_max'.
	 * @see #__DNA__FIELD__slide_max
	 */
	
	public void setSlide_max(float slide_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, slide_max);
		} else {
			__io__block.writeFloat(__io__address + 80, slide_max);
		}
	}

	/**
	 * Get method for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Value of ipo-curve for current frame. </p>
	 * @see #__DNA__FIELD__curval
	 */
	
	public float getCurval() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Value of ipo-curve for current frame. </p>
	 * @see #__DNA__FIELD__curval
	 */
	
	public void setCurval(float curval) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, curval);
		} else {
			__io__block.writeFloat(__io__address + 84, curval);
		}
	}

	/**
	 * Get method for struct member 'driver'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to ipo-driver for this curve. </p>
	 * @see #__DNA__FIELD__driver
	 */
	
	public CPointer<IpoDriver> getDriver() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IpoDriver.class};
		return new CPointer<IpoDriver>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IpoDriver.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'driver'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pointer to ipo-driver for this curve. </p>
	 * @see #__DNA__FIELD__driver
	 */
	
	public void setDriver(CPointer<IpoDriver> driver) throws IOException
	{
		long __address = ((driver == null) ? 0 : driver.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<IpoCurve> __io__addressof() {
		return new CPointer<IpoCurve>(__io__address, new Class[]{IpoCurve.class}, __io__block, __io__blockTable);
	}

}
