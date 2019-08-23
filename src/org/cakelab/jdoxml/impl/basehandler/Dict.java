package org.cakelab.jdoxml.impl.basehandler;

import java.util.HashMap;

@SuppressWarnings("serial")
public class Dict<T> extends HashMap<String, T>{

	public Dict() {
		super();
	}

	public Dict(int i) {
		super(i);
	}

	public void insert(String key, T value) {
		super.put(key, value);
	}

	public T find(String s) {
		return get(s);
	}

}
