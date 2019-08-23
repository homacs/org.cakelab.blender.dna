package org.cakelab.json.test;

import org.cakelab.json.codec.JSONCodec;
import org.cakelab.json.codec.JSONCodecConfiguration;
import org.cakelab.json.codec.JSONCodecException;
import org.cakelab.json.test.types.TestString;

public class CodecTest {

	
	public static void main(String[] args) throws JSONCodecException {
		TestString ts = new TestString();
		
		ts.setS("-XX:ParallelGCThreads\u003d8");

		
		JSONCodec codec = new JSONCodec(new JSONCodecConfiguration());
		
		String encoded = codec.encodeObject(ts);
		
		
		ts = (TestString) codec.decodeObject(encoded, TestString.class);
		
		System.out.println(ts.getS());
	}
	
}
