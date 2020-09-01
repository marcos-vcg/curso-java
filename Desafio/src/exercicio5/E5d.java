package exercicio5;

import java.util.HashMap;

public class E5d {

	public static void main(String[] args) {
		
		HashMap<String, String> dicionario = new HashMap<>();
		dicionario.put("4", "a");
		dicionario.put("3", "e");
		dicionario.put("1", "i");
		dicionario.put("5", "s");
	
		String frase = "T35t3 d3 35t4g1o";
		
		for(int i = 0; i < dicionario.length; i++) {
			frase = frase.replace(dicionario[i].key(), dicionario[i].value());
		}
	}
	
}
