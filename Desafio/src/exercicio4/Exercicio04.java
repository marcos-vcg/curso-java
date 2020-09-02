package exercicio4;

public class Exercicio04 {
	//E.4 Dado a seguinte string 'teste 1 de 2 string 3', substitua todas as ocorrências de números pelo valor '[removido]'.
	public static void main(String[] args) {
		
		String texto = "teste 1 de 2 string 3";
		RemoverNumeros(texto);
	}

	public static void RemoverNumeros(String pTexto) {
		pTexto = pTexto.replaceAll("[0-9]", "[removido]");
		System.out.println(pTexto);
	}
}