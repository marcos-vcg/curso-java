package exercicio3;

import java.util.Scanner;

public class E3 {
	//E.3 Crie uma função que recebe vários argumentos do tipo string e imprime todos juntos
	public static void main(String[] args) {
		String entrada = "";
		String saida = "";
		
		System.out.println("Informe as palavras. Digite 0 para encerrar:");
		Scanner leitor = new Scanner(System.in);
		entrada = leitor.next().trim();
		
		while(!"0".equals(entrada) ) {	
			saida += entrada;
			entrada = leitor.next();
		}
		System.out.println(saida);
	}
}