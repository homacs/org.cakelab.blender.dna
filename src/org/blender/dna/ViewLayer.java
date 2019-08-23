package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ViewLayer'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=188, size64=264)
public class ViewLayer extends CFacade {

	/**
	 * This is the sdna index of the struct ViewLayer.
	 * <p>
	 * It is required when allocating a new block to store data for ViewLayer.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 632;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;ViewLayer&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, ViewLayer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'ViewLayer*'</li>
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
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;ViewLayer&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, ViewLayer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'ViewLayer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * View layer name<h4>Blender Source Code:</h4>
	 * <p> MAX_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__name);
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
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{74, 82};

	/**
	 * Field descriptor (offset) for struct member 'object_bases'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ObjectBase. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__object_bases);
	 * CPointer&lt;ListBase&gt; p_object_bases = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_bases'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_bases = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'stats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default allocated now. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__stats);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_stats = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stats'</li>
	 * <li>Signature: 'SceneStats*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stats = new long[]{88, 104};

	/**
	 * Field descriptor (offset) for struct member 'basact'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__basact);
	 * CPointer&lt;CPointer&lt;Base&gt;&gt; p_basact = p.cast(new Class[]{CPointer.class, Base.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'basact'</li>
	 * <li>Signature: 'Base*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__basact = new long[]{92, 112};

	/**
	 * Field descriptor (offset) for struct member 'layer_collections'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link LayerCollection} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__layer_collections);
	 * CPointer&lt;ListBase&gt; p_layer_collections = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_collections'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_collections = new long[]{96, 120};

	/**
	 * Field descriptor (offset) for struct member 'active_collection'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__active_collection);
	 * CPointer&lt;CPointer&lt;LayerCollection&gt;&gt; p_active_collection = p.cast(new Class[]{CPointer.class, LayerCollection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_collection'</li>
	 * <li>Signature: 'LayerCollection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_collection = new long[]{104, 136};

	/**
	 * Field descriptor (offset) for struct member 'layflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old {@link SceneRenderLayer}  data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__layflag);
	 * CPointer&lt;Integer&gt; p_layflag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layflag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layflag = new long[]{108, 144};

	/**
	 * Field descriptor (offset) for struct member 'passflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pass_xor has to be after passflag. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__passflag);
	 * CPointer&lt;Integer&gt; p_passflag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'passflag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__passflag = new long[]{112, 148};

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
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__pass_alpha_threshold);
	 * CPointer&lt;Float&gt; p_pass_alpha_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pass_alpha_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pass_alpha_threshold = new long[]{116, 152};

	/**
	 * Field descriptor (offset) for struct member 'samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Override number of render samples for this view layer, 0 will use the scene setting
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__samples);
	 * CPointer&lt;Integer&gt; p_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__samples = new long[]{120, 156};

	/**
	 * Field descriptor (offset) for struct member 'mat_override'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__mat_override);
	 * CPointer&lt;CPointer&lt;Material&gt;&gt; p_mat_override = p.cast(new Class[]{CPointer.class, Material.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat_override'</li>
	 * <li>Signature: 'Material*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat_override = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'id_properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Equivalent to datablocks {@link ID}  properties. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__id_properties);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_id_properties = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id_properties'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id_properties = new long[]{128, 168};

	/**
	 * Field descriptor (offset) for struct member 'freestyle_config'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__freestyle_config);
	 * CPointer&lt;FreestyleConfig&gt; p_freestyle_config = p.cast(new Class[]{FreestyleConfig.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'freestyle_config'</li>
	 * <li>Signature: 'FreestyleConfig'</li>
	 * <li>Actual Size (32bit/64bit): 40/56</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__freestyle_config = new long[]{132, 176};

	/**
	 * Field descriptor (offset) for struct member 'drawdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data {@link ViewLayerEngineData} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__drawdata);
	 * CPointer&lt;ListBase&gt; p_drawdata = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawdata'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawdata = new long[]{172, 232};

	/**
	 * Field descriptor (offset) for struct member 'object_bases_array'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__object_bases_array);
	 * CPointer&lt;CPointer&lt;CPointer&lt;Base&gt;&gt;&gt; p_object_bases_array = p.cast(new Class[]{CPointer.class, CPointer.class, Base.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_bases_array'</li>
	 * <li>Signature: 'Base**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_bases_array = new long[]{180, 248};

	/**
	 * Field descriptor (offset) for struct member 'object_bases_hash'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ViewLayer viewlayer = ...;
	 * CPointer&lt;Object&gt; p = viewlayer.__dna__addressof(ViewLayer.__DNA__FIELD__object_bases_hash);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_object_bases_hash = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object_bases_hash'</li>
	 * <li>Signature: 'GHash*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object_bases_hash = new long[]{184, 256};

	public ViewLayer(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ViewLayer(ViewLayer that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<ViewLayer> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ViewLayer.class};
		return new CPointer<ViewLayer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ViewLayer.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<ViewLayer> next) throws IOException
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
	
	public CPointer<ViewLayer> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ViewLayer.class};
		return new CPointer<ViewLayer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ViewLayer.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<ViewLayer> prev) throws IOException
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
	 * View layer name<h4>Blender Source Code:</h4>
	 * <p> MAX_NAME. </p>
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
	 * View layer name<h4>Blender Source Code:</h4>
	 * <p> MAX_NAME. </p>
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
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 80);
		} else {
			return __io__block.readShort(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 80, flag);
		} else {
			__io__block.writeShort(__io__address + 72, flag);
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
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 82, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 74, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 82;
		} else {
			__dna__offset = 74;
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
	 * Get method for struct member 'object_bases'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ObjectBase. </p>
	 * @see #__DNA__FIELD__object_bases
	 */
	
