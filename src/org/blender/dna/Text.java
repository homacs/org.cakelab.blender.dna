package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Text'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=160, size64=208)
public class Text extends CFacade {

	/**
	 * This is the sdna index of the struct Text.
	 * <p>
	 * It is required when allocating a new block to store data for Text.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 19;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Text text = ...;
	 * CPointer&lt;Object&gt; p = text.__dna__addressof(Text.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique data-block ID name
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Text text = ...;
	 * CPointer&lt;Object&gt; p = text.__dna__addressof(Text.__DNA__FIELD__name);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Text text = ...;
	 * CPointer&lt;Object&gt; p = text.__dna__addressof(Text.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'nlines'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Text text = ...;
	 * CPointer&lt;Object&gt; p = text.__dna__addressof(Text.__DNA__FIELD__nlines);
	 * CPointer&lt;Integer&gt; p_nlines = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'nlines'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__nlines = new long[]{108, 132};

	/**
	 * Field descriptor (offset) for struct member 'lines'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Lines of text
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Text text = ...;
	 * CPointer&lt;Object&gt; p = text.__dna__addressof(Text.__DNA__FIELD__lines);
	 * CPointer&lt;ListBase&gt; p_lines = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lines'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lines = new long[]{112, 136};

	/**
	 * Field descriptor (offset) for struct member 'curl'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Text text = ...;
	 * CPointer&lt;Object&gt; p = text.__dna__addressof(Text.__DNA__FIELD__curl);
	 * CPointer&lt;CPointer&lt;TextLine&gt;&gt; p_curl = p.cast(new Class[]{CPointer.class, TextLine.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curl'</li>
	 * <li>Signature: 'TextLine*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curl = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'sell'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Text text = ...;
	 * CPointer&lt;Object&gt; p = text.__dna__addressof(Text.__DNA__FIELD__sell);
	 * CPointer&lt;CPointer&lt;TextLine&gt;&gt; p_sell = p.cast(new Class[]{CPointer.class, TextLine.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sell'</li>
	 * <li>Signature: 'TextLine*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sell = new long[]{124, 160};

	/**
	 * Field descriptor (offset) for struct member 'curc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Text text = ...;
	 * CPointer&lt;Object&gt; p = text.__dna__addressof(Text.__DNA__FIELD__curc);
	 * CPointer&lt;Integer&gt; p_curc = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curc'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curc = new long[]{128, 168};

	/**
	 * Field descriptor (offset) for struct member 'selc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Text text = ...;
	 * CPointer&lt;Object&gt; p = text.__dna__addressof(Text.__DNA__FIELD__selc);
	 * CPointer&lt;Integer&gt; p_selc = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'selc'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__selc = new long[]{132, 172};

	/**
	 * Field descriptor (offset) for struct member 'undo_buf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Text text = ...;
	 * CPointer&lt;Object&gt; p = text.__dna__addressof(Text.__DNA__FIELD__undo_buf);
	 * CPointer&lt;CPointer&lt;Byte&gt;&gt; p_undo_buf = p.cast(new Class[]{CPointer.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'undo_buf'</li>
	 * <li>Signature: 'char*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__undo_buf = new long[]{136, 176};

	/**
	 * Field descriptor (offset) for struct member 'undo_pos'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Text text = ...;
	 * CPointer&lt;Object&gt; p = text.__dna__addressof(Text.__DNA__FIELD__undo_pos);
	 * CPointer&lt;Integer&gt; p_undo_pos = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'undo_pos'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__undo_pos = new long[]{140, 184};

	/**
	 * Field descriptor (offset) for struct member 'undo_len'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Text text = ...;
	 * CPointer&lt;Object&gt; p = text.__dna__addressof(Text.__DNA__FIELD__undo_len);
	 * CPointer&lt;Integer&gt; p_undo_len = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'undo_len'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__undo_len = new long[]{144, 188};

	/**
	 * Field descriptor (offset) for struct member 'compiled'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Text text = ...;
	 * CPointer&lt;Object&gt; p = text.__dna__addressof(Text.__DNA__FIELD__compiled);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_compiled = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'compiled'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__compiled = new long[]{148, 192};

	/**
	 * Field descriptor (offset) for struct member 'mtime'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Text text = ...;
	 * CPointer&lt;Object&gt; p = text.__dna__addressof(Text.__DNA__FIELD__mtime);
	 * CPointer&lt;Double&gt; p_mtime = p.cast(new Class[]{Double.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mtime'</li>
	 * <li>Signature: 'double'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mtime = new long[]{152, 200};

	public Text(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Text(Text that) {
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
	 * Get method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique data-block ID name
	 * @see #__DNA__FIELD__name
	 */
	
