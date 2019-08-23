package org.cakelab.jdoxml.impl.mainhandler;

import java.util.List;
import java.util.ListIterator;

import org.cakelab.jdoxml.api.ICompound;
import org.cakelab.jdoxml.impl.baseiterator.BaseIterator;

public class CompoundEntryIterator implements ListIterator<ICompound> {
	private MainHandler m_mainHandler;
	private BaseIterator<CompoundEntry> iterator;

	public CompoundEntryIterator(MainHandler m, List<CompoundEntry> list) {
		iterator = new BaseIterator<CompoundEntry>(list);
		m_mainHandler = m;
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
		CompoundEntry ch = iterator.current();
		return ch != null ? m_mainHandler.compoundById(ch.id) : null;
	}

	public boolean hasNext() {
		return iterator.hasNext();
	}

	public ICompound next() {
		iterator.next();
		return current();
	}

	public boolean hasPrevious() {
		return iterator.hasPrevious();
	}

	public ICompound previous() {
		iterator.previous();
		return current();
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

	public void set(ICompound e) {
		throw new UnsupportedOperationException();
	}

	public void add(ICompound e) {
		throw new UnsupportedOperationException();
	}


}