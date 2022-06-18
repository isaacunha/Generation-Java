package br.com.generation.portugolJava;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class ex6_intro {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner leia = new Scanner(System.in);
		
		int x1,x2,y1,y2;
		double d, r, s;
		
		System.out.println("Digite o valor x1: ");
		x1 = leia.nextInt();
		
		System.out.println("Digite o valor x2 ");
		x2 = leia.nextInt();
		
		System.out.println("Digite o valor y1 ");
		y1 = leia.nextInt();
		
		System.out.println("Digite o valor y2 ");
		y2 = leia.nextInt();
		
		r = ((x2 + x1) * (x2 + x1));
		System.out.println(r+ "\n");
		
		s = ((y2 + y1) * (y2 + y1));
		System.out.println(s + "\n");
		
		d = Math.sqrt(r+s);
		
		System.out.println("A distancia entre os dois pontos é " + d);
		

	}

	private static double sqrt(double d) {
		return 0;
	}

}
