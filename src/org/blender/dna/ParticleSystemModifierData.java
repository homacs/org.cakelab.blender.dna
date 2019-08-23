package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ParticleSystemModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=120, size64=144)
public class ParticleSystemModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct ParticleSystemModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for ParticleSystemModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 108;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystemModifierData particlesystemmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particlesystemmodifierdata.__dna__addressof(ParticleSystemModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 96/112</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'psys'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystemModifierData particlesystemmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particlesystemmodifierdata.__dna__addressof(ParticleSystemModifierData.__DNA__FIELD__psys);
	 * CPointer&lt;CPointer&lt;ParticleSystem&gt;&gt; p_psys = p.cast(new Class[]{CPointer.class, ParticleSystem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'psys'</li>
	 * <li>Signature: 'ParticleSystem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__psys = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'dm'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystemModifierData particlesystemmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particlesystemmodifierdata.__dna__addressof(ParticleSystemModifierData.__DNA__FIELD__dm);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_dm = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dm'</li>
	 * <li>Signature: 'DerivedMesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dm = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'totdmvert'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystemModifierData particlesystemmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particlesystemmodifierdata.__dna__addressof(ParticleSystemModifierData.__DNA__FIELD__totdmvert);
	 * CPointer&lt;Integer&gt; p_totdmvert = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totdmvert'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totdmvert = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'totdmedge'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystemModifierData particlesystemmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particlesystemmodifierdata.__dna__addressof(ParticleSystemModifierData.__DNA__FIELD__totdmedge);
	 * CPointer&lt;Integer&gt; p_totdmedge = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totdmedge'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totdmedge = new long[]{108, 132};

	/**
	 * Field descriptor (offset) for struct member 'totdmface'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystemModifierData particlesystemmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particlesystemmodifierdata.__dna__addressof(ParticleSystemModifierData.__DNA__FIELD__totdmface);
	 * CPointer&lt;Integer&gt; p_totdmface = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totdmface'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totdmface = new long[]{112, 136};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystemModifierData particlesystemmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particlesystemmodifierdata.__dna__addressof(ParticleSystemModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{116, 140};

	/**
	 * Field descriptor (offset) for struct member 'rt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystemModifierData particlesystemmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = particlesystemmodifierdata.__dna__addressof(ParticleSystemModifierData.__DNA__FIELD__rt);
	 * CPointer&lt;Short&gt; p_rt = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rt'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rt = new long[]{118, 142};

	public ParticleSystemModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ParticleSystemModifierData(ParticleSystemModifierData that) {
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
	 * Get method for struct member 'psys'.
	 * @see #__DNA__FIELD__psys
	 */
	
	public CPointer<ParticleSystem> getPsys() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ParticleSystem.class};
		return new CPointer<ParticleSystem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ParticleSystem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'psys'.
	 * @see #__DNA__FIELD__psys
	 */
	
	public void setPsys(CPointer<ParticleSystem> psys) throws IOException
	{
		long __address = ((psys == null) ? 0 : psys.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 96, __address);
		}
	}

	/**
	 * Get method for struct member 'dm'.
	 * @see #__DNA__FIELD__dm
	 */
	
	public CPointer<Object> getDm() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dm'.
	 * @see #__DNA__FIELD__dm
	 */
	
	public void setDm(CPointer<Object> dm) throws IOException
	{
		long __address = ((dm == null) ? 0 : dm.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'totdmvert'.
	 * @see #__DNA__FIELD__totdmvert
	 */
	
	public int getTotdmvert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 128);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'totdmvert'.
	 * @see #__DNA__FIELD__totdmvert
	 */
	
	public void setTotdmvert(int totdmvert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 128, totdmvert);
		} else {
			__io__block.writeInt(__io__address + 104, totdmvert);
		}
	}

	/**
	 * Get method for struct member 'totdmedge'.
	 * @see #__DNA__FIELD__totdmedge
	 */
	
	public int getTotdmedge() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 132);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'totdmedge'.
	 * @see #__DNA__FIELD__totdmedge
	 */
	
	public void setTotdmedge(int totdmedge) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 132, totdmedge);
		} else {
			__io__block.writeInt(__io__address + 108, totdmedge);
		}
	}

	/**
	 * Get method for struct member 'totdmface'.
	 * @see #__DNA__FIELD__totdmface
	 */
	
	public int getTotdmface() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 136);
		} else {
			return __io__block.readInt(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'totdmface'.
	 * @see #__DNA__FIELD__totdmface
	 */
	
	public void setTotdmface(int totdmface) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 136, totdmface);
		} else {
			__io__block.writeInt(__io__address + 112, totdmface);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 140);
		} else {
			return __io__block.readShort(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 140, flag);
		} else {
			__io__block.writeShort(__io__address + 116, flag);
		}
	}

	/**
	 * Get method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public short getRt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 142);
		} else {
			return __io__block.readShort(__io__address + 118);
		}
	}

	/**
	 * Set method for struct member 'rt'.
	 * @see #__DNA__FIELD__rt
	 */
	
	public void setRt(short rt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 142, rt);
		} else {
			__io__block.writeShort(__io__address + 118, rt);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ParticleSystemModifierData> __io__addressof() {
		return new CPointer<ParticleSystemModifierData>(__io__address, new Class[]{ParticleSystemModifierData.class}, __io__block, __io__blockTable);
	}

}
