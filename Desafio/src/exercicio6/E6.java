package exercicio6;

import exercicio7.StingBuilder;

public class E6 {

	public static void main(String[] args) {
		
		
		String[] lista = new String[4];
		for (int i = 0; i<4; i++) {
			lista = [
			         {id: 1, nome: 'jos�', sobrenome: 'da silva', idade: 42},
			         {id: 2, nome: 'jo�o', sobrenome: 'gon�alves',  idade: 21},
			         {id:3, nome: 'pedro', sobrenome: 'garcia', idade: 28},
			         {id: 4, nome: 'matheus', sobrenome: 'pinheiro',  idade: 21}
			         ]
		 };

		System.out.println(new StingBuilder ().append("Ol�, ").append(lista.nome));
	}

}
