package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog("Digite o primeiro número:");
		System.out.println(valor1 + valor2);                // Duas strings apenas se concatenam
		
		double numero1 = Double.parseDouble(valor1);        // String transformada para double;
		double numero2 = Double.parseDouble(valor2);        // String transformada para double;
		
		double soma = numero1 + numero2;                    // Agora dois double podem se somar;
		System.out.println("Soma é: " + soma);
		System.out.println("Média é: " + soma / 2);
				

	}

}
