
public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		return super.saca(valor+0.2);
	}

	@Override
	public void deposita(double valor) {
		super.setSaldo(super.getSaldo()+valor);
		
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo()*0.01;
	}
}
