package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'CustomData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> Structure which stores custom element data associated with mesh elements (vertices, edges or faces). The custom data is organized into a series of layers, each with a data type (e.g. {@link MTFace} , {@link MDeformVert} , etc.). </p>
 */

@CMetaData(size32=236, size64=248)
public class CustomData extends CFacade {

	/**
	 * This is the sdna index of the struct CustomData.
	 * <p>
	 * It is required when allocating a new block to store data for CustomData.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 557;

	/**
	 * Field descriptor (offset) for struct member 'layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> CustomDataLayers, ordered by type. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomData customdata = ...;
	 * CPointer&lt;Object&gt; p = customdata.__dna__addressof(CustomData.__DNA__FIELD__layers);
	 * CPointer&lt;CPointer&lt;CustomDataLayer&gt;&gt; p_layers = p.cast(new Class[]{CPointer.class, CustomDataLayer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layers'</li>
	 * <li>Signature: 'CustomDataLayer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layers = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'typemap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> runtime only! - maps types to indices of first layer of that type, MUST be >= CD_NUMTYPES, but we can't use a define here. Correct size is ensured in CustomData_update_typemap assert(). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomData customdata = ...;
	 * CPointer&lt;Object&gt; p = customdata.__dna__addressof(CustomData.__DNA__FIELD__typemap);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_typemap = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'typemap'</li>
	 * <li>Signature: 'int[52]'</li>
	 * <li>Actual Size (32bit/64bit): 208/208</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__typemap = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomData customdata = ...;
	 * CPointer&lt;Object&gt; p = customdata.__dna__addressof(CustomData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{212, 216};

	/**
	 * Field descriptor (offset) for struct member 'totlayer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of layers, size of layers array. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomData customdata = ...;
	 * CPointer&lt;Object&gt; p = customdata.__dna__addressof(CustomData.__DNA__FIELD__totlayer);
	 * CPointer&lt;Integer&gt; p_totlayer = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totlayer'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totlayer = new long[]{216, 220};

	/**
	 * Field descriptor (offset) for struct member 'maxlayer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomData customdata = ...;
	 * CPointer&lt;Object&gt; p = customdata.__dna__addressof(CustomData.__DNA__FIELD__maxlayer);
	 * CPointer&lt;Integer&gt; p_maxlayer = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxlayer'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxlayer = new long[]{220, 224};

	/**
	 * Field descriptor (offset) for struct member 'totsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> In editmode, total size of all data layers. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomData customdata = ...;
	 * CPointer&lt;Object&gt; p = customdata.__dna__addressof(CustomData.__DNA__FIELD__totsize);
	 * CPointer&lt;Integer&gt; p_totsize = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totsize'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totsize = new long[]{224, 228};

	/**
	 * Field descriptor (offset) for struct member 'pool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> (BMesh Only): Memory pool for allocation of blocks. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomData customdata = ...;
	 * CPointer&lt;Object&gt; p = customdata.__dna__addressof(CustomData.__DNA__FIELD__pool);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_pool = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pool'</li>
	 * <li>Signature: 'BLI_mempool*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pool = new long[]{228, 232};

	/**
	 * Field descriptor (offset) for struct member 'external'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> External file storing customdata layers. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * CustomData customdata = ...;
	 * CPointer&lt;Object&gt; p = customdata.__dna__addressof(CustomData.__DNA__FIELD__external);
	 * CPointer&lt;CPointer&lt;CustomDataExternal&gt;&gt; p_external = p.cast(new Class[]{CPointer.class, CustomDataExternal.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'external'</li>
	 * <li>Signature: 'CustomDataExternal*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__external = new long[]{232, 240};

	public CustomData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected CustomData(CustomData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> CustomDataLayers, ordered by type. </p>
	 * @see #__DNA__FIELD__layers
	 */
	
