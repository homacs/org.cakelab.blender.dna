package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'MovieTrackingObject'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=124, size64=152)
public class MovieTrackingObject extends CFacade {

	/**
	 * This is the sdna index of the struct MovieTrackingObject.
	 * <p>
	 * It is required when allocating a new block to store data for MovieTrackingObject.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 556;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingObject movietrackingobject = ...;
	 * CPointer&lt;Object&gt; p = movietrackingobject.__dna__addressof(MovieTrackingObject.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;MovieTrackingObject&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, MovieTrackingObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'MovieTrackingObject*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingObject movietrackingobject = ...;
	 * CPointer&lt;Object&gt; p = movietrackingobject.__dna__addressof(MovieTrackingObject.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;MovieTrackingObject&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, MovieTrackingObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'MovieTrackingObject*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique name of object<h4>Blender Source Code:</h4>
	 * <p> Name of tracking object, MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingObject movietrackingobject = ...;
	 * CPointer&lt;Object&gt; p = movietrackingobject.__dna__addressof(MovieTrackingObject.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingObject movietrackingobject = ...;
	 * CPointer&lt;Object&gt; p = movietrackingobject.__dna__addressof(MovieTrackingObject.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale of object solution in camera space<h4>Blender Source Code:</h4>
	 * <p> scale of object solution in amera space </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingObject movietrackingobject = ...;
	 * CPointer&lt;Object&gt; p = movietrackingobject.__dna__addressof(MovieTrackingObject.__DNA__FIELD__scale);
	 * CPointer&lt;Float&gt; p_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale = new long[]{76, 84};

	/**
	 * Field descriptor (offset) for struct member 'tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of tracks in this tracking data object<h4>Blender Source Code:</h4>
	 * <p> list of tracks use to tracking this object </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingObject movietrackingobject = ...;
	 * CPointer&lt;Object&gt; p = movietrackingobject.__dna__addressof(MovieTrackingObject.__DNA__FIELD__tracks);
	 * CPointer&lt;ListBase&gt; p_tracks = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tracks'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tracks = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'plane_tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of plane tracks in this tracking data object<h4>Blender Source Code:</h4>
	 * <p> list of plane tracks used by this object </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingObject movietrackingobject = ...;
	 * CPointer&lt;Object&gt; p = movietrackingobject.__dna__addressof(MovieTrackingObject.__DNA__FIELD__plane_tracks);
	 * CPointer&lt;ListBase&gt; p_plane_tracks = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'plane_tracks'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__plane_tracks = new long[]{88, 104};

	/**
	 * Field descriptor (offset) for struct member 'reconstruction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> reconstruction data for this object </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingObject movietrackingobject = ...;
	 * CPointer&lt;Object&gt; p = movietrackingobject.__dna__addressof(MovieTrackingObject.__DNA__FIELD__reconstruction);
	 * CPointer&lt;MovieTrackingReconstruction&gt; p_reconstruction = p.cast(new Class[]{MovieTrackingReconstruction.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reconstruction'</li>
	 * <li>Signature: 'MovieTrackingReconstruction'</li>
	 * <li>Actual Size (32bit/64bit): 20/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reconstruction = new long[]{96, 120};

	/**
	 * Field descriptor (offset) for struct member 'keyframe1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> reconstruction options </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingObject movietrackingobject = ...;
	 * CPointer&lt;Object&gt; p = movietrackingobject.__dna__addressof(MovieTrackingObject.__DNA__FIELD__keyframe1);
	 * CPointer&lt;Integer&gt; p_keyframe1 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyframe1'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyframe1 = new long[]{116, 144};

	/**
	 * Field descriptor (offset) for struct member 'keyframe2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> two keyframes for reconstruction initialization </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * MovieTrackingObject movietrackingobject = ...;
	 * CPointer&lt;Object&gt; p = movietrackingobject.__dna__addressof(MovieTrackingObject.__DNA__FIELD__keyframe2);
	 * CPointer&lt;Integer&gt; p_keyframe2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keyframe2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keyframe2 = new long[]{120, 148};

	public MovieTrackingObject(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected MovieTrackingObject(MovieTrackingObject that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<MovieTrackingObject> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingObject.class};
		return new CPointer<MovieTrackingObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<MovieTrackingObject> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<MovieTrackingObject> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{MovieTrackingObject.class};
		return new CPointer<MovieTrackingObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, MovieTrackingObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<MovieTrackingObject> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique name of object<h4>Blender Source Code:</h4>
	 * <p> Name of tracking object, MAX_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique name of object<h4>Blender Source Code:</h4>
	 * <p> Name of tracking object, MAX_NAME </p>
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 80);
		} else {
			return __io__block.readInt(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 80, flag);
		} else {
			__io__block.writeInt(__io__address + 72, flag);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale of object solution in camera space<h4>Blender Source Code:</h4>
	 * <p> scale of object solution in amera space </p>
	 * @see #__DNA__FIELD__scale
	 */
	
