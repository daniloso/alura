import javax.sql.rowset.spi.TransactionalWriter;

public class FluxoComTratamento {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("ArithmeticException: " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		
		throw new ArithmeticException("Deu erro");
//		System.out.println("Fim do metodo2");

	}

}
