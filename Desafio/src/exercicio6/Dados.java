package exercicio6;

public class Dados {

	public static void main(String[] args) {

		Cadastro[] pessoa = new Cadastro[4];
		
		pessoa[0] = new Cadastro(1, "jose", "da silva", 42);
		pessoa[1] = new Cadastro(4, "jo�o", "gon�alves", 21);
		pessoa[2] = new Cadastro(2, "pedro", "garcia", 28);
		pessoa[3] = new Cadastro(3, "matheus", "pinheiro", 21);
		
		for (int i = 0; i<pessoa.length; i++) {			
			System.out.println(new StringBuilder().append("Ol�, ").append(PrimeiraMaiuscula(pessoa[i].getNome())) + " " + pessoa[i].getSobrenome());
			System.out.println("Ol�, " + PrimeiraMaiuscula(pessoa[i].getNome()) + " " + pessoa[i].getSobrenome());
		}
		
		
		
//		public static String[] Saudacao(Person[] pPersons) {
//			
//			String[] msgs = new String[pPersons.length];
//			for (Integer i = 0; i < pPersons.length; i++) {
//				pPersons[i].firstName = pPersons[i].firstName.substring(0, 1).toUpperCase() + 
//						pPersons[i].firstName.substring(1);
//				msgs[i] = "Ol� " + (pPersons[i].firstName) + " " + pPersons[i].lastName;
//			}
//			
//			return msgs;
//		}
		
	}
	
	public static String PrimeiraMaiuscula(String palavra) {
		return palavra = palavra.substring(0,1).toUpperCase().concat(palavra.substring(1));
	}
	
}
