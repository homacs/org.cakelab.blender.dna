package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieClipProxy'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=776, size64=776)
public class MovieClipProxy extends CFacade {

	/**
	 * This is the sdna index of the struct MovieClipProxy.
	 * <p>
	 * It is required when allocating a new block to store data for MovieClipProxy.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 549;

	/**
	 * Field descriptor (offset) for struct member 'dir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 768=FILE_MAXDIR custom directory for index and proxy files (defaults to BL_proxy). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipProxy movieclipproxy = ...;
	 * CPointer&lt;Object&gt; p = movieclipproxy.__dna__addressof(MovieClipProxy.__DNA__FIELD__dir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_dir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dir'</li>
	 * <li>Signature: 'char[768]'</li>
	 * <li>Actual Size (32bit/64bit): 768/768</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dir = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'tc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Time code in use. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipProxy movieclipproxy = ...;
	 * CPointer&lt;Object&gt; p = movieclipproxy.__dna__addressof(MovieClipProxy.__DNA__FIELD__tc);
	 * CPointer&lt;Short&gt; p_tc = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tc'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tc = new long[]{768, 768};

	/**
	 * Field descriptor (offset) for struct member 'quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * JPEG quality of proxy images<h4>Blender Source Code:</h4>
	 * <p> Proxy build quality. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipProxy movieclipproxy = ...;
	 * CPointer&lt;Object&gt; p = movieclipproxy.__dna__addressof(MovieClipProxy.__DNA__FIELD__quality);
	 * CPointer&lt;Short&gt; p_quality = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'quality'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__quality = new long[]{770, 770};

	/**
	 * Field descriptor (offset) for struct member 'build_size_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size flags (see below) of all proxies to build. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipProxy movieclipproxy = ...;
	 * CPointer&lt;Object&gt; p = movieclipproxy.__dna__addressof(MovieClipProxy.__DNA__FIELD__build_size_flag);
	 * CPointer&lt;Short&gt; p_build_size_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'build_size_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__build_size_flag = new long[]{772, 772};

	/**
	 * Field descriptor (offset) for struct member 'build_tc_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Time code flags (see below) of all tc indices to build. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieClipProxy movieclipproxy = ...;
	 * CPointer&lt;Object&gt; p = movieclipproxy.__dna__addressof(MovieClipProxy.__DNA__FIELD__build_tc_flag);
	 * CPointer&lt;Short&gt; p_build_tc_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'build_tc_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__build_tc_flag = new long[]{774, 774};

	public MovieClipProxy(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieClipProxy(MovieClipProxy that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'dir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 768=FILE_MAXDIR custom directory for index and proxy files (defaults to BL_proxy). </p>
	 * @see #__DNA__FIELD__dir
	 */
	
	public CArrayFacade<Byte> getDir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			768
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dir'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 768=FILE_MAXDIR custom directory for index and proxy files (defaults to BL_proxy). </p>
	 * @see #__DNA__FIELD__dir
	 */
	
	public void setDir(CArrayFacade<Byte> dir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
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
	 * Get method for struct member 'tc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Time code in use. </p>
	 * @see #__DNA__FIELD__tc
	 */
	
	public short getTc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 768);
		} else {
			return __io__block.readShort(__io__address + 768);
		}
	}

	/**
	 * Set method for struct member 'tc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Time code in use. </p>
	 * @see #__DNA__FIELD__tc
	 */
	
	public void setTc(short tc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 768, tc);
		} else {
			__io__block.writeShort(__io__address + 768, tc);
		}
	}

	/**
	 * Get method for struct member 'quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * JPEG quality of proxy images<h4>Blender Source Code:</h4>
	 * <p> Proxy build quality. </p>
	 * @see #__DNA__FIELD__quality
	 */
	
	public short getQuality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 770);
		} else {
			return __io__block.readShort(__io__address + 770);
		}
	}

	/**
	 * Set method for struct member 'quality'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * JPEG quality of proxy images<h4>Blender Source Code:</h4>
	 * <p> Proxy build quality. </p>
	 * @see #__DNA__FIELD__quality
	 */
	
	public void setQuality(short quality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 770, quality);
		} else {
			__io__block.writeShort(__io__address + 770, quality);
		}
	}

	/**
	 * Get method for struct member 'build_size_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size flags (see below) of all proxies to build. </p>
	 * @see #__DNA__FIELD__build_size_flag
	 */
	
	public short getBuild_size_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 772);
		} else {
			return __io__block.readShort(__io__address + 772);
		}
	}

	/**
	 * Set method for struct member 'build_size_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size flags (see below) of all proxies to build. </p>
	 * @see #__DNA__FIELD__build_size_flag
	 */
	
	public void setBuild_size_flag(short build_size_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 772, build_size_flag);
		} else {
			__io__block.writeShort(__io__address + 772, build_size_flag);
		}
	}

	/**
	 * Get method for struct member 'build_tc_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Time code flags (see below) of all tc indices to build. </p>
	 * @see #__DNA__FIELD__build_tc_flag
	 */
	
	public short getBuild_tc_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 774);
		} else {
			return __io__block.readShort(__io__address + 774);
		}
	}

	/**
	 * Set method for struct member 'build_tc_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Time code flags (see below) of all tc indices to build. </p>
	 * @see #__DNA__FIELD__build_tc_flag
	 */
	
	public void setBuild_tc_flag(short build_tc_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 774, build_tc_flag);
		} else {
			__io__block.writeShort(__io__address + 774, build_tc_flag);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieClipProxy> __io__addressof() {
		return new CPointer<MovieClipProxy>(__io__address, new Class[]{MovieClipProxy.class}, __io__block, __io__blockTable);
	}

}
