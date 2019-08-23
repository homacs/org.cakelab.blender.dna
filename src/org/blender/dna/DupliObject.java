package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'DupliObject'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=208, size64=224)
public class DupliObject extends CFacade {

	/**
	 * This is the sdna index of the struct DupliObject.
	 * <p>
	 * It is required when allocating a new block to store data for DupliObject.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 136;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DupliObject dupliobject = ...;
	 * CPointer&lt;Object&gt; p = dupliobject.__dna__addressof(DupliObject.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;DupliObject&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, DupliObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'DupliObject*'</li>
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
	 * DupliObject dupliobject = ...;
	 * CPointer&lt;Object&gt; p = dupliobject.__dna__addressof(DupliObject.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;DupliObject&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, DupliObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'DupliObject*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'ob'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DupliObject dupliobject = ...;
	 * CPointer&lt;Object&gt; p = dupliobject.__dna__addressof(DupliObject.__DNA__FIELD__ob);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_ob = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ob'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ob = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'origlay'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DupliObject dupliobject = ...;
	 * CPointer&lt;Object&gt; p = dupliobject.__dna__addressof(DupliObject.__DNA__FIELD__origlay);
	 * CPointer&lt;Integer&gt; p_origlay = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'origlay'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__origlay = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DupliObject dupliobject = ...;
	 * CPointer&lt;Object&gt; p = dupliobject.__dna__addressof(DupliObject.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{16, 28};

	/**
	 * Field descriptor (offset) for struct member 'mat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DupliObject dupliobject = ...;
	 * CPointer&lt;Object&gt; p = dupliobject.__dna__addressof(DupliObject.__DNA__FIELD__mat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_mat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mat = new long[]{20, 32};

	/**
	 * Field descriptor (offset) for struct member 'omat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DupliObject dupliobject = ...;
	 * CPointer&lt;Object&gt; p = dupliobject.__dna__addressof(DupliObject.__DNA__FIELD__omat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_omat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'omat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__omat = new long[]{84, 96};

	/**
	 * Field descriptor (offset) for struct member 'orco'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Generated coordinates in parent object space
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DupliObject dupliobject = ...;
	 * CPointer&lt;Object&gt; p = dupliobject.__dna__addressof(DupliObject.__DNA__FIELD__orco);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_orco = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orco'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orco = new long[]{148, 160};

	/**
	 * Field descriptor (offset) for struct member 'uv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    UV coordinates in parent object space
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DupliObject dupliobject = ...;
	 * CPointer&lt;Object&gt; p = dupliobject.__dna__addressof(DupliObject.__DNA__FIELD__uv);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_uv = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uv'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uv = new long[]{160, 172};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Duplicator type that generated this dupli object
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DupliObject dupliobject = ...;
	 * CPointer&lt;Object&gt; p = dupliobject.__dna__addressof(DupliObject.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{168, 180};

	/**
	 * Field descriptor (offset) for struct member 'no_draw'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DupliObject dupliobject = ...;
	 * CPointer&lt;Object&gt; p = dupliobject.__dna__addressof(DupliObject.__DNA__FIELD__no_draw);
	 * CPointer&lt;Byte&gt; p_no_draw = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'no_draw'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__no_draw = new long[]{170, 182};

	/**
	 * Field descriptor (offset) for struct member 'animated'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DupliObject dupliobject = ...;
	 * CPointer&lt;Object&gt; p = dupliobject.__dna__addressof(DupliObject.__DNA__FIELD__animated);
	 * CPointer&lt;Byte&gt; p_animated = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'animated'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__animated = new long[]{171, 183};

	/**
	 * Field descriptor (offset) for struct member 'persistent_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Persistent identifier for inter-frame matching of objects with motion blur
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DupliObject dupliobject = ...;
	 * CPointer&lt;Object&gt; p = dupliobject.__dna__addressof(DupliObject.__DNA__FIELD__persistent_id);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_persistent_id = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'persistent_id'</li>
	 * <li>Signature: 'int[8]'</li>
	 * <li>Actual Size (32bit/64bit): 32/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__persistent_id = new long[]{172, 184};

	/**
	 * Field descriptor (offset) for struct member 'particle_system'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Particle system that this dupli object was instanced from
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * DupliObject dupliobject = ...;
	 * CPointer&lt;Object&gt; p = dupliobject.__dna__addressof(DupliObject.__DNA__FIELD__particle_system);
	 * CPointer&lt;CPointer&lt;ParticleSystem&gt;&gt; p_particle_system = p.cast(new Class[]{CPointer.class, ParticleSystem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_system'</li>
	 * <li>Signature: 'ParticleSystem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_system = new long[]{204, 216};

	public DupliObject(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected DupliObject(DupliObject that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<DupliObject> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{DupliObject.class};
		return new CPointer<DupliObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, DupliObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<DupliObject> next) throws IOException
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
	
	public CPointer<DupliObject> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{DupliObject.class};
		return new CPointer<DupliObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, DupliObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<DupliObject> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'ob'.
	 * @see #__DNA__FIELD__ob
	 */
	
