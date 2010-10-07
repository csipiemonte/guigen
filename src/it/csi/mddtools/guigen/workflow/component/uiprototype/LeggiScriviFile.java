package it.csi.mddtools.guigen.workflow.component.uiprototype;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LeggiScriviFile {
	
	
	
	
	private static String file = "D://mddsvil//galileo-mddtools//eclipse//workspace//Test//ext-csi-mdd//core//core.js";
	public StringBuffer openFile(String fileName)
	{
		StringBuffer ilFile = new StringBuffer();

	  try
	  {
	   BufferedReader in=
	    new BufferedReader(new FileReader(fileName));

	   String linea = new String();

	   while ((linea=in.readLine())!= null )
	   {
	    ilFile.append(linea);
	    ilFile.append(System.getProperty("line.separator"));
	   }

	   in.close();
	  }
	  catch (IOException e)
	  {
	   ilFile=null;
	  // errorMsg=”Oper error:”+e.getMessage();
	  }

	  return ilFile;

	} 

	public boolean saveFile(String fileName, String fileString)
	{PrintWriter out;
	  try
	  {
	    out = new PrintWriter(
	new BufferedOutputStream(
	new FileOutputStream(fileName)));
	  }
	catch (FileNotFoundException e)
	  {
	  // errorMsg="Save File Error: "+e.getMessage();
	   return false;
	  }

	  out.print(fileString);
	out.close();

	if (out.checkError())
	{ 
	// errorMsg=”Out of memory.”;
	 return false;
	  }

	return true;
	}
	
	public void replaceText(){
		String s=openFile(file).toString();
		s=s.replaceAll("method : 'POST',","method : 'GET',");	
		saveFile(file,s);
	}
	
	
	public static void main(String[] args) {
		LeggiScriviFile ls= new LeggiScriviFile();
		ls.replaceText();
		
		
		
		
	}
	 

}
