package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Strip'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=876, size64=904)
public class Strip extends CFacade {

	/**
	 * This is the sdna index of the struct Strip.
	 * <p>
	 * It is required when allocating a new block to store data for Strip.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 271;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Strip strip = ...;
	 * CPointer&lt;Object&gt; p = strip.__dna__addressof(Strip.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;Strip&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, Strip.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'Strip*'</li>
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
	 * Strip strip = ...;
	 * CPointer&lt;Object&gt; p = strip.__dna__addressof(Strip.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;Strip&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, Strip.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'Strip*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'us'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Strip strip = ...;
	 * CPointer&lt;Object&gt; p = strip.__dna__addressof(Strip.__DNA__FIELD__us);
	 * CPointer&lt;Integer&gt; p_us = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'us'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__us = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'done'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Strip strip = ...;
	 * CPointer&lt;Object&gt; p = strip.__dna__addressof(Strip.__DNA__FIELD__done);
	 * CPointer&lt;Integer&gt; p_done = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'done'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__done = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'startstill'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Strip strip = ...;
	 * CPointer&lt;Object&gt; p = strip.__dna__addressof(Strip.__DNA__FIELD__startstill);
	 * CPointer&lt;Integer&gt; p_startstill = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'startstill'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__startstill = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'endstill'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Strip strip = ...;
	 * CPointer&lt;Object&gt; p = strip.__dna__addressof(Strip.__DNA__FIELD__endstill);
	 * CPointer&lt;Integer&gt; p_endstill = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'endstill'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__endstill = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'stripdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> only used as an array in IMAGE sequences(!), and as a 1-element array in MOVIE sequences, NULL for all other strip-types </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Strip strip = ...;
	 * CPointer&lt;Object&gt; p = strip.__dna__addressof(Strip.__DNA__FIELD__stripdata);
	 * CPointer&lt;CPointer&lt;StripElem&gt;&gt; p_stripdata = p.cast(new Class[]{CPointer.class, StripElem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stripdata'</li>
	 * <li>Signature: 'StripElem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stripdata = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'dir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Strip strip = ...;
	 * CPointer&lt;Object&gt; p = strip.__dna__addressof(Strip.__DNA__FIELD__dir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_dir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dir'</li>
	 * <li>Signature: 'char[768]'</li>
	 * <li>Actual Size (32bit/64bit): 768/768</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dir = new long[]{28, 40};

	/**
	 * Field descriptor (offset) for struct member 'proxy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Strip strip = ...;
	 * CPointer&lt;Object&gt; p = strip.__dna__addressof(Strip.__DNA__FIELD__proxy);
	 * CPointer&lt;CPointer&lt;StripProxy&gt;&gt; p_proxy = p.cast(new Class[]{CPointer.class, StripProxy.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'proxy'</li>
	 * <li>Signature: 'StripProxy*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__proxy = new long[]{796, 808};

	/**
	 * Field descriptor (offset) for struct member 'crop'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Strip strip = ...;
	 * CPointer&lt;Object&gt; p = strip.__dna__addressof(Strip.__DNA__FIELD__crop);
	 * CPointer&lt;CPointer&lt;StripCrop&gt;&gt; p_crop = p.cast(new Class[]{CPointer.class, StripCrop.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'crop'</li>
	 * <li>Signature: 'StripCrop*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__crop = new long[]{800, 816};

	/**
	 * Field descriptor (offset) for struct member 'transform'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Strip strip = ...;
	 * CPointer&lt;Object&gt; p = strip.__dna__addressof(Strip.__DNA__FIELD__transform);
	 * CPointer&lt;CPointer&lt;StripTransform&gt;&gt; p_transform = p.cast(new Class[]{CPointer.class, StripTransform.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transform'</li>
	 * <li>Signature: 'StripTransform*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transform = new long[]{804, 824};

	/**
	 * Field descriptor (offset) for struct member 'color_balance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Strip strip = ...;
	 * CPointer&lt;Object&gt; p = strip.__dna__addressof(Strip.__DNA__FIELD__color_balance);
	 * CPointer&lt;CPointer&lt;StripColorBalance&gt;&gt; p_color_balance = p.cast(new Class[]{CPointer.class, StripColorBalance.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_balance'</li>
	 * <li>Signature: 'StripColorBalance*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_balance = new long[]{808, 832};

	/**
	 * Field descriptor (offset) for struct member 'colorspace_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> color management </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Strip strip = ...;
	 * CPointer&lt;Object&gt; p = strip.__dna__addressof(Strip.__DNA__FIELD__colorspace_settings);
	 * CPointer&lt;ColorManagedColorspaceSettings&gt; p_colorspace_settings = p.cast(new Class[]{ColorManagedColorspaceSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colorspace_settings'</li>
	 * <li>Signature: 'ColorManagedColorspaceSettings'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colorspace_settings = new long[]{812, 840};

	public Strip(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Strip(Strip that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<Strip> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Strip.class};
		return new CPointer<Strip>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Strip.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<Strip> next) throws IOException
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
	
	public CPointer<Strip> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Strip.class};
		return new CPointer<Strip>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Strip.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<Strip> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'us'.
	 * @see #__DNA__FIELD__us
	 */
	
	public int getUs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'us'.
	 * @see #__DNA__FIELD__us
	 */
	
