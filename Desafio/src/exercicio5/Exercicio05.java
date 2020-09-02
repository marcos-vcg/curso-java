package exercicio5;

import java.util.HashMap;

public class Exercicio05 {
	// E.5 Dado o dicionário {4: 'a', 3: 'e', 1: 'i', 5: 's'} substitua os números na frase 'T35t3 d3 35t4g1o' conforme o dicionário.
	public static void main(String[] args) {
		
		HashMap<Integer, String> dicionario = new HashMap<>();
		dicionario.put(4, "a");
		dicionario.put(3, "e");
		dicionario.put(1, "i");
		dicionario.put(5, "s");
	
		String frase = "T35t3 d3 35t4g1o";
		
		for(Integer chave: dicionario.keySet()) {
			frase = frase.replaceAll(chave.toString(), dicionario.get(chave));
		}
		
		System.out.println(frase);
	}	
}