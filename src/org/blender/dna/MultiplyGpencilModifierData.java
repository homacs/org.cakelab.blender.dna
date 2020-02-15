package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MultiplyGpencilModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=268, size64=280)
public class MultiplyGpencilModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct MultiplyGpencilModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for MultiplyGpencilModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 500;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;GpencilModifierData&gt; p_modifier = p.cast(new Class[]{GpencilModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'GpencilModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 92/104</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Layer name. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD__layername);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_layername = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layername'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layername = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member 'materialname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  name. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD__materialname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_materialname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'materialname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__materialname = new long[]{156, 168};

	/**
	 * Field descriptor (offset) for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD__pass_index);
	 * CPointer&lt;Integer&gt; p_pass_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass_index = new long[]{220, 232};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{224, 236};

	/**
	 * Field descriptor (offset) for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD__layer_pass);
	 * CPointer&lt;Integer&gt; p_layer_pass = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_pass'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_pass = new long[]{228, 240};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{232, 244};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{236, 248};

	/**
	 * Field descriptor (offset) for struct member 'duplications'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD__duplications);
	 * CPointer&lt;Integer&gt; p_duplications = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'duplications'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__duplications = new long[]{240, 252};

	/**
	 * Field descriptor (offset) for struct member 'distance'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD__distance);
	 * CPointer&lt;Float&gt; p_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distance = new long[]{244, 256};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> -1:inner 0:middle 1:outer </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD__offset);
	 * CPointer&lt;Float&gt; p_offset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{248, 260};

	/**
	 * Field descriptor (offset) for struct member 'fading_center'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD__fading_center);
	 * CPointer&lt;Float&gt; p_fading_center = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fading_center'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fading_center = new long[]{252, 264};

	/**
	 * Field descriptor (offset) for struct member 'fading_thickness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD__fading_thickness);
	 * CPointer&lt;Float&gt; p_fading_thickness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fading_thickness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fading_thickness = new long[]{256, 268};

	/**
	 * Field descriptor (offset) for struct member 'fading_opacity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD__fading_opacity);
	 * CPointer&lt;Float&gt; p_fading_opacity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fading_opacity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fading_opacity = new long[]{260, 272};

	/**
	 * Field descriptor (offset) for struct member 'split_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in rad not deg </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MultiplyGpencilModifierData multiplygpencilmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = multiplygpencilmodifierdata.__dna__addressof(MultiplyGpencilModifierData.__DNA__FIELD__split_angle);
	 * CPointer&lt;Float&gt; p_split_angle = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'split_angle'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__split_angle = new long[]{264, 276};

	public MultiplyGpencilModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MultiplyGpencilModifierData(MultiplyGpencilModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public GpencilModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new GpencilModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new GpencilModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(GpencilModifierData modifier) throws IOException
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
	 * Get method for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Layer name. </p>
	 * @see #__DNA__FIELD__layername
	 */
	
	public CArrayFacade<Byte> getLayername() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layername'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Layer name. </p>
	 * @see #__DNA__FIELD__layername
	 */
	
	public void setLayername(CArrayFacade<Byte> layername) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(layername, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layername)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layername);
		} else {
			__io__generic__copy( getLayername(), layername);
		}
	}

	/**
	 * Get method for struct member 'materialname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  name. </p>
	 * @see #__DNA__FIELD__materialname
	 */
	
	public CArrayFacade<Byte> getMaterialname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 156, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'materialname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Material}  name. </p>
	 * @see #__DNA__FIELD__materialname
	 */
	
	public void setMaterialname(CArrayFacade<Byte> materialname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(materialname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, materialname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, materialname);
		} else {
			__io__generic__copy( getMaterialname(), materialname);
		}
	}

	/**
	 * Get method for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public int getPass_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 232);
		} else {
			return __io__block.readInt(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'pass_index'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__pass_index
	 */
	
	public void setPass_index(int pass_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 232, pass_index);
		} else {
			__io__block.writeInt(__io__address + 220, pass_index);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 236);
		} else {
			return __io__block.readInt(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Flags. </p>
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 236, flag);
		} else {
			__io__block.writeInt(__io__address + 224, flag);
		}
	}

	/**
	 * Get method for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__layer_pass
	 */
	
	public int getLayer_pass() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 240);
		} else {
			return __io__block.readInt(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'layer_pass'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Custom index for passes. </p>
	 * @see #__DNA__FIELD__layer_pass
	 */
	
	public void setLayer_pass(int layer_pass) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 240, layer_pass);
		} else {
			__io__block.writeInt(__io__address + 228, layer_pass);
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
			return new CArrayFacade<Byte>(__io__address + 244, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 244;
		} else {
			__dna__offset = 232;
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
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 248);
		} else {
			return __io__block.readInt(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 248, flags);
		} else {
			__io__block.writeInt(__io__address + 236, flags);
		}
	}

	/**
	 * Get method for struct member 'duplications'.
	 * @see #__DNA__FIELD__duplications
	 */
	
	public int getDuplications() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 252);
		} else {
			return __io__block.readInt(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'duplications'.
	 * @see #__DNA__FIELD__duplications
	 */
	
	public void setDuplications(int duplications) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 252, duplications);
		} else {
			__io__block.writeInt(__io__address + 240, duplications);
		}
	}

	/**
	 * Get method for struct member 'distance'.
	 * @see #__DNA__FIELD__distance
	 */
	
	public float getDistance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 256);
		} else {
			return __io__block.readFloat(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'distance'.
	 * @see #__DNA__FIELD__distance
	 */
	
	public void setDistance(float distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 256, distance);
		} else {
			__io__block.writeFloat(__io__address + 244, distance);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> -1:inner 0:middle 1:outer </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public float getOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 260);
		} else {
			return __io__block.readFloat(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> -1:inner 0:middle 1:outer </p>
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(float offset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 260, offset);
		} else {
			__io__block.writeFloat(__io__address + 248, offset);
		}
	}

	/**
	 * Get method for struct member 'fading_center'.
	 * @see #__DNA__FIELD__fading_center
	 */
	
	public float getFading_center() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 264);
		} else {
			return __io__block.readFloat(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'fading_center'.
	 * @see #__DNA__FIELD__fading_center
	 */
	
	public void setFading_center(float fading_center) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 264, fading_center);
		} else {
			__io__block.writeFloat(__io__address + 252, fading_center);
		}
	}

	/**
	 * Get method for struct member 'fading_thickness'.
	 * @see #__DNA__FIELD__fading_thickness
	 */
	
	public float getFading_thickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 268);
		} else {
			return __io__block.readFloat(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'fading_thickness'.
	 * @see #__DNA__FIELD__fading_thickness
	 */
	
	public void setFading_thickness(float fading_thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 268, fading_thickness);
		} else {
			__io__block.writeFloat(__io__address + 256, fading_thickness);
		}
	}

	/**
	 * Get method for struct member 'fading_opacity'.
	 * @see #__DNA__FIELD__fading_opacity
	 */
	
	public float getFading_opacity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 272);
		} else {
			return __io__block.readFloat(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'fading_opacity'.
	 * @see #__DNA__FIELD__fading_opacity
	 */
	
	public void setFading_opacity(float fading_opacity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 272, fading_opacity);
		} else {
			__io__block.writeFloat(__io__address + 260, fading_opacity);
		}
	}

	/**
	 * Get method for struct member 'split_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in rad not deg </p>
	 * @see #__DNA__FIELD__split_angle
	 */
	
	public float getSplit_angle() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 276);
		} else {
			return __io__block.readFloat(__io__address + 264);
		}
	}

	/**
	 * Set method for struct member 'split_angle'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> in rad not deg </p>
	 * @see #__DNA__FIELD__split_angle
	 */
	
	public void setSplit_angle(float split_angle) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 276, split_angle);
		} else {
			__io__block.writeFloat(__io__address + 264, split_angle);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MultiplyGpencilModifierData> __io__addressof() {
		return new CPointer<MultiplyGpencilModifierData>(__io__address, new Class[]{MultiplyGpencilModifierData.class}, __io__block, __io__blockTable);
	}

}
