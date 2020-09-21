package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		// Decimais
		var x = 34.56;
		double  y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		
		// Inteiros
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);               // Só mostra a parte inteira
		System.out.println(a / (double) b);      // CAST
		System.out.println(a / (float) b);       // CAST
		
		System.out.println(a % b);
		System.out.println(8 % 3);

		System.out.println(x + y - a * b);       // Primeiro multiplica, soma depois subtrai
	}

}
