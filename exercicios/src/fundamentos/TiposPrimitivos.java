package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Tipos Num�ricos Inteiros
		byte anosDeEmpresa = 23;                     // Pode converter para os menores contanto que caiba.
		short numeroDeVoos = 542;
		int id = 56789;                              //Padr�o dos literais
		long pontosAcumulados = 3_134_845_223L;      //L => informa que � um long, pois extrapola o int
		
		// Tipos Num�ricos Reais
		float salario = 11_445.44F;                      // F => informa que quer o float fora do padr�o
		double vendasAcumuladas = 2_991_797_103.01;   // Padr�o dos Reais
		
		// Tipo Booleano
		boolean estaDeFerias = false;                 // S� permite true/false
		
		// Tipo Caractere
		char status = '\u0010';                        // S� permite um caractere. No caso da tabela unicode.
		
		// Usando as vari�veis
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}

}
