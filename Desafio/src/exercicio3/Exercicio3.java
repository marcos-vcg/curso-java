package exercicio3;

import javax.swing.JOptionPane;

public class Exercicio3 {
	//E.3 Crie uma fun��o que recebe v�rios argumentos do tipo string e imprime todos juntos
	public static void main(String[] args) {	
		JuntarPalavra();
	}
	
	public static void JuntarPalavra() {	
		String PalavraSaida = "";
		String PalavraEntrada = "";
		
		while(!"0".equals(PalavraEntrada) ) {	
			PalavraSaida += PalavraEntrada;
			PalavraEntrada = JOptionPane.showInputDialog(null, "Digite a Palavra, 0 para terminar:").trim();		
		}
		System.out.println(PalavraSaida);
	}
}