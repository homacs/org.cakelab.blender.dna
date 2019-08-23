package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'AviCodecData'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  Output Format Data </p>
 */

@CMetaData(size32=176, size64=184)
public class AviCodecData extends CFacade {

	/**
	 * This is the sdna index of the struct AviCodecData.
	 * <p>
	 * It is required when allocating a new block to store data for AviCodecData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 168;

	/**
	 * Field descriptor (offset) for struct member 'lpFormat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> save format </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AviCodecData avicodecdata = ...;
	 * CPointer&lt;Object&gt; p = avicodecdata.__dna__addressof(AviCodecData.__DNA__FIELD__lpFormat);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_lpFormat = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lpFormat'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lpFormat = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'lpParms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> compressor options </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AviCodecData avicodecdata = ...;
	 * CPointer&lt;Object&gt; p = avicodecdata.__dna__addressof(AviCodecData.__DNA__FIELD__lpParms);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_lpParms = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lpParms'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lpParms = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'cbFormat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of lpFormat buffer </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AviCodecData avicodecdata = ...;
	 * CPointer&lt;Object&gt; p = avicodecdata.__dna__addressof(AviCodecData.__DNA__FIELD__cbFormat);
	 * CPointer&lt;Integer&gt; p_cbFormat = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cbFormat'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cbFormat = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'cbParms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of lpParms buffer </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AviCodecData avicodecdata = ...;
	 * CPointer&lt;Object&gt; p = avicodecdata.__dna__addressof(AviCodecData.__DNA__FIELD__cbParms);
	 * CPointer&lt;Integer&gt; p_cbParms = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cbParms'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cbParms = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'fccType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> stream type, for consistency </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AviCodecData avicodecdata = ...;
	 * CPointer&lt;Object&gt; p = avicodecdata.__dna__addressof(AviCodecData.__DNA__FIELD__fccType);
	 * CPointer&lt;Integer&gt; p_fccType = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fccType'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fccType = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'fccHandler'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> compressor </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AviCodecData avicodecdata = ...;
	 * CPointer&lt;Object&gt; p = avicodecdata.__dna__addressof(AviCodecData.__DNA__FIELD__fccHandler);
	 * CPointer&lt;Integer&gt; p_fccHandler = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fccHandler'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fccHandler = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'dwKeyFrameEvery'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keyframe rate </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AviCodecData avicodecdata = ...;
	 * CPointer&lt;Object&gt; p = avicodecdata.__dna__addressof(AviCodecData.__DNA__FIELD__dwKeyFrameEvery);
	 * CPointer&lt;Integer&gt; p_dwKeyFrameEvery = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dwKeyFrameEvery'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dwKeyFrameEvery = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'dwQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> compress quality 0-10,000 </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AviCodecData avicodecdata = ...;
	 * CPointer&lt;Object&gt; p = avicodecdata.__dna__addressof(AviCodecData.__DNA__FIELD__dwQuality);
	 * CPointer&lt;Integer&gt; p_dwQuality = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dwQuality'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dwQuality = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'dwBytesPerSecond'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bytes per second </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AviCodecData avicodecdata = ...;
	 * CPointer&lt;Object&gt; p = avicodecdata.__dna__addressof(AviCodecData.__DNA__FIELD__dwBytesPerSecond);
	 * CPointer&lt;Integer&gt; p_dwBytesPerSecond = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dwBytesPerSecond'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dwBytesPerSecond = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'dwFlags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags... see below </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AviCodecData avicodecdata = ...;
	 * CPointer&lt;Object&gt; p = avicodecdata.__dna__addressof(AviCodecData.__DNA__FIELD__dwFlags);
	 * CPointer&lt;Integer&gt; p_dwFlags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dwFlags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dwFlags = new long[]{36, 44};

	/**
	 * Field descriptor (offset) for struct member 'dwInterleaveEvery'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for non-video streams only </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AviCodecData avicodecdata = ...;
	 * CPointer&lt;Object&gt; p = avicodecdata.__dna__addressof(AviCodecData.__DNA__FIELD__dwInterleaveEvery);
	 * CPointer&lt;Integer&gt; p_dwInterleaveEvery = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dwInterleaveEvery'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dwInterleaveEvery = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AviCodecData avicodecdata = ...;
	 * CPointer&lt;Object&gt; p = avicodecdata.__dna__addressof(AviCodecData.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{44, 52};

	/**
	 * Field descriptor (offset) for struct member 'avicodecname'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AviCodecData avicodecdata = ...;
	 * CPointer&lt;Object&gt; p = avicodecdata.__dna__addressof(AviCodecData.__DNA__FIELD__avicodecname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_avicodecname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'avicodecname'</li>
	 * <li>Signature: 'char[128]'</li>
	 * <li>Actual Size (32bit/64bit): 128/128</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__avicodecname = new long[]{48, 56};

	public AviCodecData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected AviCodecData(AviCodecData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'lpFormat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> save format </p>
	 * @see #__DNA__FIELD__lpFormat
	 */
	
	public CPointer<Object> getLpFormat() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'lpFormat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> save format </p>
	 * @see #__DNA__FIELD__lpFormat
	 */
	
