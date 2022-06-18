package br.com.generation.ExCondicionais;
/* Isabella Alves 
 * Generation - turma 54
 * Junho/2022
 *
 * Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
*/
import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero ");
		int n = leia.nextInt();
		
		if (n % 2 == 0 && n >= 0) {
			System.out.println("Esse numero é Par e Positivo");
			
		} else {
			if(n % 2 != 0 && n >= 0) {
				System.out.println("Esse numero é Impar e Positivo");
			} else {
				if(n % 2 == 0 && n < 0) {
					System.out.println("Esse numero é Par e Negativo");
				}else {
					if(n % 2 != 0 && n < 0) {
						System.out.println("Esse numero é Impar e Negativo");
					}
				}
			}
			
		}

	}

}
