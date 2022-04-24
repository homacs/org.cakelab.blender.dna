package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometrySubdivisionSurface'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=2, size64=2)
public class NodeGeometrySubdivisionSurface extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometrySubdivisionSurface.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometrySubdivisionSurface.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 517;

	/**
	 * Field descriptor (offset) for struct member 'uv_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eSubsurfUVSmooth. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometrySubdivisionSurface nodegeometrysubdivisionsurface = ...;
	 * CPointer&lt;Object&gt; p = nodegeometrysubdivisionsurface.__dna__addressof(NodeGeometrySubdivisionSurface.__DNA__FIELD__uv_smooth);
	 * CPointer&lt;Byte&gt; p_uv_smooth = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv_smooth'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv_smooth = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'boundary_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eSubsurfBoundarySmooth. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometrySubdivisionSurface nodegeometrysubdivisionsurface = ...;
	 * CPointer&lt;Object&gt; p = nodegeometrysubdivisionsurface.__dna__addressof(NodeGeometrySubdivisionSurface.__DNA__FIELD__boundary_smooth);
	 * CPointer&lt;Byte&gt; p_boundary_smooth = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'boundary_smooth'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__boundary_smooth = new long[]{1, 1};

	public NodeGeometrySubdivisionSurface(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometrySubdivisionSurface(NodeGeometrySubdivisionSurface that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'uv_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eSubsurfUVSmooth. </p>
	 * @see #__DNA__FIELD__uv_smooth
	 */
	
	public byte getUv_smooth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'uv_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eSubsurfUVSmooth. </p>
	 * @see #__DNA__FIELD__uv_smooth
	 */
	
	public void setUv_smooth(byte uv_smooth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, uv_smooth);
		} else {
			__io__block.writeByte(__io__address + 0, uv_smooth);
		}
	}

	/**
	 * Get method for struct member 'boundary_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eSubsurfBoundarySmooth. </p>
	 * @see #__DNA__FIELD__boundary_smooth
	 */
	
	public byte getBoundary_smooth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1);
		} else {
			return __io__block.readByte(__io__address + 1);
		}
	}

	/**
	 * Set method for struct member 'boundary_smooth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eSubsurfBoundarySmooth. </p>
	 * @see #__DNA__FIELD__boundary_smooth
	 */
	
	public void setBoundary_smooth(byte boundary_smooth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1, boundary_smooth);
		} else {
			__io__block.writeByte(__io__address + 1, boundary_smooth);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometrySubdivisionSurface> __io__addressof() {
		return new CPointer<NodeGeometrySubdivisionSurface>(__io__address, new Class[]{NodeGeometrySubdivisionSurface.class}, __io__block, __io__blockTable);
	}

}
