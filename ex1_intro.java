package br.com.generation.portugolJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1_intro {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
			
			Scanner leia = new Scanner(System.in);
			
			int dias, meses, anos, dias2, dias3, total;
			
			System.out.println("Digite os anos que voce tem: ");
			anos = leia.nextInt();
			
			System.out.println("Digite os meses que voce tem: ");
			meses = leia.nextInt();
			
			System.out.println("Digite os dias que voce tem: ");
			dias = leia.nextInt();
			
			dias2 = anos * 365;
			dias3 = meses * 30;
			total = dias + dias2 + dias3;
			
			
			System.out.println("O total de dias da idade dessa pessoa é: " +total);

			

	}

}