	public CPointer<BlenderObject> getOb() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ob'.
	 * @see #__DNA__FIELD__ob
	 */
	
	public void setOb(CPointer<BlenderObject> ob) throws IOException
	{
		long __address = ((ob == null) ? 0 : ob.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'origlay'.
	 * @see #__DNA__FIELD__origlay
	 */
	
	public int getOriglay() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'origlay'.
	 * @see #__DNA__FIELD__origlay
	 */
	
	public void setOriglay(int origlay) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, origlay);
		} else {
			__io__block.writeInt(__io__address + 12, origlay);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, pad);
		} else {
			__io__block.writeInt(__io__address + 16, pad);
		}
	}

	/**
	 * Get method for struct member 'mat'.
	 * @see #__DNA__FIELD__mat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getMat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 32, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mat'.
	 * @see #__DNA__FIELD__mat
	 */
	
	public void setMat(CArrayFacade<CArrayFacade<Float>> mat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(mat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mat);
		} else {
			__io__generic__copy( getMat(), mat);
		}
	}

	/**
	 * Get method for struct member 'omat'.
	 * @see #__DNA__FIELD__omat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getOmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 96, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 84, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'omat'.
	 * @see #__DNA__FIELD__omat
	 */
	
	public void setOmat(CArrayFacade<CArrayFacade<Float>> omat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 84;
		}
		if (__io__equals(omat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, omat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, omat);
		} else {
			__io__generic__copy( getOmat(), omat);
		}
	}

	/**
	 * Get method for struct member 'orco'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Generated coordinates in parent object space
	 * @see #__DNA__FIELD__orco
	 */
	
	public CArrayFacade<Float> getOrco() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'orco'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Generated coordinates in parent object space
	 * @see #__DNA__FIELD__orco
	 */
	
	public void setOrco(CArrayFacade<Float> orco) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 148;
		}
		if (__io__equals(orco, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, orco)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, orco);
		} else {
			__io__generic__copy( getOrco(), orco);
		}
	}

	/**
	 * Get method for struct member 'uv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    UV coordinates in parent object space
	 * @see #__DNA__FIELD__uv
	 */
	
	public CArrayFacade<Float> getUv() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uv'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    UV coordinates in parent object space
	 * @see #__DNA__FIELD__uv
	 */
	
	public void setUv(CArrayFacade<Float> uv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 172;
		} else {
			__dna__offset = 160;
		}
		if (__io__equals(uv, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uv)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uv);
		} else {
			__io__generic__copy( getUv(), uv);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Duplicator type that generated this dupli object
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 180);
		} else {
			return __io__block.readShort(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Duplicator type that generated this dupli object
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 180, type);
		} else {
			__io__block.writeShort(__io__address + 168, type);
		}
	}

	/**
	 * Get method for struct member 'no_draw'.
	 * @see #__DNA__FIELD__no_draw
	 */
	
	public byte getNo_draw() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 182);
		} else {
			return __io__block.readByte(__io__address + 170);
		}
	}

	/**
	 * Set method for struct member 'no_draw'.
	 * @see #__DNA__FIELD__no_draw
	 */
	
	public void setNo_draw(byte no_draw) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 182, no_draw);
		} else {
			__io__block.writeByte(__io__address + 170, no_draw);
		}
	}

	/**
	 * Get method for struct member 'animated'.
	 * @see #__DNA__FIELD__animated
	 */
	
	public byte getAnimated() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 183);
		} else {
			return __io__block.readByte(__io__address + 171);
		}
	}

	/**
	 * Set method for struct member 'animated'.
	 * @see #__DNA__FIELD__animated
	 */
	
	public void setAnimated(byte animated) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 183, animated);
		} else {
			__io__block.writeByte(__io__address + 171, animated);
		}
	}

	/**
	 * Get method for struct member 'persistent_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Persistent identifier for inter-frame matching of objects with motion blur
	 * @see #__DNA__FIELD__persistent_id
	 */
	
	public CArrayFacade<Integer> getPersistent_id() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'persistent_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Persistent identifier for inter-frame matching of objects with motion blur
	 * @see #__DNA__FIELD__persistent_id
	 */
	
	public void setPersistent_id(CArrayFacade<Integer> persistent_id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 172;
		}
		if (__io__equals(persistent_id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, persistent_id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, persistent_id);
		} else {
			__io__generic__copy( getPersistent_id(), persistent_id);
		}
	}

	/**
	 * Get method for struct member 'particle_system'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Particle system that this dupli object was instanced from
	 * @see #__DNA__FIELD__particle_system
	 */
	
	public CPointer<ParticleSystem> getParticle_system() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 204);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ParticleSystem.class};
		return new CPointer<ParticleSystem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ParticleSystem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'particle_system'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Particle system that this dupli object was instanced from
	 * @see #__DNA__FIELD__particle_system
	 */
	
	public void setParticle_system(CPointer<ParticleSystem> particle_system) throws IOException
	{
		long __address = ((particle_system == null) ? 0 : particle_system.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 204, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<DupliObject> __io__addressof() {
		return new CPointer<DupliObject>(__io__address, new Class[]{DupliObject.class}, __io__block, __io__blockTable);
	}

}
