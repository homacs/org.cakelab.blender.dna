package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CurveMapping'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=336, size64=384)
public class CurveMapping extends CFacade {

	/**
	 * This is the sdna index of the struct CurveMapping.
	 * <p>
	 * It is required when allocating a new block to store data for CurveMapping.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 457;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMapping curvemapping = ...;
	 * CPointer&lt;Object&gt; p = curvemapping.__dna__addressof(CurveMapping.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cur; for buttons, to show active curve </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMapping curvemapping = ...;
	 * CPointer&lt;Object&gt; p = curvemapping.__dna__addressof(CurveMapping.__DNA__FIELD__cur);
	 * CPointer&lt;Integer&gt; p_cur = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cur'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cur = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'preset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMapping curvemapping = ...;
	 * CPointer&lt;Object&gt; p = curvemapping.__dna__addressof(CurveMapping.__DNA__FIELD__preset);
	 * CPointer&lt;Integer&gt; p_preset = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preset'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preset = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'changed_timestamp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMapping curvemapping = ...;
	 * CPointer&lt;Object&gt; p = curvemapping.__dna__addressof(CurveMapping.__DNA__FIELD__changed_timestamp);
	 * CPointer&lt;Integer&gt; p_changed_timestamp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'changed_timestamp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__changed_timestamp = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'curr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMapping curvemapping = ...;
	 * CPointer&lt;Object&gt; p = curvemapping.__dna__addressof(CurveMapping.__DNA__FIELD__curr);
	 * CPointer&lt;rctf&gt; p_curr = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curr'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curr = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'clipr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current rect, clip rect (is default rect too) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMapping curvemapping = ...;
	 * CPointer&lt;Object&gt; p = curvemapping.__dna__addressof(CurveMapping.__DNA__FIELD__clipr);
	 * CPointer&lt;rctf&gt; p_clipr = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clipr'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clipr = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'cm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max 4 builtin curves per mapping struct now </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMapping curvemapping = ...;
	 * CPointer&lt;Object&gt; p = curvemapping.__dna__addressof(CurveMapping.__DNA__FIELD__cm);
	 * CPointer&lt;CArrayFacade&lt;CurveMap&gt;&gt; p_cm = p.cast(new Class[]{CArrayFacade.class, CurveMap.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cm'</li>
	 * <li>Signature: 'CurveMap[4]'</li>
	 * <li>Actual Size (32bit/64bit): 240/288</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cm = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'black'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMapping curvemapping = ...;
	 * CPointer&lt;Object&gt; p = curvemapping.__dna__addressof(CurveMapping.__DNA__FIELD__black);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_black = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'black'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__black = new long[]{288, 336};

	/**
	 * Field descriptor (offset) for struct member 'white'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> black/white point (black[0] abused for current frame) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMapping curvemapping = ...;
	 * CPointer&lt;Object&gt; p = curvemapping.__dna__addressof(CurveMapping.__DNA__FIELD__white);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_white = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'white'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__white = new long[]{300, 348};

	/**
	 * Field descriptor (offset) for struct member 'bwmul'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> black/white point multiply value, for speed </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMapping curvemapping = ...;
	 * CPointer&lt;Object&gt; p = curvemapping.__dna__addressof(CurveMapping.__DNA__FIELD__bwmul);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_bwmul = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bwmul'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bwmul = new long[]{312, 360};

	/**
	 * Field descriptor (offset) for struct member 'sample'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sample values, if flag set it draws line and intersection </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CurveMapping curvemapping = ...;
	 * CPointer&lt;Object&gt; p = curvemapping.__dna__addressof(CurveMapping.__DNA__FIELD__sample);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_sample = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sample'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sample = new long[]{324, 372};

	public CurveMapping(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CurveMapping(CurveMapping that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, flag);
		} else {
			__io__block.writeInt(__io__address + 0, flag);
		}
	}

	/**
	 * Get method for struct member 'cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cur; for buttons, to show active curve </p>
	 * @see #__DNA__FIELD__cur
	 */
	
	public int getCur() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> cur; for buttons, to show active curve </p>
	 * @see #__DNA__FIELD__cur
	 */
	
