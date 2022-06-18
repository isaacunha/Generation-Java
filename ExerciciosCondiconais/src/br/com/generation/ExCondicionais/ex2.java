package br.com.generation.ExCondicionais;
/* Isabella Alves 
 * Generation - turma 54
 * Junho/2022
 *
 * Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
*/
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
