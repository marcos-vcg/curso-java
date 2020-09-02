package exercicio4;

public class E4b {

	public static void main(String[] args) {
		
		String texto = "teste 1 de 2 string 3";
		
		for (int i = 0; i < texto.length(); i++) {
			if (Character.isDigit(texto.charAt(i)))
				texto[i] = "[REMOVIDO]";
		}

	}

}
