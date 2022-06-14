package br.com.generation.VetoresEMatrizes;

import java.util.Scanner;

public class ArrayVetor03 {

	public static void main(String[] args) {
		
		try (Scanner entradaVetor = new Scanner(System.in)) {
			System.out.println("Entre com o tamanho do Vetor: ");
			int tamanhoVetor = entradaVetor.nextInt();
			
			int[] vetor = new int[tamanhoVetor]; //[0]...[4]
			
			System.out.println("Tamanho do Vetor: " + vetor.length);
			
			for(int i = 0; i < tamanhoVetor; i++) {
				System.out.println("Digite os Conteúdos do Vetor: ");
				vetor[i] = entradaVetor.nextInt();
			}
					
			for(int i = 0; i < tamanhoVetor; i++) {
				System.out.println("Posição: " + i + " Conteúdo: " + vetor[i]);
			}
		}
	}
}
