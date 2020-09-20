public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;

	public double getBonificacao() {
		return this.salario * 0.10;
	}
	public double setSalario(double salario) {
		return this.salario = salario;
	}
	
}