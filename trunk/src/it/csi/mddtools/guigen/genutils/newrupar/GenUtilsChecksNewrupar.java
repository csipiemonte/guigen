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
package it.csi.mddtools.guigen.genutils.newrupar;

import it.csi.mddtools.guigen.CommandPanel;
import it.csi.mddtools.guigen.FormPanel;
import it.csi.mddtools.guigen.GridPanelLayout;
import it.csi.mddtools.guigen.HorizontalFlowPanelLayout;
import it.csi.mddtools.guigen.Panel;
import it.csi.mddtools.guigen.UDLRCPanelLayout;
import it.csi.mddtools.guigen.UDLRCSpecConstants;
import it.csi.mddtools.guigen.UDLRCWidgetLayoutSpec;
import it.csi.mddtools.guigen.VerticalFlowPanelLayout;
import it.csi.mddtools.guigen.Widget;


/**
 * Questa classe contiene i metodi di utilit&agrave; per i Check.
 * 
 * @author Davide Martinotti
 */
public class GenUtilsChecksNewrupar {

	/**
	 * Un FormPanel di livello superiore al primo pu&ograve; avere solo due tipi di layout: 
	 *    [a] VerticalFlowPanelLayout, 
	 *    [b] UDLRCPanelLayout ristretto (LEFT, CENTER e RIGHT)
	 * 
	 * @param fp  Il FormPanel da controllare.
	 * @return  true se il layout &egrave; corretto, false altrimenti.
	 * @author [DM]
	 */
	public static boolean formPanelLayoutCheck(FormPanel fp) {
		boolean res = true;
		
		if ( fp.getLayout() instanceof HorizontalFlowPanelLayout || fp.getLayout() instanceof GridPanelLayout ) {
			res = false;
		} else if ( fp.getLayout() instanceof UDLRCPanelLayout ) {
			for ( Panel p : fp.getSubpanels() ) {
				if ( !(p.getLayoutSpec() instanceof UDLRCWidgetLayoutSpec) ) {
					res = false;
					break;				
				}
				
				// 
				UDLRCWidgetLayoutSpec ls = (UDLRCWidgetLayoutSpec)p.getLayoutSpec();
				if ( ls.getValue() != UDLRCSpecConstants.LEFT && ls.getValue() != UDLRCSpecConstants.CENTER && ls.getValue() != UDLRCSpecConstants.RIGHT ) {
					res = false;
					break;				
				}
			}
		}
		
		return res;
	}
	
	
	/**
	 * Un CommandPanel pu&ograve; avere solo due tipi di layout: 
	 *    [a] HorizontalFlowPanelLayout, 
	 *    [b] UDLRCPanelLayout ristretto (LEFT, CENTER e RIGHT)
	 * 
	 * @param cp  Il CommandPanel da controllare.
	 * @return  true se il layout &egrave; corretto, false altrimenti.
	 * @author [DM]
	 */
	public static boolean commandPanelLayoutCheck(CommandPanel cp) {
		boolean res = true;

		if ( cp.getLayout() instanceof VerticalFlowPanelLayout || cp.getLayout() instanceof GridPanelLayout ) {
			res = false;
		} else if ( cp.getLayout() instanceof UDLRCPanelLayout ) { 
			for ( Widget w : cp.getWidgets() ) {
				if ( !(w.getLayoutSpec() instanceof UDLRCWidgetLayoutSpec) ) {
					res = false;
					break;				
				}
				
				// center e' stato aggiunto per la nuova architettura (xhtml cross-portal)
				UDLRCWidgetLayoutSpec ls = (UDLRCWidgetLayoutSpec)w.getLayoutSpec();
				if ( ls.getValue() != UDLRCSpecConstants.LEFT && ls.getValue() != UDLRCSpecConstants.CENTER && ls.getValue() != UDLRCSpecConstants.RIGHT ) {
					res = false;
					break;				
				}
			}
		}

		return res;
	}

}
