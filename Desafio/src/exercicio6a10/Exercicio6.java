package exercicio6a10;

public class Exercicio6 {

	public static void main(String[] args) {

		Cadastro[] pessoa = new Cadastro[4];
		
		pessoa[0] = new Cadastro(1, "jose", "da silva", 42);
		pessoa[1] = new Cadastro(4, "joão", "gonçalves", 21);
		pessoa[2] = new Cadastro(2, "pedro", "garcia", 28);
		pessoa[3] = new Cadastro(3, "matheus", "pinheiro", 21);
		
		for (int i = 0; i<pessoa.length; i++) {			
			System.out.println("Olá, " + PrimeiraMaiuscula(pessoa[i].getNome()) + " " + pessoa[i].getSobrenome());
		}
		
	}
	
	public static String PrimeiraMaiuscula(String palavra) {
		return palavra = palavra.substring(0,1).toUpperCase().concat(palavra.substring(1));
	}
	
}
