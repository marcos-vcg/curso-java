package arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		
		for(double nota: notas) {                    // Para cada nota tipo double de notas fa�a 
			System.out.print(nota + " ");
		}

	}
}