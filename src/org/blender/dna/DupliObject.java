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
 * <h4>Blender Source Code:</h4>
 * <p> runtime only, but include here for rna access </p>
 */

@CMetaData(size32=168, size64=184)
public class DupliObject extends CFacade {

	/**
	 * This is the sdna index of the struct DupliObject.
	 * <p>
	 * It is required when allocating a new block to store data for DupliObject.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 152;

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
	public static final long[] __DNA__FIELD__mat = new long[]{12, 24};

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
	public static final long[] __DNA__FIELD__orco = new long[]{76, 88};

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
	public static final long[] __DNA__FIELD__uv = new long[]{88, 100};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Duplicator type that generated this dupli object<h4>Blender Source Code:</h4>
	 * <p> from Object.transflag </p>
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
	public static final long[] __DNA__FIELD__type = new long[]{96, 108};

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
	public static final long[] __DNA__FIELD__no_draw = new long[]{98, 110};

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
	public static final long[] __DNA__FIELD__animated = new long[]{99, 111};

	/**
	 * Field descriptor (offset) for struct member 'persistent_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Persistent identifier for inter-frame matching of objects with motion blur<h4>Blender Source Code:</h4>
	 * <p> persistent identifier for a dupli object, for inter-frame matching of objects with motion blur, or inter-update matching for syncing 2*MAX_DUPLI_RECUR </p>
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
	 * <li>Signature: 'int[16]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__persistent_id = new long[]{100, 112};

	/**
	 * Field descriptor (offset) for struct member 'particle_system'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Particle system that this dupli object was instanced from<h4>Blender Source Code:</h4>
	 * <p> particle this dupli was generated from </p>
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
	public static final long[] __DNA__FIELD__particle_system = new long[]{164, 176};

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
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 24;
		} else {
			__dna__offset = 12;
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
			return new CArrayFacade<Float>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 88;
		} else {
			__dna__offset = 76;
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
			return new CArrayFacade<Float>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 100;
		} else {
			__dna__offset = 88;
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
	 * (read-only)    Duplicator type that generated this dupli object<h4>Blender Source Code:</h4>
	 * <p> from Object.transflag </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 108);
		} else {
			return __io__block.readShort(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Duplicator type that generated this dupli object<h4>Blender Source Code:</h4>
	 * <p> from Object.transflag </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 108, type);
		} else {
			__io__block.writeShort(__io__address + 96, type);
		}
	}

	/**
	 * Get method for struct member 'no_draw'.
	 * @see #__DNA__FIELD__no_draw
	 */
	
	public byte getNo_draw() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 110);
		} else {
			return __io__block.readByte(__io__address + 98);
		}
	}

	/**
	 * Set method for struct member 'no_draw'.
	 * @see #__DNA__FIELD__no_draw
	 */
	
	public void setNo_draw(byte no_draw) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 110, no_draw);
		} else {
			__io__block.writeByte(__io__address + 98, no_draw);
		}
	}

	/**
	 * Get method for struct member 'animated'.
	 * @see #__DNA__FIELD__animated
	 */
	
	public byte getAnimated() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 111);
		} else {
			return __io__block.readByte(__io__address + 99);
		}
	}

	/**
	 * Set method for struct member 'animated'.
	 * @see #__DNA__FIELD__animated
	 */
	
	public void setAnimated(byte animated) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 111, animated);
		} else {
			__io__block.writeByte(__io__address + 99, animated);
		}
	}

	/**
	 * Get method for struct member 'persistent_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Persistent identifier for inter-frame matching of objects with motion blur<h4>Blender Source Code:</h4>
	 * <p> persistent identifier for a dupli object, for inter-frame matching of objects with motion blur, or inter-update matching for syncing 2*MAX_DUPLI_RECUR </p>
	 * @see #__DNA__FIELD__persistent_id
	 */
	
	public CArrayFacade<Integer> getPersistent_id() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			16
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'persistent_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Persistent identifier for inter-frame matching of objects with motion blur<h4>Blender Source Code:</h4>
	 * <p> persistent identifier for a dupli object, for inter-frame matching of objects with motion blur, or inter-update matching for syncing 2*MAX_DUPLI_RECUR </p>
	 * @see #__DNA__FIELD__persistent_id
	 */
	
	public void setPersistent_id(CArrayFacade<Integer> persistent_id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 112;
		} else {
			__dna__offset = 100;
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
	 * (read-only)    Particle system that this dupli object was instanced from<h4>Blender Source Code:</h4>
	 * <p> particle this dupli was generated from </p>
	 * @see #__DNA__FIELD__particle_system
	 */
	
	public CPointer<ParticleSystem> getParticle_system() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 164);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ParticleSystem.class};
		return new CPointer<ParticleSystem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ParticleSystem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'particle_system'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Particle system that this dupli object was instanced from<h4>Blender Source Code:</h4>
	 * <p> particle this dupli was generated from </p>
	 * @see #__DNA__FIELD__particle_system
	 */
	
	public void setParticle_system(CPointer<ParticleSystem> particle_system) throws IOException
	{
		long __address = ((particle_system == null) ? 0 : particle_system.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 164, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<DupliObject> __io__addressof() {
		return new CPointer<DupliObject>(__io__address, new Class[]{DupliObject.class}, __io__block, __io__blockTable);
	}

}
