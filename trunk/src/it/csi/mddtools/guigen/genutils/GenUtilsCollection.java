package it.csi.mddtools.guigen.genutils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 
 * 
 * @author Davide Martinotti
 */
public class GenUtilsCollection<E> {

	/**  */
	private List<E> list;

	
	/**
	 * 
	 */
	public GenUtilsCollection() {
		list = new ArrayList<E>();
	}

	
	/**
	 * 
	 * @param element
	 * @return
	 */
	public boolean add(E element) {
		if (!list.contains(element)) {
			return list.add(element);
		}
		return true;
	}
	
	
	/**
	 * 
	 * @param c
	 * @return
	 */
	public boolean addAll(Collection<? extends E> c) {
		for (E e : c) {
			add(e);
		}
		return true;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public List<E> values() {
		return list;
	}

}
