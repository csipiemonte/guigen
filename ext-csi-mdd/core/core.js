


// dichiarazione dei namespace


Ext.ns('ExtCsi.mdl.data');

Ext.ns('ExtCsi.cmd');

Ext.ns('ExtCsi.mdl.types');

Ext.ns('ExtCsi.ui.menu');

Ext.ns('ExtCsi.ui.widgets.table');

Ext.ns('ExtCsi.ui.panels');

Ext.ns('ExtCsi.ui.widgets');

Ext.ns('ExtCsi.ui.event');

Ext.ns('ExtCsi.app');

Ext.ns('ExtCsi.security');

Ext.ns('ExtCsi.ui.state');

Ext.ns('ExtCsi.ui.layout');




/*PROTECTED REGION ID(_commonEvents) ENABLED START*/

// Required if showing validation messages
Ext.QuickTips.init();

//***funzione di navigazione dei wizard
var cardNav = function(incr, idWizard){
    var l = Ext.getCmp(idWizard).getLayout();
    var length = Ext.getCmp(idWizard).items.items.length;
    var i = l.activeItem.id.split(idWizard+'-card-')[1];
    var next = parseInt(i, 10) + incr;
    l.setActiveItem(next);
    Ext.getCmp(idWizard+'-card-prev').setDisabled(next==0);
    Ext.getCmp(idWizard+'-card-next').setDisabled(next==length-1);
};

/**
 * @class ExtCsi.app.Constants
 * Utility per le costanti comuni
 * @singleton
 */
ExtCsi.app.Constants = function(){
	return{
		/**
		 * 
		 * restituisce l'id dell'oggetto che contiene
		 * tutte le tabelle editabili della pagina
		 * value = '${editable_page_table}'
		 * @type String
		 */
		ID_EDITABLE_TABLE: '${editable_page_table}',
		/**
		 * 
		 * restituisce l'id dell'oggetto che
		 * contiene uno o più record selezionati 
		 * nella tabella
		 * value = '${table_records_selected}'
		 * @type String
		 */
		TABLE_RECORD_SELECTED: '${table_records_selected}',
		/**
		 * restituisce l'id della viewport
		 * generata
		 * value = 'guigen-vwport-2010'
		 * @type String
		 */
		ID_VIEWPORT: 'guigen-vwport-2010',
		/**
		 * restituisce l'id della viewport
		 * associata al dialogpanel
		 * value = 'guigen-vwport-dialog'
		 * @type String
		 */
		ID_VIEWPORT_DIALOG: 'guigen-vwport-dialog',
		/**
		 * restituisce l'id del pannello a sud
		 * della viewport
		 * value = 'viewport_southPanel'
		 * @type String
		 */
		ID_SOUTH_PANEL: 'viewport_southPanel',
		/**
		 * restituisce l'id del pannello
		 * a est della viewport
		 * value = 'viewport_eastPanel'
		 * @type String
		 */
		ID_EAST_PANEL: 'viewport_eastPanel',
		/**
		 * restituisce l'id del pannello 
		 * ad ovest della viewport
		 * value = 'viewport_westPanel'
		 * @type String
		 */
		ID_WEST_PANEL: 'viewport_westPanel',
		/**
		 * restituisce l'id del pannello
		 * al centro della viewport
		 * value = 'viewport_centerPanel'
		 * @type String
		 */
		ID_CENTER_PANEL: 'viewport_centerPanel',
		/**
		 * restituisce l'id della toolbar
		 * value = 'viewport_toolbar'
		 * @type String
		 */
		ID_TOOLBAR: 'viewport_toolbar',
		/**
		 * restituisce l'id della struttura
		 * del menubar
		 * value = '${menubar-structure}'
		 * @type String
		 */
		MENUBAR_STRUCTURE: '${menubar-structure}',
		/**
		 * restituisce la classe css
		 * della toolbar
		 * value = 'tbl-Menu'
		 * @type String
		 */
		TOOLBAR_CSS_CLASS: 'tbl-Menu',
		/**
		 * restituisce il messaggio per
		 * l'errore 304 restituito dalla response
		 * value = 'Impossibile eseguire l\'operazione'
		 * @type String
		 */
		MSG_FAILURE_REQUEST_304: 'Impossibile eseguire l\'operazione',
		/**
		 * restituisce il messaggio per
		 * l'errore 401 restituito dalla response
		 * value = 'Autenticazione richiesta - Bisogna autenticarsi'
		 * @type String 
		 */
		MSG_FAILURE_REQUEST_401: 'Autenticazione richiesta - Bisogna autenticarsi',
		/**
		 * restituisce il messaggio per
		 * l'errore 302 restituito dalla response
		 * value = 'Sessione scaduta'
		 * @type String 
		 */
		MSG_FAILURE_REQUEST_302: 'Sessione scaduta',
		/**
		 * restituisce il messaggio per
		 * l'errore 500 restituito dalla response
		 * value = 'Si &egrave; verificato un errore applicativo.'
		 * @type String 
		 */
		MSG_FAILURE_REQUEST_500: 'Si &egrave; verificato un errore applicativo.',
		/**
		 * restituisce il messaggio per
		 * l'errore generico restituito dalla response
		 * value = 'Si &egrave; verificato un problema generico'
		 * @type String 
		 */
		MSG_FAILURE_REQUEST_GENERIC: 'Si &egrave; verificato un problema generico',
		/**
		 * restituisce il messaggio per
		 * l'eccezione remota restituito dalla response
		 * value = 'Attenzione eccezione remota'
		 * @type String 
		 */
		MSG_REMOTE_EXCEPTION: 'Attenzione eccezione remota',
		/**
		 * restituisce il titolo per il box
		 * di attesa
		 * value = 'Attendere'
		 * @type String 
		 */
		MSG_TITLE_LOADBOX: 'Attendere',
		/**
		 * restituisce il testo
		 * che compare sulla progress
		 * value = 'Attendere...'
		 * @type String 
		 */
		MSG_PROGRESS_TEXT: 'Attendere...',
		/**
		 * restituisce il testo
		 * che compare nel body del
		 * box di attesa
		 * value = 'Lettura dati in corso...'
		 * @type String 
		 */
		MSG_BODY_LOADBOX: 'Lettura dati in corso...',
		/**
		 * restituisce il testo
		 * che compare nel messageBox se ci sono
		 * dei globalErrors
		 * value = 'Attenzione!'
		 * @type String 
		 */
		MSG_SERVER: 'Attenzione!',
		/**
		 * restituisce la classe css
		 * da applicare all'icona del
		 * box di attesa
		 * value = 'ext-mb-download'
		 * @type String 
		 */
		CSS_ICON_LOADBOX: 'ext-mb-download',
		/**
		 * restituisce la classe css
		 * da applicare alla
		 * voce di menu
		 * value = 'button-Menu'
		 * @type String 
		 */
		CSS_ITEM_MENU: 'button-Menu',
		/**
		 * restituisce la classe css
		 * da applicare alla
		 * voce di menu sull hover
		 * value = 'extra-over-button-Menu'
		 * @type String 
		 */
		CSS_HOVER_ITEM_MENU: 'extra-over-button-Menu',
		/**
		 * restituisce il nome del content
		 * panel corrente
		 * value = '${CurrentCpName}'
		 * @type String 
		 */
		CURRENT_CP_NAME: '${CurrentCpName}',
		/**
		 * restituisce la classe css
		 * associata all'icona di info
		 * value = 'dialog-panel-info'
		 * @type String 
		 */
		ICON_INFO_CLASS: 'dialog-panel-info',
		/**
		 * restituisce la classe css
		 * associata all'icona di error
		 * value = 'dialog-panel-error'
		 * @type String 
		 */
		ICON_ERROR_CLASS: 'dialog-panel-error',
		/**
		 * restituisce la classe css
		 * associata all'icona di question
		 * value = 'dialog-panel-question'
		 * @type String 
		 */
		ICON_QUESTION_CLASS: 'dialog-panel-question',
		/**
		 * restituisce la classe css
		 * associata all'icona di warning
		 * value = 'dialog-panel-warning'
		 * @type String 
		 */
		ICON_WARNING_CLASS: 'dialog-panel-warning',
		/**
		 * restituisce il nome dell'oggetto che 
		 * contiene il booleano che indica
		 * se la richiesta è stata completata
		 * value = '${ajax-request-loading}'
		 * @type String 
		 */
		AJAX_REQUEST_LOADING: '${ajax-request-loading}',
		/**
		 * restituisce il nodo selezionato su un tree
		 * value = '${selected-tree-node}'
		 * @type String 
		 */
		SELECTED_TREE_NODE: 'selected-tree-node'
	};
}();

/**
 * Shorthand per {@link ExtCsi.app.Constants}
 */
ExtCsi.Const = ExtCsi.app.Constants;

/**
 * gestore code
 */
MessageBus = new Ext.util.Observable();


// ***sovrascrittura proprietà afterrender per mostrare i tooltip
Ext.override(Ext.form.Field, {
			afterRender : function() {
				if (this.helpText) {
					var label = ExtCsi.Utils.findLabel(this);
					if (label) {
						Ext.QuickTips.register({
									target : label,
									title : '',
									text : this.helpText,
									enabled : true
								});
					}
				}
				Ext.form.Field.superclass.afterRender.call(this);
				this.initEvents();
				this.initValue();
			}
		});

/**
 * @class ExtCsi.app.ObjectRegistry
 * @extends {Object}
 *          <p>
 *          La classe ObjectRegistry permette di registrare gli oggetti che
 *          compongono la struttura della pagina
 *          </p>
 *          <p>
 *          <b><u>Esempi</u></b>
 *          </p>
 *          <p>
 *          Questo esempio mostra come registrare un oggetto:<br>
 * 
 * <pre><code>
 * globalRegistry.registerObject('${Integer}', new ExtCsi.mdl.types.SimpleType({
 * 					name : 'Integer',
 * 					code : ExtCsi.mdl.types.SimpleTypeCodes().INT,
 * 					userDefined : false,
 * 					nillable : false
 * 				}));
 * </code></pre>
 * 
 * </p>
 * <p>
 * Questo esempio mostra come reperire un'oggetto registrato:<br>
 * 
 * <pre><code>
 * globalRegistry.getRegisteredObject('idOggetto');
 * </code></pre>
 * 
 * </p>
 * <p>
 * Questo esempio mostra come rimuovere un'oggetto registrato:<br>
 * 
 * <pre><code>
 * globalRegistry.clearRegisteredObjects('idOggetto');
 * </code></pre>
 * 
 * </p>
 */
ExtCsi.app.ObjectRegistry = Ext.extend(Object, {
			/**
			 * @property registeredObjects Variabile che contiene l'arrai di
			 *           oggetti che rappresentano la struttura della pagina
			 */
			registeredObjects : [],
			/**
			 * funzione che permette di registrare un oggetto nella stuttura
			 * della pagina
			 * 
			 * @param {String}
			 *            objId
			 * @param {Object}
			 *            objStruct
			 */
			registerObject : function(objId, objStruct) {
				var objectForPanel = this.getRegisteredObject(objId);
				if (objectForPanel == null) {
					this.registeredObjects.push({
								id : objId,
								value : objStruct
							});
				}
			},
			/**
			 * funzione che permette di reperire un oggetto registrato
			 * 
			 * @param {String}
			 *            objId
			 * @return {Object}
			 */
			getRegisteredObject : function(objId) {
				var currObject = this.registeredObjects;
				for (var i = 0; i < currObject.length; i++) {
					var currSubp = currObject[i];
					if (currSubp.id == objId) {
						return currSubp.value;
					}
				}
				return null;
			},
			/**
			 * funzione che permette di rimuovere dagli oggetti registrati
			 * l'oggetto passato
			 * 
			 * @param {String}
			 *            objId
			 * @param {Object}
			 *            objStruct
			 */
			clearRegisteredObjects : function(objId) {
				var currObject = this.registeredObjects;
				for (var i = 0; i < currObject.length; i++) {
					var currSubp = currObject[i];
					if (currSubp.id == objId) {
						currObject.splice(i,1);
					}
				}
			}
		});

var globalRegistry = new ExtCsi.app.ObjectRegistry();

/**
 * @class ExtCsi.app.ExecAjaxRequest
 * @extends {Object}
 *          <p>
 *          La classe ExecAjaxRequest permette di effettuare una chiamata ajax
 *          passando dei parametri nella configurazione
 *          </p>
 *          <p>
 *          <b><u>Esempi</u></b>
 *          </p>
 *          <p>
 *          Questo esempio mostra come effettuare una chiamata:<br>
 * 
 * <pre><code>
 * var req = new ExtCsi.app.ExecAjaxRequest({
 * 			url : url,
 * 			params : params,
 * 			results : this.results
 * 		});
 * req.init();
 * </code></pre>
 * 
 * </p>
 * @param {Object}
 *            config
 */
ExtCsi.app.ExecAjaxRequest = function(config) {
	config = config || {};
	Ext.apply(this, config);
}

Ext.extend(ExtCsi.app.ExecAjaxRequest, Object, {
	/**
	 * @cfg {String} url Rappresenta la url da chiamare
	 */
	url : null,
	/**
	 * @cfg {Object} params Oggetto che rappresenta i parametri da passare nella
	 *      chiamata
	 */
	params : null,
	/**
	 * @cfg {String} method Rappresenta il metodo con cui eseguire la chiamata,
	 *      i valori possibili sono 'GET' e 'POST' il valore di default è 'POST'
	 * @default 'POST'
	 */
	method : 'POST',
	/**
	 * @cfg {Object} results Rappresenta l'array dei results associati al
	 *      command
	 */
	results : null,
	/**
	 * @cfg {Boolean} impostare a true se si vogliono caricare i dati nei singoli widget dopo i
	 * vari command
	 * @default 'false'
	 */
	storeData : false,
	/**
	 * 
	 * @cfg {Boolean}
	 * se impostato a true allora vuol dire che sto facendo
	 * un refresh command del content panel
	 * in questo caso non devo lanciare il nopCommand
	 * @default 'false'
	 */
	isOnRefreshCommand: false,
	/**
	 * Inizializza la chiamata tramite l'oggetto 'Ext.Ajax.request'
	 */
	init : function() {
		var res = this.results;
		var storeData = this.storeData;
		var isOnRefreshCommand = this.isOnRefreshCommand;
		Ext.Ajax.request({
			url : this.url,
			params : Ext.apply(this.params),
			method : 'POST',
			beforerequest : this.showLoadBox(),
			requestexception : Ext.util.Format.messaggiErroreConnection,
			success : function(response, opts) {
				new ExtCsi.app.ExecAjaxRequest().hideLoadBox();
				var jsonDec = ''
				if(!Ext.isEmpty(response.responseText)){
					jsonDec = new Ext.util.JSON.decode(response.responseText);
				}
				var resultCode = jsonDec.resultCode;
				var globalErrors = jsonDec.globalErrors;
				var globalMessages = jsonDec.globalMessages;
				if(!Ext.isEmpty(globalErrors)){
					Ext.Msg.show({
							title : ExtCsi.Const.MSG_SERVER,
							msg : globalErrors,
							icon : Ext.Msg.ERROR,
							minWidth : 400,
							buttons : Ext.Msg.OK
						});
					return;
				}
				if(!Ext.isEmpty(globalMessages)){
					Ext.Msg.show({
							title : ExtCsi.Const.MSG_SERVER,
							msg : globalMessages,
							icon : Ext.Msg.INFO,
							minWidth : 400,
							buttons : Ext.Msg.OK
						});
				}
				//***controllo lo stato del menu
				var menuStatus = jsonDec.menuStatus;
				if(menuStatus){
					for (var i = 0; i < menuStatus.length; i++) {
						var menu = menuStatus[i];
						var mmnn = 	Ext.getCmp(menu.menuName);
						if(mmnn){
							menu.enabled ? mmnn.enable() : mmnn.disable();
							menu.visible ? mmnn.show() : mmnn.hide();
						}
					}
				}
				//***controllo lo stato dei widgets
				var widgetsStatus = jsonDec.widgetsStatus;
				if(widgetsStatus){
					for (var i = 0; i < widgetsStatus.length; i++) {
						var widget = widgetsStatus[i];
						var extWidg = Ext.getCmp(widget.widgetName);
						if(extWidg){
							widget.disabled ? extWidg.disable() : extWidg.enable();
							widget.visible ? extWidg.show() : extWidg.hide();
						}
					}
				}
				var currCp = globalRegistry.getRegisteredObject(ExtCsi.Const.CURRENT_CP_NAME);
				if(isOnRefreshCommand || (currCp && !currCp.onRefreshCommand)){
					MessageBus.fireEvent('init');
					MessageBus.purgeListeners();
				}

				if (res) {
					for (var i = 0; i < res.length; i++) {
						result = res[i];
						if (result.resultCode == resultCode) {
							var command = result.command;
							if (command) {
								if (command instanceof ExtCsi.cmd.RefreshViewCommand) {
									command.setResponseTextDecoded(jsonDec);
								}
								if(storeData){
									command.setStoreData(storeData);
								}
								/*
								 * lancio il do command solo se non sto facendo l'onrefreshCommand sul contentpanel
								 * oppure non sto facendo un nop
								 */
								if((command instanceof ExtCsi.cmd.NOPCommand && !isOnRefreshCommand) || !(command instanceof ExtCsi.cmd.NOPCommand)){
									command.doCommand();
								}
							}
						}
					}
				}
			},
			failure : function(response, opts) {
				new ExtCsi.app.ExecAjaxRequest().hideLoadBox();
				//***rimuovo il parametro dal registry
				var messaggio = "";
				if (response.status == '304') {
					messaggio = ExtCsi.Const.MSG_FAILURE_REQUEST_304;
				} else if (response.status == '200') {
					var testo = response.responseText;
					if (testo.indexOf('applicationError') != -1) {
						messaggio = testo.substring(
										testo.indexOf('<div id="applicationError">')+ 27, testo.indexOf('</div>'));
					} else {
						return; // Do nothing
					}
				} else if (response.status == '401') {
					messaggio = ExtCsi.Const.MSG_FAILURE_REQUEST_401;
				} else if (response.status == '302') {
					messaggio = ExtCsi.Const.MSG_FAILURE_REQUEST_302;
				} else if (response.status == '500') {
					messaggio = ExtCsi.Const.MSG_FAILURE_REQUEST_500;
				} else {
					messaggio = ExtCsi.Const.MSG_FAILURE_REQUEST_GENERIC;
				}
				Ext.Msg.show({
							title : ExtCsi.Const.MSG_REMOTE_EXCEPTION,
							msg : messaggio,
							icon : Ext.Msg.ERROR,
							minWidth : 400,
							buttons : Ext.Msg.OK
						});
			}
		});
	},
	/**
	 * @private Mostra la maschera di attesa
	 */
	showLoadBox : function() {
		Ext.MessageBox.show({
					title : ExtCsi.Const.MSG_TITLE_LOADBOX,
					msg : ExtCsi.Const.MSG_BODY_LOADBOX,
					progressText : ExtCsi.Const.MSG_PROGRESS_TEXT,
					width : 300,
					progress : false,
					closable : true,
					icon : ExtCsi.Const.CSS_ICON_LOADBOX
				});
	},
	/**
	 * @private nasconde il messaggio di attesa
	 */
	hideLoadBox : function() {
		if (Ext.MessageBox.isVisible()) {
			Ext.MessageBox.hide();
		}
	}
});

/** 
 * @class ExtCsi.ui.widgets.EditableColumnLoader
 * @param {Object} options
 * plugin per l'editabilità delle singole celle
 */
ExtCsi.ui.widgets.EditableColumnLoader = function(options) {
    Ext.apply(this, options);
}

ExtCsi.ui.widgets.EditableColumnLoader.prototype = {
    init: function(o) {
    
        this.o = o;
    
        var xType = o.getXType();
        switch(xType) {
        case 'editorgrid':
        	//***registro l'id della tabella editabile per poi recuperarla nel cmp
        	var tblReg = [];
        	if(globalRegistry.getRegisteredObject(ExtCsi.Const.ID_EDITABLE_TABLE)){
        		tblReg = globalRegistry.getRegisteredObject(ExtCsi.Const.ID_EDITABLE_TABLE);
        	}
        	//***aggiungo il nuovo id solo se non l'ho già fatto
        	if(tblReg.indexOf(o.id) == -1){
        		tblReg.push(o.id);
        		globalRegistry.registerObject(ExtCsi.Const.ID_EDITABLE_TABLE,tblReg);
        	}
        	
            var store = o.getStore();
            var cm = o.getColumnModel();
            var cols = cm.config;
            var autoAssignDisplayValue = false;
            
            for(var i=0; i<cols.length; i++) {
                var col = cols[i];
                if(col.editor) {
                    var field = col.editor.field;
                    autoAssignDisplayValue = true;
                }
            }
            //***non tutte le colonne possono essere editabili
            if(autoAssignDisplayValue){
            	o.on('beforeedit', this.onBeforeEdit);
            }
            break;
        default:
            break;
        } 
    },
    onBeforeEdit: function(e) {
        var value = e.value;
        switch(typeof(value)) {
            case 'string':
                if(value.length == 0) {
                    return;
                }
                break;
            case 'number':
                if(value == 0) {
                    return;
                }
                break;
            default:
                return;
        }

        var record = e.record;
        
        var colIndex = e.column;
        var cm = e.grid.getColumnModel();
        
        var colId = cm.getColumnId(colIndex);
        var col = cm.getColumnById(colId);
        
        var flagSelector = col.editableFlagSelector;
        
        if(flagSelector){
        	var st = e.grid.store;
        	var rec = st.getById(record.id);
        	return rec.get(flagSelector);
        }
    }
}
/**
 * @class ExtCsi.ui.widgets.Utility
 *        <p>
 *        La classe Utility mette a disposizione una serie di utility per la
 *        definizione dei vari widget
 *        </p>
 *        <p>
 *        <b><u>Esempi</u></b>
 *        </p>
 *        <p>
 *        Questo esempio mostra come chiamare la funzione findLabel che esegue
 *        la ricerca di una label associata ad un field<br>
 * 
 * <pre><code>
 * ExtCsi.Utils.findLabel(field)
 * </code></pre>
 * 
 * </p>
 * <p>
 * Questo esempio mostra come chiamare la funzione getOgnlValue<br>
 * 
 * <pre><code>
 * var value = ExtCsi.Utils.getOgnlValue(widget)
 * </code></pre>
 * 
 * </p>
 * <p>
 * La funzione createGenericStoreFields permette di costruire i campi dello
 * store per un generico widget
 * </p>
 * <p>
 * Questo esempio mostra come chiamare la funzione createGenericStoreFields<br>
 * 
 * <pre><code>
 * var value = ExtCsi.Utils.createGenericStoreFields(widget)
 * </code></pre>
 * 
 * </p>
 * <p>
 * La funzione isMultiBinding permette di capire se l'applicationData associato
 * al widget è di tipo array
 * </p>
 * <p>
 * Questo esempio mostra come chiamare la funzione isMultiBinding<br>
 * 
 * <pre><code>
 * var value = ExtCsi.Utils.isMultiBinding(widget)
 * </code></pre>
 * 
 * </p>
 * <p>
 * La funzione createStoreFields costruisce i campi per lo store di una tabella,
 * per gli altri widget usare createGenericStoreFields
 * </p>
 * <p>
 * Questo esempio mostra come chiamare la funzione isMultiBinding<br>
 * 
 * <pre><code>
 * var value = ExtCsi.Utils.createStoreFields(widget)
 * </code></pre>
 * 
 * </p>
 * <p>
 * La funzione createFilters costruisce i filtri per una tabella
 * </p>
 * <p>
 * Questo esempio mostra come chiamare la funzione createFilters<br>
 * 
 * <pre><code>
 * var value = ExtCsi.Utils.createFilters(widget)
 * </code></pre>
 * 
 * </p>
 * <p>
 * La funzione createColumnModel costruisce le colonne per una tabella
 * </p>
 * <p>
 * Questo esempio mostra come chiamare la funzione createColumnModel<br>
 * 
 * <pre><code>
 * var value = ExtCsi.Utils.createColumnModel(widget)
 * </code></pre>
 * 
 * </p>
 * <p>
 * La funzione getColumnType restituisce il tipo di dato associato alle colonne
 * della tabella nell'applicationData
 * </p>
 * <p>
 * Questo esempio mostra come chiamare la funzione getColumnType<br>
 * 
 * <pre><code>
 * var value = ExtCsi.Utils.getColumnType(columnName, widget)
 * </code></pre>
 * 
 * </p>
 * <p>
 * La funzione formatColumn formatta il contenuto di una colonna di una tabella
 * o di un campo
 * </p>
 * <p>
 * Questo esempio mostra come chiamare la funzione formatColumn<br>
 * 
 * <pre><code>
 * var value = ExtCsi.Utils.formatColumn(colType)
 * </code></pre>
 * 
 * </p>
 * @singleton
 */
