
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(123, 456);
		Conta contaDoPaulo = new Conta(123, 321);
		
		conta.setTitular(new Cliente()); 
		//ou
		Cliente paulo = new Cliente();

		conta.getTitular().setNome("Danilo");
		conta.deposita(100);
		
		System.out.println(conta.getTitular().getNome()+ " tem "+conta.getSaldo()+" de saldo!");
		System.out.println("Total de contas é: "+Conta.getTotal());
	}

}
