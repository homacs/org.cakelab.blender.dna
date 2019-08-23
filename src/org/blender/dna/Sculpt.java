package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Sculpt'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  {@link Sculpt}  {@link Sculpt}  </p>
 */

@CMetaData(size32=92, size64=112)
public class Sculpt extends CFacade {

	/**
	 * This is the sdna index of the struct Sculpt.
	 * <p>
	 * It is required when allocating a new block to store data for Sculpt.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 186;

	/**
	 * Field descriptor (offset) for struct member 'paint'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__paint);
	 * CPointer&lt;Paint&gt; p_paint = p.cast(new Class[]{Paint.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint'</li>
	 * <li>Signature: 'Paint'</li>
	 * <li>Actual Size (32bit/64bit): 48/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> float pivot[3]; XXX not used? </p><p> For rotating around a pivot point </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{48, 64};

	/**
	 * Field descriptor (offset) for struct member 'radial_symm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> char tablet_size, tablet_strength; XXX not used? </p><p> Control tablet input </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__radial_symm);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_radial_symm = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'radial_symm'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__radial_symm = new long[]{52, 68};

	/**
	 * Field descriptor (offset) for struct member 'detail_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum edge length for dynamic topology sculpting (in pixels)<h4>Blender Source Code:</h4>
	 * <p> Maximum edge length for dynamic topology sculpting (in pixels) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__detail_size);
	 * CPointer&lt;Float&gt; p_detail_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'detail_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__detail_size = new long[]{64, 80};

	/**
	 * Field descriptor (offset) for struct member 'symmetrize_direction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Source and destination for symmetrize operator<h4>Blender Source Code:</h4>
	 * <p> Direction used for SCULPT_OT_symmetrize operator </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__symmetrize_direction);
	 * CPointer&lt;Integer&gt; p_symmetrize_direction = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'symmetrize_direction'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__symmetrize_direction = new long[]{68, 84};

	/**
	 * Field descriptor (offset) for struct member 'gravity_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> gravity factor for sculpting </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__gravity_factor);
	 * CPointer&lt;Float&gt; p_gravity_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gravity_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gravity_factor = new long[]{72, 88};

	/**
	 * Field descriptor (offset) for struct member 'constant_detail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum edge length for dynamic topology sculpting (as percentage of blender unit)<h4>Blender Source Code:</h4>
	 * <p> scale for constant detail size </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__constant_detail);
	 * CPointer&lt;Float&gt; p_constant_detail = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'constant_detail'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__constant_detail = new long[]{76, 92};

	/**
	 * Field descriptor (offset) for struct member 'detail_percent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum edge length for dynamic topology sculpting (in brush percenage)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__detail_percent);
	 * CPointer&lt;Float&gt; p_detail_percent = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'detail_percent'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__detail_percent = new long[]{80, 96};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__pad);
	 * CPointer&lt;Float&gt; p_pad = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{84, 100};

	/**
	 * Field descriptor (offset) for struct member 'gravity_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Object whose Z axis defines orientation of gravity
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD__gravity_object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_gravity_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gravity_object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gravity_object = new long[]{88, 104};

	public Sculpt(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Sculpt(Sculpt that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'paint'.
	 * @see #__DNA__FIELD__paint
	 */
	
