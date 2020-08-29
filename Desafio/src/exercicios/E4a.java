package exercicios;

public class E4a {

	public static void main(String[] args) {
		
		String texto = "teste 1 de 2 string 3";
		texto = texto.replaceAll("[0-9]", "[removido]");
		
		System.out.println(texto);
		
	}

}