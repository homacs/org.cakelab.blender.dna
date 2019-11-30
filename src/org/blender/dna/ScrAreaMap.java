package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ScrAreaMap'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=24, size64=48)
public class ScrAreaMap extends CFacade {

	/**
	 * This is the sdna index of the struct ScrAreaMap.
	 * <p>
	 * It is required when allocating a new block to store data for ScrAreaMap.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 262;

	/**
	 * Field descriptor (offset) for struct member 'vertbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** NOTE: KEEP ORDER IN SYNC WITH LISTBASES IN bScreen! ** {@link ScrVert}  - screens have vertices/edges to define areas. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrAreaMap scrareamap = ...;
	 * CPointer&lt;Object&gt; p = scrareamap.__dna__addressof(ScrAreaMap.__DNA__FIELD__vertbase);
	 * CPointer&lt;ListBase&gt; p_vertbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vertbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vertbase = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'edgebase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ScrEdge} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrAreaMap scrareamap = ...;
	 * CPointer&lt;Object&gt; p = scrareamap.__dna__addressof(ScrAreaMap.__DNA__FIELD__edgebase);
	 * CPointer&lt;ListBase&gt; p_edgebase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edgebase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edgebase = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'areabase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ScrArea} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ScrAreaMap scrareamap = ...;
	 * CPointer&lt;Object&gt; p = scrareamap.__dna__addressof(ScrAreaMap.__DNA__FIELD__areabase);
	 * CPointer&lt;ListBase&gt; p_areabase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'areabase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__areabase = new long[]{16, 32};

	public ScrAreaMap(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ScrAreaMap(ScrAreaMap that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'vertbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** NOTE: KEEP ORDER IN SYNC WITH LISTBASES IN bScreen! ** {@link ScrVert}  - screens have vertices/edges to define areas. </p>
	 * @see #__DNA__FIELD__vertbase
	 */
	
	public ListBase getVertbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vertbase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> ** NOTE: KEEP ORDER IN SYNC WITH LISTBASES IN bScreen! ** {@link ScrVert}  - screens have vertices/edges to define areas. </p>
	 * @see #__DNA__FIELD__vertbase
	 */
	
	public void setVertbase(ListBase vertbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(vertbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vertbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vertbase);
		} else {
			__io__generic__copy( getVertbase(), vertbase);
		}
	}

	/**
	 * Get method for struct member 'edgebase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ScrEdge} . </p>
	 * @see #__DNA__FIELD__edgebase
	 */
	
	public ListBase getEdgebase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'edgebase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ScrEdge} . </p>
	 * @see #__DNA__FIELD__edgebase
	 */
	
	public void setEdgebase(ListBase edgebase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(edgebase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, edgebase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, edgebase);
		} else {
			__io__generic__copy( getEdgebase(), edgebase);
		}
	}

	/**
	 * Get method for struct member 'areabase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ScrArea} . </p>
	 * @see #__DNA__FIELD__areabase
	 */
	
	public ListBase getAreabase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 32, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'areabase'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p>{@link ScrArea} . </p>
	 * @see #__DNA__FIELD__areabase
	 */
	
	public void setAreabase(ListBase areabase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 32;
		} else {
			__dna__offset = 16;
		}
		if (__io__equals(areabase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, areabase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, areabase);
		} else {
			__io__generic__copy( getAreabase(), areabase);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ScrAreaMap> __io__addressof() {
		return new CPointer<ScrAreaMap>(__io__address, new Class[]{ScrAreaMap.class}, __io__block, __io__blockTable);
	}

}
