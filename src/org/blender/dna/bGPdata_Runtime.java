package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bGPdata_Runtime'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  GP Datablock Runtime temp data for {@link bGPdata}  </p>
 */

@CMetaData(size32=68, size64=80)
public class bGPdata_Runtime extends CFacade {

	/**
	 * This is the sdna index of the struct bGPdata_Runtime.
	 * <p>
	 * It is required when allocating a new block to store data for bGPdata_Runtime.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 472;

	/**
	 * Field descriptor (offset) for struct member 'ar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last region where drawing was originated. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__ar);
	 * CPointer&lt;CPointer&lt;ARegion&gt;&gt; p_ar = p.cast(new Class[]{CPointer.class, ARegion.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ar'</li>
	 * <li>Signature: 'ARegion*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ar = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke buffer. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sbuffer);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sbuffer = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbuffer'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbuffer = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'scolor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GP {@link Object}  drawing Buffer stroke color. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__scolor);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_scolor = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scolor'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scolor = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'sfill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Buffer fill color. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sfill);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_sfill = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sfill'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sfill = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for color. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__mode);
	 * CPointer&lt;Short&gt; p_mode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'bstroke_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Buffer style for drawing strokes (used to select shader type). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__bstroke_style);
	 * CPointer&lt;Short&gt; p_bstroke_style = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bstroke_style'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bstroke_style = new long[]{42, 50};

	/**
	 * Field descriptor (offset) for struct member 'bfill_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Buffer style for filling areas (used to select shader type). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__bfill_style);
	 * CPointer&lt;Short&gt; p_bfill_style = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bfill_style'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bfill_style = new long[]{44, 52};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of total elements available in cache. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sbuffer_size);
	 * CPointer&lt;Short&gt; p_sbuffer_size = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbuffer_size'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbuffer_size = new long[]{46, 54};

	/**
	 * Field descriptor (offset) for struct member 'sbuffer_sflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for stroke that cache represents. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__sbuffer_sflag);
	 * CPointer&lt;Short&gt; p_sbuffer_sflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sbuffer_sflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sbuffer_sflag = new long[]{48, 56};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{50, 58};

	/**
	 * Field descriptor (offset) for struct member 'tot_cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of control-points for stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__tot_cp_points);
	 * CPointer&lt;Integer&gt; p_tot_cp_points = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_cp_points'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_cp_points = new long[]{56, 64};

	/**
	 * Field descriptor (offset) for struct member '_pad1_'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD___pad1_);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1_ = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1_'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1_ = new long[]{60, 68};

	/**
	 * Field descriptor (offset) for struct member 'cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of control-points for stroke. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bGPdata_Runtime bgpdata_runtime = ...;
	 * CPointer&lt;Object&gt; p = bgpdata_runtime.__dna__addressof(bGPdata_Runtime.__DNA__FIELD__cp_points);
	 * CPointer&lt;CPointer&lt;bGPDcontrolpoint&gt;&gt; p_cp_points = p.cast(new Class[]{CPointer.class, bGPDcontrolpoint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cp_points'</li>
	 * <li>Signature: 'bGPDcontrolpoint*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cp_points = new long[]{64, 72};

	public bGPdata_Runtime(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bGPdata_Runtime(bGPdata_Runtime that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'ar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last region where drawing was originated. </p>
	 * @see #__DNA__FIELD__ar
	 */
	
