package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];                    // Criando array
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(notasAlunoA.toString());              // Hashcode
		System.out.println(Arrays.toString(notasAlunoA));        // Mostra os elementos do array
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {            // Atributo length => tamanho fixo
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};              // Criando array literal
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
		
		System.out.println(notasAlunoB[(notasAlunoB.length - 1)]);
	}

}
