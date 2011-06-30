/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
 * </copyright>
 *
 * $Id$
 */
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
