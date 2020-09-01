package exercicio6;

public class Dados {

	public static void main(String[] args) {

		Cadastro[] pessoa = new Cadastro[4];
		
		pessoa[0] = new Cadastro(1, "jose", "da silva", 42);
		pessoa[1] = new Cadastro(4, "andre", "silva", 40);
		pessoa[2] = new Cadastro(2, "joao", "da silva", 20);
		pessoa[3] = new Cadastro(3, "luiz", "marcos", 30);
		
		System.out.println(pessoa);
	}

}
