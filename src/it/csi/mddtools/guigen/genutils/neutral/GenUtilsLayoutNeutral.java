package it.csi.mddtools.guigen.genutils.neutral;

import it.csi.mddtools.guigen.GUIModel;


/**
 * Questa classe contiene i metodi di utilit&agrave; per la gestione di
 * alcuni aspetti del layout per il portale Neutral.
 *
 * @author Davide Martinotti
 */
public class GenUtilsLayoutNeutral {

	/**
	 * Restituisce la classe per un CheckBox
	 * NOTA: Anche se il codice è semplice (e potrebbe stare in .ext) DEVE rimanere qui
	 *       in Java poichè questo metodo è chiamato anche da GenUtils.
	 *       
	 * @param model La radice (GUIModel) del modello, necessaria a ricavare il tipo di portale.
	 * @return
	 * @author [DM]
	 */
	public static String getCheckboxPortalStyle(GUIModel model) {
		String res = "";
		res = "cssClass=\"noBorder\"";
		return res;
	}



	////////////////////////////////////////////////////////////////////////////////////////////////////
	// PRIVATE METHODS (se necessari)	
	
	
	


	////////////////////////////////////////////////////////////////////////////////////////////////////
	// MAIN

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
