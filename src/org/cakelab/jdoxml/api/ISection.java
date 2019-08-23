package org.cakelab.jdoxml.api;

import java.util.ListIterator;

/** The public interface to a section in the object model. 
 *
 *  A compound can have a number of sections, where each
 *  section contains a set of members with the properties implied by
 *  the section kind. The kind() method returns the kind of the section.
 *  The members of the section can be accessed via members(). Apart
 *  from using kind(), some of the individual properties of the section can 
 *  also be inspected via isStatic(), isPublic(), isProtected() and 
 *  isPrivate().
 */
public interface ISection 
{
    /** Possible section types */
    enum SectionKind 
    { Invalid,
      UserDefined,         //!< A user defined member group 
      PubTypes,            //!< Public member typedefs
      PubFuncs,            //!< Public member functions
      PubAttribs,          //!< Public member attributes 
      PubSlots,            //!< Public Qt Slots
      Signals,             //!< Qt Signals
      DCOPFuncs,           //!< KDE-DCOP public interface functions
      Properties,          //!< IDL properties
      Events,              //!< C# events
      PubStatFuncs,        //!< Public static member functions
      PubStatAttribs,      //!< Public static attributes
      ProTypes,            //!< Protected member typedefs
      ProFuncs,            //!< Protected member functions
      ProAttribs,          //!< Protected member attributes
      ProSlots,            //!< Protected slots
      ProStatFuncs,        //!< Protected static member functions
      ProStatAttribs,      //!< Protected static member attributes
      PacTypes,            //!< Package member typedefs
      PacFuncs,            //!< Package member functions
      PacAttribs,          //!< Package member attributes
      PacStatFuncs,        //!< Package static member functions
      PacStatAttribs,      //!< Package static member attributes
      PriTypes,            //!< Private member typedefs
      PriFuncs,            //!< Private member functions
      PriAttribs,          //!< Private member attributes
      PriSlots,            //!< Private Qt slots
      PriStatFuncs,        //!< Private static member functions
      PriStatAttribs,      //!< Private static member attributes
      Friend,              //!< Friends
      Related,             //!< Function marked as related
      Defines,             //!< Preprocessor defines
      Prototypes,          //!< Global function prototypes
      Typedefs,            //!< Global typedefs
      Enums,               //!< Enumerations
      Functions,           //!< Global functions
      Variables;            //!< Global variables
    	public int value() {
    		return ordinal();
    	}
    }
    
    /** Returns a string representation of the value returned by kind() */
    String kindString();
    
    /** Returns what kind of section this is */
    SectionKind kind();

    /** Returns the description attached to this section (for user defined
     *  sections, also known as member groups).
     */
    IDocRoot description();
    
    /** Returns an iterator for the members of this section */
    ListIterator<IMember> members();
    
    /** Returns \c true if this section contains statics */
    boolean isStatic();
    
    /** Returns \c true if this section belongs to a 
     *  public section of a class 
     */
    boolean isPublic();
    
    /** Returns \c true if this section belongs to a 
     *  private section of a class 
     */
    boolean isPrivate();
    
    /** Returns \c true if this section belongs to a 
     *  protected section of a class 
     * */
    boolean isProtected();
}