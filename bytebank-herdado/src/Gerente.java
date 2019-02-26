
public class Gerente extends Funcionario {

	private int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return super.getBonificacao() + super.getSalario();
	}
}
