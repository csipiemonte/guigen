package it.csi.mddtools.guigen.workflow.component;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.openarchitectureware.workflow.ConfigurationException;
import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.lib.AbstractWorkflowComponent;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;

public class GuigenExtensionSetup extends AbstractWorkflowComponent {

	private Log log = LogFactory.getLog(getClass());

	private final static String ECLIPSE_HOME_SYSPROP = "eclipse.home";

	public void checkConfiguration(Issues issues) {
		// TODO Auto-generated method stub

	}

	public void invoke(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		// TODO Auto-generated method stub

	}

	protected String _pluginName;

	public void setPluginName(String pluginName) {
		_pluginName = pluginName;
		log.info("Setup del plugin [" + pluginName + "]");
	}

	protected String _pluginVersion;

	public void setPluginVersion(String pluginVersion) {
		_pluginVersion = pluginVersion;
		log.info("La versione del plugin [" + _pluginName + "] e' la "
				+ pluginVersion);
	}

	/**
	 * aggiunge un uriMap per ogni frammento, facendo riferimento alla directory
	 * di installazione di eclipse (System property eclipse.home, da impostare
	 * nel lancio dell'oaw, usando ${eclipse_home}, il nome del plugin e la
	 * versione es:
	 * jar:file:/javatools/eclipses/galileos/galileo-mddtools/eclipse
	 * /plugins/misctestcrt_1
	 * .0.0.001.jar!/model/pdefplugin/pdefplugin/mypdef.guigen" />
	 * 
	 * @param relativePath
	 */
	public void addFragmentPath(String relativePath) {

		String eclipseHome = System.getProperty(ECLIPSE_HOME_SYSPROP);
		if (eclipseHome != null && eclipseHome.length() > 0) {
			log.info("Aggiunta frammento " + relativePath + " del plugin ["
					+ _pluginName + "]");
			String pluginRes = "platform:/plugin/";
			pluginRes += _pluginName + "/" + relativePath;

			if (eclipseHome.indexOf(":")>0)
				eclipseHome = eclipseHome.substring(eclipseHome.indexOf(":")+1);
			String jarRelativeFullPath = "jar:file:" + eclipseHome
					+ "plugins/" + _pluginName + "_" + _pluginVersion
					+ ".jar!/" + relativePath;

			final URI baseUri = URI.createURI(pluginRes);

			final URI mappedUri = URI.createURI(jarRelativeFullPath);
			if (mappedUri == null)
				throw new ConfigurationException("cannot make URI out of "
						+ jarRelativeFullPath);
			else {
				URIConverter.URI_MAP.put(baseUri, mappedUri);
			}
		} else {
			log
					.error("Impossibile registrare il plugin "
							+ _pluginName
							+ ": non è stata impostata la system property \"eclipse.home\"");
			throw new IllegalArgumentException("missing 'eclipse.home'");
		}

	}
}
