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
