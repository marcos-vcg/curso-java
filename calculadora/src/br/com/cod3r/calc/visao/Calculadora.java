package br.com.cod3r.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")									// Suprimido o aviso
public class Calculadora extends JFrame	{					// Herdar de JFrame recebe todos os atributos e comportamentos
	
	public Calculadora() {									// Construtor Criado
		
		organizarLayout();									// Chamada da Função
		
		setSize(232, 322); 									// Dimensões Largura x Altura
		setDefaultCloseOperation(EXIT_ON_CLOSE);  			// Sai da aplicação.  DISPOSE_ON_CLOSE tem mesmo efeito se tiver só uma janela
		setLocationRelativeTo(null);						// Abre Centralizado em Relação a Tela do PC
		setVisible(true);									// Torna visível a tela
		
	}
	
	private void organizarLayout() {						// Função criada
		setLayout(new BorderLayout());						// Escolher Layout como BorderLayout(tem outros)
		
		Display display = new Display();					// Instanciei o Display criado
		display.setPreferredSize(new Dimension(233, 60)); 	// Setar tamanho de preferencia (nova dimensão(233 x 60))
		add(display, BorderLayout.NORTH);					// add (display e um parâmetro de acordo com a escolha do layout)
		
		Teclado teclado = new Teclado();					// Instanciei o Teclado criado
		add(teclado, BorderLayout.CENTER);					// add (display e um parâmetro de acordo com a escolha do layout)
	}

	public static void main(String[] args) {				// Método Main
		new Calculadora();                    	 			// Chama o construtor e inicia a aplicação
	}
}