	public ListBase getObject_bases() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 88, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 80, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'object_bases'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ObjectBase. </p>
	 * @see #__DNA__FIELD__object_bases
	 */
	
	public void setObject_bases(ListBase object_bases) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(object_bases, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, object_bases)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, object_bases);
		} else {
			__io__generic__copy( getObject_bases(), object_bases);
		}
	}

	/**
	 * Get method for struct member 'stats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default allocated now. </p>
	 * @see #__DNA__FIELD__stats
	 */
	
	public CPointer<Object> getStats() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'stats'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Default allocated now. </p>
	 * @see #__DNA__FIELD__stats
	 */
	
	public void setStats(CPointer<Object> stats) throws IOException
	{
		long __address = ((stats == null) ? 0 : stats.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Get method for struct member 'basact'.
	 * @see #__DNA__FIELD__basact
	 */
	
	public CPointer<Base> getBasact() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 92);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Base.class};
		return new CPointer<Base>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Base.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'basact'.
	 * @see #__DNA__FIELD__basact
	 */
	
	public void setBasact(CPointer<Base> basact) throws IOException
	{
		long __address = ((basact == null) ? 0 : basact.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 92, __address);
		}
	}

	/**
	 * Get method for struct member 'layer_collections'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link LayerCollection} . </p>
	 * @see #__DNA__FIELD__layer_collections
	 */
	
	public ListBase getLayer_collections() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 120, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 96, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layer_collections'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link LayerCollection} . </p>
	 * @see #__DNA__FIELD__layer_collections
	 */
	
	public void setLayer_collections(ListBase layer_collections) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(layer_collections, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layer_collections)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layer_collections);
		} else {
			__io__generic__copy( getLayer_collections(), layer_collections);
		}
	}

	/**
	 * Get method for struct member 'active_collection'.
	 * @see #__DNA__FIELD__active_collection
	 */
	
	public CPointer<LayerCollection> getActive_collection() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{LayerCollection.class};
		return new CPointer<LayerCollection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, LayerCollection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'active_collection'.
	 * @see #__DNA__FIELD__active_collection
	 */
	
	public void setActive_collection(CPointer<LayerCollection> active_collection) throws IOException
	{
		long __address = ((active_collection == null) ? 0 : active_collection.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'layflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old {@link SceneRenderLayer}  data. </p>
	 * @see #__DNA__FIELD__layflag
	 */
	
	public int getLayflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 144);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'layflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old {@link SceneRenderLayer}  data. </p>
	 * @see #__DNA__FIELD__layflag
	 */
	
	public void setLayflag(int layflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 144, layflag);
		} else {
			__io__block.writeInt(__io__address + 108, layflag);
		}
	}

	/**
	 * Get method for struct member 'passflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pass_xor has to be after passflag. </p>
	 * @see #__DNA__FIELD__passflag
	 */
	
	public int getPassflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 148);
		} else {
			return __io__block.readInt(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'passflag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pass_xor has to be after passflag. </p>
	 * @see #__DNA__FIELD__passflag
	 */
	
	public void setPassflag(int passflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 148, passflag);
		} else {
			__io__block.writeInt(__io__address + 112, passflag);
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
			return __io__block.readFloat(__io__address + 152);
		} else {
			return __io__block.readFloat(__io__address + 116);
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
			__io__block.writeFloat(__io__address + 152, pass_alpha_threshold);
		} else {
			__io__block.writeFloat(__io__address + 116, pass_alpha_threshold);
		}
	}

	/**
	 * Get method for struct member 'samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Override number of render samples for this view layer, 0 will use the scene setting
	 * @see #__DNA__FIELD__samples
	 */
	
	public int getSamples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 156);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'samples'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Override number of render samples for this view layer, 0 will use the scene setting
	 * @see #__DNA__FIELD__samples
	 */
	
	public void setSamples(int samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 156, samples);
		} else {
			__io__block.writeInt(__io__address + 120, samples);
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
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 124);
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
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 124, __address);
		}
	}

	/**
	 * Get method for struct member 'id_properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Equivalent to datablocks {@link ID}  properties. </p>
	 * @see #__DNA__FIELD__id_properties
	 */
	
	public CPointer<IDProperty> getId_properties() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'id_properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Equivalent to datablocks {@link ID}  properties. </p>
	 * @see #__DNA__FIELD__id_properties
	 */
	
	public void setId_properties(CPointer<IDProperty> id_properties) throws IOException
	{
		long __address = ((id_properties == null) ? 0 : id_properties.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 168, __address);
		} else {
			__io__block.writeLong(__io__address + 128, __address);
		}
	}

	/**
	 * Get method for struct member 'freestyle_config'.
	 * @see #__DNA__FIELD__freestyle_config
	 */
	
	public FreestyleConfig getFreestyle_config() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new FreestyleConfig(__io__address + 176, __io__block, __io__blockTable);
		} else {
			return new FreestyleConfig(__io__address + 132, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'freestyle_config'.
	 * @see #__DNA__FIELD__freestyle_config
	 */
	
	public void setFreestyle_config(FreestyleConfig freestyle_config) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 176;
		} else {
			__dna__offset = 132;
		}
		if (__io__equals(freestyle_config, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, freestyle_config)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, freestyle_config);
		} else {
			__io__generic__copy( getFreestyle_config(), freestyle_config);
		}
	}

	/**
	 * Get method for struct member 'drawdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data {@link ViewLayerEngineData} . </p>
	 * @see #__DNA__FIELD__drawdata
	 */
	
	public ListBase getDrawdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 232, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 172, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drawdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime data {@link ViewLayerEngineData} . </p>
	 * @see #__DNA__FIELD__drawdata
	 */
	
	public void setDrawdata(ListBase drawdata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 232;
		} else {
			__dna__offset = 172;
		}
		if (__io__equals(drawdata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drawdata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drawdata);
		} else {
			__io__generic__copy( getDrawdata(), drawdata);
		}
	}

	/**
	 * Get method for struct member 'object_bases_array'.
	 * @see #__DNA__FIELD__object_bases_array
	 */
	
	public CPointer<CPointer<Base>> getObject_bases_array() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 180);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Base.class};
		return new CPointer<CPointer<Base>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object_bases_array'.
	 * @see #__DNA__FIELD__object_bases_array
	 */
	
	public void setObject_bases_array(CPointer<CPointer<Base>> object_bases_array) throws IOException
	{
		long __address = ((object_bases_array == null) ? 0 : object_bases_array.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 248, __address);
		} else {
			__io__block.writeLong(__io__address + 180, __address);
		}
	}

	/**
	 * Get method for struct member 'object_bases_hash'.
	 * @see #__DNA__FIELD__object_bases_hash
	 */
	
	public CPointer<Object> getObject_bases_hash() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 256);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object_bases_hash'.
	 * @see #__DNA__FIELD__object_bases_hash
	 */
	
	public void setObject_bases_hash(CPointer<Object> object_bases_hash) throws IOException
	{
		long __address = ((object_bases_hash == null) ? 0 : object_bases_hash.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 256, __address);
		} else {
			__io__block.writeLong(__io__address + 184, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ViewLayer> __io__addressof() {
		return new CPointer<ViewLayer>(__io__address, new Class[]{ViewLayer.class}, __io__block, __io__blockTable);
	}

}
