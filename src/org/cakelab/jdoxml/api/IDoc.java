package org.cakelab.jdoxml.api;
public interface IDoc
{
    enum Kind 
    { 
      Invalid,            //  0
      Para,               //  1 -> IDocPara
      Text,               //  2 -> IDocText
      MarkupModifier,     //  3 -> IDocMarkupModifier
      ItemizedList,       //  4 -> IDocItemizedList
      OrderedList,        //  5 -> IDocOrderedList
      ListItem,           //  6 -> IDocListItem
      ParameterList,      //  7 -> IDocParameterList
      Parameter,          //  8 -> IDocParameter
      SimpleSect,         //  9 -> IDocSimpleSect
      Title,              // 10 -> IDocTitle
      Ref,                // 11 -> IDocRef
      VariableList,       // 12 -> IDocVariableList
      VariableListEntry,  // 13 -> IDocVariableListEntry
      HRuler,             // 14 -> IDocHRuler
      LineBreak,          // 15 -> IDocLineBreak
      ULink,              // 16 -> IDocULink
      EMail,              // 17 -> IDocEMail
      Link,               // 18 -> IDocLink
      ProgramListing,     // 19 -> IDocProgramListing
      CodeLine,           // 20 -> IDocCodeLine
      Highlight,          // 21 -> IDocHighlight
      Formula,            // 22 -> IDocFormula
      Image,              // 23 -> IDocImage
      DotFile,            // 24 -> IDocDotFile
      IndexEntry,         // 25 -> IDocIndexEntry
      Table,              // 26 -> IDocTable
      Row,                // 27 -> IDocRow
      Entry,              // 28 -> IDocEntry
      Section,            // 29 -> IDocSection
      Verbatim,           // 30 -> IDocVerbatim
      Copy,               // 31 -> IDocCopy
      TocList,            // 32 -> IDocTocList
      TocItem,            // 33 -> IDocTocItem
      Anchor,             // 34 -> IDocAnchor
      Symbol,             // 35 -> IDocSymbol
      Internal,           // 36 -> IDocInternal
      Root,               // 37 -> IDocRoot
      ParameterItem, 	  // 38 -> IDocParameterItem
      NDash,      		  // 38 -> IDocNDash
      MDash,       		  // 38 -> IDocMDash
      XRefSect,            // -> IDocXRefSect
      XRefTitle            // -> IDocXRefTitle
      ;
    	public int value() {
    		return ordinal();
    	}
    };
    Kind kind();
}