package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Script'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p>{@link Script}  Runtime Data - Obsolete (pre 2.5) </p>
 */

@CMetaData(size32=1428, size64=1480)
public class Script extends CFacade {

	/**
	 * This is the sdna index of the struct Script.
	 * <p>
	 * It is required when allocating a new block to store data for Script.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 230;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Script script = ...;
	 * CPointer&lt;Object&gt; p = script.__dna__addressof(Script.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 120/152</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'py_draw'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Script script = ...;
	 * CPointer&lt;Object&gt; p = script.__dna__addressof(Script.__DNA__FIELD__py_draw);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_py_draw = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'py_draw'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__py_draw = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'py_event'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Script script = ...;
	 * CPointer&lt;Object&gt; p = script.__dna__addressof(Script.__DNA__FIELD__py_event);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_py_event = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'py_event'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__py_event = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'py_button'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Script script = ...;
	 * CPointer&lt;Object&gt; p = script.__dna__addressof(Script.__DNA__FIELD__py_button);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_py_button = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'py_button'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__py_button = new long[]{128, 168};

	/**
	 * Field descriptor (offset) for struct member 'py_browsercallback'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Script script = ...;
	 * CPointer&lt;Object&gt; p = script.__dna__addressof(Script.__DNA__FIELD__py_browsercallback);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_py_browsercallback = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'py_browsercallback'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__py_browsercallback = new long[]{132, 176};

	/**
	 * Field descriptor (offset) for struct member 'py_globaldict'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Script script = ...;
	 * CPointer&lt;Object&gt; p = script.__dna__addressof(Script.__DNA__FIELD__py_globaldict);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_py_globaldict = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'py_globaldict'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__py_globaldict = new long[]{136, 184};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Script script = ...;
	 * CPointer&lt;Object&gt; p = script.__dna__addressof(Script.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{140, 192};

	/**
	 * Field descriptor (offset) for struct member 'lastspace'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Script script = ...;
	 * CPointer&lt;Object&gt; p = script.__dna__addressof(Script.__DNA__FIELD__lastspace);
	 * CPointer&lt;Integer&gt; p_lastspace = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastspace'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastspace = new long[]{144, 196};

	/**
	 * Field descriptor (offset) for struct member 'scriptname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Store the script file here so we can re-run it on loading blender, if "Enable Scripts" is on1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Script script = ...;
	 * CPointer&lt;Object&gt; p = script.__dna__addressof(Script.__DNA__FIELD__scriptname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_scriptname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scriptname'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scriptname = new long[]{148, 200};

	/**
	 * Field descriptor (offset) for struct member 'scriptarg'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Script script = ...;
	 * CPointer&lt;Object&gt; p = script.__dna__addressof(Script.__DNA__FIELD__scriptarg);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_scriptarg = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scriptarg'</li>
	 * <li>Signature: 'char[256]'</li>
	 * <li>Actual Size (32bit/64bit): 256/256</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scriptarg = new long[]{1172, 1224};

	public Script(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Script(Script that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public ID getId() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(ID id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, id);
		} else {
			__io__generic__copy( getId(), id);
		}
	}

	/**
	 * Get method for struct member 'py_draw'.
	 * @see #__DNA__FIELD__py_draw
	 */
	
	public CPointer<Object> getPy_draw() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'py_draw'.
	 * @see #__DNA__FIELD__py_draw
	 */
	
	public void setPy_draw(CPointer<Object> py_draw) throws IOException
	{
		long __address = ((py_draw == null) ? 0 : py_draw.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'py_event'.
	 * @see #__DNA__FIELD__py_event
	 */
	
	public CPointer<Object> getPy_event() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 124);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'py_event'.
	 * @see #__DNA__FIELD__py_event
	 */
	
	public void setPy_event(CPointer<Object> py_event) throws IOException
	{
		long __address = ((py_event == null) ? 0 : py_event.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 124, __address);
		}
	}

	/**
	 * Get method for struct member 'py_button'.
	 * @see #__DNA__FIELD__py_button
	 */
	
	public CPointer<Object> getPy_button() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'py_button'.
	 * @see #__DNA__FIELD__py_button
	 */
	
	public void setPy_button(CPointer<Object> py_button) throws IOException
	{
		long __address = ((py_button == null) ? 0 : py_button.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 168, __address);
		} else {
			__io__block.writeLong(__io__address + 128, __address);
		}
	}

	/**
	 * Get method for struct member 'py_browsercallback'.
	 * @see #__DNA__FIELD__py_browsercallback
	 */
	
	public CPointer<Object> getPy_browsercallback() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 132);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'py_browsercallback'.
	 * @see #__DNA__FIELD__py_browsercallback
	 */
	
	public void setPy_browsercallback(CPointer<Object> py_browsercallback) throws IOException
	{
		long __address = ((py_browsercallback == null) ? 0 : py_browsercallback.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 132, __address);
		}
	}

	/**
	 * Get method for struct member 'py_globaldict'.
	 * @see #__DNA__FIELD__py_globaldict
	 */
	
	public CPointer<Object> getPy_globaldict() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 184);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'py_globaldict'.
	 * @see #__DNA__FIELD__py_globaldict
	 */
	
	public void setPy_globaldict(CPointer<Object> py_globaldict) throws IOException
	{
		long __address = ((py_globaldict == null) ? 0 : py_globaldict.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 184, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 192);
		} else {
			return __io__block.readInt(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 192, flags);
		} else {
			__io__block.writeInt(__io__address + 140, flags);
		}
	}

	/**
	 * Get method for struct member 'lastspace'.
	 * @see #__DNA__FIELD__lastspace
	 */
	
	public int getLastspace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 196);
		} else {
			return __io__block.readInt(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'lastspace'.
	 * @see #__DNA__FIELD__lastspace
	 */
	
	public void setLastspace(int lastspace) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 196, lastspace);
		} else {
			__io__block.writeInt(__io__address + 144, lastspace);
		}
	}

	/**
	 * Get method for struct member 'scriptname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Store the script file here so we can re-run it on loading blender, if "Enable Scripts" is on1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__scriptname
	 */
	
	public CArrayFacade<Byte> getScriptname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 200, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scriptname'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Store the script file here so we can re-run it on loading blender, if "Enable Scripts" is on1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__scriptname
	 */
	
	public void setScriptname(CArrayFacade<Byte> scriptname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 200;
		} else {
			__dna__offset = 148;
		}
		if (__io__equals(scriptname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scriptname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scriptname);
		} else {
			__io__generic__copy( getScriptname(), scriptname);
		}
	}

	/**
	 * Get method for struct member 'scriptarg'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__scriptarg
	 */
	
	public CArrayFacade<Byte> getScriptarg() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			256
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1224, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scriptarg'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1024 = FILE_MAX. </p>
	 * @see #__DNA__FIELD__scriptarg
	 */
	
	public void setScriptarg(CArrayFacade<Byte> scriptarg) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1224;
		} else {
			__dna__offset = 1172;
		}
		if (__io__equals(scriptarg, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scriptarg)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scriptarg);
		} else {
			__io__generic__copy( getScriptarg(), scriptarg);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Script> __io__addressof() {
		return new CPointer<Script>(__io__address, new Class[]{Script.class}, __io__block, __io__blockTable);
	}

}
