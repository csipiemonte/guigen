/**
 */
package it.csi.mddtools.guigen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Widget che permette di selezionare uno o due valori in un range numerico continuo.
 * </p>
 * <p><b>aspetto grafico</b></p>
 * <ul>
 * <li>E' dotato di etichetta come tutti gli altri widget a lato del widget;</li>
 * <li>appare come un classico slider, ad orientamento orizzontale</li>
 * <li>contestualmente allo slider &egrave; visualizzato il valore correntemente selezionato</li>
 * <li>in caso di slider a selezione singola appare solo un elemento spostabile che determiner&agrave;
 *        il valore selezionato</li>
 * <li>in caso di slider a selezione multipla appaiono due elementi spostabili,uno per l'estremo inferiore 
 *        ed uno per l'estremo superiore del range e le due posizioni determineranno la coppia di valori che
 *        rappresenteranno gli estremi del range</li>
 * </ul>
 * <p><b>binding con dati</b></p>
 * <ul>
 *  <li> lo slider &egrave; un <b>DataWidget</b>, pertanto il suo valore sar&agrave; sincronizzato 
 * con un <b>ApplicationData</b> tramite data-binding:
 *   <ul>
 *     <li>se il tipo dell'application data collegato &egrave; un tipo semplice (non array)  lo slider sar&agrave;
 *            da considerarsi a selezione puntuale, e il valore selezionato sar&agrave; sincronizzato con il valore 
 *            di tale application data</li>
 *     <li>se il tipo dell'application data collegato &egrave; un array di tipi semplici lo slider sar&agrave; 
 *            da considerarsi a selezione di intervallo e il range selezionato dar&agrave; origine ad un array di 
 *            due elementi che conterranno l'estremo inferiore e l'estremo superiore dell'intervallo</li>
 *     <li>pu&ograve; essere definito un collection binding, che viene interpretato diversamente a seconda 
 *            del valore dell'opzione <i>useCollectionDataAs</i></li>
 *        <ul>       
 *           <li>se <i>useCollectionBindingAs</i>="values": gli elementi dell'application data collegato 
 *                  saranno presi come valori discreti selezionabili (e saranno considerati ordinati secondo 
 *                  l'ordinamento dell'array) <b>N.B: FEATURE NON ANCORA IMPLEMENTATA</b></li>
 *           <li  se <i>useCollectionDataAs</i>="range": gli elementi 0 e 1 dell'array (che devono essere 
 *                 necessariamente numerici ed ordinati in modo crescente) rappresentano gli estremi inferiore 
 *                 e superiore del range selezionabile</li>
 *        </ul>
 *   </ul>
 * </ul>
 * 
 * <p></b>opzioni di configurazione</b></p>
 * <ul>
 *     <li>il tipo del binding determina se lo slider è da considerarsi puntuale o di intervallo</li>
 *     <li> l'opzione useCollectionDataAs determina come considerare i dati del collection binding:
 *       <ul>
 *         <li>"values" -> valori discreti selezionabili verrà implementato in futuro </li>
 *         <li> "range" -> estremi dell'intervallo (continuo/numerico) selezionabile </li>
 *      </ul>
 *    </li>
 * </ul>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.guigen.Slider#getUseCollectionDataAs <em>Use Collection Data As</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Slider#getStaticLowerBound <em>Static Lower Bound</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Slider#getStaticUpperBound <em>Static Upper Bound</em>}</li>
 *   <li>{@link it.csi.mddtools.guigen.Slider#getStaticStep <em>Static Step</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.guigen.GuigenPackage#getSlider()
 * @model
 * @generated
 */
public interface Slider extends DataWidget, MultiDataWidget {
	/**
	 * Returns the value of the '<em><b>Use Collection Data As</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.guigen.SliderCollectionValuesUsageTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Collection Data As</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * Permette di decidere come utilizzare il contenuto del collection data binding.
	 * Attualmente l'unico valore ammissibile &egrave; "range" e indica al generatore 
	 * di utilizzare i primi due elementi (numerici) dell'array collegato tramite collection
	 * data binding come estremi inferiore e superiore del range di valori selezionabili.
	 * N.B: serve nei casi in cui sia necessario un range dinamico; nel caso in cui invece
	 * sia sufficiente un range statico definito a tempo di modellazione &egrave; necessario
	 * modellare le due property <i>staticLowerBound</i> e <i>staticUpperBound</i>
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Collection Data As</em>' attribute.
	 * @see it.csi.mddtools.guigen.SliderCollectionValuesUsageTypes
	 * @see #setUseCollectionDataAs(SliderCollectionValuesUsageTypes)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSlider_UseCollectionDataAs()
	 * @model
	 * @generated
	 */
	SliderCollectionValuesUsageTypes getUseCollectionDataAs();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Slider#getUseCollectionDataAs <em>Use Collection Data As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Collection Data As</em>' attribute.
	 * @see it.csi.mddtools.guigen.SliderCollectionValuesUsageTypes
	 * @see #getUseCollectionDataAs()
	 * @generated
	 */
	void setUseCollectionDataAs(SliderCollectionValuesUsageTypes value);

	/**
	 * Returns the value of the '<em><b>Static Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * Nel caso di range staticamente definito a tempo di modellazione il valore
	 * di questa property viene utilizzato come estremo inferiore del range di valori 
	 * selezionabili
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Lower Bound</em>' attribute.
	 * @see #setStaticLowerBound(Float)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSlider_StaticLowerBound()
	 * @model
	 * @generated
	 */
	Float getStaticLowerBound();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Slider#getStaticLowerBound <em>Static Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Lower Bound</em>' attribute.
	 * @see #getStaticLowerBound()
	 * @generated
	 */
	void setStaticLowerBound(Float value);

	/**
	 * Returns the value of the '<em><b>Static Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * Nel caso di range staticamente definito a tempo di modellazione il valore
	 * di questa property viene utilizzato come estremo superiore del range di valori 
	 * selezionabili
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Upper Bound</em>' attribute.
	 * @see #setStaticUpperBound(Float)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSlider_StaticUpperBound()
	 * @model
	 * @generated
	 */
	Float getStaticUpperBound();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Slider#getStaticUpperBound <em>Static Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Upper Bound</em>' attribute.
	 * @see #getStaticUpperBound()
	 * @generated
	 */
	void setStaticUpperBound(Float value);

	/**
	 * Returns the value of the '<em><b>Static Step</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * se configurato definisce di quanto aumenta/diminuisce il valore selezionato
	 * a fronte di uno spostamento unitario del selettore
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Step</em>' attribute.
	 * @see #setStaticStep(Float)
	 * @see it.csi.mddtools.guigen.GuigenPackage#getSlider_StaticStep()
	 * @model default="1"
	 * @generated
	 */
	Float getStaticStep();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.guigen.Slider#getStaticStep <em>Static Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Step</em>' attribute.
	 * @see #getStaticStep()
	 * @generated
	 */
	void setStaticStep(Float value);

} // Slider
