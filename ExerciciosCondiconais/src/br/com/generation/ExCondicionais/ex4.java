package br.com.generation.ExCondicionais;
/* Isabella Alves 
 * Generation - turma 54
 * Junho/2022
 *
 * Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este
n�mero � par ou �mpar, e se � positivo ou negativo.
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
			System.out.println("Esse numero � Par e Positivo");
			
		} else {
			if(n % 2 != 0 && n >= 0) {
				System.out.println("Esse numero � Impar e Positivo");
			} else {
				if(n % 2 == 0 && n < 0) {
					System.out.println("Esse numero � Par e Negativo");
				}else {
					if(n % 2 != 0 && n < 0) {
						System.out.println("Esse numero � Impar e Negativo");
					}
				}
			}
			
		}

	}

}
