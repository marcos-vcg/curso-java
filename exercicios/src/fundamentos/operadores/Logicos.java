package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("\nTabela Verdade AND:");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);              // Se a primeira for false nem executa o resto
//		System.out.println(false && false);             // Se a primeira for false nem executa o resto
		
		System.out.println("\nTabela Verdade OR:");
//		System.out.println(true || true);              // Se a primeira for verdadeira nem executa o resto
//		System.out.println(true || false);             // Se a primeira for verdadeira nem executa o resto
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela Verdade XOR:");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela Verdade NOT:");
		System.out.println(!true);
		System.out.println(!false);

	}

}
