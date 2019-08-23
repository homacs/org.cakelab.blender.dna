package org.cakelab.json.codec;

/**
 * To be thrown on any error occurring in codecs during encoding or 
 * decoding of data.
 * @author Holger Machens
 *
 */
public class JSONCodecException extends Exception {

	private static final long serialVersionUID = 1L;

	public JSONCodecException() {
	}

	public JSONCodecException(final String message) {
		super(message);
	}

	public JSONCodecException(final Throwable cause) {
		super(cause);
	}

	public JSONCodecException(final String message, final Throwable cause) {
		super(message, cause);
	}

	@Override
	public synchronized Throwable getCause() {
		Throwable cause = super.getCause();
		return cause == null ? this : cause;
	}

}
