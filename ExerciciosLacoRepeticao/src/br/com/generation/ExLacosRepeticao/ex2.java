package br.com.generation.ExLacosRepeticao;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, contaPar=0, contaImpar=0, i;
		
		//ele começa no 1, enquanto 1 for menor que 11, de um em um
		for(i=1 ;i<11;i++) {
			System.out.println("Qual o " + i + " numero");
			numero = leia.nextInt();
			
			if(numero %2 == 0) {
				contaPar++;
			}else {
				contaImpar++;		}
			
		}
		System.out.println("Tem " + contaPar + " numeros pares " );
		System.out.println("Tem " + contaImpar + " numeros impares " );
		
		

	}

}
