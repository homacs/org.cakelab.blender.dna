package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'WalkNavigation'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=32, size64=32)
public class WalkNavigation extends CFacade {

	/**
	 * This is the sdna index of the struct WalkNavigation.
	 * <p>
	 * It is required when allocating a new block to store data for WalkNavigation.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 249;

	/**
	 * Field descriptor (offset) for struct member 'mouse_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed factor for when looking around, high values mean faster mouse movement<h4>Blender Source Code:</h4>
	 * <p> speed factor for look around </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WalkNavigation walknavigation = ...;
	 * CPointer&lt;Object&gt; p = walknavigation.__dna__addressof(WalkNavigation.__DNA__FIELD__mouse_speed);
	 * CPointer&lt;Float&gt; p_mouse_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mouse_speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mouse_speed = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'walk_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Base speed for walking and flying
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WalkNavigation walknavigation = ...;
	 * CPointer&lt;Object&gt; p = walknavigation.__dna__addressof(WalkNavigation.__DNA__FIELD__walk_speed);
	 * CPointer&lt;Float&gt; p_walk_speed = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'walk_speed'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__walk_speed = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'walk_speed_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplication factor when using the fast or slow modifiers
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WalkNavigation walknavigation = ...;
	 * CPointer&lt;Object&gt; p = walknavigation.__dna__addressof(WalkNavigation.__DNA__FIELD__walk_speed_factor);
	 * CPointer&lt;Float&gt; p_walk_speed_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'walk_speed_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__walk_speed_factor = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'view_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * View distance from the floor when walking
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WalkNavigation walknavigation = ...;
	 * CPointer&lt;Object&gt; p = walknavigation.__dna__addressof(WalkNavigation.__DNA__FIELD__view_height);
	 * CPointer&lt;Float&gt; p_view_height = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_height'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_height = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'jump_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum height of a jump
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WalkNavigation walknavigation = ...;
	 * CPointer&lt;Object&gt; p = walknavigation.__dna__addressof(WalkNavigation.__DNA__FIELD__jump_height);
	 * CPointer&lt;Float&gt; p_jump_height = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'jump_height'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__jump_height = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'teleport_time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Interval of time warp when teleporting in navigation mode<h4>Blender Source Code:</h4>
	 * <p> duration to use for teleporting </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WalkNavigation walknavigation = ...;
	 * CPointer&lt;Object&gt; p = walknavigation.__dna__addressof(WalkNavigation.__DNA__FIELD__teleport_time);
	 * CPointer&lt;Float&gt; p_teleport_time = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'teleport_time'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__teleport_time = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WalkNavigation walknavigation = ...;
	 * CPointer&lt;Object&gt; p = walknavigation.__dna__addressof(WalkNavigation.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * WalkNavigation walknavigation = ...;
	 * CPointer&lt;Object&gt; p = walknavigation.__dna__addressof(WalkNavigation.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short[3]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{26, 26};

	public WalkNavigation(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected WalkNavigation(WalkNavigation that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'mouse_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed factor for when looking around, high values mean faster mouse movement<h4>Blender Source Code:</h4>
	 * <p> speed factor for look around </p>
	 * @see #__DNA__FIELD__mouse_speed
	 */
	
	public float getMouse_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 0);
		} else {
			return __io__block.readFloat(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'mouse_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed factor for when looking around, high values mean faster mouse movement<h4>Blender Source Code:</h4>
	 * <p> speed factor for look around </p>
	 * @see #__DNA__FIELD__mouse_speed
	 */
	
	public void setMouse_speed(float mouse_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 0, mouse_speed);
		} else {
			__io__block.writeFloat(__io__address + 0, mouse_speed);
		}
	}

	/**
	 * Get method for struct member 'walk_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Base speed for walking and flying
	 * @see #__DNA__FIELD__walk_speed
	 */
	
	public float getWalk_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'walk_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Base speed for walking and flying
	 * @see #__DNA__FIELD__walk_speed
	 */
	
	public void setWalk_speed(float walk_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, walk_speed);
		} else {
			__io__block.writeFloat(__io__address + 4, walk_speed);
		}
	}

	/**
	 * Get method for struct member 'walk_speed_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplication factor when using the fast or slow modifiers
	 * @see #__DNA__FIELD__walk_speed_factor
	 */
	
	public float getWalk_speed_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'walk_speed_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplication factor when using the fast or slow modifiers
	 * @see #__DNA__FIELD__walk_speed_factor
	 */
	
	public void setWalk_speed_factor(float walk_speed_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, walk_speed_factor);
		} else {
			__io__block.writeFloat(__io__address + 8, walk_speed_factor);
		}
	}

	/**
	 * Get method for struct member 'view_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * View distance from the floor when walking
	 * @see #__DNA__FIELD__view_height
	 */
	
	public float getView_height() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'view_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * View distance from the floor when walking
	 * @see #__DNA__FIELD__view_height
	 */
	
	public void setView_height(float view_height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, view_height);
		} else {
			__io__block.writeFloat(__io__address + 12, view_height);
		}
	}

	/**
	 * Get method for struct member 'jump_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum height of a jump
	 * @see #__DNA__FIELD__jump_height
	 */
	
	public float getJump_height() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'jump_height'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum height of a jump
	 * @see #__DNA__FIELD__jump_height
	 */
	
	public void setJump_height(float jump_height) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, jump_height);
		} else {
			__io__block.writeFloat(__io__address + 16, jump_height);
		}
	}

	/**
	 * Get method for struct member 'teleport_time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Interval of time warp when teleporting in navigation mode<h4>Blender Source Code:</h4>
	 * <p> duration to use for teleporting </p>
	 * @see #__DNA__FIELD__teleport_time
	 */
	
	public float getTeleport_time() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'teleport_time'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Interval of time warp when teleporting in navigation mode<h4>Blender Source Code:</h4>
	 * <p> duration to use for teleporting </p>
	 * @see #__DNA__FIELD__teleport_time
	 */
	
	public void setTeleport_time(float teleport_time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, teleport_time);
		} else {
			__io__block.writeFloat(__io__address + 20, teleport_time);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 24);
		} else {
			return __io__block.readShort(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 24, flag);
		} else {
			__io__block.writeShort(__io__address + 24, flag);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Short> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 26, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 26, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Short> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 26;
		} else {
			__dna__offset = 26;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<WalkNavigation> __io__addressof() {
		return new CPointer<WalkNavigation>(__io__address, new Class[]{WalkNavigation.class}, __io__block, __io__blockTable);
	}

}
