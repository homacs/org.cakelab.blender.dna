package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ClothModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=124, size64=168)
public class ClothModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct ClothModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for ClothModifierData.
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
	 * ClothModifierData clothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = clothmodifierdata.__dna__addressof(ClothModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 96/112</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'scene'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothModifierData clothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = clothmodifierdata.__dna__addressof(ClothModifierData.__DNA__FIELD__scene);
	 * CPointer&lt;CPointer&lt;Scene&gt;&gt; p_scene = p.cast(new Class[]{CPointer.class, Scene.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scene'</li>
	 * <li>Signature: 'Scene*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scene = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'clothObject'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothModifierData clothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = clothmodifierdata.__dna__addressof(ClothModifierData.__DNA__FIELD__clothObject);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_clothObject = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clothObject'</li>
	 * <li>Signature: 'Cloth*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clothObject = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'sim_parms'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothModifierData clothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = clothmodifierdata.__dna__addressof(ClothModifierData.__DNA__FIELD__sim_parms);
	 * CPointer&lt;CPointer&lt;ClothSimSettings&gt;&gt; p_sim_parms = p.cast(new Class[]{CPointer.class, ClothSimSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sim_parms'</li>
	 * <li>Signature: 'ClothSimSettings*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sim_parms = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'coll_parms'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothModifierData clothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = clothmodifierdata.__dna__addressof(ClothModifierData.__DNA__FIELD__coll_parms);
	 * CPointer&lt;CPointer&lt;ClothCollSettings&gt;&gt; p_coll_parms = p.cast(new Class[]{CPointer.class, ClothCollSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coll_parms'</li>
	 * <li>Signature: 'ClothCollSettings*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coll_parms = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'point_cache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothModifierData clothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = clothmodifierdata.__dna__addressof(ClothModifierData.__DNA__FIELD__point_cache);
	 * CPointer&lt;CPointer&lt;PointCache&gt;&gt; p_point_cache = p.cast(new Class[]{CPointer.class, PointCache.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'point_cache'</li>
	 * <li>Signature: 'PointCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__point_cache = new long[]{112, 144};

	/**
	 * Field descriptor (offset) for struct member 'ptcaches'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothModifierData clothmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = clothmodifierdata.__dna__addressof(ClothModifierData.__DNA__FIELD__ptcaches);
	 * CPointer&lt;ListBase&gt; p_ptcaches = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ptcaches'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ptcaches = new long[]{116, 152};

	public ClothModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ClothModifierData(ClothModifierData that) {
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
	 * Get method for struct member 'scene'.
	 * @see #__DNA__FIELD__scene
	 */
	
	public CPointer<Scene> getScene() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Scene.class};
		return new CPointer<Scene>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Scene.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'scene'.
	 * @see #__DNA__FIELD__scene
	 */
	
	public void setScene(CPointer<Scene> scene) throws IOException
	{
		long __address = ((scene == null) ? 0 : scene.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 96, __address);
		}
	}

	/**
	 * Get method for struct member 'clothObject'.
	 * @see #__DNA__FIELD__clothObject
	 */
	
	public CPointer<Object> getClothObject() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'clothObject'.
	 * @see #__DNA__FIELD__clothObject
	 */
	
	public void setClothObject(CPointer<Object> clothObject) throws IOException
	{
		long __address = ((clothObject == null) ? 0 : clothObject.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'sim_parms'.
	 * @see #__DNA__FIELD__sim_parms
	 */
	
	public CPointer<ClothSimSettings> getSim_parms() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ClothSimSettings.class};
		return new CPointer<ClothSimSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ClothSimSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sim_parms'.
	 * @see #__DNA__FIELD__sim_parms
	 */
	
	public void setSim_parms(CPointer<ClothSimSettings> sim_parms) throws IOException
	{
		long __address = ((sim_parms == null) ? 0 : sim_parms.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'coll_parms'.
	 * @see #__DNA__FIELD__coll_parms
	 */
	
	public CPointer<ClothCollSettings> getColl_parms() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ClothCollSettings.class};
		return new CPointer<ClothCollSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ClothCollSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'coll_parms'.
	 * @see #__DNA__FIELD__coll_parms
	 */
	
	public void setColl_parms(CPointer<ClothCollSettings> coll_parms) throws IOException
	{
		long __address = ((coll_parms == null) ? 0 : coll_parms.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'point_cache'.
	 * @see #__DNA__FIELD__point_cache
	 */
	
	public CPointer<PointCache> getPoint_cache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PointCache.class};
		return new CPointer<PointCache>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PointCache.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'point_cache'.
	 * @see #__DNA__FIELD__point_cache
	 */
	
	public void setPoint_cache(CPointer<PointCache> point_cache) throws IOException
	{
		long __address = ((point_cache == null) ? 0 : point_cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'ptcaches'.
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public ListBase getPtcaches() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 152, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 116, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ptcaches'.
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public void setPtcaches(ListBase ptcaches) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 116;
		}
		if (__io__equals(ptcaches, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ptcaches)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ptcaches);
		} else {
			__io__generic__copy( getPtcaches(), ptcaches);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ClothModifierData> __io__addressof() {
		return new CPointer<ClothModifierData>(__io__address, new Class[]{ClothModifierData.class}, __io__block, __io__blockTable);
	}

}
