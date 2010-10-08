package it.csi.mddtools.guigen.workflow.component.uiprototype;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;

public class Utility extends org.openarchitectureware.workflow.lib.AbstractWorkflowComponent{

	// private static String url =
	// "http://repart.csi.it/java/apache/commons-httpclient/2.0.2/lib/commons-httpclient-2.0.2.jar";
	private static String urlExtCsi;
	private static String urlExtJs;
	private static String urlExtJsCore;
	
	private static String extCsiUrl = "extCsiUrl";
	private static String extJsUrl = "extJsUrl";
	private static String extJsUrlCore = "extJsUrlCore";
	
	private static String nomeZipExtCsi;
	private static String nomeZipExtJs;
	private static String nomeZipExtJsCore;
	

	public static void leggiProperties() {
		Properties properties = new Properties();
		try {
			properties.load(Utility.class
					.getResourceAsStream("RisorseJs.properties"));
			urlExtCsi = properties.getProperty(extCsiUrl);
			urlExtJs  =  properties.getProperty(extJsUrl);
			urlExtJsCore =properties.getProperty(extJsUrlCore);
			System.out.println("url=" + urlExtCsi);	
		} catch (Exception ex) {
			System.err
					.println("File properties non trovato." + ex.getMessage());
		}		
		nomeZipExtCsi= urlExtCsi.substring(urlExtCsi.lastIndexOf("/")+1);
		nomeZipExtJs= urlExtJs.substring(urlExtJs.lastIndexOf("/")+1);
		nomeZipExtJsCore= urlExtJsCore.substring(urlExtJsCore.lastIndexOf("/")+1);
		System.out.println("extcsi:"+nomeZipExtCsi);
		System.out.println("extJs:"+nomeZipExtJs);
		System.out.println("extJsCore:"+nomeZipExtJsCore);
	}

	public static void downloadResource(String url,String nomeFile) {
		HttpClient client = new HttpClient();
		GetMethod method = new GetMethod(url);
		try {
			// Execute the method.
			int statusCode = client.executeMethod(method);
			if (statusCode != HttpStatus.SC_OK) {
				System.err.println("Method failed: " + method.getStatusLine());
			}
			byte[] responseBody = method.getResponseBody();
			FileOutputStream fos = new FileOutputStream(nomeFile);
			fos.write(responseBody);
		} catch (HttpException e) {
			System.err.println("Fatal protocol violation: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Fatal transport error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			// Release the connection.
			method.releaseConnection();
		}
	}
	
	
	public static void downloadResource_2(String url,String nomeFile) {
		HttpClient client = new HttpClient();
		GetMethod method = new GetMethod(url);
		try {
			// Execute the method.
			int statusCode = client.executeMethod(method);
			if (statusCode != HttpStatus.SC_OK) {
				System.err.println("Method failed: " + method.getStatusLine());
			}
		   InputStream	inputStream = method.getResponseBodyAsStream();
		   File f=new File(pathResources()+nomeFile);
//		    InputStream inputStream= new FileInputStream
//		("InputStreamToFile.java");
		    OutputStream out=new FileOutputStream(f);
		    byte buf[]=new byte[1024];
		    int len;
		    while((len=inputStream.read(buf))>0)
		    out.write(buf,0,len);
		    out.close();
		    inputStream.close();
	   
//		   
//			FileOutputStream fos = new FileOutputStream(nomeFile);
//			fos.write(responseBody);
		} catch (HttpException e) {
			System.err.println("Fatal protocol violation: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Fatal transport error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			// Release the connection.
			method.releaseConnection();
		}
	}
	
	private static void donwload(){
	   downloadResource_2(urlExtCsi,nomeZipExtCsi);
		downloadResource_2(urlExtJs, nomeZipExtJs);
		downloadResource_2(urlExtJsCore, nomeZipExtJsCore);			
	}
	
	private static void unzip(){
	    Unzip unz= new Unzip();
	      unz.unzipFileName(nomeZipExtCsi,pathResources());
	     unz.unzipFileName(nomeZipExtJs,pathResources());
	     
	}
	
	private static String pathResources(){
		System.out.println("path==="+getTargetProjectName());
		System.out.println("working dir="+getWorkingDir());
		return getWorkingDir()+"//"+getTargetProjectName()+"//WebContent//";
		
	}

	public void setUtil(boolean b) throws IOException {
	
		Utility.leggiProperties();
		Utility.donwload();
	    
	    Unzip unz= new Unzip();
	    File zipFileExtCsi = new File(pathResources()+nomeZipExtCsi);
	    File destFile = new File(pathResources());
	    
	    Unzip.extract(zipFileExtCsi, destFile);
	    
	    File zipFileExtJs = new File(pathResources()+nomeZipExtJs);
	    Unzip.extract(zipFileExtJs, destFile);
	    
	    File zipFileExtJsCore = new File(pathResources()+nomeZipExtJsCore);
	    Unzip.extract(zipFileExtJsCore, destFile);
	    
	  
	    LeggiScriviFile ls= new LeggiScriviFile();
	    LeggiScriviFile.replaceText(pathResources()+"ext-csi-mdd//core//core.js");
	}
	
public static String getWorkingDir(){	
//	System.out.println("test:"+System.getProperty("user.dir"));
	String s=System.getProperty("user.dir");
	String separatore= System.getProperty("file.separator");
//	System.out.println("separatore:"+separatore);
	s=s.replaceAll("\\\\", "//");
//	System.out.println("s="+s);
	s=s.substring(0,s.lastIndexOf("//"));
//	System.out.println("ris:"+s);
	return s;
}	


	public static void main(String[] args) {
		Utility httpClient = new Utility();
	//	httpClient.leggiProperties();
	 //   httpClient.donwload();
	    httpClient.unzip();
	    LeggiScriviFile ls= new LeggiScriviFile();
	    //ls.replaceText();
	}

	public void checkConfiguration(Issues issues) {
		// TODO Auto-generated method stub
		
		
	}

	public void invoke(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		// TODO Auto-generated method stub
	     
	}
	
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public static String getTargetProjectName() {
		return targetProjectName;
	}

	public void setTargetProjectName(String targetProjectName) {
		this.targetProjectName = targetProjectName;
	}

	private String modelName;
	private static String targetProjectName;
}
