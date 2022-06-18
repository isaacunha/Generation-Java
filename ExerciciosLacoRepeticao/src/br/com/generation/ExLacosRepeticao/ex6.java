package br.com.generation.ExLacosRepeticao;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero;
		double media, soma=0, conta=0;
		
		do{
			System.out.println("Digite um numero: ");
			numero = in.nextInt();
			
			if(numero %3 ==0) {
			soma = soma + numero;
			conta++;
			}
			
		}while(numero != 0 );
			System.out.println("A soma é: "+ soma);
			media = soma/(conta-1);
			System.out.println("A media é: "+ media);

	}

}
