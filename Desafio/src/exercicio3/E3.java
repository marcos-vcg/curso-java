package exercicio3;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		
		String entrada = "";
		String saida = "";
		
		System.out.println("Informe as palavras. Digite 0 para encerrar:");
		Scanner leitor = new Scanner(System.in);
		entrada = leitor.next();
		
		while(!"0".equals(entrada) ) {	
			
			saida = saida + entrada;
			entrada = leitor.next();
		}
		
		System.out.println(saida);

	}



}
