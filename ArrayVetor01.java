package br.com.generation.VetoresEMatrizes;

public class ArrayVetor01 {

	public static void main(String[] args) {
		//Array --> arranjo
		
		//vetor --> um array de uma unica dimensão...
		//matriz -> é um array com n's dimensões.
		
		int[] arrayVetor = new int[10]; //[0]...[9]
		
		arrayVetor[5] = 653;
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("indice do vetor: " + i + " --> "  + arrayVetor[i]);
		}

	}

}
