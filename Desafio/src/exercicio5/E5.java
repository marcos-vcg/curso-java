package exercicio5;

import java.util.HashMap;

public class E5 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> dicionario = new HashMap<>();
		dicionario.put(4, "a");
		dicionario.put(3, "e");
		dicionario.put(1, "i");
		dicionario.put(5, "s");
	
		String frase = "T35t3 d3 35t4g1o";	
		
		TrocarNumeros(frase, dicionario);
	}
		
	public static void TrocarNumeros(String pFrase, HashMap pDicionario) {
		for(Integer chave: pDicionario.keySet()) {
			pFrase = pFrase.replaceAll(chave.toString(), pDicionario.get(chave));
		}
		System.out.println(pFrase);
	}
	
}