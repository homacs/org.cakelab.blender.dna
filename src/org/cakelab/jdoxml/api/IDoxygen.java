package org.cakelab.jdoxml.api;

import java.io.File;
import java.io.IOException;
import java.util.ListIterator;

import org.xml.sax.SAXException;

/** Root node of the object model. */
public interface IDoxygen 
{

    /** Returns an iterator that can be used to iterate over the list
     *  of compounds found in the project.
     */
	ListIterator<ICompound> compounds();

    /** Returns a compound given its unique \a id. If you have a
     *  compound id this function is much more efficient than iterating
     *  over the compound list. Returns 0 if the id is not valid.
     */
    ICompound compoundById(String id);

    /** Returns a compound given its name (including the scope). 
     *  Returns 0 if the name is not found in the project.
     */
    ICompound compoundByName(String name);

    /** Returns an public interface to a compound containing a member given it the
     *  member's id. Given the ICompound public interface one can use the same id
     *  to obtain the IMember public interface.
     *  @param id The member id.
     */
    ICompound memberById(String id);

    /** Returns a list of all compounds containing at least one members 
     *  with a certain name. Each compound can be asked to return the
     *  list of members with that name.
     *  @param name The name of the member.
     */
    ListIterator<ICompound> memberByName(String name);

    /** Releases the memory for the object hierarchy obtained by 
     *  createdObjecModelFromXML(). First release all iterators before calling
     *  this function.
     */
    void release();

    /** Sets the debug level.
     *  - 0 all debugging messages are disabled (the default).
     *  - 1 display important messages only
     *  - 2 display any messages.
     */
    void setDebugLevel(int level);

    /** Reads an XML directory produced by doxygen and builds up a data 
     *  structure representing the contents of the XML files in the directory. 
     */
    void readXMLDir(File dir) throws SAXException, IOException;
}