	public CPointer<CustomDataLayer> getLayers() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CustomDataLayer.class};
		return new CPointer<CustomDataLayer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CustomDataLayer.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'layers'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> CustomDataLayers, ordered by type. </p>
	 * @see #__DNA__FIELD__layers
	 */
	
	public void setLayers(CPointer<CustomDataLayer> layers) throws IOException
	{
		long __address = ((layers == null) ? 0 : layers.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'typemap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> runtime only! - maps types to indices of first layer of that type, MUST be >= CD_NUMTYPES, but we can't use a define here. Correct size is ensured in CustomData_update_typemap assert(). </p>
	 * @see #__DNA__FIELD__typemap
	 */
	
	public CArrayFacade<Integer> getTypemap() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			52
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 4, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'typemap'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> runtime only! - maps types to indices of first layer of that type, MUST be >= CD_NUMTYPES, but we can't use a define here. Correct size is ensured in CustomData_update_typemap assert(). </p>
	 * @see #__DNA__FIELD__typemap
	 */
	
	public void setTypemap(CArrayFacade<Integer> typemap) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(typemap, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, typemap)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, typemap);
		} else {
			__io__generic__copy( getTypemap(), typemap);
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
			return new CArrayFacade<Byte>(__io__address + 216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 212, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 216;
		} else {
			__dna__offset = 212;
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
	 * Get method for struct member 'totlayer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of layers, size of layers array. </p>
	 * @see #__DNA__FIELD__totlayer
	 */
	
	public int getTotlayer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 220);
		} else {
			return __io__block.readInt(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'totlayer'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Number of layers, size of layers array. </p>
	 * @see #__DNA__FIELD__totlayer
	 */
	
	public void setTotlayer(int totlayer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 220, totlayer);
		} else {
			__io__block.writeInt(__io__address + 216, totlayer);
		}
	}

	/**
	 * Get method for struct member 'maxlayer'.
	 * @see #__DNA__FIELD__maxlayer
	 */
	
	public int getMaxlayer() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 224);
		} else {
			return __io__block.readInt(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'maxlayer'.
	 * @see #__DNA__FIELD__maxlayer
	 */
	
	public void setMaxlayer(int maxlayer) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 224, maxlayer);
		} else {
			__io__block.writeInt(__io__address + 220, maxlayer);
		}
	}

	/**
	 * Get method for struct member 'totsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> In editmode, total size of all data layers. </p>
	 * @see #__DNA__FIELD__totsize
	 */
	
	public int getTotsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 228);
		} else {
			return __io__block.readInt(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'totsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> In editmode, total size of all data layers. </p>
	 * @see #__DNA__FIELD__totsize
	 */
	
	public void setTotsize(int totsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 228, totsize);
		} else {
			__io__block.writeInt(__io__address + 224, totsize);
		}
	}

	/**
	 * Get method for struct member 'pool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> (BMesh Only): Memory pool for allocation of blocks. </p>
	 * @see #__DNA__FIELD__pool
	 */
	
	public CPointer<Object> getPool() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 228);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pool'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> (BMesh Only): Memory pool for allocation of blocks. </p>
	 * @see #__DNA__FIELD__pool
	 */
	
	public void setPool(CPointer<Object> pool) throws IOException
	{
		long __address = ((pool == null) ? 0 : pool.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 228, __address);
		}
	}

	/**
	 * Get method for struct member 'external'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> External file storing customdata layers. </p>
	 * @see #__DNA__FIELD__external
	 */
	
	public CPointer<CustomDataExternal> getExternal() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CustomDataExternal.class};
		return new CPointer<CustomDataExternal>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CustomDataExternal.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'external'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> External file storing customdata layers. </p>
	 * @see #__DNA__FIELD__external
	 */
	
	public void setExternal(CPointer<CustomDataExternal> external) throws IOException
	{
		long __address = ((external == null) ? 0 : external.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 240, __address);
		} else {
			__io__block.writeLong(__io__address + 232, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<CustomData> __io__addressof() {
		return new CPointer<CustomData>(__io__address, new Class[]{CustomData.class}, __io__block, __io__blockTable);
	}

}
