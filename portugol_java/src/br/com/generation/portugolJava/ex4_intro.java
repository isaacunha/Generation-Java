package br.com.generation.portugolJava;
/* Isabella Alves
 * Generation - Turma 54
 * 06/2022
 * 
 * Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule uma expressão.
 */
import java.util.Locale;
import java.util.Scanner;

public class ex4_intro {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		double r, s, d;
		
		System.out.println("Digite o primeiro valor: ");
		a = leia.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = leia.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		c = leia.nextInt();
		
		r = ((a + b) * (a + b));
		System.out.println(r+ "\n");
		
		s = ((b + c) * (b + c));
		System.out.println(s + "\n");
		
		d = (r + s) / 2;
		
		
		System.out.println("O resultado é " + d);


	}

}
