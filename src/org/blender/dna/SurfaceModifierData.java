package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SurfaceModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=124, size64=160)
public class SurfaceModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct SurfaceModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for SurfaceModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 118;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SurfaceModifierData surfacemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = surfacemodifierdata.__dna__addressof(SurfaceModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old position. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SurfaceModifierData surfacemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = surfacemodifierdata.__dna__addressof(SurfaceModifierData.__DNA__FIELD__x);
	 * CPointer&lt;CPointer&lt;MVert&gt;&gt; p_x = p.cast(new Class[]{CPointer.class, MVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'x'</li>
	 * <li>Signature: 'MVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__x = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'v'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Velocity. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SurfaceModifierData surfacemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = surfacemodifierdata.__dna__addressof(SurfaceModifierData.__DNA__FIELD__v);
	 * CPointer&lt;CPointer&lt;MVert&gt;&gt; p_v = p.cast(new Class[]{CPointer.class, MVert.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v'</li>
	 * <li>Signature: 'MVert*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'mesh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SurfaceModifierData surfacemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = surfacemodifierdata.__dna__addressof(SurfaceModifierData.__DNA__FIELD__mesh);
	 * CPointer&lt;CPointer&lt;Mesh&gt;&gt; p_mesh = p.cast(new Class[]{CPointer.class, Mesh.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh'</li>
	 * <li>Signature: 'Mesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'bvhtree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bounding volume hierarchy of the mesh faces. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SurfaceModifierData surfacemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = surfacemodifierdata.__dna__addressof(SurfaceModifierData.__DNA__FIELD__bvhtree);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_bvhtree = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bvhtree'</li>
	 * <li>Signature: 'BVHTreeFromMesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bvhtree = new long[]{112, 144};

	/**
	 * Field descriptor (offset) for struct member 'cfra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SurfaceModifierData surfacemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = surfacemodifierdata.__dna__addressof(SurfaceModifierData.__DNA__FIELD__cfra);
	 * CPointer&lt;Integer&gt; p_cfra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cfra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cfra = new long[]{116, 152};

	/**
	 * Field descriptor (offset) for struct member 'numverts'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SurfaceModifierData surfacemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = surfacemodifierdata.__dna__addressof(SurfaceModifierData.__DNA__FIELD__numverts);
	 * CPointer&lt;Integer&gt; p_numverts = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'numverts'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__numverts = new long[]{120, 156};

	public SurfaceModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SurfaceModifierData(SurfaceModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public ModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(ModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old position. </p>
	 * @see #__DNA__FIELD__x
	 */
	
	public CPointer<MVert> getX() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MVert.class};
		return new CPointer<MVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'x'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Old position. </p>
	 * @see #__DNA__FIELD__x
	 */
	
	public void setX(CPointer<MVert> x) throws IOException
	{
		long __address = ((x == null) ? 0 : x.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'v'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Velocity. </p>
	 * @see #__DNA__FIELD__v
	 */
	
	public CPointer<MVert> getV() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MVert.class};
		return new CPointer<MVert>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MVert.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'v'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Velocity. </p>
	 * @see #__DNA__FIELD__v
	 */
	
	public void setV(CPointer<MVert> v) throws IOException
	{
		long __address = ((v == null) ? 0 : v.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'mesh'.
	 * @see #__DNA__FIELD__mesh
	 */
	
	public CPointer<Mesh> getMesh() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mesh'.
	 * @see #__DNA__FIELD__mesh
	 */
	
	public void setMesh(CPointer<Mesh> mesh) throws IOException
	{
		long __address = ((mesh == null) ? 0 : mesh.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'bvhtree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bounding volume hierarchy of the mesh faces. </p>
	 * @see #__DNA__FIELD__bvhtree
	 */
	
	public CPointer<Object> getBvhtree() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bvhtree'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bounding volume hierarchy of the mesh faces. </p>
	 * @see #__DNA__FIELD__bvhtree
	 */
	
	public void setBvhtree(CPointer<Object> bvhtree) throws IOException
	{
		long __address = ((bvhtree == null) ? 0 : bvhtree.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'cfra'.
	 * @see #__DNA__FIELD__cfra
	 */
	
	public int getCfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 152);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'cfra'.
	 * @see #__DNA__FIELD__cfra
	 */
	
	public void setCfra(int cfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 152, cfra);
		} else {
			__io__block.writeInt(__io__address + 116, cfra);
		}
	}

	/**
	 * Get method for struct member 'numverts'.
	 * @see #__DNA__FIELD__numverts
	 */
	
	public int getNumverts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 156);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'numverts'.
	 * @see #__DNA__FIELD__numverts
	 */
	
	public void setNumverts(int numverts) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 156, numverts);
		} else {
			__io__block.writeInt(__io__address + 120, numverts);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SurfaceModifierData> __io__addressof() {
		return new CPointer<SurfaceModifierData>(__io__address, new Class[]{SurfaceModifierData.class}, __io__block, __io__blockTable);
	}

}
