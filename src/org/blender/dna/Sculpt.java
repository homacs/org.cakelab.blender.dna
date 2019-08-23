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

@CMetaData(size32=112, size64=136)
public class Sculpt extends CFacade {

	/**
	 * This is the sdna index of the struct Sculpt.
	 * <p>
	 * It is required when allocating a new block to store data for Sculpt.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 191;

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
	 * <li>Actual Size (32bit/64bit): 68/88</li>
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
	public static final long[] __DNA__FIELD__flags = new long[]{68, 88};

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
	public static final long[] __DNA__FIELD__radial_symm = new long[]{72, 92};

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
	public static final long[] __DNA__FIELD__detail_size = new long[]{84, 104};

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
	public static final long[] __DNA__FIELD__symmetrize_direction = new long[]{88, 108};

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
	public static final long[] __DNA__FIELD__gravity_factor = new long[]{92, 112};

	/**
	 * Field descriptor (offset) for struct member 'constant_detail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scale for constant detail size Constant detail resolution (Blender unit / constant_detail). </p>
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
	public static final long[] __DNA__FIELD__constant_detail = new long[]{96, 116};

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
	public static final long[] __DNA__FIELD__detail_percent = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Sculpt sculpt = ...;
	 * CPointer&lt;Object&gt; p = sculpt.__dna__addressof(Sculpt.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{104, 124};

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
	public static final long[] __DNA__FIELD__gravity_object = new long[]{108, 128};

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
			return __io__block.readInt(__io__address + 88);
		} else {
			return __io__block.readInt(__io__address + 68);
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
			__io__block.writeInt(__io__address + 88, flags);
		} else {
			__io__block.writeInt(__io__address + 68, flags);
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
			return new CArrayFacade<Integer>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 92;
		} else {
			__dna__offset = 72;
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
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 84);
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
			__io__block.writeFloat(__io__address + 104, detail_size);
		} else {
			__io__block.writeFloat(__io__address + 84, detail_size);
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
			return __io__block.readInt(__io__address + 108);
		} else {
			return __io__block.readInt(__io__address + 88);
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
			__io__block.writeInt(__io__address + 108, symmetrize_direction);
		} else {
			__io__block.writeInt(__io__address + 88, symmetrize_direction);
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
			return __io__block.readFloat(__io__address + 112);
		} else {
			return __io__block.readFloat(__io__address + 92);
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
			__io__block.writeFloat(__io__address + 112, gravity_factor);
		} else {
			__io__block.writeFloat(__io__address + 92, gravity_factor);
		}
	}

	/**
	 * Get method for struct member 'constant_detail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scale for constant detail size Constant detail resolution (Blender unit / constant_detail). </p>
	 * @see #__DNA__FIELD__constant_detail
	 */
	
	public float getConstant_detail() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'constant_detail'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scale for constant detail size Constant detail resolution (Blender unit / constant_detail). </p>
	 * @see #__DNA__FIELD__constant_detail
	 */
	
	public void setConstant_detail(float constant_detail) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, constant_detail);
		} else {
			__io__block.writeFloat(__io__address + 96, constant_detail);
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
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 100);
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
			__io__block.writeFloat(__io__address + 120, detail_percent);
		} else {
			__io__block.writeFloat(__io__address + 100, detail_percent);
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
			return new CArrayFacade<Byte>(__io__address + 124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 124;
		} else {
			__dna__offset = 104;
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
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
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
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Sculpt> __io__addressof() {
		return new CPointer<Sculpt>(__io__address, new Class[]{Sculpt.class}, __io__block, __io__blockTable);
	}

}
