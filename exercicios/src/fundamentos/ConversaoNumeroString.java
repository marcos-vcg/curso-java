package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 100;
		System.out.println(num1.toString().length());               // Cria Wrapper e usa seus métodos
		
		int num2 = 1000;
		System.out.println(Integer.toString(num2).length());        // Chama o método do Wrapper e passa o primitivo
		
		System.out.println(("" + num1).length());                   // Concatenar torna String
		System.out.println(("" + num2).length());

	}

}
