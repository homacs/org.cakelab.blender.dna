package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeGeometryVolumeToMesh'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1, size64=1)
public class NodeGeometryVolumeToMesh extends CFacade {

	/**
	 * This is the sdna index of the struct NodeGeometryVolumeToMesh.
	 * <p>
	 * It is required when allocating a new block to store data for NodeGeometryVolumeToMesh.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 513;

	/**
	 * Field descriptor (offset) for struct member 'resolution_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> VolumeToMeshResolutionMode </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeGeometryVolumeToMesh nodegeometryvolumetomesh = ...;
	 * CPointer&lt;Object&gt; p = nodegeometryvolumetomesh.__dna__addressof(NodeGeometryVolumeToMesh.__DNA__FIELD__resolution_mode);
	 * CPointer&lt;Byte&gt; p_resolution_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'resolution_mode'</li>
	 * <li>Signature: 'uchar'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__resolution_mode = new long[]{0, 0};

	public NodeGeometryVolumeToMesh(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeGeometryVolumeToMesh(NodeGeometryVolumeToMesh that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'resolution_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> VolumeToMeshResolutionMode </p>
	 * @see #__DNA__FIELD__resolution_mode
	 */
	
	public byte getResolution_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 0);
		} else {
			return __io__block.readByte(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'resolution_mode'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> VolumeToMeshResolutionMode </p>
	 * @see #__DNA__FIELD__resolution_mode
	 */
	
	public void setResolution_mode(byte resolution_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 0, resolution_mode);
		} else {
			__io__block.writeByte(__io__address + 0, resolution_mode);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeGeometryVolumeToMesh> __io__addressof() {
		return new CPointer<NodeGeometryVolumeToMesh>(__io__address, new Class[]{NodeGeometryVolumeToMesh.class}, __io__block, __io__blockTable);
	}

}
