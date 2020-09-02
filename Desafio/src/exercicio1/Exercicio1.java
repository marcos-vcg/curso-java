package exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {
	//E.1 Crie uma função que recebe dois argumentos string e retorna o de maior comprimento.	
	public static void main(String[] args) {
		
		String palavra1 = JOptionPane.showInputDialog(null, "Palavra 1").trim();
		String palavra2 = JOptionPane.showInputDialog(null, "Palavra 2").trim();
		
		MaiorPalavra(palavra1, palavra2);		
	}
	
	public static void MaiorPalavra(String pPalavra1, String pPalavra2) {
		if (pPalavra1.length() > pPalavra2.length())
			System.out.println("A maior palavra é: " +  pPalavra1);
		else if (pPalavra1.length() < pPalavra2.length())
			System.out.println("A maior palavra é: " +  pPalavra2);
		else System.out.println("As palavras possuem o mesmo tamanho!");
	}
}