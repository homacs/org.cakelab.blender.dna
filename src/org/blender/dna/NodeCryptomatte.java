package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.io.dna.internal.StructDNA;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeCryptomatte'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=152, size64=176)
public class NodeCryptomatte extends CFacade {

	/**
	 * This is the sdna index of the struct NodeCryptomatte.
	 * <p>
	 * It is required when allocating a new block to store data for NodeCryptomatte.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 479;

	/**
	 * Field descriptor (offset) for struct member 'iuser'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code><code></code> , so storage needs to be cast to {@link ImageUser}  directly. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte nodecryptomatte = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte.__dna__addressof(NodeCryptomatte.__DNA__FIELD__iuser);
	 * CPointer&lt;ImageUser&gt; p_iuser = p.cast(new Class[]{ImageUser.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iuser'</li>
	 * <li>Signature: 'ImageUser'</li>
	 * <li>Actual Size (32bit/64bit): 36/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iuser = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'entries'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code> Contains {@link CryptomatteEntry}</code> . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte nodecryptomatte = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte.__dna__addressof(NodeCryptomatte.__DNA__FIELD__entries);
	 * CPointer&lt;ListBase&gt; p_entries = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'entries'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__entries = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'layer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte nodecryptomatte = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte.__dna__addressof(NodeCryptomatte.__DNA__FIELD__layer_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_layer_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'layer_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__layer_name = new long[]{44, 56};

	/**
	 * Field descriptor (offset) for struct member 'matte_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  as a string for opening in 2.80-2.91. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte nodecryptomatte = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte.__dna__addressof(NodeCryptomatte.__DNA__FIELD__matte_id);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_matte_id = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'matte_id'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__matte_id = new long[]{108, 120};

	/**
	 * Field descriptor (offset) for struct member 'num_inputs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte nodecryptomatte = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte.__dna__addressof(NodeCryptomatte.__DNA__FIELD__num_inputs);
	 * CPointer&lt;Integer&gt; p_num_inputs = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'num_inputs'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__num_inputs = new long[]{112, 128};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte nodecryptomatte = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte.__dna__addressof(NodeCryptomatte.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{116, 132};

	/**
	 * Field descriptor (offset) for struct member 'runtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeCryptomatte nodecryptomatte = ...;
	 * CPointer&lt;Object&gt; p = nodecryptomatte.__dna__addressof(NodeCryptomatte.__DNA__FIELD__runtime);
	 * CPointer&lt;NodeCryptomatte_Runtime&gt; p_runtime = p.cast(new Class[]{NodeCryptomatte_Runtime.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'runtime'</li>
	 * <li>Signature: 'NodeCryptomatte_Runtime'</li>
	 * <li>Actual Size (32bit/64bit): 32/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__runtime = new long[]{120, 136};

	public NodeCryptomatte(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeCryptomatte(NodeCryptomatte that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'iuser'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code><code></code> , so storage needs to be cast to {@link ImageUser}  directly. </p>
	 * @see #__DNA__FIELD__iuser
	 */
	
	public ImageUser getIuser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImageUser(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ImageUser(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'iuser'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code><code></code> , so storage needs to be cast to {@link ImageUser}  directly. </p>
	 * @see #__DNA__FIELD__iuser
	 */
	
	public void setIuser(ImageUser iuser) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(iuser, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, iuser)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, iuser);
		} else {
			__io__generic__copy( getIuser(), iuser);
		}
	}

	/**
	 * Get method for struct member 'entries'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code> Contains {@link CryptomatteEntry}</code> . </p>
	 * @see #__DNA__FIELD__entries
	 */
	
	public ListBase getEntries() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 40, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 36, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'entries'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code> Contains {@link CryptomatteEntry}</code> . </p>
	 * @see #__DNA__FIELD__entries
	 */
	
	public void setEntries(ListBase entries) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(entries, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, entries)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, entries);
		} else {
			__io__generic__copy( getEntries(), entries);
		}
	}

	/**
	 * Get method for struct member 'layer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__layer_name
	 */
	
	public CArrayFacade<Byte> getLayer_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 56, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 44, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'layer_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> MAX_NAME </p>
	 * @see #__DNA__FIELD__layer_name
	 */
	
	public void setLayer_name(CArrayFacade<Byte> layer_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 56;
		} else {
			__dna__offset = 44;
		}
		if (__io__equals(layer_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, layer_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, layer_name);
		} else {
			__io__generic__copy( getLayer_name(), layer_name);
		}
	}

	/**
	 * Get method for struct member 'matte_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  as a string for opening in 2.80-2.91. </p>
	 * @see #__DNA__FIELD__matte_id
	 */
	
	public CPointer<Byte> getMatte_id() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 108);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'matte_id'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p><code></code>  as a string for opening in 2.80-2.91. </p>
	 * @see #__DNA__FIELD__matte_id
	 */
	
	public void setMatte_id(CPointer<Byte> matte_id) throws IOException
	{
		long __address = ((matte_id == null) ? 0 : matte_id.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 108, __address);
		}
	}

	/**
	 * Get method for struct member 'num_inputs'.
	 * @see #__DNA__FIELD__num_inputs
	 */
	
	public int getNum_inputs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 128);
		} else {
			return __io__block.readInt(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'num_inputs'.
	 * @see #__DNA__FIELD__num_inputs
	 */
	
	public void setNum_inputs(int num_inputs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 128, num_inputs);
		} else {
			__io__block.writeInt(__io__address + 112, num_inputs);
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
			return new CArrayFacade<Byte>(__io__address + 132, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 132;
		} else {
			__dna__offset = 116;
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
	 * Get method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public NodeCryptomatte_Runtime getRuntime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new NodeCryptomatte_Runtime(__io__address + 136, __io__block, __io__blockTable);
		} else {
			return new NodeCryptomatte_Runtime(__io__address + 120, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'runtime'.
	 * @see #__DNA__FIELD__runtime
	 */
	
	public void setRuntime(NodeCryptomatte_Runtime runtime) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 136;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(runtime, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, runtime)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, runtime);
		} else {
			__io__generic__copy( getRuntime(), runtime);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeCryptomatte> __io__addressof() {
		return new CPointer<NodeCryptomatte>(__io__address, new Class[]{NodeCryptomatte.class}, __io__block, __io__blockTable);
	}

}
