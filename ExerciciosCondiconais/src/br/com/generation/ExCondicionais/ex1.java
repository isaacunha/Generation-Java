package br.com.generation.ExCondicionais;
/* Isabella Alves 
 * Generation - turma 54
 * Junho/2022
 * Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e
verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor
da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do
ZERO.
 * 
*/
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
			System.out.println("N�o h� multa");
		}
	
		

	}

}
