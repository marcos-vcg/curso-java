package exercicio6a10;

public class Exercicio08 {	
	// E.8 Imprima o objeto se existir alguém com menos 26 anos.
	public static void main(String[] args) {
		
		Cadastro[] pessoa = new Cadastro[4];
		pessoa[0] = new Cadastro(1, "jose", "da silva", 42);
		pessoa[1] = new Cadastro(2, "joão", "gonçalves", 21);
		pessoa[2] = new Cadastro(3, "pedro", "garcia", 28);
		pessoa[3] = new Cadastro(4, "matheus", "pinheiro", 21);
		
		for(Cadastro cad: pessoa) {
			if (cad.getIdade() < 26)
				System.out.println("{Id: " + cad.getId() + ", Nome: " + cad.getNome() 
					+ ", Sobrenome: " + cad.getSobrenome() + ", Idade: " + cad.getIdade() + "}");
		}
		
//		for(int i = 0; i < pessoa.length; i++) {
//		if (pessoa[i].getIdade() < 26)
//			System.out.println("{Id: " + pessoa[i].getId() + pessoa[i].getNome());
//		}
	
	}
	
}