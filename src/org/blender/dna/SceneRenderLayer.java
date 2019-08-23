package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SceneRenderLayer'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  Render Layers Render Layer </p>
 */

@CMetaData(size32=156, size64=192)
public class SceneRenderLayer extends CFacade {

	/**
	 * This is the sdna index of the struct SceneRenderLayer.
	 * <p>
	 * It is required when allocating a new block to store data for SceneRenderLayer.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 173;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;SceneRenderLayer&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, SceneRenderLayer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'SceneRenderLayer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;SceneRenderLayer&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, SceneRenderLayer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'SceneRenderLayer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Render layer name<h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'mat_override'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__mat_override);
	 * CPointer&lt;CPointer&lt;Material&gt;&gt; p_mat_override = p.cast(new Class[]{CPointer.class, Material.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat_override'</li>
	 * <li>Signature: 'Material*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat_override = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'light_override'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Group to override all other lights in this render layer
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__light_override);
	 * CPointer&lt;CPointer&lt;Group&gt;&gt; p_light_override = p.cast(new Class[]{CPointer.class, Group.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'light_override'</li>
	 * <li>Signature: 'Group*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__light_override = new long[]{76, 88};

	/**
	 * Field descriptor (offset) for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scene->lay itself has priority over this </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__lay);
	 * CPointer&lt;Integer&gt; p_lay = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lay'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lay = new long[]{80, 96};

	/**
	 * Field descriptor (offset) for struct member 'lay_zmask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> has to be after lay, this is for Z-masking </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__lay_zmask);
	 * CPointer&lt;Integer&gt; p_lay_zmask = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lay_zmask'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lay_zmask = new long[]{84, 100};

	/**
	 * Field descriptor (offset) for struct member 'lay_exclude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not used by internal, exclude </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__lay_exclude);
	 * CPointer&lt;Integer&gt; p_lay_exclude = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lay_exclude'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lay_exclude = new long[]{88, 104};

	/**
	 * Field descriptor (offset) for struct member 'layflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__layflag);
	 * CPointer&lt;Integer&gt; p_layflag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layflag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layflag = new long[]{92, 108};

	/**
	 * Field descriptor (offset) for struct member 'passflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> pass_xor has to be after passflag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__passflag);
	 * CPointer&lt;Integer&gt; p_passflag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'passflag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__passflag = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'pass_xor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__pass_xor);
	 * CPointer&lt;Integer&gt; p_pass_xor = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass_xor'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass_xor = new long[]{100, 116};

	/**
	 * Field descriptor (offset) for struct member 'samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Override number of render samples for this render layer, 0 will use the scene setting
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__samples);
	 * CPointer&lt;Integer&gt; p_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__samples = new long[]{104, 120};

	/**
	 * Field descriptor (offset) for struct member 'pass_alpha_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Z, Index, normal, UV and vector passes are only affected by surfaces with alpha transparency equal to or higher than this threshold
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__pass_alpha_threshold);
	 * CPointer&lt;Float&gt; p_pass_alpha_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass_alpha_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass_alpha_threshold = new long[]{108, 124};

	/**
	 * Field descriptor (offset) for struct member 'prop'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__prop);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_prop = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prop'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prop = new long[]{112, 128};

	/**
	 * Field descriptor (offset) for struct member 'freestyleConfig'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SceneRenderLayer scenerenderlayer = ...;
	 * CPointer&lt;Object&gt; p = scenerenderlayer.__dna__addressof(SceneRenderLayer.__DNA__FIELD__freestyleConfig);
	 * CPointer&lt;FreestyleConfig&gt; p_freestyleConfig = p.cast(new Class[]{FreestyleConfig.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'freestyleConfig'</li>
	 * <li>Signature: 'FreestyleConfig'</li>
	 * <li>Actual Size (32bit/64bit): 40/56</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__freestyleConfig = new long[]{116, 136};

	public SceneRenderLayer(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SceneRenderLayer(SceneRenderLayer that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<SceneRenderLayer> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SceneRenderLayer.class};
		return new CPointer<SceneRenderLayer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SceneRenderLayer.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<SceneRenderLayer> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<SceneRenderLayer> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SceneRenderLayer.class};
		return new CPointer<SceneRenderLayer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SceneRenderLayer.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<SceneRenderLayer> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Render layer name<h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Render layer name<h4>Blender Source Code:</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'mat_override'.
	 * @see #__DNA__FIELD__mat_override
	 */
	
