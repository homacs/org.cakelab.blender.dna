package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LightCache'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=92, size64=120)
public class LightCache extends CFacade {

	/**
	 * This is the sdna index of the struct LightCache.
	 * <p>
	 * It is required when allocating a new block to store data for LightCache.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 644;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCache lightcache = ...;
	 * CPointer&lt;Object&gt; p = lightcache.__dna__addressof(LightCache.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'cube_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> only a single cache for now Number of probes to use for rendering. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCache lightcache = ...;
	 * CPointer&lt;Object&gt; p = lightcache.__dna__addressof(LightCache.__DNA__FIELD__cube_len);
	 * CPointer&lt;Integer&gt; p_cube_len = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cube_len'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cube_len = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'grid_len'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCache lightcache = ...;
	 * CPointer&lt;Object&gt; p = lightcache.__dna__addressof(LightCache.__DNA__FIELD__grid_len);
	 * CPointer&lt;Integer&gt; p_grid_len = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grid_len'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grid_len = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'mips_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of mipmap level to use. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCache lightcache = ...;
	 * CPointer&lt;Object&gt; p = lightcache.__dna__addressof(LightCache.__DNA__FIELD__mips_len);
	 * CPointer&lt;Integer&gt; p_mips_len = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mips_len'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mips_len = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'vis_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of a visibility/reflection sample. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCache lightcache = ...;
	 * CPointer&lt;Object&gt; p = lightcache.__dna__addressof(LightCache.__DNA__FIELD__vis_res);
	 * CPointer&lt;Integer&gt; p_vis_res = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vis_res'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vis_res = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'ref_res'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCache lightcache = ...;
	 * CPointer&lt;Object&gt; p = lightcache.__dna__addressof(LightCache.__DNA__FIELD__ref_res);
	 * CPointer&lt;Integer&gt; p_ref_res = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ref_res'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ref_res = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCache lightcache = ...;
	 * CPointer&lt;Object&gt; p = lightcache.__dna__addressof(LightCache.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Byte&gt;&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4][2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'grid_tx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In the future, we could create a bigger texture containing multiple caches (for animation) and interpolate between the caches overtime to another texture. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCache lightcache = ...;
	 * CPointer&lt;Object&gt; p = lightcache.__dna__addressof(LightCache.__DNA__FIELD__grid_tx);
	 * CPointer&lt;LightCacheTexture&gt; p_grid_tx = p.cast(new Class[]{LightCacheTexture.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grid_tx'</li>
	 * <li>Signature: 'LightCacheTexture'</li>
	 * <li>Actual Size (32bit/64bit): 24/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grid_tx = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'cube_tx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Contains data for mipmap level 0. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCache lightcache = ...;
	 * CPointer&lt;Object&gt; p = lightcache.__dna__addressof(LightCache.__DNA__FIELD__cube_tx);
	 * CPointer&lt;LightCacheTexture&gt; p_cube_tx = p.cast(new Class[]{LightCacheTexture.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cube_tx'</li>
	 * <li>Signature: 'LightCacheTexture'</li>
	 * <li>Actual Size (32bit/64bit): 24/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cube_tx = new long[]{56, 64};

	/**
	 * Field descriptor (offset) for struct member 'cube_mips'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Does not contains valid GPUTexture, only data. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCache lightcache = ...;
	 * CPointer&lt;Object&gt; p = lightcache.__dna__addressof(LightCache.__DNA__FIELD__cube_mips);
	 * CPointer&lt;CPointer&lt;LightCacheTexture&gt;&gt; p_cube_mips = p.cast(new Class[]{CPointer.class, LightCacheTexture.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cube_mips'</li>
	 * <li>Signature: 'LightCacheTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cube_mips = new long[]{80, 96};

	/**
	 * Field descriptor (offset) for struct member 'cube_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All lightprobes data contained in the cache. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCache lightcache = ...;
	 * CPointer&lt;Object&gt; p = lightcache.__dna__addressof(LightCache.__DNA__FIELD__cube_data);
	 * CPointer&lt;CPointer&lt;LightProbeCache&gt;&gt; p_cube_data = p.cast(new Class[]{CPointer.class, LightProbeCache.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cube_data'</li>
	 * <li>Signature: 'LightProbeCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cube_data = new long[]{84, 104};

	/**
	 * Field descriptor (offset) for struct member 'grid_data'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LightCache lightcache = ...;
	 * CPointer&lt;Object&gt; p = lightcache.__dna__addressof(LightCache.__DNA__FIELD__grid_data);
	 * CPointer&lt;CPointer&lt;LightGridCache&gt;&gt; p_grid_data = p.cast(new Class[]{CPointer.class, LightGridCache.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grid_data'</li>
	 * <li>Signature: 'LightGridCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grid_data = new long[]{88, 112};

	public LightCache(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LightCache(LightCache that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, flag);
		} else {
			__io__block.writeInt(__io__address + 0, flag);
		}
	}

	/**
	 * Get method for struct member 'cube_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> only a single cache for now Number of probes to use for rendering. </p>
	 * @see #__DNA__FIELD__cube_len
	 */
	
	public int getCube_len() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'cube_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> only a single cache for now Number of probes to use for rendering. </p>
	 * @see #__DNA__FIELD__cube_len
	 */
	
