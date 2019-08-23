package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MeshDeformModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=308, size64=368)
public class MeshDeformModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct MeshDeformModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for MeshDeformModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 122;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__modifier);
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
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  object. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__object);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_object = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'object'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__object = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__defgrp_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_defgrp_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'defgrp_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__defgrp_name = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'gridsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__gridsize);
	 * CPointer&lt;Short&gt; p_gridsize = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gridsize'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gridsize = new long[]{168, 192};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{170, 194};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{172, 196};

	/**
	 * Field descriptor (offset) for struct member 'bindinfluences'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of static binding Influences. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__bindinfluences);
	 * CPointer&lt;CPointer&lt;MDefInfluence&gt;&gt; p_bindinfluences = p.cast(new Class[]{CPointer.class, MDefInfluence.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bindinfluences'</li>
	 * <li>Signature: 'MDefInfluence*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bindinfluences = new long[]{176, 200};

	/**
	 * Field descriptor (offset) for struct member 'bindoffsets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offsets into influences array. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__bindoffsets);
	 * CPointer&lt;CPointer&lt;Integer&gt;&gt; p_bindoffsets = p.cast(new Class[]{CPointer.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bindoffsets'</li>
	 * <li>Signature: 'int*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bindoffsets = new long[]{180, 208};

	/**
	 * Field descriptor (offset) for struct member 'bindcagecos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Coordinates that cage was bound with. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__bindcagecos);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_bindcagecos = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bindcagecos'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bindcagecos = new long[]{184, 216};

	/**
	 * Field descriptor (offset) for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total vertices in mesh and cage. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__totvert);
	 * CPointer&lt;Integer&gt; p_totvert = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totvert'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totvert = new long[]{188, 224};

	/**
	 * Field descriptor (offset) for struct member 'totcagevert'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__totcagevert);
	 * CPointer&lt;Integer&gt; p_totcagevert = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totcagevert'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totcagevert = new long[]{192, 228};

	/**
	 * Field descriptor (offset) for struct member 'dyngrid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of dynamic binding Grid with dynamic binding cell points. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__dyngrid);
	 * CPointer&lt;CPointer&lt;MDefCell&gt;&gt; p_dyngrid = p.cast(new Class[]{CPointer.class, MDefCell.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dyngrid'</li>
	 * <li>Signature: 'MDefCell*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dyngrid = new long[]{196, 232};

	/**
	 * Field descriptor (offset) for struct member 'dyninfluences'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dynamic binding vertex influences. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__dyninfluences);
	 * CPointer&lt;CPointer&lt;MDefInfluence&gt;&gt; p_dyninfluences = p.cast(new Class[]{CPointer.class, MDefInfluence.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dyninfluences'</li>
	 * <li>Signature: 'MDefInfluence*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dyninfluences = new long[]{200, 240};

	/**
	 * Field descriptor (offset) for struct member 'dynverts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Is this vertex bound or not?. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__dynverts);
	 * CPointer&lt;CPointer&lt;Integer&gt;&gt; p_dynverts = p.cast(new Class[]{CPointer.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dynverts'</li>
	 * <li>Signature: 'int*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dynverts = new long[]{204, 248};

	/**
	 * Field descriptor (offset) for struct member 'dyngridsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of the dynamic bind grid. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__dyngridsize);
	 * CPointer&lt;Integer&gt; p_dyngridsize = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dyngridsize'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dyngridsize = new long[]{208, 256};

	/**
	 * Field descriptor (offset) for struct member 'totinfluence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total number of vertex influences. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__totinfluence);
	 * CPointer&lt;Integer&gt; p_totinfluence = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totinfluence'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totinfluence = new long[]{212, 260};

	/**
	 * Field descriptor (offset) for struct member 'dyncellmin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset of the dynamic bind grid. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__dyncellmin);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_dyncellmin = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dyncellmin'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dyncellmin = new long[]{216, 264};

	/**
	 * Field descriptor (offset) for struct member 'dyncellwidth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Width of dynamic bind cell. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__dyncellwidth);
	 * CPointer&lt;Float&gt; p_dyncellwidth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dyncellwidth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dyncellwidth = new long[]{228, 276};

	/**
	 * Field descriptor (offset) for struct member 'bindmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Matrix of cage at binding time. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__bindmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_bindmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bindmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bindmat = new long[]{232, 280};

	/**
	 * Field descriptor (offset) for struct member 'bindweights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> deprecated storage Deprecated inefficient storage. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__bindweights);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_bindweights = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bindweights'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bindweights = new long[]{296, 344};

	/**
	 * Field descriptor (offset) for struct member 'bindcos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated storage of cage coords. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__bindcos);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_bindcos = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bindcos'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bindcos = new long[]{300, 352};

	public MeshDeformModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MeshDeformModifierData(MeshDeformModifierData that) {
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
	 * Get method for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  object. </p>
	 * @see #__DNA__FIELD__object
	 */
	
	public CPointer<BlenderObject> getObject() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  object. </p>
	 * @see #__DNA__FIELD__object
	 */
	
	public void setObject(CPointer<BlenderObject> object) throws IOException
	{
		long __address = ((object == null) ? 0 : object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public CArrayFacade<Byte> getDefgrp_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Optional vertexgroup name, MAX_VGROUP_NAME. </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public void setDefgrp_name(CArrayFacade<Byte> defgrp_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 104;
		}
		if (__io__equals(defgrp_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, defgrp_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, defgrp_name);
		} else {
			__io__generic__copy( getDefgrp_name(), defgrp_name);
		}
	}

	/**
	 * Get method for struct member 'gridsize'.
	 * @see #__DNA__FIELD__gridsize
	 */
	
	public short getGridsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 192);
		} else {
			return __io__block.readShort(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'gridsize'.
	 * @see #__DNA__FIELD__gridsize
	 */
	
	public void setGridsize(short gridsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 192, gridsize);
		} else {
			__io__block.writeShort(__io__address + 168, gridsize);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 194);
		} else {
			return __io__block.readShort(__io__address + 170);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 194, flag);
		} else {
			__io__block.writeShort(__io__address + 170, flag);
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
			return new CArrayFacade<Byte>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 196;
		} else {
			__dna__offset = 172;
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
	 * Get method for struct member 'bindinfluences'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of static binding Influences. </p>
	 * @see #__DNA__FIELD__bindinfluences
	 */
	
	public CPointer<MDefInfluence> getBindinfluences() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MDefInfluence.class};
		return new CPointer<MDefInfluence>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MDefInfluence.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bindinfluences'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of static binding Influences. </p>
	 * @see #__DNA__FIELD__bindinfluences
	 */
	
	public void setBindinfluences(CPointer<MDefInfluence> bindinfluences) throws IOException
	{
		long __address = ((bindinfluences == null) ? 0 : bindinfluences.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 176, __address);
		}
	}

	/**
	 * Get method for struct member 'bindoffsets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offsets into influences array. </p>
	 * @see #__DNA__FIELD__bindoffsets
	 */
	
	public CPointer<Integer> getBindoffsets() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 180);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		return new CPointer<Integer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bindoffsets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offsets into influences array. </p>
	 * @see #__DNA__FIELD__bindoffsets
	 */
	
	public void setBindoffsets(CPointer<Integer> bindoffsets) throws IOException
	{
		long __address = ((bindoffsets == null) ? 0 : bindoffsets.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 180, __address);
		}
	}

	/**
	 * Get method for struct member 'bindcagecos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Coordinates that cage was bound with. </p>
	 * @see #__DNA__FIELD__bindcagecos
	 */
	
	public CPointer<Float> getBindcagecos() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 216);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bindcagecos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Coordinates that cage was bound with. </p>
	 * @see #__DNA__FIELD__bindcagecos
	 */
	
	public void setBindcagecos(CPointer<Float> bindcagecos) throws IOException
	{
		long __address = ((bindcagecos == null) ? 0 : bindcagecos.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 216, __address);
		} else {
			__io__block.writeLong(__io__address + 184, __address);
		}
	}

	/**
	 * Get method for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total vertices in mesh and cage. </p>
	 * @see #__DNA__FIELD__totvert
	 */
	
	public int getTotvert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 224);
		} else {
			return __io__block.readInt(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'totvert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total vertices in mesh and cage. </p>
	 * @see #__DNA__FIELD__totvert
	 */
	
	public void setTotvert(int totvert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 224, totvert);
		} else {
			__io__block.writeInt(__io__address + 188, totvert);
		}
	}

	/**
	 * Get method for struct member 'totcagevert'.
	 * @see #__DNA__FIELD__totcagevert
	 */
	
	public int getTotcagevert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 228);
		} else {
			return __io__block.readInt(__io__address + 192);
		}
	}

	/**
	 * Set method for struct member 'totcagevert'.
	 * @see #__DNA__FIELD__totcagevert
	 */
	
	public void setTotcagevert(int totcagevert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 228, totcagevert);
		} else {
			__io__block.writeInt(__io__address + 192, totcagevert);
		}
	}

	/**
	 * Get method for struct member 'dyngrid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of dynamic binding Grid with dynamic binding cell points. </p>
	 * @see #__DNA__FIELD__dyngrid
	 */
	
	public CPointer<MDefCell> getDyngrid() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 196);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MDefCell.class};
		return new CPointer<MDefCell>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MDefCell.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dyngrid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of dynamic binding Grid with dynamic binding cell points. </p>
	 * @see #__DNA__FIELD__dyngrid
	 */
	
	public void setDyngrid(CPointer<MDefCell> dyngrid) throws IOException
	{
		long __address = ((dyngrid == null) ? 0 : dyngrid.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 196, __address);
		}
	}

	/**
	 * Get method for struct member 'dyninfluences'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dynamic binding vertex influences. </p>
	 * @see #__DNA__FIELD__dyninfluences
	 */
	
	public CPointer<MDefInfluence> getDyninfluences() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MDefInfluence.class};
		return new CPointer<MDefInfluence>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MDefInfluence.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dyninfluences'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dynamic binding vertex influences. </p>
	 * @see #__DNA__FIELD__dyninfluences
	 */
	
	public void setDyninfluences(CPointer<MDefInfluence> dyninfluences) throws IOException
	{
		long __address = ((dyninfluences == null) ? 0 : dyninfluences.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 240, __address);
		} else {
			__io__block.writeLong(__io__address + 200, __address);
		}
	}

	/**
	 * Get method for struct member 'dynverts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Is this vertex bound or not?. </p>
	 * @see #__DNA__FIELD__dynverts
	 */
	
	public CPointer<Integer> getDynverts() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 248);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 204);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		return new CPointer<Integer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dynverts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Is this vertex bound or not?. </p>
	 * @see #__DNA__FIELD__dynverts
	 */
	
	public void setDynverts(CPointer<Integer> dynverts) throws IOException
	{
		long __address = ((dynverts == null) ? 0 : dynverts.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 248, __address);
		} else {
			__io__block.writeLong(__io__address + 204, __address);
		}
	}

	/**
	 * Get method for struct member 'dyngridsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of the dynamic bind grid. </p>
	 * @see #__DNA__FIELD__dyngridsize
	 */
	
	public int getDyngridsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 256);
		} else {
			return __io__block.readInt(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'dyngridsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Size of the dynamic bind grid. </p>
	 * @see #__DNA__FIELD__dyngridsize
	 */
	
	public void setDyngridsize(int dyngridsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 256, dyngridsize);
		} else {
			__io__block.writeInt(__io__address + 208, dyngridsize);
		}
	}

	/**
	 * Get method for struct member 'totinfluence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total number of vertex influences. </p>
	 * @see #__DNA__FIELD__totinfluence
	 */
	
	public int getTotinfluence() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 260);
		} else {
			return __io__block.readInt(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'totinfluence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Total number of vertex influences. </p>
	 * @see #__DNA__FIELD__totinfluence
	 */
	
	public void setTotinfluence(int totinfluence) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 260, totinfluence);
		} else {
			__io__block.writeInt(__io__address + 212, totinfluence);
		}
	}

	/**
	 * Get method for struct member 'dyncellmin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset of the dynamic bind grid. </p>
	 * @see #__DNA__FIELD__dyncellmin
	 */
	
	public CArrayFacade<Float> getDyncellmin() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 264, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dyncellmin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Offset of the dynamic bind grid. </p>
	 * @see #__DNA__FIELD__dyncellmin
	 */
	
	public void setDyncellmin(CArrayFacade<Float> dyncellmin) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 264;
		} else {
			__dna__offset = 216;
		}
		if (__io__equals(dyncellmin, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dyncellmin)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dyncellmin);
		} else {
			__io__generic__copy( getDyncellmin(), dyncellmin);
		}
	}

	/**
	 * Get method for struct member 'dyncellwidth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Width of dynamic bind cell. </p>
	 * @see #__DNA__FIELD__dyncellwidth
	 */
	
	public float getDyncellwidth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 276);
		} else {
			return __io__block.readFloat(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'dyncellwidth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Width of dynamic bind cell. </p>
	 * @see #__DNA__FIELD__dyncellwidth
	 */
	
	public void setDyncellwidth(float dyncellwidth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 276, dyncellwidth);
		} else {
			__io__block.writeFloat(__io__address + 228, dyncellwidth);
		}
	}

	/**
	 * Get method for struct member 'bindmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Matrix of cage at binding time. </p>
	 * @see #__DNA__FIELD__bindmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getBindmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 280, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bindmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Matrix of cage at binding time. </p>
	 * @see #__DNA__FIELD__bindmat
	 */
	
	public void setBindmat(CArrayFacade<CArrayFacade<Float>> bindmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 280;
		} else {
			__dna__offset = 232;
		}
		if (__io__equals(bindmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bindmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bindmat);
		} else {
			__io__generic__copy( getBindmat(), bindmat);
		}
	}

	/**
	 * Get method for struct member 'bindweights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> deprecated storage Deprecated inefficient storage. </p>
	 * @see #__DNA__FIELD__bindweights
	 */
	
	public CPointer<Float> getBindweights() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 344);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 296);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bindweights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> deprecated storage Deprecated inefficient storage. </p>
	 * @see #__DNA__FIELD__bindweights
	 */
	
	public void setBindweights(CPointer<Float> bindweights) throws IOException
	{
		long __address = ((bindweights == null) ? 0 : bindweights.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 344, __address);
		} else {
			__io__block.writeLong(__io__address + 296, __address);
		}
	}

	/**
	 * Get method for struct member 'bindcos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated storage of cage coords. </p>
	 * @see #__DNA__FIELD__bindcos
	 */
	
	public CPointer<Float> getBindcos() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 352);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 300);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bindcos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Deprecated storage of cage coords. </p>
	 * @see #__DNA__FIELD__bindcos
	 */
	
	public void setBindcos(CPointer<Float> bindcos) throws IOException
	{
		long __address = ((bindcos == null) ? 0 : bindcos.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 352, __address);
		} else {
			__io__block.writeLong(__io__address + 300, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MeshDeformModifierData> __io__addressof() {
		return new CPointer<MeshDeformModifierData>(__io__address, new Class[]{MeshDeformModifierData.class}, __io__block, __io__blockTable);
	}

}
