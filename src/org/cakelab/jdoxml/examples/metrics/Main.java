package org.cakelab.jdoxml.examples.metrics;

import java.io.File;
import java.util.ListIterator;

import org.cakelab.jdoxml.Factory;
import org.cakelab.jdoxml.api.ICompound;
import org.cakelab.jdoxml.api.IDoc;
import org.cakelab.jdoxml.api.IDocHRuler;
import org.cakelab.jdoxml.api.IDocItemizedList;
import org.cakelab.jdoxml.api.IDocListItem;
import org.cakelab.jdoxml.api.IDocMarkup;
import org.cakelab.jdoxml.api.IDocMarkupModifier;
import org.cakelab.jdoxml.api.IDocPara;
import org.cakelab.jdoxml.api.IDocRef;
import org.cakelab.jdoxml.api.IDocRoot;
import org.cakelab.jdoxml.api.IDocSection;
import org.cakelab.jdoxml.api.IDocSimpleSect;
import org.cakelab.jdoxml.api.IDocText;
import org.cakelab.jdoxml.api.IDocVerbatim;
import org.cakelab.jdoxml.api.IDocumentedElement;
import org.cakelab.jdoxml.api.IDoxygen;
import org.cakelab.jdoxml.api.IMember;
import org.cakelab.jdoxml.api.IParam;
import org.cakelab.jdoxml.api.ISection;
import org.cakelab.jdoxml.api.IStruct;
import org.cakelab.jdoxml.api.IUserDefined;

public class Main {

	static boolean isDocumented(IDocumentedElement member) {
		boolean found = false;
		IDocRoot doc = member.briefDescription();
		if (doc != null) {
			if (doc.contents().hasNext()) // method has brief description
			{
				found = true;
			}
		}
		doc = member.detailedDescription();
		if (doc != null && !found) {
			if (doc.contents().hasNext()) { // has detailed description
				found = true;
			}
		}
		return found;
	}

