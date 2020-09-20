package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Tipos Numéricos Inteiros
		byte anosDeEmpresa = 23;                     // Pode converter para os menores contanto que caiba.
		short numeroDeVoos = 542;
		int id = 56789;                              //Padrão dos literais
		long pontosAcumulados = 3_134_845_223L;      //L => informa que é um long, pois extrapola o int
		
		// Tipos Numéricos Reais
		float salario = 11_445.44F;                      // F => informa que quer o float fora do padrão
		double vendasAcumuladas = 2_991_797_103.01;   // Padrão dos Reais
		
		// Tipo Booleano
		boolean estaDeFerias = false;                 // Só permite true/false
		
		// Tipo Caractere
		char status = '\u0010';                        // Só permite um caractere. No caso da tabela unicode.
		
		// Usando as variáveis
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}

}
