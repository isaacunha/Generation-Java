package br.com.generation.ExCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner leia = new Scanner(System.in);
		
		int c, n, f;
		
		System.out.println("Qual o codigo do operario? ");
		c = leia.nextInt();
		
		System.out.println("Quantas horas foram trabalhadas? ");
		n = leia.nextInt();
		
		if (n > 50) {
			int HoraExtra = n- 50;
			int ValorHoraExtra = HoraExtra*20;
			int excesso = 500 + (20*HoraExtra);
			System.out.println("O salario sera de "+ excesso + " reais");
			System.out.println("Sendo "+ ValorHoraExtra + " reais de hora extra");
			
		} else {
			int salario = n * 10;
			System.out.println("O salario sera de "+ salario+ " reais");
		}

	}

}
