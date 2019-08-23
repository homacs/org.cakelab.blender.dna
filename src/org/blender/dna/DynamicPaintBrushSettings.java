package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'DynamicPaintBrushSettings'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p>{@link Brush}  settings </p>
 */

@CMetaData(size32=80, size64=96)
public class DynamicPaintBrushSettings extends CFacade {

	/**
	 * This is the sdna index of the struct DynamicPaintBrushSettings.
	 * <p>
	 * It is required when allocating a new block to store data for DynamicPaintBrushSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 571;

	/**
	 * Field descriptor (offset) for struct member 'pmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For fast RNA access. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__pmd);
	 * CPointer&lt;CPointer&lt;DynamicPaintModifierData&gt;&gt; p_pmd = p.cast(new Class[]{CPointer.class, DynamicPaintModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pmd'</li>
	 * <li>Signature: 'DynamicPaintModifierData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pmd = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'psys'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__psys);
	 * CPointer&lt;CPointer&lt;ParticleSystem&gt;&gt; p_psys = p.cast(new Class[]{CPointer.class, ParticleSystem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'psys'</li>
	 * <li>Signature: 'ParticleSystem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__psys = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'collision'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__collision);
	 * CPointer&lt;Integer&gt; p_collision = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'collision'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__collision = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'r'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__r);
	 * CPointer&lt;Float&gt; p_r = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'r'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__r = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'g'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__g);
	 * CPointer&lt;Float&gt; p_g = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'g'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__g = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'b'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__b);
	 * CPointer&lt;Float&gt; p_b = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'b'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__b = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'alpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__alpha);
	 * CPointer&lt;Float&gt; p_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'wetness'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__wetness);
	 * CPointer&lt;Float&gt; p_wetness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wetness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wetness = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'particle_radius'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__particle_radius);
	 * CPointer&lt;Float&gt; p_particle_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_radius = new long[]{36, 44};

	/**
	 * Field descriptor (offset) for struct member 'particle_smooth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__particle_smooth);
	 * CPointer&lt;Float&gt; p_particle_smooth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_smooth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_smooth = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'paint_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance from brush to mesh surface to affect paint
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__paint_distance);
	 * CPointer&lt;Float&gt; p_paint_distance = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint_distance'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint_distance = new long[]{44, 52};

	/**
	 * Field descriptor (offset) for struct member 'paint_ramp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Color ramp used to define proximity falloff<h4>Blender Source Code:</h4>
	 * <p> color ramps Proximity paint falloff. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__paint_ramp);
	 * CPointer&lt;CPointer&lt;ColorBand&gt;&gt; p_paint_ramp = p.cast(new Class[]{CPointer.class, ColorBand.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint_ramp'</li>
	 * <li>Signature: 'ColorBand*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint_ramp = new long[]{48, 56};

	/**
	 * Field descriptor (offset) for struct member 'vel_ramp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Velocity paint ramp. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__vel_ramp);
	 * CPointer&lt;CPointer&lt;ColorBand&gt;&gt; p_vel_ramp = p.cast(new Class[]{CPointer.class, ColorBand.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vel_ramp'</li>
	 * <li>Signature: 'ColorBand*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vel_ramp = new long[]{52, 64};

	/**
	 * Field descriptor (offset) for struct member 'proximity_falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Proximity falloff type
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__proximity_falloff);
	 * CPointer&lt;Short&gt; p_proximity_falloff = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proximity_falloff'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proximity_falloff = new long[]{56, 72};

	/**
	 * Field descriptor (offset) for struct member 'wave_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__wave_type);
	 * CPointer&lt;Short&gt; p_wave_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wave_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wave_type = new long[]{58, 74};

	/**
	 * Field descriptor (offset) for struct member 'ray_dir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__ray_dir);
	 * CPointer&lt;Short&gt; p_ray_dir = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ray_dir'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ray_dir = new long[]{60, 76};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{62, 78};

	/**
	 * Field descriptor (offset) for struct member 'wave_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier for wave influence of this brush
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__wave_factor);
	 * CPointer&lt;Float&gt; p_wave_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wave_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wave_factor = new long[]{64, 80};

	/**
	 * Field descriptor (offset) for struct member 'wave_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum level of surface intersection used to influence waves (use 0.0 to disable)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__wave_clamp);
	 * CPointer&lt;Float&gt; p_wave_clamp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'wave_clamp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__wave_clamp = new long[]{68, 84};

	/**
	 * Field descriptor (offset) for struct member 'max_velocity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__max_velocity);
	 * CPointer&lt;Float&gt; p_max_velocity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max_velocity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max_velocity = new long[]{72, 88};

	/**
	 * Field descriptor (offset) for struct member 'smudge_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Smudge effect strength
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DynamicPaintBrushSettings dynamicpaintbrushsettings = ...;
	 * CPointer&lt;Object&gt; p = dynamicpaintbrushsettings.__dna__addressof(DynamicPaintBrushSettings.__DNA__FIELD__smudge_strength);
	 * CPointer&lt;Float&gt; p_smudge_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smudge_strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smudge_strength = new long[]{76, 92};

	public DynamicPaintBrushSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected DynamicPaintBrushSettings(DynamicPaintBrushSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'pmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For fast RNA access. </p>
	 * @see #__DNA__FIELD__pmd
	 */
	
