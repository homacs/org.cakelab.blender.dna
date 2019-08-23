package org.cakelab.json;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.cakelab.json.codec.JSONStringFormatter;
import org.cakelab.json.codec.JSONStringFormatterConfiguration;

public class JSONPrettyprint implements JSONStringFormatter {

	public static final int NON_UNICODE_VALUES = 1<<0;
	public static final int SORT_MEMBERS = 1<<1;

	private JSONStringFormatterConfiguration cfg;

	private boolean active;
	private int indent;
	private StringBuffer sb = new StringBuffer();
	private String indentStr = "  ";
	private String currentIndentStr = "";

	
	public JSONPrettyprint(JSONStringFormatterConfiguration format) {
		this();
		this.active = format.indenting || format.sortMembers || format.unicodeValues;
		this.cfg = format;
	}
	
	public JSONPrettyprint() {
		deactivate();
		this.cfg = new JSONStringFormatterConfiguration();
	}

	/**
	 * This constructor is deprecated.
	 * @deprecated
	 * @param active
	 * @param flags
	 */
	public JSONPrettyprint(boolean active, int flags) {
		this();
		if (active) activate();
		if ((flags & NON_UNICODE_VALUES) > 0) {
			this.cfg.unicodeValues = false;
		}
		if ((flags & SORT_MEMBERS) > 0) {
			this.cfg.sortMembers = true;
		}
	}

	public JSONPrettyprint(boolean active) {
		this(active, 0);
	}

	public JSONPrettyprint(JSONPrettyprint formatter) {
		this();
		this.active = formatter.active;
		this.cfg = formatter.cfg;
	}

	public boolean isUnicodeValues() {
		return cfg.unicodeValues;
	}
	
	public boolean isSortMembers() {
		return cfg.sortMembers;
	}
	
	public boolean isActive() {
		return active;
	}

	public void activate() {
		this.active = true;
		this.indent = 0;
	}
	
	public void deactivate() {
		this.active = false;
	}
	
	public void indentInc() {
		indent++;
		currentIndentStr += indentStr;
	}
	
	public void indentDec() {
		indent--;
		currentIndentStr = "";
		for (int i = 0; i < indent; i++) {
			currentIndentStr += indentStr;
		}
	}
	
	public void appendIndent() {
		if (active) sb.append(currentIndentStr);
	}
	
	public void appendNewLine() {
		if (active) sb.append("\n");
	}

	public int hashCode() {
		return sb.hashCode();
	}

	public boolean equals(Object obj) {
		return sb.equals(obj);
	}

	public int length() {
		return sb.length();
	}

	public int capacity() {
		return sb.capacity();
	}

	public void ensureCapacity(int minimumCapacity) {
		sb.ensureCapacity(minimumCapacity);
	}

	public void trimToSize() {
		sb.trimToSize();
	}

	public void setLength(int newLength) {
		sb.setLength(newLength);
	}

	public char charAt(int index) {
		return sb.charAt(index);
	}

	public int codePointAt(int index) {
		return sb.codePointAt(index);
	}

	public int codePointBefore(int index) {
		return sb.codePointBefore(index);
	}

	public int codePointCount(int beginIndex, int endIndex) {
		return sb.codePointCount(beginIndex, endIndex);
	}

	public int offsetByCodePoints(int index, int codePointOffset) {
		return sb.offsetByCodePoints(index, codePointOffset);
	}

