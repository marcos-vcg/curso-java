package exercicio6;

import exercicio6.Dados;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i<pessoa.length; i++) {
		System.out.println(new StingBuilder().append("Olá, ").append(PrimeiraMaiuscula(lista.nome)));
		}
		
		System.out.println("Olá, " + cadastro.get(nome).chartAt(0).toUpperCase());
		
	}

	
	
	public static String[] Saudacao(Person[] pPersons) {
		
		String[] msgs = new String[pPersons.length];
		for (Integer i = 0; i < pPersons.length; i++) {
			pPersons[i].firstName = pPersons[i].firstName.substring(0, 1).toUpperCase() + 
					pPersons[i].firstName.substring(1);
			msgs[i] = "Olá " + (pPersons[i].firstName) + " " + pPersons[i].lastName;
		}
		
		return msgs;
	}

}
