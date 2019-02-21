public class Conta {

	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo+=valor;
		
	}
	
	public boolean saca(double valor) {
		if (this.saldo>=valor) {
			this.saldo-=valor;
			System.out.println("Saque de "+valor+" efetuado"); 
			return true;
		}
		System.out.println("Saldo insuficiente");
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo>=valor) {
			this.saldo-=valor;
			destino.deposita(valor);
			System.out.println("Tranferencia de "+valor+" efetuada");
			return true;
		}
		System.out.println("Saldo insuficiente");
		return false;
	}
}



