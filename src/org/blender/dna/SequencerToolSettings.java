package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SequencerToolSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=4, size64=4)
public class SequencerToolSettings extends CFacade {

	/**
	 * This is the sdna index of the struct SequencerToolSettings.
	 * <p>
	 * It is required when allocating a new block to store data for SequencerToolSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 204;

	/**
	 * Field descriptor (offset) for struct member 'fit_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale fit method<h4>Blender Source Code:</h4>
	 * <p> eSeqImageFitMethod </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SequencerToolSettings sequencertoolsettings = ...;
	 * CPointer&lt;Object&gt; p = sequencertoolsettings.__dna__addressof(SequencerToolSettings.__DNA__FIELD__fit_method);
	 * CPointer&lt;Integer&gt; p_fit_method = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fit_method'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fit_method = new long[]{0, 0};

	public SequencerToolSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SequencerToolSettings(SequencerToolSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'fit_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale fit method<h4>Blender Source Code:</h4>
	 * <p> eSeqImageFitMethod </p>
	 * @see #__DNA__FIELD__fit_method
	 */
	
	public int getFit_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'fit_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale fit method<h4>Blender Source Code:</h4>
	 * <p> eSeqImageFitMethod </p>
	 * @see #__DNA__FIELD__fit_method
	 */
	
	public void setFit_method(int fit_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, fit_method);
		} else {
			__io__block.writeInt(__io__address + 0, fit_method);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SequencerToolSettings> __io__addressof() {
		return new CPointer<SequencerToolSettings>(__io__address, new Class[]{SequencerToolSettings.class}, __io__block, __io__blockTable);
	}

}
