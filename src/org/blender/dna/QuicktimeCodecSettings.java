package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'QuicktimeCodecSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=64, size64=64)
public class QuicktimeCodecSettings extends CFacade {

	/**
	 * This is the sdna index of the struct QuicktimeCodecSettings.
	 * <p>
	 * It is required when allocating a new block to store data for QuicktimeCodecSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 167;

	/**
	 * Field descriptor (offset) for struct member 'codecType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Codec settings detailed for 2.5 implementation Types defined in quicktime_export.h </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__codecType);
	 * CPointer&lt;Integer&gt; p_codecType = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'codecType'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__codecType = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'codecSpatialQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in 0-100 scale, to be translated in 0-1024 for qt use </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__codecSpatialQuality);
	 * CPointer&lt;Integer&gt; p_codecSpatialQuality = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'codecSpatialQuality'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__codecSpatialQuality = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'codec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings not available in current QTKit API </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__codec);
	 * CPointer&lt;Integer&gt; p_codec = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'codec'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__codec = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'codecFlags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__codecFlags);
	 * CPointer&lt;Integer&gt; p_codecFlags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'codecFlags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__codecFlags = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'colorDepth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__colorDepth);
	 * CPointer&lt;Integer&gt; p_colorDepth = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colorDepth'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colorDepth = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'codecTemporalQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in 0-100 scale, to be translated in 0-1024 for qt use </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__codecTemporalQuality);
	 * CPointer&lt;Integer&gt; p_codecTemporalQuality = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'codecTemporalQuality'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__codecTemporalQuality = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'minSpatialQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in 0-100 scale, to be translated in 0-1024 for qt use </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__minSpatialQuality);
	 * CPointer&lt;Integer&gt; p_minSpatialQuality = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minSpatialQuality'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minSpatialQuality = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'minTemporalQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in 0-100 scale, to be translated in 0-1024 for qt use </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__minTemporalQuality);
	 * CPointer&lt;Integer&gt; p_minTemporalQuality = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minTemporalQuality'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minTemporalQuality = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'keyFrameRate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__keyFrameRate);
	 * CPointer&lt;Integer&gt; p_keyFrameRate = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyFrameRate'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyFrameRate = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'bitRate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bitrate in bps </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__bitRate);
	 * CPointer&lt;Integer&gt; p_bitRate = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bitRate'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bitRate = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'audiocodecType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Audio Codec settings </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__audiocodecType);
	 * CPointer&lt;Integer&gt; p_audiocodecType = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audiocodecType'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audiocodecType = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'audioSampleRate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__audioSampleRate);
	 * CPointer&lt;Integer&gt; p_audioSampleRate = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audioSampleRate'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audioSampleRate = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'audioBitDepth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__audioBitDepth);
	 * CPointer&lt;Short&gt; p_audioBitDepth = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audioBitDepth'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audioBitDepth = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'audioChannels'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__audioChannels);
	 * CPointer&lt;Short&gt; p_audioChannels = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audioChannels'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audioChannels = new long[]{50, 50};

	/**
	 * Field descriptor (offset) for struct member 'audioCodecFlags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__audioCodecFlags);
	 * CPointer&lt;Integer&gt; p_audioCodecFlags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audioCodecFlags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audioCodecFlags = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'audioBitRate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__audioBitRate);
	 * CPointer&lt;Integer&gt; p_audioBitRate = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audioBitRate'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audioBitRate = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecSettings quicktimecodecsettings = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecsettings.__dna__addressof(QuicktimeCodecSettings.__DNA__FIELD__pad1);
	 * CPointer&lt;Integer&gt; p_pad1 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad1'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad1 = new long[]{60, 60};

	public QuicktimeCodecSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected QuicktimeCodecSettings(QuicktimeCodecSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'codecType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Codec settings detailed for 2.5 implementation Types defined in quicktime_export.h </p>
	 * @see #__DNA__FIELD__codecType
	 */
	
	public int getCodecType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'codecType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Codec settings detailed for 2.5 implementation Types defined in quicktime_export.h </p>
	 * @see #__DNA__FIELD__codecType
	 */
	
