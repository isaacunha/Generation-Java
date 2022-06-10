package br.com.generation.VetoresEMatrizes;

import java.util.Scanner;

public class Ex3Matriz {
	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		//Declaração da Matriz
		double[][] M1= new double[2][2];
		double[][] M2= new double[2][2];
		double[][] N1= new double[2][2];
		double[][] N2= new double[2][2];
		
		System.out.println("Entre com valores de M1");
		//adicionando valores na Matriz
		for(int l = 0; l < M1.length; l++) { 
			for(int c = 0; c < M1[l].length; c++) { 
				
				System.out.printf("Digite às valores na posição da Matriz: %dº " , (l+1), (c+1));
				M1[l][c] = entrada.nextDouble();
			}
			System.out.println();
		}
		
		System.out.println("Entre com valores de M2");
		//adicionando valores na Matriz
		for(int l = 0; l < M2.length; l++) { 
			for(int c = 0; c < M2[l].length; c++) { 
				
				System.out.printf("Digite às valores na posição da Matriz: %dº " , (l+1), (c+1));
				M2[l][c] = entrada.nextDouble();
			}
			System.out.println();
		}

		for(int l = 0; l < N1.length; l++) { 
			for(int c = 0; c < N1[l].length; c++) { 
				N1[l][c] = M1[l][c] + M2[l][c];
		        N2[l][c] = M1[l][c] - M2[l][c];
			}
			System.out.println();
		}
		
		System.out.println("A matriz N1 será: \n");
		for(int l = 0; l < N1.length; l++) { 
			for(int c = 0; c < N1[l].length; c++) { 
				System.out.print(N1[l][c]+ " | ");
	            }
			System.out.println();
		   }

		  
		System.out.println("A matriz N2 será: \n");
		for(int l = 0; l < N2.length; l++) { 
			for(int c = 0; c < N2[l].length; c++) { 
				System.out.print(N2[l][c]+ " | ");
	            }
			System.out.println();
		   }
		
		
		
		
		
	}

}
