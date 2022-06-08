package br.com.generation.Exercicios;



public class Ex1For {
	public static void main(String[] args) {
		
		int numero, conta=0;
		
		for(numero=1000;numero >= 1000 && numero <= 1999;numero++) {
			
			if(numero % 11 == 5) {
				conta++;
			}
			
		}
		System.out.println("Existem " + conta + " numeros que atendem a condição " );
		
		
		
		
		

	}
}
