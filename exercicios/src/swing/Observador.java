package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");                   	// Janela
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 		// Fechar
		janela.setSize(600, 200);										// Dimensões
		janela.setLayout(new FlowLayout());								// Layout p/ receber elementos (botão)
		janela.setLocationRelativeTo(null);								// Posição Relativa da janela (tela)
		
			
		JButton botao = new JButton("Cliacar!");						// Botão
		janela.add(botao);												// Botão na Janela
		
		
		botao.addActionListener(new ActionListener() {                	// Ação do botão ao ser acionado
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento ocorreu!");	
			}
		});
		
		
		botao.addActionListener(e -> {									// Ação do botão ao ser acionado (lambda)
			System.out.println("Evento ocorreu!!!");
		});
		
		
		janela.setVisible(true);										// Janela Visível

	}

}
