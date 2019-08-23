package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeKeyingData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=48, size64=48)
public class NodeKeyingData extends CFacade {

	/**
	 * This is the sdna index of the struct NodeKeyingData.
	 * <p>
	 * It is required when allocating a new block to store data for NodeKeyingData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 446;

	/**
	 * Field descriptor (offset) for struct member 'screen_balance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeKeyingData nodekeyingdata = ...;
	 * CPointer&lt;Object&gt; p = nodekeyingdata.__dna__addressof(NodeKeyingData.__DNA__FIELD__screen_balance);
	 * CPointer&lt;Float&gt; p_screen_balance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'screen_balance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__screen_balance = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'despill_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeKeyingData nodekeyingdata = ...;
	 * CPointer&lt;Object&gt; p = nodekeyingdata.__dna__addressof(NodeKeyingData.__DNA__FIELD__despill_factor);
	 * CPointer&lt;Float&gt; p_despill_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'despill_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__despill_factor = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'despill_balance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeKeyingData nodekeyingdata = ...;
	 * CPointer&lt;Object&gt; p = nodekeyingdata.__dna__addressof(NodeKeyingData.__DNA__FIELD__despill_balance);
	 * CPointer&lt;Float&gt; p_despill_balance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'despill_balance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__despill_balance = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'edge_kernel_radius'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeKeyingData nodekeyingdata = ...;
	 * CPointer&lt;Object&gt; p = nodekeyingdata.__dna__addressof(NodeKeyingData.__DNA__FIELD__edge_kernel_radius);
	 * CPointer&lt;Integer&gt; p_edge_kernel_radius = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge_kernel_radius'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge_kernel_radius = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'edge_kernel_tolerance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeKeyingData nodekeyingdata = ...;
	 * CPointer&lt;Object&gt; p = nodekeyingdata.__dna__addressof(NodeKeyingData.__DNA__FIELD__edge_kernel_tolerance);
	 * CPointer&lt;Float&gt; p_edge_kernel_tolerance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edge_kernel_tolerance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edge_kernel_tolerance = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'clip_black'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeKeyingData nodekeyingdata = ...;
	 * CPointer&lt;Object&gt; p = nodekeyingdata.__dna__addressof(NodeKeyingData.__DNA__FIELD__clip_black);
	 * CPointer&lt;Float&gt; p_clip_black = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clip_black'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clip_black = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'clip_white'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeKeyingData nodekeyingdata = ...;
	 * CPointer&lt;Object&gt; p = nodekeyingdata.__dna__addressof(NodeKeyingData.__DNA__FIELD__clip_white);
	 * CPointer&lt;Float&gt; p_clip_white = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clip_white'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clip_white = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'dilate_distance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeKeyingData nodekeyingdata = ...;
	 * CPointer&lt;Object&gt; p = nodekeyingdata.__dna__addressof(NodeKeyingData.__DNA__FIELD__dilate_distance);
	 * CPointer&lt;Integer&gt; p_dilate_distance = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dilate_distance'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dilate_distance = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'feather_distance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeKeyingData nodekeyingdata = ...;
	 * CPointer&lt;Object&gt; p = nodekeyingdata.__dna__addressof(NodeKeyingData.__DNA__FIELD__feather_distance);
	 * CPointer&lt;Integer&gt; p_feather_distance = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'feather_distance'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__feather_distance = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'feather_falloff'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeKeyingData nodekeyingdata = ...;
	 * CPointer&lt;Object&gt; p = nodekeyingdata.__dna__addressof(NodeKeyingData.__DNA__FIELD__feather_falloff);
	 * CPointer&lt;Integer&gt; p_feather_falloff = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'feather_falloff'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__feather_falloff = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'blur_pre'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeKeyingData nodekeyingdata = ...;
	 * CPointer&lt;Object&gt; p = nodekeyingdata.__dna__addressof(NodeKeyingData.__DNA__FIELD__blur_pre);
	 * CPointer&lt;Integer&gt; p_blur_pre = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blur_pre'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blur_pre = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'blur_post'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeKeyingData nodekeyingdata = ...;
	 * CPointer&lt;Object&gt; p = nodekeyingdata.__dna__addressof(NodeKeyingData.__DNA__FIELD__blur_post);
	 * CPointer&lt;Integer&gt; p_blur_post = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blur_post'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blur_post = new long[]{44, 44};

	public NodeKeyingData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeKeyingData(NodeKeyingData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'screen_balance'.
	 * @see #__DNA__FIELD__screen_balance
	 */
	
	public float getScreen_balance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'screen_balance'.
	 * @see #__DNA__FIELD__screen_balance
	 */
	
