package exercicios;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a primeira palavra:");
		String palavra1 = ler.nextLine().trim();
		
		System.out.println("Informe a segunda palavra:");
		String palavra2 = ler.nextLine().trim();
		
		if (palavra1.length() > palavra2.length())
			System.out.println("A maior palavra é: " +  palavra1);
		else if (palavra1.length() < palavra2.length())
			System.out.println("A maior palavra é: " +  palavra2);
		else System.out.println("As palavras possuem o mesmo tamanho!");
			
	}
}