	public Paint getPaint() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new Paint(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new Paint(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'paint'.
	 * @see #__DNA__FIELD__paint
	 */
	
	public void setPaint(Paint paint) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(paint, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, paint)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, paint);
		} else {
			__io__generic__copy( getPaint(), paint);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> float pivot[3]; XXX not used? </p><p> For rotating around a pivot point </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 64);
		} else {
			return __io__block.readInt(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> float pivot[3]; XXX not used? </p><p> For rotating around a pivot point </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 64, flags);
		} else {
			__io__block.writeInt(__io__address + 48, flags);
		}
	}

	/**
	 * Get method for struct member 'radial_symm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> char tablet_size, tablet_strength; XXX not used? </p><p> Control tablet input </p>
	 * @see #__DNA__FIELD__radial_symm
	 */
	
	public CArrayFacade<Integer> getRadial_symm() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 68, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 52, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'radial_symm'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> char tablet_size, tablet_strength; XXX not used? </p><p> Control tablet input </p>
	 * @see #__DNA__FIELD__radial_symm
	 */
	
	public void setRadial_symm(CArrayFacade<Integer> radial_symm) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 68;
		} else {
			__dna__offset = 52;
		}
		if (__io__equals(radial_symm, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, radial_symm)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, radial_symm);
		} else {
			__io__generic__copy( getRadial_symm(), radial_symm);
		}
	}

	/**
	 * Get method for struct member 'detail_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum edge length for dynamic topology sculpting (in pixels)<h4>Blender Source Code:</h4>
	 * <p> Maximum edge length for dynamic topology sculpting (in pixels) </p>
	 * @see #__DNA__FIELD__detail_size
	 */
	
	public float getDetail_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'detail_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum edge length for dynamic topology sculpting (in pixels)<h4>Blender Source Code:</h4>
	 * <p> Maximum edge length for dynamic topology sculpting (in pixels) </p>
	 * @see #__DNA__FIELD__detail_size
	 */
	
	public void setDetail_size(float detail_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, detail_size);
		} else {
			__io__block.writeFloat(__io__address + 64, detail_size);
		}
	}

	/**
	 * Get method for struct member 'symmetrize_direction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Source and destination for symmetrize operator<h4>Blender Source Code:</h4>
	 * <p> Direction used for SCULPT_OT_symmetrize operator </p>
	 * @see #__DNA__FIELD__symmetrize_direction
	 */
	
	public int getSymmetrize_direction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 84);
		} else {
			return __io__block.readInt(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'symmetrize_direction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Source and destination for symmetrize operator<h4>Blender Source Code:</h4>
	 * <p> Direction used for SCULPT_OT_symmetrize operator </p>
	 * @see #__DNA__FIELD__symmetrize_direction
	 */
	
	public void setSymmetrize_direction(int symmetrize_direction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 84, symmetrize_direction);
		} else {
			__io__block.writeInt(__io__address + 68, symmetrize_direction);
		}
	}

	/**
	 * Get method for struct member 'gravity_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> gravity factor for sculpting </p>
	 * @see #__DNA__FIELD__gravity_factor
	 */
	
	public float getGravity_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'gravity_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> gravity factor for sculpting </p>
	 * @see #__DNA__FIELD__gravity_factor
	 */
	
	public void setGravity_factor(float gravity_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, gravity_factor);
		} else {
			__io__block.writeFloat(__io__address + 72, gravity_factor);
		}
	}

	/**
	 * Get method for struct member 'constant_detail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum edge length for dynamic topology sculpting (as percentage of blender unit)<h4>Blender Source Code:</h4>
	 * <p> scale for constant detail size </p>
	 * @see #__DNA__FIELD__constant_detail
	 */
	
	public float getConstant_detail() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'constant_detail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum edge length for dynamic topology sculpting (as percentage of blender unit)<h4>Blender Source Code:</h4>
	 * <p> scale for constant detail size </p>
	 * @see #__DNA__FIELD__constant_detail
	 */
	
	public void setConstant_detail(float constant_detail) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, constant_detail);
		} else {
			__io__block.writeFloat(__io__address + 76, constant_detail);
		}
	}

	/**
	 * Get method for struct member 'detail_percent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum edge length for dynamic topology sculpting (in brush percenage)
	 * @see #__DNA__FIELD__detail_percent
	 */
	
	public float getDetail_percent() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'detail_percent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum edge length for dynamic topology sculpting (in brush percenage)
	 * @see #__DNA__FIELD__detail_percent
	 */
	
	public void setDetail_percent(float detail_percent) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, detail_percent);
		} else {
			__io__block.writeFloat(__io__address + 80, detail_percent);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public float getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(float pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, pad);
		} else {
			__io__block.writeFloat(__io__address + 84, pad);
		}
	}

	/**
	 * Get method for struct member 'gravity_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Object whose Z axis defines orientation of gravity
	 * @see #__DNA__FIELD__gravity_object
	 */
	
	public CPointer<BlenderObject> getGravity_object() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gravity_object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Object whose Z axis defines orientation of gravity
	 * @see #__DNA__FIELD__gravity_object
	 */
	
	public void setGravity_object(CPointer<BlenderObject> gravity_object) throws IOException
	{
		long __address = ((gravity_object == null) ? 0 : gravity_object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Sculpt> __io__addressof() {
		return new CPointer<Sculpt>(__io__address, new Class[]{Sculpt.class}, __io__block, __io__blockTable);
	}

}
