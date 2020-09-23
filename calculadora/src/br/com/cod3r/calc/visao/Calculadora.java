package br.com.cod3r.calc.visao;

import javax.swing.JFrame;

@SuppressWarnings("serial")							// Suprimido o aviso
public class Calculadora extends JFrame	{			// Herdar de JFrame recebe todos os atributos e comportamentos
	
	public Calculadora() {							// Construtor Criado
		
		setSize(232, 322); 							// Dimensões Largura x Altura
		setDefaultCloseOperation(EXIT_ON_CLOSE);  	// Sai da aplicação.  DISPOSE_ON_CLOSE tem mesmo efeito se tiver só uma janela
		setLocationRelativeTo(null);				// Abre Centralizado em Relação a Tela do PC
		setVisible(true);							// Torna visível a tela
		
	}
	
	public static void main(String[] args) {		// Método Main
		new Calculadora();                    	 	// Chama o construtor e inicia a aplicação
	}
}