	public static void main(String[] argv) {
		// XXX: cheating
		argv = new String[]{"metrics", "/tmp/blender-2.78-xmldoc"};
		
		if (argv.length != 2) {
			System.err.printf("Usage: %s xml_output_dir\n", argv[0]);
			System.exit(1);
		}

		
		int numClasses = 0;
		int numDocClasses = 0;
		int numStructs = 0;
		int numDocStructs = 0;
		int numUnions = 0;
		int numInterfaces = 0;
		int numExceptions = 0;
		int numNamespaces = 0;
		int numFiles = 0;
		int numGroups = 0;
		int numPages = 0;
		int numPackages = 0;
		int numPubMethods = 0;
		int numProMethods = 0;
		int numPriMethods = 0;
		int numDocPubMethods = 0;
		int numDocProMethods = 0;
		int numDocPriMethods = 0;
		int numFunctions = 0;
		int numAttributes = 0;
		int numVariables = 0;
		int numDocFunctions = 0;
		int numDocAttributes = 0;
		int numDocVariables = 0;
		int numParams = 0;

		IDoxygen dox = Factory.createObjectModel();

		dox.setDebugLevel(1);

		try {
			dox.readXMLDir(new File(argv[1]));
		} catch (Throwable e) {
			System.err.printf("Error reading %s/index.xml\n", argv[1]);
			e.printStackTrace();
			System.exit(1);
		}

		ListIterator<ICompound> cli = dox.compounds();
		while (cli.hasNext()) {
			ICompound comp = cli.next();
			System.out.printf("Processing %s...\n", comp.name());
			if (comp.name().equals("bAction")) {
				System.out.println("action");
			}
			boolean hasDocs = isDocumented(comp);
			switch (comp.kind()) {
			case Class:
				numClasses++;
				if (hasDocs)
					numDocClasses++;
				break;
			case Struct:
				numStructs++;
				if (hasDocs)
					numDocStructs++;
				dumpStruct((IStruct)comp);
				break;
			case Union:
				numUnions++;
				break;
			case Interface:
				numInterfaces++;
				break;
			case Exception:
				numExceptions++;
				break;
			case Namespace:
				numNamespaces++;
				break;
			case File:
				numFiles++;
				break;
			case Group:
				numGroups++;
				break;
			case Page:
				numPages++;
				break;
			default:
				break;
			}

			ListIterator<IUserDefined> sli = comp.sections();
			while (sli.hasNext()) {
				ISection sec = sli.next();
				ListIterator<IMember> mli = sec.members();
				IMember mem;
				while (mli.hasNext()) {
					mem = mli.next();
					ListIterator<IParam> pli = mem.parameters();
					@SuppressWarnings("unused")
					IParam par;
					switch (comp.kind()) {
					case Class:
					case Struct:
					case Interface:
						// is a compound type
						switch (mem.kind()) {
						case Function:
						case Prototype:
						case Signal:
						case Slot:
						case DCOP:
							// is a "method"
							if (mem.section().isPublic()) {
								numPubMethods++;
								if (isDocumented(mem)) {
									numDocPubMethods++;
								}
							} else if (mem.section().isProtected()) {
								numProMethods++;
								if (isDocumented(mem)) {
									numDocProMethods++;
								}
							} else if (mem.section().isPrivate()) {
								numPriMethods++;
								if (isDocumented(mem)) {
									numDocPriMethods++;
								}
							}
							
							break;
						case Variable:
						case Property:
							// is an "attribute"
							numAttributes++;
							if (isDocumented(mem)) {
								numDocAttributes++;
							}
							break;
						default:
							// ignoring other cases
							break;
						}
						break; // compound type
					case File:
					case Namespace:
						switch(mem.kind()) {
						case Function:
						case Prototype:
						case Signal:
						case Slot:
						case DCOP:
							// is a "method"
							numFunctions++;
							if (isDocumented(mem)) {
								numDocFunctions++;
							}
							break;
						case Variable:
						case Property:
							// is an "attribute"
							numVariables++;
							if (isDocumented(mem)) {
								numDocVariables++;
							}
						default:
							break;
						}
						break;
					default:
						break;
					}

					while (pli.hasNext()) {
						pli.next();
						numParams++;
					}
					String type = mem.typeString();
					if (!"void".equals(type)) {
						numParams++; // count non-void return types as well
					}
				}
			}
		}

		dox.release();

		int numMethods = numPubMethods + numProMethods + numPriMethods;
		int numDocMethods = numDocPubMethods + numDocProMethods + numDocPriMethods;

		System.out.printf("Metrics:\n");
		System.out.printf("-----------------------------------\n");
		if (numClasses > 0)
			System.out.printf("Classes:     %10d (%d documented)\n", numClasses, numDocClasses);
		if (numStructs > 0)
			System.out.printf("Structs:     %10d (%d documented)\n", numStructs, numDocStructs);
		if (numUnions > 0)
			System.out.printf("Unions:      %10d\n", numUnions);
		if (numInterfaces > 0)
			System.out.printf("Interfaces:  %10d\n", numInterfaces);
		if (numExceptions > 0)
			System.out.printf("Exceptions:  %10d\n", numExceptions);
		if (numNamespaces > 0)
			System.out.printf("Namespaces:  %10d\n", numNamespaces);
		if (numFiles > 0)
			System.out.printf("Files:       %10d\n", numFiles);
		if (numGroups > 0)
			System.out.printf("Groups:      %10d\n", numGroups);
		if (numPages > 0)
			System.out.printf("Pages:       %10d\n", numPages);
		if (numPackages > 0)
			System.out.printf("Packages:    %10d\n", numPackages);
		if (numMethods > 0)
			System.out.printf("Methods:     %10d (%d documented)\n", numMethods, numDocMethods);
		if (numPubMethods > 0)
			System.out.printf("  Public:    %10d (%d documented)\n", numPubMethods, numDocPubMethods);
		if (numProMethods > 0)
			System.out.printf("  Protected: %10d (%d documented)\n", numProMethods, numDocProMethods);
		if (numPriMethods > 0)
			System.out.printf("  Private:   %10d (%d documented)\n", numPriMethods, numDocPriMethods);
		if (numFunctions > 0)
			System.out.printf("Functions:   %10d (%d documented)\n", numFunctions, numDocFunctions);
		if (numAttributes > 0)
			System.out.printf("Attributes:  %10d (%d documented)\n", numAttributes, numDocAttributes);
		if (numVariables > 0)
			System.out.printf("Variables:   %10d (%d documented)\n", numVariables, numDocVariables);
		if (numParams > 0)
			System.out.printf("Params:      %10d\n", numParams);
		System.out.printf("-----------------------------------\n");
		if (numClasses > 0)
			System.out.printf("Avg. #methods/compound:  %10f\n", (double) numMethods / (double) numClasses);
		if (numMethods > 0)
			System.out.printf("Avg. #params/method:     %10f\n", (double) numParams / (double) numMethods);
		System.out.printf("-----------------------------------\n");

		System.exit(0);
	}

