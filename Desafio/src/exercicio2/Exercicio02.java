package exercicio2;

import javax.swing.JOptionPane;

public class Exercicio02 {
	//E.2 Crie uma função que receba uma string e imprima o valor ao contrário.
	public static void main(String[] args) {
		
		String PalavraEntrada = JOptionPane.showInputDialog(null, "Informe a Palavra:").trim();
		InverterPalavra(PalavraEntrada);	
	}
		
	public static void InverterPalavra(String pPalavraEntrada) {
		String PalavraSaida = "";
		for (int i = pPalavraEntrada.length() - 1; i >= 0; i--) {
			PalavraSaida += pPalavraEntrada.charAt(i);
		}
		System.out.println("A palavra invertida é: " + PalavraSaida);
	}	
}