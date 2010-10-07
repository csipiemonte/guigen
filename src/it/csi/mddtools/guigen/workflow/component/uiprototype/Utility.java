package it.csi.mddtools.guigen.workflow.component.uiprototype;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;

public class Utility {

	// private static String url =
	// "http://repart.csi.it/java/apache/commons-httpclient/2.0.2/lib/commons-httpclient-2.0.2.jar";
	private String urlExtCsi;
	private String urlExtJs;
	
	private static String extCsiUrl = "extCsiUrl";
	private static String extJsUrl = "extJsUrl";
	
	private String nomeZipExtCsi;
	private String nomeZipExtJs;
	

	public void leggiProperties() {
		Properties properties = new Properties();
		try {
			properties.load(Utility.class
					.getResourceAsStream("RisorseJs.properties"));
			urlExtCsi = properties.getProperty(extCsiUrl);
			urlExtJs  =  properties.getProperty(extJsUrl);
			System.out.println("url=" + urlExtCsi);	
		} catch (Exception ex) {
			System.err
					.println("File properties non trovato." + ex.getMessage());
		}		
		nomeZipExtCsi= urlExtCsi.substring(urlExtCsi.lastIndexOf("/")+1);
		nomeZipExtJs= urlExtJs.substring(urlExtJs.lastIndexOf("/")+1);
		System.out.println("extcsi:"+nomeZipExtCsi);
		System.out.println("extJs:"+nomeZipExtJs);
	}

	public void downloadResource(String url,String nomeFile) {
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
	
	
	public void downloadResource_2(String url,String nomeFile) {
		HttpClient client = new HttpClient();
		GetMethod method = new GetMethod(url);
		try {
			// Execute the method.
			int statusCode = client.executeMethod(method);
			if (statusCode != HttpStatus.SC_OK) {
				System.err.println("Method failed: " + method.getStatusLine());
			}
		   InputStream	inputStream = method.getResponseBodyAsStream();
		   File f=new File(nomeFile);
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
	
	private void donwload(){
	   downloadResource_2(urlExtCsi,nomeZipExtCsi);
		downloadResource_2(urlExtJs, nomeZipExtJs);
	}
	
	private void unzip(){
	    Unzip unz= new Unzip();
	    unz.unzipFileName(nomeZipExtCsi);
	    unz.unzipFileName(nomeZipExtJs);
	    
	    
	    
	}


	public static void main(String[] args) {
		Utility httpClient = new Utility();
		httpClient.leggiProperties();
	    httpClient.donwload();
	    httpClient.unzip();
	    LeggiScriviFile ls= new LeggiScriviFile();
	    ls.replaceText();
	}
}
