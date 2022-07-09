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
 * Generated facet for DNA struct type 'Editing'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=3176, size64=3232)
public class Editing extends CFacade {

	/**
	 * This is the sdna index of the struct Editing.
	 * <p>
	 * It is required when allocating a new block to store data for Editing.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 326;

	/**
	 * Field descriptor (offset) for struct member 'seqbasep'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Pointer to the current list of seq's being edited (can be within a meta strip). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__seqbasep);
	 * CPointer&lt;CPointer&lt;ListBase&gt;&gt; p_seqbasep = p.cast(new Class[]{CPointer.class, ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seqbasep'</li>
	 * <li>Signature: 'ListBase*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seqbasep = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'displayed_channels'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__displayed_channels);
	 * CPointer&lt;CPointer&lt;ListBase&gt;&gt; p_displayed_channels = p.cast(new Class[]{CPointer.class, ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'displayed_channels'</li>
	 * <li>Signature: 'ListBase*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__displayed_channels = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD___pad0);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad0 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'seqbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Pointer to the top-most seq's. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__seqbase);
	 * CPointer&lt;ListBase&gt; p_seqbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seqbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seqbase = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'metastack'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__metastack);
	 * CPointer&lt;ListBase&gt; p_metastack = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'metastack'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__metastack = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'channels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link SeqTimelineChannel}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__channels);
	 * CPointer&lt;ListBase&gt; p_channels = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'channels'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__channels = new long[]{28, 56};

	/**
	 * Field descriptor (offset) for struct member 'act_seq'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Context vars, used to be static </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__act_seq);
	 * CPointer&lt;CPointer&lt;Sequence&gt;&gt; p_act_seq = p.cast(new Class[]{CPointer.class, Sequence.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_seq'</li>
	 * <li>Signature: 'Sequence*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_seq = new long[]{36, 72};

	/**
	 * Field descriptor (offset) for struct member 'act_imagedir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__act_imagedir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_act_imagedir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_imagedir'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_imagedir = new long[]{40, 80};

	/**
	 * Field descriptor (offset) for struct member 'act_sounddir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__act_sounddir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_act_sounddir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_sounddir'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_sounddir = new long[]{1064, 1104};

	/**
	 * Field descriptor (offset) for struct member 'proxy_dir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__proxy_dir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_proxy_dir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proxy_dir'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proxy_dir = new long[]{2088, 2128};

	/**
	 * Field descriptor (offset) for struct member 'proxy_storage'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__proxy_storage);
	 * CPointer&lt;Integer&gt; p_proxy_storage = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proxy_storage'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proxy_storage = new long[]{3112, 3152};

	/**
	 * Field descriptor (offset) for struct member 'over_ofs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__over_ofs);
	 * CPointer&lt;Integer&gt; p_over_ofs = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'over_ofs'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__over_ofs = new long[]{3116, 3156};

	/**
	 * Field descriptor (offset) for struct member 'over_cfra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__over_cfra);
	 * CPointer&lt;Integer&gt; p_over_cfra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'over_cfra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__over_cfra = new long[]{3120, 3160};

	/**
	 * Field descriptor (offset) for struct member 'over_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__over_flag);
	 * CPointer&lt;Integer&gt; p_over_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'over_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__over_flag = new long[]{3124, 3164};

	/**
	 * Field descriptor (offset) for struct member 'over_border'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__over_border);
	 * CPointer&lt;rctf&gt; p_over_border = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'over_border'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__over_border = new long[]{3128, 3168};

	/**
	 * Field descriptor (offset) for struct member 'cache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache'</li>
	 * <li>Signature: 'SeqCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache = new long[]{3144, 3184};

	/**
	 * Field descriptor (offset) for struct member 'recycle_max_cost'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cache control UNUSED only for versioning. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__recycle_max_cost);
	 * CPointer&lt;Float&gt; p_recycle_max_cost = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'recycle_max_cost'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__recycle_max_cost = new long[]{3148, 3192};

	/**
	 * Field descriptor (offset) for struct member 'cache_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__cache_flag);
	 * CPointer&lt;Integer&gt; p_cache_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_flag = new long[]{3152, 3196};

	/**
	 * Field descriptor (offset) for struct member 'prefetch_job'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__prefetch_job);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_prefetch_job = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prefetch_job'</li>
	 * <li>Signature: 'PrefetchJob*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prefetch_job = new long[]{3156, 3200};

	/**
	 * Field descriptor (offset) for struct member 'disk_cache_timestamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Must be initialized only by seq_cache_create() </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__disk_cache_timestamp);
	 * CPointer&lt;int64&gt; p_disk_cache_timestamp = p.cast(new Class[]{int64.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'disk_cache_timestamp'</li>
	 * <li>Signature: 'int64_t'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__disk_cache_timestamp = new long[]{3160, 3208};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__runtime);
	 * CPointer&lt;EditingRuntime&gt; p_runtime = p.cast(new Class[]{EditingRuntime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'EditingRuntime'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{3168, 3216};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD___pad1);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p__pad1 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{3172, 3224};

	public Editing(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Editing(Editing that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'seqbasep'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Pointer to the current list of seq's being edited (can be within a meta strip). </p>
	 * @see #__DNA__FIELD__seqbasep
	 */
	
