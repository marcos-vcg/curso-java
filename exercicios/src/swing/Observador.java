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
		janela.setSize(600, 200);										// Dimens�es
		janela.setLayout(new FlowLayout());								// Layout p/ receber elementos (bot�o)
		janela.setLocationRelativeTo(null);								// Posi��o Relativa da janela (tela)
		
			
		JButton botao = new JButton("Cliacar!");						// Bot�o
		janela.add(botao);												// Bot�o na Janela
		
		
		botao.addActionListener(new ActionListener() {                	// A��o do bot�o ao ser acionado
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento ocorreu!");	
			}
		});
		
		
		botao.addActionListener(e -> {									// A��o do bot�o ao ser acionado (lambda)
			System.out.println("Evento ocorreu!!!");
		});
		
		
		janela.setVisible(true);										// Janela Vis�vel

	}

}