	public void setCodecType(int codecType) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, codecType);
		} else {
			__io__block.writeInt(__io__address + 0, codecType);
		}
	}

	/**
	 * Get method for struct member 'codecSpatialQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in 0-100 scale, to be translated in 0-1024 for qt use </p>
	 * @see #__DNA__FIELD__codecSpatialQuality
	 */
	
	public int getCodecSpatialQuality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'codecSpatialQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in 0-100 scale, to be translated in 0-1024 for qt use </p>
	 * @see #__DNA__FIELD__codecSpatialQuality
	 */
	
	public void setCodecSpatialQuality(int codecSpatialQuality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, codecSpatialQuality);
		} else {
			__io__block.writeInt(__io__address + 4, codecSpatialQuality);
		}
	}

	/**
	 * Get method for struct member 'codec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings not available in current QTKit API </p>
	 * @see #__DNA__FIELD__codec
	 */
	
	public int getCodec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'codec'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Settings not available in current QTKit API </p>
	 * @see #__DNA__FIELD__codec
	 */
	
	public void setCodec(int codec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, codec);
		} else {
			__io__block.writeInt(__io__address + 8, codec);
		}
	}

	/**
	 * Get method for struct member 'codecFlags'.
	 * @see #__DNA__FIELD__codecFlags
	 */
	
	public int getCodecFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'codecFlags'.
	 * @see #__DNA__FIELD__codecFlags
	 */
	
	public void setCodecFlags(int codecFlags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, codecFlags);
		} else {
			__io__block.writeInt(__io__address + 12, codecFlags);
		}
	}

	/**
	 * Get method for struct member 'colorDepth'.
	 * @see #__DNA__FIELD__colorDepth
	 */
	
	public int getColorDepth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'colorDepth'.
	 * @see #__DNA__FIELD__colorDepth
	 */
	
	public void setColorDepth(int colorDepth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, colorDepth);
		} else {
			__io__block.writeInt(__io__address + 16, colorDepth);
		}
	}

	/**
	 * Get method for struct member 'codecTemporalQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in 0-100 scale, to be translated in 0-1024 for qt use </p>
	 * @see #__DNA__FIELD__codecTemporalQuality
	 */
	
	public int getCodecTemporalQuality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'codecTemporalQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in 0-100 scale, to be translated in 0-1024 for qt use </p>
	 * @see #__DNA__FIELD__codecTemporalQuality
	 */
	
	public void setCodecTemporalQuality(int codecTemporalQuality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, codecTemporalQuality);
		} else {
			__io__block.writeInt(__io__address + 20, codecTemporalQuality);
		}
	}

	/**
	 * Get method for struct member 'minSpatialQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in 0-100 scale, to be translated in 0-1024 for qt use </p>
	 * @see #__DNA__FIELD__minSpatialQuality
	 */
	
	public int getMinSpatialQuality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'minSpatialQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in 0-100 scale, to be translated in 0-1024 for qt use </p>
	 * @see #__DNA__FIELD__minSpatialQuality
	 */
	
	public void setMinSpatialQuality(int minSpatialQuality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, minSpatialQuality);
		} else {
			__io__block.writeInt(__io__address + 24, minSpatialQuality);
		}
	}

	/**
	 * Get method for struct member 'minTemporalQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in 0-100 scale, to be translated in 0-1024 for qt use </p>
	 * @see #__DNA__FIELD__minTemporalQuality
	 */
	
	public int getMinTemporalQuality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'minTemporalQuality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in 0-100 scale, to be translated in 0-1024 for qt use </p>
	 * @see #__DNA__FIELD__minTemporalQuality
	 */
	
	public void setMinTemporalQuality(int minTemporalQuality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, minTemporalQuality);
		} else {
			__io__block.writeInt(__io__address + 28, minTemporalQuality);
		}
	}

	/**
	 * Get method for struct member 'keyFrameRate'.
	 * @see #__DNA__FIELD__keyFrameRate
	 */
	
	public int getKeyFrameRate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'keyFrameRate'.
	 * @see #__DNA__FIELD__keyFrameRate
	 */
	
	public void setKeyFrameRate(int keyFrameRate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, keyFrameRate);
		} else {
			__io__block.writeInt(__io__address + 32, keyFrameRate);
		}
	}

	/**
	 * Get method for struct member 'bitRate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bitrate in bps </p>
	 * @see #__DNA__FIELD__bitRate
	 */
	
	public int getBitRate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'bitRate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> bitrate in bps </p>
	 * @see #__DNA__FIELD__bitRate
	 */
	
	public void setBitRate(int bitRate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, bitRate);
		} else {
			__io__block.writeInt(__io__address + 36, bitRate);
		}
	}

	/**
	 * Get method for struct member 'audiocodecType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Audio Codec settings </p>
	 * @see #__DNA__FIELD__audiocodecType
	 */
	
	public int getAudiocodecType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'audiocodecType'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Audio Codec settings </p>
	 * @see #__DNA__FIELD__audiocodecType
	 */
	
	public void setAudiocodecType(int audiocodecType) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, audiocodecType);
		} else {
			__io__block.writeInt(__io__address + 40, audiocodecType);
		}
	}

	/**
	 * Get method for struct member 'audioSampleRate'.
	 * @see #__DNA__FIELD__audioSampleRate
	 */
	
	public int getAudioSampleRate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'audioSampleRate'.
	 * @see #__DNA__FIELD__audioSampleRate
	 */
	
	public void setAudioSampleRate(int audioSampleRate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, audioSampleRate);
		} else {
			__io__block.writeInt(__io__address + 44, audioSampleRate);
		}
	}

	/**
	 * Get method for struct member 'audioBitDepth'.
	 * @see #__DNA__FIELD__audioBitDepth
	 */
	
	public short getAudioBitDepth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 48);
		} else {
			return __io__block.readShort(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'audioBitDepth'.
	 * @see #__DNA__FIELD__audioBitDepth
	 */
	
	public void setAudioBitDepth(short audioBitDepth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 48, audioBitDepth);
		} else {
			__io__block.writeShort(__io__address + 48, audioBitDepth);
		}
	}

	/**
	 * Get method for struct member 'audioChannels'.
	 * @see #__DNA__FIELD__audioChannels
	 */
	
	public short getAudioChannels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 50);
		} else {
			return __io__block.readShort(__io__address + 50);
		}
	}

	/**
	 * Set method for struct member 'audioChannels'.
	 * @see #__DNA__FIELD__audioChannels
	 */
	
	public void setAudioChannels(short audioChannels) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 50, audioChannels);
		} else {
			__io__block.writeShort(__io__address + 50, audioChannels);
		}
	}

	/**
	 * Get method for struct member 'audioCodecFlags'.
	 * @see #__DNA__FIELD__audioCodecFlags
	 */
	
	public int getAudioCodecFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 52);
		} else {
			return __io__block.readInt(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'audioCodecFlags'.
	 * @see #__DNA__FIELD__audioCodecFlags
	 */
	
	public void setAudioCodecFlags(int audioCodecFlags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 52, audioCodecFlags);
		} else {
			__io__block.writeInt(__io__address + 52, audioCodecFlags);
		}
	}

	/**
	 * Get method for struct member 'audioBitRate'.
	 * @see #__DNA__FIELD__audioBitRate
	 */
	
	public int getAudioBitRate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 56);
		} else {
			return __io__block.readInt(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'audioBitRate'.
	 * @see #__DNA__FIELD__audioBitRate
	 */
	
	public void setAudioBitRate(int audioBitRate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 56, audioBitRate);
		} else {
			__io__block.writeInt(__io__address + 56, audioBitRate);
		}
	}

	/**
	 * Get method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public int getPad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 60);
		} else {
			return __io__block.readInt(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public void setPad1(int pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 60, pad1);
		} else {
			__io__block.writeInt(__io__address + 60, pad1);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<QuicktimeCodecSettings> __io__addressof() {
		return new CPointer<QuicktimeCodecSettings>(__io__address, new Class[]{QuicktimeCodecSettings.class}, __io__block, __io__blockTable);
	}

}
