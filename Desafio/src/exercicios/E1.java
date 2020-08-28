package exercicios;

import java.io.InputStream;
import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira palavra:");
		String palavra1 = scan.nextLine();
		
		System.out.println("Informe a segunda palavra:");
		String palavra2 = scan.nextLine();
		
		if (palavra1.length() < palavra2.length())
			palavra1 = palavra2;
			
		System.out.println("A palavra " + palavra1 + " é maior e possui " + palavra1.length() + " caracteres.");
		
	}
}