package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'QuicktimeCodecData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=144, size64=152)
public class QuicktimeCodecData extends CFacade {

	/**
	 * This is the sdna index of the struct QuicktimeCodecData.
	 * <p>
	 * It is required when allocating a new block to store data for QuicktimeCodecData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 169;

	/**
	 * Field descriptor (offset) for struct member 'cdParms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old quicktime implementation compatibility fields, read only in 2.5 - deprecated codec/compressor options </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecData quicktimecodecdata = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecdata.__dna__addressof(QuicktimeCodecData.__DNA__FIELD__cdParms);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_cdParms = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cdParms'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cdParms = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> padding </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecData quicktimecodecdata = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecdata.__dna__addressof(QuicktimeCodecData.__DNA__FIELD__pad);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_pad = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'cdSize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of cdParms buffer </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecData quicktimecodecdata = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecdata.__dna__addressof(QuicktimeCodecData.__DNA__FIELD__cdSize);
	 * CPointer&lt;Integer&gt; p_cdSize = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cdSize'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cdSize = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> padding </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecData quicktimecodecdata = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecdata.__dna__addressof(QuicktimeCodecData.__DNA__FIELD__pad2);
	 * CPointer&lt;Integer&gt; p_pad2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'qtcodecname'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * QuicktimeCodecData quicktimecodecdata = ...;
	 * CPointer&lt;Object&gt; p = quicktimecodecdata.__dna__addressof(QuicktimeCodecData.__DNA__FIELD__qtcodecname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_qtcodecname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'qtcodecname'</li>
	 * <li>Signature: 'char[128]'</li>
	 * <li>Actual Size (32bit/64bit): 128/128</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__qtcodecname = new long[]{16, 24};

	public QuicktimeCodecData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected QuicktimeCodecData(QuicktimeCodecData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'cdParms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old quicktime implementation compatibility fields, read only in 2.5 - deprecated codec/compressor options </p>
	 * @see #__DNA__FIELD__cdParms
	 */
	
	public CPointer<Object> getCdParms() throws IOException
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
	 * Set method for struct member 'cdParms'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old quicktime implementation compatibility fields, read only in 2.5 - deprecated codec/compressor options </p>
	 * @see #__DNA__FIELD__cdParms
	 */
	
	public void setCdParms(CPointer<Object> cdParms) throws IOException
	{
		long __address = ((cdParms == null) ? 0 : cdParms.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> padding </p>
	 * @see #__DNA__FIELD__pad
	 */
	
	public CPointer<Object> getPad() throws IOException
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
	 * Set method for struct member 'pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> padding </p>
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CPointer<Object> pad) throws IOException
	{
		long __address = ((pad == null) ? 0 : pad.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'cdSize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of cdParms buffer </p>
	 * @see #__DNA__FIELD__cdSize
	 */
	
	public int getCdSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'cdSize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of cdParms buffer </p>
	 * @see #__DNA__FIELD__cdSize
	 */
	
	public void setCdSize(int cdSize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, cdSize);
		} else {
			__io__block.writeInt(__io__address + 8, cdSize);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> padding </p>
	 * @see #__DNA__FIELD__pad2
	 */
	
	public int getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> padding </p>
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(int pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, pad2);
		} else {
			__io__block.writeInt(__io__address + 12, pad2);
		}
	}

	/**
	 * Get method for struct member 'qtcodecname'.
	 * @see #__DNA__FIELD__qtcodecname
	 */
	
	public CArrayFacade<Byte> getQtcodecname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			128
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'qtcodecname'.
	 * @see #__DNA__FIELD__qtcodecname
	 */
	
	public void setQtcodecname(CArrayFacade<Byte> qtcodecname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(qtcodecname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, qtcodecname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, qtcodecname);
		} else {
			__io__generic__copy( getQtcodecname(), qtcodecname);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<QuicktimeCodecData> __io__addressof() {
		return new CPointer<QuicktimeCodecData>(__io__address, new Class[]{QuicktimeCodecData.class}, __io__block, __io__blockTable);
	}

}
