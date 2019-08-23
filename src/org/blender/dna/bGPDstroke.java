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
 * <p> Grease-Pencil Annotations - 'Stroke' -> A stroke represents a (simplified version) of the curve drawn by the user in one 'mousedown'->'mouseup' operation </p>
 */

@CMetaData(size32=300, size64=320)
public class bGPDstroke extends CFacade {

	/**
	 * This is the sdna index of the struct bGPDstroke.
	 * <p>
	 * It is required when allocating a new block to store data for bGPDstroke.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 494;

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
	 * <p> array of data-points for stroke </p>
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
	 * <p> tesselated triangles for GP Fill </p>
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
	 * <p> number of data-points in array </p>
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
	 * <p> number of triangles in array </p>
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
	 * <p> thickness of stroke </p>
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
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> various settings about this stroke </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short[2]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{28, 44};

	/**
	 * Field descriptor (offset) for struct member 'inittime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Init time of stroke </p>
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
	 * <p> The pointer to color is only used during drawing, but not saved colorname is the join with the palette, but when draw, the pointer is update if the value is NULL to speed up the drawingcolor name </p>
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
	 * Field descriptor (offset) for struct member 'palcolor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current palette color </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__palcolor);
	 * CPointer&lt;CPointer&lt;bGPDpalettecolor&gt;&gt; p_palcolor = p.cast(new Class[]{CPointer.class, bGPDpalettecolor.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'palcolor'</li>
	 * <li>Signature: 'bGPDpalettecolor*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__palcolor = new long[]{168, 184};

	/**
	 * Field descriptor (offset) for struct member 'tmp_layerinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary layer name only used during copy/paste to put the stroke in the original layer </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPDstroke bgpdstroke = ...;
	 * CPointer&lt;Object&gt; p = bgpdstroke.__dna__addressof(bGPDstroke.__DNA__FIELD__tmp_layerinfo);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_tmp_layerinfo = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tmp_layerinfo'</li>
	 * <li>Signature: 'char[128]'</li>
	 * <li>Actual Size (32bit/64bit): 128/128</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tmp_layerinfo = new long[]{172, 192};

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
	 * <p> array of data-points for stroke </p>
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
	 * <p> array of data-points for stroke </p>
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
	 * <p> tesselated triangles for GP Fill </p>
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
	 * <p> tesselated triangles for GP Fill </p>
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
	 * <p> number of data-points in array </p>
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
	 * <p> number of data-points in array </p>
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
	 * <p> number of triangles in array </p>
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
	 * <p> number of triangles in array </p>
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
	 * <p> thickness of stroke </p>
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
	 * <p> thickness of stroke </p>
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
	 * Get method for struct member 'pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> various settings about this stroke </p>
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Short> getPad() throws IOException
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
	 * Set method for struct member 'pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> various settings about this stroke </p>
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Short> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 44;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
		}
	}

	/**
	 * Get method for struct member 'inittime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Init time of stroke </p>
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
	 * <p> Init time of stroke </p>
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
	 * <p> The pointer to color is only used during drawing, but not saved colorname is the join with the palette, but when draw, the pointer is update if the value is NULL to speed up the drawingcolor name </p>
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
	 * <p> The pointer to color is only used during drawing, but not saved colorname is the join with the palette, but when draw, the pointer is update if the value is NULL to speed up the drawingcolor name </p>
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
	 * Get method for struct member 'palcolor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current palette color </p>
	 * @see #__DNA__FIELD__palcolor
	 */
	
	public CPointer<bGPDpalettecolor> getPalcolor() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDpalettecolor.class};
		return new CPointer<bGPDpalettecolor>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDpalettecolor.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'palcolor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current palette color </p>
	 * @see #__DNA__FIELD__palcolor
	 */
	
	public void setPalcolor(CPointer<bGPDpalettecolor> palcolor) throws IOException
	{
		long __address = ((palcolor == null) ? 0 : palcolor.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 168, __address);
		}
	}

	/**
	 * Get method for struct member 'tmp_layerinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary layer name only used during copy/paste to put the stroke in the original layer </p>
	 * @see #__DNA__FIELD__tmp_layerinfo
	 */
	
	public CArrayFacade<Byte> getTmp_layerinfo() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			128
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tmp_layerinfo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> temporary layer name only used during copy/paste to put the stroke in the original layer </p>
	 * @see #__DNA__FIELD__tmp_layerinfo
	 */
	
	public void setTmp_layerinfo(CArrayFacade<Byte> tmp_layerinfo) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 172;
		}
		if (__io__equals(tmp_layerinfo, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tmp_layerinfo)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tmp_layerinfo);
		} else {
			__io__generic__copy( getTmp_layerinfo(), tmp_layerinfo);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPDstroke> __io__addressof() {
		return new CPointer<bGPDstroke>(__io__address, new Class[]{bGPDstroke.class}, __io__block, __io__blockTable);
	}

}
