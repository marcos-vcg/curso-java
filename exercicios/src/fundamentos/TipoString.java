package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Ol� pessoal".charAt(2));
		
		String s = "Bom dia";
		s = s.toUpperCase();                          // N�o consegue modificar a string original, apenas substitu�-la
		s = "Boa tarde";                    
		System.out.println(s.concat("!!!"));      
		System.out.println(s + "!!!");                			 // Mesmo efeito do concat
		System.out.println(s.startsWith("Boa"));     			 // Come�a com a palavra Boa?
		System.out.println(s.startsWith("boa"));     			 // Case Sensitive => n�o come�a com "boa"
		System.out.println(s.toLowerCase().startsWith("boa"));   // Agora ignora as ma�sculas e min�sculas
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));               // Informa se s�o iguais
		System.out.println(s.equalsIgnoreCase("boa tarde"));     // Ignora mai�sculas ou min�sculas
		System.out.println();
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario;
		System.out.println(maisUmaFrase);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.\n", nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario); // Formata a string
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));        // Se contem ...
		System.out.println("Frase qualquer".indexOf("qual"));         // Indice que come�a ...
		System.out.println("Frase qualquer".substring(6));            // Corta a string a partir de ...
		System.out.println("Frase qualquer".substring(6, 10));        // Corta a string a partir de ... at� antes de ...
	}

}
