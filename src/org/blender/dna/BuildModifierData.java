package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'BuildModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=116, size64=136)
public class BuildModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct BuildModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for BuildModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 100;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildModifierData buildmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildmodifierdata.__dna__addressof(BuildModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'start'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildModifierData buildmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildmodifierdata.__dna__addressof(BuildModifierData.__DNA__FIELD__start);
	 * CPointer&lt;Float&gt; p_start = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'start'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__start = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'length'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildModifierData buildmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildmodifierdata.__dna__addressof(BuildModifierData.__DNA__FIELD__length);
	 * CPointer&lt;Float&gt; p_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__length = new long[]{104, 124};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildModifierData buildmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildmodifierdata.__dna__addressof(BuildModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'randomize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (bool) whether order of vertices is randomized - legacy files (for readfile conversion). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildModifierData buildmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildmodifierdata.__dna__addressof(BuildModifierData.__DNA__FIELD__randomize);
	 * CPointer&lt;Short&gt; p_randomize = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'randomize'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__randomize = new long[]{110, 130};

	/**
	 * Field descriptor (offset) for struct member 'seed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (int) random seed. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * BuildModifierData buildmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = buildmodifierdata.__dna__addressof(BuildModifierData.__DNA__FIELD__seed);
	 * CPointer&lt;Integer&gt; p_seed = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seed'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seed = new long[]{112, 132};

	public BuildModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected BuildModifierData(BuildModifierData that) {
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
	 * Get method for struct member 'start'.
	 * @see #__DNA__FIELD__start
	 */
	
	public float getStart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'start'.
	 * @see #__DNA__FIELD__start
	 */
	
	public void setStart(float start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, start);
		} else {
			__io__block.writeFloat(__io__address + 100, start);
		}
	}

	/**
	 * Get method for struct member 'length'.
	 * @see #__DNA__FIELD__length
	 */
	
	public float getLength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'length'.
	 * @see #__DNA__FIELD__length
	 */
	
	public void setLength(float length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, length);
		} else {
			__io__block.writeFloat(__io__address + 104, length);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 128);
		} else {
			return __io__block.readShort(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 128, flag);
		} else {
			__io__block.writeShort(__io__address + 108, flag);
		}
	}

	/**
	 * Get method for struct member 'randomize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (bool) whether order of vertices is randomized - legacy files (for readfile conversion). </p>
	 * @see #__DNA__FIELD__randomize
	 */
	
	public short getRandomize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 130);
		} else {
			return __io__block.readShort(__io__address + 110);
		}
	}

	/**
	 * Set method for struct member 'randomize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (bool) whether order of vertices is randomized - legacy files (for readfile conversion). </p>
	 * @see #__DNA__FIELD__randomize
	 */
	
	public void setRandomize(short randomize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 130, randomize);
		} else {
			__io__block.writeShort(__io__address + 110, randomize);
		}
	}

	/**
	 * Get method for struct member 'seed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (int) random seed. </p>
	 * @see #__DNA__FIELD__seed
	 */
	
	public int getSeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 132);
		} else {
			return __io__block.readInt(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'seed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> (int) random seed. </p>
	 * @see #__DNA__FIELD__seed
	 */
	
	public void setSeed(int seed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 132, seed);
		} else {
			__io__block.writeInt(__io__address + 112, seed);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<BuildModifierData> __io__addressof() {
		return new CPointer<BuildModifierData>(__io__address, new Class[]{BuildModifierData.class}, __io__block, __io__blockTable);
	}

}
