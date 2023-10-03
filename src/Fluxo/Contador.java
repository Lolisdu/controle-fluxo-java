package Fluxo;

/*
 * by Débora Oliveira
 */

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		try {
			System.out.println("Digite o primeiro Parametrô");
			int parametro1 = terminal.nextInt();
			
			System.out.println("Digite o segundo Parametrô");
			int parametro2 = terminal.nextInt();
			
			contar(parametro1, parametro2);
			
		}catch ( IllegalStateException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			
		}catch (ParametrosInvalidosException e ) {
			
			System.out.println(e.getMessage());
		}
	}
	
	private static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
		if (parametro1 < parametro2) {
			for (int i =0; i< (parametro1 - parametro2); i++) {
				System.out.println("Imprimindo o número" + (i + 1));
			}
			
			return;
		}
		  throw new ParametrosInvalidosException();
	}
}
