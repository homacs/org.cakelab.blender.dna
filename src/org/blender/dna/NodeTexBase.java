package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeTexBase'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=956, size64=960)
public class NodeTexBase extends CFacade {

	/**
	 * This is the sdna index of the struct NodeTexBase.
	 * <p>
	 * It is required when allocating a new block to store data for NodeTexBase.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 401;

	/**
	 * Field descriptor (offset) for struct member 'tex_mapping'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexBase nodetexbase = ...;
	 * CPointer&lt;Object&gt; p = nodetexbase.__dna__addressof(NodeTexBase.__DNA__FIELD__tex_mapping);
	 * CPointer&lt;TexMapping&gt; p_tex_mapping = p.cast(new Class[]{TexMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_mapping'</li>
	 * <li>Signature: 'TexMapping'</li>
	 * <li>Actual Size (32bit/64bit): 140/144</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_mapping = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'color_mapping'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexBase nodetexbase = ...;
	 * CPointer&lt;Object&gt; p = nodetexbase.__dna__addressof(NodeTexBase.__DNA__FIELD__color_mapping);
	 * CPointer&lt;ColorMapping&gt; p_color_mapping = p.cast(new Class[]{ColorMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_mapping'</li>
	 * <li>Signature: 'ColorMapping'</li>
	 * <li>Actual Size (32bit/64bit): 816/816</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_mapping = new long[]{140, 144};

	public NodeTexBase(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeTexBase(NodeTexBase that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tex_mapping'.
	 * @see #__DNA__FIELD__tex_mapping
	 */
	
	public TexMapping getTex_mapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new TexMapping(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new TexMapping(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tex_mapping'.
	 * @see #__DNA__FIELD__tex_mapping
	 */
	
	public void setTex_mapping(TexMapping tex_mapping) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(tex_mapping, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tex_mapping)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tex_mapping);
		} else {
			__io__generic__copy( getTex_mapping(), tex_mapping);
		}
	}

	/**
	 * Get method for struct member 'color_mapping'.
	 * @see #__DNA__FIELD__color_mapping
	 */
	
	public ColorMapping getColor_mapping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorMapping(__io__address + 144, __io__block, __io__blockTable);
		} else {
			return new ColorMapping(__io__address + 140, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'color_mapping'.
	 * @see #__DNA__FIELD__color_mapping
	 */
	
	public void setColor_mapping(ColorMapping color_mapping) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 144;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(color_mapping, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, color_mapping)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, color_mapping);
		} else {
			__io__generic__copy( getColor_mapping(), color_mapping);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeTexBase> __io__addressof() {
		return new CPointer<NodeTexBase>(__io__address, new Class[]{NodeTexBase.class}, __io__block, __io__blockTable);
	}

}
