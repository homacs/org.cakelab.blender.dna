package org.cakelab.json.codec;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.cakelab.json.JSONArray;
import org.cakelab.json.JSONException;
import org.cakelab.json.JSONObject;

public class Parser {
	Scanner scanner;
	private boolean ignoreNull;
	
	
	
	public Parser(String jsonString, boolean ignoreNull) throws IOException {
		this.ignoreNull = ignoreNull;
		scanner = new Scanner(jsonString);
	}

	public Parser(String jsonString) throws IOException {
		this(jsonString, false);
	}

	public Parser(InputStream in, Charset charset, boolean ignoreNull) throws IOException {
		this.ignoreNull = ignoreNull;
		scanner = new Scanner(in, charset);
	}

	public Parser(InputStream in, boolean ignoreNull) throws IOException {
		this(in, Charset.defaultCharset(), ignoreNull);
	}

	public Parser(InputStream in, Charset charset) throws IOException {
		this(in, charset, false);
	}

	public Parser(InputStream in) throws IOException {
		this(in, Charset.defaultCharset(), false);
	}

	public JSONObject parse() throws IOException, JSONException {
		return parseObject();
	}

	private JSONObject parseObject() throws IOException, JSONException {
		JSONObject o = new JSONObject();
		
		scanCharToken(Token.TYPE_LEFTBRACE);

		parseNVSequence(o, Token.TYPE_RIGHTBRACE);
		
		scanCharToken(Token.TYPE_RIGHTBRACE);
		
		return o;
	}

	private void parseNVSequence(JSONObject o, int endToken) throws IOException, JSONException {
		char lookahead = scanner.getLookahead();
		if (lookahead == endToken) return;
		while (true) {
			parseNameValuePair(o);
			lookahead = scanner.getLookahead();
			if (lookahead == endToken) break;
			
			scanCharToken(Token.TYPE_COMMA);
		}
		
	}

	private void parseValueSequence(JSONArray o, int endToken) throws IOException, JSONException {
		char lookahead = scanner.getLookahead();
		if (lookahead == endToken) return;
		while (true) {
			Object value = parseValue();
			if (!(ignoreNull && value == null)) o.add(value);
			lookahead = scanner.getLookahead();
			if (lookahead == endToken) break;
			
			scanCharToken(Token.TYPE_COMMA);
		}
		
	}

	private void parseNameValuePair(JSONObject parent) throws IOException, JSONException {
		if (scanner.nextName() != Token.TYPE_NAME) error("expected a name");
		String name = scanner.getName();
		
		scanCharToken(Token.TYPE_COLON);

		
		Object value = parseValue();
		if (ignoreNull && value == null) {
			return;
		}
		
		
		parent.put(name, value);
	}

	private Object parseValue() throws IOException, JSONException {
		Object value = null;
		char lookahead = scanner.getLookahead();
		switch(lookahead) {
		case Token.TYPE_LEFTBRACE:
			value = parseObject();
			break;
		case Token.TYPE_LEFTBRACKET:
			value = parseArray();
			break;
		default:
			int type = scanner.nextValue();
			if (type == Token.TYPE_UNKNOWN) {
				error("expected a value");
			}
			value = scanner.getValue();
		}
		return value;
	}

	private JSONArray parseArray() throws IOException, JSONException {
		JSONArray a = new JSONArray();
		scanCharToken(Token.TYPE_LEFTBRACKET);
		if (scanner.getLookahead() != Token.TYPE_RIGHTBRACKET) {
			/* non-empty array */
			parseValueSequence(a, Token.TYPE_RIGHTBRACKET);
		}
		scanCharToken(Token.TYPE_RIGHTBRACKET);
		return a;
	}

	private void scanCharToken(int tokenCharacter) throws IOException, JSONException {
		if (scanner.next() != (char)tokenCharacter) error("expected token '"+  (char)tokenCharacter + "'");
		
	}

	private void error(String string) throws JSONException {
		throw new JSONException(":" + scanner.getLine() + ":" + scanner.getColumn() + ": " + string);
	}

}