	public void setLpFormat(CPointer<Object> lpFormat) throws IOException
	{
		long __address = ((lpFormat == null) ? 0 : lpFormat.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'lpParms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> compressor options </p>
	 * @see #__DNA__FIELD__lpParms
	 */
	
	public CPointer<Object> getLpParms() throws IOException
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
	 * Set method for struct member 'lpParms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> compressor options </p>
	 * @see #__DNA__FIELD__lpParms
	 */
	
	public void setLpParms(CPointer<Object> lpParms) throws IOException
	{
		long __address = ((lpParms == null) ? 0 : lpParms.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'cbFormat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of lpFormat buffer </p>
	 * @see #__DNA__FIELD__cbFormat
	 */
	
	public int getCbFormat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'cbFormat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of lpFormat buffer </p>
	 * @see #__DNA__FIELD__cbFormat
	 */
	
	public void setCbFormat(int cbFormat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, cbFormat);
		} else {
			__io__block.writeInt(__io__address + 8, cbFormat);
		}
	}

	/**
	 * Get method for struct member 'cbParms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of lpParms buffer </p>
	 * @see #__DNA__FIELD__cbParms
	 */
	
	public int getCbParms() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'cbParms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of lpParms buffer </p>
	 * @see #__DNA__FIELD__cbParms
	 */
	
	public void setCbParms(int cbParms) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, cbParms);
		} else {
			__io__block.writeInt(__io__address + 12, cbParms);
		}
	}

	/**
	 * Get method for struct member 'fccType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> stream type, for consistency </p>
	 * @see #__DNA__FIELD__fccType
	 */
	
	public int getFccType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'fccType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> stream type, for consistency </p>
	 * @see #__DNA__FIELD__fccType
	 */
	
	public void setFccType(int fccType) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, fccType);
		} else {
			__io__block.writeInt(__io__address + 16, fccType);
		}
	}

	/**
	 * Get method for struct member 'fccHandler'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> compressor </p>
	 * @see #__DNA__FIELD__fccHandler
	 */
	
	public int getFccHandler() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'fccHandler'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> compressor </p>
	 * @see #__DNA__FIELD__fccHandler
	 */
	
	public void setFccHandler(int fccHandler) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, fccHandler);
		} else {
			__io__block.writeInt(__io__address + 20, fccHandler);
		}
	}

	/**
	 * Get method for struct member 'dwKeyFrameEvery'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keyframe rate </p>
	 * @see #__DNA__FIELD__dwKeyFrameEvery
	 */
	
	public int getDwKeyFrameEvery() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'dwKeyFrameEvery'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keyframe rate </p>
	 * @see #__DNA__FIELD__dwKeyFrameEvery
	 */
	
	public void setDwKeyFrameEvery(int dwKeyFrameEvery) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, dwKeyFrameEvery);
		} else {
			__io__block.writeInt(__io__address + 24, dwKeyFrameEvery);
		}
	}

	/**
	 * Get method for struct member 'dwQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> compress quality 0-10,000 </p>
	 * @see #__DNA__FIELD__dwQuality
	 */
	
	public int getDwQuality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'dwQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> compress quality 0-10,000 </p>
	 * @see #__DNA__FIELD__dwQuality
	 */
	
	public void setDwQuality(int dwQuality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, dwQuality);
		} else {
			__io__block.writeInt(__io__address + 28, dwQuality);
		}
	}

	/**
	 * Get method for struct member 'dwBytesPerSecond'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bytes per second </p>
	 * @see #__DNA__FIELD__dwBytesPerSecond
	 */
	
	public int getDwBytesPerSecond() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'dwBytesPerSecond'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bytes per second </p>
	 * @see #__DNA__FIELD__dwBytesPerSecond
	 */
	
	public void setDwBytesPerSecond(int dwBytesPerSecond) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, dwBytesPerSecond);
		} else {
			__io__block.writeInt(__io__address + 32, dwBytesPerSecond);
		}
	}

	/**
	 * Get method for struct member 'dwFlags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags... see below </p>
	 * @see #__DNA__FIELD__dwFlags
	 */
	
	public int getDwFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'dwFlags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags... see below </p>
	 * @see #__DNA__FIELD__dwFlags
	 */
	
	public void setDwFlags(int dwFlags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, dwFlags);
		} else {
			__io__block.writeInt(__io__address + 36, dwFlags);
		}
	}

	/**
	 * Get method for struct member 'dwInterleaveEvery'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for non-video streams only </p>
	 * @see #__DNA__FIELD__dwInterleaveEvery
	 */
	
	public int getDwInterleaveEvery() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 48);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'dwInterleaveEvery'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> for non-video streams only </p>
	 * @see #__DNA__FIELD__dwInterleaveEvery
	 */
	
	public void setDwInterleaveEvery(int dwInterleaveEvery) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 48, dwInterleaveEvery);
		} else {
			__io__block.writeInt(__io__address + 40, dwInterleaveEvery);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 52);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 52, pad);
		} else {
			__io__block.writeInt(__io__address + 44, pad);
		}
	}

	/**
	 * Get method for struct member 'avicodecname'.
	 * @see #__DNA__FIELD__avicodecname
	 */
	
	public CArrayFacade<Byte> getAvicodecname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			128
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'avicodecname'.
	 * @see #__DNA__FIELD__avicodecname
	 */
	
	public void setAvicodecname(CArrayFacade<Byte> avicodecname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(avicodecname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, avicodecname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, avicodecname);
		} else {
			__io__generic__copy( getAvicodecname(), avicodecname);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<AviCodecData> __io__addressof() {
		return new CPointer<AviCodecData>(__io__address, new Class[]{AviCodecData.class}, __io__block, __io__blockTable);
	}

}