	public CPointer<ARegion> getAr() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ARegion.class};
		return new CPointer<ARegion>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ARegion.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ar'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Last region where drawing was originated. </p>
	 * @see #__DNA__FIELD__ar
	 */
	
	public void setAr(CPointer<ARegion> ar) throws IOException
	{
		long __address = ((ar == null) ? 0 : ar.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'sbuffer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke buffer. </p>
	 * @see #__DNA__FIELD__sbuffer
	 */
	
	public CPointer<Object> getSbuffer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sbuffer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Stroke buffer. </p>
	 * @see #__DNA__FIELD__sbuffer
	 */
	
	public void setSbuffer(CPointer<Object> sbuffer) throws IOException
	{
		long __address = ((sbuffer == null) ? 0 : sbuffer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'scolor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GP {@link Object}  drawing Buffer stroke color. </p>
	 * @see #__DNA__FIELD__scolor
	 */
	
	public CArrayFacade<Float> getScolor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scolor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> GP {@link Object}  drawing Buffer stroke color. </p>
	 * @see #__DNA__FIELD__scolor
	 */
	
	public void setScolor(CArrayFacade<Float> scolor) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(scolor, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scolor)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scolor);
		} else {
			__io__generic__copy( getScolor(), scolor);
		}
	}

	/**
	 * Get method for struct member 'sfill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Buffer fill color. </p>
	 * @see #__DNA__FIELD__sfill
	 */
	
	public CArrayFacade<Float> getSfill() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sfill'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Buffer fill color. </p>
	 * @see #__DNA__FIELD__sfill
	 */
	
	public void setSfill(CArrayFacade<Float> sfill) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(sfill, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sfill)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sfill);
		} else {
			__io__generic__copy( getSfill(), sfill);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for color. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public short getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 48);
		} else {
			return __io__block.readShort(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings for color. </p>
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(short mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 48, mode);
		} else {
			__io__block.writeShort(__io__address + 40, mode);
		}
	}

	/**
	 * Get method for struct member 'bstroke_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Buffer style for drawing strokes (used to select shader type). </p>
	 * @see #__DNA__FIELD__bstroke_style
	 */
	
	public short getBstroke_style() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 50);
		} else {
			return __io__block.readShort(__io__address + 42);
		}
	}

	/**
	 * Set method for struct member 'bstroke_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Buffer style for drawing strokes (used to select shader type). </p>
	 * @see #__DNA__FIELD__bstroke_style
	 */
	
	public void setBstroke_style(short bstroke_style) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 50, bstroke_style);
		} else {
			__io__block.writeShort(__io__address + 42, bstroke_style);
		}
	}

	/**
	 * Get method for struct member 'bfill_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Buffer style for filling areas (used to select shader type). </p>
	 * @see #__DNA__FIELD__bfill_style
	 */
	
	public short getBfill_style() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 52);
		} else {
			return __io__block.readShort(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'bfill_style'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Buffer style for filling areas (used to select shader type). </p>
	 * @see #__DNA__FIELD__bfill_style
	 */
	
	public void setBfill_style(short bfill_style) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 52, bfill_style);
		} else {
			__io__block.writeShort(__io__address + 44, bfill_style);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of total elements available in cache. </p>
	 * @see #__DNA__FIELD__sbuffer_size
	 */
	
	public short getSbuffer_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 54);
		} else {
			return __io__block.readShort(__io__address + 46);
		}
	}

	/**
	 * Set method for struct member 'sbuffer_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of total elements available in cache. </p>
	 * @see #__DNA__FIELD__sbuffer_size
	 */
	
	public void setSbuffer_size(short sbuffer_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 54, sbuffer_size);
		} else {
			__io__block.writeShort(__io__address + 46, sbuffer_size);
		}
	}

	/**
	 * Get method for struct member 'sbuffer_sflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for stroke that cache represents. </p>
	 * @see #__DNA__FIELD__sbuffer_sflag
	 */
	
	public short getSbuffer_sflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 56);
		} else {
			return __io__block.readShort(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'sbuffer_sflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags for stroke that cache represents. </p>
	 * @see #__DNA__FIELD__sbuffer_sflag
	 */
	
	public void setSbuffer_sflag(short sbuffer_sflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 56, sbuffer_sflag);
		} else {
			__io__block.writeShort(__io__address + 48, sbuffer_sflag);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 58, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 50, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 58;
		} else {
			__dna__offset = 50;
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
	 * Get method for struct member 'tot_cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of control-points for stroke. </p>
	 * @see #__DNA__FIELD__tot_cp_points
	 */
	
	public int getTot_cp_points() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 64);
		} else {
			return __io__block.readInt(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'tot_cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of control-points for stroke. </p>
	 * @see #__DNA__FIELD__tot_cp_points
	 */
	
	public void setTot_cp_points(int tot_cp_points) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 64, tot_cp_points);
		} else {
			__io__block.writeInt(__io__address + 56, tot_cp_points);
		}
	}

	/**
	 * Get method for struct member '_pad1_'.
	 * @see #__DNA__FIELD___pad1_
	 */
	
	public CArrayFacade<Byte> get_pad1_() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 68, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1_'.
	 * @see #__DNA__FIELD___pad1_
	 */
	
	public void set_pad1_(CArrayFacade<Byte> _pad1_) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 68;
		} else {
			__dna__offset = 60;
		}
		if (__io__equals(_pad1_, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1_)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1_);
		} else {
			__io__generic__copy( get_pad1_(), _pad1_);
		}
	}

	/**
	 * Get method for struct member 'cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of control-points for stroke. </p>
	 * @see #__DNA__FIELD__cp_points
	 */
	
	public CPointer<bGPDcontrolpoint> getCp_points() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPDcontrolpoint.class};
		return new CPointer<bGPDcontrolpoint>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPDcontrolpoint.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cp_points'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Array of control-points for stroke. </p>
	 * @see #__DNA__FIELD__cp_points
	 */
	
	public void setCp_points(CPointer<bGPDcontrolpoint> cp_points) throws IOException
	{
		long __address = ((cp_points == null) ? 0 : cp_points.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 72, __address);
		} else {
			__io__block.writeLong(__io__address + 64, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bGPdata_Runtime> __io__addressof() {
		return new CPointer<bGPdata_Runtime>(__io__address, new Class[]{bGPdata_Runtime.class}, __io__block, __io__blockTable);
	}

}