	private static void dumpStruct(IStruct strukt) {
		System.out.println("id:    " + strukt.id());
		System.out.println("name:  " + strukt.name());
		System.out.println("kind:  " + strukt.kindString());
		dumpDoc(strukt.briefDescription());
		dumpDoc(strukt.detailedDescription());
	}

	private static void dumpDoc(IDocRoot doc) {
		dump(doc.contents());
	}

	private static void dump(IDoc docElem) {
		if (docElem instanceof IDocPara) {
			dump((IDocPara)docElem);
		} else if (docElem instanceof IDocText) {
			dump((IDocText)docElem);
		} else if (docElem instanceof IDocRef) {
			dump((IDocRef) docElem);
		} else if (docElem instanceof IDocHRuler) {
			dump((IDocHRuler) docElem);
		} else if (docElem instanceof IDocSimpleSect) {
			dump((IDocSimpleSect) docElem);
		} else if (docElem instanceof IDocSection) {
			dump((IDocSection) docElem);
		} else if (docElem instanceof IDocItemizedList) {
			dump((IDocItemizedList) docElem);
		} else if (docElem instanceof IDocMarkupModifier) {
			dump((IDocMarkupModifier) docElem);
		} else if (docElem instanceof IDocVerbatim) {
			dump((IDocVerbatim) docElem);
		} else {
			docElem.toString();
		}
	}
	
	private static void dump (IDocVerbatim verbatim) {
		System.out.print(verbatim.text());
	}
	
	private static void dump(IDocMarkupModifier markupModifier) {
		IDocMarkup.Markup markup = IDocMarkup.Markup.enumFor(markupModifier.markup());
		
		String html = null;
		switch(markup) {
		case Bold:
			html = "b";
			break;
		case Center:
			break;
		case ComputerOutput:
			html = "code";
			break;
		case Emphasis:
			html = "em";
			break;
		case Heading:
			html = "h1";
			break;
		case Normal:
			html = "";
			break;
		case Preformatted:
			html = "pre";
			break;
		case SmallFont:
			html = "small";
			break;
		case Subscript:
			html = "sub";
			break;
		case Superscript:
			html = "sup";
			break;
		default:
			break;
		
		}
		if (html != null) {
			System.out.print("<");
			if (!markupModifier.enabled()) {
				System.out.print("/");
			}
			System.out.print(html);
			System.out.print(">");
		}		
	}

	private static void dump(IDocPara paragraph) {
		System.out.println("<p>");
		dump(paragraph.contents());
		System.out.printf("\n</p>\n");
	}

	private static void dump(IDocItemizedList list) {
		System.out.println("<ul>");
		ListIterator<IDocListItem> i = list.elements();
		IDocListItem item;
		
		while (i.hasNext()) {
			item = i.next();
			System.out.print("<li>");
			dump(item.contents());
			System.out.print("</li>");
		}
	}

	private static void dump(ListIterator<? extends IDoc> i) {
		while (i.hasNext()) {
			dump(i.next());
		}
	}

	private static void dump(IDocSection section) {
		System.out.printf("<h%d>%s</h%d>\n", section.level(), section.title(), section.level());
		dump(section.paragraphs());
	}

	private static void dump(IDocSimpleSect section) {
		System.out.printf("<h5>%s</h5>\n", section.title());
		dump(section.description());
	}

	private static void dump(IDocHRuler hruler) {
		System.out.println("<hr/>");
	}
	private static void dump(IDocRef ref) {
		System.out.print("{@link ");
		System.out.print(ref.text());
		System.out.print("}");
	}

	private static void dump(IDocText text) {
		System.out.print(text.text());
	}
}
