package br.com.generation.ExCondicionais;
/* Isabella Alves 
 * Generation - turma 54
 * Junho/2022
 *
 * Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/
import java.util.Locale;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
	Locale.setDefault(new Locale("en", "US"));
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero ");
		int n1 = leia.nextInt();
		System.out.println("digite o segundo numero ");
		int n2 = leia.nextInt();
		System.out.println("digite o terceiro numero ");
		int n3 = leia.nextInt();
		System.out.println("digite o quarto numero ");
		int n4 = leia.nextInt();
		
		double n12 = n1 * n1;
		double n22 = n2 * n2;
		double n32 = n3 * n3;
		double n42 = n4 * n4;
		
		if (n32 >= 1000) {
			System.out.println("O Valor do terceiro numero ao quadrado é " + n32);
			
		} else {
			System.out.println("O primeiro numero é "+ n1+ " e seu quadrado é "+ n12);
			System.out.println("O segundo numero é "+ n2+ " e seu quadrado é "+ n22);
			System.out.println("O terceiro numero é "+ n3+ " e seu quadrado é "+ n32);
			System.out.println("O quarto numero é "+ n4+ " e seu quadrado é "+ n42);
		}

	}

}
