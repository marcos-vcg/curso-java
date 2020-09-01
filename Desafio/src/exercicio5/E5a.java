package exercicio5;

import java.util.HashMap;

public class E5a {

	public static void main(String[] args) {
		
		HashMap<Integer, String> dicionario = new HashMap<>();
		dicionario.put(4, "a");
		dicionario.put(3, "e");
		dicionario.put(1, "i");
		dicionario.put(5, "s");
	
		String frase = "T35t3 d3 35t4g1o";
		
		for(int i = 0; i < frase.length(); i++) {
			frase = frase.replaceAll(dicionario.keySet().toString(), dicionario.values());
		}
	}
	
}
