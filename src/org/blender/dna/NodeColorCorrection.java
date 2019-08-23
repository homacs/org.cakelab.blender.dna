package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeColorCorrection'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=104, size64=104)
public class NodeColorCorrection extends CFacade {

	/**
	 * This is the sdna index of the struct NodeColorCorrection.
	 * <p>
	 * It is required when allocating a new block to store data for NodeColorCorrection.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 403;

	/**
	 * Field descriptor (offset) for struct member 'master'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorCorrection nodecolorcorrection = ...;
	 * CPointer&lt;Object&gt; p = nodecolorcorrection.__dna__addressof(NodeColorCorrection.__DNA__FIELD__master);
	 * CPointer&lt;ColorCorrectionData&gt; p_master = p.cast(new Class[]{ColorCorrectionData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'master'</li>
	 * <li>Signature: 'ColorCorrectionData'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__master = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'shadows'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorCorrection nodecolorcorrection = ...;
	 * CPointer&lt;Object&gt; p = nodecolorcorrection.__dna__addressof(NodeColorCorrection.__DNA__FIELD__shadows);
	 * CPointer&lt;ColorCorrectionData&gt; p_shadows = p.cast(new Class[]{ColorCorrectionData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shadows'</li>
	 * <li>Signature: 'ColorCorrectionData'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shadows = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'midtones'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorCorrection nodecolorcorrection = ...;
	 * CPointer&lt;Object&gt; p = nodecolorcorrection.__dna__addressof(NodeColorCorrection.__DNA__FIELD__midtones);
	 * CPointer&lt;ColorCorrectionData&gt; p_midtones = p.cast(new Class[]{ColorCorrectionData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'midtones'</li>
	 * <li>Signature: 'ColorCorrectionData'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__midtones = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'highlights'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorCorrection nodecolorcorrection = ...;
	 * CPointer&lt;Object&gt; p = nodecolorcorrection.__dna__addressof(NodeColorCorrection.__DNA__FIELD__highlights);
	 * CPointer&lt;ColorCorrectionData&gt; p_highlights = p.cast(new Class[]{ColorCorrectionData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'highlights'</li>
	 * <li>Signature: 'ColorCorrectionData'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__highlights = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'startmidtones'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorCorrection nodecolorcorrection = ...;
	 * CPointer&lt;Object&gt; p = nodecolorcorrection.__dna__addressof(NodeColorCorrection.__DNA__FIELD__startmidtones);
	 * CPointer&lt;Float&gt; p_startmidtones = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'startmidtones'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__startmidtones = new long[]{96, 96};

	/**
	 * Field descriptor (offset) for struct member 'endmidtones'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorCorrection nodecolorcorrection = ...;
	 * CPointer&lt;Object&gt; p = nodecolorcorrection.__dna__addressof(NodeColorCorrection.__DNA__FIELD__endmidtones);
	 * CPointer&lt;Float&gt; p_endmidtones = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'endmidtones'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__endmidtones = new long[]{100, 100};

	public NodeColorCorrection(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeColorCorrection(NodeColorCorrection that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'master'.
	 * @see #__DNA__FIELD__master
	 */
	
	public ColorCorrectionData getMaster() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorCorrectionData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ColorCorrectionData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'master'.
	 * @see #__DNA__FIELD__master
	 */
	
	public void setMaster(ColorCorrectionData master) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(master, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, master)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, master);
		} else {
			__io__generic__copy( getMaster(), master);
		}
	}

	/**
	 * Get method for struct member 'shadows'.
	 * @see #__DNA__FIELD__shadows
	 */
	
	public ColorCorrectionData getShadows() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorCorrectionData(__io__address + 24, __io__block, __io__blockTable);
		} else {
			return new ColorCorrectionData(__io__address + 24, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shadows'.
	 * @see #__DNA__FIELD__shadows
	 */
	
	public void setShadows(ColorCorrectionData shadows) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(shadows, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shadows)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shadows);
		} else {
			__io__generic__copy( getShadows(), shadows);
		}
	}

	/**
	 * Get method for struct member 'midtones'.
	 * @see #__DNA__FIELD__midtones
	 */
	
	public ColorCorrectionData getMidtones() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorCorrectionData(__io__address + 48, __io__block, __io__blockTable);
		} else {
			return new ColorCorrectionData(__io__address + 48, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'midtones'.
	 * @see #__DNA__FIELD__midtones
	 */
	
	public void setMidtones(ColorCorrectionData midtones) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(midtones, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, midtones)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, midtones);
		} else {
			__io__generic__copy( getMidtones(), midtones);
		}
	}

	/**
	 * Get method for struct member 'highlights'.
	 * @see #__DNA__FIELD__highlights
	 */
	
	public ColorCorrectionData getHighlights() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorCorrectionData(__io__address + 72, __io__block, __io__blockTable);
		} else {
			return new ColorCorrectionData(__io__address + 72, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'highlights'.
	 * @see #__DNA__FIELD__highlights
	 */
	
	public void setHighlights(ColorCorrectionData highlights) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(highlights, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, highlights)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, highlights);
		} else {
			__io__generic__copy( getHighlights(), highlights);
		}
	}

	/**
	 * Get method for struct member 'startmidtones'.
	 * @see #__DNA__FIELD__startmidtones
	 */
	
	public float getStartmidtones() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 96);
		} else {
			return __io__block.readFloat(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'startmidtones'.
	 * @see #__DNA__FIELD__startmidtones
	 */
	
	public void setStartmidtones(float startmidtones) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 96, startmidtones);
		} else {
			__io__block.writeFloat(__io__address + 96, startmidtones);
		}
	}

	/**
	 * Get method for struct member 'endmidtones'.
	 * @see #__DNA__FIELD__endmidtones
	 */
	
	public float getEndmidtones() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 100);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'endmidtones'.
	 * @see #__DNA__FIELD__endmidtones
	 */
	
	public void setEndmidtones(float endmidtones) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 100, endmidtones);
		} else {
			__io__block.writeFloat(__io__address + 100, endmidtones);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeColorCorrection> __io__addressof() {
		return new CPointer<NodeColorCorrection>(__io__address, new Class[]{NodeColorCorrection.class}, __io__block, __io__blockTable);
	}

}
