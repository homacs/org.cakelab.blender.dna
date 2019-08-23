package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'UnifiedPaintSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=80, size64=80)
public class UnifiedPaintSettings extends CFacade {

	/**
	 * This is the sdna index of the struct UnifiedPaintSettings.
	 * <p>
	 * It is required when allocating a new block to store data for UnifiedPaintSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 171;

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of the brush in pixels
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__size);
	 * CPointer&lt;Integer&gt; p_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'unprojected_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of brush in Blender units
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__unprojected_radius);
	 * CPointer&lt;Float&gt; p_unprojected_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'unprojected_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__unprojected_radius = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'alpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__alpha);
	 * CPointer&lt;Float&gt; p_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Weight to assign in vertex groups
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__weight);
	 * CPointer&lt;Float&gt; p_weight = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'weight'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__weight = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'last_rake'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__last_rake);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_last_rake = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_rake'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_rake = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'brush_rotation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__brush_rotation);
	 * CPointer&lt;Float&gt; p_brush_rotation = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brush_rotation'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brush_rotation = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'draw_anchored'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__draw_anchored);
	 * CPointer&lt;Integer&gt; p_draw_anchored = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_anchored'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_anchored = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'anchored_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__anchored_size);
	 * CPointer&lt;Integer&gt; p_anchored_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anchored_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anchored_size = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'anchored_initial_mouse'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__anchored_initial_mouse);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_anchored_initial_mouse = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anchored_initial_mouse'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anchored_initial_mouse = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'draw_pressure'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__draw_pressure);
	 * CPointer&lt;Integer&gt; p_draw_pressure = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_pressure'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_pressure = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'pressure_value'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__pressure_value);
	 * CPointer&lt;Float&gt; p_pressure_value = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pressure_value'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pressure_value = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'tex_mouse'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__tex_mouse);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_tex_mouse = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_mouse'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_mouse = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'mask_tex_mouse'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__mask_tex_mouse);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_mask_tex_mouse = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_tex_mouse'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_tex_mouse = new long[]{68, 68};

	/**
	 * Field descriptor (offset) for struct member 'pixel_radius'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UnifiedPaintSettings unifiedpaintsettings = ...;
	 * CPointer&lt;Object&gt; p = unifiedpaintsettings.__dna__addressof(UnifiedPaintSettings.__DNA__FIELD__pixel_radius);
	 * CPointer&lt;Float&gt; p_pixel_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pixel_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pixel_radius = new long[]{76, 76};

	public UnifiedPaintSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected UnifiedPaintSettings(UnifiedPaintSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of the brush in pixels
	 * @see #__DNA__FIELD__size
	 */
	
