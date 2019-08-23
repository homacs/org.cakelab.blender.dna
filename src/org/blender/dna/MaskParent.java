package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MaskParent'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=180, size64=184)
public class MaskParent extends CFacade {

	/**
	 * This is the sdna index of the struct MaskParent.
	 * <p>
	 * It is required when allocating a new block to store data for MaskParent.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 562;

	/**
	 * Field descriptor (offset) for struct member 'id_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of ID-block that can be used<h4>Blender Source Code:</h4>
	 * <p> int flag; // parenting flags  // not used  </p><p> type of parenting </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskParent maskparent = ...;
	 * CPointer&lt;Object&gt; p = maskparent.__dna__addressof(MaskParent.__DNA__FIELD__id_type);
	 * CPointer&lt;Integer&gt; p_id_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id_type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Parent Type<h4>Blender Source Code:</h4>
	 * <p> type of parenting </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskParent maskparent = ...;
	 * CPointer&lt;Object&gt; p = maskparent.__dna__addressof(MaskParent.__DNA__FIELD__type);
	 * CPointer&lt;Integer&gt; p_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * ID-block to which masking element would be parented to or to it's property<h4>Blender Source Code:</h4>
	 * <p>{@link ID}  block of entity to which mask/spline is parented to in case of parenting to movie tracking data set to {@link MovieClip}  datablock </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskParent maskparent = ...;
	 * CPointer&lt;Object&gt; p = maskparent.__dna__addressof(MaskParent.__DNA__FIELD__id);
	 * CPointer&lt;CPointer&lt;ID&gt;&gt; p_id = p.cast(new Class[]{CPointer.class, ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Name of parent object in specified data block to which parenting happens<h4>Blender Source Code:</h4>
	 * <p> entity of parent to which parenting happened in case of parenting to movie tracking data contains name of layer </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskParent maskparent = ...;
	 * CPointer&lt;Object&gt; p = maskparent.__dna__addressof(MaskParent.__DNA__FIELD__parent);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_parent = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'sub_parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Name of parent sub-object in specified data block to which parenting happens<h4>Blender Source Code:</h4>
	 * <p> sub-entity of parent to which parenting happened in case of parenting to movie tracking data contains name of track </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskParent maskparent = ...;
	 * CPointer&lt;Object&gt; p = maskparent.__dna__addressof(MaskParent.__DNA__FIELD__sub_parent);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_sub_parent = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sub_parent'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sub_parent = new long[]{76, 80};

	/**
	 * Field descriptor (offset) for struct member 'parent_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> track location at the moment of parenting, stored in mask space </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskParent maskparent = ...;
	 * CPointer&lt;Object&gt; p = maskparent.__dna__addressof(MaskParent.__DNA__FIELD__parent_orig);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_parent_orig = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent_orig'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent_orig = new long[]{140, 144};

	/**
	 * Field descriptor (offset) for struct member 'parent_corners_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original corners of plane track at the moment of parenting </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaskParent maskparent = ...;
	 * CPointer&lt;Object&gt; p = maskparent.__dna__addressof(MaskParent.__DNA__FIELD__parent_corners_orig);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_parent_corners_orig = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent_corners_orig'</li>
	 * <li>Signature: 'float[4][2]'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent_corners_orig = new long[]{148, 152};

	public MaskParent(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MaskParent(MaskParent that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of ID-block that can be used<h4>Blender Source Code:</h4>
	 * <p> int flag; // parenting flags  // not used  </p><p> type of parenting </p>
	 * @see #__DNA__FIELD__id_type
	 */
	
	public int getId_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'id_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Type of ID-block that can be used<h4>Blender Source Code:</h4>
	 * <p> int flag; // parenting flags  // not used  </p><p> type of parenting </p>
	 * @see #__DNA__FIELD__id_type
	 */
	
