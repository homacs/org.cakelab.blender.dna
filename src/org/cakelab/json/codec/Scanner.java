package org.cakelab.json.codec;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;

import org.cakelab.json.JSONException;

public class Scanner {
	private Reader reader;
	private int lookahead;
	
	private int line;
	private int column;

	private double double_value;
	private String string_value;
	private boolean boolean_value;
	
	private String name;
	private Object value;
	private long int_value;
	
	public Scanner(Reader reader) throws IOException {
		this.reader = reader;

		line = 1;
		column = 1;
		// read first character for lookahead
		readCharacter();
	}
	
	public Scanner(InputStream in, Charset charset) throws IOException {
		this(new InputStreamReader(in, charset));
	}
	
	public Scanner (InputStream in) throws IOException {
		this(in, Charset.defaultCharset());
		
	}
	
	public Scanner(String jsonString) throws IOException {
		this(new StringReader(jsonString));
	}

	public int next() throws IOException {
		char c = readCharacterSkipWhitespace();
		return c;
	}

	public int nextName() throws IOException, JSONException {
		// skip whitespace
		getLookahead();
		
		name = readString();
		return Token.TYPE_NAME;
	}


	public String getName() {
		return name;
	}

	public int nextValue() throws IOException, JSONException {
		char c = getLookahead();
		if (c == Token.TYPE_DOUBLEQUOTES) return nextStringValue();
		else if (Token.isDigit(c) || c == Token.TYPE_PLUS || c == Token.TYPE_MINUS) return nextNumberValue();
		else if (Character.toLowerCase(c) == 't' || Character.toLowerCase(c) == 'f') return nextBooleanValue();
		else if (Character.toLowerCase(c) == 'n') return nextNullValue();
		return Token.TYPE_UNKNOWN;
	}

	
	public boolean getBooleanValue() {
		return boolean_value;
	}
	
	public double getNumberValue() {
		return double_value;
	}
	
	public String getStringValue() {
		return string_value;
	}
	
	
	
	private int nextNullValue() throws IOException {
		char c = Character.toLowerCase(readCharacter());
		if (c == 'n') {
			c = Character.toLowerCase(readCharacter());
			if (c == 'u') {
				c = Character.toLowerCase(readCharacter());
				if (c == 'l') {
					c = Character.toLowerCase(readCharacter());
					if (c == 'l') {
						value = null;
						return Token.TYPE_NULL;
					}
				}
			}
		}
		return 0;
	}

	private int nextBooleanValue() throws IOException, JSONException {
		
		char c = Character.toLowerCase(readCharacter());
		if (c == 't') {
			c = Character.toLowerCase(readCharacter());
			if (c == 'r') {
				c = Character.toLowerCase(readCharacter());
				if (c == 'u') {
					c = Character.toLowerCase(readCharacter());
					if (c == 'e') {
						boolean_value = true;
						value = boolean_value;
						return Token.TYPE_BOOLEAN;
					}
				}
			}
		} else if (c == 'f') {
			c = Character.toLowerCase(readCharacter());
			if (c == 'a') {
				c = Character.toLowerCase(readCharacter());
				if (c == 'l') {
					c = Character.toLowerCase(readCharacter());
					if (c == 's') {
						c = Character.toLowerCase(readCharacter());
						if (c == 'e') {
							boolean_value = false;
							value = boolean_value;
							return Token.TYPE_BOOLEAN;
						}
					}
				}
			}
		}
		error("Unknown character in boolean value: \\" + c);
		return 0;
	}

	private int nextNumberValue() throws IOException, JSONException {
		StringBuffer s = new StringBuffer();
		char c = readCharacter();
		s.append(c);

		while ("0123456789.+-eE".indexOf(lookahead) >= 0) {
			c = readCharacter();
			s.append(c);
		}
		try {
			try {
				int_value = Long.parseLong(s.toString());
				value = int_value;
			} catch (NumberFormatException e) {
				double_value = Double.parseDouble(s.toString());
				value = double_value;
			}
		} catch (NumberFormatException e) {
			error(s.toString() + " does not comply to json number format");
		}
		return Token.TYPE_NUMBER;
	}

	public char getLookahead() throws IOException {
		while (Token.isWhitespace((char)lookahead)) {
			readCharacter();
		}
		if (lookahead < 0) throw new IOException("EOF (missing brackets?)");
		return (char)lookahead;
	}
	
	private char readCharacterSkipWhitespace() throws IOException {
		char c = readCharacter();
		while (Token.isWhitespace(c)) {
			c = readCharacter();
		}
		return c;
	}

	private char readCharacter() throws IOException {
		if (lookahead < 0) throw new IOException("EOF");
		
		int c = reader.read();
		char result = (char)lookahead;
		lookahead = c;
		column++;
		if (result == '\n') newline();
		return result;
	}

	private int nextStringValue() throws IOException, JSONException {
		string_value = readString();
		value = string_value;
		return Token.TYPE_STRING;
	}

	private String readString() throws IOException, JSONException {
		StringBuffer s = new StringBuffer();
		if (Token.TYPE_DOUBLEQUOTES != readCharacter()) {
			error("expected '\"'");
		}
		
		char c;
		while (Token.TYPE_DOUBLEQUOTES != (c = readCharacter())){
			if (c == Token.TYPE_BACKSLASH) c = readControlCharacter();
			s.append(c);
		}
		return s.toString();
	}

	
	
	private char readControlCharacter() throws IOException, JSONException {
		char c = readCharacter();
		switch (c) {
		case Token.TYPE_DOUBLEQUOTES: return '"';
		case Token.TYPE_BACKSLASH: return '\\';
		case Token.TYPE_SLASH: return '/';
		case 'b': return '\b';
		case 'f': return '\f';
		case 'n': return '\n';
		case 'r': return '\r';
		case 't': return '\t';
		case 'u': return readUnicodeControlSequence();
		}
		error("Unknown control sequence: \\" + c);
		return '\0';
	}

	private void error(String msg) throws JSONException {
		throw new JSONException(": " + line + ':' + column + ": error:" + msg);
	}

	private char readUnicodeControlSequence() throws IOException, JSONException {
		int hex = readHexDigits(4);

		// casting unicode value to char is said to be the right conversion
		return (char)hex;
	}

	private int readHexDigits(int amount) throws IOException, JSONException {
		int radix = 16;
		int hex = 0;
		for (int i = 0; i < amount; i++) {
			if (!Token.isHexDigit((char)lookahead)) error("Unexpected character in unicode control sequence");
			
			char c = readCharacter();
			hex *= radix;
			hex += Character.digit(c, radix);
		}
		return hex;
	}
	
	private void newline() {
		line ++;
		column = 1;
	}

	public int getLine() {
		return line;
	}
	
	public int getColumn() {
		return column;
	}

	public Object getValue() {
		
		return value;
	}

}
