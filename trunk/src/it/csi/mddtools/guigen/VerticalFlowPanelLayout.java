/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertical Flow Panel Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Gli elementi sono posizionati l'uno sotto l'altro, dall'alto in basso.
 * Non è necessario nessun specificatore per i singoli elementi.
 * E'possibile impostare la percentuale delle colonne associate alla label
 * ed al controllo della singola colonna implicitamente definita da questo tipo di 
 * layout.
 * <!-- end-model-doc -->
 *
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getVerticalFlowPanelLayout()
 * @model annotation="uilayoutdoc description='<p>\r\nIl <b>VerticalFlowPanelLayout</b> (layout sequenziale a sviluppo\r\nverticale) prevede che gli elementi contenuti nel pannello che possiede\r\nquesto layout siano visualizzati uno dopo l\'altro in una sequenza \r\nverticale, all\'interno dell\'area disponibile per il pannello contenitore.\r\nDi fatto rappresenta un layout ad una colonna logica (un solo widget) e\r\ndue colonne fisiche (una per la label ed una per il campo effettivo).\r\nE\' possibile regolare le percentuali di occupazione della componente label\r\ne della componente widget. Le percentuali sono relative allo spazio a\r\ndisposizione dell\'interno pannello.\r\n</p>'"
 *        annotation="logicpkg pkg='ui.layout'"
 * @generated
 */
public interface VerticalFlowPanelLayout extends PanelLayout {
} // VerticalFlowPanelLayout
