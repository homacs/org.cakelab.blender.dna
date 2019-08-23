package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ColorManagedViewSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=152, size64=160)
public class ColorManagedViewSettings extends CFacade {

	/**
	 * This is the sdna index of the struct ColorManagedViewSettings.
	 * <p>
	 * It is required when allocating a new block to store data for ColorManagedViewSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 464;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorManagedViewSettings colormanagedviewsettings = ...;
	 * CPointer&lt;Object&gt; p = colormanagedviewsettings.__dna__addressof(ColorManagedViewSettings.__DNA__FIELD__flag);
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
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorManagedViewSettings colormanagedviewsettings = ...;
	 * CPointer&lt;Object&gt; p = colormanagedviewsettings.__dna__addressof(ColorManagedViewSettings.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'look'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Additional transform applied before view transform for an artistic needs<h4>Blender Source Code:</h4>
	 * <p> look which is being applied when displaying buffer on the screen (prior to view transform) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorManagedViewSettings colormanagedviewsettings = ...;
	 * CPointer&lt;Object&gt; p = colormanagedviewsettings.__dna__addressof(ColorManagedViewSettings.__DNA__FIELD__look);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_look = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'look'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__look = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'view_transform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * View used when converting image to a display space<h4>Blender Source Code:</h4>
	 * <p> view transform which is being applied when displaying buffer on the screen </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorManagedViewSettings colormanagedviewsettings = ...;
	 * CPointer&lt;Object&gt; p = colormanagedviewsettings.__dna__addressof(ColorManagedViewSettings.__DNA__FIELD__view_transform);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_view_transform = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'view_transform'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__view_transform = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'exposure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Exposure (stops) applied before display transform<h4>Blender Source Code:</h4>
	 * <p> fstop exposure </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorManagedViewSettings colormanagedviewsettings = ...;
	 * CPointer&lt;Object&gt; p = colormanagedviewsettings.__dna__addressof(ColorManagedViewSettings.__DNA__FIELD__exposure);
	 * CPointer&lt;Float&gt; p_exposure = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'exposure'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__exposure = new long[]{136, 136};

	/**
	 * Field descriptor (offset) for struct member 'gamma'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of gamma modification applied after display transform<h4>Blender Source Code:</h4>
	 * <p> post-display gamma transform </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorManagedViewSettings colormanagedviewsettings = ...;
	 * CPointer&lt;Object&gt; p = colormanagedviewsettings.__dna__addressof(ColorManagedViewSettings.__DNA__FIELD__gamma);
	 * CPointer&lt;Float&gt; p_gamma = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gamma'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gamma = new long[]{140, 140};

	/**
	 * Field descriptor (offset) for struct member 'curve_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Color curve mapping applied before display transform<h4>Blender Source Code:</h4>
	 * <p> pre-display RGB curves transform </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorManagedViewSettings colormanagedviewsettings = ...;
	 * CPointer&lt;Object&gt; p = colormanagedviewsettings.__dna__addressof(ColorManagedViewSettings.__DNA__FIELD__curve_mapping);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_curve_mapping = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve_mapping'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve_mapping = new long[]{144, 144};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorManagedViewSettings colormanagedviewsettings = ...;
	 * CPointer&lt;Object&gt; p = colormanagedviewsettings.__dna__addressof(ColorManagedViewSettings.__DNA__FIELD__pad2);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_pad2 = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{148, 152};

	public ColorManagedViewSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ColorManagedViewSettings(ColorManagedViewSettings that) {
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
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, pad);
		} else {
			__io__block.writeInt(__io__address + 4, pad);
		}
	}

	/**
	 * Get method for struct member 'look'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Additional transform applied before view transform for an artistic needs<h4>Blender Source Code:</h4>
	 * <p> look which is being applied when displaying buffer on the screen (prior to view transform) </p>
	 * @see #__DNA__FIELD__look
	 */
	
	public CArrayFacade<Byte> getLook() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'look'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Additional transform applied before view transform for an artistic needs<h4>Blender Source Code:</h4>
	 * <p> look which is being applied when displaying buffer on the screen (prior to view transform) </p>
	 * @see #__DNA__FIELD__look
	 */
	
	public void setLook(CArrayFacade<Byte> look) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(look, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, look)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, look);
		} else {
			__io__generic__copy( getLook(), look);
		}
	}

	/**
	 * Get method for struct member 'view_transform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * View used when converting image to a display space<h4>Blender Source Code:</h4>
	 * <p> view transform which is being applied when displaying buffer on the screen </p>
	 * @see #__DNA__FIELD__view_transform
	 */
	
	public CArrayFacade<Byte> getView_transform() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'view_transform'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * View used when converting image to a display space<h4>Blender Source Code:</h4>
	 * <p> view transform which is being applied when displaying buffer on the screen </p>
	 * @see #__DNA__FIELD__view_transform
	 */
	
	public void setView_transform(CArrayFacade<Byte> view_transform) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(view_transform, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, view_transform)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, view_transform);
		} else {
			__io__generic__copy( getView_transform(), view_transform);
		}
	}

	/**
	 * Get method for struct member 'exposure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Exposure (stops) applied before display transform<h4>Blender Source Code:</h4>
	 * <p> fstop exposure </p>
	 * @see #__DNA__FIELD__exposure
	 */
	
	public float getExposure() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 136);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'exposure'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Exposure (stops) applied before display transform<h4>Blender Source Code:</h4>
	 * <p> fstop exposure </p>
	 * @see #__DNA__FIELD__exposure
	 */
	
	public void setExposure(float exposure) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 136, exposure);
		} else {
			__io__block.writeFloat(__io__address + 136, exposure);
		}
	}

	/**
	 * Get method for struct member 'gamma'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of gamma modification applied after display transform<h4>Blender Source Code:</h4>
	 * <p> post-display gamma transform </p>
	 * @see #__DNA__FIELD__gamma
	 */
	
	public float getGamma() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'gamma'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of gamma modification applied after display transform<h4>Blender Source Code:</h4>
	 * <p> post-display gamma transform </p>
	 * @see #__DNA__FIELD__gamma
	 */
	
	public void setGamma(float gamma) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, gamma);
		} else {
			__io__block.writeFloat(__io__address + 140, gamma);
		}
	}

	/**
	 * Get method for struct member 'curve_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Color curve mapping applied before display transform<h4>Blender Source Code:</h4>
	 * <p> pre-display RGB curves transform </p>
	 * @see #__DNA__FIELD__curve_mapping
	 */
	
	public CPointer<CurveMapping> getCurve_mapping() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curve_mapping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Color curve mapping applied before display transform<h4>Blender Source Code:</h4>
	 * <p> pre-display RGB curves transform </p>
	 * @see #__DNA__FIELD__curve_mapping
	 */
	
	public void setCurve_mapping(CPointer<CurveMapping> curve_mapping) throws IOException
	{
		long __address = ((curve_mapping == null) ? 0 : curve_mapping.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 144, __address);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public CPointer<Object> getPad2() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(CPointer<Object> pad2) throws IOException
	{
		long __address = ((pad2 == null) ? 0 : pad2.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 148, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ColorManagedViewSettings> __io__addressof() {
		return new CPointer<ColorManagedViewSettings>(__io__address, new Class[]{ColorManagedViewSettings.class}, __io__block, __io__blockTable);
	}

}
