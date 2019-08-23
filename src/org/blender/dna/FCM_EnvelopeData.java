package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FCM_EnvelopeData'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> envelope modifier - envelope data </p>
 */

@CMetaData(size32=16, size64=16)
public class FCM_EnvelopeData extends CFacade {

	/**
	 * This is the sdna index of the struct FCM_EnvelopeData.
	 * <p>
	 * It is required when allocating a new block to store data for FCM_EnvelopeData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 509;

	/**
	 * Field descriptor (offset) for struct member 'min'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCM_EnvelopeData fcm_envelopedata = ...;
	 * CPointer&lt;Object&gt; p = fcm_envelopedata.__dna__addressof(FCM_EnvelopeData.__DNA__FIELD__min);
	 * CPointer&lt;Float&gt; p_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> min/max values for envelope at this point (absolute values) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCM_EnvelopeData fcm_envelopedata = ...;
	 * CPointer&lt;Object&gt; p = fcm_envelopedata.__dna__addressof(FCM_EnvelopeData.__DNA__FIELD__max);
	 * CPointer&lt;Float&gt; p_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> time for that this sample-point occurs </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCM_EnvelopeData fcm_envelopedata = ...;
	 * CPointer&lt;Object&gt; p = fcm_envelopedata.__dna__addressof(FCM_EnvelopeData.__DNA__FIELD__time);
	 * CPointer&lt;Float&gt; p_time = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'f1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for 'min' control point </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCM_EnvelopeData fcm_envelopedata = ...;
	 * CPointer&lt;Object&gt; p = fcm_envelopedata.__dna__addressof(FCM_EnvelopeData.__DNA__FIELD__f1);
	 * CPointer&lt;Short&gt; p_f1 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f1'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f1 = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'f2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for 'max' control point </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FCM_EnvelopeData fcm_envelopedata = ...;
	 * CPointer&lt;Object&gt; p = fcm_envelopedata.__dna__addressof(FCM_EnvelopeData.__DNA__FIELD__f2);
	 * CPointer&lt;Short&gt; p_f2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f2 = new long[]{14, 14};

	public FCM_EnvelopeData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FCM_EnvelopeData(FCM_EnvelopeData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'min'.
	 * @see #__DNA__FIELD__min
	 */
	
	public float getMin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'min'.
	 * @see #__DNA__FIELD__min
	 */
	
	public void setMin(float min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, min);
		} else {
			__io__block.writeFloat(__io__address + 0, min);
		}
	}

	/**
	 * Get method for struct member 'max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> min/max values for envelope at this point (absolute values) </p>
	 * @see #__DNA__FIELD__max
	 */
	
	public float getMax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> min/max values for envelope at this point (absolute values) </p>
	 * @see #__DNA__FIELD__max
	 */
	
	public void setMax(float max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, max);
		} else {
			__io__block.writeFloat(__io__address + 4, max);
		}
	}

	/**
	 * Get method for struct member 'time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> time for that this sample-point occurs </p>
	 * @see #__DNA__FIELD__time
	 */
	
	public float getTime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> time for that this sample-point occurs </p>
	 * @see #__DNA__FIELD__time
	 */
	
	public void setTime(float time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, time);
		} else {
			__io__block.writeFloat(__io__address + 8, time);
		}
	}

	/**
	 * Get method for struct member 'f1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for 'min' control point </p>
	 * @see #__DNA__FIELD__f1
	 */
	
	public short getF1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'f1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for 'min' control point </p>
	 * @see #__DNA__FIELD__f1
	 */
	
	public void setF1(short f1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12, f1);
		} else {
			__io__block.writeShort(__io__address + 12, f1);
		}
	}

	/**
	 * Get method for struct member 'f2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for 'max' control point </p>
	 * @see #__DNA__FIELD__f2
	 */
	
	public short getF2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 14);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'f2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> settings for 'max' control point </p>
	 * @see #__DNA__FIELD__f2
	 */
	
	public void setF2(short f2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 14, f2);
		} else {
			__io__block.writeShort(__io__address + 14, f2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FCM_EnvelopeData> __io__addressof() {
		return new CPointer<FCM_EnvelopeData>(__io__address, new Class[]{FCM_EnvelopeData.class}, __io__block, __io__blockTable);
	}

}
