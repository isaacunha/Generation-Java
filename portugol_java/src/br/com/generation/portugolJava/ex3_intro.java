package br.com.generation.portugolJava;
/* Isabella Alves
 * Generation - Turma 54
 * 06/2022
 * 
 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */

import java.util.Locale;
import java.util.Scanner;

public class ex3_intro {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
			
			Scanner leia = new Scanner(System.in);
			
			int segundos, minutos, horas;
			
			
			System.out.println("Quantos segundos o evento durará? ");
			segundos = leia.nextInt();
			
			horas = segundos / 3600;
			int restoDeHoras = segundos % 3600;
			minutos = restoDeHoras / 60;
			int restoDeMinutos = restoDeHoras % 60;
			int segundos1 = restoDeMinutos;
			
			
			System.out.println("Essa evento tem: "+ horas + " horas e  " + minutos + " minutos e " + segundos1 + " segundos");

			

	}

}
