package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Ipo'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><mdash/>  ID-Datablock <mdash/>  IPO Data-Block </p>
 */

@CMetaData(size32=152, size64=192)
public class Ipo extends CFacade {

	/**
	 * This is the sdna index of the struct Ipo.
	 * <p>
	 * It is required when allocating a new block to store data for Ipo.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 20;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Ipo ipo = ...;
	 * CPointer&lt;Object&gt; p = ipo.__dna__addressof(Ipo.__DNA__FIELD__id);
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
	 * Field descriptor (offset) for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> A list of {@link IpoCurve}  structs in a linked list. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Ipo ipo = ...;
	 * CPointer&lt;Object&gt; p = ipo.__dna__addressof(Ipo.__DNA__FIELD__curve);
	 * CPointer&lt;ListBase&gt; p_curve = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve = new long[]{120, 152};

	/**
	 * Field descriptor (offset) for struct member 'cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rect defining extents of keyframes?. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Ipo ipo = ...;
	 * CPointer&lt;Object&gt; p = ipo.__dna__addressof(Ipo.__DNA__FIELD__cur);
	 * CPointer&lt;rctf&gt; p_cur = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cur'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cur = new long[]{128, 168};

	/**
	 * Field descriptor (offset) for struct member 'blocktype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blocktype: self-explanatory; showkey: either 0 or 1 (show vertical yellow lines for editing). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Ipo ipo = ...;
	 * CPointer&lt;Object&gt; p = ipo.__dna__addressof(Ipo.__DNA__FIELD__blocktype);
	 * CPointer&lt;Short&gt; p_blocktype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blocktype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blocktype = new long[]{144, 184};

	/**
	 * Field descriptor (offset) for struct member 'showkey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Ipo ipo = ...;
	 * CPointer&lt;Object&gt; p = ipo.__dna__addressof(Ipo.__DNA__FIELD__showkey);
	 * CPointer&lt;Short&gt; p_showkey = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'showkey'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__showkey = new long[]{146, 186};

	/**
	 * Field descriptor (offset) for struct member 'muteipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Muteipo: either 0 or 1 (whether ipo block is muted). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Ipo ipo = ...;
	 * CPointer&lt;Object&gt; p = ipo.__dna__addressof(Ipo.__DNA__FIELD__muteipo);
	 * CPointer&lt;Short&gt; p_muteipo = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'muteipo'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__muteipo = new long[]{148, 188};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Ipo ipo = ...;
	 * CPointer&lt;Object&gt; p = ipo.__dna__addressof(Ipo.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{150, 190};

	public Ipo(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Ipo(Ipo that) {
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
	 * Get method for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> A list of {@link IpoCurve}  structs in a linked list. </p>
	 * @see #__DNA__FIELD__curve
	 */
	
	public ListBase getCurve() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 152, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 120, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> A list of {@link IpoCurve}  structs in a linked list. </p>
	 * @see #__DNA__FIELD__curve
	 */
	
	public void setCurve(ListBase curve) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 120;
		}
		if (__io__equals(curve, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, curve)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, curve);
		} else {
			__io__generic__copy( getCurve(), curve);
		}
	}

	/**
	 * Get method for struct member 'cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rect defining extents of keyframes?. </p>
	 * @see #__DNA__FIELD__cur
	 */
	
	public rctf getCur() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 168, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 128, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cur'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Rect defining extents of keyframes?. </p>
	 * @see #__DNA__FIELD__cur
	 */
	
	public void setCur(rctf cur) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 168;
		} else {
			__dna__offset = 128;
		}
		if (__io__equals(cur, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cur)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cur);
		} else {
			__io__generic__copy( getCur(), cur);
		}
	}

	/**
	 * Get method for struct member 'blocktype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blocktype: self-explanatory; showkey: either 0 or 1 (show vertical yellow lines for editing). </p>
	 * @see #__DNA__FIELD__blocktype
	 */
	
	public short getBlocktype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 184);
		} else {
			return __io__block.readShort(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'blocktype'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Blocktype: self-explanatory; showkey: either 0 or 1 (show vertical yellow lines for editing). </p>
	 * @see #__DNA__FIELD__blocktype
	 */
	
	public void setBlocktype(short blocktype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 184, blocktype);
		} else {
			__io__block.writeShort(__io__address + 144, blocktype);
		}
	}

	/**
	 * Get method for struct member 'showkey'.
	 * @see #__DNA__FIELD__showkey
	 */
	
	public short getShowkey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 186);
		} else {
			return __io__block.readShort(__io__address + 146);
		}
	}

	/**
	 * Set method for struct member 'showkey'.
	 * @see #__DNA__FIELD__showkey
	 */
	
	public void setShowkey(short showkey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 186, showkey);
		} else {
			__io__block.writeShort(__io__address + 146, showkey);
		}
	}

	/**
	 * Get method for struct member 'muteipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Muteipo: either 0 or 1 (whether ipo block is muted). </p>
	 * @see #__DNA__FIELD__muteipo
	 */
	
	public short getMuteipo() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 188);
		} else {
			return __io__block.readShort(__io__address + 148);
		}
	}

	/**
	 * Set method for struct member 'muteipo'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Muteipo: either 0 or 1 (whether ipo block is muted). </p>
	 * @see #__DNA__FIELD__muteipo
	 */
	
	public void setMuteipo(short muteipo) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 188, muteipo);
		} else {
			__io__block.writeShort(__io__address + 148, muteipo);
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
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 190, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 150, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 190;
		} else {
			__dna__offset = 150;
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
	public CPointer<Ipo> __io__addressof() {
		return new CPointer<Ipo>(__io__address, new Class[]{Ipo.class}, __io__block, __io__blockTable);
	}

}