	public int getSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of the brush in pixels
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(int size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, size);
		} else {
			__io__block.writeInt(__io__address + 0, size);
		}
	}

	/**
	 * Get method for struct member 'unprojected_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of brush in Blender units
	 * @see #__DNA__FIELD__unprojected_radius
	 */
	
	public float getUnprojected_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 4);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'unprojected_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius of brush in Blender units
	 * @see #__DNA__FIELD__unprojected_radius
	 */
	
	public void setUnprojected_radius(float unprojected_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 4, unprojected_radius);
		} else {
			__io__block.writeFloat(__io__address + 4, unprojected_radius);
		}
	}

	/**
	 * Get method for struct member 'alpha'.
	 * @see #__DNA__FIELD__alpha
	 */
	
	public float getAlpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'alpha'.
	 * @see #__DNA__FIELD__alpha
	 */
	
	public void setAlpha(float alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, alpha);
		} else {
			__io__block.writeFloat(__io__address + 8, alpha);
		}
	}

	/**
	 * Get method for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Weight to assign in vertex groups
	 * @see #__DNA__FIELD__weight
	 */
	
	public float getWeight() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'weight'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Weight to assign in vertex groups
	 * @see #__DNA__FIELD__weight
	 */
	
	public void setWeight(float weight) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, weight);
		} else {
			__io__block.writeFloat(__io__address + 12, weight);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, flag);
		} else {
			__io__block.writeInt(__io__address + 16, flag);
		}
	}

	/**
	 * Get method for struct member 'last_rake'.
	 * @see #__DNA__FIELD__last_rake
	 */
	
	public CArrayFacade<Float> getLast_rake() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'last_rake'.
	 * @see #__DNA__FIELD__last_rake
	 */
	
	public void setLast_rake(CArrayFacade<Float> last_rake) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 20;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(last_rake, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, last_rake)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, last_rake);
		} else {
			__io__generic__copy( getLast_rake(), last_rake);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, pad);
		} else {
			__io__block.writeInt(__io__address + 28, pad);
		}
	}

	/**
	 * Get method for struct member 'brush_rotation'.
	 * @see #__DNA__FIELD__brush_rotation
	 */
	
	public float getBrush_rotation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'brush_rotation'.
	 * @see #__DNA__FIELD__brush_rotation
	 */
	
	public void setBrush_rotation(float brush_rotation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, brush_rotation);
		} else {
			__io__block.writeFloat(__io__address + 32, brush_rotation);
		}
	}

	/**
	 * Get method for struct member 'draw_anchored'.
	 * @see #__DNA__FIELD__draw_anchored
	 */
	
	public int getDraw_anchored() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'draw_anchored'.
	 * @see #__DNA__FIELD__draw_anchored
	 */
	
	public void setDraw_anchored(int draw_anchored) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, draw_anchored);
		} else {
			__io__block.writeInt(__io__address + 36, draw_anchored);
		}
	}

	/**
	 * Get method for struct member 'anchored_size'.
	 * @see #__DNA__FIELD__anchored_size
	 */
	
	public int getAnchored_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'anchored_size'.
	 * @see #__DNA__FIELD__anchored_size
	 */
	
	public void setAnchored_size(int anchored_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, anchored_size);
		} else {
			__io__block.writeInt(__io__address + 40, anchored_size);
		}
	}

	/**
	 * Get method for struct member 'anchored_initial_mouse'.
	 * @see #__DNA__FIELD__anchored_initial_mouse
	 */
	
	public CArrayFacade<Float> getAnchored_initial_mouse() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'anchored_initial_mouse'.
	 * @see #__DNA__FIELD__anchored_initial_mouse
	 */
	
	public void setAnchored_initial_mouse(CArrayFacade<Float> anchored_initial_mouse) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 44;
		} else {
			__dna__offset = 44;
		}
		if (__io__equals(anchored_initial_mouse, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, anchored_initial_mouse)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, anchored_initial_mouse);
		} else {
			__io__generic__copy( getAnchored_initial_mouse(), anchored_initial_mouse);
		}
	}

	/**
	 * Get method for struct member 'draw_pressure'.
	 * @see #__DNA__FIELD__draw_pressure
	 */
	
	public int getDraw_pressure() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 52);
		} else {
			return __io__block.readInt(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'draw_pressure'.
	 * @see #__DNA__FIELD__draw_pressure
	 */
	
	public void setDraw_pressure(int draw_pressure) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 52, draw_pressure);
		} else {
			__io__block.writeInt(__io__address + 52, draw_pressure);
		}
	}

	/**
	 * Get method for struct member 'pressure_value'.
	 * @see #__DNA__FIELD__pressure_value
	 */
	
	public float getPressure_value() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'pressure_value'.
	 * @see #__DNA__FIELD__pressure_value
	 */
	
	public void setPressure_value(float pressure_value) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, pressure_value);
		} else {
			__io__block.writeFloat(__io__address + 56, pressure_value);
		}
	}

	/**
	 * Get method for struct member 'tex_mouse'.
	 * @see #__DNA__FIELD__tex_mouse
	 */
	
	public CArrayFacade<Float> getTex_mouse() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tex_mouse'.
	 * @see #__DNA__FIELD__tex_mouse
	 */
	
	public void setTex_mouse(CArrayFacade<Float> tex_mouse) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 60;
		} else {
			__dna__offset = 60;
		}
		if (__io__equals(tex_mouse, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tex_mouse)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tex_mouse);
		} else {
			__io__generic__copy( getTex_mouse(), tex_mouse);
		}
	}

	/**
	 * Get method for struct member 'mask_tex_mouse'.
	 * @see #__DNA__FIELD__mask_tex_mouse
	 */
	
	public CArrayFacade<Float> getMask_tex_mouse() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 68, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 68, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mask_tex_mouse'.
	 * @see #__DNA__FIELD__mask_tex_mouse
	 */
	
	public void setMask_tex_mouse(CArrayFacade<Float> mask_tex_mouse) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 68;
		} else {
			__dna__offset = 68;
		}
		if (__io__equals(mask_tex_mouse, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mask_tex_mouse)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mask_tex_mouse);
		} else {
			__io__generic__copy( getMask_tex_mouse(), mask_tex_mouse);
		}
	}

	/**
	 * Get method for struct member 'pixel_radius'.
	 * @see #__DNA__FIELD__pixel_radius
	 */
	
	public float getPixel_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'pixel_radius'.
	 * @see #__DNA__FIELD__pixel_radius
	 */
	
	public void setPixel_radius(float pixel_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, pixel_radius);
		} else {
			__io__block.writeFloat(__io__address + 76, pixel_radius);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<UnifiedPaintSettings> __io__addressof() {
		return new CPointer<UnifiedPaintSettings>(__io__address, new Class[]{UnifiedPaintSettings.class}, __io__block, __io__blockTable);
	}

}