ExtCsi.ui.widgets.Utility = function() {
	return {
		/**
		 * esegue la ricerca del field
		 * 
		 * @param {Ext.form.Field}
		 *            field
		 * @return {String}
		 */
		findLabel : function(field) {
			var wrapDiv = null;
			var label = null
			wrapDiv = field.getEl().up('div.x-form-item');
			if (wrapDiv) {
				label = wrapDiv.child('label');
			}
			if (label) {
				return label;
			}
		},
		/**
		 * restituisce il valore associato al campo, come parametro ognl
		 * leggendolo dal databinding
		 * @param {ExtCsi.ui.widgets.Widget}
		 *            widget
		 * @return {String}
		 */
		getOgnlValue : function(widget) {
			if (widget.databinding) {
				var path = '';
				if (widget.databinding.path) {
					path = '.' + widget.databinding.path;
				}
				var appData = globalRegistry
						.getRegisteredObject(widget.databinding.appData);
				if (appData) {
					return 'appData' + appData.name + path;
				}
			}
			return '_widg_'+widget.name;
		},
		/**
		 * restituisce il valore dell'application data, come parametro ognl
		 * leggendolo dal multiDataBinding
		 * @param {ExtCsi.ui.widgets.Widget}
		 *            widget
		 * @return {String}
		 */
		getOgnlValuess : function(widget) {
			if (widget.multiDataBinding) {
				var path = '';
				if (widget.multiDataBinding.path) {
					path = '.' + widget.multiDataBinding.path;
				}
				var appData = globalRegistry
						.getRegisteredObject(widget.multiDataBinding.appData);
				if (appData) {
					return 'appData' + appData.name + path;
				}
			}
			return null;
		},
		/**
		 * restituisce i campi dello store
		 * 
		 * @param {ExtCsi.ui.widgets.Widget}
		 *            widget
		 * @return {Array}
		 */
		createGenericStoreFields : function(widget) {
			var cm = [];
			try {
				var appData = globalRegistry
						.getRegisteredObject(widget.multiDataBinding.appData);
				if(!appData){
					appData = widget.multiDataBinding.appData
				}
				var appType = globalRegistry.getRegisteredObject(appData.type);
				if(!appType){
					appType = appData.type;
				}
				var cpType = globalRegistry
						.getRegisteredObject(appType.componentType);
				if(!cpType){
					cpType = appType.componentType;
				}
				for (var i = 0; i < cpType.fields.length; i++) {
					var tp = cpType.fields[i];
					cm.push({
								name : tp.name
							});
				}
			} catch (ex) {
			}
			return cm;
		},
		/**
		 * restituisce true se l'appData è di tipo Array
		 * 
		 * @param {ExtCsi.ui.widgets.Widget}
		 *            widget
		 * @return {Boolean}
		 */
		isMultiBinding : function(sbb) {
			try {
				var appData = globalRegistry
						.getRegisteredObject(sbb.databinding.appData);
				var typeData = globalRegistry.getRegisteredObject(appData.type);
				if (typeData instanceof ExtCsi.mdl.types.TypedArray) {
					return true;
				}
				return false;
			} catch (ex) {
				return false;
			}
		},
		/**
		 * costruisce i campi per lo store di una tabella, per gli altri widget
		 * usare createGenericStoreFields
		 * 
		 * @param {ExtCsi.ui.widgets.Widget}
		 *            widget
		 * @return {Array}
		 */
		createStoreFields : function(sbb) {
			var cm = [];
			var cols = sbb.columnModel;
			for (var i = 0; i < cols.columns.length; i++) {
				var ce = cols.columns[i];
				// var colType = this.getColumnType(ce.selector, sbb);
				cm.push({
					name : ce.selector
						// type: colType
					});
				//***se ho un flag selectorEditable allora lo aggiungo come proprietà dello store
				if(ce.editableFlagSelector){
					cm.push({
						name : ce.editableFlagSelector
					});
				}
				//***se ho un flag selectorActive allora lo aggiungo come proprietà dello store
				if(ce.activeFlagSelector){
					cm.push({
						name : ce.activeFlagSelector
					});
				}
			}
			return cm;
		},
		/**
		 * costruisce i filtri per una tabella
		 * 
		 * @param {ExtCsi.ui.widgets.Widget}
		 *            widget
		 * @return {Array}
		 */
		createFilters : function(sbb) {
			var cm = [];
			var cols = sbb.columnModel;
			for (var i = 0; i < cols.columns.length; i++) {
				var ce = cols.columns[i];
				var colType = this.getColumnType(ce.selector, sbb);
				cm.push({
							dataIndex : ce.selector,
							type : colType == 'numeric-decimal'
									? 'numeric'
									: colType,
							dateFormat : colType == 'date' ? 'd/m/Y' : null
						});
			}
			return cm;
		},
		/**
		 * costruisce le colonne di una tabella
		 * 
		 * @param {ExtCsi.ui.widgets.Widget}
		 *            widget
		 * @param {Ext.grid.CheckboxSelectionModel}
		 * @return {Array}
		 */
		createColumnModel : function(sbb, sm) {
			var cm = [];
			//***se ho una selezione attiva aggiungo
			if(sm){
				cm.push(sm);
			}
			var cols = sbb.columnModel;
			for (var i = 0; i < cols.columns.length; i++) {
				var ce = cols.columns[i];
				var colType = this.getColumnType(ce.selector, sbb);
				cm.push({
							id : ce.selector,
							header : ce.label,
							sortable : ce.sortable,
							tooltip : ce.tooltip,
							dataIndex : ce.selector,
							editableFlagSelector: ce.editableFlagSelector,
							renderer : ce.multiDataBinding ? this.comboRenderer(this.renderEditColumn(ce, colType)) : this.formatColumn(colType, ce, sbb),
							editor : this.renderEditColumn(ce, colType)
						});
			}
			return cm;
		},
		/**
		 * restituisce il valore della combo e non l'id
		 * @param {Ext.form.ComboBox} combo
		 * @return {String}
		 */
		comboRenderer: function(combo){
		    return function(value){
		    	var selected = globalRegistry.getRegisteredObject('${combo_'+value+'}');
		    	if(selected){
		    		globalRegistry.clearRegisteredObjects('${combo_'+value+'}')
		    		return selected;
		    	}
		    	return value;
		    }
		},
		/**
		 * costruisce il campo corrispondente al dato se la colonna è editabile
		 * 
		 * @param {ExtCsi.ui.widgets.table.Column}
		 *            ce
		 * @param {String}
		 *            colType
		 */
		renderEditColumn : function(ce, colType) {
			if (ce.editable) {
				if (colType == 'string') {
					//***se ho un multidata allora il campo
					//***è una combo
					if (ce.multiDataBinding) {
						return new Ext.form.ComboBox({
			            	allowBlank: false,
			                forceSelection: true,
			                editable: false,
			                minChars: 0,
			                lazyRender:true,
			                displayField: ce.multidataValueSelector,
			                selectOnFocus: true,
			                valueField: ce.multidataKeySelector,
			                listeners: {
			                	select: function(combo, record) {
			                		globalRegistry.registerObject('${combo_'+combo.getValue()+'}', combo.getRawValue());
			                	}
			                },
			                store: new Ext.data.JsonStore({
									storeId : 'cbstore-' + ce.selector,
									url : ce.dataUrl,
									fields : ExtCsi.Utils.createGenericStoreFields(ce),
									listeners : {
										exception : Ext.util.Format.messaggiErrore
										// ***gestisco le eccezioni server side
									}
								})
			            })
					} else {
						return new Ext.form.TextField({
									allowBlank : false
								})
					}
				}

				if (colType == 'numeric' || colType == 'numeric-decimal') {
					return new Ext.form.NumberField({
								allowBlank : false,
								decimalSeparator : ',',
								allowDecimals : colType == 'numeric' ? false : true,
								decimalPrecision : colType == 'numeric-decimal' ? 2 : 0
							})
				}
				if (colType == 'date') {
					return new Ext.form.DateField({
								format : 'd/m/Y'
							})
				}

				if (colType == 'boolean') {
					return new Ext.form.Checkbox({

					})
				}
			}
			return null;
		},
		/**
		 * restituisce il tipo di dato associato alle colonne della tabella
		 * nell'applicationData
		 * 
		 * @param {String}
		 *            columnName
		 * @param {ExtCsi.ui.widgets.Widget}
		 *            widget
		 */
		getColumnType : function(columnName, widget) {
			try {
				var appData = globalRegistry
						.getRegisteredObject(widget.multiDataBinding.appData);
				if(!appData){
					appData = widget.multiDataBinding.appData;
				}
				var appType = globalRegistry.getRegisteredObject(appData.type);
				if(!appType){
					appType = appData.type;
				}
				var cpType = globalRegistry
						.getRegisteredObject(appType.componentType);
				if(!cpType){
					cpType = appType.componentType;
				}
				for (var i = 0; i < cpType.fields.length; i++) {
					var tp = cpType.fields[i];
					if (tp.name == columnName) {
						var vType = globalRegistry.getRegisteredObject(tp.type);
						if(!vType){
							vType = tp.type;
						}
						if (vType instanceof ExtCsi.mdl.types.SimpleType) {
							switch (vType.code) {
								case ExtCsi.mdl.types.SimpleTypeCodes().INT :
								case ExtCsi.mdl.types.SimpleTypeCodes().LONG :
									return 'numeric';
								case ExtCsi.mdl.types.SimpleTypeCodes().FLOAT :
								case ExtCsi.mdl.types.SimpleTypeCodes().DOUBLE :
									return 'numeric-decimal';
								case ExtCsi.mdl.types.SimpleTypeCodes().STRING :
									return 'string';
								case ExtCsi.mdl.types.SimpleTypeCodes().DATE :
								case ExtCsi.mdl.types.SimpleTypeCodes().DATETIME :
									return 'date';
								case ExtCsi.mdl.types.SimpleTypeCodes().BOOLEAN :
									return 'boolean';
								default :
									return 'string';
							}
							return;
						}else{
							Ext.Msg.alert('Attenzione', 'Il tipo di colonna non è stato modellato correttamente.');
							return 'string';
						}
					}
				}
			} catch (ex) {
				return 'string';
			}
		},
		/**
		 * formatta il contenuto di una colonna o di un campo
		 * 
		 * @param {String}
		 *            colType
		 * @param {ExtCsi.ui.widgets.table.Column} ce
		 * @param {ExtCsi.ui.widgets.Table} sbb
		 */
		formatColumn : function(colType, ce, sbb) {
			return function(v, p, record) {
				if (colType == 'boolean') {
					if (v) {
						return 'Si';
					}
					return 'No';
				}
				if (colType == 'numeric' || colType == 'numeric-decimal') {
					v = (Math.round((v - 0) * 100)) / 100;
					v = (v == Math.floor(v)) ? v + ".00" : ((v * 10 == Math
							.floor(v * 10)) ? v + "0" : v);
					v = String(v);
					var ps = v.split('.'), whole = ps[0], sub = ps[1] ? ','
							+ ps[1] : ',00', r = /(\d+)(\d{3})/;
					while (r.test(whole)) {
						whole = whole.replace(r, '$1' + '.' + '$2');
					}
					v = whole + sub;
					if (v.charAt(0) == '-') {
						return '-$' + v.substr(1);
					}
					return v;
				}
				if (colType == 'date') {
					if (Ext.isDate(v)) {
						return v.format('d/m/Y');
					}
				}
				if(ce.eventActive){
					
					var idCella = '${event-active-'+ce.selector+'}';
					if(!globalRegistry.getRegisteredObject(idCella)){
						globalRegistry.registerObject(idCella, sbb);
					}
					var link = '<b><a class="event-active" href="javascript://csi" onclick="new ExtCsi.Utils.runEventActive(\''+ce.selector+'\',\''+record.id+'\',\''+idCella+'\')">'+v+'</a></b>';
					//var link = '<b><a class="event-active" href="javascript://csi">'+v+'</a></b>';

					if(ce.activeFlagSelector){
						var selectable = record.get(ce.activeFlagSelector);
						if(selectable){
							return link;
						}
					}else{
						return link;
					}
					
				}
				return v;
				// return this.formatData(v, colType);
			};
		},
		/**
		 * lancia l'evento attivo sulla colonna della tabella
		 * @param {String} selector
		 * @param {String} id
		 * @param {ExtCsi.ui.widgets.Table} sbb
		 */
		runEventActive: function(selector, id, sbbId){
			var sbb = globalRegistry.getRegisteredObject(sbbId);
			if (sbb && sbb.eventHandlers) {
				var eventHandlers = sbb.eventHandlers;
				for (var i = 0; i < eventHandlers.length; i++) {
					var event = eventHandlers[i];
					// ***lancio l'evento sul click
					if (event.eventType == ExtCsi.ui.event.EventTypes().CLICKED) {
						var command = event.command;
						command.setFormId(sbb.formId);
						// ***converto i params da passare alla post
						var params = {idCololnna : selector, id : id}
						command.setBaseFormParams(params);
						if (command) {
							command.setStoreData(true);
							command.doCommand();
						}
					}
				}
			}
		}

	}
}();

/**
 * Shorthand per la classe {@link ExtCsi.ui.widgets.Utility}
 */
ExtCsi.Utils = ExtCsi.ui.widgets.Utility;

/**
 * @class ExtCsi.ui.layout.WriteStructure
 * @extends {Object}
 *          <p>
 *          La classe WriteStructure permette di creare la struttura della
 *          pagina
 *          </p>
 *          <p>
 *          <b><u>Esempi</u></b>
 *          </p>
 *          <p>
 *          Questo esempio mostra come inizializzare la scrittura della
 *          struttura:<br>
 * 
 * <pre><code>
 * var struct = new ExtCsi.ui.layout.WriteStructure({
 * 			menubar : this.menubar,
 * 			contentPanel : this.homePage
 * 		});
 * struct.initComponents();
 * </code></pre>
 * 
 * </p>
 * @param {Object}
 *            config
 */
ExtCsi.ui.layout.WriteStructure = function(config) {
	config = config || {};
	Ext.apply(this, config);
}

Ext.extend(ExtCsi.ui.layout.WriteStructure, Object, {
	/**
	 * @cfg {Object} menubar il menu della pagina vedi
	 *      {@link ExtCsi.app.ApplicationArea.menubar}
	 */
	menubar : null,
	/**
	 * @cfg {Object} contentPanel rappresenta il contentPanel da richiamare
	 */
	contentPanel : null,
	/**
	 * inizializza la struttura della pagina
	 */
	initComponents : function() {

		/*
		 * se esiste già una viewport allora la distruggo
		 */
		this.distruggiViewPort(ExtCsi.Const.ID_VIEWPORT);
		this.distruggiViewPort(ExtCsi.Const.ID_VIEWPORT_DIALOG);
		
		/*
		 * recupero il contentPanel su cui costruire la struttura
		 */
		var cp = null;
		if (this.contentPanel instanceof ExtCsi.ui.panels.ContentPanel) {
			cp = this.contentPanel;
		} else {
			cp = globalRegistry.getRegisteredObject(this.contentPanel);
		}
		
		
		//***registro il contentPanel corrente
		globalRegistry.clearRegisteredObjects(ExtCsi.Const.CURRENT_CP_NAME);
		globalRegistry.registerObject(ExtCsi.Const.CURRENT_CP_NAME, cp);
		
		//***aggiungo evento al gestore code
		MessageBus.addEvents('init');

		/*
		 * recupero il formpanel principale
		 */
		var cpMain = null;
		if (cp && cp.panels instanceof ExtCsi.ui.panels.FormPanel) {
			cpMain = cp.panels;
		} else {
			cpMain = globalRegistry.getRegisteredObject(cp.panels);
		}
		
		//***inizializzo il contentPanel
		var panelStatus = new ExtCsi.app.ExecAjaxRequest({
			url : cp.dataUrl
		});
		
		/***
		 * se ho un onRefreshCommand eseguo la chiamata
		 * e metto in coda il caricamento dello stato del 
		 * content panel
		 * altrimenti carico direttamente lo stato
		 */
		if(cp.onRefreshCommand){
			MessageBus.on('init', function(){
			  panelStatus.init();
			});
			var comm = cp.onRefreshCommand;
			if(comm instanceof ExtCsi.cmd.ExecCommand){
				comm.setOnRefreshCommand(true);
			}
			cp.onRefreshCommand.doCommand();
		}else{
			panelStatus.init();
		}
		
		

		
			
		var subpns = cpMain.subpanels || cpMain.panels;

		// **potrei già essere a livello di widget
		if (subpns) {
			for (var i = 0; i < subpns.length; i++) {
				var el = subpns[i];
				if (el instanceof ExtCsi.ui.panels.WidgetsPanel
						|| el instanceof ExtCsi.ui.panels.CommandPanel
						|| el instanceof ExtCsi.ui.panels.TabSetPanel) {
					subpns = cpMain;
					break;
				}
			}
		}

		/*
		 * ciclo sui sottopannelli e costruisco i vari contenitori se non ho
		 * sottopannelli instanzio un contenitore nella regione centrale,
		 * altrimenti la viewport va in errore
		 */
		var boxs = [];

		/*
		 * aggiungo il contenitore del menu
		 */
		boxs.push(new Ext.BoxComponent({
					region : 'north',
					height : 30, // altezza del north box
					autoEl : {
						tag : 'div',
						id : 'menu-sup'
					}
				}));

		if (subpns && subpns.length) {
			for (var i = 0; i < subpns.length; i++) {
				var el = subpns[i];
				var spec = 'CENTER';
				if (el.layoutSpec != null) {
					spec = el.layoutSpec.value;
				}

				if (spec == 'DOWN') {
					boxs.push({
								region : 'south',
								id : ExtCsi.Const.ID_SOUTH_PANEL,
								split : true,
								height : 100,
								minSize : 100,
								maxSize : 200,
								collapsible : true,
								title : el.label,
								margins : '0 0 0 0',
								items : this.addItemsToBox(el)
							});
				} else if (spec == 'RIGHT') {
					boxs.push({
								region : 'east',
								id : ExtCsi.Const.ID_EAST_PANEL,
								title : el.label,
								collapsible : true,
								split : true,
								width : 225,
								minSize : 175,
								maxSize : 400,
								margins : '0 5 0 0',
								layout : {
									type : 'fit',
									padding : '5',
									align : 'left'
								},
								// autoScroll: true,
								items : this.addItemsToBox(el)
							});
				} else if (spec == 'LEFT') {
					boxs.push({
								region : 'west',
								id : ExtCsi.Const.ID_WEST_PANEL,
								title : el.label,
								split : true,
								width : 200,
								minSize : 175,
								maxSize : 400,
								collapsible : true,
								margins : '0 0 0 5',
								layout : {
									type : 'accordion',
									animate : true
								},
								items : this.addItemsToBox(el)
							});
				} else if (spec == 'CENTER') {
					boxs.push({
								region : 'center',
								id : ExtCsi.Const.ID_CENTER_PANEL,
								layout : {
									type : 'fit',
									padding : '5',
									align : 'left'
								},
								title : el.label,
								// autoScroll: true,
								items : this.addItemsToBox(el)
							});
				}
			}
		} else { // ***instanzio solo la regione centrale
			boxs.push({
						region : 'center',
						id : ExtCsi.Const.ID_CENTER_PANEL,
						// layout: 'fit',
						layout : {
							type : 'fit',
							padding : '5',
							align : 'left'
						},
						title : subpns.label,
						items : this.addItemsToBox(subpns)
					});
		}

		/*
		 * associo un id alla viewport per poterla distruggere quando
		 * reinstanzio il content panel
		 */

		var viewport = new Ext.Viewport({
					id :ExtCsi.Const.ID_VIEWPORT,
					layout : 'border',
					items : boxs
				});

		/**
		 * recupero il menubar eventualmente dal registry
		 */
		var mb = null;
		if (this.menubar instanceof ExtCsi.ui.menu.Menubar) {
			mb = this.menubar;
		} else {
			mb = globalRegistry.getRegisteredObject(this.menubar);
		}
		mb.setRenderTo('menu-sup');
		mb.init();
				
	},
	/**
	 * aggiunge gli item alla form
	 * 
	 * @param {ExtCsi.ui.panels.FormPanel}
	 *            el
	 * @return {Object}
	 */
	addItemsToBox : function(el) {
		var form = new Ext.form.FormPanel({
			id : el.name,
			name : el.name,
			// title: el.label,
			bodyStyle : 'padding:5px 5px 0',
			defaultType : 'textfield',
			autoScroll : true,
			//fileUpload: this.isMultiPartForm(el),
			items : this.addItemToForm(el, el.name),
			// layout:'anchor',
			defaults : { // defaults applied to items
				layout : 'form',
				border : false,
				bodyStyle : 'padding:10px'
			},
			// config options applicable to container when layout='form':
			hideLabels : false,
			labelAlign : 'left', // or 'right' or 'top'
			labelSeparator : '>>', // takes precedence over layoutConfig value
			labelWidth : 150, // defaults to 100
			labelPad : 3
				// defaults to 5, must specify labelWidth to be honored

			});

		return form;
	},
	/**
	 * Restituisce true se nella form
	 * c'è qualche campo di tipo upload
	 * @param {Object} el
	 * @return {Boolean}
	 */
	isMultiPartForm: function(el){
		var multi = false;
		if(el instanceof ExtCsi.ui.panels.WidgetsPanel) {
			var wdg = el.widgets;
			if (wdg) {
				for (var k = 0; k < wdg.length; k++) {
					var wdgss = wdg[k];
					if(wdgss && wdgss instanceof ExtCsi.ui.widgets.FileUpload){
						return true;
					}
				}
			}
			
		}else{
			var sb = el.subpanels || el.panels;
			
			if (sb) {
				for (var j = 0; j < sb.length; j++) {
					var sbb = sb[j];
					if(this.isMultiPartForm(sbb)){
						return true;
					}
				}
			}
		}
		return false;
	},
	/**
	 * aggiunge i titoli al contenitore della form
	 * 
	 * @param {Object}
	 *            el che può essere un ExtCsi.ui.panels.FormPanel oppure
	 *            ExtCsi.ui.panels.WidgetsPanel
	 * @return {Array}
	 */
	addItemToForm : function(el, formId) {

		var itemss = [];

		var sb = el.subpanels || el.panels;

		if (sb) {
			for (var j = 0; j < sb.length; j++) {
				var sbb = sb[j];
				this.instantiateStructure(sbb, itemss, formId);
			}
		} else { // vuol dire che sono già sul widget
			this.instantiateStructure(el, itemss, formId);
		}

		return itemss;
	},
	/**
	 * inserisce gli oggetti corrispondenti al modello
	 * 
	 * @param {Object}
	 *            sbb
	 * @param {Array}
	 *            itemss
	 * @return {Array}
	 */
	instantiateStructure : function(sbb, itemss, formId) {
		if (sbb instanceof ExtCsi.ui.panels.FormPanel) {
			itemss.push({
						xtype : 'panel',
						labelWidth : 90,
						anchor : '95%',
						title : sbb.label,
						border : false,
						items : this.addItemToForm(sbb, formId)
					});
		} else if (sbb instanceof ExtCsi.ui.panels.WidgetsPanel) {
			itemss.push({
						xtype : 'fieldset',
						title : sbb.label == null || sbb.label == ''
								? '&nbsp;'
								: sbb.label,
						collapsible : sbb.collapsible,
						autoHeight : true,
						border : sbb.label == null || sbb.label == ''
								? false
								: true,
						items : this.addLayout(sbb, formId)
					});
		} else if (sbb instanceof ExtCsi.ui.panels.CommandPanel) {
			itemss.push({
						xtype : 'panel',
						anchor : '95%',
						autoHeight : true,
						border : false,
						items : this.addLayout(sbb, formId)
					});
		} else if (sbb instanceof ExtCsi.ui.panels.TabSetPanel || sbb instanceof ExtCsi.ui.panels.WizardPanel) {

			itemss.push({
				xtype : 'panel',
				labelWidth : 90,
				anchor : '95%',
				title : sbb.label,
				border : false,
				items : this.addTabPanelToForm(sbb, formId)
			});
			/* implementazione wizard per i momento trattato come tab
		}else if (sbb instanceof ExtCsi.ui.panels.WizardPanelPippo) {
			itemss.push({
				xtype : 'panel',
				id: sbb.name,
			    title: sbb.label,
			    layout: 'card',
			    activeItem: 0,
			    bodyStyle: 'padding:15px',
			    defaults: {border:false},
			    bbar: ['->', {
			        id: sbb.name+'-card-prev',
			        text: '&laquo; Precedente',
			        handler: cardNav.createDelegate(this, [-1, sbb.name]),
			        disabled: true
			    },{
			        id: sbb.name+'-card-next',
			        text: 'Successivo &raquo;',
			        handler: cardNav.createDelegate(this, [1, sbb.name])
			    }],
			    items: this.addWizardToForm(sbb, formId)
			});*/
		}else if (sbb instanceof ExtCsi.ui.panels.MultiPanel) {
			itemss.push({
						xtype : 'panel',
						labelWidth : 90,
						anchor : '95%',
						id: sbb.name,
						title : sbb.label,
						border : false,
						items : this.addPanelToMultiPanel(sbb, formId)
					});
		}
		return itemss;
	},
	/**
	 * aggiunge i panel al multipanel
	 * di default sono tutti nascosti
	 * @param {Object} el
	 * @param {String} formId
	 * @return {Array}
	 */
	addPanelToMultiPanel: function(el, formId){
		var panels = [];
		var subpanels = el.panels;
		if (subpanels) {
			for (var i = 0; i < subpanels.length; i++) {
				var tb = subpanels[i];
				panels.push({
						xtype : 'panel',
						labelWidth : 90,
						anchor : '95%',
						title : tb.label,
						border : false,
						hidden: true,
						id: tb.name,
						items : this.addItemToForm(tb, formId)
					});
			}
		}
		return panels;
	},
	/**
	 *aggiunge gli elementi al wizard
	 * @param {Object} el
	 * @param {String} formId
	 * @return {Array}
	 */
	addWizardToForm: function(el, formId){
		var tab = [];
		var subpanels = el.panels;
		if (subpanels) {
			for (var i = 0; i < subpanels.length; i++) {
				var tb = subpanels[i];
				tab.push({
					id: el.name+'-card-'+i,
					title : tb.label,
					autoHeight: true,
					items : this.addItemToForm(tb, formId)
				});
			}
		}
		return tab;		
	},
	/**
	 * instanzia l'oggetto tabPanel sulla form
	 * 
	 * @param {Object}
	 *            el
	 * @return {Array}
	 */
	addTabPanelToForm : function(el, formId) {
		var tabs = [];
		var subpanels = el.panels;
		if (subpanels) {
			var tabPanel = new Ext.TabPanel({
						border : true,
						activeTab : 0,
						// defaults: {layout:'fit'},
						defaults : {
							autoHeight : true
						},
						items : this.addTab(subpanels, formId)
					});
			tabs.push(tabPanel);
		}
		return tabs;
	},
	/**
	 * aggiunge ogni singolo tab al tabPanel
	 * 
	 * @param {Object}
	 *            subpanels
	 * @return {Array}
	 */
	addTab : function(subpanels, formId) {
		var tab = [];
		for (var i = 0; i < subpanels.length; i++) {
			var tb = subpanels[i];
			tab.push({
						title : tb.label,
						items : this.addItemToForm(tb, formId)
					});
		}
		return tab;
	},
	/**
	 * riempie i vari tab
	 * 
	 * @param {Object}
	 *            tb
	 * @return {Array}
	 */
	addWidgetToTab : function(tb, formId) {
		var tbb = [];
		var pns = tb.subpanels;
		if (pns == null) {
			pns = tb.panels;
		}

		if (pns) {
			for (var i = 0; i < pns.length; i++) {
				if (pns[i] instanceof ExtCsi.ui.panels.FormPanel) {
					return this.addWidgetToTab(pns[i], formId);
				} else if (pns[i] instanceof ExtCsi.ui.panels.WidgetsPanel) {

					tbb.push({
								xtype : 'fieldset',
								title : pns[i].label == null
										|| pns[i].label == ''
										? '&nbsp;'
										: pns[i].label,
								collapsible : true,
								autoHeight : true,
								border : true,
								items : this.addLayout(pns[i], formId)
							});
				} else if (pns[i] instanceof ExtCsi.ui.panels.WizardPanel) {
					tbb.push({
								border : false,
								items : this.addTabPanelToForm(pns[i], formId)
							});
				}

			}
		}
		return tbb;
	},
	/**
	 * aggiunge il layout all'elemento
	 * 
	 * @param {Object}
	 *            el
	 * @return {Array}
	 */
	addLayout : function(el, formId) {
		if (el.layout instanceof ExtCsi.ui.layout.HorizontalFlowPanelLayout
				|| el.layout instanceof ExtCsi.ui.layout.UDLRCPanelLayout
				|| (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
						&& el.layout.columns && el.layout.columns > 1)) {
			var cfs = [];
			cfs.push({
						layout : 'column',
						border : false,
						items : this.addWidgetsToForm(el, formId)
					});
			return cfs;
		} else {
			return this.addWidgetsToForm(el, formId);
		}
	},
	/**
	 * aggiunge i widget alla struttura
	 * 
	 * @param {Object}
	 *            el
	 * @return {Array}
	 */
	addWidgetsToForm : function(el, formId) {
		var its = [];
		var sb = el.widgets;
		if (sb) {
			for (var k = 0; k < sb.length; k++) {
				var sbb = sb[k];

				sbb.renderExtComponent(el, its, formId);
			}
		}

		return its;
	},
	/**
	 * costruisce una viewport con un solo
	 * box centrale che contiene il dialog
	 * passato
	 * @param {String} dialogName
	 */
	initDialogPanel: function(dialogName){
		
		var cp = this.contentPanel;
		var dialogs = cp.dialogs;
		if(dialogs){
			for (var i = 0; i < dialogs.length; i++) {
				var dlg = dialogs[i];
				if(dlg.name == dialogName){
					this.costruisciDialogViewport(dlg);
					break;
				}
			}
		}
	},
	/**
	 * costruisce la viewport corrispondente al dialog
	 * @param {ExtCsi.ui.panels.DialogPanel} dialog
	 */
	costruisciDialogViewport: function(dialog){
		var win = new Ext.Window({
			id: ExtCsi.Const.ID_VIEWPORT_DIALOG,
            title: dialog.label,
            closable:true,
            width:600,
            height:300,
            autoScroll: true,
            //border:false,
            plain:true,
            modal: true,
            layout: 'fit',
			//items : this.addItemsToDialogPanel(dialog)
            items : new Ext.form.FormPanel({
				bodyStyle : 'padding:10px',
				defaultType : 'textfield',
				autoScroll : true,
				items : this.addItemsToDialogPanel(dialog),
				defaults : { // defaults applied to items
					layout : 'form'
				},
				// config options applicable to container when layout='form':
				hideLabels : false,
				labelAlign : 'left', // or 'right' or 'top'
				labelSeparator : '>>', // takes precedence over layoutConfig value
				//labelWidth : 150, // defaults to 100
				labelPad : 3,
				border: false
	
			})
        });

        win.show(this);
		
	},
	/**
	 * Aggiunge gli oggetti al dialogPanel
	 * @param {ExtCsi.ui.panels.DialogPanel} dialog
	 */
	addItemsToDialogPanel: function(dialog){
		var itemss = [];
		var msgBoxes = dialog.msgBoxes;
		if(msgBoxes){
			for (var j = 0; j < msgBoxes.length; j++) {
				var sbb = msgBoxes[j];
				itemss.push({
						xtype : 'panel',
						iconCls: this.getCssIconClass(sbb.messageSeverity),
						title : sbb.label == null || sbb.label == ''
								? '&nbsp;'
								: sbb.label,
						collapsible : false,
						autoHeight : true,
						border : sbb.label == null || sbb.label == ''
								? false
								: true,
						items : this.addWidgetsToDialogPanel(sbb.textMessages, dialog)
					});
			}
		}
		var commands = dialog.commands;
		if(commands){
			this.instantiateStructure(commands, itemss, null);
		}
		return itemss;
	},
	getCssIconClass: function(testo){
		switch(testo){
			case 'INFO' : return ExtCsi.Const.ICON_INFO_CLASS;
			case 'WARN' : return ExtCsi.Const.ICON_WARNING_CLASS;
			case 'ERROR' : return ExtCsi.Const.ICON_ERROR_CLASS;
			case 'QUESTION' : return ExtCsi.Const.ICON_QUESTION_CLASS;
			default : return ExtCsi.Const.ICON_INFO_CLASS;
		}
	},
	/**
	 * aggiunge i campi alla dialog
	 * @param {Array di widgets} textMessages
	 */
	addWidgetsToDialogPanel: function(textMessages, dialog){
		var its = [];
		if(textMessages){
			for (var i = 0; i < textMessages.length; i++) {
				var textMessage = textMessages[i];
				textMessage.renderExtComponent(dialog, its, null);
			}
		}
		return its;
	},
	/**
	 * distrugge la viewport che ha
	 * l'id passato
	 * @param {String} id
	 */
	distruggiViewPort: function(id){
		var vwp = Ext.getCmp(id);
		if (vwp) {
			vwp.destroy();
		}
	}
});
/*PROTECTED REGION END*/


