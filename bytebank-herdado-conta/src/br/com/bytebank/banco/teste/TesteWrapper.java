package br.com.bytebank.banco.teste;

public class TesteWrapper {

	public static void main(String[] args){
        Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);
        
        String diaComoTexto = "29";
//        int dia = Integer.parseInt(diaComoTexto);
//        ou
        int dia = Integer.valueOf(diaComoTexto);
        
    }

}
