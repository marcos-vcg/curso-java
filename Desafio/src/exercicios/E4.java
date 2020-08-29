package exercicios;

public class E4 {

	public static void main(String[] args) {
		String frase = "teste 1 de 2 string 3";
		frase = frase.replace("1", "[removido]");
		frase = frase.replace("2", "[removido]");
		frase = frase.replace("3", "[removido]");
		System.out.println(frase);
		
	}

}
