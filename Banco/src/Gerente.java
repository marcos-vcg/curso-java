public class Gerente extends Funcionario {
	int senha;
	int numeroDeFuncionariosGerenciados;

	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}
	// ...
}