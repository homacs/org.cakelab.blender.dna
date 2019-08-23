package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SmokeModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=120, size64=152)
public class SmokeModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct SmokeModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for SmokeModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 106;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeModifierData smokemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = smokemodifierdata.__dna__addressof(SmokeModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'domain'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeModifierData smokemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = smokemodifierdata.__dna__addressof(SmokeModifierData.__DNA__FIELD__domain);
	 * CPointer&lt;CPointer&lt;SmokeDomainSettings&gt;&gt; p_domain = p.cast(new Class[]{CPointer.class, SmokeDomainSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'domain'</li>
	 * <li>Signature: 'SmokeDomainSettings*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__domain = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'flow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inflow, outflow, smoke objects. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeModifierData smokemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = smokemodifierdata.__dna__addressof(SmokeModifierData.__DNA__FIELD__flow);
	 * CPointer&lt;CPointer&lt;SmokeFlowSettings&gt;&gt; p_flow = p.cast(new Class[]{CPointer.class, SmokeFlowSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flow'</li>
	 * <li>Signature: 'SmokeFlowSettings*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flow = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'coll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collision objects. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeModifierData smokemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = smokemodifierdata.__dna__addressof(SmokeModifierData.__DNA__FIELD__coll);
	 * CPointer&lt;CPointer&lt;SmokeCollSettings&gt;&gt; p_coll = p.cast(new Class[]{CPointer.class, SmokeCollSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coll'</li>
	 * <li>Signature: 'SmokeCollSettings*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coll = new long[]{108, 136};

	/**
	 * Field descriptor (offset) for struct member 'time'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeModifierData smokemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = smokemodifierdata.__dna__addressof(SmokeModifierData.__DNA__FIELD__time);
	 * CPointer&lt;Float&gt; p_time = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time = new long[]{112, 144};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain, inflow, outflow, .... </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeModifierData smokemodifierdata = ...;
	 * CPointer&lt;Object&gt; p = smokemodifierdata.__dna__addressof(SmokeModifierData.__DNA__FIELD__type);
	 * CPointer&lt;Integer&gt; p_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{116, 148};

	public SmokeModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SmokeModifierData(SmokeModifierData that) {
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
	 * Get method for struct member 'domain'.
	 * @see #__DNA__FIELD__domain
	 */
	
	public CPointer<SmokeDomainSettings> getDomain() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SmokeDomainSettings.class};
		return new CPointer<SmokeDomainSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SmokeDomainSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'domain'.
	 * @see #__DNA__FIELD__domain
	 */
	
	public void setDomain(CPointer<SmokeDomainSettings> domain) throws IOException
	{
		long __address = ((domain == null) ? 0 : domain.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'flow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inflow, outflow, smoke objects. </p>
	 * @see #__DNA__FIELD__flow
	 */
	
	public CPointer<SmokeFlowSettings> getFlow() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SmokeFlowSettings.class};
		return new CPointer<SmokeFlowSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SmokeFlowSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'flow'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Inflow, outflow, smoke objects. </p>
	 * @see #__DNA__FIELD__flow
	 */
	
	public void setFlow(CPointer<SmokeFlowSettings> flow) throws IOException
	{
		long __address = ((flow == null) ? 0 : flow.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 104, __address);
		}
	}

	/**
	 * Get method for struct member 'coll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collision objects. </p>
	 * @see #__DNA__FIELD__coll
	 */
	
	public CPointer<SmokeCollSettings> getColl() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SmokeCollSettings.class};
		return new CPointer<SmokeCollSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SmokeCollSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'coll'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Collision objects. </p>
	 * @see #__DNA__FIELD__coll
	 */
	
	public void setColl(CPointer<SmokeCollSettings> coll) throws IOException
	{
		long __address = ((coll == null) ? 0 : coll.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'time'.
	 * @see #__DNA__FIELD__time
	 */
	
	public float getTime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 144);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'time'.
	 * @see #__DNA__FIELD__time
	 */
	
	public void setTime(float time) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 144, time);
		} else {
			__io__block.writeFloat(__io__address + 112, time);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain, inflow, outflow, .... </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public int getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 148);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain, inflow, outflow, .... </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(int type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 148, type);
		} else {
			__io__block.writeInt(__io__address + 116, type);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SmokeModifierData> __io__addressof() {
		return new CPointer<SmokeModifierData>(__io__address, new Class[]{SmokeModifierData.class}, __io__block, __io__blockTable);
	}

}
