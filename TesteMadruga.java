package br.com.seumadruga;

import java.util.Scanner;

public class TesteMadruga {
	
	public static void main (String[] args) {
		System.out.println("Informe a idade do seu cachorro: ");
		
		Scanner in = new Scanner(System.in);
		
		int idadeCachorro = in.nextInt();
		idadeCachorro = idadeCachorro * 5;
		
		System.out.println("O seu cachorro tem "+idadeCachorro+" anos.");
		
	}

}
