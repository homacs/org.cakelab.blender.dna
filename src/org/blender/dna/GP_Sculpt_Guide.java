package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'GP_Sculpt_Guide'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> Settings for a GPencil Speed Guide </p>
 */

@CMetaData(size32=36, size64=40)
public class GP_Sculpt_Guide extends CFacade {

	/**
	 * This is the sdna index of the struct GP_Sculpt_Guide.
	 * <p>
	 * It is required when allocating a new block to store data for GP_Sculpt_Guide.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 196;

	/**
	 * Field descriptor (offset) for struct member 'use_guide'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Guide gp_sculpt_guide = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_guide.__dna__addressof(GP_Sculpt_Guide.__DNA__FIELD__use_guide);
	 * CPointer&lt;Byte&gt; p_use_guide = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_guide'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_guide = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'use_snapping'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Guide gp_sculpt_guide = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_guide.__dna__addressof(GP_Sculpt_Guide.__DNA__FIELD__use_snapping);
	 * CPointer&lt;Byte&gt; p_use_snapping = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_snapping'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_snapping = new long[]{1, 1};

	/**
	 * Field descriptor (offset) for struct member 'reference_point'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Guide gp_sculpt_guide = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_guide.__dna__addressof(GP_Sculpt_Guide.__DNA__FIELD__reference_point);
	 * CPointer&lt;Byte&gt; p_reference_point = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reference_point'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reference_point = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Guide gp_sculpt_guide = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_guide.__dna__addressof(GP_Sculpt_Guide.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{3, 3};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Guide gp_sculpt_guide = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_guide.__dna__addressof(GP_Sculpt_Guide.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'angle'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Guide gp_sculpt_guide = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_guide.__dna__addressof(GP_Sculpt_Guide.__DNA__FIELD__angle);
	 * CPointer&lt;Float&gt; p_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angle = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'angle_snap'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Guide gp_sculpt_guide = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_guide.__dna__addressof(GP_Sculpt_Guide.__DNA__FIELD__angle_snap);
	 * CPointer&lt;Float&gt; p_angle_snap = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'angle_snap'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__angle_snap = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'spacing'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Guide gp_sculpt_guide = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_guide.__dna__addressof(GP_Sculpt_Guide.__DNA__FIELD__spacing);
	 * CPointer&lt;Float&gt; p_spacing = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacing'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacing = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'location'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Guide gp_sculpt_guide = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_guide.__dna__addressof(GP_Sculpt_Guide.__DNA__FIELD__location);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_location = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'location'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__location = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'reference_object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * GP_Sculpt_Guide gp_sculpt_guide = ...;
	 * CPointer&lt;Object&gt; p = gp_sculpt_guide.__dna__addressof(GP_Sculpt_Guide.__DNA__FIELD__reference_object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_reference_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reference_object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reference_object = new long[]{32, 32};

	public GP_Sculpt_Guide(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected GP_Sculpt_Guide(GP_Sculpt_Guide that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'use_guide'.
	 * @see #__DNA__FIELD__use_guide
	 */
	
	public byte getUse_guide() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'use_guide'.
	 * @see #__DNA__FIELD__use_guide
	 */
	
	public void setUse_guide(byte use_guide) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, use_guide);
		} else {
			__io__block.writeByte(__io__address + 0, use_guide);
		}
	}

	/**
	 * Get method for struct member 'use_snapping'.
	 * @see #__DNA__FIELD__use_snapping
	 */
	
	public byte getUse_snapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'use_snapping'.
	 * @see #__DNA__FIELD__use_snapping
	 */
	
	public void setUse_snapping(byte use_snapping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, use_snapping);
		} else {
			__io__block.writeByte(__io__address + 1, use_snapping);
		}
	}

	/**
	 * Get method for struct member 'reference_point'.
	 * @see #__DNA__FIELD__reference_point
	 */
	
	public byte getReference_point() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2);
		} else {
			return __io__block.readByte(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'reference_point'.
	 * @see #__DNA__FIELD__reference_point
	 */
	
	public void setReference_point(byte reference_point) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2, reference_point);
		} else {
			__io__block.writeByte(__io__address + 2, reference_point);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 3);
		} else {
			return __io__block.readByte(__io__address + 3);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 3, type);
		} else {
			__io__block.writeByte(__io__address + 3, type);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 4;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Get method for struct member 'angle'.
	 * @see #__DNA__FIELD__angle
	 */
	
	public float getAngle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'angle'.
	 * @see #__DNA__FIELD__angle
	 */
	
	public void setAngle(float angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, angle);
		} else {
			__io__block.writeFloat(__io__address + 8, angle);
		}
	}

	/**
	 * Get method for struct member 'angle_snap'.
	 * @see #__DNA__FIELD__angle_snap
	 */
	
	public float getAngle_snap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'angle_snap'.
	 * @see #__DNA__FIELD__angle_snap
	 */
	
	public void setAngle_snap(float angle_snap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, angle_snap);
		} else {
			__io__block.writeFloat(__io__address + 12, angle_snap);
		}
	}

	/**
	 * Get method for struct member 'spacing'.
	 * @see #__DNA__FIELD__spacing
	 */
	
	public float getSpacing() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'spacing'.
	 * @see #__DNA__FIELD__spacing
	 */
	
	public void setSpacing(float spacing) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, spacing);
		} else {
			__io__block.writeFloat(__io__address + 16, spacing);
		}
	}

	/**
	 * Get method for struct member 'location'.
	 * @see #__DNA__FIELD__location
	 */
	
	public CArrayFacade<Float> getLocation() throws IOException
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
	 * Set method for struct member 'location'.
	 * @see #__DNA__FIELD__location
	 */
	
	public void setLocation(CArrayFacade<Float> location) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(location, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, location)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, location);
		} else {
			__io__generic__copy( getLocation(), location);
		}
	}

	/**
	 * Get method for struct member 'reference_object'.
	 * @see #__DNA__FIELD__reference_object
	 */
	
	public CPointer<BlenderObject> getReference_object() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'reference_object'.
	 * @see #__DNA__FIELD__reference_object
	 */
	
	public void setReference_object(CPointer<BlenderObject> reference_object) throws IOException
	{
		long __address = ((reference_object == null) ? 0 : reference_object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 32, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<GP_Sculpt_Guide> __io__addressof() {
		return new CPointer<GP_Sculpt_Guide>(__io__address, new Class[]{GP_Sculpt_Guide.class}, __io__block, __io__blockTable);
	}

}
