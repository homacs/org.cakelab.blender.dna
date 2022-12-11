package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CorrectiveSmoothDeltaCache'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=28, size64=32)
public class CorrectiveSmoothDeltaCache extends CFacade {

	/**
	 * This is the sdna index of the struct CorrectiveSmoothDeltaCache.
	 * <p>
	 * It is required when allocating a new block to store data for CorrectiveSmoothDeltaCache.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 370;

	/**
	 * Field descriptor (offset) for struct member 'deltas_num'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothDeltaCache correctivesmoothdeltacache = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothdeltacache.__dna__addressof(CorrectiveSmoothDeltaCache.__DNA__FIELD__deltas_num);
	 * CPointer&lt;Integer&gt; p_deltas_num = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'deltas_num'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__deltas_num = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'lambda'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Value of settings when creating the cache. These are used to check if the cache should be recomputed. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothDeltaCache correctivesmoothdeltacache = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothdeltacache.__dna__addressof(CorrectiveSmoothDeltaCache.__DNA__FIELD__lambda);
	 * CPointer&lt;Float&gt; p_lambda = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lambda'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lambda = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothDeltaCache correctivesmoothdeltacache = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothdeltacache.__dna__addressof(CorrectiveSmoothDeltaCache.__DNA__FIELD__scale);
	 * CPointer&lt;Float&gt; p_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'repeat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothDeltaCache correctivesmoothdeltacache = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothdeltacache.__dna__addressof(CorrectiveSmoothDeltaCache.__DNA__FIELD__repeat);
	 * CPointer&lt;Short&gt; p_repeat = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'repeat'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__repeat = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothDeltaCache correctivesmoothdeltacache = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothdeltacache.__dna__addressof(CorrectiveSmoothDeltaCache.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{18, 22};

	/**
	 * Field descriptor (offset) for struct member 'smooth_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothDeltaCache correctivesmoothdeltacache = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothdeltacache.__dna__addressof(CorrectiveSmoothDeltaCache.__DNA__FIELD__smooth_type);
	 * CPointer&lt;Byte&gt; p_smooth_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smooth_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smooth_type = new long[]{20, 24};

	/**
	 * Field descriptor (offset) for struct member 'rest_source'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothDeltaCache correctivesmoothdeltacache = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothdeltacache.__dna__addressof(CorrectiveSmoothDeltaCache.__DNA__FIELD__rest_source);
	 * CPointer&lt;Byte&gt; p_rest_source = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rest_source'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rest_source = new long[]{21, 25};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CorrectiveSmoothDeltaCache correctivesmoothdeltacache = ...;
	 * CPointer&lt;Object&gt; p = correctivesmoothdeltacache.__dna__addressof(CorrectiveSmoothDeltaCache.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{22, 26};

	public CorrectiveSmoothDeltaCache(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CorrectiveSmoothDeltaCache(CorrectiveSmoothDeltaCache that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'deltas_num'.
	 * @see #__DNA__FIELD__deltas_num
	 */
	
	public int getDeltas_num() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'deltas_num'.
	 * @see #__DNA__FIELD__deltas_num
	 */
	
	public void setDeltas_num(int deltas_num) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, deltas_num);
		} else {
			__io__block.writeInt(__io__address + 4, deltas_num);
		}
	}

	/**
	 * Get method for struct member 'lambda'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Value of settings when creating the cache. These are used to check if the cache should be recomputed. </p>
	 * @see #__DNA__FIELD__lambda
	 */
	
	public float getLambda() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'lambda'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Value of settings when creating the cache. These are used to check if the cache should be recomputed. </p>
	 * @see #__DNA__FIELD__lambda
	 */
	
	public void setLambda(float lambda) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, lambda);
		} else {
			__io__block.writeFloat(__io__address + 8, lambda);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public float getScale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(float scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, scale);
		} else {
			__io__block.writeFloat(__io__address + 12, scale);
		}
	}

	/**
	 * Get method for struct member 'repeat'.
	 * @see #__DNA__FIELD__repeat
	 */
	
	public short getRepeat() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'repeat'.
	 * @see #__DNA__FIELD__repeat
	 */
	
	public void setRepeat(short repeat) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, repeat);
		} else {
			__io__block.writeShort(__io__address + 16, repeat);
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
			return __io__block.readShort(__io__address + 18);
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
			__io__block.writeShort(__io__address + 18, flag);
		}
	}

	/**
	 * Get method for struct member 'smooth_type'.
	 * @see #__DNA__FIELD__smooth_type
	 */
	
	public byte getSmooth_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 24);
		} else {
			return __io__block.readByte(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'smooth_type'.
	 * @see #__DNA__FIELD__smooth_type
	 */
	
	public void setSmooth_type(byte smooth_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 24, smooth_type);
		} else {
			__io__block.writeByte(__io__address + 20, smooth_type);
		}
	}

	/**
	 * Get method for struct member 'rest_source'.
	 * @see #__DNA__FIELD__rest_source
	 */
	
	public byte getRest_source() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 25);
		} else {
			return __io__block.readByte(__io__address + 21);
		}
	}

	/**
	 * Set method for struct member 'rest_source'.
	 * @see #__DNA__FIELD__rest_source
	 */
	
	public void setRest_source(byte rest_source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 25, rest_source);
		} else {
			__io__block.writeByte(__io__address + 21, rest_source);
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
			return new CArrayFacade<Byte>(__io__address + 26, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 22, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 26;
		} else {
			__dna__offset = 22;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CorrectiveSmoothDeltaCache> __io__addressof() {
		return new CPointer<CorrectiveSmoothDeltaCache>(__io__address, new Class[]{CorrectiveSmoothDeltaCache.class}, __io__block, __io__blockTable);
	}

}
