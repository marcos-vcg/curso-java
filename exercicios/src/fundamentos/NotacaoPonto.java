package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		// Operador "." não existe em primitivos.
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Bom dia X"
				.replace("X", "Fernanda")
				.toUpperCase()
				.concat("!!!");
		System.out.println(x);		

	}

}
