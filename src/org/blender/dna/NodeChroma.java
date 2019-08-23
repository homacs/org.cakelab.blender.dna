package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeChroma'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=44, size64=44)
public class NodeChroma extends CFacade {

	/**
	 * This is the sdna index of the struct NodeChroma.
	 * <p>
	 * It is required when allocating a new block to store data for NodeChroma.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 415;

	/**
	 * Field descriptor (offset) for struct member 't1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeChroma nodechroma = ...;
	 * CPointer&lt;Object&gt; p = nodechroma.__dna__addressof(NodeChroma.__DNA__FIELD__t1);
	 * CPointer&lt;Float&gt; p_t1 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 't1'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__t1 = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 't2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeChroma nodechroma = ...;
	 * CPointer&lt;Object&gt; p = nodechroma.__dna__addressof(NodeChroma.__DNA__FIELD__t2);
	 * CPointer&lt;Float&gt; p_t2 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 't2'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__t2 = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 't3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeChroma nodechroma = ...;
	 * CPointer&lt;Object&gt; p = nodechroma.__dna__addressof(NodeChroma.__DNA__FIELD__t3);
	 * CPointer&lt;Float&gt; p_t3 = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 't3'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__t3 = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'fsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeChroma nodechroma = ...;
	 * CPointer&lt;Object&gt; p = nodechroma.__dna__addressof(NodeChroma.__DNA__FIELD__fsize);
	 * CPointer&lt;Float&gt; p_fsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fsize = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'fstrength'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeChroma nodechroma = ...;
	 * CPointer&lt;Object&gt; p = nodechroma.__dna__addressof(NodeChroma.__DNA__FIELD__fstrength);
	 * CPointer&lt;Float&gt; p_fstrength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fstrength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fstrength = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'falpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeChroma nodechroma = ...;
	 * CPointer&lt;Object&gt; p = nodechroma.__dna__addressof(NodeChroma.__DNA__FIELD__falpha);
	 * CPointer&lt;Float&gt; p_falpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'falpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__falpha = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'key'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeChroma nodechroma = ...;
	 * CPointer&lt;Object&gt; p = nodechroma.__dna__addressof(NodeChroma.__DNA__FIELD__key);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_key = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'key'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__key = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'algorithm'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeChroma nodechroma = ...;
	 * CPointer&lt;Object&gt; p = nodechroma.__dna__addressof(NodeChroma.__DNA__FIELD__algorithm);
	 * CPointer&lt;Short&gt; p_algorithm = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'algorithm'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__algorithm = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'channel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeChroma nodechroma = ...;
	 * CPointer&lt;Object&gt; p = nodechroma.__dna__addressof(NodeChroma.__DNA__FIELD__channel);
	 * CPointer&lt;Short&gt; p_channel = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'channel'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__channel = new long[]{42, 42};

	public NodeChroma(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeChroma(NodeChroma that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 't1'.
	 * @see #__DNA__FIELD__t1
	 */
	
	public float getT1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 't1'.
	 * @see #__DNA__FIELD__t1
	 */
	
	public void setT1(float t1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, t1);
		} else {
			__io__block.writeFloat(__io__address + 0, t1);
		}
	}

	/**
	 * Get method for struct member 't2'.
	 * @see #__DNA__FIELD__t2
	 */
	
	public float getT2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 't2'.
	 * @see #__DNA__FIELD__t2
	 */
	
	public void setT2(float t2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, t2);
		} else {
			__io__block.writeFloat(__io__address + 4, t2);
		}
	}

	/**
	 * Get method for struct member 't3'.
	 * @see #__DNA__FIELD__t3
	 */
	
	public float getT3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 't3'.
	 * @see #__DNA__FIELD__t3
	 */
	
	public void setT3(float t3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, t3);
		} else {
			__io__block.writeFloat(__io__address + 8, t3);
		}
	}

	/**
	 * Get method for struct member 'fsize'.
	 * @see #__DNA__FIELD__fsize
	 */
	
	public float getFsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'fsize'.
	 * @see #__DNA__FIELD__fsize
	 */
	
	public void setFsize(float fsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, fsize);
		} else {
			__io__block.writeFloat(__io__address + 12, fsize);
		}
	}

	/**
	 * Get method for struct member 'fstrength'.
	 * @see #__DNA__FIELD__fstrength
	 */
	
	public float getFstrength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'fstrength'.
	 * @see #__DNA__FIELD__fstrength
	 */
	
	public void setFstrength(float fstrength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, fstrength);
		} else {
			__io__block.writeFloat(__io__address + 16, fstrength);
		}
	}

	/**
	 * Get method for struct member 'falpha'.
	 * @see #__DNA__FIELD__falpha
	 */
	
	public float getFalpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'falpha'.
	 * @see #__DNA__FIELD__falpha
	 */
	
	public void setFalpha(float falpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, falpha);
		} else {
			__io__block.writeFloat(__io__address + 20, falpha);
		}
	}

	/**
	 * Get method for struct member 'key'.
	 * @see #__DNA__FIELD__key
	 */
	
	public CArrayFacade<Float> getKey() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'key'.
	 * @see #__DNA__FIELD__key
	 */
	
	public void setKey(CArrayFacade<Float> key) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(key, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, key)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, key);
		} else {
			__io__generic__copy( getKey(), key);
		}
	}

	/**
	 * Get method for struct member 'algorithm'.
	 * @see #__DNA__FIELD__algorithm
	 */
	
	public short getAlgorithm() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 40);
		} else {
			return __io__block.readShort(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'algorithm'.
	 * @see #__DNA__FIELD__algorithm
	 */
	
	public void setAlgorithm(short algorithm) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 40, algorithm);
		} else {
			__io__block.writeShort(__io__address + 40, algorithm);
		}
	}

	/**
	 * Get method for struct member 'channel'.
	 * @see #__DNA__FIELD__channel
	 */
	
	public short getChannel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 42);
		} else {
			return __io__block.readShort(__io__address + 42);
		}
	}

	/**
	 * Set method for struct member 'channel'.
	 * @see #__DNA__FIELD__channel
	 */
	
	public void setChannel(short channel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 42, channel);
		} else {
			__io__block.writeShort(__io__address + 42, channel);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeChroma> __io__addressof() {
		return new CPointer<NodeChroma>(__io__address, new Class[]{NodeChroma.class}, __io__block, __io__blockTable);
	}

}
