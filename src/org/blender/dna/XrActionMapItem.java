package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'XrActionMapItem'.
 * 
 * <h3>Class Documentation</h3>
 * <h4>Blender Source Code:</h4>
 * <p><hr/> 
 *  </p>
 */

@CMetaData(size32=376, size64=400)
public class XrActionMapItem extends CFacade {

	/**
	 * This is the sdna index of the struct XrActionMapItem.
	 * <p>
	 * It is required when allocating a new block to store data for XrActionMapItem.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 778;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;XrActionMapItem&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, XrActionMapItem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'XrActionMapItem*'</li>
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
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;XrActionMapItem&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, XrActionMapItem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'XrActionMapItem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Name of the action map item<h4>Blender Source Code:</h4>
	 * <p> Unique name. MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__name);
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
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Action type<h4>Blender Source Code:</h4>
	 * <p> Type. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__type);
	 * CPointer&lt;Byte&gt; p_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{72, 80};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eXrActionType </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD___pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{73, 81};

	/**
	 * Field descriptor (offset) for struct member 'user_path0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * OpenXR user path<h4>Blender Source Code:</h4>
	 * <p> OpenXR user paths. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__user_path0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_user_path0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'user_path0'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__user_path0 = new long[]{80, 88};

	/**
	 * Field descriptor (offset) for struct member 'user_path1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * OpenXR user path
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__user_path1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_user_path1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'user_path1'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__user_path1 = new long[]{144, 152};

	/**
	 * Field descriptor (offset) for struct member 'op'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Identifier of operator to call on action event<h4>Blender Source Code:</h4>
	 * <p> Operator to be called on XR events. OP_MAX_TYPENAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__op);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_op = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'op'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__op = new long[]{208, 216};

	/**
	 * Field descriptor (offset) for struct member 'op_properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Properties to set when the operator is called<h4>Blender Source Code:</h4>
	 * <p> Operator properties, assigned to ptr->data and can be written to a file. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__op_properties);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_op_properties = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'op_properties'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__op_properties = new long[]{272, 280};

	/**
	 * Field descriptor (offset) for struct member 'op_properties_ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA pointer to access properties. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__op_properties_ptr);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_op_properties_ptr = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'op_properties_ptr'</li>
	 * <li>Signature: 'PointerRNA*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__op_properties_ptr = new long[]{276, 288};

	/**
	 * Field descriptor (offset) for struct member 'op_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eXrOpFlag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__op_flag);
	 * CPointer&lt;Short&gt; p_op_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'op_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__op_flag = new long[]{280, 296};

	/**
	 * Field descriptor (offset) for struct member 'action_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eXrActionFlag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__action_flag);
	 * CPointer&lt;Short&gt; p_action_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'action_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__action_flag = new long[]{282, 298};

	/**
	 * Field descriptor (offset) for struct member 'haptic_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eXrHapticFlag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__haptic_flag);
	 * CPointer&lt;Short&gt; p_haptic_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'haptic_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__haptic_flag = new long[]{284, 300};

	/**
	 * Field descriptor (offset) for struct member 'pose_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pose action properties. eXrPoseFlag </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__pose_flag);
	 * CPointer&lt;Short&gt; p_pose_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pose_flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pose_flag = new long[]{286, 302};

	/**
	 * Field descriptor (offset) for struct member 'haptic_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Name of the haptic action to apply when executing this action<h4>Blender Source Code:</h4>
	 * <p> Haptic properties. MAX_NAME </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__haptic_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_haptic_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'haptic_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__haptic_name = new long[]{288, 304};

	/**
	 * Field descriptor (offset) for struct member 'haptic_duration'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Haptic duration in seconds. 0.0 is the minimum supported duration
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__haptic_duration);
	 * CPointer&lt;Float&gt; p_haptic_duration = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'haptic_duration'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__haptic_duration = new long[]{352, 368};

	/**
	 * Field descriptor (offset) for struct member 'haptic_frequency'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frequency of the haptic vibration in hertz. 0.0 specifies the OpenXR runtime's default frequency
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__haptic_frequency);
	 * CPointer&lt;Float&gt; p_haptic_frequency = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'haptic_frequency'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__haptic_frequency = new long[]{356, 372};

	/**
	 * Field descriptor (offset) for struct member 'haptic_amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Intensity of the haptic vibration, ranging from 0.0 to 1.0
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__haptic_amplitude);
	 * CPointer&lt;Float&gt; p_haptic_amplitude = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'haptic_amplitude'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__haptic_amplitude = new long[]{360, 376};

	/**
	 * Field descriptor (offset) for struct member 'selbinding'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__selbinding);
	 * CPointer&lt;Short&gt; p_selbinding = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'selbinding'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__selbinding = new long[]{364, 380};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{366, 382};

	/**
	 * Field descriptor (offset) for struct member 'bindings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Bindings for the action map item, mapping the action to an XR input<h4>Blender Source Code:</h4>
	 * <p>{@link XrActionMapBinding}  </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * XrActionMapItem xractionmapitem = ...;
	 * CPointer&lt;Object&gt; p = xractionmapitem.__dna__addressof(XrActionMapItem.__DNA__FIELD__bindings);
	 * CPointer&lt;ListBase&gt; p_bindings = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bindings'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bindings = new long[]{368, 384};

	public XrActionMapItem(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected XrActionMapItem(XrActionMapItem that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<XrActionMapItem> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{XrActionMapItem.class};
		return new CPointer<XrActionMapItem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, XrActionMapItem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<XrActionMapItem> next) throws IOException
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
	
	public CPointer<XrActionMapItem> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{XrActionMapItem.class};
		return new CPointer<XrActionMapItem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, XrActionMapItem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<XrActionMapItem> prev) throws IOException
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
	 * Name of the action map item<h4>Blender Source Code:</h4>
	 * <p> Unique name. MAX_NAME </p>
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
	 * Name of the action map item<h4>Blender Source Code:</h4>
	 * <p> Unique name. MAX_NAME </p>
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
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Action type<h4>Blender Source Code:</h4>
	 * <p> Type. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public byte getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 80);
		} else {
			return __io__block.readByte(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Action type<h4>Blender Source Code:</h4>
	 * <p> Type. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(byte type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 80, type);
		} else {
			__io__block.writeByte(__io__address + 72, type);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eXrActionType </p>
	 * @see #__DNA__FIELD___pad
	 */
	
