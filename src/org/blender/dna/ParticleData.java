package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ParticleData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=188, size64=200)
public class ParticleData extends CFacade {

	/**
	 * This is the sdna index of the struct ParticleData.
	 * <p>
	 * It is required when allocating a new block to store data for ParticleData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 479;

	/**
	 * Field descriptor (offset) for struct member 'state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current global coordinates </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__state);
	 * CPointer&lt;ParticleKey&gt; p_state = p.cast(new Class[]{ParticleKey.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'state'</li>
	 * <li>Signature: 'ParticleKey'</li>
	 * <li>Actual Size (32bit/64bit): 56/56</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__state = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev_state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> previous state </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__prev_state);
	 * CPointer&lt;ParticleKey&gt; p_prev_state = p.cast(new Class[]{ParticleKey.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev_state'</li>
	 * <li>Signature: 'ParticleKey'</li>
	 * <li>Actual Size (32bit/64bit): 56/56</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev_state = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'hair'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> hair vertices </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__hair);
	 * CPointer&lt;CPointer&lt;HairKey&gt;&gt; p_hair = p.cast(new Class[]{CPointer.class, HairKey.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hair'</li>
	 * <li>Signature: 'HairKey*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hair = new long[]{112, 112};

	/**
	 * Field descriptor (offset) for struct member 'keys'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keyed keys </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__keys);
	 * CPointer&lt;CPointer&lt;ParticleKey&gt;&gt; p_keys = p.cast(new Class[]{CPointer.class, ParticleKey.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keys'</li>
	 * <li>Signature: 'ParticleKey*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keys = new long[]{116, 120};

	/**
	 * Field descriptor (offset) for struct member 'boid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> boids data </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__boid);
	 * CPointer&lt;CPointer&lt;BoidParticle&gt;&gt; p_boid = p.cast(new Class[]{CPointer.class, BoidParticle.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'boid'</li>
	 * <li>Signature: 'BoidParticle*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__boid = new long[]{120, 128};

	/**
	 * Field descriptor (offset) for struct member 'totkey'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of hair or keyed keys </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__totkey);
	 * CPointer&lt;Integer&gt; p_totkey = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totkey'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totkey = new long[]{124, 136};

	/**
	 * Field descriptor (offset) for struct member 'time'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__time);
	 * CPointer&lt;Float&gt; p_time = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time = new long[]{128, 140};

	/**
	 * Field descriptor (offset) for struct member 'lifetime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dietime is not nescessarily time+lifetime as </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__lifetime);
	 * CPointer&lt;Float&gt; p_lifetime = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lifetime'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lifetime = new long[]{132, 144};

	/**
	 * Field descriptor (offset) for struct member 'dietime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> particles can die unnaturally (collision) </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__dietime);
	 * CPointer&lt;Float&gt; p_dietime = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dietime'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dietime = new long[]{136, 148};

	/**
	 * Field descriptor (offset) for struct member 'num'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> WARNING! Those two indices, when not affected to vertices, are for !!! TESSELLATED FACES !!!, not POLYGONS! index to vert/edge/face </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__num);
	 * CPointer&lt;Integer&gt; p_num = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'num'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__num = new long[]{140, 152};

	/**
	 * Field descriptor (offset) for struct member 'num_dmcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> index to derived mesh data (face) to avoid slow lookups </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__num_dmcache);
	 * CPointer&lt;Integer&gt; p_num_dmcache = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'num_dmcache'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__num_dmcache = new long[]{144, 156};

	/**
	 * Field descriptor (offset) for struct member 'fuv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__fuv);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_fuv = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fuv'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fuv = new long[]{148, 160};

	/**
	 * Field descriptor (offset) for struct member 'foffset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> coordinates on face/edge number "num" and depth along </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__foffset);
	 * CPointer&lt;Float&gt; p_foffset = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'foffset'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__foffset = new long[]{164, 176};

	/**
	 * Field descriptor (offset) for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> face normal for volume emission size and multiplier so that we can update size when ever </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__size);
	 * CPointer&lt;Float&gt; p_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__size = new long[]{168, 180};

	/**
	 * Field descriptor (offset) for struct member 'sphdensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> density of sph particle </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__sphdensity);
	 * CPointer&lt;Float&gt; p_sphdensity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sphdensity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sphdensity = new long[]{172, 184};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{176, 188};

	/**
	 * Field descriptor (offset) for struct member 'hair_index'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__hair_index);
	 * CPointer&lt;Integer&gt; p_hair_index = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hair_index'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hair_index = new long[]{180, 192};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{184, 196};

	/**
	 * Field descriptor (offset) for struct member 'alive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the life state of a particle </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleData particledata = ...;
	 * CPointer&lt;Object&gt; p = particledata.__dna__addressof(ParticleData.__DNA__FIELD__alive);
	 * CPointer&lt;Short&gt; p_alive = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alive'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alive = new long[]{186, 198};

	public ParticleData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ParticleData(ParticleData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current global coordinates </p>
	 * @see #__DNA__FIELD__state
	 */
	
