package it.csi.mddtools.guigen.workflow.component.uiprototype;

import java.io.*;
import java.util.*;
import java.util.zip.*;


public class Unzip {

  private static void copyInputStream(InputStream in, OutputStream out)
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
	              FileOutputStream("c:\\"+entry.getName());
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

 

  public static void unzipFileName (String nomeFile,String path) {
    Enumeration entries;
    ZipFile zipFile;

//    if(args.length != 1) {
//      System.err.println("Usage: Unzip zipfile");
//      return;
//    }

    try {
     //zipFile = new ZipFile("D://mddsvil//galileo-mddtools//eclipse//workspace//Test//ext-csi-1.0.0-mdd.zip");
    	System.out.println();
    	zipFile = new ZipFile(path+nomeFile);
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
  
  public static void doUnzip(String inputZip, String destinationDirectory)
  throws IOException {
int BUFFER = 2048;
List zipFiles = new ArrayList();
File sourceZipFile = new File(inputZip);
File unzipDestinationDirectory = new File(destinationDirectory);
unzipDestinationDirectory.mkdir();

ZipFile zipFile;
// Open Zip file for reading
zipFile = new ZipFile(sourceZipFile, ZipFile.OPEN_READ);

// Create an enumeration of the entries in the zip file
Enumeration zipFileEntries = zipFile.entries();

// Process each entry
while (zipFileEntries.hasMoreElements()) {
  // grab a zip file entry
  ZipEntry entry = (ZipEntry) zipFileEntries.nextElement();

  String currentEntry = entry.getName();

  File destFile = new File(unzipDestinationDirectory, destinationDirectory+currentEntry+"/");
 //   destFile = new File(unzipDestinationDirectory, destFile.getName());

  if (currentEntry.endsWith(".zip")) {
      zipFiles.add(destFile.getAbsolutePath());
  }

  // grab file's parent directory structure
  File destinationParent = destFile.getParentFile();

  // create the parent directory structure if needed
  destinationParent.mkdirs();

  try {
      // extract file if not a directory
      if (!entry.isDirectory()) {
          BufferedInputStream is =
                  new BufferedInputStream(zipFile.getInputStream(entry));
          int currentByte;
          // establish buffer for writing file
          byte data[] = new byte[BUFFER];

          // write the current file to disk
          FileOutputStream fos = new FileOutputStream(destinationDirectory+entry.getName());
          BufferedOutputStream dest =
                  new BufferedOutputStream(fos, BUFFER);

          // read and write until last byte is encountered
          while ((currentByte = is.read(data, 0, BUFFER)) != -1) {
              dest.write(data, 0, currentByte);
          }
          dest.flush();
          dest.close();
          is.close();
       //   fileCount++;
      }
  } catch (IOException ioe) {
      ioe.printStackTrace();
  }
}
zipFile.close();

for (Iterator iter = zipFiles.iterator(); iter.hasNext();) {
  String zipName = (String)iter.next();
  doUnzip(
      zipName,
      destinationDirectory +
          File.separatorChar +
          zipName.substring(0,zipName.lastIndexOf(".zip"))
  );
}

}

  
  public static void extract(File file, File destination) throws IOException {
	    ZipInputStream in = null;
	    OutputStream out = null;
	    try {
	      // Open the ZIP file
	      in = new ZipInputStream(new FileInputStream(file));

	      // Get the first entry
	      ZipEntry entry = null;

	      while ((entry = in.getNextEntry()) != null) {
	        String outFilename = entry.getName();

	        // Open the output file
	        if (entry.isDirectory()) {
	          new File(destination, outFilename).mkdirs();
	        } else {
	          out = new FileOutputStream(new File(destination,
	              outFilename));

	          // Transfer bytes from the ZIP file to the output file
	          byte[] buf = new byte[1024];
	          int len;

	          while ((len = in.read(buf)) > 0) {
	            out.write(buf, 0, len);
	          }

	          // Close the stream
	          out.close();
	        }
	      }
	    } finally {
	      // Close the stream
	      if (in != null) {
	        in.close();
	      }
	      if (out != null) {
	        out.close();
	      }
	    }
	  }

	  /**
	   * Return the first directory of this archive. This is needed to determine
	   * the plugin directory.
	   * 
	   * @param zipFile
	   * @return <class>File</class> containing the first entry of this archive
	   */
	  public static File getFirstFile(File zipFile) throws IOException {
	    ZipInputStream in = null;
	    try {
	      // Open the ZIP file
	      in = new ZipInputStream(new FileInputStream(zipFile));

	      // Get the first entry
	      ZipEntry entry = null;

	      while ((entry = in.getNextEntry()) != null) {
	        String outFilename = entry.getName();

	        if (entry.isDirectory()) {
	          return new File(outFilename);
	        }
	      }
	    } finally {
	      if (in != null) {
	        // Close the stream
	        in.close();
	      }
	    }
	    return null;
	  }



}
