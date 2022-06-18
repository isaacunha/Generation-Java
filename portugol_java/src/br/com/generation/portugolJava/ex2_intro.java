package br.com.generation.portugolJava;

/* Isabella Alves
 * Generation - Turma 54
 * 06/2022
 * 
 * Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 */
import java.util.Locale;
import java.util.Scanner;

public class ex2 {

		public static void main(String[] args) {
			Locale.setDefault(new Locale("en", "US"));
				
				Scanner leia = new Scanner(System.in);
				
				int dias, meses, anos, dias2;
				
				
				System.out.println("Digite os dias que voce tem: ");
				dias = leia.nextInt();
				
				anos = dias / 365;
				int restoDeAnos = dias % 365;
				meses = restoDeAnos / 30;
				int restoDeMeses = restoDeAnos % 30;
				int dias1 = restoDeMeses;
				
				
				System.out.println("Essa Pessoa tem: "+ anos + " anos e  " + meses + " meses e " + dias1 + " dias");

				

		}
}
