package org.cakelab.jdoxml.api;

import java.util.ListIterator;

/** The public interface to a compound in the object model. 
 *
 *  A compound has a name which can be obtained via the name() method 
 *  and a unique id, which is return via the id() method.
 *  A compound consists zero or more members which are grouped into sections. 
 *  The sections() method can be used to access the individual sections. 
 *  Alternatively, members can be obtained by name or id. There are 
 *  different types of compounds. The kind() method returns what kind of 
 *  compound this is. Depending on the return value one can dynamically 
 *  cast an public interface pointer to an more specialised public interface that provides 
 *  additional methods.
 *  Example:
 *  \code
 *  ICompound *comp=...;
 *  if (comp->kind()==ICompound::Class)
 *  {
 *    IClass *cls = dynamic_cast<IClass*>(comp);
 *    // use methods of IClass
 *  }
 *  \endcode
 *  The documentation that is provided by a compound is available via
 *  the briefDescription() and detailedDescription() methods.
 *  To avoid excessive memory usage, release() should be called (once) on each 
 *  compound public interface pointer that is no longer needed.
 */
public interface ICompound extends IDocumentedElement
{
    /** Represents the kind of compounds recognised by doxygen. */
    public enum CompoundKind { 
    	Invalid,
        Class,
        Struct,
        Union,
        Interface,
        Protocol,
        Category,
        Exception,
        File,
        Namespace,
        Group,
        Page,
        Example,
        Dir;
    	public int value()  {
    		return ordinal();
    	}
	}

    /** Returns the name of this compound */
    String name();

    /** Returns the id of this compound. The id is a
     *  unique string representing a specific compound object.
     */
    String id()  ;

    /** Returns the kind of compound. See #CompoundKind for possible
     *  values.
     */
    CompoundKind kind();

    /** Returns a string representation of the compound kind.
     *  @see kind()
     */
    String kindString();

    /** Returns an iterator for the different member sections in this
     *  compound.
     */
    ListIterator<IUserDefined> sections();

    /** Returns a tree-structured representation of the brief
     *  description that is attached to this compound.
     */
    IDocRoot briefDescription();

    /** Returns a tree-structured representation of the detailed
     *  description that is attached to this compound.
     */
    IDocRoot detailedDescription();

    /** Returns an public interface to a member given its id. 
     *  @param id The member id.
     */
    IMember memberById(String id);

    /** Returns a list of all members within the compound having a certain 
     *  name. Member overloading is the reason why there can be more than 
     *  one member. 
     *  @param name The name of the member.
     */
    ListIterator<IMember> memberByName(String name);

}