package fundamentos;

import java.util.Date;

public class Import {

	public static void main(String[] args) {
		// java.lang está a disposição automaticamente em todas as classes
		java.lang.String b = "Boa tarde!";          // Nesse caso não precisa 
		java.lang.System.out.println(b);
		
		String s = "Bom dia";                       // Pode escrever direto a classe String do pacote java.lang
		System.out.println(s);
		
		java.util.Date d = new java.util.Date();    // Nesse caso pode fazer a referência completa toda vez
		Date dd = new Date();                       // Ou simplesmente importar de uma vez a classe e usar apenas o seu nome
		System.out.println(d);
		System.out.println(dd);

	}
}