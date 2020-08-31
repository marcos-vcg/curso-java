package exercicios;

public class E5c {

	public static void main(String[] args) {
		
		String frase = "T35t3 d3 35t4g1o";
		var[] dicionario = {"4": "a", "3": "e", "1": "i", "5": "s"};
		
		for(int i = 0; i < dicionario.length; i++) {
			frase = frase.replace(dicionario[i].key(), dicionario[i].value());
		}

		System.out.println(frase);

	}

}
