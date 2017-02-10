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
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	
	/**
	 * PrimoSecondoTerzo -> primo-secondo-terzo
	 * @param ccs
	 * @return
	 */
	public static String camelCase2KebabCase(String ccs){
		String res = "";
		List<String> tokens = splitByCamel(ccs);
		Iterator<String> it_s  =tokens.iterator();
		boolean first = true;
		while (it_s.hasNext()) {
			String currTok =  it_s.next();
			if (!first){
				res+="-";
			}
			res += currTok.toLowerCase();
			first = false;
		}
		return res;
	}
	
	
	
	public static List<String> splitByCamel(String ccs){
		ArrayList<String> ris = new ArrayList<String>();
		if (ccs == null || ccs.length()==0) {
			return ris;
		}
		else{
			String CAMEL_CASE_TOKEN_PATTERN = "[A-Z][a-z|0-9]*";
			Pattern p = Pattern.compile(CAMEL_CASE_TOKEN_PATTERN);
			Matcher m = p.matcher(ccs);
			while(m.find()){
				ris.add(m.group());
			}
			return ris;
		}
	}

	/*
	public static void main(String[] args) {
		List<String> r = StringUtils.splitByCamel("Pri3moSec4ondoTer5zo");
		System.out.println(r);
		System.out.println(camelCase2KebabCase("Pri3moSec4ondoTer5zo"));
	}
	*/
}
