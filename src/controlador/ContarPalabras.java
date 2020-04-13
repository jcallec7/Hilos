package controlador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ContarPalabras {
	
	HashMap<String,List<String>> mapa = new HashMap<String,List<String>>();
	
	int i = 0;
	
	public HashMap<String,List<String>> contarPalabra(String text) {
		
		String[] palabras = text.split(" ");
		
		for(String palabra : palabras) {
			
			List<String> idComentarios = new ArrayList<String>();
			
			if(mapa.get(palabra)==null) {
				
				idComentarios.add(""+i);
				
			} else {
				
				idComentarios = mapa.get(palabra);
				idComentarios.add(""+i);
				
			}
		
			mapa.put(palabra,idComentarios);
			
		}
		
		i = i+1;
		
		return mapa;
		
	}

}
