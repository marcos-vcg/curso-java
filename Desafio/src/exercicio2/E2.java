package exercicio2;

import java.util.Scanner;

public class E2 {
	//E.2 Crie uma fun��o que receba uma string e imprima o valor ao contr�rio.
	public static void main(String[] args) {
		System.out.print("Informe a palavra: ");
		Scanner leitor = new Scanner(System.in);
		String entrada = leitor.next();
		String saida = "";
		
		for (int i = entrada.length() - 1; i >= 0; i--) {
			saida = saida + entrada.charAt(i);
		}
		
		System.out.println("A palavra invertida �: " + saida);
	}
	
}
