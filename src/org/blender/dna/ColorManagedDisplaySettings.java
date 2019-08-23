package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ColorManagedDisplaySettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=64, size64=64)
public class ColorManagedDisplaySettings extends CFacade {

	/**
	 * This is the sdna index of the struct ColorManagedDisplaySettings.
	 * <p>
	 * It is required when allocating a new block to store data for ColorManagedDisplaySettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 465;

	/**
	 * Field descriptor (offset) for struct member 'display_device'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Display device name
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorManagedDisplaySettings colormanageddisplaysettings = ...;
	 * CPointer&lt;Object&gt; p = colormanageddisplaysettings.__dna__addressof(ColorManagedDisplaySettings.__DNA__FIELD__display_device);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_display_device = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'display_device'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__display_device = new long[]{0, 0};

	public ColorManagedDisplaySettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ColorManagedDisplaySettings(ColorManagedDisplaySettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'display_device'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Display device name
	 * @see #__DNA__FIELD__display_device
	 */
	
	public CArrayFacade<Byte> getDisplay_device() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'display_device'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Display device name
	 * @see #__DNA__FIELD__display_device
	 */
	
	public void setDisplay_device(CArrayFacade<Byte> display_device) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(display_device, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, display_device)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, display_device);
		} else {
			__io__generic__copy( getDisplay_device(), display_device);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ColorManagedDisplaySettings> __io__addressof() {
		return new CPointer<ColorManagedDisplaySettings>(__io__address, new Class[]{ColorManagedDisplaySettings.class}, __io__block, __io__blockTable);
	}

}
