package exercicio6;

import java.util.Map;

import exercicio7.StingBuilder;

public class E6 {

	public static void main(String[] args) {
		
		
		String [] lista = new String[4];
		lista[0] = new Dados;
		
			lista = [
			         {id: 1, nome: "josé", sobrenome: "da silva", idade: 42},
			         {id: 2, nome: 'joão', sobrenome: 'gonçalves',  idade: 21},
			         {id:3, nome: 'pedro', sobrenome: 'garcia', idade: 28},
			         {id: 4, nome: 'matheus', sobrenome: 'pinheiro',  idade: 21}
			         ]

		System.out.println("Olá, " + cadastro.get(nome).chartAt(0).toUpperCase());
			
		for (int i = 0; i<4; i++) {
		System.out.println(new StingBuilder().append("Olá, ").append(PrimeiraMaiuscula(lista.nome)));
		}
	}
	
	
	public static String PrimeiraMaiuscula(String palavra) {
		return palavra = palavra.substring(0,1).toUpperCase().concat(palavra.substring(1));
	}

}
