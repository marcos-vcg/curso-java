package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.println(" dia!");
		System.out.print("Quebra de linha! \n");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);       // Print formatado 
		System.out.printf("Salário: %.2f%n", 1234.5678);                             // Não tem a quebra de linha automatica
		System.out.printf("Nome: %s%n", "João");
		
		
		Scanner entrada = new Scanner(System.in);                      // Recebe informações digitadas pelo teclado
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();                              // Recebe a proxima linha String
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();                                 // Recebe o próximo inteiro
			
		System.out.printf("\nNome: %s %nIdade: %d", nome, idade);
		
		entrada.close();                                               // Fecha o Scanner para economizar recursos que não estão sendo usados

	}

}