	public void setScreen_balance(float screen_balance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, screen_balance);
		} else {
			__io__block.writeFloat(__io__address + 0, screen_balance);
		}
	}

	/**
	 * Get method for struct member 'despill_factor'.
	 * @see #__DNA__FIELD__despill_factor
	 */
	
	public float getDespill_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'despill_factor'.
	 * @see #__DNA__FIELD__despill_factor
	 */
	
	public void setDespill_factor(float despill_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, despill_factor);
		} else {
			__io__block.writeFloat(__io__address + 4, despill_factor);
		}
	}

	/**
	 * Get method for struct member 'despill_balance'.
	 * @see #__DNA__FIELD__despill_balance
	 */
	
	public float getDespill_balance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'despill_balance'.
	 * @see #__DNA__FIELD__despill_balance
	 */
	
	public void setDespill_balance(float despill_balance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, despill_balance);
		} else {
			__io__block.writeFloat(__io__address + 8, despill_balance);
		}
	}

	/**
	 * Get method for struct member 'edge_kernel_radius'.
	 * @see #__DNA__FIELD__edge_kernel_radius
	 */
	
	public int getEdge_kernel_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'edge_kernel_radius'.
	 * @see #__DNA__FIELD__edge_kernel_radius
	 */
	
	public void setEdge_kernel_radius(int edge_kernel_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, edge_kernel_radius);
		} else {
			__io__block.writeInt(__io__address + 12, edge_kernel_radius);
		}
	}

	/**
	 * Get method for struct member 'edge_kernel_tolerance'.
	 * @see #__DNA__FIELD__edge_kernel_tolerance
	 */
	
	public float getEdge_kernel_tolerance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'edge_kernel_tolerance'.
	 * @see #__DNA__FIELD__edge_kernel_tolerance
	 */
	
	public void setEdge_kernel_tolerance(float edge_kernel_tolerance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, edge_kernel_tolerance);
		} else {
			__io__block.writeFloat(__io__address + 16, edge_kernel_tolerance);
		}
	}

	/**
	 * Get method for struct member 'clip_black'.
	 * @see #__DNA__FIELD__clip_black
	 */
	
	public float getClip_black() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'clip_black'.
	 * @see #__DNA__FIELD__clip_black
	 */
	
	public void setClip_black(float clip_black) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, clip_black);
		} else {
			__io__block.writeFloat(__io__address + 20, clip_black);
		}
	}

	/**
	 * Get method for struct member 'clip_white'.
	 * @see #__DNA__FIELD__clip_white
	 */
	
	public float getClip_white() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'clip_white'.
	 * @see #__DNA__FIELD__clip_white
	 */
	
	public void setClip_white(float clip_white) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, clip_white);
		} else {
			__io__block.writeFloat(__io__address + 24, clip_white);
		}
	}

	/**
	 * Get method for struct member 'dilate_distance'.
	 * @see #__DNA__FIELD__dilate_distance
	 */
	
	public int getDilate_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'dilate_distance'.
	 * @see #__DNA__FIELD__dilate_distance
	 */
	
	public void setDilate_distance(int dilate_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, dilate_distance);
		} else {
			__io__block.writeInt(__io__address + 28, dilate_distance);
		}
	}

	/**
	 * Get method for struct member 'feather_distance'.
	 * @see #__DNA__FIELD__feather_distance
	 */
	
	public int getFeather_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'feather_distance'.
	 * @see #__DNA__FIELD__feather_distance
	 */
	
	public void setFeather_distance(int feather_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, feather_distance);
		} else {
			__io__block.writeInt(__io__address + 32, feather_distance);
		}
	}

	/**
	 * Get method for struct member 'feather_falloff'.
	 * @see #__DNA__FIELD__feather_falloff
	 */
	
	public int getFeather_falloff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'feather_falloff'.
	 * @see #__DNA__FIELD__feather_falloff
	 */
	
	public void setFeather_falloff(int feather_falloff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, feather_falloff);
		} else {
			__io__block.writeInt(__io__address + 36, feather_falloff);
		}
	}

	/**
	 * Get method for struct member 'blur_pre'.
	 * @see #__DNA__FIELD__blur_pre
	 */
	
	public int getBlur_pre() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'blur_pre'.
	 * @see #__DNA__FIELD__blur_pre
	 */
	
	public void setBlur_pre(int blur_pre) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, blur_pre);
		} else {
			__io__block.writeInt(__io__address + 40, blur_pre);
		}
	}

	/**
	 * Get method for struct member 'blur_post'.
	 * @see #__DNA__FIELD__blur_post
	 */
	
	public int getBlur_post() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'blur_post'.
	 * @see #__DNA__FIELD__blur_post
	 */
	
	public void setBlur_post(int blur_post) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, blur_post);
		} else {
			__io__block.writeInt(__io__address + 44, blur_post);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeKeyingData> __io__addressof() {
		return new CPointer<NodeKeyingData>(__io__address, new Class[]{NodeKeyingData.class}, __io__block, __io__blockTable);
	}

}
