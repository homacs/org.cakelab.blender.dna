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
 * Generated facet for DNA struct type 'IDPropertyUIDataFloat'.
 * 
 * <h3>Class Documentation</h3>
 * 
 * <h4>Blender Source Code</h4>
 * <p> IDP_UI_DATA_TYPE_FLOAT </p>
 */

@CMetaData(size32=72, size64=80)
public class IDPropertyUIDataFloat extends CFacade {

	/**
	 * This is the sdna index of the struct IDPropertyUIDataFloat.
	 * <p>
	 * It is required when allocating a new block to store data for IDPropertyUIDataFloat.
	 * </p>
	 * @see StructDNA
	 * @see BlockTable
	 */
	public static final int __DNA__SDNA_INDEX = 3;

	/**
	 * Field descriptor (offset) for struct member 'base'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyUIDataFloat idpropertyuidatafloat = ...;
	 * CPointer&lt;Object&gt; p = idpropertyuidatafloat.__dna__addressof(IDPropertyUIDataFloat.__DNA__FIELD__base);
	 * CPointer&lt;IDPropertyUIData&gt; p_base = p.cast(new Class[]{IDPropertyUIData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base'</li>
	 * <li>Signature: 'IDPropertyUIData'</li>
	 * <li>Actual Size (32bit/64bit): 12/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'default_array'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Only for array properties. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyUIDataFloat idpropertyuidatafloat = ...;
	 * CPointer&lt;Object&gt; p = idpropertyuidatafloat.__dna__addressof(IDPropertyUIDataFloat.__DNA__FIELD__default_array);
	 * CPointer&lt;CPointer&lt;Double&gt;&gt; p_default_array = p.cast(new Class[]{CPointer.class, Double.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_array'</li>
	 * <li>Signature: 'double*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_array = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'default_array_len'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyUIDataFloat idpropertyuidatafloat = ...;
	 * CPointer&lt;Object&gt; p = idpropertyuidatafloat.__dna__addressof(IDPropertyUIDataFloat.__DNA__FIELD__default_array_len);
	 * CPointer&lt;Integer&gt; p_default_array_len = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_array_len'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_array_len = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyUIDataFloat idpropertyuidatafloat = ...;
	 * CPointer&lt;Object&gt; p = idpropertyuidatafloat.__dna__addressof(IDPropertyUIDataFloat.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'step'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyUIDataFloat idpropertyuidatafloat = ...;
	 * CPointer&lt;Object&gt; p = idpropertyuidatafloat.__dna__addressof(IDPropertyUIDataFloat.__DNA__FIELD__step);
	 * CPointer&lt;Float&gt; p_step = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'step'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__step = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'precision'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyUIDataFloat idpropertyuidatafloat = ...;
	 * CPointer&lt;Object&gt; p = idpropertyuidatafloat.__dna__addressof(IDPropertyUIDataFloat.__DNA__FIELD__precision);
	 * CPointer&lt;Integer&gt; p_precision = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'precision'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__precision = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'min'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyUIDataFloat idpropertyuidatafloat = ...;
	 * CPointer&lt;Object&gt; p = idpropertyuidatafloat.__dna__addressof(IDPropertyUIDataFloat.__DNA__FIELD__min);
	 * CPointer&lt;Double&gt; p_min = p.cast(new Class[]{Double.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'min'</li>
	 * <li>Signature: 'double'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__min = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'max'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyUIDataFloat idpropertyuidatafloat = ...;
	 * CPointer&lt;Object&gt; p = idpropertyuidatafloat.__dna__addressof(IDPropertyUIDataFloat.__DNA__FIELD__max);
	 * CPointer&lt;Double&gt; p_max = p.cast(new Class[]{Double.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'max'</li>
	 * <li>Signature: 'double'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__max = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'soft_min'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyUIDataFloat idpropertyuidatafloat = ...;
	 * CPointer&lt;Object&gt; p = idpropertyuidatafloat.__dna__addressof(IDPropertyUIDataFloat.__DNA__FIELD__soft_min);
	 * CPointer&lt;Double&gt; p_soft_min = p.cast(new Class[]{Double.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'soft_min'</li>
	 * <li>Signature: 'double'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__soft_min = new long[]{48, 56};

	/**
	 * Field descriptor (offset) for struct member 'soft_max'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyUIDataFloat idpropertyuidatafloat = ...;
	 * CPointer&lt;Object&gt; p = idpropertyuidatafloat.__dna__addressof(IDPropertyUIDataFloat.__DNA__FIELD__soft_max);
	 * CPointer&lt;Double&gt; p_soft_max = p.cast(new Class[]{Double.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'soft_max'</li>
	 * <li>Signature: 'double'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__soft_max = new long[]{56, 64};

	/**
	 * Field descriptor (offset) for struct member 'default_value'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * IDPropertyUIDataFloat idpropertyuidatafloat = ...;
	 * CPointer&lt;Object&gt; p = idpropertyuidatafloat.__dna__addressof(IDPropertyUIDataFloat.__DNA__FIELD__default_value);
	 * CPointer&lt;Double&gt; p_default_value = p.cast(new Class[]{Double.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'default_value'</li>
	 * <li>Signature: 'double'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__default_value = new long[]{64, 72};

	public IDPropertyUIDataFloat(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected IDPropertyUIDataFloat(IDPropertyUIDataFloat that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public IDPropertyUIData getBase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new IDPropertyUIData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new IDPropertyUIData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public void setBase(IDPropertyUIData base) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(base, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, base)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, base);
		} else {
			__io__generic__copy( getBase(), base);
		}
	}

	/**
	 * Get method for struct member 'default_array'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Only for array properties. </p>
	 * @see #__DNA__FIELD__default_array
	 */
	
