package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MaterialLineArt'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=8, size64=8)
public class MaterialLineArt extends CFacade {

	/**
	 * This is the sdna index of the struct MaterialLineArt.
	 * <p>
	 * It is required when allocating a new block to store data for MaterialLineArt.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 58;

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eMaterialLineArtFlags </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialLineArt materiallineart = ...;
	 * CPointer&lt;Object&gt; p = materiallineart.__dna__addressof(MaterialLineArt.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'transparency_mask'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialLineArt materiallineart = ...;
	 * CPointer&lt;Object&gt; p = materiallineart.__dna__addressof(MaterialLineArt.__DNA__FIELD__transparency_mask);
	 * CPointer&lt;Byte&gt; p_transparency_mask = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'transparency_mask'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__transparency_mask = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'mat_occlusion'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Faces with this material will behave as if it has set number of layers in occlusion<h4>Blender Source Code:</h4>
	 * <p> Maximum 255 levels of equivalent occlusion. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialLineArt materiallineart = ...;
	 * CPointer&lt;Object&gt; p = materiallineart.__dna__addressof(MaterialLineArt.__DNA__FIELD__mat_occlusion);
	 * CPointer&lt;Byte&gt; p_mat_occlusion = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat_occlusion'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat_occlusion = new long[]{5, 5};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MaterialLineArt materiallineart = ...;
	 * CPointer&lt;Object&gt; p = materiallineart.__dna__addressof(MaterialLineArt.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{6, 6};

	public MaterialLineArt(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MaterialLineArt(MaterialLineArt that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eMaterialLineArtFlags </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eMaterialLineArtFlags </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, flags);
		} else {
			__io__block.writeInt(__io__address + 0, flags);
		}
	}

	/**
	 * Get method for struct member 'transparency_mask'.
	 * @see #__DNA__FIELD__transparency_mask
	 */
	
	public byte getTransparency_mask() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 4);
		} else {
			return __io__block.readByte(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'transparency_mask'.
	 * @see #__DNA__FIELD__transparency_mask
	 */
	
	public void setTransparency_mask(byte transparency_mask) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 4, transparency_mask);
		} else {
			__io__block.writeByte(__io__address + 4, transparency_mask);
		}
	}

	/**
	 * Get method for struct member 'mat_occlusion'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Faces with this material will behave as if it has set number of layers in occlusion<h4>Blender Source Code:</h4>
	 * <p> Maximum 255 levels of equivalent occlusion. </p>
	 * @see #__DNA__FIELD__mat_occlusion
	 */
	
	public byte getMat_occlusion() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 5);
		} else {
			return __io__block.readByte(__io__address + 5);
		}
	}

	/**
	 * Set method for struct member 'mat_occlusion'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Faces with this material will behave as if it has set number of layers in occlusion<h4>Blender Source Code:</h4>
	 * <p> Maximum 255 levels of equivalent occlusion. </p>
	 * @see #__DNA__FIELD__mat_occlusion
	 */
	
	public void setMat_occlusion(byte mat_occlusion) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 5, mat_occlusion);
		} else {
			__io__block.writeByte(__io__address + 5, mat_occlusion);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 6, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 6, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 6;
		} else {
			__dna__offset = 6;
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
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MaterialLineArt> __io__addressof() {
		return new CPointer<MaterialLineArt>(__io__address, new Class[]{MaterialLineArt.class}, __io__block, __io__blockTable);
	}

}
