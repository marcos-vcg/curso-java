package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel {

	private final JLabel label;
	
	public Display() {
		setBackground(new Color(46, 49, 50));
		label = new JLabel("1234,56");									// Informa��o Textual
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));             // Font
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));        	// Layout alinhado a direita e posi��es
		
		add(label);
	}
}