	public CPointer<Double> getDefault_array() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Double.class};
		return new CPointer<Double>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'default_array'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code</h4>
	 * <p> Only for array properties. </p>
	 * @see #__DNA__FIELD__default_array
	 */
	
	public void setDefault_array(CPointer<Double> default_array) throws IOException
	{
		long __address = ((default_array == null) ? 0 : default_array.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'default_array_len'.
	 * @see #__DNA__FIELD__default_array_len
	 */
	
	public int getDefault_array_len() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'default_array_len'.
	 * @see #__DNA__FIELD__default_array_len
	 */
	
	public void setDefault_array_len(int default_array_len) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, default_array_len);
		} else {
			__io__block.writeInt(__io__address + 16, default_array_len);
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
			return new CArrayFacade<Byte>(__io__address + 28, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 28;
		} else {
			__dna__offset = 20;
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
	 * Get method for struct member 'step'.
	 * @see #__DNA__FIELD__step
	 */
	
	public float getStep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'step'.
	 * @see #__DNA__FIELD__step
	 */
	
	public void setStep(float step) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, step);
		} else {
			__io__block.writeFloat(__io__address + 24, step);
		}
	}

	/**
	 * Get method for struct member 'precision'.
	 * @see #__DNA__FIELD__precision
	 */
	
	public int getPrecision() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'precision'.
	 * @see #__DNA__FIELD__precision
	 */
	
	public void setPrecision(int precision) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, precision);
		} else {
			__io__block.writeInt(__io__address + 28, precision);
		}
	}

	/**
	 * Get method for struct member 'min'.
	 * @see #__DNA__FIELD__min
	 */
	
	public double getMin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readDouble(__io__address + 40);
		} else {
			return __io__block.readDouble(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'min'.
	 * @see #__DNA__FIELD__min
	 */
	
	public void setMin(double min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeDouble(__io__address + 40, min);
		} else {
			__io__block.writeDouble(__io__address + 32, min);
		}
	}

	/**
	 * Get method for struct member 'max'.
	 * @see #__DNA__FIELD__max
	 */
	
	public double getMax() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readDouble(__io__address + 48);
		} else {
			return __io__block.readDouble(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'max'.
	 * @see #__DNA__FIELD__max
	 */
	
	public void setMax(double max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeDouble(__io__address + 48, max);
		} else {
			__io__block.writeDouble(__io__address + 40, max);
		}
	}

	/**
	 * Get method for struct member 'soft_min'.
	 * @see #__DNA__FIELD__soft_min
	 */
	
	public double getSoft_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readDouble(__io__address + 56);
		} else {
			return __io__block.readDouble(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'soft_min'.
	 * @see #__DNA__FIELD__soft_min
	 */
	
	public void setSoft_min(double soft_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeDouble(__io__address + 56, soft_min);
		} else {
			__io__block.writeDouble(__io__address + 48, soft_min);
		}
	}

	/**
	 * Get method for struct member 'soft_max'.
	 * @see #__DNA__FIELD__soft_max
	 */
	
	public double getSoft_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readDouble(__io__address + 64);
		} else {
			return __io__block.readDouble(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'soft_max'.
	 * @see #__DNA__FIELD__soft_max
	 */
	
	public void setSoft_max(double soft_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeDouble(__io__address + 64, soft_max);
		} else {
			__io__block.writeDouble(__io__address + 56, soft_max);
		}
	}

	/**
	 * Get method for struct member 'default_value'.
	 * @see #__DNA__FIELD__default_value
	 */
	
	public double getDefault_value() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readDouble(__io__address + 72);
		} else {
			return __io__block.readDouble(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'default_value'.
	 * @see #__DNA__FIELD__default_value
	 */
	
	public void setDefault_value(double default_value) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeDouble(__io__address + 72, default_value);
		} else {
			__io__block.writeDouble(__io__address + 64, default_value);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<IDPropertyUIDataFloat> __io__addressof() {
		return new CPointer<IDPropertyUIDataFloat>(__io__address, new Class[]{IDPropertyUIDataFloat.class}, __io__block, __io__blockTable);
	}

}