	public void setCube_len(int cube_len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, cube_len);
		} else {
			__io__block.writeInt(__io__address + 4, cube_len);
		}
	}

	/**
	 * Get method for struct member 'grid_len'.
	 * @see #__DNA__FIELD__grid_len
	 */
	
	public int getGrid_len() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'grid_len'.
	 * @see #__DNA__FIELD__grid_len
	 */
	
	public void setGrid_len(int grid_len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, grid_len);
		} else {
			__io__block.writeInt(__io__address + 8, grid_len);
		}
	}

	/**
	 * Get method for struct member 'mips_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of mipmap level to use. </p>
	 * @see #__DNA__FIELD__mips_len
	 */
	
	public int getMips_len() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'mips_len'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Number of mipmap level to use. </p>
	 * @see #__DNA__FIELD__mips_len
	 */
	
	public void setMips_len(int mips_len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, mips_len);
		} else {
			__io__block.writeInt(__io__address + 12, mips_len);
		}
	}

	/**
	 * Get method for struct member 'vis_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of a visibility/reflection sample. </p>
	 * @see #__DNA__FIELD__vis_res
	 */
	
	public int getVis_res() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'vis_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of a visibility/reflection sample. </p>
	 * @see #__DNA__FIELD__vis_res
	 */
	
	public void setVis_res(int vis_res) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, vis_res);
		} else {
			__io__block.writeInt(__io__address + 16, vis_res);
		}
	}

	/**
	 * Get method for struct member 'ref_res'.
	 * @see #__DNA__FIELD__ref_res
	 */
	
	public int getRef_res() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'ref_res'.
	 * @see #__DNA__FIELD__ref_res
	 */
	
	public void setRef_res(int ref_res) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, ref_res);
		} else {
			__io__block.writeInt(__io__address + 20, ref_res);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<CArrayFacade<Byte>> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Byte.class};
		int[] __dna__dimensions = new int[]{
			4,
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Byte>>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Byte>>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<CArrayFacade<Byte>> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
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
	 * Get method for struct member 'grid_tx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In the future, we could create a bigger texture containing multiple caches (for animation) and interpolate between the caches overtime to another texture. </p>
	 * @see #__DNA__FIELD__grid_tx
	 */
	
	public LightCacheTexture getGrid_tx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new LightCacheTexture(__io__address + 32, __io__block, __io__blockTable);
		} else {
			return new LightCacheTexture(__io__address + 32, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'grid_tx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In the future, we could create a bigger texture containing multiple caches (for animation) and interpolate between the caches overtime to another texture. </p>
	 * @see #__DNA__FIELD__grid_tx
	 */
	
	public void setGrid_tx(LightCacheTexture grid_tx) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 32;
		}
		if (__io__equals(grid_tx, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, grid_tx)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, grid_tx);
		} else {
			__io__generic__copy( getGrid_tx(), grid_tx);
		}
	}

	/**
	 * Get method for struct member 'cube_tx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Contains data for mipmap level 0. </p>
	 * @see #__DNA__FIELD__cube_tx
	 */
	
	public LightCacheTexture getCube_tx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new LightCacheTexture(__io__address + 64, __io__block, __io__blockTable);
		} else {
			return new LightCacheTexture(__io__address + 56, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cube_tx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Contains data for mipmap level 0. </p>
	 * @see #__DNA__FIELD__cube_tx
	 */
	
	public void setCube_tx(LightCacheTexture cube_tx) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 56;
		}
		if (__io__equals(cube_tx, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cube_tx)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cube_tx);
		} else {
			__io__generic__copy( getCube_tx(), cube_tx);
		}
	}

	/**
	 * Get method for struct member 'cube_mips'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Does not contains valid GPUTexture, only data. </p>
	 * @see #__DNA__FIELD__cube_mips
	 */
	
	public CPointer<LightCacheTexture> getCube_mips() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		}
		Class<?>[] __dna__targetTypes = new Class[]{LightCacheTexture.class};
		return new CPointer<LightCacheTexture>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, LightCacheTexture.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cube_mips'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Does not contains valid GPUTexture, only data. </p>
	 * @see #__DNA__FIELD__cube_mips
	 */
	
	public void setCube_mips(CPointer<LightCacheTexture> cube_mips) throws IOException
	{
		long __address = ((cube_mips == null) ? 0 : cube_mips.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 80, __address);
		}
	}

	/**
	 * Get method for struct member 'cube_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All lightprobes data contained in the cache. </p>
	 * @see #__DNA__FIELD__cube_data
	 */
	
	public CPointer<LightProbeCache> getCube_data() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 84);
		}
		Class<?>[] __dna__targetTypes = new Class[]{LightProbeCache.class};
		return new CPointer<LightProbeCache>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, LightProbeCache.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cube_data'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> All lightprobes data contained in the cache. </p>
	 * @see #__DNA__FIELD__cube_data
	 */
	
	public void setCube_data(CPointer<LightProbeCache> cube_data) throws IOException
	{
		long __address = ((cube_data == null) ? 0 : cube_data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 84, __address);
		}
	}

	/**
	 * Get method for struct member 'grid_data'.
	 * @see #__DNA__FIELD__grid_data
	 */
	
	public CPointer<LightGridCache> getGrid_data() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{LightGridCache.class};
		return new CPointer<LightGridCache>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, LightGridCache.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'grid_data'.
	 * @see #__DNA__FIELD__grid_data
	 */
	
	public void setGrid_data(CPointer<LightGridCache> grid_data) throws IOException
	{
		long __address = ((grid_data == null) ? 0 : grid_data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LightCache> __io__addressof() {
		return new CPointer<LightCache>(__io__address, new Class[]{LightCache.class}, __io__block, __io__blockTable);
	}

}
