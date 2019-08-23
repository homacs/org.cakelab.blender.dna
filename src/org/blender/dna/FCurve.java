package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FCurve'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> 'Function-Curve' - defines values over time for a given setting (fcu) </p>
 */

@CMetaData(size32=84, size64=120)
public class FCurve extends CFacade {

	/**
	 * This is the sdna index of the struct FCurve.
	 * <p>
	 * It is required when allocating a new block to store data for FCurve.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 527;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;FCurve&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, FCurve.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'FCurve*'</li>
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
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;FCurve&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, FCurve.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'FCurve*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'grp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> group Group that F-Curve belongs to. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__grp);
	 * CPointer&lt;CPointer&lt;bActionGroup&gt;&gt; p_grp = p.cast(new Class[]{CPointer.class, bActionGroup.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grp'</li>
	 * <li>Signature: 'bActionGroup*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grp = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'driver'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Channel Driver (only set for Driver F-Curves)<h4>Blender Source Code:</h4>
	 * <p> driver settings Only valid for drivers (i.e. stored in {@link AnimData}  not Actions). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__driver);
	 * CPointer&lt;CPointer&lt;ChannelDriver&gt;&gt; p_driver = p.cast(new Class[]{CPointer.class, ChannelDriver.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'driver'</li>
	 * <li>Signature: 'ChannelDriver*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__driver = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Modifiers affecting the shape of the F-Curve<h4>Blender Source Code:</h4>
	 * <p> evaluation settings {@link FCurve}  Modifiers. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__modifiers);
	 * CPointer&lt;ListBase&gt; p_modifiers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifiers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifiers = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'bezt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> motion data User-editable keyframes (array). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__bezt);
	 * CPointer&lt;CPointer&lt;BezTriple&gt;&gt; p_bezt = p.cast(new Class[]{CPointer.class, BezTriple.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bezt'</li>
	 * <li>Signature: 'BezTriple*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bezt = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member 'fpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 'baked/imported' motion samples (array). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__fpt);
	 * CPointer&lt;CPointer&lt;FPoint&gt;&gt; p_fpt = p.cast(new Class[]{CPointer.class, FPoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fpt'</li>
	 * <li>Signature: 'FPoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fpt = new long[]{28, 56};

	/**
	 * Field descriptor (offset) for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total number of points which define the curve (i.e. size of arrays in FPoints). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__totvert);
	 * CPointer&lt;Integer&gt; p_totvert = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totvert'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totvert = new long[]{32, 64};

	/**
	 * Field descriptor (offset) for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> value cache + settings Value stored from last time curve was evaluated (not threadsafe, debug display only!). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__curval);
	 * CPointer&lt;Float&gt; p_curval = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curval'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curval = new long[]{36, 68};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{40, 72};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-editable settings for this curve. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{44, 76};

	/**
	 * Field descriptor (offset) for struct member 'extend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Value-extending mode for this curve (does not cover). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__extend);
	 * CPointer&lt;Short&gt; p_extend = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'extend'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__extend = new long[]{46, 78};

	/**
	 * Field descriptor (offset) for struct member 'auto_smoothing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Algorithm used to compute automatic handles<h4>Blender Source Code:</h4>
	 * <p> Auto-handle smoothing mode. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__auto_smoothing);
	 * CPointer&lt;Byte&gt; p_auto_smoothing = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'auto_smoothing'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__auto_smoothing = new long[]{48, 80};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[3]'</li>
	 * <li>Actual Size (32bit/64bit): 3/3</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{49, 81};

	/**
	 * Field descriptor (offset) for struct member 'array_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index to the specific property affected by F-Curve if applicable<h4>Blender Source Code:</h4>
	 * <p> RNA - data link If applicable, the index of the RNA-array item to get. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__array_index);
	 * CPointer&lt;Integer&gt; p_array_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'array_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__array_index = new long[]{52, 84};

	/**
	 * Field descriptor (offset) for struct member 'rna_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA-path to resolve data-access. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__rna_path);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_rna_path = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rna_path'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rna_path = new long[]{56, 88};

	/**
	 * Field descriptor (offset) for struct member 'color_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method used to determine color of F-Curve in Graph Editor<h4>Blender Source Code:</h4>
	 * <p> curve coloring (for editor) Coloring method to use (eFCurve_Coloring). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__color_mode);
	 * CPointer&lt;Integer&gt; p_color_mode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_mode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_mode = new long[]{60, 96};

	/**
	 * Field descriptor (offset) for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color of the F-Curve in the Graph Editor<h4>Blender Source Code:</h4>
	 * <p> The last-color this curve took. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color = new long[]{64, 100};

	/**
	 * Field descriptor (offset) for struct member 'prev_norm_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__prev_norm_factor);
	 * CPointer&lt;Float&gt; p_prev_norm_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev_norm_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev_norm_factor = new long[]{76, 112};

	/**
	 * Field descriptor (offset) for struct member 'prev_offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCurve fcurve = ...;
	 * CPointer&lt;Object&gt; p = fcurve.__dna__addressof(FCurve.__DNA__FIELD__prev_offset);
	 * CPointer&lt;Float&gt; p_prev_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev_offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev_offset = new long[]{80, 116};

	public FCurve(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FCurve(FCurve that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<FCurve> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FCurve.class};
		return new CPointer<FCurve>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FCurve.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<FCurve> next) throws IOException
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
	
	public CPointer<FCurve> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FCurve.class};
		return new CPointer<FCurve>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FCurve.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<FCurve> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'grp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> group Group that F-Curve belongs to. </p>
	 * @see #__DNA__FIELD__grp
	 */
	
