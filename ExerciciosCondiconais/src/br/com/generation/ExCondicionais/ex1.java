package br.com.generation.ExCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner leia = new Scanner(System.in);
		
		int p, e, m;
		
		
		System.out.println("Quantos kilos de tomate? ");
		p = leia.nextInt();
		
		if (p > 50) {
			e = p-50;
			m = e * 4;	
			System.out.println("A multa sera de "+m+ " reais");
			
		} else {
			System.out.println("Não há multa");
		}
	
		

	}

}
