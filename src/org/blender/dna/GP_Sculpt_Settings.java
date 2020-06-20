package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'GP_Sculpt_Settings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> GPencil Stroke Sculpting Settings </p>
 */

@CMetaData(size32=64, size64=80)
public class GP_Sculpt_Settings extends CFacade {

	/**
	 * This is the sdna index of the struct GP_Sculpt_Settings.
	 * <p>
	 * It is required when allocating a new block to store data for GP_Sculpt_Settings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 199;

	/**
	 * Field descriptor (offset) for struct member 'paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Settings gp_sculpt_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_settings.__dna__addressof(GP_Sculpt_Settings.__DNA__FIELD__paintcursor);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_paintcursor = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paintcursor'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paintcursor = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eGP_Sculpt_SettingsFlag} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Settings gp_sculpt_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_settings.__dna__addressof(GP_Sculpt_Settings.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'lock_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eGP_Lockaxis_Types}  lock drawing to one axis. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Settings gp_sculpt_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_settings.__dna__addressof(GP_Sculpt_Settings.__DNA__FIELD__lock_axis);
	 * CPointer&lt;Integer&gt; p_lock_axis = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lock_axis'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lock_axis = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'isect_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Threshold for intersections </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Settings gp_sculpt_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_settings.__dna__addressof(GP_Sculpt_Settings.__DNA__FIELD__isect_threshold);
	 * CPointer&lt;Float&gt; p_isect_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'isect_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__isect_threshold = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member '_pad_'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Settings gp_sculpt_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_settings.__dna__addressof(GP_Sculpt_Settings.__DNA__FIELD___pad_);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad_ = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad_'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad_ = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member 'cur_falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiframe edit falloff effect by frame. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Settings gp_sculpt_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_settings.__dna__addressof(GP_Sculpt_Settings.__DNA__FIELD__cur_falloff);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_cur_falloff = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cur_falloff'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cur_falloff = new long[]{20, 24};

	/**
	 * Field descriptor (offset) for struct member 'cur_primitive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Curve}  used for primitive tools. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Settings gp_sculpt_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_settings.__dna__addressof(GP_Sculpt_Settings.__DNA__FIELD__cur_primitive);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_cur_primitive = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cur_primitive'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cur_primitive = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'guide'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Guides used for paint tools </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Settings gp_sculpt_settings = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_settings.__dna__addressof(GP_Sculpt_Settings.__DNA__FIELD__guide);
	 * CPointer&lt;GP_Sculpt_Guide&gt; p_guide = p.cast(new Class[]{GP_Sculpt_Guide.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'guide'</li>
	 * <li>Signature: 'GP_Sculpt_Guide'</li>
	 * <li>Actual Size (32bit/64bit): 36/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__guide = new long[]{28, 40};

	public GP_Sculpt_Settings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected GP_Sculpt_Settings(GP_Sculpt_Settings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. </p>
	 * @see #__DNA__FIELD__paintcursor
	 */
	
	public CPointer<Object> getPaintcursor() throws IOException
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
	 * Set method for struct member 'paintcursor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime. </p>
	 * @see #__DNA__FIELD__paintcursor
	 */
	
	public void setPaintcursor(CPointer<Object> paintcursor) throws IOException
	{
		long __address = ((paintcursor == null) ? 0 : paintcursor.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eGP_Sculpt_SettingsFlag} . </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eGP_Sculpt_SettingsFlag} . </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, flag);
		} else {
			__io__block.writeInt(__io__address + 4, flag);
		}
	}

	/**
	 * Get method for struct member 'lock_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eGP_Lockaxis_Types}  lock drawing to one axis. </p>
	 * @see #__DNA__FIELD__lock_axis
	 */
	
	public int getLock_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'lock_axis'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link eGP_Lockaxis_Types}  lock drawing to one axis. </p>
	 * @see #__DNA__FIELD__lock_axis
	 */
	
	public void setLock_axis(int lock_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, lock_axis);
		} else {
			__io__block.writeInt(__io__address + 8, lock_axis);
		}
	}

	/**
	 * Get method for struct member 'isect_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Threshold for intersections </p>
	 * @see #__DNA__FIELD__isect_threshold
	 */
	
	public float getIsect_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'isect_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Threshold for intersections </p>
	 * @see #__DNA__FIELD__isect_threshold
	 */
	
	public void setIsect_threshold(float isect_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, isect_threshold);
		} else {
			__io__block.writeFloat(__io__address + 12, isect_threshold);
		}
	}

	/**
	 * Get method for struct member '_pad_'.
	 * @see #__DNA__FIELD___pad_
	 */
	
	public CArrayFacade<Byte> get_pad_() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad_'.
	 * @see #__DNA__FIELD___pad_
	 */
	
	public void set_pad_(CArrayFacade<Byte> _pad_) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(_pad_, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad_)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad_);
		} else {
			__io__generic__copy( get_pad_(), _pad_);
		}
	}

	/**
	 * Get method for struct member 'cur_falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiframe edit falloff effect by frame. </p>
	 * @see #__DNA__FIELD__cur_falloff
	 */
	
	public CPointer<CurveMapping> getCur_falloff() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cur_falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Multiframe edit falloff effect by frame. </p>
	 * @see #__DNA__FIELD__cur_falloff
	 */
	
	public void setCur_falloff(CPointer<CurveMapping> cur_falloff) throws IOException
	{
		long __address = ((cur_falloff == null) ? 0 : cur_falloff.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'cur_primitive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Curve}  used for primitive tools. </p>
	 * @see #__DNA__FIELD__cur_primitive
	 */
	
	public CPointer<CurveMapping> getCur_primitive() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cur_primitive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Curve}  used for primitive tools. </p>
	 * @see #__DNA__FIELD__cur_primitive
	 */
	
	public void setCur_primitive(CPointer<CurveMapping> cur_primitive) throws IOException
	{
		long __address = ((cur_primitive == null) ? 0 : cur_primitive.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'guide'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Guides used for paint tools </p>
	 * @see #__DNA__FIELD__guide
	 */
	
	public GP_Sculpt_Guide getGuide() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GP_Sculpt_Guide(__io__address + 40, __io__block, __io__blockTable);
		} else {
			return new GP_Sculpt_Guide(__io__address + 28, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'guide'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Guides used for paint tools </p>
	 * @see #__DNA__FIELD__guide
	 */
	
	public void setGuide(GP_Sculpt_Guide guide) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(guide, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, guide)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, guide);
		} else {
			__io__generic__copy( getGuide(), guide);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<GP_Sculpt_Settings> __io__addressof() {
		return new CPointer<GP_Sculpt_Settings>(__io__address, new Class[]{GP_Sculpt_Settings.class}, __io__block, __io__blockTable);
	}

}
