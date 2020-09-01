package exercicio6a10;

public class Exercicio9 {
	//	E.9 Imprima todos os elementos em que a idade é menor que 30 anos.	
	public static void main(String[] args) {

		Cadastro[] pessoa = new Cadastro[4];
		pessoa[0] = new Cadastro(1, "jose", "da silva", 42);
		pessoa[1] = new Cadastro(2, "joão", "gonçalves", 21);
		pessoa[2] = new Cadastro(3, "pedro", "garcia", 28);
		pessoa[3] = new Cadastro(4, "matheus", "pinheiro", 21);
		
		for(Cadastro cad: pessoa) {
			if (cad.getIdade() < 30)
				System.out.println("{Id: " + cad.getId() + ", Nome: " + cad.getNome() 
					+ ", Sobrenome: " + cad.getSobrenome() + ", Idade: " + cad.getIdade() + "}");
		}
		
//		for(int i = 0; i < pessoa.length; i++) {
//		if (pessoa[i].getIdade() < 30)
//			System.out.println("{Id: " + pessoa[i].getId() + pessoa[i].getNome());
//		}

	}

}
