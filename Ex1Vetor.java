package br.com.generation.VetoresEMatrizes;

import java.util.Scanner;

public class Ex1Vetor {
	public static void main(String[] args) {
		Scanner entradaVetor = new Scanner(System.in);
		double[] vetor = new double[5];//[0]...[30]
				
				double notaMaior=0;
				int i;
				
				System.out.println("Digite as notas do aluno:  ");
				
				for(i = 0; i < 54; i++) {
					System.out.println("nota " + (i+1) + " :");
					vetor[i] = entradaVetor.nextInt();
					if(vetor[i] > notaMaior) {
						notaMaior = vetor[i];
					}
				}
						
				
					System.out.println("A maior nota é: " + notaMaior);
				

			}

}