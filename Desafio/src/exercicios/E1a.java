package exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class E1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String palavra1 = JOptionPane.showInputDialog(null, "Palavra 1").trim();
		String palavra2 = JOptionPane.showInputDialog(null, "Palavra 2").trim();
		
		if (palavra1.length() > palavra2.length())
			System.out.println("A maior palavra é: " +  palavra1);
		else if (palavra1.length() < palavra2.length())
			System.out.println("A maior palavra é: " +  palavra2);
		else System.out.println("As palavras possuem o mesmo tamanho!");
			
	}
}