package exercicios;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		System.out.println("Informe a palavra:");
		Scanner leitor = new Scanner(System.in);
		String entrada = leitor.next();
		String saida = "";
		
		for (int i = entrada.length() - 1; i >= 0; i--) {
			saida = saida + entrada.charAt(i);
		}
		
		System.out.println("A palavra invertida �:");
		System.out.println(saida);
	}
	
}