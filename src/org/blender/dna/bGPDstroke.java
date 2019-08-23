package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPDstroke'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Grease-Pencil Annotations - 'Stroke' -> A stroke represents a (simplified version) of the curve drawn by the user in one 'mouse-down'->'mouse-up' operation </p>
 */

@CMetaData(size32=368, size64=392)
public class bGPDstroke extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDstroke.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDstroke.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 467;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bGPDstroke&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bGPDstroke.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bGPDstroke*'</li>
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
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bGPDstroke&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bGPDstroke.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bGPDstroke*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of data-points for stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__points);
	 * CPointer&lt;CPointer&lt;bGPDspoint&gt;&gt; p_points = p.cast(new Class[]{CPointer.class, bGPDspoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'points'</li>
	 * <li>Signature: 'bGPDspoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__points = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'triangles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tessellated triangles for GP Fill. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__triangles);
	 * CPointer&lt;CPointer&lt;bGPDtriangle&gt;&gt; p_triangles = p.cast(new Class[]{CPointer.class, bGPDtriangle.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'triangles'</li>
	 * <li>Signature: 'bGPDtriangle*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__triangles = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'totpoints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of data-points in array. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__totpoints);
	 * CPointer&lt;Integer&gt; p_totpoints = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpoints'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpoints = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'tot_triangles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of triangles in array. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__tot_triangles);
	 * CPointer&lt;Integer&gt; p_tot_triangles = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_triangles'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_triangles = new long[]{20, 36};

	/**
	 * Field descriptor (offset) for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Thickness of stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__thickness);
	 * CPointer&lt;Short&gt; p_thickness = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'thickness'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__thickness = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Various settings about this stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{26, 42};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'short[2]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{28, 44};

	/**
	 * Field descriptor (offset) for struct member 'inittime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Init time of stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__inittime);
	 * CPointer&lt;Double&gt; p_inittime = p.cast(new Class[]{Double.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'inittime'</li>
	 * <li>Signature: 'double'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__inittime = new long[]{32, 48};

	/**
	 * Field descriptor (offset) for struct member 'colorname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color name. 
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__colorname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_colorname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colorname'</li>
	 * <li>Signature: 'char[128]'</li>
	 * <li>Actual Size (32bit/64bit): 128/128</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colorname = new long[]{40, 56};

	/**
	 * Field descriptor (offset) for struct member 'mat_nr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  index. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__mat_nr);
	 * CPointer&lt;Integer&gt; p_mat_nr = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat_nr'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat_nr = new long[]{168, 184};

	/**
	 * Field descriptor (offset) for struct member 'caps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Caps mode for each stroke extreme </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__caps);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_caps = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'caps'</li>
	 * <li>Signature: 'short[2]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__caps = new long[]{172, 188};

	/**
	 * Field descriptor (offset) for struct member 'gradient_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> gradient control along y for color </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__gradient_f);
	 * CPointer&lt;Float&gt; p_gradient_f = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient_f'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient_f = new long[]{176, 192};

	/**
	 * Field descriptor (offset) for struct member 'gradient_s'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor xy of shape for dots gradients </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__gradient_s);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gradient_s = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gradient_s'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gradient_s = new long[]{180, 196};

	/**
	 * Field descriptor (offset) for struct member '_pad_3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD___pad_3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad_3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad_3'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad_3 = new long[]{188, 204};

	/**
	 * Field descriptor (offset) for struct member 'dvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex weight data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__dvert);
	 * CPointer&lt;CPointer&lt;MDeformVert&gt;&gt; p_dvert = p.cast(new Class[]{CPointer.class, MDeformVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dvert'</li>
	 * <li>Signature: 'MDeformVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dvert = new long[]{192, 208};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD___pad3);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad3 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{196, 216};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__runtime);
	 * CPointer&lt;bGPDstroke_Runtime&gt; p_runtime = p.cast(new Class[]{bGPDstroke_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'bGPDstroke_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 164/164</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{200, 224};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{364, 388};

	public bGPDstroke(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPDstroke(bGPDstroke that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bGPDstroke> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDstroke.class};
		return new CPointer<bGPDstroke>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDstroke.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bGPDstroke> next) throws IOException
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
	
	public CPointer<bGPDstroke> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDstroke.class};
		return new CPointer<bGPDstroke>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDstroke.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bGPDstroke> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of data-points for stroke. </p>
	 * @see #__DNA__FIELD__points
	 */
	
	public CPointer<bGPDspoint> getPoints() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDspoint.class};
		return new CPointer<bGPDspoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDspoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of data-points for stroke. </p>
	 * @see #__DNA__FIELD__points
	 */
	
	public void setPoints(CPointer<bGPDspoint> points) throws IOException
	{
		long __address = ((points == null) ? 0 : points.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'triangles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tessellated triangles for GP Fill. </p>
	 * @see #__DNA__FIELD__triangles
	 */
	
	public CPointer<bGPDtriangle> getTriangles() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDtriangle.class};
		return new CPointer<bGPDtriangle>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDtriangle.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'triangles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Tessellated triangles for GP Fill. </p>
	 * @see #__DNA__FIELD__triangles
	 */
	
	public void setTriangles(CPointer<bGPDtriangle> triangles) throws IOException
	{
		long __address = ((triangles == null) ? 0 : triangles.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'totpoints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of data-points in array. </p>
	 * @see #__DNA__FIELD__totpoints
	 */
	
	public int getTotpoints() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'totpoints'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of data-points in array. </p>
	 * @see #__DNA__FIELD__totpoints
	 */
	
	public void setTotpoints(int totpoints) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, totpoints);
		} else {
			__io__block.writeInt(__io__address + 16, totpoints);
		}
	}

	/**
	 * Get method for struct member 'tot_triangles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of triangles in array. </p>
	 * @see #__DNA__FIELD__tot_triangles
	 */
	
	public int getTot_triangles() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'tot_triangles'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of triangles in array. </p>
	 * @see #__DNA__FIELD__tot_triangles
	 */
	
	public void setTot_triangles(int tot_triangles) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, tot_triangles);
		} else {
			__io__block.writeInt(__io__address + 20, tot_triangles);
		}
	}

	/**
	 * Get method for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Thickness of stroke. </p>
	 * @see #__DNA__FIELD__thickness
	 */
	
	public short getThickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 40);
		} else {
			return __io__block.readShort(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Thickness of stroke. </p>
	 * @see #__DNA__FIELD__thickness
	 */
	
	public void setThickness(short thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 40, thickness);
		} else {
			__io__block.writeShort(__io__address + 24, thickness);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Various settings about this stroke. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 42);
		} else {
			return __io__block.readShort(__io__address + 26);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Various settings about this stroke. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 42, flag);
		} else {
			__io__block.writeShort(__io__address + 26, flag);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Short> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Short> _pad) throws IOException
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
	 * Get method for struct member 'inittime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Init time of stroke. </p>
	 * @see #__DNA__FIELD__inittime
	 */
	
	public double getInittime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readDouble(__io__address + 48);
		} else {
			return __io__block.readDouble(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'inittime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Init time of stroke. </p>
	 * @see #__DNA__FIELD__inittime
	 */
	
	public void setInittime(double inittime) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeDouble(__io__address + 48, inittime);
		} else {
			__io__block.writeDouble(__io__address + 32, inittime);
		}
	}

	/**
	 * Get method for struct member 'colorname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color name. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__colorname
	 */
	
	public CArrayFacade<Byte> getColorname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			128
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'colorname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Color name. 
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__colorname
	 */
	
	public void setColorname(CArrayFacade<Byte> colorname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(colorname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, colorname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, colorname);
		} else {
			__io__generic__copy( getColorname(), colorname);
		}
	}

	/**
	 * Get method for struct member 'mat_nr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  index. </p>
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public int getMat_nr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 184);
		} else {
			return __io__block.readInt(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'mat_nr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  index. </p>
	 * @see #__DNA__FIELD__mat_nr
	 */
	
	public void setMat_nr(int mat_nr) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 184, mat_nr);
		} else {
			__io__block.writeInt(__io__address + 168, mat_nr);
		}
	}

	/**
	 * Get method for struct member 'caps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Caps mode for each stroke extreme </p>
	 * @see #__DNA__FIELD__caps
	 */
	
	public CArrayFacade<Short> getCaps() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'caps'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Caps mode for each stroke extreme </p>
	 * @see #__DNA__FIELD__caps
	 */
	
	public void setCaps(CArrayFacade<Short> caps) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 188;
		} else {
			__dna__offset = 172;
		}
		if (__io__equals(caps, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, caps)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, caps);
		} else {
			__io__generic__copy( getCaps(), caps);
		}
	}

	/**
	 * Get method for struct member 'gradient_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> gradient control along y for color </p>
	 * @see #__DNA__FIELD__gradient_f
	 */
	
	public float getGradient_f() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'gradient_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> gradient control along y for color </p>
	 * @see #__DNA__FIELD__gradient_f
	 */
	
	public void setGradient_f(float gradient_f) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, gradient_f);
		} else {
			__io__block.writeFloat(__io__address + 176, gradient_f);
		}
	}

	/**
	 * Get method for struct member 'gradient_s'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor xy of shape for dots gradients </p>
	 * @see #__DNA__FIELD__gradient_s
	 */
	
	public CArrayFacade<Float> getGradient_s() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gradient_s'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> factor xy of shape for dots gradients </p>
	 * @see #__DNA__FIELD__gradient_s
	 */
	
	public void setGradient_s(CArrayFacade<Float> gradient_s) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 196;
		} else {
			__dna__offset = 180;
		}
		if (__io__equals(gradient_s, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gradient_s)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gradient_s);
		} else {
			__io__generic__copy( getGradient_s(), gradient_s);
		}
	}

	/**
	 * Get method for struct member '_pad_3'.
	 * @see #__DNA__FIELD___pad_3
	 */
	
	public CArrayFacade<Byte> get_pad_3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 204, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad_3'.
	 * @see #__DNA__FIELD___pad_3
	 */
	
	public void set_pad_3(CArrayFacade<Byte> _pad_3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 204;
		} else {
			__dna__offset = 188;
		}
		if (__io__equals(_pad_3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad_3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad_3);
		} else {
			__io__generic__copy( get_pad_3(), _pad_3);
		}
	}

	/**
	 * Get method for struct member 'dvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex weight data. </p>
	 * @see #__DNA__FIELD__dvert
	 */
	
	public CPointer<MDeformVert> getDvert() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MDeformVert.class};
		return new CPointer<MDeformVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MDeformVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex weight data. </p>
	 * @see #__DNA__FIELD__dvert
	 */
	
	public void setDvert(CPointer<MDeformVert> dvert) throws IOException
	{
		long __address = ((dvert == null) ? 0 : dvert.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 192, __address);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CPointer<Object> get_pad3() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 196);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CPointer<Object> _pad3) throws IOException
	{
		long __address = ((_pad3 == null) ? 0 : _pad3.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 196, __address);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public bGPDstroke_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new bGPDstroke_Runtime(__io__address + 224, __io__block, __io__blockTable);
		} else {
			return new bGPDstroke_Runtime(__io__address + 200, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(bGPDstroke_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 224;
		} else {
			__dna__offset = 200;
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
			return new CArrayFacade<Byte>(__io__address + 388, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 364, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 388;
		} else {
			__dna__offset = 364;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPDstroke> __io__addressof() {
		return new CPointer<bGPDstroke>(__io__address, new Class[]{bGPDstroke.class}, __io__block, __io__blockTable);
	}

}
