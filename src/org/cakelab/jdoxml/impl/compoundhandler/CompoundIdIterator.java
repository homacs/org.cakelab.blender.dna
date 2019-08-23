package org.cakelab.jdoxml.impl.compoundhandler;

import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.ICompound;
import org.cakelab.jdoxml.impl.baseiterator.BaseIterator;
import org.cakelab.jdoxml.impl.mainhandler.MainHandler;

class CompoundIdIterator implements ListIterator<ICompound>

{
	private MainHandler m_mainHandler;
	private BaseIterator<String> iterator;

	
	CompoundIdIterator(MainHandler m, List<String> list) {
		iterator = new BaseIterator<String>(list);
		m_mainHandler = m;
	}


	public boolean hasNext() {
		return iterator.hasNext();
	}

	public boolean hasPrevious() {
		return iterator.hasPrevious();
	}

	public int nextIndex() {
		return iterator.nextIndex();
	}

	public int previousIndex() {
		return iterator.previousIndex();
	}

	public void remove() {
		iterator.remove();
	}

	public void set(String e) {
		iterator.set(e);
	}

	public void add(String e) {
		iterator.add(e);
	}

	public void toFirst() {
		iterator.toFirst();
	}

	public void toLast() {
		iterator.toLast();
	}

	public void toNext() {
		iterator.toNext();
	}

	public void toPrev() {
		iterator.toPrev();
	}

	public ICompound current() {
		String id = iterator.current();
		return id != null ? m_mainHandler.compoundById(id) : null;
	}

	public ICompound next() {
		iterator.next();
		return current();
	}

	@Override
	public ICompound previous() {
		iterator.previous();
		return current();
	}

	@Override
	public void set(ICompound e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void add(ICompound e) {
		throw new UnsupportedOperationException();
	}

}