	public void setId_type(int id_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, id_type);
		} else {
			__io__block.writeInt(__io__address + 0, id_type);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Parent Type<h4>Blender Source Code:</h4>
	 * <p> type of parenting </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public int getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Parent Type<h4>Blender Source Code:</h4>
	 * <p> type of parenting </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(int type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, type);
		} else {
			__io__block.writeInt(__io__address + 4, type);
		}
	}

	/**
	 * Get method for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * ID-block to which masking element would be parented to or to it's property<h4>Blender Source Code:</h4>
	 * <p>{@link ID}  block of entity to which mask/spline is parented to in case of parenting to movie tracking data set to {@link MovieClip}  datablock </p>
	 * @see #__DNA__FIELD__id
	 */
	
	public CPointer<ID> getId() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ID.class};
		return new CPointer<ID>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ID.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * ID-block to which masking element would be parented to or to it's property<h4>Blender Source Code:</h4>
	 * <p>{@link ID}  block of entity to which mask/spline is parented to in case of parenting to movie tracking data set to {@link MovieClip}  datablock </p>
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(CPointer<ID> id) throws IOException
	{
		long __address = ((id == null) ? 0 : id.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Name of parent object in specified data block to which parenting happens<h4>Blender Source Code:</h4>
	 * <p> entity of parent to which parenting happened in case of parenting to movie tracking data contains name of layer </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public CArrayFacade<Byte> getParent() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Name of parent object in specified data block to which parenting happens<h4>Blender Source Code:</h4>
	 * <p> entity of parent to which parenting happened in case of parenting to movie tracking data contains name of layer </p>
	 * @see #__DNA__FIELD__parent
	 */
	
	public void setParent(CArrayFacade<Byte> parent) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(parent, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, parent)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, parent);
		} else {
			__io__generic__copy( getParent(), parent);
		}
	}

	/**
	 * Get method for struct member 'sub_parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Name of parent sub-object in specified data block to which parenting happens<h4>Blender Source Code:</h4>
	 * <p> sub-entity of parent to which parenting happened in case of parenting to movie tracking data contains name of track </p>
	 * @see #__DNA__FIELD__sub_parent
	 */
	
	public CArrayFacade<Byte> getSub_parent() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sub_parent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Name of parent sub-object in specified data block to which parenting happens<h4>Blender Source Code:</h4>
	 * <p> sub-entity of parent to which parenting happened in case of parenting to movie tracking data contains name of track </p>
	 * @see #__DNA__FIELD__sub_parent
	 */
	
	public void setSub_parent(CArrayFacade<Byte> sub_parent) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 76;
		}
		if (__io__equals(sub_parent, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sub_parent)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sub_parent);
		} else {
			__io__generic__copy( getSub_parent(), sub_parent);
		}
	}

	/**
	 * Get method for struct member 'parent_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> track location at the moment of parenting, stored in mask space </p>
	 * @see #__DNA__FIELD__parent_orig
	 */
	
	public CArrayFacade<Float> getParent_orig() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parent_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> track location at the moment of parenting, stored in mask space </p>
	 * @see #__DNA__FIELD__parent_orig
	 */
	
	public void setParent_orig(CArrayFacade<Float> parent_orig) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(parent_orig, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, parent_orig)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, parent_orig);
		} else {
			__io__generic__copy( getParent_orig(), parent_orig);
		}
	}

	/**
	 * Get method for struct member 'parent_corners_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original corners of plane track at the moment of parenting </p>
	 * @see #__DNA__FIELD__parent_corners_orig
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getParent_corners_orig() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'parent_corners_orig'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Original corners of plane track at the moment of parenting </p>
	 * @see #__DNA__FIELD__parent_corners_orig
	 */
	
	public void setParent_corners_orig(CArrayFacade<CArrayFacade<Float>> parent_corners_orig) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 148;
		}
		if (__io__equals(parent_corners_orig, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, parent_corners_orig)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, parent_corners_orig);
		} else {
			__io__generic__copy( getParent_corners_orig(), parent_corners_orig);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MaskParent> __io__addressof() {
		return new CPointer<MaskParent>(__io__address, new Class[]{MaskParent.class}, __io__block, __io__blockTable);
	}

}