	public void setUs(int us) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, us);
		} else {
			__io__block.writeInt(__io__address + 8, us);
		}
	}

	/**
	 * Get method for struct member 'done'.
	 * @see #__DNA__FIELD__done
	 */
	
	public int getDone() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'done'.
	 * @see #__DNA__FIELD__done
	 */
	
	public void setDone(int done) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, done);
		} else {
			__io__block.writeInt(__io__address + 12, done);
		}
	}

	/**
	 * Get method for struct member 'startstill'.
	 * @see #__DNA__FIELD__startstill
	 */
	
	public int getStartstill() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'startstill'.
	 * @see #__DNA__FIELD__startstill
	 */
	
	public void setStartstill(int startstill) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, startstill);
		} else {
			__io__block.writeInt(__io__address + 16, startstill);
		}
	}

	/**
	 * Get method for struct member 'endstill'.
	 * @see #__DNA__FIELD__endstill
	 */
	
	public int getEndstill() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'endstill'.
	 * @see #__DNA__FIELD__endstill
	 */
	
	public void setEndstill(int endstill) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, endstill);
		} else {
			__io__block.writeInt(__io__address + 20, endstill);
		}
	}

	/**
	 * Get method for struct member 'stripdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> only used as an array in IMAGE sequences(!), and as a 1-element array in MOVIE sequences, NULL for all other strip-types </p>
	 * @see #__DNA__FIELD__stripdata
	 */
	
	public CPointer<StripElem> getStripdata() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{StripElem.class};
		return new CPointer<StripElem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, StripElem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'stripdata'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> only used as an array in IMAGE sequences(!), and as a 1-element array in MOVIE sequences, NULL for all other strip-types </p>
	 * @see #__DNA__FIELD__stripdata
	 */
	
	public void setStripdata(CPointer<StripElem> stripdata) throws IOException
	{
		long __address = ((stripdata == null) ? 0 : stripdata.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'dir'.
	 * @see #__DNA__FIELD__dir
	 */
	
	public CArrayFacade<Byte> getDir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			768
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dir'.
	 * @see #__DNA__FIELD__dir
	 */
	
	public void setDir(CArrayFacade<Byte> dir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(dir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dir);
		} else {
			__io__generic__copy( getDir(), dir);
		}
	}

	/**
	 * Get method for struct member 'proxy'.
	 * @see #__DNA__FIELD__proxy
	 */
	
	public CPointer<StripProxy> getProxy() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 808);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 796);
		}
		Class<?>[] __dna__targetTypes = new Class[]{StripProxy.class};
		return new CPointer<StripProxy>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, StripProxy.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'proxy'.
	 * @see #__DNA__FIELD__proxy
	 */
	
	public void setProxy(CPointer<StripProxy> proxy) throws IOException
	{
		long __address = ((proxy == null) ? 0 : proxy.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 808, __address);
		} else {
			__io__block.writeLong(__io__address + 796, __address);
		}
	}

	/**
	 * Get method for struct member 'crop'.
	 * @see #__DNA__FIELD__crop
	 */
	
	public CPointer<StripCrop> getCrop() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 816);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 800);
		}
		Class<?>[] __dna__targetTypes = new Class[]{StripCrop.class};
		return new CPointer<StripCrop>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, StripCrop.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'crop'.
	 * @see #__DNA__FIELD__crop
	 */
	
	public void setCrop(CPointer<StripCrop> crop) throws IOException
	{
		long __address = ((crop == null) ? 0 : crop.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 816, __address);
		} else {
			__io__block.writeLong(__io__address + 800, __address);
		}
	}

	/**
	 * Get method for struct member 'transform'.
	 * @see #__DNA__FIELD__transform
	 */
	
	public CPointer<StripTransform> getTransform() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 824);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 804);
		}
		Class<?>[] __dna__targetTypes = new Class[]{StripTransform.class};
		return new CPointer<StripTransform>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, StripTransform.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'transform'.
	 * @see #__DNA__FIELD__transform
	 */
	
	public void setTransform(CPointer<StripTransform> transform) throws IOException
	{
		long __address = ((transform == null) ? 0 : transform.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 824, __address);
		} else {
			__io__block.writeLong(__io__address + 804, __address);
		}
	}

	/**
	 * Get method for struct member 'color_balance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__color_balance
	 */
	
	public CPointer<StripColorBalance> getColor_balance() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 832);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 808);
		}
		Class<?>[] __dna__targetTypes = new Class[]{StripColorBalance.class};
		return new CPointer<StripColorBalance>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, StripColorBalance.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'color_balance'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>
	 * @deprecated
	 *  Deprecated</p>
	 * @see #__DNA__FIELD__color_balance
	 */
	
	public void setColor_balance(CPointer<StripColorBalance> color_balance) throws IOException
	{
		long __address = ((color_balance == null) ? 0 : color_balance.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 832, __address);
		} else {
			__io__block.writeLong(__io__address + 808, __address);
		}
	}

	/**
	 * Get method for struct member 'colorspace_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> color management </p>
	 * @see #__DNA__FIELD__colorspace_settings
	 */
	
	public ColorManagedColorspaceSettings getColorspace_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorManagedColorspaceSettings(__io__address + 840, __io__block, __io__blockTable);
		} else {
			return new ColorManagedColorspaceSettings(__io__address + 812, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'colorspace_settings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> color management </p>
	 * @see #__DNA__FIELD__colorspace_settings
	 */
	
	public void setColorspace_settings(ColorManagedColorspaceSettings colorspace_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 840;
		} else {
			__dna__offset = 812;
		}
		if (__io__equals(colorspace_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, colorspace_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, colorspace_settings);
		} else {
			__io__generic__copy( getColorspace_settings(), colorspace_settings);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Strip> __io__addressof() {
		return new CPointer<Strip>(__io__address, new Class[]{Strip.class}, __io__block, __io__blockTable);
	}

}
