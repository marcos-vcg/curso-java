package exercicio6a10;

import java.util.Arrays;

public class Exercicio10 {
	// E.10 Ordene o array de forma decrescente por idade, em caso de empate o desempate é pelo id.
	public static void main(String[] args) {
		
		Cadastro[] pessoa = new Cadastro[4];
		pessoa[0] = new Cadastro(1, "jose", "da silva", 42);
		pessoa[1] = new Cadastro(2, "joão", "gonçalves", 21);
		pessoa[2] = new Cadastro(3, "pedro", "garcia", 28);
		pessoa[3] = new Cadastro(4, "matheus", "pinheiro", 21);
		
		Arrays.sort(pessoa);
		
		for(Cadastro cad: pessoa) {
			System.out.println("{Id: " + cad.getId() + ", Nome: " + cad.getNome() 
				+ ", Sobrenome: " + cad.getSobrenome() + ", Idade: " + cad.getIdade() + "}");
		}
	}
}