	public void setCur(int cur) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, cur);
		} else {
			__io__block.writeInt(__io__address + 4, cur);
		}
	}

	/**
	 * Get method for struct member 'preset'.
	 * @see #__DNA__FIELD__preset
	 */
	
	public int getPreset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'preset'.
	 * @see #__DNA__FIELD__preset
	 */
	
	public void setPreset(int preset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, preset);
		} else {
			__io__block.writeInt(__io__address + 8, preset);
		}
	}

	/**
	 * Get method for struct member 'changed_timestamp'.
	 * @see #__DNA__FIELD__changed_timestamp
	 */
	
	public int getChanged_timestamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'changed_timestamp'.
	 * @see #__DNA__FIELD__changed_timestamp
	 */
	
	public void setChanged_timestamp(int changed_timestamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, changed_timestamp);
		} else {
			__io__block.writeInt(__io__address + 12, changed_timestamp);
		}
	}

	/**
	 * Get method for struct member 'curr'.
	 * @see #__DNA__FIELD__curr
	 */
	
	public rctf getCurr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 16, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'curr'.
	 * @see #__DNA__FIELD__curr
	 */
	
	public void setCurr(rctf curr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(curr, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, curr)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, curr);
		} else {
			__io__generic__copy( getCurr(), curr);
		}
	}

	/**
	 * Get method for struct member 'clipr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current rect, clip rect (is default rect too) </p>
	 * @see #__DNA__FIELD__clipr
	 */
	
	public rctf getClipr() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 32, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 32, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'clipr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current rect, clip rect (is default rect too) </p>
	 * @see #__DNA__FIELD__clipr
	 */
	
	public void setClipr(rctf clipr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(clipr, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, clipr)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, clipr);
		} else {
			__io__generic__copy( getClipr(), clipr);
		}
	}

	/**
	 * Get method for struct member 'cm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max 4 builtin curves per mapping struct now </p>
	 * @see #__DNA__FIELD__cm
	 */
	
	public CArrayFacade<CurveMap> getCm() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CurveMap.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CurveMap>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CurveMap>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> max 4 builtin curves per mapping struct now </p>
	 * @see #__DNA__FIELD__cm
	 */
	
	public void setCm(CArrayFacade<CurveMap> cm) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(cm, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cm)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cm);
		} else {
			__io__generic__copy( getCm(), cm);
		}
	}

	/**
	 * Get method for struct member 'black'.
	 * @see #__DNA__FIELD__black
	 */
	
	public CArrayFacade<Float> getBlack() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 336, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 288, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'black'.
	 * @see #__DNA__FIELD__black
	 */
	
	public void setBlack(CArrayFacade<Float> black) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 336;
		} else {
			__dna__offset = 288;
		}
		if (__io__equals(black, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, black)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, black);
		} else {
			__io__generic__copy( getBlack(), black);
		}
	}

	/**
	 * Get method for struct member 'white'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> black/white point (black[0] abused for current frame) </p>
	 * @see #__DNA__FIELD__white
	 */
	
	public CArrayFacade<Float> getWhite() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 348, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 300, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'white'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> black/white point (black[0] abused for current frame) </p>
	 * @see #__DNA__FIELD__white
	 */
	
	public void setWhite(CArrayFacade<Float> white) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 348;
		} else {
			__dna__offset = 300;
		}
		if (__io__equals(white, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, white)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, white);
		} else {
			__io__generic__copy( getWhite(), white);
		}
	}

	/**
	 * Get method for struct member 'bwmul'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> black/white point multiply value, for speed </p>
	 * @see #__DNA__FIELD__bwmul
	 */
	
	public CArrayFacade<Float> getBwmul() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 360, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 312, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bwmul'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> black/white point multiply value, for speed </p>
	 * @see #__DNA__FIELD__bwmul
	 */
	
	public void setBwmul(CArrayFacade<Float> bwmul) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 360;
		} else {
			__dna__offset = 312;
		}
		if (__io__equals(bwmul, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bwmul)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bwmul);
		} else {
			__io__generic__copy( getBwmul(), bwmul);
		}
	}

	/**
	 * Get method for struct member 'sample'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sample values, if flag set it draws line and intersection </p>
	 * @see #__DNA__FIELD__sample
	 */
	
	public CArrayFacade<Float> getSample() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 372, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 324, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sample'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> sample values, if flag set it draws line and intersection </p>
	 * @see #__DNA__FIELD__sample
	 */
	
	public void setSample(CArrayFacade<Float> sample) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 372;
		} else {
			__dna__offset = 324;
		}
		if (__io__equals(sample, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sample)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sample);
		} else {
			__io__generic__copy( getSample(), sample);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CurveMapping> __io__addressof() {
		return new CPointer<CurveMapping>(__io__address, new Class[]{CurveMapping.class}, __io__block, __io__blockTable);
	}

}
