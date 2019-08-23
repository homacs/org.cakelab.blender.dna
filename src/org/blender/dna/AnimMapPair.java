package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'AnimMapPair'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  'Action' Datatypes NOTE: Although these are part of the Animation System, they are not stored here... see {@link DNA_action_types.h}  instead************************************************ Animation Reuse - i.e. users of Actions Retargetting -----------------------------<mdash/><mdash/>  Retargetting Pair</p><p> Defines what parts of the paths should be remapped from 'abc' to 'xyz'. TODO:<ul><li><p> Regrex (possibly provided through PY, though having our own module might be faster) would be important to have at some point. Current replacements are just simple string matches... </p></li></ul> 
 * Regrex (possibly provided through PY, though having our own module might be faster) would be important to have at some point. Current replacements are just simple string matches... 
 * </p>
 */

@CMetaData(size32=256, size64=256)
public class AnimMapPair extends CFacade {

	/**
	 * This is the sdna index of the struct AnimMapPair.
	 * <p>
	 * It is required when allocating a new block to store data for AnimMapPair.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 517;

	/**
	 * Field descriptor (offset) for struct member 'from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> part of path to bed replaced </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimMapPair animmappair = ...;
	 * CPointer&lt;Object&gt; p = animmappair.__dna__addressof(AnimMapPair.__DNA__FIELD__from);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_from = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'from'</li>
	 * <li>Signature: 'char[128]'</li>
	 * <li>Actual Size (32bit/64bit): 128/128</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__from = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'to'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> part of path to replace with </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * AnimMapPair animmappair = ...;
	 * CPointer&lt;Object&gt; p = animmappair.__dna__addressof(AnimMapPair.__DNA__FIELD__to);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_to = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'to'</li>
	 * <li>Signature: 'char[128]'</li>
	 * <li>Actual Size (32bit/64bit): 128/128</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__to = new long[]{128, 128};

	public AnimMapPair(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected AnimMapPair(AnimMapPair that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> part of path to bed replaced </p>
	 * @see #__DNA__FIELD__from
	 */
	
	public CArrayFacade<Byte> getFrom() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			128
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'from'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> part of path to bed replaced </p>
	 * @see #__DNA__FIELD__from
	 */
	
	public void setFrom(CArrayFacade<Byte> from) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(from, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, from)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, from);
		} else {
			__io__generic__copy( getFrom(), from);
		}
	}

	/**
	 * Get method for struct member 'to'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> part of path to replace with </p>
	 * @see #__DNA__FIELD__to
	 */
	
	public CArrayFacade<Byte> getTo() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			128
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'to'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> part of path to replace with </p>
	 * @see #__DNA__FIELD__to
	 */
	
	public void setTo(CArrayFacade<Byte> to) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 128;
		}
		if (__io__equals(to, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, to)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, to);
		} else {
			__io__generic__copy( getTo(), to);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<AnimMapPair> __io__addressof() {
		return new CPointer<AnimMapPair>(__io__address, new Class[]{AnimMapPair.class}, __io__block, __io__blockTable);
	}

}
