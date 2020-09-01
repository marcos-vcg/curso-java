package exercicio6a10;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Cadastro[] pessoa = new Cadastro[4];
		pessoa[0] = new Cadastro(1, "jose", "da silva", 42);
		pessoa[1] = new Cadastro(2, "joão", "gonçalves", 21);
		pessoa[2] = new Cadastro(3, "pedro", "garcia", 28);
		pessoa[3] = new Cadastro(4, "matheus", "pinheiro", 21);

//		for(int i = 0; i < pessoa.length; i++) {
//			if (pessoa[i].getIdade() < 26)
//				System.out.println("{Id: " + pessoa[i].getId() + pessoa[i].getNome());
//		
//		}
		
		for(Cadastro cad: pessoa) {
			if (cad.getIdade() < 26)
				System.out.println("{Id: " + cad.getId() + ", Nome: " + cad.getNome() 
					+ ", Sobrenome: " + cad.getSobrenome() + ", Idade: " + cad.getIdade() + "}");
		}
		
	}
	
}
	
//	public static String MenorIdade(String palavra) {
//		return palavra = palavra.substring(0,1).toUpperCase().concat(palavra.substring(1));
//	}
	

// E.8 Imprima o objeto se existir alguém com menos 26 anos.