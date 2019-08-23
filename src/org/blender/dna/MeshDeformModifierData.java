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

@CMetaData(size32=304, size64=360)
public class MeshDeformModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct MeshDeformModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for MeshDeformModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 116;

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
	 * <li>Actual Size (32bit/64bit): 96/112</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> mesh object </p>
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
	public static final long[] __DNA__FIELD__object = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> optional vertexgroup name, MAX_VGROUP_NAME </p>
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
	public static final long[] __DNA__FIELD__defgrp_name = new long[]{100, 120};

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
	public static final long[] __DNA__FIELD__gridsize = new long[]{164, 184};

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
	public static final long[] __DNA__FIELD__flag = new long[]{166, 186};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MeshDeformModifierData meshdeformmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = meshdeformmodifierdata.__dna__addressof(MeshDeformModifierData.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short[2]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{168, 188};

	/**
	 * Field descriptor (offset) for struct member 'bindinfluences'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of static binding influences </p>
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
	public static final long[] __DNA__FIELD__bindinfluences = new long[]{172, 192};

	/**
	 * Field descriptor (offset) for struct member 'bindoffsets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> offsets into influences array </p>
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
	public static final long[] __DNA__FIELD__bindoffsets = new long[]{176, 200};

	/**
	 * Field descriptor (offset) for struct member 'bindcagecos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> coordinates that cage was bound with </p>
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
	public static final long[] __DNA__FIELD__bindcagecos = new long[]{180, 208};

	/**
	 * Field descriptor (offset) for struct member 'totvert'.
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
	public static final long[] __DNA__FIELD__totvert = new long[]{184, 216};

	/**
	 * Field descriptor (offset) for struct member 'totcagevert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total vertices in mesh and cage </p>
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
	public static final long[] __DNA__FIELD__totcagevert = new long[]{188, 220};

	/**
	 * Field descriptor (offset) for struct member 'dyngrid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of dynamic binding grid with dynamic binding cell points </p>
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
	public static final long[] __DNA__FIELD__dyngrid = new long[]{192, 224};

	/**
	 * Field descriptor (offset) for struct member 'dyninfluences'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dynamic binding vertex influences </p>
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
	public static final long[] __DNA__FIELD__dyninfluences = new long[]{196, 232};

	/**
	 * Field descriptor (offset) for struct member 'dynverts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> is this vertex bound or not? </p>
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
	public static final long[] __DNA__FIELD__dynverts = new long[]{200, 240};

	/**
	 * Field descriptor (offset) for struct member 'dyngridsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of the dynamic bind grid </p>
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
	public static final long[] __DNA__FIELD__dyngridsize = new long[]{204, 248};

	/**
	 * Field descriptor (offset) for struct member 'totinfluence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number of vertex influences </p>
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
	public static final long[] __DNA__FIELD__totinfluence = new long[]{208, 252};

	/**
	 * Field descriptor (offset) for struct member 'dyncellmin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> offset of the dynamic bind grid </p>
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
	public static final long[] __DNA__FIELD__dyncellmin = new long[]{212, 256};

	/**
	 * Field descriptor (offset) for struct member 'dyncellwidth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> width of dynamic bind cell </p>
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
	public static final long[] __DNA__FIELD__dyncellwidth = new long[]{224, 268};

	/**
	 * Field descriptor (offset) for struct member 'bindmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> matrix of cage at binding time </p>
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
	public static final long[] __DNA__FIELD__bindmat = new long[]{228, 272};

	/**
	 * Field descriptor (offset) for struct member 'bindweights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> deprecated storage deprecated inefficient storage </p>
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
	public static final long[] __DNA__FIELD__bindweights = new long[]{292, 336};

	/**
	 * Field descriptor (offset) for struct member 'bindcos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> deprecated storage of cage coords </p>
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
	public static final long[] __DNA__FIELD__bindcos = new long[]{296, 344};

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
	 * <p> mesh object </p>
	 * @see #__DNA__FIELD__object
	 */
	
	public CPointer<BlenderObject> getObject() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'object'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> mesh object </p>
	 * @see #__DNA__FIELD__object
	 */
	
	public void setObject(CPointer<BlenderObject> object) throws IOException
	{
		long __address = ((object == null) ? 0 : object.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 96, __address);
		}
	}

	/**
	 * Get method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> optional vertexgroup name, MAX_VGROUP_NAME </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public CArrayFacade<Byte> getDefgrp_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'defgrp_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> optional vertexgroup name, MAX_VGROUP_NAME </p>
	 * @see #__DNA__FIELD__defgrp_name
	 */
	
	public void setDefgrp_name(CArrayFacade<Byte> defgrp_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 100;
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
			return __io__block.readShort(__io__address + 184);
		} else {
			return __io__block.readShort(__io__address + 164);
		}
	}

	/**
	 * Set method for struct member 'gridsize'.
	 * @see #__DNA__FIELD__gridsize
	 */
	
	public void setGridsize(short gridsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 184, gridsize);
		} else {
			__io__block.writeShort(__io__address + 164, gridsize);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 186);
		} else {
			return __io__block.readShort(__io__address + 166);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 186, flag);
		} else {
			__io__block.writeShort(__io__address + 166, flag);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Short> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Short> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 188;
		} else {
			__dna__offset = 168;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
		}
	}

	/**
	 * Get method for struct member 'bindinfluences'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of static binding influences </p>
	 * @see #__DNA__FIELD__bindinfluences
	 */
	
	public CPointer<MDefInfluence> getBindinfluences() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 172);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MDefInfluence.class};
		return new CPointer<MDefInfluence>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MDefInfluence.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bindinfluences'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of static binding influences </p>
	 * @see #__DNA__FIELD__bindinfluences
	 */
	
	public void setBindinfluences(CPointer<MDefInfluence> bindinfluences) throws IOException
	{
		long __address = ((bindinfluences == null) ? 0 : bindinfluences.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 172, __address);
		}
	}

	/**
	 * Get method for struct member 'bindoffsets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> offsets into influences array </p>
	 * @see #__DNA__FIELD__bindoffsets
	 */
	
	public CPointer<Integer> getBindoffsets() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		return new CPointer<Integer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bindoffsets'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> offsets into influences array </p>
	 * @see #__DNA__FIELD__bindoffsets
	 */
	
	public void setBindoffsets(CPointer<Integer> bindoffsets) throws IOException
	{
		long __address = ((bindoffsets == null) ? 0 : bindoffsets.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 200, __address);
		} else {
			__io__block.writeLong(__io__address + 176, __address);
		}
	}

	/**
	 * Get method for struct member 'bindcagecos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> coordinates that cage was bound with </p>
	 * @see #__DNA__FIELD__bindcagecos
	 */
	
	public CPointer<Float> getBindcagecos() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 180);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bindcagecos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> coordinates that cage was bound with </p>
	 * @see #__DNA__FIELD__bindcagecos
	 */
	
	public void setBindcagecos(CPointer<Float> bindcagecos) throws IOException
	{
		long __address = ((bindcagecos == null) ? 0 : bindcagecos.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 208, __address);
		} else {
			__io__block.writeLong(__io__address + 180, __address);
		}
	}

	/**
	 * Get method for struct member 'totvert'.
	 * @see #__DNA__FIELD__totvert
	 */
	
	public int getTotvert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 216);
		} else {
			return __io__block.readInt(__io__address + 184);
		}
	}

	/**
	 * Set method for struct member 'totvert'.
	 * @see #__DNA__FIELD__totvert
	 */
	
	public void setTotvert(int totvert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 216, totvert);
		} else {
			__io__block.writeInt(__io__address + 184, totvert);
		}
	}

	/**
	 * Get method for struct member 'totcagevert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total vertices in mesh and cage </p>
	 * @see #__DNA__FIELD__totcagevert
	 */
	
	public int getTotcagevert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 220);
		} else {
			return __io__block.readInt(__io__address + 188);
		}
	}

	/**
	 * Set method for struct member 'totcagevert'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total vertices in mesh and cage </p>
	 * @see #__DNA__FIELD__totcagevert
	 */
	
	public void setTotcagevert(int totcagevert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 220, totcagevert);
		} else {
			__io__block.writeInt(__io__address + 188, totcagevert);
		}
	}

	/**
	 * Get method for struct member 'dyngrid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of dynamic binding grid with dynamic binding cell points </p>
	 * @see #__DNA__FIELD__dyngrid
	 */
	
	public CPointer<MDefCell> getDyngrid() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MDefCell.class};
		return new CPointer<MDefCell>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MDefCell.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dyngrid'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> result of dynamic binding grid with dynamic binding cell points </p>
	 * @see #__DNA__FIELD__dyngrid
	 */
	
	public void setDyngrid(CPointer<MDefCell> dyngrid) throws IOException
	{
		long __address = ((dyngrid == null) ? 0 : dyngrid.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 192, __address);
		}
	}

	/**
	 * Get method for struct member 'dyninfluences'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dynamic binding vertex influences </p>
	 * @see #__DNA__FIELD__dyninfluences
	 */
	
	public CPointer<MDefInfluence> getDyninfluences() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 232);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 196);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MDefInfluence.class};
		return new CPointer<MDefInfluence>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MDefInfluence.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dyninfluences'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> dynamic binding vertex influences </p>
	 * @see #__DNA__FIELD__dyninfluences
	 */
	
	public void setDyninfluences(CPointer<MDefInfluence> dyninfluences) throws IOException
	{
		long __address = ((dyninfluences == null) ? 0 : dyninfluences.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 232, __address);
		} else {
			__io__block.writeLong(__io__address + 196, __address);
		}
	}

	/**
	 * Get method for struct member 'dynverts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> is this vertex bound or not? </p>
	 * @see #__DNA__FIELD__dynverts
	 */
	
	public CPointer<Integer> getDynverts() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 240);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 200);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		return new CPointer<Integer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dynverts'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> is this vertex bound or not? </p>
	 * @see #__DNA__FIELD__dynverts
	 */
	
	public void setDynverts(CPointer<Integer> dynverts) throws IOException
	{
		long __address = ((dynverts == null) ? 0 : dynverts.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 240, __address);
		} else {
			__io__block.writeLong(__io__address + 200, __address);
		}
	}

	/**
	 * Get method for struct member 'dyngridsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of the dynamic bind grid </p>
	 * @see #__DNA__FIELD__dyngridsize
	 */
	
	public int getDyngridsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 248);
		} else {
			return __io__block.readInt(__io__address + 204);
		}
	}

	/**
	 * Set method for struct member 'dyngridsize'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> size of the dynamic bind grid </p>
	 * @see #__DNA__FIELD__dyngridsize
	 */
	
	public void setDyngridsize(int dyngridsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 248, dyngridsize);
		} else {
			__io__block.writeInt(__io__address + 204, dyngridsize);
		}
	}

	/**
	 * Get method for struct member 'totinfluence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number of vertex influences </p>
	 * @see #__DNA__FIELD__totinfluence
	 */
	
	public int getTotinfluence() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 252);
		} else {
			return __io__block.readInt(__io__address + 208);
		}
	}

	/**
	 * Set method for struct member 'totinfluence'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> total number of vertex influences </p>
	 * @see #__DNA__FIELD__totinfluence
	 */
	
	public void setTotinfluence(int totinfluence) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 252, totinfluence);
		} else {
			__io__block.writeInt(__io__address + 208, totinfluence);
		}
	}

	/**
	 * Get method for struct member 'dyncellmin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> offset of the dynamic bind grid </p>
	 * @see #__DNA__FIELD__dyncellmin
	 */
	
	public CArrayFacade<Float> getDyncellmin() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 256, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 212, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dyncellmin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> offset of the dynamic bind grid </p>
	 * @see #__DNA__FIELD__dyncellmin
	 */
	
	public void setDyncellmin(CArrayFacade<Float> dyncellmin) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 256;
		} else {
			__dna__offset = 212;
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
	 * <p> width of dynamic bind cell </p>
	 * @see #__DNA__FIELD__dyncellwidth
	 */
	
	public float getDyncellwidth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 268);
		} else {
			return __io__block.readFloat(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'dyncellwidth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> width of dynamic bind cell </p>
	 * @see #__DNA__FIELD__dyncellwidth
	 */
	
	public void setDyncellwidth(float dyncellwidth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 268, dyncellwidth);
		} else {
			__io__block.writeFloat(__io__address + 224, dyncellwidth);
		}
	}

	/**
	 * Get method for struct member 'bindmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> matrix of cage at binding time </p>
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
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 272, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 228, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bindmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> matrix of cage at binding time </p>
	 * @see #__DNA__FIELD__bindmat
	 */
	
	public void setBindmat(CArrayFacade<CArrayFacade<Float>> bindmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 272;
		} else {
			__dna__offset = 228;
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
	 * <p> deprecated storage deprecated inefficient storage </p>
	 * @see #__DNA__FIELD__bindweights
	 */
	
	public CPointer<Float> getBindweights() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 336);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 292);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bindweights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> deprecated storage deprecated inefficient storage </p>
	 * @see #__DNA__FIELD__bindweights
	 */
	
	public void setBindweights(CPointer<Float> bindweights) throws IOException
	{
		long __address = ((bindweights == null) ? 0 : bindweights.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 336, __address);
		} else {
			__io__block.writeLong(__io__address + 292, __address);
		}
	}

	/**
	 * Get method for struct member 'bindcos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> deprecated storage of cage coords </p>
	 * @see #__DNA__FIELD__bindcos
	 */
	
	public CPointer<Float> getBindcos() throws IOException
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
	 * Set method for struct member 'bindcos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> deprecated storage of cage coords </p>
	 * @see #__DNA__FIELD__bindcos
	 */
	
	public void setBindcos(CPointer<Float> bindcos) throws IOException
	{
		long __address = ((bindcos == null) ? 0 : bindcos.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 344, __address);
		} else {
			__io__block.writeLong(__io__address + 296, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MeshDeformModifierData> __io__addressof() {
		return new CPointer<MeshDeformModifierData>(__io__address, new Class[]{MeshDeformModifierData.class}, __io__block, __io__blockTable);
	}

}
