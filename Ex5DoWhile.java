package br.com.generation.Exercicios;

import java.util.Scanner;

public class Ex5DoWhile {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numero, soma=0;
		
		do{
			System.out.println("Digite um numero: ");
			numero = in.nextInt();
			soma = soma + numero;
			
		}while(numero != 0 );
		
			System.out.println("A soma é: "+ soma);
	}	
}
