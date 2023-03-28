package com.rf.demo;

public class VueltaString {

	public static void main(String[] args) {
		String frase = "";
		int longitud = frase.length();
		int i;
		for ( i = longitud -1 ; i >= 0; i-- ){
		System.out.println(frase.charAt(i));
	
		  }
		
        String inverso = " ";
        for ( i = longitud -1 ; i >= 0; i-- ){
    		    inverso += frase.charAt(i);
    			System.out.println(frase.charAt(i));
    		  }
       
        
	}

}
