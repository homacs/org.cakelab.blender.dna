package org.cakelab.jdoxml.api;

public interface IDocMarkup extends IDoc
{
    enum Markup 
    { 
		Normal         (0x000),
		Bold           (0x001),
		Emphasis       (0x002),
		ComputerOutput (0x004),
		Subscript      (0x008),
		Superscript    (0x010),
		SmallFont      (0x020),
		Center         (0x040),
		Preformatted   (0x080),
		Heading        (0x100);
    	
    	private int value;

		Markup(int value) {
    		this.value = value;
    	}
		
		public int value() {
			return value;
		}

		public static Markup enumFor(int value) {
			switch(value) {
			case 0x000: return Normal;
			case 0x001: return Bold;
			case 0x002: return Emphasis;
			case 0x004: return ComputerOutput;
			case 0x008: return Subscript;
			case 0x010: return Superscript;
			case 0x020: return SmallFont;
			case 0x040: return Center;
			case 0x080: return Preformatted;
			case 0x100: return Heading;
			}
			return null;
		}
    };
}