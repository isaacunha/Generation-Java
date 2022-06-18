package br.com.generation.ExLacosRepeticao;

import java.util.Scanner;

public class ex5 {

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
