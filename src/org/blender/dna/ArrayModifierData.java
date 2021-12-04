package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ArrayModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=184, size64=224)
public class ArrayModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct ArrayModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for ArrayModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 103;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArrayModifierData arraymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = arraymodifierdata.__dna__addressof(ArrayModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 112/136</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'start_cap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the object with which to cap the start of the array. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArrayModifierData arraymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = arraymodifierdata.__dna__addressof(ArrayModifierData.__DNA__FIELD__start_cap);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_start_cap = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'start_cap'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__start_cap = new long[]{112, 136};

	/**
	 * Field descriptor (offset) for struct member 'end_cap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the object with which to cap the end of the array. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArrayModifierData arraymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = arraymodifierdata.__dna__addressof(ArrayModifierData.__DNA__FIELD__end_cap);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_end_cap = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'end_cap'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__end_cap = new long[]{116, 144};

	/**
	 * Field descriptor (offset) for struct member 'curve_ob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the curve object to use for MOD_ARR_FITCURVE. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArrayModifierData arraymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = arraymodifierdata.__dna__addressof(ArrayModifierData.__DNA__FIELD__curve_ob);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_curve_ob = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_ob'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_ob = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'offset_ob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the object to use for object offset. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArrayModifierData arraymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = arraymodifierdata.__dna__addressof(ArrayModifierData.__DNA__FIELD__offset_ob);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_offset_ob = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset_ob'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset_ob = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> a constant duplicate offset; 1 means the duplicates are 1 unit apart </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArrayModifierData arraymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = arraymodifierdata.__dna__addressof(ArrayModifierData.__DNA__FIELD__offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{128, 168};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> a scaled factor for duplicate offsets; 1 means the duplicates are 1 object-width apart </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArrayModifierData arraymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = arraymodifierdata.__dna__addressof(ArrayModifierData.__DNA__FIELD__scale);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_scale = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale = new long[]{140, 180};

	/**
	 * Field descriptor (offset) for struct member 'length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the length over which to distribute the duplicates </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArrayModifierData arraymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = arraymodifierdata.__dna__addressof(ArrayModifierData.__DNA__FIELD__length);
	 * CPointer&lt;Float&gt; p_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__length = new long[]{152, 192};

	/**
	 * Field descriptor (offset) for struct member 'merge_dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the limit below which to merge vertices in adjacent duplicates </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArrayModifierData arraymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = arraymodifierdata.__dna__addressof(ArrayModifierData.__DNA__FIELD__merge_dist);
	 * CPointer&lt;Float&gt; p_merge_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'merge_dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__merge_dist = new long[]{156, 196};

	/**
	 * Field descriptor (offset) for struct member 'fit_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> determines how duplicate count is calculated; one of:<ul><li><p> MOD_ARR_FIXEDCOUNT -> fixed</p></li><li><p> MOD_ARR_FITLENGTH -> calculated to fit a set length</p></li><li><p> MOD_ARR_FITCURVE -> calculated to fit the length of a {@link Curve}  object </p></li></ul> 
	 * MOD_ARR_FIXEDCOUNT -> fixed
	 * MOD_ARR_FITLENGTH -> calculated to fit a set length
	 * MOD_ARR_FITCURVE -> calculated to fit the length of a Curve object 
	 * 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArrayModifierData arraymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = arraymodifierdata.__dna__addressof(ArrayModifierData.__DNA__FIELD__fit_type);
	 * CPointer&lt;Integer&gt; p_fit_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fit_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fit_type = new long[]{160, 200};

	/**
	 * Field descriptor (offset) for struct member 'offset_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags specifying how total offset is calculated; binary OR of:<ul><li><p> MOD_ARR_OFF_CONST -> total offset += offset</p></li><li><p> MOD_ARR_OFF_RELATIVE -> total offset += relative * object width</p></li><li><p> MOD_ARR_OFF_OBJ -> total offset += offset_ob's matrix total offset is the sum of the individual enabled offsets </p></li></ul> 
	 * MOD_ARR_OFF_CONST -> total offset += offset
	 * MOD_ARR_OFF_RELATIVE -> total offset += relative * object width
	 * MOD_ARR_OFF_OBJ -> total offset += offset_ob's matrix total offset is the sum of the individual enabled offsets 
	 * 
	 * </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArrayModifierData arraymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = arraymodifierdata.__dna__addressof(ArrayModifierData.__DNA__FIELD__offset_type);
	 * CPointer&lt;Integer&gt; p_offset_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset_type = new long[]{164, 204};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> general flags: MOD_ARR_MERGE -> merge vertices in adjacent duplicates </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArrayModifierData arraymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = arraymodifierdata.__dna__addressof(ArrayModifierData.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{168, 208};

	/**
	 * Field descriptor (offset) for struct member 'count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the number of duplicates to generate for MOD_ARR_FIXEDCOUNT </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArrayModifierData arraymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = arraymodifierdata.__dna__addressof(ArrayModifierData.__DNA__FIELD__count);
	 * CPointer&lt;Integer&gt; p_count = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'count'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__count = new long[]{172, 212};

	/**
	 * Field descriptor (offset) for struct member 'uv_offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ArrayModifierData arraymodifierdata = ...;
	 * CPointer&lt;Object&gt; p = arraymodifierdata.__dna__addressof(ArrayModifierData.__DNA__FIELD__uv_offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_uv_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_offset'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_offset = new long[]{176, 216};

	public ArrayModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ArrayModifierData(ArrayModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public ModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(ModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'start_cap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the object with which to cap the start of the array. </p>
	 * @see #__DNA__FIELD__start_cap
	 */
	
	public CPointer<BlenderObject> getStart_cap() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'start_cap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the object with which to cap the start of the array. </p>
	 * @see #__DNA__FIELD__start_cap
	 */
	
	public void setStart_cap(CPointer<BlenderObject> start_cap) throws IOException
	{
		long __address = ((start_cap == null) ? 0 : start_cap.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'end_cap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the object with which to cap the end of the array. </p>
	 * @see #__DNA__FIELD__end_cap
	 */
	
	public CPointer<BlenderObject> getEnd_cap() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 116);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'end_cap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the object with which to cap the end of the array. </p>
	 * @see #__DNA__FIELD__end_cap
	 */
	
	public void setEnd_cap(CPointer<BlenderObject> end_cap) throws IOException
	{
		long __address = ((end_cap == null) ? 0 : end_cap.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
		}
	}

	/**
	 * Get method for struct member 'curve_ob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the curve object to use for MOD_ARR_FITCURVE. </p>
	 * @see #__DNA__FIELD__curve_ob
	 */
	
	public CPointer<BlenderObject> getCurve_ob() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curve_ob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the curve object to use for MOD_ARR_FITCURVE. </p>
	 * @see #__DNA__FIELD__curve_ob
	 */
	
	public void setCurve_ob(CPointer<BlenderObject> curve_ob) throws IOException
	{
		long __address = ((curve_ob == null) ? 0 : curve_ob.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'offset_ob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the object to use for object offset. </p>
	 * @see #__DNA__FIELD__offset_ob
	 */
	
	public CPointer<BlenderObject> getOffset_ob() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 124);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'offset_ob'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the object to use for object offset. </p>
	 * @see #__DNA__FIELD__offset_ob
	 */
	
	public void setOffset_ob(CPointer<BlenderObject> offset_ob) throws IOException
	{
		long __address = ((offset_ob == null) ? 0 : offset_ob.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 124, __address);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> a constant duplicate offset; 1 means the duplicates are 1 unit apart </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public CArrayFacade<Float> getOffset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> a constant duplicate offset; 1 means the duplicates are 1 unit apart </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(CArrayFacade<Float> offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 128;
		}
		if (__io__equals(offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, offset);
		} else {
			__io__generic__copy( getOffset(), offset);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> a scaled factor for duplicate offsets; 1 means the duplicates are 1 object-width apart </p>
	 * @see #__DNA__FIELD__scale
	 */
	
	public CArrayFacade<Float> getScale() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 180, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> a scaled factor for duplicate offsets; 1 means the duplicates are 1 object-width apart </p>
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(CArrayFacade<Float> scale) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 180;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(scale, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scale)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scale);
		} else {
			__io__generic__copy( getScale(), scale);
		}
	}

	/**
	 * Get method for struct member 'length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the length over which to distribute the duplicates </p>
	 * @see #__DNA__FIELD__length
	 */
	
	public float getLength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the length over which to distribute the duplicates </p>
	 * @see #__DNA__FIELD__length
	 */
	
	public void setLength(float length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, length);
		} else {
			__io__block.writeFloat(__io__address + 152, length);
		}
	}

	/**
	 * Get method for struct member 'merge_dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the limit below which to merge vertices in adjacent duplicates </p>
	 * @see #__DNA__FIELD__merge_dist
	 */
	
	public float getMerge_dist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 196);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'merge_dist'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the limit below which to merge vertices in adjacent duplicates </p>
	 * @see #__DNA__FIELD__merge_dist
	 */
	
	public void setMerge_dist(float merge_dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 196, merge_dist);
		} else {
			__io__block.writeFloat(__io__address + 156, merge_dist);
		}
	}

	/**
	 * Get method for struct member 'fit_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> determines how duplicate count is calculated; one of:<ul><li><p> MOD_ARR_FIXEDCOUNT -> fixed</p></li><li><p> MOD_ARR_FITLENGTH -> calculated to fit a set length</p></li><li><p> MOD_ARR_FITCURVE -> calculated to fit the length of a {@link Curve}  object </p></li></ul> 
	 * MOD_ARR_FIXEDCOUNT -> fixed
	 * MOD_ARR_FITLENGTH -> calculated to fit a set length
	 * MOD_ARR_FITCURVE -> calculated to fit the length of a Curve object 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__fit_type
	 */
	
	public int getFit_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 200);
		} else {
			return __io__block.readInt(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'fit_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> determines how duplicate count is calculated; one of:<ul><li><p> MOD_ARR_FIXEDCOUNT -> fixed</p></li><li><p> MOD_ARR_FITLENGTH -> calculated to fit a set length</p></li><li><p> MOD_ARR_FITCURVE -> calculated to fit the length of a {@link Curve}  object </p></li></ul> 
	 * MOD_ARR_FIXEDCOUNT -> fixed
	 * MOD_ARR_FITLENGTH -> calculated to fit a set length
	 * MOD_ARR_FITCURVE -> calculated to fit the length of a Curve object 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__fit_type
	 */
	
	public void setFit_type(int fit_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 200, fit_type);
		} else {
			__io__block.writeInt(__io__address + 160, fit_type);
		}
	}

	/**
	 * Get method for struct member 'offset_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags specifying how total offset is calculated; binary OR of:<ul><li><p> MOD_ARR_OFF_CONST -> total offset += offset</p></li><li><p> MOD_ARR_OFF_RELATIVE -> total offset += relative * object width</p></li><li><p> MOD_ARR_OFF_OBJ -> total offset += offset_ob's matrix total offset is the sum of the individual enabled offsets </p></li></ul> 
	 * MOD_ARR_OFF_CONST -> total offset += offset
	 * MOD_ARR_OFF_RELATIVE -> total offset += relative * object width
	 * MOD_ARR_OFF_OBJ -> total offset += offset_ob's matrix total offset is the sum of the individual enabled offsets 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__offset_type
	 */
	
	public int getOffset_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 204);
		} else {
			return __io__block.readInt(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'offset_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> flags specifying how total offset is calculated; binary OR of:<ul><li><p> MOD_ARR_OFF_CONST -> total offset += offset</p></li><li><p> MOD_ARR_OFF_RELATIVE -> total offset += relative * object width</p></li><li><p> MOD_ARR_OFF_OBJ -> total offset += offset_ob's matrix total offset is the sum of the individual enabled offsets </p></li></ul> 
	 * MOD_ARR_OFF_CONST -> total offset += offset
	 * MOD_ARR_OFF_RELATIVE -> total offset += relative * object width
	 * MOD_ARR_OFF_OBJ -> total offset += offset_ob's matrix total offset is the sum of the individual enabled offsets 
	 * 
	 * </p>
	 * @see #__DNA__FIELD__offset_type
	 */
	
	public void setOffset_type(int offset_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 204, offset_type);
		} else {
			__io__block.writeInt(__io__address + 164, offset_type);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> general flags: MOD_ARR_MERGE -> merge vertices in adjacent duplicates </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 208);
		} else {
			return __io__block.readInt(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> general flags: MOD_ARR_MERGE -> merge vertices in adjacent duplicates </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 208, flags);
		} else {
			__io__block.writeInt(__io__address + 168, flags);
		}
	}

	/**
	 * Get method for struct member 'count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the number of duplicates to generate for MOD_ARR_FIXEDCOUNT </p>
	 * @see #__DNA__FIELD__count
	 */
	
	public int getCount() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 212);
		} else {
			return __io__block.readInt(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'count'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the number of duplicates to generate for MOD_ARR_FIXEDCOUNT </p>
	 * @see #__DNA__FIELD__count
	 */
	
	public void setCount(int count) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 212, count);
		} else {
			__io__block.writeInt(__io__address + 172, count);
		}
	}

	/**
	 * Get method for struct member 'uv_offset'.
	 * @see #__DNA__FIELD__uv_offset
	 */
	
	public CArrayFacade<Float> getUv_offset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uv_offset'.
	 * @see #__DNA__FIELD__uv_offset
	 */
	
	public void setUv_offset(CArrayFacade<Float> uv_offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 216;
		} else {
			__dna__offset = 176;
		}
		if (__io__equals(uv_offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uv_offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uv_offset);
		} else {
			__io__generic__copy( getUv_offset(), uv_offset);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ArrayModifierData> __io__addressof() {
		return new CPointer<ArrayModifierData>(__io__address, new Class[]{ArrayModifierData.class}, __io__block, __io__blockTable);
	}

}
