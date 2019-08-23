package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'UVProjectModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=236, size64=296)
public class UVProjectModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct UVProjectModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for UVProjectModifierData.
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
	 * UVProjectModifierData uvprojectmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvprojectmodifierdata.__dna__addressof(UVProjectModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'projectors'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the objects which do the projecting MOD_UVPROJECT_MAXPROJECTORS. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVProjectModifierData uvprojectmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvprojectmodifierdata.__dna__addressof(UVProjectModifierData.__DNA__FIELD__projectors);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;BlenderObject&gt;&gt;&gt; p_projectors = p.cast(new Class[]{CArrayFacade.class, CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projectors'</li>
	 * <li>Signature: 'Object*[10]'</li>
	 * <li>Actual Size (32bit/64bit): 40/80</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projectors = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVProjectModifierData uvprojectmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvprojectmodifierdata.__dna__addressof(UVProjectModifierData.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{140, 200};

	/**
	 * Field descriptor (offset) for struct member 'num_projectors'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVProjectModifierData uvprojectmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvprojectmodifierdata.__dna__addressof(UVProjectModifierData.__DNA__FIELD__num_projectors);
	 * CPointer&lt;Integer&gt; p_num_projectors = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'num_projectors'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__num_projectors = new long[]{144, 204};

	/**
	 * Field descriptor (offset) for struct member 'aspectx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVProjectModifierData uvprojectmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvprojectmodifierdata.__dna__addressof(UVProjectModifierData.__DNA__FIELD__aspectx);
	 * CPointer&lt;Float&gt; p_aspectx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aspectx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aspectx = new long[]{148, 208};

	/**
	 * Field descriptor (offset) for struct member 'aspecty'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVProjectModifierData uvprojectmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvprojectmodifierdata.__dna__addressof(UVProjectModifierData.__DNA__FIELD__aspecty);
	 * CPointer&lt;Float&gt; p_aspecty = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aspecty'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aspecty = new long[]{152, 212};

	/**
	 * Field descriptor (offset) for struct member 'scalex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVProjectModifierData uvprojectmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvprojectmodifierdata.__dna__addressof(UVProjectModifierData.__DNA__FIELD__scalex);
	 * CPointer&lt;Float&gt; p_scalex = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scalex'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scalex = new long[]{156, 216};

	/**
	 * Field descriptor (offset) for struct member 'scaley'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVProjectModifierData uvprojectmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvprojectmodifierdata.__dna__addressof(UVProjectModifierData.__DNA__FIELD__scaley);
	 * CPointer&lt;Float&gt; p_scaley = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scaley'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scaley = new long[]{160, 220};

	/**
	 * Field descriptor (offset) for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVProjectModifierData uvprojectmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvprojectmodifierdata.__dna__addressof(UVProjectModifierData.__DNA__FIELD__uvlayer_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_uvlayer_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uvlayer_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uvlayer_name = new long[]{164, 224};

	/**
	 * Field descriptor (offset) for struct member 'uvlayer_tmp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVProjectModifierData uvprojectmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvprojectmodifierdata.__dna__addressof(UVProjectModifierData.__DNA__FIELD__uvlayer_tmp);
	 * CPointer&lt;Integer&gt; p_uvlayer_tmp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'uvlayer_tmp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__uvlayer_tmp = new long[]{228, 288};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * UVProjectModifierData uvprojectmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = uvprojectmodifierdata.__dna__addressof(UVProjectModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{232, 292};

	public UVProjectModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected UVProjectModifierData(UVProjectModifierData that) {
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
	 * Get method for struct member 'projectors'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the objects which do the projecting MOD_UVPROJECT_MAXPROJECTORS. </p>
	 * @see #__DNA__FIELD__projectors
	 */
	
	public CArrayFacade<CPointer<BlenderObject>> getProjectors() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, BlenderObject.class};
		int[] __dna__dimensions = new int[]{
			10
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<BlenderObject>>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<BlenderObject>>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'projectors'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> the objects which do the projecting MOD_UVPROJECT_MAXPROJECTORS. </p>
	 * @see #__DNA__FIELD__projectors
	 */
	
	public void setProjectors(CArrayFacade<CPointer<BlenderObject>> projectors) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(projectors, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, projectors)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, projectors);
		} else {
			__io__generic__copy( getProjectors(), projectors);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Get method for struct member 'num_projectors'.
	 * @see #__DNA__FIELD__num_projectors
	 */
	
	public int getNum_projectors() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 204);
		} else {
			return __io__block.readInt(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'num_projectors'.
	 * @see #__DNA__FIELD__num_projectors
	 */
	
	public void setNum_projectors(int num_projectors) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 204, num_projectors);
		} else {
			__io__block.writeInt(__io__address + 144, num_projectors);
		}
	}

	/**
	 * Get method for struct member 'aspectx'.
	 * @see #__DNA__FIELD__aspectx
	 */
	
	public float getAspectx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 208);
		} else {
			return __io__block.readFloat(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'aspectx'.
	 * @see #__DNA__FIELD__aspectx
	 */
	
	public void setAspectx(float aspectx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 208, aspectx);
		} else {
			__io__block.writeFloat(__io__address + 148, aspectx);
		}
	}

	/**
	 * Get method for struct member 'aspecty'.
	 * @see #__DNA__FIELD__aspecty
	 */
	
	public float getAspecty() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 212);
		} else {
			return __io__block.readFloat(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'aspecty'.
	 * @see #__DNA__FIELD__aspecty
	 */
	
	public void setAspecty(float aspecty) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 212, aspecty);
		} else {
			__io__block.writeFloat(__io__address + 152, aspecty);
		}
	}

	/**
	 * Get method for struct member 'scalex'.
	 * @see #__DNA__FIELD__scalex
	 */
	
	public float getScalex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 216);
		} else {
			return __io__block.readFloat(__io__address + 156);
		}
	}

	/**
	 * Set method for struct member 'scalex'.
	 * @see #__DNA__FIELD__scalex
	 */
	
	public void setScalex(float scalex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 216, scalex);
		} else {
			__io__block.writeFloat(__io__address + 156, scalex);
		}
	}

	/**
	 * Get method for struct member 'scaley'.
	 * @see #__DNA__FIELD__scaley
	 */
	
	public float getScaley() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 220);
		} else {
			return __io__block.readFloat(__io__address + 160);
		}
	}

	/**
	 * Set method for struct member 'scaley'.
	 * @see #__DNA__FIELD__scaley
	 */
	
	public void setScaley(float scaley) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 220, scaley);
		} else {
			__io__block.writeFloat(__io__address + 160, scaley);
		}
	}

	/**
	 * Get method for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__uvlayer_name
	 */
	
	public CArrayFacade<Byte> getUvlayer_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 224, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 164, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'uvlayer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> MAX_CUSTOMDATA_LAYER_NAME. </p>
	 * @see #__DNA__FIELD__uvlayer_name
	 */
	
	public void setUvlayer_name(CArrayFacade<Byte> uvlayer_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 224;
		} else {
			__dna__offset = 164;
		}
		if (__io__equals(uvlayer_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, uvlayer_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, uvlayer_name);
		} else {
			__io__generic__copy( getUvlayer_name(), uvlayer_name);
		}
	}

	/**
	 * Get method for struct member 'uvlayer_tmp'.
	 * @see #__DNA__FIELD__uvlayer_tmp
	 */
	
	public int getUvlayer_tmp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 288);
		} else {
			return __io__block.readInt(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'uvlayer_tmp'.
	 * @see #__DNA__FIELD__uvlayer_tmp
	 */
	
	public void setUvlayer_tmp(int uvlayer_tmp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 288, uvlayer_tmp);
		} else {
			__io__block.writeInt(__io__address + 228, uvlayer_tmp);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 292, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 292;
		} else {
			__dna__offset = 232;
		}
		if (__io__equals(_pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad);
		} else {
			__io__generic__copy( get_pad(), _pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<UVProjectModifierData> __io__addressof() {
		return new CPointer<UVProjectModifierData>(__io__address, new Class[]{UVProjectModifierData.class}, __io__block, __io__blockTable);
	}

}
