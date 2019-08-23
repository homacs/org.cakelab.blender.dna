package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Paint'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p>{@link Paint}  Tool {@link Base}  </p>
 */

@CMetaData(size32=48, size64=64)
public class Paint extends CFacade {

	/**
	 * This is the sdna index of the struct Paint.
	 * <p>
	 * It is required when allocating a new block to store data for Paint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 182;

	/**
	 * Field descriptor (offset) for struct member 'brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Brush
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__brush);
	 * CPointer&lt;CPointer&lt;Brush&gt;&gt; p_brush = p.cast(new Class[]{CPointer.class, Brush.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brush'</li>
	 * <li>Signature: 'Brush*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brush = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'palette'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Palette
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__palette);
	 * CPointer&lt;CPointer&lt;Palette&gt;&gt; p_palette = p.cast(new Class[]{CPointer.class, Palette.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'palette'</li>
	 * <li>Signature: 'Palette*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__palette = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'cavity_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Editable cavity curve<h4>Blender Source Code:</h4>
	 * <p> cavity curve </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__cavity_curve);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_cavity_curve = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cavity_curve'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cavity_curve = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'paint_cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> WM {@link Paint}  cursor </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__paint_cursor);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_paint_cursor = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint_cursor'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint_cursor = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'paint_cursor_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__paint_cursor_col);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_paint_cursor_col = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint_cursor_col'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint_cursor_col = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> enum PaintFlags </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{20, 36};

	/**
	 * Field descriptor (offset) for struct member 'num_input_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Paint}  stroke can use up to PAINT_MAX_INPUT_SAMPLES inputs to smooth the stroke </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__num_input_samples);
	 * CPointer&lt;Integer&gt; p_num_input_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'num_input_samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__num_input_samples = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'symmetry_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags used for symmetry </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__symmetry_flags);
	 * CPointer&lt;Integer&gt; p_symmetry_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'symmetry_flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__symmetry_flags = new long[]{28, 44};

	/**
	 * Field descriptor (offset) for struct member 'tile_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Stride at which tiled strokes are copied
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__tile_offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_tile_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tile_offset'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tile_offset = new long[]{32, 48};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__pad2);
	 * CPointer&lt;Integer&gt; p_pad2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{44, 60};

	public Paint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Paint(Paint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Brush
	 * @see #__DNA__FIELD__brush
	 */
	
	public CPointer<Brush> getBrush() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Brush.class};
		return new CPointer<Brush>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Brush.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Brush
	 * @see #__DNA__FIELD__brush
	 */
	
	public void setBrush(CPointer<Brush> brush) throws IOException
	{
		long __address = ((brush == null) ? 0 : brush.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'palette'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Palette
	 * @see #__DNA__FIELD__palette
	 */
	
	public CPointer<Palette> getPalette() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Palette.class};
		return new CPointer<Palette>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Palette.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'palette'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Palette
	 * @see #__DNA__FIELD__palette
	 */
	
	public void setPalette(CPointer<Palette> palette) throws IOException
	{
		long __address = ((palette == null) ? 0 : palette.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'cavity_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Editable cavity curve<h4>Blender Source Code:</h4>
	 * <p> cavity curve </p>
	 * @see #__DNA__FIELD__cavity_curve
	 */
	
	public CPointer<CurveMapping> getCavity_curve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cavity_curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Editable cavity curve<h4>Blender Source Code:</h4>
	 * <p> cavity curve </p>
	 * @see #__DNA__FIELD__cavity_curve
	 */
	
	public void setCavity_curve(CPointer<CurveMapping> cavity_curve) throws IOException
	{
		long __address = ((cavity_curve == null) ? 0 : cavity_curve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'paint_cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> WM {@link Paint}  cursor </p>
	 * @see #__DNA__FIELD__paint_cursor
	 */
	
	public CPointer<Object> getPaint_cursor() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'paint_cursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> WM {@link Paint}  cursor </p>
	 * @see #__DNA__FIELD__paint_cursor
	 */
	
	public void setPaint_cursor(CPointer<Object> paint_cursor) throws IOException
	{
		long __address = ((paint_cursor == null) ? 0 : paint_cursor.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'paint_cursor_col'.
	 * @see #__DNA__FIELD__paint_cursor_col
	 */
	
	public CArrayFacade<Byte> getPaint_cursor_col() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'paint_cursor_col'.
	 * @see #__DNA__FIELD__paint_cursor_col
	 */
	
	public void setPaint_cursor_col(CArrayFacade<Byte> paint_cursor_col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(paint_cursor_col, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, paint_cursor_col)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, paint_cursor_col);
		} else {
			__io__generic__copy( getPaint_cursor_col(), paint_cursor_col);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> enum PaintFlags </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> enum PaintFlags </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, flags);
		} else {
			__io__block.writeInt(__io__address + 20, flags);
		}
	}

	/**
	 * Get method for struct member 'num_input_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Paint}  stroke can use up to PAINT_MAX_INPUT_SAMPLES inputs to smooth the stroke </p>
	 * @see #__DNA__FIELD__num_input_samples
	 */
	
	public int getNum_input_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'num_input_samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Paint}  stroke can use up to PAINT_MAX_INPUT_SAMPLES inputs to smooth the stroke </p>
	 * @see #__DNA__FIELD__num_input_samples
	 */
	
	public void setNum_input_samples(int num_input_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, num_input_samples);
		} else {
			__io__block.writeInt(__io__address + 24, num_input_samples);
		}
	}

	/**
	 * Get method for struct member 'symmetry_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags used for symmetry </p>
	 * @see #__DNA__FIELD__symmetry_flags
	 */
	
	public int getSymmetry_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'symmetry_flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags used for symmetry </p>
	 * @see #__DNA__FIELD__symmetry_flags
	 */
	
	public void setSymmetry_flags(int symmetry_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, symmetry_flags);
		} else {
			__io__block.writeInt(__io__address + 28, symmetry_flags);
		}
	}

	/**
	 * Get method for struct member 'tile_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Stride at which tiled strokes are copied
	 * @see #__DNA__FIELD__tile_offset
	 */
	
	public CArrayFacade<Float> getTile_offset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tile_offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Stride at which tiled strokes are copied
	 * @see #__DNA__FIELD__tile_offset
	 */
	
	public void setTile_offset(CArrayFacade<Float> tile_offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(tile_offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tile_offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tile_offset);
		} else {
			__io__generic__copy( getTile_offset(), tile_offset);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public int getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 60);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(int pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 60, pad2);
		} else {
			__io__block.writeInt(__io__address + 44, pad2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Paint> __io__addressof() {
		return new CPointer<Paint>(__io__address, new Class[]{Paint.class}, __io__block, __io__blockTable);
	}

}
