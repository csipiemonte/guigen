package it.csi.mddtools.guigen.genutils;

import java.util.Random;

/**
 * 
 * @author 71735
 */
public class GenStrutsFakeData {

	
	/**
	 * Genera una lista casuale per popolare una combobox
	 * @return
	 */
	public static String getComboboxFakeData() {
		Random generator = new Random();
		int num = generator.nextInt(10) + 1;
		StringBuilder str = new StringBuilder();
		
		for (int i=0; i < num; i++) {
			String tmp = "'" + (i+1) + "':'Elemento " + (i+1) + "'" + (i<num-1 ? "," : "");
			str.append(tmp);
		}
		
		String res = "#{" + str.toString() + "}";
		return res;
	}
	
	
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
