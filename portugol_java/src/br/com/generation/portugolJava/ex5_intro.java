package br.com.generation.portugolJava;

import java.util.Locale;
import java.util.Scanner;

public class ex5_intro {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextInt();
		
		System.out.println("Digite a segunda nota ");
		nota2 = leia.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextInt();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4)) / 10;
			
		System.out.println("A media ponderada do aluno é " + media);		
	}
}