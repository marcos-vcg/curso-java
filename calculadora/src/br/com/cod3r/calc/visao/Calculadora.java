package br.com.cod3r.calc.visao;

import javax.swing.JFrame;

@SuppressWarnings("serial")							// Suprimido o aviso
public class Calculadora extends JFrame	{			// Herdar de JFrame recebe todos os atributos e comportamentos
	
	public Calculadora() {							// Construtor Criado
		
		setSize(232, 322); 							// Dimens�es Largura x Altura
		setDefaultCloseOperation(EXIT_ON_CLOSE);  	// Sai da aplica��o.  DISPOSE_ON_CLOSE tem mesmo efeito se tiver s� uma janela
		setLocationRelativeTo(null);				// Abre Centralizado em Rela��o a Tela do PC
		setVisible(true);							// Torna vis�vel a tela
		
	}
	
	public static void main(String[] args) {		// M�todo Main
		new Calculadora();                    	 	// Chama o construtor e inicia a aplica��o
	}
}
