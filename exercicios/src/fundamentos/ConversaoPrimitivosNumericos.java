package fundamentos;

public class ConversaoPrimitivosNumericos {

	public static void main(String[] args) {
		
		// De um menor pra um maior não há perda de informação (implícita)
		// Já o contrário é necessário uma conversão explícita (CAST)
		double a = 1;                // Conversão implícita de um int para um double
		System.out.println(a);
		
		float b = (float) 1.123456789999;       // Conversão Explícita (CAST) do padrão decimal double para o float.
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.9999999999;
		int f = (int) e;                        // Explicita (CAST) => Trunca o número e ignora toda a parte decimal.
		System.out.println(f);
		
	}

}
