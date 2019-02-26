
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	private int senha;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		if (this.autenticador.autentica(senha)) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
