package br.com.generation.ExLacosRepeticao;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade = 0, conta=-1, conta2=0;

		while(idade != -99) {
			System.out.println("Digite um numero: ");
			idade = in.nextInt();

			if(idade <= 21) {
				conta++;
			}else {
				if(idade>=50) {
					conta2++;
				}
			}
		}

		System.out.println("Existem "+conta+" pessoas com menos de 21 anos");
		System.out.println("Existem "+conta2+" pessoas com mais de 50 anos");

	}

}