	public CPointer<Byte> getName() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Unique data-block ID name
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CPointer<Byte> name) throws IOException
	{
		long __address = ((name == null) ? 0 : name.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 128);
		} else {
			return __io__block.readInt(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 128, flags);
		} else {
			__io__block.writeInt(__io__address + 104, flags);
		}
	}

	/**
	 * Get method for struct member 'nlines'.
	 * @see #__DNA__FIELD__nlines
	 */
	
	public int getNlines() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 132);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'nlines'.
	 * @see #__DNA__FIELD__nlines
	 */
	
	public void setNlines(int nlines) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 132, nlines);
		} else {
			__io__block.writeInt(__io__address + 108, nlines);
		}
	}

	/**
	 * Get method for struct member 'lines'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Lines of text
	 * @see #__DNA__FIELD__lines
	 */
	
	public ListBase getLines() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 136, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 112, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lines'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Lines of text
	 * @see #__DNA__FIELD__lines
	 */
	
	public void setLines(ListBase lines) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 136;
		} else {
			__dna__offset = 112;
		}
		if (__io__equals(lines, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lines)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lines);
		} else {
			__io__generic__copy( getLines(), lines);
		}
	}

	/**
	 * Get method for struct member 'curl'.
	 * @see #__DNA__FIELD__curl
	 */
	
	public CPointer<TextLine> getCurl() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{TextLine.class};
		return new CPointer<TextLine>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, TextLine.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curl'.
	 * @see #__DNA__FIELD__curl
	 */
	
	public void setCurl(CPointer<TextLine> curl) throws IOException
	{
		long __address = ((curl == null) ? 0 : curl.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'sell'.
	 * @see #__DNA__FIELD__sell
	 */
	
	public CPointer<TextLine> getSell() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 124);
		}
		Class<?>[] __dna__targetTypes = new Class[]{TextLine.class};
		return new CPointer<TextLine>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, TextLine.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'sell'.
	 * @see #__DNA__FIELD__sell
	 */
	
	public void setSell(CPointer<TextLine> sell) throws IOException
	{
		long __address = ((sell == null) ? 0 : sell.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 124, __address);
		}
	}

	/**
	 * Get method for struct member 'curc'.
	 * @see #__DNA__FIELD__curc
	 */
	
	public int getCurc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 168);
		} else {
			return __io__block.readInt(__io__address + 128);
		}
	}

	/**
	 * Set method for struct member 'curc'.
	 * @see #__DNA__FIELD__curc
	 */
	
	public void setCurc(int curc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 168, curc);
		} else {
			__io__block.writeInt(__io__address + 128, curc);
		}
	}

	/**
	 * Get method for struct member 'selc'.
	 * @see #__DNA__FIELD__selc
	 */
	
	public int getSelc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 172);
		} else {
			return __io__block.readInt(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'selc'.
	 * @see #__DNA__FIELD__selc
	 */
	
	public void setSelc(int selc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 172, selc);
		} else {
			__io__block.writeInt(__io__address + 132, selc);
		}
	}

	/**
	 * Get method for struct member 'undo_buf'.
	 * @see #__DNA__FIELD__undo_buf
	 */
	
	public CPointer<Byte> getUndo_buf() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 176);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		return new CPointer<Byte>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'undo_buf'.
	 * @see #__DNA__FIELD__undo_buf
	 */
	
	public void setUndo_buf(CPointer<Byte> undo_buf) throws IOException
	{
		long __address = ((undo_buf == null) ? 0 : undo_buf.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 176, __address);
		} else {
			__io__block.writeLong(__io__address + 136, __address);
		}
	}

	/**
	 * Get method for struct member 'undo_pos'.
	 * @see #__DNA__FIELD__undo_pos
	 */
	
	public int getUndo_pos() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 184);
		} else {
			return __io__block.readInt(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'undo_pos'.
	 * @see #__DNA__FIELD__undo_pos
	 */
	
	public void setUndo_pos(int undo_pos) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 184, undo_pos);
		} else {
			__io__block.writeInt(__io__address + 140, undo_pos);
		}
	}

	/**
	 * Get method for struct member 'undo_len'.
	 * @see #__DNA__FIELD__undo_len
	 */
	
	public int getUndo_len() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 188);
		} else {
			return __io__block.readInt(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'undo_len'.
	 * @see #__DNA__FIELD__undo_len
	 */
	
	public void setUndo_len(int undo_len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 188, undo_len);
		} else {
			__io__block.writeInt(__io__address + 144, undo_len);
		}
	}

	/**
	 * Get method for struct member 'compiled'.
	 * @see #__DNA__FIELD__compiled
	 */
	
	public CPointer<Object> getCompiled() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 192);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'compiled'.
	 * @see #__DNA__FIELD__compiled
	 */
	
	public void setCompiled(CPointer<Object> compiled) throws IOException
	{
		long __address = ((compiled == null) ? 0 : compiled.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 192, __address);
		} else {
			__io__block.writeLong(__io__address + 148, __address);
		}
	}

	/**
	 * Get method for struct member 'mtime'.
	 * @see #__DNA__FIELD__mtime
	 */
	
	public double getMtime() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readDouble(__io__address + 200);
		} else {
			return __io__block.readDouble(__io__address + 152);
		}
	}

	/**
	 * Set method for struct member 'mtime'.
	 * @see #__DNA__FIELD__mtime
	 */
	
	public void setMtime(double mtime) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeDouble(__io__address + 200, mtime);
		} else {
			__io__block.writeDouble(__io__address + 152, mtime);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Text> __io__addressof() {
		return new CPointer<Text>(__io__address, new Class[]{Text.class}, __io__block, __io__blockTable);
	}

}
