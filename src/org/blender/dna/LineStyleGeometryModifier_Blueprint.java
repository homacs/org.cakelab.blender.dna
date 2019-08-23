package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LineStyleGeometryModifier_Blueprint'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=112, size64=120)
public class LineStyleGeometryModifier_Blueprint extends CFacade {

	/**
	 * This is the sdna index of the struct LineStyleGeometryModifier_Blueprint.
	 * <p>
	 * It is required when allocating a new block to store data for LineStyleGeometryModifier_Blueprint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 621;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_Blueprint linestylegeometrymodifier_blueprint = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_blueprint.__dna__addressof(LineStyleGeometryModifier_Blueprint.__DNA__FIELD__modifier);
	 * CPointer&lt;LineStyleModifier&gt; p_modifier = p.cast(new Class[]{LineStyleModifier.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'LineStyleModifier'</li>
	 * <li>Actual Size (32bit/64bit): 88/96</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_Blueprint linestylegeometrymodifier_blueprint = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_blueprint.__dna__addressof(LineStyleGeometryModifier_Blueprint.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'rounds'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of rounds in contour strokes
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_Blueprint linestylegeometrymodifier_blueprint = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_blueprint.__dna__addressof(LineStyleGeometryModifier_Blueprint.__DNA__FIELD__rounds);
	 * CPointer&lt;Integer&gt; p_rounds = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rounds'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rounds = new long[]{92, 100};

	/**
	 * Field descriptor (offset) for struct member 'backbone_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of backbone stretching
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_Blueprint linestylegeometrymodifier_blueprint = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_blueprint.__dna__addressof(LineStyleGeometryModifier_Blueprint.__DNA__FIELD__backbone_length);
	 * CPointer&lt;Float&gt; p_backbone_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'backbone_length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__backbone_length = new long[]{96, 104};

	/**
	 * Field descriptor (offset) for struct member 'random_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Randomness of the radius
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_Blueprint linestylegeometrymodifier_blueprint = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_blueprint.__dna__addressof(LineStyleGeometryModifier_Blueprint.__DNA__FIELD__random_radius);
	 * CPointer&lt;Integer&gt; p_random_radius = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'random_radius'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__random_radius = new long[]{100, 108};

	/**
	 * Field descriptor (offset) for struct member 'random_center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Randomness of the center
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_Blueprint linestylegeometrymodifier_blueprint = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_blueprint.__dna__addressof(LineStyleGeometryModifier_Blueprint.__DNA__FIELD__random_center);
	 * CPointer&lt;Integer&gt; p_random_center = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'random_center'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__random_center = new long[]{104, 112};

	/**
	 * Field descriptor (offset) for struct member 'random_backbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Randomness of the backbone stretching
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleGeometryModifier_Blueprint linestylegeometrymodifier_blueprint = ...;
	 * CPointer&lt;Object&gt; p = linestylegeometrymodifier_blueprint.__dna__addressof(LineStyleGeometryModifier_Blueprint.__DNA__FIELD__random_backbone);
	 * CPointer&lt;Integer&gt; p_random_backbone = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'random_backbone'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__random_backbone = new long[]{108, 116};

	public LineStyleGeometryModifier_Blueprint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LineStyleGeometryModifier_Blueprint(LineStyleGeometryModifier_Blueprint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public LineStyleModifier getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new LineStyleModifier(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new LineStyleModifier(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(LineStyleModifier modifier) throws IOException
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
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 96);
		} else {
			return __io__block.readInt(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 96, flags);
		} else {
			__io__block.writeInt(__io__address + 88, flags);
		}
	}

	/**
	 * Get method for struct member 'rounds'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of rounds in contour strokes
	 * @see #__DNA__FIELD__rounds
	 */
	
	public int getRounds() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 100);
		} else {
			return __io__block.readInt(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'rounds'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Number of rounds in contour strokes
	 * @see #__DNA__FIELD__rounds
	 */
	
	public void setRounds(int rounds) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 100, rounds);
		} else {
			__io__block.writeInt(__io__address + 92, rounds);
		}
	}

	/**
	 * Get method for struct member 'backbone_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of backbone stretching
	 * @see #__DNA__FIELD__backbone_length
	 */
	
	public float getBackbone_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 104);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'backbone_length'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of backbone stretching
	 * @see #__DNA__FIELD__backbone_length
	 */
	
	public void setBackbone_length(float backbone_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 104, backbone_length);
		} else {
			__io__block.writeFloat(__io__address + 96, backbone_length);
		}
	}

	/**
	 * Get method for struct member 'random_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Randomness of the radius
	 * @see #__DNA__FIELD__random_radius
	 */
	
	public int getRandom_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 108);
		} else {
			return __io__block.readInt(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'random_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Randomness of the radius
	 * @see #__DNA__FIELD__random_radius
	 */
	
	public void setRandom_radius(int random_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 108, random_radius);
		} else {
			__io__block.writeInt(__io__address + 100, random_radius);
		}
	}

	/**
	 * Get method for struct member 'random_center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Randomness of the center
	 * @see #__DNA__FIELD__random_center
	 */
	
	public int getRandom_center() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 112);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'random_center'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Randomness of the center
	 * @see #__DNA__FIELD__random_center
	 */
	
	public void setRandom_center(int random_center) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 112, random_center);
		} else {
			__io__block.writeInt(__io__address + 104, random_center);
		}
	}

	/**
	 * Get method for struct member 'random_backbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Randomness of the backbone stretching
	 * @see #__DNA__FIELD__random_backbone
	 */
	
	public int getRandom_backbone() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 116);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'random_backbone'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Randomness of the backbone stretching
	 * @see #__DNA__FIELD__random_backbone
	 */
	
	public void setRandom_backbone(int random_backbone) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 116, random_backbone);
		} else {
			__io__block.writeInt(__io__address + 108, random_backbone);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LineStyleGeometryModifier_Blueprint> __io__addressof() {
		return new CPointer<LineStyleGeometryModifier_Blueprint>(__io__address, new Class[]{LineStyleGeometryModifier_Blueprint.class}, __io__block, __io__blockTable);
	}

}
