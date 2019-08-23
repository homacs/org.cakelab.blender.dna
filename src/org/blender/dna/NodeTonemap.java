package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeTonemap'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> qdn: tonemap node </p>
 */

@CMetaData(size32=32, size64=32)
public class NodeTonemap extends CFacade {

	/**
	 * This is the sdna index of the struct NodeTonemap.
	 * <p>
	 * It is required when allocating a new block to store data for NodeTonemap.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 395;

	/**
	 * Field descriptor (offset) for struct member 'key'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTonemap nodetonemap = ...;
	 * CPointer&lt;Object&gt; p = nodetonemap.__dna__addressof(NodeTonemap.__DNA__FIELD__key);
	 * CPointer&lt;Float&gt; p_key = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'key'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__key = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTonemap nodetonemap = ...;
	 * CPointer&lt;Object&gt; p = nodetonemap.__dna__addressof(NodeTonemap.__DNA__FIELD__offset);
	 * CPointer&lt;Float&gt; p_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'gamma'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTonemap nodetonemap = ...;
	 * CPointer&lt;Object&gt; p = nodetonemap.__dna__addressof(NodeTonemap.__DNA__FIELD__gamma);
	 * CPointer&lt;Float&gt; p_gamma = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gamma'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gamma = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'f'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTonemap nodetonemap = ...;
	 * CPointer&lt;Object&gt; p = nodetonemap.__dna__addressof(NodeTonemap.__DNA__FIELD__f);
	 * CPointer&lt;Float&gt; p_f = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'f'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__f = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'm'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTonemap nodetonemap = ...;
	 * CPointer&lt;Object&gt; p = nodetonemap.__dna__addressof(NodeTonemap.__DNA__FIELD__m);
	 * CPointer&lt;Float&gt; p_m = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'm'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__m = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'a'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTonemap nodetonemap = ...;
	 * CPointer&lt;Object&gt; p = nodetonemap.__dna__addressof(NodeTonemap.__DNA__FIELD__a);
	 * CPointer&lt;Float&gt; p_a = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'a'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__a = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'c'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTonemap nodetonemap = ...;
	 * CPointer&lt;Object&gt; p = nodetonemap.__dna__addressof(NodeTonemap.__DNA__FIELD__c);
	 * CPointer&lt;Float&gt; p_c = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'c'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__c = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTonemap nodetonemap = ...;
	 * CPointer&lt;Object&gt; p = nodetonemap.__dna__addressof(NodeTonemap.__DNA__FIELD__type);
	 * CPointer&lt;Integer&gt; p_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{28, 28};

	public NodeTonemap(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeTonemap(NodeTonemap that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'key'.
	 * @see #__DNA__FIELD__key
	 */
	
	public float getKey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'key'.
	 * @see #__DNA__FIELD__key
	 */
	
	public void setKey(float key) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, key);
		} else {
			__io__block.writeFloat(__io__address + 0, key);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public float getOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(float offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, offset);
		} else {
			__io__block.writeFloat(__io__address + 4, offset);
		}
	}

	/**
	 * Get method for struct member 'gamma'.
	 * @see #__DNA__FIELD__gamma
	 */
	
	public float getGamma() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'gamma'.
	 * @see #__DNA__FIELD__gamma
	 */
	
	public void setGamma(float gamma) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, gamma);
		} else {
			__io__block.writeFloat(__io__address + 8, gamma);
		}
	}

	/**
	 * Get method for struct member 'f'.
	 * @see #__DNA__FIELD__f
	 */
	
	public float getF() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'f'.
	 * @see #__DNA__FIELD__f
	 */
	
	public void setF(float f) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, f);
		} else {
			__io__block.writeFloat(__io__address + 12, f);
		}
	}

	/**
	 * Get method for struct member 'm'.
	 * @see #__DNA__FIELD__m
	 */
	
	public float getM() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'm'.
	 * @see #__DNA__FIELD__m
	 */
	
	public void setM(float m) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, m);
		} else {
			__io__block.writeFloat(__io__address + 16, m);
		}
	}

	/**
	 * Get method for struct member 'a'.
	 * @see #__DNA__FIELD__a
	 */
	
	public float getA() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'a'.
	 * @see #__DNA__FIELD__a
	 */
	
	public void setA(float a) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, a);
		} else {
			__io__block.writeFloat(__io__address + 20, a);
		}
	}

	/**
	 * Get method for struct member 'c'.
	 * @see #__DNA__FIELD__c
	 */
	
	public float getC() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'c'.
	 * @see #__DNA__FIELD__c
	 */
	
	public void setC(float c) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, c);
		} else {
			__io__block.writeFloat(__io__address + 24, c);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public int getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(int type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, type);
		} else {
			__io__block.writeInt(__io__address + 28, type);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeTonemap> __io__addressof() {
		return new CPointer<NodeTonemap>(__io__address, new Class[]{NodeTonemap.class}, __io__block, __io__blockTable);
	}

}