	public CPointer<Material> getMat_override() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Material.class};
		return new CPointer<Material>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Material.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mat_override'.
	 * @see #__DNA__FIELD__mat_override
	 */
	
	public void setMat_override(CPointer<Material> mat_override) throws IOException
	{
		long __address = ((mat_override == null) ? 0 : mat_override.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 72, __address);
		}
	}

	/**
	 * Get method for struct member 'light_override'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Group to override all other lights in this render layer
	 * @see #__DNA__FIELD__light_override
	 */
	
	public CPointer<Group> getLight_override() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 76);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Group.class};
		return new CPointer<Group>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Group.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'light_override'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Group to override all other lights in this render layer
	 * @see #__DNA__FIELD__light_override
	 */
	
	public void setLight_override(CPointer<Group> light_override) throws IOException
	{
		long __address = ((light_override == null) ? 0 : light_override.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 76, __address);
		}
	}

	/**
	 * Get method for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scene->lay itself has priority over this </p>
	 * @see #__DNA__FIELD__lay
	 */
	
	public int getLay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 96);
		} else {
			return __io__block.readInt(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'lay'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> scene->lay itself has priority over this </p>
	 * @see #__DNA__FIELD__lay
	 */
	
	public void setLay(int lay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 96, lay);
		} else {
			__io__block.writeInt(__io__address + 80, lay);
		}
	}

	/**
	 * Get method for struct member 'lay_zmask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> has to be after lay, this is for Z-masking </p>
	 * @see #__DNA__FIELD__lay_zmask
	 */
	
	public int getLay_zmask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 100);
		} else {
			return __io__block.readInt(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'lay_zmask'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> has to be after lay, this is for Z-masking </p>
	 * @see #__DNA__FIELD__lay_zmask
	 */
	
	public void setLay_zmask(int lay_zmask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 100, lay_zmask);
		} else {
			__io__block.writeInt(__io__address + 84, lay_zmask);
		}
	}

	/**
	 * Get method for struct member 'lay_exclude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not used by internal, exclude </p>
	 * @see #__DNA__FIELD__lay_exclude
	 */
	
	public int getLay_exclude() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 104);
		} else {
			return __io__block.readInt(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'lay_exclude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> not used by internal, exclude </p>
	 * @see #__DNA__FIELD__lay_exclude
	 */
	
	public void setLay_exclude(int lay_exclude) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 104, lay_exclude);
		} else {
			__io__block.writeInt(__io__address + 88, lay_exclude);
		}
	}

	/**
	 * Get method for struct member 'layflag'.
	 * @see #__DNA__FIELD__layflag
	 */
	
	public int getLayflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 108);
		} else {
			return __io__block.readInt(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'layflag'.
	 * @see #__DNA__FIELD__layflag
	 */
	
	public void setLayflag(int layflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 108, layflag);
		} else {
			__io__block.writeInt(__io__address + 92, layflag);
		}
	}

	/**
	 * Get method for struct member 'passflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> pass_xor has to be after passflag </p>
	 * @see #__DNA__FIELD__passflag
	 */
	
	public int getPassflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 112);
		} else {
			return __io__block.readInt(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'passflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> pass_xor has to be after passflag </p>
	 * @see #__DNA__FIELD__passflag
	 */
	
	public void setPassflag(int passflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 112, passflag);
		} else {
			__io__block.writeInt(__io__address + 96, passflag);
		}
	}

	/**
	 * Get method for struct member 'pass_xor'.
	 * @see #__DNA__FIELD__pass_xor
	 */
	
	public int getPass_xor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 116);
		} else {
			return __io__block.readInt(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'pass_xor'.
	 * @see #__DNA__FIELD__pass_xor
	 */
	
	public void setPass_xor(int pass_xor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 116, pass_xor);
		} else {
			__io__block.writeInt(__io__address + 100, pass_xor);
		}
	}

	/**
	 * Get method for struct member 'samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Override number of render samples for this render layer, 0 will use the scene setting
	 * @see #__DNA__FIELD__samples
	 */
	
	public int getSamples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 120);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Override number of render samples for this render layer, 0 will use the scene setting
	 * @see #__DNA__FIELD__samples
	 */
	
	public void setSamples(int samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 120, samples);
		} else {
			__io__block.writeInt(__io__address + 104, samples);
		}
	}

	/**
	 * Get method for struct member 'pass_alpha_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Z, Index, normal, UV and vector passes are only affected by surfaces with alpha transparency equal to or higher than this threshold
	 * @see #__DNA__FIELD__pass_alpha_threshold
	 */
	
	public float getPass_alpha_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'pass_alpha_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Z, Index, normal, UV and vector passes are only affected by surfaces with alpha transparency equal to or higher than this threshold
	 * @see #__DNA__FIELD__pass_alpha_threshold
	 */
	
	public void setPass_alpha_threshold(float pass_alpha_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, pass_alpha_threshold);
		} else {
			__io__block.writeFloat(__io__address + 108, pass_alpha_threshold);
		}
	}

	/**
	 * Get method for struct member 'prop'.
	 * @see #__DNA__FIELD__prop
	 */
	
	public CPointer<IDProperty> getProp() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prop'.
	 * @see #__DNA__FIELD__prop
	 */
	
	public void setProp(CPointer<IDProperty> prop) throws IOException
	{
		long __address = ((prop == null) ? 0 : prop.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'freestyleConfig'.
	 * @see #__DNA__FIELD__freestyleConfig
	 */
	
	public FreestyleConfig getFreestyleConfig() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new FreestyleConfig(__io__address + 136, __io__block, __io__blockTable);
		} else {
			return new FreestyleConfig(__io__address + 116, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'freestyleConfig'.
	 * @see #__DNA__FIELD__freestyleConfig
	 */
	
	public void setFreestyleConfig(FreestyleConfig freestyleConfig) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 136;
		} else {
			__dna__offset = 116;
		}
		if (__io__equals(freestyleConfig, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, freestyleConfig)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, freestyleConfig);
		} else {
			__io__generic__copy( getFreestyleConfig(), freestyleConfig);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SceneRenderLayer> __io__addressof() {
		return new CPointer<SceneRenderLayer>(__io__address, new Class[]{SceneRenderLayer.class}, __io__block, __io__blockTable);
	}

}