/// dichiarazione class ApplicationArea


/**
 * @class ExtCsi.app.ApplicationArea
 * @extends Object
 * @constructor
 * Rappresenta l'area di user interface specifica dell'applicazione, 
innestata nella struttura comune solitamente definita dagli standard
del sito di esposizione.
 */
ExtCsi.app.ApplicationArea = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.app.ApplicationArea, Object,
	{

			
		/**
		 * @cfg (ExtCsi.ui.menu.Menubar) menubar Struttura del menu dell'applicazione.
Il menu deve essere definito in questo punto, mentre la visualizzazione effettiva 
dipende dalla particolare cartuccia di layout.
In alcuni layout potrebbe esserci un unico modo di visualizzare il menu e la visualizzazione potrebbe essere di default
(es. in alto sotto al banner dell'applicativo).
In altri layout il menu deve essere inserito esplicitamente tramite un particolare
widget denominato MenuView che viene espanso con la struttura del menu
definita in questo elemento.
		 */
		menubar: null,
		/**
		 * @cfg (Object) titlebar [[TODO: add documentation here]]
		 */
		titlebar: null,
		/**
		 * @cfg (Object) statusbar [[TODO: add documentation here]]
		 */
		statusbar: null,
		/**
		 * @cfg (ExtCsi.ui.panels.ContentPanel) contentPanels Contiene i ContentPanel che costituiscono le schermate dell'applicazione.
Deprecato (dalla v.1.3): definire le schermate in uno o più AppModule, 
preferibilmente mantenuti su file separati.
		 */
		contentPanels: null,
		/**
		 * @cfg (Object) staticLinks [[TODO: add documentation here]]
		 */
		staticLinks: null,
		/**
		 * @cfg (ExtCsi.cmd.Command) onInitCommand Comandi che vengono eseguiti all'inizializzazione dell'applicazione
		 */
		onInitCommand: null,
		/**
		 * @cfg (Object) modules Moduli applicativi (insiemi di ContentPanel). 
Deprecato: utilizzare <b>extModules</b> e mantenere gli <b>AppModule</b>
su file separati.
		 */
		modules: null,
		/**
		 * @cfg (Object) extModules Moduli applicativi (insiemi di ContentPanel). 
Gli <b>AppModule</b> devono essere mantenuti su file separati.

		 */
		extModules: null,
		/**
		 * @cfg (ExtCsi.ui.panels.ContentPanel) homePage Il content panel che deve essere considerato la Home Page dell'applicativo.
		 */
		homePage: null			
	/*PROTECTED REGION ID(ExtCsi.app.ApplicationArea_extraMethods) ENABLED START*/
	,
	/**
	 * @method
	 * @param {Object}
	 *            obj
	 */
	addExtModules : function(obj) {
		if (this.extModules == null) {
			this.extModules = [];
		}
		this.extModules.push(obj);
	},
	/**
	 * @method
	 * @return {Object} ExtCsi.ui.menu.Menubar
	 */
	getMenubar : function() {
		if (this.menubar instanceof ExtCsi.ui.menu.Menubar) {
			return this.menubar;
		}
		return globalRegistry.getRegisteredObject(this.menubar);
	},
	/**
	 * @method
	 * @return {Object} ExtCsi.cmd.Command
	 */
	getInitCommand : function() {
		if (this.onInitCommand instanceof ExtCsi.cmd.Command) {
			return this.onInitCommand;
		}
		return globalRegistry.getRegisteredObject(this.onInitCommand);
	},
	/**
	 * @method
	 * @return {Object} Array restituisce l'array degli AppModule collegati al
	 *         pannello
	 */
	getExtModules : function() {
		var moduls = this.extModules;
		var returnModules = [];
		Ext.each(moduls, function(mod) {
					if (mod instanceof AppModule)
						var modObj = globalRegistry.getRegisteredObject(mod);
					if (modObj != null) {
						returnModules.push(modObj);
					}
				});
		return returnModules;
	},
	/**
	 * @method
	 * @return {Object} ExtCsi.ui.panels.ContentPanel
	 */
	getHomePage : function() {
		return globalRegistry.getRegisteredObject(this.homePage);
	},
	/**
	 * inizializza il componente
	 */
	init : function() {
		//***registro il menubar in modo da poterlo recuperare dai vari command
		var mn = globalRegistry.getRegisteredObject(ExtCsi.Const.MENUBAR_STRUCTURE);
		if(!mn){
			globalRegistry.registerObject(ExtCsi.Const.MENUBAR_STRUCTURE, this.menubar);
		}
		var struct = new ExtCsi.ui.layout.WriteStructure({
					menubar : this.menubar,
					contentPanel : this.homePage
				});
		struct.initComponents();
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Menubar


/**
 * @class ExtCsi.ui.menu.Menubar
 * @extends Object
 * @constructor
 * Contiene la struttura del menu. 
 */
ExtCsi.ui.menu.Menubar = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.menu.Menubar, Object,
	{
			
		/**
		 * @cfg (Boolean) remoteInfoBox 
		 */
		 remoteInfoBox: null,
			
		/**
		 * @cfg (ExtCsi.ui.menu.Menu) topLevelMenu Contiene il primo livello di voci di menu.
		 */
		topLevelMenu: null			
	/*PROTECTED REGION ID(ExtCsi.ui.menu.Menubar_extraMethods) ENABLED START*/
	,
	/**
	 * @cfg (Object/String) renderTo id oppure oggetto nel dom su cui il menu si
	 *      attacca
	 * 
	 */
	renderTo : null,
	/**
	 * @cfg (Boolean) autoLoad, se impostato a true allora il menu no è legato
	 *      alla generazione mdd e sarà generato nel container specificato
	 */
	autoLoad : false,
	/**
	 * 
	 */
	init : function() {
		//***se esiste già una toolbar la distruggo
		var oldTb = Ext.getCmp(ExtCsi.Const.ID_TOOLBAR);
		if(oldTb){
			oldTb.destroy();
		}
		var tb = new Ext.Toolbar({
			id: ExtCsi.Const.ID_TOOLBAR,
			enableOverflow : true,
			renderTo : this.renderTo,
			cls : ExtCsi.Const.TOOLBAR_CSS_CLASS,
			height : 30
		});

		for (var i = 0; i < this.topLevelMenu.length; i++) {
			var menu = this.topLevelMenu[i];
			var event = this.addEventToMenu(menu);
			tb.add({
						text : menu.label,
						id: menu.name,
						jumpTo : event,
						cls : ExtCsi.Const.CSS_ITEM_MENU,
						overCls : ExtCsi.Const.CSS_HOVER_ITEM_MENU,
						mbr : this,
						topLevelMenu : menu,
						handler : function(item) {
							if(item.topLevelMenu.getEventHandler()){
								item.topLevelMenu.getEventHandler().command.doCommand();
							}else{
								var cp = new ExtCsi.ui.panels.ContentPanel();
								cp.init(item.mbr, item.jumpTo);
							}
						},
						menu : this.addMenuToTb(menu, this)
					}, '-');
		}
		tb.doLayout();
	},
	/**
	 * aggiunge l'evento corrispondente alla voce di menu
	 * 
	 * @param {ExtCsi.ui.menu.Menubar
	 *            or ExtCsi.ui.menu.Menu} menu
	 * @return {String}
	 */
	addEventToMenu : function(menu) {
		var event = '';

		var evt = menu.getEventHandler();
		if (evt) {

			if (evt.command && evt.command instanceof ExtCsi.cmd.JumpCommand) {
				event = evt.command.jumpTo;
			} else if (evt.command
					&& evt.command instanceof ExtCsi.cmd.ExecCommand) {
						
				var results = evt.command.results;

				for (var i = 0; i < results.length; i++) {
					var res = results[i];
					if (res instanceof ExtCsi.cmd.CommandOutcome) {
						event = res.command.jumpTo;
						break;
					}
				}
			} else {
				return evt;
			}
		}
		return event;
	},
	/**
	 * aggiunge le voci di menu
	 * 
	 * @param {ExtCsi.ui.menu.Menu,
	 *            ExtCsi.ui.menu.Menu, String} menu
	 * @return {ExtCsi.ui.menu.Menu}
	 */
	addMenuToTb : function(menu, mb) {
		var submenus = menu.submenu;
		if (submenus == null) {
			return null;
		}

		var sottoMenu = new Ext.menu.Menu();
		for (var j = 0; j < submenus.length; j++) {
			var sm = submenus[j];
			
			var event = this.addEventToMenu(sm);
			sottoMenu.add({
						text : sm.label,
						jumpTo : event,
						id: sm.name,
						mbr : mb,
						handler : function(item) {
							var cp = new ExtCsi.ui.panels.ContentPanel();
							cp.init(item.mbr, item.jumpTo);
						},
						menu : this.addMenuToTb(sm, mb)
					});
		}

		return sottoMenu;
	},
	/**
	 * setta il valore dell'oggetto a cui attaccare il menu
	 * 
	 * @param {String/Object}
	 *            v
	 */
	setRenderTo : function(v) {
		this.renderTo = v;
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ContentPanel


/**
 * @class ExtCsi.ui.panels.ContentPanel
 * @extends Object
 * @constructor
 * Il <b>Content Panel</b> rappresenta la singola schermata
dell'applicativo. Pu&ograve; contenere pannelli strutturati con differenti
tipi di layout.
 */
ExtCsi.ui.panels.ContentPanel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.panels.ContentPanel, Object,
	{
			
		/**
		 * @cfg (String) name Nome identificativo del content panel. Deve essee univoco all'interno dell'
applicazione.
Deve essere un identificatore valido nello stile Java.
		 */
		 name: null,
			
		/**
		 * @cfg (ExtCsi.ui.panels.Panel) panels Il pannello principale inserito nel content Panel.
		 */
		panels: null,
		/**
		 * @cfg (ExtCsi.mdl.data.ApplicationData) appData Elenco degli <b>ApplicationData</b> utilizzabili per i binding di dati. 
Deprecato: definire gli <b>ApplicationData</b> in uno o pi&ugrave; 
<b>AppDataGroup</b>, mantenuti in file separati.
		 */
		appData: null,
		/**
		 * @cfg (ExtCsi.cmd.Command) onRefreshCommand Comando che viene eseguito ad ogni refresh della pagina, sia che sia 
conseguente all'invocazione di un event handler, sia che si tratti di un
puro refresh o della visualizzazione iniziale.
Nel caso sia conseguente all'invocazione di un <b>EventHandler</b>
questo comando viene eseguito <b>prima</b> del comando associato.

		 */
		onRefreshCommand: null,
		/**
		 * @cfg (ExtCsi.ui.panels.DialogPanel) dialogs Elenco dei <b>Dialog</b> di feedback associati al content panel.
Devono essere attivati mediante il comando <b>ShowDialogCommand</b>.
		 */
		dialogs: null,
		/**
		 * @cfg (ExtCsi.ui.state.ScreenStates) states Stati di attivazione del ContentPanel
		 */
		states: null,
		/**
		 * @cfg (ExtCsi.ui.state.ScreenState) defaultState Stato di attivazione del ContentPanel di default.
		 */
		defaultState: null			
	/*PROTECTED REGION ID(ExtCsi.ui.panels.ContentPanel_extraMethods) ENABLED START*/
	,
	/**
	 * 
	 * @param {}
	 *            obj
	 * 
	 */
	addDialogs : function(obj) {
		if (this.dialogs == null) {
			this.dialogs = [];
		}
		this.dialogs.push(obj);
	},
	/**
	 * inizializza il componente
	 */
	init : function(menu, panel) {
		/*
		 * invoco l'inizializzazione solo se ho un contentPanel valido
		 */
		if (panel != '') {
			var struct = new ExtCsi.ui.layout.WriteStructure({
						menubar : menu,
						contentPanel : panel
					});
			struct.initComponents();
		}
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Panel


/**
 * @class ExtCsi.ui.panels.Panel
 * @extends Object
 * @constructor
 * Classe astratta dalla quale discendono tutti i pannelli
 */
ExtCsi.ui.panels.Panel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.panels.Panel, Object,
	{
			
		/**
		 * @cfg (String) name Codice identificativo del pannello. Deve essere univoco all'interno del
<b>ContentPanel</b> e deve essere un identificatore valido java.
		 */
		 name: null,
		/**
		 * @cfg (String) label Etichetta descrittiva del pannello. Il rendering e l'utilizzo di questo elemento
dipende dal particolare sottotipo di pannello e dalla cartuccia di layout/portale.
		 */
		 label: null,
		/**
		 * @cfg (Boolean) scrollable Determina la presenza di una cornice scrollabile attorno al pannello.
Default = <i>false</i>
		 */
		 scrollable: null,
			
		/**
		 * @cfg (ExtCsi.ui.layout.PanelLayout) layout Il layout con cui devono essere organizzati visivamente gli elementi interni
al pannello, che possono essere, a seconda del sottotipo di pannello,
dei sottopannelli o dei widget.
L'impostazioen della disposizione effettiva degli elementi interni, fissato un particolare layout,
deve essere completata tramite un LayoutSpecifier (su ciascun elemento interno)
coerente con il tipo di layout scelto (es. Se il layout è un GridLayout, negli elementi interni 
occorre specificare un GrigWidgetLayoutSpec).
		 */
		layout: null,
		/**
		 * @cfg (ExtCsi.ui.layout.WidgetLayoutSpecifier) layoutSpec Specificatore del posizionamento di questo pannello all'intenro del layout
del pannello contenitore.
		 */
		layoutSpec: null			
	/*PROTECTED REGION ID(ExtCsi.ui.panels.Panel_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class FormPanel


/**
 * @class ExtCsi.ui.panels.FormPanel
 * @extends ExtCsi.ui.panels.Panel
 * @constructor
 * Pannello destinato a contenere sottopannelli. Serve principlamente per definire
la struttura della user interface. Non tutte lel possibilità (di layout, di annidamento)
sono disponibili pe rtutte le cartucce di layout/portale.
 */
ExtCsi.ui.panels.FormPanel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.panels.FormPanel, ExtCsi.ui.panels.Panel,
	{
			
		/**
		 * @cfg (Boolean) collapsible Se <i>true</i> il pannello &egrave; collassabile.
		 */
		 collapsible: null,
			
		/**
		 * @cfg (ExtCsi.ui.panels.Panel) subpanels Un <B>FormPanel</b> contiene uno o più sottopannelli organizzati in 
vari tipi di layout. La disposizione effettiva dei sottopannelli all'interno del
<b>FormPanel</b> dipende da:
<ul>
<li>il tipo di layout associato al pannello</li>
<li>lo specificatore associato a ciascun sottopannello</li>
</ul>
		 */
		subpanels: null,
		/**
		 * @cfg (ExtCsi.ui.widgets.Widget) widgets OBSOLETO: NON UTILIZZARE: utilizzare un <b>WidgetsPanel</b> o un
<b>CommandPanel</b> interni al <b>FormPanel</b> ed inserire lì i
widget.
		 */
		widgets: null			
	/*PROTECTED REGION ID(ExtCsi.ui.panels.FormPanel_extraMethods) ENABLED START*/
	,
	addSubpanels : function(obj) {
		if (this.subpanels == null) {
			this.subpanels = [];
		}
		this.subpanels.push(obj);
	},
	addWidgetsPanel : function(obj) {
		if (this.widgets == null) {
			this.widgets = [];
		}
		this.widgets.push(obj);
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class MultiPanel


/**
 * @class ExtCsi.ui.panels.MultiPanel
 * @extends ExtCsi.ui.panels.Panel
 * @constructor
 * Pannello a visualizzazione alternativa. Permette di visualizzare uno solo 
dei pannelli definiti nella collezione <i>panels</i>.
Per visualizzare uno specifico pannello occorre utilizzare il comando
<b>ActivateMultipanelItem</b>.
Lo statoiniziale di questo pannello &egrave; la non visualizzazione di nessun pannello.
 */
ExtCsi.ui.panels.MultiPanel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.panels.MultiPanel, ExtCsi.ui.panels.Panel,
	{

			
		/**
		 * @cfg (ExtCsi.ui.panels.Panel) panels I pannelli visualizzabili in alternativa
		 */
		panels: null			
	/*PROTECTED REGION ID(ExtCsi.ui.panels.MultiPanel_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class TabSetPanel


/**
 * @class ExtCsi.ui.panels.TabSetPanel
 * @extends ExtCsi.ui.panels.MultiPanel
 * @constructor
 * Tipo specifico di <b>MultiPanel</b> corredato di componente di controllo
a "tab": per passare da un tab all'altro è sufficiente selezionare la "linguetta" 
corrispondente.
Come per tutti i <b>MultiPanel</b> il programmatore avrà nel model le informazioni
riguardanti:
<ul>
<li>il tab correntemente visualizzato</li>
<li>il tab "target" (quello sulla cui 2linguetta" si è cliccato; questa informazione 
&egrave; disponibile solo all'interno di un <b>EventHandler</b> associato
 al widget fittizio <b>TabSwitcher</b>)</li>.
</ul>
Il primo tab è quello visualizzato di default.
 */
ExtCsi.ui.panels.TabSetPanel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.panels.TabSetPanel, ExtCsi.ui.panels.MultiPanel,
	{

			
		/**
		 * @cfg (Object) switcher Il <b>TabSwitcher</b> &egrave; un widget fittizio che, se inserito, permette
di effettuar eil post dei dati e l'esecuzione di logica a fronte dell'evento di
selezione (click) delle "linguette".

		 */
		switcher: null			
	/*PROTECTED REGION ID(ExtCsi.ui.panels.TabSetPanel_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Widget


/**
 * @class ExtCsi.ui.widgets.Widget
 * @extends Object
 * @constructor
 * Classe astratta dalla quale discendono tutti i vari tipi di widget.
 */
ExtCsi.ui.widgets.Widget = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.Widget, Object,
	{
			
		/**
		 * @cfg (String) name Codice identificativo del widget. Deve essere univoco all'interno del 
<b>ContentPanel</b> che lo contiene e deve essere un identificativo
valido java.
		 */
		 name: null,
		/**
		 * @cfg (String) label Etichetta associata al widget.
		 */
		 label: null,
		/**
		 * @cfg (Boolean) defaultVisible stato di visibilit&agrave; di default del widget
		 */
		 defaultVisible: null,
		/**
		 * @cfg (Boolean) defaultEnabled stato di abilitazione di default del widget
		 */
		 defaultEnabled: null,
		/**
		 * @cfg (String) tooltip tooltip associato alla etichetta del widget
		 */
		 tooltip: null,
			
		/**
		 * @cfg (ExtCsi.ui.layout.WidgetLayoutSpecifier) layoutSpec Specifica di posizionamento del widget all'interno del pannello che lo contiene.
Il tipo dell'oggetto associato deve essere coerente con il tipo di layout del
pannello contenitore.
		 */
		layoutSpec: null,
		/**
		 * @cfg (ExtCsi.ui.event.EventHandler) eventHandlers Gestori degli eventi associati al widget. Le tipologie di evento gestite sono
dipendenti dal particolare tipo di widget.
		 */
		eventHandlers: null,
		/**
		 * @cfg (ExtCsi.security.UISecurityConstraint) securityConstraints E' possibile specificare uno o pi&ugrave; security constraints sul widget, che
permettono di rendere condizionata la visualizzazione o la abilitazione del
widget a fronte delle condizioni descritte nel constraint.
I constraint sono additivi (nel senso booleano) per ciascun <i>constrained behavior</i>
(comportamento condizionato = {visibilit&agrave; / abilitazione}): se almeno un
constraint &egrave; verificato il comportamento condizionato sar&agrave; abilitato
(visibilit&agrave; / editabilit&agrave;).
Se nessun constraint sar&agrave; verificato, la visualizzazioen/abilitazione sarà condizionata solo allo stato
di default / comandato, ovvero al valore delle proprietà <b>defaultVisible</b> o 
<b>defaultEnabled</b> se non è stato in precedenza utilizzato nessun
comando di tipo <b>ONOFFCommand</b> o <b>VisibilityCommand</b>; se 
tali comandi sono stati utilizzati allora "vince" l'impostazione derivante da
questi comandi.
Se, infine, un constraint &egrave; verificato, comunque un eventuale
disabilitazione/invisibilit&agrave; comandata (tramite <b>ONOFFCommand</b>
 o <b>VisibilityCommand</b>) vince.
		 */
		securityConstraints: null			
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.Widget_extraMethods) ENABLED START*/
	,
	addEventHandlers : function(obj) {
		if (this.eventHandlers == null) {
			this.eventHandlers = [];
		}
		this.eventHandlers.push(obj);
	},
	addSecurityConstraints : function(obj) {
		if (this.securityConstraints == null) {
			this.securityConstraints = [];
		}
		this.securityConstraints.push(obj);
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class CommandWidget


/**
 * @class ExtCsi.ui.widgets.CommandWidget
 * @extends ExtCsi.ui.widgets.Widget
 * @constructor
 * Classe astratta di widget con funzione di comando (es pulsanti)
 */
ExtCsi.ui.widgets.CommandWidget = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.CommandWidget, ExtCsi.ui.widgets.Widget,
	{
			
		/**
		 * @cfg (String from enumeration ExtCsi.ui.widgets.CommandFunctions) functionSpecifier 
		 */
		 functionSpecifier: null
	
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.CommandWidget_extraMethods) ENABLED START*/
		,renderExtComponent : function(el, its, formId) {
			alert('Il widget ExtCsi.ui.widgets.CommandWidget non è stato ancora implementato');	
		}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class DataWidget


/**
 * @class ExtCsi.ui.widgets.DataWidget
 * @extends ExtCsi.ui.widgets.Widget
 * @constructor
 * Classe astratta dalla quale discendono tutte le classi che rappresentano
widget associabili a dati (<b>ApplicationData</b>). Un <b>DataWidget</b>
ha un concetto di <i>valore</i> del widget che rappresenta l'input inserito.
 */
ExtCsi.ui.widgets.DataWidget = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.DataWidget, ExtCsi.ui.widgets.Widget,
	{
			
		/**
		 * @cfg (String) dataTypeModifier [[TODO: add documentation here]]
		 */
		 dataTypeModifier: null,
		/**
		 * @cfg (Boolean) required Configurazione di validazione che indica che il valore associato al widget è obbligatorio. 
Utilizzato solo nel caso di binding ad un application data non strutturato.
Nel caso di binding con un field di un application data di tipo strutturato, 
l'eventuale constraint di obbligatoriet&agrave; deve essere impostato nel <b>ComplexType</b>.
		 */
		 required: null,
			
		/**
		 * @cfg (ExtCsi.mdl.data.AppDataBinding) databinding Il binding verso l' <b>ApplicationData</b> nel quale deve essere inserito
il valore immesso dall'utente tramite il widget.
		 */
		databinding: null,
		/**
		 * @cfg (ExtCsi.mdl.types.Type) dataType Tipo del valore atteso. Deve essere un <b>SimpleType</b> e deve corrispondenre con il tipo del
binding eventualmente associato.
Se non viene associato nessun binding, esiste comunque un binding implicito
a scope USER_ACTION (sconsigliato).
		 */
		dataType: null			
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.DataWidget_extraMethods) ENABLED START*/
	,
	dataUrl : null,
	renderExtComponent : function(el, its, formId) {
		alert('IL widget DataWidget non è stato ancora implementato');
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Button


/**
 * @class ExtCsi.ui.widgets.Button
 * @extends ExtCsi.ui.widgets.CommandWidget
 * @constructor
 * Superclasse di tutti i pulsanti.
 */
ExtCsi.ui.widgets.Button = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.Button, ExtCsi.ui.widgets.CommandWidget,
	{
			
		/**
		 * @cfg (String) image PER FUTURE ESPANSIONI
		 */
		 image: null
	
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.Button_extraMethods) ENABLED START*/
		,renderExtComponent : function(el, its, formId) {
			return new ExtCsi.ui.widgets.ConfirmButton({
				name : this.name,
				label : this.label,
				tooltip : this.tooltip,
				defaultVisible : this.defaultVisible,
				defaultEnabled : this.defaultEnabled,
				layoutSpec : this.layoutSpec,
				eventHandlers : this.eventHandlers
			}).renderExtComponent(el, its, formId);
		}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class TextField


/**
 * @class ExtCsi.ui.widgets.TextField
 * @extends ExtCsi.ui.widgets.DataWidget
 * @constructor
 * DataWidget per l'immissione di testo.
 */
ExtCsi.ui.widgets.TextField = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.TextField, ExtCsi.ui.widgets.DataWidget,
	{
			
		/**
		 * @cfg (Integer) fieldLength Dimensione in caratteri dell area visibile del campo.
		 */
		 fieldLength: null,
		/**
		 * @cfg (Integer) fieldMaxLength Numero massimo di caratteri digitabili
		 */
		 fieldMaxLength: null,
			
		/**
		 * @cfg (ExtCsi.mdl.data.AppDataBinding) multiDataBinding Il binding all'<b>ApplicationData</b> nel quale sono contenuti gli elementi dell'insieme
di possibili valori. Il tipo dell'oggetto puntato deve essere un <b>TypedArray</b> e 
il <i>componentType</i> di questo <b>TypedArray</b> deve essere un <b>ComplexType</b>, poich&egrave;
 &egrave; necessario poter specificare il valore selezionato e la label descrittiva di tale valore (perci&ograve; servono almeno due field).
		 */
		multiDataBinding: null			
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.TextField_extraMethods) ENABLED START*/
	/**
	 * costruisce l'oggetto Extjs che corrisponde al campo di tipo testo o
	 * numerico
	 * 
	 * @param {Object}
	 *            el
	 * @param {Array}
	 *            its
	 */
	,
	renderExtComponent : function(el, its, formId) {
		// ***controllo se c'è un eventHandler associato al campo
		// ***in questo caso se l'evento è di tipo key_pressed
		// ***allora il campo è una suggestion
		var eventHandler = null;
		var isSuggestion = false;
		if (this.eventHandlers) {
			for (var i = 0; i < this.eventHandlers.length; i++) {
				var event = this.eventHandlers[i];
				if (event.eventType == ExtCsi.ui.event.EventTypes().KEY_PRESSED) {
					eventHandler = event;
					isSuggestion = true;
				}
			}
		}

		if (isSuggestion) {
			var fieldStore = new Ext.data.JsonStore({
						storeId : 'cbstore-' + this.name,
						url : this.dataUrl,
						fields : [{
									name : "descrizione",
									convert : function(v, rec) {
										return rec;
									},
									type : "string"
								}],
						listeners : {
							exception : Ext.util.Format.messaggiErrore
							// ***gestisco le eccezioni server side
						}
					});

			var field = {
				xtype : 'combo',
				mode : 'remote',
				triggerAction : 'all',
				forceSelection : false,
				id : this.name,
				name : ExtCsi.Utils.getOgnlValue(this),
				queryParam : ExtCsi.Utils.getOgnlValue(this),
				allowBlank : !this.required,
				disabled: !this.defaultEnabled,
				hidden: !this.defaultVisible,
				emptyText : 'Selezionare...',
				fieldLabel : this.label,
				helpText : this.tooltip,
				displayField : 'descrizione',
				store : fieldStore,
				databinding : this.databinding,
				typeAhead : true,
				loadMask : true,
				hideTrigger : true,
				selectOnFocus : true,
				loadingText : 'Attendere...'
			};
		} else {
			// ***suddivisione del tipo di campi
			var fieldType = 'textfield';
			var type = null;
			var integerNumber = null;
			var sep = null;
			if (this.dataType instanceof ExtCsi.mdl.types.SimpleType) {
				type = this.dataType.code;
			} else {
				type = globalRegistry.getRegisteredObject(this.dataType).code;
			}
			if (type) {
				if (type == ExtCsi.mdl.types.SimpleTypeCodes().INT || type == ExtCsi.mdl.types.SimpleTypeCodes().LONG || 
						type == ExtCsi.mdl.types.SimpleTypeCodes().FLOAT
						|| type == ExtCsi.mdl.types.SimpleTypeCodes().DOUBLE) {
					fieldType = 'numberfield';
				}
				integerNumber = type == ExtCsi.mdl.types.SimpleTypeCodes().INT || type == ExtCsi.mdl.types.SimpleTypeCodes().LONG;
				sep = ',';
			}

			var field = {
				xtype : fieldType,
				id : this.name,
				fieldLabel : this.label,
				name : ExtCsi.Utils.getOgnlValue(this),
				helpText : this.tooltip,
				decimalSeparator : sep,
				disabled: !this.defaultEnabled,
				hidden: !this.defaultVisible,
				allowBlank : !this.required,
				allowDecimals : !integerNumber,
				decimalPrecision : !integerNumber ? 2 : 0,
				databinding : this.databinding
			};
		}

		// ***struttura delle colonne
		if (el.layout instanceof ExtCsi.ui.layout.HorizontalFlowPanelLayout
				|| el.layout instanceof ExtCsi.ui.layout.UDLRCPanelLayout
				|| (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
						&& el.layout.columns && el.layout.columns > 1)) {
			var cf = [];
			cf.push(field);
			var colW = null;
			if (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
					&& el.layout.columns && el.layout.columns > 1) {
				colW = 1 / el.layout.columns;
			}
			its.push({
						columnWidth : colW,
						border : false,
						style : 'padding:5px 5px 0',
						layout : 'form',
						items : cf
					});
		} else {
			its.push(field);
		}
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class TextArea


/**
 * @class ExtCsi.ui.widgets.TextArea
 * @extends ExtCsi.ui.widgets.DataWidget
 * @constructor
 * Campo di immissione testo multilinea.
 */
ExtCsi.ui.widgets.TextArea = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.TextArea, ExtCsi.ui.widgets.DataWidget,
	{
			
		/**
		 * @cfg (Integer) rows Dimensione in righe dell'area di input. Se nell'input si supera il numero
di righe specificate appare una scrollbar verticale.
		 */
		 rows: null,
		/**
		 * @cfg (Integer) columns Dimensione in colonne dell'area di input. Se nell'input si supera il numero
di colonne specificate appare una scrollbar orizzontale.
		 */
		 columns: null
	
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.TextArea_extraMethods) ENABLED START*/
	,
	/**
	 * crea il componente Extjs corrispondente alla textarea
	 * 
	 * @param {Object}
	 *            el
	 * @param {Array}
	 *            its
	 */
	renderExtComponent : function(el, its, formId) {
		if (el.layout instanceof ExtCsi.ui.layout.HorizontalFlowPanelLayout
				|| el.layout instanceof ExtCsi.ui.layout.UDLRCPanelLayout
				|| (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
						&& el.layout.columns && el.layout.columns > 1)) {
			var cf = [];
			cf.push({
						xtype : 'htmleditor',
						id : this.name,
						name : this.name,
						disabled: !this.defaultEnabled,
						hidden: !this.defaultVisible,
						fieldLabel : this.label,
						allowBlank : !this.required,
						databinding : this.databinding
					});
			var colW = null;
			if (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
					&& el.layout.columns && el.layout.columns > 1) {
				colW = 1 / el.layout.columns;
			}
			its.push({
						columnWidth : colW,
						border : false,
						style : 'padding:5px 5px 0',
						layout : 'form',
						items : cf
					});
		} else {
			its.push({
						xtype : 'htmleditor',
						id : this.name,
						name : this.name,
						disabled: !this.defaultEnabled,
						hidden: !this.defaultVisible,
						fieldLabel : this.label,
						allowBlank : !this.required
					});
		}
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Calendar


/**
 * @class ExtCsi.ui.widgets.Calendar
 * @extends ExtCsi.ui.widgets.DataWidget
 * @constructor
 * Campo di immissione per date, con strumento per la selezione della data
(date picker).
 */
ExtCsi.ui.widgets.Calendar = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.Calendar, ExtCsi.ui.widgets.DataWidget,
	{

	
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.Calendar_extraMethods) ENABLED START*/
	/**
	 * restituisce il componente extjs del calendar
	 * 
	 * @param {Object}
	 *            el
	 * @param {Array}
	 *            its
	 */
	renderExtComponent : function(el, its, formId) {
		var datefield = {
			xtype : 'datefield',
			id : this.name,
			name : ExtCsi.Utils.getOgnlValue(this),
			fieldLabel : this.label,
			helpText : this.tooltip,
			format : "d/m/Y",
			disabled: !this.defaultEnabled,
			hidden: !this.defaultVisible,
			allowBlank : !this.required,
			databinding : this.databinding
		};
		if (el.layout instanceof ExtCsi.ui.layout.HorizontalFlowPanelLayout
				|| el.layout instanceof ExtCsi.ui.layout.UDLRCPanelLayout
				|| (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
						&& el.layout.columns && el.layout.columns > 1)) {
			var cf = [];
			cf.push(datefield);
			var colW = null;
			if (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
					&& el.layout.columns && el.layout.columns > 1) {
				colW = 1 / el.layout.columns;
			}
			its.push({
						columnWidth : colW,
						border : false,
						style : 'padding:5px 5px 0',
						layout : 'form',
						items : cf
					});
		} else {
			its.push(datefield);
		}
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ComboBox


/**
 * @class ExtCsi.ui.widgets.ComboBox
 * @extends ExtCsi.ui.widgets.DataWidget
 * @constructor
 * MultiDataWidget che permette la selezione di uno o più valori all'interno di 
un elenco di possibili opzioni.
Se il value-binding &egrave; impostato su un <b>ApplicationData</b> di tipo
Simple la combo sar&agrave; a selezione singola; se il value-binding &egrave; impostato su un <b>ApplicationData</b> di tipo
TypedArray (con component type Simple) la combo sar&agrave; a selezione multipla.
Alla combo &egrave; possibile associare un event handler relativo all'evento
VALUE_CHANGED, che viene scatenato nel momento un cui viene modificata la selezione.
 */
ExtCsi.ui.widgets.ComboBox = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.ComboBox, ExtCsi.ui.widgets.DataWidget,
	{
			
		/**
		 * @cfg (String) keySelector nome del campo che deve essere considerato come "key". Il campo deve
corrispondere ad un field del complex type di cui è costituito l'array
collegato alla combo (tramite multi-data-binding).
		 */
		 keySelector: null,
		/**
		 * @cfg (String) valueSelector nome del campo che deve essere utilizzato come descrizione visualizzata. Il campo deve
corrispondere ad un field del complex type di cui è costituito l'array
collegato alla combo (tramite multi-data-binding).
		 */
		 valueSelector: null,
		/**
		 * @cfg (Boolean) omitHeaderValue Se impostato a true non viene inserita la entry relativa allo stato di selezione nulla.
		 */
		 omitHeaderValue: null,
			
		/**
		 * @cfg (ExtCsi.mdl.data.AppDataBinding) multiDataBinding Il binding all'<b>ApplicationData</b> nel quale sono contenuti gli elementi dell'insieme
di possibili valori. Il tipo dell'oggetto puntato deve essere un <b>TypedArray</b> e 
il <i>componentType</i> di questo <b>TypedArray</b> deve essere un <b>ComplexType</b>, poich&egrave;
 &egrave; necessario poter specificare il valore selezionato e la label descrittiva di tale valore (perci&ograve; servono almeno due field).
		 */
		multiDataBinding: null			
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.ComboBox_extraMethods) ENABLED START*/
	,
	/**
	 * costruisce l'oggetto Extjs che corrisponde alla combo
	 * 
	 * @param {Object}
	 *            el
	 * @param {Array}
	 *            its
	 */
	renderExtComponent : function(el, its, formId) {
		var comboStore = new Ext.data.JsonStore({
			storeId : 'cbstore-' + this.name,
			url : this.dataUrl,
			fields : ExtCsi.Utils.createGenericStoreFields(this),
			listeners : {
				exception : Ext.util.Format.messaggiErrore
				// ***gestisco le eccezioni server side
			}
		});
		
		MessageBus.on('init', function(){
		  comboStore.load();
		});

		var multiselect = {
			xtype : 'multiselect',
			fieldLabel : this.label,
			id : this.name,
			name : this.name,
			// width: 250,
			// height: 200,
			allowBlank : !this.required,
			store : comboStore,
			disabled: !this.defaultEnabled,
			hidden: !this.defaultVisible,
			displayField : this.valueSelector,
			valueField : this.keySelector,
			tbar : [{
						text : 'Reset selezionati',
						handler : function() {
							// msForm.getForm().findField('multiselect').reset();
							// this.reset(); da gestire il reset
						}
					}],
			ddReorder : true,
			databinding : this.databinding
		};
		var combo = {
			xtype : 'combo',
			mode : 'local',
			hiddenName : ExtCsi.Utils.getOgnlValue(this),
			triggerAction : 'all',
			forceSelection : true,
			id : this.name,
			name : this.name,
			disabled: !this.defaultEnabled,
			hidden: !this.defaultVisible,
			allowBlank : !this.required,
			emptyText : 'Selezionare...',
			fieldLabel : this.label,
			helpText : this.tooltip,
			displayField : this.valueSelector,
			valueField : this.keySelector,
			store : comboStore,
			eventHandlers : this.eventHandlers,
			listeners : {
				select : function(combo, record) {
					if (combo.eventHandlers) {
						for (var i = 0; i < combo.eventHandlers.length; i++) {
							var event = combo.eventHandlers[i];
							var command = event.command;
							command.setFormId(formId);
							if (command) {
								command.doCommand();
							}
						}
					}
				}
			},
			databinding : this.databinding
		};
		if (el.layout instanceof ExtCsi.ui.layout.HorizontalFlowPanelLayout
				|| el.layout instanceof ExtCsi.ui.layout.UDLRCPanelLayout
				|| (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
						&& el.layout.columns && el.layout.columns > 1)) {
			var cf = [];
			if (ExtCsi.Utils.isMultiBinding(this)) {
				cf.push(multiselect);
			} else {
				cf.push(combo);
			}
			var colW = null;
			if (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
					&& el.layout.columns && el.layout.columns > 1) {
				colW = 1 / el.layout.columns;
			}
			its.push({
						columnWidth : colW,
						border : false,
						style : 'padding:5px 5px 0',
						layout : 'form',
						items : cf
					});

		} else {
			if (ExtCsi.Utils.isMultiBinding(this)) {
				its.push(multiselect);
			} else {
				its.push(combo);
			}
		}
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Table


/**
 * @class ExtCsi.ui.widgets.Table
 * @extends ExtCsi.ui.widgets.DataWidget
 * @constructor
 * Tabella di visualizzazione dati. Permette di visualizzare in formato tabellare
una collezione di record.
Mette a disposizione alcune funzioni avanzate:
<ol>
<li>paginazione
  <ul>
  <li>opzionale</li>
  <li>con possibilit&agrave; di impostare la dimensione della "pagina"</li>
  <li>resettabile da business logic</li>
  </ul>
</li>  
<li>export dei dati
  <ul>
  <li>opzionale</li>
  <li>in formato PDF, XLS, RTF</li>
  </ul>
</li>
<li>Con selezione della riga (&egrave; è il valore associato al DataWidget Table, utilizzabile nella business logic
  <ul>
  <li>opzionale (abilitata solo se è impostato un databinding/valuebinding)</li>
  <li>singola o multipla (a seconda del tipo del databinding/valuebinding)</li>
  </ul>
</li>
<li>Con possibilit&agrave; di editing delle celle
  <ul>
  <li>con widget di editing differenziato a seconda del tipo del dato della cella (TextField se Stringa/numerico, checkbox se boolean</li>
  <li>con possibilit&agrave; di scegliere a runtime se una singola cella deve essere editabile o meno</li>
  <li>con possibilit&agrave; di prendere il valore della cella da una collection (tramite combobox); la collection può essere unica per tutta la colonna o variabile per la singola riga</li>
  </ul>
</li>
</ol>
 */
ExtCsi.ui.widgets.Table = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.Table, ExtCsi.ui.widgets.DataWidget,
	{
			
		/**
		 * @cfg (Integer) pageSize Numero di record max visualizzati in una pagina. 
Un valore di "0" significa che la paginazione &egrave; disabilitata: in 
questo caso vengono visualizzati tutti i record.
		 */
		 pageSize: null,
		/**
		 * @cfg (Boolean) enableExport Se impostato a true abilita l'export della tabella.
		 */
		 enableExport: null,
		/**
		 * @cfg (Boolean) customDecorator Se impostato a true abilita la definizione di un CustomDecorator, 
per impostazioni grafiche particolari.
		 */
		 customDecorator: null,
		/**
		 * @cfg (String) summary 
		 */
		 summary: null,
			
		/**
		 * @cfg (ExtCsi.ui.widgets.table.ColumnModel) columnModel Il modello delle colonne che la tabella dovr&agrave; visualizzare.
		 */
		columnModel: null,
		/**
		 * @cfg (ExtCsi.mdl.data.AppDataBinding) multiDataBinding Il binding all'<b>ApplicationData</b> nel quale sono contenuti gli elementi dell'insieme
di possibili valori. Il tipo dell'oggetto puntato deve essere un <b>TypedArray</b> e 
il <i>componentType</i> di questo <b>TypedArray</b> deve essere un <b>ComplexType</b>, poich&egrave;
 &egrave; necessario poter specificare il valore selezionato e la label descrittiva di tale valore (perci&ograve; servono almeno due field).
		 */
		multiDataBinding: null			
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.Table_extraMethods) ENABLED START*/
	,
	/**
	 * @cfg (Object/String) renderTo id oppure oggetto nel dom su cui la tabella si
	 *      attacca
	 * 
	 */
	renderTo : null,
	/**
	 * @cfg (Boolean) autoLoad, se impostato a true allora la tabella non è legata
	 *      alla generazione mdd e sarà generata nel container specificato
	 */
	autoLoad : false,
	/**
	 * @cfg (String) formId, id della form che contiene la tabella, serve nel caso in cui 
	 * ho una tabella editabile
	 */
	formId : null,
	/**
	 * crea il componente Extjs corrispondente alla table
	 * 
	 * @param {Object}
	 *            el
	 * @param {Array}
	 *            its
	 * @param {String} formId
	 * 
	 */
	renderExtComponent : function(el, its, formId) {
		var valueSelector = this.columnModel.valueSelector;
		var idTable = this.name;
		var tableStore = new Ext.data.JsonStore({
			autoDestroy : true,
			url : this.dataUrl,
			remoteSort : true,
			storeId : 'store-grid-' + this.name,
			idProperty : this.columnModel.valueSelector,
			pruneModifiedRecords : true, //***rimuovo le informazioni su eventuali record modificati
			root: function(jsonData){
				//***prima rimuovo dal registry l'elenco delle positions e poi le rimetto
				if(jsonData.positions){
					globalRegistry.clearRegisteredObjects('${positions-'+idTable+'}');
					globalRegistry.registerObject('${positions-'+idTable+'}', jsonData.positions);
				}
				return jsonData.elenco;
			},
			totalProperty : 'numtot',
			listeners : {
				exception : Ext.util.Format.messaggiErrore // ***gestisco le eccezioni server side
			},
			baseParams : {
				'tableStatus.valueSelector' : valueSelector
			},
			defaultParamNames : {
				start : 'tableStatus.start',
				limit : 'tableStatus.limit',
				sort : 'tableStatus.sort',
				dir : 'tableStatus.dir'
			},
			fields : ExtCsi.Utils.createStoreFields(this)
		});

		var filters = new Ext.ux.grid.GridFilters({
					encode : false,
					local : false,
					filters : ExtCsi.Utils.createFilters(this)
				});
		
		var sm = null;
		var pageSize = this.pageSize;
		var eventHandlers = this.eventHandlers;
		var csiGrid = this;
		this.formId = formId;
		if(this.databinding){
			//***registro 
			sm = new Ext.grid.CheckboxSelectionModel({
						singleSelect : !ExtCsi.Utils.isMultiBinding(this),
						header: ExtCsi.Utils.isMultiBinding(this) ? '<div class="x-grid3-hd-checker">&#160;</div>' : '',
						listeners : {
							rowselect : function(sm, rowIdx, r) {
								var appDataName = ExtCsi.Utils.getOgnlValue(csiGrid);
								var p = {}
								p[[appDataName].join('')] = r.id;	
								
								if (eventHandlers) {
									for (var i = 0; i < eventHandlers.length; i++) {
										var event = eventHandlers[i];
										// ***lancio l'evento sul value_changed
										if (event.eventType == ExtCsi.ui.event
												.EventTypes().VALUE_CHANGED) {
											var command = event.command;
											command.setFormId(formId);
											// ***converto i params da passare
											// alla post
											command.setBaseFormParams(p);
											if (command) {
												command.setStoreData(true);
												command.doCommand();
											}
										}
									}
								}
							}
						}
					});
		}
					
		var cm = new Ext.grid.ColumnModel({
					columns : ExtCsi.Utils.createColumnModel(this, sm),
					defaults : {
						sortable : true,
						width : 100
					}
				});
		
		var grid = new Ext.grid.EditorGridPanel({
			store : tableStore,
			title : this.label,
			id : this.name,
			colModel : cm,
			disabled: !this.defaultEnabled,
			hidden: !this.defaultVisible,
			height : 300,
			plugins : [filters, new ExtCsi.ui.widgets.EditableColumnLoader()],
			sm : sm,
			loadMask : true,
			multiDataBinding : ExtCsi.Utils.getOgnlValuess(this),
			dataBinding: ExtCsi.Utils.getOgnlValue(this),
			listeners : {
				/*
				render : {
					fn : function() {
						tableStore.load({
									params : {
										'tableStatus.start' : 0,
										'tableStatus.limit' : pageSize,
										'tableStatus.valueSelector' : valueSelector
									}
								});
					}
				},*/
				cellclick : function(grid, rowIndex, columnIndex, e) {
					
				    /*
				    
					var activeFlagSelector = grid.getColumnModel().activeFlagSelector;
					
					var data = record.get(activeFlagSelector);
					
					 
						return link;
					}*/
				}
			},
			bbar : pageSize && (pageSize > 1) ? [new Ext.PagingToolbar({
								store : tableStore,
								pageSize : pageSize,
								plugins : filters
							}), '->', {
						text : 'Resetta filtri',
						tooltip : 'Resetta tutti i filtri impostati',
						iconCls : 'reset',
						handler : function() {
							grid.filters.clearFilters();
						}
					}] : null
		});

		//***accodo lo store della tabella
		MessageBus.on('init', function(){
			tableStore.load({
				params : {
					'tableStatus.start' : 0,
					'tableStatus.limit' : pageSize,
					'tableStatus.valueSelector' : valueSelector
				}
			});
		});
		
		its.push(grid);
		
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class CheckBox


/**
 * @class ExtCsi.ui.widgets.CheckBox
 * @extends ExtCsi.ui.widgets.DataWidget
 * @constructor
 * Vidget a due valori: on/off. Il tipo associato deve essere un Boolean
 */
ExtCsi.ui.widgets.CheckBox = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.CheckBox, ExtCsi.ui.widgets.DataWidget,
	{

	
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.CheckBox_extraMethods) ENABLED START*/
	/**
	 * costruisce l'oggetto Extjs che corrisponde al campo di tipo checkbox
	 * 
	 * @param {Object}
	 *            el
	 * @param {Array}
	 *            its
	 */
	renderExtComponent : function(el, its, formId) {
		var checkbox = {
			xtype : 'checkbox',
			id : this.name,
			name : ExtCsi.Utils.getOgnlValue(this),
			disabled: !this.defaultEnabled,
			hidden: !this.defaultVisible,
			fieldLabel : this.label,
			// boxLabel: this.label,
			helpText : this.tooltip,
			allowBlank : !this.required,
			databinding : this.databinding
		};
		if (el.layout instanceof ExtCsi.ui.layout.HorizontalFlowPanelLayout
				|| el.layout instanceof ExtCsi.ui.layout.UDLRCPanelLayout
				|| (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
						&& el.layout.columns && el.layout.columns > 1)) {
			var cf = [];
			cf.push(checkbox);
			var colW = null;
			if (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
					&& el.layout.columns && el.layout.columns > 1) {
				colW = 1 / el.layout.columns;
			}
			its.push({
						columnWidth : colW,
						border : false,
						style : 'padding:5px 5px 0',
						layout : 'form',
						items : cf
					});
		} else {
			its.push(checkbox);
		}
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class RadioButtons


/**
 * @class ExtCsi.ui.widgets.RadioButtons
 * @extends ExtCsi.ui.widgets.DataWidget
 * @constructor
 * Widget a selezione alternativa tra un insieme statico di valori.
 */
ExtCsi.ui.widgets.RadioButtons = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.RadioButtons, ExtCsi.ui.widgets.DataWidget,
	{

			
		/**
		 * @cfg (ExtCsi.ui.widgets.RadioButton) radio Insieme dei radiobutton che determina l'insieme dei valori possibili
		 */
		radio: null			
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.RadioButtons_extraMethods) ENABLED START*/
	,
	/**
	 * restituisce il componente Extjs che corrisponde al radio
	 * 
	 * @param {Object}
	 *            el
	 * @param {Array}
	 *            its
	 */
	renderExtComponent : function(el, its, formId) {
		if (el.layout instanceof ExtCsi.ui.layout.HorizontalFlowPanelLayout
				|| el.layout instanceof ExtCsi.ui.layout.UDLRCPanelLayout
				|| (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
						&& el.layout.columns && el.layout.columns > 1)) {
			var cf = [];
			var radio = this.radio;
			if (radio) {
				for (var i = 0; i < radio.length; i++) {
					var rad = radio[i];
					var lb = '';
					if (i == 0) {
						lb = this.label;
					}
					cf.push({
								xtype : 'radio',
								name : ExtCsi.Utils.getOgnlValue(this),
								fieldLabel : lb,
								boxLabel : rad.label,
								disabled: !this.defaultEnabled,
								hidden: !this.defaultVisible,
								helpText : rad.tooltip,
								allowBlank : !this.required,
								inputValue : rad.value,
								databinding : this.databinding
							});
				}
			}
			var colW = null;
			if (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
					&& el.layout.columns && el.layout.columns > 1) {
				colW = 1 / el.layout.columns;
			}
			its.push({
						columnWidth : colW,
						border : false,
						style : 'padding:5px 5px 0',
						layout : 'form',
						items : cf
					});
		} else {
			var radio = this.radio;
			if (radio) {
				for (var i = 0; i < radio.length; i++) {
					var rad = radio[i];
					var lb = '';
					if (i == 0) {
						lb = this.label;
					}
					its.push({
								xtype : 'radio',
								name : ExtCsi.Utils.getOgnlValue(this),
								fieldLabel : lb,
								boxLabel : rad.label,
								disabled: !this.defaultEnabled,
								hidden: !this.defaultVisible,
								helpText : rad.tooltip,
								allowBlank : !this.required,
								inputValue : rad.value
							});
				}
			}
		}
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class RadioButton


/**
 * @class ExtCsi.ui.widgets.RadioButton
 * @extends ExtCsi.ui.widgets.Widget
 * @constructor
 * Singolo elemento di un <b>RadioButtons</b>.
 */
ExtCsi.ui.widgets.RadioButton = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.RadioButton, ExtCsi.ui.widgets.Widget,
	{
			
		/**
		 * @cfg (String) value Valore associato al radiobutton.
Il testo descrittivo visualizzato deve essere impostato nella property "label"
		 */
		 value: null
	
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.RadioButton_extraMethods) ENABLED START*/
		,renderExtComponent : function(el, its, formId) {
			alert('Il widget RadioButtont non è stato ancora implementato');	
		}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ResetButton


/**
 * @class ExtCsi.ui.widgets.ResetButton
 * @extends ExtCsi.ui.widgets.Button
 * @constructor
 * Pulsante con funzione di reset della form.
Non è possibile associare alcun event handler a questo pulsante.
 */
ExtCsi.ui.widgets.ResetButton = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.ResetButton, ExtCsi.ui.widgets.Button,
	{

	
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.ResetButton_extraMethods) ENABLED START*/
	renderExtComponent : function(el, its, formId) {
		alert('Il widget ResetButton non è stato ancora implementato');
	}
/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ConfirmButton


/**
 * @class ExtCsi.ui.widgets.ConfirmButton
 * @extends ExtCsi.ui.widgets.Button
 * @constructor
 * Pulsante utilizzabile per l'esecuzione di azioni (salvataggio, ricerca, .....).
E' possibile associare un evneto di tipo CLICKED a questo widget.
 */
ExtCsi.ui.widgets.ConfirmButton = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.ConfirmButton, ExtCsi.ui.widgets.Button,
	{

	
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.ConfirmButton_extraMethods) ENABLED START*/
	/**
	 * costruisce l'oggetto Extjs che corrisponde al pulsante
	 * 
	 * @param {Object}
	 *            el
	 * @param {Array}
	 *            its
	 */
	renderExtComponent : function(el, its, formId) {
		var button = {
			xtype : 'button',
			id : this.name,
			name : this.name,
			text : this.label,
			disabled: !this.defaultEnabled,
			hidden: !this.defaultVisible,
			eventHandlers : this.eventHandlers,
			handler : function(b) {
				if (b.eventHandlers) {
					for (var i = 0; i < b.eventHandlers.length; i++) {
						var event = b.eventHandlers[i];
						var command = event.command;
						command.setFormId(formId);
						command.setSkipValidation(event.skipValidation);			
						//***controllo se ho delle tabelle editabili nella form
						//***in tal caso devo postare tutti i campi modificati
						//***possono esserci più tabelle editabili nella pagina
						var tblReg = globalRegistry.getRegisteredObject(ExtCsi.Const.ID_EDITABLE_TABLE);
						if(tblReg){
							var lista = {};
							for (var j = 0; j < tblReg.length; j++) {
								tbl = Ext.getCmp(tblReg[j]);
								if(tbl){
									//***inietto come parametri tutti i campi della colonna modificata
									var paramPrefix = tbl.multiDataBinding;
									var parametri = tbl.store.lastOptions.params;
									var eds = tbl.store.getModifiedRecords();
									
									//***recupero dal registry l'elenco delle posizioni della lista
									//***controllo prima se ho dei record editati sulla tabella
									var positions = globalRegistry.getRegisteredObject('${positions-'+tblReg[j]+'}');
									if(eds.length > 0){
										for(var k = 0; k < eds.length; k++){
											var position = k;
											/*
											 * se ho le posizioni nel registry allora prendo l'oggetto lo scorro e
											 * trovo la posizione corrispondente all'oggetto modificato
											 * Per prendere la posizione giusta controllo che l'id del
											 * record sia lo stesso.
											 */
											if(positions){
												for(var p = 0; p < positions.length; p++){
													if(positions[p].id == eds[k].id){
														position = positions[p].position
														break;
													}
												}
											}
											var root = [paramPrefix, '[', position, ']'].join('');
											var columns = tbl.getColumnModel().columns;
											lista[root + '.'+eds[k].store.idProperty] = eds[k].id;
											for (var z = 0; z < columns.length; z++) {
												var coll = columns[z].id;
												lista[root + '.'+coll] = eds[k].get(coll);		
											}
										}
									} else if(tbl.getSelectionModel() instanceof Ext.grid.RowSelectionModel){ //***controllo se ho dei record selezionati sulla tabella
										var singleSelect = tbl.getSelectionModel().singleSelect;
										var sel = tbl.getSelectionModel().getSelections(); //***tutti i record selezionati
										var selected = tbl.getSelectionModel().getSelected(); //***primo record selezionato
										var appDataName = tbl.dataBinding;
										if(singleSelect && selected){
											lista[[appDataName].join('')] = selected.id;	
										}else{
											for(var k = 0; k < sel.length; k++){
												var root = [appDataName, '[', k, ']'].join('');
												lista[root] = sel[k].id;
											}
										}
									}
									
									command.setBaseFormParams(lista);
								}
							}
						}
						if (command) {
							command.setStoreData(true);
							command.doCommand();
						}
					}
				}
			}
		};
		if (el.layout instanceof ExtCsi.ui.layout.HorizontalFlowPanelLayout
				|| el.layout instanceof ExtCsi.ui.layout.UDLRCPanelLayout
				|| (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
						&& el.layout.columns && el.layout.columns > 1)) {
			var cf = [];
			cf.push(button);
			var colW = null;
			if (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
					&& el.layout.columns && el.layout.columns > 1) {
				colW = 1 / el.layout.columns;
			}
			its.push({
						columnWidth : colW,
						border : false,
						style : 'padding:5px 5px 0',
						layout : 'form',
						items : cf
					});
		} else {
			its.push(button);
		}
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class PanelLayout


/**
 * @class ExtCsi.ui.layout.PanelLayout
 * @extends Object
 * @constructor
 * superclasse di tutte le classi che definiscono un particolare layout
 */
ExtCsi.ui.layout.PanelLayout = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.layout.PanelLayout, Object,
	{
			
		/**
		 * @cfg (String) columnSizes impostazione percentuale della dimensione delle colonne. Varia a seconda del 
particolare tipo di layout. 
Per ogni colonna logica (destinata a contenere un widget composto da label+controllo)
è necessario impostare due valori separati da virgola: i valori in posizione
dispari (1,3,...) determinano la percentuale da assegnare alla label, mentre
i valori in posizione pari (2,4,...) determinano la percentuale da assegnare
al controllo vero e proprio.
Es: per un GridLayout di 2 colonne una possibile impostazione &egrave;:
"20,30,25,25", che equivale ad una occupazone delle due colonne logiche 
del 50% dello spazio e, all'intenro della prima colonna logica il 20% dello spazio sarà assegnato 
alla label mentre il restante 30% sarà assegnato al controllo.

		 */
		 columnSizes: null
	
	/*PROTECTED REGION ID(ExtCsi.ui.layout.PanelLayout_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class HorizontalFlowPanelLayout


/**
 * @class ExtCsi.ui.layout.HorizontalFlowPanelLayout
 * @extends ExtCsi.ui.layout.PanelLayout
 * @constructor
 * Gli elementi sono posizionati l'uno a fianco all'altro, da sinistra a destra.
Non è necessario nessun specificatore per i singoli elementi
 */
ExtCsi.ui.layout.HorizontalFlowPanelLayout = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.layout.HorizontalFlowPanelLayout, ExtCsi.ui.layout.PanelLayout,
	{

	
	/*PROTECTED REGION ID(ExtCsi.ui.layout.HorizontalFlowPanelLayout_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class VerticalFlowPanelLayout


/**
 * @class ExtCsi.ui.layout.VerticalFlowPanelLayout
 * @extends ExtCsi.ui.layout.PanelLayout
 * @constructor
 * Gli elementi sono posizionati l'uno sotto l'altro, dall'alto in basso.
Non è necessario nessun specificatore per i singoli elementi.
E'possibile impostare la percentuale delle colonne associate alla label
ed al controllo della singola colonna implicitamente definita da questo tipo di 
layout.
 */
ExtCsi.ui.layout.VerticalFlowPanelLayout = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.layout.VerticalFlowPanelLayout, ExtCsi.ui.layout.PanelLayout,
	{

	
	/*PROTECTED REGION ID(ExtCsi.ui.layout.VerticalFlowPanelLayout_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class UDLRCPanelLayout


/**
 * @class ExtCsi.ui.layout.UDLRCPanelLayout
 * @extends ExtCsi.ui.layout.PanelLayout
 * @constructor
 * Specifica di posizionamento di widget in un layout UDLRC (Up/Down/Left/Right/Center).
I valori ammissibili sono contenuti nella Enumeration <b>UDLRCSpecConstants</b>.
 */
ExtCsi.ui.layout.UDLRCPanelLayout = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.layout.UDLRCPanelLayout, ExtCsi.ui.layout.PanelLayout,
	{

	
	/*PROTECTED REGION ID(ExtCsi.ui.layout.UDLRCPanelLayout_extraMethods) ENABLED START*/
/*PROTECTED REGION END*/
	}
);



/// dichiarazione class WidgetLayoutSpecifier


/**
 * @class ExtCsi.ui.layout.WidgetLayoutSpecifier
 * @extends Object
 * @constructor
 * Superclasse di tutte le classi di specificazione del posizionamento degli elementi in un pannello
 */
ExtCsi.ui.layout.WidgetLayoutSpecifier = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.layout.WidgetLayoutSpecifier, Object,
	{

	
	/*PROTECTED REGION ID(ExtCsi.ui.layout.WidgetLayoutSpecifier_extraMethods) ENABLED START*/
/*PROTECTED REGION END*/
	}
);



/// dichiarazione class UDLRCWidgetLayoutSpec


/**
 * @class ExtCsi.ui.layout.UDLRCWidgetLayoutSpec
 * @extends ExtCsi.ui.layout.WidgetLayoutSpecifier
 * @constructor
 * Specificatore di posizionamento di un elemento all'interno di un contenitore
dotato di layout <b>UDLRC</b>.
 */
ExtCsi.ui.layout.UDLRCWidgetLayoutSpec = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.layout.UDLRCWidgetLayoutSpec, ExtCsi.ui.layout.WidgetLayoutSpecifier,
	{
			
		/**
		 * @cfg (String from enumeration ExtCsi.ui.layout.UDLRCSpecConstants) value Indica in quale dei 5 quadranti (UP/DOWN/LEFT/RIGHT/CENTER) deve
essere posizionato l'elemento
		 */
		 value: null
	
	/*PROTECTED REGION ID(ExtCsi.ui.layout.UDLRCWidgetLayoutSpec_extraMethods) ENABLED START*/
			/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Image


/**
 * @class ExtCsi.ui.widgets.Image
 * @extends ExtCsi.ui.widgets.Widget
 * @constructor
 * Utilizzato per la visualizzazione di immagini statiche all'interno della struttura UI.
 */
ExtCsi.ui.widgets.Image = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.Image, ExtCsi.ui.widgets.Widget,
	{
			
		/**
		 * @cfg (String) image Il percorso dell'immagine. Il valore può variare a seconda della cartuccia di
generazione. Nel caso della cartuccia <i>struts2</i> il valore è inserito as-is
nel tag <i>img</i>.

		 */
		 image: null
	
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.Image_extraMethods) ENABLED START*/
		 ,renderExtComponent : function(el, its, formId) {
			alert('Il widget Image non è stato ancora implementato');	
		}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Menu


/**
 * @class ExtCsi.ui.menu.Menu
 * @extends Object
 * @constructor
 * Voce di menu
 */
ExtCsi.ui.menu.Menu = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.menu.Menu, Object,
	{
			
		/**
		 * @cfg (String) name Codice simbolico della voce di menu. Deve essere univoco all'interno della
struttura di menu e deve essere un identificativo valido secondo Java.
		 */
		 name: null,
		/**
		 * @cfg (String) label Il menu viene visualizzato con questa etichetta.
		 */
		 label: null,
			
		/**
		 * @cfg (Object) item OBSOLETO: non utilizzare. Utilizzare l'elemento <i>submenu</i>.
		 */
		item: null,
		/**
		 * @cfg (ExtCsi.ui.menu.Menu) submenu Elenco dei sottomenu di questo menu.
		 */
		submenu: null,
		/**
		 * @cfg (ExtCsi.security.UISecurityConstraint) securityConstraints elenco dei secirity constraints associati a questa voce di menu.
		 */
		securityConstraints: null,
		/**
		 * @cfg (ExtCsi.ui.event.EventHandler) eventHandler Il menu supporta un handler per l'evento CLICKED. Se non viene specificato
nessun event handler il menu sarà completamente inattivo.
		 */
		eventHandler: null			
	/*PROTECTED REGION ID(ExtCsi.ui.menu.Menu_extraMethods) ENABLED START*/
	,
	/**
	 * @method
	 */
	addSecurityConstraints : function(obj) {
		if (this.securityConstraints == null) {
			this.securityConstraints = [];
		}
		this.securityConstraints.push(obj);
	},
	/**
	 * 
	 * @return {Array} of UISecurityConstraint restituisce la lista di
	 *         ExtCsi.security.UISecurityConstraint
	 */
	getSecurityConstraints : function() {
		var tpl = this.securityConstraints;
		var returnTpl = [];
		Ext.each(tpl, function(mod) {
					var modObj = null;
					if (modObj instanceof ExtCsi.security.UISecurityConstraint) {
						modObj = this.securityConstraints;
					} else {
						modObj = globalRegistry.getRegisteredObject(mod);
					}
					if (modObj != null) {
						returnTpl.push(modObj);
					}
				});
		return returnTpl;
	},
	/**
	 * restituisce l'EventHandler associato
	 * 
	 * @return {EventHandler}
	 */
	getEventHandler : function() {
		var event = this.eventHandler;
		if (event instanceof ExtCsi.ui.event.EventHandler) {
			return event;
		} else {
			var evt = globalRegistry.getRegisteredObject(event);
			if (evt) {
				return evt;
			}
		}
		return event;
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ColumnModel


/**
 * @class ExtCsi.ui.widgets.table.ColumnModel
 * @extends Object
 * @constructor
 * Modello delle colonne di una tabella (<b>Table</b>). Determina quali 
colonne vengono visualizzate, in che ordine e altre caratteristiche della tabella.

 */
ExtCsi.ui.widgets.table.ColumnModel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.table.ColumnModel, Object,
	{
			
		/**
		 * @cfg (String) valueSelector seleziona il field del record di cui è composta la collezione collegata
alla Table che deve essere utilizzato come valore di selezione.
Utilizzato solo in congiunzione con un value-binding (quindi con possibilità
di selezione).
Es: se:
<ul>
<li> la tabella è collegata ad una collezione di un tipo <i>Persona</i>, 
costituito dai field:
  <ul>
  <li>codFisc: String</li>
  <li>nome: String</li>
  <li>cognome: String</li>
  </ul>
</li>
<li>il <i>value-binding</i> &egrave; associato ad un appdata di tipo String</li>
<li>il <i>valueSelector</i> &egrave; impostato come "codFisc" </li>
</ul>
Allora selezionando una riga della tabella l'application data di value-binding 
sarà impostato con il codice fiscale del record corrispondente.

		 */
		 valueSelector: null,
			
		/**
		 * @cfg (ExtCsi.ui.widgets.table.Column) columns Elenco (ordinato) delle colonne che devono essere visualizzate.
		 */
		columns: null			
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.table.ColumnModel_extraMethods) ENABLED START*/
		,renderExtComponent : function(el, its, formId) {
			alert('Il widget ColumnModel non è stato ancora implementato');	
		}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Column


/**
 * @class ExtCsi.ui.widgets.table.Column
 * @extends Object
 * @constructor
 * Modello della singola colonna di una <b>Table</b>.
 */
ExtCsi.ui.widgets.table.Column = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.table.Column, Object,
	{
			
		/**
		 * @cfg (String) selector Seleziona il field del record di cui è costituita la collezione associata alla
tabella.
		 */
		 selector: null,
		/**
		 * @cfg (String) label Etichetta della testata della colonna
		 */
		 label: null,
		/**
		 * @cfg (Boolean) sortable Se impostata a <i>true</i> la colonna è ordinabile cliccando sulla testata.
		 */
		 sortable: null,
		/**
		 * @cfg (Boolean) editable Se impostato a <i>true</i> la colonna &egrave; editabile. Il widget
utilizzato per l'editing della colonna dipende dal tipo del field associato
alla colonna (tramite la property <i>selector</i>):
<ul>
<li><b>CheckBox</b> in caso di tipo boolean</li>
<li><b>TextField</b> in tutti gli altri casi (stringhe, numerici, date)</li>
</ul>
Inoltre, se sono impostate le property <i>multiDataBinding</i> o 
<i>multiDataPropertySelector</i>, che comportano la possibilit&agrave;
di scegliere il valore da una lista di valori, sar&agrave; utilizzata una
<b>ComboBox</b>
		 */
		 editable: null,
		/**
		 * @cfg (Boolean) eventActive Indica che la colonna è cliccabile. Il click permette di scatenare l'evento CLICKED
sulla tabella. deve essere utilizzato in congiunzione con un event handler
nella <b>Table</b>, altrimenti non ha nessun effetto.
		 */
		 eventActive: null,
		/**
		 * @cfg (String) editableFlagSelector Permette di stabilire a runtime se una cella della colonna (che deve essere
dichiarata editabile) sarà effettivamente editabile.
Rappresenta il selettore di un field del record di cui &egrave; costituita
la collezione collegata alla tabella: questo field deve essere di tipo boolean.
		 */
		 editableFlagSelector: null,
		/**
		 * @cfg (String) multidataKeySelector Utilizzato in congiunzione con <i>multiDataBinding</i> o <i>multidataPropertySelector</i>.
Seleziona il field da utilizzare come chiave-valore della combo.
		 */
		 multidataKeySelector: null,
		/**
		 * @cfg (String) multidataValueSelector Utilizzato in congiunzione con <i>multiDataBinding</i> o <i>multidataPropertySelector</i>.
Seleziona il field da utilizzare come label descrittiva nella combo.
		 */
		 multidataValueSelector: null,
		/**
		 * @cfg (String) multidataPropertySelector Permette di associare ad una colonna editabile la possibilit&agrave;
di scegliere il valore della cella a partire da una collezione di coppie
chiave/valore. 
Per specificare quale campo del record di cui &egrave; costituita questa collezione ausiliaria
utilizzare come chiave e come descrizione, occorre impostare le property
<i>multidataKeySelector</i> e <i>multidataValueSelector</i>.
L'insieme dei valori è differenziato riga per riga .
Nel caso sia sufficiente uno stesso insieme di valori per tutte le righe utilizzare
<i>multiDataBinding</i>
		 */
		 multidataPropertySelector: null,
		/**
		 * @cfg (String) tooltip tooltip associato all'header della colonna
		 */
		 tooltip: null,
		/**
		 * @cfg (String) activeFlagSelector Permette di stabilire a runtime se una cella della colonna (che deve essere
dichiarata <i>eventActive</i>) sarà effettivamente attiva (ovvero sarà "cliccabile").
Rappresenta il selettore di un field del record di cui &egrave; costituita
la collezione collegata alla tabella: questo field deve essere di tipo boolean.
		 */
		 activeFlagSelector: null,
			
		/**
		 * @cfg (ExtCsi.mdl.data.AppDataBinding) multiDataBinding Permette di associare ad una colonna editabile la possibilit&agrave;
di scegliere il valore della cella a partire da una collezione di coppie
chiave/valore. 
Per specificare quale campo del record di cui è costituita questa collezione ausiliaria
utilizzare come chiave e come descrizione, occorre impostare le property
<i>multidataKeySelector</i> e <i>multidataValueSelector</i>.
La collezione è la stessa per tutte le righe. 
Nel caso sia necessario differenziare l'insieme di valori a seconda della riga,
utilizzare <i>multidataPropertySelector</i>.
		 */
		multiDataBinding: null			
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.table.Column_extraMethods) ENABLED START*/
		,renderExtComponent : function(el, its, formId) {
			alert('Il widget Column non è stato ancora implementato');	
		}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Command


/**
 * @class ExtCsi.cmd.Command
 * @extends Object
 * @constructor
 * Classe astratta d acui discendono tutte le classi del framework di comandi.
 */
ExtCsi.cmd.Command = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.Command, Object,
	{

	
	/*PROTECTED REGION ID(ExtCsi.cmd.Command_extraMethods) ENABLED START*/
	/**
	 * url da richiamare
	 * 
	 * @type {String}
	 */
	methodUrl : null,
	/**
	 * id della form in cui si trova il wodget
	 * 
	 * @type {String}
	 */
	idForm : null,
	/**
	 * parametri da aggiungere alla form
	 * 
	 * @type Object
	 */
	baseFormParams : null,
	/**
	 * @cfg {Boolean} impostare a true se si vogliono caricare i dati nei singoli widget dopo i
	 * vari command
	 * @default 'false'
	 */
	storeData : false,
	/**
	 * 
	 * @cfg {Boolean} skipValidation
	 * impostare a true per validare i
	 * campi obbligatori
	 */
	skipValidation: false,
	/**
	 * @method no operation
	 */
	doCommand : function() {
		return null;
	},
	/**
	 * setta l'id della form che contiene il comando
	 * 
	 * @param {String}
	 *            v
	 */
	setFormId : function(v) {
		this.idForm = v;
	},
	/**
	 * setta la variabile storeData
	 * @param {Boolean} v
	 */
	setStoreData : function(v){
		this.storeData = v;
	},
	/**
	 * setta i parametri di base
	 * @param {Object} v
	 */
	setBaseFormParams : function(v) {
		this.baseFormParams = v;
	},
	/**
	 * setta il parametro onRefreshCommand
	 * @param {Boolean} v
	 */
	setSkipValidation: function(v){
		this.skipValidation = v;
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ONOFFCommand


/**
 * @class ExtCsi.cmd.ONOFFCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Permette di abilitare/disabilitare i widget specificati. Lo stato di abilitazione
rimane persistente in sessione.
 */
ExtCsi.cmd.ONOFFCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.ONOFFCommand, ExtCsi.cmd.Command,
	{
			
		/**
		 * @cfg (Boolean) enable Se impostato a true il comando ha effetto di abilitare i widget; 
se impostato a false ha l'effetto di disabilitazione.
		 */
		 enable: null,
			
		/**
		 * @cfg (ExtCsi.ui.widgets.Widget) targetWidgets I widget su cui opera il comando.
		 */
		targetWidgets: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.ONOFFCommand_extraMethods) ENABLED START*/
	,
	/**
	 * @method no operation
	 */
	doCommand : function() {
		var lista = {};
		lista[['enableWidget'].join('')] = this.enable;	
		for (var i = 0; i < this.targetWidgets.length; i++) {
			var widg = Ext.getCmp(this.targetWidgets[i]);
			if (widg) {
				this.enable ? widg.enable() : widg.disable();
			}
			var root = ['nomiWidgets', '[', i, ']'].join('');
			lista[root] = this.targetWidgets[i];
		}
		var cp = globalRegistry.getRegisteredObject(ExtCsi.Const.CURRENT_CP_NAME);
		var url = cp.name+'!execSetWidgetsOnOffStatus.do';
		
		var params = Ext.apply(lista);
		var req = new ExtCsi.app.ExecAjaxRequest({
			url : url,
			params : params
		});
		req.init();
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class CustomCommand


/**
 * @class ExtCsi.cmd.CustomCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * [[TODO: add documentation here]]
 */
ExtCsi.cmd.CustomCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.CustomCommand, ExtCsi.cmd.Command,
	{

	
	/*PROTECTED REGION ID(ExtCsi.cmd.CustomCommand_extraMethods) ENABLED START*/
	/**
	 * @method no operation
	 */
	doCommand : function() {
		return null;
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class VisibilityCommand


/**
 * @class ExtCsi.cmd.VisibilityCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Permette di mostrare/nascondere i widget specificati. Lo stato di visibilit&agrave;
rimane persistente in sessione.
 */
ExtCsi.cmd.VisibilityCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.VisibilityCommand, ExtCsi.cmd.Command,
	{
			
		/**
		 * @cfg (Boolean) show Se impostato a true il comando ha effetto di rendere visibile i widget; 
se impostato a false ha l'effetto di renderli invisibili.
		 */
		 show: null,
			
		/**
		 * @cfg (ExtCsi.ui.widgets.Widget) targetWidgets I widget su cui opera il comando.
		 */
		targetWidgets: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.VisibilityCommand_extraMethods) ENABLED START*/
	,
	/**
	 * @method no operation
	 */
	doCommand : function() {
		var lista = {};
		lista[['showWidget'].join('')] = this.show;	
		for (var i = 0; i < this.targetWidgets.length; i++) {
			var widg = Ext.getCmp(this.targetWidgets[i]);
			if (widg) {
				this.show ? widg.show() : widg.hide();
			}
			var root = ['nomiWidgets', '[', i, ']'].join('');
			lista[root] = this.targetWidgets[i];
		}
		var cp = globalRegistry.getRegisteredObject(ExtCsi.Const.CURRENT_CP_NAME);
		var url = cp.name+'!execSetWidgetsVisibilityStatus.do';
		
		var params = Ext.apply(lista);
		var req = new ExtCsi.app.ExecAjaxRequest({
			url : url,
			params : params
		});
		req.init();
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class RefreshViewCommand


/**
 * @class ExtCsi.cmd.RefreshViewCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Permette di effettuare il re-rendering di una porzione di ContentPanel.
Funziona solo se sono abilitate le fatures di interazione "ricca", nell'elemento
<b>TargetPlatform</b>.
Al fine di garnatire l'accessibilit&agrave;, Nel caso della cartuccia "struts2", se il browser non supporta javascript, 
la feature effettua un "downgrade" automatico mantenendo il funzionamento
seppur perdendo la funzione ricca (ovvero si ha il refresh completo della pagina).
Essendo sottoclasse di <b>CommandOnWidgets</b> e <b>CommandOnPanels</b> &egrave; 
possibile specificare la porzione di <b>ContentPanel</b> che deve essere aggiornata.
L'interpretazione delle proeprty <i>targetWidgets</i> e <i>targetPanels</i>
dipende dalla particolare cartuccia di generazione utilizzata.
 */
ExtCsi.cmd.RefreshViewCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.RefreshViewCommand, ExtCsi.cmd.Command,
	{

			
		/**
		 * @cfg (ExtCsi.ui.widgets.Widget) targetWidgets I widget su cui opera il comando.
		 */
		targetWidgets: null,
		/**
		 * @cfg (ExtCsi.ui.panels.Panel) targetPanels Ii pannelli su cui agisce il comando.
		 */
		targetPanels: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.RefreshViewCommand_extraMethods) ENABLED START*/
	,
	/**
	 * @cfg {Object} responseTextDecoded contiene la response restituita dalla
	 *      chiamata decodificata in json, se presente
	 * @type {String}
	 */
	responseTextDecoded : null,
	/**
	 * @method effettua il refresh dei pannelli/widget indicati
	 */
	doCommand : function() {
		var model = null;
		if (this.responseTextDecoded) {
			// var jsonDec = new Ext.util.JSON.decode(this.responseText);
			model = this.responseTextDecoded.model;
		}
		for (var i = 0; i < this.targetWidgets.length; i++) {
			var widg = Ext.getCmp(this.targetWidgets[i]);
			if (widg) {
				if (widg.store) {
					widg.store.reload();
				}
				if(widg instanceof Ext.tree.TreePanel){
					widg.getLoader().directFn = null;  
					var selectedNode = globalRegistry.getRegisteredObject(ExtCsi.Const.SELECTED_TREE_NODE);
					if(selectedNode){
						widg.getLoader().load(selectedNode);
					}else{
						tree.root.reload();
					}
				}
				try{
					widg.reset();
					//***popolo i campi solo se 
					if (this.storeData && widg instanceof Ext.form.Field && widg.databinding && model) {
						var appData = ExtCsi.Utils.getOgnlValue(widg);
						widg.setValue(eval('model.' + appData));
					}	
				}catch(e){}
			}
		}
	},
	/**
	 * setta l'oggetto rappresentato dalla decodifica in json della response
	 * 
	 * @param {Object}
	 *            v
	 */
	setResponseTextDecoded : function(v) {
		this.responseTextDecoded = v;
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class JumpCommand


/**
 * @class ExtCsi.cmd.JumpCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Permette di passare alla visualizzazione di un <b>ContentPanel</b>
differente.
 */
ExtCsi.cmd.JumpCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.JumpCommand, ExtCsi.cmd.Command,
	{
			
		/**
		 * @cfg (Boolean) pushCurrentPage Salva in uno stack la pagina corrente prima di effettuare il salto.
Da utilizzarsi in congiunzione con <b>JumpBackCommand</b>.
		 */
		 pushCurrentPage: null,
			
		/**
		 * @cfg (ExtCsi.ui.panels.ContentPanel) jumpTo Il <b>ContentPanel</b> a cui saltare.
		 */
		jumpTo: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.JumpCommand_extraMethods) ENABLED START*/
	,
	/**
	 * @method no operation
	 */
	doCommand : function() {
		var cp = new ExtCsi.ui.panels.ContentPanel();
		var menubar = globalRegistry.getRegisteredObject(ExtCsi.Const.MENUBAR_STRUCTURE);
		cp.init(menubar, this.jumpTo);
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ExecCommand


/**
 * @class ExtCsi.cmd.ExecCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Permette di eseguire logica custom all'intenro di una catena di comandi.
Al metodo specificato in <i>methodName</i> sar&agave; passata una struttura
dati contenente:
<ul>
<li>i riferimenti agli <b>ApplicationData</b> referenziati
dal <b>ContentPanel</b> che contiene il comando.</li>
<li>un riferimento alla sessione applicativa</li>
<li> alcune informazioni ausiliarie diepndenti dalla struttura del 
    <b>ContentPanel</b> (es. Id del nodo selezionato in un tree, 
    informazioni circa il tab su cui si è cliccato, informazioni sulla cella selezionata
in una tabella) </li>
</ul>
Nel metodo il programmatore potr&agrave; eseguire qualsiasi tipo di logica ed in 
particolare:
<ul>
<li> modificare lo stato degli application data o della sessione.</li>
<li> inserire nel contesto applicativo messaggi informativi o di errore</li>
<li> determinare la prosecuzione del flusso, selezionando uno tra i 
<i>results</i> disponibili.</li>
</ul>
Al termine dell'esecuzione del metodo il flusso proseguir&agrave; con il comando
inserito nel <b>CommandOutcome</b> specificato al termine della logica.

 */
ExtCsi.cmd.ExecCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.ExecCommand, ExtCsi.cmd.Command,
	{
			
		/**
		 * @cfg (String) methodName Nome del metodo nel quale sarà contenuta la logica effettiva.
L'implementazione dipende dalla particolare cartuccia di generazione.
Nel caso della cartuccia "struts2" verr&agrave; generato un metodo nello
strato spring, contenente una regione protetta nel quale il programamtore
dovr&agrave; inserire la logica effettiva.
		 */
		 methodName: null,
			
		/**
		 * @cfg (ExtCsi.cmd.CommandOutcome) results L'elenco delle possibili prosecuzioni a fronte dell'esecuzione del comando.
		 */
		results: null,
		/**
		 * @cfg (ExtCsi.mdl.data.ApplicationData) postExecData Occorre dichiarare preventivamente gli application data che saranno modificati nella logica applicativa.
		 */
		postExecData: null,
		/**
		 * @cfg (Object) customTemplate 
		 */
		customTemplate: null,
		/**
		 * @cfg (Object) extraModels Eventuali modelli (porzioni di modello) aggiuntivi utilizzabili dalle varie cartucce
di generazione 100% (es. modello del mapping RDB, ... modello di una
interfaccia di servizio, ...)

<b>Attenzione</b>: Questa opzione &egrave; da considerarsi una possibilit&agrave; <b>avanzata</b> 
da utilizzarsi con cautela.
		 */
		extraModels: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.ExecCommand_extraMethods) ENABLED START*/
	,
	/**
	 * url da richiamare
	 * 
	 * @type {String}
	 */
	methodUrl : null,
	/**
	 * id della form in cui si trova il wodget
	 * 
	 * @type {String}
	 */
	idForm : null,
	/**
	 * 
	 * @cfg {Boolean} isOnRefreshCommand
	 * se impostato a true allora vuol dire che sto facendo
	 * un refresh command del content panel
	 * in questo caso non devo lanciare il nopCommand
	 * @default 'false'
	 */
	isOnRefreshCommand: false,
	/**
	 * @method richiama il metodo specificato
	 */
	doCommand : function() {
		var url = this.methodUrl;
		var form = Ext.getCmp(this.idForm);
		if(!form){
			var params = Ext.apply(this.baseFormParams);
			var req = new ExtCsi.app.ExecAjaxRequest({
				url : url,
				params : params,
				results : this.results,
				isOnRefreshCommand: this.isOnRefreshCommand
			});
			req.init();
		}
		else if (this.skipValidation || (!this.skipValidation && form.getForm().isValid())) {
			var params = Ext.apply(form.getForm().getValues(false),
						this.baseFormParams);
			/*per il momento non implementiamo l'uploadFile
			if(form.getForm().fileUpload){
				form.getForm().submit({
	                    url: url,
	                    waitMsg: 'Uploading file attendere...',
	                    params: params,
	                    success: function(form, action){
	                        msg('Success', 'Salvataggio effettuato con successo');
	                    },failure: function(form, action) {
					        switch (action.failureType) {
					            case Ext.form.Action.CLIENT_INVALID:
					                Ext.Msg.alert('Failure', 'Form fields may not be submitted with invalid values');
					                break;
					            case Ext.form.Action.CONNECT_FAILURE:
					                Ext.Msg.alert('Failure', 'Ajax communication failed');
					                break;
					            case Ext.form.Action.SERVER_INVALID:
					               Ext.Msg.alert('Failure', action.result.msg);
					       }
					    }
	                });
			}else{*/
				var req = new ExtCsi.app.ExecAjaxRequest({
							url : url,
							params : params,
							storeData : this.storeData,
							results : this.results,
							isOnRefreshCommand: this.isOnRefreshCommand
						});
				req.init();
			//}
		}
	},
	/**
	 * setta il parametro onRefreshCommand
	 * @param {Boolean} v
	 */
	setOnRefreshCommand: function(v){
		this.isOnRefreshCommand = v;
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class EventHandler


/**
 * @class ExtCsi.ui.event.EventHandler
 * @extends Object
 * @constructor
 * Gestore di un evento di User Interaction.
 */
ExtCsi.ui.event.EventHandler = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.event.EventHandler, Object,
	{
			
		/**
		 * @cfg (String from enumeration ExtCsi.ui.event.EventTypes) eventType Specifica il tipo di evento per cui &egrave; definito questo event handler.
		 */
		 eventType: null,
		/**
		 * @cfg (Boolean) skipValidation Se impostato a true non saranno eseguite le logiche automatiche di conversione/validazione
a fronte dell'occorrenza dell'evento specificato.
Serve per gestire casi in cui la non conformit&agrave; dei dati immessi non
&egrave; importante, anzi deve essere ignorata (es. il tasto "indietro" o "annulla").
		 */
		 skipValidation: null,
		/**
		 * @cfg (String from enumeration ExtCsi.ui.event.MethodProtectionTypes) methodProtection Permette di proteggere l'esecuzione del metodo associato all'<b>EventHandler</b>
da effetti indesiderati derivanti dal'eventuale esecuzione contemporanea di altri metodi.
Le possibili protezioni sono:
<ol>
<li><b>allowAll</b>: permette l'esecuzione contemporanea di qualsiasi metodo (nessuna 
protezione)</li>
<li><b>rejectSame</b> (<i>default</i>): evita l'esecuzione contemporanea di altre istanze dello stesso 
metodo (protezione tipica del doppio click su uno stesso pulsante)</li>
<li><b>rejectAll</b>: evita l'esecuzione contemporanea di altre istanze di qualsiasi 
metodo (protezione cautelativa globale)</li>
</ol>
		 */
		 methodProtection: null,
			
		/**
		 * @cfg (ExtCsi.cmd.Command) command A fronte dell'evento specificato in <i>eventType</i> sar&agrave; eseguito
il comando specificato in questo elemento.
		 */
		command: null			
	/*PROTECTED REGION ID(ExtCsi.ui.event.EventHandler_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class CommandOnWidgets


/**
 * @class ExtCsi.cmd.CommandOnWidgets
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Classe astratta da cui discendono i comandi che agiscono su un elenco di widget
 */
ExtCsi.cmd.CommandOnWidgets = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.CommandOnWidgets, ExtCsi.cmd.Command,
	{

			
		/**
		 * @cfg (ExtCsi.ui.widgets.Widget) targetWidgets I widget su cui opera il comando.
		 */
		targetWidgets: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.CommandOnWidgets_extraMethods) ENABLED START*/
	,
	/**
	 * @method no operation
	 */
	doCommand : function() {
		return null;
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class DialogPanel


/**
 * @class ExtCsi.ui.panels.DialogPanel
 * @extends ExtCsi.ui.panels.Panel
 * @constructor
 * Pagina utilizzabile per messaggi di feedback/conferme etc.
 */
ExtCsi.ui.panels.DialogPanel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.panels.DialogPanel, ExtCsi.ui.panels.Panel,
	{

			
		/**
		 * @cfg (ExtCsi.ui.panels.CommandPanel) commands I pulsanti associati al dialog.
		 */
		commands: null,
		/**
		 * @cfg (ExtCsi.ui.panels.MsgBoxPanel) msgBoxes I messaggi di feedback da visualizzare devono essere inseriti in uno o più
<b>MessageBoxPanel</b>.
		 */
		msgBoxes: null			
	/*PROTECTED REGION ID(ExtCsi.ui.panels.DialogPanel_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ShowDialogCommand


/**
 * @class ExtCsi.cmd.ShowDialogCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Attiva un <b>DialogPanel</b>
 */
ExtCsi.cmd.ShowDialogCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.ShowDialogCommand, ExtCsi.cmd.Command,
	{

			
		/**
		 * @cfg (ExtCsi.ui.panels.DialogPanel) dialog Il dialog da attivare.
		 */
		dialog: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.ShowDialogCommand_extraMethods) ENABLED START*/
	,
	/**
	 * @method no operation
	 */
	doCommand : function() {
		var cp = globalRegistry.getRegisteredObject(ExtCsi.Const.CURRENT_CP_NAME);
		if(cp && cp.dialogs && cp.dialogs.length > 0){
			var struct = new ExtCsi.ui.layout.WriteStructure({
				menubar: globalRegistry.getRegisteredObject(ExtCsi.Const.MENUBAR_STRUCTURE),
				contentPanel: cp
			});
			struct.initDialogPanel(this.dialog);
		}
		
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class CommandOutcome


/**
 * @class ExtCsi.cmd.CommandOutcome
 * @extends Object
 * @constructor
 * Possibile esito di un <b>ExecCommand</b>.
 */
ExtCsi.cmd.CommandOutcome = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.CommandOutcome, Object,
	{
			
		/**
		 * @cfg (String) resultCode Codice identificativo dell'esito. Deve essere univoco all'interno del content panel
e deve essere un identificativo valido secondo java.
		 */
		 resultCode: null,
			
		/**
		 * @cfg (ExtCsi.cmd.Command) command Il comando che viene eseguito nel caso in cui questo <b>CommandOutcome</b>
sia quello prescelto nella logica dell'<b>ExecCommand</b>.
		 */
		command: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.CommandOutcome_extraMethods) ENABLED START*/
	,
	/**
	 * @cfg {Boolean} storeData impostare a true se si vogliono caricare i dati nel
	 * widget dopo il command
	 * @type Boolean
	 * @default false
	 */
	storeData : false,
	/**
	 * @method esegue il comando associato all'outcome
	 */
	doCommand : function() {
		return command.doCommand();
	},
	/**
	 * setta la variabile storeData
	 * @param {Boolean} v
	 */
	setStoreData : function(v){
		this.storeData = v;
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class CommandOnPanels


/**
 * @class ExtCsi.cmd.CommandOnPanels
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Classe astratta da cui discendono i comandi che agiscono su un elenco di pannelli
 */
ExtCsi.cmd.CommandOnPanels = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.CommandOnPanels, ExtCsi.cmd.Command,
	{

			
		/**
		 * @cfg (ExtCsi.ui.panels.Panel) targetPanels Ii pannelli su cui agisce il comando.
		 */
		targetPanels: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.CommandOnPanels_extraMethods) ENABLED START*/
	,
	/**
	 * @method no operation
	 */
	doCommand : function() {
		return null;
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class AppWindow


/**
 * @class ExtCsi.app.AppWindow
 * @extends Object
 * @constructor
 * Finestra applicativa comprendente le parti comuni a tutte le schermate e la
parte variabile.
 */
ExtCsi.app.AppWindow = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.app.AppWindow, Object,
	{

			
		/**
		 * @cfg (Object) footer Footer del portale. Comune a tutte le schermate.
		 */
		footer: null,
		/**
		 * @cfg (Object) header Header del portale. Comune a tutte le schermate.
		 */
		header: null,
		/**
		 * @cfg (ExtCsi.app.ApplicationArea) appArea Porzione di finestra dipendente dall'applicazione
		 */
		appArea: null			
	/*PROTECTED REGION ID(ExtCsi.app.AppWindow_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class SequenceCommand


/**
 * @class ExtCsi.cmd.SequenceCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Permette di eseguire in sequenza i comandi specificati. I codice di ritorno 
del comando &egrave; il codice dell'ultimo dei comandi.
 */
ExtCsi.cmd.SequenceCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.SequenceCommand, ExtCsi.cmd.Command,
	{

			
		/**
		 * @cfg (ExtCsi.cmd.Command) commands Gli elementi della sequenza di comandi.
		 */
		commands: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.SequenceCommand_extraMethods) ENABLED START*/
	,
	doCommand : function() {
		var i = 0;
		var lastRetval = null;
		for (i = 0; i < this.commands.length; i++) {
			var currCmd = this.commands[i];
			lastRetval = currCmd.doCommand();
		}
		return lastRetval;
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class JumpBackCommand


/**
 * @class ExtCsi.cmd.JumpBackCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Permette di ritornare alla schemata precedente. Da utilizzarsi in congiunzione con 
<b>JumpCommand</b> e <i>pushCurrentPage</i>.
 */
ExtCsi.cmd.JumpBackCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.JumpBackCommand, ExtCsi.cmd.Command,
	{

	
	/*PROTECTED REGION ID(ExtCsi.cmd.JumpBackCommand_extraMethods) ENABLED START*/
	/**
	 * @method no operation
	 */
	doCommand : function() {
		return null;
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ApplicationData


/**
 * @class ExtCsi.mdl.data.ApplicationData
 * @extends Object
 * @constructor
 * Rappresenta l'astrazione di una variabile applicativa.
 */
ExtCsi.mdl.data.ApplicationData = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.mdl.data.ApplicationData, Object,
	{
			
		/**
		 * @cfg (String) name nome simbolico. Deve essere univoco all'interno dell'applicazione e deve 
essere un codice valido secondo java.
		 */
		 name: null,
		/**
		 * @cfg (String from enumeration ExtCsi.mdl.data.DataLifetimeType) lifetimeExtent specifica la persistenza del valore impostato nell'application data.
		 */
		 lifetimeExtent: null,
			
		/**
		 * @cfg (ExtCsi.mdl.types.Type) type Il tipo del valore contenuto nell'application data
		 */
		type: null			
	/*PROTECTED REGION ID(ExtCsi.mdl.data.ApplicationData_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class AppDataBinding


/**
 * @class ExtCsi.mdl.data.AppDataBinding
 * @extends Object
 * @constructor
 * Collegamento con un application data o con una parte di esso.
 */
ExtCsi.mdl.data.AppDataBinding = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.mdl.data.AppDataBinding, Object,
	{
			
		/**
		 * @cfg (String) path Se specificato fain modo che il binding non sia sul valore dell'application data, ma
su uno specifico field del record.
Ad esempio se un application data "titolare" ha come tipo un <b>ComplexType</b>
di nome <i>Persona</i>, con un campo <i>nome</i>, &egrave; possibile
associare un textfield a tale campo impostando nell'<b>AppDataBinding</b>:
<ul>
<li>l'elemento <i>appData</i> in modo che punti all'application data "titolare"</li>
<li>l'elemento <i>path</i> in modo che valga "nome"</li>
</ul>
E'ovviamente possibile utilizzare <i>path</i> pi&ugrave; complessi
(es. "persona.indirizzo.numCivico").
		 */
		 path: null,
			
		/**
		 * @cfg (ExtCsi.mdl.data.ApplicationData) appData L'application data collegato
		 */
		appData: null			
	/*PROTECTED REGION ID(ExtCsi.mdl.data.AppDataBinding_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class MultiDataWidget


/**
 * @class ExtCsi.ui.widgets.MultiDataWidget
 * @extends ExtCsi.ui.widgets.Widget
 * @constructor
 * Classe astratta dalla quale discendono tutte le classi che rappresentano
widget associabili a collezioni. Un <b>MultiDataWidget</b>
ha un concetto di <i>collezione</i> del widget che rappresenta l'insieme 
finito di possibili valori selezionabili.
 */
ExtCsi.ui.widgets.MultiDataWidget = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.MultiDataWidget, ExtCsi.ui.widgets.Widget,
	{

			
		/**
		 * @cfg (ExtCsi.mdl.data.AppDataBinding) multiDataBinding Il binding all'<b>ApplicationData</b> nel quale sono contenuti gli elementi dell'insieme
di possibili valori. Il tipo dell'oggetto puntato deve essere un <b>TypedArray</b> e 
il <i>componentType</i> di questo <b>TypedArray</b> deve essere un <b>ComplexType</b>, poich&egrave;
 &egrave; necessario poter specificare il valore selezionato e la label descrittiva di tale valore (perci&ograve; servono almeno due field).
		 */
		multiDataBinding: null			
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.MultiDataWidget_extraMethods) ENABLED START*/
		,renderExtComponent : function(el, its, formId) {
			alert('Il widget MultiDataWidget non è stato ancora implementato');	
		}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Typedefs


/**
 * @class ExtCsi.mdl.types.Typedefs
 * @extends Object
 * @constructor
 * Insieme dei tipi definiti nell'applicazione
 */
ExtCsi.mdl.types.Typedefs = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.mdl.types.Typedefs, Object,
	{

			
		/**
		 * @cfg (ExtCsi.mdl.types.Type) types DEPRECATO: utilizzare tipi definiti in <b>TypeNamespace</b> esterni
e referenziati in <i>extNamespaces</i>.
		 */
		types: null,
		/**
		 * @cfg (ExtCsi.mdl.types.TypeNamespace) namespaces DEPRECATO: utilizzare <i>extNamespaces</i>.
		 */
		namespaces: null,
		/**
		 * @cfg (ExtCsi.mdl.types.TypeNamespace) extNamespaces Riferimento ai <b>TypeNamespace</b> utilizzati nell'applicazione.
		 */
		extNamespaces: null			
	/*PROTECTED REGION ID(ExtCsi.mdl.types.Typedefs_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Type


/**
 * @class ExtCsi.mdl.types.Type
 * @extends Object
 * @constructor
 * Classe astratta dalla quale discendono tutti i tipi.
 */
ExtCsi.mdl.types.Type = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.mdl.types.Type, Object,
	{
			
		/**
		 * @cfg (String) name Nome identificativo del tipo.

		 */
		 name: null
	
	/*PROTECTED REGION ID(ExtCsi.mdl.types.Type_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class SimpleType


/**
 * @class ExtCsi.mdl.types.SimpleType
 * @extends ExtCsi.mdl.types.Type
 * @constructor
 * Tipo base (semplice).
 */
ExtCsi.mdl.types.SimpleType = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.mdl.types.SimpleType, ExtCsi.mdl.types.Type,
	{
			
		/**
		 * @cfg (String from enumeration ExtCsi.mdl.types.SimpleTypeCodes) code Codice che serve per discriminare il tipo base (scalare) specifico.
Se &egrave; impostato <i>userDefined</i> a false allora il tipo
corrisponde ad un tipo base del linguaggio host (es int, java.lang.Double).
Se invece <i>userDefined</i> &egrave; impostato a true, viene generato
un nuovo tipo di dato astratto basato sul tipo scalare corrispondente e 
nel quale &egrave; possibile specificare meglio il dominio di valori ammessi e
alcune caratteristiche di formattazione.

		 */
		 code: null,
		/**
		 * @cfg (Boolean) nillable Se impostato a true, il tipo ammette il vlaore <i>null</i> nel suo dominio.
		 */
		 nillable: null,
		/**
		 * @cfg (Boolean) userDefined Se impostato a true viene generata una classe che rappresenta il tipo di dato
e everr&agrave; utilizzata questa classe al posto del tipo scalare corrispondente,
che sar&agrave; utilizzato come contenitore del dato internamente alla classe.
		 */
		 userDefined: null,
		/**
		 * @cfg (String) dataTypeModifiers Utilizzato solo se <i>userDefined</i> = true.
Permette di specificare il tipo di dato, in termini di restrizioni sul dominio
di valori ammessi, opzioni di formattazione etc.

[[TODO: documentare sintassi ]]
		 */
		 dataTypeModifiers: null,
		/**
		 * @cfg (String) editHintMsg Utilizzato solo se <i>userDefined</i> == true.
Permette di specificare il messaggio che deve essere utilizzato per descrivere
il range di valori ammessi. Può essere utilizzato, a seconda delle cartucce di 
generazione, come tooltip oppure come messaggio di errore in caso di 
immissione di un valore scorretto.
		 */
		 editHintMsg: null
	
	/*PROTECTED REGION ID(ExtCsi.mdl.types.SimpleType_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ComplexType


/**
 * @class ExtCsi.mdl.types.ComplexType
 * @extends ExtCsi.mdl.types.Type
 * @constructor
 * Struttura dati definita da utente. 
Nel caso di questa sottoclasse di <b>Type</b> l'attributo <i>name</i>
deve essere un identificativo valido per java.
 */
ExtCsi.mdl.types.ComplexType = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.mdl.types.ComplexType, ExtCsi.mdl.types.Type,
	{
			
		/**
		 * @cfg (Boolean) initFields Se impostato a true, i field di tipo complex sono inizializzati
(con struttura vuota al momento dell'istaziazione di oggetti di questo tipo).
Es. Se un tipo "Persona" contiene un field "residenza" di tipo "Indirizzo" e <i>initFields</i>
 &egrave; impostato a true, allora il field "residenza" viene impostato con
un'oggetto di tipo "Indirizzo".
		 */
		 initFields: null,
			
		/**
		 * @cfg (ExtCsi.mdl.types.Field) fields Insieme dei campi di cui &egrave; costituita la struttura dati.
		 */
		fields: null,
		/**
		 * @cfg (ExtCsi.mdl.types.ComplexType) extends 
		 */
		extendType: null			
	/*PROTECTED REGION ID(ExtCsi.mdl.types.ComplexType_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class TypedArray


/**
 * @class ExtCsi.mdl.types.TypedArray
 * @extends ExtCsi.mdl.types.Type
 * @constructor
 * Array tipato. Il nome impostato &egrave; solo mnemonico.
 */
ExtCsi.mdl.types.TypedArray = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.mdl.types.TypedArray, ExtCsi.mdl.types.Type,
	{

			
		/**
		 * @cfg (ExtCsi.mdl.types.Type) componentType Tipo degli elementi di cui sar&agrave; costituito l'array.
		 */
		componentType: null			
	/*PROTECTED REGION ID(ExtCsi.mdl.types.TypedArray_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Field


/**
 * @class ExtCsi.mdl.types.Field
 * @extends Object
 * @constructor
 * Il campo di un <b>ComplexType</b>.
 */
ExtCsi.mdl.types.Field = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.mdl.types.Field, Object,
	{
			
		/**
		 * @cfg (String) name nome del campo. deve essere un identificativo valido per Java.
		 */
		 name: null,
		/**
		 * @cfg (Boolean) required Se impostato a true il campo sarà considerato obbligatorio.
		 */
		 required: null,
		/**
		 * @cfg (String) dataTypeModifier Tutti i controlli modellabili mediante l'attributo dataTypeModifier del widget devono avere formato
[validatore]:[regole].

Per i dettagli circa i possibili vlaidatori utilizzabili si rimanda al seguente
<a href="http://jiradsp.csi.it:8081/secure/attachment/17012/modellazione_validatori_v2.doc">documento.</a>
		 */
		 dataTypeModifier: null,
			
		/**
		 * @cfg (ExtCsi.mdl.types.Type) type tipo del campo.
		 */
		type: null			
	/*PROTECTED REGION ID(ExtCsi.mdl.types.Field_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ApplicationDataDefs


/**
 * @class ExtCsi.mdl.data.ApplicationDataDefs
 * @extends Object
 * @constructor
 * Insieme delle definizioni di application data utilizzati nell'applicativo
 */
ExtCsi.mdl.data.ApplicationDataDefs = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.mdl.data.ApplicationDataDefs, Object,
	{

			
		/**
		 * @cfg (ExtCsi.mdl.data.ApplicationData) appData DEPRECATO: utilizzare application data definiti all'interno di <b>AppDataGroup</b>
mantenuti esternamente e referenziati in <i>extGroups</i>
		 */
		appData: null,
		/**
		 * @cfg (ExtCsi.mdl.data.AppDataGroup) groups DEPRECATO: utilizzare <i>extGroups</i>
		 */
		groups: null,
		/**
		 * @cfg (ExtCsi.mdl.data.AppDataGroup) extGroups referenzia gli <b>AppDataGroup</b> definiti esternamente e utilizzati nell'applicazione.
		 */
		extGroups: null			
	/*PROTECTED REGION ID(ExtCsi.mdl.data.ApplicationDataDefs_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class TreeView


/**
 * @class ExtCsi.ui.widgets.TreeView
 * @extends ExtCsi.ui.widgets.DataWidget
 * @constructor
 * Widget che permette di visualizzare una struttura ad albero.
La struttura dati deve essere mantenuta in un application data di tipo TreeNode.

 */
ExtCsi.ui.widgets.TreeView = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.TreeView, ExtCsi.ui.widgets.DataWidget,
	{

			
		/**
		 * @cfg (ExtCsi.mdl.data.AppDataBinding) multiDataBinding Il binding all'<b>ApplicationData</b> nel quale sono contenuti gli elementi dell'insieme
di possibili valori. Il tipo dell'oggetto puntato deve essere un <b>TypedArray</b> e 
il <i>componentType</i> di questo <b>TypedArray</b> deve essere un <b>ComplexType</b>, poich&egrave;
 &egrave; necessario poter specificare il valore selezionato e la label descrittiva di tale valore (perci&ograve; servono almeno due field).
		 */
		multiDataBinding: null			
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.TreeView_extraMethods) ENABLED START*/
	,
	/**
	 * @cfg (Object/String) renderTo id oppure oggetto nel dom su cui la tabella si
	 *      attacca
	 * 
	 */
	renderTo : null,
	/**
	 * @cfg (Boolean) autoLoad, se impostato a true allora la tabella non è legata
	 *      alla generazione mdd e sarà generata nel container specificato
	 */
	autoLoad : false,
	/**
	 * crea il componente Extjs corrispondente al tree
	 * 
	 * @param {Object}
	 *            el
	 * @param {Array}
	 *            its
	*/
	renderExtComponent : function(el, its, formId) {
		/*
		 * per sapere se il tree è sincrono o asincrono 
		 * controllo la presenza di un eventhandler di tipo node_expand
		 */
		var asyncronous = false;
		if (this.eventHandlers) {
			for (var i = 0; i < this.eventHandlers.length; i++) {
				var event = this.eventHandlers[i];
				if(event.eventType == ExtCsi.ui.event.EventTypes().NODE_EXPANDED){
					asyncronous = true;
					break;
				}
			}
		}
	    
		var treeLoader = new Ext.tree.TreeLoader({
			directFn: function(poNode,pfCallback) {
		       	if (pfCallback) {
					pfCallback([],{status: true, scope: this, argument: { callback: pfCallback, node: poNode }});
		           }
			},
			dataUrl : this.dataUrl,
			listeners : {
				beforeload : function(treeLoader, node, callback) {
					var uid = node.attributes.uniqueid;
					// this.baseParams.selectednode = uid;
					this.baseParams = {
						'appDataTreeStatus.node' : node.id,
						'appDataTreeStatus.selectednode' : uid
					}
				}
			},
			loadexception : Ext.util.Format.messaggiErroreTree
				// ***gestisco le eccezioni server side
				// nodeParameter: 'appDataTreeStatus.node',
				// baseParams:
				// {'appDataTreeStatus.selectednode':'extjs'}	
		});
		
		var tree = new Ext.tree.TreePanel({
			useArrows : true,
			id : this.name,
			animate : true,
			disabled: !this.defaultEnabled,
			hidden: !this.defaultVisible,
			containerScroll : true,
			autoScroll : true,
			border : false,
			loader : treeLoader,
			singleExpand: asyncronous,
			plugins: new Ext.ux.tree.State(), 
			root : {
				nodeType : 'async',
				text : 'ROOT',
				draggable : false,
				id : 'src'
			},
			rootVisible : false,
			eventHandlers : this.eventHandlers,
			listeners : {
				click : function(n, e) {
					if (n.isLeaf()) {
						if (this.eventHandlers) {
							// ***prima di eseguire gli handlers
							// imposto nella form come
							// ***parametro l'id del nodo
							// selezionato

							for (var i = 0; i < this.eventHandlers.length; i++) {
								var event = this.eventHandlers[i];
								if(event.eventType == ExtCsi.ui.event.EventTypes().CLICKED){
									var command = event.command;
									command.setFormId(formId);
									command.setBaseFormParams({
										'appDataTreeStatus.selectednode' : n.attributes.uniqueid
									});
									if (command) {
										command.doCommand();
									}
									break;
								}
							}
						}
					}
				},
				beforeload : function(node){
					if(node.id != 'src'){
						if (this.eventHandlers) {
							for (var i = 0; i < this.eventHandlers.length; i++) {
								var event = this.eventHandlers[i];
								if(event.eventType == ExtCsi.ui.event.EventTypes().NODE_EXPANDED){
									//***registro il nodo selezionato per prenderlo sul refresh del widget
									globalRegistry.clearRegisteredObjects(ExtCsi.Const.SELECTED_TREE_NODE);
									globalRegistry.registerObject(ExtCsi.Const.SELECTED_TREE_NODE, node);
									node.getOwnerTree().getLoader().directFn = function(poNode,pfCallback) {
							        	if (pfCallback) {
											pfCallback([],{status: true, scope: this, argument: { callback: pfCallback, node: poNode }});
							            }
									}
									var command = event.command;
									command.setFormId(formId);
									command.setBaseFormParams({
										'appDataTreeStatus.node' : node.id,
										'appDataTreeStatus.selectednode' : node.attributes.uniqueid
									});
									if (command) {
										command.doCommand();
									}
									break;
								}
							}
						}
					}
				}
			}
		});
		var nomeTree = this.name;
		MessageBus.on('init', function(){
			var tree = Ext.getCmp(nomeTree);
			tree.getLoader().directFn = null;
			tree.root.reload();      
		});
		
		its.push(tree);

	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class PlainText


/**
 * @class ExtCsi.ui.widgets.PlainText
 * @extends ExtCsi.ui.widgets.DataWidget
 * @constructor
 * Permette la visualizzazione di testo, fisso o proveniente da application data, senza possibilità di editing.
 */
ExtCsi.ui.widgets.PlainText = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.PlainText, ExtCsi.ui.widgets.DataWidget,
	{
			
		/**
		 * @cfg (String) staticText Se impostato il widget visualizzer&agrave; il testo html specificato a fianco alla label.
In caso contrario, e se sar&agrave; specificato un data binding, il
valore visualizzato sar&agrave; preso dall'application data referenziato.
		 */
		 staticText: null
	
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.PlainText_extraMethods) ENABLED START*/
	,
	/**
	 * crea il componente Extjs che corrisponte al plaintext
	 * 
	 * @param {Object}
	 *            el
	 * @param {Array}
	 *            its
	 */
	renderExtComponent : function(el, its, formId) {
		var displayfield = {
			xtype : 'displayfield',
			id : this.name,
			name : this.name,
			fieldLabel : this.label,
			disabled: !this.defaultEnabled,
			hidden: !this.defaultVisible,
			value : this.staticText,
			helpText : this.tooltip,
			databinding : this.databinding
		};
		if (el.layout instanceof ExtCsi.ui.layout.HorizontalFlowPanelLayout
				|| el.layout instanceof ExtCsi.ui.layout.UDLRCPanelLayout
				|| (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
						&& el.layout.columns && el.layout.columns > 1)) {
			var cf = [];
			cf.push(displayfield);
			var colW = null;
			if (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
					&& el.layout.columns && el.layout.columns > 1) {
				colW = 1 / el.layout.columns;
			}

			its.push({
						columnWidth : colW,
						border : false,
						style : 'padding:5px 5px 0',
						layout : 'form',
						items : cf
					});
		} else {
			its.push(displayfield);
		}
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class MenuView


/**
 * @class ExtCsi.ui.widgets.MenuView
 * @extends ExtCsi.ui.widgets.CommandWidget
 * @constructor
 * Permette di visualizzare la struttura di menu definita nella <b>MenuBar</b>.
Deve essere inserito in un <b>MenuPanel</b>.
 */
ExtCsi.ui.widgets.MenuView = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.MenuView, ExtCsi.ui.widgets.CommandWidget,
	{

	
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.MenuView_extraMethods) ENABLED START*/
		renderExtComponent : function(el, its, formId) {
			alert('Il widget MenuView non è stato ancora implementato');	
		}
/*PROTECTED REGION END*/
	}
);



/// dichiarazione class GridPanelLayout


/**
 * @class ExtCsi.ui.layout.GridPanelLayout
 * @extends ExtCsi.ui.layout.PanelLayout
 * @constructor
 * Layout a griglia.
I widget vengono inseriti in una griglia delle dimensioni specificate da <b>columns</b> e <b>rows</b>.
Ogni cella contiene un widget e la corrispondente label, se specificata.
Per specificare la posizione nella griglia di un widget occorre utilizzare il <b>GridWidgetLayoutSpec</b> 
per ogni widget contenuto nel pannello che ha questo layout.
 */
ExtCsi.ui.layout.GridPanelLayout = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.layout.GridPanelLayout, ExtCsi.ui.layout.PanelLayout,
	{
			
		/**
		 * @cfg (Integer) columns Dimensione orizzontale della griglia
		 */
		 columns: null,
		/**
		 * @cfg (Integer) rows Dimensione verticale della griglia.
		 */
		 rows: null
	
	/*PROTECTED REGION ID(ExtCsi.ui.layout.GridPanelLayout_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class GridWidgetLayoutSpec


/**
 * @class ExtCsi.ui.layout.GridWidgetLayoutSpec
 * @extends ExtCsi.ui.layout.WidgetLayoutSpecifier
 * @constructor
 * Specifica di posizionamento di widget in un layout a griglia
 */
ExtCsi.ui.layout.GridWidgetLayoutSpec = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.layout.GridWidgetLayoutSpec, ExtCsi.ui.layout.WidgetLayoutSpecifier,
	{
			
		/**
		 * @cfg (Integer) row Riga in cui deve essere posizionato il Widget (prima riga = 1)
		 */
		 row: null,
		/**
		 * @cfg (Integer) column Colonna in cui deve essere posizionato il Widget (prima colonna = 1)
		 */
		 column: null,
		/**
		 * @cfg (Integer) hspan Numero di colonne di occupazione del widget. 
Se non specificato si assume l'occupazione di una colonna.
Il widget occuper&agrave; le colonne da <b>column</b> a <b>column+hspan</b> comprese.
		 */
		 hspan: null,
		/**
		 * @cfg (Integer) vspan Numero di righe di occupazione del widget. 
Se non specificato si assume l'occupazione di una riga.
Il widget occuper&agrave; le righe da <b>row</b> a <b>row+vspan</b> comprese.
		 */
		 vspan: null
	
	/*PROTECTED REGION ID(ExtCsi.ui.layout.GridWidgetLayoutSpec_extraMethods) ENABLED START*/
			/*PROTECTED REGION END*/
	}
);



/// dichiarazione class CommandPanel


/**
 * @class ExtCsi.ui.panels.CommandPanel
 * @extends ExtCsi.ui.panels.Panel
 * @constructor
 * Pannello destinato a contenere esclusivamente widget di comando (es. pulsanti).

 */
ExtCsi.ui.panels.CommandPanel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.panels.CommandPanel, ExtCsi.ui.panels.Panel,
	{
			
		/**
		 * @cfg (String from enumeration ExtCsi.null.CommandStyles) cmdStyle Permette di differenziare stilisticamente (ove previsto dai pattern di portale)
tra pulsanti ad uso "funzionale" e pulsanti ad uso "navigazione".
		 */
		 cmdStyle: null,
			
		/**
		 * @cfg (ExtCsi.ui.widgets.Widget) widgets Ristretto a commandWidgets.
		 */
		widgets: null			
	/*PROTECTED REGION ID(ExtCsi.ui.panels.CommandPanel_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class MenuPanel


/**
 * @class ExtCsi.ui.panels.MenuPanel
 * @extends ExtCsi.ui.panels.Panel
 * @constructor
 * Pannello destinato a contenere una <b>MenuView</b>.
 */
ExtCsi.ui.panels.MenuPanel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.panels.MenuPanel, ExtCsi.ui.panels.Panel,
	{

			
		/**
		 * @cfg (ExtCsi.ui.widgets.Widget) widgets I widget inseribili in questo tipo di pannello sono solo:
<ul>
<li>TreeView</li>
<li>MenuView</li>
<li>UserDefinedWidget</li>
</ul>
		 */
		widgets: null			
	/*PROTECTED REGION ID(ExtCsi.ui.panels.MenuPanel_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class UserDefinedWidget


/**
 * @class ExtCsi.ui.widgets.UserDefinedWidget
 * @extends ExtCsi.ui.widgets.Widget
 * @constructor
 * Permette di inserire un frammento di codice definito manualmente.
Nella cartuccia di generazioen "struts2" questo corrisponde ad un frammento JSP.
 */
ExtCsi.ui.widgets.UserDefinedWidget = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.UserDefinedWidget, ExtCsi.ui.widgets.Widget,
	{

	
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.UserDefinedWidget_extraMethods) ENABLED START*/
		renderExtComponent : function(el, its, formId) {
			alert('Il widget UserDefinedWidget non è stato ancora implementato');	
		}
/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ActivateMultiPanelItemCommand


/**
 * @class ExtCsi.cmd.ActivateMultiPanelItemCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Permette di visualizzare uno degli item di un <b>MultiPanel</b> 
(o di una delle sue sottoclassi <b>TabSetPanel</b> o <b>WizardPanel</b>).
 */
ExtCsi.cmd.ActivateMultiPanelItemCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.ActivateMultiPanelItemCommand, ExtCsi.cmd.Command,
	{

			
		/**
		 * @cfg (ExtCsi.ui.panels.MultiPanel) multipanel Il multipanel del quale si desidera cambiare l'item visualizzato.
		 */
		multipanel: null,
		/**
		 * @cfg (ExtCsi.ui.panels.Panel) activeItem L'item da visualizzare. Se impostato a "null" non verr&agrave; visualizzato nessun pannello
(vale solo per il <b>MultiPanel</b>).
		 */
		activeItem: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.ActivateMultiPanelItemCommand_extraMethods) ENABLED START*/
	,
	/**
	 * @method no operation
	 */
	doCommand : function() {
		var mp = Ext.getCmp(this.multipanel)
		var activeItem = this.activeItem;
		if(mp){
			Ext.each(mp.items.items, function(itm) {
				if(!activeItem){
					itm.hide();
				}else{
					if(activeItem == itm.id){
						itm.show();
					}else{
						itm.hide();
					}
				}
			});
		}
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class AutenticationMethod


/**
 * @class ExtCsi.security.AutenticationMethod
 * @extends Object
 * @constructor
 * Superclasse di tutti i possibili meccanismi di autenticazione.
 */
ExtCsi.security.AutenticationMethod = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.security.AutenticationMethod, Object,
	{

	
	/*PROTECTED REGION ID(ExtCsi.security.AutenticationMethod_extraMethods) ENABLED START*/
/*PROTECTED REGION END*/
	}
);



/// dichiarazione class UISecurityConstraint


/**
 * @class ExtCsi.security.UISecurityConstraint
 * @extends Object
 * @constructor
 * Superclasse di tutti i security constraints applicabili a widget e menu.
 */
ExtCsi.security.UISecurityConstraint = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.security.UISecurityConstraint, Object,
	{
			
		/**
		 * @cfg (Boolean) visible in alternativa a <i>enabled</i>. Se impostato a true il comportamento condizionato sar&agrave; la visibilit&agrave;
		 */
		 visible: null,
		/**
		 * @cfg (Boolean) enabled in alternativa a <i>visible</i>. Se impostato a true il comportamento condizionato sar&agrave; l'abilitazione.
		 */
		 enabled: null
	
	/*PROTECTED REGION ID(ExtCsi.security.UISecurityConstraint_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class UCBasedSecurityConstraint


/**
 * @class ExtCsi.security.UCBasedSecurityConstraint
 * @extends ExtCsi.security.UISecurityConstraint
 * @constructor
 * Security constraint basato sull'abilitazione dell'utente corrente ad un particolare UseCase
 */
ExtCsi.security.UCBasedSecurityConstraint = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.security.UCBasedSecurityConstraint, ExtCsi.security.UISecurityConstraint,
	{

			
		/**
		 * @cfg (ExtCsi.security.UseCase) useCase Lo UseCase di riferimento
		 */
		useCase: null			
	/*PROTECTED REGION ID(ExtCsi.security.UCBasedSecurityConstraint_extraMethods) ENABLED START*/
			/*PROTECTED REGION END*/
	}
);



/// dichiarazione class SecurityModel


/**
 * @class ExtCsi.security.SecurityModel
 * @extends Object
 * @constructor
 * Caratteristiche di sicurezza dell'applicazione
 */
ExtCsi.security.SecurityModel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.security.SecurityModel, Object,
	{
			
		/**
		 * @cfg (String) securityAppID Codice identificativo dell'applicazione, come censito in IRIDE2
		 */
		 securityAppID: null,
			
		/**
		 * @cfg (ExtCsi.security.AutenticationMethod) autenticationMethod Specifica la modalit&agrave; di autenticazione prevista per l'applicazione
		 */
		autenticationMethod: null,
		/**
		 * @cfg (ExtCsi.security.Actor) actors Elenco degli <b>Actor</b> dell'applicazione (secondo la terminologia di IRIDE2)
		 */
		actors: null,
		/**
		 * @cfg (ExtCsi.security.UseCase) useCases Elenco degli <b>UseCase</b> dell'applicazione (secondo la terminologia di IRIDE2)
		 */
		useCases: null,
		/**
		 * @cfg (ExtCsi.security.Role) roles Elenco dei <b>Role</b> dell'applicazione (secondo la terminologia di IRIDE2)
		 */
		roles: null			
	/*PROTECTED REGION ID(ExtCsi.security.SecurityModel_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Actor


/**
 * @class ExtCsi.security.Actor
 * @extends Object
 * @constructor
 * Actor IRIDE2
 */
ExtCsi.security.Actor = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.security.Actor, Object,
	{
			
		/**
		 * @cfg (String) code codice identificativo (come censito in IRIDE2)
		 */
		 code: null,
			
		/**
		 * @cfg (ExtCsi.security.Role) roles Ruoli impersonificati dall'actor.
		 */
		roles: null			
	/*PROTECTED REGION ID(ExtCsi.security.Actor_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class UseCase


/**
 * @class ExtCsi.security.UseCase
 * @extends Object
 * @constructor
 * codice identificativo (come censito in IRIDE2)
 */
ExtCsi.security.UseCase = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.security.UseCase, Object,
	{
			
		/**
		 * @cfg (String) code codice identificativo (come censito in IRIDE2)
		 */
		 code: null,
			
		/**
		 * @cfg (ExtCsi.security.Actor) permission [[TODO: add documentation here]]
		 */
		permission: null			
	/*PROTECTED REGION ID(ExtCsi.security.UseCase_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ActorBasedSecurityConstraint


/**
 * @class ExtCsi.security.ActorBasedSecurityConstraint
 * @extends ExtCsi.security.UISecurityConstraint
 * @constructor
 * Security constraint basato sull'impersonificazione dell'utente corrente di un particolare Actor
 */
ExtCsi.security.ActorBasedSecurityConstraint = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.security.ActorBasedSecurityConstraint, ExtCsi.security.UISecurityConstraint,
	{

			
		/**
		 * @cfg (ExtCsi.security.Actor) actor L'Actor di riferimento
		 */
		actor: null			
	/*PROTECTED REGION ID(ExtCsi.security.ActorBasedSecurityConstraint_extraMethods) ENABLED START*/
			/*PROTECTED REGION END*/
	}
);



/// dichiarazione class CustomSecurityConstraint


/**
 * @class ExtCsi.security.CustomSecurityConstraint
 * @extends ExtCsi.security.UISecurityConstraint
 * @constructor
 * Security constraint a logica custom
 */
ExtCsi.security.CustomSecurityConstraint = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.security.CustomSecurityConstraint, ExtCsi.security.UISecurityConstraint,
	{
			
		/**
		 * @cfg (String) methodNameSuffix suffisso del nome del metodo nel quale dovr&agrave; essere codificata la logica del constraint.
		 */
		 methodNameSuffix: null
	
	/*PROTECTED REGION ID(ExtCsi.security.CustomSecurityConstraint_extraMethods) ENABLED START*/
			/*PROTECTED REGION END*/
	}
);



/// dichiarazione class OPAUTHSSO


/**
 * @class ExtCsi.security.OPAUTHSSO
 * @extends ExtCsi.security.AutenticationMethod
 * @constructor
 * Meccanismo di autenticazione basato su Single Sign On di Oracle Portal
 */
ExtCsi.security.OPAUTHSSO = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.security.OPAUTHSSO, ExtCsi.security.AutenticationMethod,
	{
			
		/**
		 * @cfg (Integer) minAuthLevel livello minimo di autenticazione: 
<ul>
<li>1=username/password</li>
<li>2=username/password/pin</li>
<li>3=certificato digitale</li>
</ul>
		 */
		 minAuthLevel: null
	
	/*PROTECTED REGION ID(ExtCsi.security.OPAUTHSSO_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class SSOBARTSSO


/**
 * @class ExtCsi.security.SSOBARTSSO
 * @extends ExtCsi.security.AutenticationMethod
 * @constructor
 * Meccanismo di autenticazione basato su Sistema di Single Sign On SSOBART
 */
ExtCsi.security.SSOBARTSSO = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.security.SSOBARTSSO, ExtCsi.security.AutenticationMethod,
	{

	
	/*PROTECTED REGION ID(ExtCsi.security.SSOBARTSSO_extraMethods) ENABLED START*/
/*PROTECTED REGION END*/
	}
);



/// dichiarazione class CustomAuthentication


/**
 * @class ExtCsi.security.CustomAuthentication
 * @extends ExtCsi.security.AutenticationMethod
 * @constructor
 * Meccanismo di autenticazione custom
 */
ExtCsi.security.CustomAuthentication = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.security.CustomAuthentication, ExtCsi.security.AutenticationMethod,
	{

	
	/*PROTECTED REGION ID(ExtCsi.security.CustomAuthentication_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class StdMessagePanel


/**
 * @class ExtCsi.ui.panels.StdMessagePanel
 * @extends ExtCsi.ui.panels.Panel
 * @constructor
 * Pannello di visualizzazione di messaggi.
Permette di visualizzare:
<ul>
<li>informativi</li>
<li>di errore associati ai singoli campi</li>
<li>di errore globali</li>
</ul>
 */
ExtCsi.ui.panels.StdMessagePanel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.panels.StdMessagePanel, ExtCsi.ui.panels.Panel,
	{
			
		/**
		 * @cfg (Boolean) showGlobalMessages Impostare a true se si desidera visualizzare i messaggi di errore globali
		 */
		 showGlobalMessages: null,
		/**
		 * @cfg (Boolean) showFieldErrorDetails Impostare a true se si desidera visualizzare i messaggi di errore relativi ai vari field.
		 */
		 showFieldErrorDetails: null,
		/**
		 * @cfg (Boolean) showFieldErrors Impostare a true se si desidera visualizzare i messaggi di errore
		 */
		 showFieldErrors: null
	
	/*PROTECTED REGION ID(ExtCsi.ui.panels.StdMessagePanel_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class JumpExtCommand


/**
 * @class ExtCsi.cmd.JumpExtCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Permette di far passare il flusso di esecuzione ad una pagina esterna all'applicativo.
 */
ExtCsi.cmd.JumpExtCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.JumpExtCommand, ExtCsi.cmd.Command,
	{
			
		/**
		 * @cfg (String) staticUrl Se specificato l'effetto del comando sarà la redirezione del flusso applicativo all'url specificato.
		 */
		 staticUrl: null,
		/**
		 * @cfg (String) locationCode codice identificativo della locazione. A solo scopo menmonico. deve essere univoco all'interno del <b>ContentPanel</b>.
		 */
		 locationCode: null,
			
		/**
		 * @cfg (ExtCsi.mdl.data.ApplicationData) runtimeUrlProvider Se specificato il flusso applicativo verr&agrave; rediretto all'url fornito dinamicamente (a runtime) dall'application data specificato.
		 */
		runtimeUrlProvider: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.JumpExtCommand_extraMethods) ENABLED START*/
	,
	/**
	 * @method no operation
	 */
	doCommand : function() {
		return null;
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class UserInfoPanel


/**
 * @class ExtCsi.ui.panels.UserInfoPanel
 * @extends ExtCsi.ui.panels.Panel
 * @constructor
 * Pannello per la visualizzazione delle informazioni identificative dell'utente loggato.
Un <b>ContentPanel</b> che contiene uno <b>UserInfoPanel</b> deve referenziare 
l'application data <i>common::currentUser</i>.
 */
ExtCsi.ui.panels.UserInfoPanel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.panels.UserInfoPanel, ExtCsi.ui.panels.Panel,
	{

	
	/*PROTECTED REGION ID(ExtCsi.ui.panels.UserInfoPanel_extraMethods) ENABLED START*/
/*PROTECTED REGION END*/
	}
);



/// dichiarazione class UserDefinedPanel


/**
 * @class ExtCsi.ui.panels.UserDefinedPanel
 * @extends ExtCsi.ui.panels.Panel
 * @constructor
 * Permette la definizione di un pannello in modalit&agrave; custom.
L'implementazione di questo pannello dipende dalla cartuccia di generazione.
Nel caso "struts2", ad esempio, questo pannello di concretizza in un frammento JSP incluso.
 */
ExtCsi.ui.panels.UserDefinedPanel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.panels.UserDefinedPanel, ExtCsi.ui.panels.Panel,
	{

	
	/*PROTECTED REGION ID(ExtCsi.ui.panels.UserDefinedPanel_extraMethods) ENABLED START*/
/*PROTECTED REGION END*/
	}
);



/// dichiarazione class WizardPanel


/**
 * @class ExtCsi.ui.panels.WizardPanel
 * @extends ExtCsi.ui.panels.MultiPanel
 * @constructor
 * Particolare tipo di <b>MultiPanel</b> che prevede una sezione di
navigazione in alto che rappresenta la sequenza degli step del wizard.
Il naviogatore pu&ograve; essere attivo o passivo. Nel caso in cui il navigatore
sia passivo per passare d auno step all'altro &egrave; necessario utilizzare
il comando <b>ActivateMultiPanelItem</b> agganciato ad un evento collegato ad 
un pulsante interno al pannello che descrive ciascuno step.
 */
ExtCsi.ui.panels.WizardPanel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.panels.WizardPanel, ExtCsi.ui.panels.MultiPanel,
	{
			
		/**
		 * @cfg (Boolean) navigatorActive Se impostato a true la sezione di navigazione sar&agrave; cliccabile, 
permettendo cos&igrave; il salto libero da uno step all'altro.
		 */
		 navigatorActive: null,
			
		/**
		 * @cfg (Object) switcher Widget fittizio che permette di associare un event handler all'evento di
CLICK sullo step (utilizzabile solo in modalit&agrave; attiva).
		 */
		switcher: null			
	/*PROTECTED REGION ID(ExtCsi.ui.panels.WizardPanel_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class TypeNamespace


/**
 * @class ExtCsi.mdl.types.TypeNamespace
 * @extends Object
 * @constructor
 * Namespace (package) di tipi.
 */
ExtCsi.mdl.types.TypeNamespace = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.mdl.types.TypeNamespace, Object,
	{
			
		/**
		 * @cfg (String) name codice identificativo del namespace: deve essere univoco all'interno dell'applicazione e deve essere un identificatore di package java valido.
		 */
		 name: null,
			
		/**
		 * @cfg (ExtCsi.mdl.types.Type) types tipi contenuti nel package
		 */
		types: null			
	/*PROTECTED REGION ID(ExtCsi.mdl.types.TypeNamespace_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class AppDataGroup


/**
 * @class ExtCsi.mdl.data.AppDataGroup
 * @extends Object
 * @constructor
 * Raggruppamento logico di application data. da mantenere in modello separato.
 */
ExtCsi.mdl.data.AppDataGroup = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.mdl.data.AppDataGroup, Object,
	{
			
		/**
		 * @cfg (String) name codice identificativo del gruppo. Ha valenza esclusivamente menmonica.
		 */
		 name: null,
			
		/**
		 * @cfg (ExtCsi.mdl.data.ApplicationData) appData elenco degli application data compresi nel gruppo.
		 */
		appData: null			
	/*PROTECTED REGION ID(ExtCsi.mdl.data.AppDataGroup_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class MsgBoxPanel


/**
 * @class ExtCsi.ui.panels.MsgBoxPanel
 * @extends ExtCsi.ui.panels.Panel
 * @constructor
 * 
 */
ExtCsi.ui.panels.MsgBoxPanel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.panels.MsgBoxPanel, ExtCsi.ui.panels.Panel,
	{
			
		/**
		 * @cfg (String from enumeration ExtCsi.null.MessageSeverity) messageSeverity Tipologia del messaggio (utilizzato solo se il pannello &egrave; contenuto in un
<b>DialogPanel</b>.
		 */
		 messageSeverity: null,
			
		/**
		 * @cfg (ExtCsi.ui.widgets.PlainText) textMessages contengono il testo vero e proprio
		 */
		textMessages: null			
	/*PROTECTED REGION ID(ExtCsi.ui.panels.MsgBoxPanel_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class NOPCommand


/**
 * @class ExtCsi.cmd.NOPCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * No OPeration command. Serve da tappo per chiudere delle catene in cui occorra rimanere nella stessa schermata.
 */
ExtCsi.cmd.NOPCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.NOPCommand, ExtCsi.cmd.Command,
	{

	
	/*PROTECTED REGION ID(ExtCsi.cmd.NOPCommand_extraMethods) ENABLED START*/
	/**
	 * @method no operation
	 */
	doCommand : function() {
		var cps = globalRegistry.getRegisteredObject(ExtCsi.Const.CURRENT_CP_NAME);
		var menubar = globalRegistry.getRegisteredObject(ExtCsi.Const.MENUBAR_STRUCTURE);
		if(cps){
			var cp = new ExtCsi.ui.panels.ContentPanel();
			cp.init(menubar, cps);
		}
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class WidgetsPanel


/**
 * @class ExtCsi.ui.panels.WidgetsPanel
 * @extends ExtCsi.ui.panels.Panel
 * @constructor
 * Pannello destinato a contenere Widget.
 */
ExtCsi.ui.panels.WidgetsPanel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.panels.WidgetsPanel, ExtCsi.ui.panels.Panel,
	{
			
		/**
		 * @cfg (String) summary 
		 */
		 summary: null,
		/**
		 * @cfg (Boolean) collapsible Se <i>true</i> il pannello &egrave; collassabile.
		 */
		 collapsible: null,
			
		/**
		 * @cfg (ExtCsi.ui.widgets.Widget) widgets Elenco dei widget contenuti. I Widget sono organizzati secondo il layout
associato al pannello e secondo gli eventuali specificatori associati a 
ciascun widget.
		 */
		widgets: null			
	/*PROTECTED REGION ID(ExtCsi.ui.panels.WidgetsPanel_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ScreenState


/**
 * @class ExtCsi.ui.state.ScreenState
 * @extends Object
 * @constructor
 * Stato di visibili&agrave; / abilitazione dei widget contenuti in un 
<b>ContentPanel</b>. Per passare da uno stato all'altro &egrave; 
necessario utilizzare il comando <b>ScreenStateCommand</b>.
 */
ExtCsi.ui.state.ScreenState = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.state.ScreenState, Object,
	{
			
		/**
		 * @cfg (String) name codice identificativo dello stato. Deve essere univoco nel content panel.
		 */
		 name: null,
			
		/**
		 * @cfg (ExtCsi.ui.widgets.Widget) widgetsOn elenco dei widget che devono essere resi editabili se il <b>ContentPanel</b>
&egrave; in questo stato.
		 */
		widgetsOn: null,
		/**
		 * @cfg (ExtCsi.ui.widgets.Widget) widgetsVisible elenco dei widget che devono essere resi visibili se il <b>ContentPanel</b>
&egrave; in questo stato.
		 */
		widgetsVisible: null			
	/*PROTECTED REGION ID(ExtCsi.ui.state.ScreenState_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ScreenStates


/**
 * @class ExtCsi.ui.state.ScreenStates
 * @extends Object
 * @constructor
 * elenco delgi stati disponibili per un determinato <b>ContentPanel</b>.
 */
ExtCsi.ui.state.ScreenStates = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.state.ScreenStates, Object,
	{

			
		/**
		 * @cfg (ExtCsi.ui.state.ScreenState) states 
		 */
		states: null			
	/*PROTECTED REGION ID(ExtCsi.ui.state.ScreenStates_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ScreenStateCommand


/**
 * @class ExtCsi.cmd.ScreenStateCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Permette di far passare un <b>ContnetPanel</b> nello stato specificato
 */
ExtCsi.cmd.ScreenStateCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.ScreenStateCommand, ExtCsi.cmd.Command,
	{

			
		/**
		 * @cfg (ExtCsi.ui.state.ScreenState) goTo Lo stato in cui si desidera far passare il <b>ContentPanel</b>
		 */
		goTo: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.ScreenStateCommand_extraMethods) ENABLED START*/
	,
	/**
	 * @method no operation
	 */
	doCommand : function() {
		return null;
	}
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ShibbolethSSO


/**
 * @class ExtCsi.security.ShibbolethSSO
 * @extends ExtCsi.security.AutenticationMethod
 * @constructor
 * Meccanismo di autenticazione basato su SHIBBOLETH
 */
ExtCsi.security.ShibbolethSSO = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.security.ShibbolethSSO, ExtCsi.security.AutenticationMethod,
	{

	
	/*PROTECTED REGION ID(ExtCsi.security.ShibbolethSSO_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class Role


/**
 * @class ExtCsi.security.Role
 * @extends Object
 * @constructor
 * Ruolo come definito in IRIDE2
 */
ExtCsi.security.Role = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.security.Role, Object,
	{
			
		/**
		 * @cfg (String) code codice identificativo (come censito in IRIDE2)
		 */
		 code: null,
		/**
		 * @cfg (String) domainCode codice del dominio di validit&agrave; del ruolo (come censito in IRIDE2)
		 */
		 domainCode: null
	
	/*PROTECTED REGION ID(ExtCsi.security.Role_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class RoleBasedSecurityConstraint


/**
 * @class ExtCsi.security.RoleBasedSecurityConstraint
 * @extends ExtCsi.security.UISecurityConstraint
 * @constructor
 * Security constraint basato sull'appartenenza dell'utente corrente ad un particolare Role
 */
ExtCsi.security.RoleBasedSecurityConstraint = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.security.RoleBasedSecurityConstraint, ExtCsi.security.UISecurityConstraint,
	{

			
		/**
		 * @cfg (ExtCsi.security.Role) role Il role di riferimento
		 */
		role: null			
	/*PROTECTED REGION ID(ExtCsi.security.RoleBasedSecurityConstraint_extraMethods) ENABLED START*/
			/*PROTECTED REGION END*/
	}
);



/// dichiarazione class FileUpload


/**
 * @class ExtCsi.ui.widgets.FileUpload
 * @extends ExtCsi.ui.widgets.Widget
 * @constructor
 * Widget per la selezione e l'upload di un file
 */
ExtCsi.ui.widgets.FileUpload = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.ui.widgets.FileUpload, ExtCsi.ui.widgets.Widget,
	{

	
	/*PROTECTED REGION ID(ExtCsi.ui.widgets.FileUpload_extraMethods) ENABLED START*/
		renderExtComponent : function(el, its, formId) {
			alert("Attenzione il widget File upload non è stato ancora implementato")
			/*
			var field = {
				xtype: 'fileuploadfield',
	            id: this.name,
	            emptyText: 'Selezionare un file',
	            fieldLabel: this.label,
	            name : ExtCsi.Utils.getOgnlValue(this),
	            buttonText: '',
	            buttonCfg: {
	                iconCls: 'upload-icon'
	            }
			};
		
			// ***struttura delle colonne
			if (el.layout instanceof ExtCsi.ui.layout.HorizontalFlowPanelLayout
					|| el.layout instanceof ExtCsi.ui.layout.UDLRCPanelLayout
					|| (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
							&& el.layout.columns && el.layout.columns > 1)) {
				var cf = [];
				cf.push(field);
				var colW = null;
				if (el.layout instanceof ExtCsi.ui.layout.VerticalFlowPanelLayout
						&& el.layout.columns && el.layout.columns > 1) {
					colW = 1 / el.layout.columns;
				}
				its.push({
							columnWidth : colW,
							border : false,
							style : 'padding:5px 5px 0',
							layout : 'form',
							items : cf
						});
			} else {
				its.push(field);
			}*/
		}
/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ActivationModel


/**
 * @class ExtCsi.app.ActivationModel
 * @extends Object
 * @constructor
 * Modello di attivazione dell'applicazione.
Opzionale
 */
ExtCsi.app.ActivationModel = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.app.ActivationModel, Object,
	{

			
		/**
		 * @cfg (ExtCsi.app.ActivationParam) activationParams elenco dei parametri di attivazione dell'applicazione. Il valore effettivo dei parametri
&egrave; disponibile nella logica di business associata all' <i>onInitCommand</i>
dell'applicazione.
		 */
		activationParams: null			
	/*PROTECTED REGION ID(ExtCsi.app.ActivationModel_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ActivationParam


/**
 * @class ExtCsi.app.ActivationParam
 * @extends Object
 * @constructor
 * 
 */
ExtCsi.app.ActivationParam = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.app.ActivationParam, Object,
	{
			
		/**
		 * @cfg (String) name 
		 */
		 name: null,
			
		/**
		 * @cfg (ExtCsi.mdl.types.SimpleType) type 
		 */
		type: null			
	/*PROTECTED REGION ID(ExtCsi.app.ActivationParam_extraMethods) ENABLED START*/
		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class BeginEditCommand


/**
 * @class ExtCsi.cmd.BeginEditCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Dichiara l'inizio di una sessione di editing, effettuando un backup in memoria
degli <b>ApplicationData</b> specificati.
La copia di backup sar&agrave; realizzata per valore e potr&agrave; essere utilizzata
per ripristinare il valore originario (funzione di <i>undo</i> richiamata
utilizzando <b>EndEditCommand</b>.
 */
ExtCsi.cmd.BeginEditCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.BeginEditCommand, ExtCsi.cmd.Command,
	{

			
		/**
		 * @cfg (ExtCsi.mdl.data.ApplicationData) dataEdited Elenco dei dati oggetto dell'editing.
		 */
		dataEdited: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.BeginEditCommand_extraMethods) ENABLED START*/
	,
	/**
	 * @method no operation
	 */
	doCommand : function() {
		return null;
	}

		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class EndEditCommand


/**
 * @class ExtCsi.cmd.EndEditCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Permette di terminare una sessione di editing su un certo insieme di <b>ApplicationData</b>,
con la possibilità di effettuare un <i>undo</i> sui dati specificati.
Utilizzato in congiunzione con <b>BeginEditCommand</b>. 
Nota: data la struttura dei due comandi di inizio e fine della sessione di
editing &egrave; possibile effettuare l'<i>undo</i> di una parte degli
application data specificati nel comando di inizio editing (specificando
nel <b>EndEditCommand</b> solo una parte degli application data
precedentemente specificati nel <b>BeginEditCommand</b>.
Si consiglia, in questi casi, di terminare correttamente la sessione di 
editing per <b>tutti</b> gli application data per evitar eche rimangano 
in memoria dati di backup obsoleti.
Per far ci&ograve; &egrave; sufficiente utilizzare due volte il comando
<b>EndEditCommand</b>: la prima volta con <i>undo</i> impostato a
true (e specificando solo i dati di cui si vuole effettuare l'undo) e
una seconda volta con <i>undo</i> impostato a false, specificando 
i restanti dati.

 */
ExtCsi.cmd.EndEditCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.EndEditCommand, ExtCsi.cmd.Command,
	{
			
		/**
		 * @cfg (Boolean) undo Se impostato a true viene ripristinato il valore originario di tutti gli
<b>ApplicationData</b> indicati.
		 */
		 undo: null,
			
		/**
		 * @cfg (ExtCsi.mdl.data.ApplicationData) dataEdited Elenco dei dati oggetto dell'editing.
		 */
		dataEdited: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.EndEditCommand_extraMethods) ENABLED START*/
	,
	/**
	 * @method termina la sessione di editing
	 */
	storeData : false,
	/**
	 * @method no operation
	 */
	doCommand : function() {
		return null;
	}

		/*PROTECTED REGION END*/
	}
);



/// dichiarazione class ChkEditStatusCommand


/**
 * @class ExtCsi.cmd.ChkEditStatusCommand
 * @extends ExtCsi.cmd.Command
 * @constructor
 * Permette di verificare se, all'interno di una sessione di editing, vi sono state
delle variazioni al valore di uno o pi&ugrave; <b>ApplicationData</b>.
Affinch&egrave; il check sia veritiero è necessario che gli <b>ApplicationData</b>
oggetto di verifica siano un sottoinsieme dell'insieme di <b>ApplicationData</b>
indicati nel comando <b>BeginEditCommand</b> che ha originato
la sessione di editing (altrimenti non sar&agrave; disponibile il valore originario
con il quale effettuare il check di modifica).
A fronte dell'esito del check sarà possibile proseguire l'esecuzione con uno 
tra due comandi (referenziati nei due elementi di tipo <b>CommandOutcome</b>).
Mediante l'attributo <i>checkAggregation</i>E'possibile specificare la logica di aggregazione del check relativamente
ai vari <b>ApplicationData</b> referenziati:
<ul>
<li>OR: l'esito sar&agrave; di "occorsa variazione" se il valore di almeno uno dei dati
      referenziati avr&agrave; subito una modifica rispatto allo stato originale.</li>
<li>AND: l'esito sar&agrave; di "occorsa variazione" se il valore di tutti i dati
      referenziati avr&agrave; subito una modifica rispatto allo stato originale.</li>
<li>XOR: l'esito sar&agrave; di "occorsa variazione" se il valore di uno soltanto tra i dati
      referenziati avr&agrave; subito una modifica rispatto allo stato originale.</li>
</ul>
 */
ExtCsi.cmd.ChkEditStatusCommand = function(config) {
	config = config || {};
	Ext.apply(this, config);
	// TODO codice specifico del costruttore
}; 

Ext.extend(ExtCsi.cmd.ChkEditStatusCommand, ExtCsi.cmd.Command,
	{
			
		/**
		 * @cfg (String from enumeration ExtCsi.null.LogicAggregationTypes) checkAggregation Tipo di aggregazione dei check sui dati. Possibilit&agrave;:
<ul>
<li>OR: l'esito sar&agrave; di "occorsa variazione" se il valore di almeno uno dei dati
      referenziati avr&agrave; subito una modifica rispatto allo stato originale.</li>
<li>AND: l'esito sar&agrave; di "occorsa variazione" se il valore di tutti i dati
      referenziati avr&agrave; subito una modifica rispatto allo stato originale.</li>
<li>XOR: l'esito sar&agrave; di "occorsa variazione" se il valore di uno soltanto tra i dati
      referenziati avr&agrave; subito una modifica rispatto allo stato originale.</li>
</ul>
		 */
		 checkAggregation: null,
			
		/**
		 * @cfg (ExtCsi.mdl.data.ApplicationData) dataChecked Elenco dei dati oggetto della verifica. Devono essere un sottoinsieme 
dei dati referenziati nel corrispondente <b>BeginEditCommand</b>.
		 */
		dataChecked: null,
		/**
		 * @cfg (ExtCsi.cmd.CommandOutcome) doIfChanged Specifica il branch di elaborazione da eseguire nel caso che i check
specificati indichino che ci sono state delle modifiche.
		 */
		doIfChanged: null,
		/**
		 * @cfg (ExtCsi.cmd.CommandOutcome) doIfNotChanged Specifica il branch di elaborazione da eseguire nel caso che i check
specificati indichino che <i>non</i> ci sono state delle modifiche.
		 */
		doIfNotChanged: null			
	/*PROTECTED REGION ID(ExtCsi.cmd.ChkEditStatusCommand_extraMethods) ENABLED START*/
	,
	/**
	 * @method no operation
	 */
	doCommand : function() {
		return null;
	}
		/*PROTECTED REGION END*/
	}
);





/**
 * @class ExtCsi.mdl.types.WidgetDataType
 * @extends object
 * @singleton
 * [[TODO: add documentation here]]
 */
ExtCsi.mdl.types.WidgetDataType = function() {
	return {
		/**
		 * @type String
		 */
		STRINGA: 'STRINGA'
	,		/**
		 * @type String
		 */
		NUMERICO: 'NUMERICO'
	,		/**
		 * @type String
		 */
		DATA: 'DATA'
	,		/**
		 * @type String
		 */
		ORA: 'ORA'
	,		/**
		 * @type String
		 */
		DATAORA: 'DATAORA'
	};
}; 

/**
 * @class ExtCsi.ui.layout.UDLRCSpecConstants
 * @extends object
 * @singleton
 * Valori ammissibili per l' <b>UDLRCWidgetLayoutSpecifier</b>.
 */
ExtCsi.ui.layout.UDLRCSpecConstants = function() {
	return {
		/**
		 * @type String
		 */
		UP: 'UP'
	,		/**
		 * @type String
		 */
		DOWN: 'DOWN'
	,		/**
		 * @type String
		 */
		LEFT: 'LEFT'
	,		/**
		 * @type String
		 */
		RIGHT: 'RIGHT'
	,		/**
		 * @type String
		 */
		CENTER: 'CENTER'
	};
}; 

/**
 * @class ExtCsi.ui.event.MethodProtectionTypes
 * @extends object
 * @singleton
 * 
 */
ExtCsi.ui.event.MethodProtectionTypes = function() {
	return {
		/**
		 * @type String
		 */
		REJECT_SAME: 'REJECT_SAME'
	,		/**
		 * @type String
		 */
		ALLOW_ALL: 'ALLOW_ALL'
	,		/**
		 * @type String
		 */
		REJECT_ALL: 'REJECT_ALL'
	};
}; 

/**
 * @class ExtCsi.ui.event.EventTypes
 * @extends object
 * @singleton
 * tipologie di eventi a cui &egrave; possibile associare un event handler.
 */
ExtCsi.ui.event.EventTypes = function() {
	return {
		/**
		 * @type String
		 */
		CLICKED: 'CLICKED'
	,		/**
		 * @type String
		 */
		VALUE_CHANGED: 'VALUE_CHANGED'
	,		/**
		 * @type String
		 */
		FOCUS_GAINED: 'FOCUS_GAINED'
	,		/**
		 * @type String
		 */
		FOCUS_LOST: 'FOCUS_LOST'
	,		/**
		 * @type String
		 */
		KEY_PRESSED: 'KEY_PRESSED'
	,		/**
		 * @type String
		 */
		NODE_EXPANDED: 'NODE_EXPANDED'
	};
}; 

/**
 * @class ExtCsi.mdl.data.DataLifetimeType
 * @extends object
 * @singleton
 * Possibili modi di persistenza dell'application data.
 */
ExtCsi.mdl.data.DataLifetimeType = function() {
	return {
		/**
		 * @type String
		 */
		USER_ACTION: 'USER_ACTION'
	,		/**
		 * @type String
		 */
		USER_SESSION: 'USER_SESSION'
	,		/**
		 * @type String
		 */
		SAME_PAGE: 'SAME_PAGE'
	};
}; 

/**
 * @class ExtCsi.mdl.types.SimpleTypeCodes
 * @extends object
 * @singleton
 * Codici dei tipi base
 */
ExtCsi.mdl.types.SimpleTypeCodes = function() {
	return {
		/**
		 * @type String
		 */
		INT: 'INT'
	,		/**
		 * @type String
		 */
		LONG: 'LONG'
	,		/**
		 * @type String
		 */
		FLOAT: 'FLOAT'
	,		/**
		 * @type String
		 */
		DOUBLE: 'DOUBLE'
	,		/**
		 * @type String
		 */
		STRING: 'STRING'
	,		/**
		 * @type String
		 */
		DATE: 'DATE'
	,		/**
		 * @type String
		 */
		DATETIME: 'DATETIME'
	,		/**
		 * @type String
		 */
		HOURS: 'HOURS'
	,		/**
		 * @type String
		 */
		BOOLEAN: 'BOOLEAN'
	,		/**
		 * @type String
		 */
		BYTE: 'BYTE'
	,		/**
		 * @type String
		 */
		TREE_NODE: 'TREE_NODE'
	};
}; 

/**
 * @class ExtCsi.ui.widgets.CommandFunctions
 * @extends object
 * @singleton
 * 
 */
ExtCsi.ui.widgets.CommandFunctions = function() {
	return {
		/**
		 * @type String
		 */
		UNSPECIFIED: 'UNSPECIFIED'
	,		/**
		 * @type String
		 */
		ADD_ITEM: 'ADD_ITEM'
	,		/**
		 * @type String
		 */
		EDIT_ITEM: 'EDIT_ITEM'
	,		/**
		 * @type String
		 */
		DELETE_ITEM: 'DELETE_ITEM'
	,		/**
		 * @type String
		 */
		SEARCH: 'SEARCH'
	,		/**
		 * @type String
		 */
		SAVE: 'SAVE'
	,		/**
		 * @type String
		 */
		LOAD: 'LOAD'
	,		/**
		 * @type String
		 */
		DETAIL: 'DETAIL'
	,		/**
		 * @type String
		 */
		LOOKUP: 'LOOKUP'
	,		/**
		 * @type String
		 */
		NEXT_ITEM: 'NEXT_ITEM'
	,		/**
		 * @type String
		 */
		PREVIOUS_ITEM: 'PREVIOUS_ITEM'
	,		/**
		 * @type String
		 */
		FIRST_ITEM: 'FIRST_ITEM'
	,		/**
		 * @type String
		 */
		LAST_ITEM: 'LAST_ITEM'
	,		/**
		 * @type String
		 */
		CONFIRM: 'CONFIRM'
	,		/**
		 * @type String
		 */
		CANCEL: 'CANCEL'
	,		/**
		 * @type String
		 */
		FORWARD: 'FORWARD'
	,		/**
		 * @type String
		 */
		BACK: 'BACK'
	,		/**
		 * @type String
		 */
		SHOW_REPORT: 'SHOW_REPORT'
	,		/**
		 * @type String
		 */
		SHOW_HELP: 'SHOW_HELP'
	,		/**
		 * @type String
		 */
		SEND_MESSAGE: 'SEND_MESSAGE'
	};
}; 


