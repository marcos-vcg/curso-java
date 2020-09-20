package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		
		String s  = new String("Texto");          // Objetos podem ter comportamentos.
		s.toUpperCase();
		
		// Wrappers (Envólucros) => Versão objeto dos Primitivos. Permitem tratar primitivos como objetos
		int a = 123;                    // Tipos primitivos só carregam em si um valor.
		System.out.println(a);
		
	}

}
