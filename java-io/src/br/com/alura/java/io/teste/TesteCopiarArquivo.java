package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
//		FileInputStream fis = new FileInputStream("lorem.txt"); //para ler do arquivo
		InputStream fis = System.in;
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
//		FileOutputStream fos = new FileOutputStream("lorem2.txt");
		OutputStream fos = System.out;
		Writer osr = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osr);
		
		
		String linha = br.readLine();
		
//		while (linha != null) { //la�o para s� ler do arquivo
//			bw.write(linha);
//			bw.newLine();
//			linha = br.readLine();
//		}
		
		//la�o para ler do console
//		while (linha != null && !linha.isEmpty() ) { 
//			bw.write(linha);
//			bw.newLine();
//			linha = br.readLine();
//		}
		
		//la�o para imprimir no console
				while (linha != null && !linha.isEmpty() ) { 
					bw.write(linha);
					bw.flush(); //m�todo que imprime direto no console o que � digitado
					linha = br.readLine();
				}
		
		br.close(); 
		bw.close();
	}

}