	public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
		sb.getChars(srcBegin, srcEnd, dst, dstBegin);
	}

	public void setCharAt(int index, char ch) {
		sb.setCharAt(index, ch);
	}

	public StringBuffer append(Object obj) {
		return sb.append(obj);
	}

	public StringBuffer append(String str) {
		return sb.append(str);
	}

	public StringBuffer append(StringBuffer sb) {
		return sb.append(sb);
	}

	public StringBuffer append(CharSequence s) {
		return sb.append(s);
	}

	public StringBuffer append(CharSequence s, int start, int end) {
		return sb.append(s, start, end);
	}

	public StringBuffer append(char[] str) {
		return sb.append(str);
	}

	public StringBuffer append(char[] str, int offset, int len) {
		return sb.append(str, offset, len);
	}

	public StringBuffer append(boolean b) {
		return sb.append(b);
	}

	public StringBuffer append(char c) {
		return sb.append(c);
	}

	public StringBuffer append(int i) {
		return sb.append(i);
	}

	public StringBuffer appendCodePoint(int codePoint) {
		return sb.appendCodePoint(codePoint);
	}

	public StringBuffer append(long lng) {
		return sb.append(lng);
	}

	public StringBuffer append(float f) {
		return sb.append(f);
	}

	public StringBuffer append(double d) {
		return sb.append(d);
	}

	public StringBuffer delete(int start, int end) {
		return sb.delete(start, end);
	}

	public StringBuffer deleteCharAt(int index) {
		return sb.deleteCharAt(index);
	}

	public StringBuffer replace(int start, int end, String str) {
		return sb.replace(start, end, str);
	}

	public String substring(int start) {
		return sb.substring(start);
	}

	public CharSequence subSequence(int start, int end) {
		return sb.subSequence(start, end);
	}

	public String substring(int start, int end) {
		return sb.substring(start, end);
	}

	public StringBuffer insert(int index, char[] str, int offset, int len) {
		return sb.insert(index, str, offset, len);
	}

	public StringBuffer insert(int offset, Object obj) {
		return sb.insert(offset, obj);
	}

	public StringBuffer insert(int offset, String str) {
		return sb.insert(offset, str);
	}

	public StringBuffer insert(int offset, char[] str) {
		return sb.insert(offset, str);
	}

	public StringBuffer insert(int dstOffset, CharSequence s) {
		return sb.insert(dstOffset, s);
	}

	public StringBuffer insert(int dstOffset, CharSequence s, int start, int end) {
		return sb.insert(dstOffset, s, start, end);
	}

	public StringBuffer insert(int offset, boolean b) {
		return sb.insert(offset, b);
	}

	public StringBuffer insert(int offset, char c) {
		return sb.insert(offset, c);
	}

	public StringBuffer insert(int offset, int i) {
		return sb.insert(offset, i);
	}

	public StringBuffer insert(int offset, long l) {
		return sb.insert(offset, l);
	}

	public StringBuffer insert(int offset, float f) {
		return sb.insert(offset, f);
	}

	public StringBuffer insert(int offset, double d) {
		return sb.insert(offset, d);
	}

	public int indexOf(String str) {
		return sb.indexOf(str);
	}

	public int indexOf(String str, int fromIndex) {
		return sb.indexOf(str, fromIndex);
	}

	public int lastIndexOf(String str) {
		return sb.lastIndexOf(str);
	}

	public int lastIndexOf(String str, int fromIndex) {
		return sb.lastIndexOf(str, fromIndex);
	}

	public StringBuffer reverse() {
		return sb.reverse();
	}

	public String toString() {
		return sb.toString();
	}

	@Override
	public Iterator<Entry<String, Object>> iterator(Set<Entry<String, Object>> entrySet) {
		if (this.cfg.sortMembers) {
			ArrayList<java.util.Map.Entry<String, Object>> entries = new ArrayList<java.util.Map.Entry<String, Object>>(entrySet);
			Collections.sort(entries, new Comparator<java.util.Map.Entry<String, Object>> (){

				@Override
				public int compare(java.util.Map.Entry<String, Object> o1, java.util.Map.Entry<String, Object> o2) {
					return String.CASE_INSENSITIVE_ORDER.compare(o1.getKey(), o2.getKey());
				}});
			return entries.iterator();
		} else {
			return entrySet.iterator();
		}
	}

	@Override
	public void appendUnicodeString(String o) {
		StringReader reader = new StringReader(o.toString());
		int read;
		try {
			while ((read = reader.read()) > 0) {
				if (Character.isSupplementaryCodePoint(read)) throw new Error("Supplimentary code points (extended unicode) are not supported by JSON");
				appendUnicodeCharacter((char)read);
			}
		} catch (Throwable e) {
			throw new Error(e);
		}
	}


	protected void appendUnicodeCharacter(char c) {
		switch (c) {
		case '\"':
			append("\\\"");
			break;
		case '\\':
			append("\\\\");
			break;
		case '\b':
			append("\\b");
			break;
		case '\f':
			append("\\f");
			break;
		case '\n':
			append("\\n");
			break;
		case '\r':
			append("\\r");
			break;
		case '\t':
			append("\\t");
			break;
		default:
			if (this.cfg.unicodeValues && isNonAscii(c)) {
				append("\\u");
				String s = Integer.toHexString(c);
				// add missing leading zeros
				for (int i = s.length(); i < 4 ; i++) append('0');
				append(s);
			} else {
				append(c);
			}
			break;
		}
	}

	private static boolean isNonAscii(char c) {
		return c > 127;
	}

	@Override
	public JSONStringFormatter create(JSONStringFormatterConfiguration config) {
		return new JSONPrettyprint(config);
	}


	
}
