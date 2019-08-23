package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SequencerScopes'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> ***************** {@link Scopes}  ****************** </p>
 */

@CMetaData(size32=24, size64=48)
public class SequencerScopes extends CFacade {

	/**
	 * This is the sdna index of the struct SequencerScopes.
	 * <p>
	 * It is required when allocating a new block to store data for SequencerScopes.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 299;

	/**
	 * Field descriptor (offset) for struct member 'reference_ibuf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerScopes sequencerscopes = ...;
	 * CPointer&lt;Object&gt; p = sequencerscopes.__dna__addressof(SequencerScopes.__DNA__FIELD__reference_ibuf);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_reference_ibuf = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reference_ibuf'</li>
	 * <li>Signature: 'ImBuf*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reference_ibuf = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'zebra_ibuf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerScopes sequencerscopes = ...;
	 * CPointer&lt;Object&gt; p = sequencerscopes.__dna__addressof(SequencerScopes.__DNA__FIELD__zebra_ibuf);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_zebra_ibuf = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zebra_ibuf'</li>
	 * <li>Signature: 'ImBuf*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zebra_ibuf = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'waveform_ibuf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerScopes sequencerscopes = ...;
	 * CPointer&lt;Object&gt; p = sequencerscopes.__dna__addressof(SequencerScopes.__DNA__FIELD__waveform_ibuf);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_waveform_ibuf = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'waveform_ibuf'</li>
	 * <li>Signature: 'ImBuf*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__waveform_ibuf = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'sep_waveform_ibuf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerScopes sequencerscopes = ...;
	 * CPointer&lt;Object&gt; p = sequencerscopes.__dna__addressof(SequencerScopes.__DNA__FIELD__sep_waveform_ibuf);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_sep_waveform_ibuf = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sep_waveform_ibuf'</li>
	 * <li>Signature: 'ImBuf*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sep_waveform_ibuf = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'vector_ibuf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerScopes sequencerscopes = ...;
	 * CPointer&lt;Object&gt; p = sequencerscopes.__dna__addressof(SequencerScopes.__DNA__FIELD__vector_ibuf);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_vector_ibuf = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vector_ibuf'</li>
	 * <li>Signature: 'ImBuf*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vector_ibuf = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'histogram_ibuf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerScopes sequencerscopes = ...;
	 * CPointer&lt;Object&gt; p = sequencerscopes.__dna__addressof(SequencerScopes.__DNA__FIELD__histogram_ibuf);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_histogram_ibuf = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'histogram_ibuf'</li>
	 * <li>Signature: 'ImBuf*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__histogram_ibuf = new long[]{20, 40};

	public SequencerScopes(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SequencerScopes(SequencerScopes that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'reference_ibuf'.
	 * @see #__DNA__FIELD__reference_ibuf
	 */
	
	public CPointer<Object> getReference_ibuf() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'reference_ibuf'.
	 * @see #__DNA__FIELD__reference_ibuf
	 */
	
	public void setReference_ibuf(CPointer<Object> reference_ibuf) throws IOException
	{
		long __address = ((reference_ibuf == null) ? 0 : reference_ibuf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'zebra_ibuf'.
	 * @see #__DNA__FIELD__zebra_ibuf
	 */
	
	public CPointer<Object> getZebra_ibuf() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'zebra_ibuf'.
	 * @see #__DNA__FIELD__zebra_ibuf
	 */
	
	public void setZebra_ibuf(CPointer<Object> zebra_ibuf) throws IOException
	{
		long __address = ((zebra_ibuf == null) ? 0 : zebra_ibuf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'waveform_ibuf'.
	 * @see #__DNA__FIELD__waveform_ibuf
	 */
	
	public CPointer<Object> getWaveform_ibuf() throws IOException
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
	 * Set method for struct member 'waveform_ibuf'.
	 * @see #__DNA__FIELD__waveform_ibuf
	 */
	
	public void setWaveform_ibuf(CPointer<Object> waveform_ibuf) throws IOException
	{
		long __address = ((waveform_ibuf == null) ? 0 : waveform_ibuf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'sep_waveform_ibuf'.
	 * @see #__DNA__FIELD__sep_waveform_ibuf
	 */
	
	public CPointer<Object> getSep_waveform_ibuf() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sep_waveform_ibuf'.
	 * @see #__DNA__FIELD__sep_waveform_ibuf
	 */
	
	public void setSep_waveform_ibuf(CPointer<Object> sep_waveform_ibuf) throws IOException
	{
		long __address = ((sep_waveform_ibuf == null) ? 0 : sep_waveform_ibuf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'vector_ibuf'.
	 * @see #__DNA__FIELD__vector_ibuf
	 */
	
	public CPointer<Object> getVector_ibuf() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'vector_ibuf'.
	 * @see #__DNA__FIELD__vector_ibuf
	 */
	
	public void setVector_ibuf(CPointer<Object> vector_ibuf) throws IOException
	{
		long __address = ((vector_ibuf == null) ? 0 : vector_ibuf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'histogram_ibuf'.
	 * @see #__DNA__FIELD__histogram_ibuf
	 */
	
	public CPointer<Object> getHistogram_ibuf() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'histogram_ibuf'.
	 * @see #__DNA__FIELD__histogram_ibuf
	 */
	
	public void setHistogram_ibuf(CPointer<Object> histogram_ibuf) throws IOException
	{
		long __address = ((histogram_ibuf == null) ? 0 : histogram_ibuf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SequencerScopes> __io__addressof() {
		return new CPointer<SequencerScopes>(__io__address, new Class[]{SequencerScopes.class}, __io__block, __io__blockTable);
	}

}
