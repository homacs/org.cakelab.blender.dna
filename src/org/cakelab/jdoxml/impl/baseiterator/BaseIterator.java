package org.cakelab.jdoxml.impl.baseiterator;

import java.util.List;



public class BaseIterator<T> 
{

	private List<? extends T> list;
	private int current;
	
	public BaseIterator(List<? extends T> list) {
		this.list = list;
		current = 0;
    }
    public T toFirst() {
    	current = 0;
    	return current();
    }
    public T toLast()  {
    	current = list.size()-1;
    	return current(); 
    }
    public T toNext()  { 
    	nextIndex();
    	return current();
    }
    public T toPrev()  { 
    	previousIndex();
    	return current(); 
    }
    public T current() {
    	T result;
    	try {
    		result = list.get(current); 
    	} catch (IndexOutOfBoundsException e) {
    		result = null;
    	}
    	return result;
    }
	public void release() { 
	}
	public boolean hasNext() {
		return current < list.size()-1;
	}
	public T next() {
		return toNext();
	}
	public boolean hasPrevious() {
		return current > 0 && list.size() > 0;
	}
	public T previous() {
		return toPrev();
	}
	public int nextIndex() {
		return current < list.size()?++current:current;
	}
	public int previousIndex() {
		return current > -1 ? --current : current;
	}
	public void remove() {
		list.remove(current);
	}
	public void set(T e) {
		throw new UnsupportedOperationException("not supported");
	}
	public void add(T e) {
		throw new UnsupportedOperationException("not supported");
	}
}