	public CPointer<ListBase> getSeqbasep() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ListBase.class};
		return new CPointer<ListBase>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ListBase.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'seqbasep'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Pointer to the current list of seq's being edited (can be within a meta strip). </p>
	 * @see #__DNA__FIELD__seqbasep
	 */
	
	public void setSeqbasep(CPointer<ListBase> seqbasep) throws IOException
	{
		long __address = ((seqbasep == null) ? 0 : seqbasep.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'displayed_channels'.
	 * @see #__DNA__FIELD__displayed_channels
	 */
	
	public CPointer<ListBase> getDisplayed_channels() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ListBase.class};
		return new CPointer<ListBase>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ListBase.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'displayed_channels'.
	 * @see #__DNA__FIELD__displayed_channels
	 */
	
	public void setDisplayed_channels(CPointer<ListBase> displayed_channels) throws IOException
	{
		long __address = ((displayed_channels == null) ? 0 : displayed_channels.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CPointer<Object> get_pad0() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CPointer<Object> _pad0) throws IOException
	{
		long __address = ((_pad0 == null) ? 0 : _pad0.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'seqbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Pointer to the top-most seq's. </p>
	 * @see #__DNA__FIELD__seqbase
	 */
	
	public ListBase getSeqbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 24, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 12, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'seqbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Pointer to the top-most seq's. </p>
	 * @see #__DNA__FIELD__seqbase
	 */
	
	public void setSeqbase(ListBase seqbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(seqbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, seqbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, seqbase);
		} else {
			__io__generic__copy( getSeqbase(), seqbase);
		}
	}

	/**
	 * Get method for struct member 'metastack'.
	 * @see #__DNA__FIELD__metastack
	 */
	
	public ListBase getMetastack() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 40, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 20, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'metastack'.
	 * @see #__DNA__FIELD__metastack
	 */
	
	public void setMetastack(ListBase metastack) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(metastack, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, metastack)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, metastack);
		} else {
			__io__generic__copy( getMetastack(), metastack);
		}
	}

	/**
	 * Get method for struct member 'channels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link SeqTimelineChannel}  </p>
	 * @see #__DNA__FIELD__channels
	 */
	
	public ListBase getChannels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 56, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 28, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'channels'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p>{@link SeqTimelineChannel}  </p>
	 * @see #__DNA__FIELD__channels
	 */
	
	public void setChannels(ListBase channels) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(channels, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, channels)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, channels);
		} else {
			__io__generic__copy( getChannels(), channels);
		}
	}

	/**
	 * Get method for struct member 'act_seq'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Context vars, used to be static </p>
	 * @see #__DNA__FIELD__act_seq
	 */
	
	public CPointer<Sequence> getAct_seq() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 36);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Sequence.class};
		return new CPointer<Sequence>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Sequence.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act_seq'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Context vars, used to be static </p>
	 * @see #__DNA__FIELD__act_seq
	 */
	
	public void setAct_seq(CPointer<Sequence> act_seq) throws IOException
	{
		long __address = ((act_seq == null) ? 0 : act_seq.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 72, __address);
		} else {
			__io__block.writeLong(__io__address + 36, __address);
		}
	}

	/**
	 * Get method for struct member 'act_imagedir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__act_imagedir
	 */
	
	public CArrayFacade<Byte> getAct_imagedir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'act_imagedir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__act_imagedir
	 */
	
	public void setAct_imagedir(CArrayFacade<Byte> act_imagedir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 80;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(act_imagedir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, act_imagedir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, act_imagedir);
		} else {
			__io__generic__copy( getAct_imagedir(), act_imagedir);
		}
	}

	/**
	 * Get method for struct member 'act_sounddir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__act_sounddir
	 */
	
	public CArrayFacade<Byte> getAct_sounddir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1064, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'act_sounddir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__act_sounddir
	 */
	
	public void setAct_sounddir(CArrayFacade<Byte> act_sounddir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1104;
		} else {
			__dna__offset = 1064;
		}
		if (__io__equals(act_sounddir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, act_sounddir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, act_sounddir);
		} else {
			__io__generic__copy( getAct_sounddir(), act_sounddir);
		}
	}

	/**
	 * Get method for struct member 'proxy_dir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__proxy_dir
	 */
	
	public CArrayFacade<Byte> getProxy_dir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2088, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'proxy_dir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__proxy_dir
	 */
	
	public void setProxy_dir(CArrayFacade<Byte> proxy_dir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2128;
		} else {
			__dna__offset = 2088;
		}
		if (__io__equals(proxy_dir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, proxy_dir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, proxy_dir);
		} else {
			__io__generic__copy( getProxy_dir(), proxy_dir);
		}
	}

	/**
	 * Get method for struct member 'proxy_storage'.
	 * @see #__DNA__FIELD__proxy_storage
	 */
	
	public int getProxy_storage() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 3152);
		} else {
			return __io__block.readInt(__io__address + 3112);
		}
	}

	/**
	 * Set method for struct member 'proxy_storage'.
	 * @see #__DNA__FIELD__proxy_storage
	 */
	
	public void setProxy_storage(int proxy_storage) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 3152, proxy_storage);
		} else {
			__io__block.writeInt(__io__address + 3112, proxy_storage);
		}
	}

	/**
	 * Get method for struct member 'over_ofs'.
	 * @see #__DNA__FIELD__over_ofs
	 */
	
	public int getOver_ofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 3156);
		} else {
			return __io__block.readInt(__io__address + 3116);
		}
	}

	/**
	 * Set method for struct member 'over_ofs'.
	 * @see #__DNA__FIELD__over_ofs
	 */
	
	public void setOver_ofs(int over_ofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 3156, over_ofs);
		} else {
			__io__block.writeInt(__io__address + 3116, over_ofs);
		}
	}

	/**
	 * Get method for struct member 'over_cfra'.
	 * @see #__DNA__FIELD__over_cfra
	 */
	
	public int getOver_cfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 3160);
		} else {
			return __io__block.readInt(__io__address + 3120);
		}
	}

	/**
	 * Set method for struct member 'over_cfra'.
	 * @see #__DNA__FIELD__over_cfra
	 */
	
	public void setOver_cfra(int over_cfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 3160, over_cfra);
		} else {
			__io__block.writeInt(__io__address + 3120, over_cfra);
		}
	}

	/**
	 * Get method for struct member 'over_flag'.
	 * @see #__DNA__FIELD__over_flag
	 */
	
	public int getOver_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 3164);
		} else {
			return __io__block.readInt(__io__address + 3124);
		}
	}

	/**
	 * Set method for struct member 'over_flag'.
	 * @see #__DNA__FIELD__over_flag
	 */
	
	public void setOver_flag(int over_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 3164, over_flag);
		} else {
			__io__block.writeInt(__io__address + 3124, over_flag);
		}
	}

	/**
	 * Get method for struct member 'over_border'.
	 * @see #__DNA__FIELD__over_border
	 */
	
	public rctf getOver_border() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 3168, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 3128, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'over_border'.
	 * @see #__DNA__FIELD__over_border
	 */
	
	public void setOver_border(rctf over_border) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 3168;
		} else {
			__dna__offset = 3128;
		}
		if (__io__equals(over_border, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, over_border)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, over_border);
		} else {
			__io__generic__copy( getOver_border(), over_border);
		}
	}

	/**
	 * Get method for struct member 'cache'.
	 * @see #__DNA__FIELD__cache
	 */
	
	public CPointer<Object> getCache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 3184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 3144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cache'.
	 * @see #__DNA__FIELD__cache
	 */
	
	public void setCache(CPointer<Object> cache) throws IOException
	{
		long __address = ((cache == null) ? 0 : cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 3184, __address);
		} else {
			__io__block.writeLong(__io__address + 3144, __address);
		}
	}

	/**
	 * Get method for struct member 'recycle_max_cost'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cache control UNUSED only for versioning. </p>
	 * @see #__DNA__FIELD__recycle_max_cost
	 */
	
	public float getRecycle_max_cost() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 3192);
		} else {
			return __io__block.readFloat(__io__address + 3148);
		}
	}

	/**
	 * Set method for struct member 'recycle_max_cost'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Cache control UNUSED only for versioning. </p>
	 * @see #__DNA__FIELD__recycle_max_cost
	 */
	
	public void setRecycle_max_cost(float recycle_max_cost) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 3192, recycle_max_cost);
		} else {
			__io__block.writeFloat(__io__address + 3148, recycle_max_cost);
		}
	}

	/**
	 * Get method for struct member 'cache_flag'.
	 * @see #__DNA__FIELD__cache_flag
	 */
	
	public int getCache_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 3196);
		} else {
			return __io__block.readInt(__io__address + 3152);
		}
	}

	/**
	 * Set method for struct member 'cache_flag'.
	 * @see #__DNA__FIELD__cache_flag
	 */
	
	public void setCache_flag(int cache_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 3196, cache_flag);
		} else {
			__io__block.writeInt(__io__address + 3152, cache_flag);
		}
	}

	/**
	 * Get method for struct member 'prefetch_job'.
	 * @see #__DNA__FIELD__prefetch_job
	 */
	
	public CPointer<Object> getPrefetch_job() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 3200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 3156);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prefetch_job'.
	 * @see #__DNA__FIELD__prefetch_job
	 */
	
	public void setPrefetch_job(CPointer<Object> prefetch_job) throws IOException
	{
		long __address = ((prefetch_job == null) ? 0 : prefetch_job.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 3200, __address);
		} else {
			__io__block.writeLong(__io__address + 3156, __address);
		}
	}

	/**
	 * Get method for struct member 'disk_cache_timestamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Must be initialized only by seq_cache_create() </p>
	 * @see #__DNA__FIELD__disk_cache_timestamp
	 */
	
	public long getDisk_cache_timestamp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt64(__io__address + 3208);
		} else {
			return __io__block.readInt64(__io__address + 3160);
		}
	}

	/**
	 * Set method for struct member 'disk_cache_timestamp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Must be initialized only by seq_cache_create() </p>
	 * @see #__DNA__FIELD__disk_cache_timestamp
	 */
	
	public void setDisk_cache_timestamp(long disk_cache_timestamp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt64(__io__address + 3208, disk_cache_timestamp);
		} else {
			__io__block.writeInt64(__io__address + 3160, disk_cache_timestamp);
		}
	}

	/**
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public EditingRuntime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new EditingRuntime(__io__address + 3216, __io__block, __io__blockTable);
		} else {
			return new EditingRuntime(__io__address + 3168, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(EditingRuntime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 3216;
		} else {
			__dna__offset = 3168;
		}
		if (__io__equals(runtime, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, runtime)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, runtime);
		} else {
			__io__generic__copy( getRuntime(), runtime);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CPointer<Object> get_pad1() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 3224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 3172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member '_pad1'.
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CPointer<Object> _pad1) throws IOException
	{
		long __address = ((_pad1 == null) ? 0 : _pad1.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 3224, __address);
		} else {
			__io__block.writeLong(__io__address + 3172, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Editing> __io__addressof() {
		return new CPointer<Editing>(__io__address, new Class[]{Editing.class}, __io__block, __io__blockTable);
	}

}
