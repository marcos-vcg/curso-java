package exercicio6a10;

public class Cadastro implements Comparable<Cadastro> {

	private int id;
	private String nome;
	private String sobrenome;
	private int idade;
	
	public Cadastro(int id, String nome, String sobrenome, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Cadastro pCadastro) {
		return ( (pCadastro.getIdade() - this.idade) + (pCadastro.getId() - this.id) );
	}
	
}