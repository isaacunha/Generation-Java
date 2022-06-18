package br.com.generation.ExCondicionais;
/* Isabella Alves 
 * Generation - turma 54
 * Junho/2022
 *
 * Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos

*/
import java.util.Locale;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
Locale.setDefault(new Locale("en", "US"));
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("qual a idadede do nadador? ");
		int idade = leia.nextInt();
		
		if (idade >= 5 && idade <= 7) {
			System.out.println("Categoria Infantil A");
		} else {
			if(idade >= 8 && idade <= 11) {
				System.out.println("Categoria Infantil B");
			} else {
				if(idade == 12 || idade == 13) {
					System.out.println("Categoria Juvenil A");
				}else {
					if(idade >= 14 && idade <= 17) {
						System.out.println("Categoria Juvenil B");
					}else { 
						if(idade >= 18) {
						System.out.println("Categoria Adulto");	
					}else {
						System.out.println("Não temos categoria para essa idade");	
					}
				}
				}
			}
			
		}

	}

}
