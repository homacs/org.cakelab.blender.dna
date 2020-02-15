package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'GP_Sculpt_Data'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Settings for a GPencil Stroke Sculpting {@link Brush}  </p>
 */

@CMetaData(size32=40, size64=40)
public class GP_Sculpt_Data extends CFacade {

	/**
	 * This is the sdna index of the struct GP_Sculpt_Data.
	 * <p>
	 * It is required when allocating a new block to store data for GP_Sculpt_Data.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 195;

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius of brush. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Data gp_sculpt_data = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_data.__dna__addressof(GP_Sculpt_Data.__DNA__FIELD__size);
	 * CPointer&lt;Short&gt; p_size = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> EGP_Sculpt_Flag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Data gp_sculpt_data = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_data.__dna__addressof(GP_Sculpt_Data.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Strength of effect. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Data gp_sculpt_data = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_data.__dna__addressof(GP_Sculpt_Data.__DNA__FIELD__strength);
	 * CPointer&lt;Float&gt; p_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__strength = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'curcolor_add'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cursor color for add. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Data gp_sculpt_data = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_data.__dna__addressof(GP_Sculpt_Data.__DNA__FIELD__curcolor_add);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_curcolor_add = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curcolor_add'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curcolor_add = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'curcolor_sub'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cursor color for sub. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Data gp_sculpt_data = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_data.__dna__addressof(GP_Sculpt_Data.__DNA__FIELD__curcolor_sub);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_curcolor_sub = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curcolor_sub'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curcolor_sub = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Target weight. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Data gp_sculpt_data = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_data.__dna__addressof(GP_Sculpt_Data.__DNA__FIELD__weight);
	 * CPointer&lt;Float&gt; p_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__weight = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Data gp_sculpt_data = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_data.__dna__addressof(GP_Sculpt_Data.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{36, 36};

	public GP_Sculpt_Data(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected GP_Sculpt_Data(GP_Sculpt_Data that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius of brush. </p>
	 * @see #__DNA__FIELD__size
	 */
	
	public short getSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Radius of brush. </p>
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(short size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, size);
		} else {
			__io__block.writeShort(__io__address + 0, size);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> EGP_Sculpt_Flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> EGP_Sculpt_Flag. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, flag);
		} else {
			__io__block.writeShort(__io__address + 2, flag);
		}
	}

	/**
	 * Get method for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Strength of effect. </p>
	 * @see #__DNA__FIELD__strength
	 */
	
	public float getStrength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Strength of effect. </p>
	 * @see #__DNA__FIELD__strength
	 */
	
	public void setStrength(float strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, strength);
		} else {
			__io__block.writeFloat(__io__address + 4, strength);
		}
	}

	/**
	 * Get method for struct member 'curcolor_add'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cursor color for add. </p>
	 * @see #__DNA__FIELD__curcolor_add
	 */
	
	public CArrayFacade<Float> getCurcolor_add() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'curcolor_add'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cursor color for add. </p>
	 * @see #__DNA__FIELD__curcolor_add
	 */
	
	public void setCurcolor_add(CArrayFacade<Float> curcolor_add) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(curcolor_add, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, curcolor_add)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, curcolor_add);
		} else {
			__io__generic__copy( getCurcolor_add(), curcolor_add);
		}
	}

	/**
	 * Get method for struct member 'curcolor_sub'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cursor color for sub. </p>
	 * @see #__DNA__FIELD__curcolor_sub
	 */
	
	public CArrayFacade<Float> getCurcolor_sub() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'curcolor_sub'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cursor color for sub. </p>
	 * @see #__DNA__FIELD__curcolor_sub
	 */
	
	public void setCurcolor_sub(CArrayFacade<Float> curcolor_sub) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(curcolor_sub, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, curcolor_sub)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, curcolor_sub);
		} else {
			__io__generic__copy( getCurcolor_sub(), curcolor_sub);
		}
	}

	/**
	 * Get method for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Target weight. </p>
	 * @see #__DNA__FIELD__weight
	 */
	
	public float getWeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Target weight. </p>
	 * @see #__DNA__FIELD__weight
	 */
	
	public void setWeight(float weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, weight);
		} else {
			__io__block.writeFloat(__io__address + 32, weight);
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
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 36;
		} else {
			__dna__offset = 36;
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
	public CPointer<GP_Sculpt_Data> __io__addressof() {
		return new CPointer<GP_Sculpt_Data>(__io__address, new Class[]{GP_Sculpt_Data.class}, __io__block, __io__blockTable);
	}

}
