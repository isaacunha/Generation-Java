package br.com.generation.ExCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
	Locale.setDefault(new Locale("en", "US"));
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero ");
		int n1 = leia.nextInt();
		System.out.println("digite o segundo numero ");
		int n2 = leia.nextInt();
		System.out.println("digite o terceiro numero ");
		int n3 = leia.nextInt();
		System.out.println("digite o quarto numero ");
		int n4 = leia.nextInt();
		
		double n12 = n1 * n1;
		double n22 = n2 * n2;
		double n32 = n3 * n3;
		double n42 = n4 * n4;
		
		if (n32 >= 1000) {
			System.out.println("O Valor do terceiro numero ao quadrado � " + n32);
			
		} else {
			System.out.println("O primeiro numero � "+ n1+ " e seu quadrado � "+ n12);
			System.out.println("O segundo numero � "+ n2+ " e seu quadrado � "+ n22);
			System.out.println("O terceiro numero � "+ n3+ " e seu quadrado � "+ n32);
			System.out.println("O quarto numero � "+ n4+ " e seu quadrado � "+ n42);
		}

	}

}
