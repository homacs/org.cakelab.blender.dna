package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'wmXrData'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p> #ifdef WITH_XR_OPENXR </p>
 */

@CMetaData(size32=920, size64=936)
public class wmXrData extends CFacade {

	/**
	 * This is the sdna index of the struct wmXrData.
	 * <p>
	 * It is required when allocating a new block to store data for wmXrData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 528;

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime information for managing Blender specific behaviors. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmXrData wmxrdata = ...;
	 * CPointer&lt;Object&gt; p = wmxrdata.__dna__addressof(wmXrData.__DNA__FIELD__runtime);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_runtime = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'wmXrRuntimeData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'session_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Permanent session settings (draw mode, feature toggles, etc). Stored in files and accessible even before the session runs. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmXrData wmxrdata = ...;
	 * CPointer&lt;Object&gt; p = wmxrdata.__dna__addressof(wmXrData.__DNA__FIELD__session_settings);
	 * CPointer&lt;XrSessionSettings&gt; p_session_settings = p.cast(new Class[]{XrSessionSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'session_settings'</li>
	 * <li>Signature: 'XrSessionSettings'</li>
	 * <li>Actual Size (32bit/64bit): 916/928</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__session_settings = new long[]{4, 8};

	public wmXrData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected wmXrData(wmXrData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime information for managing Blender specific behaviors. </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public CPointer<Object> getRuntime() throws IOException
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
	 * Set method for struct member 'runtime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Runtime information for managing Blender specific behaviors. </p>
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(CPointer<Object> runtime) throws IOException
	{
		long __address = ((runtime == null) ? 0 : runtime.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'session_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Permanent session settings (draw mode, feature toggles, etc). Stored in files and accessible even before the session runs. </p>
	 * @see #__DNA__FIELD__session_settings
	 */
	
	public XrSessionSettings getSession_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new XrSessionSettings(__io__address + 8, __io__block, __io__blockTable);
		} else {
			return new XrSessionSettings(__io__address + 4, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'session_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Permanent session settings (draw mode, feature toggles, etc). Stored in files and accessible even before the session runs. </p>
	 * @see #__DNA__FIELD__session_settings
	 */
	
	public void setSession_settings(XrSessionSettings session_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(session_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, session_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, session_settings);
		} else {
			__io__generic__copy( getSession_settings(), session_settings);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<wmXrData> __io__addressof() {
		return new CPointer<wmXrData>(__io__address, new Class[]{wmXrData.class}, __io__block, __io__blockTable);
	}

}