	public float getScale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale of object solution in camera space<h4>Blender Source Code:</h4>
	 * <p> scale of object solution in amera space </p>
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(float scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, scale);
		} else {
			__io__block.writeFloat(__io__address + 76, scale);
		}
	}

	/**
	 * Get method for struct member 'tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of tracks in this tracking data object<h4>Blender Source Code:</h4>
	 * <p> list of tracks use to tracking this object </p>
	 * @see #__DNA__FIELD__tracks
	 */
	
	public ListBase getTracks() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 88, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 80, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of tracks in this tracking data object<h4>Blender Source Code:</h4>
	 * <p> list of tracks use to tracking this object </p>
	 * @see #__DNA__FIELD__tracks
	 */
	
	public void setTracks(ListBase tracks) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(tracks, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tracks)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tracks);
		} else {
			__io__generic__copy( getTracks(), tracks);
		}
	}

	/**
	 * Get method for struct member 'plane_tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of plane tracks in this tracking data object<h4>Blender Source Code:</h4>
	 * <p> list of plane tracks used by this object </p>
	 * @see #__DNA__FIELD__plane_tracks
	 */
	
	public ListBase getPlane_tracks() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 104, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 88, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'plane_tracks'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Collection of plane tracks in this tracking data object<h4>Blender Source Code:</h4>
	 * <p> list of plane tracks used by this object </p>
	 * @see #__DNA__FIELD__plane_tracks
	 */
	
	public void setPlane_tracks(ListBase plane_tracks) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 104;
		} else {
			__dna__offset = 88;
		}
		if (__io__equals(plane_tracks, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, plane_tracks)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, plane_tracks);
		} else {
			__io__generic__copy( getPlane_tracks(), plane_tracks);
		}
	}

	/**
	 * Get method for struct member 'reconstruction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> reconstruction data for this object </p>
	 * @see #__DNA__FIELD__reconstruction
	 */
	
	public MovieTrackingReconstruction getReconstruction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MovieTrackingReconstruction(__io__address + 120, __io__block, __io__blockTable);
		} else {
			return new MovieTrackingReconstruction(__io__address + 96, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'reconstruction'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> reconstruction data for this object </p>
	 * @see #__DNA__FIELD__reconstruction
	 */
	
	public void setReconstruction(MovieTrackingReconstruction reconstruction) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 96;
		}
		if (__io__equals(reconstruction, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, reconstruction)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, reconstruction);
		} else {
			__io__generic__copy( getReconstruction(), reconstruction);
		}
	}

	/**
	 * Get method for struct member 'keyframe1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> reconstruction options </p>
	 * @see #__DNA__FIELD__keyframe1
	 */
	
	public int getKeyframe1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 144);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'keyframe1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> reconstruction options </p>
	 * @see #__DNA__FIELD__keyframe1
	 */
	
	public void setKeyframe1(int keyframe1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 144, keyframe1);
		} else {
			__io__block.writeInt(__io__address + 116, keyframe1);
		}
	}

	/**
	 * Get method for struct member 'keyframe2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> two keyframes for reconstruction initialization </p>
	 * @see #__DNA__FIELD__keyframe2
	 */
	
	public int getKeyframe2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 148);
		} else {
			return __io__block.readInt(__io__address + 120);
		}
	}

	/**
	 * Set method for struct member 'keyframe2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> two keyframes for reconstruction initialization </p>
	 * @see #__DNA__FIELD__keyframe2
	 */
	
	public void setKeyframe2(int keyframe2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 148, keyframe2);
		} else {
			__io__block.writeInt(__io__address + 120, keyframe2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<MovieTrackingObject> __io__addressof() {
		return new CPointer<MovieTrackingObject>(__io__address, new Class[]{MovieTrackingObject.class}, __io__block, __io__blockTable);
	}

}
