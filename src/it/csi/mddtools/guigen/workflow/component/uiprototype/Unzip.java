package it.csi.mddtools.guigen.workflow.component.uiprototype;

import java.io.*;
import java.util.*;
import java.util.zip.*;


public class Unzip {

  private void copyInputStream(InputStream in, OutputStream out)
  throws IOException
  {
    byte[] buffer = new byte[1024];
    int len;

    while((len = in.read(buffer)) >= 0)
      out.write(buffer, 0, len);

    in.close();
    out.close();
  }
  
  public void unzz(String nomeFile){
	    int BUFFER = 2048;

	      try {
	         BufferedOutputStream dest = null;
	         BufferedInputStream is = null;
	         ZipEntry entry;
	         ZipFile zipfile = new ZipFile(nomeFile);
	         Enumeration e = zipfile.entries();
	         while(e.hasMoreElements()) {
	            entry = (ZipEntry) e.nextElement();
	            System.out.println("Extracting: " +entry);
	            is = new BufferedInputStream
	              (zipfile.getInputStream(entry));
	            int count;
	            byte data[] = new byte[BUFFER];
	            FileOutputStream fos = new 
	              FileOutputStream(entry.getName());
	            dest = new 
	              BufferedOutputStream(fos, BUFFER);
	            while ((count = is.read(data, 0, BUFFER)) 
	              != -1) {
	               dest.write(data, 0, count);
	            }
	            dest.flush();
	            dest.close();
	            is.close();
	         }
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	  
	   }

 

  public void unzipFileName (String nomeFile) {
    Enumeration entries;
    ZipFile zipFile;

//    if(args.length != 1) {
//      System.err.println("Usage: Unzip zipfile");
//      return;
//    }

    try {
     //zipFile = new ZipFile("D://mddsvil//galileo-mddtools//eclipse//workspace//Test//ext-csi-1.0.0-mdd.zip");
    	zipFile = new ZipFile(nomeFile);
      entries = zipFile.entries();

      while(entries.hasMoreElements()) {
        ZipEntry entry = (ZipEntry)entries.nextElement();

        if(entry.isDirectory()) {
          // Assume directories are stored parents first then children.
          System.err.println("Extracting directory: " + entry.getName());
          // This is not robust, just for demonstration purposes.
          (new File(entry.getName())).mkdir();
          continue;
        }

        System.err.println("Extracting file: " + entry.getName());
        copyInputStream(zipFile.getInputStream(entry),
           new BufferedOutputStream(new FileOutputStream(entry.getName())));
      }

      zipFile.close();
    } catch (IOException ioe) {
      System.err.println("Unhandled exception:");
      ioe.printStackTrace();
      return;
    }
  }

}
