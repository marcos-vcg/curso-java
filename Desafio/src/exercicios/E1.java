package exercicios;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a primeira palavra:");
		String palavra1 = ler.nextLine();
		
		System.out.println("Informe a segunda palavra:");
		String palavra2 = ler.nextLine();
		
		if (palavra1.length() < palavra2.length())
			palavra1 = palavra2;
			
		System.out.println("A maior palavra é: " +  palavra1);
		
	}
}