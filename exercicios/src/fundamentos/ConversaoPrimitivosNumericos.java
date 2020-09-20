package fundamentos;

public class ConversaoPrimitivosNumericos {

	public static void main(String[] args) {
		
		// De um menor pra um maior n�o h� perda de informa��o (impl�cita)
		// J� o contr�rio � necess�rio uma convers�o expl�cita (CAST)
		double a = 1;                // Convers�o impl�cita de um int para um double
		System.out.println(a);
		
		float b = (float) 1.123456789999;       // Convers�o Expl�cita (CAST) do padr�o decimal double para o float.
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.9999999999;
		int f = (int) e;                        // Explicita (CAST) => Trunca o n�mero e ignora toda a parte decimal.
		System.out.println(f);
		
	}

}