	public CPointer<bActionGroup> getGrp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bActionGroup.class};
		return new CPointer<bActionGroup>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bActionGroup.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'grp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> group Group that F-Curve belongs to. </p>
	 * @see #__DNA__FIELD__grp
	 */
	
	public void setGrp(CPointer<bActionGroup> grp) throws IOException
	{
		long __address = ((grp == null) ? 0 : grp.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'driver'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Channel Driver (only set for Driver F-Curves)<h4>Blender Source Code:</h4>
	 * <p> driver settings Only valid for drivers (i.e. stored in {@link AnimData}  not Actions). </p>
	 * @see #__DNA__FIELD__driver
	 */
	
	public CPointer<ChannelDriver> getDriver() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ChannelDriver.class};
		return new CPointer<ChannelDriver>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ChannelDriver.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'driver'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Channel Driver (only set for Driver F-Curves)<h4>Blender Source Code:</h4>
	 * <p> driver settings Only valid for drivers (i.e. stored in {@link AnimData}  not Actions). </p>
	 * @see #__DNA__FIELD__driver
	 */
	
	public void setDriver(CPointer<ChannelDriver> driver) throws IOException
	{
		long __address = ((driver == null) ? 0 : driver.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Modifiers affecting the shape of the F-Curve<h4>Blender Source Code:</h4>
	 * <p> evaluation settings {@link FCurve}  Modifiers. </p>
	 * @see #__DNA__FIELD__modifiers
	 */
	
	public ListBase getModifiers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 32, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifiers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Modifiers affecting the shape of the F-Curve<h4>Blender Source Code:</h4>
	 * <p> evaluation settings {@link FCurve}  Modifiers. </p>
	 * @see #__DNA__FIELD__modifiers
	 */
	
	public void setModifiers(ListBase modifiers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(modifiers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifiers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifiers);
		} else {
			__io__generic__copy( getModifiers(), modifiers);
		}
	}

	/**
	 * Get method for struct member 'bezt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> motion data User-editable keyframes (array). </p>
	 * @see #__DNA__FIELD__bezt
	 */
	
	public CPointer<BezTriple> getBezt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BezTriple.class};
		return new CPointer<BezTriple>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BezTriple.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bezt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> motion data User-editable keyframes (array). </p>
	 * @see #__DNA__FIELD__bezt
	 */
	
	public void setBezt(CPointer<BezTriple> bezt) throws IOException
	{
		long __address = ((bezt == null) ? 0 : bezt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'fpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 'baked/imported' motion samples (array). </p>
	 * @see #__DNA__FIELD__fpt
	 */
	
	public CPointer<FPoint> getFpt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 28);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FPoint.class};
		return new CPointer<FPoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FPoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fpt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 'baked/imported' motion samples (array). </p>
	 * @see #__DNA__FIELD__fpt
	 */
	
	public void setFpt(CPointer<FPoint> fpt) throws IOException
	{
		long __address = ((fpt == null) ? 0 : fpt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 56, __address);
		} else {
			__io__block.writeLong(__io__address + 28, __address);
		}
	}

	/**
	 * Get method for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total number of points which define the curve (i.e. size of arrays in FPoints). </p>
	 * @see #__DNA__FIELD__totvert
	 */
	
	public int getTotvert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 64);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total number of points which define the curve (i.e. size of arrays in FPoints). </p>
	 * @see #__DNA__FIELD__totvert
	 */
	
	public void setTotvert(int totvert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 64, totvert);
		} else {
			__io__block.writeInt(__io__address + 32, totvert);
		}
	}

	/**
	 * Get method for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> value cache + settings Value stored from last time curve was evaluated (not threadsafe, debug display only!). </p>
	 * @see #__DNA__FIELD__curval
	 */
	
	public float getCurval() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'curval'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> value cache + settings Value stored from last time curve was evaluated (not threadsafe, debug display only!). </p>
	 * @see #__DNA__FIELD__curval
	 */
	
	public void setCurval(float curval) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, curval);
		} else {
			__io__block.writeFloat(__io__address + 36, curval);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-editable settings for this curve. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 76);
		} else {
			return __io__block.readShort(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> User-editable settings for this curve. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 76, flag);
		} else {
			__io__block.writeShort(__io__address + 44, flag);
		}
	}

	/**
	 * Get method for struct member 'extend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Value-extending mode for this curve (does not cover). </p>
	 * @see #__DNA__FIELD__extend
	 */
	
	public short getExtend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 78);
		} else {
			return __io__block.readShort(__io__address + 46);
		}
	}

	/**
	 * Set method for struct member 'extend'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Value-extending mode for this curve (does not cover). </p>
	 * @see #__DNA__FIELD__extend
	 */
	
	public void setExtend(short extend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 78, extend);
		} else {
			__io__block.writeShort(__io__address + 46, extend);
		}
	}

	/**
	 * Get method for struct member 'auto_smoothing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Algorithm used to compute automatic handles<h4>Blender Source Code:</h4>
	 * <p> Auto-handle smoothing mode. </p>
	 * @see #__DNA__FIELD__auto_smoothing
	 */
	
	public byte getAuto_smoothing() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 80);
		} else {
			return __io__block.readByte(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'auto_smoothing'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Algorithm used to compute automatic handles<h4>Blender Source Code:</h4>
	 * <p> Auto-handle smoothing mode. </p>
	 * @see #__DNA__FIELD__auto_smoothing
	 */
	
	public void setAuto_smoothing(byte auto_smoothing) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 80, auto_smoothing);
		} else {
			__io__block.writeByte(__io__address + 48, auto_smoothing);
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
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 81, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 49, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 81;
		} else {
			__dna__offset = 49;
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
	 * Get method for struct member 'array_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index to the specific property affected by F-Curve if applicable<h4>Blender Source Code:</h4>
	 * <p> RNA - data link If applicable, the index of the RNA-array item to get. </p>
	 * @see #__DNA__FIELD__array_index
	 */
	
	public int getArray_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'array_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Index to the specific property affected by F-Curve if applicable<h4>Blender Source Code:</h4>
	 * <p> RNA - data link If applicable, the index of the RNA-array item to get. </p>
	 * @see #__DNA__FIELD__array_index
	 */
	
	public void setArray_index(int array_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, array_index);
		} else {
			__io__block.writeInt(__io__address + 52, array_index);
		}
	}

	/**
	 * Get method for struct member 'rna_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA-path to resolve data-access. </p>
	 * @see #__DNA__FIELD__rna_path
	 */
	
	public CPointer<Byte> getRna_path() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rna_path'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA-path to resolve data-access. </p>
	 * @see #__DNA__FIELD__rna_path
	 */
	
	public void setRna_path(CPointer<Byte> rna_path) throws IOException
	{
		long __address = ((rna_path == null) ? 0 : rna_path.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 56, __address);
		}
	}

	/**
	 * Get method for struct member 'color_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method used to determine color of F-Curve in Graph Editor<h4>Blender Source Code:</h4>
	 * <p> curve coloring (for editor) Coloring method to use (eFCurve_Coloring). </p>
	 * @see #__DNA__FIELD__color_mode
	 */
	
	public int getColor_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 96);
		} else {
			return __io__block.readInt(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'color_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method used to determine color of F-Curve in Graph Editor<h4>Blender Source Code:</h4>
	 * <p> curve coloring (for editor) Coloring method to use (eFCurve_Coloring). </p>
	 * @see #__DNA__FIELD__color_mode
	 */
	
	public void setColor_mode(int color_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 96, color_mode);
		} else {
			__io__block.writeInt(__io__address + 60, color_mode);
		}
	}

	/**
	 * Get method for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color of the F-Curve in the Graph Editor<h4>Blender Source Code:</h4>
	 * <p> The last-color this curve took. </p>
	 * @see #__DNA__FIELD__color
	 */
	
	public CArrayFacade<Float> getColor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color of the F-Curve in the Graph Editor<h4>Blender Source Code:</h4>
	 * <p> The last-color this curve took. </p>
	 * @see #__DNA__FIELD__color
	 */
	
	public void setColor(CArrayFacade<Float> color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 100;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, color);
		} else {
			__io__generic__copy( getColor(), color);
		}
	}

	/**
	 * Get method for struct member 'prev_norm_factor'.
	 * @see #__DNA__FIELD__prev_norm_factor
	 */
	
	public float getPrev_norm_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'prev_norm_factor'.
	 * @see #__DNA__FIELD__prev_norm_factor
	 */
	
	public void setPrev_norm_factor(float prev_norm_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 112, prev_norm_factor);
		} else {
			__io__block.writeFloat(__io__address + 76, prev_norm_factor);
		}
	}

	/**
	 * Get method for struct member 'prev_offset'.
	 * @see #__DNA__FIELD__prev_offset
	 */
	
	public float getPrev_offset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'prev_offset'.
	 * @see #__DNA__FIELD__prev_offset
	 */
	
	public void setPrev_offset(float prev_offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, prev_offset);
		} else {
			__io__block.writeFloat(__io__address + 80, prev_offset);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FCurve> __io__addressof() {
		return new CPointer<FCurve>(__io__address, new Class[]{FCurve.class}, __io__block, __io__blockTable);
	}

}
