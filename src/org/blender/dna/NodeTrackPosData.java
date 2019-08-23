package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeTrackPosData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=128, size64=128)
public class NodeTrackPosData extends CFacade {

	/**
	 * This is the sdna index of the struct NodeTrackPosData.
	 * <p>
	 * It is required when allocating a new block to store data for NodeTrackPosData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 447;

	/**
	 * Field descriptor (offset) for struct member 'tracking_object'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTrackPosData nodetrackposdata = ...;
	 * CPointer&lt;Object&gt; p = nodetrackposdata.__dna__addressof(NodeTrackPosData.__DNA__FIELD__tracking_object);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_tracking_object = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tracking_object'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tracking_object = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'track_name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTrackPosData nodetrackposdata = ...;
	 * CPointer&lt;Object&gt; p = nodetrackposdata.__dna__addressof(NodeTrackPosData.__DNA__FIELD__track_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_track_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'track_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__track_name = new long[]{64, 64};

	public NodeTrackPosData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeTrackPosData(NodeTrackPosData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'tracking_object'.
	 * @see #__DNA__FIELD__tracking_object
	 */
	
	public CArrayFacade<Byte> getTracking_object() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tracking_object'.
	 * @see #__DNA__FIELD__tracking_object
	 */
	
	public void setTracking_object(CArrayFacade<Byte> tracking_object) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(tracking_object, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tracking_object)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tracking_object);
		} else {
			__io__generic__copy( getTracking_object(), tracking_object);
		}
	}

	/**
	 * Get method for struct member 'track_name'.
	 * @see #__DNA__FIELD__track_name
	 */
	
	public CArrayFacade<Byte> getTrack_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 64, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'track_name'.
	 * @see #__DNA__FIELD__track_name
	 */
	
	public void setTrack_name(CArrayFacade<Byte> track_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 64;
		} else {
			__dna__offset = 64;
		}
		if (__io__equals(track_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, track_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, track_name);
		} else {
			__io__generic__copy( getTrack_name(), track_name);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeTrackPosData> __io__addressof() {
		return new CPointer<NodeTrackPosData>(__io__address, new Class[]{NodeTrackPosData.class}, __io__block, __io__blockTable);
	}

}