	public CArrayFacade<Byte> get_pad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 81, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 73, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eXrActionType </p>
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(CArrayFacade<Byte> _pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 81;
		} else {
			__dna__offset = 73;
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
	 * Get method for struct member 'user_path0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * OpenXR user path<h4>Blender Source Code:</h4>
	 * <p> OpenXR user paths. </p>
	 * @see #__DNA__FIELD__user_path0
	 */
	
	public CArrayFacade<Byte> getUser_path0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'user_path0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * OpenXR user path<h4>Blender Source Code:</h4>
	 * <p> OpenXR user paths. </p>
	 * @see #__DNA__FIELD__user_path0
	 */
	
	public void setUser_path0(CArrayFacade<Byte> user_path0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(user_path0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, user_path0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, user_path0);
		} else {
			__io__generic__copy( getUser_path0(), user_path0);
		}
	}

	/**
	 * Get method for struct member 'user_path1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * OpenXR user path
	 * @see #__DNA__FIELD__user_path1
	 */
	
	public CArrayFacade<Byte> getUser_path1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'user_path1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * OpenXR user path
	 * @see #__DNA__FIELD__user_path1
	 */
	
	public void setUser_path1(CArrayFacade<Byte> user_path1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 144;
		}
		if (__io__equals(user_path1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, user_path1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, user_path1);
		} else {
			__io__generic__copy( getUser_path1(), user_path1);
		}
	}

	/**
	 * Get method for struct member 'op'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Identifier of operator to call on action event<h4>Blender Source Code:</h4>
	 * <p> Operator to be called on XR events. OP_MAX_TYPENAME </p>
	 * @see #__DNA__FIELD__op
	 */
	
	public CArrayFacade<Byte> getOp() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 216, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 208, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'op'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Identifier of operator to call on action event<h4>Blender Source Code:</h4>
	 * <p> Operator to be called on XR events. OP_MAX_TYPENAME </p>
	 * @see #__DNA__FIELD__op
	 */
	
	public void setOp(CArrayFacade<Byte> op) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 216;
		} else {
			__dna__offset = 208;
		}
		if (__io__equals(op, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, op)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, op);
		} else {
			__io__generic__copy( getOp(), op);
		}
	}

	/**
	 * Get method for struct member 'op_properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Properties to set when the operator is called<h4>Blender Source Code:</h4>
	 * <p> Operator properties, assigned to ptr->data and can be written to a file. </p>
	 * @see #__DNA__FIELD__op_properties
	 */
	
	public CPointer<IDProperty> getOp_properties() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'op_properties'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Properties to set when the operator is called<h4>Blender Source Code:</h4>
	 * <p> Operator properties, assigned to ptr->data and can be written to a file. </p>
	 * @see #__DNA__FIELD__op_properties
	 */
	
	public void setOp_properties(CPointer<IDProperty> op_properties) throws IOException
	{
		long __address = ((op_properties == null) ? 0 : op_properties.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 280, __address);
		} else {
			__io__block.writeLong(__io__address + 272, __address);
		}
	}

	/**
	 * Get method for struct member 'op_properties_ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA pointer to access properties. </p>
	 * @see #__DNA__FIELD__op_properties_ptr
	 */
	
	public CPointer<Object> getOp_properties_ptr() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 276);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'op_properties_ptr'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> RNA pointer to access properties. </p>
	 * @see #__DNA__FIELD__op_properties_ptr
	 */
	
	public void setOp_properties_ptr(CPointer<Object> op_properties_ptr) throws IOException
	{
		long __address = ((op_properties_ptr == null) ? 0 : op_properties_ptr.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 288, __address);
		} else {
			__io__block.writeLong(__io__address + 276, __address);
		}
	}

	/**
	 * Get method for struct member 'op_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eXrOpFlag </p>
	 * @see #__DNA__FIELD__op_flag
	 */
	
	public short getOp_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 296);
		} else {
			return __io__block.readShort(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'op_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eXrOpFlag </p>
	 * @see #__DNA__FIELD__op_flag
	 */
	
	public void setOp_flag(short op_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 296, op_flag);
		} else {
			__io__block.writeShort(__io__address + 280, op_flag);
		}
	}

	/**
	 * Get method for struct member 'action_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eXrActionFlag </p>
	 * @see #__DNA__FIELD__action_flag
	 */
	
	public short getAction_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 298);
		} else {
			return __io__block.readShort(__io__address + 282);
		}
	}

	/**
	 * Set method for struct member 'action_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eXrActionFlag </p>
	 * @see #__DNA__FIELD__action_flag
	 */
	
	public void setAction_flag(short action_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 298, action_flag);
		} else {
			__io__block.writeShort(__io__address + 282, action_flag);
		}
	}

	/**
	 * Get method for struct member 'haptic_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eXrHapticFlag </p>
	 * @see #__DNA__FIELD__haptic_flag
	 */
	
	public short getHaptic_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 300);
		} else {
			return __io__block.readShort(__io__address + 284);
		}
	}

	/**
	 * Set method for struct member 'haptic_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> eXrHapticFlag </p>
	 * @see #__DNA__FIELD__haptic_flag
	 */
	
	public void setHaptic_flag(short haptic_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 300, haptic_flag);
		} else {
			__io__block.writeShort(__io__address + 284, haptic_flag);
		}
	}

	/**
	 * Get method for struct member 'pose_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pose action properties. eXrPoseFlag </p>
	 * @see #__DNA__FIELD__pose_flag
	 */
	
	public short getPose_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 302);
		} else {
			return __io__block.readShort(__io__address + 286);
		}
	}

	/**
	 * Set method for struct member 'pose_flag'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Pose action properties. eXrPoseFlag </p>
	 * @see #__DNA__FIELD__pose_flag
	 */
	
	public void setPose_flag(short pose_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 302, pose_flag);
		} else {
			__io__block.writeShort(__io__address + 286, pose_flag);
		}
	}

	/**
	 * Get method for struct member 'haptic_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Name of the haptic action to apply when executing this action<h4>Blender Source Code:</h4>
	 * <p> Haptic properties. MAX_NAME </p>
	 * @see #__DNA__FIELD__haptic_name
	 */
	
	public CArrayFacade<Byte> getHaptic_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 304, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 288, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'haptic_name'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Name of the haptic action to apply when executing this action<h4>Blender Source Code:</h4>
	 * <p> Haptic properties. MAX_NAME </p>
	 * @see #__DNA__FIELD__haptic_name
	 */
	
	public void setHaptic_name(CArrayFacade<Byte> haptic_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 304;
		} else {
			__dna__offset = 288;
		}
		if (__io__equals(haptic_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, haptic_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, haptic_name);
		} else {
			__io__generic__copy( getHaptic_name(), haptic_name);
		}
	}

	/**
	 * Get method for struct member 'haptic_duration'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Haptic duration in seconds. 0.0 is the minimum supported duration
	 * @see #__DNA__FIELD__haptic_duration
	 */
	
	public float getHaptic_duration() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 368);
		} else {
			return __io__block.readFloat(__io__address + 352);
		}
	}

	/**
	 * Set method for struct member 'haptic_duration'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Haptic duration in seconds. 0.0 is the minimum supported duration
	 * @see #__DNA__FIELD__haptic_duration
	 */
	
	public void setHaptic_duration(float haptic_duration) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 368, haptic_duration);
		} else {
			__io__block.writeFloat(__io__address + 352, haptic_duration);
		}
	}

	/**
	 * Get method for struct member 'haptic_frequency'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frequency of the haptic vibration in hertz. 0.0 specifies the OpenXR runtime's default frequency
	 * @see #__DNA__FIELD__haptic_frequency
	 */
	
	public float getHaptic_frequency() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 372);
		} else {
			return __io__block.readFloat(__io__address + 356);
		}
	}

	/**
	 * Set method for struct member 'haptic_frequency'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frequency of the haptic vibration in hertz. 0.0 specifies the OpenXR runtime's default frequency
	 * @see #__DNA__FIELD__haptic_frequency
	 */
	
	public void setHaptic_frequency(float haptic_frequency) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 372, haptic_frequency);
		} else {
			__io__block.writeFloat(__io__address + 356, haptic_frequency);
		}
	}

	/**
	 * Get method for struct member 'haptic_amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Intensity of the haptic vibration, ranging from 0.0 to 1.0
	 * @see #__DNA__FIELD__haptic_amplitude
	 */
	
	public float getHaptic_amplitude() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 376);
		} else {
			return __io__block.readFloat(__io__address + 360);
		}
	}

	/**
	 * Set method for struct member 'haptic_amplitude'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Intensity of the haptic vibration, ranging from 0.0 to 1.0
	 * @see #__DNA__FIELD__haptic_amplitude
	 */
	
	public void setHaptic_amplitude(float haptic_amplitude) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 376, haptic_amplitude);
		} else {
			__io__block.writeFloat(__io__address + 360, haptic_amplitude);
		}
	}

	/**
	 * Get method for struct member 'selbinding'.
	 * @see #__DNA__FIELD__selbinding
	 */
	
	public short getSelbinding() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 380);
		} else {
			return __io__block.readShort(__io__address + 364);
		}
	}

	/**
	 * Set method for struct member 'selbinding'.
	 * @see #__DNA__FIELD__selbinding
	 */
	
	public void setSelbinding(short selbinding) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 380, selbinding);
		} else {
			__io__block.writeShort(__io__address + 364, selbinding);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CArrayFacade<Byte> get_pad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 382, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 366, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad3'.
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CArrayFacade<Byte> _pad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 382;
		} else {
			__dna__offset = 366;
		}
		if (__io__equals(_pad3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad3);
		} else {
			__io__generic__copy( get_pad3(), _pad3);
		}
	}

	/**
	 * Get method for struct member 'bindings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Bindings for the action map item, mapping the action to an XR input<h4>Blender Source Code:</h4>
	 * <p>{@link XrActionMapBinding}  </p>
	 * @see #__DNA__FIELD__bindings
	 */
	
	public ListBase getBindings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 384, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 368, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bindings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Bindings for the action map item, mapping the action to an XR input<h4>Blender Source Code:</h4>
	 * <p>{@link XrActionMapBinding}  </p>
	 * @see #__DNA__FIELD__bindings
	 */
	
	public void setBindings(ListBase bindings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 384;
		} else {
			__dna__offset = 368;
		}
		if (__io__equals(bindings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bindings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bindings);
		} else {
			__io__generic__copy( getBindings(), bindings);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<XrActionMapItem> __io__addressof() {
		return new CPointer<XrActionMapItem>(__io__address, new Class[]{XrActionMapItem.class}, __io__block, __io__blockTable);
	}

}