	public ParticleKey getState() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ParticleKey(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ParticleKey(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> current global coordinates </p>
	 * @see #__DNA__FIELD__state
	 */
	
	public void setState(ParticleKey state) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(state, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, state)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, state);
		} else {
			__io__generic__copy( getState(), state);
		}
	}

	/**
	 * Get method for struct member 'prev_state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> previous state </p>
	 * @see #__DNA__FIELD__prev_state
	 */
	
	public ParticleKey getPrev_state() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ParticleKey(__io__address + 56, __io__block, __io__blockTable);
		} else {
			return new ParticleKey(__io__address + 56, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'prev_state'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> previous state </p>
	 * @see #__DNA__FIELD__prev_state
	 */
	
	public void setPrev_state(ParticleKey prev_state) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 56;
		}
		if (__io__equals(prev_state, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, prev_state)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, prev_state);
		} else {
			__io__generic__copy( getPrev_state(), prev_state);
		}
	}

	/**
	 * Get method for struct member 'hair'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> hair vertices </p>
	 * @see #__DNA__FIELD__hair
	 */
	
	public CPointer<HairKey> getHair() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		}
		Class<?>[] __dna__targetTypes = new Class[]{HairKey.class};
		return new CPointer<HairKey>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, HairKey.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'hair'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> hair vertices </p>
	 * @see #__DNA__FIELD__hair
	 */
	
	public void setHair(CPointer<HairKey> hair) throws IOException
	{
		long __address = ((hair == null) ? 0 : hair.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 112, __address);
		}
	}

	/**
	 * Get method for struct member 'keys'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keyed keys </p>
	 * @see #__DNA__FIELD__keys
	 */
	
	public CPointer<ParticleKey> getKeys() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 116);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ParticleKey.class};
		return new CPointer<ParticleKey>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ParticleKey.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'keys'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> keyed keys </p>
	 * @see #__DNA__FIELD__keys
	 */
	
	public void setKeys(CPointer<ParticleKey> keys) throws IOException
	{
		long __address = ((keys == null) ? 0 : keys.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
		}
	}

	/**
	 * Get method for struct member 'boid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> boids data </p>
	 * @see #__DNA__FIELD__boid
	 */
	
	public CPointer<BoidParticle> getBoid() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BoidParticle.class};
		return new CPointer<BoidParticle>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BoidParticle.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'boid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> boids data </p>
	 * @see #__DNA__FIELD__boid
	 */
	
	public void setBoid(CPointer<BoidParticle> boid) throws IOException
	{
		long __address = ((boid == null) ? 0 : boid.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'totkey'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of hair or keyed keys </p>
	 * @see #__DNA__FIELD__totkey
	 */
	
	public int getTotkey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 124);
		}
	}

	/**
	 * Set method for struct member 'totkey'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> amount of hair or keyed keys </p>
	 * @see #__DNA__FIELD__totkey
	 */
	
	public void setTotkey(int totkey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, totkey);
		} else {
			__io__block.writeInt(__io__address + 124, totkey);
		}
	}

	/**
	 * Get method for struct member 'time'.
	 * @see #__DNA__FIELD__time
	 */
	
	public float getTime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 140);
		} else {
			return __io__block.readFloat(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'time'.
	 * @see #__DNA__FIELD__time
	 */
	
	public void setTime(float time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 140, time);
		} else {
			__io__block.writeFloat(__io__address + 128, time);
		}
	}

	/**
	 * Get method for struct member 'lifetime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dietime is not nescessarily time+lifetime as </p>
	 * @see #__DNA__FIELD__lifetime
	 */
	
	public float getLifetime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'lifetime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dietime is not nescessarily time+lifetime as </p>
	 * @see #__DNA__FIELD__lifetime
	 */
	
	public void setLifetime(float lifetime) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, lifetime);
		} else {
			__io__block.writeFloat(__io__address + 132, lifetime);
		}
	}

	/**
	 * Get method for struct member 'dietime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> particles can die unnaturally (collision) </p>
	 * @see #__DNA__FIELD__dietime
	 */
	
	public float getDietime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 148);
		} else {
			return __io__block.readFloat(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'dietime'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> particles can die unnaturally (collision) </p>
	 * @see #__DNA__FIELD__dietime
	 */
	
	public void setDietime(float dietime) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 148, dietime);
		} else {
			__io__block.writeFloat(__io__address + 136, dietime);
		}
	}

	/**
	 * Get method for struct member 'num'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> WARNING! Those two indices, when not affected to vertices, are for !!! TESSELLATED FACES !!!, not POLYGONS! index to vert/edge/face </p>
	 * @see #__DNA__FIELD__num
	 */
	
	public int getNum() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 152);
		} else {
			return __io__block.readInt(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'num'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> WARNING! Those two indices, when not affected to vertices, are for !!! TESSELLATED FACES !!!, not POLYGONS! index to vert/edge/face </p>
	 * @see #__DNA__FIELD__num
	 */
	
	public void setNum(int num) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 152, num);
		} else {
			__io__block.writeInt(__io__address + 140, num);
		}
	}

	/**
	 * Get method for struct member 'num_dmcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> index to derived mesh data (face) to avoid slow lookups </p>
	 * @see #__DNA__FIELD__num_dmcache
	 */
	
	public int getNum_dmcache() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 156);
		} else {
			return __io__block.readInt(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'num_dmcache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> index to derived mesh data (face) to avoid slow lookups </p>
	 * @see #__DNA__FIELD__num_dmcache
	 */
	
	public void setNum_dmcache(int num_dmcache) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 156, num_dmcache);
		} else {
			__io__block.writeInt(__io__address + 144, num_dmcache);
		}
	}

	/**
	 * Get method for struct member 'fuv'.
	 * @see #__DNA__FIELD__fuv
	 */
	
	public CArrayFacade<Float> getFuv() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fuv'.
	 * @see #__DNA__FIELD__fuv
	 */
	
	public void setFuv(CArrayFacade<Float> fuv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 148;
		}
		if (__io__equals(fuv, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fuv)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fuv);
		} else {
			__io__generic__copy( getFuv(), fuv);
		}
	}

	/**
	 * Get method for struct member 'foffset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> coordinates on face/edge number "num" and depth along </p>
	 * @see #__DNA__FIELD__foffset
	 */
	
	public float getFoffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 176);
		} else {
			return __io__block.readFloat(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'foffset'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> coordinates on face/edge number "num" and depth along </p>
	 * @see #__DNA__FIELD__foffset
	 */
	
	public void setFoffset(float foffset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 176, foffset);
		} else {
			__io__block.writeFloat(__io__address + 164, foffset);
		}
	}

	/**
	 * Get method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> face normal for volume emission size and multiplier so that we can update size when ever </p>
	 * @see #__DNA__FIELD__size
	 */
	
	public float getSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 180);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> face normal for volume emission size and multiplier so that we can update size when ever </p>
	 * @see #__DNA__FIELD__size
	 */
	
	public void setSize(float size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 180, size);
		} else {
			__io__block.writeFloat(__io__address + 168, size);
		}
	}

	/**
	 * Get method for struct member 'sphdensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> density of sph particle </p>
	 * @see #__DNA__FIELD__sphdensity
	 */
	
	public float getSphdensity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 184);
		} else {
			return __io__block.readFloat(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'sphdensity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> density of sph particle </p>
	 * @see #__DNA__FIELD__sphdensity
	 */
	
	public void setSphdensity(float sphdensity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 184, sphdensity);
		} else {
			__io__block.writeFloat(__io__address + 172, sphdensity);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 188);
		} else {
			return __io__block.readInt(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 188, pad);
		} else {
			__io__block.writeInt(__io__address + 176, pad);
		}
	}

	/**
	 * Get method for struct member 'hair_index'.
	 * @see #__DNA__FIELD__hair_index
	 */
	
	public int getHair_index() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 192);
		} else {
			return __io__block.readInt(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'hair_index'.
	 * @see #__DNA__FIELD__hair_index
	 */
	
	public void setHair_index(int hair_index) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 192, hair_index);
		} else {
			__io__block.writeInt(__io__address + 180, hair_index);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 196);
		} else {
			return __io__block.readShort(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 196, flag);
		} else {
			__io__block.writeShort(__io__address + 184, flag);
		}
	}

	/**
	 * Get method for struct member 'alive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the life state of a particle </p>
	 * @see #__DNA__FIELD__alive
	 */
	
	public short getAlive() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 198);
		} else {
			return __io__block.readShort(__io__address + 186);
		}
	}

	/**
	 * Set method for struct member 'alive'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the life state of a particle </p>
	 * @see #__DNA__FIELD__alive
	 */
	
	public void setAlive(short alive) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 198, alive);
		} else {
			__io__block.writeShort(__io__address + 186, alive);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ParticleData> __io__addressof() {
		return new CPointer<ParticleData>(__io__address, new Class[]{ParticleData.class}, __io__block, __io__blockTable);
	}

}
