package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
		// Wrappers => Versões orientadas a objeto de cada um dos tipos primitivos
		Byte b = 100;           // byte
		Short s = 1000;         // short
		Integer i = 10000;      // int       Integer.parseInt("10000") => Pega uma string e retorna um Integer
		Long l = 100000L;       // long
		Float f = 123.10F;      // float
		Double  d = 1234.5678;  // double
		Boolean bo;             // boolean
		Character c = '#';      // char
		
		
		System.out.println(b.byteValue());                   // Valor em Bytes
		System.out.println(s.toString());                    // Short passa a ser String
		System.out.println(i * 3);                           
		System.out.println(l / 3);                           // Pega i inteiro da divisão dos inteiros e ignora os decimais
		System.out.println(l / 3.0);                         // Mostra o valor em decimal já que um dos elemntos é flutuante.
		
		System.out.println(f);
		System.out.println(d);
		
		
		bo = Boolean.parseBoolean("true");                   // Converte String para Boolean
		System.out.println(bo);       
		System.out.println(bo.toString().toUpperCase());     // Boolean convertido para String e em maiúsculas.
		
		System.out.println(c + "...");                       // Concatena um Character com uma String
		
		
		
	}

}
