package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		
		String s  = new String("Texto");          // Objetos podem ter comportamentos.
		s.toUpperCase();
		
		// Wrappers (Env�lucros) => Vers�o objeto dos Primitivos. Permitem tratar primitivos como objetos
		int a = 123;                    // Tipos primitivos s� carregam em si um valor.
		System.out.println(a);
		
	}

}
