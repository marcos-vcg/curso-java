package exercicio6a10;

public class Exercicio07 {
	// E.7 Imprima a soma das idades 
	public static void main(String[] args) {
		
		Cadastro[] pessoa = new Cadastro[4];
		
		pessoa[0] = new Cadastro(1, "jose", "da silva", 42);
		pessoa[1] = new Cadastro(2, "joão", "gonçalves", 21);
		pessoa[2] = new Cadastro(3, "pedro", "garcia", 28);
		pessoa[3] = new Cadastro(4, "matheus", "pinheiro", 21);
		
		int somaIdade = 0;
		for(Cadastro cad: pessoa) {
			somaIdade += cad.getIdade();
		}
		
		System.out.println("A soma das idades é: " + somaIdade + " anos!");
		
	}
	
}
