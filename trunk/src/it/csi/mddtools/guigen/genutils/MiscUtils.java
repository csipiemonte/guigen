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

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MiscUtils {

	public static String getPluginName(){
		Properties props = new Properties();
		try {
			InputStream is = MiscUtils.class.getResourceAsStream("/it/csi/mddtools/guigen/guigen.version");
			if (is!=null){
				props.load(is);
				return ""+props.getProperty("plugin.name");
			}
			else return "unable_to_read(i.s null)";
		} catch (IOException e) {
			return "unable_to_read (io error)";
		}
		
	}
	
	public static String getPluginVersion(){
		Properties props = new Properties();
		try {
			InputStream is = MiscUtils.class.getResourceAsStream("/it/csi/mddtools/guigen/guigen.version");
			if (is!=null){
				props.load(is);
				return ""+props.getProperty("plugin.version");
			}
			else return "unable_to_read(i.s null)";
		} catch (IOException e) {
			return "unable_to_read (io error)";
		}
		
	}
}