	public CPointer<DynamicPaintModifierData> getPmd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{DynamicPaintModifierData.class};
		return new CPointer<DynamicPaintModifierData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, DynamicPaintModifierData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> For fast RNA access. </p>
	 * @see #__DNA__FIELD__pmd
	 */
	
	public void setPmd(CPointer<DynamicPaintModifierData> pmd) throws IOException
	{
		long __address = ((pmd == null) ? 0 : pmd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'psys'.
	 * @see #__DNA__FIELD__psys
	 */
	
	public CPointer<ParticleSystem> getPsys() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ParticleSystem.class};
		return new CPointer<ParticleSystem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ParticleSystem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'psys'.
	 * @see #__DNA__FIELD__psys
	 */
	
	public void setPsys(CPointer<ParticleSystem> psys) throws IOException
	{
		long __address = ((psys == null) ? 0 : psys.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, flags);
		} else {
			__io__block.writeInt(__io__address + 8, flags);
		}
	}

	/**
	 * Get method for struct member 'collision'.
	 * @see #__DNA__FIELD__collision
	 */
	
	public int getCollision() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'collision'.
	 * @see #__DNA__FIELD__collision
	 */
	
	public void setCollision(int collision) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, collision);
		} else {
			__io__block.writeInt(__io__address + 12, collision);
		}
	}

	/**
	 * Get method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public float getR() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'r'.
	 * @see #__DNA__FIELD__r
	 */
	
	public void setR(float r) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, r);
		} else {
			__io__block.writeFloat(__io__address + 16, r);
		}
	}

	/**
	 * Get method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public float getG() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'g'.
	 * @see #__DNA__FIELD__g
	 */
	
	public void setG(float g) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, g);
		} else {
			__io__block.writeFloat(__io__address + 20, g);
		}
	}

	/**
	 * Get method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public float getB() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'b'.
	 * @see #__DNA__FIELD__b
	 */
	
	public void setB(float b) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, b);
		} else {
			__io__block.writeFloat(__io__address + 24, b);
		}
	}

	/**
	 * Get method for struct member 'alpha'.
	 * @see #__DNA__FIELD__alpha
	 */
	
	public float getAlpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'alpha'.
	 * @see #__DNA__FIELD__alpha
	 */
	
	public void setAlpha(float alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, alpha);
		} else {
			__io__block.writeFloat(__io__address + 28, alpha);
		}
	}

	/**
	 * Get method for struct member 'wetness'.
	 * @see #__DNA__FIELD__wetness
	 */
	
	public float getWetness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 40);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'wetness'.
	 * @see #__DNA__FIELD__wetness
	 */
	
	public void setWetness(float wetness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 40, wetness);
		} else {
			__io__block.writeFloat(__io__address + 32, wetness);
		}
	}

	/**
	 * Get method for struct member 'particle_radius'.
	 * @see #__DNA__FIELD__particle_radius
	 */
	
	public float getParticle_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 44);
		} else {
			return __io__block.readFloat(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'particle_radius'.
	 * @see #__DNA__FIELD__particle_radius
	 */
	
	public void setParticle_radius(float particle_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 44, particle_radius);
		} else {
			__io__block.writeFloat(__io__address + 36, particle_radius);
		}
	}

	/**
	 * Get method for struct member 'particle_smooth'.
	 * @see #__DNA__FIELD__particle_smooth
	 */
	
	public float getParticle_smooth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 48);
		} else {
			return __io__block.readFloat(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'particle_smooth'.
	 * @see #__DNA__FIELD__particle_smooth
	 */
	
	public void setParticle_smooth(float particle_smooth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 48, particle_smooth);
		} else {
			__io__block.writeFloat(__io__address + 40, particle_smooth);
		}
	}

	/**
	 * Get method for struct member 'paint_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance from brush to mesh surface to affect paint
	 * @see #__DNA__FIELD__paint_distance
	 */
	
	public float getPaint_distance() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'paint_distance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum distance from brush to mesh surface to affect paint
	 * @see #__DNA__FIELD__paint_distance
	 */
	
	public void setPaint_distance(float paint_distance) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, paint_distance);
		} else {
			__io__block.writeFloat(__io__address + 44, paint_distance);
		}
	}

	/**
	 * Get method for struct member 'paint_ramp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Color ramp used to define proximity falloff<h4>Blender Source Code:</h4>
	 * <p> color ramps Proximity paint falloff. </p>
	 * @see #__DNA__FIELD__paint_ramp
	 */
	
	public CPointer<ColorBand> getPaint_ramp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ColorBand.class};
		return new CPointer<ColorBand>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ColorBand.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'paint_ramp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Color ramp used to define proximity falloff<h4>Blender Source Code:</h4>
	 * <p> color ramps Proximity paint falloff. </p>
	 * @see #__DNA__FIELD__paint_ramp
	 */
	
	public void setPaint_ramp(CPointer<ColorBand> paint_ramp) throws IOException
	{
		long __address = ((paint_ramp == null) ? 0 : paint_ramp.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 56, __address);
		} else {
			__io__block.writeLong(__io__address + 48, __address);
		}
	}

	/**
	 * Get method for struct member 'vel_ramp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Velocity paint ramp. </p>
	 * @see #__DNA__FIELD__vel_ramp
	 */
	
	public CPointer<ColorBand> getVel_ramp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 52);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ColorBand.class};
		return new CPointer<ColorBand>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ColorBand.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'vel_ramp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Velocity paint ramp. </p>
	 * @see #__DNA__FIELD__vel_ramp
	 */
	
	public void setVel_ramp(CPointer<ColorBand> vel_ramp) throws IOException
	{
		long __address = ((vel_ramp == null) ? 0 : vel_ramp.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 52, __address);
		}
	}

	/**
	 * Get method for struct member 'proximity_falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Proximity falloff type
	 * @see #__DNA__FIELD__proximity_falloff
	 */
	
	public short getProximity_falloff() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 72);
		} else {
			return __io__block.readShort(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'proximity_falloff'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Proximity falloff type
	 * @see #__DNA__FIELD__proximity_falloff
	 */
	
	public void setProximity_falloff(short proximity_falloff) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 72, proximity_falloff);
		} else {
			__io__block.writeShort(__io__address + 56, proximity_falloff);
		}
	}

	/**
	 * Get method for struct member 'wave_type'.
	 * @see #__DNA__FIELD__wave_type
	 */
	
	public short getWave_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 74);
		} else {
			return __io__block.readShort(__io__address + 58);
		}
	}

	/**
	 * Set method for struct member 'wave_type'.
	 * @see #__DNA__FIELD__wave_type
	 */
	
	public void setWave_type(short wave_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 74, wave_type);
		} else {
			__io__block.writeShort(__io__address + 58, wave_type);
		}
	}

	/**
	 * Get method for struct member 'ray_dir'.
	 * @see #__DNA__FIELD__ray_dir
	 */
	
	public short getRay_dir() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 76);
		} else {
			return __io__block.readShort(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'ray_dir'.
	 * @see #__DNA__FIELD__ray_dir
	 */
	
	public void setRay_dir(short ray_dir) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 76, ray_dir);
		} else {
			__io__block.writeShort(__io__address + 60, ray_dir);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 78, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 62, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 78;
		} else {
			__dna__offset = 62;
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
	 * Get method for struct member 'wave_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier for wave influence of this brush
	 * @see #__DNA__FIELD__wave_factor
	 */
	
	public float getWave_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 80);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'wave_factor'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier for wave influence of this brush
	 * @see #__DNA__FIELD__wave_factor
	 */
	
	public void setWave_factor(float wave_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 80, wave_factor);
		} else {
			__io__block.writeFloat(__io__address + 64, wave_factor);
		}
	}

	/**
	 * Get method for struct member 'wave_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum level of surface intersection used to influence waves (use 0.0 to disable)
	 * @see #__DNA__FIELD__wave_clamp
	 */
	
	public float getWave_clamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'wave_clamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum level of surface intersection used to influence waves (use 0.0 to disable)
	 * @see #__DNA__FIELD__wave_clamp
	 */
	
	public void setWave_clamp(float wave_clamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, wave_clamp);
		} else {
			__io__block.writeFloat(__io__address + 68, wave_clamp);
		}
	}

	/**
	 * Get method for struct member 'max_velocity'.
	 * @see #__DNA__FIELD__max_velocity
	 */
	
	public float getMax_velocity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'max_velocity'.
	 * @see #__DNA__FIELD__max_velocity
	 */
	
	public void setMax_velocity(float max_velocity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, max_velocity);
		} else {
			__io__block.writeFloat(__io__address + 72, max_velocity);
		}
	}

	/**
	 * Get method for struct member 'smudge_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Smudge effect strength
	 * @see #__DNA__FIELD__smudge_strength
	 */
	
	public float getSmudge_strength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'smudge_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Smudge effect strength
	 * @see #__DNA__FIELD__smudge_strength
	 */
	
	public void setSmudge_strength(float smudge_strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, smudge_strength);
		} else {
			__io__block.writeFloat(__io__address + 76, smudge_strength);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<DynamicPaintBrushSettings> __io__addressof() {
		return new CPointer<DynamicPaintBrushSettings>(__io__address, new Class[]{DynamicPaintBrushSettings.class}, __io__block, __io__blockTable);
	}

}
